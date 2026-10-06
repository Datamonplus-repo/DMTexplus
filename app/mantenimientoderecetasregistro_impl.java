package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mantenimientoderecetasregistro_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action50") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A872RecPrdNum = httpContext.GetPar( "RecPrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         A704PrdExiAlm = CommonUtil.decimalVal( httpContext.GetPar( "PrdExiAlm"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A685PrdCanRes = CommonUtil.decimalVal( httpContext.GetPar( "PrdCanRes"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         A686PrdCant = CommonUtil.decimalVal( httpContext.GetPar( "PrdCant"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
         A705PrdExiCC = CommonUtil.decimalVal( httpContext.GetPar( "PrdExiCC"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         AV60Cantold = CommonUtil.decimalVal( httpContext.GetPar( "Cantold"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Cantold", GXutil.ltrimstr( AV60Cantold, 11, 3));
         AV35AlmCC = (short)(GXutil.lval( httpContext.GetPar( "AlmCC"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35AlmCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35AlmCC), 4, 0));
         AV57msgErr = httpContext.GetPar( "msgErr") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57msgErr", AV57msgErr);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A431FacCon = CommonUtil.decimalVal( httpContext.GetPar( "FacCon"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A431FacCon", GXutil.ltrimstr( A431FacCon, 11, 5));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_50_1RH410( A396EmprCod, A872RecPrdNum, A704PrdExiAlm, A685PrdCanRes, A686PrdCant, A705PrdExiCC, AV60Cantold, AV35AlmCC, AV57msgErr, A719PrdNum, A431FacCon) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action51") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A872RecPrdNum = httpContext.GetPar( "RecPrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         AV60Cantold = CommonUtil.decimalVal( httpContext.GetPar( "Cantold"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Cantold", GXutil.ltrimstr( AV60Cantold, 11, 3));
         A686PrdCant = CommonUtil.decimalVal( httpContext.GetPar( "PrdCant"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
         AV51Totaldekilos = CommonUtil.decimalVal( httpContext.GetPar( "Totaldekilos"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51Totaldekilos", GXutil.ltrimstr( AV51Totaldekilos, 10, 2));
         AV58VolumenReceta = (int)(GXutil.lval( httpContext.GetPar( "VolumenReceta"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58VolumenReceta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58VolumenReceta), 5, 0));
         AV28Valcos = (short)(GXutil.lval( httpContext.GetPar( "Valcos"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Valcos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Valcos), 4, 0));
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         n490ForPrdUMe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         A431FacCon = CommonUtil.decimalVal( httpContext.GetPar( "FacCon"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A431FacCon", GXutil.ltrimstr( A431FacCon, 11, 5));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_51_1RH410( A396EmprCod, A872RecPrdNum, AV60Cantold, A686PrdCant, AV51Totaldekilos, AV58VolumenReceta, AV28Valcos, A490ForPrdUMe, A431FacCon) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action62") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_62_1RH410( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action63") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_63_1RH410( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action64") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_64_1RH410( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action65") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_65_1RH410( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"FORPRDUME") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13746ForPrdCDsc = httpContext.GetPar( "ForPrdCDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaforprdume1RH0( A396EmprCod, A13746ForPrdCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"FORPRDUME") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13746ForPrdCDsc = httpContext.GetPar( "ForPrdCDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaforprdume1RH0( A396EmprCod, A13746ForPrdCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"FORPRDUME") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h490ForPrdUMe = httpContext.GetPar( "h490ForPrdUMe") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaforprdume1RH410( A396EmprCod, h490ForPrdUMe) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"RECPRDDSCF") == 0 )
      {
         A874RecPrdFind = httpContext.GetPar( "RecPrdFind") ;
         n874RecPrdFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", A874RecPrdFind);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A872RecPrdNum = httpContext.GetPar( "RecPrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asarecprddscf1RH410( A874RecPrdFind, A396EmprCod, A872RecPrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_68") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         n490ForPrdUMe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_68( A396EmprCod, A490ForPrdUMe) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_70") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A872RecPrdNum = httpContext.GetPar( "RecPrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_70( A396EmprCod, A872RecPrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_69") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         A1273RecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "RecLinPro"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_69( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, A1273RecLinPro) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_67") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_67( A396EmprCod, A719PrdNum) ;
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
            AV13EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13EmprCod", AV13EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13EmprCod, "@!"))));
            AV12BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12BarCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12BarCod), "ZZZZZZZ9")));
            AV11BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodReo", GXutil.str( AV11BarCodReo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11BarCodReo), "9")));
            AV10BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10BarCodPar, ""))));
            AV9RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9RecLinMaq), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9RecLinMaq), "ZZZ9")));
            AV8RecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "RecLinPro"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8RecLinPro), 2, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINPRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8RecLinPro), "Z9")));
            AV7RecLin = (short)(GXutil.lval( httpContext.GetPar( "RecLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7RecLin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7RecLin), "ZZZ9")));
            AV14TotKgs = CommonUtil.decimalVal( httpContext.GetPar( "TotKgs"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14TotKgs", GXutil.ltrimstr( AV14TotKgs, 10, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGS", getSecureSignedToken( "", localUtil.format( AV14TotKgs, "ZZZZZZ9.99")));
            AV15Volumen = (int)(GXutil.lval( httpContext.GetPar( "Volumen"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Volumen), 5, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLUMEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15Volumen), "ZZZZ9")));
            AV16FecPan = localUtil.parseDateParm( httpContext.GetPar( "FecPan")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16FecPan", localUtil.format(AV16FecPan, "99/99/99"));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECPAN", getSecureSignedToken( "", AV16FecPan));
            AV17Barnhdr = httpContext.GetPar( "Barnhdr") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Barnhdr", AV17Barnhdr);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNHDR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17Barnhdr, ""))));
            AV18ProForDsc = httpContext.GetPar( "ProForDsc") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18ProForDsc", AV18ProForDsc);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18ProForDsc, ""))));
            AV19Proforfab = httpContext.GetPar( "Proforfab") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Proforfab", AV19Proforfab);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORFAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19Proforfab, ""))));
            AV20Modif2 = httpContext.GetPar( "Modif2") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Modif2", AV20Modif2);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento de Recetas (Registro)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtRecLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public mantenimientoderecetasregistro_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mantenimientoderecetasregistro_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientoderecetasregistro_impl.class ));
   }

   public mantenimientoderecetasregistro_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
      ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
      ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
      ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
      ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
      ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
      ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
      ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
      ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
      ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
      ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavProfordsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavProfordsc_Internalname, httpContext.getMessage( "Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavProfordsc_Internalname, GXutil.rtrim( AV18ProForDsc), GXutil.rtrim( localUtil.format( AV18ProForDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProfordsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProfordsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavModif_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavModif_Internalname, httpContext.getMessage( "Ctrl", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavModif_Internalname, GXutil.rtrim( AV27Modif), GXutil.rtrim( localUtil.format( AV27Modif, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavModif_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavModif_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavModo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavModo_Internalname, httpContext.getMessage( "Modo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavModo_Internalname, GXutil.rtrim( AV47Modo), GXutil.rtrim( localUtil.format( AV47Modo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavModo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavModo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotaldekilos_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavTotaldekilos_Internalname, httpContext.getMessage( "Total Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavTotaldekilos_Internalname, GXutil.ltrim( localUtil.ntoc( AV51Totaldekilos, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotaldekilos_Enabled!=0) ? localUtil.format( AV51Totaldekilos, "ZZZZZZ9.99") : localUtil.format( AV51Totaldekilos, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotaldekilos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotaldekilos_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavVolumenreceta_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavVolumenreceta_Internalname, httpContext.getMessage( "Volumen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavVolumenreceta_Internalname, GXutil.ltrim( localUtil.ntoc( AV58VolumenReceta, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavVolumenreceta_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV58VolumenReceta), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV58VolumenReceta), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavVolumenreceta_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavVolumenreceta_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecLin_Internalname, httpContext.getMessage( "Linea Receta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecLin_Internalname, GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecLin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtRecLin_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecPrdNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecPrdNum_Internalname, httpContext.getMessage( "Codigo Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecPrdNum_Internalname, GXutil.rtrim( A872RecPrdNum), GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecPrdNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtRecPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecPrdDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecPrdDsc_Internalname, httpContext.getMessage( "Producto / Comentarios", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecPrdDsc_Internalname, GXutil.rtrim( A875RecPrdDsc), GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecPrdDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtRecPrdDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_396_872_875_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_396_872_875_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      app.GxWebStd.gx_bitmap( httpContext, imgprompt_396_872_875_Internalname, sImgUrl, imgprompt_396_872_875_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_396_872_875_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_MantenimientodeRecetasRegistro.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForPrdUMe_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForPrdUMe_Internalname, httpContext.getMessage( "Unidad Medida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPrdUMe_Internalname, h490ForPrdUMe, GXutil.rtrim( localUtil.format( h490ForPrdUMe, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPrdUMe_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForPrdUMe_Enabled, 1, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacCon_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacCon_Internalname, httpContext.getMessage( "Factor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacCon_Enabled!=0) ? localUtil.format( A431FacCon, "ZZZZ9.99999") : localUtil.format( A431FacCon, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacCon_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacCon_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCant_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdCant_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCant_Internalname, GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCant_Enabled!=0) ? localUtil.format( A686PrdCant, "ZZZZZZ9.999") : localUtil.format( A686PrdCant, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCant_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdCant_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecForNro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecForNro_Internalname, httpContext.getMessage( "Nº Llamada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecForNro_Internalname, GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecForNro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2394RecForNro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A2394RecForNro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecForNro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtRecForNro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecPrdTnq_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecPrdTnq_Internalname, httpContext.getMessage( "Tq", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecPrdTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecPrdTnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3274RecPrdTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3274RecPrdTnq), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecPrdTnq_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtRecPrdTnq_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTablaprovisional_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecPrdFind_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecPrdFind_Internalname, httpContext.getMessage( "Cod Prod (Formula)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecPrdFind_Internalname, GXutil.rtrim( A874RecPrdFind), GXutil.rtrim( localUtil.format( A874RecPrdFind, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecPrdFind_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtRecPrdFind_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecPrdDscf_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecPrdDscf_Internalname, httpContext.getMessage( "Producto (formula)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecPrdDscf_Internalname, GXutil.rtrim( A13897RecPrdDscf), GXutil.rtrim( localUtil.format( A13897RecPrdDscf, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecPrdDscf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtRecPrdDscf_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCanRes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCanRes_Internalname, httpContext.getMessage( "Cantidad Reservada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCanRes_Internalname, GXutil.ltrim( localUtil.ntoc( A238CanRes, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCanRes_Enabled!=0) ? localUtil.format( A238CanRes, "ZZZZ9.99") : localUtil.format( A238CanRes, "ZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCanRes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCanRes_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCanresold_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavCanresold_Internalname, httpContext.getMessage( "Cantidad Reservada(old)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCanresold_Internalname, GXutil.ltrim( localUtil.ntoc( AV63CanResold, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCanresold_Enabled!=0) ? localUtil.format( AV63CanResold, "ZZZZ9.99") : localUtil.format( AV63CanResold, "ZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCanresold_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCanresold_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientodeRecetasRegistro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientodeRecetasRegistro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientodeRecetasRegistro.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,123);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCod_Visible, edtBarCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodReo_Visible, edtBarCodReo_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodPar_Visible, edtBarCodPar_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecLinMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,127);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecLinMaq_Jsonclick, 0, "Attribute", "", "", "", "", edtRecLinMaq_Visible, edtRecLinMaq_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecLinPro_Internalname, GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,128);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecLinPro_Jsonclick, 0, "Attribute", "", "", "", "", edtRecLinPro_Visible, edtRecLinPro_Enabled, 1, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdNum_Visible, edtPrdNum_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtValCod_Internalname, GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtValCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9") : localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValCod_Jsonclick, 0, "Attribute", "", "", "", "", edtValCod_Visible, edtValCod_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiAlm_Enabled!=0) ? localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiAlm_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdExiAlm_Visible, edtPrdExiAlm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCanRes_Internalname, GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCanRes_Enabled!=0) ? localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999") : localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCanRes_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdCanRes_Visible, edtPrdCanRes_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecCanEns_Internalname, GXutil.ltrim( localUtil.ntoc( A3938RecCanEns, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecCanEns_Enabled!=0) ? localUtil.format( A3938RecCanEns, "ZZZ9.99999") : localUtil.format( A3938RecCanEns, "ZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,133);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecCanEns_Jsonclick, 0, "Attribute", "", "", "", "", edtRecCanEns_Visible, edtRecCanEns_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMar_Internalname, GXutil.ltrim( localUtil.ntoc( A4024RecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4024RecMar), "9") : localUtil.format( DecimalUtil.doubleToDec(A4024RecMar), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMar_Jsonclick, 0, "Attribute", "", "", "", "", edtRecMar_Visible, edtRecMar_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecSalMP_Internalname, GXutil.ltrim( localUtil.ntoc( A5422RecSalMP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecSalMP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5422RecSalMP), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5422RecSalMP), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,135);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecSalMP_Jsonclick, 0, "Attribute", "", "", "", "", edtRecSalMP_Visible, edtRecSalMP_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdSalM_Internalname, GXutil.rtrim( A5418PrdSalM), GXutil.rtrim( localUtil.format( A5418PrdSalM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdSalM_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdSalM_Visible, edtPrdSalM_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecSalVol_Internalname, GXutil.ltrim( localUtil.ntoc( A5467RecSalVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecSalVol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5467RecSalVol), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5467RecSalVol), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,137);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecSalVol_Jsonclick, 0, "Attribute", "", "", "", "", edtRecSalVol_Visible, edtRecSalVol_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecLinRea_Internalname, GXutil.rtrim( A5527RecLinRea), GXutil.rtrim( localUtil.format( A5527RecLinRea, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,138);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecLinRea_Jsonclick, 0, "Attribute", "", "", "", "", edtRecLinRea_Visible, edtRecLinRea_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecLote_Internalname, GXutil.rtrim( A5725RecLote), GXutil.rtrim( localUtil.format( A5725RecLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecLote_Jsonclick, 0, "Attribute", "", "", "", "", edtRecLote_Visible, edtRecLote_Enabled, 1, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecPes_Internalname, GXutil.ltrim( localUtil.ntoc( A8934RecPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecPes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8934RecPes), "9") : localUtil.format( DecimalUtil.doubleToDec(A8934RecPes), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,140);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecPes_Jsonclick, 0, "Attribute", "", "", "", "", edtRecPes_Visible, edtRecPes_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecAcc_Internalname, GXutil.rtrim( A8937RecAcc), GXutil.rtrim( localUtil.format( A8937RecAcc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecAcc_Jsonclick, 0, "Attribute", "", "", "", "", edtRecAcc_Visible, edtRecAcc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRecFecMov_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecFecMov_Internalname, localUtil.format(A3804RecFecMov, "99/99/99"), localUtil.format( A3804RecFecMov, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,142);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecFecMov_Jsonclick, 0, "Attribute", "", "", "", "", edtRecFecMov_Visible, edtRecFecMov_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRecFecMov_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtRecFecMov_Visible==0)||(edtRecFecMov_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      httpContext.writeTextNL( "</div>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecAnyTie_Internalname, GXutil.ltrim( localUtil.ntoc( A3805RecAnyTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecAnyTie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3805RecAnyTie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3805RecAnyTie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,143);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecAnyTie_Jsonclick, 0, "Attribute", "", "", "", "", edtRecAnyTie_Visible, edtRecAnyTie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecUltAny_Internalname, GXutil.ltrim( localUtil.ntoc( A3806RecUltAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecUltAny_Enabled!=0) ? localUtil.format( A3806RecUltAny, "ZZZZZZ9.999") : localUtil.format( A3806RecUltAny, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecUltAny_Jsonclick, 0, "Attribute", "", "", "", "", edtRecUltAny_Visible, edtRecUltAny_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecPorAny_Internalname, GXutil.ltrim( localUtil.ntoc( A3807RecPorAny, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecPorAny_Enabled!=0) ? localUtil.format( A3807RecPorAny, "ZZ9.99") : localUtil.format( A3807RecPorAny, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,145);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecPorAny_Jsonclick, 0, "Attribute", "", "", "", "", edtRecPorAny_Visible, edtRecPorAny_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCanMac_Internalname, GXutil.ltrim( localUtil.ntoc( A4900PrdCanMac, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCanMac_Enabled!=0) ? localUtil.format( A4900PrdCanMac, "ZZZZZZ9.999") : localUtil.format( A4900PrdCanMac, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCanMac_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdCanMac_Visible, edtPrdCanMac_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecProv_Internalname, GXutil.ltrim( localUtil.ntoc( A11708RecProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecProv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11708RecProv), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11708RecProv), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,147);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecProv_Jsonclick, 0, "Attribute", "", "", "", "", edtRecProv_Visible, edtRecProv_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdLote_Internalname, GXutil.rtrim( A10881PrdLote), GXutil.rtrim( localUtil.format( A10881PrdLote, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdLote_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdLote_Visible, edtPrdLote_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecLinUsr_Internalname, GXutil.rtrim( A4576RecLinUsr), GXutil.rtrim( localUtil.format( A4576RecLinUsr, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecLinUsr_Jsonclick, 0, "Attribute", "", "", "", "", edtRecLinUsr_Visible, edtRecLinUsr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtRecPesFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecPesFec_Internalname, localUtil.ttoc( A4577RecPesFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4577RecPesFec, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,150);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecPesFec_Jsonclick, 0, "Attribute", "", "", "", "", edtRecPesFec_Visible, edtRecPesFec_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRecPesFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtRecPesFec_Visible==0)||(edtRecPesFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      httpContext.writeTextNL( "</div>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCantOrg_Internalname, GXutil.ltrim( localUtil.ntoc( A12710PrdCantOrg, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCantOrg_Enabled!=0) ? localUtil.format( A12710PrdCantOrg, "ZZZZZZ9.999") : localUtil.format( A12710PrdCantOrg, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCantOrg_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdCantOrg_Visible, edtPrdCantOrg_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 152,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecFabId_Internalname, GXutil.ltrim( localUtil.ntoc( A12717RecFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecFabId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12717RecFabId), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12717RecFabId), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,152);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecFabId_Jsonclick, 0, "Attribute", "", "", "", "", edtRecFabId_Visible, edtRecFabId_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRGB_Internalname, GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdRGB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13232PrdRGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13232PrdRGB), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRGB_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdRGB_Visible, edtPrdRGB_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCantProduc_Internalname, GXutil.ltrim( localUtil.ntoc( A13832CantProduc, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCantProduc_Enabled!=0) ? localUtil.format( A13832CantProduc, "ZZZZZZZZ9.99") : localUtil.format( A13832CantProduc, "ZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCantProduc_Jsonclick, 0, "Attribute", "", "", "", "", edtCantProduc_Visible, edtCantProduc_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiCC_Enabled!=0) ? localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999") : localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiCC_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdExiCC_Visible, edtPrdExiCC_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc), GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPrdDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtForPrdDsc_Visible, edtForPrdDsc_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavValcos_Internalname, GXutil.ltrim( localUtil.ntoc( AV28Valcos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavValcos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV28Valcos), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV28Valcos), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavValcos_Jsonclick, 0, "Attribute", "", "", "", "", edtavValcos_Visible, edtavValcos_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavProforlab_Internalname, GXutil.rtrim( AV59ProForLab), GXutil.rtrim( localUtil.format( AV59ProForLab, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProforlab_Jsonclick, 0, "Attribute", "", "", "", "", edtavProforlab_Visible, edtavProforlab_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavModif2_Internalname, GXutil.rtrim( AV20Modif2), GXutil.rtrim( localUtil.format( AV20Modif2, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavModif2_Jsonclick, 0, "Attribute", "", "", "", "", edtavModif2_Visible, edtavModif2_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientodeRecetasRegistro.htm");
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
      e111RH2 ();
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
            Z2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( "Z2804RecLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1273RecLinPro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z811RecLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5725RecLote = httpContext.cgiGet( "Z5725RecLote") ;
            Z686PrdCant = localUtil.ctond( httpContext.cgiGet( "Z686PrdCant")) ;
            Z875RecPrdDsc = httpContext.cgiGet( "Z875RecPrdDsc") ;
            Z872RecPrdNum = httpContext.cgiGet( "Z872RecPrdNum") ;
            Z431FacCon = localUtil.ctond( httpContext.cgiGet( "Z431FacCon")) ;
            Z2394RecForNro = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2394RecForNro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3274RecPrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3274RecPrdTnq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3938RecCanEns = localUtil.ctond( httpContext.cgiGet( "Z3938RecCanEns")) ;
            Z4024RecMar = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4024RecMar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5422RecSalMP = (short)(localUtil.ctol( httpContext.cgiGet( "Z5422RecSalMP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5467RecSalVol = (int)(localUtil.ctol( httpContext.cgiGet( "Z5467RecSalVol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5527RecLinRea = httpContext.cgiGet( "Z5527RecLinRea") ;
            Z8934RecPes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8934RecPes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8937RecAcc = httpContext.cgiGet( "Z8937RecAcc") ;
            Z3804RecFecMov = localUtil.ctod( httpContext.cgiGet( "Z3804RecFecMov"), 0) ;
            Z3805RecAnyTie = (short)(localUtil.ctol( httpContext.cgiGet( "Z3805RecAnyTie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3806RecUltAny = localUtil.ctond( httpContext.cgiGet( "Z3806RecUltAny")) ;
            Z3807RecPorAny = localUtil.ctond( httpContext.cgiGet( "Z3807RecPorAny")) ;
            Z4900PrdCanMac = localUtil.ctond( httpContext.cgiGet( "Z4900PrdCanMac")) ;
            Z11708RecProv = (int)(localUtil.ctol( httpContext.cgiGet( "Z11708RecProv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4576RecLinUsr = httpContext.cgiGet( "Z4576RecLinUsr") ;
            Z4577RecPesFec = localUtil.ctot( httpContext.cgiGet( "Z4577RecPesFec"), 0) ;
            Z12710PrdCantOrg = localUtil.ctond( httpContext.cgiGet( "Z12710PrdCantOrg")) ;
            Z12717RecFabId = (int)(localUtil.ctol( httpContext.cgiGet( "Z12717RecFabId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
            Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "Z490ForPrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O5725RecLote = httpContext.cgiGet( "O5725RecLote") ;
            O431FacCon = localUtil.ctond( httpContext.cgiGet( "O431FacCon")) ;
            O686PrdCant = localUtil.ctond( httpContext.cgiGet( "O686PrdCant")) ;
            O238CanRes = localUtil.ctond( httpContext.cgiGet( "O238CanRes")) ;
            O2394RecForNro = (byte)(localUtil.ctol( httpContext.cgiGet( "O2394RecForNro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "N490ForPrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N719PrdNum = httpContext.cgiGet( "N719PrdNum") ;
            N5725RecLote = httpContext.cgiGet( "N5725RecLote") ;
            A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "GXHCFORPRDUME"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( "PRDFACCON")) ;
            AV13EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV12BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV11BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            AV9RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( "vRECLINMAQ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( "vRECLINPRO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7RecLin = (short)(localUtil.ctol( httpContext.cgiGet( "vRECLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV24Insert_ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_FORPRDUME"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV25Insert_PrdNum = httpContext.cgiGet( "vINSERT_PRDNUM") ;
            AV40Artemalha = (short)(localUtil.ctol( httpContext.cgiGet( "vARTEMALHA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV44Lote01 = (short)(localUtil.ctol( httpContext.cgiGet( "vLOTE01"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV53oldRecLote = httpContext.cgiGet( "vOLDRECLOTE") ;
            AV60Cantold = localUtil.ctond( httpContext.cgiGet( "vCANTOLD")) ;
            AV52TipodeProceso = httpContext.cgiGet( "vTIPODEPROCESO") ;
            AV61Inc_obs1 = httpContext.cgiGet( "vINC_OBS1") ;
            AV62Inc_obs2 = httpContext.cgiGet( "vINC_OBS2") ;
            AV56Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV57msgErr = httpContext.cgiGet( "vMSGERR") ;
            AV35AlmCC = (short)(localUtil.ctol( httpContext.cgiGet( "vALMCC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Err_und = (short)(localUtil.ctol( httpContext.cgiGet( "vERR_UND"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV45EliminarReceta = (short)(localUtil.ctol( httpContext.cgiGet( "vELIMINARRECETA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV64Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV50UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV48Station = httpContext.cgiGet( "vSTATION") ;
            Dvpanel_unnamedtable1_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Objectcall") ;
            Dvpanel_unnamedtable1_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Class") ;
            Dvpanel_unnamedtable1_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Enabled")) ;
            Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
            Dvpanel_unnamedtable1_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Height") ;
            Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
            Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
            Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
            Dvpanel_unnamedtable1_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showheader")) ;
            Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
            Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
            Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
            Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
            Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
            Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
            Dvpanel_unnamedtable1_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Visible")) ;
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
            /* Read variables values. */
            AV18ProForDsc = httpContext.cgiGet( edtavProfordsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18ProForDsc", AV18ProForDsc);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18ProForDsc, ""))));
            AV27Modif = httpContext.cgiGet( edtavModif_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Modif", AV27Modif);
            AV47Modo = httpContext.cgiGet( edtavModo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47Modo", AV47Modo);
            AV51Totaldekilos = localUtil.ctond( httpContext.cgiGet( edtavTotaldekilos_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51Totaldekilos", GXutil.ltrimstr( AV51Totaldekilos, 10, 2));
            AV58VolumenReceta = (int)(localUtil.ctol( httpContext.cgiGet( edtavVolumenreceta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58VolumenReceta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58VolumenReceta), 5, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A811RecLin = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
            }
            else
            {
               A811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
            }
            A872RecPrdNum = httpContext.cgiGet( edtRecPrdNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
            A875RecPrdDsc = httpContext.cgiGet( edtRecPrdDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A875RecPrdDsc", A875RecPrdDsc);
            h490ForPrdUMe = httpContext.cgiGet( edtForPrdUMe_Internalname) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFacCon_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacCon_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FACCON");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacCon_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A431FacCon = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A431FacCon", GXutil.ltrimstr( A431FacCon, 11, 5));
            }
            else
            {
               A431FacCon = localUtil.ctond( httpContext.cgiGet( edtFacCon_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A431FacCon", GXutil.ltrimstr( A431FacCon, 11, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdCant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdCant_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCANT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdCant_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A686PrdCant = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
            }
            else
            {
               A686PrdCant = localUtil.ctond( httpContext.cgiGet( edtPrdCant_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECFORNRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecForNro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2394RecForNro = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2394RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2394RecForNro), 2, 0));
            }
            else
            {
               A2394RecForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2394RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2394RecForNro), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECPRDTNQ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecPrdTnq_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3274RecPrdTnq = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3274RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3274RecPrdTnq), 2, 0));
            }
            else
            {
               A3274RecPrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3274RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3274RecPrdTnq), 2, 0));
            }
            A874RecPrdFind = httpContext.cgiGet( edtRecPrdFind_Internalname) ;
            n874RecPrdFind = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", A874RecPrdFind);
            A13897RecPrdDscf = httpContext.cgiGet( edtRecPrdDscf_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13897RecPrdDscf", A13897RecPrdDscf);
            A238CanRes = localUtil.ctond( httpContext.cgiGet( edtCanRes_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrimstr( A238CanRes, 8, 2));
            AV63CanResold = localUtil.ctond( httpContext.cgiGet( edtavCanresold_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63CanResold", GXutil.ltrimstr( AV63CanResold, 8, 2));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A129BarCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            else
            {
               A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCodReo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A132BarCodReo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            else
            {
               A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECLINMAQ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecLinMaq_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2804RecLinMaq = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            }
            else
            {
               A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECLINPRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecLinPro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1273RecLinPro = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
            }
            else
            {
               A1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
            }
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
            A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
            A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRecCanEns_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecCanEns_Internalname)), DecimalUtil.stringToDec("9999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECCANENS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecCanEns_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3938RecCanEns = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A3938RecCanEns", GXutil.ltrimstr( A3938RecCanEns, 10, 5));
            }
            else
            {
               A3938RecCanEns = localUtil.ctond( httpContext.cgiGet( edtRecCanEns_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3938RecCanEns", GXutil.ltrimstr( A3938RecCanEns, 10, 5));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecMar_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4024RecMar = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4024RecMar", GXutil.str( A4024RecMar, 1, 0));
            }
            else
            {
               A4024RecMar = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4024RecMar", GXutil.str( A4024RecMar, 1, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecSalMP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecSalMP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECSALMP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecSalMP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5422RecSalMP = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5422RecSalMP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5422RecSalMP), 3, 0));
            }
            else
            {
               A5422RecSalMP = (short)(localUtil.ctol( httpContext.cgiGet( edtRecSalMP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5422RecSalMP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5422RecSalMP), 3, 0));
            }
            A5418PrdSalM = httpContext.cgiGet( edtPrdSalM_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", A5418PrdSalM);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecSalVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecSalVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECSALVOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecSalVol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5467RecSalVol = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A5467RecSalVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5467RecSalVol), 5, 0));
            }
            else
            {
               A5467RecSalVol = (int)(localUtil.ctol( httpContext.cgiGet( edtRecSalVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5467RecSalVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5467RecSalVol), 5, 0));
            }
            A5527RecLinRea = httpContext.cgiGet( edtRecLinRea_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5527RecLinRea", A5527RecLinRea);
            A5725RecLote = httpContext.cgiGet( edtRecLote_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5725RecLote", A5725RecLote);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECPES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecPes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8934RecPes = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8934RecPes", GXutil.str( A8934RecPes, 1, 0));
            }
            else
            {
               A8934RecPes = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8934RecPes", GXutil.str( A8934RecPes, 1, 0));
            }
            A8937RecAcc = httpContext.cgiGet( edtRecAcc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8937RecAcc", A8937RecAcc);
            if ( localUtil.vcdate( httpContext.cgiGet( edtRecFecMov_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "RECFECMOV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecFecMov_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3804RecFecMov = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A3804RecFecMov", localUtil.format(A3804RecFecMov, "99/99/99"));
            }
            else
            {
               A3804RecFecMov = localUtil.ctod( httpContext.cgiGet( edtRecFecMov_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3804RecFecMov", localUtil.format(A3804RecFecMov, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecAnyTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecAnyTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECANYTIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecAnyTie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3805RecAnyTie = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3805RecAnyTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3805RecAnyTie), 4, 0));
            }
            else
            {
               A3805RecAnyTie = (short)(localUtil.ctol( httpContext.cgiGet( edtRecAnyTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3805RecAnyTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3805RecAnyTie), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRecUltAny_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecUltAny_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECULTANY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecUltAny_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3806RecUltAny = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A3806RecUltAny", GXutil.ltrimstr( A3806RecUltAny, 11, 3));
            }
            else
            {
               A3806RecUltAny = localUtil.ctond( httpContext.cgiGet( edtRecUltAny_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3806RecUltAny", GXutil.ltrimstr( A3806RecUltAny, 11, 3));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtRecPorAny_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecPorAny_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECPORANY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecPorAny_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3807RecPorAny = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A3807RecPorAny", GXutil.ltrimstr( A3807RecPorAny, 6, 2));
            }
            else
            {
               A3807RecPorAny = localUtil.ctond( httpContext.cgiGet( edtRecPorAny_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3807RecPorAny", GXutil.ltrimstr( A3807RecPorAny, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdCanMac_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdCanMac_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCANMAC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdCanMac_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4900PrdCanMac = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A4900PrdCanMac", GXutil.ltrimstr( A4900PrdCanMac, 11, 3));
            }
            else
            {
               A4900PrdCanMac = localUtil.ctond( httpContext.cgiGet( edtPrdCanMac_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4900PrdCanMac", GXutil.ltrimstr( A4900PrdCanMac, 11, 3));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecProv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecProv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECPROV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecProv_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11708RecProv = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A11708RecProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11708RecProv), 6, 0));
            }
            else
            {
               A11708RecProv = (int)(localUtil.ctol( httpContext.cgiGet( edtRecProv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11708RecProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11708RecProv), 6, 0));
            }
            A10881PrdLote = httpContext.cgiGet( edtPrdLote_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
            A4576RecLinUsr = GXutil.upper( httpContext.cgiGet( edtRecLinUsr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4576RecLinUsr", A4576RecLinUsr);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtRecPesFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "RECPESFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecPesFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A4577RecPesFec", localUtil.ttoc( A4577RecPesFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A4577RecPesFec = localUtil.ctot( httpContext.cgiGet( edtRecPesFec_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4577RecPesFec", localUtil.ttoc( A4577RecPesFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdCantOrg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdCantOrg_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCANTORG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdCantOrg_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12710PrdCantOrg = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A12710PrdCantOrg", GXutil.ltrimstr( A12710PrdCantOrg, 11, 3));
            }
            else
            {
               A12710PrdCantOrg = localUtil.ctond( httpContext.cgiGet( edtPrdCantOrg_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12710PrdCantOrg", GXutil.ltrimstr( A12710PrdCantOrg, 11, 3));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecFabId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecFabId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECFABID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecFabId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12717RecFabId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12717RecFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12717RecFabId), 6, 0));
            }
            else
            {
               A12717RecFabId = (int)(localUtil.ctol( httpContext.cgiGet( edtRecFabId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12717RecFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12717RecFabId), 6, 0));
            }
            A13232PrdRGB = localUtil.ctol( httpContext.cgiGet( edtPrdRGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13232PrdRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13232PrdRGB), 10, 0));
            A13832CantProduc = localUtil.ctond( httpContext.cgiGet( edtCantProduc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13832CantProduc", GXutil.ltrimstr( A13832CantProduc, 12, 2));
            A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
            A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
            n488ForPrdDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
            AV28Valcos = (short)(localUtil.ctol( httpContext.cgiGet( edtavValcos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28Valcos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Valcos), 4, 0));
            AV59ProForLab = httpContext.cgiGet( edtavProforlab_Internalname) ;
            AV20Modif2 = httpContext.cgiGet( edtavModif2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Modif2", AV20Modif2);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"MantenimientodeRecetasRegistro");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) || ( A1273RecLinPro != Z1273RecLinPro ) || ( A811RecLin != Z811RecLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("mantenimientoderecetasregistro:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A2804RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
               A1273RecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "RecLinPro"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
               A811RecLin = (short)(GXutil.lval( httpContext.GetPar( "RecLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
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
                  sMode410 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode410 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound410 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1RH0( ) ;
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
                        e111RH2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121RH2 ();
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
         e121RH2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1RH410( ) ;
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
         disableAttributes1RH410( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavProfordsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProfordsc_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavModif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModif_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavModo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModo_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavTotaldekilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotaldekilos_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavVolumenreceta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVolumenreceta_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCanresold_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCanresold_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavValcos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValcos_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavProforlab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProforlab_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavModif2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModif2_Enabled), 5, 0), true);
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

   public void confirm_1RH0( )
   {
      beforeValidate1RH410( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1RH410( ) ;
         }
         else
         {
            checkExtendedTable1RH410( ) ;
            closeExtendedTableCursors1RH410( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1RH0( )
   {
   }

   public void e111RH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV48Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mantenimientoderecetasregistro_impl.this.GXt_char1 = GXv_char2[0] ;
      AV48Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Station", AV48Station);
      GXv_char2[0] = AV13EmprCod ;
      GXv_char3[0] = AV49EmprNom ;
      GXv_char4[0] = AV50UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV48Station, GXv_char2, GXv_char3, GXv_char4) ;
      mantenimientoderecetasregistro_impl.this.AV13EmprCod = GXv_char2[0] ;
      mantenimientoderecetasregistro_impl.this.AV49EmprNom = GXv_char3[0] ;
      mantenimientoderecetasregistro_impl.this.AV50UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13EmprCod", AV13EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV49EmprNom", AV49EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV50UsurCod", AV50UsurCod);
      AV27Modif = AV20Modif2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Modif", AV27Modif);
      GXt_int5 = AV28Valcos ;
      GXv_char4[0] = AV13EmprCod ;
      GXv_char3[0] = "030100" ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
      mantenimientoderecetasregistro_impl.this.AV13EmprCod = GXv_char4[0] ;
      mantenimientoderecetasregistro_impl.this.GXt_int5 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13EmprCod", AV13EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13EmprCod, "@!"))));
      AV28Valcos = (short)(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Valcos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Valcos), 4, 0));
      GXt_int7 = AV29Flag ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV13EmprCod, "038001", GXv_int8) ;
      mantenimientoderecetasregistro_impl.this.GXt_int7 = GXv_int8[0] ;
      AV29Flag = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Flag", GXutil.str( AV29Flag, 1, 0));
      GXt_int7 = (byte)(AV30Centra) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "CENTRA", ""), GXv_int8) ;
      mantenimientoderecetasregistro_impl.this.GXt_int7 = GXv_int8[0] ;
      AV30Centra = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Centra", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Centra), 4, 0));
      GXt_int7 = (byte)(AV31F_pizarro) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "PIZARR", ""), GXv_int8) ;
      mantenimientoderecetasregistro_impl.this.GXt_int7 = GXv_int8[0] ;
      AV31F_pizarro = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31F_pizarro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31F_pizarro), 4, 0));
      GXt_int7 = (byte)(AV32Err_und) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "ERRUND", ""), GXv_int8) ;
      mantenimientoderecetasregistro_impl.this.GXt_int7 = GXv_int8[0] ;
      AV32Err_und = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Err_und", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Err_und), 4, 0));
      GXt_int7 = (byte)(AV33Suprema) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "SUPREM", ""), GXv_int8) ;
      mantenimientoderecetasregistro_impl.this.GXt_int7 = GXv_int8[0] ;
      AV33Suprema = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Suprema", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Suprema), 4, 0));
      GXt_int7 = (byte)(AV34Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      mantenimientoderecetasregistro_impl.this.GXt_int7 = GXv_int8[0] ;
      AV34Moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Moda21), 4, 0));
      GXt_int7 = (byte)(AV35AlmCC) ;
      GXv_int8[0] = GXt_int7 ;
      new app.popcion(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "10002E", ""), GXv_int8) ;
      mantenimientoderecetasregistro_impl.this.GXt_int7 = GXv_int8[0] ;
      AV35AlmCC = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35AlmCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35AlmCC), 4, 0));
      GXt_int5 = AV36Factor8 ;
      GXv_char4[0] = AV13EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "STDFAT", "") ;
      GXv_int6[0] = GXt_int5 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
      mantenimientoderecetasregistro_impl.this.AV13EmprCod = GXv_char4[0] ;
      mantenimientoderecetasregistro_impl.this.GXt_int5 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13EmprCod", AV13EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13EmprCod, "@!"))));
      AV36Factor8 = (short)(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Factor8", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Factor8), 4, 0));
      AV37Factor = (short)(AV36Factor8/ (double) (100)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Factor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Factor), 4, 0));
      AV38MsgErrFactor = httpContext.getMessage( "AVISO.Las cantidades ingresadas superan el estándar.Confirma?", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38MsgErrFactor", AV38MsgErrFactor);
      AV39Conf = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Conf", AV39Conf);
      GXt_int7 = (byte)(AV40Artemalha) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "ARTEMH", ""), GXv_int8) ;
      mantenimientoderecetasregistro_impl.this.GXt_int7 = GXv_int8[0] ;
      AV40Artemalha = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Artemalha", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Artemalha), 4, 0));
      GXt_int7 = (byte)(AV41AvisoPesaje) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "WARPES", ""), GXv_int8) ;
      mantenimientoderecetasregistro_impl.this.GXt_int7 = GXv_int8[0] ;
      AV41AvisoPesaje = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41AvisoPesaje", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41AvisoPesaje), 4, 0));
      GXt_int7 = (byte)(DecimalUtil.decToDouble(AV42NoCantidad)) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "NOCTD", ""), GXv_int8) ;
      mantenimientoderecetasregistro_impl.this.GXt_int7 = GXv_int8[0] ;
      AV42NoCantidad = DecimalUtil.doubleToDec(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42NoCantidad", GXutil.ltrimstr( AV42NoCantidad, 9, 2));
      AV43msg_err1 = httpContext.getMessage( "Atencion.El codigo de producto, NO se puede modificar", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43msg_err1", AV43msg_err1);
      AV43msg_err1 += httpContext.getMessage( "El procedimiento es:", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43msg_err1", AV43msg_err1);
      AV43msg_err1 += httpContext.getMessage( "Eliminar Linea.", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43msg_err1", AV43msg_err1);
      AV43msg_err1 += httpContext.getMessage( "Añadir Linea.", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43msg_err1", AV43msg_err1);
      GXt_int7 = (byte)(AV44Lote01) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "01LOTE", ""), GXv_int8) ;
      mantenimientoderecetasregistro_impl.this.GXt_int7 = GXv_int8[0] ;
      AV44Lote01 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Lote01", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Lote01), 4, 0));
      GXt_int7 = (byte)(AV45EliminarReceta) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "INCI92", ""), GXv_int8) ;
      mantenimientoderecetasregistro_impl.this.GXt_int7 = GXv_int8[0] ;
      AV45EliminarReceta = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45EliminarReceta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45EliminarReceta), 4, 0));
      GXt_int7 = (byte)(AV46SiRGB) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "SIPRGB", ""), GXv_int8) ;
      mantenimientoderecetasregistro_impl.this.GXt_int7 = GXv_int8[0] ;
      AV46SiRGB = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46SiRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46SiRGB), 4, 0));
      AV47Modo = Gx_mode ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Modo", AV47Modo);
      AV51Totaldekilos = AV14TotKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Totaldekilos", GXutil.ltrimstr( AV51Totaldekilos, 10, 2));
      AV52TipodeProceso = AV19Proforfab ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TipodeProceso", AV52TipodeProceso);
      AV58VolumenReceta = AV15Volumen ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58VolumenReceta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58VolumenReceta), 5, 0));
      GXt_char1 = AV48Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      mantenimientoderecetasregistro_impl.this.GXt_char1 = GXv_char4[0] ;
      AV48Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Station", AV48Station);
      GXv_char4[0] = AV13EmprCod ;
      GXv_char3[0] = AV49EmprNom ;
      GXv_char2[0] = AV50UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV48Station, GXv_char4, GXv_char3, GXv_char2) ;
      mantenimientoderecetasregistro_impl.this.AV13EmprCod = GXv_char4[0] ;
      mantenimientoderecetasregistro_impl.this.AV49EmprNom = GXv_char3[0] ;
      mantenimientoderecetasregistro_impl.this.AV50UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13EmprCod", AV13EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV49EmprNom", AV49EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV50UsurCod", AV50UsurCod);
      GXv_SdtWWPContext9[0] = AV21WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV21WWPContext = GXv_SdtWWPContext9[0] ;
      AV22TrnContext.fromxml(AV23WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV22TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV64Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV65GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65GXV1), 8, 0));
         while ( AV65GXV1 <= AV22TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV26TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV22TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV65GXV1));
            if ( GXutil.strcmp(AV26TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ForPrdUMe") == 0 )
            {
               AV24Insert_ForPrdUMe = (byte)(GXutil.lval( AV26TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24Insert_ForPrdUMe", GXutil.str( AV24Insert_ForPrdUMe, 1, 0));
            }
            else if ( GXutil.strcmp(AV26TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PrdNum") == 0 )
            {
               AV25Insert_PrdNum = AV26TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25Insert_PrdNum", AV25Insert_PrdNum);
            }
            AV65GXV1 = (int)(AV65GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtBarCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Visible), 5, 0), true);
      edtBarCodReo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Visible), 5, 0), true);
      edtBarCodPar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Visible), 5, 0), true);
      edtRecLinMaq_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinMaq_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMaq_Visible), 5, 0), true);
      edtRecLinPro_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinPro_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinPro_Visible), 5, 0), true);
      edtPrdNum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), true);
      edtValCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValCod_Visible), 5, 0), true);
      edtPrdExiAlm_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Visible), 5, 0), true);
      edtPrdCanRes_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Visible), 5, 0), true);
      edtRecCanEns_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecCanEns_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecCanEns_Visible), 5, 0), true);
      edtRecMar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMar_Visible), 5, 0), true);
      edtRecSalMP_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecSalMP_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecSalMP_Visible), 5, 0), true);
      edtPrdSalM_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdSalM_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdSalM_Visible), 5, 0), true);
      edtRecSalVol_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecSalVol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecSalVol_Visible), 5, 0), true);
      edtRecLinRea_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinRea_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinRea_Visible), 5, 0), true);
      edtRecLote_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLote_Visible), 5, 0), true);
      edtRecPes_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPes_Visible), 5, 0), true);
      edtRecAcc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecAcc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecAcc_Visible), 5, 0), true);
      edtRecFecMov_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFecMov_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFecMov_Visible), 5, 0), true);
      edtRecAnyTie_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecAnyTie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecAnyTie_Visible), 5, 0), true);
      edtRecUltAny_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecUltAny_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecUltAny_Visible), 5, 0), true);
      edtRecPorAny_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPorAny_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPorAny_Visible), 5, 0), true);
      edtPrdCanMac_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanMac_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanMac_Visible), 5, 0), true);
      edtRecProv_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecProv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecProv_Visible), 5, 0), true);
      edtPrdLote_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdLote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLote_Visible), 5, 0), true);
      edtRecLinUsr_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinUsr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinUsr_Visible), 5, 0), true);
      edtRecPesFec_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPesFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPesFec_Visible), 5, 0), true);
      edtPrdCantOrg_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCantOrg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCantOrg_Visible), 5, 0), true);
      edtRecFabId_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFabId_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFabId_Visible), 5, 0), true);
      edtPrdRGB_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRGB_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRGB_Visible), 5, 0), true);
      edtCantProduc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCantProduc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCantProduc_Visible), 5, 0), true);
      edtPrdExiCC_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Visible), 5, 0), true);
      edtForPrdDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Visible), 5, 0), true);
      edtavValcos_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValcos_Visible), 5, 0), true);
      edtavProforlab_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProforlab_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProforlab_Visible), 5, 0), true);
      edtavModif2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModif2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModif2_Visible), 5, 0), true);
   }

   public void e121RH2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      AV20Modif2 = AV27Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Modif2", AV20Modif2);
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         GXv_char4[0] = AV13EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_decimal10[0] = A238CanRes ;
         GXv_decimal11[0] = AV63CanResold ;
         new app.mantenimientoderecetasregistro_modificocantreservada(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal10, GXv_decimal11) ;
         mantenimientoderecetasregistro_impl.this.AV13EmprCod = GXv_char4[0] ;
         mantenimientoderecetasregistro_impl.this.A872RecPrdNum = GXv_char3[0] ;
         mantenimientoderecetasregistro_impl.this.A238CanRes = GXv_decimal10[0] ;
         mantenimientoderecetasregistro_impl.this.AV63CanResold = GXv_decimal11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13EmprCod", AV13EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrimstr( A238CanRes, 8, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV63CanResold", GXutil.ltrimstr( AV63CanResold, 8, 2));
      }
      else
      {
         GXv_char4[0] = AV13EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal10[0] = AV63CanResold ;
         new app.mantenimientoderecetasregistro_modificocantreservada(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal11, GXv_decimal10) ;
         mantenimientoderecetasregistro_impl.this.AV13EmprCod = GXv_char4[0] ;
         mantenimientoderecetasregistro_impl.this.A872RecPrdNum = GXv_char3[0] ;
         mantenimientoderecetasregistro_impl.this.AV63CanResold = GXv_decimal10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13EmprCod", AV13EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV63CanResold", GXutil.ltrimstr( AV63CanResold, 8, 2));
      }
      httpContext.setWebReturnParms(new Object[] {AV20Modif2});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV20Modif2"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void zm1RH410( int GX_JID )
   {
      if ( ( GX_JID == 66 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5725RecLote = T01RH3_A5725RecLote[0] ;
            Z686PrdCant = T01RH3_A686PrdCant[0] ;
            Z875RecPrdDsc = T01RH3_A875RecPrdDsc[0] ;
            Z872RecPrdNum = T01RH3_A872RecPrdNum[0] ;
            Z431FacCon = T01RH3_A431FacCon[0] ;
            Z2394RecForNro = T01RH3_A2394RecForNro[0] ;
            Z3274RecPrdTnq = T01RH3_A3274RecPrdTnq[0] ;
            Z3938RecCanEns = T01RH3_A3938RecCanEns[0] ;
            Z4024RecMar = T01RH3_A4024RecMar[0] ;
            Z5422RecSalMP = T01RH3_A5422RecSalMP[0] ;
            Z5467RecSalVol = T01RH3_A5467RecSalVol[0] ;
            Z5527RecLinRea = T01RH3_A5527RecLinRea[0] ;
            Z8934RecPes = T01RH3_A8934RecPes[0] ;
            Z8937RecAcc = T01RH3_A8937RecAcc[0] ;
            Z3804RecFecMov = T01RH3_A3804RecFecMov[0] ;
            Z3805RecAnyTie = T01RH3_A3805RecAnyTie[0] ;
            Z3806RecUltAny = T01RH3_A3806RecUltAny[0] ;
            Z3807RecPorAny = T01RH3_A3807RecPorAny[0] ;
            Z4900PrdCanMac = T01RH3_A4900PrdCanMac[0] ;
            Z11708RecProv = T01RH3_A11708RecProv[0] ;
            Z4576RecLinUsr = T01RH3_A4576RecLinUsr[0] ;
            Z4577RecPesFec = T01RH3_A4577RecPesFec[0] ;
            Z12710PrdCantOrg = T01RH3_A12710PrdCantOrg[0] ;
            Z12717RecFabId = T01RH3_A12717RecFabId[0] ;
            Z719PrdNum = T01RH3_A719PrdNum[0] ;
            Z490ForPrdUMe = T01RH3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z5725RecLote = A5725RecLote ;
            Z686PrdCant = A686PrdCant ;
            Z875RecPrdDsc = A875RecPrdDsc ;
            Z872RecPrdNum = A872RecPrdNum ;
            Z431FacCon = A431FacCon ;
            Z2394RecForNro = A2394RecForNro ;
            Z3274RecPrdTnq = A3274RecPrdTnq ;
            Z3938RecCanEns = A3938RecCanEns ;
            Z4024RecMar = A4024RecMar ;
            Z5422RecSalMP = A5422RecSalMP ;
            Z5467RecSalVol = A5467RecSalVol ;
            Z5527RecLinRea = A5527RecLinRea ;
            Z8934RecPes = A8934RecPes ;
            Z8937RecAcc = A8937RecAcc ;
            Z3804RecFecMov = A3804RecFecMov ;
            Z3805RecAnyTie = A3805RecAnyTie ;
            Z3806RecUltAny = A3806RecUltAny ;
            Z3807RecPorAny = A3807RecPorAny ;
            Z4900PrdCanMac = A4900PrdCanMac ;
            Z11708RecProv = A11708RecProv ;
            Z4576RecLinUsr = A4576RecLinUsr ;
            Z4577RecPesFec = A4577RecPesFec ;
            Z12710PrdCantOrg = A12710PrdCantOrg ;
            Z12717RecFabId = A12717RecFabId ;
            Z719PrdNum = A719PrdNum ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -66 )
      {
         Z811RecLin = A811RecLin ;
         Z5725RecLote = A5725RecLote ;
         Z686PrdCant = A686PrdCant ;
         Z875RecPrdDsc = A875RecPrdDsc ;
         Z872RecPrdNum = A872RecPrdNum ;
         Z431FacCon = A431FacCon ;
         Z2394RecForNro = A2394RecForNro ;
         Z3274RecPrdTnq = A3274RecPrdTnq ;
         Z3938RecCanEns = A3938RecCanEns ;
         Z4024RecMar = A4024RecMar ;
         Z5422RecSalMP = A5422RecSalMP ;
         Z5467RecSalVol = A5467RecSalVol ;
         Z5527RecLinRea = A5527RecLinRea ;
         Z8934RecPes = A8934RecPes ;
         Z8937RecAcc = A8937RecAcc ;
         Z3804RecFecMov = A3804RecFecMov ;
         Z3805RecAnyTie = A3805RecAnyTie ;
         Z3806RecUltAny = A3806RecUltAny ;
         Z3807RecPorAny = A3807RecPorAny ;
         Z4900PrdCanMac = A4900PrdCanMac ;
         Z11708RecProv = A11708RecProv ;
         Z4576RecLinUsr = A4576RecLinUsr ;
         Z4577RecPesFec = A4577RecPesFec ;
         Z12710PrdCantOrg = A12710PrdCantOrg ;
         Z12717RecFabId = A12717RecFabId ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2804RecLinMaq = A2804RecLinMaq ;
         Z1273RecLinPro = A1273RecLinPro ;
         Z874RecPrdFind = A874RecPrdFind ;
         Z488ForPrdDsc = A488ForPrdDsc ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z685PrdCanRes = A685PrdCanRes ;
         Z5418PrdSalM = A5418PrdSalM ;
         Z10881PrdLote = A10881PrdLote ;
         Z13232PrdRGB = A13232PrdRGB ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z707PrdFacCon = A707PrdFacCon ;
         Z856ValCod = A856ValCod ;
      }
   }

   public void standaloneNotModal( )
   {
      AV64Pgmname = "MantenimientodeRecetasRegistro" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64Pgmname", AV64Pgmname);
      imgprompt_396_872_875_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.stocksquimicos.producprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"RECPRDNUM"+"'), id:'"+"RECPRDNUM"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"RECPRDDSC"+"'), id:'"+"RECPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV13EmprCod)==0) )
      {
         A396EmprCod = AV13EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV13EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV13EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV12BarCod) )
      {
         A129BarCod = AV12BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV12BarCod) )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV12BarCod) )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV11BarCodReo) )
      {
         A132BarCodReo = AV11BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (0==AV11BarCodReo) )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCodReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      if ( ! (0==AV11BarCodReo) )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10BarCodPar)==0) )
      {
         A130BarCodPar = AV10BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      if ( ! (GXutil.strcmp("", AV10BarCodPar)==0) )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCodPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10BarCodPar)==0) )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9RecLinMaq) )
      {
         A2804RecLinMaq = AV9RecLinMaq ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
      }
      if ( ! (0==AV9RecLinMaq) )
      {
         edtRecLinMaq_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMaq_Enabled), 5, 0), true);
      }
      else
      {
         edtRecLinMaq_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMaq_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9RecLinMaq) )
      {
         edtRecLinMaq_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMaq_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8RecLinPro) )
      {
         A1273RecLinPro = AV8RecLinPro ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
      }
      if ( ! (0==AV8RecLinPro) )
      {
         edtRecLinPro_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinPro_Enabled), 5, 0), true);
      }
      else
      {
         edtRecLinPro_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinPro_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8RecLinPro) )
      {
         edtRecLinPro_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinPro_Enabled), 5, 0), true);
      }
      if ( ! (0==AV7RecLin) )
      {
         A811RecLin = AV7RecLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
      }
      if ( ! (0==AV7RecLin) )
      {
         edtRecLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLin_Enabled), 5, 0), true);
      }
      else
      {
         edtRecLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLin_Enabled), 5, 0), true);
      }
      if ( ! (0==AV7RecLin) )
      {
         edtRecLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLin_Enabled), 5, 0), true);
      }
      if ( (0==AV40Artemalha) )
      {
         edtRecLote_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLote_Enabled), 5, 0), true);
      }
      else
      {
         edtRecLote_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLote_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV24Insert_ForPrdUMe) )
      {
         edtForPrdUMe_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), true);
      }
      else
      {
         edtForPrdUMe_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV25Insert_PrdNum)==0) )
      {
         edtPrdNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      }
      else
      {
         edtPrdNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV24Insert_ForPrdUMe) )
      {
         A490ForPrdUMe = AV24Insert_ForPrdUMe ;
         n490ForPrdUMe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         /* Using cursor T01RH8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
         h490ForPrdUMe = "" ;
         while ( (pr_default.getStatus(6) != 101) )
         {
            h490ForPrdUMe = T01RH8_A13746ForPrdCDsc[0] ;
            if (true) break;
         }
         pr_default.close(6);
         httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
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
         /* Using cursor T01RH5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01RH5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01RH5_n488ForPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         pr_default.close(3);
      }
   }

   public void load1RH410( )
   {
      /* Using cursor T01RH9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound410 = (short)(1) ;
         A5725RecLote = T01RH9_A5725RecLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5725RecLote", A5725RecLote);
         A686PrdCant = T01RH9_A686PrdCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
         A875RecPrdDsc = T01RH9_A875RecPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A875RecPrdDsc", A875RecPrdDsc);
         A872RecPrdNum = T01RH9_A872RecPrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         A488ForPrdDsc = T01RH9_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01RH9_n488ForPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         A431FacCon = T01RH9_A431FacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A431FacCon", GXutil.ltrimstr( A431FacCon, 11, 5));
         A2394RecForNro = T01RH9_A2394RecForNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2394RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2394RecForNro), 2, 0));
         A3274RecPrdTnq = T01RH9_A3274RecPrdTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3274RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3274RecPrdTnq), 2, 0));
         A704PrdExiAlm = T01RH9_A704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A685PrdCanRes = T01RH9_A685PrdCanRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         A3938RecCanEns = T01RH9_A3938RecCanEns[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3938RecCanEns", GXutil.ltrimstr( A3938RecCanEns, 10, 5));
         A4024RecMar = T01RH9_A4024RecMar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4024RecMar", GXutil.str( A4024RecMar, 1, 0));
         A5422RecSalMP = T01RH9_A5422RecSalMP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5422RecSalMP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5422RecSalMP), 3, 0));
         A5418PrdSalM = T01RH9_A5418PrdSalM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", A5418PrdSalM);
         A5467RecSalVol = T01RH9_A5467RecSalVol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5467RecSalVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5467RecSalVol), 5, 0));
         A5527RecLinRea = T01RH9_A5527RecLinRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5527RecLinRea", A5527RecLinRea);
         A8934RecPes = T01RH9_A8934RecPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8934RecPes", GXutil.str( A8934RecPes, 1, 0));
         A8937RecAcc = T01RH9_A8937RecAcc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8937RecAcc", A8937RecAcc);
         A3804RecFecMov = T01RH9_A3804RecFecMov[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3804RecFecMov", localUtil.format(A3804RecFecMov, "99/99/99"));
         A3805RecAnyTie = T01RH9_A3805RecAnyTie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3805RecAnyTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3805RecAnyTie), 4, 0));
         A3806RecUltAny = T01RH9_A3806RecUltAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3806RecUltAny", GXutil.ltrimstr( A3806RecUltAny, 11, 3));
         A3807RecPorAny = T01RH9_A3807RecPorAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3807RecPorAny", GXutil.ltrimstr( A3807RecPorAny, 6, 2));
         A4900PrdCanMac = T01RH9_A4900PrdCanMac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4900PrdCanMac", GXutil.ltrimstr( A4900PrdCanMac, 11, 3));
         A11708RecProv = T01RH9_A11708RecProv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11708RecProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11708RecProv), 6, 0));
         A10881PrdLote = T01RH9_A10881PrdLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
         A4576RecLinUsr = T01RH9_A4576RecLinUsr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4576RecLinUsr", A4576RecLinUsr);
         A4577RecPesFec = T01RH9_A4577RecPesFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4577RecPesFec", localUtil.ttoc( A4577RecPesFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12710PrdCantOrg = T01RH9_A12710PrdCantOrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12710PrdCantOrg", GXutil.ltrimstr( A12710PrdCantOrg, 11, 3));
         A12717RecFabId = T01RH9_A12717RecFabId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12717RecFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12717RecFabId), 6, 0));
         A13232PrdRGB = T01RH9_A13232PrdRGB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13232PrdRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13232PrdRGB), 10, 0));
         A705PrdExiCC = T01RH9_A705PrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         A707PrdFacCon = T01RH9_A707PrdFacCon[0] ;
         A719PrdNum = T01RH9_A719PrdNum[0] ;
         n719PrdNum = T01RH9_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A490ForPrdUMe = T01RH9_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T01RH9_n490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         A856ValCod = T01RH9_A856ValCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         A874RecPrdFind = T01RH9_A874RecPrdFind[0] ;
         n874RecPrdFind = T01RH9_n874RecPrdFind[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", A874RecPrdFind);
         zm1RH410( -66) ;
      }
      pr_default.close(7);
      onLoadActions1RH410( ) ;
   }

   public void onLoadActions1RH410( )
   {
      if ( ( ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) ) && ( GXutil.strcmp(AV52TipodeProceso, "*") != 0 ) )
      {
         A686PrdCant = (A431FacCon.multiply(DecimalUtil.doubleToDec(AV58VolumenReceta))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
      }
      else
      {
         if ( ( A490ForPrdUMe == 3 ) && ( GXutil.strcmp(AV52TipodeProceso, "*") != 0 ) )
         {
            A686PrdCant = AV51Totaldekilos.multiply(A431FacCon).multiply(DecimalUtil.doubleToDec(AV28Valcos)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
         }
      }
      if ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 )
      {
         GXt_char1 = A13897RecPrdDscf ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         mantenimientoderecetasregistro_impl.this.A396EmprCod = GXv_char4[0] ;
         mantenimientoderecetasregistro_impl.this.A872RecPrdNum = GXv_char3[0] ;
         mantenimientoderecetasregistro_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         A13897RecPrdDscf = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13897RecPrdDscf", A13897RecPrdDscf);
      }
      else
      {
         A13897RecPrdDscf = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A13897RecPrdDscf", A13897RecPrdDscf);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV25Insert_PrdNum)==0) )
      {
         A719PrdNum = AV25Insert_PrdNum ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      else
      {
         if ( true /* After */ && ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 ) && isIns( )  )
         {
            A719PrdNum = A872RecPrdNum ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         }
      }
      if ( true /* After */ && ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 ) )
      {
         A875RecPrdDsc = A13897RecPrdDscf ;
         httpContext.ajax_rsp_assign_attri("", false, "A875RecPrdDsc", A875RecPrdDsc);
      }
      if ( ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) || ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) || ( A2394RecForNro != O2394RecForNro ) )
      {
         AV27Modif = httpContext.getMessage( "Y", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Modif", AV27Modif);
      }
      A238CanRes = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrimstr( A238CanRes, 8, 2));
      O238CanRes = A238CanRes ;
      httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrimstr( A238CanRes, 8, 2));
      AV63CanResold = O238CanRes ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63CanResold", GXutil.ltrimstr( AV63CanResold, 8, 2));
      AV60Cantold = O686PrdCant ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Cantold", GXutil.ltrimstr( AV60Cantold, 11, 3));
      if ( isIns( )  && (GXutil.strcmp("", A5725RecLote)==0) && ( AV44Lote01 == 1 ) )
      {
         A5725RecLote = A10881PrdLote ;
         httpContext.ajax_rsp_assign_attri("", false, "A5725RecLote", A5725RecLote);
      }
      A13832CantProduc = (A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13832CantProduc", GXutil.ltrimstr( A13832CantProduc, 12, 2));
      AV53oldRecLote = O5725RecLote ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53oldRecLote", AV53oldRecLote);
      /* Using cursor T01RH10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      h490ForPrdUMe = "" ;
      while ( (pr_default.getStatus(8) != 101) )
      {
         h490ForPrdUMe = T01RH10_A13746ForPrdCDsc[0] ;
         if (true) break;
      }
      pr_default.close(8);
      httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
   }

   public void checkExtendedTable1RH410( )
   {
      nIsDirty_410 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h490ForPrdUMe)==0) )
      {
         nIsDirty_410 = (short)(1) ;
         A490ForPrdUMe = (byte)(0) ;
         n490ForPrdUMe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      }
      else
      {
         A13746ForPrdCDsc = h490ForPrdUMe ;
         /* Using cursor T01RH11 */
         pr_default.execute(9, new Object[] {A13746ForPrdCDsc, A396EmprCod});
         A396EmprCod = T01RH11_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = T01RH11_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T01RH11_n490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         A490ForPrdUMe = T01RH11_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T01RH11_n490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         if ( ! ( (pr_default.getStatus(9) == 101) ) )
         {
            pr_default.readNext(9);
            if ( ! ( (pr_default.getStatus(9) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "FORPRDUME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForPrdUMe_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(9);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
      if ( ( ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) ) && ( GXutil.strcmp(AV52TipodeProceso, "*") != 0 ) )
      {
         nIsDirty_410 = (short)(1) ;
         A686PrdCant = (A431FacCon.multiply(DecimalUtil.doubleToDec(AV58VolumenReceta))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
      }
      else
      {
         if ( ( A490ForPrdUMe == 3 ) && ( GXutil.strcmp(AV52TipodeProceso, "*") != 0 ) )
         {
            nIsDirty_410 = (short)(1) ;
            A686PrdCant = AV51Totaldekilos.multiply(A431FacCon).multiply(DecimalUtil.doubleToDec(AV28Valcos)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
         }
      }
      if ( (GXutil.strcmp("", h490ForPrdUMe)==0) )
      {
         nIsDirty_410 = (short)(1) ;
         A490ForPrdUMe = (byte)(0) ;
         n490ForPrdUMe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      }
      else
      {
         A13746ForPrdCDsc = h490ForPrdUMe ;
         /* Using cursor T01RH12 */
         pr_default.execute(10, new Object[] {A13746ForPrdCDsc, A396EmprCod});
         A396EmprCod = T01RH12_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = T01RH12_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T01RH12_n490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         A490ForPrdUMe = T01RH12_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T01RH12_n490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         if ( ! ( (pr_default.getStatus(10) == 101) ) )
         {
            pr_default.readNext(10);
            if ( ! ( (pr_default.getStatus(10) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "FORPRDUME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForPrdUMe_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(10);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
      /* Using cursor T01RH5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (0==A490ForPrdUMe) && (GXutil.strcmp("", A13746ForPrdCDsc)==0) || (0==A490ForPrdUMe) && n490ForPrdUMe || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A488ForPrdDsc = T01RH5_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01RH5_n488ForPrdDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      pr_default.close(3);
      /* Using cursor T01RH7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A872RecPrdNum});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A874RecPrdFind = T01RH7_A874RecPrdFind[0] ;
         n874RecPrdFind = T01RH7_n874RecPrdFind[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", A874RecPrdFind);
      }
      else
      {
         nIsDirty_410 = (short)(1) ;
         A874RecPrdFind = "xxxxxx" ;
         n874RecPrdFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", A874RecPrdFind);
      }
      pr_default.close(5);
      if ( ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") == 0 ) && ! (GXutil.strcmp("", A872RecPrdNum)==0) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto Inexistente", ""), 1, "RECPRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 )
      {
         nIsDirty_410 = (short)(1) ;
         GXt_char1 = A13897RecPrdDscf ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         mantenimientoderecetasregistro_impl.this.A396EmprCod = GXv_char4[0] ;
         mantenimientoderecetasregistro_impl.this.A872RecPrdNum = GXv_char3[0] ;
         mantenimientoderecetasregistro_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         A13897RecPrdDscf = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13897RecPrdDscf", A13897RecPrdDscf);
      }
      else
      {
         nIsDirty_410 = (short)(1) ;
         A13897RecPrdDscf = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A13897RecPrdDscf", A13897RecPrdDscf);
      }
      /* Using cursor T01RH6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CRECET", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECLINPRO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
      if ( isIns( )  && (0==A811RecLin) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se debe de entrar Numero Linea", ""), 1, "RECLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV25Insert_PrdNum)==0) )
      {
         nIsDirty_410 = (short)(1) ;
         A719PrdNum = AV25Insert_PrdNum ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      else
      {
         if ( true /* After */ && ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 ) && isIns( )  )
         {
            nIsDirty_410 = (short)(1) ;
            A719PrdNum = A872RecPrdNum ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         }
      }
      if ( true /* After */ && ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 ) )
      {
         nIsDirty_410 = (short)(1) ;
         A875RecPrdDsc = A13897RecPrdDscf ;
         httpContext.ajax_rsp_assign_attri("", false, "A875RecPrdDsc", A875RecPrdDsc);
      }
      if ( (GXutil.strcmp("", A872RecPrdNum)==0) && ( A431FacCon.doubleValue() > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Accion No permitida. NO hay PRODUCTO", ""), 1, "RECPRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A872RecPrdNum)==0) && ( A490ForPrdUMe > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Accion No permitida. NO hay PRODUCTO", ""), 1, "RECPRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) || (0==A490ForPrdUMe) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") <= 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ && ( AV32Err_und == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion no ha entrado UNIDAD=1,2,3", ""), 0, "FORPRDUME");
      }
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") <= 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ && ( AV32Err_und == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion no ha entrado UNIDAD=1,2,3", ""), 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) || ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) || ( A2394RecForNro != O2394RecForNro ) )
      {
         AV27Modif = httpContext.getMessage( "Y", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Modif", AV27Modif);
      }
      nIsDirty_410 = (short)(1) ;
      A238CanRes = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrimstr( A238CanRes, 8, 2));
      AV63CanResold = O238CanRes ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63CanResold", GXutil.ltrimstr( AV63CanResold, 8, 2));
      AV60Cantold = O686PrdCant ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Cantold", GXutil.ltrimstr( AV60Cantold, 11, 3));
      /* Using cursor T01RH4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A704PrdExiAlm = T01RH4_A704PrdExiAlm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A685PrdCanRes = T01RH4_A685PrdCanRes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
      A5418PrdSalM = T01RH4_A5418PrdSalM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", A5418PrdSalM);
      A10881PrdLote = T01RH4_A10881PrdLote[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
      A13232PrdRGB = T01RH4_A13232PrdRGB[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13232PrdRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13232PrdRGB), 10, 0));
      A705PrdExiCC = T01RH4_A705PrdExiCC[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      A707PrdFacCon = T01RH4_A707PrdFacCon[0] ;
      A856ValCod = T01RH4_A856ValCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      pr_default.close(2);
      if ( isIns( )  && (GXutil.strcmp("", A5725RecLote)==0) && ( AV44Lote01 == 1 ) )
      {
         nIsDirty_410 = (short)(1) ;
         A5725RecLote = A10881PrdLote ;
         httpContext.ajax_rsp_assign_attri("", false, "A5725RecLote", A5725RecLote);
      }
      nIsDirty_410 = (short)(1) ;
      A13832CantProduc = (A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13832CantProduc", GXutil.ltrimstr( A13832CantProduc, 12, 2));
      if ( ( A856ValCod == 3 ) && ( ! (GXutil.strcmp("", A719PrdNum)==0) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto no valido", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV53oldRecLote = O5725RecLote ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53oldRecLote", AV53oldRecLote);
   }

   public void closeExtendedTableCursors1RH410( )
   {
      pr_default.close(3);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_68( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T01RH13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (0==A490ForPrdUMe) && (GXutil.strcmp("", A13746ForPrdCDsc)==0) || (0==A490ForPrdUMe) && n490ForPrdUMe || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A488ForPrdDsc = T01RH13_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01RH13_n488ForPrdDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_70( String A396EmprCod ,
                          String A872RecPrdNum )
   {
      /* Using cursor T01RH14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A872RecPrdNum});
      if ( (pr_default.getStatus(12) != 101) )
      {
         A874RecPrdFind = T01RH14_A874RecPrdFind[0] ;
         n874RecPrdFind = T01RH14_n874RecPrdFind[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", A874RecPrdFind);
      }
      else
      {
         A874RecPrdFind = "xxxxxx" ;
         n874RecPrdFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", A874RecPrdFind);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A874RecPrdFind))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_69( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar ,
                          short A2804RecLinMaq ,
                          byte A1273RecLinPro )
   {
      /* Using cursor T01RH15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CRECET", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECLINPRO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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

   public void gxload_67( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01RH16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A704PrdExiAlm = T01RH16_A704PrdExiAlm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A685PrdCanRes = T01RH16_A685PrdCanRes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
      A5418PrdSalM = T01RH16_A5418PrdSalM[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", A5418PrdSalM);
      A10881PrdLote = T01RH16_A10881PrdLote[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
      A13232PrdRGB = T01RH16_A13232PrdRGB[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13232PrdRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13232PrdRGB), 10, 0));
      A705PrdExiCC = T01RH16_A705PrdExiCC[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      A707PrdFacCon = T01RH16_A707PrdFacCon[0] ;
      A856ValCod = T01RH16_A856ValCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5418PrdSalM))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10881PrdLote))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void getKey1RH410( )
   {
      /* Using cursor T01RH17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound410 = (short)(1) ;
      }
      else
      {
         RcdFound410 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01RH3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1RH410( 66) ;
         RcdFound410 = (short)(1) ;
         A811RecLin = T01RH3_A811RecLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
         A5725RecLote = T01RH3_A5725RecLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5725RecLote", A5725RecLote);
         A686PrdCant = T01RH3_A686PrdCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
         A875RecPrdDsc = T01RH3_A875RecPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A875RecPrdDsc", A875RecPrdDsc);
         A872RecPrdNum = T01RH3_A872RecPrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         A431FacCon = T01RH3_A431FacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A431FacCon", GXutil.ltrimstr( A431FacCon, 11, 5));
         A2394RecForNro = T01RH3_A2394RecForNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2394RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2394RecForNro), 2, 0));
         A3274RecPrdTnq = T01RH3_A3274RecPrdTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3274RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3274RecPrdTnq), 2, 0));
         A3938RecCanEns = T01RH3_A3938RecCanEns[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3938RecCanEns", GXutil.ltrimstr( A3938RecCanEns, 10, 5));
         A4024RecMar = T01RH3_A4024RecMar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4024RecMar", GXutil.str( A4024RecMar, 1, 0));
         A5422RecSalMP = T01RH3_A5422RecSalMP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5422RecSalMP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5422RecSalMP), 3, 0));
         A5467RecSalVol = T01RH3_A5467RecSalVol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5467RecSalVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5467RecSalVol), 5, 0));
         A5527RecLinRea = T01RH3_A5527RecLinRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5527RecLinRea", A5527RecLinRea);
         A8934RecPes = T01RH3_A8934RecPes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8934RecPes", GXutil.str( A8934RecPes, 1, 0));
         A8937RecAcc = T01RH3_A8937RecAcc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8937RecAcc", A8937RecAcc);
         A3804RecFecMov = T01RH3_A3804RecFecMov[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3804RecFecMov", localUtil.format(A3804RecFecMov, "99/99/99"));
         A3805RecAnyTie = T01RH3_A3805RecAnyTie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3805RecAnyTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3805RecAnyTie), 4, 0));
         A3806RecUltAny = T01RH3_A3806RecUltAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3806RecUltAny", GXutil.ltrimstr( A3806RecUltAny, 11, 3));
         A3807RecPorAny = T01RH3_A3807RecPorAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3807RecPorAny", GXutil.ltrimstr( A3807RecPorAny, 6, 2));
         A4900PrdCanMac = T01RH3_A4900PrdCanMac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4900PrdCanMac", GXutil.ltrimstr( A4900PrdCanMac, 11, 3));
         A11708RecProv = T01RH3_A11708RecProv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11708RecProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11708RecProv), 6, 0));
         A4576RecLinUsr = T01RH3_A4576RecLinUsr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4576RecLinUsr", A4576RecLinUsr);
         A4577RecPesFec = T01RH3_A4577RecPesFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4577RecPesFec", localUtil.ttoc( A4577RecPesFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12710PrdCantOrg = T01RH3_A12710PrdCantOrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12710PrdCantOrg", GXutil.ltrimstr( A12710PrdCantOrg, 11, 3));
         A12717RecFabId = T01RH3_A12717RecFabId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12717RecFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12717RecFabId), 6, 0));
         A396EmprCod = T01RH3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01RH3_A719PrdNum[0] ;
         n719PrdNum = T01RH3_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A490ForPrdUMe = T01RH3_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T01RH3_n490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         A129BarCod = T01RH3_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RH3_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RH3_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = T01RH3_A2804RecLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         A1273RecLinPro = T01RH3_A1273RecLinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
         O5725RecLote = A5725RecLote ;
         httpContext.ajax_rsp_assign_attri("", false, "A5725RecLote", A5725RecLote);
         O431FacCon = A431FacCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A431FacCon", GXutil.ltrimstr( A431FacCon, 11, 5));
         O686PrdCant = A686PrdCant ;
         httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
         O2394RecForNro = A2394RecForNro ;
         httpContext.ajax_rsp_assign_attri("", false, "A2394RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2394RecForNro), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2804RecLinMaq = A2804RecLinMaq ;
         Z1273RecLinPro = A1273RecLinPro ;
         Z811RecLin = A811RecLin ;
         sMode410 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1RH410( ) ;
         if ( AnyError == 1 )
         {
            RcdFound410 = (short)(0) ;
            initializeNonKey1RH410( ) ;
         }
         Gx_mode = sMode410 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound410 = (short)(0) ;
         initializeNonKey1RH410( ) ;
         sMode410 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode410 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1RH410( ) ;
      if ( RcdFound410 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound410 = (short)(0) ;
      /* Using cursor T01RH18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2804RecLinMaq), Short.valueOf(A2804RecLinMaq), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A1273RecLinPro), Byte.valueOf(A1273RecLinPro), Short.valueOf(A2804RecLinMaq), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A811RecLin)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01RH18_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RH18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH18_A129BarCod[0] < A129BarCod ) || ( T01RH18_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH18_A132BarCodReo[0] < A132BarCodReo ) || ( T01RH18_A132BarCodReo[0] == A132BarCodReo ) && ( T01RH18_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RH18_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01RH18_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RH18_A132BarCodReo[0] == A132BarCodReo ) && ( T01RH18_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH18_A2804RecLinMaq[0] < A2804RecLinMaq ) || ( T01RH18_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01RH18_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RH18_A132BarCodReo[0] == A132BarCodReo ) && ( T01RH18_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH18_A1273RecLinPro[0] < A1273RecLinPro ) || ( T01RH18_A1273RecLinPro[0] == A1273RecLinPro ) && ( T01RH18_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01RH18_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RH18_A132BarCodReo[0] == A132BarCodReo ) && ( T01RH18_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH18_A811RecLin[0] < A811RecLin ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01RH18_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RH18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH18_A129BarCod[0] > A129BarCod ) || ( T01RH18_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH18_A132BarCodReo[0] > A132BarCodReo ) || ( T01RH18_A132BarCodReo[0] == A132BarCodReo ) && ( T01RH18_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH18_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RH18_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01RH18_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RH18_A132BarCodReo[0] == A132BarCodReo ) && ( T01RH18_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH18_A2804RecLinMaq[0] > A2804RecLinMaq ) || ( T01RH18_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01RH18_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RH18_A132BarCodReo[0] == A132BarCodReo ) && ( T01RH18_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH18_A1273RecLinPro[0] > A1273RecLinPro ) || ( T01RH18_A1273RecLinPro[0] == A1273RecLinPro ) && ( T01RH18_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01RH18_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RH18_A132BarCodReo[0] == A132BarCodReo ) && ( T01RH18_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH18_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH18_A811RecLin[0] > A811RecLin ) ) )
         {
            A396EmprCod = T01RH18_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01RH18_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01RH18_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01RH18_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2804RecLinMaq = T01RH18_A2804RecLinMaq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            A1273RecLinPro = T01RH18_A1273RecLinPro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
            A811RecLin = T01RH18_A811RecLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
            RcdFound410 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void move_previous( )
   {
      RcdFound410 = (short)(0) ;
      /* Using cursor T01RH19 */
      pr_default.execute(17, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2804RecLinMaq), Short.valueOf(A2804RecLinMaq), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A1273RecLinPro), Byte.valueOf(A1273RecLinPro), Short.valueOf(A2804RecLinMaq), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A811RecLin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01RH19_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RH19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH19_A129BarCod[0] > A129BarCod ) || ( T01RH19_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH19_A132BarCodReo[0] > A132BarCodReo ) || ( T01RH19_A132BarCodReo[0] == A132BarCodReo ) && ( T01RH19_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH19_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RH19_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01RH19_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RH19_A132BarCodReo[0] == A132BarCodReo ) && ( T01RH19_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH19_A2804RecLinMaq[0] > A2804RecLinMaq ) || ( T01RH19_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01RH19_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RH19_A132BarCodReo[0] == A132BarCodReo ) && ( T01RH19_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH19_A1273RecLinPro[0] > A1273RecLinPro ) || ( T01RH19_A1273RecLinPro[0] == A1273RecLinPro ) && ( T01RH19_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01RH19_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RH19_A132BarCodReo[0] == A132BarCodReo ) && ( T01RH19_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH19_A811RecLin[0] > A811RecLin ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01RH19_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RH19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH19_A129BarCod[0] < A129BarCod ) || ( T01RH19_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH19_A132BarCodReo[0] < A132BarCodReo ) || ( T01RH19_A132BarCodReo[0] == A132BarCodReo ) && ( T01RH19_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH19_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RH19_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01RH19_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RH19_A132BarCodReo[0] == A132BarCodReo ) && ( T01RH19_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH19_A2804RecLinMaq[0] < A2804RecLinMaq ) || ( T01RH19_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01RH19_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RH19_A132BarCodReo[0] == A132BarCodReo ) && ( T01RH19_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH19_A1273RecLinPro[0] < A1273RecLinPro ) || ( T01RH19_A1273RecLinPro[0] == A1273RecLinPro ) && ( T01RH19_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01RH19_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RH19_A132BarCodReo[0] == A132BarCodReo ) && ( T01RH19_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RH19_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RH19_A811RecLin[0] < A811RecLin ) ) )
         {
            A396EmprCod = T01RH19_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01RH19_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01RH19_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01RH19_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2804RecLinMaq = T01RH19_A2804RecLinMaq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            A1273RecLinPro = T01RH19_A1273RecLinPro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
            A811RecLin = T01RH19_A811RecLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
            RcdFound410 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1RH410( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtRecLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1RH410( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound410 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) || ( A1273RecLinPro != Z1273RecLinPro ) || ( A811RecLin != Z811RecLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A2804RecLinMaq = Z2804RecLinMaq ;
               httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
               A1273RecLinPro = Z1273RecLinPro ;
               httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
               A811RecLin = Z811RecLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtRecLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1RH410( ) ;
               GX_FocusControl = edtRecLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) || ( A1273RecLinPro != Z1273RecLinPro ) || ( A811RecLin != Z811RecLin ) )
            {
               /* Insert record */
               GX_FocusControl = edtRecLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1RH410( ) ;
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
                  GX_FocusControl = edtRecLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1RH410( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) || ( A1273RecLinPro != Z1273RecLinPro ) || ( A811RecLin != Z811RecLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = Z2804RecLinMaq ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         A1273RecLinPro = Z1273RecLinPro ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
         A811RecLin = Z811RecLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtRecLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1RH410( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h490ForPrdUMe)==0) )
         {
            A490ForPrdUMe = (byte)(0) ;
            n490ForPrdUMe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         }
         else
         {
            A13746ForPrdCDsc = h490ForPrdUMe ;
            /* Using cursor T01RH20 */
            pr_default.execute(18, new Object[] {A13746ForPrdCDsc, A396EmprCod});
            A396EmprCod = T01RH20_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A490ForPrdUMe = T01RH20_A490ForPrdUMe[0] ;
            n490ForPrdUMe = T01RH20_n490ForPrdUMe[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
            A490ForPrdUMe = T01RH20_A490ForPrdUMe[0] ;
            n490ForPrdUMe = T01RH20_n490ForPrdUMe[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
            if ( ! ( (pr_default.getStatus(18) == 101) ) )
            {
               pr_default.readNext(18);
               if ( ! ( (pr_default.getStatus(18) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "FORPRDUME");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtForPrdUMe_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(18);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01RH2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLRECET"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z5725RecLote, T01RH2_A5725RecLote[0]) != 0 ) || ( DecimalUtil.compareTo(Z686PrdCant, T01RH2_A686PrdCant[0]) != 0 ) || ( GXutil.strcmp(Z875RecPrdDsc, T01RH2_A875RecPrdDsc[0]) != 0 ) || ( GXutil.strcmp(Z872RecPrdNum, T01RH2_A872RecPrdNum[0]) != 0 ) || ( DecimalUtil.compareTo(Z431FacCon, T01RH2_A431FacCon[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z2394RecForNro != T01RH2_A2394RecForNro[0] ) || ( Z3274RecPrdTnq != T01RH2_A3274RecPrdTnq[0] ) || ( DecimalUtil.compareTo(Z3938RecCanEns, T01RH2_A3938RecCanEns[0]) != 0 ) || ( Z4024RecMar != T01RH2_A4024RecMar[0] ) || ( Z5422RecSalMP != T01RH2_A5422RecSalMP[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5467RecSalVol != T01RH2_A5467RecSalVol[0] ) || ( GXutil.strcmp(Z5527RecLinRea, T01RH2_A5527RecLinRea[0]) != 0 ) || ( Z8934RecPes != T01RH2_A8934RecPes[0] ) || ( GXutil.strcmp(Z8937RecAcc, T01RH2_A8937RecAcc[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z3804RecFecMov), GXutil.resetTime(T01RH2_A3804RecFecMov[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3805RecAnyTie != T01RH2_A3805RecAnyTie[0] ) || ( DecimalUtil.compareTo(Z3806RecUltAny, T01RH2_A3806RecUltAny[0]) != 0 ) || ( DecimalUtil.compareTo(Z3807RecPorAny, T01RH2_A3807RecPorAny[0]) != 0 ) || ( DecimalUtil.compareTo(Z4900PrdCanMac, T01RH2_A4900PrdCanMac[0]) != 0 ) || ( Z11708RecProv != T01RH2_A11708RecProv[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4576RecLinUsr, T01RH2_A4576RecLinUsr[0]) != 0 ) || !( GXutil.dateCompare(Z4577RecPesFec, T01RH2_A4577RecPesFec[0]) ) || ( DecimalUtil.compareTo(Z12710PrdCantOrg, T01RH2_A12710PrdCantOrg[0]) != 0 ) || ( Z12717RecFabId != T01RH2_A12717RecFabId[0] ) || ( GXutil.strcmp(Z719PrdNum, T01RH2_A719PrdNum[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z490ForPrdUMe != T01RH2_A490ForPrdUMe[0] ) )
         {
            if ( GXutil.strcmp(Z5725RecLote, T01RH2_A5725RecLote[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecLote");
               GXutil.writeLogRaw("Old: ",Z5725RecLote);
               GXutil.writeLogRaw("Current: ",T01RH2_A5725RecLote[0]);
            }
            if ( DecimalUtil.compareTo(Z686PrdCant, T01RH2_A686PrdCant[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"PrdCant");
               GXutil.writeLogRaw("Old: ",Z686PrdCant);
               GXutil.writeLogRaw("Current: ",T01RH2_A686PrdCant[0]);
            }
            if ( GXutil.strcmp(Z875RecPrdDsc, T01RH2_A875RecPrdDsc[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecPrdDsc");
               GXutil.writeLogRaw("Old: ",Z875RecPrdDsc);
               GXutil.writeLogRaw("Current: ",T01RH2_A875RecPrdDsc[0]);
            }
            if ( GXutil.strcmp(Z872RecPrdNum, T01RH2_A872RecPrdNum[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecPrdNum");
               GXutil.writeLogRaw("Old: ",Z872RecPrdNum);
               GXutil.writeLogRaw("Current: ",T01RH2_A872RecPrdNum[0]);
            }
            if ( DecimalUtil.compareTo(Z431FacCon, T01RH2_A431FacCon[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"FacCon");
               GXutil.writeLogRaw("Old: ",Z431FacCon);
               GXutil.writeLogRaw("Current: ",T01RH2_A431FacCon[0]);
            }
            if ( Z2394RecForNro != T01RH2_A2394RecForNro[0] )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecForNro");
               GXutil.writeLogRaw("Old: ",Z2394RecForNro);
               GXutil.writeLogRaw("Current: ",T01RH2_A2394RecForNro[0]);
            }
            if ( Z3274RecPrdTnq != T01RH2_A3274RecPrdTnq[0] )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecPrdTnq");
               GXutil.writeLogRaw("Old: ",Z3274RecPrdTnq);
               GXutil.writeLogRaw("Current: ",T01RH2_A3274RecPrdTnq[0]);
            }
            if ( DecimalUtil.compareTo(Z3938RecCanEns, T01RH2_A3938RecCanEns[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecCanEns");
               GXutil.writeLogRaw("Old: ",Z3938RecCanEns);
               GXutil.writeLogRaw("Current: ",T01RH2_A3938RecCanEns[0]);
            }
            if ( Z4024RecMar != T01RH2_A4024RecMar[0] )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecMar");
               GXutil.writeLogRaw("Old: ",Z4024RecMar);
               GXutil.writeLogRaw("Current: ",T01RH2_A4024RecMar[0]);
            }
            if ( Z5422RecSalMP != T01RH2_A5422RecSalMP[0] )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecSalMP");
               GXutil.writeLogRaw("Old: ",Z5422RecSalMP);
               GXutil.writeLogRaw("Current: ",T01RH2_A5422RecSalMP[0]);
            }
            if ( Z5467RecSalVol != T01RH2_A5467RecSalVol[0] )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecSalVol");
               GXutil.writeLogRaw("Old: ",Z5467RecSalVol);
               GXutil.writeLogRaw("Current: ",T01RH2_A5467RecSalVol[0]);
            }
            if ( GXutil.strcmp(Z5527RecLinRea, T01RH2_A5527RecLinRea[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecLinRea");
               GXutil.writeLogRaw("Old: ",Z5527RecLinRea);
               GXutil.writeLogRaw("Current: ",T01RH2_A5527RecLinRea[0]);
            }
            if ( Z8934RecPes != T01RH2_A8934RecPes[0] )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecPes");
               GXutil.writeLogRaw("Old: ",Z8934RecPes);
               GXutil.writeLogRaw("Current: ",T01RH2_A8934RecPes[0]);
            }
            if ( GXutil.strcmp(Z8937RecAcc, T01RH2_A8937RecAcc[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecAcc");
               GXutil.writeLogRaw("Old: ",Z8937RecAcc);
               GXutil.writeLogRaw("Current: ",T01RH2_A8937RecAcc[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3804RecFecMov), GXutil.resetTime(T01RH2_A3804RecFecMov[0])) ) )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecFecMov");
               GXutil.writeLogRaw("Old: ",Z3804RecFecMov);
               GXutil.writeLogRaw("Current: ",T01RH2_A3804RecFecMov[0]);
            }
            if ( Z3805RecAnyTie != T01RH2_A3805RecAnyTie[0] )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecAnyTie");
               GXutil.writeLogRaw("Old: ",Z3805RecAnyTie);
               GXutil.writeLogRaw("Current: ",T01RH2_A3805RecAnyTie[0]);
            }
            if ( DecimalUtil.compareTo(Z3806RecUltAny, T01RH2_A3806RecUltAny[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecUltAny");
               GXutil.writeLogRaw("Old: ",Z3806RecUltAny);
               GXutil.writeLogRaw("Current: ",T01RH2_A3806RecUltAny[0]);
            }
            if ( DecimalUtil.compareTo(Z3807RecPorAny, T01RH2_A3807RecPorAny[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecPorAny");
               GXutil.writeLogRaw("Old: ",Z3807RecPorAny);
               GXutil.writeLogRaw("Current: ",T01RH2_A3807RecPorAny[0]);
            }
            if ( DecimalUtil.compareTo(Z4900PrdCanMac, T01RH2_A4900PrdCanMac[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"PrdCanMac");
               GXutil.writeLogRaw("Old: ",Z4900PrdCanMac);
               GXutil.writeLogRaw("Current: ",T01RH2_A4900PrdCanMac[0]);
            }
            if ( Z11708RecProv != T01RH2_A11708RecProv[0] )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecProv");
               GXutil.writeLogRaw("Old: ",Z11708RecProv);
               GXutil.writeLogRaw("Current: ",T01RH2_A11708RecProv[0]);
            }
            if ( GXutil.strcmp(Z4576RecLinUsr, T01RH2_A4576RecLinUsr[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecLinUsr");
               GXutil.writeLogRaw("Old: ",Z4576RecLinUsr);
               GXutil.writeLogRaw("Current: ",T01RH2_A4576RecLinUsr[0]);
            }
            if ( !( GXutil.dateCompare(Z4577RecPesFec, T01RH2_A4577RecPesFec[0]) ) )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecPesFec");
               GXutil.writeLogRaw("Old: ",Z4577RecPesFec);
               GXutil.writeLogRaw("Current: ",T01RH2_A4577RecPesFec[0]);
            }
            if ( DecimalUtil.compareTo(Z12710PrdCantOrg, T01RH2_A12710PrdCantOrg[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"PrdCantOrg");
               GXutil.writeLogRaw("Old: ",Z12710PrdCantOrg);
               GXutil.writeLogRaw("Current: ",T01RH2_A12710PrdCantOrg[0]);
            }
            if ( Z12717RecFabId != T01RH2_A12717RecFabId[0] )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"RecFabId");
               GXutil.writeLogRaw("Old: ",Z12717RecFabId);
               GXutil.writeLogRaw("Current: ",T01RH2_A12717RecFabId[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01RH2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01RH2_A719PrdNum[0]);
            }
            if ( Z490ForPrdUMe != T01RH2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("mantenimientoderecetasregistro:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T01RH2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLRECET"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RH410( )
   {
      beforeValidate1RH410( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RH410( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RH410( 0) ;
         checkOptimisticConcurrency1RH410( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RH410( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RH410( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RH21 */
                  pr_default.execute(19, new Object[] {Short.valueOf(A811RecLin), A5725RecLote, A686PrdCant, A875RecPrdDsc, A872RecPrdNum, A431FacCon, Byte.valueOf(A2394RecForNro), Byte.valueOf(A3274RecPrdTnq), A3938RecCanEns, Byte.valueOf(A4024RecMar), Short.valueOf(A5422RecSalMP), Integer.valueOf(A5467RecSalVol), A5527RecLinRea, Byte.valueOf(A8934RecPes), A8937RecAcc, A3804RecFecMov, Short.valueOf(A3805RecAnyTie), A3806RecUltAny, A3807RecPorAny, A4900PrdCanMac, Integer.valueOf(A11708RecProv), A4576RecLinUsr, A4577RecPesFec, A12710PrdCantOrg, Integer.valueOf(A12717RecFabId), A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
                  if ( (pr_default.getStatus(19) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A5725RecLote, O5725RecLote) != 0 ) )
                     {
                        AV56Inc_obs = httpContext.getMessage( httpContext.getMessage( "Cambio Lote.Linea = ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( ", Producto ", ""), "") + GXutil.trim( A872RecPrdNum) + " " + GXutil.trim( A875RecPrdDsc) + httpContext.getMessage( httpContext.getMessage( " ,Lote ", ""), "") + GXutil.trim( O5725RecLote) + httpContext.getMessage( httpContext.getMessage( " , se cambia por, ", ""), "") + GXutil.trim( A5725RecLote) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV56Inc_obs", AV56Inc_obs);
                     }
                     if ( true /* After */ && ! (GXutil.strcmp("", A872RecPrdNum)==0) )
                     {
                        AV61Inc_obs1 = httpContext.getMessage( httpContext.getMessage( "Receta Tinte: Alta Linea ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( " Prd.", ""), "") + GXutil.trim( A872RecPrdNum) + httpContext.getMessage( httpContext.getMessage( ", Cantidad: ", ""), "") + GXutil.trim( GXutil.str( A686PrdCant, 11, 3)) + httpContext.getMessage( httpContext.getMessage( ", Factor: ", ""), "") + GXutil.trim( GXutil.str( A431FacCon, 11, 5)) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV61Inc_obs1", AV61Inc_obs1);
                     }
                     else
                     {
                        if ( true /* After */ && (GXutil.strcmp("", A872RecPrdNum)==0) )
                        {
                           AV61Inc_obs1 = httpContext.getMessage( httpContext.getMessage( "Receta Tinte: Alta Linea ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( " Prd.", ""), "") + GXutil.trim( A872RecPrdNum) + httpContext.getMessage( httpContext.getMessage( " Desc.", ""), "") + GXutil.trim( A875RecPrdDsc) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV61Inc_obs1", AV61Inc_obs1);
                        }
                     }
                     if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A5725RecLote, O5725RecLote) != 0 ) )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV64Pgmname, 1, 10), AV50UsurCod, AV48Station, AV56Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV64Pgmname, 1, 10), AV50UsurCod, AV48Station, AV61Inc_obs1, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1RH0( ) ;
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
            load1RH410( ) ;
         }
         endLevel1RH410( ) ;
      }
      closeExtendedTableCursors1RH410( ) ;
   }

   public void update1RH410( )
   {
      beforeValidate1RH410( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RH410( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RH410( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RH410( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1RH410( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RH22 */
                  pr_default.execute(20, new Object[] {A5725RecLote, A686PrdCant, A875RecPrdDsc, A872RecPrdNum, A431FacCon, Byte.valueOf(A2394RecForNro), Byte.valueOf(A3274RecPrdTnq), A3938RecCanEns, Byte.valueOf(A4024RecMar), Short.valueOf(A5422RecSalMP), Integer.valueOf(A5467RecSalVol), A5527RecLinRea, Byte.valueOf(A8934RecPes), A8937RecAcc, A3804RecFecMov, Short.valueOf(A3805RecAnyTie), A3806RecUltAny, A3807RecPorAny, A4900PrdCanMac, Integer.valueOf(A11708RecProv), A4576RecLinUsr, A4577RecPesFec, A12710PrdCantOrg, Integer.valueOf(A12717RecFabId), Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
                  if ( (pr_default.getStatus(20) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLRECET"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1RH410( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A5725RecLote, O5725RecLote) != 0 ) )
                     {
                        AV56Inc_obs = httpContext.getMessage( httpContext.getMessage( "Cambio Lote.Linea = ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( ", Producto ", ""), "") + GXutil.trim( A872RecPrdNum) + " " + GXutil.trim( A875RecPrdDsc) + httpContext.getMessage( httpContext.getMessage( " ,Lote ", ""), "") + GXutil.trim( O5725RecLote) + httpContext.getMessage( httpContext.getMessage( " , se cambia por, ", ""), "") + GXutil.trim( A5725RecLote) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV56Inc_obs", AV56Inc_obs);
                     }
                     if ( true /* After */ && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) )
                     {
                        AV61Inc_obs1 = httpContext.getMessage( httpContext.getMessage( "Receta Tinte Factor: Linea ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( " Prd.", ""), "") + GXutil.trim( A872RecPrdNum) + httpContext.getMessage( httpContext.getMessage( ", Old:", ""), "") + GXutil.trim( GXutil.str( O431FacCon, 11, 5)) + httpContext.getMessage( httpContext.getMessage( ", New: ", ""), "") + GXutil.trim( GXutil.str( A431FacCon, 11, 5)) + httpContext.getMessage( httpContext.getMessage( ", Old Cnt:", ""), "") + GXutil.trim( GXutil.str( O686PrdCant, 11, 3)) + httpContext.getMessage( httpContext.getMessage( ", New Cnt: ", ""), "") + GXutil.trim( GXutil.str( A686PrdCant, 11, 3)) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV61Inc_obs1", AV61Inc_obs1);
                     }
                     if ( true /* After */ && ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) == 0 ) )
                     {
                        AV62Inc_obs2 = httpContext.getMessage( httpContext.getMessage( "Receta Tinte Cantidad: Linea ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( " Prd.", ""), "") + GXutil.trim( A872RecPrdNum) + httpContext.getMessage( httpContext.getMessage( ", Old: ", ""), "") + GXutil.trim( GXutil.str( O686PrdCant, 11, 3)) + httpContext.getMessage( httpContext.getMessage( ", New: ", ""), "") + GXutil.trim( GXutil.str( A686PrdCant, 11, 3)) + httpContext.getMessage( httpContext.getMessage( ", Old Factor:", ""), "") + GXutil.trim( GXutil.str( O431FacCon, 11, 5)) + httpContext.getMessage( httpContext.getMessage( ", New Factor: ", ""), "") + GXutil.trim( GXutil.str( A431FacCon, 11, 5)) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV62Inc_obs2", AV62Inc_obs2);
                     }
                     if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A5725RecLote, O5725RecLote) != 0 ) )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV64Pgmname, 1, 10), AV50UsurCod, AV48Station, AV56Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                     }
                     if ( true /* After */ && ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) == 0 ) )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV64Pgmname, 1, 10), AV50UsurCod, AV48Station, AV62Inc_obs2, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                     }
                     if ( true /* After */ && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV64Pgmname, 1, 10), AV50UsurCod, AV48Station, AV61Inc_obs1, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                     }
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
         endLevel1RH410( ) ;
      }
      closeExtendedTableCursors1RH410( ) ;
   }

   public void deferredUpdate1RH410( )
   {
   }

   public void delete( )
   {
      beforeValidate1RH410( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RH410( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RH410( ) ;
         afterConfirm1RH410( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RH410( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01RH23 */
               pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* After */ )
                  {
                     AV27Modif = httpContext.getMessage( "Y", "") ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV27Modif", AV27Modif);
                  }
                  if ( true /* After */ )
                  {
                     AV61Inc_obs1 = httpContext.getMessage( httpContext.getMessage( "Linea Eliminada ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( " Prd. ", ""), "") + GXutil.trim( A872RecPrdNum) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV61Inc_obs1", AV61Inc_obs1);
                  }
                  if ( true /* After */ || true /* After */ )
                  {
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV64Pgmname, 1, 10), AV50UsurCod, AV48Station, AV61Inc_obs1, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                  }
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
      sMode410 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RH410( ) ;
      Gx_mode = sMode410 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RH410( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && (0==A811RecLin) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Se debe de entrar Numero Linea", ""), 1, "RECLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") == 0 ) && ! (GXutil.strcmp("", A872RecPrdNum)==0) && isIns( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto Inexistente", ""), 1, "RECPRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecPrdNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T01RH24 */
         pr_default.execute(22, new Object[] {A396EmprCod, A872RecPrdNum});
         if ( (pr_default.getStatus(22) != 101) )
         {
            A874RecPrdFind = T01RH24_A874RecPrdFind[0] ;
            n874RecPrdFind = T01RH24_n874RecPrdFind[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", A874RecPrdFind);
         }
         else
         {
            A874RecPrdFind = "xxxxxx" ;
            n874RecPrdFind = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", A874RecPrdFind);
         }
         pr_default.close(22);
         if ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 )
         {
            GXt_char1 = A13897RecPrdDscf ;
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A872RecPrdNum ;
            GXv_char2[0] = GXt_char1 ;
            new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            mantenimientoderecetasregistro_impl.this.A396EmprCod = GXv_char4[0] ;
            mantenimientoderecetasregistro_impl.this.A872RecPrdNum = GXv_char3[0] ;
            mantenimientoderecetasregistro_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
            A13897RecPrdDscf = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A13897RecPrdDscf", A13897RecPrdDscf);
         }
         else
         {
            A13897RecPrdDscf = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "A13897RecPrdDscf", A13897RecPrdDscf);
         }
         /* Using cursor T01RH25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01RH25_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01RH25_n488ForPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         pr_default.close(23);
         A238CanRes = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrimstr( A238CanRes, 8, 2));
         AV63CanResold = O238CanRes ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63CanResold", GXutil.ltrimstr( AV63CanResold, 8, 2));
         AV60Cantold = O686PrdCant ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Cantold", GXutil.ltrimstr( AV60Cantold, 11, 3));
         if ( ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) || ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) || ( A2394RecForNro != O2394RecForNro ) )
         {
            AV27Modif = httpContext.getMessage( "Y", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Modif", AV27Modif);
         }
         /* Using cursor T01RH26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         A704PrdExiAlm = T01RH26_A704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A685PrdCanRes = T01RH26_A685PrdCanRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         A5418PrdSalM = T01RH26_A5418PrdSalM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", A5418PrdSalM);
         A10881PrdLote = T01RH26_A10881PrdLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
         A13232PrdRGB = T01RH26_A13232PrdRGB[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13232PrdRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13232PrdRGB), 10, 0));
         A705PrdExiCC = T01RH26_A705PrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         A707PrdFacCon = T01RH26_A707PrdFacCon[0] ;
         A856ValCod = T01RH26_A856ValCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         pr_default.close(24);
         A13832CantProduc = (A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13832CantProduc", GXutil.ltrimstr( A13832CantProduc, 12, 2));
         AV53oldRecLote = O5725RecLote ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53oldRecLote", AV53oldRecLote);
      }
   }

   public void endLevel1RH410( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1RH410( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientoderecetasregistro");
         if ( AnyError == 0 )
         {
            confirmValues1RH0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "mantenimientoderecetasregistro");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RH410( )
   {
      /* Scan By routine */
      /* Using cursor T01RH27 */
      pr_default.execute(25);
      RcdFound410 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound410 = (short)(1) ;
         A396EmprCod = T01RH27_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01RH27_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RH27_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RH27_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = T01RH27_A2804RecLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         A1273RecLinPro = T01RH27_A1273RecLinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
         A811RecLin = T01RH27_A811RecLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RH410( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound410 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound410 = (short)(1) ;
         A396EmprCod = T01RH27_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01RH27_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RH27_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RH27_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = T01RH27_A2804RecLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         A1273RecLinPro = T01RH27_A1273RecLinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
         A811RecLin = T01RH27_A811RecLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
      }
   }

   public void scanEnd1RH410( )
   {
      pr_default.close(25);
   }

   public void afterConfirm1RH410( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") <= 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ && ( AV32Err_und == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion no ha entrado UNIDAD=1,2,3", ""), 0, "RECPRDNUM");
      }
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") <= 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ && ( AV32Err_und == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion no ha entrado UNIDAD=1,2,3", ""), 1, "RECPRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "0") == 0 ) && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_decimal11[0] = AV60Cantold ;
         GXv_decimal10[0] = A686PrdCant ;
         GXv_decimal12[0] = AV51Totaldekilos ;
         GXv_int6[0] = AV58VolumenReceta ;
         GXv_int13[0] = AV28Valcos ;
         GXv_int8[0] = A490ForPrdUMe ;
         new app.preclin0(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal11, GXv_decimal10, GXv_decimal12, GXv_int6, GXv_int13, GXv_int8) ;
         mantenimientoderecetasregistro_impl.this.A396EmprCod = GXv_char4[0] ;
         mantenimientoderecetasregistro_impl.this.A872RecPrdNum = GXv_char3[0] ;
         mantenimientoderecetasregistro_impl.this.AV60Cantold = GXv_decimal11[0] ;
         mantenimientoderecetasregistro_impl.this.A686PrdCant = GXv_decimal10[0] ;
         mantenimientoderecetasregistro_impl.this.AV51Totaldekilos = GXv_decimal12[0] ;
         mantenimientoderecetasregistro_impl.this.AV58VolumenReceta = GXv_int6[0] ;
         mantenimientoderecetasregistro_impl.this.AV28Valcos = (short)((short)(GXv_int13[0])) ;
         mantenimientoderecetasregistro_impl.this.A490ForPrdUMe = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV60Cantold", GXutil.ltrimstr( AV60Cantold, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV51Totaldekilos", GXutil.ltrimstr( AV51Totaldekilos, 10, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV58VolumenReceta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58VolumenReceta), 5, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV28Valcos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Valcos), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      }
      if ( ( ! (GXutil.strcmp("", A719PrdNum)==0) ) && ( ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) || ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) && true /* After */ ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_decimal12[0] = A704PrdExiAlm ;
         GXv_decimal11[0] = A685PrdCanRes ;
         GXv_decimal10[0] = A686PrdCant ;
         GXv_decimal14[0] = A705PrdExiCC ;
         GXv_decimal15[0] = AV60Cantold ;
         GXv_int8[0] = (byte)(AV35AlmCC) ;
         GXv_char2[0] = AV57msgErr ;
         new app.pctrlcant(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal12, GXv_decimal11, GXv_decimal10, GXv_decimal14, GXv_decimal15, GXv_int8, GXv_char2) ;
         mantenimientoderecetasregistro_impl.this.A396EmprCod = GXv_char4[0] ;
         mantenimientoderecetasregistro_impl.this.A872RecPrdNum = GXv_char3[0] ;
         mantenimientoderecetasregistro_impl.this.A704PrdExiAlm = GXv_decimal12[0] ;
         mantenimientoderecetasregistro_impl.this.A685PrdCanRes = GXv_decimal11[0] ;
         mantenimientoderecetasregistro_impl.this.A686PrdCant = GXv_decimal10[0] ;
         mantenimientoderecetasregistro_impl.this.A705PrdExiCC = GXv_decimal14[0] ;
         mantenimientoderecetasregistro_impl.this.AV60Cantold = GXv_decimal15[0] ;
         mantenimientoderecetasregistro_impl.this.AV35AlmCC = GXv_int8[0] ;
         mantenimientoderecetasregistro_impl.this.AV57msgErr = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         httpContext.ajax_rsp_assign_attri("", false, "AV60Cantold", GXutil.ltrimstr( AV60Cantold, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV35AlmCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35AlmCC), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV57msgErr", AV57msgErr);
      }
      if ( ( AV45EliminarReceta == 1 ) && ! (GXutil.strcmp("", AV57msgErr)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.", "")+AV57msgErr, 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert1RH410( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RH410( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RH410( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RH410( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RH410( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RH410( )
   {
      edtavProfordsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProfordsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProfordsc_Enabled), 5, 0), true);
      edtavModif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModif_Enabled), 5, 0), true);
      edtavModo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModo_Enabled), 5, 0), true);
      edtavTotaldekilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotaldekilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotaldekilos_Enabled), 5, 0), true);
      edtavVolumenreceta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVolumenreceta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVolumenreceta_Enabled), 5, 0), true);
      edtRecLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLin_Enabled), 5, 0), true);
      edtRecPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdNum_Enabled), 5, 0), true);
      edtRecPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDsc_Enabled), 5, 0), true);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), true);
      edtFacCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCon_Enabled), 5, 0), true);
      edtPrdCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Enabled), 5, 0), true);
      edtRecForNro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecForNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecForNro_Enabled), 5, 0), true);
      edtRecPrdTnq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdTnq_Enabled), 5, 0), true);
      edtRecPrdFind_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdFind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdFind_Enabled), 5, 0), true);
      edtRecPrdDscf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDscf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDscf_Enabled), 5, 0), true);
      edtCanRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCanRes_Enabled), 5, 0), true);
      edtavCanresold_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCanresold_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCanresold_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtRecLinMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMaq_Enabled), 5, 0), true);
      edtRecLinPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinPro_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtValCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValCod_Enabled), 5, 0), true);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), true);
      edtPrdCanRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), true);
      edtRecCanEns_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecCanEns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecCanEns_Enabled), 5, 0), true);
      edtRecMar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMar_Enabled), 5, 0), true);
      edtRecSalMP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecSalMP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecSalMP_Enabled), 5, 0), true);
      edtPrdSalM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdSalM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdSalM_Enabled), 5, 0), true);
      edtRecSalVol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecSalVol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecSalVol_Enabled), 5, 0), true);
      edtRecLinRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinRea_Enabled), 5, 0), true);
      edtRecLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLote_Enabled), 5, 0), true);
      edtRecPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPes_Enabled), 5, 0), true);
      edtRecAcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecAcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecAcc_Enabled), 5, 0), true);
      edtRecFecMov_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFecMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFecMov_Enabled), 5, 0), true);
      edtRecAnyTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecAnyTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecAnyTie_Enabled), 5, 0), true);
      edtRecUltAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecUltAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecUltAny_Enabled), 5, 0), true);
      edtRecPorAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPorAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPorAny_Enabled), 5, 0), true);
      edtPrdCanMac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanMac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanMac_Enabled), 5, 0), true);
      edtRecProv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecProv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecProv_Enabled), 5, 0), true);
      edtPrdLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLote_Enabled), 5, 0), true);
      edtRecLinUsr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinUsr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinUsr_Enabled), 5, 0), true);
      edtRecPesFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPesFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPesFec_Enabled), 5, 0), true);
      edtPrdCantOrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCantOrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCantOrg_Enabled), 5, 0), true);
      edtRecFabId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFabId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFabId_Enabled), 5, 0), true);
      edtPrdRGB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRGB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRGB_Enabled), 5, 0), true);
      edtCantProduc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCantProduc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCantProduc_Enabled), 5, 0), true);
      edtPrdExiCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), true);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), true);
      edtavValcos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValcos_Enabled), 5, 0), true);
      edtavModif2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModif2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModif2_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1RH410( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18ProForDsc, ""))));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1RH0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientoderecetasregistro", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV9RecLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8RecLinPro,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7RecLin,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV14TotKgs)),GXutil.URLEncode(GXutil.ltrimstr(AV15Volumen,5,0)),GXutil.URLEncode(GXutil.formatDateParm(AV16FecPan)),GXutil.URLEncode(GXutil.rtrim(AV17Barnhdr)),GXutil.URLEncode(GXutil.rtrim(AV18ProForDsc)),GXutil.URLEncode(GXutil.rtrim(AV19Proforfab)),GXutil.URLEncode(GXutil.rtrim(AV20Modif2))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","RecLinPro","RecLin","TotKgs","Volumen","FecPan","Barnhdr","ProForDsc","Proforfab","Modif2"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18ProForDsc, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MantenimientodeRecetasRegistro");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientoderecetasregistro:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z2804RecLinMaq", GXutil.ltrim( localUtil.ntoc( Z2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1273RecLinPro", GXutil.ltrim( localUtil.ntoc( Z1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z811RecLin", GXutil.ltrim( localUtil.ntoc( Z811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5725RecLote", GXutil.rtrim( Z5725RecLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z686PrdCant", GXutil.ltrim( localUtil.ntoc( Z686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z875RecPrdDsc", GXutil.rtrim( Z875RecPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z872RecPrdNum", GXutil.rtrim( Z872RecPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z431FacCon", GXutil.ltrim( localUtil.ntoc( Z431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2394RecForNro", GXutil.ltrim( localUtil.ntoc( Z2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3274RecPrdTnq", GXutil.ltrim( localUtil.ntoc( Z3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3938RecCanEns", GXutil.ltrim( localUtil.ntoc( Z3938RecCanEns, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4024RecMar", GXutil.ltrim( localUtil.ntoc( Z4024RecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5422RecSalMP", GXutil.ltrim( localUtil.ntoc( Z5422RecSalMP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5467RecSalVol", GXutil.ltrim( localUtil.ntoc( Z5467RecSalVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5527RecLinRea", GXutil.rtrim( Z5527RecLinRea));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8934RecPes", GXutil.ltrim( localUtil.ntoc( Z8934RecPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8937RecAcc", GXutil.rtrim( Z8937RecAcc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3804RecFecMov", localUtil.dtoc( Z3804RecFecMov, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3805RecAnyTie", GXutil.ltrim( localUtil.ntoc( Z3805RecAnyTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3806RecUltAny", GXutil.ltrim( localUtil.ntoc( Z3806RecUltAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3807RecPorAny", GXutil.ltrim( localUtil.ntoc( Z3807RecPorAny, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4900PrdCanMac", GXutil.ltrim( localUtil.ntoc( Z4900PrdCanMac, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11708RecProv", GXutil.ltrim( localUtil.ntoc( Z11708RecProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4576RecLinUsr", GXutil.rtrim( Z4576RecLinUsr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4577RecPesFec", localUtil.ttoc( Z4577RecPesFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12710PrdCantOrg", GXutil.ltrim( localUtil.ntoc( Z12710PrdCantOrg, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12717RecFabId", GXutil.ltrim( localUtil.ntoc( Z12717RecFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5725RecLote", GXutil.rtrim( O5725RecLote));
      app.GxWebStd.gx_hidden_field( httpContext, "O431FacCon", GXutil.ltrim( localUtil.ntoc( O431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O686PrdCant", GXutil.ltrim( localUtil.ntoc( O686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O238CanRes", GXutil.ltrim( localUtil.ntoc( O238CanRes, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2394RecForNro", GXutil.ltrim( localUtil.ntoc( O2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N719PrdNum", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "N5725RecLote", GXutil.rtrim( A5725RecLote));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTKGS", GXutil.ltrim( localUtil.ntoc( AV14TotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGS", getSecureSignedToken( "", localUtil.format( AV14TotKgs, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLUMEN", GXutil.ltrim( localUtil.ntoc( AV15Volumen, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLUMEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15Volumen), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECPAN", localUtil.dtoc( AV16FecPan, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECPAN", getSecureSignedToken( "", AV16FecPan));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARNHDR", GXutil.rtrim( AV17Barnhdr));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNHDR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17Barnhdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROFORFAB", GXutil.rtrim( AV19Proforfab));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORFAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19Proforfab, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCFORPRDUME", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFACCON", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV13EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV12BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV11BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV10BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV9RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9RecLinMaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINPRO", GXutil.ltrim( localUtil.ntoc( AV8RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINPRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8RecLinPro), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLIN", GXutil.ltrim( localUtil.ntoc( AV7RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7RecLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FORPRDUME", GXutil.ltrim( localUtil.ntoc( AV24Insert_ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PRDNUM", GXutil.rtrim( AV25Insert_PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTEMALHA", GXutil.ltrim( localUtil.ntoc( AV40Artemalha, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLOTE01", GXutil.ltrim( localUtil.ntoc( AV44Lote01, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDRECLOTE", GXutil.rtrim( AV53oldRecLote));
      app.GxWebStd.gx_hidden_field( httpContext, "vCANTOLD", GXutil.ltrim( localUtil.ntoc( AV60Cantold, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPODEPROCESO", GXutil.rtrim( AV52TipodeProceso));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS1", AV61Inc_obs1);
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS2", AV62Inc_obs2);
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV56Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vMSGERR", AV57msgErr);
      app.GxWebStd.gx_hidden_field( httpContext, "vALMCC", GXutil.ltrim( localUtil.ntoc( AV35AlmCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vERR_UND", GXutil.ltrim( localUtil.ntoc( AV32Err_und, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vELIMINARRECETA", GXutil.ltrim( localUtil.ntoc( AV45EliminarReceta, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV64Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV50UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV48Station));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Enabled", GXutil.booltostr( Dvpanel_unnamedtable1_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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
      return formatLink("app.mantenimientoderecetasregistro", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV9RecLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8RecLinPro,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7RecLin,4,0)),GXutil.URLEncode(DecimalUtil.decToString(AV14TotKgs)),GXutil.URLEncode(GXutil.ltrimstr(AV15Volumen,5,0)),GXutil.URLEncode(GXutil.formatDateParm(AV16FecPan)),GXutil.URLEncode(GXutil.rtrim(AV17Barnhdr)),GXutil.URLEncode(GXutil.rtrim(AV18ProForDsc)),GXutil.URLEncode(GXutil.rtrim(AV19Proforfab)),GXutil.URLEncode(GXutil.rtrim(AV20Modif2))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","RecLinPro","RecLin","TotKgs","Volumen","FecPan","Barnhdr","ProForDsc","Proforfab","Modif2"})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientodeRecetasRegistro" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento de Recetas (Registro)", "") ;
   }

   public void initializeNonKey1RH410( )
   {
      h490ForPrdUMe = "" ;
      A719PrdNum = "" ;
      n719PrdNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A5725RecLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5725RecLote", A5725RecLote);
      AV53oldRecLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53oldRecLote", AV53oldRecLote);
      AV60Cantold = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Cantold", GXutil.ltrimstr( AV60Cantold, 11, 3));
      AV63CanResold = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63CanResold", GXutil.ltrimstr( AV63CanResold, 8, 2));
      A686PrdCant = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
      A875RecPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A875RecPrdDsc", A875RecPrdDsc);
      AV61Inc_obs1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Inc_obs1", AV61Inc_obs1);
      AV62Inc_obs2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62Inc_obs2", AV62Inc_obs2);
      AV56Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Inc_obs", AV56Inc_obs);
      A238CanRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrimstr( A238CanRes, 8, 2));
      A13832CantProduc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A13832CantProduc", GXutil.ltrimstr( A13832CantProduc, 12, 2));
      A874RecPrdFind = "" ;
      n874RecPrdFind = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", A874RecPrdFind);
      A13897RecPrdDscf = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13897RecPrdDscf", A13897RecPrdDscf);
      A872RecPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      A431FacCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A431FacCon", GXutil.ltrimstr( A431FacCon, 11, 5));
      A2394RecForNro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2394RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2394RecForNro), 2, 0));
      A3274RecPrdTnq = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3274RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3274RecPrdTnq), 2, 0));
      A856ValCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      A704PrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A685PrdCanRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
      A3938RecCanEns = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3938RecCanEns", GXutil.ltrimstr( A3938RecCanEns, 10, 5));
      A4024RecMar = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4024RecMar", GXutil.str( A4024RecMar, 1, 0));
      A5422RecSalMP = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5422RecSalMP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5422RecSalMP), 3, 0));
      A5418PrdSalM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", A5418PrdSalM);
      A5467RecSalVol = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5467RecSalVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5467RecSalVol), 5, 0));
      A5527RecLinRea = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5527RecLinRea", A5527RecLinRea);
      A8934RecPes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8934RecPes", GXutil.str( A8934RecPes, 1, 0));
      A8937RecAcc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8937RecAcc", A8937RecAcc);
      A3804RecFecMov = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A3804RecFecMov", localUtil.format(A3804RecFecMov, "99/99/99"));
      A3805RecAnyTie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3805RecAnyTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3805RecAnyTie), 4, 0));
      A3806RecUltAny = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3806RecUltAny", GXutil.ltrimstr( A3806RecUltAny, 11, 3));
      A3807RecPorAny = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3807RecPorAny", GXutil.ltrimstr( A3807RecPorAny, 6, 2));
      A4900PrdCanMac = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4900PrdCanMac", GXutil.ltrimstr( A4900PrdCanMac, 11, 3));
      A11708RecProv = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11708RecProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11708RecProv), 6, 0));
      A10881PrdLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
      A4576RecLinUsr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4576RecLinUsr", A4576RecLinUsr);
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A4577RecPesFec", localUtil.ttoc( A4577RecPesFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A12710PrdCantOrg = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12710PrdCantOrg", GXutil.ltrimstr( A12710PrdCantOrg, 11, 3));
      A12717RecFabId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12717RecFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12717RecFabId), 6, 0));
      A13232PrdRGB = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13232PrdRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13232PrdRGB), 10, 0));
      A705PrdExiCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      AV57msgErr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57msgErr", AV57msgErr);
      A707PrdFacCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
      O5725RecLote = A5725RecLote ;
      httpContext.ajax_rsp_assign_attri("", false, "A5725RecLote", A5725RecLote);
      O431FacCon = A431FacCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A431FacCon", GXutil.ltrimstr( A431FacCon, 11, 5));
      O686PrdCant = A686PrdCant ;
      httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
      O238CanRes = A238CanRes ;
      httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrimstr( A238CanRes, 8, 2));
      O2394RecForNro = A2394RecForNro ;
      httpContext.ajax_rsp_assign_attri("", false, "A2394RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2394RecForNro), 2, 0));
      Z5725RecLote = "" ;
      Z686PrdCant = DecimalUtil.ZERO ;
      Z875RecPrdDsc = "" ;
      Z872RecPrdNum = "" ;
      Z431FacCon = DecimalUtil.ZERO ;
      Z2394RecForNro = (byte)(0) ;
      Z3274RecPrdTnq = (byte)(0) ;
      Z3938RecCanEns = DecimalUtil.ZERO ;
      Z4024RecMar = (byte)(0) ;
      Z5422RecSalMP = (short)(0) ;
      Z5467RecSalVol = 0 ;
      Z5527RecLinRea = "" ;
      Z8934RecPes = (byte)(0) ;
      Z8937RecAcc = "" ;
      Z3804RecFecMov = GXutil.nullDate() ;
      Z3805RecAnyTie = (short)(0) ;
      Z3806RecUltAny = DecimalUtil.ZERO ;
      Z3807RecPorAny = DecimalUtil.ZERO ;
      Z4900PrdCanMac = DecimalUtil.ZERO ;
      Z11708RecProv = 0 ;
      Z4576RecLinUsr = "" ;
      Z4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      Z12710PrdCantOrg = DecimalUtil.ZERO ;
      Z12717RecFabId = 0 ;
      Z719PrdNum = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll1RH410( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A2804RecLinMaq = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
      A1273RecLinPro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
      A811RecLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
      initializeNonKey1RH410( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211692933", true, true);
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
      httpContext.AddJavascriptSource("mantenimientoderecetasregistro.js", "?20268211692933", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavProfordsc_Internalname = "vPROFORDSC" ;
      edtavModif_Internalname = "vMODIF" ;
      edtavModo_Internalname = "vMODO" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavTotaldekilos_Internalname = "vTOTALDEKILOS" ;
      edtavVolumenreceta_Internalname = "vVOLUMENRECETA" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtRecLin_Internalname = "RECLIN" ;
      edtRecPrdNum_Internalname = "RECPRDNUM" ;
      edtRecPrdDsc_Internalname = "RECPRDDSC" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtFacCon_Internalname = "FACCON" ;
      edtPrdCant_Internalname = "PRDCANT" ;
      edtRecForNro_Internalname = "RECFORNRO" ;
      edtRecPrdTnq_Internalname = "RECPRDTNQ" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtRecPrdFind_Internalname = "RECPRDFIND" ;
      edtRecPrdDscf_Internalname = "RECPRDDSCF" ;
      edtCanRes_Internalname = "CANRES" ;
      edtavCanresold_Internalname = "vCANRESOLD" ;
      divTablaprovisional_Internalname = "TABLAPROVISIONAL" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtRecLinMaq_Internalname = "RECLINMAQ" ;
      edtRecLinPro_Internalname = "RECLINPRO" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtValCod_Internalname = "VALCOD" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtPrdCanRes_Internalname = "PRDCANRES" ;
      edtRecCanEns_Internalname = "RECCANENS" ;
      edtRecMar_Internalname = "RECMAR" ;
      edtRecSalMP_Internalname = "RECSALMP" ;
      edtPrdSalM_Internalname = "PRDSALM" ;
      edtRecSalVol_Internalname = "RECSALVOL" ;
      edtRecLinRea_Internalname = "RECLINREA" ;
      edtRecLote_Internalname = "RECLOTE" ;
      edtRecPes_Internalname = "RECPES" ;
      edtRecAcc_Internalname = "RECACC" ;
      edtRecFecMov_Internalname = "RECFECMOV" ;
      edtRecAnyTie_Internalname = "RECANYTIE" ;
      edtRecUltAny_Internalname = "RECULTANY" ;
      edtRecPorAny_Internalname = "RECPORANY" ;
      edtPrdCanMac_Internalname = "PRDCANMAC" ;
      edtRecProv_Internalname = "RECPROV" ;
      edtPrdLote_Internalname = "PRDLOTE" ;
      edtRecLinUsr_Internalname = "RECLINUSR" ;
      edtRecPesFec_Internalname = "RECPESFEC" ;
      edtPrdCantOrg_Internalname = "PRDCANTORG" ;
      edtRecFabId_Internalname = "RECFABID" ;
      edtPrdRGB_Internalname = "PRDRGB" ;
      edtCantProduc_Internalname = "CANTPRODUC" ;
      edtPrdExiCC_Internalname = "PRDEXICC" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtavValcos_Internalname = "vVALCOS" ;
      edtavProforlab_Internalname = "vPROFORLAB" ;
      edtavModif2_Internalname = "vMODIF2" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_396_872_875_Internalname = "PROMPT_396_872_875" ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento de Recetas (Registro)", "") );
      edtavModif2_Jsonclick = "" ;
      edtavModif2_Enabled = 0 ;
      edtavModif2_Visible = 1 ;
      edtavProforlab_Jsonclick = "" ;
      edtavProforlab_Enabled = 0 ;
      edtavProforlab_Visible = 1 ;
      edtavValcos_Jsonclick = "" ;
      edtavValcos_Enabled = 0 ;
      edtavValcos_Visible = 1 ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdDsc_Enabled = 0 ;
      edtForPrdDsc_Visible = 1 ;
      edtPrdExiCC_Jsonclick = "" ;
      edtPrdExiCC_Enabled = 0 ;
      edtPrdExiCC_Visible = 1 ;
      edtCantProduc_Jsonclick = "" ;
      edtCantProduc_Enabled = 0 ;
      edtCantProduc_Visible = 1 ;
      edtPrdRGB_Jsonclick = "" ;
      edtPrdRGB_Enabled = 0 ;
      edtPrdRGB_Visible = 1 ;
      edtRecFabId_Jsonclick = "" ;
      edtRecFabId_Enabled = 1 ;
      edtRecFabId_Visible = 1 ;
      edtPrdCantOrg_Jsonclick = "" ;
      edtPrdCantOrg_Enabled = 1 ;
      edtPrdCantOrg_Visible = 1 ;
      edtRecPesFec_Jsonclick = "" ;
      edtRecPesFec_Enabled = 1 ;
      edtRecPesFec_Visible = 1 ;
      edtRecLinUsr_Jsonclick = "" ;
      edtRecLinUsr_Enabled = 1 ;
      edtRecLinUsr_Visible = 1 ;
      edtPrdLote_Jsonclick = "" ;
      edtPrdLote_Enabled = 0 ;
      edtPrdLote_Visible = 1 ;
      edtRecProv_Jsonclick = "" ;
      edtRecProv_Enabled = 1 ;
      edtRecProv_Visible = 1 ;
      edtPrdCanMac_Jsonclick = "" ;
      edtPrdCanMac_Enabled = 1 ;
      edtPrdCanMac_Visible = 1 ;
      edtRecPorAny_Jsonclick = "" ;
      edtRecPorAny_Enabled = 1 ;
      edtRecPorAny_Visible = 1 ;
      edtRecUltAny_Jsonclick = "" ;
      edtRecUltAny_Enabled = 1 ;
      edtRecUltAny_Visible = 1 ;
      edtRecAnyTie_Jsonclick = "" ;
      edtRecAnyTie_Enabled = 1 ;
      edtRecAnyTie_Visible = 1 ;
      edtRecFecMov_Jsonclick = "" ;
      edtRecFecMov_Enabled = 1 ;
      edtRecFecMov_Visible = 1 ;
      edtRecAcc_Jsonclick = "" ;
      edtRecAcc_Enabled = 1 ;
      edtRecAcc_Visible = 1 ;
      edtRecPes_Jsonclick = "" ;
      edtRecPes_Enabled = 1 ;
      edtRecPes_Visible = 1 ;
      edtRecLote_Jsonclick = "" ;
      edtRecLote_Enabled = 1 ;
      edtRecLote_Visible = 1 ;
      edtRecLinRea_Jsonclick = "" ;
      edtRecLinRea_Enabled = 1 ;
      edtRecLinRea_Visible = 1 ;
      edtRecSalVol_Jsonclick = "" ;
      edtRecSalVol_Enabled = 1 ;
      edtRecSalVol_Visible = 1 ;
      edtPrdSalM_Jsonclick = "" ;
      edtPrdSalM_Enabled = 0 ;
      edtPrdSalM_Visible = 1 ;
      edtRecSalMP_Jsonclick = "" ;
      edtRecSalMP_Enabled = 1 ;
      edtRecSalMP_Visible = 1 ;
      edtRecMar_Jsonclick = "" ;
      edtRecMar_Enabled = 1 ;
      edtRecMar_Visible = 1 ;
      edtRecCanEns_Jsonclick = "" ;
      edtRecCanEns_Enabled = 1 ;
      edtRecCanEns_Visible = 1 ;
      edtPrdCanRes_Jsonclick = "" ;
      edtPrdCanRes_Enabled = 0 ;
      edtPrdCanRes_Visible = 1 ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdExiAlm_Enabled = 0 ;
      edtPrdExiAlm_Visible = 1 ;
      edtValCod_Jsonclick = "" ;
      edtValCod_Enabled = 0 ;
      edtValCod_Visible = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
      edtPrdNum_Visible = 1 ;
      edtRecLinPro_Jsonclick = "" ;
      edtRecLinPro_Enabled = 1 ;
      edtRecLinPro_Visible = 1 ;
      edtRecLinMaq_Jsonclick = "" ;
      edtRecLinMaq_Enabled = 1 ;
      edtRecLinMaq_Visible = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodPar_Visible = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCodReo_Visible = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
      edtBarCod_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtavCanresold_Jsonclick = "" ;
      edtavCanresold_Enabled = 0 ;
      edtCanRes_Jsonclick = "" ;
      edtCanRes_Enabled = 0 ;
      edtRecPrdDscf_Jsonclick = "" ;
      edtRecPrdDscf_Enabled = 0 ;
      edtRecPrdFind_Jsonclick = "" ;
      edtRecPrdFind_Enabled = 0 ;
      edtRecPrdTnq_Jsonclick = "" ;
      edtRecPrdTnq_Enabled = 1 ;
      edtRecForNro_Jsonclick = "" ;
      edtRecForNro_Enabled = 1 ;
      edtPrdCant_Jsonclick = "" ;
      edtPrdCant_Enabled = 1 ;
      edtFacCon_Jsonclick = "" ;
      edtFacCon_Enabled = 1 ;
      edtForPrdUMe_Jsonclick = "" ;
      edtForPrdUMe_Enabled = 1 ;
      imgprompt_396_872_875_Visible = 1 ;
      imgprompt_396_872_875_Link = "" ;
      edtRecPrdDsc_Jsonclick = "" ;
      edtRecPrdDsc_Enabled = 1 ;
      edtRecPrdNum_Jsonclick = "" ;
      edtRecPrdNum_Enabled = 1 ;
      edtRecLin_Jsonclick = "" ;
      edtRecLin_Enabled = 1 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "Informacion del registro", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      edtavVolumenreceta_Jsonclick = "" ;
      edtavVolumenreceta_Enabled = 0 ;
      edtavTotaldekilos_Jsonclick = "" ;
      edtavTotaldekilos_Enabled = 0 ;
      edtavModo_Jsonclick = "" ;
      edtavModo_Enabled = 0 ;
      edtavModif_Jsonclick = "" ;
      edtavModif_Enabled = 0 ;
      edtavProfordsc_Jsonclick = "" ;
      edtavProfordsc_Enabled = 0 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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

   public void gxsgaforprdume1RH0( String A396EmprCod ,
                                   String A13746ForPrdCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaforprdume_data1RH0( A396EmprCod, A13746ForPrdCDsc) ;
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

   protected void gxsgaforprdume_data1RH0( String A396EmprCod ,
                                           String A13746ForPrdCDsc )
   {
      l13746ForPrdCDsc = GXutil.concat( GXutil.rtrim( A13746ForPrdCDsc), "%", "") ;
      /* Using cursor T01RH28 */
      pr_default.execute(26, new Object[] {A396EmprCod, l13746ForPrdCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(26) != 101) )
      {
         gxdynajaxctrlcodr.add(T01RH28_A13746ForPrdCDsc[0]);
         gxdynajaxctrldescr.add(T01RH28_A13746ForPrdCDsc[0]);
         pr_default.readNext(26);
      }
      pr_default.close(26);
   }

   public void gxhcaforprdume1RH410( String A396EmprCod ,
                                     String A13746ForPrdCDsc )
   {
      /* Using cursor T01RH29 */
      pr_default.execute(27, new Object[] {A13746ForPrdCDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(27) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13746ForPrdCDsc = T01RH29_A13746ForPrdCDsc[0] ;
         A396EmprCod = T01RH29_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = T01RH29_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T01RH29_n490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         pr_default.readNext(27);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(27);
   }

   public void gx4asarecprddscf1RH410( String A874RecPrdFind ,
                                       String A396EmprCod ,
                                       String A872RecPrdNum )
   {
      if ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 )
      {
         GXt_char1 = A13897RecPrdDscf ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         mantenimientoderecetasregistro_impl.this.A396EmprCod = GXv_char4[0] ;
         mantenimientoderecetasregistro_impl.this.A872RecPrdNum = GXv_char3[0] ;
         mantenimientoderecetasregistro_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         A13897RecPrdDscf = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13897RecPrdDscf", A13897RecPrdDscf);
      }
      else
      {
         A13897RecPrdDscf = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A13897RecPrdDscf", A13897RecPrdDscf);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13897RecPrdDscf))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_50_1RH410( String A396EmprCod ,
                             String A872RecPrdNum ,
                             java.math.BigDecimal A704PrdExiAlm ,
                             java.math.BigDecimal A685PrdCanRes ,
                             java.math.BigDecimal A686PrdCant ,
                             java.math.BigDecimal A705PrdExiCC ,
                             java.math.BigDecimal AV60Cantold ,
                             short AV35AlmCC ,
                             String AV57msgErr ,
                             String A719PrdNum ,
                             java.math.BigDecimal A431FacCon )
   {
      if ( ( ! (GXutil.strcmp("", A719PrdNum)==0) ) && ( ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) || ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) && true /* After */ ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_decimal15[0] = A704PrdExiAlm ;
         GXv_decimal14[0] = A685PrdCanRes ;
         GXv_decimal12[0] = A686PrdCant ;
         GXv_decimal11[0] = A705PrdExiCC ;
         GXv_decimal10[0] = AV60Cantold ;
         GXv_int8[0] = (byte)(AV35AlmCC) ;
         GXv_char2[0] = AV57msgErr ;
         new app.pctrlcant(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal15, GXv_decimal14, GXv_decimal12, GXv_decimal11, GXv_decimal10, GXv_int8, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A872RecPrdNum = GXv_char3[0] ;
         A704PrdExiAlm = GXv_decimal15[0] ;
         A685PrdCanRes = GXv_decimal14[0] ;
         A686PrdCant = GXv_decimal12[0] ;
         A705PrdExiCC = GXv_decimal11[0] ;
         AV60Cantold = GXv_decimal10[0] ;
         AV35AlmCC = GXv_int8[0] ;
         AV57msgErr = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         httpContext.ajax_rsp_assign_attri("", false, "AV60Cantold", GXutil.ltrimstr( AV60Cantold, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV35AlmCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35AlmCC), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV57msgErr", AV57msgErr);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A872RecPrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV60Cantold, (byte)(11), (byte)(3), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV35AlmCC, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV57msgErr)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_51_1RH410( String A396EmprCod ,
                             String A872RecPrdNum ,
                             java.math.BigDecimal AV60Cantold ,
                             java.math.BigDecimal A686PrdCant ,
                             java.math.BigDecimal AV51Totaldekilos ,
                             int AV58VolumenReceta ,
                             short AV28Valcos ,
                             byte A490ForPrdUMe ,
                             java.math.BigDecimal A431FacCon )
   {
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "0") == 0 ) && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_decimal15[0] = AV60Cantold ;
         GXv_decimal14[0] = A686PrdCant ;
         GXv_decimal12[0] = AV51Totaldekilos ;
         GXv_int13[0] = AV58VolumenReceta ;
         GXv_int6[0] = AV28Valcos ;
         GXv_int8[0] = A490ForPrdUMe ;
         new app.preclin0(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal15, GXv_decimal14, GXv_decimal12, GXv_int13, GXv_int6, GXv_int8) ;
         A396EmprCod = GXv_char4[0] ;
         A872RecPrdNum = GXv_char3[0] ;
         AV60Cantold = GXv_decimal15[0] ;
         A686PrdCant = GXv_decimal14[0] ;
         AV51Totaldekilos = GXv_decimal12[0] ;
         AV58VolumenReceta = GXv_int13[0] ;
         AV28Valcos = (short)((short)(GXv_int6[0])) ;
         A490ForPrdUMe = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV60Cantold", GXutil.ltrimstr( AV60Cantold, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV51Totaldekilos", GXutil.ltrimstr( AV51Totaldekilos, 10, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV58VolumenReceta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58VolumenReceta), 5, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV28Valcos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Valcos), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A872RecPrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV60Cantold, (byte)(11), (byte)(3), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV51Totaldekilos, (byte)(10), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV58VolumenReceta, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV28Valcos, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_62_1RH410( )
   {
      if ( true /* After */ || true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV64Pgmname, 1, 10), AV50UsurCod, AV48Station, AV61Inc_obs1, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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

   public void xc_63_1RH410( )
   {
      if ( true /* After */ && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV64Pgmname, 1, 10), AV50UsurCod, AV48Station, AV61Inc_obs1, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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

   public void xc_64_1RH410( )
   {
      if ( true /* After */ && ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) == 0 ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV64Pgmname, 1, 10), AV50UsurCod, AV48Station, AV62Inc_obs2, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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

   public void xc_65_1RH410( )
   {
      if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A5725RecLote, O5725RecLote) != 0 ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV64Pgmname, 1, 10), AV50UsurCod, AV48Station, AV56Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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

   public void valid_Reclinpro( )
   {
      /* Using cursor T01RH30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CRECET", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECLINPRO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(28);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Recprdnum( )
   {
      n874RecPrdFind = false ;
      n719PrdNum = false ;
      /* Using cursor T01RH31 */
      pr_default.execute(29, new Object[] {A396EmprCod, A872RecPrdNum});
      if ( (pr_default.getStatus(29) != 101) )
      {
         A874RecPrdFind = T01RH31_A874RecPrdFind[0] ;
         n874RecPrdFind = T01RH31_n874RecPrdFind[0] ;
      }
      else
      {
         A874RecPrdFind = "xxxxxx" ;
         n874RecPrdFind = false ;
      }
      pr_default.close(29);
      if ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 )
      {
         GXt_char1 = A13897RecPrdDscf ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         mantenimientoderecetasregistro_impl.this.A396EmprCod = GXv_char4[0] ;
         mantenimientoderecetasregistro_impl.this.A872RecPrdNum = GXv_char3[0] ;
         mantenimientoderecetasregistro_impl.this.GXt_char1 = GXv_char2[0] ;
         A13897RecPrdDscf = GXt_char1 ;
      }
      else
      {
         A13897RecPrdDscf = "" ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV25Insert_PrdNum)==0) )
      {
         A719PrdNum = AV25Insert_PrdNum ;
         n719PrdNum = false ;
      }
      else
      {
         if ( true /* After */ && ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 ) && isIns( )  )
         {
            A719PrdNum = A872RecPrdNum ;
            n719PrdNum = false ;
         }
      }
      if ( true /* After */ && ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 ) )
      {
         A875RecPrdDsc = A13897RecPrdDscf ;
      }
      if ( ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") == 0 ) && ! (GXutil.strcmp("", A872RecPrdNum)==0) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto Inexistente", ""), 1, "RECPRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecPrdNum_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", GXutil.rtrim( A874RecPrdFind));
      httpContext.ajax_rsp_assign_attri("", false, "A13897RecPrdDscf", GXutil.rtrim( A13897RecPrdDscf));
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", GXutil.rtrim( A719PrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "A875RecPrdDsc", GXutil.rtrim( A875RecPrdDsc));
   }

   public void valid_Forprdume( )
   {
      n490ForPrdUMe = false ;
      n488ForPrdDsc = false ;
      if ( (GXutil.strcmp("", h490ForPrdUMe)==0) )
      {
         A490ForPrdUMe = (byte)(0) ;
         n490ForPrdUMe = false ;
      }
      else
      {
         A13746ForPrdCDsc = h490ForPrdUMe ;
         /* Using cursor T01RH32 */
         pr_default.execute(30, new Object[] {A13746ForPrdCDsc, A396EmprCod});
         A396EmprCod = T01RH32_A396EmprCod[0] ;
         A490ForPrdUMe = T01RH32_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T01RH32_n490ForPrdUMe[0] ;
         A490ForPrdUMe = T01RH32_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T01RH32_n490ForPrdUMe[0] ;
         if ( ! ( (pr_default.getStatus(30) == 101) ) )
         {
            pr_default.readNext(30);
            if ( ! ( (pr_default.getStatus(30) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "FORPRDUME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForPrdUMe_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(30);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
      /* Using cursor T01RH33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         if ( ! ( (0==A490ForPrdUMe) && (GXutil.strcmp("", A13746ForPrdCDsc)==0) || (0==A490ForPrdUMe) && n490ForPrdUMe || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A488ForPrdDsc = T01RH33_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01RH33_n488ForPrdDsc[0] ;
      pr_default.close(31);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) || (0==A490ForPrdUMe) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") <= 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ && ( AV32Err_und == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion no ha entrado UNIDAD=1,2,3", ""), 0, "FORPRDUME");
      }
      if ( (GXutil.strcmp("", A872RecPrdNum)==0) && ( A490ForPrdUMe > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Accion No permitida. NO hay PRODUCTO", ""), 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") <= 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ && ( AV32Err_und == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion no ha entrado UNIDAD=1,2,3", ""), 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
      httpContext.ajax_rsp_assign_attri("", false, "h490ForPrdUMe", h490ForPrdUMe);
   }

   public void valid_Prdcant( )
   {
      A238CanRes = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      AV63CanResold = O238CanRes ;
      AV60Cantold = O686PrdCant ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrim( localUtil.ntoc( A238CanRes, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV63CanResold", GXutil.ltrim( localUtil.ntoc( AV63CanResold, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV60Cantold", GXutil.ltrim( localUtil.ntoc( AV60Cantold, (byte)(11), (byte)(3), ".", "")));
   }

   public void valid_Prdnum( )
   {
      n719PrdNum = false ;
      /* Using cursor T01RH34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(32) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A704PrdExiAlm = T01RH34_A704PrdExiAlm[0] ;
      A685PrdCanRes = T01RH34_A685PrdCanRes[0] ;
      A5418PrdSalM = T01RH34_A5418PrdSalM[0] ;
      A10881PrdLote = T01RH34_A10881PrdLote[0] ;
      A13232PrdRGB = T01RH34_A13232PrdRGB[0] ;
      A705PrdExiCC = T01RH34_A705PrdExiCC[0] ;
      A707PrdFacCon = T01RH34_A707PrdFacCon[0] ;
      A856ValCod = T01RH34_A856ValCod[0] ;
      pr_default.close(32);
      A13832CantProduc = (A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      if ( ( A856ValCod == 3 ) && ( ! (GXutil.strcmp("", A719PrdNum)==0) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto no valido", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", GXutil.rtrim( A5418PrdSalM));
      httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", GXutil.rtrim( A10881PrdLote));
      httpContext.ajax_rsp_assign_attri("", false, "A13232PrdRGB", GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13832CantProduc", GXutil.ltrim( localUtil.ntoc( A13832CantProduc, (byte)(12), (byte)(2), ".", "")));
   }

   public void valid_Reclote( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A5725RecLote)==0) && ( AV44Lote01 == 1 ) )
      {
         A5725RecLote = A10881PrdLote ;
      }
      AV53oldRecLote = O5725RecLote ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5725RecLote", GXutil.rtrim( A5725RecLote));
      httpContext.ajax_rsp_assign_attri("", false, "AV53oldRecLote", GXutil.rtrim( AV53oldRecLote));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV12BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV9RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV8RecLinPro',fld:'vRECLINPRO',pic:'Z9',hsh:true},{av:'AV7RecLin',fld:'vRECLIN',pic:'ZZZ9',hsh:true},{av:'AV14TotKgs',fld:'vTOTKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV15Volumen',fld:'vVOLUMEN',pic:'ZZZZ9',hsh:true},{av:'AV16FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV17Barnhdr',fld:'vBARNHDR',pic:'',hsh:true},{av:'AV18ProForDsc',fld:'vPROFORDSC',pic:'',hsh:true},{av:'AV19Proforfab',fld:'vPROFORFAB',pic:'',hsh:true},{av:'AV20Modif2',fld:'vMODIF2',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV14TotKgs',fld:'vTOTKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV15Volumen',fld:'vVOLUMEN',pic:'ZZZZ9',hsh:true},{av:'AV16FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV17Barnhdr',fld:'vBARNHDR',pic:'',hsh:true},{av:'AV19Proforfab',fld:'vPROFORFAB',pic:'',hsh:true},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV12BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV9RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV8RecLinPro',fld:'vRECLINPRO',pic:'Z9',hsh:true},{av:'AV7RecLin',fld:'vRECLIN',pic:'ZZZ9',hsh:true},{av:'AV18ProForDsc',fld:'vPROFORDSC',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121RH2',iparms:[{av:'AV27Modif',fld:'vMODIF',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'A238CanRes',fld:'CANRES',pic:'ZZZZ9.99'},{av:'AV63CanResold',fld:'vCANRESOLD',pic:'ZZZZ9.99'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'AV20Modif2',fld:'vMODIF2',pic:''},{av:'A238CanRes',fld:'CANRES',pic:'ZZZZ9.99'},{av:'AV63CanResold',fld:'vCANRESOLD',pic:'ZZZZ9.99'},{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]}");
      setEventMetadata("VALIDV_TOTALDEKILOS","{handler:'validv_Totaldekilos',iparms:[]");
      setEventMetadata("VALIDV_TOTALDEKILOS",",oparms:[]}");
      setEventMetadata("VALIDV_VOLUMENRECETA","{handler:'validv_Volumenreceta',iparms:[]");
      setEventMetadata("VALIDV_VOLUMENRECETA",",oparms:[]}");
      setEventMetadata("VALID_RECLIN","{handler:'valid_Reclin',iparms:[]");
      setEventMetadata("VALID_RECLIN",",oparms:[]}");
      setEventMetadata("VALID_RECPRDNUM","{handler:'valid_Recprdnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'A874RecPrdFind',fld:'RECPRDFIND',pic:''},{av:'A13897RecPrdDscf',fld:'RECPRDDSCF',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A875RecPrdDsc',fld:'RECPRDDSC',pic:''}]");
      setEventMetadata("VALID_RECPRDNUM",",oparms:[{av:'A874RecPrdFind',fld:'RECPRDFIND',pic:''},{av:'A13897RecPrdDscf',fld:'RECPRDDSCF',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A875RecPrdDsc',fld:'RECPRDDSC',pic:''}]}");
      setEventMetadata("VALID_RECPRDDSC","{handler:'valid_Recprddsc',iparms:[]");
      setEventMetadata("VALID_RECPRDDSC",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'h490ForPrdUMe'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'h490ForPrdUMe'}]}");
      setEventMetadata("VALID_FACCON","{handler:'valid_Faccon',iparms:[]");
      setEventMetadata("VALID_FACCON",",oparms:[]}");
      setEventMetadata("VALID_PRDCANT","{handler:'valid_Prdcant',iparms:[{av:'O686PrdCant'},{av:'O238CanRes'},{av:'A686PrdCant',fld:'PRDCANT',pic:'ZZZZZZ9.999'},{av:'A238CanRes',fld:'CANRES',pic:'ZZZZ9.99'},{av:'AV63CanResold',fld:'vCANRESOLD',pic:'ZZZZ9.99'},{av:'AV60Cantold',fld:'vCANTOLD',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("VALID_PRDCANT",",oparms:[{av:'A238CanRes',fld:'CANRES',pic:'ZZZZ9.99'},{av:'AV63CanResold',fld:'vCANRESOLD',pic:'ZZZZ9.99'},{av:'AV60Cantold',fld:'vCANTOLD',pic:'ZZZZZZ9.999'}]}");
      setEventMetadata("VALID_RECFORNRO","{handler:'valid_Recfornro',iparms:[]");
      setEventMetadata("VALID_RECFORNRO",",oparms:[]}");
      setEventMetadata("VALID_RECPRDFIND","{handler:'valid_Recprdfind',iparms:[]");
      setEventMetadata("VALID_RECPRDFIND",",oparms:[]}");
      setEventMetadata("VALID_CANRES","{handler:'valid_Canres',iparms:[]");
      setEventMetadata("VALID_CANRES",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_RECLINMAQ","{handler:'valid_Reclinmaq',iparms:[]");
      setEventMetadata("VALID_RECLINMAQ",",oparms:[]}");
      setEventMetadata("VALID_RECLINPRO","{handler:'valid_Reclinpro',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'}]");
      setEventMetadata("VALID_RECLINPRO",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A686PrdCant',fld:'PRDCANT',pic:'ZZZZZZ9.999'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A10881PrdLote',fld:'PRDLOTE',pic:''},{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A13832CantProduc',fld:'CANTPRODUC',pic:'ZZZZZZZZ9.99'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A10881PrdLote',fld:'PRDLOTE',pic:''},{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A13832CantProduc',fld:'CANTPRODUC',pic:'ZZZZZZZZ9.99'}]}");
      setEventMetadata("VALID_VALCOD","{handler:'valid_Valcod',iparms:[]");
      setEventMetadata("VALID_VALCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDEXIALM","{handler:'valid_Prdexialm',iparms:[]");
      setEventMetadata("VALID_PRDEXIALM",",oparms:[]}");
      setEventMetadata("VALID_PRDCANRES","{handler:'valid_Prdcanres',iparms:[]");
      setEventMetadata("VALID_PRDCANRES",",oparms:[]}");
      setEventMetadata("VALID_RECLOTE","{handler:'valid_Reclote',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'O5725RecLote'},{av:'A10881PrdLote',fld:'PRDLOTE',pic:''},{av:'A5725RecLote',fld:'RECLOTE',pic:''},{av:'AV44Lote01',fld:'vLOTE01',pic:'ZZZ9'},{av:'AV53oldRecLote',fld:'vOLDRECLOTE',pic:''}]");
      setEventMetadata("VALID_RECLOTE",",oparms:[{av:'A5725RecLote',fld:'RECLOTE',pic:''},{av:'AV53oldRecLote',fld:'vOLDRECLOTE',pic:''}]}");
      setEventMetadata("VALID_PRDLOTE","{handler:'valid_Prdlote',iparms:[]");
      setEventMetadata("VALID_PRDLOTE",",oparms:[]}");
      setEventMetadata("VALID_PRDEXICC","{handler:'valid_Prdexicc',iparms:[]");
      setEventMetadata("VALID_PRDEXICC",",oparms:[]}");
      setEventMetadata("VALIDV_VALCOS","{handler:'validv_Valcos',iparms:[]");
      setEventMetadata("VALIDV_VALCOS",",oparms:[]}");
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
      pr_default.close(32);
      pr_default.close(24);
      pr_default.close(31);
      pr_default.close(23);
      pr_default.close(28);
      pr_default.close(29);
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV13EmprCod = "" ;
      wcpOAV10BarCodPar = "" ;
      wcpOAV14TotKgs = DecimalUtil.ZERO ;
      wcpOAV16FecPan = GXutil.nullDate() ;
      wcpOAV17Barnhdr = "" ;
      wcpOAV18ProForDsc = "" ;
      wcpOAV19Proforfab = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z5725RecLote = "" ;
      Z686PrdCant = DecimalUtil.ZERO ;
      Z875RecPrdDsc = "" ;
      Z872RecPrdNum = "" ;
      Z431FacCon = DecimalUtil.ZERO ;
      Z3938RecCanEns = DecimalUtil.ZERO ;
      Z5527RecLinRea = "" ;
      Z8937RecAcc = "" ;
      Z3804RecFecMov = GXutil.nullDate() ;
      Z3806RecUltAny = DecimalUtil.ZERO ;
      Z3807RecPorAny = DecimalUtil.ZERO ;
      Z4900PrdCanMac = DecimalUtil.ZERO ;
      Z4576RecLinUsr = "" ;
      Z4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      Z12710PrdCantOrg = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      O5725RecLote = "" ;
      O431FacCon = DecimalUtil.ZERO ;
      O686PrdCant = DecimalUtil.ZERO ;
      O238CanRes = DecimalUtil.ZERO ;
      N719PrdNum = "" ;
      N5725RecLote = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A872RecPrdNum = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      AV60Cantold = DecimalUtil.ZERO ;
      AV57msgErr = "" ;
      A719PrdNum = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      AV51Totaldekilos = DecimalUtil.ZERO ;
      A13746ForPrdCDsc = "" ;
      h490ForPrdUMe = "" ;
      A874RecPrdFind = "" ;
      A130BarCodPar = "" ;
      Gx_mode = "" ;
      AV13EmprCod = "" ;
      AV10BarCodPar = "" ;
      AV14TotKgs = DecimalUtil.ZERO ;
      AV16FecPan = GXutil.nullDate() ;
      AV17Barnhdr = "" ;
      AV18ProForDsc = "" ;
      AV19Proforfab = "" ;
      AV20Modif2 = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      AV27Modif = "" ;
      AV47Modo = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A875RecPrdDsc = "" ;
      imgprompt_396_872_875_gximage = "" ;
      sImgUrl = "" ;
      A13897RecPrdDscf = "" ;
      A238CanRes = DecimalUtil.ZERO ;
      AV63CanResold = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A3938RecCanEns = DecimalUtil.ZERO ;
      A5418PrdSalM = "" ;
      A5527RecLinRea = "" ;
      A5725RecLote = "" ;
      A8937RecAcc = "" ;
      A3804RecFecMov = GXutil.nullDate() ;
      A3806RecUltAny = DecimalUtil.ZERO ;
      A3807RecPorAny = DecimalUtil.ZERO ;
      A4900PrdCanMac = DecimalUtil.ZERO ;
      A10881PrdLote = "" ;
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A12710PrdCantOrg = DecimalUtil.ZERO ;
      A13832CantProduc = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      AV59ProForLab = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      AV25Insert_PrdNum = "" ;
      AV53oldRecLote = "" ;
      AV52TipodeProceso = "" ;
      AV61Inc_obs1 = "" ;
      AV62Inc_obs2 = "" ;
      AV56Inc_obs = "" ;
      AV64Pgmname = "" ;
      AV50UsurCod = "" ;
      AV48Station = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode410 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV49EmprNom = "" ;
      AV38MsgErrFactor = "" ;
      AV39Conf = "" ;
      AV42NoCantidad = DecimalUtil.ZERO ;
      AV43msg_err1 = "" ;
      AV21WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV23WebSession = httpContext.getWebSession();
      AV26TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z874RecPrdFind = "" ;
      Z488ForPrdDsc = "" ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z685PrdCanRes = DecimalUtil.ZERO ;
      Z5418PrdSalM = "" ;
      Z10881PrdLote = "" ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      T01RH8_A13746ForPrdCDsc = new String[] {""} ;
      T01RH8_A396EmprCod = new String[] {""} ;
      T01RH8_A490ForPrdUMe = new byte[1] ;
      T01RH8_n490ForPrdUMe = new boolean[] {false} ;
      T01RH5_A488ForPrdDsc = new String[] {""} ;
      T01RH5_n488ForPrdDsc = new boolean[] {false} ;
      T01RH9_A811RecLin = new short[1] ;
      T01RH9_A5725RecLote = new String[] {""} ;
      T01RH9_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH9_A875RecPrdDsc = new String[] {""} ;
      T01RH9_A872RecPrdNum = new String[] {""} ;
      T01RH9_A488ForPrdDsc = new String[] {""} ;
      T01RH9_n488ForPrdDsc = new boolean[] {false} ;
      T01RH9_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH9_A2394RecForNro = new byte[1] ;
      T01RH9_A3274RecPrdTnq = new byte[1] ;
      T01RH9_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH9_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH9_A3938RecCanEns = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH9_A4024RecMar = new byte[1] ;
      T01RH9_A5422RecSalMP = new short[1] ;
      T01RH9_A5418PrdSalM = new String[] {""} ;
      T01RH9_A5467RecSalVol = new int[1] ;
      T01RH9_A5527RecLinRea = new String[] {""} ;
      T01RH9_A8934RecPes = new byte[1] ;
      T01RH9_A8937RecAcc = new String[] {""} ;
      T01RH9_A3804RecFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      T01RH9_A3805RecAnyTie = new short[1] ;
      T01RH9_A3806RecUltAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH9_A3807RecPorAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH9_A4900PrdCanMac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH9_A11708RecProv = new int[1] ;
      T01RH9_A10881PrdLote = new String[] {""} ;
      T01RH9_A4576RecLinUsr = new String[] {""} ;
      T01RH9_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01RH9_A12710PrdCantOrg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH9_A12717RecFabId = new int[1] ;
      T01RH9_A13232PrdRGB = new long[1] ;
      T01RH9_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH9_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH9_A396EmprCod = new String[] {""} ;
      T01RH9_A719PrdNum = new String[] {""} ;
      T01RH9_n719PrdNum = new boolean[] {false} ;
      T01RH9_A490ForPrdUMe = new byte[1] ;
      T01RH9_n490ForPrdUMe = new boolean[] {false} ;
      T01RH9_A129BarCod = new int[1] ;
      T01RH9_A132BarCodReo = new byte[1] ;
      T01RH9_A130BarCodPar = new String[] {""} ;
      T01RH9_A2804RecLinMaq = new short[1] ;
      T01RH9_A1273RecLinPro = new byte[1] ;
      T01RH9_A856ValCod = new byte[1] ;
      T01RH9_A874RecPrdFind = new String[] {""} ;
      T01RH9_n874RecPrdFind = new boolean[] {false} ;
      T01RH10_A13746ForPrdCDsc = new String[] {""} ;
      T01RH10_A396EmprCod = new String[] {""} ;
      T01RH10_A490ForPrdUMe = new byte[1] ;
      T01RH10_n490ForPrdUMe = new boolean[] {false} ;
      T01RH11_A13746ForPrdCDsc = new String[] {""} ;
      T01RH11_A396EmprCod = new String[] {""} ;
      T01RH11_A490ForPrdUMe = new byte[1] ;
      T01RH11_n490ForPrdUMe = new boolean[] {false} ;
      T01RH12_A13746ForPrdCDsc = new String[] {""} ;
      T01RH12_A396EmprCod = new String[] {""} ;
      T01RH12_A490ForPrdUMe = new byte[1] ;
      T01RH12_n490ForPrdUMe = new boolean[] {false} ;
      T01RH7_A874RecPrdFind = new String[] {""} ;
      T01RH7_n874RecPrdFind = new boolean[] {false} ;
      T01RH6_A396EmprCod = new String[] {""} ;
      T01RH4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH4_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH4_A5418PrdSalM = new String[] {""} ;
      T01RH4_A10881PrdLote = new String[] {""} ;
      T01RH4_A13232PrdRGB = new long[1] ;
      T01RH4_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH4_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH4_A856ValCod = new byte[1] ;
      T01RH13_A488ForPrdDsc = new String[] {""} ;
      T01RH13_n488ForPrdDsc = new boolean[] {false} ;
      T01RH14_A874RecPrdFind = new String[] {""} ;
      T01RH14_n874RecPrdFind = new boolean[] {false} ;
      T01RH15_A396EmprCod = new String[] {""} ;
      T01RH16_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH16_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH16_A5418PrdSalM = new String[] {""} ;
      T01RH16_A10881PrdLote = new String[] {""} ;
      T01RH16_A13232PrdRGB = new long[1] ;
      T01RH16_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH16_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH16_A856ValCod = new byte[1] ;
      T01RH17_A396EmprCod = new String[] {""} ;
      T01RH17_A129BarCod = new int[1] ;
      T01RH17_A132BarCodReo = new byte[1] ;
      T01RH17_A130BarCodPar = new String[] {""} ;
      T01RH17_A2804RecLinMaq = new short[1] ;
      T01RH17_A1273RecLinPro = new byte[1] ;
      T01RH17_A811RecLin = new short[1] ;
      T01RH3_A811RecLin = new short[1] ;
      T01RH3_A5725RecLote = new String[] {""} ;
      T01RH3_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH3_A875RecPrdDsc = new String[] {""} ;
      T01RH3_A872RecPrdNum = new String[] {""} ;
      T01RH3_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH3_A2394RecForNro = new byte[1] ;
      T01RH3_A3274RecPrdTnq = new byte[1] ;
      T01RH3_A3938RecCanEns = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH3_A4024RecMar = new byte[1] ;
      T01RH3_A5422RecSalMP = new short[1] ;
      T01RH3_A5467RecSalVol = new int[1] ;
      T01RH3_A5527RecLinRea = new String[] {""} ;
      T01RH3_A8934RecPes = new byte[1] ;
      T01RH3_A8937RecAcc = new String[] {""} ;
      T01RH3_A3804RecFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      T01RH3_A3805RecAnyTie = new short[1] ;
      T01RH3_A3806RecUltAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH3_A3807RecPorAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH3_A4900PrdCanMac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH3_A11708RecProv = new int[1] ;
      T01RH3_A4576RecLinUsr = new String[] {""} ;
      T01RH3_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01RH3_A12710PrdCantOrg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH3_A12717RecFabId = new int[1] ;
      T01RH3_A396EmprCod = new String[] {""} ;
      T01RH3_A719PrdNum = new String[] {""} ;
      T01RH3_n719PrdNum = new boolean[] {false} ;
      T01RH3_A490ForPrdUMe = new byte[1] ;
      T01RH3_n490ForPrdUMe = new boolean[] {false} ;
      T01RH3_A129BarCod = new int[1] ;
      T01RH3_A132BarCodReo = new byte[1] ;
      T01RH3_A130BarCodPar = new String[] {""} ;
      T01RH3_A2804RecLinMaq = new short[1] ;
      T01RH3_A1273RecLinPro = new byte[1] ;
      T01RH18_A396EmprCod = new String[] {""} ;
      T01RH18_A129BarCod = new int[1] ;
      T01RH18_A132BarCodReo = new byte[1] ;
      T01RH18_A130BarCodPar = new String[] {""} ;
      T01RH18_A2804RecLinMaq = new short[1] ;
      T01RH18_A1273RecLinPro = new byte[1] ;
      T01RH18_A811RecLin = new short[1] ;
      T01RH19_A396EmprCod = new String[] {""} ;
      T01RH19_A129BarCod = new int[1] ;
      T01RH19_A132BarCodReo = new byte[1] ;
      T01RH19_A130BarCodPar = new String[] {""} ;
      T01RH19_A2804RecLinMaq = new short[1] ;
      T01RH19_A1273RecLinPro = new byte[1] ;
      T01RH19_A811RecLin = new short[1] ;
      T01RH20_A13746ForPrdCDsc = new String[] {""} ;
      T01RH20_A396EmprCod = new String[] {""} ;
      T01RH20_A490ForPrdUMe = new byte[1] ;
      T01RH20_n490ForPrdUMe = new boolean[] {false} ;
      T01RH2_A811RecLin = new short[1] ;
      T01RH2_A5725RecLote = new String[] {""} ;
      T01RH2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH2_A875RecPrdDsc = new String[] {""} ;
      T01RH2_A872RecPrdNum = new String[] {""} ;
      T01RH2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH2_A2394RecForNro = new byte[1] ;
      T01RH2_A3274RecPrdTnq = new byte[1] ;
      T01RH2_A3938RecCanEns = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH2_A4024RecMar = new byte[1] ;
      T01RH2_A5422RecSalMP = new short[1] ;
      T01RH2_A5467RecSalVol = new int[1] ;
      T01RH2_A5527RecLinRea = new String[] {""} ;
      T01RH2_A8934RecPes = new byte[1] ;
      T01RH2_A8937RecAcc = new String[] {""} ;
      T01RH2_A3804RecFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      T01RH2_A3805RecAnyTie = new short[1] ;
      T01RH2_A3806RecUltAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH2_A3807RecPorAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH2_A4900PrdCanMac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH2_A11708RecProv = new int[1] ;
      T01RH2_A4576RecLinUsr = new String[] {""} ;
      T01RH2_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01RH2_A12710PrdCantOrg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH2_A12717RecFabId = new int[1] ;
      T01RH2_A396EmprCod = new String[] {""} ;
      T01RH2_A719PrdNum = new String[] {""} ;
      T01RH2_n719PrdNum = new boolean[] {false} ;
      T01RH2_A490ForPrdUMe = new byte[1] ;
      T01RH2_n490ForPrdUMe = new boolean[] {false} ;
      T01RH2_A129BarCod = new int[1] ;
      T01RH2_A132BarCodReo = new byte[1] ;
      T01RH2_A130BarCodPar = new String[] {""} ;
      T01RH2_A2804RecLinMaq = new short[1] ;
      T01RH2_A1273RecLinPro = new byte[1] ;
      T01RH24_A874RecPrdFind = new String[] {""} ;
      T01RH24_n874RecPrdFind = new boolean[] {false} ;
      T01RH25_A488ForPrdDsc = new String[] {""} ;
      T01RH25_n488ForPrdDsc = new boolean[] {false} ;
      T01RH26_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH26_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH26_A5418PrdSalM = new String[] {""} ;
      T01RH26_A10881PrdLote = new String[] {""} ;
      T01RH26_A13232PrdRGB = new long[1] ;
      T01RH26_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH26_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH26_A856ValCod = new byte[1] ;
      T01RH27_A396EmprCod = new String[] {""} ;
      T01RH27_A129BarCod = new int[1] ;
      T01RH27_A132BarCodReo = new byte[1] ;
      T01RH27_A130BarCodPar = new String[] {""} ;
      T01RH27_A2804RecLinMaq = new short[1] ;
      T01RH27_A1273RecLinPro = new byte[1] ;
      T01RH27_A811RecLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13746ForPrdCDsc = "" ;
      T01RH28_A13746ForPrdCDsc = new String[] {""} ;
      T01RH29_A13746ForPrdCDsc = new String[] {""} ;
      T01RH29_A396EmprCod = new String[] {""} ;
      T01RH29_A490ForPrdUMe = new byte[1] ;
      T01RH29_n490ForPrdUMe = new boolean[] {false} ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int13 = new int[1] ;
      GXv_int6 = new int[1] ;
      GXv_int8 = new byte[1] ;
      T01RH30_A396EmprCod = new String[] {""} ;
      T01RH31_A874RecPrdFind = new String[] {""} ;
      T01RH31_n874RecPrdFind = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z13897RecPrdDscf = "" ;
      T01RH32_A13746ForPrdCDsc = new String[] {""} ;
      T01RH32_A396EmprCod = new String[] {""} ;
      T01RH32_A490ForPrdUMe = new byte[1] ;
      T01RH32_n490ForPrdUMe = new boolean[] {false} ;
      T01RH33_A488ForPrdDsc = new String[] {""} ;
      T01RH33_n488ForPrdDsc = new boolean[] {false} ;
      Zh490ForPrdUMe = "" ;
      Z238CanRes = DecimalUtil.ZERO ;
      ZV63CanResold = DecimalUtil.ZERO ;
      ZV60Cantold = DecimalUtil.ZERO ;
      T01RH34_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH34_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH34_A5418PrdSalM = new String[] {""} ;
      T01RH34_A10881PrdLote = new String[] {""} ;
      T01RH34_A13232PrdRGB = new long[1] ;
      T01RH34_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH34_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RH34_A856ValCod = new byte[1] ;
      Z13832CantProduc = DecimalUtil.ZERO ;
      ZV53oldRecLote = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.mantenimientoderecetasregistro__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.mantenimientoderecetasregistro__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.mantenimientoderecetasregistro__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.mantenimientoderecetasregistro__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientoderecetasregistro__default(),
         new Object[] {
             new Object[] {
            T01RH2_A811RecLin, T01RH2_A5725RecLote, T01RH2_A686PrdCant, T01RH2_A875RecPrdDsc, T01RH2_A872RecPrdNum, T01RH2_A431FacCon, T01RH2_A2394RecForNro, T01RH2_A3274RecPrdTnq, T01RH2_A3938RecCanEns, T01RH2_A4024RecMar,
            T01RH2_A5422RecSalMP, T01RH2_A5467RecSalVol, T01RH2_A5527RecLinRea, T01RH2_A8934RecPes, T01RH2_A8937RecAcc, T01RH2_A3804RecFecMov, T01RH2_A3805RecAnyTie, T01RH2_A3806RecUltAny, T01RH2_A3807RecPorAny, T01RH2_A4900PrdCanMac,
            T01RH2_A11708RecProv, T01RH2_A4576RecLinUsr, T01RH2_A4577RecPesFec, T01RH2_A12710PrdCantOrg, T01RH2_A12717RecFabId, T01RH2_A396EmprCod, T01RH2_A719PrdNum, T01RH2_n719PrdNum, T01RH2_A490ForPrdUMe, T01RH2_n490ForPrdUMe,
            T01RH2_A129BarCod, T01RH2_A132BarCodReo, T01RH2_A130BarCodPar, T01RH2_A2804RecLinMaq, T01RH2_A1273RecLinPro
            }
            , new Object[] {
            T01RH3_A811RecLin, T01RH3_A5725RecLote, T01RH3_A686PrdCant, T01RH3_A875RecPrdDsc, T01RH3_A872RecPrdNum, T01RH3_A431FacCon, T01RH3_A2394RecForNro, T01RH3_A3274RecPrdTnq, T01RH3_A3938RecCanEns, T01RH3_A4024RecMar,
            T01RH3_A5422RecSalMP, T01RH3_A5467RecSalVol, T01RH3_A5527RecLinRea, T01RH3_A8934RecPes, T01RH3_A8937RecAcc, T01RH3_A3804RecFecMov, T01RH3_A3805RecAnyTie, T01RH3_A3806RecUltAny, T01RH3_A3807RecPorAny, T01RH3_A4900PrdCanMac,
            T01RH3_A11708RecProv, T01RH3_A4576RecLinUsr, T01RH3_A4577RecPesFec, T01RH3_A12710PrdCantOrg, T01RH3_A12717RecFabId, T01RH3_A396EmprCod, T01RH3_A719PrdNum, T01RH3_n719PrdNum, T01RH3_A490ForPrdUMe, T01RH3_n490ForPrdUMe,
            T01RH3_A129BarCod, T01RH3_A132BarCodReo, T01RH3_A130BarCodPar, T01RH3_A2804RecLinMaq, T01RH3_A1273RecLinPro
            }
            , new Object[] {
            T01RH4_A704PrdExiAlm, T01RH4_A685PrdCanRes, T01RH4_A5418PrdSalM, T01RH4_A10881PrdLote, T01RH4_A13232PrdRGB, T01RH4_A705PrdExiCC, T01RH4_A707PrdFacCon, T01RH4_A856ValCod
            }
            , new Object[] {
            T01RH5_A488ForPrdDsc, T01RH5_n488ForPrdDsc
            }
            , new Object[] {
            T01RH6_A396EmprCod
            }
            , new Object[] {
            T01RH7_A874RecPrdFind, T01RH7_n874RecPrdFind
            }
            , new Object[] {
            T01RH8_A13746ForPrdCDsc, T01RH8_A396EmprCod, T01RH8_A490ForPrdUMe
            }
            , new Object[] {
            T01RH9_A811RecLin, T01RH9_A5725RecLote, T01RH9_A686PrdCant, T01RH9_A875RecPrdDsc, T01RH9_A872RecPrdNum, T01RH9_A488ForPrdDsc, T01RH9_n488ForPrdDsc, T01RH9_A431FacCon, T01RH9_A2394RecForNro, T01RH9_A3274RecPrdTnq,
            T01RH9_A704PrdExiAlm, T01RH9_A685PrdCanRes, T01RH9_A3938RecCanEns, T01RH9_A4024RecMar, T01RH9_A5422RecSalMP, T01RH9_A5418PrdSalM, T01RH9_A5467RecSalVol, T01RH9_A5527RecLinRea, T01RH9_A8934RecPes, T01RH9_A8937RecAcc,
            T01RH9_A3804RecFecMov, T01RH9_A3805RecAnyTie, T01RH9_A3806RecUltAny, T01RH9_A3807RecPorAny, T01RH9_A4900PrdCanMac, T01RH9_A11708RecProv, T01RH9_A10881PrdLote, T01RH9_A4576RecLinUsr, T01RH9_A4577RecPesFec, T01RH9_A12710PrdCantOrg,
            T01RH9_A12717RecFabId, T01RH9_A13232PrdRGB, T01RH9_A705PrdExiCC, T01RH9_A707PrdFacCon, T01RH9_A396EmprCod, T01RH9_A719PrdNum, T01RH9_n719PrdNum, T01RH9_A490ForPrdUMe, T01RH9_n490ForPrdUMe, T01RH9_A129BarCod,
            T01RH9_A132BarCodReo, T01RH9_A130BarCodPar, T01RH9_A2804RecLinMaq, T01RH9_A1273RecLinPro, T01RH9_A856ValCod, T01RH9_A874RecPrdFind, T01RH9_n874RecPrdFind
            }
            , new Object[] {
            T01RH10_A13746ForPrdCDsc, T01RH10_A396EmprCod, T01RH10_A490ForPrdUMe
            }
            , new Object[] {
            T01RH11_A13746ForPrdCDsc, T01RH11_A396EmprCod, T01RH11_A490ForPrdUMe
            }
            , new Object[] {
            T01RH12_A13746ForPrdCDsc, T01RH12_A396EmprCod, T01RH12_A490ForPrdUMe
            }
            , new Object[] {
            T01RH13_A488ForPrdDsc, T01RH13_n488ForPrdDsc
            }
            , new Object[] {
            T01RH14_A874RecPrdFind, T01RH14_n874RecPrdFind
            }
            , new Object[] {
            T01RH15_A396EmprCod
            }
            , new Object[] {
            T01RH16_A704PrdExiAlm, T01RH16_A685PrdCanRes, T01RH16_A5418PrdSalM, T01RH16_A10881PrdLote, T01RH16_A13232PrdRGB, T01RH16_A705PrdExiCC, T01RH16_A707PrdFacCon, T01RH16_A856ValCod
            }
            , new Object[] {
            T01RH17_A396EmprCod, T01RH17_A129BarCod, T01RH17_A132BarCodReo, T01RH17_A130BarCodPar, T01RH17_A2804RecLinMaq, T01RH17_A1273RecLinPro, T01RH17_A811RecLin
            }
            , new Object[] {
            T01RH18_A396EmprCod, T01RH18_A129BarCod, T01RH18_A132BarCodReo, T01RH18_A130BarCodPar, T01RH18_A2804RecLinMaq, T01RH18_A1273RecLinPro, T01RH18_A811RecLin
            }
            , new Object[] {
            T01RH19_A396EmprCod, T01RH19_A129BarCod, T01RH19_A132BarCodReo, T01RH19_A130BarCodPar, T01RH19_A2804RecLinMaq, T01RH19_A1273RecLinPro, T01RH19_A811RecLin
            }
            , new Object[] {
            T01RH20_A13746ForPrdCDsc, T01RH20_A396EmprCod, T01RH20_A490ForPrdUMe
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RH24_A874RecPrdFind, T01RH24_n874RecPrdFind
            }
            , new Object[] {
            T01RH25_A488ForPrdDsc, T01RH25_n488ForPrdDsc
            }
            , new Object[] {
            T01RH26_A704PrdExiAlm, T01RH26_A685PrdCanRes, T01RH26_A5418PrdSalM, T01RH26_A10881PrdLote, T01RH26_A13232PrdRGB, T01RH26_A705PrdExiCC, T01RH26_A707PrdFacCon, T01RH26_A856ValCod
            }
            , new Object[] {
            T01RH27_A396EmprCod, T01RH27_A129BarCod, T01RH27_A132BarCodReo, T01RH27_A130BarCodPar, T01RH27_A2804RecLinMaq, T01RH27_A1273RecLinPro, T01RH27_A811RecLin
            }
            , new Object[] {
            T01RH28_A13746ForPrdCDsc
            }
            , new Object[] {
            T01RH29_A13746ForPrdCDsc, T01RH29_A396EmprCod, T01RH29_A490ForPrdUMe
            }
            , new Object[] {
            T01RH30_A396EmprCod
            }
            , new Object[] {
            T01RH31_A874RecPrdFind, T01RH31_n874RecPrdFind
            }
            , new Object[] {
            T01RH32_A13746ForPrdCDsc, T01RH32_A396EmprCod, T01RH32_A490ForPrdUMe
            }
            , new Object[] {
            T01RH33_A488ForPrdDsc, T01RH33_n488ForPrdDsc
            }
            , new Object[] {
            T01RH34_A704PrdExiAlm, T01RH34_A685PrdCanRes, T01RH34_A5418PrdSalM, T01RH34_A10881PrdLote, T01RH34_A13232PrdRGB, T01RH34_A705PrdExiCC, T01RH34_A707PrdFacCon, T01RH34_A856ValCod
            }
         }
      );
      AV64Pgmname = "MantenimientodeRecetasRegistro" ;
   }

   private byte wcpOAV11BarCodReo ;
   private byte wcpOAV8RecLinPro ;
   private byte Z132BarCodReo ;
   private byte Z1273RecLinPro ;
   private byte Z2394RecForNro ;
   private byte Z3274RecPrdTnq ;
   private byte Z4024RecMar ;
   private byte Z8934RecPes ;
   private byte Z490ForPrdUMe ;
   private byte O2394RecForNro ;
   private byte N490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte AV11BarCodReo ;
   private byte AV8RecLinPro ;
   private byte nKeyPressed ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A856ValCod ;
   private byte A4024RecMar ;
   private byte A8934RecPes ;
   private byte AV24Insert_ForPrdUMe ;
   private byte AV29Flag ;
   private byte GXt_int7 ;
   private byte Z856ValCod ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXv_int8[] ;
   private short wcpOAV9RecLinMaq ;
   private short wcpOAV7RecLin ;
   private short Z2804RecLinMaq ;
   private short Z811RecLin ;
   private short Z5422RecSalMP ;
   private short Z3805RecAnyTie ;
   private short AV35AlmCC ;
   private short AV28Valcos ;
   private short A2804RecLinMaq ;
   private short AV9RecLinMaq ;
   private short AV7RecLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A811RecLin ;
   private short A5422RecSalMP ;
   private short A3805RecAnyTie ;
   private short AV40Artemalha ;
   private short AV44Lote01 ;
   private short AV32Err_und ;
   private short AV45EliminarReceta ;
   private short RcdFound410 ;
   private short AV30Centra ;
   private short AV31F_pizarro ;
   private short AV33Suprema ;
   private short AV34Moda21 ;
   private short AV36Factor8 ;
   private short AV37Factor ;
   private short AV41AvisoPesaje ;
   private short AV46SiRGB ;
   private short nIsDirty_410 ;
   private short gxhchits ;
   private int wcpOAV12BarCod ;
   private int wcpOAV15Volumen ;
   private int Z129BarCod ;
   private int Z5467RecSalVol ;
   private int Z11708RecProv ;
   private int Z12717RecFabId ;
   private int AV58VolumenReceta ;
   private int A129BarCod ;
   private int AV12BarCod ;
   private int AV15Volumen ;
   private int trnEnded ;
   private int edtavProfordsc_Enabled ;
   private int edtavModif_Enabled ;
   private int edtavModo_Enabled ;
   private int edtavTotaldekilos_Enabled ;
   private int edtavVolumenreceta_Enabled ;
   private int edtRecLin_Enabled ;
   private int edtRecPrdNum_Enabled ;
   private int edtRecPrdDsc_Enabled ;
   private int imgprompt_396_872_875_Visible ;
   private int edtForPrdUMe_Enabled ;
   private int edtFacCon_Enabled ;
   private int edtPrdCant_Enabled ;
   private int edtRecForNro_Enabled ;
   private int edtRecPrdTnq_Enabled ;
   private int edtRecPrdFind_Enabled ;
   private int edtRecPrdDscf_Enabled ;
   private int edtCanRes_Enabled ;
   private int edtavCanresold_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtBarCod_Visible ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Visible ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Visible ;
   private int edtBarCodPar_Enabled ;
   private int edtRecLinMaq_Visible ;
   private int edtRecLinMaq_Enabled ;
   private int edtRecLinPro_Visible ;
   private int edtRecLinPro_Enabled ;
   private int edtPrdNum_Visible ;
   private int edtPrdNum_Enabled ;
   private int edtValCod_Enabled ;
   private int edtValCod_Visible ;
   private int edtPrdExiAlm_Enabled ;
   private int edtPrdExiAlm_Visible ;
   private int edtPrdCanRes_Enabled ;
   private int edtPrdCanRes_Visible ;
   private int edtRecCanEns_Enabled ;
   private int edtRecCanEns_Visible ;
   private int edtRecMar_Enabled ;
   private int edtRecMar_Visible ;
   private int edtRecSalMP_Enabled ;
   private int edtRecSalMP_Visible ;
   private int edtPrdSalM_Visible ;
   private int edtPrdSalM_Enabled ;
   private int A5467RecSalVol ;
   private int edtRecSalVol_Enabled ;
   private int edtRecSalVol_Visible ;
   private int edtRecLinRea_Visible ;
   private int edtRecLinRea_Enabled ;
   private int edtRecLote_Visible ;
   private int edtRecLote_Enabled ;
   private int edtRecPes_Enabled ;
   private int edtRecPes_Visible ;
   private int edtRecAcc_Visible ;
   private int edtRecAcc_Enabled ;
   private int edtRecFecMov_Visible ;
   private int edtRecFecMov_Enabled ;
   private int edtRecAnyTie_Enabled ;
   private int edtRecAnyTie_Visible ;
   private int edtRecUltAny_Enabled ;
   private int edtRecUltAny_Visible ;
   private int edtRecPorAny_Enabled ;
   private int edtRecPorAny_Visible ;
   private int edtPrdCanMac_Enabled ;
   private int edtPrdCanMac_Visible ;
   private int A11708RecProv ;
   private int edtRecProv_Enabled ;
   private int edtRecProv_Visible ;
   private int edtPrdLote_Visible ;
   private int edtPrdLote_Enabled ;
   private int edtRecLinUsr_Visible ;
   private int edtRecLinUsr_Enabled ;
   private int edtRecPesFec_Visible ;
   private int edtRecPesFec_Enabled ;
   private int edtPrdCantOrg_Enabled ;
   private int edtPrdCantOrg_Visible ;
   private int A12717RecFabId ;
   private int edtRecFabId_Enabled ;
   private int edtRecFabId_Visible ;
   private int edtPrdRGB_Enabled ;
   private int edtPrdRGB_Visible ;
   private int edtCantProduc_Enabled ;
   private int edtCantProduc_Visible ;
   private int edtPrdExiCC_Enabled ;
   private int edtPrdExiCC_Visible ;
   private int edtForPrdDsc_Visible ;
   private int edtForPrdDsc_Enabled ;
   private int edtavValcos_Enabled ;
   private int edtavValcos_Visible ;
   private int edtavProforlab_Visible ;
   private int edtavProforlab_Enabled ;
   private int edtavModif2_Visible ;
   private int edtavModif2_Enabled ;
   private int GXt_int5 ;
   private int AV65GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int gxdynajaxindex ;
   private int GXv_int13[] ;
   private int GXv_int6[] ;
   private long A13232PrdRGB ;
   private long Z13232PrdRGB ;
   private java.math.BigDecimal wcpOAV14TotKgs ;
   private java.math.BigDecimal Z686PrdCant ;
   private java.math.BigDecimal Z431FacCon ;
   private java.math.BigDecimal Z3938RecCanEns ;
   private java.math.BigDecimal Z3806RecUltAny ;
   private java.math.BigDecimal Z3807RecPorAny ;
   private java.math.BigDecimal Z4900PrdCanMac ;
   private java.math.BigDecimal Z12710PrdCantOrg ;
   private java.math.BigDecimal O431FacCon ;
   private java.math.BigDecimal O686PrdCant ;
   private java.math.BigDecimal O238CanRes ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal AV60Cantold ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal AV51Totaldekilos ;
   private java.math.BigDecimal AV14TotKgs ;
   private java.math.BigDecimal A238CanRes ;
   private java.math.BigDecimal AV63CanResold ;
   private java.math.BigDecimal A3938RecCanEns ;
   private java.math.BigDecimal A3806RecUltAny ;
   private java.math.BigDecimal A3807RecPorAny ;
   private java.math.BigDecimal A4900PrdCanMac ;
   private java.math.BigDecimal A12710PrdCantOrg ;
   private java.math.BigDecimal A13832CantProduc ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal AV42NoCantidad ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal Z685PrdCanRes ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal Z707PrdFacCon ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal Z238CanRes ;
   private java.math.BigDecimal ZV63CanResold ;
   private java.math.BigDecimal ZV60Cantold ;
   private java.math.BigDecimal Z13832CantProduc ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV13EmprCod ;
   private String wcpOAV10BarCodPar ;
   private String wcpOAV17Barnhdr ;
   private String wcpOAV18ProForDsc ;
   private String wcpOAV19Proforfab ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z5725RecLote ;
   private String Z875RecPrdDsc ;
   private String Z872RecPrdNum ;
   private String Z5527RecLinRea ;
   private String Z8937RecAcc ;
   private String Z4576RecLinUsr ;
   private String Z719PrdNum ;
   private String O5725RecLote ;
   private String N719PrdNum ;
   private String N5725RecLote ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A872RecPrdNum ;
   private String A719PrdNum ;
   private String A874RecPrdFind ;
   private String A130BarCodPar ;
   private String Gx_mode ;
   private String AV13EmprCod ;
   private String AV10BarCodPar ;
   private String AV17Barnhdr ;
   private String AV18ProForDsc ;
   private String AV19Proforfab ;
   private String AV20Modif2 ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtRecLin_Internalname ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavProfordsc_Internalname ;
   private String edtavProfordsc_Jsonclick ;
   private String edtavModif_Internalname ;
   private String AV27Modif ;
   private String edtavModif_Jsonclick ;
   private String edtavModo_Internalname ;
   private String AV47Modo ;
   private String edtavModo_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavTotaldekilos_Internalname ;
   private String edtavTotaldekilos_Jsonclick ;
   private String edtavVolumenreceta_Internalname ;
   private String edtavVolumenreceta_Jsonclick ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String edtRecLin_Jsonclick ;
   private String edtRecPrdNum_Internalname ;
   private String edtRecPrdNum_Jsonclick ;
   private String edtRecPrdDsc_Internalname ;
   private String A875RecPrdDsc ;
   private String edtRecPrdDsc_Jsonclick ;
   private String imgprompt_396_872_875_gximage ;
   private String sImgUrl ;
   private String imgprompt_396_872_875_Internalname ;
   private String imgprompt_396_872_875_Link ;
   private String divUnnamedtable3_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtFacCon_Internalname ;
   private String edtFacCon_Jsonclick ;
   private String edtPrdCant_Internalname ;
   private String edtPrdCant_Jsonclick ;
   private String edtRecForNro_Internalname ;
   private String edtRecForNro_Jsonclick ;
   private String edtRecPrdTnq_Internalname ;
   private String edtRecPrdTnq_Jsonclick ;
   private String divTablaprovisional_Internalname ;
   private String edtRecPrdFind_Internalname ;
   private String edtRecPrdFind_Jsonclick ;
   private String edtRecPrdDscf_Internalname ;
   private String A13897RecPrdDscf ;
   private String edtRecPrdDscf_Jsonclick ;
   private String edtCanRes_Internalname ;
   private String edtCanRes_Jsonclick ;
   private String edtavCanresold_Internalname ;
   private String edtavCanresold_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtRecLinMaq_Internalname ;
   private String edtRecLinMaq_Jsonclick ;
   private String edtRecLinPro_Internalname ;
   private String edtRecLinPro_Jsonclick ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String edtValCod_Internalname ;
   private String edtValCod_Jsonclick ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdCanRes_Internalname ;
   private String edtPrdCanRes_Jsonclick ;
   private String edtRecCanEns_Internalname ;
   private String edtRecCanEns_Jsonclick ;
   private String edtRecMar_Internalname ;
   private String edtRecMar_Jsonclick ;
   private String edtRecSalMP_Internalname ;
   private String edtRecSalMP_Jsonclick ;
   private String edtPrdSalM_Internalname ;
   private String A5418PrdSalM ;
   private String edtPrdSalM_Jsonclick ;
   private String edtRecSalVol_Internalname ;
   private String edtRecSalVol_Jsonclick ;
   private String edtRecLinRea_Internalname ;
   private String A5527RecLinRea ;
   private String edtRecLinRea_Jsonclick ;
   private String edtRecLote_Internalname ;
   private String A5725RecLote ;
   private String edtRecLote_Jsonclick ;
   private String edtRecPes_Internalname ;
   private String edtRecPes_Jsonclick ;
   private String edtRecAcc_Internalname ;
   private String A8937RecAcc ;
   private String edtRecAcc_Jsonclick ;
   private String edtRecFecMov_Internalname ;
   private String edtRecFecMov_Jsonclick ;
   private String edtRecAnyTie_Internalname ;
   private String edtRecAnyTie_Jsonclick ;
   private String edtRecUltAny_Internalname ;
   private String edtRecUltAny_Jsonclick ;
   private String edtRecPorAny_Internalname ;
   private String edtRecPorAny_Jsonclick ;
   private String edtPrdCanMac_Internalname ;
   private String edtPrdCanMac_Jsonclick ;
   private String edtRecProv_Internalname ;
   private String edtRecProv_Jsonclick ;
   private String edtPrdLote_Internalname ;
   private String A10881PrdLote ;
   private String edtPrdLote_Jsonclick ;
   private String edtRecLinUsr_Internalname ;
   private String A4576RecLinUsr ;
   private String edtRecLinUsr_Jsonclick ;
   private String edtRecPesFec_Internalname ;
   private String edtRecPesFec_Jsonclick ;
   private String edtPrdCantOrg_Internalname ;
   private String edtPrdCantOrg_Jsonclick ;
   private String edtRecFabId_Internalname ;
   private String edtRecFabId_Jsonclick ;
   private String edtPrdRGB_Internalname ;
   private String edtPrdRGB_Jsonclick ;
   private String edtCantProduc_Internalname ;
   private String edtCantProduc_Jsonclick ;
   private String edtPrdExiCC_Internalname ;
   private String edtPrdExiCC_Jsonclick ;
   private String edtForPrdDsc_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtavValcos_Internalname ;
   private String edtavValcos_Jsonclick ;
   private String edtavProforlab_Internalname ;
   private String AV59ProForLab ;
   private String edtavProforlab_Jsonclick ;
   private String edtavModif2_Internalname ;
   private String edtavModif2_Jsonclick ;
   private String AV25Insert_PrdNum ;
   private String AV53oldRecLote ;
   private String AV52TipodeProceso ;
   private String AV64Pgmname ;
   private String AV50UsurCod ;
   private String AV48Station ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode410 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV49EmprNom ;
   private String AV38MsgErrFactor ;
   private String AV39Conf ;
   private String Z874RecPrdFind ;
   private String Z488ForPrdDsc ;
   private String Z5418PrdSalM ;
   private String Z10881PrdLote ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String gxwrpcisep ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z13897RecPrdDscf ;
   private String ZV53oldRecLote ;
   private java.util.Date Z4577RecPesFec ;
   private java.util.Date A4577RecPesFec ;
   private java.util.Date wcpOAV16FecPan ;
   private java.util.Date Z3804RecFecMov ;
   private java.util.Date AV16FecPan ;
   private java.util.Date A3804RecFecMov ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n874RecPrdFind ;
   private boolean wbErr ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n488ForPrdDsc ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String AV57msgErr ;
   private String A13746ForPrdCDsc ;
   private String h490ForPrdUMe ;
   private String AV61Inc_obs1 ;
   private String AV62Inc_obs2 ;
   private String AV56Inc_obs ;
   private String AV43msg_err1 ;
   private String l13746ForPrdCDsc ;
   private String Zh490ForPrdUMe ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV23WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01RH8_A13746ForPrdCDsc ;
   private String[] T01RH8_A396EmprCod ;
   private byte[] T01RH8_A490ForPrdUMe ;
   private boolean[] T01RH8_n490ForPrdUMe ;
   private String[] T01RH5_A488ForPrdDsc ;
   private boolean[] T01RH5_n488ForPrdDsc ;
   private short[] T01RH9_A811RecLin ;
   private String[] T01RH9_A5725RecLote ;
   private java.math.BigDecimal[] T01RH9_A686PrdCant ;
   private String[] T01RH9_A875RecPrdDsc ;
   private String[] T01RH9_A872RecPrdNum ;
   private String[] T01RH9_A488ForPrdDsc ;
   private boolean[] T01RH9_n488ForPrdDsc ;
   private java.math.BigDecimal[] T01RH9_A431FacCon ;
   private byte[] T01RH9_A2394RecForNro ;
   private byte[] T01RH9_A3274RecPrdTnq ;
   private java.math.BigDecimal[] T01RH9_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01RH9_A685PrdCanRes ;
   private java.math.BigDecimal[] T01RH9_A3938RecCanEns ;
   private byte[] T01RH9_A4024RecMar ;
   private short[] T01RH9_A5422RecSalMP ;
   private String[] T01RH9_A5418PrdSalM ;
   private int[] T01RH9_A5467RecSalVol ;
   private String[] T01RH9_A5527RecLinRea ;
   private byte[] T01RH9_A8934RecPes ;
   private String[] T01RH9_A8937RecAcc ;
   private java.util.Date[] T01RH9_A3804RecFecMov ;
   private short[] T01RH9_A3805RecAnyTie ;
   private java.math.BigDecimal[] T01RH9_A3806RecUltAny ;
   private java.math.BigDecimal[] T01RH9_A3807RecPorAny ;
   private java.math.BigDecimal[] T01RH9_A4900PrdCanMac ;
   private int[] T01RH9_A11708RecProv ;
   private String[] T01RH9_A10881PrdLote ;
   private String[] T01RH9_A4576RecLinUsr ;
   private java.util.Date[] T01RH9_A4577RecPesFec ;
   private java.math.BigDecimal[] T01RH9_A12710PrdCantOrg ;
   private int[] T01RH9_A12717RecFabId ;
   private long[] T01RH9_A13232PrdRGB ;
   private java.math.BigDecimal[] T01RH9_A705PrdExiCC ;
   private java.math.BigDecimal[] T01RH9_A707PrdFacCon ;
   private String[] T01RH9_A396EmprCod ;
   private String[] T01RH9_A719PrdNum ;
   private boolean[] T01RH9_n719PrdNum ;
   private byte[] T01RH9_A490ForPrdUMe ;
   private boolean[] T01RH9_n490ForPrdUMe ;
   private int[] T01RH9_A129BarCod ;
   private byte[] T01RH9_A132BarCodReo ;
   private String[] T01RH9_A130BarCodPar ;
   private short[] T01RH9_A2804RecLinMaq ;
   private byte[] T01RH9_A1273RecLinPro ;
   private byte[] T01RH9_A856ValCod ;
   private String[] T01RH9_A874RecPrdFind ;
   private boolean[] T01RH9_n874RecPrdFind ;
   private String[] T01RH10_A13746ForPrdCDsc ;
   private String[] T01RH10_A396EmprCod ;
   private byte[] T01RH10_A490ForPrdUMe ;
   private boolean[] T01RH10_n490ForPrdUMe ;
   private String[] T01RH11_A13746ForPrdCDsc ;
   private String[] T01RH11_A396EmprCod ;
   private byte[] T01RH11_A490ForPrdUMe ;
   private boolean[] T01RH11_n490ForPrdUMe ;
   private String[] T01RH12_A13746ForPrdCDsc ;
   private String[] T01RH12_A396EmprCod ;
   private byte[] T01RH12_A490ForPrdUMe ;
   private boolean[] T01RH12_n490ForPrdUMe ;
   private String[] T01RH7_A874RecPrdFind ;
   private boolean[] T01RH7_n874RecPrdFind ;
   private String[] T01RH6_A396EmprCod ;
   private java.math.BigDecimal[] T01RH4_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01RH4_A685PrdCanRes ;
   private String[] T01RH4_A5418PrdSalM ;
   private String[] T01RH4_A10881PrdLote ;
   private long[] T01RH4_A13232PrdRGB ;
   private java.math.BigDecimal[] T01RH4_A705PrdExiCC ;
   private java.math.BigDecimal[] T01RH4_A707PrdFacCon ;
   private byte[] T01RH4_A856ValCod ;
   private String[] T01RH13_A488ForPrdDsc ;
   private boolean[] T01RH13_n488ForPrdDsc ;
   private String[] T01RH14_A874RecPrdFind ;
   private boolean[] T01RH14_n874RecPrdFind ;
   private String[] T01RH15_A396EmprCod ;
   private java.math.BigDecimal[] T01RH16_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01RH16_A685PrdCanRes ;
   private String[] T01RH16_A5418PrdSalM ;
   private String[] T01RH16_A10881PrdLote ;
   private long[] T01RH16_A13232PrdRGB ;
   private java.math.BigDecimal[] T01RH16_A705PrdExiCC ;
   private java.math.BigDecimal[] T01RH16_A707PrdFacCon ;
   private byte[] T01RH16_A856ValCod ;
   private String[] T01RH17_A396EmprCod ;
   private int[] T01RH17_A129BarCod ;
   private byte[] T01RH17_A132BarCodReo ;
   private String[] T01RH17_A130BarCodPar ;
   private short[] T01RH17_A2804RecLinMaq ;
   private byte[] T01RH17_A1273RecLinPro ;
   private short[] T01RH17_A811RecLin ;
   private short[] T01RH3_A811RecLin ;
   private String[] T01RH3_A5725RecLote ;
   private java.math.BigDecimal[] T01RH3_A686PrdCant ;
   private String[] T01RH3_A875RecPrdDsc ;
   private String[] T01RH3_A872RecPrdNum ;
   private java.math.BigDecimal[] T01RH3_A431FacCon ;
   private byte[] T01RH3_A2394RecForNro ;
   private byte[] T01RH3_A3274RecPrdTnq ;
   private java.math.BigDecimal[] T01RH3_A3938RecCanEns ;
   private byte[] T01RH3_A4024RecMar ;
   private short[] T01RH3_A5422RecSalMP ;
   private int[] T01RH3_A5467RecSalVol ;
   private String[] T01RH3_A5527RecLinRea ;
   private byte[] T01RH3_A8934RecPes ;
   private String[] T01RH3_A8937RecAcc ;
   private java.util.Date[] T01RH3_A3804RecFecMov ;
   private short[] T01RH3_A3805RecAnyTie ;
   private java.math.BigDecimal[] T01RH3_A3806RecUltAny ;
   private java.math.BigDecimal[] T01RH3_A3807RecPorAny ;
   private java.math.BigDecimal[] T01RH3_A4900PrdCanMac ;
   private int[] T01RH3_A11708RecProv ;
   private String[] T01RH3_A4576RecLinUsr ;
   private java.util.Date[] T01RH3_A4577RecPesFec ;
   private java.math.BigDecimal[] T01RH3_A12710PrdCantOrg ;
   private int[] T01RH3_A12717RecFabId ;
   private String[] T01RH3_A396EmprCod ;
   private String[] T01RH3_A719PrdNum ;
   private boolean[] T01RH3_n719PrdNum ;
   private byte[] T01RH3_A490ForPrdUMe ;
   private boolean[] T01RH3_n490ForPrdUMe ;
   private int[] T01RH3_A129BarCod ;
   private byte[] T01RH3_A132BarCodReo ;
   private String[] T01RH3_A130BarCodPar ;
   private short[] T01RH3_A2804RecLinMaq ;
   private byte[] T01RH3_A1273RecLinPro ;
   private String[] T01RH18_A396EmprCod ;
   private int[] T01RH18_A129BarCod ;
   private byte[] T01RH18_A132BarCodReo ;
   private String[] T01RH18_A130BarCodPar ;
   private short[] T01RH18_A2804RecLinMaq ;
   private byte[] T01RH18_A1273RecLinPro ;
   private short[] T01RH18_A811RecLin ;
   private String[] T01RH19_A396EmprCod ;
   private int[] T01RH19_A129BarCod ;
   private byte[] T01RH19_A132BarCodReo ;
   private String[] T01RH19_A130BarCodPar ;
   private short[] T01RH19_A2804RecLinMaq ;
   private byte[] T01RH19_A1273RecLinPro ;
   private short[] T01RH19_A811RecLin ;
   private String[] T01RH20_A13746ForPrdCDsc ;
   private String[] T01RH20_A396EmprCod ;
   private byte[] T01RH20_A490ForPrdUMe ;
   private boolean[] T01RH20_n490ForPrdUMe ;
   private short[] T01RH2_A811RecLin ;
   private String[] T01RH2_A5725RecLote ;
   private java.math.BigDecimal[] T01RH2_A686PrdCant ;
   private String[] T01RH2_A875RecPrdDsc ;
   private String[] T01RH2_A872RecPrdNum ;
   private java.math.BigDecimal[] T01RH2_A431FacCon ;
   private byte[] T01RH2_A2394RecForNro ;
   private byte[] T01RH2_A3274RecPrdTnq ;
   private java.math.BigDecimal[] T01RH2_A3938RecCanEns ;
   private byte[] T01RH2_A4024RecMar ;
   private short[] T01RH2_A5422RecSalMP ;
   private int[] T01RH2_A5467RecSalVol ;
   private String[] T01RH2_A5527RecLinRea ;
   private byte[] T01RH2_A8934RecPes ;
   private String[] T01RH2_A8937RecAcc ;
   private java.util.Date[] T01RH2_A3804RecFecMov ;
   private short[] T01RH2_A3805RecAnyTie ;
   private java.math.BigDecimal[] T01RH2_A3806RecUltAny ;
   private java.math.BigDecimal[] T01RH2_A3807RecPorAny ;
   private java.math.BigDecimal[] T01RH2_A4900PrdCanMac ;
   private int[] T01RH2_A11708RecProv ;
   private String[] T01RH2_A4576RecLinUsr ;
   private java.util.Date[] T01RH2_A4577RecPesFec ;
   private java.math.BigDecimal[] T01RH2_A12710PrdCantOrg ;
   private int[] T01RH2_A12717RecFabId ;
   private String[] T01RH2_A396EmprCod ;
   private String[] T01RH2_A719PrdNum ;
   private boolean[] T01RH2_n719PrdNum ;
   private byte[] T01RH2_A490ForPrdUMe ;
   private boolean[] T01RH2_n490ForPrdUMe ;
   private int[] T01RH2_A129BarCod ;
   private byte[] T01RH2_A132BarCodReo ;
   private String[] T01RH2_A130BarCodPar ;
   private short[] T01RH2_A2804RecLinMaq ;
   private byte[] T01RH2_A1273RecLinPro ;
   private String[] T01RH24_A874RecPrdFind ;
   private boolean[] T01RH24_n874RecPrdFind ;
   private String[] T01RH25_A488ForPrdDsc ;
   private boolean[] T01RH25_n488ForPrdDsc ;
   private java.math.BigDecimal[] T01RH26_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01RH26_A685PrdCanRes ;
   private String[] T01RH26_A5418PrdSalM ;
   private String[] T01RH26_A10881PrdLote ;
   private long[] T01RH26_A13232PrdRGB ;
   private java.math.BigDecimal[] T01RH26_A705PrdExiCC ;
   private java.math.BigDecimal[] T01RH26_A707PrdFacCon ;
   private byte[] T01RH26_A856ValCod ;
   private String[] T01RH27_A396EmprCod ;
   private int[] T01RH27_A129BarCod ;
   private byte[] T01RH27_A132BarCodReo ;
   private String[] T01RH27_A130BarCodPar ;
   private short[] T01RH27_A2804RecLinMaq ;
   private byte[] T01RH27_A1273RecLinPro ;
   private short[] T01RH27_A811RecLin ;
   private String[] T01RH28_A13746ForPrdCDsc ;
   private String[] T01RH29_A13746ForPrdCDsc ;
   private String[] T01RH29_A396EmprCod ;
   private byte[] T01RH29_A490ForPrdUMe ;
   private boolean[] T01RH29_n490ForPrdUMe ;
   private String[] T01RH30_A396EmprCod ;
   private String[] T01RH31_A874RecPrdFind ;
   private boolean[] T01RH31_n874RecPrdFind ;
   private String[] T01RH32_A13746ForPrdCDsc ;
   private String[] T01RH32_A396EmprCod ;
   private byte[] T01RH32_A490ForPrdUMe ;
   private boolean[] T01RH32_n490ForPrdUMe ;
   private String[] T01RH33_A488ForPrdDsc ;
   private boolean[] T01RH33_n488ForPrdDsc ;
   private java.math.BigDecimal[] T01RH34_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01RH34_A685PrdCanRes ;
   private String[] T01RH34_A5418PrdSalM ;
   private String[] T01RH34_A10881PrdLote ;
   private long[] T01RH34_A13232PrdRGB ;
   private java.math.BigDecimal[] T01RH34_A705PrdExiCC ;
   private java.math.BigDecimal[] T01RH34_A707PrdFacCon ;
   private byte[] T01RH34_A856ValCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV21WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV22TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV26TrnContextAtt ;
}

final  class mantenimientoderecetasregistro__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mantenimientoderecetasregistro__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mantenimientoderecetasregistro__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mantenimientoderecetasregistro__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mantenimientoderecetasregistro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01RH2", "SELECT RecLin, RecLote, PrdCant, RecPrdDsc, RecPrdNum, FacCon, RecForNro, RecPrdTnq, RecCanEns, RecMar, RecSalMP, RecSalVol, RecLinRea, RecPes, RecAcc, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecProv, RecLinUsr, RecPesFec, PrdCantOrg, RecFabId, EmprCod, PrdNum, ForPrdUMe, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPLRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?  FOR UPDATE OF RecLote, PrdCant, RecPrdDsc, RecPrdNum, FacCon, RecForNro, RecPrdTnq, RecCanEns, RecMar, RecSalMP, RecSalVol, RecLinRea, RecPes, RecAcc, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecProv, RecLinUsr, RecPesFec, PrdCantOrg, RecFabId, PrdNum, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH3", "SELECT RecLin, RecLote, PrdCant, RecPrdDsc, RecPrdNum, FacCon, RecForNro, RecPrdTnq, RecCanEns, RecMar, RecSalMP, RecSalVol, RecLinRea, RecPes, RecAcc, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecProv, RecLinUsr, RecPesFec, PrdCantOrg, RecFabId, EmprCod, PrdNum, ForPrdUMe, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPLRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH4", "SELECT PrdExiAlm, PrdCanRes, PrdSalM, PrdLote, PrdRGB, PrdExiCC, PrdFacCon, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH5", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH6", "SELECT EmprCod FROM TXPCRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH7", "SELECT COALESCE( PrdNum, 'xxxxxx') AS RecPrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH8", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (EmprCod = ?) AND (ForPrdUMe = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH9", "SELECT /*+ FIRST_ROWS(100) */ TM1.RecLin, TM1.RecLote, TM1.PrdCant, TM1.RecPrdDsc, TM1.RecPrdNum, T3.ForPrdDsc, TM1.FacCon, TM1.RecForNro, TM1.RecPrdTnq, T4.PrdExiAlm, T4.PrdCanRes, TM1.RecCanEns, TM1.RecMar, TM1.RecSalMP, T4.PrdSalM, TM1.RecSalVol, TM1.RecLinRea, TM1.RecPes, TM1.RecAcc, TM1.RecFecMov, TM1.RecAnyTie, TM1.RecUltAny, TM1.RecPorAny, TM1.PrdCanMac, TM1.RecProv, T4.PrdLote, TM1.RecLinUsr, TM1.RecPesFec, TM1.PrdCantOrg, TM1.RecFabId, T4.PrdRGB, T4.PrdExiCC, T4.PrdFacCon, TM1.EmprCod, TM1.PrdNum, TM1.ForPrdUMe, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.RecLinMaq, TM1.RecLinPro, T4.ValCod, COALESCE( T2.PrdNum, 'xxxxxx') AS RecPrdFind FROM (((TXPLRECET TM1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = TM1.EmprCod AND T2.PrdNum = TM1.RecPrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = TM1.EmprCod AND T3.ForPrdUMe = TM1.ForPrdUMe) LEFT JOIN TXPPRODUC T4 ON T4.EmprCod = TM1.EmprCod AND T4.PrdNum = TM1.PrdNum) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.RecLinMaq = ? and TM1.RecLinPro = ? and TM1.RecLin = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.RecLinMaq, TM1.RecLinPro, TM1.RecLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH10", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (EmprCod = ?) AND (ForPrdUMe = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH11", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH12", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH13", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH14", "SELECT COALESCE( PrdNum, 'xxxxxx') AS RecPrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH15", "SELECT EmprCod FROM TXPCRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH16", "SELECT PrdExiAlm, PrdCanRes, PrdSalM, PrdLote, PrdRGB, PrdExiCC, PrdFacCon, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH17", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinMaq > ? or RecLinMaq = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinPro > ? or RecLinPro = ? and RecLinMaq = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLin > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RH19", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinMaq < ? or RecLinMaq = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinPro < ? or RecLinPro = ? and RecLinMaq = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLin < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, RecLinMaq DESC, RecLinPro DESC, RecLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RH20", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01RH21", "INSERT INTO TXPLRECET(RecLin, RecLote, PrdCant, RecPrdDsc, RecPrdNum, FacCon, RecForNro, RecPrdTnq, RecCanEns, RecMar, RecSalMP, RecSalVol, RecLinRea, RecPes, RecAcc, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecProv, RecLinUsr, RecPesFec, PrdCantOrg, RecFabId, EmprCod, PrdNum, ForPrdUMe, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, PrdCanFin, PrdCanAny, FacCon1, RecPrdDc2, RecLotAlm, RecLoteFch, RecManAut) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK, "TXPLRECET")
         ,new UpdateCursor("T01RH22", "UPDATE TXPLRECET SET RecLote=?, PrdCant=?, RecPrdDsc=?, RecPrdNum=?, FacCon=?, RecForNro=?, RecPrdTnq=?, RecCanEns=?, RecMar=?, RecSalMP=?, RecSalVol=?, RecLinRea=?, RecPes=?, RecAcc=?, RecFecMov=?, RecAnyTie=?, RecUltAny=?, RecPorAny=?, PrdCanMac=?, RecProv=?, RecLinUsr=?, RecPesFec=?, PrdCantOrg=?, RecFabId=?, PrdNum=?, ForPrdUMe=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK, "TXPLRECET")
         ,new UpdateCursor("T01RH23", "DELETE FROM TXPLRECET  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK, "TXPLRECET")
         ,new ForEachCursor("T01RH24", "SELECT COALESCE( PrdNum, 'xxxxxx') AS RecPrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH25", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH26", "SELECT PrdExiAlm, PrdCanRes, PrdSalM, PrdLote, PrdRGB, PrdExiCC, PrdFacCon, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH27", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH28", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc FROM TXPUNMEPR WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, '')))) like '%' || UPPER(?)) ORDER BY ForPrdCDsc) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH29", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH30", "SELECT EmprCod FROM TXPCRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH31", "SELECT COALESCE( PrdNum, 'xxxxxx') AS RecPrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH32", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) AS ForPrdCDsc, EmprCod, ForPrdUMe FROM TXPUNMEPR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(ForPrdUMe,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( ForPrdDsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH33", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RH34", "SELECT PrdExiAlm, PrdCanRes, PrdSalM, PrdLote, PrdRGB, PrdExiCC, PrdFacCon, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 40);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,3);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,3);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 8);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(23);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,3);
               ((int[]) buf[24])[0] = rslt.getInt(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 3);
               ((String[]) buf[26])[0] = rslt.getString(27, 6);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((byte[]) buf[28])[0] = rslt.getByte(28);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(29);
               ((byte[]) buf[31])[0] = rslt.getByte(30);
               ((String[]) buf[32])[0] = rslt.getString(31, 1);
               ((short[]) buf[33])[0] = rslt.getShort(32);
               ((byte[]) buf[34])[0] = rslt.getByte(33);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 40);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,3);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,3);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 8);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(23);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,3);
               ((int[]) buf[24])[0] = rslt.getInt(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 3);
               ((String[]) buf[26])[0] = rslt.getString(27, 6);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((byte[]) buf[28])[0] = rslt.getByte(28);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(29);
               ((byte[]) buf[31])[0] = rslt.getByte(30);
               ((String[]) buf[32])[0] = rslt.getString(31, 1);
               ((short[]) buf[33])[0] = rslt.getShort(32);
               ((byte[]) buf[34])[0] = rslt.getByte(33);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,5);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 1);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 40);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(20);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,3);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,3);
               ((int[]) buf[25])[0] = rslt.getInt(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 26);
               ((String[]) buf[27])[0] = rslt.getString(27, 8);
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(28);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(29,3);
               ((int[]) buf[30])[0] = rslt.getInt(30);
               ((long[]) buf[31])[0] = rslt.getLong(31);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(32,4);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(33,4);
               ((String[]) buf[34])[0] = rslt.getString(34, 3);
               ((String[]) buf[35])[0] = rslt.getString(35, 6);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(36);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(37);
               ((byte[]) buf[40])[0] = rslt.getByte(38);
               ((String[]) buf[41])[0] = rslt.getString(39, 1);
               ((short[]) buf[42])[0] = rslt.getShort(40);
               ((byte[]) buf[43])[0] = rslt.getByte(41);
               ((byte[]) buf[44])[0] = rslt.getByte(42);
               ((String[]) buf[45])[0] = rslt.getString(43, 6);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 14 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
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
            case 3 :
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
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
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
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
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
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
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
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 14 :
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
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setString(24, (String)parms[23], 1);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setString(24, (String)parms[23], 1);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 19 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 26);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setString(4, (String)parms[3], 26);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 1);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 40);
               stmt.setDate(16, (java.util.Date)parms[15]);
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 3);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 2);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 3);
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setString(22, (String)parms[21], 8);
               stmt.setDateTime(23, (java.util.Date)parms[22], false);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[23], 3);
               stmt.setInt(25, ((Number) parms[24]).intValue());
               stmt.setString(26, (String)parms[25], 3);
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[27], 6);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(28, ((Number) parms[29]).byteValue());
               }
               stmt.setInt(29, ((Number) parms[30]).intValue());
               stmt.setByte(30, ((Number) parms[31]).byteValue());
               stmt.setString(31, (String)parms[32], 1);
               stmt.setShort(32, ((Number) parms[33]).shortValue());
               stmt.setByte(33, ((Number) parms[34]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 40);
               stmt.setDate(15, (java.util.Date)parms[14]);
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 3);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 2);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 3);
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setString(21, (String)parms[20], 8);
               stmt.setDateTime(22, (java.util.Date)parms[21], false);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[22], 3);
               stmt.setInt(24, ((Number) parms[23]).intValue());
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[25], 6);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(26, ((Number) parms[27]).byteValue());
               }
               stmt.setString(27, (String)parms[28], 3);
               stmt.setInt(28, ((Number) parms[29]).intValue());
               stmt.setByte(29, ((Number) parms[30]).byteValue());
               stmt.setString(30, (String)parms[31], 1);
               stmt.setShort(31, ((Number) parms[32]).shortValue());
               stmt.setByte(32, ((Number) parms[33]).byteValue());
               stmt.setShort(33, ((Number) parms[34]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 23 :
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
            case 24 :
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
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 27 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
   }

}

