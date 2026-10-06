package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mantenimientoproductosreceta_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action82") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A872RecPrdNum = httpContext.GetPar( "RecPrdNum") ;
         A704PrdExiAlm = CommonUtil.decimalVal( httpContext.GetPar( "PrdExiAlm"), ".") ;
         A685PrdCanRes = CommonUtil.decimalVal( httpContext.GetPar( "PrdCanRes"), ".") ;
         A686PrdCant = CommonUtil.decimalVal( httpContext.GetPar( "PrdCant"), ".") ;
         A705PrdExiCC = CommonUtil.decimalVal( httpContext.GetPar( "PrdExiCC"), ".") ;
         AV61Cantold = CommonUtil.decimalVal( httpContext.GetPar( "Cantold"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61Cantold", GXutil.ltrimstr( AV61Cantold, 11, 3));
         AV38AlmCC = (short)(GXutil.lval( httpContext.GetPar( "AlmCC"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38AlmCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38AlmCC), 4, 0));
         AV52msgErr = httpContext.GetPar( "msgErr") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52msgErr", AV52msgErr);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         A431FacCon = CommonUtil.decimalVal( httpContext.GetPar( "FacCon"), ".") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_82_1RG410( A396EmprCod, A872RecPrdNum, A704PrdExiAlm, A685PrdCanRes, A686PrdCant, A705PrdExiCC, AV61Cantold, AV38AlmCC, AV52msgErr, A719PrdNum, A431FacCon) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action83") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A872RecPrdNum = httpContext.GetPar( "RecPrdNum") ;
         AV61Cantold = CommonUtil.decimalVal( httpContext.GetPar( "Cantold"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61Cantold", GXutil.ltrimstr( AV61Cantold, 11, 3));
         A686PrdCant = CommonUtil.decimalVal( httpContext.GetPar( "PrdCant"), ".") ;
         AV62Totaldekilos = CommonUtil.decimalVal( httpContext.GetPar( "Totaldekilos"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Totaldekilos", GXutil.ltrimstr( AV62Totaldekilos, 10, 2));
         AV64VolumenReceta = (int)(GXutil.lval( httpContext.GetPar( "VolumenReceta"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64VolumenReceta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64VolumenReceta), 5, 0));
         AV30Valcos = (short)(GXutil.lval( httpContext.GetPar( "Valcos"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Valcos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Valcos), 4, 0));
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         n490ForPrdUMe = false ;
         A431FacCon = CommonUtil.decimalVal( httpContext.GetPar( "FacCon"), ".") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_83_1RG410( A396EmprCod, A872RecPrdNum, AV61Cantold, A686PrdCant, AV62Totaldekilos, AV64VolumenReceta, AV30Valcos, A490ForPrdUMe, A431FacCon) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action84") == 0 )
      {
         AV7EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
         A872RecPrdNum = httpContext.GetPar( "RecPrdNum") ;
         A238CanRes = CommonUtil.decimalVal( httpContext.GetPar( "CanRes"), ".") ;
         AV74CanResold = (short)(GXutil.lval( httpContext.GetPar( "CanResold"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74CanResold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74CanResold), 4, 0));
         A686PrdCant = CommonUtil.decimalVal( httpContext.GetPar( "PrdCant"), ".") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_84_1RG410( AV7EmprCod, A872RecPrdNum, A238CanRes, AV74CanResold, A686PrdCant) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action85") == 0 )
      {
         AV7EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
         A872RecPrdNum = httpContext.GetPar( "RecPrdNum") ;
         AV74CanResold = (short)(GXutil.lval( httpContext.GetPar( "CanResold"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74CanResold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74CanResold), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_85_1RG410( AV7EmprCod, A872RecPrdNum, AV74CanResold) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action86") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_86_1RG410( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action87") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_87_1RG410( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action88") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_88_1RG410( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action89") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_89_1RG410( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action92") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV82Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82Pgmname", AV82Pgmname);
         AV19UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19UsurCod", AV19UsurCod);
         AV18Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
         AV76Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76Inc_obs", AV76Inc_obs);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14055RecManAut = httpContext.GetPar( "RecManAut") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_92_1RG410( A396EmprCod, AV82Pgmname, AV19UsurCod, AV18Station, AV76Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar, A14055RecManAut) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action93") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A872RecPrdNum = httpContext.GetPar( "RecPrdNum") ;
         A686PrdCant = CommonUtil.decimalVal( httpContext.GetPar( "PrdCant"), ".") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_93_1RG410( Gx_mode, A396EmprCod, A872RecPrdNum, A686PrdCant) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel21"+"_"+"RECPRDDSCF") == 0 )
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
         gx21asarecprddscf1RG410( A874RecPrdFind, A396EmprCod, A872RecPrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_96") == 0 )
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
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_96( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_100") == 0 )
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
         gxload_100( A396EmprCod, A872RecPrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_99") == 0 )
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
         gxload_99( A396EmprCod, A490ForPrdUMe) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_98") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_98( A396EmprCod, A719PrdNum) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_rec") == 0 )
      {
         gxnrgridlevel_rec_newrow_invoke( ) ;
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
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV49BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49BarCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49BarCod), "ZZZZZZZ9")));
            AV50BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50BarCodReo", GXutil.str( AV50BarCodReo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV50BarCodReo), "9")));
            AV51BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51BarCodPar", AV51BarCodPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51BarCodPar, ""))));
            AV14RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14RecLinMaq), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14RecLinMaq), "ZZZ9")));
            AV15RecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "RecLinPro"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15RecLinPro), 2, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINPRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15RecLinPro), "Z9")));
            AV27TotKgs = CommonUtil.decimalVal( httpContext.GetPar( "TotKgs"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TotKgs", GXutil.ltrimstr( AV27TotKgs, 10, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGS", getSecureSignedToken( "", localUtil.format( AV27TotKgs, "ZZZZZZ9.99")));
            AV28Volumen = (int)(GXutil.lval( httpContext.GetPar( "Volumen"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Volumen), 5, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLUMEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28Volumen), "ZZZZ9")));
            AV31FecPan = localUtil.parseDateParm( httpContext.GetPar( "FecPan")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31FecPan", localUtil.format(AV31FecPan, "99/99/99"));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECPAN", getSecureSignedToken( "", AV31FecPan));
            AV25BarNHdr = httpContext.GetPar( "BarNHdr") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25BarNHdr", AV25BarNHdr);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNHDR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25BarNHdr, ""))));
            AV26ProForDsc = httpContext.GetPar( "ProForDsc") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26ProForDsc", AV26ProForDsc);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ProForDsc, ""))));
            AV54Proforfab = httpContext.GetPar( "Proforfab") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54Proforfab", AV54Proforfab);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORFAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54Proforfab, ""))));
            AV69Modif2 = httpContext.GetPar( "Modif2") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69Modif2", AV69Modif2);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento de Productos (Receta)", ""), (short)(0)) ;
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

   public void gxnrgridlevel_rec_newrow_invoke( )
   {
      nRC_GXsfl_51 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_51"))) ;
      nGXsfl_51_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_51_idx"))) ;
      sGXsfl_51_idx = httpContext.GetPar( "sGXsfl_51_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      AV43Artemalha = (short)(GXutil.lval( httpContext.GetPar( "Artemalha"))) ;
      AV21NoCantidad = CommonUtil.decimalVal( httpContext.GetPar( "NoCantidad"), ".") ;
      AV37Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_rec_newrow( ) ;
      /* End function gxnrGridlevel_rec_newrow_invoke */
   }

   public mantenimientoproductosreceta_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mantenimientoproductosreceta_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientoproductosreceta_trn_impl.class ));
   }

   public mantenimientoproductosreceta_trn_impl( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkPrdSalM = UIFactory.getCheckbox(this);
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
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavProfordsc_Internalname, GXutil.rtrim( AV26ProForDsc), GXutil.rtrim( localUtil.format( AV26ProForDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProfordsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProfordsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoProductosReceta_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotaldekilos_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavTotaldekilos_Internalname, httpContext.getMessage( "Total Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavTotaldekilos_Internalname, GXutil.ltrim( localUtil.ntoc( AV62Totaldekilos, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotaldekilos_Enabled!=0) ? localUtil.format( AV62Totaldekilos, "ZZZZZZ9.99") : localUtil.format( AV62Totaldekilos, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotaldekilos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotaldekilos_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoProductosReceta_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavVolumenreceta_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavVolumenreceta_Internalname, httpContext.getMessage( "Volumen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavVolumenreceta_Internalname, GXutil.ltrim( localUtil.ntoc( AV64VolumenReceta, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavVolumenreceta_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV64VolumenReceta), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV64VolumenReceta), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavVolumenreceta_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavVolumenreceta_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoProductosReceta_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipodeproceso_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavTipodeproceso_Internalname, GXutil.rtrim( AV63TipodeProceso), GXutil.rtrim( localUtil.format( AV63TipodeProceso, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipodeproceso_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipodeproceso_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoProductosReceta_TRN.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoProductosReceta_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoProductosReceta_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoProductosReceta_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_rec_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_rec( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_recprdnum.setProperty("Caption", Combo_recprdnum_Caption);
      ucCombo_recprdnum.setProperty("Cls", Combo_recprdnum_Cls);
      ucCombo_recprdnum.setProperty("IsGridItem", Combo_recprdnum_Isgriditem);
      ucCombo_recprdnum.setProperty("EmptyItem", Combo_recprdnum_Emptyitem);
      ucCombo_recprdnum.setProperty("DropDownOptionsTitleSettingsIcons", AV81DDO_TitleSettingsIcons);
      ucCombo_recprdnum.setProperty("DropDownOptionsData", AV80RecPrdNum_Data);
      ucCombo_recprdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_recprdnum_Internalname, "COMBO_RECPRDNUMContainer");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoProductosReceta_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCod_Visible, edtBarCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoProductosReceta_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodReo_Visible, edtBarCodReo_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoProductosReceta_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodPar_Visible, edtBarCodPar_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoProductosReceta_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecLinMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecLinMaq_Jsonclick, 0, "Attribute", "", "", "", "", edtRecLinMaq_Visible, edtRecLinMaq_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoProductosReceta_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecLinPro_Internalname, GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecLinPro_Jsonclick, 0, "Attribute", "", "", "", "", edtRecLinPro_Visible, edtRecLinPro_Enabled, 1, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoProductosReceta_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV25BarNHdr), GXutil.rtrim( localUtil.format( AV25BarNHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnhdr_Jsonclick, 0, "Attribute", "", "", "", "", edtavBarnhdr_Visible, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoProductosReceta_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavReclinmaq_Internalname, GXutil.ltrim( localUtil.ntoc( AV14RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavReclinmaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14RecLinMaq), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14RecLinMaq), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavReclinmaq_Jsonclick, 0, "Attribute", "", "", "", "", edtavReclinmaq_Visible, edtavReclinmaq_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoProductosReceta_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavReclinpro_Internalname, GXutil.ltrim( localUtil.ntoc( AV15RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavReclinpro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV15RecLinPro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV15RecLinPro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavReclinpro_Jsonclick, 0, "Attribute", "", "", "", "", edtavReclinpro_Visible, edtavReclinpro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoProductosReceta_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavValcos_Internalname, GXutil.ltrim( localUtil.ntoc( AV30Valcos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavValcos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV30Valcos), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV30Valcos), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavValcos_Jsonclick, 0, "Attribute", "", "", "", "", edtavValcos_Visible, edtavValcos_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoProductosReceta_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavProforlab_Internalname, GXutil.rtrim( AV58ProForLab), GXutil.rtrim( localUtil.format( AV58ProForLab, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProforlab_Jsonclick, 0, "Attribute", "", "", "", "", edtavProforlab_Visible, edtavProforlab_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoProductosReceta_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_rec( )
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
            scanStart1RG410( ) ;
            while ( RcdFound410 != 0 )
            {
               init_level_properties410( ) ;
               getByPrimaryKey1RG410( ) ;
               addRow1RG410( ) ;
               scanNext1RG410( ) ;
            }
            scanEnd1RG410( ) ;
            nBlankRcdCount410 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1RG410( ) ;
         standaloneModal1RG410( ) ;
         sMode410 = Gx_mode ;
         while ( nGXsfl_51_idx < nRC_GXsfl_51 )
         {
            bGXsfl_51_Refreshing = true ;
            readRow1RG410( ) ;
            edtRecLin_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "RECLIN_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecLin_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLin_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
            edtRecLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECLIN_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLin_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecPrdNum_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDNUM_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPrdNum_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdNum_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
            edtRecPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDNUM_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdNum_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecPrdDsc_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDDSC_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDsc_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDsc_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
            edtRecPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDDSC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDsc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtFacCon_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "FACCON_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacCon_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCon_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
            edtFacCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACCON_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCon_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtForPrdUMe_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
            edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtForPrdDsc_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
            edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtPrdCant_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANT_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
            edtPrdCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANT_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecManAut_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECMANAUT_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecManAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecManAut_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecLote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECLOTE_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLote_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecForNro_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "RECFORNRO_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecForNro_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecForNro_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
            edtRecForNro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECFORNRO_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecForNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecForNro_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecPrdTnq_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDTNQ_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPrdTnq_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdTnq_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
            edtRecPrdTnq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDTNQ_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPrdTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdTnq_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtCanRes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CANRES_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCanRes_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtPrdExiCC_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXICC_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
            edtPrdExiCC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXICC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecPrdFind_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDFIND_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPrdFind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdFind_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtPrdExiAlm_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXIALM_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
            edtPrdExiAlm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXIALM_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtPrdCanRes_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANRES_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
            edtPrdCanRes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANRES_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecCanEns_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECCANENS_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecCanEns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecCanEns_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecMar_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "RECMAR_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecMar_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMar_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
            edtRecMar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECMAR_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecMar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMar_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecSalMP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECSALMP_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecSalMP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecSalMP_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            chkPrdSalM.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "PRDSALM_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkPrdSalM.getInternalname(), "Enabled", GXutil.ltrimstr( chkPrdSalM.getEnabled(), 5, 0), !bGXsfl_51_Refreshing);
            edtRecSalVol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECSALVOL_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecSalVol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecSalVol_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecLinRea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECLINREA_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecLinRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinRea_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecPes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPES_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPes_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecAcc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECACC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecAcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecAcc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecFecMov_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECFECMOV_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecFecMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFecMov_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecAnyTie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECANYTIE_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecAnyTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecAnyTie_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecUltAny_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECULTANY_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecUltAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecUltAny_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecPorAny_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPORANY_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPorAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPorAny_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtPrdCanMac_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANMAC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCanMac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanMac_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecProv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPROV_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecProv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecProv_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtPrdLote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDLOTE_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLote_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecLinUsr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECLINUSR_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecLinUsr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinUsr_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecPesFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPESFEC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPesFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPesFec_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtPrdCantOrg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANTORG_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCantOrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCantOrg_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecFabId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECFABID_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecFabId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFabId_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtPrdRGB_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDRGB_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdRGB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRGB_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtCantProduc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CANTPRODUC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCantProduc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCantProduc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtRecPrdDscf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDDSCF_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDscf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDscf_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            imgprompt_490_Link = httpContext.cgiGet( "PROMPT_490_"+sGXsfl_51_idx+"Link") ;
            if ( ( nRcdExists_410 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1RG410( ) ;
            }
            sendRow1RG410( ) ;
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
            scanStart1RG410( ) ;
            while ( RcdFound410 != 0 )
            {
               sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_51410( ) ;
               init_level_properties410( ) ;
               standaloneNotModal1RG410( ) ;
               getByPrimaryKey1RG410( ) ;
               standaloneModal1RG410( ) ;
               addRow1RG410( ) ;
               scanNext1RG410( ) ;
            }
            scanEnd1RG410( ) ;
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
         initAll1RG410( ) ;
         init_level_properties410( ) ;
         nRcdExists_410 = (short)(0) ;
         nIsMod_410 = (short)(0) ;
         nRcdDeleted_410 = (short)(0) ;
         nBlankRcdCount410 = (short)(nBlankRcdUsr410+nBlankRcdCount410) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount410 > 0 )
         {
            standaloneNotModal1RG410( ) ;
            standaloneModal1RG410( ) ;
            addRow1RG410( ) ;
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
      httpContext.writeText( "<div id=\""+"Gridlevel_recContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_rec", Gridlevel_recContainer, subGridlevel_rec_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_recContainerData", Gridlevel_recContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_recContainerData"+"V", Gridlevel_recContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_recContainerData"+"V"+"\" value='"+Gridlevel_recContainer.GridValuesHidden()+"'/>") ;
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
      e111RG2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV81DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vRECPRDNUM_DATA"), AV80RecPrdNum_Data);
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
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV49BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV50BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV51BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            AV32Modif = httpContext.cgiGet( "vMODIF") ;
            AV82Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( "PRDFACCON")) ;
            AV43Artemalha = (short)(localUtil.ctol( httpContext.cgiGet( "vARTEMALHA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV21NoCantidad = localUtil.ctond( httpContext.cgiGet( "vNOCANTIDAD")) ;
            AV37Moda21 = (short)(localUtil.ctol( httpContext.cgiGet( "vMODA21"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV46Lote01 = (short)(localUtil.ctol( httpContext.cgiGet( "vLOTE01"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV71oldRecLote = httpContext.cgiGet( "vOLDRECLOTE") ;
            AV61Cantold = localUtil.ctond( httpContext.cgiGet( "vCANTOLD")) ;
            AV74CanResold = (short)(localUtil.ctol( httpContext.cgiGet( "vCANRESOLD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV65Inc_obs1 = httpContext.cgiGet( "vINC_OBS1") ;
            AV66Inc_obs2 = httpContext.cgiGet( "vINC_OBS2") ;
            AV77RecManAutold = httpContext.cgiGet( "vRECMANAUTOLD") ;
            AV76Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "VALCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV47EliminarReceta = (short)(localUtil.ctol( httpContext.cgiGet( "vELIMINARRECETA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV52msgErr = httpContext.cgiGet( "vMSGERR") ;
            AV35Err_und = (short)(localUtil.ctol( httpContext.cgiGet( "vERR_UND"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV38AlmCC = (short)(localUtil.ctol( httpContext.cgiGet( "vALMCC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV19UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV18Station = httpContext.cgiGet( "vSTATION") ;
            A13938RecLoteFch = localUtil.ctod( httpContext.cgiGet( "RECLOTEFCH"), 0) ;
            A13937RecLotAlm = (short)(localUtil.ctol( httpContext.cgiGet( "RECLOTALM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4338PrdUMeFo = (byte)(localUtil.ctol( httpContext.cgiGet( "PRDUMEFO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Combo_recprdnum_Objectcall = httpContext.cgiGet( "COMBO_RECPRDNUM_Objectcall") ;
            Combo_recprdnum_Class = httpContext.cgiGet( "COMBO_RECPRDNUM_Class") ;
            Combo_recprdnum_Icontype = httpContext.cgiGet( "COMBO_RECPRDNUM_Icontype") ;
            Combo_recprdnum_Icon = httpContext.cgiGet( "COMBO_RECPRDNUM_Icon") ;
            Combo_recprdnum_Caption = httpContext.cgiGet( "COMBO_RECPRDNUM_Caption") ;
            Combo_recprdnum_Tooltip = httpContext.cgiGet( "COMBO_RECPRDNUM_Tooltip") ;
            Combo_recprdnum_Cls = httpContext.cgiGet( "COMBO_RECPRDNUM_Cls") ;
            Combo_recprdnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_RECPRDNUM_Selectedvalue_set") ;
            Combo_recprdnum_Selectedvalue_get = httpContext.cgiGet( "COMBO_RECPRDNUM_Selectedvalue_get") ;
            Combo_recprdnum_Selectedtext_set = httpContext.cgiGet( "COMBO_RECPRDNUM_Selectedtext_set") ;
            Combo_recprdnum_Selectedtext_get = httpContext.cgiGet( "COMBO_RECPRDNUM_Selectedtext_get") ;
            Combo_recprdnum_Gamoauthtoken = httpContext.cgiGet( "COMBO_RECPRDNUM_Gamoauthtoken") ;
            Combo_recprdnum_Ddointernalname = httpContext.cgiGet( "COMBO_RECPRDNUM_Ddointernalname") ;
            Combo_recprdnum_Titlecontrolalign = httpContext.cgiGet( "COMBO_RECPRDNUM_Titlecontrolalign") ;
            Combo_recprdnum_Dropdownoptionstype = httpContext.cgiGet( "COMBO_RECPRDNUM_Dropdownoptionstype") ;
            Combo_recprdnum_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_RECPRDNUM_Enabled")) ;
            Combo_recprdnum_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_RECPRDNUM_Visible")) ;
            Combo_recprdnum_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_RECPRDNUM_Titlecontrolidtoreplace") ;
            Combo_recprdnum_Datalisttype = httpContext.cgiGet( "COMBO_RECPRDNUM_Datalisttype") ;
            Combo_recprdnum_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_RECPRDNUM_Allowmultipleselection")) ;
            Combo_recprdnum_Datalistfixedvalues = httpContext.cgiGet( "COMBO_RECPRDNUM_Datalistfixedvalues") ;
            Combo_recprdnum_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_RECPRDNUM_Isgriditem")) ;
            Combo_recprdnum_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_RECPRDNUM_Hasdescription")) ;
            Combo_recprdnum_Datalistproc = httpContext.cgiGet( "COMBO_RECPRDNUM_Datalistproc") ;
            Combo_recprdnum_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_RECPRDNUM_Datalistprocparametersprefix") ;
            Combo_recprdnum_Remoteservicesparameters = httpContext.cgiGet( "COMBO_RECPRDNUM_Remoteservicesparameters") ;
            Combo_recprdnum_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_RECPRDNUM_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_recprdnum_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_RECPRDNUM_Includeonlyselectedoption")) ;
            Combo_recprdnum_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_RECPRDNUM_Includeselectalloption")) ;
            Combo_recprdnum_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_RECPRDNUM_Emptyitem")) ;
            Combo_recprdnum_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_RECPRDNUM_Includeaddnewoption")) ;
            Combo_recprdnum_Htmltemplate = httpContext.cgiGet( "COMBO_RECPRDNUM_Htmltemplate") ;
            Combo_recprdnum_Multiplevaluestype = httpContext.cgiGet( "COMBO_RECPRDNUM_Multiplevaluestype") ;
            Combo_recprdnum_Loadingdata = httpContext.cgiGet( "COMBO_RECPRDNUM_Loadingdata") ;
            Combo_recprdnum_Noresultsfound = httpContext.cgiGet( "COMBO_RECPRDNUM_Noresultsfound") ;
            Combo_recprdnum_Emptyitemtext = httpContext.cgiGet( "COMBO_RECPRDNUM_Emptyitemtext") ;
            Combo_recprdnum_Onlyselectedvalues = httpContext.cgiGet( "COMBO_RECPRDNUM_Onlyselectedvalues") ;
            Combo_recprdnum_Selectalltext = httpContext.cgiGet( "COMBO_RECPRDNUM_Selectalltext") ;
            Combo_recprdnum_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_RECPRDNUM_Multiplevaluesseparator") ;
            Combo_recprdnum_Addnewoptiontext = httpContext.cgiGet( "COMBO_RECPRDNUM_Addnewoptiontext") ;
            /* Read variables values. */
            AV26ProForDsc = httpContext.cgiGet( edtavProfordsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26ProForDsc", AV26ProForDsc);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ProForDsc, ""))));
            AV62Totaldekilos = localUtil.ctond( httpContext.cgiGet( edtavTotaldekilos_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62Totaldekilos", GXutil.ltrimstr( AV62Totaldekilos, 10, 2));
            AV64VolumenReceta = (int)(localUtil.ctol( httpContext.cgiGet( edtavVolumenreceta_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64VolumenReceta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64VolumenReceta), 5, 0));
            AV63TipodeProceso = httpContext.cgiGet( edtavTipodeproceso_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TipodeProceso", AV63TipodeProceso);
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
            AV25BarNHdr = httpContext.cgiGet( edtavBarnhdr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25BarNHdr", AV25BarNHdr);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNHDR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25BarNHdr, ""))));
            AV14RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtavReclinmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14RecLinMaq), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14RecLinMaq), "ZZZ9")));
            AV15RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtavReclinpro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15RecLinPro), 2, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINPRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15RecLinPro), "Z9")));
            AV30Valcos = (short)(localUtil.ctol( httpContext.cgiGet( edtavValcos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30Valcos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Valcos), 4, 0));
            AV58ProForLab = httpContext.cgiGet( edtavProforlab_Internalname) ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"MantenimientoProductosReceta_TRN");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) || ( A1273RecLinPro != Z1273RecLinPro ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("mantenimientoproductosreceta_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_1RG0( ) ;
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
                        e111RG2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121RG2 ();
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
         e121RG2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1RG409( ) ;
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
         disableAttributes1RG409( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavProfordsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProfordsc_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavTotaldekilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotaldekilos_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavVolumenreceta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVolumenreceta_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavTipodeproceso_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipodeproceso_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinmaq_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinpro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinpro_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavValcos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValcos_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavProforlab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProforlab_Enabled), 5, 0), true);
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

   public void confirm_1RG0( )
   {
      beforeValidate1RG409( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1RG409( ) ;
         }
         else
         {
            checkExtendedTable1RG409( ) ;
            closeExtendedTableCursors1RG409( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode409 = Gx_mode ;
         confirm_1RG410( ) ;
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

   public void confirm_1RG410( )
   {
      sV32Modif = OV32Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
      nGXsfl_51_idx = 0 ;
      while ( nGXsfl_51_idx < nRC_GXsfl_51 )
      {
         readRow1RG410( ) ;
         if ( ( nRcdExists_410 != 0 ) || ( nIsMod_410 != 0 ) )
         {
            getKey1RG410( ) ;
            if ( ( nRcdExists_410 == 0 ) && ( nRcdDeleted_410 == 0 ) )
            {
               if ( RcdFound410 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1RG410( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1RG410( ) ;
                     closeExtendedTableCursors1RG410( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     OV32Modif = AV32Modif ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
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
                     getByPrimaryKey1RG410( ) ;
                     load1RG410( ) ;
                     beforeValidate1RG410( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1RG410( ) ;
                        OV32Modif = AV32Modif ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
                     }
                  }
                  else
                  {
                     if ( nIsMod_410 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1RG410( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1RG410( ) ;
                           closeExtendedTableCursors1RG410( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           OV32Modif = AV32Modif ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
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
         httpContext.changePostValue( edtRecPrdDsc_Internalname, GXutil.rtrim( A875RecPrdDsc)) ;
         httpContext.changePostValue( edtFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtPrdCant_Internalname, GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecManAut_Internalname, GXutil.rtrim( A14055RecManAut)) ;
         httpContext.changePostValue( edtRecLote_Internalname, GXutil.rtrim( A5725RecLote)) ;
         httpContext.changePostValue( edtRecForNro_Internalname, GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecPrdTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCanRes_Internalname, GXutil.ltrim( localUtil.ntoc( A238CanRes, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecPrdFind_Internalname, GXutil.rtrim( A874RecPrdFind)) ;
         httpContext.changePostValue( edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdCanRes_Internalname, GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecCanEns_Internalname, GXutil.ltrim( localUtil.ntoc( A3938RecCanEns, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecMar_Internalname, GXutil.ltrim( localUtil.ntoc( A4024RecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecSalMP_Internalname, GXutil.ltrim( localUtil.ntoc( A5422RecSalMP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkPrdSalM.getInternalname(), ((GXutil.strcmp(A5418PrdSalM, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( edtRecSalVol_Internalname, GXutil.ltrim( localUtil.ntoc( A5467RecSalVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecLinRea_Internalname, GXutil.rtrim( A5527RecLinRea)) ;
         httpContext.changePostValue( edtRecPes_Internalname, GXutil.ltrim( localUtil.ntoc( A8934RecPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecAcc_Internalname, GXutil.rtrim( A8937RecAcc)) ;
         httpContext.changePostValue( edtRecFecMov_Internalname, localUtil.format(A3804RecFecMov, "99/99/99")) ;
         httpContext.changePostValue( edtRecAnyTie_Internalname, GXutil.ltrim( localUtil.ntoc( A3805RecAnyTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecUltAny_Internalname, GXutil.ltrim( localUtil.ntoc( A3806RecUltAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecPorAny_Internalname, GXutil.ltrim( localUtil.ntoc( A3807RecPorAny, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdCanMac_Internalname, GXutil.ltrim( localUtil.ntoc( A4900PrdCanMac, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecProv_Internalname, GXutil.ltrim( localUtil.ntoc( A11708RecProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdLote_Internalname, GXutil.rtrim( A10881PrdLote)) ;
         httpContext.changePostValue( edtRecLinUsr_Internalname, GXutil.rtrim( A4576RecLinUsr)) ;
         httpContext.changePostValue( edtRecPesFec_Internalname, localUtil.ttoc( A4577RecPesFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtPrdCantOrg_Internalname, GXutil.ltrim( localUtil.ntoc( A12710PrdCantOrg, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecFabId_Internalname, GXutil.ltrim( localUtil.ntoc( A12717RecFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdRGB_Internalname, GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCantProduc_Internalname, GXutil.ltrim( localUtil.ntoc( A13832CantProduc, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtRecPrdDscf_Internalname, GXutil.rtrim( A13897RecPrdDscf)) ;
         httpContext.changePostValue( "ZT_"+"Z811RecLin_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5725RecLote_"+sGXsfl_51_idx, GXutil.rtrim( Z5725RecLote)) ;
         httpContext.changePostValue( "ZT_"+"Z686PrdCant_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z875RecPrdDsc_"+sGXsfl_51_idx, GXutil.rtrim( Z875RecPrdDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z14055RecManAut_"+sGXsfl_51_idx, GXutil.rtrim( Z14055RecManAut)) ;
         httpContext.changePostValue( "ZT_"+"Z872RecPrdNum_"+sGXsfl_51_idx, GXutil.rtrim( Z872RecPrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z431FacCon_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2394RecForNro_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3274RecPrdTnq_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3938RecCanEns_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3938RecCanEns, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4024RecMar_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z4024RecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5422RecSalMP_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z5422RecSalMP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5467RecSalVol_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z5467RecSalVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5527RecLinRea_"+sGXsfl_51_idx, GXutil.rtrim( Z5527RecLinRea)) ;
         httpContext.changePostValue( "ZT_"+"Z8934RecPes_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z8934RecPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8937RecAcc_"+sGXsfl_51_idx, GXutil.rtrim( Z8937RecAcc)) ;
         httpContext.changePostValue( "ZT_"+"Z3804RecFecMov_"+sGXsfl_51_idx, localUtil.dtoc( Z3804RecFecMov, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z3805RecAnyTie_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3805RecAnyTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3806RecUltAny_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3806RecUltAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3807RecPorAny_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3807RecPorAny, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4900PrdCanMac_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z4900PrdCanMac, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11708RecProv_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z11708RecProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4576RecLinUsr_"+sGXsfl_51_idx, GXutil.rtrim( Z4576RecLinUsr)) ;
         httpContext.changePostValue( "ZT_"+"Z4577RecPesFec_"+sGXsfl_51_idx, localUtil.ttoc( Z4577RecPesFec, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12710PrdCantOrg_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z12710PrdCantOrg, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12717RecFabId_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z12717RecFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13938RecLoteFch_"+sGXsfl_51_idx, localUtil.dtoc( Z13938RecLoteFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z13937RecLotAlm_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z13937RecLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_51_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T14055RecManAut_"+sGXsfl_51_idx, GXutil.rtrim( O14055RecManAut)) ;
         httpContext.changePostValue( "T5725RecLote_"+sGXsfl_51_idx, GXutil.rtrim( O5725RecLote)) ;
         httpContext.changePostValue( "T431FacCon_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T686PrdCant_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T238CanRes_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O238CanRes, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2394RecForNro_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_410_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_410, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_410_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_410, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_410_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_410, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N5725RecLote_"+sGXsfl_51_idx, GXutil.rtrim( A5725RecLote)) ;
         httpContext.changePostValue( "N686PrdCant_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N14055RecManAut_"+sGXsfl_51_idx, GXutil.rtrim( A14055RecManAut)) ;
         if ( nIsMod_410 != 0 )
         {
            httpContext.changePostValue( "RECLIN_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecLin_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECLIN_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDNUM_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdNum_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDNUM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDDSC_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDDSC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACCON_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtFacCon_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACCON_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANT_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtPrdCant_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANT_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECMANAUT_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecManAut_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECLOTE_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECFORNRO_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecForNro_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECFORNRO_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecForNro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDTNQ_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdTnq_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDTNQ_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdTnq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CANRES_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCanRes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXICC_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXICC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDFIND_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdFind_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXIALM_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXIALM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANRES_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANRES_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECCANENS_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecCanEns_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECMAR_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecMar_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECMAR_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecMar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECSALMP_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecSalMP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDSALM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkPrdSalM.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECSALVOL_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecSalVol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECLINREA_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLinRea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPES_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECACC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecAcc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECFECMOV_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecFecMov_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECANYTIE_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecAnyTie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECULTANY_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecUltAny_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPORANY_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPorAny_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANMAC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanMac_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPROV_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecProv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDLOTE_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdLote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECLINUSR_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLinUsr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPESFEC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPesFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANTORG_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCantOrg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECFABID_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecFabId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDRGB_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdRGB_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CANTPRODUC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCantProduc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDDSCF_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdDscf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      OV32Modif = sV32Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1RG0( )
   {
   }

   public void e111RG2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mantenimientoproductosreceta_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV19UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      mantenimientoproductosreceta_trn_impl.this.AV7EmprCod = GXv_char2[0] ;
      mantenimientoproductosreceta_trn_impl.this.AV8EmprNom = GXv_char3[0] ;
      mantenimientoproductosreceta_trn_impl.this.AV19UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprNom", AV8EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV19UsurCod", AV19UsurCod);
      AV32Modif = AV69Modif2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
      GXt_int5 = AV30Valcos ;
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = "030100" ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
      mantenimientoproductosreceta_trn_impl.this.AV7EmprCod = GXv_char4[0] ;
      mantenimientoproductosreceta_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      AV30Valcos = (short)(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Valcos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Valcos), 4, 0));
      GXt_int7 = AV20Flag ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, "038001", GXv_int8) ;
      mantenimientoproductosreceta_trn_impl.this.GXt_int7 = GXv_int8[0] ;
      AV20Flag = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Flag", GXutil.str( AV20Flag, 1, 0));
      GXt_int7 = (byte)(AV33Centra) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "CENTRA", ""), GXv_int8) ;
      mantenimientoproductosreceta_trn_impl.this.GXt_int7 = GXv_int8[0] ;
      AV33Centra = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Centra", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Centra), 4, 0));
      GXt_int7 = (byte)(AV34F_pizarro) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "PIZARR", ""), GXv_int8) ;
      mantenimientoproductosreceta_trn_impl.this.GXt_int7 = GXv_int8[0] ;
      AV34F_pizarro = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34F_pizarro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34F_pizarro), 4, 0));
      GXt_int7 = (byte)(AV35Err_und) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "ERRUND", ""), GXv_int8) ;
      mantenimientoproductosreceta_trn_impl.this.GXt_int7 = GXv_int8[0] ;
      AV35Err_und = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Err_und", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Err_und), 4, 0));
      GXt_int7 = (byte)(AV36Suprema) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "SUPREM", ""), GXv_int8) ;
      mantenimientoproductosreceta_trn_impl.this.GXt_int7 = GXv_int8[0] ;
      AV36Suprema = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Suprema", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Suprema), 4, 0));
      GXt_int7 = (byte)(AV37Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      mantenimientoproductosreceta_trn_impl.this.GXt_int7 = GXv_int8[0] ;
      AV37Moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Moda21), 4, 0));
      GXt_int7 = (byte)(AV38AlmCC) ;
      GXv_int8[0] = GXt_int7 ;
      new app.popcion(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "10002E", ""), GXv_int8) ;
      mantenimientoproductosreceta_trn_impl.this.GXt_int7 = GXv_int8[0] ;
      AV38AlmCC = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38AlmCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38AlmCC), 4, 0));
      GXt_int5 = AV39Factor8 ;
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "STDFAT", "") ;
      GXv_int6[0] = GXt_int5 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
      mantenimientoproductosreceta_trn_impl.this.AV7EmprCod = GXv_char4[0] ;
      mantenimientoproductosreceta_trn_impl.this.GXt_int5 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      AV39Factor8 = (short)(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Factor8", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Factor8), 4, 0));
      AV40Factor = (short)(AV39Factor8/ (double) (100)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Factor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Factor), 4, 0));
      AV41MsgErrFactor = httpContext.getMessage( "AVISO.Las cantidades ingresadas superan el estándar.Confirma?", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41MsgErrFactor", AV41MsgErrFactor);
      AV42Conf = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Conf", AV42Conf);
      GXt_int7 = (byte)(AV43Artemalha) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "ARTEMH", ""), GXv_int8) ;
      mantenimientoproductosreceta_trn_impl.this.GXt_int7 = GXv_int8[0] ;
      AV43Artemalha = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Artemalha", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43Artemalha), 4, 0));
      GXt_int7 = (byte)(AV44AvisoPesaje) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "WARPES", ""), GXv_int8) ;
      mantenimientoproductosreceta_trn_impl.this.GXt_int7 = GXv_int8[0] ;
      AV44AvisoPesaje = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44AvisoPesaje", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44AvisoPesaje), 4, 0));
      GXt_int7 = (byte)(DecimalUtil.decToDouble(AV21NoCantidad)) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "NOCTD", ""), GXv_int8) ;
      mantenimientoproductosreceta_trn_impl.this.GXt_int7 = GXv_int8[0] ;
      AV21NoCantidad = DecimalUtil.doubleToDec(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21NoCantidad", GXutil.ltrimstr( AV21NoCantidad, 9, 2));
      AV45msg_err1 = httpContext.getMessage( "Atencion.El codigo de producto, NO se puede modificar", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45msg_err1", AV45msg_err1);
      AV45msg_err1 += httpContext.getMessage( "El procedimiento es:", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45msg_err1", AV45msg_err1);
      AV45msg_err1 += httpContext.getMessage( "Eliminar Linea.", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45msg_err1", AV45msg_err1);
      AV45msg_err1 += httpContext.getMessage( "Añadir Linea.", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45msg_err1", AV45msg_err1);
      GXt_int7 = (byte)(AV46Lote01) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "01LOTE", ""), GXv_int8) ;
      mantenimientoproductosreceta_trn_impl.this.GXt_int7 = GXv_int8[0] ;
      AV46Lote01 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Lote01", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Lote01), 4, 0));
      GXt_int7 = (byte)(AV47EliminarReceta) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "INCI92", ""), GXv_int8) ;
      mantenimientoproductosreceta_trn_impl.this.GXt_int7 = GXv_int8[0] ;
      AV47EliminarReceta = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47EliminarReceta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47EliminarReceta), 4, 0));
      GXt_int7 = (byte)(AV48SiRGB) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "SIPRGB", ""), GXv_int8) ;
      mantenimientoproductosreceta_trn_impl.this.GXt_int7 = GXv_int8[0] ;
      AV48SiRGB = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48SiRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48SiRGB), 4, 0));
      AV29Modo = Gx_mode ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Modo", AV29Modo);
      AV62Totaldekilos = AV27TotKgs ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62Totaldekilos", GXutil.ltrimstr( AV62Totaldekilos, 10, 2));
      AV63TipodeProceso = AV54Proforfab ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TipodeProceso", AV63TipodeProceso);
      AV64VolumenReceta = AV28Volumen ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64VolumenReceta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64VolumenReceta), 5, 0));
      GXt_char1 = AV18Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      mantenimientoproductosreceta_trn_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char2[0] = AV19UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char4, GXv_char3, GXv_char2) ;
      mantenimientoproductosreceta_trn_impl.this.AV7EmprCod = GXv_char4[0] ;
      mantenimientoproductosreceta_trn_impl.this.AV8EmprNom = GXv_char3[0] ;
      mantenimientoproductosreceta_trn_impl.this.AV19UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprNom", AV8EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV19UsurCod", AV19UsurCod);
      GXv_SdtWWPContext9[0] = AV22WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV22WWPContext = GXv_SdtWWPContext9[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = AV81DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11[0] ;
      AV81DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10;
      Combo_recprdnum_Titlecontrolidtoreplace = edtRecPrdNum_Internalname ;
      ucCombo_recprdnum.sendProperty(context, "", false, Combo_recprdnum_Internalname, "TitleControlIdToReplace", Combo_recprdnum_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBORECPRDNUM' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV23TrnContext.fromxml(AV24WebSession.getValue("TrnContext"), null, null);
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
      edtavBarnhdr_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Visible), 5, 0), true);
      edtavReclinmaq_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinmaq_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinmaq_Visible), 5, 0), true);
      edtavReclinpro_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinpro_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinpro_Visible), 5, 0), true);
      edtavValcos_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValcos_Visible), 5, 0), true);
      edtavProforlab_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProforlab_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProforlab_Visible), 5, 0), true);
      imgPrompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_Internalname, "gximage", imgPrompt_gximage, true);
      AV75Prompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75Prompt", AV75Prompt);
      AV83Prompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
   }

   public void e121RG2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      GXv_char4[0] = AV7EmprCod ;
      GXv_int6[0] = AV49BarCod ;
      GXv_int8[0] = AV50BarCodReo ;
      GXv_char3[0] = AV51BarCodPar ;
      GXv_int12[0] = AV14RecLinMaq ;
      new app.pdyrp013(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int8, GXv_char3, GXv_int12) ;
      mantenimientoproductosreceta_trn_impl.this.AV7EmprCod = GXv_char4[0] ;
      mantenimientoproductosreceta_trn_impl.this.AV49BarCod = GXv_int6[0] ;
      mantenimientoproductosreceta_trn_impl.this.AV50BarCodReo = GXv_int8[0] ;
      mantenimientoproductosreceta_trn_impl.this.AV51BarCodPar = GXv_char3[0] ;
      mantenimientoproductosreceta_trn_impl.this.AV14RecLinMaq = GXv_int12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV49BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49BarCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49BarCod), "ZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV50BarCodReo", GXutil.str( AV50BarCodReo, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV50BarCodReo), "9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV51BarCodPar", AV51BarCodPar);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51BarCodPar, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV14RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14RecLinMaq), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14RecLinMaq), "ZZZ9")));
      httpContext.setWebReturnParms(new Object[] {AV69Modif2});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV69Modif2"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'LOADCOMBORECPRDNUM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item13 = AV80RecPrdNum_Data ;
      GXv_char4[0] = AV79ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item14[0] = GXt_objcol_SdtDVB_SDTComboData_Item13 ;
      new app.mantenimientoproductosreceta_trnloaddvcombo(remoteHandle, context).execute( "RecPrdNum", Gx_mode, AV7EmprCod, AV49BarCod, AV50BarCodReo, AV51BarCodPar, AV14RecLinMaq, AV15RecLinPro, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item14) ;
      mantenimientoproductosreceta_trn_impl.this.AV79ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item13 = GXv_objcol_SdtDVB_SDTComboData_Item14[0] ;
      AV80RecPrdNum_Data = GXt_objcol_SdtDVB_SDTComboData_Item13 ;
   }

   public void zm1RG409( int GX_JID )
   {
      if ( ( GX_JID == 95 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -95 )
      {
         Z1273RecLinPro = A1273RecLinPro ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2804RecLinMaq = A2804RecLinMaq ;
      }
   }

   public void standaloneNotModal( )
   {
      AV82Pgmname = "MantenimientoProductosReceta_TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82Pgmname", AV82Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV49BarCod) )
      {
         A129BarCod = AV49BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV49BarCod) )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV49BarCod) )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV50BarCodReo) )
      {
         A132BarCodReo = AV50BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (0==AV50BarCodReo) )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCodReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      if ( ! (0==AV50BarCodReo) )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV51BarCodPar)==0) )
      {
         A130BarCodPar = AV51BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      if ( ! (GXutil.strcmp("", AV51BarCodPar)==0) )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCodPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV51BarCodPar)==0) )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      if ( ! (0==AV14RecLinMaq) )
      {
         A2804RecLinMaq = AV14RecLinMaq ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
      }
      if ( ! (0==AV14RecLinMaq) )
      {
         edtRecLinMaq_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMaq_Enabled), 5, 0), true);
      }
      else
      {
         edtRecLinMaq_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMaq_Enabled), 5, 0), true);
      }
      if ( ! (0==AV14RecLinMaq) )
      {
         edtRecLinMaq_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMaq_Enabled), 5, 0), true);
      }
      if ( ! (0==AV15RecLinPro) )
      {
         A1273RecLinPro = AV15RecLinPro ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
      }
      if ( ! (0==AV15RecLinPro) )
      {
         edtRecLinPro_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinPro_Enabled), 5, 0), true);
      }
      else
      {
         edtRecLinPro_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinPro_Enabled), 5, 0), true);
      }
      if ( ! (0==AV15RecLinPro) )
      {
         edtRecLinPro_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinPro_Enabled), 5, 0), true);
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

   public void load1RG409( )
   {
      /* Using cursor T01RG10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound409 = (short)(1) ;
         zm1RG409( -95) ;
      }
      pr_default.close(8);
      onLoadActions1RG409( ) ;
   }

   public void onLoadActions1RG409( )
   {
   }

   public void checkExtendedTable1RG409( )
   {
      nIsDirty_409 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01RG9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "RECMAQ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECLINMAQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(7);
   }

   public void closeExtendedTableCursors1RG409( )
   {
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_96( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar ,
                          short A2804RecLinMaq )
   {
      /* Using cursor T01RG11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "RECMAQ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECLINMAQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1RG409( )
   {
      /* Using cursor T01RG12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound409 = (short)(1) ;
      }
      else
      {
         RcdFound409 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01RG8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm1RG409( 95) ;
         RcdFound409 = (short)(1) ;
         A1273RecLinPro = T01RG8_A1273RecLinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
         A396EmprCod = T01RG8_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01RG8_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RG8_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RG8_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = T01RG8_A2804RecLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2804RecLinMaq = A2804RecLinMaq ;
         Z1273RecLinPro = A1273RecLinPro ;
         sMode409 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1RG409( ) ;
         if ( AnyError == 1 )
         {
            RcdFound409 = (short)(0) ;
            initializeNonKey1RG409( ) ;
         }
         Gx_mode = sMode409 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound409 = (short)(0) ;
         initializeNonKey1RG409( ) ;
         sMode409 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode409 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1RG409( ) ;
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
      /* Using cursor T01RG13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2804RecLinMaq), Short.valueOf(A2804RecLinMaq), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A1273RecLinPro)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01RG13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RG13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RG13_A129BarCod[0] < A129BarCod ) || ( T01RG13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RG13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RG13_A132BarCodReo[0] < A132BarCodReo ) || ( T01RG13_A132BarCodReo[0] == A132BarCodReo ) && ( T01RG13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RG13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RG13_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01RG13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RG13_A132BarCodReo[0] == A132BarCodReo ) && ( T01RG13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RG13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RG13_A2804RecLinMaq[0] < A2804RecLinMaq ) || ( T01RG13_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01RG13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RG13_A132BarCodReo[0] == A132BarCodReo ) && ( T01RG13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RG13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RG13_A1273RecLinPro[0] < A1273RecLinPro ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01RG13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RG13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RG13_A129BarCod[0] > A129BarCod ) || ( T01RG13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RG13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RG13_A132BarCodReo[0] > A132BarCodReo ) || ( T01RG13_A132BarCodReo[0] == A132BarCodReo ) && ( T01RG13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RG13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RG13_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01RG13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RG13_A132BarCodReo[0] == A132BarCodReo ) && ( T01RG13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RG13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RG13_A2804RecLinMaq[0] > A2804RecLinMaq ) || ( T01RG13_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01RG13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RG13_A132BarCodReo[0] == A132BarCodReo ) && ( T01RG13_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RG13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RG13_A1273RecLinPro[0] > A1273RecLinPro ) ) )
         {
            A396EmprCod = T01RG13_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01RG13_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01RG13_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01RG13_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2804RecLinMaq = T01RG13_A2804RecLinMaq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            A1273RecLinPro = T01RG13_A1273RecLinPro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
            RcdFound409 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound409 = (short)(0) ;
      /* Using cursor T01RG14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2804RecLinMaq), Short.valueOf(A2804RecLinMaq), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A1273RecLinPro)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01RG14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RG14_A129BarCod[0] > A129BarCod ) || ( T01RG14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RG14_A132BarCodReo[0] > A132BarCodReo ) || ( T01RG14_A132BarCodReo[0] == A132BarCodReo ) && ( T01RG14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RG14_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01RG14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RG14_A132BarCodReo[0] == A132BarCodReo ) && ( T01RG14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RG14_A2804RecLinMaq[0] > A2804RecLinMaq ) || ( T01RG14_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01RG14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RG14_A132BarCodReo[0] == A132BarCodReo ) && ( T01RG14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RG14_A1273RecLinPro[0] > A1273RecLinPro ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01RG14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RG14_A129BarCod[0] < A129BarCod ) || ( T01RG14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RG14_A132BarCodReo[0] < A132BarCodReo ) || ( T01RG14_A132BarCodReo[0] == A132BarCodReo ) && ( T01RG14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RG14_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01RG14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RG14_A132BarCodReo[0] == A132BarCodReo ) && ( T01RG14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RG14_A2804RecLinMaq[0] < A2804RecLinMaq ) || ( T01RG14_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01RG14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RG14_A132BarCodReo[0] == A132BarCodReo ) && ( T01RG14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RG14_A1273RecLinPro[0] < A1273RecLinPro ) ) )
         {
            A396EmprCod = T01RG14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01RG14_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01RG14_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01RG14_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2804RecLinMaq = T01RG14_A2804RecLinMaq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            A1273RecLinPro = T01RG14_A1273RecLinPro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
            RcdFound409 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1RG409( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         AV32Modif = OV32Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1RG409( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               AV32Modif = OV32Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               AV32Modif = OV32Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
               update1RG409( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) || ( A1273RecLinPro != Z1273RecLinPro ) )
            {
               /* Insert record */
               AV32Modif = OV32Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1RG409( ) ;
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
                  AV32Modif = OV32Modif ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1RG409( ) ;
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
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         AV32Modif = OV32Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1RG409( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RG7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCRECET"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCRECET"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RG409( )
   {
      beforeValidate1RG409( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RG409( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RG409( 0) ;
         checkOptimisticConcurrency1RG409( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RG409( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RG409( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RG15 */
                  pr_default.execute(13, new Object[] {Byte.valueOf(A1273RecLinPro), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        processLevel1RG409( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1RG0( ) ;
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
            load1RG409( ) ;
         }
         endLevel1RG409( ) ;
      }
      closeExtendedTableCursors1RG409( ) ;
   }

   public void update1RG409( )
   {
      beforeValidate1RG409( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RG409( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RG409( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RG409( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1RG409( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCRECET */
                  deferredUpdate1RG409( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1RG409( ) ;
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
         endLevel1RG409( ) ;
      }
      closeExtendedTableCursors1RG409( ) ;
   }

   public void deferredUpdate1RG409( )
   {
   }

   public void delete( )
   {
      beforeValidate1RG409( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RG409( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RG409( ) ;
         afterConfirm1RG409( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RG409( ) ;
            if ( AnyError == 0 )
            {
               AV32Modif = OV32Modif ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
               scanStart1RG410( ) ;
               while ( RcdFound410 != 0 )
               {
                  getByPrimaryKey1RG410( ) ;
                  delete1RG410( ) ;
                  scanNext1RG410( ) ;
                  OV32Modif = AV32Modif ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
               }
               scanEnd1RG410( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RG16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     if ( true /* After */ )
                     {
                        AV32Modif = httpContext.getMessage( "Y", "") ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
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
      endLevel1RG409( ) ;
      Gx_mode = sMode409 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RG409( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1RG410( )
   {
      sV32Modif = OV32Modif ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
      nGXsfl_51_idx = 0 ;
      while ( nGXsfl_51_idx < nRC_GXsfl_51 )
      {
         readRow1RG410( ) ;
         if ( ( nRcdExists_410 != 0 ) || ( nIsMod_410 != 0 ) )
         {
            standaloneNotModal1RG410( ) ;
            getKey1RG410( ) ;
            if ( ( nRcdExists_410 == 0 ) && ( nRcdDeleted_410 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1RG410( ) ;
            }
            else
            {
               if ( RcdFound410 != 0 )
               {
                  if ( ( nRcdDeleted_410 != 0 ) && ( nRcdExists_410 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1RG410( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_410 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1RG410( ) ;
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
            OV32Modif = AV32Modif ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
         }
         httpContext.changePostValue( edtRecLin_Internalname, GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecPrdNum_Internalname, GXutil.rtrim( A872RecPrdNum)) ;
         httpContext.changePostValue( edtRecPrdDsc_Internalname, GXutil.rtrim( A875RecPrdDsc)) ;
         httpContext.changePostValue( edtFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc)) ;
         httpContext.changePostValue( edtPrdCant_Internalname, GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecManAut_Internalname, GXutil.rtrim( A14055RecManAut)) ;
         httpContext.changePostValue( edtRecLote_Internalname, GXutil.rtrim( A5725RecLote)) ;
         httpContext.changePostValue( edtRecForNro_Internalname, GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecPrdTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCanRes_Internalname, GXutil.ltrim( localUtil.ntoc( A238CanRes, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecPrdFind_Internalname, GXutil.rtrim( A874RecPrdFind)) ;
         httpContext.changePostValue( edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdCanRes_Internalname, GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecCanEns_Internalname, GXutil.ltrim( localUtil.ntoc( A3938RecCanEns, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecMar_Internalname, GXutil.ltrim( localUtil.ntoc( A4024RecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecSalMP_Internalname, GXutil.ltrim( localUtil.ntoc( A5422RecSalMP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( chkPrdSalM.getInternalname(), ((GXutil.strcmp(A5418PrdSalM, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( edtRecSalVol_Internalname, GXutil.ltrim( localUtil.ntoc( A5467RecSalVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecLinRea_Internalname, GXutil.rtrim( A5527RecLinRea)) ;
         httpContext.changePostValue( edtRecPes_Internalname, GXutil.ltrim( localUtil.ntoc( A8934RecPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecAcc_Internalname, GXutil.rtrim( A8937RecAcc)) ;
         httpContext.changePostValue( edtRecFecMov_Internalname, localUtil.format(A3804RecFecMov, "99/99/99")) ;
         httpContext.changePostValue( edtRecAnyTie_Internalname, GXutil.ltrim( localUtil.ntoc( A3805RecAnyTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecUltAny_Internalname, GXutil.ltrim( localUtil.ntoc( A3806RecUltAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecPorAny_Internalname, GXutil.ltrim( localUtil.ntoc( A3807RecPorAny, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdCanMac_Internalname, GXutil.ltrim( localUtil.ntoc( A4900PrdCanMac, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecProv_Internalname, GXutil.ltrim( localUtil.ntoc( A11708RecProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdLote_Internalname, GXutil.rtrim( A10881PrdLote)) ;
         httpContext.changePostValue( edtRecLinUsr_Internalname, GXutil.rtrim( A4576RecLinUsr)) ;
         httpContext.changePostValue( edtRecPesFec_Internalname, localUtil.ttoc( A4577RecPesFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtPrdCantOrg_Internalname, GXutil.ltrim( localUtil.ntoc( A12710PrdCantOrg, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtRecFabId_Internalname, GXutil.ltrim( localUtil.ntoc( A12717RecFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdRGB_Internalname, GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCantProduc_Internalname, GXutil.ltrim( localUtil.ntoc( A13832CantProduc, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtRecPrdDscf_Internalname, GXutil.rtrim( A13897RecPrdDscf)) ;
         httpContext.changePostValue( "ZT_"+"Z811RecLin_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5725RecLote_"+sGXsfl_51_idx, GXutil.rtrim( Z5725RecLote)) ;
         httpContext.changePostValue( "ZT_"+"Z686PrdCant_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z875RecPrdDsc_"+sGXsfl_51_idx, GXutil.rtrim( Z875RecPrdDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z14055RecManAut_"+sGXsfl_51_idx, GXutil.rtrim( Z14055RecManAut)) ;
         httpContext.changePostValue( "ZT_"+"Z872RecPrdNum_"+sGXsfl_51_idx, GXutil.rtrim( Z872RecPrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z431FacCon_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2394RecForNro_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3274RecPrdTnq_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3938RecCanEns_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3938RecCanEns, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4024RecMar_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z4024RecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5422RecSalMP_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z5422RecSalMP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5467RecSalVol_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z5467RecSalVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5527RecLinRea_"+sGXsfl_51_idx, GXutil.rtrim( Z5527RecLinRea)) ;
         httpContext.changePostValue( "ZT_"+"Z8934RecPes_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z8934RecPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8937RecAcc_"+sGXsfl_51_idx, GXutil.rtrim( Z8937RecAcc)) ;
         httpContext.changePostValue( "ZT_"+"Z3804RecFecMov_"+sGXsfl_51_idx, localUtil.dtoc( Z3804RecFecMov, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z3805RecAnyTie_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3805RecAnyTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3806RecUltAny_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3806RecUltAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3807RecPorAny_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z3807RecPorAny, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4900PrdCanMac_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z4900PrdCanMac, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11708RecProv_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z11708RecProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4576RecLinUsr_"+sGXsfl_51_idx, GXutil.rtrim( Z4576RecLinUsr)) ;
         httpContext.changePostValue( "ZT_"+"Z4577RecPesFec_"+sGXsfl_51_idx, localUtil.ttoc( Z4577RecPesFec, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12710PrdCantOrg_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z12710PrdCantOrg, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12717RecFabId_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z12717RecFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13938RecLoteFch_"+sGXsfl_51_idx, localUtil.dtoc( Z13938RecLoteFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z13937RecLotAlm_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z13937RecLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_51_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T14055RecManAut_"+sGXsfl_51_idx, GXutil.rtrim( O14055RecManAut)) ;
         httpContext.changePostValue( "T5725RecLote_"+sGXsfl_51_idx, GXutil.rtrim( O5725RecLote)) ;
         httpContext.changePostValue( "T431FacCon_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T686PrdCant_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T238CanRes_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O238CanRes, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2394RecForNro_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( O2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_410_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_410, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_410_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_410, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_410_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_410, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N5725RecLote_"+sGXsfl_51_idx, GXutil.rtrim( A5725RecLote)) ;
         httpContext.changePostValue( "N686PrdCant_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N14055RecManAut_"+sGXsfl_51_idx, GXutil.rtrim( A14055RecManAut)) ;
         if ( nIsMod_410 != 0 )
         {
            httpContext.changePostValue( "RECLIN_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecLin_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECLIN_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDNUM_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdNum_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDNUM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDDSC_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDDSC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACCON_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtFacCon_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACCON_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDDSC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANT_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtPrdCant_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANT_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECMANAUT_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecManAut_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECLOTE_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECFORNRO_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecForNro_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECFORNRO_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecForNro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDTNQ_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdTnq_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDTNQ_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdTnq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CANRES_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCanRes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXICC_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXICC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDFIND_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdFind_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXIALM_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDEXIALM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANRES_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANRES_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECCANENS_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecCanEns_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECMAR_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecMar_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECMAR_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecMar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECSALMP_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecSalMP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDSALM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkPrdSalM.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECSALVOL_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecSalVol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECLINREA_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLinRea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPES_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECACC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecAcc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECFECMOV_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecFecMov_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECANYTIE_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecAnyTie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECULTANY_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecUltAny_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPORANY_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPorAny_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANMAC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanMac_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPROV_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecProv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDLOTE_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdLote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECLINUSR_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLinUsr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPESFEC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPesFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCANTORG_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCantOrg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECFABID_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecFabId_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDRGB_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdRGB_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CANTPRODUC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCantProduc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "RECPRDDSCF_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdDscf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1RG410( ) ;
      if ( AnyError != 0 )
      {
         OV32Modif = sV32Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
      }
      nRcdExists_410 = (short)(0) ;
      nIsMod_410 = (short)(0) ;
      nRcdDeleted_410 = (short)(0) ;
   }

   public void processLevel1RG409( )
   {
      /* Save parent mode. */
      sMode409 = Gx_mode ;
      processNestedLevel1RG410( ) ;
      if ( AnyError != 0 )
      {
         OV32Modif = sV32Modif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
      }
      /* Restore parent mode. */
      Gx_mode = sMode409 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1RG409( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1RG409( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientoproductosreceta_trn");
         if ( AnyError == 0 )
         {
            confirmValues1RG0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "mantenimientoproductosreceta_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RG409( )
   {
      /* Scan By routine */
      /* Using cursor T01RG17 */
      pr_default.execute(15);
      RcdFound409 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound409 = (short)(1) ;
         A396EmprCod = T01RG17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01RG17_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RG17_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RG17_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = T01RG17_A2804RecLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         A1273RecLinPro = T01RG17_A1273RecLinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RG409( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound409 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound409 = (short)(1) ;
         A396EmprCod = T01RG17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01RG17_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RG17_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RG17_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = T01RG17_A2804RecLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         A1273RecLinPro = T01RG17_A1273RecLinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
      }
   }

   public void scanEnd1RG409( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1RG409( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1RG409( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RG409( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RG409( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RG409( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RG409( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RG409( )
   {
      edtavProfordsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProfordsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProfordsc_Enabled), 5, 0), true);
      edtavTotaldekilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotaldekilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotaldekilos_Enabled), 5, 0), true);
      edtavVolumenreceta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVolumenreceta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVolumenreceta_Enabled), 5, 0), true);
      edtavTipodeproceso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipodeproceso_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipodeproceso_Enabled), 5, 0), true);
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
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavReclinmaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinmaq_Enabled), 5, 0), true);
      edtavReclinpro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinpro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinpro_Enabled), 5, 0), true);
      edtavValcos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValcos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValcos_Enabled), 5, 0), true);
   }

   public void zm1RG410( int GX_JID )
   {
      if ( ( GX_JID == 97 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5725RecLote = T01RG3_A5725RecLote[0] ;
            Z686PrdCant = T01RG3_A686PrdCant[0] ;
            Z875RecPrdDsc = T01RG3_A875RecPrdDsc[0] ;
            Z14055RecManAut = T01RG3_A14055RecManAut[0] ;
            Z872RecPrdNum = T01RG3_A872RecPrdNum[0] ;
            Z431FacCon = T01RG3_A431FacCon[0] ;
            Z2394RecForNro = T01RG3_A2394RecForNro[0] ;
            Z3274RecPrdTnq = T01RG3_A3274RecPrdTnq[0] ;
            Z3938RecCanEns = T01RG3_A3938RecCanEns[0] ;
            Z4024RecMar = T01RG3_A4024RecMar[0] ;
            Z5422RecSalMP = T01RG3_A5422RecSalMP[0] ;
            Z5467RecSalVol = T01RG3_A5467RecSalVol[0] ;
            Z5527RecLinRea = T01RG3_A5527RecLinRea[0] ;
            Z8934RecPes = T01RG3_A8934RecPes[0] ;
            Z8937RecAcc = T01RG3_A8937RecAcc[0] ;
            Z3804RecFecMov = T01RG3_A3804RecFecMov[0] ;
            Z3805RecAnyTie = T01RG3_A3805RecAnyTie[0] ;
            Z3806RecUltAny = T01RG3_A3806RecUltAny[0] ;
            Z3807RecPorAny = T01RG3_A3807RecPorAny[0] ;
            Z4900PrdCanMac = T01RG3_A4900PrdCanMac[0] ;
            Z11708RecProv = T01RG3_A11708RecProv[0] ;
            Z4576RecLinUsr = T01RG3_A4576RecLinUsr[0] ;
            Z4577RecPesFec = T01RG3_A4577RecPesFec[0] ;
            Z12710PrdCantOrg = T01RG3_A12710PrdCantOrg[0] ;
            Z12717RecFabId = T01RG3_A12717RecFabId[0] ;
            Z13938RecLoteFch = T01RG3_A13938RecLoteFch[0] ;
            Z13937RecLotAlm = T01RG3_A13937RecLotAlm[0] ;
            Z719PrdNum = T01RG3_A719PrdNum[0] ;
            Z490ForPrdUMe = T01RG3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z5725RecLote = A5725RecLote ;
            Z686PrdCant = A686PrdCant ;
            Z875RecPrdDsc = A875RecPrdDsc ;
            Z14055RecManAut = A14055RecManAut ;
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
            Z13938RecLoteFch = A13938RecLoteFch ;
            Z13937RecLotAlm = A13937RecLotAlm ;
            Z719PrdNum = A719PrdNum ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -97 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2804RecLinMaq = A2804RecLinMaq ;
         Z1273RecLinPro = A1273RecLinPro ;
         Z811RecLin = A811RecLin ;
         Z5725RecLote = A5725RecLote ;
         Z686PrdCant = A686PrdCant ;
         Z875RecPrdDsc = A875RecPrdDsc ;
         Z14055RecManAut = A14055RecManAut ;
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
         Z13938RecLoteFch = A13938RecLoteFch ;
         Z13937RecLotAlm = A13937RecLotAlm ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z685PrdCanRes = A685PrdCanRes ;
         Z5418PrdSalM = A5418PrdSalM ;
         Z10881PrdLote = A10881PrdLote ;
         Z13232PrdRGB = A13232PrdRGB ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z4338PrdUMeFo = A4338PrdUMeFo ;
         Z707PrdFacCon = A707PrdFacCon ;
         Z856ValCod = A856ValCod ;
         Z874RecPrdFind = A874RecPrdFind ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal1RG410( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecLinUsr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinUsr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinUsr_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPesFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPesFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPesFec_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtCanRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCanRes_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdExiCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPrdFind_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdFind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdFind_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdCanRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecCanEns_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecCanEns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecCanEns_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecMar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMar_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecSalMP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecSalMP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecSalMP_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      chkPrdSalM.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdSalM.getInternalname(), "Enabled", GXutil.ltrimstr( chkPrdSalM.getEnabled(), 5, 0), !bGXsfl_51_Refreshing);
      edtRecSalVol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecSalVol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecSalVol_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecLinRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinRea_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPes_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecAcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecAcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecAcc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecFecMov_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFecMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFecMov_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecAnyTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecAnyTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecAnyTie_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecUltAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecUltAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecUltAny_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPorAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPorAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPorAny_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdCanMac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanMac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanMac_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecProv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecProv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecProv_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLote_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdCantOrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCantOrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCantOrg_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecFabId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFabId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFabId_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdRGB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRGB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRGB_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtCantProduc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCantProduc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCantProduc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPrdDscf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDscf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDscf_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      if ( true )
      {
         edtRecLote_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLote_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      }
      else
      {
         if ( (0==AV43Artemalha) )
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
      if ( ( AV21NoCantidad.doubleValue() == 1 ) || ( AV37Moda21 == 1 ) )
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

   public void standaloneModal1RG410( )
   {
      if ( A4024RecMar == 1 )
      {
         edtRecLin_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLin_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLin_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      }
      if ( A4024RecMar == 1 )
      {
         edtForPrdUMe_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      }
      if ( A4024RecMar == 1 )
      {
         edtPrdCant_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      }
      if ( A4024RecMar == 1 )
      {
         edtRecPrdDsc_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDsc_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDsc_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      }
      if ( A4024RecMar == 1 )
      {
         edtRecPrdNum_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecPrdNum_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdNum_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      }
      if ( A4024RecMar == 1 )
      {
         edtForPrdDsc_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      }
      if ( A4024RecMar == 1 )
      {
         edtFacCon_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacCon_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCon_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      }
      if ( A4024RecMar == 1 )
      {
         edtRecForNro_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecForNro_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecForNro_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      }
      if ( A4024RecMar == 1 )
      {
         edtRecPrdTnq_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecPrdTnq_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdTnq_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      }
      if ( A4024RecMar == 1 )
      {
         edtPrdExiAlm_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      }
      if ( A4024RecMar == 1 )
      {
         edtPrdCanRes_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      }
      if ( A4024RecMar == 1 )
      {
         edtRecMar_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecMar_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMar_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      }
      if ( A4024RecMar == 1 )
      {
         edtPrdExiCC_Forecolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
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

   public void load1RG410( )
   {
      /* Using cursor T01RG18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound410 = (short)(1) ;
         A5725RecLote = T01RG18_A5725RecLote[0] ;
         A686PrdCant = T01RG18_A686PrdCant[0] ;
         A875RecPrdDsc = T01RG18_A875RecPrdDsc[0] ;
         A14055RecManAut = T01RG18_A14055RecManAut[0] ;
         A872RecPrdNum = T01RG18_A872RecPrdNum[0] ;
         A488ForPrdDsc = T01RG18_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01RG18_n488ForPrdDsc[0] ;
         A431FacCon = T01RG18_A431FacCon[0] ;
         A2394RecForNro = T01RG18_A2394RecForNro[0] ;
         A3274RecPrdTnq = T01RG18_A3274RecPrdTnq[0] ;
         A704PrdExiAlm = T01RG18_A704PrdExiAlm[0] ;
         A685PrdCanRes = T01RG18_A685PrdCanRes[0] ;
         A3938RecCanEns = T01RG18_A3938RecCanEns[0] ;
         A4024RecMar = T01RG18_A4024RecMar[0] ;
         A5422RecSalMP = T01RG18_A5422RecSalMP[0] ;
         A5418PrdSalM = T01RG18_A5418PrdSalM[0] ;
         A5467RecSalVol = T01RG18_A5467RecSalVol[0] ;
         A5527RecLinRea = T01RG18_A5527RecLinRea[0] ;
         A8934RecPes = T01RG18_A8934RecPes[0] ;
         A8937RecAcc = T01RG18_A8937RecAcc[0] ;
         A3804RecFecMov = T01RG18_A3804RecFecMov[0] ;
         A3805RecAnyTie = T01RG18_A3805RecAnyTie[0] ;
         A3806RecUltAny = T01RG18_A3806RecUltAny[0] ;
         A3807RecPorAny = T01RG18_A3807RecPorAny[0] ;
         A4900PrdCanMac = T01RG18_A4900PrdCanMac[0] ;
         A11708RecProv = T01RG18_A11708RecProv[0] ;
         A10881PrdLote = T01RG18_A10881PrdLote[0] ;
         A4576RecLinUsr = T01RG18_A4576RecLinUsr[0] ;
         A4577RecPesFec = T01RG18_A4577RecPesFec[0] ;
         A12710PrdCantOrg = T01RG18_A12710PrdCantOrg[0] ;
         A12717RecFabId = T01RG18_A12717RecFabId[0] ;
         A13232PrdRGB = T01RG18_A13232PrdRGB[0] ;
         A705PrdExiCC = T01RG18_A705PrdExiCC[0] ;
         A13938RecLoteFch = T01RG18_A13938RecLoteFch[0] ;
         A13937RecLotAlm = T01RG18_A13937RecLotAlm[0] ;
         A4338PrdUMeFo = T01RG18_A4338PrdUMeFo[0] ;
         A707PrdFacCon = T01RG18_A707PrdFacCon[0] ;
         A719PrdNum = T01RG18_A719PrdNum[0] ;
         n719PrdNum = T01RG18_n719PrdNum[0] ;
         A490ForPrdUMe = T01RG18_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T01RG18_n490ForPrdUMe[0] ;
         A856ValCod = T01RG18_A856ValCod[0] ;
         A874RecPrdFind = T01RG18_A874RecPrdFind[0] ;
         n874RecPrdFind = T01RG18_n874RecPrdFind[0] ;
         zm1RG410( -97) ;
      }
      pr_default.close(16);
      onLoadActions1RG410( ) ;
   }

   public void onLoadActions1RG410( )
   {
      if ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 )
      {
         GXt_char1 = A13897RecPrdDscf ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         mantenimientoproductosreceta_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         mantenimientoproductosreceta_trn_impl.this.A872RecPrdNum = GXv_char3[0] ;
         mantenimientoproductosreceta_trn_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13897RecPrdDscf = GXt_char1 ;
      }
      else
      {
         A13897RecPrdDscf = "" ;
      }
      if ( isIns( )  && true /* After */ && (0==A490ForPrdUMe) )
      {
         A490ForPrdUMe = A4338PrdUMeFo ;
         n490ForPrdUMe = false ;
      }
      if ( true /* After */ && ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 ) && isIns( )  )
      {
         A875RecPrdDsc = A13897RecPrdDscf ;
      }
      if ( true /* After */ && ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 ) && isIns( )  )
      {
         A719PrdNum = A872RecPrdNum ;
         n719PrdNum = false ;
      }
      if ( (GXutil.strcmp("", A872RecPrdNum)==0) )
      {
         edtRecManAut_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecManAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecManAut_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      }
      else
      {
         if ( ( GXutil.strcmp(A872RecPrdNum, "100000") < 0 ) && ( GXutil.strcmp(A872RecPrdNum, "999999") > 0 ) )
         {
            edtRecManAut_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecManAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecManAut_Enabled), 5, 0), !bGXsfl_51_Refreshing);
         }
         else
         {
            edtRecManAut_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecManAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecManAut_Enabled), 5, 0), !bGXsfl_51_Refreshing);
         }
      }
      if ( ( ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) ) && ( GXutil.strcmp(AV63TipodeProceso, "*") != 0 ) && ( isIns( )  || isUpd( )  ) && ( A431FacCon.doubleValue() > 0 ) )
      {
         A686PrdCant = (A431FacCon.multiply(DecimalUtil.doubleToDec(AV64VolumenReceta))) ;
      }
      else
      {
         if ( ( A490ForPrdUMe == 3 ) && ( GXutil.strcmp(AV63TipodeProceso, "*") != 0 ) && ( isIns( )  || isUpd( )  ) && ( A431FacCon.doubleValue() > 0 ) )
         {
            A686PrdCant = AV62Totaldekilos.multiply(A431FacCon).multiply(DecimalUtil.doubleToDec(AV30Valcos)) ;
         }
      }
      if ( ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) || ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) || ( A2394RecForNro != O2394RecForNro ) )
      {
         AV32Modif = httpContext.getMessage( "Y", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
      }
      A238CanRes = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      O238CanRes = A238CanRes ;
      AV74CanResold = (short)(DecimalUtil.decToDouble(O238CanRes)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74CanResold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74CanResold), 4, 0));
      AV61Cantold = O686PrdCant ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Cantold", GXutil.ltrimstr( AV61Cantold, 11, 3));
      AV77RecManAutold = O14055RecManAut ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77RecManAutold", AV77RecManAutold);
      if ( isIns( )  && (GXutil.strcmp("", A5725RecLote)==0) && ( AV46Lote01 == 1 ) )
      {
         A5725RecLote = A10881PrdLote ;
      }
      AV71oldRecLote = O5725RecLote ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71oldRecLote", AV71oldRecLote);
      A13832CantProduc = (A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
   }

   public void checkExtendedTable1RG410( )
   {
      nIsDirty_410 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1RG410( ) ;
      /* Using cursor T01RG6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A872RecPrdNum});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A874RecPrdFind = T01RG6_A874RecPrdFind[0] ;
         n874RecPrdFind = T01RG6_n874RecPrdFind[0] ;
      }
      else
      {
         nIsDirty_410 = (short)(1) ;
         A874RecPrdFind = "xxxxxx" ;
         n874RecPrdFind = false ;
      }
      pr_default.close(4);
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
         mantenimientoproductosreceta_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         mantenimientoproductosreceta_trn_impl.this.A872RecPrdNum = GXv_char3[0] ;
         mantenimientoproductosreceta_trn_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13897RecPrdDscf = GXt_char1 ;
      }
      else
      {
         nIsDirty_410 = (short)(1) ;
         A13897RecPrdDscf = "" ;
      }
      if ( isIns( )  && (0==A811RecLin) )
      {
         GXCCtl = "RECLIN_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se debe de entrar Numero Linea", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && true /* After */ && (0==A490ForPrdUMe) )
      {
         nIsDirty_410 = (short)(1) ;
         A490ForPrdUMe = A4338PrdUMeFo ;
         n490ForPrdUMe = false ;
      }
      if ( true /* After */ && ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 ) && isIns( )  )
      {
         nIsDirty_410 = (short)(1) ;
         A875RecPrdDsc = A13897RecPrdDscf ;
      }
      if ( true /* After */ && ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 ) && isIns( )  )
      {
         nIsDirty_410 = (short)(1) ;
         A719PrdNum = A872RecPrdNum ;
         n719PrdNum = false ;
      }
      if ( (GXutil.strcmp("", A872RecPrdNum)==0) )
      {
         edtRecManAut_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecManAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecManAut_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      }
      else
      {
         if ( ( GXutil.strcmp(A872RecPrdNum, "100000") < 0 ) && ( GXutil.strcmp(A872RecPrdNum, "999999") > 0 ) )
         {
            edtRecManAut_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecManAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecManAut_Enabled), 5, 0), !bGXsfl_51_Refreshing);
         }
         else
         {
            edtRecManAut_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecManAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecManAut_Enabled), 5, 0), !bGXsfl_51_Refreshing);
         }
      }
      if ( (GXutil.strcmp("", A872RecPrdNum)==0) && ( A490ForPrdUMe > 0 ) )
      {
         GXCCtl = "RECPRDNUM_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO. NO hay PRODUCTO", ""), 0, GXCCtl);
      }
      /* Using cursor T01RG5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(3) == 101) )
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
      A488ForPrdDsc = T01RG5_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01RG5_n488ForPrdDsc[0] ;
      pr_default.close(3);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) || (0==A490ForPrdUMe) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) ) && ( GXutil.strcmp(AV63TipodeProceso, "*") != 0 ) && ( isIns( )  || isUpd( )  ) && ( A431FacCon.doubleValue() > 0 ) )
      {
         nIsDirty_410 = (short)(1) ;
         A686PrdCant = (A431FacCon.multiply(DecimalUtil.doubleToDec(AV64VolumenReceta))) ;
      }
      else
      {
         if ( ( A490ForPrdUMe == 3 ) && ( GXutil.strcmp(AV63TipodeProceso, "*") != 0 ) && ( isIns( )  || isUpd( )  ) && ( A431FacCon.doubleValue() > 0 ) )
         {
            nIsDirty_410 = (short)(1) ;
            A686PrdCant = AV62Totaldekilos.multiply(A431FacCon).multiply(DecimalUtil.doubleToDec(AV30Valcos)) ;
         }
      }
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") <= 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ && ( AV35Err_und == 1 ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion no ha entrado UNIDAD=1,2,3", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A431FacCon.doubleValue() > 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO. NO hay PRODUCTO. Hay Factor, pero NO ha entrado UNIDAD=1,2,3", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") <= 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ && ( AV35Err_und == 0 ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion no ha entrado UNIDAD=1,2,3", ""), 0, GXCCtl);
      }
      if ( ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) || ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) || ( A2394RecForNro != O2394RecForNro ) )
      {
         AV32Modif = httpContext.getMessage( "Y", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
      }
      nIsDirty_410 = (short)(1) ;
      A238CanRes = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      AV74CanResold = (short)(DecimalUtil.decToDouble(O238CanRes)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74CanResold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74CanResold), 4, 0));
      AV61Cantold = O686PrdCant ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Cantold", GXutil.ltrimstr( AV61Cantold, 11, 3));
      if ( true /* After */ && isIns( )  )
      {
         GXv_decimal15[0] = A686PrdCant ;
         GXv_char4[0] = A14055RecManAut ;
         new app.pdyrp036(remoteHandle, context).execute( A396EmprCod, A872RecPrdNum, GXv_decimal15, GXv_char4) ;
         mantenimientoproductosreceta_trn_impl.this.A686PrdCant = GXv_decimal15[0] ;
         mantenimientoproductosreceta_trn_impl.this.A14055RecManAut = GXv_char4[0] ;
      }
      AV77RecManAutold = O14055RecManAut ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77RecManAutold", AV77RecManAutold);
      if ( ! ( ( GXutil.strcmp(A14055RecManAut, "M") == 0 ) || ( GXutil.strcmp(A14055RecManAut, "A") == 0 ) ) && true /* After */ && ! (GXutil.strcmp("", A872RecPrdNum)==0) )
      {
         GXCCtl = "RECMANAUT_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "El valor permitido es M(manual) o A(automatico)", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecManAut_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01RG4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            GXCCtl = "PRDNUM_" + sGXsfl_51_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A704PrdExiAlm = T01RG4_A704PrdExiAlm[0] ;
      A685PrdCanRes = T01RG4_A685PrdCanRes[0] ;
      A5418PrdSalM = T01RG4_A5418PrdSalM[0] ;
      A10881PrdLote = T01RG4_A10881PrdLote[0] ;
      A13232PrdRGB = T01RG4_A13232PrdRGB[0] ;
      A705PrdExiCC = T01RG4_A705PrdExiCC[0] ;
      A4338PrdUMeFo = T01RG4_A4338PrdUMeFo[0] ;
      A707PrdFacCon = T01RG4_A707PrdFacCon[0] ;
      A856ValCod = T01RG4_A856ValCod[0] ;
      pr_default.close(2);
      if ( isIns( )  && (GXutil.strcmp("", A5725RecLote)==0) && ( AV46Lote01 == 1 ) )
      {
         nIsDirty_410 = (short)(1) ;
         A5725RecLote = A10881PrdLote ;
      }
      AV71oldRecLote = O5725RecLote ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71oldRecLote", AV71oldRecLote);
      nIsDirty_410 = (short)(1) ;
      A13832CantProduc = (A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      if ( ( A856ValCod == 3 ) && ( ! (GXutil.strcmp("", A719PrdNum)==0) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto no valido", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1RG410( )
   {
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
   }

   public void enableDisable1RG410( )
   {
   }

   public void gxload_100( String A396EmprCod ,
                           String A872RecPrdNum )
   {
      /* Using cursor T01RG19 */
      pr_default.execute(17, new Object[] {A396EmprCod, A872RecPrdNum});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A874RecPrdFind = T01RG19_A874RecPrdFind[0] ;
         n874RecPrdFind = T01RG19_n874RecPrdFind[0] ;
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
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_99( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T01RG20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(18) == 101) )
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
      A488ForPrdDsc = T01RG20_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01RG20_n488ForPrdDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_98( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01RG21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(19) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            GXCCtl = "PRDNUM_" + sGXsfl_51_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A704PrdExiAlm = T01RG21_A704PrdExiAlm[0] ;
      A685PrdCanRes = T01RG21_A685PrdCanRes[0] ;
      A5418PrdSalM = T01RG21_A5418PrdSalM[0] ;
      A10881PrdLote = T01RG21_A10881PrdLote[0] ;
      A13232PrdRGB = T01RG21_A13232PrdRGB[0] ;
      A705PrdExiCC = T01RG21_A705PrdExiCC[0] ;
      A4338PrdUMeFo = T01RG21_A4338PrdUMeFo[0] ;
      A707PrdFacCon = T01RG21_A707PrdFacCon[0] ;
      A856ValCod = T01RG21_A856ValCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5418PrdSalM))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10881PrdLote))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void getKey1RG410( )
   {
      /* Using cursor T01RG22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound410 = (short)(1) ;
      }
      else
      {
         RcdFound410 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey1RG410( )
   {
      /* Using cursor T01RG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1RG410( 97) ;
         RcdFound410 = (short)(1) ;
         initializeNonKey1RG410( ) ;
         A811RecLin = T01RG3_A811RecLin[0] ;
         A5725RecLote = T01RG3_A5725RecLote[0] ;
         A686PrdCant = T01RG3_A686PrdCant[0] ;
         A875RecPrdDsc = T01RG3_A875RecPrdDsc[0] ;
         A14055RecManAut = T01RG3_A14055RecManAut[0] ;
         A872RecPrdNum = T01RG3_A872RecPrdNum[0] ;
         A431FacCon = T01RG3_A431FacCon[0] ;
         A2394RecForNro = T01RG3_A2394RecForNro[0] ;
         A3274RecPrdTnq = T01RG3_A3274RecPrdTnq[0] ;
         A3938RecCanEns = T01RG3_A3938RecCanEns[0] ;
         A4024RecMar = T01RG3_A4024RecMar[0] ;
         A5422RecSalMP = T01RG3_A5422RecSalMP[0] ;
         A5467RecSalVol = T01RG3_A5467RecSalVol[0] ;
         A5527RecLinRea = T01RG3_A5527RecLinRea[0] ;
         A8934RecPes = T01RG3_A8934RecPes[0] ;
         A8937RecAcc = T01RG3_A8937RecAcc[0] ;
         A3804RecFecMov = T01RG3_A3804RecFecMov[0] ;
         A3805RecAnyTie = T01RG3_A3805RecAnyTie[0] ;
         A3806RecUltAny = T01RG3_A3806RecUltAny[0] ;
         A3807RecPorAny = T01RG3_A3807RecPorAny[0] ;
         A4900PrdCanMac = T01RG3_A4900PrdCanMac[0] ;
         A11708RecProv = T01RG3_A11708RecProv[0] ;
         A4576RecLinUsr = T01RG3_A4576RecLinUsr[0] ;
         A4577RecPesFec = T01RG3_A4577RecPesFec[0] ;
         A12710PrdCantOrg = T01RG3_A12710PrdCantOrg[0] ;
         A12717RecFabId = T01RG3_A12717RecFabId[0] ;
         A13938RecLoteFch = T01RG3_A13938RecLoteFch[0] ;
         A13937RecLotAlm = T01RG3_A13937RecLotAlm[0] ;
         A719PrdNum = T01RG3_A719PrdNum[0] ;
         n719PrdNum = T01RG3_n719PrdNum[0] ;
         A490ForPrdUMe = T01RG3_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T01RG3_n490ForPrdUMe[0] ;
         O14055RecManAut = A14055RecManAut ;
         O5725RecLote = A5725RecLote ;
         O431FacCon = A431FacCon ;
         O686PrdCant = A686PrdCant ;
         O2394RecForNro = A2394RecForNro ;
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
         load1RG410( ) ;
         Gx_mode = sMode410 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound410 = (short)(0) ;
         initializeNonKey1RG410( ) ;
         sMode410 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1RG410( ) ;
         Gx_mode = sMode410 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1RG410( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1RG410( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RG2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLRECET"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z5725RecLote, T01RG2_A5725RecLote[0]) != 0 ) || ( DecimalUtil.compareTo(Z686PrdCant, T01RG2_A686PrdCant[0]) != 0 ) || ( GXutil.strcmp(Z875RecPrdDsc, T01RG2_A875RecPrdDsc[0]) != 0 ) || ( GXutil.strcmp(Z14055RecManAut, T01RG2_A14055RecManAut[0]) != 0 ) || ( GXutil.strcmp(Z872RecPrdNum, T01RG2_A872RecPrdNum[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z431FacCon, T01RG2_A431FacCon[0]) != 0 ) || ( Z2394RecForNro != T01RG2_A2394RecForNro[0] ) || ( Z3274RecPrdTnq != T01RG2_A3274RecPrdTnq[0] ) || ( DecimalUtil.compareTo(Z3938RecCanEns, T01RG2_A3938RecCanEns[0]) != 0 ) || ( Z4024RecMar != T01RG2_A4024RecMar[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5422RecSalMP != T01RG2_A5422RecSalMP[0] ) || ( Z5467RecSalVol != T01RG2_A5467RecSalVol[0] ) || ( GXutil.strcmp(Z5527RecLinRea, T01RG2_A5527RecLinRea[0]) != 0 ) || ( Z8934RecPes != T01RG2_A8934RecPes[0] ) || ( GXutil.strcmp(Z8937RecAcc, T01RG2_A8937RecAcc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z3804RecFecMov), GXutil.resetTime(T01RG2_A3804RecFecMov[0])) ) || ( Z3805RecAnyTie != T01RG2_A3805RecAnyTie[0] ) || ( DecimalUtil.compareTo(Z3806RecUltAny, T01RG2_A3806RecUltAny[0]) != 0 ) || ( DecimalUtil.compareTo(Z3807RecPorAny, T01RG2_A3807RecPorAny[0]) != 0 ) || ( DecimalUtil.compareTo(Z4900PrdCanMac, T01RG2_A4900PrdCanMac[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z11708RecProv != T01RG2_A11708RecProv[0] ) || ( GXutil.strcmp(Z4576RecLinUsr, T01RG2_A4576RecLinUsr[0]) != 0 ) || !( GXutil.dateCompare(Z4577RecPesFec, T01RG2_A4577RecPesFec[0]) ) || ( DecimalUtil.compareTo(Z12710PrdCantOrg, T01RG2_A12710PrdCantOrg[0]) != 0 ) || ( Z12717RecFabId != T01RG2_A12717RecFabId[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z13938RecLoteFch), GXutil.resetTime(T01RG2_A13938RecLoteFch[0])) ) || ( Z13937RecLotAlm != T01RG2_A13937RecLotAlm[0] ) || ( GXutil.strcmp(Z719PrdNum, T01RG2_A719PrdNum[0]) != 0 ) || ( Z490ForPrdUMe != T01RG2_A490ForPrdUMe[0] ) )
         {
            if ( GXutil.strcmp(Z5725RecLote, T01RG2_A5725RecLote[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecLote");
               GXutil.writeLogRaw("Old: ",Z5725RecLote);
               GXutil.writeLogRaw("Current: ",T01RG2_A5725RecLote[0]);
            }
            if ( DecimalUtil.compareTo(Z686PrdCant, T01RG2_A686PrdCant[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"PrdCant");
               GXutil.writeLogRaw("Old: ",Z686PrdCant);
               GXutil.writeLogRaw("Current: ",T01RG2_A686PrdCant[0]);
            }
            if ( GXutil.strcmp(Z875RecPrdDsc, T01RG2_A875RecPrdDsc[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecPrdDsc");
               GXutil.writeLogRaw("Old: ",Z875RecPrdDsc);
               GXutil.writeLogRaw("Current: ",T01RG2_A875RecPrdDsc[0]);
            }
            if ( GXutil.strcmp(Z14055RecManAut, T01RG2_A14055RecManAut[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecManAut");
               GXutil.writeLogRaw("Old: ",Z14055RecManAut);
               GXutil.writeLogRaw("Current: ",T01RG2_A14055RecManAut[0]);
            }
            if ( GXutil.strcmp(Z872RecPrdNum, T01RG2_A872RecPrdNum[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecPrdNum");
               GXutil.writeLogRaw("Old: ",Z872RecPrdNum);
               GXutil.writeLogRaw("Current: ",T01RG2_A872RecPrdNum[0]);
            }
            if ( DecimalUtil.compareTo(Z431FacCon, T01RG2_A431FacCon[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"FacCon");
               GXutil.writeLogRaw("Old: ",Z431FacCon);
               GXutil.writeLogRaw("Current: ",T01RG2_A431FacCon[0]);
            }
            if ( Z2394RecForNro != T01RG2_A2394RecForNro[0] )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecForNro");
               GXutil.writeLogRaw("Old: ",Z2394RecForNro);
               GXutil.writeLogRaw("Current: ",T01RG2_A2394RecForNro[0]);
            }
            if ( Z3274RecPrdTnq != T01RG2_A3274RecPrdTnq[0] )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecPrdTnq");
               GXutil.writeLogRaw("Old: ",Z3274RecPrdTnq);
               GXutil.writeLogRaw("Current: ",T01RG2_A3274RecPrdTnq[0]);
            }
            if ( DecimalUtil.compareTo(Z3938RecCanEns, T01RG2_A3938RecCanEns[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecCanEns");
               GXutil.writeLogRaw("Old: ",Z3938RecCanEns);
               GXutil.writeLogRaw("Current: ",T01RG2_A3938RecCanEns[0]);
            }
            if ( Z4024RecMar != T01RG2_A4024RecMar[0] )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecMar");
               GXutil.writeLogRaw("Old: ",Z4024RecMar);
               GXutil.writeLogRaw("Current: ",T01RG2_A4024RecMar[0]);
            }
            if ( Z5422RecSalMP != T01RG2_A5422RecSalMP[0] )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecSalMP");
               GXutil.writeLogRaw("Old: ",Z5422RecSalMP);
               GXutil.writeLogRaw("Current: ",T01RG2_A5422RecSalMP[0]);
            }
            if ( Z5467RecSalVol != T01RG2_A5467RecSalVol[0] )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecSalVol");
               GXutil.writeLogRaw("Old: ",Z5467RecSalVol);
               GXutil.writeLogRaw("Current: ",T01RG2_A5467RecSalVol[0]);
            }
            if ( GXutil.strcmp(Z5527RecLinRea, T01RG2_A5527RecLinRea[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecLinRea");
               GXutil.writeLogRaw("Old: ",Z5527RecLinRea);
               GXutil.writeLogRaw("Current: ",T01RG2_A5527RecLinRea[0]);
            }
            if ( Z8934RecPes != T01RG2_A8934RecPes[0] )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecPes");
               GXutil.writeLogRaw("Old: ",Z8934RecPes);
               GXutil.writeLogRaw("Current: ",T01RG2_A8934RecPes[0]);
            }
            if ( GXutil.strcmp(Z8937RecAcc, T01RG2_A8937RecAcc[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecAcc");
               GXutil.writeLogRaw("Old: ",Z8937RecAcc);
               GXutil.writeLogRaw("Current: ",T01RG2_A8937RecAcc[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3804RecFecMov), GXutil.resetTime(T01RG2_A3804RecFecMov[0])) ) )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecFecMov");
               GXutil.writeLogRaw("Old: ",Z3804RecFecMov);
               GXutil.writeLogRaw("Current: ",T01RG2_A3804RecFecMov[0]);
            }
            if ( Z3805RecAnyTie != T01RG2_A3805RecAnyTie[0] )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecAnyTie");
               GXutil.writeLogRaw("Old: ",Z3805RecAnyTie);
               GXutil.writeLogRaw("Current: ",T01RG2_A3805RecAnyTie[0]);
            }
            if ( DecimalUtil.compareTo(Z3806RecUltAny, T01RG2_A3806RecUltAny[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecUltAny");
               GXutil.writeLogRaw("Old: ",Z3806RecUltAny);
               GXutil.writeLogRaw("Current: ",T01RG2_A3806RecUltAny[0]);
            }
            if ( DecimalUtil.compareTo(Z3807RecPorAny, T01RG2_A3807RecPorAny[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecPorAny");
               GXutil.writeLogRaw("Old: ",Z3807RecPorAny);
               GXutil.writeLogRaw("Current: ",T01RG2_A3807RecPorAny[0]);
            }
            if ( DecimalUtil.compareTo(Z4900PrdCanMac, T01RG2_A4900PrdCanMac[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"PrdCanMac");
               GXutil.writeLogRaw("Old: ",Z4900PrdCanMac);
               GXutil.writeLogRaw("Current: ",T01RG2_A4900PrdCanMac[0]);
            }
            if ( Z11708RecProv != T01RG2_A11708RecProv[0] )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecProv");
               GXutil.writeLogRaw("Old: ",Z11708RecProv);
               GXutil.writeLogRaw("Current: ",T01RG2_A11708RecProv[0]);
            }
            if ( GXutil.strcmp(Z4576RecLinUsr, T01RG2_A4576RecLinUsr[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecLinUsr");
               GXutil.writeLogRaw("Old: ",Z4576RecLinUsr);
               GXutil.writeLogRaw("Current: ",T01RG2_A4576RecLinUsr[0]);
            }
            if ( !( GXutil.dateCompare(Z4577RecPesFec, T01RG2_A4577RecPesFec[0]) ) )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecPesFec");
               GXutil.writeLogRaw("Old: ",Z4577RecPesFec);
               GXutil.writeLogRaw("Current: ",T01RG2_A4577RecPesFec[0]);
            }
            if ( DecimalUtil.compareTo(Z12710PrdCantOrg, T01RG2_A12710PrdCantOrg[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"PrdCantOrg");
               GXutil.writeLogRaw("Old: ",Z12710PrdCantOrg);
               GXutil.writeLogRaw("Current: ",T01RG2_A12710PrdCantOrg[0]);
            }
            if ( Z12717RecFabId != T01RG2_A12717RecFabId[0] )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecFabId");
               GXutil.writeLogRaw("Old: ",Z12717RecFabId);
               GXutil.writeLogRaw("Current: ",T01RG2_A12717RecFabId[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13938RecLoteFch), GXutil.resetTime(T01RG2_A13938RecLoteFch[0])) ) )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecLoteFch");
               GXutil.writeLogRaw("Old: ",Z13938RecLoteFch);
               GXutil.writeLogRaw("Current: ",T01RG2_A13938RecLoteFch[0]);
            }
            if ( Z13937RecLotAlm != T01RG2_A13937RecLotAlm[0] )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"RecLotAlm");
               GXutil.writeLogRaw("Old: ",Z13937RecLotAlm);
               GXutil.writeLogRaw("Current: ",T01RG2_A13937RecLotAlm[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01RG2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01RG2_A719PrdNum[0]);
            }
            if ( Z490ForPrdUMe != T01RG2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("mantenimientoproductosreceta_trn:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T01RG2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLRECET"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RG410( )
   {
      beforeValidate1RG410( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RG410( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RG410( 0) ;
         checkOptimisticConcurrency1RG410( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RG410( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RG410( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RG23 */
                  pr_default.execute(21, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin), A5725RecLote, A686PrdCant, A875RecPrdDsc, A14055RecManAut, A872RecPrdNum, A431FacCon, Byte.valueOf(A2394RecForNro), Byte.valueOf(A3274RecPrdTnq), A3938RecCanEns, Byte.valueOf(A4024RecMar), Short.valueOf(A5422RecSalMP), Integer.valueOf(A5467RecSalVol), A5527RecLinRea, Byte.valueOf(A8934RecPes), A8937RecAcc, A3804RecFecMov, Short.valueOf(A3805RecAnyTie), A3806RecUltAny, A3807RecPorAny, A4900PrdCanMac, Integer.valueOf(A11708RecProv), A4576RecLinUsr, A4577RecPesFec, A12710PrdCantOrg, Integer.valueOf(A12717RecFabId), A13938RecLoteFch, Short.valueOf(A13937RecLotAlm), A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
                  if ( (pr_default.getStatus(21) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A5725RecLote, O5725RecLote) != 0 ) )
                     {
                        AV76Inc_obs = httpContext.getMessage( httpContext.getMessage( "Cambio Lote.Linea = ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( ", Producto ", ""), "") + GXutil.trim( A872RecPrdNum) + " " + GXutil.trim( A875RecPrdDsc) + httpContext.getMessage( httpContext.getMessage( " ,Lote ", ""), "") + GXutil.trim( O5725RecLote) + httpContext.getMessage( httpContext.getMessage( " , se cambia por, ", ""), "") + GXutil.trim( A5725RecLote) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV76Inc_obs", AV76Inc_obs);
                     }
                     else
                     {
                        if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A14055RecManAut, O14055RecManAut) != 0 ) )
                        {
                           AV76Inc_obs = httpContext.getMessage( httpContext.getMessage( "Receta Tinte: Linea ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( " Prd.", ""), "") + GXutil.trim( A872RecPrdNum) + httpContext.getMessage( httpContext.getMessage( " ,Cambio M o A. Valor actual ", ""), "") + A14055RecManAut + httpContext.getMessage( httpContext.getMessage( ", Valor anterior ", ""), "") + AV77RecManAutold ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV76Inc_obs", AV76Inc_obs);
                        }
                     }
                     if ( true /* After */ && ! (GXutil.strcmp("", A872RecPrdNum)==0) )
                     {
                        AV65Inc_obs1 = httpContext.getMessage( httpContext.getMessage( "Receta Tinte: Alta Linea ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( " Prd.", ""), "") + GXutil.trim( A872RecPrdNum) + httpContext.getMessage( httpContext.getMessage( ", Cantidad: ", ""), "") + GXutil.trim( GXutil.str( A686PrdCant, 11, 3)) + httpContext.getMessage( httpContext.getMessage( ", Factor: ", ""), "") + GXutil.trim( GXutil.str( A431FacCon, 11, 5)) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV65Inc_obs1", AV65Inc_obs1);
                     }
                     else
                     {
                        if ( true /* After */ && (GXutil.strcmp("", A872RecPrdNum)==0) )
                        {
                           AV65Inc_obs1 = httpContext.getMessage( httpContext.getMessage( "Receta Tinte: Alta Linea ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( " Prd.", ""), "") + GXutil.trim( A872RecPrdNum) + httpContext.getMessage( httpContext.getMessage( " Desc.", ""), "") + GXutil.trim( A875RecPrdDsc) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV65Inc_obs1", AV65Inc_obs1);
                        }
                     }
                     if ( ( true /* After */ || true /* After */ ) && ( ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) ) )
                     {
                        GXv_char4[0] = AV7EmprCod ;
                        GXv_char3[0] = A872RecPrdNum ;
                        GXv_decimal15[0] = A238CanRes ;
                        GXv_decimal16[0] = DecimalUtil.doubleToDec(AV74CanResold) ;
                        new app.mantenimientoderecetasregistro_modificocantreservada(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal15, GXv_decimal16) ;
                        mantenimientoproductosreceta_trn_impl.this.AV7EmprCod = GXv_char4[0] ;
                        mantenimientoproductosreceta_trn_impl.this.A872RecPrdNum = GXv_char3[0] ;
                        mantenimientoproductosreceta_trn_impl.this.A238CanRes = GXv_decimal15[0] ;
                        mantenimientoproductosreceta_trn_impl.this.AV74CanResold = (short)(DecimalUtil.decToDouble(GXv_decimal16[0])) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
                        app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
                        httpContext.ajax_rsp_assign_attri("", false, "AV74CanResold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74CanResold), 4, 0));
                     }
                     if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A5725RecLote, O5725RecLote) != 0 ) )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV82Pgmname, 1, 10), AV19UsurCod, AV18Station, AV76Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                     }
                     if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A14055RecManAut, O14055RecManAut) != 0 ) )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV82Pgmname, AV19UsurCod, AV18Station, AV76Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV82Pgmname, 1, 10), AV19UsurCod, AV18Station, AV65Inc_obs1, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
            load1RG410( ) ;
         }
         endLevel1RG410( ) ;
      }
      closeExtendedTableCursors1RG410( ) ;
   }

   public void update1RG410( )
   {
      beforeValidate1RG410( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RG410( ) ;
      }
      if ( ( nIsMod_410 != 0 ) || ( nIsDirty_410 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1RG410( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1RG410( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1RG410( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01RG24 */
                     pr_default.execute(22, new Object[] {A5725RecLote, A686PrdCant, A875RecPrdDsc, A14055RecManAut, A872RecPrdNum, A431FacCon, Byte.valueOf(A2394RecForNro), Byte.valueOf(A3274RecPrdTnq), A3938RecCanEns, Byte.valueOf(A4024RecMar), Short.valueOf(A5422RecSalMP), Integer.valueOf(A5467RecSalVol), A5527RecLinRea, Byte.valueOf(A8934RecPes), A8937RecAcc, A3804RecFecMov, Short.valueOf(A3805RecAnyTie), A3806RecUltAny, A3807RecPorAny, A4900PrdCanMac, Integer.valueOf(A11708RecProv), A4576RecLinUsr, A4577RecPesFec, A12710PrdCantOrg, Integer.valueOf(A12717RecFabId), A13938RecLoteFch, Short.valueOf(A13937RecLotAlm), Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLRECET"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1RG410( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A5725RecLote, O5725RecLote) != 0 ) )
                        {
                           AV76Inc_obs = httpContext.getMessage( httpContext.getMessage( "Cambio Lote.Linea = ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( ", Producto ", ""), "") + GXutil.trim( A872RecPrdNum) + " " + GXutil.trim( A875RecPrdDsc) + httpContext.getMessage( httpContext.getMessage( " ,Lote ", ""), "") + GXutil.trim( O5725RecLote) + httpContext.getMessage( httpContext.getMessage( " , se cambia por, ", ""), "") + GXutil.trim( A5725RecLote) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV76Inc_obs", AV76Inc_obs);
                        }
                        else
                        {
                           if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A14055RecManAut, O14055RecManAut) != 0 ) )
                           {
                              AV76Inc_obs = httpContext.getMessage( httpContext.getMessage( "Receta Tinte: Linea ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( " Prd.", ""), "") + GXutil.trim( A872RecPrdNum) + httpContext.getMessage( httpContext.getMessage( " ,Cambio M o A. Valor actual ", ""), "") + A14055RecManAut + httpContext.getMessage( httpContext.getMessage( ", Valor anterior ", ""), "") + AV77RecManAutold ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV76Inc_obs", AV76Inc_obs);
                           }
                        }
                        if ( true /* After */ && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) )
                        {
                           AV65Inc_obs1 = httpContext.getMessage( httpContext.getMessage( "Receta Tinte Factor: Linea ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( " Prd.", ""), "") + GXutil.trim( A872RecPrdNum) + httpContext.getMessage( httpContext.getMessage( ", Old:", ""), "") + GXutil.trim( GXutil.str( O431FacCon, 11, 5)) + httpContext.getMessage( httpContext.getMessage( ", New: ", ""), "") + GXutil.trim( GXutil.str( A431FacCon, 11, 5)) + httpContext.getMessage( httpContext.getMessage( ", Old Cnt:", ""), "") + GXutil.trim( GXutil.str( O686PrdCant, 11, 3)) + httpContext.getMessage( httpContext.getMessage( ", New Cnt: ", ""), "") + GXutil.trim( GXutil.str( A686PrdCant, 11, 3)) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV65Inc_obs1", AV65Inc_obs1);
                        }
                        if ( true /* After */ && ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) == 0 ) )
                        {
                           AV66Inc_obs2 = httpContext.getMessage( httpContext.getMessage( "Receta Tinte Cantidad: Linea ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( " Prd.", ""), "") + GXutil.trim( A872RecPrdNum) + httpContext.getMessage( httpContext.getMessage( ", Old: ", ""), "") + GXutil.trim( GXutil.str( O686PrdCant, 11, 3)) + httpContext.getMessage( httpContext.getMessage( ", New: ", ""), "") + GXutil.trim( GXutil.str( A686PrdCant, 11, 3)) + httpContext.getMessage( httpContext.getMessage( ", Old Factor:", ""), "") + GXutil.trim( GXutil.str( O431FacCon, 11, 5)) + httpContext.getMessage( httpContext.getMessage( ", New Factor: ", ""), "") + GXutil.trim( GXutil.str( A431FacCon, 11, 5)) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV66Inc_obs2", AV66Inc_obs2);
                        }
                        if ( ( true /* After */ || true /* After */ ) && ( ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) ) )
                        {
                           GXv_char4[0] = AV7EmprCod ;
                           GXv_char3[0] = A872RecPrdNum ;
                           GXv_decimal16[0] = A238CanRes ;
                           GXv_decimal15[0] = DecimalUtil.doubleToDec(AV74CanResold) ;
                           new app.mantenimientoderecetasregistro_modificocantreservada(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal16, GXv_decimal15) ;
                           mantenimientoproductosreceta_trn_impl.this.AV7EmprCod = GXv_char4[0] ;
                           mantenimientoproductosreceta_trn_impl.this.A872RecPrdNum = GXv_char3[0] ;
                           mantenimientoproductosreceta_trn_impl.this.A238CanRes = GXv_decimal16[0] ;
                           mantenimientoproductosreceta_trn_impl.this.AV74CanResold = (short)(DecimalUtil.decToDouble(GXv_decimal15[0])) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
                           httpContext.ajax_rsp_assign_attri("", false, "AV74CanResold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74CanResold), 4, 0));
                        }
                        if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A5725RecLote, O5725RecLote) != 0 ) )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV82Pgmname, 1, 10), AV19UsurCod, AV18Station, AV76Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                        }
                        if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A14055RecManAut, O14055RecManAut) != 0 ) )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV82Pgmname, AV19UsurCod, AV18Station, AV76Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                        }
                        if ( true /* After */ && ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) == 0 ) )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV82Pgmname, 1, 10), AV19UsurCod, AV18Station, AV66Inc_obs2, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                        }
                        if ( true /* After */ && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV82Pgmname, 1, 10), AV19UsurCod, AV18Station, AV65Inc_obs1, A129BarCod, A132BarCodReo, A130BarCodPar) ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1RG410( ) ;
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
            endLevel1RG410( ) ;
         }
      }
      closeExtendedTableCursors1RG410( ) ;
   }

   public void deferredUpdate1RG410( )
   {
   }

   public void delete1RG410( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1RG410( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RG410( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RG410( ) ;
         afterConfirm1RG410( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RG410( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01RG25 */
               pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* After */ )
                  {
                     AV65Inc_obs1 = httpContext.getMessage( httpContext.getMessage( "Linea Eliminada ", ""), "") + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + httpContext.getMessage( httpContext.getMessage( " Prd. ", ""), "") + GXutil.trim( A872RecPrdNum) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV65Inc_obs1", AV65Inc_obs1);
                  }
                  if ( true /* After */ )
                  {
                     GXv_char4[0] = AV7EmprCod ;
                     GXv_char3[0] = A872RecPrdNum ;
                     GXv_decimal16[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_decimal15[0] = DecimalUtil.doubleToDec(AV74CanResold) ;
                     new app.mantenimientoderecetasregistro_modificocantreservada(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal16, GXv_decimal15) ;
                     mantenimientoproductosreceta_trn_impl.this.AV7EmprCod = GXv_char4[0] ;
                     mantenimientoproductosreceta_trn_impl.this.A872RecPrdNum = GXv_char3[0] ;
                     mantenimientoproductosreceta_trn_impl.this.AV74CanResold = (short)(DecimalUtil.decToDouble(GXv_decimal15[0])) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
                     app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
                     httpContext.ajax_rsp_assign_attri("", false, "AV74CanResold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74CanResold), 4, 0));
                  }
                  if ( true /* After */ || true /* After */ )
                  {
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV82Pgmname, 1, 10), AV19UsurCod, AV18Station, AV65Inc_obs1, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
      endLevel1RG410( ) ;
      Gx_mode = sMode410 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RG410( )
   {
      standaloneModal1RG410( ) ;
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
         if ( true /* After */ && isIns( )  )
         {
            GXv_decimal16[0] = A686PrdCant ;
            GXv_char4[0] = A14055RecManAut ;
            new app.pdyrp036(remoteHandle, context).execute( A396EmprCod, A872RecPrdNum, GXv_decimal16, GXv_char4) ;
            mantenimientoproductosreceta_trn_impl.this.A686PrdCant = GXv_decimal16[0] ;
            mantenimientoproductosreceta_trn_impl.this.A14055RecManAut = GXv_char4[0] ;
         }
         /* Using cursor T01RG26 */
         pr_default.execute(24, new Object[] {A396EmprCod, A872RecPrdNum});
         if ( (pr_default.getStatus(24) != 101) )
         {
            A874RecPrdFind = T01RG26_A874RecPrdFind[0] ;
            n874RecPrdFind = T01RG26_n874RecPrdFind[0] ;
         }
         else
         {
            A874RecPrdFind = "xxxxxx" ;
            n874RecPrdFind = false ;
         }
         pr_default.close(24);
         if ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 )
         {
            GXt_char1 = A13897RecPrdDscf ;
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A872RecPrdNum ;
            GXv_char2[0] = GXt_char1 ;
            new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            mantenimientoproductosreceta_trn_impl.this.A396EmprCod = GXv_char4[0] ;
            mantenimientoproductosreceta_trn_impl.this.A872RecPrdNum = GXv_char3[0] ;
            mantenimientoproductosreceta_trn_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A13897RecPrdDscf = GXt_char1 ;
         }
         else
         {
            A13897RecPrdDscf = "" ;
         }
         if ( (GXutil.strcmp("", A872RecPrdNum)==0) )
         {
            edtRecManAut_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtRecManAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecManAut_Enabled), 5, 0), !bGXsfl_51_Refreshing);
         }
         else
         {
            if ( ( GXutil.strcmp(A872RecPrdNum, "100000") < 0 ) && ( GXutil.strcmp(A872RecPrdNum, "999999") > 0 ) )
            {
               edtRecManAut_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtRecManAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecManAut_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            }
            else
            {
               edtRecManAut_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtRecManAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecManAut_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            }
         }
         /* Using cursor T01RG27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01RG27_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01RG27_n488ForPrdDsc[0] ;
         pr_default.close(25);
         A238CanRes = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         AV74CanResold = (short)(DecimalUtil.decToDouble(O238CanRes)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74CanResold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74CanResold), 4, 0));
         AV61Cantold = O686PrdCant ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61Cantold", GXutil.ltrimstr( AV61Cantold, 11, 3));
         if ( ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) || ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) || ( A2394RecForNro != O2394RecForNro ) )
         {
            AV32Modif = httpContext.getMessage( "Y", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Modif", AV32Modif);
         }
         AV77RecManAutold = O14055RecManAut ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77RecManAutold", AV77RecManAutold);
         AV71oldRecLote = O5725RecLote ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71oldRecLote", AV71oldRecLote);
         /* Using cursor T01RG28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         A704PrdExiAlm = T01RG28_A704PrdExiAlm[0] ;
         A685PrdCanRes = T01RG28_A685PrdCanRes[0] ;
         A5418PrdSalM = T01RG28_A5418PrdSalM[0] ;
         A10881PrdLote = T01RG28_A10881PrdLote[0] ;
         A13232PrdRGB = T01RG28_A13232PrdRGB[0] ;
         A705PrdExiCC = T01RG28_A705PrdExiCC[0] ;
         A4338PrdUMeFo = T01RG28_A4338PrdUMeFo[0] ;
         A707PrdFacCon = T01RG28_A707PrdFacCon[0] ;
         A856ValCod = T01RG28_A856ValCod[0] ;
         pr_default.close(26);
         A13832CantProduc = (A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
   }

   public void endLevel1RG410( )
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

   public void scanStart1RG410( )
   {
      /* Scan By routine */
      /* Using cursor T01RG29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
      RcdFound410 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound410 = (short)(1) ;
         A811RecLin = T01RG29_A811RecLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RG410( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound410 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound410 = (short)(1) ;
         A811RecLin = T01RG29_A811RecLin[0] ;
      }
   }

   public void scanEnd1RG410( )
   {
      pr_default.close(27);
   }

   public void afterConfirm1RG410( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") <= 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ && ( AV35Err_und == 1 ) )
      {
         GXCCtl = "RECPRDNUM_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion no ha entrado UNIDAD=1,2,3", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") <= 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ && ( AV35Err_und == 0 ) )
      {
         GXCCtl = "RECPRDNUM_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion no ha entrado UNIDAD=1,2,3", ""), 0, GXCCtl);
      }
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "0") == 0 ) && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_decimal16[0] = AV61Cantold ;
         GXv_decimal15[0] = A686PrdCant ;
         GXv_decimal17[0] = AV62Totaldekilos ;
         GXv_int6[0] = AV64VolumenReceta ;
         GXv_int18[0] = AV30Valcos ;
         GXv_int8[0] = A490ForPrdUMe ;
         new app.preclin0(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal16, GXv_decimal15, GXv_decimal17, GXv_int6, GXv_int18, GXv_int8) ;
         mantenimientoproductosreceta_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         mantenimientoproductosreceta_trn_impl.this.A872RecPrdNum = GXv_char3[0] ;
         mantenimientoproductosreceta_trn_impl.this.AV61Cantold = GXv_decimal16[0] ;
         mantenimientoproductosreceta_trn_impl.this.A686PrdCant = GXv_decimal15[0] ;
         mantenimientoproductosreceta_trn_impl.this.AV62Totaldekilos = GXv_decimal17[0] ;
         mantenimientoproductosreceta_trn_impl.this.AV64VolumenReceta = GXv_int6[0] ;
         mantenimientoproductosreceta_trn_impl.this.AV30Valcos = (short)((short)(GXv_int18[0])) ;
         mantenimientoproductosreceta_trn_impl.this.A490ForPrdUMe = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV61Cantold", GXutil.ltrimstr( AV61Cantold, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV62Totaldekilos", GXutil.ltrimstr( AV62Totaldekilos, 10, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV64VolumenReceta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64VolumenReceta), 5, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Valcos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Valcos), 4, 0));
      }
      if ( ( ! (GXutil.strcmp("", A719PrdNum)==0) ) && ( ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) || ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) && true /* After */ ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_decimal17[0] = A704PrdExiAlm ;
         GXv_decimal16[0] = A685PrdCanRes ;
         GXv_decimal15[0] = A686PrdCant ;
         GXv_decimal19[0] = A705PrdExiCC ;
         GXv_decimal20[0] = AV61Cantold ;
         GXv_int8[0] = (byte)(AV38AlmCC) ;
         GXv_char2[0] = AV52msgErr ;
         new app.pctrlcant(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal17, GXv_decimal16, GXv_decimal15, GXv_decimal19, GXv_decimal20, GXv_int8, GXv_char2) ;
         mantenimientoproductosreceta_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         mantenimientoproductosreceta_trn_impl.this.A872RecPrdNum = GXv_char3[0] ;
         mantenimientoproductosreceta_trn_impl.this.A704PrdExiAlm = GXv_decimal17[0] ;
         mantenimientoproductosreceta_trn_impl.this.A685PrdCanRes = GXv_decimal16[0] ;
         mantenimientoproductosreceta_trn_impl.this.A686PrdCant = GXv_decimal15[0] ;
         mantenimientoproductosreceta_trn_impl.this.A705PrdExiCC = GXv_decimal19[0] ;
         mantenimientoproductosreceta_trn_impl.this.AV61Cantold = GXv_decimal20[0] ;
         mantenimientoproductosreceta_trn_impl.this.AV38AlmCC = GXv_int8[0] ;
         mantenimientoproductosreceta_trn_impl.this.AV52msgErr = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV61Cantold", GXutil.ltrimstr( AV61Cantold, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV38AlmCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38AlmCC), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV52msgErr", AV52msgErr);
      }
      if ( ( AV47EliminarReceta == 1 ) && ! (GXutil.strcmp("", AV52msgErr)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.", "")+AV52msgErr, 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert1RG410( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RG410( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RG410( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RG410( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RG410( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RG410( )
   {
      edtRecLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLin_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdNum_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDsc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtFacCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCon_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecManAut_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecManAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecManAut_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLote_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecForNro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecForNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecForNro_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPrdTnq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdTnq_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtCanRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCanRes_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdExiCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPrdFind_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdFind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdFind_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdCanRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecCanEns_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecCanEns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecCanEns_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecMar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMar_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecSalMP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecSalMP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecSalMP_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      chkPrdSalM.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdSalM.getInternalname(), "Enabled", GXutil.ltrimstr( chkPrdSalM.getEnabled(), 5, 0), !bGXsfl_51_Refreshing);
      edtRecSalVol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecSalVol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecSalVol_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecLinRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinRea_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPes_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecAcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecAcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecAcc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecFecMov_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFecMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFecMov_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecAnyTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecAnyTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecAnyTie_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecUltAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecUltAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecUltAny_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPorAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPorAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPorAny_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdCanMac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanMac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanMac_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecProv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecProv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecProv_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLote_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecLinUsr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinUsr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinUsr_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPesFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPesFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPesFec_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdCantOrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCantOrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCantOrg_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecFabId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFabId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFabId_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdRGB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRGB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRGB_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtCantProduc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCantProduc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCantProduc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPrdDscf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDscf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDscf_Enabled), 5, 0), !bGXsfl_51_Refreshing);
   }

   public void send_integrity_lvl_hashes1RG410( )
   {
   }

   public void send_integrity_lvl_hashes1RG409( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14RecLinMaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINPRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15RecLinPro), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNHDR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25BarNHdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ProForDsc, ""))));
   }

   public void subsflControlProps_51410( )
   {
      edtRecLin_Internalname = "RECLIN_"+sGXsfl_51_idx ;
      edtRecPrdNum_Internalname = "RECPRDNUM_"+sGXsfl_51_idx ;
      edtRecPrdDsc_Internalname = "RECPRDDSC_"+sGXsfl_51_idx ;
      edtFacCon_Internalname = "FACCON_"+sGXsfl_51_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_51_idx ;
      imgprompt_490_Internalname = "PROMPT_490_"+sGXsfl_51_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_51_idx ;
      edtPrdCant_Internalname = "PRDCANT_"+sGXsfl_51_idx ;
      edtRecManAut_Internalname = "RECMANAUT_"+sGXsfl_51_idx ;
      edtRecLote_Internalname = "RECLOTE_"+sGXsfl_51_idx ;
      edtRecForNro_Internalname = "RECFORNRO_"+sGXsfl_51_idx ;
      edtRecPrdTnq_Internalname = "RECPRDTNQ_"+sGXsfl_51_idx ;
      edtCanRes_Internalname = "CANRES_"+sGXsfl_51_idx ;
      edtPrdExiCC_Internalname = "PRDEXICC_"+sGXsfl_51_idx ;
      edtRecPrdFind_Internalname = "RECPRDFIND_"+sGXsfl_51_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_51_idx ;
      edtPrdCanRes_Internalname = "PRDCANRES_"+sGXsfl_51_idx ;
      edtRecCanEns_Internalname = "RECCANENS_"+sGXsfl_51_idx ;
      edtRecMar_Internalname = "RECMAR_"+sGXsfl_51_idx ;
      edtRecSalMP_Internalname = "RECSALMP_"+sGXsfl_51_idx ;
      chkPrdSalM.setInternalname( "PRDSALM_"+sGXsfl_51_idx );
      edtRecSalVol_Internalname = "RECSALVOL_"+sGXsfl_51_idx ;
      edtRecLinRea_Internalname = "RECLINREA_"+sGXsfl_51_idx ;
      edtRecPes_Internalname = "RECPES_"+sGXsfl_51_idx ;
      edtRecAcc_Internalname = "RECACC_"+sGXsfl_51_idx ;
      edtRecFecMov_Internalname = "RECFECMOV_"+sGXsfl_51_idx ;
      edtRecAnyTie_Internalname = "RECANYTIE_"+sGXsfl_51_idx ;
      edtRecUltAny_Internalname = "RECULTANY_"+sGXsfl_51_idx ;
      edtRecPorAny_Internalname = "RECPORANY_"+sGXsfl_51_idx ;
      edtPrdCanMac_Internalname = "PRDCANMAC_"+sGXsfl_51_idx ;
      edtRecProv_Internalname = "RECPROV_"+sGXsfl_51_idx ;
      edtPrdLote_Internalname = "PRDLOTE_"+sGXsfl_51_idx ;
      edtRecLinUsr_Internalname = "RECLINUSR_"+sGXsfl_51_idx ;
      edtRecPesFec_Internalname = "RECPESFEC_"+sGXsfl_51_idx ;
      edtPrdCantOrg_Internalname = "PRDCANTORG_"+sGXsfl_51_idx ;
      edtRecFabId_Internalname = "RECFABID_"+sGXsfl_51_idx ;
      edtPrdRGB_Internalname = "PRDRGB_"+sGXsfl_51_idx ;
      edtCantProduc_Internalname = "CANTPRODUC_"+sGXsfl_51_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_51_idx ;
      edtRecPrdDscf_Internalname = "RECPRDDSCF_"+sGXsfl_51_idx ;
   }

   public void subsflControlProps_fel_51410( )
   {
      edtRecLin_Internalname = "RECLIN_"+sGXsfl_51_fel_idx ;
      edtRecPrdNum_Internalname = "RECPRDNUM_"+sGXsfl_51_fel_idx ;
      edtRecPrdDsc_Internalname = "RECPRDDSC_"+sGXsfl_51_fel_idx ;
      edtFacCon_Internalname = "FACCON_"+sGXsfl_51_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_51_fel_idx ;
      imgprompt_490_Internalname = "PROMPT_490_"+sGXsfl_51_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_51_fel_idx ;
      edtPrdCant_Internalname = "PRDCANT_"+sGXsfl_51_fel_idx ;
      edtRecManAut_Internalname = "RECMANAUT_"+sGXsfl_51_fel_idx ;
      edtRecLote_Internalname = "RECLOTE_"+sGXsfl_51_fel_idx ;
      edtRecForNro_Internalname = "RECFORNRO_"+sGXsfl_51_fel_idx ;
      edtRecPrdTnq_Internalname = "RECPRDTNQ_"+sGXsfl_51_fel_idx ;
      edtCanRes_Internalname = "CANRES_"+sGXsfl_51_fel_idx ;
      edtPrdExiCC_Internalname = "PRDEXICC_"+sGXsfl_51_fel_idx ;
      edtRecPrdFind_Internalname = "RECPRDFIND_"+sGXsfl_51_fel_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_51_fel_idx ;
      edtPrdCanRes_Internalname = "PRDCANRES_"+sGXsfl_51_fel_idx ;
      edtRecCanEns_Internalname = "RECCANENS_"+sGXsfl_51_fel_idx ;
      edtRecMar_Internalname = "RECMAR_"+sGXsfl_51_fel_idx ;
      edtRecSalMP_Internalname = "RECSALMP_"+sGXsfl_51_fel_idx ;
      chkPrdSalM.setInternalname( "PRDSALM_"+sGXsfl_51_fel_idx );
      edtRecSalVol_Internalname = "RECSALVOL_"+sGXsfl_51_fel_idx ;
      edtRecLinRea_Internalname = "RECLINREA_"+sGXsfl_51_fel_idx ;
      edtRecPes_Internalname = "RECPES_"+sGXsfl_51_fel_idx ;
      edtRecAcc_Internalname = "RECACC_"+sGXsfl_51_fel_idx ;
      edtRecFecMov_Internalname = "RECFECMOV_"+sGXsfl_51_fel_idx ;
      edtRecAnyTie_Internalname = "RECANYTIE_"+sGXsfl_51_fel_idx ;
      edtRecUltAny_Internalname = "RECULTANY_"+sGXsfl_51_fel_idx ;
      edtRecPorAny_Internalname = "RECPORANY_"+sGXsfl_51_fel_idx ;
      edtPrdCanMac_Internalname = "PRDCANMAC_"+sGXsfl_51_fel_idx ;
      edtRecProv_Internalname = "RECPROV_"+sGXsfl_51_fel_idx ;
      edtPrdLote_Internalname = "PRDLOTE_"+sGXsfl_51_fel_idx ;
      edtRecLinUsr_Internalname = "RECLINUSR_"+sGXsfl_51_fel_idx ;
      edtRecPesFec_Internalname = "RECPESFEC_"+sGXsfl_51_fel_idx ;
      edtPrdCantOrg_Internalname = "PRDCANTORG_"+sGXsfl_51_fel_idx ;
      edtRecFabId_Internalname = "RECFABID_"+sGXsfl_51_fel_idx ;
      edtPrdRGB_Internalname = "PRDRGB_"+sGXsfl_51_fel_idx ;
      edtCantProduc_Internalname = "CANTPRODUC_"+sGXsfl_51_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_51_fel_idx ;
      edtRecPrdDscf_Internalname = "RECPRDDSCF_"+sGXsfl_51_fel_idx ;
   }

   public void addRow1RG410( )
   {
      nGXsfl_51_idx = (int)(nGXsfl_51_idx+1) ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_51410( ) ;
      sendRow1RG410( ) ;
   }

   public void sendRow1RG410( )
   {
      Gridlevel_recRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_rec_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_rec_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_rec_Class, "") != 0 )
         {
            subGridlevel_rec_Linesclass = subGridlevel_rec_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_rec_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_rec_Backstyle = (byte)(0) ;
         subGridlevel_rec_Backcolor = subGridlevel_rec_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_rec_Class, "") != 0 )
         {
            subGridlevel_rec_Linesclass = subGridlevel_rec_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_rec_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_rec_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_rec_Class, "") != 0 )
         {
            subGridlevel_rec_Linesclass = subGridlevel_rec_Class+"Odd" ;
         }
         subGridlevel_rec_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_rec_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_rec_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_51_idx) % (2))) == 0 )
         {
            subGridlevel_rec_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_rec_Class, "") != 0 )
            {
               subGridlevel_rec_Linesclass = subGridlevel_rec_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_rec_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_rec_Class, "") != 0 )
            {
               subGridlevel_rec_Linesclass = subGridlevel_rec_Class+"Odd" ;
            }
         }
      }
      imgprompt_490_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"FORPRDUME_"+sGXsfl_51_idx+"'), id:'"+"FORPRDUME_"+sGXsfl_51_idx+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"FORPRDDSC_"+sGXsfl_51_idx+"'), id:'"+"FORPRDDSC_"+sGXsfl_51_idx+"'"+",IOType:'inout'}"+"],"+"gx.dom.form()."+"nIsMod_410_"+sGXsfl_51_idx+","+"'', false"+","+"false"+");") ;
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_410_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLin_Internalname,GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLin_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtRecLin_Forecolor)+";",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtRecLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_410_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdNum_Internalname,GXutil.rtrim( A872RecPrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtRecPrdNum_Forecolor)+";",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtRecPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_410_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdDsc_Internalname,GXutil.rtrim( A875RecPrdDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtRecPrdDsc_Forecolor)+";",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtRecPrdDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_410_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacCon_Internalname,GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacCon_Enabled!=0) ? localUtil.format( A431FacCon, "ZZZZ9.99999") : localUtil.format( A431FacCon, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacCon_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtFacCon_Forecolor)+";",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacCon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_410_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtForPrdUMe_Forecolor)+";",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtForPrdUMe_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_490_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_490_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridlevel_recRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_490_Internalname,sImgUrl,imgprompt_490_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(imgprompt_490_Visible),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"",Integer.valueOf(0),"",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"","","","","","","",Integer.valueOf(1),Boolean.valueOf(false),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtForPrdDsc_Forecolor)+";",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtForPrdDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_410_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCant_Internalname,GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A686PrdCant, "ZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCant_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtPrdCant_Forecolor)+";",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdCant_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_410_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecManAut_Internalname,GXutil.rtrim( A14055RecManAut),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecManAut_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtRecManAut_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLote_Internalname,GXutil.rtrim( A5725RecLote),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtRecLote_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_410_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecForNro_Internalname,GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecForNro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2394RecForNro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A2394RecForNro), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecForNro_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtRecForNro_Forecolor)+";",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtRecForNro_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_410_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdTnq_Internalname,GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecPrdTnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3274RecPrdTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3274RecPrdTnq), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdTnq_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtRecPrdTnq_Forecolor)+";",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtRecPrdTnq_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCanRes_Internalname,GXutil.ltrim( localUtil.ntoc( A238CanRes, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCanRes_Enabled!=0) ? localUtil.format( A238CanRes, "ZZZZ9.99") : localUtil.format( A238CanRes, "ZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCanRes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtCanRes_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiCC_Internalname,GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdExiCC_Enabled!=0) ? localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999") : localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiCC_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtPrdExiCC_Forecolor)+";",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdExiCC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdFind_Internalname,GXutil.rtrim( A874RecPrdFind),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdFind_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtRecPrdFind_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiAlm_Internalname,GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdExiAlm_Enabled!=0) ? localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiAlm_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtPrdExiAlm_Forecolor)+";",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdExiAlm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCanRes_Internalname,GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdCanRes_Enabled!=0) ? localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999") : localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCanRes_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtPrdCanRes_Forecolor)+";",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdCanRes_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecCanEns_Internalname,GXutil.ltrim( localUtil.ntoc( A3938RecCanEns, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecCanEns_Enabled!=0) ? localUtil.format( A3938RecCanEns, "ZZZ9.99999") : localUtil.format( A3938RecCanEns, "ZZZ9.99999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecCanEns_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtRecCanEns_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecMar_Internalname,GXutil.ltrim( localUtil.ntoc( A4024RecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecMar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4024RecMar), "9") : localUtil.format( DecimalUtil.doubleToDec(A4024RecMar), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecMar_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtRecMar_Forecolor)+";",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtRecMar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecSalMP_Internalname,GXutil.ltrim( localUtil.ntoc( A5422RecSalMP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecSalMP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5422RecSalMP), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5422RecSalMP), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecSalMP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtRecSalMP_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "PRDSALM_" + sGXsfl_51_idx ;
      chkPrdSalM.setName( GXCCtl );
      chkPrdSalM.setWebtags( "" );
      chkPrdSalM.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdSalM.getInternalname(), "TitleCaption", chkPrdSalM.getCaption(), !bGXsfl_51_Refreshing);
      chkPrdSalM.setCheckedValue( "N" );
      A5418PrdSalM = ((GXutil.strcmp(GXutil.rtrim( A5418PrdSalM), "S")==0) ? "S" : "N") ;
      Gridlevel_recRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkPrdSalM.getInternalname(),A5418PrdSalM,"","",Integer.valueOf(0),Integer.valueOf(chkPrdSalM.getEnabled()),"S","",StyleString,ClassString,"TrnColumn","",""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecSalVol_Internalname,GXutil.ltrim( localUtil.ntoc( A5467RecSalVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecSalVol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5467RecSalVol), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5467RecSalVol), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecSalVol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtRecSalVol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinRea_Internalname,GXutil.rtrim( A5527RecLinRea),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLinRea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtRecLinRea_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPes_Internalname,GXutil.ltrim( localUtil.ntoc( A8934RecPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecPes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8934RecPes), "9") : localUtil.format( DecimalUtil.doubleToDec(A8934RecPes), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtRecPes_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecAcc_Internalname,GXutil.rtrim( A8937RecAcc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecAcc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtRecAcc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecFecMov_Internalname,localUtil.format(A3804RecFecMov, "99/99/99"),localUtil.format( A3804RecFecMov, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecFecMov_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtRecFecMov_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecAnyTie_Internalname,GXutil.ltrim( localUtil.ntoc( A3805RecAnyTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecAnyTie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3805RecAnyTie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3805RecAnyTie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecAnyTie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtRecAnyTie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecUltAny_Internalname,GXutil.ltrim( localUtil.ntoc( A3806RecUltAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecUltAny_Enabled!=0) ? localUtil.format( A3806RecUltAny, "ZZZZZZ9.999") : localUtil.format( A3806RecUltAny, "ZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecUltAny_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtRecUltAny_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPorAny_Internalname,GXutil.ltrim( localUtil.ntoc( A3807RecPorAny, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecPorAny_Enabled!=0) ? localUtil.format( A3807RecPorAny, "ZZ9.99") : localUtil.format( A3807RecPorAny, "ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPorAny_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtRecPorAny_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCanMac_Internalname,GXutil.ltrim( localUtil.ntoc( A4900PrdCanMac, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdCanMac_Enabled!=0) ? localUtil.format( A4900PrdCanMac, "ZZZZZZ9.999") : localUtil.format( A4900PrdCanMac, "ZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCanMac_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdCanMac_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecProv_Internalname,GXutil.ltrim( localUtil.ntoc( A11708RecProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecProv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11708RecProv), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11708RecProv), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecProv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtRecProv_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdLote_Internalname,GXutil.rtrim( A10881PrdLote),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdLote_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinUsr_Internalname,GXutil.rtrim( A4576RecLinUsr),GXutil.rtrim( localUtil.format( A4576RecLinUsr, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLinUsr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtRecLinUsr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPesFec_Internalname,localUtil.ttoc( A4577RecPesFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4577RecPesFec, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPesFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtRecPesFec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCantOrg_Internalname,GXutil.ltrim( localUtil.ntoc( A12710PrdCantOrg, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdCantOrg_Enabled!=0) ? localUtil.format( A12710PrdCantOrg, "ZZZZZZ9.999") : localUtil.format( A12710PrdCantOrg, "ZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCantOrg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdCantOrg_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecFabId_Internalname,GXutil.ltrim( localUtil.ntoc( A12717RecFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtRecFabId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12717RecFabId), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12717RecFabId), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecFabId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtRecFabId_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRGB_Internalname,GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdRGB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13232PrdRGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13232PrdRGB), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdRGB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdRGB_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCantProduc_Internalname,GXutil.ltrim( localUtil.ntoc( A13832CantProduc, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCantProduc_Enabled!=0) ? localUtil.format( A13832CantProduc, "ZZZZZZZZ9.99") : localUtil.format( A13832CantProduc, "ZZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCantProduc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtCantProduc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_recRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdDscf_Internalname,GXutil.rtrim( A13897RecPrdDscf),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdDscf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtRecPrdDscf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_recRow);
      send_integrity_lvl_hashes1RG410( ) ;
      GXCCtl = "Z811RecLin_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5725RecLote_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5725RecLote));
      GXCCtl = "Z686PrdCant_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z875RecPrdDsc_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z875RecPrdDsc));
      GXCCtl = "Z14055RecManAut_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14055RecManAut));
      GXCCtl = "Z872RecPrdNum_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z872RecPrdNum));
      GXCCtl = "Z431FacCon_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      GXCCtl = "Z11708RecProv_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11708RecProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4576RecLinUsr_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4576RecLinUsr));
      GXCCtl = "Z4577RecPesFec_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z4577RecPesFec, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z12710PrdCantOrg_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12710PrdCantOrg, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12717RecFabId_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12717RecFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13938RecLoteFch_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z13938RecLoteFch, 0, "/"));
      GXCCtl = "Z13937RecLotAlm_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13937RecLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z719PrdNum_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O14055RecManAut_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O14055RecManAut));
      GXCCtl = "O5725RecLote_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O5725RecLote));
      GXCCtl = "O431FacCon_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O686PrdCant_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O238CanRes_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O238CanRes, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2394RecForNro_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_410_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_410, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_410_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_410, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_410_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_410, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N5725RecLote_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A5725RecLote));
      GXCCtl = "N686PrdCant_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N14055RecManAut_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A14055RecManAut));
      GXCCtl = "vEMPRCOD_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV7EmprCod));
      GXCCtl = "vBARCOD_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV49BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODREO_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV50BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODPAR_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV51BarCodPar));
      GXCCtl = "vMODE_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTOTKGS_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV27TotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vVOLUMEN_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV28Volumen, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vFECPAN_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( AV31FecPan, 0, "/"));
      GXCCtl = "vPROFORFAB_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV54Proforfab));
      GXCCtl = "vMODIF2_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV69Modif2));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLIN_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecLin_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLIN_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDNUM_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdNum_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDNUM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDDSC_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDDSC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCON_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtFacCon_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCON_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANT_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtPrdCant_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANT_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECMANAUT_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecManAut_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLOTE_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLote_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECFORNRO_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecForNro_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECFORNRO_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecForNro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDTNQ_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdTnq_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDTNQ_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdTnq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CANRES_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCanRes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXICC_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXICC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDFIND_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdFind_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXIALM_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXIALM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANRES_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANRES_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECCANENS_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecCanEns_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECMAR_"+sGXsfl_51_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecMar_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECMAR_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecMar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECSALMP_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecSalMP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDSALM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkPrdSalM.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECSALVOL_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecSalVol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLINREA_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLinRea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPES_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECACC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecAcc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECFECMOV_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecFecMov_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECANYTIE_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecAnyTie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECULTANY_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecUltAny_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPORANY_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPorAny_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANMAC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanMac_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPROV_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecProv_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDLOTE_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdLote_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLINUSR_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLinUsr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPESFEC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPesFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANTORG_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCantOrg_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECFABID_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecFabId_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDRGB_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdRGB_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CANTPRODUC_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCantProduc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDDSCF_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdDscf_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROMPT_490_"+sGXsfl_51_idx+"Link", GXutil.rtrim( imgprompt_490_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_recContainer.AddRow(Gridlevel_recRow);
   }

   public void readRow1RG410( )
   {
      nGXsfl_51_idx = (int)(nGXsfl_51_idx+1) ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_51410( ) ;
      edtRecLin_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "RECLIN_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECLIN_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPrdNum_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDNUM_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDNUM_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPrdDsc_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDDSC_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDDSC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacCon_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "FACCON_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACCON_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdDsc_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDDSC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdCant_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANT_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANT_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecManAut_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECMANAUT_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecLote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECLOTE_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecForNro_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "RECFORNRO_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecForNro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECFORNRO_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPrdTnq_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDTNQ_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPrdTnq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDTNQ_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCanRes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CANRES_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdExiCC_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXICC_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdExiCC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXICC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPrdFind_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDFIND_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdExiAlm_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXIALM_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdExiAlm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDEXIALM_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdCanRes_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANRES_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdCanRes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANRES_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecCanEns_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECCANENS_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecMar_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "RECMAR_"+sGXsfl_51_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecMar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECMAR_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecSalMP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECSALMP_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkPrdSalM.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "PRDSALM_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtRecSalVol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECSALVOL_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecLinRea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECLINREA_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPES_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecAcc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECACC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecFecMov_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECFECMOV_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecAnyTie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECANYTIE_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecUltAny_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECULTANY_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPorAny_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPORANY_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdCanMac_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANMAC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecProv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPROV_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdLote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDLOTE_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecLinUsr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECLINUSR_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPesFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPESFEC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdCantOrg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCANTORG_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecFabId_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECFABID_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdRGB_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDRGB_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCantProduc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CANTPRODUC_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtRecPrdDscf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "RECPRDDSCF_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      imgprompt_490_Link = httpContext.cgiGet( "PROMPT_490_"+sGXsfl_51_idx+"Link") ;
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
      A875RecPrdDsc = httpContext.cgiGet( edtRecPrdDsc_Internalname) ;
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
      A14055RecManAut = httpContext.cgiGet( edtRecManAut_Internalname) ;
      A5725RecLote = httpContext.cgiGet( edtRecLote_Internalname) ;
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
      A238CanRes = localUtil.ctond( httpContext.cgiGet( edtCanRes_Internalname)) ;
      A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)) ;
      A874RecPrdFind = httpContext.cgiGet( edtRecPrdFind_Internalname) ;
      n874RecPrdFind = false ;
      A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
      A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
      A3938RecCanEns = localUtil.ctond( httpContext.cgiGet( edtRecCanEns_Internalname)) ;
      A4024RecMar = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A5422RecSalMP = (short)(localUtil.ctol( httpContext.cgiGet( edtRecSalMP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A5418PrdSalM = ((GXutil.strcmp(httpContext.cgiGet( chkPrdSalM.getInternalname()), "S")==0) ? "S" : "N") ;
      A5467RecSalVol = (int)(localUtil.ctol( httpContext.cgiGet( edtRecSalVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A5527RecLinRea = httpContext.cgiGet( edtRecLinRea_Internalname) ;
      A8934RecPes = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A8937RecAcc = httpContext.cgiGet( edtRecAcc_Internalname) ;
      A3804RecFecMov = localUtil.ctod( httpContext.cgiGet( edtRecFecMov_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      A3805RecAnyTie = (short)(localUtil.ctol( httpContext.cgiGet( edtRecAnyTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A3806RecUltAny = localUtil.ctond( httpContext.cgiGet( edtRecUltAny_Internalname)) ;
      A3807RecPorAny = localUtil.ctond( httpContext.cgiGet( edtRecPorAny_Internalname)) ;
      A4900PrdCanMac = localUtil.ctond( httpContext.cgiGet( edtPrdCanMac_Internalname)) ;
      A11708RecProv = (int)(localUtil.ctol( httpContext.cgiGet( edtRecProv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A10881PrdLote = httpContext.cgiGet( edtPrdLote_Internalname) ;
      A4576RecLinUsr = GXutil.upper( httpContext.cgiGet( edtRecLinUsr_Internalname)) ;
      A4577RecPesFec = localUtil.ctot( httpContext.cgiGet( edtRecPesFec_Internalname)) ;
      A12710PrdCantOrg = localUtil.ctond( httpContext.cgiGet( edtPrdCantOrg_Internalname)) ;
      A12717RecFabId = (int)(localUtil.ctol( httpContext.cgiGet( edtRecFabId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A13232PrdRGB = localUtil.ctol( httpContext.cgiGet( edtPrdRGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      A13832CantProduc = localUtil.ctond( httpContext.cgiGet( edtCantProduc_Internalname)) ;
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      n719PrdNum = false ;
      A13897RecPrdDscf = httpContext.cgiGet( edtRecPrdDscf_Internalname) ;
      GXCCtl = "Z811RecLin_" + sGXsfl_51_idx ;
      Z811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5725RecLote_" + sGXsfl_51_idx ;
      Z5725RecLote = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z686PrdCant_" + sGXsfl_51_idx ;
      Z686PrdCant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z875RecPrdDsc_" + sGXsfl_51_idx ;
      Z875RecPrdDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14055RecManAut_" + sGXsfl_51_idx ;
      Z14055RecManAut = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z872RecPrdNum_" + sGXsfl_51_idx ;
      Z872RecPrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z431FacCon_" + sGXsfl_51_idx ;
      Z431FacCon = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
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
      GXCCtl = "Z11708RecProv_" + sGXsfl_51_idx ;
      Z11708RecProv = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4576RecLinUsr_" + sGXsfl_51_idx ;
      Z4576RecLinUsr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4577RecPesFec_" + sGXsfl_51_idx ;
      Z4577RecPesFec = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12710PrdCantOrg_" + sGXsfl_51_idx ;
      Z12710PrdCantOrg = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12717RecFabId_" + sGXsfl_51_idx ;
      Z12717RecFabId = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13938RecLoteFch_" + sGXsfl_51_idx ;
      Z13938RecLoteFch = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z13937RecLotAlm_" + sGXsfl_51_idx ;
      Z13937RecLotAlm = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_51_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_51_idx ;
      Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13938RecLoteFch_" + sGXsfl_51_idx ;
      A13938RecLoteFch = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z13937RecLotAlm_" + sGXsfl_51_idx ;
      A13937RecLotAlm = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O14055RecManAut_" + sGXsfl_51_idx ;
      O14055RecManAut = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O5725RecLote_" + sGXsfl_51_idx ;
      O5725RecLote = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O431FacCon_" + sGXsfl_51_idx ;
      O431FacCon = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O686PrdCant_" + sGXsfl_51_idx ;
      O686PrdCant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O238CanRes_" + sGXsfl_51_idx ;
      O238CanRes = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O2394RecForNro_" + sGXsfl_51_idx ;
      O2394RecForNro = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_410_" + sGXsfl_51_idx ;
      nRcdDeleted_410 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_410_" + sGXsfl_51_idx ;
      nRcdExists_410 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_410_" + sGXsfl_51_idx ;
      nIsMod_410 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N5725RecLote_" + sGXsfl_51_idx ;
      N5725RecLote = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N686PrdCant_" + sGXsfl_51_idx ;
      N686PrdCant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "N14055RecManAut_" + sGXsfl_51_idx ;
      N14055RecManAut = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtRecPrdDscf_Enabled = edtRecPrdDscf_Enabled ;
      defedtPrdNum_Enabled = edtPrdNum_Enabled ;
      defedtCantProduc_Enabled = edtCantProduc_Enabled ;
      defedtPrdRGB_Enabled = edtPrdRGB_Enabled ;
      defedtRecFabId_Enabled = edtRecFabId_Enabled ;
      defedtPrdCantOrg_Enabled = edtPrdCantOrg_Enabled ;
      defedtRecPesFec_Enabled = edtRecPesFec_Enabled ;
      defedtRecLinUsr_Enabled = edtRecLinUsr_Enabled ;
      defedtPrdLote_Enabled = edtPrdLote_Enabled ;
      defedtRecProv_Enabled = edtRecProv_Enabled ;
      defedtPrdCanMac_Enabled = edtPrdCanMac_Enabled ;
      defedtRecPorAny_Enabled = edtRecPorAny_Enabled ;
      defedtRecUltAny_Enabled = edtRecUltAny_Enabled ;
      defedtRecAnyTie_Enabled = edtRecAnyTie_Enabled ;
      defedtRecFecMov_Enabled = edtRecFecMov_Enabled ;
      defedtRecAcc_Enabled = edtRecAcc_Enabled ;
      defedtRecPes_Enabled = edtRecPes_Enabled ;
      defedtRecLinRea_Enabled = edtRecLinRea_Enabled ;
      defedtRecSalVol_Enabled = edtRecSalVol_Enabled ;
      defchkPrdSalM_Enabled = chkPrdSalM.getEnabled() ;
      defedtRecSalMP_Enabled = edtRecSalMP_Enabled ;
      defedtRecMar_Enabled = edtRecMar_Enabled ;
      defedtRecMar_Forecolor = edtRecMar_Forecolor ;
      defedtRecCanEns_Enabled = edtRecCanEns_Enabled ;
      defedtPrdCanRes_Enabled = edtPrdCanRes_Enabled ;
      defedtPrdCanRes_Forecolor = edtPrdCanRes_Forecolor ;
      defedtPrdExiAlm_Enabled = edtPrdExiAlm_Enabled ;
      defedtPrdExiAlm_Forecolor = edtPrdExiAlm_Forecolor ;
      defedtRecPrdFind_Enabled = edtRecPrdFind_Enabled ;
      defedtPrdExiCC_Enabled = edtPrdExiCC_Enabled ;
      defedtPrdExiCC_Forecolor = edtPrdExiCC_Forecolor ;
      defedtCanRes_Enabled = edtCanRes_Enabled ;
      defedtRecPrdTnq_Forecolor = edtRecPrdTnq_Forecolor ;
      defedtRecForNro_Forecolor = edtRecForNro_Forecolor ;
      defedtRecLote_Enabled = edtRecLote_Enabled ;
      defedtRecManAut_Enabled = edtRecManAut_Enabled ;
      defedtPrdCant_Enabled = edtPrdCant_Enabled ;
      defedtPrdCant_Forecolor = edtPrdCant_Forecolor ;
      defedtForPrdDsc_Forecolor = edtForPrdDsc_Forecolor ;
      defedtForPrdUMe_Forecolor = edtForPrdUMe_Forecolor ;
      defedtFacCon_Forecolor = edtFacCon_Forecolor ;
      defedtRecPrdDsc_Forecolor = edtRecPrdDsc_Forecolor ;
      defedtRecPrdNum_Forecolor = edtRecPrdNum_Forecolor ;
      defedtRecLin_Enabled = edtRecLin_Enabled ;
      defedtRecLin_Forecolor = edtRecLin_Forecolor ;
   }

   public void confirmValues1RG0( )
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
         httpContext.changePostValue( "Z5725RecLote_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z5725RecLote_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5725RecLote_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z686PrdCant_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z686PrdCant_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z686PrdCant_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z875RecPrdDsc_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z875RecPrdDsc_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z875RecPrdDsc_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z14055RecManAut_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z14055RecManAut_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14055RecManAut_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z872RecPrdNum_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z872RecPrdNum_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z872RecPrdNum_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z431FacCon_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z431FacCon_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z431FacCon_"+sGXsfl_51_idx) ;
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
         httpContext.changePostValue( "Z11708RecProv_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z11708RecProv_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11708RecProv_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z4576RecLinUsr_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z4576RecLinUsr_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4576RecLinUsr_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z4577RecPesFec_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z4577RecPesFec_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4577RecPesFec_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z12710PrdCantOrg_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z12710PrdCantOrg_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12710PrdCantOrg_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z12717RecFabId_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z12717RecFabId_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12717RecFabId_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z13938RecLoteFch_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z13938RecLoteFch_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13938RecLoteFch_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z13937RecLotAlm_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z13937RecLotAlm_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13937RecLotAlm_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z490ForPrdUMe_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_51_idx) ;
      }
      httpContext.changePostValue( "O14055RecManAut", httpContext.cgiGet( "T14055RecManAut")) ;
      httpContext.deletePostValue( "T14055RecManAut") ;
      httpContext.changePostValue( "O5725RecLote", httpContext.cgiGet( "T5725RecLote")) ;
      httpContext.deletePostValue( "T5725RecLote") ;
      httpContext.changePostValue( "O431FacCon", httpContext.cgiGet( "T431FacCon")) ;
      httpContext.deletePostValue( "T431FacCon") ;
      httpContext.changePostValue( "O686PrdCant", httpContext.cgiGet( "T686PrdCant")) ;
      httpContext.deletePostValue( "T686PrdCant") ;
      httpContext.changePostValue( "O238CanRes", httpContext.cgiGet( "T238CanRes")) ;
      httpContext.deletePostValue( "T238CanRes") ;
      httpContext.changePostValue( "O2394RecForNro", httpContext.cgiGet( "T2394RecForNro")) ;
      httpContext.deletePostValue( "T2394RecForNro") ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientoproductosreceta_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV49BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV50BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV51BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV14RecLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15RecLinPro,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV27TotKgs)),GXutil.URLEncode(GXutil.ltrimstr(AV28Volumen,5,0)),GXutil.URLEncode(GXutil.formatDateParm(AV31FecPan)),GXutil.URLEncode(GXutil.rtrim(AV25BarNHdr)),GXutil.URLEncode(GXutil.rtrim(AV26ProForDsc)),GXutil.URLEncode(GXutil.rtrim(AV54Proforfab)),GXutil.URLEncode(GXutil.rtrim(AV69Modif2))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","RecLinPro","TotKgs","Volumen","FecPan","BarNHdr","ProForDsc","Proforfab","Modif2"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14RecLinMaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINPRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15RecLinPro), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNHDR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25BarNHdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ProForDsc, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MantenimientoProductosReceta_TRN");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientoproductosreceta_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV81DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV81DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vRECPRDNUM_DATA", AV80RecPrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vRECPRDNUM_DATA", AV80RecPrdNum_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTKGS", GXutil.ltrim( localUtil.ntoc( AV27TotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKGS", getSecureSignedToken( "", localUtil.format( AV27TotKgs, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLUMEN", GXutil.ltrim( localUtil.ntoc( AV28Volumen, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLUMEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28Volumen), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECPAN", localUtil.dtoc( AV31FecPan, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECPAN", getSecureSignedToken( "", AV31FecPan));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROFORFAB", GXutil.rtrim( AV54Proforfab));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORFAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54Proforfab, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODIF2", GXutil.rtrim( AV69Modif2));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV49BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV50BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV50BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV51BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODIF", GXutil.rtrim( AV32Modif));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV82Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFACCON", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTEMALHA", GXutil.ltrim( localUtil.ntoc( AV43Artemalha, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOCANTIDAD", GXutil.ltrim( localUtil.ntoc( AV21NoCantidad, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV37Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLOTE01", GXutil.ltrim( localUtil.ntoc( AV46Lote01, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDRECLOTE", GXutil.rtrim( AV71oldRecLote));
      app.GxWebStd.gx_hidden_field( httpContext, "vCANTOLD", GXutil.ltrim( localUtil.ntoc( AV61Cantold, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCANRESOLD", GXutil.ltrim( localUtil.ntoc( AV74CanResold, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS1", AV65Inc_obs1);
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS2", AV66Inc_obs2);
      app.GxWebStd.gx_hidden_field( httpContext, "vRECMANAUTOLD", GXutil.rtrim( AV77RecManAutold));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV76Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "VALCOD", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vELIMINARRECETA", GXutil.ltrim( localUtil.ntoc( AV47EliminarReceta, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSGERR", AV52msgErr);
      app.GxWebStd.gx_hidden_field( httpContext, "vERR_UND", GXutil.ltrim( localUtil.ntoc( AV35Err_und, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALMCC", GXutil.ltrim( localUtil.ntoc( AV38AlmCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV19UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV18Station));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLOTEFCH", localUtil.dtoc( A13938RecLoteFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLOTALM", GXutil.ltrim( localUtil.ntoc( A13937RecLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUMEFO", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_RECPRDNUM_Objectcall", GXutil.rtrim( Combo_recprdnum_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_RECPRDNUM_Cls", GXutil.rtrim( Combo_recprdnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_RECPRDNUM_Enabled", GXutil.booltostr( Combo_recprdnum_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_RECPRDNUM_Titlecontrolidtoreplace", GXutil.rtrim( Combo_recprdnum_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_RECPRDNUM_Isgriditem", GXutil.booltostr( Combo_recprdnum_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_RECPRDNUM_Emptyitem", GXutil.booltostr( Combo_recprdnum_Emptyitem));
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
      return formatLink("app.mantenimientoproductosreceta_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV49BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV50BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV51BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV14RecLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15RecLinPro,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV27TotKgs)),GXutil.URLEncode(GXutil.ltrimstr(AV28Volumen,5,0)),GXutil.URLEncode(GXutil.formatDateParm(AV31FecPan)),GXutil.URLEncode(GXutil.rtrim(AV25BarNHdr)),GXutil.URLEncode(GXutil.rtrim(AV26ProForDsc)),GXutil.URLEncode(GXutil.rtrim(AV54Proforfab)),GXutil.URLEncode(GXutil.rtrim(AV69Modif2))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","RecLinPro","TotKgs","Volumen","FecPan","BarNHdr","ProForDsc","Proforfab","Modif2"})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoProductosReceta_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento de Productos (Receta)", "") ;
   }

   public void initializeNonKey1RG409( )
   {
   }

   public void initAll1RG409( )
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
      initializeNonKey1RG409( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1RG410( )
   {
      A5725RecLote = "" ;
      A490ForPrdUMe = (byte)(0) ;
      n490ForPrdUMe = false ;
      A686PrdCant = DecimalUtil.ZERO ;
      A875RecPrdDsc = "" ;
      A719PrdNum = "" ;
      n719PrdNum = false ;
      AV71oldRecLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71oldRecLote", AV71oldRecLote);
      AV61Cantold = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Cantold", GXutil.ltrimstr( AV61Cantold, 11, 3));
      AV74CanResold = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74CanResold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74CanResold), 4, 0));
      AV65Inc_obs1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Inc_obs1", AV65Inc_obs1);
      AV66Inc_obs2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Inc_obs2", AV66Inc_obs2);
      AV76Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76Inc_obs", AV76Inc_obs);
      AV77RecManAutold = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77RecManAutold", AV77RecManAutold);
      A14055RecManAut = "" ;
      A238CanRes = DecimalUtil.ZERO ;
      A13832CantProduc = DecimalUtil.ZERO ;
      A874RecPrdFind = "" ;
      n874RecPrdFind = false ;
      A13897RecPrdDscf = "" ;
      A872RecPrdNum = "" ;
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      A431FacCon = DecimalUtil.ZERO ;
      A2394RecForNro = (byte)(0) ;
      A3274RecPrdTnq = (byte)(0) ;
      A856ValCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A3938RecCanEns = DecimalUtil.ZERO ;
      A4024RecMar = (byte)(0) ;
      A5422RecSalMP = (short)(0) ;
      A5418PrdSalM = "" ;
      A5467RecSalVol = 0 ;
      A5527RecLinRea = "" ;
      A8934RecPes = (byte)(0) ;
      A8937RecAcc = "" ;
      A3804RecFecMov = GXutil.nullDate() ;
      A3805RecAnyTie = (short)(0) ;
      A3806RecUltAny = DecimalUtil.ZERO ;
      A3807RecPorAny = DecimalUtil.ZERO ;
      A4900PrdCanMac = DecimalUtil.ZERO ;
      A11708RecProv = 0 ;
      A10881PrdLote = "" ;
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A12710PrdCantOrg = DecimalUtil.ZERO ;
      A12717RecFabId = 0 ;
      A13232PrdRGB = 0 ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A13938RecLoteFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A13938RecLoteFch", localUtil.format(A13938RecLoteFch, "99/99/99"));
      A13937RecLotAlm = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13937RecLotAlm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13937RecLotAlm), 4, 0));
      A4338PrdUMeFo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
      AV52msgErr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52msgErr", AV52msgErr);
      A707PrdFacCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
      O14055RecManAut = A14055RecManAut ;
      O5725RecLote = A5725RecLote ;
      O431FacCon = A431FacCon ;
      O686PrdCant = A686PrdCant ;
      O238CanRes = A238CanRes ;
      O2394RecForNro = A2394RecForNro ;
      Z5725RecLote = "" ;
      Z686PrdCant = DecimalUtil.ZERO ;
      Z875RecPrdDsc = "" ;
      Z14055RecManAut = "" ;
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
      Z13938RecLoteFch = GXutil.nullDate() ;
      Z13937RecLotAlm = (short)(0) ;
      Z719PrdNum = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll1RG410( )
   {
      A811RecLin = (short)(0) ;
      initializeNonKey1RG410( ) ;
   }

   public void standaloneModalInsert1RG410( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211693240", true, true);
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
      httpContext.AddJavascriptSource("mantenimientoproductosreceta_trn.js", "?20268211693240", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties410( )
   {
      edtRecPrdDscf_Enabled = defedtRecPrdDscf_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDscf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDscf_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdNum_Enabled = defedtPrdNum_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtCantProduc_Enabled = defedtCantProduc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCantProduc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCantProduc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdRGB_Enabled = defedtPrdRGB_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRGB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRGB_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecFabId_Enabled = defedtRecFabId_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFabId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFabId_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdCantOrg_Enabled = defedtPrdCantOrg_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCantOrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCantOrg_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPesFec_Enabled = defedtRecPesFec_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPesFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPesFec_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecLinUsr_Enabled = defedtRecLinUsr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinUsr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinUsr_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdLote_Enabled = defedtPrdLote_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLote_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecProv_Enabled = defedtRecProv_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecProv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecProv_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdCanMac_Enabled = defedtPrdCanMac_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanMac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanMac_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPorAny_Enabled = defedtRecPorAny_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPorAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPorAny_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecUltAny_Enabled = defedtRecUltAny_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecUltAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecUltAny_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecAnyTie_Enabled = defedtRecAnyTie_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecAnyTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecAnyTie_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecFecMov_Enabled = defedtRecFecMov_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFecMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFecMov_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecAcc_Enabled = defedtRecAcc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecAcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecAcc_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPes_Enabled = defedtRecPes_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPes_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecLinRea_Enabled = defedtRecLinRea_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinRea_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecSalVol_Enabled = defedtRecSalVol_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecSalVol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecSalVol_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      chkPrdSalM.setEnabled( defchkPrdSalM_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdSalM.getInternalname(), "Enabled", GXutil.ltrimstr( chkPrdSalM.getEnabled(), 5, 0), !bGXsfl_51_Refreshing);
      edtRecSalMP_Enabled = defedtRecSalMP_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecSalMP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecSalMP_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecMar_Enabled = defedtRecMar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMar_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecMar_Forecolor = defedtRecMar_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMar_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMar_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      edtRecCanEns_Enabled = defedtRecCanEns_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecCanEns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecCanEns_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdCanRes_Enabled = defedtPrdCanRes_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdCanRes_Forecolor = defedtPrdCanRes_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      edtPrdExiAlm_Enabled = defedtPrdExiAlm_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdExiAlm_Forecolor = defedtPrdExiAlm_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      edtRecPrdFind_Enabled = defedtRecPrdFind_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdFind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdFind_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdExiCC_Enabled = defedtPrdExiCC_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdExiCC_Forecolor = defedtPrdExiCC_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      edtCanRes_Enabled = defedtCanRes_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCanRes_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecPrdTnq_Forecolor = defedtRecPrdTnq_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdTnq_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdTnq_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      edtRecForNro_Forecolor = defedtRecForNro_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecForNro_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecForNro_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      edtRecLote_Enabled = defedtRecLote_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLote_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecManAut_Enabled = defedtRecManAut_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecManAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecManAut_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdCant_Enabled = defedtPrdCant_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPrdCant_Forecolor = defedtPrdCant_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      edtForPrdDsc_Forecolor = defedtForPrdDsc_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      edtForPrdUMe_Forecolor = defedtForPrdUMe_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      edtFacCon_Forecolor = defedtFacCon_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacCon_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCon_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      edtRecPrdDsc_Forecolor = defedtRecPrdDsc_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDsc_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDsc_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      edtRecPrdNum_Forecolor = defedtRecPrdNum_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdNum_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdNum_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
      edtRecLin_Enabled = defedtRecLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLin_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtRecLin_Forecolor = defedtRecLin_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLin_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLin_Forecolor), 9, 0), !bGXsfl_51_Refreshing);
   }

   public void startgridcontrol51( )
   {
      Gridlevel_recContainer.AddObjectProperty("GridName", "Gridlevel_rec");
      Gridlevel_recContainer.AddObjectProperty("Header", subGridlevel_rec_Header);
      Gridlevel_recContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_recContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_rec_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_recContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecLin_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.rtrim( A872RecPrdNum));
      Gridlevel_recColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdNum_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.rtrim( A875RecPrdDsc));
      Gridlevel_recColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtFacCon_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
      Gridlevel_recColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtPrdCant_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.rtrim( A14055RecManAut));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecManAut_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.rtrim( A5725RecLote));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLote_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecForNro_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecForNro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdTnq_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdTnq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A238CanRes, (byte)(8), (byte)(2), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCanRes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.rtrim( A874RecPrdFind));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdFind_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanRes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3938RecCanEns, (byte)(10), (byte)(5), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecCanEns_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4024RecMar, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecMar_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecMar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5422RecSalMP, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecSalMP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.rtrim( A5418PrdSalM));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkPrdSalM.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5467RecSalVol, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecSalVol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.rtrim( A5527RecLinRea));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLinRea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8934RecPes, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.rtrim( A8937RecAcc));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecAcc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", localUtil.format(A3804RecFecMov, "99/99/99"));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecFecMov_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3805RecAnyTie, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecAnyTie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3806RecUltAny, (byte)(11), (byte)(3), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecUltAny_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3807RecPorAny, (byte)(6), (byte)(2), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPorAny_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4900PrdCanMac, (byte)(11), (byte)(3), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCanMac_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11708RecProv, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecProv_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.rtrim( A10881PrdLote));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdLote_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.rtrim( A4576RecLinUsr));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecLinUsr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", localUtil.ttoc( A4577RecPesFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPesFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12710PrdCantOrg, (byte)(11), (byte)(3), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCantOrg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12717RecFabId, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecFabId_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdRGB_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13832CantProduc, (byte)(12), (byte)(2), ".", "")));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCantProduc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_recColumn.AddObjectProperty("Value", GXutil.rtrim( A13897RecPrdDscf));
      Gridlevel_recColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtRecPrdDscf_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddColumnProperties(Gridlevel_recColumn);
      Gridlevel_recContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_rec_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_rec_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_rec_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_rec_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_rec_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_rec_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_recContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_rec_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtavProfordsc_Internalname = "vPROFORDSC" ;
      edtavTotaldekilos_Internalname = "vTOTALDEKILOS" ;
      edtavVolumenreceta_Internalname = "vVOLUMENRECETA" ;
      edtavTipodeproceso_Internalname = "vTIPODEPROCESO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtRecLin_Internalname = "RECLIN" ;
      edtRecPrdNum_Internalname = "RECPRDNUM" ;
      edtRecPrdDsc_Internalname = "RECPRDDSC" ;
      edtFacCon_Internalname = "FACCON" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtPrdCant_Internalname = "PRDCANT" ;
      edtRecManAut_Internalname = "RECMANAUT" ;
      edtRecLote_Internalname = "RECLOTE" ;
      edtRecForNro_Internalname = "RECFORNRO" ;
      edtRecPrdTnq_Internalname = "RECPRDTNQ" ;
      edtCanRes_Internalname = "CANRES" ;
      edtPrdExiCC_Internalname = "PRDEXICC" ;
      edtRecPrdFind_Internalname = "RECPRDFIND" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtPrdCanRes_Internalname = "PRDCANRES" ;
      edtRecCanEns_Internalname = "RECCANENS" ;
      edtRecMar_Internalname = "RECMAR" ;
      edtRecSalMP_Internalname = "RECSALMP" ;
      chkPrdSalM.setInternalname( "PRDSALM" );
      edtRecSalVol_Internalname = "RECSALVOL" ;
      edtRecLinRea_Internalname = "RECLINREA" ;
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
      edtPrdNum_Internalname = "PRDNUM" ;
      edtRecPrdDscf_Internalname = "RECPRDDSCF" ;
      divTableleaflevel_rec_Internalname = "TABLELEAFLEVEL_REC" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_recprdnum_Internalname = "COMBO_RECPRDNUM" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtRecLinMaq_Internalname = "RECLINMAQ" ;
      edtRecLinPro_Internalname = "RECLINPRO" ;
      edtavBarnhdr_Internalname = "vBARNHDR" ;
      edtavReclinmaq_Internalname = "vRECLINMAQ" ;
      edtavReclinpro_Internalname = "vRECLINPRO" ;
      edtavValcos_Internalname = "vVALCOS" ;
      edtavProforlab_Internalname = "vPROFORLAB" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_490_Internalname = "PROMPT_490" ;
      subGridlevel_rec_Internalname = "GRIDLEVEL_REC" ;
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
      subGridlevel_rec_Allowcollapsing = (byte)(0) ;
      subGridlevel_rec_Allowselection = (byte)(0) ;
      subGridlevel_rec_Header = "" ;
      Combo_recprdnum_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Mantenimiento de Productos (Receta)", "") );
      edtRecPrdDscf_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtCantProduc_Jsonclick = "" ;
      edtPrdRGB_Jsonclick = "" ;
      edtRecFabId_Jsonclick = "" ;
      edtPrdCantOrg_Jsonclick = "" ;
      edtRecPesFec_Jsonclick = "" ;
      edtRecLinUsr_Jsonclick = "" ;
      edtPrdLote_Jsonclick = "" ;
      edtRecProv_Jsonclick = "" ;
      edtPrdCanMac_Jsonclick = "" ;
      edtRecPorAny_Jsonclick = "" ;
      edtRecUltAny_Jsonclick = "" ;
      edtRecAnyTie_Jsonclick = "" ;
      edtRecFecMov_Jsonclick = "" ;
      edtRecAcc_Jsonclick = "" ;
      edtRecPes_Jsonclick = "" ;
      edtRecLinRea_Jsonclick = "" ;
      edtRecSalVol_Jsonclick = "" ;
      chkPrdSalM.setCaption( "" );
      edtRecSalMP_Jsonclick = "" ;
      edtRecMar_Jsonclick = "" ;
      edtRecCanEns_Jsonclick = "" ;
      edtPrdCanRes_Jsonclick = "" ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtRecPrdFind_Jsonclick = "" ;
      edtPrdExiCC_Jsonclick = "" ;
      edtCanRes_Jsonclick = "" ;
      edtRecPrdTnq_Jsonclick = "" ;
      edtRecForNro_Jsonclick = "" ;
      edtRecLote_Jsonclick = "" ;
      edtRecManAut_Jsonclick = "" ;
      edtPrdCant_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      imgprompt_490_Visible = 1 ;
      imgprompt_490_Link = "" ;
      imgprompt_490_Visible = 1 ;
      edtForPrdUMe_Jsonclick = "" ;
      edtFacCon_Jsonclick = "" ;
      edtRecPrdDsc_Jsonclick = "" ;
      edtRecPrdNum_Jsonclick = "" ;
      edtRecLin_Jsonclick = "" ;
      subGridlevel_rec_Class = "GridNoBorder WorkWith" ;
      subGridlevel_rec_Backcolorstyle = (byte)(0) ;
      Combo_recprdnum_Titlecontrolidtoreplace = "" ;
      edtRecPrdDscf_Enabled = 0 ;
      edtPrdNum_Enabled = 0 ;
      edtCantProduc_Enabled = 0 ;
      edtPrdRGB_Enabled = 0 ;
      edtRecFabId_Enabled = 0 ;
      edtPrdCantOrg_Enabled = 0 ;
      edtRecPesFec_Enabled = 0 ;
      edtRecLinUsr_Enabled = 0 ;
      edtPrdLote_Enabled = 0 ;
      edtRecProv_Enabled = 0 ;
      edtPrdCanMac_Enabled = 0 ;
      edtRecPorAny_Enabled = 0 ;
      edtRecUltAny_Enabled = 0 ;
      edtRecAnyTie_Enabled = 0 ;
      edtRecFecMov_Enabled = 0 ;
      edtRecAcc_Enabled = 0 ;
      edtRecPes_Enabled = 0 ;
      edtRecLinRea_Enabled = 0 ;
      edtRecSalVol_Enabled = 0 ;
      chkPrdSalM.setEnabled( 0 );
      edtRecSalMP_Enabled = 0 ;
      edtRecMar_Enabled = 0 ;
      edtRecMar_Forecolor = (int)(0x000000) ;
      edtRecCanEns_Enabled = 0 ;
      edtPrdCanRes_Enabled = 0 ;
      edtPrdCanRes_Forecolor = (int)(0x000000) ;
      edtPrdExiAlm_Enabled = 0 ;
      edtPrdExiAlm_Forecolor = (int)(0x000000) ;
      edtRecPrdFind_Enabled = 0 ;
      edtPrdExiCC_Enabled = 0 ;
      edtPrdExiCC_Forecolor = (int)(0x000000) ;
      edtCanRes_Enabled = 0 ;
      edtRecPrdTnq_Enabled = 1 ;
      edtRecPrdTnq_Forecolor = (int)(0x000000) ;
      edtRecForNro_Enabled = 1 ;
      edtRecForNro_Forecolor = (int)(0x000000) ;
      edtRecLote_Enabled = 0 ;
      edtRecManAut_Enabled = 1 ;
      edtPrdCant_Enabled = 1 ;
      edtPrdCant_Forecolor = (int)(0x000000) ;
      edtForPrdDsc_Enabled = 0 ;
      edtForPrdDsc_Forecolor = (int)(0x000000) ;
      edtForPrdUMe_Enabled = 1 ;
      edtForPrdUMe_Forecolor = (int)(0x000000) ;
      edtFacCon_Enabled = 1 ;
      edtFacCon_Forecolor = (int)(0x000000) ;
      edtRecPrdDsc_Enabled = 1 ;
      edtRecPrdDsc_Forecolor = (int)(0x000000) ;
      edtRecPrdNum_Enabled = 1 ;
      edtRecPrdNum_Forecolor = (int)(0x000000) ;
      edtRecLin_Enabled = 1 ;
      edtRecLin_Forecolor = (int)(0x000000) ;
      edtavProforlab_Jsonclick = "" ;
      edtavProforlab_Enabled = 0 ;
      edtavProforlab_Visible = 1 ;
      edtavValcos_Jsonclick = "" ;
      edtavValcos_Enabled = 0 ;
      edtavValcos_Visible = 1 ;
      edtavReclinpro_Jsonclick = "" ;
      edtavReclinpro_Enabled = 0 ;
      edtavReclinpro_Visible = 1 ;
      edtavReclinmaq_Jsonclick = "" ;
      edtavReclinmaq_Enabled = 0 ;
      edtavReclinmaq_Visible = 1 ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 0 ;
      edtavBarnhdr_Visible = 1 ;
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
      Combo_recprdnum_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_recprdnum_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_recprdnum_Cls = "ExtendedCombo" ;
      Combo_recprdnum_Caption = "" ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtavTipodeproceso_Jsonclick = "" ;
      edtavTipodeproceso_Enabled = 0 ;
      edtavVolumenreceta_Jsonclick = "" ;
      edtavVolumenreceta_Enabled = 0 ;
      edtavTotaldekilos_Jsonclick = "" ;
      edtavTotaldekilos_Enabled = 0 ;
      edtavProfordsc_Jsonclick = "" ;
      edtavProfordsc_Enabled = 0 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "Informacion", "") ;
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

   public void gx21asarecprddscf1RG410( String A874RecPrdFind ,
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
         mantenimientoproductosreceta_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         mantenimientoproductosreceta_trn_impl.this.A872RecPrdNum = GXv_char3[0] ;
         mantenimientoproductosreceta_trn_impl.this.GXt_char1 = GXv_char2[0] ;
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

   public void xc_82_1RG410( String A396EmprCod ,
                             String A872RecPrdNum ,
                             java.math.BigDecimal A704PrdExiAlm ,
                             java.math.BigDecimal A685PrdCanRes ,
                             java.math.BigDecimal A686PrdCant ,
                             java.math.BigDecimal A705PrdExiCC ,
                             java.math.BigDecimal AV61Cantold ,
                             short AV38AlmCC ,
                             String AV52msgErr ,
                             String A719PrdNum ,
                             java.math.BigDecimal A431FacCon )
   {
      if ( ( ! (GXutil.strcmp("", A719PrdNum)==0) ) && ( ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) || ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) && true /* After */ ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_decimal20[0] = A704PrdExiAlm ;
         GXv_decimal19[0] = A685PrdCanRes ;
         GXv_decimal17[0] = A686PrdCant ;
         GXv_decimal16[0] = A705PrdExiCC ;
         GXv_decimal15[0] = AV61Cantold ;
         GXv_int8[0] = (byte)(AV38AlmCC) ;
         GXv_char2[0] = AV52msgErr ;
         new app.pctrlcant(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal20, GXv_decimal19, GXv_decimal17, GXv_decimal16, GXv_decimal15, GXv_int8, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A872RecPrdNum = GXv_char3[0] ;
         A704PrdExiAlm = GXv_decimal20[0] ;
         A685PrdCanRes = GXv_decimal19[0] ;
         A686PrdCant = GXv_decimal17[0] ;
         A705PrdExiCC = GXv_decimal16[0] ;
         AV61Cantold = GXv_decimal15[0] ;
         AV38AlmCC = GXv_int8[0] ;
         AV52msgErr = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV61Cantold", GXutil.ltrimstr( AV61Cantold, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV38AlmCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38AlmCC), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV52msgErr", AV52msgErr);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A872RecPrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV61Cantold, (byte)(11), (byte)(3), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV38AlmCC, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV52msgErr)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_83_1RG410( String A396EmprCod ,
                             String A872RecPrdNum ,
                             java.math.BigDecimal AV61Cantold ,
                             java.math.BigDecimal A686PrdCant ,
                             java.math.BigDecimal AV62Totaldekilos ,
                             int AV64VolumenReceta ,
                             short AV30Valcos ,
                             byte A490ForPrdUMe ,
                             java.math.BigDecimal A431FacCon )
   {
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "0") == 0 ) && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_decimal20[0] = AV61Cantold ;
         GXv_decimal19[0] = A686PrdCant ;
         GXv_decimal17[0] = AV62Totaldekilos ;
         GXv_int18[0] = AV64VolumenReceta ;
         GXv_int6[0] = AV30Valcos ;
         GXv_int8[0] = A490ForPrdUMe ;
         new app.preclin0(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal20, GXv_decimal19, GXv_decimal17, GXv_int18, GXv_int6, GXv_int8) ;
         A396EmprCod = GXv_char4[0] ;
         A872RecPrdNum = GXv_char3[0] ;
         AV61Cantold = GXv_decimal20[0] ;
         A686PrdCant = GXv_decimal19[0] ;
         AV62Totaldekilos = GXv_decimal17[0] ;
         AV64VolumenReceta = GXv_int18[0] ;
         AV30Valcos = (short)((short)(GXv_int6[0])) ;
         A490ForPrdUMe = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV61Cantold", GXutil.ltrimstr( AV61Cantold, 11, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV62Totaldekilos", GXutil.ltrimstr( AV62Totaldekilos, 10, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV64VolumenReceta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64VolumenReceta), 5, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Valcos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Valcos), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A872RecPrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV61Cantold, (byte)(11), (byte)(3), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV62Totaldekilos, (byte)(10), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV64VolumenReceta, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV30Valcos, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_84_1RG410( String AV7EmprCod ,
                             String A872RecPrdNum ,
                             java.math.BigDecimal A238CanRes ,
                             short AV74CanResold ,
                             java.math.BigDecimal A686PrdCant )
   {
      if ( ( true /* After */ || true /* After */ ) && ( ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) ) )
      {
         GXv_char4[0] = AV7EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_decimal20[0] = A238CanRes ;
         GXv_decimal19[0] = DecimalUtil.doubleToDec(AV74CanResold) ;
         new app.mantenimientoderecetasregistro_modificocantreservada(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal20, GXv_decimal19) ;
         AV7EmprCod = GXv_char4[0] ;
         A872RecPrdNum = GXv_char3[0] ;
         A238CanRes = GXv_decimal20[0] ;
         AV74CanResold = (short)(DecimalUtil.decToDouble(GXv_decimal19[0])) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri("", false, "AV74CanResold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74CanResold), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV7EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A872RecPrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A238CanRes, (byte)(8), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV74CanResold, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_85_1RG410( String AV7EmprCod ,
                             String A872RecPrdNum ,
                             short AV74CanResold )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = AV7EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_decimal20[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal19[0] = DecimalUtil.doubleToDec(AV74CanResold) ;
         new app.mantenimientoderecetasregistro_modificocantreservada(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal20, GXv_decimal19) ;
         AV7EmprCod = GXv_char4[0] ;
         A872RecPrdNum = GXv_char3[0] ;
         AV74CanResold = (short)(DecimalUtil.decToDouble(GXv_decimal19[0])) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri("", false, "AV74CanResold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74CanResold), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV7EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A872RecPrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV74CanResold, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_86_1RG410( )
   {
      if ( true /* After */ || true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV82Pgmname, 1, 10), AV19UsurCod, AV18Station, AV65Inc_obs1, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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

   public void xc_87_1RG410( )
   {
      if ( true /* After */ && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) != 0 ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV82Pgmname, 1, 10), AV19UsurCod, AV18Station, AV65Inc_obs1, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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

   public void xc_88_1RG410( )
   {
      if ( true /* After */ && ( DecimalUtil.compareTo(A686PrdCant, O686PrdCant) != 0 ) && ( DecimalUtil.compareTo(A431FacCon, O431FacCon) == 0 ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV82Pgmname, 1, 10), AV19UsurCod, AV18Station, AV66Inc_obs2, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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

   public void xc_89_1RG410( )
   {
      if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A5725RecLote, O5725RecLote) != 0 ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV82Pgmname, 1, 10), AV19UsurCod, AV18Station, AV76Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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

   public void xc_92_1RG410( String A396EmprCod ,
                             String AV82Pgmname ,
                             String AV19UsurCod ,
                             String AV18Station ,
                             String AV76Inc_obs ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             String A14055RecManAut )
   {
      if ( ( true /* After */ || true /* After */ ) && ( GXutil.strcmp(A14055RecManAut, O14055RecManAut) != 0 ) )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV82Pgmname, AV19UsurCod, AV18Station, AV76Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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

   public void xc_93_1RG410( String Gx_mode ,
                             String A396EmprCod ,
                             String A872RecPrdNum ,
                             java.math.BigDecimal A686PrdCant )
   {
      if ( true /* After */ && isIns( )  )
      {
         GXv_decimal20[0] = A686PrdCant ;
         GXv_char4[0] = A14055RecManAut ;
         new app.pdyrp036(remoteHandle, context).execute( A396EmprCod, A872RecPrdNum, GXv_decimal20, GXv_char4) ;
         A686PrdCant = GXv_decimal20[0] ;
         A14055RecManAut = GXv_char4[0] ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14055RecManAut))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_rec_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_51410( ) ;
      while ( nGXsfl_51_idx <= nRC_GXsfl_51 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1RG410( ) ;
         standaloneModal1RG410( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1RG410( ) ;
         nGXsfl_51_idx = (int)(nGXsfl_51_idx+1) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_51410( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_recContainer)) ;
      /* End function gxnrGridlevel_rec_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "PRDSALM_" + sGXsfl_51_idx ;
      chkPrdSalM.setName( GXCCtl );
      chkPrdSalM.setWebtags( "" );
      chkPrdSalM.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdSalM.getInternalname(), "TitleCaption", chkPrdSalM.getCaption(), !bGXsfl_51_Refreshing);
      chkPrdSalM.setCheckedValue( "N" );
      A5418PrdSalM = ((GXutil.strcmp(GXutil.rtrim( A5418PrdSalM), "S")==0) ? "S" : "N") ;
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

   public void valid_Reclinmaq( )
   {
      /* Using cursor T01RG30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "RECMAQ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECLINMAQ");
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
      n490ForPrdUMe = false ;
      /* Using cursor T01RG26 */
      pr_default.execute(24, new Object[] {A396EmprCod, A872RecPrdNum});
      if ( (pr_default.getStatus(24) != 101) )
      {
         A874RecPrdFind = T01RG26_A874RecPrdFind[0] ;
         n874RecPrdFind = T01RG26_n874RecPrdFind[0] ;
      }
      else
      {
         A874RecPrdFind = "xxxxxx" ;
         n874RecPrdFind = false ;
      }
      pr_default.close(24);
      if ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 )
      {
         GXt_char1 = A13897RecPrdDscf ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A872RecPrdNum ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         mantenimientoproductosreceta_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         mantenimientoproductosreceta_trn_impl.this.A872RecPrdNum = GXv_char3[0] ;
         mantenimientoproductosreceta_trn_impl.this.GXt_char1 = GXv_char2[0] ;
         A13897RecPrdDscf = GXt_char1 ;
      }
      else
      {
         A13897RecPrdDscf = "" ;
      }
      if ( isIns( )  && true /* After */ && (0==A490ForPrdUMe) )
      {
         A490ForPrdUMe = A4338PrdUMeFo ;
         n490ForPrdUMe = false ;
      }
      if ( true /* After */ && ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 ) && isIns( )  )
      {
         A875RecPrdDsc = A13897RecPrdDscf ;
      }
      if ( true /* After */ && ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") != 0 ) && isIns( )  )
      {
         A719PrdNum = A872RecPrdNum ;
         n719PrdNum = false ;
      }
      /* Using cursor T01RG28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(26) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A704PrdExiAlm = T01RG28_A704PrdExiAlm[0] ;
      A685PrdCanRes = T01RG28_A685PrdCanRes[0] ;
      A5418PrdSalM = T01RG28_A5418PrdSalM[0] ;
      A10881PrdLote = T01RG28_A10881PrdLote[0] ;
      A13232PrdRGB = T01RG28_A13232PrdRGB[0] ;
      A705PrdExiCC = T01RG28_A705PrdExiCC[0] ;
      A4338PrdUMeFo = T01RG28_A4338PrdUMeFo[0] ;
      A707PrdFacCon = T01RG28_A707PrdFacCon[0] ;
      A856ValCod = T01RG28_A856ValCod[0] ;
      pr_default.close(26);
      if ( isIns( )  && (GXutil.strcmp("", A5725RecLote)==0) && ( AV46Lote01 == 1 ) )
      {
         A5725RecLote = A10881PrdLote ;
      }
      AV71oldRecLote = O5725RecLote ;
      if ( ( A856ValCod == 3 ) && ( ! (GXutil.strcmp("", A719PrdNum)==0) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto no valido", ""), 1, "RECPRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecPrdNum_Internalname ;
      }
      if ( (GXutil.strcmp("", A872RecPrdNum)==0) )
      {
         edtRecManAut_Enabled = 0 ;
      }
      else
      {
         if ( ( GXutil.strcmp(A872RecPrdNum, "100000") < 0 ) && ( GXutil.strcmp(A872RecPrdNum, "999999") > 0 ) )
         {
            edtRecManAut_Enabled = 0 ;
         }
         else
         {
            edtRecManAut_Enabled = 1 ;
         }
      }
      if ( ( GXutil.strcmp(A874RecPrdFind, "xxxxxx") == 0 ) && ! (GXutil.strcmp("", A872RecPrdNum)==0) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto Inexistente", ""), 1, "RECPRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecPrdNum_Internalname ;
      }
      dynload_actions( ) ;
      A5418PrdSalM = ((GXutil.strcmp(GXutil.rtrim( A5418PrdSalM), "S")==0) ? "S" : "N") ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", GXutil.rtrim( A874RecPrdFind));
      httpContext.ajax_rsp_assign_attri("", false, "A13897RecPrdDscf", GXutil.rtrim( A13897RecPrdDscf));
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A875RecPrdDsc", GXutil.rtrim( A875RecPrdDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", GXutil.rtrim( A719PrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", GXutil.rtrim( A5418PrdSalM));
      httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", GXutil.rtrim( A10881PrdLote));
      httpContext.ajax_rsp_assign_attri("", false, "A13232PrdRGB", GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5725RecLote", GXutil.rtrim( A5725RecLote));
      httpContext.ajax_rsp_assign_attri("", false, "AV71oldRecLote", GXutil.rtrim( AV71oldRecLote));
      httpContext.ajax_rsp_assign_prop("", false, edtRecManAut_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecManAut_Enabled), 5, 0), !bGXsfl_51_Refreshing);
   }

   public void valid_Forprdume( )
   {
      n490ForPrdUMe = false ;
      n488ForPrdDsc = false ;
      /* Using cursor T01RG27 */
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
      A488ForPrdDsc = T01RG27_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01RG27_n488ForPrdDsc[0] ;
      pr_default.close(25);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) || (0==A490ForPrdUMe) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      if ( ( ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) ) && ( GXutil.strcmp(AV63TipodeProceso, "*") != 0 ) && ( isIns( )  || isUpd( )  ) && ( A431FacCon.doubleValue() > 0 ) )
      {
         A686PrdCant = (A431FacCon.multiply(DecimalUtil.doubleToDec(AV64VolumenReceta))) ;
      }
      else
      {
         if ( ( A490ForPrdUMe == 3 ) && ( GXutil.strcmp(AV63TipodeProceso, "*") != 0 ) && ( isIns( )  || isUpd( )  ) && ( A431FacCon.doubleValue() > 0 ) )
         {
            A686PrdCant = AV62Totaldekilos.multiply(A431FacCon).multiply(DecimalUtil.doubleToDec(AV30Valcos)) ;
         }
      }
      if ( (GXutil.strcmp("", A872RecPrdNum)==0) && ( A490ForPrdUMe > 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO. NO hay PRODUCTO", ""), 0, "RECPRDNUM");
      }
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") <= 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ && ( AV35Err_und == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion no ha entrado UNIDAD=1,2,3", ""), 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      if ( ( A431FacCon.doubleValue() > 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO. NO hay PRODUCTO. Hay Factor, pero NO ha entrado UNIDAD=1,2,3", ""), 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") <= 0 ) && ( A490ForPrdUMe == 0 ) && true /* After */ && ( AV35Err_und == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion no ha entrado UNIDAD=1,2,3", ""), 0, "FORPRDUME");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")));
   }

   public void valid_Prdcant( )
   {
      A13832CantProduc = (A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      A238CanRes = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      AV74CanResold = (short)(DecimalUtil.decToDouble(O238CanRes)) ;
      AV61Cantold = O686PrdCant ;
      if ( true /* After */ && isIns( )  )
      {
         GXv_decimal20[0] = A686PrdCant ;
         GXv_char4[0] = A14055RecManAut ;
         new app.pdyrp036(remoteHandle, context).execute( A396EmprCod, A872RecPrdNum, GXv_decimal20, GXv_char4) ;
         mantenimientoproductosreceta_trn_impl.this.A686PrdCant = GXv_decimal20[0] ;
         A686PrdCant = this.A686PrdCant ;
         mantenimientoproductosreceta_trn_impl.this.A14055RecManAut = GXv_char4[0] ;
         A14055RecManAut = this.A14055RecManAut ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13832CantProduc", GXutil.ltrim( localUtil.ntoc( A13832CantProduc, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrim( localUtil.ntoc( A238CanRes, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV74CanResold", GXutil.ltrim( localUtil.ntoc( AV74CanResold, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV61Cantold", GXutil.ltrim( localUtil.ntoc( AV61Cantold, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14055RecManAut", GXutil.rtrim( A14055RecManAut));
   }

   public void valid_Recmanaut( )
   {
      AV77RecManAutold = O14055RecManAut ;
      if ( ! ( ( GXutil.strcmp(A14055RecManAut, "M") == 0 ) || ( GXutil.strcmp(A14055RecManAut, "A") == 0 ) ) && true /* After */ && ! (GXutil.strcmp("", A872RecPrdNum)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "El valor permitido es M(manual) o A(automatico)", ""), 1, "RECMANAUT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecManAut_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV77RecManAutold", GXutil.rtrim( AV77RecManAutold));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV49BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV50BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV51BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV14RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV15RecLinPro',fld:'vRECLINPRO',pic:'Z9',hsh:true},{av:'AV27TotKgs',fld:'vTOTKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV28Volumen',fld:'vVOLUMEN',pic:'ZZZZ9',hsh:true},{av:'AV31FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV25BarNHdr',fld:'vBARNHDR',pic:'',hsh:true},{av:'AV26ProForDsc',fld:'vPROFORDSC',pic:'',hsh:true},{av:'AV54Proforfab',fld:'vPROFORFAB',pic:'',hsh:true},{av:'AV69Modif2',fld:'vMODIF2',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV27TotKgs',fld:'vTOTKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV28Volumen',fld:'vVOLUMEN',pic:'ZZZZ9',hsh:true},{av:'AV31FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV54Proforfab',fld:'vPROFORFAB',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV49BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV50BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV51BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV14RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV15RecLinPro',fld:'vRECLINPRO',pic:'Z9',hsh:true},{av:'AV25BarNHdr',fld:'vBARNHDR',pic:'',hsh:true},{av:'AV26ProForDsc',fld:'vPROFORDSC',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121RG2',iparms:[{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV49BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV50BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV51BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV14RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'AV14RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV51BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV50BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV49BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]}");
      setEventMetadata("VALIDV_TOTALDEKILOS","{handler:'validv_Totaldekilos',iparms:[]");
      setEventMetadata("VALIDV_TOTALDEKILOS",",oparms:[]}");
      setEventMetadata("VALIDV_VOLUMENRECETA","{handler:'validv_Volumenreceta',iparms:[]");
      setEventMetadata("VALIDV_VOLUMENRECETA",",oparms:[]}");
      setEventMetadata("VALIDV_TIPODEPROCESO","{handler:'validv_Tipodeproceso',iparms:[]");
      setEventMetadata("VALIDV_TIPODEPROCESO",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_RECLINMAQ","{handler:'valid_Reclinmaq',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'}]");
      setEventMetadata("VALID_RECLINMAQ",",oparms:[]}");
      setEventMetadata("VALID_RECLINPRO","{handler:'valid_Reclinpro',iparms:[]");
      setEventMetadata("VALID_RECLINPRO",",oparms:[]}");
      setEventMetadata("VALIDV_RECLINMAQ","{handler:'validv_Reclinmaq',iparms:[]");
      setEventMetadata("VALIDV_RECLINMAQ",",oparms:[]}");
      setEventMetadata("VALIDV_RECLINPRO","{handler:'validv_Reclinpro',iparms:[]");
      setEventMetadata("VALIDV_RECLINPRO",",oparms:[]}");
      setEventMetadata("VALIDV_VALCOS","{handler:'validv_Valcos',iparms:[]");
      setEventMetadata("VALIDV_VALCOS",",oparms:[]}");
      setEventMetadata("VALID_RECLIN","{handler:'valid_Reclin',iparms:[]");
      setEventMetadata("VALID_RECLIN",",oparms:[]}");
      setEventMetadata("VALID_RECPRDNUM","{handler:'valid_Recprdnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O5725RecLote'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'A874RecPrdFind',fld:'RECPRDFIND',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A10881PrdLote',fld:'PRDLOTE',pic:''},{av:'A5725RecLote',fld:'RECLOTE',pic:''},{av:'AV46Lote01',fld:'vLOTE01',pic:'ZZZ9'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A13897RecPrdDscf',fld:'RECPRDDSCF',pic:''},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A875RecPrdDsc',fld:'RECPRDDSC',pic:''},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'AV71oldRecLote',fld:'vOLDRECLOTE',pic:''}]");
      setEventMetadata("VALID_RECPRDNUM",",oparms:[{av:'A874RecPrdFind',fld:'RECPRDFIND',pic:''},{av:'A13897RecPrdDscf',fld:'RECPRDDSCF',pic:''},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A875RecPrdDsc',fld:'RECPRDDSC',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A10881PrdLote',fld:'PRDLOTE',pic:''},{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A5725RecLote',fld:'RECLOTE',pic:''},{av:'AV71oldRecLote',fld:'vOLDRECLOTE',pic:''},{av:'edtRecManAut_Enabled',ctrl:'RECMANAUT',prop:'Enabled'}]}");
      setEventMetadata("VALID_RECPRDDSC","{handler:'valid_Recprddsc',iparms:[]");
      setEventMetadata("VALID_RECPRDDSC",",oparms:[]}");
      setEventMetadata("VALID_FACCON","{handler:'valid_Faccon',iparms:[]");
      setEventMetadata("VALID_FACCON",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A431FacCon',fld:'FACCON',pic:'ZZZZ9.99999'},{av:'AV64VolumenReceta',fld:'vVOLUMENRECETA',pic:'ZZZZ9'},{av:'AV63TipodeProceso',fld:'vTIPODEPROCESO',pic:''},{av:'AV62Totaldekilos',fld:'vTOTALDEKILOS',pic:'ZZZZZZ9.99'},{av:'AV30Valcos',fld:'vVALCOS',pic:'ZZZ9'},{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'A686PrdCant',fld:'PRDCANT',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'A686PrdCant',fld:'PRDCANT',pic:'ZZZZZZ9.999'}]}");
      setEventMetadata("VALID_PRDCANT","{handler:'valid_Prdcant',iparms:[{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O686PrdCant'},{av:'O238CanRes'},{av:'A686PrdCant',fld:'PRDCANT',pic:'ZZZZZZ9.999'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A238CanRes',fld:'CANRES',pic:'ZZZZ9.99'},{av:'A13832CantProduc',fld:'CANTPRODUC',pic:'ZZZZZZZZ9.99'},{av:'AV74CanResold',fld:'vCANRESOLD',pic:'ZZZ9'},{av:'AV61Cantold',fld:'vCANTOLD',pic:'ZZZZZZ9.999'},{av:'A14055RecManAut',fld:'RECMANAUT',pic:''}]");
      setEventMetadata("VALID_PRDCANT",",oparms:[{av:'A13832CantProduc',fld:'CANTPRODUC',pic:'ZZZZZZZZ9.99'},{av:'A238CanRes',fld:'CANRES',pic:'ZZZZ9.99'},{av:'AV74CanResold',fld:'vCANRESOLD',pic:'ZZZ9'},{av:'AV61Cantold',fld:'vCANTOLD',pic:'ZZZZZZ9.999'},{av:'A686PrdCant',fld:'PRDCANT',pic:'ZZZZZZ9.999'},{av:'A14055RecManAut',fld:'RECMANAUT',pic:''}]}");
      setEventMetadata("VALID_RECMANAUT","{handler:'valid_Recmanaut',iparms:[{av:'O14055RecManAut'},{av:'A14055RecManAut',fld:'RECMANAUT',pic:''},{av:'AV77RecManAutold',fld:'vRECMANAUTOLD',pic:''}]");
      setEventMetadata("VALID_RECMANAUT",",oparms:[{av:'AV77RecManAutold',fld:'vRECMANAUTOLD',pic:''}]}");
      setEventMetadata("VALID_RECLOTE","{handler:'valid_Reclote',iparms:[]");
      setEventMetadata("VALID_RECLOTE",",oparms:[]}");
      setEventMetadata("VALID_RECFORNRO","{handler:'valid_Recfornro',iparms:[]");
      setEventMetadata("VALID_RECFORNRO",",oparms:[]}");
      setEventMetadata("VALID_CANRES","{handler:'valid_Canres',iparms:[]");
      setEventMetadata("VALID_CANRES",",oparms:[]}");
      setEventMetadata("VALID_PRDEXICC","{handler:'valid_Prdexicc',iparms:[]");
      setEventMetadata("VALID_PRDEXICC",",oparms:[]}");
      setEventMetadata("VALID_RECPRDFIND","{handler:'valid_Recprdfind',iparms:[]");
      setEventMetadata("VALID_RECPRDFIND",",oparms:[]}");
      setEventMetadata("VALID_PRDEXIALM","{handler:'valid_Prdexialm',iparms:[]");
      setEventMetadata("VALID_PRDEXIALM",",oparms:[]}");
      setEventMetadata("VALID_PRDCANRES","{handler:'valid_Prdcanres',iparms:[]");
      setEventMetadata("VALID_PRDCANRES",",oparms:[]}");
      setEventMetadata("VALID_RECMAR","{handler:'valid_Recmar',iparms:[]");
      setEventMetadata("VALID_RECMAR",",oparms:[]}");
      setEventMetadata("VALID_PRDLOTE","{handler:'valid_Prdlote',iparms:[]");
      setEventMetadata("VALID_PRDLOTE",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Recprddscf',iparms:[]");
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
      pr_default.close(26);
      pr_default.close(25);
      pr_default.close(24);
      pr_default.close(28);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV51BarCodPar = "" ;
      wcpOAV27TotKgs = DecimalUtil.ZERO ;
      wcpOAV31FecPan = GXutil.nullDate() ;
      wcpOAV25BarNHdr = "" ;
      wcpOAV26ProForDsc = "" ;
      wcpOAV54Proforfab = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z5725RecLote = "" ;
      Z686PrdCant = DecimalUtil.ZERO ;
      Z875RecPrdDsc = "" ;
      Z14055RecManAut = "" ;
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
      Z13938RecLoteFch = GXutil.nullDate() ;
      Z719PrdNum = "" ;
      O14055RecManAut = "" ;
      O5725RecLote = "" ;
      O431FacCon = DecimalUtil.ZERO ;
      O686PrdCant = DecimalUtil.ZERO ;
      O238CanRes = DecimalUtil.ZERO ;
      N5725RecLote = "" ;
      N686PrdCant = DecimalUtil.ZERO ;
      N14055RecManAut = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A872RecPrdNum = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      AV61Cantold = DecimalUtil.ZERO ;
      AV52msgErr = "" ;
      A719PrdNum = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      AV62Totaldekilos = DecimalUtil.ZERO ;
      AV7EmprCod = "" ;
      A238CanRes = DecimalUtil.ZERO ;
      AV82Pgmname = "" ;
      AV19UsurCod = "" ;
      AV18Station = "" ;
      AV76Inc_obs = "" ;
      A130BarCodPar = "" ;
      A14055RecManAut = "" ;
      Gx_mode = "" ;
      A874RecPrdFind = "" ;
      AV51BarCodPar = "" ;
      AV27TotKgs = DecimalUtil.ZERO ;
      AV31FecPan = GXutil.nullDate() ;
      AV25BarNHdr = "" ;
      AV26ProForDsc = "" ;
      AV54Proforfab = "" ;
      AV69Modif2 = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      AV21NoCantidad = DecimalUtil.ZERO ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      AV63TipodeProceso = "" ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      ucCombo_recprdnum = new com.genexus.webpanels.GXUserControl();
      AV81DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV80RecPrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV58ProForLab = "" ;
      Gridlevel_recContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode410 = "" ;
      sStyleString = "" ;
      AV32Modif = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      AV71oldRecLote = "" ;
      AV65Inc_obs1 = "" ;
      AV66Inc_obs2 = "" ;
      AV77RecManAutold = "" ;
      A13938RecLoteFch = GXutil.nullDate() ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_recprdnum_Objectcall = "" ;
      Combo_recprdnum_Class = "" ;
      Combo_recprdnum_Icontype = "" ;
      Combo_recprdnum_Icon = "" ;
      Combo_recprdnum_Tooltip = "" ;
      Combo_recprdnum_Selectedvalue_set = "" ;
      Combo_recprdnum_Selectedvalue_get = "" ;
      Combo_recprdnum_Selectedtext_set = "" ;
      Combo_recprdnum_Selectedtext_get = "" ;
      Combo_recprdnum_Gamoauthtoken = "" ;
      Combo_recprdnum_Ddointernalname = "" ;
      Combo_recprdnum_Titlecontrolalign = "" ;
      Combo_recprdnum_Dropdownoptionstype = "" ;
      Combo_recprdnum_Datalisttype = "" ;
      Combo_recprdnum_Datalistfixedvalues = "" ;
      Combo_recprdnum_Datalistproc = "" ;
      Combo_recprdnum_Datalistprocparametersprefix = "" ;
      Combo_recprdnum_Remoteservicesparameters = "" ;
      Combo_recprdnum_Htmltemplate = "" ;
      Combo_recprdnum_Multiplevaluestype = "" ;
      Combo_recprdnum_Loadingdata = "" ;
      Combo_recprdnum_Noresultsfound = "" ;
      Combo_recprdnum_Emptyitemtext = "" ;
      Combo_recprdnum_Onlyselectedvalues = "" ;
      Combo_recprdnum_Selectalltext = "" ;
      Combo_recprdnum_Multiplevaluesseparator = "" ;
      Combo_recprdnum_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode409 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sV32Modif = "" ;
      OV32Modif = "" ;
      GXCCtl = "" ;
      A875RecPrdDsc = "" ;
      A488ForPrdDsc = "" ;
      A5725RecLote = "" ;
      A3938RecCanEns = DecimalUtil.ZERO ;
      A5418PrdSalM = "" ;
      A5527RecLinRea = "" ;
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
      A13897RecPrdDscf = "" ;
      T14055RecManAut = "" ;
      T5725RecLote = "" ;
      T431FacCon = DecimalUtil.ZERO ;
      T686PrdCant = DecimalUtil.ZERO ;
      T238CanRes = DecimalUtil.ZERO ;
      AV8EmprNom = "" ;
      AV41MsgErrFactor = "" ;
      AV42Conf = "" ;
      AV45msg_err1 = "" ;
      AV29Modo = "" ;
      AV22WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV23TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV24WebSession = httpContext.getWebSession();
      AV75Prompt = "" ;
      imgPrompt_gximage = "" ;
      imgPrompt_Internalname = "" ;
      AV83Prompt_GXI = "" ;
      GXv_int12 = new short[1] ;
      GXt_objcol_SdtDVB_SDTComboData_Item13 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV79ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item14 = new GXBaseCollection[1] ;
      T01RG10_A1273RecLinPro = new byte[1] ;
      T01RG10_A396EmprCod = new String[] {""} ;
      T01RG10_A129BarCod = new int[1] ;
      T01RG10_A132BarCodReo = new byte[1] ;
      T01RG10_A130BarCodPar = new String[] {""} ;
      T01RG10_A2804RecLinMaq = new short[1] ;
      T01RG9_A396EmprCod = new String[] {""} ;
      T01RG11_A396EmprCod = new String[] {""} ;
      T01RG12_A396EmprCod = new String[] {""} ;
      T01RG12_A129BarCod = new int[1] ;
      T01RG12_A132BarCodReo = new byte[1] ;
      T01RG12_A130BarCodPar = new String[] {""} ;
      T01RG12_A2804RecLinMaq = new short[1] ;
      T01RG12_A1273RecLinPro = new byte[1] ;
      T01RG8_A1273RecLinPro = new byte[1] ;
      T01RG8_A396EmprCod = new String[] {""} ;
      T01RG8_A129BarCod = new int[1] ;
      T01RG8_A132BarCodReo = new byte[1] ;
      T01RG8_A130BarCodPar = new String[] {""} ;
      T01RG8_A2804RecLinMaq = new short[1] ;
      T01RG13_A396EmprCod = new String[] {""} ;
      T01RG13_A129BarCod = new int[1] ;
      T01RG13_A132BarCodReo = new byte[1] ;
      T01RG13_A130BarCodPar = new String[] {""} ;
      T01RG13_A2804RecLinMaq = new short[1] ;
      T01RG13_A1273RecLinPro = new byte[1] ;
      T01RG14_A396EmprCod = new String[] {""} ;
      T01RG14_A129BarCod = new int[1] ;
      T01RG14_A132BarCodReo = new byte[1] ;
      T01RG14_A130BarCodPar = new String[] {""} ;
      T01RG14_A2804RecLinMaq = new short[1] ;
      T01RG14_A1273RecLinPro = new byte[1] ;
      T01RG7_A1273RecLinPro = new byte[1] ;
      T01RG7_A396EmprCod = new String[] {""} ;
      T01RG7_A129BarCod = new int[1] ;
      T01RG7_A132BarCodReo = new byte[1] ;
      T01RG7_A130BarCodPar = new String[] {""} ;
      T01RG7_A2804RecLinMaq = new short[1] ;
      T01RG17_A396EmprCod = new String[] {""} ;
      T01RG17_A129BarCod = new int[1] ;
      T01RG17_A132BarCodReo = new byte[1] ;
      T01RG17_A130BarCodPar = new String[] {""} ;
      T01RG17_A2804RecLinMaq = new short[1] ;
      T01RG17_A1273RecLinPro = new byte[1] ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z685PrdCanRes = DecimalUtil.ZERO ;
      Z5418PrdSalM = "" ;
      Z10881PrdLote = "" ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      Z874RecPrdFind = "" ;
      Z488ForPrdDsc = "" ;
      T01RG18_A129BarCod = new int[1] ;
      T01RG18_A132BarCodReo = new byte[1] ;
      T01RG18_A130BarCodPar = new String[] {""} ;
      T01RG18_A2804RecLinMaq = new short[1] ;
      T01RG18_A1273RecLinPro = new byte[1] ;
      T01RG18_A811RecLin = new short[1] ;
      T01RG18_A5725RecLote = new String[] {""} ;
      T01RG18_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG18_A875RecPrdDsc = new String[] {""} ;
      T01RG18_A14055RecManAut = new String[] {""} ;
      T01RG18_A872RecPrdNum = new String[] {""} ;
      T01RG18_A488ForPrdDsc = new String[] {""} ;
      T01RG18_n488ForPrdDsc = new boolean[] {false} ;
      T01RG18_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG18_A2394RecForNro = new byte[1] ;
      T01RG18_A3274RecPrdTnq = new byte[1] ;
      T01RG18_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG18_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG18_A3938RecCanEns = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG18_A4024RecMar = new byte[1] ;
      T01RG18_A5422RecSalMP = new short[1] ;
      T01RG18_A5418PrdSalM = new String[] {""} ;
      T01RG18_A5467RecSalVol = new int[1] ;
      T01RG18_A5527RecLinRea = new String[] {""} ;
      T01RG18_A8934RecPes = new byte[1] ;
      T01RG18_A8937RecAcc = new String[] {""} ;
      T01RG18_A3804RecFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      T01RG18_A3805RecAnyTie = new short[1] ;
      T01RG18_A3806RecUltAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG18_A3807RecPorAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG18_A4900PrdCanMac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG18_A11708RecProv = new int[1] ;
      T01RG18_A10881PrdLote = new String[] {""} ;
      T01RG18_A4576RecLinUsr = new String[] {""} ;
      T01RG18_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01RG18_A12710PrdCantOrg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG18_A12717RecFabId = new int[1] ;
      T01RG18_A13232PrdRGB = new long[1] ;
      T01RG18_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG18_A13938RecLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01RG18_A13937RecLotAlm = new short[1] ;
      T01RG18_A4338PrdUMeFo = new byte[1] ;
      T01RG18_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG18_A396EmprCod = new String[] {""} ;
      T01RG18_A719PrdNum = new String[] {""} ;
      T01RG18_n719PrdNum = new boolean[] {false} ;
      T01RG18_A490ForPrdUMe = new byte[1] ;
      T01RG18_n490ForPrdUMe = new boolean[] {false} ;
      T01RG18_A856ValCod = new byte[1] ;
      T01RG18_A874RecPrdFind = new String[] {""} ;
      T01RG18_n874RecPrdFind = new boolean[] {false} ;
      T01RG6_A874RecPrdFind = new String[] {""} ;
      T01RG6_n874RecPrdFind = new boolean[] {false} ;
      T01RG5_A488ForPrdDsc = new String[] {""} ;
      T01RG5_n488ForPrdDsc = new boolean[] {false} ;
      T01RG4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG4_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG4_A5418PrdSalM = new String[] {""} ;
      T01RG4_A10881PrdLote = new String[] {""} ;
      T01RG4_A13232PrdRGB = new long[1] ;
      T01RG4_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG4_A4338PrdUMeFo = new byte[1] ;
      T01RG4_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG4_A856ValCod = new byte[1] ;
      T01RG19_A874RecPrdFind = new String[] {""} ;
      T01RG19_n874RecPrdFind = new boolean[] {false} ;
      T01RG20_A488ForPrdDsc = new String[] {""} ;
      T01RG20_n488ForPrdDsc = new boolean[] {false} ;
      T01RG21_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG21_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG21_A5418PrdSalM = new String[] {""} ;
      T01RG21_A10881PrdLote = new String[] {""} ;
      T01RG21_A13232PrdRGB = new long[1] ;
      T01RG21_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG21_A4338PrdUMeFo = new byte[1] ;
      T01RG21_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG21_A856ValCod = new byte[1] ;
      T01RG22_A396EmprCod = new String[] {""} ;
      T01RG22_A129BarCod = new int[1] ;
      T01RG22_A132BarCodReo = new byte[1] ;
      T01RG22_A130BarCodPar = new String[] {""} ;
      T01RG22_A2804RecLinMaq = new short[1] ;
      T01RG22_A1273RecLinPro = new byte[1] ;
      T01RG22_A811RecLin = new short[1] ;
      T01RG3_A129BarCod = new int[1] ;
      T01RG3_A132BarCodReo = new byte[1] ;
      T01RG3_A130BarCodPar = new String[] {""} ;
      T01RG3_A2804RecLinMaq = new short[1] ;
      T01RG3_A1273RecLinPro = new byte[1] ;
      T01RG3_A811RecLin = new short[1] ;
      T01RG3_A5725RecLote = new String[] {""} ;
      T01RG3_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG3_A875RecPrdDsc = new String[] {""} ;
      T01RG3_A14055RecManAut = new String[] {""} ;
      T01RG3_A872RecPrdNum = new String[] {""} ;
      T01RG3_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG3_A2394RecForNro = new byte[1] ;
      T01RG3_A3274RecPrdTnq = new byte[1] ;
      T01RG3_A3938RecCanEns = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG3_A4024RecMar = new byte[1] ;
      T01RG3_A5422RecSalMP = new short[1] ;
      T01RG3_A5467RecSalVol = new int[1] ;
      T01RG3_A5527RecLinRea = new String[] {""} ;
      T01RG3_A8934RecPes = new byte[1] ;
      T01RG3_A8937RecAcc = new String[] {""} ;
      T01RG3_A3804RecFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      T01RG3_A3805RecAnyTie = new short[1] ;
      T01RG3_A3806RecUltAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG3_A3807RecPorAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG3_A4900PrdCanMac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG3_A11708RecProv = new int[1] ;
      T01RG3_A4576RecLinUsr = new String[] {""} ;
      T01RG3_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01RG3_A12710PrdCantOrg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG3_A12717RecFabId = new int[1] ;
      T01RG3_A13938RecLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01RG3_A13937RecLotAlm = new short[1] ;
      T01RG3_A396EmprCod = new String[] {""} ;
      T01RG3_A719PrdNum = new String[] {""} ;
      T01RG3_n719PrdNum = new boolean[] {false} ;
      T01RG3_A490ForPrdUMe = new byte[1] ;
      T01RG3_n490ForPrdUMe = new boolean[] {false} ;
      T01RG2_A129BarCod = new int[1] ;
      T01RG2_A132BarCodReo = new byte[1] ;
      T01RG2_A130BarCodPar = new String[] {""} ;
      T01RG2_A2804RecLinMaq = new short[1] ;
      T01RG2_A1273RecLinPro = new byte[1] ;
      T01RG2_A811RecLin = new short[1] ;
      T01RG2_A5725RecLote = new String[] {""} ;
      T01RG2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG2_A875RecPrdDsc = new String[] {""} ;
      T01RG2_A14055RecManAut = new String[] {""} ;
      T01RG2_A872RecPrdNum = new String[] {""} ;
      T01RG2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG2_A2394RecForNro = new byte[1] ;
      T01RG2_A3274RecPrdTnq = new byte[1] ;
      T01RG2_A3938RecCanEns = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG2_A4024RecMar = new byte[1] ;
      T01RG2_A5422RecSalMP = new short[1] ;
      T01RG2_A5467RecSalVol = new int[1] ;
      T01RG2_A5527RecLinRea = new String[] {""} ;
      T01RG2_A8934RecPes = new byte[1] ;
      T01RG2_A8937RecAcc = new String[] {""} ;
      T01RG2_A3804RecFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      T01RG2_A3805RecAnyTie = new short[1] ;
      T01RG2_A3806RecUltAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG2_A3807RecPorAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG2_A4900PrdCanMac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG2_A11708RecProv = new int[1] ;
      T01RG2_A4576RecLinUsr = new String[] {""} ;
      T01RG2_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01RG2_A12710PrdCantOrg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG2_A12717RecFabId = new int[1] ;
      T01RG2_A13938RecLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01RG2_A13937RecLotAlm = new short[1] ;
      T01RG2_A396EmprCod = new String[] {""} ;
      T01RG2_A719PrdNum = new String[] {""} ;
      T01RG2_n719PrdNum = new boolean[] {false} ;
      T01RG2_A490ForPrdUMe = new byte[1] ;
      T01RG2_n490ForPrdUMe = new boolean[] {false} ;
      T01RG26_A874RecPrdFind = new String[] {""} ;
      T01RG26_n874RecPrdFind = new boolean[] {false} ;
      T01RG27_A488ForPrdDsc = new String[] {""} ;
      T01RG27_n488ForPrdDsc = new boolean[] {false} ;
      T01RG28_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG28_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG28_A5418PrdSalM = new String[] {""} ;
      T01RG28_A10881PrdLote = new String[] {""} ;
      T01RG28_A13232PrdRGB = new long[1] ;
      T01RG28_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG28_A4338PrdUMeFo = new byte[1] ;
      T01RG28_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RG28_A856ValCod = new byte[1] ;
      T01RG29_A396EmprCod = new String[] {""} ;
      T01RG29_A129BarCod = new int[1] ;
      T01RG29_A132BarCodReo = new byte[1] ;
      T01RG29_A130BarCodPar = new String[] {""} ;
      T01RG29_A2804RecLinMaq = new short[1] ;
      T01RG29_A1273RecLinPro = new byte[1] ;
      T01RG29_A811RecLin = new short[1] ;
      Gridlevel_recRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_rec_Linesclass = "" ;
      ROClassString = "" ;
      imgprompt_490_gximage = "" ;
      sImgUrl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_recColumn = new com.genexus.webpanels.GXWebColumn();
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_int18 = new int[1] ;
      GXv_int6 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_decimal19 = new java.math.BigDecimal[1] ;
      T01RG30_A396EmprCod = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z13897RecPrdDscf = "" ;
      ZV71oldRecLote = "" ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      Z13832CantProduc = DecimalUtil.ZERO ;
      Z238CanRes = DecimalUtil.ZERO ;
      ZV61Cantold = DecimalUtil.ZERO ;
      ZV77RecManAutold = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.mantenimientoproductosreceta_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.mantenimientoproductosreceta_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.mantenimientoproductosreceta_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.mantenimientoproductosreceta_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientoproductosreceta_trn__default(),
         new Object[] {
             new Object[] {
            T01RG2_A129BarCod, T01RG2_A132BarCodReo, T01RG2_A130BarCodPar, T01RG2_A2804RecLinMaq, T01RG2_A1273RecLinPro, T01RG2_A811RecLin, T01RG2_A5725RecLote, T01RG2_A686PrdCant, T01RG2_A875RecPrdDsc, T01RG2_A14055RecManAut,
            T01RG2_A872RecPrdNum, T01RG2_A431FacCon, T01RG2_A2394RecForNro, T01RG2_A3274RecPrdTnq, T01RG2_A3938RecCanEns, T01RG2_A4024RecMar, T01RG2_A5422RecSalMP, T01RG2_A5467RecSalVol, T01RG2_A5527RecLinRea, T01RG2_A8934RecPes,
            T01RG2_A8937RecAcc, T01RG2_A3804RecFecMov, T01RG2_A3805RecAnyTie, T01RG2_A3806RecUltAny, T01RG2_A3807RecPorAny, T01RG2_A4900PrdCanMac, T01RG2_A11708RecProv, T01RG2_A4576RecLinUsr, T01RG2_A4577RecPesFec, T01RG2_A12710PrdCantOrg,
            T01RG2_A12717RecFabId, T01RG2_A13938RecLoteFch, T01RG2_A13937RecLotAlm, T01RG2_A396EmprCod, T01RG2_A719PrdNum, T01RG2_n719PrdNum, T01RG2_A490ForPrdUMe, T01RG2_n490ForPrdUMe
            }
            , new Object[] {
            T01RG3_A129BarCod, T01RG3_A132BarCodReo, T01RG3_A130BarCodPar, T01RG3_A2804RecLinMaq, T01RG3_A1273RecLinPro, T01RG3_A811RecLin, T01RG3_A5725RecLote, T01RG3_A686PrdCant, T01RG3_A875RecPrdDsc, T01RG3_A14055RecManAut,
            T01RG3_A872RecPrdNum, T01RG3_A431FacCon, T01RG3_A2394RecForNro, T01RG3_A3274RecPrdTnq, T01RG3_A3938RecCanEns, T01RG3_A4024RecMar, T01RG3_A5422RecSalMP, T01RG3_A5467RecSalVol, T01RG3_A5527RecLinRea, T01RG3_A8934RecPes,
            T01RG3_A8937RecAcc, T01RG3_A3804RecFecMov, T01RG3_A3805RecAnyTie, T01RG3_A3806RecUltAny, T01RG3_A3807RecPorAny, T01RG3_A4900PrdCanMac, T01RG3_A11708RecProv, T01RG3_A4576RecLinUsr, T01RG3_A4577RecPesFec, T01RG3_A12710PrdCantOrg,
            T01RG3_A12717RecFabId, T01RG3_A13938RecLoteFch, T01RG3_A13937RecLotAlm, T01RG3_A396EmprCod, T01RG3_A719PrdNum, T01RG3_n719PrdNum, T01RG3_A490ForPrdUMe, T01RG3_n490ForPrdUMe
            }
            , new Object[] {
            T01RG4_A704PrdExiAlm, T01RG4_A685PrdCanRes, T01RG4_A5418PrdSalM, T01RG4_A10881PrdLote, T01RG4_A13232PrdRGB, T01RG4_A705PrdExiCC, T01RG4_A4338PrdUMeFo, T01RG4_A707PrdFacCon, T01RG4_A856ValCod
            }
            , new Object[] {
            T01RG5_A488ForPrdDsc, T01RG5_n488ForPrdDsc
            }
            , new Object[] {
            T01RG6_A874RecPrdFind, T01RG6_n874RecPrdFind
            }
            , new Object[] {
            T01RG7_A1273RecLinPro, T01RG7_A396EmprCod, T01RG7_A129BarCod, T01RG7_A132BarCodReo, T01RG7_A130BarCodPar, T01RG7_A2804RecLinMaq
            }
            , new Object[] {
            T01RG8_A1273RecLinPro, T01RG8_A396EmprCod, T01RG8_A129BarCod, T01RG8_A132BarCodReo, T01RG8_A130BarCodPar, T01RG8_A2804RecLinMaq
            }
            , new Object[] {
            T01RG9_A396EmprCod
            }
            , new Object[] {
            T01RG10_A1273RecLinPro, T01RG10_A396EmprCod, T01RG10_A129BarCod, T01RG10_A132BarCodReo, T01RG10_A130BarCodPar, T01RG10_A2804RecLinMaq
            }
            , new Object[] {
            T01RG11_A396EmprCod
            }
            , new Object[] {
            T01RG12_A396EmprCod, T01RG12_A129BarCod, T01RG12_A132BarCodReo, T01RG12_A130BarCodPar, T01RG12_A2804RecLinMaq, T01RG12_A1273RecLinPro
            }
            , new Object[] {
            T01RG13_A396EmprCod, T01RG13_A129BarCod, T01RG13_A132BarCodReo, T01RG13_A130BarCodPar, T01RG13_A2804RecLinMaq, T01RG13_A1273RecLinPro
            }
            , new Object[] {
            T01RG14_A396EmprCod, T01RG14_A129BarCod, T01RG14_A132BarCodReo, T01RG14_A130BarCodPar, T01RG14_A2804RecLinMaq, T01RG14_A1273RecLinPro
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RG17_A396EmprCod, T01RG17_A129BarCod, T01RG17_A132BarCodReo, T01RG17_A130BarCodPar, T01RG17_A2804RecLinMaq, T01RG17_A1273RecLinPro
            }
            , new Object[] {
            T01RG18_A129BarCod, T01RG18_A132BarCodReo, T01RG18_A130BarCodPar, T01RG18_A2804RecLinMaq, T01RG18_A1273RecLinPro, T01RG18_A811RecLin, T01RG18_A5725RecLote, T01RG18_A686PrdCant, T01RG18_A875RecPrdDsc, T01RG18_A14055RecManAut,
            T01RG18_A872RecPrdNum, T01RG18_A488ForPrdDsc, T01RG18_n488ForPrdDsc, T01RG18_A431FacCon, T01RG18_A2394RecForNro, T01RG18_A3274RecPrdTnq, T01RG18_A704PrdExiAlm, T01RG18_A685PrdCanRes, T01RG18_A3938RecCanEns, T01RG18_A4024RecMar,
            T01RG18_A5422RecSalMP, T01RG18_A5418PrdSalM, T01RG18_A5467RecSalVol, T01RG18_A5527RecLinRea, T01RG18_A8934RecPes, T01RG18_A8937RecAcc, T01RG18_A3804RecFecMov, T01RG18_A3805RecAnyTie, T01RG18_A3806RecUltAny, T01RG18_A3807RecPorAny,
            T01RG18_A4900PrdCanMac, T01RG18_A11708RecProv, T01RG18_A10881PrdLote, T01RG18_A4576RecLinUsr, T01RG18_A4577RecPesFec, T01RG18_A12710PrdCantOrg, T01RG18_A12717RecFabId, T01RG18_A13232PrdRGB, T01RG18_A705PrdExiCC, T01RG18_A13938RecLoteFch,
            T01RG18_A13937RecLotAlm, T01RG18_A4338PrdUMeFo, T01RG18_A707PrdFacCon, T01RG18_A396EmprCod, T01RG18_A719PrdNum, T01RG18_n719PrdNum, T01RG18_A490ForPrdUMe, T01RG18_n490ForPrdUMe, T01RG18_A856ValCod, T01RG18_A874RecPrdFind,
            T01RG18_n874RecPrdFind
            }
            , new Object[] {
            T01RG19_A874RecPrdFind, T01RG19_n874RecPrdFind
            }
            , new Object[] {
            T01RG20_A488ForPrdDsc, T01RG20_n488ForPrdDsc
            }
            , new Object[] {
            T01RG21_A704PrdExiAlm, T01RG21_A685PrdCanRes, T01RG21_A5418PrdSalM, T01RG21_A10881PrdLote, T01RG21_A13232PrdRGB, T01RG21_A705PrdExiCC, T01RG21_A4338PrdUMeFo, T01RG21_A707PrdFacCon, T01RG21_A856ValCod
            }
            , new Object[] {
            T01RG22_A396EmprCod, T01RG22_A129BarCod, T01RG22_A132BarCodReo, T01RG22_A130BarCodPar, T01RG22_A2804RecLinMaq, T01RG22_A1273RecLinPro, T01RG22_A811RecLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RG26_A874RecPrdFind, T01RG26_n874RecPrdFind
            }
            , new Object[] {
            T01RG27_A488ForPrdDsc, T01RG27_n488ForPrdDsc
            }
            , new Object[] {
            T01RG28_A704PrdExiAlm, T01RG28_A685PrdCanRes, T01RG28_A5418PrdSalM, T01RG28_A10881PrdLote, T01RG28_A13232PrdRGB, T01RG28_A705PrdExiCC, T01RG28_A4338PrdUMeFo, T01RG28_A707PrdFacCon, T01RG28_A856ValCod
            }
            , new Object[] {
            T01RG29_A396EmprCod, T01RG29_A129BarCod, T01RG29_A132BarCodReo, T01RG29_A130BarCodPar, T01RG29_A2804RecLinMaq, T01RG29_A1273RecLinPro, T01RG29_A811RecLin
            }
            , new Object[] {
            T01RG30_A396EmprCod
            }
         }
      );
      AV82Pgmname = "MantenimientoProductosReceta_TRN" ;
   }

   private byte wcpOAV50BarCodReo ;
   private byte wcpOAV15RecLinPro ;
   private byte Z132BarCodReo ;
   private byte Z1273RecLinPro ;
   private byte Z2394RecForNro ;
   private byte Z3274RecPrdTnq ;
   private byte Z4024RecMar ;
   private byte Z8934RecPes ;
   private byte Z490ForPrdUMe ;
   private byte O2394RecForNro ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte A132BarCodReo ;
   private byte AV50BarCodReo ;
   private byte AV15RecLinPro ;
   private byte nKeyPressed ;
   private byte A1273RecLinPro ;
   private byte A856ValCod ;
   private byte A4338PrdUMeFo ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A4024RecMar ;
   private byte A8934RecPes ;
   private byte T2394RecForNro ;
   private byte AV20Flag ;
   private byte GXt_int7 ;
   private byte Gx_BScreen ;
   private byte Z4338PrdUMeFo ;
   private byte Z856ValCod ;
   private byte subGridlevel_rec_Backcolorstyle ;
   private byte subGridlevel_rec_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_rec_Allowselection ;
   private byte subGridlevel_rec_Allowhovering ;
   private byte subGridlevel_rec_Allowcollapsing ;
   private byte subGridlevel_rec_Collapsed ;
   private byte GXv_int8[] ;
   private short nIsMod_410 ;
   private short wcpOAV14RecLinMaq ;
   private short Z2804RecLinMaq ;
   private short Z811RecLin ;
   private short Z5422RecSalMP ;
   private short Z3805RecAnyTie ;
   private short Z13937RecLotAlm ;
   private short nRcdDeleted_410 ;
   private short nRcdExists_410 ;
   private short AV38AlmCC ;
   private short AV30Valcos ;
   private short AV74CanResold ;
   private short A2804RecLinMaq ;
   private short AV14RecLinMaq ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV43Artemalha ;
   private short AV37Moda21 ;
   private short nBlankRcdCount410 ;
   private short RcdFound410 ;
   private short nBlankRcdUsr410 ;
   private short AV46Lote01 ;
   private short AV47EliminarReceta ;
   private short AV35Err_und ;
   private short A13937RecLotAlm ;
   private short RcdFound409 ;
   private short A811RecLin ;
   private short A5422RecSalMP ;
   private short A3805RecAnyTie ;
   private short AV33Centra ;
   private short AV34F_pizarro ;
   private short AV36Suprema ;
   private short AV39Factor8 ;
   private short AV40Factor ;
   private short AV44AvisoPesaje ;
   private short AV48SiRGB ;
   private short GXv_int12[] ;
   private short nIsDirty_409 ;
   private short nIsDirty_410 ;
   private short ZV74CanResold ;
   private int wcpOAV49BarCod ;
   private int wcpOAV28Volumen ;
   private int Z129BarCod ;
   private int nRC_GXsfl_51 ;
   private int nGXsfl_51_idx=1 ;
   private int Z5467RecSalVol ;
   private int Z11708RecProv ;
   private int Z12717RecFabId ;
   private int AV64VolumenReceta ;
   private int A129BarCod ;
   private int AV49BarCod ;
   private int AV28Volumen ;
   private int trnEnded ;
   private int edtavProfordsc_Enabled ;
   private int edtavTotaldekilos_Enabled ;
   private int edtavVolumenreceta_Enabled ;
   private int edtavTipodeproceso_Enabled ;
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
   private int edtavBarnhdr_Visible ;
   private int edtavBarnhdr_Enabled ;
   private int edtavReclinmaq_Enabled ;
   private int edtavReclinmaq_Visible ;
   private int edtavReclinpro_Enabled ;
   private int edtavReclinpro_Visible ;
   private int edtavValcos_Enabled ;
   private int edtavValcos_Visible ;
   private int edtavProforlab_Visible ;
   private int edtavProforlab_Enabled ;
   private int edtRecLin_Forecolor ;
   private int edtRecLin_Enabled ;
   private int edtRecPrdNum_Forecolor ;
   private int edtRecPrdNum_Enabled ;
   private int edtRecPrdDsc_Forecolor ;
   private int edtRecPrdDsc_Enabled ;
   private int edtFacCon_Forecolor ;
   private int edtFacCon_Enabled ;
   private int edtForPrdUMe_Forecolor ;
   private int edtForPrdUMe_Enabled ;
   private int edtForPrdDsc_Forecolor ;
   private int edtForPrdDsc_Enabled ;
   private int edtPrdCant_Forecolor ;
   private int edtPrdCant_Enabled ;
   private int edtRecManAut_Enabled ;
   private int edtRecLote_Enabled ;
   private int edtRecForNro_Forecolor ;
   private int edtRecForNro_Enabled ;
   private int edtRecPrdTnq_Forecolor ;
   private int edtRecPrdTnq_Enabled ;
   private int edtCanRes_Enabled ;
   private int edtPrdExiCC_Forecolor ;
   private int edtPrdExiCC_Enabled ;
   private int edtRecPrdFind_Enabled ;
   private int edtPrdExiAlm_Forecolor ;
   private int edtPrdExiAlm_Enabled ;
   private int edtPrdCanRes_Forecolor ;
   private int edtPrdCanRes_Enabled ;
   private int edtRecCanEns_Enabled ;
   private int edtRecMar_Forecolor ;
   private int edtRecMar_Enabled ;
   private int edtRecSalMP_Enabled ;
   private int edtRecSalVol_Enabled ;
   private int edtRecLinRea_Enabled ;
   private int edtRecPes_Enabled ;
   private int edtRecAcc_Enabled ;
   private int edtRecFecMov_Enabled ;
   private int edtRecAnyTie_Enabled ;
   private int edtRecUltAny_Enabled ;
   private int edtRecPorAny_Enabled ;
   private int edtPrdCanMac_Enabled ;
   private int edtRecProv_Enabled ;
   private int edtPrdLote_Enabled ;
   private int edtRecLinUsr_Enabled ;
   private int edtRecPesFec_Enabled ;
   private int edtPrdCantOrg_Enabled ;
   private int edtRecFabId_Enabled ;
   private int edtPrdRGB_Enabled ;
   private int edtCantProduc_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtRecPrdDscf_Enabled ;
   private int fRowAdded ;
   private int Combo_recprdnum_Datalistupdateminimumcharacters ;
   private int A5467RecSalVol ;
   private int A11708RecProv ;
   private int A12717RecFabId ;
   private int GXt_int5 ;
   private int GX_JID ;
   private int subGridlevel_rec_Backcolor ;
   private int subGridlevel_rec_Allbackcolor ;
   private int imgprompt_490_Visible ;
   private int defedtRecPrdDscf_Enabled ;
   private int defedtPrdNum_Enabled ;
   private int defedtCantProduc_Enabled ;
   private int defedtPrdRGB_Enabled ;
   private int defedtRecFabId_Enabled ;
   private int defedtPrdCantOrg_Enabled ;
   private int defedtRecPesFec_Enabled ;
   private int defedtRecLinUsr_Enabled ;
   private int defedtPrdLote_Enabled ;
   private int defedtRecProv_Enabled ;
   private int defedtPrdCanMac_Enabled ;
   private int defedtRecPorAny_Enabled ;
   private int defedtRecUltAny_Enabled ;
   private int defedtRecAnyTie_Enabled ;
   private int defedtRecFecMov_Enabled ;
   private int defedtRecAcc_Enabled ;
   private int defedtRecPes_Enabled ;
   private int defedtRecLinRea_Enabled ;
   private int defedtRecSalVol_Enabled ;
   private int defchkPrdSalM_Enabled ;
   private int defedtRecSalMP_Enabled ;
   private int defedtRecMar_Enabled ;
   private int defedtRecMar_Forecolor ;
   private int defedtRecCanEns_Enabled ;
   private int defedtPrdCanRes_Enabled ;
   private int defedtPrdCanRes_Forecolor ;
   private int defedtPrdExiAlm_Enabled ;
   private int defedtPrdExiAlm_Forecolor ;
   private int defedtRecPrdFind_Enabled ;
   private int defedtPrdExiCC_Enabled ;
   private int defedtPrdExiCC_Forecolor ;
   private int defedtCanRes_Enabled ;
   private int defedtRecPrdTnq_Forecolor ;
   private int defedtRecForNro_Forecolor ;
   private int defedtRecLote_Enabled ;
   private int defedtRecManAut_Enabled ;
   private int defedtPrdCant_Enabled ;
   private int defedtPrdCant_Forecolor ;
   private int defedtForPrdDsc_Forecolor ;
   private int defedtForPrdUMe_Forecolor ;
   private int defedtFacCon_Forecolor ;
   private int defedtRecPrdDsc_Forecolor ;
   private int defedtRecPrdNum_Forecolor ;
   private int defedtRecLin_Enabled ;
   private int defedtRecLin_Forecolor ;
   private int idxLst ;
   private int subGridlevel_rec_Selectedindex ;
   private int subGridlevel_rec_Selectioncolor ;
   private int subGridlevel_rec_Hoveringcolor ;
   private int GXv_int18[] ;
   private int GXv_int6[] ;
   private long GRIDLEVEL_REC_nFirstRecordOnPage ;
   private long A13232PrdRGB ;
   private long Z13232PrdRGB ;
   private java.math.BigDecimal wcpOAV27TotKgs ;
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
   private java.math.BigDecimal N686PrdCant ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal AV61Cantold ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal AV62Totaldekilos ;
   private java.math.BigDecimal A238CanRes ;
   private java.math.BigDecimal AV27TotKgs ;
   private java.math.BigDecimal AV21NoCantidad ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A3938RecCanEns ;
   private java.math.BigDecimal A3806RecUltAny ;
   private java.math.BigDecimal A3807RecPorAny ;
   private java.math.BigDecimal A4900PrdCanMac ;
   private java.math.BigDecimal A12710PrdCantOrg ;
   private java.math.BigDecimal A13832CantProduc ;
   private java.math.BigDecimal T431FacCon ;
   private java.math.BigDecimal T686PrdCant ;
   private java.math.BigDecimal T238CanRes ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal Z685PrdCanRes ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal Z707PrdFacCon ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal19[] ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private java.math.BigDecimal Z13832CantProduc ;
   private java.math.BigDecimal Z238CanRes ;
   private java.math.BigDecimal ZV61Cantold ;
   private String sPrefix ;
   private String sGXsfl_51_idx="0001" ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV51BarCodPar ;
   private String wcpOAV25BarNHdr ;
   private String wcpOAV26ProForDsc ;
   private String wcpOAV54Proforfab ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z5725RecLote ;
   private String Z875RecPrdDsc ;
   private String Z14055RecManAut ;
   private String Z872RecPrdNum ;
   private String Z5527RecLinRea ;
   private String Z8937RecAcc ;
   private String Z4576RecLinUsr ;
   private String Z719PrdNum ;
   private String O14055RecManAut ;
   private String O5725RecLote ;
   private String N5725RecLote ;
   private String N14055RecManAut ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A872RecPrdNum ;
   private String A719PrdNum ;
   private String AV7EmprCod ;
   private String AV82Pgmname ;
   private String AV19UsurCod ;
   private String AV18Station ;
   private String A130BarCodPar ;
   private String A14055RecManAut ;
   private String Gx_mode ;
   private String A874RecPrdFind ;
   private String AV51BarCodPar ;
   private String AV25BarNHdr ;
   private String AV26ProForDsc ;
   private String AV54Proforfab ;
   private String AV69Modif2 ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String edtavTotaldekilos_Internalname ;
   private String edtavTotaldekilos_Jsonclick ;
   private String edtavVolumenreceta_Internalname ;
   private String edtavVolumenreceta_Jsonclick ;
   private String edtavTipodeproceso_Internalname ;
   private String AV63TipodeProceso ;
   private String edtavTipodeproceso_Jsonclick ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divTableleaflevel_rec_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_recprdnum_Caption ;
   private String Combo_recprdnum_Cls ;
   private String Combo_recprdnum_Internalname ;
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
   private String edtavBarnhdr_Internalname ;
   private String edtavBarnhdr_Jsonclick ;
   private String edtavReclinmaq_Internalname ;
   private String edtavReclinmaq_Jsonclick ;
   private String edtavReclinpro_Internalname ;
   private String edtavReclinpro_Jsonclick ;
   private String edtavValcos_Internalname ;
   private String edtavValcos_Jsonclick ;
   private String edtavProforlab_Internalname ;
   private String AV58ProForLab ;
   private String edtavProforlab_Jsonclick ;
   private String sMode410 ;
   private String edtRecLin_Internalname ;
   private String edtRecPrdNum_Internalname ;
   private String edtRecPrdDsc_Internalname ;
   private String edtFacCon_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdDsc_Internalname ;
   private String edtPrdCant_Internalname ;
   private String edtRecManAut_Internalname ;
   private String edtRecLote_Internalname ;
   private String edtRecForNro_Internalname ;
   private String edtRecPrdTnq_Internalname ;
   private String edtCanRes_Internalname ;
   private String edtPrdExiCC_Internalname ;
   private String edtRecPrdFind_Internalname ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdCanRes_Internalname ;
   private String edtRecCanEns_Internalname ;
   private String edtRecMar_Internalname ;
   private String edtRecSalMP_Internalname ;
   private String edtRecSalVol_Internalname ;
   private String edtRecLinRea_Internalname ;
   private String edtRecPes_Internalname ;
   private String edtRecAcc_Internalname ;
   private String edtRecFecMov_Internalname ;
   private String edtRecAnyTie_Internalname ;
   private String edtRecUltAny_Internalname ;
   private String edtRecPorAny_Internalname ;
   private String edtPrdCanMac_Internalname ;
   private String edtRecProv_Internalname ;
   private String edtPrdLote_Internalname ;
   private String edtRecLinUsr_Internalname ;
   private String edtRecPesFec_Internalname ;
   private String edtPrdCantOrg_Internalname ;
   private String edtRecFabId_Internalname ;
   private String edtPrdRGB_Internalname ;
   private String edtCantProduc_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtRecPrdDscf_Internalname ;
   private String imgprompt_490_Link ;
   private String sStyleString ;
   private String subGridlevel_rec_Internalname ;
   private String AV32Modif ;
   private String AV71oldRecLote ;
   private String AV77RecManAutold ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_recprdnum_Objectcall ;
   private String Combo_recprdnum_Class ;
   private String Combo_recprdnum_Icontype ;
   private String Combo_recprdnum_Icon ;
   private String Combo_recprdnum_Tooltip ;
   private String Combo_recprdnum_Selectedvalue_set ;
   private String Combo_recprdnum_Selectedvalue_get ;
   private String Combo_recprdnum_Selectedtext_set ;
   private String Combo_recprdnum_Selectedtext_get ;
   private String Combo_recprdnum_Gamoauthtoken ;
   private String Combo_recprdnum_Ddointernalname ;
   private String Combo_recprdnum_Titlecontrolalign ;
   private String Combo_recprdnum_Dropdownoptionstype ;
   private String Combo_recprdnum_Titlecontrolidtoreplace ;
   private String Combo_recprdnum_Datalisttype ;
   private String Combo_recprdnum_Datalistfixedvalues ;
   private String Combo_recprdnum_Datalistproc ;
   private String Combo_recprdnum_Datalistprocparametersprefix ;
   private String Combo_recprdnum_Remoteservicesparameters ;
   private String Combo_recprdnum_Htmltemplate ;
   private String Combo_recprdnum_Multiplevaluestype ;
   private String Combo_recprdnum_Loadingdata ;
   private String Combo_recprdnum_Noresultsfound ;
   private String Combo_recprdnum_Emptyitemtext ;
   private String Combo_recprdnum_Onlyselectedvalues ;
   private String Combo_recprdnum_Selectalltext ;
   private String Combo_recprdnum_Multiplevaluesseparator ;
   private String Combo_recprdnum_Addnewoptiontext ;
   private String hsh ;
   private String sMode409 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sV32Modif ;
   private String OV32Modif ;
   private String GXCCtl ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A5725RecLote ;
   private String A5418PrdSalM ;
   private String A5527RecLinRea ;
   private String A8937RecAcc ;
   private String A10881PrdLote ;
   private String A4576RecLinUsr ;
   private String A13897RecPrdDscf ;
   private String T14055RecManAut ;
   private String T5725RecLote ;
   private String AV8EmprNom ;
   private String AV42Conf ;
   private String AV29Modo ;
   private String imgPrompt_gximage ;
   private String imgPrompt_Internalname ;
   private String Z5418PrdSalM ;
   private String Z10881PrdLote ;
   private String Z874RecPrdFind ;
   private String Z488ForPrdDsc ;
   private String imgprompt_490_Internalname ;
   private String sGXsfl_51_fel_idx="0001" ;
   private String subGridlevel_rec_Class ;
   private String subGridlevel_rec_Linesclass ;
   private String ROClassString ;
   private String edtRecLin_Jsonclick ;
   private String edtRecPrdNum_Jsonclick ;
   private String edtRecPrdDsc_Jsonclick ;
   private String edtFacCon_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String imgprompt_490_gximage ;
   private String sImgUrl ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtPrdCant_Jsonclick ;
   private String edtRecManAut_Jsonclick ;
   private String edtRecLote_Jsonclick ;
   private String edtRecForNro_Jsonclick ;
   private String edtRecPrdTnq_Jsonclick ;
   private String edtCanRes_Jsonclick ;
   private String edtPrdExiCC_Jsonclick ;
   private String edtRecPrdFind_Jsonclick ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdCanRes_Jsonclick ;
   private String edtRecCanEns_Jsonclick ;
   private String edtRecMar_Jsonclick ;
   private String edtRecSalMP_Jsonclick ;
   private String edtRecSalVol_Jsonclick ;
   private String edtRecLinRea_Jsonclick ;
   private String edtRecPes_Jsonclick ;
   private String edtRecAcc_Jsonclick ;
   private String edtRecFecMov_Jsonclick ;
   private String edtRecAnyTie_Jsonclick ;
   private String edtRecUltAny_Jsonclick ;
   private String edtRecPorAny_Jsonclick ;
   private String edtPrdCanMac_Jsonclick ;
   private String edtRecProv_Jsonclick ;
   private String edtPrdLote_Jsonclick ;
   private String edtRecLinUsr_Jsonclick ;
   private String edtRecPesFec_Jsonclick ;
   private String edtPrdCantOrg_Jsonclick ;
   private String edtRecFabId_Jsonclick ;
   private String edtPrdRGB_Jsonclick ;
   private String edtCantProduc_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtRecPrdDscf_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_rec_Header ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z13897RecPrdDscf ;
   private String ZV71oldRecLote ;
   private String GXv_char4[] ;
   private String ZV77RecManAutold ;
   private java.util.Date Z4577RecPesFec ;
   private java.util.Date A4577RecPesFec ;
   private java.util.Date wcpOAV31FecPan ;
   private java.util.Date Z3804RecFecMov ;
   private java.util.Date Z13938RecLoteFch ;
   private java.util.Date AV31FecPan ;
   private java.util.Date A13938RecLoteFch ;
   private java.util.Date A3804RecFecMov ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n874RecPrdFind ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_recprdnum_Isgriditem ;
   private boolean Combo_recprdnum_Emptyitem ;
   private boolean bGXsfl_51_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_recprdnum_Enabled ;
   private boolean Combo_recprdnum_Visible ;
   private boolean Combo_recprdnum_Allowmultipleselection ;
   private boolean Combo_recprdnum_Hasdescription ;
   private boolean Combo_recprdnum_Includeonlyselectedoption ;
   private boolean Combo_recprdnum_Includeselectalloption ;
   private boolean Combo_recprdnum_Includeaddnewoption ;
   private boolean returnInSub ;
   private boolean n488ForPrdDsc ;
   private boolean Gx_longc ;
   private String AV52msgErr ;
   private String AV76Inc_obs ;
   private String AV65Inc_obs1 ;
   private String AV66Inc_obs2 ;
   private String AV41MsgErrFactor ;
   private String AV45msg_err1 ;
   private String AV83Prompt_GXI ;
   private String AV79ComboSelectedValue ;
   private String AV75Prompt ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_recContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_recRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_recColumn ;
   private com.genexus.webpanels.WebSession AV24WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_recprdnum ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkPrdSalM ;
   private IDataStoreProvider pr_default ;
   private byte[] T01RG10_A1273RecLinPro ;
   private String[] T01RG10_A396EmprCod ;
   private int[] T01RG10_A129BarCod ;
   private byte[] T01RG10_A132BarCodReo ;
   private String[] T01RG10_A130BarCodPar ;
   private short[] T01RG10_A2804RecLinMaq ;
   private String[] T01RG9_A396EmprCod ;
   private String[] T01RG11_A396EmprCod ;
   private String[] T01RG12_A396EmprCod ;
   private int[] T01RG12_A129BarCod ;
   private byte[] T01RG12_A132BarCodReo ;
   private String[] T01RG12_A130BarCodPar ;
   private short[] T01RG12_A2804RecLinMaq ;
   private byte[] T01RG12_A1273RecLinPro ;
   private byte[] T01RG8_A1273RecLinPro ;
   private String[] T01RG8_A396EmprCod ;
   private int[] T01RG8_A129BarCod ;
   private byte[] T01RG8_A132BarCodReo ;
   private String[] T01RG8_A130BarCodPar ;
   private short[] T01RG8_A2804RecLinMaq ;
   private String[] T01RG13_A396EmprCod ;
   private int[] T01RG13_A129BarCod ;
   private byte[] T01RG13_A132BarCodReo ;
   private String[] T01RG13_A130BarCodPar ;
   private short[] T01RG13_A2804RecLinMaq ;
   private byte[] T01RG13_A1273RecLinPro ;
   private String[] T01RG14_A396EmprCod ;
   private int[] T01RG14_A129BarCod ;
   private byte[] T01RG14_A132BarCodReo ;
   private String[] T01RG14_A130BarCodPar ;
   private short[] T01RG14_A2804RecLinMaq ;
   private byte[] T01RG14_A1273RecLinPro ;
   private byte[] T01RG7_A1273RecLinPro ;
   private String[] T01RG7_A396EmprCod ;
   private int[] T01RG7_A129BarCod ;
   private byte[] T01RG7_A132BarCodReo ;
   private String[] T01RG7_A130BarCodPar ;
   private short[] T01RG7_A2804RecLinMaq ;
   private String[] T01RG17_A396EmprCod ;
   private int[] T01RG17_A129BarCod ;
   private byte[] T01RG17_A132BarCodReo ;
   private String[] T01RG17_A130BarCodPar ;
   private short[] T01RG17_A2804RecLinMaq ;
   private byte[] T01RG17_A1273RecLinPro ;
   private int[] T01RG18_A129BarCod ;
   private byte[] T01RG18_A132BarCodReo ;
   private String[] T01RG18_A130BarCodPar ;
   private short[] T01RG18_A2804RecLinMaq ;
   private byte[] T01RG18_A1273RecLinPro ;
   private short[] T01RG18_A811RecLin ;
   private String[] T01RG18_A5725RecLote ;
   private java.math.BigDecimal[] T01RG18_A686PrdCant ;
   private String[] T01RG18_A875RecPrdDsc ;
   private String[] T01RG18_A14055RecManAut ;
   private String[] T01RG18_A872RecPrdNum ;
   private String[] T01RG18_A488ForPrdDsc ;
   private boolean[] T01RG18_n488ForPrdDsc ;
   private java.math.BigDecimal[] T01RG18_A431FacCon ;
   private byte[] T01RG18_A2394RecForNro ;
   private byte[] T01RG18_A3274RecPrdTnq ;
   private java.math.BigDecimal[] T01RG18_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01RG18_A685PrdCanRes ;
   private java.math.BigDecimal[] T01RG18_A3938RecCanEns ;
   private byte[] T01RG18_A4024RecMar ;
   private short[] T01RG18_A5422RecSalMP ;
   private String[] T01RG18_A5418PrdSalM ;
   private int[] T01RG18_A5467RecSalVol ;
   private String[] T01RG18_A5527RecLinRea ;
   private byte[] T01RG18_A8934RecPes ;
   private String[] T01RG18_A8937RecAcc ;
   private java.util.Date[] T01RG18_A3804RecFecMov ;
   private short[] T01RG18_A3805RecAnyTie ;
   private java.math.BigDecimal[] T01RG18_A3806RecUltAny ;
   private java.math.BigDecimal[] T01RG18_A3807RecPorAny ;
   private java.math.BigDecimal[] T01RG18_A4900PrdCanMac ;
   private int[] T01RG18_A11708RecProv ;
   private String[] T01RG18_A10881PrdLote ;
   private String[] T01RG18_A4576RecLinUsr ;
   private java.util.Date[] T01RG18_A4577RecPesFec ;
   private java.math.BigDecimal[] T01RG18_A12710PrdCantOrg ;
   private int[] T01RG18_A12717RecFabId ;
   private long[] T01RG18_A13232PrdRGB ;
   private java.math.BigDecimal[] T01RG18_A705PrdExiCC ;
   private java.util.Date[] T01RG18_A13938RecLoteFch ;
   private short[] T01RG18_A13937RecLotAlm ;
   private byte[] T01RG18_A4338PrdUMeFo ;
   private java.math.BigDecimal[] T01RG18_A707PrdFacCon ;
   private String[] T01RG18_A396EmprCod ;
   private String[] T01RG18_A719PrdNum ;
   private boolean[] T01RG18_n719PrdNum ;
   private byte[] T01RG18_A490ForPrdUMe ;
   private boolean[] T01RG18_n490ForPrdUMe ;
   private byte[] T01RG18_A856ValCod ;
   private String[] T01RG18_A874RecPrdFind ;
   private boolean[] T01RG18_n874RecPrdFind ;
   private String[] T01RG6_A874RecPrdFind ;
   private boolean[] T01RG6_n874RecPrdFind ;
   private String[] T01RG5_A488ForPrdDsc ;
   private boolean[] T01RG5_n488ForPrdDsc ;
   private java.math.BigDecimal[] T01RG4_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01RG4_A685PrdCanRes ;
   private String[] T01RG4_A5418PrdSalM ;
   private String[] T01RG4_A10881PrdLote ;
   private long[] T01RG4_A13232PrdRGB ;
   private java.math.BigDecimal[] T01RG4_A705PrdExiCC ;
   private byte[] T01RG4_A4338PrdUMeFo ;
   private java.math.BigDecimal[] T01RG4_A707PrdFacCon ;
   private byte[] T01RG4_A856ValCod ;
   private String[] T01RG19_A874RecPrdFind ;
   private boolean[] T01RG19_n874RecPrdFind ;
   private String[] T01RG20_A488ForPrdDsc ;
   private boolean[] T01RG20_n488ForPrdDsc ;
   private java.math.BigDecimal[] T01RG21_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01RG21_A685PrdCanRes ;
   private String[] T01RG21_A5418PrdSalM ;
   private String[] T01RG21_A10881PrdLote ;
   private long[] T01RG21_A13232PrdRGB ;
   private java.math.BigDecimal[] T01RG21_A705PrdExiCC ;
   private byte[] T01RG21_A4338PrdUMeFo ;
   private java.math.BigDecimal[] T01RG21_A707PrdFacCon ;
   private byte[] T01RG21_A856ValCod ;
   private String[] T01RG22_A396EmprCod ;
   private int[] T01RG22_A129BarCod ;
   private byte[] T01RG22_A132BarCodReo ;
   private String[] T01RG22_A130BarCodPar ;
   private short[] T01RG22_A2804RecLinMaq ;
   private byte[] T01RG22_A1273RecLinPro ;
   private short[] T01RG22_A811RecLin ;
   private int[] T01RG3_A129BarCod ;
   private byte[] T01RG3_A132BarCodReo ;
   private String[] T01RG3_A130BarCodPar ;
   private short[] T01RG3_A2804RecLinMaq ;
   private byte[] T01RG3_A1273RecLinPro ;
   private short[] T01RG3_A811RecLin ;
   private String[] T01RG3_A5725RecLote ;
   private java.math.BigDecimal[] T01RG3_A686PrdCant ;
   private String[] T01RG3_A875RecPrdDsc ;
   private String[] T01RG3_A14055RecManAut ;
   private String[] T01RG3_A872RecPrdNum ;
   private java.math.BigDecimal[] T01RG3_A431FacCon ;
   private byte[] T01RG3_A2394RecForNro ;
   private byte[] T01RG3_A3274RecPrdTnq ;
   private java.math.BigDecimal[] T01RG3_A3938RecCanEns ;
   private byte[] T01RG3_A4024RecMar ;
   private short[] T01RG3_A5422RecSalMP ;
   private int[] T01RG3_A5467RecSalVol ;
   private String[] T01RG3_A5527RecLinRea ;
   private byte[] T01RG3_A8934RecPes ;
   private String[] T01RG3_A8937RecAcc ;
   private java.util.Date[] T01RG3_A3804RecFecMov ;
   private short[] T01RG3_A3805RecAnyTie ;
   private java.math.BigDecimal[] T01RG3_A3806RecUltAny ;
   private java.math.BigDecimal[] T01RG3_A3807RecPorAny ;
   private java.math.BigDecimal[] T01RG3_A4900PrdCanMac ;
   private int[] T01RG3_A11708RecProv ;
   private String[] T01RG3_A4576RecLinUsr ;
   private java.util.Date[] T01RG3_A4577RecPesFec ;
   private java.math.BigDecimal[] T01RG3_A12710PrdCantOrg ;
   private int[] T01RG3_A12717RecFabId ;
   private java.util.Date[] T01RG3_A13938RecLoteFch ;
   private short[] T01RG3_A13937RecLotAlm ;
   private String[] T01RG3_A396EmprCod ;
   private String[] T01RG3_A719PrdNum ;
   private boolean[] T01RG3_n719PrdNum ;
   private byte[] T01RG3_A490ForPrdUMe ;
   private boolean[] T01RG3_n490ForPrdUMe ;
   private int[] T01RG2_A129BarCod ;
   private byte[] T01RG2_A132BarCodReo ;
   private String[] T01RG2_A130BarCodPar ;
   private short[] T01RG2_A2804RecLinMaq ;
   private byte[] T01RG2_A1273RecLinPro ;
   private short[] T01RG2_A811RecLin ;
   private String[] T01RG2_A5725RecLote ;
   private java.math.BigDecimal[] T01RG2_A686PrdCant ;
   private String[] T01RG2_A875RecPrdDsc ;
   private String[] T01RG2_A14055RecManAut ;
   private String[] T01RG2_A872RecPrdNum ;
   private java.math.BigDecimal[] T01RG2_A431FacCon ;
   private byte[] T01RG2_A2394RecForNro ;
   private byte[] T01RG2_A3274RecPrdTnq ;
   private java.math.BigDecimal[] T01RG2_A3938RecCanEns ;
   private byte[] T01RG2_A4024RecMar ;
   private short[] T01RG2_A5422RecSalMP ;
   private int[] T01RG2_A5467RecSalVol ;
   private String[] T01RG2_A5527RecLinRea ;
   private byte[] T01RG2_A8934RecPes ;
   private String[] T01RG2_A8937RecAcc ;
   private java.util.Date[] T01RG2_A3804RecFecMov ;
   private short[] T01RG2_A3805RecAnyTie ;
   private java.math.BigDecimal[] T01RG2_A3806RecUltAny ;
   private java.math.BigDecimal[] T01RG2_A3807RecPorAny ;
   private java.math.BigDecimal[] T01RG2_A4900PrdCanMac ;
   private int[] T01RG2_A11708RecProv ;
   private String[] T01RG2_A4576RecLinUsr ;
   private java.util.Date[] T01RG2_A4577RecPesFec ;
   private java.math.BigDecimal[] T01RG2_A12710PrdCantOrg ;
   private int[] T01RG2_A12717RecFabId ;
   private java.util.Date[] T01RG2_A13938RecLoteFch ;
   private short[] T01RG2_A13937RecLotAlm ;
   private String[] T01RG2_A396EmprCod ;
   private String[] T01RG2_A719PrdNum ;
   private boolean[] T01RG2_n719PrdNum ;
   private byte[] T01RG2_A490ForPrdUMe ;
   private boolean[] T01RG2_n490ForPrdUMe ;
   private String[] T01RG26_A874RecPrdFind ;
   private boolean[] T01RG26_n874RecPrdFind ;
   private String[] T01RG27_A488ForPrdDsc ;
   private boolean[] T01RG27_n488ForPrdDsc ;
   private java.math.BigDecimal[] T01RG28_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01RG28_A685PrdCanRes ;
   private String[] T01RG28_A5418PrdSalM ;
   private String[] T01RG28_A10881PrdLote ;
   private long[] T01RG28_A13232PrdRGB ;
   private java.math.BigDecimal[] T01RG28_A705PrdExiCC ;
   private byte[] T01RG28_A4338PrdUMeFo ;
   private java.math.BigDecimal[] T01RG28_A707PrdFacCon ;
   private byte[] T01RG28_A856ValCod ;
   private String[] T01RG29_A396EmprCod ;
   private int[] T01RG29_A129BarCod ;
   private byte[] T01RG29_A132BarCodReo ;
   private String[] T01RG29_A130BarCodPar ;
   private short[] T01RG29_A2804RecLinMaq ;
   private byte[] T01RG29_A1273RecLinPro ;
   private short[] T01RG29_A811RecLin ;
   private String[] T01RG30_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV80RecPrdNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item13 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item14[] ;
   private app.wwpbaseobjects.SdtWWPContext AV22WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV23TrnContext ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV81DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons11[] ;
}

final  class mantenimientoproductosreceta_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mantenimientoproductosreceta_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mantenimientoproductosreceta_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mantenimientoproductosreceta_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mantenimientoproductosreceta_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01RG2", "SELECT BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin, RecLote, PrdCant, RecPrdDsc, RecManAut, RecPrdNum, FacCon, RecForNro, RecPrdTnq, RecCanEns, RecMar, RecSalMP, RecSalVol, RecLinRea, RecPes, RecAcc, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecProv, RecLinUsr, RecPesFec, PrdCantOrg, RecFabId, RecLoteFch, RecLotAlm, EmprCod, PrdNum, ForPrdUMe FROM TXPLRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?  FOR UPDATE OF RecLote, PrdCant, RecPrdDsc, RecManAut, RecPrdNum, FacCon, RecForNro, RecPrdTnq, RecCanEns, RecMar, RecSalMP, RecSalVol, RecLinRea, RecPes, RecAcc, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecProv, RecLinUsr, RecPesFec, PrdCantOrg, RecFabId, RecLoteFch, RecLotAlm, PrdNum, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG3", "SELECT BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin, RecLote, PrdCant, RecPrdDsc, RecManAut, RecPrdNum, FacCon, RecForNro, RecPrdTnq, RecCanEns, RecMar, RecSalMP, RecSalVol, RecLinRea, RecPes, RecAcc, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecProv, RecLinUsr, RecPesFec, PrdCantOrg, RecFabId, RecLoteFch, RecLotAlm, EmprCod, PrdNum, ForPrdUMe FROM TXPLRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG4", "SELECT PrdExiAlm, PrdCanRes, PrdSalM, PrdLote, PrdRGB, PrdExiCC, PrdUMeFo, PrdFacCon, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG5", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG6", "SELECT COALESCE( PrdNum, 'xxxxxx') AS RecPrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG7", "SELECT RecLinPro, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPCRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ?  FOR UPDATE OF RecLinPro NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG8", "SELECT RecLinPro, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPCRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG9", "SELECT EmprCod FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG10", "SELECT /*+ FIRST_ROWS(100) */ TM1.RecLinPro, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.RecLinMaq FROM TXPCRECET TM1 WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.RecLinMaq = ? and TM1.RecLinPro = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.RecLinMaq, TM1.RecLinPro ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG11", "SELECT EmprCod FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinMaq > ? or RecLinMaq = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinPro > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RG14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinMaq < ? or RecLinMaq = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinPro < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, RecLinMaq DESC, RecLinPro DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RG15", "INSERT INTO TXPCRECET(RecLinPro, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, ProForCod, ProRecObs, RecVolPrf, RecTiempo, RecNroPrg, RecTemp, RecPhMx, RecPhMn, RecRb, RecNumRec, RecNH2O) VALUES(?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPCRECET")
         ,new UpdateCursor("T01RG16", "DELETE FROM TXPCRECET  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ?", GX_NOMASK, "TXPCRECET")
         ,new ForEachCursor("T01RG17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG18", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin, T1.RecLote, T1.PrdCant, T1.RecPrdDsc, T1.RecManAut, T1.RecPrdNum, T4.ForPrdDsc, T1.FacCon, T1.RecForNro, T1.RecPrdTnq, T2.PrdExiAlm, T2.PrdCanRes, T1.RecCanEns, T1.RecMar, T1.RecSalMP, T2.PrdSalM, T1.RecSalVol, T1.RecLinRea, T1.RecPes, T1.RecAcc, T1.RecFecMov, T1.RecAnyTie, T1.RecUltAny, T1.RecPorAny, T1.PrdCanMac, T1.RecProv, T2.PrdLote, T1.RecLinUsr, T1.RecPesFec, T1.PrdCantOrg, T1.RecFabId, T2.PrdRGB, T2.PrdExiCC, T1.RecLoteFch, T1.RecLotAlm, T2.PrdUMeFo, T2.PrdFacCon, T1.EmprCod, T1.PrdNum, T1.ForPrdUMe, T2.ValCod, COALESCE( T3.PrdNum, 'xxxxxx') AS RecPrdFind FROM (((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.RecPrdNum) LEFT JOIN TXPUNMEPR T4 ON T4.EmprCod = T1.EmprCod AND T4.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ? and T1.RecLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG19", "SELECT COALESCE( PrdNum, 'xxxxxx') AS RecPrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG20", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG21", "SELECT PrdExiAlm, PrdCanRes, PrdSalM, PrdLote, PrdRGB, PrdExiCC, PrdUMeFo, PrdFacCon, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG22", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01RG23", "INSERT INTO TXPLRECET(BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin, RecLote, PrdCant, RecPrdDsc, RecManAut, RecPrdNum, FacCon, RecForNro, RecPrdTnq, RecCanEns, RecMar, RecSalMP, RecSalVol, RecLinRea, RecPes, RecAcc, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecProv, RecLinUsr, RecPesFec, PrdCantOrg, RecFabId, RecLoteFch, RecLotAlm, EmprCod, PrdNum, ForPrdUMe, PrdCanFin, PrdCanAny, FacCon1, RecPrdDc2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ')", GX_NOMASK, "TXPLRECET")
         ,new UpdateCursor("T01RG24", "UPDATE TXPLRECET SET RecLote=?, PrdCant=?, RecPrdDsc=?, RecManAut=?, RecPrdNum=?, FacCon=?, RecForNro=?, RecPrdTnq=?, RecCanEns=?, RecMar=?, RecSalMP=?, RecSalVol=?, RecLinRea=?, RecPes=?, RecAcc=?, RecFecMov=?, RecAnyTie=?, RecUltAny=?, RecPorAny=?, PrdCanMac=?, RecProv=?, RecLinUsr=?, RecPesFec=?, PrdCantOrg=?, RecFabId=?, RecLoteFch=?, RecLotAlm=?, PrdNum=?, ForPrdUMe=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK, "TXPLRECET")
         ,new UpdateCursor("T01RG25", "DELETE FROM TXPLRECET  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK, "TXPLRECET")
         ,new ForEachCursor("T01RG26", "SELECT COALESCE( PrdNum, 'xxxxxx') AS RecPrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG27", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG28", "SELECT PrdExiAlm, PrdCanRes, PrdSalM, PrdLote, PrdRGB, PrdExiCC, PrdUMeFo, PrdFacCon, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG29", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RG30", "SELECT EmprCod FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,5);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               ((byte[]) buf[19])[0] = rslt.getByte(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 40);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,3);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(25,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(26,3);
               ((int[]) buf[26])[0] = rslt.getInt(27);
               ((String[]) buf[27])[0] = rslt.getString(28, 8);
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(29);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(30,3);
               ((int[]) buf[30])[0] = rslt.getInt(31);
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(32);
               ((short[]) buf[32])[0] = rslt.getShort(33);
               ((String[]) buf[33])[0] = rslt.getString(34, 3);
               ((String[]) buf[34])[0] = rslt.getString(35, 6);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((byte[]) buf[36])[0] = rslt.getByte(36);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
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
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,5);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               ((byte[]) buf[19])[0] = rslt.getByte(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 40);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,3);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(25,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(26,3);
               ((int[]) buf[26])[0] = rslt.getInt(27);
               ((String[]) buf[27])[0] = rslt.getString(28, 8);
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(29);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(30,3);
               ((int[]) buf[30])[0] = rslt.getInt(31);
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(32);
               ((short[]) buf[32])[0] = rslt.getShort(33);
               ((String[]) buf[33])[0] = rslt.getString(34, 3);
               ((String[]) buf[34])[0] = rslt.getString(35, 6);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((byte[]) buf[36])[0] = rslt.getByte(36);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((String[]) buf[11])[0] = rslt.getString(12, 5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,5);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,4);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,4);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,5);
               ((byte[]) buf[19])[0] = rslt.getByte(19);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(24);
               ((String[]) buf[25])[0] = rslt.getString(25, 40);
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(26);
               ((short[]) buf[27])[0] = rslt.getShort(27);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(28,3);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(29,2);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(30,3);
               ((int[]) buf[31])[0] = rslt.getInt(31);
               ((String[]) buf[32])[0] = rslt.getString(32, 26);
               ((String[]) buf[33])[0] = rslt.getString(33, 8);
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDateTime(34);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(35,3);
               ((int[]) buf[36])[0] = rslt.getInt(36);
               ((long[]) buf[37])[0] = rslt.getLong(37);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(38,4);
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDate(39);
               ((short[]) buf[40])[0] = rslt.getShort(40);
               ((byte[]) buf[41])[0] = rslt.getByte(41);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(42,4);
               ((String[]) buf[43])[0] = rslt.getString(43, 3);
               ((String[]) buf[44])[0] = rslt.getString(44, 6);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((byte[]) buf[46])[0] = rslt.getByte(45);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((byte[]) buf[48])[0] = rslt.getByte(46);
               ((String[]) buf[49])[0] = rslt.getString(47, 6);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 11 :
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
               return;
            case 12 :
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
               return;
            case 13 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 26);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 3);
               stmt.setString(9, (String)parms[8], 26);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 6);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 5);
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 1);
               stmt.setByte(20, ((Number) parms[19]).byteValue());
               stmt.setString(21, (String)parms[20], 40);
               stmt.setDate(22, (java.util.Date)parms[21]);
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[23], 3);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[24], 2);
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[25], 3);
               stmt.setInt(27, ((Number) parms[26]).intValue());
               stmt.setString(28, (String)parms[27], 8);
               stmt.setDateTime(29, (java.util.Date)parms[28], false);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[29], 3);
               stmt.setInt(31, ((Number) parms[30]).intValue());
               stmt.setDate(32, (java.util.Date)parms[31]);
               stmt.setShort(33, ((Number) parms[32]).shortValue());
               stmt.setString(34, (String)parms[33], 3);
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[35], 6);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(36, ((Number) parms[37]).byteValue());
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setDate(26, (java.util.Date)parms[25]);
               stmt.setShort(27, ((Number) parms[26]).shortValue());
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[28], 6);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(29, ((Number) parms[30]).byteValue());
               }
               stmt.setString(30, (String)parms[31], 3);
               stmt.setInt(31, ((Number) parms[32]).intValue());
               stmt.setByte(32, ((Number) parms[33]).byteValue());
               stmt.setString(33, (String)parms[34], 1);
               stmt.setShort(34, ((Number) parms[35]).shortValue());
               stmt.setByte(35, ((Number) parms[36]).byteValue());
               stmt.setShort(36, ((Number) parms[37]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

