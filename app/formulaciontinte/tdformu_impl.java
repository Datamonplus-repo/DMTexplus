package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdformu_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6310Lb_TaAuxC = httpContext.GetPar( "Lb_TaAuxC") ;
         n6310Lb_TaAuxC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         A6369Lb_fam1 = (byte)(GXutil.lval( httpContext.GetPar( "Lb_fam1"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6369Lb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6369Lb_fam1), 2, 0));
         A6370Lb_fam2 = (byte)(GXutil.lval( httpContext.GetPar( "Lb_fam2"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6370Lb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6370Lb_fam2), 2, 0));
         A6371Lb_fam3 = (byte)(GXutil.lval( httpContext.GetPar( "Lb_fam3"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6371Lb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6371Lb_fam3), 2, 0));
         AV80ComboLb_TaAuxC = httpContext.GetPar( "ComboLb_TaAuxC") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80ComboLb_TaAuxC", AV80ComboLb_TaAuxC);
         AV47prdaux = (byte)(GXutil.lval( httpContext.GetPar( "prdaux"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47prdaux", GXutil.str( AV47prdaux, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDAUX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV47prdaux), "9")));
         AV53TaauxcOld = httpContext.GetPar( "TaauxcOld") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53TaauxcOld", AV53TaauxcOld);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_24_0Q32( A396EmprCod, A6310Lb_TaAuxC, A6369Lb_fam1, A6370Lb_fam2, A6371Lb_fam3, AV80ComboLb_TaAuxC, AV47prdaux, AV53TaauxcOld) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action42") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV98Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98Pgmname", AV98Pgmname);
         AV23UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
         AV27Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Station", AV27Station);
         AV40Texto_i = httpContext.GetPar( "Texto_i") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Texto_i", AV40Texto_i);
         A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_42_0Q33( A396EmprCod, AV98Pgmname, AV23UsurCod, AV27Station, AV40Texto_i, A486ForNumCol, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action43") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV98Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98Pgmname", AV98Pgmname);
         AV23UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
         AV27Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Station", AV27Station);
         AV40Texto_i = httpContext.GetPar( "Texto_i") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Texto_i", AV40Texto_i);
         A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_43_0Q33( A396EmprCod, AV98Pgmname, AV23UsurCod, AV27Station, AV40Texto_i, A486ForNumCol, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action44") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV98Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98Pgmname", AV98Pgmname);
         AV23UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
         AV27Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Station", AV27Station);
         AV40Texto_i = httpContext.GetPar( "Texto_i") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Texto_i", AV40Texto_i);
         A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_44_0Q33( A396EmprCod, AV98Pgmname, AV23UsurCod, AV27Station, AV40Texto_i, A486ForNumCol, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_47") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6310Lb_TaAuxC = httpContext.GetPar( "Lb_TaAuxC") ;
         n6310Lb_TaAuxC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_47( A396EmprCod, A6310Lb_TaAuxC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_49") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_49( A396EmprCod, A486ForNumCol) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_50") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_50( A396EmprCod, A486ForNumCol) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_53") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_53( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_54") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_54( A396EmprCod, A490ForPrdUMe) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_52") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A309ColLin = (short)(GXutil.lval( httpContext.GetPar( "ColLin"))) ;
         A6222ColLinV = (short)(GXutil.lval( httpContext.GetPar( "ColLinV"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6222ColLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6222ColLinV), 3, 0));
         A6220EmprCodV3 = httpContext.GetPar( "EmprCodV3") ;
         httpContext.ajax_rsp_assign_attri("", false, "A6220EmprCodV3", A6220EmprCodV3);
         A6221ForNumColV = (int)(GXutil.lval( httpContext.GetPar( "ForNumColV"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6221ForNumColV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6221ForNumColV), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_52( A396EmprCod, A486ForNumCol, A309ColLin, A6222ColLinV, A6220EmprCodV3, A6221ForNumColV) ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_level1") == 0 )
      {
         gxnrgridlevel_level1_newrow_invoke( ) ;
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
         Gx_mode = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV31EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31EmprCod", AV31EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31EmprCod, "@!"))));
            AV61ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61ForNumCol), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61ForNumCol), "ZZZZZZZ9")));
            AV67ContNum = (int)(GXutil.lval( httpContext.GetPar( "ContNum"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67ContNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67ContNum), 9, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67ContNum), "ZZZZZZZZ9")));
            AV29FlagMod = (byte)(GXutil.lval( httpContext.GetPar( "FlagMod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29FlagMod", GXutil.str( AV29FlagMod, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGMOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29FlagMod), "9")));
            AV32ForOpcCli = httpContext.GetPar( "ForOpcCli") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32ForOpcCli", AV32ForOpcCli);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFOROPCCLI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32ForOpcCli, "@!"))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Colorantes", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtLb_TaAuxC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_level1_newrow_invoke( )
   {
      nRC_GXsfl_103 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_103"))) ;
      nGXsfl_103_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_103_idx"))) ;
      sGXsfl_103_idx = httpContext.GetPar( "sGXsfl_103_idx") ;
      A310ColUltLin = (short)(GXutil.lval( httpContext.GetPar( "ColUltLin"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public tdformu_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdformu_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdformu_impl.class ));
   }

   public tdformu_impl( int remoteHandle ,
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainTransaction", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      ClassString = "ErrorViewer" ;
      StyleString = "" ;
      app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_tableattributes.setProperty("Width", Dvpanel_tableattributes_Width);
      ucDvpanel_tableattributes.setProperty("AutoWidth", Dvpanel_tableattributes_Autowidth);
      ucDvpanel_tableattributes.setProperty("AutoHeight", Dvpanel_tableattributes_Autoheight);
      ucDvpanel_tableattributes.setProperty("Cls", Dvpanel_tableattributes_Cls);
      ucDvpanel_tableattributes.setProperty("Title", Dvpanel_tableattributes_Title);
      ucDvpanel_tableattributes.setProperty("Collapsible", Dvpanel_tableattributes_Collapsible);
      ucDvpanel_tableattributes.setProperty("Collapsed", Dvpanel_tableattributes_Collapsed);
      ucDvpanel_tableattributes.setProperty("ShowCollapseIcon", Dvpanel_tableattributes_Showcollapseicon);
      ucDvpanel_tableattributes.setProperty("IconPosition", Dvpanel_tableattributes_Iconposition);
      ucDvpanel_tableattributes.setProperty("AutoScroll", Dvpanel_tableattributes_Autoscroll);
      ucDvpanel_tableattributes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableattributes_Internalname, "DVPANEL_TABLEATTRIBUTESContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEATTRIBUTESContainer"+"TableAttributes"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForNumCol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForNumCol_Internalname, httpContext.getMessage( "Nº Interno", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForNumCol_Internalname, GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForNumCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNumCol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForNumCol_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCosKgmF_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCosKgmF_Internalname, httpContext.getMessage( "Coste/kg", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCosKgmF_Internalname, GXutil.ltrim( localUtil.ntoc( A5166CosKgmF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCosKgmF_Enabled!=0) ? localUtil.format( A5166CosKgmF, "ZZZZZZ9.99999") : localUtil.format( A5166CosKgmF, "ZZZZZZ9.99999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCosKgmF_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCosKgmF_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable2_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable2_cell_Class, "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
      ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
      ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
      ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
      ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
      ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
      ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
      ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
      ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
      ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
      ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedlb_taauxc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklb_taauxc_Internalname, httpContext.getMessage( "Tabla Productos", ""), "", "", lblTextblocklb_taauxc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_lb_taauxc.setProperty("Caption", Combo_lb_taauxc_Caption);
      ucCombo_lb_taauxc.setProperty("Cls", Combo_lb_taauxc_Cls);
      ucCombo_lb_taauxc.setProperty("EmptyItem", Combo_lb_taauxc_Emptyitem);
      ucCombo_lb_taauxc.setProperty("DropDownOptionsData", AV79Lb_TaAuxC_Data);
      ucCombo_lb_taauxc.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_lb_taauxc_Internalname, "COMBO_LB_TAAUXCContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_TaAuxC_Internalname, httpContext.getMessage( "Codigo Tabla Auxiliares", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_TaAuxC_Internalname, GXutil.rtrim( A6310Lb_TaAuxC), GXutil.rtrim( localUtil.format( A6310Lb_TaAuxC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_TaAuxC_Jsonclick, 0, "Attribute", "", "", "", "", edtLb_TaAuxC_Visible, edtLb_TaAuxC_Enabled, 1, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedlb_fam1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklb_fam1_Internalname, httpContext.getMessage( "Familia (1)", ""), "", "", lblTextblocklb_fam1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_lb_fam1.setProperty("Caption", Combo_lb_fam1_Caption);
      ucCombo_lb_fam1.setProperty("Cls", Combo_lb_fam1_Cls);
      ucCombo_lb_fam1.setProperty("EmptyItem", Combo_lb_fam1_Emptyitem);
      ucCombo_lb_fam1.setProperty("DropDownOptionsData", AV76Lb_fam1_Data);
      ucCombo_lb_fam1.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_lb_fam1_Internalname, "COMBO_LB_FAM1Container");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_fam1_Internalname, httpContext.getMessage( "Familia C 1", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_fam1_Internalname, GXutil.ltrim( localUtil.ntoc( A6369Lb_fam1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_fam1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6369Lb_fam1), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6369Lb_fam1), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_fam1_Jsonclick, 0, "Attribute", "", "", "", "", edtLb_fam1_Visible, edtLb_fam1_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedlb_fam2_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklb_fam2_Internalname, httpContext.getMessage( "Familia (2)", ""), "", "", lblTextblocklb_fam2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_lb_fam2.setProperty("Caption", Combo_lb_fam2_Caption);
      ucCombo_lb_fam2.setProperty("Cls", Combo_lb_fam2_Cls);
      ucCombo_lb_fam2.setProperty("EmptyItem", Combo_lb_fam2_Emptyitem);
      ucCombo_lb_fam2.setProperty("DropDownOptionsData", AV83Lb_fam2_Data);
      ucCombo_lb_fam2.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_lb_fam2_Internalname, "COMBO_LB_FAM2Container");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_fam2_Internalname, httpContext.getMessage( "Familia C 2", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_fam2_Internalname, GXutil.ltrim( localUtil.ntoc( A6370Lb_fam2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_fam2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6370Lb_fam2), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6370Lb_fam2), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_fam2_Jsonclick, 0, "Attribute", "", "", "", "", edtLb_fam2_Visible, edtLb_fam2_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedlb_fam3_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocklb_fam3_Internalname, httpContext.getMessage( "Familia (3)", ""), "", "", lblTextblocklb_fam3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_lb_fam3.setProperty("Caption", Combo_lb_fam3_Caption);
      ucCombo_lb_fam3.setProperty("Cls", Combo_lb_fam3_Cls);
      ucCombo_lb_fam3.setProperty("EmptyItem", Combo_lb_fam3_Emptyitem);
      ucCombo_lb_fam3.setProperty("DropDownOptionsData", AV85Lb_fam3_Data);
      ucCombo_lb_fam3.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_lb_fam3_Internalname, "COMBO_LB_FAM3Container");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_fam3_Internalname, httpContext.getMessage( "Familia C 3", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_fam3_Internalname, GXutil.ltrim( localUtil.ntoc( A6371Lb_fam3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_fam3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6371Lb_fam3), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6371Lb_fam3), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_fam3_Jsonclick, 0, "Attribute", "", "", "", "", edtLb_fam3_Visible, edtLb_fam3_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "Center", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTittxt_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavTittxt_Internalname, AV55TitTxt, GXutil.rtrim( localUtil.format( AV55TitTxt, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTittxt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTittxt_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "center", true, "", "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Right", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrenumerar_Internalname, "", httpContext.getMessage( "Renumerar (#)", ""), bttBtnrenumerar_Jsonclick, 7, httpContext.getMessage( "Renumerar (#)", ""), "", StyleString, ClassString, bttBtnrenumerar_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e110q32_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_level1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_level1( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop15", "Center", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForCanSum_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForCanSum_Internalname, GXutil.ltrim( localUtil.ntoc( A5361ForCanSum, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForCanSum_Enabled!=0) ? localUtil.format( A5361ForCanSum, "ZZZZ9.99999") : localUtil.format( A5361ForCanSum, "ZZZZ9.99999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForCanSum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForCanSum_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", divUnnamedtable1_Height, "px", "", "left", "top", "", "", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV98Pgmname), GXutil.rtrim( localUtil.format( AV98Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_lb_taauxc_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombolb_taauxc_Internalname, GXutil.rtrim( AV80ComboLb_TaAuxC), GXutil.rtrim( localUtil.format( AV80ComboLb_TaAuxC, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombolb_taauxc_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombolb_taauxc_Visible, edtavCombolb_taauxc_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_lb_fam1_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombolb_fam1_Internalname, GXutil.ltrim( localUtil.ntoc( AV78ComboLb_fam1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombolb_fam1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV78ComboLb_fam1), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV78ComboLb_fam1), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombolb_fam1_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombolb_fam1_Visible, edtavCombolb_fam1_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_lb_fam2_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombolb_fam2_Internalname, GXutil.ltrim( localUtil.ntoc( AV84ComboLb_fam2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombolb_fam2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV84ComboLb_fam2), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV84ComboLb_fam2), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombolb_fam2_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombolb_fam2_Visible, edtavCombolb_fam2_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_lb_fam3_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombolb_fam3_Internalname, GXutil.ltrim( localUtil.ntoc( AV86ComboLb_fam3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombolb_fam3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV86ComboLb_fam3), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV86ComboLb_fam3), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombolb_fam3_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombolb_fam3_Visible, edtavCombolb_fam3_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\TDFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* User Defined Control */
      ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
      ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
      ucCombo_prdnum.setProperty("IsGridItem", Combo_prdnum_Isgriditem);
      ucCombo_prdnum.setProperty("EmptyItem", Combo_prdnum_Emptyitem);
      ucCombo_prdnum.setProperty("DropDownOptionsData", AV81PrdNum_Data);
      ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_renumerar_Internalname, tblTabledvelop_confirmpanel_renumerar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
      /* User Defined Control */
      ucDvelop_confirmpanel_renumerar.setProperty("Title", Dvelop_confirmpanel_renumerar_Title);
      ucDvelop_confirmpanel_renumerar.setProperty("ConfirmationText", Dvelop_confirmpanel_renumerar_Confirmationtext);
      ucDvelop_confirmpanel_renumerar.setProperty("YesButtonCaption", Dvelop_confirmpanel_renumerar_Yesbuttoncaption);
      ucDvelop_confirmpanel_renumerar.setProperty("NoButtonCaption", Dvelop_confirmpanel_renumerar_Nobuttoncaption);
      ucDvelop_confirmpanel_renumerar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_renumerar_Cancelbuttoncaption);
      ucDvelop_confirmpanel_renumerar.setProperty("YesButtonPosition", Dvelop_confirmpanel_renumerar_Yesbuttonposition);
      ucDvelop_confirmpanel_renumerar.setProperty("ConfirmType", Dvelop_confirmpanel_renumerar_Confirmtype);
      ucDvelop_confirmpanel_renumerar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_renumerar_Internalname, "DVELOP_CONFIRMPANEL_RENUMERARContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_RENUMERARContainer"+"Body"+"\" style=\"display:none;\">") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol103( ) ;
      nGXsfl_103_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount33 = (short)(2) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_33 = (short)(1) ;
            scanStart0Q33( ) ;
            while ( RcdFound33 != 0 )
            {
               init_level_properties33( ) ;
               getByPrimaryKey0Q33( ) ;
               addRow0Q33( ) ;
               scanNext0Q33( ) ;
            }
            scanEnd0Q33( ) ;
            nBlankRcdCount33 = (short)(2) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B310ColUltLin = A310ColUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
         B5166CosKgmF = A5166CosKgmF ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         B5361ForCanSum = A5361ForCanSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         B6310Lb_TaAuxC = A6310Lb_TaAuxC ;
         n6310Lb_TaAuxC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         standaloneNotModal0Q33( ) ;
         standaloneModal0Q33( ) ;
         sMode33 = Gx_mode ;
         while ( nGXsfl_103_idx < nRC_GXsfl_103 )
         {
            bGXsfl_103_Refreshing = true ;
            readRow0Q33( ) ;
            edtColLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLLIN_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColLin_Enabled), 5, 0), !bGXsfl_103_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_103_Refreshing);
            edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_103_Refreshing);
            edtValCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VALCOD_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtValCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValCod_Enabled), 5, 0), !bGXsfl_103_Refreshing);
            edtPrdPreAct_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPREACT_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), !bGXsfl_103_Refreshing);
            edtForCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORCAN_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForCan_Enabled), 5, 0), !bGXsfl_103_Refreshing);
            edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_103_Refreshing);
            edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_103_Refreshing);
            edtPrdRGB_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDRGB_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdRGB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRGB_Enabled), 5, 0), !bGXsfl_103_Refreshing);
            edtavPrdrgb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vPRDRGB_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavPrdrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdrgb_Enabled), 5, 0), !bGXsfl_103_Refreshing);
            edtavR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vR_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_103_Refreshing);
            edtavG_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vG_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_103_Refreshing);
            edtavB_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vB_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_103_Refreshing);
            edtavR2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vR2_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_103_Refreshing);
            edtavG2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vG2_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_103_Refreshing);
            edtavB2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vB2_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_103_Refreshing);
            edtColFibra_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLFIBRA_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtColFibra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColFibra_Enabled), 5, 0), !bGXsfl_103_Refreshing);
            imgprompt_490_Link = httpContext.cgiGet( "PROMPT_490_"+sGXsfl_103_idx+"Link") ;
            if ( ( nRcdExists_33 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal0Q33( ) ;
            }
            sendRow0Q33( ) ;
            bGXsfl_103_Refreshing = false ;
         }
         Gx_mode = sMode33 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A310ColUltLin = B310ColUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
         A5166CosKgmF = B5166CosKgmF ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         A5361ForCanSum = B5361ForCanSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         A6310Lb_TaAuxC = B6310Lb_TaAuxC ;
         n6310Lb_TaAuxC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount33 = (short)(2) ;
         nRcdExists_33 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart0Q33( ) ;
            while ( RcdFound33 != 0 )
            {
               sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_10333( ) ;
               init_level_properties33( ) ;
               standaloneNotModal0Q33( ) ;
               getByPrimaryKey0Q33( ) ;
               standaloneModal0Q33( ) ;
               addRow0Q33( ) ;
               scanNext0Q33( ) ;
            }
            scanEnd0Q33( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode33 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_10333( ) ;
         initAll0Q33( ) ;
         init_level_properties33( ) ;
         B310ColUltLin = A310ColUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
         B5166CosKgmF = A5166CosKgmF ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         B5361ForCanSum = A5361ForCanSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         B6310Lb_TaAuxC = A6310Lb_TaAuxC ;
         n6310Lb_TaAuxC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         nRcdExists_33 = (short)(0) ;
         nIsMod_33 = (short)(0) ;
         nRcdDeleted_33 = (short)(0) ;
         nBlankRcdCount33 = (short)(nBlankRcdUsr33+nBlankRcdCount33) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount33 > 0 )
         {
            standaloneNotModal0Q33( ) ;
            standaloneModal0Q33( ) ;
            addRow0Q33( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtColLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount33 = (short)(nBlankRcdCount33-1) ;
         }
         Gx_mode = sMode33 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A310ColUltLin = B310ColUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
         A5166CosKgmF = B5166CosKgmF ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         A5361ForCanSum = B5361ForCanSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         A6310Lb_TaAuxC = B6310Lb_TaAuxC ;
         n6310Lb_TaAuxC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_level1Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_level1", Gridlevel_level1Container, subGridlevel_level1_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData", Gridlevel_level1Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData"+"V", Gridlevel_level1Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_level1ContainerData"+"V"+"\" value='"+Gridlevel_level1Container.GridValuesHidden()+"'/>") ;
      }
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
      e120Q2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLB_TAAUXC_DATA"), AV79Lb_TaAuxC_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLB_FAM1_DATA"), AV76Lb_fam1_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLB_FAM2_DATA"), AV83Lb_fam2_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLB_FAM3_DATA"), AV85Lb_fam3_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV81PrdNum_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( "Z486ForNumCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6369Lb_fam1 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6369Lb_fam1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6370Lb_fam2 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6370Lb_fam2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6371Lb_fam3 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6371Lb_fam3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z310ColUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z310ColUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z315ContNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z315ContNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z318CosKgm = localUtil.ctond( httpContext.cgiGet( "Z318CosKgm")) ;
            Z6310Lb_TaAuxC = httpContext.cgiGet( "Z6310Lb_TaAuxC") ;
            A310ColUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z310ColUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A315ContNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z315ContNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A318CosKgm = localUtil.ctond( httpContext.cgiGet( "Z318CosKgm")) ;
            O310ColUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "O310ColUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O5166CosKgmF = localUtil.ctond( httpContext.cgiGet( "O5166CosKgmF")) ;
            O5361ForCanSum = localUtil.ctond( httpContext.cgiGet( "O5361ForCanSum")) ;
            O6310Lb_TaAuxC = httpContext.cgiGet( "O6310Lb_TaAuxC") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_103 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_103"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N6310Lb_TaAuxC = httpContext.cgiGet( "N6310Lb_TaAuxC") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A6220EmprCodV3 = httpContext.cgiGet( "EMPRCODV3") ;
            A6221ForNumColV = (int)(localUtil.ctol( httpContext.cgiGet( "FORNUMCOLV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV31EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV61ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( "vFORNUMCOL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV65Insert_Lb_TaAuxC = httpContext.cgiGet( "vINSERT_LB_TAAUXC") ;
            AV53TaauxcOld = httpContext.cgiGet( "vTAAUXCOLD") ;
            A310ColUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "COLULTLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A315ContNum = (int)(localUtil.ctol( httpContext.cgiGet( "CONTNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A318CosKgm = localUtil.ctond( httpContext.cgiGet( "COSKGM")) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( "EMPNUMDEC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3915EmpNumDec = false ;
            A6311Lb_TaAuxD = httpContext.cgiGet( "LB_TAAUXD") ;
            A7259PrdHorMax = (byte)(localUtil.ctol( httpContext.cgiGet( "PRDHORMAX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7259PrdHorMax = false ;
            A13757ColLinMax = (short)(localUtil.ctol( httpContext.cgiGet( "COLLINMAX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6222ColLinV = (short)(localUtil.ctol( httpContext.cgiGet( "COLLINV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( "PRDFACCON")) ;
            A5167TotLinCoF = localUtil.ctond( httpContext.cgiGet( "TOTLINCOF")) ;
            A4338PrdUMeFo = (byte)(localUtil.ctol( httpContext.cgiGet( "PRDUMEFO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV40Texto_i = httpContext.cgiGet( "vTEXTO_I") ;
            AV23UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV27Station = httpContext.cgiGet( "vSTATION") ;
            A838TotLinCol = localUtil.ctond( httpContext.cgiGet( "TOTLINCOL")) ;
            A6193ForClaCol = httpContext.cgiGet( "FORCLACOL") ;
            A6223PrdNumMax = httpContext.cgiGet( "PRDNUMMAX") ;
            n6223PrdNumMax = false ;
            A7260PrdHorMad = (byte)(localUtil.ctol( httpContext.cgiGet( "PRDHORMAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_tableattributes_Objectcall = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Objectcall") ;
            Dvpanel_tableattributes_Class = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Class") ;
            Dvpanel_tableattributes_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Enabled")) ;
            Dvpanel_tableattributes_Width = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Width") ;
            Dvpanel_tableattributes_Height = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Height") ;
            Dvpanel_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autowidth")) ;
            Dvpanel_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoheight")) ;
            Dvpanel_tableattributes_Cls = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Cls") ;
            Dvpanel_tableattributes_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showheader")) ;
            Dvpanel_tableattributes_Title = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Title") ;
            Dvpanel_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsible")) ;
            Dvpanel_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsed")) ;
            Dvpanel_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showcollapseicon")) ;
            Dvpanel_tableattributes_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Iconposition") ;
            Dvpanel_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoscroll")) ;
            Dvpanel_tableattributes_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Visible")) ;
            Dvpanel_tableattributes_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_lb_taauxc_Objectcall = httpContext.cgiGet( "COMBO_LB_TAAUXC_Objectcall") ;
            Combo_lb_taauxc_Class = httpContext.cgiGet( "COMBO_LB_TAAUXC_Class") ;
            Combo_lb_taauxc_Icontype = httpContext.cgiGet( "COMBO_LB_TAAUXC_Icontype") ;
            Combo_lb_taauxc_Icon = httpContext.cgiGet( "COMBO_LB_TAAUXC_Icon") ;
            Combo_lb_taauxc_Caption = httpContext.cgiGet( "COMBO_LB_TAAUXC_Caption") ;
            Combo_lb_taauxc_Tooltip = httpContext.cgiGet( "COMBO_LB_TAAUXC_Tooltip") ;
            Combo_lb_taauxc_Cls = httpContext.cgiGet( "COMBO_LB_TAAUXC_Cls") ;
            Combo_lb_taauxc_Selectedvalue_set = httpContext.cgiGet( "COMBO_LB_TAAUXC_Selectedvalue_set") ;
            Combo_lb_taauxc_Selectedvalue_get = httpContext.cgiGet( "COMBO_LB_TAAUXC_Selectedvalue_get") ;
            Combo_lb_taauxc_Selectedtext_set = httpContext.cgiGet( "COMBO_LB_TAAUXC_Selectedtext_set") ;
            Combo_lb_taauxc_Selectedtext_get = httpContext.cgiGet( "COMBO_LB_TAAUXC_Selectedtext_get") ;
            Combo_lb_taauxc_Gamoauthtoken = httpContext.cgiGet( "COMBO_LB_TAAUXC_Gamoauthtoken") ;
            Combo_lb_taauxc_Ddointernalname = httpContext.cgiGet( "COMBO_LB_TAAUXC_Ddointernalname") ;
            Combo_lb_taauxc_Titlecontrolalign = httpContext.cgiGet( "COMBO_LB_TAAUXC_Titlecontrolalign") ;
            Combo_lb_taauxc_Dropdownoptionstype = httpContext.cgiGet( "COMBO_LB_TAAUXC_Dropdownoptionstype") ;
            Combo_lb_taauxc_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXC_Enabled")) ;
            Combo_lb_taauxc_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXC_Visible")) ;
            Combo_lb_taauxc_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_LB_TAAUXC_Titlecontrolidtoreplace") ;
            Combo_lb_taauxc_Datalisttype = httpContext.cgiGet( "COMBO_LB_TAAUXC_Datalisttype") ;
            Combo_lb_taauxc_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXC_Allowmultipleselection")) ;
            Combo_lb_taauxc_Datalistfixedvalues = httpContext.cgiGet( "COMBO_LB_TAAUXC_Datalistfixedvalues") ;
            Combo_lb_taauxc_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXC_Isgriditem")) ;
            Combo_lb_taauxc_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXC_Hasdescription")) ;
            Combo_lb_taauxc_Datalistproc = httpContext.cgiGet( "COMBO_LB_TAAUXC_Datalistproc") ;
            Combo_lb_taauxc_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_LB_TAAUXC_Datalistprocparametersprefix") ;
            Combo_lb_taauxc_Remoteservicesparameters = httpContext.cgiGet( "COMBO_LB_TAAUXC_Remoteservicesparameters") ;
            Combo_lb_taauxc_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LB_TAAUXC_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_lb_taauxc_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXC_Includeonlyselectedoption")) ;
            Combo_lb_taauxc_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXC_Includeselectalloption")) ;
            Combo_lb_taauxc_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXC_Emptyitem")) ;
            Combo_lb_taauxc_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_TAAUXC_Includeaddnewoption")) ;
            Combo_lb_taauxc_Htmltemplate = httpContext.cgiGet( "COMBO_LB_TAAUXC_Htmltemplate") ;
            Combo_lb_taauxc_Multiplevaluestype = httpContext.cgiGet( "COMBO_LB_TAAUXC_Multiplevaluestype") ;
            Combo_lb_taauxc_Loadingdata = httpContext.cgiGet( "COMBO_LB_TAAUXC_Loadingdata") ;
            Combo_lb_taauxc_Noresultsfound = httpContext.cgiGet( "COMBO_LB_TAAUXC_Noresultsfound") ;
            Combo_lb_taauxc_Emptyitemtext = httpContext.cgiGet( "COMBO_LB_TAAUXC_Emptyitemtext") ;
            Combo_lb_taauxc_Onlyselectedvalues = httpContext.cgiGet( "COMBO_LB_TAAUXC_Onlyselectedvalues") ;
            Combo_lb_taauxc_Selectalltext = httpContext.cgiGet( "COMBO_LB_TAAUXC_Selectalltext") ;
            Combo_lb_taauxc_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_LB_TAAUXC_Multiplevaluesseparator") ;
            Combo_lb_taauxc_Addnewoptiontext = httpContext.cgiGet( "COMBO_LB_TAAUXC_Addnewoptiontext") ;
            Combo_lb_taauxc_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LB_TAAUXC_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_lb_fam1_Objectcall = httpContext.cgiGet( "COMBO_LB_FAM1_Objectcall") ;
            Combo_lb_fam1_Class = httpContext.cgiGet( "COMBO_LB_FAM1_Class") ;
            Combo_lb_fam1_Icontype = httpContext.cgiGet( "COMBO_LB_FAM1_Icontype") ;
            Combo_lb_fam1_Icon = httpContext.cgiGet( "COMBO_LB_FAM1_Icon") ;
            Combo_lb_fam1_Caption = httpContext.cgiGet( "COMBO_LB_FAM1_Caption") ;
            Combo_lb_fam1_Tooltip = httpContext.cgiGet( "COMBO_LB_FAM1_Tooltip") ;
            Combo_lb_fam1_Cls = httpContext.cgiGet( "COMBO_LB_FAM1_Cls") ;
            Combo_lb_fam1_Selectedvalue_set = httpContext.cgiGet( "COMBO_LB_FAM1_Selectedvalue_set") ;
            Combo_lb_fam1_Selectedvalue_get = httpContext.cgiGet( "COMBO_LB_FAM1_Selectedvalue_get") ;
            Combo_lb_fam1_Selectedtext_set = httpContext.cgiGet( "COMBO_LB_FAM1_Selectedtext_set") ;
            Combo_lb_fam1_Selectedtext_get = httpContext.cgiGet( "COMBO_LB_FAM1_Selectedtext_get") ;
            Combo_lb_fam1_Gamoauthtoken = httpContext.cgiGet( "COMBO_LB_FAM1_Gamoauthtoken") ;
            Combo_lb_fam1_Ddointernalname = httpContext.cgiGet( "COMBO_LB_FAM1_Ddointernalname") ;
            Combo_lb_fam1_Titlecontrolalign = httpContext.cgiGet( "COMBO_LB_FAM1_Titlecontrolalign") ;
            Combo_lb_fam1_Dropdownoptionstype = httpContext.cgiGet( "COMBO_LB_FAM1_Dropdownoptionstype") ;
            Combo_lb_fam1_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM1_Enabled")) ;
            Combo_lb_fam1_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM1_Visible")) ;
            Combo_lb_fam1_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_LB_FAM1_Titlecontrolidtoreplace") ;
            Combo_lb_fam1_Datalisttype = httpContext.cgiGet( "COMBO_LB_FAM1_Datalisttype") ;
            Combo_lb_fam1_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM1_Allowmultipleselection")) ;
            Combo_lb_fam1_Datalistfixedvalues = httpContext.cgiGet( "COMBO_LB_FAM1_Datalistfixedvalues") ;
            Combo_lb_fam1_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM1_Isgriditem")) ;
            Combo_lb_fam1_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM1_Hasdescription")) ;
            Combo_lb_fam1_Datalistproc = httpContext.cgiGet( "COMBO_LB_FAM1_Datalistproc") ;
            Combo_lb_fam1_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_LB_FAM1_Datalistprocparametersprefix") ;
            Combo_lb_fam1_Remoteservicesparameters = httpContext.cgiGet( "COMBO_LB_FAM1_Remoteservicesparameters") ;
            Combo_lb_fam1_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LB_FAM1_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_lb_fam1_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM1_Includeonlyselectedoption")) ;
            Combo_lb_fam1_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM1_Includeselectalloption")) ;
            Combo_lb_fam1_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM1_Emptyitem")) ;
            Combo_lb_fam1_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM1_Includeaddnewoption")) ;
            Combo_lb_fam1_Htmltemplate = httpContext.cgiGet( "COMBO_LB_FAM1_Htmltemplate") ;
            Combo_lb_fam1_Multiplevaluestype = httpContext.cgiGet( "COMBO_LB_FAM1_Multiplevaluestype") ;
            Combo_lb_fam1_Loadingdata = httpContext.cgiGet( "COMBO_LB_FAM1_Loadingdata") ;
            Combo_lb_fam1_Noresultsfound = httpContext.cgiGet( "COMBO_LB_FAM1_Noresultsfound") ;
            Combo_lb_fam1_Emptyitemtext = httpContext.cgiGet( "COMBO_LB_FAM1_Emptyitemtext") ;
            Combo_lb_fam1_Onlyselectedvalues = httpContext.cgiGet( "COMBO_LB_FAM1_Onlyselectedvalues") ;
            Combo_lb_fam1_Selectalltext = httpContext.cgiGet( "COMBO_LB_FAM1_Selectalltext") ;
            Combo_lb_fam1_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_LB_FAM1_Multiplevaluesseparator") ;
            Combo_lb_fam1_Addnewoptiontext = httpContext.cgiGet( "COMBO_LB_FAM1_Addnewoptiontext") ;
            Combo_lb_fam1_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LB_FAM1_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_lb_fam2_Objectcall = httpContext.cgiGet( "COMBO_LB_FAM2_Objectcall") ;
            Combo_lb_fam2_Class = httpContext.cgiGet( "COMBO_LB_FAM2_Class") ;
            Combo_lb_fam2_Icontype = httpContext.cgiGet( "COMBO_LB_FAM2_Icontype") ;
            Combo_lb_fam2_Icon = httpContext.cgiGet( "COMBO_LB_FAM2_Icon") ;
            Combo_lb_fam2_Caption = httpContext.cgiGet( "COMBO_LB_FAM2_Caption") ;
            Combo_lb_fam2_Tooltip = httpContext.cgiGet( "COMBO_LB_FAM2_Tooltip") ;
            Combo_lb_fam2_Cls = httpContext.cgiGet( "COMBO_LB_FAM2_Cls") ;
            Combo_lb_fam2_Selectedvalue_set = httpContext.cgiGet( "COMBO_LB_FAM2_Selectedvalue_set") ;
            Combo_lb_fam2_Selectedvalue_get = httpContext.cgiGet( "COMBO_LB_FAM2_Selectedvalue_get") ;
            Combo_lb_fam2_Selectedtext_set = httpContext.cgiGet( "COMBO_LB_FAM2_Selectedtext_set") ;
            Combo_lb_fam2_Selectedtext_get = httpContext.cgiGet( "COMBO_LB_FAM2_Selectedtext_get") ;
            Combo_lb_fam2_Gamoauthtoken = httpContext.cgiGet( "COMBO_LB_FAM2_Gamoauthtoken") ;
            Combo_lb_fam2_Ddointernalname = httpContext.cgiGet( "COMBO_LB_FAM2_Ddointernalname") ;
            Combo_lb_fam2_Titlecontrolalign = httpContext.cgiGet( "COMBO_LB_FAM2_Titlecontrolalign") ;
            Combo_lb_fam2_Dropdownoptionstype = httpContext.cgiGet( "COMBO_LB_FAM2_Dropdownoptionstype") ;
            Combo_lb_fam2_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM2_Enabled")) ;
            Combo_lb_fam2_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM2_Visible")) ;
            Combo_lb_fam2_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_LB_FAM2_Titlecontrolidtoreplace") ;
            Combo_lb_fam2_Datalisttype = httpContext.cgiGet( "COMBO_LB_FAM2_Datalisttype") ;
            Combo_lb_fam2_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM2_Allowmultipleselection")) ;
            Combo_lb_fam2_Datalistfixedvalues = httpContext.cgiGet( "COMBO_LB_FAM2_Datalistfixedvalues") ;
            Combo_lb_fam2_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM2_Isgriditem")) ;
            Combo_lb_fam2_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM2_Hasdescription")) ;
            Combo_lb_fam2_Datalistproc = httpContext.cgiGet( "COMBO_LB_FAM2_Datalistproc") ;
            Combo_lb_fam2_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_LB_FAM2_Datalistprocparametersprefix") ;
            Combo_lb_fam2_Remoteservicesparameters = httpContext.cgiGet( "COMBO_LB_FAM2_Remoteservicesparameters") ;
            Combo_lb_fam2_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LB_FAM2_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_lb_fam2_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM2_Includeonlyselectedoption")) ;
            Combo_lb_fam2_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM2_Includeselectalloption")) ;
            Combo_lb_fam2_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM2_Emptyitem")) ;
            Combo_lb_fam2_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM2_Includeaddnewoption")) ;
            Combo_lb_fam2_Htmltemplate = httpContext.cgiGet( "COMBO_LB_FAM2_Htmltemplate") ;
            Combo_lb_fam2_Multiplevaluestype = httpContext.cgiGet( "COMBO_LB_FAM2_Multiplevaluestype") ;
            Combo_lb_fam2_Loadingdata = httpContext.cgiGet( "COMBO_LB_FAM2_Loadingdata") ;
            Combo_lb_fam2_Noresultsfound = httpContext.cgiGet( "COMBO_LB_FAM2_Noresultsfound") ;
            Combo_lb_fam2_Emptyitemtext = httpContext.cgiGet( "COMBO_LB_FAM2_Emptyitemtext") ;
            Combo_lb_fam2_Onlyselectedvalues = httpContext.cgiGet( "COMBO_LB_FAM2_Onlyselectedvalues") ;
            Combo_lb_fam2_Selectalltext = httpContext.cgiGet( "COMBO_LB_FAM2_Selectalltext") ;
            Combo_lb_fam2_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_LB_FAM2_Multiplevaluesseparator") ;
            Combo_lb_fam2_Addnewoptiontext = httpContext.cgiGet( "COMBO_LB_FAM2_Addnewoptiontext") ;
            Combo_lb_fam2_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LB_FAM2_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_lb_fam3_Objectcall = httpContext.cgiGet( "COMBO_LB_FAM3_Objectcall") ;
            Combo_lb_fam3_Class = httpContext.cgiGet( "COMBO_LB_FAM3_Class") ;
            Combo_lb_fam3_Icontype = httpContext.cgiGet( "COMBO_LB_FAM3_Icontype") ;
            Combo_lb_fam3_Icon = httpContext.cgiGet( "COMBO_LB_FAM3_Icon") ;
            Combo_lb_fam3_Caption = httpContext.cgiGet( "COMBO_LB_FAM3_Caption") ;
            Combo_lb_fam3_Tooltip = httpContext.cgiGet( "COMBO_LB_FAM3_Tooltip") ;
            Combo_lb_fam3_Cls = httpContext.cgiGet( "COMBO_LB_FAM3_Cls") ;
            Combo_lb_fam3_Selectedvalue_set = httpContext.cgiGet( "COMBO_LB_FAM3_Selectedvalue_set") ;
            Combo_lb_fam3_Selectedvalue_get = httpContext.cgiGet( "COMBO_LB_FAM3_Selectedvalue_get") ;
            Combo_lb_fam3_Selectedtext_set = httpContext.cgiGet( "COMBO_LB_FAM3_Selectedtext_set") ;
            Combo_lb_fam3_Selectedtext_get = httpContext.cgiGet( "COMBO_LB_FAM3_Selectedtext_get") ;
            Combo_lb_fam3_Gamoauthtoken = httpContext.cgiGet( "COMBO_LB_FAM3_Gamoauthtoken") ;
            Combo_lb_fam3_Ddointernalname = httpContext.cgiGet( "COMBO_LB_FAM3_Ddointernalname") ;
            Combo_lb_fam3_Titlecontrolalign = httpContext.cgiGet( "COMBO_LB_FAM3_Titlecontrolalign") ;
            Combo_lb_fam3_Dropdownoptionstype = httpContext.cgiGet( "COMBO_LB_FAM3_Dropdownoptionstype") ;
            Combo_lb_fam3_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM3_Enabled")) ;
            Combo_lb_fam3_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM3_Visible")) ;
            Combo_lb_fam3_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_LB_FAM3_Titlecontrolidtoreplace") ;
            Combo_lb_fam3_Datalisttype = httpContext.cgiGet( "COMBO_LB_FAM3_Datalisttype") ;
            Combo_lb_fam3_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM3_Allowmultipleselection")) ;
            Combo_lb_fam3_Datalistfixedvalues = httpContext.cgiGet( "COMBO_LB_FAM3_Datalistfixedvalues") ;
            Combo_lb_fam3_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM3_Isgriditem")) ;
            Combo_lb_fam3_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM3_Hasdescription")) ;
            Combo_lb_fam3_Datalistproc = httpContext.cgiGet( "COMBO_LB_FAM3_Datalistproc") ;
            Combo_lb_fam3_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_LB_FAM3_Datalistprocparametersprefix") ;
            Combo_lb_fam3_Remoteservicesparameters = httpContext.cgiGet( "COMBO_LB_FAM3_Remoteservicesparameters") ;
            Combo_lb_fam3_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LB_FAM3_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_lb_fam3_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM3_Includeonlyselectedoption")) ;
            Combo_lb_fam3_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM3_Includeselectalloption")) ;
            Combo_lb_fam3_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM3_Emptyitem")) ;
            Combo_lb_fam3_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LB_FAM3_Includeaddnewoption")) ;
            Combo_lb_fam3_Htmltemplate = httpContext.cgiGet( "COMBO_LB_FAM3_Htmltemplate") ;
            Combo_lb_fam3_Multiplevaluestype = httpContext.cgiGet( "COMBO_LB_FAM3_Multiplevaluestype") ;
            Combo_lb_fam3_Loadingdata = httpContext.cgiGet( "COMBO_LB_FAM3_Loadingdata") ;
            Combo_lb_fam3_Noresultsfound = httpContext.cgiGet( "COMBO_LB_FAM3_Noresultsfound") ;
            Combo_lb_fam3_Emptyitemtext = httpContext.cgiGet( "COMBO_LB_FAM3_Emptyitemtext") ;
            Combo_lb_fam3_Onlyselectedvalues = httpContext.cgiGet( "COMBO_LB_FAM3_Onlyselectedvalues") ;
            Combo_lb_fam3_Selectalltext = httpContext.cgiGet( "COMBO_LB_FAM3_Selectalltext") ;
            Combo_lb_fam3_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_LB_FAM3_Multiplevaluesseparator") ;
            Combo_lb_fam3_Addnewoptiontext = httpContext.cgiGet( "COMBO_LB_FAM3_Addnewoptiontext") ;
            Combo_lb_fam3_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LB_FAM3_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable2_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Objectcall") ;
            Dvpanel_unnamedtable2_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Class") ;
            Dvpanel_unnamedtable2_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Enabled")) ;
            Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
            Dvpanel_unnamedtable2_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Height") ;
            Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
            Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
            Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
            Dvpanel_unnamedtable2_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showheader")) ;
            Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
            Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
            Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
            Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
            Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
            Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
            Dvpanel_unnamedtable2_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Visible")) ;
            Dvpanel_unnamedtable2_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_prdnum_Objectcall = httpContext.cgiGet( "COMBO_PRDNUM_Objectcall") ;
            Combo_prdnum_Class = httpContext.cgiGet( "COMBO_PRDNUM_Class") ;
            Combo_prdnum_Icontype = httpContext.cgiGet( "COMBO_PRDNUM_Icontype") ;
            Combo_prdnum_Icon = httpContext.cgiGet( "COMBO_PRDNUM_Icon") ;
            Combo_prdnum_Caption = httpContext.cgiGet( "COMBO_PRDNUM_Caption") ;
            Combo_prdnum_Tooltip = httpContext.cgiGet( "COMBO_PRDNUM_Tooltip") ;
            Combo_prdnum_Cls = httpContext.cgiGet( "COMBO_PRDNUM_Cls") ;
            Combo_prdnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_set") ;
            Combo_prdnum_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_get") ;
            Combo_prdnum_Selectedtext_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedtext_set") ;
            Combo_prdnum_Selectedtext_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedtext_get") ;
            Combo_prdnum_Gamoauthtoken = httpContext.cgiGet( "COMBO_PRDNUM_Gamoauthtoken") ;
            Combo_prdnum_Ddointernalname = httpContext.cgiGet( "COMBO_PRDNUM_Ddointernalname") ;
            Combo_prdnum_Titlecontrolalign = httpContext.cgiGet( "COMBO_PRDNUM_Titlecontrolalign") ;
            Combo_prdnum_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PRDNUM_Dropdownoptionstype") ;
            Combo_prdnum_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Enabled")) ;
            Combo_prdnum_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Visible")) ;
            Combo_prdnum_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PRDNUM_Titlecontrolidtoreplace") ;
            Combo_prdnum_Datalisttype = httpContext.cgiGet( "COMBO_PRDNUM_Datalisttype") ;
            Combo_prdnum_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Allowmultipleselection")) ;
            Combo_prdnum_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PRDNUM_Datalistfixedvalues") ;
            Combo_prdnum_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Isgriditem")) ;
            Combo_prdnum_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Hasdescription")) ;
            Combo_prdnum_Datalistproc = httpContext.cgiGet( "COMBO_PRDNUM_Datalistproc") ;
            Combo_prdnum_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PRDNUM_Datalistprocparametersprefix") ;
            Combo_prdnum_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PRDNUM_Remoteservicesparameters") ;
            Combo_prdnum_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PRDNUM_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_prdnum_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeonlyselectedoption")) ;
            Combo_prdnum_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeselectalloption")) ;
            Combo_prdnum_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Emptyitem")) ;
            Combo_prdnum_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeaddnewoption")) ;
            Combo_prdnum_Htmltemplate = httpContext.cgiGet( "COMBO_PRDNUM_Htmltemplate") ;
            Combo_prdnum_Multiplevaluestype = httpContext.cgiGet( "COMBO_PRDNUM_Multiplevaluestype") ;
            Combo_prdnum_Loadingdata = httpContext.cgiGet( "COMBO_PRDNUM_Loadingdata") ;
            Combo_prdnum_Noresultsfound = httpContext.cgiGet( "COMBO_PRDNUM_Noresultsfound") ;
            Combo_prdnum_Emptyitemtext = httpContext.cgiGet( "COMBO_PRDNUM_Emptyitemtext") ;
            Combo_prdnum_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PRDNUM_Onlyselectedvalues") ;
            Combo_prdnum_Selectalltext = httpContext.cgiGet( "COMBO_PRDNUM_Selectalltext") ;
            Combo_prdnum_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PRDNUM_Multiplevaluesseparator") ;
            Combo_prdnum_Addnewoptiontext = httpContext.cgiGet( "COMBO_PRDNUM_Addnewoptiontext") ;
            Combo_prdnum_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PRDNUM_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvelop_confirmpanel_renumerar_Objectcall = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERAR_Objectcall") ;
            Dvelop_confirmpanel_renumerar_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERAR_Enabled")) ;
            Dvelop_confirmpanel_renumerar_Width = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERAR_Width") ;
            Dvelop_confirmpanel_renumerar_Height = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERAR_Height") ;
            Dvelop_confirmpanel_renumerar_Class = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERAR_Class") ;
            Dvelop_confirmpanel_renumerar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERAR_Title") ;
            Dvelop_confirmpanel_renumerar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERAR_Confirmationtext") ;
            Dvelop_confirmpanel_renumerar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERAR_Yesbuttoncaption") ;
            Dvelop_confirmpanel_renumerar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERAR_Nobuttoncaption") ;
            Dvelop_confirmpanel_renumerar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERAR_Cancelbuttoncaption") ;
            Dvelop_confirmpanel_renumerar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERAR_Yesbuttonposition") ;
            Dvelop_confirmpanel_renumerar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERAR_Confirmtype") ;
            Dvelop_confirmpanel_renumerar_Comment = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERAR_Comment") ;
            Dvelop_confirmpanel_renumerar_Bodytype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERAR_Bodytype") ;
            Dvelop_confirmpanel_renumerar_Bodycontentinternalname = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERAR_Bodycontentinternalname") ;
            Dvelop_confirmpanel_renumerar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERAR_Result") ;
            Dvelop_confirmpanel_renumerar_Texttype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERAR_Texttype") ;
            Dvelop_confirmpanel_renumerar_Visible = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RENUMERAR_Visible")) ;
            /* Read variables values. */
            A486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
            A5166CosKgmF = localUtil.ctond( httpContext.cgiGet( edtCosKgmF_Internalname)) ;
            n5166CosKgmF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
            A6310Lb_TaAuxC = httpContext.cgiGet( edtLb_TaAuxC_Internalname) ;
            n6310Lb_TaAuxC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_fam1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_fam1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_FAM1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_fam1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6369Lb_fam1 = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6369Lb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6369Lb_fam1), 2, 0));
            }
            else
            {
               A6369Lb_fam1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_fam1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6369Lb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6369Lb_fam1), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_fam2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_fam2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_FAM2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_fam2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6370Lb_fam2 = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6370Lb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6370Lb_fam2), 2, 0));
            }
            else
            {
               A6370Lb_fam2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_fam2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6370Lb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6370Lb_fam2), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_fam3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_fam3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_FAM3");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_fam3_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6371Lb_fam3 = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6371Lb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6371Lb_fam3), 2, 0));
            }
            else
            {
               A6371Lb_fam3 = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_fam3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6371Lb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6371Lb_fam3), 2, 0));
            }
            AV55TitTxt = httpContext.cgiGet( edtavTittxt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TitTxt", AV55TitTxt);
            A5361ForCanSum = localUtil.ctond( httpContext.cgiGet( edtForCanSum_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
            AV98Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98Pgmname", AV98Pgmname);
            AV80ComboLb_TaAuxC = httpContext.cgiGet( edtavCombolb_taauxc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80ComboLb_TaAuxC", AV80ComboLb_TaAuxC);
            AV78ComboLb_fam1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCombolb_fam1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78ComboLb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78ComboLb_fam1), 2, 0));
            AV84ComboLb_fam2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCombolb_fam2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84ComboLb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84ComboLb_fam2), 2, 0));
            AV86ComboLb_fam3 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCombolb_fam3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86ComboLb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86ComboLb_fam3), 2, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TDFORMU");
            A486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
            forbiddenHiddens.add("ForNumCol", localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV98Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98Pgmname", AV98Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV98Pgmname, "")));
            forbiddenHiddens.add("ContNum", localUtil.format( DecimalUtil.doubleToDec(A315ContNum), "ZZZZZZZZ9"));
            forbiddenHiddens.add("CosKgm", localUtil.format( A318CosKgm, "ZZZZZ9.99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A486ForNumCol != Z486ForNumCol ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("formulaciontinte\\tdformu:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode32 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode32 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound32 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_0Q0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "FORNUMCOL");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtForNumCol_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
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
                     if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_RENUMERAR.CLOSE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e130Q2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e120Q2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e140Q2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
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
         e140Q2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll0Q32( ) ;
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
      bttBtntrn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtntrn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtntrn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
         }
         disableAttributes0Q32( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavTittxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTittxt_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdrgb_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_taauxc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_taauxc_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_fam1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_fam1_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_fam2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_fam2_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_fam3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_fam3_Enabled), 5, 0), true);
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

   public void confirm_0Q0( )
   {
      beforeValidate0Q32( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls0Q32( ) ;
         }
         else
         {
            checkExtendedTable0Q32( ) ;
            closeExtendedTableCursors0Q32( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode32 = Gx_mode ;
         confirm_0Q33( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode32 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode32 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_0Q33( )
   {
      s310ColUltLin = O310ColUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
      s5166CosKgmF = O5166CosKgmF ;
      n5166CosKgmF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      s5361ForCanSum = O5361ForCanSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      nGXsfl_103_idx = 0 ;
      while ( nGXsfl_103_idx < nRC_GXsfl_103 )
      {
         readRow0Q33( ) ;
         if ( ( nRcdExists_33 != 0 ) || ( nIsMod_33 != 0 ) )
         {
            getKey0Q33( ) ;
            if ( ( nRcdExists_33 == 0 ) && ( nRcdDeleted_33 == 0 ) )
            {
               if ( RcdFound33 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate0Q33( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0Q33( ) ;
                     closeExtendedTableCursors0Q33( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O310ColUltLin = A310ColUltLin ;
                     httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
                     O5166CosKgmF = A5166CosKgmF ;
                     n5166CosKgmF = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
                     O5361ForCanSum = A5361ForCanSum ;
                     httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
                  }
               }
               else
               {
                  GXCCtl = "COLLIN_" + sGXsfl_103_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtColLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound33 != 0 )
               {
                  if ( nRcdDeleted_33 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey0Q33( ) ;
                     load0Q33( ) ;
                     beforeValidate0Q33( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0Q33( ) ;
                        O310ColUltLin = A310ColUltLin ;
                        httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
                        O5166CosKgmF = A5166CosKgmF ;
                        n5166CosKgmF = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
                        O5361ForCanSum = A5361ForCanSum ;
                        httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
                     }
                  }
                  else
                  {
                     if ( nIsMod_33 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate0Q33( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0Q33( ) ;
                           closeExtendedTableCursors0Q33( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O310ColUltLin = A310ColUltLin ;
                           httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
                           O5166CosKgmF = A5166CosKgmF ;
                           n5166CosKgmF = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
                           O5361ForCanSum = A5361ForCanSum ;
                           httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_33 == 0 )
                  {
                     GXCCtl = "COLLIN_" + sGXsfl_103_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtColLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtColLin_Internalname, GXutil.ltrim( localUtil.ntoc( A309ColLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtValCod_Internalname, GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForCan_Internalname, GXutil.ltrim( localUtil.ntoc( A481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtPrdRGB_Internalname, GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavPrdrgb_Internalname, GXutil.ltrim( localUtil.ntoc( AV68PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavR_Internalname, GXutil.ltrim( localUtil.ntoc( AV69R, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavG_Internalname, GXutil.ltrim( localUtil.ntoc( AV70G, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavB_Internalname, GXutil.ltrim( localUtil.ntoc( AV71B, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavR2_Internalname, GXutil.ltrim( localUtil.ntoc( AV72R2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavG2_Internalname, GXutil.ltrim( localUtil.ntoc( AV73G2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavB2_Internalname, GXutil.ltrim( localUtil.ntoc( AV74B2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColFibra_Internalname, GXutil.rtrim( A13926ColFibra)) ;
         httpContext.changePostValue( "ZT_"+"Z309ColLin_"+sGXsfl_103_idx, GXutil.ltrim( localUtil.ntoc( Z309ColLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z481ForCan_"+sGXsfl_103_idx, GXutil.ltrim( localUtil.ntoc( Z481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z838TotLinCol_"+sGXsfl_103_idx, GXutil.ltrim( localUtil.ntoc( Z838TotLinCol, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6193ForClaCol_"+sGXsfl_103_idx, GXutil.rtrim( Z6193ForClaCol)) ;
         httpContext.changePostValue( "ZT_"+"Z13926ColFibra_"+sGXsfl_103_idx, GXutil.rtrim( Z13926ColFibra)) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_103_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_103_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T481ForCan_"+sGXsfl_103_idx, GXutil.ltrim( localUtil.ntoc( O481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T719PrdNum_"+sGXsfl_103_idx, GXutil.rtrim( O719PrdNum)) ;
         httpContext.changePostValue( "T5167TotLinCoF_"+sGXsfl_103_idx, GXutil.ltrim( localUtil.ntoc( O5167TotLinCoF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_33_"+sGXsfl_103_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_33, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_33_"+sGXsfl_103_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_33, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_33_"+sGXsfl_103_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_33, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_33 != 0 )
         {
            httpContext.changePostValue( "COLLIN_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VALCOD_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtValCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPREACT_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORCAN_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDRGB_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdRGB_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vPRDRGB_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdrgb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vR_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vG_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavG_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vB_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavB_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vR2_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavR2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vG2_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavG2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vB2_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavB2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLFIBRA_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColFibra_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O310ColUltLin = s310ColUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
      O5166CosKgmF = s5166CosKgmF ;
      n5166CosKgmF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      O5361ForCanSum = s5361ForCanSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      /* Start of After( level) rules */
      /* Using cursor T000Q13 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A13757ColLinMax = T000Q13_A13757ColLinMax[0] ;
      }
      else
      {
         A5361ForCanSum = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         A13757ColLinMax = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13757ColLinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13757ColLinMax), 3, 0));
      }
      /* End of After( level) rules */
   }

   public void resetCaption0Q0( )
   {
   }

   public void e120Q2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tdformu_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Station", AV27Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV28emprnom ;
      GXv_char4[0] = AV23UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdformu_impl.this.A396EmprCod = GXv_char2[0] ;
      tdformu_impl.this.AV28emprnom = GXv_char3[0] ;
      tdformu_impl.this.AV23UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV28emprnom", AV28emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
      AV31EmprCod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31EmprCod", AV31EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31EmprCod, "@!"))));
      GXt_char1 = AV16msg0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG265_", ""), (byte)(99), GXv_char4) ;
      tdformu_impl.this.GXt_char1 = GXv_char4[0] ;
      AV16msg0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16msg0", AV16msg0);
      GXt_int5 = AV34F_lavand ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV31EmprCod, httpContext.getMessage( "LAVAND", ""), GXv_int6) ;
      tdformu_impl.this.GXt_int5 = GXv_int6[0] ;
      AV34F_lavand = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34F_lavand", GXutil.str( AV34F_lavand, 1, 0));
      GXt_int5 = AV43ClaveCol ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV31EmprCod, httpContext.getMessage( "CLAVEC", ""), GXv_int6) ;
      tdformu_impl.this.GXt_int5 = GXv_int6[0] ;
      AV43ClaveCol = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43ClaveCol", GXutil.str( AV43ClaveCol, 1, 0));
      GXt_int5 = AV58OtraformaAux ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV31EmprCod, httpContext.getMessage( "IN0AUX", ""), GXv_int6) ;
      tdformu_impl.this.GXt_int5 = GXv_int6[0] ;
      AV58OtraformaAux = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58OtraformaAux", GXutil.str( AV58OtraformaAux, 1, 0));
      GXt_int5 = AV56Fam1d1 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV31EmprCod, httpContext.getMessage( "FAM1D1", ""), GXv_int6) ;
      tdformu_impl.this.GXt_int5 = GXv_int6[0] ;
      AV56Fam1d1 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Fam1d1", GXutil.str( AV56Fam1d1, 1, 0));
      GXt_int5 = AV47prdaux ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV31EmprCod, httpContext.getMessage( "PRD#", ""), GXv_int6) ;
      tdformu_impl.this.GXt_int5 = GXv_int6[0] ;
      AV47prdaux = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47prdaux", GXutil.str( AV47prdaux, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDAUX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV47prdaux), "9")));
      GXt_int5 = (byte)(AV75texpasa) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV31EmprCod, httpContext.getMessage( "TEXPAS", ""), GXv_int6) ;
      tdformu_impl.this.GXt_int5 = GXv_int6[0] ;
      AV75texpasa = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75texpasa", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75texpasa), 4, 0));
      GXt_char1 = AV49Lit13 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2006_", ""), (byte)(99), GXv_char4) ;
      tdformu_impl.this.GXt_char1 = GXv_char4[0] ;
      AV49Lit13 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Lit13", AV49Lit13);
      AV55TitTxt = ((AV56Fam1d1==0) ? " " : httpContext.getMessage( "El sistema controla solo 1ª Posicion Familia Productos: 3,4..etc", "")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TitTxt", AV55TitTxt);
      GXt_char1 = AV27Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tdformu_impl.this.GXt_char1 = GXv_char4[0] ;
      AV27Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Station", AV27Station);
      GXv_char4[0] = AV31EmprCod ;
      GXv_char3[0] = AV28emprnom ;
      GXv_char2[0] = AV23UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char4, GXv_char3, GXv_char2) ;
      tdformu_impl.this.AV31EmprCod = GXv_char4[0] ;
      tdformu_impl.this.AV28emprnom = GXv_char3[0] ;
      tdformu_impl.this.AV23UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31EmprCod", AV31EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV28emprnom", AV28emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
      GXv_SdtWWPContext7[0] = AV62WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV62WWPContext = GXv_SdtWWPContext7[0] ;
      divUnnamedtable1_Height = 60 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable1_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable1_Height), 9, 0), true);
      Combo_prdnum_Titlecontrolidtoreplace = edtPrdNum_Internalname ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "TitleControlIdToReplace", Combo_prdnum_Titlecontrolidtoreplace);
      edtLb_fam3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_fam3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_fam3_Visible), 5, 0), true);
      AV86ComboLb_fam3 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86ComboLb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86ComboLb_fam3), 2, 0));
      edtavCombolb_fam3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_fam3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_fam3_Visible), 5, 0), true);
      edtLb_fam2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_fam2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_fam2_Visible), 5, 0), true);
      AV84ComboLb_fam2 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84ComboLb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84ComboLb_fam2), 2, 0));
      edtavCombolb_fam2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_fam2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_fam2_Visible), 5, 0), true);
      edtLb_fam1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_fam1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_fam1_Visible), 5, 0), true);
      AV78ComboLb_fam1 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78ComboLb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78ComboLb_fam1), 2, 0));
      edtavCombolb_fam1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_fam1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_fam1_Visible), 5, 0), true);
      edtLb_TaAuxC_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxC_Visible), 5, 0), true);
      AV80ComboLb_TaAuxC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80ComboLb_TaAuxC", AV80ComboLb_TaAuxC);
      edtavCombolb_taauxc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_taauxc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_taauxc_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOLB_TAAUXC' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOLB_FAM1' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOLB_FAM2' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOLB_FAM3' */
      S142 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOPRDNUM' */
      S152 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S162 ();
      if ( returnInSub )
      {
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV63TrnContext.fromxml(AV64WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV63TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV98Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV99GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99GXV1), 8, 0));
         while ( AV99GXV1 <= AV63TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV66TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV63TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV99GXV1));
            if ( GXutil.strcmp(AV66TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "Lb_TaAuxC") == 0 )
            {
               AV65Insert_Lb_TaAuxC = AV66TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV65Insert_Lb_TaAuxC", AV65Insert_Lb_TaAuxC);
               if ( ! (GXutil.strcmp("", AV65Insert_Lb_TaAuxC)==0) )
               {
                  AV80ComboLb_TaAuxC = AV65Insert_Lb_TaAuxC ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV80ComboLb_TaAuxC", AV80ComboLb_TaAuxC);
                  Combo_lb_taauxc_Selectedvalue_set = AV80ComboLb_TaAuxC ;
                  ucCombo_lb_taauxc.sendProperty(context, "", false, Combo_lb_taauxc_Internalname, "SelectedValue_set", Combo_lb_taauxc_Selectedvalue_set);
                  Combo_lb_taauxc_Enabled = false ;
                  ucCombo_lb_taauxc.sendProperty(context, "", false, Combo_lb_taauxc_Internalname, "Enabled", GXutil.booltostr( Combo_lb_taauxc_Enabled));
               }
            }
            AV99GXV1 = (int)(AV99GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99GXV1), 8, 0));
         }
      }
   }

   public void e140Q2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( AV47prdaux == 1 ) && ! (GXutil.strcmp("", A6310Lb_TaAuxC)==0) )
      {
         GXv_char4[0] = AV31EmprCod ;
         GXv_decimal8[0] = AV57ForCanSum ;
         GXv_int9[0] = A486ForNumCol ;
         GXv_int6[0] = A6369Lb_fam1 ;
         GXv_int10[0] = A6370Lb_fam2 ;
         GXv_int11[0] = A6371Lb_fam3 ;
         GXv_int12[0] = AV52Error_sumc ;
         new app.formulaciontinte.psumcor(remoteHandle, context).execute( GXv_char4, GXv_decimal8, GXv_int9, GXv_int6, GXv_int10, GXv_int11, GXv_int12) ;
         tdformu_impl.this.AV31EmprCod = GXv_char4[0] ;
         tdformu_impl.this.AV57ForCanSum = GXv_decimal8[0] ;
         tdformu_impl.this.A486ForNumCol = GXv_int9[0] ;
         tdformu_impl.this.A6369Lb_fam1 = GXv_int6[0] ;
         tdformu_impl.this.A6370Lb_fam2 = GXv_int10[0] ;
         tdformu_impl.this.A6371Lb_fam3 = GXv_int11[0] ;
         tdformu_impl.this.AV52Error_sumc = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31EmprCod", AV31EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri("", false, "AV57ForCanSum", GXutil.ltrimstr( AV57ForCanSum, 11, 5));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCANSUM", getSecureSignedToken( "", localUtil.format( AV57ForCanSum, "ZZZZ9.99999")));
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6369Lb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6369Lb_fam1), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6370Lb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6370Lb_fam2), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6371Lb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6371Lb_fam3), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV52Error_sumc", GXutil.str( AV52Error_sumc, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERROR_SUMC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52Error_sumc), "9")));
         httpContext.popup(formatLink("app.formulaciontinte.productosfunciontablaalcali", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A6310Lb_TaAuxC)),GXutil.URLEncode(DecimalUtil.decToString(AV57ForCanSum)),GXutil.URLEncode(GXutil.ltrimstr(A486ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A6369Lb_fam1,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A6370Lb_fam2,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A6371Lb_fam3,2,0))}, new String[] {"EmprCod","Lb_TaAuxC","ForCanSum","ForNumCol","Lb_fam1","Lb_fam2","Lb_fam3"}) , new Object[] {"A396EmprCod","A6310Lb_TaAuxC","AV57ForCanSum","A486ForNumCol","A6369Lb_fam1","A6370Lb_fam2","A6371Lb_fam3"});
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(11);
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      if ( 1 == 0 )
      {
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   public void e130Q2( )
   {
      /* Dvelop_confirmpanel_renumerar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_renumerar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION RENUMERAR' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(11);
            pr_default.close(10);
            pr_default.close(9);
            pr_default.close(8);
            pr_default.close(7);
            pr_default.close(5);
            pr_default.close(4);
            pr_default.close(3);
            pr_default.close(2);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
      }
   }

   public void S172( )
   {
      /* 'DO ACTION RENUMERAR' Routine */
      returnInSub = false ;
      new app.prenlcol(remoteHandle, context).execute( A396EmprCod, A486ForNumCol) ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(11);
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S162( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divDvpanel_unnamedtable2_cell_Class = "col-xs-12 CellMarginTop" ;
      httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable2_cell_Internalname, "Class", divDvpanel_unnamedtable2_cell_Class, true);
   }

   public void S152( )
   {
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item13 = AV81PrdNum_Data ;
      GXv_char4[0] = AV77ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item14[0] = GXt_objcol_SdtDVB_SDTComboData_Item13 ;
      new app.formulaciontinte.tdformuloaddvcombo(remoteHandle, context).execute( "PrdNum", Gx_mode, AV31EmprCod, AV61ForNumCol, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item14) ;
      tdformu_impl.this.AV77ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item13 = GXv_objcol_SdtDVB_SDTComboData_Item14[0] ;
      AV81PrdNum_Data = GXt_objcol_SdtDVB_SDTComboData_Item13 ;
   }

   public void S142( )
   {
      /* 'LOADCOMBOLB_FAM3' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item13 = AV85Lb_fam3_Data ;
      GXv_char4[0] = AV77ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item14[0] = GXt_objcol_SdtDVB_SDTComboData_Item13 ;
      new app.formulaciontinte.tdformuloaddvcombo(remoteHandle, context).execute( "Lb_fam3", Gx_mode, AV31EmprCod, AV61ForNumCol, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item14) ;
      tdformu_impl.this.AV77ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item13 = GXv_objcol_SdtDVB_SDTComboData_Item14[0] ;
      AV85Lb_fam3_Data = GXt_objcol_SdtDVB_SDTComboData_Item13 ;
      Combo_lb_fam3_Selectedvalue_set = AV77ComboSelectedValue ;
      ucCombo_lb_fam3.sendProperty(context, "", false, Combo_lb_fam3_Internalname, "SelectedValue_set", Combo_lb_fam3_Selectedvalue_set);
      AV86ComboLb_fam3 = (byte)(GXutil.lval( AV77ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86ComboLb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86ComboLb_fam3), 2, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_lb_fam3_Enabled = false ;
         ucCombo_lb_fam3.sendProperty(context, "", false, Combo_lb_fam3_Internalname, "Enabled", GXutil.booltostr( Combo_lb_fam3_Enabled));
      }
   }

   public void S132( )
   {
      /* 'LOADCOMBOLB_FAM2' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item13 = AV83Lb_fam2_Data ;
      GXv_char4[0] = AV77ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item14[0] = GXt_objcol_SdtDVB_SDTComboData_Item13 ;
      new app.formulaciontinte.tdformuloaddvcombo(remoteHandle, context).execute( "Lb_fam2", Gx_mode, AV31EmprCod, AV61ForNumCol, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item14) ;
      tdformu_impl.this.AV77ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item13 = GXv_objcol_SdtDVB_SDTComboData_Item14[0] ;
      AV83Lb_fam2_Data = GXt_objcol_SdtDVB_SDTComboData_Item13 ;
      Combo_lb_fam2_Selectedvalue_set = AV77ComboSelectedValue ;
      ucCombo_lb_fam2.sendProperty(context, "", false, Combo_lb_fam2_Internalname, "SelectedValue_set", Combo_lb_fam2_Selectedvalue_set);
      AV84ComboLb_fam2 = (byte)(GXutil.lval( AV77ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84ComboLb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84ComboLb_fam2), 2, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_lb_fam2_Enabled = false ;
         ucCombo_lb_fam2.sendProperty(context, "", false, Combo_lb_fam2_Internalname, "Enabled", GXutil.booltostr( Combo_lb_fam2_Enabled));
      }
   }

   public void S122( )
   {
      /* 'LOADCOMBOLB_FAM1' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item13 = AV76Lb_fam1_Data ;
      GXv_char4[0] = AV77ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item14[0] = GXt_objcol_SdtDVB_SDTComboData_Item13 ;
      new app.formulaciontinte.tdformuloaddvcombo(remoteHandle, context).execute( "Lb_fam1", Gx_mode, AV31EmprCod, AV61ForNumCol, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item14) ;
      tdformu_impl.this.AV77ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item13 = GXv_objcol_SdtDVB_SDTComboData_Item14[0] ;
      AV76Lb_fam1_Data = GXt_objcol_SdtDVB_SDTComboData_Item13 ;
      Combo_lb_fam1_Selectedvalue_set = AV77ComboSelectedValue ;
      ucCombo_lb_fam1.sendProperty(context, "", false, Combo_lb_fam1_Internalname, "SelectedValue_set", Combo_lb_fam1_Selectedvalue_set);
      AV78ComboLb_fam1 = (byte)(GXutil.lval( AV77ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78ComboLb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78ComboLb_fam1), 2, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_lb_fam1_Enabled = false ;
         ucCombo_lb_fam1.sendProperty(context, "", false, Combo_lb_fam1_Internalname, "Enabled", GXutil.booltostr( Combo_lb_fam1_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOLB_TAAUXC' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item13 = AV79Lb_TaAuxC_Data ;
      GXv_char4[0] = AV77ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item14[0] = GXt_objcol_SdtDVB_SDTComboData_Item13 ;
      new app.formulaciontinte.tdformuloaddvcombo(remoteHandle, context).execute( "Lb_TaAuxC", Gx_mode, AV31EmprCod, AV61ForNumCol, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item14) ;
      tdformu_impl.this.AV77ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item13 = GXv_objcol_SdtDVB_SDTComboData_Item14[0] ;
      AV79Lb_TaAuxC_Data = GXt_objcol_SdtDVB_SDTComboData_Item13 ;
      Combo_lb_taauxc_Selectedvalue_set = AV77ComboSelectedValue ;
      ucCombo_lb_taauxc.sendProperty(context, "", false, Combo_lb_taauxc_Internalname, "SelectedValue_set", Combo_lb_taauxc_Selectedvalue_set);
      AV80ComboLb_TaAuxC = AV77ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80ComboLb_TaAuxC", AV80ComboLb_TaAuxC);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_lb_taauxc_Enabled = false ;
         ucCombo_lb_taauxc.sendProperty(context, "", false, Combo_lb_taauxc_Internalname, "Enabled", GXutil.booltostr( Combo_lb_taauxc_Enabled));
      }
   }

   public void zm0Q32( int GX_JID )
   {
      if ( ( GX_JID == 45 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6369Lb_fam1 = T000Q15_A6369Lb_fam1[0] ;
            Z6370Lb_fam2 = T000Q15_A6370Lb_fam2[0] ;
            Z6371Lb_fam3 = T000Q15_A6371Lb_fam3[0] ;
            Z310ColUltLin = T000Q15_A310ColUltLin[0] ;
            Z315ContNum = T000Q15_A315ContNum[0] ;
            Z318CosKgm = T000Q15_A318CosKgm[0] ;
            Z6310Lb_TaAuxC = T000Q15_A6310Lb_TaAuxC[0] ;
         }
         else
         {
            Z6369Lb_fam1 = A6369Lb_fam1 ;
            Z6370Lb_fam2 = A6370Lb_fam2 ;
            Z6371Lb_fam3 = A6371Lb_fam3 ;
            Z310ColUltLin = A310ColUltLin ;
            Z315ContNum = A315ContNum ;
            Z318CosKgm = A318CosKgm ;
            Z6310Lb_TaAuxC = A6310Lb_TaAuxC ;
         }
      }
      if ( GX_JID == -45 )
      {
         Z486ForNumCol = A486ForNumCol ;
         Z6369Lb_fam1 = A6369Lb_fam1 ;
         Z6370Lb_fam2 = A6370Lb_fam2 ;
         Z6371Lb_fam3 = A6371Lb_fam3 ;
         Z310ColUltLin = A310ColUltLin ;
         Z315ContNum = A315ContNum ;
         Z318CosKgm = A318CosKgm ;
         Z396EmprCod = A396EmprCod ;
         Z6310Lb_TaAuxC = A6310Lb_TaAuxC ;
         Z407EmprNom = A407EmprNom ;
         Z3915EmpNumDec = A3915EmpNumDec ;
         Z7259PrdHorMax = A7259PrdHorMax ;
         Z5166CosKgmF = A5166CosKgmF ;
         Z5361ForCanSum = A5361ForCanSum ;
         Z13757ColLinMax = A13757ColLinMax ;
         Z6311Lb_TaAuxD = A6311Lb_TaAuxD ;
      }
   }

   public void standaloneNotModal( )
   {
      edtForNumCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Enabled), 5, 0), true);
      edtavPrdrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdrgb_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      AV98Pgmname = "FormulacionTinte.TDFORMU" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98Pgmname", AV98Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtForNumCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV31EmprCod)==0) )
      {
         A396EmprCod = AV31EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T000Q16 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T000Q16_A407EmprNom[0] ;
      n407EmprNom = T000Q16_n407EmprNom[0] ;
      A3915EmpNumDec = T000Q16_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T000Q16_n3915EmpNumDec[0] ;
      pr_default.close(8);
      /* Using cursor T000Q19 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A7259PrdHorMax = T000Q19_A7259PrdHorMax[0] ;
         n7259PrdHorMax = T000Q19_n7259PrdHorMax[0] ;
      }
      else
      {
         A7259PrdHorMax = (byte)(0) ;
         n7259PrdHorMax = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7259PrdHorMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7259PrdHorMax), 2, 0));
      }
      pr_default.close(10);
      A6220EmprCodV3 = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A6220EmprCodV3", A6220EmprCodV3);
      GXt_int5 = (byte)(0) ;
      GXv_int12[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV31EmprCod, httpContext.getMessage( httpContext.getMessage( "SIALCA", ""), ""), GXv_int12) ;
      tdformu_impl.this.GXt_int5 = GXv_int12[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divDvpanel_unnamedtable2_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable2_cell_Internalname, "Class", divDvpanel_unnamedtable2_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int12[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( AV31EmprCod, httpContext.getMessage( httpContext.getMessage( "SIALCA", ""), ""), GXv_int12) ;
         tdformu_impl.this.GXt_int5 = GXv_int12[0] ;
         if ( GXt_int5 == 1 )
         {
            divDvpanel_unnamedtable2_cell_Class = httpContext.getMessage( "col-xs-12 CellMarginTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable2_cell_Internalname, "Class", divDvpanel_unnamedtable2_cell_Class, true);
         }
      }
      if ( ! (0==AV61ForNumCol) )
      {
         A486ForNumCol = AV61ForNumCol ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
      }
      if ( true /* Level */ && true /* After */ && ( AV47prdaux == 1 ) && ! (GXutil.strcmp("", A6310Lb_TaAuxC)==0) && ( GXutil.strcmp(A6310Lb_TaAuxC, AV53TaauxcOld) != 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A6310Lb_TaAuxC ;
         GXv_int12[0] = A6369Lb_fam1 ;
         GXv_int11[0] = A6370Lb_fam2 ;
         GXv_int10[0] = A6371Lb_fam3 ;
         new app.pprdaux(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int12, GXv_int11, GXv_int10) ;
         tdformu_impl.this.A396EmprCod = GXv_char4[0] ;
         tdformu_impl.this.A6310Lb_TaAuxC = GXv_char3[0] ;
         tdformu_impl.this.A6369Lb_fam1 = GXv_int12[0] ;
         tdformu_impl.this.A6370Lb_fam2 = GXv_int11[0] ;
         tdformu_impl.this.A6371Lb_fam3 = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         httpContext.ajax_rsp_assign_attri("", false, "A6369Lb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6369Lb_fam1), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6370Lb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6370Lb_fam2), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6371Lb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6371Lb_fam3), 2, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV65Insert_Lb_TaAuxC)==0) )
      {
         edtLb_TaAuxC_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxC_Enabled), 5, 0), true);
      }
      else
      {
         edtLb_TaAuxC_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxC_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV65Insert_Lb_TaAuxC)==0) )
      {
         A6310Lb_TaAuxC = AV65Insert_Lb_TaAuxC ;
         n6310Lb_TaAuxC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
      }
      else
      {
         if ( (GXutil.strcmp("", AV80ComboLb_TaAuxC)==0) )
         {
            A6310Lb_TaAuxC = "" ;
            n6310Lb_TaAuxC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
            n6310Lb_TaAuxC = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV80ComboLb_TaAuxC)==0) )
            {
               A6310Lb_TaAuxC = AV80ComboLb_TaAuxC ;
               n6310Lb_TaAuxC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
            }
         }
      }
      A6369Lb_fam1 = AV78ComboLb_fam1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6369Lb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6369Lb_fam1), 2, 0));
      A6370Lb_fam2 = AV84ComboLb_fam2 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6370Lb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6370Lb_fam2), 2, 0));
      A6371Lb_fam3 = AV86ComboLb_fam3 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6371Lb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6371Lb_fam3), 2, 0));
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtntrn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtntrn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T000Q21 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            A5166CosKgmF = T000Q21_A5166CosKgmF[0] ;
            n5166CosKgmF = T000Q21_n5166CosKgmF[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         }
         else
         {
            A5166CosKgmF = DecimalUtil.doubleToDec(0) ;
            n5166CosKgmF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         }
         O5166CosKgmF = A5166CosKgmF ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         pr_default.close(11);
         /* Using cursor T000Q13 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(5) != 101) )
         {
            A5361ForCanSum = T000Q13_A5361ForCanSum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
            A13757ColLinMax = T000Q13_A13757ColLinMax[0] ;
         }
         else
         {
            A5361ForCanSum = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
            A13757ColLinMax = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13757ColLinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13757ColLinMax), 3, 0));
         }
         O5361ForCanSum = A5361ForCanSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         pr_default.close(5);
         A6221ForNumColV = A486ForNumCol ;
         httpContext.ajax_rsp_assign_attri("", false, "A6221ForNumColV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6221ForNumColV), 8, 0));
         /* Using cursor T000Q17 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
         A6311Lb_TaAuxD = T000Q17_A6311Lb_TaAuxD[0] ;
         pr_default.close(9);
         AV53TaauxcOld = O6310Lb_TaAuxC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53TaauxcOld", AV53TaauxcOld);
      }
   }

   public void load0Q32( )
   {
      /* Using cursor T000Q25 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound32 = (short)(1) ;
         A6369Lb_fam1 = T000Q25_A6369Lb_fam1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6369Lb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6369Lb_fam1), 2, 0));
         A6370Lb_fam2 = T000Q25_A6370Lb_fam2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6370Lb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6370Lb_fam2), 2, 0));
         A6371Lb_fam3 = T000Q25_A6371Lb_fam3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6371Lb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6371Lb_fam3), 2, 0));
         A310ColUltLin = T000Q25_A310ColUltLin[0] ;
         A315ContNum = T000Q25_A315ContNum[0] ;
         A318CosKgm = T000Q25_A318CosKgm[0] ;
         A407EmprNom = T000Q25_A407EmprNom[0] ;
         n407EmprNom = T000Q25_n407EmprNom[0] ;
         A3915EmpNumDec = T000Q25_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T000Q25_n3915EmpNumDec[0] ;
         A6311Lb_TaAuxD = T000Q25_A6311Lb_TaAuxD[0] ;
         A6310Lb_TaAuxC = T000Q25_A6310Lb_TaAuxC[0] ;
         n6310Lb_TaAuxC = T000Q25_n6310Lb_TaAuxC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         A5166CosKgmF = T000Q25_A5166CosKgmF[0] ;
         n5166CosKgmF = T000Q25_n5166CosKgmF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         A5361ForCanSum = T000Q25_A5361ForCanSum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         A7259PrdHorMax = T000Q25_A7259PrdHorMax[0] ;
         n7259PrdHorMax = T000Q25_n7259PrdHorMax[0] ;
         A13757ColLinMax = T000Q25_A13757ColLinMax[0] ;
         zm0Q32( -45) ;
      }
      pr_default.close(12);
      onLoadActions0Q32( ) ;
   }

   public void onLoadActions0Q32( )
   {
      O5166CosKgmF = A5166CosKgmF ;
      n5166CosKgmF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      O5361ForCanSum = A5361ForCanSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      A6221ForNumColV = A486ForNumCol ;
      httpContext.ajax_rsp_assign_attri("", false, "A6221ForNumColV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6221ForNumColV), 8, 0));
      AV53TaauxcOld = O6310Lb_TaAuxC ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TaauxcOld", AV53TaauxcOld);
   }

   public void checkExtendedTable0Q32( )
   {
      nIsDirty_32 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_32 = (short)(1) ;
      A6221ForNumColV = A486ForNumCol ;
      httpContext.ajax_rsp_assign_attri("", false, "A6221ForNumColV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6221ForNumColV), 8, 0));
      AV53TaauxcOld = O6310Lb_TaAuxC ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TaauxcOld", AV53TaauxcOld);
      /* Using cursor T000Q17 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A6310Lb_TaAuxC)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS005", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_TAAUXC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_TaAuxC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6311Lb_TaAuxD = T000Q17_A6311Lb_TaAuxD[0] ;
      pr_default.close(9);
      /* Using cursor T000Q21 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         A5166CosKgmF = T000Q21_A5166CosKgmF[0] ;
         n5166CosKgmF = T000Q21_n5166CosKgmF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      }
      else
      {
         nIsDirty_32 = (short)(1) ;
         A5166CosKgmF = DecimalUtil.doubleToDec(0) ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      }
      pr_default.close(11);
      /* Using cursor T000Q13 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A5361ForCanSum = T000Q13_A5361ForCanSum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         A13757ColLinMax = T000Q13_A13757ColLinMax[0] ;
      }
      else
      {
         nIsDirty_32 = (short)(1) ;
         A5361ForCanSum = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         nIsDirty_32 = (short)(1) ;
         A13757ColLinMax = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13757ColLinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13757ColLinMax), 3, 0));
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursors0Q32( )
   {
      pr_default.close(9);
      pr_default.close(11);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_47( String A396EmprCod ,
                          String A6310Lb_TaAuxC )
   {
      /* Using cursor T000Q26 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A6310Lb_TaAuxC)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS005", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_TAAUXC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_TaAuxC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6311Lb_TaAuxD = T000Q26_A6311Lb_TaAuxD[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6311Lb_TaAuxD))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_49( String A396EmprCod ,
                          int A486ForNumCol )
   {
      /* Using cursor T000Q28 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A5166CosKgmF = T000Q28_A5166CosKgmF[0] ;
         n5166CosKgmF = T000Q28_n5166CosKgmF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      }
      else
      {
         A5166CosKgmF = DecimalUtil.doubleToDec(0) ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5166CosKgmF, (byte)(13), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_50( String A396EmprCod ,
                          int A486ForNumCol )
   {
      /* Using cursor T000Q30 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A5361ForCanSum = T000Q30_A5361ForCanSum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         A13757ColLinMax = T000Q30_A13757ColLinMax[0] ;
      }
      else
      {
         A5361ForCanSum = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         A13757ColLinMax = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13757ColLinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13757ColLinMax), 3, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5361ForCanSum, (byte)(11), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13757ColLinMax, (byte)(3), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void getKey0Q32( )
   {
      /* Using cursor T000Q31 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound32 = (short)(1) ;
      }
      else
      {
         RcdFound32 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000Q15 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T000Q15_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm0Q32( 45) ;
         RcdFound32 = (short)(1) ;
         A486ForNumCol = T000Q15_A486ForNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A6369Lb_fam1 = T000Q15_A6369Lb_fam1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6369Lb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6369Lb_fam1), 2, 0));
         A6370Lb_fam2 = T000Q15_A6370Lb_fam2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6370Lb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6370Lb_fam2), 2, 0));
         A6371Lb_fam3 = T000Q15_A6371Lb_fam3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6371Lb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6371Lb_fam3), 2, 0));
         A310ColUltLin = T000Q15_A310ColUltLin[0] ;
         A315ContNum = T000Q15_A315ContNum[0] ;
         A318CosKgm = T000Q15_A318CosKgm[0] ;
         A6310Lb_TaAuxC = T000Q15_A6310Lb_TaAuxC[0] ;
         n6310Lb_TaAuxC = T000Q15_n6310Lb_TaAuxC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         O310ColUltLin = A310ColUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
         O6310Lb_TaAuxC = A6310Lb_TaAuxC ;
         n6310Lb_TaAuxC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         Z396EmprCod = A396EmprCod ;
         Z486ForNumCol = A486ForNumCol ;
         sMode32 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load0Q32( ) ;
         if ( AnyError == 1 )
         {
            RcdFound32 = (short)(0) ;
            initializeNonKey0Q32( ) ;
         }
         Gx_mode = sMode32 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound32 = (short)(0) ;
         initializeNonKey0Q32( ) ;
         sMode32 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode32 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKey0Q32( ) ;
      if ( RcdFound32 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound32 = (short)(0) ;
      /* Using cursor T000Q32 */
      pr_default.execute(17, new Object[] {Integer.valueOf(A486ForNumCol), A396EmprCod});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( T000Q32_A486ForNumCol[0] < A486ForNumCol ) ) && ( GXutil.strcmp(T000Q32_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( T000Q32_A486ForNumCol[0] > A486ForNumCol ) ) && ( GXutil.strcmp(T000Q32_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A486ForNumCol = T000Q32_A486ForNumCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
            RcdFound32 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void move_previous( )
   {
      RcdFound32 = (short)(0) ;
      /* Using cursor T000Q33 */
      pr_default.execute(18, new Object[] {Integer.valueOf(A486ForNumCol), A396EmprCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( T000Q33_A486ForNumCol[0] > A486ForNumCol ) ) && ( GXutil.strcmp(T000Q33_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( T000Q33_A486ForNumCol[0] < A486ForNumCol ) ) && ( GXutil.strcmp(T000Q33_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A486ForNumCol = T000Q33_A486ForNumCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
            RcdFound32 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0Q32( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A310ColUltLin = O310ColUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
         A5166CosKgmF = O5166CosKgmF ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         A5361ForCanSum = O5361ForCanSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         GX_FocusControl = edtLb_TaAuxC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0Q32( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound32 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A486ForNumCol != Z486ForNumCol ) )
            {
               A486ForNumCol = Z486ForNumCol ;
               httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "FORNUMCOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForNumCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A310ColUltLin = O310ColUltLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
               A5166CosKgmF = O5166CosKgmF ;
               n5166CosKgmF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
               A5361ForCanSum = O5361ForCanSum ;
               httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtLb_TaAuxC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A310ColUltLin = O310ColUltLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
               A5166CosKgmF = O5166CosKgmF ;
               n5166CosKgmF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
               A5361ForCanSum = O5361ForCanSum ;
               httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
               update0Q32( ) ;
               GX_FocusControl = edtLb_TaAuxC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A486ForNumCol != Z486ForNumCol ) )
            {
               /* Insert record */
               A310ColUltLin = O310ColUltLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
               A5166CosKgmF = O5166CosKgmF ;
               n5166CosKgmF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
               A5361ForCanSum = O5361ForCanSum ;
               httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
               GX_FocusControl = edtLb_TaAuxC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0Q32( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "FORNUMCOL");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtForNumCol_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A310ColUltLin = O310ColUltLin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
                  A5166CosKgmF = O5166CosKgmF ;
                  n5166CosKgmF = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
                  A5361ForCanSum = O5361ForCanSum ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
                  GX_FocusControl = edtLb_TaAuxC_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0Q32( ) ;
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
      if ( isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A486ForNumCol != Z486ForNumCol ) )
      {
         A486ForNumCol = Z486ForNumCol ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "FORNUMCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForNumCol_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A310ColUltLin = O310ColUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
         A5166CosKgmF = O5166CosKgmF ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         A5361ForCanSum = O5361ForCanSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtLb_TaAuxC_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0Q32( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T000Q14 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCDFORM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(6) == 101) || ( Z6369Lb_fam1 != T000Q14_A6369Lb_fam1[0] ) || ( Z6370Lb_fam2 != T000Q14_A6370Lb_fam2[0] ) || ( Z6371Lb_fam3 != T000Q14_A6371Lb_fam3[0] ) || ( Z310ColUltLin != T000Q14_A310ColUltLin[0] ) || ( Z315ContNum != T000Q14_A315ContNum[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z318CosKgm, T000Q14_A318CosKgm[0]) != 0 ) || ( GXutil.strcmp(Z6310Lb_TaAuxC, T000Q14_A6310Lb_TaAuxC[0]) != 0 ) )
         {
            if ( Z6369Lb_fam1 != T000Q14_A6369Lb_fam1[0] )
            {
               GXutil.writeLogln("formulaciontinte.tdformu:[seudo value changed for attri]"+"Lb_fam1");
               GXutil.writeLogRaw("Old: ",Z6369Lb_fam1);
               GXutil.writeLogRaw("Current: ",T000Q14_A6369Lb_fam1[0]);
            }
            if ( Z6370Lb_fam2 != T000Q14_A6370Lb_fam2[0] )
            {
               GXutil.writeLogln("formulaciontinte.tdformu:[seudo value changed for attri]"+"Lb_fam2");
               GXutil.writeLogRaw("Old: ",Z6370Lb_fam2);
               GXutil.writeLogRaw("Current: ",T000Q14_A6370Lb_fam2[0]);
            }
            if ( Z6371Lb_fam3 != T000Q14_A6371Lb_fam3[0] )
            {
               GXutil.writeLogln("formulaciontinte.tdformu:[seudo value changed for attri]"+"Lb_fam3");
               GXutil.writeLogRaw("Old: ",Z6371Lb_fam3);
               GXutil.writeLogRaw("Current: ",T000Q14_A6371Lb_fam3[0]);
            }
            if ( Z310ColUltLin != T000Q14_A310ColUltLin[0] )
            {
               GXutil.writeLogln("formulaciontinte.tdformu:[seudo value changed for attri]"+"ColUltLin");
               GXutil.writeLogRaw("Old: ",Z310ColUltLin);
               GXutil.writeLogRaw("Current: ",T000Q14_A310ColUltLin[0]);
            }
            if ( Z315ContNum != T000Q14_A315ContNum[0] )
            {
               GXutil.writeLogln("formulaciontinte.tdformu:[seudo value changed for attri]"+"ContNum");
               GXutil.writeLogRaw("Old: ",Z315ContNum);
               GXutil.writeLogRaw("Current: ",T000Q14_A315ContNum[0]);
            }
            if ( DecimalUtil.compareTo(Z318CosKgm, T000Q14_A318CosKgm[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tdformu:[seudo value changed for attri]"+"CosKgm");
               GXutil.writeLogRaw("Old: ",Z318CosKgm);
               GXutil.writeLogRaw("Current: ",T000Q14_A318CosKgm[0]);
            }
            if ( GXutil.strcmp(Z6310Lb_TaAuxC, T000Q14_A6310Lb_TaAuxC[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tdformu:[seudo value changed for attri]"+"Lb_TaAuxC");
               GXutil.writeLogRaw("Old: ",Z6310Lb_TaAuxC);
               GXutil.writeLogRaw("Current: ",T000Q14_A6310Lb_TaAuxC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCDFORM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0Q32( )
   {
      beforeValidate0Q32( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Q32( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0Q32( 0) ;
         checkOptimisticConcurrency0Q32( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Q32( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0Q32( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Q34 */
                  pr_default.execute(19, new Object[] {Integer.valueOf(A486ForNumCol), Byte.valueOf(A6369Lb_fam1), Byte.valueOf(A6370Lb_fam2), Byte.valueOf(A6371Lb_fam3), Short.valueOf(A310ColUltLin), Integer.valueOf(A315ContNum), A318CosKgm, A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
                  if ( (pr_default.getStatus(19) == 1) )
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
                        processLevel0Q32( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption0Q0( ) ;
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
            load0Q32( ) ;
         }
         endLevel0Q32( ) ;
      }
      closeExtendedTableCursors0Q32( ) ;
   }

   public void update0Q32( )
   {
      beforeValidate0Q32( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Q32( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Q32( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Q32( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0Q32( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Q35 */
                  pr_default.execute(20, new Object[] {Byte.valueOf(A6369Lb_fam1), Byte.valueOf(A6370Lb_fam2), Byte.valueOf(A6371Lb_fam3), Short.valueOf(A310ColUltLin), Integer.valueOf(A315ContNum), A318CosKgm, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC, A396EmprCod, Integer.valueOf(A486ForNumCol)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
                  if ( (pr_default.getStatus(20) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCDFORM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0Q32( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0Q32( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
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
         }
         endLevel0Q32( ) ;
      }
      closeExtendedTableCursors0Q32( ) ;
   }

   public void deferredUpdate0Q32( )
   {
   }

   public void delete( )
   {
      beforeValidate0Q32( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Q32( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0Q32( ) ;
         afterConfirm0Q32( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0Q32( ) ;
            if ( AnyError == 0 )
            {
               A310ColUltLin = O310ColUltLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
               A5166CosKgmF = O5166CosKgmF ;
               n5166CosKgmF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
               A5361ForCanSum = O5361ForCanSum ;
               httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
               scanStart0Q33( ) ;
               while ( RcdFound33 != 0 )
               {
                  getByPrimaryKey0Q33( ) ;
                  delete0Q33( ) ;
                  scanNext0Q33( ) ;
                  O310ColUltLin = A310ColUltLin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
                  O5166CosKgmF = A5166CosKgmF ;
                  n5166CosKgmF = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
                  O5361ForCanSum = A5361ForCanSum ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
               }
               scanEnd0Q33( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Q36 */
                  pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isUpd( ) || isDlt( ) )
                        {
                           if ( AnyError == 0 )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
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
         }
      }
      sMode32 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0Q32( ) ;
      Gx_mode = sMode32 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0Q32( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A6221ForNumColV = A486ForNumCol ;
         httpContext.ajax_rsp_assign_attri("", false, "A6221ForNumColV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6221ForNumColV), 8, 0));
         AV53TaauxcOld = O6310Lb_TaAuxC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53TaauxcOld", AV53TaauxcOld);
         /* Using cursor T000Q37 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
         A6311Lb_TaAuxD = T000Q37_A6311Lb_TaAuxD[0] ;
         pr_default.close(22);
         /* Using cursor T000Q39 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            A5166CosKgmF = T000Q39_A5166CosKgmF[0] ;
            n5166CosKgmF = T000Q39_n5166CosKgmF[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         }
         else
         {
            A5166CosKgmF = DecimalUtil.doubleToDec(0) ;
            n5166CosKgmF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         }
         pr_default.close(23);
         /* Using cursor T000Q41 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            A5361ForCanSum = T000Q41_A5361ForCanSum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
            A13757ColLinMax = T000Q41_A13757ColLinMax[0] ;
         }
         else
         {
            A5361ForCanSum = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
            A13757ColLinMax = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13757ColLinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13757ColLinMax), 3, 0));
         }
         pr_default.close(24);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000Q42 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T000Q43 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
      }
   }

   public void processNestedLevel0Q33( )
   {
      s310ColUltLin = O310ColUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
      s5166CosKgmF = O5166CosKgmF ;
      n5166CosKgmF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      s5361ForCanSum = O5361ForCanSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      nGXsfl_103_idx = 0 ;
      while ( nGXsfl_103_idx < nRC_GXsfl_103 )
      {
         readRow0Q33( ) ;
         if ( ( nRcdExists_33 != 0 ) || ( nIsMod_33 != 0 ) )
         {
            standaloneNotModal0Q33( ) ;
            getKey0Q33( ) ;
            if ( ( nRcdExists_33 == 0 ) && ( nRcdDeleted_33 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert0Q33( ) ;
            }
            else
            {
               if ( RcdFound33 != 0 )
               {
                  if ( ( nRcdDeleted_33 != 0 ) && ( nRcdExists_33 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete0Q33( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_33 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update0Q33( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_33 == 0 )
                  {
                     GXCCtl = "COLLIN_" + sGXsfl_103_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtColLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O310ColUltLin = A310ColUltLin ;
            httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
            O5166CosKgmF = A5166CosKgmF ;
            n5166CosKgmF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
            O5361ForCanSum = A5361ForCanSum ;
            httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         }
         httpContext.changePostValue( edtColLin_Internalname, GXutil.ltrim( localUtil.ntoc( A309ColLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtValCod_Internalname, GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForCan_Internalname, GXutil.ltrim( localUtil.ntoc( A481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtPrdRGB_Internalname, GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavPrdrgb_Internalname, GXutil.ltrim( localUtil.ntoc( AV68PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavR_Internalname, GXutil.ltrim( localUtil.ntoc( AV69R, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavG_Internalname, GXutil.ltrim( localUtil.ntoc( AV70G, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavB_Internalname, GXutil.ltrim( localUtil.ntoc( AV71B, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavR2_Internalname, GXutil.ltrim( localUtil.ntoc( AV72R2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavG2_Internalname, GXutil.ltrim( localUtil.ntoc( AV73G2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtavB2_Internalname, GXutil.ltrim( localUtil.ntoc( AV74B2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtColFibra_Internalname, GXutil.rtrim( A13926ColFibra)) ;
         httpContext.changePostValue( "ZT_"+"Z309ColLin_"+sGXsfl_103_idx, GXutil.ltrim( localUtil.ntoc( Z309ColLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z481ForCan_"+sGXsfl_103_idx, GXutil.ltrim( localUtil.ntoc( Z481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z838TotLinCol_"+sGXsfl_103_idx, GXutil.ltrim( localUtil.ntoc( Z838TotLinCol, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6193ForClaCol_"+sGXsfl_103_idx, GXutil.rtrim( Z6193ForClaCol)) ;
         httpContext.changePostValue( "ZT_"+"Z13926ColFibra_"+sGXsfl_103_idx, GXutil.rtrim( Z13926ColFibra)) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_103_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_103_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T481ForCan_"+sGXsfl_103_idx, GXutil.ltrim( localUtil.ntoc( O481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T719PrdNum_"+sGXsfl_103_idx, GXutil.rtrim( O719PrdNum)) ;
         httpContext.changePostValue( "T5167TotLinCoF_"+sGXsfl_103_idx, GXutil.ltrim( localUtil.ntoc( O5167TotLinCoF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_33_"+sGXsfl_103_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_33, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_33_"+sGXsfl_103_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_33, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_33_"+sGXsfl_103_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_33, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_33 != 0 )
         {
            httpContext.changePostValue( "COLLIN_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VALCOD_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtValCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPREACT_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORCAN_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDRGB_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdRGB_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vPRDRGB_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdrgb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vR_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vG_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavG_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vB_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavB_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vR2_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavR2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vG2_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavG2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vB2_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavB2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COLFIBRA_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColFibra_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T000Q41 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         A13757ColLinMax = T000Q41_A13757ColLinMax[0] ;
      }
      else
      {
         A5361ForCanSum = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         A13757ColLinMax = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13757ColLinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13757ColLinMax), 3, 0));
      }
      /* End of After( level) rules */
      initAll0Q33( ) ;
      if ( AnyError != 0 )
      {
         O310ColUltLin = s310ColUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
         O5166CosKgmF = s5166CosKgmF ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         O5361ForCanSum = s5361ForCanSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      }
      nRcdExists_33 = (short)(0) ;
      nIsMod_33 = (short)(0) ;
      nRcdDeleted_33 = (short)(0) ;
   }

   public void processLevel0Q32( )
   {
      /* Save parent mode. */
      sMode32 = Gx_mode ;
      processNestedLevel0Q33( ) ;
      if ( AnyError != 0 )
      {
         O310ColUltLin = s310ColUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
         O5166CosKgmF = s5166CosKgmF ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         O5361ForCanSum = s5361ForCanSum ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      }
      /* Restore parent mode. */
      Gx_mode = sMode32 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T000Q44 */
      pr_default.execute(27, new Object[] {Short.valueOf(A310ColUltLin), A396EmprCod, Integer.valueOf(A486ForNumCol)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
   }

   public void endLevel0Q32( )
   {
      pr_default.close(6);
      if ( AnyError == 0 )
      {
         beforeComplete0Q32( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.tdformu");
         if ( AnyError == 0 )
         {
            confirmValues0Q0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.tdformu");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0Q32( )
   {
      /* Scan By routine */
      /* Using cursor T000Q45 */
      pr_default.execute(28, new Object[] {A396EmprCod});
      RcdFound32 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound32 = (short)(1) ;
         A486ForNumCol = T000Q45_A486ForNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0Q32( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound32 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound32 = (short)(1) ;
         A486ForNumCol = T000Q45_A486ForNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
      }
   }

   public void scanEnd0Q32( )
   {
      pr_default.close(28);
   }

   public void afterConfirm0Q32( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0Q32( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0Q32( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0Q32( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0Q32( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0Q32( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0Q32( )
   {
      edtForNumCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Enabled), 5, 0), true);
      edtCosKgmF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCosKgmF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCosKgmF_Enabled), 5, 0), true);
      edtLb_TaAuxC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_TaAuxC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_TaAuxC_Enabled), 5, 0), true);
      edtLb_fam1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_fam1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_fam1_Enabled), 5, 0), true);
      edtLb_fam2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_fam2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_fam2_Enabled), 5, 0), true);
      edtLb_fam3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_fam3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_fam3_Enabled), 5, 0), true);
      edtavTittxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTittxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTittxt_Enabled), 5, 0), true);
      edtForCanSum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForCanSum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForCanSum_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombolb_taauxc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_taauxc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_taauxc_Enabled), 5, 0), true);
      edtavCombolb_fam1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_fam1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_fam1_Enabled), 5, 0), true);
      edtavCombolb_fam2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_fam2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_fam2_Enabled), 5, 0), true);
      edtavCombolb_fam3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombolb_fam3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombolb_fam3_Enabled), 5, 0), true);
   }

   public void zm0Q33( int GX_JID )
   {
      if ( ( GX_JID == 51 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z481ForCan = T000Q3_A481ForCan[0] ;
            Z838TotLinCol = T000Q3_A838TotLinCol[0] ;
            Z6193ForClaCol = T000Q3_A6193ForClaCol[0] ;
            Z13926ColFibra = T000Q3_A13926ColFibra[0] ;
            Z719PrdNum = T000Q3_A719PrdNum[0] ;
            Z490ForPrdUMe = T000Q3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z481ForCan = A481ForCan ;
            Z838TotLinCol = A838TotLinCol ;
            Z6193ForClaCol = A6193ForClaCol ;
            Z13926ColFibra = A13926ColFibra ;
            Z719PrdNum = A719PrdNum ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -51 )
      {
         Z486ForNumCol = A486ForNumCol ;
         Z309ColLin = A309ColLin ;
         Z481ForCan = A481ForCan ;
         Z838TotLinCol = A838TotLinCol ;
         Z6193ForClaCol = A6193ForClaCol ;
         Z13926ColFibra = A13926ColFibra ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z718PrdNom = A718PrdNom ;
         Z4338PrdUMeFo = A4338PrdUMeFo ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z7260PrdHorMad = A7260PrdHorMad ;
         Z13232PrdRGB = A13232PrdRGB ;
         Z707PrdFacCon = A707PrdFacCon ;
         Z856ValCod = A856ValCod ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal0Q33( )
   {
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtValCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValCod_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtPrdPreAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtPrdRGB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRGB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRGB_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtColFibra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColFibra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColFibra_Enabled), 5, 0), !bGXsfl_103_Refreshing);
   }

   public void standaloneModal0Q33( )
   {
      if ( isIns( )  )
      {
         A310ColUltLin = (short)(O310ColUltLin+10) ;
         httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A309ColLin = A310ColUltLin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtColLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtColLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColLin_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      }
      else
      {
         edtColLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtColLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColLin_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         A6222ColLinV = A309ColLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A6222ColLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6222ColLinV), 3, 0));
         /* Using cursor T000Q9 */
         pr_default.execute(2, new Object[] {Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV)});
         if ( (pr_default.getStatus(2) != 101) )
         {
            A6223PrdNumMax = T000Q9_A6223PrdNumMax[0] ;
            n6223PrdNumMax = T000Q9_n6223PrdNumMax[0] ;
         }
         else
         {
            A6223PrdNumMax = "" ;
            n6223PrdNumMax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6223PrdNumMax", A6223PrdNumMax);
         }
         pr_default.close(2);
      }
   }

   public void load0Q33( )
   {
      /* Using cursor T000Q46 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound33 = (short)(1) ;
         A718PrdNom = T000Q46_A718PrdNom[0] ;
         A4338PrdUMeFo = T000Q46_A4338PrdUMeFo[0] ;
         A724PrdPreAct = T000Q46_A724PrdPreAct[0] ;
         A488ForPrdDsc = T000Q46_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T000Q46_n488ForPrdDsc[0] ;
         A481ForCan = T000Q46_A481ForCan[0] ;
         A838TotLinCol = T000Q46_A838TotLinCol[0] ;
         A6193ForClaCol = T000Q46_A6193ForClaCol[0] ;
         A7260PrdHorMad = T000Q46_A7260PrdHorMad[0] ;
         A13232PrdRGB = T000Q46_A13232PrdRGB[0] ;
         A13926ColFibra = T000Q46_A13926ColFibra[0] ;
         n13926ColFibra = T000Q46_n13926ColFibra[0] ;
         A707PrdFacCon = T000Q46_A707PrdFacCon[0] ;
         A719PrdNum = T000Q46_A719PrdNum[0] ;
         A490ForPrdUMe = T000Q46_A490ForPrdUMe[0] ;
         A856ValCod = T000Q46_A856ValCod[0] ;
         zm0Q33( -51) ;
      }
      pr_default.close(29);
      onLoadActions0Q33( ) ;
   }

   public void onLoadActions0Q33( )
   {
      if ( isIns( )  )
      {
         A490ForPrdUMe = A4338PrdUMeFo ;
      }
      A5167TotLinCoF = (DecimalUtil.doubleToDec(A315ContNum).multiply(A481ForCan).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A724PrdPreAct).multiply(A707PrdFacCon) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5167TotLinCoF", GXutil.ltrimstr( A5167TotLinCoF, 13, 5));
      O5167TotLinCoF = A5167TotLinCoF ;
      httpContext.ajax_rsp_assign_attri("", false, "A5167TotLinCoF", GXutil.ltrimstr( A5167TotLinCoF, 13, 5));
      if ( isIns( )  )
      {
         A5166CosKgmF = O5166CosKgmF.add(A5167TotLinCoF) ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            A5166CosKgmF = O5166CosKgmF.add(A5167TotLinCoF).subtract(O5167TotLinCoF) ;
            n5166CosKgmF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               A5166CosKgmF = O5166CosKgmF.subtract(O5167TotLinCoF) ;
               n5166CosKgmF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
            }
         }
      }
      A6222ColLinV = A309ColLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A6222ColLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6222ColLinV), 3, 0));
      /* Using cursor T000Q9 */
      pr_default.execute(2, new Object[] {Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A6223PrdNumMax = T000Q9_A6223PrdNumMax[0] ;
         n6223PrdNumMax = T000Q9_n6223PrdNumMax[0] ;
      }
      else
      {
         A6223PrdNumMax = "" ;
         n6223PrdNumMax = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6223PrdNumMax", A6223PrdNumMax);
      }
      pr_default.close(2);
      if ( isIns( )  )
      {
         A5361ForCanSum = O5361ForCanSum.add(A481ForCan) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            A5361ForCanSum = O5361ForCanSum.add(A481ForCan).subtract(O481ForCan) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               A5361ForCanSum = O5361ForCanSum.subtract(O481ForCan) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
            }
         }
      }
   }

   public void checkExtendedTable0Q33( )
   {
      nIsDirty_33 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal0Q33( ) ;
      /* Using cursor T000Q10 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_103_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T000Q10_A718PrdNom[0] ;
      A4338PrdUMeFo = T000Q10_A4338PrdUMeFo[0] ;
      A724PrdPreAct = T000Q10_A724PrdPreAct[0] ;
      A7260PrdHorMad = T000Q10_A7260PrdHorMad[0] ;
      A13232PrdRGB = T000Q10_A13232PrdRGB[0] ;
      A707PrdFacCon = T000Q10_A707PrdFacCon[0] ;
      A856ValCod = T000Q10_A856ValCod[0] ;
      pr_default.close(3);
      if ( isIns( )  )
      {
         nIsDirty_33 = (short)(1) ;
         A490ForPrdUMe = A4338PrdUMeFo ;
      }
      /* Using cursor T000Q11 */
      pr_default.execute(4, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_103_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T000Q11_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T000Q11_n488ForPrdDsc[0] ;
      pr_default.close(4);
      nIsDirty_33 = (short)(1) ;
      A5167TotLinCoF = (DecimalUtil.doubleToDec(A315ContNum).multiply(A481ForCan).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A724PrdPreAct).multiply(A707PrdFacCon) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5167TotLinCoF", GXutil.ltrimstr( A5167TotLinCoF, 13, 5));
      if ( isIns( )  )
      {
         nIsDirty_33 = (short)(1) ;
         A5166CosKgmF = O5166CosKgmF.add(A5167TotLinCoF) ;
         n5166CosKgmF = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_33 = (short)(1) ;
            A5166CosKgmF = O5166CosKgmF.add(A5167TotLinCoF).subtract(O5167TotLinCoF) ;
            n5166CosKgmF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_33 = (short)(1) ;
               A5166CosKgmF = O5166CosKgmF.subtract(O5167TotLinCoF) ;
               n5166CosKgmF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
            }
         }
      }
      nIsDirty_33 = (short)(1) ;
      A6222ColLinV = A309ColLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A6222ColLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6222ColLinV), 3, 0));
      /* Using cursor T000Q9 */
      pr_default.execute(2, new Object[] {Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A6223PrdNumMax = T000Q9_A6223PrdNumMax[0] ;
         n6223PrdNumMax = T000Q9_n6223PrdNumMax[0] ;
      }
      else
      {
         nIsDirty_33 = (short)(1) ;
         A6223PrdNumMax = "" ;
         n6223PrdNumMax = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6223PrdNumMax", A6223PrdNumMax);
      }
      pr_default.close(2);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_103_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  )
      {
         nIsDirty_33 = (short)(1) ;
         A5361ForCanSum = O5361ForCanSum.add(A481ForCan) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_33 = (short)(1) ;
            A5361ForCanSum = O5361ForCanSum.add(A481ForCan).subtract(O481ForCan) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_33 = (short)(1) ;
               A5361ForCanSum = O5361ForCanSum.subtract(O481ForCan) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
            }
         }
      }
   }

   public void closeExtendedTableCursors0Q33( )
   {
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(2);
   }

   public void enableDisable0Q33( )
   {
   }

   public void gxload_53( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T000Q47 */
      pr_default.execute(30, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(30) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_103_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T000Q47_A718PrdNom[0] ;
      A4338PrdUMeFo = T000Q47_A4338PrdUMeFo[0] ;
      A724PrdPreAct = T000Q47_A724PrdPreAct[0] ;
      A7260PrdHorMad = T000Q47_A7260PrdHorMad[0] ;
      A13232PrdRGB = T000Q47_A13232PrdRGB[0] ;
      A707PrdFacCon = T000Q47_A707PrdFacCon[0] ;
      A856ValCod = T000Q47_A856ValCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7260PrdHorMad, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(30) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(30);
   }

   public void gxload_54( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T000Q48 */
      pr_default.execute(31, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_103_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T000Q48_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T000Q48_n488ForPrdDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(31) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(31);
   }

   public void gxload_52( String A396EmprCod ,
                          int A486ForNumCol ,
                          short A309ColLin ,
                          short A6222ColLinV ,
                          String A6220EmprCodV3 ,
                          int A6221ForNumColV )
   {
      /* Using cursor T000Q54 */
      pr_default.execute(32, new Object[] {Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV)});
      if ( (pr_default.getStatus(32) != 101) )
      {
         A6223PrdNumMax = T000Q54_A6223PrdNumMax[0] ;
         n6223PrdNumMax = T000Q54_n6223PrdNumMax[0] ;
      }
      else
      {
         A6223PrdNumMax = "" ;
         n6223PrdNumMax = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6223PrdNumMax", A6223PrdNumMax);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6223PrdNumMax))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(32) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(32);
   }

   public void getKey0Q33( )
   {
      /* Using cursor T000Q55 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound33 = (short)(1) ;
      }
      else
      {
         RcdFound33 = (short)(0) ;
      }
      pr_default.close(33);
   }

   public void getByPrimaryKey0Q33( )
   {
      /* Using cursor T000Q3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T000Q3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm0Q33( 51) ;
         RcdFound33 = (short)(1) ;
         initializeNonKey0Q33( ) ;
         A309ColLin = T000Q3_A309ColLin[0] ;
         A481ForCan = T000Q3_A481ForCan[0] ;
         A838TotLinCol = T000Q3_A838TotLinCol[0] ;
         A6193ForClaCol = T000Q3_A6193ForClaCol[0] ;
         A13926ColFibra = T000Q3_A13926ColFibra[0] ;
         n13926ColFibra = T000Q3_n13926ColFibra[0] ;
         A719PrdNum = T000Q3_A719PrdNum[0] ;
         A490ForPrdUMe = T000Q3_A490ForPrdUMe[0] ;
         O481ForCan = A481ForCan ;
         O719PrdNum = A719PrdNum ;
         Z396EmprCod = A396EmprCod ;
         Z486ForNumCol = A486ForNumCol ;
         Z309ColLin = A309ColLin ;
         sMode33 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load0Q33( ) ;
         Gx_mode = sMode33 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound33 = (short)(0) ;
         initializeNonKey0Q33( ) ;
         sMode33 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0Q33( ) ;
         Gx_mode = sMode33 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes0Q33( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0Q33( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T000Q2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDFORM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z481ForCan, T000Q2_A481ForCan[0]) != 0 ) || ( DecimalUtil.compareTo(Z838TotLinCol, T000Q2_A838TotLinCol[0]) != 0 ) || ( GXutil.strcmp(Z6193ForClaCol, T000Q2_A6193ForClaCol[0]) != 0 ) || ( GXutil.strcmp(Z13926ColFibra, T000Q2_A13926ColFibra[0]) != 0 ) || ( GXutil.strcmp(Z719PrdNum, T000Q2_A719PrdNum[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z490ForPrdUMe != T000Q2_A490ForPrdUMe[0] ) )
         {
            if ( DecimalUtil.compareTo(Z481ForCan, T000Q2_A481ForCan[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tdformu:[seudo value changed for attri]"+"ForCan");
               GXutil.writeLogRaw("Old: ",Z481ForCan);
               GXutil.writeLogRaw("Current: ",T000Q2_A481ForCan[0]);
            }
            if ( DecimalUtil.compareTo(Z838TotLinCol, T000Q2_A838TotLinCol[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tdformu:[seudo value changed for attri]"+"TotLinCol");
               GXutil.writeLogRaw("Old: ",Z838TotLinCol);
               GXutil.writeLogRaw("Current: ",T000Q2_A838TotLinCol[0]);
            }
            if ( GXutil.strcmp(Z6193ForClaCol, T000Q2_A6193ForClaCol[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tdformu:[seudo value changed for attri]"+"ForClaCol");
               GXutil.writeLogRaw("Old: ",Z6193ForClaCol);
               GXutil.writeLogRaw("Current: ",T000Q2_A6193ForClaCol[0]);
            }
            if ( GXutil.strcmp(Z13926ColFibra, T000Q2_A13926ColFibra[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tdformu:[seudo value changed for attri]"+"ColFibra");
               GXutil.writeLogRaw("Old: ",Z13926ColFibra);
               GXutil.writeLogRaw("Current: ",T000Q2_A13926ColFibra[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T000Q2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.tdformu:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T000Q2_A719PrdNum[0]);
            }
            if ( Z490ForPrdUMe != T000Q2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("formulaciontinte.tdformu:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T000Q2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLDFORM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0Q33( )
   {
      beforeValidate0Q33( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Q33( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0Q33( 0) ;
         checkOptimisticConcurrency0Q33( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Q33( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0Q33( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Q56 */
                  pr_default.execute(34, new Object[] {Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin), A481ForCan, A838TotLinCol, A6193ForClaCol, Boolean.valueOf(n13926ColFibra), A13926ColFibra, A396EmprCod, A719PrdNum, Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
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
                        AV40Texto_i = httpContext.getMessage( httpContext.getMessage( "Inserta Producto ", ""), "") + A719PrdNum + " " + A718PrdNom + httpContext.getMessage( httpContext.getMessage( " Cantidad= ", ""), "") + GXutil.str( A481ForCan, 11, 5) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV40Texto_i", AV40Texto_i);
                     }
                     if ( true /* After */ && true /* Level */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV98Pgmname, AV23UsurCod, AV27Station, AV40Texto_i, A486ForNumCol, (byte)(0), "") ;
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
            load0Q33( ) ;
         }
         endLevel0Q33( ) ;
      }
      closeExtendedTableCursors0Q33( ) ;
   }

   public void update0Q33( )
   {
      beforeValidate0Q33( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Q33( ) ;
      }
      if ( ( nIsMod_33 != 0 ) || ( nIsDirty_33 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency0Q33( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm0Q33( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate0Q33( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T000Q57 */
                     pr_default.execute(35, new Object[] {A481ForCan, A838TotLinCol, A6193ForClaCol, Boolean.valueOf(n13926ColFibra), A13926ColFibra, A719PrdNum, Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
                     if ( (pr_default.getStatus(35) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLDFORM"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate0Q33( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( ( GXutil.strcmp(O719PrdNum, A719PrdNum) != 0 ) || ( DecimalUtil.compareTo(O481ForCan, A481ForCan) != 0 ) ) && true /* After */ && true /* Level */ )
                        {
                           AV40Texto_i = httpContext.getMessage( httpContext.getMessage( "Modifica Producto ", ""), "") + O719PrdNum + httpContext.getMessage( httpContext.getMessage( " Old Cantidad= ", ""), "") + GXutil.str( O481ForCan, 11, 5) + httpContext.getMessage( httpContext.getMessage( " por ", ""), "") + A719PrdNum + httpContext.getMessage( httpContext.getMessage( " Cantidad= ", ""), "") + GXutil.str( A481ForCan, 11, 5) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV40Texto_i", AV40Texto_i);
                        }
                        if ( true /* After */ && true /* Level */ )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV98Pgmname, AV23UsurCod, AV27Station, AV40Texto_i, A486ForNumCol, (byte)(0), "") ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey0Q33( ) ;
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
            endLevel0Q33( ) ;
         }
      }
      closeExtendedTableCursors0Q33( ) ;
   }

   public void deferredUpdate0Q33( )
   {
   }

   public void delete0Q33( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0Q33( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Q33( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0Q33( ) ;
         afterConfirm0Q33( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0Q33( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000Q58 */
               pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* After */ && true /* Level */ )
                  {
                     AV40Texto_i = httpContext.getMessage( httpContext.getMessage( "Elimina Producto ", ""), "") + A719PrdNum + A718PrdNom + httpContext.getMessage( httpContext.getMessage( " Cantidad= ", ""), "") + GXutil.str( A481ForCan, 11, 5) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV40Texto_i", AV40Texto_i);
                  }
                  if ( true /* After */ && true /* Level */ )
                  {
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV98Pgmname, AV23UsurCod, AV27Station, AV40Texto_i, A486ForNumCol, (byte)(0), "") ;
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
      sMode33 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0Q33( ) ;
      Gx_mode = sMode33 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0Q33( )
   {
      standaloneModal0Q33( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A6222ColLinV = A309ColLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A6222ColLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6222ColLinV), 3, 0));
         /* Using cursor T000Q64 */
         pr_default.execute(37, new Object[] {Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            A6223PrdNumMax = T000Q64_A6223PrdNumMax[0] ;
            n6223PrdNumMax = T000Q64_n6223PrdNumMax[0] ;
         }
         else
         {
            A6223PrdNumMax = "" ;
            n6223PrdNumMax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6223PrdNumMax", A6223PrdNumMax);
         }
         pr_default.close(37);
         /* Using cursor T000Q65 */
         pr_default.execute(38, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T000Q65_A718PrdNom[0] ;
         A4338PrdUMeFo = T000Q65_A4338PrdUMeFo[0] ;
         A724PrdPreAct = T000Q65_A724PrdPreAct[0] ;
         A7260PrdHorMad = T000Q65_A7260PrdHorMad[0] ;
         A13232PrdRGB = T000Q65_A13232PrdRGB[0] ;
         A707PrdFacCon = T000Q65_A707PrdFacCon[0] ;
         A856ValCod = T000Q65_A856ValCod[0] ;
         pr_default.close(38);
         /* Using cursor T000Q66 */
         pr_default.execute(39, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T000Q66_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T000Q66_n488ForPrdDsc[0] ;
         pr_default.close(39);
         A5167TotLinCoF = (DecimalUtil.doubleToDec(A315ContNum).multiply(A481ForCan).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A724PrdPreAct).multiply(A707PrdFacCon) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5167TotLinCoF", GXutil.ltrimstr( A5167TotLinCoF, 13, 5));
         if ( isIns( )  )
         {
            A5166CosKgmF = O5166CosKgmF.add(A5167TotLinCoF) ;
            n5166CosKgmF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
         }
         else
         {
            if ( isUpd( )  )
            {
               A5166CosKgmF = O5166CosKgmF.add(A5167TotLinCoF).subtract(O5167TotLinCoF) ;
               n5166CosKgmF = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A5166CosKgmF = O5166CosKgmF.subtract(O5167TotLinCoF) ;
                  n5166CosKgmF = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
               }
            }
         }
         if ( isIns( )  )
         {
            A5361ForCanSum = O5361ForCanSum.add(A481ForCan) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
         }
         else
         {
            if ( isUpd( )  )
            {
               A5361ForCanSum = O5361ForCanSum.add(A481ForCan).subtract(O481ForCan) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A5361ForCanSum = O5361ForCanSum.subtract(O481ForCan) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
               }
            }
         }
      }
   }

   public void endLevel0Q33( )
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

   public void scanStart0Q33( )
   {
      /* Scan By routine */
      /* Using cursor T000Q67 */
      pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      RcdFound33 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound33 = (short)(1) ;
         A309ColLin = T000Q67_A309ColLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0Q33( )
   {
      /* Scan next routine */
      pr_default.readNext(40);
      RcdFound33 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound33 = (short)(1) ;
         A309ColLin = T000Q67_A309ColLin[0] ;
      }
   }

   public void scanEnd0Q33( )
   {
      pr_default.close(40);
   }

   public void afterConfirm0Q33( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0Q33( )
   {
      /* Before Insert Rules */
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A481ForCan)==0) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "9") <= 0 ) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_103_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad nula", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void beforeUpdate0Q33( )
   {
      /* Before Update Rules */
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A481ForCan)==0) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "9") <= 0 ) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_103_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad nula", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void beforeDelete0Q33( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0Q33( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0Q33( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0Q33( )
   {
      edtColLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColLin_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtValCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValCod_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtPrdPreAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtForCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForCan_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtPrdRGB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRGB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRGB_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtColFibra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColFibra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColFibra_Enabled), 5, 0), !bGXsfl_103_Refreshing);
   }

   public void send_integrity_lvl_hashes0Q33( )
   {
   }

   public void send_integrity_lvl_hashes0Q32( )
   {
   }

   public void subsflControlProps_10333( )
   {
      edtColLin_Internalname = "COLLIN_"+sGXsfl_103_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_103_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_103_idx ;
      edtValCod_Internalname = "VALCOD_"+sGXsfl_103_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_103_idx ;
      edtForCan_Internalname = "FORCAN_"+sGXsfl_103_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_103_idx ;
      imgprompt_490_Internalname = "PROMPT_490_"+sGXsfl_103_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_103_idx ;
      edtPrdRGB_Internalname = "PRDRGB_"+sGXsfl_103_idx ;
      edtavPrdrgb_Internalname = "vPRDRGB_"+sGXsfl_103_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_103_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_103_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_103_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_103_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_103_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_103_idx ;
      edtColFibra_Internalname = "COLFIBRA_"+sGXsfl_103_idx ;
   }

   public void subsflControlProps_fel_10333( )
   {
      edtColLin_Internalname = "COLLIN_"+sGXsfl_103_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_103_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_103_fel_idx ;
      edtValCod_Internalname = "VALCOD_"+sGXsfl_103_fel_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_103_fel_idx ;
      edtForCan_Internalname = "FORCAN_"+sGXsfl_103_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_103_fel_idx ;
      imgprompt_490_Internalname = "PROMPT_490_"+sGXsfl_103_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_103_fel_idx ;
      edtPrdRGB_Internalname = "PRDRGB_"+sGXsfl_103_fel_idx ;
      edtavPrdrgb_Internalname = "vPRDRGB_"+sGXsfl_103_fel_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_103_fel_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_103_fel_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_103_fel_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_103_fel_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_103_fel_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_103_fel_idx ;
      edtColFibra_Internalname = "COLFIBRA_"+sGXsfl_103_fel_idx ;
   }

   public void addRow0Q33( )
   {
      nGXsfl_103_idx = (int)(nGXsfl_103_idx+1) ;
      sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_10333( ) ;
      sendRow0Q33( ) ;
   }

   public void sendRow0Q33( )
   {
      Gridlevel_level1Row = GXWebRow.GetNew(context) ;
      if ( subGridlevel_level1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         subGridlevel_level1_Backcolor = subGridlevel_level1_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
         subGridlevel_level1_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_level1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_103_idx) % (2))) == 0 )
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
            }
         }
      }
      imgprompt_490_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"FORPRDUME_"+sGXsfl_103_idx+"'), id:'"+"FORPRDUME_"+sGXsfl_103_idx+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"FORPRDDSC_"+sGXsfl_103_idx+"'), id:'"+"FORPRDDSC_"+sGXsfl_103_idx+"'"+",IOType:'inout'}"+"],"+"gx.dom.form()."+"nIsMod_33_"+sGXsfl_103_idx+","+"'', false"+","+"false"+");") ;
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_33_" + sGXsfl_103_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_103_idx + "',103)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColLin_Internalname,GXutil.ltrim( localUtil.ntoc( A309ColLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A309ColLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtColLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_33_" + sGXsfl_103_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_103_idx + "',103)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtValCod_Internalname,GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtValCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9") : localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtValCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtValCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPreAct_Internalname,GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdPreAct_Enabled!=0) ? localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999") : localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdPreAct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdPreAct_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_33_" + sGXsfl_103_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 109,'',false,'" + sGXsfl_103_idx + "',103)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForCan_Internalname,GXutil.ltrim( localUtil.ntoc( A481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForCan_Enabled!=0) ? localUtil.format( A481ForCan, "ZZZZ9.99999") : localUtil.format( A481ForCan, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,109);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForCan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtForCan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_33_" + sGXsfl_103_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 110,'',false,'" + sGXsfl_103_idx + "',103)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,110);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn WWActionColumn WWActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtForPrdUMe_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_490_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_490_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridlevel_level1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_490_Internalname,sImgUrl,imgprompt_490_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(imgprompt_490_Visible),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"",Integer.valueOf(0),"",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"","","","","","","",Integer.valueOf(1),Boolean.valueOf(false),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtForPrdDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRGB_Internalname,GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdRGB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13232PrdRGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13232PrdRGB), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdRGB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdRGB_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdrgb_Internalname,GXutil.ltrim( localUtil.ntoc( AV68PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrdrgb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV68PrdRGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV68PrdRGB), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrdrgb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtavPrdrgb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR_Internalname,GXutil.ltrim( localUtil.ntoc( AV69R, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV69R), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV69R), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtavR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG_Internalname,GXutil.ltrim( localUtil.ntoc( AV70G, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV70G), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV70G), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtavG_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB_Internalname,GXutil.ltrim( localUtil.ntoc( AV71B, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV71B), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV71B), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtavB_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR2_Internalname,GXutil.ltrim( localUtil.ntoc( AV72R2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV72R2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV72R2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtavR2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG2_Internalname,GXutil.ltrim( localUtil.ntoc( AV73G2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV73G2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV73G2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtavG2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB2_Internalname,GXutil.ltrim( localUtil.ntoc( AV74B2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV74B2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV74B2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtavB2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColFibra_Internalname,GXutil.rtrim( A13926ColFibra),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColFibra_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtColFibra_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(103),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes0Q33( ) ;
      GXCCtl = "Z309ColLin_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z309ColLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z481ForCan_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z838TotLinCol_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z838TotLinCol, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6193ForClaCol_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6193ForClaCol));
      GXCCtl = "Z13926ColFibra_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13926ColFibra));
      GXCCtl = "Z719PrdNum_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O481ForCan_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O719PrdNum_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O719PrdNum));
      GXCCtl = "O5167TotLinCoF_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O5167TotLinCoF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "COLLINV_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A6222ColLinV, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "TOTLINCOF_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A5167TotLinCoF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_33_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_33, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_33_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_33, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_33_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_33, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vPRDAUX_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV47prdaux, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vEMPRCOD_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV31EmprCod));
      GXCCtl = "vFORCANSUM_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV57ForCanSum, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vERROR_SUMC_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV52Error_sumc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "vMODE_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vFORNUMCOL_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV61ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vCONTNUM_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV67ContNum, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vFLAGMOD_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV29FlagMod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vFOROPCCLI_" + sGXsfl_103_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV32ForOpcCli));
      app.GxWebStd.gx_hidden_field( httpContext, "COLLIN_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VALCOD_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtValCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREACT_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORCAN_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDRGB_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdRGB_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDRGB_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdrgb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vR_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vG_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavG_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vB_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavB_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vR2_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavR2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vG2_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavG2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vB2_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavB2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLFIBRA_"+sGXsfl_103_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtColFibra_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROMPT_490_"+sGXsfl_103_idx+"Link", GXutil.rtrim( imgprompt_490_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow0Q33( )
   {
      nGXsfl_103_idx = (int)(nGXsfl_103_idx+1) ;
      sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_10333( ) ;
      edtColLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLLIN_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtValCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VALCOD_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdPreAct_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPREACT_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORCAN_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdRGB_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDRGB_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtavPrdrgb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vPRDRGB_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtavR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vR_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtavG_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vG_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtavB_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vB_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtavR2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vR2_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtavG2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vG2_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtavB2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vB2_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtColFibra_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COLFIBRA_"+sGXsfl_103_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      imgprompt_490_Link = httpContext.cgiGet( "PROMPT_490_"+sGXsfl_103_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtColLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtColLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "COLLIN_" + sGXsfl_103_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtColLin_Internalname ;
         wbErr = true ;
         A309ColLin = (short)(0) ;
      }
      else
      {
         A309ColLin = (short)(localUtil.ctol( httpContext.cgiGet( edtColLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
      A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForCan_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
      {
         GXCCtl = "FORCAN_" + sGXsfl_103_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForCan_Internalname ;
         wbErr = true ;
         A481ForCan = DecimalUtil.ZERO ;
      }
      else
      {
         A481ForCan = localUtil.ctond( httpContext.cgiGet( edtForCan_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_103_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         wbErr = true ;
         A490ForPrdUMe = (byte)(0) ;
      }
      else
      {
         A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
      n488ForPrdDsc = false ;
      A13232PrdRGB = localUtil.ctol( httpContext.cgiGet( edtPrdRGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      AV68PrdRGB = localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      AV69R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      AV70G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      AV71B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      AV72R2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      AV73G2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      AV74B2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A13926ColFibra = httpContext.cgiGet( edtColFibra_Internalname) ;
      n13926ColFibra = false ;
      GXCCtl = "Z309ColLin_" + sGXsfl_103_idx ;
      Z309ColLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z481ForCan_" + sGXsfl_103_idx ;
      Z481ForCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z838TotLinCol_" + sGXsfl_103_idx ;
      Z838TotLinCol = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6193ForClaCol_" + sGXsfl_103_idx ;
      Z6193ForClaCol = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13926ColFibra_" + sGXsfl_103_idx ;
      Z13926ColFibra = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_103_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_103_idx ;
      Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z838TotLinCol_" + sGXsfl_103_idx ;
      A838TotLinCol = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6193ForClaCol_" + sGXsfl_103_idx ;
      A6193ForClaCol = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O481ForCan_" + sGXsfl_103_idx ;
      O481ForCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O719PrdNum_" + sGXsfl_103_idx ;
      O719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O5167TotLinCoF_" + sGXsfl_103_idx ;
      O5167TotLinCoF = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "COLLINV_" + sGXsfl_103_idx ;
      A6222ColLinV = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "TOTLINCOF_" + sGXsfl_103_idx ;
      A5167TotLinCoF = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_33_" + sGXsfl_103_idx ;
      nRcdDeleted_33 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_33_" + sGXsfl_103_idx ;
      nRcdExists_33 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_33_" + sGXsfl_103_idx ;
      nIsMod_33 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtColFibra_Enabled = edtColFibra_Enabled ;
      defedtPrdRGB_Enabled = edtPrdRGB_Enabled ;
      defedtPrdPreAct_Enabled = edtPrdPreAct_Enabled ;
      defedtValCod_Enabled = edtValCod_Enabled ;
      defedtPrdNom_Enabled = edtPrdNom_Enabled ;
      defedtColLin_Enabled = edtColLin_Enabled ;
   }

   public void confirmValues0Q0( )
   {
      nGXsfl_103_idx = 0 ;
      sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_10333( ) ;
      while ( nGXsfl_103_idx < nRC_GXsfl_103 )
      {
         nGXsfl_103_idx = (int)(nGXsfl_103_idx+1) ;
         sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_10333( ) ;
         httpContext.changePostValue( "Z309ColLin_"+sGXsfl_103_idx, httpContext.cgiGet( "ZT_"+"Z309ColLin_"+sGXsfl_103_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z309ColLin_"+sGXsfl_103_idx) ;
         httpContext.changePostValue( "Z481ForCan_"+sGXsfl_103_idx, httpContext.cgiGet( "ZT_"+"Z481ForCan_"+sGXsfl_103_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z481ForCan_"+sGXsfl_103_idx) ;
         httpContext.changePostValue( "Z838TotLinCol_"+sGXsfl_103_idx, httpContext.cgiGet( "ZT_"+"Z838TotLinCol_"+sGXsfl_103_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z838TotLinCol_"+sGXsfl_103_idx) ;
         httpContext.changePostValue( "Z6193ForClaCol_"+sGXsfl_103_idx, httpContext.cgiGet( "ZT_"+"Z6193ForClaCol_"+sGXsfl_103_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6193ForClaCol_"+sGXsfl_103_idx) ;
         httpContext.changePostValue( "Z13926ColFibra_"+sGXsfl_103_idx, httpContext.cgiGet( "ZT_"+"Z13926ColFibra_"+sGXsfl_103_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13926ColFibra_"+sGXsfl_103_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_103_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_103_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_103_idx) ;
         httpContext.changePostValue( "Z490ForPrdUMe_"+sGXsfl_103_idx, httpContext.cgiGet( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_103_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_103_idx) ;
      }
      httpContext.changePostValue( "O481ForCan", httpContext.cgiGet( "T481ForCan")) ;
      httpContext.deletePostValue( "T481ForCan") ;
      httpContext.changePostValue( "O719PrdNum", httpContext.cgiGet( "T719PrdNum")) ;
      httpContext.deletePostValue( "T719PrdNum") ;
      httpContext.changePostValue( "O5167TotLinCoF", httpContext.cgiGet( "T5167TotLinCoF")) ;
      httpContext.deletePostValue( "T5167TotLinCoF") ;
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.tdformu", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV31EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV61ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV67ContNum,9,0)),GXutil.URLEncode(GXutil.ltrimstr(AV29FlagMod,1,0)),GXutil.URLEncode(GXutil.rtrim(AV32ForOpcCli))}, new String[] {"Gx_mode","EmprCod","ForNumCol","ContNum","FlagMod","ForOpcCli"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TDFORMU");
      forbiddenHiddens.add("ForNumCol", localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV98Pgmname, "")));
      forbiddenHiddens.add("ContNum", localUtil.format( DecimalUtil.doubleToDec(A315ContNum), "ZZZZZZZZ9"));
      forbiddenHiddens.add("CosKgm", localUtil.format( A318CosKgm, "ZZZZZ9.99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\tdformu:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z486ForNumCol", GXutil.ltrim( localUtil.ntoc( Z486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6369Lb_fam1", GXutil.ltrim( localUtil.ntoc( Z6369Lb_fam1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6370Lb_fam2", GXutil.ltrim( localUtil.ntoc( Z6370Lb_fam2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6371Lb_fam3", GXutil.ltrim( localUtil.ntoc( Z6371Lb_fam3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z310ColUltLin", GXutil.ltrim( localUtil.ntoc( Z310ColUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z315ContNum", GXutil.ltrim( localUtil.ntoc( Z315ContNum, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z318CosKgm", GXutil.ltrim( localUtil.ntoc( Z318CosKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6310Lb_TaAuxC", GXutil.rtrim( Z6310Lb_TaAuxC));
      app.GxWebStd.gx_hidden_field( httpContext, "O310ColUltLin", GXutil.ltrim( localUtil.ntoc( O310ColUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5166CosKgmF", GXutil.ltrim( localUtil.ntoc( O5166CosKgmF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5361ForCanSum", GXutil.ltrim( localUtil.ntoc( O5361ForCanSum, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O6310Lb_TaAuxC", GXutil.rtrim( O6310Lb_TaAuxC));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_103", GXutil.ltrim( localUtil.ntoc( nGXsfl_103_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N6310Lb_TaAuxC", GXutil.rtrim( A6310Lb_TaAuxC));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLB_TAAUXC_DATA", AV79Lb_TaAuxC_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLB_TAAUXC_DATA", AV79Lb_TaAuxC_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLB_FAM1_DATA", AV76Lb_fam1_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLB_FAM1_DATA", AV76Lb_fam1_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLB_FAM2_DATA", AV83Lb_fam2_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLB_FAM2_DATA", AV83Lb_fam2_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLB_FAM3_DATA", AV85Lb_fam3_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLB_FAM3_DATA", AV85Lb_fam3_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV81PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV81PrdNum_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDAUX", GXutil.ltrim( localUtil.ntoc( AV47prdaux, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDAUX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV47prdaux), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCANSUM", GXutil.ltrim( localUtil.ntoc( AV57ForCanSum, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCANSUM", getSecureSignedToken( "", localUtil.format( AV57ForCanSum, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vERROR_SUMC", GXutil.ltrim( localUtil.ntoc( AV52Error_sumc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERROR_SUMC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52Error_sumc), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTNUM", GXutil.ltrim( localUtil.ntoc( AV67ContNum, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67ContNum), "ZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGMOD", GXutil.ltrim( localUtil.ntoc( AV29FlagMod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGMOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29FlagMod), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFOROPCCLI", GXutil.rtrim( AV32ForOpcCli));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFOROPCCLI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32ForOpcCli, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCODV3", GXutil.rtrim( A6220EmprCodV3));
      app.GxWebStd.gx_hidden_field( httpContext, "FORNUMCOLV", GXutil.ltrim( localUtil.ntoc( A6221ForNumColV, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV31EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORNUMCOL", GXutil.ltrim( localUtil.ntoc( AV61ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61ForNumCol), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_LB_TAAUXC", GXutil.rtrim( AV65Insert_Lb_TaAuxC));
      app.GxWebStd.gx_hidden_field( httpContext, "vTAAUXCOLD", GXutil.rtrim( AV53TaauxcOld));
      app.GxWebStd.gx_hidden_field( httpContext, "COLULTLIN", GXutil.ltrim( localUtil.ntoc( A310ColUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTNUM", GXutil.ltrim( localUtil.ntoc( A315ContNum, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COSKGM", GXutil.ltrim( localUtil.ntoc( A318CosKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPNUMDEC", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_TAAUXD", GXutil.rtrim( A6311Lb_TaAuxD));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDHORMAX", GXutil.ltrim( localUtil.ntoc( A7259PrdHorMax, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLLINMAX", GXutil.ltrim( localUtil.ntoc( A13757ColLinMax, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLLINV", GXutil.ltrim( localUtil.ntoc( A6222ColLinV, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFACCON", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TOTLINCOF", GXutil.ltrim( localUtil.ntoc( A5167TotLinCoF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUMEFO", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO_I", AV40Texto_i);
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV23UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV27Station));
      app.GxWebStd.gx_hidden_field( httpContext, "TOTLINCOL", GXutil.ltrim( localUtil.ntoc( A838TotLinCol, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORCLACOL", GXutil.rtrim( A6193ForClaCol));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUMMAX", GXutil.rtrim( A6223PrdNumMax));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDHORMAD", GXutil.ltrim( localUtil.ntoc( A7260PrdHorMad, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Objectcall", GXutil.rtrim( Dvpanel_tableattributes_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Enabled", GXutil.booltostr( Dvpanel_tableattributes_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Width", GXutil.rtrim( Dvpanel_tableattributes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autowidth", GXutil.booltostr( Dvpanel_tableattributes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoheight", GXutil.booltostr( Dvpanel_tableattributes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Cls", GXutil.rtrim( Dvpanel_tableattributes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Title", GXutil.rtrim( Dvpanel_tableattributes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsible", GXutil.booltostr( Dvpanel_tableattributes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsed", GXutil.booltostr( Dvpanel_tableattributes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Showcollapseicon", GXutil.booltostr( Dvpanel_tableattributes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Iconposition", GXutil.rtrim( Dvpanel_tableattributes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoscroll", GXutil.booltostr( Dvpanel_tableattributes_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXC_Objectcall", GXutil.rtrim( Combo_lb_taauxc_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXC_Cls", GXutil.rtrim( Combo_lb_taauxc_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXC_Selectedvalue_set", GXutil.rtrim( Combo_lb_taauxc_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXC_Enabled", GXutil.booltostr( Combo_lb_taauxc_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_TAAUXC_Emptyitem", GXutil.booltostr( Combo_lb_taauxc_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAM1_Objectcall", GXutil.rtrim( Combo_lb_fam1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAM1_Cls", GXutil.rtrim( Combo_lb_fam1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAM1_Selectedvalue_set", GXutil.rtrim( Combo_lb_fam1_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAM1_Enabled", GXutil.booltostr( Combo_lb_fam1_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAM1_Emptyitem", GXutil.booltostr( Combo_lb_fam1_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAM2_Objectcall", GXutil.rtrim( Combo_lb_fam2_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAM2_Cls", GXutil.rtrim( Combo_lb_fam2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAM2_Selectedvalue_set", GXutil.rtrim( Combo_lb_fam2_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAM2_Enabled", GXutil.booltostr( Combo_lb_fam2_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAM2_Emptyitem", GXutil.booltostr( Combo_lb_fam2_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAM3_Objectcall", GXutil.rtrim( Combo_lb_fam3_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAM3_Cls", GXutil.rtrim( Combo_lb_fam3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAM3_Selectedvalue_set", GXutil.rtrim( Combo_lb_fam3_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAM3_Enabled", GXutil.booltostr( Combo_lb_fam3_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LB_FAM3_Emptyitem", GXutil.booltostr( Combo_lb_fam3_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable2_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Enabled", GXutil.booltostr( Dvpanel_unnamedtable2_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Objectcall", GXutil.rtrim( Datamonjs_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Enabled", GXutil.booltostr( Datamonjs_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Objectcall", GXutil.rtrim( Combo_prdnum_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Cls", GXutil.rtrim( Combo_prdnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Titlecontrolidtoreplace", GXutil.rtrim( Combo_prdnum_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Isgriditem", GXutil.booltostr( Combo_prdnum_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Emptyitem", GXutil.booltostr( Combo_prdnum_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RENUMERAR_Objectcall", GXutil.rtrim( Dvelop_confirmpanel_renumerar_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RENUMERAR_Enabled", GXutil.booltostr( Dvelop_confirmpanel_renumerar_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RENUMERAR_Title", GXutil.rtrim( Dvelop_confirmpanel_renumerar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RENUMERAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_renumerar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RENUMERAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_renumerar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RENUMERAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_renumerar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RENUMERAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_renumerar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RENUMERAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_renumerar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RENUMERAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_renumerar_Confirmtype));
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
      app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
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
      return formatLink("app.formulaciontinte.tdformu", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV31EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV61ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV67ContNum,9,0)),GXutil.URLEncode(GXutil.ltrimstr(AV29FlagMod,1,0)),GXutil.URLEncode(GXutil.rtrim(AV32ForOpcCli))}, new String[] {"Gx_mode","EmprCod","ForNumCol","ContNum","FlagMod","ForOpcCli"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.TDFORMU" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Colorantes", "") ;
   }

   public void initializeNonKey0Q32( )
   {
      A6310Lb_TaAuxC = "" ;
      n6310Lb_TaAuxC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
      A6369Lb_fam1 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6369Lb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6369Lb_fam1), 2, 0));
      A6370Lb_fam2 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6370Lb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6370Lb_fam2), 2, 0));
      A6371Lb_fam3 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6371Lb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6371Lb_fam3), 2, 0));
      AV53TaauxcOld = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TaauxcOld", AV53TaauxcOld);
      A5166CosKgmF = DecimalUtil.ZERO ;
      n5166CosKgmF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      A6221ForNumColV = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6221ForNumColV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6221ForNumColV), 8, 0));
      A310ColUltLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
      A315ContNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A315ContNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A315ContNum), 9, 0));
      A318CosKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A318CosKgm", GXutil.ltrimstr( A318CosKgm, 9, 2));
      A5361ForCanSum = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      A6311Lb_TaAuxD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", A6311Lb_TaAuxD);
      A13757ColLinMax = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13757ColLinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13757ColLinMax), 3, 0));
      O310ColUltLin = A310ColUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
      O5166CosKgmF = A5166CosKgmF ;
      n5166CosKgmF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrimstr( A5166CosKgmF, 13, 5));
      O5361ForCanSum = A5361ForCanSum ;
      httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrimstr( A5361ForCanSum, 11, 5));
      O6310Lb_TaAuxC = A6310Lb_TaAuxC ;
      n6310Lb_TaAuxC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
      Z6369Lb_fam1 = (byte)(0) ;
      Z6370Lb_fam2 = (byte)(0) ;
      Z6371Lb_fam3 = (byte)(0) ;
      Z310ColUltLin = (short)(0) ;
      Z315ContNum = 0 ;
      Z318CosKgm = DecimalUtil.ZERO ;
      Z6310Lb_TaAuxC = "" ;
   }

   public void initAll0Q32( )
   {
      A486ForNumCol = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
      initializeNonKey0Q32( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0Q33( )
   {
      A490ForPrdUMe = (byte)(0) ;
      AV40Texto_i = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Texto_i", AV40Texto_i);
      A5167TotLinCoF = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5167TotLinCoF", GXutil.ltrimstr( A5167TotLinCoF, 13, 5));
      A6222ColLinV = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6222ColLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6222ColLinV), 3, 0));
      A6223PrdNumMax = "" ;
      n6223PrdNumMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6223PrdNumMax", A6223PrdNumMax);
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A856ValCod = (byte)(0) ;
      A4338PrdUMeFo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
      A724PrdPreAct = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      A481ForCan = DecimalUtil.ZERO ;
      A838TotLinCol = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A838TotLinCol", GXutil.ltrimstr( A838TotLinCol, 9, 2));
      A6193ForClaCol = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6193ForClaCol", A6193ForClaCol);
      A7260PrdHorMad = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7260PrdHorMad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7260PrdHorMad), 2, 0));
      A13232PrdRGB = 0 ;
      A13926ColFibra = "" ;
      n13926ColFibra = false ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
      O481ForCan = A481ForCan ;
      O719PrdNum = A719PrdNum ;
      O5167TotLinCoF = A5167TotLinCoF ;
      httpContext.ajax_rsp_assign_attri("", false, "A5167TotLinCoF", GXutil.ltrimstr( A5167TotLinCoF, 13, 5));
      Z481ForCan = DecimalUtil.ZERO ;
      Z838TotLinCol = DecimalUtil.ZERO ;
      Z6193ForClaCol = "" ;
      Z13926ColFibra = "" ;
      Z719PrdNum = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll0Q33( )
   {
      A309ColLin = (short)(0) ;
      initializeNonKey0Q33( ) ;
   }

   public void standaloneModalInsert0Q33( )
   {
      A310ColUltLin = i310ColUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A310ColUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A310ColUltLin), 3, 0));
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415112544", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/tdformu.js", "?202682415112544", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties33( )
   {
      edtColFibra_Enabled = defedtColFibra_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtColFibra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColFibra_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtPrdRGB_Enabled = defedtPrdRGB_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRGB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRGB_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtPrdPreAct_Enabled = defedtPrdPreAct_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtValCod_Enabled = defedtValCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtValCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValCod_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtPrdNom_Enabled = defedtPrdNom_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_103_Refreshing);
      edtColLin_Enabled = defedtColLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtColLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColLin_Enabled), 5, 0), !bGXsfl_103_Refreshing);
   }

   public void startgridcontrol103( )
   {
      Gridlevel_level1Container.AddObjectProperty("GridName", "Gridlevel_level1");
      Gridlevel_level1Container.AddObjectProperty("Header", subGridlevel_level1_Header);
      Gridlevel_level1Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_level1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("CmpContext", "");
      Gridlevel_level1Container.AddObjectProperty("InMasterPage", "false");
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A309ColLin, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtValCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A481ForCan, (byte)(11), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdRGB_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV68PrdRGB, (byte)(10), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdrgb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV69R, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV70G, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV71B, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV72R2, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV73G2, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV74B2, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13926ColFibra));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtColFibra_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtForNumCol_Internalname = "FORNUMCOL" ;
      edtCosKgmF_Internalname = "COSKGMF" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      lblTextblocklb_taauxc_Internalname = "TEXTBLOCKLB_TAAUXC" ;
      Combo_lb_taauxc_Internalname = "COMBO_LB_TAAUXC" ;
      edtLb_TaAuxC_Internalname = "LB_TAAUXC" ;
      divTablesplittedlb_taauxc_Internalname = "TABLESPLITTEDLB_TAAUXC" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      lblTextblocklb_fam1_Internalname = "TEXTBLOCKLB_FAM1" ;
      Combo_lb_fam1_Internalname = "COMBO_LB_FAM1" ;
      edtLb_fam1_Internalname = "LB_FAM1" ;
      divTablesplittedlb_fam1_Internalname = "TABLESPLITTEDLB_FAM1" ;
      lblTextblocklb_fam2_Internalname = "TEXTBLOCKLB_FAM2" ;
      Combo_lb_fam2_Internalname = "COMBO_LB_FAM2" ;
      edtLb_fam2_Internalname = "LB_FAM2" ;
      divTablesplittedlb_fam2_Internalname = "TABLESPLITTEDLB_FAM2" ;
      lblTextblocklb_fam3_Internalname = "TEXTBLOCKLB_FAM3" ;
      Combo_lb_fam3_Internalname = "COMBO_LB_FAM3" ;
      edtLb_fam3_Internalname = "LB_FAM3" ;
      divTablesplittedlb_fam3_Internalname = "TABLESPLITTEDLB_FAM3" ;
      edtavTittxt_Internalname = "vTITTXT" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divDvpanel_unnamedtable2_cell_Internalname = "DVPANEL_UNNAMEDTABLE2_CELL" ;
      bttBtnrenumerar_Internalname = "BTNRENUMERAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtColLin_Internalname = "COLLIN" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtValCod_Internalname = "VALCOD" ;
      edtPrdPreAct_Internalname = "PRDPREACT" ;
      edtForCan_Internalname = "FORCAN" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtPrdRGB_Internalname = "PRDRGB" ;
      edtavPrdrgb_Internalname = "vPRDRGB" ;
      edtavR_Internalname = "vR" ;
      edtavG_Internalname = "vG" ;
      edtavB_Internalname = "vB" ;
      edtavR2_Internalname = "vR2" ;
      edtavG2_Internalname = "vG2" ;
      edtavB2_Internalname = "vB2" ;
      edtColFibra_Internalname = "COLFIBRA" ;
      edtForCanSum_Internalname = "FORCANSUM" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombolb_taauxc_Internalname = "vCOMBOLB_TAAUXC" ;
      divSectionattribute_lb_taauxc_Internalname = "SECTIONATTRIBUTE_LB_TAAUXC" ;
      edtavCombolb_fam1_Internalname = "vCOMBOLB_FAM1" ;
      divSectionattribute_lb_fam1_Internalname = "SECTIONATTRIBUTE_LB_FAM1" ;
      edtavCombolb_fam2_Internalname = "vCOMBOLB_FAM2" ;
      divSectionattribute_lb_fam2_Internalname = "SECTIONATTRIBUTE_LB_FAM2" ;
      edtavCombolb_fam3_Internalname = "vCOMBOLB_FAM3" ;
      divSectionattribute_lb_fam3_Internalname = "SECTIONATTRIBUTE_LB_FAM3" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      Dvelop_confirmpanel_renumerar_Internalname = "DVELOP_CONFIRMPANEL_RENUMERAR" ;
      tblTabledvelop_confirmpanel_renumerar_Internalname = "TABLEDVELOP_CONFIRMPANEL_RENUMERAR" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_490_Internalname = "PROMPT_490" ;
      subGridlevel_level1_Internalname = "GRIDLEVEL_LEVEL1" ;
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
      subGridlevel_level1_Allowcollapsing = (byte)(0) ;
      subGridlevel_level1_Allowselection = (byte)(0) ;
      subGridlevel_level1_Header = "" ;
      Combo_prdnum_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Colorantes", "") );
      edtColFibra_Jsonclick = "" ;
      edtavB2_Jsonclick = "" ;
      edtavG2_Jsonclick = "" ;
      edtavR2_Jsonclick = "" ;
      edtavB_Jsonclick = "" ;
      edtavG_Jsonclick = "" ;
      edtavR_Jsonclick = "" ;
      edtavPrdrgb_Jsonclick = "" ;
      edtPrdRGB_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      imgprompt_490_Visible = 1 ;
      imgprompt_490_Link = "" ;
      imgprompt_490_Visible = 1 ;
      edtForPrdUMe_Jsonclick = "" ;
      edtForCan_Jsonclick = "" ;
      edtPrdPreAct_Jsonclick = "" ;
      edtValCod_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtColLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_prdnum_Titlecontrolidtoreplace = "" ;
      edtColFibra_Enabled = 0 ;
      edtavB2_Enabled = 0 ;
      edtavG2_Enabled = 0 ;
      edtavR2_Enabled = 0 ;
      edtavB_Enabled = 0 ;
      edtavG_Enabled = 0 ;
      edtavR_Enabled = 0 ;
      edtavPrdrgb_Enabled = 0 ;
      edtPrdRGB_Enabled = 0 ;
      edtForPrdDsc_Enabled = 0 ;
      edtForPrdUMe_Enabled = 1 ;
      edtForCan_Enabled = 1 ;
      edtPrdPreAct_Enabled = 0 ;
      edtValCod_Enabled = 0 ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Enabled = 1 ;
      edtColLin_Enabled = 1 ;
      Dvelop_confirmpanel_renumerar_Confirmtype = "1" ;
      Dvelop_confirmpanel_renumerar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_renumerar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_renumerar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_renumerar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_renumerar_Confirmationtext = "¿El programa renumera las lineas (#) y sale de esta pantalla?" ;
      Dvelop_confirmpanel_renumerar_Title = "" ;
      Combo_prdnum_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_prdnum_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_prdnum_Cls = "ExtendedCombo" ;
      edtavCombolb_fam3_Jsonclick = "" ;
      edtavCombolb_fam3_Enabled = 0 ;
      edtavCombolb_fam3_Visible = 1 ;
      edtavCombolb_fam2_Jsonclick = "" ;
      edtavCombolb_fam2_Enabled = 0 ;
      edtavCombolb_fam2_Visible = 1 ;
      edtavCombolb_fam1_Jsonclick = "" ;
      edtavCombolb_fam1_Enabled = 0 ;
      edtavCombolb_fam1_Visible = 1 ;
      edtavCombolb_taauxc_Jsonclick = "" ;
      edtavCombolb_taauxc_Enabled = 0 ;
      edtavCombolb_taauxc_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divUnnamedtable1_Height = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtForCanSum_Jsonclick = "" ;
      edtForCanSum_Enabled = 0 ;
      bttBtnrenumerar_Visible = 1 ;
      edtavTittxt_Jsonclick = "" ;
      edtavTittxt_Enabled = 0 ;
      edtLb_fam3_Jsonclick = "" ;
      edtLb_fam3_Enabled = 1 ;
      edtLb_fam3_Visible = 1 ;
      Combo_lb_fam3_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_lb_fam3_Cls = "ExtendedCombo AttributeFL" ;
      Combo_lb_fam3_Enabled = GXutil.toBoolean( -1) ;
      edtLb_fam2_Jsonclick = "" ;
      edtLb_fam2_Enabled = 1 ;
      edtLb_fam2_Visible = 1 ;
      Combo_lb_fam2_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_lb_fam2_Cls = "ExtendedCombo AttributeFL" ;
      Combo_lb_fam2_Enabled = GXutil.toBoolean( -1) ;
      edtLb_fam1_Jsonclick = "" ;
      edtLb_fam1_Enabled = 1 ;
      edtLb_fam1_Visible = 1 ;
      Combo_lb_fam1_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_lb_fam1_Cls = "ExtendedCombo AttributeFL" ;
      Combo_lb_fam1_Enabled = GXutil.toBoolean( -1) ;
      edtLb_TaAuxC_Jsonclick = "" ;
      edtLb_TaAuxC_Enabled = 1 ;
      edtLb_TaAuxC_Visible = 1 ;
      Combo_lb_taauxc_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_lb_taauxc_Cls = "ExtendedCombo AttributeFL" ;
      Combo_lb_taauxc_Enabled = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Tabla de Alcalis", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      divDvpanel_unnamedtable2_cell_Class = "col-xs-12" ;
      edtCosKgmF_Jsonclick = "" ;
      edtCosKgmF_Enabled = 0 ;
      edtForNumCol_Jsonclick = "" ;
      edtForNumCol_Enabled = 0 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
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

   public void xc_24_0Q32( String A396EmprCod ,
                           String A6310Lb_TaAuxC ,
                           byte A6369Lb_fam1 ,
                           byte A6370Lb_fam2 ,
                           byte A6371Lb_fam3 ,
                           String AV80ComboLb_TaAuxC ,
                           byte AV47prdaux ,
                           String AV53TaauxcOld )
   {
      if ( true /* Level */ && true /* After */ && ( AV47prdaux == 1 ) && ! (GXutil.strcmp("", A6310Lb_TaAuxC)==0) && ( GXutil.strcmp(A6310Lb_TaAuxC, AV53TaauxcOld) != 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A6310Lb_TaAuxC ;
         GXv_int12[0] = A6369Lb_fam1 ;
         GXv_int11[0] = A6370Lb_fam2 ;
         GXv_int10[0] = A6371Lb_fam3 ;
         new app.pprdaux(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int12, GXv_int11, GXv_int10) ;
         A396EmprCod = GXv_char4[0] ;
         A6310Lb_TaAuxC = GXv_char3[0] ;
         A6369Lb_fam1 = GXv_int12[0] ;
         A6370Lb_fam2 = GXv_int11[0] ;
         A6371Lb_fam3 = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6310Lb_TaAuxC", A6310Lb_TaAuxC);
         httpContext.ajax_rsp_assign_attri("", false, "A6369Lb_fam1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6369Lb_fam1), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6370Lb_fam2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6370Lb_fam2), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6371Lb_fam3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6371Lb_fam3), 2, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6310Lb_TaAuxC))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6369Lb_fam1, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6370Lb_fam2, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6371Lb_fam3, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_42_0Q33( String A396EmprCod ,
                           String AV98Pgmname ,
                           String AV23UsurCod ,
                           String AV27Station ,
                           String AV40Texto_i ,
                           int A486ForNumCol ,
                           String A719PrdNum )
   {
      if ( true /* After */ && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV98Pgmname, AV23UsurCod, AV27Station, AV40Texto_i, A486ForNumCol, (byte)(0), "") ;
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

   public void xc_43_0Q33( String A396EmprCod ,
                           String AV98Pgmname ,
                           String AV23UsurCod ,
                           String AV27Station ,
                           String AV40Texto_i ,
                           int A486ForNumCol ,
                           String A719PrdNum )
   {
      if ( true /* After */ && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV98Pgmname, AV23UsurCod, AV27Station, AV40Texto_i, A486ForNumCol, (byte)(0), "") ;
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

   public void xc_44_0Q33( String A396EmprCod ,
                           String AV98Pgmname ,
                           String AV23UsurCod ,
                           String AV27Station ,
                           String AV40Texto_i ,
                           int A486ForNumCol ,
                           String A719PrdNum )
   {
      if ( true /* After */ && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV98Pgmname, AV23UsurCod, AV27Station, AV40Texto_i, A486ForNumCol, (byte)(0), "") ;
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

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_10333( ) ;
      while ( nGXsfl_103_idx <= nRC_GXsfl_103 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0Q33( ) ;
         standaloneModal0Q33( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow0Q33( ) ;
         nGXsfl_103_idx = (int)(nGXsfl_103_idx+1) ;
         sGXsfl_103_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_103_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_10333( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
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

   public void valid_Fornumcol( )
   {
      n5166CosKgmF = false ;
      /* Using cursor T000Q39 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         A5166CosKgmF = T000Q39_A5166CosKgmF[0] ;
         n5166CosKgmF = T000Q39_n5166CosKgmF[0] ;
      }
      else
      {
         A5166CosKgmF = DecimalUtil.doubleToDec(0) ;
         n5166CosKgmF = false ;
      }
      pr_default.close(23);
      /* Using cursor T000Q41 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         A5361ForCanSum = T000Q41_A5361ForCanSum[0] ;
         A13757ColLinMax = T000Q41_A13757ColLinMax[0] ;
      }
      else
      {
         A5361ForCanSum = DecimalUtil.doubleToDec(0) ;
         A13757ColLinMax = (short)(0) ;
      }
      pr_default.close(24);
      A6221ForNumColV = A486ForNumCol ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5166CosKgmF", GXutil.ltrim( localUtil.ntoc( A5166CosKgmF, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5361ForCanSum", GXutil.ltrim( localUtil.ntoc( A5361ForCanSum, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13757ColLinMax", GXutil.ltrim( localUtil.ntoc( A13757ColLinMax, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6221ForNumColV", GXutil.ltrim( localUtil.ntoc( A6221ForNumColV, (byte)(8), (byte)(0), ".", "")));
   }

   public void valid_Lb_taauxc( )
   {
      n6310Lb_TaAuxC = false ;
      /* Using cursor T000Q37 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC});
      if ( (pr_default.getStatus(22) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A6310Lb_TaAuxC)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS005", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_TAAUXC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLb_TaAuxC_Internalname ;
         }
      }
      A6311Lb_TaAuxD = T000Q37_A6311Lb_TaAuxD[0] ;
      pr_default.close(22);
      AV53TaauxcOld = O6310Lb_TaAuxC ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6311Lb_TaAuxD", GXutil.rtrim( A6311Lb_TaAuxD));
      httpContext.ajax_rsp_assign_attri("", false, "AV53TaauxcOld", GXutil.rtrim( AV53TaauxcOld));
   }

   public void valid_Collin( )
   {
      n6223PrdNumMax = false ;
      A6222ColLinV = A309ColLin ;
      /* Using cursor T000Q64 */
      pr_default.execute(37, new Object[] {Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV), Short.valueOf(A6222ColLinV), A6220EmprCodV3, Integer.valueOf(A6221ForNumColV)});
      if ( (pr_default.getStatus(37) != 101) )
      {
         A6223PrdNumMax = T000Q64_A6223PrdNumMax[0] ;
         n6223PrdNumMax = T000Q64_n6223PrdNumMax[0] ;
      }
      else
      {
         A6223PrdNumMax = "" ;
         n6223PrdNumMax = false ;
      }
      pr_default.close(37);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6222ColLinV", GXutil.ltrim( localUtil.ntoc( A6222ColLinV, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6223PrdNumMax", GXutil.rtrim( A6223PrdNumMax));
   }

   public void valid_Prdnum( )
   {
      /* Using cursor T000Q65 */
      pr_default.execute(38, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(38) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T000Q65_A718PrdNom[0] ;
      A4338PrdUMeFo = T000Q65_A4338PrdUMeFo[0] ;
      A724PrdPreAct = T000Q65_A724PrdPreAct[0] ;
      A7260PrdHorMad = T000Q65_A7260PrdHorMad[0] ;
      A13232PrdRGB = T000Q65_A13232PrdRGB[0] ;
      A707PrdFacCon = T000Q65_A707PrdFacCon[0] ;
      A856ValCod = T000Q65_A856ValCod[0] ;
      pr_default.close(38);
      if ( isIns( )  )
      {
         A490ForPrdUMe = A4338PrdUMeFo ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7260PrdHorMad", GXutil.ltrim( localUtil.ntoc( A7260PrdHorMad, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13232PrdRGB", GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Forprdume( )
   {
      n488ForPrdDsc = false ;
      /* Using cursor T000Q66 */
      pr_default.execute(39, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(39) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      A488ForPrdDsc = T000Q66_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T000Q66_n488ForPrdDsc[0] ;
      pr_default.close(39);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV61ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV67ContNum',fld:'vCONTNUM',pic:'ZZZZZZZZ9',hsh:true},{av:'AV29FlagMod',fld:'vFLAGMOD',pic:'9',hsh:true},{av:'AV32ForOpcCli',fld:'vFOROPCCLI',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV47prdaux',fld:'vPRDAUX',pic:'9',hsh:true},{av:'AV57ForCanSum',fld:'vFORCANSUM',pic:'ZZZZ9.99999',hsh:true},{av:'AV52Error_sumc',fld:'vERROR_SUMC',pic:'9',hsh:true},{av:'AV67ContNum',fld:'vCONTNUM',pic:'ZZZZZZZZ9',hsh:true},{av:'AV29FlagMod',fld:'vFLAGMOD',pic:'9',hsh:true},{av:'AV32ForOpcCli',fld:'vFOROPCCLI',pic:'@!',hsh:true},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV61ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV98Pgmname',fld:'vPGMNAME',pic:''},{av:'A315ContNum',fld:'CONTNUM',pic:'ZZZZZZZZ9'},{av:'A318CosKgm',fld:'COSKGM',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e140Q2',iparms:[{av:'AV47prdaux',fld:'vPRDAUX',pic:'9',hsh:true},{av:'A6310Lb_TaAuxC',fld:'LB_TAAUXC',pic:''},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV57ForCanSum',fld:'vFORCANSUM',pic:'ZZZZ9.99999',hsh:true},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'A6369Lb_fam1',fld:'LB_FAM1',pic:'Z9'},{av:'A6370Lb_fam2',fld:'LB_FAM2',pic:'Z9'},{av:'A6371Lb_fam3',fld:'LB_FAM3',pic:'Z9'},{av:'AV52Error_sumc',fld:'vERROR_SUMC',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'AV52Error_sumc',fld:'vERROR_SUMC',pic:'9',hsh:true},{av:'A6371Lb_fam3',fld:'LB_FAM3',pic:'Z9'},{av:'A6370Lb_fam2',fld:'LB_FAM2',pic:'Z9'},{av:'A6369Lb_fam1',fld:'LB_FAM1',pic:'Z9'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV57ForCanSum',fld:'vFORCANSUM',pic:'ZZZZ9.99999',hsh:true},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A6310Lb_TaAuxC',fld:'LB_TAAUXC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DORENUMERAR'","{handler:'e110Q32',iparms:[]");
      setEventMetadata("'DORENUMERAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_RENUMERAR.CLOSE","{handler:'e130Q2',iparms:[{av:'Dvelop_confirmpanel_renumerar_Result',ctrl:'DVELOP_CONFIRMPANEL_RENUMERAR',prop:'Result'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_RENUMERAR.CLOSE",",oparms:[]}");
      setEventMetadata("VALID_FORNUMCOL","{handler:'valid_Fornumcol',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'A5166CosKgmF',fld:'COSKGMF',pic:'ZZZZZZ9.99999'},{av:'A5361ForCanSum',fld:'FORCANSUM',pic:'ZZZZ9.99999'},{av:'A13757ColLinMax',fld:'COLLINMAX',pic:'ZZ9'},{av:'A6221ForNumColV',fld:'FORNUMCOLV',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_FORNUMCOL",",oparms:[{av:'A5166CosKgmF',fld:'COSKGMF',pic:'ZZZZZZ9.99999'},{av:'A5361ForCanSum',fld:'FORCANSUM',pic:'ZZZZ9.99999'},{av:'A13757ColLinMax',fld:'COLLINMAX',pic:'ZZ9'},{av:'A6221ForNumColV',fld:'FORNUMCOLV',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("VALID_LB_TAAUXC","{handler:'valid_Lb_taauxc',iparms:[{av:'O6310Lb_TaAuxC'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6310Lb_TaAuxC',fld:'LB_TAAUXC',pic:''},{av:'A6311Lb_TaAuxD',fld:'LB_TAAUXD',pic:''},{av:'AV53TaauxcOld',fld:'vTAAUXCOLD',pic:''}]");
      setEventMetadata("VALID_LB_TAAUXC",",oparms:[{av:'A6311Lb_TaAuxD',fld:'LB_TAAUXD',pic:''},{av:'AV53TaauxcOld',fld:'vTAAUXCOLD',pic:''}]}");
      setEventMetadata("VALIDV_PGMNAME","{handler:'validv_Pgmname',iparms:[]");
      setEventMetadata("VALIDV_PGMNAME",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOLB_TAAUXC","{handler:'validv_Combolb_taauxc',iparms:[]");
      setEventMetadata("VALIDV_COMBOLB_TAAUXC",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOLB_FAM1","{handler:'validv_Combolb_fam1',iparms:[]");
      setEventMetadata("VALIDV_COMBOLB_FAM1",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOLB_FAM2","{handler:'validv_Combolb_fam2',iparms:[]");
      setEventMetadata("VALIDV_COMBOLB_FAM2",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOLB_FAM3","{handler:'validv_Combolb_fam3',iparms:[]");
      setEventMetadata("VALIDV_COMBOLB_FAM3",",oparms:[]}");
      setEventMetadata("VALID_COLLIN","{handler:'valid_Collin',iparms:[{av:'A309ColLin',fld:'COLLIN',pic:'ZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'A6222ColLinV',fld:'COLLINV',pic:'ZZ9'},{av:'A6220EmprCodV3',fld:'EMPRCODV3',pic:'@!'},{av:'A6221ForNumColV',fld:'FORNUMCOLV',pic:'ZZZZZZZ9'},{av:'A6223PrdNumMax',fld:'PRDNUMMAX',pic:''}]");
      setEventMetadata("VALID_COLLIN",",oparms:[{av:'A6222ColLinV',fld:'COLLINV',pic:'ZZ9'},{av:'A6223PrdNumMax',fld:'PRDNUMMAX',pic:''}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A7260PrdHorMad',fld:'PRDHORMAD',pic:'Z9'},{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A7260PrdHorMad',fld:'PRDHORMAD',pic:'Z9'},{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]}");
      setEventMetadata("VALID_PRDNOM","{handler:'valid_Prdnom',iparms:[]");
      setEventMetadata("VALID_PRDNOM",",oparms:[]}");
      setEventMetadata("VALID_PRDPREACT","{handler:'valid_Prdpreact',iparms:[]");
      setEventMetadata("VALID_PRDPREACT",",oparms:[]}");
      setEventMetadata("VALID_FORCAN","{handler:'valid_Forcan',iparms:[]");
      setEventMetadata("VALID_FORCAN",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Colfibra',iparms:[]");
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
      pr_default.close(38);
      pr_default.close(39);
      pr_default.close(37);
      pr_default.close(22);
      pr_default.close(23);
      pr_default.close(24);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV31EmprCod = "" ;
      wcpOAV32ForOpcCli = "" ;
      Z396EmprCod = "" ;
      Z318CosKgm = DecimalUtil.ZERO ;
      Z6310Lb_TaAuxC = "" ;
      O5166CosKgmF = DecimalUtil.ZERO ;
      O5361ForCanSum = DecimalUtil.ZERO ;
      O6310Lb_TaAuxC = "" ;
      N6310Lb_TaAuxC = "" ;
      Dvelop_confirmpanel_renumerar_Result = "" ;
      Combo_lb_fam3_Selectedvalue_get = "" ;
      Combo_lb_fam2_Selectedvalue_get = "" ;
      Combo_lb_fam1_Selectedvalue_get = "" ;
      Combo_lb_taauxc_Selectedvalue_get = "" ;
      Z481ForCan = DecimalUtil.ZERO ;
      Z838TotLinCol = DecimalUtil.ZERO ;
      Z6193ForClaCol = "" ;
      Z13926ColFibra = "" ;
      Z719PrdNum = "" ;
      O481ForCan = DecimalUtil.ZERO ;
      O719PrdNum = "" ;
      O5167TotLinCoF = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A6310Lb_TaAuxC = "" ;
      AV80ComboLb_TaAuxC = "" ;
      AV53TaauxcOld = "" ;
      AV98Pgmname = "" ;
      AV23UsurCod = "" ;
      AV27Station = "" ;
      AV40Texto_i = "" ;
      A719PrdNum = "" ;
      A6220EmprCodV3 = "" ;
      Gx_mode = "" ;
      AV31EmprCod = "" ;
      AV32ForOpcCli = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A5166CosKgmF = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      lblTextblocklb_taauxc_Jsonclick = "" ;
      ucCombo_lb_taauxc = new com.genexus.webpanels.GXUserControl();
      Combo_lb_taauxc_Caption = "" ;
      AV79Lb_TaAuxC_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      TempTags = "" ;
      lblTextblocklb_fam1_Jsonclick = "" ;
      ucCombo_lb_fam1 = new com.genexus.webpanels.GXUserControl();
      Combo_lb_fam1_Caption = "" ;
      AV76Lb_fam1_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblocklb_fam2_Jsonclick = "" ;
      ucCombo_lb_fam2 = new com.genexus.webpanels.GXUserControl();
      Combo_lb_fam2_Caption = "" ;
      AV83Lb_fam2_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblocklb_fam3_Jsonclick = "" ;
      ucCombo_lb_fam3 = new com.genexus.webpanels.GXUserControl();
      Combo_lb_fam3_Caption = "" ;
      AV85Lb_fam3_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV55TitTxt = "" ;
      bttBtnrenumerar_Jsonclick = "" ;
      A5361ForCanSum = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      Combo_prdnum_Caption = "" ;
      AV81PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      sStyleString = "" ;
      ucDvelop_confirmpanel_renumerar = new com.genexus.webpanels.GXUserControl();
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      B5166CosKgmF = DecimalUtil.ZERO ;
      B5361ForCanSum = DecimalUtil.ZERO ;
      B6310Lb_TaAuxC = "" ;
      sMode33 = "" ;
      A318CosKgm = DecimalUtil.ZERO ;
      AV65Insert_Lb_TaAuxC = "" ;
      A407EmprNom = "" ;
      A6311Lb_TaAuxD = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A5167TotLinCoF = DecimalUtil.ZERO ;
      A838TotLinCol = DecimalUtil.ZERO ;
      A6193ForClaCol = "" ;
      A6223PrdNumMax = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_lb_taauxc_Objectcall = "" ;
      Combo_lb_taauxc_Class = "" ;
      Combo_lb_taauxc_Icontype = "" ;
      Combo_lb_taauxc_Icon = "" ;
      Combo_lb_taauxc_Tooltip = "" ;
      Combo_lb_taauxc_Selectedvalue_set = "" ;
      Combo_lb_taauxc_Selectedtext_set = "" ;
      Combo_lb_taauxc_Selectedtext_get = "" ;
      Combo_lb_taauxc_Gamoauthtoken = "" ;
      Combo_lb_taauxc_Ddointernalname = "" ;
      Combo_lb_taauxc_Titlecontrolalign = "" ;
      Combo_lb_taauxc_Dropdownoptionstype = "" ;
      Combo_lb_taauxc_Titlecontrolidtoreplace = "" ;
      Combo_lb_taauxc_Datalisttype = "" ;
      Combo_lb_taauxc_Datalistfixedvalues = "" ;
      Combo_lb_taauxc_Datalistproc = "" ;
      Combo_lb_taauxc_Datalistprocparametersprefix = "" ;
      Combo_lb_taauxc_Remoteservicesparameters = "" ;
      Combo_lb_taauxc_Htmltemplate = "" ;
      Combo_lb_taauxc_Multiplevaluestype = "" ;
      Combo_lb_taauxc_Loadingdata = "" ;
      Combo_lb_taauxc_Noresultsfound = "" ;
      Combo_lb_taauxc_Emptyitemtext = "" ;
      Combo_lb_taauxc_Onlyselectedvalues = "" ;
      Combo_lb_taauxc_Selectalltext = "" ;
      Combo_lb_taauxc_Multiplevaluesseparator = "" ;
      Combo_lb_taauxc_Addnewoptiontext = "" ;
      Combo_lb_fam1_Objectcall = "" ;
      Combo_lb_fam1_Class = "" ;
      Combo_lb_fam1_Icontype = "" ;
      Combo_lb_fam1_Icon = "" ;
      Combo_lb_fam1_Tooltip = "" ;
      Combo_lb_fam1_Selectedvalue_set = "" ;
      Combo_lb_fam1_Selectedtext_set = "" ;
      Combo_lb_fam1_Selectedtext_get = "" ;
      Combo_lb_fam1_Gamoauthtoken = "" ;
      Combo_lb_fam1_Ddointernalname = "" ;
      Combo_lb_fam1_Titlecontrolalign = "" ;
      Combo_lb_fam1_Dropdownoptionstype = "" ;
      Combo_lb_fam1_Titlecontrolidtoreplace = "" ;
      Combo_lb_fam1_Datalisttype = "" ;
      Combo_lb_fam1_Datalistfixedvalues = "" ;
      Combo_lb_fam1_Datalistproc = "" ;
      Combo_lb_fam1_Datalistprocparametersprefix = "" ;
      Combo_lb_fam1_Remoteservicesparameters = "" ;
      Combo_lb_fam1_Htmltemplate = "" ;
      Combo_lb_fam1_Multiplevaluestype = "" ;
      Combo_lb_fam1_Loadingdata = "" ;
      Combo_lb_fam1_Noresultsfound = "" ;
      Combo_lb_fam1_Emptyitemtext = "" ;
      Combo_lb_fam1_Onlyselectedvalues = "" ;
      Combo_lb_fam1_Selectalltext = "" ;
      Combo_lb_fam1_Multiplevaluesseparator = "" ;
      Combo_lb_fam1_Addnewoptiontext = "" ;
      Combo_lb_fam2_Objectcall = "" ;
      Combo_lb_fam2_Class = "" ;
      Combo_lb_fam2_Icontype = "" ;
      Combo_lb_fam2_Icon = "" ;
      Combo_lb_fam2_Tooltip = "" ;
      Combo_lb_fam2_Selectedvalue_set = "" ;
      Combo_lb_fam2_Selectedtext_set = "" ;
      Combo_lb_fam2_Selectedtext_get = "" ;
      Combo_lb_fam2_Gamoauthtoken = "" ;
      Combo_lb_fam2_Ddointernalname = "" ;
      Combo_lb_fam2_Titlecontrolalign = "" ;
      Combo_lb_fam2_Dropdownoptionstype = "" ;
      Combo_lb_fam2_Titlecontrolidtoreplace = "" ;
      Combo_lb_fam2_Datalisttype = "" ;
      Combo_lb_fam2_Datalistfixedvalues = "" ;
      Combo_lb_fam2_Datalistproc = "" ;
      Combo_lb_fam2_Datalistprocparametersprefix = "" ;
      Combo_lb_fam2_Remoteservicesparameters = "" ;
      Combo_lb_fam2_Htmltemplate = "" ;
      Combo_lb_fam2_Multiplevaluestype = "" ;
      Combo_lb_fam2_Loadingdata = "" ;
      Combo_lb_fam2_Noresultsfound = "" ;
      Combo_lb_fam2_Emptyitemtext = "" ;
      Combo_lb_fam2_Onlyselectedvalues = "" ;
      Combo_lb_fam2_Selectalltext = "" ;
      Combo_lb_fam2_Multiplevaluesseparator = "" ;
      Combo_lb_fam2_Addnewoptiontext = "" ;
      Combo_lb_fam3_Objectcall = "" ;
      Combo_lb_fam3_Class = "" ;
      Combo_lb_fam3_Icontype = "" ;
      Combo_lb_fam3_Icon = "" ;
      Combo_lb_fam3_Tooltip = "" ;
      Combo_lb_fam3_Selectedvalue_set = "" ;
      Combo_lb_fam3_Selectedtext_set = "" ;
      Combo_lb_fam3_Selectedtext_get = "" ;
      Combo_lb_fam3_Gamoauthtoken = "" ;
      Combo_lb_fam3_Ddointernalname = "" ;
      Combo_lb_fam3_Titlecontrolalign = "" ;
      Combo_lb_fam3_Dropdownoptionstype = "" ;
      Combo_lb_fam3_Titlecontrolidtoreplace = "" ;
      Combo_lb_fam3_Datalisttype = "" ;
      Combo_lb_fam3_Datalistfixedvalues = "" ;
      Combo_lb_fam3_Datalistproc = "" ;
      Combo_lb_fam3_Datalistprocparametersprefix = "" ;
      Combo_lb_fam3_Remoteservicesparameters = "" ;
      Combo_lb_fam3_Htmltemplate = "" ;
      Combo_lb_fam3_Multiplevaluestype = "" ;
      Combo_lb_fam3_Loadingdata = "" ;
      Combo_lb_fam3_Noresultsfound = "" ;
      Combo_lb_fam3_Emptyitemtext = "" ;
      Combo_lb_fam3_Onlyselectedvalues = "" ;
      Combo_lb_fam3_Selectalltext = "" ;
      Combo_lb_fam3_Multiplevaluesseparator = "" ;
      Combo_lb_fam3_Addnewoptiontext = "" ;
      Dvpanel_unnamedtable2_Objectcall = "" ;
      Dvpanel_unnamedtable2_Class = "" ;
      Dvpanel_unnamedtable2_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_prdnum_Objectcall = "" ;
      Combo_prdnum_Class = "" ;
      Combo_prdnum_Icontype = "" ;
      Combo_prdnum_Icon = "" ;
      Combo_prdnum_Tooltip = "" ;
      Combo_prdnum_Selectedvalue_set = "" ;
      Combo_prdnum_Selectedvalue_get = "" ;
      Combo_prdnum_Selectedtext_set = "" ;
      Combo_prdnum_Selectedtext_get = "" ;
      Combo_prdnum_Gamoauthtoken = "" ;
      Combo_prdnum_Ddointernalname = "" ;
      Combo_prdnum_Titlecontrolalign = "" ;
      Combo_prdnum_Dropdownoptionstype = "" ;
      Combo_prdnum_Datalisttype = "" ;
      Combo_prdnum_Datalistfixedvalues = "" ;
      Combo_prdnum_Datalistproc = "" ;
      Combo_prdnum_Datalistprocparametersprefix = "" ;
      Combo_prdnum_Remoteservicesparameters = "" ;
      Combo_prdnum_Htmltemplate = "" ;
      Combo_prdnum_Multiplevaluestype = "" ;
      Combo_prdnum_Loadingdata = "" ;
      Combo_prdnum_Noresultsfound = "" ;
      Combo_prdnum_Emptyitemtext = "" ;
      Combo_prdnum_Onlyselectedvalues = "" ;
      Combo_prdnum_Selectalltext = "" ;
      Combo_prdnum_Multiplevaluesseparator = "" ;
      Combo_prdnum_Addnewoptiontext = "" ;
      Dvelop_confirmpanel_renumerar_Objectcall = "" ;
      Dvelop_confirmpanel_renumerar_Width = "" ;
      Dvelop_confirmpanel_renumerar_Height = "" ;
      Dvelop_confirmpanel_renumerar_Class = "" ;
      Dvelop_confirmpanel_renumerar_Comment = "" ;
      Dvelop_confirmpanel_renumerar_Bodytype = "" ;
      Dvelop_confirmpanel_renumerar_Bodycontentinternalname = "" ;
      Dvelop_confirmpanel_renumerar_Texttype = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode32 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s5166CosKgmF = DecimalUtil.ZERO ;
      s5361ForCanSum = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A481ForCan = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A13926ColFibra = "" ;
      T481ForCan = DecimalUtil.ZERO ;
      T719PrdNum = "" ;
      T5167TotLinCoF = DecimalUtil.ZERO ;
      T000Q13_A5361ForCanSum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q13_A13757ColLinMax = new short[1] ;
      AV28emprnom = "" ;
      AV16msg0 = "" ;
      AV49Lit13 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV62WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV63TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV64WebSession = httpContext.getWebSession();
      AV66TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV57ForCanSum = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int9 = new int[1] ;
      GXv_int6 = new byte[1] ;
      AV77ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item13 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item14 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z5166CosKgmF = DecimalUtil.ZERO ;
      Z5361ForCanSum = DecimalUtil.ZERO ;
      Z6311Lb_TaAuxD = "" ;
      T000Q16_A407EmprNom = new String[] {""} ;
      T000Q16_n407EmprNom = new boolean[] {false} ;
      T000Q16_A3915EmpNumDec = new byte[1] ;
      T000Q16_n3915EmpNumDec = new boolean[] {false} ;
      T000Q19_A7259PrdHorMax = new byte[1] ;
      T000Q19_n7259PrdHorMax = new boolean[] {false} ;
      T000Q21_A5166CosKgmF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q21_n5166CosKgmF = new boolean[] {false} ;
      T000Q17_A6311Lb_TaAuxD = new String[] {""} ;
      T000Q25_A486ForNumCol = new int[1] ;
      T000Q25_A6369Lb_fam1 = new byte[1] ;
      T000Q25_A6370Lb_fam2 = new byte[1] ;
      T000Q25_A6371Lb_fam3 = new byte[1] ;
      T000Q25_A310ColUltLin = new short[1] ;
      T000Q25_A315ContNum = new int[1] ;
      T000Q25_A318CosKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q25_A407EmprNom = new String[] {""} ;
      T000Q25_n407EmprNom = new boolean[] {false} ;
      T000Q25_A3915EmpNumDec = new byte[1] ;
      T000Q25_n3915EmpNumDec = new boolean[] {false} ;
      T000Q25_A6311Lb_TaAuxD = new String[] {""} ;
      T000Q25_A396EmprCod = new String[] {""} ;
      T000Q25_A6310Lb_TaAuxC = new String[] {""} ;
      T000Q25_n6310Lb_TaAuxC = new boolean[] {false} ;
      T000Q25_A5166CosKgmF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q25_n5166CosKgmF = new boolean[] {false} ;
      T000Q25_A5361ForCanSum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q25_A7259PrdHorMax = new byte[1] ;
      T000Q25_n7259PrdHorMax = new boolean[] {false} ;
      T000Q25_A13757ColLinMax = new short[1] ;
      T000Q26_A6311Lb_TaAuxD = new String[] {""} ;
      T000Q28_A5166CosKgmF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q28_n5166CosKgmF = new boolean[] {false} ;
      T000Q30_A5361ForCanSum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q30_A13757ColLinMax = new short[1] ;
      T000Q31_A396EmprCod = new String[] {""} ;
      T000Q31_A486ForNumCol = new int[1] ;
      T000Q15_A486ForNumCol = new int[1] ;
      T000Q15_A6369Lb_fam1 = new byte[1] ;
      T000Q15_A6370Lb_fam2 = new byte[1] ;
      T000Q15_A6371Lb_fam3 = new byte[1] ;
      T000Q15_A310ColUltLin = new short[1] ;
      T000Q15_A315ContNum = new int[1] ;
      T000Q15_A318CosKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q15_A396EmprCod = new String[] {""} ;
      T000Q15_A6310Lb_TaAuxC = new String[] {""} ;
      T000Q15_n6310Lb_TaAuxC = new boolean[] {false} ;
      T000Q32_A396EmprCod = new String[] {""} ;
      T000Q32_A486ForNumCol = new int[1] ;
      T000Q33_A396EmprCod = new String[] {""} ;
      T000Q33_A486ForNumCol = new int[1] ;
      T000Q14_A486ForNumCol = new int[1] ;
      T000Q14_A6369Lb_fam1 = new byte[1] ;
      T000Q14_A6370Lb_fam2 = new byte[1] ;
      T000Q14_A6371Lb_fam3 = new byte[1] ;
      T000Q14_A310ColUltLin = new short[1] ;
      T000Q14_A315ContNum = new int[1] ;
      T000Q14_A318CosKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q14_A396EmprCod = new String[] {""} ;
      T000Q14_A6310Lb_TaAuxC = new String[] {""} ;
      T000Q14_n6310Lb_TaAuxC = new boolean[] {false} ;
      T000Q37_A6311Lb_TaAuxD = new String[] {""} ;
      T000Q39_A5166CosKgmF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q39_n5166CosKgmF = new boolean[] {false} ;
      T000Q41_A5361ForCanSum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q41_A13757ColLinMax = new short[1] ;
      T000Q42_A396EmprCod = new String[] {""} ;
      T000Q42_A486ForNumCol = new int[1] ;
      T000Q42_A715PrdLin = new short[1] ;
      T000Q43_A396EmprCod = new String[] {""} ;
      T000Q43_A252CliCod = new int[1] ;
      T000Q43_A494ForSer = new String[] {""} ;
      T000Q43_A482ForColNom = new String[] {""} ;
      T000Q43_A483ForColNum = new int[1] ;
      T000Q43_A831TipColCod = new byte[1] ;
      T000Q45_A396EmprCod = new String[] {""} ;
      T000Q45_A486ForNumCol = new int[1] ;
      Z718PrdNom = "" ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      Z488ForPrdDsc = "" ;
      T000Q9_A6223PrdNumMax = new String[] {""} ;
      T000Q9_n6223PrdNumMax = new boolean[] {false} ;
      T000Q46_A486ForNumCol = new int[1] ;
      T000Q46_A309ColLin = new short[1] ;
      T000Q46_A718PrdNom = new String[] {""} ;
      T000Q46_A4338PrdUMeFo = new byte[1] ;
      T000Q46_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q46_A488ForPrdDsc = new String[] {""} ;
      T000Q46_n488ForPrdDsc = new boolean[] {false} ;
      T000Q46_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q46_A838TotLinCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q46_A6193ForClaCol = new String[] {""} ;
      T000Q46_A7260PrdHorMad = new byte[1] ;
      T000Q46_A13232PrdRGB = new long[1] ;
      T000Q46_A13926ColFibra = new String[] {""} ;
      T000Q46_n13926ColFibra = new boolean[] {false} ;
      T000Q46_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q46_A396EmprCod = new String[] {""} ;
      T000Q46_A719PrdNum = new String[] {""} ;
      T000Q46_A490ForPrdUMe = new byte[1] ;
      T000Q46_A856ValCod = new byte[1] ;
      T000Q10_A718PrdNom = new String[] {""} ;
      T000Q10_A4338PrdUMeFo = new byte[1] ;
      T000Q10_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q10_A7260PrdHorMad = new byte[1] ;
      T000Q10_A13232PrdRGB = new long[1] ;
      T000Q10_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q10_A856ValCod = new byte[1] ;
      T000Q11_A488ForPrdDsc = new String[] {""} ;
      T000Q11_n488ForPrdDsc = new boolean[] {false} ;
      T000Q47_A718PrdNom = new String[] {""} ;
      T000Q47_A4338PrdUMeFo = new byte[1] ;
      T000Q47_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q47_A7260PrdHorMad = new byte[1] ;
      T000Q47_A13232PrdRGB = new long[1] ;
      T000Q47_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q47_A856ValCod = new byte[1] ;
      T000Q48_A488ForPrdDsc = new String[] {""} ;
      T000Q48_n488ForPrdDsc = new boolean[] {false} ;
      T000Q54_A6223PrdNumMax = new String[] {""} ;
      T000Q54_n6223PrdNumMax = new boolean[] {false} ;
      T000Q55_A396EmprCod = new String[] {""} ;
      T000Q55_A486ForNumCol = new int[1] ;
      T000Q55_A309ColLin = new short[1] ;
      T000Q3_A486ForNumCol = new int[1] ;
      T000Q3_A309ColLin = new short[1] ;
      T000Q3_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q3_A838TotLinCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q3_A6193ForClaCol = new String[] {""} ;
      T000Q3_A13926ColFibra = new String[] {""} ;
      T000Q3_n13926ColFibra = new boolean[] {false} ;
      T000Q3_A396EmprCod = new String[] {""} ;
      T000Q3_A719PrdNum = new String[] {""} ;
      T000Q3_A490ForPrdUMe = new byte[1] ;
      T000Q2_A486ForNumCol = new int[1] ;
      T000Q2_A309ColLin = new short[1] ;
      T000Q2_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q2_A838TotLinCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q2_A6193ForClaCol = new String[] {""} ;
      T000Q2_A13926ColFibra = new String[] {""} ;
      T000Q2_n13926ColFibra = new boolean[] {false} ;
      T000Q2_A396EmprCod = new String[] {""} ;
      T000Q2_A719PrdNum = new String[] {""} ;
      T000Q2_A490ForPrdUMe = new byte[1] ;
      T000Q64_A6223PrdNumMax = new String[] {""} ;
      T000Q64_n6223PrdNumMax = new boolean[] {false} ;
      T000Q65_A718PrdNom = new String[] {""} ;
      T000Q65_A4338PrdUMeFo = new byte[1] ;
      T000Q65_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q65_A7260PrdHorMad = new byte[1] ;
      T000Q65_A13232PrdRGB = new long[1] ;
      T000Q65_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000Q65_A856ValCod = new byte[1] ;
      T000Q66_A488ForPrdDsc = new String[] {""} ;
      T000Q66_n488ForPrdDsc = new boolean[] {false} ;
      T000Q67_A396EmprCod = new String[] {""} ;
      T000Q67_A486ForNumCol = new int[1] ;
      T000Q67_A309ColLin = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      imgprompt_490_gximage = "" ;
      sImgUrl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int12 = new byte[1] ;
      GXv_int11 = new byte[1] ;
      GXv_int10 = new byte[1] ;
      ZV53TaauxcOld = "" ;
      Z6223PrdNumMax = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tdformu__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tdformu__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tdformu__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tdformu__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tdformu__default(),
         new Object[] {
             new Object[] {
            T000Q2_A486ForNumCol, T000Q2_A309ColLin, T000Q2_A481ForCan, T000Q2_A838TotLinCol, T000Q2_A6193ForClaCol, T000Q2_A13926ColFibra, T000Q2_n13926ColFibra, T000Q2_A396EmprCod, T000Q2_A719PrdNum, T000Q2_A490ForPrdUMe
            }
            , new Object[] {
            T000Q3_A486ForNumCol, T000Q3_A309ColLin, T000Q3_A481ForCan, T000Q3_A838TotLinCol, T000Q3_A6193ForClaCol, T000Q3_A13926ColFibra, T000Q3_n13926ColFibra, T000Q3_A396EmprCod, T000Q3_A719PrdNum, T000Q3_A490ForPrdUMe
            }
            , new Object[] {
            T000Q9_A6223PrdNumMax, T000Q9_n6223PrdNumMax
            }
            , new Object[] {
            T000Q10_A718PrdNom, T000Q10_A4338PrdUMeFo, T000Q10_A724PrdPreAct, T000Q10_A7260PrdHorMad, T000Q10_A13232PrdRGB, T000Q10_A707PrdFacCon, T000Q10_A856ValCod
            }
            , new Object[] {
            T000Q11_A488ForPrdDsc, T000Q11_n488ForPrdDsc
            }
            , new Object[] {
            T000Q13_A5361ForCanSum, T000Q13_A13757ColLinMax
            }
            , new Object[] {
            T000Q14_A486ForNumCol, T000Q14_A6369Lb_fam1, T000Q14_A6370Lb_fam2, T000Q14_A6371Lb_fam3, T000Q14_A310ColUltLin, T000Q14_A315ContNum, T000Q14_A318CosKgm, T000Q14_A396EmprCod, T000Q14_A6310Lb_TaAuxC, T000Q14_n6310Lb_TaAuxC
            }
            , new Object[] {
            T000Q15_A486ForNumCol, T000Q15_A6369Lb_fam1, T000Q15_A6370Lb_fam2, T000Q15_A6371Lb_fam3, T000Q15_A310ColUltLin, T000Q15_A315ContNum, T000Q15_A318CosKgm, T000Q15_A396EmprCod, T000Q15_A6310Lb_TaAuxC, T000Q15_n6310Lb_TaAuxC
            }
            , new Object[] {
            T000Q16_A407EmprNom, T000Q16_n407EmprNom, T000Q16_A3915EmpNumDec, T000Q16_n3915EmpNumDec
            }
            , new Object[] {
            T000Q17_A6311Lb_TaAuxD
            }
            , new Object[] {
            T000Q19_A7259PrdHorMax, T000Q19_n7259PrdHorMax
            }
            , new Object[] {
            T000Q21_A5166CosKgmF, T000Q21_n5166CosKgmF
            }
            , new Object[] {
            T000Q25_A486ForNumCol, T000Q25_A6369Lb_fam1, T000Q25_A6370Lb_fam2, T000Q25_A6371Lb_fam3, T000Q25_A310ColUltLin, T000Q25_A315ContNum, T000Q25_A318CosKgm, T000Q25_A407EmprNom, T000Q25_n407EmprNom, T000Q25_A3915EmpNumDec,
            T000Q25_n3915EmpNumDec, T000Q25_A6311Lb_TaAuxD, T000Q25_A396EmprCod, T000Q25_A6310Lb_TaAuxC, T000Q25_n6310Lb_TaAuxC, T000Q25_A5166CosKgmF, T000Q25_n5166CosKgmF, T000Q25_A5361ForCanSum, T000Q25_A7259PrdHorMax, T000Q25_n7259PrdHorMax,
            T000Q25_A13757ColLinMax
            }
            , new Object[] {
            T000Q26_A6311Lb_TaAuxD
            }
            , new Object[] {
            T000Q28_A5166CosKgmF, T000Q28_n5166CosKgmF
            }
            , new Object[] {
            T000Q30_A5361ForCanSum, T000Q30_A13757ColLinMax
            }
            , new Object[] {
            T000Q31_A396EmprCod, T000Q31_A486ForNumCol
            }
            , new Object[] {
            T000Q32_A396EmprCod, T000Q32_A486ForNumCol
            }
            , new Object[] {
            T000Q33_A396EmprCod, T000Q33_A486ForNumCol
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000Q37_A6311Lb_TaAuxD
            }
            , new Object[] {
            T000Q39_A5166CosKgmF, T000Q39_n5166CosKgmF
            }
            , new Object[] {
            T000Q41_A5361ForCanSum, T000Q41_A13757ColLinMax
            }
            , new Object[] {
            T000Q42_A396EmprCod, T000Q42_A486ForNumCol, T000Q42_A715PrdLin
            }
            , new Object[] {
            T000Q43_A396EmprCod, T000Q43_A252CliCod, T000Q43_A494ForSer, T000Q43_A482ForColNom, T000Q43_A483ForColNum, T000Q43_A831TipColCod
            }
            , new Object[] {
            }
            , new Object[] {
            T000Q45_A396EmprCod, T000Q45_A486ForNumCol
            }
            , new Object[] {
            T000Q46_A486ForNumCol, T000Q46_A309ColLin, T000Q46_A718PrdNom, T000Q46_A4338PrdUMeFo, T000Q46_A724PrdPreAct, T000Q46_A488ForPrdDsc, T000Q46_n488ForPrdDsc, T000Q46_A481ForCan, T000Q46_A838TotLinCol, T000Q46_A6193ForClaCol,
            T000Q46_A7260PrdHorMad, T000Q46_A13232PrdRGB, T000Q46_A13926ColFibra, T000Q46_n13926ColFibra, T000Q46_A707PrdFacCon, T000Q46_A396EmprCod, T000Q46_A719PrdNum, T000Q46_A490ForPrdUMe, T000Q46_A856ValCod
            }
            , new Object[] {
            T000Q47_A718PrdNom, T000Q47_A4338PrdUMeFo, T000Q47_A724PrdPreAct, T000Q47_A7260PrdHorMad, T000Q47_A13232PrdRGB, T000Q47_A707PrdFacCon, T000Q47_A856ValCod
            }
            , new Object[] {
            T000Q48_A488ForPrdDsc, T000Q48_n488ForPrdDsc
            }
            , new Object[] {
            T000Q54_A6223PrdNumMax, T000Q54_n6223PrdNumMax
            }
            , new Object[] {
            T000Q55_A396EmprCod, T000Q55_A486ForNumCol, T000Q55_A309ColLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000Q64_A6223PrdNumMax, T000Q64_n6223PrdNumMax
            }
            , new Object[] {
            T000Q65_A718PrdNom, T000Q65_A4338PrdUMeFo, T000Q65_A724PrdPreAct, T000Q65_A7260PrdHorMad, T000Q65_A13232PrdRGB, T000Q65_A707PrdFacCon, T000Q65_A856ValCod
            }
            , new Object[] {
            T000Q66_A488ForPrdDsc, T000Q66_n488ForPrdDsc
            }
            , new Object[] {
            T000Q67_A396EmprCod, T000Q67_A486ForNumCol, T000Q67_A309ColLin
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV98Pgmname = "FormulacionTinte.TDFORMU" ;
   }

   private byte wcpOAV29FlagMod ;
   private byte Z6369Lb_fam1 ;
   private byte Z6370Lb_fam2 ;
   private byte Z6371Lb_fam3 ;
   private byte Z490ForPrdUMe ;
   private byte GxWebError ;
   private byte A6369Lb_fam1 ;
   private byte A6370Lb_fam2 ;
   private byte A6371Lb_fam3 ;
   private byte AV47prdaux ;
   private byte A490ForPrdUMe ;
   private byte AV29FlagMod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte AV78ComboLb_fam1 ;
   private byte AV84ComboLb_fam2 ;
   private byte AV86ComboLb_fam3 ;
   private byte A3915EmpNumDec ;
   private byte A7259PrdHorMax ;
   private byte A4338PrdUMeFo ;
   private byte A7260PrdHorMad ;
   private byte A856ValCod ;
   private byte AV34F_lavand ;
   private byte AV43ClaveCol ;
   private byte AV58OtraformaAux ;
   private byte AV56Fam1d1 ;
   private byte GXv_int6[] ;
   private byte AV52Error_sumc ;
   private byte Z3915EmpNumDec ;
   private byte Z7259PrdHorMax ;
   private byte GXt_int5 ;
   private byte Z4338PrdUMeFo ;
   private byte Z7260PrdHorMad ;
   private byte Z856ValCod ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte GXv_int12[] ;
   private byte GXv_int11[] ;
   private byte GXv_int10[] ;
   private short nIsMod_33 ;
   private short Z310ColUltLin ;
   private short O310ColUltLin ;
   private short Z309ColLin ;
   private short nRcdDeleted_33 ;
   private short nRcdExists_33 ;
   private short A309ColLin ;
   private short A6222ColLinV ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A310ColUltLin ;
   private short nBlankRcdCount33 ;
   private short RcdFound33 ;
   private short B310ColUltLin ;
   private short nBlankRcdUsr33 ;
   private short A13757ColLinMax ;
   private short RcdFound32 ;
   private short s310ColUltLin ;
   private short AV69R ;
   private short AV70G ;
   private short AV71B ;
   private short AV72R2 ;
   private short AV73G2 ;
   private short AV74B2 ;
   private short AV75texpasa ;
   private short Z13757ColLinMax ;
   private short nIsDirty_32 ;
   private short nIsDirty_33 ;
   private short i310ColUltLin ;
   private short Z6222ColLinV ;
   private int wcpOAV61ForNumCol ;
   private int wcpOAV67ContNum ;
   private int Z486ForNumCol ;
   private int Z315ContNum ;
   private int nRC_GXsfl_103 ;
   private int nGXsfl_103_idx=1 ;
   private int A486ForNumCol ;
   private int A6221ForNumColV ;
   private int AV61ForNumCol ;
   private int AV67ContNum ;
   private int trnEnded ;
   private int edtForNumCol_Enabled ;
   private int edtCosKgmF_Enabled ;
   private int edtLb_TaAuxC_Visible ;
   private int edtLb_TaAuxC_Enabled ;
   private int edtLb_fam1_Enabled ;
   private int edtLb_fam1_Visible ;
   private int edtLb_fam2_Enabled ;
   private int edtLb_fam2_Visible ;
   private int edtLb_fam3_Enabled ;
   private int edtLb_fam3_Visible ;
   private int edtavTittxt_Enabled ;
   private int bttBtnrenumerar_Visible ;
   private int edtForCanSum_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int divUnnamedtable1_Height ;
   private int edtavPgmname_Enabled ;
   private int edtavCombolb_taauxc_Visible ;
   private int edtavCombolb_taauxc_Enabled ;
   private int edtavCombolb_fam1_Enabled ;
   private int edtavCombolb_fam1_Visible ;
   private int edtavCombolb_fam2_Enabled ;
   private int edtavCombolb_fam2_Visible ;
   private int edtavCombolb_fam3_Enabled ;
   private int edtavCombolb_fam3_Visible ;
   private int edtColLin_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtValCod_Enabled ;
   private int edtPrdPreAct_Enabled ;
   private int edtForCan_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtForPrdDsc_Enabled ;
   private int edtPrdRGB_Enabled ;
   private int edtavPrdrgb_Enabled ;
   private int edtavR_Enabled ;
   private int edtavG_Enabled ;
   private int edtavB_Enabled ;
   private int edtavR2_Enabled ;
   private int edtavG2_Enabled ;
   private int edtavB2_Enabled ;
   private int edtColFibra_Enabled ;
   private int fRowAdded ;
   private int A315ContNum ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Combo_lb_taauxc_Datalistupdateminimumcharacters ;
   private int Combo_lb_taauxc_Gxcontroltype ;
   private int Combo_lb_fam1_Datalistupdateminimumcharacters ;
   private int Combo_lb_fam1_Gxcontroltype ;
   private int Combo_lb_fam2_Datalistupdateminimumcharacters ;
   private int Combo_lb_fam2_Gxcontroltype ;
   private int Combo_lb_fam3_Datalistupdateminimumcharacters ;
   private int Combo_lb_fam3_Gxcontroltype ;
   private int Dvpanel_unnamedtable2_Gxcontroltype ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_prdnum_Datalistupdateminimumcharacters ;
   private int Combo_prdnum_Gxcontroltype ;
   private int AV99GXV1 ;
   private int GXv_int9[] ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int imgprompt_490_Visible ;
   private int defedtColFibra_Enabled ;
   private int defedtPrdRGB_Enabled ;
   private int defedtPrdPreAct_Enabled ;
   private int defedtValCod_Enabled ;
   private int defedtPrdNom_Enabled ;
   private int defedtColLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int Z6221ForNumColV ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private long A13232PrdRGB ;
   private long AV68PrdRGB ;
   private long Z13232PrdRGB ;
   private java.math.BigDecimal Z318CosKgm ;
   private java.math.BigDecimal O5166CosKgmF ;
   private java.math.BigDecimal O5361ForCanSum ;
   private java.math.BigDecimal Z481ForCan ;
   private java.math.BigDecimal Z838TotLinCol ;
   private java.math.BigDecimal O481ForCan ;
   private java.math.BigDecimal O5167TotLinCoF ;
   private java.math.BigDecimal A5166CosKgmF ;
   private java.math.BigDecimal A5361ForCanSum ;
   private java.math.BigDecimal B5166CosKgmF ;
   private java.math.BigDecimal B5361ForCanSum ;
   private java.math.BigDecimal A318CosKgm ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A5167TotLinCoF ;
   private java.math.BigDecimal A838TotLinCol ;
   private java.math.BigDecimal s5166CosKgmF ;
   private java.math.BigDecimal s5361ForCanSum ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal T481ForCan ;
   private java.math.BigDecimal T5167TotLinCoF ;
   private java.math.BigDecimal AV57ForCanSum ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal Z5166CosKgmF ;
   private java.math.BigDecimal Z5361ForCanSum ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal Z707PrdFacCon ;
   private String sPrefix ;
   private String sGXsfl_103_idx="0001" ;
   private String wcpOGx_mode ;
   private String wcpOAV31EmprCod ;
   private String wcpOAV32ForOpcCli ;
   private String Z396EmprCod ;
   private String Z6310Lb_TaAuxC ;
   private String O6310Lb_TaAuxC ;
   private String N6310Lb_TaAuxC ;
   private String Dvelop_confirmpanel_renumerar_Result ;
   private String Combo_lb_fam3_Selectedvalue_get ;
   private String Combo_lb_fam2_Selectedvalue_get ;
   private String Combo_lb_fam1_Selectedvalue_get ;
   private String Combo_lb_taauxc_Selectedvalue_get ;
   private String Z6193ForClaCol ;
   private String Z13926ColFibra ;
   private String Z719PrdNum ;
   private String O719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A6310Lb_TaAuxC ;
   private String AV80ComboLb_TaAuxC ;
   private String AV53TaauxcOld ;
   private String AV98Pgmname ;
   private String AV23UsurCod ;
   private String AV27Station ;
   private String A719PrdNum ;
   private String A6220EmprCodV3 ;
   private String Gx_mode ;
   private String AV31EmprCod ;
   private String AV32ForOpcCli ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtLb_TaAuxC_Internalname ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtForNumCol_Internalname ;
   private String edtForNumCol_Jsonclick ;
   private String edtCosKgmF_Internalname ;
   private String edtCosKgmF_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String divDvpanel_unnamedtable2_cell_Internalname ;
   private String divDvpanel_unnamedtable2_cell_Class ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divTablesplittedlb_taauxc_Internalname ;
   private String lblTextblocklb_taauxc_Internalname ;
   private String lblTextblocklb_taauxc_Jsonclick ;
   private String Combo_lb_taauxc_Caption ;
   private String Combo_lb_taauxc_Cls ;
   private String Combo_lb_taauxc_Internalname ;
   private String TempTags ;
   private String edtLb_TaAuxC_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String divTablesplittedlb_fam1_Internalname ;
   private String lblTextblocklb_fam1_Internalname ;
   private String lblTextblocklb_fam1_Jsonclick ;
   private String Combo_lb_fam1_Caption ;
   private String Combo_lb_fam1_Cls ;
   private String Combo_lb_fam1_Internalname ;
   private String edtLb_fam1_Internalname ;
   private String edtLb_fam1_Jsonclick ;
   private String divTablesplittedlb_fam2_Internalname ;
   private String lblTextblocklb_fam2_Internalname ;
   private String lblTextblocklb_fam2_Jsonclick ;
   private String Combo_lb_fam2_Caption ;
   private String Combo_lb_fam2_Cls ;
   private String Combo_lb_fam2_Internalname ;
   private String edtLb_fam2_Internalname ;
   private String edtLb_fam2_Jsonclick ;
   private String divTablesplittedlb_fam3_Internalname ;
   private String lblTextblocklb_fam3_Internalname ;
   private String lblTextblocklb_fam3_Jsonclick ;
   private String Combo_lb_fam3_Caption ;
   private String Combo_lb_fam3_Cls ;
   private String Combo_lb_fam3_Internalname ;
   private String edtLb_fam3_Internalname ;
   private String edtLb_fam3_Jsonclick ;
   private String edtavTittxt_Internalname ;
   private String edtavTittxt_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnrenumerar_Internalname ;
   private String bttBtnrenumerar_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String edtForCanSum_Internalname ;
   private String edtForCanSum_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_lb_taauxc_Internalname ;
   private String edtavCombolb_taauxc_Internalname ;
   private String edtavCombolb_taauxc_Jsonclick ;
   private String divSectionattribute_lb_fam1_Internalname ;
   private String edtavCombolb_fam1_Internalname ;
   private String edtavCombolb_fam1_Jsonclick ;
   private String divSectionattribute_lb_fam2_Internalname ;
   private String edtavCombolb_fam2_Internalname ;
   private String edtavCombolb_fam2_Jsonclick ;
   private String divSectionattribute_lb_fam3_Internalname ;
   private String edtavCombolb_fam3_Internalname ;
   private String edtavCombolb_fam3_Jsonclick ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Internalname ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_renumerar_Internalname ;
   private String Dvelop_confirmpanel_renumerar_Title ;
   private String Dvelop_confirmpanel_renumerar_Confirmationtext ;
   private String Dvelop_confirmpanel_renumerar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_renumerar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_renumerar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_renumerar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_renumerar_Confirmtype ;
   private String Dvelop_confirmpanel_renumerar_Internalname ;
   private String B6310Lb_TaAuxC ;
   private String sMode33 ;
   private String edtColLin_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNom_Internalname ;
   private String edtValCod_Internalname ;
   private String edtPrdPreAct_Internalname ;
   private String edtForCan_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdDsc_Internalname ;
   private String edtPrdRGB_Internalname ;
   private String edtavPrdrgb_Internalname ;
   private String edtavR_Internalname ;
   private String edtavG_Internalname ;
   private String edtavB_Internalname ;
   private String edtavR2_Internalname ;
   private String edtavG2_Internalname ;
   private String edtavB2_Internalname ;
   private String edtColFibra_Internalname ;
   private String imgprompt_490_Link ;
   private String subGridlevel_level1_Internalname ;
   private String AV65Insert_Lb_TaAuxC ;
   private String A407EmprNom ;
   private String A6311Lb_TaAuxD ;
   private String A6193ForClaCol ;
   private String A6223PrdNumMax ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_lb_taauxc_Objectcall ;
   private String Combo_lb_taauxc_Class ;
   private String Combo_lb_taauxc_Icontype ;
   private String Combo_lb_taauxc_Icon ;
   private String Combo_lb_taauxc_Tooltip ;
   private String Combo_lb_taauxc_Selectedvalue_set ;
   private String Combo_lb_taauxc_Selectedtext_set ;
   private String Combo_lb_taauxc_Selectedtext_get ;
   private String Combo_lb_taauxc_Gamoauthtoken ;
   private String Combo_lb_taauxc_Ddointernalname ;
   private String Combo_lb_taauxc_Titlecontrolalign ;
   private String Combo_lb_taauxc_Dropdownoptionstype ;
   private String Combo_lb_taauxc_Titlecontrolidtoreplace ;
   private String Combo_lb_taauxc_Datalisttype ;
   private String Combo_lb_taauxc_Datalistfixedvalues ;
   private String Combo_lb_taauxc_Datalistproc ;
   private String Combo_lb_taauxc_Datalistprocparametersprefix ;
   private String Combo_lb_taauxc_Remoteservicesparameters ;
   private String Combo_lb_taauxc_Htmltemplate ;
   private String Combo_lb_taauxc_Multiplevaluestype ;
   private String Combo_lb_taauxc_Loadingdata ;
   private String Combo_lb_taauxc_Noresultsfound ;
   private String Combo_lb_taauxc_Emptyitemtext ;
   private String Combo_lb_taauxc_Onlyselectedvalues ;
   private String Combo_lb_taauxc_Selectalltext ;
   private String Combo_lb_taauxc_Multiplevaluesseparator ;
   private String Combo_lb_taauxc_Addnewoptiontext ;
   private String Combo_lb_fam1_Objectcall ;
   private String Combo_lb_fam1_Class ;
   private String Combo_lb_fam1_Icontype ;
   private String Combo_lb_fam1_Icon ;
   private String Combo_lb_fam1_Tooltip ;
   private String Combo_lb_fam1_Selectedvalue_set ;
   private String Combo_lb_fam1_Selectedtext_set ;
   private String Combo_lb_fam1_Selectedtext_get ;
   private String Combo_lb_fam1_Gamoauthtoken ;
   private String Combo_lb_fam1_Ddointernalname ;
   private String Combo_lb_fam1_Titlecontrolalign ;
   private String Combo_lb_fam1_Dropdownoptionstype ;
   private String Combo_lb_fam1_Titlecontrolidtoreplace ;
   private String Combo_lb_fam1_Datalisttype ;
   private String Combo_lb_fam1_Datalistfixedvalues ;
   private String Combo_lb_fam1_Datalistproc ;
   private String Combo_lb_fam1_Datalistprocparametersprefix ;
   private String Combo_lb_fam1_Remoteservicesparameters ;
   private String Combo_lb_fam1_Htmltemplate ;
   private String Combo_lb_fam1_Multiplevaluestype ;
   private String Combo_lb_fam1_Loadingdata ;
   private String Combo_lb_fam1_Noresultsfound ;
   private String Combo_lb_fam1_Emptyitemtext ;
   private String Combo_lb_fam1_Onlyselectedvalues ;
   private String Combo_lb_fam1_Selectalltext ;
   private String Combo_lb_fam1_Multiplevaluesseparator ;
   private String Combo_lb_fam1_Addnewoptiontext ;
   private String Combo_lb_fam2_Objectcall ;
   private String Combo_lb_fam2_Class ;
   private String Combo_lb_fam2_Icontype ;
   private String Combo_lb_fam2_Icon ;
   private String Combo_lb_fam2_Tooltip ;
   private String Combo_lb_fam2_Selectedvalue_set ;
   private String Combo_lb_fam2_Selectedtext_set ;
   private String Combo_lb_fam2_Selectedtext_get ;
   private String Combo_lb_fam2_Gamoauthtoken ;
   private String Combo_lb_fam2_Ddointernalname ;
   private String Combo_lb_fam2_Titlecontrolalign ;
   private String Combo_lb_fam2_Dropdownoptionstype ;
   private String Combo_lb_fam2_Titlecontrolidtoreplace ;
   private String Combo_lb_fam2_Datalisttype ;
   private String Combo_lb_fam2_Datalistfixedvalues ;
   private String Combo_lb_fam2_Datalistproc ;
   private String Combo_lb_fam2_Datalistprocparametersprefix ;
   private String Combo_lb_fam2_Remoteservicesparameters ;
   private String Combo_lb_fam2_Htmltemplate ;
   private String Combo_lb_fam2_Multiplevaluestype ;
   private String Combo_lb_fam2_Loadingdata ;
   private String Combo_lb_fam2_Noresultsfound ;
   private String Combo_lb_fam2_Emptyitemtext ;
   private String Combo_lb_fam2_Onlyselectedvalues ;
   private String Combo_lb_fam2_Selectalltext ;
   private String Combo_lb_fam2_Multiplevaluesseparator ;
   private String Combo_lb_fam2_Addnewoptiontext ;
   private String Combo_lb_fam3_Objectcall ;
   private String Combo_lb_fam3_Class ;
   private String Combo_lb_fam3_Icontype ;
   private String Combo_lb_fam3_Icon ;
   private String Combo_lb_fam3_Tooltip ;
   private String Combo_lb_fam3_Selectedvalue_set ;
   private String Combo_lb_fam3_Selectedtext_set ;
   private String Combo_lb_fam3_Selectedtext_get ;
   private String Combo_lb_fam3_Gamoauthtoken ;
   private String Combo_lb_fam3_Ddointernalname ;
   private String Combo_lb_fam3_Titlecontrolalign ;
   private String Combo_lb_fam3_Dropdownoptionstype ;
   private String Combo_lb_fam3_Titlecontrolidtoreplace ;
   private String Combo_lb_fam3_Datalisttype ;
   private String Combo_lb_fam3_Datalistfixedvalues ;
   private String Combo_lb_fam3_Datalistproc ;
   private String Combo_lb_fam3_Datalistprocparametersprefix ;
   private String Combo_lb_fam3_Remoteservicesparameters ;
   private String Combo_lb_fam3_Htmltemplate ;
   private String Combo_lb_fam3_Multiplevaluestype ;
   private String Combo_lb_fam3_Loadingdata ;
   private String Combo_lb_fam3_Noresultsfound ;
   private String Combo_lb_fam3_Emptyitemtext ;
   private String Combo_lb_fam3_Onlyselectedvalues ;
   private String Combo_lb_fam3_Selectalltext ;
   private String Combo_lb_fam3_Multiplevaluesseparator ;
   private String Combo_lb_fam3_Addnewoptiontext ;
   private String Dvpanel_unnamedtable2_Objectcall ;
   private String Dvpanel_unnamedtable2_Class ;
   private String Dvpanel_unnamedtable2_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_prdnum_Objectcall ;
   private String Combo_prdnum_Class ;
   private String Combo_prdnum_Icontype ;
   private String Combo_prdnum_Icon ;
   private String Combo_prdnum_Tooltip ;
   private String Combo_prdnum_Selectedvalue_set ;
   private String Combo_prdnum_Selectedvalue_get ;
   private String Combo_prdnum_Selectedtext_set ;
   private String Combo_prdnum_Selectedtext_get ;
   private String Combo_prdnum_Gamoauthtoken ;
   private String Combo_prdnum_Ddointernalname ;
   private String Combo_prdnum_Titlecontrolalign ;
   private String Combo_prdnum_Dropdownoptionstype ;
   private String Combo_prdnum_Titlecontrolidtoreplace ;
   private String Combo_prdnum_Datalisttype ;
   private String Combo_prdnum_Datalistfixedvalues ;
   private String Combo_prdnum_Datalistproc ;
   private String Combo_prdnum_Datalistprocparametersprefix ;
   private String Combo_prdnum_Remoteservicesparameters ;
   private String Combo_prdnum_Htmltemplate ;
   private String Combo_prdnum_Multiplevaluestype ;
   private String Combo_prdnum_Loadingdata ;
   private String Combo_prdnum_Noresultsfound ;
   private String Combo_prdnum_Emptyitemtext ;
   private String Combo_prdnum_Onlyselectedvalues ;
   private String Combo_prdnum_Selectalltext ;
   private String Combo_prdnum_Multiplevaluesseparator ;
   private String Combo_prdnum_Addnewoptiontext ;
   private String Dvelop_confirmpanel_renumerar_Objectcall ;
   private String Dvelop_confirmpanel_renumerar_Width ;
   private String Dvelop_confirmpanel_renumerar_Height ;
   private String Dvelop_confirmpanel_renumerar_Class ;
   private String Dvelop_confirmpanel_renumerar_Comment ;
   private String Dvelop_confirmpanel_renumerar_Bodytype ;
   private String Dvelop_confirmpanel_renumerar_Bodycontentinternalname ;
   private String Dvelop_confirmpanel_renumerar_Texttype ;
   private String hsh ;
   private String sMode32 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String A13926ColFibra ;
   private String T719PrdNum ;
   private String AV28emprnom ;
   private String AV16msg0 ;
   private String AV49Lit13 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z6311Lb_TaAuxD ;
   private String Z718PrdNom ;
   private String Z488ForPrdDsc ;
   private String imgprompt_490_Internalname ;
   private String sGXsfl_103_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtColLin_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtValCod_Jsonclick ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtForCan_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String imgprompt_490_gximage ;
   private String sImgUrl ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtPrdRGB_Jsonclick ;
   private String edtavPrdrgb_Jsonclick ;
   private String edtavR_Jsonclick ;
   private String edtavG_Jsonclick ;
   private String edtavB_Jsonclick ;
   private String edtavR2_Jsonclick ;
   private String edtavG2_Jsonclick ;
   private String edtavB2_Jsonclick ;
   private String edtColFibra_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String ZV53TaauxcOld ;
   private String Z6223PrdNumMax ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n6310Lb_TaAuxC ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Combo_lb_taauxc_Emptyitem ;
   private boolean Combo_lb_fam1_Emptyitem ;
   private boolean Combo_lb_fam2_Emptyitem ;
   private boolean Combo_lb_fam3_Emptyitem ;
   private boolean Combo_prdnum_Isgriditem ;
   private boolean Combo_prdnum_Emptyitem ;
   private boolean n5166CosKgmF ;
   private boolean bGXsfl_103_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n3915EmpNumDec ;
   private boolean n7259PrdHorMax ;
   private boolean n6223PrdNumMax ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_lb_taauxc_Enabled ;
   private boolean Combo_lb_taauxc_Visible ;
   private boolean Combo_lb_taauxc_Allowmultipleselection ;
   private boolean Combo_lb_taauxc_Isgriditem ;
   private boolean Combo_lb_taauxc_Hasdescription ;
   private boolean Combo_lb_taauxc_Includeonlyselectedoption ;
   private boolean Combo_lb_taauxc_Includeselectalloption ;
   private boolean Combo_lb_taauxc_Includeaddnewoption ;
   private boolean Combo_lb_fam1_Enabled ;
   private boolean Combo_lb_fam1_Visible ;
   private boolean Combo_lb_fam1_Allowmultipleselection ;
   private boolean Combo_lb_fam1_Isgriditem ;
   private boolean Combo_lb_fam1_Hasdescription ;
   private boolean Combo_lb_fam1_Includeonlyselectedoption ;
   private boolean Combo_lb_fam1_Includeselectalloption ;
   private boolean Combo_lb_fam1_Includeaddnewoption ;
   private boolean Combo_lb_fam2_Enabled ;
   private boolean Combo_lb_fam2_Visible ;
   private boolean Combo_lb_fam2_Allowmultipleselection ;
   private boolean Combo_lb_fam2_Isgriditem ;
   private boolean Combo_lb_fam2_Hasdescription ;
   private boolean Combo_lb_fam2_Includeonlyselectedoption ;
   private boolean Combo_lb_fam2_Includeselectalloption ;
   private boolean Combo_lb_fam2_Includeaddnewoption ;
   private boolean Combo_lb_fam3_Enabled ;
   private boolean Combo_lb_fam3_Visible ;
   private boolean Combo_lb_fam3_Allowmultipleselection ;
   private boolean Combo_lb_fam3_Isgriditem ;
   private boolean Combo_lb_fam3_Hasdescription ;
   private boolean Combo_lb_fam3_Includeonlyselectedoption ;
   private boolean Combo_lb_fam3_Includeselectalloption ;
   private boolean Combo_lb_fam3_Includeaddnewoption ;
   private boolean Dvpanel_unnamedtable2_Enabled ;
   private boolean Dvpanel_unnamedtable2_Showheader ;
   private boolean Dvpanel_unnamedtable2_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_prdnum_Enabled ;
   private boolean Combo_prdnum_Visible ;
   private boolean Combo_prdnum_Allowmultipleselection ;
   private boolean Combo_prdnum_Hasdescription ;
   private boolean Combo_prdnum_Includeonlyselectedoption ;
   private boolean Combo_prdnum_Includeselectalloption ;
   private boolean Combo_prdnum_Includeaddnewoption ;
   private boolean Dvelop_confirmpanel_renumerar_Enabled ;
   private boolean Dvelop_confirmpanel_renumerar_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n488ForPrdDsc ;
   private boolean n13926ColFibra ;
   private String AV40Texto_i ;
   private String AV55TitTxt ;
   private String AV77ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV64WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucCombo_lb_taauxc ;
   private com.genexus.webpanels.GXUserControl ucCombo_lb_fam1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_lb_fam2 ;
   private com.genexus.webpanels.GXUserControl ucCombo_lb_fam3 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_renumerar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] T000Q13_A5361ForCanSum ;
   private short[] T000Q13_A13757ColLinMax ;
   private String[] T000Q16_A407EmprNom ;
   private boolean[] T000Q16_n407EmprNom ;
   private byte[] T000Q16_A3915EmpNumDec ;
   private boolean[] T000Q16_n3915EmpNumDec ;
   private byte[] T000Q19_A7259PrdHorMax ;
   private boolean[] T000Q19_n7259PrdHorMax ;
   private java.math.BigDecimal[] T000Q21_A5166CosKgmF ;
   private boolean[] T000Q21_n5166CosKgmF ;
   private String[] T000Q17_A6311Lb_TaAuxD ;
   private int[] T000Q25_A486ForNumCol ;
   private byte[] T000Q25_A6369Lb_fam1 ;
   private byte[] T000Q25_A6370Lb_fam2 ;
   private byte[] T000Q25_A6371Lb_fam3 ;
   private short[] T000Q25_A310ColUltLin ;
   private int[] T000Q25_A315ContNum ;
   private java.math.BigDecimal[] T000Q25_A318CosKgm ;
   private String[] T000Q25_A407EmprNom ;
   private boolean[] T000Q25_n407EmprNom ;
   private byte[] T000Q25_A3915EmpNumDec ;
   private boolean[] T000Q25_n3915EmpNumDec ;
   private String[] T000Q25_A6311Lb_TaAuxD ;
   private String[] T000Q25_A396EmprCod ;
   private String[] T000Q25_A6310Lb_TaAuxC ;
   private boolean[] T000Q25_n6310Lb_TaAuxC ;
   private java.math.BigDecimal[] T000Q25_A5166CosKgmF ;
   private boolean[] T000Q25_n5166CosKgmF ;
   private java.math.BigDecimal[] T000Q25_A5361ForCanSum ;
   private byte[] T000Q25_A7259PrdHorMax ;
   private boolean[] T000Q25_n7259PrdHorMax ;
   private short[] T000Q25_A13757ColLinMax ;
   private String[] T000Q26_A6311Lb_TaAuxD ;
   private java.math.BigDecimal[] T000Q28_A5166CosKgmF ;
   private boolean[] T000Q28_n5166CosKgmF ;
   private java.math.BigDecimal[] T000Q30_A5361ForCanSum ;
   private short[] T000Q30_A13757ColLinMax ;
   private String[] T000Q31_A396EmprCod ;
   private int[] T000Q31_A486ForNumCol ;
   private int[] T000Q15_A486ForNumCol ;
   private byte[] T000Q15_A6369Lb_fam1 ;
   private byte[] T000Q15_A6370Lb_fam2 ;
   private byte[] T000Q15_A6371Lb_fam3 ;
   private short[] T000Q15_A310ColUltLin ;
   private int[] T000Q15_A315ContNum ;
   private java.math.BigDecimal[] T000Q15_A318CosKgm ;
   private String[] T000Q15_A396EmprCod ;
   private String[] T000Q15_A6310Lb_TaAuxC ;
   private boolean[] T000Q15_n6310Lb_TaAuxC ;
   private String[] T000Q32_A396EmprCod ;
   private int[] T000Q32_A486ForNumCol ;
   private String[] T000Q33_A396EmprCod ;
   private int[] T000Q33_A486ForNumCol ;
   private int[] T000Q14_A486ForNumCol ;
   private byte[] T000Q14_A6369Lb_fam1 ;
   private byte[] T000Q14_A6370Lb_fam2 ;
   private byte[] T000Q14_A6371Lb_fam3 ;
   private short[] T000Q14_A310ColUltLin ;
   private int[] T000Q14_A315ContNum ;
   private java.math.BigDecimal[] T000Q14_A318CosKgm ;
   private String[] T000Q14_A396EmprCod ;
   private String[] T000Q14_A6310Lb_TaAuxC ;
   private boolean[] T000Q14_n6310Lb_TaAuxC ;
   private String[] T000Q37_A6311Lb_TaAuxD ;
   private java.math.BigDecimal[] T000Q39_A5166CosKgmF ;
   private boolean[] T000Q39_n5166CosKgmF ;
   private java.math.BigDecimal[] T000Q41_A5361ForCanSum ;
   private short[] T000Q41_A13757ColLinMax ;
   private String[] T000Q42_A396EmprCod ;
   private int[] T000Q42_A486ForNumCol ;
   private short[] T000Q42_A715PrdLin ;
   private String[] T000Q43_A396EmprCod ;
   private int[] T000Q43_A252CliCod ;
   private String[] T000Q43_A494ForSer ;
   private String[] T000Q43_A482ForColNom ;
   private int[] T000Q43_A483ForColNum ;
   private byte[] T000Q43_A831TipColCod ;
   private String[] T000Q45_A396EmprCod ;
   private int[] T000Q45_A486ForNumCol ;
   private String[] T000Q9_A6223PrdNumMax ;
   private boolean[] T000Q9_n6223PrdNumMax ;
   private int[] T000Q46_A486ForNumCol ;
   private short[] T000Q46_A309ColLin ;
   private String[] T000Q46_A718PrdNom ;
   private byte[] T000Q46_A4338PrdUMeFo ;
   private java.math.BigDecimal[] T000Q46_A724PrdPreAct ;
   private String[] T000Q46_A488ForPrdDsc ;
   private boolean[] T000Q46_n488ForPrdDsc ;
   private java.math.BigDecimal[] T000Q46_A481ForCan ;
   private java.math.BigDecimal[] T000Q46_A838TotLinCol ;
   private String[] T000Q46_A6193ForClaCol ;
   private byte[] T000Q46_A7260PrdHorMad ;
   private long[] T000Q46_A13232PrdRGB ;
   private String[] T000Q46_A13926ColFibra ;
   private boolean[] T000Q46_n13926ColFibra ;
   private java.math.BigDecimal[] T000Q46_A707PrdFacCon ;
   private String[] T000Q46_A396EmprCod ;
   private String[] T000Q46_A719PrdNum ;
   private byte[] T000Q46_A490ForPrdUMe ;
   private byte[] T000Q46_A856ValCod ;
   private String[] T000Q10_A718PrdNom ;
   private byte[] T000Q10_A4338PrdUMeFo ;
   private java.math.BigDecimal[] T000Q10_A724PrdPreAct ;
   private byte[] T000Q10_A7260PrdHorMad ;
   private long[] T000Q10_A13232PrdRGB ;
   private java.math.BigDecimal[] T000Q10_A707PrdFacCon ;
   private byte[] T000Q10_A856ValCod ;
   private String[] T000Q11_A488ForPrdDsc ;
   private boolean[] T000Q11_n488ForPrdDsc ;
   private String[] T000Q47_A718PrdNom ;
   private byte[] T000Q47_A4338PrdUMeFo ;
   private java.math.BigDecimal[] T000Q47_A724PrdPreAct ;
   private byte[] T000Q47_A7260PrdHorMad ;
   private long[] T000Q47_A13232PrdRGB ;
   private java.math.BigDecimal[] T000Q47_A707PrdFacCon ;
   private byte[] T000Q47_A856ValCod ;
   private String[] T000Q48_A488ForPrdDsc ;
   private boolean[] T000Q48_n488ForPrdDsc ;
   private String[] T000Q54_A6223PrdNumMax ;
   private boolean[] T000Q54_n6223PrdNumMax ;
   private String[] T000Q55_A396EmprCod ;
   private int[] T000Q55_A486ForNumCol ;
   private short[] T000Q55_A309ColLin ;
   private int[] T000Q3_A486ForNumCol ;
   private short[] T000Q3_A309ColLin ;
   private java.math.BigDecimal[] T000Q3_A481ForCan ;
   private java.math.BigDecimal[] T000Q3_A838TotLinCol ;
   private String[] T000Q3_A6193ForClaCol ;
   private String[] T000Q3_A13926ColFibra ;
   private boolean[] T000Q3_n13926ColFibra ;
   private String[] T000Q3_A396EmprCod ;
   private String[] T000Q3_A719PrdNum ;
   private byte[] T000Q3_A490ForPrdUMe ;
   private int[] T000Q2_A486ForNumCol ;
   private short[] T000Q2_A309ColLin ;
   private java.math.BigDecimal[] T000Q2_A481ForCan ;
   private java.math.BigDecimal[] T000Q2_A838TotLinCol ;
   private String[] T000Q2_A6193ForClaCol ;
   private String[] T000Q2_A13926ColFibra ;
   private boolean[] T000Q2_n13926ColFibra ;
   private String[] T000Q2_A396EmprCod ;
   private String[] T000Q2_A719PrdNum ;
   private byte[] T000Q2_A490ForPrdUMe ;
   private String[] T000Q64_A6223PrdNumMax ;
   private boolean[] T000Q64_n6223PrdNumMax ;
   private String[] T000Q65_A718PrdNom ;
   private byte[] T000Q65_A4338PrdUMeFo ;
   private java.math.BigDecimal[] T000Q65_A724PrdPreAct ;
   private byte[] T000Q65_A7260PrdHorMad ;
   private long[] T000Q65_A13232PrdRGB ;
   private java.math.BigDecimal[] T000Q65_A707PrdFacCon ;
   private byte[] T000Q65_A856ValCod ;
   private String[] T000Q66_A488ForPrdDsc ;
   private boolean[] T000Q66_n488ForPrdDsc ;
   private String[] T000Q67_A396EmprCod ;
   private int[] T000Q67_A486ForNumCol ;
   private short[] T000Q67_A309ColLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV79Lb_TaAuxC_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV76Lb_fam1_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV83Lb_fam2_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV85Lb_fam3_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV81PrdNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item13 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item14[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV63TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV66TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV62WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class tdformu__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdformu__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdformu__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdformu__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdformu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000Q2", "SELECT ForNumCol, ColLin, ForCan, TotLinCol, ForClaCol, ColFibra, EmprCod, PrdNum, ForPrdUMe FROM TXPLDFORM WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ?  FOR UPDATE OF ForCan, TotLinCol, ForClaCol, ColFibra, PrdNum, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q3", "SELECT ForNumCol, ColLin, ForCan, TotLinCol, ForClaCol, ColFibra, EmprCod, PrdNum, ForPrdUMe FROM TXPLDFORM WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q9", "SELECT COALESCE( T1.PrdNumMax, '') AS PrdNumMax FROM (SELECT CASE  WHEN Not (? = 0) THEN COALESCE( T3.GXC1, '      ') ELSE COALESCE( T2.GXC2, '      ') END AS PrdNumMax FROM (SELECT T4.PrdNum AS GXC2, T4.ColLin, T5.GXC5 AS GXC5, T4.EmprCod, T4.ForNumCol FROM TXPLDFORM T4 FULL OUTER JOIN  (SELECT MAX(ColLin) AS GXC5 FROM TXPLDFORM WHERE (EmprCod = ?) AND (ForNumCol = ?) ) T5 ON 1=1 WHERE (T4.ColLin = T5.GXC5) AND (T4.EmprCod = ?) AND (T4.ForNumCol = ?) ) T2 FULL OUTER JOIN  (SELECT T4.PrdNum AS GXC1, T4.ColLin, T5.GXC4 AS GXC4, T4.EmprCod, T4.ForNumCol FROM TXPLDFORM T4 FULL OUTER JOIN  (SELECT MAX(ColLin) AS GXC4 FROM TXPLDFORM WHERE (ColLin < ?) AND (EmprCod = ?) AND (ForNumCol = ?) ) T5 ON 1=1 WHERE (T4.ColLin = T5.GXC4) AND (T4.ColLin < ?) AND (T4.EmprCod = ?) AND (T4.ForNumCol = ?) ) T3 ON 1=1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q10", "SELECT PrdNom, PrdUMeFo, PrdPreAct, PrdHorMad, PrdRGB, PrdFacCon, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q11", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q13", "SELECT COALESCE( T1.ForCanSum, 0) AS ForCanSum, COALESCE( T1.ColLinMax, 0) AS ColLinMax FROM (SELECT SUM(ForCan) AS ForCanSum, EmprCod, ForNumCol, MAX(ColLin) AS ColLinMax FROM TXPLDFORM GROUP BY EmprCod, ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q14", "SELECT ForNumCol, Lb_fam1, Lb_fam2, Lb_fam3, ColUltLin, ContNum, CosKgm, EmprCod, Lb_TaAuxC FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ?  FOR UPDATE OF Lb_fam1, Lb_fam2, Lb_fam3, ColUltLin, ContNum, CosKgm, Lb_TaAuxC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q15", "SELECT ForNumCol, Lb_fam1, Lb_fam2, Lb_fam3, ColUltLin, ContNum, CosKgm, EmprCod, Lb_TaAuxC FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q16", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q17", "SELECT Lb_TaAuxD FROM TXPENS005 WHERE EmprCod = ? AND Lb_TaAuxC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q19", "SELECT COALESCE( T1.PrdHorMax, 0) AS PrdHorMax FROM (SELECT MAX(PrdHorMad) AS PrdHorMax, EmprCod FROM TXPPRODUC WHERE PrdHorMad > 0 GROUP BY EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q21", "SELECT COALESCE( T1.CosKgmF, 0) AS CosKgmF FROM (SELECT SUM(( CAST(T4.ContNum * CAST(T2.ForCan AS NUMERIC(21,10)) / 1000 AS NUMERIC(25,10))) * CAST(T3.PrdPreAct * CAST(T3.PrdFacCon AS NUMERIC(24,10)) AS NUMERIC(27,10))) AS CosKgmF, T2.EmprCod, T2.ForNumCol FROM ((TXPLDFORM T2 INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T2.EmprCod AND T3.PrdNum = T2.PrdNum) INNER JOIN TXPCDFORM T4 ON T4.EmprCod = T2.EmprCod AND T4.ForNumCol = T2.ForNumCol) GROUP BY T2.EmprCod, T2.ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q25", "SELECT /*+ FIRST_ROWS(100) */ TM1.ForNumCol, TM1.Lb_fam1, TM1.Lb_fam2, TM1.Lb_fam3, TM1.ColUltLin, TM1.ContNum, TM1.CosKgm, T2.EmprNom, T2.EmpNumDec, T6.Lb_TaAuxD, TM1.EmprCod, TM1.Lb_TaAuxC, COALESCE( T4.CosKgmF, 0) AS CosKgmF, COALESCE( T5.ForCanSum, 0) AS ForCanSum, COALESCE( T3.PrdHorMax, 0) AS PrdHorMax, COALESCE( T5.ColLinMax, 0) AS ColLinMax FROM (((((TXPCDFORM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT MAX(PrdHorMad) AS PrdHorMax, EmprCod FROM TXPPRODUC WHERE PrdHorMad > 0 GROUP BY EmprCod ) T3 ON T3.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(( CAST(TM1.ContNum * CAST(T7.ForCan AS NUMERIC(21,10)) / 1000 AS NUMERIC(25,10))) * CAST(T8.PrdPreAct * CAST(T8.PrdFacCon AS NUMERIC(24,10)) AS NUMERIC(27,10))) AS CosKgmF, T7.EmprCod, T7.ForNumCol FROM ((TXPLDFORM T7 INNER JOIN TXPPRODUC T8 ON T8.EmprCod = T7.EmprCod AND T8.PrdNum = T7.PrdNum) INNER JOIN TXPCDFORM TM1 ON TM1.EmprCod = T7.EmprCod AND TM1.ForNumCol = T7.ForNumCol) GROUP BY T7.EmprCod, T7.ForNumCol ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.ForNumCol = TM1.ForNumCol) LEFT JOIN (SELECT SUM(ForCan) AS ForCanSum, EmprCod, ForNumCol, MAX(ColLin) AS ColLinMax FROM TXPLDFORM GROUP BY EmprCod, ForNumCol ) T5 ON T5.EmprCod = TM1.EmprCod AND T5.ForNumCol = TM1.ForNumCol) LEFT JOIN TXPENS005 T6 ON T6.EmprCod = TM1.EmprCod AND T6.Lb_TaAuxC = TM1.Lb_TaAuxC) WHERE TM1.EmprCod = ? and TM1.ForNumCol = ? ORDER BY TM1.EmprCod, TM1.ForNumCol ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q26", "SELECT Lb_TaAuxD FROM TXPENS005 WHERE EmprCod = ? AND Lb_TaAuxC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q28", "SELECT COALESCE( T1.CosKgmF, 0) AS CosKgmF FROM (SELECT SUM(( CAST(T4.ContNum * CAST(T2.ForCan AS NUMERIC(21,10)) / 1000 AS NUMERIC(25,10))) * CAST(T3.PrdPreAct * CAST(T3.PrdFacCon AS NUMERIC(24,10)) AS NUMERIC(27,10))) AS CosKgmF, T2.EmprCod, T2.ForNumCol FROM ((TXPLDFORM T2 INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T2.EmprCod AND T3.PrdNum = T2.PrdNum) INNER JOIN TXPCDFORM T4 ON T4.EmprCod = T2.EmprCod AND T4.ForNumCol = T2.ForNumCol) GROUP BY T2.EmprCod, T2.ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q30", "SELECT COALESCE( T1.ForCanSum, 0) AS ForCanSum, COALESCE( T1.ColLinMax, 0) AS ColLinMax FROM (SELECT SUM(ForCan) AS ForCanSum, EmprCod, ForNumCol, MAX(ColLin) AS ColLinMax FROM TXPLDFORM GROUP BY EmprCod, ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q31", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ForNumCol FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q32", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ForNumCol FROM TXPCDFORM WHERE ( ForNumCol > ?) and EmprCod = ? ORDER BY EmprCod, ForNumCol) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000Q33", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ForNumCol FROM TXPCDFORM WHERE ( ForNumCol < ?) and EmprCod = ? ORDER BY EmprCod DESC, ForNumCol DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000Q34", "INSERT INTO TXPCDFORM(ForNumCol, Lb_fam1, Lb_fam2, Lb_fam3, ColUltLin, ContNum, CosKgm, EmprCod, Lb_TaAuxC, PrdUltLin) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPCDFORM")
         ,new UpdateCursor("T000Q35", "UPDATE TXPCDFORM SET Lb_fam1=?, Lb_fam2=?, Lb_fam3=?, ColUltLin=?, ContNum=?, CosKgm=?, Lb_TaAuxC=?  WHERE EmprCod = ? AND ForNumCol = ?", GX_NOMASK, "TXPCDFORM")
         ,new UpdateCursor("T000Q36", "DELETE FROM TXPCDFORM  WHERE EmprCod = ? AND ForNumCol = ?", GX_NOMASK, "TXPCDFORM")
         ,new ForEachCursor("T000Q37", "SELECT Lb_TaAuxD FROM TXPENS005 WHERE EmprCod = ? AND Lb_TaAuxC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q39", "SELECT COALESCE( T1.CosKgmF, 0) AS CosKgmF FROM (SELECT SUM(( CAST(T4.ContNum * CAST(T2.ForCan AS NUMERIC(21,10)) / 1000 AS NUMERIC(25,10))) * CAST(T3.PrdPreAct * CAST(T3.PrdFacCon AS NUMERIC(24,10)) AS NUMERIC(27,10))) AS CosKgmF, T2.EmprCod, T2.ForNumCol FROM ((TXPLDFORM T2 INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T2.EmprCod AND T3.PrdNum = T2.PrdNum) INNER JOIN TXPCDFORM T4 ON T4.EmprCod = T2.EmprCod AND T4.ForNumCol = T2.ForNumCol) GROUP BY T2.EmprCod, T2.ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q41", "SELECT COALESCE( T1.ForCanSum, 0) AS ForCanSum, COALESCE( T1.ColLinMax, 0) AS ColLinMax FROM (SELECT SUM(ForCan) AS ForCanSum, EmprCod, ForNumCol, MAX(ColLin) AS ColLinMax FROM TXPLDFORM GROUP BY EmprCod, ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q42", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? AND ForNumCol = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000Q43", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND ForNumCol = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000Q44", "UPDATE TXPCDFORM SET ColUltLin=?  WHERE EmprCod = ? AND ForNumCol = ?", GX_NOMASK, "TXPCDFORM")
         ,new ForEachCursor("T000Q45", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ForNumCol FROM TXPCDFORM WHERE EmprCod = ? ORDER BY EmprCod, ForNumCol ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q46", "SELECT T1.ForNumCol, T1.ColLin, T2.PrdNom, T2.PrdUMeFo, T2.PrdPreAct, T3.ForPrdDsc, T1.ForCan, T1.TotLinCol, T1.ForClaCol, T2.PrdHorMad, T2.PrdRGB, T1.ColFibra, T2.PrdFacCon, T1.EmprCod, T1.PrdNum, T1.ForPrdUMe, T2.ValCod FROM ((TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ForNumCol = ? and T1.ColLin = ? ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",true, GX_NOMASK, false, this,3, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q47", "SELECT PrdNom, PrdUMeFo, PrdPreAct, PrdHorMad, PrdRGB, PrdFacCon, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q48", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q54", "SELECT COALESCE( T1.PrdNumMax, '') AS PrdNumMax FROM (SELECT CASE  WHEN Not (? = 0) THEN COALESCE( T3.GXC1, '      ') ELSE COALESCE( T2.GXC2, '      ') END AS PrdNumMax FROM (SELECT T4.PrdNum AS GXC2, T4.ColLin, T5.GXC5 AS GXC5, T4.EmprCod, T4.ForNumCol FROM TXPLDFORM T4 FULL OUTER JOIN  (SELECT MAX(ColLin) AS GXC5 FROM TXPLDFORM WHERE (EmprCod = ?) AND (ForNumCol = ?) ) T5 ON 1=1 WHERE (T4.ColLin = T5.GXC5) AND (T4.EmprCod = ?) AND (T4.ForNumCol = ?) ) T2 FULL OUTER JOIN  (SELECT T4.PrdNum AS GXC1, T4.ColLin, T5.GXC4 AS GXC4, T4.EmprCod, T4.ForNumCol FROM TXPLDFORM T4 FULL OUTER JOIN  (SELECT MAX(ColLin) AS GXC4 FROM TXPLDFORM WHERE (ColLin < ?) AND (EmprCod = ?) AND (ForNumCol = ?) ) T5 ON 1=1 WHERE (T4.ColLin = T5.GXC4) AND (T4.ColLin < ?) AND (T4.EmprCod = ?) AND (T4.ForNumCol = ?) ) T3 ON 1=1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q55", "SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000Q56", "INSERT INTO TXPLDFORM(ForNumCol, ColLin, ForCan, TotLinCol, ForClaCol, ColFibra, EmprCod, PrdNum, ForPrdUMe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLDFORM")
         ,new UpdateCursor("T000Q57", "UPDATE TXPLDFORM SET ForCan=?, TotLinCol=?, ForClaCol=?, ColFibra=?, PrdNum=?, ForPrdUMe=?  WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ?", GX_NOMASK, "TXPLDFORM")
         ,new UpdateCursor("T000Q58", "DELETE FROM TXPLDFORM  WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ?", GX_NOMASK, "TXPLDFORM")
         ,new ForEachCursor("T000Q64", "SELECT COALESCE( T1.PrdNumMax, '') AS PrdNumMax FROM (SELECT CASE  WHEN Not (? = 0) THEN COALESCE( T3.GXC1, '      ') ELSE COALESCE( T2.GXC2, '      ') END AS PrdNumMax FROM (SELECT T4.PrdNum AS GXC2, T4.ColLin, T5.GXC5 AS GXC5, T4.EmprCod, T4.ForNumCol FROM TXPLDFORM T4 FULL OUTER JOIN  (SELECT MAX(ColLin) AS GXC5 FROM TXPLDFORM WHERE (EmprCod = ?) AND (ForNumCol = ?) ) T5 ON 1=1 WHERE (T4.ColLin = T5.GXC5) AND (T4.EmprCod = ?) AND (T4.ForNumCol = ?) ) T2 FULL OUTER JOIN  (SELECT T4.PrdNum AS GXC1, T4.ColLin, T5.GXC4 AS GXC4, T4.EmprCod, T4.ForNumCol FROM TXPLDFORM T4 FULL OUTER JOIN  (SELECT MAX(ColLin) AS GXC4 FROM TXPLDFORM WHERE (ColLin < ?) AND (EmprCod = ?) AND (ForNumCol = ?) ) T5 ON 1=1 WHERE (T4.ColLin = T5.GXC4) AND (T4.ColLin < ?) AND (T4.EmprCod = ?) AND (T4.ForNumCol = ?) ) T3 ON 1=1 ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q65", "SELECT PrdNom, PrdUMeFo, PrdPreAct, PrdHorMad, PrdRGB, PrdFacCon, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q66", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000Q67", "SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, ColLin ",true, GX_NOMASK, false, this,3, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               return;
            case 10 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 60);
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
               ((String[]) buf[13])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(14,5);
               ((byte[]) buf[18])[0] = rslt.getByte(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(16);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               return;
            case 14 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               return;
            case 23 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 29 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((long[]) buf[11])[0] = rslt.getLong(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 4);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,4);
               ((String[]) buf[15])[0] = rslt.getString(14, 3);
               ((String[]) buf[16])[0] = rslt.getString(15, 6);
               ((byte[]) buf[17])[0] = rslt.getByte(16);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
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
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 3);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[9], 4);
               }
               return;
            case 20 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 4);
               }
               stmt.setString(8, (String)parms[8], 3);
               stmt.setInt(9, ((Number) parms[9]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 32 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 34 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 16);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 4);
               }
               stmt.setString(7, (String)parms[7], 3);
               stmt.setString(8, (String)parms[8], 6);
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               return;
            case 35 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 16);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 4);
               }
               stmt.setString(5, (String)parms[5], 6);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 3);
               stmt.setInt(8, ((Number) parms[8]).intValue());
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 37 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

