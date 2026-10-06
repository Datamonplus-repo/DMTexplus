package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbre5_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "AlbRecCod") ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action76") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         AV53FlagFerro = (byte)(GXutil.lval( httpContext.GetPar( "FlagFerro"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53FlagFerro", GXutil.str( AV53FlagFerro, 1, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_76_1AE7( Gx_mode, A396EmprCod, A44AlbRecCod, AV53FlagFerro, A45AlbRef) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action78") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         AV159CtrlArt = (byte)(GXutil.lval( httpContext.GetPar( "CtrlArt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV159CtrlArt", GXutil.str( AV159CtrlArt, 1, 0));
         A3613AlbRefDsc = httpContext.GetPar( "AlbRefDsc") ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_78_1AE7( A396EmprCod, A252CliCod, A45AlbRef, AV159CtrlArt, A3613AlbRefDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action79") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A3613AlbRefDsc = httpContext.GetPar( "AlbRefDsc") ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         AV63Flag_artc = (byte)(GXutil.lval( httpContext.GetPar( "Flag_artc"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63Flag_artc", GXutil.str( AV63Flag_artc, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_79_1AE7( A396EmprCod, A252CliCod, A45AlbRef, A3613AlbRefDsc, AV63Flag_artc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action80") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A6264AlbRTartD = httpContext.GetPar( "AlbRTartD") ;
         n6264AlbRTartD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
         AV74Compos = httpContext.GetPar( "Compos") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74Compos", AV74Compos);
         A6263AlbRTartC = (short)(GXutil.lval( httpContext.GetPar( "AlbRTartC"))) ;
         n6263AlbRTartC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         A6465AlbRLu = CommonUtil.decimalVal( httpContext.GetPar( "AlbRLu"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
         AV112Moda21 = (byte)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV112Moda21", GXutil.str( AV112Moda21, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_80_1AE7( A396EmprCod, A252CliCod, A45AlbRef, A6264AlbRTartD, AV74Compos, A6263AlbRTartC, A6465AlbRLu, AV112Moda21) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action81") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A4920AlbRGrm2 = (short)(GXutil.lval( httpContext.GetPar( "AlbRGrm2"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = (short)(GXutil.lval( httpContext.GetPar( "AlbRAnc"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         AV77Kohler = (byte)(GXutil.lval( httpContext.GetPar( "Kohler"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77Kohler", GXutil.str( AV77Kohler, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_81_1AE7( Gx_mode, A396EmprCod, A252CliCod, A45AlbRef, A4920AlbRGrm2, A4921AlbRAnc, AV77Kohler) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action82") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6463AlbRLote = httpContext.GetPar( "AlbRLote") ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A4602AlbRMdlCod = httpContext.GetPar( "AlbRMdlCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
         A6464AlbRTelar = httpContext.GetPar( "AlbRTelar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
         AV149AlbStLot = (byte)(GXutil.lval( httpContext.GetPar( "AlbStLot"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV149AlbStLot", GXutil.str( AV149AlbStLot, 1, 0));
         AV103Erfoc = (byte)(GXutil.lval( httpContext.GetPar( "Erfoc"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV103Erfoc", GXutil.str( AV103Erfoc, 1, 0));
         A49AlbRFen = localUtil.parseDateParm( httpContext.GetPar( "AlbRFen")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_82_1AE7( Gx_mode, A396EmprCod, A6463AlbRLote, A4602AlbRMdlCod, A6464AlbRTelar, AV149AlbStLot, AV103Erfoc, A49AlbRFen) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_94") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_94( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_95") == 0 )
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
         gxload_95( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_96") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6263AlbRTartC = (short)(GXutil.lval( httpContext.GetPar( "AlbRTartC"))) ;
         n6263AlbRTartC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_96( A396EmprCod, A6263AlbRTartC) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_97") == 0 )
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
         gxload_97( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_98") == 0 )
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
         gxload_98( A396EmprCod, A970ProceCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_99") == 0 )
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
         gxload_99( A396EmprCod, A1211TipEntCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_100") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4792AlmCod = (byte)(GXutil.lval( httpContext.GetPar( "AlmCod"))) ;
         n4792AlmCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_100( A396EmprCod, A4792AlmCod) ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "AlbRecCod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "AlbRecCod") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtalbre5_level1item") == 0 )
      {
         gxnrgridtalbre5_level1item_newrow_invoke( ) ;
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
         A44AlbRecCod = (int)(GXutil.lval( gxfirstwebparm)) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            AV88AlbRef = httpContext.GetPar( "AlbRef") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88AlbRef", AV88AlbRef);
            AV163Unidades = httpContext.GetPar( "Unidades") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV163Unidades", AV163Unidades);
            AV164vDisLoc = httpContext.GetPar( "vDisLoc") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV164vDisLoc", AV164vDisLoc);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ENTRADA ALBARAN RECEPCION", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbRef_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridtalbre5_level1item_newrow_invoke( )
   {
      nRC_GXsfl_438 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_438"))) ;
      nGXsfl_438_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_438_idx"))) ;
      sGXsfl_438_idx = httpContext.GetPar( "sGXsfl_438_idx") ;
      A1301AlbRUlin = (byte)(GXutil.lval( httpContext.GetPar( "AlbRUlin"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtalbre5_level1item_newrow( ) ;
      /* End function gxnrGridtalbre5_level1item_newrow_invoke */
   }

   public talbre5_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talbre5_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbre5_impl.class ));
   }

   public talbre5_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbRUni = new HTMLChoice();
      cmbAlbRReo = new HTMLChoice();
      cmbAlbREst = new HTMLChoice();
      chkAlbRRep = UIFactory.getCheckbox(this);
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
      A5745AlbRRep = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A5745AlbRRep, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5745AlbRRep", GXutil.str( A5745AlbRRep, 1, 0));
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
      app.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "WWAdvancedContainer", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "ENTRADA ALBARAN RECEPCION", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      ClassString = "ErrorViewer" ;
      StyleString = "" ;
      app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divFormcontainer_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divToolbarcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 ToolbarCellClass", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "BtnFirst" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCellAdvanced", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRecCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRecCod_Internalname, httpContext.getMessage( "N Recepcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRef_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRef_Internalname, httpContext.getMessage( "Codigo Referencia", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef), GXutil.rtrim( localUtil.format( A45AlbRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRef_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRef_Enabled, 1, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTrnCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTrnCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnNom_Internalname, httpContext.getMessage( "Transportista", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNom_Internalname, GXutil.rtrim( A841TrnNom), GXutil.rtrim( localUtil.format( A841TrnNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTrnNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbREnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbREnt_Internalname, httpContext.getMessage( "Albaran Entrega", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt_Internalname, GXutil.rtrim( A46AlbREnt), GXutil.rtrim( localUtil.format( A46AlbREnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbREnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieEnt_Internalname, httpContext.getMessage( "Piezas Entregadas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRPieEnt_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbRUni.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbRUni.getInternalname(), httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "", true, (byte)(0), "HLP_TALBRE5.htm");
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRLoc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRLoc_Internalname, httpContext.getMessage( "Localizacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLoc_Internalname, GXutil.rtrim( A50AlbRLoc), GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLoc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRLoc_Enabled, 1, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRFen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRFen_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbRFen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFen_Internalname, localUtil.format(A49AlbRFen, "99/99/99"), localUtil.format( A49AlbRFen, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFen_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRFen_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRFen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBRE5.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniEnt_Internalname, httpContext.getMessage( "Unidades Entrada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbRReo.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbRReo.getInternalname(), httpContext.getMessage( "Reclamacion?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRReo, cmbAlbRReo.getInternalname(), GXutil.rtrim( A55AlbRReo), 1, cmbAlbRReo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRReo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "", true, (byte)(0), "HLP_TALBRE5.htm");
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieUti_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieUti_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieUti_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRPieUti_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieReb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieReb_Internalname, httpContext.getMessage( "Piezas Rebajadas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieReb_Internalname, GXutil.ltrim( localUtil.ntoc( A53AlbRPieReb, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieReb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A53AlbRPieReb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A53AlbRPieReb), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieReb_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRPieReb_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniUti_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniUti_Internalname, httpContext.getMessage( "Unidades Utilizadas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A60AlbRUniUti, "ZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniUti_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRUniUti_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniReb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniReb_Internalname, httpContext.getMessage( "Unidades Rebajadas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniReb_Internalname, GXutil.ltrim( localUtil.ntoc( A59AlbRUniReb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniReb_Enabled!=0) ? localUtil.format( A59AlbRUniReb, "ZZZZZ9.99") : localUtil.format( A59AlbRUniReb, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniReb_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRUniReb_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieDis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieDis_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRPieDis_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniDis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniDis_Internalname, httpContext.getMessage( "Unidades Disponibles", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A57AlbRUniDis, "ZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRUniDis_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRFecUlt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRFecUlt_Internalname, httpContext.getMessage( "Fecha Ult Uti", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbRFecUlt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFecUlt_Internalname, localUtil.format(A48AlbRFecUlt, "99/99/99"), localUtil.format( A48AlbRFecUlt, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFecUlt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRFecUlt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRFecUlt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFecUlt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBRE5.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbREst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbREst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbREst, cmbAlbREst.getInternalname(), GXutil.trim( GXutil.str( A47AlbREst, 1, 0)), 1, cmbAlbREst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbREst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,144);\"", "", true, (byte)(0), "HLP_TALBRE5.htm");
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipEntCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipEntCod_Internalname, httpContext.getMessage( "Tipo Entrada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipEntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1211TipEntCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipEntCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTipEntCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipEntNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipEntNom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipEntNom_Internalname, GXutil.rtrim( A1212TipEntNom), GXutil.rtrim( localUtil.format( A1212TipEntNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipEntNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTipEntNom_Enabled, 0, "text", "", 25, "chr", 1, "row", 25, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbNumEti_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbNumEti_Internalname, httpContext.getMessage( "Numero de Etiquetas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumEti_Internalname, GXutil.ltrim( localUtil.ntoc( A1222AlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbNumEti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1222AlbNumEti), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1222AlbNumEti), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumEti_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbNumEti_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRDes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRDes_Internalname, httpContext.getMessage( "Destino", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRDes_Internalname, GXutil.rtrim( A1291AlbRDes), GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRDes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRDes_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProceCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProceCod_Internalname, httpContext.getMessage( "Codigo Procedencia", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceCod_Internalname, GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProceCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProceCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProceNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProceNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceNom_Internalname, GXutil.rtrim( A971ProceNom), GXutil.rtrim( localUtil.format( A971ProceNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProceNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUlin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUlin_Internalname, httpContext.getMessage( "Ultima Linea de Observaciones", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUlin_Internalname, GXutil.ltrim( localUtil.ntoc( A1301AlbRUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1301AlbRUlin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1301AlbRUlin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUlin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRUlin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRefDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRefDsc_Internalname, httpContext.getMessage( "Descripcion Referencia", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc), GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRefDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRefDsc_Enabled, 1, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbPmPPza_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbPmPPza_Internalname, httpContext.getMessage( "Peso Medio p/Pza.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPmPPza_Internalname, GXutil.ltrim( localUtil.ntoc( A4290AlbPmPPza, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPmPPza_Enabled!=0) ? localUtil.format( A4290AlbPmPPza, "Z9.999") : localUtil.format( A4290AlbPmPPza, "Z9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPmPPza_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbPmPPza_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbPzaEst_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbPzaEst_Internalname, httpContext.getMessage( "Piezas Estimadas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPzaEst_Internalname, GXutil.ltrim( localUtil.ntoc( A4291AlbPzaEst, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPzaEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4291AlbPzaEst), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4291AlbPzaEst), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPzaEst_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbPzaEst_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRGrm2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRGrm2_Internalname, httpContext.getMessage( "Grm2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRGrm2_Internalname, GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRGrm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,199);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRGrm2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRGrm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRAnc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRAnc_Internalname, httpContext.getMessage( "Ancho", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,204);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRAnc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbPml_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbPml_Internalname, httpContext.getMessage( "Pml", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPml_Internalname, GXutil.ltrim( localUtil.ntoc( A4922AlbPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPml_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4922AlbPml), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4922AlbPml), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,209);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPml_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbPml_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPre_Internalname, httpContext.getMessage( "Precio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPre_Internalname, GXutil.ltrim( localUtil.ntoc( A5743AlbRPre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPre_Enabled!=0) ? localUtil.format( A5743AlbRPre, "ZZZZZ9.99") : localUtil.format( A5743AlbRPre, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,214);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRPre_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRAju_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRAju_Internalname, httpContext.getMessage( "Ajuste", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRAju_Internalname, GXutil.ltrim( localUtil.ntoc( A5744AlbRAju, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRAju_Enabled!=0) ? localUtil.format( A5744AlbRAju, "ZZZZ9.99") : localUtil.format( A5744AlbRAju, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,219);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRAju_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRAju_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkAlbRRep.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkAlbRRep.getInternalname(), httpContext.getMessage( "Mostrar en Reportes", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkAlbRRep.getInternalname(), GXutil.str( A5745AlbRRep, 1, 0), "", httpContext.getMessage( "Mostrar en Reportes", ""), 1, chkAlbRRep.getEnabled(), "1", httpContext.getMessage( "Mostrar en Reportes", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(224, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,224);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbREnt2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbREnt2_Internalname, httpContext.getMessage( "Nº Albaran Entrega", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt2_Internalname, GXutil.rtrim( A5806AlbREnt2), GXutil.rtrim( localUtil.format( A5806AlbREnt2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,229);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbREnt2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbrUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbrUsu_Internalname, httpContext.getMessage( "Usuario", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 234,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrUsu_Internalname, GXutil.rtrim( A6178AlbrUsu), GXutil.rtrim( localUtil.format( A6178AlbrUsu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,234);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrUsu_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbrUsu_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbrHor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbrHor_Internalname, httpContext.getMessage( "Hora entrada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbrHor_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrHor_Internalname, localUtil.ttoc( A6179AlbrHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A6179AlbrHor, "99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,239);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrHor_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbrHor_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbrHor_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbrHor_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBRE5.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbrUniC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbrUniC_Internalname, httpContext.getMessage( "Unidades Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 244,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrUniC_Internalname, GXutil.ltrim( localUtil.ntoc( A6180AlbrUniC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbrUniC_Enabled!=0) ? localUtil.format( A6180AlbrUniC, "ZZZZZ9.99") : localUtil.format( A6180AlbrUniC, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,244);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrUniC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbrUniC_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbrPieC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbrPieC_Internalname, httpContext.getMessage( "Piezas Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 249,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrPieC_Internalname, GXutil.ltrim( localUtil.ntoc( A6181AlbrPieC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbrPieC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6181AlbrPieC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6181AlbrPieC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,249);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrPieC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbrPieC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbrNF_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbrNF_Internalname, httpContext.getMessage( "Nota Fiscal?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 254,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrNF_Internalname, GXutil.rtrim( A6182AlbrNF), GXutil.rtrim( localUtil.format( A6182AlbrNF, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,254);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrNF_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbrNF_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbrFeNf_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbrFeNf_Internalname, httpContext.getMessage( "Fecha emision NF", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbrFeNf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrFeNf_Internalname, localUtil.format(A6183AlbrFeNf, "99/99/99"), localUtil.format( A6183AlbrFeNf, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrFeNf_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbrFeNf_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbrFeNf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbrFeNf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBRE5.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbrCfop_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbrCfop_Internalname, httpContext.getMessage( "Codigo Fiscal de Operacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 264,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbrCfop_Internalname, GXutil.rtrim( A6184AlbrCfop), GXutil.rtrim( localUtil.format( A6184AlbrCfop, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,264);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbrCfop_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbrCfop_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRDisCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRDisCli_Internalname, httpContext.getMessage( "Disp. Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 269,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRDisCli_Internalname, GXutil.rtrim( A3359AlbRDisCli), GXutil.rtrim( localUtil.format( A3359AlbRDisCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,269);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRDisCli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRDisCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRTartC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRTartC_Internalname, httpContext.getMessage( "Tipo Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 274,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRTartC_Internalname, GXutil.ltrim( localUtil.ntoc( A6263AlbRTartC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6263AlbRTartC), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,274);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRTartC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRTartC_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRTartD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRTartD_Internalname, httpContext.getMessage( "Tipo artículo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRTartD_Internalname, GXutil.rtrim( A6264AlbRTartD), GXutil.rtrim( localUtil.format( A6264AlbRTartD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRTartD_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRTartD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRImp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRImp_Internalname, httpContext.getMessage( "Albaran Impreso ?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 284,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRImp_Internalname, GXutil.rtrim( A3360AlbRImp), GXutil.rtrim( localUtil.format( A3360AlbRImp, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,284);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRImp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRImp_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRLote_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRLote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 289,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLote_Internalname, GXutil.rtrim( A6463AlbRLote), GXutil.rtrim( localUtil.format( A6463AlbRLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,289);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLote_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRLote_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRTelar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRTelar_Internalname, httpContext.getMessage( "Telar", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 294,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRTelar_Internalname, GXutil.rtrim( A6464AlbRTelar), GXutil.rtrim( localUtil.format( A6464AlbRTelar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,294);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRTelar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRTelar_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRLu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRLu_Internalname, httpContext.getMessage( "Longitud Hilo en 50 agujas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 299,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLu_Internalname, GXutil.ltrim( localUtil.ntoc( A6465AlbRLu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRLu_Enabled!=0) ? localUtil.format( A6465AlbRLu, "ZZ9.99") : localUtil.format( A6465AlbRLu, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,299);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLu_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRLu_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRMdlCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRMdlCod_Internalname, httpContext.getMessage( "Modelo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 304,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRMdlCod_Internalname, GXutil.rtrim( A4602AlbRMdlCod), GXutil.rtrim( localUtil.format( A4602AlbRMdlCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,304);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRMdlCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRMdlCod_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRTara_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRTara_Internalname, httpContext.getMessage( "Tara", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 309,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRTara_Internalname, GXutil.ltrim( localUtil.ntoc( A6470AlbRTara, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRTara_Enabled!=0) ? localUtil.format( A6470AlbRTara, "ZZ9.99") : localUtil.format( A6470AlbRTara, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,309);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRTara_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRTara_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniB_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniB_Internalname, httpContext.getMessage( "Unidades Bruto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 314,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniB_Internalname, GXutil.ltrim( localUtil.ntoc( A6471AlbRUniB, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniB_Enabled!=0) ? localUtil.format( A6471AlbRUniB, "ZZZZZ9.99") : localUtil.format( A6471AlbRUniB, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,314);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniB_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRUniB_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbDocPrv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbDocPrv_Internalname, httpContext.getMessage( "Documento Proveedor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 319,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDocPrv_Internalname, GXutil.rtrim( A6488AlbDocPrv), GXutil.rtrim( localUtil.format( A6488AlbDocPrv, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,319);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDocPrv_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbDocPrv_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUdas_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUdas_Internalname, httpContext.getMessage( "Unidades Clientes", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 324,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUdas_Internalname, GXutil.ltrim( localUtil.ntoc( A6523AlbRUdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUdas_Enabled!=0) ? localUtil.format( A6523AlbRUdas, "ZZZZZ9.99") : localUtil.format( A6523AlbRUdas, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,324);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUdas_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRUdas_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlmCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlmCod_Internalname, httpContext.getMessage( "Almacen", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 329,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlmCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4792AlmCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlmCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4792AlmCod), "9") : localUtil.format( DecimalUtil.doubleToDec(A4792AlmCod), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,329);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlmCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlmCod_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlmNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlmNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlmNom_Internalname, GXutil.rtrim( A4793AlmNom), GXutil.rtrim( localUtil.format( A4793AlmNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlmNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlmNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbColor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbColor_Internalname, httpContext.getMessage( "Color Texfina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 339,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbColor_Internalname, GXutil.rtrim( A8023AlbColor), GXutil.rtrim( localUtil.format( A8023AlbColor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,339);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbColor_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbColor_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbOpsT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbOpsT_Internalname, httpContext.getMessage( "Op Texfina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 344,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbOpsT_Internalname, GXutil.rtrim( A8024AlbOpsT), GXutil.rtrim( localUtil.format( A8024AlbOpsT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,344);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbOpsT_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbOpsT_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbOpsC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbOpsC_Internalname, httpContext.getMessage( "Op Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 349,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbOpsC_Internalname, GXutil.rtrim( A8025AlbOpsC), GXutil.rtrim( localUtil.format( A8025AlbOpsC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,349);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbOpsC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbOpsC_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbOC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbOC_Internalname, httpContext.getMessage( "Orden Compra", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 354,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbOC_Internalname, GXutil.rtrim( A8026AlbOC), GXutil.rtrim( localUtil.format( A8026AlbOC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,354);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbOC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbOC_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHdri_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHdri_Internalname, httpContext.getMessage( "HDR Inicial", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 359,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdri_Internalname, GXutil.rtrim( A8027AlbHdri), GXutil.rtrim( localUtil.format( A8027AlbHdri, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,359);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdri_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbHdri_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbNumB_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbNumB_Internalname, httpContext.getMessage( "Analisis Composicion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 364,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumB_Internalname, GXutil.rtrim( A8028AlbNumB), GXutil.rtrim( localUtil.format( A8028AlbNumB, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,364);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumB_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbNumB_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbNumM_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbNumM_Internalname, httpContext.getMessage( "Nº Marcado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 369,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumM_Internalname, GXutil.rtrim( A8029AlbNumM), GXutil.rtrim( localUtil.format( A8029AlbNumM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,369);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumM_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbNumM_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbAncC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbAncC_Internalname, httpContext.getMessage( "Ancho Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 374,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbAncC_Internalname, GXutil.ltrim( localUtil.ntoc( A8030AlbAncC, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbAncC_Enabled!=0) ? localUtil.format( A8030AlbAncC, "Z9.99") : localUtil.format( A8030AlbAncC, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,374);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbAncC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbAncC_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbDndC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbDndC_Internalname, httpContext.getMessage( "Densidad Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 379,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDndC_Internalname, GXutil.ltrim( localUtil.ntoc( A8031AlbDndC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDndC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8031AlbDndC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8031AlbDndC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,379);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDndC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbDndC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbAncCr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbAncCr_Internalname, httpContext.getMessage( "Ancho Crudo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 384,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbAncCr_Internalname, GXutil.ltrim( localUtil.ntoc( A8032AlbAncCr, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbAncCr_Enabled!=0) ? localUtil.format( A8032AlbAncCr, "Z9.99") : localUtil.format( A8032AlbAncCr, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,384);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbAncCr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbAncCr_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbDndCr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbDndCr_Internalname, httpContext.getMessage( "Densidad Crudo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 389,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDndCr_Internalname, GXutil.ltrim( localUtil.ntoc( A8033AlbDndCr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDndCr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8033AlbDndCr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8033AlbDndCr), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,389);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDndCr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbDndCr_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbGalga_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbGalga_Internalname, httpContext.getMessage( "Galga", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 394,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbGalga_Internalname, GXutil.ltrim( localUtil.ntoc( A8034AlbGalga, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbGalga_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8034AlbGalga), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8034AlbGalga), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,394);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbGalga_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbGalga_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbMaqTej_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbMaqTej_Internalname, httpContext.getMessage( "Maquina Tejido", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 399,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMaqTej_Internalname, GXutil.rtrim( A8035AlbMaqTej), GXutil.rtrim( localUtil.format( A8035AlbMaqTej, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,399);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMaqTej_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbMaqTej_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      drawcontrols2( ) ;
   }

   public void drawcontrols2( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbDmt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbDmt_Internalname, httpContext.getMessage( "Diametro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 404,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDmt_Internalname, GXutil.ltrim( localUtil.ntoc( A8036AlbDmt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDmt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8036AlbDmt), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8036AlbDmt), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,404);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDmt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbDmt_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbPdaC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbPdaC_Internalname, httpContext.getMessage( "Partida Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 409,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPdaC_Internalname, GXutil.rtrim( A9793AlbPdaC), GXutil.rtrim( localUtil.format( A9793AlbPdaC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,409);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPdaC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbPdaC_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbOStj_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbOStj_Internalname, httpContext.getMessage( "Orden Servicio Tejido", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 414,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbOStj_Internalname, GXutil.rtrim( A9794AlbOStj), GXutil.rtrim( localUtil.format( A9794AlbOStj, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,414);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbOStj_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbOStj_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbStLot_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbStLot_Internalname, httpContext.getMessage( "Status Lote Entrada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 419,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbStLot_Internalname, GXutil.ltrim( localUtil.ntoc( A317AlbStLot, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbStLot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A317AlbStLot), "9") : localUtil.format( DecimalUtil.doubleToDec(A317AlbStLot), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,419);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbStLot_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbStLot_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTurno_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbTurno_Internalname, httpContext.getMessage( "Turno", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 424,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTurno_Internalname, GXutil.ltrim( localUtil.ntoc( A10358AlbTurno, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbTurno_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10358AlbTurno), "9") : localUtil.format( DecimalUtil.doubleToDec(A10358AlbTurno), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,424);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTurno_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbTurno_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliEst_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliEst_Internalname, httpContext.getMessage( "Membrete Albaran", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliEst_Internalname, GXutil.rtrim( A8723CliEst), GXutil.rtrim( localUtil.format( A8723CliEst, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliEst_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliEst_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divLevel1table_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridtalbre5_level1item( ) ;
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 445,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 447,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 449,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBRE5.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtalbre5_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol438( ) ;
      nGXsfl_438_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount191 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_191 = (short)(1) ;
            scanStart1AE191( ) ;
            while ( RcdFound191 != 0 )
            {
               init_level_properties191( ) ;
               getByPrimaryKey1AE191( ) ;
               addRow1AE191( ) ;
               scanNext1AE191( ) ;
            }
            scanEnd1AE191( ) ;
            nBlankRcdCount191 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1301AlbRUlin = A1301AlbRUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         B54AlbRPieUti = A54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         B60AlbRUniUti = A60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         B52AlbRPieEnt = A52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         B58AlbRUniEnt = A58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         standaloneNotModal1AE191( ) ;
         standaloneModal1AE191( ) ;
         sMode191 = Gx_mode ;
         while ( nGXsfl_438_idx < nRC_GXsfl_438 )
         {
            bGXsfl_438_Refreshing = true ;
            readRow1AE191( ) ;
            edtAlbRLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRLIN_"+sGXsfl_438_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLin_Enabled), 5, 0), !bGXsfl_438_Refreshing);
            edtAlbRObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBROBS_"+sGXsfl_438_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRObs_Enabled), 5, 0), !bGXsfl_438_Refreshing);
            if ( ( nRcdExists_191 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1AE191( ) ;
            }
            sendRow1AE191( ) ;
            bGXsfl_438_Refreshing = false ;
         }
         Gx_mode = sMode191 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1301AlbRUlin = B1301AlbRUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         A54AlbRPieUti = B54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A60AlbRUniUti = B60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A52AlbRPieEnt = B52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A58AlbRUniEnt = B58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount191 = (short)(5) ;
         nRcdExists_191 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1AE191( ) ;
            while ( RcdFound191 != 0 )
            {
               sGXsfl_438_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_438_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_438191( ) ;
               init_level_properties191( ) ;
               standaloneNotModal1AE191( ) ;
               getByPrimaryKey1AE191( ) ;
               standaloneModal1AE191( ) ;
               addRow1AE191( ) ;
               scanNext1AE191( ) ;
            }
            scanEnd1AE191( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode191 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_438_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_438_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_438191( ) ;
      initAll1AE191( ) ;
      init_level_properties191( ) ;
      B1301AlbRUlin = A1301AlbRUlin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      B54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      B60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      B52AlbRPieEnt = A52AlbRPieEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      B58AlbRUniEnt = A58AlbRUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      nRcdExists_191 = (short)(0) ;
      nIsMod_191 = (short)(0) ;
      nRcdDeleted_191 = (short)(0) ;
      nBlankRcdCount191 = (short)(nBlankRcdUsr191+nBlankRcdCount191) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount191 > 0 )
      {
         standaloneNotModal1AE191( ) ;
         standaloneModal1AE191( ) ;
         addRow1AE191( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAlbRLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount191 = (short)(nBlankRcdCount191-1) ;
      }
      Gx_mode = sMode191 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A1301AlbRUlin = B1301AlbRUlin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      A54AlbRPieUti = B54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A60AlbRUniUti = B60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A52AlbRPieEnt = B52AlbRPieEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A58AlbRUniEnt = B58AlbRUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtalbre5_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtalbre5_level1item", Gridtalbre5_level1itemContainer, subGridtalbre5_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtalbre5_level1itemContainerData", Gridtalbre5_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtalbre5_level1itemContainerData"+"V", Gridtalbre5_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtalbre5_level1itemContainerData"+"V"+"\" value='"+Gridtalbre5_level1itemContainer.GridValuesHidden()+"'/>") ;
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z45AlbRef = httpContext.cgiGet( "Z45AlbRef") ;
         Z56AlbRUni = httpContext.cgiGet( "Z56AlbRUni") ;
         Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z317AlbStLot = (byte)(localUtil.ctol( httpContext.cgiGet( "Z317AlbStLot"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z46AlbREnt = httpContext.cgiGet( "Z46AlbREnt") ;
         Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z50AlbRLoc = httpContext.cgiGet( "Z50AlbRLoc") ;
         Z49AlbRFen = localUtil.ctod( httpContext.cgiGet( "Z49AlbRFen"), 0) ;
         Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
         Z55AlbRReo = httpContext.cgiGet( "Z55AlbRReo") ;
         Z54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "Z54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( "Z53AlbRPieReb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "Z60AlbRUniUti")) ;
         Z59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( "Z59AlbRUniReb")) ;
         Z48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( "Z48AlbRFecUlt"), 0) ;
         Z1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( "Z1222AlbNumEti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1291AlbRDes = httpContext.cgiGet( "Z1291AlbRDes") ;
         Z1301AlbRUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1301AlbRUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3613AlbRefDsc = httpContext.cgiGet( "Z3613AlbRefDsc") ;
         Z4290AlbPmPPza = localUtil.ctond( httpContext.cgiGet( "Z4290AlbPmPPza")) ;
         Z4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z4920AlbRGrm2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z4921AlbRAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4922AlbPml = (short)(localUtil.ctol( httpContext.cgiGet( "Z4922AlbPml"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5743AlbRPre = localUtil.ctond( httpContext.cgiGet( "Z5743AlbRPre")) ;
         Z5744AlbRAju = localUtil.ctond( httpContext.cgiGet( "Z5744AlbRAju")) ;
         Z5745AlbRRep = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5745AlbRRep"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5806AlbREnt2 = httpContext.cgiGet( "Z5806AlbREnt2") ;
         Z6178AlbrUsu = httpContext.cgiGet( "Z6178AlbrUsu") ;
         Z6179AlbrHor = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z6179AlbrHor"), 0)) ;
         Z6180AlbrUniC = localUtil.ctond( httpContext.cgiGet( "Z6180AlbrUniC")) ;
         Z6181AlbrPieC = (int)(localUtil.ctol( httpContext.cgiGet( "Z6181AlbrPieC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6182AlbrNF = httpContext.cgiGet( "Z6182AlbrNF") ;
         Z6183AlbrFeNf = localUtil.ctod( httpContext.cgiGet( "Z6183AlbrFeNf"), 0) ;
         Z6184AlbrCfop = httpContext.cgiGet( "Z6184AlbrCfop") ;
         Z3359AlbRDisCli = httpContext.cgiGet( "Z3359AlbRDisCli") ;
         Z3360AlbRImp = httpContext.cgiGet( "Z3360AlbRImp") ;
         Z6463AlbRLote = httpContext.cgiGet( "Z6463AlbRLote") ;
         Z6464AlbRTelar = httpContext.cgiGet( "Z6464AlbRTelar") ;
         Z6465AlbRLu = localUtil.ctond( httpContext.cgiGet( "Z6465AlbRLu")) ;
         Z4602AlbRMdlCod = httpContext.cgiGet( "Z4602AlbRMdlCod") ;
         Z6470AlbRTara = localUtil.ctond( httpContext.cgiGet( "Z6470AlbRTara")) ;
         Z6471AlbRUniB = localUtil.ctond( httpContext.cgiGet( "Z6471AlbRUniB")) ;
         Z6488AlbDocPrv = httpContext.cgiGet( "Z6488AlbDocPrv") ;
         Z6523AlbRUdas = localUtil.ctond( httpContext.cgiGet( "Z6523AlbRUdas")) ;
         Z8023AlbColor = httpContext.cgiGet( "Z8023AlbColor") ;
         Z8024AlbOpsT = httpContext.cgiGet( "Z8024AlbOpsT") ;
         Z8025AlbOpsC = httpContext.cgiGet( "Z8025AlbOpsC") ;
         Z8026AlbOC = httpContext.cgiGet( "Z8026AlbOC") ;
         Z8027AlbHdri = httpContext.cgiGet( "Z8027AlbHdri") ;
         Z8028AlbNumB = httpContext.cgiGet( "Z8028AlbNumB") ;
         Z8029AlbNumM = httpContext.cgiGet( "Z8029AlbNumM") ;
         Z8030AlbAncC = localUtil.ctond( httpContext.cgiGet( "Z8030AlbAncC")) ;
         Z8031AlbDndC = (short)(localUtil.ctol( httpContext.cgiGet( "Z8031AlbDndC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8032AlbAncCr = localUtil.ctond( httpContext.cgiGet( "Z8032AlbAncCr")) ;
         Z8033AlbDndCr = (short)(localUtil.ctol( httpContext.cgiGet( "Z8033AlbDndCr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8034AlbGalga = (short)(localUtil.ctol( httpContext.cgiGet( "Z8034AlbGalga"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8035AlbMaqTej = httpContext.cgiGet( "Z8035AlbMaqTej") ;
         Z8036AlbDmt = (short)(localUtil.ctol( httpContext.cgiGet( "Z8036AlbDmt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9793AlbPdaC = httpContext.cgiGet( "Z9793AlbPdaC") ;
         Z9794AlbOStj = httpContext.cgiGet( "Z9794AlbOStj") ;
         Z10358AlbTurno = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10358AlbTurno"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6263AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( "Z6263AlbRTartC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z970ProceCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z1211TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4792AlmCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4792AlmCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O1301AlbRUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "O1301AlbRUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "O54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "O60AlbRUniUti")) ;
         O52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "O52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "O58AlbRUniEnt")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_438 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_438"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         N1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "N1211TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         N50AlbRLoc = httpContext.cgiGet( "N50AlbRLoc") ;
         N252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "N252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         N45AlbRef = httpContext.cgiGet( "N45AlbRef") ;
         N49AlbRFen = localUtil.ctod( httpContext.cgiGet( "N49AlbRFen"), 0) ;
         N56AlbRUni = httpContext.cgiGet( "N56AlbRUni") ;
         N55AlbRReo = httpContext.cgiGet( "N55AlbRReo") ;
         AV44Modo = httpContext.cgiGet( "MODO") ;
         AV85Albrfenf = localUtil.ctod( httpContext.cgiGet( "ALBRFENF"), 0) ;
         AV88AlbRef = httpContext.cgiGet( "vALBREF") ;
         AV163Unidades = httpContext.cgiGet( "vUNIDADES") ;
         AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
         AV44Modo = httpContext.cgiGet( "vMODO") ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV18AlbCum = httpContext.cgiGet( "vALBCUM") ;
         AV83AlbReccod = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRECCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV97Doc_6 = (int)(localUtil.ctol( httpContext.cgiGet( "vDOC_6"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV84Documento = httpContext.cgiGet( "vDOCUMENTO") ;
         AV85Albrfenf = localUtil.ctod( httpContext.cgiGet( "vALBRFENF"), 0) ;
         AV87Procecod = (short)(localUtil.ctol( httpContext.cgiGet( "vPROCECOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV69ALbRunient = localUtil.ctond( httpContext.cgiGet( "vALBRUNIENT")) ;
         AV94AlbRunic = localUtil.ctond( httpContext.cgiGet( "vALBRUNIC")) ;
         AV89Albrpieent = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRPIEENT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV90Albrpre = localUtil.ctond( httpContext.cgiGet( "vALBRPRE")) ;
         AV96albrfen = localUtil.ctod( httpContext.cgiGet( "vALBRFEN"), 0) ;
         AV91albrcfop = httpContext.cgiGet( "vALBRCFOP") ;
         AV92albrreo = httpContext.cgiGet( "vALBRREO") ;
         AV93albrnf = httpContext.cgiGet( "vALBRNF") ;
         AV95TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "vTIPENTCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV141PieEntold = (int)(localUtil.ctol( httpContext.cgiGet( "vPIEENTOLD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV142UniENtold = localUtil.ctond( httpContext.cgiGet( "vUNIENTOLD")) ;
         AV149AlbStLot = (byte)(localUtil.ctol( httpContext.cgiGet( "vALBSTLOT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV154Oldunie = localUtil.ctond( httpContext.cgiGet( "vOLDUNIE")) ;
         AV156oldpiee = (int)(localUtil.ctol( httpContext.cgiGet( "vOLDPIEE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV155olduniu = localUtil.ctond( httpContext.cgiGet( "vOLDUNIU")) ;
         AV157oldpieu = (int)(localUtil.ctol( httpContext.cgiGet( "vOLDPIEU"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV153Texto_ii = httpContext.cgiGet( "vTEXTO_II") ;
         AV164vDisLoc = httpContext.cgiGet( "vVDISLOC") ;
         AV53FlagFerro = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGFERRO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV50FlagArt = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV63Flag_artc = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAG_ARTC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV74Compos = httpContext.cgiGet( "vCOMPOS") ;
         AV168Pgmname = httpContext.cgiGet( "vPGMNAME") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A840TrnCod = (short)(0) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
         n841TrnNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRPieEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A52AlbRPieEnt = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         }
         else
         {
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         }
         cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
         cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
         A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A50AlbRLoc = httpContext.cgiGet( edtAlbRLoc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         if ( localUtil.vcdate( httpContext.cgiGet( edtAlbRFen_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ALBRFEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRFen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A49AlbRFen = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         }
         else
         {
            A49AlbRFen = localUtil.ctod( httpContext.cgiGet( edtAlbRFen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRUniEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A58AlbRUniEnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
         else
         {
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
         cmbAlbRReo.setName( cmbAlbRReo.getInternalname() );
         cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
         A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEUTI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRPieUti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A54AlbRPieUti = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
         else
         {
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieReb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieReb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEREB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRPieReb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A53AlbRPieReb = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         }
         else
         {
            A53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieReb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIUTI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRUniUti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A60AlbRUniUti = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
         else
         {
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUniReb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUniReb_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIREB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRUniReb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A59AlbRUniReb = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
         }
         else
         {
            A59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( edtAlbRUniReb_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
         }
         A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         A48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( edtAlbRFecUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         cmbAlbREst.setName( cmbAlbREst.getInternalname() );
         cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
         A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipEntCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1211TipEntCod = (short)(0) ;
            n1211TipEntCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         }
         else
         {
            A1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1211TipEntCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         }
         A1212TipEntNom = httpContext.cgiGet( edtTipEntNom_Internalname) ;
         n1212TipEntNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbNumEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbNumEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBNUMETI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbNumEti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1222AlbNumEti = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         }
         else
         {
            A1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbNumEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         }
         A1291AlbRDes = httpContext.cgiGet( edtAlbRDes_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProceCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A970ProceCod = (short)(0) ;
            n970ProceCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         }
         else
         {
            A970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n970ProceCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         }
         A971ProceNom = httpContext.cgiGet( edtProceNom_Internalname) ;
         n971ProceNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         A1301AlbRUlin = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbRUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbPmPPza_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbPmPPza_Internalname)), DecimalUtil.stringToDec("99.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPMPPZA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbPmPPza_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4290AlbPmPPza = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
         }
         else
         {
            A4290AlbPmPPza = localUtil.ctond( httpContext.cgiGet( edtAlbPmPPza_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
         }
         A4291AlbPzaEst = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbPzaEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRGRM2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRGrm2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4920AlbRGrm2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         }
         else
         {
            A4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRANC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRAnc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4921AlbRAnc = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         }
         else
         {
            A4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPML");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbPml_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4922AlbPml = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
         }
         else
         {
            A4922AlbPml = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRPre_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRPre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5743AlbRPre = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A5743AlbRPre", GXutil.ltrimstr( A5743AlbRPre, 12, 5));
         }
         else
         {
            A5743AlbRPre = localUtil.ctond( httpContext.cgiGet( edtAlbRPre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5743AlbRPre", GXutil.ltrimstr( A5743AlbRPre, 12, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRAju_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRAju_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRAJU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRAju_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5744AlbRAju = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A5744AlbRAju", GXutil.ltrimstr( A5744AlbRAju, 8, 2));
         }
         else
         {
            A5744AlbRAju = localUtil.ctond( httpContext.cgiGet( edtAlbRAju_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5744AlbRAju", GXutil.ltrimstr( A5744AlbRAju, 8, 2));
         }
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkAlbRRep.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkAlbRRep.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRREP");
            AnyError = (short)(1) ;
            GX_FocusControl = chkAlbRRep.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5745AlbRRep = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5745AlbRRep", GXutil.str( A5745AlbRRep, 1, 0));
         }
         else
         {
            A5745AlbRRep = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkAlbRRep.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5745AlbRRep", GXutil.str( A5745AlbRRep, 1, 0));
         }
         A5806AlbREnt2 = httpContext.cgiGet( edtAlbREnt2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         A6178AlbrUsu = httpContext.cgiGet( edtAlbrUsu_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6178AlbrUsu", A6178AlbrUsu);
         if ( localUtil.vcdate( httpContext.cgiGet( edtAlbrHor_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "ALBRHOR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbrHor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A6179AlbrHor = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtAlbrHor_Internalname))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbrUniC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbrUniC_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbrUniC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6180AlbrUniC = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
         }
         else
         {
            A6180AlbrUniC = localUtil.ctond( httpContext.cgiGet( edtAlbrUniC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbrPieC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbrPieC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbrPieC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6181AlbrPieC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
         }
         else
         {
            A6181AlbrPieC = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbrPieC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
         }
         A6182AlbrNF = GXutil.upper( httpContext.cgiGet( edtAlbrNF_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", A6182AlbrNF);
         A6183AlbrFeNf = localUtil.ctod( httpContext.cgiGet( edtAlbrFeNf_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6183AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
         A6184AlbrCfop = httpContext.cgiGet( edtAlbrCfop_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6184AlbrCfop", A6184AlbrCfop);
         A3359AlbRDisCli = httpContext.cgiGet( edtAlbRDisCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3359AlbRDisCli", A3359AlbRDisCli);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRTartC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRTartC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRTARTC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRTartC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6263AlbRTartC = (short)(0) ;
            n6263AlbRTartC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         }
         else
         {
            A6263AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRTartC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6263AlbRTartC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         }
         A6264AlbRTartD = httpContext.cgiGet( edtAlbRTartD_Internalname) ;
         n6264AlbRTartD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
         A3360AlbRImp = GXutil.upper( httpContext.cgiGet( edtAlbRImp_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3360AlbRImp", A3360AlbRImp);
         A6463AlbRLote = httpContext.cgiGet( edtAlbRLote_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A6464AlbRTelar = httpContext.cgiGet( edtAlbRTelar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRLu_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRLu_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRLU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRLu_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6465AlbRLu = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
         }
         else
         {
            A6465AlbRLu = localUtil.ctond( httpContext.cgiGet( edtAlbRLu_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
         }
         A4602AlbRMdlCod = httpContext.cgiGet( edtAlbRMdlCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRTara_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRTara_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRTARA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRTara_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6470AlbRTara = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
         }
         else
         {
            A6470AlbRTara = localUtil.ctond( httpContext.cgiGet( edtAlbRTara_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUniB_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUniB_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRUniB_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6471AlbRUniB = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A6471AlbRUniB", GXutil.ltrimstr( A6471AlbRUniB, 9, 2));
         }
         else
         {
            A6471AlbRUniB = localUtil.ctond( httpContext.cgiGet( edtAlbRUniB_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6471AlbRUniB", GXutil.ltrimstr( A6471AlbRUniB, 9, 2));
         }
         A6488AlbDocPrv = httpContext.cgiGet( edtAlbDocPrv_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6488AlbDocPrv", A6488AlbDocPrv);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUdas_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUdas_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUDAS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRUdas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6523AlbRUdas = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A6523AlbRUdas", GXutil.ltrimstr( A6523AlbRUdas, 9, 2));
         }
         else
         {
            A6523AlbRUdas = localUtil.ctond( httpContext.cgiGet( edtAlbRUdas_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6523AlbRUdas", GXutil.ltrimstr( A6523AlbRUdas, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlmCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlmCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlmCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4792AlmCod = (byte)(0) ;
            n4792AlmCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
         }
         else
         {
            A4792AlmCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlmCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4792AlmCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
         }
         A4793AlmNom = httpContext.cgiGet( edtAlmNom_Internalname) ;
         n4793AlmNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4793AlmNom", A4793AlmNom);
         A8023AlbColor = httpContext.cgiGet( edtAlbColor_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8023AlbColor", A8023AlbColor);
         A8024AlbOpsT = httpContext.cgiGet( edtAlbOpsT_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8024AlbOpsT", A8024AlbOpsT);
         A8025AlbOpsC = httpContext.cgiGet( edtAlbOpsC_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8025AlbOpsC", A8025AlbOpsC);
         A8026AlbOC = httpContext.cgiGet( edtAlbOC_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8026AlbOC", A8026AlbOC);
         A8027AlbHdri = httpContext.cgiGet( edtAlbHdri_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8027AlbHdri", A8027AlbHdri);
         A8028AlbNumB = httpContext.cgiGet( edtAlbNumB_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8028AlbNumB", A8028AlbNumB);
         A8029AlbNumM = httpContext.cgiGet( edtAlbNumM_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbAncC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbAncC_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBANCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbAncC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8030AlbAncC = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8030AlbAncC", GXutil.ltrimstr( A8030AlbAncC, 5, 2));
         }
         else
         {
            A8030AlbAncC = localUtil.ctond( httpContext.cgiGet( edtAlbAncC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8030AlbAncC", GXutil.ltrimstr( A8030AlbAncC, 5, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDndC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDndC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBDNDC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbDndC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8031AlbDndC = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8031AlbDndC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8031AlbDndC), 4, 0));
         }
         else
         {
            A8031AlbDndC = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbDndC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8031AlbDndC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8031AlbDndC), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbAncCr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbAncCr_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBANCCR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbAncCr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8032AlbAncCr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8032AlbAncCr", GXutil.ltrimstr( A8032AlbAncCr, 5, 2));
         }
         else
         {
            A8032AlbAncCr = localUtil.ctond( httpContext.cgiGet( edtAlbAncCr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8032AlbAncCr", GXutil.ltrimstr( A8032AlbAncCr, 5, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDndCr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDndCr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBDNDCR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbDndCr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8033AlbDndCr = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8033AlbDndCr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8033AlbDndCr), 4, 0));
         }
         else
         {
            A8033AlbDndCr = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbDndCr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8033AlbDndCr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8033AlbDndCr), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbGalga_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbGalga_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBGALGA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbGalga_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8034AlbGalga = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8034AlbGalga", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8034AlbGalga), 3, 0));
         }
         else
         {
            A8034AlbGalga = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbGalga_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8034AlbGalga", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8034AlbGalga), 3, 0));
         }
         A8035AlbMaqTej = httpContext.cgiGet( edtAlbMaqTej_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8035AlbMaqTej", A8035AlbMaqTej);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDmt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbDmt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBDMT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbDmt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8036AlbDmt = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8036AlbDmt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8036AlbDmt), 3, 0));
         }
         else
         {
            A8036AlbDmt = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbDmt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8036AlbDmt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8036AlbDmt), 3, 0));
         }
         A9793AlbPdaC = httpContext.cgiGet( edtAlbPdaC_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9793AlbPdaC", A9793AlbPdaC);
         A9794AlbOStj = httpContext.cgiGet( edtAlbOStj_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9794AlbOStj", A9794AlbOStj);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbStLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbStLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBSTLOT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbStLot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A317AlbStLot = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A317AlbStLot", GXutil.str( A317AlbStLot, 1, 0));
         }
         else
         {
            A317AlbStLot = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbStLot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A317AlbStLot", GXutil.str( A317AlbStLot, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTurno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTurno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBTURNO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbTurno_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10358AlbTurno = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10358AlbTurno", GXutil.str( A10358AlbTurno, 1, 0));
         }
         else
         {
            A10358AlbTurno = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbTurno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10358AlbTurno", GXutil.str( A10358AlbTurno, 1, 0));
         }
         A8723CliEst = httpContext.cgiGet( edtCliEst_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", A8723CliEst);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TALBRE5");
         A6183AlbrFeNf = localUtil.ctod( httpContext.cgiGet( edtAlbrFeNf_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6183AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
         forbiddenHiddens.add("AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
         forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV44Modo, "")));
         forbiddenHiddens.add("Albrfenf", localUtil.format(AV85Albrfenf, "99/99/99"));
         A48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( edtAlbRFecUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         forbiddenHiddens.add("AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("talbre5:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            AnyError = (short)(1) ;
            return  ;
         }
         forbiddenHiddens2 = new com.genexus.util.GXProperties() ;
         if ( isIns( )  )
         {
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            forbiddenHiddens2.add("AlbRPieUti", localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"));
         }
         hsh2 = httpContext.cgiGet( "hsh2") ;
         if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens2.toString(), hsh2, GXKey) )
         {
            GXutil.writeLogError("talbre5:[ CondSecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens2.toJSonString());
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
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
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
            initAll1AE7( ) ;
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
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
      }
      disableAttributes1AE7( ) ;
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

   public void confirm_1AE191( )
   {
      s1301AlbRUlin = O1301AlbRUlin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      nGXsfl_438_idx = 0 ;
      while ( nGXsfl_438_idx < nRC_GXsfl_438 )
      {
         readRow1AE191( ) ;
         if ( ( nRcdExists_191 != 0 ) || ( nIsMod_191 != 0 ) )
         {
            getKey1AE191( ) ;
            if ( ( nRcdExists_191 == 0 ) && ( nRcdDeleted_191 == 0 ) )
            {
               if ( RcdFound191 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1AE191( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1AE191( ) ;
                     closeExtendedTableCursors1AE191( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O1301AlbRUlin = A1301AlbRUlin ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
                  }
               }
               else
               {
                  GXCCtl = "ALBRLIN_" + sGXsfl_438_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbRLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound191 != 0 )
               {
                  if ( nRcdDeleted_191 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1AE191( ) ;
                     load1AE191( ) ;
                     beforeValidate1AE191( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1AE191( ) ;
                        O1301AlbRUlin = A1301AlbRUlin ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_191 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1AE191( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1AE191( ) ;
                           closeExtendedTableCursors1AE191( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O1301AlbRUlin = A1301AlbRUlin ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_191 == 0 )
                  {
                     GXCCtl = "ALBRLIN_" + sGXsfl_438_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbRLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1299AlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRObs_Internalname, GXutil.rtrim( A1300AlbRObs)) ;
         httpContext.changePostValue( "ZT_"+"Z1299AlbRLin_"+sGXsfl_438_idx, GXutil.ltrim( localUtil.ntoc( Z1299AlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1300AlbRObs_"+sGXsfl_438_idx, GXutil.rtrim( Z1300AlbRObs)) ;
         httpContext.changePostValue( "nRcdDeleted_191_"+sGXsfl_438_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_191, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_191_"+sGXsfl_438_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_191, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_191_"+sGXsfl_438_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_191, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_191 != 0 )
         {
            httpContext.changePostValue( "ALBRLIN_"+sGXsfl_438_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBROBS_"+sGXsfl_438_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O1301AlbRUlin = s1301AlbRUlin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1AE0( )
   {
   }

   public void zm1AE7( int GX_JID )
   {
      if ( ( GX_JID == 93 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z45AlbRef = T01AE5_A45AlbRef[0] ;
            Z56AlbRUni = T01AE5_A56AlbRUni[0] ;
            Z47AlbREst = T01AE5_A47AlbREst[0] ;
            Z317AlbStLot = T01AE5_A317AlbStLot[0] ;
            Z46AlbREnt = T01AE5_A46AlbREnt[0] ;
            Z52AlbRPieEnt = T01AE5_A52AlbRPieEnt[0] ;
            Z50AlbRLoc = T01AE5_A50AlbRLoc[0] ;
            Z49AlbRFen = T01AE5_A49AlbRFen[0] ;
            Z58AlbRUniEnt = T01AE5_A58AlbRUniEnt[0] ;
            Z55AlbRReo = T01AE5_A55AlbRReo[0] ;
            Z54AlbRPieUti = T01AE5_A54AlbRPieUti[0] ;
            Z53AlbRPieReb = T01AE5_A53AlbRPieReb[0] ;
            Z60AlbRUniUti = T01AE5_A60AlbRUniUti[0] ;
            Z59AlbRUniReb = T01AE5_A59AlbRUniReb[0] ;
            Z48AlbRFecUlt = T01AE5_A48AlbRFecUlt[0] ;
            Z1222AlbNumEti = T01AE5_A1222AlbNumEti[0] ;
            Z1291AlbRDes = T01AE5_A1291AlbRDes[0] ;
            Z1301AlbRUlin = T01AE5_A1301AlbRUlin[0] ;
            Z3613AlbRefDsc = T01AE5_A3613AlbRefDsc[0] ;
            Z4290AlbPmPPza = T01AE5_A4290AlbPmPPza[0] ;
            Z4920AlbRGrm2 = T01AE5_A4920AlbRGrm2[0] ;
            Z4921AlbRAnc = T01AE5_A4921AlbRAnc[0] ;
            Z4922AlbPml = T01AE5_A4922AlbPml[0] ;
            Z5743AlbRPre = T01AE5_A5743AlbRPre[0] ;
            Z5744AlbRAju = T01AE5_A5744AlbRAju[0] ;
            Z5745AlbRRep = T01AE5_A5745AlbRRep[0] ;
            Z5806AlbREnt2 = T01AE5_A5806AlbREnt2[0] ;
            Z6178AlbrUsu = T01AE5_A6178AlbrUsu[0] ;
            Z6179AlbrHor = T01AE5_A6179AlbrHor[0] ;
            Z6180AlbrUniC = T01AE5_A6180AlbrUniC[0] ;
            Z6181AlbrPieC = T01AE5_A6181AlbrPieC[0] ;
            Z6182AlbrNF = T01AE5_A6182AlbrNF[0] ;
            Z6183AlbrFeNf = T01AE5_A6183AlbrFeNf[0] ;
            Z6184AlbrCfop = T01AE5_A6184AlbrCfop[0] ;
            Z3359AlbRDisCli = T01AE5_A3359AlbRDisCli[0] ;
            Z3360AlbRImp = T01AE5_A3360AlbRImp[0] ;
            Z6463AlbRLote = T01AE5_A6463AlbRLote[0] ;
            Z6464AlbRTelar = T01AE5_A6464AlbRTelar[0] ;
            Z6465AlbRLu = T01AE5_A6465AlbRLu[0] ;
            Z4602AlbRMdlCod = T01AE5_A4602AlbRMdlCod[0] ;
            Z6470AlbRTara = T01AE5_A6470AlbRTara[0] ;
            Z6471AlbRUniB = T01AE5_A6471AlbRUniB[0] ;
            Z6488AlbDocPrv = T01AE5_A6488AlbDocPrv[0] ;
            Z6523AlbRUdas = T01AE5_A6523AlbRUdas[0] ;
            Z8023AlbColor = T01AE5_A8023AlbColor[0] ;
            Z8024AlbOpsT = T01AE5_A8024AlbOpsT[0] ;
            Z8025AlbOpsC = T01AE5_A8025AlbOpsC[0] ;
            Z8026AlbOC = T01AE5_A8026AlbOC[0] ;
            Z8027AlbHdri = T01AE5_A8027AlbHdri[0] ;
            Z8028AlbNumB = T01AE5_A8028AlbNumB[0] ;
            Z8029AlbNumM = T01AE5_A8029AlbNumM[0] ;
            Z8030AlbAncC = T01AE5_A8030AlbAncC[0] ;
            Z8031AlbDndC = T01AE5_A8031AlbDndC[0] ;
            Z8032AlbAncCr = T01AE5_A8032AlbAncCr[0] ;
            Z8033AlbDndCr = T01AE5_A8033AlbDndCr[0] ;
            Z8034AlbGalga = T01AE5_A8034AlbGalga[0] ;
            Z8035AlbMaqTej = T01AE5_A8035AlbMaqTej[0] ;
            Z8036AlbDmt = T01AE5_A8036AlbDmt[0] ;
            Z9793AlbPdaC = T01AE5_A9793AlbPdaC[0] ;
            Z9794AlbOStj = T01AE5_A9794AlbOStj[0] ;
            Z10358AlbTurno = T01AE5_A10358AlbTurno[0] ;
            Z6263AlbRTartC = T01AE5_A6263AlbRTartC[0] ;
            Z840TrnCod = T01AE5_A840TrnCod[0] ;
            Z970ProceCod = T01AE5_A970ProceCod[0] ;
            Z1211TipEntCod = T01AE5_A1211TipEntCod[0] ;
            Z4792AlmCod = T01AE5_A4792AlmCod[0] ;
         }
         else
         {
            Z45AlbRef = A45AlbRef ;
            Z56AlbRUni = A56AlbRUni ;
            Z47AlbREst = A47AlbREst ;
            Z317AlbStLot = A317AlbStLot ;
            Z46AlbREnt = A46AlbREnt ;
            Z52AlbRPieEnt = A52AlbRPieEnt ;
            Z50AlbRLoc = A50AlbRLoc ;
            Z49AlbRFen = A49AlbRFen ;
            Z58AlbRUniEnt = A58AlbRUniEnt ;
            Z55AlbRReo = A55AlbRReo ;
            Z54AlbRPieUti = A54AlbRPieUti ;
            Z53AlbRPieReb = A53AlbRPieReb ;
            Z60AlbRUniUti = A60AlbRUniUti ;
            Z59AlbRUniReb = A59AlbRUniReb ;
            Z48AlbRFecUlt = A48AlbRFecUlt ;
            Z1222AlbNumEti = A1222AlbNumEti ;
            Z1291AlbRDes = A1291AlbRDes ;
            Z1301AlbRUlin = A1301AlbRUlin ;
            Z3613AlbRefDsc = A3613AlbRefDsc ;
            Z4290AlbPmPPza = A4290AlbPmPPza ;
            Z4920AlbRGrm2 = A4920AlbRGrm2 ;
            Z4921AlbRAnc = A4921AlbRAnc ;
            Z4922AlbPml = A4922AlbPml ;
            Z5743AlbRPre = A5743AlbRPre ;
            Z5744AlbRAju = A5744AlbRAju ;
            Z5745AlbRRep = A5745AlbRRep ;
            Z5806AlbREnt2 = A5806AlbREnt2 ;
            Z6178AlbrUsu = A6178AlbrUsu ;
            Z6179AlbrHor = A6179AlbrHor ;
            Z6180AlbrUniC = A6180AlbrUniC ;
            Z6181AlbrPieC = A6181AlbrPieC ;
            Z6182AlbrNF = A6182AlbrNF ;
            Z6183AlbrFeNf = A6183AlbrFeNf ;
            Z6184AlbrCfop = A6184AlbrCfop ;
            Z3359AlbRDisCli = A3359AlbRDisCli ;
            Z3360AlbRImp = A3360AlbRImp ;
            Z6463AlbRLote = A6463AlbRLote ;
            Z6464AlbRTelar = A6464AlbRTelar ;
            Z6465AlbRLu = A6465AlbRLu ;
            Z4602AlbRMdlCod = A4602AlbRMdlCod ;
            Z6470AlbRTara = A6470AlbRTara ;
            Z6471AlbRUniB = A6471AlbRUniB ;
            Z6488AlbDocPrv = A6488AlbDocPrv ;
            Z6523AlbRUdas = A6523AlbRUdas ;
            Z8023AlbColor = A8023AlbColor ;
            Z8024AlbOpsT = A8024AlbOpsT ;
            Z8025AlbOpsC = A8025AlbOpsC ;
            Z8026AlbOC = A8026AlbOC ;
            Z8027AlbHdri = A8027AlbHdri ;
            Z8028AlbNumB = A8028AlbNumB ;
            Z8029AlbNumM = A8029AlbNumM ;
            Z8030AlbAncC = A8030AlbAncC ;
            Z8031AlbDndC = A8031AlbDndC ;
            Z8032AlbAncCr = A8032AlbAncCr ;
            Z8033AlbDndCr = A8033AlbDndCr ;
            Z8034AlbGalga = A8034AlbGalga ;
            Z8035AlbMaqTej = A8035AlbMaqTej ;
            Z8036AlbDmt = A8036AlbDmt ;
            Z9793AlbPdaC = A9793AlbPdaC ;
            Z9794AlbOStj = A9794AlbOStj ;
            Z10358AlbTurno = A10358AlbTurno ;
            Z6263AlbRTartC = A6263AlbRTartC ;
            Z840TrnCod = A840TrnCod ;
            Z970ProceCod = A970ProceCod ;
            Z1211TipEntCod = A1211TipEntCod ;
            Z4792AlmCod = A4792AlmCod ;
         }
      }
      if ( GX_JID == -93 )
      {
         Z44AlbRecCod = A44AlbRecCod ;
         Z252CliCod = A252CliCod ;
         Z45AlbRef = A45AlbRef ;
         Z56AlbRUni = A56AlbRUni ;
         Z47AlbREst = A47AlbREst ;
         Z317AlbStLot = A317AlbStLot ;
         Z46AlbREnt = A46AlbREnt ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z50AlbRLoc = A50AlbRLoc ;
         Z49AlbRFen = A49AlbRFen ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z55AlbRReo = A55AlbRReo ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z53AlbRPieReb = A53AlbRPieReb ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z59AlbRUniReb = A59AlbRUniReb ;
         Z48AlbRFecUlt = A48AlbRFecUlt ;
         Z1222AlbNumEti = A1222AlbNumEti ;
         Z1291AlbRDes = A1291AlbRDes ;
         Z1301AlbRUlin = A1301AlbRUlin ;
         Z3613AlbRefDsc = A3613AlbRefDsc ;
         Z4290AlbPmPPza = A4290AlbPmPPza ;
         Z4920AlbRGrm2 = A4920AlbRGrm2 ;
         Z4921AlbRAnc = A4921AlbRAnc ;
         Z4922AlbPml = A4922AlbPml ;
         Z5743AlbRPre = A5743AlbRPre ;
         Z5744AlbRAju = A5744AlbRAju ;
         Z5745AlbRRep = A5745AlbRRep ;
         Z5806AlbREnt2 = A5806AlbREnt2 ;
         Z6178AlbrUsu = A6178AlbrUsu ;
         Z6179AlbrHor = A6179AlbrHor ;
         Z6180AlbrUniC = A6180AlbrUniC ;
         Z6181AlbrPieC = A6181AlbrPieC ;
         Z6182AlbrNF = A6182AlbrNF ;
         Z6183AlbrFeNf = A6183AlbrFeNf ;
         Z6184AlbrCfop = A6184AlbrCfop ;
         Z3359AlbRDisCli = A3359AlbRDisCli ;
         Z3360AlbRImp = A3360AlbRImp ;
         Z6463AlbRLote = A6463AlbRLote ;
         Z6464AlbRTelar = A6464AlbRTelar ;
         Z6465AlbRLu = A6465AlbRLu ;
         Z4602AlbRMdlCod = A4602AlbRMdlCod ;
         Z6470AlbRTara = A6470AlbRTara ;
         Z6471AlbRUniB = A6471AlbRUniB ;
         Z6488AlbDocPrv = A6488AlbDocPrv ;
         Z6523AlbRUdas = A6523AlbRUdas ;
         Z8023AlbColor = A8023AlbColor ;
         Z8024AlbOpsT = A8024AlbOpsT ;
         Z8025AlbOpsC = A8025AlbOpsC ;
         Z8026AlbOC = A8026AlbOC ;
         Z8027AlbHdri = A8027AlbHdri ;
         Z8028AlbNumB = A8028AlbNumB ;
         Z8029AlbNumM = A8029AlbNumM ;
         Z8030AlbAncC = A8030AlbAncC ;
         Z8031AlbDndC = A8031AlbDndC ;
         Z8032AlbAncCr = A8032AlbAncCr ;
         Z8033AlbDndCr = A8033AlbDndCr ;
         Z8034AlbGalga = A8034AlbGalga ;
         Z8035AlbMaqTej = A8035AlbMaqTej ;
         Z8036AlbDmt = A8036AlbDmt ;
         Z9793AlbPdaC = A9793AlbPdaC ;
         Z9794AlbOStj = A9794AlbOStj ;
         Z10358AlbTurno = A10358AlbTurno ;
         Z396EmprCod = A396EmprCod ;
         Z6263AlbRTartC = A6263AlbRTartC ;
         Z840TrnCod = A840TrnCod ;
         Z970ProceCod = A970ProceCod ;
         Z1211TipEntCod = A1211TipEntCod ;
         Z4792AlmCod = A4792AlmCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z8723CliEst = A8723CliEst ;
         Z841TrnNom = A841TrnNom ;
         Z1212TipEntNom = A1212TipEntNom ;
         Z971ProceNom = A971ProceNom ;
         Z6264AlbRTartD = A6264AlbRTartD ;
         Z4793AlmNom = A4793AlmNom ;
      }
   }

   public void standaloneNotModal( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      edtAlbrFeNf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrFeNf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrFeNf_Enabled), 5, 0), true);
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbRUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUlin_Enabled), 5, 0), true);
      edtAlbRefDsc_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), true);
      edtAlbRTartC_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRTartC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTartC_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      AV168Pgmname = "TALBRE5" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV168Pgmname", AV168Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbrFeNf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrFeNf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrFeNf_Enabled), 5, 0), true);
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbRUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUlin_Enabled), 5, 0), true);
      AV83AlbReccod = A44AlbRecCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83AlbReccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83AlbReccod), 8, 0));
      AV97Doc_6 = A44AlbRecCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97Doc_6", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97Doc_6), 6, 0));
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         AV44Modo = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44Modo", AV44Modo);
      }
      else
      {
         if ( isUpd( )  && true /* Level */ )
         {
            AV44Modo = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44Modo", AV44Modo);
         }
         else
         {
            if ( isDlt( )  && true /* Level */ )
            {
               AV44Modo = httpContext.getMessage( httpContext.getMessage( "DEL", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44Modo", AV44Modo);
            }
         }
      }
      if ( isIns( )  )
      {
         edtAlbRPieUti_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRPieUti_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      }
      if ( isIns( )  )
      {
         edtAlbRUniUti_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRUniUti_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      }
      if ( isIns( )  )
      {
         edtAlbRPieUti_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      }
      if ( isIns( )  )
      {
         edtAlbRUniUti_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      }
      if ( isIns( )  )
      {
         A56AlbRUni = AV163Unidades ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      if ( isIns( )  )
      {
         A45AlbRef = AV88AlbRef ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      }
      if ( isIns( )  && (GXutil.strcmp("", A50AlbRLoc)==0) && ( Gx_BScreen == 0 ) )
      {
         A50AlbRLoc = AV164vDisLoc ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A49AlbRFen)) && ( Gx_BScreen == 0 ) )
      {
         A49AlbRFen = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6183AlbrFeNf)) && ( Gx_BScreen == 0 ) )
      {
         A6183AlbrFeNf = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6183AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
      }
      if ( isIns( )  && (GXutil.strcmp("", A55AlbRReo)==0) && ( Gx_BScreen == 0 ) )
      {
         A55AlbRReo = httpContext.getMessage( httpContext.getMessage( "NO", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A48AlbRFecUlt)) && ( Gx_BScreen == 0 ) )
      {
         A48AlbRFecUlt = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      }
      if ( isIns( )  && (GXutil.strcmp("", A6182AlbrNF)==0) && ( Gx_BScreen == 0 ) )
      {
         A6182AlbrNF = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", A6182AlbrNF);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A6179AlbrHor) && ( Gx_BScreen == 0 ) )
      {
         A6179AlbrHor = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( isIns( )  && (GXutil.strcmp("", A3360AlbRImp)==0) && ( Gx_BScreen == 0 ) )
      {
         A3360AlbRImp = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A3360AlbRImp", A3360AlbRImp);
      }
      if ( isIns( )  && (GXutil.strcmp("", A4602AlbRMdlCod)==0) && ( Gx_BScreen == 0 ) )
      {
         A4602AlbRMdlCod = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
      }
      if ( isIns( )  && (GXutil.strcmp("", A6463AlbRLote)==0) && ( Gx_BScreen == 0 ) )
      {
         A6463AlbRLote = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
      }
      if ( isIns( )  && (GXutil.strcmp("", A6464AlbRTelar)==0) && ( Gx_BScreen == 0 ) )
      {
         A6464AlbRTelar = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6465AlbRLu)==0) && ( Gx_BScreen == 0 ) )
      {
         A6465AlbRLu = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6470AlbRTara)==0) && ( Gx_BScreen == 0 ) )
      {
         A6470AlbRTara = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6471AlbRUniB)==0) && ( Gx_BScreen == 0 ) )
      {
         A6471AlbRUniB = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6471AlbRUniB", GXutil.ltrimstr( A6471AlbRUniB, 9, 2));
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6523AlbRUdas)==0) && ( Gx_BScreen == 0 ) )
      {
         A6523AlbRUdas = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6523AlbRUdas", GXutil.ltrimstr( A6523AlbRUdas, 9, 2));
      }
      if ( isIns( )  && (GXutil.strcmp("", A6178AlbrUsu)==0) && ( Gx_BScreen == 0 ) )
      {
         A6178AlbrUsu = AV17UsurCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A6178AlbrUsu", A6178AlbrUsu);
      }
      AV85Albrfenf = A6183AlbrFeNf ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85Albrfenf", localUtil.format(AV85Albrfenf, "99/99/99"));
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         AV96albrfen = A49AlbRFen ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96albrfen", localUtil.format(AV96albrfen, "99/99/99"));
         AV92albrreo = A55AlbRReo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV92albrreo", AV92albrreo);
         AV93albrnf = A6182AlbrNF ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93albrnf", AV93albrnf);
      }
   }

   public void load1AE7( )
   {
      /* Using cursor T01AE13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A45AlbRef = T01AE13_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A56AlbRUni = T01AE13_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A47AlbREst = T01AE13_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A317AlbStLot = T01AE13_A317AlbStLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A317AlbStLot", GXutil.str( A317AlbStLot, 1, 0));
         A407EmprNom = T01AE13_A407EmprNom[0] ;
         n407EmprNom = T01AE13_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01AE13_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A841TrnNom = T01AE13_A841TrnNom[0] ;
         n841TrnNom = T01AE13_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A46AlbREnt = T01AE13_A46AlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A52AlbRPieEnt = T01AE13_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A50AlbRLoc = T01AE13_A50AlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         A49AlbRFen = T01AE13_A49AlbRFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         A58AlbRUniEnt = T01AE13_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A55AlbRReo = T01AE13_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A54AlbRPieUti = T01AE13_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A53AlbRPieReb = T01AE13_A53AlbRPieReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         A60AlbRUniUti = T01AE13_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A59AlbRUniReb = T01AE13_A59AlbRUniReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
         A48AlbRFecUlt = T01AE13_A48AlbRFecUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         A1212TipEntNom = T01AE13_A1212TipEntNom[0] ;
         n1212TipEntNom = T01AE13_n1212TipEntNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
         A1222AlbNumEti = T01AE13_A1222AlbNumEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         A1291AlbRDes = T01AE13_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A971ProceNom = T01AE13_A971ProceNom[0] ;
         n971ProceNom = T01AE13_n971ProceNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         A1301AlbRUlin = T01AE13_A1301AlbRUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         A3613AlbRefDsc = T01AE13_A3613AlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A4290AlbPmPPza = T01AE13_A4290AlbPmPPza[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
         A4920AlbRGrm2 = T01AE13_A4920AlbRGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = T01AE13_A4921AlbRAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A4922AlbPml = T01AE13_A4922AlbPml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
         A5743AlbRPre = T01AE13_A5743AlbRPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5743AlbRPre", GXutil.ltrimstr( A5743AlbRPre, 12, 5));
         A5744AlbRAju = T01AE13_A5744AlbRAju[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5744AlbRAju", GXutil.ltrimstr( A5744AlbRAju, 8, 2));
         A5745AlbRRep = T01AE13_A5745AlbRRep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5745AlbRRep", GXutil.str( A5745AlbRRep, 1, 0));
         A5806AlbREnt2 = T01AE13_A5806AlbREnt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         A6178AlbrUsu = T01AE13_A6178AlbrUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6178AlbrUsu", A6178AlbrUsu);
         A6179AlbrHor = T01AE13_A6179AlbrHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6180AlbrUniC = T01AE13_A6180AlbrUniC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
         A6181AlbrPieC = T01AE13_A6181AlbrPieC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
         A6182AlbrNF = T01AE13_A6182AlbrNF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", A6182AlbrNF);
         A6183AlbrFeNf = T01AE13_A6183AlbrFeNf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6183AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
         A6184AlbrCfop = T01AE13_A6184AlbrCfop[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6184AlbrCfop", A6184AlbrCfop);
         A3359AlbRDisCli = T01AE13_A3359AlbRDisCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3359AlbRDisCli", A3359AlbRDisCli);
         A6264AlbRTartD = T01AE13_A6264AlbRTartD[0] ;
         n6264AlbRTartD = T01AE13_n6264AlbRTartD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
         A3360AlbRImp = T01AE13_A3360AlbRImp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3360AlbRImp", A3360AlbRImp);
         A6463AlbRLote = T01AE13_A6463AlbRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A6464AlbRTelar = T01AE13_A6464AlbRTelar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
         A6465AlbRLu = T01AE13_A6465AlbRLu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
         A4602AlbRMdlCod = T01AE13_A4602AlbRMdlCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
         A6470AlbRTara = T01AE13_A6470AlbRTara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
         A6471AlbRUniB = T01AE13_A6471AlbRUniB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6471AlbRUniB", GXutil.ltrimstr( A6471AlbRUniB, 9, 2));
         A6488AlbDocPrv = T01AE13_A6488AlbDocPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6488AlbDocPrv", A6488AlbDocPrv);
         A6523AlbRUdas = T01AE13_A6523AlbRUdas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6523AlbRUdas", GXutil.ltrimstr( A6523AlbRUdas, 9, 2));
         A4793AlmNom = T01AE13_A4793AlmNom[0] ;
         n4793AlmNom = T01AE13_n4793AlmNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4793AlmNom", A4793AlmNom);
         A8023AlbColor = T01AE13_A8023AlbColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8023AlbColor", A8023AlbColor);
         A8024AlbOpsT = T01AE13_A8024AlbOpsT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8024AlbOpsT", A8024AlbOpsT);
         A8025AlbOpsC = T01AE13_A8025AlbOpsC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8025AlbOpsC", A8025AlbOpsC);
         A8026AlbOC = T01AE13_A8026AlbOC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8026AlbOC", A8026AlbOC);
         A8027AlbHdri = T01AE13_A8027AlbHdri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8027AlbHdri", A8027AlbHdri);
         A8028AlbNumB = T01AE13_A8028AlbNumB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8028AlbNumB", A8028AlbNumB);
         A8029AlbNumM = T01AE13_A8029AlbNumM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
         A8030AlbAncC = T01AE13_A8030AlbAncC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8030AlbAncC", GXutil.ltrimstr( A8030AlbAncC, 5, 2));
         A8031AlbDndC = T01AE13_A8031AlbDndC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8031AlbDndC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8031AlbDndC), 4, 0));
         A8032AlbAncCr = T01AE13_A8032AlbAncCr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8032AlbAncCr", GXutil.ltrimstr( A8032AlbAncCr, 5, 2));
         A8033AlbDndCr = T01AE13_A8033AlbDndCr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8033AlbDndCr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8033AlbDndCr), 4, 0));
         A8034AlbGalga = T01AE13_A8034AlbGalga[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8034AlbGalga", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8034AlbGalga), 3, 0));
         A8035AlbMaqTej = T01AE13_A8035AlbMaqTej[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8035AlbMaqTej", A8035AlbMaqTej);
         A8036AlbDmt = T01AE13_A8036AlbDmt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8036AlbDmt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8036AlbDmt), 3, 0));
         A9793AlbPdaC = T01AE13_A9793AlbPdaC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9793AlbPdaC", A9793AlbPdaC);
         A9794AlbOStj = T01AE13_A9794AlbOStj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9794AlbOStj", A9794AlbOStj);
         A10358AlbTurno = T01AE13_A10358AlbTurno[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10358AlbTurno", GXutil.str( A10358AlbTurno, 1, 0));
         A8723CliEst = T01AE13_A8723CliEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", A8723CliEst);
         A6263AlbRTartC = T01AE13_A6263AlbRTartC[0] ;
         n6263AlbRTartC = T01AE13_n6263AlbRTartC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         A840TrnCod = T01AE13_A840TrnCod[0] ;
         n840TrnCod = T01AE13_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A970ProceCod = T01AE13_A970ProceCod[0] ;
         n970ProceCod = T01AE13_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A1211TipEntCod = T01AE13_A1211TipEntCod[0] ;
         n1211TipEntCod = T01AE13_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         A4792AlmCod = T01AE13_A4792AlmCod[0] ;
         n4792AlmCod = T01AE13_n4792AlmCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
         zm1AE7( -93) ;
      }
      pr_default.close(11);
      onLoadActions1AE7( ) ;
   }

   public void onLoadActions1AE7( )
   {
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      AV89Albrpieent = A52AlbRPieEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Albrpieent", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Albrpieent), 6, 0));
      AV141PieEntold = O52AlbRPieEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV141PieEntold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV141PieEntold), 6, 0));
      AV156oldpiee = O52AlbRPieEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV156oldpiee", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV156oldpiee), 6, 0));
      AV96albrfen = A49AlbRFen ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96albrfen", localUtil.format(AV96albrfen, "99/99/99"));
      if ( A4290AlbPmPPza.doubleValue() > 0 )
      {
         A4291AlbPzaEst = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A58AlbRUniEnt.divide(A4290AlbPmPPza, 18, java.math.RoundingMode.DOWN), 0))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
      }
      else
      {
         A4291AlbPzaEst = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
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
      AV69ALbRunient = A58AlbRUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69ALbRunient", GXutil.ltrimstr( AV69ALbRunient, 9, 2));
      AV142UniENtold = O58AlbRUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV142UniENtold", GXutil.ltrimstr( AV142UniENtold, 9, 2));
      AV154Oldunie = O58AlbRUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV154Oldunie", GXutil.ltrimstr( AV154Oldunie, 9, 2));
      AV92albrreo = A55AlbRReo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92albrreo", AV92albrreo);
      AV157oldpieu = O54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "AV157oldpieu", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV157oldpieu), 6, 0));
      AV155olduniu = O60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "AV155olduniu", GXutil.ltrimstr( AV155olduniu, 9, 2));
      AV95TipEntCod = A1211TipEntCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95TipEntCod), 4, 0));
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtTipEntCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTipEntCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtAlbRLoc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRLoc_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtAlbRef_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRef_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtAlbRFen_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRFen_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         cmbAlbRUni.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      }
      else
      {
         cmbAlbRUni.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         cmbAlbRReo.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      }
      else
      {
         cmbAlbRReo.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      }
      AV87Procecod = A970ProceCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87Procecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87Procecod), 4, 0));
      AV90Albrpre = A5743AlbRPre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90Albrpre", GXutil.ltrimstr( AV90Albrpre, 12, 5));
      AV93albrnf = A6182AlbrNF ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93albrnf", AV93albrnf);
      AV91albrcfop = A6184AlbrCfop ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91albrcfop", AV91albrcfop);
      if ( isIns( )  && true /* Level */ )
      {
         A317AlbStLot = AV149AlbStLot ;
         httpContext.ajax_rsp_assign_attri("", false, "A317AlbStLot", GXutil.str( A317AlbStLot, 1, 0));
      }
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         A47AlbREst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( A57AlbRUniDis.doubleValue() == 0 )
         {
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( A57AlbRUniDis.doubleValue() != 0 )
            {
               A47AlbREst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
         }
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6180AlbrUniC)==0) && ( Gx_BScreen == 0 ) )
      {
         A6180AlbrUniC = A58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
      }
      if ( isIns( )  && (0==A6181AlbrPieC) && ( Gx_BScreen == 0 ) )
      {
         A6181AlbrPieC = A52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
      }
      if ( true )
      {
         AV84Documento = GXutil.str( AV97Doc_6, 6, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84Documento", AV84Documento);
      }
      else
      {
         if ( ! (GXutil.strcmp("", A46AlbREnt)==0) )
         {
            AV84Documento = GXutil.substring( A46AlbREnt, 1, 6) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84Documento", AV84Documento);
         }
      }
      if ( A47AlbREst == 1 )
      {
         AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         }
      }
      AV94AlbRunic = A6180AlbrUniC ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94AlbRunic", GXutil.ltrimstr( AV94AlbRunic, 9, 2));
   }

   public void checkExtendedTable1AE7( )
   {
      nIsDirty_7 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01AE6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01AE6_A407EmprNom[0] ;
      n407EmprNom = T01AE6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T01AE7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01AE7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A8723CliEst = T01AE7_A8723CliEst[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", A8723CliEst);
      pr_default.close(5);
      /* Using cursor T01AE8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A6263AlbRTartC) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo de Articulo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRTARTC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6264AlbRTartD = T01AE8_A6264AlbRTartD[0] ;
      n6264AlbRTartD = T01AE8_n6264AlbRTartD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
      pr_default.close(6);
      /* Using cursor T01AE9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01AE9_A841TrnNom[0] ;
      n841TrnNom = T01AE9_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      pr_default.close(7);
      /* Using cursor T01AE10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A971ProceNom = T01AE10_A971ProceNom[0] ;
      n971ProceNom = T01AE10_n971ProceNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      pr_default.close(8);
      /* Using cursor T01AE11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1212TipEntNom = T01AE11_A1212TipEntNom[0] ;
      n1212TipEntNom = T01AE11_n1212TipEntNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
      pr_default.close(9);
      /* Using cursor T01AE12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A4792AlmCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Almacen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A4793AlmNom = T01AE12_A4793AlmNom[0] ;
      n4793AlmNom = T01AE12_n4793AlmNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4793AlmNom", A4793AlmNom);
      pr_default.close(10);
      if ( ( AV159CtrlArt == 1 ) && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) && true /* Level */ )
      {
         GXv_int1[0] = AV50FlagArt ;
         new app.core.pexiser(remoteHandle, context).execute( A396EmprCod, A252CliCod, A45AlbRef, GXv_int1) ;
         talbre5_impl.this.AV50FlagArt = (byte)((byte)(GXv_int1[0])) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50FlagArt", GXutil.str( AV50FlagArt, 1, 0));
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) )
      {
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char4[0] = A45AlbRef ;
         GXv_char5[0] = A3613AlbRefDsc ;
         GXv_int6[0] = AV63Flag_artc ;
         new app.pbusard(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5, GXv_int6) ;
         talbre5_impl.this.A396EmprCod = GXv_char2[0] ;
         talbre5_impl.this.A252CliCod = GXv_int3[0] ;
         talbre5_impl.this.A45AlbRef = GXv_char4[0] ;
         talbre5_impl.this.A3613AlbRefDsc = GXv_char5[0] ;
         talbre5_impl.this.AV63Flag_artc = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         httpContext.ajax_rsp_assign_attri("", false, "AV63Flag_artc", GXutil.str( AV63Flag_artc, 1, 0));
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) && ( AV112Moda21 == 0 ) )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char4[0] = A45AlbRef ;
         GXv_char2[0] = A6264AlbRTartD ;
         GXv_char7[0] = AV74Compos ;
         GXv_int1[0] = A6263AlbRTartC ;
         GXv_decimal8[0] = A6465AlbRLu ;
         new app.pbusar4(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_char4, GXv_char2, GXv_char7, GXv_int1, GXv_decimal8) ;
         talbre5_impl.this.A396EmprCod = GXv_char5[0] ;
         talbre5_impl.this.A252CliCod = GXv_int3[0] ;
         talbre5_impl.this.A45AlbRef = GXv_char4[0] ;
         talbre5_impl.this.A6264AlbRTartD = GXv_char2[0] ;
         talbre5_impl.this.AV74Compos = GXv_char7[0] ;
         talbre5_impl.this.A6263AlbRTartC = GXv_int1[0] ;
         talbre5_impl.this.A6465AlbRLu = GXv_decimal8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
         httpContext.ajax_rsp_assign_attri("", false, "AV74Compos", AV74Compos);
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) && ( AV77Kohler == 0 ) && isIns( )  )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char5[0] = A45AlbRef ;
         GXv_int1[0] = A4920AlbRGrm2 ;
         GXv_int9[0] = A4921AlbRAnc ;
         new app.pbusar5(remoteHandle, context).execute( GXv_char7, GXv_int3, GXv_char5, GXv_int1, GXv_int9) ;
         talbre5_impl.this.A396EmprCod = GXv_char7[0] ;
         talbre5_impl.this.A252CliCod = GXv_int3[0] ;
         talbre5_impl.this.A45AlbRef = GXv_char5[0] ;
         talbre5_impl.this.A4920AlbRGrm2 = GXv_int1[0] ;
         talbre5_impl.this.A4921AlbRAnc = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
      }
      nIsDirty_7 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      AV89Albrpieent = A52AlbRPieEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Albrpieent", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Albrpieent), 6, 0));
      AV141PieEntold = O52AlbRPieEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV141PieEntold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV141PieEntold), 6, 0));
      AV156oldpiee = O52AlbRPieEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV156oldpiee", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV156oldpiee), 6, 0));
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A58AlbRUniEnt)==0) || (0==A52AlbRPieEnt) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Tiene que entrar Unidades o Piezas", ""), 1, "ALBRPIEENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRPieEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) || ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbRUni.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV96albrfen = A49AlbRFen ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96albrfen", localUtil.format(AV96albrfen, "99/99/99"));
      if ( A4290AlbPmPPza.doubleValue() > 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A4291AlbPzaEst = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A58AlbRUniEnt.divide(A4290AlbPmPPza, 18, java.math.RoundingMode.DOWN), 0))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
      }
      else
      {
         nIsDirty_7 = (short)(1) ;
         A4291AlbPzaEst = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
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
      AV69ALbRunient = A58AlbRUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69ALbRunient", GXutil.ltrimstr( AV69ALbRunient, 9, 2));
      AV142UniENtold = O58AlbRUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV142UniENtold", GXutil.ltrimstr( AV142UniENtold, 9, 2));
      AV154Oldunie = O58AlbRUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV154Oldunie", GXutil.ltrimstr( AV154Oldunie, 9, 2));
      if ( ! ( ( GXutil.strcmp(A55AlbRReo, "SI") == 0 ) || ( GXutil.strcmp(A55AlbRReo, "NO") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Reclamacion?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRREO");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbRReo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV92albrreo = A55AlbRReo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92albrreo", AV92albrreo);
      AV157oldpieu = O54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "AV157oldpieu", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV157oldpieu), 6, 0));
      AV155olduniu = O60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "AV155olduniu", GXutil.ltrimstr( AV155olduniu, 9, 2));
      AV95TipEntCod = A1211TipEntCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95TipEntCod), 4, 0));
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtTipEntCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTipEntCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtAlbRLoc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRLoc_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtAlbRef_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRef_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtAlbRFen_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRFen_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         cmbAlbRUni.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      }
      else
      {
         cmbAlbRUni.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         cmbAlbRReo.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      }
      else
      {
         cmbAlbRReo.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      }
      AV87Procecod = A970ProceCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87Procecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87Procecod), 4, 0));
      AV90Albrpre = A5743AlbRPre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90Albrpre", GXutil.ltrimstr( AV90Albrpre, 12, 5));
      AV93albrnf = A6182AlbrNF ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93albrnf", AV93albrnf);
      AV91albrcfop = A6184AlbrCfop ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91albrcfop", AV91albrcfop);
      if ( ! ( ( GXutil.strcmp(A3360AlbRImp, "S") == 0 ) || ( GXutil.strcmp(A3360AlbRImp, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Albaran Impreso ?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRIMP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRImp_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV103Erfoc == 1 ) && ( ( GXutil.strcmp(A6463AlbRLote, " ") != 0 ) && ( GXutil.strcmp(A4602AlbRMdlCod, " ") != 0 ) && ( GXutil.strcmp(A6464AlbRTelar, " ") != 0 ) ) && true /* After */ && true /* Level */ && isIns( )  )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_char5[0] = A6463AlbRLote ;
         GXv_char4[0] = A4602AlbRMdlCod ;
         GXv_char2[0] = A6464AlbRTelar ;
         GXv_int6[0] = AV149AlbStLot ;
         new app.pctrlote(remoteHandle, context).execute( GXv_char7, GXv_char5, GXv_char4, GXv_char2, GXv_int6) ;
         talbre5_impl.this.A396EmprCod = GXv_char7[0] ;
         talbre5_impl.this.A6463AlbRLote = GXv_char5[0] ;
         talbre5_impl.this.A4602AlbRMdlCod = GXv_char4[0] ;
         talbre5_impl.this.A6464AlbRTelar = GXv_char2[0] ;
         talbre5_impl.this.AV149AlbStLot = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
         httpContext.ajax_rsp_assign_attri("", false, "AV149AlbStLot", GXutil.str( AV149AlbStLot, 1, 0));
      }
      if ( isIns( )  && true /* Level */ )
      {
         nIsDirty_7 = (short)(1) ;
         A317AlbStLot = AV149AlbStLot ;
         httpContext.ajax_rsp_assign_attri("", false, "A317AlbStLot", GXutil.str( A317AlbStLot, 1, 0));
      }
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_7 = (short)(1) ;
         A47AlbREst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( A57AlbRUniDis.doubleValue() == 0 )
         {
            nIsDirty_7 = (short)(1) ;
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( A57AlbRUniDis.doubleValue() != 0 )
            {
               nIsDirty_7 = (short)(1) ;
               A47AlbREst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
         }
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6180AlbrUniC)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_7 = (short)(1) ;
         A6180AlbrUniC = A58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
      }
      if ( isIns( )  && (0==A6181AlbrPieC) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_7 = (short)(1) ;
         A6181AlbrPieC = A52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
      }
      if ( true )
      {
         AV84Documento = GXutil.str( AV97Doc_6, 6, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84Documento", AV84Documento);
      }
      else
      {
         if ( ! (GXutil.strcmp("", A46AlbREnt)==0) )
         {
            AV84Documento = GXutil.substring( A46AlbREnt, 1, 6) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84Documento", AV84Documento);
         }
      }
      if ( ! ( ( A47AlbREst == 0 ) || ( A47AlbREst == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Estado", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBREST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbREst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( A47AlbREst == 1 )
      {
         AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         }
      }
      AV94AlbRunic = A6180AlbrUniC ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94AlbRunic", GXutil.ltrimstr( AV94AlbRunic, 9, 2));
   }

   public void closeExtendedTableCursors1AE7( )
   {
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void gxload_94( String A396EmprCod )
   {
      /* Using cursor T01AE14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01AE14_A407EmprNom[0] ;
      n407EmprNom = T01AE14_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_95( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01AE15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01AE15_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A8723CliEst = T01AE15_A8723CliEst[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", A8723CliEst);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8723CliEst))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_96( String A396EmprCod ,
                          short A6263AlbRTartC )
   {
      /* Using cursor T01AE16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A6263AlbRTartC) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo de Articulo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRTARTC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6264AlbRTartD = T01AE16_A6264AlbRTartD[0] ;
      n6264AlbRTartD = T01AE16_n6264AlbRTartD[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6264AlbRTartD))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_97( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01AE17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01AE17_A841TrnNom[0] ;
      n841TrnNom = T01AE17_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_98( String A396EmprCod ,
                          short A970ProceCod )
   {
      /* Using cursor T01AE18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A971ProceNom = T01AE18_A971ProceNom[0] ;
      n971ProceNom = T01AE18_n971ProceNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A971ProceNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_99( String A396EmprCod ,
                          short A1211TipEntCod )
   {
      /* Using cursor T01AE19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1212TipEntNom = T01AE19_A1212TipEntNom[0] ;
      n1212TipEntNom = T01AE19_n1212TipEntNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1212TipEntNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_100( String A396EmprCod ,
                           byte A4792AlmCod )
   {
      /* Using cursor T01AE20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A4792AlmCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Almacen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A4793AlmNom = T01AE20_A4793AlmNom[0] ;
      n4793AlmNom = T01AE20_n4793AlmNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4793AlmNom", A4793AlmNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4793AlmNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKey1AE7( )
   {
      /* Using cursor T01AE21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
      else
      {
         RcdFound7 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01AE5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) != 101) && ( T01AE5_A44AlbRecCod[0] == A44AlbRecCod ) && ( T01AE5_A252CliCod[0] == A252CliCod ) )
      {
         zm1AE7( 93) ;
         RcdFound7 = (short)(1) ;
         A45AlbRef = T01AE5_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A56AlbRUni = T01AE5_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A47AlbREst = T01AE5_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A317AlbStLot = T01AE5_A317AlbStLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A317AlbStLot", GXutil.str( A317AlbStLot, 1, 0));
         A46AlbREnt = T01AE5_A46AlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A52AlbRPieEnt = T01AE5_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A50AlbRLoc = T01AE5_A50AlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         A49AlbRFen = T01AE5_A49AlbRFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         A58AlbRUniEnt = T01AE5_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A55AlbRReo = T01AE5_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A54AlbRPieUti = T01AE5_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A53AlbRPieReb = T01AE5_A53AlbRPieReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         A60AlbRUniUti = T01AE5_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A59AlbRUniReb = T01AE5_A59AlbRUniReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
         A48AlbRFecUlt = T01AE5_A48AlbRFecUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         A1222AlbNumEti = T01AE5_A1222AlbNumEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         A1291AlbRDes = T01AE5_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A1301AlbRUlin = T01AE5_A1301AlbRUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         A3613AlbRefDsc = T01AE5_A3613AlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A4290AlbPmPPza = T01AE5_A4290AlbPmPPza[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
         A4920AlbRGrm2 = T01AE5_A4920AlbRGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         A4921AlbRAnc = T01AE5_A4921AlbRAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         A4922AlbPml = T01AE5_A4922AlbPml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
         A5743AlbRPre = T01AE5_A5743AlbRPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5743AlbRPre", GXutil.ltrimstr( A5743AlbRPre, 12, 5));
         A5744AlbRAju = T01AE5_A5744AlbRAju[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5744AlbRAju", GXutil.ltrimstr( A5744AlbRAju, 8, 2));
         A5745AlbRRep = T01AE5_A5745AlbRRep[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5745AlbRRep", GXutil.str( A5745AlbRRep, 1, 0));
         A5806AlbREnt2 = T01AE5_A5806AlbREnt2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
         A6178AlbrUsu = T01AE5_A6178AlbrUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6178AlbrUsu", A6178AlbrUsu);
         A6179AlbrHor = T01AE5_A6179AlbrHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6180AlbrUniC = T01AE5_A6180AlbrUniC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
         A6181AlbrPieC = T01AE5_A6181AlbrPieC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
         A6182AlbrNF = T01AE5_A6182AlbrNF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", A6182AlbrNF);
         A6183AlbrFeNf = T01AE5_A6183AlbrFeNf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6183AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
         A6184AlbrCfop = T01AE5_A6184AlbrCfop[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6184AlbrCfop", A6184AlbrCfop);
         A3359AlbRDisCli = T01AE5_A3359AlbRDisCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3359AlbRDisCli", A3359AlbRDisCli);
         A3360AlbRImp = T01AE5_A3360AlbRImp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3360AlbRImp", A3360AlbRImp);
         A6463AlbRLote = T01AE5_A6463AlbRLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         A6464AlbRTelar = T01AE5_A6464AlbRTelar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
         A6465AlbRLu = T01AE5_A6465AlbRLu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
         A4602AlbRMdlCod = T01AE5_A4602AlbRMdlCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
         A6470AlbRTara = T01AE5_A6470AlbRTara[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
         A6471AlbRUniB = T01AE5_A6471AlbRUniB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6471AlbRUniB", GXutil.ltrimstr( A6471AlbRUniB, 9, 2));
         A6488AlbDocPrv = T01AE5_A6488AlbDocPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6488AlbDocPrv", A6488AlbDocPrv);
         A6523AlbRUdas = T01AE5_A6523AlbRUdas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6523AlbRUdas", GXutil.ltrimstr( A6523AlbRUdas, 9, 2));
         A8023AlbColor = T01AE5_A8023AlbColor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8023AlbColor", A8023AlbColor);
         A8024AlbOpsT = T01AE5_A8024AlbOpsT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8024AlbOpsT", A8024AlbOpsT);
         A8025AlbOpsC = T01AE5_A8025AlbOpsC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8025AlbOpsC", A8025AlbOpsC);
         A8026AlbOC = T01AE5_A8026AlbOC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8026AlbOC", A8026AlbOC);
         A8027AlbHdri = T01AE5_A8027AlbHdri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8027AlbHdri", A8027AlbHdri);
         A8028AlbNumB = T01AE5_A8028AlbNumB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8028AlbNumB", A8028AlbNumB);
         A8029AlbNumM = T01AE5_A8029AlbNumM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
         A8030AlbAncC = T01AE5_A8030AlbAncC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8030AlbAncC", GXutil.ltrimstr( A8030AlbAncC, 5, 2));
         A8031AlbDndC = T01AE5_A8031AlbDndC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8031AlbDndC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8031AlbDndC), 4, 0));
         A8032AlbAncCr = T01AE5_A8032AlbAncCr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8032AlbAncCr", GXutil.ltrimstr( A8032AlbAncCr, 5, 2));
         A8033AlbDndCr = T01AE5_A8033AlbDndCr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8033AlbDndCr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8033AlbDndCr), 4, 0));
         A8034AlbGalga = T01AE5_A8034AlbGalga[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8034AlbGalga", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8034AlbGalga), 3, 0));
         A8035AlbMaqTej = T01AE5_A8035AlbMaqTej[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8035AlbMaqTej", A8035AlbMaqTej);
         A8036AlbDmt = T01AE5_A8036AlbDmt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8036AlbDmt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8036AlbDmt), 3, 0));
         A9793AlbPdaC = T01AE5_A9793AlbPdaC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9793AlbPdaC", A9793AlbPdaC);
         A9794AlbOStj = T01AE5_A9794AlbOStj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9794AlbOStj", A9794AlbOStj);
         A10358AlbTurno = T01AE5_A10358AlbTurno[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10358AlbTurno", GXutil.str( A10358AlbTurno, 1, 0));
         A396EmprCod = T01AE5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6263AlbRTartC = T01AE5_A6263AlbRTartC[0] ;
         n6263AlbRTartC = T01AE5_n6263AlbRTartC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         A840TrnCod = T01AE5_A840TrnCod[0] ;
         n840TrnCod = T01AE5_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A970ProceCod = T01AE5_A970ProceCod[0] ;
         n970ProceCod = T01AE5_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A1211TipEntCod = T01AE5_A1211TipEntCod[0] ;
         n1211TipEntCod = T01AE5_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         A4792AlmCod = T01AE5_A4792AlmCod[0] ;
         n4792AlmCod = T01AE5_n4792AlmCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
         O1301AlbRUlin = A1301AlbRUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         O54AlbRPieUti = A54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         O60AlbRUniUti = A60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         O52AlbRPieEnt = A52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         O58AlbRUniEnt = A58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1AE7( ) ;
         if ( AnyError == 1 )
         {
            RcdFound7 = (short)(0) ;
            initializeNonKey1AE7( ) ;
         }
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound7 = (short)(0) ;
         initializeNonKey1AE7( ) ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1AE7( ) ;
      if ( RcdFound7 == 0 )
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
      RcdFound7 = (short)(0) ;
      /* Using cursor T01AE22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         while ( (pr_default.getStatus(20) != 101) && ( ( GXutil.strcmp(T01AE22_A396EmprCod[0], A396EmprCod) < 0 ) ) && ( T01AE22_A44AlbRecCod[0] == A44AlbRecCod ) && ( T01AE22_A252CliCod[0] == A252CliCod ) )
         {
            pr_default.readNext(20);
         }
         if ( (pr_default.getStatus(20) != 101) && ( ( GXutil.strcmp(T01AE22_A396EmprCod[0], A396EmprCod) > 0 ) ) && ( T01AE22_A44AlbRecCod[0] == A44AlbRecCod ) && ( T01AE22_A252CliCod[0] == A252CliCod ) )
         {
            A396EmprCod = T01AE22_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(20);
   }

   public void move_previous( )
   {
      RcdFound7 = (short)(0) ;
      /* Using cursor T01AE23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         while ( (pr_default.getStatus(21) != 101) && ( ( GXutil.strcmp(T01AE23_A396EmprCod[0], A396EmprCod) > 0 ) ) && ( T01AE23_A44AlbRecCod[0] == A44AlbRecCod ) && ( T01AE23_A252CliCod[0] == A252CliCod ) )
         {
            pr_default.readNext(21);
         }
         if ( (pr_default.getStatus(21) != 101) && ( ( GXutil.strcmp(T01AE23_A396EmprCod[0], A396EmprCod) < 0 ) ) && ( T01AE23_A44AlbRecCod[0] == A44AlbRecCod ) && ( T01AE23_A252CliCod[0] == A252CliCod ) )
         {
            A396EmprCod = T01AE23_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(21);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1AE7( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A1301AlbRUlin = O1301AlbRUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         GX_FocusControl = edtAlbRef_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1AE7( ) ;
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
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A1301AlbRUlin = O1301AlbRUlin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbRef_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A1301AlbRUlin = O1301AlbRUlin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
               update1AE7( ) ;
               GX_FocusControl = edtAlbRef_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A1301AlbRUlin = O1301AlbRUlin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
               GX_FocusControl = edtAlbRef_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1AE7( ) ;
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
                  A1301AlbRUlin = O1301AlbRUlin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
                  GX_FocusControl = edtAlbRef_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1AE7( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A1301AlbRUlin = O1301AlbRUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbRef_Internalname ;
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

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtAlbRef_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1AE7( ) ;
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRef_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1AE7( ) ;
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
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRef_Internalname ;
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
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRef_Internalname ;
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
      scanStart1AE7( ) ;
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound7 != 0 )
         {
            scanNext1AE7( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRef_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1AE7( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1AE7( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AE4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z45AlbRef, T01AE4_A45AlbRef[0]) != 0 ) || ( GXutil.strcmp(Z56AlbRUni, T01AE4_A56AlbRUni[0]) != 0 ) || ( Z47AlbREst != T01AE4_A47AlbREst[0] ) || ( Z317AlbStLot != T01AE4_A317AlbStLot[0] ) || ( GXutil.strcmp(Z46AlbREnt, T01AE4_A46AlbREnt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z52AlbRPieEnt != T01AE4_A52AlbRPieEnt[0] ) || ( GXutil.strcmp(Z50AlbRLoc, T01AE4_A50AlbRLoc[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z49AlbRFen), GXutil.resetTime(T01AE4_A49AlbRFen[0])) ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01AE4_A58AlbRUniEnt[0]) != 0 ) || ( GXutil.strcmp(Z55AlbRReo, T01AE4_A55AlbRReo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z54AlbRPieUti != T01AE4_A54AlbRPieUti[0] ) || ( Z53AlbRPieReb != T01AE4_A53AlbRPieReb[0] ) || ( DecimalUtil.compareTo(Z60AlbRUniUti, T01AE4_A60AlbRUniUti[0]) != 0 ) || ( DecimalUtil.compareTo(Z59AlbRUniReb, T01AE4_A59AlbRUniReb[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z48AlbRFecUlt), GXutil.resetTime(T01AE4_A48AlbRFecUlt[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1222AlbNumEti != T01AE4_A1222AlbNumEti[0] ) || ( GXutil.strcmp(Z1291AlbRDes, T01AE4_A1291AlbRDes[0]) != 0 ) || ( Z1301AlbRUlin != T01AE4_A1301AlbRUlin[0] ) || ( GXutil.strcmp(Z3613AlbRefDsc, T01AE4_A3613AlbRefDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z4290AlbPmPPza, T01AE4_A4290AlbPmPPza[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4920AlbRGrm2 != T01AE4_A4920AlbRGrm2[0] ) || ( Z4921AlbRAnc != T01AE4_A4921AlbRAnc[0] ) || ( Z4922AlbPml != T01AE4_A4922AlbPml[0] ) || ( DecimalUtil.compareTo(Z5743AlbRPre, T01AE4_A5743AlbRPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z5744AlbRAju, T01AE4_A5744AlbRAju[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5745AlbRRep != T01AE4_A5745AlbRRep[0] ) || ( GXutil.strcmp(Z5806AlbREnt2, T01AE4_A5806AlbREnt2[0]) != 0 ) || ( GXutil.strcmp(Z6178AlbrUsu, T01AE4_A6178AlbrUsu[0]) != 0 ) || !( GXutil.dateCompare(Z6179AlbrHor, T01AE4_A6179AlbrHor[0]) ) || ( DecimalUtil.compareTo(Z6180AlbrUniC, T01AE4_A6180AlbrUniC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6181AlbrPieC != T01AE4_A6181AlbrPieC[0] ) || ( GXutil.strcmp(Z6182AlbrNF, T01AE4_A6182AlbrNF[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z6183AlbrFeNf), GXutil.resetTime(T01AE4_A6183AlbrFeNf[0])) ) || ( GXutil.strcmp(Z6184AlbrCfop, T01AE4_A6184AlbrCfop[0]) != 0 ) || ( GXutil.strcmp(Z3359AlbRDisCli, T01AE4_A3359AlbRDisCli[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3360AlbRImp, T01AE4_A3360AlbRImp[0]) != 0 ) || ( GXutil.strcmp(Z6463AlbRLote, T01AE4_A6463AlbRLote[0]) != 0 ) || ( GXutil.strcmp(Z6464AlbRTelar, T01AE4_A6464AlbRTelar[0]) != 0 ) || ( DecimalUtil.compareTo(Z6465AlbRLu, T01AE4_A6465AlbRLu[0]) != 0 ) || ( GXutil.strcmp(Z4602AlbRMdlCod, T01AE4_A4602AlbRMdlCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z6470AlbRTara, T01AE4_A6470AlbRTara[0]) != 0 ) || ( DecimalUtil.compareTo(Z6471AlbRUniB, T01AE4_A6471AlbRUniB[0]) != 0 ) || ( GXutil.strcmp(Z6488AlbDocPrv, T01AE4_A6488AlbDocPrv[0]) != 0 ) || ( DecimalUtil.compareTo(Z6523AlbRUdas, T01AE4_A6523AlbRUdas[0]) != 0 ) || ( GXutil.strcmp(Z8023AlbColor, T01AE4_A8023AlbColor[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8024AlbOpsT, T01AE4_A8024AlbOpsT[0]) != 0 ) || ( GXutil.strcmp(Z8025AlbOpsC, T01AE4_A8025AlbOpsC[0]) != 0 ) || ( GXutil.strcmp(Z8026AlbOC, T01AE4_A8026AlbOC[0]) != 0 ) || ( GXutil.strcmp(Z8027AlbHdri, T01AE4_A8027AlbHdri[0]) != 0 ) || ( GXutil.strcmp(Z8028AlbNumB, T01AE4_A8028AlbNumB[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8029AlbNumM, T01AE4_A8029AlbNumM[0]) != 0 ) || ( DecimalUtil.compareTo(Z8030AlbAncC, T01AE4_A8030AlbAncC[0]) != 0 ) || ( Z8031AlbDndC != T01AE4_A8031AlbDndC[0] ) || ( DecimalUtil.compareTo(Z8032AlbAncCr, T01AE4_A8032AlbAncCr[0]) != 0 ) || ( Z8033AlbDndCr != T01AE4_A8033AlbDndCr[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8034AlbGalga != T01AE4_A8034AlbGalga[0] ) || ( GXutil.strcmp(Z8035AlbMaqTej, T01AE4_A8035AlbMaqTej[0]) != 0 ) || ( Z8036AlbDmt != T01AE4_A8036AlbDmt[0] ) || ( GXutil.strcmp(Z9793AlbPdaC, T01AE4_A9793AlbPdaC[0]) != 0 ) || ( GXutil.strcmp(Z9794AlbOStj, T01AE4_A9794AlbOStj[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10358AlbTurno != T01AE4_A10358AlbTurno[0] ) || ( Z6263AlbRTartC != T01AE4_A6263AlbRTartC[0] ) || ( Z840TrnCod != T01AE4_A840TrnCod[0] ) || ( Z970ProceCod != T01AE4_A970ProceCod[0] ) || ( Z1211TipEntCod != T01AE4_A1211TipEntCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4792AlmCod != T01AE4_A4792AlmCod[0] ) )
         {
            if ( GXutil.strcmp(Z45AlbRef, T01AE4_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T01AE4_A45AlbRef[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T01AE4_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T01AE4_A56AlbRUni[0]);
            }
            if ( Z47AlbREst != T01AE4_A47AlbREst[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T01AE4_A47AlbREst[0]);
            }
            if ( Z317AlbStLot != T01AE4_A317AlbStLot[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbStLot");
               GXutil.writeLogRaw("Old: ",Z317AlbStLot);
               GXutil.writeLogRaw("Current: ",T01AE4_A317AlbStLot[0]);
            }
            if ( GXutil.strcmp(Z46AlbREnt, T01AE4_A46AlbREnt[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbREnt");
               GXutil.writeLogRaw("Old: ",Z46AlbREnt);
               GXutil.writeLogRaw("Current: ",T01AE4_A46AlbREnt[0]);
            }
            if ( Z52AlbRPieEnt != T01AE4_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T01AE4_A52AlbRPieEnt[0]);
            }
            if ( GXutil.strcmp(Z50AlbRLoc, T01AE4_A50AlbRLoc[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRLoc");
               GXutil.writeLogRaw("Old: ",Z50AlbRLoc);
               GXutil.writeLogRaw("Current: ",T01AE4_A50AlbRLoc[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z49AlbRFen), GXutil.resetTime(T01AE4_A49AlbRFen[0])) ) )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRFen");
               GXutil.writeLogRaw("Old: ",Z49AlbRFen);
               GXutil.writeLogRaw("Current: ",T01AE4_A49AlbRFen[0]);
            }
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01AE4_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T01AE4_A58AlbRUniEnt[0]);
            }
            if ( GXutil.strcmp(Z55AlbRReo, T01AE4_A55AlbRReo[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRReo");
               GXutil.writeLogRaw("Old: ",Z55AlbRReo);
               GXutil.writeLogRaw("Current: ",T01AE4_A55AlbRReo[0]);
            }
            if ( Z54AlbRPieUti != T01AE4_A54AlbRPieUti[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRPieUti");
               GXutil.writeLogRaw("Old: ",Z54AlbRPieUti);
               GXutil.writeLogRaw("Current: ",T01AE4_A54AlbRPieUti[0]);
            }
            if ( Z53AlbRPieReb != T01AE4_A53AlbRPieReb[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRPieReb");
               GXutil.writeLogRaw("Old: ",Z53AlbRPieReb);
               GXutil.writeLogRaw("Current: ",T01AE4_A53AlbRPieReb[0]);
            }
            if ( DecimalUtil.compareTo(Z60AlbRUniUti, T01AE4_A60AlbRUniUti[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRUniUti");
               GXutil.writeLogRaw("Old: ",Z60AlbRUniUti);
               GXutil.writeLogRaw("Current: ",T01AE4_A60AlbRUniUti[0]);
            }
            if ( DecimalUtil.compareTo(Z59AlbRUniReb, T01AE4_A59AlbRUniReb[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRUniReb");
               GXutil.writeLogRaw("Old: ",Z59AlbRUniReb);
               GXutil.writeLogRaw("Current: ",T01AE4_A59AlbRUniReb[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z48AlbRFecUlt), GXutil.resetTime(T01AE4_A48AlbRFecUlt[0])) ) )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRFecUlt");
               GXutil.writeLogRaw("Old: ",Z48AlbRFecUlt);
               GXutil.writeLogRaw("Current: ",T01AE4_A48AlbRFecUlt[0]);
            }
            if ( Z1222AlbNumEti != T01AE4_A1222AlbNumEti[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbNumEti");
               GXutil.writeLogRaw("Old: ",Z1222AlbNumEti);
               GXutil.writeLogRaw("Current: ",T01AE4_A1222AlbNumEti[0]);
            }
            if ( GXutil.strcmp(Z1291AlbRDes, T01AE4_A1291AlbRDes[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRDes");
               GXutil.writeLogRaw("Old: ",Z1291AlbRDes);
               GXutil.writeLogRaw("Current: ",T01AE4_A1291AlbRDes[0]);
            }
            if ( Z1301AlbRUlin != T01AE4_A1301AlbRUlin[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRUlin");
               GXutil.writeLogRaw("Old: ",Z1301AlbRUlin);
               GXutil.writeLogRaw("Current: ",T01AE4_A1301AlbRUlin[0]);
            }
            if ( GXutil.strcmp(Z3613AlbRefDsc, T01AE4_A3613AlbRefDsc[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRefDsc");
               GXutil.writeLogRaw("Old: ",Z3613AlbRefDsc);
               GXutil.writeLogRaw("Current: ",T01AE4_A3613AlbRefDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z4290AlbPmPPza, T01AE4_A4290AlbPmPPza[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbPmPPza");
               GXutil.writeLogRaw("Old: ",Z4290AlbPmPPza);
               GXutil.writeLogRaw("Current: ",T01AE4_A4290AlbPmPPza[0]);
            }
            if ( Z4920AlbRGrm2 != T01AE4_A4920AlbRGrm2[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRGrm2");
               GXutil.writeLogRaw("Old: ",Z4920AlbRGrm2);
               GXutil.writeLogRaw("Current: ",T01AE4_A4920AlbRGrm2[0]);
            }
            if ( Z4921AlbRAnc != T01AE4_A4921AlbRAnc[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRAnc");
               GXutil.writeLogRaw("Old: ",Z4921AlbRAnc);
               GXutil.writeLogRaw("Current: ",T01AE4_A4921AlbRAnc[0]);
            }
            if ( Z4922AlbPml != T01AE4_A4922AlbPml[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbPml");
               GXutil.writeLogRaw("Old: ",Z4922AlbPml);
               GXutil.writeLogRaw("Current: ",T01AE4_A4922AlbPml[0]);
            }
            if ( DecimalUtil.compareTo(Z5743AlbRPre, T01AE4_A5743AlbRPre[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRPre");
               GXutil.writeLogRaw("Old: ",Z5743AlbRPre);
               GXutil.writeLogRaw("Current: ",T01AE4_A5743AlbRPre[0]);
            }
            if ( DecimalUtil.compareTo(Z5744AlbRAju, T01AE4_A5744AlbRAju[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRAju");
               GXutil.writeLogRaw("Old: ",Z5744AlbRAju);
               GXutil.writeLogRaw("Current: ",T01AE4_A5744AlbRAju[0]);
            }
            if ( Z5745AlbRRep != T01AE4_A5745AlbRRep[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRRep");
               GXutil.writeLogRaw("Old: ",Z5745AlbRRep);
               GXutil.writeLogRaw("Current: ",T01AE4_A5745AlbRRep[0]);
            }
            if ( GXutil.strcmp(Z5806AlbREnt2, T01AE4_A5806AlbREnt2[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbREnt2");
               GXutil.writeLogRaw("Old: ",Z5806AlbREnt2);
               GXutil.writeLogRaw("Current: ",T01AE4_A5806AlbREnt2[0]);
            }
            if ( GXutil.strcmp(Z6178AlbrUsu, T01AE4_A6178AlbrUsu[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbrUsu");
               GXutil.writeLogRaw("Old: ",Z6178AlbrUsu);
               GXutil.writeLogRaw("Current: ",T01AE4_A6178AlbrUsu[0]);
            }
            if ( !( GXutil.dateCompare(Z6179AlbrHor, T01AE4_A6179AlbrHor[0]) ) )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbrHor");
               GXutil.writeLogRaw("Old: ",Z6179AlbrHor);
               GXutil.writeLogRaw("Current: ",T01AE4_A6179AlbrHor[0]);
            }
            if ( DecimalUtil.compareTo(Z6180AlbrUniC, T01AE4_A6180AlbrUniC[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbrUniC");
               GXutil.writeLogRaw("Old: ",Z6180AlbrUniC);
               GXutil.writeLogRaw("Current: ",T01AE4_A6180AlbrUniC[0]);
            }
            if ( Z6181AlbrPieC != T01AE4_A6181AlbrPieC[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbrPieC");
               GXutil.writeLogRaw("Old: ",Z6181AlbrPieC);
               GXutil.writeLogRaw("Current: ",T01AE4_A6181AlbrPieC[0]);
            }
            if ( GXutil.strcmp(Z6182AlbrNF, T01AE4_A6182AlbrNF[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbrNF");
               GXutil.writeLogRaw("Old: ",Z6182AlbrNF);
               GXutil.writeLogRaw("Current: ",T01AE4_A6182AlbrNF[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z6183AlbrFeNf), GXutil.resetTime(T01AE4_A6183AlbrFeNf[0])) ) )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbrFeNf");
               GXutil.writeLogRaw("Old: ",Z6183AlbrFeNf);
               GXutil.writeLogRaw("Current: ",T01AE4_A6183AlbrFeNf[0]);
            }
            if ( GXutil.strcmp(Z6184AlbrCfop, T01AE4_A6184AlbrCfop[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbrCfop");
               GXutil.writeLogRaw("Old: ",Z6184AlbrCfop);
               GXutil.writeLogRaw("Current: ",T01AE4_A6184AlbrCfop[0]);
            }
            if ( GXutil.strcmp(Z3359AlbRDisCli, T01AE4_A3359AlbRDisCli[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRDisCli");
               GXutil.writeLogRaw("Old: ",Z3359AlbRDisCli);
               GXutil.writeLogRaw("Current: ",T01AE4_A3359AlbRDisCli[0]);
            }
            if ( GXutil.strcmp(Z3360AlbRImp, T01AE4_A3360AlbRImp[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRImp");
               GXutil.writeLogRaw("Old: ",Z3360AlbRImp);
               GXutil.writeLogRaw("Current: ",T01AE4_A3360AlbRImp[0]);
            }
            if ( GXutil.strcmp(Z6463AlbRLote, T01AE4_A6463AlbRLote[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRLote");
               GXutil.writeLogRaw("Old: ",Z6463AlbRLote);
               GXutil.writeLogRaw("Current: ",T01AE4_A6463AlbRLote[0]);
            }
            if ( GXutil.strcmp(Z6464AlbRTelar, T01AE4_A6464AlbRTelar[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRTelar");
               GXutil.writeLogRaw("Old: ",Z6464AlbRTelar);
               GXutil.writeLogRaw("Current: ",T01AE4_A6464AlbRTelar[0]);
            }
            if ( DecimalUtil.compareTo(Z6465AlbRLu, T01AE4_A6465AlbRLu[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRLu");
               GXutil.writeLogRaw("Old: ",Z6465AlbRLu);
               GXutil.writeLogRaw("Current: ",T01AE4_A6465AlbRLu[0]);
            }
            if ( GXutil.strcmp(Z4602AlbRMdlCod, T01AE4_A4602AlbRMdlCod[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRMdlCod");
               GXutil.writeLogRaw("Old: ",Z4602AlbRMdlCod);
               GXutil.writeLogRaw("Current: ",T01AE4_A4602AlbRMdlCod[0]);
            }
            if ( DecimalUtil.compareTo(Z6470AlbRTara, T01AE4_A6470AlbRTara[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRTara");
               GXutil.writeLogRaw("Old: ",Z6470AlbRTara);
               GXutil.writeLogRaw("Current: ",T01AE4_A6470AlbRTara[0]);
            }
            if ( DecimalUtil.compareTo(Z6471AlbRUniB, T01AE4_A6471AlbRUniB[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRUniB");
               GXutil.writeLogRaw("Old: ",Z6471AlbRUniB);
               GXutil.writeLogRaw("Current: ",T01AE4_A6471AlbRUniB[0]);
            }
            if ( GXutil.strcmp(Z6488AlbDocPrv, T01AE4_A6488AlbDocPrv[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbDocPrv");
               GXutil.writeLogRaw("Old: ",Z6488AlbDocPrv);
               GXutil.writeLogRaw("Current: ",T01AE4_A6488AlbDocPrv[0]);
            }
            if ( DecimalUtil.compareTo(Z6523AlbRUdas, T01AE4_A6523AlbRUdas[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRUdas");
               GXutil.writeLogRaw("Old: ",Z6523AlbRUdas);
               GXutil.writeLogRaw("Current: ",T01AE4_A6523AlbRUdas[0]);
            }
            if ( GXutil.strcmp(Z8023AlbColor, T01AE4_A8023AlbColor[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbColor");
               GXutil.writeLogRaw("Old: ",Z8023AlbColor);
               GXutil.writeLogRaw("Current: ",T01AE4_A8023AlbColor[0]);
            }
            if ( GXutil.strcmp(Z8024AlbOpsT, T01AE4_A8024AlbOpsT[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbOpsT");
               GXutil.writeLogRaw("Old: ",Z8024AlbOpsT);
               GXutil.writeLogRaw("Current: ",T01AE4_A8024AlbOpsT[0]);
            }
            if ( GXutil.strcmp(Z8025AlbOpsC, T01AE4_A8025AlbOpsC[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbOpsC");
               GXutil.writeLogRaw("Old: ",Z8025AlbOpsC);
               GXutil.writeLogRaw("Current: ",T01AE4_A8025AlbOpsC[0]);
            }
            if ( GXutil.strcmp(Z8026AlbOC, T01AE4_A8026AlbOC[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbOC");
               GXutil.writeLogRaw("Old: ",Z8026AlbOC);
               GXutil.writeLogRaw("Current: ",T01AE4_A8026AlbOC[0]);
            }
            if ( GXutil.strcmp(Z8027AlbHdri, T01AE4_A8027AlbHdri[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbHdri");
               GXutil.writeLogRaw("Old: ",Z8027AlbHdri);
               GXutil.writeLogRaw("Current: ",T01AE4_A8027AlbHdri[0]);
            }
            if ( GXutil.strcmp(Z8028AlbNumB, T01AE4_A8028AlbNumB[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbNumB");
               GXutil.writeLogRaw("Old: ",Z8028AlbNumB);
               GXutil.writeLogRaw("Current: ",T01AE4_A8028AlbNumB[0]);
            }
            if ( GXutil.strcmp(Z8029AlbNumM, T01AE4_A8029AlbNumM[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbNumM");
               GXutil.writeLogRaw("Old: ",Z8029AlbNumM);
               GXutil.writeLogRaw("Current: ",T01AE4_A8029AlbNumM[0]);
            }
            if ( DecimalUtil.compareTo(Z8030AlbAncC, T01AE4_A8030AlbAncC[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbAncC");
               GXutil.writeLogRaw("Old: ",Z8030AlbAncC);
               GXutil.writeLogRaw("Current: ",T01AE4_A8030AlbAncC[0]);
            }
            if ( Z8031AlbDndC != T01AE4_A8031AlbDndC[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbDndC");
               GXutil.writeLogRaw("Old: ",Z8031AlbDndC);
               GXutil.writeLogRaw("Current: ",T01AE4_A8031AlbDndC[0]);
            }
            if ( DecimalUtil.compareTo(Z8032AlbAncCr, T01AE4_A8032AlbAncCr[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbAncCr");
               GXutil.writeLogRaw("Old: ",Z8032AlbAncCr);
               GXutil.writeLogRaw("Current: ",T01AE4_A8032AlbAncCr[0]);
            }
            if ( Z8033AlbDndCr != T01AE4_A8033AlbDndCr[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbDndCr");
               GXutil.writeLogRaw("Old: ",Z8033AlbDndCr);
               GXutil.writeLogRaw("Current: ",T01AE4_A8033AlbDndCr[0]);
            }
            if ( Z8034AlbGalga != T01AE4_A8034AlbGalga[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbGalga");
               GXutil.writeLogRaw("Old: ",Z8034AlbGalga);
               GXutil.writeLogRaw("Current: ",T01AE4_A8034AlbGalga[0]);
            }
            if ( GXutil.strcmp(Z8035AlbMaqTej, T01AE4_A8035AlbMaqTej[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbMaqTej");
               GXutil.writeLogRaw("Old: ",Z8035AlbMaqTej);
               GXutil.writeLogRaw("Current: ",T01AE4_A8035AlbMaqTej[0]);
            }
            if ( Z8036AlbDmt != T01AE4_A8036AlbDmt[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbDmt");
               GXutil.writeLogRaw("Old: ",Z8036AlbDmt);
               GXutil.writeLogRaw("Current: ",T01AE4_A8036AlbDmt[0]);
            }
            if ( GXutil.strcmp(Z9793AlbPdaC, T01AE4_A9793AlbPdaC[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbPdaC");
               GXutil.writeLogRaw("Old: ",Z9793AlbPdaC);
               GXutil.writeLogRaw("Current: ",T01AE4_A9793AlbPdaC[0]);
            }
            if ( GXutil.strcmp(Z9794AlbOStj, T01AE4_A9794AlbOStj[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbOStj");
               GXutil.writeLogRaw("Old: ",Z9794AlbOStj);
               GXutil.writeLogRaw("Current: ",T01AE4_A9794AlbOStj[0]);
            }
            if ( Z10358AlbTurno != T01AE4_A10358AlbTurno[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbTurno");
               GXutil.writeLogRaw("Old: ",Z10358AlbTurno);
               GXutil.writeLogRaw("Current: ",T01AE4_A10358AlbTurno[0]);
            }
            if ( Z6263AlbRTartC != T01AE4_A6263AlbRTartC[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRTartC");
               GXutil.writeLogRaw("Old: ",Z6263AlbRTartC);
               GXutil.writeLogRaw("Current: ",T01AE4_A6263AlbRTartC[0]);
            }
            if ( Z840TrnCod != T01AE4_A840TrnCod[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01AE4_A840TrnCod[0]);
            }
            if ( Z970ProceCod != T01AE4_A970ProceCod[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"ProceCod");
               GXutil.writeLogRaw("Old: ",Z970ProceCod);
               GXutil.writeLogRaw("Current: ",T01AE4_A970ProceCod[0]);
            }
            if ( Z1211TipEntCod != T01AE4_A1211TipEntCod[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"TipEntCod");
               GXutil.writeLogRaw("Old: ",Z1211TipEntCod);
               GXutil.writeLogRaw("Current: ",T01AE4_A1211TipEntCod[0]);
            }
            if ( Z4792AlmCod != T01AE4_A4792AlmCod[0] )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlmCod");
               GXutil.writeLogRaw("Old: ",Z4792AlmCod);
               GXutil.writeLogRaw("Current: ",T01AE4_A4792AlmCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AE7( )
   {
      beforeValidate1AE7( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AE7( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AE7( 0) ;
         checkOptimisticConcurrency1AE7( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AE7( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AE7( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AE24 */
                  pr_default.execute(22, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A252CliCod), A45AlbRef, A56AlbRUni, Byte.valueOf(A47AlbREst), Byte.valueOf(A317AlbStLot), A46AlbREnt, Integer.valueOf(A52AlbRPieEnt), A50AlbRLoc, A49AlbRFen, A58AlbRUniEnt, A55AlbRReo, Integer.valueOf(A54AlbRPieUti), Integer.valueOf(A53AlbRPieReb), A60AlbRUniUti, A59AlbRUniReb, A48AlbRFecUlt, Short.valueOf(A1222AlbNumEti), A1291AlbRDes, Byte.valueOf(A1301AlbRUlin), A3613AlbRefDsc, A4290AlbPmPPza, Short.valueOf(A4920AlbRGrm2), Short.valueOf(A4921AlbRAnc), Short.valueOf(A4922AlbPml), A5743AlbRPre, A5744AlbRAju, Byte.valueOf(A5745AlbRRep), A5806AlbREnt2, A6178AlbrUsu, A6179AlbrHor, A6180AlbrUniC, Integer.valueOf(A6181AlbrPieC), A6182AlbrNF, A6183AlbrFeNf, A6184AlbrCfop, A3359AlbRDisCli, A3360AlbRImp, A6463AlbRLote, A6464AlbRTelar, A6465AlbRLu, A4602AlbRMdlCod, A6470AlbRTara, A6471AlbRUniB, A6488AlbDocPrv, A6523AlbRUdas, A8023AlbColor, A8024AlbOpsT, A8025AlbOpsC, A8026AlbOC, A8027AlbHdri, A8028AlbNumB, A8029AlbNumM, A8030AlbAncC, Short.valueOf(A8031AlbDndC), A8032AlbAncCr, Short.valueOf(A8033AlbDndCr), Short.valueOf(A8034AlbGalga), A8035AlbMaqTej, Short.valueOf(A8036AlbDmt), A9793AlbPdaC, A9794AlbOStj, Byte.valueOf(A10358AlbTurno), A396EmprCod, Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
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
                        AV153Texto_ii = httpContext.getMessage( httpContext.getMessage( "TALBREC-Alta Registro,AlbReccod=", ""), "") + GXutil.trim( GXutil.str( A44AlbRecCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( " Cliente=", ""), "") + GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + " " + GXutil.trim( A279CliNom) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + GXutil.trim( A45AlbRef) + " " + GXutil.trim( A3613AlbRefDsc) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Unidades Entradas =", ""), "") + GXutil.str( A58AlbRUniEnt, 9, 2) + " " + A56AlbRUni + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Piezas   Entradas =", ""), "") + GXutil.str( A52AlbRPieEnt, 6, 0) + GXutil.newLine( ) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV153Texto_ii", AV153Texto_ii);
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1AE7( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1AE0( ) ;
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
            load1AE7( ) ;
         }
         endLevel1AE7( ) ;
      }
      closeExtendedTableCursors1AE7( ) ;
   }

   public void update1AE7( )
   {
      beforeValidate1AE7( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AE7( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AE7( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AE7( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1AE7( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AE25 */
                  pr_default.execute(23, new Object[] {Integer.valueOf(A252CliCod), A45AlbRef, A56AlbRUni, Byte.valueOf(A47AlbREst), Byte.valueOf(A317AlbStLot), A46AlbREnt, Integer.valueOf(A52AlbRPieEnt), A50AlbRLoc, A49AlbRFen, A58AlbRUniEnt, A55AlbRReo, Integer.valueOf(A54AlbRPieUti), Integer.valueOf(A53AlbRPieReb), A60AlbRUniUti, A59AlbRUniReb, A48AlbRFecUlt, Short.valueOf(A1222AlbNumEti), A1291AlbRDes, Byte.valueOf(A1301AlbRUlin), A3613AlbRefDsc, A4290AlbPmPPza, Short.valueOf(A4920AlbRGrm2), Short.valueOf(A4921AlbRAnc), Short.valueOf(A4922AlbPml), A5743AlbRPre, A5744AlbRAju, Byte.valueOf(A5745AlbRRep), A5806AlbREnt2, A6178AlbrUsu, A6179AlbrHor, A6180AlbrUniC, Integer.valueOf(A6181AlbrPieC), A6182AlbrNF, A6183AlbrFeNf, A6184AlbrCfop, A3359AlbRDisCli, A3360AlbRImp, A6463AlbRLote, A6464AlbRTelar, A6465AlbRLu, A4602AlbRMdlCod, A6470AlbRTara, A6471AlbRUniB, A6488AlbDocPrv, A6523AlbRUdas, A8023AlbColor, A8024AlbOpsT, A8025AlbOpsC, A8026AlbOC, A8027AlbHdri, A8028AlbNumB, A8029AlbNumM, A8030AlbAncC, Short.valueOf(A8031AlbDndC), A8032AlbAncCr, Short.valueOf(A8033AlbDndCr), Short.valueOf(A8034AlbGalga), A8035AlbMaqTej, Short.valueOf(A8036AlbDmt), A9793AlbPdaC, A9794AlbOStj, Byte.valueOf(A10358AlbTurno), Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(23) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1AE7( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char7[0] = A396EmprCod ;
                     GXv_int3[0] = A44AlbRecCod ;
                     new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char7, GXv_int3) ;
                     talbre5_impl.this.A396EmprCod = GXv_char7[0] ;
                     talbre5_impl.this.A44AlbRecCod = GXv_int3[0] ;
                     /* Start of After( update) rules */
                     if ( true /* After */ )
                     {
                        AV153Texto_ii = httpContext.getMessage( httpContext.getMessage( "TALBREC-Modificacion Registro,AlbReccod=", ""), "") + GXutil.trim( GXutil.str( A44AlbRecCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( " Cliente=", ""), "") + GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + " " + GXutil.trim( A279CliNom) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + GXutil.trim( A45AlbRef) + " " + GXutil.trim( A3613AlbRefDsc) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Unidades Entradas(old) =", ""), "") + GXutil.str( AV154Oldunie, 9, 2) + " " + A56AlbRUni + httpContext.getMessage( httpContext.getMessage( " Unidades Entradas(new) =", ""), "") + GXutil.str( A58AlbRUniEnt, 9, 2) + " " + A56AlbRUni + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Piezas   Entradas(old) =", ""), "") + GXutil.str( AV156oldpiee, 6, 0) + httpContext.getMessage( httpContext.getMessage( " Piezas   Entradas(new) =", ""), "") + GXutil.str( A52AlbRPieEnt, 6, 0) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Unidades Utilizadas(old) =", ""), "") + GXutil.str( AV155olduniu, 9, 2) + httpContext.getMessage( httpContext.getMessage( " Unidades Utilizadas(new) =", ""), "") + GXutil.str( A60AlbRUniUti, 9, 2) + " " + A56AlbRUni + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Piezas   Utilizadas(old) =", ""), "") + GXutil.str( AV157oldpieu, 6, 0) + httpContext.getMessage( httpContext.getMessage( " Piezas   utilizadas(new) =", ""), "") + GXutil.str( A54AlbRPieUti, 6, 0) + GXutil.newLine( ) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV153Texto_ii", AV153Texto_ii);
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1AE7( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1AE0( ) ;
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
         endLevel1AE7( ) ;
      }
      closeExtendedTableCursors1AE7( ) ;
   }

   public void deferredUpdate1AE7( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AE7( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AE7( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AE7( ) ;
         afterConfirm1AE7( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AE7( ) ;
            if ( AnyError == 0 )
            {
               A1301AlbRUlin = O1301AlbRUlin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
               scanStart1AE191( ) ;
               while ( RcdFound191 != 0 )
               {
                  getByPrimaryKey1AE191( ) ;
                  delete1AE191( ) ;
                  scanNext1AE191( ) ;
                  O1301AlbRUlin = A1301AlbRUlin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
               }
               scanEnd1AE191( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AE26 */
                  pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     if ( true /* After */ )
                     {
                        AV153Texto_ii = httpContext.getMessage( httpContext.getMessage( "TALBREC-Eliminacion Registro,AlbReccod=", ""), "") + GXutil.trim( GXutil.str( A44AlbRecCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( " Cliente=", ""), "") + GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + " " + GXutil.trim( A279CliNom) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + GXutil.trim( A45AlbRef) + " " + GXutil.trim( A3613AlbRefDsc) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Unidades Entradas(old) =", ""), "") + GXutil.str( AV154Oldunie, 9, 2) + " " + A56AlbRUni + httpContext.getMessage( httpContext.getMessage( " Unidades Entradas(new) =", ""), "") + GXutil.str( A58AlbRUniEnt, 9, 2) + " " + A56AlbRUni + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Piezas   Entradas(old) =", ""), "") + GXutil.str( AV156oldpiee, 6, 0) + httpContext.getMessage( httpContext.getMessage( " Piezas   Entradas(new) =", ""), "") + GXutil.str( A52AlbRPieEnt, 6, 0) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Unidades Utilizadas(old) =", ""), "") + GXutil.str( AV155olduniu, 9, 2) + httpContext.getMessage( httpContext.getMessage( " Unidades Utilizadas(new) =", ""), "") + GXutil.str( A60AlbRUniUti, 9, 2) + " " + A56AlbRUni + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Piezas   Utilizadas(old) =", ""), "") + GXutil.str( AV157oldpieu, 6, 0) + httpContext.getMessage( httpContext.getMessage( " Piezas   utilizadas(new) =", ""), "") + GXutil.str( A54AlbRPieUti, 6, 0) + GXutil.newLine( ) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV153Texto_ii", AV153Texto_ii);
                     }
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound7 == 0 )
                        {
                           initAll1AE7( ) ;
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
                        resetCaption1AE0( ) ;
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
      endLevel1AE7( ) ;
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AE7( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) && ( AV77Kohler == 0 ) && isIns( )  )
         {
            GXv_char7[0] = A396EmprCod ;
            GXv_int3[0] = A252CliCod ;
            GXv_char5[0] = A45AlbRef ;
            GXv_int9[0] = A4920AlbRGrm2 ;
            GXv_int1[0] = A4921AlbRAnc ;
            new app.pbusar5(remoteHandle, context).execute( GXv_char7, GXv_int3, GXv_char5, GXv_int9, GXv_int1) ;
            talbre5_impl.this.A396EmprCod = GXv_char7[0] ;
            talbre5_impl.this.A252CliCod = GXv_int3[0] ;
            talbre5_impl.this.A45AlbRef = GXv_char5[0] ;
            talbre5_impl.this.A4920AlbRGrm2 = GXv_int9[0] ;
            talbre5_impl.this.A4921AlbRAnc = GXv_int1[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
            httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
         }
         if ( ( AV103Erfoc == 1 ) && ( ( GXutil.strcmp(A6463AlbRLote, " ") != 0 ) && ( GXutil.strcmp(A4602AlbRMdlCod, " ") != 0 ) && ( GXutil.strcmp(A6464AlbRTelar, " ") != 0 ) ) && true /* After */ && true /* Level */ && isIns( )  )
         {
            GXv_char7[0] = A396EmprCod ;
            GXv_char5[0] = A6463AlbRLote ;
            GXv_char4[0] = A4602AlbRMdlCod ;
            GXv_char2[0] = A6464AlbRTelar ;
            GXv_int6[0] = AV149AlbStLot ;
            new app.pctrlote(remoteHandle, context).execute( GXv_char7, GXv_char5, GXv_char4, GXv_char2, GXv_int6) ;
            talbre5_impl.this.A396EmprCod = GXv_char7[0] ;
            talbre5_impl.this.A6463AlbRLote = GXv_char5[0] ;
            talbre5_impl.this.A4602AlbRMdlCod = GXv_char4[0] ;
            talbre5_impl.this.A6464AlbRTelar = GXv_char2[0] ;
            talbre5_impl.this.AV149AlbStLot = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
            httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
            httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
            httpContext.ajax_rsp_assign_attri("", false, "AV149AlbStLot", GXutil.str( AV149AlbStLot, 1, 0));
         }
         /* Using cursor T01AE27 */
         pr_default.execute(25, new Object[] {A396EmprCod});
         A407EmprNom = T01AE27_A407EmprNom[0] ;
         n407EmprNom = T01AE27_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(25);
         /* Using cursor T01AE28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01AE28_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A8723CliEst = T01AE28_A8723CliEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", A8723CliEst);
         pr_default.close(26);
         /* Using cursor T01AE29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01AE29_A841TrnNom[0] ;
         n841TrnNom = T01AE29_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         pr_default.close(27);
         AV89Albrpieent = A52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89Albrpieent", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Albrpieent), 6, 0));
         AV141PieEntold = O52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV141PieEntold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV141PieEntold), 6, 0));
         AV156oldpiee = O52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV156oldpiee", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV156oldpiee), 6, 0));
         AV96albrfen = A49AlbRFen ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96albrfen", localUtil.format(AV96albrfen, "99/99/99"));
         AV69ALbRunient = A58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69ALbRunient", GXutil.ltrimstr( AV69ALbRunient, 9, 2));
         AV142UniENtold = O58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV142UniENtold", GXutil.ltrimstr( AV142UniENtold, 9, 2));
         AV154Oldunie = O58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV154Oldunie", GXutil.ltrimstr( AV154Oldunie, 9, 2));
         AV92albrreo = A55AlbRReo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV92albrreo", AV92albrreo);
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         AV157oldpieu = O54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "AV157oldpieu", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV157oldpieu), 6, 0));
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
         AV155olduniu = O60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "AV155olduniu", GXutil.ltrimstr( AV155olduniu, 9, 2));
         if ( A47AlbREst == 1 )
         {
            AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         }
         else
         {
            if ( A47AlbREst == 0 )
            {
               AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
            }
         }
         /* Using cursor T01AE30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
         A1212TipEntNom = T01AE30_A1212TipEntNom[0] ;
         n1212TipEntNom = T01AE30_n1212TipEntNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
         pr_default.close(28);
         AV95TipEntCod = A1211TipEntCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95TipEntCod), 4, 0));
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            edtTipEntCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
         }
         else
         {
            edtTipEntCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
         }
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            edtAlbRLoc_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
         }
         else
         {
            edtAlbRLoc_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
         }
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            edtCliCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
         }
         else
         {
            edtCliCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
         }
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            edtAlbRef_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
         }
         else
         {
            edtAlbRef_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
         }
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            edtAlbRFen_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
         }
         else
         {
            edtAlbRFen_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
         }
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            cmbAlbRUni.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
         }
         else
         {
            cmbAlbRUni.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
         }
         if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
         {
            cmbAlbRReo.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
         }
         else
         {
            cmbAlbRReo.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
         }
         /* Using cursor T01AE31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         A971ProceNom = T01AE31_A971ProceNom[0] ;
         n971ProceNom = T01AE31_n971ProceNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         pr_default.close(29);
         AV87Procecod = A970ProceCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87Procecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87Procecod), 4, 0));
         if ( A4290AlbPmPPza.doubleValue() > 0 )
         {
            A4291AlbPzaEst = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A58AlbRUniEnt.divide(A4290AlbPmPPza, 18, java.math.RoundingMode.DOWN), 0))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
         }
         else
         {
            A4291AlbPzaEst = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
         }
         AV90Albrpre = A5743AlbRPre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90Albrpre", GXutil.ltrimstr( AV90Albrpre, 12, 5));
         AV94AlbRunic = A6180AlbrUniC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94AlbRunic", GXutil.ltrimstr( AV94AlbRunic, 9, 2));
         AV93albrnf = A6182AlbrNF ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93albrnf", AV93albrnf);
         AV91albrcfop = A6184AlbrCfop ;
         httpContext.ajax_rsp_assign_attri("", false, "AV91albrcfop", AV91albrcfop);
         /* Using cursor T01AE32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC)});
         A6264AlbRTartD = T01AE32_A6264AlbRTartD[0] ;
         n6264AlbRTartD = T01AE32_n6264AlbRTartD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
         pr_default.close(30);
         /* Using cursor T01AE33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod)});
         A4793AlmNom = T01AE33_A4793AlmNom[0] ;
         n4793AlmNom = T01AE33_n4793AlmNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4793AlmNom", A4793AlmNom);
         pr_default.close(31);
         if ( true )
         {
            AV84Documento = GXutil.str( AV97Doc_6, 6, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84Documento", AV84Documento);
         }
         else
         {
            if ( ! (GXutil.strcmp("", A46AlbREnt)==0) )
            {
               AV84Documento = GXutil.substring( A46AlbREnt, 1, 6) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV84Documento", AV84Documento);
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01AE34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Entradas Almacen Crudo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01AE35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01AE36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01AE37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPPZS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01AE38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPTAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01AE39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01AE40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01AE41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEM1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01AE42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBRDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01AE43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBDET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01AE44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01AE45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01AE46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01AE47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
      }
   }

   public void processNestedLevel1AE191( )
   {
      s1301AlbRUlin = O1301AlbRUlin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      nGXsfl_438_idx = 0 ;
      while ( nGXsfl_438_idx < nRC_GXsfl_438 )
      {
         readRow1AE191( ) ;
         if ( ( nRcdExists_191 != 0 ) || ( nIsMod_191 != 0 ) )
         {
            standaloneNotModal1AE191( ) ;
            getKey1AE191( ) ;
            if ( ( nRcdExists_191 == 0 ) && ( nRcdDeleted_191 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1AE191( ) ;
            }
            else
            {
               if ( RcdFound191 != 0 )
               {
                  if ( ( nRcdDeleted_191 != 0 ) && ( nRcdExists_191 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1AE191( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_191 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1AE191( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_191 == 0 )
                  {
                     GXCCtl = "ALBRLIN_" + sGXsfl_438_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O1301AlbRUlin = A1301AlbRUlin ;
            httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
         }
         httpContext.changePostValue( edtAlbRLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1299AlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRObs_Internalname, GXutil.rtrim( A1300AlbRObs)) ;
         httpContext.changePostValue( "ZT_"+"Z1299AlbRLin_"+sGXsfl_438_idx, GXutil.ltrim( localUtil.ntoc( Z1299AlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1300AlbRObs_"+sGXsfl_438_idx, GXutil.rtrim( Z1300AlbRObs)) ;
         httpContext.changePostValue( "nRcdDeleted_191_"+sGXsfl_438_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_191, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_191_"+sGXsfl_438_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_191, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_191_"+sGXsfl_438_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_191, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_191 != 0 )
         {
            httpContext.changePostValue( "ALBRLIN_"+sGXsfl_438_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBROBS_"+sGXsfl_438_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1AE191( ) ;
      if ( AnyError != 0 )
      {
         O1301AlbRUlin = s1301AlbRUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      }
      nRcdExists_191 = (short)(0) ;
      nIsMod_191 = (short)(0) ;
      nRcdDeleted_191 = (short)(0) ;
   }

   public void processLevel1AE7( )
   {
      /* Save parent mode. */
      sMode7 = Gx_mode ;
      processNestedLevel1AE191( ) ;
      if ( AnyError != 0 )
      {
         O1301AlbRUlin = s1301AlbRUlin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01AE48 */
      pr_default.execute(46, new Object[] {Byte.valueOf(A1301AlbRUlin), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel1AE7( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1AE7( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "talbre5");
         if ( AnyError == 0 )
         {
            confirmValues1AE0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "talbre5");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1AE7( )
   {
      this.A44AlbRecCod = A44AlbRecCod ;
      this.A252CliCod = A252CliCod ;
      /* Scan By routine */
      /* Using cursor T01AE49 */
      pr_default.execute(47, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A252CliCod)});
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A396EmprCod = T01AE49_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AE7( )
   {
      /* Scan next routine */
      pr_default.readNext(47);
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A396EmprCod = T01AE49_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
   }

   public void scanEnd1AE7( )
   {
      pr_default.close(47);
   }

   public void afterConfirm1AE7( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && (0==A44AlbRecCod) && ( AV53FlagFerro == 0 ) && true /* Level */ && true /* After */ )
      {
         GXv_int3[0] = A44AlbRecCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "020100", GXv_int3) ;
         talbre5_impl.this.A44AlbRecCod = GXv_int3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
   }

   public void beforeInsert1AE7( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AE7( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AE7( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AE7( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AE7( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AE7( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtTrnNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Enabled), 5, 0), true);
      edtAlbREnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtAlbRLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      edtAlbRFen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      cmbAlbRReo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRPieReb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieReb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieReb_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRUniReb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniReb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniReb_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtTipEntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
      edtTipEntNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntNom_Enabled), 5, 0), true);
      edtAlbNumEti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumEti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumEti_Enabled), 5, 0), true);
      edtAlbRDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRDes_Enabled), 5, 0), true);
      edtProceCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Enabled), 5, 0), true);
      edtProceNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceNom_Enabled), 5, 0), true);
      edtAlbRUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUlin_Enabled), 5, 0), true);
      edtAlbRefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), true);
      edtAlbPmPPza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPmPPza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPmPPza_Enabled), 5, 0), true);
      edtAlbPzaEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPzaEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPzaEst_Enabled), 5, 0), true);
      edtAlbRGrm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRGrm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRGrm2_Enabled), 5, 0), true);
      edtAlbRAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRAnc_Enabled), 5, 0), true);
      edtAlbPml_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPml_Enabled), 5, 0), true);
      edtAlbRPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPre_Enabled), 5, 0), true);
      edtAlbRAju_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRAju_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRAju_Enabled), 5, 0), true);
      chkAlbRRep.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkAlbRRep.getInternalname(), "Enabled", GXutil.ltrimstr( chkAlbRRep.getEnabled(), 5, 0), true);
      edtAlbREnt2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Enabled), 5, 0), true);
      edtAlbrUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrUsu_Enabled), 5, 0), true);
      edtAlbrHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrHor_Enabled), 5, 0), true);
      edtAlbrUniC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrUniC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrUniC_Enabled), 5, 0), true);
      edtAlbrPieC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrPieC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrPieC_Enabled), 5, 0), true);
      edtAlbrNF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrNF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrNF_Enabled), 5, 0), true);
      edtAlbrFeNf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrFeNf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrFeNf_Enabled), 5, 0), true);
      edtAlbrCfop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbrCfop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbrCfop_Enabled), 5, 0), true);
      edtAlbRDisCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRDisCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRDisCli_Enabled), 5, 0), true);
      edtAlbRTartC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRTartC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTartC_Enabled), 5, 0), true);
      edtAlbRTartD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRTartD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTartD_Enabled), 5, 0), true);
      edtAlbRImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRImp_Enabled), 5, 0), true);
      edtAlbRLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Enabled), 5, 0), true);
      edtAlbRTelar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRTelar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTelar_Enabled), 5, 0), true);
      edtAlbRLu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLu_Enabled), 5, 0), true);
      edtAlbRMdlCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRMdlCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRMdlCod_Enabled), 5, 0), true);
      edtAlbRTara_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRTara_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTara_Enabled), 5, 0), true);
      edtAlbRUniB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniB_Enabled), 5, 0), true);
      edtAlbDocPrv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDocPrv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDocPrv_Enabled), 5, 0), true);
      edtAlbRUdas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUdas_Enabled), 5, 0), true);
      edtAlmCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmCod_Enabled), 5, 0), true);
      edtAlmNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlmNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlmNom_Enabled), 5, 0), true);
      edtAlbColor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColor_Enabled), 5, 0), true);
      edtAlbOpsT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbOpsT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbOpsT_Enabled), 5, 0), true);
      edtAlbOpsC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbOpsC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbOpsC_Enabled), 5, 0), true);
      edtAlbOC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbOC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbOC_Enabled), 5, 0), true);
      edtAlbHdri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdri_Enabled), 5, 0), true);
      edtAlbNumB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumB_Enabled), 5, 0), true);
      edtAlbNumM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumM_Enabled), 5, 0), true);
      edtAlbAncC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbAncC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbAncC_Enabled), 5, 0), true);
      edtAlbDndC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDndC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDndC_Enabled), 5, 0), true);
      edtAlbAncCr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbAncCr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbAncCr_Enabled), 5, 0), true);
      edtAlbDndCr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDndCr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDndCr_Enabled), 5, 0), true);
      edtAlbGalga_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbGalga_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbGalga_Enabled), 5, 0), true);
      edtAlbMaqTej_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMaqTej_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMaqTej_Enabled), 5, 0), true);
      edtAlbDmt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDmt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDmt_Enabled), 5, 0), true);
      edtAlbPdaC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPdaC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPdaC_Enabled), 5, 0), true);
      edtAlbOStj_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbOStj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbOStj_Enabled), 5, 0), true);
      edtAlbStLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbStLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbStLot_Enabled), 5, 0), true);
      edtAlbTurno_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTurno_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTurno_Enabled), 5, 0), true);
      edtCliEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEst_Enabled), 5, 0), true);
   }

   public void zm1AE191( int GX_JID )
   {
      if ( ( GX_JID == 101 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1300AlbRObs = T01AE3_A1300AlbRObs[0] ;
         }
         else
         {
            Z1300AlbRObs = A1300AlbRObs ;
         }
      }
      if ( GX_JID == -101 )
      {
         Z44AlbRecCod = A44AlbRecCod ;
         Z1299AlbRLin = A1299AlbRLin ;
         Z1300AlbRObs = A1300AlbRObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1AE191( )
   {
      edtAlbRUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUlin_Enabled), 5, 0), true);
      edtAlbRUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUlin_Enabled), 5, 0), true);
   }

   public void standaloneModal1AE191( )
   {
      if ( isIns( )  )
      {
         A1301AlbRUlin = (byte)(O1301AlbRUlin+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A1299AlbRLin = A1301AlbRUlin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbRLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLin_Enabled), 5, 0), !bGXsfl_438_Refreshing);
      }
      else
      {
         edtAlbRLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLin_Enabled), 5, 0), !bGXsfl_438_Refreshing);
      }
   }

   public void load1AE191( )
   {
      /* Using cursor T01AE50 */
      pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin)});
      if ( (pr_default.getStatus(48) != 101) )
      {
         RcdFound191 = (short)(1) ;
         A1300AlbRObs = T01AE50_A1300AlbRObs[0] ;
         zm1AE191( -101) ;
      }
      pr_default.close(48);
      onLoadActions1AE191( ) ;
   }

   public void onLoadActions1AE191( )
   {
   }

   public void checkExtendedTable1AE191( )
   {
      nIsDirty_191 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1AE191( ) ;
   }

   public void closeExtendedTableCursors1AE191( )
   {
   }

   public void enableDisable1AE191( )
   {
   }

   public void getKey1AE191( )
   {
      /* Using cursor T01AE51 */
      pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin)});
      if ( (pr_default.getStatus(49) != 101) )
      {
         RcdFound191 = (short)(1) ;
      }
      else
      {
         RcdFound191 = (short)(0) ;
      }
      pr_default.close(49);
   }

   public void getByPrimaryKey1AE191( )
   {
      /* Using cursor T01AE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T01AE3_A44AlbRecCod[0] == A44AlbRecCod ) )
      {
         zm1AE191( 101) ;
         RcdFound191 = (short)(1) ;
         initializeNonKey1AE191( ) ;
         A1299AlbRLin = T01AE3_A1299AlbRLin[0] ;
         A1300AlbRObs = T01AE3_A1300AlbRObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z1299AlbRLin = A1299AlbRLin ;
         sMode191 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AE191( ) ;
         load1AE191( ) ;
         Gx_mode = sMode191 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound191 = (short)(0) ;
         initializeNonKey1AE191( ) ;
         sMode191 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1AE191( ) ;
         Gx_mode = sMode191 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1AE191( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1AE191( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01AE2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBROB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z1300AlbRObs, T01AE2_A1300AlbRObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z1300AlbRObs, T01AE2_A1300AlbRObs[0]) != 0 )
            {
               GXutil.writeLogln("talbre5:[seudo value changed for attri]"+"AlbRObs");
               GXutil.writeLogRaw("Old: ",Z1300AlbRObs);
               GXutil.writeLogRaw("Current: ",T01AE2_A1300AlbRObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBROB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1AE191( )
   {
      beforeValidate1AE191( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AE191( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1AE191( 0) ;
         checkOptimisticConcurrency1AE191( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1AE191( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1AE191( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01AE52 */
                  pr_default.execute(50, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin), A1300AlbRObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBROB");
                  if ( (pr_default.getStatus(50) == 1) )
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
            load1AE191( ) ;
         }
         endLevel1AE191( ) ;
      }
      closeExtendedTableCursors1AE191( ) ;
   }

   public void update1AE191( )
   {
      beforeValidate1AE191( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1AE191( ) ;
      }
      if ( ( nIsMod_191 != 0 ) || ( nIsDirty_191 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1AE191( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1AE191( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1AE191( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01AE53 */
                     pr_default.execute(51, new Object[] {A1300AlbRObs, A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBROB");
                     if ( (pr_default.getStatus(51) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBROB"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1AE191( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char7[0] = A396EmprCod ;
                        GXv_int3[0] = A44AlbRecCod ;
                        new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char7, GXv_int3) ;
                        talbre5_impl.this.A396EmprCod = GXv_char7[0] ;
                        talbre5_impl.this.A44AlbRecCod = GXv_int3[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1AE191( ) ;
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
            endLevel1AE191( ) ;
         }
      }
      closeExtendedTableCursors1AE191( ) ;
   }

   public void deferredUpdate1AE191( )
   {
   }

   public void delete1AE191( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1AE191( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1AE191( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1AE191( ) ;
         afterConfirm1AE191( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1AE191( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01AE54 */
               pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Byte.valueOf(A1299AlbRLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBROB");
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
      sMode191 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1AE191( ) ;
      Gx_mode = sMode191 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1AE191( )
   {
      standaloneModal1AE191( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1AE191( )
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

   public void scanStart1AE191( )
   {
      /* Scan By routine */
      /* Using cursor T01AE55 */
      pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      RcdFound191 = (short)(0) ;
      if ( (pr_default.getStatus(53) != 101) )
      {
         RcdFound191 = (short)(1) ;
         A1299AlbRLin = T01AE55_A1299AlbRLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1AE191( )
   {
      /* Scan next routine */
      pr_default.readNext(53);
      RcdFound191 = (short)(0) ;
      if ( (pr_default.getStatus(53) != 101) )
      {
         RcdFound191 = (short)(1) ;
         A1299AlbRLin = T01AE55_A1299AlbRLin[0] ;
      }
   }

   public void scanEnd1AE191( )
   {
      pr_default.close(53);
   }

   public void afterConfirm1AE191( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1AE191( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1AE191( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1AE191( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1AE191( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1AE191( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1AE191( )
   {
      edtAlbRLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLin_Enabled), 5, 0), !bGXsfl_438_Refreshing);
      edtAlbRObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRObs_Enabled), 5, 0), !bGXsfl_438_Refreshing);
   }

   public void send_integrity_lvl_hashes1AE191( )
   {
   }

   public void send_integrity_lvl_hashes1AE7( )
   {
   }

   public void subsflControlProps_438191( )
   {
      edtAlbRLin_Internalname = "ALBRLIN_"+sGXsfl_438_idx ;
      edtAlbRObs_Internalname = "ALBROBS_"+sGXsfl_438_idx ;
   }

   public void subsflControlProps_fel_438191( )
   {
      edtAlbRLin_Internalname = "ALBRLIN_"+sGXsfl_438_fel_idx ;
      edtAlbRObs_Internalname = "ALBROBS_"+sGXsfl_438_fel_idx ;
   }

   public void addRow1AE191( )
   {
      nGXsfl_438_idx = (int)(nGXsfl_438_idx+1) ;
      sGXsfl_438_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_438_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_438191( ) ;
      sendRow1AE191( ) ;
   }

   public void sendRow1AE191( )
   {
      Gridtalbre5_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtalbre5_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtalbre5_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtalbre5_level1item_Class, "") != 0 )
         {
            subGridtalbre5_level1item_Linesclass = subGridtalbre5_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtalbre5_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtalbre5_level1item_Backstyle = (byte)(0) ;
         subGridtalbre5_level1item_Backcolor = subGridtalbre5_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtalbre5_level1item_Class, "") != 0 )
         {
            subGridtalbre5_level1item_Linesclass = subGridtalbre5_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtalbre5_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtalbre5_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtalbre5_level1item_Class, "") != 0 )
         {
            subGridtalbre5_level1item_Linesclass = subGridtalbre5_level1item_Class+"Odd" ;
         }
         subGridtalbre5_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtalbre5_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtalbre5_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_438_idx) % (2))) == 0 )
         {
            subGridtalbre5_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtalbre5_level1item_Class, "") != 0 )
            {
               subGridtalbre5_level1item_Linesclass = subGridtalbre5_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtalbre5_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtalbre5_level1item_Class, "") != 0 )
            {
               subGridtalbre5_level1item_Linesclass = subGridtalbre5_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_191_" + sGXsfl_438_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 439,'',false,'" + sGXsfl_438_idx + "',438)\"" ;
      ROClassString = "Attribute" ;
      Gridtalbre5_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRLin_Internalname,GXutil.ltrim( localUtil.ntoc( A1299AlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1299AlbRLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,439);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(438),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_191_" + sGXsfl_438_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 440,'',false,'" + sGXsfl_438_idx + "',438)\"" ;
      ROClassString = "Attribute" ;
      Gridtalbre5_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRObs_Internalname,GXutil.rtrim( A1300AlbRObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,440);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(438),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridtalbre5_level1itemRow);
      send_integrity_lvl_hashes1AE191( ) ;
      GXCCtl = "Z1299AlbRLin_" + sGXsfl_438_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1299AlbRLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1300AlbRObs_" + sGXsfl_438_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1300AlbRObs));
      GXCCtl = "nRcdDeleted_191_" + sGXsfl_438_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_191, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_191_" + sGXsfl_438_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_191, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_191_" + sGXsfl_438_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_191, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vALBREF_" + sGXsfl_438_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV88AlbRef));
      GXCCtl = "vUNIDADES_" + sGXsfl_438_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV163Unidades));
      GXCCtl = "vVDISLOC_" + sGXsfl_438_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV164vDisLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRLIN_"+sGXsfl_438_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBROBS_"+sGXsfl_438_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtalbre5_level1itemContainer.AddRow(Gridtalbre5_level1itemRow);
   }

   public void readRow1AE191( )
   {
      nGXsfl_438_idx = (int)(nGXsfl_438_idx+1) ;
      sGXsfl_438_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_438_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_438191( ) ;
      edtAlbRLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRLIN_"+sGXsfl_438_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBROBS_"+sGXsfl_438_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "ALBRLIN_" + sGXsfl_438_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRLin_Internalname ;
         wbErr = true ;
         A1299AlbRLin = (byte)(0) ;
      }
      else
      {
         A1299AlbRLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbRLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A1300AlbRObs = httpContext.cgiGet( edtAlbRObs_Internalname) ;
      GXCCtl = "Z1299AlbRLin_" + sGXsfl_438_idx ;
      Z1299AlbRLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1300AlbRObs_" + sGXsfl_438_idx ;
      Z1300AlbRObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_191_" + sGXsfl_438_idx ;
      nRcdDeleted_191 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_191_" + sGXsfl_438_idx ;
      nRcdExists_191 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_191_" + sGXsfl_438_idx ;
      nIsMod_191 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbRLin_Enabled = edtAlbRLin_Enabled ;
   }

   public void confirmValues1AE0( )
   {
      nGXsfl_438_idx = 0 ;
      sGXsfl_438_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_438_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_438191( ) ;
      while ( nGXsfl_438_idx < nRC_GXsfl_438 )
      {
         nGXsfl_438_idx = (int)(nGXsfl_438_idx+1) ;
         sGXsfl_438_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_438_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_438191( ) ;
         httpContext.changePostValue( "Z1299AlbRLin_"+sGXsfl_438_idx, httpContext.cgiGet( "ZT_"+"Z1299AlbRLin_"+sGXsfl_438_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1299AlbRLin_"+sGXsfl_438_idx) ;
         httpContext.changePostValue( "Z1300AlbRObs_"+sGXsfl_438_idx, httpContext.cgiGet( "ZT_"+"Z1300AlbRObs_"+sGXsfl_438_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1300AlbRObs_"+sGXsfl_438_idx) ;
      }
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.talbre5", new String[] {GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV88AlbRef)),GXutil.URLEncode(GXutil.rtrim(AV163Unidades)),GXutil.URLEncode(GXutil.rtrim(AV164vDisLoc))}, new String[] {"AlbRecCod","CliCod","AlbRef","Unidades","vDisLoc"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TALBRE5");
      forbiddenHiddens.add("AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
      forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV44Modo, "")));
      forbiddenHiddens.add("Albrfenf", localUtil.format(AV85Albrfenf, "99/99/99"));
      forbiddenHiddens.add("AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("talbre5:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      forbiddenHiddens2 = new com.genexus.util.GXProperties() ;
      if ( isIns( )  )
      {
         forbiddenHiddens2.add("AlbRPieUti", localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"));
      }
      app.GxWebStd.gx_hidden_field( httpContext, "hsh2", httpContext.getEncryptedSignature( forbiddenHiddens2.toString(), GXKey));
      GXutil.writeLogInfo("talbre5:[ SendCondSecurityCheck value for]"+forbiddenHiddens2.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z317AlbStLot", GXutil.ltrim( localUtil.ntoc( Z317AlbStLot, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z46AlbREnt", GXutil.rtrim( Z46AlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z50AlbRLoc", GXutil.rtrim( Z50AlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z49AlbRFen", localUtil.dtoc( Z49AlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z55AlbRReo", GXutil.rtrim( Z55AlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z53AlbRPieReb", GXutil.ltrim( localUtil.ntoc( Z53AlbRPieReb, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z59AlbRUniReb", GXutil.ltrim( localUtil.ntoc( Z59AlbRUniReb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z48AlbRFecUlt", localUtil.dtoc( Z48AlbRFecUlt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1222AlbNumEti", GXutil.ltrim( localUtil.ntoc( Z1222AlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1291AlbRDes", GXutil.rtrim( Z1291AlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1301AlbRUlin", GXutil.ltrim( localUtil.ntoc( Z1301AlbRUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3613AlbRefDsc", GXutil.rtrim( Z3613AlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4290AlbPmPPza", GXutil.ltrim( localUtil.ntoc( Z4290AlbPmPPza, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4920AlbRGrm2", GXutil.ltrim( localUtil.ntoc( Z4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4921AlbRAnc", GXutil.ltrim( localUtil.ntoc( Z4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4922AlbPml", GXutil.ltrim( localUtil.ntoc( Z4922AlbPml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5743AlbRPre", GXutil.ltrim( localUtil.ntoc( Z5743AlbRPre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5744AlbRAju", GXutil.ltrim( localUtil.ntoc( Z5744AlbRAju, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5745AlbRRep", GXutil.ltrim( localUtil.ntoc( Z5745AlbRRep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5806AlbREnt2", GXutil.rtrim( Z5806AlbREnt2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6178AlbrUsu", GXutil.rtrim( Z6178AlbrUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6179AlbrHor", localUtil.ttoc( Z6179AlbrHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6180AlbrUniC", GXutil.ltrim( localUtil.ntoc( Z6180AlbrUniC, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6181AlbrPieC", GXutil.ltrim( localUtil.ntoc( Z6181AlbrPieC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6182AlbrNF", GXutil.rtrim( Z6182AlbrNF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6183AlbrFeNf", localUtil.dtoc( Z6183AlbrFeNf, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6184AlbrCfop", GXutil.rtrim( Z6184AlbrCfop));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3359AlbRDisCli", GXutil.rtrim( Z3359AlbRDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3360AlbRImp", GXutil.rtrim( Z3360AlbRImp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6463AlbRLote", GXutil.rtrim( Z6463AlbRLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6464AlbRTelar", GXutil.rtrim( Z6464AlbRTelar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6465AlbRLu", GXutil.ltrim( localUtil.ntoc( Z6465AlbRLu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4602AlbRMdlCod", GXutil.rtrim( Z4602AlbRMdlCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6470AlbRTara", GXutil.ltrim( localUtil.ntoc( Z6470AlbRTara, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6471AlbRUniB", GXutil.ltrim( localUtil.ntoc( Z6471AlbRUniB, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6488AlbDocPrv", GXutil.rtrim( Z6488AlbDocPrv));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6523AlbRUdas", GXutil.ltrim( localUtil.ntoc( Z6523AlbRUdas, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8023AlbColor", GXutil.rtrim( Z8023AlbColor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8024AlbOpsT", GXutil.rtrim( Z8024AlbOpsT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8025AlbOpsC", GXutil.rtrim( Z8025AlbOpsC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8026AlbOC", GXutil.rtrim( Z8026AlbOC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8027AlbHdri", GXutil.rtrim( Z8027AlbHdri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8028AlbNumB", GXutil.rtrim( Z8028AlbNumB));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8029AlbNumM", GXutil.rtrim( Z8029AlbNumM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8030AlbAncC", GXutil.ltrim( localUtil.ntoc( Z8030AlbAncC, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8031AlbDndC", GXutil.ltrim( localUtil.ntoc( Z8031AlbDndC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8032AlbAncCr", GXutil.ltrim( localUtil.ntoc( Z8032AlbAncCr, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8033AlbDndCr", GXutil.ltrim( localUtil.ntoc( Z8033AlbDndCr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8034AlbGalga", GXutil.ltrim( localUtil.ntoc( Z8034AlbGalga, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8035AlbMaqTej", GXutil.rtrim( Z8035AlbMaqTej));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8036AlbDmt", GXutil.ltrim( localUtil.ntoc( Z8036AlbDmt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9793AlbPdaC", GXutil.rtrim( Z9793AlbPdaC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9794AlbOStj", GXutil.rtrim( Z9794AlbOStj));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10358AlbTurno", GXutil.ltrim( localUtil.ntoc( Z10358AlbTurno, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6263AlbRTartC", GXutil.ltrim( localUtil.ntoc( Z6263AlbRTartC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z970ProceCod", GXutil.ltrim( localUtil.ntoc( Z970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1211TipEntCod", GXutil.ltrim( localUtil.ntoc( Z1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4792AlmCod", GXutil.ltrim( localUtil.ntoc( Z4792AlmCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1301AlbRUlin", GXutil.ltrim( localUtil.ntoc( O1301AlbRUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( O52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( O58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_438", GXutil.ltrim( localUtil.ntoc( nGXsfl_438_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N1211TipEntCod", GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N50AlbRLoc", GXutil.rtrim( A50AlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "N252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N45AlbRef", GXutil.rtrim( A45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "N49AlbRFen", localUtil.dtoc( A49AlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "N56AlbRUni", GXutil.rtrim( A56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "N55AlbRReo", GXutil.rtrim( A55AlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, "MODO", GXutil.rtrim( AV44Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRFENF", localUtil.dtoc( AV85Albrfenf, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBREF", GXutil.rtrim( AV88AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "vUNIDADES", GXutil.rtrim( AV163Unidades));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO", GXutil.rtrim( AV44Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCUM", GXutil.rtrim( AV18AlbCum));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV83AlbReccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDOC_6", GXutil.ltrim( localUtil.ntoc( AV97Doc_6, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDOCUMENTO", GXutil.rtrim( AV84Documento));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRFENF", localUtil.dtoc( AV85Albrfenf, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCECOD", GXutil.ltrim( localUtil.ntoc( AV87Procecod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUNIENT", GXutil.ltrim( localUtil.ntoc( AV69ALbRunient, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUNIC", GXutil.ltrim( localUtil.ntoc( AV94AlbRunic, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRPIEENT", GXutil.ltrim( localUtil.ntoc( AV89Albrpieent, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRPRE", GXutil.ltrim( localUtil.ntoc( AV90Albrpre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRFEN", localUtil.dtoc( AV96albrfen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRCFOP", GXutil.rtrim( AV91albrcfop));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRREO", GXutil.rtrim( AV92albrreo));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRNF", GXutil.rtrim( AV93albrnf));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPENTCOD", GXutil.ltrim( localUtil.ntoc( AV95TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPIEENTOLD", GXutil.ltrim( localUtil.ntoc( AV141PieEntold, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUNIENTOLD", GXutil.ltrim( localUtil.ntoc( AV142UniENtold, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBSTLOT", GXutil.ltrim( localUtil.ntoc( AV149AlbStLot, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDUNIE", GXutil.ltrim( localUtil.ntoc( AV154Oldunie, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPIEE", GXutil.ltrim( localUtil.ntoc( AV156oldpiee, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDUNIU", GXutil.ltrim( localUtil.ntoc( AV155olduniu, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPIEU", GXutil.ltrim( localUtil.ntoc( AV157oldpieu, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO_II", AV153Texto_ii);
      app.GxWebStd.gx_hidden_field( httpContext, "vVDISLOC", GXutil.rtrim( AV164vDisLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGFERRO", GXutil.ltrim( localUtil.ntoc( AV53FlagFerro, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGART", GXutil.ltrim( localUtil.ntoc( AV50FlagArt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG_ARTC", GXutil.ltrim( localUtil.ntoc( AV63Flag_artc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOMPOS", GXutil.rtrim( AV74Compos));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV168Pgmname));
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
      return formatLink("app.talbre5", new String[] {GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV88AlbRef)),GXutil.URLEncode(GXutil.rtrim(AV163Unidades)),GXutil.URLEncode(GXutil.rtrim(AV164vDisLoc))}, new String[] {"AlbRecCod","CliCod","AlbRef","Unidades","vDisLoc"})  ;
   }

   public String getPgmname( )
   {
      return "TALBRE5" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ENTRADA ALBARAN RECEPCION", "") ;
   }

   public void initializeNonKey1AE7( )
   {
      A45AlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A56AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      AV44Modo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Modo", AV44Modo);
      AV18AlbCum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      AV50FlagArt = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50FlagArt", GXutil.str( AV50FlagArt, 1, 0));
      AV63Flag_artc = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Flag_artc", GXutil.str( AV63Flag_artc, 1, 0));
      AV74Compos = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Compos", AV74Compos);
      AV84Documento = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84Documento", AV84Documento);
      AV85Albrfenf = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85Albrfenf", localUtil.format(AV85Albrfenf, "99/99/99"));
      AV87Procecod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87Procecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87Procecod), 4, 0));
      AV69ALbRunient = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69ALbRunient", GXutil.ltrimstr( AV69ALbRunient, 9, 2));
      AV94AlbRunic = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94AlbRunic", GXutil.ltrimstr( AV94AlbRunic, 9, 2));
      AV89Albrpieent = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Albrpieent", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Albrpieent), 6, 0));
      AV90Albrpre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90Albrpre", GXutil.ltrimstr( AV90Albrpre, 12, 5));
      AV96albrfen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96albrfen", localUtil.format(AV96albrfen, "99/99/99"));
      AV91albrcfop = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91albrcfop", AV91albrcfop);
      AV92albrreo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92albrreo", AV92albrreo);
      AV93albrnf = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93albrnf", AV93albrnf);
      AV95TipEntCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95TipEntCod), 4, 0));
      AV141PieEntold = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV141PieEntold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV141PieEntold), 6, 0));
      AV142UniENtold = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV142UniENtold", GXutil.ltrimstr( AV142UniENtold, 9, 2));
      AV149AlbStLot = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV149AlbStLot", GXutil.str( AV149AlbStLot, 1, 0));
      A317AlbStLot = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A317AlbStLot", GXutil.str( A317AlbStLot, 1, 0));
      AV154Oldunie = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV154Oldunie", GXutil.ltrimstr( AV154Oldunie, 9, 2));
      AV156oldpiee = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV156oldpiee", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV156oldpiee), 6, 0));
      AV155olduniu = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV155olduniu", GXutil.ltrimstr( AV155olduniu, 9, 2));
      AV157oldpieu = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV157oldpieu", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV157oldpieu), 6, 0));
      AV153Texto_ii = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV153Texto_ii", AV153Texto_ii);
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      A4291AlbPzaEst = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4291AlbPzaEst), 8, 0));
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      AV53FlagFerro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53FlagFerro", GXutil.str( AV53FlagFerro, 1, 0));
      AV159CtrlArt = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV159CtrlArt", GXutil.str( AV159CtrlArt, 1, 0));
      AV112Moda21 = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112Moda21", GXutil.str( AV112Moda21, 1, 0));
      AV77Kohler = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77Kohler", GXutil.str( AV77Kohler, 1, 0));
      AV103Erfoc = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103Erfoc", GXutil.str( AV103Erfoc, 1, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A46AlbREnt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A53AlbRPieReb = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A59AlbRUniReb = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
      A1211TipEntCod = (short)(0) ;
      n1211TipEntCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      A1212TipEntNom = "" ;
      n1212TipEntNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
      A1222AlbNumEti = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
      A1291AlbRDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
      A970ProceCod = (short)(0) ;
      n970ProceCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      A971ProceNom = "" ;
      n971ProceNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      A1301AlbRUlin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      A3613AlbRefDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrimstr( A4290AlbPmPPza, 6, 3));
      A4920AlbRGrm2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
      A4921AlbRAnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
      A4922AlbPml = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4922AlbPml), 4, 0));
      A5743AlbRPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5743AlbRPre", GXutil.ltrimstr( A5743AlbRPre, 12, 5));
      A5744AlbRAju = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5744AlbRAju", GXutil.ltrimstr( A5744AlbRAju, 8, 2));
      A5745AlbRRep = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5745AlbRRep", GXutil.str( A5745AlbRRep, 1, 0));
      A5806AlbREnt2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", A5806AlbREnt2);
      A6184AlbrCfop = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6184AlbrCfop", A6184AlbrCfop);
      A3359AlbRDisCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3359AlbRDisCli", A3359AlbRDisCli);
      A6263AlbRTartC = (short)(0) ;
      n6263AlbRTartC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
      A6264AlbRTartD = "" ;
      n6264AlbRTartD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
      A6488AlbDocPrv = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6488AlbDocPrv", A6488AlbDocPrv);
      A4792AlmCod = (byte)(0) ;
      n4792AlmCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.str( A4792AlmCod, 1, 0));
      A4793AlmNom = "" ;
      n4793AlmNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4793AlmNom", A4793AlmNom);
      A8023AlbColor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8023AlbColor", A8023AlbColor);
      A8024AlbOpsT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8024AlbOpsT", A8024AlbOpsT);
      A8025AlbOpsC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8025AlbOpsC", A8025AlbOpsC);
      A8026AlbOC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8026AlbOC", A8026AlbOC);
      A8027AlbHdri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8027AlbHdri", A8027AlbHdri);
      A8028AlbNumB = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8028AlbNumB", A8028AlbNumB);
      A8029AlbNumM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", A8029AlbNumM);
      A8030AlbAncC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8030AlbAncC", GXutil.ltrimstr( A8030AlbAncC, 5, 2));
      A8031AlbDndC = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8031AlbDndC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8031AlbDndC), 4, 0));
      A8032AlbAncCr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8032AlbAncCr", GXutil.ltrimstr( A8032AlbAncCr, 5, 2));
      A8033AlbDndCr = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8033AlbDndCr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8033AlbDndCr), 4, 0));
      A8034AlbGalga = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8034AlbGalga", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8034AlbGalga), 3, 0));
      A8035AlbMaqTej = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8035AlbMaqTej", A8035AlbMaqTej);
      A8036AlbDmt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8036AlbDmt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8036AlbDmt), 3, 0));
      A9793AlbPdaC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9793AlbPdaC", A9793AlbPdaC);
      A9794AlbOStj = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9794AlbOStj", A9794AlbOStj);
      A10358AlbTurno = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10358AlbTurno", GXutil.str( A10358AlbTurno, 1, 0));
      A8723CliEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", A8723CliEst);
      A47AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      A50AlbRLoc = AV164vDisLoc ;
      httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
      A49AlbRFen = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      A55AlbRReo = httpContext.getMessage( "NO", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      A48AlbRFecUlt = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      A6178AlbrUsu = AV17UsurCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A6178AlbrUsu", A6178AlbrUsu);
      A6179AlbrHor = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A6180AlbrUniC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrimstr( A6180AlbrUniC, 9, 2));
      A6181AlbrPieC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6181AlbrPieC), 6, 0));
      A6182AlbrNF = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", A6182AlbrNF);
      A6183AlbrFeNf = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6183AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
      A3360AlbRImp = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A3360AlbRImp", A3360AlbRImp);
      A6463AlbRLote = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
      A6464AlbRTelar = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
      A6465AlbRLu = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
      A4602AlbRMdlCod = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
      A6470AlbRTara = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
      A6471AlbRUniB = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6471AlbRUniB", GXutil.ltrimstr( A6471AlbRUniB, 9, 2));
      A6523AlbRUdas = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6523AlbRUdas", GXutil.ltrimstr( A6523AlbRUdas, 9, 2));
      O1301AlbRUlin = A1301AlbRUlin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      O52AlbRPieEnt = A52AlbRPieEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      O58AlbRUniEnt = A58AlbRUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      Z45AlbRef = "" ;
      Z56AlbRUni = "" ;
      Z47AlbREst = (byte)(0) ;
      Z317AlbStLot = (byte)(0) ;
      Z46AlbREnt = "" ;
      Z52AlbRPieEnt = 0 ;
      Z50AlbRLoc = "" ;
      Z49AlbRFen = GXutil.nullDate() ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z55AlbRReo = "" ;
      Z54AlbRPieUti = 0 ;
      Z53AlbRPieReb = 0 ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      Z1222AlbNumEti = (short)(0) ;
      Z1291AlbRDes = "" ;
      Z1301AlbRUlin = (byte)(0) ;
      Z3613AlbRefDsc = "" ;
      Z4290AlbPmPPza = DecimalUtil.ZERO ;
      Z4920AlbRGrm2 = (short)(0) ;
      Z4921AlbRAnc = (short)(0) ;
      Z4922AlbPml = (short)(0) ;
      Z5743AlbRPre = DecimalUtil.ZERO ;
      Z5744AlbRAju = DecimalUtil.ZERO ;
      Z5745AlbRRep = (byte)(0) ;
      Z5806AlbREnt2 = "" ;
      Z6178AlbrUsu = "" ;
      Z6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      Z6180AlbrUniC = DecimalUtil.ZERO ;
      Z6181AlbrPieC = 0 ;
      Z6182AlbrNF = "" ;
      Z6183AlbrFeNf = GXutil.nullDate() ;
      Z6184AlbrCfop = "" ;
      Z3359AlbRDisCli = "" ;
      Z3360AlbRImp = "" ;
      Z6463AlbRLote = "" ;
      Z6464AlbRTelar = "" ;
      Z6465AlbRLu = DecimalUtil.ZERO ;
      Z4602AlbRMdlCod = "" ;
      Z6470AlbRTara = DecimalUtil.ZERO ;
      Z6471AlbRUniB = DecimalUtil.ZERO ;
      Z6488AlbDocPrv = "" ;
      Z6523AlbRUdas = DecimalUtil.ZERO ;
      Z8023AlbColor = "" ;
      Z8024AlbOpsT = "" ;
      Z8025AlbOpsC = "" ;
      Z8026AlbOC = "" ;
      Z8027AlbHdri = "" ;
      Z8028AlbNumB = "" ;
      Z8029AlbNumM = "" ;
      Z8030AlbAncC = DecimalUtil.ZERO ;
      Z8031AlbDndC = (short)(0) ;
      Z8032AlbAncCr = DecimalUtil.ZERO ;
      Z8033AlbDndCr = (short)(0) ;
      Z8034AlbGalga = (short)(0) ;
      Z8035AlbMaqTej = "" ;
      Z8036AlbDmt = (short)(0) ;
      Z9793AlbPdaC = "" ;
      Z9794AlbOStj = "" ;
      Z10358AlbTurno = (byte)(0) ;
      Z6263AlbRTartC = (short)(0) ;
      Z840TrnCod = (short)(0) ;
      Z970ProceCod = (short)(0) ;
      Z1211TipEntCod = (short)(0) ;
      Z4792AlmCod = (byte)(0) ;
   }

   public void initAll1AE7( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      initializeNonKey1AE7( ) ;
   }

   public void standaloneModalInsert( )
   {
      AV44Modo = iV44Modo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Modo", AV44Modo);
      A56AlbRUni = i56AlbRUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A45AlbRef = i45AlbRef ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A50AlbRLoc = i50AlbRLoc ;
      httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
      A49AlbRFen = i49AlbRFen ;
      httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      A6183AlbrFeNf = i6183AlbrFeNf ;
      httpContext.ajax_rsp_assign_attri("", false, "A6183AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
      A55AlbRReo = i55AlbRReo ;
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      A48AlbRFecUlt = i48AlbRFecUlt ;
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      A6182AlbrNF = i6182AlbrNF ;
      httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", A6182AlbrNF);
      A6179AlbrHor = i6179AlbrHor ;
      httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A3360AlbRImp = i3360AlbRImp ;
      httpContext.ajax_rsp_assign_attri("", false, "A3360AlbRImp", A3360AlbRImp);
      A4602AlbRMdlCod = i4602AlbRMdlCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
      A6463AlbRLote = i6463AlbRLote ;
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
      A6464AlbRTelar = i6464AlbRTelar ;
      httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
      A6465AlbRLu = i6465AlbRLu ;
      httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
      A6470AlbRTara = i6470AlbRTara ;
      httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrimstr( A6470AlbRTara, 6, 2));
      A6471AlbRUniB = i6471AlbRUniB ;
      httpContext.ajax_rsp_assign_attri("", false, "A6471AlbRUniB", GXutil.ltrimstr( A6471AlbRUniB, 9, 2));
      A6523AlbRUdas = i6523AlbRUdas ;
      httpContext.ajax_rsp_assign_attri("", false, "A6523AlbRUdas", GXutil.ltrimstr( A6523AlbRUdas, 9, 2));
      A6178AlbrUsu = i6178AlbrUsu ;
      httpContext.ajax_rsp_assign_attri("", false, "A6178AlbrUsu", A6178AlbrUsu);
   }

   public void initializeNonKey1AE191( )
   {
      A1300AlbRObs = "" ;
      Z1300AlbRObs = "" ;
   }

   public void initAll1AE191( )
   {
      A1299AlbRLin = (byte)(0) ;
      initializeNonKey1AE191( ) ;
   }

   public void standaloneModalInsert1AE191( )
   {
      A1301AlbRUlin = i1301AlbRUlin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1301AlbRUlin), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241564523", true, true);
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
      httpContext.AddJavascriptSource("talbre5.js", "?20268241564524", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties191( )
   {
      edtAlbRLin_Enabled = defedtAlbRLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLin_Enabled), 5, 0), !bGXsfl_438_Refreshing);
   }

   public void startgridcontrol438( )
   {
      Gridtalbre5_level1itemContainer.AddObjectProperty("GridName", "Gridtalbre5_level1item");
      Gridtalbre5_level1itemContainer.AddObjectProperty("Header", subGridtalbre5_level1item_Header);
      Gridtalbre5_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridtalbre5_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtalbre5_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtalbre5_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtalbre5_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtalbre5_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtalbre5_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtalbre5_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtalbre5_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1299AlbRLin, (byte)(2), (byte)(0), ".", "")));
      Gridtalbre5_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtalbre5_level1itemContainer.AddColumnProperties(Gridtalbre5_level1itemColumn);
      Gridtalbre5_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtalbre5_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A1300AlbRObs));
      Gridtalbre5_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtalbre5_level1itemContainer.AddColumnProperties(Gridtalbre5_level1itemColumn);
      Gridtalbre5_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtalbre5_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtalbre5_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtalbre5_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtalbre5_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtalbre5_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtalbre5_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtalbre5_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtalbre5_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtalbre5_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtalbre5_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtalbre5_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtalbre5_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtalbre5_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      divToolbarcell_Internalname = "TOOLBARCELL" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtAlbRef_Internalname = "ALBREF" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      edtTrnNom_Internalname = "TRNNOM" ;
      edtAlbREnt_Internalname = "ALBRENT" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      edtAlbRLoc_Internalname = "ALBRLOC" ;
      edtAlbRFen_Internalname = "ALBRFEN" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      cmbAlbRReo.setInternalname( "ALBRREO" );
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      edtAlbRPieReb_Internalname = "ALBRPIEREB" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      edtAlbRUniReb_Internalname = "ALBRUNIREB" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      edtAlbRFecUlt_Internalname = "ALBRFECULT" ;
      cmbAlbREst.setInternalname( "ALBREST" );
      edtTipEntCod_Internalname = "TIPENTCOD" ;
      edtTipEntNom_Internalname = "TIPENTNOM" ;
      edtAlbNumEti_Internalname = "ALBNUMETI" ;
      edtAlbRDes_Internalname = "ALBRDES" ;
      edtProceCod_Internalname = "PROCECOD" ;
      edtProceNom_Internalname = "PROCENOM" ;
      edtAlbRUlin_Internalname = "ALBRULIN" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      edtAlbPmPPza_Internalname = "ALBPMPPZA" ;
      edtAlbPzaEst_Internalname = "ALBPZAEST" ;
      edtAlbRGrm2_Internalname = "ALBRGRM2" ;
      edtAlbRAnc_Internalname = "ALBRANC" ;
      edtAlbPml_Internalname = "ALBPML" ;
      edtAlbRPre_Internalname = "ALBRPRE" ;
      edtAlbRAju_Internalname = "ALBRAJU" ;
      chkAlbRRep.setInternalname( "ALBRREP" );
      edtAlbREnt2_Internalname = "ALBRENT2" ;
      edtAlbrUsu_Internalname = "ALBRUSU" ;
      edtAlbrHor_Internalname = "ALBRHOR" ;
      edtAlbrUniC_Internalname = "ALBRUNIC" ;
      edtAlbrPieC_Internalname = "ALBRPIEC" ;
      edtAlbrNF_Internalname = "ALBRNF" ;
      edtAlbrFeNf_Internalname = "ALBRFENF" ;
      edtAlbrCfop_Internalname = "ALBRCFOP" ;
      edtAlbRDisCli_Internalname = "ALBRDISCLI" ;
      edtAlbRTartC_Internalname = "ALBRTARTC" ;
      edtAlbRTartD_Internalname = "ALBRTARTD" ;
      edtAlbRImp_Internalname = "ALBRIMP" ;
      edtAlbRLote_Internalname = "ALBRLOTE" ;
      edtAlbRTelar_Internalname = "ALBRTELAR" ;
      edtAlbRLu_Internalname = "ALBRLU" ;
      edtAlbRMdlCod_Internalname = "ALBRMDLCOD" ;
      edtAlbRTara_Internalname = "ALBRTARA" ;
      edtAlbRUniB_Internalname = "ALBRUNIB" ;
      edtAlbDocPrv_Internalname = "ALBDOCPRV" ;
      edtAlbRUdas_Internalname = "ALBRUDAS" ;
      edtAlmCod_Internalname = "ALMCOD" ;
      edtAlmNom_Internalname = "ALMNOM" ;
      edtAlbColor_Internalname = "ALBCOLOR" ;
      edtAlbOpsT_Internalname = "ALBOPST" ;
      edtAlbOpsC_Internalname = "ALBOPSC" ;
      edtAlbOC_Internalname = "ALBOC" ;
      edtAlbHdri_Internalname = "ALBHDRI" ;
      edtAlbNumB_Internalname = "ALBNUMB" ;
      edtAlbNumM_Internalname = "ALBNUMM" ;
      edtAlbAncC_Internalname = "ALBANCC" ;
      edtAlbDndC_Internalname = "ALBDNDC" ;
      edtAlbAncCr_Internalname = "ALBANCCR" ;
      edtAlbDndCr_Internalname = "ALBDNDCR" ;
      edtAlbGalga_Internalname = "ALBGALGA" ;
      edtAlbMaqTej_Internalname = "ALBMAQTEJ" ;
      edtAlbDmt_Internalname = "ALBDMT" ;
      edtAlbPdaC_Internalname = "ALBPDAC" ;
      edtAlbOStj_Internalname = "ALBOSTJ" ;
      edtAlbStLot_Internalname = "ALBSTLOT" ;
      edtAlbTurno_Internalname = "ALBTURNO" ;
      edtCliEst_Internalname = "CLIEST" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtAlbRLin_Internalname = "ALBRLIN" ;
      edtAlbRObs_Internalname = "ALBROBS" ;
      divLevel1table_Internalname = "LEVEL1TABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridtalbre5_level1item_Internalname = "GRIDTALBRE5_LEVEL1ITEM" ;
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
      subGridtalbre5_level1item_Allowcollapsing = (byte)(0) ;
      subGridtalbre5_level1item_Allowselection = (byte)(0) ;
      subGridtalbre5_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "ENTRADA ALBARAN RECEPCION", "") );
      edtAlbRObs_Jsonclick = "" ;
      edtAlbRLin_Jsonclick = "" ;
      subGridtalbre5_level1item_Class = "Grid" ;
      subGridtalbre5_level1item_Backcolorstyle = (byte)(0) ;
      edtAlbRObs_Enabled = 1 ;
      edtAlbRLin_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtCliEst_Jsonclick = "" ;
      edtCliEst_Enabled = 0 ;
      edtAlbTurno_Jsonclick = "" ;
      edtAlbTurno_Enabled = 1 ;
      edtAlbStLot_Jsonclick = "" ;
      edtAlbStLot_Enabled = 1 ;
      edtAlbOStj_Jsonclick = "" ;
      edtAlbOStj_Enabled = 1 ;
      edtAlbPdaC_Jsonclick = "" ;
      edtAlbPdaC_Enabled = 1 ;
      edtAlbDmt_Jsonclick = "" ;
      edtAlbDmt_Enabled = 1 ;
      edtAlbMaqTej_Jsonclick = "" ;
      edtAlbMaqTej_Enabled = 1 ;
      edtAlbGalga_Jsonclick = "" ;
      edtAlbGalga_Enabled = 1 ;
      edtAlbDndCr_Jsonclick = "" ;
      edtAlbDndCr_Enabled = 1 ;
      edtAlbAncCr_Jsonclick = "" ;
      edtAlbAncCr_Enabled = 1 ;
      edtAlbDndC_Jsonclick = "" ;
      edtAlbDndC_Enabled = 1 ;
      edtAlbAncC_Jsonclick = "" ;
      edtAlbAncC_Enabled = 1 ;
      edtAlbNumM_Jsonclick = "" ;
      edtAlbNumM_Enabled = 1 ;
      edtAlbNumB_Jsonclick = "" ;
      edtAlbNumB_Enabled = 1 ;
      edtAlbHdri_Jsonclick = "" ;
      edtAlbHdri_Enabled = 1 ;
      edtAlbOC_Jsonclick = "" ;
      edtAlbOC_Enabled = 1 ;
      edtAlbOpsC_Jsonclick = "" ;
      edtAlbOpsC_Enabled = 1 ;
      edtAlbOpsT_Jsonclick = "" ;
      edtAlbOpsT_Enabled = 1 ;
      edtAlbColor_Jsonclick = "" ;
      edtAlbColor_Enabled = 1 ;
      edtAlmNom_Jsonclick = "" ;
      edtAlmNom_Enabled = 0 ;
      edtAlmCod_Jsonclick = "" ;
      edtAlmCod_Enabled = 1 ;
      edtAlbRUdas_Jsonclick = "" ;
      edtAlbRUdas_Enabled = 1 ;
      edtAlbDocPrv_Jsonclick = "" ;
      edtAlbDocPrv_Enabled = 1 ;
      edtAlbRUniB_Jsonclick = "" ;
      edtAlbRUniB_Enabled = 1 ;
      edtAlbRTara_Jsonclick = "" ;
      edtAlbRTara_Enabled = 1 ;
      edtAlbRMdlCod_Jsonclick = "" ;
      edtAlbRMdlCod_Enabled = 1 ;
      edtAlbRLu_Jsonclick = "" ;
      edtAlbRLu_Enabled = 1 ;
      edtAlbRTelar_Jsonclick = "" ;
      edtAlbRTelar_Enabled = 1 ;
      edtAlbRLote_Jsonclick = "" ;
      edtAlbRLote_Enabled = 1 ;
      edtAlbRImp_Jsonclick = "" ;
      edtAlbRImp_Enabled = 1 ;
      edtAlbRTartD_Jsonclick = "" ;
      edtAlbRTartD_Enabled = 0 ;
      edtAlbRTartC_Jsonclick = "" ;
      edtAlbRTartC_Enabled = 1 ;
      edtAlbRDisCli_Jsonclick = "" ;
      edtAlbRDisCli_Enabled = 1 ;
      edtAlbrCfop_Jsonclick = "" ;
      edtAlbrCfop_Enabled = 1 ;
      edtAlbrFeNf_Jsonclick = "" ;
      edtAlbrFeNf_Enabled = 0 ;
      edtAlbrNF_Jsonclick = "" ;
      edtAlbrNF_Enabled = 1 ;
      edtAlbrPieC_Jsonclick = "" ;
      edtAlbrPieC_Enabled = 1 ;
      edtAlbrUniC_Jsonclick = "" ;
      edtAlbrUniC_Enabled = 1 ;
      edtAlbrHor_Jsonclick = "" ;
      edtAlbrHor_Enabled = 1 ;
      edtAlbrUsu_Jsonclick = "" ;
      edtAlbrUsu_Enabled = 1 ;
      edtAlbREnt2_Jsonclick = "" ;
      edtAlbREnt2_Enabled = 1 ;
      chkAlbRRep.setEnabled( 1 );
      edtAlbRAju_Jsonclick = "" ;
      edtAlbRAju_Enabled = 1 ;
      edtAlbRPre_Jsonclick = "" ;
      edtAlbRPre_Enabled = 1 ;
      edtAlbPml_Jsonclick = "" ;
      edtAlbPml_Enabled = 1 ;
      edtAlbRAnc_Jsonclick = "" ;
      edtAlbRAnc_Enabled = 1 ;
      edtAlbRGrm2_Jsonclick = "" ;
      edtAlbRGrm2_Enabled = 1 ;
      edtAlbPzaEst_Jsonclick = "" ;
      edtAlbPzaEst_Enabled = 0 ;
      edtAlbPmPPza_Jsonclick = "" ;
      edtAlbPmPPza_Enabled = 1 ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRefDsc_Enabled = 1 ;
      edtAlbRUlin_Jsonclick = "" ;
      edtAlbRUlin_Enabled = 0 ;
      edtProceNom_Jsonclick = "" ;
      edtProceNom_Enabled = 0 ;
      edtProceCod_Jsonclick = "" ;
      edtProceCod_Enabled = 1 ;
      edtAlbRDes_Jsonclick = "" ;
      edtAlbRDes_Enabled = 1 ;
      edtAlbNumEti_Jsonclick = "" ;
      edtAlbNumEti_Enabled = 1 ;
      edtTipEntNom_Jsonclick = "" ;
      edtTipEntNom_Enabled = 0 ;
      edtTipEntCod_Jsonclick = "" ;
      edtTipEntCod_Enabled = 1 ;
      cmbAlbREst.setJsonclick( "" );
      cmbAlbREst.setEnabled( 1 );
      edtAlbRFecUlt_Jsonclick = "" ;
      edtAlbRFecUlt_Enabled = 0 ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Enabled = 0 ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Enabled = 0 ;
      edtAlbRUniReb_Jsonclick = "" ;
      edtAlbRUniReb_Enabled = 1 ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniUti_Enabled = 1 ;
      edtAlbRPieReb_Jsonclick = "" ;
      edtAlbRPieReb_Enabled = 1 ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRPieUti_Enabled = 1 ;
      cmbAlbRReo.setJsonclick( "" );
      cmbAlbRReo.setEnabled( 1 );
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniEnt_Enabled = 1 ;
      edtAlbRFen_Jsonclick = "" ;
      edtAlbRFen_Enabled = 1 ;
      edtAlbRLoc_Jsonclick = "" ;
      edtAlbRLoc_Enabled = 1 ;
      cmbAlbRUni.setJsonclick( "" );
      cmbAlbRUni.setEnabled( 1 );
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Enabled = 1 ;
      edtAlbREnt_Jsonclick = "" ;
      edtAlbREnt_Enabled = 1 ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnNom_Enabled = 0 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 1 ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRef_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
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

   public void xc_76_1AE7( String Gx_mode ,
                           String A396EmprCod ,
                           int A44AlbRecCod ,
                           byte AV53FlagFerro ,
                           String A45AlbRef )
   {
      if ( isIns( )  && (0==A44AlbRecCod) && ( AV53FlagFerro == 0 ) && true /* Level */ && true /* After */ )
      {
         GXv_int3[0] = A44AlbRecCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "020100", GXv_int3) ;
         A44AlbRecCod = GXv_int3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_78_1AE7( String A396EmprCod ,
                           int A252CliCod ,
                           String A45AlbRef ,
                           byte AV159CtrlArt ,
                           String A3613AlbRefDsc )
   {
      if ( ( AV159CtrlArt == 1 ) && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) && true /* Level */ )
      {
         GXv_int9[0] = AV50FlagArt ;
         new app.core.pexiser(remoteHandle, context).execute( A396EmprCod, A252CliCod, A45AlbRef, GXv_int9) ;
         AV50FlagArt = (byte)((byte)(GXv_int9[0])) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50FlagArt", GXutil.str( AV50FlagArt, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV50FlagArt, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_79_1AE7( String A396EmprCod ,
                           int A252CliCod ,
                           String A45AlbRef ,
                           String A3613AlbRefDsc ,
                           byte AV63Flag_artc )
   {
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char5[0] = A45AlbRef ;
         GXv_char4[0] = A3613AlbRefDsc ;
         GXv_int6[0] = AV63Flag_artc ;
         new app.pbusard(remoteHandle, context).execute( GXv_char7, GXv_int3, GXv_char5, GXv_char4, GXv_int6) ;
         A396EmprCod = GXv_char7[0] ;
         A252CliCod = GXv_int3[0] ;
         A45AlbRef = GXv_char5[0] ;
         A3613AlbRefDsc = GXv_char4[0] ;
         AV63Flag_artc = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         httpContext.ajax_rsp_assign_attri("", false, "AV63Flag_artc", GXutil.str( AV63Flag_artc, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3613AlbRefDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV63Flag_artc, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_80_1AE7( String A396EmprCod ,
                           int A252CliCod ,
                           String A45AlbRef ,
                           String A6264AlbRTartD ,
                           String AV74Compos ,
                           short A6263AlbRTartC ,
                           java.math.BigDecimal A6465AlbRLu ,
                           byte AV112Moda21 )
   {
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) && ( AV112Moda21 == 0 ) )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char5[0] = A45AlbRef ;
         GXv_char4[0] = A6264AlbRTartD ;
         GXv_char2[0] = AV74Compos ;
         GXv_int9[0] = A6263AlbRTartC ;
         GXv_decimal8[0] = A6465AlbRLu ;
         new app.pbusar4(remoteHandle, context).execute( GXv_char7, GXv_int3, GXv_char5, GXv_char4, GXv_char2, GXv_int9, GXv_decimal8) ;
         A396EmprCod = GXv_char7[0] ;
         A252CliCod = GXv_int3[0] ;
         A45AlbRef = GXv_char5[0] ;
         A6264AlbRTartD = GXv_char4[0] ;
         AV74Compos = GXv_char2[0] ;
         A6263AlbRTartC = GXv_int9[0] ;
         A6465AlbRLu = GXv_decimal8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", A6264AlbRTartD);
         httpContext.ajax_rsp_assign_attri("", false, "AV74Compos", AV74Compos);
         httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6263AlbRTartC), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrimstr( A6465AlbRLu, 6, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6264AlbRTartD))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV74Compos))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6263AlbRTartC, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6465AlbRLu, (byte)(6), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_81_1AE7( String Gx_mode ,
                           String A396EmprCod ,
                           int A252CliCod ,
                           String A45AlbRef ,
                           short A4920AlbRGrm2 ,
                           short A4921AlbRAnc ,
                           byte AV77Kohler )
   {
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) && ( AV77Kohler == 0 ) && isIns( )  )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char5[0] = A45AlbRef ;
         GXv_int9[0] = A4920AlbRGrm2 ;
         GXv_int1[0] = A4921AlbRAnc ;
         new app.pbusar5(remoteHandle, context).execute( GXv_char7, GXv_int3, GXv_char5, GXv_int9, GXv_int1) ;
         A396EmprCod = GXv_char7[0] ;
         A252CliCod = GXv_int3[0] ;
         A45AlbRef = GXv_char5[0] ;
         A4920AlbRGrm2 = GXv_int9[0] ;
         A4921AlbRAnc = GXv_int1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_82_1AE7( String Gx_mode ,
                           String A396EmprCod ,
                           String A6463AlbRLote ,
                           String A4602AlbRMdlCod ,
                           String A6464AlbRTelar ,
                           byte AV149AlbStLot ,
                           byte AV103Erfoc ,
                           java.util.Date A49AlbRFen )
   {
      if ( ( AV103Erfoc == 1 ) && ( ( GXutil.strcmp(A6463AlbRLote, " ") != 0 ) && ( GXutil.strcmp(A4602AlbRMdlCod, " ") != 0 ) && ( GXutil.strcmp(A6464AlbRTelar, " ") != 0 ) ) && true /* After */ && true /* Level */ && isIns( )  )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_char5[0] = A6463AlbRLote ;
         GXv_char4[0] = A4602AlbRMdlCod ;
         GXv_char2[0] = A6464AlbRTelar ;
         GXv_int6[0] = AV149AlbStLot ;
         new app.pctrlote(remoteHandle, context).execute( GXv_char7, GXv_char5, GXv_char4, GXv_char2, GXv_int6) ;
         A396EmprCod = GXv_char7[0] ;
         A6463AlbRLote = GXv_char5[0] ;
         A4602AlbRMdlCod = GXv_char4[0] ;
         A6464AlbRTelar = GXv_char2[0] ;
         AV149AlbStLot = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
         httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", A6464AlbRTelar);
         httpContext.ajax_rsp_assign_attri("", false, "AV149AlbStLot", GXutil.str( AV149AlbStLot, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6463AlbRLote))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4602AlbRMdlCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6464AlbRTelar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV149AlbStLot, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridtalbre5_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_438191( ) ;
      while ( nGXsfl_438_idx <= nRC_GXsfl_438 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1AE191( ) ;
         standaloneModal1AE191( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1AE191( ) ;
         nGXsfl_438_idx = (int)(nGXsfl_438_idx+1) ;
         sGXsfl_438_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_438_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_438191( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtalbre5_level1itemContainer)) ;
      /* End function gxnrGridtalbre5_level1item_newrow */
   }

   public void init_web_controls( )
   {
      cmbAlbRUni.setName( "ALBRUNI" );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      cmbAlbRReo.setName( "ALBRREO" );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A55AlbRReo)==0) )
         {
            A55AlbRReo = httpContext.getMessage( "NO", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         }
      }
      cmbAlbREst.setName( "ALBREST" );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A47AlbREst) )
         {
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
      chkAlbRRep.setName( "ALBRREP" );
      chkAlbRRep.setWebtags( "" );
      chkAlbRRep.setCaption( httpContext.getMessage( "Mostrar en Reportes", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkAlbRRep.getInternalname(), "TitleCaption", chkAlbRRep.getCaption(), true);
      chkAlbRRep.setCheckedValue( "0" );
      A5745AlbRRep = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A5745AlbRRep, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5745AlbRRep", GXutil.str( A5745AlbRRep, 1, 0));
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01AE27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01AE27_A407EmprNom[0] ;
      n407EmprNom = T01AE27_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(25);
      GX_FocusControl = edtAlbRef_Internalname ;
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
      /* Using cursor T01AE27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01AE27_A407EmprNom[0] ;
      n407EmprNom = T01AE27_n407EmprNom[0] ;
      pr_default.close(25);
      /* Using cursor T01AE28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T01AE28_A279CliNom[0] ;
      A8723CliEst = T01AE28_A8723CliEst[0] ;
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", GXutil.rtrim( A8723CliEst));
   }

   public void valid_Albreccod( )
   {
      A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValue())) ;
      cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      n44AlbRecCod = false ;
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      A55AlbRReo = cmbAlbRReo.getValue() ;
      cmbAlbRReo.setValue( A55AlbRReo );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      if ( isIns( )  && ( ! (0==A44AlbRecCod) ) && ( AV53FlagFerro == 0 ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Albaran inexistente", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
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
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         cmbAlbRReo.setValue( A55AlbRReo );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      }
      A5745AlbRRep = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A5745AlbRRep, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
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
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", GXutil.rtrim( A46AlbREnt));
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", GXutil.rtrim( A50AlbRLoc));
      httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", GXutil.rtrim( A55AlbRReo));
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrim( localUtil.ntoc( A53AlbRPieReb, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrim( localUtil.ntoc( A59AlbRUniReb, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrim( localUtil.ntoc( A1222AlbNumEti, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", GXutil.rtrim( A1291AlbRDes));
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1301AlbRUlin", GXutil.ltrim( localUtil.ntoc( A1301AlbRUlin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", GXutil.rtrim( A3613AlbRefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4290AlbPmPPza", GXutil.ltrim( localUtil.ntoc( A4290AlbPmPPza, (byte)(6), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4922AlbPml", GXutil.ltrim( localUtil.ntoc( A4922AlbPml, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5743AlbRPre", GXutil.ltrim( localUtil.ntoc( A5743AlbRPre, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5744AlbRAju", GXutil.ltrim( localUtil.ntoc( A5744AlbRAju, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5745AlbRRep", GXutil.ltrim( localUtil.ntoc( A5745AlbRRep, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5806AlbREnt2", GXutil.rtrim( A5806AlbREnt2));
      httpContext.ajax_rsp_assign_attri("", false, "A6178AlbrUsu", GXutil.rtrim( A6178AlbrUsu));
      httpContext.ajax_rsp_assign_attri("", false, "A6179AlbrHor", localUtil.ttoc( A6179AlbrHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A6182AlbrNF", GXutil.rtrim( A6182AlbrNF));
      httpContext.ajax_rsp_assign_attri("", false, "A6183AlbrFeNf", localUtil.format(A6183AlbrFeNf, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A6184AlbrCfop", GXutil.rtrim( A6184AlbrCfop));
      httpContext.ajax_rsp_assign_attri("", false, "A3359AlbRDisCli", GXutil.rtrim( A3359AlbRDisCli));
      httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrim( localUtil.ntoc( A6263AlbRTartC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3360AlbRImp", GXutil.rtrim( A3360AlbRImp));
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", GXutil.rtrim( A6463AlbRLote));
      httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", GXutil.rtrim( A6464AlbRTelar));
      httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrim( localUtil.ntoc( A6465AlbRLu, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", GXutil.rtrim( A4602AlbRMdlCod));
      httpContext.ajax_rsp_assign_attri("", false, "A6470AlbRTara", GXutil.ltrim( localUtil.ntoc( A6470AlbRTara, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6471AlbRUniB", GXutil.ltrim( localUtil.ntoc( A6471AlbRUniB, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6488AlbDocPrv", GXutil.rtrim( A6488AlbDocPrv));
      httpContext.ajax_rsp_assign_attri("", false, "A6523AlbRUdas", GXutil.ltrim( localUtil.ntoc( A6523AlbRUdas, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4792AlmCod", GXutil.ltrim( localUtil.ntoc( A4792AlmCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8023AlbColor", GXutil.rtrim( A8023AlbColor));
      httpContext.ajax_rsp_assign_attri("", false, "A8024AlbOpsT", GXutil.rtrim( A8024AlbOpsT));
      httpContext.ajax_rsp_assign_attri("", false, "A8025AlbOpsC", GXutil.rtrim( A8025AlbOpsC));
      httpContext.ajax_rsp_assign_attri("", false, "A8026AlbOC", GXutil.rtrim( A8026AlbOC));
      httpContext.ajax_rsp_assign_attri("", false, "A8027AlbHdri", GXutil.rtrim( A8027AlbHdri));
      httpContext.ajax_rsp_assign_attri("", false, "A8028AlbNumB", GXutil.rtrim( A8028AlbNumB));
      httpContext.ajax_rsp_assign_attri("", false, "A8029AlbNumM", GXutil.rtrim( A8029AlbNumM));
      httpContext.ajax_rsp_assign_attri("", false, "A8030AlbAncC", GXutil.ltrim( localUtil.ntoc( A8030AlbAncC, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8031AlbDndC", GXutil.ltrim( localUtil.ntoc( A8031AlbDndC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8032AlbAncCr", GXutil.ltrim( localUtil.ntoc( A8032AlbAncCr, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8033AlbDndCr", GXutil.ltrim( localUtil.ntoc( A8033AlbDndCr, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8034AlbGalga", GXutil.ltrim( localUtil.ntoc( A8034AlbGalga, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8035AlbMaqTej", GXutil.rtrim( A8035AlbMaqTej));
      httpContext.ajax_rsp_assign_attri("", false, "A8036AlbDmt", GXutil.ltrim( localUtil.ntoc( A8036AlbDmt, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9793AlbPdaC", GXutil.rtrim( A9793AlbPdaC));
      httpContext.ajax_rsp_assign_attri("", false, "A9794AlbOStj", GXutil.rtrim( A9794AlbOStj));
      httpContext.ajax_rsp_assign_attri("", false, "A10358AlbTurno", GXutil.ltrim( localUtil.ntoc( A10358AlbTurno, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A8723CliEst", GXutil.rtrim( A8723CliEst));
      httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", GXutil.rtrim( A6264AlbRTartD));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", GXutil.rtrim( A971ProceNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", GXutil.rtrim( A1212TipEntNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4793AlmNom", GXutil.rtrim( A4793AlmNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV50FlagArt", GXutil.ltrim( localUtil.ntoc( AV50FlagArt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV63Flag_artc", GXutil.ltrim( localUtil.ntoc( AV63Flag_artc, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV74Compos", GXutil.rtrim( AV74Compos));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV89Albrpieent", GXutil.ltrim( localUtil.ntoc( AV89Albrpieent, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV141PieEntold", GXutil.ltrim( localUtil.ntoc( AV141PieEntold, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV156oldpiee", GXutil.ltrim( localUtil.ntoc( AV156oldpiee, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV96albrfen", localUtil.format(AV96albrfen, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4291AlbPzaEst", GXutil.ltrim( localUtil.ntoc( A4291AlbPzaEst, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV69ALbRunient", GXutil.ltrim( localUtil.ntoc( AV69ALbRunient, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV142UniENtold", GXutil.ltrim( localUtil.ntoc( AV142UniENtold, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV154Oldunie", GXutil.ltrim( localUtil.ntoc( AV154Oldunie, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV92albrreo", GXutil.rtrim( AV92albrreo));
      httpContext.ajax_rsp_assign_attri("", false, "AV157oldpieu", GXutil.ltrim( localUtil.ntoc( AV157oldpieu, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV155olduniu", GXutil.ltrim( localUtil.ntoc( AV155olduniu, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV95TipEntCod", GXutil.ltrim( localUtil.ntoc( AV95TipEntCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_attri("", false, "AV87Procecod", GXutil.ltrim( localUtil.ntoc( AV87Procecod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV90Albrpre", GXutil.ltrim( localUtil.ntoc( AV90Albrpre, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV93albrnf", GXutil.rtrim( AV93albrnf));
      httpContext.ajax_rsp_assign_attri("", false, "AV91albrcfop", GXutil.rtrim( AV91albrcfop));
      httpContext.ajax_rsp_assign_attri("", false, "AV149AlbStLot", GXutil.ltrim( localUtil.ntoc( AV149AlbStLot, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A317AlbStLot", GXutil.ltrim( localUtil.ntoc( A317AlbStLot, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrim( localUtil.ntoc( A6180AlbrUniC, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrim( localUtil.ntoc( A6181AlbrPieC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV84Documento", GXutil.rtrim( AV84Documento));
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", GXutil.rtrim( AV18AlbCum));
      httpContext.ajax_rsp_assign_attri("", false, "AV94AlbRunic", GXutil.ltrim( localUtil.ntoc( AV94AlbRunic, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z46AlbREnt", GXutil.rtrim( Z46AlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z50AlbRLoc", GXutil.rtrim( Z50AlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z49AlbRFen", localUtil.format(Z49AlbRFen, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z55AlbRReo", GXutil.rtrim( Z55AlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z53AlbRPieReb", GXutil.ltrim( localUtil.ntoc( Z53AlbRPieReb, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z59AlbRUniReb", GXutil.ltrim( localUtil.ntoc( Z59AlbRUniReb, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z48AlbRFecUlt", localUtil.format(Z48AlbRFecUlt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1211TipEntCod", GXutil.ltrim( localUtil.ntoc( Z1211TipEntCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1222AlbNumEti", GXutil.ltrim( localUtil.ntoc( Z1222AlbNumEti, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1291AlbRDes", GXutil.rtrim( Z1291AlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z970ProceCod", GXutil.ltrim( localUtil.ntoc( Z970ProceCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1301AlbRUlin", GXutil.ltrim( localUtil.ntoc( Z1301AlbRUlin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3613AlbRefDsc", GXutil.rtrim( Z3613AlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4290AlbPmPPza", GXutil.ltrim( localUtil.ntoc( Z4290AlbPmPPza, (byte)(6), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4920AlbRGrm2", GXutil.ltrim( localUtil.ntoc( Z4920AlbRGrm2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4921AlbRAnc", GXutil.ltrim( localUtil.ntoc( Z4921AlbRAnc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4922AlbPml", GXutil.ltrim( localUtil.ntoc( Z4922AlbPml, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5743AlbRPre", GXutil.ltrim( localUtil.ntoc( Z5743AlbRPre, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5744AlbRAju", GXutil.ltrim( localUtil.ntoc( Z5744AlbRAju, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5745AlbRRep", GXutil.ltrim( localUtil.ntoc( Z5745AlbRRep, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5806AlbREnt2", GXutil.rtrim( Z5806AlbREnt2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6178AlbrUsu", GXutil.rtrim( Z6178AlbrUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6179AlbrHor", localUtil.ttoc( Z6179AlbrHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6182AlbrNF", GXutil.rtrim( Z6182AlbrNF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6183AlbrFeNf", localUtil.format(Z6183AlbrFeNf, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6184AlbrCfop", GXutil.rtrim( Z6184AlbrCfop));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3359AlbRDisCli", GXutil.rtrim( Z3359AlbRDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6263AlbRTartC", GXutil.ltrim( localUtil.ntoc( Z6263AlbRTartC, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3360AlbRImp", GXutil.rtrim( Z3360AlbRImp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6463AlbRLote", GXutil.rtrim( Z6463AlbRLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6464AlbRTelar", GXutil.rtrim( Z6464AlbRTelar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6465AlbRLu", GXutil.ltrim( localUtil.ntoc( Z6465AlbRLu, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4602AlbRMdlCod", GXutil.rtrim( Z4602AlbRMdlCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6470AlbRTara", GXutil.ltrim( localUtil.ntoc( Z6470AlbRTara, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6471AlbRUniB", GXutil.ltrim( localUtil.ntoc( Z6471AlbRUniB, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6488AlbDocPrv", GXutil.rtrim( Z6488AlbDocPrv));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6523AlbRUdas", GXutil.ltrim( localUtil.ntoc( Z6523AlbRUdas, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4792AlmCod", GXutil.ltrim( localUtil.ntoc( Z4792AlmCod, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8023AlbColor", GXutil.rtrim( Z8023AlbColor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8024AlbOpsT", GXutil.rtrim( Z8024AlbOpsT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8025AlbOpsC", GXutil.rtrim( Z8025AlbOpsC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8026AlbOC", GXutil.rtrim( Z8026AlbOC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8027AlbHdri", GXutil.rtrim( Z8027AlbHdri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8028AlbNumB", GXutil.rtrim( Z8028AlbNumB));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8029AlbNumM", GXutil.rtrim( Z8029AlbNumM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8030AlbAncC", GXutil.ltrim( localUtil.ntoc( Z8030AlbAncC, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8031AlbDndC", GXutil.ltrim( localUtil.ntoc( Z8031AlbDndC, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8032AlbAncCr", GXutil.ltrim( localUtil.ntoc( Z8032AlbAncCr, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8033AlbDndCr", GXutil.ltrim( localUtil.ntoc( Z8033AlbDndCr, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8034AlbGalga", GXutil.ltrim( localUtil.ntoc( Z8034AlbGalga, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8035AlbMaqTej", GXutil.rtrim( Z8035AlbMaqTej));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8036AlbDmt", GXutil.ltrim( localUtil.ntoc( Z8036AlbDmt, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9793AlbPdaC", GXutil.rtrim( Z9793AlbPdaC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9794AlbOStj", GXutil.rtrim( Z9794AlbOStj));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10358AlbTurno", GXutil.ltrim( localUtil.ntoc( Z10358AlbTurno, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8723CliEst", GXutil.rtrim( Z8723CliEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6264AlbRTartD", GXutil.rtrim( Z6264AlbRTartD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z841TrnNom", GXutil.rtrim( Z841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z971ProceNom", GXutil.rtrim( Z971ProceNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1212TipEntNom", GXutil.rtrim( Z1212TipEntNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4793AlmNom", GXutil.rtrim( Z4793AlmNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV50FlagArt", GXutil.ltrim( localUtil.ntoc( ZV50FlagArt, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV63Flag_artc", GXutil.ltrim( localUtil.ntoc( ZV63Flag_artc, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV74Compos", GXutil.rtrim( ZV74Compos));
      app.GxWebStd.gx_hidden_field( httpContext, "Z51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( Z51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV89Albrpieent", GXutil.ltrim( localUtil.ntoc( ZV89Albrpieent, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV141PieEntold", GXutil.ltrim( localUtil.ntoc( ZV141PieEntold, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV156oldpiee", GXutil.ltrim( localUtil.ntoc( ZV156oldpiee, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV96albrfen", localUtil.format(ZV96albrfen, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4291AlbPzaEst", GXutil.ltrim( localUtil.ntoc( Z4291AlbPzaEst, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( Z57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV69ALbRunient", GXutil.ltrim( localUtil.ntoc( ZV69ALbRunient, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV142UniENtold", GXutil.ltrim( localUtil.ntoc( ZV142UniENtold, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV154Oldunie", GXutil.ltrim( localUtil.ntoc( ZV154Oldunie, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV92albrreo", GXutil.rtrim( ZV92albrreo));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV157oldpieu", GXutil.ltrim( localUtil.ntoc( ZV157oldpieu, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV155olduniu", GXutil.ltrim( localUtil.ntoc( ZV155olduniu, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV95TipEntCod", GXutil.ltrim( localUtil.ntoc( ZV95TipEntCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV87Procecod", GXutil.ltrim( localUtil.ntoc( ZV87Procecod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV90Albrpre", GXutil.ltrim( localUtil.ntoc( ZV90Albrpre, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV93albrnf", GXutil.rtrim( ZV93albrnf));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV91albrcfop", GXutil.rtrim( ZV91albrcfop));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV149AlbStLot", GXutil.ltrim( localUtil.ntoc( ZV149AlbStLot, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z317AlbStLot", GXutil.ltrim( localUtil.ntoc( Z317AlbStLot, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6180AlbrUniC", GXutil.ltrim( localUtil.ntoc( Z6180AlbrUniC, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6181AlbrPieC", GXutil.ltrim( localUtil.ntoc( Z6181AlbrPieC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV84Documento", GXutil.rtrim( ZV84Documento));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV18AlbCum", GXutil.rtrim( ZV18AlbCum));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV94AlbRunic", GXutil.ltrim( localUtil.ntoc( ZV94AlbRunic, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O1301AlbRUlin", GXutil.ltrim( localUtil.ntoc( O1301AlbRUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( O52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( O58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Albref( )
   {
      n6263AlbRTartC = false ;
      n6264AlbRTartD = false ;
      if ( ( AV159CtrlArt == 1 ) && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) && true /* Level */ )
      {
         GXv_int9[0] = AV50FlagArt ;
         new app.core.pexiser(remoteHandle, context).execute( A396EmprCod, A252CliCod, A45AlbRef, GXv_int9) ;
         talbre5_impl.this.AV50FlagArt = (byte)((byte)(GXv_int9[0])) ;
         AV50FlagArt = this.AV50FlagArt ;
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char5[0] = A45AlbRef ;
         GXv_char4[0] = A3613AlbRefDsc ;
         GXv_int6[0] = AV63Flag_artc ;
         new app.pbusard(remoteHandle, context).execute( GXv_char7, GXv_int3, GXv_char5, GXv_char4, GXv_int6) ;
         talbre5_impl.this.A396EmprCod = GXv_char7[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbre5_impl.this.A252CliCod = GXv_int3[0] ;
         A252CliCod = this.A252CliCod ;
         talbre5_impl.this.A45AlbRef = GXv_char5[0] ;
         A45AlbRef = this.A45AlbRef ;
         talbre5_impl.this.A3613AlbRefDsc = GXv_char4[0] ;
         A3613AlbRefDsc = this.A3613AlbRefDsc ;
         talbre5_impl.this.AV63Flag_artc = GXv_int6[0] ;
         AV63Flag_artc = this.AV63Flag_artc ;
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) && ( AV112Moda21 == 0 ) )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char5[0] = A45AlbRef ;
         GXv_char4[0] = A6264AlbRTartD ;
         GXv_char2[0] = AV74Compos ;
         GXv_int9[0] = A6263AlbRTartC ;
         GXv_decimal8[0] = A6465AlbRLu ;
         new app.pbusar4(remoteHandle, context).execute( GXv_char7, GXv_int3, GXv_char5, GXv_char4, GXv_char2, GXv_int9, GXv_decimal8) ;
         talbre5_impl.this.A396EmprCod = GXv_char7[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbre5_impl.this.A252CliCod = GXv_int3[0] ;
         A252CliCod = this.A252CliCod ;
         talbre5_impl.this.A45AlbRef = GXv_char5[0] ;
         A45AlbRef = this.A45AlbRef ;
         talbre5_impl.this.A6264AlbRTartD = GXv_char4[0] ;
         A6264AlbRTartD = this.A6264AlbRTartD ;
         talbre5_impl.this.AV74Compos = GXv_char2[0] ;
         AV74Compos = this.AV74Compos ;
         talbre5_impl.this.A6263AlbRTartC = GXv_int9[0] ;
         A6263AlbRTartC = this.A6263AlbRTartC ;
         talbre5_impl.this.A6465AlbRLu = GXv_decimal8[0] ;
         A6465AlbRLu = this.A6465AlbRLu ;
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A45AlbRef)==0) && ( AV77Kohler == 0 ) && isIns( )  )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char5[0] = A45AlbRef ;
         GXv_int9[0] = A4920AlbRGrm2 ;
         GXv_int1[0] = A4921AlbRAnc ;
         new app.pbusar5(remoteHandle, context).execute( GXv_char7, GXv_int3, GXv_char5, GXv_int9, GXv_int1) ;
         talbre5_impl.this.A396EmprCod = GXv_char7[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbre5_impl.this.A252CliCod = GXv_int3[0] ;
         A252CliCod = this.A252CliCod ;
         talbre5_impl.this.A45AlbRef = GXv_char5[0] ;
         A45AlbRef = this.A45AlbRef ;
         talbre5_impl.this.A4920AlbRGrm2 = GXv_int9[0] ;
         A4920AlbRGrm2 = this.A4920AlbRGrm2 ;
         talbre5_impl.this.A4921AlbRAnc = GXv_int1[0] ;
         A4921AlbRAnc = this.A4921AlbRAnc ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV50FlagArt", GXutil.ltrim( localUtil.ntoc( AV50FlagArt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", GXutil.rtrim( A3613AlbRefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "AV63Flag_artc", GXutil.ltrim( localUtil.ntoc( AV63Flag_artc, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", GXutil.rtrim( A6264AlbRTartD));
      httpContext.ajax_rsp_assign_attri("", false, "AV74Compos", GXutil.rtrim( AV74Compos));
      httpContext.ajax_rsp_assign_attri("", false, "A6263AlbRTartC", GXutil.ltrim( localUtil.ntoc( A6263AlbRTartC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrim( localUtil.ntoc( A6465AlbRLu, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      n841TrnNom = false ;
      /* Using cursor T01AE29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A841TrnNom = T01AE29_A841TrnNom[0] ;
      n841TrnNom = T01AE29_n841TrnNom[0] ;
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
   }

   public void valid_Albrent( )
   {
      if ( true )
      {
         AV84Documento = GXutil.str( AV97Doc_6, 6, 0) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", A46AlbREnt)==0) )
         {
            AV84Documento = GXutil.substring( A46AlbREnt, 1, 6) ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV84Documento", GXutil.rtrim( AV84Documento));
   }

   public void valid_Albrpieent( )
   {
      AV89Albrpieent = A52AlbRPieEnt ;
      AV141PieEntold = O52AlbRPieEnt ;
      AV156oldpiee = O52AlbRPieEnt ;
      if ( isIns( )  && (0==A6181AlbrPieC) && ( Gx_BScreen == 0 ) )
      {
         A6181AlbrPieC = A52AlbRPieEnt ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV89Albrpieent", GXutil.ltrim( localUtil.ntoc( AV89Albrpieent, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV141PieEntold", GXutil.ltrim( localUtil.ntoc( AV141PieEntold, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV156oldpiee", GXutil.ltrim( localUtil.ntoc( AV156oldpiee, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6181AlbrPieC", GXutil.ltrim( localUtil.ntoc( A6181AlbrPieC, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Albrfen( )
   {
      AV96albrfen = A49AlbRFen ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV96albrfen", localUtil.format(AV96albrfen, "99/99/99"));
   }

   public void valid_Albrunient( )
   {
      AV69ALbRunient = A58AlbRUniEnt ;
      AV142UniENtold = O58AlbRUniEnt ;
      AV154Oldunie = O58AlbRUniEnt ;
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6180AlbrUniC)==0) && ( Gx_BScreen == 0 ) )
      {
         A6180AlbrUniC = A58AlbRUniEnt ;
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A58AlbRUniEnt)==0) || (0==A52AlbRPieEnt) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Tiene que entrar Unidades o Piezas", ""), 1, "ALBRUNIENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRUniEnt_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV69ALbRunient", GXutil.ltrim( localUtil.ntoc( AV69ALbRunient, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV142UniENtold", GXutil.ltrim( localUtil.ntoc( AV142UniENtold, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV154Oldunie", GXutil.ltrim( localUtil.ntoc( AV154Oldunie, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6180AlbrUniC", GXutil.ltrim( localUtil.ntoc( A6180AlbrUniC, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Albrreo( )
   {
      A55AlbRReo = cmbAlbRReo.getValue() ;
      if ( ! ( ( GXutil.strcmp(A55AlbRReo, "SI") == 0 ) || ( GXutil.strcmp(A55AlbRReo, "NO") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Reclamacion?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRREO");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbRReo.getInternalname() ;
      }
      AV92albrreo = A55AlbRReo ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV92albrreo", GXutil.rtrim( AV92albrreo));
   }

   public void valid_Albrpieuti( )
   {
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      AV157oldpieu = O54AlbRPieUti ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV157oldpieu", GXutil.ltrim( localUtil.ntoc( AV157oldpieu, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Albruniuti( )
   {
      A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValue())) ;
      cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
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
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         A47AlbREst = (byte)(0) ;
         cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      }
      else
      {
         if ( A57AlbRUniDis.doubleValue() == 0 )
         {
            A47AlbREst = (byte)(1) ;
            cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
         }
         else
         {
            if ( A57AlbRUniDis.doubleValue() != 0 )
            {
               A47AlbREst = (byte)(0) ;
               cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
            }
         }
      }
      AV155olduniu = O60AlbRUniUti ;
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
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "AV155olduniu", GXutil.ltrim( localUtil.ntoc( AV155olduniu, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Albrest( )
   {
      A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValue())) ;
      if ( ! ( ( A47AlbREst == 0 ) || ( A47AlbREst == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Estado", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBREST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbREst.getInternalname() ;
      }
      if ( A47AlbREst == 1 )
      {
         AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", GXutil.rtrim( AV18AlbCum));
   }

   public void valid_Tipentcod( )
   {
      n1211TipEntCod = false ;
      n1212TipEntNom = false ;
      /* Using cursor T01AE30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A1212TipEntNom = T01AE30_A1212TipEntNom[0] ;
      n1212TipEntNom = T01AE30_n1212TipEntNom[0] ;
      pr_default.close(28);
      AV95TipEntCod = A1211TipEntCod ;
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtTipEntCod_Enabled = 0 ;
      }
      else
      {
         edtTipEntCod_Enabled = 1 ;
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtAlbRLoc_Enabled = 0 ;
      }
      else
      {
         edtAlbRLoc_Enabled = 1 ;
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtCliCod_Enabled = 0 ;
      }
      else
      {
         edtCliCod_Enabled = 1 ;
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtAlbRef_Enabled = 0 ;
      }
      else
      {
         edtAlbRef_Enabled = 1 ;
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         edtAlbRFen_Enabled = 0 ;
      }
      else
      {
         edtAlbRFen_Enabled = 1 ;
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         cmbAlbRUni.setEnabled( 0 );
      }
      else
      {
         cmbAlbRUni.setEnabled( 1 );
      }
      if ( ( A1211TipEntCod == 9999 ) && true /* Level */ )
      {
         cmbAlbRReo.setEnabled( 0 );
      }
      else
      {
         cmbAlbRReo.setEnabled( 1 );
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", GXutil.rtrim( A1212TipEntNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV95TipEntCod", GXutil.ltrim( localUtil.ntoc( AV95TipEntCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
   }

   public void valid_Procecod( )
   {
      n970ProceCod = false ;
      n971ProceNom = false ;
      /* Using cursor T01AE31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A971ProceNom = T01AE31_A971ProceNom[0] ;
      n971ProceNom = T01AE31_n971ProceNom[0] ;
      pr_default.close(29);
      AV87Procecod = A970ProceCod ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", GXutil.rtrim( A971ProceNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV87Procecod", GXutil.ltrim( localUtil.ntoc( AV87Procecod, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Albrpre( )
   {
      AV90Albrpre = A5743AlbRPre ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV90Albrpre", GXutil.ltrim( localUtil.ntoc( AV90Albrpre, (byte)(12), (byte)(5), ".", "")));
   }

   public void valid_Albrunic( )
   {
      AV94AlbRunic = A6180AlbrUniC ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV94AlbRunic", GXutil.ltrim( localUtil.ntoc( AV94AlbRunic, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Albrnf( )
   {
      AV93albrnf = A6182AlbrNF ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV93albrnf", GXutil.rtrim( AV93albrnf));
   }

   public void valid_Albrcfop( )
   {
      AV91albrcfop = A6184AlbrCfop ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV91albrcfop", GXutil.rtrim( AV91albrcfop));
   }

   public void valid_Albrtartc( )
   {
      n6263AlbRTartC = false ;
      n6264AlbRTartD = false ;
      /* Using cursor T01AE32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n6263AlbRTartC), Short.valueOf(A6263AlbRTartC)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A6263AlbRTartC) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Tipo de Articulo", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRTARTC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A6264AlbRTartD = T01AE32_A6264AlbRTartD[0] ;
      n6264AlbRTartD = T01AE32_n6264AlbRTartD[0] ;
      pr_default.close(30);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6264AlbRTartD", GXutil.rtrim( A6264AlbRTartD));
   }

   public void valid_Albrtelar( )
   {
      if ( ( AV103Erfoc == 1 ) && ( ( GXutil.strcmp(A6463AlbRLote, " ") != 0 ) && ( GXutil.strcmp(A4602AlbRMdlCod, " ") != 0 ) && ( GXutil.strcmp(A6464AlbRTelar, " ") != 0 ) ) && true /* After */ && true /* Level */ && isIns( )  )
      {
         GXv_char7[0] = A396EmprCod ;
         GXv_char5[0] = A6463AlbRLote ;
         GXv_char4[0] = A4602AlbRMdlCod ;
         GXv_char2[0] = A6464AlbRTelar ;
         GXv_int6[0] = AV149AlbStLot ;
         new app.pctrlote(remoteHandle, context).execute( GXv_char7, GXv_char5, GXv_char4, GXv_char2, GXv_int6) ;
         talbre5_impl.this.A396EmprCod = GXv_char7[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbre5_impl.this.A6463AlbRLote = GXv_char5[0] ;
         A6463AlbRLote = this.A6463AlbRLote ;
         talbre5_impl.this.A4602AlbRMdlCod = GXv_char4[0] ;
         A4602AlbRMdlCod = this.A4602AlbRMdlCod ;
         talbre5_impl.this.A6464AlbRTelar = GXv_char2[0] ;
         A6464AlbRTelar = this.A6464AlbRTelar ;
         talbre5_impl.this.AV149AlbStLot = GXv_int6[0] ;
         AV149AlbStLot = this.AV149AlbStLot ;
      }
      if ( isIns( )  && true /* Level */ )
      {
         A317AlbStLot = AV149AlbStLot ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A317AlbStLot", GXutil.ltrim( localUtil.ntoc( A317AlbStLot, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", GXutil.rtrim( A6463AlbRLote));
      httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", GXutil.rtrim( A4602AlbRMdlCod));
      httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", GXutil.rtrim( A6464AlbRTelar));
      httpContext.ajax_rsp_assign_attri("", false, "AV149AlbStLot", GXutil.ltrim( localUtil.ntoc( AV149AlbStLot, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Almcod( )
   {
      n4792AlmCod = false ;
      n4793AlmNom = false ;
      /* Using cursor T01AE33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n4792AlmCod), Byte.valueOf(A4792AlmCod)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A4792AlmCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Almacen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A4793AlmNom = T01AE33_A4793AlmNom[0] ;
      n4793AlmNom = T01AE33_n4793AlmNom[0] ;
      pr_default.close(31);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4793AlmNom", GXutil.rtrim( A4793AlmNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV88AlbRef',fld:'vALBREF',pic:''},{av:'AV163Unidades',fld:'vUNIDADES',pic:'@!'},{av:'AV164vDisLoc',fld:'vVDISLOC',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A6183AlbrFeNf',fld:'ALBRFENF',pic:''},{av:'AV44Modo',fld:'vMODO',pic:''},{av:'AV85Albrfenf',fld:'vALBRFENF',pic:''},{av:'A48AlbRFecUlt',fld:'ALBRFECULT',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A8723CliEst',fld:'CLIEST',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A8723CliEst',fld:'CLIEST',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'A1301AlbRUlin',fld:'ALBRULIN',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV53FlagFerro',fld:'vFLAGFERRO',pic:'9'},{av:'AV163Unidades',fld:'vUNIDADES',pic:'@!'},{av:'AV88AlbRef',fld:'vALBREF',pic:''},{av:'AV164vDisLoc',fld:'vVDISLOC',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A6183AlbrFeNf',fld:'ALBRFENF',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV44Modo',fld:'vMODO',pic:''},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A50AlbRLoc',fld:'ALBRLOC',pic:''},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'A48AlbRFecUlt',fld:'ALBRFECULT',pic:''},{av:'A6182AlbrNF',fld:'ALBRNF',pic:'@!'},{av:'A6179AlbrHor',fld:'ALBRHOR',pic:'99:99:99'},{av:'A3360AlbRImp',fld:'ALBRIMP',pic:'@!'},{av:'A4602AlbRMdlCod',fld:'ALBRMDLCOD',pic:''},{av:'A6463AlbRLote',fld:'ALBRLOTE',pic:''},{av:'A6464AlbRTelar',fld:'ALBRTELAR',pic:''},{av:'A6465AlbRLu',fld:'ALBRLU',pic:'ZZ9.99'},{av:'A6470AlbRTara',fld:'ALBRTARA',pic:'ZZ9.99'},{av:'A6471AlbRUniB',fld:'ALBRUNIB',pic:'ZZZZZ9.99'},{av:'A6523AlbRUdas',fld:'ALBRUDAS',pic:'ZZZZZ9.99'},{av:'A6178AlbrUsu',fld:'ALBRUSU',pic:''},{av:'AV85Albrfenf',fld:'vALBRFENF',pic:''},{av:'AV83AlbReccod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV97Doc_6',fld:'vDOC_6',pic:'ZZZZZ9'},{av:'AV50FlagArt',fld:'vFLAGART',pic:'9'},{av:'AV63Flag_artc',fld:'vFLAG_ARTC',pic:'9'},{av:'AV74Compos',fld:'vCOMPOS',pic:''},{av:'AV89Albrpieent',fld:'vALBRPIEENT',pic:'ZZZZZ9'},{av:'AV141PieEntold',fld:'vPIEENTOLD',pic:'ZZZZZ9'},{av:'AV156oldpiee',fld:'vOLDPIEE',pic:'ZZZ9'},{av:'AV96albrfen',fld:'vALBRFEN',pic:''},{av:'AV69ALbRunient',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV142UniENtold',fld:'vUNIENTOLD',pic:'ZZZZZ9.99'},{av:'AV154Oldunie',fld:'vOLDUNIE',pic:'ZZZZZ9.99'},{av:'AV92albrreo',fld:'vALBRREO',pic:'@!'},{av:'AV157oldpieu',fld:'vOLDPIEU',pic:'ZZZ9'},{av:'AV155olduniu',fld:'vOLDUNIU',pic:'ZZZZZ9.99'},{av:'AV95TipEntCod',fld:'vTIPENTCOD',pic:'ZZZ9'},{av:'edtTipEntCod_Enabled',ctrl:'TIPENTCOD',prop:'Enabled'},{av:'edtAlbRLoc_Enabled',ctrl:'ALBRLOC',prop:'Enabled'},{av:'edtCliCod_Enabled',ctrl:'CLICOD',prop:'Enabled'},{av:'edtAlbRef_Enabled',ctrl:'ALBREF',prop:'Enabled'},{av:'edtAlbRFen_Enabled',ctrl:'ALBRFEN',prop:'Enabled'},{av:'AV87Procecod',fld:'vPROCECOD',pic:'ZZZ9'},{av:'AV90Albrpre',fld:'vALBRPRE',pic:'ZZZZZ9.99'},{av:'AV93albrnf',fld:'vALBRNF',pic:'@!'},{av:'AV91albrcfop',fld:'vALBRCFOP',pic:''},{av:'AV149AlbStLot',fld:'vALBSTLOT',pic:'9'},{av:'AV84Documento',fld:'vDOCUMENTO',pic:''},{av:'AV18AlbCum',fld:'vALBCUM',pic:''},{av:'AV94AlbRunic',fld:'vALBRUNIC',pic:'ZZZZZ9.99'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A46AlbREnt',fld:'ALBRENT',pic:''},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A50AlbRLoc',fld:'ALBRLOC',pic:''},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A53AlbRPieReb',fld:'ALBRPIEREB',pic:'ZZZ9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A59AlbRUniReb',fld:'ALBRUNIREB',pic:'ZZZZZ9.99'},{av:'A48AlbRFecUlt',fld:'ALBRFECULT',pic:''},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'},{av:'A1222AlbNumEti',fld:'ALBNUMETI',pic:'ZZZ9'},{av:'A1291AlbRDes',fld:'ALBRDES',pic:''},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A1301AlbRUlin',fld:'ALBRULIN',pic:'Z9'},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A4290AlbPmPPza',fld:'ALBPMPPZA',pic:'Z9.999'},{av:'A4920AlbRGrm2',fld:'ALBRGRM2',pic:'ZZZ9'},{av:'A4921AlbRAnc',fld:'ALBRANC',pic:'ZZZ9'},{av:'A4922AlbPml',fld:'ALBPML',pic:'ZZZ9'},{av:'A5743AlbRPre',fld:'ALBRPRE',pic:'ZZZZZ9.99'},{av:'A5744AlbRAju',fld:'ALBRAJU',pic:'ZZZZ9.99'},{av:'A5806AlbREnt2',fld:'ALBRENT2',pic:''},{av:'A6178AlbrUsu',fld:'ALBRUSU',pic:''},{av:'A6179AlbrHor',fld:'ALBRHOR',pic:'99:99:99'},{av:'A6182AlbrNF',fld:'ALBRNF',pic:'@!'},{av:'A6183AlbrFeNf',fld:'ALBRFENF',pic:''},{av:'A6184AlbrCfop',fld:'ALBRCFOP',pic:''},{av:'A3359AlbRDisCli',fld:'ALBRDISCLI',pic:''},{av:'A6263AlbRTartC',fld:'ALBRTARTC',pic:'ZZZ9'},{av:'A3360AlbRImp',fld:'ALBRIMP',pic:'@!'},{av:'A6463AlbRLote',fld:'ALBRLOTE',pic:''},{av:'A6464AlbRTelar',fld:'ALBRTELAR',pic:''},{av:'A6465AlbRLu',fld:'ALBRLU',pic:'ZZ9.99'},{av:'A4602AlbRMdlCod',fld:'ALBRMDLCOD',pic:''},{av:'A6470AlbRTara',fld:'ALBRTARA',pic:'ZZ9.99'},{av:'A6471AlbRUniB',fld:'ALBRUNIB',pic:'ZZZZZ9.99'},{av:'A6488AlbDocPrv',fld:'ALBDOCPRV',pic:''},{av:'A6523AlbRUdas',fld:'ALBRUDAS',pic:'ZZZZZ9.99'},{av:'A4792AlmCod',fld:'ALMCOD',pic:'9'},{av:'A8023AlbColor',fld:'ALBCOLOR',pic:''},{av:'A8024AlbOpsT',fld:'ALBOPST',pic:''},{av:'A8025AlbOpsC',fld:'ALBOPSC',pic:''},{av:'A8026AlbOC',fld:'ALBOC',pic:''},{av:'A8027AlbHdri',fld:'ALBHDRI',pic:''},{av:'A8028AlbNumB',fld:'ALBNUMB',pic:''},{av:'A8029AlbNumM',fld:'ALBNUMM',pic:''},{av:'A8030AlbAncC',fld:'ALBANCC',pic:'Z9.99'},{av:'A8031AlbDndC',fld:'ALBDNDC',pic:'ZZZ9'},{av:'A8032AlbAncCr',fld:'ALBANCCR',pic:'Z9.99'},{av:'A8033AlbDndCr',fld:'ALBDNDCR',pic:'ZZZ9'},{av:'A8034AlbGalga',fld:'ALBGALGA',pic:'ZZ9'},{av:'A8035AlbMaqTej',fld:'ALBMAQTEJ',pic:''},{av:'A8036AlbDmt',fld:'ALBDMT',pic:'ZZ9'},{av:'A9793AlbPdaC',fld:'ALBPDAC',pic:''},{av:'A9794AlbOStj',fld:'ALBOSTJ',pic:''},{av:'A10358AlbTurno',fld:'ALBTURNO',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A8723CliEst',fld:'CLIEST',pic:''},{av:'A6264AlbRTartD',fld:'ALBRTARTD',pic:''},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A971ProceNom',fld:'PROCENOM',pic:''},{av:'A1212TipEntNom',fld:'TIPENTNOM',pic:''},{av:'A4793AlmNom',fld:'ALMNOM',pic:''},{av:'AV50FlagArt',fld:'vFLAGART',pic:'9'},{av:'AV63Flag_artc',fld:'vFLAG_ARTC',pic:'9'},{av:'AV74Compos',fld:'vCOMPOS',pic:''},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV89Albrpieent',fld:'vALBRPIEENT',pic:'ZZZZZ9'},{av:'AV141PieEntold',fld:'vPIEENTOLD',pic:'ZZZZZ9'},{av:'AV156oldpiee',fld:'vOLDPIEE',pic:'ZZZ9'},{av:'AV96albrfen',fld:'vALBRFEN',pic:''},{av:'A4291AlbPzaEst',fld:'ALBPZAEST',pic:'ZZZZZZZ9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV69ALbRunient',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV142UniENtold',fld:'vUNIENTOLD',pic:'ZZZZZ9.99'},{av:'AV154Oldunie',fld:'vOLDUNIE',pic:'ZZZZZ9.99'},{av:'AV92albrreo',fld:'vALBRREO',pic:'@!'},{av:'AV157oldpieu',fld:'vOLDPIEU',pic:'ZZZ9'},{av:'AV155olduniu',fld:'vOLDUNIU',pic:'ZZZZZ9.99'},{av:'AV95TipEntCod',fld:'vTIPENTCOD',pic:'ZZZ9'},{av:'edtTipEntCod_Enabled',ctrl:'TIPENTCOD',prop:'Enabled'},{av:'edtAlbRLoc_Enabled',ctrl:'ALBRLOC',prop:'Enabled'},{av:'edtCliCod_Enabled',ctrl:'CLICOD',prop:'Enabled'},{av:'edtAlbRef_Enabled',ctrl:'ALBREF',prop:'Enabled'},{av:'edtAlbRFen_Enabled',ctrl:'ALBRFEN',prop:'Enabled'},{av:'AV87Procecod',fld:'vPROCECOD',pic:'ZZZ9'},{av:'AV90Albrpre',fld:'vALBRPRE',pic:'ZZZZZ9.99'},{av:'AV93albrnf',fld:'vALBRNF',pic:'@!'},{av:'AV91albrcfop',fld:'vALBRCFOP',pic:''},{av:'AV149AlbStLot',fld:'vALBSTLOT',pic:'9'},{av:'A317AlbStLot',fld:'ALBSTLOT',pic:'9'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A6180AlbrUniC',fld:'ALBRUNIC',pic:'ZZZZZ9.99'},{av:'A6181AlbrPieC',fld:'ALBRPIEC',pic:'ZZZZZ9'},{av:'AV84Documento',fld:'vDOCUMENTO',pic:''},{av:'AV18AlbCum',fld:'vALBCUM',pic:''},{av:'AV94AlbRunic',fld:'vALBRUNIC',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z44AlbRecCod'},{av:'Z45AlbRef'},{av:'Z56AlbRUni'},{av:'Z840TrnCod'},{av:'Z46AlbREnt'},{av:'Z52AlbRPieEnt'},{av:'Z50AlbRLoc'},{av:'Z49AlbRFen'},{av:'Z58AlbRUniEnt'},{av:'Z55AlbRReo'},{av:'Z54AlbRPieUti'},{av:'Z53AlbRPieReb'},{av:'Z60AlbRUniUti'},{av:'Z59AlbRUniReb'},{av:'Z48AlbRFecUlt'},{av:'Z1211TipEntCod'},{av:'Z1222AlbNumEti'},{av:'Z1291AlbRDes'},{av:'Z970ProceCod'},{av:'Z1301AlbRUlin'},{av:'Z3613AlbRefDsc'},{av:'Z4290AlbPmPPza'},{av:'Z4920AlbRGrm2'},{av:'Z4921AlbRAnc'},{av:'Z4922AlbPml'},{av:'Z5743AlbRPre'},{av:'Z5744AlbRAju'},{av:'Z5745AlbRRep'},{av:'Z5806AlbREnt2'},{av:'Z6178AlbrUsu'},{av:'Z6179AlbrHor'},{av:'Z6182AlbrNF'},{av:'Z6183AlbrFeNf'},{av:'Z6184AlbrCfop'},{av:'Z3359AlbRDisCli'},{av:'Z6263AlbRTartC'},{av:'Z3360AlbRImp'},{av:'Z6463AlbRLote'},{av:'Z6464AlbRTelar'},{av:'Z6465AlbRLu'},{av:'Z4602AlbRMdlCod'},{av:'Z6470AlbRTara'},{av:'Z6471AlbRUniB'},{av:'Z6488AlbDocPrv'},{av:'Z6523AlbRUdas'},{av:'Z4792AlmCod'},{av:'Z8023AlbColor'},{av:'Z8024AlbOpsT'},{av:'Z8025AlbOpsC'},{av:'Z8026AlbOC'},{av:'Z8027AlbHdri'},{av:'Z8028AlbNumB'},{av:'Z8029AlbNumM'},{av:'Z8030AlbAncC'},{av:'Z8031AlbDndC'},{av:'Z8032AlbAncCr'},{av:'Z8033AlbDndCr'},{av:'Z8034AlbGalga'},{av:'Z8035AlbMaqTej'},{av:'Z8036AlbDmt'},{av:'Z9793AlbPdaC'},{av:'Z9794AlbOStj'},{av:'Z10358AlbTurno'},{av:'Z252CliCod'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z8723CliEst'},{av:'Z6264AlbRTartD'},{av:'Z841TrnNom'},{av:'Z971ProceNom'},{av:'Z1212TipEntNom'},{av:'Z4793AlmNom'},{av:'ZV50FlagArt'},{av:'ZV63Flag_artc'},{av:'ZV74Compos'},{av:'Z51AlbRPieDis'},{av:'ZV89Albrpieent'},{av:'ZV141PieEntold'},{av:'ZV156oldpiee'},{av:'ZV96albrfen'},{av:'Z4291AlbPzaEst'},{av:'Z57AlbRUniDis'},{av:'ZV69ALbRunient'},{av:'ZV142UniENtold'},{av:'ZV154Oldunie'},{av:'ZV92albrreo'},{av:'ZV157oldpieu'},{av:'ZV155olduniu'},{av:'ZV95TipEntCod'},{av:'ZV87Procecod'},{av:'ZV90Albrpre'},{av:'ZV93albrnf'},{av:'ZV91albrcfop'},{av:'ZV149AlbStLot'},{av:'Z317AlbStLot'},{av:'Z47AlbREst'},{av:'Z6180AlbrUniC'},{av:'Z6181AlbrPieC'},{av:'ZV84Documento'},{av:'ZV18AlbCum'},{av:'ZV94AlbRunic'},{av:'O1301AlbRUlin'},{av:'O54AlbRPieUti'},{av:'O60AlbRUniUti'},{av:'O52AlbRPieEnt'},{av:'O58AlbRUniEnt'},{av:'edtAlbRPieUti_Enabled',ctrl:'ALBRPIEUTI',prop:'Enabled'},{av:'edtAlbRUniUti_Enabled',ctrl:'ALBRUNIUTI',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_CLINOM",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBREF","{handler:'valid_Albref',iparms:[{av:'AV77Kohler',fld:'vKOHLER',pic:'9'},{av:'A4921AlbRAnc',fld:'ALBRANC',pic:'ZZZ9'},{av:'A4920AlbRGrm2',fld:'ALBRGRM2',pic:'ZZZ9'},{av:'AV112Moda21',fld:'vMODA21',pic:'9'},{av:'A6465AlbRLu',fld:'ALBRLU',pic:'ZZ9.99'},{av:'A6263AlbRTartC',fld:'ALBRTARTC',pic:'ZZZ9'},{av:'A6264AlbRTartD',fld:'ALBRTARTD',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'AV159CtrlArt',fld:'vCTRLART',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'AV50FlagArt',fld:'vFLAGART',pic:'9'},{av:'AV63Flag_artc',fld:'vFLAG_ARTC',pic:'9'},{av:'AV74Compos',fld:'vCOMPOS',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBREF",",oparms:[{av:'AV50FlagArt',fld:'vFLAGART',pic:'9'},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'AV63Flag_artc',fld:'vFLAG_ARTC',pic:'9'},{av:'A6264AlbRTartD',fld:'ALBRTARTD',pic:''},{av:'AV74Compos',fld:'vCOMPOS',pic:''},{av:'A6263AlbRTartC',fld:'ALBRTARTC',pic:'ZZZ9'},{av:'A6465AlbRLu',fld:'ALBRLU',pic:'ZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A4920AlbRGrm2',fld:'ALBRGRM2',pic:'ZZZ9'},{av:'A4921AlbRAnc',fld:'ALBRANC',pic:'ZZZ9'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRENT","{handler:'valid_Albrent',iparms:[{av:'AV97Doc_6',fld:'vDOC_6',pic:'ZZZZZ9'},{av:'A46AlbREnt',fld:'ALBRENT',pic:''},{av:'AV84Documento',fld:'vDOCUMENTO',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRENT",",oparms:[{av:'AV84Documento',fld:'vDOCUMENTO',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O52AlbRPieEnt'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'AV89Albrpieent',fld:'vALBRPIEENT',pic:'ZZZZZ9'},{av:'AV141PieEntold',fld:'vPIEENTOLD',pic:'ZZZZZ9'},{av:'AV156oldpiee',fld:'vOLDPIEE',pic:'ZZZ9'},{av:'A6181AlbrPieC',fld:'ALBRPIEC',pic:'ZZZZZ9'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[{av:'AV89Albrpieent',fld:'vALBRPIEENT',pic:'ZZZZZ9'},{av:'AV141PieEntold',fld:'vPIEENTOLD',pic:'ZZZZZ9'},{av:'AV156oldpiee',fld:'vOLDPIEE',pic:'ZZZ9'},{av:'A6181AlbrPieC',fld:'ALBRPIEC',pic:'ZZZZZ9'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRUNI","{handler:'valid_Albruni',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRUNI",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRFEN","{handler:'valid_Albrfen',iparms:[{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'AV96albrfen',fld:'vALBRFEN',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRFEN",",oparms:[{av:'AV96albrfen',fld:'vALBRFEN',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O58AlbRUniEnt'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'AV69ALbRunient',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV142UniENtold',fld:'vUNIENTOLD',pic:'ZZZZZ9.99'},{av:'AV154Oldunie',fld:'vOLDUNIE',pic:'ZZZZZ9.99'},{av:'A6180AlbrUniC',fld:'ALBRUNIC',pic:'ZZZZZ9.99'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[{av:'AV69ALbRunient',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV142UniENtold',fld:'vUNIENTOLD',pic:'ZZZZZ9.99'},{av:'AV154Oldunie',fld:'vOLDUNIE',pic:'ZZZZZ9.99'},{av:'A6180AlbrUniC',fld:'ALBRUNIC',pic:'ZZZZZ9.99'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRREO","{handler:'valid_Albrreo',iparms:[{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'AV92albrreo',fld:'vALBRREO',pic:'@!'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRREO",",oparms:[{av:'AV92albrreo',fld:'vALBRREO',pic:'@!'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[{av:'O54AlbRPieUti'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV157oldpieu',fld:'vOLDPIEU',pic:'ZZZ9'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV157oldpieu',fld:'vOLDPIEU',pic:'ZZZ9'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O60AlbRUniUti'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'AV155olduniu',fld:'vOLDUNIU',pic:'ZZZZZ9.99'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'AV155olduniu',fld:'vOLDUNIU',pic:'ZZZZZ9.99'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRUNIDIS","{handler:'valid_Albrunidis',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRUNIDIS",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBREST","{handler:'valid_Albrest',iparms:[{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'AV18AlbCum',fld:'vALBCUM',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBREST",",oparms:[{av:'AV18AlbCum',fld:'vALBCUM',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_TIPENTCOD","{handler:'valid_Tipentcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'},{av:'A1212TipEntNom',fld:'TIPENTNOM',pic:''},{av:'AV95TipEntCod',fld:'vTIPENTCOD',pic:'ZZZ9'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_TIPENTCOD",",oparms:[{av:'A1212TipEntNom',fld:'TIPENTNOM',pic:''},{av:'AV95TipEntCod',fld:'vTIPENTCOD',pic:'ZZZ9'},{av:'edtTipEntCod_Enabled',ctrl:'TIPENTCOD',prop:'Enabled'},{av:'edtAlbRLoc_Enabled',ctrl:'ALBRLOC',prop:'Enabled'},{av:'edtCliCod_Enabled',ctrl:'CLICOD',prop:'Enabled'},{av:'edtAlbRef_Enabled',ctrl:'ALBREF',prop:'Enabled'},{av:'edtAlbRFen_Enabled',ctrl:'ALBRFEN',prop:'Enabled'},{av:'cmbAlbRUni'},{av:'cmbAlbRReo'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_PROCECOD","{handler:'valid_Procecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A971ProceNom',fld:'PROCENOM',pic:''},{av:'AV87Procecod',fld:'vPROCECOD',pic:'ZZZ9'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_PROCECOD",",oparms:[{av:'A971ProceNom',fld:'PROCENOM',pic:''},{av:'AV87Procecod',fld:'vPROCECOD',pic:'ZZZ9'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRULIN","{handler:'valid_Albrulin',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRULIN",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBREFDSC","{handler:'valid_Albrefdsc',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBREFDSC",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBPMPPZA","{handler:'valid_Albpmppza',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBPMPPZA",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRPRE","{handler:'valid_Albrpre',iparms:[{av:'A5743AlbRPre',fld:'ALBRPRE',pic:'ZZZZZ9.99'},{av:'AV90Albrpre',fld:'vALBRPRE',pic:'ZZZZZ9.99'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRPRE",",oparms:[{av:'AV90Albrpre',fld:'vALBRPRE',pic:'ZZZZZ9.99'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRUNIC","{handler:'valid_Albrunic',iparms:[{av:'A6180AlbrUniC',fld:'ALBRUNIC',pic:'ZZZZZ9.99'},{av:'AV94AlbRunic',fld:'vALBRUNIC',pic:'ZZZZZ9.99'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRUNIC",",oparms:[{av:'AV94AlbRunic',fld:'vALBRUNIC',pic:'ZZZZZ9.99'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRNF","{handler:'valid_Albrnf',iparms:[{av:'A6182AlbrNF',fld:'ALBRNF',pic:'@!'},{av:'AV93albrnf',fld:'vALBRNF',pic:'@!'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRNF",",oparms:[{av:'AV93albrnf',fld:'vALBRNF',pic:'@!'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRFENF","{handler:'valid_Albrfenf',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRFENF",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRCFOP","{handler:'valid_Albrcfop',iparms:[{av:'A6184AlbrCfop',fld:'ALBRCFOP',pic:''},{av:'AV91albrcfop',fld:'vALBRCFOP',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRCFOP",",oparms:[{av:'AV91albrcfop',fld:'vALBRCFOP',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRTARTC","{handler:'valid_Albrtartc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6263AlbRTartC',fld:'ALBRTARTC',pic:'ZZZ9'},{av:'A6264AlbRTartD',fld:'ALBRTARTD',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRTARTC",",oparms:[{av:'A6264AlbRTartD',fld:'ALBRTARTD',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRIMP","{handler:'valid_Albrimp',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRIMP",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRTELAR","{handler:'valid_Albrtelar',iparms:[{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'AV103Erfoc',fld:'vERFOC',pic:'9'},{av:'A4602AlbRMdlCod',fld:'ALBRMDLCOD',pic:''},{av:'A6463AlbRLote',fld:'ALBRLOTE',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A6464AlbRTelar',fld:'ALBRTELAR',pic:''},{av:'AV149AlbStLot',fld:'vALBSTLOT',pic:'9'},{av:'A317AlbStLot',fld:'ALBSTLOT',pic:'9'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRTELAR",",oparms:[{av:'A317AlbStLot',fld:'ALBSTLOT',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6463AlbRLote',fld:'ALBRLOTE',pic:''},{av:'A4602AlbRMdlCod',fld:'ALBRMDLCOD',pic:''},{av:'A6464AlbRTelar',fld:'ALBRTELAR',pic:''},{av:'AV149AlbStLot',fld:'vALBSTLOT',pic:'9'},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALMCOD","{handler:'valid_Almcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4792AlmCod',fld:'ALMCOD',pic:'9'},{av:'A4793AlmNom',fld:'ALMNOM',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALMCOD",",oparms:[{av:'A4793AlmNom',fld:'ALMNOM',pic:''},{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("VALID_ALBRLIN","{handler:'valid_Albrlin',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("VALID_ALBRLIN",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
      setEventMetadata("NULL","{handler:'valid_Albrobs',iparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]");
      setEventMetadata("NULL",",oparms:[{av:'A5745AlbRRep',fld:'ALBRREP',pic:'9'}]}");
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
      pr_default.close(26);
      pr_default.close(25);
      pr_default.close(30);
      pr_default.close(27);
      pr_default.close(29);
      pr_default.close(28);
      pr_default.close(31);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOAV88AlbRef = "" ;
      wcpOAV163Unidades = "" ;
      wcpOAV164vDisLoc = "" ;
      Z396EmprCod = "" ;
      Z45AlbRef = "" ;
      Z56AlbRUni = "" ;
      Z46AlbREnt = "" ;
      Z50AlbRLoc = "" ;
      Z49AlbRFen = GXutil.nullDate() ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z55AlbRReo = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      Z1291AlbRDes = "" ;
      Z3613AlbRefDsc = "" ;
      Z4290AlbPmPPza = DecimalUtil.ZERO ;
      Z5743AlbRPre = DecimalUtil.ZERO ;
      Z5744AlbRAju = DecimalUtil.ZERO ;
      Z5806AlbREnt2 = "" ;
      Z6178AlbrUsu = "" ;
      Z6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      Z6180AlbrUniC = DecimalUtil.ZERO ;
      Z6182AlbrNF = "" ;
      Z6183AlbrFeNf = GXutil.nullDate() ;
      Z6184AlbrCfop = "" ;
      Z3359AlbRDisCli = "" ;
      Z3360AlbRImp = "" ;
      Z6463AlbRLote = "" ;
      Z6464AlbRTelar = "" ;
      Z6465AlbRLu = DecimalUtil.ZERO ;
      Z4602AlbRMdlCod = "" ;
      Z6470AlbRTara = DecimalUtil.ZERO ;
      Z6471AlbRUniB = DecimalUtil.ZERO ;
      Z6488AlbDocPrv = "" ;
      Z6523AlbRUdas = DecimalUtil.ZERO ;
      Z8023AlbColor = "" ;
      Z8024AlbOpsT = "" ;
      Z8025AlbOpsC = "" ;
      Z8026AlbOC = "" ;
      Z8027AlbHdri = "" ;
      Z8028AlbNumB = "" ;
      Z8029AlbNumM = "" ;
      Z8030AlbAncC = DecimalUtil.ZERO ;
      Z8032AlbAncCr = DecimalUtil.ZERO ;
      Z8035AlbMaqTej = "" ;
      Z9793AlbPdaC = "" ;
      Z9794AlbOStj = "" ;
      O60AlbRUniUti = DecimalUtil.ZERO ;
      O58AlbRUniEnt = DecimalUtil.ZERO ;
      N50AlbRLoc = "" ;
      N45AlbRef = "" ;
      N49AlbRFen = GXutil.nullDate() ;
      N56AlbRUni = "" ;
      N55AlbRReo = "" ;
      Z1300AlbRObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A6264AlbRTartD = "" ;
      AV74Compos = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A6463AlbRLote = "" ;
      A4602AlbRMdlCod = "" ;
      A6464AlbRTelar = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      AV88AlbRef = "" ;
      AV163Unidades = "" ;
      AV164vDisLoc = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A56AlbRUni = "" ;
      A55AlbRReo = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A407EmprNom = "" ;
      A279CliNom = "" ;
      A841TrnNom = "" ;
      A46AlbREnt = "" ;
      A50AlbRLoc = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A59AlbRUniReb = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      A1212TipEntNom = "" ;
      A1291AlbRDes = "" ;
      A971ProceNom = "" ;
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      A5743AlbRPre = DecimalUtil.ZERO ;
      A5744AlbRAju = DecimalUtil.ZERO ;
      A5806AlbREnt2 = "" ;
      A6178AlbrUsu = "" ;
      A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      A6180AlbrUniC = DecimalUtil.ZERO ;
      A6182AlbrNF = "" ;
      A6183AlbrFeNf = GXutil.nullDate() ;
      A6184AlbrCfop = "" ;
      A3359AlbRDisCli = "" ;
      A3360AlbRImp = "" ;
      A6470AlbRTara = DecimalUtil.ZERO ;
      A6471AlbRUniB = DecimalUtil.ZERO ;
      A6488AlbDocPrv = "" ;
      A6523AlbRUdas = DecimalUtil.ZERO ;
      A4793AlmNom = "" ;
      A8023AlbColor = "" ;
      A8024AlbOpsT = "" ;
      A8025AlbOpsC = "" ;
      A8026AlbOC = "" ;
      A8027AlbHdri = "" ;
      A8028AlbNumB = "" ;
      A8029AlbNumM = "" ;
      A8030AlbAncC = DecimalUtil.ZERO ;
      A8032AlbAncCr = DecimalUtil.ZERO ;
      A8035AlbMaqTej = "" ;
      A9793AlbPdaC = "" ;
      A9794AlbOStj = "" ;
      A8723CliEst = "" ;
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtalbre5_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      B60AlbRUniUti = DecimalUtil.ZERO ;
      B58AlbRUniEnt = DecimalUtil.ZERO ;
      sMode191 = "" ;
      sStyleString = "" ;
      AV44Modo = "" ;
      AV85Albrfenf = GXutil.nullDate() ;
      AV17UsurCod = "" ;
      AV18AlbCum = "" ;
      AV84Documento = "" ;
      AV69ALbRunient = DecimalUtil.ZERO ;
      AV94AlbRunic = DecimalUtil.ZERO ;
      AV90Albrpre = DecimalUtil.ZERO ;
      AV96albrfen = GXutil.nullDate() ;
      AV91albrcfop = "" ;
      AV92albrreo = "" ;
      AV93albrnf = "" ;
      AV142UniENtold = DecimalUtil.ZERO ;
      AV154Oldunie = DecimalUtil.ZERO ;
      AV155olduniu = DecimalUtil.ZERO ;
      AV153Texto_ii = "" ;
      AV168Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      forbiddenHiddens2 = new com.genexus.util.GXProperties();
      hsh2 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A1300AlbRObs = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z8723CliEst = "" ;
      Z841TrnNom = "" ;
      Z1212TipEntNom = "" ;
      Z971ProceNom = "" ;
      Z6264AlbRTartD = "" ;
      Z4793AlmNom = "" ;
      T01AE13_A44AlbRecCod = new int[1] ;
      T01AE13_n44AlbRecCod = new boolean[] {false} ;
      T01AE13_A252CliCod = new int[1] ;
      T01AE13_A45AlbRef = new String[] {""} ;
      T01AE13_A56AlbRUni = new String[] {""} ;
      T01AE13_A47AlbREst = new byte[1] ;
      T01AE13_A317AlbStLot = new byte[1] ;
      T01AE13_A407EmprNom = new String[] {""} ;
      T01AE13_n407EmprNom = new boolean[] {false} ;
      T01AE13_A279CliNom = new String[] {""} ;
      T01AE13_A841TrnNom = new String[] {""} ;
      T01AE13_n841TrnNom = new boolean[] {false} ;
      T01AE13_A46AlbREnt = new String[] {""} ;
      T01AE13_A52AlbRPieEnt = new int[1] ;
      T01AE13_A50AlbRLoc = new String[] {""} ;
      T01AE13_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01AE13_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE13_A55AlbRReo = new String[] {""} ;
      T01AE13_A54AlbRPieUti = new int[1] ;
      T01AE13_A53AlbRPieReb = new int[1] ;
      T01AE13_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE13_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE13_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T01AE13_A1212TipEntNom = new String[] {""} ;
      T01AE13_n1212TipEntNom = new boolean[] {false} ;
      T01AE13_A1222AlbNumEti = new short[1] ;
      T01AE13_A1291AlbRDes = new String[] {""} ;
      T01AE13_A971ProceNom = new String[] {""} ;
      T01AE13_n971ProceNom = new boolean[] {false} ;
      T01AE13_A1301AlbRUlin = new byte[1] ;
      T01AE13_A3613AlbRefDsc = new String[] {""} ;
      T01AE13_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE13_A4920AlbRGrm2 = new short[1] ;
      T01AE13_A4921AlbRAnc = new short[1] ;
      T01AE13_A4922AlbPml = new short[1] ;
      T01AE13_A5743AlbRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE13_A5744AlbRAju = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE13_A5745AlbRRep = new byte[1] ;
      T01AE13_A5806AlbREnt2 = new String[] {""} ;
      T01AE13_A6178AlbrUsu = new String[] {""} ;
      T01AE13_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01AE13_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE13_A6181AlbrPieC = new int[1] ;
      T01AE13_A6182AlbrNF = new String[] {""} ;
      T01AE13_A6183AlbrFeNf = new java.util.Date[] {GXutil.nullDate()} ;
      T01AE13_A6184AlbrCfop = new String[] {""} ;
      T01AE13_A3359AlbRDisCli = new String[] {""} ;
      T01AE13_A6264AlbRTartD = new String[] {""} ;
      T01AE13_n6264AlbRTartD = new boolean[] {false} ;
      T01AE13_A3360AlbRImp = new String[] {""} ;
      T01AE13_A6463AlbRLote = new String[] {""} ;
      T01AE13_A6464AlbRTelar = new String[] {""} ;
      T01AE13_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE13_A4602AlbRMdlCod = new String[] {""} ;
      T01AE13_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE13_A6471AlbRUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE13_A6488AlbDocPrv = new String[] {""} ;
      T01AE13_A6523AlbRUdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE13_A4793AlmNom = new String[] {""} ;
      T01AE13_n4793AlmNom = new boolean[] {false} ;
      T01AE13_A8023AlbColor = new String[] {""} ;
      T01AE13_A8024AlbOpsT = new String[] {""} ;
      T01AE13_A8025AlbOpsC = new String[] {""} ;
      T01AE13_A8026AlbOC = new String[] {""} ;
      T01AE13_A8027AlbHdri = new String[] {""} ;
      T01AE13_A8028AlbNumB = new String[] {""} ;
      T01AE13_A8029AlbNumM = new String[] {""} ;
      T01AE13_A8030AlbAncC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE13_A8031AlbDndC = new short[1] ;
      T01AE13_A8032AlbAncCr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE13_A8033AlbDndCr = new short[1] ;
      T01AE13_A8034AlbGalga = new short[1] ;
      T01AE13_A8035AlbMaqTej = new String[] {""} ;
      T01AE13_A8036AlbDmt = new short[1] ;
      T01AE13_A9793AlbPdaC = new String[] {""} ;
      T01AE13_A9794AlbOStj = new String[] {""} ;
      T01AE13_A10358AlbTurno = new byte[1] ;
      T01AE13_A8723CliEst = new String[] {""} ;
      T01AE13_A396EmprCod = new String[] {""} ;
      T01AE13_A6263AlbRTartC = new short[1] ;
      T01AE13_n6263AlbRTartC = new boolean[] {false} ;
      T01AE13_A840TrnCod = new short[1] ;
      T01AE13_n840TrnCod = new boolean[] {false} ;
      T01AE13_A970ProceCod = new short[1] ;
      T01AE13_n970ProceCod = new boolean[] {false} ;
      T01AE13_A1211TipEntCod = new short[1] ;
      T01AE13_n1211TipEntCod = new boolean[] {false} ;
      T01AE13_A4792AlmCod = new byte[1] ;
      T01AE13_n4792AlmCod = new boolean[] {false} ;
      T01AE6_A407EmprNom = new String[] {""} ;
      T01AE6_n407EmprNom = new boolean[] {false} ;
      T01AE7_A279CliNom = new String[] {""} ;
      T01AE7_A8723CliEst = new String[] {""} ;
      T01AE8_A6264AlbRTartD = new String[] {""} ;
      T01AE8_n6264AlbRTartD = new boolean[] {false} ;
      T01AE9_A841TrnNom = new String[] {""} ;
      T01AE9_n841TrnNom = new boolean[] {false} ;
      T01AE10_A971ProceNom = new String[] {""} ;
      T01AE10_n971ProceNom = new boolean[] {false} ;
      T01AE11_A1212TipEntNom = new String[] {""} ;
      T01AE11_n1212TipEntNom = new boolean[] {false} ;
      T01AE12_A4793AlmNom = new String[] {""} ;
      T01AE12_n4793AlmNom = new boolean[] {false} ;
      T01AE14_A407EmprNom = new String[] {""} ;
      T01AE14_n407EmprNom = new boolean[] {false} ;
      T01AE15_A279CliNom = new String[] {""} ;
      T01AE15_A8723CliEst = new String[] {""} ;
      T01AE16_A6264AlbRTartD = new String[] {""} ;
      T01AE16_n6264AlbRTartD = new boolean[] {false} ;
      T01AE17_A841TrnNom = new String[] {""} ;
      T01AE17_n841TrnNom = new boolean[] {false} ;
      T01AE18_A971ProceNom = new String[] {""} ;
      T01AE18_n971ProceNom = new boolean[] {false} ;
      T01AE19_A1212TipEntNom = new String[] {""} ;
      T01AE19_n1212TipEntNom = new boolean[] {false} ;
      T01AE20_A4793AlmNom = new String[] {""} ;
      T01AE20_n4793AlmNom = new boolean[] {false} ;
      T01AE21_A396EmprCod = new String[] {""} ;
      T01AE21_A44AlbRecCod = new int[1] ;
      T01AE21_n44AlbRecCod = new boolean[] {false} ;
      T01AE5_A44AlbRecCod = new int[1] ;
      T01AE5_n44AlbRecCod = new boolean[] {false} ;
      T01AE5_A252CliCod = new int[1] ;
      T01AE5_A45AlbRef = new String[] {""} ;
      T01AE5_A56AlbRUni = new String[] {""} ;
      T01AE5_A47AlbREst = new byte[1] ;
      T01AE5_A317AlbStLot = new byte[1] ;
      T01AE5_A46AlbREnt = new String[] {""} ;
      T01AE5_A52AlbRPieEnt = new int[1] ;
      T01AE5_A50AlbRLoc = new String[] {""} ;
      T01AE5_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01AE5_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE5_A55AlbRReo = new String[] {""} ;
      T01AE5_A54AlbRPieUti = new int[1] ;
      T01AE5_A53AlbRPieReb = new int[1] ;
      T01AE5_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE5_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE5_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T01AE5_A1222AlbNumEti = new short[1] ;
      T01AE5_A1291AlbRDes = new String[] {""} ;
      T01AE5_A1301AlbRUlin = new byte[1] ;
      T01AE5_A3613AlbRefDsc = new String[] {""} ;
      T01AE5_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE5_A4920AlbRGrm2 = new short[1] ;
      T01AE5_A4921AlbRAnc = new short[1] ;
      T01AE5_A4922AlbPml = new short[1] ;
      T01AE5_A5743AlbRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE5_A5744AlbRAju = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE5_A5745AlbRRep = new byte[1] ;
      T01AE5_A5806AlbREnt2 = new String[] {""} ;
      T01AE5_A6178AlbrUsu = new String[] {""} ;
      T01AE5_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01AE5_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE5_A6181AlbrPieC = new int[1] ;
      T01AE5_A6182AlbrNF = new String[] {""} ;
      T01AE5_A6183AlbrFeNf = new java.util.Date[] {GXutil.nullDate()} ;
      T01AE5_A6184AlbrCfop = new String[] {""} ;
      T01AE5_A3359AlbRDisCli = new String[] {""} ;
      T01AE5_A3360AlbRImp = new String[] {""} ;
      T01AE5_A6463AlbRLote = new String[] {""} ;
      T01AE5_A6464AlbRTelar = new String[] {""} ;
      T01AE5_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE5_A4602AlbRMdlCod = new String[] {""} ;
      T01AE5_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE5_A6471AlbRUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE5_A6488AlbDocPrv = new String[] {""} ;
      T01AE5_A6523AlbRUdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE5_A8023AlbColor = new String[] {""} ;
      T01AE5_A8024AlbOpsT = new String[] {""} ;
      T01AE5_A8025AlbOpsC = new String[] {""} ;
      T01AE5_A8026AlbOC = new String[] {""} ;
      T01AE5_A8027AlbHdri = new String[] {""} ;
      T01AE5_A8028AlbNumB = new String[] {""} ;
      T01AE5_A8029AlbNumM = new String[] {""} ;
      T01AE5_A8030AlbAncC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE5_A8031AlbDndC = new short[1] ;
      T01AE5_A8032AlbAncCr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE5_A8033AlbDndCr = new short[1] ;
      T01AE5_A8034AlbGalga = new short[1] ;
      T01AE5_A8035AlbMaqTej = new String[] {""} ;
      T01AE5_A8036AlbDmt = new short[1] ;
      T01AE5_A9793AlbPdaC = new String[] {""} ;
      T01AE5_A9794AlbOStj = new String[] {""} ;
      T01AE5_A10358AlbTurno = new byte[1] ;
      T01AE5_A396EmprCod = new String[] {""} ;
      T01AE5_A6263AlbRTartC = new short[1] ;
      T01AE5_n6263AlbRTartC = new boolean[] {false} ;
      T01AE5_A840TrnCod = new short[1] ;
      T01AE5_n840TrnCod = new boolean[] {false} ;
      T01AE5_A970ProceCod = new short[1] ;
      T01AE5_n970ProceCod = new boolean[] {false} ;
      T01AE5_A1211TipEntCod = new short[1] ;
      T01AE5_n1211TipEntCod = new boolean[] {false} ;
      T01AE5_A4792AlmCod = new byte[1] ;
      T01AE5_n4792AlmCod = new boolean[] {false} ;
      sMode7 = "" ;
      T01AE22_A396EmprCod = new String[] {""} ;
      T01AE22_A44AlbRecCod = new int[1] ;
      T01AE22_n44AlbRecCod = new boolean[] {false} ;
      T01AE22_A252CliCod = new int[1] ;
      T01AE23_A396EmprCod = new String[] {""} ;
      T01AE23_A44AlbRecCod = new int[1] ;
      T01AE23_n44AlbRecCod = new boolean[] {false} ;
      T01AE23_A252CliCod = new int[1] ;
      T01AE4_A44AlbRecCod = new int[1] ;
      T01AE4_n44AlbRecCod = new boolean[] {false} ;
      T01AE4_A252CliCod = new int[1] ;
      T01AE4_A45AlbRef = new String[] {""} ;
      T01AE4_A56AlbRUni = new String[] {""} ;
      T01AE4_A47AlbREst = new byte[1] ;
      T01AE4_A317AlbStLot = new byte[1] ;
      T01AE4_A46AlbREnt = new String[] {""} ;
      T01AE4_A52AlbRPieEnt = new int[1] ;
      T01AE4_A50AlbRLoc = new String[] {""} ;
      T01AE4_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01AE4_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE4_A55AlbRReo = new String[] {""} ;
      T01AE4_A54AlbRPieUti = new int[1] ;
      T01AE4_A53AlbRPieReb = new int[1] ;
      T01AE4_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE4_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE4_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T01AE4_A1222AlbNumEti = new short[1] ;
      T01AE4_A1291AlbRDes = new String[] {""} ;
      T01AE4_A1301AlbRUlin = new byte[1] ;
      T01AE4_A3613AlbRefDsc = new String[] {""} ;
      T01AE4_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE4_A4920AlbRGrm2 = new short[1] ;
      T01AE4_A4921AlbRAnc = new short[1] ;
      T01AE4_A4922AlbPml = new short[1] ;
      T01AE4_A5743AlbRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE4_A5744AlbRAju = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE4_A5745AlbRRep = new byte[1] ;
      T01AE4_A5806AlbREnt2 = new String[] {""} ;
      T01AE4_A6178AlbrUsu = new String[] {""} ;
      T01AE4_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01AE4_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE4_A6181AlbrPieC = new int[1] ;
      T01AE4_A6182AlbrNF = new String[] {""} ;
      T01AE4_A6183AlbrFeNf = new java.util.Date[] {GXutil.nullDate()} ;
      T01AE4_A6184AlbrCfop = new String[] {""} ;
      T01AE4_A3359AlbRDisCli = new String[] {""} ;
      T01AE4_A3360AlbRImp = new String[] {""} ;
      T01AE4_A6463AlbRLote = new String[] {""} ;
      T01AE4_A6464AlbRTelar = new String[] {""} ;
      T01AE4_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE4_A4602AlbRMdlCod = new String[] {""} ;
      T01AE4_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE4_A6471AlbRUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE4_A6488AlbDocPrv = new String[] {""} ;
      T01AE4_A6523AlbRUdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE4_A8023AlbColor = new String[] {""} ;
      T01AE4_A8024AlbOpsT = new String[] {""} ;
      T01AE4_A8025AlbOpsC = new String[] {""} ;
      T01AE4_A8026AlbOC = new String[] {""} ;
      T01AE4_A8027AlbHdri = new String[] {""} ;
      T01AE4_A8028AlbNumB = new String[] {""} ;
      T01AE4_A8029AlbNumM = new String[] {""} ;
      T01AE4_A8030AlbAncC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE4_A8031AlbDndC = new short[1] ;
      T01AE4_A8032AlbAncCr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01AE4_A8033AlbDndCr = new short[1] ;
      T01AE4_A8034AlbGalga = new short[1] ;
      T01AE4_A8035AlbMaqTej = new String[] {""} ;
      T01AE4_A8036AlbDmt = new short[1] ;
      T01AE4_A9793AlbPdaC = new String[] {""} ;
      T01AE4_A9794AlbOStj = new String[] {""} ;
      T01AE4_A10358AlbTurno = new byte[1] ;
      T01AE4_A396EmprCod = new String[] {""} ;
      T01AE4_A6263AlbRTartC = new short[1] ;
      T01AE4_n6263AlbRTartC = new boolean[] {false} ;
      T01AE4_A840TrnCod = new short[1] ;
      T01AE4_n840TrnCod = new boolean[] {false} ;
      T01AE4_A970ProceCod = new short[1] ;
      T01AE4_n970ProceCod = new boolean[] {false} ;
      T01AE4_A1211TipEntCod = new short[1] ;
      T01AE4_n1211TipEntCod = new boolean[] {false} ;
      T01AE4_A4792AlmCod = new byte[1] ;
      T01AE4_n4792AlmCod = new boolean[] {false} ;
      T01AE27_A407EmprNom = new String[] {""} ;
      T01AE27_n407EmprNom = new boolean[] {false} ;
      T01AE28_A279CliNom = new String[] {""} ;
      T01AE28_A8723CliEst = new String[] {""} ;
      T01AE29_A841TrnNom = new String[] {""} ;
      T01AE29_n841TrnNom = new boolean[] {false} ;
      T01AE30_A1212TipEntNom = new String[] {""} ;
      T01AE30_n1212TipEntNom = new boolean[] {false} ;
      T01AE31_A971ProceNom = new String[] {""} ;
      T01AE31_n971ProceNom = new boolean[] {false} ;
      T01AE32_A6264AlbRTartD = new String[] {""} ;
      T01AE32_n6264AlbRTartD = new boolean[] {false} ;
      T01AE33_A4793AlmNom = new String[] {""} ;
      T01AE33_n4793AlmNom = new boolean[] {false} ;
      T01AE34_A396EmprCod = new String[] {""} ;
      T01AE34_A13026PedDGId = new int[1] ;
      T01AE34_A44AlbRecCod = new int[1] ;
      T01AE34_n44AlbRecCod = new boolean[] {false} ;
      T01AE35_A396EmprCod = new String[] {""} ;
      T01AE35_A11669DevCruId = new int[1] ;
      T01AE35_A44AlbRecCod = new int[1] ;
      T01AE35_n44AlbRecCod = new boolean[] {false} ;
      T01AE36_A396EmprCod = new String[] {""} ;
      T01AE36_A44AlbRecCod = new int[1] ;
      T01AE36_n44AlbRecCod = new boolean[] {false} ;
      T01AE36_A9743Emp_CUb = new String[] {""} ;
      T01AE36_A5860Emp_Anp = new short[1] ;
      T01AE37_A396EmprCod = new String[] {""} ;
      T01AE37_A44AlbRecCod = new int[1] ;
      T01AE37_n44AlbRecCod = new boolean[] {false} ;
      T01AE37_A7130MatC_Pz = new String[] {""} ;
      T01AE38_A396EmprCod = new String[] {""} ;
      T01AE38_A44AlbRecCod = new int[1] ;
      T01AE38_n44AlbRecCod = new boolean[] {false} ;
      T01AE38_A7132MatC_Talla = new String[] {""} ;
      T01AE39_A396EmprCod = new String[] {""} ;
      T01AE39_A44AlbRecCod = new int[1] ;
      T01AE39_n44AlbRecCod = new boolean[] {false} ;
      T01AE39_A7115MatC_Lin = new short[1] ;
      T01AE40_A396EmprCod = new String[] {""} ;
      T01AE40_A30AlbProCod = new long[1] ;
      T01AE40_A129BarCod = new int[1] ;
      T01AE40_A132BarCodReo = new byte[1] ;
      T01AE40_A130BarCodPar = new String[] {""} ;
      T01AE40_A6622AlbHdRLn = new short[1] ;
      T01AE41_A396EmprCod = new String[] {""} ;
      T01AE41_A6235DevEmpCod = new int[1] ;
      T01AE41_A6243DevNumLin = new byte[1] ;
      T01AE42_A396EmprCod = new String[] {""} ;
      T01AE42_A44AlbRecCod = new int[1] ;
      T01AE42_n44AlbRecCod = new boolean[] {false} ;
      T01AE42_A4596AlbRDefCod = new short[1] ;
      T01AE43_A396EmprCod = new String[] {""} ;
      T01AE43_A44AlbRecCod = new int[1] ;
      T01AE43_n44AlbRecCod = new boolean[] {false} ;
      T01AE43_A2159AlbRecPie = new String[] {""} ;
      T01AE44_A396EmprCod = new String[] {""} ;
      T01AE44_A44AlbRecCod = new int[1] ;
      T01AE44_n44AlbRecCod = new boolean[] {false} ;
      T01AE44_A2165HisEmpLin = new short[1] ;
      T01AE45_A396EmprCod = new String[] {""} ;
      T01AE45_A361DisCod = new int[1] ;
      T01AE45_A44AlbRecCod = new int[1] ;
      T01AE45_n44AlbRecCod = new boolean[] {false} ;
      T01AE46_A396EmprCod = new String[] {""} ;
      T01AE46_A323DevGenCod = new int[1] ;
      T01AE47_A396EmprCod = new String[] {""} ;
      T01AE47_A129BarCod = new int[1] ;
      T01AE47_A132BarCodReo = new byte[1] ;
      T01AE47_A130BarCodPar = new String[] {""} ;
      T01AE47_A200BarPieCod = new String[] {""} ;
      T01AE49_A396EmprCod = new String[] {""} ;
      T01AE49_A44AlbRecCod = new int[1] ;
      T01AE49_n44AlbRecCod = new boolean[] {false} ;
      T01AE50_A44AlbRecCod = new int[1] ;
      T01AE50_n44AlbRecCod = new boolean[] {false} ;
      T01AE50_A1299AlbRLin = new byte[1] ;
      T01AE50_A1300AlbRObs = new String[] {""} ;
      T01AE50_A396EmprCod = new String[] {""} ;
      T01AE51_A396EmprCod = new String[] {""} ;
      T01AE51_A44AlbRecCod = new int[1] ;
      T01AE51_n44AlbRecCod = new boolean[] {false} ;
      T01AE51_A1299AlbRLin = new byte[1] ;
      T01AE3_A44AlbRecCod = new int[1] ;
      T01AE3_n44AlbRecCod = new boolean[] {false} ;
      T01AE3_A1299AlbRLin = new byte[1] ;
      T01AE3_A1300AlbRObs = new String[] {""} ;
      T01AE3_A396EmprCod = new String[] {""} ;
      T01AE2_A44AlbRecCod = new int[1] ;
      T01AE2_n44AlbRecCod = new boolean[] {false} ;
      T01AE2_A1299AlbRLin = new byte[1] ;
      T01AE2_A1300AlbRObs = new String[] {""} ;
      T01AE2_A396EmprCod = new String[] {""} ;
      T01AE55_A396EmprCod = new String[] {""} ;
      T01AE55_A44AlbRecCod = new int[1] ;
      T01AE55_n44AlbRecCod = new boolean[] {false} ;
      T01AE55_A1299AlbRLin = new byte[1] ;
      Gridtalbre5_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtalbre5_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      iV44Modo = "" ;
      i56AlbRUni = "" ;
      i45AlbRef = "" ;
      i50AlbRLoc = "" ;
      i49AlbRFen = GXutil.nullDate() ;
      i6183AlbrFeNf = GXutil.nullDate() ;
      i55AlbRReo = "" ;
      i48AlbRFecUlt = GXutil.nullDate() ;
      i6182AlbrNF = "" ;
      i6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      i3360AlbRImp = "" ;
      i4602AlbRMdlCod = "" ;
      i6463AlbRLote = "" ;
      i6464AlbRTelar = "" ;
      i6465AlbRLu = DecimalUtil.ZERO ;
      i6470AlbRTara = DecimalUtil.ZERO ;
      i6471AlbRUniB = DecimalUtil.ZERO ;
      i6523AlbRUdas = DecimalUtil.ZERO ;
      i6178AlbrUsu = "" ;
      Gridtalbre5_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      ZV74Compos = "" ;
      ZV96albrfen = GXutil.nullDate() ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      ZV69ALbRunient = DecimalUtil.ZERO ;
      ZV142UniENtold = DecimalUtil.ZERO ;
      ZV154Oldunie = DecimalUtil.ZERO ;
      ZV92albrreo = "" ;
      ZV155olduniu = DecimalUtil.ZERO ;
      ZV90Albrpre = DecimalUtil.ZERO ;
      ZV93albrnf = "" ;
      ZV91albrcfop = "" ;
      ZV84Documento = "" ;
      ZV18AlbCum = "" ;
      ZV94AlbRunic = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ45AlbRef = "" ;
      ZZ56AlbRUni = "" ;
      ZZ46AlbREnt = "" ;
      ZZ50AlbRLoc = "" ;
      ZZ49AlbRFen = GXutil.nullDate() ;
      ZZ58AlbRUniEnt = DecimalUtil.ZERO ;
      ZZ55AlbRReo = "" ;
      ZZ60AlbRUniUti = DecimalUtil.ZERO ;
      ZZ59AlbRUniReb = DecimalUtil.ZERO ;
      ZZ48AlbRFecUlt = GXutil.nullDate() ;
      ZZ1291AlbRDes = "" ;
      ZZ3613AlbRefDsc = "" ;
      ZZ4290AlbPmPPza = DecimalUtil.ZERO ;
      ZZ5743AlbRPre = DecimalUtil.ZERO ;
      ZZ5744AlbRAju = DecimalUtil.ZERO ;
      ZZ5806AlbREnt2 = "" ;
      ZZ6178AlbrUsu = "" ;
      ZZ6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      ZZ6182AlbrNF = "" ;
      ZZ6183AlbrFeNf = GXutil.nullDate() ;
      ZZ6184AlbrCfop = "" ;
      ZZ3359AlbRDisCli = "" ;
      ZZ3360AlbRImp = "" ;
      ZZ6463AlbRLote = "" ;
      ZZ6464AlbRTelar = "" ;
      ZZ6465AlbRLu = DecimalUtil.ZERO ;
      ZZ4602AlbRMdlCod = "" ;
      ZZ6470AlbRTara = DecimalUtil.ZERO ;
      ZZ6471AlbRUniB = DecimalUtil.ZERO ;
      ZZ6488AlbDocPrv = "" ;
      ZZ6523AlbRUdas = DecimalUtil.ZERO ;
      ZZ8023AlbColor = "" ;
      ZZ8024AlbOpsT = "" ;
      ZZ8025AlbOpsC = "" ;
      ZZ8026AlbOC = "" ;
      ZZ8027AlbHdri = "" ;
      ZZ8028AlbNumB = "" ;
      ZZ8029AlbNumM = "" ;
      ZZ8030AlbAncC = DecimalUtil.ZERO ;
      ZZ8032AlbAncCr = DecimalUtil.ZERO ;
      ZZ8035AlbMaqTej = "" ;
      ZZ9793AlbPdaC = "" ;
      ZZ9794AlbOStj = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ8723CliEst = "" ;
      ZZ6264AlbRTartD = "" ;
      ZZ841TrnNom = "" ;
      ZZ971ProceNom = "" ;
      ZZ1212TipEntNom = "" ;
      ZZ4793AlmNom = "" ;
      ZZV74Compos = "" ;
      ZZV96albrfen = GXutil.nullDate() ;
      ZZ57AlbRUniDis = DecimalUtil.ZERO ;
      ZZV69ALbRunient = DecimalUtil.ZERO ;
      ZZV142UniENtold = DecimalUtil.ZERO ;
      ZZV154Oldunie = DecimalUtil.ZERO ;
      ZZV92albrreo = "" ;
      ZZV155olduniu = DecimalUtil.ZERO ;
      ZZV90Albrpre = DecimalUtil.ZERO ;
      ZZV93albrnf = "" ;
      ZZV91albrcfop = "" ;
      ZZ6180AlbrUniC = DecimalUtil.ZERO ;
      ZZV84Documento = "" ;
      ZZV18AlbCum = "" ;
      ZZV94AlbRunic = DecimalUtil.ZERO ;
      ZO60AlbRUniUti = DecimalUtil.ZERO ;
      ZO58AlbRUniEnt = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int3 = new int[1] ;
      GXv_int9 = new short[1] ;
      GXv_int1 = new short[1] ;
      GXv_char7 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new byte[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.talbre5__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.talbre5__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.talbre5__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.talbre5__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbre5__default(),
         new Object[] {
             new Object[] {
            T01AE2_A44AlbRecCod, T01AE2_A1299AlbRLin, T01AE2_A1300AlbRObs, T01AE2_A396EmprCod
            }
            , new Object[] {
            T01AE3_A44AlbRecCod, T01AE3_A1299AlbRLin, T01AE3_A1300AlbRObs, T01AE3_A396EmprCod
            }
            , new Object[] {
            T01AE4_A44AlbRecCod, T01AE4_A252CliCod, T01AE4_A45AlbRef, T01AE4_A56AlbRUni, T01AE4_A47AlbREst, T01AE4_A317AlbStLot, T01AE4_A46AlbREnt, T01AE4_A52AlbRPieEnt, T01AE4_A50AlbRLoc, T01AE4_A49AlbRFen,
            T01AE4_A58AlbRUniEnt, T01AE4_A55AlbRReo, T01AE4_A54AlbRPieUti, T01AE4_A53AlbRPieReb, T01AE4_A60AlbRUniUti, T01AE4_A59AlbRUniReb, T01AE4_A48AlbRFecUlt, T01AE4_A1222AlbNumEti, T01AE4_A1291AlbRDes, T01AE4_A1301AlbRUlin,
            T01AE4_A3613AlbRefDsc, T01AE4_A4290AlbPmPPza, T01AE4_A4920AlbRGrm2, T01AE4_A4921AlbRAnc, T01AE4_A4922AlbPml, T01AE4_A5743AlbRPre, T01AE4_A5744AlbRAju, T01AE4_A5745AlbRRep, T01AE4_A5806AlbREnt2, T01AE4_A6178AlbrUsu,
            T01AE4_A6179AlbrHor, T01AE4_A6180AlbrUniC, T01AE4_A6181AlbrPieC, T01AE4_A6182AlbrNF, T01AE4_A6183AlbrFeNf, T01AE4_A6184AlbrCfop, T01AE4_A3359AlbRDisCli, T01AE4_A3360AlbRImp, T01AE4_A6463AlbRLote, T01AE4_A6464AlbRTelar,
            T01AE4_A6465AlbRLu, T01AE4_A4602AlbRMdlCod, T01AE4_A6470AlbRTara, T01AE4_A6471AlbRUniB, T01AE4_A6488AlbDocPrv, T01AE4_A6523AlbRUdas, T01AE4_A8023AlbColor, T01AE4_A8024AlbOpsT, T01AE4_A8025AlbOpsC, T01AE4_A8026AlbOC,
            T01AE4_A8027AlbHdri, T01AE4_A8028AlbNumB, T01AE4_A8029AlbNumM, T01AE4_A8030AlbAncC, T01AE4_A8031AlbDndC, T01AE4_A8032AlbAncCr, T01AE4_A8033AlbDndCr, T01AE4_A8034AlbGalga, T01AE4_A8035AlbMaqTej, T01AE4_A8036AlbDmt,
            T01AE4_A9793AlbPdaC, T01AE4_A9794AlbOStj, T01AE4_A10358AlbTurno, T01AE4_A396EmprCod, T01AE4_A6263AlbRTartC, T01AE4_n6263AlbRTartC, T01AE4_A840TrnCod, T01AE4_n840TrnCod, T01AE4_A970ProceCod, T01AE4_n970ProceCod,
            T01AE4_A1211TipEntCod, T01AE4_n1211TipEntCod, T01AE4_A4792AlmCod, T01AE4_n4792AlmCod
            }
            , new Object[] {
            T01AE5_A44AlbRecCod, T01AE5_A252CliCod, T01AE5_A45AlbRef, T01AE5_A56AlbRUni, T01AE5_A47AlbREst, T01AE5_A317AlbStLot, T01AE5_A46AlbREnt, T01AE5_A52AlbRPieEnt, T01AE5_A50AlbRLoc, T01AE5_A49AlbRFen,
            T01AE5_A58AlbRUniEnt, T01AE5_A55AlbRReo, T01AE5_A54AlbRPieUti, T01AE5_A53AlbRPieReb, T01AE5_A60AlbRUniUti, T01AE5_A59AlbRUniReb, T01AE5_A48AlbRFecUlt, T01AE5_A1222AlbNumEti, T01AE5_A1291AlbRDes, T01AE5_A1301AlbRUlin,
            T01AE5_A3613AlbRefDsc, T01AE5_A4290AlbPmPPza, T01AE5_A4920AlbRGrm2, T01AE5_A4921AlbRAnc, T01AE5_A4922AlbPml, T01AE5_A5743AlbRPre, T01AE5_A5744AlbRAju, T01AE5_A5745AlbRRep, T01AE5_A5806AlbREnt2, T01AE5_A6178AlbrUsu,
            T01AE5_A6179AlbrHor, T01AE5_A6180AlbrUniC, T01AE5_A6181AlbrPieC, T01AE5_A6182AlbrNF, T01AE5_A6183AlbrFeNf, T01AE5_A6184AlbrCfop, T01AE5_A3359AlbRDisCli, T01AE5_A3360AlbRImp, T01AE5_A6463AlbRLote, T01AE5_A6464AlbRTelar,
            T01AE5_A6465AlbRLu, T01AE5_A4602AlbRMdlCod, T01AE5_A6470AlbRTara, T01AE5_A6471AlbRUniB, T01AE5_A6488AlbDocPrv, T01AE5_A6523AlbRUdas, T01AE5_A8023AlbColor, T01AE5_A8024AlbOpsT, T01AE5_A8025AlbOpsC, T01AE5_A8026AlbOC,
            T01AE5_A8027AlbHdri, T01AE5_A8028AlbNumB, T01AE5_A8029AlbNumM, T01AE5_A8030AlbAncC, T01AE5_A8031AlbDndC, T01AE5_A8032AlbAncCr, T01AE5_A8033AlbDndCr, T01AE5_A8034AlbGalga, T01AE5_A8035AlbMaqTej, T01AE5_A8036AlbDmt,
            T01AE5_A9793AlbPdaC, T01AE5_A9794AlbOStj, T01AE5_A10358AlbTurno, T01AE5_A396EmprCod, T01AE5_A6263AlbRTartC, T01AE5_n6263AlbRTartC, T01AE5_A840TrnCod, T01AE5_n840TrnCod, T01AE5_A970ProceCod, T01AE5_n970ProceCod,
            T01AE5_A1211TipEntCod, T01AE5_n1211TipEntCod, T01AE5_A4792AlmCod, T01AE5_n4792AlmCod
            }
            , new Object[] {
            T01AE6_A407EmprNom, T01AE6_n407EmprNom
            }
            , new Object[] {
            T01AE7_A279CliNom, T01AE7_A8723CliEst
            }
            , new Object[] {
            T01AE8_A6264AlbRTartD, T01AE8_n6264AlbRTartD
            }
            , new Object[] {
            T01AE9_A841TrnNom, T01AE9_n841TrnNom
            }
            , new Object[] {
            T01AE10_A971ProceNom, T01AE10_n971ProceNom
            }
            , new Object[] {
            T01AE11_A1212TipEntNom, T01AE11_n1212TipEntNom
            }
            , new Object[] {
            T01AE12_A4793AlmNom, T01AE12_n4793AlmNom
            }
            , new Object[] {
            T01AE13_A44AlbRecCod, T01AE13_A252CliCod, T01AE13_A45AlbRef, T01AE13_A56AlbRUni, T01AE13_A47AlbREst, T01AE13_A317AlbStLot, T01AE13_A407EmprNom, T01AE13_n407EmprNom, T01AE13_A279CliNom, T01AE13_A841TrnNom,
            T01AE13_n841TrnNom, T01AE13_A46AlbREnt, T01AE13_A52AlbRPieEnt, T01AE13_A50AlbRLoc, T01AE13_A49AlbRFen, T01AE13_A58AlbRUniEnt, T01AE13_A55AlbRReo, T01AE13_A54AlbRPieUti, T01AE13_A53AlbRPieReb, T01AE13_A60AlbRUniUti,
            T01AE13_A59AlbRUniReb, T01AE13_A48AlbRFecUlt, T01AE13_A1212TipEntNom, T01AE13_n1212TipEntNom, T01AE13_A1222AlbNumEti, T01AE13_A1291AlbRDes, T01AE13_A971ProceNom, T01AE13_n971ProceNom, T01AE13_A1301AlbRUlin, T01AE13_A3613AlbRefDsc,
            T01AE13_A4290AlbPmPPza, T01AE13_A4920AlbRGrm2, T01AE13_A4921AlbRAnc, T01AE13_A4922AlbPml, T01AE13_A5743AlbRPre, T01AE13_A5744AlbRAju, T01AE13_A5745AlbRRep, T01AE13_A5806AlbREnt2, T01AE13_A6178AlbrUsu, T01AE13_A6179AlbrHor,
            T01AE13_A6180AlbrUniC, T01AE13_A6181AlbrPieC, T01AE13_A6182AlbrNF, T01AE13_A6183AlbrFeNf, T01AE13_A6184AlbrCfop, T01AE13_A3359AlbRDisCli, T01AE13_A6264AlbRTartD, T01AE13_n6264AlbRTartD, T01AE13_A3360AlbRImp, T01AE13_A6463AlbRLote,
            T01AE13_A6464AlbRTelar, T01AE13_A6465AlbRLu, T01AE13_A4602AlbRMdlCod, T01AE13_A6470AlbRTara, T01AE13_A6471AlbRUniB, T01AE13_A6488AlbDocPrv, T01AE13_A6523AlbRUdas, T01AE13_A4793AlmNom, T01AE13_n4793AlmNom, T01AE13_A8023AlbColor,
            T01AE13_A8024AlbOpsT, T01AE13_A8025AlbOpsC, T01AE13_A8026AlbOC, T01AE13_A8027AlbHdri, T01AE13_A8028AlbNumB, T01AE13_A8029AlbNumM, T01AE13_A8030AlbAncC, T01AE13_A8031AlbDndC, T01AE13_A8032AlbAncCr, T01AE13_A8033AlbDndCr,
            T01AE13_A8034AlbGalga, T01AE13_A8035AlbMaqTej, T01AE13_A8036AlbDmt, T01AE13_A9793AlbPdaC, T01AE13_A9794AlbOStj, T01AE13_A10358AlbTurno, T01AE13_A8723CliEst, T01AE13_A396EmprCod, T01AE13_A6263AlbRTartC, T01AE13_n6263AlbRTartC,
            T01AE13_A840TrnCod, T01AE13_n840TrnCod, T01AE13_A970ProceCod, T01AE13_n970ProceCod, T01AE13_A1211TipEntCod, T01AE13_n1211TipEntCod, T01AE13_A4792AlmCod, T01AE13_n4792AlmCod
            }
            , new Object[] {
            T01AE14_A407EmprNom, T01AE14_n407EmprNom
            }
            , new Object[] {
            T01AE15_A279CliNom, T01AE15_A8723CliEst
            }
            , new Object[] {
            T01AE16_A6264AlbRTartD, T01AE16_n6264AlbRTartD
            }
            , new Object[] {
            T01AE17_A841TrnNom, T01AE17_n841TrnNom
            }
            , new Object[] {
            T01AE18_A971ProceNom, T01AE18_n971ProceNom
            }
            , new Object[] {
            T01AE19_A1212TipEntNom, T01AE19_n1212TipEntNom
            }
            , new Object[] {
            T01AE20_A4793AlmNom, T01AE20_n4793AlmNom
            }
            , new Object[] {
            T01AE21_A396EmprCod, T01AE21_A44AlbRecCod
            }
            , new Object[] {
            T01AE22_A396EmprCod, T01AE22_A44AlbRecCod, T01AE22_A252CliCod
            }
            , new Object[] {
            T01AE23_A396EmprCod, T01AE23_A44AlbRecCod, T01AE23_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AE27_A407EmprNom, T01AE27_n407EmprNom
            }
            , new Object[] {
            T01AE28_A279CliNom, T01AE28_A8723CliEst
            }
            , new Object[] {
            T01AE29_A841TrnNom, T01AE29_n841TrnNom
            }
            , new Object[] {
            T01AE30_A1212TipEntNom, T01AE30_n1212TipEntNom
            }
            , new Object[] {
            T01AE31_A971ProceNom, T01AE31_n971ProceNom
            }
            , new Object[] {
            T01AE32_A6264AlbRTartD, T01AE32_n6264AlbRTartD
            }
            , new Object[] {
            T01AE33_A4793AlmNom, T01AE33_n4793AlmNom
            }
            , new Object[] {
            T01AE34_A396EmprCod, T01AE34_A13026PedDGId, T01AE34_A44AlbRecCod
            }
            , new Object[] {
            T01AE35_A396EmprCod, T01AE35_A11669DevCruId, T01AE35_A44AlbRecCod
            }
            , new Object[] {
            T01AE36_A396EmprCod, T01AE36_A44AlbRecCod, T01AE36_A9743Emp_CUb, T01AE36_A5860Emp_Anp
            }
            , new Object[] {
            T01AE37_A396EmprCod, T01AE37_A44AlbRecCod, T01AE37_A7130MatC_Pz
            }
            , new Object[] {
            T01AE38_A396EmprCod, T01AE38_A44AlbRecCod, T01AE38_A7132MatC_Talla
            }
            , new Object[] {
            T01AE39_A396EmprCod, T01AE39_A44AlbRecCod, T01AE39_A7115MatC_Lin
            }
            , new Object[] {
            T01AE40_A396EmprCod, T01AE40_A30AlbProCod, T01AE40_A129BarCod, T01AE40_A132BarCodReo, T01AE40_A130BarCodPar, T01AE40_A6622AlbHdRLn
            }
            , new Object[] {
            T01AE41_A396EmprCod, T01AE41_A6235DevEmpCod, T01AE41_A6243DevNumLin
            }
            , new Object[] {
            T01AE42_A396EmprCod, T01AE42_A44AlbRecCod, T01AE42_A4596AlbRDefCod
            }
            , new Object[] {
            T01AE43_A396EmprCod, T01AE43_A44AlbRecCod, T01AE43_A2159AlbRecPie
            }
            , new Object[] {
            T01AE44_A396EmprCod, T01AE44_A44AlbRecCod, T01AE44_A2165HisEmpLin
            }
            , new Object[] {
            T01AE45_A396EmprCod, T01AE45_A361DisCod, T01AE45_A44AlbRecCod
            }
            , new Object[] {
            T01AE46_A396EmprCod, T01AE46_A323DevGenCod
            }
            , new Object[] {
            T01AE47_A396EmprCod, T01AE47_A129BarCod, T01AE47_A132BarCodReo, T01AE47_A130BarCodPar, T01AE47_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01AE49_A396EmprCod, T01AE49_A44AlbRecCod
            }
            , new Object[] {
            T01AE50_A44AlbRecCod, T01AE50_A1299AlbRLin, T01AE50_A1300AlbRObs, T01AE50_A396EmprCod
            }
            , new Object[] {
            T01AE51_A396EmprCod, T01AE51_A44AlbRecCod, T01AE51_A1299AlbRLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01AE55_A396EmprCod, T01AE55_A44AlbRecCod, T01AE55_A1299AlbRLin
            }
         }
      );
      N252CliCod = 0 ;
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      A44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      AV168Pgmname = "TALBRE5" ;
      Z6523AlbRUdas = DecimalUtil.doubleToDec(0) ;
      A6523AlbRUdas = DecimalUtil.doubleToDec(0) ;
      i6523AlbRUdas = DecimalUtil.doubleToDec(0) ;
      Z6471AlbRUniB = DecimalUtil.doubleToDec(0) ;
      A6471AlbRUniB = DecimalUtil.doubleToDec(0) ;
      i6471AlbRUniB = DecimalUtil.doubleToDec(0) ;
      Z6470AlbRTara = DecimalUtil.doubleToDec(0) ;
      A6470AlbRTara = DecimalUtil.doubleToDec(0) ;
      i6470AlbRTara = DecimalUtil.doubleToDec(0) ;
      Z6465AlbRLu = DecimalUtil.doubleToDec(0) ;
      i6465AlbRLu = DecimalUtil.doubleToDec(0) ;
      A6465AlbRLu = DecimalUtil.doubleToDec(0) ;
      Z6464AlbRTelar = " " ;
      i6464AlbRTelar = " " ;
      A6464AlbRTelar = " " ;
      Z6463AlbRLote = " " ;
      i6463AlbRLote = " " ;
      A6463AlbRLote = " " ;
      Z4602AlbRMdlCod = " " ;
      i4602AlbRMdlCod = " " ;
      A4602AlbRMdlCod = " " ;
      Z3360AlbRImp = httpContext.getMessage( "N", "") ;
      A3360AlbRImp = httpContext.getMessage( "N", "") ;
      i3360AlbRImp = httpContext.getMessage( "N", "") ;
      Z6178AlbrUsu = "" ;
      A6178AlbrUsu = "" ;
      i6178AlbrUsu = "" ;
      Z6179AlbrHor = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      A6179AlbrHor = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      i6179AlbrHor = GXutil.resetDate(GXutil.serverNow( context, remoteHandle, pr_default)) ;
      Z6182AlbrNF = httpContext.getMessage( "N", "") ;
      A6182AlbrNF = httpContext.getMessage( "N", "") ;
      i6182AlbrNF = httpContext.getMessage( "N", "") ;
      Z6181AlbrPieC = 0 ;
      A6181AlbrPieC = 0 ;
      Z6180AlbrUniC = DecimalUtil.ZERO ;
      A6180AlbrUniC = DecimalUtil.ZERO ;
      Z48AlbRFecUlt = GXutil.today( ) ;
      A48AlbRFecUlt = GXutil.today( ) ;
      i48AlbRFecUlt = GXutil.today( ) ;
      Z47AlbREst = (byte)(0) ;
      A47AlbREst = (byte)(0) ;
      Z55AlbRReo = httpContext.getMessage( "NO", "") ;
      N55AlbRReo = httpContext.getMessage( "NO", "") ;
      A55AlbRReo = httpContext.getMessage( "NO", "") ;
      i55AlbRReo = httpContext.getMessage( "NO", "") ;
      Z6183AlbrFeNf = GXutil.today( ) ;
      A6183AlbrFeNf = GXutil.today( ) ;
      i6183AlbrFeNf = GXutil.today( ) ;
      Z49AlbRFen = GXutil.today( ) ;
      N49AlbRFen = GXutil.today( ) ;
      i49AlbRFen = GXutil.today( ) ;
      A49AlbRFen = GXutil.today( ) ;
      Z50AlbRLoc = "" ;
      N50AlbRLoc = "" ;
      A50AlbRLoc = "" ;
      i50AlbRLoc = "" ;
   }

   private byte Z47AlbREst ;
   private byte Z317AlbStLot ;
   private byte Z1301AlbRUlin ;
   private byte Z5745AlbRRep ;
   private byte Z10358AlbTurno ;
   private byte Z4792AlmCod ;
   private byte O1301AlbRUlin ;
   private byte Z1299AlbRLin ;
   private byte GxWebError ;
   private byte AV53FlagFerro ;
   private byte AV159CtrlArt ;
   private byte AV63Flag_artc ;
   private byte AV112Moda21 ;
   private byte AV77Kohler ;
   private byte AV149AlbStLot ;
   private byte AV103Erfoc ;
   private byte A4792AlmCod ;
   private byte nKeyPressed ;
   private byte A1301AlbRUlin ;
   private byte Gx_BScreen ;
   private byte A47AlbREst ;
   private byte A5745AlbRRep ;
   private byte A317AlbStLot ;
   private byte A10358AlbTurno ;
   private byte B1301AlbRUlin ;
   private byte AV50FlagArt ;
   private byte s1301AlbRUlin ;
   private byte A1299AlbRLin ;
   private byte subGridtalbre5_level1item_Backcolorstyle ;
   private byte subGridtalbre5_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i1301AlbRUlin ;
   private byte subGridtalbre5_level1item_Allowselection ;
   private byte subGridtalbre5_level1item_Allowhovering ;
   private byte subGridtalbre5_level1item_Allowcollapsing ;
   private byte subGridtalbre5_level1item_Collapsed ;
   private byte ZV50FlagArt ;
   private byte ZV63Flag_artc ;
   private byte ZV149AlbStLot ;
   private byte ZZ1301AlbRUlin ;
   private byte ZZ5745AlbRRep ;
   private byte ZZ4792AlmCod ;
   private byte ZZ10358AlbTurno ;
   private byte ZZV50FlagArt ;
   private byte ZZV63Flag_artc ;
   private byte ZZV149AlbStLot ;
   private byte ZZ317AlbStLot ;
   private byte ZZ47AlbREst ;
   private byte ZO1301AlbRUlin ;
   private byte GXv_int6[] ;
   private short Z1222AlbNumEti ;
   private short Z4920AlbRGrm2 ;
   private short Z4921AlbRAnc ;
   private short Z4922AlbPml ;
   private short Z8031AlbDndC ;
   private short Z8033AlbDndCr ;
   private short Z8034AlbGalga ;
   private short Z8036AlbDmt ;
   private short Z6263AlbRTartC ;
   private short Z840TrnCod ;
   private short Z970ProceCod ;
   private short Z1211TipEntCod ;
   private short N1211TipEntCod ;
   private short nRcdDeleted_191 ;
   private short nRcdExists_191 ;
   private short nIsMod_191 ;
   private short A6263AlbRTartC ;
   private short A4920AlbRGrm2 ;
   private short A4921AlbRAnc ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short A1211TipEntCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1222AlbNumEti ;
   private short A4922AlbPml ;
   private short A8031AlbDndC ;
   private short A8033AlbDndCr ;
   private short A8034AlbGalga ;
   private short A8036AlbDmt ;
   private short nBlankRcdCount191 ;
   private short RcdFound191 ;
   private short nBlankRcdUsr191 ;
   private short AV87Procecod ;
   private short AV95TipEntCod ;
   private short RcdFound7 ;
   private short nIsDirty_7 ;
   private short nIsDirty_191 ;
   private short ZV95TipEntCod ;
   private short ZV87Procecod ;
   private short ZZ840TrnCod ;
   private short ZZ1211TipEntCod ;
   private short ZZ1222AlbNumEti ;
   private short ZZ970ProceCod ;
   private short ZZ4920AlbRGrm2 ;
   private short ZZ4921AlbRAnc ;
   private short ZZ4922AlbPml ;
   private short ZZ6263AlbRTartC ;
   private short ZZ8031AlbDndC ;
   private short ZZ8033AlbDndCr ;
   private short ZZ8034AlbGalga ;
   private short ZZ8036AlbDmt ;
   private short ZZV95TipEntCod ;
   private short ZZV87Procecod ;
   private short GXv_int9[] ;
   private short GXv_int1[] ;
   private int wcpOA44AlbRecCod ;
   private int wcpOA252CliCod ;
   private int Z44AlbRecCod ;
   private int Z52AlbRPieEnt ;
   private int Z54AlbRPieUti ;
   private int Z53AlbRPieReb ;
   private int Z6181AlbrPieC ;
   private int O54AlbRPieUti ;
   private int O52AlbRPieEnt ;
   private int nRC_GXsfl_438 ;
   private int nGXsfl_438_idx=1 ;
   private int N252CliCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtTrnNom_Enabled ;
   private int edtAlbREnt_Enabled ;
   private int A52AlbRPieEnt ;
   private int edtAlbRPieEnt_Enabled ;
   private int edtAlbRLoc_Enabled ;
   private int edtAlbRFen_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int A54AlbRPieUti ;
   private int edtAlbRPieUti_Enabled ;
   private int A53AlbRPieReb ;
   private int edtAlbRPieReb_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int edtAlbRUniReb_Enabled ;
   private int A51AlbRPieDis ;
   private int edtAlbRPieDis_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int edtAlbRFecUlt_Enabled ;
   private int edtTipEntCod_Enabled ;
   private int edtTipEntNom_Enabled ;
   private int edtAlbNumEti_Enabled ;
   private int edtAlbRDes_Enabled ;
   private int edtProceCod_Enabled ;
   private int edtProceNom_Enabled ;
   private int edtAlbRUlin_Enabled ;
   private int edtAlbRefDsc_Enabled ;
   private int edtAlbPmPPza_Enabled ;
   private int A4291AlbPzaEst ;
   private int edtAlbPzaEst_Enabled ;
   private int edtAlbRGrm2_Enabled ;
   private int edtAlbRAnc_Enabled ;
   private int edtAlbPml_Enabled ;
   private int edtAlbRPre_Enabled ;
   private int edtAlbRAju_Enabled ;
   private int edtAlbREnt2_Enabled ;
   private int edtAlbrUsu_Enabled ;
   private int edtAlbrHor_Enabled ;
   private int edtAlbrUniC_Enabled ;
   private int A6181AlbrPieC ;
   private int edtAlbrPieC_Enabled ;
   private int edtAlbrNF_Enabled ;
   private int edtAlbrFeNf_Enabled ;
   private int edtAlbrCfop_Enabled ;
   private int edtAlbRDisCli_Enabled ;
   private int edtAlbRTartC_Enabled ;
   private int edtAlbRTartD_Enabled ;
   private int edtAlbRImp_Enabled ;
   private int edtAlbRLote_Enabled ;
   private int edtAlbRTelar_Enabled ;
   private int edtAlbRLu_Enabled ;
   private int edtAlbRMdlCod_Enabled ;
   private int edtAlbRTara_Enabled ;
   private int edtAlbRUniB_Enabled ;
   private int edtAlbDocPrv_Enabled ;
   private int edtAlbRUdas_Enabled ;
   private int edtAlmCod_Enabled ;
   private int edtAlmNom_Enabled ;
   private int edtAlbColor_Enabled ;
   private int edtAlbOpsT_Enabled ;
   private int edtAlbOpsC_Enabled ;
   private int edtAlbOC_Enabled ;
   private int edtAlbHdri_Enabled ;
   private int edtAlbNumB_Enabled ;
   private int edtAlbNumM_Enabled ;
   private int edtAlbAncC_Enabled ;
   private int edtAlbDndC_Enabled ;
   private int edtAlbAncCr_Enabled ;
   private int edtAlbDndCr_Enabled ;
   private int edtAlbGalga_Enabled ;
   private int edtAlbMaqTej_Enabled ;
   private int edtAlbDmt_Enabled ;
   private int edtAlbPdaC_Enabled ;
   private int edtAlbOStj_Enabled ;
   private int edtAlbStLot_Enabled ;
   private int edtAlbTurno_Enabled ;
   private int edtCliEst_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int B54AlbRPieUti ;
   private int B52AlbRPieEnt ;
   private int edtAlbRLin_Enabled ;
   private int edtAlbRObs_Enabled ;
   private int fRowAdded ;
   private int AV83AlbReccod ;
   private int AV97Doc_6 ;
   private int AV89Albrpieent ;
   private int AV141PieEntold ;
   private int AV156oldpiee ;
   private int AV157oldpieu ;
   private int GX_JID ;
   private int Z252CliCod ;
   private int subGridtalbre5_level1item_Backcolor ;
   private int subGridtalbre5_level1item_Allbackcolor ;
   private int defedtAlbRLin_Enabled ;
   private int idxLst ;
   private int subGridtalbre5_level1item_Selectedindex ;
   private int subGridtalbre5_level1item_Selectioncolor ;
   private int subGridtalbre5_level1item_Hoveringcolor ;
   private int Z51AlbRPieDis ;
   private int ZV89Albrpieent ;
   private int ZV141PieEntold ;
   private int ZV156oldpiee ;
   private int Z4291AlbPzaEst ;
   private int ZV157oldpieu ;
   private int ZZ44AlbRecCod ;
   private int ZZ52AlbRPieEnt ;
   private int ZZ54AlbRPieUti ;
   private int ZZ53AlbRPieReb ;
   private int ZZ252CliCod ;
   private int ZZ51AlbRPieDis ;
   private int ZZV89Albrpieent ;
   private int ZZV141PieEntold ;
   private int ZZV156oldpiee ;
   private int ZZ4291AlbPzaEst ;
   private int ZZV157oldpieu ;
   private int ZZ6181AlbrPieC ;
   private int ZO54AlbRPieUti ;
   private int ZO52AlbRPieEnt ;
   private int GXv_int3[] ;
   private long GRIDTALBRE5_LEVEL1ITEM_nFirstRecordOnPage ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z59AlbRUniReb ;
   private java.math.BigDecimal Z4290AlbPmPPza ;
   private java.math.BigDecimal Z5743AlbRPre ;
   private java.math.BigDecimal Z5744AlbRAju ;
   private java.math.BigDecimal Z6180AlbrUniC ;
   private java.math.BigDecimal Z6465AlbRLu ;
   private java.math.BigDecimal Z6470AlbRTara ;
   private java.math.BigDecimal Z6471AlbRUniB ;
   private java.math.BigDecimal Z6523AlbRUdas ;
   private java.math.BigDecimal Z8030AlbAncC ;
   private java.math.BigDecimal Z8032AlbAncCr ;
   private java.math.BigDecimal O60AlbRUniUti ;
   private java.math.BigDecimal O58AlbRUniEnt ;
   private java.math.BigDecimal A6465AlbRLu ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A59AlbRUniReb ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A4290AlbPmPPza ;
   private java.math.BigDecimal A5743AlbRPre ;
   private java.math.BigDecimal A5744AlbRAju ;
   private java.math.BigDecimal A6180AlbrUniC ;
   private java.math.BigDecimal A6470AlbRTara ;
   private java.math.BigDecimal A6471AlbRUniB ;
   private java.math.BigDecimal A6523AlbRUdas ;
   private java.math.BigDecimal A8030AlbAncC ;
   private java.math.BigDecimal A8032AlbAncCr ;
   private java.math.BigDecimal B60AlbRUniUti ;
   private java.math.BigDecimal B58AlbRUniEnt ;
   private java.math.BigDecimal AV69ALbRunient ;
   private java.math.BigDecimal AV94AlbRunic ;
   private java.math.BigDecimal AV90Albrpre ;
   private java.math.BigDecimal AV142UniENtold ;
   private java.math.BigDecimal AV154Oldunie ;
   private java.math.BigDecimal AV155olduniu ;
   private java.math.BigDecimal i6465AlbRLu ;
   private java.math.BigDecimal i6470AlbRTara ;
   private java.math.BigDecimal i6471AlbRUniB ;
   private java.math.BigDecimal i6523AlbRUdas ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal ZV69ALbRunient ;
   private java.math.BigDecimal ZV142UniENtold ;
   private java.math.BigDecimal ZV154Oldunie ;
   private java.math.BigDecimal ZV155olduniu ;
   private java.math.BigDecimal ZV90Albrpre ;
   private java.math.BigDecimal ZV94AlbRunic ;
   private java.math.BigDecimal ZZ58AlbRUniEnt ;
   private java.math.BigDecimal ZZ60AlbRUniUti ;
   private java.math.BigDecimal ZZ59AlbRUniReb ;
   private java.math.BigDecimal ZZ4290AlbPmPPza ;
   private java.math.BigDecimal ZZ5743AlbRPre ;
   private java.math.BigDecimal ZZ5744AlbRAju ;
   private java.math.BigDecimal ZZ6465AlbRLu ;
   private java.math.BigDecimal ZZ6470AlbRTara ;
   private java.math.BigDecimal ZZ6471AlbRUniB ;
   private java.math.BigDecimal ZZ6523AlbRUdas ;
   private java.math.BigDecimal ZZ8030AlbAncC ;
   private java.math.BigDecimal ZZ8032AlbAncCr ;
   private java.math.BigDecimal ZZ57AlbRUniDis ;
   private java.math.BigDecimal ZZV69ALbRunient ;
   private java.math.BigDecimal ZZV142UniENtold ;
   private java.math.BigDecimal ZZV154Oldunie ;
   private java.math.BigDecimal ZZV155olduniu ;
   private java.math.BigDecimal ZZV90Albrpre ;
   private java.math.BigDecimal ZZ6180AlbrUniC ;
   private java.math.BigDecimal ZZV94AlbRunic ;
   private java.math.BigDecimal ZO60AlbRUniUti ;
   private java.math.BigDecimal ZO58AlbRUniEnt ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String sPrefix ;
   private String wcpOAV88AlbRef ;
   private String wcpOAV163Unidades ;
   private String wcpOAV164vDisLoc ;
   private String Z396EmprCod ;
   private String Z45AlbRef ;
   private String Z56AlbRUni ;
   private String Z46AlbREnt ;
   private String Z50AlbRLoc ;
   private String Z55AlbRReo ;
   private String Z1291AlbRDes ;
   private String Z3613AlbRefDsc ;
   private String Z5806AlbREnt2 ;
   private String Z6178AlbrUsu ;
   private String Z6182AlbrNF ;
   private String Z6184AlbrCfop ;
   private String Z3359AlbRDisCli ;
   private String Z3360AlbRImp ;
   private String Z6463AlbRLote ;
   private String Z6464AlbRTelar ;
   private String Z4602AlbRMdlCod ;
   private String Z6488AlbDocPrv ;
   private String Z8023AlbColor ;
   private String Z8024AlbOpsT ;
   private String Z8025AlbOpsC ;
   private String Z8026AlbOC ;
   private String Z8027AlbHdri ;
   private String Z8028AlbNumB ;
   private String Z8029AlbNumM ;
   private String Z8035AlbMaqTej ;
   private String Z9793AlbPdaC ;
   private String Z9794AlbOStj ;
   private String N50AlbRLoc ;
   private String N45AlbRef ;
   private String N56AlbRUni ;
   private String N55AlbRReo ;
   private String Z1300AlbRObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A6264AlbRTartD ;
   private String AV74Compos ;
   private String A6463AlbRLote ;
   private String A4602AlbRMdlCod ;
   private String A6464AlbRTelar ;
   private String AV88AlbRef ;
   private String AV163Unidades ;
   private String AV164vDisLoc ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbRef_Internalname ;
   private String sGXsfl_438_idx="0001" ;
   private String A56AlbRUni ;
   private String A55AlbRReo ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divFormcontainer_Internalname ;
   private String divToolbarcell_Internalname ;
   private String TempTags ;
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
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtAlbRef_Jsonclick ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtTrnNom_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Jsonclick ;
   private String edtAlbREnt_Internalname ;
   private String A46AlbREnt ;
   private String edtAlbREnt_Jsonclick ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbRLoc_Internalname ;
   private String A50AlbRLoc ;
   private String edtAlbRLoc_Jsonclick ;
   private String edtAlbRFen_Internalname ;
   private String edtAlbRFen_Jsonclick ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieUti_Jsonclick ;
   private String edtAlbRPieReb_Internalname ;
   private String edtAlbRPieReb_Jsonclick ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRUniUti_Jsonclick ;
   private String edtAlbRUniReb_Internalname ;
   private String edtAlbRUniReb_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String edtAlbRFecUlt_Internalname ;
   private String edtAlbRFecUlt_Jsonclick ;
   private String edtTipEntCod_Internalname ;
   private String edtTipEntCod_Jsonclick ;
   private String edtTipEntNom_Internalname ;
   private String A1212TipEntNom ;
   private String edtTipEntNom_Jsonclick ;
   private String edtAlbNumEti_Internalname ;
   private String edtAlbNumEti_Jsonclick ;
   private String edtAlbRDes_Internalname ;
   private String A1291AlbRDes ;
   private String edtAlbRDes_Jsonclick ;
   private String edtProceCod_Internalname ;
   private String edtProceCod_Jsonclick ;
   private String edtProceNom_Internalname ;
   private String A971ProceNom ;
   private String edtProceNom_Jsonclick ;
   private String edtAlbRUlin_Internalname ;
   private String edtAlbRUlin_Jsonclick ;
   private String edtAlbRefDsc_Internalname ;
   private String edtAlbRefDsc_Jsonclick ;
   private String edtAlbPmPPza_Internalname ;
   private String edtAlbPmPPza_Jsonclick ;
   private String edtAlbPzaEst_Internalname ;
   private String edtAlbPzaEst_Jsonclick ;
   private String edtAlbRGrm2_Internalname ;
   private String edtAlbRGrm2_Jsonclick ;
   private String edtAlbRAnc_Internalname ;
   private String edtAlbRAnc_Jsonclick ;
   private String edtAlbPml_Internalname ;
   private String edtAlbPml_Jsonclick ;
   private String edtAlbRPre_Internalname ;
   private String edtAlbRPre_Jsonclick ;
   private String edtAlbRAju_Internalname ;
   private String edtAlbRAju_Jsonclick ;
   private String edtAlbREnt2_Internalname ;
   private String A5806AlbREnt2 ;
   private String edtAlbREnt2_Jsonclick ;
   private String edtAlbrUsu_Internalname ;
   private String A6178AlbrUsu ;
   private String edtAlbrUsu_Jsonclick ;
   private String edtAlbrHor_Internalname ;
   private String edtAlbrHor_Jsonclick ;
   private String edtAlbrUniC_Internalname ;
   private String edtAlbrUniC_Jsonclick ;
   private String edtAlbrPieC_Internalname ;
   private String edtAlbrPieC_Jsonclick ;
   private String edtAlbrNF_Internalname ;
   private String A6182AlbrNF ;
   private String edtAlbrNF_Jsonclick ;
   private String edtAlbrFeNf_Internalname ;
   private String edtAlbrFeNf_Jsonclick ;
   private String edtAlbrCfop_Internalname ;
   private String A6184AlbrCfop ;
   private String edtAlbrCfop_Jsonclick ;
   private String edtAlbRDisCli_Internalname ;
   private String A3359AlbRDisCli ;
   private String edtAlbRDisCli_Jsonclick ;
   private String edtAlbRTartC_Internalname ;
   private String edtAlbRTartC_Jsonclick ;
   private String edtAlbRTartD_Internalname ;
   private String edtAlbRTartD_Jsonclick ;
   private String edtAlbRImp_Internalname ;
   private String A3360AlbRImp ;
   private String edtAlbRImp_Jsonclick ;
   private String edtAlbRLote_Internalname ;
   private String edtAlbRLote_Jsonclick ;
   private String edtAlbRTelar_Internalname ;
   private String edtAlbRTelar_Jsonclick ;
   private String edtAlbRLu_Internalname ;
   private String edtAlbRLu_Jsonclick ;
   private String edtAlbRMdlCod_Internalname ;
   private String edtAlbRMdlCod_Jsonclick ;
   private String edtAlbRTara_Internalname ;
   private String edtAlbRTara_Jsonclick ;
   private String edtAlbRUniB_Internalname ;
   private String edtAlbRUniB_Jsonclick ;
   private String edtAlbDocPrv_Internalname ;
   private String A6488AlbDocPrv ;
   private String edtAlbDocPrv_Jsonclick ;
   private String edtAlbRUdas_Internalname ;
   private String edtAlbRUdas_Jsonclick ;
   private String edtAlmCod_Internalname ;
   private String edtAlmCod_Jsonclick ;
   private String edtAlmNom_Internalname ;
   private String A4793AlmNom ;
   private String edtAlmNom_Jsonclick ;
   private String edtAlbColor_Internalname ;
   private String A8023AlbColor ;
   private String edtAlbColor_Jsonclick ;
   private String edtAlbOpsT_Internalname ;
   private String A8024AlbOpsT ;
   private String edtAlbOpsT_Jsonclick ;
   private String edtAlbOpsC_Internalname ;
   private String A8025AlbOpsC ;
   private String edtAlbOpsC_Jsonclick ;
   private String edtAlbOC_Internalname ;
   private String A8026AlbOC ;
   private String edtAlbOC_Jsonclick ;
   private String edtAlbHdri_Internalname ;
   private String A8027AlbHdri ;
   private String edtAlbHdri_Jsonclick ;
   private String edtAlbNumB_Internalname ;
   private String A8028AlbNumB ;
   private String edtAlbNumB_Jsonclick ;
   private String edtAlbNumM_Internalname ;
   private String A8029AlbNumM ;
   private String edtAlbNumM_Jsonclick ;
   private String edtAlbAncC_Internalname ;
   private String edtAlbAncC_Jsonclick ;
   private String edtAlbDndC_Internalname ;
   private String edtAlbDndC_Jsonclick ;
   private String edtAlbAncCr_Internalname ;
   private String edtAlbAncCr_Jsonclick ;
   private String edtAlbDndCr_Internalname ;
   private String edtAlbDndCr_Jsonclick ;
   private String edtAlbGalga_Internalname ;
   private String edtAlbGalga_Jsonclick ;
   private String edtAlbMaqTej_Internalname ;
   private String A8035AlbMaqTej ;
   private String edtAlbMaqTej_Jsonclick ;
   private String edtAlbDmt_Internalname ;
   private String edtAlbDmt_Jsonclick ;
   private String edtAlbPdaC_Internalname ;
   private String A9793AlbPdaC ;
   private String edtAlbPdaC_Jsonclick ;
   private String edtAlbOStj_Internalname ;
   private String A9794AlbOStj ;
   private String edtAlbOStj_Jsonclick ;
   private String edtAlbStLot_Internalname ;
   private String edtAlbStLot_Jsonclick ;
   private String edtAlbTurno_Internalname ;
   private String edtAlbTurno_Jsonclick ;
   private String edtCliEst_Internalname ;
   private String A8723CliEst ;
   private String edtCliEst_Jsonclick ;
   private String divLevel1table_Internalname ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode191 ;
   private String edtAlbRLin_Internalname ;
   private String edtAlbRObs_Internalname ;
   private String sStyleString ;
   private String subGridtalbre5_level1item_Internalname ;
   private String AV44Modo ;
   private String AV17UsurCod ;
   private String AV18AlbCum ;
   private String AV84Documento ;
   private String AV91albrcfop ;
   private String AV92albrreo ;
   private String AV93albrnf ;
   private String AV168Pgmname ;
   private String hsh ;
   private String hsh2 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A1300AlbRObs ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z8723CliEst ;
   private String Z841TrnNom ;
   private String Z1212TipEntNom ;
   private String Z971ProceNom ;
   private String Z6264AlbRTartD ;
   private String Z4793AlmNom ;
   private String sMode7 ;
   private String sGXsfl_438_fel_idx="0001" ;
   private String subGridtalbre5_level1item_Class ;
   private String subGridtalbre5_level1item_Linesclass ;
   private String ROClassString ;
   private String edtAlbRLin_Jsonclick ;
   private String edtAlbRObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String iV44Modo ;
   private String i56AlbRUni ;
   private String i45AlbRef ;
   private String i50AlbRLoc ;
   private String i55AlbRReo ;
   private String i6182AlbrNF ;
   private String i3360AlbRImp ;
   private String i4602AlbRMdlCod ;
   private String i6463AlbRLote ;
   private String i6464AlbRTelar ;
   private String i6178AlbrUsu ;
   private String subGridtalbre5_level1item_Header ;
   private String ZV74Compos ;
   private String ZV92albrreo ;
   private String ZV93albrnf ;
   private String ZV91albrcfop ;
   private String ZV84Documento ;
   private String ZV18AlbCum ;
   private String ZZ396EmprCod ;
   private String ZZ45AlbRef ;
   private String ZZ56AlbRUni ;
   private String ZZ46AlbREnt ;
   private String ZZ50AlbRLoc ;
   private String ZZ55AlbRReo ;
   private String ZZ1291AlbRDes ;
   private String ZZ3613AlbRefDsc ;
   private String ZZ5806AlbREnt2 ;
   private String ZZ6178AlbrUsu ;
   private String ZZ6182AlbrNF ;
   private String ZZ6184AlbrCfop ;
   private String ZZ3359AlbRDisCli ;
   private String ZZ3360AlbRImp ;
   private String ZZ6463AlbRLote ;
   private String ZZ6464AlbRTelar ;
   private String ZZ4602AlbRMdlCod ;
   private String ZZ6488AlbDocPrv ;
   private String ZZ8023AlbColor ;
   private String ZZ8024AlbOpsT ;
   private String ZZ8025AlbOpsC ;
   private String ZZ8026AlbOC ;
   private String ZZ8027AlbHdri ;
   private String ZZ8028AlbNumB ;
   private String ZZ8029AlbNumM ;
   private String ZZ8035AlbMaqTej ;
   private String ZZ9793AlbPdaC ;
   private String ZZ9794AlbOStj ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ8723CliEst ;
   private String ZZ6264AlbRTartD ;
   private String ZZ841TrnNom ;
   private String ZZ971ProceNom ;
   private String ZZ1212TipEntNom ;
   private String ZZ4793AlmNom ;
   private String ZZV74Compos ;
   private String ZZV92albrreo ;
   private String ZZV93albrnf ;
   private String ZZV91albrcfop ;
   private String ZZV84Documento ;
   private String ZZV18AlbCum ;
   private String GXv_char7[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private java.util.Date Z6179AlbrHor ;
   private java.util.Date A6179AlbrHor ;
   private java.util.Date i6179AlbrHor ;
   private java.util.Date ZZ6179AlbrHor ;
   private java.util.Date Z49AlbRFen ;
   private java.util.Date Z48AlbRFecUlt ;
   private java.util.Date Z6183AlbrFeNf ;
   private java.util.Date N49AlbRFen ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A48AlbRFecUlt ;
   private java.util.Date A6183AlbrFeNf ;
   private java.util.Date AV85Albrfenf ;
   private java.util.Date AV96albrfen ;
   private java.util.Date i49AlbRFen ;
   private java.util.Date i6183AlbrFeNf ;
   private java.util.Date i48AlbRFecUlt ;
   private java.util.Date ZV96albrfen ;
   private java.util.Date ZZ49AlbRFen ;
   private java.util.Date ZZ48AlbRFecUlt ;
   private java.util.Date ZZ6183AlbrFeNf ;
   private java.util.Date ZZV96albrfen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n44AlbRecCod ;
   private boolean n6264AlbRTartD ;
   private boolean n6263AlbRTartC ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n1211TipEntCod ;
   private boolean n4792AlmCod ;
   private boolean wbErr ;
   private boolean bGXsfl_438_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean n1212TipEntNom ;
   private boolean n971ProceNom ;
   private boolean n4793AlmNom ;
   private boolean Gx_longc ;
   private String AV153Texto_ii ;
   private com.genexus.webpanels.GXWebGrid Gridtalbre5_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtalbre5_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtalbre5_level1itemColumn ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexus.util.GXProperties forbiddenHiddens2 ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbRReo ;
   private HTMLChoice cmbAlbREst ;
   private ICheckbox chkAlbRRep ;
   private IDataStoreProvider pr_default ;
   private int[] T01AE13_A44AlbRecCod ;
   private boolean[] T01AE13_n44AlbRecCod ;
   private int[] T01AE13_A252CliCod ;
   private String[] T01AE13_A45AlbRef ;
   private String[] T01AE13_A56AlbRUni ;
   private byte[] T01AE13_A47AlbREst ;
   private byte[] T01AE13_A317AlbStLot ;
   private String[] T01AE13_A407EmprNom ;
   private boolean[] T01AE13_n407EmprNom ;
   private String[] T01AE13_A279CliNom ;
   private String[] T01AE13_A841TrnNom ;
   private boolean[] T01AE13_n841TrnNom ;
   private String[] T01AE13_A46AlbREnt ;
   private int[] T01AE13_A52AlbRPieEnt ;
   private String[] T01AE13_A50AlbRLoc ;
   private java.util.Date[] T01AE13_A49AlbRFen ;
   private java.math.BigDecimal[] T01AE13_A58AlbRUniEnt ;
   private String[] T01AE13_A55AlbRReo ;
   private int[] T01AE13_A54AlbRPieUti ;
   private int[] T01AE13_A53AlbRPieReb ;
   private java.math.BigDecimal[] T01AE13_A60AlbRUniUti ;
   private java.math.BigDecimal[] T01AE13_A59AlbRUniReb ;
   private java.util.Date[] T01AE13_A48AlbRFecUlt ;
   private String[] T01AE13_A1212TipEntNom ;
   private boolean[] T01AE13_n1212TipEntNom ;
   private short[] T01AE13_A1222AlbNumEti ;
   private String[] T01AE13_A1291AlbRDes ;
   private String[] T01AE13_A971ProceNom ;
   private boolean[] T01AE13_n971ProceNom ;
   private byte[] T01AE13_A1301AlbRUlin ;
   private String[] T01AE13_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01AE13_A4290AlbPmPPza ;
   private short[] T01AE13_A4920AlbRGrm2 ;
   private short[] T01AE13_A4921AlbRAnc ;
   private short[] T01AE13_A4922AlbPml ;
   private java.math.BigDecimal[] T01AE13_A5743AlbRPre ;
   private java.math.BigDecimal[] T01AE13_A5744AlbRAju ;
   private byte[] T01AE13_A5745AlbRRep ;
   private String[] T01AE13_A5806AlbREnt2 ;
   private String[] T01AE13_A6178AlbrUsu ;
   private java.util.Date[] T01AE13_A6179AlbrHor ;
   private java.math.BigDecimal[] T01AE13_A6180AlbrUniC ;
   private int[] T01AE13_A6181AlbrPieC ;
   private String[] T01AE13_A6182AlbrNF ;
   private java.util.Date[] T01AE13_A6183AlbrFeNf ;
   private String[] T01AE13_A6184AlbrCfop ;
   private String[] T01AE13_A3359AlbRDisCli ;
   private String[] T01AE13_A6264AlbRTartD ;
   private boolean[] T01AE13_n6264AlbRTartD ;
   private String[] T01AE13_A3360AlbRImp ;
   private String[] T01AE13_A6463AlbRLote ;
   private String[] T01AE13_A6464AlbRTelar ;
   private java.math.BigDecimal[] T01AE13_A6465AlbRLu ;
   private String[] T01AE13_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] T01AE13_A6470AlbRTara ;
   private java.math.BigDecimal[] T01AE13_A6471AlbRUniB ;
   private String[] T01AE13_A6488AlbDocPrv ;
   private java.math.BigDecimal[] T01AE13_A6523AlbRUdas ;
   private String[] T01AE13_A4793AlmNom ;
   private boolean[] T01AE13_n4793AlmNom ;
   private String[] T01AE13_A8023AlbColor ;
   private String[] T01AE13_A8024AlbOpsT ;
   private String[] T01AE13_A8025AlbOpsC ;
   private String[] T01AE13_A8026AlbOC ;
   private String[] T01AE13_A8027AlbHdri ;
   private String[] T01AE13_A8028AlbNumB ;
   private String[] T01AE13_A8029AlbNumM ;
   private java.math.BigDecimal[] T01AE13_A8030AlbAncC ;
   private short[] T01AE13_A8031AlbDndC ;
   private java.math.BigDecimal[] T01AE13_A8032AlbAncCr ;
   private short[] T01AE13_A8033AlbDndCr ;
   private short[] T01AE13_A8034AlbGalga ;
   private String[] T01AE13_A8035AlbMaqTej ;
   private short[] T01AE13_A8036AlbDmt ;
   private String[] T01AE13_A9793AlbPdaC ;
   private String[] T01AE13_A9794AlbOStj ;
   private byte[] T01AE13_A10358AlbTurno ;
   private String[] T01AE13_A8723CliEst ;
   private String[] T01AE13_A396EmprCod ;
   private short[] T01AE13_A6263AlbRTartC ;
   private boolean[] T01AE13_n6263AlbRTartC ;
   private short[] T01AE13_A840TrnCod ;
   private boolean[] T01AE13_n840TrnCod ;
   private short[] T01AE13_A970ProceCod ;
   private boolean[] T01AE13_n970ProceCod ;
   private short[] T01AE13_A1211TipEntCod ;
   private boolean[] T01AE13_n1211TipEntCod ;
   private byte[] T01AE13_A4792AlmCod ;
   private boolean[] T01AE13_n4792AlmCod ;
   private String[] T01AE6_A407EmprNom ;
   private boolean[] T01AE6_n407EmprNom ;
   private String[] T01AE7_A279CliNom ;
   private String[] T01AE7_A8723CliEst ;
   private String[] T01AE8_A6264AlbRTartD ;
   private boolean[] T01AE8_n6264AlbRTartD ;
   private String[] T01AE9_A841TrnNom ;
   private boolean[] T01AE9_n841TrnNom ;
   private String[] T01AE10_A971ProceNom ;
   private boolean[] T01AE10_n971ProceNom ;
   private String[] T01AE11_A1212TipEntNom ;
   private boolean[] T01AE11_n1212TipEntNom ;
   private String[] T01AE12_A4793AlmNom ;
   private boolean[] T01AE12_n4793AlmNom ;
   private String[] T01AE14_A407EmprNom ;
   private boolean[] T01AE14_n407EmprNom ;
   private String[] T01AE15_A279CliNom ;
   private String[] T01AE15_A8723CliEst ;
   private String[] T01AE16_A6264AlbRTartD ;
   private boolean[] T01AE16_n6264AlbRTartD ;
   private String[] T01AE17_A841TrnNom ;
   private boolean[] T01AE17_n841TrnNom ;
   private String[] T01AE18_A971ProceNom ;
   private boolean[] T01AE18_n971ProceNom ;
   private String[] T01AE19_A1212TipEntNom ;
   private boolean[] T01AE19_n1212TipEntNom ;
   private String[] T01AE20_A4793AlmNom ;
   private boolean[] T01AE20_n4793AlmNom ;
   private String[] T01AE21_A396EmprCod ;
   private int[] T01AE21_A44AlbRecCod ;
   private boolean[] T01AE21_n44AlbRecCod ;
   private int[] T01AE5_A44AlbRecCod ;
   private boolean[] T01AE5_n44AlbRecCod ;
   private int[] T01AE5_A252CliCod ;
   private String[] T01AE5_A45AlbRef ;
   private String[] T01AE5_A56AlbRUni ;
   private byte[] T01AE5_A47AlbREst ;
   private byte[] T01AE5_A317AlbStLot ;
   private String[] T01AE5_A46AlbREnt ;
   private int[] T01AE5_A52AlbRPieEnt ;
   private String[] T01AE5_A50AlbRLoc ;
   private java.util.Date[] T01AE5_A49AlbRFen ;
   private java.math.BigDecimal[] T01AE5_A58AlbRUniEnt ;
   private String[] T01AE5_A55AlbRReo ;
   private int[] T01AE5_A54AlbRPieUti ;
   private int[] T01AE5_A53AlbRPieReb ;
   private java.math.BigDecimal[] T01AE5_A60AlbRUniUti ;
   private java.math.BigDecimal[] T01AE5_A59AlbRUniReb ;
   private java.util.Date[] T01AE5_A48AlbRFecUlt ;
   private short[] T01AE5_A1222AlbNumEti ;
   private String[] T01AE5_A1291AlbRDes ;
   private byte[] T01AE5_A1301AlbRUlin ;
   private String[] T01AE5_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01AE5_A4290AlbPmPPza ;
   private short[] T01AE5_A4920AlbRGrm2 ;
   private short[] T01AE5_A4921AlbRAnc ;
   private short[] T01AE5_A4922AlbPml ;
   private java.math.BigDecimal[] T01AE5_A5743AlbRPre ;
   private java.math.BigDecimal[] T01AE5_A5744AlbRAju ;
   private byte[] T01AE5_A5745AlbRRep ;
   private String[] T01AE5_A5806AlbREnt2 ;
   private String[] T01AE5_A6178AlbrUsu ;
   private java.util.Date[] T01AE5_A6179AlbrHor ;
   private java.math.BigDecimal[] T01AE5_A6180AlbrUniC ;
   private int[] T01AE5_A6181AlbrPieC ;
   private String[] T01AE5_A6182AlbrNF ;
   private java.util.Date[] T01AE5_A6183AlbrFeNf ;
   private String[] T01AE5_A6184AlbrCfop ;
   private String[] T01AE5_A3359AlbRDisCli ;
   private String[] T01AE5_A3360AlbRImp ;
   private String[] T01AE5_A6463AlbRLote ;
   private String[] T01AE5_A6464AlbRTelar ;
   private java.math.BigDecimal[] T01AE5_A6465AlbRLu ;
   private String[] T01AE5_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] T01AE5_A6470AlbRTara ;
   private java.math.BigDecimal[] T01AE5_A6471AlbRUniB ;
   private String[] T01AE5_A6488AlbDocPrv ;
   private java.math.BigDecimal[] T01AE5_A6523AlbRUdas ;
   private String[] T01AE5_A8023AlbColor ;
   private String[] T01AE5_A8024AlbOpsT ;
   private String[] T01AE5_A8025AlbOpsC ;
   private String[] T01AE5_A8026AlbOC ;
   private String[] T01AE5_A8027AlbHdri ;
   private String[] T01AE5_A8028AlbNumB ;
   private String[] T01AE5_A8029AlbNumM ;
   private java.math.BigDecimal[] T01AE5_A8030AlbAncC ;
   private short[] T01AE5_A8031AlbDndC ;
   private java.math.BigDecimal[] T01AE5_A8032AlbAncCr ;
   private short[] T01AE5_A8033AlbDndCr ;
   private short[] T01AE5_A8034AlbGalga ;
   private String[] T01AE5_A8035AlbMaqTej ;
   private short[] T01AE5_A8036AlbDmt ;
   private String[] T01AE5_A9793AlbPdaC ;
   private String[] T01AE5_A9794AlbOStj ;
   private byte[] T01AE5_A10358AlbTurno ;
   private String[] T01AE5_A396EmprCod ;
   private short[] T01AE5_A6263AlbRTartC ;
   private boolean[] T01AE5_n6263AlbRTartC ;
   private short[] T01AE5_A840TrnCod ;
   private boolean[] T01AE5_n840TrnCod ;
   private short[] T01AE5_A970ProceCod ;
   private boolean[] T01AE5_n970ProceCod ;
   private short[] T01AE5_A1211TipEntCod ;
   private boolean[] T01AE5_n1211TipEntCod ;
   private byte[] T01AE5_A4792AlmCod ;
   private boolean[] T01AE5_n4792AlmCod ;
   private String[] T01AE22_A396EmprCod ;
   private int[] T01AE22_A44AlbRecCod ;
   private boolean[] T01AE22_n44AlbRecCod ;
   private int[] T01AE22_A252CliCod ;
   private String[] T01AE23_A396EmprCod ;
   private int[] T01AE23_A44AlbRecCod ;
   private boolean[] T01AE23_n44AlbRecCod ;
   private int[] T01AE23_A252CliCod ;
   private int[] T01AE4_A44AlbRecCod ;
   private boolean[] T01AE4_n44AlbRecCod ;
   private int[] T01AE4_A252CliCod ;
   private String[] T01AE4_A45AlbRef ;
   private String[] T01AE4_A56AlbRUni ;
   private byte[] T01AE4_A47AlbREst ;
   private byte[] T01AE4_A317AlbStLot ;
   private String[] T01AE4_A46AlbREnt ;
   private int[] T01AE4_A52AlbRPieEnt ;
   private String[] T01AE4_A50AlbRLoc ;
   private java.util.Date[] T01AE4_A49AlbRFen ;
   private java.math.BigDecimal[] T01AE4_A58AlbRUniEnt ;
   private String[] T01AE4_A55AlbRReo ;
   private int[] T01AE4_A54AlbRPieUti ;
   private int[] T01AE4_A53AlbRPieReb ;
   private java.math.BigDecimal[] T01AE4_A60AlbRUniUti ;
   private java.math.BigDecimal[] T01AE4_A59AlbRUniReb ;
   private java.util.Date[] T01AE4_A48AlbRFecUlt ;
   private short[] T01AE4_A1222AlbNumEti ;
   private String[] T01AE4_A1291AlbRDes ;
   private byte[] T01AE4_A1301AlbRUlin ;
   private String[] T01AE4_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01AE4_A4290AlbPmPPza ;
   private short[] T01AE4_A4920AlbRGrm2 ;
   private short[] T01AE4_A4921AlbRAnc ;
   private short[] T01AE4_A4922AlbPml ;
   private java.math.BigDecimal[] T01AE4_A5743AlbRPre ;
   private java.math.BigDecimal[] T01AE4_A5744AlbRAju ;
   private byte[] T01AE4_A5745AlbRRep ;
   private String[] T01AE4_A5806AlbREnt2 ;
   private String[] T01AE4_A6178AlbrUsu ;
   private java.util.Date[] T01AE4_A6179AlbrHor ;
   private java.math.BigDecimal[] T01AE4_A6180AlbrUniC ;
   private int[] T01AE4_A6181AlbrPieC ;
   private String[] T01AE4_A6182AlbrNF ;
   private java.util.Date[] T01AE4_A6183AlbrFeNf ;
   private String[] T01AE4_A6184AlbrCfop ;
   private String[] T01AE4_A3359AlbRDisCli ;
   private String[] T01AE4_A3360AlbRImp ;
   private String[] T01AE4_A6463AlbRLote ;
   private String[] T01AE4_A6464AlbRTelar ;
   private java.math.BigDecimal[] T01AE4_A6465AlbRLu ;
   private String[] T01AE4_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] T01AE4_A6470AlbRTara ;
   private java.math.BigDecimal[] T01AE4_A6471AlbRUniB ;
   private String[] T01AE4_A6488AlbDocPrv ;
   private java.math.BigDecimal[] T01AE4_A6523AlbRUdas ;
   private String[] T01AE4_A8023AlbColor ;
   private String[] T01AE4_A8024AlbOpsT ;
   private String[] T01AE4_A8025AlbOpsC ;
   private String[] T01AE4_A8026AlbOC ;
   private String[] T01AE4_A8027AlbHdri ;
   private String[] T01AE4_A8028AlbNumB ;
   private String[] T01AE4_A8029AlbNumM ;
   private java.math.BigDecimal[] T01AE4_A8030AlbAncC ;
   private short[] T01AE4_A8031AlbDndC ;
   private java.math.BigDecimal[] T01AE4_A8032AlbAncCr ;
   private short[] T01AE4_A8033AlbDndCr ;
   private short[] T01AE4_A8034AlbGalga ;
   private String[] T01AE4_A8035AlbMaqTej ;
   private short[] T01AE4_A8036AlbDmt ;
   private String[] T01AE4_A9793AlbPdaC ;
   private String[] T01AE4_A9794AlbOStj ;
   private byte[] T01AE4_A10358AlbTurno ;
   private String[] T01AE4_A396EmprCod ;
   private short[] T01AE4_A6263AlbRTartC ;
   private boolean[] T01AE4_n6263AlbRTartC ;
   private short[] T01AE4_A840TrnCod ;
   private boolean[] T01AE4_n840TrnCod ;
   private short[] T01AE4_A970ProceCod ;
   private boolean[] T01AE4_n970ProceCod ;
   private short[] T01AE4_A1211TipEntCod ;
   private boolean[] T01AE4_n1211TipEntCod ;
   private byte[] T01AE4_A4792AlmCod ;
   private boolean[] T01AE4_n4792AlmCod ;
   private String[] T01AE27_A407EmprNom ;
   private boolean[] T01AE27_n407EmprNom ;
   private String[] T01AE28_A279CliNom ;
   private String[] T01AE28_A8723CliEst ;
   private String[] T01AE29_A841TrnNom ;
   private boolean[] T01AE29_n841TrnNom ;
   private String[] T01AE30_A1212TipEntNom ;
   private boolean[] T01AE30_n1212TipEntNom ;
   private String[] T01AE31_A971ProceNom ;
   private boolean[] T01AE31_n971ProceNom ;
   private String[] T01AE32_A6264AlbRTartD ;
   private boolean[] T01AE32_n6264AlbRTartD ;
   private String[] T01AE33_A4793AlmNom ;
   private boolean[] T01AE33_n4793AlmNom ;
   private String[] T01AE34_A396EmprCod ;
   private int[] T01AE34_A13026PedDGId ;
   private int[] T01AE34_A44AlbRecCod ;
   private boolean[] T01AE34_n44AlbRecCod ;
   private String[] T01AE35_A396EmprCod ;
   private int[] T01AE35_A11669DevCruId ;
   private int[] T01AE35_A44AlbRecCod ;
   private boolean[] T01AE35_n44AlbRecCod ;
   private String[] T01AE36_A396EmprCod ;
   private int[] T01AE36_A44AlbRecCod ;
   private boolean[] T01AE36_n44AlbRecCod ;
   private String[] T01AE36_A9743Emp_CUb ;
   private short[] T01AE36_A5860Emp_Anp ;
   private String[] T01AE37_A396EmprCod ;
   private int[] T01AE37_A44AlbRecCod ;
   private boolean[] T01AE37_n44AlbRecCod ;
   private String[] T01AE37_A7130MatC_Pz ;
   private String[] T01AE38_A396EmprCod ;
   private int[] T01AE38_A44AlbRecCod ;
   private boolean[] T01AE38_n44AlbRecCod ;
   private String[] T01AE38_A7132MatC_Talla ;
   private String[] T01AE39_A396EmprCod ;
   private int[] T01AE39_A44AlbRecCod ;
   private boolean[] T01AE39_n44AlbRecCod ;
   private short[] T01AE39_A7115MatC_Lin ;
   private String[] T01AE40_A396EmprCod ;
   private long[] T01AE40_A30AlbProCod ;
   private int[] T01AE40_A129BarCod ;
   private byte[] T01AE40_A132BarCodReo ;
   private String[] T01AE40_A130BarCodPar ;
   private short[] T01AE40_A6622AlbHdRLn ;
   private String[] T01AE41_A396EmprCod ;
   private int[] T01AE41_A6235DevEmpCod ;
   private byte[] T01AE41_A6243DevNumLin ;
   private String[] T01AE42_A396EmprCod ;
   private int[] T01AE42_A44AlbRecCod ;
   private boolean[] T01AE42_n44AlbRecCod ;
   private short[] T01AE42_A4596AlbRDefCod ;
   private String[] T01AE43_A396EmprCod ;
   private int[] T01AE43_A44AlbRecCod ;
   private boolean[] T01AE43_n44AlbRecCod ;
   private String[] T01AE43_A2159AlbRecPie ;
   private String[] T01AE44_A396EmprCod ;
   private int[] T01AE44_A44AlbRecCod ;
   private boolean[] T01AE44_n44AlbRecCod ;
   private short[] T01AE44_A2165HisEmpLin ;
   private String[] T01AE45_A396EmprCod ;
   private int[] T01AE45_A361DisCod ;
   private int[] T01AE45_A44AlbRecCod ;
   private boolean[] T01AE45_n44AlbRecCod ;
   private String[] T01AE46_A396EmprCod ;
   private int[] T01AE46_A323DevGenCod ;
   private String[] T01AE47_A396EmprCod ;
   private int[] T01AE47_A129BarCod ;
   private byte[] T01AE47_A132BarCodReo ;
   private String[] T01AE47_A130BarCodPar ;
   private String[] T01AE47_A200BarPieCod ;
   private String[] T01AE49_A396EmprCod ;
   private int[] T01AE49_A44AlbRecCod ;
   private boolean[] T01AE49_n44AlbRecCod ;
   private int[] T01AE50_A44AlbRecCod ;
   private boolean[] T01AE50_n44AlbRecCod ;
   private byte[] T01AE50_A1299AlbRLin ;
   private String[] T01AE50_A1300AlbRObs ;
   private String[] T01AE50_A396EmprCod ;
   private String[] T01AE51_A396EmprCod ;
   private int[] T01AE51_A44AlbRecCod ;
   private boolean[] T01AE51_n44AlbRecCod ;
   private byte[] T01AE51_A1299AlbRLin ;
   private int[] T01AE3_A44AlbRecCod ;
   private boolean[] T01AE3_n44AlbRecCod ;
   private byte[] T01AE3_A1299AlbRLin ;
   private String[] T01AE3_A1300AlbRObs ;
   private String[] T01AE3_A396EmprCod ;
   private int[] T01AE2_A44AlbRecCod ;
   private boolean[] T01AE2_n44AlbRecCod ;
   private byte[] T01AE2_A1299AlbRLin ;
   private String[] T01AE2_A1300AlbRObs ;
   private String[] T01AE2_A396EmprCod ;
   private String[] T01AE55_A396EmprCod ;
   private int[] T01AE55_A44AlbRecCod ;
   private boolean[] T01AE55_n44AlbRecCod ;
   private byte[] T01AE55_A1299AlbRLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class talbre5__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbre5__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbre5__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbre5__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbre5__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01AE2", "SELECT AlbRecCod, AlbRLin, AlbRObs, EmprCod FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRLin = ?  FOR UPDATE OF AlbRObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE3", "SELECT AlbRecCod, AlbRLin, AlbRObs, EmprCod FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE4", "SELECT AlbRecCod, CliCod, AlbRef, AlbRUni, AlbREst, AlbStLot, AlbREnt, AlbRPieEnt, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRReo, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, AlbNumEti, AlbRDes, AlbRUlin, AlbRefDsc, AlbPmPPza, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRDisCli, AlbRImp, AlbRLote, AlbRTelar, AlbRLu, AlbRMdlCod, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, AlbPdaC, AlbOStj, AlbTurno, EmprCod, AlbRTartC, TrnCod, ProceCod, TipEntCod, AlmCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF CliCod, AlbRef, AlbRUni, AlbREst, AlbStLot, AlbREnt, AlbRPieEnt, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRReo, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, AlbNumEti, AlbRDes, AlbRUlin, AlbRefDsc, AlbPmPPza, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRDisCli, AlbRImp, AlbRLote, AlbRTelar, AlbRLu, AlbRMdlCod, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, AlbPdaC, AlbOStj, AlbTurno, AlbRTartC, TrnCod, ProceCod, TipEntCod, AlmCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE5", "SELECT AlbRecCod, CliCod, AlbRef, AlbRUni, AlbREst, AlbStLot, AlbREnt, AlbRPieEnt, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRReo, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, AlbNumEti, AlbRDes, AlbRUlin, AlbRefDsc, AlbPmPPza, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRDisCli, AlbRImp, AlbRLote, AlbRTelar, AlbRLu, AlbRMdlCod, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, AlbPdaC, AlbOStj, AlbTurno, EmprCod, AlbRTartC, TrnCod, ProceCod, TipEntCod, AlmCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE7", "SELECT CliNom, CliEst FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE8", "SELECT TipArtDsc AS AlbRTartD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE9", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE10", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE11", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE12", "SELECT AlmNom FROM TXPAlmace WHERE EmprCod = ? AND AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE13", "SELECT /*+ FIRST_ROWS(100) */ TM1.AlbRecCod, TM1.CliCod, TM1.AlbRef, TM1.AlbRUni, TM1.AlbREst, TM1.AlbStLot, T2.EmprNom, T3.CliNom, T4.TrnNom, TM1.AlbREnt, TM1.AlbRPieEnt, TM1.AlbRLoc, TM1.AlbRFen, TM1.AlbRUniEnt, TM1.AlbRReo, TM1.AlbRPieUti, TM1.AlbRPieReb, TM1.AlbRUniUti, TM1.AlbRUniReb, TM1.AlbRFecUlt, T5.TipEntNom, TM1.AlbNumEti, TM1.AlbRDes, T6.ProceNom, TM1.AlbRUlin, TM1.AlbRefDsc, TM1.AlbPmPPza, TM1.AlbRGrm2, TM1.AlbRAnc, TM1.AlbPml, TM1.AlbRPre, TM1.AlbRAju, TM1.AlbRRep, TM1.AlbREnt2, TM1.AlbrUsu, TM1.AlbrHor, TM1.AlbrUniC, TM1.AlbrPieC, TM1.AlbrNF, TM1.AlbrFeNf, TM1.AlbrCfop, TM1.AlbRDisCli, T7.TipArtDsc AS AlbRTartD, TM1.AlbRImp, TM1.AlbRLote, TM1.AlbRTelar, TM1.AlbRLu, TM1.AlbRMdlCod, TM1.AlbRTara, TM1.AlbRUniB, TM1.AlbDocPrv, TM1.AlbRUdas, T8.AlmNom, TM1.AlbColor, TM1.AlbOpsT, TM1.AlbOpsC, TM1.AlbOC, TM1.AlbHdri, TM1.AlbNumB, TM1.AlbNumM, TM1.AlbAncC, TM1.AlbDndC, TM1.AlbAncCr, TM1.AlbDndCr, TM1.AlbGalga, TM1.AlbMaqTej, TM1.AlbDmt, TM1.AlbPdaC, TM1.AlbOStj, TM1.AlbTurno, T3.CliEst, TM1.EmprCod, TM1.AlbRTartC AS AlbRTartC, TM1.TrnCod, TM1.ProceCod, TM1.TipEntCod, TM1.AlmCod FROM (((((((TXPALBREC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = TM1.EmprCod AND T4.TrnCod = TM1.TrnCod) LEFT JOIN TXPENTRAD T5 ON T5.EmprCod = TM1.EmprCod AND T5.TipEntCod = TM1.TipEntCod) LEFT JOIN TXPPROCED T6 ON T6.EmprCod = TM1.EmprCod AND T6.ProceCod = TM1.ProceCod) LEFT JOIN TXPTIPART T7 ON T7.EmprCod = TM1.EmprCod AND T7.TipArtCod = TM1.AlbRTartC) LEFT JOIN TXPAlmace T8 ON T8.EmprCod = TM1.EmprCod AND T8.AlmCod = TM1.AlmCod) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? and TM1.CliCod = ? ORDER BY TM1.EmprCod, TM1.AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE14", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE15", "SELECT CliNom, CliEst FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE16", "SELECT TipArtDsc AS AlbRTartD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE17", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE18", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE19", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE20", "SELECT AlmNom FROM TXPAlmace WHERE EmprCod = ? AND AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE21", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE22", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, CliCod FROM TXPALBREC WHERE ( EmprCod > ?) and AlbRecCod = ? and CliCod = ? ORDER BY EmprCod, AlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AE23", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, CliCod FROM TXPALBREC WHERE ( EmprCod < ?) and AlbRecCod = ? and CliCod = ? ORDER BY EmprCod DESC, AlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01AE24", "INSERT INTO TXPALBREC(AlbRecCod, CliCod, AlbRef, AlbRUni, AlbREst, AlbStLot, AlbREnt, AlbRPieEnt, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRReo, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, AlbNumEti, AlbRDes, AlbRUlin, AlbRefDsc, AlbPmPPza, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRDisCli, AlbRImp, AlbRLote, AlbRTelar, AlbRLu, AlbRMdlCod, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, AlbPdaC, AlbOStj, AlbTurno, EmprCod, AlbRTartC, TrnCod, ProceCod, TipEntCod, AlmCod, HisEmpULin, AlbRTam, AlbRUniLot, AlbRPieLot, AlbRHEn, ClasCod, MatC_ULin, AlbRecSec, Bod_UltPz, Emp_Item1, AlbUltP, Cod_mta, AlbOEKOTEX, AlbRPh, AlbRRLong, AlbRRTrans, AlbRLot2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ')", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T01AE25", "UPDATE TXPALBREC SET CliCod=?, AlbRef=?, AlbRUni=?, AlbREst=?, AlbStLot=?, AlbREnt=?, AlbRPieEnt=?, AlbRLoc=?, AlbRFen=?, AlbRUniEnt=?, AlbRReo=?, AlbRPieUti=?, AlbRPieReb=?, AlbRUniUti=?, AlbRUniReb=?, AlbRFecUlt=?, AlbNumEti=?, AlbRDes=?, AlbRUlin=?, AlbRefDsc=?, AlbPmPPza=?, AlbRGrm2=?, AlbRAnc=?, AlbPml=?, AlbRPre=?, AlbRAju=?, AlbRRep=?, AlbREnt2=?, AlbrUsu=?, AlbrHor=?, AlbrUniC=?, AlbrPieC=?, AlbrNF=?, AlbrFeNf=?, AlbrCfop=?, AlbRDisCli=?, AlbRImp=?, AlbRLote=?, AlbRTelar=?, AlbRLu=?, AlbRMdlCod=?, AlbRTara=?, AlbRUniB=?, AlbDocPrv=?, AlbRUdas=?, AlbColor=?, AlbOpsT=?, AlbOpsC=?, AlbOC=?, AlbHdri=?, AlbNumB=?, AlbNumM=?, AlbAncC=?, AlbDndC=?, AlbAncCr=?, AlbDndCr=?, AlbGalga=?, AlbMaqTej=?, AlbDmt=?, AlbPdaC=?, AlbOStj=?, AlbTurno=?, AlbRTartC=?, TrnCod=?, ProceCod=?, TipEntCod=?, AlmCod=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T01AE26", "DELETE FROM TXPALBREC  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T01AE27", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE28", "SELECT CliNom, CliEst FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE29", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE30", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE31", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE32", "SELECT TipArtDsc AS AlbRTartD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE33", "SELECT AlmNom FROM TXPAlmace WHERE EmprCod = ? AND AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE34", "SELECT * FROM (SELECT EmprCod, PedDGId, AlbRecCod FROM TXPPEDDG3 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AE35", "SELECT * FROM (SELECT EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AE36", "SELECT * FROM (SELECT EmprCod, AlbRecCod, Emp_CUb, Emp_Anp FROM TXPUBIIN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AE37", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Pz FROM TXPREPPZS WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AE38", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Talla FROM TXPREPTAL WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AE39", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Lin FROM TXPREPMAT WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AE40", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AE41", "SELECT * FROM (SELECT EmprCod, DevEmpCod, DevNumLin FROM TXPDEVEM1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AE42", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRDefCod FROM TXPALBRDF WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AE43", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AE44", "SELECT * FROM (SELECT EmprCod, AlbRecCod, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AE45", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AE46", "SELECT * FROM (SELECT EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01AE47", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01AE48", "UPDATE TXPALBREC SET AlbRUlin=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T01AE49", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE AlbRecCod = ? and CliCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE50", "SELECT AlbRecCod, AlbRLin, AlbRObs, EmprCod FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? and AlbRLin = ? ORDER BY EmprCod, AlbRecCod, AlbRLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01AE51", "SELECT EmprCod, AlbRecCod, AlbRLin FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01AE52", "INSERT INTO TXPALBROB(AlbRecCod, AlbRLin, AlbRObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPALBROB")
         ,new UpdateCursor("T01AE53", "UPDATE TXPALBROB SET AlbRObs=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRLin = ?", GX_NOMASK, "TXPALBROB")
         ,new UpdateCursor("T01AE54", "DELETE FROM TXPALBROB  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRLin = ?", GX_NOMASK, "TXPALBROB")
         ,new ForEachCursor("T01AE55", "SELECT EmprCod, AlbRecCod, AlbRLin FROM TXPALBROB WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 2);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(17);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 20);
               ((byte[]) buf[19])[0] = rslt.getByte(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 26);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,3);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((short[]) buf[23])[0] = rslt.getShort(24);
               ((short[]) buf[24])[0] = rslt.getShort(25);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(26,5);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(27,2);
               ((byte[]) buf[27])[0] = rslt.getByte(28);
               ((String[]) buf[28])[0] = rslt.getString(29, 20);
               ((String[]) buf[29])[0] = rslt.getString(30, 10);
               ((java.util.Date[]) buf[30])[0] = GXutil.resetDate(rslt.getGXDateTime(31));
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(32,2);
               ((int[]) buf[32])[0] = rslt.getInt(33);
               ((String[]) buf[33])[0] = rslt.getString(34, 1);
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDate(35);
               ((String[]) buf[35])[0] = rslt.getString(36, 5);
               ((String[]) buf[36])[0] = rslt.getString(37, 20);
               ((String[]) buf[37])[0] = rslt.getString(38, 1);
               ((String[]) buf[38])[0] = rslt.getString(39, 20);
               ((String[]) buf[39])[0] = rslt.getString(40, 20);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(41,2);
               ((String[]) buf[41])[0] = rslt.getString(42, 13);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(43,2);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(44,2);
               ((String[]) buf[44])[0] = rslt.getString(45, 10);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(46,2);
               ((String[]) buf[46])[0] = rslt.getString(47, 40);
               ((String[]) buf[47])[0] = rslt.getString(48, 30);
               ((String[]) buf[48])[0] = rslt.getString(49, 30);
               ((String[]) buf[49])[0] = rslt.getString(50, 12);
               ((String[]) buf[50])[0] = rslt.getString(51, 20);
               ((String[]) buf[51])[0] = rslt.getString(52, 20);
               ((String[]) buf[52])[0] = rslt.getString(53, 10);
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(54,2);
               ((short[]) buf[54])[0] = rslt.getShort(55);
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(56,2);
               ((short[]) buf[56])[0] = rslt.getShort(57);
               ((short[]) buf[57])[0] = rslt.getShort(58);
               ((String[]) buf[58])[0] = rslt.getString(59, 12);
               ((short[]) buf[59])[0] = rslt.getShort(60);
               ((String[]) buf[60])[0] = rslt.getString(61, 20);
               ((String[]) buf[61])[0] = rslt.getString(62, 20);
               ((byte[]) buf[62])[0] = rslt.getByte(63);
               ((String[]) buf[63])[0] = rslt.getString(64, 3);
               ((short[]) buf[64])[0] = rslt.getShort(65);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((short[]) buf[66])[0] = rslt.getShort(66);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((short[]) buf[68])[0] = rslt.getShort(67);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(68);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((byte[]) buf[72])[0] = rslt.getByte(69);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 2);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(17);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 20);
               ((byte[]) buf[19])[0] = rslt.getByte(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 26);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,3);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((short[]) buf[23])[0] = rslt.getShort(24);
               ((short[]) buf[24])[0] = rslt.getShort(25);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(26,5);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(27,2);
               ((byte[]) buf[27])[0] = rslt.getByte(28);
               ((String[]) buf[28])[0] = rslt.getString(29, 20);
               ((String[]) buf[29])[0] = rslt.getString(30, 10);
               ((java.util.Date[]) buf[30])[0] = GXutil.resetDate(rslt.getGXDateTime(31));
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(32,2);
               ((int[]) buf[32])[0] = rslt.getInt(33);
               ((String[]) buf[33])[0] = rslt.getString(34, 1);
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDate(35);
               ((String[]) buf[35])[0] = rslt.getString(36, 5);
               ((String[]) buf[36])[0] = rslt.getString(37, 20);
               ((String[]) buf[37])[0] = rslt.getString(38, 1);
               ((String[]) buf[38])[0] = rslt.getString(39, 20);
               ((String[]) buf[39])[0] = rslt.getString(40, 20);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(41,2);
               ((String[]) buf[41])[0] = rslt.getString(42, 13);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(43,2);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(44,2);
               ((String[]) buf[44])[0] = rslt.getString(45, 10);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(46,2);
               ((String[]) buf[46])[0] = rslt.getString(47, 40);
               ((String[]) buf[47])[0] = rslt.getString(48, 30);
               ((String[]) buf[48])[0] = rslt.getString(49, 30);
               ((String[]) buf[49])[0] = rslt.getString(50, 12);
               ((String[]) buf[50])[0] = rslt.getString(51, 20);
               ((String[]) buf[51])[0] = rslt.getString(52, 20);
               ((String[]) buf[52])[0] = rslt.getString(53, 10);
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(54,2);
               ((short[]) buf[54])[0] = rslt.getShort(55);
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(56,2);
               ((short[]) buf[56])[0] = rslt.getShort(57);
               ((short[]) buf[57])[0] = rslt.getShort(58);
               ((String[]) buf[58])[0] = rslt.getString(59, 12);
               ((short[]) buf[59])[0] = rslt.getShort(60);
               ((String[]) buf[60])[0] = rslt.getString(61, 20);
               ((String[]) buf[61])[0] = rslt.getString(62, 20);
               ((byte[]) buf[62])[0] = rslt.getByte(63);
               ((String[]) buf[63])[0] = rslt.getString(64, 3);
               ((short[]) buf[64])[0] = rslt.getShort(65);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((short[]) buf[66])[0] = rslt.getShort(66);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((short[]) buf[68])[0] = rslt.getShort(67);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(68);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((byte[]) buf[72])[0] = rslt.getByte(69);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 10);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(13);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[16])[0] = rslt.getString(15, 2);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(20);
               ((String[]) buf[22])[0] = rslt.getString(21, 25);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(22);
               ((String[]) buf[25])[0] = rslt.getString(23, 20);
               ((String[]) buf[26])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((byte[]) buf[28])[0] = rslt.getByte(25);
               ((String[]) buf[29])[0] = rslt.getString(26, 26);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(27,3);
               ((short[]) buf[31])[0] = rslt.getShort(28);
               ((short[]) buf[32])[0] = rslt.getShort(29);
               ((short[]) buf[33])[0] = rslt.getShort(30);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(31,5);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(32,2);
               ((byte[]) buf[36])[0] = rslt.getByte(33);
               ((String[]) buf[37])[0] = rslt.getString(34, 20);
               ((String[]) buf[38])[0] = rslt.getString(35, 10);
               ((java.util.Date[]) buf[39])[0] = GXutil.resetDate(rslt.getGXDateTime(36));
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(37,2);
               ((int[]) buf[41])[0] = rslt.getInt(38);
               ((String[]) buf[42])[0] = rslt.getString(39, 1);
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDate(40);
               ((String[]) buf[44])[0] = rslt.getString(41, 5);
               ((String[]) buf[45])[0] = rslt.getString(42, 20);
               ((String[]) buf[46])[0] = rslt.getString(43, 30);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(44, 1);
               ((String[]) buf[49])[0] = rslt.getString(45, 20);
               ((String[]) buf[50])[0] = rslt.getString(46, 20);
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(47,2);
               ((String[]) buf[52])[0] = rslt.getString(48, 13);
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(49,2);
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(50,2);
               ((String[]) buf[55])[0] = rslt.getString(51, 10);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(52,2);
               ((String[]) buf[57])[0] = rslt.getString(53, 30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(54, 40);
               ((String[]) buf[60])[0] = rslt.getString(55, 30);
               ((String[]) buf[61])[0] = rslt.getString(56, 30);
               ((String[]) buf[62])[0] = rslt.getString(57, 12);
               ((String[]) buf[63])[0] = rslt.getString(58, 20);
               ((String[]) buf[64])[0] = rslt.getString(59, 20);
               ((String[]) buf[65])[0] = rslt.getString(60, 10);
               ((java.math.BigDecimal[]) buf[66])[0] = rslt.getBigDecimal(61,2);
               ((short[]) buf[67])[0] = rslt.getShort(62);
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(63,2);
               ((short[]) buf[69])[0] = rslt.getShort(64);
               ((short[]) buf[70])[0] = rslt.getShort(65);
               ((String[]) buf[71])[0] = rslt.getString(66, 12);
               ((short[]) buf[72])[0] = rslt.getShort(67);
               ((String[]) buf[73])[0] = rslt.getString(68, 20);
               ((String[]) buf[74])[0] = rslt.getString(69, 20);
               ((byte[]) buf[75])[0] = rslt.getByte(70);
               ((String[]) buf[76])[0] = rslt.getString(71, 1);
               ((String[]) buf[77])[0] = rslt.getString(72, 3);
               ((short[]) buf[78])[0] = rslt.getShort(73);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((short[]) buf[80])[0] = rslt.getShort(74);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((short[]) buf[82])[0] = rslt.getShort(75);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((short[]) buf[84])[0] = rslt.getShort(76);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((byte[]) buf[86])[0] = rslt.getByte(77);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 48 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 18 :
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
            case 19 :
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 1);
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 8);
               stmt.setInt(8, ((Number) parms[8]).intValue());
               stmt.setString(9, (String)parms[9], 10);
               stmt.setDate(10, (java.util.Date)parms[10]);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 2);
               stmt.setString(12, (String)parms[12], 2);
               stmt.setInt(13, ((Number) parms[13]).intValue());
               stmt.setInt(14, ((Number) parms[14]).intValue());
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[15], 2);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[16], 2);
               stmt.setDate(17, (java.util.Date)parms[17]);
               stmt.setShort(18, ((Number) parms[18]).shortValue());
               stmt.setString(19, (String)parms[19], 20);
               stmt.setByte(20, ((Number) parms[20]).byteValue());
               stmt.setString(21, (String)parms[21], 26);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[22], 3);
               stmt.setShort(23, ((Number) parms[23]).shortValue());
               stmt.setShort(24, ((Number) parms[24]).shortValue());
               stmt.setShort(25, ((Number) parms[25]).shortValue());
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[26], 5);
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[27], 2);
               stmt.setByte(28, ((Number) parms[28]).byteValue());
               stmt.setString(29, (String)parms[29], 20);
               stmt.setString(30, (String)parms[30], 10);
               stmt.setDateTime(31, (java.util.Date)parms[31], true);
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[32], 2);
               stmt.setInt(33, ((Number) parms[33]).intValue());
               stmt.setString(34, (String)parms[34], 1);
               stmt.setDate(35, (java.util.Date)parms[35]);
               stmt.setString(36, (String)parms[36], 5);
               stmt.setString(37, (String)parms[37], 20);
               stmt.setString(38, (String)parms[38], 1);
               stmt.setString(39, (String)parms[39], 20);
               stmt.setString(40, (String)parms[40], 20);
               stmt.setBigDecimal(41, (java.math.BigDecimal)parms[41], 2);
               stmt.setString(42, (String)parms[42], 13);
               stmt.setBigDecimal(43, (java.math.BigDecimal)parms[43], 2);
               stmt.setBigDecimal(44, (java.math.BigDecimal)parms[44], 2);
               stmt.setString(45, (String)parms[45], 10);
               stmt.setBigDecimal(46, (java.math.BigDecimal)parms[46], 2);
               stmt.setString(47, (String)parms[47], 40);
               stmt.setString(48, (String)parms[48], 30);
               stmt.setString(49, (String)parms[49], 30);
               stmt.setString(50, (String)parms[50], 12);
               stmt.setString(51, (String)parms[51], 20);
               stmt.setString(52, (String)parms[52], 20);
               stmt.setString(53, (String)parms[53], 10);
               stmt.setBigDecimal(54, (java.math.BigDecimal)parms[54], 2);
               stmt.setShort(55, ((Number) parms[55]).shortValue());
               stmt.setBigDecimal(56, (java.math.BigDecimal)parms[56], 2);
               stmt.setShort(57, ((Number) parms[57]).shortValue());
               stmt.setShort(58, ((Number) parms[58]).shortValue());
               stmt.setString(59, (String)parms[59], 12);
               stmt.setShort(60, ((Number) parms[60]).shortValue());
               stmt.setString(61, (String)parms[61], 20);
               stmt.setString(62, (String)parms[62], 20);
               stmt.setByte(63, ((Number) parms[63]).byteValue());
               stmt.setString(64, (String)parms[64], 3);
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(65, ((Number) parms[66]).shortValue());
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(66, ((Number) parms[68]).shortValue());
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(67, ((Number) parms[70]).shortValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(68, ((Number) parms[72]).shortValue());
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(69, ((Number) parms[74]).byteValue());
               }
               return;
            case 23 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 10);
               stmt.setDate(9, (java.util.Date)parms[8]);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setString(11, (String)parms[10], 2);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 2);
               stmt.setDate(16, (java.util.Date)parms[15]);
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setString(18, (String)parms[17], 20);
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setString(20, (String)parms[19], 26);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 3);
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setShort(24, ((Number) parms[23]).shortValue());
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[24], 5);
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[25], 2);
               stmt.setByte(27, ((Number) parms[26]).byteValue());
               stmt.setString(28, (String)parms[27], 20);
               stmt.setString(29, (String)parms[28], 10);
               stmt.setDateTime(30, (java.util.Date)parms[29], true);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[30], 2);
               stmt.setInt(32, ((Number) parms[31]).intValue());
               stmt.setString(33, (String)parms[32], 1);
               stmt.setDate(34, (java.util.Date)parms[33]);
               stmt.setString(35, (String)parms[34], 5);
               stmt.setString(36, (String)parms[35], 20);
               stmt.setString(37, (String)parms[36], 1);
               stmt.setString(38, (String)parms[37], 20);
               stmt.setString(39, (String)parms[38], 20);
               stmt.setBigDecimal(40, (java.math.BigDecimal)parms[39], 2);
               stmt.setString(41, (String)parms[40], 13);
               stmt.setBigDecimal(42, (java.math.BigDecimal)parms[41], 2);
               stmt.setBigDecimal(43, (java.math.BigDecimal)parms[42], 2);
               stmt.setString(44, (String)parms[43], 10);
               stmt.setBigDecimal(45, (java.math.BigDecimal)parms[44], 2);
               stmt.setString(46, (String)parms[45], 40);
               stmt.setString(47, (String)parms[46], 30);
               stmt.setString(48, (String)parms[47], 30);
               stmt.setString(49, (String)parms[48], 12);
               stmt.setString(50, (String)parms[49], 20);
               stmt.setString(51, (String)parms[50], 20);
               stmt.setString(52, (String)parms[51], 10);
               stmt.setBigDecimal(53, (java.math.BigDecimal)parms[52], 2);
               stmt.setShort(54, ((Number) parms[53]).shortValue());
               stmt.setBigDecimal(55, (java.math.BigDecimal)parms[54], 2);
               stmt.setShort(56, ((Number) parms[55]).shortValue());
               stmt.setShort(57, ((Number) parms[56]).shortValue());
               stmt.setString(58, (String)parms[57], 12);
               stmt.setShort(59, ((Number) parms[58]).shortValue());
               stmt.setString(60, (String)parms[59], 20);
               stmt.setString(61, (String)parms[60], 20);
               stmt.setByte(62, ((Number) parms[61]).byteValue());
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(63, ((Number) parms[63]).shortValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(64, ((Number) parms[65]).shortValue());
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(65, ((Number) parms[67]).shortValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(66, ((Number) parms[69]).shortValue());
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(67, ((Number) parms[71]).byteValue());
               }
               stmt.setString(68, (String)parms[72], 3);
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(69, ((Number) parms[74]).intValue());
               }
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
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
            case 44 :
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
               return;
            case 46 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 47 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 50 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setByte(2, ((Number) parms[2]).byteValue());
               stmt.setString(3, (String)parms[3], 60);
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setByte(4, ((Number) parms[4]).byteValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
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
               return;
      }
   }

}

