package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class treclin_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action41") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A872RecPrdNum = httpContext.GetPar( "RecPrdNum") ;
         A704PrdExiAlm = CommonUtil.decimalVal( httpContext.GetPar( "PrdExiAlm"), ".") ;
         n704PrdExiAlm = false ;
         A685PrdCanRes = CommonUtil.decimalVal( httpContext.GetPar( "PrdCanRes"), ".") ;
         n685PrdCanRes = false ;
         A686PrdCant = CommonUtil.decimalVal( httpContext.GetPar( "PrdCant"), ".") ;
         A705PrdExiCC = CommonUtil.decimalVal( httpContext.GetPar( "PrdExiCC"), ".") ;
         n705PrdExiCC = false ;
         AV42Cantold = CommonUtil.decimalVal( httpContext.GetPar( "Cantold"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Cantold", GXutil.ltrimstr( AV42Cantold, 11, 3));
         AV58AlmCC = (byte)(GXutil.lval( httpContext.GetPar( "AlmCC"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58AlmCC", GXutil.str( AV58AlmCC, 1, 0));
         AV72msgErr = httpContext.GetPar( "msgErr") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72msgErr", AV72msgErr);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A431FacCon = CommonUtil.decimalVal( httpContext.GetPar( "FacCon"), ".") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_41_3X410( A396EmprCod, A872RecPrdNum, A704PrdExiAlm, A685PrdCanRes, A686PrdCant, A705PrdExiCC, AV42Cantold, AV58AlmCC, AV72msgErr, A719PrdNum, A431FacCon) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action42") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A872RecPrdNum = httpContext.GetPar( "RecPrdNum") ;
         AV42Cantold = CommonUtil.decimalVal( httpContext.GetPar( "Cantold"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Cantold", GXutil.ltrimstr( AV42Cantold, 11, 3));
         A686PrdCant = CommonUtil.decimalVal( httpContext.GetPar( "PrdCant"), ".") ;
         AV16TotKgs = CommonUtil.decimalVal( httpContext.GetPar( "TotKgs"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16TotKgs", GXutil.ltrimstr( AV16TotKgs, 10, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGS", getSecureSignedToken( "", localUtil.format( AV16TotKgs, "ZZZZZZ9.99")));
         AV17Volumen = (int)(GXutil.lval( httpContext.GetPar( "Volumen"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Volumen), 5, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLUMEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Volumen), "ZZZZ9")));
         AV29Valcos = (short)(GXutil.lval( httpContext.GetPar( "Valcos"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Valcos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Valcos), 4, 0));
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         n490ForPrdUMe = false ;
         A431FacCon = CommonUtil.decimalVal( httpContext.GetPar( "FacCon"), ".") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_42_3X410( A396EmprCod, A872RecPrdNum, AV42Cantold, A686PrdCant, AV16TotKgs, AV17Volumen, AV29Valcos, A490ForPrdUMe, A431FacCon) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action53") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV113Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV113Pgmname", AV113Pgmname);
         AV33UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33UsurCod", AV33UsurCod);
         AV36Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Station", AV36Station);
         AV44Texto_i = httpContext.GetPar( "Texto_i") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44Texto_i", AV44Texto_i);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_53_3X410( A396EmprCod, AV113Pgmname, AV33UsurCod, AV36Station, AV44Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action54") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV113Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV113Pgmname", AV113Pgmname);
         AV33UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33UsurCod", AV33UsurCod);
         AV36Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Station", AV36Station);
         AV44Texto_i = httpContext.GetPar( "Texto_i") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44Texto_i", AV44Texto_i);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A431FacCon = CommonUtil.decimalVal( httpContext.GetPar( "FacCon"), ".") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_54_3X410( A396EmprCod, AV113Pgmname, AV33UsurCod, AV36Station, AV44Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar, A431FacCon) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action55") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV113Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV113Pgmname", AV113Pgmname);
         AV33UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33UsurCod", AV33UsurCod);
         AV36Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Station", AV36Station);
         AV47Texto_iii = httpContext.GetPar( "Texto_iii") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Texto_iii", AV47Texto_iii);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A686PrdCant = CommonUtil.decimalVal( httpContext.GetPar( "PrdCant"), ".") ;
         A431FacCon = CommonUtil.decimalVal( httpContext.GetPar( "FacCon"), ".") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_55_3X410( A396EmprCod, AV113Pgmname, AV33UsurCod, AV36Station, AV47Texto_iii, A129BarCod, A132BarCodReo, A130BarCodPar, A686PrdCant, A431FacCon) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action56") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV113Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV113Pgmname", AV113Pgmname);
         AV33UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33UsurCod", AV33UsurCod);
         AV36Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Station", AV36Station);
         AV64Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64Inc_obs", AV64Inc_obs);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A5725RecLote = httpContext.GetPar( "RecLote") ;
         AV65oldRecLote = httpContext.GetPar( "oldRecLote") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65oldRecLote", AV65oldRecLote);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_56_3X410( A396EmprCod, AV113Pgmname, AV33UsurCod, AV36Station, AV64Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar, A5725RecLote, AV65oldRecLote) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel15"+"_"+"RECPRDDSCF") == 0 )
      {
         A874RecPrdFind = httpContext.GetPar( "RecPrdFind") ;
         n874RecPrdFind = false ;
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A872RecPrdNum = httpContext.GetPar( "RecPrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx15asarecprddscf3X410( A874RecPrdFind, A396EmprCod, A872RecPrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_71") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         n490ForPrdUMe = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_71( A396EmprCod, A490ForPrdUMe) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_72") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A872RecPrdNum = httpContext.GetPar( "RecPrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_72( A396EmprCod, A872RecPrdNum) ;
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
            AV104EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104EmprCod", AV104EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV104EmprCod, "@!"))));
            AV105BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105BarCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV105BarCod), "ZZZZZZZ9")));
            AV106BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106BarCodReo", GXutil.str( AV106BarCodReo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV106BarCodReo), "9")));
            AV107BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107BarCodPar", AV107BarCodPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV107BarCodPar, ""))));
            AV108RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108RecLinMaq), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV108RecLinMaq), "ZZZ9")));
            AV109RecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "RecLinPro"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109RecLinPro), 2, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINPRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV109RecLinPro), "Z9")));
            AV16TotKgs = CommonUtil.decimalVal( httpContext.GetPar( "TotKgs"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TotKgs", GXutil.ltrimstr( AV16TotKgs, 10, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGS", getSecureSignedToken( "", localUtil.format( AV16TotKgs, "ZZZZZZ9.99")));
            AV17Volumen = (int)(GXutil.lval( httpContext.GetPar( "Volumen"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Volumen), 5, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLUMEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Volumen), "ZZZZ9")));
            AV37FecPan = localUtil.parseDateParm( httpContext.GetPar( "FecPan")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37FecPan", localUtil.format(AV37FecPan, "99/99/99"));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECPAN", getSecureSignedToken( "", AV37FecPan));
            AV18Modif = httpContext.GetPar( "Modif") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
            AV110BarNHdr = httpContext.GetPar( "BarNHdr") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110BarNHdr", AV110BarNHdr);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNHDR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV110BarNHdr, ""))));
            AV111ProForDsc = httpContext.GetPar( "ProForDsc") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111ProForDsc", AV111ProForDsc);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV111ProForDsc, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento Productos en Receta", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
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
      nRC_GXsfl_51 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_51"))) ;
      nGXsfl_51_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_51_idx"))) ;
      sGXsfl_51_idx = httpContext.GetPar( "sGXsfl_51_idx") ;
      edtPrdExiCC_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdExiCC_Enabled = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdExiCC_Width = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Width), 9, 0), !bGXsfl_51_Refreshing);
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      AV66AvisoPesaje = (byte)(GXutil.lval( httpContext.GetPar( "AvisoPesaje"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      AV63Artemalha = (byte)(GXutil.lval( httpContext.GetPar( "Artemalha"))) ;
      AV67NoCantidad = (byte)(GXutil.lval( httpContext.GetPar( "NoCantidad"))) ;
      AV57Moda21 = (byte)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public treclin_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public treclin_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( treclin_impl.class ));
   }

   public treclin_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavProfordsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavProfordsc_Internalname, httpContext.getMessage( "Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavProfordsc_Internalname, GXutil.rtrim( AV111ProForDsc), GXutil.rtrim( localUtil.format( AV111ProForDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProfordsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProfordsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavValcos_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavValcos_Internalname, httpContext.getMessage( "Parametro", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavValcos_Internalname, GXutil.ltrim( localUtil.ntoc( AV29Valcos, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavValcos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV29Valcos), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV29Valcos), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavValcos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavValcos_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRECLIN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotkgs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavTotkgs_Internalname, httpContext.getMessage( "Total Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavTotkgs_Internalname, GXutil.ltrim( localUtil.ntoc( AV16TotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotkgs_Enabled!=0) ? localUtil.format( AV16TotKgs, "ZZZZZZ9.99") : localUtil.format( AV16TotKgs, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotkgs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotkgs_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRECLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavVolumen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavVolumen_Internalname, httpContext.getMessage( "Volumen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavVolumen_Internalname, GXutil.ltrim( localUtil.ntoc( AV17Volumen, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavVolumen_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV17Volumen), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV17Volumen), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavVolumen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavVolumen_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRECLIN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavModo_Internalname, GXutil.rtrim( AV112Modo), GXutil.rtrim( localUtil.format( AV112Modo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavModo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavModo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECLIN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECLIN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV110BarNHdr), GXutil.rtrim( localUtil.format( AV110BarNHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnhdr_Jsonclick, 0, "Attribute", "", "", "", "", edtavBarnhdr_Visible, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECLIN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavReclinmaq_Internalname, GXutil.ltrim( localUtil.ntoc( AV108RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavReclinmaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV108RecLinMaq), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV108RecLinMaq), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavReclinmaq_Jsonclick, 0, "Attribute", "", "", "", "", edtavReclinmaq_Visible, edtavReclinmaq_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRECLIN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavReclinpro_Internalname, GXutil.ltrim( localUtil.ntoc( AV109RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavReclinpro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV109RecLinPro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV109RecLinPro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavReclinpro_Jsonclick, 0, "Attribute", "", "", "", "", edtavReclinpro_Visible, edtavReclinpro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRECLIN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol51( ) ;
      nGXsfl_51_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount410 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_410 = (short)(1) ;
            scanStart3X410( ) ;
            while ( RcdFound410 != 0 )
            {
               init_level_properties410( ) ;
               getByPrimaryKey3X410( ) ;
               addRow3X410( ) ;
               scanNext3X410( ) ;
            }
            scanEnd3X410( ) ;
            nBlankRcdCount410 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal3X410( ) ;
         standaloneModal3X410( ) ;
         sMode410 = Gx_mode ;
         while ( nGXsfl_51_idx < nRC_GXsfl_51 )
         {
            bGXsfl_51_Refreshing = true ;
            readRow3X410( ) ;
            edtRecLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECLIN_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLin_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecPrdNum_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDNUM_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPrdNum_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdNum_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
            edtRecPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDNUM_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdNum_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecPrdFind_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDFIND_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPrdFind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdFind_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecPrdDsc_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDDSC_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDsc_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDsc_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
            edtRecPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDDSC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDsc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecPrdDscf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDDSCF_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDscf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDscf_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtFacCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACCON_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCon_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtPrdCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANT_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecForNro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECFORNRO_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecForNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecForNro_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecPrdTnq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDTNQ_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPrdTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdTnq_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecLote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECLOTE_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLote_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecMar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECMAR_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecMar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMar_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtPrdExiAlm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXIALM_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtPrdCanRes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANRES_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtPrdExiCC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXICC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtPrdExiCC_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXICC_"+sGXsfl_51_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Visible), 5, 0), !bGXsfl_51_Refreshing);
            edtPrdExiCC_Width = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXICC_"+sGXsfl_51_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Width), 9, 0), !bGXsfl_51_Refreshing);
            edtCantProduc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CANTPRODUC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCantProduc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCantProduc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            if ( ( nRcdExists_410 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal3X410( ) ;
            }
            sendRow3X410( ) ;
            bGXsfl_51_Refreshing = false ;
         }
         Gx_mode = sMode410 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount410 = (short)(5) ;
         nRcdExists_410 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart3X410( ) ;
            while ( RcdFound410 != 0 )
            {
               sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_51410( ) ;
               init_level_properties410( ) ;
               standaloneNotModal3X410( ) ;
               getByPrimaryKey3X410( ) ;
               standaloneModal3X410( ) ;
               addRow3X410( ) ;
               scanNext3X410( ) ;
            }
            scanEnd3X410( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode410 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_51410( ) ;
         initAll3X410( ) ;
         init_level_properties410( ) ;
         nRcdExists_410 = (short)(0) ;
         nIsMod_410 = (short)(0) ;
         nRcdDeleted_410 = (short)(0) ;
         nBlankRcdCount410 = (short)(nBlankRcdUsr410+nBlankRcdCount410) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount410 > 0 )
         {
            standaloneNotModal3X410( ) ;
            standaloneModal3X410( ) ;
            addRow3X410( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtRecLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount410 = (short)(nBlankRcdCount410-1) ;
         }
         Gx_mode = sMode410 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
      e113X2 ();
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
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_51 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_51"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV104EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV105BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV106BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "BARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV107BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            A130BarCodPar = httpContext.cgiGet( "BARCODPAR") ;
            A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( "RECLINMAQ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( "RECLINPRO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV18Modif = httpContext.cgiGet( "vMODIF") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV113Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( "PRDFACCON")) ;
            n707PrdFacCon = false ;
            A238CanRes = localUtil.ctond( httpContext.cgiGet( "CANRES")) ;
            AV42Cantold = localUtil.ctond( httpContext.cgiGet( "vCANTOLD")) ;
            A873RecPrdNom = httpContext.cgiGet( "RECPRDNOM") ;
            n873RecPrdNom = false ;
            A719PrdNum = httpContext.cgiGet( "PRDNUM") ;
            AV20Flag = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAG"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV50Suprema = (byte)(localUtil.ctol( httpContext.cgiGet( "vSUPREMA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV65oldRecLote = httpContext.cgiGet( "vOLDRECLOTE") ;
            AV44Texto_i = httpContext.cgiGet( "vTEXTO_I") ;
            AV47Texto_iii = httpContext.cgiGet( "vTEXTO_III") ;
            AV63Artemalha = (byte)(localUtil.ctol( httpContext.cgiGet( "vARTEMALHA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10881PrdLote = httpContext.cgiGet( "PRDLOTE") ;
            n10881PrdLote = false ;
            AV70Lote01 = (byte)(localUtil.ctol( httpContext.cgiGet( "vLOTE01"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "PRVNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n795PrvNum = false ;
            A11708RecProv = (int)(localUtil.ctol( httpContext.cgiGet( "RECPROV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12710PrdCantOrg = localUtil.ctond( httpContext.cgiGet( "PRDCANTORG")) ;
            AV67NoCantidad = (byte)(localUtil.ctol( httpContext.cgiGet( "vNOCANTIDAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV57Moda21 = (byte)(localUtil.ctol( httpContext.cgiGet( "vMODA21"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12641RecPrdDc2 = httpContext.cgiGet( "RECPRDDC2") ;
            AV64Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV72msgErr = httpContext.cgiGet( "vMSGERR") ;
            AV58AlmCC = (byte)(localUtil.ctol( httpContext.cgiGet( "vALMCC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "VALCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n856ValCod = false ;
            AV71EliminarReceta = (byte)(localUtil.ctol( httpContext.cgiGet( "vELIMINARRECETA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV45Err_und = (byte)(localUtil.ctol( httpContext.cgiGet( "vERR_UND"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV36Station = httpContext.cgiGet( "vSTATION") ;
            A4576RecLinUsr = httpContext.cgiGet( "RECLINUSR") ;
            AV66AvisoPesaje = (byte)(localUtil.ctol( httpContext.cgiGet( "vAVISOPESAJE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A683PrdCanFin = localUtil.ctond( httpContext.cgiGet( "PRDCANFIN")) ;
            A1797PrdCanAny = localUtil.ctond( httpContext.cgiGet( "PRDCANANY")) ;
            A3938RecCanEns = localUtil.ctond( httpContext.cgiGet( "RECCANENS")) ;
            A5422RecSalMP = (short)(localUtil.ctol( httpContext.cgiGet( "RECSALMP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5467RecSalVol = (int)(localUtil.ctol( httpContext.cgiGet( "RECSALVOL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5527RecLinRea = httpContext.cgiGet( "RECLINREA") ;
            A8934RecPes = (byte)(localUtil.ctol( httpContext.cgiGet( "RECPES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8937RecAcc = httpContext.cgiGet( "RECACC") ;
            A9813FacCon1 = localUtil.ctond( httpContext.cgiGet( "FACCON1")) ;
            A3804RecFecMov = localUtil.ctod( httpContext.cgiGet( "RECFECMOV"), 0) ;
            A3805RecAnyTie = (short)(localUtil.ctol( httpContext.cgiGet( "RECANYTIE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3806RecUltAny = localUtil.ctond( httpContext.cgiGet( "RECULTANY")) ;
            A3807RecPorAny = localUtil.ctond( httpContext.cgiGet( "RECPORANY")) ;
            A4900PrdCanMac = localUtil.ctond( httpContext.cgiGet( "PRDCANMAC")) ;
            A4577RecPesFec = localUtil.ctot( httpContext.cgiGet( "RECPESFEC"), 0) ;
            A12717RecFabId = (int)(localUtil.ctol( httpContext.cgiGet( "RECFABID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13937RecLotAlm = (short)(localUtil.ctol( httpContext.cgiGet( "RECLOTALM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13938RecLoteFch = localUtil.ctod( httpContext.cgiGet( "RECLOTEFCH"), 0) ;
            A706PrdExiCCP = localUtil.ctond( httpContext.cgiGet( "PRDEXICCP")) ;
            n706PrdExiCCP = false ;
            A5418PrdSalM = httpContext.cgiGet( "PRDSALM") ;
            n5418PrdSalM = false ;
            A13232PrdRGB = localUtil.ctol( httpContext.cgiGet( "PRDRGB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            n13232PrdRGB = false ;
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
            AV111ProForDsc = httpContext.cgiGet( edtavProfordsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111ProForDsc", AV111ProForDsc);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV111ProForDsc, ""))));
            AV29Valcos = (short)(localUtil.ctol( httpContext.cgiGet( edtavValcos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29Valcos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Valcos), 4, 0));
            AV16TotKgs = localUtil.ctond( httpContext.cgiGet( edtavTotkgs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TotKgs", GXutil.ltrimstr( AV16TotKgs, 10, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGS", getSecureSignedToken( "", localUtil.format( AV16TotKgs, "ZZZZZZ9.99")));
            AV17Volumen = (int)(localUtil.ctol( httpContext.cgiGet( edtavVolumen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Volumen), 5, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLUMEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Volumen), "ZZZZ9")));
            AV112Modo = httpContext.cgiGet( edtavModo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV112Modo", AV112Modo);
            AV110BarNHdr = httpContext.cgiGet( edtavBarnhdr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110BarNHdr", AV110BarNHdr);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNHDR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV110BarNHdr, ""))));
            AV108RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtavReclinmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108RecLinMaq), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV108RecLinMaq), "ZZZ9")));
            AV109RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtavReclinpro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109RecLinPro), 2, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINPRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV109RecLinPro), "Z9")));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TRECLIN");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("treclin:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                  sMode409 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode409 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound409 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_3X0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "");
                     AnyError = (short)(1) ;
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
                        e113X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e123X2 ();
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
         e123X2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll3X409( ) ;
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
         disableAttributes3X409( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavProfordsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProfordsc_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavValcos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValcos_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavTotkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotkgs_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavVolumen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVolumen_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavModo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModo_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinmaq_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinpro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinpro_Enabled), 5, 0), true);
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

   public void confirm_3X0( )
   {
      beforeValidate3X409( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls3X409( ) ;
         }
         else
         {
            checkExtendedTable3X409( ) ;
            closeExtendedTableCursors3X409( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode409 = Gx_mode ;
         confirm_3X410( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode409 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode409 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_3X410( )
   {
      sV18Modif = OV18Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
      nGXsfl_51_idx = 0 ;
      while ( nGXsfl_51_idx < nRC_GXsfl_51 )
      {
         readRow3X410( ) ;
         if ( ( nRcdExists_410 != 0 ) || ( nIsMod_410 != 0 ) )
         {
            getKey3X410( ) ;
            if ( ( nRcdExists_410 == 0 ) && ( nRcdDeleted_410 == 0 ) )
            {
               if ( RcdFound410 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate3X410( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable3X410( ) ;
                     closeExtendedTableCursors3X410( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     OV18Modif = AV18Modif ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
                  }
               }
               else
               {
                  GXCCtl = "RECLIN_" + sGXsfl_51_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRecLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound410 != 0 )
               {
                  if ( nRcdDeleted_410 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey3X410( ) ;
                     load3X410( ) ;
                     beforeValidate3X410( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls3X410( ) ;
                        OV18Modif = AV18Modif ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
                     }
                  }
                  else
                  {
                     if ( nIsMod_410 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate3X410( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable3X410( ) ;
                           closeExtendedTableCursors3X410( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           OV18Modif = AV18Modif ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_410 == 0 )
                  {
                     GXCCtl = "RECLIN_" + sGXsfl_51_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRecLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtRecLin_Internalname, GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecPrdNum_Internalname, GXutil.rtrim( A872RecPrdNum)) ;
         httpContext.changePostValue( edtRecPrdFind_Internalname, GXutil.rtrim( A874RecPrdFind)) ;
         httpContext.changePostValue( edtRecPrdDsc_Internalname, GXutil.rtrim( A875RecPrdDsc)) ;
         httpContext.changePostValue( edtRecPrdDscf_Internalname, GXutil.rtrim( A13897RecPrdDscf)) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdCant_Internalname, GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecForNro_Internalname, GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecPrdTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecLote_Internalname, GXutil.rtrim( A5725RecLote)) ;
         httpContext.changePostValue( edtRecMar_Internalname, GXutil.ltrim( localUtil.ntoc( A4024RecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdCanRes_Internalname, GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCantProduc_Internalname, GXutil.ltrim( localUtil.ntoc( A13832CantProduc, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z811RecLin_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z875RecPrdDsc_"+sGXsfl_51_idx, GXutil.rtrim( Z875RecPrdDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z686PrdCant_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5725RecLote_"+sGXsfl_51_idx, GXutil.rtrim( Z5725RecLote)) ;
         httpContext.changePostValue( "ZT_"+"Z11708RecProv_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z11708RecProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12710PrdCantOrg_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z12710PrdCantOrg, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12641RecPrdDc2_"+sGXsfl_51_idx, GXutil.rtrim( Z12641RecPrdDc2)) ;
         httpContext.changePostValue( "ZT_"+"Z431FacCon_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z683PrdCanFin_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z683PrdCanFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1797PrdCanAny_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z1797PrdCanAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2394RecForNro_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3274RecPrdTnq_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3938RecCanEns_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3938RecCanEns, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4024RecMar_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z4024RecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5422RecSalMP_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z5422RecSalMP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5467RecSalVol_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z5467RecSalVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5527RecLinRea_"+sGXsfl_51_idx, GXutil.rtrim( Z5527RecLinRea)) ;
         httpContext.changePostValue( "ZT_"+"Z8934RecPes_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z8934RecPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8937RecAcc_"+sGXsfl_51_idx, GXutil.rtrim( Z8937RecAcc)) ;
         httpContext.changePostValue( "ZT_"+"Z9813FacCon1_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z9813FacCon1, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3804RecFecMov_"+sGXsfl_51_idx, localUtil.dtoc( Z3804RecFecMov, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z3805RecAnyTie_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3805RecAnyTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3806RecUltAny_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3806RecUltAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3807RecPorAny_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3807RecPorAny, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4900PrdCanMac_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z4900PrdCanMac, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4576RecLinUsr_"+sGXsfl_51_idx, GXutil.rtrim( Z4576RecLinUsr)) ;
         httpContext.changePostValue( "ZT_"+"Z4577RecPesFec_"+sGXsfl_51_idx, localUtil.ttoc( Z4577RecPesFec, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12717RecFabId_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z12717RecFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z872RecPrdNum_"+sGXsfl_51_idx, GXutil.rtrim( Z872RecPrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z13937RecLotAlm_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z13937RecLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13938RecLoteFch_"+sGXsfl_51_idx, localUtil.dtoc( Z13938RecLoteFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_51_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z707PrdFacCon_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z704PrdExiAlm_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z705PrdExiCC_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z706PrdExiCCP_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z706PrdExiCCP, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5418PrdSalM_"+sGXsfl_51_idx, GXutil.rtrim( Z5418PrdSalM)) ;
         httpContext.changePostValue( "ZT_"+"Z10881PrdLote_"+sGXsfl_51_idx, GXutil.rtrim( Z10881PrdLote)) ;
         httpContext.changePostValue( "ZT_"+"Z13232PrdRGB_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z795PrvNum_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z856ValCod_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T431FacCon_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T686PrdCant_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5725RecLote_"+sGXsfl_51_idx, GXutil.rtrim( O5725RecLote)) ;
         httpContext.changePostValue( "T490ForPrdUMe_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2394RecForNro_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T238CanRes_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O238CanRes, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T685PrdCanRes_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T719PrdNum_"+sGXsfl_51_idx, GXutil.rtrim( O719PrdNum)) ;
         httpContext.changePostValue( "T873RecPrdNom_"+sGXsfl_51_idx, GXutil.rtrim( O873RecPrdNom)) ;
         httpContext.changePostValue( "T872RecPrdNum_"+sGXsfl_51_idx, GXutil.rtrim( O872RecPrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_410_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_410, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_410_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_410, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_410_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_410, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N686PrdCant_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N5725RecLote_"+sGXsfl_51_idx, GXutil.rtrim( A5725RecLote)) ;
         if ( nIsMod_410 != 0 )
         {
            httpContext.changePostValue( "RECLIN_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDNUM_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdNum_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDNUM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDFIND_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdFind_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDDSC_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDDSC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDDSCF_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdDscf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACCON_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANT_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECFORNRO_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecForNro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDTNQ_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdTnq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECLOTE_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECMAR_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecMar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXIALM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANRES_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXICC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXICC_"+sGXsfl_51_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXICC_"+sGXsfl_51_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Width, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CANTPRODUC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCantProduc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      OV18Modif = sV18Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption3X0( )
   {
   }

   public void e113X2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV36Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      treclin_impl.this.GXt_char1 = GXv_char2[0] ;
      AV36Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Station", AV36Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = A407EmprNom ;
      GXv_char4[0] = AV33UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV36Station, GXv_char2, GXv_char3, GXv_char4) ;
      treclin_impl.this.A396EmprCod = GXv_char2[0] ;
      treclin_impl.this.A407EmprNom = GXv_char3[0] ;
      treclin_impl.this.AV33UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV33UsurCod", AV33UsurCod);
      AV39Dosifi = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Dosifi", GXutil.str( AV39Dosifi, 1, 0));
      GXv_int5[0] = AV39Dosifi ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DOSIFI", ""), GXv_int5) ;
      treclin_impl.this.AV39Dosifi = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Dosifi", GXutil.str( AV39Dosifi, 1, 0));
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = "030100" ;
      GXv_int6[0] = AV29Valcos ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
      treclin_impl.this.A396EmprCod = GXv_char4[0] ;
      treclin_impl.this.AV29Valcos = (short)((short)(GXv_int6[0])) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV29Valcos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Valcos), 4, 0));
      GXv_int5[0] = AV20Flag ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, "038001", GXv_int5) ;
      treclin_impl.this.AV20Flag = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Flag", GXutil.str( AV20Flag, 1, 0));
      AV40Centra = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Centra", GXutil.str( AV40Centra, 1, 0));
      GXv_int5[0] = AV40Centra ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CENTRA", ""), GXv_int5) ;
      treclin_impl.this.AV40Centra = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Centra", GXutil.str( AV40Centra, 1, 0));
      GXt_int7 = AV41F_pizarro ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PIZARR", ""), GXv_int5) ;
      treclin_impl.this.GXt_int7 = GXv_int5[0] ;
      AV41F_pizarro = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41F_pizarro", GXutil.str( AV41F_pizarro, 1, 0));
      GXt_int7 = AV45Err_und ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERRUND", ""), GXv_int5) ;
      treclin_impl.this.GXt_int7 = GXv_int5[0] ;
      AV45Err_und = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Err_und", GXutil.str( AV45Err_und, 1, 0));
      AV48FlagCColor = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48FlagCColor", GXutil.str( AV48FlagCColor, 1, 0));
      GXv_int5[0] = AV48FlagCColor ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "10002E", ""), GXv_int5) ;
      treclin_impl.this.AV48FlagCColor = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48FlagCColor", GXutil.str( AV48FlagCColor, 1, 0));
      edtPrdExiCC_Visible = AV48FlagCColor ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Visible), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdExiCC_Enabled = AV48FlagCColor ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      if ( AV48FlagCColor == 0 )
      {
         edtPrdExiCC_Width = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Width), 9, 0), !bGXsfl_51_Refreshing);
      }
      GXt_int7 = AV50Suprema ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SUPREM", ""), GXv_int5) ;
      treclin_impl.this.GXt_int7 = GXv_int5[0] ;
      AV50Suprema = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Suprema", GXutil.str( AV50Suprema, 1, 0));
      AV49Proforfab = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Proforfab", AV49Proforfab);
      AV55Lit50 = httpContext.getMessage( "Volumen", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Lit50", AV55Lit50);
      AV56Lit51 = httpContext.getMessage( "Kgs", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Lit51", AV56Lit51);
      GXt_int7 = AV57Moda21 ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int5) ;
      treclin_impl.this.GXt_int7 = GXv_int5[0] ;
      AV57Moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Moda21", GXutil.str( AV57Moda21, 1, 0));
      GXv_int5[0] = AV58AlmCC ;
      new app.popcion(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "10002E", ""), GXv_int5) ;
      treclin_impl.this.AV58AlmCC = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58AlmCC", GXutil.str( AV58AlmCC, 1, 0));
      if ( AV58AlmCC == 1 )
      {
         AV19msg4 = GXutil.trim( AV19msg4) + " " + httpContext.getMessage( "C.C.", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19msg4", AV19msg4);
      }
      else
      {
         AV19msg4 = GXutil.trim( AV19msg4) + " " + httpContext.getMessage( "General", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19msg4", AV19msg4);
      }
      GXt_int8 = AV60Factor8 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "STDFAT", "") ;
      GXv_int6[0] = GXt_int8 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
      treclin_impl.this.A396EmprCod = GXv_char4[0] ;
      treclin_impl.this.GXt_int8 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV60Factor8 = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Factor8", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Factor8), 8, 0));
      AV59Factor = (short)(AV60Factor8/ (double) (100)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Factor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Factor), 3, 0));
      AV61MsgErrFactor = httpContext.getMessage( "AVISO.Las cantidades ingresadas superan el estándar.Confirma?", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61MsgErrFactor", AV61MsgErrFactor);
      AV62Conf = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62Conf", AV62Conf);
      GXt_int7 = AV63Artemalha ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEMH", ""), GXv_int5) ;
      treclin_impl.this.GXt_int7 = GXv_int5[0] ;
      AV63Artemalha = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Artemalha", GXutil.str( AV63Artemalha, 1, 0));
      GXt_int7 = AV66AvisoPesaje ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "WARPES", ""), GXv_int5) ;
      treclin_impl.this.GXt_int7 = GXv_int5[0] ;
      AV66AvisoPesaje = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66AvisoPesaje", GXutil.str( AV66AvisoPesaje, 1, 0));
      GXt_int7 = AV67NoCantidad ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOCTD", ""), GXv_int5) ;
      treclin_impl.this.GXt_int7 = GXv_int5[0] ;
      AV67NoCantidad = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67NoCantidad", GXutil.str( AV67NoCantidad, 1, 0));
      AV69msg_err1 = httpContext.getMessage( "Atencion.El codigo de producto, NO se puede modificar", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69msg_err1", AV69msg_err1);
      AV69msg_err1 += httpContext.getMessage( "El procedimiento es:", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69msg_err1", AV69msg_err1);
      AV69msg_err1 += httpContext.getMessage( "Eliminar Linea.", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69msg_err1", AV69msg_err1);
      AV69msg_err1 += httpContext.getMessage( "Añadir Linea.", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69msg_err1", AV69msg_err1);
      GXt_int7 = AV70Lote01 ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "01LOTE", ""), GXv_int5) ;
      treclin_impl.this.GXt_int7 = GXv_int5[0] ;
      AV70Lote01 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Lote01", GXutil.str( AV70Lote01, 1, 0));
      GXt_int7 = AV71EliminarReceta ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INCI92", ""), GXv_int5) ;
      treclin_impl.this.GXt_int7 = GXv_int5[0] ;
      AV71EliminarReceta = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71EliminarReceta", GXutil.str( AV71EliminarReceta, 1, 0));
      GXt_int7 = AV94SiRGB ;
      GXv_int5[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIPRGB", ""), GXv_int5) ;
      treclin_impl.this.GXt_int7 = GXv_int5[0] ;
      AV94SiRGB = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94SiRGB", GXutil.str( AV94SiRGB, 1, 0));
      AV112Modo = Gx_mode ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112Modo", AV112Modo);
      GXt_char1 = AV36Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      treclin_impl.this.GXt_char1 = GXv_char4[0] ;
      AV36Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Station", AV36Station);
      GXv_char4[0] = AV104EmprCod ;
      GXv_char3[0] = AV38EmprNom ;
      GXv_char2[0] = AV33UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV36Station, GXv_char4, GXv_char3, GXv_char2) ;
      treclin_impl.this.AV104EmprCod = GXv_char4[0] ;
      treclin_impl.this.AV38EmprNom = GXv_char3[0] ;
      treclin_impl.this.AV33UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104EmprCod", AV104EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV104EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV38EmprNom", AV38EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV33UsurCod", AV33UsurCod);
      GXv_SdtWWPContext9[0] = AV101WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV101WWPContext = GXv_SdtWWPContext9[0] ;
      AV102TrnContext.fromxml(AV103WebSession.getValue("TrnContext"), null, null);
      edtavBarnhdr_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Visible), 5, 0), true);
      edtavReclinmaq_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinmaq_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinmaq_Visible), 5, 0), true);
      edtavReclinpro_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinpro_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinpro_Visible), 5, 0), true);
   }

   public void e123X2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV18Modif});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV18Modif"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm3X409( int GX_JID )
   {
      if ( ( GX_JID == 65 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -65 )
      {
         Z1273RecLinPro = A1273RecLinPro ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2804RecLinMaq = A2804RecLinMaq ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      AV113Pgmname = "TRECLIN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV113Pgmname", AV113Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV104EmprCod)==0) )
      {
         A396EmprCod = AV104EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T003X13 */
      pr_default.execute(9, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(9);
      if ( ! (0==AV105BarCod) )
      {
         A129BarCod = AV105BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV106BarCodReo) )
      {
         A132BarCodReo = AV106BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (GXutil.strcmp("", AV107BarCodPar)==0) )
      {
         A130BarCodPar = AV107BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      if ( ! (0==AV108RecLinMaq) )
      {
         A2804RecLinMaq = AV108RecLinMaq ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
      }
      /* Using cursor T003X14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "RECMAQ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECLINMAQ");
         AnyError = (short)(1) ;
      }
      pr_default.close(10);
      if ( ! (0==AV109RecLinPro) )
      {
         A1273RecLinPro = AV109RecLinPro ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
      }
   }

   public void standaloneModal( )
   {
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
   }

   public void load3X409( )
   {
      /* Using cursor T003X15 */
      pr_default.execute(11, new Object[] {Byte.valueOf(A1273RecLinPro), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound409 = (short)(1) ;
         zm3X409( -65) ;
      }
      pr_default.close(11);
      onLoadActions3X409( ) ;
   }

   public void onLoadActions3X409( )
   {
   }

   public void checkExtendedTable3X409( )
   {
      nIsDirty_409 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors3X409( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey3X409( )
   {
      /* Using cursor T003X16 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound409 = (short)(1) ;
      }
      else
      {
         RcdFound409 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T003X12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
      if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T003X12_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm3X409( 65) ;
         RcdFound409 = (short)(1) ;
         A1273RecLinPro = T003X12_A1273RecLinPro[0] ;
         A129BarCod = T003X12_A129BarCod[0] ;
         A132BarCodReo = T003X12_A132BarCodReo[0] ;
         A130BarCodPar = T003X12_A130BarCodPar[0] ;
         A2804RecLinMaq = T003X12_A2804RecLinMaq[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2804RecLinMaq = A2804RecLinMaq ;
         Z1273RecLinPro = A1273RecLinPro ;
         sMode409 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load3X409( ) ;
         if ( AnyError == 1 )
         {
            RcdFound409 = (short)(0) ;
            initializeNonKey3X409( ) ;
         }
         Gx_mode = sMode409 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound409 = (short)(0) ;
         initializeNonKey3X409( ) ;
         sMode409 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode409 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(8);
   }

   public void getEqualNoModal( )
   {
      getKey3X409( ) ;
      if ( RcdFound409 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound409 = (short)(0) ;
      /* Using cursor T003X17 */
      pr_default.execute(13, new Object[] {Byte.valueOf(A1273RecLinPro), Byte.valueOf(A1273RecLinPro), Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A1273RecLinPro), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Byte.valueOf(A1273RecLinPro), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Byte.valueOf(A1273RecLinPro), Short.valueOf(A2804RecLinMaq), A396EmprCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T003X17_A1273RecLinPro[0] < A1273RecLinPro ) || ( T003X17_A1273RecLinPro[0] == A1273RecLinPro ) && ( T003X17_A129BarCod[0] < A129BarCod ) || ( T003X17_A129BarCod[0] == A129BarCod ) && ( T003X17_A1273RecLinPro[0] == A1273RecLinPro ) && ( T003X17_A132BarCodReo[0] < A132BarCodReo ) || ( T003X17_A132BarCodReo[0] == A132BarCodReo ) && ( T003X17_A129BarCod[0] == A129BarCod ) && ( T003X17_A1273RecLinPro[0] == A1273RecLinPro ) && ( GXutil.strcmp(T003X17_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T003X17_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T003X17_A132BarCodReo[0] == A132BarCodReo ) && ( T003X17_A129BarCod[0] == A129BarCod ) && ( T003X17_A1273RecLinPro[0] == A1273RecLinPro ) && ( T003X17_A2804RecLinMaq[0] < A2804RecLinMaq ) ) && ( GXutil.strcmp(T003X17_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T003X17_A1273RecLinPro[0] > A1273RecLinPro ) || ( T003X17_A1273RecLinPro[0] == A1273RecLinPro ) && ( T003X17_A129BarCod[0] > A129BarCod ) || ( T003X17_A129BarCod[0] == A129BarCod ) && ( T003X17_A1273RecLinPro[0] == A1273RecLinPro ) && ( T003X17_A132BarCodReo[0] > A132BarCodReo ) || ( T003X17_A132BarCodReo[0] == A132BarCodReo ) && ( T003X17_A129BarCod[0] == A129BarCod ) && ( T003X17_A1273RecLinPro[0] == A1273RecLinPro ) && ( GXutil.strcmp(T003X17_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T003X17_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T003X17_A132BarCodReo[0] == A132BarCodReo ) && ( T003X17_A129BarCod[0] == A129BarCod ) && ( T003X17_A1273RecLinPro[0] == A1273RecLinPro ) && ( T003X17_A2804RecLinMaq[0] > A2804RecLinMaq ) ) && ( GXutil.strcmp(T003X17_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1273RecLinPro = T003X17_A1273RecLinPro[0] ;
            A129BarCod = T003X17_A129BarCod[0] ;
            A132BarCodReo = T003X17_A132BarCodReo[0] ;
            A130BarCodPar = T003X17_A130BarCodPar[0] ;
            A2804RecLinMaq = T003X17_A2804RecLinMaq[0] ;
            RcdFound409 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound409 = (short)(0) ;
      /* Using cursor T003X18 */
      pr_default.execute(14, new Object[] {Byte.valueOf(A1273RecLinPro), Byte.valueOf(A1273RecLinPro), Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A1273RecLinPro), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Byte.valueOf(A1273RecLinPro), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Byte.valueOf(A1273RecLinPro), Short.valueOf(A2804RecLinMaq), A396EmprCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T003X18_A1273RecLinPro[0] > A1273RecLinPro ) || ( T003X18_A1273RecLinPro[0] == A1273RecLinPro ) && ( T003X18_A129BarCod[0] > A129BarCod ) || ( T003X18_A129BarCod[0] == A129BarCod ) && ( T003X18_A1273RecLinPro[0] == A1273RecLinPro ) && ( T003X18_A132BarCodReo[0] > A132BarCodReo ) || ( T003X18_A132BarCodReo[0] == A132BarCodReo ) && ( T003X18_A129BarCod[0] == A129BarCod ) && ( T003X18_A1273RecLinPro[0] == A1273RecLinPro ) && ( GXutil.strcmp(T003X18_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T003X18_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T003X18_A132BarCodReo[0] == A132BarCodReo ) && ( T003X18_A129BarCod[0] == A129BarCod ) && ( T003X18_A1273RecLinPro[0] == A1273RecLinPro ) && ( T003X18_A2804RecLinMaq[0] > A2804RecLinMaq ) ) && ( GXutil.strcmp(T003X18_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T003X18_A1273RecLinPro[0] < A1273RecLinPro ) || ( T003X18_A1273RecLinPro[0] == A1273RecLinPro ) && ( T003X18_A129BarCod[0] < A129BarCod ) || ( T003X18_A129BarCod[0] == A129BarCod ) && ( T003X18_A1273RecLinPro[0] == A1273RecLinPro ) && ( T003X18_A132BarCodReo[0] < A132BarCodReo ) || ( T003X18_A132BarCodReo[0] == A132BarCodReo ) && ( T003X18_A129BarCod[0] == A129BarCod ) && ( T003X18_A1273RecLinPro[0] == A1273RecLinPro ) && ( GXutil.strcmp(T003X18_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T003X18_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T003X18_A132BarCodReo[0] == A132BarCodReo ) && ( T003X18_A129BarCod[0] == A129BarCod ) && ( T003X18_A1273RecLinPro[0] == A1273RecLinPro ) && ( T003X18_A2804RecLinMaq[0] < A2804RecLinMaq ) ) && ( GXutil.strcmp(T003X18_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1273RecLinPro = T003X18_A1273RecLinPro[0] ;
            A129BarCod = T003X18_A129BarCod[0] ;
            A132BarCodReo = T003X18_A132BarCodReo[0] ;
            A130BarCodPar = T003X18_A130BarCodPar[0] ;
            A2804RecLinMaq = T003X18_A2804RecLinMaq[0] ;
            RcdFound409 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey3X409( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         AV18Modif = OV18Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
         insert3X409( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound409 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) || ( A1273RecLinPro != Z1273RecLinPro ) )
            {
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( isDlt( ) )
            {
               AV18Modif = OV18Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               AV18Modif = OV18Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
               update3X409( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) || ( A1273RecLinPro != Z1273RecLinPro ) )
            {
               /* Insert record */
               AV18Modif = OV18Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
               insert3X409( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                  AnyError = (short)(1) ;
               }
               else
               {
                  /* Insert record */
                  AV18Modif = OV18Modif ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
                  insert3X409( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) || ( A1273RecLinPro != Z1273RecLinPro ) )
      {
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
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "");
         AnyError = (short)(1) ;
      }
      else
      {
         AV18Modif = OV18Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency3X409( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T003X11 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCRECET"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(7) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCRECET"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert3X409( )
   {
      beforeValidate3X409( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable3X409( ) ;
      }
      if ( AnyError == 0 )
      {
         zm3X409( 0) ;
         checkOptimisticConcurrency3X409( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm3X409( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert3X409( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T003X19 */
                  pr_default.execute(15, new Object[] {Byte.valueOf(A1273RecLinPro), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
                  if ( (pr_default.getStatus(15) == 1) )
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
                        processLevel3X409( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption3X0( ) ;
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
            load3X409( ) ;
         }
         endLevel3X409( ) ;
      }
      closeExtendedTableCursors3X409( ) ;
   }

   public void update3X409( )
   {
      beforeValidate3X409( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable3X409( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency3X409( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm3X409( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate3X409( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCRECET */
                  deferredUpdate3X409( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel3X409( ) ;
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
         endLevel3X409( ) ;
      }
      closeExtendedTableCursors3X409( ) ;
   }

   public void deferredUpdate3X409( )
   {
   }

   public void delete( )
   {
      beforeValidate3X409( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency3X409( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls3X409( ) ;
         afterConfirm3X409( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete3X409( ) ;
            if ( AnyError == 0 )
            {
               AV18Modif = OV18Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
               scanStart3X410( ) ;
               while ( RcdFound410 != 0 )
               {
                  getByPrimaryKey3X410( ) ;
                  delete3X410( ) ;
                  scanNext3X410( ) ;
                  OV18Modif = AV18Modif ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
               }
               scanEnd3X410( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T003X20 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     if ( true /* After */ )
                     {
                        AV18Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
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
      }
      sMode409 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel3X409( ) ;
      Gx_mode = sMode409 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls3X409( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel3X410( )
   {
      sV18Modif = OV18Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
      nGXsfl_51_idx = 0 ;
      while ( nGXsfl_51_idx < nRC_GXsfl_51 )
      {
         readRow3X410( ) ;
         if ( ( nRcdExists_410 != 0 ) || ( nIsMod_410 != 0 ) )
         {
            standaloneNotModal3X410( ) ;
            getKey3X410( ) ;
            if ( ( nRcdExists_410 == 0 ) && ( nRcdDeleted_410 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert3X410( ) ;
            }
            else
            {
               if ( RcdFound410 != 0 )
               {
                  if ( ( nRcdDeleted_410 != 0 ) && ( nRcdExists_410 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete3X410( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_410 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update3X410( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_410 == 0 )
                  {
                     GXCCtl = "RECLIN_" + sGXsfl_51_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRecLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            OV18Modif = AV18Modif ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
         }
         httpContext.changePostValue( edtRecLin_Internalname, GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecPrdNum_Internalname, GXutil.rtrim( A872RecPrdNum)) ;
         httpContext.changePostValue( edtRecPrdFind_Internalname, GXutil.rtrim( A874RecPrdFind)) ;
         httpContext.changePostValue( edtRecPrdDsc_Internalname, GXutil.rtrim( A875RecPrdDsc)) ;
         httpContext.changePostValue( edtRecPrdDscf_Internalname, GXutil.rtrim( A13897RecPrdDscf)) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdCant_Internalname, GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecForNro_Internalname, GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecPrdTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecLote_Internalname, GXutil.rtrim( A5725RecLote)) ;
         httpContext.changePostValue( edtRecMar_Internalname, GXutil.ltrim( localUtil.ntoc( A4024RecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdCanRes_Internalname, GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCantProduc_Internalname, GXutil.ltrim( localUtil.ntoc( A13832CantProduc, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z811RecLin_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z875RecPrdDsc_"+sGXsfl_51_idx, GXutil.rtrim( Z875RecPrdDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z686PrdCant_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5725RecLote_"+sGXsfl_51_idx, GXutil.rtrim( Z5725RecLote)) ;
         httpContext.changePostValue( "ZT_"+"Z11708RecProv_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z11708RecProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12710PrdCantOrg_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z12710PrdCantOrg, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12641RecPrdDc2_"+sGXsfl_51_idx, GXutil.rtrim( Z12641RecPrdDc2)) ;
         httpContext.changePostValue( "ZT_"+"Z431FacCon_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z683PrdCanFin_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z683PrdCanFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1797PrdCanAny_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z1797PrdCanAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2394RecForNro_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3274RecPrdTnq_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3938RecCanEns_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3938RecCanEns, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4024RecMar_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z4024RecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5422RecSalMP_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z5422RecSalMP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5467RecSalVol_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z5467RecSalVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5527RecLinRea_"+sGXsfl_51_idx, GXutil.rtrim( Z5527RecLinRea)) ;
         httpContext.changePostValue( "ZT_"+"Z8934RecPes_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z8934RecPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8937RecAcc_"+sGXsfl_51_idx, GXutil.rtrim( Z8937RecAcc)) ;
         httpContext.changePostValue( "ZT_"+"Z9813FacCon1_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z9813FacCon1, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3804RecFecMov_"+sGXsfl_51_idx, localUtil.dtoc( Z3804RecFecMov, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z3805RecAnyTie_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3805RecAnyTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3806RecUltAny_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3806RecUltAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3807RecPorAny_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3807RecPorAny, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4900PrdCanMac_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z4900PrdCanMac, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4576RecLinUsr_"+sGXsfl_51_idx, GXutil.rtrim( Z4576RecLinUsr)) ;
         httpContext.changePostValue( "ZT_"+"Z4577RecPesFec_"+sGXsfl_51_idx, localUtil.ttoc( Z4577RecPesFec, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12717RecFabId_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z12717RecFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z872RecPrdNum_"+sGXsfl_51_idx, GXutil.rtrim( Z872RecPrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z13937RecLotAlm_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z13937RecLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13938RecLoteFch_"+sGXsfl_51_idx, localUtil.dtoc( Z13938RecLoteFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_51_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z707PrdFacCon_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z704PrdExiAlm_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z705PrdExiCC_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z706PrdExiCCP_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z706PrdExiCCP, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5418PrdSalM_"+sGXsfl_51_idx, GXutil.rtrim( Z5418PrdSalM)) ;
         httpContext.changePostValue( "ZT_"+"Z10881PrdLote_"+sGXsfl_51_idx, GXutil.rtrim( Z10881PrdLote)) ;
         httpContext.changePostValue( "ZT_"+"Z13232PrdRGB_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z795PrvNum_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z856ValCod_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T431FacCon_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T686PrdCant_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5725RecLote_"+sGXsfl_51_idx, GXutil.rtrim( O5725RecLote)) ;
         httpContext.changePostValue( "T490ForPrdUMe_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2394RecForNro_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T238CanRes_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O238CanRes, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T685PrdCanRes_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T719PrdNum_"+sGXsfl_51_idx, GXutil.rtrim( O719PrdNum)) ;
         httpContext.changePostValue( "T873RecPrdNom_"+sGXsfl_51_idx, GXutil.rtrim( O873RecPrdNom)) ;
         httpContext.changePostValue( "T872RecPrdNum_"+sGXsfl_51_idx, GXutil.rtrim( O872RecPrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_410_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_410, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_410_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_410, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_410_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_410, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N686PrdCant_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N5725RecLote_"+sGXsfl_51_idx, GXutil.rtrim( A5725RecLote)) ;
         if ( nIsMod_410 != 0 )
         {
            httpContext.changePostValue( "RECLIN_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDNUM_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdNum_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDNUM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDFIND_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdFind_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDDSC_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDDSC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDDSCF_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdDscf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACCON_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANT_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECFORNRO_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecForNro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDTNQ_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdTnq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECLOTE_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECMAR_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecMar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXIALM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANRES_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXICC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXICC_"+sGXsfl_51_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXICC_"+sGXsfl_51_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Width, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CANTPRODUC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCantProduc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll3X410( ) ;
      if ( AnyError != 0 )
      {
         OV18Modif = sV18Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
      }
      nRcdExists_410 = (short)(0) ;
      nIsMod_410 = (short)(0) ;
      nRcdDeleted_410 = (short)(0) ;
   }

   public void processLevel3X409( )
   {
      /* Save parent mode. */
      sMode409 = Gx_mode ;
      processNestedLevel3X410( ) ;
      if ( AnyError != 0 )
      {
         OV18Modif = sV18Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
      }
      /* Restore parent mode. */
      Gx_mode = sMode409 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel3X409( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(7);
      }
      if ( AnyError == 0 )
      {
         beforeComplete3X409( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "treclin");
         if ( AnyError == 0 )
         {
            confirmValues3X0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "treclin");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart3X409( )
   {
      /* Scan By routine */
      /* Using cursor T003X21 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      RcdFound409 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound409 = (short)(1) ;
         A129BarCod = T003X21_A129BarCod[0] ;
         A132BarCodReo = T003X21_A132BarCodReo[0] ;
         A130BarCodPar = T003X21_A130BarCodPar[0] ;
         A2804RecLinMaq = T003X21_A2804RecLinMaq[0] ;
         A1273RecLinPro = T003X21_A1273RecLinPro[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext3X409( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound409 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound409 = (short)(1) ;
         A129BarCod = T003X21_A129BarCod[0] ;
         A132BarCodReo = T003X21_A132BarCodReo[0] ;
         A130BarCodPar = T003X21_A130BarCodPar[0] ;
         A2804RecLinMaq = T003X21_A2804RecLinMaq[0] ;
         A1273RecLinPro = T003X21_A1273RecLinPro[0] ;
      }
   }

   public void scanEnd3X409( )
   {
      pr_default.close(17);
   }

   public void afterConfirm3X409( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert3X409( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate3X409( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete3X409( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete3X409( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate3X409( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes3X409( )
   {
      edtavProfordsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProfordsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProfordsc_Enabled), 5, 0), true);
      edtavValcos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValcos_Enabled), 5, 0), true);
      edtavTotkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotkgs_Enabled), 5, 0), true);
      edtavVolumen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVolumen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVolumen_Enabled), 5, 0), true);
      edtavModo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModo_Enabled), 5, 0), true);
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavReclinmaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinmaq_Enabled), 5, 0), true);
      edtavReclinpro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinpro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinpro_Enabled), 5, 0), true);
   }

   public void zm3X410( int GX_JID )
   {
      if ( ( GX_JID == 68 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z875RecPrdDsc = T003X3_A875RecPrdDsc[0] ;
            Z686PrdCant = T003X3_A686PrdCant[0] ;
            Z5725RecLote = T003X3_A5725RecLote[0] ;
            Z11708RecProv = T003X3_A11708RecProv[0] ;
            Z12710PrdCantOrg = T003X3_A12710PrdCantOrg[0] ;
            Z12641RecPrdDc2 = T003X3_A12641RecPrdDc2[0] ;
            Z431FacCon = T003X3_A431FacCon[0] ;
            Z683PrdCanFin = T003X3_A683PrdCanFin[0] ;
            Z1797PrdCanAny = T003X3_A1797PrdCanAny[0] ;
            Z2394RecForNro = T003X3_A2394RecForNro[0] ;
            Z3274RecPrdTnq = T003X3_A3274RecPrdTnq[0] ;
            Z3938RecCanEns = T003X3_A3938RecCanEns[0] ;
            Z4024RecMar = T003X3_A4024RecMar[0] ;
            Z5422RecSalMP = T003X3_A5422RecSalMP[0] ;
            Z5467RecSalVol = T003X3_A5467RecSalVol[0] ;
            Z5527RecLinRea = T003X3_A5527RecLinRea[0] ;
            Z8934RecPes = T003X3_A8934RecPes[0] ;
            Z8937RecAcc = T003X3_A8937RecAcc[0] ;
            Z9813FacCon1 = T003X3_A9813FacCon1[0] ;
            Z3804RecFecMov = T003X3_A3804RecFecMov[0] ;
            Z3805RecAnyTie = T003X3_A3805RecAnyTie[0] ;
            Z3806RecUltAny = T003X3_A3806RecUltAny[0] ;
            Z3807RecPorAny = T003X3_A3807RecPorAny[0] ;
            Z4900PrdCanMac = T003X3_A4900PrdCanMac[0] ;
            Z4576RecLinUsr = T003X3_A4576RecLinUsr[0] ;
            Z4577RecPesFec = T003X3_A4577RecPesFec[0] ;
            Z12717RecFabId = T003X3_A12717RecFabId[0] ;
            Z872RecPrdNum = T003X3_A872RecPrdNum[0] ;
            Z13937RecLotAlm = T003X3_A13937RecLotAlm[0] ;
            Z13938RecLoteFch = T003X3_A13938RecLoteFch[0] ;
            Z719PrdNum = T003X3_A719PrdNum[0] ;
            Z490ForPrdUMe = T003X3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z875RecPrdDsc = A875RecPrdDsc ;
            Z686PrdCant = A686PrdCant ;
            Z5725RecLote = A5725RecLote ;
            Z11708RecProv = A11708RecProv ;
            Z12710PrdCantOrg = A12710PrdCantOrg ;
            Z12641RecPrdDc2 = A12641RecPrdDc2 ;
            Z431FacCon = A431FacCon ;
            Z683PrdCanFin = A683PrdCanFin ;
            Z1797PrdCanAny = A1797PrdCanAny ;
            Z2394RecForNro = A2394RecForNro ;
            Z3274RecPrdTnq = A3274RecPrdTnq ;
            Z3938RecCanEns = A3938RecCanEns ;
            Z4024RecMar = A4024RecMar ;
            Z5422RecSalMP = A5422RecSalMP ;
            Z5467RecSalVol = A5467RecSalVol ;
            Z5527RecLinRea = A5527RecLinRea ;
            Z8934RecPes = A8934RecPes ;
            Z8937RecAcc = A8937RecAcc ;
            Z9813FacCon1 = A9813FacCon1 ;
            Z3804RecFecMov = A3804RecFecMov ;
            Z3805RecAnyTie = A3805RecAnyTie ;
            Z3806RecUltAny = A3806RecUltAny ;
            Z3807RecPorAny = A3807RecPorAny ;
            Z4900PrdCanMac = A4900PrdCanMac ;
            Z4576RecLinUsr = A4576RecLinUsr ;
            Z4577RecPesFec = A4577RecPesFec ;
            Z12717RecFabId = A12717RecFabId ;
            Z872RecPrdNum = A872RecPrdNum ;
            Z13937RecLotAlm = A13937RecLotAlm ;
            Z13938RecLoteFch = A13938RecLoteFch ;
            Z719PrdNum = A719PrdNum ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( ( GX_JID == 70 ) || ( GX_JID == 0 ) )
      {
         Z707PrdFacCon = T003X8_A707PrdFacCon[0] ;
         Z704PrdExiAlm = T003X8_A704PrdExiAlm[0] ;
         Z705PrdExiCC = T003X8_A705PrdExiCC[0] ;
         Z706PrdExiCCP = T003X8_A706PrdExiCCP[0] ;
         Z5418PrdSalM = T003X8_A5418PrdSalM[0] ;
         Z10881PrdLote = T003X8_A10881PrdLote[0] ;
         Z13232PrdRGB = T003X8_A13232PrdRGB[0] ;
         Z795PrvNum = T003X8_A795PrvNum[0] ;
         Z856ValCod = T003X8_A856ValCod[0] ;
      }
      if ( GX_JID == -68 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2804RecLinMaq = A2804RecLinMaq ;
         Z1273RecLinPro = A1273RecLinPro ;
         Z811RecLin = A811RecLin ;
         Z875RecPrdDsc = A875RecPrdDsc ;
         Z686PrdCant = A686PrdCant ;
         Z5725RecLote = A5725RecLote ;
         Z11708RecProv = A11708RecProv ;
         Z12710PrdCantOrg = A12710PrdCantOrg ;
         Z12641RecPrdDc2 = A12641RecPrdDc2 ;
         Z431FacCon = A431FacCon ;
         Z683PrdCanFin = A683PrdCanFin ;
         Z1797PrdCanAny = A1797PrdCanAny ;
         Z2394RecForNro = A2394RecForNro ;
         Z3274RecPrdTnq = A3274RecPrdTnq ;
         Z3938RecCanEns = A3938RecCanEns ;
         Z4024RecMar = A4024RecMar ;
         Z5422RecSalMP = A5422RecSalMP ;
         Z5467RecSalVol = A5467RecSalVol ;
         Z5527RecLinRea = A5527RecLinRea ;
         Z8934RecPes = A8934RecPes ;
         Z8937RecAcc = A8937RecAcc ;
         Z9813FacCon1 = A9813FacCon1 ;
         Z3804RecFecMov = A3804RecFecMov ;
         Z3805RecAnyTie = A3805RecAnyTie ;
         Z3806RecUltAny = A3806RecUltAny ;
         Z3807RecPorAny = A3807RecPorAny ;
         Z4900PrdCanMac = A4900PrdCanMac ;
         Z4576RecLinUsr = A4576RecLinUsr ;
         Z4577RecPesFec = A4577RecPesFec ;
         Z12717RecFabId = A12717RecFabId ;
         Z872RecPrdNum = A872RecPrdNum ;
         Z13937RecLotAlm = A13937RecLotAlm ;
         Z13938RecLoteFch = A13938RecLoteFch ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z685PrdCanRes = A685PrdCanRes ;
         Z707PrdFacCon = A707PrdFacCon ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z706PrdExiCCP = A706PrdExiCCP ;
         Z5418PrdSalM = A5418PrdSalM ;
         Z10881PrdLote = A10881PrdLote ;
         Z13232PrdRGB = A13232PrdRGB ;
         Z795PrvNum = A795PrvNum ;
         Z856ValCod = A856ValCod ;
         Z488ForPrdDsc = A488ForPrdDsc ;
         Z874RecPrdFind = A874RecPrdFind ;
      }
   }

   public void standaloneNotModal3X410( )
   {
      edtRecMar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMar_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdCanRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdExiCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtCantProduc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCantProduc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCantProduc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      if ( AV63Artemalha == 0 )
      {
         edtRecLote_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLote_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      }
      else
      {
         edtRecLote_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLote_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      }
   }

   public void standaloneModal3X410( )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A12710PrdCantOrg)==0) && ( Gx_BScreen == 0 ) )
      {
         A12710PrdCantOrg = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12710PrdCantOrg", GXutil.ltrimstr( A12710PrdCantOrg, 11, 3));
      }
      if ( GXutil.strcmp(A4576RecLinUsr, " ") != 0 )
      {
         edtRecPrdDsc_Forecolor = GXutil.getColor( 0, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDsc_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDsc_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      }
      if ( GXutil.strcmp(A4576RecLinUsr, " ") != 0 )
      {
         edtRecPrdNum_Forecolor = GXutil.getColor( 0, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecPrdNum_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdNum_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtRecLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLin_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      }
      else
      {
         edtRecLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLin_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      }
   }

   public void load3X410( )
   {
      /* Using cursor T003X22 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound410 = (short)(1) ;
         A875RecPrdDsc = T003X22_A875RecPrdDsc[0] ;
         A685PrdCanRes = T003X22_A685PrdCanRes[0] ;
         n685PrdCanRes = T003X22_n685PrdCanRes[0] ;
         A686PrdCant = T003X22_A686PrdCant[0] ;
         A5725RecLote = T003X22_A5725RecLote[0] ;
         A11708RecProv = T003X22_A11708RecProv[0] ;
         A12710PrdCantOrg = T003X22_A12710PrdCantOrg[0] ;
         A12641RecPrdDc2 = T003X22_A12641RecPrdDc2[0] ;
         A488ForPrdDsc = T003X22_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T003X22_n488ForPrdDsc[0] ;
         A707PrdFacCon = T003X22_A707PrdFacCon[0] ;
         n707PrdFacCon = T003X22_n707PrdFacCon[0] ;
         A431FacCon = T003X22_A431FacCon[0] ;
         A683PrdCanFin = T003X22_A683PrdCanFin[0] ;
         A1797PrdCanAny = T003X22_A1797PrdCanAny[0] ;
         A704PrdExiAlm = T003X22_A704PrdExiAlm[0] ;
         n704PrdExiAlm = T003X22_n704PrdExiAlm[0] ;
         A705PrdExiCC = T003X22_A705PrdExiCC[0] ;
         n705PrdExiCC = T003X22_n705PrdExiCC[0] ;
         A706PrdExiCCP = T003X22_A706PrdExiCCP[0] ;
         n706PrdExiCCP = T003X22_n706PrdExiCCP[0] ;
         A2394RecForNro = T003X22_A2394RecForNro[0] ;
         A3274RecPrdTnq = T003X22_A3274RecPrdTnq[0] ;
         A3938RecCanEns = T003X22_A3938RecCanEns[0] ;
         A4024RecMar = T003X22_A4024RecMar[0] ;
         A5422RecSalMP = T003X22_A5422RecSalMP[0] ;
         A5418PrdSalM = T003X22_A5418PrdSalM[0] ;
         n5418PrdSalM = T003X22_n5418PrdSalM[0] ;
         A5467RecSalVol = T003X22_A5467RecSalVol[0] ;
         A5527RecLinRea = T003X22_A5527RecLinRea[0] ;
         A8934RecPes = T003X22_A8934RecPes[0] ;
         A8937RecAcc = T003X22_A8937RecAcc[0] ;
         A9813FacCon1 = T003X22_A9813FacCon1[0] ;
         A3804RecFecMov = T003X22_A3804RecFecMov[0] ;
         A3805RecAnyTie = T003X22_A3805RecAnyTie[0] ;
         A3806RecUltAny = T003X22_A3806RecUltAny[0] ;
         A3807RecPorAny = T003X22_A3807RecPorAny[0] ;
         A4900PrdCanMac = T003X22_A4900PrdCanMac[0] ;
         A10881PrdLote = T003X22_A10881PrdLote[0] ;
         n10881PrdLote = T003X22_n10881PrdLote[0] ;
         A4576RecLinUsr = T003X22_A4576RecLinUsr[0] ;
         A4577RecPesFec = T003X22_A4577RecPesFec[0] ;
         A12717RecFabId = T003X22_A12717RecFabId[0] ;
         A13232PrdRGB = T003X22_A13232PrdRGB[0] ;
         n13232PrdRGB = T003X22_n13232PrdRGB[0] ;
         A872RecPrdNum = T003X22_A872RecPrdNum[0] ;
         A13937RecLotAlm = T003X22_A13937RecLotAlm[0] ;
         A13938RecLoteFch = T003X22_A13938RecLoteFch[0] ;
         A719PrdNum = T003X22_A719PrdNum[0] ;
         n719PrdNum = T003X22_n719PrdNum[0] ;
         A490ForPrdUMe = T003X22_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T003X22_n490ForPrdUMe[0] ;
         A795PrvNum = T003X22_A795PrvNum[0] ;
         n795PrvNum = T003X22_n795PrvNum[0] ;
         A856ValCod = T003X22_A856ValCod[0] ;
         n856ValCod = T003X22_n856ValCod[0] ;
         A874RecPrdFind = T003X22_A874RecPrdFind[0] ;
         n874RecPrdFind = T003X22_n874RecPrdFind[0] ;
         zm3X410( -68) ;
      }
      pr_default.close(18);
      onLoadActions3X410( ) ;
   }

   public void onLoadActions3X410( )
   {
      if ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 )
      {
         GXt_char1 = A13897RecPrdDscf ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         treclin_impl.this.A396EmprCod = GXv_char4[0] ;
         treclin_impl.this.A872RecPrdNum = GXv_char3[0] ;
         treclin_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13897RecPrdDscf = GXt_char1 ;
      }
      else
      {
         A13897RecPrdDscf = "" ;
      }
      if ( ( AV67NoCantidad == 1 ) || ( AV57Moda21 == 1 ) )
      {
         edtPrdCant_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      }
      else
      {
         if ( (GXutil.strcmp("", A872RecPrdNum)==0) )
         {
            edtPrdCant_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Enabled), 5, 0), !bGXsfl_51_Refreshing);
         }
         else
         {
            edtPrdCant_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Enabled), 5, 0), !bGXsfl_51_Refreshing);
         }
      }
      if ( ( A490ForPrdUMe == 3 ) && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) && true /* After */ && ( GXutil.strcmp(AV49Proforfab, "*") != 0 ) )
      {
         A686PrdCant = AV16TotKgs.multiply(A431FacCon).multiply(DecimalUtil.doubleToDec(AV29Valcos)) ;
      }
      else
      {
         if ( ( ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) ) && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) && true /* After */ && ( GXutil.strcmp(AV49Proforfab, "*") != 0 ) )
         {
            A686PrdCant = A431FacCon.multiply(DecimalUtil.doubleToDec(AV17Volumen)) ;
         }
         else
         {
            if ( ( A490ForPrdUMe == 3 ) && ( A490ForPrdUMe != O490ForPrdUMe ) && true /* After */ && ( GXutil.strcmp(AV49Proforfab, "*") != 0 ) )
            {
               A686PrdCant = AV16TotKgs.multiply(A431FacCon).multiply(DecimalUtil.doubleToDec(AV29Valcos)) ;
            }
            else
            {
               if ( ( ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) ) && ( A490ForPrdUMe != O490ForPrdUMe ) && true /* After */ && ( GXutil.strcmp(AV49Proforfab, "*") != 0 ) )
               {
                  A686PrdCant = A431FacCon.multiply(DecimalUtil.doubleToDec(AV17Volumen)) ;
               }
            }
         }
      }
      A238CanRes = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrimstr( A238CanRes, 8, 2));
      O238CanRes = A238CanRes ;
      httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrimstr( A238CanRes, 8, 2));
      AV42Cantold = O686PrdCant ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Cantold", GXutil.ltrimstr( AV42Cantold, 11, 3));
   }

   public void checkExtendedTable3X410( )
   {
      nIsDirty_410 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal3X410( ) ;
      /* Using cursor T003X9 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A490ForPrdUMe) ) )
         {
            GXCCtl = "FORPRDUME_" + sGXsfl_51_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtForPrdUMe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A488ForPrdDsc = T003X9_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T003X9_n488ForPrdDsc[0] ;
      pr_default.close(5);
      /* Using cursor T003X10 */
      pr_default.execute(6, new Object[] {A396EmprCod, A872RecPrdNum});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A874RecPrdFind = T003X10_A874RecPrdFind[0] ;
         n874RecPrdFind = T003X10_n874RecPrdFind[0] ;
      }
      else
      {
         nIsDirty_410 = (short)(1) ;
         A874RecPrdFind = "xxxxxx" ;
         n874RecPrdFind = false ;
      }
      pr_default.close(6);
      if ( ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") == 0 ) && ! (GXutil.strcmp("", A872RecPrdNum)==0) && isIns( )  )
      {
         GXCCtl = "RECPRDNUM_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto Inexistente", ""), 1, GXCCtl);
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
         treclin_impl.this.A396EmprCod = GXv_char4[0] ;
         treclin_impl.this.A872RecPrdNum = GXv_char3[0] ;
         treclin_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13897RecPrdDscf = GXt_char1 ;
      }
      else
      {
         nIsDirty_410 = (short)(1) ;
         A13897RecPrdDscf = "" ;
      }
      if ( ( AV67NoCantidad == 1 ) || ( AV57Moda21 == 1 ) )
      {
         edtPrdCant_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      }
      else
      {
         if ( (GXutil.strcmp("", A872RecPrdNum)==0) )
         {
            edtPrdCant_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Enabled), 5, 0), !bGXsfl_51_Refreshing);
         }
         else
         {
            edtPrdCant_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Enabled), 5, 0), !bGXsfl_51_Refreshing);
         }
      }
      if ( isIns( )  && (0==A811RecLin) )
      {
         GXCCtl = "RECLIN_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se debe de entrar Numero Linea", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) || (0==A490ForPrdUMe) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A490ForPrdUMe == 3 ) && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) && true /* After */ && ( GXutil.strcmp(AV49Proforfab, "*") != 0 ) )
      {
         nIsDirty_410 = (short)(1) ;
         A686PrdCant = AV16TotKgs.multiply(A431FacCon).multiply(DecimalUtil.doubleToDec(AV29Valcos)) ;
      }
      else
      {
         if ( ( ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) ) && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) && true /* After */ && ( GXutil.strcmp(AV49Proforfab, "*") != 0 ) )
         {
            nIsDirty_410 = (short)(1) ;
            A686PrdCant = A431FacCon.multiply(DecimalUtil.doubleToDec(AV17Volumen)) ;
         }
         else
         {
            if ( ( A490ForPrdUMe == 3 ) && ( A490ForPrdUMe != O490ForPrdUMe ) && true /* After */ && ( GXutil.strcmp(AV49Proforfab, "*") != 0 ) )
            {
               nIsDirty_410 = (short)(1) ;
               A686PrdCant = AV16TotKgs.multiply(A431FacCon).multiply(DecimalUtil.doubleToDec(AV29Valcos)) ;
            }
            else
            {
               if ( ( ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) ) && ( A490ForPrdUMe != O490ForPrdUMe ) && true /* After */ && ( GXutil.strcmp(AV49Proforfab, "*") != 0 ) )
               {
                  nIsDirty_410 = (short)(1) ;
                  A686PrdCant = A431FacCon.multiply(DecimalUtil.doubleToDec(AV17Volumen)) ;
               }
            }
         }
      }
      if ( (GXutil.strcmp("", A872RecPrdNum)==0) && ( A490ForPrdUMe > 0 ) )
      {
         GXCCtl = "RECPRDNUM_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Accion No permitida. NO hay PRODUCTO", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") <= 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ && ( AV45Err_und == 1 ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion no ha entrado UNIDAD=1,2,3", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") <= 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ && ( AV45Err_und == 0 ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion no ha entrado UNIDAD=1,2,3", ""), 0, GXCCtl);
      }
      if ( (GXutil.strcmp("", A872RecPrdNum)==0) && ( A431FacCon.doubleValue() > 0 ) )
      {
         GXCCtl = "RECPRDNUM_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Accion No permitida. NO hay PRODUCTO", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_410 = (short)(1) ;
      A238CanRes = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrimstr( A238CanRes, 8, 2));
      AV42Cantold = O686PrdCant ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Cantold", GXutil.ltrimstr( AV42Cantold, 11, 3));
      if ( isUpd( )  && ( GXutil.strcmp(A872RecPrdNum, O872RecPrdNum) != 0 ) && true /* After */ && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "9") <= 0 ) )
      {
         GXCCtl = "RECPRDNUM_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(AV69msg_err1, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors3X410( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable3X410( )
   {
   }

   public void gxload_71( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T003X23 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A490ForPrdUMe) ) )
         {
            GXCCtl = "FORPRDUME_" + sGXsfl_51_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtForPrdUMe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A488ForPrdDsc = T003X23_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T003X23_n488ForPrdDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void gxload_72( String A396EmprCod ,
                          String A872RecPrdNum )
   {
      /* Using cursor T003X24 */
      pr_default.execute(20, new Object[] {A396EmprCod, A872RecPrdNum});
      if ( (pr_default.getStatus(20) != 101) )
      {
         A874RecPrdFind = T003X24_A874RecPrdFind[0] ;
         n874RecPrdFind = T003X24_n874RecPrdFind[0] ;
      }
      else
      {
         A874RecPrdFind = "xxxxxx" ;
         n874RecPrdFind = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A874RecPrdFind))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void getKey3X410( )
   {
      /* Using cursor T003X25 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound410 = (short)(1) ;
      }
      else
      {
         RcdFound410 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey3X410( )
   {
      /* Using cursor T003X3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T003X3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm3X410( 68) ;
         RcdFound410 = (short)(1) ;
         initializeNonKey3X410( ) ;
         A811RecLin = T003X3_A811RecLin[0] ;
         A875RecPrdDsc = T003X3_A875RecPrdDsc[0] ;
         A686PrdCant = T003X3_A686PrdCant[0] ;
         A5725RecLote = T003X3_A5725RecLote[0] ;
         A11708RecProv = T003X3_A11708RecProv[0] ;
         A12710PrdCantOrg = T003X3_A12710PrdCantOrg[0] ;
         A12641RecPrdDc2 = T003X3_A12641RecPrdDc2[0] ;
         A431FacCon = T003X3_A431FacCon[0] ;
         A683PrdCanFin = T003X3_A683PrdCanFin[0] ;
         A1797PrdCanAny = T003X3_A1797PrdCanAny[0] ;
         A2394RecForNro = T003X3_A2394RecForNro[0] ;
         A3274RecPrdTnq = T003X3_A3274RecPrdTnq[0] ;
         A3938RecCanEns = T003X3_A3938RecCanEns[0] ;
         A4024RecMar = T003X3_A4024RecMar[0] ;
         A5422RecSalMP = T003X3_A5422RecSalMP[0] ;
         A5467RecSalVol = T003X3_A5467RecSalVol[0] ;
         A5527RecLinRea = T003X3_A5527RecLinRea[0] ;
         A8934RecPes = T003X3_A8934RecPes[0] ;
         A8937RecAcc = T003X3_A8937RecAcc[0] ;
         A9813FacCon1 = T003X3_A9813FacCon1[0] ;
         A3804RecFecMov = T003X3_A3804RecFecMov[0] ;
         A3805RecAnyTie = T003X3_A3805RecAnyTie[0] ;
         A3806RecUltAny = T003X3_A3806RecUltAny[0] ;
         A3807RecPorAny = T003X3_A3807RecPorAny[0] ;
         A4900PrdCanMac = T003X3_A4900PrdCanMac[0] ;
         A4576RecLinUsr = T003X3_A4576RecLinUsr[0] ;
         A4577RecPesFec = T003X3_A4577RecPesFec[0] ;
         A12717RecFabId = T003X3_A12717RecFabId[0] ;
         A872RecPrdNum = T003X3_A872RecPrdNum[0] ;
         A13937RecLotAlm = T003X3_A13937RecLotAlm[0] ;
         A13938RecLoteFch = T003X3_A13938RecLoteFch[0] ;
         A719PrdNum = T003X3_A719PrdNum[0] ;
         n719PrdNum = T003X3_n719PrdNum[0] ;
         A490ForPrdUMe = T003X3_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T003X3_n490ForPrdUMe[0] ;
         O431FacCon = A431FacCon ;
         O686PrdCant = A686PrdCant ;
         O5725RecLote = A5725RecLote ;
         O490ForPrdUMe = A490ForPrdUMe ;
         n490ForPrdUMe = false ;
         O2394RecForNro = A2394RecForNro ;
         O719PrdNum = A719PrdNum ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         O872RecPrdNum = A872RecPrdNum ;
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
         load3X410( ) ;
         Gx_mode = sMode410 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound410 = (short)(0) ;
         initializeNonKey3X410( ) ;
         sMode410 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal3X410( ) ;
         Gx_mode = sMode410 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes3X410( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency3X410( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T003X2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLRECET"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z875RecPrdDsc, T003X2_A875RecPrdDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z686PrdCant, T003X2_A686PrdCant[0]) != 0 ) || ( GXutil.strcmp(Z5725RecLote, T003X2_A5725RecLote[0]) != 0 ) || ( Z11708RecProv != T003X2_A11708RecProv[0] ) || ( DecimalUtil.compareTo(Z12710PrdCantOrg, T003X2_A12710PrdCantOrg[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12641RecPrdDc2, T003X2_A12641RecPrdDc2[0]) != 0 ) || ( DecimalUtil.compareTo(Z431FacCon, T003X2_A431FacCon[0]) != 0 ) || ( DecimalUtil.compareTo(Z683PrdCanFin, T003X2_A683PrdCanFin[0]) != 0 ) || ( DecimalUtil.compareTo(Z1797PrdCanAny, T003X2_A1797PrdCanAny[0]) != 0 ) || ( Z2394RecForNro != T003X2_A2394RecForNro[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3274RecPrdTnq != T003X2_A3274RecPrdTnq[0] ) || ( DecimalUtil.compareTo(Z3938RecCanEns, T003X2_A3938RecCanEns[0]) != 0 ) || ( Z4024RecMar != T003X2_A4024RecMar[0] ) || ( Z5422RecSalMP != T003X2_A5422RecSalMP[0] ) || ( Z5467RecSalVol != T003X2_A5467RecSalVol[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5527RecLinRea, T003X2_A5527RecLinRea[0]) != 0 ) || ( Z8934RecPes != T003X2_A8934RecPes[0] ) || ( GXutil.strcmp(Z8937RecAcc, T003X2_A8937RecAcc[0]) != 0 ) || ( DecimalUtil.compareTo(Z9813FacCon1, T003X2_A9813FacCon1[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z3804RecFecMov), GXutil.resetTime(T003X2_A3804RecFecMov[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3805RecAnyTie != T003X2_A3805RecAnyTie[0] ) || ( DecimalUtil.compareTo(Z3806RecUltAny, T003X2_A3806RecUltAny[0]) != 0 ) || ( DecimalUtil.compareTo(Z3807RecPorAny, T003X2_A3807RecPorAny[0]) != 0 ) || ( DecimalUtil.compareTo(Z4900PrdCanMac, T003X2_A4900PrdCanMac[0]) != 0 ) || ( GXutil.strcmp(Z4576RecLinUsr, T003X2_A4576RecLinUsr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z4577RecPesFec, T003X2_A4577RecPesFec[0]) ) || ( Z12717RecFabId != T003X2_A12717RecFabId[0] ) || ( GXutil.strcmp(Z872RecPrdNum, T003X2_A872RecPrdNum[0]) != 0 ) || ( Z13937RecLotAlm != T003X2_A13937RecLotAlm[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z13938RecLoteFch), GXutil.resetTime(T003X2_A13938RecLoteFch[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z719PrdNum, T003X2_A719PrdNum[0]) != 0 ) || ( Z490ForPrdUMe != T003X2_A490ForPrdUMe[0] ) )
         {
            if ( GXutil.strcmp(Z875RecPrdDsc, T003X2_A875RecPrdDsc[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecPrdDsc");
               GXutil.writeLogRaw("Old: ",Z875RecPrdDsc);
               GXutil.writeLogRaw("Current: ",T003X2_A875RecPrdDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z686PrdCant, T003X2_A686PrdCant[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"PrdCant");
               GXutil.writeLogRaw("Old: ",Z686PrdCant);
               GXutil.writeLogRaw("Current: ",T003X2_A686PrdCant[0]);
            }
            if ( GXutil.strcmp(Z5725RecLote, T003X2_A5725RecLote[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecLote");
               GXutil.writeLogRaw("Old: ",Z5725RecLote);
               GXutil.writeLogRaw("Current: ",T003X2_A5725RecLote[0]);
            }
            if ( Z11708RecProv != T003X2_A11708RecProv[0] )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecProv");
               GXutil.writeLogRaw("Old: ",Z11708RecProv);
               GXutil.writeLogRaw("Current: ",T003X2_A11708RecProv[0]);
            }
            if ( DecimalUtil.compareTo(Z12710PrdCantOrg, T003X2_A12710PrdCantOrg[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"PrdCantOrg");
               GXutil.writeLogRaw("Old: ",Z12710PrdCantOrg);
               GXutil.writeLogRaw("Current: ",T003X2_A12710PrdCantOrg[0]);
            }
            if ( GXutil.strcmp(Z12641RecPrdDc2, T003X2_A12641RecPrdDc2[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecPrdDc2");
               GXutil.writeLogRaw("Old: ",Z12641RecPrdDc2);
               GXutil.writeLogRaw("Current: ",T003X2_A12641RecPrdDc2[0]);
            }
            if ( DecimalUtil.compareTo(Z431FacCon, T003X2_A431FacCon[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"FacCon");
               GXutil.writeLogRaw("Old: ",Z431FacCon);
               GXutil.writeLogRaw("Current: ",T003X2_A431FacCon[0]);
            }
            if ( DecimalUtil.compareTo(Z683PrdCanFin, T003X2_A683PrdCanFin[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"PrdCanFin");
               GXutil.writeLogRaw("Old: ",Z683PrdCanFin);
               GXutil.writeLogRaw("Current: ",T003X2_A683PrdCanFin[0]);
            }
            if ( DecimalUtil.compareTo(Z1797PrdCanAny, T003X2_A1797PrdCanAny[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"PrdCanAny");
               GXutil.writeLogRaw("Old: ",Z1797PrdCanAny);
               GXutil.writeLogRaw("Current: ",T003X2_A1797PrdCanAny[0]);
            }
            if ( Z2394RecForNro != T003X2_A2394RecForNro[0] )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecForNro");
               GXutil.writeLogRaw("Old: ",Z2394RecForNro);
               GXutil.writeLogRaw("Current: ",T003X2_A2394RecForNro[0]);
            }
            if ( Z3274RecPrdTnq != T003X2_A3274RecPrdTnq[0] )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecPrdTnq");
               GXutil.writeLogRaw("Old: ",Z3274RecPrdTnq);
               GXutil.writeLogRaw("Current: ",T003X2_A3274RecPrdTnq[0]);
            }
            if ( DecimalUtil.compareTo(Z3938RecCanEns, T003X2_A3938RecCanEns[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecCanEns");
               GXutil.writeLogRaw("Old: ",Z3938RecCanEns);
               GXutil.writeLogRaw("Current: ",T003X2_A3938RecCanEns[0]);
            }
            if ( Z4024RecMar != T003X2_A4024RecMar[0] )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecMar");
               GXutil.writeLogRaw("Old: ",Z4024RecMar);
               GXutil.writeLogRaw("Current: ",T003X2_A4024RecMar[0]);
            }
            if ( Z5422RecSalMP != T003X2_A5422RecSalMP[0] )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecSalMP");
               GXutil.writeLogRaw("Old: ",Z5422RecSalMP);
               GXutil.writeLogRaw("Current: ",T003X2_A5422RecSalMP[0]);
            }
            if ( Z5467RecSalVol != T003X2_A5467RecSalVol[0] )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecSalVol");
               GXutil.writeLogRaw("Old: ",Z5467RecSalVol);
               GXutil.writeLogRaw("Current: ",T003X2_A5467RecSalVol[0]);
            }
            if ( GXutil.strcmp(Z5527RecLinRea, T003X2_A5527RecLinRea[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecLinRea");
               GXutil.writeLogRaw("Old: ",Z5527RecLinRea);
               GXutil.writeLogRaw("Current: ",T003X2_A5527RecLinRea[0]);
            }
            if ( Z8934RecPes != T003X2_A8934RecPes[0] )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecPes");
               GXutil.writeLogRaw("Old: ",Z8934RecPes);
               GXutil.writeLogRaw("Current: ",T003X2_A8934RecPes[0]);
            }
            if ( GXutil.strcmp(Z8937RecAcc, T003X2_A8937RecAcc[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecAcc");
               GXutil.writeLogRaw("Old: ",Z8937RecAcc);
               GXutil.writeLogRaw("Current: ",T003X2_A8937RecAcc[0]);
            }
            if ( DecimalUtil.compareTo(Z9813FacCon1, T003X2_A9813FacCon1[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"FacCon1");
               GXutil.writeLogRaw("Old: ",Z9813FacCon1);
               GXutil.writeLogRaw("Current: ",T003X2_A9813FacCon1[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3804RecFecMov), GXutil.resetTime(T003X2_A3804RecFecMov[0])) ) )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecFecMov");
               GXutil.writeLogRaw("Old: ",Z3804RecFecMov);
               GXutil.writeLogRaw("Current: ",T003X2_A3804RecFecMov[0]);
            }
            if ( Z3805RecAnyTie != T003X2_A3805RecAnyTie[0] )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecAnyTie");
               GXutil.writeLogRaw("Old: ",Z3805RecAnyTie);
               GXutil.writeLogRaw("Current: ",T003X2_A3805RecAnyTie[0]);
            }
            if ( DecimalUtil.compareTo(Z3806RecUltAny, T003X2_A3806RecUltAny[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecUltAny");
               GXutil.writeLogRaw("Old: ",Z3806RecUltAny);
               GXutil.writeLogRaw("Current: ",T003X2_A3806RecUltAny[0]);
            }
            if ( DecimalUtil.compareTo(Z3807RecPorAny, T003X2_A3807RecPorAny[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecPorAny");
               GXutil.writeLogRaw("Old: ",Z3807RecPorAny);
               GXutil.writeLogRaw("Current: ",T003X2_A3807RecPorAny[0]);
            }
            if ( DecimalUtil.compareTo(Z4900PrdCanMac, T003X2_A4900PrdCanMac[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"PrdCanMac");
               GXutil.writeLogRaw("Old: ",Z4900PrdCanMac);
               GXutil.writeLogRaw("Current: ",T003X2_A4900PrdCanMac[0]);
            }
            if ( GXutil.strcmp(Z4576RecLinUsr, T003X2_A4576RecLinUsr[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecLinUsr");
               GXutil.writeLogRaw("Old: ",Z4576RecLinUsr);
               GXutil.writeLogRaw("Current: ",T003X2_A4576RecLinUsr[0]);
            }
            if ( !( GXutil.dateCompare(Z4577RecPesFec, T003X2_A4577RecPesFec[0]) ) )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecPesFec");
               GXutil.writeLogRaw("Old: ",Z4577RecPesFec);
               GXutil.writeLogRaw("Current: ",T003X2_A4577RecPesFec[0]);
            }
            if ( Z12717RecFabId != T003X2_A12717RecFabId[0] )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecFabId");
               GXutil.writeLogRaw("Old: ",Z12717RecFabId);
               GXutil.writeLogRaw("Current: ",T003X2_A12717RecFabId[0]);
            }
            if ( GXutil.strcmp(Z872RecPrdNum, T003X2_A872RecPrdNum[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecPrdNum");
               GXutil.writeLogRaw("Old: ",Z872RecPrdNum);
               GXutil.writeLogRaw("Current: ",T003X2_A872RecPrdNum[0]);
            }
            if ( Z13937RecLotAlm != T003X2_A13937RecLotAlm[0] )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecLotAlm");
               GXutil.writeLogRaw("Old: ",Z13937RecLotAlm);
               GXutil.writeLogRaw("Current: ",T003X2_A13937RecLotAlm[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13938RecLoteFch), GXutil.resetTime(T003X2_A13938RecLoteFch[0])) ) )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"RecLoteFch");
               GXutil.writeLogRaw("Old: ",Z13938RecLoteFch);
               GXutil.writeLogRaw("Current: ",T003X2_A13938RecLoteFch[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T003X2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T003X2_A719PrdNum[0]);
            }
            if ( Z490ForPrdUMe != T003X2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T003X2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLRECET"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T003X7 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(3) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( DecimalUtil.compareTo(Z707PrdFacCon, T003X7_A707PrdFacCon[0]) != 0 ) || ( DecimalUtil.compareTo(Z704PrdExiAlm, T003X7_A704PrdExiAlm[0]) != 0 ) || ( DecimalUtil.compareTo(Z705PrdExiCC, T003X7_A705PrdExiCC[0]) != 0 ) || ( DecimalUtil.compareTo(Z706PrdExiCCP, T003X7_A706PrdExiCCP[0]) != 0 ) || ( GXutil.strcmp(Z5418PrdSalM, T003X7_A5418PrdSalM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10881PrdLote, T003X7_A10881PrdLote[0]) != 0 ) || ( Z13232PrdRGB != T003X7_A13232PrdRGB[0] ) || ( Z795PrvNum != T003X7_A795PrvNum[0] ) || ( Z856ValCod != T003X7_A856ValCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z707PrdFacCon, T003X7_A707PrdFacCon[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"PrdFacCon");
               GXutil.writeLogRaw("Old: ",Z707PrdFacCon);
               GXutil.writeLogRaw("Current: ",T003X7_A707PrdFacCon[0]);
            }
            if ( DecimalUtil.compareTo(Z704PrdExiAlm, T003X7_A704PrdExiAlm[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"PrdExiAlm");
               GXutil.writeLogRaw("Old: ",Z704PrdExiAlm);
               GXutil.writeLogRaw("Current: ",T003X7_A704PrdExiAlm[0]);
            }
            if ( DecimalUtil.compareTo(Z705PrdExiCC, T003X7_A705PrdExiCC[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"PrdExiCC");
               GXutil.writeLogRaw("Old: ",Z705PrdExiCC);
               GXutil.writeLogRaw("Current: ",T003X7_A705PrdExiCC[0]);
            }
            if ( DecimalUtil.compareTo(Z706PrdExiCCP, T003X7_A706PrdExiCCP[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"PrdExiCCP");
               GXutil.writeLogRaw("Old: ",Z706PrdExiCCP);
               GXutil.writeLogRaw("Current: ",T003X7_A706PrdExiCCP[0]);
            }
            if ( GXutil.strcmp(Z5418PrdSalM, T003X7_A5418PrdSalM[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"PrdSalM");
               GXutil.writeLogRaw("Old: ",Z5418PrdSalM);
               GXutil.writeLogRaw("Current: ",T003X7_A5418PrdSalM[0]);
            }
            if ( GXutil.strcmp(Z10881PrdLote, T003X7_A10881PrdLote[0]) != 0 )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"PrdLote");
               GXutil.writeLogRaw("Old: ",Z10881PrdLote);
               GXutil.writeLogRaw("Current: ",T003X7_A10881PrdLote[0]);
            }
            if ( Z13232PrdRGB != T003X7_A13232PrdRGB[0] )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"PrdRGB");
               GXutil.writeLogRaw("Old: ",Z13232PrdRGB);
               GXutil.writeLogRaw("Current: ",T003X7_A13232PrdRGB[0]);
            }
            if ( Z795PrvNum != T003X7_A795PrvNum[0] )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"PrvNum");
               GXutil.writeLogRaw("Old: ",Z795PrvNum);
               GXutil.writeLogRaw("Current: ",T003X7_A795PrvNum[0]);
            }
            if ( Z856ValCod != T003X7_A856ValCod[0] )
            {
               GXutil.writeLogln("treclin:[seudo value changed for attri]"+"ValCod");
               GXutil.writeLogRaw("Old: ",Z856ValCod);
               GXutil.writeLogRaw("Current: ",T003X7_A856ValCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert3X410( )
   {
      beforeValidate3X410( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable3X410( ) ;
      }
      if ( AnyError == 0 )
      {
         zm3X410( 0) ;
         checkOptimisticConcurrency3X410( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm3X410( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert3X410( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T003X26 */
                  pr_default.execute(22, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin), A875RecPrdDsc, A686PrdCant, A5725RecLote, Integer.valueOf(A11708RecProv), A12710PrdCantOrg, A12641RecPrdDc2, A431FacCon, A683PrdCanFin, A1797PrdCanAny, Byte.valueOf(A2394RecForNro), Byte.valueOf(A3274RecPrdTnq), A3938RecCanEns, Byte.valueOf(A4024RecMar), Short.valueOf(A5422RecSalMP), Integer.valueOf(A5467RecSalVol), A5527RecLinRea, Byte.valueOf(A8934RecPes), A8937RecAcc, A9813FacCon1, A3804RecFecMov, Short.valueOf(A3805RecAnyTie), A3806RecUltAny, A3807RecPorAny, A4900PrdCanMac, A4576RecLinUsr, A4577RecPesFec, Integer.valueOf(A12717RecFabId), A872RecPrdNum, Short.valueOf(A13937RecLotAlm), A13938RecLoteFch, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
                  if ( (pr_default.getStatus(22) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN13X410( ) ;
                     /* Start of After( Insert) rules */
                     if ( ( ( ( ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) || ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                     {
                        AV18Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
                     }
                     else
                     {
                        if ( ( ( ( ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) || ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) || ( A2394RecForNro != O2394RecForNro ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && ( AV50Suprema == 1 ) && true /* Level */ )
                        {
                           AV18Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
                        }
                     }
                     if ( true /* After */ && ! (GXutil.strcmp("", A872RecPrdNum)==0) )
                     {
                        AV44Texto_i = httpContext.getMessage( httpContext.getMessage( "Receta Tinte: Alta Linea ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( " Prd.", ""), "") + GXutil.trim( A872RecPrdNum) + httpContext.getMessage( httpContext.getMessage( ", Cantidad: ", ""), "") + GXutil.trim( GXutil.str( A686PrdCant, 11, 3)) + httpContext.getMessage( httpContext.getMessage( ", Factor: ", ""), "") + GXutil.trim( GXutil.str( A431FacCon, 11, 5)) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV44Texto_i", AV44Texto_i);
                     }
                     else
                     {
                        if ( true /* After */ && (GXutil.strcmp("", A872RecPrdNum)==0) )
                        {
                           AV44Texto_i = httpContext.getMessage( httpContext.getMessage( "Receta Tinte: Alta Linea ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( " Prd.", ""), "") + GXutil.trim( A872RecPrdNum) + httpContext.getMessage( httpContext.getMessage( " Desc.", ""), "") + GXutil.trim( A875RecPrdDsc) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV44Texto_i", AV44Texto_i);
                        }
                     }
                     if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A5725RecLote, AV65oldRecLote) != 0 ) )
                     {
                        AV64Inc_obs = httpContext.getMessage( httpContext.getMessage( "Cambio Lote.Linea = ", ""), "") + GXutil.str( A811RecLin, 4, 0) + httpContext.getMessage( httpContext.getMessage( ", Producto ", ""), "") + GXutil.trim( A872RecPrdNum) + " " + GXutil.trim( A875RecPrdDsc) + httpContext.getMessage( httpContext.getMessage( " ,Lote ", ""), "") + GXutil.trim( AV65oldRecLote) + httpContext.getMessage( httpContext.getMessage( " , se cambia por, ", ""), "") + A5725RecLote ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV64Inc_obs", AV64Inc_obs);
                     }
                     if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A5725RecLote, AV65oldRecLote) != 0 ) )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV113Pgmname, AV33UsurCod, AV36Station, AV64Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV113Pgmname, AV33UsurCod, AV36Station, AV44Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
            load3X410( ) ;
         }
         endLevel3X410( ) ;
      }
      closeExtendedTableCursors3X410( ) ;
   }

   public void update3X410( )
   {
      beforeValidate3X410( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable3X410( ) ;
      }
      if ( ( nIsMod_410 != 0 ) || ( nIsDirty_410 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency3X410( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm3X410( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate3X410( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T003X27 */
                     pr_default.execute(23, new Object[] {A875RecPrdDsc, A686PrdCant, A5725RecLote, Integer.valueOf(A11708RecProv), A12710PrdCantOrg, A12641RecPrdDc2, A431FacCon, A683PrdCanFin, A1797PrdCanAny, Byte.valueOf(A2394RecForNro), Byte.valueOf(A3274RecPrdTnq), A3938RecCanEns, Byte.valueOf(A4024RecMar), Short.valueOf(A5422RecSalMP), Integer.valueOf(A5467RecSalVol), A5527RecLinRea, Byte.valueOf(A8934RecPes), A8937RecAcc, A9813FacCon1, A3804RecFecMov, Short.valueOf(A3805RecAnyTie), A3806RecUltAny, A3807RecPorAny, A4900PrdCanMac, A4576RecLinUsr, A4577RecPesFec, Integer.valueOf(A12717RecFabId), A872RecPrdNum, Short.valueOf(A13937RecLotAlm), A13938RecLoteFch, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLRECET"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate3X410( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( ( ( ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) || ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                        {
                           AV18Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
                        }
                        else
                        {
                           if ( ( ( ( ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) || ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) || ( A2394RecForNro != O2394RecForNro ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && ( AV50Suprema == 1 ) && true /* Level */ )
                           {
                              AV18Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
                           }
                        }
                        if ( true /* After */ && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) )
                        {
                           AV44Texto_i = httpContext.getMessage( httpContext.getMessage( "Receta Tinte Factor: Linea ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( " Prd.", ""), "") + GXutil.trim( A872RecPrdNum) + httpContext.getMessage( httpContext.getMessage( ", Old:", ""), "") + GXutil.trim( GXutil.str( O431FacCon, 11, 5)) + httpContext.getMessage( httpContext.getMessage( ", New: ", ""), "") + GXutil.trim( GXutil.str( A431FacCon, 11, 5)) + httpContext.getMessage( httpContext.getMessage( ", Old Cnt:", ""), "") + GXutil.trim( GXutil.str( O686PrdCant, 11, 3)) + httpContext.getMessage( httpContext.getMessage( ", New Cnt: ", ""), "") + GXutil.trim( GXutil.str( A686PrdCant, 11, 3)) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV44Texto_i", AV44Texto_i);
                        }
                        if ( true /* After */ && ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) == 0 ) )
                        {
                           AV47Texto_iii = httpContext.getMessage( httpContext.getMessage( "Receta Tinte Cantidad: Linea ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( " Prd.", ""), "") + GXutil.trim( A872RecPrdNum) + httpContext.getMessage( httpContext.getMessage( ", Old: ", ""), "") + GXutil.trim( GXutil.str( O686PrdCant, 11, 3)) + httpContext.getMessage( httpContext.getMessage( ", New: ", ""), "") + GXutil.trim( GXutil.str( A686PrdCant, 11, 3)) + httpContext.getMessage( httpContext.getMessage( ", Old Factor:", ""), "") + GXutil.trim( GXutil.str( O431FacCon, 11, 5)) + httpContext.getMessage( httpContext.getMessage( ", New Factor: ", ""), "") + GXutil.trim( GXutil.str( A431FacCon, 11, 5)) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV47Texto_iii", AV47Texto_iii);
                        }
                        if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A5725RecLote, AV65oldRecLote) != 0 ) )
                        {
                           AV64Inc_obs = httpContext.getMessage( httpContext.getMessage( "Cambio Lote.Linea = ", ""), "") + GXutil.str( A811RecLin, 4, 0) + httpContext.getMessage( httpContext.getMessage( ", Producto ", ""), "") + GXutil.trim( A872RecPrdNum) + " " + GXutil.trim( A875RecPrdDsc) + httpContext.getMessage( httpContext.getMessage( " ,Lote ", ""), "") + GXutil.trim( AV65oldRecLote) + httpContext.getMessage( httpContext.getMessage( " , se cambia por, ", ""), "") + A5725RecLote ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV64Inc_obs", AV64Inc_obs);
                        }
                        if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A5725RecLote, AV65oldRecLote) != 0 ) )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV113Pgmname, AV33UsurCod, AV36Station, AV64Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                        }
                        if ( true /* After */ && ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) == 0 ) )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV113Pgmname, AV33UsurCod, AV36Station, AV47Texto_iii, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                        }
                        if ( true /* After */ && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV113Pgmname, AV33UsurCod, AV36Station, AV44Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           updateTablesN13X410( ) ;
                           getByPrimaryKey3X410( ) ;
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
            endLevel3X410( ) ;
         }
      }
      closeExtendedTableCursors3X410( ) ;
   }

   public void deferredUpdate3X410( )
   {
   }

   public void delete3X410( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate3X410( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency3X410( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls3X410( ) ;
         afterConfirm3X410( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete3X410( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T003X28 */
               pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
               if ( AnyError == 0 )
               {
                  updateTablesN13X410( ) ;
                  /* Start of After( delete) rules */
                  if ( true /* After */ )
                  {
                     AV44Texto_i = httpContext.getMessage( httpContext.getMessage( "Linea Eliminada ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( " Prd. ", ""), "") + GXutil.trim( A872RecPrdNum) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV44Texto_i", AV44Texto_i);
                  }
                  if ( true /* After */ || true /* After */ )
                  {
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV113Pgmname, AV33UsurCod, AV36Station, AV44Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
      sMode410 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel3X410( ) ;
      Gx_mode = sMode410 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls3X410( )
   {
      standaloneModal3X410( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && (0==A811RecLin) )
         {
            GXCCtl = "RECLIN_" + sGXsfl_51_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Se debe de entrar Numero Linea", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") == 0 ) && ! (GXutil.strcmp("", A872RecPrdNum)==0) && isIns( )  )
         {
            GXCCtl = "RECPRDNUM_" + sGXsfl_51_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto Inexistente", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecPrdNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( isUpd( )  && ( GXutil.strcmp(A872RecPrdNum, O872RecPrdNum) != 0 ) && true /* After */ && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "9") <= 0 ) )
         {
            GXCCtl = "RECPRDNUM_" + sGXsfl_51_idx ;
            httpContext.GX_msglist.addItem(AV69msg_err1, 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecPrdNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T003X29 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T003X29_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T003X29_n488ForPrdDsc[0] ;
         pr_default.close(25);
         A238CanRes = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrimstr( A238CanRes, 8, 2));
         AV42Cantold = O686PrdCant ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Cantold", GXutil.ltrimstr( AV42Cantold, 11, 3));
         AV65oldRecLote = O5725RecLote ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65oldRecLote", AV65oldRecLote);
         /* Using cursor T003X30 */
         pr_default.execute(26, new Object[] {A396EmprCod, A872RecPrdNum});
         if ( (pr_default.getStatus(26) != 101) )
         {
            A874RecPrdFind = T003X30_A874RecPrdFind[0] ;
            n874RecPrdFind = T003X30_n874RecPrdFind[0] ;
         }
         else
         {
            A874RecPrdFind = "xxxxxx" ;
            n874RecPrdFind = false ;
         }
         pr_default.close(26);
         if ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 )
         {
            GXt_char1 = A13897RecPrdDscf ;
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A872RecPrdNum ;
            GXv_char2[0] = GXt_char1 ;
            new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            treclin_impl.this.A396EmprCod = GXv_char4[0] ;
            treclin_impl.this.A872RecPrdNum = GXv_char3[0] ;
            treclin_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13897RecPrdDscf = GXt_char1 ;
         }
         else
         {
            A13897RecPrdDscf = "" ;
         }
         if ( ( AV67NoCantidad == 1 ) || ( AV57Moda21 == 1 ) )
         {
            edtPrdCant_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Enabled), 5, 0), !bGXsfl_51_Refreshing);
         }
         else
         {
            if ( (GXutil.strcmp("", A872RecPrdNum)==0) )
            {
               edtPrdCant_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            }
            else
            {
               edtPrdCant_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            }
         }
         /* Using cursor T003X8 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         zm3X410( 70) ;
         A685PrdCanRes = T003X8_A685PrdCanRes[0] ;
         n685PrdCanRes = T003X8_n685PrdCanRes[0] ;
         A707PrdFacCon = T003X8_A707PrdFacCon[0] ;
         n707PrdFacCon = T003X8_n707PrdFacCon[0] ;
         A704PrdExiAlm = T003X8_A704PrdExiAlm[0] ;
         n704PrdExiAlm = T003X8_n704PrdExiAlm[0] ;
         A705PrdExiCC = T003X8_A705PrdExiCC[0] ;
         n705PrdExiCC = T003X8_n705PrdExiCC[0] ;
         A706PrdExiCCP = T003X8_A706PrdExiCCP[0] ;
         n706PrdExiCCP = T003X8_n706PrdExiCCP[0] ;
         A5418PrdSalM = T003X8_A5418PrdSalM[0] ;
         n5418PrdSalM = T003X8_n5418PrdSalM[0] ;
         A10881PrdLote = T003X8_A10881PrdLote[0] ;
         n10881PrdLote = T003X8_n10881PrdLote[0] ;
         A13232PrdRGB = T003X8_A13232PrdRGB[0] ;
         n13232PrdRGB = T003X8_n13232PrdRGB[0] ;
         A795PrvNum = T003X8_A795PrvNum[0] ;
         n795PrvNum = T003X8_n795PrvNum[0] ;
         A856ValCod = T003X8_A856ValCod[0] ;
         n856ValCod = T003X8_n856ValCod[0] ;
         O685PrdCanRes = A685PrdCanRes ;
         n685PrdCanRes = false ;
         pr_default.close(4);
         A13832CantProduc = (A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         if ( isDlt( )  && ( ( AV20Flag == 1 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 ) ) )
         {
            A685PrdCanRes = O685PrdCanRes.subtract(O238CanRes) ;
            n685PrdCanRes = false ;
         }
         else
         {
            if ( isUpd( )  && ! ( ( AV20Flag == 1 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 ) ) && ( ( AV20Flag == 1 ) && ( GXutil.strcmp(GXutil.substring( O719PrdNum, 1, 1), "0") != 0 ) ) )
            {
               A685PrdCanRes = O685PrdCanRes.subtract(O238CanRes) ;
               n685PrdCanRes = false ;
            }
            else
            {
               if ( isUpd( )  && ( ( AV20Flag == 1 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 ) ) && ! ( ( AV20Flag == 1 ) && ( GXutil.strcmp(GXutil.substring( O719PrdNum, 1, 1), "0") != 0 ) ) )
               {
                  A685PrdCanRes = O685PrdCanRes.add(A238CanRes) ;
                  n685PrdCanRes = false ;
               }
               else
               {
                  if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( AV20Flag == 1 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 ) ) )
                  {
                     A685PrdCanRes = O685PrdCanRes.add(A238CanRes).subtract(O238CanRes) ;
                     n685PrdCanRes = false ;
                  }
               }
            }
         }
         /* Using cursor T003X6 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n874RecPrdFind), A874RecPrdFind, A872RecPrdNum, A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(2) != 101) )
         {
            A873RecPrdNom = T003X6_A873RecPrdNom[0] ;
            n873RecPrdNom = T003X6_n873RecPrdNom[0] ;
         }
         else
         {
            A873RecPrdNom = "" ;
            n873RecPrdNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A873RecPrdNom", A873RecPrdNom);
         }
         pr_default.close(2);
      }
   }

   public void updateTablesN13X410( )
   {
      /* Using cursor T003X31 */
      pr_default.execute(27, new Object[] {Boolean.valueOf(n685PrdCanRes), A685PrdCanRes, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
   }

   public void endLevel3X410( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(3);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart3X410( )
   {
      /* Scan By routine */
      /* Using cursor T003X32 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
      RcdFound410 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound410 = (short)(1) ;
         A811RecLin = T003X32_A811RecLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext3X410( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound410 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound410 = (short)(1) ;
         A811RecLin = T003X32_A811RecLin[0] ;
      }
   }

   public void scanEnd3X410( )
   {
      pr_default.close(28);
   }

   public void afterConfirm3X410( )
   {
      /* After Confirm Rules */
      if ( ( ! (GXutil.strcmp("", A719PrdNum)==0) ) && ( ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) || ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) && true /* After */ ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_decimal10[0] = A704PrdExiAlm ;
         GXv_decimal11[0] = A685PrdCanRes ;
         GXv_decimal12[0] = A686PrdCant ;
         GXv_decimal13[0] = A705PrdExiCC ;
         GXv_decimal14[0] = AV42Cantold ;
         GXv_int5[0] = AV58AlmCC ;
         GXv_char2[0] = AV72msgErr ;
         new app.pctrlcant(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal10, GXv_decimal11, GXv_decimal12, GXv_decimal13, GXv_decimal14, GXv_int5, GXv_char2) ;
         treclin_impl.this.A396EmprCod = GXv_char4[0] ;
         treclin_impl.this.A872RecPrdNum = GXv_char3[0] ;
         treclin_impl.this.A704PrdExiAlm = GXv_decimal10[0] ;
         treclin_impl.this.A685PrdCanRes = GXv_decimal11[0] ;
         treclin_impl.this.A686PrdCant = GXv_decimal12[0] ;
         treclin_impl.this.A705PrdExiCC = GXv_decimal13[0] ;
         treclin_impl.this.AV42Cantold = GXv_decimal14[0] ;
         treclin_impl.this.AV58AlmCC = GXv_int5[0] ;
         treclin_impl.this.AV72msgErr = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV42Cantold", GXutil.ltrimstr( AV42Cantold, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV58AlmCC", GXutil.str( AV58AlmCC, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV72msgErr", AV72msgErr);
      }
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") <= 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ && ( AV45Err_und == 1 ) )
      {
         GXCCtl = "RECPRDNUM_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion no ha entrado UNIDAD=1,2,3", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") <= 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ && ( AV45Err_und == 0 ) )
      {
         GXCCtl = "RECPRDNUM_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion no ha entrado UNIDAD=1,2,3", ""), 0, GXCCtl);
      }
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "0") == 0 ) && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_decimal14[0] = AV42Cantold ;
         GXv_decimal13[0] = A686PrdCant ;
         GXv_decimal12[0] = AV16TotKgs ;
         GXv_int6[0] = AV17Volumen ;
         GXv_int15[0] = AV29Valcos ;
         GXv_int5[0] = A490ForPrdUMe ;
         new app.preclin0(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal14, GXv_decimal13, GXv_decimal12, GXv_int6, GXv_int15, GXv_int5) ;
         treclin_impl.this.A396EmprCod = GXv_char4[0] ;
         treclin_impl.this.A872RecPrdNum = GXv_char3[0] ;
         treclin_impl.this.AV42Cantold = GXv_decimal14[0] ;
         treclin_impl.this.A686PrdCant = GXv_decimal13[0] ;
         treclin_impl.this.AV16TotKgs = GXv_decimal12[0] ;
         treclin_impl.this.AV17Volumen = GXv_int6[0] ;
         treclin_impl.this.AV29Valcos = (short)((short)(GXv_int15[0])) ;
         treclin_impl.this.A490ForPrdUMe = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV42Cantold", GXutil.ltrimstr( AV42Cantold, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV16TotKgs", GXutil.ltrimstr( AV16TotKgs, 10, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGS", getSecureSignedToken( "", localUtil.format( AV16TotKgs, "ZZZZZZ9.99")));
         httpContext.ajax_rsp_assign_attri("", false, "AV17Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Volumen), 5, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLUMEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Volumen), "ZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, "AV29Valcos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Valcos), 4, 0));
      }
      if ( ( AV71EliminarReceta == 1 ) && ! (GXutil.strcmp("", AV72msgErr)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.", "")+AV72msgErr, 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert3X410( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate3X410( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete3X410( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete3X410( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate3X410( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes3X410( )
   {
      edtRecLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLin_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdNum_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPrdFind_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdFind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdFind_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDsc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPrdDscf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDscf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDscf_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtFacCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCon_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecForNro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecForNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecForNro_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPrdTnq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdTnq_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLote_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecMar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMar_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdCanRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdExiCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtCantProduc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCantProduc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCantProduc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
   }

   public void send_integrity_lvl_hashes3X410( )
   {
   }

   public void send_integrity_lvl_hashes3X409( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV108RecLinMaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINPRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV109RecLinPro), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGS", getSecureSignedToken( "", localUtil.format( AV16TotKgs, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLUMEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Volumen), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNHDR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV110BarNHdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV111ProForDsc, ""))));
   }

   public void subsflControlProps_51410( )
   {
      edtRecLin_Internalname = "RECLIN_"+sGXsfl_51_idx ;
      edtRecPrdNum_Internalname = "RECPRDNUM_"+sGXsfl_51_idx ;
      edtRecPrdFind_Internalname = "RECPRDFIND_"+sGXsfl_51_idx ;
      edtRecPrdDsc_Internalname = "RECPRDDSC_"+sGXsfl_51_idx ;
      edtRecPrdDscf_Internalname = "RECPRDDSCF_"+sGXsfl_51_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_51_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_51_idx ;
      edtFacCon_Internalname = "FACCON_"+sGXsfl_51_idx ;
      edtPrdCant_Internalname = "PRDCANT_"+sGXsfl_51_idx ;
      edtRecForNro_Internalname = "RECFORNRO_"+sGXsfl_51_idx ;
      edtRecPrdTnq_Internalname = "RECPRDTNQ_"+sGXsfl_51_idx ;
      edtRecLote_Internalname = "RECLOTE_"+sGXsfl_51_idx ;
      edtRecMar_Internalname = "RECMAR_"+sGXsfl_51_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_51_idx ;
      edtPrdCanRes_Internalname = "PRDCANRES_"+sGXsfl_51_idx ;
      edtPrdExiCC_Internalname = "PRDEXICC_"+sGXsfl_51_idx ;
      edtCantProduc_Internalname = "CANTPRODUC_"+sGXsfl_51_idx ;
   }

   public void subsflControlProps_fel_51410( )
   {
      edtRecLin_Internalname = "RECLIN_"+sGXsfl_51_fel_idx ;
      edtRecPrdNum_Internalname = "RECPRDNUM_"+sGXsfl_51_fel_idx ;
      edtRecPrdFind_Internalname = "RECPRDFIND_"+sGXsfl_51_fel_idx ;
      edtRecPrdDsc_Internalname = "RECPRDDSC_"+sGXsfl_51_fel_idx ;
      edtRecPrdDscf_Internalname = "RECPRDDSCF_"+sGXsfl_51_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_51_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_51_fel_idx ;
      edtFacCon_Internalname = "FACCON_"+sGXsfl_51_fel_idx ;
      edtPrdCant_Internalname = "PRDCANT_"+sGXsfl_51_fel_idx ;
      edtRecForNro_Internalname = "RECFORNRO_"+sGXsfl_51_fel_idx ;
      edtRecPrdTnq_Internalname = "RECPRDTNQ_"+sGXsfl_51_fel_idx ;
      edtRecLote_Internalname = "RECLOTE_"+sGXsfl_51_fel_idx ;
      edtRecMar_Internalname = "RECMAR_"+sGXsfl_51_fel_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_51_fel_idx ;
      edtPrdCanRes_Internalname = "PRDCANRES_"+sGXsfl_51_fel_idx ;
      edtPrdExiCC_Internalname = "PRDEXICC_"+sGXsfl_51_fel_idx ;
      edtCantProduc_Internalname = "CANTPRODUC_"+sGXsfl_51_fel_idx ;
   }

   public void addRow3X410( )
   {
      nGXsfl_51_idx = (int)(nGXsfl_51_idx+1) ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_51410( ) ;
      sendRow3X410( ) ;
   }

   public void sendRow3X410( )
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
         if ( ((int)((nGXsfl_51_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_410_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLin_Internalname,GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtRecLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_410_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdNum_Internalname,GXutil.rtrim( A872RecPrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtRecPrdNum_Forecolor)+";",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtRecPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdFind_Internalname,GXutil.rtrim( A874RecPrdFind),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdFind_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtRecPrdFind_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_410_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdDsc_Internalname,GXutil.rtrim( A875RecPrdDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtRecPrdDsc_Forecolor)+";",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtRecPrdDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdDscf_Internalname,GXutil.rtrim( A13897RecPrdDscf),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdDscf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtRecPrdDscf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_410_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtForPrdUMe_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtForPrdDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_410_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacCon_Internalname,GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacCon_Enabled!=0) ? localUtil.format( A431FacCon, "ZZZZ9.99999") : localUtil.format( A431FacCon, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacCon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_410_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCant_Internalname,GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A686PrdCant, "ZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdCant_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_410_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecForNro_Internalname,GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecForNro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2394RecForNro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A2394RecForNro), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecForNro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtRecForNro_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_410_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdTnq_Internalname,GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecPrdTnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3274RecPrdTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3274RecPrdTnq), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdTnq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtRecPrdTnq_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_410_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLote_Internalname,GXutil.rtrim( A5725RecLote),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtRecLote_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecMar_Internalname,GXutil.ltrim( localUtil.ntoc( A4024RecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecMar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4024RecMar), "9") : localUtil.format( DecimalUtil.doubleToDec(A4024RecMar), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecMar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtRecMar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiAlm_Internalname,GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdExiAlm_Enabled!=0) ? localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiAlm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdExiAlm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCanRes_Internalname,GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdCanRes_Enabled!=0) ? localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999") : localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCanRes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdCanRes_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiCC_Internalname,GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiCC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtPrdExiCC_Visible),Integer.valueOf(edtPrdExiCC_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(edtPrdExiCC_Width),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCantProduc_Internalname,GXutil.ltrim( localUtil.ntoc( A13832CantProduc, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCantProduc_Enabled!=0) ? localUtil.format( A13832CantProduc, "ZZZZZZZZ9.99") : localUtil.format( A13832CantProduc, "ZZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCantProduc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtCantProduc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes3X410( ) ;
      GXCCtl = "Z811RecLin_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z875RecPrdDsc_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z875RecPrdDsc));
      GXCCtl = "Z686PrdCant_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5725RecLote_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5725RecLote));
      GXCCtl = "Z11708RecProv_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11708RecProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12710PrdCantOrg_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12710PrdCantOrg, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12641RecPrdDc2_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12641RecPrdDc2));
      GXCCtl = "Z431FacCon_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z683PrdCanFin_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z683PrdCanFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1797PrdCanAny_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1797PrdCanAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2394RecForNro_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3274RecPrdTnq_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3938RecCanEns_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3938RecCanEns, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4024RecMar_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4024RecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5422RecSalMP_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5422RecSalMP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5467RecSalVol_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5467RecSalVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5527RecLinRea_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5527RecLinRea));
      GXCCtl = "Z8934RecPes_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8934RecPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8937RecAcc_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8937RecAcc));
      GXCCtl = "Z9813FacCon1_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9813FacCon1, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3804RecFecMov_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z3804RecFecMov, 0, "/"));
      GXCCtl = "Z3805RecAnyTie_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3805RecAnyTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3806RecUltAny_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3806RecUltAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3807RecPorAny_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3807RecPorAny, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4900PrdCanMac_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4900PrdCanMac, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4576RecLinUsr_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4576RecLinUsr));
      GXCCtl = "Z4577RecPesFec_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z4577RecPesFec, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z12717RecFabId_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12717RecFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z872RecPrdNum_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z872RecPrdNum));
      GXCCtl = "Z13937RecLotAlm_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13937RecLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13938RecLoteFch_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z13938RecLoteFch, 0, "/"));
      GXCCtl = "Z719PrdNum_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z707PrdFacCon_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z704PrdExiAlm_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z705PrdExiCC_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z706PrdExiCCP_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z706PrdExiCCP, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5418PrdSalM_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5418PrdSalM));
      GXCCtl = "Z10881PrdLote_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10881PrdLote));
      GXCCtl = "Z13232PrdRGB_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z795PrvNum_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z856ValCod_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O431FacCon_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O686PrdCant_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O5725RecLote_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O5725RecLote));
      GXCCtl = "O490ForPrdUMe_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2394RecForNro_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O238CanRes_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O238CanRes, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O685PrdCanRes_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O719PrdNum_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O719PrdNum));
      GXCCtl = "O873RecPrdNom_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O873RecPrdNom));
      GXCCtl = "O872RecPrdNum_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O872RecPrdNum));
      GXCCtl = "CANRES_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A238CanRes, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "PRDNUM_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A719PrdNum));
      GXCCtl = "nRcdDeleted_410_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_410, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_410_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_410, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_410_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_410, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N686PrdCant_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N5725RecLote_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A5725RecLote));
      GXCCtl = "vMODE_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV104EmprCod));
      GXCCtl = "vBARCOD_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV105BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODREO_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV106BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODPAR_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV107BarCodPar));
      GXCCtl = "vFECPAN_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( AV37FecPan, 0, "/"));
      GXCCtl = "vMODIF_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV18Modif));
      GXCCtl = "EMPRCOD_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "BARCOD_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "BARCODREO_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "BARCODPAR_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A130BarCodPar));
      GXCCtl = "RECLINMAQ_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "RECLINPRO_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "PRDCANTORG_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A12710PrdCantOrg, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLIN_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDNUM_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdNum_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDNUM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDFIND_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdFind_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDDSC_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDDSC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDDSCF_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdDscf_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCON_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANT_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECFORNRO_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecForNro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDTNQ_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdTnq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLOTE_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLote_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECMAR_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecMar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXIALM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANRES_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXICC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXICC_"+sGXsfl_51_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXICC_"+sGXsfl_51_idx+"Width", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Width, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CANTPRODUC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCantProduc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow3X410( )
   {
      nGXsfl_51_idx = (int)(nGXsfl_51_idx+1) ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_51410( ) ;
      edtRecLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECLIN_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPrdNum_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDNUM_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDNUM_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPrdFind_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDFIND_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPrdDsc_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDDSC_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDDSC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPrdDscf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDDSCF_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACCON_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANT_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecForNro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECFORNRO_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPrdTnq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDTNQ_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecLote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECLOTE_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecMar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECMAR_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdExiAlm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXIALM_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdCanRes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANRES_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdExiCC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXICC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdExiCC_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXICC_"+sGXsfl_51_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdExiCC_Width = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXICC_"+sGXsfl_51_idx+"Width"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCantProduc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CANTPRODUC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "RECLIN_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecLin_Internalname ;
         wbErr = true ;
         A811RecLin = (short)(0) ;
      }
      else
      {
         A811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A872RecPrdNum = httpContext.cgiGet( edtRecPrdNum_Internalname) ;
      A874RecPrdFind = httpContext.cgiGet( edtRecPrdFind_Internalname) ;
      n874RecPrdFind = false ;
      A875RecPrdDsc = httpContext.cgiGet( edtRecPrdDsc_Internalname) ;
      A13897RecPrdDscf = httpContext.cgiGet( edtRecPrdDscf_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         wbErr = true ;
         A490ForPrdUMe = (byte)(0) ;
         n490ForPrdUMe = false ;
      }
      else
      {
         A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n490ForPrdUMe = false ;
      }
      A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
      n488ForPrdDsc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFacCon_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacCon_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
      {
         GXCCtl = "FACCON_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacCon_Internalname ;
         wbErr = true ;
         A431FacCon = DecimalUtil.ZERO ;
      }
      else
      {
         A431FacCon = localUtil.ctond( httpContext.cgiGet( edtFacCon_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdCant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdCant_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
      {
         GXCCtl = "PRDCANT_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdCant_Internalname ;
         wbErr = true ;
         A686PrdCant = DecimalUtil.ZERO ;
      }
      else
      {
         A686PrdCant = localUtil.ctond( httpContext.cgiGet( edtPrdCant_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "RECFORNRO_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecForNro_Internalname ;
         wbErr = true ;
         A2394RecForNro = (byte)(0) ;
      }
      else
      {
         A2394RecForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "RECPRDTNQ_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecPrdTnq_Internalname ;
         wbErr = true ;
         A3274RecPrdTnq = (byte)(0) ;
      }
      else
      {
         A3274RecPrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A5725RecLote = httpContext.cgiGet( edtRecLote_Internalname) ;
      A4024RecMar = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
      n704PrdExiAlm = false ;
      A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
      n685PrdCanRes = false ;
      A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)) ;
      n705PrdExiCC = false ;
      A13832CantProduc = localUtil.ctond( httpContext.cgiGet( edtCantProduc_Internalname)) ;
      GXCCtl = "Z811RecLin_" + sGXsfl_51_idx ;
      Z811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z875RecPrdDsc_" + sGXsfl_51_idx ;
      Z875RecPrdDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z686PrdCant_" + sGXsfl_51_idx ;
      Z686PrdCant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5725RecLote_" + sGXsfl_51_idx ;
      Z5725RecLote = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11708RecProv_" + sGXsfl_51_idx ;
      Z11708RecProv = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12710PrdCantOrg_" + sGXsfl_51_idx ;
      Z12710PrdCantOrg = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12641RecPrdDc2_" + sGXsfl_51_idx ;
      Z12641RecPrdDc2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z431FacCon_" + sGXsfl_51_idx ;
      Z431FacCon = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z683PrdCanFin_" + sGXsfl_51_idx ;
      Z683PrdCanFin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1797PrdCanAny_" + sGXsfl_51_idx ;
      Z1797PrdCanAny = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2394RecForNro_" + sGXsfl_51_idx ;
      Z2394RecForNro = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3274RecPrdTnq_" + sGXsfl_51_idx ;
      Z3274RecPrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3938RecCanEns_" + sGXsfl_51_idx ;
      Z3938RecCanEns = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4024RecMar_" + sGXsfl_51_idx ;
      Z4024RecMar = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5422RecSalMP_" + sGXsfl_51_idx ;
      Z5422RecSalMP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5467RecSalVol_" + sGXsfl_51_idx ;
      Z5467RecSalVol = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5527RecLinRea_" + sGXsfl_51_idx ;
      Z5527RecLinRea = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8934RecPes_" + sGXsfl_51_idx ;
      Z8934RecPes = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8937RecAcc_" + sGXsfl_51_idx ;
      Z8937RecAcc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9813FacCon1_" + sGXsfl_51_idx ;
      Z9813FacCon1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3804RecFecMov_" + sGXsfl_51_idx ;
      Z3804RecFecMov = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z3805RecAnyTie_" + sGXsfl_51_idx ;
      Z3805RecAnyTie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3806RecUltAny_" + sGXsfl_51_idx ;
      Z3806RecUltAny = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3807RecPorAny_" + sGXsfl_51_idx ;
      Z3807RecPorAny = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4900PrdCanMac_" + sGXsfl_51_idx ;
      Z4900PrdCanMac = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4576RecLinUsr_" + sGXsfl_51_idx ;
      Z4576RecLinUsr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4577RecPesFec_" + sGXsfl_51_idx ;
      Z4577RecPesFec = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12717RecFabId_" + sGXsfl_51_idx ;
      Z12717RecFabId = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z872RecPrdNum_" + sGXsfl_51_idx ;
      Z872RecPrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13937RecLotAlm_" + sGXsfl_51_idx ;
      Z13937RecLotAlm = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13938RecLoteFch_" + sGXsfl_51_idx ;
      Z13938RecLoteFch = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_51_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_51_idx ;
      Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z707PrdFacCon_" + sGXsfl_51_idx ;
      Z707PrdFacCon = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z704PrdExiAlm_" + sGXsfl_51_idx ;
      Z704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z705PrdExiCC_" + sGXsfl_51_idx ;
      Z705PrdExiCC = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z706PrdExiCCP_" + sGXsfl_51_idx ;
      Z706PrdExiCCP = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5418PrdSalM_" + sGXsfl_51_idx ;
      Z5418PrdSalM = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10881PrdLote_" + sGXsfl_51_idx ;
      Z10881PrdLote = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13232PrdRGB_" + sGXsfl_51_idx ;
      Z13232PrdRGB = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z795PrvNum_" + sGXsfl_51_idx ;
      Z795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z856ValCod_" + sGXsfl_51_idx ;
      Z856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11708RecProv_" + sGXsfl_51_idx ;
      A11708RecProv = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12710PrdCantOrg_" + sGXsfl_51_idx ;
      A12710PrdCantOrg = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12641RecPrdDc2_" + sGXsfl_51_idx ;
      A12641RecPrdDc2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z683PrdCanFin_" + sGXsfl_51_idx ;
      A683PrdCanFin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1797PrdCanAny_" + sGXsfl_51_idx ;
      A1797PrdCanAny = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3938RecCanEns_" + sGXsfl_51_idx ;
      A3938RecCanEns = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5422RecSalMP_" + sGXsfl_51_idx ;
      A5422RecSalMP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5467RecSalVol_" + sGXsfl_51_idx ;
      A5467RecSalVol = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5527RecLinRea_" + sGXsfl_51_idx ;
      A5527RecLinRea = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8934RecPes_" + sGXsfl_51_idx ;
      A8934RecPes = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8937RecAcc_" + sGXsfl_51_idx ;
      A8937RecAcc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9813FacCon1_" + sGXsfl_51_idx ;
      A9813FacCon1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3804RecFecMov_" + sGXsfl_51_idx ;
      A3804RecFecMov = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z3805RecAnyTie_" + sGXsfl_51_idx ;
      A3805RecAnyTie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3806RecUltAny_" + sGXsfl_51_idx ;
      A3806RecUltAny = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3807RecPorAny_" + sGXsfl_51_idx ;
      A3807RecPorAny = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4900PrdCanMac_" + sGXsfl_51_idx ;
      A4900PrdCanMac = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4576RecLinUsr_" + sGXsfl_51_idx ;
      A4576RecLinUsr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4577RecPesFec_" + sGXsfl_51_idx ;
      A4577RecPesFec = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12717RecFabId_" + sGXsfl_51_idx ;
      A12717RecFabId = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13937RecLotAlm_" + sGXsfl_51_idx ;
      A13937RecLotAlm = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13938RecLoteFch_" + sGXsfl_51_idx ;
      A13938RecLoteFch = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_51_idx ;
      A719PrdNum = httpContext.cgiGet( GXCCtl) ;
      n719PrdNum = false ;
      GXCCtl = "Z707PrdFacCon_" + sGXsfl_51_idx ;
      A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      n707PrdFacCon = false ;
      GXCCtl = "Z706PrdExiCCP_" + sGXsfl_51_idx ;
      A706PrdExiCCP = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      n706PrdExiCCP = false ;
      GXCCtl = "Z5418PrdSalM_" + sGXsfl_51_idx ;
      A5418PrdSalM = httpContext.cgiGet( GXCCtl) ;
      n5418PrdSalM = false ;
      GXCCtl = "Z10881PrdLote_" + sGXsfl_51_idx ;
      A10881PrdLote = httpContext.cgiGet( GXCCtl) ;
      n10881PrdLote = false ;
      GXCCtl = "Z13232PrdRGB_" + sGXsfl_51_idx ;
      A13232PrdRGB = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      n13232PrdRGB = false ;
      GXCCtl = "Z795PrvNum_" + sGXsfl_51_idx ;
      A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n795PrvNum = false ;
      GXCCtl = "Z856ValCod_" + sGXsfl_51_idx ;
      A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n856ValCod = false ;
      GXCCtl = "O431FacCon_" + sGXsfl_51_idx ;
      O431FacCon = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O686PrdCant_" + sGXsfl_51_idx ;
      O686PrdCant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O5725RecLote_" + sGXsfl_51_idx ;
      O5725RecLote = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O490ForPrdUMe_" + sGXsfl_51_idx ;
      O490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O2394RecForNro_" + sGXsfl_51_idx ;
      O2394RecForNro = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O238CanRes_" + sGXsfl_51_idx ;
      O238CanRes = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O685PrdCanRes_" + sGXsfl_51_idx ;
      O685PrdCanRes = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O719PrdNum_" + sGXsfl_51_idx ;
      O719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O873RecPrdNom_" + sGXsfl_51_idx ;
      O873RecPrdNom = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O872RecPrdNum_" + sGXsfl_51_idx ;
      O872RecPrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "CANRES_" + sGXsfl_51_idx ;
      A238CanRes = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "PRDNUM_" + sGXsfl_51_idx ;
      A719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_410_" + sGXsfl_51_idx ;
      nRcdDeleted_410 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_410_" + sGXsfl_51_idx ;
      nRcdExists_410 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_410_" + sGXsfl_51_idx ;
      nIsMod_410 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N686PrdCant_" + sGXsfl_51_idx ;
      N686PrdCant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "N5725RecLote_" + sGXsfl_51_idx ;
      N5725RecLote = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "PRDCANTORG_" + sGXsfl_51_idx ;
      A12710PrdCantOrg = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
   }

   public void assign_properties_default( )
   {
      defedtCantProduc_Enabled = edtCantProduc_Enabled ;
      defedtPrdCanRes_Enabled = edtPrdCanRes_Enabled ;
      defedtRecMar_Enabled = edtRecMar_Enabled ;
      defedtRecLote_Enabled = edtRecLote_Enabled ;
      defedtPrdCant_Enabled = edtPrdCant_Enabled ;
      defedtRecPrdDsc_Forecolor = edtRecPrdDsc_Forecolor ;
      defedtRecPrdNum_Forecolor = edtRecPrdNum_Forecolor ;
      defedtRecLin_Enabled = edtRecLin_Enabled ;
      defedtPrdExiCC_Enabled = edtPrdExiCC_Enabled ;
   }

   public void confirmValues3X0( )
   {
      nGXsfl_51_idx = 0 ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_51410( ) ;
      while ( nGXsfl_51_idx < nRC_GXsfl_51 )
      {
         nGXsfl_51_idx = (int)(nGXsfl_51_idx+1) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_51410( ) ;
         httpContext.changePostValue( "Z811RecLin_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z811RecLin_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z811RecLin_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z875RecPrdDsc_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z875RecPrdDsc_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z875RecPrdDsc_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z686PrdCant_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z686PrdCant_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z686PrdCant_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z5725RecLote_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z5725RecLote_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5725RecLote_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z11708RecProv_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z11708RecProv_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11708RecProv_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z12710PrdCantOrg_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z12710PrdCantOrg_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12710PrdCantOrg_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z12641RecPrdDc2_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z12641RecPrdDc2_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12641RecPrdDc2_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z431FacCon_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z431FacCon_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z431FacCon_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z683PrdCanFin_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z683PrdCanFin_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z683PrdCanFin_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z1797PrdCanAny_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z1797PrdCanAny_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1797PrdCanAny_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z2394RecForNro_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z2394RecForNro_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2394RecForNro_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z3274RecPrdTnq_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z3274RecPrdTnq_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3274RecPrdTnq_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z3938RecCanEns_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z3938RecCanEns_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3938RecCanEns_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z4024RecMar_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z4024RecMar_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4024RecMar_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z5422RecSalMP_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z5422RecSalMP_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5422RecSalMP_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z5467RecSalVol_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z5467RecSalVol_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5467RecSalVol_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z5527RecLinRea_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z5527RecLinRea_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5527RecLinRea_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z8934RecPes_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z8934RecPes_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8934RecPes_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z8937RecAcc_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z8937RecAcc_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8937RecAcc_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z9813FacCon1_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z9813FacCon1_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9813FacCon1_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z3804RecFecMov_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z3804RecFecMov_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3804RecFecMov_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z3805RecAnyTie_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z3805RecAnyTie_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3805RecAnyTie_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z3806RecUltAny_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z3806RecUltAny_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3806RecUltAny_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z3807RecPorAny_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z3807RecPorAny_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3807RecPorAny_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z4900PrdCanMac_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z4900PrdCanMac_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4900PrdCanMac_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z4576RecLinUsr_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z4576RecLinUsr_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4576RecLinUsr_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z4577RecPesFec_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z4577RecPesFec_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4577RecPesFec_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z12717RecFabId_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z12717RecFabId_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12717RecFabId_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z872RecPrdNum_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z872RecPrdNum_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z872RecPrdNum_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z13937RecLotAlm_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z13937RecLotAlm_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13937RecLotAlm_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z13938RecLoteFch_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z13938RecLoteFch_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13938RecLoteFch_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z490ForPrdUMe_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z707PrdFacCon_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z707PrdFacCon_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z707PrdFacCon_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z704PrdExiAlm_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z704PrdExiAlm_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z704PrdExiAlm_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z705PrdExiCC_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z705PrdExiCC_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z705PrdExiCC_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z706PrdExiCCP_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z706PrdExiCCP_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z706PrdExiCCP_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z5418PrdSalM_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z5418PrdSalM_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5418PrdSalM_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z10881PrdLote_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z10881PrdLote_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10881PrdLote_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z13232PrdRGB_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z13232PrdRGB_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13232PrdRGB_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z795PrvNum_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z795PrvNum_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z795PrvNum_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z856ValCod_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z856ValCod_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z856ValCod_"+sGXsfl_51_idx) ;
      }
      httpContext.changePostValue( "O431FacCon", httpContext.cgiGet( "T431FacCon")) ;
      httpContext.deletePostValue( "T431FacCon") ;
      httpContext.changePostValue( "O686PrdCant", httpContext.cgiGet( "T686PrdCant")) ;
      httpContext.deletePostValue( "T686PrdCant") ;
      httpContext.changePostValue( "O5725RecLote", httpContext.cgiGet( "T5725RecLote")) ;
      httpContext.deletePostValue( "T5725RecLote") ;
      httpContext.changePostValue( "O490ForPrdUMe", httpContext.cgiGet( "T490ForPrdUMe")) ;
      httpContext.deletePostValue( "T490ForPrdUMe") ;
      httpContext.changePostValue( "O2394RecForNro", httpContext.cgiGet( "T2394RecForNro")) ;
      httpContext.deletePostValue( "T2394RecForNro") ;
      httpContext.changePostValue( "O238CanRes", httpContext.cgiGet( "T238CanRes")) ;
      httpContext.deletePostValue( "T238CanRes") ;
      httpContext.changePostValue( "O685PrdCanRes", httpContext.cgiGet( "T685PrdCanRes")) ;
      httpContext.deletePostValue( "T685PrdCanRes") ;
      httpContext.changePostValue( "O719PrdNum", httpContext.cgiGet( "T719PrdNum")) ;
      httpContext.deletePostValue( "T719PrdNum") ;
      httpContext.changePostValue( "O873RecPrdNom", httpContext.cgiGet( "T873RecPrdNom")) ;
      httpContext.deletePostValue( "T873RecPrdNom") ;
      httpContext.changePostValue( "O872RecPrdNum", httpContext.cgiGet( "T872RecPrdNum")) ;
      httpContext.deletePostValue( "T872RecPrdNum") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.treclin", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV104EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV105BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV106BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV107BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV108RecLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV109RecLinPro,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV16TotKgs)),GXutil.URLEncode(GXutil.ltrimstr(AV17Volumen,5,0)),GXutil.URLEncode(GXutil.formatDateParm(AV37FecPan)),GXutil.URLEncode(GXutil.rtrim(AV18Modif)),GXutil.URLEncode(GXutil.rtrim(AV110BarNHdr)),GXutil.URLEncode(GXutil.rtrim(AV111ProForDsc))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","RecLinPro","TotKgs","Volumen","FecPan","Modif","BarNHdr","ProForDsc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV108RecLinMaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINPRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV109RecLinPro), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGS", getSecureSignedToken( "", localUtil.format( AV16TotKgs, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLUMEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Volumen), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNHDR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV110BarNHdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV111ProForDsc, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TRECLIN");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("treclin:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_51", GXutil.ltrim( localUtil.ntoc( nGXsfl_51_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECPAN", localUtil.dtoc( AV37FecPan, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECPAN", getSecureSignedToken( "", AV37FecPan));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV104EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV104EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV105BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV105BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV106BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV106BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV107BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV107BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLINMAQ", GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLINPRO", GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODIF", GXutil.rtrim( AV18Modif));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV113Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFACCON", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CANRES", GXutil.ltrim( localUtil.ntoc( A238CanRes, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCANTOLD", GXutil.ltrim( localUtil.ntoc( AV42Cantold, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDNOM", GXutil.rtrim( A873RecPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG", GXutil.ltrim( localUtil.ntoc( AV20Flag, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSUPREMA", GXutil.ltrim( localUtil.ntoc( AV50Suprema, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDRECLOTE", GXutil.rtrim( AV65oldRecLote));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO_I", AV44Texto_i);
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO_III", AV47Texto_iii);
      app.GxWebStd.gx_hidden_field( httpContext, "vARTEMALHA", GXutil.ltrim( localUtil.ntoc( AV63Artemalha, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDLOTE", GXutil.rtrim( A10881PrdLote));
      app.GxWebStd.gx_hidden_field( httpContext, "vLOTE01", GXutil.ltrim( localUtil.ntoc( AV70Lote01, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVNUM", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPROV", GXutil.ltrim( localUtil.ntoc( A11708RecProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANTORG", GXutil.ltrim( localUtil.ntoc( A12710PrdCantOrg, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOCANTIDAD", GXutil.ltrim( localUtil.ntoc( AV67NoCantidad, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV57Moda21, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDDC2", GXutil.rtrim( A12641RecPrdDc2));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV64Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vMSGERR", GXutil.rtrim( AV72msgErr));
      app.GxWebStd.gx_hidden_field( httpContext, "vALMCC", GXutil.ltrim( localUtil.ntoc( AV58AlmCC, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VALCOD", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vELIMINARRECETA", GXutil.ltrim( localUtil.ntoc( AV71EliminarReceta, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vERR_UND", GXutil.ltrim( localUtil.ntoc( AV45Err_und, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV33UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV36Station));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLINUSR", GXutil.rtrim( A4576RecLinUsr));
      app.GxWebStd.gx_hidden_field( httpContext, "vAVISOPESAJE", GXutil.ltrim( localUtil.ntoc( AV66AvisoPesaje, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANFIN", GXutil.ltrim( localUtil.ntoc( A683PrdCanFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANANY", GXutil.ltrim( localUtil.ntoc( A1797PrdCanAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECCANENS", GXutil.ltrim( localUtil.ntoc( A3938RecCanEns, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECSALMP", GXutil.ltrim( localUtil.ntoc( A5422RecSalMP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECSALVOL", GXutil.ltrim( localUtil.ntoc( A5467RecSalVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLINREA", GXutil.rtrim( A5527RecLinRea));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPES", GXutil.ltrim( localUtil.ntoc( A8934RecPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECACC", GXutil.rtrim( A8937RecAcc));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCON1", GXutil.ltrim( localUtil.ntoc( A9813FacCon1, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECFECMOV", localUtil.dtoc( A3804RecFecMov, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "RECANYTIE", GXutil.ltrim( localUtil.ntoc( A3805RecAnyTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECULTANY", GXutil.ltrim( localUtil.ntoc( A3806RecUltAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPORANY", GXutil.ltrim( localUtil.ntoc( A3807RecPorAny, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANMAC", GXutil.ltrim( localUtil.ntoc( A4900PrdCanMac, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPESFEC", localUtil.ttoc( A4577RecPesFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "RECFABID", GXutil.ltrim( localUtil.ntoc( A12717RecFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLOTALM", GXutil.ltrim( localUtil.ntoc( A13937RecLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLOTEFCH", localUtil.dtoc( A13938RecLoteFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXICCP", GXutil.ltrim( localUtil.ntoc( A706PrdExiCCP, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDSALM", GXutil.rtrim( A5418PrdSalM));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDRGB", GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.treclin", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV104EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV105BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV106BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV107BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV108RecLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV109RecLinPro,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV16TotKgs)),GXutil.URLEncode(GXutil.ltrimstr(AV17Volumen,5,0)),GXutil.URLEncode(GXutil.formatDateParm(AV37FecPan)),GXutil.URLEncode(GXutil.rtrim(AV18Modif)),GXutil.URLEncode(GXutil.rtrim(AV110BarNHdr)),GXutil.URLEncode(GXutil.rtrim(AV111ProForDsc))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","RecLinPro","TotKgs","Volumen","FecPan","Modif","BarNHdr","ProForDsc"})  ;
   }

   public String getPgmname( )
   {
      return "TRECLIN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento Productos en Receta", "") ;
   }

   public void initializeNonKey3X409( )
   {
   }

   public void initAll3X409( )
   {
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
      initializeNonKey3X409( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey3X410( )
   {
      AV72msgErr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72msgErr", AV72msgErr);
      AV42Cantold = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Cantold", GXutil.ltrimstr( AV42Cantold, 11, 3));
      A875RecPrdDsc = "" ;
      A719PrdNum = "" ;
      n719PrdNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A685PrdCanRes = DecimalUtil.ZERO ;
      n685PrdCanRes = false ;
      A686PrdCant = DecimalUtil.ZERO ;
      AV65oldRecLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65oldRecLote", AV65oldRecLote);
      AV44Texto_i = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Texto_i", AV44Texto_i);
      AV47Texto_iii = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Texto_iii", AV47Texto_iii);
      A5725RecLote = "" ;
      A874RecPrdFind = "" ;
      n874RecPrdFind = false ;
      A238CanRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrimstr( A238CanRes, 8, 2));
      A13832CantProduc = DecimalUtil.ZERO ;
      A873RecPrdNom = "" ;
      n873RecPrdNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A873RecPrdNom", A873RecPrdNom);
      A13897RecPrdDscf = "" ;
      A490ForPrdUMe = (byte)(0) ;
      n490ForPrdUMe = false ;
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      n707PrdFacCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
      A431FacCon = DecimalUtil.ZERO ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A683PrdCanFin", GXutil.ltrimstr( A683PrdCanFin, 11, 3));
      A1797PrdCanAny = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1797PrdCanAny", GXutil.ltrimstr( A1797PrdCanAny, 11, 3));
      A856ValCod = (byte)(0) ;
      n856ValCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      A704PrdExiAlm = DecimalUtil.ZERO ;
      n704PrdExiAlm = false ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      n705PrdExiCC = false ;
      A706PrdExiCCP = DecimalUtil.ZERO ;
      n706PrdExiCCP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
      A2394RecForNro = (byte)(0) ;
      A3274RecPrdTnq = (byte)(0) ;
      A3938RecCanEns = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3938RecCanEns", GXutil.ltrimstr( A3938RecCanEns, 10, 5));
      A4024RecMar = (byte)(0) ;
      A5422RecSalMP = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5422RecSalMP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5422RecSalMP), 3, 0));
      A5418PrdSalM = "" ;
      n5418PrdSalM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", A5418PrdSalM);
      A5467RecSalVol = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5467RecSalVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5467RecSalVol), 5, 0));
      A5527RecLinRea = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5527RecLinRea", A5527RecLinRea);
      A8934RecPes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8934RecPes", GXutil.str( A8934RecPes, 1, 0));
      A8937RecAcc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8937RecAcc", A8937RecAcc);
      A9813FacCon1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9813FacCon1", GXutil.ltrimstr( A9813FacCon1, 11, 5));
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
      A10881PrdLote = "" ;
      n10881PrdLote = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
      A4576RecLinUsr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4576RecLinUsr", A4576RecLinUsr);
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A4577RecPesFec", localUtil.ttoc( A4577RecPesFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A795PrvNum = 0 ;
      n795PrvNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      A12717RecFabId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12717RecFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12717RecFabId), 6, 0));
      A13232PrdRGB = 0 ;
      n13232PrdRGB = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13232PrdRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13232PrdRGB), 10, 0));
      A872RecPrdNum = "" ;
      A13937RecLotAlm = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13937RecLotAlm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13937RecLotAlm), 4, 0));
      A13938RecLoteFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A13938RecLoteFch", localUtil.format(A13938RecLoteFch, "99/99/99"));
      AV64Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64Inc_obs", AV64Inc_obs);
      A11708RecProv = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11708RecProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11708RecProv), 6, 0));
      A12710PrdCantOrg = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12710PrdCantOrg", GXutil.ltrimstr( A12710PrdCantOrg, 11, 3));
      A12641RecPrdDc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12641RecPrdDc2", A12641RecPrdDc2);
      O431FacCon = A431FacCon ;
      O686PrdCant = A686PrdCant ;
      O5725RecLote = A5725RecLote ;
      O490ForPrdUMe = A490ForPrdUMe ;
      n490ForPrdUMe = false ;
      O2394RecForNro = A2394RecForNro ;
      O238CanRes = A238CanRes ;
      httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrimstr( A238CanRes, 8, 2));
      O685PrdCanRes = A685PrdCanRes ;
      n685PrdCanRes = false ;
      O719PrdNum = A719PrdNum ;
      n719PrdNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      O873RecPrdNom = A873RecPrdNom ;
      n873RecPrdNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A873RecPrdNom", A873RecPrdNom);
      O872RecPrdNum = A872RecPrdNum ;
      Z875RecPrdDsc = "" ;
      Z686PrdCant = DecimalUtil.ZERO ;
      Z5725RecLote = "" ;
      Z11708RecProv = 0 ;
      Z12710PrdCantOrg = DecimalUtil.ZERO ;
      Z12641RecPrdDc2 = "" ;
      Z431FacCon = DecimalUtil.ZERO ;
      Z683PrdCanFin = DecimalUtil.ZERO ;
      Z1797PrdCanAny = DecimalUtil.ZERO ;
      Z2394RecForNro = (byte)(0) ;
      Z3274RecPrdTnq = (byte)(0) ;
      Z3938RecCanEns = DecimalUtil.ZERO ;
      Z4024RecMar = (byte)(0) ;
      Z5422RecSalMP = (short)(0) ;
      Z5467RecSalVol = 0 ;
      Z5527RecLinRea = "" ;
      Z8934RecPes = (byte)(0) ;
      Z8937RecAcc = "" ;
      Z9813FacCon1 = DecimalUtil.ZERO ;
      Z3804RecFecMov = GXutil.nullDate() ;
      Z3805RecAnyTie = (short)(0) ;
      Z3806RecUltAny = DecimalUtil.ZERO ;
      Z3807RecPorAny = DecimalUtil.ZERO ;
      Z4900PrdCanMac = DecimalUtil.ZERO ;
      Z4576RecLinUsr = "" ;
      Z4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      Z12717RecFabId = 0 ;
      Z872RecPrdNum = "" ;
      Z13937RecLotAlm = (short)(0) ;
      Z13938RecLoteFch = GXutil.nullDate() ;
      Z719PrdNum = "" ;
      Z490ForPrdUMe = (byte)(0) ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z706PrdExiCCP = DecimalUtil.ZERO ;
      Z5418PrdSalM = "" ;
      Z10881PrdLote = "" ;
      Z13232PrdRGB = 0 ;
      Z795PrvNum = 0 ;
      Z856ValCod = (byte)(0) ;
   }

   public void initAll3X410( )
   {
      A811RecLin = (short)(0) ;
      initializeNonKey3X410( ) ;
   }

   public void standaloneModalInsert3X410( )
   {
      A12710PrdCantOrg = i12710PrdCantOrg ;
      httpContext.ajax_rsp_assign_attri("", false, "A12710PrdCantOrg", GXutil.ltrimstr( A12710PrdCantOrg, 11, 3));
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824151590", true, true);
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
      httpContext.AddJavascriptSource("treclin.js", "?2026824151590", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties410( )
   {
      edtCantProduc_Enabled = defedtCantProduc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCantProduc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCantProduc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdCanRes_Enabled = defedtPrdCanRes_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecMar_Enabled = defedtRecMar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMar_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecLote_Enabled = defedtRecLote_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLote_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdCant_Enabled = defedtPrdCant_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPrdDsc_Forecolor = defedtRecPrdDsc_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDsc_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDsc_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      edtRecPrdNum_Forecolor = defedtRecPrdNum_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdNum_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdNum_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      edtRecLin_Enabled = defedtRecLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLin_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdExiCC_Enabled = defedtPrdExiCC_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), !bGXsfl_51_Refreshing);
   }

   public void startgridcontrol51( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A872RecPrdNum));
      Gridlevel_level1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdNum_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A874RecPrdFind));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdFind_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A875RecPrdDsc));
      Gridlevel_level1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13897RecPrdDscf));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdDscf_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecForNro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdTnq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A5725RecLote));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLote_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4024RecMar, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecMar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Width, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13832CantProduc, (byte)(12), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCantProduc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavProfordsc_Internalname = "vPROFORDSC" ;
      edtavValcos_Internalname = "vVALCOS" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavTotkgs_Internalname = "vTOTKGS" ;
      edtavVolumen_Internalname = "vVOLUMEN" ;
      edtavModo_Internalname = "vMODO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtRecLin_Internalname = "RECLIN" ;
      edtRecPrdNum_Internalname = "RECPRDNUM" ;
      edtRecPrdFind_Internalname = "RECPRDFIND" ;
      edtRecPrdDsc_Internalname = "RECPRDDSC" ;
      edtRecPrdDscf_Internalname = "RECPRDDSCF" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtFacCon_Internalname = "FACCON" ;
      edtPrdCant_Internalname = "PRDCANT" ;
      edtRecForNro_Internalname = "RECFORNRO" ;
      edtRecPrdTnq_Internalname = "RECPRDTNQ" ;
      edtRecLote_Internalname = "RECLOTE" ;
      edtRecMar_Internalname = "RECMAR" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtPrdCanRes_Internalname = "PRDCANRES" ;
      edtPrdExiCC_Internalname = "PRDEXICC" ;
      edtCantProduc_Internalname = "CANTPRODUC" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavBarnhdr_Internalname = "vBARNHDR" ;
      edtavReclinmaq_Internalname = "vRECLINMAQ" ;
      edtavReclinpro_Internalname = "vRECLINPRO" ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento Productos en Receta", "") );
      edtCantProduc_Jsonclick = "" ;
      edtPrdExiCC_Jsonclick = "" ;
      edtPrdCanRes_Jsonclick = "" ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtRecMar_Jsonclick = "" ;
      edtRecLote_Jsonclick = "" ;
      edtRecPrdTnq_Jsonclick = "" ;
      edtRecForNro_Jsonclick = "" ;
      edtPrdCant_Jsonclick = "" ;
      edtFacCon_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtRecPrdDscf_Jsonclick = "" ;
      edtRecPrdDsc_Jsonclick = "" ;
      edtRecPrdFind_Jsonclick = "" ;
      edtRecPrdNum_Jsonclick = "" ;
      edtRecLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtCantProduc_Enabled = 0 ;
      edtPrdCanRes_Enabled = 0 ;
      edtPrdExiAlm_Enabled = 0 ;
      edtRecMar_Enabled = 0 ;
      edtRecLote_Enabled = 1 ;
      edtRecPrdTnq_Enabled = 1 ;
      edtRecForNro_Enabled = 1 ;
      edtPrdCant_Enabled = 1 ;
      edtFacCon_Enabled = 1 ;
      edtForPrdDsc_Enabled = 0 ;
      edtForPrdUMe_Enabled = 1 ;
      edtRecPrdDscf_Enabled = 0 ;
      edtRecPrdDsc_Enabled = 1 ;
      edtRecPrdDsc_Forecolor = (int)(0x000000) ;
      edtRecPrdFind_Enabled = 0 ;
      edtRecPrdNum_Enabled = 1 ;
      edtRecPrdNum_Forecolor = (int)(0x000000) ;
      edtRecLin_Enabled = 1 ;
      edtavReclinpro_Jsonclick = "" ;
      edtavReclinpro_Enabled = 0 ;
      edtavReclinpro_Visible = 1 ;
      edtavReclinmaq_Jsonclick = "" ;
      edtavReclinmaq_Enabled = 0 ;
      edtavReclinmaq_Visible = 1 ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 0 ;
      edtavBarnhdr_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtavModo_Jsonclick = "" ;
      edtavModo_Enabled = 0 ;
      edtavVolumen_Jsonclick = "" ;
      edtavVolumen_Enabled = 0 ;
      edtavTotkgs_Jsonclick = "" ;
      edtavTotkgs_Enabled = 0 ;
      edtavValcos_Jsonclick = "" ;
      edtavValcos_Enabled = 0 ;
      edtavProfordsc_Jsonclick = "" ;
      edtavProfordsc_Enabled = 0 ;
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
      edtPrdExiCC_Width = 0 ;
      edtPrdExiCC_Enabled = 0 ;
      edtPrdExiCC_Visible = 0 ;
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

   public void gx15asarecprddscf3X410( String A874RecPrdFind ,
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
         treclin_impl.this.A396EmprCod = GXv_char4[0] ;
         treclin_impl.this.A872RecPrdNum = GXv_char3[0] ;
         treclin_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13897RecPrdDscf = GXt_char1 ;
      }
      else
      {
         A13897RecPrdDscf = "" ;
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

   public void xc_41_3X410( String A396EmprCod ,
                            String A872RecPrdNum ,
                            java.math.BigDecimal A704PrdExiAlm ,
                            java.math.BigDecimal A685PrdCanRes ,
                            java.math.BigDecimal A686PrdCant ,
                            java.math.BigDecimal A705PrdExiCC ,
                            java.math.BigDecimal AV42Cantold ,
                            byte AV58AlmCC ,
                            String AV72msgErr ,
                            String A719PrdNum ,
                            java.math.BigDecimal A431FacCon )
   {
      if ( ( ! (GXutil.strcmp("", A719PrdNum)==0) ) && ( ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) || ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) && true /* After */ ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_decimal14[0] = A704PrdExiAlm ;
         GXv_decimal13[0] = A685PrdCanRes ;
         GXv_decimal12[0] = A686PrdCant ;
         GXv_decimal11[0] = A705PrdExiCC ;
         GXv_decimal10[0] = AV42Cantold ;
         GXv_int5[0] = AV58AlmCC ;
         GXv_char2[0] = AV72msgErr ;
         new app.pctrlcant(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal14, GXv_decimal13, GXv_decimal12, GXv_decimal11, GXv_decimal10, GXv_int5, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A872RecPrdNum = GXv_char3[0] ;
         A704PrdExiAlm = GXv_decimal14[0] ;
         A685PrdCanRes = GXv_decimal13[0] ;
         A686PrdCant = GXv_decimal12[0] ;
         A705PrdExiCC = GXv_decimal11[0] ;
         AV42Cantold = GXv_decimal10[0] ;
         AV58AlmCC = GXv_int5[0] ;
         AV72msgErr = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV42Cantold", GXutil.ltrimstr( AV42Cantold, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV58AlmCC", GXutil.str( AV58AlmCC, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV72msgErr", AV72msgErr);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A872RecPrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV42Cantold, (byte)(11), (byte)(3), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV58AlmCC, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV72msgErr))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_42_3X410( String A396EmprCod ,
                            String A872RecPrdNum ,
                            java.math.BigDecimal AV42Cantold ,
                            java.math.BigDecimal A686PrdCant ,
                            java.math.BigDecimal AV16TotKgs ,
                            int AV17Volumen ,
                            short AV29Valcos ,
                            byte A490ForPrdUMe ,
                            java.math.BigDecimal A431FacCon )
   {
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "0") == 0 ) && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_decimal14[0] = AV42Cantold ;
         GXv_decimal13[0] = A686PrdCant ;
         GXv_decimal12[0] = AV16TotKgs ;
         GXv_int15[0] = AV17Volumen ;
         GXv_int6[0] = AV29Valcos ;
         GXv_int5[0] = A490ForPrdUMe ;
         new app.preclin0(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal14, GXv_decimal13, GXv_decimal12, GXv_int15, GXv_int6, GXv_int5) ;
         A396EmprCod = GXv_char4[0] ;
         A872RecPrdNum = GXv_char3[0] ;
         AV42Cantold = GXv_decimal14[0] ;
         A686PrdCant = GXv_decimal13[0] ;
         AV16TotKgs = GXv_decimal12[0] ;
         AV17Volumen = GXv_int15[0] ;
         AV29Valcos = (short)((short)(GXv_int6[0])) ;
         A490ForPrdUMe = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV42Cantold", GXutil.ltrimstr( AV42Cantold, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV16TotKgs", GXutil.ltrimstr( AV16TotKgs, 10, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGS", getSecureSignedToken( "", localUtil.format( AV16TotKgs, "ZZZZZZ9.99")));
         httpContext.ajax_rsp_assign_attri("", false, "AV17Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Volumen), 5, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLUMEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Volumen), "ZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, "AV29Valcos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Valcos), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A872RecPrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV42Cantold, (byte)(11), (byte)(3), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV16TotKgs, (byte)(10), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV17Volumen, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV29Valcos, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_53_3X410( String A396EmprCod ,
                            String AV113Pgmname ,
                            String AV33UsurCod ,
                            String AV36Station ,
                            String AV44Texto_i ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar )
   {
      if ( true /* After */ || true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV113Pgmname, AV33UsurCod, AV36Station, AV44Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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

   public void xc_54_3X410( String A396EmprCod ,
                            String AV113Pgmname ,
                            String AV33UsurCod ,
                            String AV36Station ,
                            String AV44Texto_i ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            java.math.BigDecimal A431FacCon )
   {
      if ( true /* After */ && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV113Pgmname, AV33UsurCod, AV36Station, AV44Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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

   public void xc_55_3X410( String A396EmprCod ,
                            String AV113Pgmname ,
                            String AV33UsurCod ,
                            String AV36Station ,
                            String AV47Texto_iii ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            java.math.BigDecimal A686PrdCant ,
                            java.math.BigDecimal A431FacCon )
   {
      if ( true /* After */ && ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) == 0 ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV113Pgmname, AV33UsurCod, AV36Station, AV47Texto_iii, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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

   public void xc_56_3X410( String A396EmprCod ,
                            String AV113Pgmname ,
                            String AV33UsurCod ,
                            String AV36Station ,
                            String AV64Inc_obs ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            String A5725RecLote ,
                            String AV65oldRecLote )
   {
      if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A5725RecLote, AV65oldRecLote) != 0 ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV113Pgmname, AV33UsurCod, AV36Station, AV64Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
      subsflControlProps_51410( ) ;
      while ( nGXsfl_51_idx <= nRC_GXsfl_51 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal3X410( ) ;
         standaloneModal3X410( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow3X410( ) ;
         nGXsfl_51_idx = (int)(nGXsfl_51_idx+1) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_51410( ) ;
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

   public void valid_Recprdnum( )
   {
      n874RecPrdFind = false ;
      /* Using cursor T003X30 */
      pr_default.execute(26, new Object[] {A396EmprCod, A872RecPrdNum});
      if ( (pr_default.getStatus(26) != 101) )
      {
         A874RecPrdFind = T003X30_A874RecPrdFind[0] ;
         n874RecPrdFind = T003X30_n874RecPrdFind[0] ;
      }
      else
      {
         A874RecPrdFind = "xxxxxx" ;
         n874RecPrdFind = false ;
      }
      pr_default.close(26);
      if ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 )
      {
         GXt_char1 = A13897RecPrdDscf ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         treclin_impl.this.A396EmprCod = GXv_char4[0] ;
         treclin_impl.this.A872RecPrdNum = GXv_char3[0] ;
         treclin_impl.this.GXt_char1 = GXv_char2[0] ;
         A13897RecPrdDscf = GXt_char1 ;
      }
      else
      {
         A13897RecPrdDscf = "" ;
      }
      if ( ( AV67NoCantidad == 1 ) || ( AV57Moda21 == 1 ) )
      {
         edtPrdCant_Enabled = 0 ;
      }
      else
      {
         if ( (GXutil.strcmp("", A872RecPrdNum)==0) )
         {
            edtPrdCant_Enabled = 0 ;
         }
         else
         {
            edtPrdCant_Enabled = 1 ;
         }
      }
      if ( ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") == 0 ) && ! (GXutil.strcmp("", A872RecPrdNum)==0) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto Inexistente", ""), 1, "RECPRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecPrdNum_Internalname ;
      }
      if ( isUpd( )  && ( GXutil.strcmp(A872RecPrdNum, O872RecPrdNum) != 0 ) && true /* After */ && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "9") <= 0 ) )
      {
         httpContext.GX_msglist.addItem(AV69msg_err1, 1, "RECPRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecPrdNum_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", GXutil.rtrim( A874RecPrdFind));
      httpContext.ajax_rsp_assign_attri("", false, "A13897RecPrdDscf", GXutil.rtrim( A13897RecPrdDscf));
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Enabled), 5, 0), !bGXsfl_51_Refreshing);
   }

   public void valid_Forprdume( )
   {
      n490ForPrdUMe = false ;
      n488ForPrdDsc = false ;
      /* Using cursor T003X29 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A490ForPrdUMe) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForPrdUMe_Internalname ;
         }
      }
      A488ForPrdDsc = T003X29_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T003X29_n488ForPrdDsc[0] ;
      pr_default.close(25);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) || (0==A490ForPrdUMe) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      if ( (GXutil.strcmp("", A872RecPrdNum)==0) && ( A490ForPrdUMe > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Accion No permitida. NO hay PRODUCTO", ""), 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") <= 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ && ( AV45Err_und == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion no ha entrado UNIDAD=1,2,3", ""), 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") <= 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ && ( AV45Err_und == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion no ha entrado UNIDAD=1,2,3", ""), 0, "FORPRDUME");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
   }

   public void valid_Prdcant( )
   {
      A238CanRes = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      AV42Cantold = O686PrdCant ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrim( localUtil.ntoc( A238CanRes, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV42Cantold", GXutil.ltrim( localUtil.ntoc( AV42Cantold, (byte)(11), (byte)(3), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV104EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV105BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV106BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV107BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV108RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV109RecLinPro',fld:'vRECLINPRO',pic:'Z9',hsh:true},{av:'AV16TotKgs',fld:'vTOTKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV17Volumen',fld:'vVOLUMEN',pic:'ZZZZ9',hsh:true},{av:'AV37FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV18Modif',fld:'vMODIF',pic:''},{av:'AV110BarNHdr',fld:'vBARNHDR',pic:'',hsh:true},{av:'AV111ProForDsc',fld:'vPROFORDSC',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV37FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV104EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV105BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV106BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV107BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV108RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV109RecLinPro',fld:'vRECLINPRO',pic:'Z9',hsh:true},{av:'AV16TotKgs',fld:'vTOTKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV17Volumen',fld:'vVOLUMEN',pic:'ZZZZ9',hsh:true},{av:'AV110BarNHdr',fld:'vBARNHDR',pic:'',hsh:true},{av:'AV111ProForDsc',fld:'vPROFORDSC',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e123X2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALIDV_TOTKGS","{handler:'validv_Totkgs',iparms:[]");
      setEventMetadata("VALIDV_TOTKGS",",oparms:[]}");
      setEventMetadata("VALIDV_VOLUMEN","{handler:'validv_Volumen',iparms:[]");
      setEventMetadata("VALIDV_VOLUMEN",",oparms:[]}");
      setEventMetadata("VALIDV_RECLINMAQ","{handler:'validv_Reclinmaq',iparms:[]");
      setEventMetadata("VALIDV_RECLINMAQ",",oparms:[]}");
      setEventMetadata("VALIDV_RECLINPRO","{handler:'validv_Reclinpro',iparms:[]");
      setEventMetadata("VALIDV_RECLINPRO",",oparms:[]}");
      setEventMetadata("VALID_RECLIN","{handler:'valid_Reclin',iparms:[]");
      setEventMetadata("VALID_RECLIN",",oparms:[]}");
      setEventMetadata("VALID_RECPRDNUM","{handler:'valid_Recprdnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O872RecPrdNum'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'A874RecPrdFind',fld:'RECPRDFIND',pic:''},{av:'AV67NoCantidad',fld:'vNOCANTIDAD',pic:'9'},{av:'AV57Moda21',fld:'vMODA21',pic:'9'},{av:'A13897RecPrdDscf',fld:'RECPRDDSCF',pic:''}]");
      setEventMetadata("VALID_RECPRDNUM",",oparms:[{av:'A874RecPrdFind',fld:'RECPRDFIND',pic:''},{av:'A13897RecPrdDscf',fld:'RECPRDDSCF',pic:''},{av:'edtPrdCant_Enabled',ctrl:'PRDCANT',prop:'Enabled'}]}");
      setEventMetadata("VALID_RECPRDFIND","{handler:'valid_Recprdfind',iparms:[]");
      setEventMetadata("VALID_RECPRDFIND",",oparms:[]}");
      setEventMetadata("VALID_RECPRDDSC","{handler:'valid_Recprddsc',iparms:[]");
      setEventMetadata("VALID_RECPRDDSC",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]}");
      setEventMetadata("VALID_FACCON","{handler:'valid_Faccon',iparms:[]");
      setEventMetadata("VALID_FACCON",",oparms:[]}");
      setEventMetadata("VALID_PRDCANT","{handler:'valid_Prdcant',iparms:[{av:'O686PrdCant'},{av:'A686PrdCant',fld:'PRDCANT',pic:'ZZZZZZ9.999'},{av:'A238CanRes',fld:'CANRES',pic:'ZZZZ9.99'},{av:'AV42Cantold',fld:'vCANTOLD',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("VALID_PRDCANT",",oparms:[{av:'A238CanRes',fld:'CANRES',pic:'ZZZZ9.99'},{av:'AV42Cantold',fld:'vCANTOLD',pic:'ZZZZZZ9.999'}]}");
      setEventMetadata("VALID_RECFORNRO","{handler:'valid_Recfornro',iparms:[]");
      setEventMetadata("VALID_RECFORNRO",",oparms:[]}");
      setEventMetadata("VALID_RECLOTE","{handler:'valid_Reclote',iparms:[]");
      setEventMetadata("VALID_RECLOTE",",oparms:[]}");
      setEventMetadata("VALID_PRDEXIALM","{handler:'valid_Prdexialm',iparms:[]");
      setEventMetadata("VALID_PRDEXIALM",",oparms:[]}");
      setEventMetadata("VALID_PRDCANRES","{handler:'valid_Prdcanres',iparms:[]");
      setEventMetadata("VALID_PRDCANRES",",oparms:[]}");
      setEventMetadata("VALID_PRDEXICC","{handler:'valid_Prdexicc',iparms:[]");
      setEventMetadata("VALID_PRDEXICC",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Cantproduc',iparms:[]");
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
      pr_default.close(4);
      pr_default.close(25);
      pr_default.close(26);
      pr_default.close(2);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV104EmprCod = "" ;
      wcpOAV107BarCodPar = "" ;
      wcpOAV16TotKgs = DecimalUtil.ZERO ;
      wcpOAV37FecPan = GXutil.nullDate() ;
      wcpOAV110BarNHdr = "" ;
      wcpOAV111ProForDsc = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z875RecPrdDsc = "" ;
      Z686PrdCant = DecimalUtil.ZERO ;
      Z5725RecLote = "" ;
      Z12710PrdCantOrg = DecimalUtil.ZERO ;
      Z12641RecPrdDc2 = "" ;
      Z431FacCon = DecimalUtil.ZERO ;
      Z683PrdCanFin = DecimalUtil.ZERO ;
      Z1797PrdCanAny = DecimalUtil.ZERO ;
      Z3938RecCanEns = DecimalUtil.ZERO ;
      Z5527RecLinRea = "" ;
      Z8937RecAcc = "" ;
      Z9813FacCon1 = DecimalUtil.ZERO ;
      Z3804RecFecMov = GXutil.nullDate() ;
      Z3806RecUltAny = DecimalUtil.ZERO ;
      Z3807RecPorAny = DecimalUtil.ZERO ;
      Z4900PrdCanMac = DecimalUtil.ZERO ;
      Z4576RecLinUsr = "" ;
      Z4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      Z872RecPrdNum = "" ;
      Z13938RecLoteFch = GXutil.nullDate() ;
      Z719PrdNum = "" ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z706PrdExiCCP = DecimalUtil.ZERO ;
      Z5418PrdSalM = "" ;
      Z10881PrdLote = "" ;
      O431FacCon = DecimalUtil.ZERO ;
      O686PrdCant = DecimalUtil.ZERO ;
      O5725RecLote = "" ;
      O238CanRes = DecimalUtil.ZERO ;
      O685PrdCanRes = DecimalUtil.ZERO ;
      O719PrdNum = "" ;
      O873RecPrdNom = "" ;
      O872RecPrdNum = "" ;
      N686PrdCant = DecimalUtil.ZERO ;
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
      AV42Cantold = DecimalUtil.ZERO ;
      AV72msgErr = "" ;
      A719PrdNum = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      AV16TotKgs = DecimalUtil.ZERO ;
      AV113Pgmname = "" ;
      AV33UsurCod = "" ;
      AV36Station = "" ;
      AV44Texto_i = "" ;
      A130BarCodPar = "" ;
      AV47Texto_iii = "" ;
      AV64Inc_obs = "" ;
      A5725RecLote = "" ;
      AV65oldRecLote = "" ;
      A874RecPrdFind = "" ;
      Gx_mode = "" ;
      AV104EmprCod = "" ;
      AV107BarCodPar = "" ;
      AV37FecPan = GXutil.nullDate() ;
      AV18Modif = "" ;
      AV110BarNHdr = "" ;
      AV111ProForDsc = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      AV112Modo = "" ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode410 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A238CanRes = DecimalUtil.ZERO ;
      A873RecPrdNom = "" ;
      A10881PrdLote = "" ;
      A12710PrdCantOrg = DecimalUtil.ZERO ;
      A12641RecPrdDc2 = "" ;
      A4576RecLinUsr = "" ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A3938RecCanEns = DecimalUtil.ZERO ;
      A5527RecLinRea = "" ;
      A8937RecAcc = "" ;
      A9813FacCon1 = DecimalUtil.ZERO ;
      A3804RecFecMov = GXutil.nullDate() ;
      A3806RecUltAny = DecimalUtil.ZERO ;
      A3807RecPorAny = DecimalUtil.ZERO ;
      A4900PrdCanMac = DecimalUtil.ZERO ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A13938RecLoteFch = GXutil.nullDate() ;
      A706PrdExiCCP = DecimalUtil.ZERO ;
      A5418PrdSalM = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode409 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sV18Modif = "" ;
      GXCCtl = "" ;
      A875RecPrdDsc = "" ;
      A13897RecPrdDscf = "" ;
      A488ForPrdDsc = "" ;
      A13832CantProduc = DecimalUtil.ZERO ;
      T431FacCon = DecimalUtil.ZERO ;
      T686PrdCant = DecimalUtil.ZERO ;
      T5725RecLote = "" ;
      T238CanRes = DecimalUtil.ZERO ;
      T685PrdCanRes = DecimalUtil.ZERO ;
      T719PrdNum = "" ;
      T873RecPrdNom = "" ;
      T872RecPrdNum = "" ;
      AV49Proforfab = "" ;
      AV55Lit50 = "" ;
      AV56Lit51 = "" ;
      AV19msg4 = "" ;
      AV61MsgErrFactor = "" ;
      AV62Conf = "" ;
      AV69msg_err1 = "" ;
      AV38EmprNom = "" ;
      AV101WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV102TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV103WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T003X13_A407EmprNom = new String[] {""} ;
      T003X13_n407EmprNom = new boolean[] {false} ;
      T003X14_A396EmprCod = new String[] {""} ;
      T003X15_A407EmprNom = new String[] {""} ;
      T003X15_n407EmprNom = new boolean[] {false} ;
      T003X15_A1273RecLinPro = new byte[1] ;
      T003X15_A396EmprCod = new String[] {""} ;
      T003X15_A129BarCod = new int[1] ;
      T003X15_A132BarCodReo = new byte[1] ;
      T003X15_A130BarCodPar = new String[] {""} ;
      T003X15_A2804RecLinMaq = new short[1] ;
      T003X16_A396EmprCod = new String[] {""} ;
      T003X16_A129BarCod = new int[1] ;
      T003X16_A132BarCodReo = new byte[1] ;
      T003X16_A130BarCodPar = new String[] {""} ;
      T003X16_A2804RecLinMaq = new short[1] ;
      T003X16_A1273RecLinPro = new byte[1] ;
      T003X12_A1273RecLinPro = new byte[1] ;
      T003X12_A396EmprCod = new String[] {""} ;
      T003X12_A129BarCod = new int[1] ;
      T003X12_A132BarCodReo = new byte[1] ;
      T003X12_A130BarCodPar = new String[] {""} ;
      T003X12_A2804RecLinMaq = new short[1] ;
      T003X17_A1273RecLinPro = new byte[1] ;
      T003X17_A396EmprCod = new String[] {""} ;
      T003X17_A129BarCod = new int[1] ;
      T003X17_A132BarCodReo = new byte[1] ;
      T003X17_A130BarCodPar = new String[] {""} ;
      T003X17_A2804RecLinMaq = new short[1] ;
      T003X18_A1273RecLinPro = new byte[1] ;
      T003X18_A396EmprCod = new String[] {""} ;
      T003X18_A129BarCod = new int[1] ;
      T003X18_A132BarCodReo = new byte[1] ;
      T003X18_A130BarCodPar = new String[] {""} ;
      T003X18_A2804RecLinMaq = new short[1] ;
      T003X11_A1273RecLinPro = new byte[1] ;
      T003X11_A396EmprCod = new String[] {""} ;
      T003X11_A129BarCod = new int[1] ;
      T003X11_A132BarCodReo = new byte[1] ;
      T003X11_A130BarCodPar = new String[] {""} ;
      T003X11_A2804RecLinMaq = new short[1] ;
      T003X21_A396EmprCod = new String[] {""} ;
      T003X21_A129BarCod = new int[1] ;
      T003X21_A132BarCodReo = new byte[1] ;
      T003X21_A130BarCodPar = new String[] {""} ;
      T003X21_A2804RecLinMaq = new short[1] ;
      T003X21_A1273RecLinPro = new byte[1] ;
      Z685PrdCanRes = DecimalUtil.ZERO ;
      Z488ForPrdDsc = "" ;
      Z874RecPrdFind = "" ;
      T003X22_A129BarCod = new int[1] ;
      T003X22_A132BarCodReo = new byte[1] ;
      T003X22_A130BarCodPar = new String[] {""} ;
      T003X22_A2804RecLinMaq = new short[1] ;
      T003X22_A1273RecLinPro = new byte[1] ;
      T003X22_A811RecLin = new short[1] ;
      T003X22_A875RecPrdDsc = new String[] {""} ;
      T003X22_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X22_n685PrdCanRes = new boolean[] {false} ;
      T003X22_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X22_A5725RecLote = new String[] {""} ;
      T003X22_A11708RecProv = new int[1] ;
      T003X22_A12710PrdCantOrg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X22_A12641RecPrdDc2 = new String[] {""} ;
      T003X22_A488ForPrdDsc = new String[] {""} ;
      T003X22_n488ForPrdDsc = new boolean[] {false} ;
      T003X22_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X22_n707PrdFacCon = new boolean[] {false} ;
      T003X22_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X22_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X22_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X22_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X22_n704PrdExiAlm = new boolean[] {false} ;
      T003X22_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X22_n705PrdExiCC = new boolean[] {false} ;
      T003X22_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X22_n706PrdExiCCP = new boolean[] {false} ;
      T003X22_A2394RecForNro = new byte[1] ;
      T003X22_A3274RecPrdTnq = new byte[1] ;
      T003X22_A3938RecCanEns = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X22_A4024RecMar = new byte[1] ;
      T003X22_A5422RecSalMP = new short[1] ;
      T003X22_A5418PrdSalM = new String[] {""} ;
      T003X22_n5418PrdSalM = new boolean[] {false} ;
      T003X22_A5467RecSalVol = new int[1] ;
      T003X22_A5527RecLinRea = new String[] {""} ;
      T003X22_A8934RecPes = new byte[1] ;
      T003X22_A8937RecAcc = new String[] {""} ;
      T003X22_A9813FacCon1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X22_A3804RecFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      T003X22_A3805RecAnyTie = new short[1] ;
      T003X22_A3806RecUltAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X22_A3807RecPorAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X22_A4900PrdCanMac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X22_A10881PrdLote = new String[] {""} ;
      T003X22_n10881PrdLote = new boolean[] {false} ;
      T003X22_A4576RecLinUsr = new String[] {""} ;
      T003X22_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      T003X22_A12717RecFabId = new int[1] ;
      T003X22_A13232PrdRGB = new long[1] ;
      T003X22_n13232PrdRGB = new boolean[] {false} ;
      T003X22_A872RecPrdNum = new String[] {""} ;
      T003X22_A13937RecLotAlm = new short[1] ;
      T003X22_A13938RecLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      T003X22_A396EmprCod = new String[] {""} ;
      T003X22_A719PrdNum = new String[] {""} ;
      T003X22_n719PrdNum = new boolean[] {false} ;
      T003X22_A490ForPrdUMe = new byte[1] ;
      T003X22_n490ForPrdUMe = new boolean[] {false} ;
      T003X22_A795PrvNum = new int[1] ;
      T003X22_n795PrvNum = new boolean[] {false} ;
      T003X22_A856ValCod = new byte[1] ;
      T003X22_n856ValCod = new boolean[] {false} ;
      T003X22_A874RecPrdFind = new String[] {""} ;
      T003X22_n874RecPrdFind = new boolean[] {false} ;
      T003X9_A488ForPrdDsc = new String[] {""} ;
      T003X9_n488ForPrdDsc = new boolean[] {false} ;
      T003X10_A874RecPrdFind = new String[] {""} ;
      T003X10_n874RecPrdFind = new boolean[] {false} ;
      T003X23_A488ForPrdDsc = new String[] {""} ;
      T003X23_n488ForPrdDsc = new boolean[] {false} ;
      T003X24_A874RecPrdFind = new String[] {""} ;
      T003X24_n874RecPrdFind = new boolean[] {false} ;
      T003X25_A396EmprCod = new String[] {""} ;
      T003X25_A129BarCod = new int[1] ;
      T003X25_A132BarCodReo = new byte[1] ;
      T003X25_A130BarCodPar = new String[] {""} ;
      T003X25_A2804RecLinMaq = new short[1] ;
      T003X25_A1273RecLinPro = new byte[1] ;
      T003X25_A811RecLin = new short[1] ;
      T003X3_A129BarCod = new int[1] ;
      T003X3_A132BarCodReo = new byte[1] ;
      T003X3_A130BarCodPar = new String[] {""} ;
      T003X3_A2804RecLinMaq = new short[1] ;
      T003X3_A1273RecLinPro = new byte[1] ;
      T003X3_A811RecLin = new short[1] ;
      T003X3_A875RecPrdDsc = new String[] {""} ;
      T003X3_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X3_A5725RecLote = new String[] {""} ;
      T003X3_A11708RecProv = new int[1] ;
      T003X3_A12710PrdCantOrg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X3_A12641RecPrdDc2 = new String[] {""} ;
      T003X3_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X3_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X3_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X3_A2394RecForNro = new byte[1] ;
      T003X3_A3274RecPrdTnq = new byte[1] ;
      T003X3_A3938RecCanEns = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X3_A4024RecMar = new byte[1] ;
      T003X3_A5422RecSalMP = new short[1] ;
      T003X3_A5467RecSalVol = new int[1] ;
      T003X3_A5527RecLinRea = new String[] {""} ;
      T003X3_A8934RecPes = new byte[1] ;
      T003X3_A8937RecAcc = new String[] {""} ;
      T003X3_A9813FacCon1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X3_A3804RecFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      T003X3_A3805RecAnyTie = new short[1] ;
      T003X3_A3806RecUltAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X3_A3807RecPorAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X3_A4900PrdCanMac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X3_A4576RecLinUsr = new String[] {""} ;
      T003X3_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      T003X3_A12717RecFabId = new int[1] ;
      T003X3_A872RecPrdNum = new String[] {""} ;
      T003X3_A13937RecLotAlm = new short[1] ;
      T003X3_A13938RecLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      T003X3_A396EmprCod = new String[] {""} ;
      T003X3_A719PrdNum = new String[] {""} ;
      T003X3_n719PrdNum = new boolean[] {false} ;
      T003X3_A490ForPrdUMe = new byte[1] ;
      T003X3_n490ForPrdUMe = new boolean[] {false} ;
      T003X2_A129BarCod = new int[1] ;
      T003X2_A132BarCodReo = new byte[1] ;
      T003X2_A130BarCodPar = new String[] {""} ;
      T003X2_A2804RecLinMaq = new short[1] ;
      T003X2_A1273RecLinPro = new byte[1] ;
      T003X2_A811RecLin = new short[1] ;
      T003X2_A875RecPrdDsc = new String[] {""} ;
      T003X2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X2_A5725RecLote = new String[] {""} ;
      T003X2_A11708RecProv = new int[1] ;
      T003X2_A12710PrdCantOrg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X2_A12641RecPrdDc2 = new String[] {""} ;
      T003X2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X2_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X2_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X2_A2394RecForNro = new byte[1] ;
      T003X2_A3274RecPrdTnq = new byte[1] ;
      T003X2_A3938RecCanEns = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X2_A4024RecMar = new byte[1] ;
      T003X2_A5422RecSalMP = new short[1] ;
      T003X2_A5467RecSalVol = new int[1] ;
      T003X2_A5527RecLinRea = new String[] {""} ;
      T003X2_A8934RecPes = new byte[1] ;
      T003X2_A8937RecAcc = new String[] {""} ;
      T003X2_A9813FacCon1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X2_A3804RecFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      T003X2_A3805RecAnyTie = new short[1] ;
      T003X2_A3806RecUltAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X2_A3807RecPorAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X2_A4900PrdCanMac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X2_A4576RecLinUsr = new String[] {""} ;
      T003X2_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      T003X2_A12717RecFabId = new int[1] ;
      T003X2_A872RecPrdNum = new String[] {""} ;
      T003X2_A13937RecLotAlm = new short[1] ;
      T003X2_A13938RecLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      T003X2_A396EmprCod = new String[] {""} ;
      T003X2_A719PrdNum = new String[] {""} ;
      T003X2_n719PrdNum = new boolean[] {false} ;
      T003X2_A490ForPrdUMe = new byte[1] ;
      T003X2_n490ForPrdUMe = new boolean[] {false} ;
      T003X7_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X7_n685PrdCanRes = new boolean[] {false} ;
      T003X7_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X7_n707PrdFacCon = new boolean[] {false} ;
      T003X7_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X7_n704PrdExiAlm = new boolean[] {false} ;
      T003X7_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X7_n705PrdExiCC = new boolean[] {false} ;
      T003X7_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X7_n706PrdExiCCP = new boolean[] {false} ;
      T003X7_A5418PrdSalM = new String[] {""} ;
      T003X7_n5418PrdSalM = new boolean[] {false} ;
      T003X7_A10881PrdLote = new String[] {""} ;
      T003X7_n10881PrdLote = new boolean[] {false} ;
      T003X7_A13232PrdRGB = new long[1] ;
      T003X7_n13232PrdRGB = new boolean[] {false} ;
      T003X7_A795PrvNum = new int[1] ;
      T003X7_n795PrvNum = new boolean[] {false} ;
      T003X7_A856ValCod = new byte[1] ;
      T003X7_n856ValCod = new boolean[] {false} ;
      T003X29_A488ForPrdDsc = new String[] {""} ;
      T003X29_n488ForPrdDsc = new boolean[] {false} ;
      T003X30_A874RecPrdFind = new String[] {""} ;
      T003X30_n874RecPrdFind = new boolean[] {false} ;
      T003X8_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X8_n685PrdCanRes = new boolean[] {false} ;
      T003X8_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X8_n707PrdFacCon = new boolean[] {false} ;
      T003X8_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X8_n704PrdExiAlm = new boolean[] {false} ;
      T003X8_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X8_n705PrdExiCC = new boolean[] {false} ;
      T003X8_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003X8_n706PrdExiCCP = new boolean[] {false} ;
      T003X8_A5418PrdSalM = new String[] {""} ;
      T003X8_n5418PrdSalM = new boolean[] {false} ;
      T003X8_A10881PrdLote = new String[] {""} ;
      T003X8_n10881PrdLote = new boolean[] {false} ;
      T003X8_A13232PrdRGB = new long[1] ;
      T003X8_n13232PrdRGB = new boolean[] {false} ;
      T003X8_A795PrvNum = new int[1] ;
      T003X8_n795PrvNum = new boolean[] {false} ;
      T003X8_A856ValCod = new byte[1] ;
      T003X8_n856ValCod = new boolean[] {false} ;
      T003X6_A873RecPrdNom = new String[] {""} ;
      T003X6_n873RecPrdNom = new boolean[] {false} ;
      T003X32_A396EmprCod = new String[] {""} ;
      T003X32_A129BarCod = new int[1] ;
      T003X32_A132BarCodReo = new byte[1] ;
      T003X32_A130BarCodPar = new String[] {""} ;
      T003X32_A2804RecLinMaq = new short[1] ;
      T003X32_A1273RecLinPro = new byte[1] ;
      T003X32_A811RecLin = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i12710PrdCantOrg = DecimalUtil.ZERO ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int15 = new int[1] ;
      GXv_int6 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z13897RecPrdDscf = "" ;
      Z238CanRes = DecimalUtil.ZERO ;
      ZV42Cantold = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.treclin__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.treclin__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.treclin__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.treclin__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.treclin__default(),
         new Object[] {
             new Object[] {
            T003X2_A129BarCod, T003X2_A132BarCodReo, T003X2_A130BarCodPar, T003X2_A2804RecLinMaq, T003X2_A1273RecLinPro, T003X2_A811RecLin, T003X2_A875RecPrdDsc, T003X2_A686PrdCant, T003X2_A5725RecLote, T003X2_A11708RecProv,
            T003X2_A12710PrdCantOrg, T003X2_A12641RecPrdDc2, T003X2_A431FacCon, T003X2_A683PrdCanFin, T003X2_A1797PrdCanAny, T003X2_A2394RecForNro, T003X2_A3274RecPrdTnq, T003X2_A3938RecCanEns, T003X2_A4024RecMar, T003X2_A5422RecSalMP,
            T003X2_A5467RecSalVol, T003X2_A5527RecLinRea, T003X2_A8934RecPes, T003X2_A8937RecAcc, T003X2_A9813FacCon1, T003X2_A3804RecFecMov, T003X2_A3805RecAnyTie, T003X2_A3806RecUltAny, T003X2_A3807RecPorAny, T003X2_A4900PrdCanMac,
            T003X2_A4576RecLinUsr, T003X2_A4577RecPesFec, T003X2_A12717RecFabId, T003X2_A872RecPrdNum, T003X2_A13937RecLotAlm, T003X2_A13938RecLoteFch, T003X2_A396EmprCod, T003X2_A719PrdNum, T003X2_n719PrdNum, T003X2_A490ForPrdUMe,
            T003X2_n490ForPrdUMe
            }
            , new Object[] {
            T003X3_A129BarCod, T003X3_A132BarCodReo, T003X3_A130BarCodPar, T003X3_A2804RecLinMaq, T003X3_A1273RecLinPro, T003X3_A811RecLin, T003X3_A875RecPrdDsc, T003X3_A686PrdCant, T003X3_A5725RecLote, T003X3_A11708RecProv,
            T003X3_A12710PrdCantOrg, T003X3_A12641RecPrdDc2, T003X3_A431FacCon, T003X3_A683PrdCanFin, T003X3_A1797PrdCanAny, T003X3_A2394RecForNro, T003X3_A3274RecPrdTnq, T003X3_A3938RecCanEns, T003X3_A4024RecMar, T003X3_A5422RecSalMP,
            T003X3_A5467RecSalVol, T003X3_A5527RecLinRea, T003X3_A8934RecPes, T003X3_A8937RecAcc, T003X3_A9813FacCon1, T003X3_A3804RecFecMov, T003X3_A3805RecAnyTie, T003X3_A3806RecUltAny, T003X3_A3807RecPorAny, T003X3_A4900PrdCanMac,
            T003X3_A4576RecLinUsr, T003X3_A4577RecPesFec, T003X3_A12717RecFabId, T003X3_A872RecPrdNum, T003X3_A13937RecLotAlm, T003X3_A13938RecLoteFch, T003X3_A396EmprCod, T003X3_A719PrdNum, T003X3_n719PrdNum, T003X3_A490ForPrdUMe,
            T003X3_n490ForPrdUMe
            }
            , new Object[] {
            T003X6_A873RecPrdNom, T003X6_n873RecPrdNom
            }
            , new Object[] {
            T003X7_A685PrdCanRes, T003X7_A707PrdFacCon, T003X7_A704PrdExiAlm, T003X7_A705PrdExiCC, T003X7_A706PrdExiCCP, T003X7_A5418PrdSalM, T003X7_A10881PrdLote, T003X7_A13232PrdRGB, T003X7_A795PrvNum, T003X7_A856ValCod
            }
            , new Object[] {
            T003X8_A685PrdCanRes, T003X8_A707PrdFacCon, T003X8_A704PrdExiAlm, T003X8_A705PrdExiCC, T003X8_A706PrdExiCCP, T003X8_A5418PrdSalM, T003X8_A10881PrdLote, T003X8_A13232PrdRGB, T003X8_A795PrvNum, T003X8_A856ValCod
            }
            , new Object[] {
            T003X9_A488ForPrdDsc, T003X9_n488ForPrdDsc
            }
            , new Object[] {
            T003X10_A874RecPrdFind, T003X10_n874RecPrdFind
            }
            , new Object[] {
            T003X11_A1273RecLinPro, T003X11_A396EmprCod, T003X11_A129BarCod, T003X11_A132BarCodReo, T003X11_A130BarCodPar, T003X11_A2804RecLinMaq
            }
            , new Object[] {
            T003X12_A1273RecLinPro, T003X12_A396EmprCod, T003X12_A129BarCod, T003X12_A132BarCodReo, T003X12_A130BarCodPar, T003X12_A2804RecLinMaq
            }
            , new Object[] {
            T003X13_A407EmprNom, T003X13_n407EmprNom
            }
            , new Object[] {
            T003X14_A396EmprCod
            }
            , new Object[] {
            T003X15_A407EmprNom, T003X15_n407EmprNom, T003X15_A1273RecLinPro, T003X15_A396EmprCod, T003X15_A129BarCod, T003X15_A132BarCodReo, T003X15_A130BarCodPar, T003X15_A2804RecLinMaq
            }
            , new Object[] {
            T003X16_A396EmprCod, T003X16_A129BarCod, T003X16_A132BarCodReo, T003X16_A130BarCodPar, T003X16_A2804RecLinMaq, T003X16_A1273RecLinPro
            }
            , new Object[] {
            T003X17_A1273RecLinPro, T003X17_A396EmprCod, T003X17_A129BarCod, T003X17_A132BarCodReo, T003X17_A130BarCodPar, T003X17_A2804RecLinMaq
            }
            , new Object[] {
            T003X18_A1273RecLinPro, T003X18_A396EmprCod, T003X18_A129BarCod, T003X18_A132BarCodReo, T003X18_A130BarCodPar, T003X18_A2804RecLinMaq
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T003X21_A396EmprCod, T003X21_A129BarCod, T003X21_A132BarCodReo, T003X21_A130BarCodPar, T003X21_A2804RecLinMaq, T003X21_A1273RecLinPro
            }
            , new Object[] {
            T003X22_A129BarCod, T003X22_A132BarCodReo, T003X22_A130BarCodPar, T003X22_A2804RecLinMaq, T003X22_A1273RecLinPro, T003X22_A811RecLin, T003X22_A875RecPrdDsc, T003X22_A685PrdCanRes, T003X22_A686PrdCant, T003X22_A5725RecLote,
            T003X22_A11708RecProv, T003X22_A12710PrdCantOrg, T003X22_A12641RecPrdDc2, T003X22_A488ForPrdDsc, T003X22_n488ForPrdDsc, T003X22_A707PrdFacCon, T003X22_A431FacCon, T003X22_A683PrdCanFin, T003X22_A1797PrdCanAny, T003X22_A704PrdExiAlm,
            T003X22_A705PrdExiCC, T003X22_A706PrdExiCCP, T003X22_A2394RecForNro, T003X22_A3274RecPrdTnq, T003X22_A3938RecCanEns, T003X22_A4024RecMar, T003X22_A5422RecSalMP, T003X22_A5418PrdSalM, T003X22_A5467RecSalVol, T003X22_A5527RecLinRea,
            T003X22_A8934RecPes, T003X22_A8937RecAcc, T003X22_A9813FacCon1, T003X22_A3804RecFecMov, T003X22_A3805RecAnyTie, T003X22_A3806RecUltAny, T003X22_A3807RecPorAny, T003X22_A4900PrdCanMac, T003X22_A10881PrdLote, T003X22_A4576RecLinUsr,
            T003X22_A4577RecPesFec, T003X22_A12717RecFabId, T003X22_A13232PrdRGB, T003X22_A872RecPrdNum, T003X22_A13937RecLotAlm, T003X22_A13938RecLoteFch, T003X22_A396EmprCod, T003X22_A719PrdNum, T003X22_n719PrdNum, T003X22_A490ForPrdUMe,
            T003X22_n490ForPrdUMe, T003X22_A795PrvNum, T003X22_A856ValCod, T003X22_A874RecPrdFind, T003X22_n874RecPrdFind
            }
            , new Object[] {
            T003X23_A488ForPrdDsc, T003X23_n488ForPrdDsc
            }
            , new Object[] {
            T003X24_A874RecPrdFind, T003X24_n874RecPrdFind
            }
            , new Object[] {
            T003X25_A396EmprCod, T003X25_A129BarCod, T003X25_A132BarCodReo, T003X25_A130BarCodPar, T003X25_A2804RecLinMaq, T003X25_A1273RecLinPro, T003X25_A811RecLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T003X29_A488ForPrdDsc, T003X29_n488ForPrdDsc
            }
            , new Object[] {
            T003X30_A874RecPrdFind, T003X30_n874RecPrdFind
            }
            , new Object[] {
            }
            , new Object[] {
            T003X32_A396EmprCod, T003X32_A129BarCod, T003X32_A132BarCodReo, T003X32_A130BarCodPar, T003X32_A2804RecLinMaq, T003X32_A1273RecLinPro, T003X32_A811RecLin
            }
         }
      );
      A407EmprNom = "" ;
      n407EmprNom = false ;
      Z407EmprNom = "" ;
      n407EmprNom = false ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z12641RecPrdDc2 = "" ;
      A12641RecPrdDc2 = "" ;
      Z12710PrdCantOrg = DecimalUtil.doubleToDec(0) ;
      A12710PrdCantOrg = DecimalUtil.doubleToDec(0) ;
      i12710PrdCantOrg = DecimalUtil.doubleToDec(0) ;
      Z11708RecProv = 0 ;
      A11708RecProv = 0 ;
      AV113Pgmname = "TRECLIN" ;
   }

   private byte wcpOAV106BarCodReo ;
   private byte wcpOAV109RecLinPro ;
   private byte Z132BarCodReo ;
   private byte Z1273RecLinPro ;
   private byte Z2394RecForNro ;
   private byte Z3274RecPrdTnq ;
   private byte Z4024RecMar ;
   private byte Z8934RecPes ;
   private byte Z490ForPrdUMe ;
   private byte Z856ValCod ;
   private byte O490ForPrdUMe ;
   private byte O2394RecForNro ;
   private byte GxWebError ;
   private byte AV58AlmCC ;
   private byte A490ForPrdUMe ;
   private byte A132BarCodReo ;
   private byte AV106BarCodReo ;
   private byte AV109RecLinPro ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte AV66AvisoPesaje ;
   private byte AV63Artemalha ;
   private byte AV67NoCantidad ;
   private byte AV57Moda21 ;
   private byte A1273RecLinPro ;
   private byte AV20Flag ;
   private byte AV50Suprema ;
   private byte AV70Lote01 ;
   private byte A856ValCod ;
   private byte AV71EliminarReceta ;
   private byte AV45Err_und ;
   private byte A8934RecPes ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A4024RecMar ;
   private byte T490ForPrdUMe ;
   private byte T2394RecForNro ;
   private byte AV39Dosifi ;
   private byte AV40Centra ;
   private byte AV41F_pizarro ;
   private byte AV48FlagCColor ;
   private byte AV94SiRGB ;
   private byte GXt_int7 ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte GXv_int5[] ;
   private short wcpOAV108RecLinMaq ;
   private short Z2804RecLinMaq ;
   private short Z811RecLin ;
   private short Z5422RecSalMP ;
   private short Z3805RecAnyTie ;
   private short Z13937RecLotAlm ;
   private short nRcdDeleted_410 ;
   private short nRcdExists_410 ;
   private short nIsMod_410 ;
   private short AV29Valcos ;
   private short AV108RecLinMaq ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount410 ;
   private short RcdFound410 ;
   private short nBlankRcdUsr410 ;
   private short A2804RecLinMaq ;
   private short A5422RecSalMP ;
   private short A3805RecAnyTie ;
   private short A13937RecLotAlm ;
   private short RcdFound409 ;
   private short A811RecLin ;
   private short AV59Factor ;
   private short nIsDirty_409 ;
   private short nIsDirty_410 ;
   private int wcpOAV105BarCod ;
   private int wcpOAV17Volumen ;
   private int Z129BarCod ;
   private int nRC_GXsfl_51 ;
   private int nGXsfl_51_idx=1 ;
   private int Z11708RecProv ;
   private int Z5467RecSalVol ;
   private int Z12717RecFabId ;
   private int Z795PrvNum ;
   private int AV17Volumen ;
   private int A129BarCod ;
   private int AV105BarCod ;
   private int trnEnded ;
   private int edtPrdExiCC_Visible ;
   private int edtPrdExiCC_Enabled ;
   private int edtPrdExiCC_Width ;
   private int edtavProfordsc_Enabled ;
   private int edtavValcos_Enabled ;
   private int edtavTotkgs_Enabled ;
   private int edtavVolumen_Enabled ;
   private int edtavModo_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavBarnhdr_Visible ;
   private int edtavBarnhdr_Enabled ;
   private int edtavReclinmaq_Enabled ;
   private int edtavReclinmaq_Visible ;
   private int edtavReclinpro_Enabled ;
   private int edtavReclinpro_Visible ;
   private int edtRecLin_Enabled ;
   private int edtRecPrdNum_Forecolor ;
   private int edtRecPrdNum_Enabled ;
   private int edtRecPrdFind_Enabled ;
   private int edtRecPrdDsc_Forecolor ;
   private int edtRecPrdDsc_Enabled ;
   private int edtRecPrdDscf_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtForPrdDsc_Enabled ;
   private int edtFacCon_Enabled ;
   private int edtPrdCant_Enabled ;
   private int edtRecForNro_Enabled ;
   private int edtRecPrdTnq_Enabled ;
   private int edtRecLote_Enabled ;
   private int edtRecMar_Enabled ;
   private int edtPrdExiAlm_Enabled ;
   private int edtPrdCanRes_Enabled ;
   private int edtCantProduc_Enabled ;
   private int fRowAdded ;
   private int A795PrvNum ;
   private int A11708RecProv ;
   private int A5467RecSalVol ;
   private int A12717RecFabId ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int AV60Factor8 ;
   private int GXt_int8 ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtCantProduc_Enabled ;
   private int defedtPrdCanRes_Enabled ;
   private int defedtRecMar_Enabled ;
   private int defedtRecLote_Enabled ;
   private int defedtPrdCant_Enabled ;
   private int defedtRecPrdDsc_Forecolor ;
   private int defedtRecPrdNum_Forecolor ;
   private int defedtRecLin_Enabled ;
   private int defedtPrdExiCC_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int GXv_int15[] ;
   private int GXv_int6[] ;
   private long Z13232PrdRGB ;
   private long A13232PrdRGB ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal wcpOAV16TotKgs ;
   private java.math.BigDecimal Z686PrdCant ;
   private java.math.BigDecimal Z12710PrdCantOrg ;
   private java.math.BigDecimal Z431FacCon ;
   private java.math.BigDecimal Z683PrdCanFin ;
   private java.math.BigDecimal Z1797PrdCanAny ;
   private java.math.BigDecimal Z3938RecCanEns ;
   private java.math.BigDecimal Z9813FacCon1 ;
   private java.math.BigDecimal Z3806RecUltAny ;
   private java.math.BigDecimal Z3807RecPorAny ;
   private java.math.BigDecimal Z4900PrdCanMac ;
   private java.math.BigDecimal Z707PrdFacCon ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal Z706PrdExiCCP ;
   private java.math.BigDecimal O431FacCon ;
   private java.math.BigDecimal O686PrdCant ;
   private java.math.BigDecimal O238CanRes ;
   private java.math.BigDecimal O685PrdCanRes ;
   private java.math.BigDecimal N686PrdCant ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal AV42Cantold ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal AV16TotKgs ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A238CanRes ;
   private java.math.BigDecimal A12710PrdCantOrg ;
   private java.math.BigDecimal A683PrdCanFin ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A3938RecCanEns ;
   private java.math.BigDecimal A9813FacCon1 ;
   private java.math.BigDecimal A3806RecUltAny ;
   private java.math.BigDecimal A3807RecPorAny ;
   private java.math.BigDecimal A4900PrdCanMac ;
   private java.math.BigDecimal A706PrdExiCCP ;
   private java.math.BigDecimal A13832CantProduc ;
   private java.math.BigDecimal T431FacCon ;
   private java.math.BigDecimal T686PrdCant ;
   private java.math.BigDecimal T238CanRes ;
   private java.math.BigDecimal T685PrdCanRes ;
   private java.math.BigDecimal Z685PrdCanRes ;
   private java.math.BigDecimal i12710PrdCantOrg ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal Z238CanRes ;
   private java.math.BigDecimal ZV42Cantold ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV104EmprCod ;
   private String wcpOAV107BarCodPar ;
   private String wcpOAV110BarNHdr ;
   private String wcpOAV111ProForDsc ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z875RecPrdDsc ;
   private String Z5725RecLote ;
   private String Z12641RecPrdDc2 ;
   private String Z5527RecLinRea ;
   private String Z8937RecAcc ;
   private String Z4576RecLinUsr ;
   private String Z872RecPrdNum ;
   private String Z719PrdNum ;
   private String Z5418PrdSalM ;
   private String Z10881PrdLote ;
   private String O5725RecLote ;
   private String O719PrdNum ;
   private String O873RecPrdNom ;
   private String O872RecPrdNum ;
   private String N5725RecLote ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A872RecPrdNum ;
   private String AV72msgErr ;
   private String A719PrdNum ;
   private String AV113Pgmname ;
   private String AV33UsurCod ;
   private String AV36Station ;
   private String A130BarCodPar ;
   private String A5725RecLote ;
   private String AV65oldRecLote ;
   private String A874RecPrdFind ;
   private String Gx_mode ;
   private String AV104EmprCod ;
   private String AV107BarCodPar ;
   private String AV18Modif ;
   private String AV110BarNHdr ;
   private String AV111ProForDsc ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_51_idx="0001" ;
   private String edtPrdExiCC_Internalname ;
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
   private String edtavProfordsc_Internalname ;
   private String edtavProfordsc_Jsonclick ;
   private String edtavValcos_Internalname ;
   private String edtavValcos_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtavTotkgs_Internalname ;
   private String edtavTotkgs_Jsonclick ;
   private String edtavVolumen_Internalname ;
   private String edtavVolumen_Jsonclick ;
   private String edtavModo_Internalname ;
   private String AV112Modo ;
   private String edtavModo_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavBarnhdr_Internalname ;
   private String edtavBarnhdr_Jsonclick ;
   private String edtavReclinmaq_Internalname ;
   private String edtavReclinmaq_Jsonclick ;
   private String edtavReclinpro_Internalname ;
   private String edtavReclinpro_Jsonclick ;
   private String sMode410 ;
   private String edtRecLin_Internalname ;
   private String edtRecPrdNum_Internalname ;
   private String edtRecPrdFind_Internalname ;
   private String edtRecPrdDsc_Internalname ;
   private String edtRecPrdDscf_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdDsc_Internalname ;
   private String edtFacCon_Internalname ;
   private String edtPrdCant_Internalname ;
   private String edtRecForNro_Internalname ;
   private String edtRecPrdTnq_Internalname ;
   private String edtRecLote_Internalname ;
   private String edtRecMar_Internalname ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdCanRes_Internalname ;
   private String edtCantProduc_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A407EmprNom ;
   private String A873RecPrdNom ;
   private String A10881PrdLote ;
   private String A12641RecPrdDc2 ;
   private String A4576RecLinUsr ;
   private String A5527RecLinRea ;
   private String A8937RecAcc ;
   private String A5418PrdSalM ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode409 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sV18Modif ;
   private String OV18Modif ;
   private String GXCCtl ;
   private String A875RecPrdDsc ;
   private String A13897RecPrdDscf ;
   private String A488ForPrdDsc ;
   private String T5725RecLote ;
   private String T719PrdNum ;
   private String T873RecPrdNom ;
   private String T872RecPrdNum ;
   private String AV49Proforfab ;
   private String AV55Lit50 ;
   private String AV56Lit51 ;
   private String AV19msg4 ;
   private String AV61MsgErrFactor ;
   private String AV62Conf ;
   private String AV69msg_err1 ;
   private String AV38EmprNom ;
   private String Z407EmprNom ;
   private String Z488ForPrdDsc ;
   private String Z874RecPrdFind ;
   private String sGXsfl_51_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtRecLin_Jsonclick ;
   private String edtRecPrdNum_Jsonclick ;
   private String edtRecPrdFind_Jsonclick ;
   private String edtRecPrdDsc_Jsonclick ;
   private String edtRecPrdDscf_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtFacCon_Jsonclick ;
   private String edtPrdCant_Jsonclick ;
   private String edtRecForNro_Jsonclick ;
   private String edtRecPrdTnq_Jsonclick ;
   private String edtRecLote_Jsonclick ;
   private String edtRecMar_Jsonclick ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdCanRes_Jsonclick ;
   private String edtPrdExiCC_Jsonclick ;
   private String edtCantProduc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z13897RecPrdDscf ;
   private java.util.Date Z4577RecPesFec ;
   private java.util.Date A4577RecPesFec ;
   private java.util.Date wcpOAV37FecPan ;
   private java.util.Date Z3804RecFecMov ;
   private java.util.Date Z13938RecLoteFch ;
   private java.util.Date AV37FecPan ;
   private java.util.Date A3804RecFecMov ;
   private java.util.Date A13938RecLoteFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n704PrdExiAlm ;
   private boolean n685PrdCanRes ;
   private boolean n705PrdExiCC ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n874RecPrdFind ;
   private boolean wbErr ;
   private boolean bGXsfl_51_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean n707PrdFacCon ;
   private boolean n873RecPrdNom ;
   private boolean n10881PrdLote ;
   private boolean n795PrvNum ;
   private boolean n856ValCod ;
   private boolean n706PrdExiCCP ;
   private boolean n5418PrdSalM ;
   private boolean n13232PrdRGB ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private boolean n488ForPrdDsc ;
   private boolean Gx_longc ;
   private String AV44Texto_i ;
   private String AV47Texto_iii ;
   private String AV64Inc_obs ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV103WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T003X13_A407EmprNom ;
   private boolean[] T003X13_n407EmprNom ;
   private String[] T003X14_A396EmprCod ;
   private String[] T003X15_A407EmprNom ;
   private boolean[] T003X15_n407EmprNom ;
   private byte[] T003X15_A1273RecLinPro ;
   private String[] T003X15_A396EmprCod ;
   private int[] T003X15_A129BarCod ;
   private byte[] T003X15_A132BarCodReo ;
   private String[] T003X15_A130BarCodPar ;
   private short[] T003X15_A2804RecLinMaq ;
   private String[] T003X16_A396EmprCod ;
   private int[] T003X16_A129BarCod ;
   private byte[] T003X16_A132BarCodReo ;
   private String[] T003X16_A130BarCodPar ;
   private short[] T003X16_A2804RecLinMaq ;
   private byte[] T003X16_A1273RecLinPro ;
   private byte[] T003X12_A1273RecLinPro ;
   private String[] T003X12_A396EmprCod ;
   private int[] T003X12_A129BarCod ;
   private byte[] T003X12_A132BarCodReo ;
   private String[] T003X12_A130BarCodPar ;
   private short[] T003X12_A2804RecLinMaq ;
   private byte[] T003X17_A1273RecLinPro ;
   private String[] T003X17_A396EmprCod ;
   private int[] T003X17_A129BarCod ;
   private byte[] T003X17_A132BarCodReo ;
   private String[] T003X17_A130BarCodPar ;
   private short[] T003X17_A2804RecLinMaq ;
   private byte[] T003X18_A1273RecLinPro ;
   private String[] T003X18_A396EmprCod ;
   private int[] T003X18_A129BarCod ;
   private byte[] T003X18_A132BarCodReo ;
   private String[] T003X18_A130BarCodPar ;
   private short[] T003X18_A2804RecLinMaq ;
   private byte[] T003X11_A1273RecLinPro ;
   private String[] T003X11_A396EmprCod ;
   private int[] T003X11_A129BarCod ;
   private byte[] T003X11_A132BarCodReo ;
   private String[] T003X11_A130BarCodPar ;
   private short[] T003X11_A2804RecLinMaq ;
   private String[] T003X21_A396EmprCod ;
   private int[] T003X21_A129BarCod ;
   private byte[] T003X21_A132BarCodReo ;
   private String[] T003X21_A130BarCodPar ;
   private short[] T003X21_A2804RecLinMaq ;
   private byte[] T003X21_A1273RecLinPro ;
   private int[] T003X22_A129BarCod ;
   private byte[] T003X22_A132BarCodReo ;
   private String[] T003X22_A130BarCodPar ;
   private short[] T003X22_A2804RecLinMaq ;
   private byte[] T003X22_A1273RecLinPro ;
   private short[] T003X22_A811RecLin ;
   private String[] T003X22_A875RecPrdDsc ;
   private java.math.BigDecimal[] T003X22_A685PrdCanRes ;
   private boolean[] T003X22_n685PrdCanRes ;
   private java.math.BigDecimal[] T003X22_A686PrdCant ;
   private String[] T003X22_A5725RecLote ;
   private int[] T003X22_A11708RecProv ;
   private java.math.BigDecimal[] T003X22_A12710PrdCantOrg ;
   private String[] T003X22_A12641RecPrdDc2 ;
   private String[] T003X22_A488ForPrdDsc ;
   private boolean[] T003X22_n488ForPrdDsc ;
   private java.math.BigDecimal[] T003X22_A707PrdFacCon ;
   private boolean[] T003X22_n707PrdFacCon ;
   private java.math.BigDecimal[] T003X22_A431FacCon ;
   private java.math.BigDecimal[] T003X22_A683PrdCanFin ;
   private java.math.BigDecimal[] T003X22_A1797PrdCanAny ;
   private java.math.BigDecimal[] T003X22_A704PrdExiAlm ;
   private boolean[] T003X22_n704PrdExiAlm ;
   private java.math.BigDecimal[] T003X22_A705PrdExiCC ;
   private boolean[] T003X22_n705PrdExiCC ;
   private java.math.BigDecimal[] T003X22_A706PrdExiCCP ;
   private boolean[] T003X22_n706PrdExiCCP ;
   private byte[] T003X22_A2394RecForNro ;
   private byte[] T003X22_A3274RecPrdTnq ;
   private java.math.BigDecimal[] T003X22_A3938RecCanEns ;
   private byte[] T003X22_A4024RecMar ;
   private short[] T003X22_A5422RecSalMP ;
   private String[] T003X22_A5418PrdSalM ;
   private boolean[] T003X22_n5418PrdSalM ;
   private int[] T003X22_A5467RecSalVol ;
   private String[] T003X22_A5527RecLinRea ;
   private byte[] T003X22_A8934RecPes ;
   private String[] T003X22_A8937RecAcc ;
   private java.math.BigDecimal[] T003X22_A9813FacCon1 ;
   private java.util.Date[] T003X22_A3804RecFecMov ;
   private short[] T003X22_A3805RecAnyTie ;
   private java.math.BigDecimal[] T003X22_A3806RecUltAny ;
   private java.math.BigDecimal[] T003X22_A3807RecPorAny ;
   private java.math.BigDecimal[] T003X22_A4900PrdCanMac ;
   private String[] T003X22_A10881PrdLote ;
   private boolean[] T003X22_n10881PrdLote ;
   private String[] T003X22_A4576RecLinUsr ;
   private java.util.Date[] T003X22_A4577RecPesFec ;
   private int[] T003X22_A12717RecFabId ;
   private long[] T003X22_A13232PrdRGB ;
   private boolean[] T003X22_n13232PrdRGB ;
   private String[] T003X22_A872RecPrdNum ;
   private short[] T003X22_A13937RecLotAlm ;
   private java.util.Date[] T003X22_A13938RecLoteFch ;
   private String[] T003X22_A396EmprCod ;
   private String[] T003X22_A719PrdNum ;
   private boolean[] T003X22_n719PrdNum ;
   private byte[] T003X22_A490ForPrdUMe ;
   private boolean[] T003X22_n490ForPrdUMe ;
   private int[] T003X22_A795PrvNum ;
   private boolean[] T003X22_n795PrvNum ;
   private byte[] T003X22_A856ValCod ;
   private boolean[] T003X22_n856ValCod ;
   private String[] T003X22_A874RecPrdFind ;
   private boolean[] T003X22_n874RecPrdFind ;
   private String[] T003X9_A488ForPrdDsc ;
   private boolean[] T003X9_n488ForPrdDsc ;
   private String[] T003X10_A874RecPrdFind ;
   private boolean[] T003X10_n874RecPrdFind ;
   private String[] T003X23_A488ForPrdDsc ;
   private boolean[] T003X23_n488ForPrdDsc ;
   private String[] T003X24_A874RecPrdFind ;
   private boolean[] T003X24_n874RecPrdFind ;
   private String[] T003X25_A396EmprCod ;
   private int[] T003X25_A129BarCod ;
   private byte[] T003X25_A132BarCodReo ;
   private String[] T003X25_A130BarCodPar ;
   private short[] T003X25_A2804RecLinMaq ;
   private byte[] T003X25_A1273RecLinPro ;
   private short[] T003X25_A811RecLin ;
   private int[] T003X3_A129BarCod ;
   private byte[] T003X3_A132BarCodReo ;
   private String[] T003X3_A130BarCodPar ;
   private short[] T003X3_A2804RecLinMaq ;
   private byte[] T003X3_A1273RecLinPro ;
   private short[] T003X3_A811RecLin ;
   private String[] T003X3_A875RecPrdDsc ;
   private java.math.BigDecimal[] T003X3_A686PrdCant ;
   private String[] T003X3_A5725RecLote ;
   private int[] T003X3_A11708RecProv ;
   private java.math.BigDecimal[] T003X3_A12710PrdCantOrg ;
   private String[] T003X3_A12641RecPrdDc2 ;
   private java.math.BigDecimal[] T003X3_A431FacCon ;
   private java.math.BigDecimal[] T003X3_A683PrdCanFin ;
   private java.math.BigDecimal[] T003X3_A1797PrdCanAny ;
   private byte[] T003X3_A2394RecForNro ;
   private byte[] T003X3_A3274RecPrdTnq ;
   private java.math.BigDecimal[] T003X3_A3938RecCanEns ;
   private byte[] T003X3_A4024RecMar ;
   private short[] T003X3_A5422RecSalMP ;
   private int[] T003X3_A5467RecSalVol ;
   private String[] T003X3_A5527RecLinRea ;
   private byte[] T003X3_A8934RecPes ;
   private String[] T003X3_A8937RecAcc ;
   private java.math.BigDecimal[] T003X3_A9813FacCon1 ;
   private java.util.Date[] T003X3_A3804RecFecMov ;
   private short[] T003X3_A3805RecAnyTie ;
   private java.math.BigDecimal[] T003X3_A3806RecUltAny ;
   private java.math.BigDecimal[] T003X3_A3807RecPorAny ;
   private java.math.BigDecimal[] T003X3_A4900PrdCanMac ;
   private String[] T003X3_A4576RecLinUsr ;
   private java.util.Date[] T003X3_A4577RecPesFec ;
   private int[] T003X3_A12717RecFabId ;
   private String[] T003X3_A872RecPrdNum ;
   private short[] T003X3_A13937RecLotAlm ;
   private java.util.Date[] T003X3_A13938RecLoteFch ;
   private String[] T003X3_A396EmprCod ;
   private String[] T003X3_A719PrdNum ;
   private boolean[] T003X3_n719PrdNum ;
   private byte[] T003X3_A490ForPrdUMe ;
   private boolean[] T003X3_n490ForPrdUMe ;
   private int[] T003X2_A129BarCod ;
   private byte[] T003X2_A132BarCodReo ;
   private String[] T003X2_A130BarCodPar ;
   private short[] T003X2_A2804RecLinMaq ;
   private byte[] T003X2_A1273RecLinPro ;
   private short[] T003X2_A811RecLin ;
   private String[] T003X2_A875RecPrdDsc ;
   private java.math.BigDecimal[] T003X2_A686PrdCant ;
   private String[] T003X2_A5725RecLote ;
   private int[] T003X2_A11708RecProv ;
   private java.math.BigDecimal[] T003X2_A12710PrdCantOrg ;
   private String[] T003X2_A12641RecPrdDc2 ;
   private java.math.BigDecimal[] T003X2_A431FacCon ;
   private java.math.BigDecimal[] T003X2_A683PrdCanFin ;
   private java.math.BigDecimal[] T003X2_A1797PrdCanAny ;
   private byte[] T003X2_A2394RecForNro ;
   private byte[] T003X2_A3274RecPrdTnq ;
   private java.math.BigDecimal[] T003X2_A3938RecCanEns ;
   private byte[] T003X2_A4024RecMar ;
   private short[] T003X2_A5422RecSalMP ;
   private int[] T003X2_A5467RecSalVol ;
   private String[] T003X2_A5527RecLinRea ;
   private byte[] T003X2_A8934RecPes ;
   private String[] T003X2_A8937RecAcc ;
   private java.math.BigDecimal[] T003X2_A9813FacCon1 ;
   private java.util.Date[] T003X2_A3804RecFecMov ;
   private short[] T003X2_A3805RecAnyTie ;
   private java.math.BigDecimal[] T003X2_A3806RecUltAny ;
   private java.math.BigDecimal[] T003X2_A3807RecPorAny ;
   private java.math.BigDecimal[] T003X2_A4900PrdCanMac ;
   private String[] T003X2_A4576RecLinUsr ;
   private java.util.Date[] T003X2_A4577RecPesFec ;
   private int[] T003X2_A12717RecFabId ;
   private String[] T003X2_A872RecPrdNum ;
   private short[] T003X2_A13937RecLotAlm ;
   private java.util.Date[] T003X2_A13938RecLoteFch ;
   private String[] T003X2_A396EmprCod ;
   private String[] T003X2_A719PrdNum ;
   private boolean[] T003X2_n719PrdNum ;
   private byte[] T003X2_A490ForPrdUMe ;
   private boolean[] T003X2_n490ForPrdUMe ;
   private java.math.BigDecimal[] T003X7_A685PrdCanRes ;
   private boolean[] T003X7_n685PrdCanRes ;
   private java.math.BigDecimal[] T003X7_A707PrdFacCon ;
   private boolean[] T003X7_n707PrdFacCon ;
   private java.math.BigDecimal[] T003X7_A704PrdExiAlm ;
   private boolean[] T003X7_n704PrdExiAlm ;
   private java.math.BigDecimal[] T003X7_A705PrdExiCC ;
   private boolean[] T003X7_n705PrdExiCC ;
   private java.math.BigDecimal[] T003X7_A706PrdExiCCP ;
   private boolean[] T003X7_n706PrdExiCCP ;
   private String[] T003X7_A5418PrdSalM ;
   private boolean[] T003X7_n5418PrdSalM ;
   private String[] T003X7_A10881PrdLote ;
   private boolean[] T003X7_n10881PrdLote ;
   private long[] T003X7_A13232PrdRGB ;
   private boolean[] T003X7_n13232PrdRGB ;
   private int[] T003X7_A795PrvNum ;
   private boolean[] T003X7_n795PrvNum ;
   private byte[] T003X7_A856ValCod ;
   private boolean[] T003X7_n856ValCod ;
   private String[] T003X29_A488ForPrdDsc ;
   private boolean[] T003X29_n488ForPrdDsc ;
   private String[] T003X30_A874RecPrdFind ;
   private boolean[] T003X30_n874RecPrdFind ;
   private java.math.BigDecimal[] T003X8_A685PrdCanRes ;
   private boolean[] T003X8_n685PrdCanRes ;
   private java.math.BigDecimal[] T003X8_A707PrdFacCon ;
   private boolean[] T003X8_n707PrdFacCon ;
   private java.math.BigDecimal[] T003X8_A704PrdExiAlm ;
   private boolean[] T003X8_n704PrdExiAlm ;
   private java.math.BigDecimal[] T003X8_A705PrdExiCC ;
   private boolean[] T003X8_n705PrdExiCC ;
   private java.math.BigDecimal[] T003X8_A706PrdExiCCP ;
   private boolean[] T003X8_n706PrdExiCCP ;
   private String[] T003X8_A5418PrdSalM ;
   private boolean[] T003X8_n5418PrdSalM ;
   private String[] T003X8_A10881PrdLote ;
   private boolean[] T003X8_n10881PrdLote ;
   private long[] T003X8_A13232PrdRGB ;
   private boolean[] T003X8_n13232PrdRGB ;
   private int[] T003X8_A795PrvNum ;
   private boolean[] T003X8_n795PrvNum ;
   private byte[] T003X8_A856ValCod ;
   private boolean[] T003X8_n856ValCod ;
   private String[] T003X6_A873RecPrdNom ;
   private boolean[] T003X6_n873RecPrdNom ;
   private String[] T003X32_A396EmprCod ;
   private int[] T003X32_A129BarCod ;
   private byte[] T003X32_A132BarCodReo ;
   private String[] T003X32_A130BarCodPar ;
   private short[] T003X32_A2804RecLinMaq ;
   private byte[] T003X32_A1273RecLinPro ;
   private short[] T003X32_A811RecLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV102TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV101WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class treclin__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class treclin__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class treclin__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class treclin__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class treclin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T003X2", "SELECT BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin, RecPrdDsc, PrdCant, RecLote, RecProv, PrdCantOrg, RecPrdDc2, FacCon, PrdCanFin, PrdCanAny, RecForNro, RecPrdTnq, RecCanEns, RecMar, RecSalMP, RecSalVol, RecLinRea, RecPes, RecAcc, FacCon1, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecLinUsr, RecPesFec, RecFabId, RecPrdNum, RecLotAlm, RecLoteFch, EmprCod, PrdNum, ForPrdUMe FROM TXPLRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?  FOR UPDATE OF RecPrdDsc, PrdCant, RecLote, RecProv, PrdCantOrg, RecPrdDc2, FacCon, PrdCanFin, PrdCanAny, RecForNro, RecPrdTnq, RecCanEns, RecMar, RecSalMP, RecSalVol, RecLinRea, RecPes, RecAcc, FacCon1, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecLinUsr, RecPesFec, RecFabId, RecPrdNum, RecLotAlm, RecLoteFch, PrdNum, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003X3", "SELECT BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin, RecPrdDsc, PrdCant, RecLote, RecProv, PrdCantOrg, RecPrdDc2, FacCon, PrdCanFin, PrdCanAny, RecForNro, RecPrdTnq, RecCanEns, RecMar, RecSalMP, RecSalVol, RecLinRea, RecPes, RecAcc, FacCon1, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecLinUsr, RecPesFec, RecFabId, RecPrdNum, RecLotAlm, RecLoteFch, EmprCod, PrdNum, ForPrdUMe FROM TXPLRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003X6", "SELECT COALESCE( T1.RecPrdNom, '') AS RecPrdNom FROM (SELECT CASE  WHEN ? <> 'xxxxxx' THEN COALESCE( T2.PrdNom, ' ') END AS RecPrdNom FROM (SELECT PrdNom, EmprCod, PrvNum, PrdExiAlm, ValCod, PrdExiCC, PrdExiCCP, PrdFacCon, PrdCanRes, PrdSalM, PrdLote, PrdRGB, PrdNum FROM TXPPRODUC WHERE PrdNum = ? ) T2, TXPPRODUC T3 WHERE T2.EmprCod = ? AND T2.PrvNum = T3.PrvNum AND T2.PrdExiAlm = T3.PrdExiAlm AND T2.ValCod = T3.ValCod AND T2.PrdExiCC = T3.PrdExiCC AND T2.PrdExiCCP = T3.PrdExiCCP AND T2.PrdFacCon = T3.PrdFacCon AND T2.PrdCanRes = T3.PrdCanRes AND T2.PrdSalM = T3.PrdSalM AND T2.PrdLote = T3.PrdLote AND T2.PrdRGB = T3.PrdRGB AND T3.EmprCod = ? AND T3.PrdNum = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003X7", "SELECT PrdCanRes, PrdFacCon, PrdExiAlm, PrdExiCC, PrdExiCCP, PrdSalM, PrdLote, PrdRGB, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdCanRes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003X8", "SELECT PrdCanRes, PrdFacCon, PrdExiAlm, PrdExiCC, PrdExiCCP, PrdSalM, PrdLote, PrdRGB, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003X9", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003X10", "SELECT COALESCE( PrdNum, 'xxxxxx') AS RecPrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003X11", "SELECT RecLinPro, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPCRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ?  FOR UPDATE OF RecLinPro NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003X12", "SELECT RecLinPro, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPCRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003X13", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003X14", "SELECT EmprCod FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003X15", "SELECT /*+ FIRST_ROWS(100) */ T2.EmprNom, TM1.RecLinPro, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.RecLinMaq FROM (TXPCRECET TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.RecLinPro = ? and TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.RecLinMaq = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.RecLinMaq, TM1.RecLinPro ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003X16", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003X17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ RecLinPro, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPCRECET WHERE ( RecLinPro > ? or RecLinPro = ? and BarCod > ? or BarCod = ? and RecLinPro = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and RecLinPro = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and RecLinPro = ? and RecLinMaq > ?) and EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003X18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ RecLinPro, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPCRECET WHERE ( RecLinPro < ? or RecLinPro = ? and BarCod < ? or BarCod = ? and RecLinPro = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and RecLinPro = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and RecLinPro = ? and RecLinMaq < ?) and EmprCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, RecLinMaq DESC, RecLinPro DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T003X19", "INSERT INTO TXPCRECET(RecLinPro, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, ProForCod, ProRecObs, RecVolPrf, RecTiempo, RecNroPrg, RecTemp, RecPhMx, RecPhMn, RecRb, RecNumRec, RecNH2O) VALUES(?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPCRECET")
         ,new UpdateCursor("T003X20", "DELETE FROM TXPCRECET  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ?", GX_NOMASK, "TXPCRECET")
         ,new ForEachCursor("T003X21", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003X22", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin, T1.RecPrdDsc, T2.PrdCanRes, T1.PrdCant, T1.RecLote, T1.RecProv, T1.PrdCantOrg, T1.RecPrdDc2, T3.ForPrdDsc, T2.PrdFacCon, T1.FacCon, T1.PrdCanFin, T1.PrdCanAny, T2.PrdExiAlm, T2.PrdExiCC, T2.PrdExiCCP, T1.RecForNro, T1.RecPrdTnq, T1.RecCanEns, T1.RecMar, T1.RecSalMP, T2.PrdSalM, T1.RecSalVol, T1.RecLinRea, T1.RecPes, T1.RecAcc, T1.FacCon1, T1.RecFecMov, T1.RecAnyTie, T1.RecUltAny, T1.RecPorAny, T1.PrdCanMac, T2.PrdLote, T1.RecLinUsr, T1.RecPesFec, T1.RecFabId, T2.PrdRGB, T1.RecPrdNum, T1.RecLotAlm, T1.RecLoteFch, T1.EmprCod, T1.PrdNum, T1.ForPrdUMe, T2.PrvNum, T2.ValCod, COALESCE( T4.PrdNum, 'xxxxxx') AS RecPrdFind FROM (((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) LEFT JOIN TXPPRODUC T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.RecPrdNum) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ? and T1.RecLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003X23", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003X24", "SELECT COALESCE( PrdNum, 'xxxxxx') AS RecPrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003X25", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T003X26", "INSERT INTO TXPLRECET(BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin, RecPrdDsc, PrdCant, RecLote, RecProv, PrdCantOrg, RecPrdDc2, FacCon, PrdCanFin, PrdCanAny, RecForNro, RecPrdTnq, RecCanEns, RecMar, RecSalMP, RecSalVol, RecLinRea, RecPes, RecAcc, FacCon1, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecLinUsr, RecPesFec, RecFabId, RecPrdNum, RecLotAlm, RecLoteFch, EmprCod, PrdNum, ForPrdUMe, RecManAut) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK, "TXPLRECET")
         ,new UpdateCursor("T003X27", "UPDATE TXPLRECET SET RecPrdDsc=?, PrdCant=?, RecLote=?, RecProv=?, PrdCantOrg=?, RecPrdDc2=?, FacCon=?, PrdCanFin=?, PrdCanAny=?, RecForNro=?, RecPrdTnq=?, RecCanEns=?, RecMar=?, RecSalMP=?, RecSalVol=?, RecLinRea=?, RecPes=?, RecAcc=?, FacCon1=?, RecFecMov=?, RecAnyTie=?, RecUltAny=?, RecPorAny=?, PrdCanMac=?, RecLinUsr=?, RecPesFec=?, RecFabId=?, RecPrdNum=?, RecLotAlm=?, RecLoteFch=?, PrdNum=?, ForPrdUMe=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK, "TXPLRECET")
         ,new UpdateCursor("T003X28", "DELETE FROM TXPLRECET  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK, "TXPLRECET")
         ,new ForEachCursor("T003X29", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003X30", "SELECT COALESCE( PrdNum, 'xxxxxx') AS RecPrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T003X31", "UPDATE TXPPRODUC SET PrdCanRes=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T003X32", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,3);
               ((String[]) buf[11])[0] = rslt.getString(12, 40);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,3);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,5);
               ((byte[]) buf[18])[0] = rslt.getByte(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 40);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(25,5);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(26);
               ((short[]) buf[26])[0] = rslt.getShort(27);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(28,3);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(29,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(30,3);
               ((String[]) buf[30])[0] = rslt.getString(31, 8);
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDateTime(32);
               ((int[]) buf[32])[0] = rslt.getInt(33);
               ((String[]) buf[33])[0] = rslt.getString(34, 6);
               ((short[]) buf[34])[0] = rslt.getShort(35);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(36);
               ((String[]) buf[36])[0] = rslt.getString(37, 3);
               ((String[]) buf[37])[0] = rslt.getString(38, 6);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(39);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,3);
               ((String[]) buf[11])[0] = rslt.getString(12, 40);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,3);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,5);
               ((byte[]) buf[18])[0] = rslt.getByte(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 40);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(25,5);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(26);
               ((short[]) buf[26])[0] = rslt.getShort(27);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(28,3);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(29,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(30,3);
               ((String[]) buf[30])[0] = rslt.getString(31, 8);
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDateTime(32);
               ((int[]) buf[32])[0] = rslt.getInt(33);
               ((String[]) buf[33])[0] = rslt.getString(34, 6);
               ((short[]) buf[34])[0] = rslt.getShort(35);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(36);
               ((String[]) buf[36])[0] = rslt.getString(37, 3);
               ((String[]) buf[37])[0] = rslt.getString(38, 6);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(39);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 8 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 13 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 14 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,3);
               ((String[]) buf[12])[0] = rslt.getString(13, 40);
               ((String[]) buf[13])[0] = rslt.getString(14, 5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,4);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,3);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,3);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,4);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,4);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,2);
               ((byte[]) buf[22])[0] = rslt.getByte(22);
               ((byte[]) buf[23])[0] = rslt.getByte(23);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,5);
               ((byte[]) buf[25])[0] = rslt.getByte(25);
               ((short[]) buf[26])[0] = rslt.getShort(26);
               ((String[]) buf[27])[0] = rslt.getString(27, 1);
               ((int[]) buf[28])[0] = rslt.getInt(28);
               ((String[]) buf[29])[0] = rslt.getString(29, 1);
               ((byte[]) buf[30])[0] = rslt.getByte(30);
               ((String[]) buf[31])[0] = rslt.getString(31, 40);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(32,5);
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(33);
               ((short[]) buf[34])[0] = rslt.getShort(34);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(35,3);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(36,2);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(37,3);
               ((String[]) buf[38])[0] = rslt.getString(38, 26);
               ((String[]) buf[39])[0] = rslt.getString(39, 8);
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDateTime(40);
               ((int[]) buf[41])[0] = rslt.getInt(41);
               ((long[]) buf[42])[0] = rslt.getLong(42);
               ((String[]) buf[43])[0] = rslt.getString(43, 6);
               ((short[]) buf[44])[0] = rslt.getShort(44);
               ((java.util.Date[]) buf[45])[0] = rslt.getGXDate(45);
               ((String[]) buf[46])[0] = rslt.getString(46, 3);
               ((String[]) buf[47])[0] = rslt.getString(47, 6);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(48);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((int[]) buf[51])[0] = rslt.getInt(49);
               ((byte[]) buf[52])[0] = rslt.getByte(50);
               ((String[]) buf[53])[0] = rslt.getString(51, 6);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setString(4, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 6);
               }
               return;
            case 3 :
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
            case 4 :
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
            case 5 :
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 11 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 13 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setString(16, (String)parms[15], 3);
               return;
            case 14 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setString(16, (String)parms[15], 3);
               return;
            case 15 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 19 :
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
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 26);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 3);
               stmt.setString(9, (String)parms[8], 26);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 3);
               stmt.setString(12, (String)parms[11], 40);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 5);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 3);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 3);
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 5);
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setString(22, (String)parms[21], 1);
               stmt.setByte(23, ((Number) parms[22]).byteValue());
               stmt.setString(24, (String)parms[23], 40);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[24], 5);
               stmt.setDate(26, (java.util.Date)parms[25]);
               stmt.setShort(27, ((Number) parms[26]).shortValue());
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[27], 3);
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[28], 2);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[29], 3);
               stmt.setString(31, (String)parms[30], 8);
               stmt.setDateTime(32, (java.util.Date)parms[31], false);
               stmt.setInt(33, ((Number) parms[32]).intValue());
               stmt.setString(34, (String)parms[33], 6);
               stmt.setShort(35, ((Number) parms[34]).shortValue());
               stmt.setDate(36, (java.util.Date)parms[35]);
               stmt.setString(37, (String)parms[36], 3);
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[38], 6);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(39, ((Number) parms[40]).byteValue());
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setString(6, (String)parms[5], 40);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 3);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setString(16, (String)parms[15], 1);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setString(18, (String)parms[17], 40);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 5);
               stmt.setDate(20, (java.util.Date)parms[19]);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 3);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[22], 2);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[23], 3);
               stmt.setString(25, (String)parms[24], 8);
               stmt.setDateTime(26, (java.util.Date)parms[25], false);
               stmt.setInt(27, ((Number) parms[26]).intValue());
               stmt.setString(28, (String)parms[27], 6);
               stmt.setShort(29, ((Number) parms[28]).shortValue());
               stmt.setDate(30, (java.util.Date)parms[29]);
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[31], 6);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(32, ((Number) parms[33]).byteValue());
               }
               stmt.setString(33, (String)parms[34], 3);
               stmt.setInt(34, ((Number) parms[35]).intValue());
               stmt.setByte(35, ((Number) parms[36]).byteValue());
               stmt.setString(36, (String)parms[37], 1);
               stmt.setShort(37, ((Number) parms[38]).shortValue());
               stmt.setByte(38, ((Number) parms[39]).byteValue());
               stmt.setShort(39, ((Number) parms[40]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 25 :
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
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 4);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 6);
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

