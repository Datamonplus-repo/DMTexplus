package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentocomercialv01_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action36") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV31ContCod = httpContext.GetPar( "ContCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31ContCod", AV31ContCod);
         A14AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
         A22AlbComPri = httpContext.GetPar( "AlbComPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_36_1PQ1( A396EmprCod, AV31ContCod, A14AlbComCod, A22AlbComPri) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action37") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A22AlbComPri = httpContext.GetPar( "AlbComPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         AV24Fch = localUtil.parseDateParm( httpContext.GetPar( "Fch")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24Fch", localUtil.format(AV24Fch, "99/99/99"));
         AV25AlbLast = (int)(GXutil.lval( httpContext.GetPar( "AlbLast"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AlbLast), 8, 0));
         A17AlbComFch = localUtil.parseDateParm( httpContext.GetPar( "AlbComFch")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         AV23Msg_f = httpContext.GetPar( "Msg_f") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Msg_f", AV23Msg_f);
         AV22Ctrlf = (short)(GXutil.lval( httpContext.GetPar( "Ctrlf"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Ctrlf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Ctrlf), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_37_1PQ1( A396EmprCod, A22AlbComPri, AV24Fch, AV25AlbLast, A17AlbComFch, AV23Msg_f, AV22Ctrlf) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action65") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A13320AlbComArt = httpContext.GetPar( "AlbComArt") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_65_1PQ2( A396EmprCod, A252CliCod, A13320AlbComArt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CLICOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13735CliCNom = httpContext.GetPar( "CliCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaclicod1PQ0( A396EmprCod, A13735CliCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TRNCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13738TrnCNom = httpContext.GetPar( "TrnCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatrncod1PQ0( A396EmprCod, A13738TrnCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"ALBCOMART") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV30guiremcli = (int)(GXutil.lval( httpContext.GetPar( "guiremcli"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30guiremcli), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaalbcomart1PQ0( A396EmprCod, AV30guiremcli, A65ArtCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CLICOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13735CliCNom = httpContext.GetPar( "CliCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaclicod1PQ0( A396EmprCod, A13735CliCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"CLICOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h252CliCod = httpContext.GetPar( "h252CliCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaclicod1PQ1( A396EmprCod, h252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TRNCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13738TrnCNom = httpContext.GetPar( "TrnCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatrncod1PQ0( A396EmprCod, A13738TrnCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TRNCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h840TrnCod = httpContext.GetPar( "h840TrnCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcatrncod1PQ1( A396EmprCod, h840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"ALBLINEASL") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A14AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asaalblineasl1PQ1( A396EmprCod, A14AlbComCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel17"+"_"+"ALBCOMHOR") == 0 )
      {
         A17AlbComFch = localUtil.parseDateParm( httpContext.GetPar( "AlbComFch")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx17asaalbcomhor1PQ1( A17AlbComFch, Gx_mode, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_70") == 0 )
      {
         A3111AlcDivCod = (byte)(GXutil.lval( httpContext.GetPar( "AlcDivCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3111AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3111AlcDivCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_70( A3111AlcDivCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_68") == 0 )
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
         gxload_68( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_69") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_69( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_71") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A5142AlcDomEnv = (byte)(GXutil.lval( httpContext.GetPar( "AlcDomEnv"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5142AlcDomEnv", GXutil.str( A5142AlcDomEnv, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_71( A396EmprCod, A252CliCod, A5142AlcDomEnv) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_72") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A14AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_72( A396EmprCod, A14AlbComCod) ;
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
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            AV8AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8AlbComCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbComCod), "ZZZZZZZ9")));
            AV18AlbComPri = httpContext.GetPar( "AlbComPri") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbComPri", AV18AlbComPri);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18AlbComPri, "9"))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Documento Comercial (v01)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbComCod_Internalname ;
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
      nRC_GXsfl_79 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_79"))) ;
      nGXsfl_79_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_79_idx"))) ;
      sGXsfl_79_idx = httpContext.GetPar( "sGXsfl_79_idx") ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      A19AlbComLiC = (short)(GXutil.lval( httpContext.GetPar( "AlbComLiC"))) ;
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

   public documentocomercialv01_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentocomercialv01_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentocomercialv01_impl.class ));
   }

   public documentocomercialv01_impl( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbComPri = new HTMLChoice();
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
      if ( cmbAlbComPri.getItemCount() > 0 )
      {
         A22AlbComPri = cmbAlbComPri.getValidValue(A22AlbComPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbComPri.setValue( GXutil.rtrim( A22AlbComPri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbComPri.getInternalname(), "Values", cmbAlbComPri.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComCod_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComFch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComFch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbComFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComFch_Internalname, localUtil.format(A17AlbComFch, "99/99/99"), localUtil.format( A17AlbComFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComFch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbComFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbComFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoComercialv01.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbComPri.getInternalname()+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbComPri, cmbAlbComPri.getInternalname(), GXutil.rtrim( A22AlbComPri), 1, cmbAlbComPri.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbComPri.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "", true, (byte)(0), "HLP_DocumentoComercialv01.htm");
      cmbAlbComPri.setValue( GXutil.rtrim( A22AlbComPri) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComPri.getInternalname(), "Values", cmbAlbComPri.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, h252CliCod, GXutil.rtrim( localUtil.format( h252CliCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 1, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_DocumentoComercialv01.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedalcdomenv_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalcdomenv_Internalname, httpContext.getMessage( "Domicilio de Envio", ""), "", "", lblTextblockalcdomenv_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoComercialv01.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8", "left", "top", "", "", "div");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTablemergedalcdomenv_Internalname, tblTablemergedalcdomenv_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='MergeDataCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlcDomEnv_Internalname, httpContext.getMessage( "Domicilio de Envio", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlcDomEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A5142AlcDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlcDomEnv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5142AlcDomEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(A5142AlcDomEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlcDomEnv_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlcDomEnv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTablesearcrroot_Internalname, tblTablesearcrroot_Internalname, "", "Prompt", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td data-align=\"Center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Center;text-align:-moz-Center;text-align:-webkit-Center")+"\">") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblPromptclienv_Internalname, httpContext.getMessage( "<i class=\"fas fa-search\"></i>", ""), "", "", lblPromptclienv_Jsonclick, "'"+""+"'"+",false,"+"'"+"e111pq2_client"+"'", "", "TextBlock", 7, httpContext.getMessage( "Clicar aca para selecionar una direccion", ""), 1, 1, 0, (short)(1), "HLP_DocumentoComercialv01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, h840TrnCod, GXutil.rtrim( localUtil.format( h840TrnCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnCod_Enabled, 1, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_DocumentoComercialv01.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComMat_Internalname, httpContext.getMessage( "Matricula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComMat_Internalname, GXutil.rtrim( A4830AlbComMat), GXutil.rtrim( localUtil.format( A4830AlbComMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComHor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComHor_Internalname, httpContext.getMessage( "Fecha Hora Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbComHor_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComHor_Internalname, localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4829AlbComHor, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComHor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComHor_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbComHor_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbComHor_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoComercialv01.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoComercialv01.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoComercialv01.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoComercialv01.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV35Pgmname), GXutil.rtrim( localUtil.format( AV35Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbComFs_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComFs_Internalname, localUtil.ttoc( A10013AlbComFs, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10013AlbComFs, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,115);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComFs_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComFs_Visible, edtAlbComFs_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbComFs_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtAlbComFs_Visible==0)||(edtAlbComFs_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoComercialv01.htm");
      httpContext.writeTextNL( "</div>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtfindDomEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A13739findDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtfindDomEnv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13739findDomEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(A13739findDomEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtfindDomEnv_Jsonclick, 0, "Attribute", "", "", "", "", edtfindDomEnv_Visible, edtfindDomEnv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComEAT_Internalname, GXutil.ltrim( localUtil.ntoc( A10739AlbComEAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbComEAT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10739AlbComEAT), "9") : localUtil.format( DecimalUtil.doubleToDec(A10739AlbComEAT), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComEAT_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComEAT_Visible, edtAlbComEAT_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComID_Internalname, GXutil.rtrim( A10740AlbComID), GXutil.rtrim( localUtil.format( A10740AlbComID, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,118);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComID_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComID_Visible, edtAlbComID_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComAT_Internalname, GXutil.rtrim( A10764AlbComAT), GXutil.rtrim( localUtil.format( A10764AlbComAT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComAT_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComAT_Visible, edtAlbComAT_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01.htm");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtAlbComFd_Internalname, GXutil.rtrim( A10014AlbComFd), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,120);\"", (short)(0), edtAlbComFd_Visible, edtAlbComFd_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_DocumentoComercialv01.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCTrNm_Internalname, GXutil.rtrim( A11719AlbCTrNm), GXutil.rtrim( localUtil.format( A11719AlbCTrNm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCTrNm_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbCTrNm_Visible, edtAlbCTrNm_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCTrNc_Internalname, GXutil.rtrim( A11721AlbCTrNc), GXutil.rtrim( localUtil.format( A11721AlbCTrNc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,122);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCTrNc_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbCTrNc_Visible, edtAlbCTrNc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCTrDm_Internalname, GXutil.rtrim( A11720AlbCTrDm), GXutil.rtrim( localUtil.format( A11720AlbCTrDm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,123);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCTrDm_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbCTrDm_Visible, edtAlbCTrDm_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComImp_Internalname, GXutil.ltrim( localUtil.ntoc( A18AlbComImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbComImp_Enabled!=0) ? localUtil.format( A18AlbComImp, "ZZZZZZZZZ9.99") : localUtil.format( A18AlbComImp, "ZZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComImp_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComImp_Visible, edtAlbComImp_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComEst_Internalname, GXutil.ltrim( localUtil.ntoc( A16AlbComEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbComEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A16AlbComEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A16AlbComEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComEst_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComEst_Visible, edtAlbComEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComLiC_Internalname, GXutil.ltrim( localUtil.ntoc( A19AlbComLiC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbComLiC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A19AlbComLiC), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A19AlbComLiC), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComLiC_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComLiC_Visible, edtAlbComLiC_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComEso_Internalname, GXutil.ltrim( localUtil.ntoc( A1783AlbComEso, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbComEso_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1783AlbComEso), "9") : localUtil.format( DecimalUtil.doubleToDec(A1783AlbComEso), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,127);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComEso_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComEso_Visible, edtAlbComEso_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01.htm");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtAlbComFdD_Internalname, GXutil.rtrim( A10015AlbComFdD), "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,128);\"", (short)(0), edtAlbComFdD_Visible, edtAlbComFdD_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_DocumentoComercialv01.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCSec_Internalname, GXutil.rtrim( A3094AlbCSec), GXutil.rtrim( localUtil.format( A3094AlbCSec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCSec_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbCSec_Visible, edtAlbCSec_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComSt_Internalname, GXutil.rtrim( A10738AlbComSt), GXutil.rtrim( localUtil.format( A10738AlbComSt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,130);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComSt_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComSt_Visible, edtAlbComSt_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlcIvaCod_Internalname, GXutil.rtrim( A5143AlcIvaCod), GXutil.rtrim( localUtil.format( A5143AlcIvaCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlcIvaCod_Jsonclick, 0, "Attribute", "", "", "", "", edtAlcIvaCod_Visible, edtAlcIvaCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlcDivCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3111AlcDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3111AlcDivCod), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,132);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlcDivCod_Jsonclick, 0, "Attribute", "", "", "", "", edtAlcDivCod_Visible, edtAlcDivCod_Enabled, 1, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoComercialv01.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlcDivTCod_Internalname, GXutil.rtrim( A3095AlcDivTCod), GXutil.rtrim( localUtil.format( A3095AlcDivTCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,133);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlcDivTCod_Jsonclick, 0, "Attribute", "", "", "", "", edtAlcDivTCod_Visible, edtAlcDivTCod_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoComercialv01.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol79( ) ;
      nGXsfl_79_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount2 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_2 = (short)(1) ;
            scanStart1PQ2( ) ;
            while ( RcdFound2 != 0 )
            {
               init_level_properties2( ) ;
               getByPrimaryKey1PQ2( ) ;
               addRow1PQ2( ) ;
               scanNext1PQ2( ) ;
            }
            scanEnd1PQ2( ) ;
            nBlankRcdCount2 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B19AlbComLiC = A19AlbComLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         B18AlbComImp = A18AlbComImp ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         B252CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         B22AlbComPri = A22AlbComPri ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         standaloneNotModal1PQ2( ) ;
         standaloneModal1PQ2( ) ;
         sMode2 = Gx_mode ;
         while ( nGXsfl_79_idx < nRC_GXsfl_79 )
         {
            bGXsfl_79_Refreshing = true ;
            readRow1PQ2( ) ;
            edtAlbComLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMLIN_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtAlbComNRef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMNREF_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComNRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComNRef_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtAlbComVDoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMVDOC_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComVDoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComVDoc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtAlbComPzas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMPZAS_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComPzas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComPzas_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtAlbComMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMMTS_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComMts_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtAlbComArt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMART_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComArt_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtAlbComArtD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMARTD_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComArtD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComArtD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtAlbComCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMCOL_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCol_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtAlbComKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMKGS_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComKgs_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtAlbComDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMDSC_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtAlbComPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMPRE_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComPre_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtAlbComCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMCNT_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCnt_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtAlbComHd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMHD_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComHd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComHd_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtALbComR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMR_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtALbComR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALbComR_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtAlbComP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMP_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComP_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtAlbComDc2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMDC2_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComDc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComDc2_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtAlbComProd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMPROD_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComProd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComProd_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtAlbCImpLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCIMPLIN_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbCImpLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCImpLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            edtAlbCImpL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCIMPL_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbCImpL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCImpL_Enabled), 5, 0), !bGXsfl_79_Refreshing);
            if ( ( nRcdExists_2 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1PQ2( ) ;
            }
            sendRow1PQ2( ) ;
            bGXsfl_79_Refreshing = false ;
         }
         Gx_mode = sMode2 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A19AlbComLiC = B19AlbComLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         A18AlbComImp = B18AlbComImp ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         A252CliCod = B252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A22AlbComPri = B22AlbComPri ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount2 = (short)(5) ;
         nRcdExists_2 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1PQ2( ) ;
            while ( RcdFound2 != 0 )
            {
               sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_792( ) ;
               init_level_properties2( ) ;
               standaloneNotModal1PQ2( ) ;
               getByPrimaryKey1PQ2( ) ;
               standaloneModal1PQ2( ) ;
               addRow1PQ2( ) ;
               scanNext1PQ2( ) ;
            }
            scanEnd1PQ2( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode2 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_792( ) ;
         initAll1PQ2( ) ;
         init_level_properties2( ) ;
         B19AlbComLiC = A19AlbComLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         B18AlbComImp = A18AlbComImp ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         B252CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         B22AlbComPri = A22AlbComPri ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         nRcdExists_2 = (short)(0) ;
         nIsMod_2 = (short)(0) ;
         nRcdDeleted_2 = (short)(0) ;
         nBlankRcdCount2 = (short)(nBlankRcdUsr2+nBlankRcdCount2) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount2 > 0 )
         {
            standaloneNotModal1PQ2( ) ;
            standaloneModal1PQ2( ) ;
            addRow1PQ2( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtAlbComLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount2 = (short)(nBlankRcdCount2-1) ;
         }
         Gx_mode = sMode2 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A19AlbComLiC = B19AlbComLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         A18AlbComImp = B18AlbComImp ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         A252CliCod = B252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A22AlbComPri = B22AlbComPri ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
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
      e121PQ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z14AlbComCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10013AlbComFs = localUtil.ctot( httpContext.cgiGet( "Z10013AlbComFs"), 0) ;
            Z4829AlbComHor = localUtil.ctot( httpContext.cgiGet( "Z4829AlbComHor"), 0) ;
            Z17AlbComFch = localUtil.ctod( httpContext.cgiGet( "Z17AlbComFch"), 0) ;
            Z22AlbComPri = httpContext.cgiGet( "Z22AlbComPri") ;
            Z5142AlcDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5142AlcDomEnv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4830AlbComMat = httpContext.cgiGet( "Z4830AlbComMat") ;
            Z10739AlbComEAT = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10739AlbComEAT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10740AlbComID = httpContext.cgiGet( "Z10740AlbComID") ;
            Z10764AlbComAT = httpContext.cgiGet( "Z10764AlbComAT") ;
            Z10014AlbComFd = httpContext.cgiGet( "Z10014AlbComFd") ;
            Z11719AlbCTrNm = httpContext.cgiGet( "Z11719AlbCTrNm") ;
            Z11721AlbCTrNc = httpContext.cgiGet( "Z11721AlbCTrNc") ;
            Z11720AlbCTrDm = httpContext.cgiGet( "Z11720AlbCTrDm") ;
            Z16AlbComEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z16AlbComEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z19AlbComLiC = (short)(localUtil.ctol( httpContext.cgiGet( "Z19AlbComLiC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1783AlbComEso = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1783AlbComEso"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10015AlbComFdD = httpContext.cgiGet( "Z10015AlbComFdD") ;
            Z3094AlbCSec = httpContext.cgiGet( "Z3094AlbCSec") ;
            Z10738AlbComSt = httpContext.cgiGet( "Z10738AlbComSt") ;
            Z5143AlcIvaCod = httpContext.cgiGet( "Z5143AlcIvaCod") ;
            Z3095AlcDivTCod = httpContext.cgiGet( "Z3095AlcDivTCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3111AlcDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3111AlcDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O19AlbComLiC = (short)(localUtil.ctol( httpContext.cgiGet( "O19AlbComLiC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O18AlbComImp = localUtil.ctond( httpContext.cgiGet( "O18AlbComImp")) ;
            O252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "O252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O22AlbComPri = httpContext.cgiGet( "O22AlbComPri") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_79 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_79"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "N252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "N840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N3111AlcDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "N3111AlcDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A14254AlbLineasL = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBLINEASL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( "vALBCOMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12Insert_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13Insert_TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "GXHCTRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV19Insert_AlcDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_ALCDIVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV29oldAlbComPri = httpContext.cgiGet( "vOLDALBCOMPRI") ;
            AV30guiremcli = (int)(localUtil.ctol( httpContext.cgiGet( "vGUIREMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV31ContCod = httpContext.cgiGet( "vCONTCOD") ;
            AV18AlbComPri = httpContext.cgiGet( "vALBCOMPRI") ;
            AV23Msg_f = httpContext.cgiGet( "vMSG_F") ;
            AV25AlbLast = (int)(localUtil.ctol( httpContext.cgiGet( "vALBLAST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV24Fch = localUtil.ctod( httpContext.cgiGet( "vFCH"), 0) ;
            AV27FirmaD = (short)(localUtil.ctol( httpContext.cgiGet( "vFIRMAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV26Cernum = (short)(localUtil.ctol( httpContext.cgiGet( "vCERNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Msg_errAT = httpContext.cgiGet( "vMSG_ERRAT") ;
            AV28CambioP = (byte)(localUtil.ctol( httpContext.cgiGet( "vCAMBIOP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A279CliNom = httpContext.cgiGet( "CLINOM") ;
            A841TrnNom = httpContext.cgiGet( "TRNNOM") ;
            n841TrnNom = false ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBCOMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A14AlbComCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
            }
            else
            {
               A14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtAlbComFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ALBCOMFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbComFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A17AlbComFch = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
            }
            else
            {
               A17AlbComFch = localUtil.ctod( httpContext.cgiGet( edtAlbComFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
            }
            cmbAlbComPri.setName( cmbAlbComPri.getInternalname() );
            cmbAlbComPri.setValue( httpContext.cgiGet( cmbAlbComPri.getInternalname()) );
            A22AlbComPri = httpContext.cgiGet( cmbAlbComPri.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
            h252CliCod = httpContext.cgiGet( edtCliCod_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlcDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlcDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALCDOMENV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlcDomEnv_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5142AlcDomEnv = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5142AlcDomEnv", GXutil.str( A5142AlcDomEnv, 1, 0));
            }
            else
            {
               A5142AlcDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlcDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5142AlcDomEnv", GXutil.str( A5142AlcDomEnv, 1, 0));
            }
            h840TrnCod = httpContext.cgiGet( edtTrnCod_Internalname) ;
            A4830AlbComMat = httpContext.cgiGet( edtAlbComMat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4830AlbComMat", A4830AlbComMat);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtAlbComHor_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "ALBCOMHOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbComHor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A4829AlbComHor = localUtil.ctot( httpContext.cgiGet( edtAlbComHor_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            AV35Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtAlbComFs_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "ALBCOMFS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbComFs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A10013AlbComFs = localUtil.ctot( httpContext.cgiGet( edtAlbComFs_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A13739findDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtfindDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13739findDomEnv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComEAT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComEAT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBCOMEAT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbComEAT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10739AlbComEAT = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
            }
            else
            {
               A10739AlbComEAT = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbComEAT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
            }
            A10740AlbComID = httpContext.cgiGet( edtAlbComID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10740AlbComID", A10740AlbComID);
            A10764AlbComAT = httpContext.cgiGet( edtAlbComAT_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10764AlbComAT", A10764AlbComAT);
            A10014AlbComFd = httpContext.cgiGet( edtAlbComFd_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10014AlbComFd", A10014AlbComFd);
            A11719AlbCTrNm = httpContext.cgiGet( edtAlbCTrNm_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11719AlbCTrNm", A11719AlbCTrNm);
            A11721AlbCTrNc = httpContext.cgiGet( edtAlbCTrNc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11721AlbCTrNc", A11721AlbCTrNc);
            A11720AlbCTrDm = httpContext.cgiGet( edtAlbCTrDm_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11720AlbCTrDm", A11720AlbCTrDm);
            A18AlbComImp = localUtil.ctond( httpContext.cgiGet( edtAlbComImp_Internalname)) ;
            n18AlbComImp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBCOMEST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbComEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A16AlbComEst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A16AlbComEst", GXutil.str( A16AlbComEst, 1, 0));
            }
            else
            {
               A16AlbComEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbComEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A16AlbComEst", GXutil.str( A16AlbComEst, 1, 0));
            }
            A19AlbComLiC = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbComLiC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComEso_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComEso_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBCOMESO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbComEso_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1783AlbComEso = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1783AlbComEso", GXutil.str( A1783AlbComEso, 1, 0));
            }
            else
            {
               A1783AlbComEso = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbComEso_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1783AlbComEso", GXutil.str( A1783AlbComEso, 1, 0));
            }
            A10015AlbComFdD = httpContext.cgiGet( edtAlbComFdD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10015AlbComFdD", A10015AlbComFdD);
            A3094AlbCSec = httpContext.cgiGet( edtAlbCSec_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3094AlbCSec", A3094AlbCSec);
            A10738AlbComSt = httpContext.cgiGet( edtAlbComSt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10738AlbComSt", A10738AlbComSt);
            A5143AlcIvaCod = GXutil.upper( httpContext.cgiGet( edtAlcIvaCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5143AlcIvaCod", A5143AlcIvaCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlcDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlcDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALCDIVCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlcDivCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3111AlcDivCod = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3111AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3111AlcDivCod), 2, 0));
            }
            else
            {
               A3111AlcDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlcDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3111AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3111AlcDivCod), 2, 0));
            }
            A3095AlcDivTCod = httpContext.cgiGet( edtAlcDivTCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3095AlcDivTCod", A3095AlcDivTCod);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoComercialv01");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV35Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV35Pgmname, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A14AlbComCod != Z14AlbComCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("documentocomercialv01:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A14AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
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
                  sMode1 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1PQ0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "ALBCOMCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbComCod_Internalname ;
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "AFTER TRN") == 0 ) )
                     {
                        nGXsfl_79_idx = (int)(GXutil.lval( sEvtType)) ;
                        sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
                        subsflControlProps_792( ) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                        {
                           GXCCtl = "ALBCOMLIN_" + sGXsfl_79_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtAlbComLin_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A20AlbComLin = (short)(0) ;
                        }
                        else
                        {
                           A20AlbComLin = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        }
                        A13315AlbComNRef = httpContext.cgiGet( edtAlbComNRef_Internalname) ;
                        A13316AlbComVDoc = httpContext.cgiGet( edtAlbComVDoc_Internalname) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
                        {
                           GXCCtl = "ALBCOMPZAS_" + sGXsfl_79_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtAlbComPzas_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A13317AlbComPzas = 0 ;
                        }
                        else
                        {
                           A13317AlbComPzas = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbComPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        }
                        if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbComMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbComMts_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
                        {
                           GXCCtl = "ALBCOMMTS_" + sGXsfl_79_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtAlbComMts_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A13318AlbComMts = DecimalUtil.ZERO ;
                        }
                        else
                        {
                           A13318AlbComMts = localUtil.ctond( httpContext.cgiGet( edtAlbComMts_Internalname)) ;
                        }
                        A13320AlbComArt = httpContext.cgiGet( edtAlbComArt_Internalname) ;
                        A13321AlbComArtD = httpContext.cgiGet( edtAlbComArtD_Internalname) ;
                        A13322AlbComCol = httpContext.cgiGet( edtAlbComCol_Internalname) ;
                        if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbComKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbComKgs_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
                        {
                           GXCCtl = "ALBCOMKGS_" + sGXsfl_79_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtAlbComKgs_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A13319AlbComKgs = DecimalUtil.ZERO ;
                        }
                        else
                        {
                           A13319AlbComKgs = localUtil.ctond( httpContext.cgiGet( edtAlbComKgs_Internalname)) ;
                        }
                        A15AlbComDsc = httpContext.cgiGet( edtAlbComDsc_Internalname) ;
                        A21AlbComPre = localUtil.ctond( httpContext.cgiGet( edtAlbComPre_Internalname)) ;
                        A13AlbComCnt = localUtil.ctond( httpContext.cgiGet( edtAlbComCnt_Internalname)) ;
                        A10355AlbComHd = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbComHd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        A10356ALbComR = (byte)(localUtil.ctol( httpContext.cgiGet( edtALbComR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        A10357AlbComP = httpContext.cgiGet( edtAlbComP_Internalname) ;
                        A10806AlbComDc2 = httpContext.cgiGet( edtAlbComDc2_Internalname) ;
                        A5010AlbComProd = httpContext.cgiGet( edtAlbComProd_Internalname) ;
                        A12AlbCImpLin = localUtil.ctond( httpContext.cgiGet( edtAlbCImpLin_Internalname)) ;
                        A3914AlbCImpL = localUtil.ctond( httpContext.cgiGet( edtAlbCImpL_Internalname)) ;
                        GXCCtl = "Z20AlbComLin_" + sGXsfl_79_idx ;
                        Z20AlbComLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "Z10355AlbComHd_" + sGXsfl_79_idx ;
                        Z10355AlbComHd = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "Z10356ALbComR_" + sGXsfl_79_idx ;
                        Z10356ALbComR = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "Z10357AlbComP_" + sGXsfl_79_idx ;
                        Z10357AlbComP = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z13321AlbComArtD_" + sGXsfl_79_idx ;
                        Z13321AlbComArtD = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z13315AlbComNRef_" + sGXsfl_79_idx ;
                        Z13315AlbComNRef = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z13316AlbComVDoc_" + sGXsfl_79_idx ;
                        Z13316AlbComVDoc = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z13317AlbComPzas_" + sGXsfl_79_idx ;
                        Z13317AlbComPzas = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "Z13318AlbComMts_" + sGXsfl_79_idx ;
                        Z13318AlbComMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
                        GXCCtl = "Z13320AlbComArt_" + sGXsfl_79_idx ;
                        Z13320AlbComArt = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z13322AlbComCol_" + sGXsfl_79_idx ;
                        Z13322AlbComCol = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z13AlbComCnt_" + sGXsfl_79_idx ;
                        Z13AlbComCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
                        GXCCtl = "Z13319AlbComKgs_" + sGXsfl_79_idx ;
                        Z13319AlbComKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
                        GXCCtl = "Z15AlbComDsc_" + sGXsfl_79_idx ;
                        Z15AlbComDsc = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z21AlbComPre_" + sGXsfl_79_idx ;
                        Z21AlbComPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
                        GXCCtl = "Z10806AlbComDc2_" + sGXsfl_79_idx ;
                        Z10806AlbComDc2 = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "Z5010AlbComProd_" + sGXsfl_79_idx ;
                        Z5010AlbComProd = httpContext.cgiGet( GXCCtl) ;
                        GXCCtl = "O12AlbCImpLin_" + sGXsfl_79_idx ;
                        O12AlbCImpLin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
                        GXCCtl = "nRcdDeleted_2_" + sGXsfl_79_idx ;
                        nRcdDeleted_2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "nRcdExists_2_" + sGXsfl_79_idx ;
                        nRcdExists_2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "nIsMod_2_" + sGXsfl_79_idx ;
                        nIsMod_2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "vCLICOD_" + sGXsfl_79_idx ;
                        AV33CliCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        GXCCtl = "vEMPRCOD_" + sGXsfl_79_idx ;
                        AV7EmprCod = httpContext.cgiGet( GXCCtl) ;
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "START") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: Start */
                              e121PQ2 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              /* Execute user event: After Trn */
                              e131PQ2 ();
                           }
                        }
                        else
                        {
                        }
                     }
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
         e131PQ2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1PQ1( ) ;
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
         disableAttributes1PQ1( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
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

   public void confirm_1PQ0( )
   {
      beforeValidate1PQ1( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1PQ1( ) ;
         }
         else
         {
            checkExtendedTable1PQ1( ) ;
            closeExtendedTableCursors1PQ1( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1 = Gx_mode ;
         confirm_1PQ2( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1PQ2( )
   {
      s19AlbComLiC = O19AlbComLiC ;
      httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
      s18AlbComImp = O18AlbComImp ;
      n18AlbComImp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      nGXsfl_79_idx = 0 ;
      while ( nGXsfl_79_idx < nRC_GXsfl_79 )
      {
         readRow1PQ2( ) ;
         if ( ( nRcdExists_2 != 0 ) || ( nIsMod_2 != 0 ) )
         {
            getKey1PQ2( ) ;
            if ( ( nRcdExists_2 == 0 ) && ( nRcdDeleted_2 == 0 ) )
            {
               if ( RcdFound2 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1PQ2( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1PQ2( ) ;
                     closeExtendedTableCursors1PQ2( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O19AlbComLiC = A19AlbComLiC ;
                     httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
                     O18AlbComImp = A18AlbComImp ;
                     n18AlbComImp = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
                  }
               }
               else
               {
                  GXCCtl = "ALBCOMLIN_" + sGXsfl_79_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbComLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound2 != 0 )
               {
                  if ( nRcdDeleted_2 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1PQ2( ) ;
                     load1PQ2( ) ;
                     beforeValidate1PQ2( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1PQ2( ) ;
                        O19AlbComLiC = A19AlbComLiC ;
                        httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
                        O18AlbComImp = A18AlbComImp ;
                        n18AlbComImp = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_2 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1PQ2( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1PQ2( ) ;
                           closeExtendedTableCursors1PQ2( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O19AlbComLiC = A19AlbComLiC ;
                           httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
                           O18AlbComImp = A18AlbComImp ;
                           n18AlbComImp = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_2 == 0 )
                  {
                     GXCCtl = "ALBCOMLIN_" + sGXsfl_79_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbComLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbComLin_Internalname, GXutil.ltrim( localUtil.ntoc( A20AlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComNRef_Internalname, GXutil.rtrim( A13315AlbComNRef)) ;
         httpContext.changePostValue( edtAlbComVDoc_Internalname, GXutil.rtrim( A13316AlbComVDoc)) ;
         httpContext.changePostValue( edtAlbComPzas_Internalname, GXutil.ltrim( localUtil.ntoc( A13317AlbComPzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComMts_Internalname, GXutil.ltrim( localUtil.ntoc( A13318AlbComMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComArt_Internalname, GXutil.rtrim( A13320AlbComArt)) ;
         httpContext.changePostValue( edtAlbComArtD_Internalname, GXutil.rtrim( A13321AlbComArtD)) ;
         httpContext.changePostValue( edtAlbComCol_Internalname, GXutil.rtrim( A13322AlbComCol)) ;
         httpContext.changePostValue( edtAlbComKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A13319AlbComKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComDsc_Internalname, GXutil.rtrim( A15AlbComDsc)) ;
         httpContext.changePostValue( edtAlbComPre_Internalname, GXutil.ltrim( localUtil.ntoc( A21AlbComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A13AlbComCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComHd_Internalname, GXutil.ltrim( localUtil.ntoc( A10355AlbComHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtALbComR_Internalname, GXutil.ltrim( localUtil.ntoc( A10356ALbComR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComP_Internalname, GXutil.rtrim( A10357AlbComP)) ;
         httpContext.changePostValue( edtAlbComDc2_Internalname, GXutil.rtrim( A10806AlbComDc2)) ;
         httpContext.changePostValue( edtAlbComProd_Internalname, GXutil.rtrim( A5010AlbComProd)) ;
         httpContext.changePostValue( edtAlbCImpLin_Internalname, GXutil.ltrim( localUtil.ntoc( A12AlbCImpLin, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbCImpL_Internalname, GXutil.ltrim( localUtil.ntoc( A3914AlbCImpL, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z20AlbComLin_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z20AlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10355AlbComHd_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z10355AlbComHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10356ALbComR_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z10356ALbComR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10357AlbComP_"+sGXsfl_79_idx, GXutil.rtrim( Z10357AlbComP)) ;
         httpContext.changePostValue( "ZT_"+"Z13321AlbComArtD_"+sGXsfl_79_idx, GXutil.rtrim( Z13321AlbComArtD)) ;
         httpContext.changePostValue( "ZT_"+"Z13315AlbComNRef_"+sGXsfl_79_idx, GXutil.rtrim( Z13315AlbComNRef)) ;
         httpContext.changePostValue( "ZT_"+"Z13316AlbComVDoc_"+sGXsfl_79_idx, GXutil.rtrim( Z13316AlbComVDoc)) ;
         httpContext.changePostValue( "ZT_"+"Z13317AlbComPzas_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z13317AlbComPzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13318AlbComMts_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z13318AlbComMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13320AlbComArt_"+sGXsfl_79_idx, GXutil.rtrim( Z13320AlbComArt)) ;
         httpContext.changePostValue( "ZT_"+"Z13322AlbComCol_"+sGXsfl_79_idx, GXutil.rtrim( Z13322AlbComCol)) ;
         httpContext.changePostValue( "ZT_"+"Z13AlbComCnt_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z13AlbComCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13319AlbComKgs_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z13319AlbComKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z15AlbComDsc_"+sGXsfl_79_idx, GXutil.rtrim( Z15AlbComDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z21AlbComPre_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z21AlbComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10806AlbComDc2_"+sGXsfl_79_idx, GXutil.rtrim( Z10806AlbComDc2)) ;
         httpContext.changePostValue( "ZT_"+"Z5010AlbComProd_"+sGXsfl_79_idx, GXutil.rtrim( Z5010AlbComProd)) ;
         httpContext.changePostValue( "T12AlbCImpLin_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( O12AlbCImpLin, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_2_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_2_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_2_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_2 != 0 )
         {
            httpContext.changePostValue( "ALBCOMLIN_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMNREF_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComNRef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMVDOC_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComVDoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMPZAS_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComPzas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMMTS_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMART_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComArt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMARTD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComArtD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMCOL_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMKGS_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMDSC_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMPRE_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMCNT_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMHD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComHd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMR_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALbComR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMP_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMDC2_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComDc2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMPROD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComProd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCIMPLIN_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCImpLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCIMPL_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCImpL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O19AlbComLiC = s19AlbComLiC ;
      httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
      O18AlbComImp = s18AlbComImp ;
      n18AlbComImp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1PQ0( )
   {
   }

   public void e121PQ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV15Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentocomercialv01_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Station", AV15Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentocomercialv01_impl.this.AV7EmprCod = GXv_char2[0] ;
      documentocomercialv01_impl.this.AV16EmprNom = GXv_char3[0] ;
      documentocomercialv01_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = AV28CambioP ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "CAMPRI", ""), GXv_int6) ;
      documentocomercialv01_impl.this.GXt_int5 = GXv_int6[0] ;
      AV28CambioP = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28CambioP", GXutil.str( AV28CambioP, 1, 0));
      GXt_char1 = AV15Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      documentocomercialv01_impl.this.GXt_char1 = GXv_char4[0] ;
      AV15Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Station", AV15Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char4, GXv_char3, GXv_char2) ;
      documentocomercialv01_impl.this.AV7EmprCod = GXv_char4[0] ;
      documentocomercialv01_impl.this.AV16EmprNom = GXv_char3[0] ;
      documentocomercialv01_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext7[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV9WWPContext = GXv_SdtWWPContext7[0] ;
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV10TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV35Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV36GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GXV1), 8, 0));
         while ( AV36GXV1 <= AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV14TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV36GXV1));
            if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CliCod") == 0 )
            {
               AV12Insert_CliCod = (int)(GXutil.lval( AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Insert_CliCod), 6, 0));
            }
            else if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV13Insert_TrnCod = (short)(GXutil.lval( AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Insert_TrnCod), 4, 0));
            }
            else if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlcDivCod") == 0 )
            {
               AV19Insert_AlcDivCod = (byte)(GXutil.lval( AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Insert_AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Insert_AlcDivCod), 2, 0));
            }
            AV36GXV1 = (int)(AV36GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GXV1), 8, 0));
         }
      }
      edtAlbComFs_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFs_Visible), 5, 0), true);
      edtfindDomEnv_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtfindDomEnv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtfindDomEnv_Visible), 5, 0), true);
      edtAlbComEAT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComEAT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComEAT_Visible), 5, 0), true);
      edtAlbComID_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComID_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComID_Visible), 5, 0), true);
      edtAlbComAT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComAT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComAT_Visible), 5, 0), true);
      edtAlbComFd_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFd_Visible), 5, 0), true);
      edtAlbCTrNm_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCTrNm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCTrNm_Visible), 5, 0), true);
      edtAlbCTrNc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCTrNc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCTrNc_Visible), 5, 0), true);
      edtAlbCTrDm_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCTrDm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCTrDm_Visible), 5, 0), true);
      edtAlbComImp_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComImp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComImp_Visible), 5, 0), true);
      edtAlbComEst_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComEst_Visible), 5, 0), true);
      edtAlbComLiC_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComLiC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLiC_Visible), 5, 0), true);
      edtAlbComEso_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComEso_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComEso_Visible), 5, 0), true);
      edtAlbComFdD_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFdD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFdD_Visible), 5, 0), true);
      edtAlbCSec_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCSec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCSec_Visible), 5, 0), true);
      edtAlbComSt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComSt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComSt_Visible), 5, 0), true);
      edtAlcIvaCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlcIvaCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlcIvaCod_Visible), 5, 0), true);
      edtAlcDivCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlcDivCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlcDivCod_Visible), 5, 0), true);
      edtAlcDivTCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlcDivTCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlcDivTCod_Visible), 5, 0), true);
   }

   public void e131PQ2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( 0 == 1 )
      {
         if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
         {
            callWebObject(formatLink("app.documentocomercialv01ww", new String[] {}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A14AlbComCod ;
      new app.pelcaco(remoteHandle, context).execute( GXv_char4, GXv_int8) ;
      documentocomercialv01_impl.this.A396EmprCod = GXv_char4[0] ;
      documentocomercialv01_impl.this.A14AlbComCod = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      httpContext.popup(formatLink("app.imprimirdocumentocomercial", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0))}, new String[] {"Emprcod","AlbComCod"}) , new Object[] {"A396EmprCod","A14AlbComCod"});
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void zm1PQ1( int GX_JID )
   {
      if ( ( GX_JID == 66 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10013AlbComFs = T01PQ5_A10013AlbComFs[0] ;
            Z4829AlbComHor = T01PQ5_A4829AlbComHor[0] ;
            Z17AlbComFch = T01PQ5_A17AlbComFch[0] ;
            Z22AlbComPri = T01PQ5_A22AlbComPri[0] ;
            Z5142AlcDomEnv = T01PQ5_A5142AlcDomEnv[0] ;
            Z4830AlbComMat = T01PQ5_A4830AlbComMat[0] ;
            Z10739AlbComEAT = T01PQ5_A10739AlbComEAT[0] ;
            Z10740AlbComID = T01PQ5_A10740AlbComID[0] ;
            Z10764AlbComAT = T01PQ5_A10764AlbComAT[0] ;
            Z10014AlbComFd = T01PQ5_A10014AlbComFd[0] ;
            Z11719AlbCTrNm = T01PQ5_A11719AlbCTrNm[0] ;
            Z11721AlbCTrNc = T01PQ5_A11721AlbCTrNc[0] ;
            Z11720AlbCTrDm = T01PQ5_A11720AlbCTrDm[0] ;
            Z16AlbComEst = T01PQ5_A16AlbComEst[0] ;
            Z19AlbComLiC = T01PQ5_A19AlbComLiC[0] ;
            Z1783AlbComEso = T01PQ5_A1783AlbComEso[0] ;
            Z10015AlbComFdD = T01PQ5_A10015AlbComFdD[0] ;
            Z3094AlbCSec = T01PQ5_A3094AlbCSec[0] ;
            Z10738AlbComSt = T01PQ5_A10738AlbComSt[0] ;
            Z5143AlcIvaCod = T01PQ5_A5143AlcIvaCod[0] ;
            Z3095AlcDivTCod = T01PQ5_A3095AlcDivTCod[0] ;
            Z252CliCod = T01PQ5_A252CliCod[0] ;
            Z840TrnCod = T01PQ5_A840TrnCod[0] ;
            Z3111AlcDivCod = T01PQ5_A3111AlcDivCod[0] ;
         }
         else
         {
            Z10013AlbComFs = A10013AlbComFs ;
            Z4829AlbComHor = A4829AlbComHor ;
            Z17AlbComFch = A17AlbComFch ;
            Z22AlbComPri = A22AlbComPri ;
            Z5142AlcDomEnv = A5142AlcDomEnv ;
            Z4830AlbComMat = A4830AlbComMat ;
            Z10739AlbComEAT = A10739AlbComEAT ;
            Z10740AlbComID = A10740AlbComID ;
            Z10764AlbComAT = A10764AlbComAT ;
            Z10014AlbComFd = A10014AlbComFd ;
            Z11719AlbCTrNm = A11719AlbCTrNm ;
            Z11721AlbCTrNc = A11721AlbCTrNc ;
            Z11720AlbCTrDm = A11720AlbCTrDm ;
            Z16AlbComEst = A16AlbComEst ;
            Z19AlbComLiC = A19AlbComLiC ;
            Z1783AlbComEso = A1783AlbComEso ;
            Z10015AlbComFdD = A10015AlbComFdD ;
            Z3094AlbCSec = A3094AlbCSec ;
            Z10738AlbComSt = A10738AlbComSt ;
            Z5143AlcIvaCod = A5143AlcIvaCod ;
            Z3095AlcDivTCod = A3095AlcDivTCod ;
            Z252CliCod = A252CliCod ;
            Z840TrnCod = A840TrnCod ;
            Z3111AlcDivCod = A3111AlcDivCod ;
         }
      }
      if ( GX_JID == -66 )
      {
         Z14AlbComCod = A14AlbComCod ;
         Z10013AlbComFs = A10013AlbComFs ;
         Z4829AlbComHor = A4829AlbComHor ;
         Z17AlbComFch = A17AlbComFch ;
         Z22AlbComPri = A22AlbComPri ;
         Z5142AlcDomEnv = A5142AlcDomEnv ;
         Z4830AlbComMat = A4830AlbComMat ;
         Z10739AlbComEAT = A10739AlbComEAT ;
         Z10740AlbComID = A10740AlbComID ;
         Z10764AlbComAT = A10764AlbComAT ;
         Z10014AlbComFd = A10014AlbComFd ;
         Z11719AlbCTrNm = A11719AlbCTrNm ;
         Z11721AlbCTrNc = A11721AlbCTrNc ;
         Z11720AlbCTrDm = A11720AlbCTrDm ;
         Z16AlbComEst = A16AlbComEst ;
         Z19AlbComLiC = A19AlbComLiC ;
         Z1783AlbComEso = A1783AlbComEso ;
         Z10015AlbComFdD = A10015AlbComFdD ;
         Z3094AlbCSec = A3094AlbCSec ;
         Z10738AlbComSt = A10738AlbComSt ;
         Z5143AlcIvaCod = A5143AlcIvaCod ;
         Z3095AlcDivTCod = A3095AlcDivTCod ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z840TrnCod = A840TrnCod ;
         Z3111AlcDivCod = A3111AlcDivCod ;
         Z407EmprNom = A407EmprNom ;
         Z18AlbComImp = A18AlbComImp ;
         Z279CliNom = A279CliNom ;
         Z13739findDomEnv = A13739findDomEnv ;
         Z841TrnNom = A841TrnNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbComLiC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComLiC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLiC_Enabled), 5, 0), true);
      AV35Pgmname = "DocumentoComercialv01" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbComLiC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComLiC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLiC_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01PQ6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01PQ6_A407EmprNom[0] ;
      n407EmprNom = T01PQ6_n407EmprNom[0] ;
      pr_default.close(4);
      if ( ! (0==AV8AlbComCod) )
      {
         A14AlbComCod = AV8AlbComCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
      if ( ! (0==AV8AlbComCod) )
      {
         edtAlbComCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            edtAlbComCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
         }
         else
         {
            edtAlbComCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
         }
      }
      if ( ! (0==AV8AlbComCod) )
      {
         edtAlbComCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_TrnCod) )
      {
         edtTrnCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTrnCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV19Insert_AlcDivCod) )
      {
         edtAlcDivCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlcDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlcDivCod_Enabled), 5, 0), true);
      }
      else
      {
         edtAlcDivCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlcDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlcDivCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( isUpd( )  )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_TrnCod) )
      {
         A840TrnCod = AV13Insert_TrnCod ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         /* Using cursor T01PQ13 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         h840TrnCod = "" ;
         while ( (pr_default.getStatus(10) != 101) )
         {
            h840TrnCod = T01PQ13_A13738TrnCNom[0] ;
            if (true) break;
         }
         pr_default.close(10);
         httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_CliCod) )
      {
         A252CliCod = AV12Insert_CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         /* Using cursor T01PQ14 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         h252CliCod = "" ;
         while ( (pr_default.getStatus(11) != 101) )
         {
            h252CliCod = T01PQ14_A13735CliCNom[0] ;
            if (true) break;
         }
         pr_default.close(11);
         httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( isUpd( )  )
         {
            edtCliCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
         }
         else
         {
            edtCliCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         edtAlbComCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV19Insert_AlcDivCod) )
      {
         A3111AlcDivCod = AV19Insert_AlcDivCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A3111AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3111AlcDivCod), 2, 0));
      }
      else
      {
         if ( isIns( )  && (0==A3111AlcDivCod) && ( Gx_BScreen == 0 ) )
         {
            A3111AlcDivCod = (byte)(2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3111AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3111AlcDivCod), 2, 0));
         }
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A17AlbComFch)) && ( Gx_BScreen == 0 ) )
      {
         A17AlbComFch = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
      }
      if ( isIns( )  && (GXutil.strcmp("", A3095AlcDivTCod)==0) && ( Gx_BScreen == 0 ) )
      {
         A3095AlcDivTCod = httpContext.getMessage( httpContext.getMessage( "E", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A3095AlcDivTCod", A3095AlcDivTCod);
      }
      if ( isIns( )  && (0==A10739AlbComEAT) && ( Gx_BScreen == 0 ) )
      {
         A10739AlbComEAT = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A10738AlbComSt)==0) && ( Gx_BScreen == 0 ) )
      {
         A10738AlbComSt = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A10738AlbComSt", A10738AlbComSt);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10740AlbComID)==0) && ( Gx_BScreen == 0 ) )
      {
         A10740AlbComID = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A10740AlbComID", A10740AlbComID);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10764AlbComAT)==0) && ( Gx_BScreen == 0 ) )
      {
         A10764AlbComAT = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A10764AlbComAT", A10764AlbComAT);
      }
      if ( isIns( )  && (GXutil.strcmp("", A22AlbComPri)==0) && ( Gx_BScreen == 0 ) )
      {
         A22AlbComPri = AV18AlbComPri ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01PQ12 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         if ( (pr_default.getStatus(9) != 101) )
         {
            A18AlbComImp = T01PQ12_A18AlbComImp[0] ;
            n18AlbComImp = T01PQ12_n18AlbComImp[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         }
         else
         {
            A18AlbComImp = DecimalUtil.doubleToDec(0) ;
            n18AlbComImp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         }
         O18AlbComImp = A18AlbComImp ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         pr_default.close(9);
         GXt_int9 = A14254AlbLineasL ;
         GXv_int10[0] = GXt_int9 ;
         new app.haydatoslalcom(remoteHandle, context).execute( A396EmprCod, A14AlbComCod, GXv_int10) ;
         documentocomercialv01_impl.this.GXt_int9 = GXv_int10[0] ;
         A14254AlbLineasL = (byte)(GXt_int9) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14254AlbLineasL", GXutil.str( A14254AlbLineasL, 1, 0));
         /* Using cursor T01PQ8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01PQ8_A841TrnNom[0] ;
         n841TrnNom = T01PQ8_n841TrnNom[0] ;
         pr_default.close(6);
         /* Using cursor T01PQ7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01PQ7_A279CliNom[0] ;
         pr_default.close(5);
         AV30guiremcli = O252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30guiremcli), 6, 0));
         AV29oldAlbComPri = O22AlbComPri ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29oldAlbComPri", AV29oldAlbComPri);
         if ( GXutil.strcmp(A22AlbComPri, "0") == 0 )
         {
            AV31ContCod = "100012" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31ContCod", AV31ContCod);
         }
         else
         {
            if ( GXutil.strcmp(A22AlbComPri, "1") == 0 )
            {
               AV31ContCod = "100011" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31ContCod", AV31ContCod);
            }
         }
      }
   }

   public void load1PQ1( )
   {
      /* Using cursor T01PQ16 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A10013AlbComFs = T01PQ16_A10013AlbComFs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4829AlbComHor = T01PQ16_A4829AlbComHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A407EmprNom = T01PQ16_A407EmprNom[0] ;
         n407EmprNom = T01PQ16_n407EmprNom[0] ;
         A17AlbComFch = T01PQ16_A17AlbComFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         A22AlbComPri = T01PQ16_A22AlbComPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         A5142AlcDomEnv = T01PQ16_A5142AlcDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5142AlcDomEnv", GXutil.str( A5142AlcDomEnv, 1, 0));
         A279CliNom = T01PQ16_A279CliNom[0] ;
         A841TrnNom = T01PQ16_A841TrnNom[0] ;
         n841TrnNom = T01PQ16_n841TrnNom[0] ;
         A4830AlbComMat = T01PQ16_A4830AlbComMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4830AlbComMat", A4830AlbComMat);
         A10739AlbComEAT = T01PQ16_A10739AlbComEAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
         A10740AlbComID = T01PQ16_A10740AlbComID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10740AlbComID", A10740AlbComID);
         A10764AlbComAT = T01PQ16_A10764AlbComAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10764AlbComAT", A10764AlbComAT);
         A10014AlbComFd = T01PQ16_A10014AlbComFd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10014AlbComFd", A10014AlbComFd);
         A11719AlbCTrNm = T01PQ16_A11719AlbCTrNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11719AlbCTrNm", A11719AlbCTrNm);
         A11721AlbCTrNc = T01PQ16_A11721AlbCTrNc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11721AlbCTrNc", A11721AlbCTrNc);
         A11720AlbCTrDm = T01PQ16_A11720AlbCTrDm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11720AlbCTrDm", A11720AlbCTrDm);
         A16AlbComEst = T01PQ16_A16AlbComEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16AlbComEst", GXutil.str( A16AlbComEst, 1, 0));
         A19AlbComLiC = T01PQ16_A19AlbComLiC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         A1783AlbComEso = T01PQ16_A1783AlbComEso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1783AlbComEso", GXutil.str( A1783AlbComEso, 1, 0));
         A10015AlbComFdD = T01PQ16_A10015AlbComFdD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10015AlbComFdD", A10015AlbComFdD);
         A3094AlbCSec = T01PQ16_A3094AlbCSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3094AlbCSec", A3094AlbCSec);
         A10738AlbComSt = T01PQ16_A10738AlbComSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10738AlbComSt", A10738AlbComSt);
         A5143AlcIvaCod = T01PQ16_A5143AlcIvaCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5143AlcIvaCod", A5143AlcIvaCod);
         A3095AlcDivTCod = T01PQ16_A3095AlcDivTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3095AlcDivTCod", A3095AlcDivTCod);
         A252CliCod = T01PQ16_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01PQ16_A840TrnCod[0] ;
         n840TrnCod = T01PQ16_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A3111AlcDivCod = T01PQ16_A3111AlcDivCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3111AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3111AlcDivCod), 2, 0));
         A13739findDomEnv = T01PQ16_A13739findDomEnv[0] ;
         n13739findDomEnv = T01PQ16_n13739findDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
         A18AlbComImp = T01PQ16_A18AlbComImp[0] ;
         n18AlbComImp = T01PQ16_n18AlbComImp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         zm1PQ1( -66) ;
      }
      pr_default.close(12);
      onLoadActions1PQ1( ) ;
   }

   public void onLoadActions1PQ1( )
   {
      O18AlbComImp = A18AlbComImp ;
      n18AlbComImp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A4829AlbComHor) && true /* After */ )
      {
         GXt_dtime11 = A4829AlbComHor ;
         GXv_dtime12[0] = GXt_dtime11 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime12) ;
         documentocomercialv01_impl.this.GXt_dtime11 = GXv_dtime12[0] ;
         A4829AlbComHor = GXt_dtime11 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      AV29oldAlbComPri = O22AlbComPri ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29oldAlbComPri", AV29oldAlbComPri);
      if ( GXutil.strcmp(A22AlbComPri, "0") == 0 )
      {
         AV31ContCod = "100012" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31ContCod", AV31ContCod);
      }
      else
      {
         if ( GXutil.strcmp(A22AlbComPri, "1") == 0 )
         {
            AV31ContCod = "100011" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31ContCod", AV31ContCod);
         }
      }
      AV30guiremcli = O252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30guiremcli), 6, 0));
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A10013AlbComFs) && ( Gx_BScreen == 0 ) )
      {
         A10013AlbComFs = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         if ( isUpd( )  && GXutil.dateCompare(GXutil.nullDate(), A10013AlbComFs) )
         {
            A10013AlbComFs = GXutil.now( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
      }
      GXt_int9 = A14254AlbLineasL ;
      GXv_int10[0] = GXt_int9 ;
      new app.haydatoslalcom(remoteHandle, context).execute( A396EmprCod, A14AlbComCod, GXv_int10) ;
      documentocomercialv01_impl.this.GXt_int9 = GXv_int10[0] ;
      A14254AlbLineasL = (byte)(GXt_int9) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14254AlbLineasL", GXutil.str( A14254AlbLineasL, 1, 0));
      /* Using cursor T01PQ17 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      h252CliCod = "" ;
      while ( (pr_default.getStatus(13) != 101) )
      {
         h252CliCod = T01PQ17_A13735CliCNom[0] ;
         if (true) break;
      }
      pr_default.close(13);
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      /* Using cursor T01PQ18 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      h840TrnCod = "" ;
      while ( (pr_default.getStatus(14) != 101) )
      {
         h840TrnCod = T01PQ18_A13738TrnCNom[0] ;
         if (true) break;
      }
      pr_default.close(14);
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
   }

   public void checkExtendedTable1PQ1( )
   {
      nIsDirty_1 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h252CliCod)==0) )
      {
         nIsDirty_1 = (short)(1) ;
         A252CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         A13735CliCNom = h252CliCod ;
         /* Using cursor T01PQ19 */
         pr_default.execute(15, new Object[] {A13735CliCNom, A396EmprCod});
         A396EmprCod = T01PQ19_A396EmprCod[0] ;
         A252CliCod = T01PQ19_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A252CliCod = T01PQ19_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         if ( ! ( (pr_default.getStatus(15) == 101) ) )
         {
            pr_default.readNext(15);
            if ( ! ( (pr_default.getStatus(15) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(15);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         nIsDirty_1 = (short)(1) ;
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         A13738TrnCNom = h840TrnCod ;
         /* Using cursor T01PQ20 */
         pr_default.execute(16, new Object[] {A13738TrnCNom, A396EmprCod});
         A396EmprCod = T01PQ20_A396EmprCod[0] ;
         A840TrnCod = T01PQ20_A840TrnCod[0] ;
         n840TrnCod = T01PQ20_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A840TrnCod = T01PQ20_A840TrnCod[0] ;
         n840TrnCod = T01PQ20_n840TrnCod[0] ;
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A4829AlbComHor) && true /* After */ )
      {
         nIsDirty_1 = (short)(1) ;
         GXt_dtime11 = A4829AlbComHor ;
         GXv_dtime12[0] = GXt_dtime11 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime12) ;
         documentocomercialv01_impl.this.GXt_dtime11 = GXv_dtime12[0] ;
         A4829AlbComHor = GXt_dtime11 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( true /* Level */ && true /* After */ && ( AV22Ctrlf == 1 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A22AlbComPri ;
         GXv_int6[0] = (byte)(2) ;
         GXv_date13[0] = AV24Fch ;
         GXv_int8[0] = AV25AlbLast ;
         GXv_date14[0] = A17AlbComFch ;
         GXv_char2[0] = AV23Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_date13, GXv_int8, GXv_date14, GXv_char2) ;
         documentocomercialv01_impl.this.A396EmprCod = GXv_char4[0] ;
         documentocomercialv01_impl.this.A22AlbComPri = GXv_char3[0] ;
         documentocomercialv01_impl.this.AV24Fch = GXv_date13[0] ;
         documentocomercialv01_impl.this.AV25AlbLast = GXv_int8[0] ;
         documentocomercialv01_impl.this.A17AlbComFch = GXv_date14[0] ;
         documentocomercialv01_impl.this.AV23Msg_f = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV24Fch", localUtil.format(AV24Fch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV25AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AlbLast), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Msg_f", AV23Msg_f);
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A17AlbComFch)) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Campo Incorrecto", ""), 1, "ALBCOMFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(AV23Msg_f, " ") != 0 ) && true /* Level */ && true /* After */ )
      {
         httpContext.GX_msglist.addItem(AV23Msg_f, 1, "ALBCOMFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A22AlbComPri, "0") == 0 ) || ( GXutil.strcmp(A22AlbComPri, "1") == 0 ) || ( GXutil.strcmp(A22AlbComPri, "2") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "P", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBCOMPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbComPri.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV29oldAlbComPri = O22AlbComPri ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29oldAlbComPri", AV29oldAlbComPri);
      if ( GXutil.strcmp(A22AlbComPri, "0") == 0 )
      {
         AV31ContCod = "100012" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31ContCod", AV31ContCod);
      }
      else
      {
         if ( GXutil.strcmp(A22AlbComPri, "1") == 0 )
         {
            AV31ContCod = "100011" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31ContCod", AV31ContCod);
         }
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A14AlbComCod) && ( ( AV27FirmaD == 1 ) || ( AV26Cernum == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR: Intentamos dar de ALTA un ALBARAN > CONTADOR manualmente", ""), 1, "ALBCOMPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbComPri.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isUpd( )  && ( GXutil.strcmp(A22AlbComPri, AV29oldAlbComPri) != 0 ) && ( AV28CambioP == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.NO se puede cambiar este campo ¡¡¡", ""), 1, "ALBCOMPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbComPri.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV30guiremcli = O252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30guiremcli), 6, 0));
      if ( isUpd( )  && ( A252CliCod != AV30guiremcli ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.NO se puede cambiar Cliente, Guia comunicada AT ¡¡¡", ""), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( A16AlbComEst > 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Albaran FACTURADO", ""), 1, "ALBCOMEST");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComEst_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01PQ9 */
      pr_default.execute(7, new Object[] {Byte.valueOf(A3111AlcDivCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlbC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALCDIVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlcDivCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(7);
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A10013AlbComFs) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1 = (short)(1) ;
         A10013AlbComFs = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         if ( isUpd( )  && GXutil.dateCompare(GXutil.nullDate(), A10013AlbComFs) )
         {
            nIsDirty_1 = (short)(1) ;
            A10013AlbComFs = GXutil.now( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
      }
      if ( (GXutil.strcmp("", h252CliCod)==0) )
      {
         nIsDirty_1 = (short)(1) ;
         A252CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         A13735CliCNom = h252CliCod ;
         /* Using cursor T01PQ21 */
         pr_default.execute(17, new Object[] {A13735CliCNom, A396EmprCod});
         A396EmprCod = T01PQ21_A396EmprCod[0] ;
         A252CliCod = T01PQ21_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A252CliCod = T01PQ21_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         if ( ! ( (pr_default.getStatus(17) == 101) ) )
         {
            pr_default.readNext(17);
            if ( ! ( (pr_default.getStatus(17) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(17);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         nIsDirty_1 = (short)(1) ;
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         A13738TrnCNom = h840TrnCod ;
         /* Using cursor T01PQ22 */
         pr_default.execute(18, new Object[] {A13738TrnCNom, A396EmprCod});
         A396EmprCod = T01PQ22_A396EmprCod[0] ;
         A840TrnCod = T01PQ22_A840TrnCod[0] ;
         n840TrnCod = T01PQ22_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A840TrnCod = T01PQ22_A840TrnCod[0] ;
         n840TrnCod = T01PQ22_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         if ( ! ( (pr_default.getStatus(18) == 101) ) )
         {
            pr_default.readNext(18);
            if ( ! ( (pr_default.getStatus(18) == 101) ) )
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
         pr_default.close(18);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      /* Using cursor T01PQ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01PQ7_A279CliNom[0] ;
      pr_default.close(5);
      /* Using cursor T01PQ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A13738TrnCNom)==0) || (0==A840TrnCod) && n840TrnCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01PQ8_A841TrnNom[0] ;
      n841TrnNom = T01PQ8_n841TrnNom[0] ;
      pr_default.close(6);
      /* Using cursor T01PQ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A5142AlcDomEnv)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A13739findDomEnv = T01PQ10_A13739findDomEnv[0] ;
         n13739findDomEnv = T01PQ10_n13739findDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
      }
      else
      {
         nIsDirty_1 = (short)(1) ;
         A13739findDomEnv = (byte)(0) ;
         n13739findDomEnv = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
      }
      pr_default.close(8);
      if ( (0==A13739findDomEnv) && ( ! (0==A5142AlcDomEnv) && true /* Level */ ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Endereço de entrega inexistente", ""), 1, "ALCDOMENV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlcDomEnv_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01PQ12 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A18AlbComImp = T01PQ12_A18AlbComImp[0] ;
         n18AlbComImp = T01PQ12_n18AlbComImp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      }
      else
      {
         nIsDirty_1 = (short)(1) ;
         A18AlbComImp = DecimalUtil.doubleToDec(0) ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      }
      pr_default.close(9);
      nIsDirty_1 = (short)(1) ;
      GXt_int9 = A14254AlbLineasL ;
      GXv_int10[0] = GXt_int9 ;
      new app.haydatoslalcom(remoteHandle, context).execute( A396EmprCod, A14AlbComCod, GXv_int10) ;
      documentocomercialv01_impl.this.GXt_int9 = GXv_int10[0] ;
      A14254AlbLineasL = (byte)(GXt_int9) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14254AlbLineasL", GXutil.str( A14254AlbLineasL, 1, 0));
      if ( (0==A14AlbComCod) && true /* Level */ )
      {
         GXv_int8[0] = A14AlbComCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV31ContCod, GXv_int8) ;
         documentocomercialv01_impl.this.A14AlbComCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
   }

   public void closeExtendedTableCursors1PQ1( )
   {
      pr_default.close(7);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(8);
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void gxload_70( byte A3111AlcDivCod )
   {
      /* Using cursor T01PQ23 */
      pr_default.execute(19, new Object[] {Byte.valueOf(A3111AlcDivCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlbC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALCDIVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlcDivCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void gxload_68( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01PQ24 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01PQ24_A279CliNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void gxload_69( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01PQ25 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A13738TrnCNom)==0) || (0==A840TrnCod) && n840TrnCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01PQ25_A841TrnNom[0] ;
      n841TrnNom = T01PQ25_n841TrnNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void gxload_71( String A396EmprCod ,
                          int A252CliCod ,
                          byte A5142AlcDomEnv )
   {
      /* Using cursor T01PQ26 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A5142AlcDomEnv)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         A13739findDomEnv = T01PQ26_A13739findDomEnv[0] ;
         n13739findDomEnv = T01PQ26_n13739findDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
      }
      else
      {
         A13739findDomEnv = (byte)(0) ;
         n13739findDomEnv = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13739findDomEnv, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void gxload_72( String A396EmprCod ,
                          int A14AlbComCod )
   {
      /* Using cursor T01PQ28 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         A18AlbComImp = T01PQ28_A18AlbComImp[0] ;
         n18AlbComImp = T01PQ28_n18AlbComImp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      }
      else
      {
         A18AlbComImp = DecimalUtil.doubleToDec(0) ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A18AlbComImp, (byte)(13), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(23) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(23);
   }

   public void getKey1PQ1( )
   {
      /* Using cursor T01PQ29 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1 = (short)(1) ;
      }
      else
      {
         RcdFound1 = (short)(0) ;
      }
      pr_default.close(24);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01PQ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1PQ1( 66) ;
         RcdFound1 = (short)(1) ;
         A14AlbComCod = T01PQ5_A14AlbComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
         A10013AlbComFs = T01PQ5_A10013AlbComFs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4829AlbComHor = T01PQ5_A4829AlbComHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A17AlbComFch = T01PQ5_A17AlbComFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         A22AlbComPri = T01PQ5_A22AlbComPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         A5142AlcDomEnv = T01PQ5_A5142AlcDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5142AlcDomEnv", GXutil.str( A5142AlcDomEnv, 1, 0));
         A4830AlbComMat = T01PQ5_A4830AlbComMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4830AlbComMat", A4830AlbComMat);
         A10739AlbComEAT = T01PQ5_A10739AlbComEAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
         A10740AlbComID = T01PQ5_A10740AlbComID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10740AlbComID", A10740AlbComID);
         A10764AlbComAT = T01PQ5_A10764AlbComAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10764AlbComAT", A10764AlbComAT);
         A10014AlbComFd = T01PQ5_A10014AlbComFd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10014AlbComFd", A10014AlbComFd);
         A11719AlbCTrNm = T01PQ5_A11719AlbCTrNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11719AlbCTrNm", A11719AlbCTrNm);
         A11721AlbCTrNc = T01PQ5_A11721AlbCTrNc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11721AlbCTrNc", A11721AlbCTrNc);
         A11720AlbCTrDm = T01PQ5_A11720AlbCTrDm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11720AlbCTrDm", A11720AlbCTrDm);
         A16AlbComEst = T01PQ5_A16AlbComEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16AlbComEst", GXutil.str( A16AlbComEst, 1, 0));
         A19AlbComLiC = T01PQ5_A19AlbComLiC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         A1783AlbComEso = T01PQ5_A1783AlbComEso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1783AlbComEso", GXutil.str( A1783AlbComEso, 1, 0));
         A10015AlbComFdD = T01PQ5_A10015AlbComFdD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10015AlbComFdD", A10015AlbComFdD);
         A3094AlbCSec = T01PQ5_A3094AlbCSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3094AlbCSec", A3094AlbCSec);
         A10738AlbComSt = T01PQ5_A10738AlbComSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10738AlbComSt", A10738AlbComSt);
         A5143AlcIvaCod = T01PQ5_A5143AlcIvaCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5143AlcIvaCod", A5143AlcIvaCod);
         A3095AlcDivTCod = T01PQ5_A3095AlcDivTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3095AlcDivTCod", A3095AlcDivTCod);
         A396EmprCod = T01PQ5_A396EmprCod[0] ;
         A252CliCod = T01PQ5_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01PQ5_A840TrnCod[0] ;
         n840TrnCod = T01PQ5_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A3111AlcDivCod = T01PQ5_A3111AlcDivCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3111AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3111AlcDivCod), 2, 0));
         O19AlbComLiC = A19AlbComLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         O252CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         O22AlbComPri = A22AlbComPri ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         Z396EmprCod = A396EmprCod ;
         Z14AlbComCod = A14AlbComCod ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1PQ1( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1 = (short)(0) ;
            initializeNonKey1PQ1( ) ;
         }
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1 = (short)(0) ;
         initializeNonKey1PQ1( ) ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1PQ1( ) ;
      if ( RcdFound1 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1 = (short)(0) ;
      /* Using cursor T01PQ30 */
      pr_default.execute(25, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         while ( (pr_default.getStatus(25) != 101) && ( ( GXutil.strcmp(T01PQ30_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01PQ30_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PQ30_A14AlbComCod[0] < A14AlbComCod ) ) )
         {
            pr_default.readNext(25);
         }
         if ( (pr_default.getStatus(25) != 101) && ( ( GXutil.strcmp(T01PQ30_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01PQ30_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PQ30_A14AlbComCod[0] > A14AlbComCod ) ) )
         {
            A396EmprCod = T01PQ30_A396EmprCod[0] ;
            A14AlbComCod = T01PQ30_A14AlbComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(25);
   }

   public void move_previous( )
   {
      RcdFound1 = (short)(0) ;
      /* Using cursor T01PQ31 */
      pr_default.execute(26, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         while ( (pr_default.getStatus(26) != 101) && ( ( GXutil.strcmp(T01PQ31_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01PQ31_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PQ31_A14AlbComCod[0] > A14AlbComCod ) ) )
         {
            pr_default.readNext(26);
         }
         if ( (pr_default.getStatus(26) != 101) && ( ( GXutil.strcmp(T01PQ31_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01PQ31_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PQ31_A14AlbComCod[0] < A14AlbComCod ) ) )
         {
            A396EmprCod = T01PQ31_A396EmprCod[0] ;
            A14AlbComCod = T01PQ31_A14AlbComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(26);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1PQ1( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A19AlbComLiC = O19AlbComLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         A18AlbComImp = O18AlbComImp ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         GX_FocusControl = edtAlbComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1PQ1( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A14AlbComCod != Z14AlbComCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A14AlbComCod = Z14AlbComCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ALBCOMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A19AlbComLiC = O19AlbComLiC ;
               httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
               A18AlbComImp = O18AlbComImp ;
               n18AlbComImp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A19AlbComLiC = O19AlbComLiC ;
               httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
               A18AlbComImp = O18AlbComImp ;
               n18AlbComImp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
               update1PQ1( ) ;
               GX_FocusControl = edtAlbComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A14AlbComCod != Z14AlbComCod ) )
            {
               /* Insert record */
               A19AlbComLiC = O19AlbComLiC ;
               httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
               A18AlbComImp = O18AlbComImp ;
               n18AlbComImp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
               GX_FocusControl = edtAlbComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1PQ1( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ALBCOMCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbComCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A19AlbComLiC = O19AlbComLiC ;
                  httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
                  A18AlbComImp = O18AlbComImp ;
                  n18AlbComImp = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
                  GX_FocusControl = edtAlbComCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1PQ1( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A14AlbComCod != Z14AlbComCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A14AlbComCod = Z14AlbComCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ALBCOMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A19AlbComLiC = O19AlbComLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         A18AlbComImp = O18AlbComImp ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1PQ1( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h252CliCod)==0) )
         {
            A252CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A13735CliCNom = h252CliCod ;
            /* Using cursor T01PQ32 */
            pr_default.execute(27, new Object[] {A13735CliCNom, A396EmprCod});
            A396EmprCod = T01PQ32_A396EmprCod[0] ;
            A252CliCod = T01PQ32_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A252CliCod = T01PQ32_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            if ( ! ( (pr_default.getStatus(27) == 101) ) )
            {
               pr_default.readNext(27);
               if ( ! ( (pr_default.getStatus(27) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "CLICOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(27);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
         if ( (GXutil.strcmp("", h840TrnCod)==0) )
         {
            A840TrnCod = (short)(0) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            A13738TrnCNom = h840TrnCod ;
            /* Using cursor T01PQ33 */
            pr_default.execute(28, new Object[] {A13738TrnCNom, A396EmprCod});
            A396EmprCod = T01PQ33_A396EmprCod[0] ;
            A840TrnCod = T01PQ33_A840TrnCod[0] ;
            n840TrnCod = T01PQ33_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A840TrnCod = T01PQ33_A840TrnCod[0] ;
            n840TrnCod = T01PQ33_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            if ( ! ( (pr_default.getStatus(28) == 101) ) )
            {
               pr_default.readNext(28);
               if ( ! ( (pr_default.getStatus(28) == 101) ) )
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
            pr_default.close(28);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01PQ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALCOM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || !( GXutil.dateCompare(Z10013AlbComFs, T01PQ4_A10013AlbComFs[0]) ) || !( GXutil.dateCompare(Z4829AlbComHor, T01PQ4_A4829AlbComHor[0]) ) || !( GXutil.dateCompare(GXutil.resetTime(Z17AlbComFch), GXutil.resetTime(T01PQ4_A17AlbComFch[0])) ) || ( GXutil.strcmp(Z22AlbComPri, T01PQ4_A22AlbComPri[0]) != 0 ) || ( Z5142AlcDomEnv != T01PQ4_A5142AlcDomEnv[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4830AlbComMat, T01PQ4_A4830AlbComMat[0]) != 0 ) || ( Z10739AlbComEAT != T01PQ4_A10739AlbComEAT[0] ) || ( GXutil.strcmp(Z10740AlbComID, T01PQ4_A10740AlbComID[0]) != 0 ) || ( GXutil.strcmp(Z10764AlbComAT, T01PQ4_A10764AlbComAT[0]) != 0 ) || ( GXutil.strcmp(Z10014AlbComFd, T01PQ4_A10014AlbComFd[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11719AlbCTrNm, T01PQ4_A11719AlbCTrNm[0]) != 0 ) || ( GXutil.strcmp(Z11721AlbCTrNc, T01PQ4_A11721AlbCTrNc[0]) != 0 ) || ( GXutil.strcmp(Z11720AlbCTrDm, T01PQ4_A11720AlbCTrDm[0]) != 0 ) || ( Z16AlbComEst != T01PQ4_A16AlbComEst[0] ) || ( Z19AlbComLiC != T01PQ4_A19AlbComLiC[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1783AlbComEso != T01PQ4_A1783AlbComEso[0] ) || ( GXutil.strcmp(Z10015AlbComFdD, T01PQ4_A10015AlbComFdD[0]) != 0 ) || ( GXutil.strcmp(Z3094AlbCSec, T01PQ4_A3094AlbCSec[0]) != 0 ) || ( GXutil.strcmp(Z10738AlbComSt, T01PQ4_A10738AlbComSt[0]) != 0 ) || ( GXutil.strcmp(Z5143AlcIvaCod, T01PQ4_A5143AlcIvaCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3095AlcDivTCod, T01PQ4_A3095AlcDivTCod[0]) != 0 ) || ( Z252CliCod != T01PQ4_A252CliCod[0] ) || ( Z840TrnCod != T01PQ4_A840TrnCod[0] ) || ( Z3111AlcDivCod != T01PQ4_A3111AlcDivCod[0] ) )
         {
            if ( !( GXutil.dateCompare(Z10013AlbComFs, T01PQ4_A10013AlbComFs[0]) ) )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComFs");
               GXutil.writeLogRaw("Old: ",Z10013AlbComFs);
               GXutil.writeLogRaw("Current: ",T01PQ4_A10013AlbComFs[0]);
            }
            if ( !( GXutil.dateCompare(Z4829AlbComHor, T01PQ4_A4829AlbComHor[0]) ) )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComHor");
               GXutil.writeLogRaw("Old: ",Z4829AlbComHor);
               GXutil.writeLogRaw("Current: ",T01PQ4_A4829AlbComHor[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z17AlbComFch), GXutil.resetTime(T01PQ4_A17AlbComFch[0])) ) )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComFch");
               GXutil.writeLogRaw("Old: ",Z17AlbComFch);
               GXutil.writeLogRaw("Current: ",T01PQ4_A17AlbComFch[0]);
            }
            if ( GXutil.strcmp(Z22AlbComPri, T01PQ4_A22AlbComPri[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComPri");
               GXutil.writeLogRaw("Old: ",Z22AlbComPri);
               GXutil.writeLogRaw("Current: ",T01PQ4_A22AlbComPri[0]);
            }
            if ( Z5142AlcDomEnv != T01PQ4_A5142AlcDomEnv[0] )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlcDomEnv");
               GXutil.writeLogRaw("Old: ",Z5142AlcDomEnv);
               GXutil.writeLogRaw("Current: ",T01PQ4_A5142AlcDomEnv[0]);
            }
            if ( GXutil.strcmp(Z4830AlbComMat, T01PQ4_A4830AlbComMat[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComMat");
               GXutil.writeLogRaw("Old: ",Z4830AlbComMat);
               GXutil.writeLogRaw("Current: ",T01PQ4_A4830AlbComMat[0]);
            }
            if ( Z10739AlbComEAT != T01PQ4_A10739AlbComEAT[0] )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComEAT");
               GXutil.writeLogRaw("Old: ",Z10739AlbComEAT);
               GXutil.writeLogRaw("Current: ",T01PQ4_A10739AlbComEAT[0]);
            }
            if ( GXutil.strcmp(Z10740AlbComID, T01PQ4_A10740AlbComID[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComID");
               GXutil.writeLogRaw("Old: ",Z10740AlbComID);
               GXutil.writeLogRaw("Current: ",T01PQ4_A10740AlbComID[0]);
            }
            if ( GXutil.strcmp(Z10764AlbComAT, T01PQ4_A10764AlbComAT[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComAT");
               GXutil.writeLogRaw("Old: ",Z10764AlbComAT);
               GXutil.writeLogRaw("Current: ",T01PQ4_A10764AlbComAT[0]);
            }
            if ( GXutil.strcmp(Z10014AlbComFd, T01PQ4_A10014AlbComFd[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComFd");
               GXutil.writeLogRaw("Old: ",Z10014AlbComFd);
               GXutil.writeLogRaw("Current: ",T01PQ4_A10014AlbComFd[0]);
            }
            if ( GXutil.strcmp(Z11719AlbCTrNm, T01PQ4_A11719AlbCTrNm[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbCTrNm");
               GXutil.writeLogRaw("Old: ",Z11719AlbCTrNm);
               GXutil.writeLogRaw("Current: ",T01PQ4_A11719AlbCTrNm[0]);
            }
            if ( GXutil.strcmp(Z11721AlbCTrNc, T01PQ4_A11721AlbCTrNc[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbCTrNc");
               GXutil.writeLogRaw("Old: ",Z11721AlbCTrNc);
               GXutil.writeLogRaw("Current: ",T01PQ4_A11721AlbCTrNc[0]);
            }
            if ( GXutil.strcmp(Z11720AlbCTrDm, T01PQ4_A11720AlbCTrDm[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbCTrDm");
               GXutil.writeLogRaw("Old: ",Z11720AlbCTrDm);
               GXutil.writeLogRaw("Current: ",T01PQ4_A11720AlbCTrDm[0]);
            }
            if ( Z16AlbComEst != T01PQ4_A16AlbComEst[0] )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComEst");
               GXutil.writeLogRaw("Old: ",Z16AlbComEst);
               GXutil.writeLogRaw("Current: ",T01PQ4_A16AlbComEst[0]);
            }
            if ( Z19AlbComLiC != T01PQ4_A19AlbComLiC[0] )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComLiC");
               GXutil.writeLogRaw("Old: ",Z19AlbComLiC);
               GXutil.writeLogRaw("Current: ",T01PQ4_A19AlbComLiC[0]);
            }
            if ( Z1783AlbComEso != T01PQ4_A1783AlbComEso[0] )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComEso");
               GXutil.writeLogRaw("Old: ",Z1783AlbComEso);
               GXutil.writeLogRaw("Current: ",T01PQ4_A1783AlbComEso[0]);
            }
            if ( GXutil.strcmp(Z10015AlbComFdD, T01PQ4_A10015AlbComFdD[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComFdD");
               GXutil.writeLogRaw("Old: ",Z10015AlbComFdD);
               GXutil.writeLogRaw("Current: ",T01PQ4_A10015AlbComFdD[0]);
            }
            if ( GXutil.strcmp(Z3094AlbCSec, T01PQ4_A3094AlbCSec[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbCSec");
               GXutil.writeLogRaw("Old: ",Z3094AlbCSec);
               GXutil.writeLogRaw("Current: ",T01PQ4_A3094AlbCSec[0]);
            }
            if ( GXutil.strcmp(Z10738AlbComSt, T01PQ4_A10738AlbComSt[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComSt");
               GXutil.writeLogRaw("Old: ",Z10738AlbComSt);
               GXutil.writeLogRaw("Current: ",T01PQ4_A10738AlbComSt[0]);
            }
            if ( GXutil.strcmp(Z5143AlcIvaCod, T01PQ4_A5143AlcIvaCod[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlcIvaCod");
               GXutil.writeLogRaw("Old: ",Z5143AlcIvaCod);
               GXutil.writeLogRaw("Current: ",T01PQ4_A5143AlcIvaCod[0]);
            }
            if ( GXutil.strcmp(Z3095AlcDivTCod, T01PQ4_A3095AlcDivTCod[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlcDivTCod");
               GXutil.writeLogRaw("Old: ",Z3095AlcDivTCod);
               GXutil.writeLogRaw("Current: ",T01PQ4_A3095AlcDivTCod[0]);
            }
            if ( Z252CliCod != T01PQ4_A252CliCod[0] )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01PQ4_A252CliCod[0]);
            }
            if ( Z840TrnCod != T01PQ4_A840TrnCod[0] )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01PQ4_A840TrnCod[0]);
            }
            if ( Z3111AlcDivCod != T01PQ4_A3111AlcDivCod[0] )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlcDivCod");
               GXutil.writeLogRaw("Old: ",Z3111AlcDivCod);
               GXutil.writeLogRaw("Current: ",T01PQ4_A3111AlcDivCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALCOM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PQ1( )
   {
      beforeValidate1PQ1( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PQ1( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PQ1( 0) ;
         checkOptimisticConcurrency1PQ1( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PQ1( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PQ1( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PQ34 */
                  pr_default.execute(29, new Object[] {Integer.valueOf(A14AlbComCod), A10013AlbComFs, A4829AlbComHor, A17AlbComFch, A22AlbComPri, Byte.valueOf(A5142AlcDomEnv), A4830AlbComMat, Byte.valueOf(A10739AlbComEAT), A10740AlbComID, A10764AlbComAT, A10014AlbComFd, A11719AlbCTrNm, A11721AlbCTrNc, A11720AlbCTrDm, Byte.valueOf(A16AlbComEst), Short.valueOf(A19AlbComLiC), Byte.valueOf(A1783AlbComEso), A10015AlbComFdD, A3094AlbCSec, A10738AlbComSt, A5143AlcIvaCod, A3095AlcDivTCod, A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Byte.valueOf(A3111AlcDivCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
                  if ( (pr_default.getStatus(29) == 1) )
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
                        processLevel1PQ1( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1PQ0( ) ;
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
            load1PQ1( ) ;
         }
         endLevel1PQ1( ) ;
      }
      closeExtendedTableCursors1PQ1( ) ;
   }

   public void update1PQ1( )
   {
      beforeValidate1PQ1( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PQ1( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PQ1( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PQ1( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1PQ1( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PQ35 */
                  pr_default.execute(30, new Object[] {A10013AlbComFs, A4829AlbComHor, A17AlbComFch, A22AlbComPri, Byte.valueOf(A5142AlcDomEnv), A4830AlbComMat, Byte.valueOf(A10739AlbComEAT), A10740AlbComID, A10764AlbComAT, A10014AlbComFd, A11719AlbCTrNm, A11721AlbCTrNc, A11720AlbCTrDm, Byte.valueOf(A16AlbComEst), Short.valueOf(A19AlbComLiC), Byte.valueOf(A1783AlbComEso), A10015AlbComFdD, A3094AlbCSec, A10738AlbComSt, A5143AlcIvaCod, A3095AlcDivTCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Byte.valueOf(A3111AlcDivCod), A396EmprCod, Integer.valueOf(A14AlbComCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
                  if ( (pr_default.getStatus(30) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALCOM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1PQ1( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1PQ1( ) ;
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
         endLevel1PQ1( ) ;
      }
      closeExtendedTableCursors1PQ1( ) ;
   }

   public void deferredUpdate1PQ1( )
   {
   }

   public void delete( )
   {
      beforeValidate1PQ1( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PQ1( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PQ1( ) ;
         afterConfirm1PQ1( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PQ1( ) ;
            if ( AnyError == 0 )
            {
               A19AlbComLiC = O19AlbComLiC ;
               httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
               A18AlbComImp = O18AlbComImp ;
               n18AlbComImp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
               scanStart1PQ2( ) ;
               while ( RcdFound2 != 0 )
               {
                  getByPrimaryKey1PQ2( ) ;
                  delete1PQ2( ) ;
                  scanNext1PQ2( ) ;
                  O19AlbComLiC = A19AlbComLiC ;
                  httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
                  O18AlbComImp = A18AlbComImp ;
                  n18AlbComImp = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
               }
               scanEnd1PQ2( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PQ36 */
                  pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
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
      sMode1 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PQ1( ) ;
      Gx_mode = sMode1 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PQ1( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A14AlbComCod) && ( ( AV27FirmaD == 1 ) || ( AV26Cernum == 1 ) ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR: Intentamos dar de ALTA un ALBARAN > CONTADOR manualmente", ""), 1, "ALBCOMPRI");
            AnyError = (short)(1) ;
            GX_FocusControl = cmbAlbComPri.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( isUpd( )  && ( GXutil.strcmp(A22AlbComPri, AV29oldAlbComPri) != 0 ) && ( AV28CambioP == 0 ) && true /* After */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.NO se puede cambiar este campo ¡¡¡", ""), 1, "ALBCOMPRI");
            AnyError = (short)(1) ;
            GX_FocusControl = cmbAlbComPri.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( isUpd( )  && ( A252CliCod != AV30guiremcli ) && true /* After */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.NO se puede cambiar Cliente, Guia comunicada AT ¡¡¡", ""), 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         AV29oldAlbComPri = O22AlbComPri ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29oldAlbComPri", AV29oldAlbComPri);
         if ( GXutil.strcmp(A22AlbComPri, "0") == 0 )
         {
            AV31ContCod = "100012" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31ContCod", AV31ContCod);
         }
         else
         {
            if ( GXutil.strcmp(A22AlbComPri, "1") == 0 )
            {
               AV31ContCod = "100011" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31ContCod", AV31ContCod);
            }
         }
         AV30guiremcli = O252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30guiremcli), 6, 0));
         if ( ( A16AlbComEst > 1 ) && isDlt( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Albaran FACTURADO", ""), 1, "ALBCOMEST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbComEst_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T01PQ37 */
         pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01PQ37_A279CliNom[0] ;
         pr_default.close(32);
         /* Using cursor T01PQ38 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01PQ38_A841TrnNom[0] ;
         n841TrnNom = T01PQ38_n841TrnNom[0] ;
         pr_default.close(33);
         /* Using cursor T01PQ39 */
         pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A5142AlcDomEnv)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            A13739findDomEnv = T01PQ39_A13739findDomEnv[0] ;
            n13739findDomEnv = T01PQ39_n13739findDomEnv[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
         }
         else
         {
            A13739findDomEnv = (byte)(0) ;
            n13739findDomEnv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
         }
         pr_default.close(34);
         /* Using cursor T01PQ41 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            A18AlbComImp = T01PQ41_A18AlbComImp[0] ;
            n18AlbComImp = T01PQ41_n18AlbComImp[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         }
         else
         {
            A18AlbComImp = DecimalUtil.doubleToDec(0) ;
            n18AlbComImp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         }
         pr_default.close(35);
         GXt_int9 = A14254AlbLineasL ;
         GXv_int10[0] = GXt_int9 ;
         new app.haydatoslalcom(remoteHandle, context).execute( A396EmprCod, A14AlbComCod, GXv_int10) ;
         documentocomercialv01_impl.this.GXt_int9 = GXv_int10[0] ;
         A14254AlbLineasL = (byte)(GXt_int9) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14254AlbLineasL", GXutil.str( A14254AlbLineasL, 1, 0));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01PQ42 */
         pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSALC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
      }
   }

   public void processNestedLevel1PQ2( )
   {
      s19AlbComLiC = O19AlbComLiC ;
      httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
      s18AlbComImp = O18AlbComImp ;
      n18AlbComImp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      nGXsfl_79_idx = 0 ;
      while ( nGXsfl_79_idx < nRC_GXsfl_79 )
      {
         readRow1PQ2( ) ;
         if ( ( nRcdExists_2 != 0 ) || ( nIsMod_2 != 0 ) )
         {
            standaloneNotModal1PQ2( ) ;
            getKey1PQ2( ) ;
            if ( ( nRcdExists_2 == 0 ) && ( nRcdDeleted_2 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1PQ2( ) ;
            }
            else
            {
               if ( RcdFound2 != 0 )
               {
                  if ( ( nRcdDeleted_2 != 0 ) && ( nRcdExists_2 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1PQ2( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_2 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1PQ2( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_2 == 0 )
                  {
                     GXCCtl = "ALBCOMLIN_" + sGXsfl_79_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbComLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O19AlbComLiC = A19AlbComLiC ;
            httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
            O18AlbComImp = A18AlbComImp ;
            n18AlbComImp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         }
         httpContext.changePostValue( edtAlbComLin_Internalname, GXutil.ltrim( localUtil.ntoc( A20AlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComNRef_Internalname, GXutil.rtrim( A13315AlbComNRef)) ;
         httpContext.changePostValue( edtAlbComVDoc_Internalname, GXutil.rtrim( A13316AlbComVDoc)) ;
         httpContext.changePostValue( edtAlbComPzas_Internalname, GXutil.ltrim( localUtil.ntoc( A13317AlbComPzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComMts_Internalname, GXutil.ltrim( localUtil.ntoc( A13318AlbComMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComArt_Internalname, GXutil.rtrim( A13320AlbComArt)) ;
         httpContext.changePostValue( edtAlbComArtD_Internalname, GXutil.rtrim( A13321AlbComArtD)) ;
         httpContext.changePostValue( edtAlbComCol_Internalname, GXutil.rtrim( A13322AlbComCol)) ;
         httpContext.changePostValue( edtAlbComKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A13319AlbComKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComDsc_Internalname, GXutil.rtrim( A15AlbComDsc)) ;
         httpContext.changePostValue( edtAlbComPre_Internalname, GXutil.ltrim( localUtil.ntoc( A21AlbComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A13AlbComCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComHd_Internalname, GXutil.ltrim( localUtil.ntoc( A10355AlbComHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtALbComR_Internalname, GXutil.ltrim( localUtil.ntoc( A10356ALbComR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbComP_Internalname, GXutil.rtrim( A10357AlbComP)) ;
         httpContext.changePostValue( edtAlbComDc2_Internalname, GXutil.rtrim( A10806AlbComDc2)) ;
         httpContext.changePostValue( edtAlbComProd_Internalname, GXutil.rtrim( A5010AlbComProd)) ;
         httpContext.changePostValue( edtAlbCImpLin_Internalname, GXutil.ltrim( localUtil.ntoc( A12AlbCImpLin, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbCImpL_Internalname, GXutil.ltrim( localUtil.ntoc( A3914AlbCImpL, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z20AlbComLin_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z20AlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10355AlbComHd_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z10355AlbComHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10356ALbComR_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z10356ALbComR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10357AlbComP_"+sGXsfl_79_idx, GXutil.rtrim( Z10357AlbComP)) ;
         httpContext.changePostValue( "ZT_"+"Z13321AlbComArtD_"+sGXsfl_79_idx, GXutil.rtrim( Z13321AlbComArtD)) ;
         httpContext.changePostValue( "ZT_"+"Z13315AlbComNRef_"+sGXsfl_79_idx, GXutil.rtrim( Z13315AlbComNRef)) ;
         httpContext.changePostValue( "ZT_"+"Z13316AlbComVDoc_"+sGXsfl_79_idx, GXutil.rtrim( Z13316AlbComVDoc)) ;
         httpContext.changePostValue( "ZT_"+"Z13317AlbComPzas_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z13317AlbComPzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13318AlbComMts_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z13318AlbComMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13320AlbComArt_"+sGXsfl_79_idx, GXutil.rtrim( Z13320AlbComArt)) ;
         httpContext.changePostValue( "ZT_"+"Z13322AlbComCol_"+sGXsfl_79_idx, GXutil.rtrim( Z13322AlbComCol)) ;
         httpContext.changePostValue( "ZT_"+"Z13AlbComCnt_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z13AlbComCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13319AlbComKgs_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z13319AlbComKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z15AlbComDsc_"+sGXsfl_79_idx, GXutil.rtrim( Z15AlbComDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z21AlbComPre_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( Z21AlbComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10806AlbComDc2_"+sGXsfl_79_idx, GXutil.rtrim( Z10806AlbComDc2)) ;
         httpContext.changePostValue( "ZT_"+"Z5010AlbComProd_"+sGXsfl_79_idx, GXutil.rtrim( Z5010AlbComProd)) ;
         httpContext.changePostValue( "T12AlbCImpLin_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( O12AlbCImpLin, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_2_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_2_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_2_"+sGXsfl_79_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_2 != 0 )
         {
            httpContext.changePostValue( "ALBCOMLIN_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMNREF_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComNRef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMVDOC_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComVDoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMPZAS_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComPzas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMMTS_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMART_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComArt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMARTD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComArtD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMCOL_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMKGS_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMDSC_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMPRE_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMCNT_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMHD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComHd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMR_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALbComR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMP_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMDC2_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComDc2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOMPROD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComProd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCIMPLIN_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCImpLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCIMPL_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCImpL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1PQ2( ) ;
      if ( AnyError != 0 )
      {
         O19AlbComLiC = s19AlbComLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         O18AlbComImp = s18AlbComImp ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      }
      nRcdExists_2 = (short)(0) ;
      nIsMod_2 = (short)(0) ;
      nRcdDeleted_2 = (short)(0) ;
   }

   public void processLevel1PQ1( )
   {
      /* Save parent mode. */
      sMode1 = Gx_mode ;
      processNestedLevel1PQ2( ) ;
      if ( AnyError != 0 )
      {
         O19AlbComLiC = s19AlbComLiC ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
         O18AlbComImp = s18AlbComImp ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01PQ43 */
      pr_default.execute(37, new Object[] {Short.valueOf(A19AlbComLiC), A396EmprCod, Integer.valueOf(A14AlbComCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
   }

   public void endLevel1PQ1( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1PQ1( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "documentocomercialv01");
         if ( AnyError == 0 )
         {
            confirmValues1PQ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "documentocomercialv01");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1PQ1( )
   {
      /* Scan By routine */
      /* Using cursor T01PQ44 */
      pr_default.execute(38);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A396EmprCod = T01PQ44_A396EmprCod[0] ;
         A14AlbComCod = T01PQ44_A14AlbComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PQ1( )
   {
      /* Scan next routine */
      pr_default.readNext(38);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A396EmprCod = T01PQ44_A396EmprCod[0] ;
         A14AlbComCod = T01PQ44_A14AlbComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
   }

   public void scanEnd1PQ1( )
   {
      pr_default.close(38);
   }

   public void afterConfirm1PQ1( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1PQ1( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PQ1( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PQ1( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PQ1( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PQ1( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PQ1( )
   {
      edtAlbComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
      edtAlbComFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFch_Enabled), 5, 0), true);
      cmbAlbComPri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComPri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbComPri.getEnabled(), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtAlcDomEnv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlcDomEnv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlcDomEnv_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtAlbComMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComMat_Enabled), 5, 0), true);
      edtAlbComHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComHor_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtAlbComFs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFs_Enabled), 5, 0), true);
      edtfindDomEnv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtfindDomEnv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtfindDomEnv_Enabled), 5, 0), true);
      edtAlbComEAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComEAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComEAT_Enabled), 5, 0), true);
      edtAlbComID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComID_Enabled), 5, 0), true);
      edtAlbComAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComAT_Enabled), 5, 0), true);
      edtAlbComFd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFd_Enabled), 5, 0), true);
      edtAlbCTrNm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCTrNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCTrNm_Enabled), 5, 0), true);
      edtAlbCTrNc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCTrNc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCTrNc_Enabled), 5, 0), true);
      edtAlbCTrDm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCTrDm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCTrDm_Enabled), 5, 0), true);
      edtAlbComImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComImp_Enabled), 5, 0), true);
      edtAlbComEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComEst_Enabled), 5, 0), true);
      edtAlbComLiC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComLiC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLiC_Enabled), 5, 0), true);
      edtAlbComEso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComEso_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComEso_Enabled), 5, 0), true);
      edtAlbComFdD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFdD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFdD_Enabled), 5, 0), true);
      edtAlbCSec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCSec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCSec_Enabled), 5, 0), true);
      edtAlbComSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComSt_Enabled), 5, 0), true);
      edtAlcIvaCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlcIvaCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlcIvaCod_Enabled), 5, 0), true);
      edtAlcDivCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlcDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlcDivCod_Enabled), 5, 0), true);
      edtAlcDivTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlcDivTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlcDivTCod_Enabled), 5, 0), true);
   }

   public void zm1PQ2( int GX_JID )
   {
      if ( ( GX_JID == 73 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10355AlbComHd = T01PQ3_A10355AlbComHd[0] ;
            Z10356ALbComR = T01PQ3_A10356ALbComR[0] ;
            Z10357AlbComP = T01PQ3_A10357AlbComP[0] ;
            Z13321AlbComArtD = T01PQ3_A13321AlbComArtD[0] ;
            Z13315AlbComNRef = T01PQ3_A13315AlbComNRef[0] ;
            Z13316AlbComVDoc = T01PQ3_A13316AlbComVDoc[0] ;
            Z13317AlbComPzas = T01PQ3_A13317AlbComPzas[0] ;
            Z13318AlbComMts = T01PQ3_A13318AlbComMts[0] ;
            Z13320AlbComArt = T01PQ3_A13320AlbComArt[0] ;
            Z13322AlbComCol = T01PQ3_A13322AlbComCol[0] ;
            Z13AlbComCnt = T01PQ3_A13AlbComCnt[0] ;
            Z13319AlbComKgs = T01PQ3_A13319AlbComKgs[0] ;
            Z15AlbComDsc = T01PQ3_A15AlbComDsc[0] ;
            Z21AlbComPre = T01PQ3_A21AlbComPre[0] ;
            Z10806AlbComDc2 = T01PQ3_A10806AlbComDc2[0] ;
            Z5010AlbComProd = T01PQ3_A5010AlbComProd[0] ;
         }
         else
         {
            Z10355AlbComHd = A10355AlbComHd ;
            Z10356ALbComR = A10356ALbComR ;
            Z10357AlbComP = A10357AlbComP ;
            Z13321AlbComArtD = A13321AlbComArtD ;
            Z13315AlbComNRef = A13315AlbComNRef ;
            Z13316AlbComVDoc = A13316AlbComVDoc ;
            Z13317AlbComPzas = A13317AlbComPzas ;
            Z13318AlbComMts = A13318AlbComMts ;
            Z13320AlbComArt = A13320AlbComArt ;
            Z13322AlbComCol = A13322AlbComCol ;
            Z13AlbComCnt = A13AlbComCnt ;
            Z13319AlbComKgs = A13319AlbComKgs ;
            Z15AlbComDsc = A15AlbComDsc ;
            Z21AlbComPre = A21AlbComPre ;
            Z10806AlbComDc2 = A10806AlbComDc2 ;
            Z5010AlbComProd = A5010AlbComProd ;
         }
      }
      if ( GX_JID == -73 )
      {
         Z14AlbComCod = A14AlbComCod ;
         Z20AlbComLin = A20AlbComLin ;
         Z10355AlbComHd = A10355AlbComHd ;
         Z10356ALbComR = A10356ALbComR ;
         Z10357AlbComP = A10357AlbComP ;
         Z13321AlbComArtD = A13321AlbComArtD ;
         Z13315AlbComNRef = A13315AlbComNRef ;
         Z13316AlbComVDoc = A13316AlbComVDoc ;
         Z13317AlbComPzas = A13317AlbComPzas ;
         Z13318AlbComMts = A13318AlbComMts ;
         Z13320AlbComArt = A13320AlbComArt ;
         Z13322AlbComCol = A13322AlbComCol ;
         Z13AlbComCnt = A13AlbComCnt ;
         Z13319AlbComKgs = A13319AlbComKgs ;
         Z15AlbComDsc = A15AlbComDsc ;
         Z21AlbComPre = A21AlbComPre ;
         Z10806AlbComDc2 = A10806AlbComDc2 ;
         Z5010AlbComProd = A5010AlbComProd ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1PQ2( )
   {
      edtAlbComPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComPre_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCnt_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComHd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComHd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComHd_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtALbComR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtALbComR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALbComR_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComP_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComDc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComDc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComDc2_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComProd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComProd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComProd_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbCImpLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCImpLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCImpLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbCImpL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCImpL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCImpL_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComLiC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComLiC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLiC_Enabled), 5, 0), true);
      edtAlbComLiC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComLiC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLiC_Enabled), 5, 0), true);
   }

   public void standaloneModal1PQ2( )
   {
      if ( isIns( )  )
      {
         A19AlbComLiC = (short)(O19AlbComLiC+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
      }
      if ( isIns( )  && (0==A10355AlbComHd) && ( Gx_BScreen == 0 ) )
      {
         A10355AlbComHd = 0 ;
      }
      if ( isIns( )  && (0==A10356ALbComR) && ( Gx_BScreen == 0 ) )
      {
         A10356ALbComR = (byte)(0) ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A10357AlbComP)==0) && ( Gx_BScreen == 0 ) )
      {
         A10357AlbComP = " " ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A20AlbComLin = A19AlbComLiC ;
      }
      A3914AlbCImpL = A21AlbComPre.multiply(A13AlbComCnt) ;
      A12AlbCImpLin = GXutil.roundDecimal( A3914AlbCImpL, 2) ;
      O12AlbCImpLin = A12AlbCImpLin ;
      if ( isIns( )  )
      {
         A18AlbComImp = O18AlbComImp.add(A12AlbCImpLin) ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A18AlbComImp = O18AlbComImp.add(A12AlbCImpLin).subtract(O12AlbCImpLin) ;
            n18AlbComImp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A18AlbComImp = O18AlbComImp.subtract(O12AlbCImpLin) ;
               n18AlbComImp = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
            }
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbComLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      }
      else
      {
         edtAlbComLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      }
   }

   public void load1PQ2( )
   {
      /* Using cursor T01PQ45 */
      pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A10355AlbComHd = T01PQ45_A10355AlbComHd[0] ;
         A10356ALbComR = T01PQ45_A10356ALbComR[0] ;
         A10357AlbComP = T01PQ45_A10357AlbComP[0] ;
         A13321AlbComArtD = T01PQ45_A13321AlbComArtD[0] ;
         A13315AlbComNRef = T01PQ45_A13315AlbComNRef[0] ;
         A13316AlbComVDoc = T01PQ45_A13316AlbComVDoc[0] ;
         A13317AlbComPzas = T01PQ45_A13317AlbComPzas[0] ;
         A13318AlbComMts = T01PQ45_A13318AlbComMts[0] ;
         A13320AlbComArt = T01PQ45_A13320AlbComArt[0] ;
         A13322AlbComCol = T01PQ45_A13322AlbComCol[0] ;
         A13AlbComCnt = T01PQ45_A13AlbComCnt[0] ;
         A13319AlbComKgs = T01PQ45_A13319AlbComKgs[0] ;
         A15AlbComDsc = T01PQ45_A15AlbComDsc[0] ;
         A21AlbComPre = T01PQ45_A21AlbComPre[0] ;
         A10806AlbComDc2 = T01PQ45_A10806AlbComDc2[0] ;
         A5010AlbComProd = T01PQ45_A5010AlbComProd[0] ;
         zm1PQ2( -73) ;
      }
      pr_default.close(39);
      onLoadActions1PQ2( ) ;
   }

   public void onLoadActions1PQ2( )
   {
   }

   public void checkExtendedTable1PQ2( )
   {
      nIsDirty_2 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1PQ2( ) ;
      if ( true /* After */ && ! (GXutil.strcmp("", A13320AlbComArt)==0) )
      {
         GXv_char4[0] = A13321AlbComArtD ;
         new app.ppartdsc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A13320AlbComArt, GXv_char4) ;
         documentocomercialv01_impl.this.A13321AlbComArtD = GXv_char4[0] ;
      }
   }

   public void closeExtendedTableCursors1PQ2( )
   {
   }

   public void enableDisable1PQ2( )
   {
   }

   public void getKey1PQ2( )
   {
      /* Using cursor T01PQ46 */
      pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound2 = (short)(1) ;
      }
      else
      {
         RcdFound2 = (short)(0) ;
      }
      pr_default.close(40);
   }

   public void getByPrimaryKey1PQ2( )
   {
      /* Using cursor T01PQ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1PQ2( 73) ;
         RcdFound2 = (short)(1) ;
         initializeNonKey1PQ2( ) ;
         A20AlbComLin = T01PQ3_A20AlbComLin[0] ;
         A10355AlbComHd = T01PQ3_A10355AlbComHd[0] ;
         A10356ALbComR = T01PQ3_A10356ALbComR[0] ;
         A10357AlbComP = T01PQ3_A10357AlbComP[0] ;
         A13321AlbComArtD = T01PQ3_A13321AlbComArtD[0] ;
         A13315AlbComNRef = T01PQ3_A13315AlbComNRef[0] ;
         A13316AlbComVDoc = T01PQ3_A13316AlbComVDoc[0] ;
         A13317AlbComPzas = T01PQ3_A13317AlbComPzas[0] ;
         A13318AlbComMts = T01PQ3_A13318AlbComMts[0] ;
         A13320AlbComArt = T01PQ3_A13320AlbComArt[0] ;
         A13322AlbComCol = T01PQ3_A13322AlbComCol[0] ;
         A13AlbComCnt = T01PQ3_A13AlbComCnt[0] ;
         A13319AlbComKgs = T01PQ3_A13319AlbComKgs[0] ;
         A15AlbComDsc = T01PQ3_A15AlbComDsc[0] ;
         A21AlbComPre = T01PQ3_A21AlbComPre[0] ;
         A10806AlbComDc2 = T01PQ3_A10806AlbComDc2[0] ;
         A5010AlbComProd = T01PQ3_A5010AlbComProd[0] ;
         Z396EmprCod = A396EmprCod ;
         Z14AlbComCod = A14AlbComCod ;
         Z20AlbComLin = A20AlbComLin ;
         sMode2 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1PQ2( ) ;
         Gx_mode = sMode2 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound2 = (short)(0) ;
         initializeNonKey1PQ2( ) ;
         sMode2 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1PQ2( ) ;
         Gx_mode = sMode2 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1PQ2( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1PQ2( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PQ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALCOM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z10355AlbComHd != T01PQ2_A10355AlbComHd[0] ) || ( Z10356ALbComR != T01PQ2_A10356ALbComR[0] ) || ( GXutil.strcmp(Z10357AlbComP, T01PQ2_A10357AlbComP[0]) != 0 ) || ( GXutil.strcmp(Z13321AlbComArtD, T01PQ2_A13321AlbComArtD[0]) != 0 ) || ( GXutil.strcmp(Z13315AlbComNRef, T01PQ2_A13315AlbComNRef[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13316AlbComVDoc, T01PQ2_A13316AlbComVDoc[0]) != 0 ) || ( Z13317AlbComPzas != T01PQ2_A13317AlbComPzas[0] ) || ( DecimalUtil.compareTo(Z13318AlbComMts, T01PQ2_A13318AlbComMts[0]) != 0 ) || ( GXutil.strcmp(Z13320AlbComArt, T01PQ2_A13320AlbComArt[0]) != 0 ) || ( GXutil.strcmp(Z13322AlbComCol, T01PQ2_A13322AlbComCol[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z13AlbComCnt, T01PQ2_A13AlbComCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z13319AlbComKgs, T01PQ2_A13319AlbComKgs[0]) != 0 ) || ( GXutil.strcmp(Z15AlbComDsc, T01PQ2_A15AlbComDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z21AlbComPre, T01PQ2_A21AlbComPre[0]) != 0 ) || ( GXutil.strcmp(Z10806AlbComDc2, T01PQ2_A10806AlbComDc2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5010AlbComProd, T01PQ2_A5010AlbComProd[0]) != 0 ) )
         {
            if ( Z10355AlbComHd != T01PQ2_A10355AlbComHd[0] )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComHd");
               GXutil.writeLogRaw("Old: ",Z10355AlbComHd);
               GXutil.writeLogRaw("Current: ",T01PQ2_A10355AlbComHd[0]);
            }
            if ( Z10356ALbComR != T01PQ2_A10356ALbComR[0] )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"ALbComR");
               GXutil.writeLogRaw("Old: ",Z10356ALbComR);
               GXutil.writeLogRaw("Current: ",T01PQ2_A10356ALbComR[0]);
            }
            if ( GXutil.strcmp(Z10357AlbComP, T01PQ2_A10357AlbComP[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComP");
               GXutil.writeLogRaw("Old: ",Z10357AlbComP);
               GXutil.writeLogRaw("Current: ",T01PQ2_A10357AlbComP[0]);
            }
            if ( GXutil.strcmp(Z13321AlbComArtD, T01PQ2_A13321AlbComArtD[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComArtD");
               GXutil.writeLogRaw("Old: ",Z13321AlbComArtD);
               GXutil.writeLogRaw("Current: ",T01PQ2_A13321AlbComArtD[0]);
            }
            if ( GXutil.strcmp(Z13315AlbComNRef, T01PQ2_A13315AlbComNRef[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComNRef");
               GXutil.writeLogRaw("Old: ",Z13315AlbComNRef);
               GXutil.writeLogRaw("Current: ",T01PQ2_A13315AlbComNRef[0]);
            }
            if ( GXutil.strcmp(Z13316AlbComVDoc, T01PQ2_A13316AlbComVDoc[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComVDoc");
               GXutil.writeLogRaw("Old: ",Z13316AlbComVDoc);
               GXutil.writeLogRaw("Current: ",T01PQ2_A13316AlbComVDoc[0]);
            }
            if ( Z13317AlbComPzas != T01PQ2_A13317AlbComPzas[0] )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComPzas");
               GXutil.writeLogRaw("Old: ",Z13317AlbComPzas);
               GXutil.writeLogRaw("Current: ",T01PQ2_A13317AlbComPzas[0]);
            }
            if ( DecimalUtil.compareTo(Z13318AlbComMts, T01PQ2_A13318AlbComMts[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComMts");
               GXutil.writeLogRaw("Old: ",Z13318AlbComMts);
               GXutil.writeLogRaw("Current: ",T01PQ2_A13318AlbComMts[0]);
            }
            if ( GXutil.strcmp(Z13320AlbComArt, T01PQ2_A13320AlbComArt[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComArt");
               GXutil.writeLogRaw("Old: ",Z13320AlbComArt);
               GXutil.writeLogRaw("Current: ",T01PQ2_A13320AlbComArt[0]);
            }
            if ( GXutil.strcmp(Z13322AlbComCol, T01PQ2_A13322AlbComCol[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComCol");
               GXutil.writeLogRaw("Old: ",Z13322AlbComCol);
               GXutil.writeLogRaw("Current: ",T01PQ2_A13322AlbComCol[0]);
            }
            if ( DecimalUtil.compareTo(Z13AlbComCnt, T01PQ2_A13AlbComCnt[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComCnt");
               GXutil.writeLogRaw("Old: ",Z13AlbComCnt);
               GXutil.writeLogRaw("Current: ",T01PQ2_A13AlbComCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z13319AlbComKgs, T01PQ2_A13319AlbComKgs[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComKgs");
               GXutil.writeLogRaw("Old: ",Z13319AlbComKgs);
               GXutil.writeLogRaw("Current: ",T01PQ2_A13319AlbComKgs[0]);
            }
            if ( GXutil.strcmp(Z15AlbComDsc, T01PQ2_A15AlbComDsc[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComDsc");
               GXutil.writeLogRaw("Old: ",Z15AlbComDsc);
               GXutil.writeLogRaw("Current: ",T01PQ2_A15AlbComDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z21AlbComPre, T01PQ2_A21AlbComPre[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComPre");
               GXutil.writeLogRaw("Old: ",Z21AlbComPre);
               GXutil.writeLogRaw("Current: ",T01PQ2_A21AlbComPre[0]);
            }
            if ( GXutil.strcmp(Z10806AlbComDc2, T01PQ2_A10806AlbComDc2[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComDc2");
               GXutil.writeLogRaw("Old: ",Z10806AlbComDc2);
               GXutil.writeLogRaw("Current: ",T01PQ2_A10806AlbComDc2[0]);
            }
            if ( GXutil.strcmp(Z5010AlbComProd, T01PQ2_A5010AlbComProd[0]) != 0 )
            {
               GXutil.writeLogln("documentocomercialv01:[seudo value changed for attri]"+"AlbComProd");
               GXutil.writeLogRaw("Old: ",Z5010AlbComProd);
               GXutil.writeLogRaw("Current: ",T01PQ2_A5010AlbComProd[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLALCOM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PQ2( )
   {
      beforeValidate1PQ2( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PQ2( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PQ2( 0) ;
         checkOptimisticConcurrency1PQ2( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PQ2( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PQ2( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PQ47 */
                  pr_default.execute(41, new Object[] {Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin), Integer.valueOf(A10355AlbComHd), Byte.valueOf(A10356ALbComR), A10357AlbComP, A13321AlbComArtD, A13315AlbComNRef, A13316AlbComVDoc, Integer.valueOf(A13317AlbComPzas), A13318AlbComMts, A13320AlbComArt, A13322AlbComCol, A13AlbComCnt, A13319AlbComKgs, A15AlbComDsc, A21AlbComPre, A10806AlbComDc2, A5010AlbComProd, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALCOM");
                  if ( (pr_default.getStatus(41) == 1) )
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
            load1PQ2( ) ;
         }
         endLevel1PQ2( ) ;
      }
      closeExtendedTableCursors1PQ2( ) ;
   }

   public void update1PQ2( )
   {
      beforeValidate1PQ2( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PQ2( ) ;
      }
      if ( ( nIsMod_2 != 0 ) || ( nIsDirty_2 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1PQ2( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1PQ2( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1PQ2( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01PQ48 */
                     pr_default.execute(42, new Object[] {Integer.valueOf(A10355AlbComHd), Byte.valueOf(A10356ALbComR), A10357AlbComP, A13321AlbComArtD, A13315AlbComNRef, A13316AlbComVDoc, Integer.valueOf(A13317AlbComPzas), A13318AlbComMts, A13320AlbComArt, A13322AlbComCol, A13AlbComCnt, A13319AlbComKgs, A15AlbComDsc, A21AlbComPre, A10806AlbComDc2, A5010AlbComProd, A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALCOM");
                     if ( (pr_default.getStatus(42) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALCOM"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1PQ2( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1PQ2( ) ;
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
            endLevel1PQ2( ) ;
         }
      }
      closeExtendedTableCursors1PQ2( ) ;
   }

   public void deferredUpdate1PQ2( )
   {
   }

   public void delete1PQ2( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1PQ2( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PQ2( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PQ2( ) ;
         afterConfirm1PQ2( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PQ2( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01PQ49 */
               pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALCOM");
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
      sMode2 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PQ2( ) ;
      Gx_mode = sMode2 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PQ2( )
   {
      standaloneModal1PQ2( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1PQ2( )
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

   public void scanStart1PQ2( )
   {
      /* Scan By routine */
      /* Using cursor T01PQ50 */
      pr_default.execute(44, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      RcdFound2 = (short)(0) ;
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A20AlbComLin = T01PQ50_A20AlbComLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PQ2( )
   {
      /* Scan next routine */
      pr_default.readNext(44);
      RcdFound2 = (short)(0) ;
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound2 = (short)(1) ;
         A20AlbComLin = T01PQ50_A20AlbComLin[0] ;
      }
   }

   public void scanEnd1PQ2( )
   {
      pr_default.close(44);
   }

   public void afterConfirm1PQ2( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1PQ2( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PQ2( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PQ2( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PQ2( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PQ2( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PQ2( )
   {
      edtAlbComLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComNRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComNRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComNRef_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComVDoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComVDoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComVDoc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComPzas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComPzas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComPzas_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComMts_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComArt_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComArtD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComArtD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComArtD_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCol_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComKgs_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComDsc_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComPre_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCnt_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComHd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComHd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComHd_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtALbComR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtALbComR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALbComR_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComP_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComDc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComDc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComDc2_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComProd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComProd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComProd_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbCImpLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCImpLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCImpLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbCImpL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCImpL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCImpL_Enabled), 5, 0), !bGXsfl_79_Refreshing);
   }

   public void send_integrity_lvl_hashes1PQ2( )
   {
   }

   public void send_integrity_lvl_hashes1PQ1( )
   {
   }

   public void subsflControlProps_792( )
   {
      edtAlbComLin_Internalname = "ALBCOMLIN_"+sGXsfl_79_idx ;
      edtAlbComNRef_Internalname = "ALBCOMNREF_"+sGXsfl_79_idx ;
      edtAlbComVDoc_Internalname = "ALBCOMVDOC_"+sGXsfl_79_idx ;
      edtAlbComPzas_Internalname = "ALBCOMPZAS_"+sGXsfl_79_idx ;
      edtAlbComMts_Internalname = "ALBCOMMTS_"+sGXsfl_79_idx ;
      edtAlbComArt_Internalname = "ALBCOMART_"+sGXsfl_79_idx ;
      edtAlbComArtD_Internalname = "ALBCOMARTD_"+sGXsfl_79_idx ;
      edtAlbComCol_Internalname = "ALBCOMCOL_"+sGXsfl_79_idx ;
      edtAlbComKgs_Internalname = "ALBCOMKGS_"+sGXsfl_79_idx ;
      edtAlbComDsc_Internalname = "ALBCOMDSC_"+sGXsfl_79_idx ;
      edtAlbComPre_Internalname = "ALBCOMPRE_"+sGXsfl_79_idx ;
      edtAlbComCnt_Internalname = "ALBCOMCNT_"+sGXsfl_79_idx ;
      edtAlbComHd_Internalname = "ALBCOMHD_"+sGXsfl_79_idx ;
      edtALbComR_Internalname = "ALBCOMR_"+sGXsfl_79_idx ;
      edtAlbComP_Internalname = "ALBCOMP_"+sGXsfl_79_idx ;
      edtAlbComDc2_Internalname = "ALBCOMDC2_"+sGXsfl_79_idx ;
      edtAlbComProd_Internalname = "ALBCOMPROD_"+sGXsfl_79_idx ;
      edtAlbCImpLin_Internalname = "ALBCIMPLIN_"+sGXsfl_79_idx ;
      edtAlbCImpL_Internalname = "ALBCIMPL_"+sGXsfl_79_idx ;
   }

   public void subsflControlProps_fel_792( )
   {
      edtAlbComLin_Internalname = "ALBCOMLIN_"+sGXsfl_79_fel_idx ;
      edtAlbComNRef_Internalname = "ALBCOMNREF_"+sGXsfl_79_fel_idx ;
      edtAlbComVDoc_Internalname = "ALBCOMVDOC_"+sGXsfl_79_fel_idx ;
      edtAlbComPzas_Internalname = "ALBCOMPZAS_"+sGXsfl_79_fel_idx ;
      edtAlbComMts_Internalname = "ALBCOMMTS_"+sGXsfl_79_fel_idx ;
      edtAlbComArt_Internalname = "ALBCOMART_"+sGXsfl_79_fel_idx ;
      edtAlbComArtD_Internalname = "ALBCOMARTD_"+sGXsfl_79_fel_idx ;
      edtAlbComCol_Internalname = "ALBCOMCOL_"+sGXsfl_79_fel_idx ;
      edtAlbComKgs_Internalname = "ALBCOMKGS_"+sGXsfl_79_fel_idx ;
      edtAlbComDsc_Internalname = "ALBCOMDSC_"+sGXsfl_79_fel_idx ;
      edtAlbComPre_Internalname = "ALBCOMPRE_"+sGXsfl_79_fel_idx ;
      edtAlbComCnt_Internalname = "ALBCOMCNT_"+sGXsfl_79_fel_idx ;
      edtAlbComHd_Internalname = "ALBCOMHD_"+sGXsfl_79_fel_idx ;
      edtALbComR_Internalname = "ALBCOMR_"+sGXsfl_79_fel_idx ;
      edtAlbComP_Internalname = "ALBCOMP_"+sGXsfl_79_fel_idx ;
      edtAlbComDc2_Internalname = "ALBCOMDC2_"+sGXsfl_79_fel_idx ;
      edtAlbComProd_Internalname = "ALBCOMPROD_"+sGXsfl_79_fel_idx ;
      edtAlbCImpLin_Internalname = "ALBCIMPLIN_"+sGXsfl_79_fel_idx ;
      edtAlbCImpL_Internalname = "ALBCIMPL_"+sGXsfl_79_fel_idx ;
   }

   public void addRow1PQ2( )
   {
      nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_792( ) ;
      sendRow1PQ2( ) ;
   }

   public void sendRow1PQ2( )
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
         if ( ((int)((nGXsfl_79_idx) % (2))) == 0 )
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
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_2_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComLin_Internalname,GXutil.ltrim( localUtil.ntoc( A20AlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A20AlbComLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,80);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbComLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_2_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComNRef_Internalname,GXutil.rtrim( A13315AlbComNRef),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComNRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbComNRef_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_2_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComVDoc_Internalname,GXutil.rtrim( A13316AlbComVDoc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComVDoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbComVDoc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_2_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComPzas_Internalname,GXutil.ltrim( localUtil.ntoc( A13317AlbComPzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbComPzas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13317AlbComPzas), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13317AlbComPzas), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComPzas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbComPzas_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_2_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComMts_Internalname,GXutil.ltrim( localUtil.ntoc( A13318AlbComMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbComMts_Enabled!=0) ? localUtil.format( A13318AlbComMts, "ZZZZZZ9.99") : localUtil.format( A13318AlbComMts, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbComMts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_2_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComArt_Internalname,GXutil.rtrim( A13320AlbComArt),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComArt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbComArt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_2_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComArtD_Internalname,GXutil.rtrim( A13321AlbComArtD),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComArtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbComArtD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_2_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComCol_Internalname,GXutil.rtrim( A13322AlbComCol),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbComCol_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_2_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A13319AlbComKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbComKgs_Enabled!=0) ? localUtil.format( A13319AlbComKgs, "ZZZZZZ9.99") : localUtil.format( A13319AlbComKgs, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComKgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbComKgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_2_" + sGXsfl_79_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_79_idx + "',79)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComDsc_Internalname,GXutil.rtrim( A15AlbComDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbComDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComPre_Internalname,GXutil.ltrim( localUtil.ntoc( A21AlbComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbComPre_Enabled!=0) ? localUtil.format( A21AlbComPre, "ZZZZZZ9.999") : localUtil.format( A21AlbComPre, "ZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbComPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A13AlbComCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbComCnt_Enabled!=0) ? localUtil.format( A13AlbComCnt, "ZZZZZ9.99") : localUtil.format( A13AlbComCnt, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbComCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComHd_Internalname,GXutil.ltrim( localUtil.ntoc( A10355AlbComHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbComHd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10355AlbComHd), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10355AlbComHd), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComHd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbComHd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtALbComR_Internalname,GXutil.ltrim( localUtil.ntoc( A10356ALbComR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtALbComR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10356ALbComR), "9") : localUtil.format( DecimalUtil.doubleToDec(A10356ALbComR), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtALbComR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtALbComR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComP_Internalname,GXutil.rtrim( A10357AlbComP),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbComP_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComDc2_Internalname,GXutil.rtrim( A10806AlbComDc2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComDc2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbComDc2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComProd_Internalname,GXutil.rtrim( A5010AlbComProd),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComProd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbComProd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbCImpLin_Internalname,GXutil.ltrim( localUtil.ntoc( A12AlbCImpLin, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbCImpLin_Enabled!=0) ? localUtil.format( A12AlbCImpLin, "ZZZZZZZZZZ9.99") : localUtil.format( A12AlbCImpLin, "ZZZZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbCImpLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbCImpLin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbCImpL_Internalname,GXutil.ltrim( localUtil.ntoc( A3914AlbCImpL, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbCImpL_Enabled!=0) ? localUtil.format( A3914AlbCImpL, "ZZZZZZZZZ9.99999") : localUtil.format( A3914AlbCImpL, "ZZZZZZZZZ9.99999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbCImpL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtAlbCImpL_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(79),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1PQ2( ) ;
      GXCCtl = "Z20AlbComLin_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z20AlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10355AlbComHd_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10355AlbComHd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10356ALbComR_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10356ALbComR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10357AlbComP_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10357AlbComP));
      GXCCtl = "Z13321AlbComArtD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13321AlbComArtD));
      GXCCtl = "Z13315AlbComNRef_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13315AlbComNRef));
      GXCCtl = "Z13316AlbComVDoc_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13316AlbComVDoc));
      GXCCtl = "Z13317AlbComPzas_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13317AlbComPzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13318AlbComMts_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13318AlbComMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13320AlbComArt_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13320AlbComArt));
      GXCCtl = "Z13322AlbComCol_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13322AlbComCol));
      GXCCtl = "Z13AlbComCnt_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13AlbComCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13319AlbComKgs_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13319AlbComKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z15AlbComDsc_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z15AlbComDsc));
      GXCCtl = "Z21AlbComPre_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z21AlbComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10806AlbComDc2_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10806AlbComDc2));
      GXCCtl = "Z5010AlbComProd_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5010AlbComProd));
      GXCCtl = "O12AlbCImpLin_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O12AlbCImpLin, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_2_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_2_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_2_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_79_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV10TrnContext);
      }
      GXCCtl = "EMPRCOD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "vEMPRCOD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV7EmprCod));
      GXCCtl = "vALBCOMCOD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV8AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vALBCOMPRI_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV18AlbComPri));
      GXCCtl = "vCLICOD_" + sGXsfl_79_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV33CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMLIN_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMNREF_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComNRef_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMVDOC_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComVDoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMPZAS_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComPzas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMMTS_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMART_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComArt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMARTD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComArtD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMCOL_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMKGS_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMDSC_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMPRE_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMCNT_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMHD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComHd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMR_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALbComR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMP_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMDC2_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComDc2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMPROD_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComProd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCIMPLIN_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCImpLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCIMPL_"+sGXsfl_79_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCImpL_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1PQ2( )
   {
      nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_792( ) ;
      edtAlbComLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMLIN_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComNRef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMNREF_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComVDoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMVDOC_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComPzas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMPZAS_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMMTS_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComArt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMART_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComArtD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMARTD_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMCOL_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMKGS_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMDSC_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMPRE_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMCNT_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComHd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMHD_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtALbComR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMR_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMP_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComDc2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMDC2_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbComProd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOMPROD_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbCImpLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCIMPLIN_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbCImpL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCIMPL_"+sGXsfl_79_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "ALBCOMLIN_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComLin_Internalname ;
         wbErr = true ;
         A20AlbComLin = (short)(0) ;
      }
      else
      {
         A20AlbComLin = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A13315AlbComNRef = httpContext.cgiGet( edtAlbComNRef_Internalname) ;
      A13316AlbComVDoc = httpContext.cgiGet( edtAlbComVDoc_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbComPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "ALBCOMPZAS_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComPzas_Internalname ;
         wbErr = true ;
         A13317AlbComPzas = 0 ;
      }
      else
      {
         A13317AlbComPzas = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbComPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbComMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbComMts_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBCOMMTS_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComMts_Internalname ;
         wbErr = true ;
         A13318AlbComMts = DecimalUtil.ZERO ;
      }
      else
      {
         A13318AlbComMts = localUtil.ctond( httpContext.cgiGet( edtAlbComMts_Internalname)) ;
      }
      A13320AlbComArt = httpContext.cgiGet( edtAlbComArt_Internalname) ;
      A13321AlbComArtD = httpContext.cgiGet( edtAlbComArtD_Internalname) ;
      A13322AlbComCol = httpContext.cgiGet( edtAlbComCol_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbComKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbComKgs_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBCOMKGS_" + sGXsfl_79_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComKgs_Internalname ;
         wbErr = true ;
         A13319AlbComKgs = DecimalUtil.ZERO ;
      }
      else
      {
         A13319AlbComKgs = localUtil.ctond( httpContext.cgiGet( edtAlbComKgs_Internalname)) ;
      }
      A15AlbComDsc = httpContext.cgiGet( edtAlbComDsc_Internalname) ;
      A21AlbComPre = localUtil.ctond( httpContext.cgiGet( edtAlbComPre_Internalname)) ;
      A13AlbComCnt = localUtil.ctond( httpContext.cgiGet( edtAlbComCnt_Internalname)) ;
      A10355AlbComHd = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbComHd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A10356ALbComR = (byte)(localUtil.ctol( httpContext.cgiGet( edtALbComR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A10357AlbComP = httpContext.cgiGet( edtAlbComP_Internalname) ;
      A10806AlbComDc2 = httpContext.cgiGet( edtAlbComDc2_Internalname) ;
      A5010AlbComProd = httpContext.cgiGet( edtAlbComProd_Internalname) ;
      A12AlbCImpLin = localUtil.ctond( httpContext.cgiGet( edtAlbCImpLin_Internalname)) ;
      A3914AlbCImpL = localUtil.ctond( httpContext.cgiGet( edtAlbCImpL_Internalname)) ;
      GXCCtl = "Z20AlbComLin_" + sGXsfl_79_idx ;
      Z20AlbComLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10355AlbComHd_" + sGXsfl_79_idx ;
      Z10355AlbComHd = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10356ALbComR_" + sGXsfl_79_idx ;
      Z10356ALbComR = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10357AlbComP_" + sGXsfl_79_idx ;
      Z10357AlbComP = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13321AlbComArtD_" + sGXsfl_79_idx ;
      Z13321AlbComArtD = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13315AlbComNRef_" + sGXsfl_79_idx ;
      Z13315AlbComNRef = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13316AlbComVDoc_" + sGXsfl_79_idx ;
      Z13316AlbComVDoc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13317AlbComPzas_" + sGXsfl_79_idx ;
      Z13317AlbComPzas = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13318AlbComMts_" + sGXsfl_79_idx ;
      Z13318AlbComMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13320AlbComArt_" + sGXsfl_79_idx ;
      Z13320AlbComArt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13322AlbComCol_" + sGXsfl_79_idx ;
      Z13322AlbComCol = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13AlbComCnt_" + sGXsfl_79_idx ;
      Z13AlbComCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13319AlbComKgs_" + sGXsfl_79_idx ;
      Z13319AlbComKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z15AlbComDsc_" + sGXsfl_79_idx ;
      Z15AlbComDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z21AlbComPre_" + sGXsfl_79_idx ;
      Z21AlbComPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10806AlbComDc2_" + sGXsfl_79_idx ;
      Z10806AlbComDc2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5010AlbComProd_" + sGXsfl_79_idx ;
      Z5010AlbComProd = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O12AlbCImpLin_" + sGXsfl_79_idx ;
      O12AlbCImpLin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_2_" + sGXsfl_79_idx ;
      nRcdDeleted_2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_2_" + sGXsfl_79_idx ;
      nRcdExists_2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_2_" + sGXsfl_79_idx ;
      nIsMod_2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "vCLICOD_" + sGXsfl_79_idx ;
      AV33CliCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "vEMPRCOD_" + sGXsfl_79_idx ;
      AV7EmprCod = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbCImpL_Enabled = edtAlbCImpL_Enabled ;
      defedtAlbCImpLin_Enabled = edtAlbCImpLin_Enabled ;
      defedtAlbComProd_Enabled = edtAlbComProd_Enabled ;
      defedtAlbComDc2_Enabled = edtAlbComDc2_Enabled ;
      defedtAlbComP_Enabled = edtAlbComP_Enabled ;
      defedtALbComR_Enabled = edtALbComR_Enabled ;
      defedtAlbComHd_Enabled = edtAlbComHd_Enabled ;
      defedtAlbComCnt_Enabled = edtAlbComCnt_Enabled ;
      defedtAlbComPre_Enabled = edtAlbComPre_Enabled ;
      defedtAlbComLin_Enabled = edtAlbComLin_Enabled ;
   }

   public void confirmValues1PQ0( )
   {
      nGXsfl_79_idx = 0 ;
      sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_792( ) ;
      while ( nGXsfl_79_idx < nRC_GXsfl_79 )
      {
         nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_792( ) ;
         httpContext.changePostValue( "Z20AlbComLin_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z20AlbComLin_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z20AlbComLin_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z10355AlbComHd_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z10355AlbComHd_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10355AlbComHd_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z10356ALbComR_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z10356ALbComR_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10356ALbComR_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z10357AlbComP_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z10357AlbComP_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10357AlbComP_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z13321AlbComArtD_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z13321AlbComArtD_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13321AlbComArtD_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z13315AlbComNRef_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z13315AlbComNRef_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13315AlbComNRef_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z13316AlbComVDoc_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z13316AlbComVDoc_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13316AlbComVDoc_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z13317AlbComPzas_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z13317AlbComPzas_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13317AlbComPzas_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z13318AlbComMts_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z13318AlbComMts_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13318AlbComMts_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z13320AlbComArt_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z13320AlbComArt_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13320AlbComArt_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z13322AlbComCol_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z13322AlbComCol_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13322AlbComCol_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z13AlbComCnt_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z13AlbComCnt_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13AlbComCnt_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z13319AlbComKgs_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z13319AlbComKgs_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13319AlbComKgs_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z15AlbComDsc_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z15AlbComDsc_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z15AlbComDsc_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z21AlbComPre_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z21AlbComPre_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z21AlbComPre_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z10806AlbComDc2_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z10806AlbComDc2_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10806AlbComDc2_"+sGXsfl_79_idx) ;
         httpContext.changePostValue( "Z5010AlbComProd_"+sGXsfl_79_idx, httpContext.cgiGet( "ZT_"+"Z5010AlbComProd_"+sGXsfl_79_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5010AlbComProd_"+sGXsfl_79_idx) ;
      }
      httpContext.changePostValue( "O12AlbCImpLin", httpContext.cgiGet( "T12AlbCImpLin")) ;
      httpContext.deletePostValue( "T12AlbCImpLin") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentocomercialv01", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbComCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV18AlbComPri))}, new String[] {"Gx_mode","EmprCod","AlbComCod","AlbComPri"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoComercialv01");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV35Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentocomercialv01:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14AlbComCod", GXutil.ltrim( localUtil.ntoc( Z14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10013AlbComFs", localUtil.ttoc( Z10013AlbComFs, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4829AlbComHor", localUtil.ttoc( Z4829AlbComHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z17AlbComFch", localUtil.dtoc( Z17AlbComFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z22AlbComPri", GXutil.rtrim( Z22AlbComPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5142AlcDomEnv", GXutil.ltrim( localUtil.ntoc( Z5142AlcDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4830AlbComMat", GXutil.rtrim( Z4830AlbComMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10739AlbComEAT", GXutil.ltrim( localUtil.ntoc( Z10739AlbComEAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10740AlbComID", GXutil.rtrim( Z10740AlbComID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10764AlbComAT", GXutil.rtrim( Z10764AlbComAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10014AlbComFd", GXutil.rtrim( Z10014AlbComFd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11719AlbCTrNm", GXutil.rtrim( Z11719AlbCTrNm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11721AlbCTrNc", GXutil.rtrim( Z11721AlbCTrNc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11720AlbCTrDm", GXutil.rtrim( Z11720AlbCTrDm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z16AlbComEst", GXutil.ltrim( localUtil.ntoc( Z16AlbComEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z19AlbComLiC", GXutil.ltrim( localUtil.ntoc( Z19AlbComLiC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1783AlbComEso", GXutil.ltrim( localUtil.ntoc( Z1783AlbComEso, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10015AlbComFdD", GXutil.rtrim( Z10015AlbComFdD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3094AlbCSec", GXutil.rtrim( Z3094AlbCSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10738AlbComSt", GXutil.rtrim( Z10738AlbComSt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5143AlcIvaCod", GXutil.rtrim( Z5143AlcIvaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3095AlcDivTCod", GXutil.rtrim( Z3095AlcDivTCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3111AlcDivCod", GXutil.ltrim( localUtil.ntoc( Z3111AlcDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O19AlbComLiC", GXutil.ltrim( localUtil.ntoc( O19AlbComLiC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O18AlbComImp", GXutil.ltrim( localUtil.ntoc( O18AlbComImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O252CliCod", GXutil.ltrim( localUtil.ntoc( O252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O22AlbComPri", GXutil.rtrim( O22AlbComPri));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_79", GXutil.ltrim( localUtil.ntoc( nGXsfl_79_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N3111AlcDivCod", GXutil.ltrim( localUtil.ntoc( A3111AlcDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV10TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV10TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBLINEASL", GXutil.ltrim( localUtil.ntoc( A14254AlbLineasL, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCOMCOD", GXutil.ltrim( localUtil.ntoc( AV8AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbComCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CLICOD", GXutil.ltrim( localUtil.ntoc( AV12Insert_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCCLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRNCOD", GXutil.ltrim( localUtil.ntoc( AV13Insert_TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCTRNCOD", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_ALCDIVCOD", GXutil.ltrim( localUtil.ntoc( AV19Insert_AlcDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDALBCOMPRI", GXutil.rtrim( AV29oldAlbComPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vGUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV30guiremcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTCOD", GXutil.rtrim( AV31ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCOMPRI", GXutil.rtrim( AV18AlbComPri));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18AlbComPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_F", GXutil.rtrim( AV23Msg_f));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBLAST", GXutil.ltrim( localUtil.ntoc( AV25AlbLast, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFCH", localUtil.dtoc( AV24Fch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV27FirmaD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCERNUM", GXutil.ltrim( localUtil.ntoc( AV26Cernum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERRAT", GXutil.rtrim( AV32Msg_errAT));
      app.GxWebStd.gx_hidden_field( httpContext, "vCAMBIOP", GXutil.ltrim( localUtil.ntoc( AV28CambioP, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNNOM", GXutil.rtrim( A841TrnNom));
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
      return formatLink("app.documentocomercialv01", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbComCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV18AlbComPri))}, new String[] {"Gx_mode","EmprCod","AlbComCod","AlbComPri"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoComercialv01" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Documento Comercial (v01)", "") ;
   }

   public void initializeNonKey1PQ1( )
   {
      h252CliCod = "" ;
      h840TrnCod = "" ;
      A10013AlbComFs = GXutil.now( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV29oldAlbComPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29oldAlbComPri", AV29oldAlbComPri);
      AV30guiremcli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30guiremcli), 6, 0));
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV31ContCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31ContCod", AV31ContCod);
      AV23Msg_f = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Msg_f", AV23Msg_f);
      AV25AlbLast = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AlbLast), 8, 0));
      AV24Fch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Fch", localUtil.format(AV24Fch, "99/99/99"));
      A13739findDomEnv = (byte)(0) ;
      n13739findDomEnv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
      A14254AlbLineasL = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14254AlbLineasL", GXutil.str( A14254AlbLineasL, 1, 0));
      AV22Ctrlf = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Ctrlf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Ctrlf), 4, 0));
      AV27FirmaD = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27FirmaD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27FirmaD), 4, 0));
      AV26Cernum = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Cernum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Cernum), 4, 0));
      AV32Msg_errAT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Msg_errAT", AV32Msg_errAT);
      A5142AlcDomEnv = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5142AlcDomEnv", GXutil.str( A5142AlcDomEnv, 1, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A4830AlbComMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4830AlbComMat", A4830AlbComMat);
      A10014AlbComFd = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10014AlbComFd", A10014AlbComFd);
      A11719AlbCTrNm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11719AlbCTrNm", A11719AlbCTrNm);
      A11721AlbCTrNc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11721AlbCTrNc", A11721AlbCTrNc);
      A11720AlbCTrDm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11720AlbCTrDm", A11720AlbCTrDm);
      A18AlbComImp = DecimalUtil.ZERO ;
      n18AlbComImp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      A16AlbComEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A16AlbComEst", GXutil.str( A16AlbComEst, 1, 0));
      A19AlbComLiC = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
      A1783AlbComEso = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1783AlbComEso", GXutil.str( A1783AlbComEso, 1, 0));
      A10015AlbComFdD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10015AlbComFdD", A10015AlbComFdD);
      A3094AlbCSec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3094AlbCSec", A3094AlbCSec);
      A5143AlcIvaCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5143AlcIvaCod", A5143AlcIvaCod);
      A3111AlcDivCod = (byte)(2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3111AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3111AlcDivCod), 2, 0));
      A17AlbComFch = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
      A22AlbComPri = AV18AlbComPri ;
      httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
      A10739AlbComEAT = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
      A10740AlbComID = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10740AlbComID", A10740AlbComID);
      A10764AlbComAT = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10764AlbComAT", A10764AlbComAT);
      A10738AlbComSt = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10738AlbComSt", A10738AlbComSt);
      A3095AlcDivTCod = httpContext.getMessage( "E", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A3095AlcDivTCod", A3095AlcDivTCod);
      O19AlbComLiC = A19AlbComLiC ;
      httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
      O18AlbComImp = A18AlbComImp ;
      n18AlbComImp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      O252CliCod = A252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      O22AlbComPri = A22AlbComPri ;
      httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
      Z10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      Z4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      Z17AlbComFch = GXutil.nullDate() ;
      Z22AlbComPri = "" ;
      Z5142AlcDomEnv = (byte)(0) ;
      Z4830AlbComMat = "" ;
      Z10739AlbComEAT = (byte)(0) ;
      Z10740AlbComID = "" ;
      Z10764AlbComAT = "" ;
      Z10014AlbComFd = "" ;
      Z11719AlbCTrNm = "" ;
      Z11721AlbCTrNc = "" ;
      Z11720AlbCTrDm = "" ;
      Z16AlbComEst = (byte)(0) ;
      Z19AlbComLiC = (short)(0) ;
      Z1783AlbComEso = (byte)(0) ;
      Z10015AlbComFdD = "" ;
      Z3094AlbCSec = "" ;
      Z10738AlbComSt = "" ;
      Z5143AlcIvaCod = "" ;
      Z3095AlcDivTCod = "" ;
      Z252CliCod = 0 ;
      Z840TrnCod = (short)(0) ;
      Z3111AlcDivCod = (byte)(0) ;
   }

   public void initAll1PQ1( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A14AlbComCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      initializeNonKey1PQ1( ) ;
   }

   public void standaloneModalInsert( )
   {
      A3111AlcDivCod = i3111AlcDivCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A3111AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3111AlcDivCod), 2, 0));
      A17AlbComFch = i17AlbComFch ;
      httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
      A3095AlcDivTCod = i3095AlcDivTCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A3095AlcDivTCod", A3095AlcDivTCod);
      A10739AlbComEAT = i10739AlbComEAT ;
      httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
      A10738AlbComSt = i10738AlbComSt ;
      httpContext.ajax_rsp_assign_attri("", false, "A10738AlbComSt", A10738AlbComSt);
      A10740AlbComID = i10740AlbComID ;
      httpContext.ajax_rsp_assign_attri("", false, "A10740AlbComID", A10740AlbComID);
      A10764AlbComAT = i10764AlbComAT ;
      httpContext.ajax_rsp_assign_attri("", false, "A10764AlbComAT", A10764AlbComAT);
      A22AlbComPri = i22AlbComPri ;
      httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
   }

   public void initializeNonKey1PQ2( )
   {
      A13321AlbComArtD = "" ;
      A12AlbCImpLin = DecimalUtil.ZERO ;
      A3914AlbCImpL = DecimalUtil.ZERO ;
      A13315AlbComNRef = "" ;
      A13316AlbComVDoc = "" ;
      A13317AlbComPzas = 0 ;
      A13318AlbComMts = DecimalUtil.ZERO ;
      A13320AlbComArt = "" ;
      A13322AlbComCol = "" ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      A13319AlbComKgs = DecimalUtil.ZERO ;
      A15AlbComDsc = "" ;
      A21AlbComPre = DecimalUtil.ZERO ;
      A10806AlbComDc2 = "" ;
      A5010AlbComProd = "" ;
      A10355AlbComHd = 0 ;
      A10356ALbComR = (byte)(0) ;
      A10357AlbComP = " " ;
      O12AlbCImpLin = A12AlbCImpLin ;
      Z10355AlbComHd = 0 ;
      Z10356ALbComR = (byte)(0) ;
      Z10357AlbComP = "" ;
      Z13321AlbComArtD = "" ;
      Z13315AlbComNRef = "" ;
      Z13316AlbComVDoc = "" ;
      Z13317AlbComPzas = 0 ;
      Z13318AlbComMts = DecimalUtil.ZERO ;
      Z13320AlbComArt = "" ;
      Z13322AlbComCol = "" ;
      Z13AlbComCnt = DecimalUtil.ZERO ;
      Z13319AlbComKgs = DecimalUtil.ZERO ;
      Z15AlbComDsc = "" ;
      Z21AlbComPre = DecimalUtil.ZERO ;
      Z10806AlbComDc2 = "" ;
      Z5010AlbComProd = "" ;
   }

   public void initAll1PQ2( )
   {
      A20AlbComLin = (short)(0) ;
      initializeNonKey1PQ2( ) ;
   }

   public void standaloneModalInsert1PQ2( )
   {
      A19AlbComLiC = i19AlbComLiC ;
      httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
      A10355AlbComHd = i10355AlbComHd ;
      A10356ALbComR = i10356ALbComR ;
      A10357AlbComP = i10357AlbComP ;
      A18AlbComImp = i18AlbComImp ;
      n18AlbComImp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415112513", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("documentocomercialv01.js", "?202682415112513", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties2( )
   {
      edtAlbCImpL_Enabled = defedtAlbCImpL_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCImpL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCImpL_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbCImpLin_Enabled = defedtAlbCImpLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCImpLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCImpLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComProd_Enabled = defedtAlbComProd_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComProd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComProd_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComDc2_Enabled = defedtAlbComDc2_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComDc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComDc2_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComP_Enabled = defedtAlbComP_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComP_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtALbComR_Enabled = defedtALbComR_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtALbComR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALbComR_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComHd_Enabled = defedtAlbComHd_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComHd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComHd_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComCnt_Enabled = defedtAlbComCnt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCnt_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComPre_Enabled = defedtAlbComPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComPre_Enabled), 5, 0), !bGXsfl_79_Refreshing);
      edtAlbComLin_Enabled = defedtAlbComLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLin_Enabled), 5, 0), !bGXsfl_79_Refreshing);
   }

   public void startgridcontrol79( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A20AlbComLin, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13315AlbComNRef));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComNRef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13316AlbComVDoc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComVDoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13317AlbComPzas, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComPzas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13318AlbComMts, (byte)(10), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13320AlbComArt));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComArt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13321AlbComArtD));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComArtD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13322AlbComCol));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13319AlbComKgs, (byte)(10), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A15AlbComDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A21AlbComPre, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13AlbComCnt, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10355AlbComHd, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComHd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10356ALbComR, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtALbComR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A10357AlbComP));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A10806AlbComDc2));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComDc2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A5010AlbComProd));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbComProd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12AlbCImpLin, (byte)(14), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCImpLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3914AlbCImpL, (byte)(16), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCImpL_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtAlbComCod_Internalname = "ALBCOMCOD" ;
      edtAlbComFch_Internalname = "ALBCOMFCH" ;
      cmbAlbComPri.setInternalname( "ALBCOMPRI" );
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblockalcdomenv_Internalname = "TEXTBLOCKALCDOMENV" ;
      edtAlcDomEnv_Internalname = "ALCDOMENV" ;
      lblPromptclienv_Internalname = "PROMPTCLIENV" ;
      tblTablesearcrroot_Internalname = "TABLESEARCRROOT" ;
      tblTablemergedalcdomenv_Internalname = "TABLEMERGEDALCDOMENV" ;
      divTablesplittedalcdomenv_Internalname = "TABLESPLITTEDALCDOMENV" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      edtAlbComMat_Internalname = "ALBCOMMAT" ;
      edtAlbComHor_Internalname = "ALBCOMHOR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtAlbComLin_Internalname = "ALBCOMLIN" ;
      edtAlbComNRef_Internalname = "ALBCOMNREF" ;
      edtAlbComVDoc_Internalname = "ALBCOMVDOC" ;
      edtAlbComPzas_Internalname = "ALBCOMPZAS" ;
      edtAlbComMts_Internalname = "ALBCOMMTS" ;
      edtAlbComArt_Internalname = "ALBCOMART" ;
      edtAlbComArtD_Internalname = "ALBCOMARTD" ;
      edtAlbComCol_Internalname = "ALBCOMCOL" ;
      edtAlbComKgs_Internalname = "ALBCOMKGS" ;
      edtAlbComDsc_Internalname = "ALBCOMDSC" ;
      edtAlbComPre_Internalname = "ALBCOMPRE" ;
      edtAlbComCnt_Internalname = "ALBCOMCNT" ;
      edtAlbComHd_Internalname = "ALBCOMHD" ;
      edtALbComR_Internalname = "ALBCOMR" ;
      edtAlbComP_Internalname = "ALBCOMP" ;
      edtAlbComDc2_Internalname = "ALBCOMDC2" ;
      edtAlbComProd_Internalname = "ALBCOMPROD" ;
      edtAlbCImpLin_Internalname = "ALBCIMPLIN" ;
      edtAlbCImpL_Internalname = "ALBCIMPL" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtAlbComFs_Internalname = "ALBCOMFS" ;
      edtfindDomEnv_Internalname = "FINDDOMENV" ;
      edtAlbComEAT_Internalname = "ALBCOMEAT" ;
      edtAlbComID_Internalname = "ALBCOMID" ;
      edtAlbComAT_Internalname = "ALBCOMAT" ;
      edtAlbComFd_Internalname = "ALBCOMFD" ;
      edtAlbCTrNm_Internalname = "ALBCTRNM" ;
      edtAlbCTrNc_Internalname = "ALBCTRNC" ;
      edtAlbCTrDm_Internalname = "ALBCTRDM" ;
      edtAlbComImp_Internalname = "ALBCOMIMP" ;
      edtAlbComEst_Internalname = "ALBCOMEST" ;
      edtAlbComLiC_Internalname = "ALBCOMLIC" ;
      edtAlbComEso_Internalname = "ALBCOMESO" ;
      edtAlbComFdD_Internalname = "ALBCOMFDD" ;
      edtAlbCSec_Internalname = "ALBCSEC" ;
      edtAlbComSt_Internalname = "ALBCOMST" ;
      edtAlcIvaCod_Internalname = "ALCIVACOD" ;
      edtAlcDivCod_Internalname = "ALCDIVCOD" ;
      edtAlcDivTCod_Internalname = "ALCDIVTCOD" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Documento Comercial (v01)", "") );
      edtAlbCImpL_Jsonclick = "" ;
      edtAlbCImpLin_Jsonclick = "" ;
      edtAlbComProd_Jsonclick = "" ;
      edtAlbComDc2_Jsonclick = "" ;
      edtAlbComP_Jsonclick = "" ;
      edtALbComR_Jsonclick = "" ;
      edtAlbComHd_Jsonclick = "" ;
      edtAlbComCnt_Jsonclick = "" ;
      edtAlbComPre_Jsonclick = "" ;
      edtAlbComDsc_Jsonclick = "" ;
      edtAlbComKgs_Jsonclick = "" ;
      edtAlbComCol_Jsonclick = "" ;
      edtAlbComArtD_Jsonclick = "" ;
      edtAlbComArt_Jsonclick = "" ;
      edtAlbComMts_Jsonclick = "" ;
      edtAlbComPzas_Jsonclick = "" ;
      edtAlbComVDoc_Jsonclick = "" ;
      edtAlbComNRef_Jsonclick = "" ;
      edtAlbComLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtAlbCImpL_Enabled = 0 ;
      edtAlbCImpLin_Enabled = 0 ;
      edtAlbComProd_Enabled = 0 ;
      edtAlbComDc2_Enabled = 0 ;
      edtAlbComP_Enabled = 0 ;
      edtALbComR_Enabled = 0 ;
      edtAlbComHd_Enabled = 0 ;
      edtAlbComCnt_Enabled = 0 ;
      edtAlbComPre_Enabled = 0 ;
      edtAlbComDsc_Enabled = 1 ;
      edtAlbComKgs_Enabled = 1 ;
      edtAlbComCol_Enabled = 1 ;
      edtAlbComArtD_Enabled = 1 ;
      edtAlbComArt_Enabled = 1 ;
      edtAlbComMts_Enabled = 1 ;
      edtAlbComPzas_Enabled = 1 ;
      edtAlbComVDoc_Enabled = 1 ;
      edtAlbComNRef_Enabled = 1 ;
      edtAlbComLin_Enabled = 1 ;
      edtAlcDivTCod_Jsonclick = "" ;
      edtAlcDivTCod_Enabled = 1 ;
      edtAlcDivTCod_Visible = 1 ;
      edtAlcDivCod_Jsonclick = "" ;
      edtAlcDivCod_Enabled = 1 ;
      edtAlcDivCod_Visible = 1 ;
      edtAlcIvaCod_Jsonclick = "" ;
      edtAlcIvaCod_Enabled = 1 ;
      edtAlcIvaCod_Visible = 1 ;
      edtAlbComSt_Jsonclick = "" ;
      edtAlbComSt_Enabled = 1 ;
      edtAlbComSt_Visible = 1 ;
      edtAlbCSec_Jsonclick = "" ;
      edtAlbCSec_Enabled = 1 ;
      edtAlbCSec_Visible = 1 ;
      edtAlbComFdD_Enabled = 1 ;
      edtAlbComFdD_Visible = 1 ;
      edtAlbComEso_Jsonclick = "" ;
      edtAlbComEso_Enabled = 1 ;
      edtAlbComEso_Visible = 1 ;
      edtAlbComLiC_Jsonclick = "" ;
      edtAlbComLiC_Enabled = 0 ;
      edtAlbComLiC_Visible = 1 ;
      edtAlbComEst_Jsonclick = "" ;
      edtAlbComEst_Enabled = 1 ;
      edtAlbComEst_Visible = 1 ;
      edtAlbComImp_Jsonclick = "" ;
      edtAlbComImp_Enabled = 0 ;
      edtAlbComImp_Visible = 1 ;
      edtAlbCTrDm_Jsonclick = "" ;
      edtAlbCTrDm_Enabled = 1 ;
      edtAlbCTrDm_Visible = 1 ;
      edtAlbCTrNc_Jsonclick = "" ;
      edtAlbCTrNc_Enabled = 1 ;
      edtAlbCTrNc_Visible = 1 ;
      edtAlbCTrNm_Jsonclick = "" ;
      edtAlbCTrNm_Enabled = 1 ;
      edtAlbCTrNm_Visible = 1 ;
      edtAlbComFd_Enabled = 1 ;
      edtAlbComFd_Visible = 1 ;
      edtAlbComAT_Jsonclick = "" ;
      edtAlbComAT_Enabled = 1 ;
      edtAlbComAT_Visible = 1 ;
      edtAlbComID_Jsonclick = "" ;
      edtAlbComID_Enabled = 1 ;
      edtAlbComID_Visible = 1 ;
      edtAlbComEAT_Jsonclick = "" ;
      edtAlbComEAT_Enabled = 1 ;
      edtAlbComEAT_Visible = 1 ;
      edtfindDomEnv_Jsonclick = "" ;
      edtfindDomEnv_Enabled = 0 ;
      edtfindDomEnv_Visible = 1 ;
      edtAlbComFs_Jsonclick = "" ;
      edtAlbComFs_Enabled = 1 ;
      edtAlbComFs_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbComHor_Jsonclick = "" ;
      edtAlbComHor_Enabled = 1 ;
      edtAlbComMat_Jsonclick = "" ;
      edtAlbComMat_Enabled = 1 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 1 ;
      edtAlcDomEnv_Jsonclick = "" ;
      edtAlcDomEnv_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      cmbAlbComPri.setJsonclick( "" );
      cmbAlbComPri.setEnabled( 1 );
      edtAlbComFch_Jsonclick = "" ;
      edtAlbComFch_Enabled = 1 ;
      edtAlbComCod_Jsonclick = "" ;
      edtAlbComCod_Enabled = 1 ;
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

   public void gxsgaclicod1PQ0( String A396EmprCod ,
                                String A13735CliCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaclicod_data1PQ0( A396EmprCod, A13735CliCNom) ;
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

   protected void gxsgaclicod_data1PQ0( String A396EmprCod ,
                                        String A13735CliCNom )
   {
      l13735CliCNom = GXutil.concat( GXutil.rtrim( A13735CliCNom), "%", "") ;
      /* Using cursor T01PQ51 */
      pr_default.execute(45, new Object[] {A396EmprCod, l13735CliCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(45) != 101) )
      {
         gxdynajaxctrlcodr.add(T01PQ51_A13735CliCNom[0]);
         gxdynajaxctrldescr.add(T01PQ51_A13735CliCNom[0]);
         pr_default.readNext(45);
      }
      pr_default.close(45);
   }

   public void gxsgatrncod1PQ0( String A396EmprCod ,
                                String A13738TrnCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatrncod_data1PQ0( A396EmprCod, A13738TrnCNom) ;
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

   protected void gxsgatrncod_data1PQ0( String A396EmprCod ,
                                        String A13738TrnCNom )
   {
      l13738TrnCNom = GXutil.concat( GXutil.rtrim( A13738TrnCNom), "%", "") ;
      /* Using cursor T01PQ52 */
      pr_default.execute(46, new Object[] {A396EmprCod, l13738TrnCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(46) != 101) )
      {
         gxdynajaxctrlcodr.add(T01PQ52_A13738TrnCNom[0]);
         gxdynajaxctrldescr.add(T01PQ52_A13738TrnCNom[0]);
         pr_default.readNext(46);
      }
      pr_default.close(46);
   }

   public void gxsgaalbcomart1PQ0( String A396EmprCod ,
                                   int AV30guiremcli ,
                                   String A65ArtCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaalbcomart_data1PQ0( A396EmprCod, AV30guiremcli, A65ArtCod) ;
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

   protected void gxsgaalbcomart_data1PQ0( String A396EmprCod ,
                                           int AV30guiremcli ,
                                           String A65ArtCod )
   {
      l65ArtCod = GXutil.padr( GXutil.rtrim( A65ArtCod), 16, "%") ;
      /* Using cursor T01PQ53 */
      pr_default.execute(47, new Object[] {A396EmprCod, l65ArtCod, Integer.valueOf(AV30guiremcli)});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(47) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( T01PQ53_A65ArtCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( T01PQ53_A65ArtCod[0]));
         pr_default.readNext(47);
      }
      pr_default.close(47);
   }

   public void gxhcaclicod1PQ1( String A396EmprCod ,
                                String A13735CliCNom )
   {
      /* Using cursor T01PQ54 */
      pr_default.execute(48, new Object[] {A13735CliCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(48) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13735CliCNom = T01PQ54_A13735CliCNom[0] ;
         A396EmprCod = T01PQ54_A396EmprCod[0] ;
         A252CliCod = T01PQ54_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.readNext(48);
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
      pr_default.close(48);
   }

   public void gxhcatrncod1PQ1( String A396EmprCod ,
                                String A13738TrnCNom )
   {
      /* Using cursor T01PQ55 */
      pr_default.execute(49, new Object[] {A13738TrnCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(49) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13738TrnCNom = T01PQ55_A13738TrnCNom[0] ;
         A396EmprCod = T01PQ55_A396EmprCod[0] ;
         A840TrnCod = T01PQ55_A840TrnCod[0] ;
         n840TrnCod = T01PQ55_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         pr_default.readNext(49);
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
      pr_default.close(49);
   }

   public void gx4asaalblineasl1PQ1( String A396EmprCod ,
                                     int A14AlbComCod )
   {
      GXt_int9 = A14254AlbLineasL ;
      GXv_int10[0] = GXt_int9 ;
      new app.haydatoslalcom(remoteHandle, context).execute( A396EmprCod, A14AlbComCod, GXv_int10) ;
      documentocomercialv01_impl.this.GXt_int9 = GXv_int10[0] ;
      A14254AlbLineasL = (byte)(GXt_int9) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14254AlbLineasL", GXutil.str( A14254AlbLineasL, 1, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14254AlbLineasL, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx17asaalbcomhor1PQ1( java.util.Date A17AlbComFch ,
                                     String Gx_mode ,
                                     String A396EmprCod )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A4829AlbComHor) && true /* After */ )
      {
         GXt_dtime11 = A4829AlbComHor ;
         GXv_dtime12[0] = GXt_dtime11 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime12) ;
         documentocomercialv01_impl.this.GXt_dtime11 = GXv_dtime12[0] ;
         A4829AlbComHor = GXt_dtime11 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_36_1PQ1( String A396EmprCod ,
                           String AV31ContCod ,
                           int A14AlbComCod ,
                           String A22AlbComPri )
   {
      if ( (0==A14AlbComCod) && true /* Level */ )
      {
         GXv_int8[0] = A14AlbComCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV31ContCod, GXv_int8) ;
         A14AlbComCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_37_1PQ1( String A396EmprCod ,
                           String A22AlbComPri ,
                           java.util.Date AV24Fch ,
                           int AV25AlbLast ,
                           java.util.Date A17AlbComFch ,
                           String AV23Msg_f ,
                           short AV22Ctrlf )
   {
      if ( true /* Level */ && true /* After */ && ( AV22Ctrlf == 1 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A22AlbComPri ;
         GXv_int6[0] = (byte)(2) ;
         GXv_date14[0] = AV24Fch ;
         GXv_int8[0] = AV25AlbLast ;
         GXv_date13[0] = A17AlbComFch ;
         GXv_char2[0] = AV23Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_date14, GXv_int8, GXv_date13, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A22AlbComPri = GXv_char3[0] ;
         AV24Fch = GXv_date14[0] ;
         AV25AlbLast = GXv_int8[0] ;
         A17AlbComFch = GXv_date13[0] ;
         AV23Msg_f = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         httpContext.ajax_rsp_assign_attri("", false, "AV24Fch", localUtil.format(AV24Fch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV25AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25AlbLast), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "AV23Msg_f", AV23Msg_f);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A22AlbComPri))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV24Fch, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV25AlbLast, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A17AlbComFch, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV23Msg_f))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_65_1PQ2( String A396EmprCod ,
                           int A252CliCod ,
                           String A13320AlbComArt )
   {
      if ( true /* After */ && ! (GXutil.strcmp("", A13320AlbComArt)==0) )
      {
         GXv_char4[0] = A13321AlbComArtD ;
         new app.ppartdsc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A13320AlbComArt, GXv_char4) ;
         A13321AlbComArtD = GXv_char4[0] ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13321AlbComArtD))+"\"") ;
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
      subsflControlProps_792( ) ;
      while ( nGXsfl_79_idx <= nRC_GXsfl_79 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1PQ2( ) ;
         standaloneModal1PQ2( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1PQ2( ) ;
         nGXsfl_79_idx = (int)(nGXsfl_79_idx+1) ;
         sGXsfl_79_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_79_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_792( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      cmbAlbComPri.setName( "ALBCOMPRI" );
      cmbAlbComPri.setWebtags( "" );
      cmbAlbComPri.addItem("1", "1", (short)(0));
      cmbAlbComPri.addItem("0", "0", (short)(0));
      if ( cmbAlbComPri.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A22AlbComPri)==0) )
         {
            A22AlbComPri = AV18AlbComPri ;
            httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         }
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

   public void valid_Albcomcod( )
   {
      n18AlbComImp = false ;
      /* Using cursor T01PQ57 */
      pr_default.execute(50, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(50) != 101) )
      {
         A18AlbComImp = T01PQ57_A18AlbComImp[0] ;
         n18AlbComImp = T01PQ57_n18AlbComImp[0] ;
      }
      else
      {
         A18AlbComImp = DecimalUtil.doubleToDec(0) ;
         n18AlbComImp = false ;
      }
      pr_default.close(50);
      GXt_int9 = A14254AlbLineasL ;
      GXv_int10[0] = GXt_int9 ;
      new app.haydatoslalcom(remoteHandle, context).execute( A396EmprCod, A14AlbComCod, GXv_int10) ;
      documentocomercialv01_impl.this.GXt_int9 = GXv_int10[0] ;
      A14254AlbLineasL = (byte)(GXt_int9) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrim( localUtil.ntoc( A18AlbComImp, (byte)(13), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14254AlbLineasL", GXutil.ltrim( localUtil.ntoc( A14254AlbLineasL, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Albcomfch( )
   {
      A22AlbComPri = cmbAlbComPri.getValue() ;
      cmbAlbComPri.setValue( A22AlbComPri );
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A4829AlbComHor) && true /* After */ )
      {
         GXt_dtime11 = A4829AlbComHor ;
         GXv_dtime12[0] = GXt_dtime11 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime12) ;
         documentocomercialv01_impl.this.GXt_dtime11 = GXv_dtime12[0] ;
         A4829AlbComHor = GXt_dtime11 ;
      }
      if ( true /* Level */ && true /* After */ && ( AV22Ctrlf == 1 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A22AlbComPri ;
         GXv_int6[0] = (byte)(2) ;
         GXv_date14[0] = AV24Fch ;
         GXv_int8[0] = AV25AlbLast ;
         GXv_date13[0] = A17AlbComFch ;
         GXv_char2[0] = AV23Msg_f ;
         new app.pdoc000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_date14, GXv_int8, GXv_date13, GXv_char2) ;
         documentocomercialv01_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         documentocomercialv01_impl.this.A22AlbComPri = GXv_char3[0] ;
         A22AlbComPri = this.A22AlbComPri ;
         documentocomercialv01_impl.this.AV24Fch = GXv_date14[0] ;
         AV24Fch = this.AV24Fch ;
         documentocomercialv01_impl.this.AV25AlbLast = GXv_int8[0] ;
         AV25AlbLast = this.AV25AlbLast ;
         documentocomercialv01_impl.this.A17AlbComFch = GXv_date13[0] ;
         A17AlbComFch = this.A17AlbComFch ;
         documentocomercialv01_impl.this.AV23Msg_f = GXv_char2[0] ;
         AV23Msg_f = this.AV23Msg_f ;
         cmbAlbComPri.setValue( A22AlbComPri );
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A17AlbComFch)) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Campo Incorrecto", ""), 1, "ALBCOMFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComFch_Internalname ;
      }
      if ( ( GXutil.strcmp(AV23Msg_f, " ") != 0 ) && true /* Level */ && true /* After */ )
      {
         httpContext.GX_msglist.addItem(AV23Msg_f, 1, "ALBCOMFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComFch_Internalname ;
      }
      dynload_actions( ) ;
      if ( cmbAlbComPri.getItemCount() > 0 )
      {
         A22AlbComPri = cmbAlbComPri.getValidValue(A22AlbComPri) ;
         cmbAlbComPri.setValue( A22AlbComPri );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbComPri.setValue( GXutil.rtrim( A22AlbComPri) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", GXutil.rtrim( A22AlbComPri));
      cmbAlbComPri.setValue( GXutil.rtrim( A22AlbComPri) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComPri.getInternalname(), "Values", cmbAlbComPri.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "AV24Fch", localUtil.format(AV24Fch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV25AlbLast", GXutil.ltrim( localUtil.ntoc( AV25AlbLast, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV23Msg_f", GXutil.rtrim( AV23Msg_f));
   }

   public void valid_Albcompri( )
   {
      A22AlbComPri = cmbAlbComPri.getValue() ;
      if ( ! ( ( GXutil.strcmp(A22AlbComPri, "0") == 0 ) || ( GXutil.strcmp(A22AlbComPri, "1") == 0 ) || ( GXutil.strcmp(A22AlbComPri, "2") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "P", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBCOMPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbComPri.getInternalname() ;
      }
      AV29oldAlbComPri = O22AlbComPri ;
      if ( GXutil.strcmp(A22AlbComPri, "0") == 0 )
      {
         AV31ContCod = "100012" ;
      }
      else
      {
         if ( GXutil.strcmp(A22AlbComPri, "1") == 0 )
         {
            AV31ContCod = "100011" ;
         }
      }
      if ( (0==A14AlbComCod) && true /* Level */ )
      {
         GXv_int8[0] = A14AlbComCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV31ContCod, GXv_int8) ;
         documentocomercialv01_impl.this.A14AlbComCod = GXv_int8[0] ;
         A14AlbComCod = this.A14AlbComCod ;
      }
      if ( isIns( )  && true /* Level */ && true /* After */ && ! (0==A14AlbComCod) && ( ( AV27FirmaD == 1 ) || ( AV26Cernum == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR: Intentamos dar de ALTA un ALBARAN > CONTADOR manualmente", ""), 1, "ALBCOMPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbComPri.getInternalname() ;
      }
      if ( isUpd( )  && ( GXutil.strcmp(A22AlbComPri, AV29oldAlbComPri) != 0 ) && ( AV28CambioP == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.NO se puede cambiar este campo ¡¡¡", ""), 1, "ALBCOMPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbComPri.getInternalname() ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV29oldAlbComPri", GXutil.rtrim( AV29oldAlbComPri));
      httpContext.ajax_rsp_assign_attri("", false, "AV31ContCod", GXutil.rtrim( AV31ContCod));
      httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), ".", "")));
   }

   public void valid_Clicod( )
   {
      if ( (GXutil.strcmp("", h252CliCod)==0) )
      {
         A252CliCod = 0 ;
      }
      else
      {
         A13735CliCNom = h252CliCod ;
         /* Using cursor T01PQ58 */
         pr_default.execute(51, new Object[] {A13735CliCNom, A396EmprCod});
         A396EmprCod = T01PQ58_A396EmprCod[0] ;
         A252CliCod = T01PQ58_A252CliCod[0] ;
         A252CliCod = T01PQ58_A252CliCod[0] ;
         if ( ! ( (pr_default.getStatus(51) == 101) ) )
         {
            pr_default.readNext(51);
            if ( ! ( (pr_default.getStatus(51) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(51);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      /* Using cursor T01PQ59 */
      pr_default.execute(52, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(52) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01PQ59_A279CliNom[0] ;
      pr_default.close(52);
      AV30guiremcli = O252CliCod ;
      if ( isUpd( )  && ( A252CliCod != AV30guiremcli ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.NO se puede cambiar Cliente, Guia comunicada AT ¡¡¡", ""), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV30guiremcli", GXutil.ltrim( localUtil.ntoc( AV30guiremcli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
   }

   public void valid_Alcdomenv( )
   {
      n13739findDomEnv = false ;
      /* Using cursor T01PQ60 */
      pr_default.execute(53, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A5142AlcDomEnv)});
      if ( (pr_default.getStatus(53) != 101) )
      {
         A13739findDomEnv = T01PQ60_A13739findDomEnv[0] ;
         n13739findDomEnv = T01PQ60_n13739findDomEnv[0] ;
      }
      else
      {
         A13739findDomEnv = (byte)(0) ;
         n13739findDomEnv = false ;
      }
      pr_default.close(53);
      if ( (0==A13739findDomEnv) && ( ! (0==A5142AlcDomEnv) && true /* Level */ ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Endereço de entrega inexistente", ""), 1, "ALCDOMENV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlcDomEnv_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13739findDomEnv", GXutil.ltrim( localUtil.ntoc( A13739findDomEnv, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      n841TrnNom = false ;
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
      }
      else
      {
         A13738TrnCNom = h840TrnCod ;
         /* Using cursor T01PQ61 */
         pr_default.execute(54, new Object[] {A13738TrnCNom, A396EmprCod});
         A396EmprCod = T01PQ61_A396EmprCod[0] ;
         A840TrnCod = T01PQ61_A840TrnCod[0] ;
         n840TrnCod = T01PQ61_n840TrnCod[0] ;
         A840TrnCod = T01PQ61_A840TrnCod[0] ;
         n840TrnCod = T01PQ61_n840TrnCod[0] ;
         if ( ! ( (pr_default.getStatus(54) == 101) ) )
         {
            pr_default.readNext(54);
            if ( ! ( (pr_default.getStatus(54) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Nombre", "")}), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(54);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      /* Using cursor T01PQ62 */
      pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(55) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A13738TrnCNom)==0) || (0==A840TrnCod) && n840TrnCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A841TrnNom = T01PQ62_A841TrnNom[0] ;
      n841TrnNom = T01PQ62_n841TrnNom[0] ;
      pr_default.close(55);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
   }

   public void valid_Albcomfs( )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A10013AlbComFs) && ( Gx_BScreen == 0 ) )
      {
         A10013AlbComFs = GXutil.now( ) ;
      }
      else
      {
         if ( isUpd( )  && GXutil.dateCompare(GXutil.nullDate(), A10013AlbComFs) )
         {
            A10013AlbComFs = GXutil.now( ) ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
   }

   public void valid_Alcdivcod( )
   {
      /* Using cursor T01PQ63 */
      pr_default.execute(56, new Object[] {Byte.valueOf(A3111AlcDivCod)});
      if ( (pr_default.getStatus(56) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlbC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALCDIVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlcDivCod_Internalname ;
      }
      pr_default.close(56);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Albcomart( )
   {
      if ( true /* After */ && ! (GXutil.strcmp("", A13320AlbComArt)==0) )
      {
         GXv_char4[0] = A13321AlbComArtD ;
         new app.ppartdsc(remoteHandle, context).execute( A396EmprCod, A252CliCod, A13320AlbComArt, GXv_char4) ;
         documentocomercialv01_impl.this.A13321AlbComArtD = GXv_char4[0] ;
         A13321AlbComArtD = this.A13321AlbComArtD ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13321AlbComArtD", GXutil.rtrim( A13321AlbComArtD));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18AlbComPri',fld:'vALBCOMPRI',pic:'9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV8AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18AlbComPri',fld:'vALBCOMPRI',pic:'9',hsh:true},{av:'AV35Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e131PQ2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOPROMPTCLIENV'","{handler:'e111PQ2',iparms:[{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A5142AlcDomEnv',fld:'ALCDOMENV',pic:'9'}]");
      setEventMetadata("'DOPROMPTCLIENV'",",oparms:[{av:'A5142AlcDomEnv',fld:'ALCDOMENV',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_ALBCOMCOD","{handler:'valid_Albcomcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A18AlbComImp',fld:'ALBCOMIMP',pic:'ZZZZZZZZZ9.99'},{av:'A14254AlbLineasL',fld:'ALBLINEASL',pic:'9'}]");
      setEventMetadata("VALID_ALBCOMCOD",",oparms:[{av:'A18AlbComImp',fld:'ALBCOMIMP',pic:'ZZZZZZZZZ9.99'},{av:'A14254AlbLineasL',fld:'ALBLINEASL',pic:'9'}]}");
      setEventMetadata("VALID_ALBCOMFCH","{handler:'valid_Albcomfch',iparms:[{av:'AV22Ctrlf',fld:'vCTRLF',pic:'ZZZ9'},{av:'cmbAlbComPri'},{av:'A22AlbComPri',fld:'ALBCOMPRI',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A17AlbComFch',fld:'ALBCOMFCH',pic:''},{av:'A4829AlbComHor',fld:'ALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'AV23Msg_f',fld:'vMSG_F',pic:''},{av:'AV25AlbLast',fld:'vALBLAST',pic:'ZZZZZZZ9'},{av:'AV24Fch',fld:'vFCH',pic:''}]");
      setEventMetadata("VALID_ALBCOMFCH",",oparms:[{av:'A4829AlbComHor',fld:'ALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'cmbAlbComPri'},{av:'A22AlbComPri',fld:'ALBCOMPRI',pic:'9'},{av:'AV24Fch',fld:'vFCH',pic:''},{av:'AV25AlbLast',fld:'vALBLAST',pic:'ZZZZZZZ9'},{av:'A17AlbComFch',fld:'ALBCOMFCH',pic:''},{av:'AV23Msg_f',fld:'vMSG_F',pic:''}]}");
      setEventMetadata("VALID_ALBCOMPRI","{handler:'valid_Albcompri',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O22AlbComPri'},{av:'cmbAlbComPri'},{av:'A22AlbComPri',fld:'ALBCOMPRI',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV31ContCod',fld:'vCONTCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV29oldAlbComPri',fld:'vOLDALBCOMPRI',pic:'9'}]");
      setEventMetadata("VALID_ALBCOMPRI",",oparms:[{av:'AV29oldAlbComPri',fld:'vOLDALBCOMPRI',pic:'9'},{av:'AV31ContCod',fld:'vCONTCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O252CliCod'},{av:'h252CliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'AV30guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'AV30guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'h252CliCod'}]}");
      setEventMetadata("VALID_ALCDOMENV","{handler:'valid_Alcdomenv',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A5142AlcDomEnv',fld:'ALCDOMENV',pic:'9'},{av:'A13739findDomEnv',fld:'FINDDOMENV',pic:'9'}]");
      setEventMetadata("VALID_ALCDOMENV",",oparms:[{av:'A13739findDomEnv',fld:'FINDDOMENV',pic:'9'}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'h840TrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'h840TrnCod'}]}");
      setEventMetadata("VALID_ALBCOMFS","{handler:'valid_Albcomfs',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A10013AlbComFs',fld:'ALBCOMFS',pic:'99/99/99 99:99:99'}]");
      setEventMetadata("VALID_ALBCOMFS",",oparms:[{av:'A10013AlbComFs',fld:'ALBCOMFS',pic:'99/99/99 99:99:99'}]}");
      setEventMetadata("VALID_FINDDOMENV","{handler:'valid_Finddomenv',iparms:[]");
      setEventMetadata("VALID_FINDDOMENV",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMEST","{handler:'valid_Albcomest',iparms:[]");
      setEventMetadata("VALID_ALBCOMEST",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMLIC","{handler:'valid_Albcomlic',iparms:[]");
      setEventMetadata("VALID_ALBCOMLIC",",oparms:[]}");
      setEventMetadata("VALID_ALCDIVCOD","{handler:'valid_Alcdivcod',iparms:[{av:'A3111AlcDivCod',fld:'ALCDIVCOD',pic:'Z9'}]");
      setEventMetadata("VALID_ALCDIVCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMLIN","{handler:'valid_Albcomlin',iparms:[]");
      setEventMetadata("VALID_ALBCOMLIN",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMART","{handler:'valid_Albcomart',iparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13320AlbComArt',fld:'ALBCOMART',pic:''},{av:'A13321AlbComArtD',fld:'ALBCOMARTD',pic:''}]");
      setEventMetadata("VALID_ALBCOMART",",oparms:[{av:'A13321AlbComArtD',fld:'ALBCOMARTD',pic:''}]}");
      setEventMetadata("VALID_ALBCOMPRE","{handler:'valid_Albcompre',iparms:[]");
      setEventMetadata("VALID_ALBCOMPRE",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMCNT","{handler:'valid_Albcomcnt',iparms:[]");
      setEventMetadata("VALID_ALBCOMCNT",",oparms:[]}");
      setEventMetadata("VALID_ALBCIMPLIN","{handler:'valid_Albcimplin',iparms:[]");
      setEventMetadata("VALID_ALBCIMPLIN",",oparms:[]}");
      setEventMetadata("VALID_ALBCIMPL","{handler:'valid_Albcimpl',iparms:[]");
      setEventMetadata("VALID_ALBCIMPL",",oparms:[]}");
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
      pr_default.close(32);
      pr_default.close(55);
      pr_default.close(33);
      pr_default.close(56);
      pr_default.close(53);
      pr_default.close(34);
      pr_default.close(50);
      pr_default.close(35);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV18AlbComPri = "" ;
      Z396EmprCod = "" ;
      Z10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      Z4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      Z17AlbComFch = GXutil.nullDate() ;
      Z22AlbComPri = "" ;
      Z4830AlbComMat = "" ;
      Z10740AlbComID = "" ;
      Z10764AlbComAT = "" ;
      Z10014AlbComFd = "" ;
      Z11719AlbCTrNm = "" ;
      Z11721AlbCTrNc = "" ;
      Z11720AlbCTrDm = "" ;
      Z10015AlbComFdD = "" ;
      Z3094AlbCSec = "" ;
      Z10738AlbComSt = "" ;
      Z5143AlcIvaCod = "" ;
      Z3095AlcDivTCod = "" ;
      O18AlbComImp = DecimalUtil.ZERO ;
      O22AlbComPri = "" ;
      Z10357AlbComP = "" ;
      Z13321AlbComArtD = "" ;
      Z13315AlbComNRef = "" ;
      Z13316AlbComVDoc = "" ;
      Z13318AlbComMts = DecimalUtil.ZERO ;
      Z13320AlbComArt = "" ;
      Z13322AlbComCol = "" ;
      Z13AlbComCnt = DecimalUtil.ZERO ;
      Z13319AlbComKgs = DecimalUtil.ZERO ;
      Z15AlbComDsc = "" ;
      Z21AlbComPre = DecimalUtil.ZERO ;
      Z10806AlbComDc2 = "" ;
      Z5010AlbComProd = "" ;
      O12AlbCImpLin = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV31ContCod = "" ;
      A22AlbComPri = "" ;
      AV24Fch = GXutil.nullDate() ;
      A17AlbComFch = GXutil.nullDate() ;
      AV23Msg_f = "" ;
      A13320AlbComArt = "" ;
      A13735CliCNom = "" ;
      A13738TrnCNom = "" ;
      A65ArtCod = "" ;
      h252CliCod = "" ;
      h840TrnCod = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      AV18AlbComPri = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTextblockalcdomenv_Jsonclick = "" ;
      sStyleString = "" ;
      lblPromptclienv_Jsonclick = "" ;
      A4830AlbComMat = "" ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV35Pgmname = "" ;
      A10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      A10740AlbComID = "" ;
      A10764AlbComAT = "" ;
      A10014AlbComFd = "" ;
      A11719AlbCTrNm = "" ;
      A11721AlbCTrNc = "" ;
      A11720AlbCTrDm = "" ;
      A18AlbComImp = DecimalUtil.ZERO ;
      A10015AlbComFdD = "" ;
      A3094AlbCSec = "" ;
      A10738AlbComSt = "" ;
      A5143AlcIvaCod = "" ;
      A3095AlcDivTCod = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      B18AlbComImp = DecimalUtil.ZERO ;
      B22AlbComPri = "" ;
      sMode2 = "" ;
      AV29oldAlbComPri = "" ;
      AV32Msg_errAT = "" ;
      A407EmprNom = "" ;
      A279CliNom = "" ;
      A841TrnNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      A13315AlbComNRef = "" ;
      A13316AlbComVDoc = "" ;
      A13318AlbComMts = DecimalUtil.ZERO ;
      A13321AlbComArtD = "" ;
      A13322AlbComCol = "" ;
      A13319AlbComKgs = DecimalUtil.ZERO ;
      A15AlbComDsc = "" ;
      A21AlbComPre = DecimalUtil.ZERO ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      A10357AlbComP = "" ;
      A10806AlbComDc2 = "" ;
      A5010AlbComProd = "" ;
      A12AlbCImpLin = DecimalUtil.ZERO ;
      A3914AlbCImpL = DecimalUtil.ZERO ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s18AlbComImp = DecimalUtil.ZERO ;
      T12AlbCImpLin = DecimalUtil.ZERO ;
      AV15Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_char1 = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV14TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z407EmprNom = "" ;
      Z18AlbComImp = DecimalUtil.ZERO ;
      Z279CliNom = "" ;
      Z841TrnNom = "" ;
      T01PQ6_A407EmprNom = new String[] {""} ;
      T01PQ6_n407EmprNom = new boolean[] {false} ;
      T01PQ13_A13738TrnCNom = new String[] {""} ;
      T01PQ13_A396EmprCod = new String[] {""} ;
      T01PQ13_A840TrnCod = new short[1] ;
      T01PQ13_n840TrnCod = new boolean[] {false} ;
      T01PQ14_A13735CliCNom = new String[] {""} ;
      T01PQ14_A396EmprCod = new String[] {""} ;
      T01PQ14_A252CliCod = new int[1] ;
      T01PQ12_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PQ12_n18AlbComImp = new boolean[] {false} ;
      T01PQ8_A841TrnNom = new String[] {""} ;
      T01PQ8_n841TrnNom = new boolean[] {false} ;
      T01PQ7_A279CliNom = new String[] {""} ;
      T01PQ16_A266CliEnvLin = new byte[1] ;
      T01PQ16_A14AlbComCod = new int[1] ;
      T01PQ16_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      T01PQ16_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01PQ16_A407EmprNom = new String[] {""} ;
      T01PQ16_n407EmprNom = new boolean[] {false} ;
      T01PQ16_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01PQ16_A22AlbComPri = new String[] {""} ;
      T01PQ16_A5142AlcDomEnv = new byte[1] ;
      T01PQ16_A279CliNom = new String[] {""} ;
      T01PQ16_A841TrnNom = new String[] {""} ;
      T01PQ16_n841TrnNom = new boolean[] {false} ;
      T01PQ16_A4830AlbComMat = new String[] {""} ;
      T01PQ16_A10739AlbComEAT = new byte[1] ;
      T01PQ16_A10740AlbComID = new String[] {""} ;
      T01PQ16_A10764AlbComAT = new String[] {""} ;
      T01PQ16_A10014AlbComFd = new String[] {""} ;
      T01PQ16_A11719AlbCTrNm = new String[] {""} ;
      T01PQ16_A11721AlbCTrNc = new String[] {""} ;
      T01PQ16_A11720AlbCTrDm = new String[] {""} ;
      T01PQ16_A16AlbComEst = new byte[1] ;
      T01PQ16_A19AlbComLiC = new short[1] ;
      T01PQ16_A1783AlbComEso = new byte[1] ;
      T01PQ16_A10015AlbComFdD = new String[] {""} ;
      T01PQ16_A3094AlbCSec = new String[] {""} ;
      T01PQ16_A10738AlbComSt = new String[] {""} ;
      T01PQ16_A5143AlcIvaCod = new String[] {""} ;
      T01PQ16_A3095AlcDivTCod = new String[] {""} ;
      T01PQ16_A396EmprCod = new String[] {""} ;
      T01PQ16_A252CliCod = new int[1] ;
      T01PQ16_A840TrnCod = new short[1] ;
      T01PQ16_n840TrnCod = new boolean[] {false} ;
      T01PQ16_A3111AlcDivCod = new byte[1] ;
      T01PQ16_A13739findDomEnv = new byte[1] ;
      T01PQ16_n13739findDomEnv = new boolean[] {false} ;
      T01PQ16_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PQ16_n18AlbComImp = new boolean[] {false} ;
      T01PQ17_A13735CliCNom = new String[] {""} ;
      T01PQ17_A396EmprCod = new String[] {""} ;
      T01PQ17_A252CliCod = new int[1] ;
      T01PQ18_A13738TrnCNom = new String[] {""} ;
      T01PQ18_A396EmprCod = new String[] {""} ;
      T01PQ18_A840TrnCod = new short[1] ;
      T01PQ18_n840TrnCod = new boolean[] {false} ;
      T01PQ19_A13735CliCNom = new String[] {""} ;
      T01PQ19_A396EmprCod = new String[] {""} ;
      T01PQ19_A252CliCod = new int[1] ;
      T01PQ20_A13738TrnCNom = new String[] {""} ;
      T01PQ20_A396EmprCod = new String[] {""} ;
      T01PQ20_A840TrnCod = new short[1] ;
      T01PQ20_n840TrnCod = new boolean[] {false} ;
      T01PQ9_A3111AlcDivCod = new byte[1] ;
      T01PQ21_A13735CliCNom = new String[] {""} ;
      T01PQ21_A396EmprCod = new String[] {""} ;
      T01PQ21_A252CliCod = new int[1] ;
      T01PQ22_A13738TrnCNom = new String[] {""} ;
      T01PQ22_A396EmprCod = new String[] {""} ;
      T01PQ22_A840TrnCod = new short[1] ;
      T01PQ22_n840TrnCod = new boolean[] {false} ;
      T01PQ10_A13739findDomEnv = new byte[1] ;
      T01PQ10_n13739findDomEnv = new boolean[] {false} ;
      T01PQ23_A3111AlcDivCod = new byte[1] ;
      T01PQ24_A279CliNom = new String[] {""} ;
      T01PQ25_A841TrnNom = new String[] {""} ;
      T01PQ25_n841TrnNom = new boolean[] {false} ;
      T01PQ26_A13739findDomEnv = new byte[1] ;
      T01PQ26_n13739findDomEnv = new boolean[] {false} ;
      T01PQ28_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PQ28_n18AlbComImp = new boolean[] {false} ;
      T01PQ29_A396EmprCod = new String[] {""} ;
      T01PQ29_A14AlbComCod = new int[1] ;
      T01PQ5_A14AlbComCod = new int[1] ;
      T01PQ5_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      T01PQ5_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01PQ5_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01PQ5_A22AlbComPri = new String[] {""} ;
      T01PQ5_A5142AlcDomEnv = new byte[1] ;
      T01PQ5_A4830AlbComMat = new String[] {""} ;
      T01PQ5_A10739AlbComEAT = new byte[1] ;
      T01PQ5_A10740AlbComID = new String[] {""} ;
      T01PQ5_A10764AlbComAT = new String[] {""} ;
      T01PQ5_A10014AlbComFd = new String[] {""} ;
      T01PQ5_A11719AlbCTrNm = new String[] {""} ;
      T01PQ5_A11721AlbCTrNc = new String[] {""} ;
      T01PQ5_A11720AlbCTrDm = new String[] {""} ;
      T01PQ5_A16AlbComEst = new byte[1] ;
      T01PQ5_A19AlbComLiC = new short[1] ;
      T01PQ5_A1783AlbComEso = new byte[1] ;
      T01PQ5_A10015AlbComFdD = new String[] {""} ;
      T01PQ5_A3094AlbCSec = new String[] {""} ;
      T01PQ5_A10738AlbComSt = new String[] {""} ;
      T01PQ5_A5143AlcIvaCod = new String[] {""} ;
      T01PQ5_A3095AlcDivTCod = new String[] {""} ;
      T01PQ5_A396EmprCod = new String[] {""} ;
      T01PQ5_A252CliCod = new int[1] ;
      T01PQ5_A840TrnCod = new short[1] ;
      T01PQ5_n840TrnCod = new boolean[] {false} ;
      T01PQ5_A3111AlcDivCod = new byte[1] ;
      T01PQ30_A396EmprCod = new String[] {""} ;
      T01PQ30_A14AlbComCod = new int[1] ;
      T01PQ31_A396EmprCod = new String[] {""} ;
      T01PQ31_A14AlbComCod = new int[1] ;
      T01PQ32_A13735CliCNom = new String[] {""} ;
      T01PQ32_A396EmprCod = new String[] {""} ;
      T01PQ32_A252CliCod = new int[1] ;
      T01PQ33_A13738TrnCNom = new String[] {""} ;
      T01PQ33_A396EmprCod = new String[] {""} ;
      T01PQ33_A840TrnCod = new short[1] ;
      T01PQ33_n840TrnCod = new boolean[] {false} ;
      T01PQ4_A14AlbComCod = new int[1] ;
      T01PQ4_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      T01PQ4_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01PQ4_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01PQ4_A22AlbComPri = new String[] {""} ;
      T01PQ4_A5142AlcDomEnv = new byte[1] ;
      T01PQ4_A4830AlbComMat = new String[] {""} ;
      T01PQ4_A10739AlbComEAT = new byte[1] ;
      T01PQ4_A10740AlbComID = new String[] {""} ;
      T01PQ4_A10764AlbComAT = new String[] {""} ;
      T01PQ4_A10014AlbComFd = new String[] {""} ;
      T01PQ4_A11719AlbCTrNm = new String[] {""} ;
      T01PQ4_A11721AlbCTrNc = new String[] {""} ;
      T01PQ4_A11720AlbCTrDm = new String[] {""} ;
      T01PQ4_A16AlbComEst = new byte[1] ;
      T01PQ4_A19AlbComLiC = new short[1] ;
      T01PQ4_A1783AlbComEso = new byte[1] ;
      T01PQ4_A10015AlbComFdD = new String[] {""} ;
      T01PQ4_A3094AlbCSec = new String[] {""} ;
      T01PQ4_A10738AlbComSt = new String[] {""} ;
      T01PQ4_A5143AlcIvaCod = new String[] {""} ;
      T01PQ4_A3095AlcDivTCod = new String[] {""} ;
      T01PQ4_A396EmprCod = new String[] {""} ;
      T01PQ4_A252CliCod = new int[1] ;
      T01PQ4_A840TrnCod = new short[1] ;
      T01PQ4_n840TrnCod = new boolean[] {false} ;
      T01PQ4_A3111AlcDivCod = new byte[1] ;
      T01PQ37_A279CliNom = new String[] {""} ;
      T01PQ38_A841TrnNom = new String[] {""} ;
      T01PQ38_n841TrnNom = new boolean[] {false} ;
      T01PQ39_A13739findDomEnv = new byte[1] ;
      T01PQ39_n13739findDomEnv = new boolean[] {false} ;
      T01PQ41_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PQ41_n18AlbComImp = new boolean[] {false} ;
      T01PQ42_A396EmprCod = new String[] {""} ;
      T01PQ42_A14AlbComCod = new int[1] ;
      T01PQ42_A2386AlbCObsLin = new byte[1] ;
      T01PQ44_A396EmprCod = new String[] {""} ;
      T01PQ44_A14AlbComCod = new int[1] ;
      T01PQ45_A14AlbComCod = new int[1] ;
      T01PQ45_A20AlbComLin = new short[1] ;
      T01PQ45_A10355AlbComHd = new int[1] ;
      T01PQ45_A10356ALbComR = new byte[1] ;
      T01PQ45_A10357AlbComP = new String[] {""} ;
      T01PQ45_A13321AlbComArtD = new String[] {""} ;
      T01PQ45_A13315AlbComNRef = new String[] {""} ;
      T01PQ45_A13316AlbComVDoc = new String[] {""} ;
      T01PQ45_A13317AlbComPzas = new int[1] ;
      T01PQ45_A13318AlbComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PQ45_A13320AlbComArt = new String[] {""} ;
      T01PQ45_A13322AlbComCol = new String[] {""} ;
      T01PQ45_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PQ45_A13319AlbComKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PQ45_A15AlbComDsc = new String[] {""} ;
      T01PQ45_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PQ45_A10806AlbComDc2 = new String[] {""} ;
      T01PQ45_A5010AlbComProd = new String[] {""} ;
      T01PQ45_A396EmprCod = new String[] {""} ;
      T01PQ46_A396EmprCod = new String[] {""} ;
      T01PQ46_A14AlbComCod = new int[1] ;
      T01PQ46_A20AlbComLin = new short[1] ;
      T01PQ3_A14AlbComCod = new int[1] ;
      T01PQ3_A20AlbComLin = new short[1] ;
      T01PQ3_A10355AlbComHd = new int[1] ;
      T01PQ3_A10356ALbComR = new byte[1] ;
      T01PQ3_A10357AlbComP = new String[] {""} ;
      T01PQ3_A13321AlbComArtD = new String[] {""} ;
      T01PQ3_A13315AlbComNRef = new String[] {""} ;
      T01PQ3_A13316AlbComVDoc = new String[] {""} ;
      T01PQ3_A13317AlbComPzas = new int[1] ;
      T01PQ3_A13318AlbComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PQ3_A13320AlbComArt = new String[] {""} ;
      T01PQ3_A13322AlbComCol = new String[] {""} ;
      T01PQ3_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PQ3_A13319AlbComKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PQ3_A15AlbComDsc = new String[] {""} ;
      T01PQ3_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PQ3_A10806AlbComDc2 = new String[] {""} ;
      T01PQ3_A5010AlbComProd = new String[] {""} ;
      T01PQ3_A396EmprCod = new String[] {""} ;
      T01PQ2_A14AlbComCod = new int[1] ;
      T01PQ2_A20AlbComLin = new short[1] ;
      T01PQ2_A10355AlbComHd = new int[1] ;
      T01PQ2_A10356ALbComR = new byte[1] ;
      T01PQ2_A10357AlbComP = new String[] {""} ;
      T01PQ2_A13321AlbComArtD = new String[] {""} ;
      T01PQ2_A13315AlbComNRef = new String[] {""} ;
      T01PQ2_A13316AlbComVDoc = new String[] {""} ;
      T01PQ2_A13317AlbComPzas = new int[1] ;
      T01PQ2_A13318AlbComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PQ2_A13320AlbComArt = new String[] {""} ;
      T01PQ2_A13322AlbComCol = new String[] {""} ;
      T01PQ2_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PQ2_A13319AlbComKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PQ2_A15AlbComDsc = new String[] {""} ;
      T01PQ2_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PQ2_A10806AlbComDc2 = new String[] {""} ;
      T01PQ2_A5010AlbComProd = new String[] {""} ;
      T01PQ2_A396EmprCod = new String[] {""} ;
      T01PQ50_A396EmprCod = new String[] {""} ;
      T01PQ50_A14AlbComCod = new int[1] ;
      T01PQ50_A20AlbComLin = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i17AlbComFch = GXutil.nullDate() ;
      i3095AlcDivTCod = "" ;
      i10738AlbComSt = "" ;
      i10740AlbComID = "" ;
      i10764AlbComAT = "" ;
      i22AlbComPri = "" ;
      i10357AlbComP = "" ;
      i18AlbComImp = DecimalUtil.ZERO ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13735CliCNom = "" ;
      T01PQ51_A13735CliCNom = new String[] {""} ;
      l13738TrnCNom = "" ;
      T01PQ52_A13738TrnCNom = new String[] {""} ;
      l65ArtCod = "" ;
      T01PQ53_A396EmprCod = new String[] {""} ;
      T01PQ53_A252CliCod = new int[1] ;
      T01PQ53_A65ArtCod = new String[] {""} ;
      T01PQ54_A13735CliCNom = new String[] {""} ;
      T01PQ54_A396EmprCod = new String[] {""} ;
      T01PQ54_A252CliCod = new int[1] ;
      T01PQ55_A13738TrnCNom = new String[] {""} ;
      T01PQ55_A396EmprCod = new String[] {""} ;
      T01PQ55_A840TrnCod = new short[1] ;
      T01PQ55_n840TrnCod = new boolean[] {false} ;
      T01PQ57_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PQ57_n18AlbComImp = new boolean[] {false} ;
      GXv_int10 = new short[1] ;
      GXt_dtime11 = GXutil.resetTime( GXutil.nullDate() );
      GXv_dtime12 = new java.util.Date[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_date14 = new java.util.Date[1] ;
      GXv_date13 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      ZV24Fch = GXutil.nullDate() ;
      ZV23Msg_f = "" ;
      GXv_int8 = new int[1] ;
      ZV29oldAlbComPri = "" ;
      ZV31ContCod = "" ;
      T01PQ58_A13735CliCNom = new String[] {""} ;
      T01PQ58_A396EmprCod = new String[] {""} ;
      T01PQ58_A252CliCod = new int[1] ;
      T01PQ59_A279CliNom = new String[] {""} ;
      Zh252CliCod = "" ;
      T01PQ60_A13739findDomEnv = new byte[1] ;
      T01PQ60_n13739findDomEnv = new boolean[] {false} ;
      T01PQ61_A13738TrnCNom = new String[] {""} ;
      T01PQ61_A396EmprCod = new String[] {""} ;
      T01PQ61_A840TrnCod = new short[1] ;
      T01PQ61_n840TrnCod = new boolean[] {false} ;
      T01PQ62_A841TrnNom = new String[] {""} ;
      T01PQ62_n841TrnNom = new boolean[] {false} ;
      Zh840TrnCod = "" ;
      T01PQ63_A3111AlcDivCod = new byte[1] ;
      GXv_char4 = new String[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.documentocomercialv01__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.documentocomercialv01__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.documentocomercialv01__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.documentocomercialv01__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentocomercialv01__default(),
         new Object[] {
             new Object[] {
            T01PQ2_A14AlbComCod, T01PQ2_A20AlbComLin, T01PQ2_A10355AlbComHd, T01PQ2_A10356ALbComR, T01PQ2_A10357AlbComP, T01PQ2_A13321AlbComArtD, T01PQ2_A13315AlbComNRef, T01PQ2_A13316AlbComVDoc, T01PQ2_A13317AlbComPzas, T01PQ2_A13318AlbComMts,
            T01PQ2_A13320AlbComArt, T01PQ2_A13322AlbComCol, T01PQ2_A13AlbComCnt, T01PQ2_A13319AlbComKgs, T01PQ2_A15AlbComDsc, T01PQ2_A21AlbComPre, T01PQ2_A10806AlbComDc2, T01PQ2_A5010AlbComProd, T01PQ2_A396EmprCod
            }
            , new Object[] {
            T01PQ3_A14AlbComCod, T01PQ3_A20AlbComLin, T01PQ3_A10355AlbComHd, T01PQ3_A10356ALbComR, T01PQ3_A10357AlbComP, T01PQ3_A13321AlbComArtD, T01PQ3_A13315AlbComNRef, T01PQ3_A13316AlbComVDoc, T01PQ3_A13317AlbComPzas, T01PQ3_A13318AlbComMts,
            T01PQ3_A13320AlbComArt, T01PQ3_A13322AlbComCol, T01PQ3_A13AlbComCnt, T01PQ3_A13319AlbComKgs, T01PQ3_A15AlbComDsc, T01PQ3_A21AlbComPre, T01PQ3_A10806AlbComDc2, T01PQ3_A5010AlbComProd, T01PQ3_A396EmprCod
            }
            , new Object[] {
            T01PQ4_A14AlbComCod, T01PQ4_A10013AlbComFs, T01PQ4_A4829AlbComHor, T01PQ4_A17AlbComFch, T01PQ4_A22AlbComPri, T01PQ4_A5142AlcDomEnv, T01PQ4_A4830AlbComMat, T01PQ4_A10739AlbComEAT, T01PQ4_A10740AlbComID, T01PQ4_A10764AlbComAT,
            T01PQ4_A10014AlbComFd, T01PQ4_A11719AlbCTrNm, T01PQ4_A11721AlbCTrNc, T01PQ4_A11720AlbCTrDm, T01PQ4_A16AlbComEst, T01PQ4_A19AlbComLiC, T01PQ4_A1783AlbComEso, T01PQ4_A10015AlbComFdD, T01PQ4_A3094AlbCSec, T01PQ4_A10738AlbComSt,
            T01PQ4_A5143AlcIvaCod, T01PQ4_A3095AlcDivTCod, T01PQ4_A396EmprCod, T01PQ4_A252CliCod, T01PQ4_A840TrnCod, T01PQ4_n840TrnCod, T01PQ4_A3111AlcDivCod
            }
            , new Object[] {
            T01PQ5_A14AlbComCod, T01PQ5_A10013AlbComFs, T01PQ5_A4829AlbComHor, T01PQ5_A17AlbComFch, T01PQ5_A22AlbComPri, T01PQ5_A5142AlcDomEnv, T01PQ5_A4830AlbComMat, T01PQ5_A10739AlbComEAT, T01PQ5_A10740AlbComID, T01PQ5_A10764AlbComAT,
            T01PQ5_A10014AlbComFd, T01PQ5_A11719AlbCTrNm, T01PQ5_A11721AlbCTrNc, T01PQ5_A11720AlbCTrDm, T01PQ5_A16AlbComEst, T01PQ5_A19AlbComLiC, T01PQ5_A1783AlbComEso, T01PQ5_A10015AlbComFdD, T01PQ5_A3094AlbCSec, T01PQ5_A10738AlbComSt,
            T01PQ5_A5143AlcIvaCod, T01PQ5_A3095AlcDivTCod, T01PQ5_A396EmprCod, T01PQ5_A252CliCod, T01PQ5_A840TrnCod, T01PQ5_n840TrnCod, T01PQ5_A3111AlcDivCod
            }
            , new Object[] {
            T01PQ6_A407EmprNom, T01PQ6_n407EmprNom
            }
            , new Object[] {
            T01PQ7_A279CliNom
            }
            , new Object[] {
            T01PQ8_A841TrnNom, T01PQ8_n841TrnNom
            }
            , new Object[] {
            T01PQ9_A3111AlcDivCod
            }
            , new Object[] {
            T01PQ10_A13739findDomEnv, T01PQ10_n13739findDomEnv
            }
            , new Object[] {
            T01PQ12_A18AlbComImp, T01PQ12_n18AlbComImp
            }
            , new Object[] {
            T01PQ13_A13738TrnCNom, T01PQ13_A396EmprCod, T01PQ13_A840TrnCod
            }
            , new Object[] {
            T01PQ14_A13735CliCNom, T01PQ14_A396EmprCod, T01PQ14_A252CliCod
            }
            , new Object[] {
            T01PQ16_A266CliEnvLin, T01PQ16_A14AlbComCod, T01PQ16_A10013AlbComFs, T01PQ16_A4829AlbComHor, T01PQ16_A407EmprNom, T01PQ16_n407EmprNom, T01PQ16_A17AlbComFch, T01PQ16_A22AlbComPri, T01PQ16_A5142AlcDomEnv, T01PQ16_A279CliNom,
            T01PQ16_A841TrnNom, T01PQ16_n841TrnNom, T01PQ16_A4830AlbComMat, T01PQ16_A10739AlbComEAT, T01PQ16_A10740AlbComID, T01PQ16_A10764AlbComAT, T01PQ16_A10014AlbComFd, T01PQ16_A11719AlbCTrNm, T01PQ16_A11721AlbCTrNc, T01PQ16_A11720AlbCTrDm,
            T01PQ16_A16AlbComEst, T01PQ16_A19AlbComLiC, T01PQ16_A1783AlbComEso, T01PQ16_A10015AlbComFdD, T01PQ16_A3094AlbCSec, T01PQ16_A10738AlbComSt, T01PQ16_A5143AlcIvaCod, T01PQ16_A3095AlcDivTCod, T01PQ16_A396EmprCod, T01PQ16_A252CliCod,
            T01PQ16_A840TrnCod, T01PQ16_n840TrnCod, T01PQ16_A3111AlcDivCod, T01PQ16_A13739findDomEnv, T01PQ16_n13739findDomEnv, T01PQ16_A18AlbComImp, T01PQ16_n18AlbComImp
            }
            , new Object[] {
            T01PQ17_A13735CliCNom, T01PQ17_A396EmprCod, T01PQ17_A252CliCod
            }
            , new Object[] {
            T01PQ18_A13738TrnCNom, T01PQ18_A396EmprCod, T01PQ18_A840TrnCod
            }
            , new Object[] {
            T01PQ19_A13735CliCNom, T01PQ19_A396EmprCod, T01PQ19_A252CliCod
            }
            , new Object[] {
            T01PQ20_A13738TrnCNom, T01PQ20_A396EmprCod, T01PQ20_A840TrnCod
            }
            , new Object[] {
            T01PQ21_A13735CliCNom, T01PQ21_A396EmprCod, T01PQ21_A252CliCod
            }
            , new Object[] {
            T01PQ22_A13738TrnCNom, T01PQ22_A396EmprCod, T01PQ22_A840TrnCod
            }
            , new Object[] {
            T01PQ23_A3111AlcDivCod
            }
            , new Object[] {
            T01PQ24_A279CliNom
            }
            , new Object[] {
            T01PQ25_A841TrnNom, T01PQ25_n841TrnNom
            }
            , new Object[] {
            T01PQ26_A13739findDomEnv, T01PQ26_n13739findDomEnv
            }
            , new Object[] {
            T01PQ28_A18AlbComImp, T01PQ28_n18AlbComImp
            }
            , new Object[] {
            T01PQ29_A396EmprCod, T01PQ29_A14AlbComCod
            }
            , new Object[] {
            T01PQ30_A396EmprCod, T01PQ30_A14AlbComCod
            }
            , new Object[] {
            T01PQ31_A396EmprCod, T01PQ31_A14AlbComCod
            }
            , new Object[] {
            T01PQ32_A13735CliCNom, T01PQ32_A396EmprCod, T01PQ32_A252CliCod
            }
            , new Object[] {
            T01PQ33_A13738TrnCNom, T01PQ33_A396EmprCod, T01PQ33_A840TrnCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PQ37_A279CliNom
            }
            , new Object[] {
            T01PQ38_A841TrnNom, T01PQ38_n841TrnNom
            }
            , new Object[] {
            T01PQ39_A13739findDomEnv, T01PQ39_n13739findDomEnv
            }
            , new Object[] {
            T01PQ41_A18AlbComImp, T01PQ41_n18AlbComImp
            }
            , new Object[] {
            T01PQ42_A396EmprCod, T01PQ42_A14AlbComCod, T01PQ42_A2386AlbCObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            T01PQ44_A396EmprCod, T01PQ44_A14AlbComCod
            }
            , new Object[] {
            T01PQ45_A14AlbComCod, T01PQ45_A20AlbComLin, T01PQ45_A10355AlbComHd, T01PQ45_A10356ALbComR, T01PQ45_A10357AlbComP, T01PQ45_A13321AlbComArtD, T01PQ45_A13315AlbComNRef, T01PQ45_A13316AlbComVDoc, T01PQ45_A13317AlbComPzas, T01PQ45_A13318AlbComMts,
            T01PQ45_A13320AlbComArt, T01PQ45_A13322AlbComCol, T01PQ45_A13AlbComCnt, T01PQ45_A13319AlbComKgs, T01PQ45_A15AlbComDsc, T01PQ45_A21AlbComPre, T01PQ45_A10806AlbComDc2, T01PQ45_A5010AlbComProd, T01PQ45_A396EmprCod
            }
            , new Object[] {
            T01PQ46_A396EmprCod, T01PQ46_A14AlbComCod, T01PQ46_A20AlbComLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PQ50_A396EmprCod, T01PQ50_A14AlbComCod, T01PQ50_A20AlbComLin
            }
            , new Object[] {
            T01PQ51_A13735CliCNom
            }
            , new Object[] {
            T01PQ52_A13738TrnCNom
            }
            , new Object[] {
            T01PQ53_A396EmprCod, T01PQ53_A252CliCod, T01PQ53_A65ArtCod
            }
            , new Object[] {
            T01PQ54_A13735CliCNom, T01PQ54_A396EmprCod, T01PQ54_A252CliCod
            }
            , new Object[] {
            T01PQ55_A13738TrnCNom, T01PQ55_A396EmprCod, T01PQ55_A840TrnCod
            }
            , new Object[] {
            T01PQ57_A18AlbComImp, T01PQ57_n18AlbComImp
            }
            , new Object[] {
            T01PQ58_A13735CliCNom, T01PQ58_A396EmprCod, T01PQ58_A252CliCod
            }
            , new Object[] {
            T01PQ59_A279CliNom
            }
            , new Object[] {
            T01PQ60_A13739findDomEnv, T01PQ60_n13739findDomEnv
            }
            , new Object[] {
            T01PQ61_A13738TrnCNom, T01PQ61_A396EmprCod, T01PQ61_A840TrnCod
            }
            , new Object[] {
            T01PQ62_A841TrnNom, T01PQ62_n841TrnNom
            }
            , new Object[] {
            T01PQ63_A3111AlcDivCod
            }
         }
      );
      AV35Pgmname = "DocumentoComercialv01" ;
      Z22AlbComPri = "" ;
      O22AlbComPri = "" ;
      i22AlbComPri = "" ;
      A22AlbComPri = "" ;
      Z10013AlbComFs = GXutil.now( ) ;
      A10013AlbComFs = GXutil.now( ) ;
      Z10764AlbComAT = " " ;
      A10764AlbComAT = " " ;
      i10764AlbComAT = " " ;
      Z10740AlbComID = " " ;
      A10740AlbComID = " " ;
      i10740AlbComID = " " ;
      Z10738AlbComSt = " " ;
      A10738AlbComSt = " " ;
      i10738AlbComSt = " " ;
      Z10739AlbComEAT = (byte)(0) ;
      A10739AlbComEAT = (byte)(0) ;
      i10739AlbComEAT = (byte)(0) ;
      Z10357AlbComP = " " ;
      A10357AlbComP = " " ;
      i10357AlbComP = " " ;
      Z10356ALbComR = (byte)(0) ;
      A10356ALbComR = (byte)(0) ;
      i10356ALbComR = (byte)(0) ;
      Z10355AlbComHd = 0 ;
      A10355AlbComHd = 0 ;
      i10355AlbComHd = 0 ;
      Z3095AlcDivTCod = httpContext.getMessage( "E", "") ;
      A3095AlcDivTCod = httpContext.getMessage( "E", "") ;
      i3095AlcDivTCod = httpContext.getMessage( "E", "") ;
      Z3111AlcDivCod = (byte)(2) ;
      N3111AlcDivCod = (byte)(2) ;
      i3111AlcDivCod = (byte)(2) ;
      A3111AlcDivCod = (byte)(2) ;
      Z17AlbComFch = GXutil.today( ) ;
      i17AlbComFch = GXutil.today( ) ;
      A17AlbComFch = GXutil.today( ) ;
   }

   private byte Z5142AlcDomEnv ;
   private byte Z10739AlbComEAT ;
   private byte Z16AlbComEst ;
   private byte Z1783AlbComEso ;
   private byte Z3111AlcDivCod ;
   private byte N3111AlcDivCod ;
   private byte Z10356ALbComR ;
   private byte GxWebError ;
   private byte A3111AlcDivCod ;
   private byte A5142AlcDomEnv ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A13739findDomEnv ;
   private byte A10739AlbComEAT ;
   private byte A16AlbComEst ;
   private byte A1783AlbComEso ;
   private byte A14254AlbLineasL ;
   private byte AV19Insert_AlcDivCod ;
   private byte AV28CambioP ;
   private byte A10356ALbComR ;
   private byte GXt_int5 ;
   private byte Z13739findDomEnv ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i3111AlcDivCod ;
   private byte i10739AlbComEAT ;
   private byte i10356ALbComR ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte Z14254AlbLineasL ;
   private byte GXv_int6[] ;
   private short Z19AlbComLiC ;
   private short Z840TrnCod ;
   private short O19AlbComLiC ;
   private short N840TrnCod ;
   private short Z20AlbComLin ;
   private short nRcdDeleted_2 ;
   private short nRcdExists_2 ;
   private short nIsMod_2 ;
   private short AV22Ctrlf ;
   private short A840TrnCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A19AlbComLiC ;
   private short nBlankRcdCount2 ;
   private short RcdFound2 ;
   private short B19AlbComLiC ;
   private short nBlankRcdUsr2 ;
   private short AV13Insert_TrnCod ;
   private short AV27FirmaD ;
   private short AV26Cernum ;
   private short RcdFound1 ;
   private short A20AlbComLin ;
   private short s19AlbComLiC ;
   private short nIsDirty_1 ;
   private short nIsDirty_2 ;
   private short i19AlbComLiC ;
   private short gxhchits ;
   private short GXt_int9 ;
   private short GXv_int10[] ;
   private int wcpOAV8AlbComCod ;
   private int Z14AlbComCod ;
   private int Z252CliCod ;
   private int O252CliCod ;
   private int nRC_GXsfl_79 ;
   private int nGXsfl_79_idx=1 ;
   private int N252CliCod ;
   private int Z10355AlbComHd ;
   private int Z13317AlbComPzas ;
   private int A14AlbComCod ;
   private int AV25AlbLast ;
   private int A252CliCod ;
   private int AV30guiremcli ;
   private int AV8AlbComCod ;
   private int trnEnded ;
   private int edtAlbComCod_Enabled ;
   private int edtAlbComFch_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtAlcDomEnv_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtAlbComMat_Enabled ;
   private int edtAlbComHor_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtAlbComFs_Visible ;
   private int edtAlbComFs_Enabled ;
   private int edtfindDomEnv_Enabled ;
   private int edtfindDomEnv_Visible ;
   private int edtAlbComEAT_Enabled ;
   private int edtAlbComEAT_Visible ;
   private int edtAlbComID_Visible ;
   private int edtAlbComID_Enabled ;
   private int edtAlbComAT_Visible ;
   private int edtAlbComAT_Enabled ;
   private int edtAlbComFd_Visible ;
   private int edtAlbComFd_Enabled ;
   private int edtAlbCTrNm_Visible ;
   private int edtAlbCTrNm_Enabled ;
   private int edtAlbCTrNc_Visible ;
   private int edtAlbCTrNc_Enabled ;
   private int edtAlbCTrDm_Visible ;
   private int edtAlbCTrDm_Enabled ;
   private int edtAlbComImp_Enabled ;
   private int edtAlbComImp_Visible ;
   private int edtAlbComEst_Enabled ;
   private int edtAlbComEst_Visible ;
   private int edtAlbComLiC_Enabled ;
   private int edtAlbComLiC_Visible ;
   private int edtAlbComEso_Enabled ;
   private int edtAlbComEso_Visible ;
   private int edtAlbComFdD_Visible ;
   private int edtAlbComFdD_Enabled ;
   private int edtAlbCSec_Visible ;
   private int edtAlbCSec_Enabled ;
   private int edtAlbComSt_Visible ;
   private int edtAlbComSt_Enabled ;
   private int edtAlcIvaCod_Visible ;
   private int edtAlcIvaCod_Enabled ;
   private int edtAlcDivCod_Visible ;
   private int edtAlcDivCod_Enabled ;
   private int edtAlcDivTCod_Visible ;
   private int edtAlcDivTCod_Enabled ;
   private int B252CliCod ;
   private int edtAlbComLin_Enabled ;
   private int edtAlbComNRef_Enabled ;
   private int edtAlbComVDoc_Enabled ;
   private int edtAlbComPzas_Enabled ;
   private int edtAlbComMts_Enabled ;
   private int edtAlbComArt_Enabled ;
   private int edtAlbComArtD_Enabled ;
   private int edtAlbComCol_Enabled ;
   private int edtAlbComKgs_Enabled ;
   private int edtAlbComDsc_Enabled ;
   private int edtAlbComPre_Enabled ;
   private int edtAlbComCnt_Enabled ;
   private int edtAlbComHd_Enabled ;
   private int edtALbComR_Enabled ;
   private int edtAlbComP_Enabled ;
   private int edtAlbComDc2_Enabled ;
   private int edtAlbComProd_Enabled ;
   private int edtAlbCImpLin_Enabled ;
   private int edtAlbCImpL_Enabled ;
   private int fRowAdded ;
   private int AV12Insert_CliCod ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int A13317AlbComPzas ;
   private int A10355AlbComHd ;
   private int AV33CliCod ;
   private int AV36GXV1 ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtAlbCImpL_Enabled ;
   private int defedtAlbCImpLin_Enabled ;
   private int defedtAlbComProd_Enabled ;
   private int defedtAlbComDc2_Enabled ;
   private int defedtAlbComP_Enabled ;
   private int defedtALbComR_Enabled ;
   private int defedtAlbComHd_Enabled ;
   private int defedtAlbComCnt_Enabled ;
   private int defedtAlbComPre_Enabled ;
   private int defedtAlbComLin_Enabled ;
   private int i10355AlbComHd ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int ZV25AlbLast ;
   private int GXv_int8[] ;
   private int ZV30guiremcli ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal O18AlbComImp ;
   private java.math.BigDecimal Z13318AlbComMts ;
   private java.math.BigDecimal Z13AlbComCnt ;
   private java.math.BigDecimal Z13319AlbComKgs ;
   private java.math.BigDecimal Z21AlbComPre ;
   private java.math.BigDecimal O12AlbCImpLin ;
   private java.math.BigDecimal A18AlbComImp ;
   private java.math.BigDecimal B18AlbComImp ;
   private java.math.BigDecimal A13318AlbComMts ;
   private java.math.BigDecimal A13319AlbComKgs ;
   private java.math.BigDecimal A21AlbComPre ;
   private java.math.BigDecimal A13AlbComCnt ;
   private java.math.BigDecimal A12AlbCImpLin ;
   private java.math.BigDecimal A3914AlbCImpL ;
   private java.math.BigDecimal s18AlbComImp ;
   private java.math.BigDecimal T12AlbCImpLin ;
   private java.math.BigDecimal Z18AlbComImp ;
   private java.math.BigDecimal i18AlbComImp ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV18AlbComPri ;
   private String Z396EmprCod ;
   private String Z22AlbComPri ;
   private String Z4830AlbComMat ;
   private String Z10740AlbComID ;
   private String Z10764AlbComAT ;
   private String Z10014AlbComFd ;
   private String Z11719AlbCTrNm ;
   private String Z11721AlbCTrNc ;
   private String Z11720AlbCTrDm ;
   private String Z10015AlbComFdD ;
   private String Z3094AlbCSec ;
   private String Z10738AlbComSt ;
   private String Z5143AlcIvaCod ;
   private String Z3095AlcDivTCod ;
   private String O22AlbComPri ;
   private String Z10357AlbComP ;
   private String Z13321AlbComArtD ;
   private String Z13315AlbComNRef ;
   private String Z13316AlbComVDoc ;
   private String Z13320AlbComArt ;
   private String Z13322AlbComCol ;
   private String Z15AlbComDsc ;
   private String Z10806AlbComDc2 ;
   private String Z5010AlbComProd ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV31ContCod ;
   private String A22AlbComPri ;
   private String AV23Msg_f ;
   private String A13320AlbComArt ;
   private String A65ArtCod ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String AV18AlbComPri ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbComCod_Internalname ;
   private String sGXsfl_79_idx="0001" ;
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
   private String edtAlbComCod_Jsonclick ;
   private String edtAlbComFch_Internalname ;
   private String edtAlbComFch_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String divTablesplittedalcdomenv_Internalname ;
   private String lblTextblockalcdomenv_Internalname ;
   private String lblTextblockalcdomenv_Jsonclick ;
   private String sStyleString ;
   private String tblTablemergedalcdomenv_Internalname ;
   private String edtAlcDomEnv_Internalname ;
   private String edtAlcDomEnv_Jsonclick ;
   private String tblTablesearcrroot_Internalname ;
   private String lblPromptclienv_Internalname ;
   private String lblPromptclienv_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtAlbComMat_Internalname ;
   private String A4830AlbComMat ;
   private String edtAlbComMat_Jsonclick ;
   private String edtAlbComHor_Internalname ;
   private String edtAlbComHor_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV35Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtAlbComFs_Internalname ;
   private String edtAlbComFs_Jsonclick ;
   private String edtfindDomEnv_Internalname ;
   private String edtfindDomEnv_Jsonclick ;
   private String edtAlbComEAT_Internalname ;
   private String edtAlbComEAT_Jsonclick ;
   private String edtAlbComID_Internalname ;
   private String A10740AlbComID ;
   private String edtAlbComID_Jsonclick ;
   private String edtAlbComAT_Internalname ;
   private String A10764AlbComAT ;
   private String edtAlbComAT_Jsonclick ;
   private String edtAlbComFd_Internalname ;
   private String A10014AlbComFd ;
   private String edtAlbCTrNm_Internalname ;
   private String A11719AlbCTrNm ;
   private String edtAlbCTrNm_Jsonclick ;
   private String edtAlbCTrNc_Internalname ;
   private String A11721AlbCTrNc ;
   private String edtAlbCTrNc_Jsonclick ;
   private String edtAlbCTrDm_Internalname ;
   private String A11720AlbCTrDm ;
   private String edtAlbCTrDm_Jsonclick ;
   private String edtAlbComImp_Internalname ;
   private String edtAlbComImp_Jsonclick ;
   private String edtAlbComEst_Internalname ;
   private String edtAlbComEst_Jsonclick ;
   private String edtAlbComLiC_Internalname ;
   private String edtAlbComLiC_Jsonclick ;
   private String edtAlbComEso_Internalname ;
   private String edtAlbComEso_Jsonclick ;
   private String edtAlbComFdD_Internalname ;
   private String A10015AlbComFdD ;
   private String edtAlbCSec_Internalname ;
   private String A3094AlbCSec ;
   private String edtAlbCSec_Jsonclick ;
   private String edtAlbComSt_Internalname ;
   private String A10738AlbComSt ;
   private String edtAlbComSt_Jsonclick ;
   private String edtAlcIvaCod_Internalname ;
   private String A5143AlcIvaCod ;
   private String edtAlcIvaCod_Jsonclick ;
   private String edtAlcDivCod_Internalname ;
   private String edtAlcDivCod_Jsonclick ;
   private String edtAlcDivTCod_Internalname ;
   private String A3095AlcDivTCod ;
   private String edtAlcDivTCod_Jsonclick ;
   private String B22AlbComPri ;
   private String sMode2 ;
   private String edtAlbComLin_Internalname ;
   private String edtAlbComNRef_Internalname ;
   private String edtAlbComVDoc_Internalname ;
   private String edtAlbComPzas_Internalname ;
   private String edtAlbComMts_Internalname ;
   private String edtAlbComArt_Internalname ;
   private String edtAlbComArtD_Internalname ;
   private String edtAlbComCol_Internalname ;
   private String edtAlbComKgs_Internalname ;
   private String edtAlbComDsc_Internalname ;
   private String edtAlbComPre_Internalname ;
   private String edtAlbComCnt_Internalname ;
   private String edtAlbComHd_Internalname ;
   private String edtALbComR_Internalname ;
   private String edtAlbComP_Internalname ;
   private String edtAlbComDc2_Internalname ;
   private String edtAlbComProd_Internalname ;
   private String edtAlbCImpLin_Internalname ;
   private String edtAlbCImpL_Internalname ;
   private String subGridlevel_level1_Internalname ;
   private String AV29oldAlbComPri ;
   private String AV32Msg_errAT ;
   private String A407EmprNom ;
   private String A279CliNom ;
   private String A841TrnNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode1 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String A13315AlbComNRef ;
   private String A13316AlbComVDoc ;
   private String A13321AlbComArtD ;
   private String A13322AlbComCol ;
   private String A15AlbComDsc ;
   private String A10357AlbComP ;
   private String A10806AlbComDc2 ;
   private String A5010AlbComProd ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV15Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z841TrnNom ;
   private String sGXsfl_79_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtAlbComLin_Jsonclick ;
   private String edtAlbComNRef_Jsonclick ;
   private String edtAlbComVDoc_Jsonclick ;
   private String edtAlbComPzas_Jsonclick ;
   private String edtAlbComMts_Jsonclick ;
   private String edtAlbComArt_Jsonclick ;
   private String edtAlbComArtD_Jsonclick ;
   private String edtAlbComCol_Jsonclick ;
   private String edtAlbComKgs_Jsonclick ;
   private String edtAlbComDsc_Jsonclick ;
   private String edtAlbComPre_Jsonclick ;
   private String edtAlbComCnt_Jsonclick ;
   private String edtAlbComHd_Jsonclick ;
   private String edtALbComR_Jsonclick ;
   private String edtAlbComP_Jsonclick ;
   private String edtAlbComDc2_Jsonclick ;
   private String edtAlbComProd_Jsonclick ;
   private String edtAlbCImpLin_Jsonclick ;
   private String edtAlbCImpL_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i3095AlcDivTCod ;
   private String i10738AlbComSt ;
   private String i10740AlbComID ;
   private String i10764AlbComAT ;
   private String i22AlbComPri ;
   private String i10357AlbComP ;
   private String subGridlevel_level1_Header ;
   private String gxwrpcisep ;
   private String l65ArtCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV23Msg_f ;
   private String ZV29oldAlbComPri ;
   private String ZV31ContCod ;
   private String GXv_char4[] ;
   private java.util.Date Z10013AlbComFs ;
   private java.util.Date Z4829AlbComHor ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date A10013AlbComFs ;
   private java.util.Date GXt_dtime11 ;
   private java.util.Date GXv_dtime12[] ;
   private java.util.Date Z17AlbComFch ;
   private java.util.Date AV24Fch ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date i17AlbComFch ;
   private java.util.Date GXv_date14[] ;
   private java.util.Date GXv_date13[] ;
   private java.util.Date ZV24Fch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n840TrnCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n18AlbComImp ;
   private boolean bGXsfl_79_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n13739findDomEnv ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A13735CliCNom ;
   private String A13738TrnCNom ;
   private String h252CliCod ;
   private String h840TrnCod ;
   private String l13735CliCNom ;
   private String l13738TrnCNom ;
   private String Zh252CliCod ;
   private String Zh840TrnCod ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbComPri ;
   private IDataStoreProvider pr_default ;
   private String[] T01PQ6_A407EmprNom ;
   private boolean[] T01PQ6_n407EmprNom ;
   private String[] T01PQ13_A13738TrnCNom ;
   private String[] T01PQ13_A396EmprCod ;
   private short[] T01PQ13_A840TrnCod ;
   private boolean[] T01PQ13_n840TrnCod ;
   private String[] T01PQ14_A13735CliCNom ;
   private String[] T01PQ14_A396EmprCod ;
   private int[] T01PQ14_A252CliCod ;
   private java.math.BigDecimal[] T01PQ12_A18AlbComImp ;
   private boolean[] T01PQ12_n18AlbComImp ;
   private String[] T01PQ8_A841TrnNom ;
   private boolean[] T01PQ8_n841TrnNom ;
   private String[] T01PQ7_A279CliNom ;
   private byte[] T01PQ16_A266CliEnvLin ;
   private int[] T01PQ16_A14AlbComCod ;
   private java.util.Date[] T01PQ16_A10013AlbComFs ;
   private java.util.Date[] T01PQ16_A4829AlbComHor ;
   private String[] T01PQ16_A407EmprNom ;
   private boolean[] T01PQ16_n407EmprNom ;
   private java.util.Date[] T01PQ16_A17AlbComFch ;
   private String[] T01PQ16_A22AlbComPri ;
   private byte[] T01PQ16_A5142AlcDomEnv ;
   private String[] T01PQ16_A279CliNom ;
   private String[] T01PQ16_A841TrnNom ;
   private boolean[] T01PQ16_n841TrnNom ;
   private String[] T01PQ16_A4830AlbComMat ;
   private byte[] T01PQ16_A10739AlbComEAT ;
   private String[] T01PQ16_A10740AlbComID ;
   private String[] T01PQ16_A10764AlbComAT ;
   private String[] T01PQ16_A10014AlbComFd ;
   private String[] T01PQ16_A11719AlbCTrNm ;
   private String[] T01PQ16_A11721AlbCTrNc ;
   private String[] T01PQ16_A11720AlbCTrDm ;
   private byte[] T01PQ16_A16AlbComEst ;
   private short[] T01PQ16_A19AlbComLiC ;
   private byte[] T01PQ16_A1783AlbComEso ;
   private String[] T01PQ16_A10015AlbComFdD ;
   private String[] T01PQ16_A3094AlbCSec ;
   private String[] T01PQ16_A10738AlbComSt ;
   private String[] T01PQ16_A5143AlcIvaCod ;
   private String[] T01PQ16_A3095AlcDivTCod ;
   private String[] T01PQ16_A396EmprCod ;
   private int[] T01PQ16_A252CliCod ;
   private short[] T01PQ16_A840TrnCod ;
   private boolean[] T01PQ16_n840TrnCod ;
   private byte[] T01PQ16_A3111AlcDivCod ;
   private byte[] T01PQ16_A13739findDomEnv ;
   private boolean[] T01PQ16_n13739findDomEnv ;
   private java.math.BigDecimal[] T01PQ16_A18AlbComImp ;
   private boolean[] T01PQ16_n18AlbComImp ;
   private String[] T01PQ17_A13735CliCNom ;
   private String[] T01PQ17_A396EmprCod ;
   private int[] T01PQ17_A252CliCod ;
   private String[] T01PQ18_A13738TrnCNom ;
   private String[] T01PQ18_A396EmprCod ;
   private short[] T01PQ18_A840TrnCod ;
   private boolean[] T01PQ18_n840TrnCod ;
   private String[] T01PQ19_A13735CliCNom ;
   private String[] T01PQ19_A396EmprCod ;
   private int[] T01PQ19_A252CliCod ;
   private String[] T01PQ20_A13738TrnCNom ;
   private String[] T01PQ20_A396EmprCod ;
   private short[] T01PQ20_A840TrnCod ;
   private boolean[] T01PQ20_n840TrnCod ;
   private byte[] T01PQ9_A3111AlcDivCod ;
   private String[] T01PQ21_A13735CliCNom ;
   private String[] T01PQ21_A396EmprCod ;
   private int[] T01PQ21_A252CliCod ;
   private String[] T01PQ22_A13738TrnCNom ;
   private String[] T01PQ22_A396EmprCod ;
   private short[] T01PQ22_A840TrnCod ;
   private boolean[] T01PQ22_n840TrnCod ;
   private byte[] T01PQ10_A13739findDomEnv ;
   private boolean[] T01PQ10_n13739findDomEnv ;
   private byte[] T01PQ23_A3111AlcDivCod ;
   private String[] T01PQ24_A279CliNom ;
   private String[] T01PQ25_A841TrnNom ;
   private boolean[] T01PQ25_n841TrnNom ;
   private byte[] T01PQ26_A13739findDomEnv ;
   private boolean[] T01PQ26_n13739findDomEnv ;
   private java.math.BigDecimal[] T01PQ28_A18AlbComImp ;
   private boolean[] T01PQ28_n18AlbComImp ;
   private String[] T01PQ29_A396EmprCod ;
   private int[] T01PQ29_A14AlbComCod ;
   private int[] T01PQ5_A14AlbComCod ;
   private java.util.Date[] T01PQ5_A10013AlbComFs ;
   private java.util.Date[] T01PQ5_A4829AlbComHor ;
   private java.util.Date[] T01PQ5_A17AlbComFch ;
   private String[] T01PQ5_A22AlbComPri ;
   private byte[] T01PQ5_A5142AlcDomEnv ;
   private String[] T01PQ5_A4830AlbComMat ;
   private byte[] T01PQ5_A10739AlbComEAT ;
   private String[] T01PQ5_A10740AlbComID ;
   private String[] T01PQ5_A10764AlbComAT ;
   private String[] T01PQ5_A10014AlbComFd ;
   private String[] T01PQ5_A11719AlbCTrNm ;
   private String[] T01PQ5_A11721AlbCTrNc ;
   private String[] T01PQ5_A11720AlbCTrDm ;
   private byte[] T01PQ5_A16AlbComEst ;
   private short[] T01PQ5_A19AlbComLiC ;
   private byte[] T01PQ5_A1783AlbComEso ;
   private String[] T01PQ5_A10015AlbComFdD ;
   private String[] T01PQ5_A3094AlbCSec ;
   private String[] T01PQ5_A10738AlbComSt ;
   private String[] T01PQ5_A5143AlcIvaCod ;
   private String[] T01PQ5_A3095AlcDivTCod ;
   private String[] T01PQ5_A396EmprCod ;
   private int[] T01PQ5_A252CliCod ;
   private short[] T01PQ5_A840TrnCod ;
   private boolean[] T01PQ5_n840TrnCod ;
   private byte[] T01PQ5_A3111AlcDivCod ;
   private String[] T01PQ30_A396EmprCod ;
   private int[] T01PQ30_A14AlbComCod ;
   private String[] T01PQ31_A396EmprCod ;
   private int[] T01PQ31_A14AlbComCod ;
   private String[] T01PQ32_A13735CliCNom ;
   private String[] T01PQ32_A396EmprCod ;
   private int[] T01PQ32_A252CliCod ;
   private String[] T01PQ33_A13738TrnCNom ;
   private String[] T01PQ33_A396EmprCod ;
   private short[] T01PQ33_A840TrnCod ;
   private boolean[] T01PQ33_n840TrnCod ;
   private int[] T01PQ4_A14AlbComCod ;
   private java.util.Date[] T01PQ4_A10013AlbComFs ;
   private java.util.Date[] T01PQ4_A4829AlbComHor ;
   private java.util.Date[] T01PQ4_A17AlbComFch ;
   private String[] T01PQ4_A22AlbComPri ;
   private byte[] T01PQ4_A5142AlcDomEnv ;
   private String[] T01PQ4_A4830AlbComMat ;
   private byte[] T01PQ4_A10739AlbComEAT ;
   private String[] T01PQ4_A10740AlbComID ;
   private String[] T01PQ4_A10764AlbComAT ;
   private String[] T01PQ4_A10014AlbComFd ;
   private String[] T01PQ4_A11719AlbCTrNm ;
   private String[] T01PQ4_A11721AlbCTrNc ;
   private String[] T01PQ4_A11720AlbCTrDm ;
   private byte[] T01PQ4_A16AlbComEst ;
   private short[] T01PQ4_A19AlbComLiC ;
   private byte[] T01PQ4_A1783AlbComEso ;
   private String[] T01PQ4_A10015AlbComFdD ;
   private String[] T01PQ4_A3094AlbCSec ;
   private String[] T01PQ4_A10738AlbComSt ;
   private String[] T01PQ4_A5143AlcIvaCod ;
   private String[] T01PQ4_A3095AlcDivTCod ;
   private String[] T01PQ4_A396EmprCod ;
   private int[] T01PQ4_A252CliCod ;
   private short[] T01PQ4_A840TrnCod ;
   private boolean[] T01PQ4_n840TrnCod ;
   private byte[] T01PQ4_A3111AlcDivCod ;
   private String[] T01PQ37_A279CliNom ;
   private String[] T01PQ38_A841TrnNom ;
   private boolean[] T01PQ38_n841TrnNom ;
   private byte[] T01PQ39_A13739findDomEnv ;
   private boolean[] T01PQ39_n13739findDomEnv ;
   private java.math.BigDecimal[] T01PQ41_A18AlbComImp ;
   private boolean[] T01PQ41_n18AlbComImp ;
   private String[] T01PQ42_A396EmprCod ;
   private int[] T01PQ42_A14AlbComCod ;
   private byte[] T01PQ42_A2386AlbCObsLin ;
   private String[] T01PQ44_A396EmprCod ;
   private int[] T01PQ44_A14AlbComCod ;
   private int[] T01PQ45_A14AlbComCod ;
   private short[] T01PQ45_A20AlbComLin ;
   private int[] T01PQ45_A10355AlbComHd ;
   private byte[] T01PQ45_A10356ALbComR ;
   private String[] T01PQ45_A10357AlbComP ;
   private String[] T01PQ45_A13321AlbComArtD ;
   private String[] T01PQ45_A13315AlbComNRef ;
   private String[] T01PQ45_A13316AlbComVDoc ;
   private int[] T01PQ45_A13317AlbComPzas ;
   private java.math.BigDecimal[] T01PQ45_A13318AlbComMts ;
   private String[] T01PQ45_A13320AlbComArt ;
   private String[] T01PQ45_A13322AlbComCol ;
   private java.math.BigDecimal[] T01PQ45_A13AlbComCnt ;
   private java.math.BigDecimal[] T01PQ45_A13319AlbComKgs ;
   private String[] T01PQ45_A15AlbComDsc ;
   private java.math.BigDecimal[] T01PQ45_A21AlbComPre ;
   private String[] T01PQ45_A10806AlbComDc2 ;
   private String[] T01PQ45_A5010AlbComProd ;
   private String[] T01PQ45_A396EmprCod ;
   private String[] T01PQ46_A396EmprCod ;
   private int[] T01PQ46_A14AlbComCod ;
   private short[] T01PQ46_A20AlbComLin ;
   private int[] T01PQ3_A14AlbComCod ;
   private short[] T01PQ3_A20AlbComLin ;
   private int[] T01PQ3_A10355AlbComHd ;
   private byte[] T01PQ3_A10356ALbComR ;
   private String[] T01PQ3_A10357AlbComP ;
   private String[] T01PQ3_A13321AlbComArtD ;
   private String[] T01PQ3_A13315AlbComNRef ;
   private String[] T01PQ3_A13316AlbComVDoc ;
   private int[] T01PQ3_A13317AlbComPzas ;
   private java.math.BigDecimal[] T01PQ3_A13318AlbComMts ;
   private String[] T01PQ3_A13320AlbComArt ;
   private String[] T01PQ3_A13322AlbComCol ;
   private java.math.BigDecimal[] T01PQ3_A13AlbComCnt ;
   private java.math.BigDecimal[] T01PQ3_A13319AlbComKgs ;
   private String[] T01PQ3_A15AlbComDsc ;
   private java.math.BigDecimal[] T01PQ3_A21AlbComPre ;
   private String[] T01PQ3_A10806AlbComDc2 ;
   private String[] T01PQ3_A5010AlbComProd ;
   private String[] T01PQ3_A396EmprCod ;
   private int[] T01PQ2_A14AlbComCod ;
   private short[] T01PQ2_A20AlbComLin ;
   private int[] T01PQ2_A10355AlbComHd ;
   private byte[] T01PQ2_A10356ALbComR ;
   private String[] T01PQ2_A10357AlbComP ;
   private String[] T01PQ2_A13321AlbComArtD ;
   private String[] T01PQ2_A13315AlbComNRef ;
   private String[] T01PQ2_A13316AlbComVDoc ;
   private int[] T01PQ2_A13317AlbComPzas ;
   private java.math.BigDecimal[] T01PQ2_A13318AlbComMts ;
   private String[] T01PQ2_A13320AlbComArt ;
   private String[] T01PQ2_A13322AlbComCol ;
   private java.math.BigDecimal[] T01PQ2_A13AlbComCnt ;
   private java.math.BigDecimal[] T01PQ2_A13319AlbComKgs ;
   private String[] T01PQ2_A15AlbComDsc ;
   private java.math.BigDecimal[] T01PQ2_A21AlbComPre ;
   private String[] T01PQ2_A10806AlbComDc2 ;
   private String[] T01PQ2_A5010AlbComProd ;
   private String[] T01PQ2_A396EmprCod ;
   private String[] T01PQ50_A396EmprCod ;
   private int[] T01PQ50_A14AlbComCod ;
   private short[] T01PQ50_A20AlbComLin ;
   private String[] T01PQ51_A13735CliCNom ;
   private String[] T01PQ52_A13738TrnCNom ;
   private String[] T01PQ53_A396EmprCod ;
   private int[] T01PQ53_A252CliCod ;
   private String[] T01PQ53_A65ArtCod ;
   private String[] T01PQ54_A13735CliCNom ;
   private String[] T01PQ54_A396EmprCod ;
   private int[] T01PQ54_A252CliCod ;
   private String[] T01PQ55_A13738TrnCNom ;
   private String[] T01PQ55_A396EmprCod ;
   private short[] T01PQ55_A840TrnCod ;
   private boolean[] T01PQ55_n840TrnCod ;
   private java.math.BigDecimal[] T01PQ57_A18AlbComImp ;
   private boolean[] T01PQ57_n18AlbComImp ;
   private String[] T01PQ58_A13735CliCNom ;
   private String[] T01PQ58_A396EmprCod ;
   private int[] T01PQ58_A252CliCod ;
   private String[] T01PQ59_A279CliNom ;
   private byte[] T01PQ60_A13739findDomEnv ;
   private boolean[] T01PQ60_n13739findDomEnv ;
   private String[] T01PQ61_A13738TrnCNom ;
   private String[] T01PQ61_A396EmprCod ;
   private short[] T01PQ61_A840TrnCod ;
   private boolean[] T01PQ61_n840TrnCod ;
   private String[] T01PQ62_A841TrnNom ;
   private boolean[] T01PQ62_n841TrnNom ;
   private byte[] T01PQ63_A3111AlcDivCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV14TrnContextAtt ;
}

final  class documentocomercialv01__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentocomercialv01__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentocomercialv01__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentocomercialv01__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentocomercialv01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01PQ2", "SELECT AlbComCod, AlbComLin, AlbComHd, ALbComR, AlbComP, AlbComArtD, AlbComNRef, AlbComVDoc, AlbComPzas, AlbComMts, AlbComArt, AlbComCol, AlbComCnt, AlbComKgs, AlbComDsc, AlbComPre, AlbComDc2, AlbComProd, EmprCod FROM TXPLALCOM WHERE EmprCod = ? AND AlbComCod = ? AND AlbComLin = ?  FOR UPDATE OF AlbComHd, ALbComR, AlbComP, AlbComArtD, AlbComNRef, AlbComVDoc, AlbComPzas, AlbComMts, AlbComArt, AlbComCol, AlbComCnt, AlbComKgs, AlbComDsc, AlbComPre, AlbComDc2, AlbComProd NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ3", "SELECT AlbComCod, AlbComLin, AlbComHd, ALbComR, AlbComP, AlbComArtD, AlbComNRef, AlbComVDoc, AlbComPzas, AlbComMts, AlbComArt, AlbComCol, AlbComCnt, AlbComKgs, AlbComDsc, AlbComPre, AlbComDc2, AlbComProd, EmprCod FROM TXPLALCOM WHERE EmprCod = ? AND AlbComCod = ? AND AlbComLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ4", "SELECT AlbComCod, AlbComFs, AlbComHor, AlbComFch, AlbComPri, AlcDomEnv, AlbComMat, AlbComEAT, AlbComID, AlbComAT, AlbComFd, AlbCTrNm, AlbCTrNc, AlbCTrDm, AlbComEst, AlbComLiC, AlbComEso, AlbComFdD, AlbCSec, AlbComSt, AlcIvaCod, AlcDivTCod, EmprCod, CliCod, TrnCod, AlcDivCod FROM TXPCALCOM WHERE EmprCod = ? AND AlbComCod = ?  FOR UPDATE OF AlbComFs, AlbComHor, AlbComFch, AlbComPri, AlcDomEnv, AlbComMat, AlbComEAT, AlbComID, AlbComAT, AlbComFd, AlbCTrNm, AlbCTrNc, AlbCTrDm, AlbComEst, AlbComLiC, AlbComEso, AlbComFdD, AlbCSec, AlbComSt, AlcIvaCod, AlcDivTCod, CliCod, TrnCod, AlcDivCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ5", "SELECT AlbComCod, AlbComFs, AlbComHor, AlbComFch, AlbComPri, AlcDomEnv, AlbComMat, AlbComEAT, AlbComID, AlbComAT, AlbComFd, AlbCTrNm, AlbCTrNc, AlbCTrDm, AlbComEst, AlbComLiC, AlbComEso, AlbComFdD, AlbCSec, AlbComSt, AlcIvaCod, AlcDivTCod, EmprCod, CliCod, TrnCod, AlcDivCod FROM TXPCALCOM WHERE EmprCod = ? AND AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ8", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ9", "SELECT DivCod AS AlcDivCod FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ10", "SELECT COALESCE( CliEnvLin, 0) AS findDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ12", "SELECT COALESCE( T1.AlbComImp, 0) AS AlbComImp FROM (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ13", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (EmprCod = ?) AND (TrnCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ14", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ16", "SELECT /*+ FIRST_ROWS(100) */ T5.CliEnvLin, TM1.AlbComCod, TM1.AlbComFs, TM1.AlbComHor, T2.EmprNom, TM1.AlbComFch, TM1.AlbComPri, TM1.AlcDomEnv, T4.CliNom, T6.TrnNom, TM1.AlbComMat, TM1.AlbComEAT, TM1.AlbComID, TM1.AlbComAT, TM1.AlbComFd, TM1.AlbCTrNm, TM1.AlbCTrNc, TM1.AlbCTrDm, TM1.AlbComEst, TM1.AlbComLiC, TM1.AlbComEso, TM1.AlbComFdD, TM1.AlbCSec, TM1.AlbComSt, TM1.AlcIvaCod, TM1.AlcDivTCod, TM1.EmprCod, TM1.CliCod, TM1.TrnCod, TM1.AlcDivCod AS AlcDivCod, COALESCE( T5.CliEnvLin, 0) AS findDomEnv, COALESCE( T3.AlbComImp, 0) AS AlbComImp FROM (((((TXPCALCOM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbComCod = TM1.AlbComCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod) LEFT JOIN TXPCLIENV T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.CliCod AND T5.CliEnvLin = TM1.AlcDomEnv) LEFT JOIN TXPTRANSP T6 ON T6.EmprCod = TM1.EmprCod AND T6.TrnCod = TM1.TrnCod) WHERE TM1.EmprCod = ? and TM1.AlbComCod = ? ORDER BY TM1.EmprCod, TM1.AlbComCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ17", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ18", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (EmprCod = ?) AND (TrnCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ19", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ20", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ21", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ22", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ23", "SELECT DivCod AS AlcDivCod FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ24", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ25", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ26", "SELECT COALESCE( CliEnvLin, 0) AS findDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ28", "SELECT COALESCE( T1.AlbComImp, 0) AS AlbComImp FROM (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ29", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbComCod FROM TXPCALCOM WHERE EmprCod = ? AND AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ30", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbComCod FROM TXPCALCOM WHERE ( EmprCod > ? or EmprCod = ? and AlbComCod > ?) ORDER BY EmprCod, AlbComCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PQ31", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbComCod FROM TXPCALCOM WHERE ( EmprCod < ? or EmprCod = ? and AlbComCod < ?) ORDER BY EmprCod DESC, AlbComCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PQ32", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ33", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01PQ34", "INSERT INTO TXPCALCOM(AlbComCod, AlbComFs, AlbComHor, AlbComFch, AlbComPri, AlcDomEnv, AlbComMat, AlbComEAT, AlbComID, AlbComAT, AlbComFd, AlbCTrNm, AlbCTrNc, AlbCTrDm, AlbComEst, AlbComLiC, AlbComEso, AlbComFdD, AlbCSec, AlbComSt, AlcIvaCod, AlcDivTCod, EmprCod, CliCod, TrnCod, AlcDivCod, AlbCObsCon, AlbComATCU, AlbComSerA, AlbComTipA) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', ' ')", GX_NOMASK, "TXPCALCOM")
         ,new UpdateCursor("T01PQ35", "UPDATE TXPCALCOM SET AlbComFs=?, AlbComHor=?, AlbComFch=?, AlbComPri=?, AlcDomEnv=?, AlbComMat=?, AlbComEAT=?, AlbComID=?, AlbComAT=?, AlbComFd=?, AlbCTrNm=?, AlbCTrNc=?, AlbCTrDm=?, AlbComEst=?, AlbComLiC=?, AlbComEso=?, AlbComFdD=?, AlbCSec=?, AlbComSt=?, AlcIvaCod=?, AlcDivTCod=?, CliCod=?, TrnCod=?, AlcDivCod=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK, "TXPCALCOM")
         ,new UpdateCursor("T01PQ36", "DELETE FROM TXPCALCOM  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK, "TXPCALCOM")
         ,new ForEachCursor("T01PQ37", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ38", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ39", "SELECT COALESCE( CliEnvLin, 0) AS findDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ41", "SELECT COALESCE( T1.AlbComImp, 0) AS AlbComImp FROM (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ42", "SELECT * FROM (SELECT EmprCod, AlbComCod, AlbCObsLin FROM TXPOBSALC WHERE EmprCod = ? AND AlbComCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01PQ43", "UPDATE TXPCALCOM SET AlbComLiC=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK, "TXPCALCOM")
         ,new ForEachCursor("T01PQ44", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbComCod FROM TXPCALCOM ORDER BY EmprCod, AlbComCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ45", "SELECT AlbComCod, AlbComLin, AlbComHd, ALbComR, AlbComP, AlbComArtD, AlbComNRef, AlbComVDoc, AlbComPzas, AlbComMts, AlbComArt, AlbComCol, AlbComCnt, AlbComKgs, AlbComDsc, AlbComPre, AlbComDc2, AlbComProd, EmprCod FROM TXPLALCOM WHERE EmprCod = ? and AlbComCod = ? and AlbComLin = ? ORDER BY EmprCod, AlbComCod, AlbComLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ46", "SELECT EmprCod, AlbComCod, AlbComLin FROM TXPLALCOM WHERE EmprCod = ? AND AlbComCod = ? AND AlbComLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01PQ47", "INSERT INTO TXPLALCOM(AlbComCod, AlbComLin, AlbComHd, ALbComR, AlbComP, AlbComArtD, AlbComNRef, AlbComVDoc, AlbComPzas, AlbComMts, AlbComArt, AlbComCol, AlbComCnt, AlbComKgs, AlbComDsc, AlbComPre, AlbComDc2, AlbComProd, EmprCod, AlbComUni) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPLALCOM")
         ,new UpdateCursor("T01PQ48", "UPDATE TXPLALCOM SET AlbComHd=?, ALbComR=?, AlbComP=?, AlbComArtD=?, AlbComNRef=?, AlbComVDoc=?, AlbComPzas=?, AlbComMts=?, AlbComArt=?, AlbComCol=?, AlbComCnt=?, AlbComKgs=?, AlbComDsc=?, AlbComPre=?, AlbComDc2=?, AlbComProd=?  WHERE EmprCod = ? AND AlbComCod = ? AND AlbComLin = ?", GX_NOMASK, "TXPLALCOM")
         ,new UpdateCursor("T01PQ49", "DELETE FROM TXPLALCOM  WHERE EmprCod = ? AND AlbComCod = ? AND AlbComLin = ?", GX_NOMASK, "TXPLALCOM")
         ,new ForEachCursor("T01PQ50", "SELECT EmprCod, AlbComCod, AlbComLin FROM TXPLALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod, AlbComLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ51", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom))) like '%' || UPPER(?)) ORDER BY CliCNom) WHERE rownum <= 20 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ52", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom FROM TXPTRANSP WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, '')))) like '%' || UPPER(?)) ORDER BY TrnCNom) WHERE rownum <= 20 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ53", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE (EmprCod = ?) AND (UPPER(ArtCod) like '%' || UPPER(?)) AND (CliCod = ?) ORDER BY ArtCod) WHERE rownum <= 20 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ54", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ55", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ57", "SELECT COALESCE( T1.AlbComImp, 0) AS AlbComImp FROM (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ58", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ59", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ60", "SELECT COALESCE( CliEnvLin, 0) AS findDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ61", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) AS TrnCNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(TrnCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TrnNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ62", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PQ63", "SELECT DivCod AS AlcDivCod FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[14])[0] = rslt.getString(15, 40);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((String[]) buf[16])[0] = rslt.getString(17, 100);
               ((String[]) buf[17])[0] = rslt.getString(18, 6);
               ((String[]) buf[18])[0] = rslt.getString(19, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[14])[0] = rslt.getString(15, 40);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((String[]) buf[16])[0] = rslt.getString(17, 100);
               ((String[]) buf[17])[0] = rslt.getString(18, 6);
               ((String[]) buf[18])[0] = rslt.getString(19, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 200);
               ((String[]) buf[11])[0] = rslt.getString(12, 60);
               ((String[]) buf[12])[0] = rslt.getString(13, 20);
               ((String[]) buf[13])[0] = rslt.getString(14, 60);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 200);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               ((String[]) buf[19])[0] = rslt.getString(20, 1);
               ((String[]) buf[20])[0] = rslt.getString(21, 3);
               ((String[]) buf[21])[0] = rslt.getString(22, 1);
               ((String[]) buf[22])[0] = rslt.getString(23, 3);
               ((int[]) buf[23])[0] = rslt.getInt(24);
               ((short[]) buf[24])[0] = rslt.getShort(25);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(26);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 200);
               ((String[]) buf[11])[0] = rslt.getString(12, 60);
               ((String[]) buf[12])[0] = rslt.getString(13, 20);
               ((String[]) buf[13])[0] = rslt.getString(14, 60);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 200);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               ((String[]) buf[19])[0] = rslt.getString(20, 1);
               ((String[]) buf[20])[0] = rslt.getString(21, 3);
               ((String[]) buf[21])[0] = rslt.getString(22, 1);
               ((String[]) buf[22])[0] = rslt.getString(23, 3);
               ((int[]) buf[23])[0] = rslt.getInt(24);
               ((short[]) buf[24])[0] = rslt.getShort(25);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(26);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 8 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 12 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 20);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 20);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((String[]) buf[16])[0] = rslt.getString(15, 200);
               ((String[]) buf[17])[0] = rslt.getString(16, 60);
               ((String[]) buf[18])[0] = rslt.getString(17, 20);
               ((String[]) buf[19])[0] = rslt.getString(18, 60);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((byte[]) buf[22])[0] = rslt.getByte(21);
               ((String[]) buf[23])[0] = rslt.getString(22, 200);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((String[]) buf[25])[0] = rslt.getString(24, 1);
               ((String[]) buf[26])[0] = rslt.getString(25, 3);
               ((String[]) buf[27])[0] = rslt.getString(26, 1);
               ((String[]) buf[28])[0] = rslt.getString(27, 3);
               ((int[]) buf[29])[0] = rslt.getInt(28);
               ((short[]) buf[30])[0] = rslt.getShort(29);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((byte[]) buf[32])[0] = rslt.getByte(30);
               ((byte[]) buf[33])[0] = rslt.getByte(31);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 35 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 39 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[14])[0] = rslt.getString(15, 40);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((String[]) buf[16])[0] = rslt.getString(17, 100);
               ((String[]) buf[17])[0] = rslt.getString(18, 6);
               ((String[]) buf[18])[0] = rslt.getString(19, 3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
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
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 53 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 56 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 7 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 19 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
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
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
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
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 27 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 28 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 29 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 20);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 20);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 200);
               stmt.setString(12, (String)parms[11], 60);
               stmt.setString(13, (String)parms[12], 20);
               stmt.setString(14, (String)parms[13], 60);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setString(18, (String)parms[17], 200);
               stmt.setString(19, (String)parms[18], 1);
               stmt.setString(20, (String)parms[19], 1);
               stmt.setString(21, (String)parms[20], 3);
               stmt.setString(22, (String)parms[21], 1);
               stmt.setString(23, (String)parms[22], 3);
               stmt.setInt(24, ((Number) parms[23]).intValue());
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[25]).shortValue());
               }
               stmt.setByte(26, ((Number) parms[26]).byteValue());
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
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 20);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 20);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 200);
               stmt.setString(11, (String)parms[10], 60);
               stmt.setString(12, (String)parms[11], 20);
               stmt.setString(13, (String)parms[12], 60);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setString(17, (String)parms[16], 200);
               stmt.setString(18, (String)parms[17], 1);
               stmt.setString(19, (String)parms[18], 1);
               stmt.setString(20, (String)parms[19], 3);
               stmt.setString(21, (String)parms[20], 1);
               stmt.setInt(22, ((Number) parms[21]).intValue());
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[23]).shortValue());
               }
               stmt.setByte(24, ((Number) parms[24]).byteValue());
               stmt.setString(25, (String)parms[25], 3);
               stmt.setInt(26, ((Number) parms[26]).intValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 41 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 26);
               stmt.setString(7, (String)parms[6], 20);
               stmt.setString(8, (String)parms[7], 20);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setString(11, (String)parms[10], 16);
               stmt.setString(12, (String)parms[11], 20);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setString(15, (String)parms[14], 40);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[15], 5);
               stmt.setString(17, (String)parms[16], 100);
               stmt.setString(18, (String)parms[17], 6);
               stmt.setString(19, (String)parms[18], 3);
               return;
            case 42 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 26);
               stmt.setString(5, (String)parms[4], 20);
               stmt.setString(6, (String)parms[5], 20);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setString(9, (String)parms[8], 16);
               stmt.setString(10, (String)parms[9], 20);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setString(13, (String)parms[12], 40);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 5);
               stmt.setString(15, (String)parms[14], 100);
               stmt.setString(16, (String)parms[15], 6);
               stmt.setString(17, (String)parms[16], 3);
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 48 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 49 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 54 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 55 :
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
            case 56 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
      }
   }

}

