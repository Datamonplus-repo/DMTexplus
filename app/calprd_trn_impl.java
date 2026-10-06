package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class calprd_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action49") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV26ContCod = httpContext.GetPar( "ContCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26ContCod", AV26ContCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ContCod, "@!"))));
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_49_1Q73( A396EmprCod, AV26ContCod, A30AlbProCod, Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action50") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A39AlbProPri = httpContext.GetPar( "AlbProPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         AV28Fch = localUtil.parseDateParm( httpContext.GetPar( "Fch")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Fch", localUtil.format(AV28Fch, "99/99/99"));
         AV29AlbLast = GXutil.lval( httpContext.GetPar( "AlbLast")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29AlbLast), 10, 0));
         A34AlbProfch = localUtil.parseDateParm( httpContext.GetPar( "AlbProfch")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         AV27Msg_f = httpContext.GetPar( "Msg_f") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Msg_f", AV27Msg_f);
         AV31Ctrlf = (short)(GXutil.lval( httpContext.GetPar( "Ctrlf"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Ctrlf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Ctrlf), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_50_1Q73( A396EmprCod, A39AlbProPri, AV28Fch, AV29AlbLast, A34AlbProfch, AV27Msg_f, AV31Ctrlf) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"GUIREMCLI") == 0 )
      {
         A1253EmprGuiRem = httpContext.GetPar( "EmprGuiRem") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A13735CliCNom = httpContext.GetPar( "CliCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaguiremcli1Q70( A1253EmprGuiRem, A13735CliCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"ALBCLIDES") == 0 )
      {
         A13735CliCNom = httpContext.GetPar( "CliCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaalbclides1Q70( A13735CliCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TRNCOD") == 0 )
      {
         A13738TrnCNom = httpContext.GetPar( "TrnCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatrncod1Q70( A13738TrnCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"GUIREMCLI") == 0 )
      {
         A1253EmprGuiRem = httpContext.GetPar( "EmprGuiRem") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A13735CliCNom = httpContext.GetPar( "CliCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaguiremcli1Q70( A1253EmprGuiRem, A13735CliCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"GUIREMCLI") == 0 )
      {
         A1253EmprGuiRem = httpContext.GetPar( "EmprGuiRem") ;
         h1243GuiRemCli = httpContext.GetPar( "h1243GuiRemCli") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaguiremcli1Q73( A1253EmprGuiRem, h1243GuiRemCli) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"ALBCLIDES") == 0 )
      {
         A13735CliCNom = httpContext.GetPar( "CliCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaalbclides1Q70( A13735CliCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"ALBCLIDES") == 0 )
      {
         h3869AlbCliDes = httpContext.GetPar( "h3869AlbCliDes") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaalbclides1Q73( h3869AlbCliDes) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TRNCOD") == 0 )
      {
         A13738TrnCNom = httpContext.GetPar( "TrnCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatrncod1Q70( A13738TrnCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TRNCOD") == 0 )
      {
         h840TrnCod = httpContext.GetPar( "h840TrnCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcatrncod1Q73( h840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel24"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa108351Q73( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel25"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel26"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa108371Q73( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel27"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel28"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa108361Q73( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel29"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel30"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa22421Q73( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel31"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel32"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_57") == 0 )
      {
         A1253EmprGuiRem = httpContext.GetPar( "EmprGuiRem") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A1243GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_57( A1253EmprGuiRem, A1243GuiRemCli) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_62") == 0 )
      {
         A1253EmprGuiRem = httpContext.GetPar( "EmprGuiRem") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A1243GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         A1259AlbDomEnv = (byte)(GXutil.lval( httpContext.GetPar( "AlbDomEnv"))) ;
         n1259AlbDomEnv = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_62( A1253EmprGuiRem, A1243GuiRemCli, A1259AlbDomEnv) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_60") == 0 )
      {
         A1253EmprGuiRem = httpContext.GetPar( "EmprGuiRem") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_60( A1253EmprGuiRem, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_59") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_59( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_61") == 0 )
      {
         A3108AlbDivCod = (byte)(GXutil.lval( httpContext.GetPar( "AlbDivCod"))) ;
         n3108AlbDivCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_61( A3108AlbDivCod) ;
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
            AV10EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
            AV11AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11AlbProCod), 10, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11AlbProCod), "ZZZZZZZZZ9")));
            AV20AlbProPri = httpContext.GetPar( "AlbProPri") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20AlbProPri", AV20AlbProPri);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20AlbProPri, "9"))));
            AV21AlbSec = httpContext.GetPar( "AlbSec") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21AlbSec", AV21AlbSec);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21AlbSec, "@!"))));
            AV26ContCod = httpContext.GetPar( "ContCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26ContCod", AV26ContCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ContCod, "@!"))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Albaran de Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public calprd_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public calprd_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( calprd_trn_impl.class ));
   }

   public calprd_trn_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbProPri = new HTMLChoice();
      cmbAlbProEst = new HTMLChoice();
      cmbAlbSec = new HTMLChoice();
      cmbAlbEnvFtp = new HTMLChoice();
      cmbAlbProAT = new HTMLChoice();
      cmbAlbDivTCod = new HTMLChoice();
      cmbGuiRemDivT = new HTMLChoice();
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
      if ( cmbAlbProPri.getItemCount() > 0 )
      {
         A39AlbProPri = cmbAlbProPri.getValidValue(A39AlbProPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProPri.setValue( GXutil.rtrim( A39AlbProPri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProPri.getInternalname(), "Values", cmbAlbProPri.ToJavascriptSource(), true);
      }
      if ( cmbAlbProEst.getItemCount() > 0 )
      {
         A33AlbProEst = (byte)(GXutil.lval( cmbAlbProEst.getValidValue(GXutil.trim( GXutil.str( A33AlbProEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProEst.setValue( GXutil.trim( GXutil.str( A33AlbProEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEst.getInternalname(), "Values", cmbAlbProEst.ToJavascriptSource(), true);
      }
      if ( cmbAlbSec.getItemCount() > 0 )
      {
         A2242AlbSec = cmbAlbSec.getValidValue(A2242AlbSec) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbSec.setValue( GXutil.rtrim( A2242AlbSec) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbSec.getInternalname(), "Values", cmbAlbSec.ToJavascriptSource(), true);
      }
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
      }
      if ( cmbAlbProAT.getItemCount() > 0 )
      {
         A10765AlbProAT = cmbAlbProAT.getValidValue(A10765AlbProAT) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProAT.setValue( GXutil.rtrim( A10765AlbProAT) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Values", cmbAlbProAT.ToJavascriptSource(), true);
      }
      if ( cmbAlbDivTCod.getItemCount() > 0 )
      {
         A3093AlbDivTCod = cmbAlbDivTCod.getValidValue(A3093AlbDivTCod) ;
         n3093AlbDivTCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbDivTCod.setValue( GXutil.rtrim( A3093AlbDivTCod) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbDivTCod.getInternalname(), "Values", cmbAlbDivTCod.ToJavascriptSource(), true);
      }
      if ( cmbGuiRemDivT.getItemCount() > 0 )
      {
         A3145GuiRemDivT = cmbGuiRemDivT.getValidValue(A3145GuiRemDivT) ;
         n3145GuiRemDivT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", A3145GuiRemDivT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbGuiRemDivT.setValue( GXutil.rtrim( A3145GuiRemDivT) );
         httpContext.ajax_rsp_assign_prop("", false, cmbGuiRemDivT.getInternalname(), "Values", cmbGuiRemDivT.ToJavascriptSource(), true);
      }
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCod_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProCod_Enabled, 1, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbProPri.getInternalname()+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbProPri, cmbAlbProPri.getInternalname(), GXutil.rtrim( A39AlbProPri), 1, cmbAlbProPri.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbProPri.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Calprd_TRN.htm");
      cmbAlbProPri.setValue( GXutil.rtrim( A39AlbProPri) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProPri.getInternalname(), "Values", cmbAlbProPri.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbProEst.getInternalname()+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbProEst, cmbAlbProEst.getInternalname(), GXutil.trim( GXutil.str( A33AlbProEst, 1, 0)), 1, cmbAlbProEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbProEst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Calprd_TRN.htm");
      cmbAlbProEst.setValue( GXutil.trim( GXutil.str( A33AlbProEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEst.getInternalname(), "Values", cmbAlbProEst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbsec_cell_Internalname, 1, 0, "px", 0, "px", divAlbsec_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", cmbAlbSec.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbSec.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbSec.getInternalname(), httpContext.getMessage( "Malha Acab?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbSec, cmbAlbSec.getInternalname(), GXutil.rtrim( A2242AlbSec), 1, cmbAlbSec.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbAlbSec.getVisible(), cmbAlbSec.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "", true, (byte)(0), "HLP_Calprd_TRN.htm");
      cmbAlbSec.setValue( GXutil.rtrim( A2242AlbSec) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbSec.getInternalname(), "Values", cmbAlbSec.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProfch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProfch_Internalname, httpContext.getMessage( "Data", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbProfch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProfch_Internalname, localUtil.format(A34AlbProfch, "99/99/99"), localUtil.format( A34AlbProfch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProfch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProfch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbProfch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbProfch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Calprd_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbFecSal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbFecSal_Internalname, httpContext.getMessage( "Data Saida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbFecSal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbFecSal_Internalname, localUtil.format(A4023AlbFecSal, "99/99/99"), localUtil.format( A4023AlbFecSal, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbFecSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbFecSal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbFecSal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbFecSal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Calprd_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHorSal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHorSal_Internalname, httpContext.getMessage( "Hora Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHorSal_Internalname, GXutil.rtrim( A3865AlbHorSal), GXutil.rtrim( localUtil.format( A3865AlbHorSal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHorSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbHorSal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbUsu_Internalname, httpContext.getMessage( "Operador", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbUsu_Internalname, GXutil.rtrim( A7098AlbUsu), GXutil.rtrim( localUtil.format( A7098AlbUsu, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbUsu_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbUsu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGuiRemCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiRemCli_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCli_Internalname, h1243GuiRemCli, GXutil.rtrim( localUtil.format( h1243GuiRemCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiRemCli_Enabled, 1, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbCliDes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbCliDes_Internalname, httpContext.getMessage( "Cliente Destino", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCliDes_Internalname, h3869AlbCliDes, GXutil.rtrim( localUtil.format( h3869AlbCliDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCliDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbCliDes_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbDomEnv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbDomEnv_Internalname, httpContext.getMessage( "Envio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDomEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A1259AlbDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDomEnv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1259AlbDomEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(A1259AlbDomEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDomEnv_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbDomEnv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, h840TrnCod, GXutil.rtrim( localUtil.format( h840TrnCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnCod_Enabled, 1, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbMat_Internalname, httpContext.getMessage( "Matricula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMat_Internalname, GXutil.rtrim( A3868AlbMat), GXutil.rtrim( localUtil.format( A3868AlbMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup8_Internalname, httpContext.getMessage( "AT", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_Calprd_TRN.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbEnvFtp.getInternalname()+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbEnvFtp, cmbAlbEnvFtp.getInternalname(), GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)), 1, cmbAlbEnvFtp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbEnvFtp.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Calprd_TRN.htm");
      cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbLic_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbLic_Internalname, httpContext.getMessage( "Codigo", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbLic_Internalname, GXutil.rtrim( A7101AlbLic), GXutil.rtrim( localUtil.format( A7101AlbLic, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbLic_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbLic_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbProAT.getInternalname()+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbProAT, cmbAlbProAT.getInternalname(), GXutil.rtrim( A10765AlbProAT), 1, cmbAlbProAT.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbProAT.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Calprd_TRN.htm");
      cmbAlbProAT.setValue( GXutil.rtrim( A10765AlbProAT) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Values", cmbAlbProAT.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHhfm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHhfm_Internalname, httpContext.getMessage( "StartTime", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbHhfm_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHhfm_Internalname, localUtil.ttoc( A10019AlbHhfm, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10019AlbHhfm, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHhfm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbHhfm_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbHhfm_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbHhfm_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Calprd_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbGrossT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbGrossT_Internalname, httpContext.getMessage( "Gross Total", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbGrossT_Internalname, GXutil.ltrim( localUtil.ntoc( A10020AlbGrossT, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbGrossT_Enabled!=0) ? localUtil.format( A10020AlbGrossT, "ZZZZZZZZZ9.99") : localUtil.format( A10020AlbGrossT, "ZZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbGrossT_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbGrossT_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbFmd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbFmd_Internalname, httpContext.getMessage( "Hash", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtAlbFmd_Internalname, A10017AlbFmd, "", "", (short)(0), 1, edtAlbFmd_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</fieldset>") ;
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, divUnnamedtable6_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbtrnnm_cell_Internalname, 1, 0, "px", 0, "px", divAlbtrnnm_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtAlbTrnNm_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTrnNm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbTrnNm_Internalname, httpContext.getMessage( "Nome Transportista", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTrnNm_Internalname, GXutil.rtrim( A10835AlbTrnNm), GXutil.rtrim( localUtil.format( A10835AlbTrnNm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,132);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTrnNm_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbTrnNm_Visible, edtAlbTrnNm_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbtrnnc_cell_Internalname, 1, 0, "px", 0, "px", divAlbtrnnc_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtAlbTrnNc_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTrnNc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbTrnNc_Internalname, httpContext.getMessage( "N contribuiente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTrnNc_Internalname, GXutil.rtrim( A10837AlbTrnNc), GXutil.rtrim( localUtil.format( A10837AlbTrnNc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTrnNc_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbTrnNc_Visible, edtAlbTrnNc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbtrndm_cell_Internalname, 1, 0, "px", 0, "px", divAlbtrndm_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtAlbTrnDm_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTrnDm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbTrnDm_Internalname, httpContext.getMessage( "Morada Transportista", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTrnDm_Internalname, GXutil.rtrim( A10836AlbTrnDm), GXutil.rtrim( localUtil.format( A10836AlbTrnDm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,140);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTrnDm_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbTrnDm_Visible, edtAlbTrnDm_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtALbFmdc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtALbFmdc_Internalname, httpContext.getMessage( "Firma Digital Control", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtALbFmdc_Internalname, GXutil.rtrim( A10018ALbFmdc), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,145);\"", (short)(0), 1, edtALbFmdc_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbLocDes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbLocDes_Internalname, httpContext.getMessage( "Local Descarga", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbLocDes_Internalname, GXutil.ltrim( localUtil.ntoc( A3867AlbLocDes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbLocDes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3867AlbLocDes), "9") : localUtil.format( DecimalUtil.doubleToDec(A3867AlbLocDes), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,150);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbLocDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbLocDes_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbLocCar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbLocCar_Internalname, httpContext.getMessage( "Local de Carga", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbLocCar_Internalname, GXutil.ltrim( localUtil.ntoc( A3866AlbLocCar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbLocCar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3866AlbLocCar), "9") : localUtil.format( DecimalUtil.doubleToDec(A3866AlbLocCar), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,155);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbLocCar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbLocCar_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbPObsCon_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbPObsCon_Internalname, httpContext.getMessage( "Contador Lineas Observ.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPObsCon_Internalname, GXutil.ltrim( localUtil.ntoc( A914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPObsCon_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A914AlbPObsCon), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A914AlbPObsCon), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,160);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPObsCon_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbPObsCon_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbIvaCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbIvaCod_Internalname, httpContext.getMessage( "Codigo IVA", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbIvaCod_Internalname, GXutil.rtrim( A5141AlbIvaCod), GXutil.rtrim( localUtil.format( A5141AlbIvaCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,165);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbIvaCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbIvaCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbColCa_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbColCa_Internalname, httpContext.getMessage( "Color Camion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 170,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbColCa_Internalname, GXutil.rtrim( A7987AlbColCa), GXutil.rtrim( localUtil.format( A7987AlbColCa, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,170);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbColCa_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbColCa_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbDesp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbDesp_Internalname, httpContext.getMessage( "Despachador", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 175,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDesp_Internalname, GXutil.ltrim( localUtil.ntoc( A7162AlbDesp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDesp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7162AlbDesp), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7162AlbDesp), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,175);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDesp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbDesp_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbCambio_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbCambio_Internalname, httpContext.getMessage( "TipoCambio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 180,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCambio_Internalname, GXutil.ltrim( localUtil.ntoc( A7986AlbCambio, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbCambio_Enabled!=0) ? localUtil.format( A7986AlbCambio, "Z9.9999") : localUtil.format( A7986AlbCambio, "Z9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,180);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCambio_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbCambio_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTipDoc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbTipDoc_Internalname, httpContext.getMessage( "Tipo Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTipDoc_Internalname, GXutil.ltrim( localUtil.ntoc( A7985AlbTipDoc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbTipDoc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7985AlbTipDoc), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7985AlbTipDoc), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,185);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTipDoc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbTipDoc_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbMotTr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbMotTr_Internalname, httpContext.getMessage( "Motivo Traslado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 190,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMotTr_Internalname, GXutil.rtrim( A7984AlbMotTr), GXutil.rtrim( localUtil.format( A7984AlbMotTr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,190);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMotTr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbMotTr_Enabled, 0, "text", "", 25, "chr", 1, "row", 25, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTipCal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbTipCal_Internalname, httpContext.getMessage( "Tipo Calidad (Comunicaciones)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 195,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTipCal_Internalname, GXutil.ltrim( localUtil.ntoc( A5803AlbTipCal, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbTipCal_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5803AlbTipCal), "9") : localUtil.format( DecimalUtil.doubleToDec(A5803AlbTipCal), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,195);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTipCal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbTipCal_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbObsCb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbObsCb_Internalname, httpContext.getMessage( "Observaciones Cabecera", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbObsCb_Internalname, GXutil.rtrim( A7988AlbObsCb), GXutil.rtrim( localUtil.format( A7988AlbObsCb, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,200);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbObsCb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbObsCb_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbNumT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbNumT_Internalname, httpContext.getMessage( "Numero de Transporte(Texfina)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 205,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumT_Internalname, GXutil.ltrim( localUtil.ntoc( A7102AlbNumT, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbNumT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7102AlbNumT), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7102AlbNumT), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,205);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumT_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbNumT_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbMarCo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbMarCo_Internalname, httpContext.getMessage( "Marca Camion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 210,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMarCo_Internalname, GXutil.rtrim( A7100AlbMarCo), GXutil.rtrim( localUtil.format( A7100AlbMarCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,210);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMarCo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbMarCo_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbOComp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbOComp_Internalname, httpContext.getMessage( "Orden Compra Texfina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 215,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbOComp_Internalname, GXutil.rtrim( A7099AlbOComp), GXutil.rtrim( localUtil.format( A7099AlbOComp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,215);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbOComp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbOComp_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnNif_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnNif_Internalname, httpContext.getMessage( "Nif", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNif_Internalname, GXutil.rtrim( A3643TrnNif), GXutil.rtrim( localUtil.format( A3643TrnNif, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNif_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnNif_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbDivTCod.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbDivTCod.getInternalname(), httpContext.getMessage( "Divisa Traspaso Contable", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 225,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbDivTCod, cmbAlbDivTCod.getInternalname(), GXutil.rtrim( A3093AlbDivTCod), 1, cmbAlbDivTCod.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbDivTCod.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,225);\"", "", true, (byte)(0), "HLP_Calprd_TRN.htm");
      cmbAlbDivTCod.setValue( GXutil.rtrim( A3093AlbDivTCod) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbDivTCod.getInternalname(), "Values", cmbAlbDivTCod.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbDivAbr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbDivAbr_Internalname, httpContext.getMessage( "Abreviatura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDivAbr_Internalname, GXutil.rtrim( A3109AlbDivAbr), GXutil.rtrim( localUtil.format( A3109AlbDivAbr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDivAbr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbDivAbr_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbDivCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbDivCod_Internalname, httpContext.getMessage( "Divisa Albaran", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 235,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDivCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3108AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3108AlbDivCod), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,235);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDivCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbDivCod_Enabled, 1, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBusDomEnv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBusDomEnv_Internalname, httpContext.getMessage( "Busca Domicilio de Envio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBusDomEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A1260BusDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBusDomEnv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1260BusDomEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(A1260BusDomEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBusDomEnv_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBusDomEnv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprGuiRem_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprGuiRem_Internalname, httpContext.getMessage( "EmprGuiRem", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 245,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprGuiRem_Internalname, GXutil.rtrim( A1253EmprGuiRem), GXutil.rtrim( localUtil.format( A1253EmprGuiRem, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,245);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprGuiRem_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprGuiRem_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGuiRemDom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiRemDom_Internalname, httpContext.getMessage( "Domicilio Envio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 250,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemDom_Internalname, GXutil.ltrim( localUtil.ntoc( A1258GuiRemDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiRemDom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1258GuiRemDom), "9") : localUtil.format( DecimalUtil.doubleToDec(A1258GuiRemDom), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,250);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemDom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiRemDom_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbGuiRemDivT.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbGuiRemDivT.getInternalname(), httpContext.getMessage( "Divisa Traspaso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbGuiRemDivT, cmbGuiRemDivT.getInternalname(), GXutil.rtrim( A3145GuiRemDivT), 1, cmbGuiRemDivT.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbGuiRemDivT.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Calprd_TRN.htm");
      cmbGuiRemDivT.setValue( GXutil.rtrim( A3145GuiRemDivT) );
      httpContext.ajax_rsp_assign_prop("", false, cmbGuiRemDivT.getInternalname(), "Values", cmbGuiRemDivT.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGuiRemDiv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiRemDiv_Internalname, httpContext.getMessage( "Divisa Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemDiv_Internalname, GXutil.ltrim( localUtil.ntoc( A3110GuiRemDiv, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiRemDiv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3110GuiRemDiv), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3110GuiRemDiv), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemDiv_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiRemDiv_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Código Empresa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 270,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,270);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 275,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 277,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 279,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Calprd_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 283,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMarca_Internalname, GXutil.rtrim( A5140AlbMarca), GXutil.rtrim( localUtil.format( A5140AlbMarca, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,283);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMarca_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbMarca_Visible, edtAlbMarca_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCln_Internalname, GXutil.rtrim( A1244GuiRemCln), GXutil.rtrim( localUtil.format( A1244GuiRemCln, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCln_Jsonclick, 0, "Attribute", "", "", "", "", edtGuiRemCln_Visible, edtGuiRemCln_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNom_Internalname, GXutil.rtrim( A841TrnNom), GXutil.rtrim( localUtil.format( A841TrnNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNom_Jsonclick, 0, "Attribute", "", "", "", "", edtTrnNom_Visible, edtTrnNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      e111Q72 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z39AlbProPri = httpContext.cgiGet( "Z39AlbProPri") ;
            Z33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z33AlbProEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z34AlbProfch = localUtil.ctod( httpContext.cgiGet( "Z34AlbProfch"), 0) ;
            Z4023AlbFecSal = localUtil.ctod( httpContext.cgiGet( "Z4023AlbFecSal"), 0) ;
            Z3865AlbHorSal = httpContext.cgiGet( "Z3865AlbHorSal") ;
            Z7098AlbUsu = httpContext.cgiGet( "Z7098AlbUsu") ;
            Z3869AlbCliDes = (int)(localUtil.ctol( httpContext.cgiGet( "Z3869AlbCliDes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1259AlbDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1259AlbDomEnv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3868AlbMat = httpContext.cgiGet( "Z3868AlbMat") ;
            Z2242AlbSec = httpContext.cgiGet( "Z2242AlbSec") ;
            Z5805AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5805AlbEnvFtp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7101AlbLic = httpContext.cgiGet( "Z7101AlbLic") ;
            Z10765AlbProAT = httpContext.cgiGet( "Z10765AlbProAT") ;
            Z10019AlbHhfm = localUtil.ctot( httpContext.cgiGet( "Z10019AlbHhfm"), 0) ;
            Z10020AlbGrossT = localUtil.ctond( httpContext.cgiGet( "Z10020AlbGrossT")) ;
            Z10837AlbTrnNc = httpContext.cgiGet( "Z10837AlbTrnNc") ;
            Z10017AlbFmd = httpContext.cgiGet( "Z10017AlbFmd") ;
            Z10835AlbTrnNm = httpContext.cgiGet( "Z10835AlbTrnNm") ;
            Z10018ALbFmdc = httpContext.cgiGet( "Z10018ALbFmdc") ;
            Z10836AlbTrnDm = httpContext.cgiGet( "Z10836AlbTrnDm") ;
            Z5140AlbMarca = httpContext.cgiGet( "Z5140AlbMarca") ;
            Z3867AlbLocDes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3867AlbLocDes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3866AlbLocCar = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3866AlbLocCar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z914AlbPObsCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5141AlbIvaCod = httpContext.cgiGet( "Z5141AlbIvaCod") ;
            Z7987AlbColCa = httpContext.cgiGet( "Z7987AlbColCa") ;
            Z7162AlbDesp = (int)(localUtil.ctol( httpContext.cgiGet( "Z7162AlbDesp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7986AlbCambio = localUtil.ctond( httpContext.cgiGet( "Z7986AlbCambio")) ;
            Z7985AlbTipDoc = (int)(localUtil.ctol( httpContext.cgiGet( "Z7985AlbTipDoc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7984AlbMotTr = httpContext.cgiGet( "Z7984AlbMotTr") ;
            Z5803AlbTipCal = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5803AlbTipCal"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7988AlbObsCb = httpContext.cgiGet( "Z7988AlbObsCb") ;
            Z7102AlbNumT = localUtil.ctol( httpContext.cgiGet( "Z7102AlbNumT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z7100AlbMarCo = httpContext.cgiGet( "Z7100AlbMarCo") ;
            Z7099AlbOComp = httpContext.cgiGet( "Z7099AlbOComp") ;
            Z3093AlbDivTCod = httpContext.cgiGet( "Z3093AlbDivTCod") ;
            Z1258GuiRemDom = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1258GuiRemDom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1253EmprGuiRem = httpContext.cgiGet( "Z1253EmprGuiRem") ;
            Z1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "Z1243GuiRemCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3108AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3108AlbDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "N1243GuiRemCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "N840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N3108AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "N3108AlbDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N1253EmprGuiRem = httpContext.cgiGet( "N1253EmprGuiRem") ;
            AV10EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV11AlbProCod = localUtil.ctol( httpContext.cgiGet( "vALBPROCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            AV15Insert_GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_GUIREMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCGUIREMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV16Insert_TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "GXHCTRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17Insert_AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_ALBDIVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV18Insert_EmprGuiRem = httpContext.cgiGet( "vINSERT_EMPRGUIREM") ;
            A3869AlbCliDes = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCALBCLIDES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV26ContCod = httpContext.cgiGet( "vCONTCOD") ;
            AV31Ctrlf = (short)(localUtil.ctol( httpContext.cgiGet( "vCTRLF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV27Msg_f = httpContext.cgiGet( "vMSG_F") ;
            AV29AlbLast = localUtil.ctol( httpContext.cgiGet( "vALBLAST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            AV28Fch = localUtil.ctod( httpContext.cgiGet( "vFCH"), 0) ;
            AV24FirmaD = (short)(localUtil.ctol( httpContext.cgiGet( "vFIRMAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV25avisar = (short)(localUtil.ctol( httpContext.cgiGet( "vAVISAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A30AlbProCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            }
            else
            {
               A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            }
            cmbAlbProPri.setValue( httpContext.cgiGet( cmbAlbProPri.getInternalname()) );
            A39AlbProPri = httpContext.cgiGet( cmbAlbProPri.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
            cmbAlbProEst.setValue( httpContext.cgiGet( cmbAlbProEst.getInternalname()) );
            A33AlbProEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProEst.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
            cmbAlbSec.setValue( httpContext.cgiGet( cmbAlbSec.getInternalname()) );
            A2242AlbSec = httpContext.cgiGet( cmbAlbSec.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
            if ( localUtil.vcdate( httpContext.cgiGet( edtAlbProfch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ALBPROFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProfch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A34AlbProfch = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
            }
            else
            {
               A34AlbProfch = localUtil.ctod( httpContext.cgiGet( edtAlbProfch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtAlbFecSal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ALBFECSAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbFecSal_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4023AlbFecSal = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
            }
            else
            {
               A4023AlbFecSal = localUtil.ctod( httpContext.cgiGet( edtAlbFecSal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
            }
            A3865AlbHorSal = httpContext.cgiGet( edtAlbHorSal_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
            A7098AlbUsu = httpContext.cgiGet( edtAlbUsu_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
            h1243GuiRemCli = httpContext.cgiGet( edtGuiRemCli_Internalname) ;
            h3869AlbCliDes = httpContext.cgiGet( edtAlbCliDes_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBDOMENV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbDomEnv_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1259AlbDomEnv = (byte)(0) ;
               n1259AlbDomEnv = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
            }
            else
            {
               A1259AlbDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n1259AlbDomEnv = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
            }
            h840TrnCod = httpContext.cgiGet( edtTrnCod_Internalname) ;
            A3868AlbMat = httpContext.cgiGet( edtAlbMat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3868AlbMat", A3868AlbMat);
            cmbAlbEnvFtp.setValue( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()) );
            A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
            A7101AlbLic = httpContext.cgiGet( edtAlbLic_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
            cmbAlbProAT.setValue( httpContext.cgiGet( cmbAlbProAT.getInternalname()) );
            A10765AlbProAT = httpContext.cgiGet( cmbAlbProAT.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
            A10019AlbHhfm = localUtil.ctot( httpContext.cgiGet( edtAlbHhfm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A10020AlbGrossT = localUtil.ctond( httpContext.cgiGet( edtAlbGrossT_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
            A10017AlbFmd = httpContext.cgiGet( edtAlbFmd_Internalname) ;
            n10017AlbFmd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10017AlbFmd", A10017AlbFmd);
            A10835AlbTrnNm = httpContext.cgiGet( edtAlbTrnNm_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10835AlbTrnNm", A10835AlbTrnNm);
            A10837AlbTrnNc = httpContext.cgiGet( edtAlbTrnNc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10837AlbTrnNc", A10837AlbTrnNc);
            A10836AlbTrnDm = httpContext.cgiGet( edtAlbTrnDm_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10836AlbTrnDm", A10836AlbTrnDm);
            A10018ALbFmdc = httpContext.cgiGet( edtALbFmdc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10018ALbFmdc", A10018ALbFmdc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbLocDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbLocDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBLOCDES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbLocDes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3867AlbLocDes = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3867AlbLocDes", GXutil.str( A3867AlbLocDes, 1, 0));
            }
            else
            {
               A3867AlbLocDes = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbLocDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3867AlbLocDes", GXutil.str( A3867AlbLocDes, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbLocCar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbLocCar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBLOCCAR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbLocCar_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3866AlbLocCar = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3866AlbLocCar", GXutil.str( A3866AlbLocCar, 1, 0));
            }
            else
            {
               A3866AlbLocCar = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbLocCar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3866AlbLocCar", GXutil.str( A3866AlbLocCar, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPObsCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPObsCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPOBSCON");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbPObsCon_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A914AlbPObsCon = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
            }
            else
            {
               A914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbPObsCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
            }
            A5141AlbIvaCod = GXutil.upper( httpContext.cgiGet( edtAlbIvaCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5141AlbIvaCod", A5141AlbIvaCod);
            A7987AlbColCa = httpContext.cgiGet( edtAlbColCa_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7987AlbColCa", A7987AlbColCa);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDesp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDesp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBDESP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbDesp_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7162AlbDesp = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A7162AlbDesp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7162AlbDesp), 6, 0));
            }
            else
            {
               A7162AlbDesp = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbDesp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7162AlbDesp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7162AlbDesp), 6, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbCambio_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbCambio_Internalname)), DecimalUtil.stringToDec("99.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBCAMBIO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbCambio_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7986AlbCambio = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A7986AlbCambio", GXutil.ltrimstr( A7986AlbCambio, 7, 4));
            }
            else
            {
               A7986AlbCambio = localUtil.ctond( httpContext.cgiGet( edtAlbCambio_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7986AlbCambio", GXutil.ltrimstr( A7986AlbCambio, 7, 4));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTipDoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTipDoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBTIPDOC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbTipDoc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7985AlbTipDoc = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A7985AlbTipDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7985AlbTipDoc), 8, 0));
            }
            else
            {
               A7985AlbTipDoc = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbTipDoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7985AlbTipDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7985AlbTipDoc), 8, 0));
            }
            A7984AlbMotTr = httpContext.cgiGet( edtAlbMotTr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7984AlbMotTr", A7984AlbMotTr);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTipCal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTipCal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBTIPCAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbTipCal_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5803AlbTipCal = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5803AlbTipCal", GXutil.str( A5803AlbTipCal, 1, 0));
            }
            else
            {
               A5803AlbTipCal = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbTipCal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5803AlbTipCal", GXutil.str( A5803AlbTipCal, 1, 0));
            }
            A7988AlbObsCb = httpContext.cgiGet( edtAlbObsCb_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7988AlbObsCb", A7988AlbObsCb);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbNumT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbNumT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBNUMT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbNumT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7102AlbNumT = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A7102AlbNumT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7102AlbNumT), 10, 0));
            }
            else
            {
               A7102AlbNumT = localUtil.ctol( httpContext.cgiGet( edtAlbNumT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7102AlbNumT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7102AlbNumT), 10, 0));
            }
            A7100AlbMarCo = httpContext.cgiGet( edtAlbMarCo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7100AlbMarCo", A7100AlbMarCo);
            A7099AlbOComp = httpContext.cgiGet( edtAlbOComp_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7099AlbOComp", A7099AlbOComp);
            A3643TrnNif = GXutil.upper( httpContext.cgiGet( edtTrnNif_Internalname)) ;
            n3643TrnNif = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
            cmbAlbDivTCod.setValue( httpContext.cgiGet( cmbAlbDivTCod.getInternalname()) );
            A3093AlbDivTCod = httpContext.cgiGet( cmbAlbDivTCod.getInternalname()) ;
            n3093AlbDivTCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
            A3109AlbDivAbr = httpContext.cgiGet( edtAlbDivAbr_Internalname) ;
            n3109AlbDivAbr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBDIVCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbDivCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3108AlbDivCod = (byte)(0) ;
               n3108AlbDivCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
            }
            else
            {
               A3108AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3108AlbDivCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
            }
            A1260BusDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtBusDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1260BusDomEnv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
            A1253EmprGuiRem = GXutil.upper( httpContext.cgiGet( edtEmprGuiRem_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGuiRemDom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGuiRemDom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GUIREMDOM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtGuiRemDom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1258GuiRemDom = (byte)(0) ;
               n1258GuiRemDom = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1258GuiRemDom", GXutil.str( A1258GuiRemDom, 1, 0));
            }
            else
            {
               A1258GuiRemDom = (byte)(localUtil.ctol( httpContext.cgiGet( edtGuiRemDom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n1258GuiRemDom = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1258GuiRemDom", GXutil.str( A1258GuiRemDom, 1, 0));
            }
            cmbGuiRemDivT.setValue( httpContext.cgiGet( cmbGuiRemDivT.getInternalname()) );
            A3145GuiRemDivT = httpContext.cgiGet( cmbGuiRemDivT.getInternalname()) ;
            n3145GuiRemDivT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", A3145GuiRemDivT);
            A3110GuiRemDiv = (byte)(localUtil.ctol( httpContext.cgiGet( edtGuiRemDiv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3110GuiRemDiv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3110GuiRemDiv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3110GuiRemDiv), 2, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A5140AlbMarca = httpContext.cgiGet( edtAlbMarca_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5140AlbMarca", A5140AlbMarca);
            A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
            A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
            n841TrnNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"Calprd_TRN");
            A10019AlbHhfm = localUtil.ctot( httpContext.cgiGet( edtAlbHhfm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("AlbHhfm", localUtil.format( A10019AlbHhfm, "99/99/99 99:99"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A33AlbProEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProEst.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
            forbiddenHiddens.add("AlbProEst", localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9"));
            A7098AlbUsu = httpContext.cgiGet( edtAlbUsu_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
            forbiddenHiddens.add("AlbUsu", GXutil.rtrim( localUtil.format( A7098AlbUsu, "")));
            A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
            forbiddenHiddens.add("AlbEnvFtp", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9"));
            A7101AlbLic = httpContext.cgiGet( edtAlbLic_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
            forbiddenHiddens.add("AlbLic", GXutil.rtrim( localUtil.format( A7101AlbLic, "")));
            A10765AlbProAT = httpContext.cgiGet( cmbAlbProAT.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
            forbiddenHiddens.add("AlbProAT", GXutil.rtrim( localUtil.format( A10765AlbProAT, "")));
            A10020AlbGrossT = localUtil.ctond( httpContext.cgiGet( edtAlbGrossT_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
            forbiddenHiddens.add("AlbGrossT", localUtil.format( A10020AlbGrossT, "ZZZZZZZZZ9.99"));
            A10017AlbFmd = httpContext.cgiGet( edtAlbFmd_Internalname) ;
            n10017AlbFmd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10017AlbFmd", A10017AlbFmd);
            forbiddenHiddens.add("AlbFmd", GXutil.rtrim( localUtil.format( A10017AlbFmd, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A30AlbProCod != Z30AlbProCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("calprd_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
                  sMode3 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode3 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound3 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1Q70( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
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
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111Q72 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121Q72 ();
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
         e121Q72 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1Q73( ) ;
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
         disableAttributes1Q73( ) ;
      }
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

   public void confirm_1Q70( )
   {
      beforeValidate1Q73( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1Q73( ) ;
         }
         else
         {
            checkExtendedTable1Q73( ) ;
            closeExtendedTableCursors1Q73( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1Q70( )
   {
   }

   public void e111Q72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      calprd_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      calprd_trn_impl.this.A396EmprCod = GXv_char2[0] ;
      calprd_trn_impl.this.AV8EmprNom = GXv_char3[0] ;
      calprd_trn_impl.this.AV9UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprNom", AV8EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV9UsurCod", AV9UsurCod);
      GXt_int5 = (byte)(AV24FirmaD) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
      calprd_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV24FirmaD = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24FirmaD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24FirmaD), 4, 0));
      GXt_int7 = AV25avisar ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ATAVIS", ""), GXv_int8) ;
      calprd_trn_impl.this.GXt_int7 = GXv_int8[0] ;
      AV25avisar = (short)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25avisar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25avisar), 4, 0));
      GXt_int5 = (byte)(AV31Ctrlf) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CTRDAT", ""), GXv_int6) ;
      calprd_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      AV31Ctrlf = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Ctrlf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Ctrlf), 4, 0));
      GXt_char1 = AV7Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      calprd_trn_impl.this.GXt_char1 = GXv_char4[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      GXv_char4[0] = AV10EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char2[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char4, GXv_char3, GXv_char2) ;
      calprd_trn_impl.this.AV10EmprCod = GXv_char4[0] ;
      calprd_trn_impl.this.AV8EmprNom = GXv_char3[0] ;
      calprd_trn_impl.this.AV9UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprNom", AV8EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV9UsurCod", AV9UsurCod);
      GXv_SdtWWPContext9[0] = AV12WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV12WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV13TrnContext.fromxml(AV14WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV13TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV33Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV34GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GXV1), 8, 0));
         while ( AV34GXV1 <= AV13TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV19TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV13TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV34GXV1));
            if ( GXutil.strcmp(AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "GuiRemCli") == 0 )
            {
               AV15Insert_GuiRemCli = (int)(GXutil.lval( AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Insert_GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Insert_GuiRemCli), 6, 0));
            }
            else if ( GXutil.strcmp(AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV16Insert_TrnCod = (short)(GXutil.lval( AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16Insert_TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Insert_TrnCod), 4, 0));
            }
            else if ( GXutil.strcmp(AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlbDivCod") == 0 )
            {
               AV17Insert_AlbDivCod = (byte)(GXutil.lval( AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Insert_AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Insert_AlbDivCod), 2, 0));
            }
            else if ( GXutil.strcmp(AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "EmprGuiRem") == 0 )
            {
               AV18Insert_EmprGuiRem = AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Insert_EmprGuiRem", AV18Insert_EmprGuiRem);
            }
            AV34GXV1 = (int)(AV34GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GXV1), 8, 0));
         }
      }
      edtAlbMarca_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMarca_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMarca_Visible), 5, 0), true);
      edtGuiRemCln_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCln_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCln_Visible), 5, 0), true);
      edtTrnNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Visible), 5, 0), true);
   }

   public void e121Q72( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV13TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.calprd_trnww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divAlbtrnnm_cell_Class = "col-xs-12 col-sm-4 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbtrnnm_cell_Internalname, "Class", divAlbtrnnm_cell_Class, true);
      divAlbtrnnc_cell_Class = "col-xs-12 col-sm-4 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbtrnnc_cell_Internalname, "Class", divAlbtrnnc_cell_Class, true);
      divAlbtrndm_cell_Class = "col-xs-12 col-sm-4 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbtrndm_cell_Internalname, "Class", divAlbtrndm_cell_Class, true);
      divAlbsec_cell_Class = "col-xs-12 col-sm-3 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbsec_cell_Internalname, "Class", divAlbsec_cell_Class, true);
   }

   public void zm1Q73( int GX_JID )
   {
      if ( ( GX_JID == 56 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z39AlbProPri = T01Q73_A39AlbProPri[0] ;
            Z33AlbProEst = T01Q73_A33AlbProEst[0] ;
            Z34AlbProfch = T01Q73_A34AlbProfch[0] ;
            Z4023AlbFecSal = T01Q73_A4023AlbFecSal[0] ;
            Z3865AlbHorSal = T01Q73_A3865AlbHorSal[0] ;
            Z7098AlbUsu = T01Q73_A7098AlbUsu[0] ;
            Z3869AlbCliDes = T01Q73_A3869AlbCliDes[0] ;
            Z1259AlbDomEnv = T01Q73_A1259AlbDomEnv[0] ;
            Z3868AlbMat = T01Q73_A3868AlbMat[0] ;
            Z2242AlbSec = T01Q73_A2242AlbSec[0] ;
            Z5805AlbEnvFtp = T01Q73_A5805AlbEnvFtp[0] ;
            Z7101AlbLic = T01Q73_A7101AlbLic[0] ;
            Z10765AlbProAT = T01Q73_A10765AlbProAT[0] ;
            Z10019AlbHhfm = T01Q73_A10019AlbHhfm[0] ;
            Z10020AlbGrossT = T01Q73_A10020AlbGrossT[0] ;
            Z10837AlbTrnNc = T01Q73_A10837AlbTrnNc[0] ;
            Z10017AlbFmd = T01Q73_A10017AlbFmd[0] ;
            Z10835AlbTrnNm = T01Q73_A10835AlbTrnNm[0] ;
            Z10018ALbFmdc = T01Q73_A10018ALbFmdc[0] ;
            Z10836AlbTrnDm = T01Q73_A10836AlbTrnDm[0] ;
            Z5140AlbMarca = T01Q73_A5140AlbMarca[0] ;
            Z3867AlbLocDes = T01Q73_A3867AlbLocDes[0] ;
            Z3866AlbLocCar = T01Q73_A3866AlbLocCar[0] ;
            Z914AlbPObsCon = T01Q73_A914AlbPObsCon[0] ;
            Z5141AlbIvaCod = T01Q73_A5141AlbIvaCod[0] ;
            Z7987AlbColCa = T01Q73_A7987AlbColCa[0] ;
            Z7162AlbDesp = T01Q73_A7162AlbDesp[0] ;
            Z7986AlbCambio = T01Q73_A7986AlbCambio[0] ;
            Z7985AlbTipDoc = T01Q73_A7985AlbTipDoc[0] ;
            Z7984AlbMotTr = T01Q73_A7984AlbMotTr[0] ;
            Z5803AlbTipCal = T01Q73_A5803AlbTipCal[0] ;
            Z7988AlbObsCb = T01Q73_A7988AlbObsCb[0] ;
            Z7102AlbNumT = T01Q73_A7102AlbNumT[0] ;
            Z7100AlbMarCo = T01Q73_A7100AlbMarCo[0] ;
            Z7099AlbOComp = T01Q73_A7099AlbOComp[0] ;
            Z3093AlbDivTCod = T01Q73_A3093AlbDivTCod[0] ;
            Z1258GuiRemDom = T01Q73_A1258GuiRemDom[0] ;
            Z1253EmprGuiRem = T01Q73_A1253EmprGuiRem[0] ;
            Z1243GuiRemCli = T01Q73_A1243GuiRemCli[0] ;
            Z840TrnCod = T01Q73_A840TrnCod[0] ;
            Z3108AlbDivCod = T01Q73_A3108AlbDivCod[0] ;
         }
         else
         {
            Z39AlbProPri = A39AlbProPri ;
            Z33AlbProEst = A33AlbProEst ;
            Z34AlbProfch = A34AlbProfch ;
            Z4023AlbFecSal = A4023AlbFecSal ;
            Z3865AlbHorSal = A3865AlbHorSal ;
            Z7098AlbUsu = A7098AlbUsu ;
            Z3869AlbCliDes = A3869AlbCliDes ;
            Z1259AlbDomEnv = A1259AlbDomEnv ;
            Z3868AlbMat = A3868AlbMat ;
            Z2242AlbSec = A2242AlbSec ;
            Z5805AlbEnvFtp = A5805AlbEnvFtp ;
            Z7101AlbLic = A7101AlbLic ;
            Z10765AlbProAT = A10765AlbProAT ;
            Z10019AlbHhfm = A10019AlbHhfm ;
            Z10020AlbGrossT = A10020AlbGrossT ;
            Z10837AlbTrnNc = A10837AlbTrnNc ;
            Z10017AlbFmd = A10017AlbFmd ;
            Z10835AlbTrnNm = A10835AlbTrnNm ;
            Z10018ALbFmdc = A10018ALbFmdc ;
            Z10836AlbTrnDm = A10836AlbTrnDm ;
            Z5140AlbMarca = A5140AlbMarca ;
            Z3867AlbLocDes = A3867AlbLocDes ;
            Z3866AlbLocCar = A3866AlbLocCar ;
            Z914AlbPObsCon = A914AlbPObsCon ;
            Z5141AlbIvaCod = A5141AlbIvaCod ;
            Z7987AlbColCa = A7987AlbColCa ;
            Z7162AlbDesp = A7162AlbDesp ;
            Z7986AlbCambio = A7986AlbCambio ;
            Z7985AlbTipDoc = A7985AlbTipDoc ;
            Z7984AlbMotTr = A7984AlbMotTr ;
            Z5803AlbTipCal = A5803AlbTipCal ;
            Z7988AlbObsCb = A7988AlbObsCb ;
            Z7102AlbNumT = A7102AlbNumT ;
            Z7100AlbMarCo = A7100AlbMarCo ;
            Z7099AlbOComp = A7099AlbOComp ;
            Z3093AlbDivTCod = A3093AlbDivTCod ;
            Z1258GuiRemDom = A1258GuiRemDom ;
            Z1253EmprGuiRem = A1253EmprGuiRem ;
            Z1243GuiRemCli = A1243GuiRemCli ;
            Z840TrnCod = A840TrnCod ;
            Z3108AlbDivCod = A3108AlbDivCod ;
         }
      }
      if ( GX_JID == -56 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z39AlbProPri = A39AlbProPri ;
         Z33AlbProEst = A33AlbProEst ;
         Z34AlbProfch = A34AlbProfch ;
         Z4023AlbFecSal = A4023AlbFecSal ;
         Z3865AlbHorSal = A3865AlbHorSal ;
         Z7098AlbUsu = A7098AlbUsu ;
         Z3869AlbCliDes = A3869AlbCliDes ;
         Z1259AlbDomEnv = A1259AlbDomEnv ;
         Z3868AlbMat = A3868AlbMat ;
         Z2242AlbSec = A2242AlbSec ;
         Z5805AlbEnvFtp = A5805AlbEnvFtp ;
         Z7101AlbLic = A7101AlbLic ;
         Z10765AlbProAT = A10765AlbProAT ;
         Z10019AlbHhfm = A10019AlbHhfm ;
         Z10020AlbGrossT = A10020AlbGrossT ;
         Z10837AlbTrnNc = A10837AlbTrnNc ;
         Z10017AlbFmd = A10017AlbFmd ;
         Z10835AlbTrnNm = A10835AlbTrnNm ;
         Z10018ALbFmdc = A10018ALbFmdc ;
         Z10836AlbTrnDm = A10836AlbTrnDm ;
         Z5140AlbMarca = A5140AlbMarca ;
         Z3867AlbLocDes = A3867AlbLocDes ;
         Z3866AlbLocCar = A3866AlbLocCar ;
         Z914AlbPObsCon = A914AlbPObsCon ;
         Z5141AlbIvaCod = A5141AlbIvaCod ;
         Z7987AlbColCa = A7987AlbColCa ;
         Z7162AlbDesp = A7162AlbDesp ;
         Z7986AlbCambio = A7986AlbCambio ;
         Z7985AlbTipDoc = A7985AlbTipDoc ;
         Z7984AlbMotTr = A7984AlbMotTr ;
         Z5803AlbTipCal = A5803AlbTipCal ;
         Z7988AlbObsCb = A7988AlbObsCb ;
         Z7102AlbNumT = A7102AlbNumT ;
         Z7100AlbMarCo = A7100AlbMarCo ;
         Z7099AlbOComp = A7099AlbOComp ;
         Z3093AlbDivTCod = A3093AlbDivTCod ;
         Z1258GuiRemDom = A1258GuiRemDom ;
         Z1253EmprGuiRem = A1253EmprGuiRem ;
         Z1243GuiRemCli = A1243GuiRemCli ;
         Z396EmprCod = A396EmprCod ;
         Z840TrnCod = A840TrnCod ;
         Z3108AlbDivCod = A3108AlbDivCod ;
         Z407EmprNom = A407EmprNom ;
         Z3109AlbDivAbr = A3109AlbDivAbr ;
         Z1244GuiRemCln = A1244GuiRemCln ;
         Z3145GuiRemDivT = A3145GuiRemDivT ;
         Z3110GuiRemDiv = A3110GuiRemDiv ;
         Z1260BusDomEnv = A1260BusDomEnv ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbHhfm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHhfm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHhfm_Enabled), 5, 0), true);
      edtAlbGrossT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbGrossT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbGrossT_Enabled), 5, 0), true);
      edtAlbFmd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbFmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbFmd_Enabled), 5, 0), true);
      cmbAlbEnvFtp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbEnvFtp.getEnabled(), 5, 0), true);
      edtAlbLic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLic_Enabled), 5, 0), true);
      cmbAlbProAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProAT.getEnabled(), 5, 0), true);
      edtAlbUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUsu_Enabled), 5, 0), true);
      cmbAlbProPri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProPri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProPri.getEnabled(), 5, 0), true);
      cmbAlbProEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProEst.getEnabled(), 5, 0), true);
      AV33Pgmname = "Calprd_TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbHhfm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHhfm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHhfm_Enabled), 5, 0), true);
      edtAlbGrossT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbGrossT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbGrossT_Enabled), 5, 0), true);
      edtAlbFmd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbFmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbFmd_Enabled), 5, 0), true);
      cmbAlbEnvFtp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbEnvFtp.getEnabled(), 5, 0), true);
      edtAlbLic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLic_Enabled), 5, 0), true);
      cmbAlbProAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProAT.getEnabled(), 5, 0), true);
      edtAlbUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUsu_Enabled), 5, 0), true);
      cmbAlbProPri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProPri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProPri.getEnabled(), 5, 0), true);
      cmbAlbProEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProEst.getEnabled(), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         A396EmprCod = AV10EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01Q75 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01Q75_A407EmprNom[0] ;
      n407EmprNom = T01Q75_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(3);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
      calprd_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      edtAlbTrnNm_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnNm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnNm_Visible), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
      calprd_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divAlbtrnnm_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbtrnnm_cell_Internalname, "Class", divAlbtrnnm_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
         calprd_trn_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divAlbtrnnm_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-4 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbtrnnm_cell_Internalname, "Class", divAlbtrnnm_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
      calprd_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      edtAlbTrnNc_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnNc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnNc_Visible), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
      calprd_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divAlbtrnnc_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbtrnnc_cell_Internalname, "Class", divAlbtrnnc_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
         calprd_trn_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divAlbtrnnc_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-4 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbtrnnc_cell_Internalname, "Class", divAlbtrnnc_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
      calprd_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      edtAlbTrnDm_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnDm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnDm_Visible), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
      calprd_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divAlbtrndm_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbtrndm_cell_Internalname, "Class", divAlbtrndm_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
         calprd_trn_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divAlbtrndm_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-4 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbtrndm_cell_Internalname, "Class", divAlbtrndm_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINAMA", ""), ""), GXv_int6) ;
      calprd_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      cmbAlbSec.setVisible( ((GXt_int5==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbSec.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbSec.getVisible(), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINAMA", ""), ""), GXv_int6) ;
      calprd_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divAlbsec_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbsec_cell_Internalname, "Class", divAlbsec_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINAMA", ""), ""), GXv_int6) ;
         calprd_trn_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divAlbsec_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbsec_cell_Internalname, "Class", divAlbsec_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
      calprd_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      divUnnamedtable6_Visible = (((GXt_int5==1)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable6_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable6_Visible), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV11AlbProCod) )
      {
         A30AlbProCod = AV11AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      if ( ! (0==AV11AlbProCod) )
      {
         edtAlbProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV11AlbProCod) )
      {
         edtAlbProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV15Insert_GuiRemCli) )
      {
         edtGuiRemCli_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      }
      else
      {
         edtGuiRemCli_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV16Insert_TrnCod) )
      {
         edtTrnCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTrnCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV17Insert_AlbDivCod) )
      {
         edtAlbDivCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivCod_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbDivCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV18Insert_EmprGuiRem)==0) )
      {
         edtEmprGuiRem_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprGuiRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprGuiRem_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprGuiRem_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprGuiRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprGuiRem_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV18Insert_EmprGuiRem)==0) )
      {
         A1253EmprGuiRem = AV18Insert_EmprGuiRem ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV16Insert_TrnCod) )
      {
         A840TrnCod = AV16Insert_TrnCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         /* Using cursor T01Q710 */
         pr_default.execute(8, new Object[] {Short.valueOf(A840TrnCod)});
         h840TrnCod = "" ;
         while ( (pr_default.getStatus(8) != 101) )
         {
            h840TrnCod = T01Q710_A13738TrnCNom[0] ;
            if (true) break;
         }
         pr_default.close(8);
         httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV15Insert_GuiRemCli) )
      {
         A1243GuiRemCli = AV15Insert_GuiRemCli ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         /* Using cursor T01Q711 */
         pr_default.execute(9, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         h1243GuiRemCli = "" ;
         while ( (pr_default.getStatus(9) != 101) )
         {
            h1243GuiRemCli = T01Q711_A13735CliCNom[0] ;
            if (true) break;
         }
         pr_default.close(9);
         httpContext.ajax_rsp_assign_attri("", false, "h1243GuiRemCli", h1243GuiRemCli);
      }
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A34AlbProfch)) && ( Gx_BScreen == 0 ) )
      {
         A34AlbProfch = GXutil.serverDate( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A4023AlbFecSal)) && ( Gx_BScreen == 0 ) )
      {
         A4023AlbFecSal = GXutil.serverDate( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
      }
      if ( isIns( )  && (GXutil.strcmp("", A7098AlbUsu)==0) && ( Gx_BScreen == 0 ) )
      {
         A7098AlbUsu = AV9UsurCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10765AlbProAT)==0) && ( Gx_BScreen == 0 ) )
      {
         A10765AlbProAT = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A10019AlbHhfm) && ( Gx_BScreen == 0 ) )
      {
         A10019AlbHhfm = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01Q76 */
         pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
         A841TrnNom = T01Q76_A841TrnNom[0] ;
         n841TrnNom = T01Q76_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A3643TrnNif = T01Q76_A3643TrnNif[0] ;
         n3643TrnNif = T01Q76_n3643TrnNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
         pr_default.close(5);
         /* Using cursor T01Q77 */
         pr_default.execute(5, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
         A841TrnNom = T01Q77_A841TrnNom[0] ;
         n841TrnNom = T01Q77_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A3643TrnNif = T01Q77_A3643TrnNif[0] ;
         n3643TrnNif = T01Q77_n3643TrnNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
         pr_default.close(5);
         /* Using cursor T01Q74 */
         pr_default.execute(2, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A1244GuiRemCln = T01Q74_A1244GuiRemCln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         A3145GuiRemDivT = T01Q74_A3145GuiRemDivT[0] ;
         n3145GuiRemDivT = T01Q74_n3145GuiRemDivT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", A3145GuiRemDivT);
         A3110GuiRemDiv = T01Q74_A3110GuiRemDiv[0] ;
         n3110GuiRemDiv = T01Q74_n3110GuiRemDiv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3110GuiRemDiv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3110GuiRemDiv), 2, 0));
         pr_default.close(2);
      }
   }

   public void load1Q73( )
   {
      /* Using cursor T01Q712 */
      pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A39AlbProPri = T01Q712_A39AlbProPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         A33AlbProEst = T01Q712_A33AlbProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
         A34AlbProfch = T01Q712_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A4023AlbFecSal = T01Q712_A4023AlbFecSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
         A3865AlbHorSal = T01Q712_A3865AlbHorSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
         A7098AlbUsu = T01Q712_A7098AlbUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
         A1244GuiRemCln = T01Q712_A1244GuiRemCln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         A3869AlbCliDes = T01Q712_A3869AlbCliDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         A1259AlbDomEnv = T01Q712_A1259AlbDomEnv[0] ;
         n1259AlbDomEnv = T01Q712_n1259AlbDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
         A3868AlbMat = T01Q712_A3868AlbMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3868AlbMat", A3868AlbMat);
         A2242AlbSec = T01Q712_A2242AlbSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
         A5805AlbEnvFtp = T01Q712_A5805AlbEnvFtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A7101AlbLic = T01Q712_A7101AlbLic[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
         A10765AlbProAT = T01Q712_A10765AlbProAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
         A10019AlbHhfm = T01Q712_A10019AlbHhfm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10020AlbGrossT = T01Q712_A10020AlbGrossT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
         A10837AlbTrnNc = T01Q712_A10837AlbTrnNc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10837AlbTrnNc", A10837AlbTrnNc);
         A10017AlbFmd = T01Q712_A10017AlbFmd[0] ;
         n10017AlbFmd = T01Q712_n10017AlbFmd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10017AlbFmd", A10017AlbFmd);
         A10835AlbTrnNm = T01Q712_A10835AlbTrnNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10835AlbTrnNm", A10835AlbTrnNm);
         A10018ALbFmdc = T01Q712_A10018ALbFmdc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10018ALbFmdc", A10018ALbFmdc);
         A10836AlbTrnDm = T01Q712_A10836AlbTrnDm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10836AlbTrnDm", A10836AlbTrnDm);
         A5140AlbMarca = T01Q712_A5140AlbMarca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5140AlbMarca", A5140AlbMarca);
         A3867AlbLocDes = T01Q712_A3867AlbLocDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3867AlbLocDes", GXutil.str( A3867AlbLocDes, 1, 0));
         A3866AlbLocCar = T01Q712_A3866AlbLocCar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3866AlbLocCar", GXutil.str( A3866AlbLocCar, 1, 0));
         A914AlbPObsCon = T01Q712_A914AlbPObsCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         A5141AlbIvaCod = T01Q712_A5141AlbIvaCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5141AlbIvaCod", A5141AlbIvaCod);
         A7987AlbColCa = T01Q712_A7987AlbColCa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7987AlbColCa", A7987AlbColCa);
         A7162AlbDesp = T01Q712_A7162AlbDesp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7162AlbDesp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7162AlbDesp), 6, 0));
         A7986AlbCambio = T01Q712_A7986AlbCambio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7986AlbCambio", GXutil.ltrimstr( A7986AlbCambio, 7, 4));
         A7985AlbTipDoc = T01Q712_A7985AlbTipDoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7985AlbTipDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7985AlbTipDoc), 8, 0));
         A7984AlbMotTr = T01Q712_A7984AlbMotTr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7984AlbMotTr", A7984AlbMotTr);
         A5803AlbTipCal = T01Q712_A5803AlbTipCal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5803AlbTipCal", GXutil.str( A5803AlbTipCal, 1, 0));
         A7988AlbObsCb = T01Q712_A7988AlbObsCb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7988AlbObsCb", A7988AlbObsCb);
         A7102AlbNumT = T01Q712_A7102AlbNumT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7102AlbNumT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7102AlbNumT), 10, 0));
         A7100AlbMarCo = T01Q712_A7100AlbMarCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7100AlbMarCo", A7100AlbMarCo);
         A7099AlbOComp = T01Q712_A7099AlbOComp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7099AlbOComp", A7099AlbOComp);
         A3093AlbDivTCod = T01Q712_A3093AlbDivTCod[0] ;
         n3093AlbDivTCod = T01Q712_n3093AlbDivTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
         A3109AlbDivAbr = T01Q712_A3109AlbDivAbr[0] ;
         n3109AlbDivAbr = T01Q712_n3109AlbDivAbr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
         A1258GuiRemDom = T01Q712_A1258GuiRemDom[0] ;
         n1258GuiRemDom = T01Q712_n1258GuiRemDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1258GuiRemDom", GXutil.str( A1258GuiRemDom, 1, 0));
         A3145GuiRemDivT = T01Q712_A3145GuiRemDivT[0] ;
         n3145GuiRemDivT = T01Q712_n3145GuiRemDivT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", A3145GuiRemDivT);
         A407EmprNom = T01Q712_A407EmprNom[0] ;
         n407EmprNom = T01Q712_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A1253EmprGuiRem = T01Q712_A1253EmprGuiRem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A1243GuiRemCli = T01Q712_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         A840TrnCod = T01Q712_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A3108AlbDivCod = T01Q712_A3108AlbDivCod[0] ;
         n3108AlbDivCod = T01Q712_n3108AlbDivCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
         A3110GuiRemDiv = T01Q712_A3110GuiRemDiv[0] ;
         n3110GuiRemDiv = T01Q712_n3110GuiRemDiv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3110GuiRemDiv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3110GuiRemDiv), 2, 0));
         A1260BusDomEnv = T01Q712_A1260BusDomEnv[0] ;
         n1260BusDomEnv = T01Q712_n1260BusDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
         zm1Q73( -56) ;
      }
      pr_default.close(10);
      onLoadActions1Q73( ) ;
   }

   public void onLoadActions1Q73( )
   {
      /* Using cursor T01Q77 */
      pr_default.execute(5, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      A841TrnNom = T01Q77_A841TrnNom[0] ;
      n841TrnNom = T01Q77_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A3643TrnNif = T01Q77_A3643TrnNif[0] ;
      n3643TrnNif = T01Q77_n3643TrnNif[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
      pr_default.close(5);
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV17Insert_AlbDivCod) )
      {
         A3108AlbDivCod = AV17Insert_AlbDivCod ;
         n3108AlbDivCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
      }
      else
      {
         if ( isIns( )  && (0==A3108AlbDivCod) && ( Gx_BScreen == 0 ) )
         {
            A3108AlbDivCod = (byte)(2) ;
            n3108AlbDivCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
         }
         else
         {
            if ( isIns( )  && (0==A3108AlbDivCod) && ( Gx_BScreen == 0 ) )
            {
               A3108AlbDivCod = A3110GuiRemDiv ;
               n3108AlbDivCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
            }
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A3093AlbDivTCod)==0) && ( Gx_BScreen == 0 ) )
      {
         A3093AlbDivTCod = httpContext.getMessage( "E", "") ;
         n3093AlbDivTCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A3093AlbDivTCod)==0) && ( Gx_BScreen == 0 ) )
         {
            A3093AlbDivTCod = A3145GuiRemDivT ;
            n3093AlbDivTCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
         }
      }
      if ( isIns( )  && (0==A3869AlbCliDes) && ( Gx_BScreen == 0 ) )
      {
         A3869AlbCliDes = A1243GuiRemCli ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         /* Using cursor T01Q713 */
         pr_default.execute(11, new Object[] {Integer.valueOf(A3869AlbCliDes)});
         h3869AlbCliDes = "" ;
         while ( (pr_default.getStatus(11) != 101) )
         {
            h3869AlbCliDes = T01Q713_A13735CliCNom[0] ;
            if (true) break;
         }
         pr_default.close(11);
         httpContext.ajax_rsp_assign_attri("", false, "h3869AlbCliDes", h3869AlbCliDes);
      }
      /* Using cursor T01Q76 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      A841TrnNom = T01Q76_A841TrnNom[0] ;
      n841TrnNom = T01Q76_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A3643TrnNif = T01Q76_A3643TrnNif[0] ;
      n3643TrnNif = T01Q76_n3643TrnNif[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
      pr_default.close(5);
      /* Using cursor T01Q714 */
      pr_default.execute(12, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      h1243GuiRemCli = "" ;
      while ( (pr_default.getStatus(12) != 101) )
      {
         h1243GuiRemCli = T01Q714_A13735CliCNom[0] ;
         if (true) break;
      }
      pr_default.close(12);
      httpContext.ajax_rsp_assign_attri("", false, "h1243GuiRemCli", h1243GuiRemCli);
      /* Using cursor T01Q715 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A3869AlbCliDes)});
      h3869AlbCliDes = "" ;
      while ( (pr_default.getStatus(13) != 101) )
      {
         h3869AlbCliDes = T01Q715_A13735CliCNom[0] ;
         if (true) break;
      }
      pr_default.close(13);
      httpContext.ajax_rsp_assign_attri("", false, "h3869AlbCliDes", h3869AlbCliDes);
      /* Using cursor T01Q716 */
      pr_default.execute(14, new Object[] {Short.valueOf(A840TrnCod)});
      h840TrnCod = "" ;
      while ( (pr_default.getStatus(14) != 101) )
      {
         h840TrnCod = T01Q716_A13738TrnCNom[0] ;
         if (true) break;
      }
      pr_default.close(14);
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
   }

   public void checkExtendedTable1Q73( )
   {
      nIsDirty_3 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         nIsDirty_3 = (short)(1) ;
         A840TrnCod = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         A13738TrnCNom = h840TrnCod ;
         /* Using cursor T01Q717 */
         pr_default.execute(15, new Object[] {A13738TrnCNom});
         A396EmprCod = T01Q717_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = T01Q717_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A840TrnCod = T01Q717_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         if ( ! ( (pr_default.getStatus(15) == 101) ) )
         {
            pr_default.readNext(15);
            if ( ! ( (pr_default.getStatus(15) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(15);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      if ( ! (GXutil.strcmp("", A7101AlbLic)==0) && ( AV24FirmaD == 1 ) && ( isIns( )  || isUpd( )  || isDlt( )  ) && ( AV25avisar == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Este guia foi comunicada à AT", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T01Q74 */
      pr_default.execute(2, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1244GuiRemCln = T01Q74_A1244GuiRemCln[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      A3145GuiRemDivT = T01Q74_A3145GuiRemDivT[0] ;
      n3145GuiRemDivT = T01Q74_n3145GuiRemDivT[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", A3145GuiRemDivT);
      A3110GuiRemDiv = T01Q74_A3110GuiRemDiv[0] ;
      n3110GuiRemDiv = T01Q74_n3110GuiRemDiv[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3110GuiRemDiv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3110GuiRemDiv), 2, 0));
      pr_default.close(2);
      /* Using cursor T01Q79 */
      pr_default.execute(7, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A1260BusDomEnv = T01Q79_A1260BusDomEnv[0] ;
         n1260BusDomEnv = T01Q79_n1260BusDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
      }
      else
      {
         nIsDirty_3 = (short)(1) ;
         A1260BusDomEnv = (byte)(0) ;
         n1260BusDomEnv = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
      }
      pr_default.close(7);
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         nIsDirty_3 = (short)(1) ;
         A840TrnCod = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         A13738TrnCNom = h840TrnCod ;
         /* Using cursor T01Q718 */
         pr_default.execute(16, new Object[] {A13738TrnCNom});
         A840TrnCod = T01Q718_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A840TrnCod = T01Q718_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         if ( ! ( (pr_default.getStatus(16) == 101) ) )
         {
            pr_default.readNext(16);
            if ( ! ( (pr_default.getStatus(16) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(16);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      /* Using cursor T01Q77 */
      pr_default.execute(5, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A841TrnNom = T01Q77_A841TrnNom[0] ;
      n841TrnNom = T01Q77_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A3643TrnNif = T01Q77_A3643TrnNif[0] ;
      n3643TrnNif = T01Q77_n3643TrnNif[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
      pr_default.close(5);
      if ( A33AlbProEst == 2 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia JÁ Faturada", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV17Insert_AlbDivCod) )
      {
         nIsDirty_3 = (short)(1) ;
         A3108AlbDivCod = AV17Insert_AlbDivCod ;
         n3108AlbDivCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
      }
      else
      {
         if ( isIns( )  && (0==A3108AlbDivCod) && ( Gx_BScreen == 0 ) )
         {
            nIsDirty_3 = (short)(1) ;
            A3108AlbDivCod = (byte)(2) ;
            n3108AlbDivCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
         }
         else
         {
            if ( isIns( )  && (0==A3108AlbDivCod) && ( Gx_BScreen == 0 ) )
            {
               nIsDirty_3 = (short)(1) ;
               A3108AlbDivCod = A3110GuiRemDiv ;
               n3108AlbDivCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
            }
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A3093AlbDivTCod)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_3 = (short)(1) ;
         A3093AlbDivTCod = httpContext.getMessage( "E", "") ;
         n3093AlbDivTCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A3093AlbDivTCod)==0) && ( Gx_BScreen == 0 ) )
         {
            nIsDirty_3 = (short)(1) ;
            A3093AlbDivTCod = A3145GuiRemDivT ;
            n3093AlbDivTCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
         }
      }
      if ( isIns( )  && (0==A3869AlbCliDes) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_3 = (short)(1) ;
         A3869AlbCliDes = A1243GuiRemCli ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         /* Using cursor T01Q719 */
         pr_default.execute(17, new Object[] {Integer.valueOf(A3869AlbCliDes)});
         h3869AlbCliDes = "" ;
         while ( (pr_default.getStatus(17) != 101) )
         {
            h3869AlbCliDes = T01Q719_A13735CliCNom[0] ;
            if (true) break;
         }
         pr_default.close(17);
         httpContext.ajax_rsp_assign_attri("", false, "h3869AlbCliDes", h3869AlbCliDes);
      }
      /* Using cursor T01Q76 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A13738TrnCNom)==0) || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01Q76_A841TrnNom[0] ;
      n841TrnNom = T01Q76_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A3643TrnNif = T01Q76_A3643TrnNif[0] ;
      n3643TrnNif = T01Q76_n3643TrnNif[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
      pr_default.close(5);
      /* Using cursor T01Q78 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (0==A3108AlbDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlb", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBDIVCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbDivCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A3109AlbDivAbr = T01Q78_A3109AlbDivAbr[0] ;
      n3109AlbDivAbr = T01Q78_n3109AlbDivAbr[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1Q73( )
   {
      pr_default.close(2);
      pr_default.close(7);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_57( String A1253EmprGuiRem ,
                          int A1243GuiRemCli )
   {
      /* Using cursor T01Q720 */
      pr_default.execute(18, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1244GuiRemCln = T01Q720_A1244GuiRemCln[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      A3145GuiRemDivT = T01Q720_A3145GuiRemDivT[0] ;
      n3145GuiRemDivT = T01Q720_n3145GuiRemDivT[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", A3145GuiRemDivT);
      A3110GuiRemDiv = T01Q720_A3110GuiRemDiv[0] ;
      n3110GuiRemDiv = T01Q720_n3110GuiRemDiv[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3110GuiRemDiv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3110GuiRemDiv), 2, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1244GuiRemCln))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3145GuiRemDivT))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3110GuiRemDiv, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_62( String A1253EmprGuiRem ,
                          int A1243GuiRemCli ,
                          byte A1259AlbDomEnv )
   {
      /* Using cursor T01Q721 */
      pr_default.execute(19, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A1260BusDomEnv = T01Q721_A1260BusDomEnv[0] ;
         n1260BusDomEnv = T01Q721_n1260BusDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
      }
      else
      {
         A1260BusDomEnv = (byte)(0) ;
         n1260BusDomEnv = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1260BusDomEnv, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void gxload_60( String A1253EmprGuiRem ,
                          short A840TrnCod )
   {
      /* Using cursor T01Q722 */
      pr_default.execute(20, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A841TrnNom = T01Q722_A841TrnNom[0] ;
      n841TrnNom = T01Q722_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A3643TrnNif = T01Q722_A3643TrnNif[0] ;
      n3643TrnNif = T01Q722_n3643TrnNif[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3643TrnNif))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void gxload_59( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01Q723 */
      pr_default.execute(21, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A13738TrnCNom)==0) || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01Q723_A841TrnNom[0] ;
      n841TrnNom = T01Q723_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A3643TrnNif = T01Q723_A3643TrnNif[0] ;
      n3643TrnNif = T01Q723_n3643TrnNif[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3643TrnNif))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void gxload_61( byte A3108AlbDivCod )
   {
      /* Using cursor T01Q724 */
      pr_default.execute(22, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         if ( ! ( (0==A3108AlbDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlb", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBDIVCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbDivCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A3109AlbDivAbr = T01Q724_A3109AlbDivAbr[0] ;
      n3109AlbDivAbr = T01Q724_n3109AlbDivAbr[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3109AlbDivAbr))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void getKey1Q73( )
   {
      /* Using cursor T01Q725 */
      pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(23);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01Q73 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01Q73_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1Q73( 56) ;
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T01Q73_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A39AlbProPri = T01Q73_A39AlbProPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         A33AlbProEst = T01Q73_A33AlbProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
         A34AlbProfch = T01Q73_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A4023AlbFecSal = T01Q73_A4023AlbFecSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
         A3865AlbHorSal = T01Q73_A3865AlbHorSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
         A7098AlbUsu = T01Q73_A7098AlbUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
         A3869AlbCliDes = T01Q73_A3869AlbCliDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         A1259AlbDomEnv = T01Q73_A1259AlbDomEnv[0] ;
         n1259AlbDomEnv = T01Q73_n1259AlbDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
         A3868AlbMat = T01Q73_A3868AlbMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3868AlbMat", A3868AlbMat);
         A2242AlbSec = T01Q73_A2242AlbSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
         A5805AlbEnvFtp = T01Q73_A5805AlbEnvFtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A7101AlbLic = T01Q73_A7101AlbLic[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
         A10765AlbProAT = T01Q73_A10765AlbProAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
         A10019AlbHhfm = T01Q73_A10019AlbHhfm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10020AlbGrossT = T01Q73_A10020AlbGrossT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
         A10837AlbTrnNc = T01Q73_A10837AlbTrnNc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10837AlbTrnNc", A10837AlbTrnNc);
         A10017AlbFmd = T01Q73_A10017AlbFmd[0] ;
         n10017AlbFmd = T01Q73_n10017AlbFmd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10017AlbFmd", A10017AlbFmd);
         A10835AlbTrnNm = T01Q73_A10835AlbTrnNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10835AlbTrnNm", A10835AlbTrnNm);
         A10018ALbFmdc = T01Q73_A10018ALbFmdc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10018ALbFmdc", A10018ALbFmdc);
         A10836AlbTrnDm = T01Q73_A10836AlbTrnDm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10836AlbTrnDm", A10836AlbTrnDm);
         A5140AlbMarca = T01Q73_A5140AlbMarca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5140AlbMarca", A5140AlbMarca);
         A3867AlbLocDes = T01Q73_A3867AlbLocDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3867AlbLocDes", GXutil.str( A3867AlbLocDes, 1, 0));
         A3866AlbLocCar = T01Q73_A3866AlbLocCar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3866AlbLocCar", GXutil.str( A3866AlbLocCar, 1, 0));
         A914AlbPObsCon = T01Q73_A914AlbPObsCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         A5141AlbIvaCod = T01Q73_A5141AlbIvaCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5141AlbIvaCod", A5141AlbIvaCod);
         A7987AlbColCa = T01Q73_A7987AlbColCa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7987AlbColCa", A7987AlbColCa);
         A7162AlbDesp = T01Q73_A7162AlbDesp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7162AlbDesp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7162AlbDesp), 6, 0));
         A7986AlbCambio = T01Q73_A7986AlbCambio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7986AlbCambio", GXutil.ltrimstr( A7986AlbCambio, 7, 4));
         A7985AlbTipDoc = T01Q73_A7985AlbTipDoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7985AlbTipDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7985AlbTipDoc), 8, 0));
         A7984AlbMotTr = T01Q73_A7984AlbMotTr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7984AlbMotTr", A7984AlbMotTr);
         A5803AlbTipCal = T01Q73_A5803AlbTipCal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5803AlbTipCal", GXutil.str( A5803AlbTipCal, 1, 0));
         A7988AlbObsCb = T01Q73_A7988AlbObsCb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7988AlbObsCb", A7988AlbObsCb);
         A7102AlbNumT = T01Q73_A7102AlbNumT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7102AlbNumT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7102AlbNumT), 10, 0));
         A7100AlbMarCo = T01Q73_A7100AlbMarCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7100AlbMarCo", A7100AlbMarCo);
         A7099AlbOComp = T01Q73_A7099AlbOComp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7099AlbOComp", A7099AlbOComp);
         A3093AlbDivTCod = T01Q73_A3093AlbDivTCod[0] ;
         n3093AlbDivTCod = T01Q73_n3093AlbDivTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
         A1258GuiRemDom = T01Q73_A1258GuiRemDom[0] ;
         n1258GuiRemDom = T01Q73_n1258GuiRemDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1258GuiRemDom", GXutil.str( A1258GuiRemDom, 1, 0));
         A1253EmprGuiRem = T01Q73_A1253EmprGuiRem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A1243GuiRemCli = T01Q73_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         A840TrnCod = T01Q73_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A3108AlbDivCod = T01Q73_A3108AlbDivCod[0] ;
         n3108AlbDivCod = T01Q73_n3108AlbDivCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1Q73( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey1Q73( ) ;
         }
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey1Q73( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1Q73( ) ;
      if ( RcdFound3 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T01Q726 */
      pr_default.execute(24, new Object[] {Long.valueOf(A30AlbProCod), A396EmprCod});
      if ( (pr_default.getStatus(24) != 101) )
      {
         while ( (pr_default.getStatus(24) != 101) && ( ( T01Q726_A30AlbProCod[0] < A30AlbProCod ) ) && ( GXutil.strcmp(T01Q726_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(24);
         }
         if ( (pr_default.getStatus(24) != 101) && ( ( T01Q726_A30AlbProCod[0] > A30AlbProCod ) ) && ( GXutil.strcmp(T01Q726_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A30AlbProCod = T01Q726_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(24);
   }

   public void move_previous( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T01Q727 */
      pr_default.execute(25, new Object[] {Long.valueOf(A30AlbProCod), A396EmprCod});
      if ( (pr_default.getStatus(25) != 101) )
      {
         while ( (pr_default.getStatus(25) != 101) && ( ( T01Q727_A30AlbProCod[0] > A30AlbProCod ) ) && ( GXutil.strcmp(T01Q727_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(25);
         }
         if ( (pr_default.getStatus(25) != 101) && ( ( T01Q727_A30AlbProCod[0] < A30AlbProCod ) ) && ( GXutil.strcmp(T01Q727_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A30AlbProCod = T01Q727_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(25);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1Q73( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1Q73( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound3 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
            {
               A30AlbProCod = Z30AlbProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1Q73( ) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1Q73( ) ;
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
                  /* Insert record */
                  GX_FocusControl = edtAlbProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1Q73( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
      {
         A30AlbProCod = Z30AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1Q73( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h840TrnCod)==0) )
         {
            A840TrnCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            A13738TrnCNom = h840TrnCod ;
            /* Using cursor T01Q728 */
            pr_default.execute(26, new Object[] {A13738TrnCNom});
            A396EmprCod = T01Q728_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A840TrnCod = T01Q728_A840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A840TrnCod = T01Q728_A840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            if ( ! ( (pr_default.getStatus(26) == 101) ) )
            {
               pr_default.readNext(26);
               if ( ! ( (pr_default.getStatus(26) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTrnCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(26);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01Q72 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z39AlbProPri, T01Q72_A39AlbProPri[0]) != 0 ) || ( Z33AlbProEst != T01Q72_A33AlbProEst[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z34AlbProfch), GXutil.resetTime(T01Q72_A34AlbProfch[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z4023AlbFecSal), GXutil.resetTime(T01Q72_A4023AlbFecSal[0])) ) || ( GXutil.strcmp(Z3865AlbHorSal, T01Q72_A3865AlbHorSal[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7098AlbUsu, T01Q72_A7098AlbUsu[0]) != 0 ) || ( Z3869AlbCliDes != T01Q72_A3869AlbCliDes[0] ) || ( Z1259AlbDomEnv != T01Q72_A1259AlbDomEnv[0] ) || ( GXutil.strcmp(Z3868AlbMat, T01Q72_A3868AlbMat[0]) != 0 ) || ( GXutil.strcmp(Z2242AlbSec, T01Q72_A2242AlbSec[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5805AlbEnvFtp != T01Q72_A5805AlbEnvFtp[0] ) || ( GXutil.strcmp(Z7101AlbLic, T01Q72_A7101AlbLic[0]) != 0 ) || ( GXutil.strcmp(Z10765AlbProAT, T01Q72_A10765AlbProAT[0]) != 0 ) || !( GXutil.dateCompare(Z10019AlbHhfm, T01Q72_A10019AlbHhfm[0]) ) || ( DecimalUtil.compareTo(Z10020AlbGrossT, T01Q72_A10020AlbGrossT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10837AlbTrnNc, T01Q72_A10837AlbTrnNc[0]) != 0 ) || ( GXutil.strcmp(Z10017AlbFmd, T01Q72_A10017AlbFmd[0]) != 0 ) || ( GXutil.strcmp(Z10835AlbTrnNm, T01Q72_A10835AlbTrnNm[0]) != 0 ) || ( GXutil.strcmp(Z10018ALbFmdc, T01Q72_A10018ALbFmdc[0]) != 0 ) || ( GXutil.strcmp(Z10836AlbTrnDm, T01Q72_A10836AlbTrnDm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5140AlbMarca, T01Q72_A5140AlbMarca[0]) != 0 ) || ( Z3867AlbLocDes != T01Q72_A3867AlbLocDes[0] ) || ( Z3866AlbLocCar != T01Q72_A3866AlbLocCar[0] ) || ( Z914AlbPObsCon != T01Q72_A914AlbPObsCon[0] ) || ( GXutil.strcmp(Z5141AlbIvaCod, T01Q72_A5141AlbIvaCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7987AlbColCa, T01Q72_A7987AlbColCa[0]) != 0 ) || ( Z7162AlbDesp != T01Q72_A7162AlbDesp[0] ) || ( DecimalUtil.compareTo(Z7986AlbCambio, T01Q72_A7986AlbCambio[0]) != 0 ) || ( Z7985AlbTipDoc != T01Q72_A7985AlbTipDoc[0] ) || ( GXutil.strcmp(Z7984AlbMotTr, T01Q72_A7984AlbMotTr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5803AlbTipCal != T01Q72_A5803AlbTipCal[0] ) || ( GXutil.strcmp(Z7988AlbObsCb, T01Q72_A7988AlbObsCb[0]) != 0 ) || ( Z7102AlbNumT != T01Q72_A7102AlbNumT[0] ) || ( GXutil.strcmp(Z7100AlbMarCo, T01Q72_A7100AlbMarCo[0]) != 0 ) || ( GXutil.strcmp(Z7099AlbOComp, T01Q72_A7099AlbOComp[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3093AlbDivTCod, T01Q72_A3093AlbDivTCod[0]) != 0 ) || ( Z1258GuiRemDom != T01Q72_A1258GuiRemDom[0] ) || ( GXutil.strcmp(Z1253EmprGuiRem, T01Q72_A1253EmprGuiRem[0]) != 0 ) || ( Z1243GuiRemCli != T01Q72_A1243GuiRemCli[0] ) || ( Z840TrnCod != T01Q72_A840TrnCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3108AlbDivCod != T01Q72_A3108AlbDivCod[0] ) )
         {
            if ( GXutil.strcmp(Z39AlbProPri, T01Q72_A39AlbProPri[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbProPri");
               GXutil.writeLogRaw("Old: ",Z39AlbProPri);
               GXutil.writeLogRaw("Current: ",T01Q72_A39AlbProPri[0]);
            }
            if ( Z33AlbProEst != T01Q72_A33AlbProEst[0] )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbProEst");
               GXutil.writeLogRaw("Old: ",Z33AlbProEst);
               GXutil.writeLogRaw("Current: ",T01Q72_A33AlbProEst[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z34AlbProfch), GXutil.resetTime(T01Q72_A34AlbProfch[0])) ) )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbProfch");
               GXutil.writeLogRaw("Old: ",Z34AlbProfch);
               GXutil.writeLogRaw("Current: ",T01Q72_A34AlbProfch[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4023AlbFecSal), GXutil.resetTime(T01Q72_A4023AlbFecSal[0])) ) )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbFecSal");
               GXutil.writeLogRaw("Old: ",Z4023AlbFecSal);
               GXutil.writeLogRaw("Current: ",T01Q72_A4023AlbFecSal[0]);
            }
            if ( GXutil.strcmp(Z3865AlbHorSal, T01Q72_A3865AlbHorSal[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbHorSal");
               GXutil.writeLogRaw("Old: ",Z3865AlbHorSal);
               GXutil.writeLogRaw("Current: ",T01Q72_A3865AlbHorSal[0]);
            }
            if ( GXutil.strcmp(Z7098AlbUsu, T01Q72_A7098AlbUsu[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbUsu");
               GXutil.writeLogRaw("Old: ",Z7098AlbUsu);
               GXutil.writeLogRaw("Current: ",T01Q72_A7098AlbUsu[0]);
            }
            if ( Z3869AlbCliDes != T01Q72_A3869AlbCliDes[0] )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbCliDes");
               GXutil.writeLogRaw("Old: ",Z3869AlbCliDes);
               GXutil.writeLogRaw("Current: ",T01Q72_A3869AlbCliDes[0]);
            }
            if ( Z1259AlbDomEnv != T01Q72_A1259AlbDomEnv[0] )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbDomEnv");
               GXutil.writeLogRaw("Old: ",Z1259AlbDomEnv);
               GXutil.writeLogRaw("Current: ",T01Q72_A1259AlbDomEnv[0]);
            }
            if ( GXutil.strcmp(Z3868AlbMat, T01Q72_A3868AlbMat[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbMat");
               GXutil.writeLogRaw("Old: ",Z3868AlbMat);
               GXutil.writeLogRaw("Current: ",T01Q72_A3868AlbMat[0]);
            }
            if ( GXutil.strcmp(Z2242AlbSec, T01Q72_A2242AlbSec[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbSec");
               GXutil.writeLogRaw("Old: ",Z2242AlbSec);
               GXutil.writeLogRaw("Current: ",T01Q72_A2242AlbSec[0]);
            }
            if ( Z5805AlbEnvFtp != T01Q72_A5805AlbEnvFtp[0] )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbEnvFtp");
               GXutil.writeLogRaw("Old: ",Z5805AlbEnvFtp);
               GXutil.writeLogRaw("Current: ",T01Q72_A5805AlbEnvFtp[0]);
            }
            if ( GXutil.strcmp(Z7101AlbLic, T01Q72_A7101AlbLic[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbLic");
               GXutil.writeLogRaw("Old: ",Z7101AlbLic);
               GXutil.writeLogRaw("Current: ",T01Q72_A7101AlbLic[0]);
            }
            if ( GXutil.strcmp(Z10765AlbProAT, T01Q72_A10765AlbProAT[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbProAT");
               GXutil.writeLogRaw("Old: ",Z10765AlbProAT);
               GXutil.writeLogRaw("Current: ",T01Q72_A10765AlbProAT[0]);
            }
            if ( !( GXutil.dateCompare(Z10019AlbHhfm, T01Q72_A10019AlbHhfm[0]) ) )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbHhfm");
               GXutil.writeLogRaw("Old: ",Z10019AlbHhfm);
               GXutil.writeLogRaw("Current: ",T01Q72_A10019AlbHhfm[0]);
            }
            if ( DecimalUtil.compareTo(Z10020AlbGrossT, T01Q72_A10020AlbGrossT[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbGrossT");
               GXutil.writeLogRaw("Old: ",Z10020AlbGrossT);
               GXutil.writeLogRaw("Current: ",T01Q72_A10020AlbGrossT[0]);
            }
            if ( GXutil.strcmp(Z10837AlbTrnNc, T01Q72_A10837AlbTrnNc[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbTrnNc");
               GXutil.writeLogRaw("Old: ",Z10837AlbTrnNc);
               GXutil.writeLogRaw("Current: ",T01Q72_A10837AlbTrnNc[0]);
            }
            if ( GXutil.strcmp(Z10017AlbFmd, T01Q72_A10017AlbFmd[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbFmd");
               GXutil.writeLogRaw("Old: ",Z10017AlbFmd);
               GXutil.writeLogRaw("Current: ",T01Q72_A10017AlbFmd[0]);
            }
            if ( GXutil.strcmp(Z10835AlbTrnNm, T01Q72_A10835AlbTrnNm[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbTrnNm");
               GXutil.writeLogRaw("Old: ",Z10835AlbTrnNm);
               GXutil.writeLogRaw("Current: ",T01Q72_A10835AlbTrnNm[0]);
            }
            if ( GXutil.strcmp(Z10018ALbFmdc, T01Q72_A10018ALbFmdc[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"ALbFmdc");
               GXutil.writeLogRaw("Old: ",Z10018ALbFmdc);
               GXutil.writeLogRaw("Current: ",T01Q72_A10018ALbFmdc[0]);
            }
            if ( GXutil.strcmp(Z10836AlbTrnDm, T01Q72_A10836AlbTrnDm[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbTrnDm");
               GXutil.writeLogRaw("Old: ",Z10836AlbTrnDm);
               GXutil.writeLogRaw("Current: ",T01Q72_A10836AlbTrnDm[0]);
            }
            if ( GXutil.strcmp(Z5140AlbMarca, T01Q72_A5140AlbMarca[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbMarca");
               GXutil.writeLogRaw("Old: ",Z5140AlbMarca);
               GXutil.writeLogRaw("Current: ",T01Q72_A5140AlbMarca[0]);
            }
            if ( Z3867AlbLocDes != T01Q72_A3867AlbLocDes[0] )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbLocDes");
               GXutil.writeLogRaw("Old: ",Z3867AlbLocDes);
               GXutil.writeLogRaw("Current: ",T01Q72_A3867AlbLocDes[0]);
            }
            if ( Z3866AlbLocCar != T01Q72_A3866AlbLocCar[0] )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbLocCar");
               GXutil.writeLogRaw("Old: ",Z3866AlbLocCar);
               GXutil.writeLogRaw("Current: ",T01Q72_A3866AlbLocCar[0]);
            }
            if ( Z914AlbPObsCon != T01Q72_A914AlbPObsCon[0] )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbPObsCon");
               GXutil.writeLogRaw("Old: ",Z914AlbPObsCon);
               GXutil.writeLogRaw("Current: ",T01Q72_A914AlbPObsCon[0]);
            }
            if ( GXutil.strcmp(Z5141AlbIvaCod, T01Q72_A5141AlbIvaCod[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbIvaCod");
               GXutil.writeLogRaw("Old: ",Z5141AlbIvaCod);
               GXutil.writeLogRaw("Current: ",T01Q72_A5141AlbIvaCod[0]);
            }
            if ( GXutil.strcmp(Z7987AlbColCa, T01Q72_A7987AlbColCa[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbColCa");
               GXutil.writeLogRaw("Old: ",Z7987AlbColCa);
               GXutil.writeLogRaw("Current: ",T01Q72_A7987AlbColCa[0]);
            }
            if ( Z7162AlbDesp != T01Q72_A7162AlbDesp[0] )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbDesp");
               GXutil.writeLogRaw("Old: ",Z7162AlbDesp);
               GXutil.writeLogRaw("Current: ",T01Q72_A7162AlbDesp[0]);
            }
            if ( DecimalUtil.compareTo(Z7986AlbCambio, T01Q72_A7986AlbCambio[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbCambio");
               GXutil.writeLogRaw("Old: ",Z7986AlbCambio);
               GXutil.writeLogRaw("Current: ",T01Q72_A7986AlbCambio[0]);
            }
            if ( Z7985AlbTipDoc != T01Q72_A7985AlbTipDoc[0] )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbTipDoc");
               GXutil.writeLogRaw("Old: ",Z7985AlbTipDoc);
               GXutil.writeLogRaw("Current: ",T01Q72_A7985AlbTipDoc[0]);
            }
            if ( GXutil.strcmp(Z7984AlbMotTr, T01Q72_A7984AlbMotTr[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbMotTr");
               GXutil.writeLogRaw("Old: ",Z7984AlbMotTr);
               GXutil.writeLogRaw("Current: ",T01Q72_A7984AlbMotTr[0]);
            }
            if ( Z5803AlbTipCal != T01Q72_A5803AlbTipCal[0] )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbTipCal");
               GXutil.writeLogRaw("Old: ",Z5803AlbTipCal);
               GXutil.writeLogRaw("Current: ",T01Q72_A5803AlbTipCal[0]);
            }
            if ( GXutil.strcmp(Z7988AlbObsCb, T01Q72_A7988AlbObsCb[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbObsCb");
               GXutil.writeLogRaw("Old: ",Z7988AlbObsCb);
               GXutil.writeLogRaw("Current: ",T01Q72_A7988AlbObsCb[0]);
            }
            if ( Z7102AlbNumT != T01Q72_A7102AlbNumT[0] )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbNumT");
               GXutil.writeLogRaw("Old: ",Z7102AlbNumT);
               GXutil.writeLogRaw("Current: ",T01Q72_A7102AlbNumT[0]);
            }
            if ( GXutil.strcmp(Z7100AlbMarCo, T01Q72_A7100AlbMarCo[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbMarCo");
               GXutil.writeLogRaw("Old: ",Z7100AlbMarCo);
               GXutil.writeLogRaw("Current: ",T01Q72_A7100AlbMarCo[0]);
            }
            if ( GXutil.strcmp(Z7099AlbOComp, T01Q72_A7099AlbOComp[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbOComp");
               GXutil.writeLogRaw("Old: ",Z7099AlbOComp);
               GXutil.writeLogRaw("Current: ",T01Q72_A7099AlbOComp[0]);
            }
            if ( GXutil.strcmp(Z3093AlbDivTCod, T01Q72_A3093AlbDivTCod[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbDivTCod");
               GXutil.writeLogRaw("Old: ",Z3093AlbDivTCod);
               GXutil.writeLogRaw("Current: ",T01Q72_A3093AlbDivTCod[0]);
            }
            if ( Z1258GuiRemDom != T01Q72_A1258GuiRemDom[0] )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"GuiRemDom");
               GXutil.writeLogRaw("Old: ",Z1258GuiRemDom);
               GXutil.writeLogRaw("Current: ",T01Q72_A1258GuiRemDom[0]);
            }
            if ( GXutil.strcmp(Z1253EmprGuiRem, T01Q72_A1253EmprGuiRem[0]) != 0 )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"EmprGuiRem");
               GXutil.writeLogRaw("Old: ",Z1253EmprGuiRem);
               GXutil.writeLogRaw("Current: ",T01Q72_A1253EmprGuiRem[0]);
            }
            if ( Z1243GuiRemCli != T01Q72_A1243GuiRemCli[0] )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"GuiRemCli");
               GXutil.writeLogRaw("Old: ",Z1243GuiRemCli);
               GXutil.writeLogRaw("Current: ",T01Q72_A1243GuiRemCli[0]);
            }
            if ( Z840TrnCod != T01Q72_A840TrnCod[0] )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01Q72_A840TrnCod[0]);
            }
            if ( Z3108AlbDivCod != T01Q72_A3108AlbDivCod[0] )
            {
               GXutil.writeLogln("calprd_trn:[seudo value changed for attri]"+"AlbDivCod");
               GXutil.writeLogRaw("Old: ",Z3108AlbDivCod);
               GXutil.writeLogRaw("Current: ",T01Q72_A3108AlbDivCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1Q73( )
   {
      beforeValidate1Q73( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1Q73( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1Q73( 0) ;
         checkOptimisticConcurrency1Q73( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1Q73( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1Q73( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01Q729 */
                  pr_default.execute(27, new Object[] {Long.valueOf(A30AlbProCod), A39AlbProPri, Byte.valueOf(A33AlbProEst), A34AlbProfch, A4023AlbFecSal, A3865AlbHorSal, A7098AlbUsu, Integer.valueOf(A3869AlbCliDes), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv), A3868AlbMat, A2242AlbSec, Byte.valueOf(A5805AlbEnvFtp), A7101AlbLic, A10765AlbProAT, A10019AlbHhfm, A10020AlbGrossT, A10837AlbTrnNc, Boolean.valueOf(n10017AlbFmd), A10017AlbFmd, A10835AlbTrnNm, A10018ALbFmdc, A10836AlbTrnDm, A5140AlbMarca, Byte.valueOf(A3867AlbLocDes), Byte.valueOf(A3866AlbLocCar), Byte.valueOf(A914AlbPObsCon), A5141AlbIvaCod, A7987AlbColCa, Integer.valueOf(A7162AlbDesp), A7986AlbCambio, Integer.valueOf(A7985AlbTipDoc), A7984AlbMotTr, Byte.valueOf(A5803AlbTipCal), A7988AlbObsCb, Long.valueOf(A7102AlbNumT), A7100AlbMarCo, A7099AlbOComp, Boolean.valueOf(n3093AlbDivTCod), A3093AlbDivTCod, Boolean.valueOf(n1258GuiRemDom), Byte.valueOf(A1258GuiRemDom), A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), A396EmprCod, Short.valueOf(A840TrnCod), Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                  if ( (pr_default.getStatus(27) == 1) )
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
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1Q70( ) ;
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
            load1Q73( ) ;
         }
         endLevel1Q73( ) ;
      }
      closeExtendedTableCursors1Q73( ) ;
   }

   public void update1Q73( )
   {
      beforeValidate1Q73( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1Q73( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1Q73( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1Q73( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1Q73( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01Q730 */
                  pr_default.execute(28, new Object[] {A39AlbProPri, Byte.valueOf(A33AlbProEst), A34AlbProfch, A4023AlbFecSal, A3865AlbHorSal, A7098AlbUsu, Integer.valueOf(A3869AlbCliDes), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv), A3868AlbMat, A2242AlbSec, Byte.valueOf(A5805AlbEnvFtp), A7101AlbLic, A10765AlbProAT, A10019AlbHhfm, A10020AlbGrossT, A10837AlbTrnNc, Boolean.valueOf(n10017AlbFmd), A10017AlbFmd, A10835AlbTrnNm, A10018ALbFmdc, A10836AlbTrnDm, A5140AlbMarca, Byte.valueOf(A3867AlbLocDes), Byte.valueOf(A3866AlbLocCar), Byte.valueOf(A914AlbPObsCon), A5141AlbIvaCod, A7987AlbColCa, Integer.valueOf(A7162AlbDesp), A7986AlbCambio, Integer.valueOf(A7985AlbTipDoc), A7984AlbMotTr, Byte.valueOf(A5803AlbTipCal), A7988AlbObsCb, Long.valueOf(A7102AlbNumT), A7100AlbMarCo, A7099AlbOComp, Boolean.valueOf(n3093AlbDivTCod), A3093AlbDivTCod, Boolean.valueOf(n1258GuiRemDom), Byte.valueOf(A1258GuiRemDom), A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Short.valueOf(A840TrnCod), Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                  if ( (pr_default.getStatus(28) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1Q73( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
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
         endLevel1Q73( ) ;
      }
      closeExtendedTableCursors1Q73( ) ;
   }

   public void deferredUpdate1Q73( )
   {
   }

   public void delete( )
   {
      beforeValidate1Q73( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1Q73( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1Q73( ) ;
         afterConfirm1Q73( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1Q73( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01Q731 */
               pr_default.execute(29, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
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
      sMode3 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1Q73( ) ;
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1Q73( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ! (GXutil.strcmp("", A7101AlbLic)==0) && ( AV24FirmaD == 1 ) && ( isIns( )  || isUpd( )  || isDlt( )  ) && ( AV25avisar == 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Este guia foi comunicada à AT", ""), 1, "");
            AnyError = (short)(1) ;
         }
         /* Using cursor T01Q732 */
         pr_default.execute(30, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
         A3109AlbDivAbr = T01Q732_A3109AlbDivAbr[0] ;
         n3109AlbDivAbr = T01Q732_n3109AlbDivAbr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
         pr_default.close(30);
         /* Using cursor T01Q733 */
         pr_default.execute(31, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A1244GuiRemCln = T01Q733_A1244GuiRemCln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         A3145GuiRemDivT = T01Q733_A3145GuiRemDivT[0] ;
         n3145GuiRemDivT = T01Q733_n3145GuiRemDivT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", A3145GuiRemDivT);
         A3110GuiRemDiv = T01Q733_A3110GuiRemDiv[0] ;
         n3110GuiRemDiv = T01Q733_n3110GuiRemDiv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3110GuiRemDiv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3110GuiRemDiv), 2, 0));
         pr_default.close(31);
         /* Using cursor T01Q734 */
         pr_default.execute(32, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
         A841TrnNom = T01Q734_A841TrnNom[0] ;
         n841TrnNom = T01Q734_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A3643TrnNif = T01Q734_A3643TrnNif[0] ;
         n3643TrnNif = T01Q734_n3643TrnNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
         pr_default.close(32);
         /* Using cursor T01Q735 */
         pr_default.execute(33, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            A1260BusDomEnv = T01Q735_A1260BusDomEnv[0] ;
            n1260BusDomEnv = T01Q735_n1260BusDomEnv[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
         }
         else
         {
            A1260BusDomEnv = (byte)(0) ;
            n1260BusDomEnv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
         }
         pr_default.close(33);
         /* Using cursor T01Q736 */
         pr_default.execute(34, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
         A841TrnNom = T01Q736_A841TrnNom[0] ;
         n841TrnNom = T01Q736_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A3643TrnNif = T01Q736_A3643TrnNif[0] ;
         n3643TrnNif = T01Q736_n3643TrnNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
         pr_default.close(34);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01Q737 */
         pr_default.execute(35, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Observaciones ALBARAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01Q738 */
         pr_default.execute(36, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Hdrs Albaran", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01Q739 */
         pr_default.execute(37, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CNOTRET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01Q740 */
         pr_default.execute(38, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01Q741 */
         pr_default.execute(39, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
      }
   }

   public void endLevel1Q73( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1Q73( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "calprd_trn");
         if ( AnyError == 0 )
         {
            confirmValues1Q70( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "calprd_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1Q73( )
   {
      /* Scan By routine */
      /* Using cursor T01Q742 */
      pr_default.execute(40, new Object[] {A396EmprCod});
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T01Q742_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1Q73( )
   {
      /* Scan next routine */
      pr_default.readNext(40);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T01Q742_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
   }

   public void scanEnd1Q73( )
   {
      pr_default.close(40);
   }

   public void afterConfirm1Q73( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1Q73( )
   {
      /* Before Insert Rules */
      if ( AV31Ctrlf == 1 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A39AlbProPri ;
         GXv_int6[0] = (byte)(1) ;
         GXv_date10[0] = AV28Fch ;
         GXv_int8[0] = (int)(AV29AlbLast) ;
         GXv_date11[0] = A34AlbProfch ;
         GXv_char2[0] = AV27Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_date10, GXv_int8, GXv_date11, GXv_char2) ;
         calprd_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         calprd_trn_impl.this.A39AlbProPri = GXv_char3[0] ;
         calprd_trn_impl.this.AV28Fch = GXv_date10[0] ;
         calprd_trn_impl.this.AV29AlbLast = GXv_int8[0] ;
         calprd_trn_impl.this.A34AlbProfch = GXv_date11[0] ;
         calprd_trn_impl.this.AV27Msg_f = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV28Fch", localUtil.format(AV28Fch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV29AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29AlbLast), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV27Msg_f", AV27Msg_f);
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A34AlbProfch)) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor na data, incorreto", ""), 1, "ALBPROFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProfch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (0==A1260BusDomEnv) && ! (0==A1259AlbDomEnv) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Domicilio envio inexistente", ""), 1, "ALBDOMENV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbDomEnv_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! (GXutil.strcmp("", AV27Msg_f)==0) )
      {
         httpContext.GX_msglist.addItem(AV27Msg_f, 1, "");
         AnyError = (short)(1) ;
      }
      if ( (0==A30AlbProCod) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         GXv_int8[0] = (int)(A30AlbProCod) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV26ContCod, GXv_int8) ;
         calprd_trn_impl.this.A30AlbProCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
   }

   public void beforeUpdate1Q73( )
   {
      /* Before Update Rules */
      if ( AV31Ctrlf == 1 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A39AlbProPri ;
         GXv_int6[0] = (byte)(1) ;
         GXv_date11[0] = AV28Fch ;
         GXv_int8[0] = (int)(AV29AlbLast) ;
         GXv_date10[0] = A34AlbProfch ;
         GXv_char2[0] = AV27Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_date11, GXv_int8, GXv_date10, GXv_char2) ;
         calprd_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         calprd_trn_impl.this.A39AlbProPri = GXv_char3[0] ;
         calprd_trn_impl.this.AV28Fch = GXv_date11[0] ;
         calprd_trn_impl.this.AV29AlbLast = GXv_int8[0] ;
         calprd_trn_impl.this.A34AlbProfch = GXv_date10[0] ;
         calprd_trn_impl.this.AV27Msg_f = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV28Fch", localUtil.format(AV28Fch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV29AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29AlbLast), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV27Msg_f", AV27Msg_f);
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A34AlbProfch)) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor na data, incorreto", ""), 1, "ALBPROFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProfch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (0==A1260BusDomEnv) && ! (0==A1259AlbDomEnv) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Domicilio envio inexistente", ""), 1, "ALBDOMENV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbDomEnv_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! (GXutil.strcmp("", AV27Msg_f)==0) )
      {
         httpContext.GX_msglist.addItem(AV27Msg_f, 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void beforeDelete1Q73( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1Q73( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1Q73( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1Q73( )
   {
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      cmbAlbProPri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProPri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProPri.getEnabled(), 5, 0), true);
      cmbAlbProEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProEst.getEnabled(), 5, 0), true);
      cmbAlbSec.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbSec.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbSec.getEnabled(), 5, 0), true);
      edtAlbProfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProfch_Enabled), 5, 0), true);
      edtAlbFecSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbFecSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbFecSal_Enabled), 5, 0), true);
      edtAlbHorSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHorSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHorSal_Enabled), 5, 0), true);
      edtAlbUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbUsu_Enabled), 5, 0), true);
      edtGuiRemCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      edtAlbCliDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCliDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCliDes_Enabled), 5, 0), true);
      edtAlbDomEnv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDomEnv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDomEnv_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtAlbMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMat_Enabled), 5, 0), true);
      cmbAlbEnvFtp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbEnvFtp.getEnabled(), 5, 0), true);
      edtAlbLic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLic_Enabled), 5, 0), true);
      cmbAlbProAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProAT.getEnabled(), 5, 0), true);
      edtAlbHhfm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHhfm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHhfm_Enabled), 5, 0), true);
      edtAlbGrossT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbGrossT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbGrossT_Enabled), 5, 0), true);
      edtAlbFmd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbFmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbFmd_Enabled), 5, 0), true);
      edtAlbTrnNm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnNm_Enabled), 5, 0), true);
      edtAlbTrnNc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnNc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnNc_Enabled), 5, 0), true);
      edtAlbTrnDm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnDm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnDm_Enabled), 5, 0), true);
      edtALbFmdc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtALbFmdc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALbFmdc_Enabled), 5, 0), true);
      edtAlbLocDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLocDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLocDes_Enabled), 5, 0), true);
      edtAlbLocCar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLocCar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLocCar_Enabled), 5, 0), true);
      edtAlbPObsCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsCon_Enabled), 5, 0), true);
      edtAlbIvaCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbIvaCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbIvaCod_Enabled), 5, 0), true);
      edtAlbColCa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColCa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColCa_Enabled), 5, 0), true);
      edtAlbDesp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDesp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDesp_Enabled), 5, 0), true);
      edtAlbCambio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCambio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCambio_Enabled), 5, 0), true);
      edtAlbTipDoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTipDoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipDoc_Enabled), 5, 0), true);
      edtAlbMotTr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMotTr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMotTr_Enabled), 5, 0), true);
      edtAlbTipCal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTipCal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipCal_Enabled), 5, 0), true);
      edtAlbObsCb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbObsCb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbObsCb_Enabled), 5, 0), true);
      edtAlbNumT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumT_Enabled), 5, 0), true);
      edtAlbMarCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMarCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMarCo_Enabled), 5, 0), true);
      edtAlbOComp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbOComp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbOComp_Enabled), 5, 0), true);
      edtTrnNif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNif_Enabled), 5, 0), true);
      cmbAlbDivTCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbDivTCod.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbDivTCod.getEnabled(), 5, 0), true);
      edtAlbDivAbr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDivAbr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivAbr_Enabled), 5, 0), true);
      edtAlbDivCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivCod_Enabled), 5, 0), true);
      edtBusDomEnv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBusDomEnv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBusDomEnv_Enabled), 5, 0), true);
      edtEmprGuiRem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprGuiRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprGuiRem_Enabled), 5, 0), true);
      edtGuiRemDom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemDom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemDom_Enabled), 5, 0), true);
      cmbGuiRemDivT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbGuiRemDivT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbGuiRemDivT.getEnabled(), 5, 0), true);
      edtGuiRemDiv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemDiv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemDiv_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbMarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMarca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMarca_Enabled), 5, 0), true);
      edtGuiRemCln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCln_Enabled), 5, 0), true);
      edtTrnNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1Q73( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1Q70( )
   {
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.calprd_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV20AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV21AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV26ContCod))}, new String[] {"Gx_mode","EmprCod","AlbProCod","AlbProPri","AlbSec","ContCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"Calprd_TRN");
      forbiddenHiddens.add("AlbHhfm", localUtil.format( A10019AlbHhfm, "99/99/99 99:99"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("AlbProEst", localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9"));
      forbiddenHiddens.add("AlbUsu", GXutil.rtrim( localUtil.format( A7098AlbUsu, "")));
      forbiddenHiddens.add("AlbEnvFtp", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9"));
      forbiddenHiddens.add("AlbLic", GXutil.rtrim( localUtil.format( A7101AlbLic, "")));
      forbiddenHiddens.add("AlbProAT", GXutil.rtrim( localUtil.format( A10765AlbProAT, "")));
      forbiddenHiddens.add("AlbGrossT", localUtil.format( A10020AlbGrossT, "ZZZZZZZZZ9.99"));
      forbiddenHiddens.add("AlbFmd", GXutil.rtrim( localUtil.format( A10017AlbFmd, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("calprd_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z39AlbProPri", GXutil.rtrim( Z39AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z33AlbProEst", GXutil.ltrim( localUtil.ntoc( Z33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z34AlbProfch", localUtil.dtoc( Z34AlbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4023AlbFecSal", localUtil.dtoc( Z4023AlbFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3865AlbHorSal", GXutil.rtrim( Z3865AlbHorSal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7098AlbUsu", GXutil.rtrim( Z7098AlbUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3869AlbCliDes", GXutil.ltrim( localUtil.ntoc( Z3869AlbCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1259AlbDomEnv", GXutil.ltrim( localUtil.ntoc( Z1259AlbDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3868AlbMat", GXutil.rtrim( Z3868AlbMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2242AlbSec", GXutil.rtrim( Z2242AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5805AlbEnvFtp", GXutil.ltrim( localUtil.ntoc( Z5805AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7101AlbLic", GXutil.rtrim( Z7101AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10765AlbProAT", GXutil.rtrim( Z10765AlbProAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10019AlbHhfm", localUtil.ttoc( Z10019AlbHhfm, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10020AlbGrossT", GXutil.ltrim( localUtil.ntoc( Z10020AlbGrossT, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10837AlbTrnNc", GXutil.rtrim( Z10837AlbTrnNc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10017AlbFmd", Z10017AlbFmd);
      app.GxWebStd.gx_hidden_field( httpContext, "Z10835AlbTrnNm", GXutil.rtrim( Z10835AlbTrnNm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10018ALbFmdc", GXutil.rtrim( Z10018ALbFmdc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10836AlbTrnDm", GXutil.rtrim( Z10836AlbTrnDm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5140AlbMarca", GXutil.rtrim( Z5140AlbMarca));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3867AlbLocDes", GXutil.ltrim( localUtil.ntoc( Z3867AlbLocDes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3866AlbLocCar", GXutil.ltrim( localUtil.ntoc( Z3866AlbLocCar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z914AlbPObsCon", GXutil.ltrim( localUtil.ntoc( Z914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5141AlbIvaCod", GXutil.rtrim( Z5141AlbIvaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7987AlbColCa", GXutil.rtrim( Z7987AlbColCa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7162AlbDesp", GXutil.ltrim( localUtil.ntoc( Z7162AlbDesp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7986AlbCambio", GXutil.ltrim( localUtil.ntoc( Z7986AlbCambio, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7985AlbTipDoc", GXutil.ltrim( localUtil.ntoc( Z7985AlbTipDoc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7984AlbMotTr", GXutil.rtrim( Z7984AlbMotTr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5803AlbTipCal", GXutil.ltrim( localUtil.ntoc( Z5803AlbTipCal, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7988AlbObsCb", GXutil.rtrim( Z7988AlbObsCb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7102AlbNumT", GXutil.ltrim( localUtil.ntoc( Z7102AlbNumT, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7100AlbMarCo", GXutil.rtrim( Z7100AlbMarCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7099AlbOComp", GXutil.rtrim( Z7099AlbOComp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3093AlbDivTCod", GXutil.rtrim( Z3093AlbDivTCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1258GuiRemDom", GXutil.ltrim( localUtil.ntoc( Z1258GuiRemDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1253EmprGuiRem", GXutil.rtrim( Z1253EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( Z1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3108AlbDivCod", GXutil.ltrim( localUtil.ntoc( Z3108AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N3108AlbDivCod", GXutil.ltrim( localUtil.ntoc( A3108AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N1253EmprGuiRem", GXutil.rtrim( A1253EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV13TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV13TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV13TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROPRI", GXutil.rtrim( AV20AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20AlbProPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBSEC", GXutil.rtrim( AV21AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21AlbSec, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV11AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11AlbProCod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_GUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV15Insert_GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCGUIREMCLI", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRNCOD", GXutil.ltrim( localUtil.ntoc( AV16Insert_TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCTRNCOD", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_ALBDIVCOD", GXutil.ltrim( localUtil.ntoc( AV17Insert_AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_EMPRGUIREM", GXutil.rtrim( AV18Insert_EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCALBCLIDES", GXutil.ltrim( localUtil.ntoc( A3869AlbCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV9UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTCOD", GXutil.rtrim( AV26ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ContCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCTRLF", GXutil.ltrim( localUtil.ntoc( AV31Ctrlf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_F", AV27Msg_f);
      app.GxWebStd.gx_hidden_field( httpContext, "vALBLAST", GXutil.ltrim( localUtil.ntoc( AV29AlbLast, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFCH", localUtil.dtoc( AV28Fch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV24FirmaD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAVISAR", GXutil.ltrim( localUtil.ntoc( AV25avisar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
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
      return formatLink("app.calprd_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV20AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV21AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV26ContCod))}, new String[] {"Gx_mode","EmprCod","AlbProCod","AlbProPri","AlbSec","ContCod"})  ;
   }

   public String getPgmname( )
   {
      return "Calprd_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Albaran de Produccion", "") ;
   }

   public void initializeNonKey1Q73( )
   {
      h1243GuiRemCli = "" ;
      h840TrnCod = "" ;
      A3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
      A1253EmprGuiRem = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
      AV27Msg_f = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Msg_f", AV27Msg_f);
      AV29AlbLast = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29AlbLast), 10, 0));
      AV28Fch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Fch", localUtil.format(AV28Fch, "99/99/99"));
      A1260BusDomEnv = (byte)(0) ;
      n1260BusDomEnv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
      A39AlbProPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      A33AlbProEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
      A3865AlbHorSal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3865AlbHorSal", A3865AlbHorSal);
      A1244GuiRemCln = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      A1259AlbDomEnv = (byte)(0) ;
      n1259AlbDomEnv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A3868AlbMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3868AlbMat", A3868AlbMat);
      A2242AlbSec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
      A5805AlbEnvFtp = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      A7101AlbLic = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
      A10020AlbGrossT = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10020AlbGrossT", GXutil.ltrimstr( A10020AlbGrossT, 13, 2));
      A10837AlbTrnNc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10837AlbTrnNc", A10837AlbTrnNc);
      A10017AlbFmd = "" ;
      n10017AlbFmd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10017AlbFmd", A10017AlbFmd);
      A10835AlbTrnNm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10835AlbTrnNm", A10835AlbTrnNm);
      A10018ALbFmdc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10018ALbFmdc", A10018ALbFmdc);
      A10836AlbTrnDm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10836AlbTrnDm", A10836AlbTrnDm);
      A5140AlbMarca = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5140AlbMarca", A5140AlbMarca);
      A3867AlbLocDes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3867AlbLocDes", GXutil.str( A3867AlbLocDes, 1, 0));
      A3866AlbLocCar = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3866AlbLocCar", GXutil.str( A3866AlbLocCar, 1, 0));
      A914AlbPObsCon = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      A5141AlbIvaCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5141AlbIvaCod", A5141AlbIvaCod);
      A7987AlbColCa = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7987AlbColCa", A7987AlbColCa);
      A7162AlbDesp = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7162AlbDesp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7162AlbDesp), 6, 0));
      A7986AlbCambio = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A7986AlbCambio", GXutil.ltrimstr( A7986AlbCambio, 7, 4));
      A7985AlbTipDoc = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7985AlbTipDoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7985AlbTipDoc), 8, 0));
      A7984AlbMotTr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7984AlbMotTr", A7984AlbMotTr);
      A5803AlbTipCal = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5803AlbTipCal", GXutil.str( A5803AlbTipCal, 1, 0));
      A7988AlbObsCb = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7988AlbObsCb", A7988AlbObsCb);
      A7102AlbNumT = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7102AlbNumT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7102AlbNumT), 10, 0));
      A7100AlbMarCo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7100AlbMarCo", A7100AlbMarCo);
      A7099AlbOComp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7099AlbOComp", A7099AlbOComp);
      A3643TrnNif = "" ;
      n3643TrnNif = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", A3643TrnNif);
      A3093AlbDivTCod = "" ;
      n3093AlbDivTCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
      A3109AlbDivAbr = "" ;
      n3109AlbDivAbr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
      A1258GuiRemDom = (byte)(0) ;
      n1258GuiRemDom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1258GuiRemDom", GXutil.str( A1258GuiRemDom, 1, 0));
      A3145GuiRemDivT = "" ;
      n3145GuiRemDivT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", A3145GuiRemDivT);
      A3110GuiRemDiv = (byte)(0) ;
      n3110GuiRemDiv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3110GuiRemDiv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3110GuiRemDiv), 2, 0));
      A34AlbProfch = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A4023AlbFecSal = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
      A7098AlbUsu = AV9UsurCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
      h3869AlbCliDes = "" ;
      A10765AlbProAT = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
      A10019AlbHhfm = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Z39AlbProPri = "" ;
      Z33AlbProEst = (byte)(0) ;
      Z34AlbProfch = GXutil.nullDate() ;
      Z4023AlbFecSal = GXutil.nullDate() ;
      Z3865AlbHorSal = "" ;
      Z7098AlbUsu = "" ;
      Z3869AlbCliDes = 0 ;
      Z1259AlbDomEnv = (byte)(0) ;
      Z3868AlbMat = "" ;
      Z2242AlbSec = "" ;
      Z5805AlbEnvFtp = (byte)(0) ;
      Z7101AlbLic = "" ;
      Z10765AlbProAT = "" ;
      Z10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      Z10020AlbGrossT = DecimalUtil.ZERO ;
      Z10837AlbTrnNc = "" ;
      Z10017AlbFmd = "" ;
      Z10835AlbTrnNm = "" ;
      Z10018ALbFmdc = "" ;
      Z10836AlbTrnDm = "" ;
      Z5140AlbMarca = "" ;
      Z3867AlbLocDes = (byte)(0) ;
      Z3866AlbLocCar = (byte)(0) ;
      Z914AlbPObsCon = (byte)(0) ;
      Z5141AlbIvaCod = "" ;
      Z7987AlbColCa = "" ;
      Z7162AlbDesp = 0 ;
      Z7986AlbCambio = DecimalUtil.ZERO ;
      Z7985AlbTipDoc = 0 ;
      Z7984AlbMotTr = "" ;
      Z5803AlbTipCal = (byte)(0) ;
      Z7988AlbObsCb = "" ;
      Z7102AlbNumT = 0 ;
      Z7100AlbMarCo = "" ;
      Z7099AlbOComp = "" ;
      Z3093AlbDivTCod = "" ;
      Z1258GuiRemDom = (byte)(0) ;
      Z1253EmprGuiRem = "" ;
      Z1243GuiRemCli = 0 ;
      Z840TrnCod = (short)(0) ;
      Z3108AlbDivCod = (byte)(0) ;
   }

   public void initAll1Q73( )
   {
      A30AlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      initializeNonKey1Q73( ) ;
   }

   public void standaloneModalInsert( )
   {
      A34AlbProfch = i34AlbProfch ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A4023AlbFecSal = i4023AlbFecSal ;
      httpContext.ajax_rsp_assign_attri("", false, "A4023AlbFecSal", localUtil.format(A4023AlbFecSal, "99/99/99"));
      A7098AlbUsu = i7098AlbUsu ;
      httpContext.ajax_rsp_assign_attri("", false, "A7098AlbUsu", A7098AlbUsu);
      A10765AlbProAT = i10765AlbProAT ;
      httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
      A10019AlbHhfm = i10019AlbHhfm ;
      httpContext.ajax_rsp_assign_attri("", false, "A10019AlbHhfm", localUtil.ttoc( A10019AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415111876", true, true);
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
      httpContext.AddJavascriptSource("calprd_trn.js", "?202682415111877", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      cmbAlbProPri.setInternalname( "ALBPROPRI" );
      cmbAlbProEst.setInternalname( "ALBPROEST" );
      cmbAlbSec.setInternalname( "ALBSEC" );
      divAlbsec_cell_Internalname = "ALBSEC_CELL" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtAlbProfch_Internalname = "ALBPROFCH" ;
      edtAlbFecSal_Internalname = "ALBFECSAL" ;
      edtAlbHorSal_Internalname = "ALBHORSAL" ;
      edtAlbUsu_Internalname = "ALBUSU" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtGuiRemCli_Internalname = "GUIREMCLI" ;
      edtAlbCliDes_Internalname = "ALBCLIDES" ;
      edtAlbDomEnv_Internalname = "ALBDOMENV" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      edtAlbMat_Internalname = "ALBMAT" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP" );
      edtAlbLic_Internalname = "ALBLIC" ;
      cmbAlbProAT.setInternalname( "ALBPROAT" );
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      edtAlbHhfm_Internalname = "ALBHHFM" ;
      edtAlbGrossT_Internalname = "ALBGROSST" ;
      edtAlbFmd_Internalname = "ALBFMD" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      grpUnnamedgroup8_Internalname = "UNNAMEDGROUP8" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtAlbTrnNm_Internalname = "ALBTRNNM" ;
      divAlbtrnnm_cell_Internalname = "ALBTRNNM_CELL" ;
      edtAlbTrnNc_Internalname = "ALBTRNNC" ;
      divAlbtrnnc_cell_Internalname = "ALBTRNNC_CELL" ;
      edtAlbTrnDm_Internalname = "ALBTRNDM" ;
      divAlbtrndm_cell_Internalname = "ALBTRNDM_CELL" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtALbFmdc_Internalname = "ALBFMDC" ;
      edtAlbLocDes_Internalname = "ALBLOCDES" ;
      edtAlbLocCar_Internalname = "ALBLOCCAR" ;
      edtAlbPObsCon_Internalname = "ALBPOBSCON" ;
      edtAlbIvaCod_Internalname = "ALBIVACOD" ;
      edtAlbColCa_Internalname = "ALBCOLCA" ;
      edtAlbDesp_Internalname = "ALBDESP" ;
      edtAlbCambio_Internalname = "ALBCAMBIO" ;
      edtAlbTipDoc_Internalname = "ALBTIPDOC" ;
      edtAlbMotTr_Internalname = "ALBMOTTR" ;
      edtAlbTipCal_Internalname = "ALBTIPCAL" ;
      edtAlbObsCb_Internalname = "ALBOBSCB" ;
      edtAlbNumT_Internalname = "ALBNUMT" ;
      edtAlbMarCo_Internalname = "ALBMARCO" ;
      edtAlbOComp_Internalname = "ALBOCOMP" ;
      edtTrnNif_Internalname = "TRNNIF" ;
      cmbAlbDivTCod.setInternalname( "ALBDIVTCOD" );
      edtAlbDivAbr_Internalname = "ALBDIVABR" ;
      edtAlbDivCod_Internalname = "ALBDIVCOD" ;
      edtBusDomEnv_Internalname = "BUSDOMENV" ;
      edtEmprGuiRem_Internalname = "EMPRGUIREM" ;
      edtGuiRemDom_Internalname = "GUIREMDOM" ;
      cmbGuiRemDivT.setInternalname( "GUIREMDIVT" );
      edtGuiRemDiv_Internalname = "GUIREMDIV" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtAlbMarca_Internalname = "ALBMARCA" ;
      edtGuiRemCln_Internalname = "GUIREMCLN" ;
      edtTrnNom_Internalname = "TRNNOM" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
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
      Form.setCaption( httpContext.getMessage( "Albaran de Produccion", "") );
      edtTrnNom_Jsonclick = "" ;
      edtTrnNom_Enabled = 0 ;
      edtTrnNom_Visible = 1 ;
      edtGuiRemCln_Jsonclick = "" ;
      edtGuiRemCln_Enabled = 0 ;
      edtGuiRemCln_Visible = 1 ;
      edtAlbMarca_Jsonclick = "" ;
      edtAlbMarca_Enabled = 1 ;
      edtAlbMarca_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtGuiRemDiv_Jsonclick = "" ;
      edtGuiRemDiv_Enabled = 0 ;
      cmbGuiRemDivT.setJsonclick( "" );
      cmbGuiRemDivT.setEnabled( 0 );
      edtGuiRemDom_Jsonclick = "" ;
      edtGuiRemDom_Enabled = 1 ;
      edtEmprGuiRem_Jsonclick = "" ;
      edtEmprGuiRem_Enabled = 1 ;
      edtBusDomEnv_Jsonclick = "" ;
      edtBusDomEnv_Enabled = 0 ;
      edtAlbDivCod_Jsonclick = "" ;
      edtAlbDivCod_Enabled = 1 ;
      edtAlbDivAbr_Jsonclick = "" ;
      edtAlbDivAbr_Enabled = 0 ;
      cmbAlbDivTCod.setJsonclick( "" );
      cmbAlbDivTCod.setEnabled( 1 );
      edtTrnNif_Jsonclick = "" ;
      edtTrnNif_Enabled = 0 ;
      edtAlbOComp_Jsonclick = "" ;
      edtAlbOComp_Enabled = 1 ;
      edtAlbMarCo_Jsonclick = "" ;
      edtAlbMarCo_Enabled = 1 ;
      edtAlbNumT_Jsonclick = "" ;
      edtAlbNumT_Enabled = 1 ;
      edtAlbObsCb_Jsonclick = "" ;
      edtAlbObsCb_Enabled = 1 ;
      edtAlbTipCal_Jsonclick = "" ;
      edtAlbTipCal_Enabled = 1 ;
      edtAlbMotTr_Jsonclick = "" ;
      edtAlbMotTr_Enabled = 1 ;
      edtAlbTipDoc_Jsonclick = "" ;
      edtAlbTipDoc_Enabled = 1 ;
      edtAlbCambio_Jsonclick = "" ;
      edtAlbCambio_Enabled = 1 ;
      edtAlbDesp_Jsonclick = "" ;
      edtAlbDesp_Enabled = 1 ;
      edtAlbColCa_Jsonclick = "" ;
      edtAlbColCa_Enabled = 1 ;
      edtAlbIvaCod_Jsonclick = "" ;
      edtAlbIvaCod_Enabled = 1 ;
      edtAlbPObsCon_Jsonclick = "" ;
      edtAlbPObsCon_Enabled = 1 ;
      edtAlbLocCar_Jsonclick = "" ;
      edtAlbLocCar_Enabled = 1 ;
      edtAlbLocDes_Jsonclick = "" ;
      edtAlbLocDes_Enabled = 1 ;
      edtALbFmdc_Enabled = 1 ;
      edtAlbTrnDm_Jsonclick = "" ;
      edtAlbTrnDm_Enabled = 1 ;
      edtAlbTrnDm_Visible = 1 ;
      divAlbtrndm_cell_Class = "col-xs-12 col-sm-4" ;
      edtAlbTrnNc_Jsonclick = "" ;
      edtAlbTrnNc_Enabled = 1 ;
      edtAlbTrnNc_Visible = 1 ;
      divAlbtrnnc_cell_Class = "col-xs-12 col-sm-4" ;
      edtAlbTrnNm_Jsonclick = "" ;
      edtAlbTrnNm_Enabled = 1 ;
      edtAlbTrnNm_Visible = 1 ;
      divAlbtrnnm_cell_Class = "col-xs-12 col-sm-4" ;
      divUnnamedtable6_Visible = 1 ;
      edtAlbFmd_Enabled = 0 ;
      edtAlbGrossT_Jsonclick = "" ;
      edtAlbGrossT_Enabled = 0 ;
      edtAlbHhfm_Jsonclick = "" ;
      edtAlbHhfm_Enabled = 0 ;
      cmbAlbProAT.setJsonclick( "" );
      cmbAlbProAT.setEnabled( 0 );
      edtAlbLic_Jsonclick = "" ;
      edtAlbLic_Enabled = 0 ;
      cmbAlbEnvFtp.setJsonclick( "" );
      cmbAlbEnvFtp.setEnabled( 0 );
      edtAlbMat_Jsonclick = "" ;
      edtAlbMat_Enabled = 1 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 1 ;
      edtAlbDomEnv_Jsonclick = "" ;
      edtAlbDomEnv_Enabled = 1 ;
      edtAlbCliDes_Jsonclick = "" ;
      edtAlbCliDes_Enabled = 1 ;
      edtGuiRemCli_Jsonclick = "" ;
      edtGuiRemCli_Enabled = 1 ;
      edtAlbUsu_Jsonclick = "" ;
      edtAlbUsu_Enabled = 0 ;
      edtAlbHorSal_Jsonclick = "" ;
      edtAlbHorSal_Enabled = 1 ;
      edtAlbFecSal_Jsonclick = "" ;
      edtAlbFecSal_Enabled = 1 ;
      edtAlbProfch_Jsonclick = "" ;
      edtAlbProfch_Enabled = 1 ;
      cmbAlbSec.setJsonclick( "" );
      cmbAlbSec.setEnabled( 1 );
      cmbAlbSec.setVisible( 1 );
      divAlbsec_cell_Class = "col-xs-12 col-sm-3" ;
      cmbAlbProEst.setJsonclick( "" );
      cmbAlbProEst.setEnabled( 0 );
      cmbAlbProPri.setJsonclick( "" );
      cmbAlbProPri.setEnabled( 0 );
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Enabled = 1 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
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

   public void gxsgaguiremcli1Q70( String A1253EmprGuiRem ,
                                   String A13735CliCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaguiremcli_data1Q70( A1253EmprGuiRem, A13735CliCNom) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgaguiremcli_data1Q70( String A1253EmprGuiRem ,
                                           String A13735CliCNom )
   {
      l13735CliCNom = GXutil.concat( GXutil.rtrim( A13735CliCNom), "%", "") ;
      /* Using cursor T01Q743 */
      pr_default.execute(41, new Object[] {A1253EmprGuiRem, l13735CliCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(41) != 101) )
      {
         gxdynajaxctrlcodr.add(T01Q743_A13735CliCNom[0]);
         gxdynajaxctrldescr.add(T01Q743_A13735CliCNom[0]);
         pr_default.readNext(41);
      }
      pr_default.close(41);
   }

   public void gxsgaalbclides1Q70( String A13735CliCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaalbclides_data1Q70( A13735CliCNom) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgaalbclides_data1Q70( String A13735CliCNom )
   {
      l13735CliCNom = GXutil.concat( GXutil.rtrim( A13735CliCNom), "%", "") ;
      /* Using cursor T01Q744 */
      pr_default.execute(42, new Object[] {l13735CliCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(42) != 101) )
      {
         if ( GXutil.like( GXutil.upper( T01Q744_A13735CliCNom[0]) , GXutil.padr( "%" + GXutil.upper( A13735CliCNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(T01Q744_A13735CliCNom[0]);
            gxdynajaxctrldescr.add(T01Q744_A13735CliCNom[0]);
         }
         pr_default.readNext(42);
      }
      pr_default.close(42);
   }

   public void gxsgatrncod1Q70( String A13738TrnCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatrncod_data1Q70( A13738TrnCNom) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgatrncod_data1Q70( String A13738TrnCNom )
   {
      l13738TrnCNom = GXutil.concat( GXutil.rtrim( A13738TrnCNom), "%", "") ;
      /* Using cursor T01Q745 */
      pr_default.execute(43, new Object[] {l13738TrnCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(43) != 101) )
      {
         if ( GXutil.like( GXutil.upper( T01Q745_A13738TrnCNom[0]) , GXutil.padr( "%" + GXutil.upper( A13738TrnCNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(T01Q745_A13738TrnCNom[0]);
            gxdynajaxctrldescr.add(T01Q745_A13738TrnCNom[0]);
         }
         pr_default.readNext(43);
      }
      pr_default.close(43);
   }

   public void gxhcaguiremcli1Q73( String A1253EmprGuiRem ,
                                   String A13735CliCNom )
   {
      /* Using cursor T01Q746 */
      pr_default.execute(44, new Object[] {A13735CliCNom, A1253EmprGuiRem});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(44) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13735CliCNom = T01Q746_A13735CliCNom[0] ;
         A396EmprCod = T01Q746_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01Q746_A252CliCod[0] ;
         pr_default.readNext(44);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(44);
   }

   public void gxhcaalbclides1Q73( String A13735CliCNom )
   {
      /* Using cursor T01Q747 */
      pr_default.execute(45, new Object[] {A13735CliCNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(45) != 101) )
      {
         if ( GXutil.strcmp(T01Q747_A13735CliCNom[0], A13735CliCNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13735CliCNom = T01Q747_A13735CliCNom[0] ;
            A396EmprCod = T01Q747_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01Q747_A252CliCod[0] ;
         }
         pr_default.readNext(45);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(45);
   }

   public void gxhcatrncod1Q73( String A13738TrnCNom )
   {
      /* Using cursor T01Q748 */
      pr_default.execute(46, new Object[] {A13738TrnCNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(46) != 101) )
      {
         if ( GXutil.strcmp(T01Q748_A13738TrnCNom[0], A13738TrnCNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13738TrnCNom = T01Q748_A13738TrnCNom[0] ;
            A396EmprCod = T01Q748_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A840TrnCod = T01Q748_A840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         pr_default.readNext(46);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(46);
   }

   public void gxasa108351Q73( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
      calprd_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      edtAlbTrnNm_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnNm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnNm_Visible), 5, 0), true);
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

   public void gxasa108371Q73( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
      calprd_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      edtAlbTrnNc_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnNc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnNc_Visible), 5, 0), true);
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

   public void gxasa108361Q73( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ERFOC", ""), ""), GXv_int6) ;
      calprd_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      edtAlbTrnDm_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnDm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnDm_Visible), 5, 0), true);
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

   public void gxasa22421Q73( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINAMA", ""), ""), GXv_int6) ;
      calprd_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      cmbAlbSec.setVisible( ((GXt_int5==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbSec.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbSec.getVisible(), 5, 0), true);
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

   public void xc_49_1Q73( String A396EmprCod ,
                           String AV26ContCod ,
                           long A30AlbProCod ,
                           String Gx_mode )
   {
      if ( (0==A30AlbProCod) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         GXv_int8[0] = (int)(A30AlbProCod) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV26ContCod, GXv_int8) ;
         A30AlbProCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_50_1Q73( String A396EmprCod ,
                           String A39AlbProPri ,
                           java.util.Date AV28Fch ,
                           long AV29AlbLast ,
                           java.util.Date A34AlbProfch ,
                           String AV27Msg_f ,
                           short AV31Ctrlf )
   {
      if ( AV31Ctrlf == 1 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A39AlbProPri ;
         GXv_int6[0] = (byte)(1) ;
         GXv_date11[0] = AV28Fch ;
         GXv_int8[0] = (int)(AV29AlbLast) ;
         GXv_date10[0] = A34AlbProfch ;
         GXv_char2[0] = AV27Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_date11, GXv_int8, GXv_date10, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A39AlbProPri = GXv_char3[0] ;
         AV28Fch = GXv_date11[0] ;
         AV29AlbLast = GXv_int8[0] ;
         A34AlbProfch = GXv_date10[0] ;
         AV27Msg_f = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV28Fch", localUtil.format(AV28Fch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV29AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29AlbLast), 10, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV27Msg_f", AV27Msg_f);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A39AlbProPri))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV28Fch, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV29AlbLast, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A34AlbProfch, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV27Msg_f)+"\"") ;
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
      cmbAlbProPri.setName( "ALBPROPRI" );
      cmbAlbProPri.setWebtags( "" );
      cmbAlbProPri.addItem("1", httpContext.getMessage( "Guia Remessa", ""), (short)(0));
      cmbAlbProPri.addItem("0", httpContext.getMessage( "Guia Transporte Sem Encargos", ""), (short)(0));
      if ( cmbAlbProPri.getItemCount() > 0 )
      {
         A39AlbProPri = cmbAlbProPri.getValidValue(A39AlbProPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      }
      cmbAlbProEst.setName( "ALBPROEST" );
      cmbAlbProEst.setWebtags( "" );
      cmbAlbProEst.addItem("0", httpContext.getMessage( "Gerado", ""), (short)(0));
      cmbAlbProEst.addItem("1", httpContext.getMessage( "Impresso", ""), (short)(0));
      cmbAlbProEst.addItem("2", httpContext.getMessage( "Faturado", ""), (short)(0));
      if ( cmbAlbProEst.getItemCount() > 0 )
      {
         A33AlbProEst = (byte)(GXutil.lval( cmbAlbProEst.getValidValue(GXutil.trim( GXutil.str( A33AlbProEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
      }
      cmbAlbSec.setName( "ALBSEC" );
      cmbAlbSec.setWebtags( "" );
      cmbAlbSec.addItem("S", httpContext.getMessage( "SIM", ""), (short)(0));
      cmbAlbSec.addItem("N", httpContext.getMessage( "NAO", ""), (short)(0));
      if ( cmbAlbSec.getItemCount() > 0 )
      {
         A2242AlbSec = cmbAlbSec.getValidValue(A2242AlbSec) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
      }
      cmbAlbEnvFtp.setName( "ALBENVFTP" );
      cmbAlbEnvFtp.setWebtags( "" );
      cmbAlbEnvFtp.addItem("0", httpContext.getMessage( "Nao enviado", ""), (short)(0));
      cmbAlbEnvFtp.addItem("3", httpContext.getMessage( "Enviado a AT", ""), (short)(0));
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      }
      cmbAlbProAT.setName( "ALBPROAT" );
      cmbAlbProAT.setWebtags( "" );
      cmbAlbProAT.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      cmbAlbProAT.addItem("A", httpContext.getMessage( "Automatico", ""), (short)(0));
      if ( cmbAlbProAT.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A10765AlbProAT)==0) )
         {
            A10765AlbProAT = " " ;
            httpContext.ajax_rsp_assign_attri("", false, "A10765AlbProAT", A10765AlbProAT);
         }
      }
      cmbAlbDivTCod.setName( "ALBDIVTCOD" );
      cmbAlbDivTCod.setWebtags( "" );
      cmbAlbDivTCod.addItem("P", httpContext.getMessage( "PESETA", ""), (short)(0));
      cmbAlbDivTCod.addItem("E", httpContext.getMessage( "EURO", ""), (short)(0));
      if ( cmbAlbDivTCod.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A3093AlbDivTCod)==0) )
         {
            A3093AlbDivTCod = A3145GuiRemDivT ;
            n3093AlbDivTCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
         }
      }
      cmbGuiRemDivT.setName( "GUIREMDIVT" );
      cmbGuiRemDivT.setWebtags( "" );
      cmbGuiRemDivT.addItem("E", httpContext.getMessage( "EURO", ""), (short)(0));
      cmbGuiRemDivT.addItem("P", httpContext.getMessage( "PESETA", ""), (short)(0));
      if ( cmbGuiRemDivT.getItemCount() > 0 )
      {
         A3145GuiRemDivT = cmbGuiRemDivT.getValidValue(A3145GuiRemDivT) ;
         n3145GuiRemDivT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", A3145GuiRemDivT);
      }
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

   public void valid_Guiremcli( )
   {
      if ( isIns( )  && (0==A3869AlbCliDes) && ( Gx_BScreen == 0 ) )
      {
         A3869AlbCliDes = A1243GuiRemCli ;
         /* Using cursor T01Q749 */
         pr_default.execute(47, new Object[] {Integer.valueOf(A3869AlbCliDes)});
         h3869AlbCliDes = "" ;
         while ( (pr_default.getStatus(47) != 101) )
         {
            h3869AlbCliDes = T01Q749_A13735CliCNom[0] ;
            if (true) break;
         }
         pr_default.close(47);
         httpContext.ajax_rsp_assign_attri("", false, "h3869AlbCliDes", h3869AlbCliDes);
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrim( localUtil.ntoc( A3869AlbCliDes, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h3869AlbCliDes", h3869AlbCliDes);
   }

   public void valid_Albclides( )
   {
      if ( (GXutil.strcmp("", h3869AlbCliDes)==0) )
      {
         A3869AlbCliDes = 0 ;
      }
      else
      {
         A13735CliCNom = h3869AlbCliDes ;
         /* Using cursor T01Q750 */
         pr_default.execute(48, new Object[] {A13735CliCNom});
         A3869AlbCliDes = T01Q750_A252CliCod[0] ;
         if ( ! ( (pr_default.getStatus(48) == 101) ) )
         {
            pr_default.readNext(48);
            if ( ! ( (pr_default.getStatus(48) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "ALBCLIDES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbCliDes_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(48);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h3869AlbCliDes", h3869AlbCliDes);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrim( localUtil.ntoc( A3869AlbCliDes, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h3869AlbCliDes", h3869AlbCliDes);
   }

   public void valid_Trncod( )
   {
      n841TrnNom = false ;
      n3643TrnNif = false ;
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         A840TrnCod = (short)(0) ;
      }
      else
      {
         A13738TrnCNom = h840TrnCod ;
         /* Using cursor T01Q751 */
         pr_default.execute(49, new Object[] {A13738TrnCNom});
         A840TrnCod = T01Q751_A840TrnCod[0] ;
         A840TrnCod = T01Q751_A840TrnCod[0] ;
         if ( ! ( (pr_default.getStatus(49) == 101) ) )
         {
            pr_default.readNext(49);
            if ( ! ( (pr_default.getStatus(49) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(49);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      /* Using cursor T01Q752 */
      pr_default.execute(50, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(50) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A13738TrnCNom)==0) || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A841TrnNom = T01Q752_A841TrnNom[0] ;
      n841TrnNom = T01Q752_n841TrnNom[0] ;
      A3643TrnNif = T01Q752_A3643TrnNif[0] ;
      n3643TrnNif = T01Q752_n3643TrnNif[0] ;
      pr_default.close(50);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", GXutil.rtrim( A3643TrnNif));
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
   }

   public void valid_Emprguirem( )
   {
      n3145GuiRemDivT = false ;
      A3145GuiRemDivT = cmbGuiRemDivT.getValue() ;
      n3145GuiRemDivT = false ;
      cmbGuiRemDivT.setValue( A3145GuiRemDivT );
      n3110GuiRemDiv = false ;
      n3108AlbDivCod = false ;
      n1259AlbDomEnv = false ;
      n3093AlbDivTCod = false ;
      A3093AlbDivTCod = cmbAlbDivTCod.getValue() ;
      n3093AlbDivTCod = false ;
      cmbAlbDivTCod.setValue( A3093AlbDivTCod );
      n3109AlbDivAbr = false ;
      n841TrnNom = false ;
      n3643TrnNif = false ;
      n1260BusDomEnv = false ;
      if ( (GXutil.strcmp("", h1243GuiRemCli)==0) )
      {
         A1243GuiRemCli = 0 ;
      }
      else
      {
         A13735CliCNom = h1243GuiRemCli ;
         /* Using cursor T01Q753 */
         pr_default.execute(51, new Object[] {A13735CliCNom, A1253EmprGuiRem});
         A1243GuiRemCli = T01Q753_A252CliCod[0] ;
         if ( ! ( (pr_default.getStatus(51) == 101) ) )
         {
            pr_default.readNext(51);
            if ( ! ( (pr_default.getStatus(51) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "GUIREMCLI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtGuiRemCli_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(51);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h1243GuiRemCli", h1243GuiRemCli);
      /* Using cursor T01Q754 */
      pr_default.execute(52, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(52) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
      }
      A1244GuiRemCln = T01Q754_A1244GuiRemCln[0] ;
      A3145GuiRemDivT = T01Q754_A3145GuiRemDivT[0] ;
      n3145GuiRemDivT = T01Q754_n3145GuiRemDivT[0] ;
      cmbGuiRemDivT.setValue( A3145GuiRemDivT );
      A3110GuiRemDiv = T01Q754_A3110GuiRemDiv[0] ;
      n3110GuiRemDiv = T01Q754_n3110GuiRemDiv[0] ;
      pr_default.close(52);
      if ( isIns( )  && (GXutil.strcmp("", A3093AlbDivTCod)==0) && ( Gx_BScreen == 0 ) )
      {
         A3093AlbDivTCod = httpContext.getMessage( "E", "") ;
         n3093AlbDivTCod = false ;
         cmbAlbDivTCod.setValue( A3093AlbDivTCod );
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A3093AlbDivTCod)==0) && ( Gx_BScreen == 0 ) )
         {
            A3093AlbDivTCod = A3145GuiRemDivT ;
            n3093AlbDivTCod = false ;
            cmbAlbDivTCod.setValue( A3093AlbDivTCod );
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV17Insert_AlbDivCod) )
      {
         A3108AlbDivCod = AV17Insert_AlbDivCod ;
         n3108AlbDivCod = false ;
      }
      else
      {
         if ( isIns( )  && (0==A3108AlbDivCod) && ( Gx_BScreen == 0 ) )
         {
            A3108AlbDivCod = (byte)(2) ;
            n3108AlbDivCod = false ;
         }
         else
         {
            if ( isIns( )  && (0==A3108AlbDivCod) && ( Gx_BScreen == 0 ) )
            {
               A3108AlbDivCod = A3110GuiRemDiv ;
               n3108AlbDivCod = false ;
            }
         }
      }
      /* Using cursor T01Q755 */
      pr_default.execute(53, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
      if ( (pr_default.getStatus(53) == 101) )
      {
         if ( ! ( (0==A3108AlbDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlb", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBDIVCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbDivCod_Internalname ;
         }
      }
      A3109AlbDivAbr = T01Q755_A3109AlbDivAbr[0] ;
      n3109AlbDivAbr = T01Q755_n3109AlbDivAbr[0] ;
      pr_default.close(53);
      /* Using cursor T01Q756 */
      pr_default.execute(54, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(54) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
      }
      A841TrnNom = T01Q756_A841TrnNom[0] ;
      n841TrnNom = T01Q756_n841TrnNom[0] ;
      A3643TrnNif = T01Q756_A3643TrnNif[0] ;
      n3643TrnNif = T01Q756_n3643TrnNif[0] ;
      pr_default.close(54);
      /* Using cursor T01Q757 */
      pr_default.execute(55, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
      if ( (pr_default.getStatus(55) != 101) )
      {
         A1260BusDomEnv = T01Q757_A1260BusDomEnv[0] ;
         n1260BusDomEnv = T01Q757_n1260BusDomEnv[0] ;
      }
      else
      {
         A1260BusDomEnv = (byte)(0) ;
         n1260BusDomEnv = false ;
      }
      pr_default.close(55);
      dynload_actions( ) ;
      if ( cmbGuiRemDivT.getItemCount() > 0 )
      {
         A3145GuiRemDivT = cmbGuiRemDivT.getValidValue(A3145GuiRemDivT) ;
         n3145GuiRemDivT = false ;
         cmbGuiRemDivT.setValue( A3145GuiRemDivT );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbGuiRemDivT.setValue( GXutil.rtrim( A3145GuiRemDivT) );
      }
      if ( cmbAlbDivTCod.getItemCount() > 0 )
      {
         A3093AlbDivTCod = cmbAlbDivTCod.getValidValue(A3093AlbDivTCod) ;
         n3093AlbDivTCod = false ;
         cmbAlbDivTCod.setValue( A3093AlbDivTCod );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbDivTCod.setValue( GXutil.rtrim( A3093AlbDivTCod) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", GXutil.rtrim( A1253EmprGuiRem));
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", GXutil.rtrim( A1244GuiRemCln));
      httpContext.ajax_rsp_assign_attri("", false, "A3145GuiRemDivT", GXutil.rtrim( A3145GuiRemDivT));
      cmbGuiRemDivT.setValue( GXutil.rtrim( A3145GuiRemDivT) );
      httpContext.ajax_rsp_assign_prop("", false, cmbGuiRemDivT.getInternalname(), "Values", cmbGuiRemDivT.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A3110GuiRemDiv", GXutil.ltrim( localUtil.ntoc( A3110GuiRemDiv, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", GXutil.rtrim( A3093AlbDivTCod));
      cmbAlbDivTCod.setValue( GXutil.rtrim( A3093AlbDivTCod) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbDivTCod.getInternalname(), "Values", cmbAlbDivTCod.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrim( localUtil.ntoc( A3108AlbDivCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", GXutil.rtrim( A3109AlbDivAbr));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3643TrnNif", GXutil.rtrim( A3643TrnNif));
      httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.ltrim( localUtil.ntoc( A1260BusDomEnv, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h1243GuiRemCli", h1243GuiRemCli);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV11AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV20AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV21AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV26ContCod',fld:'vCONTCOD',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV13TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV20AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV21AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV11AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV26ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'A10019AlbHhfm',fld:'ALBHHFM',pic:'99/99/99 99:99'},{av:'cmbAlbProEst'},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9'},{av:'A7098AlbUsu',fld:'ALBUSU',pic:''},{av:'cmbAlbEnvFtp'},{av:'A5805AlbEnvFtp',fld:'ALBENVFTP',pic:'9'},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'cmbAlbProAT'},{av:'A10765AlbProAT',fld:'ALBPROAT',pic:''},{av:'A10020AlbGrossT',fld:'ALBGROSST',pic:'ZZZZZZZZZ9.99'},{av:'A10017AlbFmd',fld:'ALBFMD',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121Q72',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV13TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROPRI","{handler:'valid_Albpropri',iparms:[]");
      setEventMetadata("VALID_ALBPROPRI",",oparms:[]}");
      setEventMetadata("VALID_ALBPROEST","{handler:'valid_Albproest',iparms:[]");
      setEventMetadata("VALID_ALBPROEST",",oparms:[]}");
      setEventMetadata("VALID_ALBPROFCH","{handler:'valid_Albprofch',iparms:[]");
      setEventMetadata("VALID_ALBPROFCH",",oparms:[]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[{av:'h3869AlbCliDes'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'h1243GuiRemCli'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A3869AlbCliDes',fld:'ALBCLIDES',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[{av:'A3869AlbCliDes',fld:'ALBCLIDES',pic:'ZZZZZ9'},{av:'h3869AlbCliDes'}]}");
      setEventMetadata("VALID_ALBCLIDES","{handler:'valid_Albclides',iparms:[{av:'h3869AlbCliDes'},{av:'A3869AlbCliDes',fld:'ALBCLIDES',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("VALID_ALBCLIDES",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3869AlbCliDes',fld:'ALBCLIDES',pic:'ZZZZZ9'},{av:'h3869AlbCliDes'}]}");
      setEventMetadata("VALID_ALBDOMENV","{handler:'valid_Albdomenv',iparms:[]");
      setEventMetadata("VALID_ALBDOMENV",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'h840TrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A3643TrnNif',fld:'TRNNIF',pic:'@!'}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A3643TrnNif',fld:'TRNNIF',pic:'@!'},{av:'h840TrnCod'}]}");
      setEventMetadata("VALID_ALBLIC","{handler:'valid_Alblic',iparms:[]");
      setEventMetadata("VALID_ALBLIC",",oparms:[]}");
      setEventMetadata("VALID_ALBDIVCOD","{handler:'valid_Albdivcod',iparms:[]");
      setEventMetadata("VALID_ALBDIVCOD",",oparms:[]}");
      setEventMetadata("VALID_BUSDOMENV","{handler:'valid_Busdomenv',iparms:[]");
      setEventMetadata("VALID_BUSDOMENV",",oparms:[]}");
      setEventMetadata("VALID_EMPRGUIREM","{handler:'valid_Emprguirem',iparms:[{av:'h1243GuiRemCli'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A1253EmprGuiRem',fld:'EMPRGUIREM',pic:'@!'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'cmbGuiRemDivT'},{av:'A3145GuiRemDivT',fld:'GUIREMDIVT',pic:''},{av:'AV17Insert_AlbDivCod',fld:'vINSERT_ALBDIVCOD',pic:'Z9'},{av:'A3110GuiRemDiv',fld:'GUIREMDIV',pic:'Z9'},{av:'A3108AlbDivCod',fld:'ALBDIVCOD',pic:'Z9'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A1259AlbDomEnv',fld:'ALBDOMENV',pic:'9'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'cmbAlbDivTCod'},{av:'A3093AlbDivTCod',fld:'ALBDIVTCOD',pic:''},{av:'A3109AlbDivAbr',fld:'ALBDIVABR',pic:''},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A3643TrnNif',fld:'TRNNIF',pic:'@!'},{av:'A1260BusDomEnv',fld:'BUSDOMENV',pic:'9'}]");
      setEventMetadata("VALID_EMPRGUIREM",",oparms:[{av:'A1253EmprGuiRem',fld:'EMPRGUIREM',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'cmbGuiRemDivT'},{av:'A3145GuiRemDivT',fld:'GUIREMDIVT',pic:''},{av:'A3110GuiRemDiv',fld:'GUIREMDIV',pic:'Z9'},{av:'cmbAlbDivTCod'},{av:'A3093AlbDivTCod',fld:'ALBDIVTCOD',pic:''},{av:'A3108AlbDivCod',fld:'ALBDIVCOD',pic:'Z9'},{av:'A3109AlbDivAbr',fld:'ALBDIVABR',pic:''},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A3643TrnNif',fld:'TRNNIF',pic:'@!'},{av:'A1260BusDomEnv',fld:'BUSDOMENV',pic:'9'},{av:'h1243GuiRemCli'}]}");
      setEventMetadata("VALID_GUIREMDIVT","{handler:'valid_Guiremdivt',iparms:[]");
      setEventMetadata("VALID_GUIREMDIVT",",oparms:[]}");
      setEventMetadata("VALID_GUIREMDIV","{handler:'valid_Guiremdiv',iparms:[]");
      setEventMetadata("VALID_GUIREMDIV",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
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
      pr_default.close(52);
      pr_default.close(31);
      pr_default.close(54);
      pr_default.close(50);
      pr_default.close(34);
      pr_default.close(32);
      pr_default.close(53);
      pr_default.close(30);
      pr_default.close(55);
      pr_default.close(33);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV10EmprCod = "" ;
      wcpOAV20AlbProPri = "" ;
      wcpOAV21AlbSec = "" ;
      wcpOAV26ContCod = "" ;
      Z396EmprCod = "" ;
      Z39AlbProPri = "" ;
      Z34AlbProfch = GXutil.nullDate() ;
      Z4023AlbFecSal = GXutil.nullDate() ;
      Z3865AlbHorSal = "" ;
      Z7098AlbUsu = "" ;
      Z3868AlbMat = "" ;
      Z2242AlbSec = "" ;
      Z7101AlbLic = "" ;
      Z10765AlbProAT = "" ;
      Z10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      Z10020AlbGrossT = DecimalUtil.ZERO ;
      Z10837AlbTrnNc = "" ;
      Z10017AlbFmd = "" ;
      Z10835AlbTrnNm = "" ;
      Z10018ALbFmdc = "" ;
      Z10836AlbTrnDm = "" ;
      Z5140AlbMarca = "" ;
      Z5141AlbIvaCod = "" ;
      Z7987AlbColCa = "" ;
      Z7986AlbCambio = DecimalUtil.ZERO ;
      Z7984AlbMotTr = "" ;
      Z7988AlbObsCb = "" ;
      Z7100AlbMarCo = "" ;
      Z7099AlbOComp = "" ;
      Z3093AlbDivTCod = "" ;
      Z1253EmprGuiRem = "" ;
      N1253EmprGuiRem = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV26ContCod = "" ;
      Gx_mode = "" ;
      A39AlbProPri = "" ;
      AV28Fch = GXutil.nullDate() ;
      A34AlbProfch = GXutil.nullDate() ;
      AV27Msg_f = "" ;
      A1253EmprGuiRem = "" ;
      A13735CliCNom = "" ;
      A13738TrnCNom = "" ;
      h1243GuiRemCli = "" ;
      h3869AlbCliDes = "" ;
      h840TrnCod = "" ;
      AV10EmprCod = "" ;
      AV20AlbProPri = "" ;
      AV21AlbSec = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A2242AlbSec = "" ;
      A10765AlbProAT = "" ;
      A3093AlbDivTCod = "" ;
      A3145GuiRemDivT = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A3865AlbHorSal = "" ;
      A7098AlbUsu = "" ;
      A3868AlbMat = "" ;
      A7101AlbLic = "" ;
      A10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      A10020AlbGrossT = DecimalUtil.ZERO ;
      A10017AlbFmd = "" ;
      A10835AlbTrnNm = "" ;
      A10837AlbTrnNc = "" ;
      A10836AlbTrnDm = "" ;
      A10018ALbFmdc = "" ;
      A5141AlbIvaCod = "" ;
      A7987AlbColCa = "" ;
      A7986AlbCambio = DecimalUtil.ZERO ;
      A7984AlbMotTr = "" ;
      A7988AlbObsCb = "" ;
      A7100AlbMarCo = "" ;
      A7099AlbOComp = "" ;
      A3643TrnNif = "" ;
      A3109AlbDivAbr = "" ;
      A407EmprNom = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A5140AlbMarca = "" ;
      A1244GuiRemCln = "" ;
      A841TrnNom = "" ;
      AV18Insert_EmprGuiRem = "" ;
      AV9UsurCod = "" ;
      AV33Pgmname = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode3 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV7Station = "" ;
      AV8EmprNom = "" ;
      GXt_char1 = "" ;
      AV12WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV13TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14WebSession = httpContext.getWebSession();
      AV19TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z407EmprNom = "" ;
      Z3109AlbDivAbr = "" ;
      Z1244GuiRemCln = "" ;
      Z3145GuiRemDivT = "" ;
      T01Q75_A407EmprNom = new String[] {""} ;
      T01Q75_n407EmprNom = new boolean[] {false} ;
      T01Q710_A13738TrnCNom = new String[] {""} ;
      T01Q710_A396EmprCod = new String[] {""} ;
      T01Q710_A840TrnCod = new short[1] ;
      T01Q711_A13735CliCNom = new String[] {""} ;
      T01Q711_A396EmprCod = new String[] {""} ;
      T01Q711_A252CliCod = new int[1] ;
      T01Q76_A841TrnNom = new String[] {""} ;
      T01Q76_n841TrnNom = new boolean[] {false} ;
      T01Q76_A3643TrnNif = new String[] {""} ;
      T01Q76_n3643TrnNif = new boolean[] {false} ;
      T01Q77_A841TrnNom = new String[] {""} ;
      T01Q77_n841TrnNom = new boolean[] {false} ;
      T01Q77_A3643TrnNif = new String[] {""} ;
      T01Q77_n3643TrnNif = new boolean[] {false} ;
      T01Q74_A1244GuiRemCln = new String[] {""} ;
      T01Q74_A3145GuiRemDivT = new String[] {""} ;
      T01Q74_n3145GuiRemDivT = new boolean[] {false} ;
      T01Q74_A3110GuiRemDiv = new byte[1] ;
      T01Q74_n3110GuiRemDiv = new boolean[] {false} ;
      T01Q712_A252CliCod = new int[1] ;
      T01Q712_A266CliEnvLin = new byte[1] ;
      T01Q712_A30AlbProCod = new long[1] ;
      T01Q712_A39AlbProPri = new String[] {""} ;
      T01Q712_A33AlbProEst = new byte[1] ;
      T01Q712_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01Q712_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01Q712_A3865AlbHorSal = new String[] {""} ;
      T01Q712_A7098AlbUsu = new String[] {""} ;
      T01Q712_A1244GuiRemCln = new String[] {""} ;
      T01Q712_A3869AlbCliDes = new int[1] ;
      T01Q712_A1259AlbDomEnv = new byte[1] ;
      T01Q712_n1259AlbDomEnv = new boolean[] {false} ;
      T01Q712_A3868AlbMat = new String[] {""} ;
      T01Q712_A2242AlbSec = new String[] {""} ;
      T01Q712_A5805AlbEnvFtp = new byte[1] ;
      T01Q712_A7101AlbLic = new String[] {""} ;
      T01Q712_A10765AlbProAT = new String[] {""} ;
      T01Q712_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      T01Q712_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q712_A10837AlbTrnNc = new String[] {""} ;
      T01Q712_A10017AlbFmd = new String[] {""} ;
      T01Q712_n10017AlbFmd = new boolean[] {false} ;
      T01Q712_A10835AlbTrnNm = new String[] {""} ;
      T01Q712_A10018ALbFmdc = new String[] {""} ;
      T01Q712_A10836AlbTrnDm = new String[] {""} ;
      T01Q712_A5140AlbMarca = new String[] {""} ;
      T01Q712_A3867AlbLocDes = new byte[1] ;
      T01Q712_A3866AlbLocCar = new byte[1] ;
      T01Q712_A914AlbPObsCon = new byte[1] ;
      T01Q712_A5141AlbIvaCod = new String[] {""} ;
      T01Q712_A7987AlbColCa = new String[] {""} ;
      T01Q712_A7162AlbDesp = new int[1] ;
      T01Q712_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q712_A7985AlbTipDoc = new int[1] ;
      T01Q712_A7984AlbMotTr = new String[] {""} ;
      T01Q712_A5803AlbTipCal = new byte[1] ;
      T01Q712_A7988AlbObsCb = new String[] {""} ;
      T01Q712_A7102AlbNumT = new long[1] ;
      T01Q712_A7100AlbMarCo = new String[] {""} ;
      T01Q712_A7099AlbOComp = new String[] {""} ;
      T01Q712_A3093AlbDivTCod = new String[] {""} ;
      T01Q712_n3093AlbDivTCod = new boolean[] {false} ;
      T01Q712_A3109AlbDivAbr = new String[] {""} ;
      T01Q712_n3109AlbDivAbr = new boolean[] {false} ;
      T01Q712_A1258GuiRemDom = new byte[1] ;
      T01Q712_n1258GuiRemDom = new boolean[] {false} ;
      T01Q712_A3145GuiRemDivT = new String[] {""} ;
      T01Q712_n3145GuiRemDivT = new boolean[] {false} ;
      T01Q712_A407EmprNom = new String[] {""} ;
      T01Q712_n407EmprNom = new boolean[] {false} ;
      T01Q712_A1253EmprGuiRem = new String[] {""} ;
      T01Q712_A1243GuiRemCli = new int[1] ;
      T01Q712_A396EmprCod = new String[] {""} ;
      T01Q712_A840TrnCod = new short[1] ;
      T01Q712_A3108AlbDivCod = new byte[1] ;
      T01Q712_n3108AlbDivCod = new boolean[] {false} ;
      T01Q712_A3110GuiRemDiv = new byte[1] ;
      T01Q712_n3110GuiRemDiv = new boolean[] {false} ;
      T01Q712_A1260BusDomEnv = new byte[1] ;
      T01Q712_n1260BusDomEnv = new boolean[] {false} ;
      T01Q713_A13735CliCNom = new String[] {""} ;
      T01Q713_A396EmprCod = new String[] {""} ;
      T01Q713_A252CliCod = new int[1] ;
      T01Q714_A13735CliCNom = new String[] {""} ;
      T01Q714_A396EmprCod = new String[] {""} ;
      T01Q714_A252CliCod = new int[1] ;
      T01Q715_A13735CliCNom = new String[] {""} ;
      T01Q715_A396EmprCod = new String[] {""} ;
      T01Q715_A252CliCod = new int[1] ;
      T01Q716_A13738TrnCNom = new String[] {""} ;
      T01Q716_A396EmprCod = new String[] {""} ;
      T01Q716_A840TrnCod = new short[1] ;
      T01Q717_A13738TrnCNom = new String[] {""} ;
      T01Q717_A396EmprCod = new String[] {""} ;
      T01Q717_A840TrnCod = new short[1] ;
      T01Q79_A1260BusDomEnv = new byte[1] ;
      T01Q79_n1260BusDomEnv = new boolean[] {false} ;
      T01Q718_A13738TrnCNom = new String[] {""} ;
      T01Q718_A396EmprCod = new String[] {""} ;
      T01Q718_A840TrnCod = new short[1] ;
      T01Q719_A13735CliCNom = new String[] {""} ;
      T01Q719_A396EmprCod = new String[] {""} ;
      T01Q719_A252CliCod = new int[1] ;
      T01Q78_A3109AlbDivAbr = new String[] {""} ;
      T01Q78_n3109AlbDivAbr = new boolean[] {false} ;
      T01Q720_A1244GuiRemCln = new String[] {""} ;
      T01Q720_A3145GuiRemDivT = new String[] {""} ;
      T01Q720_n3145GuiRemDivT = new boolean[] {false} ;
      T01Q720_A3110GuiRemDiv = new byte[1] ;
      T01Q720_n3110GuiRemDiv = new boolean[] {false} ;
      T01Q721_A1260BusDomEnv = new byte[1] ;
      T01Q721_n1260BusDomEnv = new boolean[] {false} ;
      T01Q722_A841TrnNom = new String[] {""} ;
      T01Q722_n841TrnNom = new boolean[] {false} ;
      T01Q722_A3643TrnNif = new String[] {""} ;
      T01Q722_n3643TrnNif = new boolean[] {false} ;
      T01Q723_A841TrnNom = new String[] {""} ;
      T01Q723_n841TrnNom = new boolean[] {false} ;
      T01Q723_A3643TrnNif = new String[] {""} ;
      T01Q723_n3643TrnNif = new boolean[] {false} ;
      T01Q724_A3109AlbDivAbr = new String[] {""} ;
      T01Q724_n3109AlbDivAbr = new boolean[] {false} ;
      T01Q725_A396EmprCod = new String[] {""} ;
      T01Q725_A30AlbProCod = new long[1] ;
      T01Q73_A30AlbProCod = new long[1] ;
      T01Q73_A39AlbProPri = new String[] {""} ;
      T01Q73_A33AlbProEst = new byte[1] ;
      T01Q73_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01Q73_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01Q73_A3865AlbHorSal = new String[] {""} ;
      T01Q73_A7098AlbUsu = new String[] {""} ;
      T01Q73_A3869AlbCliDes = new int[1] ;
      T01Q73_A1259AlbDomEnv = new byte[1] ;
      T01Q73_n1259AlbDomEnv = new boolean[] {false} ;
      T01Q73_A3868AlbMat = new String[] {""} ;
      T01Q73_A2242AlbSec = new String[] {""} ;
      T01Q73_A5805AlbEnvFtp = new byte[1] ;
      T01Q73_A7101AlbLic = new String[] {""} ;
      T01Q73_A10765AlbProAT = new String[] {""} ;
      T01Q73_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      T01Q73_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q73_A10837AlbTrnNc = new String[] {""} ;
      T01Q73_A10017AlbFmd = new String[] {""} ;
      T01Q73_n10017AlbFmd = new boolean[] {false} ;
      T01Q73_A10835AlbTrnNm = new String[] {""} ;
      T01Q73_A10018ALbFmdc = new String[] {""} ;
      T01Q73_A10836AlbTrnDm = new String[] {""} ;
      T01Q73_A5140AlbMarca = new String[] {""} ;
      T01Q73_A3867AlbLocDes = new byte[1] ;
      T01Q73_A3866AlbLocCar = new byte[1] ;
      T01Q73_A914AlbPObsCon = new byte[1] ;
      T01Q73_A5141AlbIvaCod = new String[] {""} ;
      T01Q73_A7987AlbColCa = new String[] {""} ;
      T01Q73_A7162AlbDesp = new int[1] ;
      T01Q73_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q73_A7985AlbTipDoc = new int[1] ;
      T01Q73_A7984AlbMotTr = new String[] {""} ;
      T01Q73_A5803AlbTipCal = new byte[1] ;
      T01Q73_A7988AlbObsCb = new String[] {""} ;
      T01Q73_A7102AlbNumT = new long[1] ;
      T01Q73_A7100AlbMarCo = new String[] {""} ;
      T01Q73_A7099AlbOComp = new String[] {""} ;
      T01Q73_A3093AlbDivTCod = new String[] {""} ;
      T01Q73_n3093AlbDivTCod = new boolean[] {false} ;
      T01Q73_A1258GuiRemDom = new byte[1] ;
      T01Q73_n1258GuiRemDom = new boolean[] {false} ;
      T01Q73_A1253EmprGuiRem = new String[] {""} ;
      T01Q73_A1243GuiRemCli = new int[1] ;
      T01Q73_A396EmprCod = new String[] {""} ;
      T01Q73_A840TrnCod = new short[1] ;
      T01Q73_A3108AlbDivCod = new byte[1] ;
      T01Q73_n3108AlbDivCod = new boolean[] {false} ;
      T01Q726_A396EmprCod = new String[] {""} ;
      T01Q726_A30AlbProCod = new long[1] ;
      T01Q727_A396EmprCod = new String[] {""} ;
      T01Q727_A30AlbProCod = new long[1] ;
      T01Q728_A13738TrnCNom = new String[] {""} ;
      T01Q728_A396EmprCod = new String[] {""} ;
      T01Q728_A840TrnCod = new short[1] ;
      T01Q72_A30AlbProCod = new long[1] ;
      T01Q72_A39AlbProPri = new String[] {""} ;
      T01Q72_A33AlbProEst = new byte[1] ;
      T01Q72_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01Q72_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01Q72_A3865AlbHorSal = new String[] {""} ;
      T01Q72_A7098AlbUsu = new String[] {""} ;
      T01Q72_A3869AlbCliDes = new int[1] ;
      T01Q72_A1259AlbDomEnv = new byte[1] ;
      T01Q72_n1259AlbDomEnv = new boolean[] {false} ;
      T01Q72_A3868AlbMat = new String[] {""} ;
      T01Q72_A2242AlbSec = new String[] {""} ;
      T01Q72_A5805AlbEnvFtp = new byte[1] ;
      T01Q72_A7101AlbLic = new String[] {""} ;
      T01Q72_A10765AlbProAT = new String[] {""} ;
      T01Q72_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      T01Q72_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q72_A10837AlbTrnNc = new String[] {""} ;
      T01Q72_A10017AlbFmd = new String[] {""} ;
      T01Q72_n10017AlbFmd = new boolean[] {false} ;
      T01Q72_A10835AlbTrnNm = new String[] {""} ;
      T01Q72_A10018ALbFmdc = new String[] {""} ;
      T01Q72_A10836AlbTrnDm = new String[] {""} ;
      T01Q72_A5140AlbMarca = new String[] {""} ;
      T01Q72_A3867AlbLocDes = new byte[1] ;
      T01Q72_A3866AlbLocCar = new byte[1] ;
      T01Q72_A914AlbPObsCon = new byte[1] ;
      T01Q72_A5141AlbIvaCod = new String[] {""} ;
      T01Q72_A7987AlbColCa = new String[] {""} ;
      T01Q72_A7162AlbDesp = new int[1] ;
      T01Q72_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q72_A7985AlbTipDoc = new int[1] ;
      T01Q72_A7984AlbMotTr = new String[] {""} ;
      T01Q72_A5803AlbTipCal = new byte[1] ;
      T01Q72_A7988AlbObsCb = new String[] {""} ;
      T01Q72_A7102AlbNumT = new long[1] ;
      T01Q72_A7100AlbMarCo = new String[] {""} ;
      T01Q72_A7099AlbOComp = new String[] {""} ;
      T01Q72_A3093AlbDivTCod = new String[] {""} ;
      T01Q72_n3093AlbDivTCod = new boolean[] {false} ;
      T01Q72_A1258GuiRemDom = new byte[1] ;
      T01Q72_n1258GuiRemDom = new boolean[] {false} ;
      T01Q72_A1253EmprGuiRem = new String[] {""} ;
      T01Q72_A1243GuiRemCli = new int[1] ;
      T01Q72_A396EmprCod = new String[] {""} ;
      T01Q72_A840TrnCod = new short[1] ;
      T01Q72_A3108AlbDivCod = new byte[1] ;
      T01Q72_n3108AlbDivCod = new boolean[] {false} ;
      T01Q732_A3109AlbDivAbr = new String[] {""} ;
      T01Q732_n3109AlbDivAbr = new boolean[] {false} ;
      T01Q733_A1244GuiRemCln = new String[] {""} ;
      T01Q733_A3145GuiRemDivT = new String[] {""} ;
      T01Q733_n3145GuiRemDivT = new boolean[] {false} ;
      T01Q733_A3110GuiRemDiv = new byte[1] ;
      T01Q733_n3110GuiRemDiv = new boolean[] {false} ;
      T01Q734_A841TrnNom = new String[] {""} ;
      T01Q734_n841TrnNom = new boolean[] {false} ;
      T01Q734_A3643TrnNif = new String[] {""} ;
      T01Q734_n3643TrnNif = new boolean[] {false} ;
      T01Q735_A1260BusDomEnv = new byte[1] ;
      T01Q735_n1260BusDomEnv = new boolean[] {false} ;
      T01Q736_A841TrnNom = new String[] {""} ;
      T01Q736_n841TrnNom = new boolean[] {false} ;
      T01Q736_A3643TrnNif = new String[] {""} ;
      T01Q736_n3643TrnNif = new boolean[] {false} ;
      T01Q737_A396EmprCod = new String[] {""} ;
      T01Q737_A30AlbProCod = new long[1] ;
      T01Q737_A12185DltLinObs = new byte[1] ;
      T01Q738_A396EmprCod = new String[] {""} ;
      T01Q738_A30AlbProCod = new long[1] ;
      T01Q738_A12176DltHdr = new int[1] ;
      T01Q738_A12177DltR = new byte[1] ;
      T01Q738_A12178DltP = new String[] {""} ;
      T01Q739_A396EmprCod = new String[] {""} ;
      T01Q739_A30AlbProCod = new long[1] ;
      T01Q739_A7540Alb_NFisca = new String[] {""} ;
      T01Q740_A396EmprCod = new String[] {""} ;
      T01Q740_A30AlbProCod = new long[1] ;
      T01Q740_A129BarCod = new int[1] ;
      T01Q740_A132BarCodReo = new byte[1] ;
      T01Q740_A130BarCodPar = new String[] {""} ;
      T01Q741_A396EmprCod = new String[] {""} ;
      T01Q741_A30AlbProCod = new long[1] ;
      T01Q741_A915AlbPObsLin = new byte[1] ;
      T01Q742_A396EmprCod = new String[] {""} ;
      T01Q742_A30AlbProCod = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i34AlbProfch = GXutil.nullDate() ;
      i4023AlbFecSal = GXutil.nullDate() ;
      i7098AlbUsu = "" ;
      i10765AlbProAT = "" ;
      i10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13735CliCNom = "" ;
      T01Q743_A13735CliCNom = new String[] {""} ;
      T01Q744_A13735CliCNom = new String[] {""} ;
      l13738TrnCNom = "" ;
      T01Q745_A13738TrnCNom = new String[] {""} ;
      T01Q746_A13735CliCNom = new String[] {""} ;
      T01Q746_A396EmprCod = new String[] {""} ;
      T01Q746_A252CliCod = new int[1] ;
      T01Q747_A13735CliCNom = new String[] {""} ;
      T01Q747_A396EmprCod = new String[] {""} ;
      T01Q747_A252CliCod = new int[1] ;
      T01Q748_A13738TrnCNom = new String[] {""} ;
      T01Q748_A396EmprCod = new String[] {""} ;
      T01Q748_A840TrnCod = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_date11 = new java.util.Date[1] ;
      GXv_int8 = new int[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      T01Q749_A13735CliCNom = new String[] {""} ;
      T01Q749_A396EmprCod = new String[] {""} ;
      T01Q749_A252CliCod = new int[1] ;
      Zh3869AlbCliDes = "" ;
      T01Q750_A13735CliCNom = new String[] {""} ;
      T01Q750_A396EmprCod = new String[] {""} ;
      T01Q750_A252CliCod = new int[1] ;
      T01Q751_A13738TrnCNom = new String[] {""} ;
      T01Q751_A396EmprCod = new String[] {""} ;
      T01Q751_A840TrnCod = new short[1] ;
      T01Q752_A841TrnNom = new String[] {""} ;
      T01Q752_n841TrnNom = new boolean[] {false} ;
      T01Q752_A3643TrnNif = new String[] {""} ;
      T01Q752_n3643TrnNif = new boolean[] {false} ;
      Z841TrnNom = "" ;
      Z3643TrnNif = "" ;
      Zh840TrnCod = "" ;
      T01Q753_A13735CliCNom = new String[] {""} ;
      T01Q753_A396EmprCod = new String[] {""} ;
      T01Q753_A252CliCod = new int[1] ;
      T01Q754_A1244GuiRemCln = new String[] {""} ;
      T01Q754_A3145GuiRemDivT = new String[] {""} ;
      T01Q754_n3145GuiRemDivT = new boolean[] {false} ;
      T01Q754_A3110GuiRemDiv = new byte[1] ;
      T01Q754_n3110GuiRemDiv = new boolean[] {false} ;
      T01Q755_A3109AlbDivAbr = new String[] {""} ;
      T01Q755_n3109AlbDivAbr = new boolean[] {false} ;
      T01Q756_A841TrnNom = new String[] {""} ;
      T01Q756_n841TrnNom = new boolean[] {false} ;
      T01Q756_A3643TrnNif = new String[] {""} ;
      T01Q756_n3643TrnNif = new boolean[] {false} ;
      T01Q757_A1260BusDomEnv = new byte[1] ;
      T01Q757_n1260BusDomEnv = new boolean[] {false} ;
      Zh1243GuiRemCli = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.calprd_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.calprd_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.calprd_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.calprd_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.calprd_trn__default(),
         new Object[] {
             new Object[] {
            T01Q72_A30AlbProCod, T01Q72_A39AlbProPri, T01Q72_A33AlbProEst, T01Q72_A34AlbProfch, T01Q72_A4023AlbFecSal, T01Q72_A3865AlbHorSal, T01Q72_A7098AlbUsu, T01Q72_A3869AlbCliDes, T01Q72_A1259AlbDomEnv, T01Q72_n1259AlbDomEnv,
            T01Q72_A3868AlbMat, T01Q72_A2242AlbSec, T01Q72_A5805AlbEnvFtp, T01Q72_A7101AlbLic, T01Q72_A10765AlbProAT, T01Q72_A10019AlbHhfm, T01Q72_A10020AlbGrossT, T01Q72_A10837AlbTrnNc, T01Q72_A10017AlbFmd, T01Q72_n10017AlbFmd,
            T01Q72_A10835AlbTrnNm, T01Q72_A10018ALbFmdc, T01Q72_A10836AlbTrnDm, T01Q72_A5140AlbMarca, T01Q72_A3867AlbLocDes, T01Q72_A3866AlbLocCar, T01Q72_A914AlbPObsCon, T01Q72_A5141AlbIvaCod, T01Q72_A7987AlbColCa, T01Q72_A7162AlbDesp,
            T01Q72_A7986AlbCambio, T01Q72_A7985AlbTipDoc, T01Q72_A7984AlbMotTr, T01Q72_A5803AlbTipCal, T01Q72_A7988AlbObsCb, T01Q72_A7102AlbNumT, T01Q72_A7100AlbMarCo, T01Q72_A7099AlbOComp, T01Q72_A3093AlbDivTCod, T01Q72_n3093AlbDivTCod,
            T01Q72_A1258GuiRemDom, T01Q72_n1258GuiRemDom, T01Q72_A1253EmprGuiRem, T01Q72_A1243GuiRemCli, T01Q72_A396EmprCod, T01Q72_A840TrnCod, T01Q72_A3108AlbDivCod, T01Q72_n3108AlbDivCod
            }
            , new Object[] {
            T01Q73_A30AlbProCod, T01Q73_A39AlbProPri, T01Q73_A33AlbProEst, T01Q73_A34AlbProfch, T01Q73_A4023AlbFecSal, T01Q73_A3865AlbHorSal, T01Q73_A7098AlbUsu, T01Q73_A3869AlbCliDes, T01Q73_A1259AlbDomEnv, T01Q73_n1259AlbDomEnv,
            T01Q73_A3868AlbMat, T01Q73_A2242AlbSec, T01Q73_A5805AlbEnvFtp, T01Q73_A7101AlbLic, T01Q73_A10765AlbProAT, T01Q73_A10019AlbHhfm, T01Q73_A10020AlbGrossT, T01Q73_A10837AlbTrnNc, T01Q73_A10017AlbFmd, T01Q73_n10017AlbFmd,
            T01Q73_A10835AlbTrnNm, T01Q73_A10018ALbFmdc, T01Q73_A10836AlbTrnDm, T01Q73_A5140AlbMarca, T01Q73_A3867AlbLocDes, T01Q73_A3866AlbLocCar, T01Q73_A914AlbPObsCon, T01Q73_A5141AlbIvaCod, T01Q73_A7987AlbColCa, T01Q73_A7162AlbDesp,
            T01Q73_A7986AlbCambio, T01Q73_A7985AlbTipDoc, T01Q73_A7984AlbMotTr, T01Q73_A5803AlbTipCal, T01Q73_A7988AlbObsCb, T01Q73_A7102AlbNumT, T01Q73_A7100AlbMarCo, T01Q73_A7099AlbOComp, T01Q73_A3093AlbDivTCod, T01Q73_n3093AlbDivTCod,
            T01Q73_A1258GuiRemDom, T01Q73_n1258GuiRemDom, T01Q73_A1253EmprGuiRem, T01Q73_A1243GuiRemCli, T01Q73_A396EmprCod, T01Q73_A840TrnCod, T01Q73_A3108AlbDivCod, T01Q73_n3108AlbDivCod
            }
            , new Object[] {
            T01Q74_A1244GuiRemCln, T01Q74_A3145GuiRemDivT, T01Q74_n3145GuiRemDivT, T01Q74_A3110GuiRemDiv, T01Q74_n3110GuiRemDiv
            }
            , new Object[] {
            T01Q75_A407EmprNom, T01Q75_n407EmprNom
            }
            , new Object[] {
            T01Q76_A841TrnNom, T01Q76_n841TrnNom, T01Q76_A3643TrnNif, T01Q76_n3643TrnNif
            }
            , new Object[] {
            T01Q77_A841TrnNom, T01Q77_n841TrnNom, T01Q77_A3643TrnNif, T01Q77_n3643TrnNif
            }
            , new Object[] {
            T01Q78_A3109AlbDivAbr, T01Q78_n3109AlbDivAbr
            }
            , new Object[] {
            T01Q79_A1260BusDomEnv, T01Q79_n1260BusDomEnv
            }
            , new Object[] {
            T01Q710_A13738TrnCNom, T01Q710_A396EmprCod, T01Q710_A840TrnCod
            }
            , new Object[] {
            T01Q711_A13735CliCNom, T01Q711_A396EmprCod, T01Q711_A252CliCod
            }
            , new Object[] {
            T01Q712_A252CliCod, T01Q712_A266CliEnvLin, T01Q712_A30AlbProCod, T01Q712_A39AlbProPri, T01Q712_A33AlbProEst, T01Q712_A34AlbProfch, T01Q712_A4023AlbFecSal, T01Q712_A3865AlbHorSal, T01Q712_A7098AlbUsu, T01Q712_A1244GuiRemCln,
            T01Q712_A3869AlbCliDes, T01Q712_A1259AlbDomEnv, T01Q712_n1259AlbDomEnv, T01Q712_A3868AlbMat, T01Q712_A2242AlbSec, T01Q712_A5805AlbEnvFtp, T01Q712_A7101AlbLic, T01Q712_A10765AlbProAT, T01Q712_A10019AlbHhfm, T01Q712_A10020AlbGrossT,
            T01Q712_A10837AlbTrnNc, T01Q712_A10017AlbFmd, T01Q712_n10017AlbFmd, T01Q712_A10835AlbTrnNm, T01Q712_A10018ALbFmdc, T01Q712_A10836AlbTrnDm, T01Q712_A5140AlbMarca, T01Q712_A3867AlbLocDes, T01Q712_A3866AlbLocCar, T01Q712_A914AlbPObsCon,
            T01Q712_A5141AlbIvaCod, T01Q712_A7987AlbColCa, T01Q712_A7162AlbDesp, T01Q712_A7986AlbCambio, T01Q712_A7985AlbTipDoc, T01Q712_A7984AlbMotTr, T01Q712_A5803AlbTipCal, T01Q712_A7988AlbObsCb, T01Q712_A7102AlbNumT, T01Q712_A7100AlbMarCo,
            T01Q712_A7099AlbOComp, T01Q712_A3093AlbDivTCod, T01Q712_n3093AlbDivTCod, T01Q712_A3109AlbDivAbr, T01Q712_n3109AlbDivAbr, T01Q712_A1258GuiRemDom, T01Q712_n1258GuiRemDom, T01Q712_A3145GuiRemDivT, T01Q712_n3145GuiRemDivT, T01Q712_A407EmprNom,
            T01Q712_n407EmprNom, T01Q712_A1253EmprGuiRem, T01Q712_A1243GuiRemCli, T01Q712_A396EmprCod, T01Q712_A840TrnCod, T01Q712_A3108AlbDivCod, T01Q712_n3108AlbDivCod, T01Q712_A3110GuiRemDiv, T01Q712_n3110GuiRemDiv, T01Q712_A1260BusDomEnv,
            T01Q712_n1260BusDomEnv
            }
            , new Object[] {
            T01Q713_A13735CliCNom, T01Q713_A396EmprCod, T01Q713_A252CliCod
            }
            , new Object[] {
            T01Q714_A13735CliCNom, T01Q714_A396EmprCod, T01Q714_A252CliCod
            }
            , new Object[] {
            T01Q715_A13735CliCNom, T01Q715_A396EmprCod, T01Q715_A252CliCod
            }
            , new Object[] {
            T01Q716_A13738TrnCNom, T01Q716_A396EmprCod, T01Q716_A840TrnCod
            }
            , new Object[] {
            T01Q717_A13738TrnCNom, T01Q717_A396EmprCod, T01Q717_A840TrnCod
            }
            , new Object[] {
            T01Q718_A13738TrnCNom, T01Q718_A396EmprCod, T01Q718_A840TrnCod
            }
            , new Object[] {
            T01Q719_A13735CliCNom, T01Q719_A396EmprCod, T01Q719_A252CliCod
            }
            , new Object[] {
            T01Q720_A1244GuiRemCln, T01Q720_A3145GuiRemDivT, T01Q720_n3145GuiRemDivT, T01Q720_A3110GuiRemDiv, T01Q720_n3110GuiRemDiv
            }
            , new Object[] {
            T01Q721_A1260BusDomEnv, T01Q721_n1260BusDomEnv
            }
            , new Object[] {
            T01Q722_A841TrnNom, T01Q722_n841TrnNom, T01Q722_A3643TrnNif, T01Q722_n3643TrnNif
            }
            , new Object[] {
            T01Q723_A841TrnNom, T01Q723_n841TrnNom, T01Q723_A3643TrnNif, T01Q723_n3643TrnNif
            }
            , new Object[] {
            T01Q724_A3109AlbDivAbr, T01Q724_n3109AlbDivAbr
            }
            , new Object[] {
            T01Q725_A396EmprCod, T01Q725_A30AlbProCod
            }
            , new Object[] {
            T01Q726_A396EmprCod, T01Q726_A30AlbProCod
            }
            , new Object[] {
            T01Q727_A396EmprCod, T01Q727_A30AlbProCod
            }
            , new Object[] {
            T01Q728_A13738TrnCNom, T01Q728_A396EmprCod, T01Q728_A840TrnCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01Q732_A3109AlbDivAbr, T01Q732_n3109AlbDivAbr
            }
            , new Object[] {
            T01Q733_A1244GuiRemCln, T01Q733_A3145GuiRemDivT, T01Q733_n3145GuiRemDivT, T01Q733_A3110GuiRemDiv, T01Q733_n3110GuiRemDiv
            }
            , new Object[] {
            T01Q734_A841TrnNom, T01Q734_n841TrnNom, T01Q734_A3643TrnNif, T01Q734_n3643TrnNif
            }
            , new Object[] {
            T01Q735_A1260BusDomEnv, T01Q735_n1260BusDomEnv
            }
            , new Object[] {
            T01Q736_A841TrnNom, T01Q736_n841TrnNom, T01Q736_A3643TrnNif, T01Q736_n3643TrnNif
            }
            , new Object[] {
            T01Q737_A396EmprCod, T01Q737_A30AlbProCod, T01Q737_A12185DltLinObs
            }
            , new Object[] {
            T01Q738_A396EmprCod, T01Q738_A30AlbProCod, T01Q738_A12176DltHdr, T01Q738_A12177DltR, T01Q738_A12178DltP
            }
            , new Object[] {
            T01Q739_A396EmprCod, T01Q739_A30AlbProCod, T01Q739_A7540Alb_NFisca
            }
            , new Object[] {
            T01Q740_A396EmprCod, T01Q740_A30AlbProCod, T01Q740_A129BarCod, T01Q740_A132BarCodReo, T01Q740_A130BarCodPar
            }
            , new Object[] {
            T01Q741_A396EmprCod, T01Q741_A30AlbProCod, T01Q741_A915AlbPObsLin
            }
            , new Object[] {
            T01Q742_A396EmprCod, T01Q742_A30AlbProCod
            }
            , new Object[] {
            T01Q743_A13735CliCNom
            }
            , new Object[] {
            T01Q744_A13735CliCNom
            }
            , new Object[] {
            T01Q745_A13738TrnCNom
            }
            , new Object[] {
            T01Q746_A13735CliCNom, T01Q746_A396EmprCod, T01Q746_A252CliCod
            }
            , new Object[] {
            T01Q747_A13735CliCNom, T01Q747_A396EmprCod, T01Q747_A252CliCod
            }
            , new Object[] {
            T01Q748_A13738TrnCNom, T01Q748_A396EmprCod, T01Q748_A840TrnCod
            }
            , new Object[] {
            T01Q749_A13735CliCNom, T01Q749_A396EmprCod, T01Q749_A252CliCod
            }
            , new Object[] {
            T01Q750_A13735CliCNom, T01Q750_A396EmprCod, T01Q750_A252CliCod
            }
            , new Object[] {
            T01Q751_A13738TrnCNom, T01Q751_A396EmprCod, T01Q751_A840TrnCod
            }
            , new Object[] {
            T01Q752_A841TrnNom, T01Q752_n841TrnNom, T01Q752_A3643TrnNif, T01Q752_n3643TrnNif
            }
            , new Object[] {
            T01Q753_A13735CliCNom, T01Q753_A396EmprCod, T01Q753_A252CliCod
            }
            , new Object[] {
            T01Q754_A1244GuiRemCln, T01Q754_A3145GuiRemDivT, T01Q754_n3145GuiRemDivT, T01Q754_A3110GuiRemDiv, T01Q754_n3110GuiRemDiv
            }
            , new Object[] {
            T01Q755_A3109AlbDivAbr, T01Q755_n3109AlbDivAbr
            }
            , new Object[] {
            T01Q756_A841TrnNom, T01Q756_n841TrnNom, T01Q756_A3643TrnNif, T01Q756_n3643TrnNif
            }
            , new Object[] {
            T01Q757_A1260BusDomEnv, T01Q757_n1260BusDomEnv
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "Calprd_TRN" ;
      Z10019AlbHhfm = GXutil.serverNow( context, remoteHandle, pr_default) ;
      A10019AlbHhfm = GXutil.serverNow( context, remoteHandle, pr_default) ;
      i10019AlbHhfm = GXutil.serverNow( context, remoteHandle, pr_default) ;
      Z10765AlbProAT = " " ;
      A10765AlbProAT = " " ;
      i10765AlbProAT = " " ;
      Z7098AlbUsu = "" ;
      A7098AlbUsu = "" ;
      i7098AlbUsu = "" ;
      Z3869AlbCliDes = 0 ;
      A3869AlbCliDes = 0 ;
      Z3093AlbDivTCod = "" ;
      n3093AlbDivTCod = false ;
      A3093AlbDivTCod = "" ;
      n3093AlbDivTCod = false ;
      Z3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      N3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      A3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      Z3093AlbDivTCod = "" ;
      n3093AlbDivTCod = false ;
      A3093AlbDivTCod = "" ;
      n3093AlbDivTCod = false ;
      Z3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      N3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      A3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      Z4023AlbFecSal = GXutil.serverDate( context, remoteHandle, pr_default) ;
      A4023AlbFecSal = GXutil.serverDate( context, remoteHandle, pr_default) ;
      i4023AlbFecSal = GXutil.serverDate( context, remoteHandle, pr_default) ;
      Z34AlbProfch = GXutil.serverDate( context, remoteHandle, pr_default) ;
      i34AlbProfch = GXutil.serverDate( context, remoteHandle, pr_default) ;
      A34AlbProfch = GXutil.serverDate( context, remoteHandle, pr_default) ;
   }

   private byte Z33AlbProEst ;
   private byte Z1259AlbDomEnv ;
   private byte Z5805AlbEnvFtp ;
   private byte Z3867AlbLocDes ;
   private byte Z3866AlbLocCar ;
   private byte Z914AlbPObsCon ;
   private byte Z5803AlbTipCal ;
   private byte Z1258GuiRemDom ;
   private byte Z3108AlbDivCod ;
   private byte N3108AlbDivCod ;
   private byte GxWebError ;
   private byte A1259AlbDomEnv ;
   private byte A3108AlbDivCod ;
   private byte nKeyPressed ;
   private byte A33AlbProEst ;
   private byte A5805AlbEnvFtp ;
   private byte A3867AlbLocDes ;
   private byte A3866AlbLocCar ;
   private byte A914AlbPObsCon ;
   private byte A5803AlbTipCal ;
   private byte A1260BusDomEnv ;
   private byte A1258GuiRemDom ;
   private byte A3110GuiRemDiv ;
   private byte AV17Insert_AlbDivCod ;
   private byte Gx_BScreen ;
   private byte Z3110GuiRemDiv ;
   private byte Z1260BusDomEnv ;
   private byte gxajaxcallmode ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private short Z840TrnCod ;
   private short N840TrnCod ;
   private short AV31Ctrlf ;
   private short A840TrnCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV16Insert_TrnCod ;
   private short AV24FirmaD ;
   private short AV25avisar ;
   private short RcdFound3 ;
   private short nIsDirty_3 ;
   private short gxhchits ;
   private int Z3869AlbCliDes ;
   private int Z7162AlbDesp ;
   private int Z7985AlbTipDoc ;
   private int Z1243GuiRemCli ;
   private int N1243GuiRemCli ;
   private int A1243GuiRemCli ;
   private int trnEnded ;
   private int edtAlbProCod_Enabled ;
   private int edtAlbProfch_Enabled ;
   private int edtAlbFecSal_Enabled ;
   private int edtAlbHorSal_Enabled ;
   private int edtAlbUsu_Enabled ;
   private int edtGuiRemCli_Enabled ;
   private int edtAlbCliDes_Enabled ;
   private int edtAlbDomEnv_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtAlbMat_Enabled ;
   private int edtAlbLic_Enabled ;
   private int edtAlbHhfm_Enabled ;
   private int edtAlbGrossT_Enabled ;
   private int edtAlbFmd_Enabled ;
   private int divUnnamedtable6_Visible ;
   private int edtAlbTrnNm_Visible ;
   private int edtAlbTrnNm_Enabled ;
   private int edtAlbTrnNc_Visible ;
   private int edtAlbTrnNc_Enabled ;
   private int edtAlbTrnDm_Visible ;
   private int edtAlbTrnDm_Enabled ;
   private int edtALbFmdc_Enabled ;
   private int edtAlbLocDes_Enabled ;
   private int edtAlbLocCar_Enabled ;
   private int edtAlbPObsCon_Enabled ;
   private int edtAlbIvaCod_Enabled ;
   private int edtAlbColCa_Enabled ;
   private int A7162AlbDesp ;
   private int edtAlbDesp_Enabled ;
   private int edtAlbCambio_Enabled ;
   private int A7985AlbTipDoc ;
   private int edtAlbTipDoc_Enabled ;
   private int edtAlbMotTr_Enabled ;
   private int edtAlbTipCal_Enabled ;
   private int edtAlbObsCb_Enabled ;
   private int edtAlbNumT_Enabled ;
   private int edtAlbMarCo_Enabled ;
   private int edtAlbOComp_Enabled ;
   private int edtTrnNif_Enabled ;
   private int edtAlbDivAbr_Enabled ;
   private int edtAlbDivCod_Enabled ;
   private int edtBusDomEnv_Enabled ;
   private int edtEmprGuiRem_Enabled ;
   private int edtGuiRemDom_Enabled ;
   private int edtGuiRemDiv_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtEmprCod_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtAlbMarca_Visible ;
   private int edtAlbMarca_Enabled ;
   private int edtGuiRemCln_Visible ;
   private int edtGuiRemCln_Enabled ;
   private int edtTrnNom_Visible ;
   private int edtTrnNom_Enabled ;
   private int AV15Insert_GuiRemCli ;
   private int A3869AlbCliDes ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int GXt_int7 ;
   private int AV34GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int gxdynajaxindex ;
   private int A252CliCod ;
   private int GXv_int8[] ;
   private long wcpOAV11AlbProCod ;
   private long Z30AlbProCod ;
   private long Z7102AlbNumT ;
   private long A30AlbProCod ;
   private long AV29AlbLast ;
   private long AV11AlbProCod ;
   private long A7102AlbNumT ;
   private java.math.BigDecimal Z10020AlbGrossT ;
   private java.math.BigDecimal Z7986AlbCambio ;
   private java.math.BigDecimal A10020AlbGrossT ;
   private java.math.BigDecimal A7986AlbCambio ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV10EmprCod ;
   private String wcpOAV20AlbProPri ;
   private String wcpOAV21AlbSec ;
   private String wcpOAV26ContCod ;
   private String Z396EmprCod ;
   private String Z39AlbProPri ;
   private String Z3865AlbHorSal ;
   private String Z7098AlbUsu ;
   private String Z3868AlbMat ;
   private String Z2242AlbSec ;
   private String Z7101AlbLic ;
   private String Z10765AlbProAT ;
   private String Z10837AlbTrnNc ;
   private String Z10835AlbTrnNm ;
   private String Z10018ALbFmdc ;
   private String Z10836AlbTrnDm ;
   private String Z5140AlbMarca ;
   private String Z5141AlbIvaCod ;
   private String Z7987AlbColCa ;
   private String Z7984AlbMotTr ;
   private String Z7988AlbObsCb ;
   private String Z7100AlbMarCo ;
   private String Z7099AlbOComp ;
   private String Z3093AlbDivTCod ;
   private String Z1253EmprGuiRem ;
   private String N1253EmprGuiRem ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV26ContCod ;
   private String Gx_mode ;
   private String A39AlbProPri ;
   private String A1253EmprGuiRem ;
   private String AV10EmprCod ;
   private String AV20AlbProPri ;
   private String AV21AlbSec ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbProCod_Internalname ;
   private String A2242AlbSec ;
   private String A10765AlbProAT ;
   private String A3093AlbDivTCod ;
   private String A3145GuiRemDivT ;
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
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String edtAlbProCod_Jsonclick ;
   private String divAlbsec_cell_Internalname ;
   private String divAlbsec_cell_Class ;
   private String divUnnamedtable2_Internalname ;
   private String edtAlbProfch_Internalname ;
   private String edtAlbProfch_Jsonclick ;
   private String edtAlbFecSal_Internalname ;
   private String edtAlbFecSal_Jsonclick ;
   private String edtAlbHorSal_Internalname ;
   private String A3865AlbHorSal ;
   private String edtAlbHorSal_Jsonclick ;
   private String edtAlbUsu_Internalname ;
   private String A7098AlbUsu ;
   private String edtAlbUsu_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtGuiRemCli_Internalname ;
   private String edtGuiRemCli_Jsonclick ;
   private String edtAlbCliDes_Internalname ;
   private String edtAlbCliDes_Jsonclick ;
   private String edtAlbDomEnv_Internalname ;
   private String edtAlbDomEnv_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtAlbMat_Internalname ;
   private String A3868AlbMat ;
   private String edtAlbMat_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String grpUnnamedgroup8_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String edtAlbLic_Internalname ;
   private String A7101AlbLic ;
   private String edtAlbLic_Jsonclick ;
   private String divUnnamedtable10_Internalname ;
   private String edtAlbHhfm_Internalname ;
   private String edtAlbHhfm_Jsonclick ;
   private String edtAlbGrossT_Internalname ;
   private String edtAlbGrossT_Jsonclick ;
   private String edtAlbFmd_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String divAlbtrnnm_cell_Internalname ;
   private String divAlbtrnnm_cell_Class ;
   private String edtAlbTrnNm_Internalname ;
   private String A10835AlbTrnNm ;
   private String edtAlbTrnNm_Jsonclick ;
   private String divAlbtrnnc_cell_Internalname ;
   private String divAlbtrnnc_cell_Class ;
   private String edtAlbTrnNc_Internalname ;
   private String A10837AlbTrnNc ;
   private String edtAlbTrnNc_Jsonclick ;
   private String divAlbtrndm_cell_Internalname ;
   private String divAlbtrndm_cell_Class ;
   private String edtAlbTrnDm_Internalname ;
   private String A10836AlbTrnDm ;
   private String edtAlbTrnDm_Jsonclick ;
   private String edtALbFmdc_Internalname ;
   private String A10018ALbFmdc ;
   private String edtAlbLocDes_Internalname ;
   private String edtAlbLocDes_Jsonclick ;
   private String edtAlbLocCar_Internalname ;
   private String edtAlbLocCar_Jsonclick ;
   private String edtAlbPObsCon_Internalname ;
   private String edtAlbPObsCon_Jsonclick ;
   private String edtAlbIvaCod_Internalname ;
   private String A5141AlbIvaCod ;
   private String edtAlbIvaCod_Jsonclick ;
   private String edtAlbColCa_Internalname ;
   private String A7987AlbColCa ;
   private String edtAlbColCa_Jsonclick ;
   private String edtAlbDesp_Internalname ;
   private String edtAlbDesp_Jsonclick ;
   private String edtAlbCambio_Internalname ;
   private String edtAlbCambio_Jsonclick ;
   private String edtAlbTipDoc_Internalname ;
   private String edtAlbTipDoc_Jsonclick ;
   private String edtAlbMotTr_Internalname ;
   private String A7984AlbMotTr ;
   private String edtAlbMotTr_Jsonclick ;
   private String edtAlbTipCal_Internalname ;
   private String edtAlbTipCal_Jsonclick ;
   private String edtAlbObsCb_Internalname ;
   private String A7988AlbObsCb ;
   private String edtAlbObsCb_Jsonclick ;
   private String edtAlbNumT_Internalname ;
   private String edtAlbNumT_Jsonclick ;
   private String edtAlbMarCo_Internalname ;
   private String A7100AlbMarCo ;
   private String edtAlbMarCo_Jsonclick ;
   private String edtAlbOComp_Internalname ;
   private String A7099AlbOComp ;
   private String edtAlbOComp_Jsonclick ;
   private String edtTrnNif_Internalname ;
   private String A3643TrnNif ;
   private String edtTrnNif_Jsonclick ;
   private String edtAlbDivAbr_Internalname ;
   private String A3109AlbDivAbr ;
   private String edtAlbDivAbr_Jsonclick ;
   private String edtAlbDivCod_Internalname ;
   private String edtAlbDivCod_Jsonclick ;
   private String edtBusDomEnv_Internalname ;
   private String edtBusDomEnv_Jsonclick ;
   private String edtEmprGuiRem_Internalname ;
   private String edtEmprGuiRem_Jsonclick ;
   private String edtGuiRemDom_Internalname ;
   private String edtGuiRemDom_Jsonclick ;
   private String edtGuiRemDiv_Internalname ;
   private String edtGuiRemDiv_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtAlbMarca_Internalname ;
   private String A5140AlbMarca ;
   private String edtAlbMarca_Jsonclick ;
   private String edtGuiRemCln_Internalname ;
   private String A1244GuiRemCln ;
   private String edtGuiRemCln_Jsonclick ;
   private String edtTrnNom_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Jsonclick ;
   private String AV18Insert_EmprGuiRem ;
   private String AV9UsurCod ;
   private String AV33Pgmname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode3 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV7Station ;
   private String AV8EmprNom ;
   private String GXt_char1 ;
   private String Z407EmprNom ;
   private String Z3109AlbDivAbr ;
   private String Z1244GuiRemCln ;
   private String Z3145GuiRemDivT ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i7098AlbUsu ;
   private String i10765AlbProAT ;
   private String gxwrpcisep ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z841TrnNom ;
   private String Z3643TrnNif ;
   private java.util.Date Z10019AlbHhfm ;
   private java.util.Date A10019AlbHhfm ;
   private java.util.Date i10019AlbHhfm ;
   private java.util.Date Z34AlbProfch ;
   private java.util.Date Z4023AlbFecSal ;
   private java.util.Date AV28Fch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date i34AlbProfch ;
   private java.util.Date i4023AlbFecSal ;
   private java.util.Date GXv_date11[] ;
   private java.util.Date GXv_date10[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n1259AlbDomEnv ;
   private boolean n3108AlbDivCod ;
   private boolean wbErr ;
   private boolean n3093AlbDivTCod ;
   private boolean n3145GuiRemDivT ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n10017AlbFmd ;
   private boolean n3643TrnNif ;
   private boolean n3109AlbDivAbr ;
   private boolean n1260BusDomEnv ;
   private boolean n1258GuiRemDom ;
   private boolean n3110GuiRemDiv ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z10017AlbFmd ;
   private String AV27Msg_f ;
   private String A13735CliCNom ;
   private String A13738TrnCNom ;
   private String h1243GuiRemCli ;
   private String h3869AlbCliDes ;
   private String h840TrnCod ;
   private String A10017AlbFmd ;
   private String l13735CliCNom ;
   private String l13738TrnCNom ;
   private String Zh3869AlbCliDes ;
   private String Zh840TrnCod ;
   private String Zh1243GuiRemCli ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV14WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbProPri ;
   private HTMLChoice cmbAlbProEst ;
   private HTMLChoice cmbAlbSec ;
   private HTMLChoice cmbAlbEnvFtp ;
   private HTMLChoice cmbAlbProAT ;
   private HTMLChoice cmbAlbDivTCod ;
   private HTMLChoice cmbGuiRemDivT ;
   private IDataStoreProvider pr_default ;
   private String[] T01Q75_A407EmprNom ;
   private boolean[] T01Q75_n407EmprNom ;
   private String[] T01Q710_A13738TrnCNom ;
   private String[] T01Q710_A396EmprCod ;
   private short[] T01Q710_A840TrnCod ;
   private String[] T01Q711_A13735CliCNom ;
   private String[] T01Q711_A396EmprCod ;
   private int[] T01Q711_A252CliCod ;
   private String[] T01Q76_A841TrnNom ;
   private boolean[] T01Q76_n841TrnNom ;
   private String[] T01Q76_A3643TrnNif ;
   private boolean[] T01Q76_n3643TrnNif ;
   private String[] T01Q77_A841TrnNom ;
   private boolean[] T01Q77_n841TrnNom ;
   private String[] T01Q77_A3643TrnNif ;
   private boolean[] T01Q77_n3643TrnNif ;
   private String[] T01Q74_A1244GuiRemCln ;
   private String[] T01Q74_A3145GuiRemDivT ;
   private boolean[] T01Q74_n3145GuiRemDivT ;
   private byte[] T01Q74_A3110GuiRemDiv ;
   private boolean[] T01Q74_n3110GuiRemDiv ;
   private int[] T01Q712_A252CliCod ;
   private byte[] T01Q712_A266CliEnvLin ;
   private long[] T01Q712_A30AlbProCod ;
   private String[] T01Q712_A39AlbProPri ;
   private byte[] T01Q712_A33AlbProEst ;
   private java.util.Date[] T01Q712_A34AlbProfch ;
   private java.util.Date[] T01Q712_A4023AlbFecSal ;
   private String[] T01Q712_A3865AlbHorSal ;
   private String[] T01Q712_A7098AlbUsu ;
   private String[] T01Q712_A1244GuiRemCln ;
   private int[] T01Q712_A3869AlbCliDes ;
   private byte[] T01Q712_A1259AlbDomEnv ;
   private boolean[] T01Q712_n1259AlbDomEnv ;
   private String[] T01Q712_A3868AlbMat ;
   private String[] T01Q712_A2242AlbSec ;
   private byte[] T01Q712_A5805AlbEnvFtp ;
   private String[] T01Q712_A7101AlbLic ;
   private String[] T01Q712_A10765AlbProAT ;
   private java.util.Date[] T01Q712_A10019AlbHhfm ;
   private java.math.BigDecimal[] T01Q712_A10020AlbGrossT ;
   private String[] T01Q712_A10837AlbTrnNc ;
   private String[] T01Q712_A10017AlbFmd ;
   private boolean[] T01Q712_n10017AlbFmd ;
   private String[] T01Q712_A10835AlbTrnNm ;
   private String[] T01Q712_A10018ALbFmdc ;
   private String[] T01Q712_A10836AlbTrnDm ;
   private String[] T01Q712_A5140AlbMarca ;
   private byte[] T01Q712_A3867AlbLocDes ;
   private byte[] T01Q712_A3866AlbLocCar ;
   private byte[] T01Q712_A914AlbPObsCon ;
   private String[] T01Q712_A5141AlbIvaCod ;
   private String[] T01Q712_A7987AlbColCa ;
   private int[] T01Q712_A7162AlbDesp ;
   private java.math.BigDecimal[] T01Q712_A7986AlbCambio ;
   private int[] T01Q712_A7985AlbTipDoc ;
   private String[] T01Q712_A7984AlbMotTr ;
   private byte[] T01Q712_A5803AlbTipCal ;
   private String[] T01Q712_A7988AlbObsCb ;
   private long[] T01Q712_A7102AlbNumT ;
   private String[] T01Q712_A7100AlbMarCo ;
   private String[] T01Q712_A7099AlbOComp ;
   private String[] T01Q712_A3093AlbDivTCod ;
   private boolean[] T01Q712_n3093AlbDivTCod ;
   private String[] T01Q712_A3109AlbDivAbr ;
   private boolean[] T01Q712_n3109AlbDivAbr ;
   private byte[] T01Q712_A1258GuiRemDom ;
   private boolean[] T01Q712_n1258GuiRemDom ;
   private String[] T01Q712_A3145GuiRemDivT ;
   private boolean[] T01Q712_n3145GuiRemDivT ;
   private String[] T01Q712_A407EmprNom ;
   private boolean[] T01Q712_n407EmprNom ;
   private String[] T01Q712_A1253EmprGuiRem ;
   private int[] T01Q712_A1243GuiRemCli ;
   private String[] T01Q712_A396EmprCod ;
   private short[] T01Q712_A840TrnCod ;
   private byte[] T01Q712_A3108AlbDivCod ;
   private boolean[] T01Q712_n3108AlbDivCod ;
   private byte[] T01Q712_A3110GuiRemDiv ;
   private boolean[] T01Q712_n3110GuiRemDiv ;
   private byte[] T01Q712_A1260BusDomEnv ;
   private boolean[] T01Q712_n1260BusDomEnv ;
   private String[] T01Q713_A13735CliCNom ;
   private String[] T01Q713_A396EmprCod ;
   private int[] T01Q713_A252CliCod ;
   private String[] T01Q714_A13735CliCNom ;
   private String[] T01Q714_A396EmprCod ;
   private int[] T01Q714_A252CliCod ;
   private String[] T01Q715_A13735CliCNom ;
   private String[] T01Q715_A396EmprCod ;
   private int[] T01Q715_A252CliCod ;
   private String[] T01Q716_A13738TrnCNom ;
   private String[] T01Q716_A396EmprCod ;
   private short[] T01Q716_A840TrnCod ;
   private String[] T01Q717_A13738TrnCNom ;
   private String[] T01Q717_A396EmprCod ;
   private short[] T01Q717_A840TrnCod ;
   private byte[] T01Q79_A1260BusDomEnv ;
   private boolean[] T01Q79_n1260BusDomEnv ;
   private String[] T01Q718_A13738TrnCNom ;
   private String[] T01Q718_A396EmprCod ;
   private short[] T01Q718_A840TrnCod ;
   private String[] T01Q719_A13735CliCNom ;
   private String[] T01Q719_A396EmprCod ;
   private int[] T01Q719_A252CliCod ;
   private String[] T01Q78_A3109AlbDivAbr ;
   private boolean[] T01Q78_n3109AlbDivAbr ;
   private String[] T01Q720_A1244GuiRemCln ;
   private String[] T01Q720_A3145GuiRemDivT ;
   private boolean[] T01Q720_n3145GuiRemDivT ;
   private byte[] T01Q720_A3110GuiRemDiv ;
   private boolean[] T01Q720_n3110GuiRemDiv ;
   private byte[] T01Q721_A1260BusDomEnv ;
   private boolean[] T01Q721_n1260BusDomEnv ;
   private String[] T01Q722_A841TrnNom ;
   private boolean[] T01Q722_n841TrnNom ;
   private String[] T01Q722_A3643TrnNif ;
   private boolean[] T01Q722_n3643TrnNif ;
   private String[] T01Q723_A841TrnNom ;
   private boolean[] T01Q723_n841TrnNom ;
   private String[] T01Q723_A3643TrnNif ;
   private boolean[] T01Q723_n3643TrnNif ;
   private String[] T01Q724_A3109AlbDivAbr ;
   private boolean[] T01Q724_n3109AlbDivAbr ;
   private String[] T01Q725_A396EmprCod ;
   private long[] T01Q725_A30AlbProCod ;
   private long[] T01Q73_A30AlbProCod ;
   private String[] T01Q73_A39AlbProPri ;
   private byte[] T01Q73_A33AlbProEst ;
   private java.util.Date[] T01Q73_A34AlbProfch ;
   private java.util.Date[] T01Q73_A4023AlbFecSal ;
   private String[] T01Q73_A3865AlbHorSal ;
   private String[] T01Q73_A7098AlbUsu ;
   private int[] T01Q73_A3869AlbCliDes ;
   private byte[] T01Q73_A1259AlbDomEnv ;
   private boolean[] T01Q73_n1259AlbDomEnv ;
   private String[] T01Q73_A3868AlbMat ;
   private String[] T01Q73_A2242AlbSec ;
   private byte[] T01Q73_A5805AlbEnvFtp ;
   private String[] T01Q73_A7101AlbLic ;
   private String[] T01Q73_A10765AlbProAT ;
   private java.util.Date[] T01Q73_A10019AlbHhfm ;
   private java.math.BigDecimal[] T01Q73_A10020AlbGrossT ;
   private String[] T01Q73_A10837AlbTrnNc ;
   private String[] T01Q73_A10017AlbFmd ;
   private boolean[] T01Q73_n10017AlbFmd ;
   private String[] T01Q73_A10835AlbTrnNm ;
   private String[] T01Q73_A10018ALbFmdc ;
   private String[] T01Q73_A10836AlbTrnDm ;
   private String[] T01Q73_A5140AlbMarca ;
   private byte[] T01Q73_A3867AlbLocDes ;
   private byte[] T01Q73_A3866AlbLocCar ;
   private byte[] T01Q73_A914AlbPObsCon ;
   private String[] T01Q73_A5141AlbIvaCod ;
   private String[] T01Q73_A7987AlbColCa ;
   private int[] T01Q73_A7162AlbDesp ;
   private java.math.BigDecimal[] T01Q73_A7986AlbCambio ;
   private int[] T01Q73_A7985AlbTipDoc ;
   private String[] T01Q73_A7984AlbMotTr ;
   private byte[] T01Q73_A5803AlbTipCal ;
   private String[] T01Q73_A7988AlbObsCb ;
   private long[] T01Q73_A7102AlbNumT ;
   private String[] T01Q73_A7100AlbMarCo ;
   private String[] T01Q73_A7099AlbOComp ;
   private String[] T01Q73_A3093AlbDivTCod ;
   private boolean[] T01Q73_n3093AlbDivTCod ;
   private byte[] T01Q73_A1258GuiRemDom ;
   private boolean[] T01Q73_n1258GuiRemDom ;
   private String[] T01Q73_A1253EmprGuiRem ;
   private int[] T01Q73_A1243GuiRemCli ;
   private String[] T01Q73_A396EmprCod ;
   private short[] T01Q73_A840TrnCod ;
   private byte[] T01Q73_A3108AlbDivCod ;
   private boolean[] T01Q73_n3108AlbDivCod ;
   private String[] T01Q726_A396EmprCod ;
   private long[] T01Q726_A30AlbProCod ;
   private String[] T01Q727_A396EmprCod ;
   private long[] T01Q727_A30AlbProCod ;
   private String[] T01Q728_A13738TrnCNom ;
   private String[] T01Q728_A396EmprCod ;
   private short[] T01Q728_A840TrnCod ;
   private long[] T01Q72_A30AlbProCod ;
   private String[] T01Q72_A39AlbProPri ;
   private byte[] T01Q72_A33AlbProEst ;
   private java.util.Date[] T01Q72_A34AlbProfch ;
   private java.util.Date[] T01Q72_A4023AlbFecSal ;
   private String[] T01Q72_A3865AlbHorSal ;
   private String[] T01Q72_A7098AlbUsu ;
   private int[] T01Q72_A3869AlbCliDes ;
   private byte[] T01Q72_A1259AlbDomEnv ;
   private boolean[] T01Q72_n1259AlbDomEnv ;
   private String[] T01Q72_A3868AlbMat ;
   private String[] T01Q72_A2242AlbSec ;
   private byte[] T01Q72_A5805AlbEnvFtp ;
   private String[] T01Q72_A7101AlbLic ;
   private String[] T01Q72_A10765AlbProAT ;
   private java.util.Date[] T01Q72_A10019AlbHhfm ;
   private java.math.BigDecimal[] T01Q72_A10020AlbGrossT ;
   private String[] T01Q72_A10837AlbTrnNc ;
   private String[] T01Q72_A10017AlbFmd ;
   private boolean[] T01Q72_n10017AlbFmd ;
   private String[] T01Q72_A10835AlbTrnNm ;
   private String[] T01Q72_A10018ALbFmdc ;
   private String[] T01Q72_A10836AlbTrnDm ;
   private String[] T01Q72_A5140AlbMarca ;
   private byte[] T01Q72_A3867AlbLocDes ;
   private byte[] T01Q72_A3866AlbLocCar ;
   private byte[] T01Q72_A914AlbPObsCon ;
   private String[] T01Q72_A5141AlbIvaCod ;
   private String[] T01Q72_A7987AlbColCa ;
   private int[] T01Q72_A7162AlbDesp ;
   private java.math.BigDecimal[] T01Q72_A7986AlbCambio ;
   private int[] T01Q72_A7985AlbTipDoc ;
   private String[] T01Q72_A7984AlbMotTr ;
   private byte[] T01Q72_A5803AlbTipCal ;
   private String[] T01Q72_A7988AlbObsCb ;
   private long[] T01Q72_A7102AlbNumT ;
   private String[] T01Q72_A7100AlbMarCo ;
   private String[] T01Q72_A7099AlbOComp ;
   private String[] T01Q72_A3093AlbDivTCod ;
   private boolean[] T01Q72_n3093AlbDivTCod ;
   private byte[] T01Q72_A1258GuiRemDom ;
   private boolean[] T01Q72_n1258GuiRemDom ;
   private String[] T01Q72_A1253EmprGuiRem ;
   private int[] T01Q72_A1243GuiRemCli ;
   private String[] T01Q72_A396EmprCod ;
   private short[] T01Q72_A840TrnCod ;
   private byte[] T01Q72_A3108AlbDivCod ;
   private boolean[] T01Q72_n3108AlbDivCod ;
   private String[] T01Q732_A3109AlbDivAbr ;
   private boolean[] T01Q732_n3109AlbDivAbr ;
   private String[] T01Q733_A1244GuiRemCln ;
   private String[] T01Q733_A3145GuiRemDivT ;
   private boolean[] T01Q733_n3145GuiRemDivT ;
   private byte[] T01Q733_A3110GuiRemDiv ;
   private boolean[] T01Q733_n3110GuiRemDiv ;
   private String[] T01Q734_A841TrnNom ;
   private boolean[] T01Q734_n841TrnNom ;
   private String[] T01Q734_A3643TrnNif ;
   private boolean[] T01Q734_n3643TrnNif ;
   private byte[] T01Q735_A1260BusDomEnv ;
   private boolean[] T01Q735_n1260BusDomEnv ;
   private String[] T01Q736_A841TrnNom ;
   private boolean[] T01Q736_n841TrnNom ;
   private String[] T01Q736_A3643TrnNif ;
   private boolean[] T01Q736_n3643TrnNif ;
   private String[] T01Q737_A396EmprCod ;
   private long[] T01Q737_A30AlbProCod ;
   private byte[] T01Q737_A12185DltLinObs ;
   private String[] T01Q738_A396EmprCod ;
   private long[] T01Q738_A30AlbProCod ;
   private int[] T01Q738_A12176DltHdr ;
   private byte[] T01Q738_A12177DltR ;
   private String[] T01Q738_A12178DltP ;
   private String[] T01Q739_A396EmprCod ;
   private long[] T01Q739_A30AlbProCod ;
   private String[] T01Q739_A7540Alb_NFisca ;
   private String[] T01Q740_A396EmprCod ;
   private long[] T01Q740_A30AlbProCod ;
   private int[] T01Q740_A129BarCod ;
   private byte[] T01Q740_A132BarCodReo ;
   private String[] T01Q740_A130BarCodPar ;
   private String[] T01Q741_A396EmprCod ;
   private long[] T01Q741_A30AlbProCod ;
   private byte[] T01Q741_A915AlbPObsLin ;
   private String[] T01Q742_A396EmprCod ;
   private long[] T01Q742_A30AlbProCod ;
   private String[] T01Q743_A13735CliCNom ;
   private String[] T01Q744_A13735CliCNom ;
   private String[] T01Q745_A13738TrnCNom ;
   private String[] T01Q746_A13735CliCNom ;
   private String[] T01Q746_A396EmprCod ;
   private int[] T01Q746_A252CliCod ;
   private String[] T01Q747_A13735CliCNom ;
   private String[] T01Q747_A396EmprCod ;
   private int[] T01Q747_A252CliCod ;
   private String[] T01Q748_A13738TrnCNom ;
   private String[] T01Q748_A396EmprCod ;
   private short[] T01Q748_A840TrnCod ;
   private String[] T01Q749_A13735CliCNom ;
   private String[] T01Q749_A396EmprCod ;
   private int[] T01Q749_A252CliCod ;
   private String[] T01Q750_A13735CliCNom ;
   private String[] T01Q750_A396EmprCod ;
   private int[] T01Q750_A252CliCod ;
   private String[] T01Q751_A13738TrnCNom ;
   private String[] T01Q751_A396EmprCod ;
   private short[] T01Q751_A840TrnCod ;
   private String[] T01Q752_A841TrnNom ;
   private boolean[] T01Q752_n841TrnNom ;
   private String[] T01Q752_A3643TrnNif ;
   private boolean[] T01Q752_n3643TrnNif ;
   private String[] T01Q753_A13735CliCNom ;
   private String[] T01Q753_A396EmprCod ;
   private int[] T01Q753_A252CliCod ;
   private String[] T01Q754_A1244GuiRemCln ;
   private String[] T01Q754_A3145GuiRemDivT ;
   private boolean[] T01Q754_n3145GuiRemDivT ;
   private byte[] T01Q754_A3110GuiRemDiv ;
   private boolean[] T01Q754_n3110GuiRemDiv ;
   private String[] T01Q755_A3109AlbDivAbr ;
   private boolean[] T01Q755_n3109AlbDivAbr ;
   private String[] T01Q756_A841TrnNom ;
   private boolean[] T01Q756_n841TrnNom ;
   private String[] T01Q756_A3643TrnNif ;
   private boolean[] T01Q756_n3643TrnNif ;
   private byte[] T01Q757_A1260BusDomEnv ;
   private boolean[] T01Q757_n1260BusDomEnv ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV13TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV19TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV12WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class calprd_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class calprd_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class calprd_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class calprd_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class calprd_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01Q72", "SELECT AlbProCod, AlbProPri, AlbProEst, AlbProfch, AlbFecSal, AlbHorSal, AlbUsu, AlbCliDes, AlbDomEnv, AlbMat, AlbSec, AlbEnvFtp, AlbLic, AlbProAT, AlbHhfm, AlbGrossT, AlbTrnNc, AlbFmd, AlbTrnNm, ALbFmdc, AlbTrnDm, AlbMarca, AlbLocDes, AlbLocCar, AlbPObsCon, AlbIvaCod, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbObsCb, AlbNumT, AlbMarCo, AlbOComp, AlbDivTCod, GuiRemDom, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ?  FOR UPDATE OF AlbProPri, AlbProEst, AlbProfch, AlbFecSal, AlbHorSal, AlbUsu, AlbCliDes, AlbDomEnv, AlbMat, AlbSec, AlbEnvFtp, AlbLic, AlbProAT, AlbHhfm, AlbGrossT, AlbTrnNc, AlbFmd, AlbTrnNm, ALbFmdc, AlbTrnDm, AlbMarca, AlbLocDes, AlbLocCar, AlbPObsCon, AlbIvaCod, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbObsCb, AlbNumT, AlbMarCo, AlbOComp, AlbDivTCod, GuiRemDom, EmprGuiRem, GuiRemCli, TrnCod, AlbDivCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q73", "SELECT AlbProCod, AlbProPri, AlbProEst, AlbProfch, AlbFecSal, AlbHorSal, AlbUsu, AlbCliDes, AlbDomEnv, AlbMat, AlbSec, AlbEnvFtp, AlbLic, AlbProAT, AlbHhfm, AlbGrossT, AlbTrnNc, AlbFmd, AlbTrnNm, ALbFmdc, AlbTrnDm, AlbMarca, AlbLocDes, AlbLocCar, AlbPObsCon, AlbIvaCod, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbObsCb, AlbNumT, AlbMarCo, AlbOComp, AlbDivTCod, GuiRemDom, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q74", "SELECT CliNom AS GuiRemCln, CliDivTra AS GuiRemDivT, CliDivCod AS GuiRemDiv FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q75", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q76", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q77", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q78", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q79", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q710", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE TrnCod = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q711", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q712", "SELECT /*+ FIRST_ROWS(100) */ T5.CliCod, T5.CliEnvLin, TM1.AlbProCod, TM1.AlbProPri, TM1.AlbProEst, TM1.AlbProfch, TM1.AlbFecSal, TM1.AlbHorSal, TM1.AlbUsu, T4.CliNom AS GuiRemCln, TM1.AlbCliDes, TM1.AlbDomEnv, TM1.AlbMat, TM1.AlbSec, TM1.AlbEnvFtp, TM1.AlbLic, TM1.AlbProAT, TM1.AlbHhfm, TM1.AlbGrossT, TM1.AlbTrnNc, TM1.AlbFmd, TM1.AlbTrnNm, TM1.ALbFmdc, TM1.AlbTrnDm, TM1.AlbMarca, TM1.AlbLocDes, TM1.AlbLocCar, TM1.AlbPObsCon, TM1.AlbIvaCod, TM1.AlbColCa, TM1.AlbDesp, TM1.AlbCambio, TM1.AlbTipDoc, TM1.AlbMotTr, TM1.AlbTipCal, TM1.AlbObsCb, TM1.AlbNumT, TM1.AlbMarCo, TM1.AlbOComp, TM1.AlbDivTCod, T3.DivAbr AS AlbDivAbr, TM1.GuiRemDom, T4.CliDivTra AS GuiRemDivT, T2.EmprNom, TM1.EmprGuiRem AS EmprGuiRem, TM1.GuiRemCli AS GuiRemCli, TM1.EmprCod, TM1.TrnCod, TM1.AlbDivCod AS AlbDivCod, T4.CliDivCod AS GuiRemDiv, COALESCE( T5.CliEnvLin, 0) AS BusDomEnv FROM ((((TXPCALPRD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPDIVISA T3 ON T3.DivCod = TM1.AlbDivCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprGuiRem AND T4.CliCod = TM1.GuiRemCli) LEFT JOIN TXPCLIENV T5 ON T5.EmprCod = TM1.EmprGuiRem AND T5.CliCod = TM1.GuiRemCli AND T5.CliEnvLin = TM1.AlbDomEnv) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q713", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE CliCod = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q714", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q715", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE CliCod = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q716", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE TrnCod = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q717", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q718", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q719", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE CliCod = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q720", "SELECT CliNom AS GuiRemCln, CliDivTra AS GuiRemDivT, CliDivCod AS GuiRemDiv FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q721", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q722", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q723", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q724", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q725", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q726", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE ( AlbProCod > ?) and EmprCod = ? ORDER BY EmprCod, AlbProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q727", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE ( AlbProCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, AlbProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q728", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01Q729", "INSERT INTO TXPCALPRD(AlbProCod, AlbProPri, AlbProEst, AlbProfch, AlbFecSal, AlbHorSal, AlbUsu, AlbCliDes, AlbDomEnv, AlbMat, AlbSec, AlbEnvFtp, AlbLic, AlbProAT, AlbHhfm, AlbGrossT, AlbTrnNc, AlbFmd, AlbTrnNm, ALbFmdc, AlbTrnDm, AlbMarca, AlbLocDes, AlbLocCar, AlbPObsCon, AlbIvaCod, AlbColCa, AlbDesp, AlbCambio, AlbTipDoc, AlbMotTr, AlbTipCal, AlbObsCb, AlbNumT, AlbMarCo, AlbOComp, AlbDivTCod, GuiRemDom, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod, AlbProEso, AlbProEnt, AlbProBon, AlbProTBo, AlbKilRea, AlbProNroF, AlbDomEv, DltUltob, FpgCod, AlbPdATCUD, AlbFecAnu, AlbUsuAnu, AlbHorAnu, AlbPdSerAT, AlbPdTipAT, AlbEnvMail) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, ' ', 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("T01Q730", "UPDATE TXPCALPRD SET AlbProPri=?, AlbProEst=?, AlbProfch=?, AlbFecSal=?, AlbHorSal=?, AlbUsu=?, AlbCliDes=?, AlbDomEnv=?, AlbMat=?, AlbSec=?, AlbEnvFtp=?, AlbLic=?, AlbProAT=?, AlbHhfm=?, AlbGrossT=?, AlbTrnNc=?, AlbFmd=?, AlbTrnNm=?, ALbFmdc=?, AlbTrnDm=?, AlbMarca=?, AlbLocDes=?, AlbLocCar=?, AlbPObsCon=?, AlbIvaCod=?, AlbColCa=?, AlbDesp=?, AlbCambio=?, AlbTipDoc=?, AlbMotTr=?, AlbTipCal=?, AlbObsCb=?, AlbNumT=?, AlbMarCo=?, AlbOComp=?, AlbDivTCod=?, GuiRemDom=?, EmprGuiRem=?, GuiRemCli=?, TrnCod=?, AlbDivCod=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("T01Q731", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new ForEachCursor("T01Q732", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q733", "SELECT CliNom AS GuiRemCln, CliDivTra AS GuiRemDivT, CliDivCod AS GuiRemDiv FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q734", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q735", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q736", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q737", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltLinObs FROM TXPDLT005 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q738", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP FROM TXPDLT001 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q739", "SELECT * FROM (SELECT EmprCod, AlbProCod, Alb_NFisca FROM TXPCNOTRE WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q740", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q741", "SELECT * FROM (SELECT EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q742", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q743", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom))) like '%' || UPPER(?)) ORDER BY CliCNom) WHERE rownum <= 10 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q744", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom FROM TXPCLIENT WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom))) like '%' || UPPER(?) ORDER BY CliCNom) WHERE rownum <= 10 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q745", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom FROM TXPTRANSP WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, '')))) like '%' || UPPER(?) ORDER BY TrnCNom) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q746", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q747", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q748", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q749", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE CliCod = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q750", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q751", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q752", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q753", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q754", "SELECT CliNom AS GuiRemCln, CliDivTra AS GuiRemDivT, CliDivCod AS GuiRemDiv FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q755", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q756", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q757", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 20);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[17])[0] = rslt.getString(17, 20);
               ((String[]) buf[18])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 60);
               ((String[]) buf[21])[0] = rslt.getString(20, 255);
               ((String[]) buf[22])[0] = rslt.getString(21, 60);
               ((String[]) buf[23])[0] = rslt.getString(22, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(23);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((byte[]) buf[26])[0] = rslt.getByte(25);
               ((String[]) buf[27])[0] = rslt.getString(26, 3);
               ((String[]) buf[28])[0] = rslt.getString(27, 20);
               ((int[]) buf[29])[0] = rslt.getInt(28);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(29,4);
               ((int[]) buf[31])[0] = rslt.getInt(30);
               ((String[]) buf[32])[0] = rslt.getString(31, 25);
               ((byte[]) buf[33])[0] = rslt.getByte(32);
               ((String[]) buf[34])[0] = rslt.getString(33, 60);
               ((long[]) buf[35])[0] = rslt.getLong(34);
               ((String[]) buf[36])[0] = rslt.getString(35, 30);
               ((String[]) buf[37])[0] = rslt.getString(36, 30);
               ((String[]) buf[38])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((byte[]) buf[40])[0] = rslt.getByte(38);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(39, 3);
               ((int[]) buf[43])[0] = rslt.getInt(40);
               ((String[]) buf[44])[0] = rslt.getString(41, 3);
               ((short[]) buf[45])[0] = rslt.getShort(42);
               ((byte[]) buf[46])[0] = rslt.getByte(43);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 20);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[17])[0] = rslt.getString(17, 20);
               ((String[]) buf[18])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 60);
               ((String[]) buf[21])[0] = rslt.getString(20, 255);
               ((String[]) buf[22])[0] = rslt.getString(21, 60);
               ((String[]) buf[23])[0] = rslt.getString(22, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(23);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((byte[]) buf[26])[0] = rslt.getByte(25);
               ((String[]) buf[27])[0] = rslt.getString(26, 3);
               ((String[]) buf[28])[0] = rslt.getString(27, 20);
               ((int[]) buf[29])[0] = rslt.getInt(28);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(29,4);
               ((int[]) buf[31])[0] = rslt.getInt(30);
               ((String[]) buf[32])[0] = rslt.getString(31, 25);
               ((byte[]) buf[33])[0] = rslt.getByte(32);
               ((String[]) buf[34])[0] = rslt.getString(33, 60);
               ((long[]) buf[35])[0] = rslt.getLong(34);
               ((String[]) buf[36])[0] = rslt.getString(35, 30);
               ((String[]) buf[37])[0] = rslt.getString(36, 30);
               ((String[]) buf[38])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((byte[]) buf[40])[0] = rslt.getByte(38);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(39, 3);
               ((int[]) buf[43])[0] = rslt.getInt(40);
               ((String[]) buf[44])[0] = rslt.getString(41, 3);
               ((short[]) buf[45])[0] = rslt.getShort(42);
               ((byte[]) buf[46])[0] = rslt.getByte(43);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 20);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(18);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((String[]) buf[20])[0] = rslt.getString(20, 20);
               ((String[]) buf[21])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(22, 60);
               ((String[]) buf[24])[0] = rslt.getString(23, 255);
               ((String[]) buf[25])[0] = rslt.getString(24, 60);
               ((String[]) buf[26])[0] = rslt.getString(25, 1);
               ((byte[]) buf[27])[0] = rslt.getByte(26);
               ((byte[]) buf[28])[0] = rslt.getByte(27);
               ((byte[]) buf[29])[0] = rslt.getByte(28);
               ((String[]) buf[30])[0] = rslt.getString(29, 3);
               ((String[]) buf[31])[0] = rslt.getString(30, 20);
               ((int[]) buf[32])[0] = rslt.getInt(31);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(32,4);
               ((int[]) buf[34])[0] = rslt.getInt(33);
               ((String[]) buf[35])[0] = rslt.getString(34, 25);
               ((byte[]) buf[36])[0] = rslt.getByte(35);
               ((String[]) buf[37])[0] = rslt.getString(36, 60);
               ((long[]) buf[38])[0] = rslt.getLong(37);
               ((String[]) buf[39])[0] = rslt.getString(38, 30);
               ((String[]) buf[40])[0] = rslt.getString(39, 30);
               ((String[]) buf[41])[0] = rslt.getString(40, 1);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(41, 6);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((byte[]) buf[45])[0] = rslt.getByte(42);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(43, 1);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(44, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(45, 3);
               ((int[]) buf[52])[0] = rslt.getInt(46);
               ((String[]) buf[53])[0] = rslt.getString(47, 3);
               ((short[]) buf[54])[0] = rslt.getShort(48);
               ((byte[]) buf[55])[0] = rslt.getByte(49);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((byte[]) buf[57])[0] = rslt.getByte(50);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((byte[]) buf[59])[0] = rslt.getByte(51);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 19 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 33 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 55 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 24 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 25 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 26 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 27 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[9]).byteValue());
               }
               stmt.setString(10, (String)parms[10], 20);
               stmt.setString(11, (String)parms[11], 1);
               stmt.setByte(12, ((Number) parms[12]).byteValue());
               stmt.setString(13, (String)parms[13], 20);
               stmt.setString(14, (String)parms[14], 1);
               stmt.setDateTime(15, (java.util.Date)parms[15], false);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[16], 2);
               stmt.setString(17, (String)parms[17], 20);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[19], 255);
               }
               stmt.setString(19, (String)parms[20], 60);
               stmt.setString(20, (String)parms[21], 255);
               stmt.setString(21, (String)parms[22], 60);
               stmt.setString(22, (String)parms[23], 1);
               stmt.setByte(23, ((Number) parms[24]).byteValue());
               stmt.setByte(24, ((Number) parms[25]).byteValue());
               stmt.setByte(25, ((Number) parms[26]).byteValue());
               stmt.setString(26, (String)parms[27], 3);
               stmt.setString(27, (String)parms[28], 20);
               stmt.setInt(28, ((Number) parms[29]).intValue());
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[30], 4);
               stmt.setInt(30, ((Number) parms[31]).intValue());
               stmt.setString(31, (String)parms[32], 25);
               stmt.setByte(32, ((Number) parms[33]).byteValue());
               stmt.setString(33, (String)parms[34], 60);
               stmt.setLong(34, ((Number) parms[35]).longValue());
               stmt.setString(35, (String)parms[36], 30);
               stmt.setString(36, (String)parms[37], 30);
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[39], 1);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(38, ((Number) parms[41]).byteValue());
               }
               stmt.setString(39, (String)parms[42], 3);
               stmt.setInt(40, ((Number) parms[43]).intValue());
               stmt.setString(41, (String)parms[44], 3);
               stmt.setShort(42, ((Number) parms[45]).shortValue());
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(43, ((Number) parms[47]).byteValue());
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[8]).byteValue());
               }
               stmt.setString(9, (String)parms[9], 20);
               stmt.setString(10, (String)parms[10], 1);
               stmt.setByte(11, ((Number) parms[11]).byteValue());
               stmt.setString(12, (String)parms[12], 20);
               stmt.setString(13, (String)parms[13], 1);
               stmt.setDateTime(14, (java.util.Date)parms[14], false);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[15], 2);
               stmt.setString(16, (String)parms[16], 20);
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[18], 255);
               }
               stmt.setString(18, (String)parms[19], 60);
               stmt.setString(19, (String)parms[20], 255);
               stmt.setString(20, (String)parms[21], 60);
               stmt.setString(21, (String)parms[22], 1);
               stmt.setByte(22, ((Number) parms[23]).byteValue());
               stmt.setByte(23, ((Number) parms[24]).byteValue());
               stmt.setByte(24, ((Number) parms[25]).byteValue());
               stmt.setString(25, (String)parms[26], 3);
               stmt.setString(26, (String)parms[27], 20);
               stmt.setInt(27, ((Number) parms[28]).intValue());
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[29], 4);
               stmt.setInt(29, ((Number) parms[30]).intValue());
               stmt.setString(30, (String)parms[31], 25);
               stmt.setByte(31, ((Number) parms[32]).byteValue());
               stmt.setString(32, (String)parms[33], 60);
               stmt.setLong(33, ((Number) parms[34]).longValue());
               stmt.setString(34, (String)parms[35], 30);
               stmt.setString(35, (String)parms[36], 30);
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[38], 1);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(37, ((Number) parms[40]).byteValue());
               }
               stmt.setString(38, (String)parms[41], 3);
               stmt.setInt(39, ((Number) parms[42]).intValue());
               stmt.setShort(40, ((Number) parms[43]).shortValue());
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(41, ((Number) parms[45]).byteValue());
               }
               stmt.setString(42, (String)parms[46], 3);
               stmt.setLong(43, ((Number) parms[47]).longValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 42 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 43 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 44 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 45 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 46 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 47 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 48 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 49 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 51 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 53 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               return;
      }
   }

}

