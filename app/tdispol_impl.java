package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdispol_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel11"+"_"+"DISARTTIPD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A352DisArtTip = (short)(GXutil.lval( httpContext.GetPar( "DisArtTip"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A352DisArtTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A352DisArtTip), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx11asadisarttipd1IZ34( A396EmprCod, A352DisArtTip) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel12"+"_"+"FINDCOL") == 0 )
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
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx12asafindcol1IZ34( A396EmprCod, A252CliCod, A335DisArtCod, A362DisColNom, A363DisColNum, A390DisTipCol) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel15"+"_"+"DISUNI") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A392DisUniMed = httpContext.GetPar( "DisUniMed") ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx15asadisuni1IZ34( A396EmprCod, A361DisCod, A392DisUniMed) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel16"+"_"+"DISPIEKGM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A365DisDes = httpContext.GetPar( "DisDes") ;
         httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx16asadispiekgm1IZ34( A396EmprCod, A361DisCod, A365DisDes) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel17"+"_"+"DISPIEMTR") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A365DisDes = httpContext.GetPar( "DisDes") ;
         httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx17asadispiemtr1IZ34( A396EmprCod, A361DisCod, A365DisDes) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel18"+"_"+"DISPIENOR") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A365DisDes = httpContext.GetPar( "DisDes") ;
         httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx18asadispienor1IZ34( A396EmprCod, A361DisCod, A365DisDes) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
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
         gxload_21( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1122MaqCodDis = httpContext.GetPar( "MaqCodDis") ;
         n1122MaqCodDis = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1122MaqCodDis", A1122MaqCodDis);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A396EmprCod, A1122MaqCodDis) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_23") == 0 )
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
         gxload_23( A396EmprCod, A390DisTipCol) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10887Cod_Idtx = httpContext.GetPar( "Cod_Idtx") ;
         n10887Cod_Idtx = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10887Cod_Idtx", A10887Cod_Idtx);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A396EmprCod, A10887Cod_Idtx) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_25") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_25( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_26") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_26( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_28") == 0 )
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
         gxload_28( A396EmprCod, A758ProCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ENTRADA PEDIDO LAVANDERIA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
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
      nRC_GXsfl_610 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_610"))) ;
      nGXsfl_610_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_610_idx"))) ;
      sGXsfl_610_idx = httpContext.GetPar( "sGXsfl_610_idx") ;
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

   public tdispol_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdispol_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdispol_impl.class ));
   }

   public tdispol_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkPriCod = UIFactory.getCheckbox(this);
      chkDisArtEnc = UIFactory.getCheckbox(this);
      chkDisArtCor = UIFactory.getCheckbox(this);
      cmbDisEst = new HTMLChoice();
      chkDisDes = UIFactory.getCheckbox(this);
      chkDisFac = UIFactory.getCheckbox(this);
      chkDisAcc = UIFactory.getCheckbox(this);
      chkDisPla = UIFactory.getCheckbox(this);
      chkDisAcaBak = UIFactory.getCheckbox(this);
      chkDisEstTip = UIFactory.getCheckbox(this);
      chkDisTin = UIFactory.getCheckbox(this);
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
      A338DisArtEnc = ((GXutil.strcmp(GXutil.rtrim( A338DisArtEnc), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A338DisArtEnc", A338DisArtEnc);
      A336DisArtCor = ((GXutil.strcmp(GXutil.rtrim( A336DisArtCor), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A336DisArtCor", A336DisArtCor);
      if ( cmbDisEst.getItemCount() > 0 )
      {
         A367DisEst = (byte)(GXutil.lval( cmbDisEst.getValidValue(GXutil.trim( GXutil.str( A367DisEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A367DisEst", GXutil.str( A367DisEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbDisEst.setValue( GXutil.trim( GXutil.str( A367DisEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbDisEst.getInternalname(), "Values", cmbDisEst.ToJavascriptSource(), true);
      }
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      A3306DisFac = ((GXutil.strcmp(GXutil.rtrim( A3306DisFac), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A3306DisFac", A3306DisFac);
      A5252DisAcc = ((GXutil.strcmp(GXutil.rtrim( A5252DisAcc), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A5252DisAcc", A5252DisAcc);
      A2926DisPla = ((GXutil.strcmp(GXutil.rtrim( A2926DisPla), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A2926DisPla", A2926DisPla);
      A4477DisAcaBak = ((GXutil.strcmp(GXutil.rtrim( A4477DisAcaBak), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4477DisAcaBak", A4477DisAcaBak);
      A5032DisEstTip = ((GXutil.strcmp(GXutil.rtrim( A5032DisEstTip), "S")==0) ? "S" : "*") ;
      httpContext.ajax_rsp_assign_attri("", false, "A5032DisEstTip", A5032DisEstTip);
      A4014DisTin = ((GXutil.strcmp(GXutil.rtrim( A4014DisTin), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4014DisTin", A4014DisTin);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISPOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISPOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISPOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISPOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDISPOL.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Prioridad", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPriCod.getInternalname(), A757PriCod, "", "", 1, chkPriCod.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(25, this, '1', '0',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,25);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Disposicion Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCliNum_Internalname, GXutil.rtrim( A360DisCliNum), GXutil.rtrim( localUtil.format( A360DisCliNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCliNum_Jsonclick, 0, "", "", "", "", "", 1, edtDisCliNum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Fecha Disposicion Cliente", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDisFecCli_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisFecCli_Internalname, localUtil.format(A370DisFecCli, "99/99/99"), localUtil.format( A370DisFecCli, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFecCli_Jsonclick, 0, "", "", "", "", "", 1, edtDisFecCli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDisFecCli_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFecCli_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDISPOL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Articulo Disposicion", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtCod_Internalname, GXutil.rtrim( A335DisArtCod), GXutil.rtrim( localUtil.format( A335DisArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Fecha Disposicion", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDisFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisFec_Internalname, localUtil.format(A369DisFec, "99/99/99"), localUtil.format( A369DisFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFec_Jsonclick, 0, "", "", "", "", "", 1, edtDisFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDisFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDISPOL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Fecha Entrega", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDisFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisFecEnt_Internalname, localUtil.format(A371DisFecEnt, "99/99/99"), localUtil.format( A371DisFecEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisFecEnt_Jsonclick, 0, "", "", "", "", "", 1, edtDisFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDisFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDISPOL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Descripcion Articulo", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtDsc_Internalname, GXutil.rtrim( A337DisArtDsc), GXutil.rtrim( localUtil.format( A337DisArtDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtDsc_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Material", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtMat_Internalname, GXutil.rtrim( A340DisArtMat), GXutil.rtrim( localUtil.format( A340DisArtMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtMat_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Largo", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtLar_Internalname, GXutil.rtrim( A339DisArtLar), GXutil.rtrim( localUtil.format( A339DisArtLar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtLar_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtLar_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Suavizante", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtSua_Internalname, GXutil.rtrim( A351DisArtSua), GXutil.rtrim( localUtil.format( A351DisArtSua, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtSua_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtSua_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Acabado Quimico", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtAca_Internalname, GXutil.rtrim( A333DisArtAca), GXutil.rtrim( localUtil.format( A333DisArtAca, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtAca_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtAca_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Plegado", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPle_Internalname, GXutil.rtrim( A343DisArtPle), GXutil.rtrim( localUtil.format( A343DisArtPle, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPle_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtPle_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Tipo Articulo", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTip_Internalname, GXutil.ltrim( localUtil.ntoc( A352DisArtTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A352DisArtTip), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A352DisArtTip), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTip_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtTip_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Descripcion Tipo Articulo", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTipD_Internalname, GXutil.rtrim( A12115DisArtTipD), GXutil.rtrim( localUtil.format( A12115DisArtTipD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTipD_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtTipD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Encolar Orillos", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisArtEnc.getInternalname(), A338DisArtEnc, "", "", 1, chkDisArtEnc.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(116, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,116);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Cortar Orillos", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisArtCor.getInternalname(), A336DisArtCor, "", "", 1, chkDisArtCor.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(121, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,121);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Operacion Especial", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtOpe_Internalname, GXutil.rtrim( A341DisArtOpe), GXutil.rtrim( localUtil.format( A341DisArtOpe, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtOpe_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtOpe_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Trama1", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTr1_Internalname, GXutil.rtrim( A353DisArtTr1), GXutil.rtrim( localUtil.format( A353DisArtTr1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTr1_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtTr1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Porcentaje Trama1", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPt1_Internalname, GXutil.ltrim( localUtil.ntoc( A344DisArtPt1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPt1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A344DisArtPt1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A344DisArtPt1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPt1_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtPt1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Trama2", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTr2_Internalname, GXutil.rtrim( A354DisArtTr2), GXutil.rtrim( localUtil.format( A354DisArtTr2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTr2_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtTr2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Porcentaje Trama2", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPt2_Internalname, GXutil.ltrim( localUtil.ntoc( A345DisArtPt2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPt2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A345DisArtPt2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A345DisArtPt2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPt2_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtPt2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Trama3", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtTr3_Internalname, GXutil.rtrim( A355DisArtTr3), GXutil.rtrim( localUtil.format( A355DisArtTr3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtTr3_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtTr3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Porcentaje Trama3", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPt3_Internalname, GXutil.ltrim( localUtil.ntoc( A346DisArtPt3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPt3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A346DisArtPt3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A346DisArtPt3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPt3_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtPt3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Rendimiento", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtRdt_Internalname, GXutil.ltrim( localUtil.ntoc( A350DisArtRdt, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtRdt_Enabled!=0) ? localUtil.format( A350DisArtRdt, "ZZ9.99") : localUtil.format( A350DisArtRdt, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtRdt_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtRdt_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Urgencia", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtUrg_Internalname, GXutil.ltrim( localUtil.ntoc( A359DisArtUrg, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtUrg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A359DisArtUrg), "9") : localUtil.format( DecimalUtil.doubleToDec(A359DisArtUrg), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtUrg_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtUrg_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Urdido1", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtUr1_Internalname, GXutil.rtrim( A356DisArtUr1), GXutil.rtrim( localUtil.format( A356DisArtUr1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtUr1_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtUr1_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Porcentaje Urdido1", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPu1_Internalname, GXutil.ltrim( localUtil.ntoc( A347DisArtPu1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPu1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A347DisArtPu1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A347DisArtPu1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPu1_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtPu1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Urdido2", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtUr2_Internalname, GXutil.rtrim( A357DisArtUr2), GXutil.rtrim( localUtil.format( A357DisArtUr2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtUr2_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtUr2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Porcentaje Urdido 2", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPu2_Internalname, GXutil.ltrim( localUtil.ntoc( A348DisArtPu2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPu2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A348DisArtPu2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A348DisArtPu2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPu2_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtPu2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Urdido3", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtUr3_Internalname, GXutil.rtrim( A358DisArtUr3), GXutil.rtrim( localUtil.format( A358DisArtUr3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtUr3_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtUr3_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Porcentaje Urdido3", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPu3_Internalname, GXutil.ltrim( localUtil.ntoc( A349DisArtPu3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPu3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A349DisArtPu3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A349DisArtPu3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPu3_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtPu3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Gramaje Crudo", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtPes_Internalname, GXutil.ltrim( localUtil.ntoc( A342DisArtPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtPes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A342DisArtPes), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A342DisArtPes), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtPes_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtPes_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Ancho Acabado", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A334DisArtAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A334DisArtAnh), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A334DisArtAnh), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtAnh_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtAnh_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Ancho crudo Máximo", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtAn1_Internalname, GXutil.ltrim( localUtil.ntoc( A1231DisArtAn1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtAn1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1231DisArtAn1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1231DisArtAn1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtAn1_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtAn1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Ancho Acabado Mínimo", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtAcb_Internalname, GXutil.ltrim( localUtil.ntoc( A1232DisArtAcb, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtAcb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1232DisArtAcb), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1232DisArtAcb), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtAcb_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtAcb_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Ancho Acabado Máximo", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtAc2_Internalname, GXutil.ltrim( localUtil.ntoc( A1233DisArtAc2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisArtAc2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1233DisArtAc2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1233DisArtAc2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtAc2_Jsonclick, 0, "", "", "", "", "", 1, edtDisArtAc2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "Total piezas dispuestas", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPiePie_Internalname, GXutil.ltrim( localUtil.ntoc( A387DisPiePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPiePie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A387DisPiePie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A387DisPiePie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPiePie_Jsonclick, 0, "", "", "", "", "", 1, edtDisPiePie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "Metros Dispuestos / Dispos.", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPieMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPieMtr_Enabled!=0) ? localUtil.format( A385DisPieMtr, "ZZZZZ9.99") : localUtil.format( A385DisPieMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPieMtr_Jsonclick, 0, "", "", "", "", "", 1, edtDisPieMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "Kilos Dispuestos Dispos.", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPieKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A381DisPieKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPieKgm_Enabled!=0) ? localUtil.format( A381DisPieKgm, "ZZZZZ9.99") : localUtil.format( A381DisPieKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPieKgm_Jsonclick, 0, "", "", "", "", "", 1, edtDisPieKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "Estado Disposicion", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbDisEst, cmbDisEst.getInternalname(), GXutil.trim( GXutil.str( A367DisEst, 1, 0)), 1, cmbDisEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbDisEst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,241);\"", "", true, (byte)(0), "HLP_TDISPOL.htm");
      cmbDisEst.setValue( GXutil.trim( GXutil.str( A367DisEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbDisEst.getInternalname(), "Values", cmbDisEst.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "Precio Kgm.", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A388DisPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPreKgm_Enabled!=0) ? localUtil.format( A388DisPreKgm, "ZZZZZZ9.99") : localUtil.format( A388DisPreKgm, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPreKgm_Jsonclick, 0, "", "", "", "", "", 1, edtDisPreKgm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, httpContext.getMessage( "Precio Metro", ""), "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A389DisPreMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPreMtr_Enabled!=0) ? localUtil.format( A389DisPreMtr, "ZZZZZZ9.99") : localUtil.format( A389DisPreMtr, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,251);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPreMtr_Jsonclick, 0, "", "", "", "", "", 1, edtDisPreMtr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, httpContext.getMessage( "Piezas Lanzadas", ""), "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPieLan_Internalname, GXutil.ltrim( localUtil.ntoc( A383DisPieLan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPieLan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A383DisPieLan), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A383DisPieLan), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,256);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPieLan_Jsonclick, 0, "", "", "", "", "", 1, edtDisPieLan_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, httpContext.getMessage( "Kgm Lanzados", ""), "", "", lblTextblock49_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisKgmLan_Internalname, GXutil.ltrim( localUtil.ntoc( A372DisKgmLan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisKgmLan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A372DisKgmLan), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A372DisKgmLan), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,261);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisKgmLan_Jsonclick, 0, "", "", "", "", "", 1, edtDisKgmLan_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock50_Internalname, httpContext.getMessage( "Metros Lanzados", ""), "", "", lblTextblock50_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisMtrLan_Internalname, GXutil.ltrim( localUtil.ntoc( A373DisMtrLan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisMtrLan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A373DisMtrLan), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A373DisMtrLan), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,266);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisMtrLan_Jsonclick, 0, "", "", "", "", "", 1, edtDisMtrLan_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock51_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock51_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 271,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisColNom_Internalname, GXutil.rtrim( A362DisColNom), GXutil.rtrim( localUtil.format( A362DisColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,271);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisColNom_Jsonclick, 0, "", "", "", "", "", 1, edtDisColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock52_Internalname, httpContext.getMessage( "Numero Color", ""), "", "", lblTextblock52_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 276,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A363DisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,276);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisColNum_Jsonclick, 0, "", "", "", "", "", 1, edtDisColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock53_Internalname, httpContext.getMessage( "Nombre Color Cliente", ""), "", "", lblTextblock53_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 281,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisNomCli_Internalname, GXutil.rtrim( A1195DisNomCli), GXutil.rtrim( localUtil.format( A1195DisNomCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,281);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNomCli_Jsonclick, 0, "", "", "", "", "", 1, edtDisNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock54_Internalname, httpContext.getMessage( "Numero Color Cliente", ""), "", "", lblTextblock54_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 286,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1196DisNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1196DisNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1196DisNumCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,286);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumCli_Jsonclick, 0, "", "", "", "", "", 1, edtDisNumCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock55_Internalname, httpContext.getMessage( "Encogimiento: Comprimido", ""), "", "", lblTextblock55_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 291,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisEncCom_Internalname, GXutil.ltrim( localUtil.ntoc( A1197DisEncCom, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisEncCom_Enabled!=0) ? localUtil.format( A1197DisEncCom, "ZZ9.99") : localUtil.format( A1197DisEncCom, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,291);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisEncCom_Jsonclick, 0, "", "", "", "", "", 1, edtDisEncCom_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock56_Internalname, httpContext.getMessage( "Encogimiento: Ancho", ""), "", "", lblTextblock56_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 296,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisEncAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A1198DisEncAnh, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisEncAnh_Enabled!=0) ? localUtil.format( A1198DisEncAnh, "ZZ9.99") : localUtil.format( A1198DisEncAnh, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,296);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisEncAnh_Jsonclick, 0, "", "", "", "", "", 1, edtDisEncAnh_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock57_Internalname, httpContext.getMessage( "Tipo Colorante", ""), "", "", lblTextblock57_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 301,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A390DisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,301);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisTipCol_Jsonclick, 0, "", "", "", "", "", 1, edtDisTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock58_Internalname, httpContext.getMessage( "Descripcion TColorante", ""), "", "", lblTextblock58_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisTipCD_Internalname, GXutil.rtrim( A12116DisTipCD), GXutil.rtrim( localUtil.format( A12116DisTipCD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisTipCD_Jsonclick, 0, "", "", "", "", "", 1, edtDisTipCD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock59_Internalname, httpContext.getMessage( "Desglose", ""), "", "", lblTextblock59_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 311,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisDes.getInternalname(), A365DisDes, "", "", 1, chkDisDes.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(311, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,311);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock60_Internalname, httpContext.getMessage( "Numero Piezas", ""), "", "", lblTextblock60_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 316,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumPie_Internalname, GXutil.ltrim( localUtil.ntoc( A374DisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,316);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumPie_Jsonclick, 0, "", "", "", "", "", 1, edtDisNumPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock61_Internalname, httpContext.getMessage( "Unidades", ""), "", "", lblTextblock61_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 321,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumUni_Internalname, GXutil.ltrim( localUtil.ntoc( A375DisNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumUni_Enabled!=0) ? localUtil.format( A375DisNumUni, "ZZZZZ9.99") : localUtil.format( A375DisNumUni, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,321);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumUni_Jsonclick, 0, "", "", "", "", "", 1, edtDisNumUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock62_Internalname, httpContext.getMessage( "Unidades Medida", ""), "", "", lblTextblock62_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 326,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisUniMed_Internalname, GXutil.rtrim( A392DisUniMed), GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,326);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisUniMed_Jsonclick, 0, "", "", "", "", "", 1, edtDisUniMed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock63_Internalname, httpContext.getMessage( "EmprCodDis", ""), "", "", lblTextblock63_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCodDis_Internalname, GXutil.rtrim( A399EmprCodDis), GXutil.rtrim( localUtil.format( A399EmprCodDis, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCodDis_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCodDis_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock64_Internalname, httpContext.getMessage( "CliCodDis", ""), "", "", lblTextblock64_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCodDis_Internalname, GXutil.ltrim( localUtil.ntoc( A253CliCodDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCodDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A253CliCodDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A253CliCodDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCodDis_Jsonclick, 0, "", "", "", "", "", 1, edtCliCodDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock65_Internalname, httpContext.getMessage( "Busca Color", ""), "", "", lblTextblock65_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFindCol_Internalname, GXutil.rtrim( A475FindCol), GXutil.rtrim( localUtil.format( A475FindCol, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindCol_Jsonclick, 0, "", "", "", "", "", 1, edtFindCol_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock66_Internalname, httpContext.getMessage( "Piezas Disp. no desglose", ""), "", "", lblTextblock66_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPie_Internalname, GXutil.ltrim( localUtil.ntoc( A379DisPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A379DisPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A379DisPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPie_Jsonclick, 0, "", "", "", "", "", 1, edtDisPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock67_Internalname, httpContext.getMessage( "Unidades Disp. No desglose", ""), "", "", lblTextblock67_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisUni_Internalname, GXutil.ltrim( localUtil.ntoc( A391DisUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisUni_Enabled!=0) ? localUtil.format( A391DisUni, "ZZZZZ9.99") : localUtil.format( A391DisUni, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisUni_Jsonclick, 0, "", "", "", "", "", 1, edtDisUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock68_Internalname, httpContext.getMessage( "Gramaje Crudo", ""), "", "", lblTextblock68_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 356,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisGraCru_Internalname, GXutil.ltrim( localUtil.ntoc( A1225DisGraCru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisGraCru_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1225DisGraCru), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1225DisGraCru), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,356);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisGraCru_Jsonclick, 0, "", "", "", "", "", 1, edtDisGraCru_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock69_Internalname, httpContext.getMessage( "Total piezas dispos. no desgl.", ""), "", "", lblTextblock69_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPieNor_Internalname, GXutil.ltrim( localUtil.ntoc( A386DisPieNor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPieNor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A386DisPieNor), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A386DisPieNor), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPieNor_Jsonclick, 0, "", "", "", "", "", 1, edtDisPieNor_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock70_Internalname, httpContext.getMessage( "Localizacion", ""), "", "", lblTextblock70_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 366,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisLoc_Internalname, GXutil.rtrim( A1430DisLoc), GXutil.rtrim( localUtil.format( A1430DisLoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,366);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisLoc_Jsonclick, 0, "", "", "", "", "", 1, edtDisLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock71_Internalname, httpContext.getMessage( "Numero de Partida", ""), "", "", lblTextblock71_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 371,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPart_Internalname, GXutil.ltrim( localUtil.ntoc( A1502DisPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPart_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1502DisPart), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1502DisPart), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,371);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPart_Jsonclick, 0, "", "", "", "", "", 1, edtDisPart_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock72_Internalname, httpContext.getMessage( "Gramaje Acabado", ""), "", "", lblTextblock72_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 376,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisGraAca_Internalname, GXutil.ltrim( localUtil.ntoc( A1906DisGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisGraAca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1906DisGraAca), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1906DisGraAca), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,376);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisGraAca_Jsonclick, 0, "", "", "", "", "", 1, edtDisGraAca_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock73_Internalname, httpContext.getMessage( "Rendimiento en Neto", ""), "", "", lblTextblock73_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 381,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisRdoN_Internalname, GXutil.ltrim( localUtil.ntoc( A1907DisRdoN, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisRdoN_Enabled!=0) ? localUtil.format( A1907DisRdoN, "ZZ9.99") : localUtil.format( A1907DisRdoN, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,381);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisRdoN_Jsonclick, 0, "", "", "", "", "", 1, edtDisRdoN_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock74_Internalname, httpContext.getMessage( "Rendimiento en Acabado", ""), "", "", lblTextblock74_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 386,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisRdoA_Internalname, GXutil.ltrim( localUtil.ntoc( A1908DisRdoA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisRdoA_Enabled!=0) ? localUtil.format( A1908DisRdoA, "ZZ9.99") : localUtil.format( A1908DisRdoA, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,386);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisRdoA_Jsonclick, 0, "", "", "", "", "", 1, edtDisRdoA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock75_Internalname, httpContext.getMessage( "Tipo Disposicion; C,M,L,etc", ""), "", "", lblTextblock75_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 391,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisTipDis_Internalname, GXutil.rtrim( A2009DisTipDis), GXutil.rtrim( localUtil.format( A2009DisTipDis, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,391);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisTipDis_Jsonclick, 0, "", "", "", "", "", 1, edtDisTipDis_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock76_Internalname, httpContext.getMessage( "Numero de Lote/Barcada", ""), "", "", lblTextblock76_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 396,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumLot_Internalname, GXutil.ltrim( localUtil.ntoc( A2831DisNumLot, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumLot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2831DisNumLot), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2831DisNumLot), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,396);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumLot_Jsonclick, 0, "", "", "", "", "", 1, edtDisNumLot_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock77_Internalname, httpContext.getMessage( "Kilos del Lote/Barcada", ""), "", "", lblTextblock77_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 401,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisKgsLot_Internalname, GXutil.ltrim( localUtil.ntoc( A2832DisKgsLot, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisKgsLot_Enabled!=0) ? localUtil.format( A2832DisKgsLot, "ZZZZZ9.99") : localUtil.format( A2832DisKgsLot, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,401);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisKgsLot_Jsonclick, 0, "", "", "", "", "", 1, edtDisKgsLot_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock78_Internalname, httpContext.getMessage( "Metros del Lote/Barcada", ""), "", "", lblTextblock78_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 406,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisMtrLot_Internalname, GXutil.ltrim( localUtil.ntoc( A2833DisMtrLot, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisMtrLot_Enabled!=0) ? localUtil.format( A2833DisMtrLot, "ZZZZZ9.99") : localUtil.format( A2833DisMtrLot, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,406);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisMtrLot_Jsonclick, 0, "", "", "", "", "", 1, edtDisMtrLot_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock79_Internalname, httpContext.getMessage( "Plegado", ""), "", "", lblTextblock79_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 411,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPle2_Internalname, GXutil.rtrim( A2835DisPle2), GXutil.rtrim( localUtil.format( A2835DisPle2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,411);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPle2_Jsonclick, 0, "", "", "", "", "", 1, edtDisPle2_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock80_Internalname, httpContext.getMessage( "Numero de Cortes", ""), "", "", lblTextblock80_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 416,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumCor_Internalname, GXutil.ltrim( localUtil.ntoc( A3127DisNumCor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumCor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3127DisNumCor), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3127DisNumCor), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,416);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumCor_Jsonclick, 0, "", "", "", "", "", 1, edtDisNumCor_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock81_Internalname, httpContext.getMessage( "Ancho Salida 1", ""), "", "", lblTextblock81_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 421,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisAncSal1_Internalname, GXutil.ltrim( localUtil.ntoc( A3128DisAncSal1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisAncSal1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3128DisAncSal1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3128DisAncSal1), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,421);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisAncSal1_Jsonclick, 0, "", "", "", "", "", 1, edtDisAncSal1_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock82_Internalname, httpContext.getMessage( "Ancho Salida 2", ""), "", "", lblTextblock82_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 426,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisAncSal2_Internalname, GXutil.ltrim( localUtil.ntoc( A3129DisAncSal2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisAncSal2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3129DisAncSal2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3129DisAncSal2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,426);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisAncSal2_Jsonclick, 0, "", "", "", "", "", 1, edtDisAncSal2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock83_Internalname, httpContext.getMessage( "Ancho Salida 3", ""), "", "", lblTextblock83_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 431,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisAncSal3_Internalname, GXutil.ltrim( localUtil.ntoc( A3130DisAncSal3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisAncSal3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3130DisAncSal3), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3130DisAncSal3), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,431);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisAncSal3_Jsonclick, 0, "", "", "", "", "", 1, edtDisAncSal3_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock84_Internalname, httpContext.getMessage( "Gramaje Acabado 2", ""), "", "", lblTextblock84_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 436,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisGraAca2_Internalname, GXutil.ltrim( localUtil.ntoc( A3131DisGraAca2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisGraAca2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3131DisGraAca2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3131DisGraAca2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,436);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisGraAca2_Jsonclick, 0, "", "", "", "", "", 1, edtDisGraAca2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock85_Internalname, httpContext.getMessage( "Gramaje Crudo 2", ""), "", "", lblTextblock85_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 441,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisGraCru2_Internalname, GXutil.ltrim( localUtil.ntoc( A3132DisGraCru2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisGraCru2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3132DisGraCru2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3132DisGraCru2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,441);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisGraCru2_Jsonclick, 0, "", "", "", "", "", 1, edtDisGraCru2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock86_Internalname, httpContext.getMessage( "Hdr a Facturar", ""), "", "", lblTextblock86_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 446,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisFac.getInternalname(), A3306DisFac, "", "", 1, chkDisFac.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(446, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,446);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock87_Internalname, httpContext.getMessage( "Manufacturador 1 (Bobinador)", ""), "", "", lblTextblock87_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 451,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisManCod1_Internalname, GXutil.ltrim( localUtil.ntoc( A3307DisManCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisManCod1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3307DisManCod1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3307DisManCod1), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,451);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisManCod1_Jsonclick, 0, "", "", "", "", "", 1, edtDisManCod1_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock88_Internalname, httpContext.getMessage( "Manufacturador 2 (Re-Bobinado)", ""), "", "", lblTextblock88_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 456,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisManCod2_Internalname, GXutil.ltrim( localUtil.ntoc( A3308DisManCod2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisManCod2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3308DisManCod2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3308DisManCod2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,456);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisManCod2_Jsonclick, 0, "", "", "", "", "", 1, edtDisManCod2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock89_Internalname, httpContext.getMessage( "Tono Color", ""), "", "", lblTextblock89_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 461,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumTon_Internalname, GXutil.rtrim( A3309DisNumTon), GXutil.rtrim( localUtil.format( A3309DisNumTon, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,461);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumTon_Jsonclick, 0, "", "", "", "", "", 1, edtDisNumTon_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock90_Internalname, httpContext.getMessage( "Código de Modelo", ""), "", "", lblTextblock90_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 466,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisMdlCod_Internalname, GXutil.rtrim( A4614DisMdlCod), GXutil.rtrim( localUtil.format( A4614DisMdlCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,466);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisMdlCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisMdlCod_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock91_Internalname, httpContext.getMessage( "Tamaño Piezas (Talla)", ""), "", "", lblTextblock91_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 471,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisTam_Internalname, GXutil.rtrim( A4615DisTam), GXutil.rtrim( localUtil.format( A4615DisTam, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,471);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisTam_Jsonclick, 0, "", "", "", "", "", 1, edtDisTam_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock92_Internalname, httpContext.getMessage( "Piezas Solicitadas", ""), "", "", lblTextblock92_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 476,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisNPzas_Internalname, GXutil.ltrim( localUtil.ntoc( A4293DisNPzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNPzas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4293DisNPzas), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4293DisNPzas), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,476);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNPzas_Jsonclick, 0, "", "", "", "", "", 1, edtDisNPzas_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock93_Internalname, httpContext.getMessage( "Hora de Entrega Prevista", ""), "", "", lblTextblock93_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 481,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDisHorEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisHorEnt_Internalname, localUtil.ttoc( A4616DisHorEnt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4616DisHorEnt, "99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,481);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisHorEnt_Jsonclick, 0, "", "", "", "", "", 1, edtDisHorEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDisHorEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisHorEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDISPOL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock94_Internalname, httpContext.getMessage( "Piezas en Produccion", ""), "", "", lblTextblock94_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 486,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisNPzasL_Internalname, GXutil.ltrim( localUtil.ntoc( A4294DisNPzasL, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNPzasL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4294DisNPzasL), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4294DisNPzasL), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,486);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNPzasL_Jsonclick, 0, "", "", "", "", "", 1, edtDisNPzasL_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock95_Internalname, httpContext.getMessage( "DisHorReg", ""), "", "", lblTextblock95_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 491,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDisHorReg_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisHorReg_Internalname, localUtil.ttoc( A4617DisHorReg, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4617DisHorReg, "99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,491);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisHorReg_Jsonclick, 0, "", "", "", "", "", 1, edtDisHorReg_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDisHorReg_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDisHorReg_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDISPOL.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock96_Internalname, httpContext.getMessage( "Accesorios Metalicos", ""), "", "", lblTextblock96_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 496,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisAcc.getInternalname(), A5252DisAcc, "", "", 1, chkDisAcc.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(496, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,496);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock97_Internalname, httpContext.getMessage( "Antipiling?", ""), "", "", lblTextblock97_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 501,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisAntp_Internalname, GXutil.rtrim( A5366DisAntp), GXutil.rtrim( localUtil.format( A5366DisAntp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,501);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisAntp_Jsonclick, 0, "", "", "", "", "", 1, edtDisAntp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock98_Internalname, httpContext.getMessage( "Tipo Antipiling:F,R,N", ""), "", "", lblTextblock98_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 506,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisAntpT_Internalname, GXutil.rtrim( A5405DisAntpT), GXutil.rtrim( localUtil.format( A5405DisAntpT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,506);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisAntpT_Jsonclick, 0, "", "", "", "", "", 1, edtDisAntpT_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock99_Internalname, httpContext.getMessage( "Tipo, valor S o N", ""), "", "", lblTextblock99_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 511,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisPla.getInternalname(), A2926DisPla, "", "", 1, chkDisPla.getEnabled(), "S", httpContext.getMessage( "¿Muestras?", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(511, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,511);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock100_Internalname, httpContext.getMessage( "Domicilio Envio", ""), "", "", lblTextblock100_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 516,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A4013DisEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisEnv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4013DisEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(A4013DisEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,516);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisEnv_Jsonclick, 0, "", "", "", "", "", 1, edtDisEnv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock101_Internalname, httpContext.getMessage( "Entregar a...", ""), "", "", lblTextblock101_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 521,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisEnt_Internalname, GXutil.rtrim( A366DisEnt), GXutil.rtrim( localUtil.format( A366DisEnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,521);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisEnt_Jsonclick, 0, "", "", "", "", "", 1, edtDisEnt_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock102_Internalname, httpContext.getMessage( "Backing acabado", ""), "", "", lblTextblock102_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 526,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisAcaBak.getInternalname(), A4477DisAcaBak, "", "", 1, chkDisAcaBak.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(526, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,526);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock103_Internalname, httpContext.getMessage( "Observaciones en Ancho Final", ""), "", "", lblTextblock103_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 531,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisObsAnc_Internalname, GXutil.rtrim( A5350DisObsAnc), GXutil.rtrim( localUtil.format( A5350DisObsAnc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,531);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisObsAnc_Jsonclick, 0, "", "", "", "", "", 1, edtDisObsAnc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock104_Internalname, httpContext.getMessage( "Observaciones en Grm2", ""), "", "", lblTextblock104_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 536,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisObsGrm_Internalname, GXutil.rtrim( A5349DisObsGrm), GXutil.rtrim( localUtil.format( A5349DisObsGrm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,536);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisObsGrm_Jsonclick, 0, "", "", "", "", "", 1, edtDisObsGrm_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock105_Internalname, httpContext.getMessage( "Disposicion Cliente Nueva", ""), "", "", lblTextblock105_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 541,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisEncCli_Internalname, GXutil.rtrim( A4813DisEncCli), GXutil.rtrim( localUtil.format( A4813DisEncCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,541);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisEncCli_Jsonclick, 0, "", "", "", "", "", 1, edtDisEncCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock106_Internalname, httpContext.getMessage( "Codigo Disenho", ""), "", "", lblTextblock106_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 546,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisDishCod_Internalname, GXutil.rtrim( A4720DisDishCod), GXutil.rtrim( localUtil.format( A4720DisDishCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,546);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisDishCod_Jsonclick, 0, "", "", "", "", "", 1, edtDisDishCod_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock107_Internalname, httpContext.getMessage( "Primera parte NMetrico", ""), "", "", lblTextblock107_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 551,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisNumTex1_Internalname, GXutil.ltrim( localUtil.ntoc( A2743DisNumTex1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisNumTex1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2743DisNumTex1), "9") : localUtil.format( DecimalUtil.doubleToDec(A2743DisNumTex1), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,551);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisNumTex1_Jsonclick, 0, "", "", "", "", "", 1, edtDisNumTex1_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock108_Internalname, httpContext.getMessage( "Tipo de Estampado (Plana,Rot)", ""), "", "", lblTextblock108_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 556,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisEstTip.getInternalname(), A5032DisEstTip, "", "", 1, chkDisEstTip.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(556, this, 'S', '*',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,556);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock109_Internalname, httpContext.getMessage( "Tintar ?", ""), "", "", lblTextblock109_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 561,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisTin.getInternalname(), A4014DisTin, "", "", 1, chkDisTin.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(561, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,561);\"");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock110_Internalname, httpContext.getMessage( "CL,RL,CO", ""), "", "", lblTextblock110_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 566,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisTipCor_Internalname, GXutil.rtrim( A5290DisTipCor), GXutil.rtrim( localUtil.format( A5290DisTipCor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,566);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisTipCor_Jsonclick, 0, "", "", "", "", "", 1, edtDisTipCor_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock111_Internalname, httpContext.getMessage( "Enrollado", ""), "", "", lblTextblock111_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 571,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCruEnr_Internalname, GXutil.rtrim( A4471DisCruEnr), GXutil.rtrim( localUtil.format( A4471DisCruEnr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,571);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCruEnr_Jsonclick, 0, "", "", "", "", "", 1, edtDisCruEnr_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock112_Internalname, httpContext.getMessage( "Picado marcos acabado", ""), "", "", lblTextblock112_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 576,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisAcaMar_Internalname, GXutil.rtrim( A4479DisAcaMar), GXutil.rtrim( localUtil.format( A4479DisAcaMar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,576);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisAcaMar_Jsonclick, 0, "", "", "", "", "", 1, edtDisAcaMar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock113_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock113_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 581,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisObs_Internalname, GXutil.rtrim( A1052DisObs), GXutil.rtrim( localUtil.format( A1052DisObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,581);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisObs_Jsonclick, 0, "", "", "", "", "", 1, edtDisObs_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock114_Internalname, httpContext.getMessage( "Disposicion Reservada? S o N", ""), "", "", lblTextblock114_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 586,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisRes_Internalname, GXutil.rtrim( A1968DisRes), GXutil.rtrim( localUtil.format( A1968DisRes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,586);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisRes_Jsonclick, 0, "", "", "", "", "", 1, edtDisRes_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock115_Internalname, httpContext.getMessage( "Codigo Grado Cobertura", ""), "", "", lblTextblock115_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 591,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisGraCob_Internalname, GXutil.ltrim( localUtil.ntoc( A5025DisGraCob, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisGraCob_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5025DisGraCob), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A5025DisGraCob), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,591);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisGraCob_Jsonclick, 0, "", "", "", "", "", 1, edtDisGraCob_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock116_Internalname, httpContext.getMessage( "Codigo Inditex", ""), "", "", lblTextblock116_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 596,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCod_Idtx_Internalname, GXutil.rtrim( A10887Cod_Idtx), GXutil.rtrim( localUtil.format( A10887Cod_Idtx, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,596);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCod_Idtx_Jsonclick, 0, "", "", "", "", "", 1, edtCod_Idtx_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock117_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock117_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDsc_Idtx_Internalname, GXutil.rtrim( A10888Dsc_Idtx), GXutil.rtrim( localUtil.format( A10888Dsc_Idtx, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDsc_Idtx_Jsonclick, 0, "", "", "", "", "", 1, edtDsc_Idtx_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock118_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblock118_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 606,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCodDis_Internalname, GXutil.rtrim( A1122MaqCodDis), GXutil.rtrim( localUtil.format( A1122MaqCodDis, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,606);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCodDis_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCodDis_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISPOL.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol610( ) ;
      nGXsfl_610_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount38 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_38 = (short)(1) ;
            scanStart1IZ38( ) ;
            while ( RcdFound38 != 0 )
            {
               init_level_properties38( ) ;
               getByPrimaryKey1IZ38( ) ;
               addRow1IZ38( ) ;
               scanNext1IZ38( ) ;
            }
            scanEnd1IZ38( ) ;
            nBlankRcdCount38 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1IZ38( ) ;
         standaloneModal1IZ38( ) ;
         sMode38 = Gx_mode ;
         while ( nGXsfl_610_idx < nRC_GXsfl_610 )
         {
            bGXsfl_610_Refreshing = true ;
            readRow1IZ38( ) ;
            edtavnRcdDeleted_38_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_38_"+sGXsfl_610_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_38_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_38_Enabled), 5, 0), !bGXsfl_610_Refreshing);
            edtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCOD_"+sGXsfl_610_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_610_Refreshing);
            edtProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRODSC_"+sGXsfl_610_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), !bGXsfl_610_Refreshing);
            if ( ( nRcdExists_38 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1IZ38( ) ;
            }
            sendRow1IZ38( ) ;
            bGXsfl_610_Refreshing = false ;
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
            scanStart1IZ38( ) ;
            while ( RcdFound38 != 0 )
            {
               sGXsfl_610_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_610_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_61038( ) ;
               init_level_properties38( ) ;
               standaloneNotModal1IZ38( ) ;
               getByPrimaryKey1IZ38( ) ;
               standaloneModal1IZ38( ) ;
               addRow1IZ38( ) ;
               scanNext1IZ38( ) ;
            }
            scanEnd1IZ38( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode38 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_610_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_610_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_61038( ) ;
      initAll1IZ38( ) ;
      init_level_properties38( ) ;
      nRcdExists_38 = (short)(0) ;
      nIsMod_38 = (short)(0) ;
      nRcdDeleted_38 = (short)(0) ;
      nBlankRcdCount38 = (short)(nBlankRcdUsr38+nBlankRcdCount38) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount38 > 0 )
      {
         standaloneNotModal1IZ38( ) ;
         standaloneModal1IZ38( ) ;
         addRow1IZ38( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtProCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount38 = (short)(nBlankRcdCount38-1) ;
      }
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 616,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISPOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 617,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISPOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 618,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISPOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 619,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISPOL.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 620,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDISPOL.htm");
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
         Z337DisArtDsc = httpContext.cgiGet( "Z337DisArtDsc") ;
         Z340DisArtMat = httpContext.cgiGet( "Z340DisArtMat") ;
         Z339DisArtLar = httpContext.cgiGet( "Z339DisArtLar") ;
         Z351DisArtSua = httpContext.cgiGet( "Z351DisArtSua") ;
         Z333DisArtAca = httpContext.cgiGet( "Z333DisArtAca") ;
         Z343DisArtPle = httpContext.cgiGet( "Z343DisArtPle") ;
         Z352DisArtTip = (short)(localUtil.ctol( httpContext.cgiGet( "Z352DisArtTip"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z338DisArtEnc = httpContext.cgiGet( "Z338DisArtEnc") ;
         Z336DisArtCor = httpContext.cgiGet( "Z336DisArtCor") ;
         Z341DisArtOpe = httpContext.cgiGet( "Z341DisArtOpe") ;
         Z353DisArtTr1 = httpContext.cgiGet( "Z353DisArtTr1") ;
         Z344DisArtPt1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z344DisArtPt1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z354DisArtTr2 = httpContext.cgiGet( "Z354DisArtTr2") ;
         Z345DisArtPt2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z345DisArtPt2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z355DisArtTr3 = httpContext.cgiGet( "Z355DisArtTr3") ;
         Z346DisArtPt3 = (short)(localUtil.ctol( httpContext.cgiGet( "Z346DisArtPt3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z350DisArtRdt = localUtil.ctond( httpContext.cgiGet( "Z350DisArtRdt")) ;
         Z359DisArtUrg = (byte)(localUtil.ctol( httpContext.cgiGet( "Z359DisArtUrg"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z356DisArtUr1 = httpContext.cgiGet( "Z356DisArtUr1") ;
         Z347DisArtPu1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z347DisArtPu1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z357DisArtUr2 = httpContext.cgiGet( "Z357DisArtUr2") ;
         Z348DisArtPu2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z348DisArtPu2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z358DisArtUr3 = httpContext.cgiGet( "Z358DisArtUr3") ;
         Z349DisArtPu3 = (short)(localUtil.ctol( httpContext.cgiGet( "Z349DisArtPu3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z342DisArtPes = (short)(localUtil.ctol( httpContext.cgiGet( "Z342DisArtPes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z334DisArtAnh = (short)(localUtil.ctol( httpContext.cgiGet( "Z334DisArtAnh"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1231DisArtAn1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z1231DisArtAn1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1232DisArtAcb = (short)(localUtil.ctol( httpContext.cgiGet( "Z1232DisArtAcb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1233DisArtAc2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z1233DisArtAc2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z367DisEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z367DisEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z388DisPreKgm = localUtil.ctond( httpContext.cgiGet( "Z388DisPreKgm")) ;
         Z389DisPreMtr = localUtil.ctond( httpContext.cgiGet( "Z389DisPreMtr")) ;
         Z383DisPieLan = (short)(localUtil.ctol( httpContext.cgiGet( "Z383DisPieLan"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z372DisKgmLan = (short)(localUtil.ctol( httpContext.cgiGet( "Z372DisKgmLan"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z373DisMtrLan = (short)(localUtil.ctol( httpContext.cgiGet( "Z373DisMtrLan"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z362DisColNom = httpContext.cgiGet( "Z362DisColNom") ;
         Z363DisColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z363DisColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1195DisNomCli = httpContext.cgiGet( "Z1195DisNomCli") ;
         Z1196DisNumCli = (int)(localUtil.ctol( httpContext.cgiGet( "Z1196DisNumCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1197DisEncCom = localUtil.ctond( httpContext.cgiGet( "Z1197DisEncCom")) ;
         Z1198DisEncAnh = localUtil.ctond( httpContext.cgiGet( "Z1198DisEncAnh")) ;
         Z365DisDes = httpContext.cgiGet( "Z365DisDes") ;
         Z374DisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( "Z374DisNumPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z375DisNumUni = localUtil.ctond( httpContext.cgiGet( "Z375DisNumUni")) ;
         Z392DisUniMed = httpContext.cgiGet( "Z392DisUniMed") ;
         Z1225DisGraCru = (short)(localUtil.ctol( httpContext.cgiGet( "Z1225DisGraCru"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1430DisLoc = httpContext.cgiGet( "Z1430DisLoc") ;
         Z1502DisPart = (short)(localUtil.ctol( httpContext.cgiGet( "Z1502DisPart"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1906DisGraAca = (short)(localUtil.ctol( httpContext.cgiGet( "Z1906DisGraAca"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1907DisRdoN = localUtil.ctond( httpContext.cgiGet( "Z1907DisRdoN")) ;
         Z1908DisRdoA = localUtil.ctond( httpContext.cgiGet( "Z1908DisRdoA")) ;
         Z2009DisTipDis = httpContext.cgiGet( "Z2009DisTipDis") ;
         Z2831DisNumLot = (int)(localUtil.ctol( httpContext.cgiGet( "Z2831DisNumLot"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2832DisKgsLot = localUtil.ctond( httpContext.cgiGet( "Z2832DisKgsLot")) ;
         Z2833DisMtrLot = localUtil.ctond( httpContext.cgiGet( "Z2833DisMtrLot")) ;
         Z2835DisPle2 = httpContext.cgiGet( "Z2835DisPle2") ;
         Z3127DisNumCor = (short)(localUtil.ctol( httpContext.cgiGet( "Z3127DisNumCor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3128DisAncSal1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z3128DisAncSal1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3129DisAncSal2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z3129DisAncSal2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3130DisAncSal3 = (short)(localUtil.ctol( httpContext.cgiGet( "Z3130DisAncSal3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3131DisGraAca2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z3131DisGraAca2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3132DisGraCru2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z3132DisGraCru2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3306DisFac = httpContext.cgiGet( "Z3306DisFac") ;
         Z3307DisManCod1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z3307DisManCod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3308DisManCod2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z3308DisManCod2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3309DisNumTon = httpContext.cgiGet( "Z3309DisNumTon") ;
         Z4614DisMdlCod = httpContext.cgiGet( "Z4614DisMdlCod") ;
         Z4615DisTam = httpContext.cgiGet( "Z4615DisTam") ;
         Z4293DisNPzas = (int)(localUtil.ctol( httpContext.cgiGet( "Z4293DisNPzas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4616DisHorEnt = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z4616DisHorEnt"), 0)) ;
         Z4294DisNPzasL = (int)(localUtil.ctol( httpContext.cgiGet( "Z4294DisNPzasL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4617DisHorReg = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z4617DisHorReg"), 0)) ;
         Z5252DisAcc = httpContext.cgiGet( "Z5252DisAcc") ;
         Z5366DisAntp = httpContext.cgiGet( "Z5366DisAntp") ;
         Z5405DisAntpT = httpContext.cgiGet( "Z5405DisAntpT") ;
         Z2926DisPla = httpContext.cgiGet( "Z2926DisPla") ;
         Z4013DisEnv = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4013DisEnv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z366DisEnt = httpContext.cgiGet( "Z366DisEnt") ;
         Z4477DisAcaBak = httpContext.cgiGet( "Z4477DisAcaBak") ;
         Z5350DisObsAnc = httpContext.cgiGet( "Z5350DisObsAnc") ;
         Z5349DisObsGrm = httpContext.cgiGet( "Z5349DisObsGrm") ;
         Z4813DisEncCli = httpContext.cgiGet( "Z4813DisEncCli") ;
         Z4720DisDishCod = httpContext.cgiGet( "Z4720DisDishCod") ;
         Z2743DisNumTex1 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2743DisNumTex1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5032DisEstTip = httpContext.cgiGet( "Z5032DisEstTip") ;
         Z4014DisTin = httpContext.cgiGet( "Z4014DisTin") ;
         Z5290DisTipCor = httpContext.cgiGet( "Z5290DisTipCor") ;
         Z4471DisCruEnr = httpContext.cgiGet( "Z4471DisCruEnr") ;
         Z4479DisAcaMar = httpContext.cgiGet( "Z4479DisAcaMar") ;
         Z1052DisObs = httpContext.cgiGet( "Z1052DisObs") ;
         Z1968DisRes = httpContext.cgiGet( "Z1968DisRes") ;
         Z5025DisGraCob = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5025DisGraCob"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1122MaqCodDis = httpContext.cgiGet( "Z1122MaqCodDis") ;
         Z390DisTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( "Z390DisTipCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10887Cod_Idtx = httpContext.cgiGet( "Z10887Cod_Idtx") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_610 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_610"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A757PriCod = ((GXutil.strcmp(httpContext.cgiGet( chkPriCod.getInternalname()), "1")==0) ? "1" : "0") ;
         httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A361DisCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         }
         else
         {
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         }
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
         A337DisArtDsc = httpContext.cgiGet( edtDisArtDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
         A340DisArtMat = httpContext.cgiGet( edtDisArtMat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A340DisArtMat", A340DisArtMat);
         A339DisArtLar = httpContext.cgiGet( edtDisArtLar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A339DisArtLar", A339DisArtLar);
         A351DisArtSua = httpContext.cgiGet( edtDisArtSua_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A351DisArtSua", A351DisArtSua);
         A333DisArtAca = httpContext.cgiGet( edtDisArtAca_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A333DisArtAca", A333DisArtAca);
         A343DisArtPle = httpContext.cgiGet( edtDisArtPle_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A343DisArtPle", A343DisArtPle);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISARTTIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisArtTip_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A352DisArtTip = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A352DisArtTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A352DisArtTip), 4, 0));
         }
         else
         {
            A352DisArtTip = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A352DisArtTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A352DisArtTip), 4, 0));
         }
         A12115DisArtTipD = httpContext.cgiGet( edtDisArtTipD_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12115DisArtTipD", A12115DisArtTipD);
         A338DisArtEnc = ((GXutil.strcmp(httpContext.cgiGet( chkDisArtEnc.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A338DisArtEnc", A338DisArtEnc);
         A336DisArtCor = ((GXutil.strcmp(httpContext.cgiGet( chkDisArtCor.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A336DisArtCor", A336DisArtCor);
         A341DisArtOpe = GXutil.upper( httpContext.cgiGet( edtDisArtOpe_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A341DisArtOpe", A341DisArtOpe);
         A353DisArtTr1 = httpContext.cgiGet( edtDisArtTr1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A353DisArtTr1", A353DisArtTr1);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtPt1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtPt1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISARTPT1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisArtPt1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A344DisArtPt1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A344DisArtPt1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A344DisArtPt1), 3, 0));
         }
         else
         {
            A344DisArtPt1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A344DisArtPt1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A344DisArtPt1), 3, 0));
         }
         A354DisArtTr2 = httpContext.cgiGet( edtDisArtTr2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A354DisArtTr2", A354DisArtTr2);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtPt2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtPt2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISARTPT2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisArtPt2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A345DisArtPt2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A345DisArtPt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A345DisArtPt2), 3, 0));
         }
         else
         {
            A345DisArtPt2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A345DisArtPt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A345DisArtPt2), 3, 0));
         }
         A355DisArtTr3 = httpContext.cgiGet( edtDisArtTr3_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A355DisArtTr3", A355DisArtTr3);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtPt3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtPt3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISARTPT3");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisArtPt3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A346DisArtPt3 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A346DisArtPt3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A346DisArtPt3), 3, 0));
         }
         else
         {
            A346DisArtPt3 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPt3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A346DisArtPt3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A346DisArtPt3), 3, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisArtRdt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisArtRdt_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISARTRDT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisArtRdt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A350DisArtRdt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A350DisArtRdt", GXutil.ltrimstr( A350DisArtRdt, 6, 2));
         }
         else
         {
            A350DisArtRdt = localUtil.ctond( httpContext.cgiGet( edtDisArtRdt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A350DisArtRdt", GXutil.ltrimstr( A350DisArtRdt, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtUrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtUrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISARTURG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisArtUrg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A359DisArtUrg = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A359DisArtUrg", GXutil.str( A359DisArtUrg, 1, 0));
         }
         else
         {
            A359DisArtUrg = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisArtUrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A359DisArtUrg", GXutil.str( A359DisArtUrg, 1, 0));
         }
         A356DisArtUr1 = httpContext.cgiGet( edtDisArtUr1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A356DisArtUr1", A356DisArtUr1);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtPu1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtPu1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISARTPU1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisArtPu1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A347DisArtPu1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A347DisArtPu1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A347DisArtPu1), 3, 0));
         }
         else
         {
            A347DisArtPu1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPu1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A347DisArtPu1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A347DisArtPu1), 3, 0));
         }
         A357DisArtUr2 = httpContext.cgiGet( edtDisArtUr2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A357DisArtUr2", A357DisArtUr2);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtPu2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtPu2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISARTPU2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisArtPu2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A348DisArtPu2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A348DisArtPu2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A348DisArtPu2), 3, 0));
         }
         else
         {
            A348DisArtPu2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPu2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A348DisArtPu2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A348DisArtPu2), 3, 0));
         }
         A358DisArtUr3 = httpContext.cgiGet( edtDisArtUr3_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A358DisArtUr3", A358DisArtUr3);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtPu3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtPu3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISARTPU3");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisArtPu3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A349DisArtPu3 = (short)(0) ;
            n349DisArtPu3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A349DisArtPu3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A349DisArtPu3), 3, 0));
         }
         else
         {
            A349DisArtPu3 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPu3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n349DisArtPu3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A349DisArtPu3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A349DisArtPu3), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISARTPES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisArtPes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A342DisArtPes = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A342DisArtPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A342DisArtPes), 4, 0));
         }
         else
         {
            A342DisArtPes = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A342DisArtPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A342DisArtPes), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISARTANH");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisArtAnh_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A334DisArtAnh = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A334DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A334DisArtAnh), 3, 0));
         }
         else
         {
            A334DisArtAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A334DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A334DisArtAnh), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtAn1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtAn1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISARTAN1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisArtAn1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1231DisArtAn1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1231DisArtAn1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1231DisArtAn1), 3, 0));
         }
         else
         {
            A1231DisArtAn1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAn1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1231DisArtAn1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1231DisArtAn1), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtAcb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtAcb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISARTACB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisArtAcb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1232DisArtAcb = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1232DisArtAcb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1232DisArtAcb), 3, 0));
         }
         else
         {
            A1232DisArtAcb = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAcb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1232DisArtAcb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1232DisArtAcb), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtAc2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisArtAc2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISARTAC2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisArtAc2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1233DisArtAc2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1233DisArtAc2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1233DisArtAc2), 3, 0));
         }
         else
         {
            A1233DisArtAc2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisArtAc2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1233DisArtAc2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1233DisArtAc2), 3, 0));
         }
         A387DisPiePie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPiePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n387DisPiePie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
         A385DisPieMtr = localUtil.ctond( httpContext.cgiGet( edtDisPieMtr_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         A381DisPieKgm = localUtil.ctond( httpContext.cgiGet( edtDisPieKgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         cmbDisEst.setName( cmbDisEst.getInternalname() );
         cmbDisEst.setValue( httpContext.cgiGet( cmbDisEst.getInternalname()) );
         A367DisEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbDisEst.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A367DisEst", GXutil.str( A367DisEst, 1, 0));
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisPreKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisPreKgm_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISPREKGM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisPreKgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A388DisPreKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
         }
         else
         {
            A388DisPreKgm = localUtil.ctond( httpContext.cgiGet( edtDisPreKgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisPreMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisPreMtr_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISPREMTR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisPreMtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A389DisPreMtr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
         }
         else
         {
            A389DisPreMtr = localUtil.ctond( httpContext.cgiGet( edtDisPreMtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisPieLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisPieLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISPIELAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisPieLan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A383DisPieLan = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A383DisPieLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A383DisPieLan), 4, 0));
         }
         else
         {
            A383DisPieLan = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPieLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A383DisPieLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A383DisPieLan), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisKgmLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisKgmLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISKGMLAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisKgmLan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A372DisKgmLan = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A372DisKgmLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A372DisKgmLan), 4, 0));
         }
         else
         {
            A372DisKgmLan = (short)(localUtil.ctol( httpContext.cgiGet( edtDisKgmLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A372DisKgmLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A372DisKgmLan), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisMtrLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisMtrLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISMTRLAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisMtrLan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A373DisMtrLan = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A373DisMtrLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A373DisMtrLan), 4, 0));
         }
         else
         {
            A373DisMtrLan = (short)(localUtil.ctol( httpContext.cgiGet( edtDisMtrLan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A373DisMtrLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A373DisMtrLan), 4, 0));
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
         A1195DisNomCli = httpContext.cgiGet( edtDisNomCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1195DisNomCli", A1195DisNomCli);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISNUMCLI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisNumCli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1196DisNumCli = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1196DisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1196DisNumCli), 6, 0));
         }
         else
         {
            A1196DisNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtDisNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1196DisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1196DisNumCli), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisEncCom_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisEncCom_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISENCCOM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisEncCom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1197DisEncCom = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A1197DisEncCom", GXutil.ltrimstr( A1197DisEncCom, 6, 2));
         }
         else
         {
            A1197DisEncCom = localUtil.ctond( httpContext.cgiGet( edtDisEncCom_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1197DisEncCom", GXutil.ltrimstr( A1197DisEncCom, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisEncAnh_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisEncAnh_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISENCANH");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisEncAnh_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1198DisEncAnh = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A1198DisEncAnh", GXutil.ltrimstr( A1198DisEncAnh, 6, 2));
         }
         else
         {
            A1198DisEncAnh = localUtil.ctond( httpContext.cgiGet( edtDisEncAnh_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1198DisEncAnh", GXutil.ltrimstr( A1198DisEncAnh, 6, 2));
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
         A12116DisTipCD = httpContext.cgiGet( edtDisTipCD_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12116DisTipCD", A12116DisTipCD);
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
         A399EmprCodDis = GXutil.upper( httpContext.cgiGet( edtEmprCodDis_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A399EmprCodDis", A399EmprCodDis);
         A253CliCodDis = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCodDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A253CliCodDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A253CliCodDis), 6, 0));
         A475FindCol = httpContext.cgiGet( edtFindCol_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A475FindCol", A475FindCol);
         A379DisPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n379DisPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A379DisPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A379DisPie), 4, 0));
         A391DisUni = localUtil.ctond( httpContext.cgiGet( edtDisUni_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A391DisUni", GXutil.ltrimstr( A391DisUni, 9, 2));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisGraCru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisGraCru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISGRACRU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisGraCru_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1225DisGraCru = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1225DisGraCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1225DisGraCru), 4, 0));
         }
         else
         {
            A1225DisGraCru = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraCru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1225DisGraCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1225DisGraCru), 4, 0));
         }
         A386DisPieNor = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPieNor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A386DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A386DisPieNor), 4, 0));
         A1430DisLoc = httpContext.cgiGet( edtDisLoc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1430DisLoc", A1430DisLoc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisPart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisPart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISPART");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisPart_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1502DisPart = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1502DisPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1502DisPart), 4, 0));
         }
         else
         {
            A1502DisPart = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1502DisPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1502DisPart), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisGraAca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisGraAca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISGRAACA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisGraAca_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1906DisGraAca = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1906DisGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1906DisGraAca), 4, 0));
         }
         else
         {
            A1906DisGraAca = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraAca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1906DisGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1906DisGraAca), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisRdoN_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisRdoN_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISRDON");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisRdoN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1907DisRdoN = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A1907DisRdoN", GXutil.ltrimstr( A1907DisRdoN, 6, 2));
         }
         else
         {
            A1907DisRdoN = localUtil.ctond( httpContext.cgiGet( edtDisRdoN_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1907DisRdoN", GXutil.ltrimstr( A1907DisRdoN, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisRdoA_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisRdoA_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISRDOA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisRdoA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1908DisRdoA = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A1908DisRdoA", GXutil.ltrimstr( A1908DisRdoA, 6, 2));
         }
         else
         {
            A1908DisRdoA = localUtil.ctond( httpContext.cgiGet( edtDisRdoA_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1908DisRdoA", GXutil.ltrimstr( A1908DisRdoA, 6, 2));
         }
         A2009DisTipDis = GXutil.upper( httpContext.cgiGet( edtDisTipDis_Internalname)) ;
         n2009DisTipDis = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2009DisTipDis", A2009DisTipDis);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisNumLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisNumLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISNUMLOT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisNumLot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2831DisNumLot = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A2831DisNumLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2831DisNumLot), 8, 0));
         }
         else
         {
            A2831DisNumLot = (int)(localUtil.ctol( httpContext.cgiGet( edtDisNumLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2831DisNumLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2831DisNumLot), 8, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisKgsLot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisKgsLot_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISKGSLOT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisKgsLot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2832DisKgsLot = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A2832DisKgsLot", GXutil.ltrimstr( A2832DisKgsLot, 9, 2));
         }
         else
         {
            A2832DisKgsLot = localUtil.ctond( httpContext.cgiGet( edtDisKgsLot_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2832DisKgsLot", GXutil.ltrimstr( A2832DisKgsLot, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisMtrLot_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisMtrLot_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISMTRLOT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisMtrLot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2833DisMtrLot = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A2833DisMtrLot", GXutil.ltrimstr( A2833DisMtrLot, 9, 2));
         }
         else
         {
            A2833DisMtrLot = localUtil.ctond( httpContext.cgiGet( edtDisMtrLot_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2833DisMtrLot", GXutil.ltrimstr( A2833DisMtrLot, 9, 2));
         }
         A2835DisPle2 = httpContext.cgiGet( edtDisPle2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2835DisPle2", A2835DisPle2);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisNumCor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisNumCor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISNUMCOR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisNumCor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3127DisNumCor = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3127DisNumCor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3127DisNumCor), 4, 0));
         }
         else
         {
            A3127DisNumCor = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumCor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3127DisNumCor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3127DisNumCor), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisAncSal1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisAncSal1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISANCSAL1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisAncSal1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3128DisAncSal1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3128DisAncSal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3128DisAncSal1), 4, 0));
         }
         else
         {
            A3128DisAncSal1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisAncSal1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3128DisAncSal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3128DisAncSal1), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisAncSal2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisAncSal2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISANCSAL2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisAncSal2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3129DisAncSal2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3129DisAncSal2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3129DisAncSal2), 4, 0));
         }
         else
         {
            A3129DisAncSal2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisAncSal2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3129DisAncSal2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3129DisAncSal2), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisAncSal3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisAncSal3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISANCSAL3");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisAncSal3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3130DisAncSal3 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3130DisAncSal3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3130DisAncSal3), 4, 0));
         }
         else
         {
            A3130DisAncSal3 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisAncSal3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3130DisAncSal3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3130DisAncSal3), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisGraAca2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisGraAca2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISGRAACA2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisGraAca2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3131DisGraAca2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3131DisGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3131DisGraAca2), 4, 0));
         }
         else
         {
            A3131DisGraAca2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraAca2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3131DisGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3131DisGraAca2), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisGraCru2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisGraCru2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISGRACRU2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisGraCru2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3132DisGraCru2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3132DisGraCru2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3132DisGraCru2), 4, 0));
         }
         else
         {
            A3132DisGraCru2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisGraCru2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3132DisGraCru2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3132DisGraCru2), 4, 0));
         }
         A3306DisFac = ((GXutil.strcmp(httpContext.cgiGet( chkDisFac.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A3306DisFac", A3306DisFac);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisManCod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisManCod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISMANCOD1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisManCod1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3307DisManCod1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3307DisManCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3307DisManCod1), 4, 0));
         }
         else
         {
            A3307DisManCod1 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisManCod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3307DisManCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3307DisManCod1), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisManCod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisManCod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISMANCOD2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisManCod2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3308DisManCod2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3308DisManCod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3308DisManCod2), 4, 0));
         }
         else
         {
            A3308DisManCod2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDisManCod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3308DisManCod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3308DisManCod2), 4, 0));
         }
         A3309DisNumTon = httpContext.cgiGet( edtDisNumTon_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3309DisNumTon", A3309DisNumTon);
         A4614DisMdlCod = httpContext.cgiGet( edtDisMdlCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4614DisMdlCod", A4614DisMdlCod);
         A4615DisTam = httpContext.cgiGet( edtDisTam_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4615DisTam", A4615DisTam);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisNPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisNPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISNPZAS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisNPzas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4293DisNPzas = 0 ;
            n4293DisNPzas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4293DisNPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4293DisNPzas), 6, 0));
         }
         else
         {
            A4293DisNPzas = (int)(localUtil.ctol( httpContext.cgiGet( edtDisNPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4293DisNPzas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4293DisNPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4293DisNPzas), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtDisHorEnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "DISHORENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisHorEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4616DisHorEnt = GXutil.resetTime( GXutil.nullDate() );
            n4616DisHorEnt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4616DisHorEnt", localUtil.ttoc( A4616DisHorEnt, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A4616DisHorEnt = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtDisHorEnt_Internalname))) ;
            n4616DisHorEnt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4616DisHorEnt", localUtil.ttoc( A4616DisHorEnt, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisNPzasL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisNPzasL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISNPZASL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisNPzasL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4294DisNPzasL = 0 ;
            n4294DisNPzasL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4294DisNPzasL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4294DisNPzasL), 6, 0));
         }
         else
         {
            A4294DisNPzasL = (int)(localUtil.ctol( httpContext.cgiGet( edtDisNPzasL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4294DisNPzasL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4294DisNPzasL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4294DisNPzasL), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtDisHorReg_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "DISHORREG");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisHorReg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4617DisHorReg = GXutil.resetTime( GXutil.nullDate() );
            n4617DisHorReg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4617DisHorReg", localUtil.ttoc( A4617DisHorReg, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A4617DisHorReg = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtDisHorReg_Internalname))) ;
            n4617DisHorReg = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4617DisHorReg", localUtil.ttoc( A4617DisHorReg, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A5252DisAcc = ((GXutil.strcmp(httpContext.cgiGet( chkDisAcc.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5252DisAcc", A5252DisAcc);
         A5366DisAntp = httpContext.cgiGet( edtDisAntp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5366DisAntp", A5366DisAntp);
         A5405DisAntpT = httpContext.cgiGet( edtDisAntpT_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5405DisAntpT", A5405DisAntpT);
         A2926DisPla = ((GXutil.strcmp(httpContext.cgiGet( chkDisPla.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2926DisPla", A2926DisPla);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISENV");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisEnv_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4013DisEnv = (byte)(0) ;
            n4013DisEnv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4013DisEnv", GXutil.str( A4013DisEnv, 1, 0));
         }
         else
         {
            A4013DisEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4013DisEnv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4013DisEnv", GXutil.str( A4013DisEnv, 1, 0));
         }
         A366DisEnt = httpContext.cgiGet( edtDisEnt_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A366DisEnt", A366DisEnt);
         A4477DisAcaBak = ((GXutil.strcmp(httpContext.cgiGet( chkDisAcaBak.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4477DisAcaBak", A4477DisAcaBak);
         A5350DisObsAnc = httpContext.cgiGet( edtDisObsAnc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5350DisObsAnc", A5350DisObsAnc);
         A5349DisObsGrm = httpContext.cgiGet( edtDisObsGrm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5349DisObsGrm", A5349DisObsGrm);
         A4813DisEncCli = httpContext.cgiGet( edtDisEncCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4813DisEncCli", A4813DisEncCli);
         A4720DisDishCod = httpContext.cgiGet( edtDisDishCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4720DisDishCod", A4720DisDishCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisNumTex1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisNumTex1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISNUMTEX1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisNumTex1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2743DisNumTex1 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2743DisNumTex1", GXutil.str( A2743DisNumTex1, 1, 0));
         }
         else
         {
            A2743DisNumTex1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisNumTex1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2743DisNumTex1", GXutil.str( A2743DisNumTex1, 1, 0));
         }
         A5032DisEstTip = ((GXutil.strcmp(httpContext.cgiGet( chkDisEstTip.getInternalname()), "S")==0) ? "S" : "*") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5032DisEstTip", A5032DisEstTip);
         A4014DisTin = ((GXutil.strcmp(httpContext.cgiGet( chkDisTin.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4014DisTin", A4014DisTin);
         A5290DisTipCor = httpContext.cgiGet( edtDisTipCor_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5290DisTipCor", A5290DisTipCor);
         A4471DisCruEnr = httpContext.cgiGet( edtDisCruEnr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4471DisCruEnr", A4471DisCruEnr);
         A4479DisAcaMar = httpContext.cgiGet( edtDisAcaMar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4479DisAcaMar", A4479DisAcaMar);
         A1052DisObs = httpContext.cgiGet( edtDisObs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1052DisObs", A1052DisObs);
         A1968DisRes = httpContext.cgiGet( edtDisRes_Internalname) ;
         n1968DisRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1968DisRes", A1968DisRes);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisGraCob_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisGraCob_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISGRACOB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisGraCob_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5025DisGraCob = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5025DisGraCob", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5025DisGraCob), 2, 0));
         }
         else
         {
            A5025DisGraCob = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisGraCob_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5025DisGraCob", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5025DisGraCob), 2, 0));
         }
         A10887Cod_Idtx = httpContext.cgiGet( edtCod_Idtx_Internalname) ;
         n10887Cod_Idtx = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10887Cod_Idtx", A10887Cod_Idtx);
         A10888Dsc_Idtx = httpContext.cgiGet( edtDsc_Idtx_Internalname) ;
         n10888Dsc_Idtx = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10888Dsc_Idtx", A10888Dsc_Idtx);
         A1122MaqCodDis = httpContext.cgiGet( edtMaqCodDis_Internalname) ;
         n1122MaqCodDis = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1122MaqCodDis", A1122MaqCodDis);
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
            initAll1IZ34( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_38_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_38_Enabled), 5, 0), !bGXsfl_610_Refreshing);
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
      disableAttributes1IZ34( ) ;
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

   public void confirm_1IZ0( )
   {
      beforeValidate1IZ34( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1IZ34( ) ;
         }
         else
         {
            checkExtendedTable1IZ34( ) ;
            if ( AnyError == 0 )
            {
               zm1IZ34( 20) ;
               zm1IZ34( 21) ;
               zm1IZ34( 22) ;
               zm1IZ34( 23) ;
               zm1IZ34( 24) ;
               zm1IZ34( 25) ;
               zm1IZ34( 26) ;
            }
            closeExtendedTableCursors1IZ34( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode34 = Gx_mode ;
         confirm_1IZ38( ) ;
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
         confirmValues1IZ0( ) ;
      }
   }

   public void confirm_1IZ38( )
   {
      nGXsfl_610_idx = 0 ;
      while ( nGXsfl_610_idx < nRC_GXsfl_610 )
      {
         readRow1IZ38( ) ;
         if ( ( nRcdExists_38 != 0 ) || ( nIsMod_38 != 0 ) )
         {
            getKey1IZ38( ) ;
            if ( ( nRcdExists_38 == 0 ) && ( nRcdDeleted_38 == 0 ) )
            {
               if ( RcdFound38 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1IZ38( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1IZ38( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1IZ38( 28) ;
                     }
                     closeExtendedTableCursors1IZ38( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PROCOD_" + sGXsfl_610_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
                     getByPrimaryKey1IZ38( ) ;
                     load1IZ38( ) ;
                     beforeValidate1IZ38( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1IZ38( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_38 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1IZ38( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1IZ38( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1IZ38( 28) ;
                           }
                           closeExtendedTableCursors1IZ38( ) ;
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
                  if ( nRcdDeleted_38 == 0 )
                  {
                     GXCCtl = "PROCOD_" + sGXsfl_610_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_38_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProCod_Internalname, GXutil.rtrim( A758ProCod)) ;
         httpContext.changePostValue( edtProDsc_Internalname, GXutil.rtrim( A759ProDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_610_idx, GXutil.rtrim( Z758ProCod)) ;
         httpContext.changePostValue( "nRcdDeleted_38_"+sGXsfl_610_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_38_"+sGXsfl_610_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_38_"+sGXsfl_610_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_38 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_38_"+sGXsfl_610_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_38_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROCOD_"+sGXsfl_610_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRODSC_"+sGXsfl_610_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1IZ0( )
   {
   }

   public void zm1IZ34( int GX_JID )
   {
      if ( ( GX_JID == 19 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z757PriCod = T01IZ6_A757PriCod[0] ;
            Z360DisCliNum = T01IZ6_A360DisCliNum[0] ;
            Z370DisFecCli = T01IZ6_A370DisFecCli[0] ;
            Z335DisArtCod = T01IZ6_A335DisArtCod[0] ;
            Z369DisFec = T01IZ6_A369DisFec[0] ;
            Z371DisFecEnt = T01IZ6_A371DisFecEnt[0] ;
            Z337DisArtDsc = T01IZ6_A337DisArtDsc[0] ;
            Z340DisArtMat = T01IZ6_A340DisArtMat[0] ;
            Z339DisArtLar = T01IZ6_A339DisArtLar[0] ;
            Z351DisArtSua = T01IZ6_A351DisArtSua[0] ;
            Z333DisArtAca = T01IZ6_A333DisArtAca[0] ;
            Z343DisArtPle = T01IZ6_A343DisArtPle[0] ;
            Z352DisArtTip = T01IZ6_A352DisArtTip[0] ;
            Z338DisArtEnc = T01IZ6_A338DisArtEnc[0] ;
            Z336DisArtCor = T01IZ6_A336DisArtCor[0] ;
            Z341DisArtOpe = T01IZ6_A341DisArtOpe[0] ;
            Z353DisArtTr1 = T01IZ6_A353DisArtTr1[0] ;
            Z344DisArtPt1 = T01IZ6_A344DisArtPt1[0] ;
            Z354DisArtTr2 = T01IZ6_A354DisArtTr2[0] ;
            Z345DisArtPt2 = T01IZ6_A345DisArtPt2[0] ;
            Z355DisArtTr3 = T01IZ6_A355DisArtTr3[0] ;
            Z346DisArtPt3 = T01IZ6_A346DisArtPt3[0] ;
            Z350DisArtRdt = T01IZ6_A350DisArtRdt[0] ;
            Z359DisArtUrg = T01IZ6_A359DisArtUrg[0] ;
            Z356DisArtUr1 = T01IZ6_A356DisArtUr1[0] ;
            Z347DisArtPu1 = T01IZ6_A347DisArtPu1[0] ;
            Z357DisArtUr2 = T01IZ6_A357DisArtUr2[0] ;
            Z348DisArtPu2 = T01IZ6_A348DisArtPu2[0] ;
            Z358DisArtUr3 = T01IZ6_A358DisArtUr3[0] ;
            Z349DisArtPu3 = T01IZ6_A349DisArtPu3[0] ;
            Z342DisArtPes = T01IZ6_A342DisArtPes[0] ;
            Z334DisArtAnh = T01IZ6_A334DisArtAnh[0] ;
            Z1231DisArtAn1 = T01IZ6_A1231DisArtAn1[0] ;
            Z1232DisArtAcb = T01IZ6_A1232DisArtAcb[0] ;
            Z1233DisArtAc2 = T01IZ6_A1233DisArtAc2[0] ;
            Z367DisEst = T01IZ6_A367DisEst[0] ;
            Z388DisPreKgm = T01IZ6_A388DisPreKgm[0] ;
            Z389DisPreMtr = T01IZ6_A389DisPreMtr[0] ;
            Z383DisPieLan = T01IZ6_A383DisPieLan[0] ;
            Z372DisKgmLan = T01IZ6_A372DisKgmLan[0] ;
            Z373DisMtrLan = T01IZ6_A373DisMtrLan[0] ;
            Z362DisColNom = T01IZ6_A362DisColNom[0] ;
            Z363DisColNum = T01IZ6_A363DisColNum[0] ;
            Z1195DisNomCli = T01IZ6_A1195DisNomCli[0] ;
            Z1196DisNumCli = T01IZ6_A1196DisNumCli[0] ;
            Z1197DisEncCom = T01IZ6_A1197DisEncCom[0] ;
            Z1198DisEncAnh = T01IZ6_A1198DisEncAnh[0] ;
            Z365DisDes = T01IZ6_A365DisDes[0] ;
            Z374DisNumPie = T01IZ6_A374DisNumPie[0] ;
            Z375DisNumUni = T01IZ6_A375DisNumUni[0] ;
            Z392DisUniMed = T01IZ6_A392DisUniMed[0] ;
            Z1225DisGraCru = T01IZ6_A1225DisGraCru[0] ;
            Z1430DisLoc = T01IZ6_A1430DisLoc[0] ;
            Z1502DisPart = T01IZ6_A1502DisPart[0] ;
            Z1906DisGraAca = T01IZ6_A1906DisGraAca[0] ;
            Z1907DisRdoN = T01IZ6_A1907DisRdoN[0] ;
            Z1908DisRdoA = T01IZ6_A1908DisRdoA[0] ;
            Z2009DisTipDis = T01IZ6_A2009DisTipDis[0] ;
            Z2831DisNumLot = T01IZ6_A2831DisNumLot[0] ;
            Z2832DisKgsLot = T01IZ6_A2832DisKgsLot[0] ;
            Z2833DisMtrLot = T01IZ6_A2833DisMtrLot[0] ;
            Z2835DisPle2 = T01IZ6_A2835DisPle2[0] ;
            Z3127DisNumCor = T01IZ6_A3127DisNumCor[0] ;
            Z3128DisAncSal1 = T01IZ6_A3128DisAncSal1[0] ;
            Z3129DisAncSal2 = T01IZ6_A3129DisAncSal2[0] ;
            Z3130DisAncSal3 = T01IZ6_A3130DisAncSal3[0] ;
            Z3131DisGraAca2 = T01IZ6_A3131DisGraAca2[0] ;
            Z3132DisGraCru2 = T01IZ6_A3132DisGraCru2[0] ;
            Z3306DisFac = T01IZ6_A3306DisFac[0] ;
            Z3307DisManCod1 = T01IZ6_A3307DisManCod1[0] ;
            Z3308DisManCod2 = T01IZ6_A3308DisManCod2[0] ;
            Z3309DisNumTon = T01IZ6_A3309DisNumTon[0] ;
            Z4614DisMdlCod = T01IZ6_A4614DisMdlCod[0] ;
            Z4615DisTam = T01IZ6_A4615DisTam[0] ;
            Z4293DisNPzas = T01IZ6_A4293DisNPzas[0] ;
            Z4616DisHorEnt = T01IZ6_A4616DisHorEnt[0] ;
            Z4294DisNPzasL = T01IZ6_A4294DisNPzasL[0] ;
            Z4617DisHorReg = T01IZ6_A4617DisHorReg[0] ;
            Z5252DisAcc = T01IZ6_A5252DisAcc[0] ;
            Z5366DisAntp = T01IZ6_A5366DisAntp[0] ;
            Z5405DisAntpT = T01IZ6_A5405DisAntpT[0] ;
            Z2926DisPla = T01IZ6_A2926DisPla[0] ;
            Z4013DisEnv = T01IZ6_A4013DisEnv[0] ;
            Z366DisEnt = T01IZ6_A366DisEnt[0] ;
            Z4477DisAcaBak = T01IZ6_A4477DisAcaBak[0] ;
            Z5350DisObsAnc = T01IZ6_A5350DisObsAnc[0] ;
            Z5349DisObsGrm = T01IZ6_A5349DisObsGrm[0] ;
            Z4813DisEncCli = T01IZ6_A4813DisEncCli[0] ;
            Z4720DisDishCod = T01IZ6_A4720DisDishCod[0] ;
            Z2743DisNumTex1 = T01IZ6_A2743DisNumTex1[0] ;
            Z5032DisEstTip = T01IZ6_A5032DisEstTip[0] ;
            Z4014DisTin = T01IZ6_A4014DisTin[0] ;
            Z5290DisTipCor = T01IZ6_A5290DisTipCor[0] ;
            Z4471DisCruEnr = T01IZ6_A4471DisCruEnr[0] ;
            Z4479DisAcaMar = T01IZ6_A4479DisAcaMar[0] ;
            Z1052DisObs = T01IZ6_A1052DisObs[0] ;
            Z1968DisRes = T01IZ6_A1968DisRes[0] ;
            Z5025DisGraCob = T01IZ6_A5025DisGraCob[0] ;
            Z252CliCod = T01IZ6_A252CliCod[0] ;
            Z1122MaqCodDis = T01IZ6_A1122MaqCodDis[0] ;
            Z390DisTipCol = T01IZ6_A390DisTipCol[0] ;
            Z10887Cod_Idtx = T01IZ6_A10887Cod_Idtx[0] ;
         }
         else
         {
            Z757PriCod = A757PriCod ;
            Z360DisCliNum = A360DisCliNum ;
            Z370DisFecCli = A370DisFecCli ;
            Z335DisArtCod = A335DisArtCod ;
            Z369DisFec = A369DisFec ;
            Z371DisFecEnt = A371DisFecEnt ;
            Z337DisArtDsc = A337DisArtDsc ;
            Z340DisArtMat = A340DisArtMat ;
            Z339DisArtLar = A339DisArtLar ;
            Z351DisArtSua = A351DisArtSua ;
            Z333DisArtAca = A333DisArtAca ;
            Z343DisArtPle = A343DisArtPle ;
            Z352DisArtTip = A352DisArtTip ;
            Z338DisArtEnc = A338DisArtEnc ;
            Z336DisArtCor = A336DisArtCor ;
            Z341DisArtOpe = A341DisArtOpe ;
            Z353DisArtTr1 = A353DisArtTr1 ;
            Z344DisArtPt1 = A344DisArtPt1 ;
            Z354DisArtTr2 = A354DisArtTr2 ;
            Z345DisArtPt2 = A345DisArtPt2 ;
            Z355DisArtTr3 = A355DisArtTr3 ;
            Z346DisArtPt3 = A346DisArtPt3 ;
            Z350DisArtRdt = A350DisArtRdt ;
            Z359DisArtUrg = A359DisArtUrg ;
            Z356DisArtUr1 = A356DisArtUr1 ;
            Z347DisArtPu1 = A347DisArtPu1 ;
            Z357DisArtUr2 = A357DisArtUr2 ;
            Z348DisArtPu2 = A348DisArtPu2 ;
            Z358DisArtUr3 = A358DisArtUr3 ;
            Z349DisArtPu3 = A349DisArtPu3 ;
            Z342DisArtPes = A342DisArtPes ;
            Z334DisArtAnh = A334DisArtAnh ;
            Z1231DisArtAn1 = A1231DisArtAn1 ;
            Z1232DisArtAcb = A1232DisArtAcb ;
            Z1233DisArtAc2 = A1233DisArtAc2 ;
            Z367DisEst = A367DisEst ;
            Z388DisPreKgm = A388DisPreKgm ;
            Z389DisPreMtr = A389DisPreMtr ;
            Z383DisPieLan = A383DisPieLan ;
            Z372DisKgmLan = A372DisKgmLan ;
            Z373DisMtrLan = A373DisMtrLan ;
            Z362DisColNom = A362DisColNom ;
            Z363DisColNum = A363DisColNum ;
            Z1195DisNomCli = A1195DisNomCli ;
            Z1196DisNumCli = A1196DisNumCli ;
            Z1197DisEncCom = A1197DisEncCom ;
            Z1198DisEncAnh = A1198DisEncAnh ;
            Z365DisDes = A365DisDes ;
            Z374DisNumPie = A374DisNumPie ;
            Z375DisNumUni = A375DisNumUni ;
            Z392DisUniMed = A392DisUniMed ;
            Z1225DisGraCru = A1225DisGraCru ;
            Z1430DisLoc = A1430DisLoc ;
            Z1502DisPart = A1502DisPart ;
            Z1906DisGraAca = A1906DisGraAca ;
            Z1907DisRdoN = A1907DisRdoN ;
            Z1908DisRdoA = A1908DisRdoA ;
            Z2009DisTipDis = A2009DisTipDis ;
            Z2831DisNumLot = A2831DisNumLot ;
            Z2832DisKgsLot = A2832DisKgsLot ;
            Z2833DisMtrLot = A2833DisMtrLot ;
            Z2835DisPle2 = A2835DisPle2 ;
            Z3127DisNumCor = A3127DisNumCor ;
            Z3128DisAncSal1 = A3128DisAncSal1 ;
            Z3129DisAncSal2 = A3129DisAncSal2 ;
            Z3130DisAncSal3 = A3130DisAncSal3 ;
            Z3131DisGraAca2 = A3131DisGraAca2 ;
            Z3132DisGraCru2 = A3132DisGraCru2 ;
            Z3306DisFac = A3306DisFac ;
            Z3307DisManCod1 = A3307DisManCod1 ;
            Z3308DisManCod2 = A3308DisManCod2 ;
            Z3309DisNumTon = A3309DisNumTon ;
            Z4614DisMdlCod = A4614DisMdlCod ;
            Z4615DisTam = A4615DisTam ;
            Z4293DisNPzas = A4293DisNPzas ;
            Z4616DisHorEnt = A4616DisHorEnt ;
            Z4294DisNPzasL = A4294DisNPzasL ;
            Z4617DisHorReg = A4617DisHorReg ;
            Z5252DisAcc = A5252DisAcc ;
            Z5366DisAntp = A5366DisAntp ;
            Z5405DisAntpT = A5405DisAntpT ;
            Z2926DisPla = A2926DisPla ;
            Z4013DisEnv = A4013DisEnv ;
            Z366DisEnt = A366DisEnt ;
            Z4477DisAcaBak = A4477DisAcaBak ;
            Z5350DisObsAnc = A5350DisObsAnc ;
            Z5349DisObsGrm = A5349DisObsGrm ;
            Z4813DisEncCli = A4813DisEncCli ;
            Z4720DisDishCod = A4720DisDishCod ;
            Z2743DisNumTex1 = A2743DisNumTex1 ;
            Z5032DisEstTip = A5032DisEstTip ;
            Z4014DisTin = A4014DisTin ;
            Z5290DisTipCor = A5290DisTipCor ;
            Z4471DisCruEnr = A4471DisCruEnr ;
            Z4479DisAcaMar = A4479DisAcaMar ;
            Z1052DisObs = A1052DisObs ;
            Z1968DisRes = A1968DisRes ;
            Z5025DisGraCob = A5025DisGraCob ;
            Z252CliCod = A252CliCod ;
            Z1122MaqCodDis = A1122MaqCodDis ;
            Z390DisTipCol = A390DisTipCol ;
            Z10887Cod_Idtx = A10887Cod_Idtx ;
         }
      }
      if ( GX_JID == -19 )
      {
         Z5025DisGraCob = A5025DisGraCob ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z1122MaqCodDis = A1122MaqCodDis ;
         Z390DisTipCol = A390DisTipCol ;
         Z10887Cod_Idtx = A10887Cod_Idtx ;
         Z361DisCod = A361DisCod ;
         Z757PriCod = A757PriCod ;
         Z360DisCliNum = A360DisCliNum ;
         Z370DisFecCli = A370DisFecCli ;
         Z335DisArtCod = A335DisArtCod ;
         Z369DisFec = A369DisFec ;
         Z371DisFecEnt = A371DisFecEnt ;
         Z337DisArtDsc = A337DisArtDsc ;
         Z340DisArtMat = A340DisArtMat ;
         Z339DisArtLar = A339DisArtLar ;
         Z351DisArtSua = A351DisArtSua ;
         Z333DisArtAca = A333DisArtAca ;
         Z343DisArtPle = A343DisArtPle ;
         Z352DisArtTip = A352DisArtTip ;
         Z338DisArtEnc = A338DisArtEnc ;
         Z336DisArtCor = A336DisArtCor ;
         Z341DisArtOpe = A341DisArtOpe ;
         Z353DisArtTr1 = A353DisArtTr1 ;
         Z344DisArtPt1 = A344DisArtPt1 ;
         Z354DisArtTr2 = A354DisArtTr2 ;
         Z345DisArtPt2 = A345DisArtPt2 ;
         Z355DisArtTr3 = A355DisArtTr3 ;
         Z346DisArtPt3 = A346DisArtPt3 ;
         Z350DisArtRdt = A350DisArtRdt ;
         Z359DisArtUrg = A359DisArtUrg ;
         Z356DisArtUr1 = A356DisArtUr1 ;
         Z347DisArtPu1 = A347DisArtPu1 ;
         Z357DisArtUr2 = A357DisArtUr2 ;
         Z348DisArtPu2 = A348DisArtPu2 ;
         Z358DisArtUr3 = A358DisArtUr3 ;
         Z349DisArtPu3 = A349DisArtPu3 ;
         Z342DisArtPes = A342DisArtPes ;
         Z334DisArtAnh = A334DisArtAnh ;
         Z1231DisArtAn1 = A1231DisArtAn1 ;
         Z1232DisArtAcb = A1232DisArtAcb ;
         Z1233DisArtAc2 = A1233DisArtAc2 ;
         Z367DisEst = A367DisEst ;
         Z388DisPreKgm = A388DisPreKgm ;
         Z389DisPreMtr = A389DisPreMtr ;
         Z383DisPieLan = A383DisPieLan ;
         Z372DisKgmLan = A372DisKgmLan ;
         Z373DisMtrLan = A373DisMtrLan ;
         Z362DisColNom = A362DisColNom ;
         Z363DisColNum = A363DisColNum ;
         Z1195DisNomCli = A1195DisNomCli ;
         Z1196DisNumCli = A1196DisNumCli ;
         Z1197DisEncCom = A1197DisEncCom ;
         Z1198DisEncAnh = A1198DisEncAnh ;
         Z365DisDes = A365DisDes ;
         Z374DisNumPie = A374DisNumPie ;
         Z375DisNumUni = A375DisNumUni ;
         Z392DisUniMed = A392DisUniMed ;
         Z1225DisGraCru = A1225DisGraCru ;
         Z1430DisLoc = A1430DisLoc ;
         Z1502DisPart = A1502DisPart ;
         Z1906DisGraAca = A1906DisGraAca ;
         Z1907DisRdoN = A1907DisRdoN ;
         Z1908DisRdoA = A1908DisRdoA ;
         Z2009DisTipDis = A2009DisTipDis ;
         Z2831DisNumLot = A2831DisNumLot ;
         Z2832DisKgsLot = A2832DisKgsLot ;
         Z2833DisMtrLot = A2833DisMtrLot ;
         Z2835DisPle2 = A2835DisPle2 ;
         Z3127DisNumCor = A3127DisNumCor ;
         Z3128DisAncSal1 = A3128DisAncSal1 ;
         Z3129DisAncSal2 = A3129DisAncSal2 ;
         Z3130DisAncSal3 = A3130DisAncSal3 ;
         Z3131DisGraAca2 = A3131DisGraAca2 ;
         Z3132DisGraCru2 = A3132DisGraCru2 ;
         Z3306DisFac = A3306DisFac ;
         Z3307DisManCod1 = A3307DisManCod1 ;
         Z3308DisManCod2 = A3308DisManCod2 ;
         Z3309DisNumTon = A3309DisNumTon ;
         Z4614DisMdlCod = A4614DisMdlCod ;
         Z4615DisTam = A4615DisTam ;
         Z4293DisNPzas = A4293DisNPzas ;
         Z4616DisHorEnt = A4616DisHorEnt ;
         Z4294DisNPzasL = A4294DisNPzasL ;
         Z4617DisHorReg = A4617DisHorReg ;
         Z5252DisAcc = A5252DisAcc ;
         Z5366DisAntp = A5366DisAntp ;
         Z5405DisAntpT = A5405DisAntpT ;
         Z2926DisPla = A2926DisPla ;
         Z4013DisEnv = A4013DisEnv ;
         Z366DisEnt = A366DisEnt ;
         Z4477DisAcaBak = A4477DisAcaBak ;
         Z5350DisObsAnc = A5350DisObsAnc ;
         Z5349DisObsGrm = A5349DisObsGrm ;
         Z4813DisEncCli = A4813DisEncCli ;
         Z4720DisDishCod = A4720DisDishCod ;
         Z2743DisNumTex1 = A2743DisNumTex1 ;
         Z5032DisEstTip = A5032DisEstTip ;
         Z4014DisTin = A4014DisTin ;
         Z5290DisTipCor = A5290DisTipCor ;
         Z4471DisCruEnr = A4471DisCruEnr ;
         Z4479DisAcaMar = A4479DisAcaMar ;
         Z1052DisObs = A1052DisObs ;
         Z1968DisRes = A1968DisRes ;
         Z407EmprNom = A407EmprNom ;
         Z387DisPiePie = A387DisPiePie ;
         Z379DisPie = A379DisPie ;
         Z279CliNom = A279CliNom ;
         Z10888Dsc_Idtx = A10888Dsc_Idtx ;
      }
   }

   public void standaloneNotModal( )
   {
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

   public void load1IZ34( )
   {
      /* Using cursor T01IZ18 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A5025DisGraCob = T01IZ18_A5025DisGraCob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5025DisGraCob", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5025DisGraCob), 2, 0));
         A10888Dsc_Idtx = T01IZ18_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = T01IZ18_n10888Dsc_Idtx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10888Dsc_Idtx", A10888Dsc_Idtx);
         A252CliCod = T01IZ18_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1122MaqCodDis = T01IZ18_A1122MaqCodDis[0] ;
         n1122MaqCodDis = T01IZ18_n1122MaqCodDis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1122MaqCodDis", A1122MaqCodDis);
         A390DisTipCol = T01IZ18_A390DisTipCol[0] ;
         n390DisTipCol = T01IZ18_n390DisTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
         A10887Cod_Idtx = T01IZ18_A10887Cod_Idtx[0] ;
         n10887Cod_Idtx = T01IZ18_n10887Cod_Idtx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10887Cod_Idtx", A10887Cod_Idtx);
         A387DisPiePie = T01IZ18_A387DisPiePie[0] ;
         n387DisPiePie = T01IZ18_n387DisPiePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
         A379DisPie = T01IZ18_A379DisPie[0] ;
         n379DisPie = T01IZ18_n379DisPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A379DisPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A379DisPie), 4, 0));
         A757PriCod = T01IZ18_A757PriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
         A407EmprNom = T01IZ18_A407EmprNom[0] ;
         n407EmprNom = T01IZ18_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A360DisCliNum = T01IZ18_A360DisCliNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A360DisCliNum", A360DisCliNum);
         A370DisFecCli = T01IZ18_A370DisFecCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
         A279CliNom = T01IZ18_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A335DisArtCod = T01IZ18_A335DisArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         A369DisFec = T01IZ18_A369DisFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A371DisFecEnt = T01IZ18_A371DisFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
         A337DisArtDsc = T01IZ18_A337DisArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
         A340DisArtMat = T01IZ18_A340DisArtMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A340DisArtMat", A340DisArtMat);
         A339DisArtLar = T01IZ18_A339DisArtLar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A339DisArtLar", A339DisArtLar);
         A351DisArtSua = T01IZ18_A351DisArtSua[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A351DisArtSua", A351DisArtSua);
         A333DisArtAca = T01IZ18_A333DisArtAca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A333DisArtAca", A333DisArtAca);
         A343DisArtPle = T01IZ18_A343DisArtPle[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A343DisArtPle", A343DisArtPle);
         A352DisArtTip = T01IZ18_A352DisArtTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A352DisArtTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A352DisArtTip), 4, 0));
         A338DisArtEnc = T01IZ18_A338DisArtEnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A338DisArtEnc", A338DisArtEnc);
         A336DisArtCor = T01IZ18_A336DisArtCor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A336DisArtCor", A336DisArtCor);
         A341DisArtOpe = T01IZ18_A341DisArtOpe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A341DisArtOpe", A341DisArtOpe);
         A353DisArtTr1 = T01IZ18_A353DisArtTr1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A353DisArtTr1", A353DisArtTr1);
         A344DisArtPt1 = T01IZ18_A344DisArtPt1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A344DisArtPt1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A344DisArtPt1), 3, 0));
         A354DisArtTr2 = T01IZ18_A354DisArtTr2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A354DisArtTr2", A354DisArtTr2);
         A345DisArtPt2 = T01IZ18_A345DisArtPt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A345DisArtPt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A345DisArtPt2), 3, 0));
         A355DisArtTr3 = T01IZ18_A355DisArtTr3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A355DisArtTr3", A355DisArtTr3);
         A346DisArtPt3 = T01IZ18_A346DisArtPt3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A346DisArtPt3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A346DisArtPt3), 3, 0));
         A350DisArtRdt = T01IZ18_A350DisArtRdt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A350DisArtRdt", GXutil.ltrimstr( A350DisArtRdt, 6, 2));
         A359DisArtUrg = T01IZ18_A359DisArtUrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A359DisArtUrg", GXutil.str( A359DisArtUrg, 1, 0));
         A356DisArtUr1 = T01IZ18_A356DisArtUr1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A356DisArtUr1", A356DisArtUr1);
         A347DisArtPu1 = T01IZ18_A347DisArtPu1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A347DisArtPu1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A347DisArtPu1), 3, 0));
         A357DisArtUr2 = T01IZ18_A357DisArtUr2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A357DisArtUr2", A357DisArtUr2);
         A348DisArtPu2 = T01IZ18_A348DisArtPu2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A348DisArtPu2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A348DisArtPu2), 3, 0));
         A358DisArtUr3 = T01IZ18_A358DisArtUr3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A358DisArtUr3", A358DisArtUr3);
         A349DisArtPu3 = T01IZ18_A349DisArtPu3[0] ;
         n349DisArtPu3 = T01IZ18_n349DisArtPu3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A349DisArtPu3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A349DisArtPu3), 3, 0));
         A342DisArtPes = T01IZ18_A342DisArtPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A342DisArtPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A342DisArtPes), 4, 0));
         A334DisArtAnh = T01IZ18_A334DisArtAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A334DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A334DisArtAnh), 3, 0));
         A1231DisArtAn1 = T01IZ18_A1231DisArtAn1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1231DisArtAn1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1231DisArtAn1), 3, 0));
         A1232DisArtAcb = T01IZ18_A1232DisArtAcb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1232DisArtAcb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1232DisArtAcb), 3, 0));
         A1233DisArtAc2 = T01IZ18_A1233DisArtAc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1233DisArtAc2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1233DisArtAc2), 3, 0));
         A367DisEst = T01IZ18_A367DisEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367DisEst", GXutil.str( A367DisEst, 1, 0));
         A388DisPreKgm = T01IZ18_A388DisPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
         A389DisPreMtr = T01IZ18_A389DisPreMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
         A383DisPieLan = T01IZ18_A383DisPieLan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A383DisPieLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A383DisPieLan), 4, 0));
         A372DisKgmLan = T01IZ18_A372DisKgmLan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A372DisKgmLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A372DisKgmLan), 4, 0));
         A373DisMtrLan = T01IZ18_A373DisMtrLan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A373DisMtrLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A373DisMtrLan), 4, 0));
         A362DisColNom = T01IZ18_A362DisColNom[0] ;
         n362DisColNom = T01IZ18_n362DisColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
         A363DisColNum = T01IZ18_A363DisColNum[0] ;
         n363DisColNum = T01IZ18_n363DisColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
         A1195DisNomCli = T01IZ18_A1195DisNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1195DisNomCli", A1195DisNomCli);
         A1196DisNumCli = T01IZ18_A1196DisNumCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1196DisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1196DisNumCli), 6, 0));
         A1197DisEncCom = T01IZ18_A1197DisEncCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1197DisEncCom", GXutil.ltrimstr( A1197DisEncCom, 6, 2));
         A1198DisEncAnh = T01IZ18_A1198DisEncAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1198DisEncAnh", GXutil.ltrimstr( A1198DisEncAnh, 6, 2));
         A365DisDes = T01IZ18_A365DisDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
         A374DisNumPie = T01IZ18_A374DisNumPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
         A375DisNumUni = T01IZ18_A375DisNumUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A375DisNumUni", GXutil.ltrimstr( A375DisNumUni, 9, 2));
         A392DisUniMed = T01IZ18_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A1225DisGraCru = T01IZ18_A1225DisGraCru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1225DisGraCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1225DisGraCru), 4, 0));
         A1430DisLoc = T01IZ18_A1430DisLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1430DisLoc", A1430DisLoc);
         A1502DisPart = T01IZ18_A1502DisPart[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1502DisPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1502DisPart), 4, 0));
         A1906DisGraAca = T01IZ18_A1906DisGraAca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1906DisGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1906DisGraAca), 4, 0));
         A1907DisRdoN = T01IZ18_A1907DisRdoN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1907DisRdoN", GXutil.ltrimstr( A1907DisRdoN, 6, 2));
         A1908DisRdoA = T01IZ18_A1908DisRdoA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1908DisRdoA", GXutil.ltrimstr( A1908DisRdoA, 6, 2));
         A2009DisTipDis = T01IZ18_A2009DisTipDis[0] ;
         n2009DisTipDis = T01IZ18_n2009DisTipDis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2009DisTipDis", A2009DisTipDis);
         A2831DisNumLot = T01IZ18_A2831DisNumLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2831DisNumLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2831DisNumLot), 8, 0));
         A2832DisKgsLot = T01IZ18_A2832DisKgsLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2832DisKgsLot", GXutil.ltrimstr( A2832DisKgsLot, 9, 2));
         A2833DisMtrLot = T01IZ18_A2833DisMtrLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2833DisMtrLot", GXutil.ltrimstr( A2833DisMtrLot, 9, 2));
         A2835DisPle2 = T01IZ18_A2835DisPle2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2835DisPle2", A2835DisPle2);
         A3127DisNumCor = T01IZ18_A3127DisNumCor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3127DisNumCor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3127DisNumCor), 4, 0));
         A3128DisAncSal1 = T01IZ18_A3128DisAncSal1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3128DisAncSal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3128DisAncSal1), 4, 0));
         A3129DisAncSal2 = T01IZ18_A3129DisAncSal2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3129DisAncSal2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3129DisAncSal2), 4, 0));
         A3130DisAncSal3 = T01IZ18_A3130DisAncSal3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3130DisAncSal3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3130DisAncSal3), 4, 0));
         A3131DisGraAca2 = T01IZ18_A3131DisGraAca2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3131DisGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3131DisGraAca2), 4, 0));
         A3132DisGraCru2 = T01IZ18_A3132DisGraCru2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3132DisGraCru2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3132DisGraCru2), 4, 0));
         A3306DisFac = T01IZ18_A3306DisFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3306DisFac", A3306DisFac);
         A3307DisManCod1 = T01IZ18_A3307DisManCod1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3307DisManCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3307DisManCod1), 4, 0));
         A3308DisManCod2 = T01IZ18_A3308DisManCod2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3308DisManCod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3308DisManCod2), 4, 0));
         A3309DisNumTon = T01IZ18_A3309DisNumTon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3309DisNumTon", A3309DisNumTon);
         A4614DisMdlCod = T01IZ18_A4614DisMdlCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4614DisMdlCod", A4614DisMdlCod);
         A4615DisTam = T01IZ18_A4615DisTam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4615DisTam", A4615DisTam);
         A4293DisNPzas = T01IZ18_A4293DisNPzas[0] ;
         n4293DisNPzas = T01IZ18_n4293DisNPzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4293DisNPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4293DisNPzas), 6, 0));
         A4616DisHorEnt = T01IZ18_A4616DisHorEnt[0] ;
         n4616DisHorEnt = T01IZ18_n4616DisHorEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4616DisHorEnt", localUtil.ttoc( A4616DisHorEnt, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4294DisNPzasL = T01IZ18_A4294DisNPzasL[0] ;
         n4294DisNPzasL = T01IZ18_n4294DisNPzasL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4294DisNPzasL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4294DisNPzasL), 6, 0));
         A4617DisHorReg = T01IZ18_A4617DisHorReg[0] ;
         n4617DisHorReg = T01IZ18_n4617DisHorReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4617DisHorReg", localUtil.ttoc( A4617DisHorReg, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5252DisAcc = T01IZ18_A5252DisAcc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5252DisAcc", A5252DisAcc);
         A5366DisAntp = T01IZ18_A5366DisAntp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5366DisAntp", A5366DisAntp);
         A5405DisAntpT = T01IZ18_A5405DisAntpT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5405DisAntpT", A5405DisAntpT);
         A2926DisPla = T01IZ18_A2926DisPla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2926DisPla", A2926DisPla);
         A4013DisEnv = T01IZ18_A4013DisEnv[0] ;
         n4013DisEnv = T01IZ18_n4013DisEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4013DisEnv", GXutil.str( A4013DisEnv, 1, 0));
         A366DisEnt = T01IZ18_A366DisEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A366DisEnt", A366DisEnt);
         A4477DisAcaBak = T01IZ18_A4477DisAcaBak[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4477DisAcaBak", A4477DisAcaBak);
         A5350DisObsAnc = T01IZ18_A5350DisObsAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5350DisObsAnc", A5350DisObsAnc);
         A5349DisObsGrm = T01IZ18_A5349DisObsGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5349DisObsGrm", A5349DisObsGrm);
         A4813DisEncCli = T01IZ18_A4813DisEncCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4813DisEncCli", A4813DisEncCli);
         A4720DisDishCod = T01IZ18_A4720DisDishCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4720DisDishCod", A4720DisDishCod);
         A2743DisNumTex1 = T01IZ18_A2743DisNumTex1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2743DisNumTex1", GXutil.str( A2743DisNumTex1, 1, 0));
         A5032DisEstTip = T01IZ18_A5032DisEstTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5032DisEstTip", A5032DisEstTip);
         A4014DisTin = T01IZ18_A4014DisTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4014DisTin", A4014DisTin);
         A5290DisTipCor = T01IZ18_A5290DisTipCor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5290DisTipCor", A5290DisTipCor);
         A4471DisCruEnr = T01IZ18_A4471DisCruEnr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4471DisCruEnr", A4471DisCruEnr);
         A4479DisAcaMar = T01IZ18_A4479DisAcaMar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4479DisAcaMar", A4479DisAcaMar);
         A1052DisObs = T01IZ18_A1052DisObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1052DisObs", A1052DisObs);
         A1968DisRes = T01IZ18_A1968DisRes[0] ;
         n1968DisRes = T01IZ18_n1968DisRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1968DisRes", A1968DisRes);
         zm1IZ34( -19) ;
      }
      pr_default.close(12);
      onLoadActions1IZ34( ) ;
   }

   public void onLoadActions1IZ34( )
   {
      GXt_char1 = A12116DisTipCD ;
      GXv_char2[0] = A396EmprCod ;
      GXv_int3[0] = A390DisTipCol ;
      GXv_char4[0] = GXt_char1 ;
      new app.pfcoldsc(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
      tdispol_impl.this.A396EmprCod = GXv_char2[0] ;
      tdispol_impl.this.A390DisTipCol = GXv_int3[0] ;
      tdispol_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
      A12116DisTipCD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12116DisTipCD", A12116DisTipCD);
      GXt_char1 = A12115DisArtTipD ;
      GXv_char4[0] = GXt_char1 ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A352DisArtTip, GXv_char4) ;
      tdispol_impl.this.GXt_char1 = GXv_char4[0] ;
      A12115DisArtTipD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12115DisArtTipD", A12115DisArtTipD);
      GXt_char1 = A475FindCol ;
      GXv_char4[0] = GXt_char1 ;
      new app.pedidos.dis_findcol_validate(remoteHandle, context).execute( A396EmprCod, A252CliCod, A335DisArtCod, A362DisColNom, A363DisColNum, A390DisTipCol, GXv_char4) ;
      tdispol_impl.this.GXt_char1 = GXv_char4[0] ;
      A475FindCol = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A475FindCol", A475FindCol);
      A399EmprCodDis = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A399EmprCodDis", A399EmprCodDis);
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
      {
         A391DisUni = getDisUni0( A396EmprCod, A361DisCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A391DisUni", GXutil.ltrimstr( A391DisUni, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 )
         {
            A391DisUni = getDisUni1( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A391DisUni", GXutil.ltrimstr( A391DisUni, 9, 2));
         }
         else
         {
            A391DisUni = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A391DisUni", GXutil.ltrimstr( A391DisUni, 9, 2));
         }
      }
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         }
         else
         {
            A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         }
      }
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         }
         else
         {
            A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         }
      }
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A386DisPieNor = (short)(getDisPieNor0( A396EmprCod, A361DisCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A386DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A386DisPieNor), 4, 0));
      }
      else
      {
         A386DisPieNor = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A386DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A386DisPieNor), 4, 0));
      }
      A253CliCodDis = A252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A253CliCodDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A253CliCodDis), 6, 0));
   }

   public void checkExtendedTable1IZ34( )
   {
      nIsDirty_34 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01IZ7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01IZ7_A407EmprNom[0] ;
      n407EmprNom = T01IZ7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T01IZ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01IZ8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(6);
      /* Using cursor T01IZ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n1122MaqCodDis), A1122MaqCodDis});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1122MaqCodDis)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MaqDis", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCODDIS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(7);
      /* Using cursor T01IZ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A390DisTipCol) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo Colorante", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISTIPCOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(8);
      /* Using cursor T01IZ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n10887Cod_Idtx), A10887Cod_Idtx});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A10887Cod_Idtx)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INDITEX", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COD_IDTX");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A10888Dsc_Idtx = T01IZ11_A10888Dsc_Idtx[0] ;
      n10888Dsc_Idtx = T01IZ11_n10888Dsc_Idtx[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10888Dsc_Idtx", A10888Dsc_Idtx);
      pr_default.close(9);
      nIsDirty_34 = (short)(1) ;
      GXt_char1 = A12116DisTipCD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int3[0] = A390DisTipCol ;
      GXv_char2[0] = GXt_char1 ;
      new app.pfcoldsc(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_char2) ;
      tdispol_impl.this.A396EmprCod = GXv_char4[0] ;
      tdispol_impl.this.A390DisTipCol = GXv_int3[0] ;
      tdispol_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
      A12116DisTipCD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12116DisTipCD", A12116DisTipCD);
      nIsDirty_34 = (short)(1) ;
      GXt_char1 = A12115DisArtTipD ;
      GXv_char4[0] = GXt_char1 ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A352DisArtTip, GXv_char4) ;
      tdispol_impl.this.GXt_char1 = GXv_char4[0] ;
      A12115DisArtTipD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12115DisArtTipD", A12115DisArtTipD);
      nIsDirty_34 = (short)(1) ;
      GXt_char1 = A475FindCol ;
      GXv_char4[0] = GXt_char1 ;
      new app.pedidos.dis_findcol_validate(remoteHandle, context).execute( A396EmprCod, A252CliCod, A335DisArtCod, A362DisColNom, A363DisColNum, A390DisTipCol, GXv_char4) ;
      tdispol_impl.this.GXt_char1 = GXv_char4[0] ;
      A475FindCol = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A475FindCol", A475FindCol);
      nIsDirty_34 = (short)(1) ;
      A399EmprCodDis = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A399EmprCodDis", A399EmprCodDis);
      if ( ! ( ( GXutil.strcmp(A757PriCod, "0") == 0 ) || ( GXutil.strcmp(A757PriCod, "1") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Prioridad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = chkPriCod.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01IZ13 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A387DisPiePie = T01IZ13_A387DisPiePie[0] ;
         n387DisPiePie = T01IZ13_n387DisPiePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
      }
      else
      {
         nIsDirty_34 = (short)(1) ;
         A387DisPiePie = (short)(0) ;
         n387DisPiePie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
      }
      pr_default.close(10);
      /* Using cursor T01IZ15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         A379DisPie = T01IZ15_A379DisPie[0] ;
         n379DisPie = T01IZ15_n379DisPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A379DisPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A379DisPie), 4, 0));
      }
      else
      {
         nIsDirty_34 = (short)(1) ;
         A379DisPie = (short)(0) ;
         n379DisPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A379DisPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A379DisPie), 4, 0));
      }
      pr_default.close(11);
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
      {
         nIsDirty_34 = (short)(1) ;
         A391DisUni = getDisUni0( A396EmprCod, A361DisCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A391DisUni", GXutil.ltrimstr( A391DisUni, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 )
         {
            nIsDirty_34 = (short)(1) ;
            A391DisUni = getDisUni1( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A391DisUni", GXutil.ltrimstr( A391DisUni, 9, 2));
         }
         else
         {
            nIsDirty_34 = (short)(1) ;
            A391DisUni = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A391DisUni", GXutil.ltrimstr( A391DisUni, 9, 2));
         }
      }
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         nIsDirty_34 = (short)(1) ;
         A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            nIsDirty_34 = (short)(1) ;
            A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         }
         else
         {
            nIsDirty_34 = (short)(1) ;
            A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         }
      }
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         nIsDirty_34 = (short)(1) ;
         A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            nIsDirty_34 = (short)(1) ;
            A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         }
         else
         {
            nIsDirty_34 = (short)(1) ;
            A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         }
      }
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         nIsDirty_34 = (short)(1) ;
         A386DisPieNor = (short)(getDisPieNor0( A396EmprCod, A361DisCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A386DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A386DisPieNor), 4, 0));
      }
      else
      {
         nIsDirty_34 = (short)(1) ;
         A386DisPieNor = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A386DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A386DisPieNor), 4, 0));
      }
      nIsDirty_34 = (short)(1) ;
      A253CliCodDis = A252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A253CliCodDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A253CliCodDis), 6, 0));
      if ( ! ( ( GXutil.strcmp(A338DisArtEnc, "S") == 0 ) || ( GXutil.strcmp(A338DisArtEnc, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Encolar Orillos", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "DISARTENC");
         AnyError = (short)(1) ;
         GX_FocusControl = chkDisArtEnc.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A336DisArtCor, "S") == 0 ) || ( GXutil.strcmp(A336DisArtCor, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Cortar Orillos", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "DISARTCOR");
         AnyError = (short)(1) ;
         GX_FocusControl = chkDisArtCor.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A341DisArtOpe, "SI") == 0 ) || ( GXutil.strcmp(A341DisArtOpe, "NO") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Operacion Especial", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "DISARTOPE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisArtOpe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( ( A359DisArtUrg >= 0 ) && ( A359DisArtUrg <= 9 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Urgencia", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "DISARTURG");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisArtUrg_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A365DisDes, "S") == 0 ) || ( GXutil.strcmp(A365DisDes, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Desglose", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "DISDES");
         AnyError = (short)(1) ;
         GX_FocusControl = chkDisDes.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A3306DisFac, "S") == 0 ) || ( GXutil.strcmp(A3306DisFac, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Hdr a Facturar", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "DISFAC");
         AnyError = (short)(1) ;
         GX_FocusControl = chkDisFac.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A2926DisPla, "S") == 0 ) || ( GXutil.strcmp(A2926DisPla, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tipo, valor S o N", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "DISPLA");
         AnyError = (short)(1) ;
         GX_FocusControl = chkDisPla.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A4014DisTin, "S") == 0 ) || ( GXutil.strcmp(A4014DisTin, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tintar ?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "DISTIN");
         AnyError = (short)(1) ;
         GX_FocusControl = chkDisTin.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1IZ34( )
   {
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
      pr_default.close(11);
   }

   public void enableDisable( )
   {
   }

   public void gxload_20( String A396EmprCod )
   {
      /* Using cursor T01IZ19 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01IZ19_A407EmprNom[0] ;
      n407EmprNom = T01IZ19_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_21( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01IZ20 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01IZ20_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_22( String A396EmprCod ,
                          String A1122MaqCodDis )
   {
      /* Using cursor T01IZ21 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n1122MaqCodDis), A1122MaqCodDis});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1122MaqCodDis)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MaqDis", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCODDIS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
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

   public void gxload_23( String A396EmprCod ,
                          byte A390DisTipCol )
   {
      /* Using cursor T01IZ22 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A390DisTipCol) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo Colorante", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISTIPCOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_24( String A396EmprCod ,
                          String A10887Cod_Idtx )
   {
      /* Using cursor T01IZ23 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n10887Cod_Idtx), A10887Cod_Idtx});
      if ( (pr_default.getStatus(17) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A10887Cod_Idtx)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INDITEX", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COD_IDTX");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A10888Dsc_Idtx = T01IZ23_A10888Dsc_Idtx[0] ;
      n10888Dsc_Idtx = T01IZ23_n10888Dsc_Idtx[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10888Dsc_Idtx", A10888Dsc_Idtx);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10888Dsc_Idtx))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_25( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01IZ25 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         A387DisPiePie = T01IZ25_A387DisPiePie[0] ;
         n387DisPiePie = T01IZ25_n387DisPiePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
      }
      else
      {
         A387DisPiePie = (short)(0) ;
         n387DisPiePie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A387DisPiePie, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_26( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01IZ27 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A379DisPie = T01IZ27_A379DisPie[0] ;
         n379DisPie = T01IZ27_n379DisPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A379DisPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A379DisPie), 4, 0));
      }
      else
      {
         A379DisPie = (short)(0) ;
         n379DisPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A379DisPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A379DisPie), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A379DisPie, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void getKey1IZ34( )
   {
      /* Using cursor T01IZ28 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      else
      {
         RcdFound34 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01IZ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1IZ34( 19) ;
         RcdFound34 = (short)(1) ;
         A5025DisGraCob = T01IZ6_A5025DisGraCob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5025DisGraCob", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5025DisGraCob), 2, 0));
         A396EmprCod = T01IZ6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01IZ6_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1122MaqCodDis = T01IZ6_A1122MaqCodDis[0] ;
         n1122MaqCodDis = T01IZ6_n1122MaqCodDis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1122MaqCodDis", A1122MaqCodDis);
         A390DisTipCol = T01IZ6_A390DisTipCol[0] ;
         n390DisTipCol = T01IZ6_n390DisTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
         A10887Cod_Idtx = T01IZ6_A10887Cod_Idtx[0] ;
         n10887Cod_Idtx = T01IZ6_n10887Cod_Idtx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10887Cod_Idtx", A10887Cod_Idtx);
         A361DisCod = T01IZ6_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A757PriCod = T01IZ6_A757PriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
         A360DisCliNum = T01IZ6_A360DisCliNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A360DisCliNum", A360DisCliNum);
         A370DisFecCli = T01IZ6_A370DisFecCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
         A335DisArtCod = T01IZ6_A335DisArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         A369DisFec = T01IZ6_A369DisFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
         A371DisFecEnt = T01IZ6_A371DisFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
         A337DisArtDsc = T01IZ6_A337DisArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
         A340DisArtMat = T01IZ6_A340DisArtMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A340DisArtMat", A340DisArtMat);
         A339DisArtLar = T01IZ6_A339DisArtLar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A339DisArtLar", A339DisArtLar);
         A351DisArtSua = T01IZ6_A351DisArtSua[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A351DisArtSua", A351DisArtSua);
         A333DisArtAca = T01IZ6_A333DisArtAca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A333DisArtAca", A333DisArtAca);
         A343DisArtPle = T01IZ6_A343DisArtPle[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A343DisArtPle", A343DisArtPle);
         A352DisArtTip = T01IZ6_A352DisArtTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A352DisArtTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A352DisArtTip), 4, 0));
         A338DisArtEnc = T01IZ6_A338DisArtEnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A338DisArtEnc", A338DisArtEnc);
         A336DisArtCor = T01IZ6_A336DisArtCor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A336DisArtCor", A336DisArtCor);
         A341DisArtOpe = T01IZ6_A341DisArtOpe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A341DisArtOpe", A341DisArtOpe);
         A353DisArtTr1 = T01IZ6_A353DisArtTr1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A353DisArtTr1", A353DisArtTr1);
         A344DisArtPt1 = T01IZ6_A344DisArtPt1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A344DisArtPt1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A344DisArtPt1), 3, 0));
         A354DisArtTr2 = T01IZ6_A354DisArtTr2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A354DisArtTr2", A354DisArtTr2);
         A345DisArtPt2 = T01IZ6_A345DisArtPt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A345DisArtPt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A345DisArtPt2), 3, 0));
         A355DisArtTr3 = T01IZ6_A355DisArtTr3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A355DisArtTr3", A355DisArtTr3);
         A346DisArtPt3 = T01IZ6_A346DisArtPt3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A346DisArtPt3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A346DisArtPt3), 3, 0));
         A350DisArtRdt = T01IZ6_A350DisArtRdt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A350DisArtRdt", GXutil.ltrimstr( A350DisArtRdt, 6, 2));
         A359DisArtUrg = T01IZ6_A359DisArtUrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A359DisArtUrg", GXutil.str( A359DisArtUrg, 1, 0));
         A356DisArtUr1 = T01IZ6_A356DisArtUr1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A356DisArtUr1", A356DisArtUr1);
         A347DisArtPu1 = T01IZ6_A347DisArtPu1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A347DisArtPu1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A347DisArtPu1), 3, 0));
         A357DisArtUr2 = T01IZ6_A357DisArtUr2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A357DisArtUr2", A357DisArtUr2);
         A348DisArtPu2 = T01IZ6_A348DisArtPu2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A348DisArtPu2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A348DisArtPu2), 3, 0));
         A358DisArtUr3 = T01IZ6_A358DisArtUr3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A358DisArtUr3", A358DisArtUr3);
         A349DisArtPu3 = T01IZ6_A349DisArtPu3[0] ;
         n349DisArtPu3 = T01IZ6_n349DisArtPu3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A349DisArtPu3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A349DisArtPu3), 3, 0));
         A342DisArtPes = T01IZ6_A342DisArtPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A342DisArtPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A342DisArtPes), 4, 0));
         A334DisArtAnh = T01IZ6_A334DisArtAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A334DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A334DisArtAnh), 3, 0));
         A1231DisArtAn1 = T01IZ6_A1231DisArtAn1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1231DisArtAn1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1231DisArtAn1), 3, 0));
         A1232DisArtAcb = T01IZ6_A1232DisArtAcb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1232DisArtAcb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1232DisArtAcb), 3, 0));
         A1233DisArtAc2 = T01IZ6_A1233DisArtAc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1233DisArtAc2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1233DisArtAc2), 3, 0));
         A367DisEst = T01IZ6_A367DisEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367DisEst", GXutil.str( A367DisEst, 1, 0));
         A388DisPreKgm = T01IZ6_A388DisPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
         A389DisPreMtr = T01IZ6_A389DisPreMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
         A383DisPieLan = T01IZ6_A383DisPieLan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A383DisPieLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A383DisPieLan), 4, 0));
         A372DisKgmLan = T01IZ6_A372DisKgmLan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A372DisKgmLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A372DisKgmLan), 4, 0));
         A373DisMtrLan = T01IZ6_A373DisMtrLan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A373DisMtrLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A373DisMtrLan), 4, 0));
         A362DisColNom = T01IZ6_A362DisColNom[0] ;
         n362DisColNom = T01IZ6_n362DisColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
         A363DisColNum = T01IZ6_A363DisColNum[0] ;
         n363DisColNum = T01IZ6_n363DisColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
         A1195DisNomCli = T01IZ6_A1195DisNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1195DisNomCli", A1195DisNomCli);
         A1196DisNumCli = T01IZ6_A1196DisNumCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1196DisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1196DisNumCli), 6, 0));
         A1197DisEncCom = T01IZ6_A1197DisEncCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1197DisEncCom", GXutil.ltrimstr( A1197DisEncCom, 6, 2));
         A1198DisEncAnh = T01IZ6_A1198DisEncAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1198DisEncAnh", GXutil.ltrimstr( A1198DisEncAnh, 6, 2));
         A365DisDes = T01IZ6_A365DisDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
         A374DisNumPie = T01IZ6_A374DisNumPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A374DisNumPie), 4, 0));
         A375DisNumUni = T01IZ6_A375DisNumUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A375DisNumUni", GXutil.ltrimstr( A375DisNumUni, 9, 2));
         A392DisUniMed = T01IZ6_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A1225DisGraCru = T01IZ6_A1225DisGraCru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1225DisGraCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1225DisGraCru), 4, 0));
         A1430DisLoc = T01IZ6_A1430DisLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1430DisLoc", A1430DisLoc);
         A1502DisPart = T01IZ6_A1502DisPart[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1502DisPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1502DisPart), 4, 0));
         A1906DisGraAca = T01IZ6_A1906DisGraAca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1906DisGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1906DisGraAca), 4, 0));
         A1907DisRdoN = T01IZ6_A1907DisRdoN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1907DisRdoN", GXutil.ltrimstr( A1907DisRdoN, 6, 2));
         A1908DisRdoA = T01IZ6_A1908DisRdoA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1908DisRdoA", GXutil.ltrimstr( A1908DisRdoA, 6, 2));
         A2009DisTipDis = T01IZ6_A2009DisTipDis[0] ;
         n2009DisTipDis = T01IZ6_n2009DisTipDis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2009DisTipDis", A2009DisTipDis);
         A2831DisNumLot = T01IZ6_A2831DisNumLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2831DisNumLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2831DisNumLot), 8, 0));
         A2832DisKgsLot = T01IZ6_A2832DisKgsLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2832DisKgsLot", GXutil.ltrimstr( A2832DisKgsLot, 9, 2));
         A2833DisMtrLot = T01IZ6_A2833DisMtrLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2833DisMtrLot", GXutil.ltrimstr( A2833DisMtrLot, 9, 2));
         A2835DisPle2 = T01IZ6_A2835DisPle2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2835DisPle2", A2835DisPle2);
         A3127DisNumCor = T01IZ6_A3127DisNumCor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3127DisNumCor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3127DisNumCor), 4, 0));
         A3128DisAncSal1 = T01IZ6_A3128DisAncSal1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3128DisAncSal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3128DisAncSal1), 4, 0));
         A3129DisAncSal2 = T01IZ6_A3129DisAncSal2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3129DisAncSal2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3129DisAncSal2), 4, 0));
         A3130DisAncSal3 = T01IZ6_A3130DisAncSal3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3130DisAncSal3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3130DisAncSal3), 4, 0));
         A3131DisGraAca2 = T01IZ6_A3131DisGraAca2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3131DisGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3131DisGraAca2), 4, 0));
         A3132DisGraCru2 = T01IZ6_A3132DisGraCru2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3132DisGraCru2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3132DisGraCru2), 4, 0));
         A3306DisFac = T01IZ6_A3306DisFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3306DisFac", A3306DisFac);
         A3307DisManCod1 = T01IZ6_A3307DisManCod1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3307DisManCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3307DisManCod1), 4, 0));
         A3308DisManCod2 = T01IZ6_A3308DisManCod2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3308DisManCod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3308DisManCod2), 4, 0));
         A3309DisNumTon = T01IZ6_A3309DisNumTon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3309DisNumTon", A3309DisNumTon);
         A4614DisMdlCod = T01IZ6_A4614DisMdlCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4614DisMdlCod", A4614DisMdlCod);
         A4615DisTam = T01IZ6_A4615DisTam[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4615DisTam", A4615DisTam);
         A4293DisNPzas = T01IZ6_A4293DisNPzas[0] ;
         n4293DisNPzas = T01IZ6_n4293DisNPzas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4293DisNPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4293DisNPzas), 6, 0));
         A4616DisHorEnt = T01IZ6_A4616DisHorEnt[0] ;
         n4616DisHorEnt = T01IZ6_n4616DisHorEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4616DisHorEnt", localUtil.ttoc( A4616DisHorEnt, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4294DisNPzasL = T01IZ6_A4294DisNPzasL[0] ;
         n4294DisNPzasL = T01IZ6_n4294DisNPzasL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4294DisNPzasL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4294DisNPzasL), 6, 0));
         A4617DisHorReg = T01IZ6_A4617DisHorReg[0] ;
         n4617DisHorReg = T01IZ6_n4617DisHorReg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4617DisHorReg", localUtil.ttoc( A4617DisHorReg, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5252DisAcc = T01IZ6_A5252DisAcc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5252DisAcc", A5252DisAcc);
         A5366DisAntp = T01IZ6_A5366DisAntp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5366DisAntp", A5366DisAntp);
         A5405DisAntpT = T01IZ6_A5405DisAntpT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5405DisAntpT", A5405DisAntpT);
         A2926DisPla = T01IZ6_A2926DisPla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2926DisPla", A2926DisPla);
         A4013DisEnv = T01IZ6_A4013DisEnv[0] ;
         n4013DisEnv = T01IZ6_n4013DisEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4013DisEnv", GXutil.str( A4013DisEnv, 1, 0));
         A366DisEnt = T01IZ6_A366DisEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A366DisEnt", A366DisEnt);
         A4477DisAcaBak = T01IZ6_A4477DisAcaBak[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4477DisAcaBak", A4477DisAcaBak);
         A5350DisObsAnc = T01IZ6_A5350DisObsAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5350DisObsAnc", A5350DisObsAnc);
         A5349DisObsGrm = T01IZ6_A5349DisObsGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5349DisObsGrm", A5349DisObsGrm);
         A4813DisEncCli = T01IZ6_A4813DisEncCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4813DisEncCli", A4813DisEncCli);
         A4720DisDishCod = T01IZ6_A4720DisDishCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4720DisDishCod", A4720DisDishCod);
         A2743DisNumTex1 = T01IZ6_A2743DisNumTex1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2743DisNumTex1", GXutil.str( A2743DisNumTex1, 1, 0));
         A5032DisEstTip = T01IZ6_A5032DisEstTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5032DisEstTip", A5032DisEstTip);
         A4014DisTin = T01IZ6_A4014DisTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4014DisTin", A4014DisTin);
         A5290DisTipCor = T01IZ6_A5290DisTipCor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5290DisTipCor", A5290DisTipCor);
         A4471DisCruEnr = T01IZ6_A4471DisCruEnr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4471DisCruEnr", A4471DisCruEnr);
         A4479DisAcaMar = T01IZ6_A4479DisAcaMar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4479DisAcaMar", A4479DisAcaMar);
         A1052DisObs = T01IZ6_A1052DisObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1052DisObs", A1052DisObs);
         A1968DisRes = T01IZ6_A1968DisRes[0] ;
         n1968DisRes = T01IZ6_n1968DisRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1968DisRes", A1968DisRes);
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1IZ34( ) ;
         if ( AnyError == 1 )
         {
            RcdFound34 = (short)(0) ;
            initializeNonKey1IZ34( ) ;
         }
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound34 = (short)(0) ;
         initializeNonKey1IZ34( ) ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1IZ34( ) ;
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
      /* Using cursor T01IZ29 */
      pr_default.execute(21, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         while ( (pr_default.getStatus(21) != 101) && ( ( GXutil.strcmp(T01IZ29_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01IZ29_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IZ29_A361DisCod[0] < A361DisCod ) ) )
         {
            pr_default.readNext(21);
         }
         if ( (pr_default.getStatus(21) != 101) && ( ( GXutil.strcmp(T01IZ29_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01IZ29_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IZ29_A361DisCod[0] > A361DisCod ) ) )
         {
            A396EmprCod = T01IZ29_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = T01IZ29_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(21);
   }

   public void move_previous( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T01IZ30 */
      pr_default.execute(22, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         while ( (pr_default.getStatus(22) != 101) && ( ( GXutil.strcmp(T01IZ30_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01IZ30_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IZ30_A361DisCod[0] > A361DisCod ) ) )
         {
            pr_default.readNext(22);
         }
         if ( (pr_default.getStatus(22) != 101) && ( ( GXutil.strcmp(T01IZ30_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01IZ30_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01IZ30_A361DisCod[0] < A361DisCod ) ) )
         {
            A396EmprCod = T01IZ30_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = T01IZ30_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(22);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1IZ34( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1IZ34( ) ;
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
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A361DisCod = Z361DisCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1IZ34( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
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
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1IZ34( ) ;
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
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1IZ34( ) ;
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
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = Z361DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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
      getKey1IZ34( ) ;
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
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = Z361DisCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdispol");
      GX_FocusControl = chkPriCod.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1IZ0( ) ;
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
      scanStart1IZ34( ) ;
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
      scanEnd1IZ34( ) ;
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
      scanStart1IZ34( ) ;
      if ( RcdFound34 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound34 != 0 )
         {
            scanNext1IZ34( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = chkPriCod.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1IZ34( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1IZ34( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01IZ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z757PriCod, T01IZ5_A757PriCod[0]) != 0 ) || ( GXutil.strcmp(Z360DisCliNum, T01IZ5_A360DisCliNum[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z370DisFecCli), GXutil.resetTime(T01IZ5_A370DisFecCli[0])) ) || ( GXutil.strcmp(Z335DisArtCod, T01IZ5_A335DisArtCod[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z369DisFec), GXutil.resetTime(T01IZ5_A369DisFec[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z371DisFecEnt), GXutil.resetTime(T01IZ5_A371DisFecEnt[0])) ) || ( GXutil.strcmp(Z337DisArtDsc, T01IZ5_A337DisArtDsc[0]) != 0 ) || ( GXutil.strcmp(Z340DisArtMat, T01IZ5_A340DisArtMat[0]) != 0 ) || ( GXutil.strcmp(Z339DisArtLar, T01IZ5_A339DisArtLar[0]) != 0 ) || ( GXutil.strcmp(Z351DisArtSua, T01IZ5_A351DisArtSua[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z333DisArtAca, T01IZ5_A333DisArtAca[0]) != 0 ) || ( GXutil.strcmp(Z343DisArtPle, T01IZ5_A343DisArtPle[0]) != 0 ) || ( Z352DisArtTip != T01IZ5_A352DisArtTip[0] ) || ( GXutil.strcmp(Z338DisArtEnc, T01IZ5_A338DisArtEnc[0]) != 0 ) || ( GXutil.strcmp(Z336DisArtCor, T01IZ5_A336DisArtCor[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z341DisArtOpe, T01IZ5_A341DisArtOpe[0]) != 0 ) || ( GXutil.strcmp(Z353DisArtTr1, T01IZ5_A353DisArtTr1[0]) != 0 ) || ( Z344DisArtPt1 != T01IZ5_A344DisArtPt1[0] ) || ( GXutil.strcmp(Z354DisArtTr2, T01IZ5_A354DisArtTr2[0]) != 0 ) || ( Z345DisArtPt2 != T01IZ5_A345DisArtPt2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z355DisArtTr3, T01IZ5_A355DisArtTr3[0]) != 0 ) || ( Z346DisArtPt3 != T01IZ5_A346DisArtPt3[0] ) || ( DecimalUtil.compareTo(Z350DisArtRdt, T01IZ5_A350DisArtRdt[0]) != 0 ) || ( Z359DisArtUrg != T01IZ5_A359DisArtUrg[0] ) || ( GXutil.strcmp(Z356DisArtUr1, T01IZ5_A356DisArtUr1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z347DisArtPu1 != T01IZ5_A347DisArtPu1[0] ) || ( GXutil.strcmp(Z357DisArtUr2, T01IZ5_A357DisArtUr2[0]) != 0 ) || ( Z348DisArtPu2 != T01IZ5_A348DisArtPu2[0] ) || ( GXutil.strcmp(Z358DisArtUr3, T01IZ5_A358DisArtUr3[0]) != 0 ) || ( Z349DisArtPu3 != T01IZ5_A349DisArtPu3[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z342DisArtPes != T01IZ5_A342DisArtPes[0] ) || ( Z334DisArtAnh != T01IZ5_A334DisArtAnh[0] ) || ( Z1231DisArtAn1 != T01IZ5_A1231DisArtAn1[0] ) || ( Z1232DisArtAcb != T01IZ5_A1232DisArtAcb[0] ) || ( Z1233DisArtAc2 != T01IZ5_A1233DisArtAc2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z367DisEst != T01IZ5_A367DisEst[0] ) || ( DecimalUtil.compareTo(Z388DisPreKgm, T01IZ5_A388DisPreKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z389DisPreMtr, T01IZ5_A389DisPreMtr[0]) != 0 ) || ( Z383DisPieLan != T01IZ5_A383DisPieLan[0] ) || ( Z372DisKgmLan != T01IZ5_A372DisKgmLan[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z373DisMtrLan != T01IZ5_A373DisMtrLan[0] ) || ( GXutil.strcmp(Z362DisColNom, T01IZ5_A362DisColNom[0]) != 0 ) || ( Z363DisColNum != T01IZ5_A363DisColNum[0] ) || ( GXutil.strcmp(Z1195DisNomCli, T01IZ5_A1195DisNomCli[0]) != 0 ) || ( Z1196DisNumCli != T01IZ5_A1196DisNumCli[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z1197DisEncCom, T01IZ5_A1197DisEncCom[0]) != 0 ) || ( DecimalUtil.compareTo(Z1198DisEncAnh, T01IZ5_A1198DisEncAnh[0]) != 0 ) || ( GXutil.strcmp(Z365DisDes, T01IZ5_A365DisDes[0]) != 0 ) || ( Z374DisNumPie != T01IZ5_A374DisNumPie[0] ) || ( DecimalUtil.compareTo(Z375DisNumUni, T01IZ5_A375DisNumUni[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z392DisUniMed, T01IZ5_A392DisUniMed[0]) != 0 ) || ( Z1225DisGraCru != T01IZ5_A1225DisGraCru[0] ) || ( GXutil.strcmp(Z1430DisLoc, T01IZ5_A1430DisLoc[0]) != 0 ) || ( Z1502DisPart != T01IZ5_A1502DisPart[0] ) || ( Z1906DisGraAca != T01IZ5_A1906DisGraAca[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z1907DisRdoN, T01IZ5_A1907DisRdoN[0]) != 0 ) || ( DecimalUtil.compareTo(Z1908DisRdoA, T01IZ5_A1908DisRdoA[0]) != 0 ) || ( GXutil.strcmp(Z2009DisTipDis, T01IZ5_A2009DisTipDis[0]) != 0 ) || ( Z2831DisNumLot != T01IZ5_A2831DisNumLot[0] ) || ( DecimalUtil.compareTo(Z2832DisKgsLot, T01IZ5_A2832DisKgsLot[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z2833DisMtrLot, T01IZ5_A2833DisMtrLot[0]) != 0 ) || ( GXutil.strcmp(Z2835DisPle2, T01IZ5_A2835DisPle2[0]) != 0 ) || ( Z3127DisNumCor != T01IZ5_A3127DisNumCor[0] ) || ( Z3128DisAncSal1 != T01IZ5_A3128DisAncSal1[0] ) || ( Z3129DisAncSal2 != T01IZ5_A3129DisAncSal2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3130DisAncSal3 != T01IZ5_A3130DisAncSal3[0] ) || ( Z3131DisGraAca2 != T01IZ5_A3131DisGraAca2[0] ) || ( Z3132DisGraCru2 != T01IZ5_A3132DisGraCru2[0] ) || ( GXutil.strcmp(Z3306DisFac, T01IZ5_A3306DisFac[0]) != 0 ) || ( Z3307DisManCod1 != T01IZ5_A3307DisManCod1[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3308DisManCod2 != T01IZ5_A3308DisManCod2[0] ) || ( GXutil.strcmp(Z3309DisNumTon, T01IZ5_A3309DisNumTon[0]) != 0 ) || ( GXutil.strcmp(Z4614DisMdlCod, T01IZ5_A4614DisMdlCod[0]) != 0 ) || ( GXutil.strcmp(Z4615DisTam, T01IZ5_A4615DisTam[0]) != 0 ) || ( Z4293DisNPzas != T01IZ5_A4293DisNPzas[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z4616DisHorEnt, T01IZ5_A4616DisHorEnt[0]) ) || ( Z4294DisNPzasL != T01IZ5_A4294DisNPzasL[0] ) || !( GXutil.dateCompare(Z4617DisHorReg, T01IZ5_A4617DisHorReg[0]) ) || ( GXutil.strcmp(Z5252DisAcc, T01IZ5_A5252DisAcc[0]) != 0 ) || ( GXutil.strcmp(Z5366DisAntp, T01IZ5_A5366DisAntp[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5405DisAntpT, T01IZ5_A5405DisAntpT[0]) != 0 ) || ( GXutil.strcmp(Z2926DisPla, T01IZ5_A2926DisPla[0]) != 0 ) || ( Z4013DisEnv != T01IZ5_A4013DisEnv[0] ) || ( GXutil.strcmp(Z366DisEnt, T01IZ5_A366DisEnt[0]) != 0 ) || ( GXutil.strcmp(Z4477DisAcaBak, T01IZ5_A4477DisAcaBak[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5350DisObsAnc, T01IZ5_A5350DisObsAnc[0]) != 0 ) || ( GXutil.strcmp(Z5349DisObsGrm, T01IZ5_A5349DisObsGrm[0]) != 0 ) || ( GXutil.strcmp(Z4813DisEncCli, T01IZ5_A4813DisEncCli[0]) != 0 ) || ( GXutil.strcmp(Z4720DisDishCod, T01IZ5_A4720DisDishCod[0]) != 0 ) || ( Z2743DisNumTex1 != T01IZ5_A2743DisNumTex1[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5032DisEstTip, T01IZ5_A5032DisEstTip[0]) != 0 ) || ( GXutil.strcmp(Z4014DisTin, T01IZ5_A4014DisTin[0]) != 0 ) || ( GXutil.strcmp(Z5290DisTipCor, T01IZ5_A5290DisTipCor[0]) != 0 ) || ( GXutil.strcmp(Z4471DisCruEnr, T01IZ5_A4471DisCruEnr[0]) != 0 ) || ( GXutil.strcmp(Z4479DisAcaMar, T01IZ5_A4479DisAcaMar[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1052DisObs, T01IZ5_A1052DisObs[0]) != 0 ) || ( GXutil.strcmp(Z1968DisRes, T01IZ5_A1968DisRes[0]) != 0 ) || ( Z5025DisGraCob != T01IZ5_A5025DisGraCob[0] ) || ( Z252CliCod != T01IZ5_A252CliCod[0] ) || ( GXutil.strcmp(Z1122MaqCodDis, T01IZ5_A1122MaqCodDis[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z390DisTipCol != T01IZ5_A390DisTipCol[0] ) || ( GXutil.strcmp(Z10887Cod_Idtx, T01IZ5_A10887Cod_Idtx[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z757PriCod, T01IZ5_A757PriCod[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"PriCod");
               GXutil.writeLogRaw("Old: ",Z757PriCod);
               GXutil.writeLogRaw("Current: ",T01IZ5_A757PriCod[0]);
            }
            if ( GXutil.strcmp(Z360DisCliNum, T01IZ5_A360DisCliNum[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisCliNum");
               GXutil.writeLogRaw("Old: ",Z360DisCliNum);
               GXutil.writeLogRaw("Current: ",T01IZ5_A360DisCliNum[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z370DisFecCli), GXutil.resetTime(T01IZ5_A370DisFecCli[0])) ) )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisFecCli");
               GXutil.writeLogRaw("Old: ",Z370DisFecCli);
               GXutil.writeLogRaw("Current: ",T01IZ5_A370DisFecCli[0]);
            }
            if ( GXutil.strcmp(Z335DisArtCod, T01IZ5_A335DisArtCod[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtCod");
               GXutil.writeLogRaw("Old: ",Z335DisArtCod);
               GXutil.writeLogRaw("Current: ",T01IZ5_A335DisArtCod[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z369DisFec), GXutil.resetTime(T01IZ5_A369DisFec[0])) ) )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisFec");
               GXutil.writeLogRaw("Old: ",Z369DisFec);
               GXutil.writeLogRaw("Current: ",T01IZ5_A369DisFec[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z371DisFecEnt), GXutil.resetTime(T01IZ5_A371DisFecEnt[0])) ) )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisFecEnt");
               GXutil.writeLogRaw("Old: ",Z371DisFecEnt);
               GXutil.writeLogRaw("Current: ",T01IZ5_A371DisFecEnt[0]);
            }
            if ( GXutil.strcmp(Z337DisArtDsc, T01IZ5_A337DisArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtDsc");
               GXutil.writeLogRaw("Old: ",Z337DisArtDsc);
               GXutil.writeLogRaw("Current: ",T01IZ5_A337DisArtDsc[0]);
            }
            if ( GXutil.strcmp(Z340DisArtMat, T01IZ5_A340DisArtMat[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtMat");
               GXutil.writeLogRaw("Old: ",Z340DisArtMat);
               GXutil.writeLogRaw("Current: ",T01IZ5_A340DisArtMat[0]);
            }
            if ( GXutil.strcmp(Z339DisArtLar, T01IZ5_A339DisArtLar[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtLar");
               GXutil.writeLogRaw("Old: ",Z339DisArtLar);
               GXutil.writeLogRaw("Current: ",T01IZ5_A339DisArtLar[0]);
            }
            if ( GXutil.strcmp(Z351DisArtSua, T01IZ5_A351DisArtSua[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtSua");
               GXutil.writeLogRaw("Old: ",Z351DisArtSua);
               GXutil.writeLogRaw("Current: ",T01IZ5_A351DisArtSua[0]);
            }
            if ( GXutil.strcmp(Z333DisArtAca, T01IZ5_A333DisArtAca[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtAca");
               GXutil.writeLogRaw("Old: ",Z333DisArtAca);
               GXutil.writeLogRaw("Current: ",T01IZ5_A333DisArtAca[0]);
            }
            if ( GXutil.strcmp(Z343DisArtPle, T01IZ5_A343DisArtPle[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtPle");
               GXutil.writeLogRaw("Old: ",Z343DisArtPle);
               GXutil.writeLogRaw("Current: ",T01IZ5_A343DisArtPle[0]);
            }
            if ( Z352DisArtTip != T01IZ5_A352DisArtTip[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtTip");
               GXutil.writeLogRaw("Old: ",Z352DisArtTip);
               GXutil.writeLogRaw("Current: ",T01IZ5_A352DisArtTip[0]);
            }
            if ( GXutil.strcmp(Z338DisArtEnc, T01IZ5_A338DisArtEnc[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtEnc");
               GXutil.writeLogRaw("Old: ",Z338DisArtEnc);
               GXutil.writeLogRaw("Current: ",T01IZ5_A338DisArtEnc[0]);
            }
            if ( GXutil.strcmp(Z336DisArtCor, T01IZ5_A336DisArtCor[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtCor");
               GXutil.writeLogRaw("Old: ",Z336DisArtCor);
               GXutil.writeLogRaw("Current: ",T01IZ5_A336DisArtCor[0]);
            }
            if ( GXutil.strcmp(Z341DisArtOpe, T01IZ5_A341DisArtOpe[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtOpe");
               GXutil.writeLogRaw("Old: ",Z341DisArtOpe);
               GXutil.writeLogRaw("Current: ",T01IZ5_A341DisArtOpe[0]);
            }
            if ( GXutil.strcmp(Z353DisArtTr1, T01IZ5_A353DisArtTr1[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtTr1");
               GXutil.writeLogRaw("Old: ",Z353DisArtTr1);
               GXutil.writeLogRaw("Current: ",T01IZ5_A353DisArtTr1[0]);
            }
            if ( Z344DisArtPt1 != T01IZ5_A344DisArtPt1[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtPt1");
               GXutil.writeLogRaw("Old: ",Z344DisArtPt1);
               GXutil.writeLogRaw("Current: ",T01IZ5_A344DisArtPt1[0]);
            }
            if ( GXutil.strcmp(Z354DisArtTr2, T01IZ5_A354DisArtTr2[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtTr2");
               GXutil.writeLogRaw("Old: ",Z354DisArtTr2);
               GXutil.writeLogRaw("Current: ",T01IZ5_A354DisArtTr2[0]);
            }
            if ( Z345DisArtPt2 != T01IZ5_A345DisArtPt2[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtPt2");
               GXutil.writeLogRaw("Old: ",Z345DisArtPt2);
               GXutil.writeLogRaw("Current: ",T01IZ5_A345DisArtPt2[0]);
            }
            if ( GXutil.strcmp(Z355DisArtTr3, T01IZ5_A355DisArtTr3[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtTr3");
               GXutil.writeLogRaw("Old: ",Z355DisArtTr3);
               GXutil.writeLogRaw("Current: ",T01IZ5_A355DisArtTr3[0]);
            }
            if ( Z346DisArtPt3 != T01IZ5_A346DisArtPt3[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtPt3");
               GXutil.writeLogRaw("Old: ",Z346DisArtPt3);
               GXutil.writeLogRaw("Current: ",T01IZ5_A346DisArtPt3[0]);
            }
            if ( DecimalUtil.compareTo(Z350DisArtRdt, T01IZ5_A350DisArtRdt[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtRdt");
               GXutil.writeLogRaw("Old: ",Z350DisArtRdt);
               GXutil.writeLogRaw("Current: ",T01IZ5_A350DisArtRdt[0]);
            }
            if ( Z359DisArtUrg != T01IZ5_A359DisArtUrg[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtUrg");
               GXutil.writeLogRaw("Old: ",Z359DisArtUrg);
               GXutil.writeLogRaw("Current: ",T01IZ5_A359DisArtUrg[0]);
            }
            if ( GXutil.strcmp(Z356DisArtUr1, T01IZ5_A356DisArtUr1[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtUr1");
               GXutil.writeLogRaw("Old: ",Z356DisArtUr1);
               GXutil.writeLogRaw("Current: ",T01IZ5_A356DisArtUr1[0]);
            }
            if ( Z347DisArtPu1 != T01IZ5_A347DisArtPu1[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtPu1");
               GXutil.writeLogRaw("Old: ",Z347DisArtPu1);
               GXutil.writeLogRaw("Current: ",T01IZ5_A347DisArtPu1[0]);
            }
            if ( GXutil.strcmp(Z357DisArtUr2, T01IZ5_A357DisArtUr2[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtUr2");
               GXutil.writeLogRaw("Old: ",Z357DisArtUr2);
               GXutil.writeLogRaw("Current: ",T01IZ5_A357DisArtUr2[0]);
            }
            if ( Z348DisArtPu2 != T01IZ5_A348DisArtPu2[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtPu2");
               GXutil.writeLogRaw("Old: ",Z348DisArtPu2);
               GXutil.writeLogRaw("Current: ",T01IZ5_A348DisArtPu2[0]);
            }
            if ( GXutil.strcmp(Z358DisArtUr3, T01IZ5_A358DisArtUr3[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtUr3");
               GXutil.writeLogRaw("Old: ",Z358DisArtUr3);
               GXutil.writeLogRaw("Current: ",T01IZ5_A358DisArtUr3[0]);
            }
            if ( Z349DisArtPu3 != T01IZ5_A349DisArtPu3[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtPu3");
               GXutil.writeLogRaw("Old: ",Z349DisArtPu3);
               GXutil.writeLogRaw("Current: ",T01IZ5_A349DisArtPu3[0]);
            }
            if ( Z342DisArtPes != T01IZ5_A342DisArtPes[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtPes");
               GXutil.writeLogRaw("Old: ",Z342DisArtPes);
               GXutil.writeLogRaw("Current: ",T01IZ5_A342DisArtPes[0]);
            }
            if ( Z334DisArtAnh != T01IZ5_A334DisArtAnh[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtAnh");
               GXutil.writeLogRaw("Old: ",Z334DisArtAnh);
               GXutil.writeLogRaw("Current: ",T01IZ5_A334DisArtAnh[0]);
            }
            if ( Z1231DisArtAn1 != T01IZ5_A1231DisArtAn1[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtAn1");
               GXutil.writeLogRaw("Old: ",Z1231DisArtAn1);
               GXutil.writeLogRaw("Current: ",T01IZ5_A1231DisArtAn1[0]);
            }
            if ( Z1232DisArtAcb != T01IZ5_A1232DisArtAcb[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtAcb");
               GXutil.writeLogRaw("Old: ",Z1232DisArtAcb);
               GXutil.writeLogRaw("Current: ",T01IZ5_A1232DisArtAcb[0]);
            }
            if ( Z1233DisArtAc2 != T01IZ5_A1233DisArtAc2[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisArtAc2");
               GXutil.writeLogRaw("Old: ",Z1233DisArtAc2);
               GXutil.writeLogRaw("Current: ",T01IZ5_A1233DisArtAc2[0]);
            }
            if ( Z367DisEst != T01IZ5_A367DisEst[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisEst");
               GXutil.writeLogRaw("Old: ",Z367DisEst);
               GXutil.writeLogRaw("Current: ",T01IZ5_A367DisEst[0]);
            }
            if ( DecimalUtil.compareTo(Z388DisPreKgm, T01IZ5_A388DisPreKgm[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisPreKgm");
               GXutil.writeLogRaw("Old: ",Z388DisPreKgm);
               GXutil.writeLogRaw("Current: ",T01IZ5_A388DisPreKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z389DisPreMtr, T01IZ5_A389DisPreMtr[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisPreMtr");
               GXutil.writeLogRaw("Old: ",Z389DisPreMtr);
               GXutil.writeLogRaw("Current: ",T01IZ5_A389DisPreMtr[0]);
            }
            if ( Z383DisPieLan != T01IZ5_A383DisPieLan[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisPieLan");
               GXutil.writeLogRaw("Old: ",Z383DisPieLan);
               GXutil.writeLogRaw("Current: ",T01IZ5_A383DisPieLan[0]);
            }
            if ( Z372DisKgmLan != T01IZ5_A372DisKgmLan[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisKgmLan");
               GXutil.writeLogRaw("Old: ",Z372DisKgmLan);
               GXutil.writeLogRaw("Current: ",T01IZ5_A372DisKgmLan[0]);
            }
            if ( Z373DisMtrLan != T01IZ5_A373DisMtrLan[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisMtrLan");
               GXutil.writeLogRaw("Old: ",Z373DisMtrLan);
               GXutil.writeLogRaw("Current: ",T01IZ5_A373DisMtrLan[0]);
            }
            if ( GXutil.strcmp(Z362DisColNom, T01IZ5_A362DisColNom[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisColNom");
               GXutil.writeLogRaw("Old: ",Z362DisColNom);
               GXutil.writeLogRaw("Current: ",T01IZ5_A362DisColNom[0]);
            }
            if ( Z363DisColNum != T01IZ5_A363DisColNum[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisColNum");
               GXutil.writeLogRaw("Old: ",Z363DisColNum);
               GXutil.writeLogRaw("Current: ",T01IZ5_A363DisColNum[0]);
            }
            if ( GXutil.strcmp(Z1195DisNomCli, T01IZ5_A1195DisNomCli[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisNomCli");
               GXutil.writeLogRaw("Old: ",Z1195DisNomCli);
               GXutil.writeLogRaw("Current: ",T01IZ5_A1195DisNomCli[0]);
            }
            if ( Z1196DisNumCli != T01IZ5_A1196DisNumCli[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisNumCli");
               GXutil.writeLogRaw("Old: ",Z1196DisNumCli);
               GXutil.writeLogRaw("Current: ",T01IZ5_A1196DisNumCli[0]);
            }
            if ( DecimalUtil.compareTo(Z1197DisEncCom, T01IZ5_A1197DisEncCom[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisEncCom");
               GXutil.writeLogRaw("Old: ",Z1197DisEncCom);
               GXutil.writeLogRaw("Current: ",T01IZ5_A1197DisEncCom[0]);
            }
            if ( DecimalUtil.compareTo(Z1198DisEncAnh, T01IZ5_A1198DisEncAnh[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisEncAnh");
               GXutil.writeLogRaw("Old: ",Z1198DisEncAnh);
               GXutil.writeLogRaw("Current: ",T01IZ5_A1198DisEncAnh[0]);
            }
            if ( GXutil.strcmp(Z365DisDes, T01IZ5_A365DisDes[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisDes");
               GXutil.writeLogRaw("Old: ",Z365DisDes);
               GXutil.writeLogRaw("Current: ",T01IZ5_A365DisDes[0]);
            }
            if ( Z374DisNumPie != T01IZ5_A374DisNumPie[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisNumPie");
               GXutil.writeLogRaw("Old: ",Z374DisNumPie);
               GXutil.writeLogRaw("Current: ",T01IZ5_A374DisNumPie[0]);
            }
            if ( DecimalUtil.compareTo(Z375DisNumUni, T01IZ5_A375DisNumUni[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisNumUni");
               GXutil.writeLogRaw("Old: ",Z375DisNumUni);
               GXutil.writeLogRaw("Current: ",T01IZ5_A375DisNumUni[0]);
            }
            if ( GXutil.strcmp(Z392DisUniMed, T01IZ5_A392DisUniMed[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisUniMed");
               GXutil.writeLogRaw("Old: ",Z392DisUniMed);
               GXutil.writeLogRaw("Current: ",T01IZ5_A392DisUniMed[0]);
            }
            if ( Z1225DisGraCru != T01IZ5_A1225DisGraCru[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisGraCru");
               GXutil.writeLogRaw("Old: ",Z1225DisGraCru);
               GXutil.writeLogRaw("Current: ",T01IZ5_A1225DisGraCru[0]);
            }
            if ( GXutil.strcmp(Z1430DisLoc, T01IZ5_A1430DisLoc[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisLoc");
               GXutil.writeLogRaw("Old: ",Z1430DisLoc);
               GXutil.writeLogRaw("Current: ",T01IZ5_A1430DisLoc[0]);
            }
            if ( Z1502DisPart != T01IZ5_A1502DisPart[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisPart");
               GXutil.writeLogRaw("Old: ",Z1502DisPart);
               GXutil.writeLogRaw("Current: ",T01IZ5_A1502DisPart[0]);
            }
            if ( Z1906DisGraAca != T01IZ5_A1906DisGraAca[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisGraAca");
               GXutil.writeLogRaw("Old: ",Z1906DisGraAca);
               GXutil.writeLogRaw("Current: ",T01IZ5_A1906DisGraAca[0]);
            }
            if ( DecimalUtil.compareTo(Z1907DisRdoN, T01IZ5_A1907DisRdoN[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisRdoN");
               GXutil.writeLogRaw("Old: ",Z1907DisRdoN);
               GXutil.writeLogRaw("Current: ",T01IZ5_A1907DisRdoN[0]);
            }
            if ( DecimalUtil.compareTo(Z1908DisRdoA, T01IZ5_A1908DisRdoA[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisRdoA");
               GXutil.writeLogRaw("Old: ",Z1908DisRdoA);
               GXutil.writeLogRaw("Current: ",T01IZ5_A1908DisRdoA[0]);
            }
            if ( GXutil.strcmp(Z2009DisTipDis, T01IZ5_A2009DisTipDis[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisTipDis");
               GXutil.writeLogRaw("Old: ",Z2009DisTipDis);
               GXutil.writeLogRaw("Current: ",T01IZ5_A2009DisTipDis[0]);
            }
            if ( Z2831DisNumLot != T01IZ5_A2831DisNumLot[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisNumLot");
               GXutil.writeLogRaw("Old: ",Z2831DisNumLot);
               GXutil.writeLogRaw("Current: ",T01IZ5_A2831DisNumLot[0]);
            }
            if ( DecimalUtil.compareTo(Z2832DisKgsLot, T01IZ5_A2832DisKgsLot[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisKgsLot");
               GXutil.writeLogRaw("Old: ",Z2832DisKgsLot);
               GXutil.writeLogRaw("Current: ",T01IZ5_A2832DisKgsLot[0]);
            }
            if ( DecimalUtil.compareTo(Z2833DisMtrLot, T01IZ5_A2833DisMtrLot[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisMtrLot");
               GXutil.writeLogRaw("Old: ",Z2833DisMtrLot);
               GXutil.writeLogRaw("Current: ",T01IZ5_A2833DisMtrLot[0]);
            }
            if ( GXutil.strcmp(Z2835DisPle2, T01IZ5_A2835DisPle2[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisPle2");
               GXutil.writeLogRaw("Old: ",Z2835DisPle2);
               GXutil.writeLogRaw("Current: ",T01IZ5_A2835DisPle2[0]);
            }
            if ( Z3127DisNumCor != T01IZ5_A3127DisNumCor[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisNumCor");
               GXutil.writeLogRaw("Old: ",Z3127DisNumCor);
               GXutil.writeLogRaw("Current: ",T01IZ5_A3127DisNumCor[0]);
            }
            if ( Z3128DisAncSal1 != T01IZ5_A3128DisAncSal1[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisAncSal1");
               GXutil.writeLogRaw("Old: ",Z3128DisAncSal1);
               GXutil.writeLogRaw("Current: ",T01IZ5_A3128DisAncSal1[0]);
            }
            if ( Z3129DisAncSal2 != T01IZ5_A3129DisAncSal2[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisAncSal2");
               GXutil.writeLogRaw("Old: ",Z3129DisAncSal2);
               GXutil.writeLogRaw("Current: ",T01IZ5_A3129DisAncSal2[0]);
            }
            if ( Z3130DisAncSal3 != T01IZ5_A3130DisAncSal3[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisAncSal3");
               GXutil.writeLogRaw("Old: ",Z3130DisAncSal3);
               GXutil.writeLogRaw("Current: ",T01IZ5_A3130DisAncSal3[0]);
            }
            if ( Z3131DisGraAca2 != T01IZ5_A3131DisGraAca2[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisGraAca2");
               GXutil.writeLogRaw("Old: ",Z3131DisGraAca2);
               GXutil.writeLogRaw("Current: ",T01IZ5_A3131DisGraAca2[0]);
            }
            if ( Z3132DisGraCru2 != T01IZ5_A3132DisGraCru2[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisGraCru2");
               GXutil.writeLogRaw("Old: ",Z3132DisGraCru2);
               GXutil.writeLogRaw("Current: ",T01IZ5_A3132DisGraCru2[0]);
            }
            if ( GXutil.strcmp(Z3306DisFac, T01IZ5_A3306DisFac[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisFac");
               GXutil.writeLogRaw("Old: ",Z3306DisFac);
               GXutil.writeLogRaw("Current: ",T01IZ5_A3306DisFac[0]);
            }
            if ( Z3307DisManCod1 != T01IZ5_A3307DisManCod1[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisManCod1");
               GXutil.writeLogRaw("Old: ",Z3307DisManCod1);
               GXutil.writeLogRaw("Current: ",T01IZ5_A3307DisManCod1[0]);
            }
            if ( Z3308DisManCod2 != T01IZ5_A3308DisManCod2[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisManCod2");
               GXutil.writeLogRaw("Old: ",Z3308DisManCod2);
               GXutil.writeLogRaw("Current: ",T01IZ5_A3308DisManCod2[0]);
            }
            if ( GXutil.strcmp(Z3309DisNumTon, T01IZ5_A3309DisNumTon[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisNumTon");
               GXutil.writeLogRaw("Old: ",Z3309DisNumTon);
               GXutil.writeLogRaw("Current: ",T01IZ5_A3309DisNumTon[0]);
            }
            if ( GXutil.strcmp(Z4614DisMdlCod, T01IZ5_A4614DisMdlCod[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisMdlCod");
               GXutil.writeLogRaw("Old: ",Z4614DisMdlCod);
               GXutil.writeLogRaw("Current: ",T01IZ5_A4614DisMdlCod[0]);
            }
            if ( GXutil.strcmp(Z4615DisTam, T01IZ5_A4615DisTam[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisTam");
               GXutil.writeLogRaw("Old: ",Z4615DisTam);
               GXutil.writeLogRaw("Current: ",T01IZ5_A4615DisTam[0]);
            }
            if ( Z4293DisNPzas != T01IZ5_A4293DisNPzas[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisNPzas");
               GXutil.writeLogRaw("Old: ",Z4293DisNPzas);
               GXutil.writeLogRaw("Current: ",T01IZ5_A4293DisNPzas[0]);
            }
            if ( !( GXutil.dateCompare(Z4616DisHorEnt, T01IZ5_A4616DisHorEnt[0]) ) )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisHorEnt");
               GXutil.writeLogRaw("Old: ",Z4616DisHorEnt);
               GXutil.writeLogRaw("Current: ",T01IZ5_A4616DisHorEnt[0]);
            }
            if ( Z4294DisNPzasL != T01IZ5_A4294DisNPzasL[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisNPzasL");
               GXutil.writeLogRaw("Old: ",Z4294DisNPzasL);
               GXutil.writeLogRaw("Current: ",T01IZ5_A4294DisNPzasL[0]);
            }
            if ( !( GXutil.dateCompare(Z4617DisHorReg, T01IZ5_A4617DisHorReg[0]) ) )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisHorReg");
               GXutil.writeLogRaw("Old: ",Z4617DisHorReg);
               GXutil.writeLogRaw("Current: ",T01IZ5_A4617DisHorReg[0]);
            }
            if ( GXutil.strcmp(Z5252DisAcc, T01IZ5_A5252DisAcc[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisAcc");
               GXutil.writeLogRaw("Old: ",Z5252DisAcc);
               GXutil.writeLogRaw("Current: ",T01IZ5_A5252DisAcc[0]);
            }
            if ( GXutil.strcmp(Z5366DisAntp, T01IZ5_A5366DisAntp[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisAntp");
               GXutil.writeLogRaw("Old: ",Z5366DisAntp);
               GXutil.writeLogRaw("Current: ",T01IZ5_A5366DisAntp[0]);
            }
            if ( GXutil.strcmp(Z5405DisAntpT, T01IZ5_A5405DisAntpT[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisAntpT");
               GXutil.writeLogRaw("Old: ",Z5405DisAntpT);
               GXutil.writeLogRaw("Current: ",T01IZ5_A5405DisAntpT[0]);
            }
            if ( GXutil.strcmp(Z2926DisPla, T01IZ5_A2926DisPla[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisPla");
               GXutil.writeLogRaw("Old: ",Z2926DisPla);
               GXutil.writeLogRaw("Current: ",T01IZ5_A2926DisPla[0]);
            }
            if ( Z4013DisEnv != T01IZ5_A4013DisEnv[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisEnv");
               GXutil.writeLogRaw("Old: ",Z4013DisEnv);
               GXutil.writeLogRaw("Current: ",T01IZ5_A4013DisEnv[0]);
            }
            if ( GXutil.strcmp(Z366DisEnt, T01IZ5_A366DisEnt[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisEnt");
               GXutil.writeLogRaw("Old: ",Z366DisEnt);
               GXutil.writeLogRaw("Current: ",T01IZ5_A366DisEnt[0]);
            }
            if ( GXutil.strcmp(Z4477DisAcaBak, T01IZ5_A4477DisAcaBak[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisAcaBak");
               GXutil.writeLogRaw("Old: ",Z4477DisAcaBak);
               GXutil.writeLogRaw("Current: ",T01IZ5_A4477DisAcaBak[0]);
            }
            if ( GXutil.strcmp(Z5350DisObsAnc, T01IZ5_A5350DisObsAnc[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisObsAnc");
               GXutil.writeLogRaw("Old: ",Z5350DisObsAnc);
               GXutil.writeLogRaw("Current: ",T01IZ5_A5350DisObsAnc[0]);
            }
            if ( GXutil.strcmp(Z5349DisObsGrm, T01IZ5_A5349DisObsGrm[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisObsGrm");
               GXutil.writeLogRaw("Old: ",Z5349DisObsGrm);
               GXutil.writeLogRaw("Current: ",T01IZ5_A5349DisObsGrm[0]);
            }
            if ( GXutil.strcmp(Z4813DisEncCli, T01IZ5_A4813DisEncCli[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisEncCli");
               GXutil.writeLogRaw("Old: ",Z4813DisEncCli);
               GXutil.writeLogRaw("Current: ",T01IZ5_A4813DisEncCli[0]);
            }
            if ( GXutil.strcmp(Z4720DisDishCod, T01IZ5_A4720DisDishCod[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisDishCod");
               GXutil.writeLogRaw("Old: ",Z4720DisDishCod);
               GXutil.writeLogRaw("Current: ",T01IZ5_A4720DisDishCod[0]);
            }
            if ( Z2743DisNumTex1 != T01IZ5_A2743DisNumTex1[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisNumTex1");
               GXutil.writeLogRaw("Old: ",Z2743DisNumTex1);
               GXutil.writeLogRaw("Current: ",T01IZ5_A2743DisNumTex1[0]);
            }
            if ( GXutil.strcmp(Z5032DisEstTip, T01IZ5_A5032DisEstTip[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisEstTip");
               GXutil.writeLogRaw("Old: ",Z5032DisEstTip);
               GXutil.writeLogRaw("Current: ",T01IZ5_A5032DisEstTip[0]);
            }
            if ( GXutil.strcmp(Z4014DisTin, T01IZ5_A4014DisTin[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisTin");
               GXutil.writeLogRaw("Old: ",Z4014DisTin);
               GXutil.writeLogRaw("Current: ",T01IZ5_A4014DisTin[0]);
            }
            if ( GXutil.strcmp(Z5290DisTipCor, T01IZ5_A5290DisTipCor[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisTipCor");
               GXutil.writeLogRaw("Old: ",Z5290DisTipCor);
               GXutil.writeLogRaw("Current: ",T01IZ5_A5290DisTipCor[0]);
            }
            if ( GXutil.strcmp(Z4471DisCruEnr, T01IZ5_A4471DisCruEnr[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisCruEnr");
               GXutil.writeLogRaw("Old: ",Z4471DisCruEnr);
               GXutil.writeLogRaw("Current: ",T01IZ5_A4471DisCruEnr[0]);
            }
            if ( GXutil.strcmp(Z4479DisAcaMar, T01IZ5_A4479DisAcaMar[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisAcaMar");
               GXutil.writeLogRaw("Old: ",Z4479DisAcaMar);
               GXutil.writeLogRaw("Current: ",T01IZ5_A4479DisAcaMar[0]);
            }
            if ( GXutil.strcmp(Z1052DisObs, T01IZ5_A1052DisObs[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisObs");
               GXutil.writeLogRaw("Old: ",Z1052DisObs);
               GXutil.writeLogRaw("Current: ",T01IZ5_A1052DisObs[0]);
            }
            if ( GXutil.strcmp(Z1968DisRes, T01IZ5_A1968DisRes[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisRes");
               GXutil.writeLogRaw("Old: ",Z1968DisRes);
               GXutil.writeLogRaw("Current: ",T01IZ5_A1968DisRes[0]);
            }
            if ( Z5025DisGraCob != T01IZ5_A5025DisGraCob[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisGraCob");
               GXutil.writeLogRaw("Old: ",Z5025DisGraCob);
               GXutil.writeLogRaw("Current: ",T01IZ5_A5025DisGraCob[0]);
            }
            if ( Z252CliCod != T01IZ5_A252CliCod[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01IZ5_A252CliCod[0]);
            }
            if ( GXutil.strcmp(Z1122MaqCodDis, T01IZ5_A1122MaqCodDis[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"MaqCodDis");
               GXutil.writeLogRaw("Old: ",Z1122MaqCodDis);
               GXutil.writeLogRaw("Current: ",T01IZ5_A1122MaqCodDis[0]);
            }
            if ( Z390DisTipCol != T01IZ5_A390DisTipCol[0] )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"DisTipCol");
               GXutil.writeLogRaw("Old: ",Z390DisTipCol);
               GXutil.writeLogRaw("Current: ",T01IZ5_A390DisTipCol[0]);
            }
            if ( GXutil.strcmp(Z10887Cod_Idtx, T01IZ5_A10887Cod_Idtx[0]) != 0 )
            {
               GXutil.writeLogln("tdispol:[seudo value changed for attri]"+"Cod_Idtx");
               GXutil.writeLogRaw("Old: ",Z10887Cod_Idtx);
               GXutil.writeLogRaw("Current: ",T01IZ5_A10887Cod_Idtx[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISPOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1IZ34( )
   {
      beforeValidate1IZ34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IZ34( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1IZ34( 0) ;
         checkOptimisticConcurrency1IZ34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IZ34( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1IZ34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IZ31 */
                  pr_default.execute(23, new Object[] {Integer.valueOf(A361DisCod), A757PriCod, A360DisCliNum, A370DisFecCli, A335DisArtCod, A369DisFec, A371DisFecEnt, A337DisArtDsc, A340DisArtMat, A339DisArtLar, A351DisArtSua, A333DisArtAca, A343DisArtPle, Short.valueOf(A352DisArtTip), A338DisArtEnc, A336DisArtCor, A341DisArtOpe, A353DisArtTr1, Short.valueOf(A344DisArtPt1), A354DisArtTr2, Short.valueOf(A345DisArtPt2), A355DisArtTr3, Short.valueOf(A346DisArtPt3), A350DisArtRdt, Byte.valueOf(A359DisArtUrg), A356DisArtUr1, Short.valueOf(A347DisArtPu1), A357DisArtUr2, Short.valueOf(A348DisArtPu2), A358DisArtUr3, Boolean.valueOf(n349DisArtPu3), Short.valueOf(A349DisArtPu3), Short.valueOf(A342DisArtPes), Short.valueOf(A334DisArtAnh), Short.valueOf(A1231DisArtAn1), Short.valueOf(A1232DisArtAcb), Short.valueOf(A1233DisArtAc2), Byte.valueOf(A367DisEst), A388DisPreKgm, A389DisPreMtr, Short.valueOf(A383DisPieLan), Short.valueOf(A372DisKgmLan), Short.valueOf(A373DisMtrLan), Boolean.valueOf(n362DisColNom), A362DisColNom, Boolean.valueOf(n363DisColNum), Integer.valueOf(A363DisColNum), A1195DisNomCli, Integer.valueOf(A1196DisNumCli), A1197DisEncCom, A1198DisEncAnh, A365DisDes, Short.valueOf(A374DisNumPie), A375DisNumUni, A392DisUniMed, Short.valueOf(A1225DisGraCru), A1430DisLoc, Short.valueOf(A1502DisPart), Short.valueOf(A1906DisGraAca), A1907DisRdoN, A1908DisRdoA, Boolean.valueOf(n2009DisTipDis), A2009DisTipDis, Integer.valueOf(A2831DisNumLot), A2832DisKgsLot, A2833DisMtrLot, A2835DisPle2, Short.valueOf(A3127DisNumCor), Short.valueOf(A3128DisAncSal1), Short.valueOf(A3129DisAncSal2), Short.valueOf(A3130DisAncSal3), Short.valueOf(A3131DisGraAca2), Short.valueOf(A3132DisGraCru2), A3306DisFac, Short.valueOf(A3307DisManCod1), Short.valueOf(A3308DisManCod2), A3309DisNumTon, A4614DisMdlCod, A4615DisTam, Boolean.valueOf(n4293DisNPzas), Integer.valueOf(A4293DisNPzas), Boolean.valueOf(n4616DisHorEnt), A4616DisHorEnt, Boolean.valueOf(n4294DisNPzasL), Integer.valueOf(A4294DisNPzasL), Boolean.valueOf(n4617DisHorReg), A4617DisHorReg, A5252DisAcc, A5366DisAntp, A5405DisAntpT, A2926DisPla, Boolean.valueOf(n4013DisEnv), Byte.valueOf(A4013DisEnv), A366DisEnt, A4477DisAcaBak, A5350DisObsAnc, A5349DisObsGrm, A4813DisEncCli, A4720DisDishCod, Byte.valueOf(A2743DisNumTex1), A5032DisEstTip, A4014DisTin, A5290DisTipCor, A4471DisCruEnr, A4479DisAcaMar, A1052DisObs, Boolean.valueOf(n1968DisRes), A1968DisRes, Byte.valueOf(A5025DisGraCob), A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n1122MaqCodDis), A1122MaqCodDis, Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol), Boolean.valueOf(n10887Cod_Idtx), A10887Cod_Idtx});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
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
                        processLevel1IZ34( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1IZ0( ) ;
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
            load1IZ34( ) ;
         }
         endLevel1IZ34( ) ;
      }
      closeExtendedTableCursors1IZ34( ) ;
   }

   public void update1IZ34( )
   {
      beforeValidate1IZ34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IZ34( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IZ34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IZ34( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1IZ34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IZ32 */
                  pr_default.execute(24, new Object[] {A757PriCod, A360DisCliNum, A370DisFecCli, A335DisArtCod, A369DisFec, A371DisFecEnt, A337DisArtDsc, A340DisArtMat, A339DisArtLar, A351DisArtSua, A333DisArtAca, A343DisArtPle, Short.valueOf(A352DisArtTip), A338DisArtEnc, A336DisArtCor, A341DisArtOpe, A353DisArtTr1, Short.valueOf(A344DisArtPt1), A354DisArtTr2, Short.valueOf(A345DisArtPt2), A355DisArtTr3, Short.valueOf(A346DisArtPt3), A350DisArtRdt, Byte.valueOf(A359DisArtUrg), A356DisArtUr1, Short.valueOf(A347DisArtPu1), A357DisArtUr2, Short.valueOf(A348DisArtPu2), A358DisArtUr3, Boolean.valueOf(n349DisArtPu3), Short.valueOf(A349DisArtPu3), Short.valueOf(A342DisArtPes), Short.valueOf(A334DisArtAnh), Short.valueOf(A1231DisArtAn1), Short.valueOf(A1232DisArtAcb), Short.valueOf(A1233DisArtAc2), Byte.valueOf(A367DisEst), A388DisPreKgm, A389DisPreMtr, Short.valueOf(A383DisPieLan), Short.valueOf(A372DisKgmLan), Short.valueOf(A373DisMtrLan), Boolean.valueOf(n362DisColNom), A362DisColNom, Boolean.valueOf(n363DisColNum), Integer.valueOf(A363DisColNum), A1195DisNomCli, Integer.valueOf(A1196DisNumCli), A1197DisEncCom, A1198DisEncAnh, A365DisDes, Short.valueOf(A374DisNumPie), A375DisNumUni, A392DisUniMed, Short.valueOf(A1225DisGraCru), A1430DisLoc, Short.valueOf(A1502DisPart), Short.valueOf(A1906DisGraAca), A1907DisRdoN, A1908DisRdoA, Boolean.valueOf(n2009DisTipDis), A2009DisTipDis, Integer.valueOf(A2831DisNumLot), A2832DisKgsLot, A2833DisMtrLot, A2835DisPle2, Short.valueOf(A3127DisNumCor), Short.valueOf(A3128DisAncSal1), Short.valueOf(A3129DisAncSal2), Short.valueOf(A3130DisAncSal3), Short.valueOf(A3131DisGraAca2), Short.valueOf(A3132DisGraCru2), A3306DisFac, Short.valueOf(A3307DisManCod1), Short.valueOf(A3308DisManCod2), A3309DisNumTon, A4614DisMdlCod, A4615DisTam, Boolean.valueOf(n4293DisNPzas), Integer.valueOf(A4293DisNPzas), Boolean.valueOf(n4616DisHorEnt), A4616DisHorEnt, Boolean.valueOf(n4294DisNPzasL), Integer.valueOf(A4294DisNPzasL), Boolean.valueOf(n4617DisHorReg), A4617DisHorReg, A5252DisAcc, A5366DisAntp, A5405DisAntpT, A2926DisPla, Boolean.valueOf(n4013DisEnv), Byte.valueOf(A4013DisEnv), A366DisEnt, A4477DisAcaBak, A5350DisObsAnc, A5349DisObsGrm, A4813DisEncCli, A4720DisDishCod, Byte.valueOf(A2743DisNumTex1), A5032DisEstTip, A4014DisTin, A5290DisTipCor, A4471DisCruEnr, A4479DisAcaMar, A1052DisObs, Boolean.valueOf(n1968DisRes), A1968DisRes, Byte.valueOf(A5025DisGraCob), Integer.valueOf(A252CliCod), Boolean.valueOf(n1122MaqCodDis), A1122MaqCodDis, Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol), Boolean.valueOf(n10887Cod_Idtx), A10887Cod_Idtx, A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( (pr_default.getStatus(24) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1IZ34( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int5[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5) ;
                     tdispol_impl.this.A396EmprCod = GXv_char4[0] ;
                     tdispol_impl.this.A361DisCod = GXv_int5[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1IZ34( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1IZ0( ) ;
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
         endLevel1IZ34( ) ;
      }
      closeExtendedTableCursors1IZ34( ) ;
   }

   public void deferredUpdate1IZ34( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1IZ34( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IZ34( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1IZ34( ) ;
         afterConfirm1IZ34( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1IZ34( ) ;
            if ( AnyError == 0 )
            {
               scanStart1IZ38( ) ;
               while ( RcdFound38 != 0 )
               {
                  getByPrimaryKey1IZ38( ) ;
                  delete1IZ38( ) ;
                  scanNext1IZ38( ) ;
               }
               scanEnd1IZ38( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IZ33 */
                  pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
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
                           initAll1IZ34( ) ;
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
                        resetCaption1IZ0( ) ;
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
      sMode34 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1IZ34( ) ;
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1IZ34( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01IZ34 */
         pr_default.execute(26, new Object[] {A396EmprCod});
         A407EmprNom = T01IZ34_A407EmprNom[0] ;
         n407EmprNom = T01IZ34_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(26);
         A399EmprCodDis = A396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A399EmprCodDis", A399EmprCodDis);
         /* Using cursor T01IZ36 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            A387DisPiePie = T01IZ36_A387DisPiePie[0] ;
            n387DisPiePie = T01IZ36_n387DisPiePie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
         }
         else
         {
            A387DisPiePie = (short)(0) ;
            n387DisPiePie = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
         }
         pr_default.close(27);
         /* Using cursor T01IZ38 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            A379DisPie = T01IZ38_A379DisPie[0] ;
            n379DisPie = T01IZ38_n379DisPie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A379DisPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A379DisPie), 4, 0));
         }
         else
         {
            A379DisPie = (short)(0) ;
            n379DisPie = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A379DisPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A379DisPie), 4, 0));
         }
         pr_default.close(28);
         /* Using cursor T01IZ39 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01IZ39_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(29);
         A253CliCodDis = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A253CliCodDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A253CliCodDis), 6, 0));
         GXt_char1 = A12115DisArtTipD ;
         GXv_char4[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A352DisArtTip, GXv_char4) ;
         tdispol_impl.this.GXt_char1 = GXv_char4[0] ;
         A12115DisArtTipD = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A12115DisArtTipD", A12115DisArtTipD);
         GXt_char1 = A12116DisTipCD ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int3[0] = A390DisTipCol ;
         GXv_char2[0] = GXt_char1 ;
         new app.pfcoldsc(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_char2) ;
         tdispol_impl.this.A396EmprCod = GXv_char4[0] ;
         tdispol_impl.this.A390DisTipCol = GXv_int3[0] ;
         tdispol_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A390DisTipCol), 2, 0));
         A12116DisTipCD = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A12116DisTipCD", A12116DisTipCD);
         GXt_char1 = A475FindCol ;
         GXv_char4[0] = GXt_char1 ;
         new app.pedidos.dis_findcol_validate(remoteHandle, context).execute( A396EmprCod, A252CliCod, A335DisArtCod, A362DisColNom, A363DisColNum, A390DisTipCol, GXv_char4) ;
         tdispol_impl.this.GXt_char1 = GXv_char4[0] ;
         A475FindCol = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A475FindCol", A475FindCol);
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
               httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
            }
            else
            {
               A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
            }
         }
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
         {
            A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         }
         else
         {
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
               httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
            }
            else
            {
               A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
            }
         }
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A386DisPieNor = (short)(getDisPieNor0( A396EmprCod, A361DisCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A386DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A386DisPieNor), 4, 0));
         }
         else
         {
            A386DisPieNor = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A386DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A386DisPieNor), 4, 0));
         }
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
         {
            A391DisUni = getDisUni0( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A391DisUni", GXutil.ltrimstr( A391DisUni, 9, 2));
         }
         else
         {
            if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               A391DisUni = getDisUni1( A396EmprCod, A361DisCod) ;
               httpContext.ajax_rsp_assign_attri("", false, "A391DisUni", GXutil.ltrimstr( A391DisUni, 9, 2));
            }
            else
            {
               A391DisUni = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A391DisUni", GXutil.ltrimstr( A391DisUni, 9, 2));
            }
         }
         /* Using cursor T01IZ40 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n10887Cod_Idtx), A10887Cod_Idtx});
         A10888Dsc_Idtx = T01IZ40_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = T01IZ40_n10888Dsc_Idtx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10888Dsc_Idtx", A10888Dsc_Idtx);
         pr_default.close(30);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01IZ41 */
         pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Accesorios Tinte", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01IZ42 */
         pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normativas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01IZ43 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01IZ44 */
         pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01IZ45 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01IZ46 */
         pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISACC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01IZ47 */
         pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01IZ48 */
         pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISREF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01IZ49 */
         pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSERV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01IZ50 */
         pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01IZ51 */
         pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISDEF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01IZ52 */
         pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
      }
   }

   public void processNestedLevel1IZ38( )
   {
      nGXsfl_610_idx = 0 ;
      while ( nGXsfl_610_idx < nRC_GXsfl_610 )
      {
         readRow1IZ38( ) ;
         if ( ( nRcdExists_38 != 0 ) || ( nIsMod_38 != 0 ) )
         {
            standaloneNotModal1IZ38( ) ;
            getKey1IZ38( ) ;
            if ( ( nRcdExists_38 == 0 ) && ( nRcdDeleted_38 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1IZ38( ) ;
            }
            else
            {
               if ( RcdFound38 != 0 )
               {
                  if ( ( nRcdDeleted_38 != 0 ) && ( nRcdExists_38 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1IZ38( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_38 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1IZ38( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_38 == 0 )
                  {
                     GXCCtl = "PROCOD_" + sGXsfl_610_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_38_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProCod_Internalname, GXutil.rtrim( A758ProCod)) ;
         httpContext.changePostValue( edtProDsc_Internalname, GXutil.rtrim( A759ProDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_610_idx, GXutil.rtrim( Z758ProCod)) ;
         httpContext.changePostValue( "nRcdDeleted_38_"+sGXsfl_610_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_38_"+sGXsfl_610_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_38_"+sGXsfl_610_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_38 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_38_"+sGXsfl_610_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_38_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROCOD_"+sGXsfl_610_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRODSC_"+sGXsfl_610_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1IZ38( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_38 = (short)(0) ;
      nIsMod_38 = (short)(0) ;
      nRcdDeleted_38 = (short)(0) ;
   }

   public void processLevel1IZ34( )
   {
      /* Save parent mode. */
      sMode34 = Gx_mode ;
      processNestedLevel1IZ38( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1IZ34( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1IZ34( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdispol");
         if ( AnyError == 0 )
         {
            confirmValues1IZ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdispol");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1IZ34( )
   {
      /* Using cursor T01IZ53 */
      pr_default.execute(43);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(43) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A396EmprCod = T01IZ53_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = T01IZ53_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1IZ34( )
   {
      /* Scan next routine */
      pr_default.readNext(43);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(43) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A396EmprCod = T01IZ53_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = T01IZ53_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
   }

   public void scanEnd1IZ34( )
   {
      pr_default.close(43);
   }

   public void afterConfirm1IZ34( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1IZ34( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1IZ34( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1IZ34( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1IZ34( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1IZ34( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1IZ34( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      chkPriCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPriCod.getInternalname(), "Enabled", GXutil.ltrimstr( chkPriCod.getEnabled(), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
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
      edtDisArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtDsc_Enabled), 5, 0), true);
      edtDisArtMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtMat_Enabled), 5, 0), true);
      edtDisArtLar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtLar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtLar_Enabled), 5, 0), true);
      edtDisArtSua_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtSua_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtSua_Enabled), 5, 0), true);
      edtDisArtAca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtAca_Enabled), 5, 0), true);
      edtDisArtPle_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtPle_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtPle_Enabled), 5, 0), true);
      edtDisArtTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtTip_Enabled), 5, 0), true);
      edtDisArtTipD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtTipD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtTipD_Enabled), 5, 0), true);
      chkDisArtEnc.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisArtEnc.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisArtEnc.getEnabled(), 5, 0), true);
      chkDisArtCor.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisArtCor.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisArtCor.getEnabled(), 5, 0), true);
      edtDisArtOpe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtOpe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtOpe_Enabled), 5, 0), true);
      edtDisArtTr1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtTr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtTr1_Enabled), 5, 0), true);
      edtDisArtPt1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtPt1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtPt1_Enabled), 5, 0), true);
      edtDisArtTr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtTr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtTr2_Enabled), 5, 0), true);
      edtDisArtPt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtPt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtPt2_Enabled), 5, 0), true);
      edtDisArtTr3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtTr3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtTr3_Enabled), 5, 0), true);
      edtDisArtPt3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtPt3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtPt3_Enabled), 5, 0), true);
      edtDisArtRdt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtRdt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtRdt_Enabled), 5, 0), true);
      edtDisArtUrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtUrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtUrg_Enabled), 5, 0), true);
      edtDisArtUr1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtUr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtUr1_Enabled), 5, 0), true);
      edtDisArtPu1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtPu1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtPu1_Enabled), 5, 0), true);
      edtDisArtUr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtUr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtUr2_Enabled), 5, 0), true);
      edtDisArtPu2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtPu2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtPu2_Enabled), 5, 0), true);
      edtDisArtUr3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtUr3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtUr3_Enabled), 5, 0), true);
      edtDisArtPu3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtPu3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtPu3_Enabled), 5, 0), true);
      edtDisArtPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtPes_Enabled), 5, 0), true);
      edtDisArtAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtAnh_Enabled), 5, 0), true);
      edtDisArtAn1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtAn1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtAn1_Enabled), 5, 0), true);
      edtDisArtAcb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtAcb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtAcb_Enabled), 5, 0), true);
      edtDisArtAc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtAc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtAc2_Enabled), 5, 0), true);
      edtDisPiePie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPiePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPiePie_Enabled), 5, 0), true);
      edtDisPieMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPieMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieMtr_Enabled), 5, 0), true);
      edtDisPieKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPieKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieKgm_Enabled), 5, 0), true);
      cmbDisEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbDisEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbDisEst.getEnabled(), 5, 0), true);
      edtDisPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPreKgm_Enabled), 5, 0), true);
      edtDisPreMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPreMtr_Enabled), 5, 0), true);
      edtDisPieLan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPieLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieLan_Enabled), 5, 0), true);
      edtDisKgmLan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisKgmLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisKgmLan_Enabled), 5, 0), true);
      edtDisMtrLan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisMtrLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisMtrLan_Enabled), 5, 0), true);
      edtDisColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisColNom_Enabled), 5, 0), true);
      edtDisColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisColNum_Enabled), 5, 0), true);
      edtDisNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNomCli_Enabled), 5, 0), true);
      edtDisNumCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumCli_Enabled), 5, 0), true);
      edtDisEncCom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisEncCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisEncCom_Enabled), 5, 0), true);
      edtDisEncAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisEncAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisEncAnh_Enabled), 5, 0), true);
      edtDisTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisTipCol_Enabled), 5, 0), true);
      edtDisTipCD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisTipCD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisTipCD_Enabled), 5, 0), true);
      chkDisDes.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisDes.getEnabled(), 5, 0), true);
      edtDisNumPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumPie_Enabled), 5, 0), true);
      edtDisNumUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumUni_Enabled), 5, 0), true);
      edtDisUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUniMed_Enabled), 5, 0), true);
      edtEmprCodDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCodDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCodDis_Enabled), 5, 0), true);
      edtCliCodDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCodDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCodDis_Enabled), 5, 0), true);
      edtFindCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindCol_Enabled), 5, 0), true);
      edtDisPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPie_Enabled), 5, 0), true);
      edtDisUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUni_Enabled), 5, 0), true);
      edtDisGraCru_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisGraCru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisGraCru_Enabled), 5, 0), true);
      edtDisPieNor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPieNor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieNor_Enabled), 5, 0), true);
      edtDisLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisLoc_Enabled), 5, 0), true);
      edtDisPart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPart_Enabled), 5, 0), true);
      edtDisGraAca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisGraAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisGraAca_Enabled), 5, 0), true);
      edtDisRdoN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisRdoN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisRdoN_Enabled), 5, 0), true);
      edtDisRdoA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisRdoA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisRdoA_Enabled), 5, 0), true);
      edtDisTipDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisTipDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisTipDis_Enabled), 5, 0), true);
      edtDisNumLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumLot_Enabled), 5, 0), true);
      edtDisKgsLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisKgsLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisKgsLot_Enabled), 5, 0), true);
      edtDisMtrLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisMtrLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisMtrLot_Enabled), 5, 0), true);
      edtDisPle2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPle2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPle2_Enabled), 5, 0), true);
      edtDisNumCor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumCor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumCor_Enabled), 5, 0), true);
      edtDisAncSal1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisAncSal1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisAncSal1_Enabled), 5, 0), true);
      edtDisAncSal2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisAncSal2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisAncSal2_Enabled), 5, 0), true);
      edtDisAncSal3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisAncSal3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisAncSal3_Enabled), 5, 0), true);
      edtDisGraAca2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisGraAca2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisGraAca2_Enabled), 5, 0), true);
      edtDisGraCru2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisGraCru2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisGraCru2_Enabled), 5, 0), true);
      chkDisFac.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFac.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisFac.getEnabled(), 5, 0), true);
      edtDisManCod1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisManCod1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisManCod1_Enabled), 5, 0), true);
      edtDisManCod2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisManCod2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisManCod2_Enabled), 5, 0), true);
      edtDisNumTon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumTon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumTon_Enabled), 5, 0), true);
      edtDisMdlCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisMdlCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisMdlCod_Enabled), 5, 0), true);
      edtDisTam_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisTam_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisTam_Enabled), 5, 0), true);
      edtDisNPzas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNPzas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNPzas_Enabled), 5, 0), true);
      edtDisHorEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisHorEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisHorEnt_Enabled), 5, 0), true);
      edtDisNPzasL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNPzasL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNPzasL_Enabled), 5, 0), true);
      edtDisHorReg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisHorReg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisHorReg_Enabled), 5, 0), true);
      chkDisAcc.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisAcc.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisAcc.getEnabled(), 5, 0), true);
      edtDisAntp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisAntp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisAntp_Enabled), 5, 0), true);
      edtDisAntpT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisAntpT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisAntpT_Enabled), 5, 0), true);
      chkDisPla.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisPla.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisPla.getEnabled(), 5, 0), true);
      edtDisEnv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisEnv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisEnv_Enabled), 5, 0), true);
      edtDisEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisEnt_Enabled), 5, 0), true);
      chkDisAcaBak.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisAcaBak.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisAcaBak.getEnabled(), 5, 0), true);
      edtDisObsAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsAnc_Enabled), 5, 0), true);
      edtDisObsGrm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsGrm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsGrm_Enabled), 5, 0), true);
      edtDisEncCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisEncCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisEncCli_Enabled), 5, 0), true);
      edtDisDishCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDishCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDishCod_Enabled), 5, 0), true);
      edtDisNumTex1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumTex1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumTex1_Enabled), 5, 0), true);
      chkDisEstTip.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisEstTip.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisEstTip.getEnabled(), 5, 0), true);
      chkDisTin.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisTin.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisTin.getEnabled(), 5, 0), true);
      edtDisTipCor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisTipCor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisTipCor_Enabled), 5, 0), true);
      edtDisCruEnr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCruEnr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCruEnr_Enabled), 5, 0), true);
      edtDisAcaMar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisAcaMar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisAcaMar_Enabled), 5, 0), true);
      edtDisObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObs_Enabled), 5, 0), true);
      edtDisRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisRes_Enabled), 5, 0), true);
      edtDisGraCob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisGraCob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisGraCob_Enabled), 5, 0), true);
      edtCod_Idtx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCod_Idtx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCod_Idtx_Enabled), 5, 0), true);
      edtDsc_Idtx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDsc_Idtx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDsc_Idtx_Enabled), 5, 0), true);
      edtMaqCodDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodDis_Enabled), 5, 0), true);
   }

   public void zm1IZ38( int GX_JID )
   {
      if ( ( GX_JID == 27 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -27 )
      {
         Z361DisCod = A361DisCod ;
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         Z759ProDsc = A759ProDsc ;
      }
   }

   public void standaloneNotModal1IZ38( )
   {
   }

   public void standaloneModal1IZ38( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_610_Refreshing);
      }
      else
      {
         edtProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_610_Refreshing);
      }
   }

   public void load1IZ38( )
   {
      /* Using cursor T01IZ54 */
      pr_default.execute(44, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A759ProDsc = T01IZ54_A759ProDsc[0] ;
         zm1IZ38( -27) ;
      }
      pr_default.close(44);
      onLoadActions1IZ38( ) ;
   }

   public void onLoadActions1IZ38( )
   {
   }

   public void checkExtendedTable1IZ38( )
   {
      nIsDirty_38 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1IZ38( ) ;
      /* Using cursor T01IZ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_610_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01IZ4_A759ProDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1IZ38( )
   {
      pr_default.close(2);
   }

   public void enableDisable1IZ38( )
   {
   }

   public void gxload_28( String A396EmprCod ,
                          String A758ProCod )
   {
      /* Using cursor T01IZ55 */
      pr_default.execute(45, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(45) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_610_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01IZ55_A759ProDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A759ProDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(45) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(45);
   }

   public void getKey1IZ38( )
   {
      /* Using cursor T01IZ56 */
      pr_default.execute(46, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(46) != 101) )
      {
         RcdFound38 = (short)(1) ;
      }
      else
      {
         RcdFound38 = (short)(0) ;
      }
      pr_default.close(46);
   }

   public void getByPrimaryKey1IZ38( )
   {
      /* Using cursor T01IZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1IZ38( 27) ;
         RcdFound38 = (short)(1) ;
         initializeNonKey1IZ38( ) ;
         A758ProCod = T01IZ3_A758ProCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1IZ38( ) ;
         load1IZ38( ) ;
         Gx_mode = sMode38 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound38 = (short)(0) ;
         initializeNonKey1IZ38( ) ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1IZ38( ) ;
         Gx_mode = sMode38 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1IZ38( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1IZ38( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01IZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISLIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISLIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1IZ38( )
   {
      beforeValidate1IZ38( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IZ38( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1IZ38( 0) ;
         checkOptimisticConcurrency1IZ38( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1IZ38( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1IZ38( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01IZ57 */
                  pr_default.execute(47, new Object[] {Integer.valueOf(A361DisCod), A396EmprCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
                  if ( (pr_default.getStatus(47) == 1) )
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
            load1IZ38( ) ;
         }
         endLevel1IZ38( ) ;
      }
      closeExtendedTableCursors1IZ38( ) ;
   }

   public void update1IZ38( )
   {
      beforeValidate1IZ38( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1IZ38( ) ;
      }
      if ( ( nIsMod_38 != 0 ) || ( nIsDirty_38 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1IZ38( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1IZ38( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1IZ38( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPDISLIN */
                     deferredUpdate1IZ38( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int5[0] = A361DisCod ;
                        new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int5) ;
                        tdispol_impl.this.A396EmprCod = GXv_char4[0] ;
                        tdispol_impl.this.A361DisCod = GXv_int5[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1IZ38( ) ;
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
            endLevel1IZ38( ) ;
         }
      }
      closeExtendedTableCursors1IZ38( ) ;
   }

   public void deferredUpdate1IZ38( )
   {
   }

   public void delete1IZ38( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1IZ38( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1IZ38( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1IZ38( ) ;
         afterConfirm1IZ38( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1IZ38( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01IZ58 */
               pr_default.execute(48, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
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
      sMode38 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1IZ38( ) ;
      Gx_mode = sMode38 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1IZ38( )
   {
      standaloneModal1IZ38( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01IZ59 */
         pr_default.execute(49, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T01IZ59_A759ProDsc[0] ;
         pr_default.close(49);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01IZ60 */
         pr_default.execute(50, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
      }
   }

   public void endLevel1IZ38( )
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

   public void scanStart1IZ38( )
   {
      /* Scan By routine */
      /* Using cursor T01IZ61 */
      pr_default.execute(51, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound38 = (short)(0) ;
      if ( (pr_default.getStatus(51) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A758ProCod = T01IZ61_A758ProCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1IZ38( )
   {
      /* Scan next routine */
      pr_default.readNext(51);
      RcdFound38 = (short)(0) ;
      if ( (pr_default.getStatus(51) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A758ProCod = T01IZ61_A758ProCod[0] ;
      }
   }

   public void scanEnd1IZ38( )
   {
      pr_default.close(51);
   }

   public void afterConfirm1IZ38( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1IZ38( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1IZ38( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1IZ38( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1IZ38( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1IZ38( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1IZ38( )
   {
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_610_Refreshing);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), !bGXsfl_610_Refreshing);
   }

   public void send_integrity_lvl_hashes1IZ38( )
   {
   }

   public void send_integrity_lvl_hashes1IZ34( )
   {
   }

   public void subsflControlProps_61038( )
   {
      edtavnRcdDeleted_38_Internalname = "vNRCDDELETED_38_"+sGXsfl_610_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_610_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_610_idx ;
   }

   public void subsflControlProps_fel_61038( )
   {
      edtavnRcdDeleted_38_Internalname = "vNRCDDELETED_38_"+sGXsfl_610_fel_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_610_fel_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_610_fel_idx ;
   }

   public void addRow1IZ38( )
   {
      nGXsfl_610_idx = (int)(nGXsfl_610_idx+1) ;
      sGXsfl_610_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_610_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_61038( ) ;
      sendRow1IZ38( ) ;
   }

   public void sendRow1IZ38( )
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
         if ( ((int)((nGXsfl_610_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_38_" + sGXsfl_610_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 611,'',false,'" + sGXsfl_610_idx + "',610)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_38_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_38_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_38), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_38), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,611);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_38_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_38_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(610),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_38_" + sGXsfl_610_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 612,'',false,'" + sGXsfl_610_idx + "',610)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,612);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(610),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProDsc_Internalname,GXutil.rtrim( A759ProDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(610),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1IZ38( ) ;
      GXCCtl = "Z758ProCod_" + sGXsfl_610_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z758ProCod));
      GXCCtl = "nRcdDeleted_38_" + sGXsfl_610_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_38_" + sGXsfl_610_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_38_" + sGXsfl_610_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_38, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_38_"+sGXsfl_610_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_38_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD_"+sGXsfl_610_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRODSC_"+sGXsfl_610_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1IZ38( )
   {
      nGXsfl_610_idx = (int)(nGXsfl_610_idx+1) ;
      sGXsfl_610_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_610_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_61038( ) ;
      edtavnRcdDeleted_38_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_38_"+sGXsfl_610_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCOD_"+sGXsfl_610_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRODSC_"+sGXsfl_610_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_38_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_38_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_38");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_38_Internalname ;
         wbErr = true ;
         nRcdDeleted_38 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_38 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_38_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
      A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
      GXCCtl = "Z758ProCod_" + sGXsfl_610_idx ;
      Z758ProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_38_" + sGXsfl_610_idx ;
      nRcdDeleted_38 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_38_" + sGXsfl_610_idx ;
      nRcdExists_38 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_38_" + sGXsfl_610_idx ;
      nIsMod_38 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtProCod_Enabled = edtProCod_Enabled ;
   }

   public void confirmValues1IZ0( )
   {
      nGXsfl_610_idx = 0 ;
      sGXsfl_610_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_610_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_61038( ) ;
      while ( nGXsfl_610_idx < nRC_GXsfl_610 )
      {
         nGXsfl_610_idx = (int)(nGXsfl_610_idx+1) ;
         sGXsfl_610_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_610_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_61038( ) ;
         httpContext.changePostValue( "Z758ProCod_"+sGXsfl_610_idx, httpContext.cgiGet( "ZT_"+"Z758ProCod_"+sGXsfl_610_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_610_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdispol", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z337DisArtDsc", GXutil.rtrim( Z337DisArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z340DisArtMat", GXutil.rtrim( Z340DisArtMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z339DisArtLar", GXutil.rtrim( Z339DisArtLar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z351DisArtSua", GXutil.rtrim( Z351DisArtSua));
      app.GxWebStd.gx_hidden_field( httpContext, "Z333DisArtAca", GXutil.rtrim( Z333DisArtAca));
      app.GxWebStd.gx_hidden_field( httpContext, "Z343DisArtPle", GXutil.rtrim( Z343DisArtPle));
      app.GxWebStd.gx_hidden_field( httpContext, "Z352DisArtTip", GXutil.ltrim( localUtil.ntoc( Z352DisArtTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z338DisArtEnc", GXutil.rtrim( Z338DisArtEnc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z336DisArtCor", GXutil.rtrim( Z336DisArtCor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z341DisArtOpe", GXutil.rtrim( Z341DisArtOpe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z353DisArtTr1", GXutil.rtrim( Z353DisArtTr1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z344DisArtPt1", GXutil.ltrim( localUtil.ntoc( Z344DisArtPt1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z354DisArtTr2", GXutil.rtrim( Z354DisArtTr2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z345DisArtPt2", GXutil.ltrim( localUtil.ntoc( Z345DisArtPt2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z355DisArtTr3", GXutil.rtrim( Z355DisArtTr3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z346DisArtPt3", GXutil.ltrim( localUtil.ntoc( Z346DisArtPt3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z350DisArtRdt", GXutil.ltrim( localUtil.ntoc( Z350DisArtRdt, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z359DisArtUrg", GXutil.ltrim( localUtil.ntoc( Z359DisArtUrg, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z356DisArtUr1", GXutil.rtrim( Z356DisArtUr1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z347DisArtPu1", GXutil.ltrim( localUtil.ntoc( Z347DisArtPu1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z357DisArtUr2", GXutil.rtrim( Z357DisArtUr2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z348DisArtPu2", GXutil.ltrim( localUtil.ntoc( Z348DisArtPu2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z358DisArtUr3", GXutil.rtrim( Z358DisArtUr3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z349DisArtPu3", GXutil.ltrim( localUtil.ntoc( Z349DisArtPu3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z342DisArtPes", GXutil.ltrim( localUtil.ntoc( Z342DisArtPes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z334DisArtAnh", GXutil.ltrim( localUtil.ntoc( Z334DisArtAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1231DisArtAn1", GXutil.ltrim( localUtil.ntoc( Z1231DisArtAn1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1232DisArtAcb", GXutil.ltrim( localUtil.ntoc( Z1232DisArtAcb, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1233DisArtAc2", GXutil.ltrim( localUtil.ntoc( Z1233DisArtAc2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z367DisEst", GXutil.ltrim( localUtil.ntoc( Z367DisEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z388DisPreKgm", GXutil.ltrim( localUtil.ntoc( Z388DisPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z389DisPreMtr", GXutil.ltrim( localUtil.ntoc( Z389DisPreMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z383DisPieLan", GXutil.ltrim( localUtil.ntoc( Z383DisPieLan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z372DisKgmLan", GXutil.ltrim( localUtil.ntoc( Z372DisKgmLan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z373DisMtrLan", GXutil.ltrim( localUtil.ntoc( Z373DisMtrLan, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z362DisColNom", GXutil.rtrim( Z362DisColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z363DisColNum", GXutil.ltrim( localUtil.ntoc( Z363DisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1195DisNomCli", GXutil.rtrim( Z1195DisNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1196DisNumCli", GXutil.ltrim( localUtil.ntoc( Z1196DisNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1197DisEncCom", GXutil.ltrim( localUtil.ntoc( Z1197DisEncCom, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1198DisEncAnh", GXutil.ltrim( localUtil.ntoc( Z1198DisEncAnh, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z374DisNumPie", GXutil.ltrim( localUtil.ntoc( Z374DisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z375DisNumUni", GXutil.ltrim( localUtil.ntoc( Z375DisNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z392DisUniMed", GXutil.rtrim( Z392DisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1225DisGraCru", GXutil.ltrim( localUtil.ntoc( Z1225DisGraCru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1430DisLoc", GXutil.rtrim( Z1430DisLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1502DisPart", GXutil.ltrim( localUtil.ntoc( Z1502DisPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1906DisGraAca", GXutil.ltrim( localUtil.ntoc( Z1906DisGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1907DisRdoN", GXutil.ltrim( localUtil.ntoc( Z1907DisRdoN, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1908DisRdoA", GXutil.ltrim( localUtil.ntoc( Z1908DisRdoA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2009DisTipDis", GXutil.rtrim( Z2009DisTipDis));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2831DisNumLot", GXutil.ltrim( localUtil.ntoc( Z2831DisNumLot, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2832DisKgsLot", GXutil.ltrim( localUtil.ntoc( Z2832DisKgsLot, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2833DisMtrLot", GXutil.ltrim( localUtil.ntoc( Z2833DisMtrLot, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2835DisPle2", GXutil.rtrim( Z2835DisPle2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3127DisNumCor", GXutil.ltrim( localUtil.ntoc( Z3127DisNumCor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3128DisAncSal1", GXutil.ltrim( localUtil.ntoc( Z3128DisAncSal1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3129DisAncSal2", GXutil.ltrim( localUtil.ntoc( Z3129DisAncSal2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3130DisAncSal3", GXutil.ltrim( localUtil.ntoc( Z3130DisAncSal3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3131DisGraAca2", GXutil.ltrim( localUtil.ntoc( Z3131DisGraAca2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3132DisGraCru2", GXutil.ltrim( localUtil.ntoc( Z3132DisGraCru2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3306DisFac", GXutil.rtrim( Z3306DisFac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3307DisManCod1", GXutil.ltrim( localUtil.ntoc( Z3307DisManCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3308DisManCod2", GXutil.ltrim( localUtil.ntoc( Z3308DisManCod2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3309DisNumTon", GXutil.rtrim( Z3309DisNumTon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4614DisMdlCod", GXutil.rtrim( Z4614DisMdlCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4615DisTam", GXutil.rtrim( Z4615DisTam));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4293DisNPzas", GXutil.ltrim( localUtil.ntoc( Z4293DisNPzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4616DisHorEnt", localUtil.ttoc( Z4616DisHorEnt, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4294DisNPzasL", GXutil.ltrim( localUtil.ntoc( Z4294DisNPzasL, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4617DisHorReg", localUtil.ttoc( Z4617DisHorReg, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5252DisAcc", GXutil.rtrim( Z5252DisAcc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5366DisAntp", GXutil.rtrim( Z5366DisAntp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5405DisAntpT", GXutil.rtrim( Z5405DisAntpT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2926DisPla", GXutil.rtrim( Z2926DisPla));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4013DisEnv", GXutil.ltrim( localUtil.ntoc( Z4013DisEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z366DisEnt", GXutil.rtrim( Z366DisEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4477DisAcaBak", GXutil.rtrim( Z4477DisAcaBak));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5350DisObsAnc", GXutil.rtrim( Z5350DisObsAnc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5349DisObsGrm", GXutil.rtrim( Z5349DisObsGrm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4813DisEncCli", GXutil.rtrim( Z4813DisEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4720DisDishCod", GXutil.rtrim( Z4720DisDishCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2743DisNumTex1", GXutil.ltrim( localUtil.ntoc( Z2743DisNumTex1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5032DisEstTip", GXutil.rtrim( Z5032DisEstTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4014DisTin", GXutil.rtrim( Z4014DisTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5290DisTipCor", GXutil.rtrim( Z5290DisTipCor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4471DisCruEnr", GXutil.rtrim( Z4471DisCruEnr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4479DisAcaMar", GXutil.rtrim( Z4479DisAcaMar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1052DisObs", GXutil.rtrim( Z1052DisObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1968DisRes", GXutil.rtrim( Z1968DisRes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5025DisGraCob", GXutil.ltrim( localUtil.ntoc( Z5025DisGraCob, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1122MaqCodDis", GXutil.rtrim( Z1122MaqCodDis));
      app.GxWebStd.gx_hidden_field( httpContext, "Z390DisTipCol", GXutil.ltrim( localUtil.ntoc( Z390DisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10887Cod_Idtx", GXutil.rtrim( Z10887Cod_Idtx));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_610", GXutil.ltrim( localUtil.ntoc( nGXsfl_610_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tdispol", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDISPOL" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ENTRADA PEDIDO LAVANDERIA", "") ;
   }

   public void initializeNonKey1IZ34( )
   {
      A391DisUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A391DisUni", GXutil.ltrimstr( A391DisUni, 9, 2));
      A381DisPieKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
      A385DisPieMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
      A386DisPieNor = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A386DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A386DisPieNor), 4, 0));
      A253CliCodDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A253CliCodDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A253CliCodDis), 6, 0));
      A399EmprCodDis = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A399EmprCodDis", A399EmprCodDis);
      A475FindCol = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A475FindCol", A475FindCol);
      A12115DisArtTipD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12115DisArtTipD", A12115DisArtTipD);
      A12116DisTipCD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12116DisTipCD", A12116DisTipCD);
      A757PriCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
      A337DisArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
      A340DisArtMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A340DisArtMat", A340DisArtMat);
      A339DisArtLar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A339DisArtLar", A339DisArtLar);
      A351DisArtSua = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A351DisArtSua", A351DisArtSua);
      A333DisArtAca = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A333DisArtAca", A333DisArtAca);
      A343DisArtPle = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A343DisArtPle", A343DisArtPle);
      A352DisArtTip = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A352DisArtTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A352DisArtTip), 4, 0));
      A338DisArtEnc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A338DisArtEnc", A338DisArtEnc);
      A336DisArtCor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A336DisArtCor", A336DisArtCor);
      A341DisArtOpe = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A341DisArtOpe", A341DisArtOpe);
      A353DisArtTr1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A353DisArtTr1", A353DisArtTr1);
      A344DisArtPt1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A344DisArtPt1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A344DisArtPt1), 3, 0));
      A354DisArtTr2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A354DisArtTr2", A354DisArtTr2);
      A345DisArtPt2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A345DisArtPt2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A345DisArtPt2), 3, 0));
      A355DisArtTr3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A355DisArtTr3", A355DisArtTr3);
      A346DisArtPt3 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A346DisArtPt3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A346DisArtPt3), 3, 0));
      A350DisArtRdt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A350DisArtRdt", GXutil.ltrimstr( A350DisArtRdt, 6, 2));
      A359DisArtUrg = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A359DisArtUrg", GXutil.str( A359DisArtUrg, 1, 0));
      A356DisArtUr1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A356DisArtUr1", A356DisArtUr1);
      A347DisArtPu1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A347DisArtPu1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A347DisArtPu1), 3, 0));
      A357DisArtUr2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A357DisArtUr2", A357DisArtUr2);
      A348DisArtPu2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A348DisArtPu2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A348DisArtPu2), 3, 0));
      A358DisArtUr3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A358DisArtUr3", A358DisArtUr3);
      A349DisArtPu3 = (short)(0) ;
      n349DisArtPu3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A349DisArtPu3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A349DisArtPu3), 3, 0));
      A342DisArtPes = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A342DisArtPes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A342DisArtPes), 4, 0));
      A334DisArtAnh = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A334DisArtAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A334DisArtAnh), 3, 0));
      A1231DisArtAn1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1231DisArtAn1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1231DisArtAn1), 3, 0));
      A1232DisArtAcb = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1232DisArtAcb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1232DisArtAcb), 3, 0));
      A1233DisArtAc2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1233DisArtAc2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1233DisArtAc2), 3, 0));
      A387DisPiePie = (short)(0) ;
      n387DisPiePie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
      A367DisEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A367DisEst", GXutil.str( A367DisEst, 1, 0));
      A388DisPreKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
      A389DisPreMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
      A383DisPieLan = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A383DisPieLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A383DisPieLan), 4, 0));
      A372DisKgmLan = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A372DisKgmLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A372DisKgmLan), 4, 0));
      A373DisMtrLan = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A373DisMtrLan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A373DisMtrLan), 4, 0));
      A362DisColNom = "" ;
      n362DisColNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", A362DisColNom);
      A363DisColNum = 0 ;
      n363DisColNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A363DisColNum), 6, 0));
      A1195DisNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1195DisNomCli", A1195DisNomCli);
      A1196DisNumCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1196DisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1196DisNumCli), 6, 0));
      A1197DisEncCom = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1197DisEncCom", GXutil.ltrimstr( A1197DisEncCom, 6, 2));
      A1198DisEncAnh = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1198DisEncAnh", GXutil.ltrimstr( A1198DisEncAnh, 6, 2));
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
      A379DisPie = (short)(0) ;
      n379DisPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A379DisPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A379DisPie), 4, 0));
      A1225DisGraCru = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1225DisGraCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1225DisGraCru), 4, 0));
      A1430DisLoc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1430DisLoc", A1430DisLoc);
      A1502DisPart = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1502DisPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1502DisPart), 4, 0));
      A1906DisGraAca = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1906DisGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1906DisGraAca), 4, 0));
      A1907DisRdoN = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1907DisRdoN", GXutil.ltrimstr( A1907DisRdoN, 6, 2));
      A1908DisRdoA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1908DisRdoA", GXutil.ltrimstr( A1908DisRdoA, 6, 2));
      A2009DisTipDis = "" ;
      n2009DisTipDis = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2009DisTipDis", A2009DisTipDis);
      A2831DisNumLot = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2831DisNumLot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2831DisNumLot), 8, 0));
      A2832DisKgsLot = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2832DisKgsLot", GXutil.ltrimstr( A2832DisKgsLot, 9, 2));
      A2833DisMtrLot = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2833DisMtrLot", GXutil.ltrimstr( A2833DisMtrLot, 9, 2));
      A2835DisPle2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2835DisPle2", A2835DisPle2);
      A3127DisNumCor = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3127DisNumCor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3127DisNumCor), 4, 0));
      A3128DisAncSal1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3128DisAncSal1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3128DisAncSal1), 4, 0));
      A3129DisAncSal2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3129DisAncSal2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3129DisAncSal2), 4, 0));
      A3130DisAncSal3 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3130DisAncSal3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3130DisAncSal3), 4, 0));
      A3131DisGraAca2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3131DisGraAca2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3131DisGraAca2), 4, 0));
      A3132DisGraCru2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3132DisGraCru2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3132DisGraCru2), 4, 0));
      A3306DisFac = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3306DisFac", A3306DisFac);
      A3307DisManCod1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3307DisManCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3307DisManCod1), 4, 0));
      A3308DisManCod2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3308DisManCod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3308DisManCod2), 4, 0));
      A3309DisNumTon = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3309DisNumTon", A3309DisNumTon);
      A4614DisMdlCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4614DisMdlCod", A4614DisMdlCod);
      A4615DisTam = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4615DisTam", A4615DisTam);
      A4293DisNPzas = 0 ;
      n4293DisNPzas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4293DisNPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4293DisNPzas), 6, 0));
      A4616DisHorEnt = GXutil.resetTime( GXutil.nullDate() );
      n4616DisHorEnt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4616DisHorEnt", localUtil.ttoc( A4616DisHorEnt, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A4294DisNPzasL = 0 ;
      n4294DisNPzasL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4294DisNPzasL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4294DisNPzasL), 6, 0));
      A4617DisHorReg = GXutil.resetTime( GXutil.nullDate() );
      n4617DisHorReg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4617DisHorReg", localUtil.ttoc( A4617DisHorReg, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A5252DisAcc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5252DisAcc", A5252DisAcc);
      A5366DisAntp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5366DisAntp", A5366DisAntp);
      A5405DisAntpT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5405DisAntpT", A5405DisAntpT);
      A2926DisPla = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2926DisPla", A2926DisPla);
      A4013DisEnv = (byte)(0) ;
      n4013DisEnv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4013DisEnv", GXutil.str( A4013DisEnv, 1, 0));
      A366DisEnt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A366DisEnt", A366DisEnt);
      A4477DisAcaBak = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4477DisAcaBak", A4477DisAcaBak);
      A5350DisObsAnc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5350DisObsAnc", A5350DisObsAnc);
      A5349DisObsGrm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5349DisObsGrm", A5349DisObsGrm);
      A4813DisEncCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4813DisEncCli", A4813DisEncCli);
      A4720DisDishCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4720DisDishCod", A4720DisDishCod);
      A2743DisNumTex1 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2743DisNumTex1", GXutil.str( A2743DisNumTex1, 1, 0));
      A5032DisEstTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5032DisEstTip", A5032DisEstTip);
      A4014DisTin = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4014DisTin", A4014DisTin);
      A5290DisTipCor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5290DisTipCor", A5290DisTipCor);
      A4471DisCruEnr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4471DisCruEnr", A4471DisCruEnr);
      A4479DisAcaMar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4479DisAcaMar", A4479DisAcaMar);
      A1052DisObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1052DisObs", A1052DisObs);
      A1968DisRes = "" ;
      n1968DisRes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1968DisRes", A1968DisRes);
      A5025DisGraCob = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5025DisGraCob", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5025DisGraCob), 2, 0));
      A10887Cod_Idtx = "" ;
      n10887Cod_Idtx = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10887Cod_Idtx", A10887Cod_Idtx);
      A10888Dsc_Idtx = "" ;
      n10888Dsc_Idtx = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10888Dsc_Idtx", A10888Dsc_Idtx);
      A1122MaqCodDis = "" ;
      n1122MaqCodDis = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1122MaqCodDis", A1122MaqCodDis);
      Z757PriCod = "" ;
      Z360DisCliNum = "" ;
      Z370DisFecCli = GXutil.nullDate() ;
      Z335DisArtCod = "" ;
      Z369DisFec = GXutil.nullDate() ;
      Z371DisFecEnt = GXutil.nullDate() ;
      Z337DisArtDsc = "" ;
      Z340DisArtMat = "" ;
      Z339DisArtLar = "" ;
      Z351DisArtSua = "" ;
      Z333DisArtAca = "" ;
      Z343DisArtPle = "" ;
      Z352DisArtTip = (short)(0) ;
      Z338DisArtEnc = "" ;
      Z336DisArtCor = "" ;
      Z341DisArtOpe = "" ;
      Z353DisArtTr1 = "" ;
      Z344DisArtPt1 = (short)(0) ;
      Z354DisArtTr2 = "" ;
      Z345DisArtPt2 = (short)(0) ;
      Z355DisArtTr3 = "" ;
      Z346DisArtPt3 = (short)(0) ;
      Z350DisArtRdt = DecimalUtil.ZERO ;
      Z359DisArtUrg = (byte)(0) ;
      Z356DisArtUr1 = "" ;
      Z347DisArtPu1 = (short)(0) ;
      Z357DisArtUr2 = "" ;
      Z348DisArtPu2 = (short)(0) ;
      Z358DisArtUr3 = "" ;
      Z349DisArtPu3 = (short)(0) ;
      Z342DisArtPes = (short)(0) ;
      Z334DisArtAnh = (short)(0) ;
      Z1231DisArtAn1 = (short)(0) ;
      Z1232DisArtAcb = (short)(0) ;
      Z1233DisArtAc2 = (short)(0) ;
      Z367DisEst = (byte)(0) ;
      Z388DisPreKgm = DecimalUtil.ZERO ;
      Z389DisPreMtr = DecimalUtil.ZERO ;
      Z383DisPieLan = (short)(0) ;
      Z372DisKgmLan = (short)(0) ;
      Z373DisMtrLan = (short)(0) ;
      Z362DisColNom = "" ;
      Z363DisColNum = 0 ;
      Z1195DisNomCli = "" ;
      Z1196DisNumCli = 0 ;
      Z1197DisEncCom = DecimalUtil.ZERO ;
      Z1198DisEncAnh = DecimalUtil.ZERO ;
      Z365DisDes = "" ;
      Z374DisNumPie = (short)(0) ;
      Z375DisNumUni = DecimalUtil.ZERO ;
      Z392DisUniMed = "" ;
      Z1225DisGraCru = (short)(0) ;
      Z1430DisLoc = "" ;
      Z1502DisPart = (short)(0) ;
      Z1906DisGraAca = (short)(0) ;
      Z1907DisRdoN = DecimalUtil.ZERO ;
      Z1908DisRdoA = DecimalUtil.ZERO ;
      Z2009DisTipDis = "" ;
      Z2831DisNumLot = 0 ;
      Z2832DisKgsLot = DecimalUtil.ZERO ;
      Z2833DisMtrLot = DecimalUtil.ZERO ;
      Z2835DisPle2 = "" ;
      Z3127DisNumCor = (short)(0) ;
      Z3128DisAncSal1 = (short)(0) ;
      Z3129DisAncSal2 = (short)(0) ;
      Z3130DisAncSal3 = (short)(0) ;
      Z3131DisGraAca2 = (short)(0) ;
      Z3132DisGraCru2 = (short)(0) ;
      Z3306DisFac = "" ;
      Z3307DisManCod1 = (short)(0) ;
      Z3308DisManCod2 = (short)(0) ;
      Z3309DisNumTon = "" ;
      Z4614DisMdlCod = "" ;
      Z4615DisTam = "" ;
      Z4293DisNPzas = 0 ;
      Z4616DisHorEnt = GXutil.resetTime( GXutil.nullDate() );
      Z4294DisNPzasL = 0 ;
      Z4617DisHorReg = GXutil.resetTime( GXutil.nullDate() );
      Z5252DisAcc = "" ;
      Z5366DisAntp = "" ;
      Z5405DisAntpT = "" ;
      Z2926DisPla = "" ;
      Z4013DisEnv = (byte)(0) ;
      Z366DisEnt = "" ;
      Z4477DisAcaBak = "" ;
      Z5350DisObsAnc = "" ;
      Z5349DisObsGrm = "" ;
      Z4813DisEncCli = "" ;
      Z4720DisDishCod = "" ;
      Z2743DisNumTex1 = (byte)(0) ;
      Z5032DisEstTip = "" ;
      Z4014DisTin = "" ;
      Z5290DisTipCor = "" ;
      Z4471DisCruEnr = "" ;
      Z4479DisAcaMar = "" ;
      Z1052DisObs = "" ;
      Z1968DisRes = "" ;
      Z5025DisGraCob = (byte)(0) ;
      Z252CliCod = 0 ;
      Z1122MaqCodDis = "" ;
      Z390DisTipCol = (byte)(0) ;
      Z10887Cod_Idtx = "" ;
   }

   public void initAll1IZ34( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      initializeNonKey1IZ34( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1IZ38( )
   {
      A759ProDsc = "" ;
   }

   public void initAll1IZ38( )
   {
      A758ProCod = "" ;
      initializeNonKey1IZ38( ) ;
   }

   public void standaloneModalInsert1IZ38( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241592035", true, true);
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
      httpContext.AddJavascriptSource("tdispol.js", "?20268241592035", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties38( )
   {
      edtProCod_Enabled = defedtProCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_610_Refreshing);
   }

   public void startgridcontrol610( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_38, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_38_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A759ProDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      chkPriCod.setInternalname( "PRICOD" );
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtDisCod_Internalname = "DISCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
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
      edtDisArtDsc_Internalname = "DISARTDSC" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtDisArtMat_Internalname = "DISARTMAT" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtDisArtLar_Internalname = "DISARTLAR" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtDisArtSua_Internalname = "DISARTSUA" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtDisArtAca_Internalname = "DISARTACA" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtDisArtPle_Internalname = "DISARTPLE" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtDisArtTip_Internalname = "DISARTTIP" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtDisArtTipD_Internalname = "DISARTTIPD" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      chkDisArtEnc.setInternalname( "DISARTENC" );
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      chkDisArtCor.setInternalname( "DISARTCOR" );
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtDisArtOpe_Internalname = "DISARTOPE" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtDisArtTr1_Internalname = "DISARTTR1" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtDisArtPt1_Internalname = "DISARTPT1" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtDisArtTr2_Internalname = "DISARTTR2" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtDisArtPt2_Internalname = "DISARTPT2" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtDisArtTr3_Internalname = "DISARTTR3" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtDisArtPt3_Internalname = "DISARTPT3" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtDisArtRdt_Internalname = "DISARTRDT" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtDisArtUrg_Internalname = "DISARTURG" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtDisArtUr1_Internalname = "DISARTUR1" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtDisArtPu1_Internalname = "DISARTPU1" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtDisArtUr2_Internalname = "DISARTUR2" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtDisArtPu2_Internalname = "DISARTPU2" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtDisArtUr3_Internalname = "DISARTUR3" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtDisArtPu3_Internalname = "DISARTPU3" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtDisArtPes_Internalname = "DISARTPES" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtDisArtAnh_Internalname = "DISARTANH" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtDisArtAn1_Internalname = "DISARTAN1" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtDisArtAcb_Internalname = "DISARTACB" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtDisArtAc2_Internalname = "DISARTAC2" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtDisPiePie_Internalname = "DISPIEPIE" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtDisPieMtr_Internalname = "DISPIEMTR" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtDisPieKgm_Internalname = "DISPIEKGM" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      cmbDisEst.setInternalname( "DISEST" );
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtDisPreKgm_Internalname = "DISPREKGM" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      edtDisPreMtr_Internalname = "DISPREMTR" ;
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      edtDisPieLan_Internalname = "DISPIELAN" ;
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtDisKgmLan_Internalname = "DISKGMLAN" ;
      lblTextblock50_Internalname = "TEXTBLOCK50" ;
      edtDisMtrLan_Internalname = "DISMTRLAN" ;
      lblTextblock51_Internalname = "TEXTBLOCK51" ;
      edtDisColNom_Internalname = "DISCOLNOM" ;
      lblTextblock52_Internalname = "TEXTBLOCK52" ;
      edtDisColNum_Internalname = "DISCOLNUM" ;
      lblTextblock53_Internalname = "TEXTBLOCK53" ;
      edtDisNomCli_Internalname = "DISNOMCLI" ;
      lblTextblock54_Internalname = "TEXTBLOCK54" ;
      edtDisNumCli_Internalname = "DISNUMCLI" ;
      lblTextblock55_Internalname = "TEXTBLOCK55" ;
      edtDisEncCom_Internalname = "DISENCCOM" ;
      lblTextblock56_Internalname = "TEXTBLOCK56" ;
      edtDisEncAnh_Internalname = "DISENCANH" ;
      lblTextblock57_Internalname = "TEXTBLOCK57" ;
      edtDisTipCol_Internalname = "DISTIPCOL" ;
      lblTextblock58_Internalname = "TEXTBLOCK58" ;
      edtDisTipCD_Internalname = "DISTIPCD" ;
      lblTextblock59_Internalname = "TEXTBLOCK59" ;
      chkDisDes.setInternalname( "DISDES" );
      lblTextblock60_Internalname = "TEXTBLOCK60" ;
      edtDisNumPie_Internalname = "DISNUMPIE" ;
      lblTextblock61_Internalname = "TEXTBLOCK61" ;
      edtDisNumUni_Internalname = "DISNUMUNI" ;
      lblTextblock62_Internalname = "TEXTBLOCK62" ;
      edtDisUniMed_Internalname = "DISUNIMED" ;
      lblTextblock63_Internalname = "TEXTBLOCK63" ;
      edtEmprCodDis_Internalname = "EMPRCODDIS" ;
      lblTextblock64_Internalname = "TEXTBLOCK64" ;
      edtCliCodDis_Internalname = "CLICODDIS" ;
      lblTextblock65_Internalname = "TEXTBLOCK65" ;
      edtFindCol_Internalname = "FINDCOL" ;
      lblTextblock66_Internalname = "TEXTBLOCK66" ;
      edtDisPie_Internalname = "DISPIE" ;
      lblTextblock67_Internalname = "TEXTBLOCK67" ;
      edtDisUni_Internalname = "DISUNI" ;
      lblTextblock68_Internalname = "TEXTBLOCK68" ;
      edtDisGraCru_Internalname = "DISGRACRU" ;
      lblTextblock69_Internalname = "TEXTBLOCK69" ;
      edtDisPieNor_Internalname = "DISPIENOR" ;
      lblTextblock70_Internalname = "TEXTBLOCK70" ;
      edtDisLoc_Internalname = "DISLOC" ;
      lblTextblock71_Internalname = "TEXTBLOCK71" ;
      edtDisPart_Internalname = "DISPART" ;
      lblTextblock72_Internalname = "TEXTBLOCK72" ;
      edtDisGraAca_Internalname = "DISGRAACA" ;
      lblTextblock73_Internalname = "TEXTBLOCK73" ;
      edtDisRdoN_Internalname = "DISRDON" ;
      lblTextblock74_Internalname = "TEXTBLOCK74" ;
      edtDisRdoA_Internalname = "DISRDOA" ;
      lblTextblock75_Internalname = "TEXTBLOCK75" ;
      edtDisTipDis_Internalname = "DISTIPDIS" ;
      lblTextblock76_Internalname = "TEXTBLOCK76" ;
      edtDisNumLot_Internalname = "DISNUMLOT" ;
      lblTextblock77_Internalname = "TEXTBLOCK77" ;
      edtDisKgsLot_Internalname = "DISKGSLOT" ;
      lblTextblock78_Internalname = "TEXTBLOCK78" ;
      edtDisMtrLot_Internalname = "DISMTRLOT" ;
      lblTextblock79_Internalname = "TEXTBLOCK79" ;
      edtDisPle2_Internalname = "DISPLE2" ;
      lblTextblock80_Internalname = "TEXTBLOCK80" ;
      edtDisNumCor_Internalname = "DISNUMCOR" ;
      lblTextblock81_Internalname = "TEXTBLOCK81" ;
      edtDisAncSal1_Internalname = "DISANCSAL1" ;
      lblTextblock82_Internalname = "TEXTBLOCK82" ;
      edtDisAncSal2_Internalname = "DISANCSAL2" ;
      lblTextblock83_Internalname = "TEXTBLOCK83" ;
      edtDisAncSal3_Internalname = "DISANCSAL3" ;
      lblTextblock84_Internalname = "TEXTBLOCK84" ;
      edtDisGraAca2_Internalname = "DISGRAACA2" ;
      lblTextblock85_Internalname = "TEXTBLOCK85" ;
      edtDisGraCru2_Internalname = "DISGRACRU2" ;
      lblTextblock86_Internalname = "TEXTBLOCK86" ;
      chkDisFac.setInternalname( "DISFAC" );
      lblTextblock87_Internalname = "TEXTBLOCK87" ;
      edtDisManCod1_Internalname = "DISMANCOD1" ;
      lblTextblock88_Internalname = "TEXTBLOCK88" ;
      edtDisManCod2_Internalname = "DISMANCOD2" ;
      lblTextblock89_Internalname = "TEXTBLOCK89" ;
      edtDisNumTon_Internalname = "DISNUMTON" ;
      lblTextblock90_Internalname = "TEXTBLOCK90" ;
      edtDisMdlCod_Internalname = "DISMDLCOD" ;
      lblTextblock91_Internalname = "TEXTBLOCK91" ;
      edtDisTam_Internalname = "DISTAM" ;
      lblTextblock92_Internalname = "TEXTBLOCK92" ;
      edtDisNPzas_Internalname = "DISNPZAS" ;
      lblTextblock93_Internalname = "TEXTBLOCK93" ;
      edtDisHorEnt_Internalname = "DISHORENT" ;
      lblTextblock94_Internalname = "TEXTBLOCK94" ;
      edtDisNPzasL_Internalname = "DISNPZASL" ;
      lblTextblock95_Internalname = "TEXTBLOCK95" ;
      edtDisHorReg_Internalname = "DISHORREG" ;
      lblTextblock96_Internalname = "TEXTBLOCK96" ;
      chkDisAcc.setInternalname( "DISACC" );
      lblTextblock97_Internalname = "TEXTBLOCK97" ;
      edtDisAntp_Internalname = "DISANTP" ;
      lblTextblock98_Internalname = "TEXTBLOCK98" ;
      edtDisAntpT_Internalname = "DISANTPT" ;
      lblTextblock99_Internalname = "TEXTBLOCK99" ;
      chkDisPla.setInternalname( "DISPLA" );
      lblTextblock100_Internalname = "TEXTBLOCK100" ;
      edtDisEnv_Internalname = "DISENV" ;
      lblTextblock101_Internalname = "TEXTBLOCK101" ;
      edtDisEnt_Internalname = "DISENT" ;
      lblTextblock102_Internalname = "TEXTBLOCK102" ;
      chkDisAcaBak.setInternalname( "DISACABAK" );
      lblTextblock103_Internalname = "TEXTBLOCK103" ;
      edtDisObsAnc_Internalname = "DISOBSANC" ;
      lblTextblock104_Internalname = "TEXTBLOCK104" ;
      edtDisObsGrm_Internalname = "DISOBSGRM" ;
      lblTextblock105_Internalname = "TEXTBLOCK105" ;
      edtDisEncCli_Internalname = "DISENCCLI" ;
      lblTextblock106_Internalname = "TEXTBLOCK106" ;
      edtDisDishCod_Internalname = "DISDISHCOD" ;
      lblTextblock107_Internalname = "TEXTBLOCK107" ;
      edtDisNumTex1_Internalname = "DISNUMTEX1" ;
      lblTextblock108_Internalname = "TEXTBLOCK108" ;
      chkDisEstTip.setInternalname( "DISESTTIP" );
      lblTextblock109_Internalname = "TEXTBLOCK109" ;
      chkDisTin.setInternalname( "DISTIN" );
      lblTextblock110_Internalname = "TEXTBLOCK110" ;
      edtDisTipCor_Internalname = "DISTIPCOR" ;
      lblTextblock111_Internalname = "TEXTBLOCK111" ;
      edtDisCruEnr_Internalname = "DISCRUENR" ;
      lblTextblock112_Internalname = "TEXTBLOCK112" ;
      edtDisAcaMar_Internalname = "DISACAMAR" ;
      lblTextblock113_Internalname = "TEXTBLOCK113" ;
      edtDisObs_Internalname = "DISOBS" ;
      lblTextblock114_Internalname = "TEXTBLOCK114" ;
      edtDisRes_Internalname = "DISRES" ;
      lblTextblock115_Internalname = "TEXTBLOCK115" ;
      edtDisGraCob_Internalname = "DISGRACOB" ;
      lblTextblock116_Internalname = "TEXTBLOCK116" ;
      edtCod_Idtx_Internalname = "COD_IDTX" ;
      lblTextblock117_Internalname = "TEXTBLOCK117" ;
      edtDsc_Idtx_Internalname = "DSC_IDTX" ;
      lblTextblock118_Internalname = "TEXTBLOCK118" ;
      edtMaqCodDis_Internalname = "MAQCODDIS" ;
      edtavnRcdDeleted_38_Internalname = "vNRCDDELETED_38" ;
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
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
      Form.setCaption( httpContext.getMessage( "ENTRADA PEDIDO LAVANDERIA", "") );
      edtProDsc_Jsonclick = "" ;
      edtProCod_Jsonclick = "" ;
      edtavnRcdDeleted_38_Jsonclick = "" ;
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
      edtProDsc_Enabled = 0 ;
      edtProCod_Enabled = 1 ;
      edtavnRcdDeleted_38_Enabled = 1 ;
      edtMaqCodDis_Jsonclick = "" ;
      edtMaqCodDis_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCodDis_Enabled = 1 ;
      edtDsc_Idtx_Jsonclick = "" ;
      edtDsc_Idtx_Backcolor = (int)(0xFFFFFF) ;
      edtDsc_Idtx_Enabled = 0 ;
      edtCod_Idtx_Jsonclick = "" ;
      edtCod_Idtx_Backcolor = (int)(0xFFFFFF) ;
      edtCod_Idtx_Enabled = 1 ;
      edtDisGraCob_Jsonclick = "" ;
      edtDisGraCob_Backcolor = (int)(0xFFFFFF) ;
      edtDisGraCob_Enabled = 1 ;
      edtDisRes_Jsonclick = "" ;
      edtDisRes_Backcolor = (int)(0xFFFFFF) ;
      edtDisRes_Enabled = 1 ;
      edtDisObs_Jsonclick = "" ;
      edtDisObs_Backcolor = (int)(0xFFFFFF) ;
      edtDisObs_Enabled = 1 ;
      edtDisAcaMar_Jsonclick = "" ;
      edtDisAcaMar_Backcolor = (int)(0xFFFFFF) ;
      edtDisAcaMar_Enabled = 1 ;
      edtDisCruEnr_Jsonclick = "" ;
      edtDisCruEnr_Backcolor = (int)(0xFFFFFF) ;
      edtDisCruEnr_Enabled = 1 ;
      edtDisTipCor_Jsonclick = "" ;
      edtDisTipCor_Backcolor = (int)(0xFFFFFF) ;
      edtDisTipCor_Enabled = 1 ;
      chkDisTin.setIBackground( (int)(0x00FF00) );
      chkDisTin.setEnabled( 1 );
      chkDisEstTip.setIBackground( (int)(0xFFFFFF) );
      chkDisEstTip.setEnabled( 1 );
      edtDisNumTex1_Jsonclick = "" ;
      edtDisNumTex1_Backcolor = (int)(0xFFFFFF) ;
      edtDisNumTex1_Enabled = 1 ;
      edtDisDishCod_Jsonclick = "" ;
      edtDisDishCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisDishCod_Enabled = 1 ;
      edtDisEncCli_Jsonclick = "" ;
      edtDisEncCli_Backcolor = (int)(0xFFFFFF) ;
      edtDisEncCli_Enabled = 1 ;
      edtDisObsGrm_Jsonclick = "" ;
      edtDisObsGrm_Backcolor = (int)(0xFFFFFF) ;
      edtDisObsGrm_Enabled = 1 ;
      edtDisObsAnc_Jsonclick = "" ;
      edtDisObsAnc_Backcolor = (int)(0xFFFFFF) ;
      edtDisObsAnc_Enabled = 1 ;
      chkDisAcaBak.setIBackground( (int)(0xFFFFFF) );
      chkDisAcaBak.setEnabled( 1 );
      edtDisEnt_Jsonclick = "" ;
      edtDisEnt_Backcolor = (int)(0xFFFFFF) ;
      edtDisEnt_Enabled = 1 ;
      edtDisEnv_Jsonclick = "" ;
      edtDisEnv_Backcolor = (int)(0xFFFFFF) ;
      edtDisEnv_Enabled = 1 ;
      chkDisPla.setIBackground( (int)(0xFFFFFF) );
      chkDisPla.setEnabled( 1 );
      edtDisAntpT_Jsonclick = "" ;
      edtDisAntpT_Backcolor = (int)(0xFFFFFF) ;
      edtDisAntpT_Enabled = 1 ;
      edtDisAntp_Jsonclick = "" ;
      edtDisAntp_Backcolor = (int)(0xFFFFFF) ;
      edtDisAntp_Enabled = 1 ;
      chkDisAcc.setIBackground( (int)(0xFFFFFF) );
      chkDisAcc.setEnabled( 1 );
      edtDisHorReg_Jsonclick = "" ;
      edtDisHorReg_Backcolor = (int)(0xFFFFFF) ;
      edtDisHorReg_Enabled = 1 ;
      edtDisNPzasL_Jsonclick = "" ;
      edtDisNPzasL_Backcolor = (int)(0xFFFFFF) ;
      edtDisNPzasL_Enabled = 1 ;
      edtDisHorEnt_Jsonclick = "" ;
      edtDisHorEnt_Backcolor = (int)(0xFFFFFF) ;
      edtDisHorEnt_Enabled = 1 ;
      edtDisNPzas_Jsonclick = "" ;
      edtDisNPzas_Backcolor = (int)(0xFFFFFF) ;
      edtDisNPzas_Enabled = 1 ;
      edtDisTam_Jsonclick = "" ;
      edtDisTam_Backcolor = (int)(0xFFFFFF) ;
      edtDisTam_Enabled = 1 ;
      edtDisMdlCod_Jsonclick = "" ;
      edtDisMdlCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisMdlCod_Enabled = 1 ;
      edtDisNumTon_Jsonclick = "" ;
      edtDisNumTon_Backcolor = (int)(0xFFFFFF) ;
      edtDisNumTon_Enabled = 1 ;
      edtDisManCod2_Jsonclick = "" ;
      edtDisManCod2_Backcolor = (int)(0xFFFFFF) ;
      edtDisManCod2_Enabled = 1 ;
      edtDisManCod1_Jsonclick = "" ;
      edtDisManCod1_Backcolor = (int)(0xFFFFFF) ;
      edtDisManCod1_Enabled = 1 ;
      chkDisFac.setIBackground( (int)(0xFFFFFF) );
      chkDisFac.setEnabled( 1 );
      edtDisGraCru2_Jsonclick = "" ;
      edtDisGraCru2_Backcolor = (int)(0xFFFFFF) ;
      edtDisGraCru2_Enabled = 1 ;
      edtDisGraAca2_Jsonclick = "" ;
      edtDisGraAca2_Backcolor = (int)(0xFFFFFF) ;
      edtDisGraAca2_Enabled = 1 ;
      edtDisAncSal3_Jsonclick = "" ;
      edtDisAncSal3_Backcolor = (int)(0xFFFFFF) ;
      edtDisAncSal3_Enabled = 1 ;
      edtDisAncSal2_Jsonclick = "" ;
      edtDisAncSal2_Backcolor = (int)(0xFFFFFF) ;
      edtDisAncSal2_Enabled = 1 ;
      edtDisAncSal1_Jsonclick = "" ;
      edtDisAncSal1_Backcolor = (int)(0xFFFFFF) ;
      edtDisAncSal1_Enabled = 1 ;
      edtDisNumCor_Jsonclick = "" ;
      edtDisNumCor_Backcolor = (int)(0xFFFFFF) ;
      edtDisNumCor_Enabled = 1 ;
      edtDisPle2_Jsonclick = "" ;
      edtDisPle2_Backcolor = (int)(0xFFFFFF) ;
      edtDisPle2_Enabled = 1 ;
      edtDisMtrLot_Jsonclick = "" ;
      edtDisMtrLot_Backcolor = (int)(0xFFFFFF) ;
      edtDisMtrLot_Enabled = 1 ;
      edtDisKgsLot_Jsonclick = "" ;
      edtDisKgsLot_Backcolor = (int)(0xFFFFFF) ;
      edtDisKgsLot_Enabled = 1 ;
      edtDisNumLot_Jsonclick = "" ;
      edtDisNumLot_Backcolor = (int)(0xFFFFFF) ;
      edtDisNumLot_Enabled = 1 ;
      edtDisTipDis_Jsonclick = "" ;
      edtDisTipDis_Backcolor = (int)(0xFFFFFF) ;
      edtDisTipDis_Enabled = 1 ;
      edtDisRdoA_Jsonclick = "" ;
      edtDisRdoA_Backcolor = (int)(0xFFFFFF) ;
      edtDisRdoA_Enabled = 1 ;
      edtDisRdoN_Jsonclick = "" ;
      edtDisRdoN_Backcolor = (int)(0xFFFFFF) ;
      edtDisRdoN_Enabled = 1 ;
      edtDisGraAca_Jsonclick = "" ;
      edtDisGraAca_Backcolor = (int)(0xFFFFFF) ;
      edtDisGraAca_Enabled = 1 ;
      edtDisPart_Jsonclick = "" ;
      edtDisPart_Backcolor = (int)(0xFFFFFF) ;
      edtDisPart_Enabled = 1 ;
      edtDisLoc_Jsonclick = "" ;
      edtDisLoc_Backcolor = (int)(0xFFFFFF) ;
      edtDisLoc_Enabled = 1 ;
      edtDisPieNor_Jsonclick = "" ;
      edtDisPieNor_Backcolor = (int)(0xFFFFFF) ;
      edtDisPieNor_Enabled = 0 ;
      edtDisGraCru_Jsonclick = "" ;
      edtDisGraCru_Backcolor = (int)(0xFFFFFF) ;
      edtDisGraCru_Enabled = 1 ;
      edtDisUni_Jsonclick = "" ;
      edtDisUni_Backcolor = (int)(0xFFFFFF) ;
      edtDisUni_Enabled = 0 ;
      edtDisPie_Jsonclick = "" ;
      edtDisPie_Backcolor = (int)(0xFFFFFF) ;
      edtDisPie_Enabled = 0 ;
      edtFindCol_Jsonclick = "" ;
      edtFindCol_Backcolor = (int)(0xFFFFFF) ;
      edtFindCol_Enabled = 0 ;
      edtCliCodDis_Jsonclick = "" ;
      edtCliCodDis_Backcolor = (int)(0xFFFFFF) ;
      edtCliCodDis_Enabled = 0 ;
      edtEmprCodDis_Jsonclick = "" ;
      edtEmprCodDis_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCodDis_Enabled = 0 ;
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
      edtDisTipCD_Jsonclick = "" ;
      edtDisTipCD_Backcolor = (int)(0xFFFFFF) ;
      edtDisTipCD_Enabled = 0 ;
      edtDisTipCol_Jsonclick = "" ;
      edtDisTipCol_Backcolor = (int)(0xFFFFFF) ;
      edtDisTipCol_Enabled = 1 ;
      edtDisEncAnh_Jsonclick = "" ;
      edtDisEncAnh_Backcolor = (int)(0xFFFFFF) ;
      edtDisEncAnh_Enabled = 1 ;
      edtDisEncCom_Jsonclick = "" ;
      edtDisEncCom_Backcolor = (int)(0xFFFFFF) ;
      edtDisEncCom_Enabled = 1 ;
      edtDisNumCli_Jsonclick = "" ;
      edtDisNumCli_Backcolor = (int)(0xFFFFFF) ;
      edtDisNumCli_Enabled = 1 ;
      edtDisNomCli_Jsonclick = "" ;
      edtDisNomCli_Backcolor = (int)(0xFFFFFF) ;
      edtDisNomCli_Enabled = 1 ;
      edtDisColNum_Jsonclick = "" ;
      edtDisColNum_Backcolor = (int)(0xFFFFFF) ;
      edtDisColNum_Enabled = 1 ;
      edtDisColNom_Jsonclick = "" ;
      edtDisColNom_Backcolor = (int)(0xFFFFFF) ;
      edtDisColNom_Enabled = 1 ;
      edtDisMtrLan_Jsonclick = "" ;
      edtDisMtrLan_Backcolor = (int)(0xFFFFFF) ;
      edtDisMtrLan_Enabled = 1 ;
      edtDisKgmLan_Jsonclick = "" ;
      edtDisKgmLan_Backcolor = (int)(0xFFFFFF) ;
      edtDisKgmLan_Enabled = 1 ;
      edtDisPieLan_Jsonclick = "" ;
      edtDisPieLan_Backcolor = (int)(0xFFFFFF) ;
      edtDisPieLan_Enabled = 1 ;
      edtDisPreMtr_Jsonclick = "" ;
      edtDisPreMtr_Backcolor = (int)(0xFFFFFF) ;
      edtDisPreMtr_Enabled = 1 ;
      edtDisPreKgm_Jsonclick = "" ;
      edtDisPreKgm_Backcolor = (int)(0xFFFFFF) ;
      edtDisPreKgm_Enabled = 1 ;
      cmbDisEst.setJsonclick( "" );
      cmbDisEst.setEnabled( 1 );
      cmbDisEst.setIBackground( (int)(0xFFFFFF) );
      edtDisPieKgm_Jsonclick = "" ;
      edtDisPieKgm_Backcolor = (int)(0xFFFFFF) ;
      edtDisPieKgm_Enabled = 0 ;
      edtDisPieMtr_Jsonclick = "" ;
      edtDisPieMtr_Backcolor = (int)(0xFFFFFF) ;
      edtDisPieMtr_Enabled = 0 ;
      edtDisPiePie_Jsonclick = "" ;
      edtDisPiePie_Backcolor = (int)(0xFFFFFF) ;
      edtDisPiePie_Enabled = 0 ;
      edtDisArtAc2_Jsonclick = "" ;
      edtDisArtAc2_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtAc2_Enabled = 1 ;
      edtDisArtAcb_Jsonclick = "" ;
      edtDisArtAcb_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtAcb_Enabled = 1 ;
      edtDisArtAn1_Jsonclick = "" ;
      edtDisArtAn1_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtAn1_Enabled = 1 ;
      edtDisArtAnh_Jsonclick = "" ;
      edtDisArtAnh_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtAnh_Enabled = 1 ;
      edtDisArtPes_Jsonclick = "" ;
      edtDisArtPes_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtPes_Enabled = 1 ;
      edtDisArtPu3_Jsonclick = "" ;
      edtDisArtPu3_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtPu3_Enabled = 1 ;
      edtDisArtUr3_Jsonclick = "" ;
      edtDisArtUr3_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtUr3_Enabled = 1 ;
      edtDisArtPu2_Jsonclick = "" ;
      edtDisArtPu2_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtPu2_Enabled = 1 ;
      edtDisArtUr2_Jsonclick = "" ;
      edtDisArtUr2_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtUr2_Enabled = 1 ;
      edtDisArtPu1_Jsonclick = "" ;
      edtDisArtPu1_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtPu1_Enabled = 1 ;
      edtDisArtUr1_Jsonclick = "" ;
      edtDisArtUr1_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtUr1_Enabled = 1 ;
      edtDisArtUrg_Jsonclick = "" ;
      edtDisArtUrg_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtUrg_Enabled = 1 ;
      edtDisArtRdt_Jsonclick = "" ;
      edtDisArtRdt_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtRdt_Enabled = 1 ;
      edtDisArtPt3_Jsonclick = "" ;
      edtDisArtPt3_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtPt3_Enabled = 1 ;
      edtDisArtTr3_Jsonclick = "" ;
      edtDisArtTr3_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtTr3_Enabled = 1 ;
      edtDisArtPt2_Jsonclick = "" ;
      edtDisArtPt2_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtPt2_Enabled = 1 ;
      edtDisArtTr2_Jsonclick = "" ;
      edtDisArtTr2_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtTr2_Enabled = 1 ;
      edtDisArtPt1_Jsonclick = "" ;
      edtDisArtPt1_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtPt1_Enabled = 1 ;
      edtDisArtTr1_Jsonclick = "" ;
      edtDisArtTr1_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtTr1_Enabled = 1 ;
      edtDisArtOpe_Jsonclick = "" ;
      edtDisArtOpe_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtOpe_Enabled = 1 ;
      chkDisArtCor.setIBackground( (int)(0xFFFFFF) );
      chkDisArtCor.setEnabled( 1 );
      chkDisArtEnc.setIBackground( (int)(0xFFFFFF) );
      chkDisArtEnc.setEnabled( 1 );
      edtDisArtTipD_Jsonclick = "" ;
      edtDisArtTipD_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtTipD_Enabled = 0 ;
      edtDisArtTip_Jsonclick = "" ;
      edtDisArtTip_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtTip_Enabled = 1 ;
      edtDisArtPle_Jsonclick = "" ;
      edtDisArtPle_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtPle_Enabled = 1 ;
      edtDisArtAca_Jsonclick = "" ;
      edtDisArtAca_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtAca_Enabled = 1 ;
      edtDisArtSua_Jsonclick = "" ;
      edtDisArtSua_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtSua_Enabled = 1 ;
      edtDisArtLar_Jsonclick = "" ;
      edtDisArtLar_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtLar_Enabled = 1 ;
      edtDisArtMat_Jsonclick = "" ;
      edtDisArtMat_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtMat_Enabled = 1 ;
      edtDisArtDsc_Jsonclick = "" ;
      edtDisArtDsc_Backcolor = (int)(0xFFFFFF) ;
      edtDisArtDsc_Enabled = 1 ;
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
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Backcolor = (int)(0xFFFFFF) ;
      edtDisCod_Enabled = 1 ;
      chkPriCod.setIBackground( (int)(0xFFFFFF) );
      chkPriCod.setEnabled( 1 );
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 1 ;
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

   public void gx11asadisarttipd1IZ34( String A396EmprCod ,
                                       short A352DisArtTip )
   {
      GXt_char1 = A12115DisArtTipD ;
      GXv_char4[0] = GXt_char1 ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A352DisArtTip, GXv_char4) ;
      tdispol_impl.this.GXt_char1 = GXv_char4[0] ;
      A12115DisArtTipD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12115DisArtTipD", A12115DisArtTipD);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12115DisArtTipD))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx12asafindcol1IZ34( String A396EmprCod ,
                                    int A252CliCod ,
                                    String A335DisArtCod ,
                                    String A362DisColNom ,
                                    int A363DisColNum ,
                                    byte A390DisTipCol )
   {
      GXt_char1 = A475FindCol ;
      GXv_char4[0] = GXt_char1 ;
      new app.pedidos.dis_findcol_validate(remoteHandle, context).execute( A396EmprCod, A252CliCod, A335DisArtCod, A362DisColNom, A363DisColNum, A390DisTipCol, GXv_char4) ;
      tdispol_impl.this.GXt_char1 = GXv_char4[0] ;
      A475FindCol = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A475FindCol", A475FindCol);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A475FindCol))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx15asadisuni1IZ34( String A396EmprCod ,
                                   int A361DisCod ,
                                   String A392DisUniMed )
   {
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
      {
         A391DisUni = getDisUni0( A396EmprCod, A361DisCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A391DisUni", GXutil.ltrimstr( A391DisUni, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 )
         {
            A391DisUni = getDisUni1( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A391DisUni", GXutil.ltrimstr( A391DisUni, 9, 2));
         }
         else
         {
            A391DisUni = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A391DisUni", GXutil.ltrimstr( A391DisUni, 9, 2));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A391DisUni, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx16asadispiekgm1IZ34( String A396EmprCod ,
                                      int A361DisCod ,
                                      String A365DisDes )
   {
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         }
         else
         {
            A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrimstr( A381DisPieKgm, 9, 2));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A381DisPieKgm, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx17asadispiemtr1IZ34( String A396EmprCod ,
                                      int A361DisCod ,
                                      String A365DisDes )
   {
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         }
         else
         {
            A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrimstr( A385DisPieMtr, 9, 2));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx18asadispienor1IZ34( String A396EmprCod ,
                                      int A361DisCod ,
                                      String A365DisDes )
   {
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A386DisPieNor = (short)(getDisPieNor0( A396EmprCod, A361DisCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A386DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A386DisPieNor), 4, 0));
      }
      else
      {
         A386DisPieNor = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A386DisPieNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A386DisPieNor), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A386DisPieNor, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_61038( ) ;
      while ( nGXsfl_610_idx <= nRC_GXsfl_610 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1IZ38( ) ;
         standaloneModal1IZ38( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1IZ38( ) ;
         nGXsfl_610_idx = (int)(nGXsfl_610_idx+1) ;
         sGXsfl_610_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_610_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_61038( ) ;
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
      chkDisArtEnc.setName( "DISARTENC" );
      chkDisArtEnc.setWebtags( "" );
      chkDisArtEnc.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisArtEnc.getInternalname(), "TitleCaption", chkDisArtEnc.getCaption(), true);
      chkDisArtEnc.setCheckedValue( "N" );
      A338DisArtEnc = ((GXutil.strcmp(GXutil.rtrim( A338DisArtEnc), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A338DisArtEnc", A338DisArtEnc);
      chkDisArtCor.setName( "DISARTCOR" );
      chkDisArtCor.setWebtags( "" );
      chkDisArtCor.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisArtCor.getInternalname(), "TitleCaption", chkDisArtCor.getCaption(), true);
      chkDisArtCor.setCheckedValue( "N" );
      A336DisArtCor = ((GXutil.strcmp(GXutil.rtrim( A336DisArtCor), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A336DisArtCor", A336DisArtCor);
      cmbDisEst.setName( "DISEST" );
      cmbDisEst.setWebtags( "" );
      cmbDisEst.addItem("1", httpContext.getMessage( "En Pedido", ""), (short)(0));
      cmbDisEst.addItem("3", httpContext.getMessage( "En Produccion", ""), (short)(0));
      if ( cmbDisEst.getItemCount() > 0 )
      {
         A367DisEst = (byte)(GXutil.lval( cmbDisEst.getValidValue(GXutil.trim( GXutil.str( A367DisEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A367DisEst", GXutil.str( A367DisEst, 1, 0));
      }
      chkDisDes.setName( "DISDES" );
      chkDisDes.setWebtags( "" );
      chkDisDes.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "TitleCaption", chkDisDes.getCaption(), true);
      chkDisDes.setCheckedValue( "N" );
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      chkDisFac.setName( "DISFAC" );
      chkDisFac.setWebtags( "" );
      chkDisFac.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisFac.getInternalname(), "TitleCaption", chkDisFac.getCaption(), true);
      chkDisFac.setCheckedValue( "N" );
      A3306DisFac = ((GXutil.strcmp(GXutil.rtrim( A3306DisFac), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A3306DisFac", A3306DisFac);
      chkDisAcc.setName( "DISACC" );
      chkDisAcc.setWebtags( "" );
      chkDisAcc.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisAcc.getInternalname(), "TitleCaption", chkDisAcc.getCaption(), true);
      chkDisAcc.setCheckedValue( "N" );
      A5252DisAcc = ((GXutil.strcmp(GXutil.rtrim( A5252DisAcc), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A5252DisAcc", A5252DisAcc);
      chkDisPla.setName( "DISPLA" );
      chkDisPla.setWebtags( "" );
      chkDisPla.setCaption( httpContext.getMessage( "¿Muestras?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkDisPla.getInternalname(), "TitleCaption", chkDisPla.getCaption(), true);
      chkDisPla.setCheckedValue( "N" );
      A2926DisPla = ((GXutil.strcmp(GXutil.rtrim( A2926DisPla), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A2926DisPla", A2926DisPla);
      chkDisAcaBak.setName( "DISACABAK" );
      chkDisAcaBak.setWebtags( "" );
      chkDisAcaBak.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisAcaBak.getInternalname(), "TitleCaption", chkDisAcaBak.getCaption(), true);
      chkDisAcaBak.setCheckedValue( "N" );
      A4477DisAcaBak = ((GXutil.strcmp(GXutil.rtrim( A4477DisAcaBak), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4477DisAcaBak", A4477DisAcaBak);
      chkDisEstTip.setName( "DISESTTIP" );
      chkDisEstTip.setWebtags( "" );
      chkDisEstTip.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisEstTip.getInternalname(), "TitleCaption", chkDisEstTip.getCaption(), true);
      chkDisEstTip.setCheckedValue( "*" );
      A5032DisEstTip = ((GXutil.strcmp(GXutil.rtrim( A5032DisEstTip), "S")==0) ? "S" : "*") ;
      httpContext.ajax_rsp_assign_attri("", false, "A5032DisEstTip", A5032DisEstTip);
      chkDisTin.setName( "DISTIN" );
      chkDisTin.setWebtags( "" );
      chkDisTin.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisTin.getInternalname(), "TitleCaption", chkDisTin.getCaption(), true);
      chkDisTin.setCheckedValue( "N" );
      A4014DisTin = ((GXutil.strcmp(GXutil.rtrim( A4014DisTin), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4014DisTin", A4014DisTin);
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01IZ34 */
      pr_default.execute(26, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01IZ34_A407EmprNom[0] ;
      n407EmprNom = T01IZ34_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(26);
      /* Using cursor T01IZ36 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         A387DisPiePie = T01IZ36_A387DisPiePie[0] ;
         n387DisPiePie = T01IZ36_n387DisPiePie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
      }
      else
      {
         A387DisPiePie = (short)(0) ;
         n387DisPiePie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A387DisPiePie), 4, 0));
      }
      pr_default.close(27);
      /* Using cursor T01IZ38 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         A379DisPie = T01IZ38_A379DisPie[0] ;
         n379DisPie = T01IZ38_n379DisPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A379DisPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A379DisPie), 4, 0));
      }
      else
      {
         A379DisPie = (short)(0) ;
         n379DisPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A379DisPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A379DisPie), 4, 0));
      }
      pr_default.close(28);
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T01IZ34 */
      pr_default.execute(26, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01IZ34_A407EmprNom[0] ;
      n407EmprNom = T01IZ34_n407EmprNom[0] ;
      pr_default.close(26);
      A399EmprCodDis = A396EmprCod ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A399EmprCodDis", GXutil.rtrim( A399EmprCodDis));
   }

   public void valid_Discod( )
   {
      A367DisEst = (byte)(GXutil.lval( cmbDisEst.getValue())) ;
      cmbDisEst.setValue( GXutil.str( A367DisEst, 1, 0) );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01IZ36 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         A387DisPiePie = T01IZ36_A387DisPiePie[0] ;
         n387DisPiePie = T01IZ36_n387DisPiePie[0] ;
      }
      else
      {
         A387DisPiePie = (short)(0) ;
         n387DisPiePie = false ;
      }
      pr_default.close(27);
      /* Using cursor T01IZ38 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         A379DisPie = T01IZ38_A379DisPie[0] ;
         n379DisPie = T01IZ38_n379DisPie[0] ;
      }
      else
      {
         A379DisPie = (short)(0) ;
         n379DisPie = false ;
      }
      pr_default.close(28);
      dynload_actions( ) ;
      A757PriCod = ((GXutil.strcmp(GXutil.rtrim( A757PriCod), "1")==0) ? "1" : "0") ;
      A338DisArtEnc = ((GXutil.strcmp(GXutil.rtrim( A338DisArtEnc), "S")==0) ? "S" : "N") ;
      A336DisArtCor = ((GXutil.strcmp(GXutil.rtrim( A336DisArtCor), "S")==0) ? "S" : "N") ;
      if ( cmbDisEst.getItemCount() > 0 )
      {
         A367DisEst = (byte)(GXutil.lval( cmbDisEst.getValidValue(GXutil.trim( GXutil.str( A367DisEst, 1, 0))))) ;
         cmbDisEst.setValue( GXutil.str( A367DisEst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbDisEst.setValue( GXutil.trim( GXutil.str( A367DisEst, 1, 0)) );
      }
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      A3306DisFac = ((GXutil.strcmp(GXutil.rtrim( A3306DisFac), "S")==0) ? "S" : "N") ;
      A5252DisAcc = ((GXutil.strcmp(GXutil.rtrim( A5252DisAcc), "S")==0) ? "S" : "N") ;
      A2926DisPla = ((GXutil.strcmp(GXutil.rtrim( A2926DisPla), "S")==0) ? "S" : "N") ;
      A4477DisAcaBak = ((GXutil.strcmp(GXutil.rtrim( A4477DisAcaBak), "S")==0) ? "S" : "N") ;
      A5032DisEstTip = ((GXutil.strcmp(GXutil.rtrim( A5032DisEstTip), "S")==0) ? "S" : "*") ;
      A4014DisTin = ((GXutil.strcmp(GXutil.rtrim( A4014DisTin), "S")==0) ? "S" : "N") ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", GXutil.rtrim( A757PriCod));
      httpContext.ajax_rsp_assign_attri("", false, "A360DisCliNum", GXutil.rtrim( A360DisCliNum));
      httpContext.ajax_rsp_assign_attri("", false, "A370DisFecCli", localUtil.format(A370DisFecCli, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", GXutil.rtrim( A335DisArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A371DisFecEnt", localUtil.format(A371DisFecEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", GXutil.rtrim( A337DisArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A340DisArtMat", GXutil.rtrim( A340DisArtMat));
      httpContext.ajax_rsp_assign_attri("", false, "A339DisArtLar", GXutil.rtrim( A339DisArtLar));
      httpContext.ajax_rsp_assign_attri("", false, "A351DisArtSua", GXutil.rtrim( A351DisArtSua));
      httpContext.ajax_rsp_assign_attri("", false, "A333DisArtAca", GXutil.rtrim( A333DisArtAca));
      httpContext.ajax_rsp_assign_attri("", false, "A343DisArtPle", GXutil.rtrim( A343DisArtPle));
      httpContext.ajax_rsp_assign_attri("", false, "A352DisArtTip", GXutil.ltrim( localUtil.ntoc( A352DisArtTip, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A338DisArtEnc", GXutil.rtrim( A338DisArtEnc));
      httpContext.ajax_rsp_assign_attri("", false, "A336DisArtCor", GXutil.rtrim( A336DisArtCor));
      httpContext.ajax_rsp_assign_attri("", false, "A341DisArtOpe", GXutil.rtrim( A341DisArtOpe));
      httpContext.ajax_rsp_assign_attri("", false, "A353DisArtTr1", GXutil.rtrim( A353DisArtTr1));
      httpContext.ajax_rsp_assign_attri("", false, "A344DisArtPt1", GXutil.ltrim( localUtil.ntoc( A344DisArtPt1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A354DisArtTr2", GXutil.rtrim( A354DisArtTr2));
      httpContext.ajax_rsp_assign_attri("", false, "A345DisArtPt2", GXutil.ltrim( localUtil.ntoc( A345DisArtPt2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A355DisArtTr3", GXutil.rtrim( A355DisArtTr3));
      httpContext.ajax_rsp_assign_attri("", false, "A346DisArtPt3", GXutil.ltrim( localUtil.ntoc( A346DisArtPt3, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A350DisArtRdt", GXutil.ltrim( localUtil.ntoc( A350DisArtRdt, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A359DisArtUrg", GXutil.ltrim( localUtil.ntoc( A359DisArtUrg, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A356DisArtUr1", GXutil.rtrim( A356DisArtUr1));
      httpContext.ajax_rsp_assign_attri("", false, "A347DisArtPu1", GXutil.ltrim( localUtil.ntoc( A347DisArtPu1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A357DisArtUr2", GXutil.rtrim( A357DisArtUr2));
      httpContext.ajax_rsp_assign_attri("", false, "A348DisArtPu2", GXutil.ltrim( localUtil.ntoc( A348DisArtPu2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A358DisArtUr3", GXutil.rtrim( A358DisArtUr3));
      httpContext.ajax_rsp_assign_attri("", false, "A349DisArtPu3", GXutil.ltrim( localUtil.ntoc( A349DisArtPu3, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A342DisArtPes", GXutil.ltrim( localUtil.ntoc( A342DisArtPes, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A334DisArtAnh", GXutil.ltrim( localUtil.ntoc( A334DisArtAnh, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1231DisArtAn1", GXutil.ltrim( localUtil.ntoc( A1231DisArtAn1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1232DisArtAcb", GXutil.ltrim( localUtil.ntoc( A1232DisArtAcb, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1233DisArtAc2", GXutil.ltrim( localUtil.ntoc( A1233DisArtAc2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A367DisEst", GXutil.ltrim( localUtil.ntoc( A367DisEst, (byte)(1), (byte)(0), ".", "")));
      cmbDisEst.setValue( GXutil.trim( GXutil.str( A367DisEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbDisEst.getInternalname(), "Values", cmbDisEst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrim( localUtil.ntoc( A388DisPreKgm, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrim( localUtil.ntoc( A389DisPreMtr, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A383DisPieLan", GXutil.ltrim( localUtil.ntoc( A383DisPieLan, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A372DisKgmLan", GXutil.ltrim( localUtil.ntoc( A372DisKgmLan, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A373DisMtrLan", GXutil.ltrim( localUtil.ntoc( A373DisMtrLan, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A362DisColNom", GXutil.rtrim( A362DisColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A363DisColNum", GXutil.ltrim( localUtil.ntoc( A363DisColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1195DisNomCli", GXutil.rtrim( A1195DisNomCli));
      httpContext.ajax_rsp_assign_attri("", false, "A1196DisNumCli", GXutil.ltrim( localUtil.ntoc( A1196DisNumCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1197DisEncCom", GXutil.ltrim( localUtil.ntoc( A1197DisEncCom, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1198DisEncAnh", GXutil.ltrim( localUtil.ntoc( A1198DisEncAnh, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A390DisTipCol", GXutil.ltrim( localUtil.ntoc( A390DisTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "A374DisNumPie", GXutil.ltrim( localUtil.ntoc( A374DisNumPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A375DisNumUni", GXutil.ltrim( localUtil.ntoc( A375DisNumUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", GXutil.rtrim( A392DisUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A1225DisGraCru", GXutil.ltrim( localUtil.ntoc( A1225DisGraCru, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1430DisLoc", GXutil.rtrim( A1430DisLoc));
      httpContext.ajax_rsp_assign_attri("", false, "A1502DisPart", GXutil.ltrim( localUtil.ntoc( A1502DisPart, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1906DisGraAca", GXutil.ltrim( localUtil.ntoc( A1906DisGraAca, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1907DisRdoN", GXutil.ltrim( localUtil.ntoc( A1907DisRdoN, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1908DisRdoA", GXutil.ltrim( localUtil.ntoc( A1908DisRdoA, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2009DisTipDis", GXutil.rtrim( A2009DisTipDis));
      httpContext.ajax_rsp_assign_attri("", false, "A2831DisNumLot", GXutil.ltrim( localUtil.ntoc( A2831DisNumLot, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2832DisKgsLot", GXutil.ltrim( localUtil.ntoc( A2832DisKgsLot, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2833DisMtrLot", GXutil.ltrim( localUtil.ntoc( A2833DisMtrLot, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2835DisPle2", GXutil.rtrim( A2835DisPle2));
      httpContext.ajax_rsp_assign_attri("", false, "A3127DisNumCor", GXutil.ltrim( localUtil.ntoc( A3127DisNumCor, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3128DisAncSal1", GXutil.ltrim( localUtil.ntoc( A3128DisAncSal1, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3129DisAncSal2", GXutil.ltrim( localUtil.ntoc( A3129DisAncSal2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3130DisAncSal3", GXutil.ltrim( localUtil.ntoc( A3130DisAncSal3, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3131DisGraAca2", GXutil.ltrim( localUtil.ntoc( A3131DisGraAca2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3132DisGraCru2", GXutil.ltrim( localUtil.ntoc( A3132DisGraCru2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3306DisFac", GXutil.rtrim( A3306DisFac));
      httpContext.ajax_rsp_assign_attri("", false, "A3307DisManCod1", GXutil.ltrim( localUtil.ntoc( A3307DisManCod1, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3308DisManCod2", GXutil.ltrim( localUtil.ntoc( A3308DisManCod2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3309DisNumTon", GXutil.rtrim( A3309DisNumTon));
      httpContext.ajax_rsp_assign_attri("", false, "A4614DisMdlCod", GXutil.rtrim( A4614DisMdlCod));
      httpContext.ajax_rsp_assign_attri("", false, "A4615DisTam", GXutil.rtrim( A4615DisTam));
      httpContext.ajax_rsp_assign_attri("", false, "A4293DisNPzas", GXutil.ltrim( localUtil.ntoc( A4293DisNPzas, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4616DisHorEnt", localUtil.ttoc( A4616DisHorEnt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A4294DisNPzasL", GXutil.ltrim( localUtil.ntoc( A4294DisNPzasL, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4617DisHorReg", localUtil.ttoc( A4617DisHorReg, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A5252DisAcc", GXutil.rtrim( A5252DisAcc));
      httpContext.ajax_rsp_assign_attri("", false, "A5366DisAntp", GXutil.rtrim( A5366DisAntp));
      httpContext.ajax_rsp_assign_attri("", false, "A5405DisAntpT", GXutil.rtrim( A5405DisAntpT));
      httpContext.ajax_rsp_assign_attri("", false, "A2926DisPla", GXutil.rtrim( A2926DisPla));
      httpContext.ajax_rsp_assign_attri("", false, "A4013DisEnv", GXutil.ltrim( localUtil.ntoc( A4013DisEnv, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A366DisEnt", GXutil.rtrim( A366DisEnt));
      httpContext.ajax_rsp_assign_attri("", false, "A4477DisAcaBak", GXutil.rtrim( A4477DisAcaBak));
      httpContext.ajax_rsp_assign_attri("", false, "A5350DisObsAnc", GXutil.rtrim( A5350DisObsAnc));
      httpContext.ajax_rsp_assign_attri("", false, "A5349DisObsGrm", GXutil.rtrim( A5349DisObsGrm));
      httpContext.ajax_rsp_assign_attri("", false, "A4813DisEncCli", GXutil.rtrim( A4813DisEncCli));
      httpContext.ajax_rsp_assign_attri("", false, "A4720DisDishCod", GXutil.rtrim( A4720DisDishCod));
      httpContext.ajax_rsp_assign_attri("", false, "A2743DisNumTex1", GXutil.ltrim( localUtil.ntoc( A2743DisNumTex1, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5032DisEstTip", GXutil.rtrim( A5032DisEstTip));
      httpContext.ajax_rsp_assign_attri("", false, "A4014DisTin", GXutil.rtrim( A4014DisTin));
      httpContext.ajax_rsp_assign_attri("", false, "A5290DisTipCor", GXutil.rtrim( A5290DisTipCor));
      httpContext.ajax_rsp_assign_attri("", false, "A4471DisCruEnr", GXutil.rtrim( A4471DisCruEnr));
      httpContext.ajax_rsp_assign_attri("", false, "A4479DisAcaMar", GXutil.rtrim( A4479DisAcaMar));
      httpContext.ajax_rsp_assign_attri("", false, "A1052DisObs", GXutil.rtrim( A1052DisObs));
      httpContext.ajax_rsp_assign_attri("", false, "A1968DisRes", GXutil.rtrim( A1968DisRes));
      httpContext.ajax_rsp_assign_attri("", false, "A5025DisGraCob", GXutil.ltrim( localUtil.ntoc( A5025DisGraCob, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10887Cod_Idtx", GXutil.rtrim( A10887Cod_Idtx));
      httpContext.ajax_rsp_assign_attri("", false, "A1122MaqCodDis", GXutil.rtrim( A1122MaqCodDis));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10888Dsc_Idtx", GXutil.rtrim( A10888Dsc_Idtx));
      httpContext.ajax_rsp_assign_attri("", false, "A12116DisTipCD", GXutil.rtrim( A12116DisTipCD));
      httpContext.ajax_rsp_assign_attri("", false, "A12115DisArtTipD", GXutil.rtrim( A12115DisArtTipD));
      httpContext.ajax_rsp_assign_attri("", false, "A475FindCol", GXutil.rtrim( A475FindCol));
      httpContext.ajax_rsp_assign_attri("", false, "A399EmprCodDis", GXutil.rtrim( A399EmprCodDis));
      httpContext.ajax_rsp_assign_attri("", false, "A387DisPiePie", GXutil.ltrim( localUtil.ntoc( A387DisPiePie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A379DisPie", GXutil.ltrim( localUtil.ntoc( A379DisPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A391DisUni", GXutil.ltrim( localUtil.ntoc( A391DisUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrim( localUtil.ntoc( A381DisPieKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A386DisPieNor", GXutil.ltrim( localUtil.ntoc( A386DisPieNor, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A253CliCodDis", GXutil.ltrim( localUtil.ntoc( A253CliCodDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z757PriCod", GXutil.rtrim( Z757PriCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z360DisCliNum", GXutil.rtrim( Z360DisCliNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z370DisFecCli", localUtil.format(Z370DisFecCli, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z335DisArtCod", GXutil.rtrim( Z335DisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z369DisFec", localUtil.format(Z369DisFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z371DisFecEnt", localUtil.format(Z371DisFecEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z337DisArtDsc", GXutil.rtrim( Z337DisArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z340DisArtMat", GXutil.rtrim( Z340DisArtMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z339DisArtLar", GXutil.rtrim( Z339DisArtLar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z351DisArtSua", GXutil.rtrim( Z351DisArtSua));
      app.GxWebStd.gx_hidden_field( httpContext, "Z333DisArtAca", GXutil.rtrim( Z333DisArtAca));
      app.GxWebStd.gx_hidden_field( httpContext, "Z343DisArtPle", GXutil.rtrim( Z343DisArtPle));
      app.GxWebStd.gx_hidden_field( httpContext, "Z352DisArtTip", GXutil.ltrim( localUtil.ntoc( Z352DisArtTip, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z338DisArtEnc", GXutil.rtrim( Z338DisArtEnc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z336DisArtCor", GXutil.rtrim( Z336DisArtCor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z341DisArtOpe", GXutil.rtrim( Z341DisArtOpe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z353DisArtTr1", GXutil.rtrim( Z353DisArtTr1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z344DisArtPt1", GXutil.ltrim( localUtil.ntoc( Z344DisArtPt1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z354DisArtTr2", GXutil.rtrim( Z354DisArtTr2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z345DisArtPt2", GXutil.ltrim( localUtil.ntoc( Z345DisArtPt2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z355DisArtTr3", GXutil.rtrim( Z355DisArtTr3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z346DisArtPt3", GXutil.ltrim( localUtil.ntoc( Z346DisArtPt3, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z350DisArtRdt", GXutil.ltrim( localUtil.ntoc( Z350DisArtRdt, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z359DisArtUrg", GXutil.ltrim( localUtil.ntoc( Z359DisArtUrg, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z356DisArtUr1", GXutil.rtrim( Z356DisArtUr1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z347DisArtPu1", GXutil.ltrim( localUtil.ntoc( Z347DisArtPu1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z357DisArtUr2", GXutil.rtrim( Z357DisArtUr2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z348DisArtPu2", GXutil.ltrim( localUtil.ntoc( Z348DisArtPu2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z358DisArtUr3", GXutil.rtrim( Z358DisArtUr3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z349DisArtPu3", GXutil.ltrim( localUtil.ntoc( Z349DisArtPu3, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z342DisArtPes", GXutil.ltrim( localUtil.ntoc( Z342DisArtPes, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z334DisArtAnh", GXutil.ltrim( localUtil.ntoc( Z334DisArtAnh, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1231DisArtAn1", GXutil.ltrim( localUtil.ntoc( Z1231DisArtAn1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1232DisArtAcb", GXutil.ltrim( localUtil.ntoc( Z1232DisArtAcb, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1233DisArtAc2", GXutil.ltrim( localUtil.ntoc( Z1233DisArtAc2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z367DisEst", GXutil.ltrim( localUtil.ntoc( Z367DisEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z388DisPreKgm", GXutil.ltrim( localUtil.ntoc( Z388DisPreKgm, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z389DisPreMtr", GXutil.ltrim( localUtil.ntoc( Z389DisPreMtr, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z383DisPieLan", GXutil.ltrim( localUtil.ntoc( Z383DisPieLan, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z372DisKgmLan", GXutil.ltrim( localUtil.ntoc( Z372DisKgmLan, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z373DisMtrLan", GXutil.ltrim( localUtil.ntoc( Z373DisMtrLan, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z362DisColNom", GXutil.rtrim( Z362DisColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z363DisColNum", GXutil.ltrim( localUtil.ntoc( Z363DisColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1195DisNomCli", GXutil.rtrim( Z1195DisNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1196DisNumCli", GXutil.ltrim( localUtil.ntoc( Z1196DisNumCli, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1197DisEncCom", GXutil.ltrim( localUtil.ntoc( Z1197DisEncCom, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1198DisEncAnh", GXutil.ltrim( localUtil.ntoc( Z1198DisEncAnh, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z390DisTipCol", GXutil.ltrim( localUtil.ntoc( Z390DisTipCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z374DisNumPie", GXutil.ltrim( localUtil.ntoc( Z374DisNumPie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z375DisNumUni", GXutil.ltrim( localUtil.ntoc( Z375DisNumUni, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z392DisUniMed", GXutil.rtrim( Z392DisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1225DisGraCru", GXutil.ltrim( localUtil.ntoc( Z1225DisGraCru, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1430DisLoc", GXutil.rtrim( Z1430DisLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1502DisPart", GXutil.ltrim( localUtil.ntoc( Z1502DisPart, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1906DisGraAca", GXutil.ltrim( localUtil.ntoc( Z1906DisGraAca, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1907DisRdoN", GXutil.ltrim( localUtil.ntoc( Z1907DisRdoN, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1908DisRdoA", GXutil.ltrim( localUtil.ntoc( Z1908DisRdoA, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2009DisTipDis", GXutil.rtrim( Z2009DisTipDis));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2831DisNumLot", GXutil.ltrim( localUtil.ntoc( Z2831DisNumLot, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2832DisKgsLot", GXutil.ltrim( localUtil.ntoc( Z2832DisKgsLot, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2833DisMtrLot", GXutil.ltrim( localUtil.ntoc( Z2833DisMtrLot, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2835DisPle2", GXutil.rtrim( Z2835DisPle2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3127DisNumCor", GXutil.ltrim( localUtil.ntoc( Z3127DisNumCor, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3128DisAncSal1", GXutil.ltrim( localUtil.ntoc( Z3128DisAncSal1, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3129DisAncSal2", GXutil.ltrim( localUtil.ntoc( Z3129DisAncSal2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3130DisAncSal3", GXutil.ltrim( localUtil.ntoc( Z3130DisAncSal3, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3131DisGraAca2", GXutil.ltrim( localUtil.ntoc( Z3131DisGraAca2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3132DisGraCru2", GXutil.ltrim( localUtil.ntoc( Z3132DisGraCru2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3306DisFac", GXutil.rtrim( Z3306DisFac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3307DisManCod1", GXutil.ltrim( localUtil.ntoc( Z3307DisManCod1, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3308DisManCod2", GXutil.ltrim( localUtil.ntoc( Z3308DisManCod2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3309DisNumTon", GXutil.rtrim( Z3309DisNumTon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4614DisMdlCod", GXutil.rtrim( Z4614DisMdlCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4615DisTam", GXutil.rtrim( Z4615DisTam));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4293DisNPzas", GXutil.ltrim( localUtil.ntoc( Z4293DisNPzas, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4616DisHorEnt", localUtil.ttoc( Z4616DisHorEnt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4294DisNPzasL", GXutil.ltrim( localUtil.ntoc( Z4294DisNPzasL, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4617DisHorReg", localUtil.ttoc( Z4617DisHorReg, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5252DisAcc", GXutil.rtrim( Z5252DisAcc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5366DisAntp", GXutil.rtrim( Z5366DisAntp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5405DisAntpT", GXutil.rtrim( Z5405DisAntpT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2926DisPla", GXutil.rtrim( Z2926DisPla));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4013DisEnv", GXutil.ltrim( localUtil.ntoc( Z4013DisEnv, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z366DisEnt", GXutil.rtrim( Z366DisEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4477DisAcaBak", GXutil.rtrim( Z4477DisAcaBak));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5350DisObsAnc", GXutil.rtrim( Z5350DisObsAnc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5349DisObsGrm", GXutil.rtrim( Z5349DisObsGrm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4813DisEncCli", GXutil.rtrim( Z4813DisEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4720DisDishCod", GXutil.rtrim( Z4720DisDishCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2743DisNumTex1", GXutil.ltrim( localUtil.ntoc( Z2743DisNumTex1, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5032DisEstTip", GXutil.rtrim( Z5032DisEstTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4014DisTin", GXutil.rtrim( Z4014DisTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5290DisTipCor", GXutil.rtrim( Z5290DisTipCor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4471DisCruEnr", GXutil.rtrim( Z4471DisCruEnr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4479DisAcaMar", GXutil.rtrim( Z4479DisAcaMar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1052DisObs", GXutil.rtrim( Z1052DisObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1968DisRes", GXutil.rtrim( Z1968DisRes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5025DisGraCob", GXutil.ltrim( localUtil.ntoc( Z5025DisGraCob, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10887Cod_Idtx", GXutil.rtrim( Z10887Cod_Idtx));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1122MaqCodDis", GXutil.rtrim( Z1122MaqCodDis));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10888Dsc_Idtx", GXutil.rtrim( Z10888Dsc_Idtx));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12116DisTipCD", GXutil.rtrim( Z12116DisTipCD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12115DisArtTipD", GXutil.rtrim( Z12115DisArtTipD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z475FindCol", GXutil.rtrim( Z475FindCol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z399EmprCodDis", GXutil.rtrim( Z399EmprCodDis));
      app.GxWebStd.gx_hidden_field( httpContext, "Z387DisPiePie", GXutil.ltrim( localUtil.ntoc( Z387DisPiePie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z379DisPie", GXutil.ltrim( localUtil.ntoc( Z379DisPie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z391DisUni", GXutil.ltrim( localUtil.ntoc( Z391DisUni, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z381DisPieKgm", GXutil.ltrim( localUtil.ntoc( Z381DisPieKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z385DisPieMtr", GXutil.ltrim( localUtil.ntoc( Z385DisPieMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z386DisPieNor", GXutil.ltrim( localUtil.ntoc( Z386DisPieNor, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z253CliCodDis", GXutil.ltrim( localUtil.ntoc( Z253CliCodDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Clicod( )
   {
      /* Using cursor T01IZ39 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T01IZ39_A279CliNom[0] ;
      pr_default.close(29);
      A253CliCodDis = A252CliCod ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A253CliCodDis", GXutil.ltrim( localUtil.ntoc( A253CliCodDis, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Disarttip( )
   {
      GXt_char1 = A12115DisArtTipD ;
      GXv_char4[0] = GXt_char1 ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A352DisArtTip, GXv_char4) ;
      tdispol_impl.this.GXt_char1 = GXv_char4[0] ;
      A12115DisArtTipD = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12115DisArtTipD", GXutil.rtrim( A12115DisArtTipD));
   }

   public void valid_Distipcol( )
   {
      n390DisTipCol = false ;
      n362DisColNom = false ;
      n363DisColNum = false ;
      /* Using cursor T01IZ62 */
      pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol)});
      if ( (pr_default.getStatus(52) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A390DisTipCol) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo Colorante", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISTIPCOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      pr_default.close(52);
      GXt_char1 = A12116DisTipCD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int3[0] = A390DisTipCol ;
      GXv_char2[0] = GXt_char1 ;
      new app.pfcoldsc(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_char2) ;
      tdispol_impl.this.A396EmprCod = GXv_char4[0] ;
      tdispol_impl.this.A390DisTipCol = GXv_int3[0] ;
      tdispol_impl.this.GXt_char1 = GXv_char2[0] ;
      A12116DisTipCD = GXt_char1 ;
      GXt_char1 = A475FindCol ;
      GXv_char4[0] = GXt_char1 ;
      new app.pedidos.dis_findcol_validate(remoteHandle, context).execute( A396EmprCod, A252CliCod, A335DisArtCod, A362DisColNom, A363DisColNum, A390DisTipCol, GXv_char4) ;
      tdispol_impl.this.GXt_char1 = GXv_char4[0] ;
      A475FindCol = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12116DisTipCD", GXutil.rtrim( A12116DisTipCD));
      httpContext.ajax_rsp_assign_attri("", false, "A475FindCol", GXutil.rtrim( A475FindCol));
   }

   public void valid_Disdes( )
   {
      if ( ! ( ( GXutil.strcmp(A365DisDes, "S") == 0 ) || ( GXutil.strcmp(A365DisDes, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Desglose", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "DISDES");
         AnyError = (short)(1) ;
         GX_FocusControl = chkDisDes.getInternalname() ;
      }
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         A381DisPieKgm = getDisPieKgm0( A396EmprCod, A361DisCod) ;
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A381DisPieKgm = getDisPieKgm1( A396EmprCod, A361DisCod) ;
         }
         else
         {
            A381DisPieKgm = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
      {
         A385DisPieMtr = getDisPieMtr0( A396EmprCod, A361DisCod) ;
      }
      else
      {
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A385DisPieMtr = getDisPieMtr1( A396EmprCod, A361DisCod) ;
         }
         else
         {
            A385DisPieMtr = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A386DisPieNor = (short)(getDisPieNor0( A396EmprCod, A361DisCod)) ;
      }
      else
      {
         A386DisPieNor = (short)(0) ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A381DisPieKgm", GXutil.ltrim( localUtil.ntoc( A381DisPieKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A385DisPieMtr", GXutil.ltrim( localUtil.ntoc( A385DisPieMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A386DisPieNor", GXutil.ltrim( localUtil.ntoc( A386DisPieNor, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Disunimed( )
   {
      if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
      {
         A391DisUni = getDisUni0( A396EmprCod, A361DisCod) ;
      }
      else
      {
         if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 )
         {
            A391DisUni = getDisUni1( A396EmprCod, A361DisCod) ;
         }
         else
         {
            A391DisUni = DecimalUtil.doubleToDec(0) ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A391DisUni", GXutil.ltrim( localUtil.ntoc( A391DisUni, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Cod_idtx( )
   {
      n10887Cod_Idtx = false ;
      n10888Dsc_Idtx = false ;
      /* Using cursor T01IZ40 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n10887Cod_Idtx), A10887Cod_Idtx});
      if ( (pr_default.getStatus(30) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A10887Cod_Idtx)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INDITEX", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "COD_IDTX");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A10888Dsc_Idtx = T01IZ40_A10888Dsc_Idtx[0] ;
      n10888Dsc_Idtx = T01IZ40_n10888Dsc_Idtx[0] ;
      pr_default.close(30);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10888Dsc_Idtx", GXutil.rtrim( A10888Dsc_Idtx));
   }

   public void valid_Maqcoddis( )
   {
      n1122MaqCodDis = false ;
      /* Using cursor T01IZ63 */
      pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n1122MaqCodDis), A1122MaqCodDis});
      if ( (pr_default.getStatus(53) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1122MaqCodDis)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MaqDis", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCODDIS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      pr_default.close(53);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Procod( )
   {
      /* Using cursor T01IZ59 */
      pr_default.execute(49, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(49) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      A759ProDsc = T01IZ59_A759ProDsc[0] ;
      pr_default.close(49);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A399EmprCodDis',fld:'EMPRCODDIS',pic:'@!'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A399EmprCodDis',fld:'EMPRCODDIS',pic:'@!'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_PRICOD","{handler:'valid_Pricod',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_PRICOD",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'cmbDisEst'},{av:'A367DisEst',fld:'DISEST',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'A360DisCliNum',fld:'DISCLINUM',pic:''},{av:'A370DisFecCli',fld:'DISFECCLI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A369DisFec',fld:'DISFEC',pic:''},{av:'A371DisFecEnt',fld:'DISFECENT',pic:''},{av:'A337DisArtDsc',fld:'DISARTDSC',pic:''},{av:'A340DisArtMat',fld:'DISARTMAT',pic:''},{av:'A339DisArtLar',fld:'DISARTLAR',pic:''},{av:'A351DisArtSua',fld:'DISARTSUA',pic:''},{av:'A333DisArtAca',fld:'DISARTACA',pic:''},{av:'A343DisArtPle',fld:'DISARTPLE',pic:''},{av:'A352DisArtTip',fld:'DISARTTIP',pic:'ZZZ9'},{av:'A341DisArtOpe',fld:'DISARTOPE',pic:'@!'},{av:'A353DisArtTr1',fld:'DISARTTR1',pic:''},{av:'A344DisArtPt1',fld:'DISARTPT1',pic:'ZZ9'},{av:'A354DisArtTr2',fld:'DISARTTR2',pic:''},{av:'A345DisArtPt2',fld:'DISARTPT2',pic:'ZZ9'},{av:'A355DisArtTr3',fld:'DISARTTR3',pic:''},{av:'A346DisArtPt3',fld:'DISARTPT3',pic:'ZZ9'},{av:'A350DisArtRdt',fld:'DISARTRDT',pic:'ZZ9.99'},{av:'A359DisArtUrg',fld:'DISARTURG',pic:'9'},{av:'A356DisArtUr1',fld:'DISARTUR1',pic:''},{av:'A347DisArtPu1',fld:'DISARTPU1',pic:'ZZ9'},{av:'A357DisArtUr2',fld:'DISARTUR2',pic:''},{av:'A348DisArtPu2',fld:'DISARTPU2',pic:'ZZ9'},{av:'A358DisArtUr3',fld:'DISARTUR3',pic:''},{av:'A349DisArtPu3',fld:'DISARTPU3',pic:'ZZ9'},{av:'A342DisArtPes',fld:'DISARTPES',pic:'ZZZ9'},{av:'A334DisArtAnh',fld:'DISARTANH',pic:'ZZ9'},{av:'A1231DisArtAn1',fld:'DISARTAN1',pic:'ZZ9'},{av:'A1232DisArtAcb',fld:'DISARTACB',pic:'ZZ9'},{av:'A1233DisArtAc2',fld:'DISARTAC2',pic:'ZZ9'},{av:'cmbDisEst'},{av:'A367DisEst',fld:'DISEST',pic:'9'},{av:'A388DisPreKgm',fld:'DISPREKGM',pic:'ZZZZZZ9.99'},{av:'A389DisPreMtr',fld:'DISPREMTR',pic:'ZZZZZZ9.99'},{av:'A383DisPieLan',fld:'DISPIELAN',pic:'ZZZ9'},{av:'A372DisKgmLan',fld:'DISKGMLAN',pic:'ZZZ9'},{av:'A373DisMtrLan',fld:'DISMTRLAN',pic:'ZZZ9'},{av:'A362DisColNom',fld:'DISCOLNOM',pic:''},{av:'A363DisColNum',fld:'DISCOLNUM',pic:'ZZZZZ9'},{av:'A1195DisNomCli',fld:'DISNOMCLI',pic:''},{av:'A1196DisNumCli',fld:'DISNUMCLI',pic:'ZZZZZ9'},{av:'A1197DisEncCom',fld:'DISENCCOM',pic:'ZZ9.99'},{av:'A1198DisEncAnh',fld:'DISENCANH',pic:'ZZ9.99'},{av:'A390DisTipCol',fld:'DISTIPCOL',pic:'Z9'},{av:'A374DisNumPie',fld:'DISNUMPIE',pic:'ZZZ9'},{av:'A375DisNumUni',fld:'DISNUMUNI',pic:'ZZZZZ9.99'},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A1225DisGraCru',fld:'DISGRACRU',pic:'ZZZ9'},{av:'A1430DisLoc',fld:'DISLOC',pic:''},{av:'A1502DisPart',fld:'DISPART',pic:'ZZZ9'},{av:'A1906DisGraAca',fld:'DISGRAACA',pic:'ZZZ9'},{av:'A1907DisRdoN',fld:'DISRDON',pic:'ZZ9.99'},{av:'A1908DisRdoA',fld:'DISRDOA',pic:'ZZ9.99'},{av:'A2009DisTipDis',fld:'DISTIPDIS',pic:'@!'},{av:'A2831DisNumLot',fld:'DISNUMLOT',pic:'ZZZZZZZ9'},{av:'A2832DisKgsLot',fld:'DISKGSLOT',pic:'ZZZZZ9.99'},{av:'A2833DisMtrLot',fld:'DISMTRLOT',pic:'ZZZZZ9.99'},{av:'A2835DisPle2',fld:'DISPLE2',pic:''},{av:'A3127DisNumCor',fld:'DISNUMCOR',pic:'ZZZ9'},{av:'A3128DisAncSal1',fld:'DISANCSAL1',pic:'ZZZ9'},{av:'A3129DisAncSal2',fld:'DISANCSAL2',pic:'ZZZ9'},{av:'A3130DisAncSal3',fld:'DISANCSAL3',pic:'ZZZ9'},{av:'A3131DisGraAca2',fld:'DISGRAACA2',pic:'ZZZ9'},{av:'A3132DisGraCru2',fld:'DISGRACRU2',pic:'ZZZ9'},{av:'A3307DisManCod1',fld:'DISMANCOD1',pic:'ZZZ9'},{av:'A3308DisManCod2',fld:'DISMANCOD2',pic:'ZZZ9'},{av:'A3309DisNumTon',fld:'DISNUMTON',pic:''},{av:'A4614DisMdlCod',fld:'DISMDLCOD',pic:''},{av:'A4615DisTam',fld:'DISTAM',pic:''},{av:'A4293DisNPzas',fld:'DISNPZAS',pic:'ZZZZZ9'},{av:'A4616DisHorEnt',fld:'DISHORENT',pic:'99:99:99'},{av:'A4294DisNPzasL',fld:'DISNPZASL',pic:'ZZZZZ9'},{av:'A4617DisHorReg',fld:'DISHORREG',pic:'99:99:99'},{av:'A5366DisAntp',fld:'DISANTP',pic:''},{av:'A5405DisAntpT',fld:'DISANTPT',pic:''},{av:'A4013DisEnv',fld:'DISENV',pic:'9'},{av:'A366DisEnt',fld:'DISENT',pic:''},{av:'A5350DisObsAnc',fld:'DISOBSANC',pic:''},{av:'A5349DisObsGrm',fld:'DISOBSGRM',pic:''},{av:'A4813DisEncCli',fld:'DISENCCLI',pic:''},{av:'A4720DisDishCod',fld:'DISDISHCOD',pic:''},{av:'A2743DisNumTex1',fld:'DISNUMTEX1',pic:'9'},{av:'A5290DisTipCor',fld:'DISTIPCOR',pic:''},{av:'A4471DisCruEnr',fld:'DISCRUENR',pic:''},{av:'A4479DisAcaMar',fld:'DISACAMAR',pic:''},{av:'A1052DisObs',fld:'DISOBS',pic:''},{av:'A1968DisRes',fld:'DISRES',pic:''},{av:'A5025DisGraCob',fld:'DISGRACOB',pic:'Z9'},{av:'A10887Cod_Idtx',fld:'COD_IDTX',pic:''},{av:'A1122MaqCodDis',fld:'MAQCODDIS',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10888Dsc_Idtx',fld:'DSC_IDTX',pic:''},{av:'A12116DisTipCD',fld:'DISTIPCD',pic:''},{av:'A12115DisArtTipD',fld:'DISARTTIPD',pic:''},{av:'A475FindCol',fld:'FINDCOL',pic:''},{av:'A399EmprCodDis',fld:'EMPRCODDIS',pic:'@!'},{av:'A387DisPiePie',fld:'DISPIEPIE',pic:'ZZZ9'},{av:'A379DisPie',fld:'DISPIE',pic:'ZZZ9'},{av:'A391DisUni',fld:'DISUNI',pic:'ZZZZZ9.99'},{av:'A381DisPieKgm',fld:'DISPIEKGM',pic:'ZZZZZ9.99'},{av:'A385DisPieMtr',fld:'DISPIEMTR',pic:'ZZZZZ9.99'},{av:'A386DisPieNor',fld:'DISPIENOR',pic:'ZZZ9'},{av:'A253CliCodDis',fld:'CLICODDIS',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z361DisCod'},{av:'Z757PriCod'},{av:'Z360DisCliNum'},{av:'Z370DisFecCli'},{av:'Z252CliCod'},{av:'Z335DisArtCod'},{av:'Z369DisFec'},{av:'Z371DisFecEnt'},{av:'Z337DisArtDsc'},{av:'Z340DisArtMat'},{av:'Z339DisArtLar'},{av:'Z351DisArtSua'},{av:'Z333DisArtAca'},{av:'Z343DisArtPle'},{av:'Z352DisArtTip'},{av:'Z338DisArtEnc'},{av:'Z336DisArtCor'},{av:'Z341DisArtOpe'},{av:'Z353DisArtTr1'},{av:'Z344DisArtPt1'},{av:'Z354DisArtTr2'},{av:'Z345DisArtPt2'},{av:'Z355DisArtTr3'},{av:'Z346DisArtPt3'},{av:'Z350DisArtRdt'},{av:'Z359DisArtUrg'},{av:'Z356DisArtUr1'},{av:'Z347DisArtPu1'},{av:'Z357DisArtUr2'},{av:'Z348DisArtPu2'},{av:'Z358DisArtUr3'},{av:'Z349DisArtPu3'},{av:'Z342DisArtPes'},{av:'Z334DisArtAnh'},{av:'Z1231DisArtAn1'},{av:'Z1232DisArtAcb'},{av:'Z1233DisArtAc2'},{av:'Z367DisEst'},{av:'Z388DisPreKgm'},{av:'Z389DisPreMtr'},{av:'Z383DisPieLan'},{av:'Z372DisKgmLan'},{av:'Z373DisMtrLan'},{av:'Z362DisColNom'},{av:'Z363DisColNum'},{av:'Z1195DisNomCli'},{av:'Z1196DisNumCli'},{av:'Z1197DisEncCom'},{av:'Z1198DisEncAnh'},{av:'Z390DisTipCol'},{av:'Z365DisDes'},{av:'Z374DisNumPie'},{av:'Z375DisNumUni'},{av:'Z392DisUniMed'},{av:'Z1225DisGraCru'},{av:'Z1430DisLoc'},{av:'Z1502DisPart'},{av:'Z1906DisGraAca'},{av:'Z1907DisRdoN'},{av:'Z1908DisRdoA'},{av:'Z2009DisTipDis'},{av:'Z2831DisNumLot'},{av:'Z2832DisKgsLot'},{av:'Z2833DisMtrLot'},{av:'Z2835DisPle2'},{av:'Z3127DisNumCor'},{av:'Z3128DisAncSal1'},{av:'Z3129DisAncSal2'},{av:'Z3130DisAncSal3'},{av:'Z3131DisGraAca2'},{av:'Z3132DisGraCru2'},{av:'Z3306DisFac'},{av:'Z3307DisManCod1'},{av:'Z3308DisManCod2'},{av:'Z3309DisNumTon'},{av:'Z4614DisMdlCod'},{av:'Z4615DisTam'},{av:'Z4293DisNPzas'},{av:'Z4616DisHorEnt'},{av:'Z4294DisNPzasL'},{av:'Z4617DisHorReg'},{av:'Z5252DisAcc'},{av:'Z5366DisAntp'},{av:'Z5405DisAntpT'},{av:'Z2926DisPla'},{av:'Z4013DisEnv'},{av:'Z366DisEnt'},{av:'Z4477DisAcaBak'},{av:'Z5350DisObsAnc'},{av:'Z5349DisObsGrm'},{av:'Z4813DisEncCli'},{av:'Z4720DisDishCod'},{av:'Z2743DisNumTex1'},{av:'Z5032DisEstTip'},{av:'Z4014DisTin'},{av:'Z5290DisTipCor'},{av:'Z4471DisCruEnr'},{av:'Z4479DisAcaMar'},{av:'Z1052DisObs'},{av:'Z1968DisRes'},{av:'Z5025DisGraCob'},{av:'Z10887Cod_Idtx'},{av:'Z1122MaqCodDis'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z10888Dsc_Idtx'},{av:'Z12116DisTipCD'},{av:'Z12115DisArtTipD'},{av:'Z475FindCol'},{av:'Z399EmprCodDis'},{av:'Z387DisPiePie'},{av:'Z379DisPie'},{av:'Z391DisUni'},{av:'Z381DisPieKgm'},{av:'Z385DisPieMtr'},{av:'Z386DisPieNor'},{av:'Z253CliCodDis'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A253CliCodDis',fld:'CLICODDIS',pic:'ZZZZZ9'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A253CliCodDis',fld:'CLICODDIS',pic:'ZZZZZ9'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_DISARTCOD","{handler:'valid_Disartcod',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_DISARTCOD",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_DISARTTIP","{handler:'valid_Disarttip',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A352DisArtTip',fld:'DISARTTIP',pic:'ZZZ9'},{av:'A12115DisArtTipD',fld:'DISARTTIPD',pic:''},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_DISARTTIP",",oparms:[{av:'A12115DisArtTipD',fld:'DISARTTIPD',pic:''},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_DISARTENC","{handler:'valid_Disartenc',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_DISARTENC",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_DISARTCOR","{handler:'valid_Disartcor',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_DISARTCOR",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_DISARTOPE","{handler:'valid_Disartope',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_DISARTOPE",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_DISARTURG","{handler:'valid_Disarturg',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_DISARTURG",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_DISCOLNOM","{handler:'valid_Discolnom',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_DISCOLNOM",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_DISCOLNUM","{handler:'valid_Discolnum',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_DISCOLNUM",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_DISTIPCOL","{handler:'valid_Distipcol',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A390DisTipCol',fld:'DISTIPCOL',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A362DisColNom',fld:'DISCOLNOM',pic:''},{av:'A363DisColNum',fld:'DISCOLNUM',pic:'ZZZZZ9'},{av:'A12116DisTipCD',fld:'DISTIPCD',pic:''},{av:'A475FindCol',fld:'FINDCOL',pic:''},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_DISTIPCOL",",oparms:[{av:'A12116DisTipCD',fld:'DISTIPCD',pic:''},{av:'A475FindCol',fld:'FINDCOL',pic:''},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_DISDES","{handler:'valid_Disdes',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A381DisPieKgm',fld:'DISPIEKGM',pic:'ZZZZZ9.99'},{av:'A385DisPieMtr',fld:'DISPIEMTR',pic:'ZZZZZ9.99'},{av:'A386DisPieNor',fld:'DISPIENOR',pic:'ZZZ9'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_DISDES",",oparms:[{av:'A381DisPieKgm',fld:'DISPIEKGM',pic:'ZZZZZ9.99'},{av:'A385DisPieMtr',fld:'DISPIEMTR',pic:'ZZZZZ9.99'},{av:'A386DisPieNor',fld:'DISPIENOR',pic:'ZZZ9'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_DISUNIMED","{handler:'valid_Disunimed',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A391DisUni',fld:'DISUNI',pic:'ZZZZZ9.99'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_DISUNIMED",",oparms:[{av:'A391DisUni',fld:'DISUNI',pic:'ZZZZZ9.99'},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_DISFAC","{handler:'valid_Disfac',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_DISFAC",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_DISPLA","{handler:'valid_Displa',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_DISPLA",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_DISTIN","{handler:'valid_Distin',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_DISTIN",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_COD_IDTX","{handler:'valid_Cod_idtx',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10887Cod_Idtx',fld:'COD_IDTX',pic:''},{av:'A10888Dsc_Idtx',fld:'DSC_IDTX',pic:''},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_COD_IDTX",",oparms:[{av:'A10888Dsc_Idtx',fld:'DSC_IDTX',pic:''},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_MAQCODDIS","{handler:'valid_Maqcoddis',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1122MaqCodDis',fld:'MAQCODDIS',pic:''},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_MAQCODDIS",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
      setEventMetadata("NULL","{handler:'valid_Prodsc',iparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]");
      setEventMetadata("NULL",",oparms:[{av:'A757PriCod',fld:'PRICOD',pic:'9'},{av:'A338DisArtEnc',fld:'DISARTENC',pic:'@!'},{av:'A336DisArtCor',fld:'DISARTCOR',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'},{av:'A3306DisFac',fld:'DISFAC',pic:''},{av:'A5252DisAcc',fld:'DISACC',pic:''},{av:'A2926DisPla',fld:'DISPLA',pic:'@!'},{av:'A4477DisAcaBak',fld:'DISACABAK',pic:''},{av:'A5032DisEstTip',fld:'DISESTTIP',pic:''},{av:'A4014DisTin',fld:'DISTIN',pic:'@!'}]}");
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
      pr_default.close(49);
      pr_default.close(29);
      pr_default.close(26);
      pr_default.close(53);
      pr_default.close(52);
      pr_default.close(30);
      pr_default.close(27);
      pr_default.close(28);
   }

   /* Aggregate/select formulas */
   public int getDisPieNor0( String E396EmprCod ,
                             int E361DisCod )
   {
      X673Piezas = 0 ;
      /* Using cursor T01IZ64 */
      pr_default.execute(54, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(54) != 101) )
      {
         X673Piezas = T01IZ64_A673Piezas[0] ;
      }
      pr_default.close(54);
      return X673Piezas ;
   }

   public java.math.BigDecimal getDisPieMtr1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X631Metros = DecimalUtil.doubleToDec(0) ;
      /* Using cursor T01IZ65 */
      pr_default.execute(55, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(55) != 101) )
      {
         X631Metros = T01IZ65_A631Metros[0] ;
      }
      pr_default.close(55);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisPieMtr0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X384DisPieMet = DecimalUtil.doubleToDec(0) ;
      /* Using cursor T01IZ66 */
      pr_default.execute(56, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(56) != 101) )
      {
         X384DisPieMet = T01IZ66_A384DisPieMet[0] ;
      }
      pr_default.close(56);
      return X384DisPieMet ;
   }

   public java.math.BigDecimal getDisPieKgm1( String E396EmprCod ,
                                              int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor T01IZ67 */
      pr_default.execute(57, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(57) != 101) )
      {
         X595Kilos = T01IZ67_A595Kilos[0] ;
      }
      pr_default.close(57);
      return X595Kilos ;
   }

   public java.math.BigDecimal getDisPieKgm0( String E396EmprCod ,
                                              int E361DisCod )
   {
      X382DisPieKil = DecimalUtil.ZERO ;
      /* Using cursor T01IZ68 */
      pr_default.execute(58, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(58) != 101) )
      {
         X382DisPieKil = T01IZ68_A382DisPieKil[0] ;
      }
      pr_default.close(58);
      return X382DisPieKil ;
   }

   public java.math.BigDecimal getDisUni1( String E396EmprCod ,
                                           int E361DisCod )
   {
      X631Metros = DecimalUtil.ZERO ;
      /* Using cursor T01IZ69 */
      pr_default.execute(59, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(59) != 101) )
      {
         X631Metros = T01IZ69_A631Metros[0] ;
      }
      pr_default.close(59);
      return X631Metros ;
   }

   public java.math.BigDecimal getDisUni0( String E396EmprCod ,
                                           int E361DisCod )
   {
      X595Kilos = DecimalUtil.ZERO ;
      /* Using cursor T01IZ70 */
      pr_default.execute(60, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(60) != 101) )
      {
         X595Kilos = T01IZ70_A595Kilos[0] ;
      }
      pr_default.close(60);
      return X595Kilos ;
   }

   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z757PriCod = "" ;
      Z360DisCliNum = "" ;
      Z370DisFecCli = GXutil.nullDate() ;
      Z335DisArtCod = "" ;
      Z369DisFec = GXutil.nullDate() ;
      Z371DisFecEnt = GXutil.nullDate() ;
      Z337DisArtDsc = "" ;
      Z340DisArtMat = "" ;
      Z339DisArtLar = "" ;
      Z351DisArtSua = "" ;
      Z333DisArtAca = "" ;
      Z343DisArtPle = "" ;
      Z338DisArtEnc = "" ;
      Z336DisArtCor = "" ;
      Z341DisArtOpe = "" ;
      Z353DisArtTr1 = "" ;
      Z354DisArtTr2 = "" ;
      Z355DisArtTr3 = "" ;
      Z350DisArtRdt = DecimalUtil.ZERO ;
      Z356DisArtUr1 = "" ;
      Z357DisArtUr2 = "" ;
      Z358DisArtUr3 = "" ;
      Z388DisPreKgm = DecimalUtil.ZERO ;
      Z389DisPreMtr = DecimalUtil.ZERO ;
      Z362DisColNom = "" ;
      Z1195DisNomCli = "" ;
      Z1197DisEncCom = DecimalUtil.ZERO ;
      Z1198DisEncAnh = DecimalUtil.ZERO ;
      Z365DisDes = "" ;
      Z375DisNumUni = DecimalUtil.ZERO ;
      Z392DisUniMed = "" ;
      Z1430DisLoc = "" ;
      Z1907DisRdoN = DecimalUtil.ZERO ;
      Z1908DisRdoA = DecimalUtil.ZERO ;
      Z2009DisTipDis = "" ;
      Z2832DisKgsLot = DecimalUtil.ZERO ;
      Z2833DisMtrLot = DecimalUtil.ZERO ;
      Z2835DisPle2 = "" ;
      Z3306DisFac = "" ;
      Z3309DisNumTon = "" ;
      Z4614DisMdlCod = "" ;
      Z4615DisTam = "" ;
      Z4616DisHorEnt = GXutil.resetTime( GXutil.nullDate() );
      Z4617DisHorReg = GXutil.resetTime( GXutil.nullDate() );
      Z5252DisAcc = "" ;
      Z5366DisAntp = "" ;
      Z5405DisAntpT = "" ;
      Z2926DisPla = "" ;
      Z366DisEnt = "" ;
      Z4477DisAcaBak = "" ;
      Z5350DisObsAnc = "" ;
      Z5349DisObsGrm = "" ;
      Z4813DisEncCli = "" ;
      Z4720DisDishCod = "" ;
      Z5032DisEstTip = "" ;
      Z4014DisTin = "" ;
      Z5290DisTipCor = "" ;
      Z4471DisCruEnr = "" ;
      Z4479DisAcaMar = "" ;
      Z1052DisObs = "" ;
      Z1968DisRes = "" ;
      Z1122MaqCodDis = "" ;
      Z10887Cod_Idtx = "" ;
      Z758ProCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A335DisArtCod = "" ;
      A362DisColNom = "" ;
      A392DisUniMed = "" ;
      A365DisDes = "" ;
      A1122MaqCodDis = "" ;
      A10887Cod_Idtx = "" ;
      A758ProCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      A757PriCod = "" ;
      A338DisArtEnc = "" ;
      A336DisArtCor = "" ;
      A3306DisFac = "" ;
      A5252DisAcc = "" ;
      A2926DisPla = "" ;
      A4477DisAcaBak = "" ;
      A5032DisEstTip = "" ;
      A4014DisTin = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A407EmprNom = "" ;
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
      A337DisArtDsc = "" ;
      lblTextblock13_Jsonclick = "" ;
      A340DisArtMat = "" ;
      lblTextblock14_Jsonclick = "" ;
      A339DisArtLar = "" ;
      lblTextblock15_Jsonclick = "" ;
      A351DisArtSua = "" ;
      lblTextblock16_Jsonclick = "" ;
      A333DisArtAca = "" ;
      lblTextblock17_Jsonclick = "" ;
      A343DisArtPle = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A12115DisArtTipD = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      A341DisArtOpe = "" ;
      lblTextblock23_Jsonclick = "" ;
      A353DisArtTr1 = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      A354DisArtTr2 = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      A355DisArtTr3 = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      A356DisArtUr1 = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      A357DisArtUr2 = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      A358DisArtUr3 = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      lblTextblock40_Jsonclick = "" ;
      lblTextblock41_Jsonclick = "" ;
      lblTextblock42_Jsonclick = "" ;
      lblTextblock43_Jsonclick = "" ;
      A385DisPieMtr = DecimalUtil.ZERO ;
      lblTextblock44_Jsonclick = "" ;
      A381DisPieKgm = DecimalUtil.ZERO ;
      lblTextblock45_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      A388DisPreKgm = DecimalUtil.ZERO ;
      lblTextblock47_Jsonclick = "" ;
      A389DisPreMtr = DecimalUtil.ZERO ;
      lblTextblock48_Jsonclick = "" ;
      lblTextblock49_Jsonclick = "" ;
      lblTextblock50_Jsonclick = "" ;
      lblTextblock51_Jsonclick = "" ;
      lblTextblock52_Jsonclick = "" ;
      lblTextblock53_Jsonclick = "" ;
      A1195DisNomCli = "" ;
      lblTextblock54_Jsonclick = "" ;
      lblTextblock55_Jsonclick = "" ;
      A1197DisEncCom = DecimalUtil.ZERO ;
      lblTextblock56_Jsonclick = "" ;
      A1198DisEncAnh = DecimalUtil.ZERO ;
      lblTextblock57_Jsonclick = "" ;
      lblTextblock58_Jsonclick = "" ;
      A12116DisTipCD = "" ;
      lblTextblock59_Jsonclick = "" ;
      lblTextblock60_Jsonclick = "" ;
      lblTextblock61_Jsonclick = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      lblTextblock62_Jsonclick = "" ;
      lblTextblock63_Jsonclick = "" ;
      A399EmprCodDis = "" ;
      lblTextblock64_Jsonclick = "" ;
      lblTextblock65_Jsonclick = "" ;
      A475FindCol = "" ;
      lblTextblock66_Jsonclick = "" ;
      lblTextblock67_Jsonclick = "" ;
      A391DisUni = DecimalUtil.ZERO ;
      lblTextblock68_Jsonclick = "" ;
      lblTextblock69_Jsonclick = "" ;
      lblTextblock70_Jsonclick = "" ;
      A1430DisLoc = "" ;
      lblTextblock71_Jsonclick = "" ;
      lblTextblock72_Jsonclick = "" ;
      lblTextblock73_Jsonclick = "" ;
      A1907DisRdoN = DecimalUtil.ZERO ;
      lblTextblock74_Jsonclick = "" ;
      A1908DisRdoA = DecimalUtil.ZERO ;
      lblTextblock75_Jsonclick = "" ;
      A2009DisTipDis = "" ;
      lblTextblock76_Jsonclick = "" ;
      lblTextblock77_Jsonclick = "" ;
      A2832DisKgsLot = DecimalUtil.ZERO ;
      lblTextblock78_Jsonclick = "" ;
      A2833DisMtrLot = DecimalUtil.ZERO ;
      lblTextblock79_Jsonclick = "" ;
      A2835DisPle2 = "" ;
      lblTextblock80_Jsonclick = "" ;
      lblTextblock81_Jsonclick = "" ;
      lblTextblock82_Jsonclick = "" ;
      lblTextblock83_Jsonclick = "" ;
      lblTextblock84_Jsonclick = "" ;
      lblTextblock85_Jsonclick = "" ;
      lblTextblock86_Jsonclick = "" ;
      lblTextblock87_Jsonclick = "" ;
      lblTextblock88_Jsonclick = "" ;
      lblTextblock89_Jsonclick = "" ;
      A3309DisNumTon = "" ;
      lblTextblock90_Jsonclick = "" ;
      A4614DisMdlCod = "" ;
      lblTextblock91_Jsonclick = "" ;
      A4615DisTam = "" ;
      lblTextblock92_Jsonclick = "" ;
      lblTextblock93_Jsonclick = "" ;
      A4616DisHorEnt = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock94_Jsonclick = "" ;
      lblTextblock95_Jsonclick = "" ;
      A4617DisHorReg = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock96_Jsonclick = "" ;
      lblTextblock97_Jsonclick = "" ;
      A5366DisAntp = "" ;
      lblTextblock98_Jsonclick = "" ;
      A5405DisAntpT = "" ;
      lblTextblock99_Jsonclick = "" ;
      lblTextblock100_Jsonclick = "" ;
      lblTextblock101_Jsonclick = "" ;
      A366DisEnt = "" ;
      lblTextblock102_Jsonclick = "" ;
      lblTextblock103_Jsonclick = "" ;
      A5350DisObsAnc = "" ;
      lblTextblock104_Jsonclick = "" ;
      A5349DisObsGrm = "" ;
      lblTextblock105_Jsonclick = "" ;
      A4813DisEncCli = "" ;
      lblTextblock106_Jsonclick = "" ;
      A4720DisDishCod = "" ;
      lblTextblock107_Jsonclick = "" ;
      lblTextblock108_Jsonclick = "" ;
      lblTextblock109_Jsonclick = "" ;
      lblTextblock110_Jsonclick = "" ;
      A5290DisTipCor = "" ;
      lblTextblock111_Jsonclick = "" ;
      A4471DisCruEnr = "" ;
      lblTextblock112_Jsonclick = "" ;
      A4479DisAcaMar = "" ;
      lblTextblock113_Jsonclick = "" ;
      A1052DisObs = "" ;
      lblTextblock114_Jsonclick = "" ;
      A1968DisRes = "" ;
      lblTextblock115_Jsonclick = "" ;
      lblTextblock116_Jsonclick = "" ;
      lblTextblock117_Jsonclick = "" ;
      A10888Dsc_Idtx = "" ;
      lblTextblock118_Jsonclick = "" ;
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
      A759ProDsc = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z10888Dsc_Idtx = "" ;
      T01IZ18_A5025DisGraCob = new byte[1] ;
      T01IZ18_A10888Dsc_Idtx = new String[] {""} ;
      T01IZ18_n10888Dsc_Idtx = new boolean[] {false} ;
      T01IZ18_A396EmprCod = new String[] {""} ;
      T01IZ18_A252CliCod = new int[1] ;
      T01IZ18_A1122MaqCodDis = new String[] {""} ;
      T01IZ18_n1122MaqCodDis = new boolean[] {false} ;
      T01IZ18_A390DisTipCol = new byte[1] ;
      T01IZ18_n390DisTipCol = new boolean[] {false} ;
      T01IZ18_A10887Cod_Idtx = new String[] {""} ;
      T01IZ18_n10887Cod_Idtx = new boolean[] {false} ;
      T01IZ18_A387DisPiePie = new short[1] ;
      T01IZ18_n387DisPiePie = new boolean[] {false} ;
      T01IZ18_A379DisPie = new short[1] ;
      T01IZ18_n379DisPie = new boolean[] {false} ;
      T01IZ18_A361DisCod = new int[1] ;
      T01IZ18_A757PriCod = new String[] {""} ;
      T01IZ18_A407EmprNom = new String[] {""} ;
      T01IZ18_n407EmprNom = new boolean[] {false} ;
      T01IZ18_A360DisCliNum = new String[] {""} ;
      T01IZ18_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T01IZ18_A279CliNom = new String[] {""} ;
      T01IZ18_A335DisArtCod = new String[] {""} ;
      T01IZ18_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01IZ18_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01IZ18_A337DisArtDsc = new String[] {""} ;
      T01IZ18_A340DisArtMat = new String[] {""} ;
      T01IZ18_A339DisArtLar = new String[] {""} ;
      T01IZ18_A351DisArtSua = new String[] {""} ;
      T01IZ18_A333DisArtAca = new String[] {""} ;
      T01IZ18_A343DisArtPle = new String[] {""} ;
      T01IZ18_A352DisArtTip = new short[1] ;
      T01IZ18_A338DisArtEnc = new String[] {""} ;
      T01IZ18_A336DisArtCor = new String[] {""} ;
      T01IZ18_A341DisArtOpe = new String[] {""} ;
      T01IZ18_A353DisArtTr1 = new String[] {""} ;
      T01IZ18_A344DisArtPt1 = new short[1] ;
      T01IZ18_A354DisArtTr2 = new String[] {""} ;
      T01IZ18_A345DisArtPt2 = new short[1] ;
      T01IZ18_A355DisArtTr3 = new String[] {""} ;
      T01IZ18_A346DisArtPt3 = new short[1] ;
      T01IZ18_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ18_A359DisArtUrg = new byte[1] ;
      T01IZ18_A356DisArtUr1 = new String[] {""} ;
      T01IZ18_A347DisArtPu1 = new short[1] ;
      T01IZ18_A357DisArtUr2 = new String[] {""} ;
      T01IZ18_A348DisArtPu2 = new short[1] ;
      T01IZ18_A358DisArtUr3 = new String[] {""} ;
      T01IZ18_A349DisArtPu3 = new short[1] ;
      T01IZ18_n349DisArtPu3 = new boolean[] {false} ;
      T01IZ18_A342DisArtPes = new short[1] ;
      T01IZ18_A334DisArtAnh = new short[1] ;
      T01IZ18_A1231DisArtAn1 = new short[1] ;
      T01IZ18_A1232DisArtAcb = new short[1] ;
      T01IZ18_A1233DisArtAc2 = new short[1] ;
      T01IZ18_A367DisEst = new byte[1] ;
      T01IZ18_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ18_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ18_A383DisPieLan = new short[1] ;
      T01IZ18_A372DisKgmLan = new short[1] ;
      T01IZ18_A373DisMtrLan = new short[1] ;
      T01IZ18_A362DisColNom = new String[] {""} ;
      T01IZ18_n362DisColNom = new boolean[] {false} ;
      T01IZ18_A363DisColNum = new int[1] ;
      T01IZ18_n363DisColNum = new boolean[] {false} ;
      T01IZ18_A1195DisNomCli = new String[] {""} ;
      T01IZ18_A1196DisNumCli = new int[1] ;
      T01IZ18_A1197DisEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ18_A1198DisEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ18_A365DisDes = new String[] {""} ;
      T01IZ18_A374DisNumPie = new short[1] ;
      T01IZ18_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ18_A392DisUniMed = new String[] {""} ;
      T01IZ18_A1225DisGraCru = new short[1] ;
      T01IZ18_A1430DisLoc = new String[] {""} ;
      T01IZ18_A1502DisPart = new short[1] ;
      T01IZ18_A1906DisGraAca = new short[1] ;
      T01IZ18_A1907DisRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ18_A1908DisRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ18_A2009DisTipDis = new String[] {""} ;
      T01IZ18_n2009DisTipDis = new boolean[] {false} ;
      T01IZ18_A2831DisNumLot = new int[1] ;
      T01IZ18_A2832DisKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ18_A2833DisMtrLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ18_A2835DisPle2 = new String[] {""} ;
      T01IZ18_A3127DisNumCor = new short[1] ;
      T01IZ18_A3128DisAncSal1 = new short[1] ;
      T01IZ18_A3129DisAncSal2 = new short[1] ;
      T01IZ18_A3130DisAncSal3 = new short[1] ;
      T01IZ18_A3131DisGraAca2 = new short[1] ;
      T01IZ18_A3132DisGraCru2 = new short[1] ;
      T01IZ18_A3306DisFac = new String[] {""} ;
      T01IZ18_A3307DisManCod1 = new short[1] ;
      T01IZ18_A3308DisManCod2 = new short[1] ;
      T01IZ18_A3309DisNumTon = new String[] {""} ;
      T01IZ18_A4614DisMdlCod = new String[] {""} ;
      T01IZ18_A4615DisTam = new String[] {""} ;
      T01IZ18_A4293DisNPzas = new int[1] ;
      T01IZ18_n4293DisNPzas = new boolean[] {false} ;
      T01IZ18_A4616DisHorEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01IZ18_n4616DisHorEnt = new boolean[] {false} ;
      T01IZ18_A4294DisNPzasL = new int[1] ;
      T01IZ18_n4294DisNPzasL = new boolean[] {false} ;
      T01IZ18_A4617DisHorReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01IZ18_n4617DisHorReg = new boolean[] {false} ;
      T01IZ18_A5252DisAcc = new String[] {""} ;
      T01IZ18_A5366DisAntp = new String[] {""} ;
      T01IZ18_A5405DisAntpT = new String[] {""} ;
      T01IZ18_A2926DisPla = new String[] {""} ;
      T01IZ18_A4013DisEnv = new byte[1] ;
      T01IZ18_n4013DisEnv = new boolean[] {false} ;
      T01IZ18_A366DisEnt = new String[] {""} ;
      T01IZ18_A4477DisAcaBak = new String[] {""} ;
      T01IZ18_A5350DisObsAnc = new String[] {""} ;
      T01IZ18_A5349DisObsGrm = new String[] {""} ;
      T01IZ18_A4813DisEncCli = new String[] {""} ;
      T01IZ18_A4720DisDishCod = new String[] {""} ;
      T01IZ18_A2743DisNumTex1 = new byte[1] ;
      T01IZ18_A5032DisEstTip = new String[] {""} ;
      T01IZ18_A4014DisTin = new String[] {""} ;
      T01IZ18_A5290DisTipCor = new String[] {""} ;
      T01IZ18_A4471DisCruEnr = new String[] {""} ;
      T01IZ18_A4479DisAcaMar = new String[] {""} ;
      T01IZ18_A1052DisObs = new String[] {""} ;
      T01IZ18_A1968DisRes = new String[] {""} ;
      T01IZ18_n1968DisRes = new boolean[] {false} ;
      T01IZ7_A407EmprNom = new String[] {""} ;
      T01IZ7_n407EmprNom = new boolean[] {false} ;
      T01IZ8_A279CliNom = new String[] {""} ;
      T01IZ9_A396EmprCod = new String[] {""} ;
      T01IZ10_A396EmprCod = new String[] {""} ;
      T01IZ11_A10888Dsc_Idtx = new String[] {""} ;
      T01IZ11_n10888Dsc_Idtx = new boolean[] {false} ;
      T01IZ13_A387DisPiePie = new short[1] ;
      T01IZ13_n387DisPiePie = new boolean[] {false} ;
      T01IZ15_A379DisPie = new short[1] ;
      T01IZ15_n379DisPie = new boolean[] {false} ;
      T01IZ19_A407EmprNom = new String[] {""} ;
      T01IZ19_n407EmprNom = new boolean[] {false} ;
      T01IZ20_A279CliNom = new String[] {""} ;
      T01IZ21_A396EmprCod = new String[] {""} ;
      T01IZ22_A396EmprCod = new String[] {""} ;
      T01IZ23_A10888Dsc_Idtx = new String[] {""} ;
      T01IZ23_n10888Dsc_Idtx = new boolean[] {false} ;
      T01IZ25_A387DisPiePie = new short[1] ;
      T01IZ25_n387DisPiePie = new boolean[] {false} ;
      T01IZ27_A379DisPie = new short[1] ;
      T01IZ27_n379DisPie = new boolean[] {false} ;
      T01IZ28_A396EmprCod = new String[] {""} ;
      T01IZ28_A361DisCod = new int[1] ;
      T01IZ6_A5025DisGraCob = new byte[1] ;
      T01IZ6_A396EmprCod = new String[] {""} ;
      T01IZ6_A252CliCod = new int[1] ;
      T01IZ6_A1122MaqCodDis = new String[] {""} ;
      T01IZ6_n1122MaqCodDis = new boolean[] {false} ;
      T01IZ6_A390DisTipCol = new byte[1] ;
      T01IZ6_n390DisTipCol = new boolean[] {false} ;
      T01IZ6_A10887Cod_Idtx = new String[] {""} ;
      T01IZ6_n10887Cod_Idtx = new boolean[] {false} ;
      T01IZ6_A361DisCod = new int[1] ;
      T01IZ6_A757PriCod = new String[] {""} ;
      T01IZ6_A360DisCliNum = new String[] {""} ;
      T01IZ6_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T01IZ6_A335DisArtCod = new String[] {""} ;
      T01IZ6_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01IZ6_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01IZ6_A337DisArtDsc = new String[] {""} ;
      T01IZ6_A340DisArtMat = new String[] {""} ;
      T01IZ6_A339DisArtLar = new String[] {""} ;
      T01IZ6_A351DisArtSua = new String[] {""} ;
      T01IZ6_A333DisArtAca = new String[] {""} ;
      T01IZ6_A343DisArtPle = new String[] {""} ;
      T01IZ6_A352DisArtTip = new short[1] ;
      T01IZ6_A338DisArtEnc = new String[] {""} ;
      T01IZ6_A336DisArtCor = new String[] {""} ;
      T01IZ6_A341DisArtOpe = new String[] {""} ;
      T01IZ6_A353DisArtTr1 = new String[] {""} ;
      T01IZ6_A344DisArtPt1 = new short[1] ;
      T01IZ6_A354DisArtTr2 = new String[] {""} ;
      T01IZ6_A345DisArtPt2 = new short[1] ;
      T01IZ6_A355DisArtTr3 = new String[] {""} ;
      T01IZ6_A346DisArtPt3 = new short[1] ;
      T01IZ6_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ6_A359DisArtUrg = new byte[1] ;
      T01IZ6_A356DisArtUr1 = new String[] {""} ;
      T01IZ6_A347DisArtPu1 = new short[1] ;
      T01IZ6_A357DisArtUr2 = new String[] {""} ;
      T01IZ6_A348DisArtPu2 = new short[1] ;
      T01IZ6_A358DisArtUr3 = new String[] {""} ;
      T01IZ6_A349DisArtPu3 = new short[1] ;
      T01IZ6_n349DisArtPu3 = new boolean[] {false} ;
      T01IZ6_A342DisArtPes = new short[1] ;
      T01IZ6_A334DisArtAnh = new short[1] ;
      T01IZ6_A1231DisArtAn1 = new short[1] ;
      T01IZ6_A1232DisArtAcb = new short[1] ;
      T01IZ6_A1233DisArtAc2 = new short[1] ;
      T01IZ6_A367DisEst = new byte[1] ;
      T01IZ6_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ6_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ6_A383DisPieLan = new short[1] ;
      T01IZ6_A372DisKgmLan = new short[1] ;
      T01IZ6_A373DisMtrLan = new short[1] ;
      T01IZ6_A362DisColNom = new String[] {""} ;
      T01IZ6_n362DisColNom = new boolean[] {false} ;
      T01IZ6_A363DisColNum = new int[1] ;
      T01IZ6_n363DisColNum = new boolean[] {false} ;
      T01IZ6_A1195DisNomCli = new String[] {""} ;
      T01IZ6_A1196DisNumCli = new int[1] ;
      T01IZ6_A1197DisEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ6_A1198DisEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ6_A365DisDes = new String[] {""} ;
      T01IZ6_A374DisNumPie = new short[1] ;
      T01IZ6_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ6_A392DisUniMed = new String[] {""} ;
      T01IZ6_A1225DisGraCru = new short[1] ;
      T01IZ6_A1430DisLoc = new String[] {""} ;
      T01IZ6_A1502DisPart = new short[1] ;
      T01IZ6_A1906DisGraAca = new short[1] ;
      T01IZ6_A1907DisRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ6_A1908DisRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ6_A2009DisTipDis = new String[] {""} ;
      T01IZ6_n2009DisTipDis = new boolean[] {false} ;
      T01IZ6_A2831DisNumLot = new int[1] ;
      T01IZ6_A2832DisKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ6_A2833DisMtrLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ6_A2835DisPle2 = new String[] {""} ;
      T01IZ6_A3127DisNumCor = new short[1] ;
      T01IZ6_A3128DisAncSal1 = new short[1] ;
      T01IZ6_A3129DisAncSal2 = new short[1] ;
      T01IZ6_A3130DisAncSal3 = new short[1] ;
      T01IZ6_A3131DisGraAca2 = new short[1] ;
      T01IZ6_A3132DisGraCru2 = new short[1] ;
      T01IZ6_A3306DisFac = new String[] {""} ;
      T01IZ6_A3307DisManCod1 = new short[1] ;
      T01IZ6_A3308DisManCod2 = new short[1] ;
      T01IZ6_A3309DisNumTon = new String[] {""} ;
      T01IZ6_A4614DisMdlCod = new String[] {""} ;
      T01IZ6_A4615DisTam = new String[] {""} ;
      T01IZ6_A4293DisNPzas = new int[1] ;
      T01IZ6_n4293DisNPzas = new boolean[] {false} ;
      T01IZ6_A4616DisHorEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01IZ6_n4616DisHorEnt = new boolean[] {false} ;
      T01IZ6_A4294DisNPzasL = new int[1] ;
      T01IZ6_n4294DisNPzasL = new boolean[] {false} ;
      T01IZ6_A4617DisHorReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01IZ6_n4617DisHorReg = new boolean[] {false} ;
      T01IZ6_A5252DisAcc = new String[] {""} ;
      T01IZ6_A5366DisAntp = new String[] {""} ;
      T01IZ6_A5405DisAntpT = new String[] {""} ;
      T01IZ6_A2926DisPla = new String[] {""} ;
      T01IZ6_A4013DisEnv = new byte[1] ;
      T01IZ6_n4013DisEnv = new boolean[] {false} ;
      T01IZ6_A366DisEnt = new String[] {""} ;
      T01IZ6_A4477DisAcaBak = new String[] {""} ;
      T01IZ6_A5350DisObsAnc = new String[] {""} ;
      T01IZ6_A5349DisObsGrm = new String[] {""} ;
      T01IZ6_A4813DisEncCli = new String[] {""} ;
      T01IZ6_A4720DisDishCod = new String[] {""} ;
      T01IZ6_A2743DisNumTex1 = new byte[1] ;
      T01IZ6_A5032DisEstTip = new String[] {""} ;
      T01IZ6_A4014DisTin = new String[] {""} ;
      T01IZ6_A5290DisTipCor = new String[] {""} ;
      T01IZ6_A4471DisCruEnr = new String[] {""} ;
      T01IZ6_A4479DisAcaMar = new String[] {""} ;
      T01IZ6_A1052DisObs = new String[] {""} ;
      T01IZ6_A1968DisRes = new String[] {""} ;
      T01IZ6_n1968DisRes = new boolean[] {false} ;
      T01IZ29_A396EmprCod = new String[] {""} ;
      T01IZ29_A361DisCod = new int[1] ;
      T01IZ30_A396EmprCod = new String[] {""} ;
      T01IZ30_A361DisCod = new int[1] ;
      T01IZ5_A5025DisGraCob = new byte[1] ;
      T01IZ5_A396EmprCod = new String[] {""} ;
      T01IZ5_A252CliCod = new int[1] ;
      T01IZ5_A1122MaqCodDis = new String[] {""} ;
      T01IZ5_n1122MaqCodDis = new boolean[] {false} ;
      T01IZ5_A390DisTipCol = new byte[1] ;
      T01IZ5_n390DisTipCol = new boolean[] {false} ;
      T01IZ5_A10887Cod_Idtx = new String[] {""} ;
      T01IZ5_n10887Cod_Idtx = new boolean[] {false} ;
      T01IZ5_A361DisCod = new int[1] ;
      T01IZ5_A757PriCod = new String[] {""} ;
      T01IZ5_A360DisCliNum = new String[] {""} ;
      T01IZ5_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T01IZ5_A335DisArtCod = new String[] {""} ;
      T01IZ5_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01IZ5_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01IZ5_A337DisArtDsc = new String[] {""} ;
      T01IZ5_A340DisArtMat = new String[] {""} ;
      T01IZ5_A339DisArtLar = new String[] {""} ;
      T01IZ5_A351DisArtSua = new String[] {""} ;
      T01IZ5_A333DisArtAca = new String[] {""} ;
      T01IZ5_A343DisArtPle = new String[] {""} ;
      T01IZ5_A352DisArtTip = new short[1] ;
      T01IZ5_A338DisArtEnc = new String[] {""} ;
      T01IZ5_A336DisArtCor = new String[] {""} ;
      T01IZ5_A341DisArtOpe = new String[] {""} ;
      T01IZ5_A353DisArtTr1 = new String[] {""} ;
      T01IZ5_A344DisArtPt1 = new short[1] ;
      T01IZ5_A354DisArtTr2 = new String[] {""} ;
      T01IZ5_A345DisArtPt2 = new short[1] ;
      T01IZ5_A355DisArtTr3 = new String[] {""} ;
      T01IZ5_A346DisArtPt3 = new short[1] ;
      T01IZ5_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ5_A359DisArtUrg = new byte[1] ;
      T01IZ5_A356DisArtUr1 = new String[] {""} ;
      T01IZ5_A347DisArtPu1 = new short[1] ;
      T01IZ5_A357DisArtUr2 = new String[] {""} ;
      T01IZ5_A348DisArtPu2 = new short[1] ;
      T01IZ5_A358DisArtUr3 = new String[] {""} ;
      T01IZ5_A349DisArtPu3 = new short[1] ;
      T01IZ5_n349DisArtPu3 = new boolean[] {false} ;
      T01IZ5_A342DisArtPes = new short[1] ;
      T01IZ5_A334DisArtAnh = new short[1] ;
      T01IZ5_A1231DisArtAn1 = new short[1] ;
      T01IZ5_A1232DisArtAcb = new short[1] ;
      T01IZ5_A1233DisArtAc2 = new short[1] ;
      T01IZ5_A367DisEst = new byte[1] ;
      T01IZ5_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ5_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ5_A383DisPieLan = new short[1] ;
      T01IZ5_A372DisKgmLan = new short[1] ;
      T01IZ5_A373DisMtrLan = new short[1] ;
      T01IZ5_A362DisColNom = new String[] {""} ;
      T01IZ5_n362DisColNom = new boolean[] {false} ;
      T01IZ5_A363DisColNum = new int[1] ;
      T01IZ5_n363DisColNum = new boolean[] {false} ;
      T01IZ5_A1195DisNomCli = new String[] {""} ;
      T01IZ5_A1196DisNumCli = new int[1] ;
      T01IZ5_A1197DisEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ5_A1198DisEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ5_A365DisDes = new String[] {""} ;
      T01IZ5_A374DisNumPie = new short[1] ;
      T01IZ5_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ5_A392DisUniMed = new String[] {""} ;
      T01IZ5_A1225DisGraCru = new short[1] ;
      T01IZ5_A1430DisLoc = new String[] {""} ;
      T01IZ5_A1502DisPart = new short[1] ;
      T01IZ5_A1906DisGraAca = new short[1] ;
      T01IZ5_A1907DisRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ5_A1908DisRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ5_A2009DisTipDis = new String[] {""} ;
      T01IZ5_n2009DisTipDis = new boolean[] {false} ;
      T01IZ5_A2831DisNumLot = new int[1] ;
      T01IZ5_A2832DisKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ5_A2833DisMtrLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ5_A2835DisPle2 = new String[] {""} ;
      T01IZ5_A3127DisNumCor = new short[1] ;
      T01IZ5_A3128DisAncSal1 = new short[1] ;
      T01IZ5_A3129DisAncSal2 = new short[1] ;
      T01IZ5_A3130DisAncSal3 = new short[1] ;
      T01IZ5_A3131DisGraAca2 = new short[1] ;
      T01IZ5_A3132DisGraCru2 = new short[1] ;
      T01IZ5_A3306DisFac = new String[] {""} ;
      T01IZ5_A3307DisManCod1 = new short[1] ;
      T01IZ5_A3308DisManCod2 = new short[1] ;
      T01IZ5_A3309DisNumTon = new String[] {""} ;
      T01IZ5_A4614DisMdlCod = new String[] {""} ;
      T01IZ5_A4615DisTam = new String[] {""} ;
      T01IZ5_A4293DisNPzas = new int[1] ;
      T01IZ5_n4293DisNPzas = new boolean[] {false} ;
      T01IZ5_A4616DisHorEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01IZ5_n4616DisHorEnt = new boolean[] {false} ;
      T01IZ5_A4294DisNPzasL = new int[1] ;
      T01IZ5_n4294DisNPzasL = new boolean[] {false} ;
      T01IZ5_A4617DisHorReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01IZ5_n4617DisHorReg = new boolean[] {false} ;
      T01IZ5_A5252DisAcc = new String[] {""} ;
      T01IZ5_A5366DisAntp = new String[] {""} ;
      T01IZ5_A5405DisAntpT = new String[] {""} ;
      T01IZ5_A2926DisPla = new String[] {""} ;
      T01IZ5_A4013DisEnv = new byte[1] ;
      T01IZ5_n4013DisEnv = new boolean[] {false} ;
      T01IZ5_A366DisEnt = new String[] {""} ;
      T01IZ5_A4477DisAcaBak = new String[] {""} ;
      T01IZ5_A5350DisObsAnc = new String[] {""} ;
      T01IZ5_A5349DisObsGrm = new String[] {""} ;
      T01IZ5_A4813DisEncCli = new String[] {""} ;
      T01IZ5_A4720DisDishCod = new String[] {""} ;
      T01IZ5_A2743DisNumTex1 = new byte[1] ;
      T01IZ5_A5032DisEstTip = new String[] {""} ;
      T01IZ5_A4014DisTin = new String[] {""} ;
      T01IZ5_A5290DisTipCor = new String[] {""} ;
      T01IZ5_A4471DisCruEnr = new String[] {""} ;
      T01IZ5_A4479DisAcaMar = new String[] {""} ;
      T01IZ5_A1052DisObs = new String[] {""} ;
      T01IZ5_A1968DisRes = new String[] {""} ;
      T01IZ5_n1968DisRes = new boolean[] {false} ;
      T01IZ34_A407EmprNom = new String[] {""} ;
      T01IZ34_n407EmprNom = new boolean[] {false} ;
      T01IZ36_A387DisPiePie = new short[1] ;
      T01IZ36_n387DisPiePie = new boolean[] {false} ;
      T01IZ38_A379DisPie = new short[1] ;
      T01IZ38_n379DisPie = new boolean[] {false} ;
      T01IZ39_A279CliNom = new String[] {""} ;
      T01IZ40_A10888Dsc_Idtx = new String[] {""} ;
      T01IZ40_n10888Dsc_Idtx = new boolean[] {false} ;
      T01IZ41_A396EmprCod = new String[] {""} ;
      T01IZ41_A361DisCod = new int[1] ;
      T01IZ41_A13376DisTraID = new String[] {""} ;
      T01IZ42_A396EmprCod = new String[] {""} ;
      T01IZ42_A361DisCod = new int[1] ;
      T01IZ42_A13213DisNormID = new String[] {""} ;
      T01IZ43_A396EmprCod = new String[] {""} ;
      T01IZ43_A361DisCod = new int[1] ;
      T01IZ43_A13081DisDGLin = new byte[1] ;
      T01IZ43_A13082DisDGDibCl = new String[] {""} ;
      T01IZ43_A13083DisDGDibIn = new int[1] ;
      T01IZ43_A13084DisDGComb = new String[] {""} ;
      T01IZ43_A13085DisDGFondo = new String[] {""} ;
      T01IZ44_A396EmprCod = new String[] {""} ;
      T01IZ44_A361DisCod = new int[1] ;
      T01IZ44_A7068DisNotLin = new byte[1] ;
      T01IZ45_A396EmprCod = new String[] {""} ;
      T01IZ45_A361DisCod = new int[1] ;
      T01IZ45_A10197ProEspCod = new String[] {""} ;
      T01IZ46_A396EmprCod = new String[] {""} ;
      T01IZ46_A361DisCod = new int[1] ;
      T01IZ46_A4594AccCod = new short[1] ;
      T01IZ47_A396EmprCod = new String[] {""} ;
      T01IZ47_A361DisCod = new int[1] ;
      T01IZ47_A2524DisComLin = new byte[1] ;
      T01IZ47_A1056DisComCod = new String[] {""} ;
      T01IZ47_A1032FonCod = new String[] {""} ;
      T01IZ48_A396EmprCod = new String[] {""} ;
      T01IZ48_A361DisCod = new int[1] ;
      T01IZ48_A3398DisRefBarC = new int[1] ;
      T01IZ48_A3399DisRefBCRe = new byte[1] ;
      T01IZ48_A3400DisRefBCPa = new String[] {""} ;
      T01IZ48_A3607DisRefBPie = new String[] {""} ;
      T01IZ49_A396EmprCod = new String[] {""} ;
      T01IZ49_A361DisCod = new int[1] ;
      T01IZ49_A376DisObsLin = new byte[1] ;
      T01IZ50_A396EmprCod = new String[] {""} ;
      T01IZ50_A361DisCod = new int[1] ;
      T01IZ50_A758ProCod = new String[] {""} ;
      T01IZ50_A368DisFasLin = new short[1] ;
      T01IZ51_A396EmprCod = new String[] {""} ;
      T01IZ51_A361DisCod = new int[1] ;
      T01IZ51_A833TipDefCod = new short[1] ;
      T01IZ52_A396EmprCod = new String[] {""} ;
      T01IZ52_A361DisCod = new int[1] ;
      T01IZ52_A44AlbRecCod = new int[1] ;
      T01IZ53_A396EmprCod = new String[] {""} ;
      T01IZ53_A361DisCod = new int[1] ;
      Z759ProDsc = "" ;
      T01IZ54_A361DisCod = new int[1] ;
      T01IZ54_A759ProDsc = new String[] {""} ;
      T01IZ54_A396EmprCod = new String[] {""} ;
      T01IZ54_A758ProCod = new String[] {""} ;
      T01IZ4_A759ProDsc = new String[] {""} ;
      T01IZ55_A759ProDsc = new String[] {""} ;
      T01IZ56_A396EmprCod = new String[] {""} ;
      T01IZ56_A361DisCod = new int[1] ;
      T01IZ56_A758ProCod = new String[] {""} ;
      T01IZ3_A361DisCod = new int[1] ;
      T01IZ3_A396EmprCod = new String[] {""} ;
      T01IZ3_A758ProCod = new String[] {""} ;
      T01IZ2_A361DisCod = new int[1] ;
      T01IZ2_A396EmprCod = new String[] {""} ;
      T01IZ2_A758ProCod = new String[] {""} ;
      GXv_int5 = new int[1] ;
      T01IZ59_A759ProDsc = new String[] {""} ;
      T01IZ60_A396EmprCod = new String[] {""} ;
      T01IZ60_A361DisCod = new int[1] ;
      T01IZ60_A758ProCod = new String[] {""} ;
      T01IZ60_A368DisFasLin = new short[1] ;
      T01IZ61_A396EmprCod = new String[] {""} ;
      T01IZ61_A361DisCod = new int[1] ;
      T01IZ61_A758ProCod = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Z12116DisTipCD = "" ;
      Z12115DisArtTipD = "" ;
      Z475FindCol = "" ;
      Z399EmprCodDis = "" ;
      Z391DisUni = DecimalUtil.ZERO ;
      Z381DisPieKgm = DecimalUtil.ZERO ;
      Z385DisPieMtr = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ757PriCod = "" ;
      ZZ360DisCliNum = "" ;
      ZZ370DisFecCli = GXutil.nullDate() ;
      ZZ335DisArtCod = "" ;
      ZZ369DisFec = GXutil.nullDate() ;
      ZZ371DisFecEnt = GXutil.nullDate() ;
      ZZ337DisArtDsc = "" ;
      ZZ340DisArtMat = "" ;
      ZZ339DisArtLar = "" ;
      ZZ351DisArtSua = "" ;
      ZZ333DisArtAca = "" ;
      ZZ343DisArtPle = "" ;
      ZZ338DisArtEnc = "" ;
      ZZ336DisArtCor = "" ;
      ZZ341DisArtOpe = "" ;
      ZZ353DisArtTr1 = "" ;
      ZZ354DisArtTr2 = "" ;
      ZZ355DisArtTr3 = "" ;
      ZZ350DisArtRdt = DecimalUtil.ZERO ;
      ZZ356DisArtUr1 = "" ;
      ZZ357DisArtUr2 = "" ;
      ZZ358DisArtUr3 = "" ;
      ZZ388DisPreKgm = DecimalUtil.ZERO ;
      ZZ389DisPreMtr = DecimalUtil.ZERO ;
      ZZ362DisColNom = "" ;
      ZZ1195DisNomCli = "" ;
      ZZ1197DisEncCom = DecimalUtil.ZERO ;
      ZZ1198DisEncAnh = DecimalUtil.ZERO ;
      ZZ365DisDes = "" ;
      ZZ375DisNumUni = DecimalUtil.ZERO ;
      ZZ392DisUniMed = "" ;
      ZZ1430DisLoc = "" ;
      ZZ1907DisRdoN = DecimalUtil.ZERO ;
      ZZ1908DisRdoA = DecimalUtil.ZERO ;
      ZZ2009DisTipDis = "" ;
      ZZ2832DisKgsLot = DecimalUtil.ZERO ;
      ZZ2833DisMtrLot = DecimalUtil.ZERO ;
      ZZ2835DisPle2 = "" ;
      ZZ3306DisFac = "" ;
      ZZ3309DisNumTon = "" ;
      ZZ4614DisMdlCod = "" ;
      ZZ4615DisTam = "" ;
      ZZ4616DisHorEnt = GXutil.resetTime( GXutil.nullDate() );
      ZZ4617DisHorReg = GXutil.resetTime( GXutil.nullDate() );
      ZZ5252DisAcc = "" ;
      ZZ5366DisAntp = "" ;
      ZZ5405DisAntpT = "" ;
      ZZ2926DisPla = "" ;
      ZZ366DisEnt = "" ;
      ZZ4477DisAcaBak = "" ;
      ZZ5350DisObsAnc = "" ;
      ZZ5349DisObsGrm = "" ;
      ZZ4813DisEncCli = "" ;
      ZZ4720DisDishCod = "" ;
      ZZ5032DisEstTip = "" ;
      ZZ4014DisTin = "" ;
      ZZ5290DisTipCor = "" ;
      ZZ4471DisCruEnr = "" ;
      ZZ4479DisAcaMar = "" ;
      ZZ1052DisObs = "" ;
      ZZ1968DisRes = "" ;
      ZZ10887Cod_Idtx = "" ;
      ZZ1122MaqCodDis = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ10888Dsc_Idtx = "" ;
      ZZ12116DisTipCD = "" ;
      ZZ12115DisArtTipD = "" ;
      ZZ475FindCol = "" ;
      ZZ399EmprCodDis = "" ;
      ZZ391DisUni = DecimalUtil.ZERO ;
      ZZ381DisPieKgm = DecimalUtil.ZERO ;
      ZZ385DisPieMtr = DecimalUtil.ZERO ;
      T01IZ62_A396EmprCod = new String[] {""} ;
      GXv_int3 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      T01IZ63_A396EmprCod = new String[] {""} ;
      E396EmprCod = "" ;
      T01IZ64_A673Piezas = new int[1] ;
      X631Metros = DecimalUtil.ZERO ;
      T01IZ65_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X384DisPieMet = DecimalUtil.ZERO ;
      T01IZ66_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X595Kilos = DecimalUtil.ZERO ;
      T01IZ67_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      X382DisPieKil = DecimalUtil.ZERO ;
      T01IZ68_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ69_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01IZ70_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdispol__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdispol__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdispol__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdispol__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdispol__default(),
         new Object[] {
             new Object[] {
            T01IZ2_A361DisCod, T01IZ2_A396EmprCod, T01IZ2_A758ProCod
            }
            , new Object[] {
            T01IZ3_A361DisCod, T01IZ3_A396EmprCod, T01IZ3_A758ProCod
            }
            , new Object[] {
            T01IZ4_A759ProDsc
            }
            , new Object[] {
            T01IZ5_A5025DisGraCob, T01IZ5_A396EmprCod, T01IZ5_A252CliCod, T01IZ5_A1122MaqCodDis, T01IZ5_n1122MaqCodDis, T01IZ5_A390DisTipCol, T01IZ5_n390DisTipCol, T01IZ5_A10887Cod_Idtx, T01IZ5_n10887Cod_Idtx, T01IZ5_A361DisCod,
            T01IZ5_A757PriCod, T01IZ5_A360DisCliNum, T01IZ5_A370DisFecCli, T01IZ5_A335DisArtCod, T01IZ5_A369DisFec, T01IZ5_A371DisFecEnt, T01IZ5_A337DisArtDsc, T01IZ5_A340DisArtMat, T01IZ5_A339DisArtLar, T01IZ5_A351DisArtSua,
            T01IZ5_A333DisArtAca, T01IZ5_A343DisArtPle, T01IZ5_A352DisArtTip, T01IZ5_A338DisArtEnc, T01IZ5_A336DisArtCor, T01IZ5_A341DisArtOpe, T01IZ5_A353DisArtTr1, T01IZ5_A344DisArtPt1, T01IZ5_A354DisArtTr2, T01IZ5_A345DisArtPt2,
            T01IZ5_A355DisArtTr3, T01IZ5_A346DisArtPt3, T01IZ5_A350DisArtRdt, T01IZ5_A359DisArtUrg, T01IZ5_A356DisArtUr1, T01IZ5_A347DisArtPu1, T01IZ5_A357DisArtUr2, T01IZ5_A348DisArtPu2, T01IZ5_A358DisArtUr3, T01IZ5_A349DisArtPu3,
            T01IZ5_n349DisArtPu3, T01IZ5_A342DisArtPes, T01IZ5_A334DisArtAnh, T01IZ5_A1231DisArtAn1, T01IZ5_A1232DisArtAcb, T01IZ5_A1233DisArtAc2, T01IZ5_A367DisEst, T01IZ5_A388DisPreKgm, T01IZ5_A389DisPreMtr, T01IZ5_A383DisPieLan,
            T01IZ5_A372DisKgmLan, T01IZ5_A373DisMtrLan, T01IZ5_A362DisColNom, T01IZ5_n362DisColNom, T01IZ5_A363DisColNum, T01IZ5_n363DisColNum, T01IZ5_A1195DisNomCli, T01IZ5_A1196DisNumCli, T01IZ5_A1197DisEncCom, T01IZ5_A1198DisEncAnh,
            T01IZ5_A365DisDes, T01IZ5_A374DisNumPie, T01IZ5_A375DisNumUni, T01IZ5_A392DisUniMed, T01IZ5_A1225DisGraCru, T01IZ5_A1430DisLoc, T01IZ5_A1502DisPart, T01IZ5_A1906DisGraAca, T01IZ5_A1907DisRdoN, T01IZ5_A1908DisRdoA,
            T01IZ5_A2009DisTipDis, T01IZ5_n2009DisTipDis, T01IZ5_A2831DisNumLot, T01IZ5_A2832DisKgsLot, T01IZ5_A2833DisMtrLot, T01IZ5_A2835DisPle2, T01IZ5_A3127DisNumCor, T01IZ5_A3128DisAncSal1, T01IZ5_A3129DisAncSal2, T01IZ5_A3130DisAncSal3,
            T01IZ5_A3131DisGraAca2, T01IZ5_A3132DisGraCru2, T01IZ5_A3306DisFac, T01IZ5_A3307DisManCod1, T01IZ5_A3308DisManCod2, T01IZ5_A3309DisNumTon, T01IZ5_A4614DisMdlCod, T01IZ5_A4615DisTam, T01IZ5_A4293DisNPzas, T01IZ5_n4293DisNPzas,
            T01IZ5_A4616DisHorEnt, T01IZ5_n4616DisHorEnt, T01IZ5_A4294DisNPzasL, T01IZ5_n4294DisNPzasL, T01IZ5_A4617DisHorReg, T01IZ5_n4617DisHorReg, T01IZ5_A5252DisAcc, T01IZ5_A5366DisAntp, T01IZ5_A5405DisAntpT, T01IZ5_A2926DisPla,
            T01IZ5_A4013DisEnv, T01IZ5_n4013DisEnv, T01IZ5_A366DisEnt, T01IZ5_A4477DisAcaBak, T01IZ5_A5350DisObsAnc, T01IZ5_A5349DisObsGrm, T01IZ5_A4813DisEncCli, T01IZ5_A4720DisDishCod, T01IZ5_A2743DisNumTex1, T01IZ5_A5032DisEstTip,
            T01IZ5_A4014DisTin, T01IZ5_A5290DisTipCor, T01IZ5_A4471DisCruEnr, T01IZ5_A4479DisAcaMar, T01IZ5_A1052DisObs, T01IZ5_A1968DisRes, T01IZ5_n1968DisRes
            }
            , new Object[] {
            T01IZ6_A5025DisGraCob, T01IZ6_A396EmprCod, T01IZ6_A252CliCod, T01IZ6_A1122MaqCodDis, T01IZ6_n1122MaqCodDis, T01IZ6_A390DisTipCol, T01IZ6_n390DisTipCol, T01IZ6_A10887Cod_Idtx, T01IZ6_n10887Cod_Idtx, T01IZ6_A361DisCod,
            T01IZ6_A757PriCod, T01IZ6_A360DisCliNum, T01IZ6_A370DisFecCli, T01IZ6_A335DisArtCod, T01IZ6_A369DisFec, T01IZ6_A371DisFecEnt, T01IZ6_A337DisArtDsc, T01IZ6_A340DisArtMat, T01IZ6_A339DisArtLar, T01IZ6_A351DisArtSua,
            T01IZ6_A333DisArtAca, T01IZ6_A343DisArtPle, T01IZ6_A352DisArtTip, T01IZ6_A338DisArtEnc, T01IZ6_A336DisArtCor, T01IZ6_A341DisArtOpe, T01IZ6_A353DisArtTr1, T01IZ6_A344DisArtPt1, T01IZ6_A354DisArtTr2, T01IZ6_A345DisArtPt2,
            T01IZ6_A355DisArtTr3, T01IZ6_A346DisArtPt3, T01IZ6_A350DisArtRdt, T01IZ6_A359DisArtUrg, T01IZ6_A356DisArtUr1, T01IZ6_A347DisArtPu1, T01IZ6_A357DisArtUr2, T01IZ6_A348DisArtPu2, T01IZ6_A358DisArtUr3, T01IZ6_A349DisArtPu3,
            T01IZ6_n349DisArtPu3, T01IZ6_A342DisArtPes, T01IZ6_A334DisArtAnh, T01IZ6_A1231DisArtAn1, T01IZ6_A1232DisArtAcb, T01IZ6_A1233DisArtAc2, T01IZ6_A367DisEst, T01IZ6_A388DisPreKgm, T01IZ6_A389DisPreMtr, T01IZ6_A383DisPieLan,
            T01IZ6_A372DisKgmLan, T01IZ6_A373DisMtrLan, T01IZ6_A362DisColNom, T01IZ6_n362DisColNom, T01IZ6_A363DisColNum, T01IZ6_n363DisColNum, T01IZ6_A1195DisNomCli, T01IZ6_A1196DisNumCli, T01IZ6_A1197DisEncCom, T01IZ6_A1198DisEncAnh,
            T01IZ6_A365DisDes, T01IZ6_A374DisNumPie, T01IZ6_A375DisNumUni, T01IZ6_A392DisUniMed, T01IZ6_A1225DisGraCru, T01IZ6_A1430DisLoc, T01IZ6_A1502DisPart, T01IZ6_A1906DisGraAca, T01IZ6_A1907DisRdoN, T01IZ6_A1908DisRdoA,
            T01IZ6_A2009DisTipDis, T01IZ6_n2009DisTipDis, T01IZ6_A2831DisNumLot, T01IZ6_A2832DisKgsLot, T01IZ6_A2833DisMtrLot, T01IZ6_A2835DisPle2, T01IZ6_A3127DisNumCor, T01IZ6_A3128DisAncSal1, T01IZ6_A3129DisAncSal2, T01IZ6_A3130DisAncSal3,
            T01IZ6_A3131DisGraAca2, T01IZ6_A3132DisGraCru2, T01IZ6_A3306DisFac, T01IZ6_A3307DisManCod1, T01IZ6_A3308DisManCod2, T01IZ6_A3309DisNumTon, T01IZ6_A4614DisMdlCod, T01IZ6_A4615DisTam, T01IZ6_A4293DisNPzas, T01IZ6_n4293DisNPzas,
            T01IZ6_A4616DisHorEnt, T01IZ6_n4616DisHorEnt, T01IZ6_A4294DisNPzasL, T01IZ6_n4294DisNPzasL, T01IZ6_A4617DisHorReg, T01IZ6_n4617DisHorReg, T01IZ6_A5252DisAcc, T01IZ6_A5366DisAntp, T01IZ6_A5405DisAntpT, T01IZ6_A2926DisPla,
            T01IZ6_A4013DisEnv, T01IZ6_n4013DisEnv, T01IZ6_A366DisEnt, T01IZ6_A4477DisAcaBak, T01IZ6_A5350DisObsAnc, T01IZ6_A5349DisObsGrm, T01IZ6_A4813DisEncCli, T01IZ6_A4720DisDishCod, T01IZ6_A2743DisNumTex1, T01IZ6_A5032DisEstTip,
            T01IZ6_A4014DisTin, T01IZ6_A5290DisTipCor, T01IZ6_A4471DisCruEnr, T01IZ6_A4479DisAcaMar, T01IZ6_A1052DisObs, T01IZ6_A1968DisRes, T01IZ6_n1968DisRes
            }
            , new Object[] {
            T01IZ7_A407EmprNom, T01IZ7_n407EmprNom
            }
            , new Object[] {
            T01IZ8_A279CliNom
            }
            , new Object[] {
            T01IZ9_A396EmprCod
            }
            , new Object[] {
            T01IZ10_A396EmprCod
            }
            , new Object[] {
            T01IZ11_A10888Dsc_Idtx, T01IZ11_n10888Dsc_Idtx
            }
            , new Object[] {
            T01IZ13_A387DisPiePie, T01IZ13_n387DisPiePie
            }
            , new Object[] {
            T01IZ15_A379DisPie, T01IZ15_n379DisPie
            }
            , new Object[] {
            T01IZ18_A5025DisGraCob, T01IZ18_A10888Dsc_Idtx, T01IZ18_n10888Dsc_Idtx, T01IZ18_A396EmprCod, T01IZ18_A252CliCod, T01IZ18_A1122MaqCodDis, T01IZ18_n1122MaqCodDis, T01IZ18_A390DisTipCol, T01IZ18_n390DisTipCol, T01IZ18_A10887Cod_Idtx,
            T01IZ18_n10887Cod_Idtx, T01IZ18_A387DisPiePie, T01IZ18_n387DisPiePie, T01IZ18_A379DisPie, T01IZ18_n379DisPie, T01IZ18_A361DisCod, T01IZ18_A757PriCod, T01IZ18_A407EmprNom, T01IZ18_n407EmprNom, T01IZ18_A360DisCliNum,
            T01IZ18_A370DisFecCli, T01IZ18_A279CliNom, T01IZ18_A335DisArtCod, T01IZ18_A369DisFec, T01IZ18_A371DisFecEnt, T01IZ18_A337DisArtDsc, T01IZ18_A340DisArtMat, T01IZ18_A339DisArtLar, T01IZ18_A351DisArtSua, T01IZ18_A333DisArtAca,
            T01IZ18_A343DisArtPle, T01IZ18_A352DisArtTip, T01IZ18_A338DisArtEnc, T01IZ18_A336DisArtCor, T01IZ18_A341DisArtOpe, T01IZ18_A353DisArtTr1, T01IZ18_A344DisArtPt1, T01IZ18_A354DisArtTr2, T01IZ18_A345DisArtPt2, T01IZ18_A355DisArtTr3,
            T01IZ18_A346DisArtPt3, T01IZ18_A350DisArtRdt, T01IZ18_A359DisArtUrg, T01IZ18_A356DisArtUr1, T01IZ18_A347DisArtPu1, T01IZ18_A357DisArtUr2, T01IZ18_A348DisArtPu2, T01IZ18_A358DisArtUr3, T01IZ18_A349DisArtPu3, T01IZ18_n349DisArtPu3,
            T01IZ18_A342DisArtPes, T01IZ18_A334DisArtAnh, T01IZ18_A1231DisArtAn1, T01IZ18_A1232DisArtAcb, T01IZ18_A1233DisArtAc2, T01IZ18_A367DisEst, T01IZ18_A388DisPreKgm, T01IZ18_A389DisPreMtr, T01IZ18_A383DisPieLan, T01IZ18_A372DisKgmLan,
            T01IZ18_A373DisMtrLan, T01IZ18_A362DisColNom, T01IZ18_n362DisColNom, T01IZ18_A363DisColNum, T01IZ18_n363DisColNum, T01IZ18_A1195DisNomCli, T01IZ18_A1196DisNumCli, T01IZ18_A1197DisEncCom, T01IZ18_A1198DisEncAnh, T01IZ18_A365DisDes,
            T01IZ18_A374DisNumPie, T01IZ18_A375DisNumUni, T01IZ18_A392DisUniMed, T01IZ18_A1225DisGraCru, T01IZ18_A1430DisLoc, T01IZ18_A1502DisPart, T01IZ18_A1906DisGraAca, T01IZ18_A1907DisRdoN, T01IZ18_A1908DisRdoA, T01IZ18_A2009DisTipDis,
            T01IZ18_n2009DisTipDis, T01IZ18_A2831DisNumLot, T01IZ18_A2832DisKgsLot, T01IZ18_A2833DisMtrLot, T01IZ18_A2835DisPle2, T01IZ18_A3127DisNumCor, T01IZ18_A3128DisAncSal1, T01IZ18_A3129DisAncSal2, T01IZ18_A3130DisAncSal3, T01IZ18_A3131DisGraAca2,
            T01IZ18_A3132DisGraCru2, T01IZ18_A3306DisFac, T01IZ18_A3307DisManCod1, T01IZ18_A3308DisManCod2, T01IZ18_A3309DisNumTon, T01IZ18_A4614DisMdlCod, T01IZ18_A4615DisTam, T01IZ18_A4293DisNPzas, T01IZ18_n4293DisNPzas, T01IZ18_A4616DisHorEnt,
            T01IZ18_n4616DisHorEnt, T01IZ18_A4294DisNPzasL, T01IZ18_n4294DisNPzasL, T01IZ18_A4617DisHorReg, T01IZ18_n4617DisHorReg, T01IZ18_A5252DisAcc, T01IZ18_A5366DisAntp, T01IZ18_A5405DisAntpT, T01IZ18_A2926DisPla, T01IZ18_A4013DisEnv,
            T01IZ18_n4013DisEnv, T01IZ18_A366DisEnt, T01IZ18_A4477DisAcaBak, T01IZ18_A5350DisObsAnc, T01IZ18_A5349DisObsGrm, T01IZ18_A4813DisEncCli, T01IZ18_A4720DisDishCod, T01IZ18_A2743DisNumTex1, T01IZ18_A5032DisEstTip, T01IZ18_A4014DisTin,
            T01IZ18_A5290DisTipCor, T01IZ18_A4471DisCruEnr, T01IZ18_A4479DisAcaMar, T01IZ18_A1052DisObs, T01IZ18_A1968DisRes, T01IZ18_n1968DisRes
            }
            , new Object[] {
            T01IZ19_A407EmprNom, T01IZ19_n407EmprNom
            }
            , new Object[] {
            T01IZ20_A279CliNom
            }
            , new Object[] {
            T01IZ21_A396EmprCod
            }
            , new Object[] {
            T01IZ22_A396EmprCod
            }
            , new Object[] {
            T01IZ23_A10888Dsc_Idtx, T01IZ23_n10888Dsc_Idtx
            }
            , new Object[] {
            T01IZ25_A387DisPiePie, T01IZ25_n387DisPiePie
            }
            , new Object[] {
            T01IZ27_A379DisPie, T01IZ27_n379DisPie
            }
            , new Object[] {
            T01IZ28_A396EmprCod, T01IZ28_A361DisCod
            }
            , new Object[] {
            T01IZ29_A396EmprCod, T01IZ29_A361DisCod
            }
            , new Object[] {
            T01IZ30_A396EmprCod, T01IZ30_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01IZ34_A407EmprNom, T01IZ34_n407EmprNom
            }
            , new Object[] {
            T01IZ36_A387DisPiePie, T01IZ36_n387DisPiePie
            }
            , new Object[] {
            T01IZ38_A379DisPie, T01IZ38_n379DisPie
            }
            , new Object[] {
            T01IZ39_A279CliNom
            }
            , new Object[] {
            T01IZ40_A10888Dsc_Idtx, T01IZ40_n10888Dsc_Idtx
            }
            , new Object[] {
            T01IZ41_A396EmprCod, T01IZ41_A361DisCod, T01IZ41_A13376DisTraID
            }
            , new Object[] {
            T01IZ42_A396EmprCod, T01IZ42_A361DisCod, T01IZ42_A13213DisNormID
            }
            , new Object[] {
            T01IZ43_A396EmprCod, T01IZ43_A361DisCod, T01IZ43_A13081DisDGLin, T01IZ43_A13082DisDGDibCl, T01IZ43_A13083DisDGDibIn, T01IZ43_A13084DisDGComb, T01IZ43_A13085DisDGFondo
            }
            , new Object[] {
            T01IZ44_A396EmprCod, T01IZ44_A361DisCod, T01IZ44_A7068DisNotLin
            }
            , new Object[] {
            T01IZ45_A396EmprCod, T01IZ45_A361DisCod, T01IZ45_A10197ProEspCod
            }
            , new Object[] {
            T01IZ46_A396EmprCod, T01IZ46_A361DisCod, T01IZ46_A4594AccCod
            }
            , new Object[] {
            T01IZ47_A396EmprCod, T01IZ47_A361DisCod, T01IZ47_A2524DisComLin, T01IZ47_A1056DisComCod, T01IZ47_A1032FonCod
            }
            , new Object[] {
            T01IZ48_A396EmprCod, T01IZ48_A361DisCod, T01IZ48_A3398DisRefBarC, T01IZ48_A3399DisRefBCRe, T01IZ48_A3400DisRefBCPa, T01IZ48_A3607DisRefBPie
            }
            , new Object[] {
            T01IZ49_A396EmprCod, T01IZ49_A361DisCod, T01IZ49_A376DisObsLin
            }
            , new Object[] {
            T01IZ50_A396EmprCod, T01IZ50_A361DisCod, T01IZ50_A758ProCod, T01IZ50_A368DisFasLin
            }
            , new Object[] {
            T01IZ51_A396EmprCod, T01IZ51_A361DisCod, T01IZ51_A833TipDefCod
            }
            , new Object[] {
            T01IZ52_A396EmprCod, T01IZ52_A361DisCod, T01IZ52_A44AlbRecCod
            }
            , new Object[] {
            T01IZ53_A396EmprCod, T01IZ53_A361DisCod
            }
            , new Object[] {
            T01IZ54_A361DisCod, T01IZ54_A759ProDsc, T01IZ54_A396EmprCod, T01IZ54_A758ProCod
            }
            , new Object[] {
            T01IZ55_A759ProDsc
            }
            , new Object[] {
            T01IZ56_A396EmprCod, T01IZ56_A361DisCod, T01IZ56_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01IZ59_A759ProDsc
            }
            , new Object[] {
            T01IZ60_A396EmprCod, T01IZ60_A361DisCod, T01IZ60_A758ProCod, T01IZ60_A368DisFasLin
            }
            , new Object[] {
            T01IZ61_A396EmprCod, T01IZ61_A361DisCod, T01IZ61_A758ProCod
            }
            , new Object[] {
            T01IZ62_A396EmprCod
            }
            , new Object[] {
            T01IZ63_A396EmprCod
            }
            , new Object[] {
            T01IZ64_A673Piezas
            }
            , new Object[] {
            T01IZ65_A631Metros
            }
            , new Object[] {
            T01IZ66_A384DisPieMet
            }
            , new Object[] {
            T01IZ67_A595Kilos
            }
            , new Object[] {
            T01IZ68_A382DisPieKil
            }
            , new Object[] {
            T01IZ69_A631Metros
            }
            , new Object[] {
            T01IZ70_A595Kilos
            }
         }
      );
   }

   private byte Z359DisArtUrg ;
   private byte Z367DisEst ;
   private byte Z4013DisEnv ;
   private byte Z2743DisNumTex1 ;
   private byte Z5025DisGraCob ;
   private byte Z390DisTipCol ;
   private byte GxWebError ;
   private byte A390DisTipCol ;
   private byte nKeyPressed ;
   private byte A367DisEst ;
   private byte A359DisArtUrg ;
   private byte A4013DisEnv ;
   private byte A2743DisNumTex1 ;
   private byte A5025DisGraCob ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ359DisArtUrg ;
   private byte ZZ367DisEst ;
   private byte ZZ390DisTipCol ;
   private byte ZZ4013DisEnv ;
   private byte ZZ2743DisNumTex1 ;
   private byte ZZ5025DisGraCob ;
   private byte GXv_int3[] ;
   private short Z352DisArtTip ;
   private short Z344DisArtPt1 ;
   private short Z345DisArtPt2 ;
   private short Z346DisArtPt3 ;
   private short Z347DisArtPu1 ;
   private short Z348DisArtPu2 ;
   private short Z349DisArtPu3 ;
   private short Z342DisArtPes ;
   private short Z334DisArtAnh ;
   private short Z1231DisArtAn1 ;
   private short Z1232DisArtAcb ;
   private short Z1233DisArtAc2 ;
   private short Z383DisPieLan ;
   private short Z372DisKgmLan ;
   private short Z373DisMtrLan ;
   private short Z374DisNumPie ;
   private short Z1225DisGraCru ;
   private short Z1502DisPart ;
   private short Z1906DisGraAca ;
   private short Z3127DisNumCor ;
   private short Z3128DisAncSal1 ;
   private short Z3129DisAncSal2 ;
   private short Z3130DisAncSal3 ;
   private short Z3131DisGraAca2 ;
   private short Z3132DisGraCru2 ;
   private short Z3307DisManCod1 ;
   private short Z3308DisManCod2 ;
   private short nRcdDeleted_38 ;
   private short nRcdExists_38 ;
   private short nIsMod_38 ;
   private short A352DisArtTip ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A344DisArtPt1 ;
   private short A345DisArtPt2 ;
   private short A346DisArtPt3 ;
   private short A347DisArtPu1 ;
   private short A348DisArtPu2 ;
   private short A349DisArtPu3 ;
   private short A342DisArtPes ;
   private short A334DisArtAnh ;
   private short A1231DisArtAn1 ;
   private short A1232DisArtAcb ;
   private short A1233DisArtAc2 ;
   private short A387DisPiePie ;
   private short A383DisPieLan ;
   private short A372DisKgmLan ;
   private short A373DisMtrLan ;
   private short A374DisNumPie ;
   private short A379DisPie ;
   private short A1225DisGraCru ;
   private short A386DisPieNor ;
   private short A1502DisPart ;
   private short A1906DisGraAca ;
   private short A3127DisNumCor ;
   private short A3128DisAncSal1 ;
   private short A3129DisAncSal2 ;
   private short A3130DisAncSal3 ;
   private short A3131DisGraAca2 ;
   private short A3132DisGraCru2 ;
   private short A3307DisManCod1 ;
   private short A3308DisManCod2 ;
   private short nBlankRcdCount38 ;
   private short RcdFound38 ;
   private short nBlankRcdUsr38 ;
   private short Z387DisPiePie ;
   private short Z379DisPie ;
   private short RcdFound34 ;
   private short nIsDirty_34 ;
   private short nIsDirty_38 ;
   private short Z386DisPieNor ;
   private short ZZ352DisArtTip ;
   private short ZZ344DisArtPt1 ;
   private short ZZ345DisArtPt2 ;
   private short ZZ346DisArtPt3 ;
   private short ZZ347DisArtPu1 ;
   private short ZZ348DisArtPu2 ;
   private short ZZ349DisArtPu3 ;
   private short ZZ342DisArtPes ;
   private short ZZ334DisArtAnh ;
   private short ZZ1231DisArtAn1 ;
   private short ZZ1232DisArtAcb ;
   private short ZZ1233DisArtAc2 ;
   private short ZZ383DisPieLan ;
   private short ZZ372DisKgmLan ;
   private short ZZ373DisMtrLan ;
   private short ZZ374DisNumPie ;
   private short ZZ1225DisGraCru ;
   private short ZZ1502DisPart ;
   private short ZZ1906DisGraAca ;
   private short ZZ3127DisNumCor ;
   private short ZZ3128DisAncSal1 ;
   private short ZZ3129DisAncSal2 ;
   private short ZZ3130DisAncSal3 ;
   private short ZZ3131DisGraAca2 ;
   private short ZZ3132DisGraCru2 ;
   private short ZZ3307DisManCod1 ;
   private short ZZ3308DisManCod2 ;
   private short ZZ387DisPiePie ;
   private short ZZ379DisPie ;
   private short ZZ386DisPieNor ;
   private int Z361DisCod ;
   private int Z363DisColNum ;
   private int Z1196DisNumCli ;
   private int Z2831DisNumLot ;
   private int Z4293DisNPzas ;
   private int Z4294DisNPzasL ;
   private int Z252CliCod ;
   private int nRC_GXsfl_610 ;
   private int nGXsfl_610_idx=1 ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A361DisCod ;
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
   private int edtDisArtDsc_Enabled ;
   private int edtDisArtMat_Enabled ;
   private int edtDisArtLar_Enabled ;
   private int edtDisArtSua_Enabled ;
   private int edtDisArtAca_Enabled ;
   private int edtDisArtPle_Enabled ;
   private int edtDisArtTip_Enabled ;
   private int edtDisArtTipD_Enabled ;
   private int edtDisArtOpe_Enabled ;
   private int edtDisArtTr1_Enabled ;
   private int edtDisArtPt1_Enabled ;
   private int edtDisArtTr2_Enabled ;
   private int edtDisArtPt2_Enabled ;
   private int edtDisArtTr3_Enabled ;
   private int edtDisArtPt3_Enabled ;
   private int edtDisArtRdt_Enabled ;
   private int edtDisArtUrg_Enabled ;
   private int edtDisArtUr1_Enabled ;
   private int edtDisArtPu1_Enabled ;
   private int edtDisArtUr2_Enabled ;
   private int edtDisArtPu2_Enabled ;
   private int edtDisArtUr3_Enabled ;
   private int edtDisArtPu3_Enabled ;
   private int edtDisArtPes_Enabled ;
   private int edtDisArtAnh_Enabled ;
   private int edtDisArtAn1_Enabled ;
   private int edtDisArtAcb_Enabled ;
   private int edtDisArtAc2_Enabled ;
   private int edtDisPiePie_Enabled ;
   private int edtDisPieMtr_Enabled ;
   private int edtDisPieKgm_Enabled ;
   private int edtDisPreKgm_Enabled ;
   private int edtDisPreMtr_Enabled ;
   private int edtDisPieLan_Enabled ;
   private int edtDisKgmLan_Enabled ;
   private int edtDisMtrLan_Enabled ;
   private int edtDisColNom_Enabled ;
   private int edtDisColNum_Enabled ;
   private int edtDisNomCli_Enabled ;
   private int A1196DisNumCli ;
   private int edtDisNumCli_Enabled ;
   private int edtDisEncCom_Enabled ;
   private int edtDisEncAnh_Enabled ;
   private int edtDisTipCol_Enabled ;
   private int edtDisTipCD_Enabled ;
   private int edtDisNumPie_Enabled ;
   private int edtDisNumUni_Enabled ;
   private int edtDisUniMed_Enabled ;
   private int edtEmprCodDis_Enabled ;
   private int A253CliCodDis ;
   private int edtCliCodDis_Enabled ;
   private int edtFindCol_Enabled ;
   private int edtDisPie_Enabled ;
   private int edtDisUni_Enabled ;
   private int edtDisGraCru_Enabled ;
   private int edtDisPieNor_Enabled ;
   private int edtDisLoc_Enabled ;
   private int edtDisPart_Enabled ;
   private int edtDisGraAca_Enabled ;
   private int edtDisRdoN_Enabled ;
   private int edtDisRdoA_Enabled ;
   private int edtDisTipDis_Enabled ;
   private int A2831DisNumLot ;
   private int edtDisNumLot_Enabled ;
   private int edtDisKgsLot_Enabled ;
   private int edtDisMtrLot_Enabled ;
   private int edtDisPle2_Enabled ;
   private int edtDisNumCor_Enabled ;
   private int edtDisAncSal1_Enabled ;
   private int edtDisAncSal2_Enabled ;
   private int edtDisAncSal3_Enabled ;
   private int edtDisGraAca2_Enabled ;
   private int edtDisGraCru2_Enabled ;
   private int edtDisManCod1_Enabled ;
   private int edtDisManCod2_Enabled ;
   private int edtDisNumTon_Enabled ;
   private int edtDisMdlCod_Enabled ;
   private int edtDisTam_Enabled ;
   private int A4293DisNPzas ;
   private int edtDisNPzas_Enabled ;
   private int edtDisHorEnt_Enabled ;
   private int A4294DisNPzasL ;
   private int edtDisNPzasL_Enabled ;
   private int edtDisHorReg_Enabled ;
   private int edtDisAntp_Enabled ;
   private int edtDisAntpT_Enabled ;
   private int edtDisEnv_Enabled ;
   private int edtDisEnt_Enabled ;
   private int edtDisObsAnc_Enabled ;
   private int edtDisObsGrm_Enabled ;
   private int edtDisEncCli_Enabled ;
   private int edtDisDishCod_Enabled ;
   private int edtDisNumTex1_Enabled ;
   private int edtDisTipCor_Enabled ;
   private int edtDisCruEnr_Enabled ;
   private int edtDisAcaMar_Enabled ;
   private int edtDisObs_Enabled ;
   private int edtDisRes_Enabled ;
   private int edtDisGraCob_Enabled ;
   private int edtCod_Idtx_Enabled ;
   private int edtDsc_Idtx_Enabled ;
   private int edtMaqCodDis_Enabled ;
   private int edtavnRcdDeleted_38_Enabled ;
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
   private int GX_JID ;
   private int GXv_int5[] ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtProCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMaqCodDis_Backcolor ;
   private int edtDsc_Idtx_Backcolor ;
   private int edtCod_Idtx_Backcolor ;
   private int edtDisGraCob_Backcolor ;
   private int edtDisRes_Backcolor ;
   private int edtDisObs_Backcolor ;
   private int edtDisAcaMar_Backcolor ;
   private int edtDisCruEnr_Backcolor ;
   private int edtDisTipCor_Backcolor ;
   private int edtDisNumTex1_Backcolor ;
   private int edtDisDishCod_Backcolor ;
   private int edtDisEncCli_Backcolor ;
   private int edtDisObsGrm_Backcolor ;
   private int edtDisObsAnc_Backcolor ;
   private int edtDisEnt_Backcolor ;
   private int edtDisEnv_Backcolor ;
   private int edtDisAntpT_Backcolor ;
   private int edtDisAntp_Backcolor ;
   private int edtDisHorReg_Backcolor ;
   private int edtDisNPzasL_Backcolor ;
   private int edtDisHorEnt_Backcolor ;
   private int edtDisNPzas_Backcolor ;
   private int edtDisTam_Backcolor ;
   private int edtDisMdlCod_Backcolor ;
   private int edtDisNumTon_Backcolor ;
   private int edtDisManCod2_Backcolor ;
   private int edtDisManCod1_Backcolor ;
   private int edtDisGraCru2_Backcolor ;
   private int edtDisGraAca2_Backcolor ;
   private int edtDisAncSal3_Backcolor ;
   private int edtDisAncSal2_Backcolor ;
   private int edtDisAncSal1_Backcolor ;
   private int edtDisNumCor_Backcolor ;
   private int edtDisPle2_Backcolor ;
   private int edtDisMtrLot_Backcolor ;
   private int edtDisKgsLot_Backcolor ;
   private int edtDisNumLot_Backcolor ;
   private int edtDisTipDis_Backcolor ;
   private int edtDisRdoA_Backcolor ;
   private int edtDisRdoN_Backcolor ;
   private int edtDisGraAca_Backcolor ;
   private int edtDisPart_Backcolor ;
   private int edtDisLoc_Backcolor ;
   private int edtDisPieNor_Backcolor ;
   private int edtDisGraCru_Backcolor ;
   private int edtDisUni_Backcolor ;
   private int edtDisPie_Backcolor ;
   private int edtFindCol_Backcolor ;
   private int edtCliCodDis_Backcolor ;
   private int edtEmprCodDis_Backcolor ;
   private int edtDisUniMed_Backcolor ;
   private int edtDisNumUni_Backcolor ;
   private int edtDisNumPie_Backcolor ;
   private int edtDisTipCD_Backcolor ;
   private int edtDisTipCol_Backcolor ;
   private int edtDisEncAnh_Backcolor ;
   private int edtDisEncCom_Backcolor ;
   private int edtDisNumCli_Backcolor ;
   private int edtDisNomCli_Backcolor ;
   private int edtDisColNum_Backcolor ;
   private int edtDisColNom_Backcolor ;
   private int edtDisMtrLan_Backcolor ;
   private int edtDisKgmLan_Backcolor ;
   private int edtDisPieLan_Backcolor ;
   private int edtDisPreMtr_Backcolor ;
   private int edtDisPreKgm_Backcolor ;
   private int edtDisPieKgm_Backcolor ;
   private int edtDisPieMtr_Backcolor ;
   private int edtDisPiePie_Backcolor ;
   private int edtDisArtAc2_Backcolor ;
   private int edtDisArtAcb_Backcolor ;
   private int edtDisArtAn1_Backcolor ;
   private int edtDisArtAnh_Backcolor ;
   private int edtDisArtPes_Backcolor ;
   private int edtDisArtPu3_Backcolor ;
   private int edtDisArtUr3_Backcolor ;
   private int edtDisArtPu2_Backcolor ;
   private int edtDisArtUr2_Backcolor ;
   private int edtDisArtPu1_Backcolor ;
   private int edtDisArtUr1_Backcolor ;
   private int edtDisArtUrg_Backcolor ;
   private int edtDisArtRdt_Backcolor ;
   private int edtDisArtPt3_Backcolor ;
   private int edtDisArtTr3_Backcolor ;
   private int edtDisArtPt2_Backcolor ;
   private int edtDisArtTr2_Backcolor ;
   private int edtDisArtPt1_Backcolor ;
   private int edtDisArtTr1_Backcolor ;
   private int edtDisArtOpe_Backcolor ;
   private int edtDisArtTipD_Backcolor ;
   private int edtDisArtTip_Backcolor ;
   private int edtDisArtPle_Backcolor ;
   private int edtDisArtAca_Backcolor ;
   private int edtDisArtSua_Backcolor ;
   private int edtDisArtLar_Backcolor ;
   private int edtDisArtMat_Backcolor ;
   private int edtDisArtDsc_Backcolor ;
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
   private int Z253CliCodDis ;
   private int ZZ361DisCod ;
   private int ZZ252CliCod ;
   private int ZZ363DisColNum ;
   private int ZZ1196DisNumCli ;
   private int ZZ2831DisNumLot ;
   private int ZZ4293DisNPzas ;
   private int ZZ4294DisNPzasL ;
   private int ZZ253CliCodDis ;
   private int X673Piezas ;
   private int E361DisCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z350DisArtRdt ;
   private java.math.BigDecimal Z388DisPreKgm ;
   private java.math.BigDecimal Z389DisPreMtr ;
   private java.math.BigDecimal Z1197DisEncCom ;
   private java.math.BigDecimal Z1198DisEncAnh ;
   private java.math.BigDecimal Z375DisNumUni ;
   private java.math.BigDecimal Z1907DisRdoN ;
   private java.math.BigDecimal Z1908DisRdoA ;
   private java.math.BigDecimal Z2832DisKgsLot ;
   private java.math.BigDecimal Z2833DisMtrLot ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal A385DisPieMtr ;
   private java.math.BigDecimal A381DisPieKgm ;
   private java.math.BigDecimal A388DisPreKgm ;
   private java.math.BigDecimal A389DisPreMtr ;
   private java.math.BigDecimal A1197DisEncCom ;
   private java.math.BigDecimal A1198DisEncAnh ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A391DisUni ;
   private java.math.BigDecimal A1907DisRdoN ;
   private java.math.BigDecimal A1908DisRdoA ;
   private java.math.BigDecimal A2832DisKgsLot ;
   private java.math.BigDecimal A2833DisMtrLot ;
   private java.math.BigDecimal Z391DisUni ;
   private java.math.BigDecimal Z381DisPieKgm ;
   private java.math.BigDecimal Z385DisPieMtr ;
   private java.math.BigDecimal ZZ350DisArtRdt ;
   private java.math.BigDecimal ZZ388DisPreKgm ;
   private java.math.BigDecimal ZZ389DisPreMtr ;
   private java.math.BigDecimal ZZ1197DisEncCom ;
   private java.math.BigDecimal ZZ1198DisEncAnh ;
   private java.math.BigDecimal ZZ375DisNumUni ;
   private java.math.BigDecimal ZZ1907DisRdoN ;
   private java.math.BigDecimal ZZ1908DisRdoA ;
   private java.math.BigDecimal ZZ2832DisKgsLot ;
   private java.math.BigDecimal ZZ2833DisMtrLot ;
   private java.math.BigDecimal ZZ391DisUni ;
   private java.math.BigDecimal ZZ381DisPieKgm ;
   private java.math.BigDecimal ZZ385DisPieMtr ;
   private java.math.BigDecimal X631Metros ;
   private java.math.BigDecimal X384DisPieMet ;
   private java.math.BigDecimal X595Kilos ;
   private java.math.BigDecimal X382DisPieKil ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z757PriCod ;
   private String Z360DisCliNum ;
   private String Z335DisArtCod ;
   private String Z337DisArtDsc ;
   private String Z340DisArtMat ;
   private String Z339DisArtLar ;
   private String Z351DisArtSua ;
   private String Z333DisArtAca ;
   private String Z343DisArtPle ;
   private String Z338DisArtEnc ;
   private String Z336DisArtCor ;
   private String Z341DisArtOpe ;
   private String Z353DisArtTr1 ;
   private String Z354DisArtTr2 ;
   private String Z355DisArtTr3 ;
   private String Z356DisArtUr1 ;
   private String Z357DisArtUr2 ;
   private String Z358DisArtUr3 ;
   private String Z362DisColNom ;
   private String Z1195DisNomCli ;
   private String Z365DisDes ;
   private String Z392DisUniMed ;
   private String Z1430DisLoc ;
   private String Z2009DisTipDis ;
   private String Z2835DisPle2 ;
   private String Z3306DisFac ;
   private String Z3309DisNumTon ;
   private String Z4614DisMdlCod ;
   private String Z4615DisTam ;
   private String Z5252DisAcc ;
   private String Z5366DisAntp ;
   private String Z5405DisAntpT ;
   private String Z2926DisPla ;
   private String Z366DisEnt ;
   private String Z4477DisAcaBak ;
   private String Z5350DisObsAnc ;
   private String Z5349DisObsGrm ;
   private String Z4813DisEncCli ;
   private String Z4720DisDishCod ;
   private String Z5032DisEstTip ;
   private String Z4014DisTin ;
   private String Z5290DisTipCor ;
   private String Z4471DisCruEnr ;
   private String Z4479DisAcaMar ;
   private String Z1052DisObs ;
   private String Z1968DisRes ;
   private String Z1122MaqCodDis ;
   private String Z10887Cod_Idtx ;
   private String Z758ProCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A335DisArtCod ;
   private String A362DisColNom ;
   private String A392DisUniMed ;
   private String A365DisDes ;
   private String A1122MaqCodDis ;
   private String A10887Cod_Idtx ;
   private String A758ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_610_idx="0001" ;
   private String Gx_mode ;
   private String A757PriCod ;
   private String A338DisArtEnc ;
   private String A336DisArtCor ;
   private String A3306DisFac ;
   private String A5252DisAcc ;
   private String A2926DisPla ;
   private String A4477DisAcaBak ;
   private String A5032DisEstTip ;
   private String A4014DisTin ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
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
   private String edtDisArtDsc_Internalname ;
   private String A337DisArtDsc ;
   private String edtDisArtDsc_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtDisArtMat_Internalname ;
   private String A340DisArtMat ;
   private String edtDisArtMat_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtDisArtLar_Internalname ;
   private String A339DisArtLar ;
   private String edtDisArtLar_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtDisArtSua_Internalname ;
   private String A351DisArtSua ;
   private String edtDisArtSua_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtDisArtAca_Internalname ;
   private String A333DisArtAca ;
   private String edtDisArtAca_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtDisArtPle_Internalname ;
   private String A343DisArtPle ;
   private String edtDisArtPle_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtDisArtTip_Internalname ;
   private String edtDisArtTip_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtDisArtTipD_Internalname ;
   private String A12115DisArtTipD ;
   private String edtDisArtTipD_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtDisArtOpe_Internalname ;
   private String A341DisArtOpe ;
   private String edtDisArtOpe_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtDisArtTr1_Internalname ;
   private String A353DisArtTr1 ;
   private String edtDisArtTr1_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtDisArtPt1_Internalname ;
   private String edtDisArtPt1_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtDisArtTr2_Internalname ;
   private String A354DisArtTr2 ;
   private String edtDisArtTr2_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtDisArtPt2_Internalname ;
   private String edtDisArtPt2_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtDisArtTr3_Internalname ;
   private String A355DisArtTr3 ;
   private String edtDisArtTr3_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtDisArtPt3_Internalname ;
   private String edtDisArtPt3_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtDisArtRdt_Internalname ;
   private String edtDisArtRdt_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtDisArtUrg_Internalname ;
   private String edtDisArtUrg_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtDisArtUr1_Internalname ;
   private String A356DisArtUr1 ;
   private String edtDisArtUr1_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtDisArtPu1_Internalname ;
   private String edtDisArtPu1_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtDisArtUr2_Internalname ;
   private String A357DisArtUr2 ;
   private String edtDisArtUr2_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtDisArtPu2_Internalname ;
   private String edtDisArtPu2_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtDisArtUr3_Internalname ;
   private String A358DisArtUr3 ;
   private String edtDisArtUr3_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtDisArtPu3_Internalname ;
   private String edtDisArtPu3_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtDisArtPes_Internalname ;
   private String edtDisArtPes_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtDisArtAnh_Internalname ;
   private String edtDisArtAnh_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtDisArtAn1_Internalname ;
   private String edtDisArtAn1_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtDisArtAcb_Internalname ;
   private String edtDisArtAcb_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtDisArtAc2_Internalname ;
   private String edtDisArtAc2_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtDisPiePie_Internalname ;
   private String edtDisPiePie_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtDisPieMtr_Internalname ;
   private String edtDisPieMtr_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String edtDisPieKgm_Internalname ;
   private String edtDisPieKgm_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtDisPreKgm_Internalname ;
   private String edtDisPreKgm_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String edtDisPreMtr_Internalname ;
   private String edtDisPreMtr_Jsonclick ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String edtDisPieLan_Internalname ;
   private String edtDisPieLan_Jsonclick ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock49_Jsonclick ;
   private String edtDisKgmLan_Internalname ;
   private String edtDisKgmLan_Jsonclick ;
   private String lblTextblock50_Internalname ;
   private String lblTextblock50_Jsonclick ;
   private String edtDisMtrLan_Internalname ;
   private String edtDisMtrLan_Jsonclick ;
   private String lblTextblock51_Internalname ;
   private String lblTextblock51_Jsonclick ;
   private String edtDisColNom_Internalname ;
   private String edtDisColNom_Jsonclick ;
   private String lblTextblock52_Internalname ;
   private String lblTextblock52_Jsonclick ;
   private String edtDisColNum_Internalname ;
   private String edtDisColNum_Jsonclick ;
   private String lblTextblock53_Internalname ;
   private String lblTextblock53_Jsonclick ;
   private String edtDisNomCli_Internalname ;
   private String A1195DisNomCli ;
   private String edtDisNomCli_Jsonclick ;
   private String lblTextblock54_Internalname ;
   private String lblTextblock54_Jsonclick ;
   private String edtDisNumCli_Internalname ;
   private String edtDisNumCli_Jsonclick ;
   private String lblTextblock55_Internalname ;
   private String lblTextblock55_Jsonclick ;
   private String edtDisEncCom_Internalname ;
   private String edtDisEncCom_Jsonclick ;
   private String lblTextblock56_Internalname ;
   private String lblTextblock56_Jsonclick ;
   private String edtDisEncAnh_Internalname ;
   private String edtDisEncAnh_Jsonclick ;
   private String lblTextblock57_Internalname ;
   private String lblTextblock57_Jsonclick ;
   private String edtDisTipCol_Internalname ;
   private String edtDisTipCol_Jsonclick ;
   private String lblTextblock58_Internalname ;
   private String lblTextblock58_Jsonclick ;
   private String edtDisTipCD_Internalname ;
   private String A12116DisTipCD ;
   private String edtDisTipCD_Jsonclick ;
   private String lblTextblock59_Internalname ;
   private String lblTextblock59_Jsonclick ;
   private String lblTextblock60_Internalname ;
   private String lblTextblock60_Jsonclick ;
   private String edtDisNumPie_Internalname ;
   private String edtDisNumPie_Jsonclick ;
   private String lblTextblock61_Internalname ;
   private String lblTextblock61_Jsonclick ;
   private String edtDisNumUni_Internalname ;
   private String edtDisNumUni_Jsonclick ;
   private String lblTextblock62_Internalname ;
   private String lblTextblock62_Jsonclick ;
   private String edtDisUniMed_Internalname ;
   private String edtDisUniMed_Jsonclick ;
   private String lblTextblock63_Internalname ;
   private String lblTextblock63_Jsonclick ;
   private String edtEmprCodDis_Internalname ;
   private String A399EmprCodDis ;
   private String edtEmprCodDis_Jsonclick ;
   private String lblTextblock64_Internalname ;
   private String lblTextblock64_Jsonclick ;
   private String edtCliCodDis_Internalname ;
   private String edtCliCodDis_Jsonclick ;
   private String lblTextblock65_Internalname ;
   private String lblTextblock65_Jsonclick ;
   private String edtFindCol_Internalname ;
   private String A475FindCol ;
   private String edtFindCol_Jsonclick ;
   private String lblTextblock66_Internalname ;
   private String lblTextblock66_Jsonclick ;
   private String edtDisPie_Internalname ;
   private String edtDisPie_Jsonclick ;
   private String lblTextblock67_Internalname ;
   private String lblTextblock67_Jsonclick ;
   private String edtDisUni_Internalname ;
   private String edtDisUni_Jsonclick ;
   private String lblTextblock68_Internalname ;
   private String lblTextblock68_Jsonclick ;
   private String edtDisGraCru_Internalname ;
   private String edtDisGraCru_Jsonclick ;
   private String lblTextblock69_Internalname ;
   private String lblTextblock69_Jsonclick ;
   private String edtDisPieNor_Internalname ;
   private String edtDisPieNor_Jsonclick ;
   private String lblTextblock70_Internalname ;
   private String lblTextblock70_Jsonclick ;
   private String edtDisLoc_Internalname ;
   private String A1430DisLoc ;
   private String edtDisLoc_Jsonclick ;
   private String lblTextblock71_Internalname ;
   private String lblTextblock71_Jsonclick ;
   private String edtDisPart_Internalname ;
   private String edtDisPart_Jsonclick ;
   private String lblTextblock72_Internalname ;
   private String lblTextblock72_Jsonclick ;
   private String edtDisGraAca_Internalname ;
   private String edtDisGraAca_Jsonclick ;
   private String lblTextblock73_Internalname ;
   private String lblTextblock73_Jsonclick ;
   private String edtDisRdoN_Internalname ;
   private String edtDisRdoN_Jsonclick ;
   private String lblTextblock74_Internalname ;
   private String lblTextblock74_Jsonclick ;
   private String edtDisRdoA_Internalname ;
   private String edtDisRdoA_Jsonclick ;
   private String lblTextblock75_Internalname ;
   private String lblTextblock75_Jsonclick ;
   private String edtDisTipDis_Internalname ;
   private String A2009DisTipDis ;
   private String edtDisTipDis_Jsonclick ;
   private String lblTextblock76_Internalname ;
   private String lblTextblock76_Jsonclick ;
   private String edtDisNumLot_Internalname ;
   private String edtDisNumLot_Jsonclick ;
   private String lblTextblock77_Internalname ;
   private String lblTextblock77_Jsonclick ;
   private String edtDisKgsLot_Internalname ;
   private String edtDisKgsLot_Jsonclick ;
   private String lblTextblock78_Internalname ;
   private String lblTextblock78_Jsonclick ;
   private String edtDisMtrLot_Internalname ;
   private String edtDisMtrLot_Jsonclick ;
   private String lblTextblock79_Internalname ;
   private String lblTextblock79_Jsonclick ;
   private String edtDisPle2_Internalname ;
   private String A2835DisPle2 ;
   private String edtDisPle2_Jsonclick ;
   private String lblTextblock80_Internalname ;
   private String lblTextblock80_Jsonclick ;
   private String edtDisNumCor_Internalname ;
   private String edtDisNumCor_Jsonclick ;
   private String lblTextblock81_Internalname ;
   private String lblTextblock81_Jsonclick ;
   private String edtDisAncSal1_Internalname ;
   private String edtDisAncSal1_Jsonclick ;
   private String lblTextblock82_Internalname ;
   private String lblTextblock82_Jsonclick ;
   private String edtDisAncSal2_Internalname ;
   private String edtDisAncSal2_Jsonclick ;
   private String lblTextblock83_Internalname ;
   private String lblTextblock83_Jsonclick ;
   private String edtDisAncSal3_Internalname ;
   private String edtDisAncSal3_Jsonclick ;
   private String lblTextblock84_Internalname ;
   private String lblTextblock84_Jsonclick ;
   private String edtDisGraAca2_Internalname ;
   private String edtDisGraAca2_Jsonclick ;
   private String lblTextblock85_Internalname ;
   private String lblTextblock85_Jsonclick ;
   private String edtDisGraCru2_Internalname ;
   private String edtDisGraCru2_Jsonclick ;
   private String lblTextblock86_Internalname ;
   private String lblTextblock86_Jsonclick ;
   private String lblTextblock87_Internalname ;
   private String lblTextblock87_Jsonclick ;
   private String edtDisManCod1_Internalname ;
   private String edtDisManCod1_Jsonclick ;
   private String lblTextblock88_Internalname ;
   private String lblTextblock88_Jsonclick ;
   private String edtDisManCod2_Internalname ;
   private String edtDisManCod2_Jsonclick ;
   private String lblTextblock89_Internalname ;
   private String lblTextblock89_Jsonclick ;
   private String edtDisNumTon_Internalname ;
   private String A3309DisNumTon ;
   private String edtDisNumTon_Jsonclick ;
   private String lblTextblock90_Internalname ;
   private String lblTextblock90_Jsonclick ;
   private String edtDisMdlCod_Internalname ;
   private String A4614DisMdlCod ;
   private String edtDisMdlCod_Jsonclick ;
   private String lblTextblock91_Internalname ;
   private String lblTextblock91_Jsonclick ;
   private String edtDisTam_Internalname ;
   private String A4615DisTam ;
   private String edtDisTam_Jsonclick ;
   private String lblTextblock92_Internalname ;
   private String lblTextblock92_Jsonclick ;
   private String edtDisNPzas_Internalname ;
   private String edtDisNPzas_Jsonclick ;
   private String lblTextblock93_Internalname ;
   private String lblTextblock93_Jsonclick ;
   private String edtDisHorEnt_Internalname ;
   private String edtDisHorEnt_Jsonclick ;
   private String lblTextblock94_Internalname ;
   private String lblTextblock94_Jsonclick ;
   private String edtDisNPzasL_Internalname ;
   private String edtDisNPzasL_Jsonclick ;
   private String lblTextblock95_Internalname ;
   private String lblTextblock95_Jsonclick ;
   private String edtDisHorReg_Internalname ;
   private String edtDisHorReg_Jsonclick ;
   private String lblTextblock96_Internalname ;
   private String lblTextblock96_Jsonclick ;
   private String lblTextblock97_Internalname ;
   private String lblTextblock97_Jsonclick ;
   private String edtDisAntp_Internalname ;
   private String A5366DisAntp ;
   private String edtDisAntp_Jsonclick ;
   private String lblTextblock98_Internalname ;
   private String lblTextblock98_Jsonclick ;
   private String edtDisAntpT_Internalname ;
   private String A5405DisAntpT ;
   private String edtDisAntpT_Jsonclick ;
   private String lblTextblock99_Internalname ;
   private String lblTextblock99_Jsonclick ;
   private String lblTextblock100_Internalname ;
   private String lblTextblock100_Jsonclick ;
   private String edtDisEnv_Internalname ;
   private String edtDisEnv_Jsonclick ;
   private String lblTextblock101_Internalname ;
   private String lblTextblock101_Jsonclick ;
   private String edtDisEnt_Internalname ;
   private String A366DisEnt ;
   private String edtDisEnt_Jsonclick ;
   private String lblTextblock102_Internalname ;
   private String lblTextblock102_Jsonclick ;
   private String lblTextblock103_Internalname ;
   private String lblTextblock103_Jsonclick ;
   private String edtDisObsAnc_Internalname ;
   private String A5350DisObsAnc ;
   private String edtDisObsAnc_Jsonclick ;
   private String lblTextblock104_Internalname ;
   private String lblTextblock104_Jsonclick ;
   private String edtDisObsGrm_Internalname ;
   private String A5349DisObsGrm ;
   private String edtDisObsGrm_Jsonclick ;
   private String lblTextblock105_Internalname ;
   private String lblTextblock105_Jsonclick ;
   private String edtDisEncCli_Internalname ;
   private String A4813DisEncCli ;
   private String edtDisEncCli_Jsonclick ;
   private String lblTextblock106_Internalname ;
   private String lblTextblock106_Jsonclick ;
   private String edtDisDishCod_Internalname ;
   private String A4720DisDishCod ;
   private String edtDisDishCod_Jsonclick ;
   private String lblTextblock107_Internalname ;
   private String lblTextblock107_Jsonclick ;
   private String edtDisNumTex1_Internalname ;
   private String edtDisNumTex1_Jsonclick ;
   private String lblTextblock108_Internalname ;
   private String lblTextblock108_Jsonclick ;
   private String lblTextblock109_Internalname ;
   private String lblTextblock109_Jsonclick ;
   private String lblTextblock110_Internalname ;
   private String lblTextblock110_Jsonclick ;
   private String edtDisTipCor_Internalname ;
   private String A5290DisTipCor ;
   private String edtDisTipCor_Jsonclick ;
   private String lblTextblock111_Internalname ;
   private String lblTextblock111_Jsonclick ;
   private String edtDisCruEnr_Internalname ;
   private String A4471DisCruEnr ;
   private String edtDisCruEnr_Jsonclick ;
   private String lblTextblock112_Internalname ;
   private String lblTextblock112_Jsonclick ;
   private String edtDisAcaMar_Internalname ;
   private String A4479DisAcaMar ;
   private String edtDisAcaMar_Jsonclick ;
   private String lblTextblock113_Internalname ;
   private String lblTextblock113_Jsonclick ;
   private String edtDisObs_Internalname ;
   private String A1052DisObs ;
   private String edtDisObs_Jsonclick ;
   private String lblTextblock114_Internalname ;
   private String lblTextblock114_Jsonclick ;
   private String edtDisRes_Internalname ;
   private String A1968DisRes ;
   private String edtDisRes_Jsonclick ;
   private String lblTextblock115_Internalname ;
   private String lblTextblock115_Jsonclick ;
   private String edtDisGraCob_Internalname ;
   private String edtDisGraCob_Jsonclick ;
   private String lblTextblock116_Internalname ;
   private String lblTextblock116_Jsonclick ;
   private String edtCod_Idtx_Internalname ;
   private String edtCod_Idtx_Jsonclick ;
   private String lblTextblock117_Internalname ;
   private String lblTextblock117_Jsonclick ;
   private String edtDsc_Idtx_Internalname ;
   private String A10888Dsc_Idtx ;
   private String edtDsc_Idtx_Jsonclick ;
   private String lblTextblock118_Internalname ;
   private String lblTextblock118_Jsonclick ;
   private String edtMaqCodDis_Internalname ;
   private String edtMaqCodDis_Jsonclick ;
   private String sMode38 ;
   private String edtavnRcdDeleted_38_Internalname ;
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
   private String sMode34 ;
   private String GXCCtl ;
   private String A759ProDsc ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z10888Dsc_Idtx ;
   private String Z759ProDsc ;
   private String sGXsfl_610_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_38_Jsonclick ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String Z12116DisTipCD ;
   private String Z12115DisArtTipD ;
   private String Z475FindCol ;
   private String Z399EmprCodDis ;
   private String ZZ396EmprCod ;
   private String ZZ757PriCod ;
   private String ZZ360DisCliNum ;
   private String ZZ335DisArtCod ;
   private String ZZ337DisArtDsc ;
   private String ZZ340DisArtMat ;
   private String ZZ339DisArtLar ;
   private String ZZ351DisArtSua ;
   private String ZZ333DisArtAca ;
   private String ZZ343DisArtPle ;
   private String ZZ338DisArtEnc ;
   private String ZZ336DisArtCor ;
   private String ZZ341DisArtOpe ;
   private String ZZ353DisArtTr1 ;
   private String ZZ354DisArtTr2 ;
   private String ZZ355DisArtTr3 ;
   private String ZZ356DisArtUr1 ;
   private String ZZ357DisArtUr2 ;
   private String ZZ358DisArtUr3 ;
   private String ZZ362DisColNom ;
   private String ZZ1195DisNomCli ;
   private String ZZ365DisDes ;
   private String ZZ392DisUniMed ;
   private String ZZ1430DisLoc ;
   private String ZZ2009DisTipDis ;
   private String ZZ2835DisPle2 ;
   private String ZZ3306DisFac ;
   private String ZZ3309DisNumTon ;
   private String ZZ4614DisMdlCod ;
   private String ZZ4615DisTam ;
   private String ZZ5252DisAcc ;
   private String ZZ5366DisAntp ;
   private String ZZ5405DisAntpT ;
   private String ZZ2926DisPla ;
   private String ZZ366DisEnt ;
   private String ZZ4477DisAcaBak ;
   private String ZZ5350DisObsAnc ;
   private String ZZ5349DisObsGrm ;
   private String ZZ4813DisEncCli ;
   private String ZZ4720DisDishCod ;
   private String ZZ5032DisEstTip ;
   private String ZZ4014DisTin ;
   private String ZZ5290DisTipCor ;
   private String ZZ4471DisCruEnr ;
   private String ZZ4479DisAcaMar ;
   private String ZZ1052DisObs ;
   private String ZZ1968DisRes ;
   private String ZZ10887Cod_Idtx ;
   private String ZZ1122MaqCodDis ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ10888Dsc_Idtx ;
   private String ZZ12116DisTipCD ;
   private String ZZ12115DisArtTipD ;
   private String ZZ475FindCol ;
   private String ZZ399EmprCodDis ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String E396EmprCod ;
   private java.util.Date Z4616DisHorEnt ;
   private java.util.Date Z4617DisHorReg ;
   private java.util.Date A4616DisHorEnt ;
   private java.util.Date A4617DisHorReg ;
   private java.util.Date ZZ4616DisHorEnt ;
   private java.util.Date ZZ4617DisHorReg ;
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
   private boolean n1122MaqCodDis ;
   private boolean n10887Cod_Idtx ;
   private boolean wbErr ;
   private boolean bGXsfl_610_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n349DisArtPu3 ;
   private boolean n387DisPiePie ;
   private boolean n379DisPie ;
   private boolean n2009DisTipDis ;
   private boolean n4293DisNPzas ;
   private boolean n4616DisHorEnt ;
   private boolean n4294DisNPzasL ;
   private boolean n4617DisHorReg ;
   private boolean n4013DisEnv ;
   private boolean n1968DisRes ;
   private boolean n10888Dsc_Idtx ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private ICheckbox chkPriCod ;
   private ICheckbox chkDisArtEnc ;
   private ICheckbox chkDisArtCor ;
   private HTMLChoice cmbDisEst ;
   private ICheckbox chkDisDes ;
   private ICheckbox chkDisFac ;
   private ICheckbox chkDisAcc ;
   private ICheckbox chkDisPla ;
   private ICheckbox chkDisAcaBak ;
   private ICheckbox chkDisEstTip ;
   private ICheckbox chkDisTin ;
   private IDataStoreProvider pr_default ;
   private byte[] T01IZ18_A5025DisGraCob ;
   private String[] T01IZ18_A10888Dsc_Idtx ;
   private boolean[] T01IZ18_n10888Dsc_Idtx ;
   private String[] T01IZ18_A396EmprCod ;
   private int[] T01IZ18_A252CliCod ;
   private String[] T01IZ18_A1122MaqCodDis ;
   private boolean[] T01IZ18_n1122MaqCodDis ;
   private byte[] T01IZ18_A390DisTipCol ;
   private boolean[] T01IZ18_n390DisTipCol ;
   private String[] T01IZ18_A10887Cod_Idtx ;
   private boolean[] T01IZ18_n10887Cod_Idtx ;
   private short[] T01IZ18_A387DisPiePie ;
   private boolean[] T01IZ18_n387DisPiePie ;
   private short[] T01IZ18_A379DisPie ;
   private boolean[] T01IZ18_n379DisPie ;
   private int[] T01IZ18_A361DisCod ;
   private String[] T01IZ18_A757PriCod ;
   private String[] T01IZ18_A407EmprNom ;
   private boolean[] T01IZ18_n407EmprNom ;
   private String[] T01IZ18_A360DisCliNum ;
   private java.util.Date[] T01IZ18_A370DisFecCli ;
   private String[] T01IZ18_A279CliNom ;
   private String[] T01IZ18_A335DisArtCod ;
   private java.util.Date[] T01IZ18_A369DisFec ;
   private java.util.Date[] T01IZ18_A371DisFecEnt ;
   private String[] T01IZ18_A337DisArtDsc ;
   private String[] T01IZ18_A340DisArtMat ;
   private String[] T01IZ18_A339DisArtLar ;
   private String[] T01IZ18_A351DisArtSua ;
   private String[] T01IZ18_A333DisArtAca ;
   private String[] T01IZ18_A343DisArtPle ;
   private short[] T01IZ18_A352DisArtTip ;
   private String[] T01IZ18_A338DisArtEnc ;
   private String[] T01IZ18_A336DisArtCor ;
   private String[] T01IZ18_A341DisArtOpe ;
   private String[] T01IZ18_A353DisArtTr1 ;
   private short[] T01IZ18_A344DisArtPt1 ;
   private String[] T01IZ18_A354DisArtTr2 ;
   private short[] T01IZ18_A345DisArtPt2 ;
   private String[] T01IZ18_A355DisArtTr3 ;
   private short[] T01IZ18_A346DisArtPt3 ;
   private java.math.BigDecimal[] T01IZ18_A350DisArtRdt ;
   private byte[] T01IZ18_A359DisArtUrg ;
   private String[] T01IZ18_A356DisArtUr1 ;
   private short[] T01IZ18_A347DisArtPu1 ;
   private String[] T01IZ18_A357DisArtUr2 ;
   private short[] T01IZ18_A348DisArtPu2 ;
   private String[] T01IZ18_A358DisArtUr3 ;
   private short[] T01IZ18_A349DisArtPu3 ;
   private boolean[] T01IZ18_n349DisArtPu3 ;
   private short[] T01IZ18_A342DisArtPes ;
   private short[] T01IZ18_A334DisArtAnh ;
   private short[] T01IZ18_A1231DisArtAn1 ;
   private short[] T01IZ18_A1232DisArtAcb ;
   private short[] T01IZ18_A1233DisArtAc2 ;
   private byte[] T01IZ18_A367DisEst ;
   private java.math.BigDecimal[] T01IZ18_A388DisPreKgm ;
   private java.math.BigDecimal[] T01IZ18_A389DisPreMtr ;
   private short[] T01IZ18_A383DisPieLan ;
   private short[] T01IZ18_A372DisKgmLan ;
   private short[] T01IZ18_A373DisMtrLan ;
   private String[] T01IZ18_A362DisColNom ;
   private boolean[] T01IZ18_n362DisColNom ;
   private int[] T01IZ18_A363DisColNum ;
   private boolean[] T01IZ18_n363DisColNum ;
   private String[] T01IZ18_A1195DisNomCli ;
   private int[] T01IZ18_A1196DisNumCli ;
   private java.math.BigDecimal[] T01IZ18_A1197DisEncCom ;
   private java.math.BigDecimal[] T01IZ18_A1198DisEncAnh ;
   private String[] T01IZ18_A365DisDes ;
   private short[] T01IZ18_A374DisNumPie ;
   private java.math.BigDecimal[] T01IZ18_A375DisNumUni ;
   private String[] T01IZ18_A392DisUniMed ;
   private short[] T01IZ18_A1225DisGraCru ;
   private String[] T01IZ18_A1430DisLoc ;
   private short[] T01IZ18_A1502DisPart ;
   private short[] T01IZ18_A1906DisGraAca ;
   private java.math.BigDecimal[] T01IZ18_A1907DisRdoN ;
   private java.math.BigDecimal[] T01IZ18_A1908DisRdoA ;
   private String[] T01IZ18_A2009DisTipDis ;
   private boolean[] T01IZ18_n2009DisTipDis ;
   private int[] T01IZ18_A2831DisNumLot ;
   private java.math.BigDecimal[] T01IZ18_A2832DisKgsLot ;
   private java.math.BigDecimal[] T01IZ18_A2833DisMtrLot ;
   private String[] T01IZ18_A2835DisPle2 ;
   private short[] T01IZ18_A3127DisNumCor ;
   private short[] T01IZ18_A3128DisAncSal1 ;
   private short[] T01IZ18_A3129DisAncSal2 ;
   private short[] T01IZ18_A3130DisAncSal3 ;
   private short[] T01IZ18_A3131DisGraAca2 ;
   private short[] T01IZ18_A3132DisGraCru2 ;
   private String[] T01IZ18_A3306DisFac ;
   private short[] T01IZ18_A3307DisManCod1 ;
   private short[] T01IZ18_A3308DisManCod2 ;
   private String[] T01IZ18_A3309DisNumTon ;
   private String[] T01IZ18_A4614DisMdlCod ;
   private String[] T01IZ18_A4615DisTam ;
   private int[] T01IZ18_A4293DisNPzas ;
   private boolean[] T01IZ18_n4293DisNPzas ;
   private java.util.Date[] T01IZ18_A4616DisHorEnt ;
   private boolean[] T01IZ18_n4616DisHorEnt ;
   private int[] T01IZ18_A4294DisNPzasL ;
   private boolean[] T01IZ18_n4294DisNPzasL ;
   private java.util.Date[] T01IZ18_A4617DisHorReg ;
   private boolean[] T01IZ18_n4617DisHorReg ;
   private String[] T01IZ18_A5252DisAcc ;
   private String[] T01IZ18_A5366DisAntp ;
   private String[] T01IZ18_A5405DisAntpT ;
   private String[] T01IZ18_A2926DisPla ;
   private byte[] T01IZ18_A4013DisEnv ;
   private boolean[] T01IZ18_n4013DisEnv ;
   private String[] T01IZ18_A366DisEnt ;
   private String[] T01IZ18_A4477DisAcaBak ;
   private String[] T01IZ18_A5350DisObsAnc ;
   private String[] T01IZ18_A5349DisObsGrm ;
   private String[] T01IZ18_A4813DisEncCli ;
   private String[] T01IZ18_A4720DisDishCod ;
   private byte[] T01IZ18_A2743DisNumTex1 ;
   private String[] T01IZ18_A5032DisEstTip ;
   private String[] T01IZ18_A4014DisTin ;
   private String[] T01IZ18_A5290DisTipCor ;
   private String[] T01IZ18_A4471DisCruEnr ;
   private String[] T01IZ18_A4479DisAcaMar ;
   private String[] T01IZ18_A1052DisObs ;
   private String[] T01IZ18_A1968DisRes ;
   private boolean[] T01IZ18_n1968DisRes ;
   private String[] T01IZ7_A407EmprNom ;
   private boolean[] T01IZ7_n407EmprNom ;
   private String[] T01IZ8_A279CliNom ;
   private String[] T01IZ9_A396EmprCod ;
   private String[] T01IZ10_A396EmprCod ;
   private String[] T01IZ11_A10888Dsc_Idtx ;
   private boolean[] T01IZ11_n10888Dsc_Idtx ;
   private short[] T01IZ13_A387DisPiePie ;
   private boolean[] T01IZ13_n387DisPiePie ;
   private short[] T01IZ15_A379DisPie ;
   private boolean[] T01IZ15_n379DisPie ;
   private String[] T01IZ19_A407EmprNom ;
   private boolean[] T01IZ19_n407EmprNom ;
   private String[] T01IZ20_A279CliNom ;
   private String[] T01IZ21_A396EmprCod ;
   private String[] T01IZ22_A396EmprCod ;
   private String[] T01IZ23_A10888Dsc_Idtx ;
   private boolean[] T01IZ23_n10888Dsc_Idtx ;
   private short[] T01IZ25_A387DisPiePie ;
   private boolean[] T01IZ25_n387DisPiePie ;
   private short[] T01IZ27_A379DisPie ;
   private boolean[] T01IZ27_n379DisPie ;
   private String[] T01IZ28_A396EmprCod ;
   private int[] T01IZ28_A361DisCod ;
   private byte[] T01IZ6_A5025DisGraCob ;
   private String[] T01IZ6_A396EmprCod ;
   private int[] T01IZ6_A252CliCod ;
   private String[] T01IZ6_A1122MaqCodDis ;
   private boolean[] T01IZ6_n1122MaqCodDis ;
   private byte[] T01IZ6_A390DisTipCol ;
   private boolean[] T01IZ6_n390DisTipCol ;
   private String[] T01IZ6_A10887Cod_Idtx ;
   private boolean[] T01IZ6_n10887Cod_Idtx ;
   private int[] T01IZ6_A361DisCod ;
   private String[] T01IZ6_A757PriCod ;
   private String[] T01IZ6_A360DisCliNum ;
   private java.util.Date[] T01IZ6_A370DisFecCli ;
   private String[] T01IZ6_A335DisArtCod ;
   private java.util.Date[] T01IZ6_A369DisFec ;
   private java.util.Date[] T01IZ6_A371DisFecEnt ;
   private String[] T01IZ6_A337DisArtDsc ;
   private String[] T01IZ6_A340DisArtMat ;
   private String[] T01IZ6_A339DisArtLar ;
   private String[] T01IZ6_A351DisArtSua ;
   private String[] T01IZ6_A333DisArtAca ;
   private String[] T01IZ6_A343DisArtPle ;
   private short[] T01IZ6_A352DisArtTip ;
   private String[] T01IZ6_A338DisArtEnc ;
   private String[] T01IZ6_A336DisArtCor ;
   private String[] T01IZ6_A341DisArtOpe ;
   private String[] T01IZ6_A353DisArtTr1 ;
   private short[] T01IZ6_A344DisArtPt1 ;
   private String[] T01IZ6_A354DisArtTr2 ;
   private short[] T01IZ6_A345DisArtPt2 ;
   private String[] T01IZ6_A355DisArtTr3 ;
   private short[] T01IZ6_A346DisArtPt3 ;
   private java.math.BigDecimal[] T01IZ6_A350DisArtRdt ;
   private byte[] T01IZ6_A359DisArtUrg ;
   private String[] T01IZ6_A356DisArtUr1 ;
   private short[] T01IZ6_A347DisArtPu1 ;
   private String[] T01IZ6_A357DisArtUr2 ;
   private short[] T01IZ6_A348DisArtPu2 ;
   private String[] T01IZ6_A358DisArtUr3 ;
   private short[] T01IZ6_A349DisArtPu3 ;
   private boolean[] T01IZ6_n349DisArtPu3 ;
   private short[] T01IZ6_A342DisArtPes ;
   private short[] T01IZ6_A334DisArtAnh ;
   private short[] T01IZ6_A1231DisArtAn1 ;
   private short[] T01IZ6_A1232DisArtAcb ;
   private short[] T01IZ6_A1233DisArtAc2 ;
   private byte[] T01IZ6_A367DisEst ;
   private java.math.BigDecimal[] T01IZ6_A388DisPreKgm ;
   private java.math.BigDecimal[] T01IZ6_A389DisPreMtr ;
   private short[] T01IZ6_A383DisPieLan ;
   private short[] T01IZ6_A372DisKgmLan ;
   private short[] T01IZ6_A373DisMtrLan ;
   private String[] T01IZ6_A362DisColNom ;
   private boolean[] T01IZ6_n362DisColNom ;
   private int[] T01IZ6_A363DisColNum ;
   private boolean[] T01IZ6_n363DisColNum ;
   private String[] T01IZ6_A1195DisNomCli ;
   private int[] T01IZ6_A1196DisNumCli ;
   private java.math.BigDecimal[] T01IZ6_A1197DisEncCom ;
   private java.math.BigDecimal[] T01IZ6_A1198DisEncAnh ;
   private String[] T01IZ6_A365DisDes ;
   private short[] T01IZ6_A374DisNumPie ;
   private java.math.BigDecimal[] T01IZ6_A375DisNumUni ;
   private String[] T01IZ6_A392DisUniMed ;
   private short[] T01IZ6_A1225DisGraCru ;
   private String[] T01IZ6_A1430DisLoc ;
   private short[] T01IZ6_A1502DisPart ;
   private short[] T01IZ6_A1906DisGraAca ;
   private java.math.BigDecimal[] T01IZ6_A1907DisRdoN ;
   private java.math.BigDecimal[] T01IZ6_A1908DisRdoA ;
   private String[] T01IZ6_A2009DisTipDis ;
   private boolean[] T01IZ6_n2009DisTipDis ;
   private int[] T01IZ6_A2831DisNumLot ;
   private java.math.BigDecimal[] T01IZ6_A2832DisKgsLot ;
   private java.math.BigDecimal[] T01IZ6_A2833DisMtrLot ;
   private String[] T01IZ6_A2835DisPle2 ;
   private short[] T01IZ6_A3127DisNumCor ;
   private short[] T01IZ6_A3128DisAncSal1 ;
   private short[] T01IZ6_A3129DisAncSal2 ;
   private short[] T01IZ6_A3130DisAncSal3 ;
   private short[] T01IZ6_A3131DisGraAca2 ;
   private short[] T01IZ6_A3132DisGraCru2 ;
   private String[] T01IZ6_A3306DisFac ;
   private short[] T01IZ6_A3307DisManCod1 ;
   private short[] T01IZ6_A3308DisManCod2 ;
   private String[] T01IZ6_A3309DisNumTon ;
   private String[] T01IZ6_A4614DisMdlCod ;
   private String[] T01IZ6_A4615DisTam ;
   private int[] T01IZ6_A4293DisNPzas ;
   private boolean[] T01IZ6_n4293DisNPzas ;
   private java.util.Date[] T01IZ6_A4616DisHorEnt ;
   private boolean[] T01IZ6_n4616DisHorEnt ;
   private int[] T01IZ6_A4294DisNPzasL ;
   private boolean[] T01IZ6_n4294DisNPzasL ;
   private java.util.Date[] T01IZ6_A4617DisHorReg ;
   private boolean[] T01IZ6_n4617DisHorReg ;
   private String[] T01IZ6_A5252DisAcc ;
   private String[] T01IZ6_A5366DisAntp ;
   private String[] T01IZ6_A5405DisAntpT ;
   private String[] T01IZ6_A2926DisPla ;
   private byte[] T01IZ6_A4013DisEnv ;
   private boolean[] T01IZ6_n4013DisEnv ;
   private String[] T01IZ6_A366DisEnt ;
   private String[] T01IZ6_A4477DisAcaBak ;
   private String[] T01IZ6_A5350DisObsAnc ;
   private String[] T01IZ6_A5349DisObsGrm ;
   private String[] T01IZ6_A4813DisEncCli ;
   private String[] T01IZ6_A4720DisDishCod ;
   private byte[] T01IZ6_A2743DisNumTex1 ;
   private String[] T01IZ6_A5032DisEstTip ;
   private String[] T01IZ6_A4014DisTin ;
   private String[] T01IZ6_A5290DisTipCor ;
   private String[] T01IZ6_A4471DisCruEnr ;
   private String[] T01IZ6_A4479DisAcaMar ;
   private String[] T01IZ6_A1052DisObs ;
   private String[] T01IZ6_A1968DisRes ;
   private boolean[] T01IZ6_n1968DisRes ;
   private String[] T01IZ29_A396EmprCod ;
   private int[] T01IZ29_A361DisCod ;
   private String[] T01IZ30_A396EmprCod ;
   private int[] T01IZ30_A361DisCod ;
   private byte[] T01IZ5_A5025DisGraCob ;
   private String[] T01IZ5_A396EmprCod ;
   private int[] T01IZ5_A252CliCod ;
   private String[] T01IZ5_A1122MaqCodDis ;
   private boolean[] T01IZ5_n1122MaqCodDis ;
   private byte[] T01IZ5_A390DisTipCol ;
   private boolean[] T01IZ5_n390DisTipCol ;
   private String[] T01IZ5_A10887Cod_Idtx ;
   private boolean[] T01IZ5_n10887Cod_Idtx ;
   private int[] T01IZ5_A361DisCod ;
   private String[] T01IZ5_A757PriCod ;
   private String[] T01IZ5_A360DisCliNum ;
   private java.util.Date[] T01IZ5_A370DisFecCli ;
   private String[] T01IZ5_A335DisArtCod ;
   private java.util.Date[] T01IZ5_A369DisFec ;
   private java.util.Date[] T01IZ5_A371DisFecEnt ;
   private String[] T01IZ5_A337DisArtDsc ;
   private String[] T01IZ5_A340DisArtMat ;
   private String[] T01IZ5_A339DisArtLar ;
   private String[] T01IZ5_A351DisArtSua ;
   private String[] T01IZ5_A333DisArtAca ;
   private String[] T01IZ5_A343DisArtPle ;
   private short[] T01IZ5_A352DisArtTip ;
   private String[] T01IZ5_A338DisArtEnc ;
   private String[] T01IZ5_A336DisArtCor ;
   private String[] T01IZ5_A341DisArtOpe ;
   private String[] T01IZ5_A353DisArtTr1 ;
   private short[] T01IZ5_A344DisArtPt1 ;
   private String[] T01IZ5_A354DisArtTr2 ;
   private short[] T01IZ5_A345DisArtPt2 ;
   private String[] T01IZ5_A355DisArtTr3 ;
   private short[] T01IZ5_A346DisArtPt3 ;
   private java.math.BigDecimal[] T01IZ5_A350DisArtRdt ;
   private byte[] T01IZ5_A359DisArtUrg ;
   private String[] T01IZ5_A356DisArtUr1 ;
   private short[] T01IZ5_A347DisArtPu1 ;
   private String[] T01IZ5_A357DisArtUr2 ;
   private short[] T01IZ5_A348DisArtPu2 ;
   private String[] T01IZ5_A358DisArtUr3 ;
   private short[] T01IZ5_A349DisArtPu3 ;
   private boolean[] T01IZ5_n349DisArtPu3 ;
   private short[] T01IZ5_A342DisArtPes ;
   private short[] T01IZ5_A334DisArtAnh ;
   private short[] T01IZ5_A1231DisArtAn1 ;
   private short[] T01IZ5_A1232DisArtAcb ;
   private short[] T01IZ5_A1233DisArtAc2 ;
   private byte[] T01IZ5_A367DisEst ;
   private java.math.BigDecimal[] T01IZ5_A388DisPreKgm ;
   private java.math.BigDecimal[] T01IZ5_A389DisPreMtr ;
   private short[] T01IZ5_A383DisPieLan ;
   private short[] T01IZ5_A372DisKgmLan ;
   private short[] T01IZ5_A373DisMtrLan ;
   private String[] T01IZ5_A362DisColNom ;
   private boolean[] T01IZ5_n362DisColNom ;
   private int[] T01IZ5_A363DisColNum ;
   private boolean[] T01IZ5_n363DisColNum ;
   private String[] T01IZ5_A1195DisNomCli ;
   private int[] T01IZ5_A1196DisNumCli ;
   private java.math.BigDecimal[] T01IZ5_A1197DisEncCom ;
   private java.math.BigDecimal[] T01IZ5_A1198DisEncAnh ;
   private String[] T01IZ5_A365DisDes ;
   private short[] T01IZ5_A374DisNumPie ;
   private java.math.BigDecimal[] T01IZ5_A375DisNumUni ;
   private String[] T01IZ5_A392DisUniMed ;
   private short[] T01IZ5_A1225DisGraCru ;
   private String[] T01IZ5_A1430DisLoc ;
   private short[] T01IZ5_A1502DisPart ;
   private short[] T01IZ5_A1906DisGraAca ;
   private java.math.BigDecimal[] T01IZ5_A1907DisRdoN ;
   private java.math.BigDecimal[] T01IZ5_A1908DisRdoA ;
   private String[] T01IZ5_A2009DisTipDis ;
   private boolean[] T01IZ5_n2009DisTipDis ;
   private int[] T01IZ5_A2831DisNumLot ;
   private java.math.BigDecimal[] T01IZ5_A2832DisKgsLot ;
   private java.math.BigDecimal[] T01IZ5_A2833DisMtrLot ;
   private String[] T01IZ5_A2835DisPle2 ;
   private short[] T01IZ5_A3127DisNumCor ;
   private short[] T01IZ5_A3128DisAncSal1 ;
   private short[] T01IZ5_A3129DisAncSal2 ;
   private short[] T01IZ5_A3130DisAncSal3 ;
   private short[] T01IZ5_A3131DisGraAca2 ;
   private short[] T01IZ5_A3132DisGraCru2 ;
   private String[] T01IZ5_A3306DisFac ;
   private short[] T01IZ5_A3307DisManCod1 ;
   private short[] T01IZ5_A3308DisManCod2 ;
   private String[] T01IZ5_A3309DisNumTon ;
   private String[] T01IZ5_A4614DisMdlCod ;
   private String[] T01IZ5_A4615DisTam ;
   private int[] T01IZ5_A4293DisNPzas ;
   private boolean[] T01IZ5_n4293DisNPzas ;
   private java.util.Date[] T01IZ5_A4616DisHorEnt ;
   private boolean[] T01IZ5_n4616DisHorEnt ;
   private int[] T01IZ5_A4294DisNPzasL ;
   private boolean[] T01IZ5_n4294DisNPzasL ;
   private java.util.Date[] T01IZ5_A4617DisHorReg ;
   private boolean[] T01IZ5_n4617DisHorReg ;
   private String[] T01IZ5_A5252DisAcc ;
   private String[] T01IZ5_A5366DisAntp ;
   private String[] T01IZ5_A5405DisAntpT ;
   private String[] T01IZ5_A2926DisPla ;
   private byte[] T01IZ5_A4013DisEnv ;
   private boolean[] T01IZ5_n4013DisEnv ;
   private String[] T01IZ5_A366DisEnt ;
   private String[] T01IZ5_A4477DisAcaBak ;
   private String[] T01IZ5_A5350DisObsAnc ;
   private String[] T01IZ5_A5349DisObsGrm ;
   private String[] T01IZ5_A4813DisEncCli ;
   private String[] T01IZ5_A4720DisDishCod ;
   private byte[] T01IZ5_A2743DisNumTex1 ;
   private String[] T01IZ5_A5032DisEstTip ;
   private String[] T01IZ5_A4014DisTin ;
   private String[] T01IZ5_A5290DisTipCor ;
   private String[] T01IZ5_A4471DisCruEnr ;
   private String[] T01IZ5_A4479DisAcaMar ;
   private String[] T01IZ5_A1052DisObs ;
   private String[] T01IZ5_A1968DisRes ;
   private boolean[] T01IZ5_n1968DisRes ;
   private String[] T01IZ34_A407EmprNom ;
   private boolean[] T01IZ34_n407EmprNom ;
   private short[] T01IZ36_A387DisPiePie ;
   private boolean[] T01IZ36_n387DisPiePie ;
   private short[] T01IZ38_A379DisPie ;
   private boolean[] T01IZ38_n379DisPie ;
   private String[] T01IZ39_A279CliNom ;
   private String[] T01IZ40_A10888Dsc_Idtx ;
   private boolean[] T01IZ40_n10888Dsc_Idtx ;
   private String[] T01IZ41_A396EmprCod ;
   private int[] T01IZ41_A361DisCod ;
   private String[] T01IZ41_A13376DisTraID ;
   private String[] T01IZ42_A396EmprCod ;
   private int[] T01IZ42_A361DisCod ;
   private String[] T01IZ42_A13213DisNormID ;
   private String[] T01IZ43_A396EmprCod ;
   private int[] T01IZ43_A361DisCod ;
   private byte[] T01IZ43_A13081DisDGLin ;
   private String[] T01IZ43_A13082DisDGDibCl ;
   private int[] T01IZ43_A13083DisDGDibIn ;
   private String[] T01IZ43_A13084DisDGComb ;
   private String[] T01IZ43_A13085DisDGFondo ;
   private String[] T01IZ44_A396EmprCod ;
   private int[] T01IZ44_A361DisCod ;
   private byte[] T01IZ44_A7068DisNotLin ;
   private String[] T01IZ45_A396EmprCod ;
   private int[] T01IZ45_A361DisCod ;
   private String[] T01IZ45_A10197ProEspCod ;
   private String[] T01IZ46_A396EmprCod ;
   private int[] T01IZ46_A361DisCod ;
   private short[] T01IZ46_A4594AccCod ;
   private String[] T01IZ47_A396EmprCod ;
   private int[] T01IZ47_A361DisCod ;
   private byte[] T01IZ47_A2524DisComLin ;
   private String[] T01IZ47_A1056DisComCod ;
   private String[] T01IZ47_A1032FonCod ;
   private String[] T01IZ48_A396EmprCod ;
   private int[] T01IZ48_A361DisCod ;
   private int[] T01IZ48_A3398DisRefBarC ;
   private byte[] T01IZ48_A3399DisRefBCRe ;
   private String[] T01IZ48_A3400DisRefBCPa ;
   private String[] T01IZ48_A3607DisRefBPie ;
   private String[] T01IZ49_A396EmprCod ;
   private int[] T01IZ49_A361DisCod ;
   private byte[] T01IZ49_A376DisObsLin ;
   private String[] T01IZ50_A396EmprCod ;
   private int[] T01IZ50_A361DisCod ;
   private String[] T01IZ50_A758ProCod ;
   private short[] T01IZ50_A368DisFasLin ;
   private String[] T01IZ51_A396EmprCod ;
   private int[] T01IZ51_A361DisCod ;
   private short[] T01IZ51_A833TipDefCod ;
   private String[] T01IZ52_A396EmprCod ;
   private int[] T01IZ52_A361DisCod ;
   private int[] T01IZ52_A44AlbRecCod ;
   private String[] T01IZ53_A396EmprCod ;
   private int[] T01IZ53_A361DisCod ;
   private int[] T01IZ54_A361DisCod ;
   private String[] T01IZ54_A759ProDsc ;
   private String[] T01IZ54_A396EmprCod ;
   private String[] T01IZ54_A758ProCod ;
   private String[] T01IZ4_A759ProDsc ;
   private String[] T01IZ55_A759ProDsc ;
   private String[] T01IZ56_A396EmprCod ;
   private int[] T01IZ56_A361DisCod ;
   private String[] T01IZ56_A758ProCod ;
   private int[] T01IZ3_A361DisCod ;
   private String[] T01IZ3_A396EmprCod ;
   private String[] T01IZ3_A758ProCod ;
   private int[] T01IZ2_A361DisCod ;
   private String[] T01IZ2_A396EmprCod ;
   private String[] T01IZ2_A758ProCod ;
   private String[] T01IZ59_A759ProDsc ;
   private String[] T01IZ60_A396EmprCod ;
   private int[] T01IZ60_A361DisCod ;
   private String[] T01IZ60_A758ProCod ;
   private short[] T01IZ60_A368DisFasLin ;
   private String[] T01IZ61_A396EmprCod ;
   private int[] T01IZ61_A361DisCod ;
   private String[] T01IZ61_A758ProCod ;
   private String[] T01IZ62_A396EmprCod ;
   private String[] T01IZ63_A396EmprCod ;
   private int[] T01IZ64_A673Piezas ;
   private java.math.BigDecimal[] T01IZ65_A631Metros ;
   private java.math.BigDecimal[] T01IZ66_A384DisPieMet ;
   private java.math.BigDecimal[] T01IZ67_A595Kilos ;
   private java.math.BigDecimal[] T01IZ68_A382DisPieKil ;
   private java.math.BigDecimal[] T01IZ69_A631Metros ;
   private java.math.BigDecimal[] T01IZ70_A595Kilos ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdispol__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdispol__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdispol__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdispol__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdispol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01IZ2", "SELECT DisCod, EmprCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?  FOR UPDATE OF DisCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ3", "SELECT DisCod, EmprCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ4", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ5", "SELECT DisGraCob, EmprCod, CliCod, MaqCodDis, DisTipCol, Cod_Idtx, DisCod, PriCod, DisCliNum, DisFecCli, DisArtCod, DisFec, DisFecEnt, DisArtDsc, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtPes, DisArtAnh, DisArtAn1, DisArtAcb, DisArtAc2, DisEst, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisColNom, DisColNum, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisDes, DisNumPie, DisNumUni, DisUniMed, DisGraCru, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisTipDis, DisNumLot, DisKgsLot, DisMtrLot, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisMdlCod, DisTam, DisNPzas, DisHorEnt, DisNPzasL, DisHorReg, DisAcc, DisAntp, DisAntpT, DisPla, DisEnv, DisEnt, DisAcaBak, DisObsAnc, DisObsGrm, DisEncCli, DisDishCod, DisNumTex1, DisEstTip, DisTin, DisTipCor, DisCruEnr, DisAcaMar, DisObs, DisRes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ?  FOR UPDATE OF PriCod, DisCliNum, DisFecCli, DisArtCod, DisFec, DisFecEnt, DisArtDsc, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtPes, DisArtAnh, DisArtAn1, DisArtAcb, DisArtAc2, DisEst, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisColNom, DisColNum, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisDes, DisNumPie, DisNumUni, DisUniMed, DisGraCru, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisTipDis, DisNumLot, DisKgsLot, DisMtrLot, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisMdlCod, DisTam, DisNPzas, DisHorEnt, DisNPzasL, DisHorReg, DisAcc, DisAntp, DisAntpT, DisPla, DisEnv, DisEnt, DisAcaBak, DisObsAnc, DisObsGrm, DisEncCli, DisDishCod, DisNumTex1, DisEstTip, DisTin, DisTipCor, DisCruEnr, DisAcaMar, DisObs, DisRes, DisGraCob, CliCod, MaqCodDis, DisTipCol, Cod_Idtx NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ6", "SELECT DisGraCob, EmprCod, CliCod, MaqCodDis, DisTipCol, Cod_Idtx, DisCod, PriCod, DisCliNum, DisFecCli, DisArtCod, DisFec, DisFecEnt, DisArtDsc, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtPes, DisArtAnh, DisArtAn1, DisArtAcb, DisArtAc2, DisEst, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisColNom, DisColNum, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisDes, DisNumPie, DisNumUni, DisUniMed, DisGraCru, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisTipDis, DisNumLot, DisKgsLot, DisMtrLot, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisMdlCod, DisTam, DisNPzas, DisHorEnt, DisNPzasL, DisHorReg, DisAcc, DisAntp, DisAntpT, DisPla, DisEnv, DisEnt, DisAcaBak, DisObsAnc, DisObsGrm, DisEncCli, DisDishCod, DisNumTex1, DisEstTip, DisTin, DisTipCor, DisCruEnr, DisAcaMar, DisObs, DisRes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ9", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ10", "SELECT EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ11", "SELECT Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? AND Cod_Idtx = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ13", "SELECT COALESCE( T1.DisPiePie, 0) AS DisPiePie FROM (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ15", "SELECT COALESCE( T1.GXC8, 0) AS DisPie FROM (SELECT SUM(Piezas) AS GXC8, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ18", "SELECT /*+ FIRST_ROWS(100) */ TM1.DisGraCob, T6.Dsc_Idtx, TM1.EmprCod, TM1.CliCod, TM1.MaqCodDis AS MaqCodDis, TM1.DisTipCol AS DisTipCol, TM1.Cod_Idtx, COALESCE( T3.DisPiePie, 0) AS DisPiePie, COALESCE( T4.GXC8, 0) AS DisPie, TM1.DisCod, TM1.PriCod, T2.EmprNom, TM1.DisCliNum, TM1.DisFecCli, T5.CliNom, TM1.DisArtCod, TM1.DisFec, TM1.DisFecEnt, TM1.DisArtDsc, TM1.DisArtMat, TM1.DisArtLar, TM1.DisArtSua, TM1.DisArtAca, TM1.DisArtPle, TM1.DisArtTip, TM1.DisArtEnc, TM1.DisArtCor, TM1.DisArtOpe, TM1.DisArtTr1, TM1.DisArtPt1, TM1.DisArtTr2, TM1.DisArtPt2, TM1.DisArtTr3, TM1.DisArtPt3, TM1.DisArtRdt, TM1.DisArtUrg, TM1.DisArtUr1, TM1.DisArtPu1, TM1.DisArtUr2, TM1.DisArtPu2, TM1.DisArtUr3, TM1.DisArtPu3, TM1.DisArtPes, TM1.DisArtAnh, TM1.DisArtAn1, TM1.DisArtAcb, TM1.DisArtAc2, TM1.DisEst, TM1.DisPreKgm, TM1.DisPreMtr, TM1.DisPieLan, TM1.DisKgmLan, TM1.DisMtrLan, TM1.DisColNom, TM1.DisColNum, TM1.DisNomCli, TM1.DisNumCli, TM1.DisEncCom, TM1.DisEncAnh, TM1.DisDes, TM1.DisNumPie, TM1.DisNumUni, TM1.DisUniMed, TM1.DisGraCru, TM1.DisLoc, TM1.DisPart, TM1.DisGraAca, TM1.DisRdoN, TM1.DisRdoA, TM1.DisTipDis, TM1.DisNumLot, TM1.DisKgsLot, TM1.DisMtrLot, TM1.DisPle2, TM1.DisNumCor, TM1.DisAncSal1, TM1.DisAncSal2, TM1.DisAncSal3, TM1.DisGraAca2, TM1.DisGraCru2, TM1.DisFac, TM1.DisManCod1, TM1.DisManCod2, TM1.DisNumTon, TM1.DisMdlCod, TM1.DisTam, TM1.DisNPzas, TM1.DisHorEnt, TM1.DisNPzasL, TM1.DisHorReg, TM1.DisAcc, TM1.DisAntp, TM1.DisAntpT, TM1.DisPla, TM1.DisEnv, TM1.DisEnt, TM1.DisAcaBak, TM1.DisObsAnc, TM1.DisObsGrm, TM1.DisEncCli, TM1.DisDishCod, TM1.DisNumTex1, TM1.DisEstTip, TM1.DisTin, TM1.DisTipCor, TM1.DisCruEnr, TM1.DisAcaMar, TM1.DisObs, TM1.DisRes FROM (((((TXPDISPOS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.DisCod = TM1.DisCod) LEFT JOIN (SELECT SUM(Piezas) AS GXC8, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.DisCod = TM1.DisCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.CliCod) LEFT JOIN TXPINDITE T6 ON T6.EmprCod = TM1.EmprCod AND T6.Cod_Idtx = TM1.Cod_Idtx) WHERE TM1.EmprCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ19", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ20", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ21", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ22", "SELECT EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ23", "SELECT Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? AND Cod_Idtx = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ25", "SELECT COALESCE( T1.DisPiePie, 0) AS DisPiePie FROM (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ27", "SELECT COALESCE( T1.GXC8, 0) AS DisPie FROM (SELECT SUM(Piezas) AS GXC8, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ28", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ29", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE ( EmprCod > ? or EmprCod = ? and DisCod > ?) ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IZ30", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE ( EmprCod < ? or EmprCod = ? and DisCod < ?) ORDER BY EmprCod DESC, DisCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01IZ31", "INSERT INTO TXPDISPOS(DisCod, PriCod, DisCliNum, DisFecCli, DisArtCod, DisFec, DisFecEnt, DisArtDsc, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtPes, DisArtAnh, DisArtAn1, DisArtAcb, DisArtAc2, DisEst, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisColNom, DisColNum, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisDes, DisNumPie, DisNumUni, DisUniMed, DisGraCru, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisTipDis, DisNumLot, DisKgsLot, DisMtrLot, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisMdlCod, DisTam, DisNPzas, DisHorEnt, DisNPzasL, DisHorReg, DisAcc, DisAntp, DisAntpT, DisPla, DisEnv, DisEnt, DisAcaBak, DisObsAnc, DisObsGrm, DisEncCli, DisDishCod, DisNumTex1, DisEstTip, DisTin, DisTipCor, DisCruEnr, DisAcaMar, DisObs, DisRes, DisGraCob, EmprCod, CliCod, MaqCodDis, DisTipCol, Cod_Idtx, DisObsULin, DisNMtr, DisNMez, DisNumTen, PartCod, TipConCod, DisNumBas, DisCliDes, DisManCod, DisOpeAnt, DisCodTex, DisNumTex2, DisFecLan, RetCod, DisArtMer, EmpesCod, DibCli, DibInt, DisNumCol, DisComULin, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisLotMts, DisLotKgs, DisAcaAnh, DisNroCor, DibColDib, DisTipEst, DisCom, DisVolMaq, DisRbMaq, DisDto, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisExp, DisFEnt, DisDest, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, MarcaId, DisOrdComp, DisCnoEncO, Nxt_modelo, CpteId, Nxt_statio, DesaID, DptoID, Nxt_artcli, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0)", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01IZ32", "UPDATE TXPDISPOS SET PriCod=?, DisCliNum=?, DisFecCli=?, DisArtCod=?, DisFec=?, DisFecEnt=?, DisArtDsc=?, DisArtMat=?, DisArtLar=?, DisArtSua=?, DisArtAca=?, DisArtPle=?, DisArtTip=?, DisArtEnc=?, DisArtCor=?, DisArtOpe=?, DisArtTr1=?, DisArtPt1=?, DisArtTr2=?, DisArtPt2=?, DisArtTr3=?, DisArtPt3=?, DisArtRdt=?, DisArtUrg=?, DisArtUr1=?, DisArtPu1=?, DisArtUr2=?, DisArtPu2=?, DisArtUr3=?, DisArtPu3=?, DisArtPes=?, DisArtAnh=?, DisArtAn1=?, DisArtAcb=?, DisArtAc2=?, DisEst=?, DisPreKgm=?, DisPreMtr=?, DisPieLan=?, DisKgmLan=?, DisMtrLan=?, DisColNom=?, DisColNum=?, DisNomCli=?, DisNumCli=?, DisEncCom=?, DisEncAnh=?, DisDes=?, DisNumPie=?, DisNumUni=?, DisUniMed=?, DisGraCru=?, DisLoc=?, DisPart=?, DisGraAca=?, DisRdoN=?, DisRdoA=?, DisTipDis=?, DisNumLot=?, DisKgsLot=?, DisMtrLot=?, DisPle2=?, DisNumCor=?, DisAncSal1=?, DisAncSal2=?, DisAncSal3=?, DisGraAca2=?, DisGraCru2=?, DisFac=?, DisManCod1=?, DisManCod2=?, DisNumTon=?, DisMdlCod=?, DisTam=?, DisNPzas=?, DisHorEnt=?, DisNPzasL=?, DisHorReg=?, DisAcc=?, DisAntp=?, DisAntpT=?, DisPla=?, DisEnv=?, DisEnt=?, DisAcaBak=?, DisObsAnc=?, DisObsGrm=?, DisEncCli=?, DisDishCod=?, DisNumTex1=?, DisEstTip=?, DisTin=?, DisTipCor=?, DisCruEnr=?, DisAcaMar=?, DisObs=?, DisRes=?, DisGraCob=?, CliCod=?, MaqCodDis=?, DisTipCol=?, Cod_Idtx=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01IZ33", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("T01IZ34", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ36", "SELECT COALESCE( T1.DisPiePie, 0) AS DisPiePie FROM (SELECT COUNT(*) AS DisPiePie, EmprCod, DisCod FROM TXPDISALD GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ38", "SELECT COALESCE( T1.GXC8, 0) AS DisPie FROM (SELECT SUM(Piezas) AS GXC8, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ39", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ40", "SELECT Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? AND Cod_Idtx = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ41", "SELECT * FROM (SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IZ42", "SELECT * FROM (SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IZ43", "SELECT * FROM (SELECT EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo FROM TXPDIGCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IZ44", "SELECT * FROM (SELECT EmprCod, DisCod, DisNotLin FROM TXPDISNOT WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IZ45", "SELECT * FROM (SELECT EmprCod, DisCod, ProEspCod FROM TXPDisPE WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IZ46", "SELECT * FROM (SELECT EmprCod, DisCod, AccCod FROM TXPDISACC WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IZ47", "SELECT * FROM (SELECT EmprCod, DisCod, DisComLin, DisComCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IZ48", "SELECT * FROM (SELECT EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IZ49", "SELECT * FROM (SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IZ50", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IZ51", "SELECT * FROM (SELECT EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IZ52", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IZ53", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod FROM TXPDISPOS ORDER BY EmprCod, DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ54", "SELECT T1.DisCod, T2.ProDsc, T1.EmprCod, T1.ProCod FROM (TXPDISLIN T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ55", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ56", "SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01IZ57", "INSERT INTO TXPDISLIN(DisCod, EmprCod, ProCod, UltFasLin, DisFasApr, ProSts, ProStsFec) VALUES(?, ?, ?, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPDISLIN")
         ,new UpdateCursor("T01IZ58", "DELETE FROM TXPDISLIN  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK, "TXPDISLIN")
         ,new ForEachCursor("T01IZ59", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ60", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01IZ61", "SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, ProCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ62", "SELECT EmprCod FROM TXPTIPCOL WHERE EmprCod = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ63", "SELECT EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ64", "SELECT SUM(Piezas) AS GXC8 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ65", "SELECT SUM(Metros) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ66", "SELECT SUM(DisPieMet) AS GXC6 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ67", "SELECT SUM(Kilos) AS GXC1 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ68", "SELECT SUM(DisPieKil) AS GXC4 FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ69", "SELECT SUM(Metros) AS GXC2 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01IZ70", "SELECT SUM(Kilos) AS GXC1 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 26);
               ((String[]) buf[17])[0] = rslt.getString(15, 16);
               ((String[]) buf[18])[0] = rslt.getString(16, 10);
               ((String[]) buf[19])[0] = rslt.getString(17, 6);
               ((String[]) buf[20])[0] = rslt.getString(18, 6);
               ((String[]) buf[21])[0] = rslt.getString(19, 10);
               ((short[]) buf[22])[0] = rslt.getShort(20);
               ((String[]) buf[23])[0] = rslt.getString(21, 1);
               ((String[]) buf[24])[0] = rslt.getString(22, 1);
               ((String[]) buf[25])[0] = rslt.getString(23, 2);
               ((String[]) buf[26])[0] = rslt.getString(24, 4);
               ((short[]) buf[27])[0] = rslt.getShort(25);
               ((String[]) buf[28])[0] = rslt.getString(26, 4);
               ((short[]) buf[29])[0] = rslt.getShort(27);
               ((String[]) buf[30])[0] = rslt.getString(28, 4);
               ((short[]) buf[31])[0] = rslt.getShort(29);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(30,2);
               ((byte[]) buf[33])[0] = rslt.getByte(31);
               ((String[]) buf[34])[0] = rslt.getString(32, 4);
               ((short[]) buf[35])[0] = rslt.getShort(33);
               ((String[]) buf[36])[0] = rslt.getString(34, 4);
               ((short[]) buf[37])[0] = rslt.getShort(35);
               ((String[]) buf[38])[0] = rslt.getString(36, 4);
               ((short[]) buf[39])[0] = rslt.getShort(37);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(38);
               ((short[]) buf[42])[0] = rslt.getShort(39);
               ((short[]) buf[43])[0] = rslt.getShort(40);
               ((short[]) buf[44])[0] = rslt.getShort(41);
               ((short[]) buf[45])[0] = rslt.getShort(42);
               ((byte[]) buf[46])[0] = rslt.getByte(43);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(44,2);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(45,2);
               ((short[]) buf[49])[0] = rslt.getShort(46);
               ((short[]) buf[50])[0] = rslt.getShort(47);
               ((short[]) buf[51])[0] = rslt.getShort(48);
               ((String[]) buf[52])[0] = rslt.getString(49, 13);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((int[]) buf[54])[0] = rslt.getInt(50);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(51, 13);
               ((int[]) buf[57])[0] = rslt.getInt(52);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(53,2);
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(54,2);
               ((String[]) buf[60])[0] = rslt.getString(55, 1);
               ((short[]) buf[61])[0] = rslt.getShort(56);
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(57,2);
               ((String[]) buf[63])[0] = rslt.getString(58, 1);
               ((short[]) buf[64])[0] = rslt.getShort(59);
               ((String[]) buf[65])[0] = rslt.getString(60, 10);
               ((short[]) buf[66])[0] = rslt.getShort(61);
               ((short[]) buf[67])[0] = rslt.getShort(62);
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(63,2);
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(64,2);
               ((String[]) buf[70])[0] = rslt.getString(65, 1);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((int[]) buf[72])[0] = rslt.getInt(66);
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(67,2);
               ((java.math.BigDecimal[]) buf[74])[0] = rslt.getBigDecimal(68,2);
               ((String[]) buf[75])[0] = rslt.getString(69, 30);
               ((short[]) buf[76])[0] = rslt.getShort(70);
               ((short[]) buf[77])[0] = rslt.getShort(71);
               ((short[]) buf[78])[0] = rslt.getShort(72);
               ((short[]) buf[79])[0] = rslt.getShort(73);
               ((short[]) buf[80])[0] = rslt.getShort(74);
               ((short[]) buf[81])[0] = rslt.getShort(75);
               ((String[]) buf[82])[0] = rslt.getString(76, 1);
               ((short[]) buf[83])[0] = rslt.getShort(77);
               ((short[]) buf[84])[0] = rslt.getShort(78);
               ((String[]) buf[85])[0] = rslt.getString(79, 10);
               ((String[]) buf[86])[0] = rslt.getString(80, 13);
               ((String[]) buf[87])[0] = rslt.getString(81, 4);
               ((int[]) buf[88])[0] = rslt.getInt(82);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[90])[0] = GXutil.resetDate(rslt.getGXDateTime(83));
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((int[]) buf[92])[0] = rslt.getInt(84);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[94])[0] = GXutil.resetDate(rslt.getGXDateTime(85));
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getString(86, 1);
               ((String[]) buf[97])[0] = rslt.getString(87, 1);
               ((String[]) buf[98])[0] = rslt.getString(88, 1);
               ((String[]) buf[99])[0] = rslt.getString(89, 1);
               ((byte[]) buf[100])[0] = rslt.getByte(90);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getString(91, 40);
               ((String[]) buf[103])[0] = rslt.getString(92, 1);
               ((String[]) buf[104])[0] = rslt.getString(93, 20);
               ((String[]) buf[105])[0] = rslt.getString(94, 20);
               ((String[]) buf[106])[0] = rslt.getString(95, 20);
               ((String[]) buf[107])[0] = rslt.getString(96, 12);
               ((byte[]) buf[108])[0] = rslt.getByte(97);
               ((String[]) buf[109])[0] = rslt.getString(98, 1);
               ((String[]) buf[110])[0] = rslt.getString(99, 1);
               ((String[]) buf[111])[0] = rslt.getString(100, 2);
               ((String[]) buf[112])[0] = rslt.getString(101, 1);
               ((String[]) buf[113])[0] = rslt.getString(102, 1);
               ((String[]) buf[114])[0] = rslt.getString(103, 30);
               ((String[]) buf[115])[0] = rslt.getString(104, 1);
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 26);
               ((String[]) buf[17])[0] = rslt.getString(15, 16);
               ((String[]) buf[18])[0] = rslt.getString(16, 10);
               ((String[]) buf[19])[0] = rslt.getString(17, 6);
               ((String[]) buf[20])[0] = rslt.getString(18, 6);
               ((String[]) buf[21])[0] = rslt.getString(19, 10);
               ((short[]) buf[22])[0] = rslt.getShort(20);
               ((String[]) buf[23])[0] = rslt.getString(21, 1);
               ((String[]) buf[24])[0] = rslt.getString(22, 1);
               ((String[]) buf[25])[0] = rslt.getString(23, 2);
               ((String[]) buf[26])[0] = rslt.getString(24, 4);
               ((short[]) buf[27])[0] = rslt.getShort(25);
               ((String[]) buf[28])[0] = rslt.getString(26, 4);
               ((short[]) buf[29])[0] = rslt.getShort(27);
               ((String[]) buf[30])[0] = rslt.getString(28, 4);
               ((short[]) buf[31])[0] = rslt.getShort(29);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(30,2);
               ((byte[]) buf[33])[0] = rslt.getByte(31);
               ((String[]) buf[34])[0] = rslt.getString(32, 4);
               ((short[]) buf[35])[0] = rslt.getShort(33);
               ((String[]) buf[36])[0] = rslt.getString(34, 4);
               ((short[]) buf[37])[0] = rslt.getShort(35);
               ((String[]) buf[38])[0] = rslt.getString(36, 4);
               ((short[]) buf[39])[0] = rslt.getShort(37);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(38);
               ((short[]) buf[42])[0] = rslt.getShort(39);
               ((short[]) buf[43])[0] = rslt.getShort(40);
               ((short[]) buf[44])[0] = rslt.getShort(41);
               ((short[]) buf[45])[0] = rslt.getShort(42);
               ((byte[]) buf[46])[0] = rslt.getByte(43);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(44,2);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(45,2);
               ((short[]) buf[49])[0] = rslt.getShort(46);
               ((short[]) buf[50])[0] = rslt.getShort(47);
               ((short[]) buf[51])[0] = rslt.getShort(48);
               ((String[]) buf[52])[0] = rslt.getString(49, 13);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((int[]) buf[54])[0] = rslt.getInt(50);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(51, 13);
               ((int[]) buf[57])[0] = rslt.getInt(52);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(53,2);
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(54,2);
               ((String[]) buf[60])[0] = rslt.getString(55, 1);
               ((short[]) buf[61])[0] = rslt.getShort(56);
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(57,2);
               ((String[]) buf[63])[0] = rslt.getString(58, 1);
               ((short[]) buf[64])[0] = rslt.getShort(59);
               ((String[]) buf[65])[0] = rslt.getString(60, 10);
               ((short[]) buf[66])[0] = rslt.getShort(61);
               ((short[]) buf[67])[0] = rslt.getShort(62);
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(63,2);
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(64,2);
               ((String[]) buf[70])[0] = rslt.getString(65, 1);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((int[]) buf[72])[0] = rslt.getInt(66);
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(67,2);
               ((java.math.BigDecimal[]) buf[74])[0] = rslt.getBigDecimal(68,2);
               ((String[]) buf[75])[0] = rslt.getString(69, 30);
               ((short[]) buf[76])[0] = rslt.getShort(70);
               ((short[]) buf[77])[0] = rslt.getShort(71);
               ((short[]) buf[78])[0] = rslt.getShort(72);
               ((short[]) buf[79])[0] = rslt.getShort(73);
               ((short[]) buf[80])[0] = rslt.getShort(74);
               ((short[]) buf[81])[0] = rslt.getShort(75);
               ((String[]) buf[82])[0] = rslt.getString(76, 1);
               ((short[]) buf[83])[0] = rslt.getShort(77);
               ((short[]) buf[84])[0] = rslt.getShort(78);
               ((String[]) buf[85])[0] = rslt.getString(79, 10);
               ((String[]) buf[86])[0] = rslt.getString(80, 13);
               ((String[]) buf[87])[0] = rslt.getString(81, 4);
               ((int[]) buf[88])[0] = rslt.getInt(82);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[90])[0] = GXutil.resetDate(rslt.getGXDateTime(83));
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((int[]) buf[92])[0] = rslt.getInt(84);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[94])[0] = GXutil.resetDate(rslt.getGXDateTime(85));
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getString(86, 1);
               ((String[]) buf[97])[0] = rslt.getString(87, 1);
               ((String[]) buf[98])[0] = rslt.getString(88, 1);
               ((String[]) buf[99])[0] = rslt.getString(89, 1);
               ((byte[]) buf[100])[0] = rslt.getByte(90);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getString(91, 40);
               ((String[]) buf[103])[0] = rslt.getString(92, 1);
               ((String[]) buf[104])[0] = rslt.getString(93, 20);
               ((String[]) buf[105])[0] = rslt.getString(94, 20);
               ((String[]) buf[106])[0] = rslt.getString(95, 20);
               ((String[]) buf[107])[0] = rslt.getString(96, 12);
               ((byte[]) buf[108])[0] = rslt.getByte(97);
               ((String[]) buf[109])[0] = rslt.getString(98, 1);
               ((String[]) buf[110])[0] = rslt.getString(99, 1);
               ((String[]) buf[111])[0] = rslt.getString(100, 2);
               ((String[]) buf[112])[0] = rslt.getString(101, 1);
               ((String[]) buf[113])[0] = rslt.getString(102, 1);
               ((String[]) buf[114])[0] = rslt.getString(103, 30);
               ((String[]) buf[115])[0] = rslt.getString(104, 1);
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((String[]) buf[16])[0] = rslt.getString(11, 1);
               ((String[]) buf[17])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 8);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(14);
               ((String[]) buf[21])[0] = rslt.getString(15, 30);
               ((String[]) buf[22])[0] = rslt.getString(16, 16);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(17);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(18);
               ((String[]) buf[25])[0] = rslt.getString(19, 26);
               ((String[]) buf[26])[0] = rslt.getString(20, 16);
               ((String[]) buf[27])[0] = rslt.getString(21, 10);
               ((String[]) buf[28])[0] = rslt.getString(22, 6);
               ((String[]) buf[29])[0] = rslt.getString(23, 6);
               ((String[]) buf[30])[0] = rslt.getString(24, 10);
               ((short[]) buf[31])[0] = rslt.getShort(25);
               ((String[]) buf[32])[0] = rslt.getString(26, 1);
               ((String[]) buf[33])[0] = rslt.getString(27, 1);
               ((String[]) buf[34])[0] = rslt.getString(28, 2);
               ((String[]) buf[35])[0] = rslt.getString(29, 4);
               ((short[]) buf[36])[0] = rslt.getShort(30);
               ((String[]) buf[37])[0] = rslt.getString(31, 4);
               ((short[]) buf[38])[0] = rslt.getShort(32);
               ((String[]) buf[39])[0] = rslt.getString(33, 4);
               ((short[]) buf[40])[0] = rslt.getShort(34);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(35,2);
               ((byte[]) buf[42])[0] = rslt.getByte(36);
               ((String[]) buf[43])[0] = rslt.getString(37, 4);
               ((short[]) buf[44])[0] = rslt.getShort(38);
               ((String[]) buf[45])[0] = rslt.getString(39, 4);
               ((short[]) buf[46])[0] = rslt.getShort(40);
               ((String[]) buf[47])[0] = rslt.getString(41, 4);
               ((short[]) buf[48])[0] = rslt.getShort(42);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((short[]) buf[50])[0] = rslt.getShort(43);
               ((short[]) buf[51])[0] = rslt.getShort(44);
               ((short[]) buf[52])[0] = rslt.getShort(45);
               ((short[]) buf[53])[0] = rslt.getShort(46);
               ((short[]) buf[54])[0] = rslt.getShort(47);
               ((byte[]) buf[55])[0] = rslt.getByte(48);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(49,2);
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(50,2);
               ((short[]) buf[58])[0] = rslt.getShort(51);
               ((short[]) buf[59])[0] = rslt.getShort(52);
               ((short[]) buf[60])[0] = rslt.getShort(53);
               ((String[]) buf[61])[0] = rslt.getString(54, 13);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((int[]) buf[63])[0] = rslt.getInt(55);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(56, 13);
               ((int[]) buf[66])[0] = rslt.getInt(57);
               ((java.math.BigDecimal[]) buf[67])[0] = rslt.getBigDecimal(58,2);
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(59,2);
               ((String[]) buf[69])[0] = rslt.getString(60, 1);
               ((short[]) buf[70])[0] = rslt.getShort(61);
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(62,2);
               ((String[]) buf[72])[0] = rslt.getString(63, 1);
               ((short[]) buf[73])[0] = rslt.getShort(64);
               ((String[]) buf[74])[0] = rslt.getString(65, 10);
               ((short[]) buf[75])[0] = rslt.getShort(66);
               ((short[]) buf[76])[0] = rslt.getShort(67);
               ((java.math.BigDecimal[]) buf[77])[0] = rslt.getBigDecimal(68,2);
               ((java.math.BigDecimal[]) buf[78])[0] = rslt.getBigDecimal(69,2);
               ((String[]) buf[79])[0] = rslt.getString(70, 1);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((int[]) buf[81])[0] = rslt.getInt(71);
               ((java.math.BigDecimal[]) buf[82])[0] = rslt.getBigDecimal(72,2);
               ((java.math.BigDecimal[]) buf[83])[0] = rslt.getBigDecimal(73,2);
               ((String[]) buf[84])[0] = rslt.getString(74, 30);
               ((short[]) buf[85])[0] = rslt.getShort(75);
               ((short[]) buf[86])[0] = rslt.getShort(76);
               ((short[]) buf[87])[0] = rslt.getShort(77);
               ((short[]) buf[88])[0] = rslt.getShort(78);
               ((short[]) buf[89])[0] = rslt.getShort(79);
               ((short[]) buf[90])[0] = rslt.getShort(80);
               ((String[]) buf[91])[0] = rslt.getString(81, 1);
               ((short[]) buf[92])[0] = rslt.getShort(82);
               ((short[]) buf[93])[0] = rslt.getShort(83);
               ((String[]) buf[94])[0] = rslt.getString(84, 10);
               ((String[]) buf[95])[0] = rslt.getString(85, 13);
               ((String[]) buf[96])[0] = rslt.getString(86, 4);
               ((int[]) buf[97])[0] = rslt.getInt(87);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[99])[0] = GXutil.resetDate(rslt.getGXDateTime(88));
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((int[]) buf[101])[0] = rslt.getInt(89);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[103])[0] = GXutil.resetDate(rslt.getGXDateTime(90));
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((String[]) buf[105])[0] = rslt.getString(91, 1);
               ((String[]) buf[106])[0] = rslt.getString(92, 1);
               ((String[]) buf[107])[0] = rslt.getString(93, 1);
               ((String[]) buf[108])[0] = rslt.getString(94, 1);
               ((byte[]) buf[109])[0] = rslt.getByte(95);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((String[]) buf[111])[0] = rslt.getString(96, 40);
               ((String[]) buf[112])[0] = rslt.getString(97, 1);
               ((String[]) buf[113])[0] = rslt.getString(98, 20);
               ((String[]) buf[114])[0] = rslt.getString(99, 20);
               ((String[]) buf[115])[0] = rslt.getString(100, 20);
               ((String[]) buf[116])[0] = rslt.getString(101, 12);
               ((byte[]) buf[117])[0] = rslt.getByte(102);
               ((String[]) buf[118])[0] = rslt.getString(103, 1);
               ((String[]) buf[119])[0] = rslt.getString(104, 1);
               ((String[]) buf[120])[0] = rslt.getString(105, 2);
               ((String[]) buf[121])[0] = rslt.getString(106, 1);
               ((String[]) buf[122])[0] = rslt.getString(107, 1);
               ((String[]) buf[123])[0] = rslt.getString(108, 30);
               ((String[]) buf[124])[0] = rslt.getString(109, 1);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 44 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 54 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 55 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 56 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 57 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 58 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 59 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 16 :
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
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 23 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setString(8, (String)parms[7], 26);
               stmt.setString(9, (String)parms[8], 16);
               stmt.setString(10, (String)parms[9], 10);
               stmt.setString(11, (String)parms[10], 6);
               stmt.setString(12, (String)parms[11], 6);
               stmt.setString(13, (String)parms[12], 10);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 1);
               stmt.setString(17, (String)parms[16], 2);
               stmt.setString(18, (String)parms[17], 4);
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               stmt.setString(20, (String)parms[19], 4);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               stmt.setString(22, (String)parms[21], 4);
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[23], 2);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setString(26, (String)parms[25], 4);
               stmt.setShort(27, ((Number) parms[26]).shortValue());
               stmt.setString(28, (String)parms[27], 4);
               stmt.setShort(29, ((Number) parms[28]).shortValue());
               stmt.setString(30, (String)parms[29], 4);
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[31]).shortValue());
               }
               stmt.setShort(32, ((Number) parms[32]).shortValue());
               stmt.setShort(33, ((Number) parms[33]).shortValue());
               stmt.setShort(34, ((Number) parms[34]).shortValue());
               stmt.setShort(35, ((Number) parms[35]).shortValue());
               stmt.setShort(36, ((Number) parms[36]).shortValue());
               stmt.setByte(37, ((Number) parms[37]).byteValue());
               stmt.setBigDecimal(38, (java.math.BigDecimal)parms[38], 2);
               stmt.setBigDecimal(39, (java.math.BigDecimal)parms[39], 2);
               stmt.setShort(40, ((Number) parms[40]).shortValue());
               stmt.setShort(41, ((Number) parms[41]).shortValue());
               stmt.setShort(42, ((Number) parms[42]).shortValue());
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[44], 13);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(44, ((Number) parms[46]).intValue());
               }
               stmt.setString(45, (String)parms[47], 13);
               stmt.setInt(46, ((Number) parms[48]).intValue());
               stmt.setBigDecimal(47, (java.math.BigDecimal)parms[49], 2);
               stmt.setBigDecimal(48, (java.math.BigDecimal)parms[50], 2);
               stmt.setString(49, (String)parms[51], 1);
               stmt.setShort(50, ((Number) parms[52]).shortValue());
               stmt.setBigDecimal(51, (java.math.BigDecimal)parms[53], 2);
               stmt.setString(52, (String)parms[54], 1);
               stmt.setShort(53, ((Number) parms[55]).shortValue());
               stmt.setString(54, (String)parms[56], 10);
               stmt.setShort(55, ((Number) parms[57]).shortValue());
               stmt.setShort(56, ((Number) parms[58]).shortValue());
               stmt.setBigDecimal(57, (java.math.BigDecimal)parms[59], 2);
               stmt.setBigDecimal(58, (java.math.BigDecimal)parms[60], 2);
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(59, (String)parms[62], 1);
               }
               stmt.setInt(60, ((Number) parms[63]).intValue());
               stmt.setBigDecimal(61, (java.math.BigDecimal)parms[64], 2);
               stmt.setBigDecimal(62, (java.math.BigDecimal)parms[65], 2);
               stmt.setString(63, (String)parms[66], 30);
               stmt.setShort(64, ((Number) parms[67]).shortValue());
               stmt.setShort(65, ((Number) parms[68]).shortValue());
               stmt.setShort(66, ((Number) parms[69]).shortValue());
               stmt.setShort(67, ((Number) parms[70]).shortValue());
               stmt.setShort(68, ((Number) parms[71]).shortValue());
               stmt.setShort(69, ((Number) parms[72]).shortValue());
               stmt.setString(70, (String)parms[73], 1);
               stmt.setShort(71, ((Number) parms[74]).shortValue());
               stmt.setShort(72, ((Number) parms[75]).shortValue());
               stmt.setString(73, (String)parms[76], 10);
               stmt.setString(74, (String)parms[77], 13);
               stmt.setString(75, (String)parms[78], 4);
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(76, ((Number) parms[80]).intValue());
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(77, (java.util.Date)parms[82], true);
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(78, ((Number) parms[84]).intValue());
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(79, (java.util.Date)parms[86], true);
               }
               stmt.setString(80, (String)parms[87], 1);
               stmt.setString(81, (String)parms[88], 1);
               stmt.setString(82, (String)parms[89], 1);
               stmt.setString(83, (String)parms[90], 1);
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(84, ((Number) parms[92]).byteValue());
               }
               stmt.setString(85, (String)parms[93], 40);
               stmt.setString(86, (String)parms[94], 1);
               stmt.setString(87, (String)parms[95], 20);
               stmt.setString(88, (String)parms[96], 20);
               stmt.setString(89, (String)parms[97], 20);
               stmt.setString(90, (String)parms[98], 12);
               stmt.setByte(91, ((Number) parms[99]).byteValue());
               stmt.setString(92, (String)parms[100], 1);
               stmt.setString(93, (String)parms[101], 1);
               stmt.setString(94, (String)parms[102], 2);
               stmt.setString(95, (String)parms[103], 1);
               stmt.setString(96, (String)parms[104], 1);
               stmt.setString(97, (String)parms[105], 30);
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 98 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(98, (String)parms[107], 1);
               }
               stmt.setByte(99, ((Number) parms[108]).byteValue());
               stmt.setString(100, (String)parms[109], 3);
               stmt.setInt(101, ((Number) parms[110]).intValue());
               if ( ((Boolean) parms[111]).booleanValue() )
               {
                  stmt.setNull( 102 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(102, (String)parms[112], 6);
               }
               if ( ((Boolean) parms[113]).booleanValue() )
               {
                  stmt.setNull( 103 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(103, ((Number) parms[114]).byteValue());
               }
               if ( ((Boolean) parms[115]).booleanValue() )
               {
                  stmt.setNull( 104 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(104, (String)parms[116], 4);
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setString(7, (String)parms[6], 26);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 10);
               stmt.setString(10, (String)parms[9], 6);
               stmt.setString(11, (String)parms[10], 6);
               stmt.setString(12, (String)parms[11], 10);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setString(14, (String)parms[13], 1);
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 2);
               stmt.setString(17, (String)parms[16], 4);
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setString(19, (String)parms[18], 4);
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setString(21, (String)parms[20], 4);
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[22], 2);
               stmt.setByte(24, ((Number) parms[23]).byteValue());
               stmt.setString(25, (String)parms[24], 4);
               stmt.setShort(26, ((Number) parms[25]).shortValue());
               stmt.setString(27, (String)parms[26], 4);
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               stmt.setString(29, (String)parms[28], 4);
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[30]).shortValue());
               }
               stmt.setShort(31, ((Number) parms[31]).shortValue());
               stmt.setShort(32, ((Number) parms[32]).shortValue());
               stmt.setShort(33, ((Number) parms[33]).shortValue());
               stmt.setShort(34, ((Number) parms[34]).shortValue());
               stmt.setShort(35, ((Number) parms[35]).shortValue());
               stmt.setByte(36, ((Number) parms[36]).byteValue());
               stmt.setBigDecimal(37, (java.math.BigDecimal)parms[37], 2);
               stmt.setBigDecimal(38, (java.math.BigDecimal)parms[38], 2);
               stmt.setShort(39, ((Number) parms[39]).shortValue());
               stmt.setShort(40, ((Number) parms[40]).shortValue());
               stmt.setShort(41, ((Number) parms[41]).shortValue());
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[43], 13);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(43, ((Number) parms[45]).intValue());
               }
               stmt.setString(44, (String)parms[46], 13);
               stmt.setInt(45, ((Number) parms[47]).intValue());
               stmt.setBigDecimal(46, (java.math.BigDecimal)parms[48], 2);
               stmt.setBigDecimal(47, (java.math.BigDecimal)parms[49], 2);
               stmt.setString(48, (String)parms[50], 1);
               stmt.setShort(49, ((Number) parms[51]).shortValue());
               stmt.setBigDecimal(50, (java.math.BigDecimal)parms[52], 2);
               stmt.setString(51, (String)parms[53], 1);
               stmt.setShort(52, ((Number) parms[54]).shortValue());
               stmt.setString(53, (String)parms[55], 10);
               stmt.setShort(54, ((Number) parms[56]).shortValue());
               stmt.setShort(55, ((Number) parms[57]).shortValue());
               stmt.setBigDecimal(56, (java.math.BigDecimal)parms[58], 2);
               stmt.setBigDecimal(57, (java.math.BigDecimal)parms[59], 2);
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(58, (String)parms[61], 1);
               }
               stmt.setInt(59, ((Number) parms[62]).intValue());
               stmt.setBigDecimal(60, (java.math.BigDecimal)parms[63], 2);
               stmt.setBigDecimal(61, (java.math.BigDecimal)parms[64], 2);
               stmt.setString(62, (String)parms[65], 30);
               stmt.setShort(63, ((Number) parms[66]).shortValue());
               stmt.setShort(64, ((Number) parms[67]).shortValue());
               stmt.setShort(65, ((Number) parms[68]).shortValue());
               stmt.setShort(66, ((Number) parms[69]).shortValue());
               stmt.setShort(67, ((Number) parms[70]).shortValue());
               stmt.setShort(68, ((Number) parms[71]).shortValue());
               stmt.setString(69, (String)parms[72], 1);
               stmt.setShort(70, ((Number) parms[73]).shortValue());
               stmt.setShort(71, ((Number) parms[74]).shortValue());
               stmt.setString(72, (String)parms[75], 10);
               stmt.setString(73, (String)parms[76], 13);
               stmt.setString(74, (String)parms[77], 4);
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(75, ((Number) parms[79]).intValue());
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(76, (java.util.Date)parms[81], true);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(77, ((Number) parms[83]).intValue());
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(78, (java.util.Date)parms[85], true);
               }
               stmt.setString(79, (String)parms[86], 1);
               stmt.setString(80, (String)parms[87], 1);
               stmt.setString(81, (String)parms[88], 1);
               stmt.setString(82, (String)parms[89], 1);
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 83 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(83, ((Number) parms[91]).byteValue());
               }
               stmt.setString(84, (String)parms[92], 40);
               stmt.setString(85, (String)parms[93], 1);
               stmt.setString(86, (String)parms[94], 20);
               stmt.setString(87, (String)parms[95], 20);
               stmt.setString(88, (String)parms[96], 20);
               stmt.setString(89, (String)parms[97], 12);
               stmt.setByte(90, ((Number) parms[98]).byteValue());
               stmt.setString(91, (String)parms[99], 1);
               stmt.setString(92, (String)parms[100], 1);
               stmt.setString(93, (String)parms[101], 2);
               stmt.setString(94, (String)parms[102], 1);
               stmt.setString(95, (String)parms[103], 1);
               stmt.setString(96, (String)parms[104], 30);
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 97 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(97, (String)parms[106], 1);
               }
               stmt.setByte(98, ((Number) parms[107]).byteValue());
               stmt.setInt(99, ((Number) parms[108]).intValue());
               if ( ((Boolean) parms[109]).booleanValue() )
               {
                  stmt.setNull( 100 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(100, (String)parms[110], 6);
               }
               if ( ((Boolean) parms[111]).booleanValue() )
               {
                  stmt.setNull( 101 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(101, ((Number) parms[112]).byteValue());
               }
               if ( ((Boolean) parms[113]).booleanValue() )
               {
                  stmt.setNull( 102 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(102, (String)parms[114], 4);
               }
               stmt.setString(103, (String)parms[115], 3);
               stmt.setInt(104, ((Number) parms[116]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
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
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 47 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 52 :
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
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

