package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn05_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action14") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV33ContCod = httpContext.GetPar( "ContCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33ContCod", AV33ContCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A39AlbProPri = httpContext.GetPar( "AlbProPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_14_1L03( Gx_mode, A396EmprCod, AV33ContCod, A30AlbProCod, A39AlbProPri) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3869AlbCliDes = (int)(GXutil.lval( httpContext.GetPar( "AlbCliDes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_15_1L03( A396EmprCod, A3869AlbCliDes) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1243GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         AV36Clictrl = httpContext.GetPar( "Clictrl") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Clictrl", AV36Clictrl);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_16_1L03( A396EmprCod, A1243GuiRemCli, AV36Clictrl) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action17") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3869AlbCliDes = (int)(GXutil.lval( httpContext.GetPar( "AlbCliDes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         AV36Clictrl = httpContext.GetPar( "Clictrl") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Clictrl", AV36Clictrl);
         AV38Otrocli = CommonUtil.decimalVal( httpContext.GetPar( "Otrocli"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Otrocli", GXutil.ltrimstr( AV38Otrocli, 10, 2));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_17_1L03( A396EmprCod, A3869AlbCliDes, AV36Clictrl, AV38Otrocli) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action26") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         A1262BarPreKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarPreKgm"), ".") ;
         A1264BarPreMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarPreMtr"), ".") ;
         A32AlbProEsp = (byte)(GXutil.lval( httpContext.GetPar( "AlbProEsp"))) ;
         A40AlbProRec = CommonUtil.decimalVal( httpContext.GetPar( "AlbProRec"), ".") ;
         A2839AlbProVal = httpContext.GetPar( "AlbProVal") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_26_1L0195( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A1262BarPreKgm, A1264BarPreMtr, A32AlbProEsp, A40AlbProRec, A2839AlbProVal) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action30") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV41Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41Pgmname", AV41Pgmname);
         AV8UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
         AV12Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
         AV35Texto_i = httpContext.GetPar( "Texto_i") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Texto_i", AV35Texto_i);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_30_1L0195( A396EmprCod, AV41Pgmname, AV8UsurCod, AV12Station, AV35Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action33") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_33_1L0195( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_44") == 0 )
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
         gxload_44( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_47") == 0 )
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
         gxload_47( A1253EmprGuiRem, A1243GuiRemCli, A1259AlbDomEnv) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_46") == 0 )
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
         gxload_46( A3108AlbDivCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_42") == 0 )
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
         gxload_42( A1253EmprGuiRem, A1243GuiRemCli) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_45") == 0 )
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
         gxload_45( A1253EmprGuiRem, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_49") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_49( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_50") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_50( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_52") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         A200BarPieCod = httpContext.GetPar( "BarPieCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_52( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A200BarPieCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridttrn05_hdrs_piezas_trozos") == 0 )
      {
         gxnrgridttrn05_hdrs_piezas_trozos_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
      {
         gxnrgrid2_newrow_invoke( ) ;
         return  ;
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
            AV32ALbprocod = GXutil.lval( httpContext.GetPar( "ALbprocod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32ALbprocod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32ALbprocod), 10, 0));
            Gx_mode = httpContext.GetPar( "Mode") ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Albaranes detalle rollos", ""), (short)(0)) ;
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

   public void gxnrgridttrn05_hdrs_piezas_trozos_newrow_invoke( )
   {
      nRC_GXsfl_264 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_264"))) ;
      nGXsfl_264_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_264_idx"))) ;
      sGXsfl_264_idx = httpContext.GetPar( "sGXsfl_264_idx") ;
      A197BarPConTro = (short)(GXutil.lval( httpContext.GetPar( "BarPConTro"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridttrn05_hdrs_piezas_trozos_newrow( ) ;
      /* End function gxnrGridttrn05_hdrs_piezas_trozos_newrow_invoke */
   }

   public void gxnrgrid2_newrow_invoke( )
   {
      nRC_GXsfl_231 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_231"))) ;
      nGXsfl_231_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_231_idx"))) ;
      sGXsfl_231_idx = httpContext.GetPar( "sGXsfl_231_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid2_newrow( ) ;
      /* End function gxnrGrid2_newrow_invoke */
   }

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_138 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_138"))) ;
      nGXsfl_138_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_138_idx"))) ;
      sGXsfl_138_idx = httpContext.GetPar( "sGXsfl_138_idx") ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
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

   public ttrn05_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn05_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn05_impl.class ));
   }

   public ttrn05_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbDivTCod = new HTMLChoice();
      cmbAlbProVal = new HTMLChoice();
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Albaranes detalle rollos", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn05.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrn05.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn05.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCod_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbProCod_Enabled, 1, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProfch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProfch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbProfch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProfch_Internalname, localUtil.format(A34AlbProfch, "99/99/99"), localUtil.format( A34AlbProfch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProfch_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbProfch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn05.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbProfch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbProfch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrn05.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProPri_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProPri_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProPri_Internalname, GXutil.rtrim( A39AlbProPri), GXutil.rtrim( localUtil.format( A39AlbProPri, "9")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProPri_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbProPri_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbDomEnv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbDomEnv_Internalname, httpContext.getMessage( "Domicilio de Envio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDomEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A1259AlbDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDomEnv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1259AlbDomEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(A1259AlbDomEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDomEnv_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbDomEnv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbDivCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbDivCod_Internalname, httpContext.getMessage( "Divisa Albaran", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDivCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3108AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDivCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3108AlbDivCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3108AlbDivCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDivCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbDivCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbDivAbr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbDivAbr_Internalname, httpContext.getMessage( "Abreviatura", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDivAbr_Internalname, GXutil.rtrim( A3109AlbDivAbr), GXutil.rtrim( localUtil.format( A3109AlbDivAbr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDivAbr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbDivAbr_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbDivTCod.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbDivTCod.getInternalname(), httpContext.getMessage( "Divisa Traspaso Contable", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbDivTCod, cmbAlbDivTCod.getInternalname(), GXutil.rtrim( A3093AlbDivTCod), 1, cmbAlbDivTCod.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbDivTCod.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "", true, (byte)(0), "HLP_TTrn05.htm");
      cmbAlbDivTCod.setValue( GXutil.rtrim( A3093AlbDivTCod) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbDivTCod.getInternalname(), "Values", cmbAlbDivTCod.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprGuiRem_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprGuiRem_Internalname, httpContext.getMessage( "EmprGuiRem", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprGuiRem_Internalname, GXutil.rtrim( A1253EmprGuiRem), GXutil.rtrim( localUtil.format( A1253EmprGuiRem, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprGuiRem_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprGuiRem_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGuiRemCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiRemCli_Internalname, httpContext.getMessage( "Codigo Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtGuiRemCli_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGuiRemCln_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiRemCln_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCln_Internalname, GXutil.rtrim( A1244GuiRemCln), GXutil.rtrim( localUtil.format( A1244GuiRemCln, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCln_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtGuiRemCln_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn05.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTrnCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTrnCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn05.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNom_Internalname, GXutil.rtrim( A841TrnNom), GXutil.rtrim( localUtil.format( A841TrnNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTrnNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbCliDes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbCliDes_Internalname, httpContext.getMessage( "Cliente Destino", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCliDes_Internalname, GXutil.ltrim( localUtil.ntoc( A3869AlbCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3869AlbCliDes), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCliDes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbCliDes_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbColCa_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbColCa_Internalname, httpContext.getMessage( "Color Camion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbColCa_Internalname, GXutil.rtrim( A7987AlbColCa), GXutil.rtrim( localUtil.format( A7987AlbColCa, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbColCa_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbColCa_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTrnNc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbTrnNc_Internalname, httpContext.getMessage( "N contribuiente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTrnNc_Internalname, GXutil.rtrim( A10837AlbTrnNc), GXutil.rtrim( localUtil.format( A10837AlbTrnNc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTrnNc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbTrnNc_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProEst_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProEst_Internalname, httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProEst_Internalname, GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProEst_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbProEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProEso_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProEso_Internalname, httpContext.getMessage( "Facturación", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProEso_Internalname, GXutil.ltrim( localUtil.ntoc( A1782AlbProEso, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProEso_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1782AlbProEso), "9") : localUtil.format( DecimalUtil.doubleToDec(A1782AlbProEso), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProEso_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbProEso_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBusDomEnv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBusDomEnv_Internalname, httpContext.getMessage( "Busca Domicilio de Envio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBusDomEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A1260BusDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBusDomEnv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1260BusDomEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(A1260BusDomEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBusDomEnv_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBusDomEnv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divHdrstable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlehdrs_Internalname, httpContext.getMessage( "HDRs", ""), "", "", lblTitlehdrs_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_grid1( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 273,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 275,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 277,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn05.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_grid1( )
   {
      /*  Grid Control  */
      startgridcontrol138( ) ;
      /* Save parent mode. */
      sMode195 = Gx_mode ;
      nGXsfl_138_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount195 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_195 = (short)(1) ;
            scanStart1L0195( ) ;
            while ( RcdFound195 != 0 )
            {
               init_level_properties195( ) ;
               getByPrimaryKey1L0195( ) ;
               addRow1L0195( ) ;
               scanNext1L0195( ) ;
            }
            scanEnd1L0195( ) ;
            nBlankRcdCount195 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B39AlbProPri = A39AlbProPri ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         standaloneNotModal1L0195( ) ;
         standaloneModal1L0195( ) ;
         sMode195 = Gx_mode ;
         while ( nGXsfl_138_idx < nRC_GXsfl_138 )
         {
            bGXsfl_138_Refreshing = true ;
            readRow1L0195( ) ;
            edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_138_Refreshing);
            edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_138_Refreshing);
            edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_138_Refreshing);
            edtBarAlbKgmE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBKGME_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAlbKgmE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbKgmE_Enabled), 5, 0), !bGXsfl_138_Refreshing);
            edtBarAlbMtrE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBMTRE_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAlbMtrE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbMtrE_Enabled), 5, 0), !bGXsfl_138_Refreshing);
            edtBarAlbPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBPIE_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPie_Enabled), 5, 0), !bGXsfl_138_Refreshing);
            edtBarPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPREKGM_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreKgm_Enabled), 5, 0), !bGXsfl_138_Refreshing);
            edtBarPreMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPREMTR_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreMtr_Enabled), 5, 0), !bGXsfl_138_Refreshing);
            edtBarSit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSIT_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), !bGXsfl_138_Refreshing);
            cmbAlbProVal.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROVAL_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbAlbProVal.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProVal.getEnabled(), 5, 0), !bGXsfl_138_Refreshing);
            edtBarAlbObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBOBS_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAlbObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbObs_Enabled), 5, 0), !bGXsfl_138_Refreshing);
            edtAlbProEsp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROESP_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProEsp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEsp_Enabled), 5, 0), !bGXsfl_138_Refreshing);
            edtAlbProRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROREC_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProRec_Enabled), 5, 0), !bGXsfl_138_Refreshing);
            edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_138_Refreshing);
            edtBarAlbKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBKGM_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAlbKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbKgm_Enabled), 5, 0), !bGXsfl_138_Refreshing);
            edtBarAlbMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBMTR_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarAlbMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbMtr_Enabled), 5, 0), !bGXsfl_138_Refreshing);
            if ( ( nRcdExists_195 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1L0195( ) ;
            }
            sendRow1L0195( ) ;
            bGXsfl_138_Refreshing = false ;
         }
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A39AlbProPri = B39AlbProPri ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount195 = (short)(5) ;
         nRcdExists_195 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1L0195( ) ;
            while ( RcdFound195 != 0 )
            {
               sGXsfl_138_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_138_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_138195( ) ;
               init_level_properties195( ) ;
               standaloneNotModal1L0195( ) ;
               getByPrimaryKey1L0195( ) ;
               standaloneModal1L0195( ) ;
               addRow1L0195( ) ;
               scanNext1L0195( ) ;
            }
            scanEnd1L0195( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode195 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_138_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_138_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_138195( ) ;
         initAll1L0195( ) ;
         init_level_properties195( ) ;
         B39AlbProPri = A39AlbProPri ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         nRcdExists_195 = (short)(0) ;
         nIsMod_195 = (short)(0) ;
         nRcdDeleted_195 = (short)(0) ;
         nBlankRcdCount195 = (short)(nBlankRcdUsr195+nBlankRcdCount195) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount195 > 0 )
         {
            standaloneNotModal1L0195( ) ;
            standaloneModal1L0195( ) ;
            addRow1L0195( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount195 = (short)(nBlankRcdCount195-1) ;
         }
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A39AlbProPri = B39AlbProPri ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      }
      /* Restore parent mode. */
      Gx_mode = sMode195 ;
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
         Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z34AlbProfch = localUtil.ctod( httpContext.cgiGet( "Z34AlbProfch"), 0) ;
         Z39AlbProPri = httpContext.cgiGet( "Z39AlbProPri") ;
         Z1259AlbDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1259AlbDomEnv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3093AlbDivTCod = httpContext.cgiGet( "Z3093AlbDivTCod") ;
         Z3869AlbCliDes = (int)(localUtil.ctol( httpContext.cgiGet( "Z3869AlbCliDes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7987AlbColCa = httpContext.cgiGet( "Z7987AlbColCa") ;
         Z10837AlbTrnNc = httpContext.cgiGet( "Z10837AlbTrnNc") ;
         Z33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z33AlbProEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1782AlbProEso = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1782AlbProEso"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1253EmprGuiRem = httpContext.cgiGet( "Z1253EmprGuiRem") ;
         Z1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "Z1243GuiRemCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3108AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3108AlbDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O39AlbProPri = httpContext.cgiGet( "O39AlbProPri") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_138 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_138"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV32ALbprocod = localUtil.ctol( httpContext.cgiGet( "vALBPROCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV33ContCod = httpContext.cgiGet( "vCONTCOD") ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV34clinom = httpContext.cgiGet( "vCLINOM") ;
         AV36Clictrl = httpContext.cgiGet( "vCLICTRL") ;
         AV40Utexta = localUtil.ctond( httpContext.cgiGet( "vUTEXTA")) ;
         AV38Otrocli = localUtil.ctond( httpContext.cgiGet( "vOTROCLI")) ;
         AV41Pgmname = httpContext.cgiGet( "vPGMNAME") ;
         AV35Texto_i = httpContext.cgiGet( "vTEXTO_I") ;
         AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
         AV12Station = httpContext.cgiGet( "vSTATION") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
         A39AlbProPri = httpContext.cgiGet( edtAlbProPri_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
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
         A3109AlbDivAbr = httpContext.cgiGet( edtAlbDivAbr_Internalname) ;
         n3109AlbDivAbr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
         cmbAlbDivTCod.setName( cmbAlbDivTCod.getInternalname() );
         cmbAlbDivTCod.setValue( httpContext.cgiGet( cmbAlbDivTCod.getInternalname()) );
         A3093AlbDivTCod = httpContext.cgiGet( cmbAlbDivTCod.getInternalname()) ;
         n3093AlbDivTCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
         A1253EmprGuiRem = GXutil.upper( httpContext.cgiGet( edtEmprGuiRem_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GUIREMCLI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtGuiRemCli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1243GuiRemCli = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         }
         else
         {
            A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         }
         A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A840TrnCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
         n841TrnNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbCliDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbCliDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBCLIDES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbCliDes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3869AlbCliDes = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         }
         else
         {
            A3869AlbCliDes = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbCliDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         }
         A7987AlbColCa = httpContext.cgiGet( edtAlbColCa_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7987AlbColCa", A7987AlbColCa);
         A10837AlbTrnNc = httpContext.cgiGet( edtAlbTrnNc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10837AlbTrnNc", A10837AlbTrnNc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROEST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbProEst_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A33AlbProEst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
         }
         else
         {
            A33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProEso_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProEso_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROESO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbProEso_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1782AlbProEso = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1782AlbProEso", GXutil.str( A1782AlbProEso, 1, 0));
         }
         else
         {
            A1782AlbProEso = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProEso_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1782AlbProEso", GXutil.str( A1782AlbProEso, 1, 0));
         }
         A1260BusDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtBusDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1260BusDomEnv = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TTrn05");
         forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( A30AlbProCod != Z30AlbProCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ttrn05:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            AnyError = (short)(1) ;
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         /* Check if conditions changed and reset current page numbers */
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
            A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            getEqualNoModal( ) ;
            if ( ! isIns( )  )
            {
               A30AlbProCod = AV32ALbprocod ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            }
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
               if ( ! isIns( )  )
               {
                  A30AlbProCod = AV32ALbprocod ;
                  httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               }
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
                     confirm_1L00( ) ;
                     if ( AnyError == 0 )
                     {
                        GX_FocusControl = bttBtn_enter_Internalname ;
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
            initAll1L03( ) ;
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
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
         }
         disableAttributes1L03( ) ;
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

   public void confirm_1L00( )
   {
      beforeValidate1L03( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1L03( ) ;
         }
         else
         {
            checkExtendedTable1L03( ) ;
            closeExtendedTableCursors1L03( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode3 = Gx_mode ;
         confirm_1L0195( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode3 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1L0198( )
   {
      s197BarPConTro = O197BarPConTro ;
      nGXsfl_264_idx = 0 ;
      while ( nGXsfl_264_idx < nRC_GXsfl_264 )
      {
         readRow1L0198( ) ;
         if ( ( nRcdExists_198 != 0 ) || ( nIsMod_198 != 0 ) )
         {
            getKey1L0198( ) ;
            if ( ( nRcdExists_198 == 0 ) && ( nRcdDeleted_198 == 0 ) )
            {
               if ( RcdFound198 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1L0198( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1L0198( ) ;
                     closeExtendedTableCursors1L0198( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O197BarPConTro = A197BarPConTro ;
                  }
               }
               else
               {
                  GXCCtl = "BARCOD_" + sGXsfl_138_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound198 != 0 )
               {
                  if ( nRcdDeleted_198 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1L0198( ) ;
                     load1L0198( ) ;
                     beforeValidate1L0198( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1L0198( ) ;
                        O197BarPConTro = A197BarPConTro ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_198 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1L0198( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1L0198( ) ;
                           closeExtendedTableCursors1L0198( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O197BarPConTro = A197BarPConTro ;
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_198 == 0 )
                  {
                     GXCCtl = "BARCOD_" + sGXsfl_138_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbPTroCod_Internalname, GXutil.ltrim( localUtil.ntoc( A42AlbPTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPTroMet_Internalname, GXutil.ltrim( localUtil.ntoc( A43AlbPTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPTroKil_Internalname, GXutil.ltrim( localUtil.ntoc( A5303AlbPTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPTroAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3118AlbPTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z42AlbPTroCod_"+sGXsfl_264_idx, GXutil.ltrim( localUtil.ntoc( Z42AlbPTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z43AlbPTroMet_"+sGXsfl_264_idx, GXutil.ltrim( localUtil.ntoc( Z43AlbPTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5303AlbPTroKil_"+sGXsfl_264_idx, GXutil.ltrim( localUtil.ntoc( Z5303AlbPTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3118AlbPTroAnc_"+sGXsfl_264_idx, GXutil.ltrim( localUtil.ntoc( Z3118AlbPTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_198_"+sGXsfl_264_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_198_"+sGXsfl_264_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_198_"+sGXsfl_264_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_198 != 0 )
         {
            httpContext.changePostValue( "ALBPTROCOD_"+sGXsfl_264_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROMET_"+sGXsfl_264_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROKIL_"+sGXsfl_264_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROANC_"+sGXsfl_264_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O197BarPConTro = s197BarPConTro ;
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1L0197( )
   {
      s1268BarAlbMtr = O1268BarAlbMtr ;
      s1267BarAlbKgm = O1267BarAlbKgm ;
      nGXsfl_231_idx = 0 ;
      while ( nGXsfl_231_idx < nRC_GXsfl_231 )
      {
         readRow1L0197( ) ;
         if ( ( nRcdExists_197 != 0 ) || ( nIsMod_197 != 0 ) )
         {
            getKey1L0197( ) ;
            if ( ( nRcdExists_197 == 0 ) && ( nRcdDeleted_197 == 0 ) )
            {
               if ( RcdFound197 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1L0197( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1L0197( ) ;
                     closeExtendedTableCursors1L0197( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode197 = Gx_mode ;
                        confirm_1L0198( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode197 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode197 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     O1268BarAlbMtr = A1268BarAlbMtr ;
                     O1267BarAlbKgm = A1267BarAlbKgm ;
                  }
               }
               else
               {
                  GXCCtl = "BARCOD_" + sGXsfl_138_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound197 != 0 )
               {
                  if ( nRcdDeleted_197 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1L0197( ) ;
                     load1L0197( ) ;
                     beforeValidate1L0197( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1L0197( ) ;
                        O1268BarAlbMtr = A1268BarAlbMtr ;
                        O1267BarAlbKgm = A1267BarAlbKgm ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_197 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1L0197( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1L0197( ) ;
                           closeExtendedTableCursors1L0197( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode197 = Gx_mode ;
                              confirm_1L0198( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode197 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode197 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                           O1268BarAlbMtr = A1268BarAlbMtr ;
                           O1267BarAlbKgm = A1267BarAlbKgm ;
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_197 == 0 )
                  {
                     GXCCtl = "BARCOD_" + sGXsfl_138_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtBarPieCod_Internalname, GXutil.rtrim( A200BarPieCod)) ;
         httpContext.changePostValue( edtAlbPKilEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A27AlbPKilEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPMtrEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A1270AlbPMtrEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPConTro_Internalname, GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z200BarPieCod_"+sGXsfl_231_idx, GXutil.rtrim( Z200BarPieCod)) ;
         httpContext.changePostValue( "ZT_"+"Z27AlbPKilEnt_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( Z27AlbPKilEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1270AlbPMtrEnt_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( Z1270AlbPMtrEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z197BarPConTro_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( Z197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T197BarPConTro_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( O197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1270AlbPMtrEnt_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( O1270AlbPMtrEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T27AlbPKilEnt_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( O27AlbPKilEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_264_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_264, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_197_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_197, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_197_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_197, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_197_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_197, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_197 != 0 )
         {
            httpContext.changePostValue( "BARPIECOD_"+sGXsfl_231_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPKILENT_"+sGXsfl_231_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPKilEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPMTRENT_"+sGXsfl_231_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPMtrEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPCONTRO_"+sGXsfl_231_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPConTro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O1268BarAlbMtr = s1268BarAlbMtr ;
      O1267BarAlbKgm = s1267BarAlbKgm ;
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1L0195( )
   {
      nGXsfl_138_idx = 0 ;
      while ( nGXsfl_138_idx < nRC_GXsfl_138 )
      {
         readRow1L0195( ) ;
         if ( ( nRcdExists_195 != 0 ) || ( nIsMod_195 != 0 ) )
         {
            getKey1L0195( ) ;
            if ( ( nRcdExists_195 == 0 ) && ( nRcdDeleted_195 == 0 ) )
            {
               if ( RcdFound195 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1L0195( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1L0195( ) ;
                     closeExtendedTableCursors1L0195( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode195 = Gx_mode ;
                        confirm_1L0197( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode195 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode195 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "BARCOD_" + sGXsfl_138_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound195 != 0 )
               {
                  if ( nRcdDeleted_195 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1L0195( ) ;
                     load1L0195( ) ;
                     beforeValidate1L0195( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1L0195( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_195 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1L0195( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1L0195( ) ;
                           closeExtendedTableCursors1L0195( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode195 = Gx_mode ;
                              confirm_1L0197( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode195 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode195 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_195 == 0 )
                  {
                     GXCCtl = "BARCOD_" + sGXsfl_138_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtBarAlbKgmE_Internalname, GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAlbMtrE_Internalname, GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAlbPie_Internalname, GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbProVal.getInternalname(), GXutil.rtrim( A2839AlbProVal)) ;
         httpContext.changePostValue( edtBarAlbObs_Internalname, GXutil.rtrim( A2396BarAlbObs)) ;
         httpContext.changePostValue( edtAlbProEsp_Internalname, GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbProRec_Internalname, GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAlbKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A1267BarAlbKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAlbMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1268BarAlbMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_138_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "ZT_"+"Z2839AlbProVal_"+sGXsfl_138_idx, GXutil.rtrim( Z2839AlbProVal)) ;
         httpContext.changePostValue( "ZT_"+"Z1261BarAlbKgmE_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( Z1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1263BarAlbMtrE_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( Z1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1265BarAlbPie_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( Z1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1262BarPreKgm_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( Z1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1264BarPreMtr_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( Z1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2396BarAlbObs_"+sGXsfl_138_idx, GXutil.rtrim( Z2396BarAlbObs)) ;
         httpContext.changePostValue( "ZT_"+"Z32AlbProEsp_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( Z32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z40AlbProRec_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( Z40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1268BarAlbMtr_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( O1268BarAlbMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1267BarAlbKgm_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( O1267BarAlbKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_231_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_231, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_195_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_195_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_195_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_195 != 0 )
         {
            httpContext.changePostValue( "BARCOD_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBKGME_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbKgmE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBMTRE_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbMtrE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBPIE_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPREKGM_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPREMTR_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSIT_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROVAL_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbProVal.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBOBS_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROESP_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProEsp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROREC_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBKGM_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBMTR_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1L00( )
   {
   }

   public void zm1L03( int GX_JID )
   {
      if ( ( GX_JID == 41 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z34AlbProfch = T01L014_A34AlbProfch[0] ;
            Z39AlbProPri = T01L014_A39AlbProPri[0] ;
            Z1259AlbDomEnv = T01L014_A1259AlbDomEnv[0] ;
            Z3093AlbDivTCod = T01L014_A3093AlbDivTCod[0] ;
            Z3869AlbCliDes = T01L014_A3869AlbCliDes[0] ;
            Z7987AlbColCa = T01L014_A7987AlbColCa[0] ;
            Z10837AlbTrnNc = T01L014_A10837AlbTrnNc[0] ;
            Z33AlbProEst = T01L014_A33AlbProEst[0] ;
            Z1782AlbProEso = T01L014_A1782AlbProEso[0] ;
            Z1253EmprGuiRem = T01L014_A1253EmprGuiRem[0] ;
            Z1243GuiRemCli = T01L014_A1243GuiRemCli[0] ;
            Z840TrnCod = T01L014_A840TrnCod[0] ;
            Z3108AlbDivCod = T01L014_A3108AlbDivCod[0] ;
         }
         else
         {
            Z34AlbProfch = A34AlbProfch ;
            Z39AlbProPri = A39AlbProPri ;
            Z1259AlbDomEnv = A1259AlbDomEnv ;
            Z3093AlbDivTCod = A3093AlbDivTCod ;
            Z3869AlbCliDes = A3869AlbCliDes ;
            Z7987AlbColCa = A7987AlbColCa ;
            Z10837AlbTrnNc = A10837AlbTrnNc ;
            Z33AlbProEst = A33AlbProEst ;
            Z1782AlbProEso = A1782AlbProEso ;
            Z1253EmprGuiRem = A1253EmprGuiRem ;
            Z1243GuiRemCli = A1243GuiRemCli ;
            Z840TrnCod = A840TrnCod ;
            Z3108AlbDivCod = A3108AlbDivCod ;
         }
      }
      if ( GX_JID == -41 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z34AlbProfch = A34AlbProfch ;
         Z39AlbProPri = A39AlbProPri ;
         Z1259AlbDomEnv = A1259AlbDomEnv ;
         Z3093AlbDivTCod = A3093AlbDivTCod ;
         Z3869AlbCliDes = A3869AlbCliDes ;
         Z7987AlbColCa = A7987AlbColCa ;
         Z10837AlbTrnNc = A10837AlbTrnNc ;
         Z33AlbProEst = A33AlbProEst ;
         Z1782AlbProEso = A1782AlbProEso ;
         Z1253EmprGuiRem = A1253EmprGuiRem ;
         Z1243GuiRemCli = A1243GuiRemCli ;
         Z396EmprCod = A396EmprCod ;
         Z840TrnCod = A840TrnCod ;
         Z3108AlbDivCod = A3108AlbDivCod ;
         Z407EmprNom = A407EmprNom ;
         Z3109AlbDivAbr = A3109AlbDivAbr ;
         Z1244GuiRemCln = A1244GuiRemCln ;
         Z1260BusDomEnv = A1260BusDomEnv ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbCliDes_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCliDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCliDes_Enabled), 5, 0), true);
      AV41Pgmname = "TTrn05" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Pgmname", AV41Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      /* Using cursor T01L016 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01L016_A407EmprNom[0] ;
      n407EmprNom = T01L016_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(13);
   }

   public void standaloneModal( )
   {
      if ( isUpd( )  || isDlt( )  || isIns( )  )
      {
         edtAlbProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      if ( ! isIns( )  )
      {
         edtAlbProPri_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPri_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbProPri_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPri_Enabled), 5, 0), true);
      }
      if ( ! isIns( )  )
      {
         edtGuiRemCli_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      }
      else
      {
         edtGuiRemCli_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      }
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Utilizar funcion Fn para eliminar Albaran", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isUpd( )  || isDlt( )  || isIns( )  )
      {
         edtAlbProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      if ( ! isIns( )  )
      {
         edtAlbProPri_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPri_Enabled), 5, 0), true);
      }
      if ( ! isIns( )  )
      {
         edtGuiRemCli_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
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
      if ( ! isIns( )  )
      {
         A30AlbProCod = AV32ALbprocod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      A1253EmprGuiRem = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A34AlbProfch)) && ( Gx_BScreen == 0 ) )
      {
         A34AlbProfch = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      }
      if ( isIns( )  && (GXutil.strcmp("", A39AlbProPri)==0) && ( Gx_BScreen == 0 ) )
      {
         A39AlbProPri = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
         {
            AV33ContCod = "555555" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33ContCod", AV33ContCod);
         }
         else
         {
            if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
            {
               AV33ContCod = "666666" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33ContCod", AV33ContCod);
            }
         }
      }
   }

   public void load1L03( )
   {
      /* Using cursor T01L021 */
      pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A407EmprNom = T01L021_A407EmprNom[0] ;
         n407EmprNom = T01L021_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A34AlbProfch = T01L021_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A39AlbProPri = T01L021_A39AlbProPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         A1259AlbDomEnv = T01L021_A1259AlbDomEnv[0] ;
         n1259AlbDomEnv = T01L021_n1259AlbDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
         A3109AlbDivAbr = T01L021_A3109AlbDivAbr[0] ;
         n3109AlbDivAbr = T01L021_n3109AlbDivAbr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
         A3093AlbDivTCod = T01L021_A3093AlbDivTCod[0] ;
         n3093AlbDivTCod = T01L021_n3093AlbDivTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
         A1244GuiRemCln = T01L021_A1244GuiRemCln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         A3869AlbCliDes = T01L021_A3869AlbCliDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         A7987AlbColCa = T01L021_A7987AlbColCa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7987AlbColCa", A7987AlbColCa);
         A10837AlbTrnNc = T01L021_A10837AlbTrnNc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10837AlbTrnNc", A10837AlbTrnNc);
         A33AlbProEst = T01L021_A33AlbProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
         A1782AlbProEso = T01L021_A1782AlbProEso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1782AlbProEso", GXutil.str( A1782AlbProEso, 1, 0));
         A1253EmprGuiRem = T01L021_A1253EmprGuiRem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A1243GuiRemCli = T01L021_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         A840TrnCod = T01L021_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A3108AlbDivCod = T01L021_A3108AlbDivCod[0] ;
         n3108AlbDivCod = T01L021_n3108AlbDivCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
         A1260BusDomEnv = T01L021_A1260BusDomEnv[0] ;
         n1260BusDomEnv = T01L021_n1260BusDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
         zm1L03( -41) ;
      }
      pr_default.close(18);
      onLoadActions1L03( ) ;
   }

   public void onLoadActions1L03( )
   {
      /* Using cursor T01L017 */
      pr_default.execute(14, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      A841TrnNom = T01L017_A841TrnNom[0] ;
      n841TrnNom = T01L017_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      pr_default.close(15);
      if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
      {
         AV33ContCod = "555555" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33ContCod", AV33ContCod);
      }
      else
      {
         if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
         {
            AV33ContCod = "666666" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33ContCod", AV33ContCod);
         }
      }
      /* Using cursor T01L018 */
      pr_default.execute(15, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      A841TrnNom = T01L018_A841TrnNom[0] ;
      n841TrnNom = T01L018_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      pr_default.close(15);
   }

   public void checkExtendedTable1L03( )
   {
      nIsDirty_3 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01L017 */
      pr_default.execute(14, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01L017_A841TrnNom[0] ;
      n841TrnNom = T01L017_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      pr_default.close(15);
      if ( true /* Level */ && ( A3869AlbCliDes > 0 ) )
      {
         GXv_char1[0] = AV34clinom ;
         new app.pclinom(remoteHandle, context).execute( A396EmprCod, A3869AlbCliDes, GXv_char1) ;
         ttrn05_impl.this.AV34clinom = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34clinom", AV34clinom);
      }
      if ( ! ( ( GXutil.strcmp(A39AlbProPri, "0") == 0 ) || ( GXutil.strcmp(A39AlbProPri, "1") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Prioridad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBPROPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProPri_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
      {
         AV33ContCod = "555555" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33ContCod", AV33ContCod);
      }
      else
      {
         if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
         {
            AV33ContCod = "666666" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33ContCod", AV33ContCod);
         }
      }
      if ( isUpd( )  && ( GXutil.strcmp(A39AlbProPri, O39AlbProPri) != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO se modificar este campo¡¡¡", ""), 1, "ALBPROPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProPri_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01L020 */
      pr_default.execute(17, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A1260BusDomEnv = T01L020_A1260BusDomEnv[0] ;
         n1260BusDomEnv = T01L020_n1260BusDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
      }
      else
      {
         nIsDirty_3 = (short)(1) ;
         A1260BusDomEnv = (byte)(0) ;
         n1260BusDomEnv = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
      }
      pr_default.close(17);
      if ( (0==A1260BusDomEnv) && ( ! (0==A1259AlbDomEnv) ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Domicilio envio inexistente", ""), 1, "ALBDOMENV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbDomEnv_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01L019 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (0==A3108AlbDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlb", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBDIVCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbDivCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A3109AlbDivAbr = T01L019_A3109AlbDivAbr[0] ;
      n3109AlbDivAbr = T01L019_n3109AlbDivAbr[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
      pr_default.close(16);
      /* Using cursor T01L015 */
      pr_default.execute(12, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1244GuiRemCln = T01L015_A1244GuiRemCln[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      pr_default.close(12);
      /* Using cursor T01L018 */
      pr_default.execute(15, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A841TrnNom = T01L018_A841TrnNom[0] ;
      n841TrnNom = T01L018_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      pr_default.close(15);
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A1243GuiRemCli ;
         GXv_char3[0] = AV36Clictrl ;
         new app.pclictr(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3) ;
         ttrn05_impl.this.A396EmprCod = GXv_char1[0] ;
         ttrn05_impl.this.A1243GuiRemCli = GXv_int2[0] ;
         ttrn05_impl.this.AV36Clictrl = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV36Clictrl", AV36Clictrl);
      }
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(AV36Clictrl, httpContext.getMessage( "S", "")) == 0 ) && ( AV40Utexta.doubleValue() == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion. Consultar con Administracion. Cliente en CONTROL ¡¡¡", ""), 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiRemCli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ && ( AV38Otrocli.doubleValue() == 1 ) )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int2[0] = A3869AlbCliDes ;
         GXv_char1[0] = AV36Clictrl ;
         new app.pclictr(remoteHandle, context).execute( GXv_char3, GXv_int2, GXv_char1) ;
         ttrn05_impl.this.A396EmprCod = GXv_char3[0] ;
         ttrn05_impl.this.A3869AlbCliDes = GXv_int2[0] ;
         ttrn05_impl.this.AV36Clictrl = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV36Clictrl", AV36Clictrl);
      }
      if ( true /* Level */ && true /* After */ && ( AV38Otrocli.doubleValue() == 1 ) && ( GXutil.strcmp(AV36Clictrl, httpContext.getMessage( "S", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion. Consultar con Administracion. Cliente Destino en CONTROL ¡¡¡", ""), 1, "ALBCLIDES");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbCliDes_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( A33AlbProEst == 2 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ALBARAN YA FACTURADO", ""), 1, "ALBPROEST");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProEst_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1L03( )
   {
      pr_default.close(14);
      pr_default.close(17);
      pr_default.close(16);
      pr_default.close(12);
      pr_default.close(15);
   }

   public void enableDisable( )
   {
   }

   public void gxload_44( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01L022 */
      pr_default.execute(19, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01L022_A841TrnNom[0] ;
      n841TrnNom = T01L022_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void gxload_47( String A1253EmprGuiRem ,
                          int A1243GuiRemCli ,
                          byte A1259AlbDomEnv )
   {
      /* Using cursor T01L023 */
      pr_default.execute(20, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         A1260BusDomEnv = T01L023_A1260BusDomEnv[0] ;
         n1260BusDomEnv = T01L023_n1260BusDomEnv[0] ;
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
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void gxload_46( byte A3108AlbDivCod )
   {
      /* Using cursor T01L024 */
      pr_default.execute(21, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         if ( ! ( (0==A3108AlbDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlb", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBDIVCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbDivCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A3109AlbDivAbr = T01L024_A3109AlbDivAbr[0] ;
      n3109AlbDivAbr = T01L024_n3109AlbDivAbr[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3109AlbDivAbr))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void gxload_42( String A1253EmprGuiRem ,
                          int A1243GuiRemCli )
   {
      /* Using cursor T01L025 */
      pr_default.execute(22, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1244GuiRemCln = T01L025_A1244GuiRemCln[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1244GuiRemCln))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void gxload_45( String A1253EmprGuiRem ,
                          short A840TrnCod )
   {
      /* Using cursor T01L026 */
      pr_default.execute(23, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A841TrnNom = T01L026_A841TrnNom[0] ;
      n841TrnNom = T01L026_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(23) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(23);
   }

   public void getKey1L03( )
   {
      /* Using cursor T01L027 */
      pr_default.execute(24, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(24);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01L014 */
      pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01L014_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1L03( 41) ;
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T01L014_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A34AlbProfch = T01L014_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A39AlbProPri = T01L014_A39AlbProPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         A1259AlbDomEnv = T01L014_A1259AlbDomEnv[0] ;
         n1259AlbDomEnv = T01L014_n1259AlbDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
         A3093AlbDivTCod = T01L014_A3093AlbDivTCod[0] ;
         n3093AlbDivTCod = T01L014_n3093AlbDivTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
         A3869AlbCliDes = T01L014_A3869AlbCliDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         A7987AlbColCa = T01L014_A7987AlbColCa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7987AlbColCa", A7987AlbColCa);
         A10837AlbTrnNc = T01L014_A10837AlbTrnNc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10837AlbTrnNc", A10837AlbTrnNc);
         A33AlbProEst = T01L014_A33AlbProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
         A1782AlbProEso = T01L014_A1782AlbProEso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1782AlbProEso", GXutil.str( A1782AlbProEso, 1, 0));
         A1253EmprGuiRem = T01L014_A1253EmprGuiRem[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A1243GuiRemCli = T01L014_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         A840TrnCod = T01L014_A840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A3108AlbDivCod = T01L014_A3108AlbDivCod[0] ;
         n3108AlbDivCod = T01L014_n3108AlbDivCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
         O39AlbProPri = A39AlbProPri ;
         httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1L03( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey1L03( ) ;
         }
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey1L03( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(11);
   }

   public void getEqualNoModal( )
   {
      getKey1L03( ) ;
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
      /* Using cursor T01L028 */
      pr_default.execute(25, new Object[] {Long.valueOf(A30AlbProCod), A396EmprCod});
      if ( (pr_default.getStatus(25) != 101) )
      {
         while ( (pr_default.getStatus(25) != 101) && ( ( T01L028_A30AlbProCod[0] < A30AlbProCod ) ) && ( GXutil.strcmp(T01L028_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(25);
         }
         if ( (pr_default.getStatus(25) != 101) && ( ( T01L028_A30AlbProCod[0] > A30AlbProCod ) ) && ( GXutil.strcmp(T01L028_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A30AlbProCod = T01L028_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(25);
   }

   public void move_previous( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T01L029 */
      pr_default.execute(26, new Object[] {Long.valueOf(A30AlbProCod), A396EmprCod});
      if ( (pr_default.getStatus(26) != 101) )
      {
         while ( (pr_default.getStatus(26) != 101) && ( ( T01L029_A30AlbProCod[0] > A30AlbProCod ) ) && ( GXutil.strcmp(T01L029_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(26);
         }
         if ( (pr_default.getStatus(26) != 101) && ( ( T01L029_A30AlbProCod[0] < A30AlbProCod ) ) && ( GXutil.strcmp(T01L029_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A30AlbProCod = T01L029_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(26);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1L03( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1L03( ) ;
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
               update1L03( ) ;
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
               insert1L03( ) ;
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
                  insert1L03( ) ;
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
      if ( isIns( ) || isUpd( ) || isDlt( ) )
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

   public void checkOptimisticConcurrency1L03( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01L013 */
         pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(10) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(10) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z34AlbProfch), GXutil.resetTime(T01L013_A34AlbProfch[0])) ) || ( GXutil.strcmp(Z39AlbProPri, T01L013_A39AlbProPri[0]) != 0 ) || ( Z1259AlbDomEnv != T01L013_A1259AlbDomEnv[0] ) || ( GXutil.strcmp(Z3093AlbDivTCod, T01L013_A3093AlbDivTCod[0]) != 0 ) || ( Z3869AlbCliDes != T01L013_A3869AlbCliDes[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7987AlbColCa, T01L013_A7987AlbColCa[0]) != 0 ) || ( GXutil.strcmp(Z10837AlbTrnNc, T01L013_A10837AlbTrnNc[0]) != 0 ) || ( Z33AlbProEst != T01L013_A33AlbProEst[0] ) || ( Z1782AlbProEso != T01L013_A1782AlbProEso[0] ) || ( GXutil.strcmp(Z1253EmprGuiRem, T01L013_A1253EmprGuiRem[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1243GuiRemCli != T01L013_A1243GuiRemCli[0] ) || ( Z840TrnCod != T01L013_A840TrnCod[0] ) || ( Z3108AlbDivCod != T01L013_A3108AlbDivCod[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z34AlbProfch), GXutil.resetTime(T01L013_A34AlbProfch[0])) ) )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"AlbProfch");
               GXutil.writeLogRaw("Old: ",Z34AlbProfch);
               GXutil.writeLogRaw("Current: ",T01L013_A34AlbProfch[0]);
            }
            if ( GXutil.strcmp(Z39AlbProPri, T01L013_A39AlbProPri[0]) != 0 )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"AlbProPri");
               GXutil.writeLogRaw("Old: ",Z39AlbProPri);
               GXutil.writeLogRaw("Current: ",T01L013_A39AlbProPri[0]);
            }
            if ( Z1259AlbDomEnv != T01L013_A1259AlbDomEnv[0] )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"AlbDomEnv");
               GXutil.writeLogRaw("Old: ",Z1259AlbDomEnv);
               GXutil.writeLogRaw("Current: ",T01L013_A1259AlbDomEnv[0]);
            }
            if ( GXutil.strcmp(Z3093AlbDivTCod, T01L013_A3093AlbDivTCod[0]) != 0 )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"AlbDivTCod");
               GXutil.writeLogRaw("Old: ",Z3093AlbDivTCod);
               GXutil.writeLogRaw("Current: ",T01L013_A3093AlbDivTCod[0]);
            }
            if ( Z3869AlbCliDes != T01L013_A3869AlbCliDes[0] )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"AlbCliDes");
               GXutil.writeLogRaw("Old: ",Z3869AlbCliDes);
               GXutil.writeLogRaw("Current: ",T01L013_A3869AlbCliDes[0]);
            }
            if ( GXutil.strcmp(Z7987AlbColCa, T01L013_A7987AlbColCa[0]) != 0 )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"AlbColCa");
               GXutil.writeLogRaw("Old: ",Z7987AlbColCa);
               GXutil.writeLogRaw("Current: ",T01L013_A7987AlbColCa[0]);
            }
            if ( GXutil.strcmp(Z10837AlbTrnNc, T01L013_A10837AlbTrnNc[0]) != 0 )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"AlbTrnNc");
               GXutil.writeLogRaw("Old: ",Z10837AlbTrnNc);
               GXutil.writeLogRaw("Current: ",T01L013_A10837AlbTrnNc[0]);
            }
            if ( Z33AlbProEst != T01L013_A33AlbProEst[0] )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"AlbProEst");
               GXutil.writeLogRaw("Old: ",Z33AlbProEst);
               GXutil.writeLogRaw("Current: ",T01L013_A33AlbProEst[0]);
            }
            if ( Z1782AlbProEso != T01L013_A1782AlbProEso[0] )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"AlbProEso");
               GXutil.writeLogRaw("Old: ",Z1782AlbProEso);
               GXutil.writeLogRaw("Current: ",T01L013_A1782AlbProEso[0]);
            }
            if ( GXutil.strcmp(Z1253EmprGuiRem, T01L013_A1253EmprGuiRem[0]) != 0 )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"EmprGuiRem");
               GXutil.writeLogRaw("Old: ",Z1253EmprGuiRem);
               GXutil.writeLogRaw("Current: ",T01L013_A1253EmprGuiRem[0]);
            }
            if ( Z1243GuiRemCli != T01L013_A1243GuiRemCli[0] )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"GuiRemCli");
               GXutil.writeLogRaw("Old: ",Z1243GuiRemCli);
               GXutil.writeLogRaw("Current: ",T01L013_A1243GuiRemCli[0]);
            }
            if ( Z840TrnCod != T01L013_A840TrnCod[0] )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01L013_A840TrnCod[0]);
            }
            if ( Z3108AlbDivCod != T01L013_A3108AlbDivCod[0] )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"AlbDivCod");
               GXutil.writeLogRaw("Old: ",Z3108AlbDivCod);
               GXutil.writeLogRaw("Current: ",T01L013_A3108AlbDivCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1L03( )
   {
      beforeValidate1L03( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L03( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1L03( 0) ;
         checkOptimisticConcurrency1L03( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1L03( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1L03( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L030 */
                  pr_default.execute(27, new Object[] {Long.valueOf(A30AlbProCod), A34AlbProfch, A39AlbProPri, Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv), Boolean.valueOf(n3093AlbDivTCod), A3093AlbDivTCod, Integer.valueOf(A3869AlbCliDes), A7987AlbColCa, A10837AlbTrnNc, Byte.valueOf(A33AlbProEst), Byte.valueOf(A1782AlbProEso), A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), A396EmprCod, Short.valueOf(A840TrnCod), Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
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
                        processLevel1L03( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
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
         else
         {
            load1L03( ) ;
         }
         endLevel1L03( ) ;
      }
      closeExtendedTableCursors1L03( ) ;
   }

   public void update1L03( )
   {
      beforeValidate1L03( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L03( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1L03( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1L03( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1L03( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L031 */
                  pr_default.execute(28, new Object[] {A34AlbProfch, A39AlbProPri, Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv), Boolean.valueOf(n3093AlbDivTCod), A3093AlbDivTCod, Integer.valueOf(A3869AlbCliDes), A7987AlbColCa, A10837AlbTrnNc, Byte.valueOf(A33AlbProEst), Byte.valueOf(A1782AlbProEso), A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Short.valueOf(A840TrnCod), Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                  if ( (pr_default.getStatus(28) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1L03( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1L03( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
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
         endLevel1L03( ) ;
      }
      closeExtendedTableCursors1L03( ) ;
   }

   public void deferredUpdate1L03( )
   {
   }

   public void delete( )
   {
      beforeValidate1L03( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1L03( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1L03( ) ;
         afterConfirm1L03( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1L03( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01L032 */
               pr_default.execute(29, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     if ( isIns( ) || isUpd( ) || isDlt( ) )
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
      endLevel1L03( ) ;
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1L03( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isUpd( )  && ( GXutil.strcmp(A39AlbProPri, O39AlbProPri) != 0 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "NO se modificar este campo¡¡¡", ""), 1, "ALBPROPRI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbProPri_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
         {
            AV33ContCod = "555555" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33ContCod", AV33ContCod);
         }
         else
         {
            if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
            {
               AV33ContCod = "666666" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33ContCod", AV33ContCod);
            }
         }
         /* Using cursor T01L033 */
         pr_default.execute(30, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
         A3109AlbDivAbr = T01L033_A3109AlbDivAbr[0] ;
         n3109AlbDivAbr = T01L033_n3109AlbDivAbr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
         pr_default.close(30);
         /* Using cursor T01L034 */
         pr_default.execute(31, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A1244GuiRemCln = T01L034_A1244GuiRemCln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         pr_default.close(31);
         /* Using cursor T01L035 */
         pr_default.execute(32, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            A1260BusDomEnv = T01L035_A1260BusDomEnv[0] ;
            n1260BusDomEnv = T01L035_n1260BusDomEnv[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
         }
         else
         {
            A1260BusDomEnv = (byte)(0) ;
            n1260BusDomEnv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
         }
         pr_default.close(32);
         /* Using cursor T01L036 */
         pr_default.execute(33, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
         A841TrnNom = T01L036_A841TrnNom[0] ;
         n841TrnNom = T01L036_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         pr_default.close(33);
         /* Using cursor T01L037 */
         pr_default.execute(34, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
         A841TrnNom = T01L037_A841TrnNom[0] ;
         n841TrnNom = T01L037_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         pr_default.close(34);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01L038 */
         pr_default.execute(35, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Observaciones ALBARAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01L039 */
         pr_default.execute(36, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Hdrs Albaran", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01L040 */
         pr_default.execute(37, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CNOTRET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01L041 */
         pr_default.execute(38, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01L042 */
         pr_default.execute(39, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
      }
   }

   public void processNestedLevel1L0195( )
   {
      nGXsfl_138_idx = 0 ;
      while ( nGXsfl_138_idx < nRC_GXsfl_138 )
      {
         readRow1L0195( ) ;
         if ( ( nRcdExists_195 != 0 ) || ( nIsMod_195 != 0 ) )
         {
            standaloneNotModal1L0195( ) ;
            getKey1L0195( ) ;
            if ( ( nRcdExists_195 == 0 ) && ( nRcdDeleted_195 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1L0195( ) ;
            }
            else
            {
               if ( RcdFound195 != 0 )
               {
                  if ( ( nRcdDeleted_195 != 0 ) && ( nRcdExists_195 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1L0195( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_195 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1L0195( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_195 == 0 )
                  {
                     GXCCtl = "BARCOD_" + sGXsfl_138_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtBarAlbKgmE_Internalname, GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAlbMtrE_Internalname, GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAlbPie_Internalname, GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbAlbProVal.getInternalname(), GXutil.rtrim( A2839AlbProVal)) ;
         httpContext.changePostValue( edtBarAlbObs_Internalname, GXutil.rtrim( A2396BarAlbObs)) ;
         httpContext.changePostValue( edtAlbProEsp_Internalname, GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbProRec_Internalname, GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAlbKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A1267BarAlbKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarAlbMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1268BarAlbMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_138_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "ZT_"+"Z2839AlbProVal_"+sGXsfl_138_idx, GXutil.rtrim( Z2839AlbProVal)) ;
         httpContext.changePostValue( "ZT_"+"Z1261BarAlbKgmE_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( Z1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1263BarAlbMtrE_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( Z1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1265BarAlbPie_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( Z1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1262BarPreKgm_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( Z1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1264BarPreMtr_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( Z1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2396BarAlbObs_"+sGXsfl_138_idx, GXutil.rtrim( Z2396BarAlbObs)) ;
         httpContext.changePostValue( "ZT_"+"Z32AlbProEsp_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( Z32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z40AlbProRec_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( Z40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1268BarAlbMtr_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( O1268BarAlbMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1267BarAlbKgm_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( O1267BarAlbKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_231_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_231, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_195_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_195_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_195_"+sGXsfl_138_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_195 != 0 )
         {
            httpContext.changePostValue( "BARCOD_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBKGME_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbKgmE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBMTRE_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbMtrE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBPIE_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPREKGM_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPREMTR_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSIT_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROVAL_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbProVal.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBOBS_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROESP_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProEsp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROREC_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLICOD_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBKGM_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARALBMTR_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1L0195( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_195 = (short)(0) ;
      nIsMod_195 = (short)(0) ;
      nRcdDeleted_195 = (short)(0) ;
   }

   public void processLevel1L03( )
   {
      /* Save parent mode. */
      sMode3 = Gx_mode ;
      processNestedLevel1L0195( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1L03( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(10);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1L03( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrn05");
         if ( AnyError == 0 )
         {
            confirmValues1L00( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn05");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1L03( )
   {
      this.A396EmprCod = A396EmprCod ;
      /* Scan By routine */
      /* Using cursor T01L043 */
      pr_default.execute(40, new Object[] {A396EmprCod});
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T01L043_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1L03( )
   {
      /* Scan next routine */
      pr_default.readNext(40);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T01L043_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
   }

   public void scanEnd1L03( )
   {
      pr_default.close(40);
   }

   public void afterConfirm1L03( )
   {
      /* After Confirm Rules */
      if ( (0==A30AlbProCod) && true /* After */ && true /* After */ && isIns( )  )
      {
         GXv_int2[0] = (int)(A30AlbProCod) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV33ContCod, GXv_int2) ;
         ttrn05_impl.this.A30AlbProCod = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
   }

   public void beforeInsert1L03( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1L03( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1L03( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1L03( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1L03( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1L03( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtAlbProfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProfch_Enabled), 5, 0), true);
      edtAlbProPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPri_Enabled), 5, 0), true);
      edtAlbDomEnv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDomEnv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDomEnv_Enabled), 5, 0), true);
      edtAlbDivCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivCod_Enabled), 5, 0), true);
      edtAlbDivAbr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDivAbr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDivAbr_Enabled), 5, 0), true);
      cmbAlbDivTCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbDivTCod.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbDivTCod.getEnabled(), 5, 0), true);
      edtEmprGuiRem_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprGuiRem_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprGuiRem_Enabled), 5, 0), true);
      edtGuiRemCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      edtGuiRemCln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCln_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtTrnNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Enabled), 5, 0), true);
      edtAlbCliDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCliDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCliDes_Enabled), 5, 0), true);
      edtAlbColCa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColCa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColCa_Enabled), 5, 0), true);
      edtAlbTrnNc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTrnNc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTrnNc_Enabled), 5, 0), true);
      edtAlbProEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEst_Enabled), 5, 0), true);
      edtAlbProEso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEso_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEso_Enabled), 5, 0), true);
      edtBusDomEnv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBusDomEnv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBusDomEnv_Enabled), 5, 0), true);
   }

   public void zm1L0195( int GX_JID )
   {
      if ( ( GX_JID == 48 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2839AlbProVal = T01L09_A2839AlbProVal[0] ;
            Z1261BarAlbKgmE = T01L09_A1261BarAlbKgmE[0] ;
            Z1263BarAlbMtrE = T01L09_A1263BarAlbMtrE[0] ;
            Z1265BarAlbPie = T01L09_A1265BarAlbPie[0] ;
            Z1262BarPreKgm = T01L09_A1262BarPreKgm[0] ;
            Z1264BarPreMtr = T01L09_A1264BarPreMtr[0] ;
            Z2396BarAlbObs = T01L09_A2396BarAlbObs[0] ;
            Z32AlbProEsp = T01L09_A32AlbProEsp[0] ;
            Z40AlbProRec = T01L09_A40AlbProRec[0] ;
         }
         else
         {
            Z2839AlbProVal = A2839AlbProVal ;
            Z1261BarAlbKgmE = A1261BarAlbKgmE ;
            Z1263BarAlbMtrE = A1263BarAlbMtrE ;
            Z1265BarAlbPie = A1265BarAlbPie ;
            Z1262BarPreKgm = A1262BarPreKgm ;
            Z1264BarPreMtr = A1264BarPreMtr ;
            Z2396BarAlbObs = A2396BarAlbObs ;
            Z32AlbProEsp = A32AlbProEsp ;
            Z40AlbProRec = A40AlbProRec ;
         }
      }
      if ( GX_JID == -48 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z2839AlbProVal = A2839AlbProVal ;
         Z1261BarAlbKgmE = A1261BarAlbKgmE ;
         Z1263BarAlbMtrE = A1263BarAlbMtrE ;
         Z1265BarAlbPie = A1265BarAlbPie ;
         Z1262BarPreKgm = A1262BarPreKgm ;
         Z1264BarPreMtr = A1264BarPreMtr ;
         Z2396BarAlbObs = A2396BarAlbObs ;
         Z32AlbProEsp = A32AlbProEsp ;
         Z40AlbProRec = A40AlbProRec ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z213BarSit = A213BarSit ;
         Z252CliCod = A252CliCod ;
         Z1267BarAlbKgm = A1267BarAlbKgm ;
         Z1268BarAlbMtr = A1268BarAlbMtr ;
      }
   }

   public void standaloneNotModal1L0195( )
   {
   }

   public void standaloneModal1L0195( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Utilizar funcion Fn para eliminar Hoja de Ruta", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A2839AlbProVal)==0) && ( Gx_BScreen == 0 ) )
      {
         A2839AlbProVal = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      }
      else
      {
         edtBarCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      }
      else
      {
         edtBarCodReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      }
      else
      {
         edtBarCodPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      }
   }

   public void load1L0195( )
   {
      /* Using cursor T01L045 */
      pr_default.execute(41, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A2839AlbProVal = T01L045_A2839AlbProVal[0] ;
         A1261BarAlbKgmE = T01L045_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = T01L045_A1263BarAlbMtrE[0] ;
         A1265BarAlbPie = T01L045_A1265BarAlbPie[0] ;
         A1262BarPreKgm = T01L045_A1262BarPreKgm[0] ;
         A1264BarPreMtr = T01L045_A1264BarPreMtr[0] ;
         A213BarSit = T01L045_A213BarSit[0] ;
         A2396BarAlbObs = T01L045_A2396BarAlbObs[0] ;
         A32AlbProEsp = T01L045_A32AlbProEsp[0] ;
         A40AlbProRec = T01L045_A40AlbProRec[0] ;
         A252CliCod = T01L045_A252CliCod[0] ;
         n252CliCod = T01L045_n252CliCod[0] ;
         A1267BarAlbKgm = T01L045_A1267BarAlbKgm[0] ;
         A1268BarAlbMtr = T01L045_A1268BarAlbMtr[0] ;
         zm1L0195( -48) ;
      }
      pr_default.close(41);
      onLoadActions1L0195( ) ;
   }

   public void onLoadActions1L0195( )
   {
   }

   public void checkExtendedTable1L0195( )
   {
      nIsDirty_195 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1L0195( ) ;
      /* Using cursor T01L010 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(8) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_138_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A213BarSit = T01L010_A213BarSit[0] ;
      A252CliCod = T01L010_A252CliCod[0] ;
      n252CliCod = T01L010_n252CliCod[0] ;
      pr_default.close(8);
      if ( ( A213BarSit == 9 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "La Hoja de Ruta esta cerrada", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( A213BarSit == 9 ) && isUpd( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "La Hoja de Ruta esta cerrada", ""), 0, "");
      }
      if ( A213BarSit == 11 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "La Hoja de Ruta esta en Historico", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T01L012 */
      pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A1267BarAlbKgm = T01L012_A1267BarAlbKgm[0] ;
         A1268BarAlbMtr = T01L012_A1268BarAlbMtr[0] ;
      }
      else
      {
         nIsDirty_195 = (short)(1) ;
         A1267BarAlbKgm = DecimalUtil.doubleToDec(0) ;
         nIsDirty_195 = (short)(1) ;
         A1268BarAlbMtr = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(9);
      if ( ( A252CliCod != A1243GuiRemCli ) && true /* After */ )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_138_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente erroneo", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1L0195( )
   {
      pr_default.close(8);
      pr_default.close(9);
   }

   public void enableDisable1L0195( )
   {
   }

   public void gxload_49( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01L046 */
      pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(42) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_138_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A213BarSit = T01L046_A213BarSit[0] ;
      A252CliCod = T01L046_A252CliCod[0] ;
      n252CliCod = T01L046_n252CliCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(42) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(42);
   }

   public void gxload_50( String A396EmprCod ,
                          long A30AlbProCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01L048 */
      pr_default.execute(43, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(43) != 101) )
      {
         A1267BarAlbKgm = T01L048_A1267BarAlbKgm[0] ;
         A1268BarAlbMtr = T01L048_A1268BarAlbMtr[0] ;
      }
      else
      {
         A1267BarAlbKgm = DecimalUtil.doubleToDec(0) ;
         A1268BarAlbMtr = DecimalUtil.doubleToDec(0) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1267BarAlbKgm, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1268BarAlbMtr, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(43) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(43);
   }

   public void getKey1L0195( )
   {
      /* Using cursor T01L049 */
      pr_default.execute(44, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
      else
      {
         RcdFound195 = (short)(0) ;
      }
      pr_default.close(44);
   }

   public void getByPrimaryKey1L0195( )
   {
      /* Using cursor T01L09 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01L09_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1L0195( 48) ;
         RcdFound195 = (short)(1) ;
         initializeNonKey1L0195( ) ;
         A2839AlbProVal = T01L09_A2839AlbProVal[0] ;
         A1261BarAlbKgmE = T01L09_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = T01L09_A1263BarAlbMtrE[0] ;
         A1265BarAlbPie = T01L09_A1265BarAlbPie[0] ;
         A1262BarPreKgm = T01L09_A1262BarPreKgm[0] ;
         A1264BarPreMtr = T01L09_A1264BarPreMtr[0] ;
         A2396BarAlbObs = T01L09_A2396BarAlbObs[0] ;
         A32AlbProEsp = T01L09_A32AlbProEsp[0] ;
         A40AlbProRec = T01L09_A40AlbProRec[0] ;
         A129BarCod = T01L09_A129BarCod[0] ;
         A132BarCodReo = T01L09_A132BarCodReo[0] ;
         A130BarCodPar = T01L09_A130BarCodPar[0] ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1L0195( ) ;
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound195 = (short)(0) ;
         initializeNonKey1L0195( ) ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1L0195( ) ;
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1L0195( ) ;
      }
      pr_default.close(7);
   }

   public void checkOptimisticConcurrency1L0195( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01L08 */
         pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(6) == 101) || ( GXutil.strcmp(Z2839AlbProVal, T01L08_A2839AlbProVal[0]) != 0 ) || ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T01L08_A1261BarAlbKgmE[0]) != 0 ) || ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T01L08_A1263BarAlbMtrE[0]) != 0 ) || ( Z1265BarAlbPie != T01L08_A1265BarAlbPie[0] ) || ( DecimalUtil.compareTo(Z1262BarPreKgm, T01L08_A1262BarPreKgm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z1264BarPreMtr, T01L08_A1264BarPreMtr[0]) != 0 ) || ( GXutil.strcmp(Z2396BarAlbObs, T01L08_A2396BarAlbObs[0]) != 0 ) || ( Z32AlbProEsp != T01L08_A32AlbProEsp[0] ) || ( DecimalUtil.compareTo(Z40AlbProRec, T01L08_A40AlbProRec[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z2839AlbProVal, T01L08_A2839AlbProVal[0]) != 0 )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"AlbProVal");
               GXutil.writeLogRaw("Old: ",Z2839AlbProVal);
               GXutil.writeLogRaw("Current: ",T01L08_A2839AlbProVal[0]);
            }
            if ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T01L08_A1261BarAlbKgmE[0]) != 0 )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"BarAlbKgmE");
               GXutil.writeLogRaw("Old: ",Z1261BarAlbKgmE);
               GXutil.writeLogRaw("Current: ",T01L08_A1261BarAlbKgmE[0]);
            }
            if ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T01L08_A1263BarAlbMtrE[0]) != 0 )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"BarAlbMtrE");
               GXutil.writeLogRaw("Old: ",Z1263BarAlbMtrE);
               GXutil.writeLogRaw("Current: ",T01L08_A1263BarAlbMtrE[0]);
            }
            if ( Z1265BarAlbPie != T01L08_A1265BarAlbPie[0] )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"BarAlbPie");
               GXutil.writeLogRaw("Old: ",Z1265BarAlbPie);
               GXutil.writeLogRaw("Current: ",T01L08_A1265BarAlbPie[0]);
            }
            if ( DecimalUtil.compareTo(Z1262BarPreKgm, T01L08_A1262BarPreKgm[0]) != 0 )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"BarPreKgm");
               GXutil.writeLogRaw("Old: ",Z1262BarPreKgm);
               GXutil.writeLogRaw("Current: ",T01L08_A1262BarPreKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z1264BarPreMtr, T01L08_A1264BarPreMtr[0]) != 0 )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"BarPreMtr");
               GXutil.writeLogRaw("Old: ",Z1264BarPreMtr);
               GXutil.writeLogRaw("Current: ",T01L08_A1264BarPreMtr[0]);
            }
            if ( GXutil.strcmp(Z2396BarAlbObs, T01L08_A2396BarAlbObs[0]) != 0 )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"BarAlbObs");
               GXutil.writeLogRaw("Old: ",Z2396BarAlbObs);
               GXutil.writeLogRaw("Current: ",T01L08_A2396BarAlbObs[0]);
            }
            if ( Z32AlbProEsp != T01L08_A32AlbProEsp[0] )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"AlbProEsp");
               GXutil.writeLogRaw("Old: ",Z32AlbProEsp);
               GXutil.writeLogRaw("Current: ",T01L08_A32AlbProEsp[0]);
            }
            if ( DecimalUtil.compareTo(Z40AlbProRec, T01L08_A40AlbProRec[0]) != 0 )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"AlbProRec");
               GXutil.writeLogRaw("Old: ",Z40AlbProRec);
               GXutil.writeLogRaw("Current: ",T01L08_A40AlbProRec[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBBAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1L0195( )
   {
      beforeValidate1L0195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L0195( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1L0195( 0) ;
         checkOptimisticConcurrency1L0195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1L0195( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1L0195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L050 */
                  pr_default.execute(45, new Object[] {Long.valueOf(A30AlbProCod), A2839AlbProVal, A1261BarAlbKgmE, A1263BarAlbMtrE, Integer.valueOf(A1265BarAlbPie), A1262BarPreKgm, A1264BarPreMtr, A2396BarAlbObs, Byte.valueOf(A32AlbProEsp), A40AlbProRec, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
                  if ( (pr_default.getStatus(45) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ )
                     {
                        GXv_char3[0] = A396EmprCod ;
                        GXv_int4[0] = A30AlbProCod ;
                        GXv_int2[0] = A129BarCod ;
                        GXv_int5[0] = A132BarCodReo ;
                        GXv_char1[0] = A130BarCodPar ;
                        new app.pinspzstrz(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int2, GXv_int5, GXv_char1) ;
                        ttrn05_impl.this.A396EmprCod = GXv_char3[0] ;
                        ttrn05_impl.this.A30AlbProCod = GXv_int4[0] ;
                        ttrn05_impl.this.A129BarCod = GXv_int2[0] ;
                        ttrn05_impl.this.A132BarCodReo = GXv_int5[0] ;
                        ttrn05_impl.this.A130BarCodPar = GXv_char1[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1L0195( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
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
         else
         {
            load1L0195( ) ;
         }
         endLevel1L0195( ) ;
      }
      closeExtendedTableCursors1L0195( ) ;
   }

   public void update1L0195( )
   {
      beforeValidate1L0195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L0195( ) ;
      }
      if ( ( nIsMod_195 != 0 ) || ( nIsDirty_195 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1L0195( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1L0195( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1L0195( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01L051 */
                     pr_default.execute(46, new Object[] {A2839AlbProVal, A1261BarAlbKgmE, A1263BarAlbMtrE, Integer.valueOf(A1265BarAlbPie), A1262BarPreKgm, A1264BarPreMtr, A2396BarAlbObs, Byte.valueOf(A32AlbProEsp), A40AlbProRec, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
                     if ( (pr_default.getStatus(46) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1L0195( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1L0195( ) ;
                           if ( AnyError == 0 )
                           {
                              if ( isIns( ) || isUpd( ) || isDlt( ) )
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
            endLevel1L0195( ) ;
         }
      }
      closeExtendedTableCursors1L0195( ) ;
   }

   public void deferredUpdate1L0195( )
   {
   }

   public void delete1L0195( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1L0195( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1L0195( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1L0195( ) ;
         afterConfirm1L0195( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1L0195( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01L052 */
               pr_default.execute(47, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
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
      sMode195 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1L0195( ) ;
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1L0195( )
   {
      standaloneModal1L0195( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( A213BarSit == 9 ) && isIns( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "La Hoja de Ruta esta cerrada", ""), 1, "");
            AnyError = (short)(1) ;
         }
         if ( ( A213BarSit == 9 ) && isUpd( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "La Hoja de Ruta esta cerrada", ""), 0, "");
         }
         /* Using cursor T01L053 */
         pr_default.execute(48, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A213BarSit = T01L053_A213BarSit[0] ;
         A252CliCod = T01L053_A252CliCod[0] ;
         n252CliCod = T01L053_n252CliCod[0] ;
         pr_default.close(48);
         /* Using cursor T01L055 */
         pr_default.execute(49, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(49) != 101) )
         {
            A1267BarAlbKgm = T01L055_A1267BarAlbKgm[0] ;
            A1268BarAlbMtr = T01L055_A1268BarAlbMtr[0] ;
         }
         else
         {
            A1267BarAlbKgm = DecimalUtil.doubleToDec(0) ;
            A1268BarAlbMtr = DecimalUtil.doubleToDec(0) ;
         }
         pr_default.close(49);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01L056 */
         pr_default.execute(50, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METCAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01L057 */
         pr_default.execute(51, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EDIETI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01L058 */
         pr_default.execute(52, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01L059 */
         pr_default.execute(53, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01L060 */
         pr_default.execute(54, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01L061 */
         pr_default.execute(55, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01L062 */
         pr_default.execute(56, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPCK", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01L063 */
         pr_default.execute(57, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01L064 */
         pr_default.execute(58, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01L065 */
         pr_default.execute(59, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01L066 */
         pr_default.execute(60, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
      }
   }

   public void processNestedLevel1L0197( )
   {
      s1268BarAlbMtr = O1268BarAlbMtr ;
      s1267BarAlbKgm = O1267BarAlbKgm ;
      nGXsfl_231_idx = 0 ;
      while ( nGXsfl_231_idx < nRC_GXsfl_231 )
      {
         readRow1L0197( ) ;
         if ( ( nRcdExists_197 != 0 ) || ( nIsMod_197 != 0 ) )
         {
            standaloneNotModal1L0197( ) ;
            getKey1L0197( ) ;
            if ( ( nRcdExists_197 == 0 ) && ( nRcdDeleted_197 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1L0197( ) ;
            }
            else
            {
               if ( RcdFound197 != 0 )
               {
                  if ( ( nRcdDeleted_197 != 0 ) && ( nRcdExists_197 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1L0197( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_197 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1L0197( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_197 == 0 )
                  {
                     GXCCtl = "BARCOD_" + sGXsfl_138_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O1268BarAlbMtr = A1268BarAlbMtr ;
            O1267BarAlbKgm = A1267BarAlbKgm ;
         }
         httpContext.changePostValue( edtBarPieCod_Internalname, GXutil.rtrim( A200BarPieCod)) ;
         httpContext.changePostValue( edtAlbPKilEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A27AlbPKilEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPMtrEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A1270AlbPMtrEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPConTro_Internalname, GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z200BarPieCod_"+sGXsfl_231_idx, GXutil.rtrim( Z200BarPieCod)) ;
         httpContext.changePostValue( "ZT_"+"Z27AlbPKilEnt_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( Z27AlbPKilEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1270AlbPMtrEnt_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( Z1270AlbPMtrEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z197BarPConTro_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( Z197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T197BarPConTro_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( O197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1270AlbPMtrEnt_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( O1270AlbPMtrEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T27AlbPKilEnt_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( O27AlbPKilEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_264_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_264, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_197_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_197, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_197_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_197, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_197_"+sGXsfl_231_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_197, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_197 != 0 )
         {
            httpContext.changePostValue( "BARPIECOD_"+sGXsfl_231_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPKILENT_"+sGXsfl_231_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPKilEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPMTRENT_"+sGXsfl_231_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPMtrEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPCONTRO_"+sGXsfl_231_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPConTro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1L0197( ) ;
      if ( AnyError != 0 )
      {
         O1268BarAlbMtr = s1268BarAlbMtr ;
         O1267BarAlbKgm = s1267BarAlbKgm ;
      }
      nRcdExists_197 = (short)(0) ;
      nIsMod_197 = (short)(0) ;
      nRcdDeleted_197 = (short)(0) ;
   }

   public void processLevel1L0195( )
   {
      /* Save parent mode. */
      sMode195 = Gx_mode ;
      processNestedLevel1L0197( ) ;
      if ( AnyError != 0 )
      {
         O1268BarAlbMtr = s1268BarAlbMtr ;
         O1267BarAlbKgm = s1267BarAlbKgm ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1L0195( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1L0195( )
   {
      /* Scan By routine */
      /* Using cursor T01L067 */
      pr_default.execute(61, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(61) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A129BarCod = T01L067_A129BarCod[0] ;
         A132BarCodReo = T01L067_A132BarCodReo[0] ;
         A130BarCodPar = T01L067_A130BarCodPar[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1L0195( )
   {
      /* Scan next routine */
      pr_default.readNext(61);
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(61) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A129BarCod = T01L067_A129BarCod[0] ;
         A132BarCodReo = T01L067_A132BarCodReo[0] ;
         A130BarCodPar = T01L067_A130BarCodPar[0] ;
      }
   }

   public void scanEnd1L0195( )
   {
      pr_default.close(61);
   }

   public void afterConfirm1L0195( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && true /* Level */ )
      {
         AV35Texto_i = httpContext.getMessage( httpContext.getMessage( "Alta Albaran: ", ""), "") + GXutil.str( A30AlbProCod, 10, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Texto_i", AV35Texto_i);
      }
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char1[0] = A130BarCodPar ;
         GXv_decimal6[0] = A1262BarPreKgm ;
         GXv_decimal7[0] = A1264BarPreMtr ;
         GXv_int8[0] = A32AlbProEsp ;
         GXv_decimal9[0] = A40AlbProRec ;
         new app.pbuspre(remoteHandle, context).execute( GXv_char3, GXv_int2, GXv_int5, GXv_char1, GXv_decimal6, GXv_decimal7, GXv_int8, GXv_decimal9) ;
         ttrn05_impl.this.A396EmprCod = GXv_char3[0] ;
         ttrn05_impl.this.A129BarCod = GXv_int2[0] ;
         ttrn05_impl.this.A132BarCodReo = GXv_int5[0] ;
         ttrn05_impl.this.A130BarCodPar = GXv_char1[0] ;
         ttrn05_impl.this.A1262BarPreKgm = GXv_decimal6[0] ;
         ttrn05_impl.this.A1264BarPreMtr = GXv_decimal7[0] ;
         ttrn05_impl.this.A32AlbProEsp = GXv_int8[0] ;
         ttrn05_impl.this.A40AlbProRec = GXv_decimal9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( true /* After */ && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV41Pgmname, AV8UsurCod, AV12Station, AV35Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
   }

   public void beforeInsert1L0195( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1L0195( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1L0195( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1L0195( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1L0195( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1L0195( )
   {
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      edtBarAlbKgmE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbKgmE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbKgmE_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      edtBarAlbMtrE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbMtrE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbMtrE_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      edtBarAlbPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPie_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      edtBarPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreKgm_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      edtBarPreMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreMtr_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      cmbAlbProVal.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProVal.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProVal.getEnabled(), 5, 0), !bGXsfl_138_Refreshing);
      edtBarAlbObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbObs_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      edtAlbProEsp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEsp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEsp_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      edtAlbProRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProRec_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      edtBarAlbKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbKgm_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      edtBarAlbMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbMtr_Enabled), 5, 0), !bGXsfl_138_Refreshing);
   }

   public void zm1L0197( int GX_JID )
   {
      if ( ( GX_JID == 51 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z27AlbPKilEnt = T01L05_A27AlbPKilEnt[0] ;
            Z1270AlbPMtrEnt = T01L05_A1270AlbPMtrEnt[0] ;
         }
         else
         {
            Z27AlbPKilEnt = A27AlbPKilEnt ;
            Z1270AlbPMtrEnt = A1270AlbPMtrEnt ;
         }
      }
      if ( ( GX_JID == 52 ) || ( GX_JID == 0 ) )
      {
         Z197BarPConTro = T01L07_A197BarPConTro[0] ;
      }
      if ( GX_JID == -51 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z27AlbPKilEnt = A27AlbPKilEnt ;
         Z1270AlbPMtrEnt = A1270AlbPMtrEnt ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         Z197BarPConTro = A197BarPConTro ;
      }
   }

   public void standaloneNotModal1L0197( )
   {
      edtBarPConTro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPConTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPConTro_Enabled), 5, 0), !bGXsfl_231_Refreshing);
   }

   public void standaloneModal1L0197( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarPieCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), !bGXsfl_231_Refreshing);
      }
      else
      {
         edtBarPieCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), !bGXsfl_231_Refreshing);
      }
   }

   public void load1L0197( )
   {
      /* Using cursor T01L068 */
      pr_default.execute(62, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(62) != 101) )
      {
         RcdFound197 = (short)(1) ;
         A27AlbPKilEnt = T01L068_A27AlbPKilEnt[0] ;
         A1270AlbPMtrEnt = T01L068_A1270AlbPMtrEnt[0] ;
         A197BarPConTro = T01L068_A197BarPConTro[0] ;
         zm1L0197( -51) ;
      }
      pr_default.close(62);
      onLoadActions1L0197( ) ;
   }

   public void onLoadActions1L0197( )
   {
      if ( isIns( )  )
      {
         A1267BarAlbKgm = O1267BarAlbKgm.add(A27AlbPKilEnt) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            A1267BarAlbKgm = O1267BarAlbKgm.add(A27AlbPKilEnt).subtract(O27AlbPKilEnt) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               A1267BarAlbKgm = O1267BarAlbKgm.subtract(O27AlbPKilEnt) ;
            }
         }
      }
      if ( isIns( )  )
      {
         A1268BarAlbMtr = O1268BarAlbMtr.add(A1270AlbPMtrEnt) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            A1268BarAlbMtr = O1268BarAlbMtr.add(A1270AlbPMtrEnt).subtract(O1270AlbPMtrEnt) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               A1268BarAlbMtr = O1268BarAlbMtr.subtract(O1270AlbPMtrEnt) ;
            }
         }
      }
   }

   public void checkExtendedTable1L0197( )
   {
      nIsDirty_197 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1L0197( ) ;
      /* Using cursor T01L07 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         GXCCtl = "BARPIECOD_" + sGXsfl_231_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPIE", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A197BarPConTro = T01L07_A197BarPConTro[0] ;
      nIsDirty_197 = (short)(1) ;
      O197BarPConTro = A197BarPConTro ;
      pr_default.close(5);
      if ( isIns( )  && true /* After */ )
      {
         GXCCtl = "BARPIECOD_" + sGXsfl_231_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  )
      {
         nIsDirty_197 = (short)(1) ;
         A1267BarAlbKgm = O1267BarAlbKgm.add(A27AlbPKilEnt) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_197 = (short)(1) ;
            A1267BarAlbKgm = O1267BarAlbKgm.add(A27AlbPKilEnt).subtract(O27AlbPKilEnt) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_197 = (short)(1) ;
               A1267BarAlbKgm = O1267BarAlbKgm.subtract(O27AlbPKilEnt) ;
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_197 = (short)(1) ;
         A1268BarAlbMtr = O1268BarAlbMtr.add(A1270AlbPMtrEnt) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_197 = (short)(1) ;
            A1268BarAlbMtr = O1268BarAlbMtr.add(A1270AlbPMtrEnt).subtract(O1270AlbPMtrEnt) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_197 = (short)(1) ;
               A1268BarAlbMtr = O1268BarAlbMtr.subtract(O1270AlbPMtrEnt) ;
            }
         }
      }
   }

   public void closeExtendedTableCursors1L0197( )
   {
      pr_default.close(4);
   }

   public void enableDisable1L0197( )
   {
   }

   public void gxload_52( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar ,
                          String A200BarPieCod )
   {
      /* Using cursor T01L07 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         GXCCtl = "BARPIECOD_" + sGXsfl_231_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPIE", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A197BarPConTro = T01L07_A197BarPConTro[0] ;
      O197BarPConTro = A197BarPConTro ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void getKey1L0197( )
   {
      /* Using cursor T01L069 */
      pr_default.execute(63, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(63) != 101) )
      {
         RcdFound197 = (short)(1) ;
      }
      else
      {
         RcdFound197 = (short)(0) ;
      }
      pr_default.close(63);
   }

   public void getByPrimaryKey1L0197( )
   {
      /* Using cursor T01L05 */
      pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01L05_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1L0197( 51) ;
         RcdFound197 = (short)(1) ;
         initializeNonKey1L0197( ) ;
         A27AlbPKilEnt = T01L05_A27AlbPKilEnt[0] ;
         A1270AlbPMtrEnt = T01L05_A1270AlbPMtrEnt[0] ;
         A200BarPieCod = T01L05_A200BarPieCod[0] ;
         O1270AlbPMtrEnt = A1270AlbPMtrEnt ;
         O27AlbPKilEnt = A27AlbPKilEnt ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         sMode197 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1L0197( ) ;
         Gx_mode = sMode197 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound197 = (short)(0) ;
         initializeNonKey1L0197( ) ;
         sMode197 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1L0197( ) ;
         Gx_mode = sMode197 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1L0197( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrency1L0197( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01L04 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( DecimalUtil.compareTo(Z27AlbPKilEnt, T01L04_A27AlbPKilEnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z1270AlbPMtrEnt, T01L04_A1270AlbPMtrEnt[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z27AlbPKilEnt, T01L04_A27AlbPKilEnt[0]) != 0 )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"AlbPKilEnt");
               GXutil.writeLogRaw("Old: ",Z27AlbPKilEnt);
               GXutil.writeLogRaw("Current: ",T01L04_A27AlbPKilEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z1270AlbPMtrEnt, T01L04_A1270AlbPMtrEnt[0]) != 0 )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"AlbPMtrEnt");
               GXutil.writeLogRaw("Old: ",Z1270AlbPMtrEnt);
               GXutil.writeLogRaw("Current: ",T01L04_A1270AlbPMtrEnt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLALPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01L070 */
      pr_default.execute(64, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(64) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPIE"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || ( Z197BarPConTro != T01L070_A197BarPConTro[0] ) )
         {
            if ( Z197BarPConTro != T01L070_A197BarPConTro[0] )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"BarPConTro");
               GXutil.writeLogRaw("Old: ",Z197BarPConTro);
               GXutil.writeLogRaw("Current: ",T01L070_A197BarPConTro[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARPIE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1L0197( )
   {
      beforeValidate1L0197( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L0197( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1L0197( 0) ;
         checkOptimisticConcurrency1L0197( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1L0197( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1L0197( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L071 */
                  pr_default.execute(65, new Object[] {Long.valueOf(A30AlbProCod), A27AlbPKilEnt, A1270AlbPMtrEnt, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
                  if ( (pr_default.getStatus(65) == 1) )
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
                        processLevel1L0197( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
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
         else
         {
            load1L0197( ) ;
         }
         endLevel1L0197( ) ;
      }
      closeExtendedTableCursors1L0197( ) ;
   }

   public void update1L0197( )
   {
      beforeValidate1L0197( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L0197( ) ;
      }
      if ( ( nIsMod_197 != 0 ) || ( nIsDirty_197 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1L0197( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1L0197( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1L0197( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01L072 */
                     pr_default.execute(66, new Object[] {A27AlbPKilEnt, A1270AlbPMtrEnt, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
                     if ( (pr_default.getStatus(66) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALPRD"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1L0197( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1L0197( ) ;
                           if ( AnyError == 0 )
                           {
                              if ( isIns( ) || isUpd( ) || isDlt( ) )
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
            endLevel1L0197( ) ;
         }
      }
      closeExtendedTableCursors1L0197( ) ;
   }

   public void deferredUpdate1L0197( )
   {
   }

   public void delete1L0197( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1L0197( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1L0197( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1L0197( ) ;
         afterConfirm1L0197( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1L0197( ) ;
            if ( AnyError == 0 )
            {
               A197BarPConTro = O197BarPConTro ;
               scanStart1L0198( ) ;
               while ( RcdFound198 != 0 )
               {
                  getByPrimaryKey1L0198( ) ;
                  delete1L0198( ) ;
                  scanNext1L0198( ) ;
                  O197BarPConTro = A197BarPConTro ;
               }
               scanEnd1L0198( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L073 */
                  pr_default.execute(67, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
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
      }
      sMode197 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1L0197( ) ;
      Gx_mode = sMode197 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1L0197( )
   {
      standaloneModal1L0197( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && true /* After */ )
         {
            GXCCtl = "BARPIECOD_" + sGXsfl_231_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T01L074 */
         pr_default.execute(68, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Z197BarPConTro = T01L074_A197BarPConTro[0] ;
         A197BarPConTro = T01L074_A197BarPConTro[0] ;
         pr_default.close(68);
         if ( isIns( )  )
         {
            A1267BarAlbKgm = O1267BarAlbKgm.add(A27AlbPKilEnt) ;
         }
         else
         {
            if ( isUpd( )  )
            {
               A1267BarAlbKgm = O1267BarAlbKgm.add(A27AlbPKilEnt).subtract(O27AlbPKilEnt) ;
            }
            else
            {
               if ( isDlt( )  )
               {
                  A1267BarAlbKgm = O1267BarAlbKgm.subtract(O27AlbPKilEnt) ;
               }
            }
         }
         if ( isIns( )  )
         {
            A1268BarAlbMtr = O1268BarAlbMtr.add(A1270AlbPMtrEnt) ;
         }
         else
         {
            if ( isUpd( )  )
            {
               A1268BarAlbMtr = O1268BarAlbMtr.add(A1270AlbPMtrEnt).subtract(O1270AlbPMtrEnt) ;
            }
            else
            {
               if ( isDlt( )  )
               {
                  A1268BarAlbMtr = O1268BarAlbMtr.subtract(O1270AlbPMtrEnt) ;
               }
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01L075 */
         pr_default.execute(69, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
      }
   }

   public void processNestedLevel1L0198( )
   {
      s197BarPConTro = O197BarPConTro ;
      nGXsfl_264_idx = 0 ;
      while ( nGXsfl_264_idx < nRC_GXsfl_264 )
      {
         readRow1L0198( ) ;
         if ( ( nRcdExists_198 != 0 ) || ( nIsMod_198 != 0 ) )
         {
            standaloneNotModal1L0198( ) ;
            getKey1L0198( ) ;
            if ( ( nRcdExists_198 == 0 ) && ( nRcdDeleted_198 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1L0198( ) ;
            }
            else
            {
               if ( RcdFound198 != 0 )
               {
                  if ( ( nRcdDeleted_198 != 0 ) && ( nRcdExists_198 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1L0198( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_198 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1L0198( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_198 == 0 )
                  {
                     GXCCtl = "BARCOD_" + sGXsfl_138_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O197BarPConTro = A197BarPConTro ;
         }
         httpContext.changePostValue( edtAlbPTroCod_Internalname, GXutil.ltrim( localUtil.ntoc( A42AlbPTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPTroMet_Internalname, GXutil.ltrim( localUtil.ntoc( A43AlbPTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPTroKil_Internalname, GXutil.ltrim( localUtil.ntoc( A5303AlbPTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPTroAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3118AlbPTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z42AlbPTroCod_"+sGXsfl_264_idx, GXutil.ltrim( localUtil.ntoc( Z42AlbPTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z43AlbPTroMet_"+sGXsfl_264_idx, GXutil.ltrim( localUtil.ntoc( Z43AlbPTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5303AlbPTroKil_"+sGXsfl_264_idx, GXutil.ltrim( localUtil.ntoc( Z5303AlbPTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3118AlbPTroAnc_"+sGXsfl_264_idx, GXutil.ltrim( localUtil.ntoc( Z3118AlbPTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_198_"+sGXsfl_264_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_198_"+sGXsfl_264_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_198_"+sGXsfl_264_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_198 != 0 )
         {
            httpContext.changePostValue( "ALBPTROCOD_"+sGXsfl_264_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROMET_"+sGXsfl_264_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROKIL_"+sGXsfl_264_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROANC_"+sGXsfl_264_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1L0198( ) ;
      if ( AnyError != 0 )
      {
         O197BarPConTro = s197BarPConTro ;
      }
      nRcdExists_198 = (short)(0) ;
      nIsMod_198 = (short)(0) ;
      nRcdDeleted_198 = (short)(0) ;
   }

   public void processLevel1L0197( )
   {
      /* Save parent mode. */
      sMode197 = Gx_mode ;
      processNestedLevel1L0198( ) ;
      if ( AnyError != 0 )
      {
         O197BarPConTro = s197BarPConTro ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode197 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01L076 */
      pr_default.execute(70, new Object[] {Short.valueOf(A197BarPConTro), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
   }

   public void endLevel1L0197( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      pr_default.close(64);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1L0197( )
   {
      /* Scan By routine */
      /* Using cursor T01L077 */
      pr_default.execute(71, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound197 = (short)(0) ;
      if ( (pr_default.getStatus(71) != 101) )
      {
         RcdFound197 = (short)(1) ;
         A200BarPieCod = T01L077_A200BarPieCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1L0197( )
   {
      /* Scan next routine */
      pr_default.readNext(71);
      RcdFound197 = (short)(0) ;
      if ( (pr_default.getStatus(71) != 101) )
      {
         RcdFound197 = (short)(1) ;
         A200BarPieCod = T01L077_A200BarPieCod[0] ;
      }
   }

   public void scanEnd1L0197( )
   {
      pr_default.close(71);
   }

   public void afterConfirm1L0197( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1L0197( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1L0197( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1L0197( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1L0197( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1L0197( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1L0197( )
   {
      edtBarPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), !bGXsfl_231_Refreshing);
      edtAlbPKilEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPKilEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPKilEnt_Enabled), 5, 0), !bGXsfl_231_Refreshing);
      edtAlbPMtrEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPMtrEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPMtrEnt_Enabled), 5, 0), !bGXsfl_231_Refreshing);
      edtBarPConTro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPConTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPConTro_Enabled), 5, 0), !bGXsfl_231_Refreshing);
   }

   public void zm1L0198( int GX_JID )
   {
      if ( ( GX_JID == 53 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z43AlbPTroMet = T01L03_A43AlbPTroMet[0] ;
            Z5303AlbPTroKil = T01L03_A5303AlbPTroKil[0] ;
            Z3118AlbPTroAnc = T01L03_A3118AlbPTroAnc[0] ;
         }
         else
         {
            Z43AlbPTroMet = A43AlbPTroMet ;
            Z5303AlbPTroKil = A5303AlbPTroKil ;
            Z3118AlbPTroAnc = A3118AlbPTroAnc ;
         }
      }
      if ( GX_JID == -53 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         Z42AlbPTroCod = A42AlbPTroCod ;
         Z43AlbPTroMet = A43AlbPTroMet ;
         Z5303AlbPTroKil = A5303AlbPTroKil ;
         Z3118AlbPTroAnc = A3118AlbPTroAnc ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1L0198( )
   {
      edtBarPConTro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPConTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPConTro_Enabled), 5, 0), !bGXsfl_231_Refreshing);
   }

   public void standaloneModal1L0198( )
   {
      if ( isIns( )  )
      {
         A197BarPConTro = (short)(O197BarPConTro+1) ;
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A42AlbPTroCod = A197BarPConTro ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbPTroCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroCod_Enabled), 5, 0), !bGXsfl_264_Refreshing);
      }
      else
      {
         edtAlbPTroCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroCod_Enabled), 5, 0), !bGXsfl_264_Refreshing);
      }
   }

   public void load1L0198( )
   {
      /* Using cursor T01L078 */
      pr_default.execute(72, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod)});
      if ( (pr_default.getStatus(72) != 101) )
      {
         RcdFound198 = (short)(1) ;
         A43AlbPTroMet = T01L078_A43AlbPTroMet[0] ;
         A5303AlbPTroKil = T01L078_A5303AlbPTroKil[0] ;
         A3118AlbPTroAnc = T01L078_A3118AlbPTroAnc[0] ;
         zm1L0198( -53) ;
      }
      pr_default.close(72);
      onLoadActions1L0198( ) ;
   }

   public void onLoadActions1L0198( )
   {
   }

   public void checkExtendedTable1L0198( )
   {
      nIsDirty_198 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1L0198( ) ;
   }

   public void closeExtendedTableCursors1L0198( )
   {
   }

   public void enableDisable1L0198( )
   {
   }

   public void getKey1L0198( )
   {
      /* Using cursor T01L079 */
      pr_default.execute(73, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod)});
      if ( (pr_default.getStatus(73) != 101) )
      {
         RcdFound198 = (short)(1) ;
      }
      else
      {
         RcdFound198 = (short)(0) ;
      }
      pr_default.close(73);
   }

   public void getByPrimaryKey1L0198( )
   {
      /* Using cursor T01L03 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01L03_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1L0198( 53) ;
         RcdFound198 = (short)(1) ;
         initializeNonKey1L0198( ) ;
         A42AlbPTroCod = T01L03_A42AlbPTroCod[0] ;
         A43AlbPTroMet = T01L03_A43AlbPTroMet[0] ;
         A5303AlbPTroKil = T01L03_A5303AlbPTroKil[0] ;
         A3118AlbPTroAnc = T01L03_A3118AlbPTroAnc[0] ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         Z42AlbPTroCod = A42AlbPTroCod ;
         sMode198 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1L0198( ) ;
         Gx_mode = sMode198 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound198 = (short)(0) ;
         initializeNonKey1L0198( ) ;
         sMode198 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1L0198( ) ;
         Gx_mode = sMode198 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1L0198( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1L0198( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01L02 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALTRZ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z43AlbPTroMet, T01L02_A43AlbPTroMet[0]) != 0 ) || ( DecimalUtil.compareTo(Z5303AlbPTroKil, T01L02_A5303AlbPTroKil[0]) != 0 ) || ( Z3118AlbPTroAnc != T01L02_A3118AlbPTroAnc[0] ) )
         {
            if ( DecimalUtil.compareTo(Z43AlbPTroMet, T01L02_A43AlbPTroMet[0]) != 0 )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"AlbPTroMet");
               GXutil.writeLogRaw("Old: ",Z43AlbPTroMet);
               GXutil.writeLogRaw("Current: ",T01L02_A43AlbPTroMet[0]);
            }
            if ( DecimalUtil.compareTo(Z5303AlbPTroKil, T01L02_A5303AlbPTroKil[0]) != 0 )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"AlbPTroKil");
               GXutil.writeLogRaw("Old: ",Z5303AlbPTroKil);
               GXutil.writeLogRaw("Current: ",T01L02_A5303AlbPTroKil[0]);
            }
            if ( Z3118AlbPTroAnc != T01L02_A3118AlbPTroAnc[0] )
            {
               GXutil.writeLogln("ttrn05:[seudo value changed for attri]"+"AlbPTroAnc");
               GXutil.writeLogRaw("Old: ",Z3118AlbPTroAnc);
               GXutil.writeLogRaw("Current: ",T01L02_A3118AlbPTroAnc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLALTRZ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1L0198( )
   {
      beforeValidate1L0198( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L0198( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1L0198( 0) ;
         checkOptimisticConcurrency1L0198( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1L0198( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1L0198( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L080 */
                  pr_default.execute(74, new Object[] {Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod), A43AlbPTroMet, A5303AlbPTroKil, Short.valueOf(A3118AlbPTroAnc), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALTRZ");
                  if ( (pr_default.getStatus(74) == 1) )
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
            load1L0198( ) ;
         }
         endLevel1L0198( ) ;
      }
      closeExtendedTableCursors1L0198( ) ;
   }

   public void update1L0198( )
   {
      beforeValidate1L0198( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L0198( ) ;
      }
      if ( ( nIsMod_198 != 0 ) || ( nIsDirty_198 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1L0198( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1L0198( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1L0198( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01L081 */
                     pr_default.execute(75, new Object[] {A43AlbPTroMet, A5303AlbPTroKil, Short.valueOf(A3118AlbPTroAnc), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALTRZ");
                     if ( (pr_default.getStatus(75) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALTRZ"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1L0198( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1L0198( ) ;
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
            endLevel1L0198( ) ;
         }
      }
      closeExtendedTableCursors1L0198( ) ;
   }

   public void deferredUpdate1L0198( )
   {
   }

   public void delete1L0198( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1L0198( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1L0198( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1L0198( ) ;
         afterConfirm1L0198( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1L0198( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01L082 */
               pr_default.execute(76, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALTRZ");
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
      sMode198 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1L0198( ) ;
      Gx_mode = sMode198 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1L0198( )
   {
      standaloneModal1L0198( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1L0198( )
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

   public void scanStart1L0198( )
   {
      /* Scan By routine */
      /* Using cursor T01L083 */
      pr_default.execute(77, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      RcdFound198 = (short)(0) ;
      if ( (pr_default.getStatus(77) != 101) )
      {
         RcdFound198 = (short)(1) ;
         A42AlbPTroCod = T01L083_A42AlbPTroCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1L0198( )
   {
      /* Scan next routine */
      pr_default.readNext(77);
      RcdFound198 = (short)(0) ;
      if ( (pr_default.getStatus(77) != 101) )
      {
         RcdFound198 = (short)(1) ;
         A42AlbPTroCod = T01L083_A42AlbPTroCod[0] ;
      }
   }

   public void scanEnd1L0198( )
   {
      pr_default.close(77);
   }

   public void afterConfirm1L0198( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1L0198( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1L0198( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1L0198( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1L0198( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1L0198( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1L0198( )
   {
      edtAlbPTroCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroCod_Enabled), 5, 0), !bGXsfl_264_Refreshing);
      edtAlbPTroMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroMet_Enabled), 5, 0), !bGXsfl_264_Refreshing);
      edtAlbPTroKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroKil_Enabled), 5, 0), !bGXsfl_264_Refreshing);
      edtAlbPTroAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroAnc_Enabled), 5, 0), !bGXsfl_264_Refreshing);
   }

   public void send_integrity_lvl_hashes1L0198( )
   {
   }

   public void send_integrity_lvl_hashes1L0197( )
   {
   }

   public void send_integrity_lvl_hashes1L0195( )
   {
   }

   public void send_integrity_lvl_hashes1L03( )
   {
   }

   public void subsflControlProps_138195( )
   {
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_138_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_138_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_138_idx ;
      edtBarAlbKgmE_Internalname = "BARALBKGME_"+sGXsfl_138_idx ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE_"+sGXsfl_138_idx ;
      edtBarAlbPie_Internalname = "BARALBPIE_"+sGXsfl_138_idx ;
      edtBarPreKgm_Internalname = "BARPREKGM_"+sGXsfl_138_idx ;
      edtBarPreMtr_Internalname = "BARPREMTR_"+sGXsfl_138_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_138_idx ;
      cmbAlbProVal.setInternalname( "ALBPROVAL_"+sGXsfl_138_idx );
      edtBarAlbObs_Internalname = "BARALBOBS_"+sGXsfl_138_idx ;
      edtAlbProEsp_Internalname = "ALBPROESP_"+sGXsfl_138_idx ;
      edtAlbProRec_Internalname = "ALBPROREC_"+sGXsfl_138_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_138_idx ;
      edtBarAlbKgm_Internalname = "BARALBKGM_"+sGXsfl_138_idx ;
      edtBarAlbMtr_Internalname = "BARALBMTR_"+sGXsfl_138_idx ;
      lblTitlepiezas_Internalname = "TITLEPIEZAS_"+sGXsfl_138_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_138_idx ;
   }

   public void subsflControlProps_fel_138195( )
   {
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_138_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_138_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_138_fel_idx ;
      edtBarAlbKgmE_Internalname = "BARALBKGME_"+sGXsfl_138_fel_idx ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE_"+sGXsfl_138_fel_idx ;
      edtBarAlbPie_Internalname = "BARALBPIE_"+sGXsfl_138_fel_idx ;
      edtBarPreKgm_Internalname = "BARPREKGM_"+sGXsfl_138_fel_idx ;
      edtBarPreMtr_Internalname = "BARPREMTR_"+sGXsfl_138_fel_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_138_fel_idx ;
      cmbAlbProVal.setInternalname( "ALBPROVAL_"+sGXsfl_138_fel_idx );
      edtBarAlbObs_Internalname = "BARALBOBS_"+sGXsfl_138_fel_idx ;
      edtAlbProEsp_Internalname = "ALBPROESP_"+sGXsfl_138_fel_idx ;
      edtAlbProRec_Internalname = "ALBPROREC_"+sGXsfl_138_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_138_fel_idx ;
      edtBarAlbKgm_Internalname = "BARALBKGM_"+sGXsfl_138_fel_idx ;
      edtBarAlbMtr_Internalname = "BARALBMTR_"+sGXsfl_138_fel_idx ;
      lblTitlepiezas_Internalname = "TITLEPIEZAS_"+sGXsfl_138_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_138_fel_idx ;
   }

   public void addRow1L0195( )
   {
      nRC_GXsfl_231 = 0 ;
      nGXsfl_138_idx = (int)(nGXsfl_138_idx+1) ;
      sGXsfl_138_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_138_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_138195( ) ;
      sendRow1L0195( ) ;
   }

   public void sendRow1L0195( )
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
         if ( ((int)((nGXsfl_138_idx) % (2))) == 0 )
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
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_138_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_138_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divGridtable1_Internalname+"_"+sGXsfl_138_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTable2_Internalname+"_"+sGXsfl_138_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","LevelTable","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCellAdvanced","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtBarCod_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,httpContext.getMessage( "Codigo Barcada", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_138_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 147,'',false,'" + sGXsfl_138_idx + "',138)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,147);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(138),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtBarCodReo_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,httpContext.getMessage( "Codigo Reoperado Barcada", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_138_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 152,'',false,'" + sGXsfl_138_idx + "',138)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,152);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarCodReo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(138),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtBarCodPar_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,httpContext.getMessage( "Codigo Particion Barcada", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_138_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 157,'',false,'" + sGXsfl_138_idx + "',138)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,157);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarCodPar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(138),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtBarAlbKgmE_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtBarAlbKgmE_Internalname,httpContext.getMessage( "Kilos Entregados", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_138_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 162,'',false,'" + sGXsfl_138_idx + "',138)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbKgmE_Internalname,GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAlbKgmE_Enabled!=0) ? localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99") : localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,162);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbKgmE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarAlbKgmE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(9),"chr",Integer.valueOf(1),"row",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(138),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtBarAlbMtrE_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtBarAlbMtrE_Internalname,httpContext.getMessage( "Metros Entregados H. Ruta", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_138_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 167,'',false,'" + sGXsfl_138_idx + "',138)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbMtrE_Internalname,GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAlbMtrE_Enabled!=0) ? localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99") : localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,167);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbMtrE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarAlbMtrE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(9),"chr",Integer.valueOf(1),"row",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(138),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtBarAlbPie_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtBarAlbPie_Internalname,httpContext.getMessage( "Total Piezas", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_138_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 172,'',false,'" + sGXsfl_138_idx + "',138)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbPie_Internalname,GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAlbPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,172);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarAlbPie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(138),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtBarPreKgm_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtBarPreKgm_Internalname,httpContext.getMessage( "Precio Kilo", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_138_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 177,'',false,'" + sGXsfl_138_idx + "',138)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPreKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPreKgm_Enabled!=0) ? localUtil.format( A1262BarPreKgm, "ZZZZZZ9.999") : localUtil.format( A1262BarPreKgm, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,177);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPreKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarPreKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(13),"chr",Integer.valueOf(1),"row",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(138),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtBarPreMtr_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtBarPreMtr_Internalname,httpContext.getMessage( "Precio Metro", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_138_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 182,'',false,'" + sGXsfl_138_idx + "',138)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPreMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPreMtr_Enabled!=0) ? localUtil.format( A1264BarPreMtr, "ZZZZZZ9.999") : localUtil.format( A1264BarPreMtr, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,182);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPreMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarPreMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(13),"chr",Integer.valueOf(1),"row",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(138),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtBarSit_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,httpContext.getMessage( "Situacion", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarSit_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(2),"chr",Integer.valueOf(1),"row",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(138),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+cmbAlbProVal.getInternalname()+"\"","","div"});
      /* Attribute/Variable Label */
      Grid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {cmbAlbProVal.getInternalname(),httpContext.getMessage( "Valorar", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_138_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 192,'',false,'" + sGXsfl_138_idx + "',138)\"" ;
      GXCCtl = "ALBPROVAL_" + sGXsfl_138_idx ;
      cmbAlbProVal.setName( GXCCtl );
      cmbAlbProVal.setWebtags( "" );
      cmbAlbProVal.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
      cmbAlbProVal.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
      if ( cmbAlbProVal.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A2839AlbProVal)==0) )
         {
            A2839AlbProVal = httpContext.getMessage( "S", "") ;
         }
      }
      /* ComboBox */
      Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProVal,cmbAlbProVal.getInternalname(),GXutil.rtrim( A2839AlbProVal),Integer.valueOf(1),cmbAlbProVal.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(1),Integer.valueOf(cmbAlbProVal.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"em",Integer.valueOf(0),"","","Attribute","","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,192);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbAlbProVal.setValue( GXutil.rtrim( A2839AlbProVal) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProVal.getInternalname(), "Values", cmbAlbProVal.ToJavascriptSource(), !bGXsfl_138_Refreshing);
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtBarAlbObs_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtBarAlbObs_Internalname,httpContext.getMessage( "Observacion linea alb.por H.R", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_138_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 197,'',false,'" + sGXsfl_138_idx + "',138)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbObs_Internalname,GXutil.rtrim( A2396BarAlbObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,197);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarAlbObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(30),"chr",Integer.valueOf(1),"row",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(138),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtAlbProEsp_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtAlbProEsp_Internalname,httpContext.getMessage( "Albaran Pendiente Confirmacion", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_138_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 202,'',false,'" + sGXsfl_138_idx + "',138)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProEsp_Internalname,GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbProEsp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A32AlbProEsp), "99") : localUtil.format( DecimalUtil.doubleToDec(A32AlbProEsp), "99")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,202);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProEsp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtAlbProEsp_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(2),"chr",Integer.valueOf(1),"row",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(138),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtAlbProRec_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtAlbProRec_Internalname,httpContext.getMessage( "Recargo Albaran", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_138_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 207,'',false,'" + sGXsfl_138_idx + "',138)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProRec_Internalname,GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbProRec_Enabled!=0) ? localUtil.format( A40AlbProRec, "ZZZZZZ9.99") : localUtil.format( A40AlbProRec, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,207);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtAlbProRec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(13),"chr",Integer.valueOf(1),"row",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(138),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtCliCod_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,httpContext.getMessage( "Cliente", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtCliCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(138),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtBarAlbKgm_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtBarAlbKgm_Internalname,httpContext.getMessage( "Total Kilos", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A1267BarAlbKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAlbKgm_Enabled!=0) ? localUtil.format( A1267BarAlbKgm, "ZZZZZ9.99") : localUtil.format( A1267BarAlbKgm, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarAlbKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(9),"chr",Integer.valueOf(1),"row",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(138),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtBarAlbMtr_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtBarAlbMtr_Internalname,httpContext.getMessage( "Total Metros", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1268BarAlbMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarAlbMtr_Enabled!=0) ? localUtil.format( A1268BarAlbMtr, "ZZZZZ9.99") : localUtil.format( A1268BarAlbMtr, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarAlbMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(9),"chr",Integer.valueOf(1),"row",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(138),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-9 col-sm-offset-3 LevelTable","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divPiezastable_Internalname+"_"+sGXsfl_138_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","LevelTable","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTitlepiezas_Internalname,httpContext.getMessage( "Piezas", ""),"","",lblTitlepiezas_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Title",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /*  Child Grid Control  */
      Grid1Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid2Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid2Container.Clear();
      }
      startgridcontrol231( ) ;
      /* Save parent mode. */
      sMode197 = Gx_mode ;
      nGXsfl_231_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount197 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_197 = (short)(1) ;
            scanStart1L0197( ) ;
            while ( RcdFound197 != 0 )
            {
               init_level_properties197( ) ;
               getByPrimaryKey1L0197( ) ;
               addRow1L0197( ) ;
               scanNext1L0197( ) ;
            }
            scanEnd1L0197( ) ;
            nBlankRcdCount197 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1268BarAlbMtr = A1268BarAlbMtr ;
         B1267BarAlbKgm = A1267BarAlbKgm ;
         standaloneNotModal1L0197( ) ;
         standaloneModal1L0197( ) ;
         sMode197 = Gx_mode ;
         while ( nGXsfl_231_idx < nRC_GXsfl_231 )
         {
            bGXsfl_231_Refreshing = true ;
            readRow1L0197( ) ;
            edtBarPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIECOD_"+sGXsfl_231_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), !bGXsfl_231_Refreshing);
            edtAlbPKilEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPKILENT_"+sGXsfl_231_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPKilEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPKilEnt_Enabled), 5, 0), !bGXsfl_231_Refreshing);
            edtAlbPMtrEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPMTRENT_"+sGXsfl_231_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPMtrEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPMtrEnt_Enabled), 5, 0), !bGXsfl_231_Refreshing);
            edtBarPConTro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPCONTRO_"+sGXsfl_231_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPConTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPConTro_Enabled), 5, 0), !bGXsfl_231_Refreshing);
            if ( ( nRcdExists_197 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1L0197( ) ;
            }
            sendRow1L0197( ) ;
            bGXsfl_231_Refreshing = false ;
         }
         Gx_mode = sMode197 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1268BarAlbMtr = B1268BarAlbMtr ;
         A1267BarAlbKgm = B1267BarAlbKgm ;
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount197 = (short)(5) ;
         nRcdExists_197 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1L0197( ) ;
            while ( RcdFound197 != 0 )
            {
               sGXsfl_231_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_231_idx+1), 4, 0), (short)(4), "0") + sGXsfl_138_idx ;
               subsflControlProps_231197( ) ;
               init_level_properties197( ) ;
               standaloneNotModal1L0197( ) ;
               getByPrimaryKey1L0197( ) ;
               standaloneModal1L0197( ) ;
               addRow1L0197( ) ;
               scanNext1L0197( ) ;
            }
            scanEnd1L0197( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode197 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_231_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_231_idx+1), 4, 0), (short)(4), "0") + sGXsfl_138_idx ;
         subsflControlProps_231197( ) ;
         initAll1L0197( ) ;
         init_level_properties197( ) ;
         B1268BarAlbMtr = A1268BarAlbMtr ;
         B1267BarAlbKgm = A1267BarAlbKgm ;
         nRcdExists_197 = (short)(0) ;
         nIsMod_197 = (short)(0) ;
         nRcdDeleted_197 = (short)(0) ;
         if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 138 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_138_idx, ".")) == 0 ) )
         {
            nBlankRcdCount197 = (short)(nBlankRcdUsr197+nBlankRcdCount197) ;
         }
         fRowAdded = 0 ;
         while ( nBlankRcdCount197 > 0 )
         {
            standaloneNotModal1L0197( ) ;
            standaloneModal1L0197( ) ;
            addRow1L0197( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtBarPieCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount197 = (short)(nBlankRcdCount197-1) ;
         }
         Gx_mode = sMode197 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1268BarAlbMtr = B1268BarAlbMtr ;
         A1267BarAlbKgm = B1267BarAlbKgm ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode197 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_138_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_138_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_138_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1L0195( ) ;
      GXCCtl = "Z129BarCod_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z132BarCodReo_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z130BarCodPar_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z130BarCodPar));
      GXCCtl = "Z2839AlbProVal_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2839AlbProVal));
      GXCCtl = "Z1261BarAlbKgmE_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1263BarAlbMtrE_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1265BarAlbPie_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1262BarPreKgm_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1264BarPreMtr_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2396BarAlbObs_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2396BarAlbObs));
      GXCCtl = "Z32AlbProEsp_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z40AlbProRec_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1268BarAlbMtr_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1268BarAlbMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1267BarAlbKgm_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1267BarAlbKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_231_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_231_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_195_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_195_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_195_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vALBPROCOD_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV32ALbprocod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_138_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBKGME_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbKgmE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBMTRE_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbMtrE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBPIE_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPREKGM_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPREMTR_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSit_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROVAL_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbProVal.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBOBS_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROESP_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProEsp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROREC_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBKGM_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBMTR_"+sGXsfl_138_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1L0195( )
   {
      nGXsfl_138_idx = (int)(nGXsfl_138_idx+1) ;
      sGXsfl_138_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_138_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_138195( ) ;
      edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAlbKgmE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBKGME_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAlbMtrE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBMTRE_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAlbPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBPIE_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPREKGM_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPreMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPREMTR_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarSit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSIT_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbAlbProVal.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROVAL_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtBarAlbObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBOBS_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbProEsp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROESP_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbProRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROREC_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAlbKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBKGM_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarAlbMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARALBMTR_"+sGXsfl_138_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "BARCOD_" + sGXsfl_138_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         wbErr = true ;
         A129BarCod = 0 ;
      }
      else
      {
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "BARCODREO_" + sGXsfl_138_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodReo_Internalname ;
         wbErr = true ;
         A132BarCodReo = (byte)(0) ;
      }
      else
      {
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARALBKGME_" + sGXsfl_138_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAlbKgmE_Internalname ;
         wbErr = true ;
         A1261BarAlbKgmE = DecimalUtil.ZERO ;
      }
      else
      {
         A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARALBMTRE_" + sGXsfl_138_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAlbMtrE_Internalname ;
         wbErr = true ;
         A1263BarAlbMtrE = DecimalUtil.ZERO ;
      }
      else
      {
         A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "BARALBPIE_" + sGXsfl_138_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAlbPie_Internalname ;
         wbErr = true ;
         A1265BarAlbPie = 0 ;
      }
      else
      {
         A1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPreKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPreKgm_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "BARPREKGM_" + sGXsfl_138_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPreKgm_Internalname ;
         wbErr = true ;
         A1262BarPreKgm = DecimalUtil.ZERO ;
      }
      else
      {
         A1262BarPreKgm = localUtil.ctond( httpContext.cgiGet( edtBarPreKgm_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPreMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPreMtr_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "BARPREMTR_" + sGXsfl_138_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPreMtr_Internalname ;
         wbErr = true ;
         A1264BarPreMtr = DecimalUtil.ZERO ;
      }
      else
      {
         A1264BarPreMtr = localUtil.ctond( httpContext.cgiGet( edtBarPreMtr_Internalname)) ;
      }
      A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbAlbProVal.setName( cmbAlbProVal.getInternalname() );
      cmbAlbProVal.setValue( httpContext.cgiGet( cmbAlbProVal.getInternalname()) );
      A2839AlbProVal = httpContext.cgiGet( cmbAlbProVal.getInternalname()) ;
      A2396BarAlbObs = httpContext.cgiGet( edtBarAlbObs_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProEsp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProEsp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "ALBPROESP_" + sGXsfl_138_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProEsp_Internalname ;
         wbErr = true ;
         A32AlbProEsp = (byte)(0) ;
      }
      else
      {
         A32AlbProEsp = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProEsp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbProRec_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbProRec_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "ALBPROREC_" + sGXsfl_138_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProRec_Internalname ;
         wbErr = true ;
         A40AlbProRec = DecimalUtil.ZERO ;
      }
      else
      {
         A40AlbProRec = localUtil.ctond( httpContext.cgiGet( edtAlbProRec_Internalname)) ;
      }
      A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n252CliCod = false ;
      A1267BarAlbKgm = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgm_Internalname)) ;
      A1268BarAlbMtr = localUtil.ctond( httpContext.cgiGet( edtBarAlbMtr_Internalname)) ;
      GXCCtl = "Z129BarCod_" + sGXsfl_138_idx ;
      Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z132BarCodReo_" + sGXsfl_138_idx ;
      Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z130BarCodPar_" + sGXsfl_138_idx ;
      Z130BarCodPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2839AlbProVal_" + sGXsfl_138_idx ;
      Z2839AlbProVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1261BarAlbKgmE_" + sGXsfl_138_idx ;
      Z1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1263BarAlbMtrE_" + sGXsfl_138_idx ;
      Z1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1265BarAlbPie_" + sGXsfl_138_idx ;
      Z1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1262BarPreKgm_" + sGXsfl_138_idx ;
      Z1262BarPreKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1264BarPreMtr_" + sGXsfl_138_idx ;
      Z1264BarPreMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2396BarAlbObs_" + sGXsfl_138_idx ;
      Z2396BarAlbObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z32AlbProEsp_" + sGXsfl_138_idx ;
      Z32AlbProEsp = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z40AlbProRec_" + sGXsfl_138_idx ;
      Z40AlbProRec = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O1268BarAlbMtr_" + sGXsfl_138_idx ;
      O1268BarAlbMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O1267BarAlbKgm_" + sGXsfl_138_idx ;
      O1267BarAlbKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRC_GXsfl_231_" + sGXsfl_138_idx ;
      nRC_GXsfl_231 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_195_" + sGXsfl_138_idx ;
      nRcdDeleted_195 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_195_" + sGXsfl_138_idx ;
      nRcdExists_195 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_195_" + sGXsfl_138_idx ;
      nIsMod_195 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_231_" + sGXsfl_138_idx ;
      nRC_GXsfl_231 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_231197( )
   {
      edtBarPieCod_Internalname = "BARPIECOD_"+sGXsfl_231_idx ;
      edtAlbPKilEnt_Internalname = "ALBPKILENT_"+sGXsfl_231_idx ;
      edtAlbPMtrEnt_Internalname = "ALBPMTRENT_"+sGXsfl_231_idx ;
      edtBarPConTro_Internalname = "BARPCONTRO_"+sGXsfl_231_idx ;
      lblTitletrozos_Internalname = "TITLETROZOS_"+sGXsfl_231_idx ;
      subGridttrn05_hdrs_piezas_trozos_Internalname = "GRIDTTRN05_HDRS_PIEZAS_TROZOS_"+sGXsfl_231_idx ;
   }

   public void subsflControlProps_fel_231197( )
   {
      edtBarPieCod_Internalname = "BARPIECOD_"+sGXsfl_231_fel_idx ;
      edtAlbPKilEnt_Internalname = "ALBPKILENT_"+sGXsfl_231_fel_idx ;
      edtAlbPMtrEnt_Internalname = "ALBPMTRENT_"+sGXsfl_231_fel_idx ;
      edtBarPConTro_Internalname = "BARPCONTRO_"+sGXsfl_231_fel_idx ;
      lblTitletrozos_Internalname = "TITLETROZOS_"+sGXsfl_231_fel_idx ;
      subGridttrn05_hdrs_piezas_trozos_Internalname = "GRIDTTRN05_HDRS_PIEZAS_TROZOS_"+sGXsfl_231_fel_idx ;
   }

   public void addRow1L0197( )
   {
      nRC_GXsfl_264 = 0 ;
      nGXsfl_231_idx = (int)(nGXsfl_231_idx+1) ;
      sGXsfl_231_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_231_idx), 4, 0), (short)(4), "0") + sGXsfl_138_idx ;
      subsflControlProps_231197( ) ;
      sendRow1L0197( ) ;
   }

   public void sendRow1L0197( )
   {
      Grid2Row = GXWebRow.GetNew(context) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_231_idx) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( Grid2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid2_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_231_idx+"\">") ;
      }
      if ( GRID2_IsPaging == 0 )
      {
         GXCCtl = "GRIDTTRN05_HDRS_PIEZAS_TROZOS_nFirstRecordOnPage_" + sGXsfl_231_idx ;
         GRIDTTRN05_HDRS_PIEZAS_TROZOS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRIDTTRN05_HDRS_PIEZAS_TROZOS_nFirstRecordOnPage = 0 ;
      }
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divGridtable2_Internalname+"_"+sGXsfl_231_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTable3_Internalname+"_"+sGXsfl_231_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","LevelTable","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCellAdvanced","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtBarPieCod_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid2Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtBarPieCod_Internalname,httpContext.getMessage( "Nº Pieza", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_197_" + sGXsfl_231_idx + "',1);gx.fn.setControlValue('nIsMod_195_" + sGXsfl_138_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 240,'',false,'" + sGXsfl_231_idx + "',231)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieCod_Internalname,GXutil.rtrim( A200BarPieCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,240);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarPieCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(9),"chr",Integer.valueOf(1),"row",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(231),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtAlbPKilEnt_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid2Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtAlbPKilEnt_Internalname,httpContext.getMessage( "AlbPKilEnt", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_197_" + sGXsfl_231_idx + "',1);gx.fn.setControlValue('nIsMod_195_" + sGXsfl_138_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 245,'',false,'" + sGXsfl_231_idx + "',231)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPKilEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A27AlbPKilEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPKilEnt_Enabled!=0) ? localUtil.format( A27AlbPKilEnt, "ZZZZZ9.99") : localUtil.format( A27AlbPKilEnt, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,245);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPKilEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtAlbPKilEnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(9),"chr",Integer.valueOf(1),"row",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(231),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtAlbPMtrEnt_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid2Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtAlbPMtrEnt_Internalname,httpContext.getMessage( "Metros Entregados", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_197_" + sGXsfl_231_idx + "',1);gx.fn.setControlValue('nIsMod_195_" + sGXsfl_138_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 250,'',false,'" + sGXsfl_231_idx + "',231)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPMtrEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A1270AlbPMtrEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPMtrEnt_Enabled!=0) ? localUtil.format( A1270AlbPMtrEnt, "ZZZZZ9.99") : localUtil.format( A1270AlbPMtrEnt, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,250);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPMtrEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtAlbPMtrEnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(9),"chr",Integer.valueOf(1),"row",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(231),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtBarPConTro_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Grid2Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtBarPConTro_Internalname,httpContext.getMessage( "Nº Trozos", ""),"col-sm-3 AttributeLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPConTro_Internalname,GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPConTro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A197BarPConTro), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A197BarPConTro), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPConTro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarPConTro_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(3),"chr",Integer.valueOf(1),"row",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(231),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-sm-9 col-sm-offset-3 LevelTable","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTrozostable_Internalname+"_"+sGXsfl_231_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","LevelTable","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 FormCell","left","top","","","div"});
      /* Text block */
      Grid2Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTitletrozos_Internalname,httpContext.getMessage( "Trozos", ""),"","",lblTitletrozos_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","Title",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Grid2Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /*  Child Grid Control  */
      Grid2Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Gridttrn05_hdrs_piezas_trozosContainer"});
      if ( isAjaxCallMode( ) )
      {
         Gridttrn05_hdrs_piezas_trozosContainer = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Gridttrn05_hdrs_piezas_trozosContainer.Clear();
      }
      startgridcontrol264( ) ;
      nGXsfl_264_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount198 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_198 = (short)(1) ;
            scanStart1L0198( ) ;
            while ( RcdFound198 != 0 )
            {
               init_level_properties198( ) ;
               getByPrimaryKey1L0198( ) ;
               addRow1L0198( ) ;
               scanNext1L0198( ) ;
            }
            scanEnd1L0198( ) ;
            nBlankRcdCount198 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B197BarPConTro = A197BarPConTro ;
         B1270AlbPMtrEnt = A1270AlbPMtrEnt ;
         B1268BarAlbMtr = A1268BarAlbMtr ;
         B27AlbPKilEnt = A27AlbPKilEnt ;
         B1267BarAlbKgm = A1267BarAlbKgm ;
         standaloneNotModal1L0198( ) ;
         standaloneModal1L0198( ) ;
         sMode198 = Gx_mode ;
         while ( nGXsfl_264_idx < nRC_GXsfl_264 )
         {
            bGXsfl_264_Refreshing = true ;
            readRow1L0198( ) ;
            edtAlbPTroCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROCOD_"+sGXsfl_264_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroCod_Enabled), 5, 0), !bGXsfl_264_Refreshing);
            edtAlbPTroMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROMET_"+sGXsfl_264_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroMet_Enabled), 5, 0), !bGXsfl_264_Refreshing);
            edtAlbPTroKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROKIL_"+sGXsfl_264_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroKil_Enabled), 5, 0), !bGXsfl_264_Refreshing);
            edtAlbPTroAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROANC_"+sGXsfl_264_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroAnc_Enabled), 5, 0), !bGXsfl_264_Refreshing);
            if ( ( nRcdExists_198 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1L0198( ) ;
            }
            sendRow1L0198( ) ;
            bGXsfl_264_Refreshing = false ;
         }
         Gx_mode = sMode198 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A197BarPConTro = B197BarPConTro ;
         A1270AlbPMtrEnt = B1270AlbPMtrEnt ;
         A1268BarAlbMtr = B1268BarAlbMtr ;
         A27AlbPKilEnt = B27AlbPKilEnt ;
         A1267BarAlbKgm = B1267BarAlbKgm ;
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount198 = (short)(5) ;
         nRcdExists_198 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1L0198( ) ;
            while ( RcdFound198 != 0 )
            {
               sGXsfl_264_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_264_idx+1), 4, 0), (short)(4), "0") + sGXsfl_231_idx ;
               subsflControlProps_264198( ) ;
               init_level_properties198( ) ;
               standaloneNotModal1L0198( ) ;
               getByPrimaryKey1L0198( ) ;
               standaloneModal1L0198( ) ;
               addRow1L0198( ) ;
               scanNext1L0198( ) ;
            }
            scanEnd1L0198( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode198 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_264_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_264_idx+1), 4, 0), (short)(4), "0") + sGXsfl_231_idx ;
         subsflControlProps_264198( ) ;
         initAll1L0198( ) ;
         init_level_properties198( ) ;
         B197BarPConTro = A197BarPConTro ;
         B1270AlbPMtrEnt = A1270AlbPMtrEnt ;
         B1268BarAlbMtr = A1268BarAlbMtr ;
         B27AlbPKilEnt = A27AlbPKilEnt ;
         B1267BarAlbKgm = A1267BarAlbKgm ;
         nRcdExists_198 = (short)(0) ;
         nIsMod_198 = (short)(0) ;
         nRcdDeleted_198 = (short)(0) ;
         if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 231 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_231_idx, ".")) == 0 ) )
         {
            nBlankRcdCount198 = (short)(nBlankRcdUsr198+nBlankRcdCount198) ;
         }
         fRowAdded = 0 ;
         while ( nBlankRcdCount198 > 0 )
         {
            standaloneNotModal1L0198( ) ;
            standaloneModal1L0198( ) ;
            addRow1L0198( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtAlbPTroCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount198 = (short)(nBlankRcdCount198-1) ;
         }
         Gx_mode = sMode198 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A197BarPConTro = B197BarPConTro ;
         A1270AlbPMtrEnt = B1270AlbPMtrEnt ;
         A1268BarAlbMtr = B1268BarAlbMtr ;
         A27AlbPKilEnt = B27AlbPKilEnt ;
         A1267BarAlbKgm = B1267BarAlbKgm ;
      }
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridttrn05_hdrs_piezas_trozosContainerData"+"_"+sGXsfl_231_idx, Gridttrn05_hdrs_piezas_trozosContainer.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid2Row.AddGrid("Gridttrn05_hdrs_piezas_trozos", Gridttrn05_hdrs_piezas_trozosContainer);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridttrn05_hdrs_piezas_trozosContainerData"+"V_"+sGXsfl_231_idx, Gridttrn05_hdrs_piezas_trozosContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridttrn05_hdrs_piezas_trozosContainerData"+"V_"+sGXsfl_231_idx+"\" value='"+Gridttrn05_hdrs_piezas_trozosContainer.GridValuesHidden()+"'/>") ;
      }
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Grid2Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1L0197( ) ;
      GXCCtl = "Z200BarPieCod_" + sGXsfl_231_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z200BarPieCod));
      GXCCtl = "Z27AlbPKilEnt_" + sGXsfl_231_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z27AlbPKilEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1270AlbPMtrEnt_" + sGXsfl_231_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1270AlbPMtrEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z197BarPConTro_" + sGXsfl_231_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O197BarPConTro_" + sGXsfl_231_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1270AlbPMtrEnt_" + sGXsfl_231_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1270AlbPMtrEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O27AlbPKilEnt_" + sGXsfl_231_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O27AlbPKilEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_264_" + sGXsfl_231_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_264_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_197_" + sGXsfl_231_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_197, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_197_" + sGXsfl_231_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_197, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_197_" + sGXsfl_231_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_197, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vALBPROCOD_" + sGXsfl_231_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV32ALbprocod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_231_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vGXBSCREEN_" + sGXsfl_231_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIECOD_"+sGXsfl_231_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPKILENT_"+sGXsfl_231_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPKilEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPMTRENT_"+sGXsfl_231_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPMtrEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPCONTRO_"+sGXsfl_231_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPConTro_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRIDTTRN05_HDRS_PIEZAS_TROZOS_nFirstRecordOnPage = 0 ;
      GRIDTTRN05_HDRS_PIEZAS_TROZOS_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1L0197( )
   {
      nGXsfl_231_idx = (int)(nGXsfl_231_idx+1) ;
      sGXsfl_231_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_231_idx), 4, 0), (short)(4), "0") + sGXsfl_138_idx ;
      subsflControlProps_231197( ) ;
      edtBarPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIECOD_"+sGXsfl_231_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPKilEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPKILENT_"+sGXsfl_231_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPMtrEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPMTRENT_"+sGXsfl_231_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPConTro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPCONTRO_"+sGXsfl_231_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A200BarPieCod = httpContext.cgiGet( edtBarPieCod_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbPKilEnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbPKilEnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBPKILENT_" + sGXsfl_231_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPKilEnt_Internalname ;
         wbErr = true ;
         A27AlbPKilEnt = DecimalUtil.ZERO ;
      }
      else
      {
         A27AlbPKilEnt = localUtil.ctond( httpContext.cgiGet( edtAlbPKilEnt_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbPMtrEnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbPMtrEnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBPMTRENT_" + sGXsfl_231_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPMtrEnt_Internalname ;
         wbErr = true ;
         A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      }
      else
      {
         A1270AlbPMtrEnt = localUtil.ctond( httpContext.cgiGet( edtAlbPMtrEnt_Internalname)) ;
      }
      A197BarPConTro = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPConTro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z200BarPieCod_" + sGXsfl_231_idx ;
      Z200BarPieCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z27AlbPKilEnt_" + sGXsfl_231_idx ;
      Z27AlbPKilEnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1270AlbPMtrEnt_" + sGXsfl_231_idx ;
      Z1270AlbPMtrEnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z197BarPConTro_" + sGXsfl_231_idx ;
      Z197BarPConTro = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O197BarPConTro_" + sGXsfl_231_idx ;
      O197BarPConTro = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O1270AlbPMtrEnt_" + sGXsfl_231_idx ;
      O1270AlbPMtrEnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O27AlbPKilEnt_" + sGXsfl_231_idx ;
      O27AlbPKilEnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRC_GXsfl_264_" + sGXsfl_231_idx ;
      nRC_GXsfl_264 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_197_" + sGXsfl_231_idx ;
      nRcdDeleted_197 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_197_" + sGXsfl_231_idx ;
      nRcdExists_197 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_197_" + sGXsfl_231_idx ;
      nIsMod_197 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "vGXBSCREEN_" + sGXsfl_231_idx ;
      Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_264_" + sGXsfl_231_idx ;
      nRC_GXsfl_264 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_264198( )
   {
      edtAlbPTroCod_Internalname = "ALBPTROCOD_"+sGXsfl_264_idx ;
      edtAlbPTroMet_Internalname = "ALBPTROMET_"+sGXsfl_264_idx ;
      edtAlbPTroKil_Internalname = "ALBPTROKIL_"+sGXsfl_264_idx ;
      edtAlbPTroAnc_Internalname = "ALBPTROANC_"+sGXsfl_264_idx ;
   }

   public void subsflControlProps_fel_264198( )
   {
      edtAlbPTroCod_Internalname = "ALBPTROCOD_"+sGXsfl_264_fel_idx ;
      edtAlbPTroMet_Internalname = "ALBPTROMET_"+sGXsfl_264_fel_idx ;
      edtAlbPTroKil_Internalname = "ALBPTROKIL_"+sGXsfl_264_fel_idx ;
      edtAlbPTroAnc_Internalname = "ALBPTROANC_"+sGXsfl_264_fel_idx ;
   }

   public void addRow1L0198( )
   {
      nGXsfl_264_idx = (int)(nGXsfl_264_idx+1) ;
      sGXsfl_264_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_264_idx), 4, 0), (short)(4), "0") + sGXsfl_231_idx ;
      subsflControlProps_264198( ) ;
      sendRow1L0198( ) ;
   }

   public void sendRow1L0198( )
   {
      Gridttrn05_hdrs_piezas_trozosRow = GXWebRow.GetNew(context) ;
      if ( subGridttrn05_hdrs_piezas_trozos_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridttrn05_hdrs_piezas_trozos_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridttrn05_hdrs_piezas_trozos_Class, "") != 0 )
         {
            subGridttrn05_hdrs_piezas_trozos_Linesclass = subGridttrn05_hdrs_piezas_trozos_Class+"Odd" ;
         }
      }
      else if ( subGridttrn05_hdrs_piezas_trozos_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridttrn05_hdrs_piezas_trozos_Backstyle = (byte)(0) ;
         subGridttrn05_hdrs_piezas_trozos_Backcolor = subGridttrn05_hdrs_piezas_trozos_Allbackcolor ;
         if ( GXutil.strcmp(subGridttrn05_hdrs_piezas_trozos_Class, "") != 0 )
         {
            subGridttrn05_hdrs_piezas_trozos_Linesclass = subGridttrn05_hdrs_piezas_trozos_Class+"Uniform" ;
         }
      }
      else if ( subGridttrn05_hdrs_piezas_trozos_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridttrn05_hdrs_piezas_trozos_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridttrn05_hdrs_piezas_trozos_Class, "") != 0 )
         {
            subGridttrn05_hdrs_piezas_trozos_Linesclass = subGridttrn05_hdrs_piezas_trozos_Class+"Odd" ;
         }
         subGridttrn05_hdrs_piezas_trozos_Backcolor = (int)(0x0) ;
      }
      else if ( subGridttrn05_hdrs_piezas_trozos_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridttrn05_hdrs_piezas_trozos_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_264_idx) % (2))) == 0 )
         {
            subGridttrn05_hdrs_piezas_trozos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridttrn05_hdrs_piezas_trozos_Class, "") != 0 )
            {
               subGridttrn05_hdrs_piezas_trozos_Linesclass = subGridttrn05_hdrs_piezas_trozos_Class+"Even" ;
            }
         }
         else
         {
            subGridttrn05_hdrs_piezas_trozos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridttrn05_hdrs_piezas_trozos_Class, "") != 0 )
            {
               subGridttrn05_hdrs_piezas_trozos_Linesclass = subGridttrn05_hdrs_piezas_trozos_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_198_" + sGXsfl_264_idx + "',1);gx.fn.setControlValue('nIsMod_197_" + sGXsfl_231_idx + "',1);gx.fn.setControlValue('nIsMod_195_" + sGXsfl_138_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 265,'',false,'" + sGXsfl_264_idx + "',264)\"" ;
      ROClassString = "Attribute" ;
      Gridttrn05_hdrs_piezas_trozosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPTroCod_Internalname,GXutil.ltrim( localUtil.ntoc( A42AlbPTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A42AlbPTroCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,265);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPTroCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPTroCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(264),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_198_" + sGXsfl_264_idx + "',1);gx.fn.setControlValue('nIsMod_197_" + sGXsfl_231_idx + "',1);gx.fn.setControlValue('nIsMod_195_" + sGXsfl_138_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 266,'',false,'" + sGXsfl_264_idx + "',264)\"" ;
      ROClassString = "Attribute" ;
      Gridttrn05_hdrs_piezas_trozosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPTroMet_Internalname,GXutil.ltrim( localUtil.ntoc( A43AlbPTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPTroMet_Enabled!=0) ? localUtil.format( A43AlbPTroMet, "ZZZZZ9.99") : localUtil.format( A43AlbPTroMet, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,266);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPTroMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPTroMet_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(264),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_198_" + sGXsfl_264_idx + "',1);gx.fn.setControlValue('nIsMod_197_" + sGXsfl_231_idx + "',1);gx.fn.setControlValue('nIsMod_195_" + sGXsfl_138_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 267,'',false,'" + sGXsfl_264_idx + "',264)\"" ;
      ROClassString = "Attribute" ;
      Gridttrn05_hdrs_piezas_trozosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPTroKil_Internalname,GXutil.ltrim( localUtil.ntoc( A5303AlbPTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPTroKil_Enabled!=0) ? localUtil.format( A5303AlbPTroKil, "ZZZZZ9.99") : localUtil.format( A5303AlbPTroKil, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,267);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPTroKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPTroKil_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(264),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_198_" + sGXsfl_264_idx + "',1);gx.fn.setControlValue('nIsMod_197_" + sGXsfl_231_idx + "',1);gx.fn.setControlValue('nIsMod_195_" + sGXsfl_138_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 268,'',false,'" + sGXsfl_264_idx + "',264)\"" ;
      ROClassString = "Attribute" ;
      Gridttrn05_hdrs_piezas_trozosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPTroAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A3118AlbPTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPTroAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3118AlbPTroAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3118AlbPTroAnc), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,268);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPTroAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPTroAnc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(264),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridttrn05_hdrs_piezas_trozosRow);
      send_integrity_lvl_hashes1L0198( ) ;
      GXCCtl = "Z42AlbPTroCod_" + sGXsfl_264_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z42AlbPTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z43AlbPTroMet_" + sGXsfl_264_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z43AlbPTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5303AlbPTroKil_" + sGXsfl_264_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5303AlbPTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3118AlbPTroAnc_" + sGXsfl_264_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3118AlbPTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_198_" + sGXsfl_264_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_198_" + sGXsfl_264_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_198_" + sGXsfl_264_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vALBPROCOD_" + sGXsfl_264_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV32ALbprocod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_264_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPTROCOD_"+sGXsfl_264_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPTROMET_"+sGXsfl_264_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPTROKIL_"+sGXsfl_264_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPTROANC_"+sGXsfl_264_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridttrn05_hdrs_piezas_trozosContainer.AddRow(Gridttrn05_hdrs_piezas_trozosRow);
   }

   public void readRow1L0198( )
   {
      nGXsfl_264_idx = (int)(nGXsfl_264_idx+1) ;
      sGXsfl_264_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_264_idx), 4, 0), (short)(4), "0") + sGXsfl_231_idx ;
      subsflControlProps_264198( ) ;
      edtAlbPTroCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROCOD_"+sGXsfl_264_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPTroMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROMET_"+sGXsfl_264_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPTroKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROKIL_"+sGXsfl_264_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPTroAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROANC_"+sGXsfl_264_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPTroCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPTroCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBPTROCOD_" + sGXsfl_264_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPTroCod_Internalname ;
         wbErr = true ;
         A42AlbPTroCod = (short)(0) ;
      }
      else
      {
         A42AlbPTroCod = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPTroCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbPTroMet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbPTroMet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBPTROMET_" + sGXsfl_264_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPTroMet_Internalname ;
         wbErr = true ;
         A43AlbPTroMet = DecimalUtil.ZERO ;
      }
      else
      {
         A43AlbPTroMet = localUtil.ctond( httpContext.cgiGet( edtAlbPTroMet_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbPTroKil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbPTroKil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBPTROKIL_" + sGXsfl_264_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPTroKil_Internalname ;
         wbErr = true ;
         A5303AlbPTroKil = DecimalUtil.ZERO ;
      }
      else
      {
         A5303AlbPTroKil = localUtil.ctond( httpContext.cgiGet( edtAlbPTroKil_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPTroAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPTroAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBPTROANC_" + sGXsfl_264_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPTroAnc_Internalname ;
         wbErr = true ;
         A3118AlbPTroAnc = (short)(0) ;
      }
      else
      {
         A3118AlbPTroAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPTroAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z42AlbPTroCod_" + sGXsfl_264_idx ;
      Z42AlbPTroCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z43AlbPTroMet_" + sGXsfl_264_idx ;
      Z43AlbPTroMet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5303AlbPTroKil_" + sGXsfl_264_idx ;
      Z5303AlbPTroKil = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3118AlbPTroAnc_" + sGXsfl_264_idx ;
      Z3118AlbPTroAnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_198_" + sGXsfl_264_idx ;
      nRcdDeleted_198 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_198_" + sGXsfl_264_idx ;
      nRcdExists_198 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_198_" + sGXsfl_264_idx ;
      nIsMod_198 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBarPConTro_Enabled = edtBarPConTro_Enabled ;
      defedtBarPieCod_Enabled = edtBarPieCod_Enabled ;
      defedtAlbPTroCod_Enabled = edtAlbPTroCod_Enabled ;
      defedtBarCodPar_Enabled = edtBarCodPar_Enabled ;
      defedtBarCodReo_Enabled = edtBarCodReo_Enabled ;
      defedtBarCod_Enabled = edtBarCod_Enabled ;
   }

   public void confirmValues1L00( )
   {
      nGXsfl_264_idx = 0 ;
      sGXsfl_264_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_264_idx), 4, 0), (short)(4), "0") + sGXsfl_231_idx ;
      subsflControlProps_264198( ) ;
      while ( nGXsfl_264_idx < nRC_GXsfl_264 )
      {
         nGXsfl_264_idx = (int)(nGXsfl_264_idx+1) ;
         sGXsfl_264_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_264_idx), 4, 0), (short)(4), "0") + sGXsfl_231_idx ;
         subsflControlProps_264198( ) ;
         httpContext.changePostValue( "Z42AlbPTroCod_"+sGXsfl_264_idx, httpContext.cgiGet( "ZT_"+"Z42AlbPTroCod_"+sGXsfl_264_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z42AlbPTroCod_"+sGXsfl_264_idx) ;
         httpContext.changePostValue( "Z43AlbPTroMet_"+sGXsfl_264_idx, httpContext.cgiGet( "ZT_"+"Z43AlbPTroMet_"+sGXsfl_264_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z43AlbPTroMet_"+sGXsfl_264_idx) ;
         httpContext.changePostValue( "Z5303AlbPTroKil_"+sGXsfl_264_idx, httpContext.cgiGet( "ZT_"+"Z5303AlbPTroKil_"+sGXsfl_264_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5303AlbPTroKil_"+sGXsfl_264_idx) ;
         httpContext.changePostValue( "Z3118AlbPTroAnc_"+sGXsfl_264_idx, httpContext.cgiGet( "ZT_"+"Z3118AlbPTroAnc_"+sGXsfl_264_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3118AlbPTroAnc_"+sGXsfl_264_idx) ;
      }
      nGXsfl_231_idx = 0 ;
      sGXsfl_231_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_231_idx), 4, 0), (short)(4), "0") + sGXsfl_138_idx ;
      subsflControlProps_231197( ) ;
      while ( nGXsfl_231_idx < nRC_GXsfl_231 )
      {
         nGXsfl_231_idx = (int)(nGXsfl_231_idx+1) ;
         sGXsfl_231_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_231_idx), 4, 0), (short)(4), "0") + sGXsfl_138_idx ;
         subsflControlProps_231197( ) ;
         httpContext.changePostValue( "Z200BarPieCod_"+sGXsfl_231_idx, httpContext.cgiGet( "ZT_"+"Z200BarPieCod_"+sGXsfl_231_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z200BarPieCod_"+sGXsfl_231_idx) ;
         httpContext.changePostValue( "Z27AlbPKilEnt_"+sGXsfl_231_idx, httpContext.cgiGet( "ZT_"+"Z27AlbPKilEnt_"+sGXsfl_231_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z27AlbPKilEnt_"+sGXsfl_231_idx) ;
         httpContext.changePostValue( "Z1270AlbPMtrEnt_"+sGXsfl_231_idx, httpContext.cgiGet( "ZT_"+"Z1270AlbPMtrEnt_"+sGXsfl_231_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1270AlbPMtrEnt_"+sGXsfl_231_idx) ;
         httpContext.changePostValue( "Z197BarPConTro_"+sGXsfl_231_idx, httpContext.cgiGet( "ZT_"+"Z197BarPConTro_"+sGXsfl_231_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z197BarPConTro_"+sGXsfl_231_idx) ;
      }
      nGXsfl_138_idx = 0 ;
      sGXsfl_138_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_138_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_138195( ) ;
      while ( nGXsfl_138_idx < nRC_GXsfl_138 )
      {
         nGXsfl_138_idx = (int)(nGXsfl_138_idx+1) ;
         sGXsfl_138_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_138_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_138195( ) ;
         httpContext.changePostValue( "Z129BarCod_"+sGXsfl_138_idx, httpContext.cgiGet( "ZT_"+"Z129BarCod_"+sGXsfl_138_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_138_idx) ;
         httpContext.changePostValue( "Z132BarCodReo_"+sGXsfl_138_idx, httpContext.cgiGet( "ZT_"+"Z132BarCodReo_"+sGXsfl_138_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_138_idx) ;
         httpContext.changePostValue( "Z130BarCodPar_"+sGXsfl_138_idx, httpContext.cgiGet( "ZT_"+"Z130BarCodPar_"+sGXsfl_138_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_138_idx) ;
         httpContext.changePostValue( "Z2839AlbProVal_"+sGXsfl_138_idx, httpContext.cgiGet( "ZT_"+"Z2839AlbProVal_"+sGXsfl_138_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2839AlbProVal_"+sGXsfl_138_idx) ;
         httpContext.changePostValue( "Z1261BarAlbKgmE_"+sGXsfl_138_idx, httpContext.cgiGet( "ZT_"+"Z1261BarAlbKgmE_"+sGXsfl_138_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1261BarAlbKgmE_"+sGXsfl_138_idx) ;
         httpContext.changePostValue( "Z1263BarAlbMtrE_"+sGXsfl_138_idx, httpContext.cgiGet( "ZT_"+"Z1263BarAlbMtrE_"+sGXsfl_138_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1263BarAlbMtrE_"+sGXsfl_138_idx) ;
         httpContext.changePostValue( "Z1265BarAlbPie_"+sGXsfl_138_idx, httpContext.cgiGet( "ZT_"+"Z1265BarAlbPie_"+sGXsfl_138_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1265BarAlbPie_"+sGXsfl_138_idx) ;
         httpContext.changePostValue( "Z1262BarPreKgm_"+sGXsfl_138_idx, httpContext.cgiGet( "ZT_"+"Z1262BarPreKgm_"+sGXsfl_138_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1262BarPreKgm_"+sGXsfl_138_idx) ;
         httpContext.changePostValue( "Z1264BarPreMtr_"+sGXsfl_138_idx, httpContext.cgiGet( "ZT_"+"Z1264BarPreMtr_"+sGXsfl_138_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1264BarPreMtr_"+sGXsfl_138_idx) ;
         httpContext.changePostValue( "Z2396BarAlbObs_"+sGXsfl_138_idx, httpContext.cgiGet( "ZT_"+"Z2396BarAlbObs_"+sGXsfl_138_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2396BarAlbObs_"+sGXsfl_138_idx) ;
         httpContext.changePostValue( "Z32AlbProEsp_"+sGXsfl_138_idx, httpContext.cgiGet( "ZT_"+"Z32AlbProEsp_"+sGXsfl_138_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z32AlbProEsp_"+sGXsfl_138_idx) ;
         httpContext.changePostValue( "Z40AlbProRec_"+sGXsfl_138_idx, httpContext.cgiGet( "ZT_"+"Z40AlbProRec_"+sGXsfl_138_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z40AlbProRec_"+sGXsfl_138_idx) ;
      }
      httpContext.changePostValue( "O1268BarAlbMtr", httpContext.cgiGet( "T1268BarAlbMtr")) ;
      httpContext.deletePostValue( "T1268BarAlbMtr") ;
      httpContext.changePostValue( "O1267BarAlbKgm", httpContext.cgiGet( "T1267BarAlbKgm")) ;
      httpContext.deletePostValue( "T1267BarAlbKgm") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ttrn05", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV32ALbprocod,10,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","ALbprocod","Gx_mode"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTrn05");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ttrn05:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z34AlbProfch", localUtil.dtoc( Z34AlbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z39AlbProPri", GXutil.rtrim( Z39AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1259AlbDomEnv", GXutil.ltrim( localUtil.ntoc( Z1259AlbDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3093AlbDivTCod", GXutil.rtrim( Z3093AlbDivTCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3869AlbCliDes", GXutil.ltrim( localUtil.ntoc( Z3869AlbCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7987AlbColCa", GXutil.rtrim( Z7987AlbColCa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10837AlbTrnNc", GXutil.rtrim( Z10837AlbTrnNc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z33AlbProEst", GXutil.ltrim( localUtil.ntoc( Z33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1782AlbProEso", GXutil.ltrim( localUtil.ntoc( Z1782AlbProEso, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1253EmprGuiRem", GXutil.rtrim( Z1253EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( Z1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3108AlbDivCod", GXutil.ltrim( localUtil.ntoc( Z3108AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O39AlbProPri", GXutil.rtrim( O39AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_138", GXutil.ltrim( localUtil.ntoc( nGXsfl_138_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV32ALbprocod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTCOD", GXutil.rtrim( AV33ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLINOM", GXutil.rtrim( AV34clinom));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICTRL", GXutil.rtrim( AV36Clictrl));
      app.GxWebStd.gx_hidden_field( httpContext, "vUTEXTA", GXutil.ltrim( localUtil.ntoc( AV40Utexta, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOTROCLI", GXutil.ltrim( localUtil.ntoc( AV38Otrocli, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV41Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO_I", AV35Texto_i);
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV12Station));
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
      return formatLink("app.ttrn05", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV32ALbprocod,10,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","ALbprocod","Gx_mode"})  ;
   }

   public String getPgmname( )
   {
      return "TTrn05" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Albaranes detalle rollos", "") ;
   }

   public void initializeNonKey1L03( )
   {
      A1253EmprGuiRem = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
      AV33ContCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33ContCod", AV33ContCod);
      AV34clinom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34clinom", AV34clinom);
      AV36Clictrl = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Clictrl", AV36Clictrl);
      A1260BusDomEnv = (byte)(0) ;
      n1260BusDomEnv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.str( A1260BusDomEnv, 1, 0));
      AV38Otrocli = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Otrocli", GXutil.ltrimstr( AV38Otrocli, 10, 2));
      AV40Utexta = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Utexta", GXutil.ltrimstr( AV40Utexta, 10, 2));
      A1259AlbDomEnv = (byte)(0) ;
      n1259AlbDomEnv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1259AlbDomEnv", GXutil.str( A1259AlbDomEnv, 1, 0));
      A3108AlbDivCod = (byte)(0) ;
      n3108AlbDivCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3108AlbDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3108AlbDivCod), 2, 0));
      A3109AlbDivAbr = "" ;
      n3109AlbDivAbr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", A3109AlbDivAbr);
      A3093AlbDivTCod = "" ;
      n3093AlbDivTCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
      A1243GuiRemCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      A1244GuiRemCln = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      A840TrnCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A3869AlbCliDes = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
      A7987AlbColCa = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7987AlbColCa", A7987AlbColCa);
      A10837AlbTrnNc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10837AlbTrnNc", A10837AlbTrnNc);
      A33AlbProEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
      A1782AlbProEso = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1782AlbProEso", GXutil.str( A1782AlbProEso, 1, 0));
      A34AlbProfch = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A39AlbProPri = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      O39AlbProPri = A39AlbProPri ;
      httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
      Z34AlbProfch = GXutil.nullDate() ;
      Z39AlbProPri = "" ;
      Z1259AlbDomEnv = (byte)(0) ;
      Z3093AlbDivTCod = "" ;
      Z3869AlbCliDes = 0 ;
      Z7987AlbColCa = "" ;
      Z10837AlbTrnNc = "" ;
      Z33AlbProEst = (byte)(0) ;
      Z1782AlbProEso = (byte)(0) ;
      Z1253EmprGuiRem = "" ;
      Z1243GuiRemCli = 0 ;
      Z840TrnCod = (short)(0) ;
      Z3108AlbDivCod = (byte)(0) ;
   }

   public void initAll1L03( )
   {
      A30AlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      initializeNonKey1L03( ) ;
   }

   public void standaloneModalInsert( )
   {
      A34AlbProfch = i34AlbProfch ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A39AlbProPri = i39AlbProPri ;
      httpContext.ajax_rsp_assign_attri("", false, "A39AlbProPri", A39AlbProPri);
   }

   public void initializeNonKey1L0195( )
   {
      AV35Texto_i = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Texto_i", AV35Texto_i);
      AV8UsurCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      AV12Station = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1265BarAlbPie = 0 ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A213BarSit = (byte)(0) ;
      A2396BarAlbObs = "" ;
      A32AlbProEsp = (byte)(0) ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A252CliCod = 0 ;
      n252CliCod = false ;
      A1267BarAlbKgm = DecimalUtil.ZERO ;
      A1268BarAlbMtr = DecimalUtil.ZERO ;
      A2839AlbProVal = httpContext.getMessage( "S", "") ;
      O1268BarAlbMtr = A1268BarAlbMtr ;
      O1267BarAlbKgm = A1267BarAlbKgm ;
      Z2839AlbProVal = "" ;
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
      Z1265BarAlbPie = 0 ;
      Z1262BarPreKgm = DecimalUtil.ZERO ;
      Z1264BarPreMtr = DecimalUtil.ZERO ;
      Z2396BarAlbObs = "" ;
      Z32AlbProEsp = (byte)(0) ;
      Z40AlbProRec = DecimalUtil.ZERO ;
   }

   public void initAll1L0195( )
   {
      A129BarCod = 0 ;
      A132BarCodReo = (byte)(0) ;
      A130BarCodPar = "" ;
      initializeNonKey1L0195( ) ;
   }

   public void standaloneModalInsert1L0195( )
   {
      A2839AlbProVal = i2839AlbProVal ;
   }

   public void initializeNonKey1L0197( )
   {
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      A197BarPConTro = (short)(0) ;
      O197BarPConTro = A197BarPConTro ;
      O1270AlbPMtrEnt = A1270AlbPMtrEnt ;
      O27AlbPKilEnt = A27AlbPKilEnt ;
      Z27AlbPKilEnt = DecimalUtil.ZERO ;
      Z1270AlbPMtrEnt = DecimalUtil.ZERO ;
      Z197BarPConTro = (short)(0) ;
   }

   public void initAll1L0197( )
   {
      A200BarPieCod = "" ;
      initializeNonKey1L0197( ) ;
   }

   public void standaloneModalInsert1L0197( )
   {
   }

   public void initializeNonKey1L0198( )
   {
      A43AlbPTroMet = DecimalUtil.ZERO ;
      A5303AlbPTroKil = DecimalUtil.ZERO ;
      A3118AlbPTroAnc = (short)(0) ;
      Z43AlbPTroMet = DecimalUtil.ZERO ;
      Z5303AlbPTroKil = DecimalUtil.ZERO ;
      Z3118AlbPTroAnc = (short)(0) ;
   }

   public void initAll1L0198( )
   {
      A42AlbPTroCod = (short)(0) ;
      initializeNonKey1L0198( ) ;
   }

   public void standaloneModalInsert1L0198( )
   {
      A197BarPConTro = i197BarPConTro ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241593171", true, true);
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
      httpContext.AddJavascriptSource("ttrn05.js", "?20268241593171", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties195( )
   {
      edtBarCodPar_Enabled = defedtBarCodPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      edtBarCodReo_Enabled = defedtBarCodReo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_138_Refreshing);
      edtBarCod_Enabled = defedtBarCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_138_Refreshing);
   }

   public void init_level_properties197( )
   {
      edtBarPConTro_Enabled = defedtBarPConTro_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPConTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPConTro_Enabled), 5, 0), !bGXsfl_231_Refreshing);
      edtBarPieCod_Enabled = defedtBarPieCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), !bGXsfl_231_Refreshing);
   }

   public void init_level_properties198( )
   {
      edtAlbPTroCod_Enabled = defedtAlbPTroCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroCod_Enabled), 5, 0), !bGXsfl_264_Refreshing);
   }

   public void startgridcontrol138( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("DeleteMethod", "none");
      Grid1Container.AddObjectProperty("Class", GXutil.rtrim( "TrnSublevelGrid"));
      Grid1Container.AddObjectProperty("Class", "TrnSublevelGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbKgmE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbMtrE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSit_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2839AlbProVal));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbProVal.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2396BarAlbObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProEsp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1267BarAlbKgm, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1268BarAlbMtr, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarAlbMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTitlepiezas_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol231( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("Header", subGrid2_Header);
      Grid2Container.AddObjectProperty("Class", GXutil.rtrim( "TrnSublevelGrid"));
      Grid2Container.AddObjectProperty("Class", "TrnSublevelGrid");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A200BarPieCod));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A27AlbPKilEnt, (byte)(9), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPKilEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1270AlbPMtrEnt, (byte)(9), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPMtrEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPConTro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", lblTitletrozos_Caption);
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol264( )
   {
      Gridttrn05_hdrs_piezas_trozosContainer.AddObjectProperty("GridName", "Gridttrn05_hdrs_piezas_trozos");
      Gridttrn05_hdrs_piezas_trozosContainer.AddObjectProperty("Header", subGridttrn05_hdrs_piezas_trozos_Header);
      Gridttrn05_hdrs_piezas_trozosContainer.AddObjectProperty("Class", "Grid");
      Gridttrn05_hdrs_piezas_trozosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridttrn05_hdrs_piezas_trozosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridttrn05_hdrs_piezas_trozosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridttrn05_hdrs_piezas_trozos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridttrn05_hdrs_piezas_trozosContainer.AddObjectProperty("CmpContext", "");
      Gridttrn05_hdrs_piezas_trozosContainer.AddObjectProperty("InMasterPage", "false");
      Gridttrn05_hdrs_piezas_trozosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridttrn05_hdrs_piezas_trozosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A42AlbPTroCod, (byte)(4), (byte)(0), ".", "")));
      Gridttrn05_hdrs_piezas_trozosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridttrn05_hdrs_piezas_trozosContainer.AddColumnProperties(Gridttrn05_hdrs_piezas_trozosColumn);
      Gridttrn05_hdrs_piezas_trozosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridttrn05_hdrs_piezas_trozosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A43AlbPTroMet, (byte)(9), (byte)(2), ".", "")));
      Gridttrn05_hdrs_piezas_trozosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridttrn05_hdrs_piezas_trozosContainer.AddColumnProperties(Gridttrn05_hdrs_piezas_trozosColumn);
      Gridttrn05_hdrs_piezas_trozosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridttrn05_hdrs_piezas_trozosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5303AlbPTroKil, (byte)(9), (byte)(2), ".", "")));
      Gridttrn05_hdrs_piezas_trozosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridttrn05_hdrs_piezas_trozosContainer.AddColumnProperties(Gridttrn05_hdrs_piezas_trozosColumn);
      Gridttrn05_hdrs_piezas_trozosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridttrn05_hdrs_piezas_trozosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3118AlbPTroAnc, (byte)(4), (byte)(0), ".", "")));
      Gridttrn05_hdrs_piezas_trozosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridttrn05_hdrs_piezas_trozosContainer.AddColumnProperties(Gridttrn05_hdrs_piezas_trozosColumn);
      Gridttrn05_hdrs_piezas_trozosContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridttrn05_hdrs_piezas_trozos_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridttrn05_hdrs_piezas_trozosContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridttrn05_hdrs_piezas_trozos_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridttrn05_hdrs_piezas_trozosContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridttrn05_hdrs_piezas_trozos_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridttrn05_hdrs_piezas_trozosContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridttrn05_hdrs_piezas_trozos_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridttrn05_hdrs_piezas_trozosContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridttrn05_hdrs_piezas_trozos_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridttrn05_hdrs_piezas_trozosContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridttrn05_hdrs_piezas_trozos_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridttrn05_hdrs_piezas_trozosContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridttrn05_hdrs_piezas_trozos_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      edtAlbProfch_Internalname = "ALBPROFCH" ;
      edtAlbProPri_Internalname = "ALBPROPRI" ;
      edtAlbDomEnv_Internalname = "ALBDOMENV" ;
      edtAlbDivCod_Internalname = "ALBDIVCOD" ;
      edtAlbDivAbr_Internalname = "ALBDIVABR" ;
      cmbAlbDivTCod.setInternalname( "ALBDIVTCOD" );
      edtEmprGuiRem_Internalname = "EMPRGUIREM" ;
      edtGuiRemCli_Internalname = "GUIREMCLI" ;
      edtGuiRemCln_Internalname = "GUIREMCLN" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      edtTrnNom_Internalname = "TRNNOM" ;
      edtAlbCliDes_Internalname = "ALBCLIDES" ;
      edtAlbColCa_Internalname = "ALBCOLCA" ;
      edtAlbTrnNc_Internalname = "ALBTRNNC" ;
      edtAlbProEst_Internalname = "ALBPROEST" ;
      edtAlbProEso_Internalname = "ALBPROESO" ;
      edtBusDomEnv_Internalname = "BUSDOMENV" ;
      lblTitlehdrs_Internalname = "TITLEHDRS" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtBarAlbKgmE_Internalname = "BARALBKGME" ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE" ;
      edtBarAlbPie_Internalname = "BARALBPIE" ;
      edtBarPreKgm_Internalname = "BARPREKGM" ;
      edtBarPreMtr_Internalname = "BARPREMTR" ;
      edtBarSit_Internalname = "BARSIT" ;
      cmbAlbProVal.setInternalname( "ALBPROVAL" );
      edtBarAlbObs_Internalname = "BARALBOBS" ;
      edtAlbProEsp_Internalname = "ALBPROESP" ;
      edtAlbProRec_Internalname = "ALBPROREC" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtBarAlbKgm_Internalname = "BARALBKGM" ;
      edtBarAlbMtr_Internalname = "BARALBMTR" ;
      lblTitlepiezas_Internalname = "TITLEPIEZAS" ;
      edtBarPieCod_Internalname = "BARPIECOD" ;
      edtAlbPKilEnt_Internalname = "ALBPKILENT" ;
      edtAlbPMtrEnt_Internalname = "ALBPMTRENT" ;
      edtBarPConTro_Internalname = "BARPCONTRO" ;
      lblTitletrozos_Internalname = "TITLETROZOS" ;
      edtAlbPTroCod_Internalname = "ALBPTROCOD" ;
      edtAlbPTroMet_Internalname = "ALBPTROMET" ;
      edtAlbPTroKil_Internalname = "ALBPTROKIL" ;
      edtAlbPTroAnc_Internalname = "ALBPTROANC" ;
      divTrozostable_Internalname = "TROZOSTABLE" ;
      divTable3_Internalname = "TABLE3" ;
      divGridtable2_Internalname = "GRIDTABLE2" ;
      divPiezastable_Internalname = "PIEZASTABLE" ;
      divTable2_Internalname = "TABLE2" ;
      divGridtable1_Internalname = "GRIDTABLE1" ;
      divHdrstable_Internalname = "HDRSTABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridttrn05_hdrs_piezas_trozos_Internalname = "GRIDTTRN05_HDRS_PIEZAS_TROZOS" ;
      subGrid2_Internalname = "GRID2" ;
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
      subGridttrn05_hdrs_piezas_trozos_Allowcollapsing = (byte)(0) ;
      subGridttrn05_hdrs_piezas_trozos_Allowselection = (byte)(0) ;
      subGridttrn05_hdrs_piezas_trozos_Header = "" ;
      subGrid2_Allowcollapsing = (byte)(0) ;
      lblTitletrozos_Caption = httpContext.getMessage( "Trozos", "") ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblTitlepiezas_Caption = httpContext.getMessage( "Piezas", "") ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Albaranes detalle rollos", "") );
      edtAlbPTroAnc_Jsonclick = "" ;
      edtAlbPTroKil_Jsonclick = "" ;
      edtAlbPTroMet_Jsonclick = "" ;
      edtAlbPTroCod_Jsonclick = "" ;
      subGridttrn05_hdrs_piezas_trozos_Class = "Grid" ;
      subGridttrn05_hdrs_piezas_trozos_Backcolorstyle = (byte)(0) ;
      edtBarPConTro_Jsonclick = "" ;
      edtAlbPMtrEnt_Jsonclick = "" ;
      edtAlbPKilEnt_Jsonclick = "" ;
      edtBarPieCod_Jsonclick = "" ;
      subGrid2_Class = "TrnSublevelGrid" ;
      subGrid2_Backcolorstyle = (byte)(0) ;
      edtBarAlbMtr_Jsonclick = "" ;
      edtBarAlbKgm_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtAlbProRec_Jsonclick = "" ;
      edtAlbProEsp_Jsonclick = "" ;
      edtBarAlbObs_Jsonclick = "" ;
      cmbAlbProVal.setJsonclick( "" );
      edtBarSit_Jsonclick = "" ;
      edtBarPreMtr_Jsonclick = "" ;
      edtBarPreKgm_Jsonclick = "" ;
      edtBarAlbPie_Jsonclick = "" ;
      edtBarAlbMtrE_Jsonclick = "" ;
      edtBarAlbKgmE_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      subGrid1_Class = "TrnSublevelGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtBarPConTro_Enabled = 0 ;
      edtAlbPMtrEnt_Enabled = 1 ;
      edtAlbPKilEnt_Enabled = 1 ;
      edtBarPieCod_Enabled = 1 ;
      edtAlbPTroAnc_Enabled = 1 ;
      edtAlbPTroKil_Enabled = 1 ;
      edtAlbPTroMet_Enabled = 1 ;
      edtAlbPTroCod_Enabled = 1 ;
      edtBarAlbMtr_Enabled = 0 ;
      edtBarAlbKgm_Enabled = 0 ;
      edtCliCod_Enabled = 0 ;
      edtAlbProRec_Enabled = 1 ;
      edtAlbProEsp_Enabled = 1 ;
      edtBarAlbObs_Enabled = 1 ;
      cmbAlbProVal.setEnabled( 1 );
      edtBarSit_Enabled = 0 ;
      edtBarPreMtr_Enabled = 1 ;
      edtBarPreKgm_Enabled = 1 ;
      edtBarAlbPie_Enabled = 1 ;
      edtBarAlbMtrE_Enabled = 1 ;
      edtBarAlbKgmE_Enabled = 1 ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Enabled = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtBusDomEnv_Jsonclick = "" ;
      edtBusDomEnv_Enabled = 0 ;
      edtAlbProEso_Jsonclick = "" ;
      edtAlbProEso_Enabled = 1 ;
      edtAlbProEst_Jsonclick = "" ;
      edtAlbProEst_Enabled = 1 ;
      edtAlbTrnNc_Jsonclick = "" ;
      edtAlbTrnNc_Enabled = 1 ;
      edtAlbColCa_Jsonclick = "" ;
      edtAlbColCa_Enabled = 1 ;
      edtAlbCliDes_Jsonclick = "" ;
      edtAlbCliDes_Enabled = 1 ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnNom_Enabled = 0 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 1 ;
      edtGuiRemCln_Jsonclick = "" ;
      edtGuiRemCln_Enabled = 0 ;
      edtGuiRemCli_Jsonclick = "" ;
      edtGuiRemCli_Enabled = 1 ;
      edtEmprGuiRem_Jsonclick = "" ;
      edtEmprGuiRem_Enabled = 1 ;
      cmbAlbDivTCod.setJsonclick( "" );
      cmbAlbDivTCod.setEnabled( 1 );
      edtAlbDivAbr_Jsonclick = "" ;
      edtAlbDivAbr_Enabled = 0 ;
      edtAlbDivCod_Jsonclick = "" ;
      edtAlbDivCod_Enabled = 1 ;
      edtAlbDomEnv_Jsonclick = "" ;
      edtAlbDomEnv_Enabled = 1 ;
      edtAlbProPri_Jsonclick = "" ;
      edtAlbProPri_Enabled = 1 ;
      edtAlbProfch_Jsonclick = "" ;
      edtAlbProfch_Enabled = 1 ;
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
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

   public void xc_14_1L03( String Gx_mode ,
                           String A396EmprCod ,
                           String AV33ContCod ,
                           long A30AlbProCod ,
                           String A39AlbProPri )
   {
      if ( (0==A30AlbProCod) && true /* After */ && true /* After */ && isIns( )  )
      {
         GXv_int2[0] = (int)(A30AlbProCod) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, AV33ContCod, GXv_int2) ;
         A30AlbProCod = GXv_int2[0] ;
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

   public void xc_15_1L03( String A396EmprCod ,
                           int A3869AlbCliDes )
   {
      if ( true /* Level */ && ( A3869AlbCliDes > 0 ) )
      {
         GXv_char3[0] = AV34clinom ;
         new app.pclinom(remoteHandle, context).execute( A396EmprCod, A3869AlbCliDes, GXv_char3) ;
         AV34clinom = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34clinom", AV34clinom);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV34clinom))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_16_1L03( String A396EmprCod ,
                           int A1243GuiRemCli ,
                           String AV36Clictrl )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int2[0] = A1243GuiRemCli ;
         GXv_char1[0] = AV36Clictrl ;
         new app.pclictr(remoteHandle, context).execute( GXv_char3, GXv_int2, GXv_char1) ;
         A396EmprCod = GXv_char3[0] ;
         A1243GuiRemCli = GXv_int2[0] ;
         AV36Clictrl = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV36Clictrl", AV36Clictrl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV36Clictrl))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_17_1L03( String A396EmprCod ,
                           int A3869AlbCliDes ,
                           String AV36Clictrl ,
                           java.math.BigDecimal AV38Otrocli )
   {
      if ( true /* Level */ && true /* After */ && ( AV38Otrocli.doubleValue() == 1 ) )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int2[0] = A3869AlbCliDes ;
         GXv_char1[0] = AV36Clictrl ;
         new app.pclictr(remoteHandle, context).execute( GXv_char3, GXv_int2, GXv_char1) ;
         A396EmprCod = GXv_char3[0] ;
         A3869AlbCliDes = GXv_int2[0] ;
         AV36Clictrl = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3869AlbCliDes), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV36Clictrl", AV36Clictrl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3869AlbCliDes, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV36Clictrl))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_26_1L0195( String A396EmprCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar ,
                             java.math.BigDecimal A1262BarPreKgm ,
                             java.math.BigDecimal A1264BarPreMtr ,
                             byte A32AlbProEsp ,
                             java.math.BigDecimal A40AlbProRec ,
                             String A2839AlbProVal )
   {
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int8[0] = A132BarCodReo ;
         GXv_char1[0] = A130BarCodPar ;
         GXv_decimal9[0] = A1262BarPreKgm ;
         GXv_decimal7[0] = A1264BarPreMtr ;
         GXv_int5[0] = A32AlbProEsp ;
         GXv_decimal6[0] = A40AlbProRec ;
         new app.pbuspre(remoteHandle, context).execute( GXv_char3, GXv_int2, GXv_int8, GXv_char1, GXv_decimal9, GXv_decimal7, GXv_int5, GXv_decimal6) ;
         A396EmprCod = GXv_char3[0] ;
         A129BarCod = GXv_int2[0] ;
         A132BarCodReo = GXv_int8[0] ;
         A130BarCodPar = GXv_char1[0] ;
         A1262BarPreKgm = GXv_decimal9[0] ;
         A1264BarPreMtr = GXv_decimal7[0] ;
         A32AlbProEsp = GXv_int5[0] ;
         A40AlbProRec = GXv_decimal6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_30_1L0195( String A396EmprCod ,
                             String AV41Pgmname ,
                             String AV8UsurCod ,
                             String AV12Station ,
                             String AV35Texto_i ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar )
   {
      if ( true /* After */ && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV41Pgmname, AV8UsurCod, AV12Station, AV35Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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

   public void xc_33_1L0195( String A396EmprCod ,
                             long A30AlbProCod ,
                             int A129BarCod ,
                             byte A132BarCodReo ,
                             String A130BarCodPar )
   {
      if ( true /* After */ )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A30AlbProCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int8[0] = A132BarCodReo ;
         GXv_char1[0] = A130BarCodPar ;
         new app.pinspzstrz(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int2, GXv_int8, GXv_char1) ;
         A396EmprCod = GXv_char3[0] ;
         A30AlbProCod = GXv_int4[0] ;
         A129BarCod = GXv_int2[0] ;
         A132BarCodReo = GXv_int8[0] ;
         A130BarCodPar = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\"") ;
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
      subsflControlProps_138195( ) ;
      while ( nGXsfl_138_idx <= nRC_GXsfl_138 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1L0195( ) ;
         standaloneModal1L0195( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1L0195( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_138_idx = (int)(nGXsfl_138_idx+1) ;
         sGXsfl_138_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_138_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_138195( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_231197( ) ;
      while ( nGXsfl_231_idx <= nRC_GXsfl_231 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1L0195( ) ;
         standaloneModal1L0195( ) ;
         standaloneNotModal1L0197( ) ;
         standaloneModal1L0197( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1L0197( ) ;
         Grid2Row.AddGrid("Gridttrn05_hdrs_piezas_trozos", Gridttrn05_hdrs_piezas_trozosContainer);
         nGXsfl_231_idx = (int)(nGXsfl_231_idx+1) ;
         sGXsfl_231_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_231_idx), 4, 0), (short)(4), "0") + sGXsfl_138_idx ;
         subsflControlProps_231197( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
   }

   public void gxnrgridttrn05_hdrs_piezas_trozos_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_264198( ) ;
      while ( nGXsfl_264_idx <= nRC_GXsfl_264 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1L0195( ) ;
         standaloneModal1L0195( ) ;
         standaloneNotModal1L0197( ) ;
         standaloneModal1L0197( ) ;
         standaloneNotModal1L0198( ) ;
         standaloneModal1L0198( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1L0198( ) ;
         nGXsfl_264_idx = (int)(nGXsfl_264_idx+1) ;
         sGXsfl_264_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_264_idx), 4, 0), (short)(4), "0") + sGXsfl_231_idx ;
         subsflControlProps_264198( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridttrn05_hdrs_piezas_trozosContainer)) ;
      /* End function gxnrGridttrn05_hdrs_piezas_trozos_newrow */
   }

   public void init_web_controls( )
   {
      cmbAlbDivTCod.setName( "ALBDIVTCOD" );
      cmbAlbDivTCod.setWebtags( "" );
      cmbAlbDivTCod.addItem("P", httpContext.getMessage( "PESETA", ""), (short)(0));
      cmbAlbDivTCod.addItem("E", httpContext.getMessage( "EURO", ""), (short)(0));
      if ( cmbAlbDivTCod.getItemCount() > 0 )
      {
         A3093AlbDivTCod = cmbAlbDivTCod.getValidValue(A3093AlbDivTCod) ;
         n3093AlbDivTCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3093AlbDivTCod", A3093AlbDivTCod);
      }
      GXCCtl = "ALBPROVAL_" + sGXsfl_138_idx ;
      cmbAlbProVal.setName( GXCCtl );
      cmbAlbProVal.setWebtags( "" );
      cmbAlbProVal.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
      cmbAlbProVal.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
      if ( cmbAlbProVal.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A2839AlbProVal)==0) )
         {
            A2839AlbProVal = httpContext.getMessage( "S", "") ;
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

   public void valid_Albpropri( )
   {
      if ( ! ( ( GXutil.strcmp(A39AlbProPri, "0") == 0 ) || ( GXutil.strcmp(A39AlbProPri, "1") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Prioridad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBPROPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProPri_Internalname ;
      }
      if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
      {
         AV33ContCod = "555555" ;
      }
      else
      {
         if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
         {
            AV33ContCod = "666666" ;
         }
      }
      if ( isUpd( )  && ( GXutil.strcmp(A39AlbProPri, O39AlbProPri) != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO se modificar este campo¡¡¡", ""), 1, "ALBPROPRI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProPri_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV33ContCod", GXutil.rtrim( AV33ContCod));
   }

   public void valid_Albdivcod( )
   {
      n3108AlbDivCod = false ;
      n3109AlbDivAbr = false ;
      /* Using cursor T01L033 */
      pr_default.execute(30, new Object[] {Boolean.valueOf(n3108AlbDivCod), Byte.valueOf(A3108AlbDivCod)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         if ( ! ( (0==A3108AlbDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlb", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBDIVCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbDivCod_Internalname ;
         }
      }
      A3109AlbDivAbr = T01L033_A3109AlbDivAbr[0] ;
      n3109AlbDivAbr = T01L033_n3109AlbDivAbr[0] ;
      pr_default.close(30);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3109AlbDivAbr", GXutil.rtrim( A3109AlbDivAbr));
   }

   public void valid_Guiremcli( )
   {
      n1259AlbDomEnv = false ;
      n1260BusDomEnv = false ;
      /* Using cursor T01L034 */
      pr_default.execute(31, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
      }
      A1244GuiRemCln = T01L034_A1244GuiRemCln[0] ;
      pr_default.close(31);
      /* Using cursor T01L035 */
      pr_default.execute(32, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli), Boolean.valueOf(n1259AlbDomEnv), Byte.valueOf(A1259AlbDomEnv)});
      if ( (pr_default.getStatus(32) != 101) )
      {
         A1260BusDomEnv = T01L035_A1260BusDomEnv[0] ;
         n1260BusDomEnv = T01L035_n1260BusDomEnv[0] ;
      }
      else
      {
         A1260BusDomEnv = (byte)(0) ;
         n1260BusDomEnv = false ;
      }
      pr_default.close(32);
      if ( (0==A1260BusDomEnv) && ( ! (0==A1259AlbDomEnv) ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Domicilio envio inexistente", ""), 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiRemCli_Internalname ;
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int2[0] = A1243GuiRemCli ;
         GXv_char1[0] = AV36Clictrl ;
         new app.pclictr(remoteHandle, context).execute( GXv_char3, GXv_int2, GXv_char1) ;
         ttrn05_impl.this.A396EmprCod = GXv_char3[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttrn05_impl.this.A1243GuiRemCli = GXv_int2[0] ;
         A1243GuiRemCli = this.A1243GuiRemCli ;
         ttrn05_impl.this.AV36Clictrl = GXv_char1[0] ;
         AV36Clictrl = this.AV36Clictrl ;
      }
      if ( true /* Level */ && true /* After */ && ( GXutil.strcmp(AV36Clictrl, httpContext.getMessage( "S", "")) == 0 ) && ( AV40Utexta.doubleValue() == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion. Consultar con Administracion. Cliente en CONTROL ¡¡¡", ""), 1, "GUIREMCLI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiRemCli_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", GXutil.rtrim( A1244GuiRemCln));
      httpContext.ajax_rsp_assign_attri("", false, "A1260BusDomEnv", GXutil.ltrim( localUtil.ntoc( A1260BusDomEnv, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV36Clictrl", GXutil.rtrim( AV36Clictrl));
   }

   public void valid_Trncod( )
   {
      n841TrnNom = false ;
      /* Using cursor T01L036 */
      pr_default.execute(33, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(33) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A841TrnNom = T01L036_A841TrnNom[0] ;
      n841TrnNom = T01L036_n841TrnNom[0] ;
      pr_default.close(34);
      /* Using cursor T01L037 */
      pr_default.execute(34, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprGuiRem_Internalname ;
      }
      A841TrnNom = T01L037_A841TrnNom[0] ;
      n841TrnNom = T01L037_n841TrnNom[0] ;
      pr_default.close(34);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
   }

   public void valid_Albclides( )
   {
      if ( true /* Level */ && ( A3869AlbCliDes > 0 ) )
      {
         GXv_char3[0] = AV34clinom ;
         new app.pclinom(remoteHandle, context).execute( A396EmprCod, A3869AlbCliDes, GXv_char3) ;
         ttrn05_impl.this.AV34clinom = GXv_char3[0] ;
         AV34clinom = this.AV34clinom ;
      }
      if ( true /* Level */ && true /* After */ && ( AV38Otrocli.doubleValue() == 1 ) )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int2[0] = A3869AlbCliDes ;
         GXv_char1[0] = AV36Clictrl ;
         new app.pclictr(remoteHandle, context).execute( GXv_char3, GXv_int2, GXv_char1) ;
         ttrn05_impl.this.A396EmprCod = GXv_char3[0] ;
         A396EmprCod = this.A396EmprCod ;
         ttrn05_impl.this.A3869AlbCliDes = GXv_int2[0] ;
         A3869AlbCliDes = this.A3869AlbCliDes ;
         ttrn05_impl.this.AV36Clictrl = GXv_char1[0] ;
         AV36Clictrl = this.AV36Clictrl ;
      }
      if ( true /* Level */ && true /* After */ && ( AV38Otrocli.doubleValue() == 1 ) && ( GXutil.strcmp(AV36Clictrl, httpContext.getMessage( "S", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion. Consultar con Administracion. Cliente Destino en CONTROL ¡¡¡", ""), 1, "ALBCLIDES");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbCliDes_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV34clinom", GXutil.rtrim( AV34clinom));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A3869AlbCliDes", GXutil.ltrim( localUtil.ntoc( A3869AlbCliDes, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV36Clictrl", GXutil.rtrim( AV36Clictrl));
   }

   public void valid_Barcodpar( )
   {
      n252CliCod = false ;
      /* Using cursor T01L053 */
      pr_default.execute(48, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(48) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      A213BarSit = T01L053_A213BarSit[0] ;
      A252CliCod = T01L053_A252CliCod[0] ;
      n252CliCod = T01L053_n252CliCod[0] ;
      pr_default.close(48);
      if ( ( A213BarSit == 9 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "La Hoja de Ruta esta cerrada", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
      }
      if ( ( A213BarSit == 9 ) && isUpd( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "La Hoja de Ruta esta cerrada", ""), 0, "");
      }
      if ( A213BarSit == 11 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "La Hoja de Ruta esta en Historico", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
      }
      /* Using cursor T01L055 */
      pr_default.execute(49, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(49) != 101) )
      {
         A1267BarAlbKgm = T01L055_A1267BarAlbKgm[0] ;
         A1268BarAlbMtr = T01L055_A1268BarAlbMtr[0] ;
      }
      else
      {
         A1267BarAlbKgm = DecimalUtil.doubleToDec(0) ;
         A1268BarAlbMtr = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(49);
      if ( ( A252CliCod != A1243GuiRemCli ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente erroneo", ""), 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodPar_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1267BarAlbKgm", GXutil.ltrim( localUtil.ntoc( A1267BarAlbKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1268BarAlbMtr", GXutil.ltrim( localUtil.ntoc( A1268BarAlbMtr, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Barpiecod( )
   {
      /* Using cursor T01L074 */
      pr_default.execute(68, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      Z197BarPConTro = T01L074_A197BarPConTro[0] ;
      if ( (pr_default.getStatus(68) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPIE", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARPIECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieCod_Internalname ;
      }
      A197BarPConTro = T01L074_A197BarPConTro[0] ;
      O197BarPConTro = A197BarPConTro ;
      pr_default.close(68);
      if ( isIns( )  && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "BARPIECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O197BarPConTro", GXutil.ltrim( localUtil.ntoc( O197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV32ALbprocod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROPRI","{handler:'valid_Albpropri',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O39AlbProPri'},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'AV33ContCod',fld:'vCONTCOD',pic:'@!'}]");
      setEventMetadata("VALID_ALBPROPRI",",oparms:[{av:'AV33ContCod',fld:'vCONTCOD',pic:'@!'}]}");
      setEventMetadata("VALID_ALBDOMENV","{handler:'valid_Albdomenv',iparms:[]");
      setEventMetadata("VALID_ALBDOMENV",",oparms:[]}");
      setEventMetadata("VALID_ALBDIVCOD","{handler:'valid_Albdivcod',iparms:[{av:'A3108AlbDivCod',fld:'ALBDIVCOD',pic:'Z9'},{av:'A3109AlbDivAbr',fld:'ALBDIVABR',pic:''}]");
      setEventMetadata("VALID_ALBDIVCOD",",oparms:[{av:'A3109AlbDivAbr',fld:'ALBDIVABR',pic:''}]}");
      setEventMetadata("VALID_EMPRGUIREM","{handler:'valid_Emprguirem',iparms:[]");
      setEventMetadata("VALID_EMPRGUIREM",",oparms:[]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1253EmprGuiRem',fld:'EMPRGUIREM',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A1259AlbDomEnv',fld:'ALBDOMENV',pic:'9'},{av:'A1260BusDomEnv',fld:'BUSDOMENV',pic:'9'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'AV36Clictrl',fld:'vCLICTRL',pic:'@!'}]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'A1260BusDomEnv',fld:'BUSDOMENV',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'AV36Clictrl',fld:'vCLICTRL',pic:'@!'}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A1253EmprGuiRem',fld:'EMPRGUIREM',pic:'@!'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A841TrnNom',fld:'TRNNOM',pic:''}]}");
      setEventMetadata("VALID_ALBCLIDES","{handler:'valid_Albclides',iparms:[{av:'AV38Otrocli',fld:'vOTROCLI',pic:'9999999.99'},{av:'AV36Clictrl',fld:'vCLICTRL',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3869AlbCliDes',fld:'ALBCLIDES',pic:'ZZZZZ9'},{av:'AV34clinom',fld:'vCLINOM',pic:''}]");
      setEventMetadata("VALID_ALBCLIDES",",oparms:[{av:'AV34clinom',fld:'vCLINOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3869AlbCliDes',fld:'ALBCLIDES',pic:'ZZZZZ9'},{av:'AV36Clictrl',fld:'vCLICTRL',pic:'@!'}]}");
      setEventMetadata("VALID_ALBPROEST","{handler:'valid_Albproest',iparms:[]");
      setEventMetadata("VALID_ALBPROEST",",oparms:[]}");
      setEventMetadata("VALID_BUSDOMENV","{handler:'valid_Busdomenv',iparms:[]");
      setEventMetadata("VALID_BUSDOMENV",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1267BarAlbKgm',fld:'BARALBKGM',pic:'ZZZZZ9.99'},{av:'A1268BarAlbMtr',fld:'BARALBMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1267BarAlbKgm',fld:'BARALBKGM',pic:'ZZZZZ9.99'},{av:'A1268BarAlbMtr',fld:'BARALBMTR',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_BARPREKGM","{handler:'valid_Barprekgm',iparms:[]");
      setEventMetadata("VALID_BARPREKGM",",oparms:[]}");
      setEventMetadata("VALID_BARPREMTR","{handler:'valid_Barpremtr',iparms:[]");
      setEventMetadata("VALID_BARPREMTR",",oparms:[]}");
      setEventMetadata("VALID_BARSIT","{handler:'valid_Barsit',iparms:[]");
      setEventMetadata("VALID_BARSIT",",oparms:[]}");
      setEventMetadata("VALID_ALBPROVAL","{handler:'valid_Albproval',iparms:[]");
      setEventMetadata("VALID_ALBPROVAL",",oparms:[]}");
      setEventMetadata("VALID_ALBPROESP","{handler:'valid_Albproesp',iparms:[]");
      setEventMetadata("VALID_ALBPROESP",",oparms:[]}");
      setEventMetadata("VALID_ALBPROREC","{handler:'valid_Albprorec',iparms:[]");
      setEventMetadata("VALID_ALBPROREC",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Baralbmtr',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_BARPIECOD","{handler:'valid_Barpiecod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A197BarPConTro',fld:'BARPCONTRO',pic:'ZZ9'}]");
      setEventMetadata("VALID_BARPIECOD",",oparms:[{av:'O197BarPConTro'},{av:'A197BarPConTro',fld:'BARPCONTRO',pic:'ZZ9'}]}");
      setEventMetadata("VALID_ALBPKILENT","{handler:'valid_Albpkilent',iparms:[]");
      setEventMetadata("VALID_ALBPKILENT",",oparms:[]}");
      setEventMetadata("VALID_ALBPMTRENT","{handler:'valid_Albpmtrent',iparms:[]");
      setEventMetadata("VALID_ALBPMTRENT",",oparms:[]}");
      setEventMetadata("VALID_BARPCONTRO","{handler:'valid_Barpcontro',iparms:[]");
      setEventMetadata("VALID_BARPCONTRO",",oparms:[]}");
      setEventMetadata("VALID_ALBPTROCOD","{handler:'valid_Albptrocod',iparms:[]");
      setEventMetadata("VALID_ALBPTROCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albptroanc',iparms:[]");
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
      pr_default.close(68);
      pr_default.close(48);
      pr_default.close(49);
      pr_default.close(31);
      pr_default.close(34);
      pr_default.close(33);
      pr_default.close(30);
      pr_default.close(32);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOGx_mode = "" ;
      Z396EmprCod = "" ;
      Z34AlbProfch = GXutil.nullDate() ;
      Z39AlbProPri = "" ;
      Z3093AlbDivTCod = "" ;
      Z7987AlbColCa = "" ;
      Z10837AlbTrnNc = "" ;
      Z1253EmprGuiRem = "" ;
      O39AlbProPri = "" ;
      Z130BarCodPar = "" ;
      Z2839AlbProVal = "" ;
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
      Z1262BarPreKgm = DecimalUtil.ZERO ;
      Z1264BarPreMtr = DecimalUtil.ZERO ;
      Z2396BarAlbObs = "" ;
      Z40AlbProRec = DecimalUtil.ZERO ;
      O1268BarAlbMtr = DecimalUtil.ZERO ;
      O1267BarAlbKgm = DecimalUtil.ZERO ;
      Z200BarPieCod = "" ;
      Z27AlbPKilEnt = DecimalUtil.ZERO ;
      Z1270AlbPMtrEnt = DecimalUtil.ZERO ;
      O1270AlbPMtrEnt = DecimalUtil.ZERO ;
      O27AlbPKilEnt = DecimalUtil.ZERO ;
      Z43AlbPTroMet = DecimalUtil.ZERO ;
      Z5303AlbPTroKil = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      AV33ContCod = "" ;
      A39AlbProPri = "" ;
      AV36Clictrl = "" ;
      AV38Otrocli = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A2839AlbProVal = "" ;
      AV41Pgmname = "" ;
      AV8UsurCod = "" ;
      AV12Station = "" ;
      AV35Texto_i = "" ;
      A1253EmprGuiRem = "" ;
      A200BarPieCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A3093AlbDivTCod = "" ;
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
      A34AlbProfch = GXutil.nullDate() ;
      A3109AlbDivAbr = "" ;
      A1244GuiRemCln = "" ;
      A841TrnNom = "" ;
      A7987AlbColCa = "" ;
      A10837AlbTrnNc = "" ;
      lblTitlehdrs_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode195 = "" ;
      B39AlbProPri = "" ;
      sStyleString = "" ;
      AV34clinom = "" ;
      AV40Utexta = DecimalUtil.ZERO ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode3 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A43AlbPTroMet = DecimalUtil.ZERO ;
      A5303AlbPTroKil = DecimalUtil.ZERO ;
      s1268BarAlbMtr = DecimalUtil.ZERO ;
      A1268BarAlbMtr = DecimalUtil.ZERO ;
      s1267BarAlbKgm = DecimalUtil.ZERO ;
      A1267BarAlbKgm = DecimalUtil.ZERO ;
      sMode197 = "" ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      T1270AlbPMtrEnt = DecimalUtil.ZERO ;
      T27AlbPKilEnt = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A2396BarAlbObs = "" ;
      T1268BarAlbMtr = DecimalUtil.ZERO ;
      T1267BarAlbKgm = DecimalUtil.ZERO ;
      Z407EmprNom = "" ;
      Z3109AlbDivAbr = "" ;
      Z1244GuiRemCln = "" ;
      T01L016_A407EmprNom = new String[] {""} ;
      T01L016_n407EmprNom = new boolean[] {false} ;
      T01L021_A252CliCod = new int[1] ;
      T01L021_n252CliCod = new boolean[] {false} ;
      T01L021_A266CliEnvLin = new byte[1] ;
      T01L021_A30AlbProCod = new long[1] ;
      T01L021_A407EmprNom = new String[] {""} ;
      T01L021_n407EmprNom = new boolean[] {false} ;
      T01L021_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01L021_A39AlbProPri = new String[] {""} ;
      T01L021_A1259AlbDomEnv = new byte[1] ;
      T01L021_n1259AlbDomEnv = new boolean[] {false} ;
      T01L021_A3109AlbDivAbr = new String[] {""} ;
      T01L021_n3109AlbDivAbr = new boolean[] {false} ;
      T01L021_A3093AlbDivTCod = new String[] {""} ;
      T01L021_n3093AlbDivTCod = new boolean[] {false} ;
      T01L021_A1244GuiRemCln = new String[] {""} ;
      T01L021_A3869AlbCliDes = new int[1] ;
      T01L021_A7987AlbColCa = new String[] {""} ;
      T01L021_A10837AlbTrnNc = new String[] {""} ;
      T01L021_A33AlbProEst = new byte[1] ;
      T01L021_A1782AlbProEso = new byte[1] ;
      T01L021_A1253EmprGuiRem = new String[] {""} ;
      T01L021_A1243GuiRemCli = new int[1] ;
      T01L021_A396EmprCod = new String[] {""} ;
      T01L021_A840TrnCod = new short[1] ;
      T01L021_A3108AlbDivCod = new byte[1] ;
      T01L021_n3108AlbDivCod = new boolean[] {false} ;
      T01L021_A1260BusDomEnv = new byte[1] ;
      T01L021_n1260BusDomEnv = new boolean[] {false} ;
      T01L017_A841TrnNom = new String[] {""} ;
      T01L017_n841TrnNom = new boolean[] {false} ;
      T01L018_A841TrnNom = new String[] {""} ;
      T01L018_n841TrnNom = new boolean[] {false} ;
      T01L020_A1260BusDomEnv = new byte[1] ;
      T01L020_n1260BusDomEnv = new boolean[] {false} ;
      T01L019_A3109AlbDivAbr = new String[] {""} ;
      T01L019_n3109AlbDivAbr = new boolean[] {false} ;
      T01L015_A1244GuiRemCln = new String[] {""} ;
      T01L022_A841TrnNom = new String[] {""} ;
      T01L022_n841TrnNom = new boolean[] {false} ;
      T01L023_A1260BusDomEnv = new byte[1] ;
      T01L023_n1260BusDomEnv = new boolean[] {false} ;
      T01L024_A3109AlbDivAbr = new String[] {""} ;
      T01L024_n3109AlbDivAbr = new boolean[] {false} ;
      T01L025_A1244GuiRemCln = new String[] {""} ;
      T01L026_A841TrnNom = new String[] {""} ;
      T01L026_n841TrnNom = new boolean[] {false} ;
      T01L027_A396EmprCod = new String[] {""} ;
      T01L027_A30AlbProCod = new long[1] ;
      T01L014_A30AlbProCod = new long[1] ;
      T01L014_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01L014_A39AlbProPri = new String[] {""} ;
      T01L014_A1259AlbDomEnv = new byte[1] ;
      T01L014_n1259AlbDomEnv = new boolean[] {false} ;
      T01L014_A3093AlbDivTCod = new String[] {""} ;
      T01L014_n3093AlbDivTCod = new boolean[] {false} ;
      T01L014_A3869AlbCliDes = new int[1] ;
      T01L014_A7987AlbColCa = new String[] {""} ;
      T01L014_A10837AlbTrnNc = new String[] {""} ;
      T01L014_A33AlbProEst = new byte[1] ;
      T01L014_A1782AlbProEso = new byte[1] ;
      T01L014_A1253EmprGuiRem = new String[] {""} ;
      T01L014_A1243GuiRemCli = new int[1] ;
      T01L014_A396EmprCod = new String[] {""} ;
      T01L014_A840TrnCod = new short[1] ;
      T01L014_A3108AlbDivCod = new byte[1] ;
      T01L014_n3108AlbDivCod = new boolean[] {false} ;
      T01L028_A396EmprCod = new String[] {""} ;
      T01L028_A30AlbProCod = new long[1] ;
      T01L029_A396EmprCod = new String[] {""} ;
      T01L029_A30AlbProCod = new long[1] ;
      T01L013_A30AlbProCod = new long[1] ;
      T01L013_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01L013_A39AlbProPri = new String[] {""} ;
      T01L013_A1259AlbDomEnv = new byte[1] ;
      T01L013_n1259AlbDomEnv = new boolean[] {false} ;
      T01L013_A3093AlbDivTCod = new String[] {""} ;
      T01L013_n3093AlbDivTCod = new boolean[] {false} ;
      T01L013_A3869AlbCliDes = new int[1] ;
      T01L013_A7987AlbColCa = new String[] {""} ;
      T01L013_A10837AlbTrnNc = new String[] {""} ;
      T01L013_A33AlbProEst = new byte[1] ;
      T01L013_A1782AlbProEso = new byte[1] ;
      T01L013_A1253EmprGuiRem = new String[] {""} ;
      T01L013_A1243GuiRemCli = new int[1] ;
      T01L013_A396EmprCod = new String[] {""} ;
      T01L013_A840TrnCod = new short[1] ;
      T01L013_A3108AlbDivCod = new byte[1] ;
      T01L013_n3108AlbDivCod = new boolean[] {false} ;
      T01L033_A3109AlbDivAbr = new String[] {""} ;
      T01L033_n3109AlbDivAbr = new boolean[] {false} ;
      T01L034_A1244GuiRemCln = new String[] {""} ;
      T01L035_A1260BusDomEnv = new byte[1] ;
      T01L035_n1260BusDomEnv = new boolean[] {false} ;
      T01L036_A841TrnNom = new String[] {""} ;
      T01L036_n841TrnNom = new boolean[] {false} ;
      T01L037_A841TrnNom = new String[] {""} ;
      T01L037_n841TrnNom = new boolean[] {false} ;
      T01L038_A396EmprCod = new String[] {""} ;
      T01L038_A30AlbProCod = new long[1] ;
      T01L038_A12185DltLinObs = new byte[1] ;
      T01L039_A396EmprCod = new String[] {""} ;
      T01L039_A30AlbProCod = new long[1] ;
      T01L039_A12176DltHdr = new int[1] ;
      T01L039_A12177DltR = new byte[1] ;
      T01L039_A12178DltP = new String[] {""} ;
      T01L040_A396EmprCod = new String[] {""} ;
      T01L040_A30AlbProCod = new long[1] ;
      T01L040_A7540Alb_NFisca = new String[] {""} ;
      T01L041_A396EmprCod = new String[] {""} ;
      T01L041_A30AlbProCod = new long[1] ;
      T01L041_A129BarCod = new int[1] ;
      T01L041_A132BarCodReo = new byte[1] ;
      T01L041_A130BarCodPar = new String[] {""} ;
      T01L042_A396EmprCod = new String[] {""} ;
      T01L042_A30AlbProCod = new long[1] ;
      T01L042_A915AlbPObsLin = new byte[1] ;
      T01L043_A396EmprCod = new String[] {""} ;
      T01L043_A30AlbProCod = new long[1] ;
      Z1267BarAlbKgm = DecimalUtil.ZERO ;
      Z1268BarAlbMtr = DecimalUtil.ZERO ;
      T01L045_A30AlbProCod = new long[1] ;
      T01L045_A2839AlbProVal = new String[] {""} ;
      T01L045_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L045_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L045_A1265BarAlbPie = new int[1] ;
      T01L045_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L045_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L045_A213BarSit = new byte[1] ;
      T01L045_A2396BarAlbObs = new String[] {""} ;
      T01L045_A32AlbProEsp = new byte[1] ;
      T01L045_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L045_A396EmprCod = new String[] {""} ;
      T01L045_A129BarCod = new int[1] ;
      T01L045_A132BarCodReo = new byte[1] ;
      T01L045_A130BarCodPar = new String[] {""} ;
      T01L045_A252CliCod = new int[1] ;
      T01L045_n252CliCod = new boolean[] {false} ;
      T01L045_A1267BarAlbKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L045_A1268BarAlbMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L010_A213BarSit = new byte[1] ;
      T01L010_A252CliCod = new int[1] ;
      T01L010_n252CliCod = new boolean[] {false} ;
      T01L012_A1267BarAlbKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L012_A1268BarAlbMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L046_A213BarSit = new byte[1] ;
      T01L046_A252CliCod = new int[1] ;
      T01L046_n252CliCod = new boolean[] {false} ;
      T01L048_A1267BarAlbKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L048_A1268BarAlbMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L049_A396EmprCod = new String[] {""} ;
      T01L049_A30AlbProCod = new long[1] ;
      T01L049_A129BarCod = new int[1] ;
      T01L049_A132BarCodReo = new byte[1] ;
      T01L049_A130BarCodPar = new String[] {""} ;
      T01L09_A30AlbProCod = new long[1] ;
      T01L09_A2839AlbProVal = new String[] {""} ;
      T01L09_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L09_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L09_A1265BarAlbPie = new int[1] ;
      T01L09_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L09_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L09_A2396BarAlbObs = new String[] {""} ;
      T01L09_A32AlbProEsp = new byte[1] ;
      T01L09_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L09_A396EmprCod = new String[] {""} ;
      T01L09_A129BarCod = new int[1] ;
      T01L09_A132BarCodReo = new byte[1] ;
      T01L09_A130BarCodPar = new String[] {""} ;
      T01L08_A30AlbProCod = new long[1] ;
      T01L08_A2839AlbProVal = new String[] {""} ;
      T01L08_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L08_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L08_A1265BarAlbPie = new int[1] ;
      T01L08_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L08_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L08_A2396BarAlbObs = new String[] {""} ;
      T01L08_A32AlbProEsp = new byte[1] ;
      T01L08_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L08_A396EmprCod = new String[] {""} ;
      T01L08_A129BarCod = new int[1] ;
      T01L08_A132BarCodReo = new byte[1] ;
      T01L08_A130BarCodPar = new String[] {""} ;
      T01L053_A213BarSit = new byte[1] ;
      T01L053_A252CliCod = new int[1] ;
      T01L053_n252CliCod = new boolean[] {false} ;
      T01L055_A1267BarAlbKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L055_A1268BarAlbMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L056_A396EmprCod = new String[] {""} ;
      T01L056_A30AlbProCod = new long[1] ;
      T01L056_A129BarCod = new int[1] ;
      T01L056_A132BarCodReo = new byte[1] ;
      T01L056_A130BarCodPar = new String[] {""} ;
      T01L056_A6648AlbMetLin = new short[1] ;
      T01L057_A396EmprCod = new String[] {""} ;
      T01L057_A30AlbProCod = new long[1] ;
      T01L057_A129BarCod = new int[1] ;
      T01L057_A132BarCodReo = new byte[1] ;
      T01L057_A130BarCodPar = new String[] {""} ;
      T01L057_A9639Et_Numero = new short[1] ;
      T01L058_A396EmprCod = new String[] {""} ;
      T01L058_A30AlbProCod = new long[1] ;
      T01L058_A129BarCod = new int[1] ;
      T01L058_A132BarCodReo = new byte[1] ;
      T01L058_A130BarCodPar = new String[] {""} ;
      T01L058_A6622AlbHdRLn = new short[1] ;
      T01L059_A396EmprCod = new String[] {""} ;
      T01L059_A30AlbProCod = new long[1] ;
      T01L059_A129BarCod = new int[1] ;
      T01L059_A132BarCodReo = new byte[1] ;
      T01L059_A130BarCodPar = new String[] {""} ;
      T01L059_A5456P_ForLin = new short[1] ;
      T01L060_A396EmprCod = new String[] {""} ;
      T01L060_A30AlbProCod = new long[1] ;
      T01L060_A129BarCod = new int[1] ;
      T01L060_A132BarCodReo = new byte[1] ;
      T01L060_A130BarCodPar = new String[] {""} ;
      T01L060_A2524DisComLin = new byte[1] ;
      T01L060_A1056DisComCod = new String[] {""} ;
      T01L060_A1032FonCod = new String[] {""} ;
      T01L061_A396EmprCod = new String[] {""} ;
      T01L061_A3617AlbTrnCod = new long[1] ;
      T01L061_A30AlbProCod = new long[1] ;
      T01L061_A129BarCod = new int[1] ;
      T01L061_A132BarCodReo = new byte[1] ;
      T01L061_A130BarCodPar = new String[] {""} ;
      T01L062_A396EmprCod = new String[] {""} ;
      T01L062_A30AlbProCod = new long[1] ;
      T01L062_A129BarCod = new int[1] ;
      T01L062_A132BarCodReo = new byte[1] ;
      T01L062_A130BarCodPar = new String[] {""} ;
      T01L062_A3621AlbPckLin = new short[1] ;
      T01L063_A396EmprCod = new String[] {""} ;
      T01L063_A30AlbProCod = new long[1] ;
      T01L063_A129BarCod = new int[1] ;
      T01L063_A132BarCodReo = new byte[1] ;
      T01L063_A130BarCodPar = new String[] {""} ;
      T01L063_A2764AlbHdrLin = new short[1] ;
      T01L064_A396EmprCod = new String[] {""} ;
      T01L064_A30AlbProCod = new long[1] ;
      T01L064_A129BarCod = new int[1] ;
      T01L064_A132BarCodReo = new byte[1] ;
      T01L064_A130BarCodPar = new String[] {""} ;
      T01L064_A1468AlbPrdLin = new short[1] ;
      T01L065_A396EmprCod = new String[] {""} ;
      T01L065_A30AlbProCod = new long[1] ;
      T01L065_A129BarCod = new int[1] ;
      T01L065_A132BarCodReo = new byte[1] ;
      T01L065_A130BarCodPar = new String[] {""} ;
      T01L065_A200BarPieCod = new String[] {""} ;
      T01L066_A396EmprCod = new String[] {""} ;
      T01L066_A30AlbProCod = new long[1] ;
      T01L066_A129BarCod = new int[1] ;
      T01L066_A132BarCodReo = new byte[1] ;
      T01L066_A130BarCodPar = new String[] {""} ;
      T01L066_A1240GuiFasLin = new short[1] ;
      T01L067_A396EmprCod = new String[] {""} ;
      T01L067_A30AlbProCod = new long[1] ;
      T01L067_A129BarCod = new int[1] ;
      T01L067_A132BarCodReo = new byte[1] ;
      T01L067_A130BarCodPar = new String[] {""} ;
      T01L068_A30AlbProCod = new long[1] ;
      T01L068_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L068_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L068_A197BarPConTro = new short[1] ;
      T01L068_A396EmprCod = new String[] {""} ;
      T01L068_A129BarCod = new int[1] ;
      T01L068_A132BarCodReo = new byte[1] ;
      T01L068_A130BarCodPar = new String[] {""} ;
      T01L068_A200BarPieCod = new String[] {""} ;
      T01L07_A197BarPConTro = new short[1] ;
      T01L069_A396EmprCod = new String[] {""} ;
      T01L069_A30AlbProCod = new long[1] ;
      T01L069_A129BarCod = new int[1] ;
      T01L069_A132BarCodReo = new byte[1] ;
      T01L069_A130BarCodPar = new String[] {""} ;
      T01L069_A200BarPieCod = new String[] {""} ;
      T01L05_A30AlbProCod = new long[1] ;
      T01L05_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L05_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L05_A396EmprCod = new String[] {""} ;
      T01L05_A129BarCod = new int[1] ;
      T01L05_A132BarCodReo = new byte[1] ;
      T01L05_A130BarCodPar = new String[] {""} ;
      T01L05_A200BarPieCod = new String[] {""} ;
      T01L04_A30AlbProCod = new long[1] ;
      T01L04_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L04_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L04_A396EmprCod = new String[] {""} ;
      T01L04_A129BarCod = new int[1] ;
      T01L04_A132BarCodReo = new byte[1] ;
      T01L04_A130BarCodPar = new String[] {""} ;
      T01L04_A200BarPieCod = new String[] {""} ;
      T01L070_A197BarPConTro = new short[1] ;
      T01L074_A197BarPConTro = new short[1] ;
      T01L075_A396EmprCod = new String[] {""} ;
      T01L075_A30AlbProCod = new long[1] ;
      T01L075_A129BarCod = new int[1] ;
      T01L075_A132BarCodReo = new byte[1] ;
      T01L075_A130BarCodPar = new String[] {""} ;
      T01L075_A2524DisComLin = new byte[1] ;
      T01L075_A1056DisComCod = new String[] {""} ;
      T01L075_A1032FonCod = new String[] {""} ;
      T01L075_A200BarPieCod = new String[] {""} ;
      T01L077_A396EmprCod = new String[] {""} ;
      T01L077_A30AlbProCod = new long[1] ;
      T01L077_A129BarCod = new int[1] ;
      T01L077_A132BarCodReo = new byte[1] ;
      T01L077_A130BarCodPar = new String[] {""} ;
      T01L077_A200BarPieCod = new String[] {""} ;
      T01L078_A30AlbProCod = new long[1] ;
      T01L078_A129BarCod = new int[1] ;
      T01L078_A132BarCodReo = new byte[1] ;
      T01L078_A130BarCodPar = new String[] {""} ;
      T01L078_A200BarPieCod = new String[] {""} ;
      T01L078_A42AlbPTroCod = new short[1] ;
      T01L078_A43AlbPTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L078_A5303AlbPTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L078_A3118AlbPTroAnc = new short[1] ;
      T01L078_A396EmprCod = new String[] {""} ;
      T01L079_A396EmprCod = new String[] {""} ;
      T01L079_A30AlbProCod = new long[1] ;
      T01L079_A129BarCod = new int[1] ;
      T01L079_A132BarCodReo = new byte[1] ;
      T01L079_A130BarCodPar = new String[] {""} ;
      T01L079_A200BarPieCod = new String[] {""} ;
      T01L079_A42AlbPTroCod = new short[1] ;
      T01L03_A30AlbProCod = new long[1] ;
      T01L03_A129BarCod = new int[1] ;
      T01L03_A132BarCodReo = new byte[1] ;
      T01L03_A130BarCodPar = new String[] {""} ;
      T01L03_A200BarPieCod = new String[] {""} ;
      T01L03_A42AlbPTroCod = new short[1] ;
      T01L03_A43AlbPTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L03_A5303AlbPTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L03_A3118AlbPTroAnc = new short[1] ;
      T01L03_A396EmprCod = new String[] {""} ;
      sMode198 = "" ;
      T01L02_A30AlbProCod = new long[1] ;
      T01L02_A129BarCod = new int[1] ;
      T01L02_A132BarCodReo = new byte[1] ;
      T01L02_A130BarCodPar = new String[] {""} ;
      T01L02_A200BarPieCod = new String[] {""} ;
      T01L02_A42AlbPTroCod = new short[1] ;
      T01L02_A43AlbPTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L02_A5303AlbPTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L02_A3118AlbPTroAnc = new short[1] ;
      T01L02_A396EmprCod = new String[] {""} ;
      T01L083_A396EmprCod = new String[] {""} ;
      T01L083_A30AlbProCod = new long[1] ;
      T01L083_A129BarCod = new int[1] ;
      T01L083_A132BarCodReo = new byte[1] ;
      T01L083_A130BarCodPar = new String[] {""} ;
      T01L083_A200BarPieCod = new String[] {""} ;
      T01L083_A42AlbPTroCod = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      lblTitlepiezas_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      B1268BarAlbMtr = DecimalUtil.ZERO ;
      B1267BarAlbKgm = DecimalUtil.ZERO ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      lblTitletrozos_Jsonclick = "" ;
      Gridttrn05_hdrs_piezas_trozosContainer = new com.genexus.webpanels.GXWebGrid(context);
      B1270AlbPMtrEnt = DecimalUtil.ZERO ;
      B27AlbPKilEnt = DecimalUtil.ZERO ;
      Gridttrn05_hdrs_piezas_trozosRow = new com.genexus.webpanels.GXWebRow();
      subGridttrn05_hdrs_piezas_trozos_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i34AlbProfch = GXutil.nullDate() ;
      i39AlbProPri = "" ;
      i2839AlbProVal = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      subGrid2_Header = "" ;
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      Gridttrn05_hdrs_piezas_trozosColumn = new com.genexus.webpanels.GXWebColumn();
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int5 = new byte[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_int4 = new long[1] ;
      GXv_int8 = new byte[1] ;
      ZV33ContCod = "" ;
      ZV36Clictrl = "" ;
      Z841TrnNom = "" ;
      GXv_char3 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char1 = new String[1] ;
      ZV34clinom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrn05__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrn05__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrn05__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrn05__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn05__default(),
         new Object[] {
             new Object[] {
            T01L02_A30AlbProCod, T01L02_A129BarCod, T01L02_A132BarCodReo, T01L02_A130BarCodPar, T01L02_A200BarPieCod, T01L02_A42AlbPTroCod, T01L02_A43AlbPTroMet, T01L02_A5303AlbPTroKil, T01L02_A3118AlbPTroAnc, T01L02_A396EmprCod
            }
            , new Object[] {
            T01L03_A30AlbProCod, T01L03_A129BarCod, T01L03_A132BarCodReo, T01L03_A130BarCodPar, T01L03_A200BarPieCod, T01L03_A42AlbPTroCod, T01L03_A43AlbPTroMet, T01L03_A5303AlbPTroKil, T01L03_A3118AlbPTroAnc, T01L03_A396EmprCod
            }
            , new Object[] {
            T01L04_A30AlbProCod, T01L04_A27AlbPKilEnt, T01L04_A1270AlbPMtrEnt, T01L04_A396EmprCod, T01L04_A129BarCod, T01L04_A132BarCodReo, T01L04_A130BarCodPar, T01L04_A200BarPieCod
            }
            , new Object[] {
            T01L05_A30AlbProCod, T01L05_A27AlbPKilEnt, T01L05_A1270AlbPMtrEnt, T01L05_A396EmprCod, T01L05_A129BarCod, T01L05_A132BarCodReo, T01L05_A130BarCodPar, T01L05_A200BarPieCod
            }
            , new Object[] {
            T01L06_A197BarPConTro
            }
            , new Object[] {
            T01L07_A197BarPConTro
            }
            , new Object[] {
            T01L08_A30AlbProCod, T01L08_A2839AlbProVal, T01L08_A1261BarAlbKgmE, T01L08_A1263BarAlbMtrE, T01L08_A1265BarAlbPie, T01L08_A1262BarPreKgm, T01L08_A1264BarPreMtr, T01L08_A2396BarAlbObs, T01L08_A32AlbProEsp, T01L08_A40AlbProRec,
            T01L08_A396EmprCod, T01L08_A129BarCod, T01L08_A132BarCodReo, T01L08_A130BarCodPar
            }
            , new Object[] {
            T01L09_A30AlbProCod, T01L09_A2839AlbProVal, T01L09_A1261BarAlbKgmE, T01L09_A1263BarAlbMtrE, T01L09_A1265BarAlbPie, T01L09_A1262BarPreKgm, T01L09_A1264BarPreMtr, T01L09_A2396BarAlbObs, T01L09_A32AlbProEsp, T01L09_A40AlbProRec,
            T01L09_A396EmprCod, T01L09_A129BarCod, T01L09_A132BarCodReo, T01L09_A130BarCodPar
            }
            , new Object[] {
            T01L010_A213BarSit, T01L010_A252CliCod, T01L010_n252CliCod
            }
            , new Object[] {
            T01L012_A1267BarAlbKgm, T01L012_A1268BarAlbMtr
            }
            , new Object[] {
            T01L013_A30AlbProCod, T01L013_A34AlbProfch, T01L013_A39AlbProPri, T01L013_A1259AlbDomEnv, T01L013_n1259AlbDomEnv, T01L013_A3093AlbDivTCod, T01L013_n3093AlbDivTCod, T01L013_A3869AlbCliDes, T01L013_A7987AlbColCa, T01L013_A10837AlbTrnNc,
            T01L013_A33AlbProEst, T01L013_A1782AlbProEso, T01L013_A1253EmprGuiRem, T01L013_A1243GuiRemCli, T01L013_A396EmprCod, T01L013_A840TrnCod, T01L013_A3108AlbDivCod, T01L013_n3108AlbDivCod
            }
            , new Object[] {
            T01L014_A30AlbProCod, T01L014_A34AlbProfch, T01L014_A39AlbProPri, T01L014_A1259AlbDomEnv, T01L014_n1259AlbDomEnv, T01L014_A3093AlbDivTCod, T01L014_n3093AlbDivTCod, T01L014_A3869AlbCliDes, T01L014_A7987AlbColCa, T01L014_A10837AlbTrnNc,
            T01L014_A33AlbProEst, T01L014_A1782AlbProEso, T01L014_A1253EmprGuiRem, T01L014_A1243GuiRemCli, T01L014_A396EmprCod, T01L014_A840TrnCod, T01L014_A3108AlbDivCod, T01L014_n3108AlbDivCod
            }
            , new Object[] {
            T01L015_A1244GuiRemCln
            }
            , new Object[] {
            T01L016_A407EmprNom, T01L016_n407EmprNom
            }
            , new Object[] {
            T01L017_A841TrnNom, T01L017_n841TrnNom
            }
            , new Object[] {
            T01L018_A841TrnNom, T01L018_n841TrnNom
            }
            , new Object[] {
            T01L019_A3109AlbDivAbr, T01L019_n3109AlbDivAbr
            }
            , new Object[] {
            T01L020_A1260BusDomEnv, T01L020_n1260BusDomEnv
            }
            , new Object[] {
            T01L021_A252CliCod, T01L021_A266CliEnvLin, T01L021_A30AlbProCod, T01L021_A407EmprNom, T01L021_n407EmprNom, T01L021_A34AlbProfch, T01L021_A39AlbProPri, T01L021_A1259AlbDomEnv, T01L021_n1259AlbDomEnv, T01L021_A3109AlbDivAbr,
            T01L021_n3109AlbDivAbr, T01L021_A3093AlbDivTCod, T01L021_n3093AlbDivTCod, T01L021_A1244GuiRemCln, T01L021_A3869AlbCliDes, T01L021_A7987AlbColCa, T01L021_A10837AlbTrnNc, T01L021_A33AlbProEst, T01L021_A1782AlbProEso, T01L021_A1253EmprGuiRem,
            T01L021_A1243GuiRemCli, T01L021_A396EmprCod, T01L021_A840TrnCod, T01L021_A3108AlbDivCod, T01L021_n3108AlbDivCod, T01L021_A1260BusDomEnv, T01L021_n1260BusDomEnv
            }
            , new Object[] {
            T01L022_A841TrnNom, T01L022_n841TrnNom
            }
            , new Object[] {
            T01L023_A1260BusDomEnv, T01L023_n1260BusDomEnv
            }
            , new Object[] {
            T01L024_A3109AlbDivAbr, T01L024_n3109AlbDivAbr
            }
            , new Object[] {
            T01L025_A1244GuiRemCln
            }
            , new Object[] {
            T01L026_A841TrnNom, T01L026_n841TrnNom
            }
            , new Object[] {
            T01L027_A396EmprCod, T01L027_A30AlbProCod
            }
            , new Object[] {
            T01L028_A396EmprCod, T01L028_A30AlbProCod
            }
            , new Object[] {
            T01L029_A396EmprCod, T01L029_A30AlbProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01L033_A3109AlbDivAbr, T01L033_n3109AlbDivAbr
            }
            , new Object[] {
            T01L034_A1244GuiRemCln
            }
            , new Object[] {
            T01L035_A1260BusDomEnv, T01L035_n1260BusDomEnv
            }
            , new Object[] {
            T01L036_A841TrnNom, T01L036_n841TrnNom
            }
            , new Object[] {
            T01L037_A841TrnNom, T01L037_n841TrnNom
            }
            , new Object[] {
            T01L038_A396EmprCod, T01L038_A30AlbProCod, T01L038_A12185DltLinObs
            }
            , new Object[] {
            T01L039_A396EmprCod, T01L039_A30AlbProCod, T01L039_A12176DltHdr, T01L039_A12177DltR, T01L039_A12178DltP
            }
            , new Object[] {
            T01L040_A396EmprCod, T01L040_A30AlbProCod, T01L040_A7540Alb_NFisca
            }
            , new Object[] {
            T01L041_A396EmprCod, T01L041_A30AlbProCod, T01L041_A129BarCod, T01L041_A132BarCodReo, T01L041_A130BarCodPar
            }
            , new Object[] {
            T01L042_A396EmprCod, T01L042_A30AlbProCod, T01L042_A915AlbPObsLin
            }
            , new Object[] {
            T01L043_A396EmprCod, T01L043_A30AlbProCod
            }
            , new Object[] {
            T01L045_A30AlbProCod, T01L045_A2839AlbProVal, T01L045_A1261BarAlbKgmE, T01L045_A1263BarAlbMtrE, T01L045_A1265BarAlbPie, T01L045_A1262BarPreKgm, T01L045_A1264BarPreMtr, T01L045_A213BarSit, T01L045_A2396BarAlbObs, T01L045_A32AlbProEsp,
            T01L045_A40AlbProRec, T01L045_A396EmprCod, T01L045_A129BarCod, T01L045_A132BarCodReo, T01L045_A130BarCodPar, T01L045_A252CliCod, T01L045_n252CliCod, T01L045_A1267BarAlbKgm, T01L045_A1268BarAlbMtr
            }
            , new Object[] {
            T01L046_A213BarSit, T01L046_A252CliCod, T01L046_n252CliCod
            }
            , new Object[] {
            T01L048_A1267BarAlbKgm, T01L048_A1268BarAlbMtr
            }
            , new Object[] {
            T01L049_A396EmprCod, T01L049_A30AlbProCod, T01L049_A129BarCod, T01L049_A132BarCodReo, T01L049_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01L053_A213BarSit, T01L053_A252CliCod, T01L053_n252CliCod
            }
            , new Object[] {
            T01L055_A1267BarAlbKgm, T01L055_A1268BarAlbMtr
            }
            , new Object[] {
            T01L056_A396EmprCod, T01L056_A30AlbProCod, T01L056_A129BarCod, T01L056_A132BarCodReo, T01L056_A130BarCodPar, T01L056_A6648AlbMetLin
            }
            , new Object[] {
            T01L057_A396EmprCod, T01L057_A30AlbProCod, T01L057_A129BarCod, T01L057_A132BarCodReo, T01L057_A130BarCodPar, T01L057_A9639Et_Numero
            }
            , new Object[] {
            T01L058_A396EmprCod, T01L058_A30AlbProCod, T01L058_A129BarCod, T01L058_A132BarCodReo, T01L058_A130BarCodPar, T01L058_A6622AlbHdRLn
            }
            , new Object[] {
            T01L059_A396EmprCod, T01L059_A30AlbProCod, T01L059_A129BarCod, T01L059_A132BarCodReo, T01L059_A130BarCodPar, T01L059_A5456P_ForLin
            }
            , new Object[] {
            T01L060_A396EmprCod, T01L060_A30AlbProCod, T01L060_A129BarCod, T01L060_A132BarCodReo, T01L060_A130BarCodPar, T01L060_A2524DisComLin, T01L060_A1056DisComCod, T01L060_A1032FonCod
            }
            , new Object[] {
            T01L061_A396EmprCod, T01L061_A3617AlbTrnCod, T01L061_A30AlbProCod, T01L061_A129BarCod, T01L061_A132BarCodReo, T01L061_A130BarCodPar
            }
            , new Object[] {
            T01L062_A396EmprCod, T01L062_A30AlbProCod, T01L062_A129BarCod, T01L062_A132BarCodReo, T01L062_A130BarCodPar, T01L062_A3621AlbPckLin
            }
            , new Object[] {
            T01L063_A396EmprCod, T01L063_A30AlbProCod, T01L063_A129BarCod, T01L063_A132BarCodReo, T01L063_A130BarCodPar, T01L063_A2764AlbHdrLin
            }
            , new Object[] {
            T01L064_A396EmprCod, T01L064_A30AlbProCod, T01L064_A129BarCod, T01L064_A132BarCodReo, T01L064_A130BarCodPar, T01L064_A1468AlbPrdLin
            }
            , new Object[] {
            T01L065_A396EmprCod, T01L065_A30AlbProCod, T01L065_A129BarCod, T01L065_A132BarCodReo, T01L065_A130BarCodPar, T01L065_A200BarPieCod
            }
            , new Object[] {
            T01L066_A396EmprCod, T01L066_A30AlbProCod, T01L066_A129BarCod, T01L066_A132BarCodReo, T01L066_A130BarCodPar, T01L066_A1240GuiFasLin
            }
            , new Object[] {
            T01L067_A396EmprCod, T01L067_A30AlbProCod, T01L067_A129BarCod, T01L067_A132BarCodReo, T01L067_A130BarCodPar
            }
            , new Object[] {
            T01L068_A30AlbProCod, T01L068_A27AlbPKilEnt, T01L068_A1270AlbPMtrEnt, T01L068_A197BarPConTro, T01L068_A396EmprCod, T01L068_A129BarCod, T01L068_A132BarCodReo, T01L068_A130BarCodPar, T01L068_A200BarPieCod
            }
            , new Object[] {
            T01L069_A396EmprCod, T01L069_A30AlbProCod, T01L069_A129BarCod, T01L069_A132BarCodReo, T01L069_A130BarCodPar, T01L069_A200BarPieCod
            }
            , new Object[] {
            T01L070_A197BarPConTro
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01L074_A197BarPConTro
            }
            , new Object[] {
            T01L075_A396EmprCod, T01L075_A30AlbProCod, T01L075_A129BarCod, T01L075_A132BarCodReo, T01L075_A130BarCodPar, T01L075_A2524DisComLin, T01L075_A1056DisComCod, T01L075_A1032FonCod, T01L075_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01L077_A396EmprCod, T01L077_A30AlbProCod, T01L077_A129BarCod, T01L077_A132BarCodReo, T01L077_A130BarCodPar, T01L077_A200BarPieCod
            }
            , new Object[] {
            T01L078_A30AlbProCod, T01L078_A129BarCod, T01L078_A132BarCodReo, T01L078_A130BarCodPar, T01L078_A200BarPieCod, T01L078_A42AlbPTroCod, T01L078_A43AlbPTroMet, T01L078_A5303AlbPTroKil, T01L078_A3118AlbPTroAnc, T01L078_A396EmprCod
            }
            , new Object[] {
            T01L079_A396EmprCod, T01L079_A30AlbProCod, T01L079_A129BarCod, T01L079_A132BarCodReo, T01L079_A130BarCodPar, T01L079_A200BarPieCod, T01L079_A42AlbPTroCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01L083_A396EmprCod, T01L083_A30AlbProCod, T01L083_A129BarCod, T01L083_A132BarCodReo, T01L083_A130BarCodPar, T01L083_A200BarPieCod, T01L083_A42AlbPTroCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV41Pgmname = "TTrn05" ;
      Z2839AlbProVal = httpContext.getMessage( "S", "") ;
      i2839AlbProVal = httpContext.getMessage( "S", "") ;
      A2839AlbProVal = httpContext.getMessage( "S", "") ;
      Z39AlbProPri = "1" ;
      O39AlbProPri = "1" ;
      i39AlbProPri = "1" ;
      A39AlbProPri = "1" ;
      Z34AlbProfch = GXutil.today( ) ;
      A34AlbProfch = GXutil.today( ) ;
      i34AlbProfch = GXutil.today( ) ;
   }

   private byte Z1259AlbDomEnv ;
   private byte Z33AlbProEst ;
   private byte Z1782AlbProEso ;
   private byte Z3108AlbDivCod ;
   private byte Z132BarCodReo ;
   private byte Z32AlbProEsp ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte A32AlbProEsp ;
   private byte A1259AlbDomEnv ;
   private byte A3108AlbDivCod ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A33AlbProEst ;
   private byte A1782AlbProEso ;
   private byte A1260BusDomEnv ;
   private byte A213BarSit ;
   private byte Z1260BusDomEnv ;
   private byte Z213BarSit ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte subGridttrn05_hdrs_piezas_trozos_Backcolorstyle ;
   private byte subGridttrn05_hdrs_piezas_trozos_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte subGridttrn05_hdrs_piezas_trozos_Allowselection ;
   private byte subGridttrn05_hdrs_piezas_trozos_Allowhovering ;
   private byte subGridttrn05_hdrs_piezas_trozos_Allowcollapsing ;
   private byte subGridttrn05_hdrs_piezas_trozos_Collapsed ;
   private byte GXv_int5[] ;
   private byte GXv_int8[] ;
   private short Z840TrnCod ;
   private short nRcdDeleted_195 ;
   private short nRcdExists_195 ;
   private short nIsMod_195 ;
   private short Z197BarPConTro ;
   private short O197BarPConTro ;
   private short nRcdDeleted_197 ;
   private short nRcdExists_197 ;
   private short nIsMod_197 ;
   private short Z42AlbPTroCod ;
   private short Z3118AlbPTroAnc ;
   private short nRcdDeleted_198 ;
   private short nRcdExists_198 ;
   private short nIsMod_198 ;
   private short A840TrnCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A197BarPConTro ;
   private short nBlankRcdCount195 ;
   private short RcdFound195 ;
   private short nBlankRcdUsr195 ;
   private short RcdFound3 ;
   private short s197BarPConTro ;
   private short RcdFound198 ;
   private short A42AlbPTroCod ;
   private short A3118AlbPTroAnc ;
   private short RcdFound197 ;
   private short T197BarPConTro ;
   private short nIsDirty_3 ;
   private short nIsDirty_195 ;
   private short nIsDirty_197 ;
   private short nIsDirty_198 ;
   private short nBlankRcdCount197 ;
   private short nBlankRcdUsr197 ;
   private short nBlankRcdCount198 ;
   private short B197BarPConTro ;
   private short nBlankRcdUsr198 ;
   private short i197BarPConTro ;
   private short ZO197BarPConTro ;
   private int Z3869AlbCliDes ;
   private int Z1243GuiRemCli ;
   private int nRC_GXsfl_138 ;
   private int nGXsfl_138_idx=1 ;
   private int Z129BarCod ;
   private int Z1265BarAlbPie ;
   private int nRC_GXsfl_231 ;
   private int nGXsfl_231_idx=1 ;
   private int nRC_GXsfl_264 ;
   private int nGXsfl_264_idx=1 ;
   private int A3869AlbCliDes ;
   private int A1243GuiRemCli ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtAlbProCod_Enabled ;
   private int edtAlbProfch_Enabled ;
   private int edtAlbProPri_Enabled ;
   private int edtAlbDomEnv_Enabled ;
   private int edtAlbDivCod_Enabled ;
   private int edtAlbDivAbr_Enabled ;
   private int edtEmprGuiRem_Enabled ;
   private int edtGuiRemCli_Enabled ;
   private int edtGuiRemCln_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtTrnNom_Enabled ;
   private int edtAlbCliDes_Enabled ;
   private int edtAlbColCa_Enabled ;
   private int edtAlbTrnNc_Enabled ;
   private int edtAlbProEst_Enabled ;
   private int edtAlbProEso_Enabled ;
   private int edtBusDomEnv_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarAlbKgmE_Enabled ;
   private int edtBarAlbMtrE_Enabled ;
   private int edtBarAlbPie_Enabled ;
   private int edtBarPreKgm_Enabled ;
   private int edtBarPreMtr_Enabled ;
   private int edtBarSit_Enabled ;
   private int edtBarAlbObs_Enabled ;
   private int edtAlbProEsp_Enabled ;
   private int edtAlbProRec_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtBarAlbKgm_Enabled ;
   private int edtBarAlbMtr_Enabled ;
   private int fRowAdded ;
   private int edtAlbPTroCod_Enabled ;
   private int edtAlbPTroMet_Enabled ;
   private int edtAlbPTroKil_Enabled ;
   private int edtAlbPTroAnc_Enabled ;
   private int edtBarPieCod_Enabled ;
   private int edtAlbPKilEnt_Enabled ;
   private int edtAlbPMtrEnt_Enabled ;
   private int edtBarPConTro_Enabled ;
   private int A1265BarAlbPie ;
   private int A252CliCod ;
   private int GX_JID ;
   private int Z252CliCod ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int GRID2_IsPaging ;
   private int subGridttrn05_hdrs_piezas_trozos_Backcolor ;
   private int subGridttrn05_hdrs_piezas_trozos_Allbackcolor ;
   private int defedtBarPConTro_Enabled ;
   private int defedtBarPieCod_Enabled ;
   private int defedtAlbPTroCod_Enabled ;
   private int defedtBarCodPar_Enabled ;
   private int defedtBarCodReo_Enabled ;
   private int defedtBarCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int subGridttrn05_hdrs_piezas_trozos_Selectedindex ;
   private int subGridttrn05_hdrs_piezas_trozos_Selectioncolor ;
   private int subGridttrn05_hdrs_piezas_trozos_Hoveringcolor ;
   private int GXv_int2[] ;
   private long wcpOAV32ALbprocod ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long AV32ALbprocod ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRIDTTRN05_HDRS_PIEZAS_TROZOS_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private long GRIDTTRN05_HDRS_PIEZAS_TROZOS_nCurrentRecord ;
   private long GXv_int4[] ;
   private java.math.BigDecimal Z1261BarAlbKgmE ;
   private java.math.BigDecimal Z1263BarAlbMtrE ;
   private java.math.BigDecimal Z1262BarPreKgm ;
   private java.math.BigDecimal Z1264BarPreMtr ;
   private java.math.BigDecimal Z40AlbProRec ;
   private java.math.BigDecimal O1268BarAlbMtr ;
   private java.math.BigDecimal O1267BarAlbKgm ;
   private java.math.BigDecimal Z27AlbPKilEnt ;
   private java.math.BigDecimal Z1270AlbPMtrEnt ;
   private java.math.BigDecimal O1270AlbPMtrEnt ;
   private java.math.BigDecimal O27AlbPKilEnt ;
   private java.math.BigDecimal Z43AlbPTroMet ;
   private java.math.BigDecimal Z5303AlbPTroKil ;
   private java.math.BigDecimal AV38Otrocli ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal AV40Utexta ;
   private java.math.BigDecimal A43AlbPTroMet ;
   private java.math.BigDecimal A5303AlbPTroKil ;
   private java.math.BigDecimal s1268BarAlbMtr ;
   private java.math.BigDecimal A1268BarAlbMtr ;
   private java.math.BigDecimal s1267BarAlbKgm ;
   private java.math.BigDecimal A1267BarAlbKgm ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private java.math.BigDecimal T1270AlbPMtrEnt ;
   private java.math.BigDecimal T27AlbPKilEnt ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal T1268BarAlbMtr ;
   private java.math.BigDecimal T1267BarAlbKgm ;
   private java.math.BigDecimal Z1267BarAlbKgm ;
   private java.math.BigDecimal Z1268BarAlbMtr ;
   private java.math.BigDecimal B1268BarAlbMtr ;
   private java.math.BigDecimal B1267BarAlbKgm ;
   private java.math.BigDecimal B1270AlbPMtrEnt ;
   private java.math.BigDecimal B27AlbPKilEnt ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOGx_mode ;
   private String Z396EmprCod ;
   private String Z39AlbProPri ;
   private String Z3093AlbDivTCod ;
   private String Z7987AlbColCa ;
   private String Z10837AlbTrnNc ;
   private String Z1253EmprGuiRem ;
   private String O39AlbProPri ;
   private String Z130BarCodPar ;
   private String Z2839AlbProVal ;
   private String Z2396BarAlbObs ;
   private String Z200BarPieCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String AV33ContCod ;
   private String A39AlbProPri ;
   private String AV36Clictrl ;
   private String A130BarCodPar ;
   private String A2839AlbProVal ;
   private String AV41Pgmname ;
   private String AV8UsurCod ;
   private String AV12Station ;
   private String A1253EmprGuiRem ;
   private String A200BarPieCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbProCod_Internalname ;
   private String sGXsfl_264_idx="0001" ;
   private String sGXsfl_231_idx="0001" ;
   private String sGXsfl_138_idx="0001" ;
   private String A3093AlbDivTCod ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtAlbProCod_Jsonclick ;
   private String edtAlbProfch_Internalname ;
   private String edtAlbProfch_Jsonclick ;
   private String edtAlbProPri_Internalname ;
   private String edtAlbProPri_Jsonclick ;
   private String edtAlbDomEnv_Internalname ;
   private String edtAlbDomEnv_Jsonclick ;
   private String edtAlbDivCod_Internalname ;
   private String edtAlbDivCod_Jsonclick ;
   private String edtAlbDivAbr_Internalname ;
   private String A3109AlbDivAbr ;
   private String edtAlbDivAbr_Jsonclick ;
   private String edtEmprGuiRem_Internalname ;
   private String edtEmprGuiRem_Jsonclick ;
   private String edtGuiRemCli_Internalname ;
   private String edtGuiRemCli_Jsonclick ;
   private String edtGuiRemCln_Internalname ;
   private String A1244GuiRemCln ;
   private String edtGuiRemCln_Jsonclick ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtTrnNom_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Jsonclick ;
   private String edtAlbCliDes_Internalname ;
   private String edtAlbCliDes_Jsonclick ;
   private String edtAlbColCa_Internalname ;
   private String A7987AlbColCa ;
   private String edtAlbColCa_Jsonclick ;
   private String edtAlbTrnNc_Internalname ;
   private String A10837AlbTrnNc ;
   private String edtAlbTrnNc_Jsonclick ;
   private String edtAlbProEst_Internalname ;
   private String edtAlbProEst_Jsonclick ;
   private String edtAlbProEso_Internalname ;
   private String edtAlbProEso_Jsonclick ;
   private String edtBusDomEnv_Internalname ;
   private String edtBusDomEnv_Jsonclick ;
   private String divHdrstable_Internalname ;
   private String lblTitlehdrs_Internalname ;
   private String lblTitlehdrs_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode195 ;
   private String B39AlbProPri ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodPar_Internalname ;
   private String edtBarAlbKgmE_Internalname ;
   private String edtBarAlbMtrE_Internalname ;
   private String edtBarAlbPie_Internalname ;
   private String edtBarPreKgm_Internalname ;
   private String edtBarPreMtr_Internalname ;
   private String edtBarSit_Internalname ;
   private String edtBarAlbObs_Internalname ;
   private String edtAlbProEsp_Internalname ;
   private String edtAlbProRec_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtBarAlbKgm_Internalname ;
   private String edtBarAlbMtr_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String AV34clinom ;
   private String hsh ;
   private String sMode3 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String edtAlbPTroCod_Internalname ;
   private String edtAlbPTroMet_Internalname ;
   private String edtAlbPTroKil_Internalname ;
   private String edtAlbPTroAnc_Internalname ;
   private String sMode197 ;
   private String edtBarPieCod_Internalname ;
   private String edtAlbPKilEnt_Internalname ;
   private String edtAlbPMtrEnt_Internalname ;
   private String edtBarPConTro_Internalname ;
   private String A2396BarAlbObs ;
   private String Z407EmprNom ;
   private String Z3109AlbDivAbr ;
   private String Z1244GuiRemCln ;
   private String sMode198 ;
   private String lblTitlepiezas_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_138_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String divGridtable1_Internalname ;
   private String divTable2_Internalname ;
   private String ROClassString ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarAlbKgmE_Jsonclick ;
   private String edtBarAlbMtrE_Jsonclick ;
   private String edtBarAlbPie_Jsonclick ;
   private String edtBarPreKgm_Jsonclick ;
   private String edtBarPreMtr_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtBarAlbObs_Jsonclick ;
   private String edtAlbProEsp_Jsonclick ;
   private String edtAlbProRec_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtBarAlbKgm_Jsonclick ;
   private String edtBarAlbMtr_Jsonclick ;
   private String divPiezastable_Internalname ;
   private String lblTitlepiezas_Jsonclick ;
   private String lblTitletrozos_Internalname ;
   private String subGridttrn05_hdrs_piezas_trozos_Internalname ;
   private String sGXsfl_231_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String divGridtable2_Internalname ;
   private String divTable3_Internalname ;
   private String edtBarPieCod_Jsonclick ;
   private String edtAlbPKilEnt_Jsonclick ;
   private String edtAlbPMtrEnt_Jsonclick ;
   private String edtBarPConTro_Jsonclick ;
   private String divTrozostable_Internalname ;
   private String lblTitletrozos_Jsonclick ;
   private String sGXsfl_264_fel_idx="0001" ;
   private String subGridttrn05_hdrs_piezas_trozos_Class ;
   private String subGridttrn05_hdrs_piezas_trozos_Linesclass ;
   private String edtAlbPTroCod_Jsonclick ;
   private String edtAlbPTroMet_Jsonclick ;
   private String edtAlbPTroKil_Jsonclick ;
   private String edtAlbPTroAnc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i39AlbProPri ;
   private String i2839AlbProVal ;
   private String subGrid1_Header ;
   private String lblTitlepiezas_Caption ;
   private String subGrid2_Header ;
   private String lblTitletrozos_Caption ;
   private String subGridttrn05_hdrs_piezas_trozos_Header ;
   private String ZV33ContCod ;
   private String ZV36Clictrl ;
   private String Z841TrnNom ;
   private String GXv_char3[] ;
   private String GXv_char1[] ;
   private String ZV34clinom ;
   private java.util.Date Z34AlbProfch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date i34AlbProfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n1259AlbDomEnv ;
   private boolean n3108AlbDivCod ;
   private boolean wbErr ;
   private boolean n3093AlbDivTCod ;
   private boolean bGXsfl_138_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n3109AlbDivAbr ;
   private boolean n841TrnNom ;
   private boolean n1260BusDomEnv ;
   private boolean Gx_longc ;
   private boolean n252CliCod ;
   private boolean bGXsfl_231_Refreshing=false ;
   private boolean bGXsfl_264_Refreshing=false ;
   private String AV35Texto_i ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebGrid Gridttrn05_hdrs_piezas_trozosContainer ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebRow Gridttrn05_hdrs_piezas_trozosRow ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.webpanels.GXWebColumn Gridttrn05_hdrs_piezas_trozosColumn ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbDivTCod ;
   private HTMLChoice cmbAlbProVal ;
   private IDataStoreProvider pr_default ;
   private String[] T01L016_A407EmprNom ;
   private boolean[] T01L016_n407EmprNom ;
   private int[] T01L021_A252CliCod ;
   private boolean[] T01L021_n252CliCod ;
   private byte[] T01L021_A266CliEnvLin ;
   private long[] T01L021_A30AlbProCod ;
   private String[] T01L021_A407EmprNom ;
   private boolean[] T01L021_n407EmprNom ;
   private java.util.Date[] T01L021_A34AlbProfch ;
   private String[] T01L021_A39AlbProPri ;
   private byte[] T01L021_A1259AlbDomEnv ;
   private boolean[] T01L021_n1259AlbDomEnv ;
   private String[] T01L021_A3109AlbDivAbr ;
   private boolean[] T01L021_n3109AlbDivAbr ;
   private String[] T01L021_A3093AlbDivTCod ;
   private boolean[] T01L021_n3093AlbDivTCod ;
   private String[] T01L021_A1244GuiRemCln ;
   private int[] T01L021_A3869AlbCliDes ;
   private String[] T01L021_A7987AlbColCa ;
   private String[] T01L021_A10837AlbTrnNc ;
   private byte[] T01L021_A33AlbProEst ;
   private byte[] T01L021_A1782AlbProEso ;
   private String[] T01L021_A1253EmprGuiRem ;
   private int[] T01L021_A1243GuiRemCli ;
   private String[] T01L021_A396EmprCod ;
   private short[] T01L021_A840TrnCod ;
   private byte[] T01L021_A3108AlbDivCod ;
   private boolean[] T01L021_n3108AlbDivCod ;
   private byte[] T01L021_A1260BusDomEnv ;
   private boolean[] T01L021_n1260BusDomEnv ;
   private String[] T01L017_A841TrnNom ;
   private boolean[] T01L017_n841TrnNom ;
   private String[] T01L018_A841TrnNom ;
   private boolean[] T01L018_n841TrnNom ;
   private byte[] T01L020_A1260BusDomEnv ;
   private boolean[] T01L020_n1260BusDomEnv ;
   private String[] T01L019_A3109AlbDivAbr ;
   private boolean[] T01L019_n3109AlbDivAbr ;
   private String[] T01L015_A1244GuiRemCln ;
   private String[] T01L022_A841TrnNom ;
   private boolean[] T01L022_n841TrnNom ;
   private byte[] T01L023_A1260BusDomEnv ;
   private boolean[] T01L023_n1260BusDomEnv ;
   private String[] T01L024_A3109AlbDivAbr ;
   private boolean[] T01L024_n3109AlbDivAbr ;
   private String[] T01L025_A1244GuiRemCln ;
   private String[] T01L026_A841TrnNom ;
   private boolean[] T01L026_n841TrnNom ;
   private String[] T01L027_A396EmprCod ;
   private long[] T01L027_A30AlbProCod ;
   private long[] T01L014_A30AlbProCod ;
   private java.util.Date[] T01L014_A34AlbProfch ;
   private String[] T01L014_A39AlbProPri ;
   private byte[] T01L014_A1259AlbDomEnv ;
   private boolean[] T01L014_n1259AlbDomEnv ;
   private String[] T01L014_A3093AlbDivTCod ;
   private boolean[] T01L014_n3093AlbDivTCod ;
   private int[] T01L014_A3869AlbCliDes ;
   private String[] T01L014_A7987AlbColCa ;
   private String[] T01L014_A10837AlbTrnNc ;
   private byte[] T01L014_A33AlbProEst ;
   private byte[] T01L014_A1782AlbProEso ;
   private String[] T01L014_A1253EmprGuiRem ;
   private int[] T01L014_A1243GuiRemCli ;
   private String[] T01L014_A396EmprCod ;
   private short[] T01L014_A840TrnCod ;
   private byte[] T01L014_A3108AlbDivCod ;
   private boolean[] T01L014_n3108AlbDivCod ;
   private String[] T01L028_A396EmprCod ;
   private long[] T01L028_A30AlbProCod ;
   private String[] T01L029_A396EmprCod ;
   private long[] T01L029_A30AlbProCod ;
   private long[] T01L013_A30AlbProCod ;
   private java.util.Date[] T01L013_A34AlbProfch ;
   private String[] T01L013_A39AlbProPri ;
   private byte[] T01L013_A1259AlbDomEnv ;
   private boolean[] T01L013_n1259AlbDomEnv ;
   private String[] T01L013_A3093AlbDivTCod ;
   private boolean[] T01L013_n3093AlbDivTCod ;
   private int[] T01L013_A3869AlbCliDes ;
   private String[] T01L013_A7987AlbColCa ;
   private String[] T01L013_A10837AlbTrnNc ;
   private byte[] T01L013_A33AlbProEst ;
   private byte[] T01L013_A1782AlbProEso ;
   private String[] T01L013_A1253EmprGuiRem ;
   private int[] T01L013_A1243GuiRemCli ;
   private String[] T01L013_A396EmprCod ;
   private short[] T01L013_A840TrnCod ;
   private byte[] T01L013_A3108AlbDivCod ;
   private boolean[] T01L013_n3108AlbDivCod ;
   private String[] T01L033_A3109AlbDivAbr ;
   private boolean[] T01L033_n3109AlbDivAbr ;
   private String[] T01L034_A1244GuiRemCln ;
   private byte[] T01L035_A1260BusDomEnv ;
   private boolean[] T01L035_n1260BusDomEnv ;
   private String[] T01L036_A841TrnNom ;
   private boolean[] T01L036_n841TrnNom ;
   private String[] T01L037_A841TrnNom ;
   private boolean[] T01L037_n841TrnNom ;
   private String[] T01L038_A396EmprCod ;
   private long[] T01L038_A30AlbProCod ;
   private byte[] T01L038_A12185DltLinObs ;
   private String[] T01L039_A396EmprCod ;
   private long[] T01L039_A30AlbProCod ;
   private int[] T01L039_A12176DltHdr ;
   private byte[] T01L039_A12177DltR ;
   private String[] T01L039_A12178DltP ;
   private String[] T01L040_A396EmprCod ;
   private long[] T01L040_A30AlbProCod ;
   private String[] T01L040_A7540Alb_NFisca ;
   private String[] T01L041_A396EmprCod ;
   private long[] T01L041_A30AlbProCod ;
   private int[] T01L041_A129BarCod ;
   private byte[] T01L041_A132BarCodReo ;
   private String[] T01L041_A130BarCodPar ;
   private String[] T01L042_A396EmprCod ;
   private long[] T01L042_A30AlbProCod ;
   private byte[] T01L042_A915AlbPObsLin ;
   private String[] T01L043_A396EmprCod ;
   private long[] T01L043_A30AlbProCod ;
   private long[] T01L045_A30AlbProCod ;
   private String[] T01L045_A2839AlbProVal ;
   private java.math.BigDecimal[] T01L045_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01L045_A1263BarAlbMtrE ;
   private int[] T01L045_A1265BarAlbPie ;
   private java.math.BigDecimal[] T01L045_A1262BarPreKgm ;
   private java.math.BigDecimal[] T01L045_A1264BarPreMtr ;
   private byte[] T01L045_A213BarSit ;
   private String[] T01L045_A2396BarAlbObs ;
   private byte[] T01L045_A32AlbProEsp ;
   private java.math.BigDecimal[] T01L045_A40AlbProRec ;
   private String[] T01L045_A396EmprCod ;
   private int[] T01L045_A129BarCod ;
   private byte[] T01L045_A132BarCodReo ;
   private String[] T01L045_A130BarCodPar ;
   private int[] T01L045_A252CliCod ;
   private boolean[] T01L045_n252CliCod ;
   private java.math.BigDecimal[] T01L045_A1267BarAlbKgm ;
   private java.math.BigDecimal[] T01L045_A1268BarAlbMtr ;
   private byte[] T01L010_A213BarSit ;
   private int[] T01L010_A252CliCod ;
   private boolean[] T01L010_n252CliCod ;
   private java.math.BigDecimal[] T01L012_A1267BarAlbKgm ;
   private java.math.BigDecimal[] T01L012_A1268BarAlbMtr ;
   private byte[] T01L046_A213BarSit ;
   private int[] T01L046_A252CliCod ;
   private boolean[] T01L046_n252CliCod ;
   private java.math.BigDecimal[] T01L048_A1267BarAlbKgm ;
   private java.math.BigDecimal[] T01L048_A1268BarAlbMtr ;
   private String[] T01L049_A396EmprCod ;
   private long[] T01L049_A30AlbProCod ;
   private int[] T01L049_A129BarCod ;
   private byte[] T01L049_A132BarCodReo ;
   private String[] T01L049_A130BarCodPar ;
   private long[] T01L09_A30AlbProCod ;
   private String[] T01L09_A2839AlbProVal ;
   private java.math.BigDecimal[] T01L09_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01L09_A1263BarAlbMtrE ;
   private int[] T01L09_A1265BarAlbPie ;
   private java.math.BigDecimal[] T01L09_A1262BarPreKgm ;
   private java.math.BigDecimal[] T01L09_A1264BarPreMtr ;
   private String[] T01L09_A2396BarAlbObs ;
   private byte[] T01L09_A32AlbProEsp ;
   private java.math.BigDecimal[] T01L09_A40AlbProRec ;
   private String[] T01L09_A396EmprCod ;
   private int[] T01L09_A129BarCod ;
   private byte[] T01L09_A132BarCodReo ;
   private String[] T01L09_A130BarCodPar ;
   private long[] T01L08_A30AlbProCod ;
   private String[] T01L08_A2839AlbProVal ;
   private java.math.BigDecimal[] T01L08_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01L08_A1263BarAlbMtrE ;
   private int[] T01L08_A1265BarAlbPie ;
   private java.math.BigDecimal[] T01L08_A1262BarPreKgm ;
   private java.math.BigDecimal[] T01L08_A1264BarPreMtr ;
   private String[] T01L08_A2396BarAlbObs ;
   private byte[] T01L08_A32AlbProEsp ;
   private java.math.BigDecimal[] T01L08_A40AlbProRec ;
   private String[] T01L08_A396EmprCod ;
   private int[] T01L08_A129BarCod ;
   private byte[] T01L08_A132BarCodReo ;
   private String[] T01L08_A130BarCodPar ;
   private byte[] T01L053_A213BarSit ;
   private int[] T01L053_A252CliCod ;
   private boolean[] T01L053_n252CliCod ;
   private java.math.BigDecimal[] T01L055_A1267BarAlbKgm ;
   private java.math.BigDecimal[] T01L055_A1268BarAlbMtr ;
   private String[] T01L056_A396EmprCod ;
   private long[] T01L056_A30AlbProCod ;
   private int[] T01L056_A129BarCod ;
   private byte[] T01L056_A132BarCodReo ;
   private String[] T01L056_A130BarCodPar ;
   private short[] T01L056_A6648AlbMetLin ;
   private String[] T01L057_A396EmprCod ;
   private long[] T01L057_A30AlbProCod ;
   private int[] T01L057_A129BarCod ;
   private byte[] T01L057_A132BarCodReo ;
   private String[] T01L057_A130BarCodPar ;
   private short[] T01L057_A9639Et_Numero ;
   private String[] T01L058_A396EmprCod ;
   private long[] T01L058_A30AlbProCod ;
   private int[] T01L058_A129BarCod ;
   private byte[] T01L058_A132BarCodReo ;
   private String[] T01L058_A130BarCodPar ;
   private short[] T01L058_A6622AlbHdRLn ;
   private String[] T01L059_A396EmprCod ;
   private long[] T01L059_A30AlbProCod ;
   private int[] T01L059_A129BarCod ;
   private byte[] T01L059_A132BarCodReo ;
   private String[] T01L059_A130BarCodPar ;
   private short[] T01L059_A5456P_ForLin ;
   private String[] T01L060_A396EmprCod ;
   private long[] T01L060_A30AlbProCod ;
   private int[] T01L060_A129BarCod ;
   private byte[] T01L060_A132BarCodReo ;
   private String[] T01L060_A130BarCodPar ;
   private byte[] T01L060_A2524DisComLin ;
   private String[] T01L060_A1056DisComCod ;
   private String[] T01L060_A1032FonCod ;
   private String[] T01L061_A396EmprCod ;
   private long[] T01L061_A3617AlbTrnCod ;
   private long[] T01L061_A30AlbProCod ;
   private int[] T01L061_A129BarCod ;
   private byte[] T01L061_A132BarCodReo ;
   private String[] T01L061_A130BarCodPar ;
   private String[] T01L062_A396EmprCod ;
   private long[] T01L062_A30AlbProCod ;
   private int[] T01L062_A129BarCod ;
   private byte[] T01L062_A132BarCodReo ;
   private String[] T01L062_A130BarCodPar ;
   private short[] T01L062_A3621AlbPckLin ;
   private String[] T01L063_A396EmprCod ;
   private long[] T01L063_A30AlbProCod ;
   private int[] T01L063_A129BarCod ;
   private byte[] T01L063_A132BarCodReo ;
   private String[] T01L063_A130BarCodPar ;
   private short[] T01L063_A2764AlbHdrLin ;
   private String[] T01L064_A396EmprCod ;
   private long[] T01L064_A30AlbProCod ;
   private int[] T01L064_A129BarCod ;
   private byte[] T01L064_A132BarCodReo ;
   private String[] T01L064_A130BarCodPar ;
   private short[] T01L064_A1468AlbPrdLin ;
   private String[] T01L065_A396EmprCod ;
   private long[] T01L065_A30AlbProCod ;
   private int[] T01L065_A129BarCod ;
   private byte[] T01L065_A132BarCodReo ;
   private String[] T01L065_A130BarCodPar ;
   private String[] T01L065_A200BarPieCod ;
   private String[] T01L066_A396EmprCod ;
   private long[] T01L066_A30AlbProCod ;
   private int[] T01L066_A129BarCod ;
   private byte[] T01L066_A132BarCodReo ;
   private String[] T01L066_A130BarCodPar ;
   private short[] T01L066_A1240GuiFasLin ;
   private String[] T01L067_A396EmprCod ;
   private long[] T01L067_A30AlbProCod ;
   private int[] T01L067_A129BarCod ;
   private byte[] T01L067_A132BarCodReo ;
   private String[] T01L067_A130BarCodPar ;
   private long[] T01L068_A30AlbProCod ;
   private java.math.BigDecimal[] T01L068_A27AlbPKilEnt ;
   private java.math.BigDecimal[] T01L068_A1270AlbPMtrEnt ;
   private short[] T01L068_A197BarPConTro ;
   private String[] T01L068_A396EmprCod ;
   private int[] T01L068_A129BarCod ;
   private byte[] T01L068_A132BarCodReo ;
   private String[] T01L068_A130BarCodPar ;
   private String[] T01L068_A200BarPieCod ;
   private short[] T01L07_A197BarPConTro ;
   private String[] T01L069_A396EmprCod ;
   private long[] T01L069_A30AlbProCod ;
   private int[] T01L069_A129BarCod ;
   private byte[] T01L069_A132BarCodReo ;
   private String[] T01L069_A130BarCodPar ;
   private String[] T01L069_A200BarPieCod ;
   private long[] T01L05_A30AlbProCod ;
   private java.math.BigDecimal[] T01L05_A27AlbPKilEnt ;
   private java.math.BigDecimal[] T01L05_A1270AlbPMtrEnt ;
   private String[] T01L05_A396EmprCod ;
   private int[] T01L05_A129BarCod ;
   private byte[] T01L05_A132BarCodReo ;
   private String[] T01L05_A130BarCodPar ;
   private String[] T01L05_A200BarPieCod ;
   private long[] T01L04_A30AlbProCod ;
   private java.math.BigDecimal[] T01L04_A27AlbPKilEnt ;
   private java.math.BigDecimal[] T01L04_A1270AlbPMtrEnt ;
   private String[] T01L04_A396EmprCod ;
   private int[] T01L04_A129BarCod ;
   private byte[] T01L04_A132BarCodReo ;
   private String[] T01L04_A130BarCodPar ;
   private String[] T01L04_A200BarPieCod ;
   private short[] T01L070_A197BarPConTro ;
   private short[] T01L074_A197BarPConTro ;
   private String[] T01L075_A396EmprCod ;
   private long[] T01L075_A30AlbProCod ;
   private int[] T01L075_A129BarCod ;
   private byte[] T01L075_A132BarCodReo ;
   private String[] T01L075_A130BarCodPar ;
   private byte[] T01L075_A2524DisComLin ;
   private String[] T01L075_A1056DisComCod ;
   private String[] T01L075_A1032FonCod ;
   private String[] T01L075_A200BarPieCod ;
   private String[] T01L077_A396EmprCod ;
   private long[] T01L077_A30AlbProCod ;
   private int[] T01L077_A129BarCod ;
   private byte[] T01L077_A132BarCodReo ;
   private String[] T01L077_A130BarCodPar ;
   private String[] T01L077_A200BarPieCod ;
   private long[] T01L078_A30AlbProCod ;
   private int[] T01L078_A129BarCod ;
   private byte[] T01L078_A132BarCodReo ;
   private String[] T01L078_A130BarCodPar ;
   private String[] T01L078_A200BarPieCod ;
   private short[] T01L078_A42AlbPTroCod ;
   private java.math.BigDecimal[] T01L078_A43AlbPTroMet ;
   private java.math.BigDecimal[] T01L078_A5303AlbPTroKil ;
   private short[] T01L078_A3118AlbPTroAnc ;
   private String[] T01L078_A396EmprCod ;
   private String[] T01L079_A396EmprCod ;
   private long[] T01L079_A30AlbProCod ;
   private int[] T01L079_A129BarCod ;
   private byte[] T01L079_A132BarCodReo ;
   private String[] T01L079_A130BarCodPar ;
   private String[] T01L079_A200BarPieCod ;
   private short[] T01L079_A42AlbPTroCod ;
   private long[] T01L03_A30AlbProCod ;
   private int[] T01L03_A129BarCod ;
   private byte[] T01L03_A132BarCodReo ;
   private String[] T01L03_A130BarCodPar ;
   private String[] T01L03_A200BarPieCod ;
   private short[] T01L03_A42AlbPTroCod ;
   private java.math.BigDecimal[] T01L03_A43AlbPTroMet ;
   private java.math.BigDecimal[] T01L03_A5303AlbPTroKil ;
   private short[] T01L03_A3118AlbPTroAnc ;
   private String[] T01L03_A396EmprCod ;
   private long[] T01L02_A30AlbProCod ;
   private int[] T01L02_A129BarCod ;
   private byte[] T01L02_A132BarCodReo ;
   private String[] T01L02_A130BarCodPar ;
   private String[] T01L02_A200BarPieCod ;
   private short[] T01L02_A42AlbPTroCod ;
   private java.math.BigDecimal[] T01L02_A43AlbPTroMet ;
   private java.math.BigDecimal[] T01L02_A5303AlbPTroKil ;
   private short[] T01L02_A3118AlbPTroAnc ;
   private String[] T01L02_A396EmprCod ;
   private String[] T01L083_A396EmprCod ;
   private long[] T01L083_A30AlbProCod ;
   private int[] T01L083_A129BarCod ;
   private byte[] T01L083_A132BarCodReo ;
   private String[] T01L083_A130BarCodPar ;
   private String[] T01L083_A200BarPieCod ;
   private short[] T01L083_A42AlbPTroCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private short[] T01L06_A197BarPConTro ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrn05__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn05__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn05__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn05__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn05__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01L02", "SELECT AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod, AlbPTroMet, AlbPTroKil, AlbPTroAnc, EmprCod FROM TXPLALTRZ WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND AlbPTroCod = ?  FOR UPDATE OF AlbPTroMet, AlbPTroKil, AlbPTroAnc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L03", "SELECT AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod, AlbPTroMet, AlbPTroKil, AlbPTroAnc, EmprCod FROM TXPLALTRZ WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND AlbPTroCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L04", "SELECT AlbProCod, AlbPKilEnt, AlbPMtrEnt, EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?  FOR UPDATE OF AlbPKilEnt, AlbPMtrEnt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L05", "SELECT AlbProCod, AlbPKilEnt, AlbPMtrEnt, EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L06", "SELECT BarPConTro FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?  FOR UPDATE OF BarPConTro NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L07", "SELECT BarPConTro FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L08", "SELECT AlbProCod, AlbProVal, BarAlbKgmE, BarAlbMtrE, BarAlbPie, BarPreKgm, BarPreMtr, BarAlbObs, AlbProEsp, AlbProRec, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF AlbProVal, BarAlbKgmE, BarAlbMtrE, BarAlbPie, BarPreKgm, BarPreMtr, BarAlbObs, AlbProEsp, AlbProRec NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L09", "SELECT AlbProCod, AlbProVal, BarAlbKgmE, BarAlbMtrE, BarAlbPie, BarPreKgm, BarPreMtr, BarAlbObs, AlbProEsp, AlbProRec, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L010", "SELECT BarSit, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L012", "SELECT COALESCE( T1.BarAlbKgm, 0) AS BarAlbKgm, COALESCE( T1.BarAlbMtr, 0) AS BarAlbMtr FROM (SELECT SUM(AlbPKilEnt) AS BarAlbKgm, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, SUM(AlbPMtrEnt) AS BarAlbMtr FROM TXPLALPRD GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L013", "SELECT AlbProCod, AlbProfch, AlbProPri, AlbDomEnv, AlbDivTCod, AlbCliDes, AlbColCa, AlbTrnNc, AlbProEst, AlbProEso, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ?  FOR UPDATE OF AlbProfch, AlbProPri, AlbDomEnv, AlbDivTCod, AlbCliDes, AlbColCa, AlbTrnNc, AlbProEst, AlbProEso, EmprGuiRem, GuiRemCli, TrnCod, AlbDivCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L014", "SELECT AlbProCod, AlbProfch, AlbProPri, AlbDomEnv, AlbDivTCod, AlbCliDes, AlbColCa, AlbTrnNc, AlbProEst, AlbProEso, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L015", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L016", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L017", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L018", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L019", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L020", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L021", "SELECT /*+ FIRST_ROWS(100) */ T5.CliCod, T5.CliEnvLin, TM1.AlbProCod, T2.EmprNom, TM1.AlbProfch, TM1.AlbProPri, TM1.AlbDomEnv, T3.DivAbr AS AlbDivAbr, TM1.AlbDivTCod, T4.CliNom AS GuiRemCln, TM1.AlbCliDes, TM1.AlbColCa, TM1.AlbTrnNc, TM1.AlbProEst, TM1.AlbProEso, TM1.EmprGuiRem AS EmprGuiRem, TM1.GuiRemCli AS GuiRemCli, TM1.EmprCod, TM1.TrnCod, TM1.AlbDivCod AS AlbDivCod, COALESCE( T5.CliEnvLin, 0) AS BusDomEnv FROM ((((TXPCALPRD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPDIVISA T3 ON T3.DivCod = TM1.AlbDivCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprGuiRem AND T4.CliCod = TM1.GuiRemCli) LEFT JOIN TXPCLIENV T5 ON T5.EmprCod = TM1.EmprGuiRem AND T5.CliCod = TM1.GuiRemCli AND T5.CliEnvLin = TM1.AlbDomEnv) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L022", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L023", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L024", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L025", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L026", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L027", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L028", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE ( AlbProCod > ?) and EmprCod = ? ORDER BY EmprCod, AlbProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L029", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE ( AlbProCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, AlbProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01L030", "INSERT INTO TXPCALPRD(AlbProCod, AlbProfch, AlbProPri, AlbDomEnv, AlbDivTCod, AlbCliDes, AlbColCa, AlbTrnNc, AlbProEst, AlbProEso, EmprGuiRem, GuiRemCli, EmprCod, TrnCod, AlbDivCod, AlbPObsCon, GuiRemDom, AlbProEnt, AlbSec, AlbHorSal, AlbLocCar, AlbLocDes, AlbMat, AlbFecSal, AlbProBon, AlbProTBo, AlbMarca, AlbTipCal, AlbKilRea, AlbEnvFtp, AlbUsu, AlbOComp, AlbMarCo, AlbLic, AlbNumT, AlbDesp, AlbMotTr, AlbTipDoc, AlbCambio, AlbObsCb, AlbProNroF, AlbDomEv, AlbFmd, ALbFmdc, AlbHhfm, AlbGrossT, AlbProAT, AlbTrnNm, AlbTrnDm, AlbIvaCod, DltUltob, FpgCod, AlbPdATCUD, AlbFecAnu, AlbUsuAnu, AlbHorAnu, AlbPdSerAT, AlbPdTipAT, AlbEnvMail) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("T01L031", "UPDATE TXPCALPRD SET AlbProfch=?, AlbProPri=?, AlbDomEnv=?, AlbDivTCod=?, AlbCliDes=?, AlbColCa=?, AlbTrnNc=?, AlbProEst=?, AlbProEso=?, EmprGuiRem=?, GuiRemCli=?, TrnCod=?, AlbDivCod=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("T01L032", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new ForEachCursor("T01L033", "SELECT DivAbr AS AlbDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L034", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L035", "SELECT COALESCE( CliEnvLin, 0) AS BusDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L036", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L037", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L038", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltLinObs FROM TXPDLT005 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L039", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP FROM TXPDLT001 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L040", "SELECT * FROM (SELECT EmprCod, AlbProCod, Alb_NFisca FROM TXPCNOTRE WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L041", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L042", "SELECT * FROM (SELECT EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L043", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L045", "SELECT T1.AlbProCod, T1.AlbProVal, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarAlbPie, T1.BarPreKgm, T1.BarPreMtr, T2.BarSit, T1.BarAlbObs, T1.AlbProEsp, T1.AlbProRec, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.CliCod, COALESCE( T3.BarAlbKgm, 0) AS BarAlbKgm, COALESCE( T3.BarAlbMtr, 0) AS BarAlbMtr FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(AlbPKilEnt) AS BarAlbKgm, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, SUM(AlbPMtrEnt) AS BarAlbMtr FROM TXPLALPRD GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L046", "SELECT BarSit, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L048", "SELECT COALESCE( T1.BarAlbKgm, 0) AS BarAlbKgm, COALESCE( T1.BarAlbMtr, 0) AS BarAlbMtr FROM (SELECT SUM(AlbPKilEnt) AS BarAlbKgm, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, SUM(AlbPMtrEnt) AS BarAlbMtr FROM TXPLALPRD GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L049", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01L050", "INSERT INTO TXPALBBAR(AlbProCod, AlbProVal, BarAlbKgmE, BarAlbMtrE, BarAlbPie, BarPreKgm, BarPreMtr, BarAlbObs, AlbProEsp, AlbProRec, EmprCod, BarCod, BarCodReo, BarCodPar, TubCod, BarAlbTub, GuiFasULin, AlbPConPie, BarAlbBul, BarAlbTar, BarAlbFor, BarAlbTip, BarAlbPN, AlbPrdULin, IntCod, BarAlbPbr, ManCod, BarFasExt, BarFasExtD, BarAlbExt, BarAlbTin, AlbHdrObs, AlbBarRec, AlbBarDto, AlbHdrUlin, AlbTipCon, AlbHdrAnc, CodCod, AlbSer, AlbColNom, AlbColNum, AlbTipCol, AlbPckUlin, AlbEncCli, AlbHdrgm2, TipAcaCod, AlbTipEnt, AlbImpMan, P_ForULin, PlasCod, BarAlbPlas, AlbHdRUl, AlbObsM, BarPreFKg, BarPreFMt, BarPreTKg, BarPreTMt, AlbEncL, AlbEncA, AlbCald, AlbDf1, AlbDf2, AlbDf3, AlbMqTj, AlbDto, AlbSerD, Et_UltNum, BarKgsCli, AlbMetULi, AlbCliCod, BarPreUnd, BarAlbUnd, AlbNomCli, AlbNumcli, AlbTipArt, AlbCadEnc, AlbTiras, AlbTirasKg, AlbSinTest) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T01L051", "UPDATE TXPALBBAR SET AlbProVal=?, BarAlbKgmE=?, BarAlbMtrE=?, BarAlbPie=?, BarPreKgm=?, BarPreMtr=?, BarAlbObs=?, AlbProEsp=?, AlbProRec=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T01L052", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T01L053", "SELECT BarSit, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L055", "SELECT COALESCE( T1.BarAlbKgm, 0) AS BarAlbKgm, COALESCE( T1.BarAlbMtr, 0) AS BarAlbMtr FROM (SELECT SUM(AlbPKilEnt) AS BarAlbKgm, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, SUM(AlbPMtrEnt) AS BarAlbMtr FROM TXPLALPRD GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L056", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbMetLin FROM TXPMETCAL WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L057", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, Et_Numero FROM TXPEDIETI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L058", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L059", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, P_ForLin FROM TXPALBQUI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L060", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L061", "SELECT * FROM (SELECT EmprCod, AlbTrnCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPLALBTR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L062", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin FROM TXPALBPCK WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L063", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L064", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin FROM TXPALBPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L065", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L066", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L067", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L068", "SELECT T1.AlbProCod, T1.AlbPKilEnt, T1.AlbPMtrEnt, T2.BarPConTro, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod FROM (TXPLALPRD T1 INNER JOIN TXPBARPIE T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.BarPieCod = T1.BarPieCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarPieCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",true, GX_NOMASK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L069", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L070", "SELECT BarPConTro FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?  FOR UPDATE OF BarPConTro NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01L071", "INSERT INTO TXPLALPRD(AlbProCod, AlbPKilEnt, AlbPMtrEnt, EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPieDsc, AlbPreAnc, AlbPKilNet, AlbPMtrNet, AlbPreAncc, AlbPrePgd, AlbTarAlb, AlbPTrnCod, AlbPTrnFec) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPLALPRD")
         ,new UpdateCursor("T01L072", "UPDATE TXPLALPRD SET AlbPKilEnt=?, AlbPMtrEnt=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPLALPRD")
         ,new UpdateCursor("T01L073", "DELETE FROM TXPLALPRD  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPLALPRD")
         ,new ForEachCursor("T01L074", "SELECT BarPConTro FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L075", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, BarPieCod FROM TXPALBTEP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01L076", "UPDATE TXPBARPIE SET BarPConTro=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPBARPIE")
         ,new ForEachCursor("T01L077", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L078", "SELECT AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod, AlbPTroMet, AlbPTroKil, AlbPTroAnc, EmprCod FROM TXPLALTRZ WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and AlbPTroCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L079", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod FROM TXPLALTRZ WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND AlbPTroCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01L080", "INSERT INTO TXPLALTRZ(AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod, AlbPTroMet, AlbPTroKil, AlbPTroAnc, EmprCod, AlbTar, AlbPTroTrn, AlbPTroFEn, AlbPTroCar, AlbPTroEst) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0)", GX_NOMASK, "TXPLALTRZ")
         ,new UpdateCursor("T01L081", "UPDATE TXPLALTRZ SET AlbPTroMet=?, AlbPTroKil=?, AlbPTroAnc=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND AlbPTroCod = ?", GX_NOMASK, "TXPLALTRZ")
         ,new UpdateCursor("T01L082", "DELETE FROM TXPLALTRZ  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND AlbPTroCod = ?", GX_NOMASK, "TXPLALTRZ")
         ,new ForEachCursor("T01L083", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod FROM TXPLALTRZ WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               return;
            case 8 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 20);
               ((String[]) buf[9])[0] = rslt.getString(8, 20);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 3);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 20);
               ((String[]) buf[9])[0] = rslt.getString(8, 20);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 3);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 30);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 20);
               ((String[]) buf[16])[0] = rslt.getString(13, 20);
               ((byte[]) buf[17])[0] = rslt.getByte(14);
               ((byte[]) buf[18])[0] = rslt.getByte(15);
               ((String[]) buf[19])[0] = rslt.getString(16, 3);
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((String[]) buf[21])[0] = rslt.getString(18, 3);
               ((short[]) buf[22])[0] = rslt.getShort(19);
               ((byte[]) buf[23])[0] = rslt.getByte(20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(21);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
               return;
            case 32 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               return;
            case 42 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 43 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 48 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 49 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 62 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 64 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 68 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 72 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 17 :
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
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 20 :
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
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 25 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 26 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 27 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 1);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 1);
               }
               stmt.setInt(6, ((Number) parms[7]).intValue());
               stmt.setString(7, (String)parms[8], 20);
               stmt.setString(8, (String)parms[9], 20);
               stmt.setByte(9, ((Number) parms[10]).byteValue());
               stmt.setByte(10, ((Number) parms[11]).byteValue());
               stmt.setString(11, (String)parms[12], 3);
               stmt.setInt(12, ((Number) parms[13]).intValue());
               stmt.setString(13, (String)parms[14], 3);
               stmt.setShort(14, ((Number) parms[15]).shortValue());
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[17]).byteValue());
               }
               return;
            case 28 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 1);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 1);
               }
               stmt.setInt(5, ((Number) parms[6]).intValue());
               stmt.setString(6, (String)parms[7], 20);
               stmt.setString(7, (String)parms[8], 20);
               stmt.setByte(8, ((Number) parms[9]).byteValue());
               stmt.setByte(9, ((Number) parms[10]).byteValue());
               stmt.setString(10, (String)parms[11], 3);
               stmt.setInt(11, ((Number) parms[12]).intValue());
               stmt.setShort(12, ((Number) parms[13]).shortValue());
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[15]).byteValue());
               }
               stmt.setString(14, (String)parms[16], 3);
               stmt.setLong(15, ((Number) parms[17]).longValue());
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
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 45 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setString(8, (String)parms[7], 30);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 5);
               stmt.setString(11, (String)parms[10], 3);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 1);
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setString(7, (String)parms[6], 30);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setString(10, (String)parms[9], 3);
               stmt.setLong(11, ((Number) parms[10]).longValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 1);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 65 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
               return;
            case 66 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 70 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 73 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 74 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               return;
            case 75 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 9);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 76 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

