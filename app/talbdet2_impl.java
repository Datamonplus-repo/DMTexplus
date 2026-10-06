package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbdet2_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action90") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         AV73Noctrlpz = (byte)(GXutil.lval( httpContext.GetPar( "Noctrlpz"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73Noctrlpz", GXutil.str( AV73Noctrlpz, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_90_1P1299( Gx_mode, A396EmprCod, A2159AlbRecPie, AV73Noctrlpz) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action93") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         AV48SumPza = (byte)(GXutil.lval( httpContext.GetPar( "SumPza"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48SumPza", GXutil.str( AV48SumPza, 1, 0));
         A2155AlbRecKgm = CommonUtil.decimalVal( httpContext.GetPar( "AlbRecKgm"), ".") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_93_1P1299( Gx_mode, A396EmprCod, A44AlbRecCod, A2159AlbRecPie, AV48SumPza, A2155AlbRecKgm) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action95") == 0 )
      {
         A56AlbRUni = httpContext.GetPar( "AlbRUni") ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A2157AlbRecMtr = CommonUtil.decimalVal( httpContext.GetPar( "AlbRecMtr"), ".") ;
         A2155AlbRecKgm = CommonUtil.decimalVal( httpContext.GetPar( "AlbRecKgm"), ".") ;
         AV51FlagArt = (byte)(GXutil.lval( httpContext.GetPar( "FlagArt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51FlagArt", GXutil.str( AV51FlagArt, 1, 0));
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         AV52CalMKT = (byte)(GXutil.lval( httpContext.GetPar( "CalMKT"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52CalMKT", GXutil.str( AV52CalMKT, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_95_1P1299( A56AlbRUni, A2157AlbRecMtr, A2155AlbRecKgm, AV51FlagArt, A2159AlbRecPie, AV52CalMKT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel46"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa461P17( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel47"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel48"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa58061P17( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel49"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel55"+"_"+"ALBDETPIEU") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A56AlbRUni = httpContext.GetPar( "AlbRUni") ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx55asaalbdetpieu1P17( A396EmprCod, A44AlbRecCod, A56AlbRUni) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel61"+"_"+"ALBRECOBS") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx61asaalbrecobs1P1299( A396EmprCod, A44AlbRecCod, A2159AlbRecPie) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel63"+"_"+"ALBDETPIEU") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A56AlbRUni = httpContext.GetPar( "AlbRUni") ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx63asaalbdetpieu1P1299( A396EmprCod, A44AlbRecCod, A56AlbRUni) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel73"+"_"+"vPZAPROD") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx73asapzaprod1P1299( Gx_mode, A396EmprCod, A44AlbRecCod, A2159AlbRecPie) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_98") == 0 )
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
         gxload_98( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_99") == 0 )
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
         gxload_99( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_100") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A970ProceCod = (short)(GXutil.lval( httpContext.GetPar( "ProceCod"))) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_100( A396EmprCod, A970ProceCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_101") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1211TipEntCod = (short)(GXutil.lval( httpContext.GetPar( "TipEntCod"))) ;
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_101( A396EmprCod, A1211TipEntCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_102") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_102( A396EmprCod, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_104") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_104( A396EmprCod, A44AlbRecCod, A2159AlbRecPie) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_piezas") == 0 )
      {
         gxnrgridlevel_piezas_newrow_invoke( ) ;
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
            AV104EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104EmprCod", AV104EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV104EmprCod, "@!"))));
            AV105AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105AlbRecCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV105AlbRecCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento Almacen Entradas Tela (Detail)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_piezas_newrow_invoke( )
   {
      nRC_GXsfl_383 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_383"))) ;
      nGXsfl_383_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_383_idx"))) ;
      sGXsfl_383_idx = httpContext.GetPar( "sGXsfl_383_idx") ;
      A4921AlbRAnc = (short)(GXutil.lval( httpContext.GetPar( "AlbRAnc"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      A10761AlbUltP = (short)(GXutil.lval( httpContext.GetPar( "AlbUltP"))) ;
      n10761AlbUltP = false ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A2146AlbDetKgm = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetKgm"), ".") ;
      A2148AlbDetKgmU = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetKgmU"), ".") ;
      A2149AlbDetMtr = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetMtr"), ".") ;
      A2151AlbDetMtrU = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetMtrU"), ".") ;
      A2152AlbDetPie = (short)(GXutil.lval( httpContext.GetPar( "AlbDetPie"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
      n44AlbRecCod = false ;
      A56AlbRUni = httpContext.GetPar( "AlbRUni") ;
      A2153AlbDetPieU = (short)(GXutil.lval( httpContext.GetPar( "AlbDetPieU"))) ;
      A2147AlbDetKgmD = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetKgmD"), ".") ;
      A2150AlbDetMtrD = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetMtrD"), ".") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_piezas_newrow( ) ;
      /* End function gxnrGridlevel_piezas_newrow_invoke */
   }

   public talbdet2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talbdet2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbdet2_impl.class ));
   }

   public talbdet2_impl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbRUni = new HTMLChoice();
      cmbAlbREst = new HTMLChoice();
      cmbAlbRReo = new HTMLChoice();
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
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      }
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      }
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRecCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRecCod_Internalname, httpContext.getMessage( "N Recepcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRecCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable6.setProperty("Width", Dvpanel_unnamedtable6_Width);
      ucDvpanel_unnamedtable6.setProperty("AutoWidth", Dvpanel_unnamedtable6_Autowidth);
      ucDvpanel_unnamedtable6.setProperty("AutoHeight", Dvpanel_unnamedtable6_Autoheight);
      ucDvpanel_unnamedtable6.setProperty("Cls", Dvpanel_unnamedtable6_Cls);
      ucDvpanel_unnamedtable6.setProperty("Title", Dvpanel_unnamedtable6_Title);
      ucDvpanel_unnamedtable6.setProperty("Collapsible", Dvpanel_unnamedtable6_Collapsible);
      ucDvpanel_unnamedtable6.setProperty("Collapsed", Dvpanel_unnamedtable6_Collapsed);
      ucDvpanel_unnamedtable6.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable6_Showcollapseicon);
      ucDvpanel_unnamedtable6.setProperty("IconPosition", Dvpanel_unnamedtable6_Iconposition);
      ucDvpanel_unnamedtable6.setProperty("AutoScroll", Dvpanel_unnamedtable6_Autoscroll);
      ucDvpanel_unnamedtable6.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable6_Internalname, "DVPANEL_UNNAMEDTABLE6Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE6Container"+"UnnamedTable6"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable6_Internalname, tblUnnamedtable6_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable23_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbrent_cell_Internalname, 1, 0, "px", 0, "px", divAlbrent_cell_Class, "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrent_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrent_Internalname, httpContext.getMessage( "N Albaran", ""), "", "", lblTextblockalbrent_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbREnt_Internalname, httpContext.getMessage( "Albaran Entrega", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt_Internalname, GXutil.rtrim( A46AlbREnt), GXutil.rtrim( localUtil.format( A46AlbREnt, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbREnt_Visible, edtAlbREnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divAlbrent2_cell_Internalname, 1, 0, "px", 0, "px", divAlbrent2_cell_Class, "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrent2_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrent2_Internalname, httpContext.getMessage( "N Albaran", ""), "", "", lblTextblockalbrent2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbREnt2_Internalname, httpContext.getMessage( "Nº Albaran Entrega", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt2_Internalname, GXutil.rtrim( A5806AlbREnt2), GXutil.rtrim( localUtil.format( A5806AlbREnt2, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt2_Jsonclick, 0, "AttributeFL", "", "", "", "", edtAlbREnt2_Visible, edtAlbREnt2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrfen_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrfen_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblockalbrfen_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRFen_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbRFen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFen_Internalname, localUtil.format(A49AlbRFen, "99/99/99"), localUtil.format( A49AlbRFen, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRFen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRFen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBDET2.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrhen_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrhen_Internalname, httpContext.getMessage( "Hora", ""), "", "", lblTextblockalbrhen_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRHEn_Internalname, httpContext.getMessage( "Hora de entrada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbRHEn_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRHEn_Internalname, localUtil.ttoc( A4606AlbRHEn, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4606AlbRHEn, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRHEn_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRHEn_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRHEn_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRHEn_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBDET2.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTablemergedunnamedtable7_Internalname, tblTablemergedunnamedtable7_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='MergeDataCell'>") ;
      /* User Defined Control */
      ucDvpanel_unnamedtable7.setProperty("Width", Dvpanel_unnamedtable7_Width);
      ucDvpanel_unnamedtable7.setProperty("AutoWidth", Dvpanel_unnamedtable7_Autowidth);
      ucDvpanel_unnamedtable7.setProperty("AutoHeight", Dvpanel_unnamedtable7_Autoheight);
      ucDvpanel_unnamedtable7.setProperty("Cls", Dvpanel_unnamedtable7_Cls);
      ucDvpanel_unnamedtable7.setProperty("Title", Dvpanel_unnamedtable7_Title);
      ucDvpanel_unnamedtable7.setProperty("Collapsible", Dvpanel_unnamedtable7_Collapsible);
      ucDvpanel_unnamedtable7.setProperty("Collapsed", Dvpanel_unnamedtable7_Collapsed);
      ucDvpanel_unnamedtable7.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable7_Showcollapseicon);
      ucDvpanel_unnamedtable7.setProperty("IconPosition", Dvpanel_unnamedtable7_Iconposition);
      ucDvpanel_unnamedtable7.setProperty("AutoScroll", Dvpanel_unnamedtable7_Autoscroll);
      ucDvpanel_unnamedtable7.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable7_Internalname, "DVPANEL_UNNAMEDTABLE7Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE7Container"+"UnnamedTable7"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable7_Internalname, tblUnnamedtable7_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable22_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtableclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclicod_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockclicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtableclinom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclinom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblockclinom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbref_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbref_Internalname, httpContext.getMessage( "Codigo Referencia", ""), "", "", lblTextblockalbref_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRef_Internalname, httpContext.getMessage( "Codigo Referencia", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef), GXutil.rtrim( localUtil.format( A45AlbRef, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRef_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRef_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrefdsc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrefdsc_Internalname, httpContext.getMessage( "Descripcion Referencia", ""), "", "", lblTextblockalbrefdsc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRefDsc_Internalname, httpContext.getMessage( "Descripcion Referencia", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc), GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRefDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRefDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* User Defined Control */
      ucDvpanel_unnamedtable8.setProperty("Width", Dvpanel_unnamedtable8_Width);
      ucDvpanel_unnamedtable8.setProperty("AutoWidth", Dvpanel_unnamedtable8_Autowidth);
      ucDvpanel_unnamedtable8.setProperty("AutoHeight", Dvpanel_unnamedtable8_Autoheight);
      ucDvpanel_unnamedtable8.setProperty("Cls", Dvpanel_unnamedtable8_Cls);
      ucDvpanel_unnamedtable8.setProperty("Title", Dvpanel_unnamedtable8_Title);
      ucDvpanel_unnamedtable8.setProperty("Collapsible", Dvpanel_unnamedtable8_Collapsible);
      ucDvpanel_unnamedtable8.setProperty("Collapsed", Dvpanel_unnamedtable8_Collapsed);
      ucDvpanel_unnamedtable8.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable8_Showcollapseicon);
      ucDvpanel_unnamedtable8.setProperty("IconPosition", Dvpanel_unnamedtable8_Iconposition);
      ucDvpanel_unnamedtable8.setProperty("AutoScroll", Dvpanel_unnamedtable8_Autoscroll);
      ucDvpanel_unnamedtable8.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable8_Internalname, "DVPANEL_UNNAMEDTABLE8Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE8Container"+"UnnamedTable8"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable8_Internalname, tblUnnamedtable8_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable21_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtableprocenom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprocenom_Internalname, httpContext.getMessage( "Procedencia", ""), "", "", lblTextblockprocenom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProceNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceNom_Internalname, GXutil.rtrim( A971ProceNom), GXutil.rtrim( localUtil.format( A971ProceNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProceNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletrnnom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktrnnom_Internalname, httpContext.getMessage( "Transportista", ""), "", "", lblTextblocktrnnom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnNom_Internalname, httpContext.getMessage( "Transportista", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNom_Internalname, GXutil.rtrim( A841TrnNom), GXutil.rtrim( localUtil.format( A841TrnNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTablemergedunnamedtable9_Internalname, tblTablemergedunnamedtable9_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='MergeDataCell'>") ;
      /* User Defined Control */
      ucDvpanel_unnamedtable9.setProperty("Width", Dvpanel_unnamedtable9_Width);
      ucDvpanel_unnamedtable9.setProperty("AutoWidth", Dvpanel_unnamedtable9_Autowidth);
      ucDvpanel_unnamedtable9.setProperty("AutoHeight", Dvpanel_unnamedtable9_Autoheight);
      ucDvpanel_unnamedtable9.setProperty("Cls", Dvpanel_unnamedtable9_Cls);
      ucDvpanel_unnamedtable9.setProperty("Title", Dvpanel_unnamedtable9_Title);
      ucDvpanel_unnamedtable9.setProperty("Collapsible", Dvpanel_unnamedtable9_Collapsible);
      ucDvpanel_unnamedtable9.setProperty("Collapsed", Dvpanel_unnamedtable9_Collapsed);
      ucDvpanel_unnamedtable9.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable9_Showcollapseicon);
      ucDvpanel_unnamedtable9.setProperty("IconPosition", Dvpanel_unnamedtable9_Iconposition);
      ucDvpanel_unnamedtable9.setProperty("AutoScroll", Dvpanel_unnamedtable9_Autoscroll);
      ucDvpanel_unnamedtable9.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable9_Internalname, "DVPANEL_UNNAMEDTABLE9Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE9Container"+"UnnamedTable9"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable9_Internalname, tblUnnamedtable9_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable20_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrunient_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrunient_Internalname, httpContext.getMessage( "Unidades Entrada", ""), "", "", lblTextblockalbrunient_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniEnt_Internalname, httpContext.getMessage( "Unidades Entrada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbruni_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbruni_Internalname, httpContext.getMessage( "Unidad", ""), "", "", lblTextblockalbruni_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbRUni.getInternalname(), httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TALBDET2.htm");
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrpieent_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrpieent_Internalname, httpContext.getMessage( "Piezas Entregadas", ""), "", "", lblTextblockalbrpieent_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieEnt_Internalname, httpContext.getMessage( "Piezas Entregadas", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieEnt_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrunic_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrunic_Internalname, httpContext.getMessage( "Unidades Cliente", ""), "", "", lblTextblockalbrunic_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbrUniC_Internalname, httpContext.getMessage( "Unidades Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrUniC_Internalname, GXutil.ltrim( localUtil.ntoc( A6180AlbrUniC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbrUniC_Enabled!=0) ? localUtil.format( A6180AlbrUniC, "ZZZZZ9.99") : localUtil.format( A6180AlbrUniC, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrUniC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbrUniC_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrpiec_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrpiec_Internalname, httpContext.getMessage( "Piezas Cliente", ""), "", "", lblTextblockalbrpiec_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbrPieC_Internalname, httpContext.getMessage( "Piezas Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrPieC_Internalname, GXutil.ltrim( localUtil.ntoc( A6181AlbrPieC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbrPieC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6181AlbrPieC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6181AlbrPieC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrPieC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbrPieC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbNumM_Internalname, httpContext.getMessage( "Nº Marcado", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumM_Internalname, GXutil.rtrim( A8029AlbNumM), GXutil.rtrim( localUtil.format( A8029AlbNumM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumM_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbNumM_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* User Defined Control */
      ucDvpanel_unnamedtable10.setProperty("Width", Dvpanel_unnamedtable10_Width);
      ucDvpanel_unnamedtable10.setProperty("AutoWidth", Dvpanel_unnamedtable10_Autowidth);
      ucDvpanel_unnamedtable10.setProperty("AutoHeight", Dvpanel_unnamedtable10_Autoheight);
      ucDvpanel_unnamedtable10.setProperty("Cls", Dvpanel_unnamedtable10_Cls);
      ucDvpanel_unnamedtable10.setProperty("Title", Dvpanel_unnamedtable10_Title);
      ucDvpanel_unnamedtable10.setProperty("Collapsible", Dvpanel_unnamedtable10_Collapsible);
      ucDvpanel_unnamedtable10.setProperty("Collapsed", Dvpanel_unnamedtable10_Collapsed);
      ucDvpanel_unnamedtable10.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable10_Showcollapseicon);
      ucDvpanel_unnamedtable10.setProperty("IconPosition", Dvpanel_unnamedtable10_Iconposition);
      ucDvpanel_unnamedtable10.setProperty("AutoScroll", Dvpanel_unnamedtable10_Autoscroll);
      ucDvpanel_unnamedtable10.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable10_Internalname, "DVPANEL_UNNAMEDTABLE10Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE10Container"+"UnnamedTable10"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable10_Internalname, tblUnnamedtable10_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable19_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbruniuti_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbruniuti_Internalname, httpContext.getMessage( "Unidades Utilizadas", ""), "", "", lblTextblockalbruniuti_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniUti_Internalname, httpContext.getMessage( "Unidades Utilizadas", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniUti_Enabled!=0) ? localUtil.format( A60AlbRUniUti, "ZZZZZ9.99") : localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniUti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniUti_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrunidis_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrunidis_Internalname, httpContext.getMessage( "Unidades Disponibles", ""), "", "", lblTextblockalbrunidis_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniDis_Internalname, httpContext.getMessage( "Unidades Disponibles", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrpieuti_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrpieuti_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "", "", lblTextblockalbrpieuti_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieUti_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieUti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieUti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieUti_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrpiedis_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrpiedis_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "", "", lblTextblockalbrpiedis_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieDis_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrfecult_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrfecult_Internalname, httpContext.getMessage( "Fecha Ult Uti", ""), "", "", lblTextblockalbrfecult_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRFecUlt_Internalname, httpContext.getMessage( "Fecha Ult Uti", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbRFecUlt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFecUlt_Internalname, localUtil.format(A48AlbRFecUlt, "99/99/99"), localUtil.format( A48AlbRFecUlt, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFecUlt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRFecUlt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRFecUlt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFecUlt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBDET2.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrest_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrest_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblockalbrest_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbREst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbREst, cmbAlbREst.getInternalname(), GXutil.trim( GXutil.str( A47AlbREst, 1, 0)), 1, cmbAlbREst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbREst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TALBDET2.htm");
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTablemergedunnamedtable11_Internalname, tblTablemergedunnamedtable11_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='MergeDataCell'>") ;
      /* User Defined Control */
      ucDvpanel_unnamedtable11.setProperty("Width", Dvpanel_unnamedtable11_Width);
      ucDvpanel_unnamedtable11.setProperty("AutoWidth", Dvpanel_unnamedtable11_Autowidth);
      ucDvpanel_unnamedtable11.setProperty("AutoHeight", Dvpanel_unnamedtable11_Autoheight);
      ucDvpanel_unnamedtable11.setProperty("Cls", Dvpanel_unnamedtable11_Cls);
      ucDvpanel_unnamedtable11.setProperty("Title", Dvpanel_unnamedtable11_Title);
      ucDvpanel_unnamedtable11.setProperty("Collapsible", Dvpanel_unnamedtable11_Collapsible);
      ucDvpanel_unnamedtable11.setProperty("Collapsed", Dvpanel_unnamedtable11_Collapsed);
      ucDvpanel_unnamedtable11.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable11_Showcollapseicon);
      ucDvpanel_unnamedtable11.setProperty("IconPosition", Dvpanel_unnamedtable11_Iconposition);
      ucDvpanel_unnamedtable11.setProperty("AutoScroll", Dvpanel_unnamedtable11_Autoscroll);
      ucDvpanel_unnamedtable11.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable11_Internalname, "DVPANEL_UNNAMEDTABLE11Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE11Container"+"UnnamedTable11"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable11_Internalname, tblUnnamedtable11_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable18_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletipentnom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktipentnom_Internalname, httpContext.getMessage( "Tipo Entrada", ""), "", "", lblTextblocktipentnom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipEntNom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipEntNom_Internalname, GXutil.rtrim( A1212TipEntNom), GXutil.rtrim( localUtil.format( A1212TipEntNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipEntNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipEntNom_Enabled, 0, "text", "", 25, "chr", 1, "row", 25, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrdes_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrdes_Internalname, httpContext.getMessage( "Destino", ""), "", "", lblTextblockalbrdes_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRDes_Internalname, httpContext.getMessage( "Destino", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRDes_Internalname, GXutil.rtrim( A1291AlbRDes), GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRDes_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrlote_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrlote_Internalname, httpContext.getMessage( "Lote", ""), "", "", lblTextblockalbrlote_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRLote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLote_Internalname, GXutil.rtrim( A6463AlbRLote), GXutil.rtrim( localUtil.format( A6463AlbRLote, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRLote_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* User Defined Control */
      ucDvpanel_unnamedtable12.setProperty("Width", Dvpanel_unnamedtable12_Width);
      ucDvpanel_unnamedtable12.setProperty("AutoWidth", Dvpanel_unnamedtable12_Autowidth);
      ucDvpanel_unnamedtable12.setProperty("AutoHeight", Dvpanel_unnamedtable12_Autoheight);
      ucDvpanel_unnamedtable12.setProperty("Cls", Dvpanel_unnamedtable12_Cls);
      ucDvpanel_unnamedtable12.setProperty("Title", Dvpanel_unnamedtable12_Title);
      ucDvpanel_unnamedtable12.setProperty("Collapsible", Dvpanel_unnamedtable12_Collapsible);
      ucDvpanel_unnamedtable12.setProperty("Collapsed", Dvpanel_unnamedtable12_Collapsed);
      ucDvpanel_unnamedtable12.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable12_Showcollapseicon);
      ucDvpanel_unnamedtable12.setProperty("IconPosition", Dvpanel_unnamedtable12_Iconposition);
      ucDvpanel_unnamedtable12.setProperty("AutoScroll", Dvpanel_unnamedtable12_Autoscroll);
      ucDvpanel_unnamedtable12.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable12_Internalname, "DVPANEL_UNNAMEDTABLE12Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE12Container"+"UnnamedTable12"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable12_Internalname, tblUnnamedtable12_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable17_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrloc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrloc_Internalname, httpContext.getMessage( "Localizacion", ""), "", "", lblTextblockalbrloc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRLoc_Internalname, httpContext.getMessage( "Localizacion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLoc_Internalname, GXutil.rtrim( A50AlbRLoc), GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLoc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrreo_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrreo_Internalname, httpContext.getMessage( "Reclamacion?", ""), "", "", lblTextblockalbrreo_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbRReo.getInternalname(), httpContext.getMessage( "Reclamacion?", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRReo, cmbAlbRReo.getInternalname(), GXutil.rtrim( A55AlbRReo), 1, cmbAlbRReo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRReo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TALBDET2.htm");
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTablemergedunnamedtable13_Internalname, tblTablemergedunnamedtable13_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='MergeDataCell'>") ;
      /* User Defined Control */
      ucDvpanel_unnamedtable13.setProperty("Width", Dvpanel_unnamedtable13_Width);
      ucDvpanel_unnamedtable13.setProperty("AutoWidth", Dvpanel_unnamedtable13_Autowidth);
      ucDvpanel_unnamedtable13.setProperty("AutoHeight", Dvpanel_unnamedtable13_Autoheight);
      ucDvpanel_unnamedtable13.setProperty("Cls", Dvpanel_unnamedtable13_Cls);
      ucDvpanel_unnamedtable13.setProperty("Title", Dvpanel_unnamedtable13_Title);
      ucDvpanel_unnamedtable13.setProperty("Collapsible", Dvpanel_unnamedtable13_Collapsible);
      ucDvpanel_unnamedtable13.setProperty("Collapsed", Dvpanel_unnamedtable13_Collapsed);
      ucDvpanel_unnamedtable13.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable13_Showcollapseicon);
      ucDvpanel_unnamedtable13.setProperty("IconPosition", Dvpanel_unnamedtable13_Iconposition);
      ucDvpanel_unnamedtable13.setProperty("AutoScroll", Dvpanel_unnamedtable13_Autoscroll);
      ucDvpanel_unnamedtable13.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable13_Internalname, "DVPANEL_UNNAMEDTABLE13Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE13Container"+"UnnamedTable13"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable13_Internalname, tblUnnamedtable13_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable16_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrgrm2_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrgrm2_Internalname, httpContext.getMessage( "Grm2", ""), "", "", lblTextblockalbrgrm2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRGrm2_Internalname, httpContext.getMessage( "Grm2", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRGrm2_Internalname, GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRGrm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRGrm2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRGrm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbranc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbranc_Internalname, httpContext.getMessage( "Ancho", ""), "", "", lblTextblockalbranc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRAnc_Internalname, httpContext.getMessage( "Ancho", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRAnc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbpml_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbpml_Internalname, httpContext.getMessage( "Pml", ""), "", "", lblTextblockalbpml_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbPml_Internalname, httpContext.getMessage( "Pml", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPml_Internalname, GXutil.ltrim( localUtil.ntoc( A4922AlbPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPml_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4922AlbPml), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4922AlbPml), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPml_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbPml_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* User Defined Control */
      ucDvpanel_unnamedtable14.setProperty("Width", Dvpanel_unnamedtable14_Width);
      ucDvpanel_unnamedtable14.setProperty("AutoWidth", Dvpanel_unnamedtable14_Autowidth);
      ucDvpanel_unnamedtable14.setProperty("AutoHeight", Dvpanel_unnamedtable14_Autoheight);
      ucDvpanel_unnamedtable14.setProperty("Cls", Dvpanel_unnamedtable14_Cls);
      ucDvpanel_unnamedtable14.setProperty("Title", Dvpanel_unnamedtable14_Title);
      ucDvpanel_unnamedtable14.setProperty("Collapsible", Dvpanel_unnamedtable14_Collapsible);
      ucDvpanel_unnamedtable14.setProperty("Collapsed", Dvpanel_unnamedtable14_Collapsed);
      ucDvpanel_unnamedtable14.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable14_Showcollapseicon);
      ucDvpanel_unnamedtable14.setProperty("IconPosition", Dvpanel_unnamedtable14_Iconposition);
      ucDvpanel_unnamedtable14.setProperty("AutoScroll", Dvpanel_unnamedtable14_Autoscroll);
      ucDvpanel_unnamedtable14.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable14_Internalname, "DVPANEL_UNNAMEDTABLE14Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE14Container"+"UnnamedTable14"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable14_Internalname, tblUnnamedtable14_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable15_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrph_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrph_Internalname, httpContext.getMessage( "Ph , Tejido Blanqueado", ""), "", "", lblTextblockalbrph_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPh_Internalname, httpContext.getMessage( "Ph , Tejido Blanqueado", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPh_Internalname, GXutil.ltrim( localUtil.ntoc( A13241AlbRPh, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPh_Enabled!=0) ? localUtil.format( A13241AlbRPh, "ZZ9.99") : localUtil.format( A13241AlbRPh, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPh_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPh_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrrlong_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrrlong_Internalname, httpContext.getMessage( "Resistencia, Longitudinal", ""), "", "", lblTextblockalbrrlong_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRRLong_Internalname, httpContext.getMessage( "Resistencia, Longitudinal", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRRLong_Internalname, GXutil.ltrim( localUtil.ntoc( A13242AlbRRLong, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRRLong_Enabled!=0) ? localUtil.format( A13242AlbRRLong, "ZZ9.99") : localUtil.format( A13242AlbRRLong, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRRLong_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRRLong_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrrtrans_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrrtrans_Internalname, httpContext.getMessage( "Resistencia, Transversal", ""), "", "", lblTextblockalbrrtrans_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRRTrans_Internalname, httpContext.getMessage( "Resistencia, Transversal", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRRTrans_Internalname, GXutil.ltrim( localUtil.ntoc( A13243AlbRRTrans, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRRTrans_Enabled!=0) ? localUtil.format( A13243AlbRRTrans, "ZZ9.99") : localUtil.format( A13243AlbRRTrans, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRRTrans_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRRTrans_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_piezas_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
      /* User Defined Control */
      ucDvpanel_pnlnumerarpiezas.setProperty("Width", Dvpanel_pnlnumerarpiezas_Width);
      ucDvpanel_pnlnumerarpiezas.setProperty("AutoWidth", Dvpanel_pnlnumerarpiezas_Autowidth);
      ucDvpanel_pnlnumerarpiezas.setProperty("AutoHeight", Dvpanel_pnlnumerarpiezas_Autoheight);
      ucDvpanel_pnlnumerarpiezas.setProperty("Cls", Dvpanel_pnlnumerarpiezas_Cls);
      ucDvpanel_pnlnumerarpiezas.setProperty("Title", Dvpanel_pnlnumerarpiezas_Title);
      ucDvpanel_pnlnumerarpiezas.setProperty("Collapsible", Dvpanel_pnlnumerarpiezas_Collapsible);
      ucDvpanel_pnlnumerarpiezas.setProperty("Collapsed", Dvpanel_pnlnumerarpiezas_Collapsed);
      ucDvpanel_pnlnumerarpiezas.setProperty("ShowCollapseIcon", Dvpanel_pnlnumerarpiezas_Showcollapseicon);
      ucDvpanel_pnlnumerarpiezas.setProperty("IconPosition", Dvpanel_pnlnumerarpiezas_Iconposition);
      ucDvpanel_pnlnumerarpiezas.setProperty("AutoScroll", Dvpanel_pnlnumerarpiezas_Autoscroll);
      ucDvpanel_pnlnumerarpiezas.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnlnumerarpiezas_Internalname, "DVPANEL_PNLNUMERARPIEZASContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PNLNUMERARPIEZASContainer"+"pnlNumerarPiezas"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblPnlnumerarpiezas_Internalname, tblPnlnumerarpiezas_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;align-self:center;", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 376,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtndonumerarpiezas_Internalname, "", httpContext.getMessage( "Numerar Piezas", ""), bttBtndonumerarpiezas_Jsonclick, 5, httpContext.getMessage( "Numerar Piezas", ""), "", StyleString, ClassString, bttBtndonumerarpiezas_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DODONUMERARPIEZAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
      /* User Defined Control */
      ucDvpanel_pnldetallepiezas.setProperty("Width", Dvpanel_pnldetallepiezas_Width);
      ucDvpanel_pnldetallepiezas.setProperty("AutoWidth", Dvpanel_pnldetallepiezas_Autowidth);
      ucDvpanel_pnldetallepiezas.setProperty("AutoHeight", Dvpanel_pnldetallepiezas_Autoheight);
      ucDvpanel_pnldetallepiezas.setProperty("Cls", Dvpanel_pnldetallepiezas_Cls);
      ucDvpanel_pnldetallepiezas.setProperty("Title", Dvpanel_pnldetallepiezas_Title);
      ucDvpanel_pnldetallepiezas.setProperty("Collapsible", Dvpanel_pnldetallepiezas_Collapsible);
      ucDvpanel_pnldetallepiezas.setProperty("Collapsed", Dvpanel_pnldetallepiezas_Collapsed);
      ucDvpanel_pnldetallepiezas.setProperty("ShowCollapseIcon", Dvpanel_pnldetallepiezas_Showcollapseicon);
      ucDvpanel_pnldetallepiezas.setProperty("IconPosition", Dvpanel_pnldetallepiezas_Iconposition);
      ucDvpanel_pnldetallepiezas.setProperty("AutoScroll", Dvpanel_pnldetallepiezas_Autoscroll);
      ucDvpanel_pnldetallepiezas.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnldetallepiezas_Internalname, "DVPANEL_PNLDETALLEPIEZASContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PNLDETALLEPIEZASContainer"+"pnldetallepiezas"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblPnldetallepiezas_Internalname, tblPnldetallepiezas_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='SectionGrid EditableGridCell_LinedAtts'>") ;
      /*  Grid Control  */
      startgridcontrol383( ) ;
      nGXsfl_383_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount299 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_299 = (short)(1) ;
            scanStart1P1299( ) ;
            while ( RcdFound299 != 0 )
            {
               init_level_properties299( ) ;
               getByPrimaryKey1P1299( ) ;
               addRow1P1299( ) ;
               scanNext1P1299( ) ;
            }
            scanEnd1P1299( ) ;
            nBlankRcdCount299 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B10761AlbUltP = A10761AlbUltP ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         B10760SumPzs = A10760SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         B10758SumKgs = A10758SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         B10759SumMts = A10759SumMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         standaloneNotModal1P1299( ) ;
         standaloneModal1P1299( ) ;
         sMode299 = Gx_mode ;
         while ( nGXsfl_383_idx < nRC_GXsfl_383 )
         {
            bGXsfl_383_Refreshing = true ;
            readRow1P1299( ) ;
            edtAlbRecPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECPIE_"+sGXsfl_383_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_383_Refreshing);
            edtAlbRecAnh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECANH_"+sGXsfl_383_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecAnh_Enabled), 5, 0), !bGXsfl_383_Refreshing);
            edtALRPIELOC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIELOC_"+sGXsfl_383_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtALRPIELOC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALRPIELOC_Enabled), 5, 0), !bGXsfl_383_Refreshing);
            edtAlbRecMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTR_"+sGXsfl_383_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtr_Enabled), 5, 0), !bGXsfl_383_Refreshing);
            edtAlbRecKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGM_"+sGXsfl_383_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgm_Enabled), 5, 0), !bGXsfl_383_Refreshing);
            edtAlbRecMtrU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTRU_"+sGXsfl_383_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtrU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtrU_Enabled), 5, 0), !bGXsfl_383_Refreshing);
            edtAlbRecKgmU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGMU_"+sGXsfl_383_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgmU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgmU_Enabled), 5, 0), !bGXsfl_383_Refreshing);
            edtAlbRecObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECOBS_"+sGXsfl_383_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecObs_Enabled), 5, 0), !bGXsfl_383_Refreshing);
            if ( ( nRcdExists_299 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1P1299( ) ;
            }
            sendRow1P1299( ) ;
            bGXsfl_383_Refreshing = false ;
         }
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A10761AlbUltP = B10761AlbUltP ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         A10760SumPzs = B10760SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         A10758SumKgs = B10758SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = B10759SumMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount299 = (short)(5) ;
         nRcdExists_299 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1P1299( ) ;
            while ( RcdFound299 != 0 )
            {
               sGXsfl_383_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_383_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_383299( ) ;
               init_level_properties299( ) ;
               standaloneNotModal1P1299( ) ;
               getByPrimaryKey1P1299( ) ;
               standaloneModal1P1299( ) ;
               addRow1P1299( ) ;
               scanNext1P1299( ) ;
            }
            scanEnd1P1299( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode299 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_383_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_383_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_383299( ) ;
         initAll1P1299( ) ;
         init_level_properties299( ) ;
         B10761AlbUltP = A10761AlbUltP ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         B10760SumPzs = A10760SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         B10758SumKgs = A10758SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         B10759SumMts = A10759SumMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         nRcdExists_299 = (short)(0) ;
         nIsMod_299 = (short)(0) ;
         nRcdDeleted_299 = (short)(0) ;
         nBlankRcdCount299 = (short)(nBlankRcdUsr299+nBlankRcdCount299) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount299 > 0 )
         {
            standaloneNotModal1P1299( ) ;
            standaloneModal1P1299( ) ;
            addRow1P1299( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtAlbRecPie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount299 = (short)(nBlankRcdCount299-1) ;
         }
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A10761AlbUltP = B10761AlbUltP ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         A10760SumPzs = B10760SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         A10758SumKgs = B10758SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = B10759SumMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_piezasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_piezas", Gridlevel_piezasContainer, subGridlevel_piezas_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_piezasContainerData", Gridlevel_piezasContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_piezasContainerData"+"V", Gridlevel_piezasContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_piezasContainerData"+"V"+"\" value='"+Gridlevel_piezasContainer.GridValuesHidden()+"'/>") ;
      }
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
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
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable2_Internalname, tblUnnamedtable2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablesumkgs_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocksumkgs_Internalname, httpContext.getMessage( "Kilos", ""), "", "", lblTextblocksumkgs_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSumKgs_Internalname, httpContext.getMessage( "Sumo Kgs", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSumKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A10758SumKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSumKgs_Enabled!=0) ? localUtil.format( A10758SumKgs, "ZZZZZ9.99") : localUtil.format( A10758SumKgs, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSumKgs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSumKgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablesummts_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocksummts_Internalname, httpContext.getMessage( "Metros", ""), "", "", lblTextblocksummts_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSumMts_Internalname, httpContext.getMessage( "Sumo Mts", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSumMts_Internalname, GXutil.ltrim( localUtil.ntoc( A10759SumMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSumMts_Enabled!=0) ? localUtil.format( A10759SumMts, "ZZZZZ9.99") : localUtil.format( A10759SumMts, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSumMts_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSumMts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablesumpzs_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocksumpzs_Internalname, httpContext.getMessage( "Piezas", ""), "", "", lblTextblocksumpzs_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSumPzs_Internalname, httpContext.getMessage( "Sumo Piezas", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSumPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A10760SumPzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSumPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10760SumPzs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10760SumPzs), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSumPzs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSumPzs_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
      /* User Defined Control */
      ucDvpanel_pnlbotones.setProperty("Width", Dvpanel_pnlbotones_Width);
      ucDvpanel_pnlbotones.setProperty("AutoWidth", Dvpanel_pnlbotones_Autowidth);
      ucDvpanel_pnlbotones.setProperty("AutoHeight", Dvpanel_pnlbotones_Autoheight);
      ucDvpanel_pnlbotones.setProperty("Cls", Dvpanel_pnlbotones_Cls);
      ucDvpanel_pnlbotones.setProperty("Title", Dvpanel_pnlbotones_Title);
      ucDvpanel_pnlbotones.setProperty("Collapsible", Dvpanel_pnlbotones_Collapsible);
      ucDvpanel_pnlbotones.setProperty("Collapsed", Dvpanel_pnlbotones_Collapsed);
      ucDvpanel_pnlbotones.setProperty("ShowCollapseIcon", Dvpanel_pnlbotones_Showcollapseicon);
      ucDvpanel_pnlbotones.setProperty("IconPosition", Dvpanel_pnlbotones_Iconposition);
      ucDvpanel_pnlbotones.setProperty("AutoScroll", Dvpanel_pnlbotones_Autoscroll);
      ucDvpanel_pnlbotones.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnlbotones_Internalname, "DVPANEL_PNLBOTONESContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PNLBOTONESContainer"+"pnlbotones"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblPnlbotones_Internalname, tblPnlbotones_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 434,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 436,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 438,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      e111P12 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
            Z60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "Z60AlbRUniUti")) ;
            Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "Z54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z46AlbREnt = httpContext.cgiGet( "Z46AlbREnt") ;
            Z5806AlbREnt2 = httpContext.cgiGet( "Z5806AlbREnt2") ;
            Z49AlbRFen = localUtil.ctod( httpContext.cgiGet( "Z49AlbRFen"), 0) ;
            Z4606AlbRHEn = localUtil.ctot( httpContext.cgiGet( "Z4606AlbRHEn"), 0) ;
            Z45AlbRef = httpContext.cgiGet( "Z45AlbRef") ;
            Z3613AlbRefDsc = httpContext.cgiGet( "Z3613AlbRefDsc") ;
            Z1291AlbRDes = httpContext.cgiGet( "Z1291AlbRDes") ;
            Z56AlbRUni = httpContext.cgiGet( "Z56AlbRUni") ;
            Z50AlbRLoc = httpContext.cgiGet( "Z50AlbRLoc") ;
            Z55AlbRReo = httpContext.cgiGet( "Z55AlbRReo") ;
            Z48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( "Z48AlbRFecUlt"), 0) ;
            Z6180AlbrUniC = localUtil.ctond( httpContext.cgiGet( "Z6180AlbrUniC")) ;
            Z6181AlbrPieC = (int)(localUtil.ctol( httpContext.cgiGet( "Z6181AlbrPieC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z4920AlbRGrm2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z4921AlbRAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4922AlbPml = (short)(localUtil.ctol( httpContext.cgiGet( "Z4922AlbPml"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6463AlbRLote = httpContext.cgiGet( "Z6463AlbRLote") ;
            Z13241AlbRPh = localUtil.ctond( httpContext.cgiGet( "Z13241AlbRPh")) ;
            Z13242AlbRRLong = localUtil.ctond( httpContext.cgiGet( "Z13242AlbRRLong")) ;
            Z13243AlbRRTrans = localUtil.ctond( httpContext.cgiGet( "Z13243AlbRRTrans")) ;
            Z8029AlbNumM = httpContext.cgiGet( "Z8029AlbNumM") ;
            Z53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( "Z53AlbRPieReb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( "Z59AlbRUniReb")) ;
            Z10761AlbUltP = (short)(localUtil.ctol( httpContext.cgiGet( "Z10761AlbUltP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7501AlbRecSec = (short)(localUtil.ctol( httpContext.cgiGet( "Z7501AlbRecSec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( "Z1222AlbNumEti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z970ProceCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z1211TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( "Z53AlbRPieReb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( "Z59AlbRUniReb")) ;
            A10761AlbUltP = (short)(localUtil.ctol( httpContext.cgiGet( "Z10761AlbUltP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10761AlbUltP = false ;
            A7501AlbRecSec = (short)(localUtil.ctol( httpContext.cgiGet( "Z7501AlbRecSec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7501AlbRecSec = false ;
            A1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( "Z1222AlbNumEti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n840TrnCod = false ;
            A970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z970ProceCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n970ProceCod = false ;
            A1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z1211TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1211TipEntCod = false ;
            O10761AlbUltP = (short)(localUtil.ctol( httpContext.cgiGet( "O10761AlbUltP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O10760SumPzs = (short)(localUtil.ctol( httpContext.cgiGet( "O10760SumPzs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O10758SumKgs = localUtil.ctond( httpContext.cgiGet( "O10758SumKgs")) ;
            O10759SumMts = localUtil.ctond( httpContext.cgiGet( "O10759SumMts")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_383 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_383"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "N970ProceCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "N840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "N1211TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2149AlbDetMtr = localUtil.ctond( httpContext.cgiGet( "ALBDETMTR")) ;
            A2151AlbDetMtrU = localUtil.ctond( httpContext.cgiGet( "ALBDETMTRU")) ;
            A2150AlbDetMtrD = localUtil.ctond( httpContext.cgiGet( "ALBDETMTRD")) ;
            A2146AlbDetKgm = localUtil.ctond( httpContext.cgiGet( "ALBDETKGM")) ;
            A2148AlbDetKgmU = localUtil.ctond( httpContext.cgiGet( "ALBDETKGMU")) ;
            A2147AlbDetKgmD = localUtil.ctond( httpContext.cgiGet( "ALBDETKGMD")) ;
            AV104EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV105AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRECCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV109Insert_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV110Insert_ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PROCECOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "PROCECOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV111Insert_TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV112Insert_TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TIPENTCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "TIPENTCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2152AlbDetPie = (short)(localUtil.ctol( httpContext.cgiGet( "ALBDETPIE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2153AlbDetPieU = (short)(localUtil.ctol( httpContext.cgiGet( "ALBDETPIEU"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEREB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( "ALBRUNIREB")) ;
            A10761AlbUltP = (short)(localUtil.ctol( httpContext.cgiGet( "ALBULTP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7501AlbRecSec = (short)(localUtil.ctol( httpContext.cgiGet( "ALBRECSEC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( "ALBNUMETI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            AV125Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4795AlRPieCal = httpContext.cgiGet( "ALRPIECAL") ;
            A4806AlRPieDefC = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIEDEFC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4806AlRPieDefC = false ;
            A4797AlRPieClaC = httpContext.cgiGet( "ALRPIECLAC") ;
            A10762AlbPCont = (short)(localUtil.ctol( httpContext.cgiGet( "ALBPCONT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV81PzaProd = (byte)(localUtil.ctol( httpContext.cgiGet( "vPZAPROD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV62Msg_err = httpContext.cgiGet( "vMSG_ERR") ;
            AV61NoPzaR = (byte)(localUtil.ctol( httpContext.cgiGet( "vNOPZAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV80Velluts = (byte)(localUtil.ctol( httpContext.cgiGet( "vVELLUTS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV49Rdto = localUtil.ctond( httpContext.cgiGet( "vRDTO")) ;
            AV50Pesoml = (short)(localUtil.ctol( httpContext.cgiGet( "vPESOML"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV100Anc = (short)(localUtil.ctol( httpContext.cgiGet( "vANC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV101grm2 = (short)(localUtil.ctol( httpContext.cgiGet( "vGRM2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8779Bod_Talla = httpContext.cgiGet( "BOD_TALLA") ;
            A8780Bod_Und = (short)(localUtil.ctol( httpContext.cgiGet( "BOD_UND"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3730AlbRecCol = (short)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3731AlbRecIdPz = httpContext.cgiGet( "ALBRECIDPZ") ;
            A3732AlbRecIdRc = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECIDRC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4410AlbRecPal = localUtil.ctond( httpContext.cgiGet( "ALBRECPAL")) ;
            A10180AlRPieTelT = httpContext.cgiGet( "ALRPIETELT") ;
            A10149AlRPieCon = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIECON"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10181AlRPieOri = httpContext.cgiGet( "ALRPIEORI") ;
            A10182AlRPieDst = httpContext.cgiGet( "ALRPIEDST") ;
            A10183AlrPieKgmT = localUtil.ctond( httpContext.cgiGet( "ALRPIEKGMT")) ;
            Dvpanel_unnamedtable6_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Objectcall") ;
            Dvpanel_unnamedtable6_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Class") ;
            Dvpanel_unnamedtable6_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Enabled")) ;
            Dvpanel_unnamedtable6_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Width") ;
            Dvpanel_unnamedtable6_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Height") ;
            Dvpanel_unnamedtable6_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autowidth")) ;
            Dvpanel_unnamedtable6_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoheight")) ;
            Dvpanel_unnamedtable6_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Cls") ;
            Dvpanel_unnamedtable6_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Showheader")) ;
            Dvpanel_unnamedtable6_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Title") ;
            Dvpanel_unnamedtable6_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsible")) ;
            Dvpanel_unnamedtable6_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsed")) ;
            Dvpanel_unnamedtable6_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Showcollapseicon")) ;
            Dvpanel_unnamedtable6_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Iconposition") ;
            Dvpanel_unnamedtable6_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoscroll")) ;
            Dvpanel_unnamedtable6_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Visible")) ;
            Dvpanel_unnamedtable6_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable7_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Objectcall") ;
            Dvpanel_unnamedtable7_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Class") ;
            Dvpanel_unnamedtable7_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Enabled")) ;
            Dvpanel_unnamedtable7_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Width") ;
            Dvpanel_unnamedtable7_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Height") ;
            Dvpanel_unnamedtable7_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autowidth")) ;
            Dvpanel_unnamedtable7_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autoheight")) ;
            Dvpanel_unnamedtable7_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Cls") ;
            Dvpanel_unnamedtable7_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Showheader")) ;
            Dvpanel_unnamedtable7_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Title") ;
            Dvpanel_unnamedtable7_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Collapsible")) ;
            Dvpanel_unnamedtable7_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Collapsed")) ;
            Dvpanel_unnamedtable7_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Showcollapseicon")) ;
            Dvpanel_unnamedtable7_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Iconposition") ;
            Dvpanel_unnamedtable7_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autoscroll")) ;
            Dvpanel_unnamedtable7_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Visible")) ;
            Dvpanel_unnamedtable7_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable8_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Objectcall") ;
            Dvpanel_unnamedtable8_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Class") ;
            Dvpanel_unnamedtable8_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Enabled")) ;
            Dvpanel_unnamedtable8_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Width") ;
            Dvpanel_unnamedtable8_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Height") ;
            Dvpanel_unnamedtable8_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Autowidth")) ;
            Dvpanel_unnamedtable8_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Autoheight")) ;
            Dvpanel_unnamedtable8_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Cls") ;
            Dvpanel_unnamedtable8_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Showheader")) ;
            Dvpanel_unnamedtable8_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Title") ;
            Dvpanel_unnamedtable8_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Collapsible")) ;
            Dvpanel_unnamedtable8_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Collapsed")) ;
            Dvpanel_unnamedtable8_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Showcollapseicon")) ;
            Dvpanel_unnamedtable8_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Iconposition") ;
            Dvpanel_unnamedtable8_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Autoscroll")) ;
            Dvpanel_unnamedtable8_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Visible")) ;
            Dvpanel_unnamedtable8_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable9_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Objectcall") ;
            Dvpanel_unnamedtable9_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Class") ;
            Dvpanel_unnamedtable9_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Enabled")) ;
            Dvpanel_unnamedtable9_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Width") ;
            Dvpanel_unnamedtable9_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Height") ;
            Dvpanel_unnamedtable9_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autowidth")) ;
            Dvpanel_unnamedtable9_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autoheight")) ;
            Dvpanel_unnamedtable9_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Cls") ;
            Dvpanel_unnamedtable9_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Showheader")) ;
            Dvpanel_unnamedtable9_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Title") ;
            Dvpanel_unnamedtable9_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Collapsible")) ;
            Dvpanel_unnamedtable9_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Collapsed")) ;
            Dvpanel_unnamedtable9_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Showcollapseicon")) ;
            Dvpanel_unnamedtable9_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Iconposition") ;
            Dvpanel_unnamedtable9_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autoscroll")) ;
            Dvpanel_unnamedtable9_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Visible")) ;
            Dvpanel_unnamedtable9_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable10_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Objectcall") ;
            Dvpanel_unnamedtable10_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Class") ;
            Dvpanel_unnamedtable10_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Enabled")) ;
            Dvpanel_unnamedtable10_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Width") ;
            Dvpanel_unnamedtable10_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Height") ;
            Dvpanel_unnamedtable10_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Autowidth")) ;
            Dvpanel_unnamedtable10_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Autoheight")) ;
            Dvpanel_unnamedtable10_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Cls") ;
            Dvpanel_unnamedtable10_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Showheader")) ;
            Dvpanel_unnamedtable10_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Title") ;
            Dvpanel_unnamedtable10_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Collapsible")) ;
            Dvpanel_unnamedtable10_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Collapsed")) ;
            Dvpanel_unnamedtable10_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Showcollapseicon")) ;
            Dvpanel_unnamedtable10_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Iconposition") ;
            Dvpanel_unnamedtable10_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Autoscroll")) ;
            Dvpanel_unnamedtable10_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Visible")) ;
            Dvpanel_unnamedtable10_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE10_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable11_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Objectcall") ;
            Dvpanel_unnamedtable11_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Class") ;
            Dvpanel_unnamedtable11_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Enabled")) ;
            Dvpanel_unnamedtable11_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Width") ;
            Dvpanel_unnamedtable11_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Height") ;
            Dvpanel_unnamedtable11_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Autowidth")) ;
            Dvpanel_unnamedtable11_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Autoheight")) ;
            Dvpanel_unnamedtable11_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Cls") ;
            Dvpanel_unnamedtable11_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Showheader")) ;
            Dvpanel_unnamedtable11_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Title") ;
            Dvpanel_unnamedtable11_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Collapsible")) ;
            Dvpanel_unnamedtable11_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Collapsed")) ;
            Dvpanel_unnamedtable11_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Showcollapseicon")) ;
            Dvpanel_unnamedtable11_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Iconposition") ;
            Dvpanel_unnamedtable11_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Autoscroll")) ;
            Dvpanel_unnamedtable11_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Visible")) ;
            Dvpanel_unnamedtable11_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE11_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable12_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE12_Objectcall") ;
            Dvpanel_unnamedtable12_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE12_Class") ;
            Dvpanel_unnamedtable12_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE12_Enabled")) ;
            Dvpanel_unnamedtable12_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE12_Width") ;
            Dvpanel_unnamedtable12_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE12_Height") ;
            Dvpanel_unnamedtable12_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE12_Autowidth")) ;
            Dvpanel_unnamedtable12_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE12_Autoheight")) ;
            Dvpanel_unnamedtable12_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE12_Cls") ;
            Dvpanel_unnamedtable12_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE12_Showheader")) ;
            Dvpanel_unnamedtable12_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE12_Title") ;
            Dvpanel_unnamedtable12_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE12_Collapsible")) ;
            Dvpanel_unnamedtable12_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE12_Collapsed")) ;
            Dvpanel_unnamedtable12_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE12_Showcollapseicon")) ;
            Dvpanel_unnamedtable12_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE12_Iconposition") ;
            Dvpanel_unnamedtable12_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE12_Autoscroll")) ;
            Dvpanel_unnamedtable12_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE12_Visible")) ;
            Dvpanel_unnamedtable12_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE12_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable13_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE13_Objectcall") ;
            Dvpanel_unnamedtable13_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE13_Class") ;
            Dvpanel_unnamedtable13_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE13_Enabled")) ;
            Dvpanel_unnamedtable13_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE13_Width") ;
            Dvpanel_unnamedtable13_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE13_Height") ;
            Dvpanel_unnamedtable13_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE13_Autowidth")) ;
            Dvpanel_unnamedtable13_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE13_Autoheight")) ;
            Dvpanel_unnamedtable13_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE13_Cls") ;
            Dvpanel_unnamedtable13_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE13_Showheader")) ;
            Dvpanel_unnamedtable13_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE13_Title") ;
            Dvpanel_unnamedtable13_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE13_Collapsible")) ;
            Dvpanel_unnamedtable13_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE13_Collapsed")) ;
            Dvpanel_unnamedtable13_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE13_Showcollapseicon")) ;
            Dvpanel_unnamedtable13_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE13_Iconposition") ;
            Dvpanel_unnamedtable13_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE13_Autoscroll")) ;
            Dvpanel_unnamedtable13_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE13_Visible")) ;
            Dvpanel_unnamedtable13_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE13_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable14_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE14_Objectcall") ;
            Dvpanel_unnamedtable14_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE14_Class") ;
            Dvpanel_unnamedtable14_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE14_Enabled")) ;
            Dvpanel_unnamedtable14_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE14_Width") ;
            Dvpanel_unnamedtable14_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE14_Height") ;
            Dvpanel_unnamedtable14_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE14_Autowidth")) ;
            Dvpanel_unnamedtable14_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE14_Autoheight")) ;
            Dvpanel_unnamedtable14_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE14_Cls") ;
            Dvpanel_unnamedtable14_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE14_Showheader")) ;
            Dvpanel_unnamedtable14_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE14_Title") ;
            Dvpanel_unnamedtable14_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE14_Collapsible")) ;
            Dvpanel_unnamedtable14_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE14_Collapsed")) ;
            Dvpanel_unnamedtable14_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE14_Showcollapseicon")) ;
            Dvpanel_unnamedtable14_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE14_Iconposition") ;
            Dvpanel_unnamedtable14_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE14_Autoscroll")) ;
            Dvpanel_unnamedtable14_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE14_Visible")) ;
            Dvpanel_unnamedtable14_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE14_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Dvpanel_pnlnumerarpiezas_Objectcall = httpContext.cgiGet( "DVPANEL_PNLNUMERARPIEZAS_Objectcall") ;
            Dvpanel_pnlnumerarpiezas_Class = httpContext.cgiGet( "DVPANEL_PNLNUMERARPIEZAS_Class") ;
            Dvpanel_pnlnumerarpiezas_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLNUMERARPIEZAS_Enabled")) ;
            Dvpanel_pnlnumerarpiezas_Width = httpContext.cgiGet( "DVPANEL_PNLNUMERARPIEZAS_Width") ;
            Dvpanel_pnlnumerarpiezas_Height = httpContext.cgiGet( "DVPANEL_PNLNUMERARPIEZAS_Height") ;
            Dvpanel_pnlnumerarpiezas_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLNUMERARPIEZAS_Autowidth")) ;
            Dvpanel_pnlnumerarpiezas_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLNUMERARPIEZAS_Autoheight")) ;
            Dvpanel_pnlnumerarpiezas_Cls = httpContext.cgiGet( "DVPANEL_PNLNUMERARPIEZAS_Cls") ;
            Dvpanel_pnlnumerarpiezas_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLNUMERARPIEZAS_Showheader")) ;
            Dvpanel_pnlnumerarpiezas_Title = httpContext.cgiGet( "DVPANEL_PNLNUMERARPIEZAS_Title") ;
            Dvpanel_pnlnumerarpiezas_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLNUMERARPIEZAS_Collapsible")) ;
            Dvpanel_pnlnumerarpiezas_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLNUMERARPIEZAS_Collapsed")) ;
            Dvpanel_pnlnumerarpiezas_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLNUMERARPIEZAS_Showcollapseicon")) ;
            Dvpanel_pnlnumerarpiezas_Iconposition = httpContext.cgiGet( "DVPANEL_PNLNUMERARPIEZAS_Iconposition") ;
            Dvpanel_pnlnumerarpiezas_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLNUMERARPIEZAS_Autoscroll")) ;
            Dvpanel_pnlnumerarpiezas_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLNUMERARPIEZAS_Visible")) ;
            Dvpanel_pnlnumerarpiezas_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_PNLNUMERARPIEZAS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Dvpanel_pnldetallepiezas_Objectcall = httpContext.cgiGet( "DVPANEL_PNLDETALLEPIEZAS_Objectcall") ;
            Dvpanel_pnldetallepiezas_Class = httpContext.cgiGet( "DVPANEL_PNLDETALLEPIEZAS_Class") ;
            Dvpanel_pnldetallepiezas_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLDETALLEPIEZAS_Enabled")) ;
            Dvpanel_pnldetallepiezas_Width = httpContext.cgiGet( "DVPANEL_PNLDETALLEPIEZAS_Width") ;
            Dvpanel_pnldetallepiezas_Height = httpContext.cgiGet( "DVPANEL_PNLDETALLEPIEZAS_Height") ;
            Dvpanel_pnldetallepiezas_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLDETALLEPIEZAS_Autowidth")) ;
            Dvpanel_pnldetallepiezas_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLDETALLEPIEZAS_Autoheight")) ;
            Dvpanel_pnldetallepiezas_Cls = httpContext.cgiGet( "DVPANEL_PNLDETALLEPIEZAS_Cls") ;
            Dvpanel_pnldetallepiezas_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLDETALLEPIEZAS_Showheader")) ;
            Dvpanel_pnldetallepiezas_Title = httpContext.cgiGet( "DVPANEL_PNLDETALLEPIEZAS_Title") ;
            Dvpanel_pnldetallepiezas_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLDETALLEPIEZAS_Collapsible")) ;
            Dvpanel_pnldetallepiezas_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLDETALLEPIEZAS_Collapsed")) ;
            Dvpanel_pnldetallepiezas_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLDETALLEPIEZAS_Showcollapseicon")) ;
            Dvpanel_pnldetallepiezas_Iconposition = httpContext.cgiGet( "DVPANEL_PNLDETALLEPIEZAS_Iconposition") ;
            Dvpanel_pnldetallepiezas_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLDETALLEPIEZAS_Autoscroll")) ;
            Dvpanel_pnldetallepiezas_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLDETALLEPIEZAS_Visible")) ;
            Dvpanel_pnldetallepiezas_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_PNLDETALLEPIEZAS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_pnlbotones_Objectcall = httpContext.cgiGet( "DVPANEL_PNLBOTONES_Objectcall") ;
            Dvpanel_pnlbotones_Class = httpContext.cgiGet( "DVPANEL_PNLBOTONES_Class") ;
            Dvpanel_pnlbotones_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLBOTONES_Enabled")) ;
            Dvpanel_pnlbotones_Width = httpContext.cgiGet( "DVPANEL_PNLBOTONES_Width") ;
            Dvpanel_pnlbotones_Height = httpContext.cgiGet( "DVPANEL_PNLBOTONES_Height") ;
            Dvpanel_pnlbotones_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLBOTONES_Autowidth")) ;
            Dvpanel_pnlbotones_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLBOTONES_Autoheight")) ;
            Dvpanel_pnlbotones_Cls = httpContext.cgiGet( "DVPANEL_PNLBOTONES_Cls") ;
            Dvpanel_pnlbotones_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLBOTONES_Showheader")) ;
            Dvpanel_pnlbotones_Title = httpContext.cgiGet( "DVPANEL_PNLBOTONES_Title") ;
            Dvpanel_pnlbotones_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLBOTONES_Collapsible")) ;
            Dvpanel_pnlbotones_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLBOTONES_Collapsed")) ;
            Dvpanel_pnlbotones_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLBOTONES_Showcollapseicon")) ;
            Dvpanel_pnlbotones_Iconposition = httpContext.cgiGet( "DVPANEL_PNLBOTONES_Iconposition") ;
            Dvpanel_pnlbotones_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLBOTONES_Autoscroll")) ;
            Dvpanel_pnlbotones_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLBOTONES_Visible")) ;
            Dvpanel_pnlbotones_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_PNLBOTONES_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRECCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A44AlbRecCod = 0 ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            else
            {
               A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
            A5806AlbREnt2 = httpContext.cgiGet( edtAlbREnt2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
            A49AlbRFen = localUtil.ctod( httpContext.cgiGet( edtAlbRFen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
            A4606AlbRHEn = localUtil.ctot( httpContext.cgiGet( edtAlbRHEn_Internalname)) ;
            n4606AlbRHEn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
            A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
            A971ProceNom = httpContext.cgiGet( edtProceNom_Internalname) ;
            n971ProceNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
            A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
            n841TrnNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
            cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
            cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
            A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
            A6180AlbrUniC = localUtil.ctond( httpContext.cgiGet( edtAlbrUniC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
            A6181AlbrPieC = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbrPieC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
            A8029AlbNumM = httpContext.cgiGet( edtAlbNumM_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
            A48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( edtAlbRFecUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
            cmbAlbREst.setName( cmbAlbREst.getInternalname() );
            cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
            A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            A1212TipEntNom = httpContext.cgiGet( edtTipEntNom_Internalname) ;
            n1212TipEntNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
            A1291AlbRDes = httpContext.cgiGet( edtAlbRDes_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
            A6463AlbRLote = httpContext.cgiGet( edtAlbRLote_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
            A50AlbRLoc = httpContext.cgiGet( edtAlbRLoc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
            cmbAlbRReo.setName( cmbAlbRReo.getInternalname() );
            cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
            A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
            A4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
            A4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
            A4922AlbPml = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
            A13241AlbRPh = localUtil.ctond( httpContext.cgiGet( edtAlbRPh_Internalname)) ;
            n13241AlbRPh = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13241AlbRPh", GXutil.ltrimstr( A13241AlbRPh, 6, 2));
            A13242AlbRRLong = localUtil.ctond( httpContext.cgiGet( edtAlbRRLong_Internalname)) ;
            n13242AlbRRLong = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13242AlbRRLong", GXutil.ltrimstr( A13242AlbRRLong, 6, 2));
            A13243AlbRRTrans = localUtil.ctond( httpContext.cgiGet( edtAlbRRTrans_Internalname)) ;
            n13243AlbRRTrans = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13243AlbRRTrans", GXutil.ltrimstr( A13243AlbRRTrans, 6, 2));
            A10758SumKgs = localUtil.ctond( httpContext.cgiGet( edtSumKgs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            A10759SumMts = localUtil.ctond( httpContext.cgiGet( edtSumMts_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            A10760SumPzs = (short)(localUtil.ctol( httpContext.cgiGet( edtSumPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TALBDET2");
            A13241AlbRPh = localUtil.ctond( httpContext.cgiGet( edtAlbRPh_Internalname)) ;
            n13241AlbRPh = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13241AlbRPh", GXutil.ltrimstr( A13241AlbRPh, 6, 2));
            forbiddenHiddens.add("AlbRPh", localUtil.format( A13241AlbRPh, "ZZ9.99"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            forbiddenHiddens.add("CliCod", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"));
            A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
            forbiddenHiddens.add("AlbREnt", GXutil.rtrim( localUtil.format( A46AlbREnt, "")));
            A5806AlbREnt2 = httpContext.cgiGet( edtAlbREnt2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
            forbiddenHiddens.add("AlbREnt2", GXutil.rtrim( localUtil.format( A5806AlbREnt2, "")));
            A49AlbRFen = localUtil.ctod( httpContext.cgiGet( edtAlbRFen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
            forbiddenHiddens.add("AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
            A4606AlbRHEn = localUtil.ctot( httpContext.cgiGet( edtAlbRHEn_Internalname)) ;
            n4606AlbRHEn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("AlbRHEn", localUtil.format( A4606AlbRHEn, "99/99/99 99:99"));
            A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
            forbiddenHiddens.add("AlbRef", GXutil.rtrim( localUtil.format( A45AlbRef, "")));
            A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
            forbiddenHiddens.add("AlbRefDsc", GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")));
            A1291AlbRDes = httpContext.cgiGet( edtAlbRDes_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
            forbiddenHiddens.add("AlbRDes", GXutil.rtrim( localUtil.format( A1291AlbRDes, "")));
            A50AlbRLoc = httpContext.cgiGet( edtAlbRLoc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
            forbiddenHiddens.add("AlbRLoc", GXutil.rtrim( localUtil.format( A50AlbRLoc, "")));
            A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
            forbiddenHiddens.add("AlbRReo", GXutil.rtrim( localUtil.format( A55AlbRReo, "@!")));
            A48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( edtAlbRFecUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
            forbiddenHiddens.add("AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
            A6180AlbrUniC = localUtil.ctond( httpContext.cgiGet( edtAlbrUniC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
            forbiddenHiddens.add("AlbrUniC", localUtil.format( A6180AlbrUniC, "ZZZZZ9.99"));
            A6181AlbrPieC = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbrPieC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
            forbiddenHiddens.add("AlbrPieC", localUtil.format( DecimalUtil.doubleToDec(A6181AlbrPieC), "ZZZZZ9"));
            A4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
            forbiddenHiddens.add("AlbRGrm2", localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9"));
            A4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
            forbiddenHiddens.add("AlbRAnc", localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9"));
            A4922AlbPml = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
            forbiddenHiddens.add("AlbPml", localUtil.format( DecimalUtil.doubleToDec(A4922AlbPml), "ZZZ9"));
            A6463AlbRLote = httpContext.cgiGet( edtAlbRLote_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
            forbiddenHiddens.add("AlbRLote", GXutil.rtrim( localUtil.format( A6463AlbRLote, "")));
            A13242AlbRRLong = localUtil.ctond( httpContext.cgiGet( edtAlbRRLong_Internalname)) ;
            n13242AlbRRLong = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13242AlbRRLong", GXutil.ltrimstr( A13242AlbRRLong, 6, 2));
            forbiddenHiddens.add("AlbRRLong", localUtil.format( A13242AlbRRLong, "ZZ9.99"));
            A13243AlbRRTrans = localUtil.ctond( httpContext.cgiGet( edtAlbRRTrans_Internalname)) ;
            n13243AlbRRTrans = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13243AlbRRTrans", GXutil.ltrimstr( A13243AlbRRTrans, 6, 2));
            forbiddenHiddens.add("AlbRRTrans", localUtil.format( A13243AlbRRTrans, "ZZ9.99"));
            A8029AlbNumM = httpContext.cgiGet( edtAlbNumM_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
            forbiddenHiddens.add("AlbNumM", GXutil.rtrim( localUtil.format( A8029AlbNumM, "")));
            forbiddenHiddens.add("AlbRPieReb", localUtil.format( DecimalUtil.doubleToDec(A53AlbRPieReb), "ZZZ9"));
            forbiddenHiddens.add("AlbRUniReb", localUtil.format( A59AlbRUniReb, "ZZZZZ9.99"));
            forbiddenHiddens.add("AlbRecSec", localUtil.format( DecimalUtil.doubleToDec(A7501AlbRecSec), "ZZ9"));
            forbiddenHiddens.add("AlbNumEti", localUtil.format( DecimalUtil.doubleToDec(A1222AlbNumEti), "ZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A44AlbRecCod != Z44AlbRecCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("talbdet2:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
                  sMode7 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode7 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound7 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1P10( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "ALBRECCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecCod_Internalname ;
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
                        e111P12 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121P12 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DODONUMERARPIEZAS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoDoNumerarPiezas' */
                        e131P12 ();
                        nKeyPressed = (byte)(3) ;
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
         e121P12 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1P17( ) ;
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
         disableAttributes1P17( ) ;
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

   public void confirm_1P10( )
   {
      beforeValidate1P17( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1P17( ) ;
         }
         else
         {
            checkExtendedTable1P17( ) ;
            closeExtendedTableCursors1P17( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode7 = Gx_mode ;
         confirm_1P1299( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode7 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1P1299( )
   {
      s10761AlbUltP = O10761AlbUltP ;
      n10761AlbUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
      s10760SumPzs = O10760SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      s10758SumKgs = O10758SumKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
      s10759SumMts = O10759SumMts ;
      httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
      s2147AlbDetKgmD = O2147AlbDetKgmD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      s2150AlbDetMtrD = O2150AlbDetMtrD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      s2153AlbDetPieU = O2153AlbDetPieU ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      s58AlbRUniEnt = O58AlbRUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      s60AlbRUniUti = O60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      s52AlbRPieEnt = O52AlbRPieEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      s54AlbRPieUti = O54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      s47AlbREst = O47AlbREst ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      nGXsfl_383_idx = 0 ;
      while ( nGXsfl_383_idx < nRC_GXsfl_383 )
      {
         readRow1P1299( ) ;
         if ( ( nRcdExists_299 != 0 ) || ( nIsMod_299 != 0 ) )
         {
            getKey1P1299( ) ;
            if ( ( nRcdExists_299 == 0 ) && ( nRcdDeleted_299 == 0 ) )
            {
               if ( RcdFound299 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1P1299( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1P1299( ) ;
                     closeExtendedTableCursors1P1299( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O10761AlbUltP = A10761AlbUltP ;
                     n10761AlbUltP = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
                     O10760SumPzs = A10760SumPzs ;
                     httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
                     O10758SumKgs = A10758SumKgs ;
                     httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
                     O10759SumMts = A10759SumMts ;
                     httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
                     O2147AlbDetKgmD = A2147AlbDetKgmD ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                     O2150AlbDetMtrD = A2150AlbDetMtrD ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                     O2153AlbDetPieU = A2153AlbDetPieU ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
                     O58AlbRUniEnt = A58AlbRUniEnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
                     O60AlbRUniUti = A60AlbRUniUti ;
                     httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                     O52AlbRPieEnt = A52AlbRPieEnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
                     O54AlbRPieUti = A54AlbRPieUti ;
                     httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                     O47AlbREst = A47AlbREst ;
                     httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                  }
               }
               else
               {
                  GXCCtl = "ALBRECPIE_" + sGXsfl_383_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbRecPie_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound299 != 0 )
               {
                  if ( nRcdDeleted_299 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1P1299( ) ;
                     load1P1299( ) ;
                     beforeValidate1P1299( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1P1299( ) ;
                        O10761AlbUltP = A10761AlbUltP ;
                        n10761AlbUltP = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
                        O10760SumPzs = A10760SumPzs ;
                        httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
                        O10758SumKgs = A10758SumKgs ;
                        httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
                        O10759SumMts = A10759SumMts ;
                        httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
                        O2147AlbDetKgmD = A2147AlbDetKgmD ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                        O2150AlbDetMtrD = A2150AlbDetMtrD ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                        O2153AlbDetPieU = A2153AlbDetPieU ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
                        O58AlbRUniEnt = A58AlbRUniEnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
                        O60AlbRUniUti = A60AlbRUniUti ;
                        httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                        O52AlbRPieEnt = A52AlbRPieEnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
                        O54AlbRPieUti = A54AlbRPieUti ;
                        httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                        O47AlbREst = A47AlbREst ;
                        httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_299 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1P1299( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1P1299( ) ;
                           closeExtendedTableCursors1P1299( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O10761AlbUltP = A10761AlbUltP ;
                           n10761AlbUltP = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
                           O10760SumPzs = A10760SumPzs ;
                           httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
                           O10758SumKgs = A10758SumKgs ;
                           httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
                           O10759SumMts = A10759SumMts ;
                           httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
                           O2147AlbDetKgmD = A2147AlbDetKgmD ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                           O2150AlbDetMtrD = A2150AlbDetMtrD ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                           O2153AlbDetPieU = A2153AlbDetPieU ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
                           O58AlbRUniEnt = A58AlbRUniEnt ;
                           httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
                           O60AlbRUniUti = A60AlbRUniUti ;
                           httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                           O52AlbRPieEnt = A52AlbRPieEnt ;
                           httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
                           O54AlbRPieUti = A54AlbRPieUti ;
                           httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                           O47AlbREst = A47AlbREst ;
                           httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_299 == 0 )
                  {
                     GXCCtl = "ALBRECPIE_" + sGXsfl_383_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecPie_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbRecPie_Internalname, GXutil.rtrim( A2159AlbRecPie)) ;
         httpContext.changePostValue( edtAlbRecAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtALRPIELOC_Internalname, GXutil.rtrim( A7408ALRPIELOC)) ;
         httpContext.changePostValue( edtAlbRecMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtrU_Internalname, GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgmU_Internalname, GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecObs_Internalname, GXutil.rtrim( A13693AlbRecObs)) ;
         httpContext.changePostValue( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_383_idx, GXutil.rtrim( Z2159AlbRecPie)) ;
         httpContext.changePostValue( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_383_idx, GXutil.rtrim( Z4795AlRPieCal)) ;
         httpContext.changePostValue( "ZT_"+"Z2154AlbRecAnh_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10762AlbPCont_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z10762AlbPCont, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2158AlbRecMtrU_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2156AlbRecKgmU_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8779Bod_Talla_"+sGXsfl_383_idx, GXutil.rtrim( Z8779Bod_Talla)) ;
         httpContext.changePostValue( "ZT_"+"Z8780Bod_Und_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z8780Bod_Und, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3730AlbRecCol_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z3730AlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3731AlbRecIdPz_"+sGXsfl_383_idx, GXutil.rtrim( Z3731AlbRecIdPz)) ;
         httpContext.changePostValue( "ZT_"+"Z3732AlbRecIdRc_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z3732AlbRecIdRc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4410AlbRecPal_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z4410AlbRecPal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10180AlRPieTelT_"+sGXsfl_383_idx, GXutil.rtrim( Z10180AlRPieTelT)) ;
         httpContext.changePostValue( "ZT_"+"Z10149AlRPieCon_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z10149AlRPieCon, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10181AlRPieOri_"+sGXsfl_383_idx, GXutil.rtrim( Z10181AlRPieOri)) ;
         httpContext.changePostValue( "ZT_"+"Z10182AlRPieDst_"+sGXsfl_383_idx, GXutil.rtrim( Z10182AlRPieDst)) ;
         httpContext.changePostValue( "ZT_"+"Z10183AlrPieKgmT_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z10183AlrPieKgmT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7408ALRPIELOC_"+sGXsfl_383_idx, GXutil.rtrim( Z7408ALRPIELOC)) ;
         httpContext.changePostValue( "T2155AlbRecKgm_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( O2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2157AlbRecMtr_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( O2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_299_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_299_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_299_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_299 != 0 )
         {
            httpContext.changePostValue( "ALBRECPIE_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECANH_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIELOC_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIELOC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTR_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGM_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTRU_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGMU_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECOBS_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O10761AlbUltP = s10761AlbUltP ;
      n10761AlbUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
      O10760SumPzs = s10760SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      O10758SumKgs = s10758SumKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
      O10759SumMts = s10759SumMts ;
      httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
      O2147AlbDetKgmD = s2147AlbDetKgmD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      O2150AlbDetMtrD = s2150AlbDetMtrD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      O2153AlbDetPieU = s2153AlbDetPieU ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      O58AlbRUniEnt = s58AlbRUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      O60AlbRUniUti = s60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      O52AlbRPieEnt = s52AlbRPieEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      O54AlbRPieUti = s54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O47AlbREst = s47AlbREst ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      /* Start of After( level) rules */
      /* Using cursor T01P17 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A2152AlbDetPie = T01P17_A2152AlbDetPie[0] ;
         A2149AlbDetMtr = T01P17_A2149AlbDetMtr[0] ;
         A2146AlbDetKgm = T01P17_A2146AlbDetKgm[0] ;
         A2151AlbDetMtrU = T01P17_A2151AlbDetMtrU[0] ;
         A2148AlbDetKgmU = T01P17_A2148AlbDetKgmU[0] ;
      }
      else
      {
         A2152AlbDetPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
         A10758SumKgs = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         A10760SumPzs = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      }
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2149AlbDetMtr)==0) )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2146AlbDetKgm)==0) )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2151AlbDetMtrU)==0) )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2148AlbDetKgmU)==0) )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( ! (0==A2152AlbDetPie) )
      {
         A52AlbRPieEnt = A2152AlbDetPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      }
      /* End of After( level) rules */
   }

   public void resetCaption1P10( )
   {
   }

   public void e111P12( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV29Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      talbdet2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Station", AV29Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char2, GXv_char3, GXv_char4) ;
      talbdet2_impl.this.A396EmprCod = GXv_char2[0] ;
      talbdet2_impl.this.AV7EmprNom = GXv_char3[0] ;
      talbdet2_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprNom", AV7EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV41FlagKgs ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KILOS", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV41FlagKgs = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41FlagKgs", GXutil.str( AV41FlagKgs, 1, 0));
      GXt_int5 = AV42FlagMts ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "METROS", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV42FlagMts = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42FlagMts", GXutil.str( AV42FlagMts, 1, 0));
      GXt_int5 = AV44FlagGraf ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRAFIC", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV44FlagGraf = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44FlagGraf", GXutil.str( AV44FlagGraf, 1, 0));
      GXt_int5 = AV48SumPza ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SUMPZA", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV48SumPza = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48SumPza", GXutil.str( AV48SumPza, 1, 0));
      GXt_int5 = AV52CalMKT ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CALMKT", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV52CalMKT = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52CalMKT", GXutil.str( AV52CalMKT, 1, 0));
      GXt_int5 = AV57Artextil ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV57Artextil = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Artextil", GXutil.str( AV57Artextil, 1, 0));
      GXt_int5 = (byte)(AV59f_NOTREC) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOTREC", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV59f_NOTREC = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59f_NOTREC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59f_NOTREC), 10, 0));
      GXt_int5 = AV61NoPzaR ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOPZRP", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV61NoPzaR = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61NoPzaR", GXutil.str( AV61NoPzaR, 1, 0));
      GXt_int5 = AV66Tintatex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTAT", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV66Tintatex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Tintatex", GXutil.str( AV66Tintatex, 1, 0));
      GXt_int5 = AV69SiArt ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIART", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV69SiArt = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69SiArt", GXutil.str( AV69SiArt, 1, 0));
      GXt_int5 = AV73Noctrlpz ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCTRLP", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV73Noctrlpz = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73Noctrlpz", GXutil.str( AV73Noctrlpz, 1, 0));
      GXt_int5 = AV74VerItm ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ITM000", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV74VerItm = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74VerItm", GXutil.str( AV74VerItm, 1, 0));
      GXt_int5 = AV79Enc20c ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENC20C", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV79Enc20c = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79Enc20c", GXutil.str( AV79Enc20c, 1, 0));
      GXt_int5 = AV80Velluts ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VELLUT", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV80Velluts = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Velluts", GXutil.str( AV80Velluts, 1, 0));
      GXt_int5 = AV85Colorsol ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COLORS", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV85Colorsol = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85Colorsol", GXutil.str( AV85Colorsol, 1, 0));
      GXt_int5 = AV88PesSim ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PESSIM", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV88PesSim = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88PesSim", GXutil.str( AV88PesSim, 1, 0));
      GXt_int5 = AV90Termilenio ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TERMIL", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV90Termilenio = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90Termilenio", GXutil.str( AV90Termilenio, 1, 0));
      GXt_int5 = AV91stamperia ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STAMPE", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV91stamperia = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91stamperia", GXutil.str( AV91stamperia, 1, 0));
      GXt_int5 = AV94Piolera ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PIOLER", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV94Piolera = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94Piolera", GXutil.str( AV94Piolera, 1, 0));
      GXt_int5 = AV95tintoriente ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ORIENT", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV95tintoriente = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95tintoriente", GXutil.str( AV95tintoriente, 1, 0));
      GXt_int5 = AV98Estampamos ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ESTAMP", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV98Estampamos = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98Estampamos", GXutil.str( AV98Estampamos, 1, 0));
      GXt_int5 = AV103biarprint ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BIARPR", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV103biarprint = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103biarprint", GXutil.str( AV103biarprint, 1, 0));
      GXt_int5 = AV96UbicaL ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "UBICAL", ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV96UbicaL = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96UbicaL", GXutil.str( AV96UbicaL, 1, 0));
      GXt_int7 = AV99ValorUbica ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "UBICAL", ""), GXv_int8) ;
      talbdet2_impl.this.GXt_int7 = GXv_int8[0] ;
      AV99ValorUbica = (byte)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99ValorUbica", GXutil.str( AV99ValorUbica, 1, 0));
      GXt_char1 = AV29Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      talbdet2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV29Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Station", AV29Station);
      GXv_char4[0] = AV104EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char4, GXv_char3, GXv_char2) ;
      talbdet2_impl.this.AV104EmprCod = GXv_char4[0] ;
      talbdet2_impl.this.AV7EmprNom = GXv_char3[0] ;
      talbdet2_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104EmprCod", AV104EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV104EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprNom", AV7EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext9[0] = AV106WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV106WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV107TrnContext.fromxml(AV108WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV107TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV125Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV126GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV126GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126GXV1), 8, 0));
         while ( AV126GXV1 <= AV107TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV113TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV107TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV126GXV1));
            if ( GXutil.strcmp(AV113TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CliCod") == 0 )
            {
               AV109Insert_CliCod = (int)(GXutil.lval( AV113TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV109Insert_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109Insert_CliCod), 6, 0));
            }
            else if ( GXutil.strcmp(AV113TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ProceCod") == 0 )
            {
               AV110Insert_ProceCod = (short)(GXutil.lval( AV113TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV110Insert_ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110Insert_ProceCod), 4, 0));
            }
            else if ( GXutil.strcmp(AV113TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV111Insert_TrnCod = (short)(GXutil.lval( AV113TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV111Insert_TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111Insert_TrnCod), 4, 0));
            }
            else if ( GXutil.strcmp(AV113TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TipEntCod") == 0 )
            {
               AV112Insert_TipEntCod = (short)(GXutil.lval( AV113TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV112Insert_TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112Insert_TipEntCod), 4, 0));
            }
            AV126GXV1 = (int)(AV126GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126GXV1), 8, 0));
         }
      }
   }

   public void e121P12( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV107TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.talbdet2ww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void e131P12( )
   {
      /* 'DoDoNumerarPiezas' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.webwnumpz2", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A56AlbRUni))}, new String[] {"EmprCod","AlbRecCod","AlbrUni"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divAlbrent_cell_Class = "DataContentCell DscTop" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbrent_cell_Internalname, "Class", divAlbrent_cell_Class, true);
      divAlbrent2_cell_Class = "DataContentCell DscTop" ;
      httpContext.ajax_rsp_assign_prop("", false, divAlbrent2_cell_Internalname, "Class", divAlbrent2_cell_Class, true);
   }

   public void zm1P17( int GX_JID )
   {
      if ( ( GX_JID == 96 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z58AlbRUniEnt = T01P19_A58AlbRUniEnt[0] ;
            Z60AlbRUniUti = T01P19_A60AlbRUniUti[0] ;
            Z52AlbRPieEnt = T01P19_A52AlbRPieEnt[0] ;
            Z54AlbRPieUti = T01P19_A54AlbRPieUti[0] ;
            Z47AlbREst = T01P19_A47AlbREst[0] ;
            Z46AlbREnt = T01P19_A46AlbREnt[0] ;
            Z5806AlbREnt2 = T01P19_A5806AlbREnt2[0] ;
            Z49AlbRFen = T01P19_A49AlbRFen[0] ;
            Z4606AlbRHEn = T01P19_A4606AlbRHEn[0] ;
            Z45AlbRef = T01P19_A45AlbRef[0] ;
            Z3613AlbRefDsc = T01P19_A3613AlbRefDsc[0] ;
            Z1291AlbRDes = T01P19_A1291AlbRDes[0] ;
            Z56AlbRUni = T01P19_A56AlbRUni[0] ;
            Z50AlbRLoc = T01P19_A50AlbRLoc[0] ;
            Z55AlbRReo = T01P19_A55AlbRReo[0] ;
            Z48AlbRFecUlt = T01P19_A48AlbRFecUlt[0] ;
            Z6180AlbrUniC = T01P19_A6180AlbrUniC[0] ;
            Z6181AlbrPieC = T01P19_A6181AlbrPieC[0] ;
            Z4920AlbRGrm2 = T01P19_A4920AlbRGrm2[0] ;
            Z4921AlbRAnc = T01P19_A4921AlbRAnc[0] ;
            Z4922AlbPml = T01P19_A4922AlbPml[0] ;
            Z6463AlbRLote = T01P19_A6463AlbRLote[0] ;
            Z13241AlbRPh = T01P19_A13241AlbRPh[0] ;
            Z13242AlbRRLong = T01P19_A13242AlbRRLong[0] ;
            Z13243AlbRRTrans = T01P19_A13243AlbRRTrans[0] ;
            Z8029AlbNumM = T01P19_A8029AlbNumM[0] ;
            Z53AlbRPieReb = T01P19_A53AlbRPieReb[0] ;
            Z59AlbRUniReb = T01P19_A59AlbRUniReb[0] ;
            Z10761AlbUltP = T01P19_A10761AlbUltP[0] ;
            Z7501AlbRecSec = T01P19_A7501AlbRecSec[0] ;
            Z1222AlbNumEti = T01P19_A1222AlbNumEti[0] ;
            Z252CliCod = T01P19_A252CliCod[0] ;
            Z840TrnCod = T01P19_A840TrnCod[0] ;
            Z970ProceCod = T01P19_A970ProceCod[0] ;
            Z1211TipEntCod = T01P19_A1211TipEntCod[0] ;
         }
         else
         {
            Z58AlbRUniEnt = A58AlbRUniEnt ;
            Z60AlbRUniUti = A60AlbRUniUti ;
            Z52AlbRPieEnt = A52AlbRPieEnt ;
            Z54AlbRPieUti = A54AlbRPieUti ;
            Z47AlbREst = A47AlbREst ;
            Z46AlbREnt = A46AlbREnt ;
            Z5806AlbREnt2 = A5806AlbREnt2 ;
            Z49AlbRFen = A49AlbRFen ;
            Z4606AlbRHEn = A4606AlbRHEn ;
            Z45AlbRef = A45AlbRef ;
            Z3613AlbRefDsc = A3613AlbRefDsc ;
            Z1291AlbRDes = A1291AlbRDes ;
            Z56AlbRUni = A56AlbRUni ;
            Z50AlbRLoc = A50AlbRLoc ;
            Z55AlbRReo = A55AlbRReo ;
            Z48AlbRFecUlt = A48AlbRFecUlt ;
            Z6180AlbrUniC = A6180AlbrUniC ;
            Z6181AlbrPieC = A6181AlbrPieC ;
            Z4920AlbRGrm2 = A4920AlbRGrm2 ;
            Z4921AlbRAnc = A4921AlbRAnc ;
            Z4922AlbPml = A4922AlbPml ;
            Z6463AlbRLote = A6463AlbRLote ;
            Z13241AlbRPh = A13241AlbRPh ;
            Z13242AlbRRLong = A13242AlbRRLong ;
            Z13243AlbRRTrans = A13243AlbRRTrans ;
            Z8029AlbNumM = A8029AlbNumM ;
            Z53AlbRPieReb = A53AlbRPieReb ;
            Z59AlbRUniReb = A59AlbRUniReb ;
            Z10761AlbUltP = A10761AlbUltP ;
            Z7501AlbRecSec = A7501AlbRecSec ;
            Z1222AlbNumEti = A1222AlbNumEti ;
            Z252CliCod = A252CliCod ;
            Z840TrnCod = A840TrnCod ;
            Z970ProceCod = A970ProceCod ;
            Z1211TipEntCod = A1211TipEntCod ;
         }
      }
      if ( GX_JID == -96 )
      {
         Z44AlbRecCod = A44AlbRecCod ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z47AlbREst = A47AlbREst ;
         Z46AlbREnt = A46AlbREnt ;
         Z5806AlbREnt2 = A5806AlbREnt2 ;
         Z49AlbRFen = A49AlbRFen ;
         Z4606AlbRHEn = A4606AlbRHEn ;
         Z45AlbRef = A45AlbRef ;
         Z3613AlbRefDsc = A3613AlbRefDsc ;
         Z1291AlbRDes = A1291AlbRDes ;
         Z56AlbRUni = A56AlbRUni ;
         Z50AlbRLoc = A50AlbRLoc ;
         Z55AlbRReo = A55AlbRReo ;
         Z48AlbRFecUlt = A48AlbRFecUlt ;
         Z6180AlbrUniC = A6180AlbrUniC ;
         Z6181AlbrPieC = A6181AlbrPieC ;
         Z4920AlbRGrm2 = A4920AlbRGrm2 ;
         Z4921AlbRAnc = A4921AlbRAnc ;
         Z4922AlbPml = A4922AlbPml ;
         Z6463AlbRLote = A6463AlbRLote ;
         Z13241AlbRPh = A13241AlbRPh ;
         Z13242AlbRRLong = A13242AlbRRLong ;
         Z13243AlbRRTrans = A13243AlbRRTrans ;
         Z8029AlbNumM = A8029AlbNumM ;
         Z53AlbRPieReb = A53AlbRPieReb ;
         Z59AlbRUniReb = A59AlbRUniReb ;
         Z10761AlbUltP = A10761AlbUltP ;
         Z7501AlbRecSec = A7501AlbRecSec ;
         Z1222AlbNumEti = A1222AlbNumEti ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z840TrnCod = A840TrnCod ;
         Z970ProceCod = A970ProceCod ;
         Z1211TipEntCod = A1211TipEntCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z841TrnNom = A841TrnNom ;
         Z971ProceNom = A971ProceNom ;
         Z1212TipEntNom = A1212TipEntNom ;
         Z2152AlbDetPie = A2152AlbDetPie ;
         Z2149AlbDetMtr = A2149AlbDetMtr ;
         Z2146AlbDetKgm = A2146AlbDetKgm ;
         Z2151AlbDetMtrU = A2151AlbDetMtrU ;
         Z2148AlbDetKgmU = A2148AlbDetKgmU ;
         Z10758SumKgs = A10758SumKgs ;
         Z10759SumMts = A10759SumMts ;
         Z10760SumPzs = A10760SumPzs ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbRPh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPh_Enabled), 5, 0), true);
      edtAlbRRLong_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRRLong_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRRLong_Enabled), 5, 0), true);
      edtAlbRRTrans_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRRTrans_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRRTrans_Enabled), 5, 0), true);
      edtAlbRGrm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRGrm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRGrm2_Enabled), 5, 0), true);
      edtAlbRAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRAnc_Enabled), 5, 0), true);
      edtAlbPml_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPml_Enabled), 5, 0), true);
      edtAlbRLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      cmbAlbRReo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      edtTipEntNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntNom_Enabled), 5, 0), true);
      edtAlbRDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRDes_Enabled), 5, 0), true);
      edtAlbRLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbrUniC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrUniC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrUniC_Enabled), 5, 0), true);
      edtAlbrPieC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrPieC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrPieC_Enabled), 5, 0), true);
      edtAlbNumM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumM_Enabled), 5, 0), true);
      edtProceNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceNom_Enabled), 5, 0), true);
      edtTrnNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      edtAlbRefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), true);
      edtAlbREnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Enabled), 5, 0), true);
      edtAlbREnt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Enabled), 5, 0), true);
      edtAlbRFen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      edtAlbRHEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRHEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRHEn_Enabled), 5, 0), true);
      AV125Pgmname = "TALBDET2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV125Pgmname", AV125Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbRPh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPh_Enabled), 5, 0), true);
      edtAlbRRLong_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRRLong_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRRLong_Enabled), 5, 0), true);
      edtAlbRRTrans_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRRTrans_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRRTrans_Enabled), 5, 0), true);
      edtAlbRGrm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRGrm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRGrm2_Enabled), 5, 0), true);
      edtAlbRAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRAnc_Enabled), 5, 0), true);
      edtAlbPml_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPml_Enabled), 5, 0), true);
      edtAlbRLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      cmbAlbRReo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      edtTipEntNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntNom_Enabled), 5, 0), true);
      edtAlbRDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRDes_Enabled), 5, 0), true);
      edtAlbRLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbrUniC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrUniC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrUniC_Enabled), 5, 0), true);
      edtAlbrPieC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrPieC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrPieC_Enabled), 5, 0), true);
      edtAlbNumM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumM_Enabled), 5, 0), true);
      edtProceNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceNom_Enabled), 5, 0), true);
      edtTrnNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      edtAlbRefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), true);
      edtAlbREnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Enabled), 5, 0), true);
      edtAlbREnt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Enabled), 5, 0), true);
      edtAlbRFen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      edtAlbRHEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRHEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRHEn_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV104EmprCod)==0) )
      {
         A396EmprCod = AV104EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01P110 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01P110_A407EmprNom[0] ;
      n407EmprNom = T01P110_n407EmprNom[0] ;
      pr_default.close(6);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      edtAlbREnt_Visible = ((GXt_int5==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Visible), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 0 ) ) )
      {
         divAlbrent_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbrent_cell_Internalname, "Class", divAlbrent_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
         talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 0 )
         {
            divAlbrent_cell_Class = httpContext.getMessage( "DataContentCell DscTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbrent_cell_Internalname, "Class", divAlbrent_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      edtAlbREnt2_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Visible), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divAlbrent2_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divAlbrent2_cell_Internalname, "Class", divAlbrent2_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
         talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divAlbrent2_cell_Class = httpContext.getMessage( "DataContentCell DscTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divAlbrent2_cell_Internalname, "Class", divAlbrent2_cell_Class, true);
         }
      }
      if ( ! (0==AV105AlbRecCod) )
      {
         A44AlbRecCod = AV105AlbRecCod ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      if ( ! (0==AV105AlbRecCod) )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRecCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV105AlbRecCod) )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV112Insert_TipEntCod) )
      {
         A1211TipEntCod = AV112Insert_TipEntCod ;
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV111Insert_TrnCod) )
      {
         A840TrnCod = AV111Insert_TrnCod ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV110Insert_ProceCod) )
      {
         A970ProceCod = AV110Insert_ProceCod ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV109Insert_CliCod) )
      {
         A252CliCod = AV109Insert_CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01P17 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(3) != 101) )
         {
            A2152AlbDetPie = T01P17_A2152AlbDetPie[0] ;
            A2149AlbDetMtr = T01P17_A2149AlbDetMtr[0] ;
            A2146AlbDetKgm = T01P17_A2146AlbDetKgm[0] ;
            A2151AlbDetMtrU = T01P17_A2151AlbDetMtrU[0] ;
            A2148AlbDetKgmU = T01P17_A2148AlbDetKgmU[0] ;
            A10758SumKgs = T01P17_A10758SumKgs[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            A10759SumMts = T01P17_A10759SumMts[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            A10760SumPzs = T01P17_A10760SumPzs[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         }
         else
         {
            A2152AlbDetPie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
            A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
            A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
            A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
            A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
            A10758SumKgs = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            A10759SumMts = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            A10760SumPzs = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         }
         O10758SumKgs = A10758SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         O10759SumMts = A10759SumMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         O10760SumPzs = A10760SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         pr_default.close(3);
         if ( ! (0==A2152AlbDetPie) )
         {
            A52AlbRPieEnt = A2152AlbDetPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         }
         A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         /* Using cursor T01P114 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
         A1212TipEntNom = T01P114_A1212TipEntNom[0] ;
         n1212TipEntNom = T01P114_n1212TipEntNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
         pr_default.close(10);
         /* Using cursor T01P112 */
         pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01P112_A841TrnNom[0] ;
         n841TrnNom = T01P112_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         pr_default.close(8);
         /* Using cursor T01P113 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         A971ProceNom = T01P113_A971ProceNom[0] ;
         n971ProceNom = T01P113_n971ProceNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         pr_default.close(9);
         /* Using cursor T01P111 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01P111_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(7);
      }
   }

   public void load1P17( )
   {
      /* Using cursor T01P116 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A58AlbRUniEnt = T01P116_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A60AlbRUniUti = T01P116_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A52AlbRPieEnt = T01P116_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A54AlbRPieUti = T01P116_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A47AlbREst = T01P116_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A407EmprNom = T01P116_A407EmprNom[0] ;
         n407EmprNom = T01P116_n407EmprNom[0] ;
         A46AlbREnt = T01P116_A46AlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A5806AlbREnt2 = T01P116_A5806AlbREnt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         A49AlbRFen = T01P116_A49AlbRFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         A4606AlbRHEn = T01P116_A4606AlbRHEn[0] ;
         n4606AlbRHEn = T01P116_n4606AlbRHEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A279CliNom = T01P116_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A45AlbRef = T01P116_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A3613AlbRefDsc = T01P116_A3613AlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A971ProceNom = T01P116_A971ProceNom[0] ;
         n971ProceNom = T01P116_n971ProceNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         A841TrnNom = T01P116_A841TrnNom[0] ;
         n841TrnNom = T01P116_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A1212TipEntNom = T01P116_A1212TipEntNom[0] ;
         n1212TipEntNom = T01P116_n1212TipEntNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
         A1291AlbRDes = T01P116_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A56AlbRUni = T01P116_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A50AlbRLoc = T01P116_A50AlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         A55AlbRReo = T01P116_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A48AlbRFecUlt = T01P116_A48AlbRFecUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         A6180AlbrUniC = T01P116_A6180AlbrUniC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
         A6181AlbrPieC = T01P116_A6181AlbrPieC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
         A4920AlbRGrm2 = T01P116_A4920AlbRGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = T01P116_A4921AlbRAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A4922AlbPml = T01P116_A4922AlbPml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
         A6463AlbRLote = T01P116_A6463AlbRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A13241AlbRPh = T01P116_A13241AlbRPh[0] ;
         n13241AlbRPh = T01P116_n13241AlbRPh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13241AlbRPh", GXutil.ltrimstr( A13241AlbRPh, 6, 2));
         A13242AlbRRLong = T01P116_A13242AlbRRLong[0] ;
         n13242AlbRRLong = T01P116_n13242AlbRRLong[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13242AlbRRLong", GXutil.ltrimstr( A13242AlbRRLong, 6, 2));
         A13243AlbRRTrans = T01P116_A13243AlbRRTrans[0] ;
         n13243AlbRRTrans = T01P116_n13243AlbRRTrans[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13243AlbRRTrans", GXutil.ltrimstr( A13243AlbRRTrans, 6, 2));
         A8029AlbNumM = T01P116_A8029AlbNumM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
         A53AlbRPieReb = T01P116_A53AlbRPieReb[0] ;
         A59AlbRUniReb = T01P116_A59AlbRUniReb[0] ;
         A10761AlbUltP = T01P116_A10761AlbUltP[0] ;
         n10761AlbUltP = T01P116_n10761AlbUltP[0] ;
         A7501AlbRecSec = T01P116_A7501AlbRecSec[0] ;
         n7501AlbRecSec = T01P116_n7501AlbRecSec[0] ;
         A1222AlbNumEti = T01P116_A1222AlbNumEti[0] ;
         A252CliCod = T01P116_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01P116_A840TrnCod[0] ;
         n840TrnCod = T01P116_n840TrnCod[0] ;
         A970ProceCod = T01P116_A970ProceCod[0] ;
         n970ProceCod = T01P116_n970ProceCod[0] ;
         A1211TipEntCod = T01P116_A1211TipEntCod[0] ;
         n1211TipEntCod = T01P116_n1211TipEntCod[0] ;
         A2152AlbDetPie = T01P116_A2152AlbDetPie[0] ;
         A2149AlbDetMtr = T01P116_A2149AlbDetMtr[0] ;
         A2146AlbDetKgm = T01P116_A2146AlbDetKgm[0] ;
         A2151AlbDetMtrU = T01P116_A2151AlbDetMtrU[0] ;
         A2148AlbDetKgmU = T01P116_A2148AlbDetKgmU[0] ;
         A10758SumKgs = T01P116_A10758SumKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = T01P116_A10759SumMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         A10760SumPzs = T01P116_A10760SumPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         zm1P17( -96) ;
      }
      pr_default.close(11);
      onLoadActions1P17( ) ;
   }

   public void onLoadActions1P17( )
   {
      O10760SumPzs = A10760SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      O10758SumKgs = A10758SumKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
      O10759SumMts = A10759SumMts ;
      httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
      if ( ! (0==A2152AlbDetPie) )
      {
         A52AlbRPieEnt = A2152AlbDetPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2149AlbDetMtr)==0) )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2146AlbDetKgm)==0) )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      if ( ( A2147AlbDetKgmD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
      {
         A47AlbREst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( ( A2150AlbDetMtrD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( ( A2147AlbDetKgmD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
            {
               A47AlbREst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
            else
            {
               if ( ( A2150AlbDetMtrD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
               {
                  A47AlbREst = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               }
            }
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2151AlbDetMtrU)==0) )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2148AlbDetKgmU)==0) )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      if ( ! (0==A2153AlbDetPieU) )
      {
         A54AlbRPieUti = A2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
   }

   public void checkExtendedTable1P17( )
   {
      nIsDirty_7 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01P111 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01P111_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(7);
      /* Using cursor T01P112 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
         }
      }
      A841TrnNom = T01P112_A841TrnNom[0] ;
      n841TrnNom = T01P112_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      pr_default.close(8);
      /* Using cursor T01P113 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
         }
      }
      A971ProceNom = T01P113_A971ProceNom[0] ;
      n971ProceNom = T01P113_n971ProceNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      pr_default.close(9);
      /* Using cursor T01P114 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
         }
      }
      A1212TipEntNom = T01P114_A1212TipEntNom[0] ;
      n1212TipEntNom = T01P114_n1212TipEntNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
      pr_default.close(10);
      /* Using cursor T01P17 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A2152AlbDetPie = T01P17_A2152AlbDetPie[0] ;
         A2149AlbDetMtr = T01P17_A2149AlbDetMtr[0] ;
         A2146AlbDetKgm = T01P17_A2146AlbDetKgm[0] ;
         A2151AlbDetMtrU = T01P17_A2151AlbDetMtrU[0] ;
         A2148AlbDetKgmU = T01P17_A2148AlbDetKgmU[0] ;
         A10758SumKgs = T01P17_A10758SumKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = T01P17_A10759SumMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         A10760SumPzs = T01P17_A10760SumPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      }
      else
      {
         nIsDirty_7 = (short)(1) ;
         A2152AlbDetPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         nIsDirty_7 = (short)(1) ;
         A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         nIsDirty_7 = (short)(1) ;
         A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         nIsDirty_7 = (short)(1) ;
         A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         nIsDirty_7 = (short)(1) ;
         A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
         nIsDirty_7 = (short)(1) ;
         A10758SumKgs = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         nIsDirty_7 = (short)(1) ;
         A10759SumMts = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         nIsDirty_7 = (short)(1) ;
         A10760SumPzs = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      }
      pr_default.close(3);
      if ( ! (0==A2152AlbDetPie) )
      {
         nIsDirty_7 = (short)(1) ;
         A52AlbRPieEnt = A2152AlbDetPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2149AlbDetMtr)==0) )
      {
         nIsDirty_7 = (short)(1) ;
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2146AlbDetKgm)==0) )
         {
            nIsDirty_7 = (short)(1) ;
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      nIsDirty_7 = (short)(1) ;
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      nIsDirty_7 = (short)(1) ;
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      if ( ( A2147AlbDetKgmD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
      {
         nIsDirty_7 = (short)(1) ;
         A47AlbREst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( ( A2150AlbDetMtrD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
         {
            nIsDirty_7 = (short)(1) ;
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( ( A2147AlbDetKgmD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
            {
               nIsDirty_7 = (short)(1) ;
               A47AlbREst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
            else
            {
               if ( ( A2150AlbDetMtrD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
               {
                  nIsDirty_7 = (short)(1) ;
                  A47AlbREst = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               }
            }
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2151AlbDetMtrU)==0) )
      {
         nIsDirty_7 = (short)(1) ;
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2148AlbDetKgmU)==0) )
         {
            nIsDirty_7 = (short)(1) ;
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_7 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            nIsDirty_7 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            nIsDirty_7 = (short)(1) ;
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            nIsDirty_7 = (short)(1) ;
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      if ( ! (0==A2153AlbDetPieU) )
      {
         nIsDirty_7 = (short)(1) ;
         A54AlbRPieUti = A2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      nIsDirty_7 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
   }

   public void closeExtendedTableCursors1P17( )
   {
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_98( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01P117 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01P117_A279CliNom[0] ;
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

   public void gxload_99( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01P118 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
         }
      }
      A841TrnNom = T01P118_A841TrnNom[0] ;
      n841TrnNom = T01P118_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_100( String A396EmprCod ,
                           short A970ProceCod )
   {
      /* Using cursor T01P119 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
         }
      }
      A971ProceNom = T01P119_A971ProceNom[0] ;
      n971ProceNom = T01P119_n971ProceNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A971ProceNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_101( String A396EmprCod ,
                           short A1211TipEntCod )
   {
      /* Using cursor T01P120 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
         }
      }
      A1212TipEntNom = T01P120_A1212TipEntNom[0] ;
      n1212TipEntNom = T01P120_n1212TipEntNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1212TipEntNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_102( String A396EmprCod ,
                           int A44AlbRecCod )
   {
      /* Using cursor T01P122 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         A2152AlbDetPie = T01P122_A2152AlbDetPie[0] ;
         A2149AlbDetMtr = T01P122_A2149AlbDetMtr[0] ;
         A2146AlbDetKgm = T01P122_A2146AlbDetKgm[0] ;
         A2151AlbDetMtrU = T01P122_A2151AlbDetMtrU[0] ;
         A2148AlbDetKgmU = T01P122_A2148AlbDetKgmU[0] ;
         A10758SumKgs = T01P122_A10758SumKgs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = T01P122_A10759SumMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         A10760SumPzs = T01P122_A10760SumPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      }
      else
      {
         A2152AlbDetPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
         A10758SumKgs = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         A10760SumPzs = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2152AlbDetPie, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2149AlbDetMtr, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2146AlbDetKgm, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2151AlbDetMtrU, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2148AlbDetKgmU, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10758SumKgs, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10759SumMts, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10760SumPzs, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void getKey1P17( )
   {
      /* Using cursor T01P123 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
      else
      {
         RcdFound7 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01P19 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01P19_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1P17( 96) ;
         RcdFound7 = (short)(1) ;
         A44AlbRecCod = T01P19_A44AlbRecCod[0] ;
         n44AlbRecCod = T01P19_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A58AlbRUniEnt = T01P19_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A60AlbRUniUti = T01P19_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A52AlbRPieEnt = T01P19_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A54AlbRPieUti = T01P19_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A47AlbREst = T01P19_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A46AlbREnt = T01P19_A46AlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A5806AlbREnt2 = T01P19_A5806AlbREnt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         A49AlbRFen = T01P19_A49AlbRFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         A4606AlbRHEn = T01P19_A4606AlbRHEn[0] ;
         n4606AlbRHEn = T01P19_n4606AlbRHEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A45AlbRef = T01P19_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A3613AlbRefDsc = T01P19_A3613AlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A1291AlbRDes = T01P19_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A56AlbRUni = T01P19_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A50AlbRLoc = T01P19_A50AlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         A55AlbRReo = T01P19_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A48AlbRFecUlt = T01P19_A48AlbRFecUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         A6180AlbrUniC = T01P19_A6180AlbrUniC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
         A6181AlbrPieC = T01P19_A6181AlbrPieC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
         A4920AlbRGrm2 = T01P19_A4920AlbRGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = T01P19_A4921AlbRAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A4922AlbPml = T01P19_A4922AlbPml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
         A6463AlbRLote = T01P19_A6463AlbRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A13241AlbRPh = T01P19_A13241AlbRPh[0] ;
         n13241AlbRPh = T01P19_n13241AlbRPh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13241AlbRPh", GXutil.ltrimstr( A13241AlbRPh, 6, 2));
         A13242AlbRRLong = T01P19_A13242AlbRRLong[0] ;
         n13242AlbRRLong = T01P19_n13242AlbRRLong[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13242AlbRRLong", GXutil.ltrimstr( A13242AlbRRLong, 6, 2));
         A13243AlbRRTrans = T01P19_A13243AlbRRTrans[0] ;
         n13243AlbRRTrans = T01P19_n13243AlbRRTrans[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13243AlbRRTrans", GXutil.ltrimstr( A13243AlbRRTrans, 6, 2));
         A8029AlbNumM = T01P19_A8029AlbNumM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
         A53AlbRPieReb = T01P19_A53AlbRPieReb[0] ;
         A59AlbRUniReb = T01P19_A59AlbRUniReb[0] ;
         A10761AlbUltP = T01P19_A10761AlbUltP[0] ;
         n10761AlbUltP = T01P19_n10761AlbUltP[0] ;
         A7501AlbRecSec = T01P19_A7501AlbRecSec[0] ;
         n7501AlbRecSec = T01P19_n7501AlbRecSec[0] ;
         A1222AlbNumEti = T01P19_A1222AlbNumEti[0] ;
         A252CliCod = T01P19_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01P19_A840TrnCod[0] ;
         n840TrnCod = T01P19_n840TrnCod[0] ;
         A970ProceCod = T01P19_A970ProceCod[0] ;
         n970ProceCod = T01P19_n970ProceCod[0] ;
         A1211TipEntCod = T01P19_A1211TipEntCod[0] ;
         n1211TipEntCod = T01P19_n1211TipEntCod[0] ;
         O10761AlbUltP = A10761AlbUltP ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1P17( ) ;
         if ( AnyError == 1 )
         {
            RcdFound7 = (short)(0) ;
            initializeNonKey1P17( ) ;
         }
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound7 = (short)(0) ;
         initializeNonKey1P17( ) ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1P17( ) ;
      if ( RcdFound7 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound7 = (short)(0) ;
      /* Using cursor T01P124 */
      pr_default.execute(18, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A396EmprCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( T01P124_A44AlbRecCod[0] < A44AlbRecCod ) ) && ( GXutil.strcmp(T01P124_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( T01P124_A44AlbRecCod[0] > A44AlbRecCod ) ) && ( GXutil.strcmp(T01P124_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A44AlbRecCod = T01P124_A44AlbRecCod[0] ;
            n44AlbRecCod = T01P124_n44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void move_previous( )
   {
      RcdFound7 = (short)(0) ;
      /* Using cursor T01P125 */
      pr_default.execute(19, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A396EmprCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         while ( (pr_default.getStatus(19) != 101) && ( ( T01P125_A44AlbRecCod[0] > A44AlbRecCod ) ) && ( GXutil.strcmp(T01P125_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(19);
         }
         if ( (pr_default.getStatus(19) != 101) && ( ( T01P125_A44AlbRecCod[0] < A44AlbRecCod ) ) && ( GXutil.strcmp(T01P125_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A44AlbRecCod = T01P125_A44AlbRecCod[0] ;
            n44AlbRecCod = T01P125_n44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(19);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1P17( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A10761AlbUltP = O10761AlbUltP ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         A10760SumPzs = O10760SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         A10758SumKgs = O10758SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = O10759SumMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         A2147AlbDetKgmD = O2147AlbDetKgmD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         A2150AlbDetMtrD = O2150AlbDetMtrD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         A2153AlbDetPieU = O2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         A58AlbRUniEnt = O58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A60AlbRUniUti = O60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A52AlbRPieEnt = O52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A54AlbRPieUti = O54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A47AlbREst = O47AlbREst ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1P17( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound7 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               A44AlbRecCod = Z44AlbRecCod ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ALBRECCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A10761AlbUltP = O10761AlbUltP ;
               n10761AlbUltP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
               A10760SumPzs = O10760SumPzs ;
               httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
               A10758SumKgs = O10758SumKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
               A10759SumMts = O10759SumMts ;
               httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
               A2147AlbDetKgmD = O2147AlbDetKgmD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
               A2150AlbDetMtrD = O2150AlbDetMtrD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
               A2153AlbDetPieU = O2153AlbDetPieU ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
               A58AlbRUniEnt = O58AlbRUniEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A52AlbRPieEnt = O52AlbRPieEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               A47AlbREst = O47AlbREst ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A10761AlbUltP = O10761AlbUltP ;
               n10761AlbUltP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
               A10760SumPzs = O10760SumPzs ;
               httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
               A10758SumKgs = O10758SumKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
               A10759SumMts = O10759SumMts ;
               httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
               A2147AlbDetKgmD = O2147AlbDetKgmD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
               A2150AlbDetMtrD = O2150AlbDetMtrD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
               A2153AlbDetPieU = O2153AlbDetPieU ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
               A58AlbRUniEnt = O58AlbRUniEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A52AlbRPieEnt = O52AlbRPieEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               A47AlbREst = O47AlbREst ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               update1P17( ) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               /* Insert record */
               A10761AlbUltP = O10761AlbUltP ;
               n10761AlbUltP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
               A10760SumPzs = O10760SumPzs ;
               httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
               A10758SumKgs = O10758SumKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
               A10759SumMts = O10759SumMts ;
               httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
               A2147AlbDetKgmD = O2147AlbDetKgmD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
               A2150AlbDetMtrD = O2150AlbDetMtrD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
               A2153AlbDetPieU = O2153AlbDetPieU ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
               A58AlbRUniEnt = O58AlbRUniEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A52AlbRPieEnt = O52AlbRPieEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               A47AlbREst = O47AlbREst ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1P17( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ALBRECCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbRecCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A10761AlbUltP = O10761AlbUltP ;
                  n10761AlbUltP = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
                  A10760SumPzs = O10760SumPzs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
                  A10758SumKgs = O10758SumKgs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
                  A10759SumMts = O10759SumMts ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
                  A2147AlbDetKgmD = O2147AlbDetKgmD ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                  A2150AlbDetMtrD = O2150AlbDetMtrD ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                  A2153AlbDetPieU = O2153AlbDetPieU ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
                  A58AlbRUniEnt = O58AlbRUniEnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
                  A60AlbRUniUti = O60AlbRUniUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                  A52AlbRPieEnt = O52AlbRPieEnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
                  A54AlbRPieUti = O54AlbRPieUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                  A47AlbREst = O47AlbREst ;
                  httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                  GX_FocusControl = edtAlbRecCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1P17( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
      {
         A44AlbRecCod = Z44AlbRecCod ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A10761AlbUltP = O10761AlbUltP ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         A10760SumPzs = O10760SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         A10758SumKgs = O10758SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = O10759SumMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         A2147AlbDetKgmD = O2147AlbDetKgmD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         A2150AlbDetMtrD = O2150AlbDetMtrD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         A2153AlbDetPieU = O2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         A58AlbRUniEnt = O58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A60AlbRUniUti = O60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A52AlbRPieEnt = O52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A54AlbRPieUti = O54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A47AlbREst = O47AlbREst ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1P17( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01P18 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01P18_A58AlbRUniEnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z60AlbRUniUti, T01P18_A60AlbRUniUti[0]) != 0 ) || ( Z52AlbRPieEnt != T01P18_A52AlbRPieEnt[0] ) || ( Z54AlbRPieUti != T01P18_A54AlbRPieUti[0] ) || ( Z47AlbREst != T01P18_A47AlbREst[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z46AlbREnt, T01P18_A46AlbREnt[0]) != 0 ) || ( GXutil.strcmp(Z5806AlbREnt2, T01P18_A5806AlbREnt2[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z49AlbRFen), GXutil.resetTime(T01P18_A49AlbRFen[0])) ) || !( GXutil.dateCompare(Z4606AlbRHEn, T01P18_A4606AlbRHEn[0]) ) || ( GXutil.strcmp(Z45AlbRef, T01P18_A45AlbRef[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3613AlbRefDsc, T01P18_A3613AlbRefDsc[0]) != 0 ) || ( GXutil.strcmp(Z1291AlbRDes, T01P18_A1291AlbRDes[0]) != 0 ) || ( GXutil.strcmp(Z56AlbRUni, T01P18_A56AlbRUni[0]) != 0 ) || ( GXutil.strcmp(Z50AlbRLoc, T01P18_A50AlbRLoc[0]) != 0 ) || ( GXutil.strcmp(Z55AlbRReo, T01P18_A55AlbRReo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z48AlbRFecUlt), GXutil.resetTime(T01P18_A48AlbRFecUlt[0])) ) || ( DecimalUtil.compareTo(Z6180AlbrUniC, T01P18_A6180AlbrUniC[0]) != 0 ) || ( Z6181AlbrPieC != T01P18_A6181AlbrPieC[0] ) || ( Z4920AlbRGrm2 != T01P18_A4920AlbRGrm2[0] ) || ( Z4921AlbRAnc != T01P18_A4921AlbRAnc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4922AlbPml != T01P18_A4922AlbPml[0] ) || ( GXutil.strcmp(Z6463AlbRLote, T01P18_A6463AlbRLote[0]) != 0 ) || ( DecimalUtil.compareTo(Z13241AlbRPh, T01P18_A13241AlbRPh[0]) != 0 ) || ( DecimalUtil.compareTo(Z13242AlbRRLong, T01P18_A13242AlbRRLong[0]) != 0 ) || ( DecimalUtil.compareTo(Z13243AlbRRTrans, T01P18_A13243AlbRRTrans[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8029AlbNumM, T01P18_A8029AlbNumM[0]) != 0 ) || ( Z53AlbRPieReb != T01P18_A53AlbRPieReb[0] ) || ( DecimalUtil.compareTo(Z59AlbRUniReb, T01P18_A59AlbRUniReb[0]) != 0 ) || ( Z10761AlbUltP != T01P18_A10761AlbUltP[0] ) || ( Z7501AlbRecSec != T01P18_A7501AlbRecSec[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1222AlbNumEti != T01P18_A1222AlbNumEti[0] ) || ( Z252CliCod != T01P18_A252CliCod[0] ) || ( Z840TrnCod != T01P18_A840TrnCod[0] ) || ( Z970ProceCod != T01P18_A970ProceCod[0] ) || ( Z1211TipEntCod != T01P18_A1211TipEntCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01P18_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T01P18_A58AlbRUniEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z60AlbRUniUti, T01P18_A60AlbRUniUti[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRUniUti");
               GXutil.writeLogRaw("Old: ",Z60AlbRUniUti);
               GXutil.writeLogRaw("Current: ",T01P18_A60AlbRUniUti[0]);
            }
            if ( Z52AlbRPieEnt != T01P18_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T01P18_A52AlbRPieEnt[0]);
            }
            if ( Z54AlbRPieUti != T01P18_A54AlbRPieUti[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRPieUti");
               GXutil.writeLogRaw("Old: ",Z54AlbRPieUti);
               GXutil.writeLogRaw("Current: ",T01P18_A54AlbRPieUti[0]);
            }
            if ( Z47AlbREst != T01P18_A47AlbREst[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T01P18_A47AlbREst[0]);
            }
            if ( GXutil.strcmp(Z46AlbREnt, T01P18_A46AlbREnt[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbREnt");
               GXutil.writeLogRaw("Old: ",Z46AlbREnt);
               GXutil.writeLogRaw("Current: ",T01P18_A46AlbREnt[0]);
            }
            if ( GXutil.strcmp(Z5806AlbREnt2, T01P18_A5806AlbREnt2[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbREnt2");
               GXutil.writeLogRaw("Old: ",Z5806AlbREnt2);
               GXutil.writeLogRaw("Current: ",T01P18_A5806AlbREnt2[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z49AlbRFen), GXutil.resetTime(T01P18_A49AlbRFen[0])) ) )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRFen");
               GXutil.writeLogRaw("Old: ",Z49AlbRFen);
               GXutil.writeLogRaw("Current: ",T01P18_A49AlbRFen[0]);
            }
            if ( !( GXutil.dateCompare(Z4606AlbRHEn, T01P18_A4606AlbRHEn[0]) ) )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRHEn");
               GXutil.writeLogRaw("Old: ",Z4606AlbRHEn);
               GXutil.writeLogRaw("Current: ",T01P18_A4606AlbRHEn[0]);
            }
            if ( GXutil.strcmp(Z45AlbRef, T01P18_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T01P18_A45AlbRef[0]);
            }
            if ( GXutil.strcmp(Z3613AlbRefDsc, T01P18_A3613AlbRefDsc[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRefDsc");
               GXutil.writeLogRaw("Old: ",Z3613AlbRefDsc);
               GXutil.writeLogRaw("Current: ",T01P18_A3613AlbRefDsc[0]);
            }
            if ( GXutil.strcmp(Z1291AlbRDes, T01P18_A1291AlbRDes[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRDes");
               GXutil.writeLogRaw("Old: ",Z1291AlbRDes);
               GXutil.writeLogRaw("Current: ",T01P18_A1291AlbRDes[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T01P18_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T01P18_A56AlbRUni[0]);
            }
            if ( GXutil.strcmp(Z50AlbRLoc, T01P18_A50AlbRLoc[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRLoc");
               GXutil.writeLogRaw("Old: ",Z50AlbRLoc);
               GXutil.writeLogRaw("Current: ",T01P18_A50AlbRLoc[0]);
            }
            if ( GXutil.strcmp(Z55AlbRReo, T01P18_A55AlbRReo[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRReo");
               GXutil.writeLogRaw("Old: ",Z55AlbRReo);
               GXutil.writeLogRaw("Current: ",T01P18_A55AlbRReo[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z48AlbRFecUlt), GXutil.resetTime(T01P18_A48AlbRFecUlt[0])) ) )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRFecUlt");
               GXutil.writeLogRaw("Old: ",Z48AlbRFecUlt);
               GXutil.writeLogRaw("Current: ",T01P18_A48AlbRFecUlt[0]);
            }
            if ( DecimalUtil.compareTo(Z6180AlbrUniC, T01P18_A6180AlbrUniC[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbrUniC");
               GXutil.writeLogRaw("Old: ",Z6180AlbrUniC);
               GXutil.writeLogRaw("Current: ",T01P18_A6180AlbrUniC[0]);
            }
            if ( Z6181AlbrPieC != T01P18_A6181AlbrPieC[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbrPieC");
               GXutil.writeLogRaw("Old: ",Z6181AlbrPieC);
               GXutil.writeLogRaw("Current: ",T01P18_A6181AlbrPieC[0]);
            }
            if ( Z4920AlbRGrm2 != T01P18_A4920AlbRGrm2[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRGrm2");
               GXutil.writeLogRaw("Old: ",Z4920AlbRGrm2);
               GXutil.writeLogRaw("Current: ",T01P18_A4920AlbRGrm2[0]);
            }
            if ( Z4921AlbRAnc != T01P18_A4921AlbRAnc[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRAnc");
               GXutil.writeLogRaw("Old: ",Z4921AlbRAnc);
               GXutil.writeLogRaw("Current: ",T01P18_A4921AlbRAnc[0]);
            }
            if ( Z4922AlbPml != T01P18_A4922AlbPml[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbPml");
               GXutil.writeLogRaw("Old: ",Z4922AlbPml);
               GXutil.writeLogRaw("Current: ",T01P18_A4922AlbPml[0]);
            }
            if ( GXutil.strcmp(Z6463AlbRLote, T01P18_A6463AlbRLote[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRLote");
               GXutil.writeLogRaw("Old: ",Z6463AlbRLote);
               GXutil.writeLogRaw("Current: ",T01P18_A6463AlbRLote[0]);
            }
            if ( DecimalUtil.compareTo(Z13241AlbRPh, T01P18_A13241AlbRPh[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRPh");
               GXutil.writeLogRaw("Old: ",Z13241AlbRPh);
               GXutil.writeLogRaw("Current: ",T01P18_A13241AlbRPh[0]);
            }
            if ( DecimalUtil.compareTo(Z13242AlbRRLong, T01P18_A13242AlbRRLong[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRRLong");
               GXutil.writeLogRaw("Old: ",Z13242AlbRRLong);
               GXutil.writeLogRaw("Current: ",T01P18_A13242AlbRRLong[0]);
            }
            if ( DecimalUtil.compareTo(Z13243AlbRRTrans, T01P18_A13243AlbRRTrans[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRRTrans");
               GXutil.writeLogRaw("Old: ",Z13243AlbRRTrans);
               GXutil.writeLogRaw("Current: ",T01P18_A13243AlbRRTrans[0]);
            }
            if ( GXutil.strcmp(Z8029AlbNumM, T01P18_A8029AlbNumM[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbNumM");
               GXutil.writeLogRaw("Old: ",Z8029AlbNumM);
               GXutil.writeLogRaw("Current: ",T01P18_A8029AlbNumM[0]);
            }
            if ( Z53AlbRPieReb != T01P18_A53AlbRPieReb[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRPieReb");
               GXutil.writeLogRaw("Old: ",Z53AlbRPieReb);
               GXutil.writeLogRaw("Current: ",T01P18_A53AlbRPieReb[0]);
            }
            if ( DecimalUtil.compareTo(Z59AlbRUniReb, T01P18_A59AlbRUniReb[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRUniReb");
               GXutil.writeLogRaw("Old: ",Z59AlbRUniReb);
               GXutil.writeLogRaw("Current: ",T01P18_A59AlbRUniReb[0]);
            }
            if ( Z10761AlbUltP != T01P18_A10761AlbUltP[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbUltP");
               GXutil.writeLogRaw("Old: ",Z10761AlbUltP);
               GXutil.writeLogRaw("Current: ",T01P18_A10761AlbUltP[0]);
            }
            if ( Z7501AlbRecSec != T01P18_A7501AlbRecSec[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRecSec");
               GXutil.writeLogRaw("Old: ",Z7501AlbRecSec);
               GXutil.writeLogRaw("Current: ",T01P18_A7501AlbRecSec[0]);
            }
            if ( Z1222AlbNumEti != T01P18_A1222AlbNumEti[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbNumEti");
               GXutil.writeLogRaw("Old: ",Z1222AlbNumEti);
               GXutil.writeLogRaw("Current: ",T01P18_A1222AlbNumEti[0]);
            }
            if ( Z252CliCod != T01P18_A252CliCod[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01P18_A252CliCod[0]);
            }
            if ( Z840TrnCod != T01P18_A840TrnCod[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01P18_A840TrnCod[0]);
            }
            if ( Z970ProceCod != T01P18_A970ProceCod[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"ProceCod");
               GXutil.writeLogRaw("Old: ",Z970ProceCod);
               GXutil.writeLogRaw("Current: ",T01P18_A970ProceCod[0]);
            }
            if ( Z1211TipEntCod != T01P18_A1211TipEntCod[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"TipEntCod");
               GXutil.writeLogRaw("Old: ",Z1211TipEntCod);
               GXutil.writeLogRaw("Current: ",T01P18_A1211TipEntCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1P17( )
   {
      beforeValidate1P17( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P17( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1P17( 0) ;
         checkOptimisticConcurrency1P17( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P17( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1P17( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P126 */
                  pr_default.execute(20, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A58AlbRUniEnt, A60AlbRUniUti, Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A46AlbREnt, A5806AlbREnt2, A49AlbRFen, Boolean.valueOf(n4606AlbRHEn), A4606AlbRHEn, A45AlbRef, A3613AlbRefDsc, A1291AlbRDes, A56AlbRUni, A50AlbRLoc, A55AlbRReo, A48AlbRFecUlt, A6180AlbrUniC, Integer.valueOf(A6181AlbrPieC), Short.valueOf(A4920AlbRGrm2), Short.valueOf(A4921AlbRAnc), Short.valueOf(A4922AlbPml), A6463AlbRLote, Boolean.valueOf(n13241AlbRPh), A13241AlbRPh, Boolean.valueOf(n13242AlbRRLong), A13242AlbRRLong, Boolean.valueOf(n13243AlbRRTrans), A13243AlbRRTrans, A8029AlbNumM, Integer.valueOf(A53AlbRPieReb), A59AlbRUniReb, Boolean.valueOf(n10761AlbUltP), Short.valueOf(A10761AlbUltP), Boolean.valueOf(n7501AlbRecSec), Short.valueOf(A7501AlbRecSec), Short.valueOf(A1222AlbNumEti), A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
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
                        processLevel1P17( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1P10( ) ;
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
            load1P17( ) ;
         }
         endLevel1P17( ) ;
      }
      closeExtendedTableCursors1P17( ) ;
   }

   public void update1P17( )
   {
      beforeValidate1P17( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P17( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P17( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P17( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1P17( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P127 */
                  pr_default.execute(21, new Object[] {A58AlbRUniEnt, A60AlbRUniUti, Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A46AlbREnt, A5806AlbREnt2, A49AlbRFen, Boolean.valueOf(n4606AlbRHEn), A4606AlbRHEn, A45AlbRef, A3613AlbRefDsc, A1291AlbRDes, A56AlbRUni, A50AlbRLoc, A55AlbRReo, A48AlbRFecUlt, A6180AlbrUniC, Integer.valueOf(A6181AlbrPieC), Short.valueOf(A4920AlbRGrm2), Short.valueOf(A4921AlbRAnc), Short.valueOf(A4922AlbPml), A6463AlbRLote, Boolean.valueOf(n13241AlbRPh), A13241AlbRPh, Boolean.valueOf(n13242AlbRRLong), A13242AlbRRLong, Boolean.valueOf(n13243AlbRRTrans), A13243AlbRRTrans, A8029AlbNumM, Integer.valueOf(A53AlbRPieReb), A59AlbRUniReb, Boolean.valueOf(n10761AlbUltP), Short.valueOf(A10761AlbUltP), Boolean.valueOf(n7501AlbRecSec), Short.valueOf(A7501AlbRecSec), Short.valueOf(A1222AlbNumEti), Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(21) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1P17( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int8[0] = A44AlbRecCod ;
                     new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int8) ;
                     talbdet2_impl.this.A396EmprCod = GXv_char4[0] ;
                     talbdet2_impl.this.A44AlbRecCod = GXv_int8[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1P17( ) ;
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
         endLevel1P17( ) ;
      }
      closeExtendedTableCursors1P17( ) ;
   }

   public void deferredUpdate1P17( )
   {
   }

   public void delete( )
   {
      beforeValidate1P17( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P17( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1P17( ) ;
         afterConfirm1P17( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1P17( ) ;
            if ( AnyError == 0 )
            {
               A10761AlbUltP = O10761AlbUltP ;
               n10761AlbUltP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
               A10760SumPzs = O10760SumPzs ;
               httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
               A10758SumKgs = O10758SumKgs ;
               httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
               A10759SumMts = O10759SumMts ;
               httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
               A2147AlbDetKgmD = O2147AlbDetKgmD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
               A2150AlbDetMtrD = O2150AlbDetMtrD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
               A2153AlbDetPieU = O2153AlbDetPieU ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
               A58AlbRUniEnt = O58AlbRUniEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A52AlbRPieEnt = O52AlbRPieEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               A47AlbREst = O47AlbREst ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               scanStart1P1299( ) ;
               while ( RcdFound299 != 0 )
               {
                  getByPrimaryKey1P1299( ) ;
                  delete1P1299( ) ;
                  scanNext1P1299( ) ;
                  O10761AlbUltP = A10761AlbUltP ;
                  n10761AlbUltP = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
                  O10760SumPzs = A10760SumPzs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
                  O10758SumKgs = A10758SumKgs ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
                  O10759SumMts = A10759SumMts ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
                  O2147AlbDetKgmD = A2147AlbDetKgmD ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                  O2150AlbDetMtrD = A2150AlbDetMtrD ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                  O2153AlbDetPieU = A2153AlbDetPieU ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
                  O58AlbRUniEnt = A58AlbRUniEnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
                  O60AlbRUniUti = A60AlbRUniUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                  O52AlbRPieEnt = A52AlbRPieEnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
                  O54AlbRPieUti = A54AlbRPieUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                  O47AlbREst = A47AlbREst ;
                  httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               }
               scanEnd1P1299( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P128 */
                  pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
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
      sMode7 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1P17( ) ;
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1P17( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         /* Using cursor T01P129 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01P129_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(23);
         /* Using cursor T01P130 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01P130_A841TrnNom[0] ;
         n841TrnNom = T01P130_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         pr_default.close(24);
         /* Using cursor T01P131 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         A971ProceNom = T01P131_A971ProceNom[0] ;
         n971ProceNom = T01P131_n971ProceNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         pr_default.close(25);
         /* Using cursor T01P132 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
         A1212TipEntNom = T01P132_A1212TipEntNom[0] ;
         n1212TipEntNom = T01P132_n1212TipEntNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
         pr_default.close(26);
         /* Using cursor T01P134 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            A2152AlbDetPie = T01P134_A2152AlbDetPie[0] ;
            A2149AlbDetMtr = T01P134_A2149AlbDetMtr[0] ;
            A2146AlbDetKgm = T01P134_A2146AlbDetKgm[0] ;
            A2151AlbDetMtrU = T01P134_A2151AlbDetMtrU[0] ;
            A2148AlbDetKgmU = T01P134_A2148AlbDetKgmU[0] ;
            A10758SumKgs = T01P134_A10758SumKgs[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            A10759SumMts = T01P134_A10759SumMts[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            A10760SumPzs = T01P134_A10760SumPzs[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         }
         else
         {
            A2152AlbDetPie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
            A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
            A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
            A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
            A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
            A10758SumKgs = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            A10759SumMts = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            A10760SumPzs = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         }
         pr_default.close(27);
         A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
            }
            else
            {
               A2153AlbDetPieU = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01P135 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Entradas Almacen Crudo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01P136 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01P137 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01P138 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPPZS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01P139 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPTAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01P140 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01P141 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01P142 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEM1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01P143 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBRDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01P144 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlRPieDef", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01P145 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01P146 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBROB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01P147 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01P148 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01P149 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
      }
   }

   public void processNestedLevel1P1299( )
   {
      s10761AlbUltP = O10761AlbUltP ;
      n10761AlbUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
      s10760SumPzs = O10760SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      s10758SumKgs = O10758SumKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
      s10759SumMts = O10759SumMts ;
      httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
      s2147AlbDetKgmD = O2147AlbDetKgmD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      s2150AlbDetMtrD = O2150AlbDetMtrD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      s2153AlbDetPieU = O2153AlbDetPieU ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      s58AlbRUniEnt = O58AlbRUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      s60AlbRUniUti = O60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      s52AlbRPieEnt = O52AlbRPieEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      s54AlbRPieUti = O54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      s47AlbREst = O47AlbREst ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      nGXsfl_383_idx = 0 ;
      while ( nGXsfl_383_idx < nRC_GXsfl_383 )
      {
         readRow1P1299( ) ;
         if ( ( nRcdExists_299 != 0 ) || ( nIsMod_299 != 0 ) )
         {
            standaloneNotModal1P1299( ) ;
            getKey1P1299( ) ;
            if ( ( nRcdExists_299 == 0 ) && ( nRcdDeleted_299 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1P1299( ) ;
            }
            else
            {
               if ( RcdFound299 != 0 )
               {
                  if ( ( nRcdDeleted_299 != 0 ) && ( nRcdExists_299 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1P1299( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_299 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1P1299( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_299 == 0 )
                  {
                     GXCCtl = "ALBRECPIE_" + sGXsfl_383_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecPie_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O10761AlbUltP = A10761AlbUltP ;
            n10761AlbUltP = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
            O10760SumPzs = A10760SumPzs ;
            httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
            O10758SumKgs = A10758SumKgs ;
            httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            O10759SumMts = A10759SumMts ;
            httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            O2147AlbDetKgmD = A2147AlbDetKgmD ;
            httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
            O2150AlbDetMtrD = A2150AlbDetMtrD ;
            httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
            O2153AlbDetPieU = A2153AlbDetPieU ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
            O58AlbRUniEnt = A58AlbRUniEnt ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
            O60AlbRUniUti = A60AlbRUniUti ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            O52AlbRPieEnt = A52AlbRPieEnt ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
            O54AlbRPieUti = A54AlbRPieUti ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            O47AlbREst = A47AlbREst ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         httpContext.changePostValue( edtAlbRecPie_Internalname, GXutil.rtrim( A2159AlbRecPie)) ;
         httpContext.changePostValue( edtAlbRecAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtALRPIELOC_Internalname, GXutil.rtrim( A7408ALRPIELOC)) ;
         httpContext.changePostValue( edtAlbRecMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtrU_Internalname, GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgmU_Internalname, GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecObs_Internalname, GXutil.rtrim( A13693AlbRecObs)) ;
         httpContext.changePostValue( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_383_idx, GXutil.rtrim( Z2159AlbRecPie)) ;
         httpContext.changePostValue( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_383_idx, GXutil.rtrim( Z4795AlRPieCal)) ;
         httpContext.changePostValue( "ZT_"+"Z2154AlbRecAnh_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10762AlbPCont_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z10762AlbPCont, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2158AlbRecMtrU_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2156AlbRecKgmU_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8779Bod_Talla_"+sGXsfl_383_idx, GXutil.rtrim( Z8779Bod_Talla)) ;
         httpContext.changePostValue( "ZT_"+"Z8780Bod_Und_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z8780Bod_Und, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3730AlbRecCol_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z3730AlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3731AlbRecIdPz_"+sGXsfl_383_idx, GXutil.rtrim( Z3731AlbRecIdPz)) ;
         httpContext.changePostValue( "ZT_"+"Z3732AlbRecIdRc_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z3732AlbRecIdRc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4410AlbRecPal_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z4410AlbRecPal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10180AlRPieTelT_"+sGXsfl_383_idx, GXutil.rtrim( Z10180AlRPieTelT)) ;
         httpContext.changePostValue( "ZT_"+"Z10149AlRPieCon_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z10149AlRPieCon, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10181AlRPieOri_"+sGXsfl_383_idx, GXutil.rtrim( Z10181AlRPieOri)) ;
         httpContext.changePostValue( "ZT_"+"Z10182AlRPieDst_"+sGXsfl_383_idx, GXutil.rtrim( Z10182AlRPieDst)) ;
         httpContext.changePostValue( "ZT_"+"Z10183AlrPieKgmT_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( Z10183AlrPieKgmT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7408ALRPIELOC_"+sGXsfl_383_idx, GXutil.rtrim( Z7408ALRPIELOC)) ;
         httpContext.changePostValue( "T2155AlbRecKgm_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( O2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2157AlbRecMtr_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( O2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_299_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_299_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_299_"+sGXsfl_383_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_299 != 0 )
         {
            httpContext.changePostValue( "ALBRECPIE_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECANH_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALRPIELOC_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIELOC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTR_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGM_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTRU_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGMU_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECOBS_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T01P134 */
      pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         A2152AlbDetPie = T01P134_A2152AlbDetPie[0] ;
         A2149AlbDetMtr = T01P134_A2149AlbDetMtr[0] ;
         A2146AlbDetKgm = T01P134_A2146AlbDetKgm[0] ;
         A2151AlbDetMtrU = T01P134_A2151AlbDetMtrU[0] ;
         A2148AlbDetKgmU = T01P134_A2148AlbDetKgmU[0] ;
      }
      else
      {
         A2152AlbDetPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
         A10758SumKgs = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         A10759SumMts = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         A10760SumPzs = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      }
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2149AlbDetMtr)==0) )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2146AlbDetKgm)==0) )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2151AlbDetMtrU)==0) )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2148AlbDetKgmU)==0) )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( ! (0==A2152AlbDetPie) )
      {
         A52AlbRPieEnt = A2152AlbDetPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      }
      /* End of After( level) rules */
      initAll1P1299( ) ;
      if ( AnyError != 0 )
      {
         O10761AlbUltP = s10761AlbUltP ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         O10760SumPzs = s10760SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         O10758SumKgs = s10758SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         O10759SumMts = s10759SumMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         O2147AlbDetKgmD = s2147AlbDetKgmD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         O2150AlbDetMtrD = s2150AlbDetMtrD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         O2153AlbDetPieU = s2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         O58AlbRUniEnt = s58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         O60AlbRUniUti = s60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         O52AlbRPieEnt = s52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         O54AlbRPieUti = s54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         O47AlbREst = s47AlbREst ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      nRcdExists_299 = (short)(0) ;
      nIsMod_299 = (short)(0) ;
      nRcdDeleted_299 = (short)(0) ;
   }

   public void processLevel1P17( )
   {
      /* Save parent mode. */
      sMode7 = Gx_mode ;
      processNestedLevel1P1299( ) ;
      if ( AnyError != 0 )
      {
         O10761AlbUltP = s10761AlbUltP ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
         O10760SumPzs = s10760SumPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         O10758SumKgs = s10758SumKgs ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         O10759SumMts = s10759SumMts ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         O2147AlbDetKgmD = s2147AlbDetKgmD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         O2150AlbDetMtrD = s2150AlbDetMtrD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         O2153AlbDetPieU = s2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         O58AlbRUniEnt = s58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         O60AlbRUniUti = s60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         O52AlbRPieEnt = s52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         O54AlbRPieUti = s54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         O47AlbREst = s47AlbREst ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01P150 */
      pr_default.execute(43, new Object[] {Boolean.valueOf(n10761AlbUltP), Short.valueOf(A10761AlbUltP), A58AlbRUniEnt, A60AlbRUniUti, Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel1P17( )
   {
      pr_default.close(4);
      if ( AnyError == 0 )
      {
         beforeComplete1P17( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "talbdet2");
         if ( AnyError == 0 )
         {
            confirmValues1P10( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "talbdet2");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1P17( )
   {
      /* Scan By routine */
      /* Using cursor T01P151 */
      pr_default.execute(44, new Object[] {A396EmprCod});
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A44AlbRecCod = T01P151_A44AlbRecCod[0] ;
         n44AlbRecCod = T01P151_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1P17( )
   {
      /* Scan next routine */
      pr_default.readNext(44);
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A44AlbRecCod = T01P151_A44AlbRecCod[0] ;
         n44AlbRecCod = T01P151_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
   }

   public void scanEnd1P17( )
   {
      pr_default.close(44);
   }

   public void afterConfirm1P17( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1P17( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1P17( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1P17( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1P17( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1P17( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1P17( )
   {
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtAlbREnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Enabled), 5, 0), true);
      edtAlbREnt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Enabled), 5, 0), true);
      edtAlbRFen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      edtAlbRHEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRHEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRHEn_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      edtAlbRefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), true);
      edtProceNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceNom_Enabled), 5, 0), true);
      edtTrnNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbrUniC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrUniC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrUniC_Enabled), 5, 0), true);
      edtAlbrPieC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrPieC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrPieC_Enabled), 5, 0), true);
      edtAlbNumM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumM_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtTipEntNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntNom_Enabled), 5, 0), true);
      edtAlbRDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRDes_Enabled), 5, 0), true);
      edtAlbRLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Enabled), 5, 0), true);
      edtAlbRLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      cmbAlbRReo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      edtAlbRGrm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRGrm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRGrm2_Enabled), 5, 0), true);
      edtAlbRAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRAnc_Enabled), 5, 0), true);
      edtAlbPml_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPml_Enabled), 5, 0), true);
      edtAlbRPh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPh_Enabled), 5, 0), true);
      edtAlbRRLong_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRRLong_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRRLong_Enabled), 5, 0), true);
      edtAlbRRTrans_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRRTrans_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRRTrans_Enabled), 5, 0), true);
      edtSumKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSumKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSumKgs_Enabled), 5, 0), true);
      edtSumMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSumMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSumMts_Enabled), 5, 0), true);
      edtSumPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSumPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSumPzs_Enabled), 5, 0), true);
   }

   public void zm1P1299( int GX_JID )
   {
      if ( ( GX_JID == 103 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4795AlRPieCal = T01P13_A4795AlRPieCal[0] ;
            Z2154AlbRecAnh = T01P13_A2154AlbRecAnh[0] ;
            Z10762AlbPCont = T01P13_A10762AlbPCont[0] ;
            Z2157AlbRecMtr = T01P13_A2157AlbRecMtr[0] ;
            Z2155AlbRecKgm = T01P13_A2155AlbRecKgm[0] ;
            Z2158AlbRecMtrU = T01P13_A2158AlbRecMtrU[0] ;
            Z2156AlbRecKgmU = T01P13_A2156AlbRecKgmU[0] ;
            Z8779Bod_Talla = T01P13_A8779Bod_Talla[0] ;
            Z8780Bod_Und = T01P13_A8780Bod_Und[0] ;
            Z3730AlbRecCol = T01P13_A3730AlbRecCol[0] ;
            Z3731AlbRecIdPz = T01P13_A3731AlbRecIdPz[0] ;
            Z3732AlbRecIdRc = T01P13_A3732AlbRecIdRc[0] ;
            Z4410AlbRecPal = T01P13_A4410AlbRecPal[0] ;
            Z10180AlRPieTelT = T01P13_A10180AlRPieTelT[0] ;
            Z10149AlRPieCon = T01P13_A10149AlRPieCon[0] ;
            Z10181AlRPieOri = T01P13_A10181AlRPieOri[0] ;
            Z10182AlRPieDst = T01P13_A10182AlRPieDst[0] ;
            Z10183AlrPieKgmT = T01P13_A10183AlrPieKgmT[0] ;
            Z7408ALRPIELOC = T01P13_A7408ALRPIELOC[0] ;
         }
         else
         {
            Z4795AlRPieCal = A4795AlRPieCal ;
            Z2154AlbRecAnh = A2154AlbRecAnh ;
            Z10762AlbPCont = A10762AlbPCont ;
            Z2157AlbRecMtr = A2157AlbRecMtr ;
            Z2155AlbRecKgm = A2155AlbRecKgm ;
            Z2158AlbRecMtrU = A2158AlbRecMtrU ;
            Z2156AlbRecKgmU = A2156AlbRecKgmU ;
            Z8779Bod_Talla = A8779Bod_Talla ;
            Z8780Bod_Und = A8780Bod_Und ;
            Z3730AlbRecCol = A3730AlbRecCol ;
            Z3731AlbRecIdPz = A3731AlbRecIdPz ;
            Z3732AlbRecIdRc = A3732AlbRecIdRc ;
            Z4410AlbRecPal = A4410AlbRecPal ;
            Z10180AlRPieTelT = A10180AlRPieTelT ;
            Z10149AlRPieCon = A10149AlRPieCon ;
            Z10181AlRPieOri = A10181AlRPieOri ;
            Z10182AlRPieDst = A10182AlRPieDst ;
            Z10183AlrPieKgmT = A10183AlrPieKgmT ;
            Z7408ALRPIELOC = A7408ALRPIELOC ;
         }
      }
      if ( GX_JID == -103 )
      {
         Z4795AlRPieCal = A4795AlRPieCal ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         Z2154AlbRecAnh = A2154AlbRecAnh ;
         Z10762AlbPCont = A10762AlbPCont ;
         Z2157AlbRecMtr = A2157AlbRecMtr ;
         Z2155AlbRecKgm = A2155AlbRecKgm ;
         Z2158AlbRecMtrU = A2158AlbRecMtrU ;
         Z2156AlbRecKgmU = A2156AlbRecKgmU ;
         Z8779Bod_Talla = A8779Bod_Talla ;
         Z8780Bod_Und = A8780Bod_Und ;
         Z3730AlbRecCol = A3730AlbRecCol ;
         Z3731AlbRecIdPz = A3731AlbRecIdPz ;
         Z3732AlbRecIdRc = A3732AlbRecIdRc ;
         Z4410AlbRecPal = A4410AlbRecPal ;
         Z10180AlRPieTelT = A10180AlRPieTelT ;
         Z10149AlRPieCon = A10149AlRPieCon ;
         Z10181AlRPieOri = A10181AlRPieOri ;
         Z10182AlRPieDst = A10182AlRPieDst ;
         Z10183AlrPieKgmT = A10183AlrPieKgmT ;
         Z7408ALRPIELOC = A7408ALRPIELOC ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1P1299( )
   {
      edtALRPIELOC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtALRPIELOC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALRPIELOC_Enabled), 5, 0), !bGXsfl_383_Refreshing);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      if ( ! (0==A2152AlbDetPie) )
      {
         A52AlbRPieEnt = A2152AlbDetPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      }
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      O2153AlbDetPieU = A2153AlbDetPieU ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      if ( ! (0==A2153AlbDetPieU) )
      {
         A54AlbRPieUti = A2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2149AlbDetMtr)==0) )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2146AlbDetKgm)==0) )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2151AlbDetMtrU)==0) )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2148AlbDetKgmU)==0) )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( ( A2147AlbDetKgmD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
      {
         A47AlbREst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( ( A2150AlbDetMtrD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( ( A2147AlbDetKgmD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
            {
               A47AlbREst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
            else
            {
               if ( ( A2150AlbDetMtrD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
               {
                  A47AlbREst = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               }
            }
         }
      }
   }

   public void standaloneModal1P1299( )
   {
      if ( isIns( )  )
      {
         A10761AlbUltP = (short)(O10761AlbUltP+1) ;
         n10761AlbUltP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
      }
      if ( isIns( )  && (0==A2154AlbRecAnh) && ( Gx_BScreen == 0 ) )
      {
         A2154AlbRecAnh = A4921AlbRAnc ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A10762AlbPCont = A10761AlbUltP ;
         httpContext.ajax_rsp_assign_attri("", false, "A10762AlbPCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10762AlbPCont), 4, 0));
      }
      if ( isIns( )  )
      {
         A10760SumPzs = (short)(O10760SumPzs+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A10760SumPzs = O10760SumPzs ;
            httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A10760SumPzs = (short)(O10760SumPzs-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
            }
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbRecPie_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_383_Refreshing);
      }
      else
      {
         edtAlbRecPie_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_383_Refreshing);
      }
   }

   public void load1P1299( )
   {
      /* Using cursor T01P152 */
      pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound299 = (short)(1) ;
         A4795AlRPieCal = T01P152_A4795AlRPieCal[0] ;
         A2154AlbRecAnh = T01P152_A2154AlbRecAnh[0] ;
         A10762AlbPCont = T01P152_A10762AlbPCont[0] ;
         A2157AlbRecMtr = T01P152_A2157AlbRecMtr[0] ;
         A2155AlbRecKgm = T01P152_A2155AlbRecKgm[0] ;
         A2158AlbRecMtrU = T01P152_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = T01P152_A2156AlbRecKgmU[0] ;
         A8779Bod_Talla = T01P152_A8779Bod_Talla[0] ;
         A8780Bod_Und = T01P152_A8780Bod_Und[0] ;
         A3730AlbRecCol = T01P152_A3730AlbRecCol[0] ;
         A3731AlbRecIdPz = T01P152_A3731AlbRecIdPz[0] ;
         A3732AlbRecIdRc = T01P152_A3732AlbRecIdRc[0] ;
         A4410AlbRecPal = T01P152_A4410AlbRecPal[0] ;
         A10180AlRPieTelT = T01P152_A10180AlRPieTelT[0] ;
         A10149AlRPieCon = T01P152_A10149AlRPieCon[0] ;
         A10181AlRPieOri = T01P152_A10181AlRPieOri[0] ;
         A10182AlRPieDst = T01P152_A10182AlRPieDst[0] ;
         A10183AlrPieKgmT = T01P152_A10183AlrPieKgmT[0] ;
         A7408ALRPIELOC = T01P152_A7408ALRPIELOC[0] ;
         zm1P1299( -103) ;
      }
      pr_default.close(45);
      onLoadActions1P1299( ) ;
   }

   public void onLoadActions1P1299( )
   {
      /* Using cursor T01P15 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A4806AlRPieDefC = T01P15_A4806AlRPieDefC[0] ;
         n4806AlRPieDefC = T01P15_n4806AlRPieDefC[0] ;
      }
      else
      {
         A4806AlRPieDefC = 0 ;
         n4806AlRPieDefC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      }
      pr_default.close(2);
      if ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() )
      {
         A4797AlRPieClaC = httpContext.getMessage( "A", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
      }
      else
      {
         if ( ( A4806AlRPieDefC > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
         {
            A4797AlRPieClaC = httpContext.getMessage( "B", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
         }
         else
         {
            if ( ( A4806AlRPieDefC > A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
            {
               A4797AlRPieClaC = httpContext.getMessage( "C", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
            }
            else
            {
               A4797AlRPieClaC = httpContext.getMessage( "D", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
            }
         }
      }
      GXt_char1 = A13693AlbRecObs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A44AlbRecCod ;
      GXv_char3[0] = A2159AlbRecPie ;
      GXv_char2[0] = GXt_char1 ;
      new app.palrpieuti(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
      talbdet2_impl.this.A396EmprCod = GXv_char4[0] ;
      talbdet2_impl.this.A44AlbRecCod = GXv_int8[0] ;
      talbdet2_impl.this.A2159AlbRecPie = GXv_char3[0] ;
      talbdet2_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A13693AlbRecObs = GXt_char1 ;
      GXt_char1 = A4795AlRPieCal ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A44AlbRecCod ;
      GXv_char3[0] = A2159AlbRecPie ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppiecalact(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
      talbdet2_impl.this.A396EmprCod = GXv_char4[0] ;
      talbdet2_impl.this.A44AlbRecCod = GXv_int8[0] ;
      talbdet2_impl.this.A2159AlbRecPie = GXv_char3[0] ;
      talbdet2_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A4795AlRPieCal = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
      if ( isIns( )  )
      {
         A10759SumMts = O10759SumMts.add(A2157AlbRecMtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A10759SumMts = O10759SumMts.add(A2157AlbRecMtr).subtract(O2157AlbRecMtr) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A10759SumMts = O10759SumMts.subtract(O2157AlbRecMtr) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A10758SumKgs = O10758SumKgs.add(A2155AlbRecKgm) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A10758SumKgs = O10758SumKgs.add(A2155AlbRecKgm).subtract(O2155AlbRecKgm) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A10758SumKgs = O10758SumKgs.subtract(O2155AlbRecKgm) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            }
         }
      }
   }

   public void checkExtendedTable1P1299( )
   {
      nIsDirty_299 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1P1299( ) ;
      /* Using cursor T01P15 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A4806AlRPieDefC = T01P15_A4806AlRPieDefC[0] ;
         n4806AlRPieDefC = T01P15_n4806AlRPieDefC[0] ;
      }
      else
      {
         nIsDirty_299 = (short)(1) ;
         A4806AlRPieDefC = 0 ;
         n4806AlRPieDefC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      }
      pr_default.close(2);
      if ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() )
      {
         nIsDirty_299 = (short)(1) ;
         A4797AlRPieClaC = httpContext.getMessage( "A", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
      }
      else
      {
         if ( ( A4806AlRPieDefC > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
         {
            nIsDirty_299 = (short)(1) ;
            A4797AlRPieClaC = httpContext.getMessage( "B", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
         }
         else
         {
            if ( ( A4806AlRPieDefC > A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
            {
               nIsDirty_299 = (short)(1) ;
               A4797AlRPieClaC = httpContext.getMessage( "C", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
            }
            else
            {
               nIsDirty_299 = (short)(1) ;
               A4797AlRPieClaC = httpContext.getMessage( "D", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
            }
         }
      }
      nIsDirty_299 = (short)(1) ;
      GXt_char1 = A13693AlbRecObs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A44AlbRecCod ;
      GXv_char3[0] = A2159AlbRecPie ;
      GXv_char2[0] = GXt_char1 ;
      new app.palrpieuti(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
      talbdet2_impl.this.A396EmprCod = GXv_char4[0] ;
      talbdet2_impl.this.A44AlbRecCod = GXv_int8[0] ;
      talbdet2_impl.this.A2159AlbRecPie = GXv_char3[0] ;
      talbdet2_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A13693AlbRecObs = GXt_char1 ;
      if ( ( GXutil.strcmp(GXutil.trim( A13693AlbRecObs), httpContext.getMessage( "N/U", "")) != 0 ) && ( ( GXutil.strcmp(GXutil.substring( A13693AlbRecObs, 1, 3), httpContext.getMessage( "Dev", "")) == 0 ) ) && true /* Level */ && ( isUpd( )  || isDlt( )  ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Pieza en DEVOLUCION ¡¡¡", ""), 1, "");
         AnyError = (short)(1) ;
      }
      nIsDirty_299 = (short)(1) ;
      GXt_char1 = A4795AlRPieCal ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A44AlbRecCod ;
      GXv_char3[0] = A2159AlbRecPie ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppiecalact(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
      talbdet2_impl.this.A396EmprCod = GXv_char4[0] ;
      talbdet2_impl.this.A44AlbRecCod = GXv_int8[0] ;
      talbdet2_impl.this.A2159AlbRecPie = GXv_char3[0] ;
      talbdet2_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A4795AlRPieCal = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
      if ( isIns( )  && true /* After */ && ( AV73Noctrlpz == 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A2159AlbRecPie ;
         GXv_char2[0] = AV62Msg_err ;
         new app.pexipzae(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         talbdet2_impl.this.A396EmprCod = GXv_char4[0] ;
         talbdet2_impl.this.A2159AlbRecPie = GXv_char3[0] ;
         talbdet2_impl.this.AV62Msg_err = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV62Msg_err", AV62Msg_err);
      }
      if ( isIns( )  && true /* After */ && ( AV61NoPzaR == 1 ) && ( GXutil.strcmp(AV62Msg_err, " ") != 0 ) && ( AV80Velluts == 0 ) )
      {
         GXCCtl = "ALBRECPIE_" + sGXsfl_383_idx ;
         httpContext.GX_msglist.addItem(AV62Msg_err, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecPie_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && true /* After */ && ( AV61NoPzaR == 0 ) && ( GXutil.strcmp(AV62Msg_err, " ") != 0 ) && ( AV80Velluts == 0 ) && ( AV85Colorsol == 0 ) )
      {
         GXCCtl = "ALBRECPIE_" + sGXsfl_383_idx ;
         httpContext.GX_msglist.addItem(AV62Msg_err, 0, GXCCtl);
      }
      if ( isIns( )  )
      {
         nIsDirty_299 = (short)(1) ;
         A10759SumMts = O10759SumMts.add(A2157AlbRecMtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_299 = (short)(1) ;
            A10759SumMts = O10759SumMts.add(A2157AlbRecMtr).subtract(O2157AlbRecMtr) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_299 = (short)(1) ;
               A10759SumMts = O10759SumMts.subtract(O2157AlbRecMtr) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            }
         }
      }
      if ( DecimalUtil.compareTo(A2158AlbRecMtrU, A2157AlbRecMtr) > 0 )
      {
         GXCCtl = "ALBRECMTR_" + sGXsfl_383_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Metros Insuficientes", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecMtr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV51FlagArt == 1 ) && true /* Level */ && true /* After */ && ( AV52CalMKT == 1 ) )
      {
         GXv_char4[0] = A56AlbRUni ;
         GXv_decimal10[0] = A2157AlbRecMtr ;
         GXv_decimal11[0] = A2155AlbRecKgm ;
         GXv_decimal12[0] = AV49Rdto ;
         GXv_int13[0] = AV50Pesoml ;
         GXv_int14[0] = AV100Anc ;
         GXv_int15[0] = AV101grm2 ;
         new app.pcalkmt(remoteHandle, context).execute( GXv_char4, GXv_decimal10, GXv_decimal11, GXv_decimal12, GXv_int13, GXv_int14, GXv_int15) ;
         talbdet2_impl.this.A56AlbRUni = GXv_char4[0] ;
         talbdet2_impl.this.A2157AlbRecMtr = GXv_decimal10[0] ;
         talbdet2_impl.this.A2155AlbRecKgm = GXv_decimal11[0] ;
         talbdet2_impl.this.AV49Rdto = GXv_decimal12[0] ;
         talbdet2_impl.this.AV50Pesoml = GXv_int13[0] ;
         talbdet2_impl.this.AV100Anc = GXv_int14[0] ;
         talbdet2_impl.this.AV101grm2 = GXv_int15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         httpContext.ajax_rsp_assign_attri("", false, "AV49Rdto", GXutil.ltrimstr( AV49Rdto, 6, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV50Pesoml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Pesoml), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV100Anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Anc), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV101grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101grm2), 4, 0));
      }
      if ( isIns( )  )
      {
         nIsDirty_299 = (short)(1) ;
         A10758SumKgs = O10758SumKgs.add(A2155AlbRecKgm) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_299 = (short)(1) ;
            A10758SumKgs = O10758SumKgs.add(A2155AlbRecKgm).subtract(O2155AlbRecKgm) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_299 = (short)(1) ;
               A10758SumKgs = O10758SumKgs.subtract(O2155AlbRecKgm) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            }
         }
      }
      if ( DecimalUtil.compareTo(A2156AlbRecKgmU, A2155AlbRecKgm) > 0 )
      {
         GXCCtl = "ALBRECKGM_" + sGXsfl_383_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Kilos Insuficientes", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecKgm_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && (GXutil.strcmp("", A2159AlbRecPie)==0) && ( AV48SumPza == 1 ) && true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_char3[0] = A2159AlbRecPie ;
         new app.pultpza(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
         talbdet2_impl.this.A396EmprCod = GXv_char4[0] ;
         talbdet2_impl.this.A44AlbRecCod = GXv_int8[0] ;
         talbdet2_impl.this.A2159AlbRecPie = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
   }

   public void closeExtendedTableCursors1P1299( )
   {
      pr_default.close(2);
   }

   public void enableDisable1P1299( )
   {
   }

   public void gxload_104( String A396EmprCod ,
                           int A44AlbRecCod ,
                           String A2159AlbRecPie )
   {
      /* Using cursor T01P154 */
      pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(46) != 101) )
      {
         A4806AlRPieDefC = T01P154_A4806AlRPieDefC[0] ;
         n4806AlRPieDefC = T01P154_n4806AlRPieDefC[0] ;
      }
      else
      {
         A4806AlRPieDefC = 0 ;
         n4806AlRPieDefC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4806AlRPieDefC, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(46) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(46);
   }

   public void getKey1P1299( )
   {
      /* Using cursor T01P155 */
      pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound299 = (short)(1) ;
      }
      else
      {
         RcdFound299 = (short)(0) ;
      }
      pr_default.close(47);
   }

   public void getByPrimaryKey1P1299( )
   {
      /* Using cursor T01P13 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01P13_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1P1299( 103) ;
         RcdFound299 = (short)(1) ;
         initializeNonKey1P1299( ) ;
         A4795AlRPieCal = T01P13_A4795AlRPieCal[0] ;
         A2159AlbRecPie = T01P13_A2159AlbRecPie[0] ;
         A2154AlbRecAnh = T01P13_A2154AlbRecAnh[0] ;
         A10762AlbPCont = T01P13_A10762AlbPCont[0] ;
         A2157AlbRecMtr = T01P13_A2157AlbRecMtr[0] ;
         A2155AlbRecKgm = T01P13_A2155AlbRecKgm[0] ;
         A2158AlbRecMtrU = T01P13_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = T01P13_A2156AlbRecKgmU[0] ;
         A8779Bod_Talla = T01P13_A8779Bod_Talla[0] ;
         A8780Bod_Und = T01P13_A8780Bod_Und[0] ;
         A3730AlbRecCol = T01P13_A3730AlbRecCol[0] ;
         A3731AlbRecIdPz = T01P13_A3731AlbRecIdPz[0] ;
         A3732AlbRecIdRc = T01P13_A3732AlbRecIdRc[0] ;
         A4410AlbRecPal = T01P13_A4410AlbRecPal[0] ;
         A10180AlRPieTelT = T01P13_A10180AlRPieTelT[0] ;
         A10149AlRPieCon = T01P13_A10149AlRPieCon[0] ;
         A10181AlRPieOri = T01P13_A10181AlRPieOri[0] ;
         A10182AlRPieDst = T01P13_A10182AlRPieDst[0] ;
         A10183AlrPieKgmT = T01P13_A10183AlrPieKgmT[0] ;
         A7408ALRPIELOC = T01P13_A7408ALRPIELOC[0] ;
         O2155AlbRecKgm = A2155AlbRecKgm ;
         O2157AlbRecMtr = A2157AlbRecMtr ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         sMode299 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1P1299( ) ;
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound299 = (short)(0) ;
         initializeNonKey1P1299( ) ;
         sMode299 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1P1299( ) ;
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1P1299( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1P1299( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01P12 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBDET"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4795AlRPieCal, T01P12_A4795AlRPieCal[0]) != 0 ) || ( Z2154AlbRecAnh != T01P12_A2154AlbRecAnh[0] ) || ( Z10762AlbPCont != T01P12_A10762AlbPCont[0] ) || ( DecimalUtil.compareTo(Z2157AlbRecMtr, T01P12_A2157AlbRecMtr[0]) != 0 ) || ( DecimalUtil.compareTo(Z2155AlbRecKgm, T01P12_A2155AlbRecKgm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z2158AlbRecMtrU, T01P12_A2158AlbRecMtrU[0]) != 0 ) || ( DecimalUtil.compareTo(Z2156AlbRecKgmU, T01P12_A2156AlbRecKgmU[0]) != 0 ) || ( GXutil.strcmp(Z8779Bod_Talla, T01P12_A8779Bod_Talla[0]) != 0 ) || ( Z8780Bod_Und != T01P12_A8780Bod_Und[0] ) || ( Z3730AlbRecCol != T01P12_A3730AlbRecCol[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3731AlbRecIdPz, T01P12_A3731AlbRecIdPz[0]) != 0 ) || ( Z3732AlbRecIdRc != T01P12_A3732AlbRecIdRc[0] ) || ( DecimalUtil.compareTo(Z4410AlbRecPal, T01P12_A4410AlbRecPal[0]) != 0 ) || ( GXutil.strcmp(Z10180AlRPieTelT, T01P12_A10180AlRPieTelT[0]) != 0 ) || ( Z10149AlRPieCon != T01P12_A10149AlRPieCon[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10181AlRPieOri, T01P12_A10181AlRPieOri[0]) != 0 ) || ( GXutil.strcmp(Z10182AlRPieDst, T01P12_A10182AlRPieDst[0]) != 0 ) || ( DecimalUtil.compareTo(Z10183AlrPieKgmT, T01P12_A10183AlrPieKgmT[0]) != 0 ) || ( GXutil.strcmp(Z7408ALRPIELOC, T01P12_A7408ALRPIELOC[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4795AlRPieCal, T01P12_A4795AlRPieCal[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlRPieCal");
               GXutil.writeLogRaw("Old: ",Z4795AlRPieCal);
               GXutil.writeLogRaw("Current: ",T01P12_A4795AlRPieCal[0]);
            }
            if ( Z2154AlbRecAnh != T01P12_A2154AlbRecAnh[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRecAnh");
               GXutil.writeLogRaw("Old: ",Z2154AlbRecAnh);
               GXutil.writeLogRaw("Current: ",T01P12_A2154AlbRecAnh[0]);
            }
            if ( Z10762AlbPCont != T01P12_A10762AlbPCont[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbPCont");
               GXutil.writeLogRaw("Old: ",Z10762AlbPCont);
               GXutil.writeLogRaw("Current: ",T01P12_A10762AlbPCont[0]);
            }
            if ( DecimalUtil.compareTo(Z2157AlbRecMtr, T01P12_A2157AlbRecMtr[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRecMtr");
               GXutil.writeLogRaw("Old: ",Z2157AlbRecMtr);
               GXutil.writeLogRaw("Current: ",T01P12_A2157AlbRecMtr[0]);
            }
            if ( DecimalUtil.compareTo(Z2155AlbRecKgm, T01P12_A2155AlbRecKgm[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRecKgm");
               GXutil.writeLogRaw("Old: ",Z2155AlbRecKgm);
               GXutil.writeLogRaw("Current: ",T01P12_A2155AlbRecKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z2158AlbRecMtrU, T01P12_A2158AlbRecMtrU[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRecMtrU");
               GXutil.writeLogRaw("Old: ",Z2158AlbRecMtrU);
               GXutil.writeLogRaw("Current: ",T01P12_A2158AlbRecMtrU[0]);
            }
            if ( DecimalUtil.compareTo(Z2156AlbRecKgmU, T01P12_A2156AlbRecKgmU[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRecKgmU");
               GXutil.writeLogRaw("Old: ",Z2156AlbRecKgmU);
               GXutil.writeLogRaw("Current: ",T01P12_A2156AlbRecKgmU[0]);
            }
            if ( GXutil.strcmp(Z8779Bod_Talla, T01P12_A8779Bod_Talla[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"Bod_Talla");
               GXutil.writeLogRaw("Old: ",Z8779Bod_Talla);
               GXutil.writeLogRaw("Current: ",T01P12_A8779Bod_Talla[0]);
            }
            if ( Z8780Bod_Und != T01P12_A8780Bod_Und[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"Bod_Und");
               GXutil.writeLogRaw("Old: ",Z8780Bod_Und);
               GXutil.writeLogRaw("Current: ",T01P12_A8780Bod_Und[0]);
            }
            if ( Z3730AlbRecCol != T01P12_A3730AlbRecCol[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRecCol");
               GXutil.writeLogRaw("Old: ",Z3730AlbRecCol);
               GXutil.writeLogRaw("Current: ",T01P12_A3730AlbRecCol[0]);
            }
            if ( GXutil.strcmp(Z3731AlbRecIdPz, T01P12_A3731AlbRecIdPz[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRecIdPz");
               GXutil.writeLogRaw("Old: ",Z3731AlbRecIdPz);
               GXutil.writeLogRaw("Current: ",T01P12_A3731AlbRecIdPz[0]);
            }
            if ( Z3732AlbRecIdRc != T01P12_A3732AlbRecIdRc[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRecIdRc");
               GXutil.writeLogRaw("Old: ",Z3732AlbRecIdRc);
               GXutil.writeLogRaw("Current: ",T01P12_A3732AlbRecIdRc[0]);
            }
            if ( DecimalUtil.compareTo(Z4410AlbRecPal, T01P12_A4410AlbRecPal[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlbRecPal");
               GXutil.writeLogRaw("Old: ",Z4410AlbRecPal);
               GXutil.writeLogRaw("Current: ",T01P12_A4410AlbRecPal[0]);
            }
            if ( GXutil.strcmp(Z10180AlRPieTelT, T01P12_A10180AlRPieTelT[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlRPieTelT");
               GXutil.writeLogRaw("Old: ",Z10180AlRPieTelT);
               GXutil.writeLogRaw("Current: ",T01P12_A10180AlRPieTelT[0]);
            }
            if ( Z10149AlRPieCon != T01P12_A10149AlRPieCon[0] )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlRPieCon");
               GXutil.writeLogRaw("Old: ",Z10149AlRPieCon);
               GXutil.writeLogRaw("Current: ",T01P12_A10149AlRPieCon[0]);
            }
            if ( GXutil.strcmp(Z10181AlRPieOri, T01P12_A10181AlRPieOri[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlRPieOri");
               GXutil.writeLogRaw("Old: ",Z10181AlRPieOri);
               GXutil.writeLogRaw("Current: ",T01P12_A10181AlRPieOri[0]);
            }
            if ( GXutil.strcmp(Z10182AlRPieDst, T01P12_A10182AlRPieDst[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlRPieDst");
               GXutil.writeLogRaw("Old: ",Z10182AlRPieDst);
               GXutil.writeLogRaw("Current: ",T01P12_A10182AlRPieDst[0]);
            }
            if ( DecimalUtil.compareTo(Z10183AlrPieKgmT, T01P12_A10183AlrPieKgmT[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"AlrPieKgmT");
               GXutil.writeLogRaw("Old: ",Z10183AlrPieKgmT);
               GXutil.writeLogRaw("Current: ",T01P12_A10183AlrPieKgmT[0]);
            }
            if ( GXutil.strcmp(Z7408ALRPIELOC, T01P12_A7408ALRPIELOC[0]) != 0 )
            {
               GXutil.writeLogln("talbdet2:[seudo value changed for attri]"+"ALRPIELOC");
               GXutil.writeLogRaw("Old: ",Z7408ALRPIELOC);
               GXutil.writeLogRaw("Current: ",T01P12_A7408ALRPIELOC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBDET"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1P1299( )
   {
      beforeValidate1P1299( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P1299( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1P1299( 0) ;
         checkOptimisticConcurrency1P1299( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P1299( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1P1299( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P156 */
                  pr_default.execute(48, new Object[] {A4795AlRPieCal, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A2154AlbRecAnh), Short.valueOf(A10762AlbPCont), A2157AlbRecMtr, A2155AlbRecKgm, A2158AlbRecMtrU, A2156AlbRecKgmU, A8779Bod_Talla, Short.valueOf(A8780Bod_Und), Short.valueOf(A3730AlbRecCol), A3731AlbRecIdPz, Integer.valueOf(A3732AlbRecIdRc), A4410AlbRecPal, A10180AlRPieTelT, Integer.valueOf(A10149AlRPieCon), A10181AlRPieOri, A10182AlRPieDst, A10183AlrPieKgmT, A7408ALRPIELOC, A396EmprCod, Boolean.valueOf(n4806AlRPieDefC), Integer.valueOf(A4806AlRPieDefC)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
                  if ( (pr_default.getStatus(48) == 1) )
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
            load1P1299( ) ;
         }
         endLevel1P1299( ) ;
      }
      closeExtendedTableCursors1P1299( ) ;
   }

   public void update1P1299( )
   {
      beforeValidate1P1299( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P1299( ) ;
      }
      if ( ( nIsMod_299 != 0 ) || ( nIsDirty_299 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1P1299( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1P1299( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1P1299( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01P157 */
                     pr_default.execute(49, new Object[] {A4795AlRPieCal, Short.valueOf(A2154AlbRecAnh), Short.valueOf(A10762AlbPCont), A2157AlbRecMtr, A2155AlbRecKgm, A2158AlbRecMtrU, A2156AlbRecKgmU, A8779Bod_Talla, Short.valueOf(A8780Bod_Und), Short.valueOf(A3730AlbRecCol), A3731AlbRecIdPz, Integer.valueOf(A3732AlbRecIdRc), A4410AlbRecPal, A10180AlRPieTelT, Integer.valueOf(A10149AlRPieCon), A10181AlRPieOri, A10182AlRPieDst, A10183AlrPieKgmT, A7408ALRPIELOC, Boolean.valueOf(n4806AlRPieDefC), Integer.valueOf(A4806AlRPieDefC), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
                     if ( (pr_default.getStatus(49) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBDET"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1P1299( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int8[0] = A44AlbRecCod ;
                        new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int8) ;
                        talbdet2_impl.this.A396EmprCod = GXv_char4[0] ;
                        talbdet2_impl.this.A44AlbRecCod = GXv_int8[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1P1299( ) ;
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
            endLevel1P1299( ) ;
         }
      }
      closeExtendedTableCursors1P1299( ) ;
   }

   public void deferredUpdate1P1299( )
   {
   }

   public void delete1P1299( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1P1299( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P1299( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1P1299( ) ;
         afterConfirm1P1299( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1P1299( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01P158 */
               pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
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
      sMode299 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1P1299( ) ;
      Gx_mode = sMode299 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1P1299( )
   {
      standaloneModal1P1299( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && true /* After */ && ( AV73Noctrlpz == 0 ) )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A2159AlbRecPie ;
            GXv_char2[0] = AV62Msg_err ;
            new app.pexipzae(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            talbdet2_impl.this.A396EmprCod = GXv_char4[0] ;
            talbdet2_impl.this.A2159AlbRecPie = GXv_char3[0] ;
            talbdet2_impl.this.AV62Msg_err = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV62Msg_err", AV62Msg_err);
         }
         if ( isIns( )  && true /* After */ && ( AV61NoPzaR == 1 ) && ( GXutil.strcmp(AV62Msg_err, " ") != 0 ) && ( AV80Velluts == 0 ) )
         {
            GXCCtl = "ALBRECPIE_" + sGXsfl_383_idx ;
            httpContext.GX_msglist.addItem(AV62Msg_err, 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRecPie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( isIns( )  && true /* After */ && ( AV61NoPzaR == 0 ) && ( GXutil.strcmp(AV62Msg_err, " ") != 0 ) && ( AV80Velluts == 0 ) && ( AV85Colorsol == 0 ) )
         {
            GXCCtl = "ALBRECPIE_" + sGXsfl_383_idx ;
            httpContext.GX_msglist.addItem(AV62Msg_err, 0, GXCCtl);
         }
         if ( isIns( )  && (GXutil.strcmp("", A2159AlbRecPie)==0) && ( AV48SumPza == 1 ) && true /* Level */ && true /* After */ )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int8[0] = A44AlbRecCod ;
            GXv_char3[0] = A2159AlbRecPie ;
            new app.pultpza(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
            talbdet2_impl.this.A396EmprCod = GXv_char4[0] ;
            talbdet2_impl.this.A44AlbRecCod = GXv_int8[0] ;
            talbdet2_impl.this.A2159AlbRecPie = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         }
         /* Using cursor T01P160 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(51) != 101) )
         {
            A4806AlRPieDefC = T01P160_A4806AlRPieDefC[0] ;
            n4806AlRPieDefC = T01P160_n4806AlRPieDefC[0] ;
         }
         else
         {
            A4806AlRPieDefC = 0 ;
            n4806AlRPieDefC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
         }
         pr_default.close(51);
         GXt_char1 = A13693AlbRecObs ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_char3[0] = A2159AlbRecPie ;
         GXv_char2[0] = GXt_char1 ;
         new app.palrpieuti(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
         talbdet2_impl.this.A396EmprCod = GXv_char4[0] ;
         talbdet2_impl.this.A44AlbRecCod = GXv_int8[0] ;
         talbdet2_impl.this.A2159AlbRecPie = GXv_char3[0] ;
         talbdet2_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A13693AlbRecObs = GXt_char1 ;
         if ( ( isDlt( )  ) && true /* Level */ )
         {
            GXt_int5 = AV81PzaProd ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int8[0] = A44AlbRecCod ;
            GXv_char3[0] = A2159AlbRecPie ;
            GXv_int6[0] = GXt_int5 ;
            new app.ppzaprod(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_int6) ;
            talbdet2_impl.this.A396EmprCod = GXv_char4[0] ;
            talbdet2_impl.this.A44AlbRecCod = GXv_int8[0] ;
            talbdet2_impl.this.A2159AlbRecPie = GXv_char3[0] ;
            talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            AV81PzaProd = GXt_int5 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81PzaProd", GXutil.str( AV81PzaProd, 1, 0));
         }
         if ( ( AV81PzaProd == 1 ) && ( isDlt( )  ) && true /* Level */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Pieza en Produccion ¡¡¡", ""), 1, "");
            AnyError = (short)(1) ;
         }
         if ( isIns( )  )
         {
            A10759SumMts = O10759SumMts.add(A2157AlbRecMtr) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A10759SumMts = O10759SumMts.add(A2157AlbRecMtr).subtract(O2157AlbRecMtr) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A10759SumMts = O10759SumMts.subtract(O2157AlbRecMtr) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
               }
            }
         }
         if ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() )
         {
            A4797AlRPieClaC = httpContext.getMessage( "A", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
         }
         else
         {
            if ( ( A4806AlRPieDefC > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
            {
               A4797AlRPieClaC = httpContext.getMessage( "B", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
            }
            else
            {
               if ( ( A4806AlRPieDefC > A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
               {
                  A4797AlRPieClaC = httpContext.getMessage( "C", "") ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
               }
               else
               {
                  A4797AlRPieClaC = httpContext.getMessage( "D", "") ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
               }
            }
         }
         if ( isIns( )  )
         {
            A10758SumKgs = O10758SumKgs.add(A2155AlbRecKgm) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A10758SumKgs = O10758SumKgs.add(A2155AlbRecKgm).subtract(O2155AlbRecKgm) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A10758SumKgs = O10758SumKgs.subtract(O2155AlbRecKgm) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
               }
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01P161 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlrPiF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01P162 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HILZPZ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01P163 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlRPi1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01P164 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Historia de las Piezas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01P165 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlRPieDef", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
      }
   }

   public void endLevel1P1299( )
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

   public void scanStart1P1299( )
   {
      /* Scan By routine */
      /* Using cursor T01P166 */
      pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      RcdFound299 = (short)(0) ;
      if ( (pr_default.getStatus(57) != 101) )
      {
         RcdFound299 = (short)(1) ;
         A2159AlbRecPie = T01P166_A2159AlbRecPie[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1P1299( )
   {
      /* Scan next routine */
      pr_default.readNext(57);
      RcdFound299 = (short)(0) ;
      if ( (pr_default.getStatus(57) != 101) )
      {
         RcdFound299 = (short)(1) ;
         A2159AlbRecPie = T01P166_A2159AlbRecPie[0] ;
      }
   }

   public void scanEnd1P1299( )
   {
      pr_default.close(57);
   }

   public void afterConfirm1P1299( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(A2159AlbRecPie, " ") == 0 ) && true /* After */ && true /* Level */ )
      {
         GXCCtl = "ALBRECPIE_" + sGXsfl_383_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Numero de Pieza ¡¡¡", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecPie_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1P1299( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1P1299( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1P1299( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1P1299( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1P1299( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1P1299( )
   {
      edtAlbRecPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_383_Refreshing);
      edtAlbRecAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecAnh_Enabled), 5, 0), !bGXsfl_383_Refreshing);
      edtALRPIELOC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtALRPIELOC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALRPIELOC_Enabled), 5, 0), !bGXsfl_383_Refreshing);
      edtAlbRecMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtr_Enabled), 5, 0), !bGXsfl_383_Refreshing);
      edtAlbRecKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgm_Enabled), 5, 0), !bGXsfl_383_Refreshing);
      edtAlbRecMtrU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtrU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtrU_Enabled), 5, 0), !bGXsfl_383_Refreshing);
      edtAlbRecKgmU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgmU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgmU_Enabled), 5, 0), !bGXsfl_383_Refreshing);
      edtAlbRecObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecObs_Enabled), 5, 0), !bGXsfl_383_Refreshing);
   }

   public void send_integrity_lvl_hashes1P1299( )
   {
   }

   public void send_integrity_lvl_hashes1P17( )
   {
   }

   public void subsflControlProps_383299( )
   {
      edtAlbRecPie_Internalname = "ALBRECPIE_"+sGXsfl_383_idx ;
      edtAlbRecAnh_Internalname = "ALBRECANH_"+sGXsfl_383_idx ;
      edtALRPIELOC_Internalname = "ALRPIELOC_"+sGXsfl_383_idx ;
      edtAlbRecMtr_Internalname = "ALBRECMTR_"+sGXsfl_383_idx ;
      edtAlbRecKgm_Internalname = "ALBRECKGM_"+sGXsfl_383_idx ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU_"+sGXsfl_383_idx ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU_"+sGXsfl_383_idx ;
      edtAlbRecObs_Internalname = "ALBRECOBS_"+sGXsfl_383_idx ;
   }

   public void subsflControlProps_fel_383299( )
   {
      edtAlbRecPie_Internalname = "ALBRECPIE_"+sGXsfl_383_fel_idx ;
      edtAlbRecAnh_Internalname = "ALBRECANH_"+sGXsfl_383_fel_idx ;
      edtALRPIELOC_Internalname = "ALRPIELOC_"+sGXsfl_383_fel_idx ;
      edtAlbRecMtr_Internalname = "ALBRECMTR_"+sGXsfl_383_fel_idx ;
      edtAlbRecKgm_Internalname = "ALBRECKGM_"+sGXsfl_383_fel_idx ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU_"+sGXsfl_383_fel_idx ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU_"+sGXsfl_383_fel_idx ;
      edtAlbRecObs_Internalname = "ALBRECOBS_"+sGXsfl_383_fel_idx ;
   }

   public void addRow1P1299( )
   {
      nGXsfl_383_idx = (int)(nGXsfl_383_idx+1) ;
      sGXsfl_383_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_383_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_383299( ) ;
      sendRow1P1299( ) ;
   }

   public void sendRow1P1299( )
   {
      Gridlevel_piezasRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_piezas_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_piezas_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_piezas_Class, "") != 0 )
         {
            subGridlevel_piezas_Linesclass = subGridlevel_piezas_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_piezas_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_piezas_Backstyle = (byte)(0) ;
         subGridlevel_piezas_Backcolor = subGridlevel_piezas_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_piezas_Class, "") != 0 )
         {
            subGridlevel_piezas_Linesclass = subGridlevel_piezas_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_piezas_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_piezas_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_piezas_Class, "") != 0 )
         {
            subGridlevel_piezas_Linesclass = subGridlevel_piezas_Class+"Odd" ;
         }
         subGridlevel_piezas_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_piezas_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_piezas_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_383_idx) % (2))) == 0 )
         {
            subGridlevel_piezas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_piezas_Class, "") != 0 )
            {
               subGridlevel_piezas_Linesclass = subGridlevel_piezas_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_piezas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_piezas_Class, "") != 0 )
            {
               subGridlevel_piezas_Linesclass = subGridlevel_piezas_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_383_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 384,'',false,'" + sGXsfl_383_idx + "',383)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecPie_Internalname,GXutil.rtrim( A2159AlbRecPie),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,384);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecPie_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(383),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_383_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 385,'',false,'" + sGXsfl_383_idx + "',383)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecAnh_Internalname,GXutil.ltrim( localUtil.ntoc( A2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2154AlbRecAnh), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2154AlbRecAnh), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,385);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecAnh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecAnh_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(383),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtALRPIELOC_Internalname,GXutil.rtrim( A7408ALRPIELOC),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtALRPIELOC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtALRPIELOC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(383),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_383_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 387,'',false,'" + sGXsfl_383_idx + "',383)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecMtr_Enabled!=0) ? localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99") : localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,387);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(383),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_383_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 388,'',false,'" + sGXsfl_383_idx + "',383)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecKgm_Enabled!=0) ? localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99") : localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,388);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(383),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_383_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 389,'',false,'" + sGXsfl_383_idx + "',383)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecMtrU_Internalname,GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecMtrU_Enabled!=0) ? localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99") : localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,389);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecMtrU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecMtrU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(383),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_383_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 390,'',false,'" + sGXsfl_383_idx + "',383)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecKgmU_Internalname,GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecKgmU_Enabled!=0) ? localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99") : localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,390);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecKgmU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecKgmU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(383),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_piezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecObs_Internalname,GXutil.rtrim( A13693AlbRecObs),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(383),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_piezasRow);
      send_integrity_lvl_hashes1P1299( ) ;
      GXCCtl = "Z2159AlbRecPie_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2159AlbRecPie));
      GXCCtl = "Z4795AlRPieCal_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4795AlRPieCal));
      GXCCtl = "Z2154AlbRecAnh_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10762AlbPCont_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10762AlbPCont, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2157AlbRecMtr_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2155AlbRecKgm_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2158AlbRecMtrU_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2156AlbRecKgmU_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8779Bod_Talla_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8779Bod_Talla));
      GXCCtl = "Z8780Bod_Und_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8780Bod_Und, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3730AlbRecCol_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3730AlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3731AlbRecIdPz_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3731AlbRecIdPz));
      GXCCtl = "Z3732AlbRecIdRc_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3732AlbRecIdRc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4410AlbRecPal_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4410AlbRecPal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10180AlRPieTelT_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10180AlRPieTelT));
      GXCCtl = "Z10149AlRPieCon_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10149AlRPieCon, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10181AlRPieOri_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10181AlRPieOri));
      GXCCtl = "Z10182AlRPieDst_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10182AlRPieDst));
      GXCCtl = "Z10183AlrPieKgmT_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10183AlrPieKgmT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7408ALRPIELOC_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7408ALRPIELOC));
      GXCCtl = "O2155AlbRecKgm_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2157AlbRecMtr_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "ALBPCONT_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A10762AlbPCont, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_299_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_299_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_299_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_383_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV107TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV107TrnContext);
      }
      GXCCtl = "EMPRCOD_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "vEMPRCOD_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV104EmprCod));
      GXCCtl = "vALBRECCOD_" + sGXsfl_383_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV105AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECPIE_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECANH_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIELOC_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIELOC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECMTR_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECKGM_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECMTRU_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECKGMU_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECOBS_"+sGXsfl_383_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_piezasContainer.AddRow(Gridlevel_piezasRow);
   }

   public void readRow1P1299( )
   {
      nGXsfl_383_idx = (int)(nGXsfl_383_idx+1) ;
      sGXsfl_383_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_383_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_383299( ) ;
      edtAlbRecPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECPIE_"+sGXsfl_383_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecAnh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECANH_"+sGXsfl_383_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtALRPIELOC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALRPIELOC_"+sGXsfl_383_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTR_"+sGXsfl_383_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGM_"+sGXsfl_383_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecMtrU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTRU_"+sGXsfl_383_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecKgmU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGMU_"+sGXsfl_383_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECOBS_"+sGXsfl_383_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A2159AlbRecPie = httpContext.cgiGet( edtAlbRecPie_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "ALBRECANH_" + sGXsfl_383_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecAnh_Internalname ;
         wbErr = true ;
         A2154AlbRecAnh = (short)(0) ;
      }
      else
      {
         A2154AlbRecAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRecAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A7408ALRPIELOC = httpContext.cgiGet( edtALRPIELOC_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBRECMTR_" + sGXsfl_383_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecMtr_Internalname ;
         wbErr = true ;
         A2157AlbRecMtr = DecimalUtil.ZERO ;
      }
      else
      {
         A2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBRECKGM_" + sGXsfl_383_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecKgm_Internalname ;
         wbErr = true ;
         A2155AlbRecKgm = DecimalUtil.ZERO ;
      }
      else
      {
         A2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBRECMTRU_" + sGXsfl_383_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecMtrU_Internalname ;
         wbErr = true ;
         A2158AlbRecMtrU = DecimalUtil.ZERO ;
      }
      else
      {
         A2158AlbRecMtrU = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBRECKGMU_" + sGXsfl_383_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecKgmU_Internalname ;
         wbErr = true ;
         A2156AlbRecKgmU = DecimalUtil.ZERO ;
      }
      else
      {
         A2156AlbRecKgmU = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)) ;
      }
      A13693AlbRecObs = httpContext.cgiGet( edtAlbRecObs_Internalname) ;
      GXCCtl = "Z2159AlbRecPie_" + sGXsfl_383_idx ;
      Z2159AlbRecPie = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4795AlRPieCal_" + sGXsfl_383_idx ;
      Z4795AlRPieCal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2154AlbRecAnh_" + sGXsfl_383_idx ;
      Z2154AlbRecAnh = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10762AlbPCont_" + sGXsfl_383_idx ;
      Z10762AlbPCont = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2157AlbRecMtr_" + sGXsfl_383_idx ;
      Z2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2155AlbRecKgm_" + sGXsfl_383_idx ;
      Z2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2158AlbRecMtrU_" + sGXsfl_383_idx ;
      Z2158AlbRecMtrU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2156AlbRecKgmU_" + sGXsfl_383_idx ;
      Z2156AlbRecKgmU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8779Bod_Talla_" + sGXsfl_383_idx ;
      Z8779Bod_Talla = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8780Bod_Und_" + sGXsfl_383_idx ;
      Z8780Bod_Und = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3730AlbRecCol_" + sGXsfl_383_idx ;
      Z3730AlbRecCol = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3731AlbRecIdPz_" + sGXsfl_383_idx ;
      Z3731AlbRecIdPz = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3732AlbRecIdRc_" + sGXsfl_383_idx ;
      Z3732AlbRecIdRc = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4410AlbRecPal_" + sGXsfl_383_idx ;
      Z4410AlbRecPal = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10180AlRPieTelT_" + sGXsfl_383_idx ;
      Z10180AlRPieTelT = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10149AlRPieCon_" + sGXsfl_383_idx ;
      Z10149AlRPieCon = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10181AlRPieOri_" + sGXsfl_383_idx ;
      Z10181AlRPieOri = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10182AlRPieDst_" + sGXsfl_383_idx ;
      Z10182AlRPieDst = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10183AlrPieKgmT_" + sGXsfl_383_idx ;
      Z10183AlrPieKgmT = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7408ALRPIELOC_" + sGXsfl_383_idx ;
      Z7408ALRPIELOC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4795AlRPieCal_" + sGXsfl_383_idx ;
      A4795AlRPieCal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10762AlbPCont_" + sGXsfl_383_idx ;
      A10762AlbPCont = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8779Bod_Talla_" + sGXsfl_383_idx ;
      A8779Bod_Talla = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8780Bod_Und_" + sGXsfl_383_idx ;
      A8780Bod_Und = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3730AlbRecCol_" + sGXsfl_383_idx ;
      A3730AlbRecCol = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3731AlbRecIdPz_" + sGXsfl_383_idx ;
      A3731AlbRecIdPz = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3732AlbRecIdRc_" + sGXsfl_383_idx ;
      A3732AlbRecIdRc = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4410AlbRecPal_" + sGXsfl_383_idx ;
      A4410AlbRecPal = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10180AlRPieTelT_" + sGXsfl_383_idx ;
      A10180AlRPieTelT = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10149AlRPieCon_" + sGXsfl_383_idx ;
      A10149AlRPieCon = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10181AlRPieOri_" + sGXsfl_383_idx ;
      A10181AlRPieOri = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10182AlRPieDst_" + sGXsfl_383_idx ;
      A10182AlRPieDst = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10183AlrPieKgmT_" + sGXsfl_383_idx ;
      A10183AlrPieKgmT = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O2155AlbRecKgm_" + sGXsfl_383_idx ;
      O2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O2157AlbRecMtr_" + sGXsfl_383_idx ;
      O2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "ALBPCONT_" + sGXsfl_383_idx ;
      A10762AlbPCont = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_299_" + sGXsfl_383_idx ;
      nRcdDeleted_299 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_299_" + sGXsfl_383_idx ;
      nRcdExists_299 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_299_" + sGXsfl_383_idx ;
      nIsMod_299 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtALRPIELOC_Enabled = edtALRPIELOC_Enabled ;
      defedtAlbRecPie_Enabled = edtAlbRecPie_Enabled ;
   }

   public void confirmValues1P10( )
   {
      nGXsfl_383_idx = 0 ;
      sGXsfl_383_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_383_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_383299( ) ;
      while ( nGXsfl_383_idx < nRC_GXsfl_383 )
      {
         nGXsfl_383_idx = (int)(nGXsfl_383_idx+1) ;
         sGXsfl_383_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_383_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_383299( ) ;
         httpContext.changePostValue( "Z2159AlbRecPie_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_383_idx) ;
         httpContext.changePostValue( "Z4795AlRPieCal_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_383_idx) ;
         httpContext.changePostValue( "Z2154AlbRecAnh_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z2154AlbRecAnh_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2154AlbRecAnh_"+sGXsfl_383_idx) ;
         httpContext.changePostValue( "Z10762AlbPCont_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z10762AlbPCont_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10762AlbPCont_"+sGXsfl_383_idx) ;
         httpContext.changePostValue( "Z2157AlbRecMtr_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_383_idx) ;
         httpContext.changePostValue( "Z2155AlbRecKgm_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_383_idx) ;
         httpContext.changePostValue( "Z2158AlbRecMtrU_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z2158AlbRecMtrU_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2158AlbRecMtrU_"+sGXsfl_383_idx) ;
         httpContext.changePostValue( "Z2156AlbRecKgmU_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z2156AlbRecKgmU_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2156AlbRecKgmU_"+sGXsfl_383_idx) ;
         httpContext.changePostValue( "Z8779Bod_Talla_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z8779Bod_Talla_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8779Bod_Talla_"+sGXsfl_383_idx) ;
         httpContext.changePostValue( "Z8780Bod_Und_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z8780Bod_Und_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8780Bod_Und_"+sGXsfl_383_idx) ;
         httpContext.changePostValue( "Z3730AlbRecCol_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z3730AlbRecCol_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3730AlbRecCol_"+sGXsfl_383_idx) ;
         httpContext.changePostValue( "Z3731AlbRecIdPz_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z3731AlbRecIdPz_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3731AlbRecIdPz_"+sGXsfl_383_idx) ;
         httpContext.changePostValue( "Z3732AlbRecIdRc_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z3732AlbRecIdRc_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3732AlbRecIdRc_"+sGXsfl_383_idx) ;
         httpContext.changePostValue( "Z4410AlbRecPal_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z4410AlbRecPal_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4410AlbRecPal_"+sGXsfl_383_idx) ;
         httpContext.changePostValue( "Z10180AlRPieTelT_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z10180AlRPieTelT_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10180AlRPieTelT_"+sGXsfl_383_idx) ;
         httpContext.changePostValue( "Z10149AlRPieCon_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z10149AlRPieCon_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10149AlRPieCon_"+sGXsfl_383_idx) ;
         httpContext.changePostValue( "Z10181AlRPieOri_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z10181AlRPieOri_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10181AlRPieOri_"+sGXsfl_383_idx) ;
         httpContext.changePostValue( "Z10182AlRPieDst_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z10182AlRPieDst_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10182AlRPieDst_"+sGXsfl_383_idx) ;
         httpContext.changePostValue( "Z10183AlrPieKgmT_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z10183AlrPieKgmT_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10183AlrPieKgmT_"+sGXsfl_383_idx) ;
         httpContext.changePostValue( "Z7408ALRPIELOC_"+sGXsfl_383_idx, httpContext.cgiGet( "ZT_"+"Z7408ALRPIELOC_"+sGXsfl_383_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7408ALRPIELOC_"+sGXsfl_383_idx) ;
      }
      httpContext.changePostValue( "O2155AlbRecKgm", httpContext.cgiGet( "T2155AlbRecKgm")) ;
      httpContext.deletePostValue( "T2155AlbRecKgm") ;
      httpContext.changePostValue( "O2157AlbRecMtr", httpContext.cgiGet( "T2157AlbRecMtr")) ;
      httpContext.deletePostValue( "T2157AlbRecMtr") ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.talbdet2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV104EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV105AlbRecCod,8,0))}, new String[] {"Gx_mode","EmprCod","AlbRecCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TALBDET2");
      forbiddenHiddens.add("AlbRPh", localUtil.format( A13241AlbRPh, "ZZ9.99"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("CliCod", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"));
      forbiddenHiddens.add("AlbREnt", GXutil.rtrim( localUtil.format( A46AlbREnt, "")));
      forbiddenHiddens.add("AlbREnt2", GXutil.rtrim( localUtil.format( A5806AlbREnt2, "")));
      forbiddenHiddens.add("AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      forbiddenHiddens.add("AlbRHEn", localUtil.format( A4606AlbRHEn, "99/99/99 99:99"));
      forbiddenHiddens.add("AlbRef", GXutil.rtrim( localUtil.format( A45AlbRef, "")));
      forbiddenHiddens.add("AlbRefDsc", GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")));
      forbiddenHiddens.add("AlbRDes", GXutil.rtrim( localUtil.format( A1291AlbRDes, "")));
      forbiddenHiddens.add("AlbRLoc", GXutil.rtrim( localUtil.format( A50AlbRLoc, "")));
      forbiddenHiddens.add("AlbRReo", GXutil.rtrim( localUtil.format( A55AlbRReo, "@!")));
      forbiddenHiddens.add("AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      forbiddenHiddens.add("AlbrUniC", localUtil.format( A6180AlbrUniC, "ZZZZZ9.99"));
      forbiddenHiddens.add("AlbrPieC", localUtil.format( DecimalUtil.doubleToDec(A6181AlbrPieC), "ZZZZZ9"));
      forbiddenHiddens.add("AlbRGrm2", localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9"));
      forbiddenHiddens.add("AlbRAnc", localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9"));
      forbiddenHiddens.add("AlbPml", localUtil.format( DecimalUtil.doubleToDec(A4922AlbPml), "ZZZ9"));
      forbiddenHiddens.add("AlbRLote", GXutil.rtrim( localUtil.format( A6463AlbRLote, "")));
      forbiddenHiddens.add("AlbRRLong", localUtil.format( A13242AlbRRLong, "ZZ9.99"));
      forbiddenHiddens.add("AlbRRTrans", localUtil.format( A13243AlbRRTrans, "ZZ9.99"));
      forbiddenHiddens.add("AlbNumM", GXutil.rtrim( localUtil.format( A8029AlbNumM, "")));
      forbiddenHiddens.add("AlbRPieReb", localUtil.format( DecimalUtil.doubleToDec(A53AlbRPieReb), "ZZZ9"));
      forbiddenHiddens.add("AlbRUniReb", localUtil.format( A59AlbRUniReb, "ZZZZZ9.99"));
      forbiddenHiddens.add("AlbRecSec", localUtil.format( DecimalUtil.doubleToDec(A7501AlbRecSec), "ZZ9"));
      forbiddenHiddens.add("AlbNumEti", localUtil.format( DecimalUtil.doubleToDec(A1222AlbNumEti), "ZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("talbdet2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z46AlbREnt", GXutil.rtrim( Z46AlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5806AlbREnt2", GXutil.rtrim( Z5806AlbREnt2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z49AlbRFen", localUtil.dtoc( Z49AlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4606AlbRHEn", localUtil.ttoc( Z4606AlbRHEn, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3613AlbRefDsc", GXutil.rtrim( Z3613AlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1291AlbRDes", GXutil.rtrim( Z1291AlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z50AlbRLoc", GXutil.rtrim( Z50AlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z55AlbRReo", GXutil.rtrim( Z55AlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z48AlbRFecUlt", localUtil.dtoc( Z48AlbRFecUlt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6180AlbrUniC", GXutil.ltrim( localUtil.ntoc( Z6180AlbrUniC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6181AlbrPieC", GXutil.ltrim( localUtil.ntoc( Z6181AlbrPieC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4920AlbRGrm2", GXutil.ltrim( localUtil.ntoc( Z4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4921AlbRAnc", GXutil.ltrim( localUtil.ntoc( Z4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4922AlbPml", GXutil.ltrim( localUtil.ntoc( Z4922AlbPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6463AlbRLote", GXutil.rtrim( Z6463AlbRLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13241AlbRPh", GXutil.ltrim( localUtil.ntoc( Z13241AlbRPh, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13242AlbRRLong", GXutil.ltrim( localUtil.ntoc( Z13242AlbRRLong, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13243AlbRRTrans", GXutil.ltrim( localUtil.ntoc( Z13243AlbRRTrans, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8029AlbNumM", GXutil.rtrim( Z8029AlbNumM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z53AlbRPieReb", GXutil.ltrim( localUtil.ntoc( Z53AlbRPieReb, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z59AlbRUniReb", GXutil.ltrim( localUtil.ntoc( Z59AlbRUniReb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10761AlbUltP", GXutil.ltrim( localUtil.ntoc( Z10761AlbUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7501AlbRecSec", GXutil.ltrim( localUtil.ntoc( Z7501AlbRecSec, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1222AlbNumEti", GXutil.ltrim( localUtil.ntoc( Z1222AlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z970ProceCod", GXutil.ltrim( localUtil.ntoc( Z970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1211TipEntCod", GXutil.ltrim( localUtil.ntoc( Z1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O10761AlbUltP", GXutil.ltrim( localUtil.ntoc( O10761AlbUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O10760SumPzs", GXutil.ltrim( localUtil.ntoc( O10760SumPzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O10758SumKgs", GXutil.ltrim( localUtil.ntoc( O10758SumKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O10759SumMts", GXutil.ltrim( localUtil.ntoc( O10759SumMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_383", GXutil.ltrim( localUtil.ntoc( nGXsfl_383_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N970ProceCod", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N1211TipEntCod", GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV107TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV107TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV107TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDETMTR", GXutil.ltrim( localUtil.ntoc( A2149AlbDetMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDETMTRU", GXutil.ltrim( localUtil.ntoc( A2151AlbDetMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDETMTRD", GXutil.ltrim( localUtil.ntoc( A2150AlbDetMtrD, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDETKGM", GXutil.ltrim( localUtil.ntoc( A2146AlbDetKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDETKGMU", GXutil.ltrim( localUtil.ntoc( A2148AlbDetKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDETKGMD", GXutil.ltrim( localUtil.ntoc( A2147AlbDetKgmD, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV104EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV104EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV105AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV105AlbRecCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CLICOD", GXutil.ltrim( localUtil.ntoc( AV109Insert_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PROCECOD", GXutil.ltrim( localUtil.ntoc( AV110Insert_ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCECOD", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRNCOD", GXutil.ltrim( localUtil.ntoc( AV111Insert_TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNCOD", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TIPENTCOD", GXutil.ltrim( localUtil.ntoc( AV112Insert_TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPENTCOD", GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDETPIE", GXutil.ltrim( localUtil.ntoc( A2152AlbDetPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDETPIEU", GXutil.ltrim( localUtil.ntoc( A2153AlbDetPieU, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEREB", GXutil.ltrim( localUtil.ntoc( A53AlbRPieReb, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIREB", GXutil.ltrim( localUtil.ntoc( A59AlbRUniReb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBULTP", GXutil.ltrim( localUtil.ntoc( A10761AlbUltP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECSEC", GXutil.ltrim( localUtil.ntoc( A7501AlbRecSec, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBNUMETI", GXutil.ltrim( localUtil.ntoc( A1222AlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV125Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIECAL", GXutil.rtrim( A4795AlRPieCal));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIEDEFC", GXutil.ltrim( localUtil.ntoc( A4806AlRPieDefC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIECLAC", GXutil.rtrim( A4797AlRPieClaC));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPCONT", GXutil.ltrim( localUtil.ntoc( A10762AlbPCont, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPZAPROD", GXutil.ltrim( localUtil.ntoc( AV81PzaProd, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERR", GXutil.rtrim( AV62Msg_err));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOPZAR", GXutil.ltrim( localUtil.ntoc( AV61NoPzaR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVELLUTS", GXutil.ltrim( localUtil.ntoc( AV80Velluts, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRDTO", GXutil.ltrim( localUtil.ntoc( AV49Rdto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPESOML", GXutil.ltrim( localUtil.ntoc( AV50Pesoml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vANC", GXutil.ltrim( localUtil.ntoc( AV100Anc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRM2", GXutil.ltrim( localUtil.ntoc( AV101grm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_TALLA", GXutil.rtrim( A8779Bod_Talla));
      app.GxWebStd.gx_hidden_field( httpContext, "BOD_UND", GXutil.ltrim( localUtil.ntoc( A8780Bod_Und, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOL", GXutil.ltrim( localUtil.ntoc( A3730AlbRecCol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECIDPZ", GXutil.rtrim( A3731AlbRecIdPz));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECIDRC", GXutil.ltrim( localUtil.ntoc( A3732AlbRecIdRc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECPAL", GXutil.ltrim( localUtil.ntoc( A4410AlbRecPal, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIETELT", GXutil.rtrim( A10180AlRPieTelT));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIECON", GXutil.ltrim( localUtil.ntoc( A10149AlRPieCon, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIEORI", GXutil.rtrim( A10181AlRPieOri));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIEDST", GXutil.rtrim( A10182AlRPieDst));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIEKGMT", GXutil.ltrim( localUtil.ntoc( A10183AlrPieKgmT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable6_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Enabled", GXutil.booltostr( Dvpanel_unnamedtable6_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Width", GXutil.rtrim( Dvpanel_unnamedtable6_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable6_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable6_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Cls", GXutil.rtrim( Dvpanel_unnamedtable6_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Title", GXutil.rtrim( Dvpanel_unnamedtable6_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable6_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable6_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable6_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable7_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Enabled", GXutil.booltostr( Dvpanel_unnamedtable7_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Width", GXutil.rtrim( Dvpanel_unnamedtable7_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable7_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable7_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Cls", GXutil.rtrim( Dvpanel_unnamedtable7_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Title", GXutil.rtrim( Dvpanel_unnamedtable7_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable7_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable7_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable7_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable8_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Enabled", GXutil.booltostr( Dvpanel_unnamedtable8_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Width", GXutil.rtrim( Dvpanel_unnamedtable8_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable8_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable8_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Cls", GXutil.rtrim( Dvpanel_unnamedtable8_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Title", GXutil.rtrim( Dvpanel_unnamedtable8_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable8_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable8_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable8_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable8_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable8_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable9_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Enabled", GXutil.booltostr( Dvpanel_unnamedtable9_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Width", GXutil.rtrim( Dvpanel_unnamedtable9_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable9_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable9_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Cls", GXutil.rtrim( Dvpanel_unnamedtable9_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Title", GXutil.rtrim( Dvpanel_unnamedtable9_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable9_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable9_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable9_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable9_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable9_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable10_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Enabled", GXutil.booltostr( Dvpanel_unnamedtable10_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Width", GXutil.rtrim( Dvpanel_unnamedtable10_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable10_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable10_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Cls", GXutil.rtrim( Dvpanel_unnamedtable10_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Title", GXutil.rtrim( Dvpanel_unnamedtable10_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable10_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable10_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable10_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable10_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE10_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable10_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable11_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Enabled", GXutil.booltostr( Dvpanel_unnamedtable11_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Width", GXutil.rtrim( Dvpanel_unnamedtable11_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable11_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable11_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Cls", GXutil.rtrim( Dvpanel_unnamedtable11_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Title", GXutil.rtrim( Dvpanel_unnamedtable11_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable11_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable11_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable11_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable11_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE11_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable11_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE12_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable12_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE12_Enabled", GXutil.booltostr( Dvpanel_unnamedtable12_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE12_Width", GXutil.rtrim( Dvpanel_unnamedtable12_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE12_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable12_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE12_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable12_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE12_Cls", GXutil.rtrim( Dvpanel_unnamedtable12_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE12_Title", GXutil.rtrim( Dvpanel_unnamedtable12_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE12_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable12_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE12_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable12_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE12_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable12_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE12_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable12_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE12_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable12_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE13_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable13_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE13_Enabled", GXutil.booltostr( Dvpanel_unnamedtable13_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE13_Width", GXutil.rtrim( Dvpanel_unnamedtable13_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE13_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable13_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE13_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable13_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE13_Cls", GXutil.rtrim( Dvpanel_unnamedtable13_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE13_Title", GXutil.rtrim( Dvpanel_unnamedtable13_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE13_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable13_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE13_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable13_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE13_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable13_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE13_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable13_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE13_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable13_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE14_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable14_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE14_Enabled", GXutil.booltostr( Dvpanel_unnamedtable14_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE14_Width", GXutil.rtrim( Dvpanel_unnamedtable14_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE14_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable14_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE14_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable14_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE14_Cls", GXutil.rtrim( Dvpanel_unnamedtable14_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE14_Title", GXutil.rtrim( Dvpanel_unnamedtable14_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE14_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable14_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE14_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable14_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE14_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable14_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE14_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable14_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE14_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable14_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLNUMERARPIEZAS_Objectcall", GXutil.rtrim( Dvpanel_pnlnumerarpiezas_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLNUMERARPIEZAS_Enabled", GXutil.booltostr( Dvpanel_pnlnumerarpiezas_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLNUMERARPIEZAS_Width", GXutil.rtrim( Dvpanel_pnlnumerarpiezas_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLNUMERARPIEZAS_Autowidth", GXutil.booltostr( Dvpanel_pnlnumerarpiezas_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLNUMERARPIEZAS_Autoheight", GXutil.booltostr( Dvpanel_pnlnumerarpiezas_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLNUMERARPIEZAS_Cls", GXutil.rtrim( Dvpanel_pnlnumerarpiezas_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLNUMERARPIEZAS_Title", GXutil.rtrim( Dvpanel_pnlnumerarpiezas_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLNUMERARPIEZAS_Collapsible", GXutil.booltostr( Dvpanel_pnlnumerarpiezas_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLNUMERARPIEZAS_Collapsed", GXutil.booltostr( Dvpanel_pnlnumerarpiezas_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLNUMERARPIEZAS_Showcollapseicon", GXutil.booltostr( Dvpanel_pnlnumerarpiezas_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLNUMERARPIEZAS_Iconposition", GXutil.rtrim( Dvpanel_pnlnumerarpiezas_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLNUMERARPIEZAS_Autoscroll", GXutil.booltostr( Dvpanel_pnlnumerarpiezas_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLDETALLEPIEZAS_Objectcall", GXutil.rtrim( Dvpanel_pnldetallepiezas_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLDETALLEPIEZAS_Enabled", GXutil.booltostr( Dvpanel_pnldetallepiezas_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLDETALLEPIEZAS_Width", GXutil.rtrim( Dvpanel_pnldetallepiezas_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLDETALLEPIEZAS_Autowidth", GXutil.booltostr( Dvpanel_pnldetallepiezas_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLDETALLEPIEZAS_Autoheight", GXutil.booltostr( Dvpanel_pnldetallepiezas_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLDETALLEPIEZAS_Cls", GXutil.rtrim( Dvpanel_pnldetallepiezas_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLDETALLEPIEZAS_Title", GXutil.rtrim( Dvpanel_pnldetallepiezas_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLDETALLEPIEZAS_Collapsible", GXutil.booltostr( Dvpanel_pnldetallepiezas_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLDETALLEPIEZAS_Collapsed", GXutil.booltostr( Dvpanel_pnldetallepiezas_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLDETALLEPIEZAS_Showcollapseicon", GXutil.booltostr( Dvpanel_pnldetallepiezas_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLDETALLEPIEZAS_Iconposition", GXutil.rtrim( Dvpanel_pnldetallepiezas_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLDETALLEPIEZAS_Autoscroll", GXutil.booltostr( Dvpanel_pnldetallepiezas_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLBOTONES_Objectcall", GXutil.rtrim( Dvpanel_pnlbotones_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLBOTONES_Enabled", GXutil.booltostr( Dvpanel_pnlbotones_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLBOTONES_Width", GXutil.rtrim( Dvpanel_pnlbotones_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLBOTONES_Autowidth", GXutil.booltostr( Dvpanel_pnlbotones_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLBOTONES_Autoheight", GXutil.booltostr( Dvpanel_pnlbotones_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLBOTONES_Cls", GXutil.rtrim( Dvpanel_pnlbotones_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLBOTONES_Title", GXutil.rtrim( Dvpanel_pnlbotones_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLBOTONES_Collapsible", GXutil.booltostr( Dvpanel_pnlbotones_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLBOTONES_Collapsed", GXutil.booltostr( Dvpanel_pnlbotones_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLBOTONES_Showcollapseicon", GXutil.booltostr( Dvpanel_pnlbotones_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLBOTONES_Iconposition", GXutil.rtrim( Dvpanel_pnlbotones_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLBOTONES_Autoscroll", GXutil.booltostr( Dvpanel_pnlbotones_Autoscroll));
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
      return formatLink("app.talbdet2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV104EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV105AlbRecCod,8,0))}, new String[] {"Gx_mode","EmprCod","AlbRecCod"})  ;
   }

   public String getPgmname( )
   {
      return "TALBDET2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento Almacen Entradas Tela (Detail)", "") ;
   }

   public void initializeNonKey1P17( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A970ProceCod = (short)(0) ;
      n970ProceCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A1211TipEntCod = (short)(0) ;
      n1211TipEntCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A47AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      A2147AlbDetKgmD = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      A2150AlbDetMtrD = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      A2153AlbDetPieU = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      A46AlbREnt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
      A5806AlbREnt2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
      A49AlbRFen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      A4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      n4606AlbRHEn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4606AlbRHEn", localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A45AlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A3613AlbRefDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
      A971ProceNom = "" ;
      n971ProceNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A1212TipEntNom = "" ;
      n1212TipEntNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
      A1291AlbRDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
      A56AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A50AlbRLoc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
      A55AlbRReo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      A48AlbRFecUlt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      A6180AlbrUniC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
      A6181AlbrPieC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
      A4920AlbRGrm2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
      A4921AlbRAnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
      A4922AlbPml = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
      A6463AlbRLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
      A13241AlbRPh = DecimalUtil.ZERO ;
      n13241AlbRPh = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13241AlbRPh", GXutil.ltrimstr( A13241AlbRPh, 6, 2));
      A13242AlbRRLong = DecimalUtil.ZERO ;
      n13242AlbRRLong = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13242AlbRRLong", GXutil.ltrimstr( A13242AlbRRLong, 6, 2));
      A13243AlbRRTrans = DecimalUtil.ZERO ;
      n13243AlbRRTrans = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13243AlbRRTrans", GXutil.ltrimstr( A13243AlbRRTrans, 6, 2));
      A8029AlbNumM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
      A53AlbRPieReb = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
      A59AlbRUniReb = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
      A10761AlbUltP = (short)(0) ;
      n10761AlbUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
      A7501AlbRecSec = (short)(0) ;
      n7501AlbRecSec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7501AlbRecSec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7501AlbRecSec), 3, 0));
      A1222AlbNumEti = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
      A2152AlbDetPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
      A2149AlbDetMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
      A2146AlbDetKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
      A2151AlbDetMtrU = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
      A2148AlbDetKgmU = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      A10758SumKgs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
      A10759SumMts = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
      A10760SumPzs = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      O10761AlbUltP = A10761AlbUltP ;
      n10761AlbUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
      O10760SumPzs = A10760SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
      O10758SumKgs = A10758SumKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrimstr( A10758SumKgs, 9, 2));
      O10759SumMts = A10759SumMts ;
      httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrimstr( A10759SumMts, 9, 2));
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z52AlbRPieEnt = 0 ;
      Z54AlbRPieUti = 0 ;
      Z47AlbREst = (byte)(0) ;
      Z46AlbREnt = "" ;
      Z5806AlbREnt2 = "" ;
      Z49AlbRFen = GXutil.nullDate() ;
      Z4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      Z45AlbRef = "" ;
      Z3613AlbRefDsc = "" ;
      Z1291AlbRDes = "" ;
      Z56AlbRUni = "" ;
      Z50AlbRLoc = "" ;
      Z55AlbRReo = "" ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      Z6180AlbrUniC = DecimalUtil.ZERO ;
      Z6181AlbrPieC = 0 ;
      Z4920AlbRGrm2 = (short)(0) ;
      Z4921AlbRAnc = (short)(0) ;
      Z4922AlbPml = (short)(0) ;
      Z6463AlbRLote = "" ;
      Z13241AlbRPh = DecimalUtil.ZERO ;
      Z13242AlbRRLong = DecimalUtil.ZERO ;
      Z13243AlbRRTrans = DecimalUtil.ZERO ;
      Z8029AlbNumM = "" ;
      Z53AlbRPieReb = 0 ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      Z10761AlbUltP = (short)(0) ;
      Z7501AlbRecSec = (short)(0) ;
      Z1222AlbNumEti = (short)(0) ;
      Z252CliCod = 0 ;
      Z840TrnCod = (short)(0) ;
      Z970ProceCod = (short)(0) ;
      Z1211TipEntCod = (short)(0) ;
   }

   public void initAll1P17( )
   {
      A44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      initializeNonKey1P17( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1P1299( )
   {
      A10762AlbPCont = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10762AlbPCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10762AlbPCont), 4, 0));
      AV81PzaProd = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81PzaProd", GXutil.str( AV81PzaProd, 1, 0));
      AV62Msg_err = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62Msg_err", AV62Msg_err);
      AV49Rdto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Rdto", GXutil.ltrimstr( AV49Rdto, 6, 2));
      AV50Pesoml = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Pesoml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Pesoml), 4, 0));
      AV100Anc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100Anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Anc), 4, 0));
      AV101grm2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101grm2), 4, 0));
      A4797AlRPieClaC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", A4797AlRPieClaC);
      A4795AlRPieCal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
      A13693AlbRecObs = "" ;
      AV51FlagArt = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51FlagArt", GXutil.str( AV51FlagArt, 1, 0));
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A8779Bod_Talla = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8779Bod_Talla", A8779Bod_Talla);
      A8780Bod_Und = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8780Bod_Und", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8780Bod_Und), 4, 0));
      A3730AlbRecCol = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3730AlbRecCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3730AlbRecCol), 4, 0));
      A3731AlbRecIdPz = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3731AlbRecIdPz", A3731AlbRecIdPz);
      A3732AlbRecIdRc = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3732AlbRecIdRc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3732AlbRecIdRc), 8, 0));
      A4410AlbRecPal = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4410AlbRecPal", GXutil.ltrimstr( A4410AlbRecPal, 9, 2));
      A10180AlRPieTelT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10180AlRPieTelT", A10180AlRPieTelT);
      A10149AlRPieCon = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10149AlRPieCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10149AlRPieCon), 6, 0));
      A10181AlRPieOri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10181AlRPieOri", A10181AlRPieOri);
      A10182AlRPieDst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10182AlRPieDst", A10182AlRPieDst);
      A10183AlrPieKgmT = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10183AlrPieKgmT", GXutil.ltrimstr( A10183AlrPieKgmT, 9, 2));
      A7408ALRPIELOC = "" ;
      A4806AlRPieDefC = 0 ;
      n4806AlRPieDefC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4806AlRPieDefC), 6, 0));
      A2154AlbRecAnh = A4921AlbRAnc ;
      O2155AlbRecKgm = A2155AlbRecKgm ;
      O2157AlbRecMtr = A2157AlbRecMtr ;
      Z4795AlRPieCal = "" ;
      Z2154AlbRecAnh = (short)(0) ;
      Z10762AlbPCont = (short)(0) ;
      Z2157AlbRecMtr = DecimalUtil.ZERO ;
      Z2155AlbRecKgm = DecimalUtil.ZERO ;
      Z2158AlbRecMtrU = DecimalUtil.ZERO ;
      Z2156AlbRecKgmU = DecimalUtil.ZERO ;
      Z8779Bod_Talla = "" ;
      Z8780Bod_Und = (short)(0) ;
      Z3730AlbRecCol = (short)(0) ;
      Z3731AlbRecIdPz = "" ;
      Z3732AlbRecIdRc = 0 ;
      Z4410AlbRecPal = DecimalUtil.ZERO ;
      Z10180AlRPieTelT = "" ;
      Z10149AlRPieCon = 0 ;
      Z10181AlRPieOri = "" ;
      Z10182AlRPieDst = "" ;
      Z10183AlrPieKgmT = DecimalUtil.ZERO ;
      Z7408ALRPIELOC = "" ;
   }

   public void initAll1P1299( )
   {
      A2159AlbRecPie = "" ;
      initializeNonKey1P1299( ) ;
   }

   public void standaloneModalInsert1P1299( )
   {
      A10761AlbUltP = i10761AlbUltP ;
      n10761AlbUltP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10761AlbUltP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10761AlbUltP), 4, 0));
      A2154AlbRecAnh = i2154AlbRecAnh ;
      A10762AlbPCont = i10762AlbPCont ;
      httpContext.ajax_rsp_assign_attri("", false, "A10762AlbPCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10762AlbPCont), 4, 0));
      A10760SumPzs = i10760SumPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10760SumPzs), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415124896", true, true);
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
      httpContext.AddJavascriptSource("talbdet2.js", "?202682415124896", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties299( )
   {
      edtALRPIELOC_Enabled = defedtALRPIELOC_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtALRPIELOC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtALRPIELOC_Enabled), 5, 0), !bGXsfl_383_Refreshing);
      edtAlbRecPie_Enabled = defedtAlbRecPie_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_383_Refreshing);
   }

   public void startgridcontrol383( )
   {
      Gridlevel_piezasContainer.AddObjectProperty("GridName", "Gridlevel_piezas");
      Gridlevel_piezasContainer.AddObjectProperty("Header", subGridlevel_piezas_Header);
      Gridlevel_piezasContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_piezasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_piezas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_piezasContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.rtrim( A2159AlbRecPie));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2154AlbRecAnh, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.rtrim( A7408ALRPIELOC));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtALRPIELOC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_piezasColumn.AddObjectProperty("Value", GXutil.rtrim( A13693AlbRecObs));
      Gridlevel_piezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddColumnProperties(Gridlevel_piezasColumn);
      Gridlevel_piezasContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_piezas_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_piezas_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_piezas_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_piezas_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_piezas_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_piezas_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_piezasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_piezas_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      lblTextblockalbrent_Internalname = "TEXTBLOCKALBRENT" ;
      edtAlbREnt_Internalname = "ALBRENT" ;
      divUnnamedtablealbrent_Internalname = "UNNAMEDTABLEALBRENT" ;
      divAlbrent_cell_Internalname = "ALBRENT_CELL" ;
      lblTextblockalbrent2_Internalname = "TEXTBLOCKALBRENT2" ;
      edtAlbREnt2_Internalname = "ALBRENT2" ;
      divUnnamedtablealbrent2_Internalname = "UNNAMEDTABLEALBRENT2" ;
      divAlbrent2_cell_Internalname = "ALBRENT2_CELL" ;
      lblTextblockalbrfen_Internalname = "TEXTBLOCKALBRFEN" ;
      edtAlbRFen_Internalname = "ALBRFEN" ;
      divUnnamedtablealbrfen_Internalname = "UNNAMEDTABLEALBRFEN" ;
      lblTextblockalbrhen_Internalname = "TEXTBLOCKALBRHEN" ;
      edtAlbRHEn_Internalname = "ALBRHEN" ;
      divUnnamedtablealbrhen_Internalname = "UNNAMEDTABLEALBRHEN" ;
      divUnnamedtable23_Internalname = "UNNAMEDTABLE23" ;
      tblUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      Dvpanel_unnamedtable6_Internalname = "DVPANEL_UNNAMEDTABLE6" ;
      lblTextblockclicod_Internalname = "TEXTBLOCKCLICOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      divUnnamedtableclicod_Internalname = "UNNAMEDTABLECLICOD" ;
      lblTextblockclinom_Internalname = "TEXTBLOCKCLINOM" ;
      edtCliNom_Internalname = "CLINOM" ;
      divUnnamedtableclinom_Internalname = "UNNAMEDTABLECLINOM" ;
      lblTextblockalbref_Internalname = "TEXTBLOCKALBREF" ;
      edtAlbRef_Internalname = "ALBREF" ;
      divUnnamedtablealbref_Internalname = "UNNAMEDTABLEALBREF" ;
      lblTextblockalbrefdsc_Internalname = "TEXTBLOCKALBREFDSC" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      divUnnamedtablealbrefdsc_Internalname = "UNNAMEDTABLEALBREFDSC" ;
      divUnnamedtable22_Internalname = "UNNAMEDTABLE22" ;
      tblUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      Dvpanel_unnamedtable7_Internalname = "DVPANEL_UNNAMEDTABLE7" ;
      lblTextblockprocenom_Internalname = "TEXTBLOCKPROCENOM" ;
      edtProceNom_Internalname = "PROCENOM" ;
      divUnnamedtableprocenom_Internalname = "UNNAMEDTABLEPROCENOM" ;
      lblTextblocktrnnom_Internalname = "TEXTBLOCKTRNNOM" ;
      edtTrnNom_Internalname = "TRNNOM" ;
      divUnnamedtabletrnnom_Internalname = "UNNAMEDTABLETRNNOM" ;
      divUnnamedtable21_Internalname = "UNNAMEDTABLE21" ;
      tblUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      Dvpanel_unnamedtable8_Internalname = "DVPANEL_UNNAMEDTABLE8" ;
      tblTablemergedunnamedtable7_Internalname = "TABLEMERGEDUNNAMEDTABLE7" ;
      lblTextblockalbrunient_Internalname = "TEXTBLOCKALBRUNIENT" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      divUnnamedtablealbrunient_Internalname = "UNNAMEDTABLEALBRUNIENT" ;
      lblTextblockalbruni_Internalname = "TEXTBLOCKALBRUNI" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      divUnnamedtablealbruni_Internalname = "UNNAMEDTABLEALBRUNI" ;
      lblTextblockalbrpieent_Internalname = "TEXTBLOCKALBRPIEENT" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      divUnnamedtablealbrpieent_Internalname = "UNNAMEDTABLEALBRPIEENT" ;
      lblTextblockalbrunic_Internalname = "TEXTBLOCKALBRUNIC" ;
      edtAlbrUniC_Internalname = "ALBRUNIC" ;
      divUnnamedtablealbrunic_Internalname = "UNNAMEDTABLEALBRUNIC" ;
      lblTextblockalbrpiec_Internalname = "TEXTBLOCKALBRPIEC" ;
      edtAlbrPieC_Internalname = "ALBRPIEC" ;
      divUnnamedtablealbrpiec_Internalname = "UNNAMEDTABLEALBRPIEC" ;
      edtAlbNumM_Internalname = "ALBNUMM" ;
      divUnnamedtable20_Internalname = "UNNAMEDTABLE20" ;
      tblUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      Dvpanel_unnamedtable9_Internalname = "DVPANEL_UNNAMEDTABLE9" ;
      lblTextblockalbruniuti_Internalname = "TEXTBLOCKALBRUNIUTI" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      divUnnamedtablealbruniuti_Internalname = "UNNAMEDTABLEALBRUNIUTI" ;
      lblTextblockalbrunidis_Internalname = "TEXTBLOCKALBRUNIDIS" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      divUnnamedtablealbrunidis_Internalname = "UNNAMEDTABLEALBRUNIDIS" ;
      lblTextblockalbrpieuti_Internalname = "TEXTBLOCKALBRPIEUTI" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      divUnnamedtablealbrpieuti_Internalname = "UNNAMEDTABLEALBRPIEUTI" ;
      lblTextblockalbrpiedis_Internalname = "TEXTBLOCKALBRPIEDIS" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      divUnnamedtablealbrpiedis_Internalname = "UNNAMEDTABLEALBRPIEDIS" ;
      lblTextblockalbrfecult_Internalname = "TEXTBLOCKALBRFECULT" ;
      edtAlbRFecUlt_Internalname = "ALBRFECULT" ;
      divUnnamedtablealbrfecult_Internalname = "UNNAMEDTABLEALBRFECULT" ;
      lblTextblockalbrest_Internalname = "TEXTBLOCKALBREST" ;
      cmbAlbREst.setInternalname( "ALBREST" );
      divUnnamedtablealbrest_Internalname = "UNNAMEDTABLEALBREST" ;
      divUnnamedtable19_Internalname = "UNNAMEDTABLE19" ;
      tblUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      Dvpanel_unnamedtable10_Internalname = "DVPANEL_UNNAMEDTABLE10" ;
      tblTablemergedunnamedtable9_Internalname = "TABLEMERGEDUNNAMEDTABLE9" ;
      lblTextblocktipentnom_Internalname = "TEXTBLOCKTIPENTNOM" ;
      edtTipEntNom_Internalname = "TIPENTNOM" ;
      divUnnamedtabletipentnom_Internalname = "UNNAMEDTABLETIPENTNOM" ;
      lblTextblockalbrdes_Internalname = "TEXTBLOCKALBRDES" ;
      edtAlbRDes_Internalname = "ALBRDES" ;
      divUnnamedtablealbrdes_Internalname = "UNNAMEDTABLEALBRDES" ;
      lblTextblockalbrlote_Internalname = "TEXTBLOCKALBRLOTE" ;
      edtAlbRLote_Internalname = "ALBRLOTE" ;
      divUnnamedtablealbrlote_Internalname = "UNNAMEDTABLEALBRLOTE" ;
      divUnnamedtable18_Internalname = "UNNAMEDTABLE18" ;
      tblUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      Dvpanel_unnamedtable11_Internalname = "DVPANEL_UNNAMEDTABLE11" ;
      lblTextblockalbrloc_Internalname = "TEXTBLOCKALBRLOC" ;
      edtAlbRLoc_Internalname = "ALBRLOC" ;
      divUnnamedtablealbrloc_Internalname = "UNNAMEDTABLEALBRLOC" ;
      lblTextblockalbrreo_Internalname = "TEXTBLOCKALBRREO" ;
      cmbAlbRReo.setInternalname( "ALBRREO" );
      divUnnamedtablealbrreo_Internalname = "UNNAMEDTABLEALBRREO" ;
      divUnnamedtable17_Internalname = "UNNAMEDTABLE17" ;
      tblUnnamedtable12_Internalname = "UNNAMEDTABLE12" ;
      Dvpanel_unnamedtable12_Internalname = "DVPANEL_UNNAMEDTABLE12" ;
      tblTablemergedunnamedtable11_Internalname = "TABLEMERGEDUNNAMEDTABLE11" ;
      lblTextblockalbrgrm2_Internalname = "TEXTBLOCKALBRGRM2" ;
      edtAlbRGrm2_Internalname = "ALBRGRM2" ;
      divUnnamedtablealbrgrm2_Internalname = "UNNAMEDTABLEALBRGRM2" ;
      lblTextblockalbranc_Internalname = "TEXTBLOCKALBRANC" ;
      edtAlbRAnc_Internalname = "ALBRANC" ;
      divUnnamedtablealbranc_Internalname = "UNNAMEDTABLEALBRANC" ;
      lblTextblockalbpml_Internalname = "TEXTBLOCKALBPML" ;
      edtAlbPml_Internalname = "ALBPML" ;
      divUnnamedtablealbpml_Internalname = "UNNAMEDTABLEALBPML" ;
      divUnnamedtable16_Internalname = "UNNAMEDTABLE16" ;
      tblUnnamedtable13_Internalname = "UNNAMEDTABLE13" ;
      Dvpanel_unnamedtable13_Internalname = "DVPANEL_UNNAMEDTABLE13" ;
      lblTextblockalbrph_Internalname = "TEXTBLOCKALBRPH" ;
      edtAlbRPh_Internalname = "ALBRPH" ;
      divUnnamedtablealbrph_Internalname = "UNNAMEDTABLEALBRPH" ;
      lblTextblockalbrrlong_Internalname = "TEXTBLOCKALBRRLONG" ;
      edtAlbRRLong_Internalname = "ALBRRLONG" ;
      divUnnamedtablealbrrlong_Internalname = "UNNAMEDTABLEALBRRLONG" ;
      lblTextblockalbrrtrans_Internalname = "TEXTBLOCKALBRRTRANS" ;
      edtAlbRRTrans_Internalname = "ALBRRTRANS" ;
      divUnnamedtablealbrrtrans_Internalname = "UNNAMEDTABLEALBRRTRANS" ;
      divUnnamedtable15_Internalname = "UNNAMEDTABLE15" ;
      tblUnnamedtable14_Internalname = "UNNAMEDTABLE14" ;
      Dvpanel_unnamedtable14_Internalname = "DVPANEL_UNNAMEDTABLE14" ;
      tblTablemergedunnamedtable13_Internalname = "TABLEMERGEDUNNAMEDTABLE13" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtndonumerarpiezas_Internalname = "BTNDONUMERARPIEZAS" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      tblPnlnumerarpiezas_Internalname = "PNLNUMERARPIEZAS" ;
      Dvpanel_pnlnumerarpiezas_Internalname = "DVPANEL_PNLNUMERARPIEZAS" ;
      edtAlbRecPie_Internalname = "ALBRECPIE" ;
      edtAlbRecAnh_Internalname = "ALBRECANH" ;
      edtALRPIELOC_Internalname = "ALRPIELOC" ;
      edtAlbRecMtr_Internalname = "ALBRECMTR" ;
      edtAlbRecKgm_Internalname = "ALBRECKGM" ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU" ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU" ;
      edtAlbRecObs_Internalname = "ALBRECOBS" ;
      lblTextblocksumkgs_Internalname = "TEXTBLOCKSUMKGS" ;
      edtSumKgs_Internalname = "SUMKGS" ;
      divUnnamedtablesumkgs_Internalname = "UNNAMEDTABLESUMKGS" ;
      lblTextblocksummts_Internalname = "TEXTBLOCKSUMMTS" ;
      edtSumMts_Internalname = "SUMMTS" ;
      divUnnamedtablesummts_Internalname = "UNNAMEDTABLESUMMTS" ;
      lblTextblocksumpzs_Internalname = "TEXTBLOCKSUMPZS" ;
      edtSumPzs_Internalname = "SUMPZS" ;
      divUnnamedtablesumpzs_Internalname = "UNNAMEDTABLESUMPZS" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      tblUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      tblPnldetallepiezas_Internalname = "PNLDETALLEPIEZAS" ;
      Dvpanel_pnldetallepiezas_Internalname = "DVPANEL_PNLDETALLEPIEZAS" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      tblPnlbotones_Internalname = "PNLBOTONES" ;
      Dvpanel_pnlbotones_Internalname = "DVPANEL_PNLBOTONES" ;
      divTableleaflevel_piezas_Internalname = "TABLELEAFLEVEL_PIEZAS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_piezas_Internalname = "GRIDLEVEL_PIEZAS" ;
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
      subGridlevel_piezas_Allowcollapsing = (byte)(0) ;
      subGridlevel_piezas_Allowselection = (byte)(0) ;
      subGridlevel_piezas_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Mantenimiento Almacen Entradas Tela (Detail)", "") );
      edtAlbRecObs_Jsonclick = "" ;
      edtAlbRecKgmU_Jsonclick = "" ;
      edtAlbRecMtrU_Jsonclick = "" ;
      edtAlbRecKgm_Jsonclick = "" ;
      edtAlbRecMtr_Jsonclick = "" ;
      edtALRPIELOC_Jsonclick = "" ;
      edtAlbRecAnh_Jsonclick = "" ;
      edtAlbRecPie_Jsonclick = "" ;
      subGridlevel_piezas_Class = "GridNoBorder WorkWith" ;
      subGridlevel_piezas_Backcolorstyle = (byte)(0) ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      Dvpanel_pnlbotones_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnlbotones_Iconposition = "Right" ;
      Dvpanel_pnlbotones_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnlbotones_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnlbotones_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnlbotones_Title = "" ;
      Dvpanel_pnlbotones_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnlbotones_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnlbotones_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnlbotones_Width = "100%" ;
      edtSumPzs_Jsonclick = "" ;
      edtSumPzs_Enabled = 0 ;
      edtSumMts_Jsonclick = "" ;
      edtSumMts_Enabled = 0 ;
      edtSumKgs_Jsonclick = "" ;
      edtSumKgs_Enabled = 0 ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      edtAlbRecObs_Enabled = 0 ;
      edtAlbRecKgmU_Enabled = 1 ;
      edtAlbRecMtrU_Enabled = 1 ;
      edtAlbRecKgm_Enabled = 1 ;
      edtAlbRecMtr_Enabled = 1 ;
      edtALRPIELOC_Enabled = 0 ;
      edtAlbRecAnh_Enabled = 1 ;
      edtAlbRecPie_Enabled = 1 ;
      Dvpanel_pnldetallepiezas_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnldetallepiezas_Iconposition = "Right" ;
      Dvpanel_pnldetallepiezas_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnldetallepiezas_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnldetallepiezas_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnldetallepiezas_Title = "" ;
      Dvpanel_pnldetallepiezas_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnldetallepiezas_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnldetallepiezas_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnldetallepiezas_Width = "100%" ;
      bttBtndonumerarpiezas_Visible = 1 ;
      Dvpanel_pnlnumerarpiezas_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnlnumerarpiezas_Iconposition = "Right" ;
      Dvpanel_pnlnumerarpiezas_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnlnumerarpiezas_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnlnumerarpiezas_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnlnumerarpiezas_Title = "" ;
      Dvpanel_pnlnumerarpiezas_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnlnumerarpiezas_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnlnumerarpiezas_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnlnumerarpiezas_Width = "100%" ;
      edtAlbRRTrans_Jsonclick = "" ;
      edtAlbRRTrans_Enabled = 0 ;
      edtAlbRRLong_Jsonclick = "" ;
      edtAlbRRLong_Enabled = 0 ;
      edtAlbRPh_Jsonclick = "" ;
      edtAlbRPh_Enabled = 0 ;
      Dvpanel_unnamedtable14_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable14_Iconposition = "Right" ;
      Dvpanel_unnamedtable14_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable14_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable14_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable14_Title = "" ;
      Dvpanel_unnamedtable14_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable14_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable14_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable14_Width = "100%" ;
      edtAlbPml_Jsonclick = "" ;
      edtAlbPml_Enabled = 0 ;
      edtAlbRAnc_Jsonclick = "" ;
      edtAlbRAnc_Enabled = 0 ;
      edtAlbRGrm2_Jsonclick = "" ;
      edtAlbRGrm2_Enabled = 0 ;
      Dvpanel_unnamedtable13_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable13_Iconposition = "Right" ;
      Dvpanel_unnamedtable13_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable13_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable13_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable13_Title = "" ;
      Dvpanel_unnamedtable13_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable13_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable13_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable13_Width = "100%" ;
      cmbAlbRReo.setJsonclick( "" );
      cmbAlbRReo.setEnabled( 0 );
      edtAlbRLoc_Jsonclick = "" ;
      edtAlbRLoc_Enabled = 0 ;
      Dvpanel_unnamedtable12_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable12_Iconposition = "Right" ;
      Dvpanel_unnamedtable12_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable12_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable12_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable12_Title = "" ;
      Dvpanel_unnamedtable12_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable12_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable12_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable12_Width = "100%" ;
      edtAlbRLote_Jsonclick = "" ;
      edtAlbRLote_Enabled = 0 ;
      edtAlbRDes_Jsonclick = "" ;
      edtAlbRDes_Enabled = 0 ;
      edtTipEntNom_Jsonclick = "" ;
      edtTipEntNom_Enabled = 0 ;
      Dvpanel_unnamedtable11_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Iconposition = "Right" ;
      Dvpanel_unnamedtable11_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable11_Title = "" ;
      Dvpanel_unnamedtable11_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable11_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable11_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable11_Width = "100%" ;
      cmbAlbREst.setJsonclick( "" );
      cmbAlbREst.setEnabled( 0 );
      edtAlbRFecUlt_Jsonclick = "" ;
      edtAlbRFecUlt_Enabled = 0 ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Enabled = 0 ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRPieUti_Enabled = 0 ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Enabled = 0 ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniUti_Enabled = 0 ;
      Dvpanel_unnamedtable10_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Iconposition = "Right" ;
      Dvpanel_unnamedtable10_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable10_Title = "" ;
      Dvpanel_unnamedtable10_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable10_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable10_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable10_Width = "100%" ;
      edtAlbNumM_Jsonclick = "" ;
      edtAlbNumM_Enabled = 0 ;
      edtAlbrPieC_Jsonclick = "" ;
      edtAlbrPieC_Enabled = 0 ;
      edtAlbrUniC_Jsonclick = "" ;
      edtAlbrUniC_Enabled = 0 ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Enabled = 0 ;
      cmbAlbRUni.setJsonclick( "" );
      cmbAlbRUni.setEnabled( 0 );
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniEnt_Enabled = 0 ;
      Dvpanel_unnamedtable9_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Iconposition = "Right" ;
      Dvpanel_unnamedtable9_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Title = "" ;
      Dvpanel_unnamedtable9_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable9_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Width = "100%" ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnNom_Enabled = 0 ;
      edtProceNom_Jsonclick = "" ;
      edtProceNom_Enabled = 0 ;
      Dvpanel_unnamedtable8_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Iconposition = "Right" ;
      Dvpanel_unnamedtable8_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable8_Title = "" ;
      Dvpanel_unnamedtable8_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable8_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable8_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Width = "100%" ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRefDsc_Enabled = 0 ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRef_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      Dvpanel_unnamedtable7_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Iconposition = "Right" ;
      Dvpanel_unnamedtable7_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Title = "" ;
      Dvpanel_unnamedtable7_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable7_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Width = "100%" ;
      edtAlbRHEn_Jsonclick = "" ;
      edtAlbRHEn_Enabled = 0 ;
      edtAlbRFen_Jsonclick = "" ;
      edtAlbRFen_Enabled = 0 ;
      edtAlbREnt2_Jsonclick = "" ;
      edtAlbREnt2_Enabled = 0 ;
      edtAlbREnt2_Visible = 1 ;
      divAlbrent2_cell_Class = "" ;
      edtAlbREnt_Jsonclick = "" ;
      edtAlbREnt_Enabled = 0 ;
      edtAlbREnt_Visible = 1 ;
      divAlbrent_cell_Class = "" ;
      Dvpanel_unnamedtable6_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Iconposition = "Right" ;
      Dvpanel_unnamedtable6_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Title = "" ;
      Dvpanel_unnamedtable6_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable6_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Width = "100%" ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Enabled = 1 ;
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

   public void gxasa461P17( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      edtAlbREnt_Visible = ((GXt_int5==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Visible), 5, 0), true);
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

   public void gxasa58061P17( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ENC20C", ""), ""), GXv_int6) ;
      talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
      edtAlbREnt2_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Visible), 5, 0), true);
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

   public void gx55asaalbdetpieu1P17( String A396EmprCod ,
                                      int A44AlbRecCod ,
                                      String A56AlbRUni )
   {
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2153AlbDetPieU, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx61asaalbrecobs1P1299( String A396EmprCod ,
                                       int A44AlbRecCod ,
                                       String A2159AlbRecPie )
   {
      GXt_char1 = A13693AlbRecObs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A44AlbRecCod ;
      GXv_char3[0] = A2159AlbRecPie ;
      GXv_char2[0] = GXt_char1 ;
      new app.palrpieuti(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
      talbdet2_impl.this.A396EmprCod = GXv_char4[0] ;
      talbdet2_impl.this.A44AlbRecCod = GXv_int8[0] ;
      talbdet2_impl.this.A2159AlbRecPie = GXv_char3[0] ;
      talbdet2_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A13693AlbRecObs = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13693AlbRecObs))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx63asaalbdetpieu1P1299( String A396EmprCod ,
                                        int A44AlbRecCod ,
                                        String A56AlbRUni )
   {
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2153AlbDetPieU, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx73asapzaprod1P1299( String Gx_mode ,
                                     String A396EmprCod ,
                                     int A44AlbRecCod ,
                                     String A2159AlbRecPie )
   {
      if ( ( isDlt( )  ) && true /* Level */ )
      {
         GXt_int5 = AV81PzaProd ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_char3[0] = A2159AlbRecPie ;
         GXv_int6[0] = GXt_int5 ;
         new app.ppzaprod(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_int6) ;
         talbdet2_impl.this.A396EmprCod = GXv_char4[0] ;
         talbdet2_impl.this.A44AlbRecCod = GXv_int8[0] ;
         talbdet2_impl.this.A2159AlbRecPie = GXv_char3[0] ;
         talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         AV81PzaProd = GXt_int5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81PzaProd", GXutil.str( AV81PzaProd, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV81PzaProd, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_90_1P1299( String Gx_mode ,
                             String A396EmprCod ,
                             String A2159AlbRecPie ,
                             byte AV73Noctrlpz )
   {
      if ( isIns( )  && true /* After */ && ( AV73Noctrlpz == 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A2159AlbRecPie ;
         GXv_char2[0] = AV62Msg_err ;
         new app.pexipzae(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A2159AlbRecPie = GXv_char3[0] ;
         AV62Msg_err = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV62Msg_err", AV62Msg_err);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2159AlbRecPie))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV62Msg_err))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_93_1P1299( String Gx_mode ,
                             String A396EmprCod ,
                             int A44AlbRecCod ,
                             String A2159AlbRecPie ,
                             byte AV48SumPza ,
                             java.math.BigDecimal A2155AlbRecKgm )
   {
      if ( isIns( )  && (GXutil.strcmp("", A2159AlbRecPie)==0) && ( AV48SumPza == 1 ) && true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_char3[0] = A2159AlbRecPie ;
         new app.pultpza(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int8[0] ;
         A2159AlbRecPie = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2159AlbRecPie))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_95_1P1299( String A56AlbRUni ,
                             java.math.BigDecimal A2157AlbRecMtr ,
                             java.math.BigDecimal A2155AlbRecKgm ,
                             byte AV51FlagArt ,
                             String A2159AlbRecPie ,
                             byte AV52CalMKT )
   {
      if ( ( AV51FlagArt == 1 ) && true /* Level */ && true /* After */ && ( AV52CalMKT == 1 ) )
      {
         GXv_char4[0] = A56AlbRUni ;
         GXv_decimal12[0] = A2157AlbRecMtr ;
         GXv_decimal11[0] = A2155AlbRecKgm ;
         GXv_decimal10[0] = AV49Rdto ;
         GXv_int15[0] = AV50Pesoml ;
         GXv_int14[0] = AV100Anc ;
         GXv_int13[0] = AV101grm2 ;
         new app.pcalkmt(remoteHandle, context).execute( GXv_char4, GXv_decimal12, GXv_decimal11, GXv_decimal10, GXv_int15, GXv_int14, GXv_int13) ;
         A56AlbRUni = GXv_char4[0] ;
         A2157AlbRecMtr = GXv_decimal12[0] ;
         A2155AlbRecKgm = GXv_decimal11[0] ;
         AV49Rdto = GXv_decimal10[0] ;
         AV50Pesoml = GXv_int15[0] ;
         AV100Anc = GXv_int14[0] ;
         AV101grm2 = GXv_int13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         httpContext.ajax_rsp_assign_attri("", false, "AV49Rdto", GXutil.ltrimstr( AV49Rdto, 6, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV50Pesoml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Pesoml), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV100Anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Anc), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV101grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV101grm2), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A56AlbRUni))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV49Rdto, (byte)(6), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV50Pesoml, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV100Anc, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV101grm2, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_piezas_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_383299( ) ;
      while ( nGXsfl_383_idx <= nRC_GXsfl_383 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1P1299( ) ;
         standaloneModal1P1299( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1P1299( ) ;
         nGXsfl_383_idx = (int)(nGXsfl_383_idx+1) ;
         sGXsfl_383_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_383_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_383299( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_piezasContainer)) ;
      /* End function gxnrGridlevel_piezas_newrow */
   }

   public void init_web_controls( )
   {
      cmbAlbRUni.setName( "ALBRUNI" );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "Kilos", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "Metros", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      cmbAlbREst.setName( "ALBREST" );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      cmbAlbRReo.setName( "ALBRREO" );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
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

   public void valid_Albreccod( )
   {
      n44AlbRecCod = false ;
      /* Using cursor T01P134 */
      pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         A2152AlbDetPie = T01P134_A2152AlbDetPie[0] ;
         A2149AlbDetMtr = T01P134_A2149AlbDetMtr[0] ;
         A2146AlbDetKgm = T01P134_A2146AlbDetKgm[0] ;
         A2151AlbDetMtrU = T01P134_A2151AlbDetMtrU[0] ;
         A2148AlbDetKgmU = T01P134_A2148AlbDetKgmU[0] ;
         A10758SumKgs = T01P134_A10758SumKgs[0] ;
         A10759SumMts = T01P134_A10759SumMts[0] ;
         A10760SumPzs = T01P134_A10760SumPzs[0] ;
      }
      else
      {
         A2152AlbDetPie = (short)(0) ;
         A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
         A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
         A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
         A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
         A10758SumKgs = DecimalUtil.doubleToDec(0) ;
         A10759SumMts = DecimalUtil.doubleToDec(0) ;
         A10760SumPzs = (short)(0) ;
      }
      pr_default.close(27);
      if ( ! (0==A2152AlbDetPie) )
      {
         A52AlbRPieEnt = A2152AlbDetPie ;
      }
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrim( localUtil.ntoc( A2152AlbDetPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrim( localUtil.ntoc( A2149AlbDetMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrim( localUtil.ntoc( A2146AlbDetKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrim( localUtil.ntoc( A2151AlbDetMtrU, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrim( localUtil.ntoc( A2148AlbDetKgmU, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10758SumKgs", GXutil.ltrim( localUtil.ntoc( A10758SumKgs, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10759SumMts", GXutil.ltrim( localUtil.ntoc( A10759SumMts, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10760SumPzs", GXutil.ltrim( localUtil.ntoc( A10760SumPzs, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrim( localUtil.ntoc( A2150AlbDetMtrD, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrim( localUtil.ntoc( A2147AlbDetKgmD, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Clicod( )
   {
      /* Using cursor T01P129 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01P129_A279CliNom[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Albruni( )
   {
      A56AlbRUni = cmbAlbRUni.getValue() ;
      n44AlbRecCod = false ;
      A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValue())) ;
      cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2149AlbDetMtr)==0) )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2146AlbDetKgm)==0) )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2151AlbDetMtrU)==0) )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2148AlbDetKgmU)==0) )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
         }
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( ( A2147AlbDetKgmD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
      {
         A47AlbREst = (byte)(1) ;
         cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      }
      else
      {
         if ( ( A2150AlbDetMtrD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
            cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
         }
         else
         {
            if ( ( A2147AlbDetKgmD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
            {
               A47AlbREst = (byte)(0) ;
               cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
            }
            else
            {
               if ( ( A2150AlbDetMtrD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
               {
                  A47AlbREst = (byte)(0) ;
                  cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
               }
            }
         }
      }
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
         }
      }
      if ( ! (0==A2153AlbDetPieU) )
      {
         A54AlbRPieUti = A2153AlbDetPieU ;
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      dynload_actions( ) ;
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrim( localUtil.ntoc( A2153AlbDetPieU, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Albrecpie( )
   {
      n44AlbRecCod = false ;
      n4806AlRPieDefC = false ;
      /* Using cursor T01P160 */
      pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(51) != 101) )
      {
         A4806AlRPieDefC = T01P160_A4806AlRPieDefC[0] ;
         n4806AlRPieDefC = T01P160_n4806AlRPieDefC[0] ;
      }
      else
      {
         A4806AlRPieDefC = 0 ;
         n4806AlRPieDefC = false ;
      }
      pr_default.close(51);
      GXt_char1 = A13693AlbRecObs ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A44AlbRecCod ;
      GXv_char3[0] = A2159AlbRecPie ;
      GXv_char2[0] = GXt_char1 ;
      new app.palrpieuti(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
      talbdet2_impl.this.A396EmprCod = GXv_char4[0] ;
      A396EmprCod = this.A396EmprCod ;
      talbdet2_impl.this.A44AlbRecCod = GXv_int8[0] ;
      talbdet2_impl.this.A2159AlbRecPie = GXv_char3[0] ;
      A2159AlbRecPie = this.A2159AlbRecPie ;
      talbdet2_impl.this.GXt_char1 = GXv_char2[0] ;
      A13693AlbRecObs = GXt_char1 ;
      if ( ( GXutil.strcmp(GXutil.trim( A13693AlbRecObs), httpContext.getMessage( "N/U", "")) != 0 ) && ( ( GXutil.strcmp(GXutil.substring( A13693AlbRecObs, 1, 3), httpContext.getMessage( "Dev", "")) == 0 ) ) && true /* Level */ && ( isUpd( )  || isDlt( )  ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Pieza en DEVOLUCION ¡¡¡", ""), 1, "ALBRECPIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecPie_Internalname ;
      }
      GXt_char1 = A4795AlRPieCal ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A44AlbRecCod ;
      GXv_char3[0] = A2159AlbRecPie ;
      GXv_char2[0] = GXt_char1 ;
      new app.ppiecalact(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
      talbdet2_impl.this.A396EmprCod = GXv_char4[0] ;
      A396EmprCod = this.A396EmprCod ;
      talbdet2_impl.this.A44AlbRecCod = GXv_int8[0] ;
      talbdet2_impl.this.A2159AlbRecPie = GXv_char3[0] ;
      A2159AlbRecPie = this.A2159AlbRecPie ;
      talbdet2_impl.this.GXt_char1 = GXv_char2[0] ;
      A4795AlRPieCal = GXt_char1 ;
      if ( ( isDlt( )  ) && true /* Level */ )
      {
         GXt_int5 = AV81PzaProd ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_char3[0] = A2159AlbRecPie ;
         GXv_int6[0] = GXt_int5 ;
         new app.ppzaprod(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_int6) ;
         talbdet2_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbdet2_impl.this.A44AlbRecCod = GXv_int8[0] ;
         talbdet2_impl.this.A2159AlbRecPie = GXv_char3[0] ;
         A2159AlbRecPie = this.A2159AlbRecPie ;
         talbdet2_impl.this.GXt_int5 = GXv_int6[0] ;
         AV81PzaProd = GXt_int5 ;
      }
      if ( ( AV81PzaProd == 1 ) && ( isDlt( )  ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Pieza en Produccion ¡¡¡", ""), 1, "ALBRECPIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecPie_Internalname ;
      }
      if ( isIns( )  && true /* After */ && ( AV73Noctrlpz == 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A2159AlbRecPie ;
         GXv_char2[0] = AV62Msg_err ;
         new app.pexipzae(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         talbdet2_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbdet2_impl.this.A2159AlbRecPie = GXv_char3[0] ;
         A2159AlbRecPie = this.A2159AlbRecPie ;
         talbdet2_impl.this.AV62Msg_err = GXv_char2[0] ;
         AV62Msg_err = this.AV62Msg_err ;
      }
      if ( isIns( )  && true /* After */ && ( AV61NoPzaR == 1 ) && ( GXutil.strcmp(AV62Msg_err, " ") != 0 ) && ( AV80Velluts == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV62Msg_err, 1, "ALBRECPIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecPie_Internalname ;
      }
      if ( isIns( )  && true /* After */ && ( AV61NoPzaR == 0 ) && ( GXutil.strcmp(AV62Msg_err, " ") != 0 ) && ( AV80Velluts == 0 ) && ( AV85Colorsol == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV62Msg_err, 0, "ALBRECPIE");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4806AlRPieDefC", GXutil.ltrim( localUtil.ntoc( A4806AlRPieDefC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13693AlbRecObs", GXutil.rtrim( A13693AlbRecObs));
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", GXutil.rtrim( A4795AlRPieCal));
      httpContext.ajax_rsp_assign_attri("", false, "AV81PzaProd", GXutil.ltrim( localUtil.ntoc( AV81PzaProd, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", GXutil.rtrim( A2159AlbRecPie));
      httpContext.ajax_rsp_assign_attri("", false, "AV62Msg_err", GXutil.rtrim( AV62Msg_err));
   }

   public void valid_Albrecmtr( )
   {
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      n4806AlRPieDefC = false ;
      if ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() )
      {
         A4797AlRPieClaC = httpContext.getMessage( "A", "") ;
      }
      else
      {
         if ( ( A4806AlRPieDefC > A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
         {
            A4797AlRPieClaC = httpContext.getMessage( "B", "") ;
         }
         else
         {
            if ( ( A4806AlRPieDefC > A2157AlbRecMtr.multiply(DecimalUtil.doubleToDec(14)).divide(DecimalUtil.doubleToDec(50), 18, java.math.RoundingMode.DOWN).doubleValue() ) && ( A4806AlRPieDefC <= A2157AlbRecMtr.divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN).doubleValue() ) )
            {
               A4797AlRPieClaC = httpContext.getMessage( "C", "") ;
            }
            else
            {
               A4797AlRPieClaC = httpContext.getMessage( "D", "") ;
            }
         }
      }
      if ( ( AV51FlagArt == 1 ) && true /* Level */ && true /* After */ && ( AV52CalMKT == 1 ) )
      {
         GXv_char4[0] = A56AlbRUni ;
         GXv_decimal12[0] = A2157AlbRecMtr ;
         GXv_decimal11[0] = A2155AlbRecKgm ;
         GXv_decimal10[0] = AV49Rdto ;
         GXv_int15[0] = AV50Pesoml ;
         GXv_int14[0] = AV100Anc ;
         GXv_int13[0] = AV101grm2 ;
         new app.pcalkmt(remoteHandle, context).execute( GXv_char4, GXv_decimal12, GXv_decimal11, GXv_decimal10, GXv_int15, GXv_int14, GXv_int13) ;
         talbdet2_impl.this.A56AlbRUni = GXv_char4[0] ;
         A56AlbRUni = this.A56AlbRUni ;
         talbdet2_impl.this.A2157AlbRecMtr = GXv_decimal12[0] ;
         A2157AlbRecMtr = this.A2157AlbRecMtr ;
         talbdet2_impl.this.A2155AlbRecKgm = GXv_decimal11[0] ;
         A2155AlbRecKgm = this.A2155AlbRecKgm ;
         talbdet2_impl.this.AV49Rdto = GXv_decimal10[0] ;
         AV49Rdto = this.AV49Rdto ;
         talbdet2_impl.this.AV50Pesoml = GXv_int15[0] ;
         AV50Pesoml = this.AV50Pesoml ;
         talbdet2_impl.this.AV100Anc = GXv_int14[0] ;
         AV100Anc = this.AV100Anc ;
         talbdet2_impl.this.AV101grm2 = GXv_int13[0] ;
         AV101grm2 = this.AV101grm2 ;
         cmbAlbRUni.setValue( A56AlbRUni );
      }
      dynload_actions( ) ;
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         cmbAlbRUni.setValue( A56AlbRUni );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4797AlRPieClaC", GXutil.rtrim( A4797AlRPieClaC));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A2157AlbRecMtr", GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2155AlbRecKgm", GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV49Rdto", GXutil.ltrim( localUtil.ntoc( AV49Rdto, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV50Pesoml", GXutil.ltrim( localUtil.ntoc( AV50Pesoml, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV100Anc", GXutil.ltrim( localUtil.ntoc( AV100Anc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV101grm2", GXutil.ltrim( localUtil.ntoc( AV101grm2, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Albreckgm( )
   {
      n44AlbRecCod = false ;
      if ( isIns( )  && (GXutil.strcmp("", A2159AlbRecPie)==0) && ( AV48SumPza == 1 ) && true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_char3[0] = A2159AlbRecPie ;
         new app.pultpza(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
         talbdet2_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbdet2_impl.this.A44AlbRecCod = GXv_int8[0] ;
         A44AlbRecCod = this.A44AlbRecCod ;
         talbdet2_impl.this.A2159AlbRecPie = GXv_char3[0] ;
         A2159AlbRecPie = this.A2159AlbRecPie ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", GXutil.rtrim( A2159AlbRecPie));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV104EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV105AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV107TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV104EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV105AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A13241AlbRPh',fld:'ALBRPH',pic:'ZZ9.99'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A46AlbREnt',fld:'ALBRENT',pic:''},{av:'A5806AlbREnt2',fld:'ALBRENT2',pic:''},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'A4606AlbRHEn',fld:'ALBRHEN',pic:'99/99/99 99:99'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A1291AlbRDes',fld:'ALBRDES',pic:''},{av:'A50AlbRLoc',fld:'ALBRLOC',pic:''},{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'A48AlbRFecUlt',fld:'ALBRFECULT',pic:''},{av:'A6180AlbrUniC',fld:'ALBRUNIC',pic:'ZZZZZ9.99'},{av:'A6181AlbrPieC',fld:'ALBRPIEC',pic:'ZZZZZ9'},{av:'A4920AlbRGrm2',fld:'ALBRGRM2',pic:'ZZZ9'},{av:'A4921AlbRAnc',fld:'ALBRANC',pic:'ZZZ9'},{av:'A4922AlbPml',fld:'ALBPML',pic:'ZZZ9'},{av:'A6463AlbRLote',fld:'ALBRLOTE',pic:''},{av:'A13242AlbRRLong',fld:'ALBRRLONG',pic:'ZZ9.99'},{av:'A13243AlbRRTrans',fld:'ALBRRTRANS',pic:'ZZ9.99'},{av:'A8029AlbNumM',fld:'ALBNUMM',pic:''},{av:'A53AlbRPieReb',fld:'ALBRPIEREB',pic:'ZZZ9'},{av:'A59AlbRUniReb',fld:'ALBRUNIREB',pic:'ZZZZZ9.99'},{av:'A7501AlbRecSec',fld:'ALBRECSEC',pic:'ZZ9'},{av:'A1222AlbNumEti',fld:'ALBNUMETI',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121P12',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV107TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("'DODONUMERARPIEZAS'","{handler:'e131P12',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'}]");
      setEventMetadata("'DODONUMERARPIEZAS'",",oparms:[{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2152AlbDetPie',fld:'ALBDETPIE',pic:'ZZZ9'},{av:'A2149AlbDetMtr',fld:'ALBDETMTR',pic:'ZZZZZ9.99'},{av:'A2151AlbDetMtrU',fld:'ALBDETMTRU',pic:'ZZZZZ9.99'},{av:'A2146AlbDetKgm',fld:'ALBDETKGM',pic:'ZZZZZ9.99'},{av:'A2148AlbDetKgmU',fld:'ALBDETKGMU',pic:'ZZZZZ9.99'},{av:'A10758SumKgs',fld:'SUMKGS',pic:'ZZZZZ9.99'},{av:'A10759SumMts',fld:'SUMMTS',pic:'ZZZZZ9.99'},{av:'A10760SumPzs',fld:'SUMPZS',pic:'ZZZ9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A2150AlbDetMtrD',fld:'ALBDETMTRD',pic:'ZZZZZ9.99'},{av:'A2147AlbDetKgmD',fld:'ALBDETKGMD',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'A2152AlbDetPie',fld:'ALBDETPIE',pic:'ZZZ9'},{av:'A2149AlbDetMtr',fld:'ALBDETMTR',pic:'ZZZZZ9.99'},{av:'A2146AlbDetKgm',fld:'ALBDETKGM',pic:'ZZZZZ9.99'},{av:'A2151AlbDetMtrU',fld:'ALBDETMTRU',pic:'ZZZZZ9.99'},{av:'A2148AlbDetKgmU',fld:'ALBDETKGMU',pic:'ZZZZZ9.99'},{av:'A10758SumKgs',fld:'SUMKGS',pic:'ZZZZZ9.99'},{av:'A10759SumMts',fld:'SUMMTS',pic:'ZZZZZ9.99'},{av:'A10760SumPzs',fld:'SUMPZS',pic:'ZZZ9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A2150AlbDetMtrD',fld:'ALBDETMTRD',pic:'ZZZZZ9.99'},{av:'A2147AlbDetKgmD',fld:'ALBDETKGMD',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNI","{handler:'valid_Albruni',iparms:[{av:'A2149AlbDetMtr',fld:'ALBDETMTR',pic:'ZZZZZ9.99'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A2146AlbDetKgm',fld:'ALBDETKGM',pic:'ZZZZZ9.99'},{av:'A2151AlbDetMtrU',fld:'ALBDETMTRU',pic:'ZZZZZ9.99'},{av:'A2148AlbDetKgmU',fld:'ALBDETKGMU',pic:'ZZZZZ9.99'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A2147AlbDetKgmD',fld:'ALBDETKGMD',pic:'ZZZZZ9.99'},{av:'A2150AlbDetMtrD',fld:'ALBDETMTRD',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2153AlbDetPieU',fld:'ALBDETPIEU',pic:'ZZZ9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_ALBRUNI",",oparms:[{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A2153AlbDetPieU',fld:'ALBDETPIEU',pic:'ZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRANC","{handler:'valid_Albranc',iparms:[]");
      setEventMetadata("VALID_ALBRANC",",oparms:[]}");
      setEventMetadata("VALID_ALBRECPIE","{handler:'valid_Albrecpie',iparms:[{av:'AV73Noctrlpz',fld:'vNOCTRLPZ',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''},{av:'A13693AlbRecObs',fld:'ALBRECOBS',pic:''},{av:'AV81PzaProd',fld:'vPZAPROD',pic:'9'},{av:'A4806AlRPieDefC',fld:'ALRPIEDEFC',pic:'ZZZZZ9'},{av:'A4795AlRPieCal',fld:'ALRPIECAL',pic:''},{av:'AV62Msg_err',fld:'vMSG_ERR',pic:''}]");
      setEventMetadata("VALID_ALBRECPIE",",oparms:[{av:'A4806AlRPieDefC',fld:'ALRPIEDEFC',pic:'ZZZZZ9'},{av:'A13693AlbRecObs',fld:'ALBRECOBS',pic:''},{av:'A4795AlRPieCal',fld:'ALRPIECAL',pic:''},{av:'AV81PzaProd',fld:'vPZAPROD',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''},{av:'AV62Msg_err',fld:'vMSG_ERR',pic:''}]}");
      setEventMetadata("VALID_ALBRECMTR","{handler:'valid_Albrecmtr',iparms:[{av:'AV52CalMKT',fld:'vCALMKT',pic:'9'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''},{av:'AV51FlagArt',fld:'vFLAGART',pic:'9'},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O2157AlbRecMtr'},{av:'O10759SumMts'},{av:'A2157AlbRecMtr',fld:'ALBRECMTR',pic:'ZZZZZ9.99'},{av:'A4806AlRPieDefC',fld:'ALRPIEDEFC',pic:'ZZZZZ9'},{av:'A4797AlRPieClaC',fld:'ALRPIECLAC',pic:''},{av:'AV49Rdto',fld:'vRDTO',pic:'ZZ9.99'},{av:'AV50Pesoml',fld:'vPESOML',pic:'ZZZ9'},{av:'AV100Anc',fld:'vANC',pic:'ZZZ9'},{av:'AV101grm2',fld:'vGRM2',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRECMTR",",oparms:[{av:'A4797AlRPieClaC',fld:'ALRPIECLAC',pic:''},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A2157AlbRecMtr',fld:'ALBRECMTR',pic:'ZZZZZ9.99'},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99'},{av:'AV49Rdto',fld:'vRDTO',pic:'ZZ9.99'},{av:'AV50Pesoml',fld:'vPESOML',pic:'ZZZ9'},{av:'AV100Anc',fld:'vANC',pic:'ZZZ9'},{av:'AV101grm2',fld:'vGRM2',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRECKGM","{handler:'valid_Albreckgm',iparms:[{av:'AV48SumPza',fld:'vSUMPZA',pic:'9'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O2155AlbRecKgm'},{av:'O10758SumKgs'},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''}]");
      setEventMetadata("VALID_ALBRECKGM",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''}]}");
      setEventMetadata("VALID_ALBRECMTRU","{handler:'valid_Albrecmtru',iparms:[]");
      setEventMetadata("VALID_ALBRECMTRU",",oparms:[]}");
      setEventMetadata("VALID_ALBRECKGMU","{handler:'valid_Albreckgmu',iparms:[]");
      setEventMetadata("VALID_ALBRECKGMU",",oparms:[]}");
      setEventMetadata("VALID_ALBRECOBS","{handler:'valid_Albrecobs',iparms:[]");
      setEventMetadata("VALID_ALBRECOBS",",oparms:[]}");
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
      pr_default.close(51);
      pr_default.close(23);
      pr_default.close(24);
      pr_default.close(25);
      pr_default.close(26);
      pr_default.close(27);
   }

   /* Aggregate/select formulas */
   public int getAlbDetPieU1( String E396EmprCod ,
                              int E44AlbRecCod )
   {
      Gx_cnt = 0 ;
      /* Using cursor T01P167 */
      pr_default.execute(58, new Object[] {E396EmprCod, Boolean.valueOf(nA44AlbRecCod), Integer.valueOf(E44AlbRecCod)});
      if ( (pr_default.getStatus(58) != 101) )
      {
         Gx_cnt = T01P167_Gx_cnt[0] ;
      }
      pr_default.close(58);
      return Gx_cnt ;
   }

   public int getAlbDetPieU0( String E396EmprCod ,
                              int E44AlbRecCod )
   {
      Gx_cnt = 0 ;
      /* Using cursor T01P168 */
      pr_default.execute(59, new Object[] {E396EmprCod, Boolean.valueOf(nE44AlbRecCod), Integer.valueOf(E44AlbRecCod)});
      if ( (pr_default.getStatus(59) != 101) )
      {
         Gx_cnt = T01P168_Gx_cnt[0] ;
      }
      pr_default.close(59);
      return Gx_cnt ;
   }

   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV104EmprCod = "" ;
      Z396EmprCod = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z46AlbREnt = "" ;
      Z5806AlbREnt2 = "" ;
      Z49AlbRFen = GXutil.nullDate() ;
      Z4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      Z45AlbRef = "" ;
      Z3613AlbRefDsc = "" ;
      Z1291AlbRDes = "" ;
      Z56AlbRUni = "" ;
      Z50AlbRLoc = "" ;
      Z55AlbRReo = "" ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      Z6180AlbrUniC = DecimalUtil.ZERO ;
      Z6463AlbRLote = "" ;
      Z13241AlbRPh = DecimalUtil.ZERO ;
      Z13242AlbRRLong = DecimalUtil.ZERO ;
      Z13243AlbRRTrans = DecimalUtil.ZERO ;
      Z8029AlbNumM = "" ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      O10758SumKgs = DecimalUtil.ZERO ;
      O10759SumMts = DecimalUtil.ZERO ;
      Z2159AlbRecPie = "" ;
      Z4795AlRPieCal = "" ;
      Z2157AlbRecMtr = DecimalUtil.ZERO ;
      Z2155AlbRecKgm = DecimalUtil.ZERO ;
      Z2158AlbRecMtrU = DecimalUtil.ZERO ;
      Z2156AlbRecKgmU = DecimalUtil.ZERO ;
      Z8779Bod_Talla = "" ;
      Z3731AlbRecIdPz = "" ;
      Z4410AlbRecPal = DecimalUtil.ZERO ;
      Z10180AlRPieTelT = "" ;
      Z10181AlRPieOri = "" ;
      Z10182AlRPieDst = "" ;
      Z10183AlrPieKgmT = DecimalUtil.ZERO ;
      Z7408ALRPIELOC = "" ;
      O2155AlbRecKgm = DecimalUtil.ZERO ;
      O2157AlbRecMtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A2159AlbRecPie = "" ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      AV104EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A2146AlbDetKgm = DecimalUtil.ZERO ;
      A2148AlbDetKgmU = DecimalUtil.ZERO ;
      A2149AlbDetMtr = DecimalUtil.ZERO ;
      A2151AlbDetMtrU = DecimalUtil.ZERO ;
      A2147AlbDetKgmD = DecimalUtil.ZERO ;
      A2150AlbDetMtrD = DecimalUtil.ZERO ;
      A55AlbRReo = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ucDvpanel_unnamedtable6 = new com.genexus.webpanels.GXUserControl();
      sStyleString = "" ;
      lblTextblockalbrent_Jsonclick = "" ;
      A46AlbREnt = "" ;
      lblTextblockalbrent2_Jsonclick = "" ;
      A5806AlbREnt2 = "" ;
      lblTextblockalbrfen_Jsonclick = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      lblTextblockalbrhen_Jsonclick = "" ;
      A4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      ucDvpanel_unnamedtable7 = new com.genexus.webpanels.GXUserControl();
      lblTextblockclicod_Jsonclick = "" ;
      lblTextblockclinom_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblockalbref_Jsonclick = "" ;
      A45AlbRef = "" ;
      lblTextblockalbrefdsc_Jsonclick = "" ;
      A3613AlbRefDsc = "" ;
      ucDvpanel_unnamedtable8 = new com.genexus.webpanels.GXUserControl();
      lblTextblockprocenom_Jsonclick = "" ;
      A971ProceNom = "" ;
      lblTextblocktrnnom_Jsonclick = "" ;
      A841TrnNom = "" ;
      ucDvpanel_unnamedtable9 = new com.genexus.webpanels.GXUserControl();
      lblTextblockalbrunient_Jsonclick = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      lblTextblockalbruni_Jsonclick = "" ;
      lblTextblockalbrpieent_Jsonclick = "" ;
      lblTextblockalbrunic_Jsonclick = "" ;
      A6180AlbrUniC = DecimalUtil.ZERO ;
      lblTextblockalbrpiec_Jsonclick = "" ;
      A8029AlbNumM = "" ;
      ucDvpanel_unnamedtable10 = new com.genexus.webpanels.GXUserControl();
      lblTextblockalbruniuti_Jsonclick = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      lblTextblockalbrunidis_Jsonclick = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      lblTextblockalbrpieuti_Jsonclick = "" ;
      lblTextblockalbrpiedis_Jsonclick = "" ;
      lblTextblockalbrfecult_Jsonclick = "" ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      lblTextblockalbrest_Jsonclick = "" ;
      ucDvpanel_unnamedtable11 = new com.genexus.webpanels.GXUserControl();
      lblTextblocktipentnom_Jsonclick = "" ;
      A1212TipEntNom = "" ;
      lblTextblockalbrdes_Jsonclick = "" ;
      A1291AlbRDes = "" ;
      lblTextblockalbrlote_Jsonclick = "" ;
      A6463AlbRLote = "" ;
      ucDvpanel_unnamedtable12 = new com.genexus.webpanels.GXUserControl();
      lblTextblockalbrloc_Jsonclick = "" ;
      A50AlbRLoc = "" ;
      lblTextblockalbrreo_Jsonclick = "" ;
      ucDvpanel_unnamedtable13 = new com.genexus.webpanels.GXUserControl();
      lblTextblockalbrgrm2_Jsonclick = "" ;
      lblTextblockalbranc_Jsonclick = "" ;
      lblTextblockalbpml_Jsonclick = "" ;
      ucDvpanel_unnamedtable14 = new com.genexus.webpanels.GXUserControl();
      lblTextblockalbrph_Jsonclick = "" ;
      A13241AlbRPh = DecimalUtil.ZERO ;
      lblTextblockalbrrlong_Jsonclick = "" ;
      A13242AlbRRLong = DecimalUtil.ZERO ;
      lblTextblockalbrrtrans_Jsonclick = "" ;
      A13243AlbRRTrans = DecimalUtil.ZERO ;
      ucDvpanel_pnlnumerarpiezas = new com.genexus.webpanels.GXUserControl();
      bttBtndonumerarpiezas_Jsonclick = "" ;
      ucDvpanel_pnldetallepiezas = new com.genexus.webpanels.GXUserControl();
      Gridlevel_piezasContainer = new com.genexus.webpanels.GXWebGrid(context);
      B10758SumKgs = DecimalUtil.ZERO ;
      A10758SumKgs = DecimalUtil.ZERO ;
      B10759SumMts = DecimalUtil.ZERO ;
      A10759SumMts = DecimalUtil.ZERO ;
      sMode299 = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      lblTextblocksumkgs_Jsonclick = "" ;
      lblTextblocksummts_Jsonclick = "" ;
      lblTextblocksumpzs_Jsonclick = "" ;
      ucDvpanel_pnlbotones = new com.genexus.webpanels.GXUserControl();
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A59AlbRUniReb = DecimalUtil.ZERO ;
      A407EmprNom = "" ;
      AV125Pgmname = "" ;
      A4795AlRPieCal = "" ;
      A4797AlRPieClaC = "" ;
      AV62Msg_err = "" ;
      AV49Rdto = DecimalUtil.ZERO ;
      A8779Bod_Talla = "" ;
      A3731AlbRecIdPz = "" ;
      A4410AlbRecPal = DecimalUtil.ZERO ;
      A10180AlRPieTelT = "" ;
      A10181AlRPieOri = "" ;
      A10182AlRPieDst = "" ;
      A10183AlrPieKgmT = DecimalUtil.ZERO ;
      Dvpanel_unnamedtable6_Objectcall = "" ;
      Dvpanel_unnamedtable6_Class = "" ;
      Dvpanel_unnamedtable6_Height = "" ;
      Dvpanel_unnamedtable7_Objectcall = "" ;
      Dvpanel_unnamedtable7_Class = "" ;
      Dvpanel_unnamedtable7_Height = "" ;
      Dvpanel_unnamedtable8_Objectcall = "" ;
      Dvpanel_unnamedtable8_Class = "" ;
      Dvpanel_unnamedtable8_Height = "" ;
      Dvpanel_unnamedtable9_Objectcall = "" ;
      Dvpanel_unnamedtable9_Class = "" ;
      Dvpanel_unnamedtable9_Height = "" ;
      Dvpanel_unnamedtable10_Objectcall = "" ;
      Dvpanel_unnamedtable10_Class = "" ;
      Dvpanel_unnamedtable10_Height = "" ;
      Dvpanel_unnamedtable11_Objectcall = "" ;
      Dvpanel_unnamedtable11_Class = "" ;
      Dvpanel_unnamedtable11_Height = "" ;
      Dvpanel_unnamedtable12_Objectcall = "" ;
      Dvpanel_unnamedtable12_Class = "" ;
      Dvpanel_unnamedtable12_Height = "" ;
      Dvpanel_unnamedtable13_Objectcall = "" ;
      Dvpanel_unnamedtable13_Class = "" ;
      Dvpanel_unnamedtable13_Height = "" ;
      Dvpanel_unnamedtable14_Objectcall = "" ;
      Dvpanel_unnamedtable14_Class = "" ;
      Dvpanel_unnamedtable14_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_pnlnumerarpiezas_Objectcall = "" ;
      Dvpanel_pnlnumerarpiezas_Class = "" ;
      Dvpanel_pnlnumerarpiezas_Height = "" ;
      Dvpanel_unnamedtable2_Objectcall = "" ;
      Dvpanel_unnamedtable2_Class = "" ;
      Dvpanel_unnamedtable2_Height = "" ;
      Dvpanel_pnldetallepiezas_Objectcall = "" ;
      Dvpanel_pnldetallepiezas_Class = "" ;
      Dvpanel_pnldetallepiezas_Height = "" ;
      Dvpanel_pnlbotones_Objectcall = "" ;
      Dvpanel_pnlbotones_Class = "" ;
      Dvpanel_pnlbotones_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode7 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s10758SumKgs = DecimalUtil.ZERO ;
      s10759SumMts = DecimalUtil.ZERO ;
      s2147AlbDetKgmD = DecimalUtil.ZERO ;
      O2147AlbDetKgmD = DecimalUtil.ZERO ;
      s2150AlbDetMtrD = DecimalUtil.ZERO ;
      O2150AlbDetMtrD = DecimalUtil.ZERO ;
      s58AlbRUniEnt = DecimalUtil.ZERO ;
      O58AlbRUniEnt = DecimalUtil.ZERO ;
      s60AlbRUniUti = DecimalUtil.ZERO ;
      O60AlbRUniUti = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A7408ALRPIELOC = "" ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A13693AlbRecObs = "" ;
      T2155AlbRecKgm = DecimalUtil.ZERO ;
      T2157AlbRecMtr = DecimalUtil.ZERO ;
      T01P17_A2152AlbDetPie = new short[1] ;
      T01P17_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P17_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P17_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P17_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P17_A10758SumKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P17_A10759SumMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P17_A10760SumPzs = new short[1] ;
      AV29Station = "" ;
      AV7EmprNom = "" ;
      AV8UsurCod = "" ;
      AV106WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV107TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV108WebSession = httpContext.getWebSession();
      AV113TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z841TrnNom = "" ;
      Z971ProceNom = "" ;
      Z1212TipEntNom = "" ;
      Z2149AlbDetMtr = DecimalUtil.ZERO ;
      Z2146AlbDetKgm = DecimalUtil.ZERO ;
      Z2151AlbDetMtrU = DecimalUtil.ZERO ;
      Z2148AlbDetKgmU = DecimalUtil.ZERO ;
      Z10758SumKgs = DecimalUtil.ZERO ;
      Z10759SumMts = DecimalUtil.ZERO ;
      T01P110_A407EmprNom = new String[] {""} ;
      T01P110_n407EmprNom = new boolean[] {false} ;
      T01P114_A1212TipEntNom = new String[] {""} ;
      T01P114_n1212TipEntNom = new boolean[] {false} ;
      T01P112_A841TrnNom = new String[] {""} ;
      T01P112_n841TrnNom = new boolean[] {false} ;
      T01P113_A971ProceNom = new String[] {""} ;
      T01P113_n971ProceNom = new boolean[] {false} ;
      T01P111_A279CliNom = new String[] {""} ;
      T01P116_A44AlbRecCod = new int[1] ;
      T01P116_n44AlbRecCod = new boolean[] {false} ;
      T01P116_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P116_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P116_A52AlbRPieEnt = new int[1] ;
      T01P116_A54AlbRPieUti = new int[1] ;
      T01P116_A47AlbREst = new byte[1] ;
      T01P116_A407EmprNom = new String[] {""} ;
      T01P116_n407EmprNom = new boolean[] {false} ;
      T01P116_A46AlbREnt = new String[] {""} ;
      T01P116_A5806AlbREnt2 = new String[] {""} ;
      T01P116_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01P116_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01P116_n4606AlbRHEn = new boolean[] {false} ;
      T01P116_A279CliNom = new String[] {""} ;
      T01P116_A45AlbRef = new String[] {""} ;
      T01P116_A3613AlbRefDsc = new String[] {""} ;
      T01P116_A971ProceNom = new String[] {""} ;
      T01P116_n971ProceNom = new boolean[] {false} ;
      T01P116_A841TrnNom = new String[] {""} ;
      T01P116_n841TrnNom = new boolean[] {false} ;
      T01P116_A1212TipEntNom = new String[] {""} ;
      T01P116_n1212TipEntNom = new boolean[] {false} ;
      T01P116_A1291AlbRDes = new String[] {""} ;
      T01P116_A56AlbRUni = new String[] {""} ;
      T01P116_A50AlbRLoc = new String[] {""} ;
      T01P116_A55AlbRReo = new String[] {""} ;
      T01P116_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T01P116_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P116_A6181AlbrPieC = new int[1] ;
      T01P116_A4920AlbRGrm2 = new short[1] ;
      T01P116_A4921AlbRAnc = new short[1] ;
      T01P116_A4922AlbPml = new short[1] ;
      T01P116_A6463AlbRLote = new String[] {""} ;
      T01P116_A13241AlbRPh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P116_n13241AlbRPh = new boolean[] {false} ;
      T01P116_A13242AlbRRLong = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P116_n13242AlbRRLong = new boolean[] {false} ;
      T01P116_A13243AlbRRTrans = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P116_n13243AlbRRTrans = new boolean[] {false} ;
      T01P116_A8029AlbNumM = new String[] {""} ;
      T01P116_A53AlbRPieReb = new int[1] ;
      T01P116_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P116_A10761AlbUltP = new short[1] ;
      T01P116_n10761AlbUltP = new boolean[] {false} ;
      T01P116_A7501AlbRecSec = new short[1] ;
      T01P116_n7501AlbRecSec = new boolean[] {false} ;
      T01P116_A1222AlbNumEti = new short[1] ;
      T01P116_A396EmprCod = new String[] {""} ;
      T01P116_A252CliCod = new int[1] ;
      T01P116_A840TrnCod = new short[1] ;
      T01P116_n840TrnCod = new boolean[] {false} ;
      T01P116_A970ProceCod = new short[1] ;
      T01P116_n970ProceCod = new boolean[] {false} ;
      T01P116_A1211TipEntCod = new short[1] ;
      T01P116_n1211TipEntCod = new boolean[] {false} ;
      T01P116_A2152AlbDetPie = new short[1] ;
      T01P116_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P116_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P116_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P116_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P116_A10758SumKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P116_A10759SumMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P116_A10760SumPzs = new short[1] ;
      T01P117_A279CliNom = new String[] {""} ;
      T01P118_A841TrnNom = new String[] {""} ;
      T01P118_n841TrnNom = new boolean[] {false} ;
      T01P119_A971ProceNom = new String[] {""} ;
      T01P119_n971ProceNom = new boolean[] {false} ;
      T01P120_A1212TipEntNom = new String[] {""} ;
      T01P120_n1212TipEntNom = new boolean[] {false} ;
      T01P122_A2152AlbDetPie = new short[1] ;
      T01P122_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P122_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P122_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P122_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P122_A10758SumKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P122_A10759SumMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P122_A10760SumPzs = new short[1] ;
      T01P123_A396EmprCod = new String[] {""} ;
      T01P123_A44AlbRecCod = new int[1] ;
      T01P123_n44AlbRecCod = new boolean[] {false} ;
      T01P19_A44AlbRecCod = new int[1] ;
      T01P19_n44AlbRecCod = new boolean[] {false} ;
      T01P19_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P19_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P19_A52AlbRPieEnt = new int[1] ;
      T01P19_A54AlbRPieUti = new int[1] ;
      T01P19_A47AlbREst = new byte[1] ;
      T01P19_A46AlbREnt = new String[] {""} ;
      T01P19_A5806AlbREnt2 = new String[] {""} ;
      T01P19_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01P19_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01P19_n4606AlbRHEn = new boolean[] {false} ;
      T01P19_A45AlbRef = new String[] {""} ;
      T01P19_A3613AlbRefDsc = new String[] {""} ;
      T01P19_A1291AlbRDes = new String[] {""} ;
      T01P19_A56AlbRUni = new String[] {""} ;
      T01P19_A50AlbRLoc = new String[] {""} ;
      T01P19_A55AlbRReo = new String[] {""} ;
      T01P19_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T01P19_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P19_A6181AlbrPieC = new int[1] ;
      T01P19_A4920AlbRGrm2 = new short[1] ;
      T01P19_A4921AlbRAnc = new short[1] ;
      T01P19_A4922AlbPml = new short[1] ;
      T01P19_A6463AlbRLote = new String[] {""} ;
      T01P19_A13241AlbRPh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P19_n13241AlbRPh = new boolean[] {false} ;
      T01P19_A13242AlbRRLong = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P19_n13242AlbRRLong = new boolean[] {false} ;
      T01P19_A13243AlbRRTrans = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P19_n13243AlbRRTrans = new boolean[] {false} ;
      T01P19_A8029AlbNumM = new String[] {""} ;
      T01P19_A53AlbRPieReb = new int[1] ;
      T01P19_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P19_A10761AlbUltP = new short[1] ;
      T01P19_n10761AlbUltP = new boolean[] {false} ;
      T01P19_A7501AlbRecSec = new short[1] ;
      T01P19_n7501AlbRecSec = new boolean[] {false} ;
      T01P19_A1222AlbNumEti = new short[1] ;
      T01P19_A396EmprCod = new String[] {""} ;
      T01P19_A252CliCod = new int[1] ;
      T01P19_A840TrnCod = new short[1] ;
      T01P19_n840TrnCod = new boolean[] {false} ;
      T01P19_A970ProceCod = new short[1] ;
      T01P19_n970ProceCod = new boolean[] {false} ;
      T01P19_A1211TipEntCod = new short[1] ;
      T01P19_n1211TipEntCod = new boolean[] {false} ;
      T01P124_A396EmprCod = new String[] {""} ;
      T01P124_A44AlbRecCod = new int[1] ;
      T01P124_n44AlbRecCod = new boolean[] {false} ;
      T01P125_A396EmprCod = new String[] {""} ;
      T01P125_A44AlbRecCod = new int[1] ;
      T01P125_n44AlbRecCod = new boolean[] {false} ;
      T01P18_A44AlbRecCod = new int[1] ;
      T01P18_n44AlbRecCod = new boolean[] {false} ;
      T01P18_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P18_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P18_A52AlbRPieEnt = new int[1] ;
      T01P18_A54AlbRPieUti = new int[1] ;
      T01P18_A47AlbREst = new byte[1] ;
      T01P18_A46AlbREnt = new String[] {""} ;
      T01P18_A5806AlbREnt2 = new String[] {""} ;
      T01P18_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01P18_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01P18_n4606AlbRHEn = new boolean[] {false} ;
      T01P18_A45AlbRef = new String[] {""} ;
      T01P18_A3613AlbRefDsc = new String[] {""} ;
      T01P18_A1291AlbRDes = new String[] {""} ;
      T01P18_A56AlbRUni = new String[] {""} ;
      T01P18_A50AlbRLoc = new String[] {""} ;
      T01P18_A55AlbRReo = new String[] {""} ;
      T01P18_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T01P18_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P18_A6181AlbrPieC = new int[1] ;
      T01P18_A4920AlbRGrm2 = new short[1] ;
      T01P18_A4921AlbRAnc = new short[1] ;
      T01P18_A4922AlbPml = new short[1] ;
      T01P18_A6463AlbRLote = new String[] {""} ;
      T01P18_A13241AlbRPh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P18_n13241AlbRPh = new boolean[] {false} ;
      T01P18_A13242AlbRRLong = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P18_n13242AlbRRLong = new boolean[] {false} ;
      T01P18_A13243AlbRRTrans = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P18_n13243AlbRRTrans = new boolean[] {false} ;
      T01P18_A8029AlbNumM = new String[] {""} ;
      T01P18_A53AlbRPieReb = new int[1] ;
      T01P18_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P18_A10761AlbUltP = new short[1] ;
      T01P18_n10761AlbUltP = new boolean[] {false} ;
      T01P18_A7501AlbRecSec = new short[1] ;
      T01P18_n7501AlbRecSec = new boolean[] {false} ;
      T01P18_A1222AlbNumEti = new short[1] ;
      T01P18_A396EmprCod = new String[] {""} ;
      T01P18_A252CliCod = new int[1] ;
      T01P18_A840TrnCod = new short[1] ;
      T01P18_n840TrnCod = new boolean[] {false} ;
      T01P18_A970ProceCod = new short[1] ;
      T01P18_n970ProceCod = new boolean[] {false} ;
      T01P18_A1211TipEntCod = new short[1] ;
      T01P18_n1211TipEntCod = new boolean[] {false} ;
      T01P129_A279CliNom = new String[] {""} ;
      T01P130_A841TrnNom = new String[] {""} ;
      T01P130_n841TrnNom = new boolean[] {false} ;
      T01P131_A971ProceNom = new String[] {""} ;
      T01P131_n971ProceNom = new boolean[] {false} ;
      T01P132_A1212TipEntNom = new String[] {""} ;
      T01P132_n1212TipEntNom = new boolean[] {false} ;
      T01P134_A2152AlbDetPie = new short[1] ;
      T01P134_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P134_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P134_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P134_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P134_A10758SumKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P134_A10759SumMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P134_A10760SumPzs = new short[1] ;
      T01P135_A396EmprCod = new String[] {""} ;
      T01P135_A13026PedDGId = new int[1] ;
      T01P135_A44AlbRecCod = new int[1] ;
      T01P135_n44AlbRecCod = new boolean[] {false} ;
      T01P136_A396EmprCod = new String[] {""} ;
      T01P136_A11669DevCruId = new int[1] ;
      T01P136_A44AlbRecCod = new int[1] ;
      T01P136_n44AlbRecCod = new boolean[] {false} ;
      T01P137_A396EmprCod = new String[] {""} ;
      T01P137_A44AlbRecCod = new int[1] ;
      T01P137_n44AlbRecCod = new boolean[] {false} ;
      T01P137_A9743Emp_CUb = new String[] {""} ;
      T01P137_A5860Emp_Anp = new short[1] ;
      T01P138_A396EmprCod = new String[] {""} ;
      T01P138_A44AlbRecCod = new int[1] ;
      T01P138_n44AlbRecCod = new boolean[] {false} ;
      T01P138_A7130MatC_Pz = new String[] {""} ;
      T01P139_A396EmprCod = new String[] {""} ;
      T01P139_A44AlbRecCod = new int[1] ;
      T01P139_n44AlbRecCod = new boolean[] {false} ;
      T01P139_A7132MatC_Talla = new String[] {""} ;
      T01P140_A396EmprCod = new String[] {""} ;
      T01P140_A44AlbRecCod = new int[1] ;
      T01P140_n44AlbRecCod = new boolean[] {false} ;
      T01P140_A7115MatC_Lin = new short[1] ;
      T01P141_A396EmprCod = new String[] {""} ;
      T01P141_A30AlbProCod = new long[1] ;
      T01P141_A129BarCod = new int[1] ;
      T01P141_A132BarCodReo = new byte[1] ;
      T01P141_A130BarCodPar = new String[] {""} ;
      T01P141_A6622AlbHdRLn = new short[1] ;
      T01P142_A396EmprCod = new String[] {""} ;
      T01P142_A6235DevEmpCod = new int[1] ;
      T01P142_A6243DevNumLin = new byte[1] ;
      T01P143_A396EmprCod = new String[] {""} ;
      T01P143_A44AlbRecCod = new int[1] ;
      T01P143_n44AlbRecCod = new boolean[] {false} ;
      T01P143_A4596AlbRDefCod = new short[1] ;
      T01P144_A396EmprCod = new String[] {""} ;
      T01P144_A44AlbRecCod = new int[1] ;
      T01P144_n44AlbRecCod = new boolean[] {false} ;
      T01P144_A2159AlbRecPie = new String[] {""} ;
      T01P144_A4395AlRDefCod = new short[1] ;
      T01P144_A4412AlRFasCod = new String[] {""} ;
      T01P145_A396EmprCod = new String[] {""} ;
      T01P145_A44AlbRecCod = new int[1] ;
      T01P145_n44AlbRecCod = new boolean[] {false} ;
      T01P145_A2165HisEmpLin = new short[1] ;
      T01P146_A396EmprCod = new String[] {""} ;
      T01P146_A44AlbRecCod = new int[1] ;
      T01P146_n44AlbRecCod = new boolean[] {false} ;
      T01P146_A1299AlbRLin = new byte[1] ;
      T01P147_A396EmprCod = new String[] {""} ;
      T01P147_A361DisCod = new int[1] ;
      T01P147_A44AlbRecCod = new int[1] ;
      T01P147_n44AlbRecCod = new boolean[] {false} ;
      T01P148_A396EmprCod = new String[] {""} ;
      T01P148_A323DevGenCod = new int[1] ;
      T01P149_A396EmprCod = new String[] {""} ;
      T01P149_A129BarCod = new int[1] ;
      T01P149_A132BarCodReo = new byte[1] ;
      T01P149_A130BarCodPar = new String[] {""} ;
      T01P149_A200BarPieCod = new String[] {""} ;
      T01P151_A396EmprCod = new String[] {""} ;
      T01P151_A44AlbRecCod = new int[1] ;
      T01P151_n44AlbRecCod = new boolean[] {false} ;
      T01P152_A4795AlRPieCal = new String[] {""} ;
      T01P152_A44AlbRecCod = new int[1] ;
      T01P152_n44AlbRecCod = new boolean[] {false} ;
      T01P152_A2159AlbRecPie = new String[] {""} ;
      T01P152_A2154AlbRecAnh = new short[1] ;
      T01P152_A10762AlbPCont = new short[1] ;
      T01P152_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P152_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P152_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P152_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P152_A8779Bod_Talla = new String[] {""} ;
      T01P152_A8780Bod_Und = new short[1] ;
      T01P152_A3730AlbRecCol = new short[1] ;
      T01P152_A3731AlbRecIdPz = new String[] {""} ;
      T01P152_A3732AlbRecIdRc = new int[1] ;
      T01P152_A4410AlbRecPal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P152_A10180AlRPieTelT = new String[] {""} ;
      T01P152_A10149AlRPieCon = new int[1] ;
      T01P152_A10181AlRPieOri = new String[] {""} ;
      T01P152_A10182AlRPieDst = new String[] {""} ;
      T01P152_A10183AlrPieKgmT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P152_A7408ALRPIELOC = new String[] {""} ;
      T01P152_A396EmprCod = new String[] {""} ;
      T01P15_A4806AlRPieDefC = new int[1] ;
      T01P15_n4806AlRPieDefC = new boolean[] {false} ;
      T01P154_A4806AlRPieDefC = new int[1] ;
      T01P154_n4806AlRPieDefC = new boolean[] {false} ;
      T01P155_A396EmprCod = new String[] {""} ;
      T01P155_A44AlbRecCod = new int[1] ;
      T01P155_n44AlbRecCod = new boolean[] {false} ;
      T01P155_A2159AlbRecPie = new String[] {""} ;
      T01P13_A4795AlRPieCal = new String[] {""} ;
      T01P13_A44AlbRecCod = new int[1] ;
      T01P13_n44AlbRecCod = new boolean[] {false} ;
      T01P13_A2159AlbRecPie = new String[] {""} ;
      T01P13_A2154AlbRecAnh = new short[1] ;
      T01P13_A10762AlbPCont = new short[1] ;
      T01P13_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P13_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P13_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P13_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P13_A8779Bod_Talla = new String[] {""} ;
      T01P13_A8780Bod_Und = new short[1] ;
      T01P13_A3730AlbRecCol = new short[1] ;
      T01P13_A3731AlbRecIdPz = new String[] {""} ;
      T01P13_A3732AlbRecIdRc = new int[1] ;
      T01P13_A4410AlbRecPal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P13_A10180AlRPieTelT = new String[] {""} ;
      T01P13_A10149AlRPieCon = new int[1] ;
      T01P13_A10181AlRPieOri = new String[] {""} ;
      T01P13_A10182AlRPieDst = new String[] {""} ;
      T01P13_A10183AlrPieKgmT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P13_A7408ALRPIELOC = new String[] {""} ;
      T01P13_A396EmprCod = new String[] {""} ;
      T01P12_A4795AlRPieCal = new String[] {""} ;
      T01P12_A44AlbRecCod = new int[1] ;
      T01P12_n44AlbRecCod = new boolean[] {false} ;
      T01P12_A2159AlbRecPie = new String[] {""} ;
      T01P12_A2154AlbRecAnh = new short[1] ;
      T01P12_A10762AlbPCont = new short[1] ;
      T01P12_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P12_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P12_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P12_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P12_A8779Bod_Talla = new String[] {""} ;
      T01P12_A8780Bod_Und = new short[1] ;
      T01P12_A3730AlbRecCol = new short[1] ;
      T01P12_A3731AlbRecIdPz = new String[] {""} ;
      T01P12_A3732AlbRecIdRc = new int[1] ;
      T01P12_A4410AlbRecPal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P12_A10180AlRPieTelT = new String[] {""} ;
      T01P12_A10149AlRPieCon = new int[1] ;
      T01P12_A10181AlRPieOri = new String[] {""} ;
      T01P12_A10182AlRPieDst = new String[] {""} ;
      T01P12_A10183AlrPieKgmT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P12_A7408ALRPIELOC = new String[] {""} ;
      T01P12_A396EmprCod = new String[] {""} ;
      T01P160_A4806AlRPieDefC = new int[1] ;
      T01P160_n4806AlRPieDefC = new boolean[] {false} ;
      T01P161_A396EmprCod = new String[] {""} ;
      T01P161_A44AlbRecCod = new int[1] ;
      T01P161_n44AlbRecCod = new boolean[] {false} ;
      T01P161_A2159AlbRecPie = new String[] {""} ;
      T01P161_A10188AlRFibOrd = new int[1] ;
      T01P162_A396EmprCod = new String[] {""} ;
      T01P162_A44AlbRecCod = new int[1] ;
      T01P162_n44AlbRecCod = new boolean[] {false} ;
      T01P162_A2159AlbRecPie = new String[] {""} ;
      T01P162_A9568CodHilz = new String[] {""} ;
      T01P163_A396EmprCod = new String[] {""} ;
      T01P163_A44AlbRecCod = new int[1] ;
      T01P163_n44AlbRecCod = new boolean[] {false} ;
      T01P163_A2159AlbRecPie = new String[] {""} ;
      T01P163_A7697AlREtiTpo = new byte[1] ;
      T01P164_A396EmprCod = new String[] {""} ;
      T01P164_A44AlbRecCod = new int[1] ;
      T01P164_n44AlbRecCod = new boolean[] {false} ;
      T01P164_A2159AlbRecPie = new String[] {""} ;
      T01P164_A5262AlbRecEvt = new short[1] ;
      T01P165_A396EmprCod = new String[] {""} ;
      T01P165_A44AlbRecCod = new int[1] ;
      T01P165_n44AlbRecCod = new boolean[] {false} ;
      T01P165_A2159AlbRecPie = new String[] {""} ;
      T01P165_A4395AlRDefCod = new short[1] ;
      T01P165_A4412AlRFasCod = new String[] {""} ;
      T01P166_A396EmprCod = new String[] {""} ;
      T01P166_A44AlbRecCod = new int[1] ;
      T01P166_n44AlbRecCod = new boolean[] {false} ;
      T01P166_A2159AlbRecPie = new String[] {""} ;
      Gridlevel_piezasRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_piezas_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_piezasColumn = new com.genexus.webpanels.GXWebColumn();
      Z2150AlbDetMtrD = DecimalUtil.ZERO ;
      Z2147AlbDetKgmD = DecimalUtil.ZERO ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      GXt_char1 = "" ;
      GXv_int6 = new byte[1] ;
      GXv_char2 = new String[1] ;
      Z13693AlbRecObs = "" ;
      ZV62Msg_err = "" ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int15 = new short[1] ;
      GXv_int14 = new short[1] ;
      GXv_int13 = new short[1] ;
      Z4797AlRPieClaC = "" ;
      ZV49Rdto = DecimalUtil.ZERO ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char3 = new String[1] ;
      E396EmprCod = "" ;
      T01P167_Gx_cnt = new int[1] ;
      T01P168_Gx_cnt = new int[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.talbdet2__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.talbdet2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.talbdet2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.talbdet2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbdet2__default(),
         new Object[] {
             new Object[] {
            T01P12_A4795AlRPieCal, T01P12_A44AlbRecCod, T01P12_A2159AlbRecPie, T01P12_A2154AlbRecAnh, T01P12_A10762AlbPCont, T01P12_A2157AlbRecMtr, T01P12_A2155AlbRecKgm, T01P12_A2158AlbRecMtrU, T01P12_A2156AlbRecKgmU, T01P12_A8779Bod_Talla,
            T01P12_A8780Bod_Und, T01P12_A3730AlbRecCol, T01P12_A3731AlbRecIdPz, T01P12_A3732AlbRecIdRc, T01P12_A4410AlbRecPal, T01P12_A10180AlRPieTelT, T01P12_A10149AlRPieCon, T01P12_A10181AlRPieOri, T01P12_A10182AlRPieDst, T01P12_A10183AlrPieKgmT,
            T01P12_A7408ALRPIELOC, T01P12_A396EmprCod
            }
            , new Object[] {
            T01P13_A4795AlRPieCal, T01P13_A44AlbRecCod, T01P13_A2159AlbRecPie, T01P13_A2154AlbRecAnh, T01P13_A10762AlbPCont, T01P13_A2157AlbRecMtr, T01P13_A2155AlbRecKgm, T01P13_A2158AlbRecMtrU, T01P13_A2156AlbRecKgmU, T01P13_A8779Bod_Talla,
            T01P13_A8780Bod_Und, T01P13_A3730AlbRecCol, T01P13_A3731AlbRecIdPz, T01P13_A3732AlbRecIdRc, T01P13_A4410AlbRecPal, T01P13_A10180AlRPieTelT, T01P13_A10149AlRPieCon, T01P13_A10181AlRPieOri, T01P13_A10182AlRPieDst, T01P13_A10183AlrPieKgmT,
            T01P13_A7408ALRPIELOC, T01P13_A396EmprCod
            }
            , new Object[] {
            T01P15_A4806AlRPieDefC, T01P15_n4806AlRPieDefC
            }
            , new Object[] {
            T01P17_A2152AlbDetPie, T01P17_A2149AlbDetMtr, T01P17_A2146AlbDetKgm, T01P17_A2151AlbDetMtrU, T01P17_A2148AlbDetKgmU, T01P17_A10758SumKgs, T01P17_A10759SumMts, T01P17_A10760SumPzs
            }
            , new Object[] {
            T01P18_A44AlbRecCod, T01P18_A58AlbRUniEnt, T01P18_A60AlbRUniUti, T01P18_A52AlbRPieEnt, T01P18_A54AlbRPieUti, T01P18_A47AlbREst, T01P18_A46AlbREnt, T01P18_A5806AlbREnt2, T01P18_A49AlbRFen, T01P18_A4606AlbRHEn,
            T01P18_n4606AlbRHEn, T01P18_A45AlbRef, T01P18_A3613AlbRefDsc, T01P18_A1291AlbRDes, T01P18_A56AlbRUni, T01P18_A50AlbRLoc, T01P18_A55AlbRReo, T01P18_A48AlbRFecUlt, T01P18_A6180AlbrUniC, T01P18_A6181AlbrPieC,
            T01P18_A4920AlbRGrm2, T01P18_A4921AlbRAnc, T01P18_A4922AlbPml, T01P18_A6463AlbRLote, T01P18_A13241AlbRPh, T01P18_n13241AlbRPh, T01P18_A13242AlbRRLong, T01P18_n13242AlbRRLong, T01P18_A13243AlbRRTrans, T01P18_n13243AlbRRTrans,
            T01P18_A8029AlbNumM, T01P18_A53AlbRPieReb, T01P18_A59AlbRUniReb, T01P18_A10761AlbUltP, T01P18_n10761AlbUltP, T01P18_A7501AlbRecSec, T01P18_n7501AlbRecSec, T01P18_A1222AlbNumEti, T01P18_A396EmprCod, T01P18_A252CliCod,
            T01P18_A840TrnCod, T01P18_n840TrnCod, T01P18_A970ProceCod, T01P18_n970ProceCod, T01P18_A1211TipEntCod, T01P18_n1211TipEntCod
            }
            , new Object[] {
            T01P19_A44AlbRecCod, T01P19_A58AlbRUniEnt, T01P19_A60AlbRUniUti, T01P19_A52AlbRPieEnt, T01P19_A54AlbRPieUti, T01P19_A47AlbREst, T01P19_A46AlbREnt, T01P19_A5806AlbREnt2, T01P19_A49AlbRFen, T01P19_A4606AlbRHEn,
            T01P19_n4606AlbRHEn, T01P19_A45AlbRef, T01P19_A3613AlbRefDsc, T01P19_A1291AlbRDes, T01P19_A56AlbRUni, T01P19_A50AlbRLoc, T01P19_A55AlbRReo, T01P19_A48AlbRFecUlt, T01P19_A6180AlbrUniC, T01P19_A6181AlbrPieC,
            T01P19_A4920AlbRGrm2, T01P19_A4921AlbRAnc, T01P19_A4922AlbPml, T01P19_A6463AlbRLote, T01P19_A13241AlbRPh, T01P19_n13241AlbRPh, T01P19_A13242AlbRRLong, T01P19_n13242AlbRRLong, T01P19_A13243AlbRRTrans, T01P19_n13243AlbRRTrans,
            T01P19_A8029AlbNumM, T01P19_A53AlbRPieReb, T01P19_A59AlbRUniReb, T01P19_A10761AlbUltP, T01P19_n10761AlbUltP, T01P19_A7501AlbRecSec, T01P19_n7501AlbRecSec, T01P19_A1222AlbNumEti, T01P19_A396EmprCod, T01P19_A252CliCod,
            T01P19_A840TrnCod, T01P19_n840TrnCod, T01P19_A970ProceCod, T01P19_n970ProceCod, T01P19_A1211TipEntCod, T01P19_n1211TipEntCod
            }
            , new Object[] {
            T01P110_A407EmprNom, T01P110_n407EmprNom
            }
            , new Object[] {
            T01P111_A279CliNom
            }
            , new Object[] {
            T01P112_A841TrnNom, T01P112_n841TrnNom
            }
            , new Object[] {
            T01P113_A971ProceNom, T01P113_n971ProceNom
            }
            , new Object[] {
            T01P114_A1212TipEntNom, T01P114_n1212TipEntNom
            }
            , new Object[] {
            T01P116_A44AlbRecCod, T01P116_A58AlbRUniEnt, T01P116_A60AlbRUniUti, T01P116_A52AlbRPieEnt, T01P116_A54AlbRPieUti, T01P116_A47AlbREst, T01P116_A407EmprNom, T01P116_n407EmprNom, T01P116_A46AlbREnt, T01P116_A5806AlbREnt2,
            T01P116_A49AlbRFen, T01P116_A4606AlbRHEn, T01P116_n4606AlbRHEn, T01P116_A279CliNom, T01P116_A45AlbRef, T01P116_A3613AlbRefDsc, T01P116_A971ProceNom, T01P116_n971ProceNom, T01P116_A841TrnNom, T01P116_n841TrnNom,
            T01P116_A1212TipEntNom, T01P116_n1212TipEntNom, T01P116_A1291AlbRDes, T01P116_A56AlbRUni, T01P116_A50AlbRLoc, T01P116_A55AlbRReo, T01P116_A48AlbRFecUlt, T01P116_A6180AlbrUniC, T01P116_A6181AlbrPieC, T01P116_A4920AlbRGrm2,
            T01P116_A4921AlbRAnc, T01P116_A4922AlbPml, T01P116_A6463AlbRLote, T01P116_A13241AlbRPh, T01P116_n13241AlbRPh, T01P116_A13242AlbRRLong, T01P116_n13242AlbRRLong, T01P116_A13243AlbRRTrans, T01P116_n13243AlbRRTrans, T01P116_A8029AlbNumM,
            T01P116_A53AlbRPieReb, T01P116_A59AlbRUniReb, T01P116_A10761AlbUltP, T01P116_n10761AlbUltP, T01P116_A7501AlbRecSec, T01P116_n7501AlbRecSec, T01P116_A1222AlbNumEti, T01P116_A396EmprCod, T01P116_A252CliCod, T01P116_A840TrnCod,
            T01P116_n840TrnCod, T01P116_A970ProceCod, T01P116_n970ProceCod, T01P116_A1211TipEntCod, T01P116_n1211TipEntCod, T01P116_A2152AlbDetPie, T01P116_A2149AlbDetMtr, T01P116_A2146AlbDetKgm, T01P116_A2151AlbDetMtrU, T01P116_A2148AlbDetKgmU,
            T01P116_A10758SumKgs, T01P116_A10759SumMts, T01P116_A10760SumPzs
            }
            , new Object[] {
            T01P117_A279CliNom
            }
            , new Object[] {
            T01P118_A841TrnNom, T01P118_n841TrnNom
            }
            , new Object[] {
            T01P119_A971ProceNom, T01P119_n971ProceNom
            }
            , new Object[] {
            T01P120_A1212TipEntNom, T01P120_n1212TipEntNom
            }
            , new Object[] {
            T01P122_A2152AlbDetPie, T01P122_A2149AlbDetMtr, T01P122_A2146AlbDetKgm, T01P122_A2151AlbDetMtrU, T01P122_A2148AlbDetKgmU, T01P122_A10758SumKgs, T01P122_A10759SumMts, T01P122_A10760SumPzs
            }
            , new Object[] {
            T01P123_A396EmprCod, T01P123_A44AlbRecCod
            }
            , new Object[] {
            T01P124_A396EmprCod, T01P124_A44AlbRecCod
            }
            , new Object[] {
            T01P125_A396EmprCod, T01P125_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01P129_A279CliNom
            }
            , new Object[] {
            T01P130_A841TrnNom, T01P130_n841TrnNom
            }
            , new Object[] {
            T01P131_A971ProceNom, T01P131_n971ProceNom
            }
            , new Object[] {
            T01P132_A1212TipEntNom, T01P132_n1212TipEntNom
            }
            , new Object[] {
            T01P134_A2152AlbDetPie, T01P134_A2149AlbDetMtr, T01P134_A2146AlbDetKgm, T01P134_A2151AlbDetMtrU, T01P134_A2148AlbDetKgmU, T01P134_A10758SumKgs, T01P134_A10759SumMts, T01P134_A10760SumPzs
            }
            , new Object[] {
            T01P135_A396EmprCod, T01P135_A13026PedDGId, T01P135_A44AlbRecCod
            }
            , new Object[] {
            T01P136_A396EmprCod, T01P136_A11669DevCruId, T01P136_A44AlbRecCod
            }
            , new Object[] {
            T01P137_A396EmprCod, T01P137_A44AlbRecCod, T01P137_A9743Emp_CUb, T01P137_A5860Emp_Anp
            }
            , new Object[] {
            T01P138_A396EmprCod, T01P138_A44AlbRecCod, T01P138_A7130MatC_Pz
            }
            , new Object[] {
            T01P139_A396EmprCod, T01P139_A44AlbRecCod, T01P139_A7132MatC_Talla
            }
            , new Object[] {
            T01P140_A396EmprCod, T01P140_A44AlbRecCod, T01P140_A7115MatC_Lin
            }
            , new Object[] {
            T01P141_A396EmprCod, T01P141_A30AlbProCod, T01P141_A129BarCod, T01P141_A132BarCodReo, T01P141_A130BarCodPar, T01P141_A6622AlbHdRLn
            }
            , new Object[] {
            T01P142_A396EmprCod, T01P142_A6235DevEmpCod, T01P142_A6243DevNumLin
            }
            , new Object[] {
            T01P143_A396EmprCod, T01P143_A44AlbRecCod, T01P143_A4596AlbRDefCod
            }
            , new Object[] {
            T01P144_A396EmprCod, T01P144_A44AlbRecCod, T01P144_A2159AlbRecPie, T01P144_A4395AlRDefCod, T01P144_A4412AlRFasCod
            }
            , new Object[] {
            T01P145_A396EmprCod, T01P145_A44AlbRecCod, T01P145_A2165HisEmpLin
            }
            , new Object[] {
            T01P146_A396EmprCod, T01P146_A44AlbRecCod, T01P146_A1299AlbRLin
            }
            , new Object[] {
            T01P147_A396EmprCod, T01P147_A361DisCod, T01P147_A44AlbRecCod
            }
            , new Object[] {
            T01P148_A396EmprCod, T01P148_A323DevGenCod
            }
            , new Object[] {
            T01P149_A396EmprCod, T01P149_A129BarCod, T01P149_A132BarCodReo, T01P149_A130BarCodPar, T01P149_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01P151_A396EmprCod, T01P151_A44AlbRecCod
            }
            , new Object[] {
            T01P152_A4795AlRPieCal, T01P152_A44AlbRecCod, T01P152_A2159AlbRecPie, T01P152_A2154AlbRecAnh, T01P152_A10762AlbPCont, T01P152_A2157AlbRecMtr, T01P152_A2155AlbRecKgm, T01P152_A2158AlbRecMtrU, T01P152_A2156AlbRecKgmU, T01P152_A8779Bod_Talla,
            T01P152_A8780Bod_Und, T01P152_A3730AlbRecCol, T01P152_A3731AlbRecIdPz, T01P152_A3732AlbRecIdRc, T01P152_A4410AlbRecPal, T01P152_A10180AlRPieTelT, T01P152_A10149AlRPieCon, T01P152_A10181AlRPieOri, T01P152_A10182AlRPieDst, T01P152_A10183AlrPieKgmT,
            T01P152_A7408ALRPIELOC, T01P152_A396EmprCod
            }
            , new Object[] {
            T01P154_A4806AlRPieDefC, T01P154_n4806AlRPieDefC
            }
            , new Object[] {
            T01P155_A396EmprCod, T01P155_A44AlbRecCod, T01P155_A2159AlbRecPie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01P160_A4806AlRPieDefC, T01P160_n4806AlRPieDefC
            }
            , new Object[] {
            T01P161_A396EmprCod, T01P161_A44AlbRecCod, T01P161_A2159AlbRecPie, T01P161_A10188AlRFibOrd
            }
            , new Object[] {
            T01P162_A396EmprCod, T01P162_A44AlbRecCod, T01P162_A2159AlbRecPie, T01P162_A9568CodHilz
            }
            , new Object[] {
            T01P163_A396EmprCod, T01P163_A44AlbRecCod, T01P163_A2159AlbRecPie, T01P163_A7697AlREtiTpo
            }
            , new Object[] {
            T01P164_A396EmprCod, T01P164_A44AlbRecCod, T01P164_A2159AlbRecPie, T01P164_A5262AlbRecEvt
            }
            , new Object[] {
            T01P165_A396EmprCod, T01P165_A44AlbRecCod, T01P165_A2159AlbRecPie, T01P165_A4395AlRDefCod, T01P165_A4412AlRFasCod
            }
            , new Object[] {
            T01P166_A396EmprCod, T01P166_A44AlbRecCod, T01P166_A2159AlbRecPie
            }
            , new Object[] {
            T01P167_Gx_cnt
            }
            , new Object[] {
            T01P168_Gx_cnt
            }
         }
      );
      Z396EmprCod = "" ;
      E396EmprCod = "" ;
      A396EmprCod = "" ;
      AV125Pgmname = "TALBDET2" ;
      Z2154AlbRecAnh = (short)(0) ;
      A2154AlbRecAnh = (short)(0) ;
      i2154AlbRecAnh = (short)(0) ;
   }

   private byte Z47AlbREst ;
   private byte GxWebError ;
   private byte AV73Noctrlpz ;
   private byte AV48SumPza ;
   private byte AV51FlagArt ;
   private byte AV52CalMKT ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A47AlbREst ;
   private byte AV81PzaProd ;
   private byte AV61NoPzaR ;
   private byte AV80Velluts ;
   private byte s47AlbREst ;
   private byte O47AlbREst ;
   private byte AV41FlagKgs ;
   private byte AV42FlagMts ;
   private byte AV44FlagGraf ;
   private byte AV57Artextil ;
   private byte AV66Tintatex ;
   private byte AV69SiArt ;
   private byte AV74VerItm ;
   private byte AV79Enc20c ;
   private byte AV85Colorsol ;
   private byte AV88PesSim ;
   private byte AV90Termilenio ;
   private byte AV91stamperia ;
   private byte AV94Piolera ;
   private byte AV95tintoriente ;
   private byte AV98Estampamos ;
   private byte AV103biarprint ;
   private byte AV96UbicaL ;
   private byte AV99ValorUbica ;
   private byte subGridlevel_piezas_Backcolorstyle ;
   private byte subGridlevel_piezas_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_piezas_Allowselection ;
   private byte subGridlevel_piezas_Allowhovering ;
   private byte subGridlevel_piezas_Allowcollapsing ;
   private byte subGridlevel_piezas_Collapsed ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte ZV81PzaProd ;
   private short Z4920AlbRGrm2 ;
   private short Z4921AlbRAnc ;
   private short Z4922AlbPml ;
   private short Z10761AlbUltP ;
   private short Z7501AlbRecSec ;
   private short Z1222AlbNumEti ;
   private short Z840TrnCod ;
   private short Z970ProceCod ;
   private short Z1211TipEntCod ;
   private short O10761AlbUltP ;
   private short O10760SumPzs ;
   private short N970ProceCod ;
   private short N840TrnCod ;
   private short N1211TipEntCod ;
   private short Z2154AlbRecAnh ;
   private short Z10762AlbPCont ;
   private short Z8780Bod_Und ;
   private short Z3730AlbRecCol ;
   private short nRcdDeleted_299 ;
   private short nRcdExists_299 ;
   private short nIsMod_299 ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short A1211TipEntCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4921AlbRAnc ;
   private short A10761AlbUltP ;
   private short A2152AlbDetPie ;
   private short A2153AlbDetPieU ;
   private short A4920AlbRGrm2 ;
   private short A4922AlbPml ;
   private short nBlankRcdCount299 ;
   private short RcdFound299 ;
   private short B10761AlbUltP ;
   private short B10760SumPzs ;
   private short A10760SumPzs ;
   private short nBlankRcdUsr299 ;
   private short A7501AlbRecSec ;
   private short A1222AlbNumEti ;
   private short AV110Insert_ProceCod ;
   private short AV111Insert_TrnCod ;
   private short AV112Insert_TipEntCod ;
   private short A10762AlbPCont ;
   private short AV50Pesoml ;
   private short AV100Anc ;
   private short AV101grm2 ;
   private short A8780Bod_Und ;
   private short A3730AlbRecCol ;
   private short RcdFound7 ;
   private short s10761AlbUltP ;
   private short s10760SumPzs ;
   private short s2153AlbDetPieU ;
   private short O2153AlbDetPieU ;
   private short A2154AlbRecAnh ;
   private short Z2152AlbDetPie ;
   private short Z10760SumPzs ;
   private short nIsDirty_7 ;
   private short nIsDirty_299 ;
   private short i10761AlbUltP ;
   private short i2154AlbRecAnh ;
   private short i10762AlbPCont ;
   private short i10760SumPzs ;
   private short Z2153AlbDetPieU ;
   private short GXv_int15[] ;
   private short GXv_int14[] ;
   private short GXv_int13[] ;
   private short ZV50Pesoml ;
   private short ZV100Anc ;
   private short ZV101grm2 ;
   private int wcpOAV105AlbRecCod ;
   private int Z44AlbRecCod ;
   private int Z52AlbRPieEnt ;
   private int Z54AlbRPieUti ;
   private int Z6181AlbrPieC ;
   private int Z53AlbRPieReb ;
   private int Z252CliCod ;
   private int nRC_GXsfl_383 ;
   private int nGXsfl_383_idx=1 ;
   private int Z3732AlbRecIdRc ;
   private int Z10149AlRPieCon ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int AV105AlbRecCod ;
   private int trnEnded ;
   private int edtAlbRecCod_Enabled ;
   private int edtAlbREnt_Visible ;
   private int edtAlbREnt_Enabled ;
   private int edtAlbREnt2_Visible ;
   private int edtAlbREnt2_Enabled ;
   private int edtAlbRFen_Enabled ;
   private int edtAlbRHEn_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtAlbRefDsc_Enabled ;
   private int edtProceNom_Enabled ;
   private int edtTrnNom_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int A52AlbRPieEnt ;
   private int edtAlbRPieEnt_Enabled ;
   private int edtAlbrUniC_Enabled ;
   private int A6181AlbrPieC ;
   private int edtAlbrPieC_Enabled ;
   private int edtAlbNumM_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int A54AlbRPieUti ;
   private int edtAlbRPieUti_Enabled ;
   private int A51AlbRPieDis ;
   private int edtAlbRPieDis_Enabled ;
   private int edtAlbRFecUlt_Enabled ;
   private int edtTipEntNom_Enabled ;
   private int edtAlbRDes_Enabled ;
   private int edtAlbRLote_Enabled ;
   private int edtAlbRLoc_Enabled ;
   private int edtAlbRGrm2_Enabled ;
   private int edtAlbRAnc_Enabled ;
   private int edtAlbPml_Enabled ;
   private int edtAlbRPh_Enabled ;
   private int edtAlbRRLong_Enabled ;
   private int edtAlbRRTrans_Enabled ;
   private int bttBtndonumerarpiezas_Visible ;
   private int edtAlbRecPie_Enabled ;
   private int edtAlbRecAnh_Enabled ;
   private int edtALRPIELOC_Enabled ;
   private int edtAlbRecMtr_Enabled ;
   private int edtAlbRecKgm_Enabled ;
   private int edtAlbRecMtrU_Enabled ;
   private int edtAlbRecKgmU_Enabled ;
   private int edtAlbRecObs_Enabled ;
   private int fRowAdded ;
   private int edtSumKgs_Enabled ;
   private int edtSumMts_Enabled ;
   private int edtSumPzs_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int A53AlbRPieReb ;
   private int AV109Insert_CliCod ;
   private int A4806AlRPieDefC ;
   private int A3732AlbRecIdRc ;
   private int A10149AlRPieCon ;
   private int Dvpanel_unnamedtable6_Gxcontroltype ;
   private int Dvpanel_unnamedtable7_Gxcontroltype ;
   private int Dvpanel_unnamedtable8_Gxcontroltype ;
   private int Dvpanel_unnamedtable9_Gxcontroltype ;
   private int Dvpanel_unnamedtable10_Gxcontroltype ;
   private int Dvpanel_unnamedtable11_Gxcontroltype ;
   private int Dvpanel_unnamedtable12_Gxcontroltype ;
   private int Dvpanel_unnamedtable13_Gxcontroltype ;
   private int Dvpanel_unnamedtable14_Gxcontroltype ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Dvpanel_pnlnumerarpiezas_Gxcontroltype ;
   private int Dvpanel_unnamedtable2_Gxcontroltype ;
   private int Dvpanel_pnldetallepiezas_Gxcontroltype ;
   private int Dvpanel_pnlbotones_Gxcontroltype ;
   private int s52AlbRPieEnt ;
   private int O52AlbRPieEnt ;
   private int s54AlbRPieUti ;
   private int O54AlbRPieUti ;
   private int GXt_int7 ;
   private int AV126GXV1 ;
   private int GX_JID ;
   private int subGridlevel_piezas_Backcolor ;
   private int subGridlevel_piezas_Allbackcolor ;
   private int defedtALRPIELOC_Enabled ;
   private int defedtAlbRecPie_Enabled ;
   private int idxLst ;
   private int subGridlevel_piezas_Selectedindex ;
   private int subGridlevel_piezas_Selectioncolor ;
   private int subGridlevel_piezas_Hoveringcolor ;
   private int Z51AlbRPieDis ;
   private int Z4806AlRPieDefC ;
   private int GXv_int8[] ;
   private int Gx_cnt ;
   private int E44AlbRecCod ;
   private long GRIDLEVEL_PIEZAS_nFirstRecordOnPage ;
   private long AV59f_NOTREC ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z6180AlbrUniC ;
   private java.math.BigDecimal Z13241AlbRPh ;
   private java.math.BigDecimal Z13242AlbRRLong ;
   private java.math.BigDecimal Z13243AlbRRTrans ;
   private java.math.BigDecimal Z59AlbRUniReb ;
   private java.math.BigDecimal O10758SumKgs ;
   private java.math.BigDecimal O10759SumMts ;
   private java.math.BigDecimal Z2157AlbRecMtr ;
   private java.math.BigDecimal Z2155AlbRecKgm ;
   private java.math.BigDecimal Z2158AlbRecMtrU ;
   private java.math.BigDecimal Z2156AlbRecKgmU ;
   private java.math.BigDecimal Z4410AlbRecPal ;
   private java.math.BigDecimal Z10183AlrPieKgmT ;
   private java.math.BigDecimal O2155AlbRecKgm ;
   private java.math.BigDecimal O2157AlbRecMtr ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2146AlbDetKgm ;
   private java.math.BigDecimal A2148AlbDetKgmU ;
   private java.math.BigDecimal A2149AlbDetMtr ;
   private java.math.BigDecimal A2151AlbDetMtrU ;
   private java.math.BigDecimal A2147AlbDetKgmD ;
   private java.math.BigDecimal A2150AlbDetMtrD ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A6180AlbrUniC ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A13241AlbRPh ;
   private java.math.BigDecimal A13242AlbRRLong ;
   private java.math.BigDecimal A13243AlbRRTrans ;
   private java.math.BigDecimal B10758SumKgs ;
   private java.math.BigDecimal A10758SumKgs ;
   private java.math.BigDecimal B10759SumMts ;
   private java.math.BigDecimal A10759SumMts ;
   private java.math.BigDecimal A59AlbRUniReb ;
   private java.math.BigDecimal AV49Rdto ;
   private java.math.BigDecimal A4410AlbRecPal ;
   private java.math.BigDecimal A10183AlrPieKgmT ;
   private java.math.BigDecimal s10758SumKgs ;
   private java.math.BigDecimal s10759SumMts ;
   private java.math.BigDecimal s2147AlbDetKgmD ;
   private java.math.BigDecimal O2147AlbDetKgmD ;
   private java.math.BigDecimal s2150AlbDetMtrD ;
   private java.math.BigDecimal O2150AlbDetMtrD ;
   private java.math.BigDecimal s58AlbRUniEnt ;
   private java.math.BigDecimal O58AlbRUniEnt ;
   private java.math.BigDecimal s60AlbRUniUti ;
   private java.math.BigDecimal O60AlbRUniUti ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal T2155AlbRecKgm ;
   private java.math.BigDecimal T2157AlbRecMtr ;
   private java.math.BigDecimal Z2149AlbDetMtr ;
   private java.math.BigDecimal Z2146AlbDetKgm ;
   private java.math.BigDecimal Z2151AlbDetMtrU ;
   private java.math.BigDecimal Z2148AlbDetKgmU ;
   private java.math.BigDecimal Z10758SumKgs ;
   private java.math.BigDecimal Z10759SumMts ;
   private java.math.BigDecimal Z2150AlbDetMtrD ;
   private java.math.BigDecimal Z2147AlbDetKgmD ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal ZV49Rdto ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV104EmprCod ;
   private String Z396EmprCod ;
   private String Z46AlbREnt ;
   private String Z5806AlbREnt2 ;
   private String Z45AlbRef ;
   private String Z3613AlbRefDsc ;
   private String Z1291AlbRDes ;
   private String Z56AlbRUni ;
   private String Z50AlbRLoc ;
   private String Z55AlbRReo ;
   private String Z6463AlbRLote ;
   private String Z8029AlbNumM ;
   private String Z2159AlbRecPie ;
   private String Z4795AlRPieCal ;
   private String Z8779Bod_Talla ;
   private String Z3731AlbRecIdPz ;
   private String Z10180AlRPieTelT ;
   private String Z10181AlRPieOri ;
   private String Z10182AlRPieDst ;
   private String Z7408ALRPIELOC ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A2159AlbRecPie ;
   private String A56AlbRUni ;
   private String AV104EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbRecCod_Internalname ;
   private String sGXsfl_383_idx="0001" ;
   private String A55AlbRReo ;
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
   private String TempTags ;
   private String edtAlbRecCod_Jsonclick ;
   private String Dvpanel_unnamedtable6_Width ;
   private String Dvpanel_unnamedtable6_Cls ;
   private String Dvpanel_unnamedtable6_Title ;
   private String Dvpanel_unnamedtable6_Iconposition ;
   private String Dvpanel_unnamedtable6_Internalname ;
   private String sStyleString ;
   private String tblUnnamedtable6_Internalname ;
   private String divUnnamedtable23_Internalname ;
   private String divAlbrent_cell_Internalname ;
   private String divAlbrent_cell_Class ;
   private String divUnnamedtablealbrent_Internalname ;
   private String lblTextblockalbrent_Internalname ;
   private String lblTextblockalbrent_Jsonclick ;
   private String edtAlbREnt_Internalname ;
   private String A46AlbREnt ;
   private String edtAlbREnt_Jsonclick ;
   private String divAlbrent2_cell_Internalname ;
   private String divAlbrent2_cell_Class ;
   private String divUnnamedtablealbrent2_Internalname ;
   private String lblTextblockalbrent2_Internalname ;
   private String lblTextblockalbrent2_Jsonclick ;
   private String edtAlbREnt2_Internalname ;
   private String A5806AlbREnt2 ;
   private String edtAlbREnt2_Jsonclick ;
   private String divUnnamedtablealbrfen_Internalname ;
   private String lblTextblockalbrfen_Internalname ;
   private String lblTextblockalbrfen_Jsonclick ;
   private String edtAlbRFen_Internalname ;
   private String edtAlbRFen_Jsonclick ;
   private String divUnnamedtablealbrhen_Internalname ;
   private String lblTextblockalbrhen_Internalname ;
   private String lblTextblockalbrhen_Jsonclick ;
   private String edtAlbRHEn_Internalname ;
   private String edtAlbRHEn_Jsonclick ;
   private String tblTablemergedunnamedtable7_Internalname ;
   private String Dvpanel_unnamedtable7_Width ;
   private String Dvpanel_unnamedtable7_Cls ;
   private String Dvpanel_unnamedtable7_Title ;
   private String Dvpanel_unnamedtable7_Iconposition ;
   private String Dvpanel_unnamedtable7_Internalname ;
   private String tblUnnamedtable7_Internalname ;
   private String divUnnamedtable22_Internalname ;
   private String divUnnamedtableclicod_Internalname ;
   private String lblTextblockclicod_Internalname ;
   private String lblTextblockclicod_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String divUnnamedtableclinom_Internalname ;
   private String lblTextblockclinom_Internalname ;
   private String lblTextblockclinom_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String divUnnamedtablealbref_Internalname ;
   private String lblTextblockalbref_Internalname ;
   private String lblTextblockalbref_Jsonclick ;
   private String edtAlbRef_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Jsonclick ;
   private String divUnnamedtablealbrefdsc_Internalname ;
   private String lblTextblockalbrefdsc_Internalname ;
   private String lblTextblockalbrefdsc_Jsonclick ;
   private String edtAlbRefDsc_Internalname ;
   private String A3613AlbRefDsc ;
   private String edtAlbRefDsc_Jsonclick ;
   private String Dvpanel_unnamedtable8_Width ;
   private String Dvpanel_unnamedtable8_Cls ;
   private String Dvpanel_unnamedtable8_Title ;
   private String Dvpanel_unnamedtable8_Iconposition ;
   private String Dvpanel_unnamedtable8_Internalname ;
   private String tblUnnamedtable8_Internalname ;
   private String divUnnamedtable21_Internalname ;
   private String divUnnamedtableprocenom_Internalname ;
   private String lblTextblockprocenom_Internalname ;
   private String lblTextblockprocenom_Jsonclick ;
   private String edtProceNom_Internalname ;
   private String A971ProceNom ;
   private String edtProceNom_Jsonclick ;
   private String divUnnamedtabletrnnom_Internalname ;
   private String lblTextblocktrnnom_Internalname ;
   private String lblTextblocktrnnom_Jsonclick ;
   private String edtTrnNom_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Jsonclick ;
   private String tblTablemergedunnamedtable9_Internalname ;
   private String Dvpanel_unnamedtable9_Width ;
   private String Dvpanel_unnamedtable9_Cls ;
   private String Dvpanel_unnamedtable9_Title ;
   private String Dvpanel_unnamedtable9_Iconposition ;
   private String Dvpanel_unnamedtable9_Internalname ;
   private String tblUnnamedtable9_Internalname ;
   private String divUnnamedtable20_Internalname ;
   private String divUnnamedtablealbrunient_Internalname ;
   private String lblTextblockalbrunient_Internalname ;
   private String lblTextblockalbrunient_Jsonclick ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String divUnnamedtablealbruni_Internalname ;
   private String lblTextblockalbruni_Internalname ;
   private String lblTextblockalbruni_Jsonclick ;
   private String divUnnamedtablealbrpieent_Internalname ;
   private String lblTextblockalbrpieent_Internalname ;
   private String lblTextblockalbrpieent_Jsonclick ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String divUnnamedtablealbrunic_Internalname ;
   private String lblTextblockalbrunic_Internalname ;
   private String lblTextblockalbrunic_Jsonclick ;
   private String edtAlbrUniC_Internalname ;
   private String edtAlbrUniC_Jsonclick ;
   private String divUnnamedtablealbrpiec_Internalname ;
   private String lblTextblockalbrpiec_Internalname ;
   private String lblTextblockalbrpiec_Jsonclick ;
   private String edtAlbrPieC_Internalname ;
   private String edtAlbrPieC_Jsonclick ;
   private String edtAlbNumM_Internalname ;
   private String A8029AlbNumM ;
   private String edtAlbNumM_Jsonclick ;
   private String Dvpanel_unnamedtable10_Width ;
   private String Dvpanel_unnamedtable10_Cls ;
   private String Dvpanel_unnamedtable10_Title ;
   private String Dvpanel_unnamedtable10_Iconposition ;
   private String Dvpanel_unnamedtable10_Internalname ;
   private String tblUnnamedtable10_Internalname ;
   private String divUnnamedtable19_Internalname ;
   private String divUnnamedtablealbruniuti_Internalname ;
   private String lblTextblockalbruniuti_Internalname ;
   private String lblTextblockalbruniuti_Jsonclick ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRUniUti_Jsonclick ;
   private String divUnnamedtablealbrunidis_Internalname ;
   private String lblTextblockalbrunidis_Internalname ;
   private String lblTextblockalbrunidis_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String divUnnamedtablealbrpieuti_Internalname ;
   private String lblTextblockalbrpieuti_Internalname ;
   private String lblTextblockalbrpieuti_Jsonclick ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieUti_Jsonclick ;
   private String divUnnamedtablealbrpiedis_Internalname ;
   private String lblTextblockalbrpiedis_Internalname ;
   private String lblTextblockalbrpiedis_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
   private String divUnnamedtablealbrfecult_Internalname ;
   private String lblTextblockalbrfecult_Internalname ;
   private String lblTextblockalbrfecult_Jsonclick ;
   private String edtAlbRFecUlt_Internalname ;
   private String edtAlbRFecUlt_Jsonclick ;
   private String divUnnamedtablealbrest_Internalname ;
   private String lblTextblockalbrest_Internalname ;
   private String lblTextblockalbrest_Jsonclick ;
   private String tblTablemergedunnamedtable11_Internalname ;
   private String Dvpanel_unnamedtable11_Width ;
   private String Dvpanel_unnamedtable11_Cls ;
   private String Dvpanel_unnamedtable11_Title ;
   private String Dvpanel_unnamedtable11_Iconposition ;
   private String Dvpanel_unnamedtable11_Internalname ;
   private String tblUnnamedtable11_Internalname ;
   private String divUnnamedtable18_Internalname ;
   private String divUnnamedtabletipentnom_Internalname ;
   private String lblTextblocktipentnom_Internalname ;
   private String lblTextblocktipentnom_Jsonclick ;
   private String edtTipEntNom_Internalname ;
   private String A1212TipEntNom ;
   private String edtTipEntNom_Jsonclick ;
   private String divUnnamedtablealbrdes_Internalname ;
   private String lblTextblockalbrdes_Internalname ;
   private String lblTextblockalbrdes_Jsonclick ;
   private String edtAlbRDes_Internalname ;
   private String A1291AlbRDes ;
   private String edtAlbRDes_Jsonclick ;
   private String divUnnamedtablealbrlote_Internalname ;
   private String lblTextblockalbrlote_Internalname ;
   private String lblTextblockalbrlote_Jsonclick ;
   private String edtAlbRLote_Internalname ;
   private String A6463AlbRLote ;
   private String edtAlbRLote_Jsonclick ;
   private String Dvpanel_unnamedtable12_Width ;
   private String Dvpanel_unnamedtable12_Cls ;
   private String Dvpanel_unnamedtable12_Title ;
   private String Dvpanel_unnamedtable12_Iconposition ;
   private String Dvpanel_unnamedtable12_Internalname ;
   private String tblUnnamedtable12_Internalname ;
   private String divUnnamedtable17_Internalname ;
   private String divUnnamedtablealbrloc_Internalname ;
   private String lblTextblockalbrloc_Internalname ;
   private String lblTextblockalbrloc_Jsonclick ;
   private String edtAlbRLoc_Internalname ;
   private String A50AlbRLoc ;
   private String edtAlbRLoc_Jsonclick ;
   private String divUnnamedtablealbrreo_Internalname ;
   private String lblTextblockalbrreo_Internalname ;
   private String lblTextblockalbrreo_Jsonclick ;
   private String tblTablemergedunnamedtable13_Internalname ;
   private String Dvpanel_unnamedtable13_Width ;
   private String Dvpanel_unnamedtable13_Cls ;
   private String Dvpanel_unnamedtable13_Title ;
   private String Dvpanel_unnamedtable13_Iconposition ;
   private String Dvpanel_unnamedtable13_Internalname ;
   private String tblUnnamedtable13_Internalname ;
   private String divUnnamedtable16_Internalname ;
   private String divUnnamedtablealbrgrm2_Internalname ;
   private String lblTextblockalbrgrm2_Internalname ;
   private String lblTextblockalbrgrm2_Jsonclick ;
   private String edtAlbRGrm2_Internalname ;
   private String edtAlbRGrm2_Jsonclick ;
   private String divUnnamedtablealbranc_Internalname ;
   private String lblTextblockalbranc_Internalname ;
   private String lblTextblockalbranc_Jsonclick ;
   private String edtAlbRAnc_Internalname ;
   private String edtAlbRAnc_Jsonclick ;
   private String divUnnamedtablealbpml_Internalname ;
   private String lblTextblockalbpml_Internalname ;
   private String lblTextblockalbpml_Jsonclick ;
   private String edtAlbPml_Internalname ;
   private String edtAlbPml_Jsonclick ;
   private String Dvpanel_unnamedtable14_Width ;
   private String Dvpanel_unnamedtable14_Cls ;
   private String Dvpanel_unnamedtable14_Title ;
   private String Dvpanel_unnamedtable14_Iconposition ;
   private String Dvpanel_unnamedtable14_Internalname ;
   private String tblUnnamedtable14_Internalname ;
   private String divUnnamedtable15_Internalname ;
   private String divUnnamedtablealbrph_Internalname ;
   private String lblTextblockalbrph_Internalname ;
   private String lblTextblockalbrph_Jsonclick ;
   private String edtAlbRPh_Internalname ;
   private String edtAlbRPh_Jsonclick ;
   private String divUnnamedtablealbrrlong_Internalname ;
   private String lblTextblockalbrrlong_Internalname ;
   private String lblTextblockalbrrlong_Jsonclick ;
   private String edtAlbRRLong_Internalname ;
   private String edtAlbRRLong_Jsonclick ;
   private String divUnnamedtablealbrrtrans_Internalname ;
   private String lblTextblockalbrrtrans_Internalname ;
   private String lblTextblockalbrrtrans_Jsonclick ;
   private String edtAlbRRTrans_Internalname ;
   private String edtAlbRRTrans_Jsonclick ;
   private String divTableleaflevel_piezas_Internalname ;
   private String Dvpanel_pnlnumerarpiezas_Width ;
   private String Dvpanel_pnlnumerarpiezas_Cls ;
   private String Dvpanel_pnlnumerarpiezas_Title ;
   private String Dvpanel_pnlnumerarpiezas_Iconposition ;
   private String Dvpanel_pnlnumerarpiezas_Internalname ;
   private String tblPnlnumerarpiezas_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String bttBtndonumerarpiezas_Internalname ;
   private String bttBtndonumerarpiezas_Jsonclick ;
   private String Dvpanel_pnldetallepiezas_Width ;
   private String Dvpanel_pnldetallepiezas_Cls ;
   private String Dvpanel_pnldetallepiezas_Title ;
   private String Dvpanel_pnldetallepiezas_Iconposition ;
   private String Dvpanel_pnldetallepiezas_Internalname ;
   private String tblPnldetallepiezas_Internalname ;
   private String sMode299 ;
   private String edtAlbRecPie_Internalname ;
   private String edtAlbRecAnh_Internalname ;
   private String edtALRPIELOC_Internalname ;
   private String edtAlbRecMtr_Internalname ;
   private String edtAlbRecKgm_Internalname ;
   private String edtAlbRecMtrU_Internalname ;
   private String edtAlbRecKgmU_Internalname ;
   private String edtAlbRecObs_Internalname ;
   private String subGridlevel_piezas_Internalname ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String tblUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divUnnamedtablesumkgs_Internalname ;
   private String lblTextblocksumkgs_Internalname ;
   private String lblTextblocksumkgs_Jsonclick ;
   private String edtSumKgs_Internalname ;
   private String edtSumKgs_Jsonclick ;
   private String divUnnamedtablesummts_Internalname ;
   private String lblTextblocksummts_Internalname ;
   private String lblTextblocksummts_Jsonclick ;
   private String edtSumMts_Internalname ;
   private String edtSumMts_Jsonclick ;
   private String divUnnamedtablesumpzs_Internalname ;
   private String lblTextblocksumpzs_Internalname ;
   private String lblTextblocksumpzs_Jsonclick ;
   private String edtSumPzs_Internalname ;
   private String edtSumPzs_Jsonclick ;
   private String Dvpanel_pnlbotones_Width ;
   private String Dvpanel_pnlbotones_Cls ;
   private String Dvpanel_pnlbotones_Title ;
   private String Dvpanel_pnlbotones_Iconposition ;
   private String Dvpanel_pnlbotones_Internalname ;
   private String tblPnlbotones_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String A407EmprNom ;
   private String AV125Pgmname ;
   private String A4795AlRPieCal ;
   private String A4797AlRPieClaC ;
   private String AV62Msg_err ;
   private String A8779Bod_Talla ;
   private String A3731AlbRecIdPz ;
   private String A10180AlRPieTelT ;
   private String A10181AlRPieOri ;
   private String A10182AlRPieDst ;
   private String Dvpanel_unnamedtable6_Objectcall ;
   private String Dvpanel_unnamedtable6_Class ;
   private String Dvpanel_unnamedtable6_Height ;
   private String Dvpanel_unnamedtable7_Objectcall ;
   private String Dvpanel_unnamedtable7_Class ;
   private String Dvpanel_unnamedtable7_Height ;
   private String Dvpanel_unnamedtable8_Objectcall ;
   private String Dvpanel_unnamedtable8_Class ;
   private String Dvpanel_unnamedtable8_Height ;
   private String Dvpanel_unnamedtable9_Objectcall ;
   private String Dvpanel_unnamedtable9_Class ;
   private String Dvpanel_unnamedtable9_Height ;
   private String Dvpanel_unnamedtable10_Objectcall ;
   private String Dvpanel_unnamedtable10_Class ;
   private String Dvpanel_unnamedtable10_Height ;
   private String Dvpanel_unnamedtable11_Objectcall ;
   private String Dvpanel_unnamedtable11_Class ;
   private String Dvpanel_unnamedtable11_Height ;
   private String Dvpanel_unnamedtable12_Objectcall ;
   private String Dvpanel_unnamedtable12_Class ;
   private String Dvpanel_unnamedtable12_Height ;
   private String Dvpanel_unnamedtable13_Objectcall ;
   private String Dvpanel_unnamedtable13_Class ;
   private String Dvpanel_unnamedtable13_Height ;
   private String Dvpanel_unnamedtable14_Objectcall ;
   private String Dvpanel_unnamedtable14_Class ;
   private String Dvpanel_unnamedtable14_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_pnlnumerarpiezas_Objectcall ;
   private String Dvpanel_pnlnumerarpiezas_Class ;
   private String Dvpanel_pnlnumerarpiezas_Height ;
   private String Dvpanel_unnamedtable2_Objectcall ;
   private String Dvpanel_unnamedtable2_Class ;
   private String Dvpanel_unnamedtable2_Height ;
   private String Dvpanel_pnldetallepiezas_Objectcall ;
   private String Dvpanel_pnldetallepiezas_Class ;
   private String Dvpanel_pnldetallepiezas_Height ;
   private String Dvpanel_pnlbotones_Objectcall ;
   private String Dvpanel_pnlbotones_Class ;
   private String Dvpanel_pnlbotones_Height ;
   private String hsh ;
   private String sMode7 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A7408ALRPIELOC ;
   private String A13693AlbRecObs ;
   private String AV29Station ;
   private String AV7EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z841TrnNom ;
   private String Z971ProceNom ;
   private String Z1212TipEntNom ;
   private String sGXsfl_383_fel_idx="0001" ;
   private String subGridlevel_piezas_Class ;
   private String subGridlevel_piezas_Linesclass ;
   private String ROClassString ;
   private String edtAlbRecPie_Jsonclick ;
   private String edtAlbRecAnh_Jsonclick ;
   private String edtALRPIELOC_Jsonclick ;
   private String edtAlbRecMtr_Jsonclick ;
   private String edtAlbRecKgm_Jsonclick ;
   private String edtAlbRecMtrU_Jsonclick ;
   private String edtAlbRecKgmU_Jsonclick ;
   private String edtAlbRecObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_piezas_Header ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Z13693AlbRecObs ;
   private String ZV62Msg_err ;
   private String Z4797AlRPieClaC ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String E396EmprCod ;
   private java.util.Date Z4606AlbRHEn ;
   private java.util.Date A4606AlbRHEn ;
   private java.util.Date Z49AlbRFen ;
   private java.util.Date Z48AlbRFecUlt ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A48AlbRFecUlt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n44AlbRecCod ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n1211TipEntCod ;
   private boolean wbErr ;
   private boolean n10761AlbUltP ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable6_Autowidth ;
   private boolean Dvpanel_unnamedtable6_Autoheight ;
   private boolean Dvpanel_unnamedtable6_Collapsible ;
   private boolean Dvpanel_unnamedtable6_Collapsed ;
   private boolean Dvpanel_unnamedtable6_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable6_Autoscroll ;
   private boolean Dvpanel_unnamedtable7_Autowidth ;
   private boolean Dvpanel_unnamedtable7_Autoheight ;
   private boolean Dvpanel_unnamedtable7_Collapsible ;
   private boolean Dvpanel_unnamedtable7_Collapsed ;
   private boolean Dvpanel_unnamedtable7_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable7_Autoscroll ;
   private boolean Dvpanel_unnamedtable8_Autowidth ;
   private boolean Dvpanel_unnamedtable8_Autoheight ;
   private boolean Dvpanel_unnamedtable8_Collapsible ;
   private boolean Dvpanel_unnamedtable8_Collapsed ;
   private boolean Dvpanel_unnamedtable8_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable8_Autoscroll ;
   private boolean Dvpanel_unnamedtable9_Autowidth ;
   private boolean Dvpanel_unnamedtable9_Autoheight ;
   private boolean Dvpanel_unnamedtable9_Collapsible ;
   private boolean Dvpanel_unnamedtable9_Collapsed ;
   private boolean Dvpanel_unnamedtable9_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable9_Autoscroll ;
   private boolean Dvpanel_unnamedtable10_Autowidth ;
   private boolean Dvpanel_unnamedtable10_Autoheight ;
   private boolean Dvpanel_unnamedtable10_Collapsible ;
   private boolean Dvpanel_unnamedtable10_Collapsed ;
   private boolean Dvpanel_unnamedtable10_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable10_Autoscroll ;
   private boolean Dvpanel_unnamedtable11_Autowidth ;
   private boolean Dvpanel_unnamedtable11_Autoheight ;
   private boolean Dvpanel_unnamedtable11_Collapsible ;
   private boolean Dvpanel_unnamedtable11_Collapsed ;
   private boolean Dvpanel_unnamedtable11_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable11_Autoscroll ;
   private boolean Dvpanel_unnamedtable12_Autowidth ;
   private boolean Dvpanel_unnamedtable12_Autoheight ;
   private boolean Dvpanel_unnamedtable12_Collapsible ;
   private boolean Dvpanel_unnamedtable12_Collapsed ;
   private boolean Dvpanel_unnamedtable12_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable12_Autoscroll ;
   private boolean Dvpanel_unnamedtable13_Autowidth ;
   private boolean Dvpanel_unnamedtable13_Autoheight ;
   private boolean Dvpanel_unnamedtable13_Collapsible ;
   private boolean Dvpanel_unnamedtable13_Collapsed ;
   private boolean Dvpanel_unnamedtable13_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable13_Autoscroll ;
   private boolean Dvpanel_unnamedtable14_Autowidth ;
   private boolean Dvpanel_unnamedtable14_Autoheight ;
   private boolean Dvpanel_unnamedtable14_Collapsible ;
   private boolean Dvpanel_unnamedtable14_Collapsed ;
   private boolean Dvpanel_unnamedtable14_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable14_Autoscroll ;
   private boolean Dvpanel_pnlnumerarpiezas_Autowidth ;
   private boolean Dvpanel_pnlnumerarpiezas_Autoheight ;
   private boolean Dvpanel_pnlnumerarpiezas_Collapsible ;
   private boolean Dvpanel_pnlnumerarpiezas_Collapsed ;
   private boolean Dvpanel_pnlnumerarpiezas_Showcollapseicon ;
   private boolean Dvpanel_pnlnumerarpiezas_Autoscroll ;
   private boolean Dvpanel_pnldetallepiezas_Autowidth ;
   private boolean Dvpanel_pnldetallepiezas_Autoheight ;
   private boolean Dvpanel_pnldetallepiezas_Collapsible ;
   private boolean Dvpanel_pnldetallepiezas_Collapsed ;
   private boolean Dvpanel_pnldetallepiezas_Showcollapseicon ;
   private boolean Dvpanel_pnldetallepiezas_Autoscroll ;
   private boolean bGXsfl_383_Refreshing=false ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Dvpanel_pnlbotones_Autowidth ;
   private boolean Dvpanel_pnlbotones_Autoheight ;
   private boolean Dvpanel_pnlbotones_Collapsible ;
   private boolean Dvpanel_pnlbotones_Collapsed ;
   private boolean Dvpanel_pnlbotones_Showcollapseicon ;
   private boolean Dvpanel_pnlbotones_Autoscroll ;
   private boolean n7501AlbRecSec ;
   private boolean n407EmprNom ;
   private boolean n4806AlRPieDefC ;
   private boolean Dvpanel_unnamedtable6_Enabled ;
   private boolean Dvpanel_unnamedtable6_Showheader ;
   private boolean Dvpanel_unnamedtable6_Visible ;
   private boolean Dvpanel_unnamedtable7_Enabled ;
   private boolean Dvpanel_unnamedtable7_Showheader ;
   private boolean Dvpanel_unnamedtable7_Visible ;
   private boolean Dvpanel_unnamedtable8_Enabled ;
   private boolean Dvpanel_unnamedtable8_Showheader ;
   private boolean Dvpanel_unnamedtable8_Visible ;
   private boolean Dvpanel_unnamedtable9_Enabled ;
   private boolean Dvpanel_unnamedtable9_Showheader ;
   private boolean Dvpanel_unnamedtable9_Visible ;
   private boolean Dvpanel_unnamedtable10_Enabled ;
   private boolean Dvpanel_unnamedtable10_Showheader ;
   private boolean Dvpanel_unnamedtable10_Visible ;
   private boolean Dvpanel_unnamedtable11_Enabled ;
   private boolean Dvpanel_unnamedtable11_Showheader ;
   private boolean Dvpanel_unnamedtable11_Visible ;
   private boolean Dvpanel_unnamedtable12_Enabled ;
   private boolean Dvpanel_unnamedtable12_Showheader ;
   private boolean Dvpanel_unnamedtable12_Visible ;
   private boolean Dvpanel_unnamedtable13_Enabled ;
   private boolean Dvpanel_unnamedtable13_Showheader ;
   private boolean Dvpanel_unnamedtable13_Visible ;
   private boolean Dvpanel_unnamedtable14_Enabled ;
   private boolean Dvpanel_unnamedtable14_Showheader ;
   private boolean Dvpanel_unnamedtable14_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_pnlnumerarpiezas_Enabled ;
   private boolean Dvpanel_pnlnumerarpiezas_Showheader ;
   private boolean Dvpanel_pnlnumerarpiezas_Visible ;
   private boolean Dvpanel_unnamedtable2_Enabled ;
   private boolean Dvpanel_unnamedtable2_Showheader ;
   private boolean Dvpanel_unnamedtable2_Visible ;
   private boolean Dvpanel_pnldetallepiezas_Enabled ;
   private boolean Dvpanel_pnldetallepiezas_Showheader ;
   private boolean Dvpanel_pnldetallepiezas_Visible ;
   private boolean Dvpanel_pnlbotones_Enabled ;
   private boolean Dvpanel_pnlbotones_Showheader ;
   private boolean Dvpanel_pnlbotones_Visible ;
   private boolean n4606AlbRHEn ;
   private boolean n971ProceNom ;
   private boolean n841TrnNom ;
   private boolean n1212TipEntNom ;
   private boolean n13241AlbRPh ;
   private boolean n13242AlbRRLong ;
   private boolean n13243AlbRRTrans ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean nA44AlbRecCod ;
   private boolean nE44AlbRecCod ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_piezasContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_piezasRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_piezasColumn ;
   private com.genexus.webpanels.WebSession AV108WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable6 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable7 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable8 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable9 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable10 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable11 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable12 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable13 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable14 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnlnumerarpiezas ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnldetallepiezas ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnlbotones ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbREst ;
   private HTMLChoice cmbAlbRReo ;
   private IDataStoreProvider pr_default ;
   private short[] T01P17_A2152AlbDetPie ;
   private java.math.BigDecimal[] T01P17_A2149AlbDetMtr ;
   private java.math.BigDecimal[] T01P17_A2146AlbDetKgm ;
   private java.math.BigDecimal[] T01P17_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] T01P17_A2148AlbDetKgmU ;
   private java.math.BigDecimal[] T01P17_A10758SumKgs ;
   private java.math.BigDecimal[] T01P17_A10759SumMts ;
   private short[] T01P17_A10760SumPzs ;
   private String[] T01P110_A407EmprNom ;
   private boolean[] T01P110_n407EmprNom ;
   private String[] T01P114_A1212TipEntNom ;
   private boolean[] T01P114_n1212TipEntNom ;
   private String[] T01P112_A841TrnNom ;
   private boolean[] T01P112_n841TrnNom ;
   private String[] T01P113_A971ProceNom ;
   private boolean[] T01P113_n971ProceNom ;
   private String[] T01P111_A279CliNom ;
   private int[] T01P116_A44AlbRecCod ;
   private boolean[] T01P116_n44AlbRecCod ;
   private java.math.BigDecimal[] T01P116_A58AlbRUniEnt ;
   private java.math.BigDecimal[] T01P116_A60AlbRUniUti ;
   private int[] T01P116_A52AlbRPieEnt ;
   private int[] T01P116_A54AlbRPieUti ;
   private byte[] T01P116_A47AlbREst ;
   private String[] T01P116_A407EmprNom ;
   private boolean[] T01P116_n407EmprNom ;
   private String[] T01P116_A46AlbREnt ;
   private String[] T01P116_A5806AlbREnt2 ;
   private java.util.Date[] T01P116_A49AlbRFen ;
   private java.util.Date[] T01P116_A4606AlbRHEn ;
   private boolean[] T01P116_n4606AlbRHEn ;
   private String[] T01P116_A279CliNom ;
   private String[] T01P116_A45AlbRef ;
   private String[] T01P116_A3613AlbRefDsc ;
   private String[] T01P116_A971ProceNom ;
   private boolean[] T01P116_n971ProceNom ;
   private String[] T01P116_A841TrnNom ;
   private boolean[] T01P116_n841TrnNom ;
   private String[] T01P116_A1212TipEntNom ;
   private boolean[] T01P116_n1212TipEntNom ;
   private String[] T01P116_A1291AlbRDes ;
   private String[] T01P116_A56AlbRUni ;
   private String[] T01P116_A50AlbRLoc ;
   private String[] T01P116_A55AlbRReo ;
   private java.util.Date[] T01P116_A48AlbRFecUlt ;
   private java.math.BigDecimal[] T01P116_A6180AlbrUniC ;
   private int[] T01P116_A6181AlbrPieC ;
   private short[] T01P116_A4920AlbRGrm2 ;
   private short[] T01P116_A4921AlbRAnc ;
   private short[] T01P116_A4922AlbPml ;
   private String[] T01P116_A6463AlbRLote ;
   private java.math.BigDecimal[] T01P116_A13241AlbRPh ;
   private boolean[] T01P116_n13241AlbRPh ;
   private java.math.BigDecimal[] T01P116_A13242AlbRRLong ;
   private boolean[] T01P116_n13242AlbRRLong ;
   private java.math.BigDecimal[] T01P116_A13243AlbRRTrans ;
   private boolean[] T01P116_n13243AlbRRTrans ;
   private String[] T01P116_A8029AlbNumM ;
   private int[] T01P116_A53AlbRPieReb ;
   private java.math.BigDecimal[] T01P116_A59AlbRUniReb ;
   private short[] T01P116_A10761AlbUltP ;
   private boolean[] T01P116_n10761AlbUltP ;
   private short[] T01P116_A7501AlbRecSec ;
   private boolean[] T01P116_n7501AlbRecSec ;
   private short[] T01P116_A1222AlbNumEti ;
   private String[] T01P116_A396EmprCod ;
   private int[] T01P116_A252CliCod ;
   private short[] T01P116_A840TrnCod ;
   private boolean[] T01P116_n840TrnCod ;
   private short[] T01P116_A970ProceCod ;
   private boolean[] T01P116_n970ProceCod ;
   private short[] T01P116_A1211TipEntCod ;
   private boolean[] T01P116_n1211TipEntCod ;
   private short[] T01P116_A2152AlbDetPie ;
   private java.math.BigDecimal[] T01P116_A2149AlbDetMtr ;
   private java.math.BigDecimal[] T01P116_A2146AlbDetKgm ;
   private java.math.BigDecimal[] T01P116_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] T01P116_A2148AlbDetKgmU ;
   private java.math.BigDecimal[] T01P116_A10758SumKgs ;
   private java.math.BigDecimal[] T01P116_A10759SumMts ;
   private short[] T01P116_A10760SumPzs ;
   private String[] T01P117_A279CliNom ;
   private String[] T01P118_A841TrnNom ;
   private boolean[] T01P118_n841TrnNom ;
   private String[] T01P119_A971ProceNom ;
   private boolean[] T01P119_n971ProceNom ;
   private String[] T01P120_A1212TipEntNom ;
   private boolean[] T01P120_n1212TipEntNom ;
   private short[] T01P122_A2152AlbDetPie ;
   private java.math.BigDecimal[] T01P122_A2149AlbDetMtr ;
   private java.math.BigDecimal[] T01P122_A2146AlbDetKgm ;
   private java.math.BigDecimal[] T01P122_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] T01P122_A2148AlbDetKgmU ;
   private java.math.BigDecimal[] T01P122_A10758SumKgs ;
   private java.math.BigDecimal[] T01P122_A10759SumMts ;
   private short[] T01P122_A10760SumPzs ;
   private String[] T01P123_A396EmprCod ;
   private int[] T01P123_A44AlbRecCod ;
   private boolean[] T01P123_n44AlbRecCod ;
   private int[] T01P19_A44AlbRecCod ;
   private boolean[] T01P19_n44AlbRecCod ;
   private java.math.BigDecimal[] T01P19_A58AlbRUniEnt ;
   private java.math.BigDecimal[] T01P19_A60AlbRUniUti ;
   private int[] T01P19_A52AlbRPieEnt ;
   private int[] T01P19_A54AlbRPieUti ;
   private byte[] T01P19_A47AlbREst ;
   private String[] T01P19_A46AlbREnt ;
   private String[] T01P19_A5806AlbREnt2 ;
   private java.util.Date[] T01P19_A49AlbRFen ;
   private java.util.Date[] T01P19_A4606AlbRHEn ;
   private boolean[] T01P19_n4606AlbRHEn ;
   private String[] T01P19_A45AlbRef ;
   private String[] T01P19_A3613AlbRefDsc ;
   private String[] T01P19_A1291AlbRDes ;
   private String[] T01P19_A56AlbRUni ;
   private String[] T01P19_A50AlbRLoc ;
   private String[] T01P19_A55AlbRReo ;
   private java.util.Date[] T01P19_A48AlbRFecUlt ;
   private java.math.BigDecimal[] T01P19_A6180AlbrUniC ;
   private int[] T01P19_A6181AlbrPieC ;
   private short[] T01P19_A4920AlbRGrm2 ;
   private short[] T01P19_A4921AlbRAnc ;
   private short[] T01P19_A4922AlbPml ;
   private String[] T01P19_A6463AlbRLote ;
   private java.math.BigDecimal[] T01P19_A13241AlbRPh ;
   private boolean[] T01P19_n13241AlbRPh ;
   private java.math.BigDecimal[] T01P19_A13242AlbRRLong ;
   private boolean[] T01P19_n13242AlbRRLong ;
   private java.math.BigDecimal[] T01P19_A13243AlbRRTrans ;
   private boolean[] T01P19_n13243AlbRRTrans ;
   private String[] T01P19_A8029AlbNumM ;
   private int[] T01P19_A53AlbRPieReb ;
   private java.math.BigDecimal[] T01P19_A59AlbRUniReb ;
   private short[] T01P19_A10761AlbUltP ;
   private boolean[] T01P19_n10761AlbUltP ;
   private short[] T01P19_A7501AlbRecSec ;
   private boolean[] T01P19_n7501AlbRecSec ;
   private short[] T01P19_A1222AlbNumEti ;
   private String[] T01P19_A396EmprCod ;
   private int[] T01P19_A252CliCod ;
   private short[] T01P19_A840TrnCod ;
   private boolean[] T01P19_n840TrnCod ;
   private short[] T01P19_A970ProceCod ;
   private boolean[] T01P19_n970ProceCod ;
   private short[] T01P19_A1211TipEntCod ;
   private boolean[] T01P19_n1211TipEntCod ;
   private String[] T01P124_A396EmprCod ;
   private int[] T01P124_A44AlbRecCod ;
   private boolean[] T01P124_n44AlbRecCod ;
   private String[] T01P125_A396EmprCod ;
   private int[] T01P125_A44AlbRecCod ;
   private boolean[] T01P125_n44AlbRecCod ;
   private int[] T01P18_A44AlbRecCod ;
   private boolean[] T01P18_n44AlbRecCod ;
   private java.math.BigDecimal[] T01P18_A58AlbRUniEnt ;
   private java.math.BigDecimal[] T01P18_A60AlbRUniUti ;
   private int[] T01P18_A52AlbRPieEnt ;
   private int[] T01P18_A54AlbRPieUti ;
   private byte[] T01P18_A47AlbREst ;
   private String[] T01P18_A46AlbREnt ;
   private String[] T01P18_A5806AlbREnt2 ;
   private java.util.Date[] T01P18_A49AlbRFen ;
   private java.util.Date[] T01P18_A4606AlbRHEn ;
   private boolean[] T01P18_n4606AlbRHEn ;
   private String[] T01P18_A45AlbRef ;
   private String[] T01P18_A3613AlbRefDsc ;
   private String[] T01P18_A1291AlbRDes ;
   private String[] T01P18_A56AlbRUni ;
   private String[] T01P18_A50AlbRLoc ;
   private String[] T01P18_A55AlbRReo ;
   private java.util.Date[] T01P18_A48AlbRFecUlt ;
   private java.math.BigDecimal[] T01P18_A6180AlbrUniC ;
   private int[] T01P18_A6181AlbrPieC ;
   private short[] T01P18_A4920AlbRGrm2 ;
   private short[] T01P18_A4921AlbRAnc ;
   private short[] T01P18_A4922AlbPml ;
   private String[] T01P18_A6463AlbRLote ;
   private java.math.BigDecimal[] T01P18_A13241AlbRPh ;
   private boolean[] T01P18_n13241AlbRPh ;
   private java.math.BigDecimal[] T01P18_A13242AlbRRLong ;
   private boolean[] T01P18_n13242AlbRRLong ;
   private java.math.BigDecimal[] T01P18_A13243AlbRRTrans ;
   private boolean[] T01P18_n13243AlbRRTrans ;
   private String[] T01P18_A8029AlbNumM ;
   private int[] T01P18_A53AlbRPieReb ;
   private java.math.BigDecimal[] T01P18_A59AlbRUniReb ;
   private short[] T01P18_A10761AlbUltP ;
   private boolean[] T01P18_n10761AlbUltP ;
   private short[] T01P18_A7501AlbRecSec ;
   private boolean[] T01P18_n7501AlbRecSec ;
   private short[] T01P18_A1222AlbNumEti ;
   private String[] T01P18_A396EmprCod ;
   private int[] T01P18_A252CliCod ;
   private short[] T01P18_A840TrnCod ;
   private boolean[] T01P18_n840TrnCod ;
   private short[] T01P18_A970ProceCod ;
   private boolean[] T01P18_n970ProceCod ;
   private short[] T01P18_A1211TipEntCod ;
   private boolean[] T01P18_n1211TipEntCod ;
   private String[] T01P129_A279CliNom ;
   private String[] T01P130_A841TrnNom ;
   private boolean[] T01P130_n841TrnNom ;
   private String[] T01P131_A971ProceNom ;
   private boolean[] T01P131_n971ProceNom ;
   private String[] T01P132_A1212TipEntNom ;
   private boolean[] T01P132_n1212TipEntNom ;
   private short[] T01P134_A2152AlbDetPie ;
   private java.math.BigDecimal[] T01P134_A2149AlbDetMtr ;
   private java.math.BigDecimal[] T01P134_A2146AlbDetKgm ;
   private java.math.BigDecimal[] T01P134_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] T01P134_A2148AlbDetKgmU ;
   private java.math.BigDecimal[] T01P134_A10758SumKgs ;
   private java.math.BigDecimal[] T01P134_A10759SumMts ;
   private short[] T01P134_A10760SumPzs ;
   private String[] T01P135_A396EmprCod ;
   private int[] T01P135_A13026PedDGId ;
   private int[] T01P135_A44AlbRecCod ;
   private boolean[] T01P135_n44AlbRecCod ;
   private String[] T01P136_A396EmprCod ;
   private int[] T01P136_A11669DevCruId ;
   private int[] T01P136_A44AlbRecCod ;
   private boolean[] T01P136_n44AlbRecCod ;
   private String[] T01P137_A396EmprCod ;
   private int[] T01P137_A44AlbRecCod ;
   private boolean[] T01P137_n44AlbRecCod ;
   private String[] T01P137_A9743Emp_CUb ;
   private short[] T01P137_A5860Emp_Anp ;
   private String[] T01P138_A396EmprCod ;
   private int[] T01P138_A44AlbRecCod ;
   private boolean[] T01P138_n44AlbRecCod ;
   private String[] T01P138_A7130MatC_Pz ;
   private String[] T01P139_A396EmprCod ;
   private int[] T01P139_A44AlbRecCod ;
   private boolean[] T01P139_n44AlbRecCod ;
   private String[] T01P139_A7132MatC_Talla ;
   private String[] T01P140_A396EmprCod ;
   private int[] T01P140_A44AlbRecCod ;
   private boolean[] T01P140_n44AlbRecCod ;
   private short[] T01P140_A7115MatC_Lin ;
   private String[] T01P141_A396EmprCod ;
   private long[] T01P141_A30AlbProCod ;
   private int[] T01P141_A129BarCod ;
   private byte[] T01P141_A132BarCodReo ;
   private String[] T01P141_A130BarCodPar ;
   private short[] T01P141_A6622AlbHdRLn ;
   private String[] T01P142_A396EmprCod ;
   private int[] T01P142_A6235DevEmpCod ;
   private byte[] T01P142_A6243DevNumLin ;
   private String[] T01P143_A396EmprCod ;
   private int[] T01P143_A44AlbRecCod ;
   private boolean[] T01P143_n44AlbRecCod ;
   private short[] T01P143_A4596AlbRDefCod ;
   private String[] T01P144_A396EmprCod ;
   private int[] T01P144_A44AlbRecCod ;
   private boolean[] T01P144_n44AlbRecCod ;
   private String[] T01P144_A2159AlbRecPie ;
   private short[] T01P144_A4395AlRDefCod ;
   private String[] T01P144_A4412AlRFasCod ;
   private String[] T01P145_A396EmprCod ;
   private int[] T01P145_A44AlbRecCod ;
   private boolean[] T01P145_n44AlbRecCod ;
   private short[] T01P145_A2165HisEmpLin ;
   private String[] T01P146_A396EmprCod ;
   private int[] T01P146_A44AlbRecCod ;
   private boolean[] T01P146_n44AlbRecCod ;
   private byte[] T01P146_A1299AlbRLin ;
   private String[] T01P147_A396EmprCod ;
   private int[] T01P147_A361DisCod ;
   private int[] T01P147_A44AlbRecCod ;
   private boolean[] T01P147_n44AlbRecCod ;
   private String[] T01P148_A396EmprCod ;
   private int[] T01P148_A323DevGenCod ;
   private String[] T01P149_A396EmprCod ;
   private int[] T01P149_A129BarCod ;
   private byte[] T01P149_A132BarCodReo ;
   private String[] T01P149_A130BarCodPar ;
   private String[] T01P149_A200BarPieCod ;
   private String[] T01P151_A396EmprCod ;
   private int[] T01P151_A44AlbRecCod ;
   private boolean[] T01P151_n44AlbRecCod ;
   private String[] T01P152_A4795AlRPieCal ;
   private int[] T01P152_A44AlbRecCod ;
   private boolean[] T01P152_n44AlbRecCod ;
   private String[] T01P152_A2159AlbRecPie ;
   private short[] T01P152_A2154AlbRecAnh ;
   private short[] T01P152_A10762AlbPCont ;
   private java.math.BigDecimal[] T01P152_A2157AlbRecMtr ;
   private java.math.BigDecimal[] T01P152_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T01P152_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T01P152_A2156AlbRecKgmU ;
   private String[] T01P152_A8779Bod_Talla ;
   private short[] T01P152_A8780Bod_Und ;
   private short[] T01P152_A3730AlbRecCol ;
   private String[] T01P152_A3731AlbRecIdPz ;
   private int[] T01P152_A3732AlbRecIdRc ;
   private java.math.BigDecimal[] T01P152_A4410AlbRecPal ;
   private String[] T01P152_A10180AlRPieTelT ;
   private int[] T01P152_A10149AlRPieCon ;
   private String[] T01P152_A10181AlRPieOri ;
   private String[] T01P152_A10182AlRPieDst ;
   private java.math.BigDecimal[] T01P152_A10183AlrPieKgmT ;
   private String[] T01P152_A7408ALRPIELOC ;
   private String[] T01P152_A396EmprCod ;
   private int[] T01P15_A4806AlRPieDefC ;
   private boolean[] T01P15_n4806AlRPieDefC ;
   private int[] T01P154_A4806AlRPieDefC ;
   private boolean[] T01P154_n4806AlRPieDefC ;
   private String[] T01P155_A396EmprCod ;
   private int[] T01P155_A44AlbRecCod ;
   private boolean[] T01P155_n44AlbRecCod ;
   private String[] T01P155_A2159AlbRecPie ;
   private String[] T01P13_A4795AlRPieCal ;
   private int[] T01P13_A44AlbRecCod ;
   private boolean[] T01P13_n44AlbRecCod ;
   private String[] T01P13_A2159AlbRecPie ;
   private short[] T01P13_A2154AlbRecAnh ;
   private short[] T01P13_A10762AlbPCont ;
   private java.math.BigDecimal[] T01P13_A2157AlbRecMtr ;
   private java.math.BigDecimal[] T01P13_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T01P13_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T01P13_A2156AlbRecKgmU ;
   private String[] T01P13_A8779Bod_Talla ;
   private short[] T01P13_A8780Bod_Und ;
   private short[] T01P13_A3730AlbRecCol ;
   private String[] T01P13_A3731AlbRecIdPz ;
   private int[] T01P13_A3732AlbRecIdRc ;
   private java.math.BigDecimal[] T01P13_A4410AlbRecPal ;
   private String[] T01P13_A10180AlRPieTelT ;
   private int[] T01P13_A10149AlRPieCon ;
   private String[] T01P13_A10181AlRPieOri ;
   private String[] T01P13_A10182AlRPieDst ;
   private java.math.BigDecimal[] T01P13_A10183AlrPieKgmT ;
   private String[] T01P13_A7408ALRPIELOC ;
   private String[] T01P13_A396EmprCod ;
   private String[] T01P12_A4795AlRPieCal ;
   private int[] T01P12_A44AlbRecCod ;
   private boolean[] T01P12_n44AlbRecCod ;
   private String[] T01P12_A2159AlbRecPie ;
   private short[] T01P12_A2154AlbRecAnh ;
   private short[] T01P12_A10762AlbPCont ;
   private java.math.BigDecimal[] T01P12_A2157AlbRecMtr ;
   private java.math.BigDecimal[] T01P12_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T01P12_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T01P12_A2156AlbRecKgmU ;
   private String[] T01P12_A8779Bod_Talla ;
   private short[] T01P12_A8780Bod_Und ;
   private short[] T01P12_A3730AlbRecCol ;
   private String[] T01P12_A3731AlbRecIdPz ;
   private int[] T01P12_A3732AlbRecIdRc ;
   private java.math.BigDecimal[] T01P12_A4410AlbRecPal ;
   private String[] T01P12_A10180AlRPieTelT ;
   private int[] T01P12_A10149AlRPieCon ;
   private String[] T01P12_A10181AlRPieOri ;
   private String[] T01P12_A10182AlRPieDst ;
   private java.math.BigDecimal[] T01P12_A10183AlrPieKgmT ;
   private String[] T01P12_A7408ALRPIELOC ;
   private String[] T01P12_A396EmprCod ;
   private int[] T01P160_A4806AlRPieDefC ;
   private boolean[] T01P160_n4806AlRPieDefC ;
   private String[] T01P161_A396EmprCod ;
   private int[] T01P161_A44AlbRecCod ;
   private boolean[] T01P161_n44AlbRecCod ;
   private String[] T01P161_A2159AlbRecPie ;
   private int[] T01P161_A10188AlRFibOrd ;
   private String[] T01P162_A396EmprCod ;
   private int[] T01P162_A44AlbRecCod ;
   private boolean[] T01P162_n44AlbRecCod ;
   private String[] T01P162_A2159AlbRecPie ;
   private String[] T01P162_A9568CodHilz ;
   private String[] T01P163_A396EmprCod ;
   private int[] T01P163_A44AlbRecCod ;
   private boolean[] T01P163_n44AlbRecCod ;
   private String[] T01P163_A2159AlbRecPie ;
   private byte[] T01P163_A7697AlREtiTpo ;
   private String[] T01P164_A396EmprCod ;
   private int[] T01P164_A44AlbRecCod ;
   private boolean[] T01P164_n44AlbRecCod ;
   private String[] T01P164_A2159AlbRecPie ;
   private short[] T01P164_A5262AlbRecEvt ;
   private String[] T01P165_A396EmprCod ;
   private int[] T01P165_A44AlbRecCod ;
   private boolean[] T01P165_n44AlbRecCod ;
   private String[] T01P165_A2159AlbRecPie ;
   private short[] T01P165_A4395AlRDefCod ;
   private String[] T01P165_A4412AlRFasCod ;
   private String[] T01P166_A396EmprCod ;
   private int[] T01P166_A44AlbRecCod ;
   private boolean[] T01P166_n44AlbRecCod ;
   private String[] T01P166_A2159AlbRecPie ;
   private int[] T01P167_Gx_cnt ;
   private int[] T01P168_Gx_cnt ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV106WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV107TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV113TrnContextAtt ;
}

final  class talbdet2__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbdet2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbdet2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbdet2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbdet2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01P12", "SELECT AlRPieCal, AlbRecCod, AlbRecPie, AlbRecAnh, AlbPCont, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, Bod_Talla, Bod_Und, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbRecPal, AlRPieTelT, AlRPieCon, AlRPieOri, AlRPieDst, AlrPieKgmT, ALRPIELOC, EmprCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?  FOR UPDATE OF AlRPieCal, AlbRecAnh, AlbPCont, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, Bod_Talla, Bod_Und, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbRecPal, AlRPieTelT, AlRPieCon, AlRPieOri, AlRPieDst, AlrPieKgmT, ALRPIELOC, AlRPieDefC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P13", "SELECT AlRPieCal, AlbRecCod, AlbRecPie, AlbRecAnh, AlbPCont, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, Bod_Talla, Bod_Und, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbRecPal, AlRPieTelT, AlRPieCon, AlRPieOri, AlRPieDst, AlrPieKgmT, ALRPIELOC, EmprCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P15", "SELECT COALESCE( T1.AlRPieDefC, 0) AS AlRPieDefC FROM (SELECT SUM(AlRDefCru) AS AlRPieDefC, EmprCod, AlbRecCod, AlbRecPie FROM TXPAlRPie GROUP BY EmprCod, AlbRecCod, AlbRecPie ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? AND T1.AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P17", "SELECT COALESCE( T1.GXC1, 0) AS AlbDetPie, COALESCE( T1.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T1.AlbDetKgm, 0) AS AlbDetKgm, COALESCE( T1.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T1.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T1.AlbDetKgm, 0) AS SumKgs, COALESCE( T1.AlbDetMtr, 0) AS SumMts, COALESCE( T1.SumPzs, 0) AS SumPzs FROM (SELECT COUNT(*) AS GXC1, EmprCod, AlbRecCod, SUM(AlbRecMtrU) AS AlbDetMtrU, SUM(AlbRecKgmU) AS AlbDetKgmU, SUM(AlbRecKgm) AS AlbDetKgm, SUM(AlbRecMtr) AS AlbDetMtr, COUNT(*) AS SumPzs FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P18", "SELECT AlbRecCod, AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbREst, AlbREnt, AlbREnt2, AlbRFen, AlbRHEn, AlbRef, AlbRefDsc, AlbRDes, AlbRUni, AlbRLoc, AlbRReo, AlbRFecUlt, AlbrUniC, AlbrPieC, AlbRGrm2, AlbRAnc, AlbPml, AlbRLote, AlbRPh, AlbRRLong, AlbRRTrans, AlbNumM, AlbRPieReb, AlbRUniReb, AlbUltP, AlbRecSec, AlbNumEti, EmprCod, CliCod, TrnCod, ProceCod, TipEntCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbREst, AlbREnt, AlbREnt2, AlbRFen, AlbRHEn, AlbRef, AlbRefDsc, AlbRDes, AlbRUni, AlbRLoc, AlbRReo, AlbRFecUlt, AlbrUniC, AlbrPieC, AlbRGrm2, AlbRAnc, AlbPml, AlbRLote, AlbRPh, AlbRRLong, AlbRRTrans, AlbNumM, AlbRPieReb, AlbRUniReb, AlbUltP, AlbRecSec, AlbNumEti, CliCod, TrnCod, ProceCod, TipEntCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P19", "SELECT AlbRecCod, AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbREst, AlbREnt, AlbREnt2, AlbRFen, AlbRHEn, AlbRef, AlbRefDsc, AlbRDes, AlbRUni, AlbRLoc, AlbRReo, AlbRFecUlt, AlbrUniC, AlbrPieC, AlbRGrm2, AlbRAnc, AlbPml, AlbRLote, AlbRPh, AlbRRLong, AlbRRTrans, AlbNumM, AlbRPieReb, AlbRUniReb, AlbUltP, AlbRecSec, AlbNumEti, EmprCod, CliCod, TrnCod, ProceCod, TipEntCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P110", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P111", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P112", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P113", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P114", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P116", "SELECT /*+ FIRST_ROWS(100) */ TM1.AlbRecCod, TM1.AlbRUniEnt, TM1.AlbRUniUti, TM1.AlbRPieEnt, TM1.AlbRPieUti, TM1.AlbREst, T2.EmprNom, TM1.AlbREnt, TM1.AlbREnt2, TM1.AlbRFen, TM1.AlbRHEn, T3.CliNom, TM1.AlbRef, TM1.AlbRefDsc, T5.ProceNom, T4.TrnNom, T6.TipEntNom, TM1.AlbRDes, TM1.AlbRUni, TM1.AlbRLoc, TM1.AlbRReo, TM1.AlbRFecUlt, TM1.AlbrUniC, TM1.AlbrPieC, TM1.AlbRGrm2, TM1.AlbRAnc, TM1.AlbPml, TM1.AlbRLote, TM1.AlbRPh, TM1.AlbRRLong, TM1.AlbRRTrans, TM1.AlbNumM, TM1.AlbRPieReb, TM1.AlbRUniReb, TM1.AlbUltP, TM1.AlbRecSec, TM1.AlbNumEti, TM1.EmprCod, TM1.CliCod, TM1.TrnCod, TM1.ProceCod, TM1.TipEntCod, COALESCE( T7.GXC1, 0) AS AlbDetPie, COALESCE( T7.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T7.AlbDetKgm, 0) AS AlbDetKgm, COALESCE( T7.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T7.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T7.AlbDetKgm, 0) AS SumKgs, COALESCE( T7.AlbDetMtr, 0) AS SumMts, COALESCE( T7.SumPzs, 0) AS SumPzs FROM ((((((TXPALBREC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = TM1.EmprCod AND T4.TrnCod = TM1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = TM1.EmprCod AND T5.ProceCod = TM1.ProceCod) LEFT JOIN TXPENTRAD T6 ON T6.EmprCod = TM1.EmprCod AND T6.TipEntCod = TM1.TipEntCod) LEFT JOIN (SELECT COUNT(*) AS GXC1, EmprCod, AlbRecCod, SUM(AlbRecMtrU) AS AlbDetMtrU, SUM(AlbRecKgmU) AS AlbDetKgmU, SUM(AlbRecKgm) AS AlbDetKgm, SUM(AlbRecMtr) AS AlbDetMtr, COUNT(*) AS SumPzs FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T7 ON T7.EmprCod = TM1.EmprCod AND T7.AlbRecCod = TM1.AlbRecCod) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? ORDER BY TM1.EmprCod, TM1.AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P117", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P118", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P119", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P120", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P122", "SELECT COALESCE( T1.GXC1, 0) AS AlbDetPie, COALESCE( T1.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T1.AlbDetKgm, 0) AS AlbDetKgm, COALESCE( T1.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T1.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T1.AlbDetKgm, 0) AS SumKgs, COALESCE( T1.AlbDetMtr, 0) AS SumMts, COALESCE( T1.SumPzs, 0) AS SumPzs FROM (SELECT COUNT(*) AS GXC1, EmprCod, AlbRecCod, SUM(AlbRecMtrU) AS AlbDetMtrU, SUM(AlbRecKgmU) AS AlbDetKgmU, SUM(AlbRecKgm) AS AlbDetKgm, SUM(AlbRecMtr) AS AlbDetMtr, COUNT(*) AS SumPzs FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P123", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P124", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE ( AlbRecCod > ?) and EmprCod = ? ORDER BY EmprCod, AlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P125", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE ( AlbRecCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, AlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01P126", "INSERT INTO TXPALBREC(AlbRecCod, AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbREst, AlbREnt, AlbREnt2, AlbRFen, AlbRHEn, AlbRef, AlbRefDsc, AlbRDes, AlbRUni, AlbRLoc, AlbRReo, AlbRFecUlt, AlbrUniC, AlbrPieC, AlbRGrm2, AlbRAnc, AlbPml, AlbRLote, AlbRPh, AlbRRLong, AlbRRTrans, AlbNumM, AlbRPieReb, AlbRUniReb, AlbUltP, AlbRecSec, AlbNumEti, EmprCod, CliCod, TrnCod, ProceCod, TipEntCod, AlbRUlin, HisEmpULin, AlbRDisCli, AlbRImp, AlbPmPPza, AlbRTam, AlbRMdlCod, AlbRUniLot, AlbRPieLot, ClasCod, AlbRPre, AlbRAju, AlbRRep, AlbrUsu, AlbrHor, AlbrNF, AlbrFeNf, AlbrCfop, AlbRTartC, AlbRTelar, AlbRLu, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlmCod, MatC_ULin, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, Bod_UltPz, Emp_Item1, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, Cod_mta, AlbOEKOTEX, AlbRLot2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ')", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T01P127", "UPDATE TXPALBREC SET AlbRUniEnt=?, AlbRUniUti=?, AlbRPieEnt=?, AlbRPieUti=?, AlbREst=?, AlbREnt=?, AlbREnt2=?, AlbRFen=?, AlbRHEn=?, AlbRef=?, AlbRefDsc=?, AlbRDes=?, AlbRUni=?, AlbRLoc=?, AlbRReo=?, AlbRFecUlt=?, AlbrUniC=?, AlbrPieC=?, AlbRGrm2=?, AlbRAnc=?, AlbPml=?, AlbRLote=?, AlbRPh=?, AlbRRLong=?, AlbRRTrans=?, AlbNumM=?, AlbRPieReb=?, AlbRUniReb=?, AlbUltP=?, AlbRecSec=?, AlbNumEti=?, CliCod=?, TrnCod=?, ProceCod=?, TipEntCod=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T01P128", "DELETE FROM TXPALBREC  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T01P129", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P130", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P131", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P132", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P134", "SELECT COALESCE( T1.GXC1, 0) AS AlbDetPie, COALESCE( T1.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T1.AlbDetKgm, 0) AS AlbDetKgm, COALESCE( T1.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T1.AlbDetKgmU, 0) AS AlbDetKgmU, COALESCE( T1.AlbDetKgm, 0) AS SumKgs, COALESCE( T1.AlbDetMtr, 0) AS SumMts, COALESCE( T1.SumPzs, 0) AS SumPzs FROM (SELECT COUNT(*) AS GXC1, EmprCod, AlbRecCod, SUM(AlbRecMtrU) AS AlbDetMtrU, SUM(AlbRecKgmU) AS AlbDetKgmU, SUM(AlbRecKgm) AS AlbDetKgm, SUM(AlbRecMtr) AS AlbDetMtr, COUNT(*) AS SumPzs FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P135", "SELECT * FROM (SELECT EmprCod, PedDGId, AlbRecCod FROM TXPPEDDG3 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P136", "SELECT * FROM (SELECT EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P137", "SELECT * FROM (SELECT EmprCod, AlbRecCod, Emp_CUb, Emp_Anp FROM TXPUBIIN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P138", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Pz FROM TXPREPPZS WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P139", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Talla FROM TXPREPTAL WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P140", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Lin FROM TXPREPMAT WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P141", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P142", "SELECT * FROM (SELECT EmprCod, DevEmpCod, DevNumLin FROM TXPDEVEM1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P143", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRDefCod FROM TXPALBRDF WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P144", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod FROM TXPAlRPie WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P145", "SELECT * FROM (SELECT EmprCod, AlbRecCod, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P146", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRLin FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P147", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P148", "SELECT * FROM (SELECT EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P149", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01P150", "UPDATE TXPALBREC SET AlbUltP=?, AlbRUniEnt=?, AlbRUniUti=?, AlbRPieEnt=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T01P151", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P152", "SELECT AlRPieCal, AlbRecCod, AlbRecPie, AlbRecAnh, AlbPCont, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, Bod_Talla, Bod_Und, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbRecPal, AlRPieTelT, AlRPieCon, AlRPieOri, AlRPieDst, AlrPieKgmT, ALRPIELOC, EmprCod FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P154", "SELECT COALESCE( T1.AlRPieDefC, 0) AS AlRPieDefC FROM (SELECT SUM(AlRDefCru) AS AlRPieDefC, EmprCod, AlbRecCod, AlbRecPie FROM TXPAlRPie GROUP BY EmprCod, AlbRecCod, AlbRecPie ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? AND T1.AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P155", "SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01P156", "INSERT INTO TXPALBDET(AlRPieCal, AlbRecCod, AlbRecPie, AlbRecAnh, AlbPCont, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, Bod_Talla, Bod_Und, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbRecPal, AlRPieTelT, AlRPieCon, AlRPieOri, AlRPieDst, AlrPieKgmT, ALRPIELOC, EmprCod, AlRPieDefC, AlRPieClaM, AlRPieUltC, AlRPieDefT, AlRExp1, AlRExp2, AlbRecFec, AlbRecPar, AlbRecCue, ALRPIETEL, ALRPIEOPE, ALRPIEST, AlbRecPnt, AlbRecCo1, AlbRecCo2, AlbHdr, AlbHdrr, AlbHdrp, AlbSerT, AlbColNm, AlbColNn, AlbKgsPf, AlbMtsPf, AlbAfin, AlbNPed, AlbObsp, Bod_Dib, Bod_Tua, Bod_Tub, Bod_Tuc, Bod_Hilz, Bod_FecE, Bod_PedOr, Bod_Rack, Bod_PoS, Bod_Ok, Bod_Medt, Bod_ColNNn, Bod_Por, Bod_codb, Bod_Pes, Bod_DibO, Bod_item3, Bod_ToE, Bod_DescP, Bod_CVar, Bod_NVar) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPALBDET")
         ,new UpdateCursor("T01P157", "UPDATE TXPALBDET SET AlRPieCal=?, AlbRecAnh=?, AlbPCont=?, AlbRecMtr=?, AlbRecKgm=?, AlbRecMtrU=?, AlbRecKgmU=?, Bod_Talla=?, Bod_Und=?, AlbRecCol=?, AlbRecIdPz=?, AlbRecIdRc=?, AlbRecPal=?, AlRPieTelT=?, AlRPieCon=?, AlRPieOri=?, AlRPieDst=?, AlrPieKgmT=?, ALRPIELOC=?, AlRPieDefC=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPALBDET")
         ,new UpdateCursor("T01P158", "DELETE FROM TXPALBDET  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPALBDET")
         ,new ForEachCursor("T01P160", "SELECT COALESCE( T1.AlRPieDefC, 0) AS AlRPieDefC FROM (SELECT SUM(AlRDefCru) AS AlRPieDefC, EmprCod, AlbRecCod, AlbRecPie FROM TXPAlRPie GROUP BY EmprCod, AlbRecCod, AlbRecPie ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? AND T1.AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P161", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlRFibOrd FROM TXPAlrPiF WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P162", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, CodHilz FROM TXPHILZPZ WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P163", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlREtiTpo FROM TXPAlRPi1 WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P164", "SELECT * FROM (SELECT EmprCod, albreccod, AlbRecPie, AlbRecEvt FROM TXPALRHIS WHERE EmprCod = ? AND albreccod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P165", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod FROM TXPAlRPie WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P166", "SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P167", "SELECT COUNT(*) FROM TXPALBDET WHERE ( EmprCod = ? and AlbRecCod = ?) and ( AlbRecKgm = AlbRecKgmU) ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P168", "SELECT COUNT(*) FROM TXPALBDET WHERE ( EmprCod = ? and AlbRecCod = ?) and ( AlbRecMtr = AlbRecMtrU) ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 4);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 15);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 10);
               ((String[]) buf[18])[0] = rslt.getString(19, 10);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[20])[0] = rslt.getString(21, 10);
               ((String[]) buf[21])[0] = rslt.getString(22, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 4);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 15);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 10);
               ((String[]) buf[18])[0] = rslt.getString(19, 10);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[20])[0] = rslt.getString(21, 10);
               ((String[]) buf[21])[0] = rslt.getString(22, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 10);
               ((String[]) buf[16])[0] = rslt.getString(16, 2);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((short[]) buf[22])[0] = rslt.getShort(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 20);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(27, 10);
               ((int[]) buf[31])[0] = rslt.getInt(28);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(29,2);
               ((short[]) buf[33])[0] = rslt.getShort(30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(31);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(32);
               ((String[]) buf[38])[0] = rslt.getString(33, 3);
               ((int[]) buf[39])[0] = rslt.getInt(34);
               ((short[]) buf[40])[0] = rslt.getShort(35);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((short[]) buf[42])[0] = rslt.getShort(36);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(37);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 10);
               ((String[]) buf[16])[0] = rslt.getString(16, 2);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((short[]) buf[22])[0] = rslt.getShort(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 20);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(27, 10);
               ((int[]) buf[31])[0] = rslt.getInt(28);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(29,2);
               ((short[]) buf[33])[0] = rslt.getShort(30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(31);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(32);
               ((String[]) buf[38])[0] = rslt.getString(33, 3);
               ((int[]) buf[39])[0] = rslt.getInt(34);
               ((short[]) buf[40])[0] = rslt.getShort(35);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((short[]) buf[42])[0] = rslt.getShort(36);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(37);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 30);
               ((String[]) buf[14])[0] = rslt.getString(13, 16);
               ((String[]) buf[15])[0] = rslt.getString(14, 26);
               ((String[]) buf[16])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(17, 25);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(18, 20);
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
               ((String[]) buf[24])[0] = rslt.getString(20, 10);
               ((String[]) buf[25])[0] = rslt.getString(21, 2);
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(22);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,2);
               ((int[]) buf[28])[0] = rslt.getInt(24);
               ((short[]) buf[29])[0] = rslt.getShort(25);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((short[]) buf[31])[0] = rslt.getShort(27);
               ((String[]) buf[32])[0] = rslt.getString(28, 20);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(32, 10);
               ((int[]) buf[40])[0] = rslt.getInt(33);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(34,2);
               ((short[]) buf[42])[0] = rslt.getShort(35);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(36);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((short[]) buf[46])[0] = rslt.getShort(37);
               ((String[]) buf[47])[0] = rslt.getString(38, 3);
               ((int[]) buf[48])[0] = rslt.getInt(39);
               ((short[]) buf[49])[0] = rslt.getShort(40);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((short[]) buf[51])[0] = rslt.getShort(41);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(42);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(43);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(44,2);
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(45,2);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(46,2);
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(47,2);
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(48,2);
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(49,2);
               ((short[]) buf[62])[0] = rslt.getShort(50);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 4);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 15);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 10);
               ((String[]) buf[18])[0] = rslt.getString(19, 10);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[20])[0] = rslt.getString(21, 10);
               ((String[]) buf[21])[0] = rslt.getString(22, 3);
               return;
            case 46 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 51 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 58 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 59 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
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
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 3 :
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
            case 4 :
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
            case 5 :
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
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
               return;
            case 13 :
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 8);
               stmt.setString(8, (String)parms[8], 20);
               stmt.setDate(9, (java.util.Date)parms[9]);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[11], false);
               }
               stmt.setString(11, (String)parms[12], 16);
               stmt.setString(12, (String)parms[13], 26);
               stmt.setString(13, (String)parms[14], 20);
               stmt.setString(14, (String)parms[15], 1);
               stmt.setString(15, (String)parms[16], 10);
               stmt.setString(16, (String)parms[17], 2);
               stmt.setDate(17, (java.util.Date)parms[18]);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[19], 2);
               stmt.setInt(19, ((Number) parms[20]).intValue());
               stmt.setShort(20, ((Number) parms[21]).shortValue());
               stmt.setShort(21, ((Number) parms[22]).shortValue());
               stmt.setShort(22, ((Number) parms[23]).shortValue());
               stmt.setString(23, (String)parms[24], 20);
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[30], 2);
               }
               stmt.setString(27, (String)parms[31], 10);
               stmt.setInt(28, ((Number) parms[32]).intValue());
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[33], 2);
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[37]).shortValue());
               }
               stmt.setShort(32, ((Number) parms[38]).shortValue());
               stmt.setString(33, (String)parms[39], 3);
               stmt.setInt(34, ((Number) parms[40]).intValue());
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[42]).shortValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[44]).shortValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(37, ((Number) parms[46]).shortValue());
               }
               return;
            case 21 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 20);
               stmt.setDate(8, (java.util.Date)parms[7]);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[9], false);
               }
               stmt.setString(10, (String)parms[10], 16);
               stmt.setString(11, (String)parms[11], 26);
               stmt.setString(12, (String)parms[12], 20);
               stmt.setString(13, (String)parms[13], 1);
               stmt.setString(14, (String)parms[14], 10);
               stmt.setString(15, (String)parms[15], 2);
               stmt.setDate(16, (java.util.Date)parms[16]);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[17], 2);
               stmt.setInt(18, ((Number) parms[18]).intValue());
               stmt.setShort(19, ((Number) parms[19]).shortValue());
               stmt.setShort(20, ((Number) parms[20]).shortValue());
               stmt.setShort(21, ((Number) parms[21]).shortValue());
               stmt.setString(22, (String)parms[22], 20);
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[28], 2);
               }
               stmt.setString(26, (String)parms[29], 10);
               stmt.setInt(27, ((Number) parms[30]).intValue());
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[31], 2);
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[35]).shortValue());
               }
               stmt.setShort(31, ((Number) parms[36]).shortValue());
               stmt.setInt(32, ((Number) parms[37]).intValue());
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[43]).shortValue());
               }
               stmt.setString(36, (String)parms[44], 3);
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(37, ((Number) parms[46]).intValue());
               }
               return;
            case 22 :
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 25 :
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
            case 26 :
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
            case 27 :
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
            case 28 :
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
            case 29 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 33 :
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
            case 34 :
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
            case 35 :
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
            case 36 :
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
            case 37 :
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
            case 38 :
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
            case 39 :
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
            case 40 :
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
            case 41 :
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
            case 42 :
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
            case 43 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 3);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[9]).intValue());
               }
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 16);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 2);
               stmt.setString(10, (String)parms[10], 4);
               stmt.setShort(11, ((Number) parms[11]).shortValue());
               stmt.setShort(12, ((Number) parms[12]).shortValue());
               stmt.setString(13, (String)parms[13], 15);
               stmt.setInt(14, ((Number) parms[14]).intValue());
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[15], 2);
               stmt.setString(16, (String)parms[16], 1);
               stmt.setInt(17, ((Number) parms[17]).intValue());
               stmt.setString(18, (String)parms[18], 10);
               stmt.setString(19, (String)parms[19], 10);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[20], 2);
               stmt.setString(21, (String)parms[21], 10);
               stmt.setString(22, (String)parms[22], 3);
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[24]).intValue());
               }
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 4);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 15);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               stmt.setString(14, (String)parms[13], 1);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setString(16, (String)parms[15], 10);
               stmt.setString(17, (String)parms[16], 10);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 2);
               stmt.setString(19, (String)parms[18], 10);
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[20]).intValue());
               }
               stmt.setString(21, (String)parms[21], 3);
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[23]).intValue());
               }
               stmt.setString(23, (String)parms[24], 9);
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 57 :
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
            case 58 :
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
            case 59 :
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

