package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mantenimientofactura_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action57") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A430FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
         A450FacPri = httpContext.GetPar( "FacPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", A450FacPri);
         A1150FacNumVto = (byte)(GXutil.lval( httpContext.GetPar( "FacNumVto"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
         A1151FacPer = httpContext.GetPar( "FacPer") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
         A1152FacDiaPag = httpContext.GetPar( "FacDiaPag") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
         A437FacFpg = httpContext.GetPar( "FacFpg") ;
         httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
         A434FacDtoPP = CommonUtil.decimalVal( httpContext.GetPar( "FacDtoPP"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A434FacDtoPP", GXutil.ltrimstr( A434FacDtoPP, 5, 2));
         A433FacDtoGen = CommonUtil.decimalVal( httpContext.GetPar( "FacDtoGen"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
         A443FacIVAPor = (byte)(GXutil.lval( httpContext.GetPar( "FacIVAPor"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
         A453FacRECPor = CommonUtil.decimalVal( httpContext.GetPar( "FacRECPor"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A453FacRECPor", GXutil.ltrimstr( A453FacRECPor, 7, 3));
         A14224FacCostFac = CommonUtil.decimalVal( httpContext.GetPar( "FacCostFac"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14224FacCostFac", GXutil.ltrimstr( A14224FacCostFac, 6, 2));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_57_1TR43( A396EmprCod, A430FacCod, A450FacPri, A1150FacNumVto, A1151FacPer, A1152FacDiaPag, A437FacFpg, A434FacDtoPP, A433FacDtoGen, A443FacIVAPor, A453FacRECPor, A14224FacCostFac) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action58") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV16FacCodX = (int)(GXutil.lval( httpContext.GetPar( "FacCodX"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16FacCodX", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16FacCodX), 8, 0));
         AV17Facfch = localUtil.parseDateParm( httpContext.GetPar( "Facfch")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Facfch", localUtil.format(AV17Facfch, "99/99/99"));
         A450FacPri = httpContext.GetPar( "FacPri") ;
         httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", A450FacPri);
         AV19FirmaD = (short)(GXutil.lval( httpContext.GetPar( "FirmaD"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19FirmaD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19FirmaD), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19FirmaD), "ZZZ9")));
         A430FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_58_1TR43( A396EmprCod, AV16FacCodX, AV17Facfch, A450FacPri, AV19FirmaD, A430FacCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action132") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A430FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
         A444FacKgs = CommonUtil.decimalVal( httpContext.GetPar( "FacKgs"), ".") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_132_1TR44( A396EmprCod, A430FacCod, A444FacKgs) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action133") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A430FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
         A427FacAlbCod = GXutil.lval( httpContext.GetPar( "FacAlbCod")) ;
         A428FacAlbTip = (byte)(GXutil.lval( httpContext.GetPar( "FacAlbTip"))) ;
         A1294FacBarCod = (int)(GXutil.lval( httpContext.GetPar( "FacBarCod"))) ;
         A1295FacBarReo = (byte)(GXutil.lval( httpContext.GetPar( "FacBarReo"))) ;
         A1296FacBarPar = httpContext.GetPar( "FacBarPar") ;
         A448FacPreKgs = CommonUtil.decimalVal( httpContext.GetPar( "FacPreKgs"), ".") ;
         A449FacPreMts = CommonUtil.decimalVal( httpContext.GetPar( "FacPreMts"), ".") ;
         A3397FacFasCod = httpContext.GetPar( "FacFasCod") ;
         AV21UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
         AV22Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
         AV20Tintutex = (short)(GXutil.lval( httpContext.GetPar( "Tintutex"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Tintutex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Tintutex), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_133_1TR44( A396EmprCod, A430FacCod, A427FacAlbCod, A428FacAlbTip, A1294FacBarCod, A1295FacBarReo, A1296FacBarPar, A448FacPreKgs, A449FacPreMts, A3397FacFasCod, AV21UsurCod, AV22Station, AV20Tintutex) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel34"+"_"+"") == 0 )
      {
         AV7EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa50501TR43( AV7EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_145") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11629MeivaId = httpContext.GetPar( "MeivaId") ;
         n11629MeivaId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_145( A396EmprCod, A11629MeivaId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_146") == 0 )
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
         gxload_146( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_147") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A14217MotAnuID = httpContext.GetPar( "MotAnuID") ;
         n14217MotAnuID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14217MotAnuID", A14217MotAnuID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_147( A396EmprCod, A14217MotAnuID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_148") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A858ZonGeoCod = (short)(GXutil.lval( httpContext.GetPar( "ZonGeoCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A858ZonGeoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A858ZonGeoCod), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_148( A396EmprCod, A858ZonGeoCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_149") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A430FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_149( A396EmprCod, A430FacCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_lineas") == 0 )
      {
         gxnrgridlevel_lineas_newrow_invoke( ) ;
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
            AV8FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8FacCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8FacCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento Factura", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtFacFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_lineas_newrow_invoke( )
   {
      nRC_GXsfl_204 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_204"))) ;
      nGXsfl_204_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_204_idx"))) ;
      sGXsfl_204_idx = httpContext.GetPar( "sGXsfl_204_idx") ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      AV19FirmaD = (short)(GXutil.lval( httpContext.GetPar( "FirmaD"))) ;
      A435FacEst = (byte)(GXutil.lval( httpContext.GetPar( "FacEst"))) ;
      A450FacPri = httpContext.GetPar( "FacPri") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_lineas_newrow( ) ;
      /* End function gxnrGridlevel_lineas_newrow_invoke */
   }

   public mantenimientofactura_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mantenimientofactura_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientofactura_impl.class ));
   }

   public mantenimientofactura_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbFacEst = new HTMLChoice();
      cmbFacAnulada = new HTMLChoice();
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
      if ( cmbFacEst.getItemCount() > 0 )
      {
         A435FacEst = (byte)(GXutil.lval( cmbFacEst.getValidValue(GXutil.trim( GXutil.str( A435FacEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A435FacEst", GXutil.str( A435FacEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFacEst.setValue( GXutil.trim( GXutil.str( A435FacEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFacEst.getInternalname(), "Values", cmbFacEst.ToJavascriptSource(), true);
      }
      if ( cmbFacAnulada.getItemCount() > 0 )
      {
         A14226FacAnulada = cmbFacAnulada.getValidValue(A14226FacAnulada) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14226FacAnulada", A14226FacAnulada);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFacAnulada.setValue( GXutil.rtrim( A14226FacAnulada) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFacAnulada.getInternalname(), "Values", cmbFacAnulada.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacCod_Internalname, httpContext.getMessage( "Nº Factura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacCod_Internalname, GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacFch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacFch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtFacFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacFch_Internalname, localUtil.format(A436FacFch, "99/99/99"), localUtil.format( A436FacFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacFch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacFch_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtFacFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtFacFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacHor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacHor_Internalname, httpContext.getMessage( "Dia-Hora", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtFacHor_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacHor_Internalname, localUtil.ttoc( A9606FacHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9606FacHor, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacHor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacHor_Enabled, 1, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtFacHor_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtFacHor_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFacEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbFacEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFacEst, cmbFacEst.getInternalname(), GXutil.trim( GXutil.str( A435FacEst, 1, 0)), 1, cmbFacEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbFacEst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Facturacion\\MantenimientoFactura.htm");
      cmbFacEst.setValue( GXutil.trim( GXutil.str( A435FacEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFacEst.getInternalname(), "Values", cmbFacEst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacSerNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacSerNum_Internalname, httpContext.getMessage( "Serie", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacSerNum_Internalname, GXutil.rtrim( A2739FacSerNum), GXutil.rtrim( localUtil.format( A2739FacSerNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacSerNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacSerNum_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFacAnulada.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbFacAnulada.getInternalname(), httpContext.getMessage( "Anulada?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFacAnulada, cmbFacAnulada.getInternalname(), GXutil.rtrim( A14226FacAnulada), 1, cmbFacAnulada.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFacAnulada.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "", true, (byte)(0), "HLP_Facturacion\\MantenimientoFactura.htm");
      cmbFacAnulada.setValue( GXutil.rtrim( A14226FacAnulada) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFacAnulada.getInternalname(), "Values", cmbFacAnulada.ToJavascriptSource(), true);
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
      /* User Defined Control */
      ucDvpanel_unnamedtable4.setProperty("Width", Dvpanel_unnamedtable4_Width);
      ucDvpanel_unnamedtable4.setProperty("AutoWidth", Dvpanel_unnamedtable4_Autowidth);
      ucDvpanel_unnamedtable4.setProperty("AutoHeight", Dvpanel_unnamedtable4_Autoheight);
      ucDvpanel_unnamedtable4.setProperty("Cls", Dvpanel_unnamedtable4_Cls);
      ucDvpanel_unnamedtable4.setProperty("Title", Dvpanel_unnamedtable4_Title);
      ucDvpanel_unnamedtable4.setProperty("Collapsible", Dvpanel_unnamedtable4_Collapsible);
      ucDvpanel_unnamedtable4.setProperty("Collapsed", Dvpanel_unnamedtable4_Collapsed);
      ucDvpanel_unnamedtable4.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable4_Showcollapseicon);
      ucDvpanel_unnamedtable4.setProperty("IconPosition", Dvpanel_unnamedtable4_Iconposition);
      ucDvpanel_unnamedtable4.setProperty("AutoScroll", Dvpanel_unnamedtable4_Autoscroll);
      ucDvpanel_unnamedtable4.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable4_Internalname, "DVPANEL_UNNAMEDTABLE4Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE4Container"+"UnnamedTable4"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedmeivaid_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmeivaid_Internalname, httpContext.getMessage( "Isenção de IVA", ""), "", "", lblTextblockmeivaid_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_meivaid.setProperty("Caption", Combo_meivaid_Caption);
      ucCombo_meivaid.setProperty("Cls", Combo_meivaid_Cls);
      ucCombo_meivaid.setProperty("EmptyItemText", Combo_meivaid_Emptyitemtext);
      ucCombo_meivaid.setProperty("DropDownOptionsData", AV40MeivaId_Data);
      ucCombo_meivaid.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_meivaid_Internalname, "COMBO_MEIVAIDContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMeivaId_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMeivaId_Internalname, GXutil.rtrim( A11629MeivaId), GXutil.rtrim( localUtil.format( A11629MeivaId, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMeivaId_Jsonclick, 0, "Attribute", "", "", "", "", edtMeivaId_Visible, edtMeivaId_Enabled, 1, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFactura.htm");
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
      ucDvpanel_unnamedtable5.setProperty("Width", Dvpanel_unnamedtable5_Width);
      ucDvpanel_unnamedtable5.setProperty("AutoWidth", Dvpanel_unnamedtable5_Autowidth);
      ucDvpanel_unnamedtable5.setProperty("AutoHeight", Dvpanel_unnamedtable5_Autoheight);
      ucDvpanel_unnamedtable5.setProperty("Cls", Dvpanel_unnamedtable5_Cls);
      ucDvpanel_unnamedtable5.setProperty("Title", Dvpanel_unnamedtable5_Title);
      ucDvpanel_unnamedtable5.setProperty("Collapsible", Dvpanel_unnamedtable5_Collapsible);
      ucDvpanel_unnamedtable5.setProperty("Collapsed", Dvpanel_unnamedtable5_Collapsed);
      ucDvpanel_unnamedtable5.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable5_Showcollapseicon);
      ucDvpanel_unnamedtable5.setProperty("IconPosition", Dvpanel_unnamedtable5_Iconposition);
      ucDvpanel_unnamedtable5.setProperty("AutoScroll", Dvpanel_unnamedtable5_Autoscroll);
      ucDvpanel_unnamedtable5.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable5_Internalname, "DVPANEL_UNNAMEDTABLE5Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE5Container"+"UnnamedTable5"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacNumVto_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacNumVto_Internalname, httpContext.getMessage( "Nº Vtos.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacNumVto_Internalname, GXutil.ltrim( localUtil.ntoc( A1150FacNumVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1150FacNumVto), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacNumVto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacNumVto_Enabled, 1, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacPer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacPer_Internalname, httpContext.getMessage( "Periodicidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacPer_Internalname, GXutil.rtrim( A1151FacPer), GXutil.rtrim( localUtil.format( A1151FacPer, "99999")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacPer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacPer_Enabled, 1, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacDiaPag_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacDiaPag_Internalname, httpContext.getMessage( "Dias Pago", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacDiaPag_Internalname, GXutil.rtrim( A1152FacDiaPag), GXutil.rtrim( localUtil.format( A1152FacDiaPag, "999999")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacDiaPag_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacDiaPag_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedfacfpg_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockfacfpg_Internalname, httpContext.getMessage( "Forma Pago", ""), "", "", lblTextblockfacfpg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_facfpg.setProperty("Caption", Combo_facfpg_Caption);
      ucCombo_facfpg.setProperty("Cls", Combo_facfpg_Cls);
      ucCombo_facfpg.setProperty("EmptyItemText", Combo_facfpg_Emptyitemtext);
      ucCombo_facfpg.setProperty("DropDownOptionsData", AV43FacFpg_Data);
      ucCombo_facfpg.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_facfpg_Internalname, "COMBO_FACFPGContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacFpg_Internalname, httpContext.getMessage( "Forma Pago Factura", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacFpg_Internalname, GXutil.rtrim( A437FacFpg), GXutil.rtrim( localUtil.format( A437FacFpg, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacFpg_Jsonclick, 0, "Attribute", "", "", "", "", edtFacFpg_Visible, edtFacFpg_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFactura.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, divUnnamedtable10_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divFacobs_cell_Internalname, 1, 0, "px", 0, "px", divFacobs_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtFacObs_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtFacObs_Internalname, A7210FacObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,110);\"", (short)(0), edtFacObs_Visible, edtFacObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "32768", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divFacobs2_cell_Internalname, 1, 0, "px", 0, "px", divFacobs2_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtFacObs2_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacObs2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacObs2_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtFacObs2_Internalname, A11273FacObs2, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,115);\"", (short)(0), edtFacObs2_Visible, edtFacObs2_Enabled, 0, 80, "chr", 8, "row", (byte)(0), StyleString, ClassString, "", "", "600", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Facturacion\\MantenimientoFactura.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacImpTot_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacImpTot_Internalname, httpContext.getMessage( "Total Bruto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacImpTot_Internalname, GXutil.ltrim( localUtil.ntoc( A441FacImpTot, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacImpTot_Enabled!=0) ? localUtil.format( A441FacImpTot, "ZZZZZZZZZ9.99") : localUtil.format( A441FacImpTot, "ZZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacImpTot_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacImpTot_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacDtoGen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacDtoGen_Internalname, httpContext.getMessage( "Dto. Gral.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacDtoGen_Internalname, GXutil.ltrim( localUtil.ntoc( A433FacDtoGen, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( A433FacDtoGen, "Z9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,132);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacDtoGen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacDtoGen_Enabled, 1, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacImpGen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacImpGen_Internalname, httpContext.getMessage( "Importe Dto. Gral.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacImpGen_Internalname, GXutil.ltrim( localUtil.ntoc( A439FacImpGen, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacImpGen_Enabled!=0) ? localUtil.format( A439FacImpGen, "ZZZZZZZ9.99") : localUtil.format( A439FacImpGen, "ZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacImpGen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacImpGen_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacDto_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacDto_Internalname, httpContext.getMessage( "Dto. P.P.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacDto_Internalname, GXutil.ltrim( localUtil.ntoc( A6632FacDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacDto_Enabled!=0) ? localUtil.format( A6632FacDto, "ZZ9.99") : localUtil.format( A6632FacDto, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,140);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacDto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacDto_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacImpPP_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacImpPP_Internalname, httpContext.getMessage( "Importe Dto. P.P.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacImpPP_Internalname, GXutil.ltrim( localUtil.ntoc( A440FacImpPP, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacImpPP_Enabled!=0) ? localUtil.format( A440FacImpPP, "ZZZZZZZ9.99") : localUtil.format( A440FacImpPP, "ZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacImpPP_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacImpPP_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacBasImp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacBasImp_Internalname, httpContext.getMessage( "Base Imponible", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacBasImp_Internalname, GXutil.ltrim( localUtil.ntoc( A429FacBasImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacBasImp_Enabled!=0) ? localUtil.format( A429FacBasImp, "ZZZZZZZZZ9.99") : localUtil.format( A429FacBasImp, "ZZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacBasImp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacBasImp_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacIVAPor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacIVAPor_Internalname, httpContext.getMessage( "IVA", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 152,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacIVAPor_Internalname, GXutil.ltrim( localUtil.ntoc( A443FacIVAPor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A443FacIVAPor), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,152);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacIVAPor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacIVAPor_Enabled, 1, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacIVAImp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacIVAImp_Internalname, httpContext.getMessage( "Importe IVA", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacIVAImp_Internalname, GXutil.ltrim( localUtil.ntoc( A442FacIVAImp, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacIVAImp_Enabled!=0) ? localUtil.format( A442FacIVAImp, "ZZZZZZZ9.99") : localUtil.format( A442FacIVAImp, "ZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacIVAImp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacIVAImp_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "Right", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacTot_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacTot_Internalname, httpContext.getMessage( "Total", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacTot_Internalname, GXutil.ltrim( localUtil.ntoc( A455FacTot, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacTot_Enabled!=0) ? localUtil.format( A455FacTot, "ZZZZZZZZZ9.99") : localUtil.format( A455FacTot, "ZZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacTot_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacTot_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacFirma_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacFirma_Internalname, httpContext.getMessage( "Hash", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtFacFirma_Internalname, GXutil.rtrim( A9605FacFirma), "", "", (short)(0), 1, edtFacFirma_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTexto_fd_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavTexto_fd_Internalname, AV36Texto_fd, GXutil.rtrim( localUtil.format( AV36Texto_fd, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTexto_fd_Jsonclick, 0, "TextDanger", "", "", "", "", 1, edtavTexto_fd_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFactura.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 183,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnagregardocumento_Internalname, "", httpContext.getMessage( "Agregar Documento", ""), bttBtnagregardocumento_Jsonclick, 5, httpContext.getMessage( "Agregar Documento", ""), "", StyleString, ClassString, bttBtnagregardocumento_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOAGREGARDOCUMENTO\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 187,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminardocumento_Internalname, "", httpContext.getMessage( "Eliminar Documento", ""), bttBtneliminardocumento_Jsonclick, 7, httpContext.getMessage( "Eliminar Documento", ""), "", StyleString, ClassString, bttBtneliminardocumento_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111tr43_client"+"'", TempTags, "", 2, "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnbuscardocumento_Internalname, "", httpContext.getMessage( "Buscar Documento", ""), bttBtnbuscardocumento_Jsonclick, 5, httpContext.getMessage( "Buscar Documento", ""), "", StyleString, ClassString, bttBtnbuscardocumento_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOBUSCARDOCUMENTO\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnvencimientos_Internalname, "", httpContext.getMessage( "Vencimientos", ""), bttBtnvencimientos_Jsonclick, 7, httpContext.getMessage( "Vencimientos", ""), "", StyleString, ClassString, bttBtnvencimientos_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e121tr43_client"+"'", TempTags, "", 2, "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 193,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrepresentantes_divisas_Internalname, "", httpContext.getMessage( "Representante/ Divisa", ""), bttBtnrepresentantes_divisas_Jsonclick, 7, httpContext.getMessage( "Representante/ Divisa", ""), "", StyleString, ClassString, bttBtnrepresentantes_divisas_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e131tr43_client"+"'", TempTags, "", 2, "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 195,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_lineas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_lineas( ) ;
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV56Pgmname), GXutil.rtrim( localUtil.format( AV56Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFactura.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_meivaid_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombomeivaid_Internalname, GXutil.rtrim( AV42ComboMeivaId), GXutil.rtrim( localUtil.format( AV42ComboMeivaId, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombomeivaid_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombomeivaid_Visible, edtavCombomeivaid_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_facfpg_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombofacfpg_Internalname, GXutil.rtrim( AV44ComboFacFpg), GXutil.rtrim( localUtil.format( AV44ComboFacFpg, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombofacfpg_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombofacfpg_Visible, edtavCombofacfpg_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 238,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacPri_Internalname, GXutil.rtrim( A450FacPri), GXutil.rtrim( localUtil.format( A450FacPri, "9")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,238);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacPri_Jsonclick, 0, "Attribute", "", "", "", "", edtFacPri_Visible, edtFacPri_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFactura.htm");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminardocumento_Internalname, tblTabledvelop_confirmpanel_eliminardocumento_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
      /* User Defined Control */
      ucDvelop_confirmpanel_eliminardocumento.setProperty("Title", Dvelop_confirmpanel_eliminardocumento_Title);
      ucDvelop_confirmpanel_eliminardocumento.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminardocumento_Confirmationtext);
      ucDvelop_confirmpanel_eliminardocumento.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption);
      ucDvelop_confirmpanel_eliminardocumento.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption);
      ucDvelop_confirmpanel_eliminardocumento.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption);
      ucDvelop_confirmpanel_eliminardocumento.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition);
      ucDvelop_confirmpanel_eliminardocumento.setProperty("ConfirmType", Dvelop_confirmpanel_eliminardocumento_Confirmtype);
      ucDvelop_confirmpanel_eliminardocumento.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminardocumento_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTOContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTOContainer"+"Body"+"\" style=\"display:none;\">") ;
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

   public void gxdraw_gridlevel_lineas( )
   {
      /*  Grid Control  */
      startgridcontrol204( ) ;
      nGXsfl_204_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount44 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_44 = (short)(1) ;
            scanStart1TR44( ) ;
            while ( RcdFound44 != 0 )
            {
               init_level_properties44( ) ;
               getByPrimaryKey1TR44( ) ;
               addRow1TR44( ) ;
               scanNext1TR44( ) ;
            }
            scanEnd1TR44( ) ;
            nBlankRcdCount44 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B3918FacImpTot1 = A3918FacImpTot1 ;
         n3918FacImpTot1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
         B1150FacNumVto = A1150FacNumVto ;
         httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
         B1151FacPer = A1151FacPer ;
         httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
         B1152FacDiaPag = A1152FacDiaPag ;
         httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
         B437FacFpg = A437FacFpg ;
         httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
         B434FacDtoPP = A434FacDtoPP ;
         httpContext.ajax_rsp_assign_attri("", false, "A434FacDtoPP", GXutil.ltrimstr( A434FacDtoPP, 5, 2));
         B433FacDtoGen = A433FacDtoGen ;
         httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
         B443FacIVAPor = A443FacIVAPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
         B453FacRECPor = A453FacRECPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A453FacRECPor", GXutil.ltrimstr( A453FacRECPor, 7, 3));
         B14224FacCostFac = A14224FacCostFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A14224FacCostFac", GXutil.ltrimstr( A14224FacCostFac, 6, 2));
         standaloneNotModal1TR44( ) ;
         standaloneModal1TR44( ) ;
         sMode44 = Gx_mode ;
         while ( nGXsfl_204_idx < nRC_GXsfl_204 )
         {
            bGXsfl_204_Refreshing = true ;
            readRow1TR44( ) ;
            edtFacLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACLIN_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacLin_Enabled), 5, 0), !bGXsfl_204_Refreshing);
            edtFacAlbCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACALBCOD_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacAlbCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacAlbCod_Enabled), 5, 0), !bGXsfl_204_Refreshing);
            edtFacAlbTip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACALBTIP_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacAlbTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacAlbTip_Enabled), 5, 0), !bGXsfl_204_Refreshing);
            edtFacNHdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACNHDR_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacNHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacNHdr_Enabled), 5, 0), !bGXsfl_204_Refreshing);
            edtFacMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACMTS_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacMts_Enabled), 5, 0), !bGXsfl_204_Refreshing);
            edtFacPreMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPREMTS_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacPreMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPreMts_Enabled), 5, 0), !bGXsfl_204_Refreshing);
            edtFacKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACKGS_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacKgs_Enabled), 5, 0), !bGXsfl_204_Refreshing);
            edtFacPreKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPREKGS_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacPreKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPreKgs_Enabled), 5, 0), !bGXsfl_204_Refreshing);
            edtFacUnds_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACUNDS_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacUnds_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacUnds_Enabled), 5, 0), !bGXsfl_204_Refreshing);
            edtFacPreUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPREUND_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacPreUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPreUnd_Enabled), 5, 0), !bGXsfl_204_Refreshing);
            edtFacRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACREC_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacRec_Enabled), 5, 0), !bGXsfl_204_Refreshing);
            edtFacBonLi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACBONLI_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacBonLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBonLi_Enabled), 5, 0), !bGXsfl_204_Refreshing);
            edtFacBonLi_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "FACBONLI_"+sGXsfl_204_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacBonLi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBonLi_Visible), 5, 0), !bGXsfl_204_Refreshing);
            edtFacImp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACIMP_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacImp_Enabled), 5, 0), !bGXsfl_204_Refreshing);
            edtFacSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACSER_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacSer_Enabled), 5, 0), !bGXsfl_204_Refreshing);
            edtFacBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACBARCOD_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBarCod_Enabled), 5, 0), !bGXsfl_204_Refreshing);
            edtFacBarReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACBARREO_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBarReo_Enabled), 5, 0), !bGXsfl_204_Refreshing);
            edtFacBarPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACBARPAR_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBarPar_Enabled), 5, 0), !bGXsfl_204_Refreshing);
            edtFacDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACDSC_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDsc_Enabled), 5, 0), !bGXsfl_204_Refreshing);
            edtFacFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACFASCOD_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFasCod_Enabled), 5, 0), !bGXsfl_204_Refreshing);
            if ( ( nRcdExists_44 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1TR44( ) ;
            }
            sendRow1TR44( ) ;
            bGXsfl_204_Refreshing = false ;
         }
         Gx_mode = sMode44 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A3918FacImpTot1 = B3918FacImpTot1 ;
         n3918FacImpTot1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
         A1150FacNumVto = B1150FacNumVto ;
         httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
         A1151FacPer = B1151FacPer ;
         httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
         A1152FacDiaPag = B1152FacDiaPag ;
         httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
         A437FacFpg = B437FacFpg ;
         httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
         A434FacDtoPP = B434FacDtoPP ;
         httpContext.ajax_rsp_assign_attri("", false, "A434FacDtoPP", GXutil.ltrimstr( A434FacDtoPP, 5, 2));
         A433FacDtoGen = B433FacDtoGen ;
         httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
         A443FacIVAPor = B443FacIVAPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
         A453FacRECPor = B453FacRECPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A453FacRECPor", GXutil.ltrimstr( A453FacRECPor, 7, 3));
         A14224FacCostFac = B14224FacCostFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A14224FacCostFac", GXutil.ltrimstr( A14224FacCostFac, 6, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount44 = (short)(5) ;
         nRcdExists_44 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1TR44( ) ;
            while ( RcdFound44 != 0 )
            {
               sGXsfl_204_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_204_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_20444( ) ;
               init_level_properties44( ) ;
               standaloneNotModal1TR44( ) ;
               getByPrimaryKey1TR44( ) ;
               standaloneModal1TR44( ) ;
               addRow1TR44( ) ;
               scanNext1TR44( ) ;
            }
            scanEnd1TR44( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode44 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_204_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_204_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_20444( ) ;
         initAll1TR44( ) ;
         init_level_properties44( ) ;
         B3918FacImpTot1 = A3918FacImpTot1 ;
         n3918FacImpTot1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
         B1150FacNumVto = A1150FacNumVto ;
         httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
         B1151FacPer = A1151FacPer ;
         httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
         B1152FacDiaPag = A1152FacDiaPag ;
         httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
         B437FacFpg = A437FacFpg ;
         httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
         B434FacDtoPP = A434FacDtoPP ;
         httpContext.ajax_rsp_assign_attri("", false, "A434FacDtoPP", GXutil.ltrimstr( A434FacDtoPP, 5, 2));
         B433FacDtoGen = A433FacDtoGen ;
         httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
         B443FacIVAPor = A443FacIVAPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
         B453FacRECPor = A453FacRECPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A453FacRECPor", GXutil.ltrimstr( A453FacRECPor, 7, 3));
         B14224FacCostFac = A14224FacCostFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A14224FacCostFac", GXutil.ltrimstr( A14224FacCostFac, 6, 2));
         nRcdExists_44 = (short)(0) ;
         nIsMod_44 = (short)(0) ;
         nRcdDeleted_44 = (short)(0) ;
         nBlankRcdCount44 = (short)(nBlankRcdUsr44+nBlankRcdCount44) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount44 > 0 )
         {
            standaloneNotModal1TR44( ) ;
            standaloneModal1TR44( ) ;
            addRow1TR44( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtFacMts_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount44 = (short)(nBlankRcdCount44-1) ;
         }
         Gx_mode = sMode44 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A3918FacImpTot1 = B3918FacImpTot1 ;
         n3918FacImpTot1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
         A1150FacNumVto = B1150FacNumVto ;
         httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
         A1151FacPer = B1151FacPer ;
         httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
         A1152FacDiaPag = B1152FacDiaPag ;
         httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
         A437FacFpg = B437FacFpg ;
         httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
         A434FacDtoPP = B434FacDtoPP ;
         httpContext.ajax_rsp_assign_attri("", false, "A434FacDtoPP", GXutil.ltrimstr( A434FacDtoPP, 5, 2));
         A433FacDtoGen = B433FacDtoGen ;
         httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
         A443FacIVAPor = B443FacIVAPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
         A453FacRECPor = B453FacRECPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A453FacRECPor", GXutil.ltrimstr( A453FacRECPor, 7, 3));
         A14224FacCostFac = B14224FacCostFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A14224FacCostFac", GXutil.ltrimstr( A14224FacCostFac, 6, 2));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_lineasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_lineas", Gridlevel_lineasContainer, subGridlevel_lineas_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_lineasContainerData", Gridlevel_lineasContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_lineasContainerData"+"V", Gridlevel_lineasContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_lineasContainerData"+"V"+"\" value='"+Gridlevel_lineasContainer.GridValuesHidden()+"'/>") ;
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
      e141TR2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMEIVAID_DATA"), AV40MeivaId_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFACFPG_DATA"), AV43FacFpg_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z430FacCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z430FacCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z437FacFpg = httpContext.cgiGet( "Z437FacFpg") ;
            Z436FacFch = localUtil.ctod( httpContext.cgiGet( "Z436FacFch"), 0) ;
            Z450FacPri = httpContext.cgiGet( "Z450FacPri") ;
            Z433FacDtoGen = localUtil.ctond( httpContext.cgiGet( "Z433FacDtoGen")) ;
            Z434FacDtoPP = localUtil.ctond( httpContext.cgiGet( "Z434FacDtoPP")) ;
            Z960FacIVACod = httpContext.cgiGet( "Z960FacIVACod") ;
            Z443FacIVAPor = (byte)(localUtil.ctol( httpContext.cgiGet( "Z443FacIVAPor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z453FacRECPor = localUtil.ctond( httpContext.cgiGet( "Z453FacRECPor")) ;
            Z435FacEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z435FacEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z445FacLiC = (int)(localUtil.ctol( httpContext.cgiGet( "Z445FacLiC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z965FacCob = httpContext.cgiGet( "Z965FacCob") ;
            Z1150FacNumVto = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1150FacNumVto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1151FacPer = httpContext.cgiGet( "Z1151FacPer") ;
            Z1152FacDiaPag = httpContext.cgiGet( "Z1152FacDiaPag") ;
            Z1153FacTipFac = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1153FacTipFac"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2739FacSerNum = httpContext.cgiGet( "Z2739FacSerNum") ;
            Z6632FacDto = localUtil.ctond( httpContext.cgiGet( "Z6632FacDto")) ;
            Z7211Factrm = localUtil.ctond( httpContext.cgiGet( "Z7211Factrm")) ;
            Z7212FacRect = localUtil.ctond( httpContext.cgiGet( "Z7212FacRect")) ;
            Z9605FacFirma = httpContext.cgiGet( "Z9605FacFirma") ;
            Z9606FacHor = localUtil.ctot( httpContext.cgiGet( "Z9606FacHor"), 0) ;
            Z9643FacLiq1 = localUtil.ctond( httpContext.cgiGet( "Z9643FacLiq1")) ;
            Z9644FacLiq2 = localUtil.ctond( httpContext.cgiGet( "Z9644FacLiq2")) ;
            Z9645FacIva1 = localUtil.ctond( httpContext.cgiGet( "Z9645FacIva1")) ;
            Z9646FacTot1 = localUtil.ctond( httpContext.cgiGet( "Z9646FacTot1")) ;
            Z9710FacFirDg = httpContext.cgiGet( "Z9710FacFirDg") ;
            Z10417FacCliPgL = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10417FacCliPgL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10418FacAran = httpContext.cgiGet( "Z10418FacAran") ;
            Z10419FacBrut = localUtil.ctond( httpContext.cgiGet( "Z10419FacBrut")) ;
            Z10420FacNet = localUtil.ctond( httpContext.cgiGet( "Z10420FacNet")) ;
            Z10421FacInc = httpContext.cgiGet( "Z10421FacInc") ;
            Z10422FacFre = httpContext.cgiGet( "Z10422FacFre") ;
            Z10423FacExp = httpContext.cgiGet( "Z10423FacExp") ;
            Z11513FacRecIca = localUtil.ctond( httpContext.cgiGet( "Z11513FacRecIca")) ;
            Z12523FacTpFra = httpContext.cgiGet( "Z12523FacTpFra") ;
            Z11626FacMan = httpContext.cgiGet( "Z11626FacMan") ;
            Z14219FacEnergia = localUtil.ctond( httpContext.cgiGet( "Z14219FacEnergia")) ;
            Z14224FacCostFac = localUtil.ctond( httpContext.cgiGet( "Z14224FacCostFac")) ;
            Z14222FacCostMts = localUtil.ctond( httpContext.cgiGet( "Z14222FacCostMts")) ;
            Z14223FacCostKgs = localUtil.ctond( httpContext.cgiGet( "Z14223FacCostKgs")) ;
            Z14226FacAnulada = httpContext.cgiGet( "Z14226FacAnulada") ;
            Z14227FacFecAnul = localUtil.ctot( httpContext.cgiGet( "Z14227FacFecAnul"), 0) ;
            Z14229FacSFD = localUtil.ctot( httpContext.cgiGet( "Z14229FacSFD"), 0) ;
            Z14230FacIDATe = httpContext.cgiGet( "Z14230FacIDATe") ;
            Z14231FacMsgATe = httpContext.cgiGet( "Z14231FacMsgATe") ;
            Z14232FacIDATc = httpContext.cgiGet( "Z14232FacIDATc") ;
            Z14233FacMsgATc = httpContext.cgiGet( "Z14233FacMsgATc") ;
            Z14234FacIDATd = httpContext.cgiGet( "Z14234FacIDATd") ;
            Z14235FacMsgATd = httpContext.cgiGet( "Z14235FacMsgATd") ;
            Z14236FacSerAT = httpContext.cgiGet( "Z14236FacSerAT") ;
            Z14237FacTipAT = httpContext.cgiGet( "Z14237FacTipAT") ;
            Z11273FacObs2 = httpContext.cgiGet( "Z11273FacObs2") ;
            Z14420FacEnvMail = localUtil.ctot( httpContext.cgiGet( "Z14420FacEnvMail"), 0) ;
            Z8346FacRecI = localUtil.ctond( httpContext.cgiGet( "Z8346FacRecI")) ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11629MeivaId = httpContext.cgiGet( "Z11629MeivaId") ;
            Z14217MotAnuID = httpContext.cgiGet( "Z14217MotAnuID") ;
            A434FacDtoPP = localUtil.ctond( httpContext.cgiGet( "Z434FacDtoPP")) ;
            A960FacIVACod = httpContext.cgiGet( "Z960FacIVACod") ;
            A453FacRECPor = localUtil.ctond( httpContext.cgiGet( "Z453FacRECPor")) ;
            A445FacLiC = (int)(localUtil.ctol( httpContext.cgiGet( "Z445FacLiC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A965FacCob = httpContext.cgiGet( "Z965FacCob") ;
            A1153FacTipFac = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1153FacTipFac"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7211Factrm = localUtil.ctond( httpContext.cgiGet( "Z7211Factrm")) ;
            A7212FacRect = localUtil.ctond( httpContext.cgiGet( "Z7212FacRect")) ;
            A9643FacLiq1 = localUtil.ctond( httpContext.cgiGet( "Z9643FacLiq1")) ;
            A9644FacLiq2 = localUtil.ctond( httpContext.cgiGet( "Z9644FacLiq2")) ;
            A9645FacIva1 = localUtil.ctond( httpContext.cgiGet( "Z9645FacIva1")) ;
            A9646FacTot1 = localUtil.ctond( httpContext.cgiGet( "Z9646FacTot1")) ;
            A9710FacFirDg = httpContext.cgiGet( "Z9710FacFirDg") ;
            A10417FacCliPgL = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10417FacCliPgL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10418FacAran = httpContext.cgiGet( "Z10418FacAran") ;
            A10419FacBrut = localUtil.ctond( httpContext.cgiGet( "Z10419FacBrut")) ;
            A10420FacNet = localUtil.ctond( httpContext.cgiGet( "Z10420FacNet")) ;
            A10421FacInc = httpContext.cgiGet( "Z10421FacInc") ;
            A10422FacFre = httpContext.cgiGet( "Z10422FacFre") ;
            A10423FacExp = httpContext.cgiGet( "Z10423FacExp") ;
            A11513FacRecIca = localUtil.ctond( httpContext.cgiGet( "Z11513FacRecIca")) ;
            A12523FacTpFra = httpContext.cgiGet( "Z12523FacTpFra") ;
            A11626FacMan = httpContext.cgiGet( "Z11626FacMan") ;
            A14219FacEnergia = localUtil.ctond( httpContext.cgiGet( "Z14219FacEnergia")) ;
            A14224FacCostFac = localUtil.ctond( httpContext.cgiGet( "Z14224FacCostFac")) ;
            A14222FacCostMts = localUtil.ctond( httpContext.cgiGet( "Z14222FacCostMts")) ;
            A14223FacCostKgs = localUtil.ctond( httpContext.cgiGet( "Z14223FacCostKgs")) ;
            A14227FacFecAnul = localUtil.ctot( httpContext.cgiGet( "Z14227FacFecAnul"), 0) ;
            A14229FacSFD = localUtil.ctot( httpContext.cgiGet( "Z14229FacSFD"), 0) ;
            A14230FacIDATe = httpContext.cgiGet( "Z14230FacIDATe") ;
            A14231FacMsgATe = httpContext.cgiGet( "Z14231FacMsgATe") ;
            A14232FacIDATc = httpContext.cgiGet( "Z14232FacIDATc") ;
            A14233FacMsgATc = httpContext.cgiGet( "Z14233FacMsgATc") ;
            A14234FacIDATd = httpContext.cgiGet( "Z14234FacIDATd") ;
            A14235FacMsgATd = httpContext.cgiGet( "Z14235FacMsgATd") ;
            A14236FacSerAT = httpContext.cgiGet( "Z14236FacSerAT") ;
            A14237FacTipAT = httpContext.cgiGet( "Z14237FacTipAT") ;
            A14420FacEnvMail = localUtil.ctot( httpContext.cgiGet( "Z14420FacEnvMail"), 0) ;
            A8346FacRecI = localUtil.ctond( httpContext.cgiGet( "Z8346FacRecI")) ;
            n8346FacRecI = false ;
            A14217MotAnuID = httpContext.cgiGet( "Z14217MotAnuID") ;
            n14217MotAnuID = false ;
            O3918FacImpTot1 = localUtil.ctond( httpContext.cgiGet( "O3918FacImpTot1")) ;
            O1150FacNumVto = (byte)(localUtil.ctol( httpContext.cgiGet( "O1150FacNumVto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O1151FacPer = httpContext.cgiGet( "O1151FacPer") ;
            O1152FacDiaPag = httpContext.cgiGet( "O1152FacDiaPag") ;
            O437FacFpg = httpContext.cgiGet( "O437FacFpg") ;
            O434FacDtoPP = localUtil.ctond( httpContext.cgiGet( "O434FacDtoPP")) ;
            O433FacDtoGen = localUtil.ctond( httpContext.cgiGet( "O433FacDtoGen")) ;
            O443FacIVAPor = (byte)(localUtil.ctol( httpContext.cgiGet( "O443FacIVAPor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O453FacRECPor = localUtil.ctond( httpContext.cgiGet( "O453FacRECPor")) ;
            O14224FacCostFac = localUtil.ctond( httpContext.cgiGet( "O14224FacCostFac")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_204 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_204"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N14217MotAnuID = httpContext.cgiGet( "N14217MotAnuID") ;
            N11629MeivaId = httpContext.cgiGet( "N11629MeivaId") ;
            N436FacFch = localUtil.ctod( httpContext.cgiGet( "N436FacFch"), 0) ;
            N433FacDtoGen = localUtil.ctond( httpContext.cgiGet( "N433FacDtoGen")) ;
            N434FacDtoPP = localUtil.ctond( httpContext.cgiGet( "N434FacDtoPP")) ;
            N443FacIVAPor = (byte)(localUtil.ctol( httpContext.cgiGet( "N443FacIVAPor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N453FacRECPor = localUtil.ctond( httpContext.cgiGet( "N453FacRECPor")) ;
            N2739FacSerNum = httpContext.cgiGet( "N2739FacSerNum") ;
            N1153FacTipFac = (byte)(localUtil.ctol( httpContext.cgiGet( "N1153FacTipFac"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N450FacPri = httpContext.cgiGet( "N450FacPri") ;
            N252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "N252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N437FacFpg = httpContext.cgiGet( "N437FacFpg") ;
            N1150FacNumVto = (byte)(localUtil.ctol( httpContext.cgiGet( "N1150FacNumVto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N1151FacPer = httpContext.cgiGet( "N1151FacPer") ;
            N1152FacDiaPag = httpContext.cgiGet( "N1152FacDiaPag") ;
            N9606FacHor = localUtil.ctot( httpContext.cgiGet( "N9606FacHor"), 0) ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            A3918FacImpTot1 = localUtil.ctond( httpContext.cgiGet( "FACIMPTOT1")) ;
            A3919FacImpGen1 = localUtil.ctond( httpContext.cgiGet( "FACIMPGEN1")) ;
            A434FacDtoPP = localUtil.ctond( httpContext.cgiGet( "FACDTOPP")) ;
            A3920FacImpPP1 = localUtil.ctond( httpContext.cgiGet( "FACIMPPP1")) ;
            A3921FacIvaImp1 = localUtil.ctond( httpContext.cgiGet( "FACIVAIMP1")) ;
            A453FacRECPor = localUtil.ctond( httpContext.cgiGet( "FACRECPOR")) ;
            A3922FacRecImp1 = localUtil.ctond( httpContext.cgiGet( "FACRECIMP1")) ;
            A7212FacRect = localUtil.ctond( httpContext.cgiGet( "FACRECT")) ;
            A7214FacImpRet1 = localUtil.ctond( httpContext.cgiGet( "FACIMPRET1")) ;
            A11513FacRecIca = localUtil.ctond( httpContext.cgiGet( "FACRECICA")) ;
            A11514FacImpIca1 = localUtil.ctond( httpContext.cgiGet( "FACIMPICA1")) ;
            A14219FacEnergia = localUtil.ctond( httpContext.cgiGet( "FACENERGIA")) ;
            A14218FacImpEng1 = localUtil.ctond( httpContext.cgiGet( "FACIMPENG1")) ;
            A14222FacCostMts = localUtil.ctond( httpContext.cgiGet( "FACCOSTMTS")) ;
            A14223FacCostKgs = localUtil.ctond( httpContext.cgiGet( "FACCOSTKGS")) ;
            A14224FacCostFac = localUtil.ctond( httpContext.cgiGet( "FACCOSTFAC")) ;
            A14221FacCostEng = localUtil.ctond( httpContext.cgiGet( "FACCOSTENG")) ;
            A7213FacImpRet = localUtil.ctond( httpContext.cgiGet( "FACIMPRET")) ;
            A7215FacImpRet2 = localUtil.ctond( httpContext.cgiGet( "FACIMPRET2")) ;
            A14220FacCostEne = localUtil.ctond( httpContext.cgiGet( "FACCOSTENE")) ;
            A452FacRecImp = localUtil.ctond( httpContext.cgiGet( "FACRECIMP")) ;
            A8347FacImpReI = localUtil.ctond( httpContext.cgiGet( "FACIMPREI")) ;
            A11515FacImpIca = localUtil.ctond( httpContext.cgiGet( "FACIMPICA")) ;
            A8346FacRecI = localUtil.ctond( httpContext.cgiGet( "FACRECI")) ;
            A8348FacImpReI1 = localUtil.ctond( httpContext.cgiGet( "FACIMPREI1")) ;
            A7209Colombia = (byte)(localUtil.ctol( httpContext.cgiGet( "COLOMBIA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7209Colombia = false ;
            A14225FacImpEner = localUtil.ctond( httpContext.cgiGet( "FACIMPENER")) ;
            AV19FirmaD = (short)(localUtil.ctol( httpContext.cgiGet( "vFIRMAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV8FacCod = (int)(localUtil.ctol( httpContext.cgiGet( "vFACCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12Insert_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13Insert_MotAnuID = httpContext.cgiGet( "vINSERT_MOTANUID") ;
            A14217MotAnuID = httpContext.cgiGet( "MOTANUID") ;
            AV14Insert_MeivaId = httpContext.cgiGet( "vINSERT_MEIVAID") ;
            A858ZonGeoCod = (short)(localUtil.ctol( httpContext.cgiGet( "ZONGEOCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17Facfch = localUtil.ctod( httpContext.cgiGet( "vFACFCH"), 0) ;
            AV16FacCodX = (int)(localUtil.ctol( httpContext.cgiGet( "vFACCODX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1153FacTipFac = (byte)(localUtil.ctol( httpContext.cgiGet( "FACTIPFAC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A965FacCob = httpContext.cgiGet( "FACCOB") ;
            A11626FacMan = httpContext.cgiGet( "FACMAN") ;
            A960FacIVACod = httpContext.cgiGet( "FACIVACOD") ;
            A445FacLiC = (int)(localUtil.ctol( httpContext.cgiGet( "FACLIC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7211Factrm = localUtil.ctond( httpContext.cgiGet( "FACTRM")) ;
            A9643FacLiq1 = localUtil.ctond( httpContext.cgiGet( "FACLIQ1")) ;
            A9644FacLiq2 = localUtil.ctond( httpContext.cgiGet( "FACLIQ2")) ;
            A9645FacIva1 = localUtil.ctond( httpContext.cgiGet( "FACIVA1")) ;
            A9646FacTot1 = localUtil.ctond( httpContext.cgiGet( "FACTOT1")) ;
            A9710FacFirDg = httpContext.cgiGet( "FACFIRDG") ;
            A10417FacCliPgL = (byte)(localUtil.ctol( httpContext.cgiGet( "FACCLIPGL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10418FacAran = httpContext.cgiGet( "FACARAN") ;
            A10419FacBrut = localUtil.ctond( httpContext.cgiGet( "FACBRUT")) ;
            A10420FacNet = localUtil.ctond( httpContext.cgiGet( "FACNET")) ;
            A10421FacInc = httpContext.cgiGet( "FACINC") ;
            A10422FacFre = httpContext.cgiGet( "FACFRE") ;
            A10423FacExp = httpContext.cgiGet( "FACEXP") ;
            A12523FacTpFra = httpContext.cgiGet( "FACTPFRA") ;
            A14227FacFecAnul = localUtil.ctot( httpContext.cgiGet( "FACFECANUL"), 0) ;
            A14229FacSFD = localUtil.ctot( httpContext.cgiGet( "FACSFD"), 0) ;
            A14230FacIDATe = httpContext.cgiGet( "FACIDATE") ;
            A14231FacMsgATe = httpContext.cgiGet( "FACMSGATE") ;
            A14232FacIDATc = httpContext.cgiGet( "FACIDATC") ;
            A14233FacMsgATc = httpContext.cgiGet( "FACMSGATC") ;
            A14234FacIDATd = httpContext.cgiGet( "FACIDATD") ;
            A14235FacMsgATd = httpContext.cgiGet( "FACMSGATD") ;
            A14236FacSerAT = httpContext.cgiGet( "FACSERAT") ;
            A14237FacTipAT = httpContext.cgiGet( "FACTIPAT") ;
            A14420FacEnvMail = localUtil.ctot( httpContext.cgiGet( "FACENVMAIL"), 0) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A953IvaCod = httpContext.cgiGet( "IVACOD") ;
            n953IvaCod = false ;
            A11630MeivaDsc = httpContext.cgiGet( "MEIVADSC") ;
            n11630MeivaDsc = false ;
            A14228MotAnuDc = httpContext.cgiGet( "MOTANUDC") ;
            A1360ZonGeoNom = httpContext.cgiGet( "ZONGEONOM") ;
            n1360ZonGeoNom = false ;
            A5355FacImpMin = localUtil.ctond( httpContext.cgiGet( "FACIMPMIN")) ;
            A2239FacIml = localUtil.ctond( httpContext.cgiGet( "FACIML")) ;
            A5353FacImpMan = localUtil.ctond( httpContext.cgiGet( "FACIMPMAN")) ;
            A3923FacImp1 = localUtil.ctond( httpContext.cgiGet( "FACIMP1")) ;
            A3898FacPreKgsA = localUtil.ctond( httpContext.cgiGet( "FACPREKGSA")) ;
            A3897FacKgsA = localUtil.ctond( httpContext.cgiGet( "FACKGSA")) ;
            AV20Tintutex = (short)(localUtil.ctol( httpContext.cgiGet( "vTINTUTEX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV22Station = httpContext.cgiGet( "vSTATION") ;
            AV21UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            A1498FacDisNum = httpContext.cgiGet( "FACDISNUM") ;
            A3097FacTipPro = httpContext.cgiGet( "FACTIPPRO") ;
            A3303FacNPart = (short)(localUtil.ctol( httpContext.cgiGet( "FACNPART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3878FacColNom = httpContext.cgiGet( "FACCOLNOM") ;
            A3879FocColNum = (int)(localUtil.ctol( httpContext.cgiGet( "FOCCOLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3880FacTipColC = (byte)(localUtil.ctol( httpContext.cgiGet( "FACTIPCOLC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3881FacNomCol = httpContext.cgiGet( "FACNOMCOL") ;
            A3882FacNumCol = (int)(localUtil.ctol( httpContext.cgiGet( "FACNUMCOL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3883FacCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "FACCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3884FacProCod = httpContext.cgiGet( "FACPROCOD") ;
            A4389FacDsc2 = httpContext.cgiGet( "FACDSC2") ;
            A4814FacEncCli = httpContext.cgiGet( "FACENCCLI") ;
            A5172FacDishCod = httpContext.cgiGet( "FACDISHCOD") ;
            A5189FacTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "FACTIPART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6837FacCosPQ = localUtil.ctond( httpContext.cgiGet( "FACCOSPQ")) ;
            A9647FacImpdto = localUtil.ctond( httpContext.cgiGet( "FACIMPDTO")) ;
            A9648FacDtoL = localUtil.ctond( httpContext.cgiGet( "FACDTOL")) ;
            A9649FacPKDto = localUtil.ctond( httpContext.cgiGet( "FACPKDTO")) ;
            A9650FacPMdto = localUtil.ctond( httpContext.cgiGet( "FACPMDTO")) ;
            A9651FacImpd = localUtil.ctond( httpContext.cgiGet( "FACIMPD")) ;
            A9708FacDscII = httpContext.cgiGet( "FACDSCII") ;
            A10271FacAcs = httpContext.cgiGet( "FACACS") ;
            A3899FacFecAlb = localUtil.ctod( httpContext.cgiGet( "FACFECALB"), 0) ;
            A12906FacCadEnc = (short)(localUtil.ctol( httpContext.cgiGet( "FACCADENC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14238FacLinTRM = localUtil.ctond( httpContext.cgiGet( "FACLINTRM")) ;
            A14239FACLinTRMF = localUtil.ctot( httpContext.cgiGet( "FACLINTRMF"), 0) ;
            Combo_meivaid_Objectcall = httpContext.cgiGet( "COMBO_MEIVAID_Objectcall") ;
            Combo_meivaid_Class = httpContext.cgiGet( "COMBO_MEIVAID_Class") ;
            Combo_meivaid_Icontype = httpContext.cgiGet( "COMBO_MEIVAID_Icontype") ;
            Combo_meivaid_Icon = httpContext.cgiGet( "COMBO_MEIVAID_Icon") ;
            Combo_meivaid_Caption = httpContext.cgiGet( "COMBO_MEIVAID_Caption") ;
            Combo_meivaid_Tooltip = httpContext.cgiGet( "COMBO_MEIVAID_Tooltip") ;
            Combo_meivaid_Cls = httpContext.cgiGet( "COMBO_MEIVAID_Cls") ;
            Combo_meivaid_Selectedvalue_set = httpContext.cgiGet( "COMBO_MEIVAID_Selectedvalue_set") ;
            Combo_meivaid_Selectedvalue_get = httpContext.cgiGet( "COMBO_MEIVAID_Selectedvalue_get") ;
            Combo_meivaid_Selectedtext_set = httpContext.cgiGet( "COMBO_MEIVAID_Selectedtext_set") ;
            Combo_meivaid_Selectedtext_get = httpContext.cgiGet( "COMBO_MEIVAID_Selectedtext_get") ;
            Combo_meivaid_Gamoauthtoken = httpContext.cgiGet( "COMBO_MEIVAID_Gamoauthtoken") ;
            Combo_meivaid_Ddointernalname = httpContext.cgiGet( "COMBO_MEIVAID_Ddointernalname") ;
            Combo_meivaid_Titlecontrolalign = httpContext.cgiGet( "COMBO_MEIVAID_Titlecontrolalign") ;
            Combo_meivaid_Dropdownoptionstype = httpContext.cgiGet( "COMBO_MEIVAID_Dropdownoptionstype") ;
            Combo_meivaid_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_MEIVAID_Enabled")) ;
            Combo_meivaid_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_MEIVAID_Visible")) ;
            Combo_meivaid_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_MEIVAID_Titlecontrolidtoreplace") ;
            Combo_meivaid_Datalisttype = httpContext.cgiGet( "COMBO_MEIVAID_Datalisttype") ;
            Combo_meivaid_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_MEIVAID_Allowmultipleselection")) ;
            Combo_meivaid_Datalistfixedvalues = httpContext.cgiGet( "COMBO_MEIVAID_Datalistfixedvalues") ;
            Combo_meivaid_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MEIVAID_Isgriditem")) ;
            Combo_meivaid_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_MEIVAID_Hasdescription")) ;
            Combo_meivaid_Datalistproc = httpContext.cgiGet( "COMBO_MEIVAID_Datalistproc") ;
            Combo_meivaid_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_MEIVAID_Datalistprocparametersprefix") ;
            Combo_meivaid_Remoteservicesparameters = httpContext.cgiGet( "COMBO_MEIVAID_Remoteservicesparameters") ;
            Combo_meivaid_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_MEIVAID_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_meivaid_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MEIVAID_Includeonlyselectedoption")) ;
            Combo_meivaid_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MEIVAID_Includeselectalloption")) ;
            Combo_meivaid_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MEIVAID_Emptyitem")) ;
            Combo_meivaid_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MEIVAID_Includeaddnewoption")) ;
            Combo_meivaid_Htmltemplate = httpContext.cgiGet( "COMBO_MEIVAID_Htmltemplate") ;
            Combo_meivaid_Multiplevaluestype = httpContext.cgiGet( "COMBO_MEIVAID_Multiplevaluestype") ;
            Combo_meivaid_Loadingdata = httpContext.cgiGet( "COMBO_MEIVAID_Loadingdata") ;
            Combo_meivaid_Noresultsfound = httpContext.cgiGet( "COMBO_MEIVAID_Noresultsfound") ;
            Combo_meivaid_Emptyitemtext = httpContext.cgiGet( "COMBO_MEIVAID_Emptyitemtext") ;
            Combo_meivaid_Onlyselectedvalues = httpContext.cgiGet( "COMBO_MEIVAID_Onlyselectedvalues") ;
            Combo_meivaid_Selectalltext = httpContext.cgiGet( "COMBO_MEIVAID_Selectalltext") ;
            Combo_meivaid_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_MEIVAID_Multiplevaluesseparator") ;
            Combo_meivaid_Addnewoptiontext = httpContext.cgiGet( "COMBO_MEIVAID_Addnewoptiontext") ;
            Combo_meivaid_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_MEIVAID_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable4_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Objectcall") ;
            Dvpanel_unnamedtable4_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Class") ;
            Dvpanel_unnamedtable4_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Enabled")) ;
            Dvpanel_unnamedtable4_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Width") ;
            Dvpanel_unnamedtable4_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Height") ;
            Dvpanel_unnamedtable4_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autowidth")) ;
            Dvpanel_unnamedtable4_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoheight")) ;
            Dvpanel_unnamedtable4_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Cls") ;
            Dvpanel_unnamedtable4_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Showheader")) ;
            Dvpanel_unnamedtable4_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Title") ;
            Dvpanel_unnamedtable4_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsible")) ;
            Dvpanel_unnamedtable4_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsed")) ;
            Dvpanel_unnamedtable4_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Showcollapseicon")) ;
            Dvpanel_unnamedtable4_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Iconposition") ;
            Dvpanel_unnamedtable4_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoscroll")) ;
            Dvpanel_unnamedtable4_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Visible")) ;
            Dvpanel_unnamedtable4_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_facfpg_Objectcall = httpContext.cgiGet( "COMBO_FACFPG_Objectcall") ;
            Combo_facfpg_Class = httpContext.cgiGet( "COMBO_FACFPG_Class") ;
            Combo_facfpg_Icontype = httpContext.cgiGet( "COMBO_FACFPG_Icontype") ;
            Combo_facfpg_Icon = httpContext.cgiGet( "COMBO_FACFPG_Icon") ;
            Combo_facfpg_Caption = httpContext.cgiGet( "COMBO_FACFPG_Caption") ;
            Combo_facfpg_Tooltip = httpContext.cgiGet( "COMBO_FACFPG_Tooltip") ;
            Combo_facfpg_Cls = httpContext.cgiGet( "COMBO_FACFPG_Cls") ;
            Combo_facfpg_Selectedvalue_set = httpContext.cgiGet( "COMBO_FACFPG_Selectedvalue_set") ;
            Combo_facfpg_Selectedvalue_get = httpContext.cgiGet( "COMBO_FACFPG_Selectedvalue_get") ;
            Combo_facfpg_Selectedtext_set = httpContext.cgiGet( "COMBO_FACFPG_Selectedtext_set") ;
            Combo_facfpg_Selectedtext_get = httpContext.cgiGet( "COMBO_FACFPG_Selectedtext_get") ;
            Combo_facfpg_Gamoauthtoken = httpContext.cgiGet( "COMBO_FACFPG_Gamoauthtoken") ;
            Combo_facfpg_Ddointernalname = httpContext.cgiGet( "COMBO_FACFPG_Ddointernalname") ;
            Combo_facfpg_Titlecontrolalign = httpContext.cgiGet( "COMBO_FACFPG_Titlecontrolalign") ;
            Combo_facfpg_Dropdownoptionstype = httpContext.cgiGet( "COMBO_FACFPG_Dropdownoptionstype") ;
            Combo_facfpg_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACFPG_Enabled")) ;
            Combo_facfpg_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACFPG_Visible")) ;
            Combo_facfpg_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_FACFPG_Titlecontrolidtoreplace") ;
            Combo_facfpg_Datalisttype = httpContext.cgiGet( "COMBO_FACFPG_Datalisttype") ;
            Combo_facfpg_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACFPG_Allowmultipleselection")) ;
            Combo_facfpg_Datalistfixedvalues = httpContext.cgiGet( "COMBO_FACFPG_Datalistfixedvalues") ;
            Combo_facfpg_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACFPG_Isgriditem")) ;
            Combo_facfpg_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACFPG_Hasdescription")) ;
            Combo_facfpg_Datalistproc = httpContext.cgiGet( "COMBO_FACFPG_Datalistproc") ;
            Combo_facfpg_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_FACFPG_Datalistprocparametersprefix") ;
            Combo_facfpg_Remoteservicesparameters = httpContext.cgiGet( "COMBO_FACFPG_Remoteservicesparameters") ;
            Combo_facfpg_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FACFPG_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_facfpg_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACFPG_Includeonlyselectedoption")) ;
            Combo_facfpg_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACFPG_Includeselectalloption")) ;
            Combo_facfpg_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACFPG_Emptyitem")) ;
            Combo_facfpg_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACFPG_Includeaddnewoption")) ;
            Combo_facfpg_Htmltemplate = httpContext.cgiGet( "COMBO_FACFPG_Htmltemplate") ;
            Combo_facfpg_Multiplevaluestype = httpContext.cgiGet( "COMBO_FACFPG_Multiplevaluestype") ;
            Combo_facfpg_Loadingdata = httpContext.cgiGet( "COMBO_FACFPG_Loadingdata") ;
            Combo_facfpg_Noresultsfound = httpContext.cgiGet( "COMBO_FACFPG_Noresultsfound") ;
            Combo_facfpg_Emptyitemtext = httpContext.cgiGet( "COMBO_FACFPG_Emptyitemtext") ;
            Combo_facfpg_Onlyselectedvalues = httpContext.cgiGet( "COMBO_FACFPG_Onlyselectedvalues") ;
            Combo_facfpg_Selectalltext = httpContext.cgiGet( "COMBO_FACFPG_Selectalltext") ;
            Combo_facfpg_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_FACFPG_Multiplevaluesseparator") ;
            Combo_facfpg_Addnewoptiontext = httpContext.cgiGet( "COMBO_FACFPG_Addnewoptiontext") ;
            Combo_facfpg_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FACFPG_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable5_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Objectcall") ;
            Dvpanel_unnamedtable5_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Class") ;
            Dvpanel_unnamedtable5_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Enabled")) ;
            Dvpanel_unnamedtable5_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Width") ;
            Dvpanel_unnamedtable5_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Height") ;
            Dvpanel_unnamedtable5_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autowidth")) ;
            Dvpanel_unnamedtable5_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoheight")) ;
            Dvpanel_unnamedtable5_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Cls") ;
            Dvpanel_unnamedtable5_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Showheader")) ;
            Dvpanel_unnamedtable5_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Title") ;
            Dvpanel_unnamedtable5_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsible")) ;
            Dvpanel_unnamedtable5_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsed")) ;
            Dvpanel_unnamedtable5_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Showcollapseicon")) ;
            Dvpanel_unnamedtable5_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Iconposition") ;
            Dvpanel_unnamedtable5_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoscroll")) ;
            Dvpanel_unnamedtable5_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Visible")) ;
            Dvpanel_unnamedtable5_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvelop_confirmpanel_eliminardocumento_Objectcall = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Objectcall") ;
            Dvelop_confirmpanel_eliminardocumento_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Enabled")) ;
            Dvelop_confirmpanel_eliminardocumento_Width = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Width") ;
            Dvelop_confirmpanel_eliminardocumento_Height = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Height") ;
            Dvelop_confirmpanel_eliminardocumento_Class = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Class") ;
            Dvelop_confirmpanel_eliminardocumento_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Title") ;
            Dvelop_confirmpanel_eliminardocumento_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Confirmationtext") ;
            Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Yesbuttoncaption") ;
            Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Nobuttoncaption") ;
            Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Cancelbuttoncaption") ;
            Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Yesbuttonposition") ;
            Dvelop_confirmpanel_eliminardocumento_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Confirmtype") ;
            Dvelop_confirmpanel_eliminardocumento_Comment = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Comment") ;
            Dvelop_confirmpanel_eliminardocumento_Bodytype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Bodytype") ;
            Dvelop_confirmpanel_eliminardocumento_Bodycontentinternalname = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Bodycontentinternalname") ;
            Dvelop_confirmpanel_eliminardocumento_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Result") ;
            Dvelop_confirmpanel_eliminardocumento_Texttype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Texttype") ;
            Dvelop_confirmpanel_eliminardocumento_Visible = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Visible")) ;
            /* Read variables values. */
            A430FacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtFacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
            if ( localUtil.vcdate( httpContext.cgiGet( edtFacFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "FACFCH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A436FacFch = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A436FacFch", localUtil.format(A436FacFch, "99/99/99"));
            }
            else
            {
               A436FacFch = localUtil.ctod( httpContext.cgiGet( edtFacFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A436FacFch", localUtil.format(A436FacFch, "99/99/99"));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtFacHor_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "FACHOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacHor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9606FacHor = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A9606FacHor", localUtil.ttoc( A9606FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A9606FacHor = localUtil.ctot( httpContext.cgiGet( edtFacHor_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9606FacHor", localUtil.ttoc( A9606FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            cmbFacEst.setName( cmbFacEst.getInternalname() );
            cmbFacEst.setValue( httpContext.cgiGet( cmbFacEst.getInternalname()) );
            A435FacEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbFacEst.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A435FacEst", GXutil.str( A435FacEst, 1, 0));
            A2739FacSerNum = httpContext.cgiGet( edtFacSerNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2739FacSerNum", A2739FacSerNum);
            cmbFacAnulada.setName( cmbFacAnulada.getInternalname() );
            cmbFacAnulada.setValue( httpContext.cgiGet( cmbFacAnulada.getInternalname()) );
            A14226FacAnulada = httpContext.cgiGet( cmbFacAnulada.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14226FacAnulada", A14226FacAnulada);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A11629MeivaId = httpContext.cgiGet( edtMeivaId_Internalname) ;
            n11629MeivaId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFacNumVto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFacNumVto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FACNUMVTO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacNumVto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1150FacNumVto = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
            }
            else
            {
               A1150FacNumVto = (byte)(localUtil.ctol( httpContext.cgiGet( edtFacNumVto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
            }
            A1151FacPer = httpContext.cgiGet( edtFacPer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
            A1152FacDiaPag = httpContext.cgiGet( edtFacDiaPag_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
            A437FacFpg = GXutil.upper( httpContext.cgiGet( edtFacFpg_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
            A7210FacObs = httpContext.cgiGet( edtFacObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7210FacObs", A7210FacObs);
            A11273FacObs2 = httpContext.cgiGet( edtFacObs2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11273FacObs2", A11273FacObs2);
            A441FacImpTot = localUtil.ctond( httpContext.cgiGet( edtFacImpTot_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFacDtoGen_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacDtoGen_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FACDTOGEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacDtoGen_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A433FacDtoGen = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
            }
            else
            {
               A433FacDtoGen = localUtil.ctond( httpContext.cgiGet( edtFacDtoGen_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
            }
            A439FacImpGen = localUtil.ctond( httpContext.cgiGet( edtFacImpGen_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacDto_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacDto_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FACDTO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacDto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6632FacDto = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A6632FacDto", GXutil.ltrimstr( A6632FacDto, 6, 2));
            }
            else
            {
               A6632FacDto = localUtil.ctond( httpContext.cgiGet( edtFacDto_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6632FacDto", GXutil.ltrimstr( A6632FacDto, 6, 2));
            }
            A440FacImpPP = localUtil.ctond( httpContext.cgiGet( edtFacImpPP_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
            A429FacBasImp = localUtil.ctond( httpContext.cgiGet( edtFacBasImp_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFacIVAPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFacIVAPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FACIVAPOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacIVAPor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A443FacIVAPor = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
            }
            else
            {
               A443FacIVAPor = (byte)(localUtil.ctol( httpContext.cgiGet( edtFacIVAPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
            }
            A442FacIVAImp = localUtil.ctond( httpContext.cgiGet( edtFacIVAImp_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
            A455FacTot = localUtil.ctond( httpContext.cgiGet( edtFacTot_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
            A9605FacFirma = httpContext.cgiGet( edtFacFirma_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9605FacFirma", A9605FacFirma);
            AV36Texto_fd = httpContext.cgiGet( edtavTexto_fd_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36Texto_fd", AV36Texto_fd);
            AV56Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
            AV42ComboMeivaId = httpContext.cgiGet( edtavCombomeivaid_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42ComboMeivaId", AV42ComboMeivaId);
            AV44ComboFacFpg = GXutil.upper( httpContext.cgiGet( edtavCombofacfpg_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44ComboFacFpg", AV44ComboFacFpg);
            A450FacPri = httpContext.cgiGet( edtFacPri_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", A450FacPri);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"MantenimientoFactura");
            A9605FacFirma = httpContext.cgiGet( edtFacFirma_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9605FacFirma", A9605FacFirma);
            forbiddenHiddens.add("FacFirma", GXutil.rtrim( localUtil.format( A9605FacFirma, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV56Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV56Pgmname, "")));
            forbiddenHiddens.add("FacIVACod", GXutil.rtrim( localUtil.format( A960FacIVACod, "@!")));
            A435FacEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbFacEst.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A435FacEst", GXutil.str( A435FacEst, 1, 0));
            forbiddenHiddens.add("FacEst", localUtil.format( DecimalUtil.doubleToDec(A435FacEst), "9"));
            forbiddenHiddens.add("FacLiC", localUtil.format( DecimalUtil.doubleToDec(A445FacLiC), "ZZ9"));
            forbiddenHiddens.add("FacCob", GXutil.rtrim( localUtil.format( A965FacCob, "")));
            forbiddenHiddens.add("Factrm", localUtil.format( A7211Factrm, "ZZZZ9.99999"));
            forbiddenHiddens.add("FacRect", localUtil.format( A7212FacRect, "ZZ9.99"));
            forbiddenHiddens.add("FacLiq1", localUtil.format( A9643FacLiq1, "ZZZZZZZZZ9.99999"));
            forbiddenHiddens.add("FacLiq2", localUtil.format( A9644FacLiq2, "ZZZZZZZZZ9.99999"));
            forbiddenHiddens.add("FacIva1", localUtil.format( A9645FacIva1, "ZZZZZZZZZ9.99999"));
            forbiddenHiddens.add("FacTot1", localUtil.format( A9646FacTot1, "ZZZZZZZZZ9.99999"));
            forbiddenHiddens.add("FacFirDg", GXutil.rtrim( localUtil.format( A9710FacFirDg, "")));
            forbiddenHiddens.add("FacCliPgL", localUtil.format( DecimalUtil.doubleToDec(A10417FacCliPgL), "9"));
            forbiddenHiddens.add("FacAran", GXutil.rtrim( localUtil.format( A10418FacAran, "")));
            forbiddenHiddens.add("FacBrut", localUtil.format( A10419FacBrut, "ZZZZZZ9.99"));
            forbiddenHiddens.add("FacNet", localUtil.format( A10420FacNet, "ZZZZZZ9.99"));
            forbiddenHiddens.add("FacInc", GXutil.rtrim( localUtil.format( A10421FacInc, "")));
            forbiddenHiddens.add("FacFre", GXutil.rtrim( localUtil.format( A10422FacFre, "")));
            forbiddenHiddens.add("FacExp", GXutil.rtrim( localUtil.format( A10423FacExp, "")));
            forbiddenHiddens.add("FacRecIca", localUtil.format( A11513FacRecIca, "ZZ9.999"));
            forbiddenHiddens.add("FacTpFra", GXutil.rtrim( localUtil.format( A12523FacTpFra, "")));
            forbiddenHiddens.add("FacMan", GXutil.rtrim( localUtil.format( A11626FacMan, "")));
            forbiddenHiddens.add("FacEnergia", localUtil.format( A14219FacEnergia, "ZZ9.99"));
            forbiddenHiddens.add("FacCostFac", localUtil.format( A14224FacCostFac, "ZZ9.99"));
            forbiddenHiddens.add("FacCostMts", localUtil.format( A14222FacCostMts, "ZZZZZZ9.99"));
            forbiddenHiddens.add("FacCostKgs", localUtil.format( A14223FacCostKgs, "ZZZZZZ9.99"));
            forbiddenHiddens.add("FacFecAnul", localUtil.format( A14227FacFecAnul, "99/99/99 99:99"));
            forbiddenHiddens.add("FacSFD", localUtil.format( A14229FacSFD, "99/99/99 99:99"));
            forbiddenHiddens.add("FacIDATe", GXutil.rtrim( localUtil.format( A14230FacIDATe, "")));
            forbiddenHiddens.add("FacMsgATe", GXutil.rtrim( localUtil.format( A14231FacMsgATe, "")));
            forbiddenHiddens.add("FacIDATc", GXutil.rtrim( localUtil.format( A14232FacIDATc, "")));
            forbiddenHiddens.add("FacMsgATc", GXutil.rtrim( localUtil.format( A14233FacMsgATc, "")));
            forbiddenHiddens.add("FacIDATd", GXutil.rtrim( localUtil.format( A14234FacIDATd, "")));
            forbiddenHiddens.add("FacMsgATd", GXutil.rtrim( localUtil.format( A14235FacMsgATd, "")));
            forbiddenHiddens.add("FacSerAT", GXutil.rtrim( localUtil.format( A14236FacSerAT, "")));
            forbiddenHiddens.add("FacTipAT", GXutil.rtrim( localUtil.format( A14237FacTipAT, "")));
            forbiddenHiddens.add("FacEnvMail", localUtil.format( A14420FacEnvMail, "99/99/99 99:99"));
            forbiddenHiddens.add("FacRecI", localUtil.format( A8346FacRecI, "ZZ9.99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A430FacCod != Z430FacCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("facturacion\\mantenimientofactura:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A430FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
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
                  sMode43 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode43 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound43 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1TR0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "FACCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFacCod_Internalname ;
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
                     if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO.CLOSE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e151TR2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e141TR2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e161TR2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOAGREGARDOCUMENTO'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoAgregarDocumento' */
                        e171TR2 ();
                        nKeyPressed = (byte)(3) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOBUSCARDOCUMENTO'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoBuscarDocumento' */
                        e181TR2 ();
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
         e161TR2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1TR43( ) ;
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
      if ( isDsp( ) || isDlt( ) )
      {
         if ( isDsp( ) )
         {
            bttBtntrn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
         }
         disableAttributes1TR43( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavTexto_fd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTexto_fd_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombomeivaid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombomeivaid_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofacfpg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofacfpg_Enabled), 5, 0), true);
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

   public void confirm_1TR0( )
   {
      beforeValidate1TR43( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1TR43( ) ;
         }
         else
         {
            checkExtendedTable1TR43( ) ;
            closeExtendedTableCursors1TR43( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode43 = Gx_mode ;
         confirm_1TR44( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode43 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode43 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1TR44( )
   {
      s3918FacImpTot1 = O3918FacImpTot1 ;
      n3918FacImpTot1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
      s14225FacImpEner = O14225FacImpEner ;
      httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
      s440FacImpPP = O440FacImpPP ;
      httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
      s439FacImpGen = O439FacImpGen ;
      httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
      s11515FacImpIca = O11515FacImpIca ;
      httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
      s7213FacImpRet = O7213FacImpRet ;
      httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
      s452FacRecImp = O452FacRecImp ;
      httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
      s8347FacImpReI = O8347FacImpReI ;
      httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
      s8348FacImpReI1 = O8348FacImpReI1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
      s442FacIVAImp = O442FacIVAImp ;
      httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
      s455FacTot = O455FacTot ;
      httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
      s3921FacIvaImp1 = O3921FacIvaImp1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
      s3922FacRecImp1 = O3922FacRecImp1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
      s7214FacImpRet1 = O7214FacImpRet1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
      s11514FacImpIca1 = O11514FacImpIca1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
      s429FacBasImp = O429FacBasImp ;
      httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
      s7215FacImpRet2 = O7215FacImpRet2 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
      s441FacImpTot = O441FacImpTot ;
      httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
      s3919FacImpGen1 = O3919FacImpGen1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
      s3920FacImpPP1 = O3920FacImpPP1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
      s14218FacImpEng1 = O14218FacImpEng1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
      nGXsfl_204_idx = 0 ;
      while ( nGXsfl_204_idx < nRC_GXsfl_204 )
      {
         readRow1TR44( ) ;
         if ( ( nRcdExists_44 != 0 ) || ( nIsMod_44 != 0 ) )
         {
            getKey1TR44( ) ;
            if ( ( nRcdExists_44 == 0 ) && ( nRcdDeleted_44 == 0 ) )
            {
               if ( RcdFound44 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1TR44( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1TR44( ) ;
                     closeExtendedTableCursors1TR44( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O3918FacImpTot1 = A3918FacImpTot1 ;
                     n3918FacImpTot1 = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
                     O14225FacImpEner = A14225FacImpEner ;
                     httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
                     O440FacImpPP = A440FacImpPP ;
                     httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
                     O439FacImpGen = A439FacImpGen ;
                     httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
                     O11515FacImpIca = A11515FacImpIca ;
                     httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
                     O7213FacImpRet = A7213FacImpRet ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
                     O452FacRecImp = A452FacRecImp ;
                     httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
                     O8347FacImpReI = A8347FacImpReI ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                     O8348FacImpReI1 = A8348FacImpReI1 ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
                     O442FacIVAImp = A442FacIVAImp ;
                     httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
                     O455FacTot = A455FacTot ;
                     httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
                     O3921FacIvaImp1 = A3921FacIvaImp1 ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
                     O3922FacRecImp1 = A3922FacRecImp1 ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
                     O7214FacImpRet1 = A7214FacImpRet1 ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
                     O11514FacImpIca1 = A11514FacImpIca1 ;
                     httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
                     O429FacBasImp = A429FacBasImp ;
                     httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
                     O7215FacImpRet2 = A7215FacImpRet2 ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
                     O441FacImpTot = A441FacImpTot ;
                     httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
                     O3919FacImpGen1 = A3919FacImpGen1 ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
                     O3920FacImpPP1 = A3920FacImpPP1 ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
                     O14218FacImpEng1 = A14218FacImpEng1 ;
                     httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound44 != 0 )
               {
                  if ( nRcdDeleted_44 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1TR44( ) ;
                     load1TR44( ) ;
                     beforeValidate1TR44( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1TR44( ) ;
                        O3918FacImpTot1 = A3918FacImpTot1 ;
                        n3918FacImpTot1 = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
                        O14225FacImpEner = A14225FacImpEner ;
                        httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
                        O440FacImpPP = A440FacImpPP ;
                        httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
                        O439FacImpGen = A439FacImpGen ;
                        httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
                        O11515FacImpIca = A11515FacImpIca ;
                        httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
                        O7213FacImpRet = A7213FacImpRet ;
                        httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
                        O452FacRecImp = A452FacRecImp ;
                        httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
                        O8347FacImpReI = A8347FacImpReI ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                        O8348FacImpReI1 = A8348FacImpReI1 ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
                        O442FacIVAImp = A442FacIVAImp ;
                        httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
                        O455FacTot = A455FacTot ;
                        httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
                        O3921FacIvaImp1 = A3921FacIvaImp1 ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
                        O3922FacRecImp1 = A3922FacRecImp1 ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
                        O7214FacImpRet1 = A7214FacImpRet1 ;
                        httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
                        O11514FacImpIca1 = A11514FacImpIca1 ;
                        httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
                        O429FacBasImp = A429FacBasImp ;
                        httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
                        O7215FacImpRet2 = A7215FacImpRet2 ;
                        httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
                        O441FacImpTot = A441FacImpTot ;
                        httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
                        O3919FacImpGen1 = A3919FacImpGen1 ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
                        O3920FacImpPP1 = A3920FacImpPP1 ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
                        O14218FacImpEng1 = A14218FacImpEng1 ;
                        httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
                     }
                  }
                  else
                  {
                     if ( nIsMod_44 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1TR44( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1TR44( ) ;
                           closeExtendedTableCursors1TR44( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O3918FacImpTot1 = A3918FacImpTot1 ;
                           n3918FacImpTot1 = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
                           O14225FacImpEner = A14225FacImpEner ;
                           httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
                           O440FacImpPP = A440FacImpPP ;
                           httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
                           O439FacImpGen = A439FacImpGen ;
                           httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
                           O11515FacImpIca = A11515FacImpIca ;
                           httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
                           O7213FacImpRet = A7213FacImpRet ;
                           httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
                           O452FacRecImp = A452FacRecImp ;
                           httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
                           O8347FacImpReI = A8347FacImpReI ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                           O8348FacImpReI1 = A8348FacImpReI1 ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
                           O442FacIVAImp = A442FacIVAImp ;
                           httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
                           O455FacTot = A455FacTot ;
                           httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
                           O3921FacIvaImp1 = A3921FacIvaImp1 ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
                           O3922FacRecImp1 = A3922FacRecImp1 ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
                           O7214FacImpRet1 = A7214FacImpRet1 ;
                           httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
                           O11514FacImpIca1 = A11514FacImpIca1 ;
                           httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
                           O429FacBasImp = A429FacBasImp ;
                           httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
                           O7215FacImpRet2 = A7215FacImpRet2 ;
                           httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
                           O441FacImpTot = A441FacImpTot ;
                           httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
                           O3919FacImpGen1 = A3919FacImpGen1 ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
                           O3920FacImpPP1 = A3920FacImpPP1 ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
                           O14218FacImpEng1 = A14218FacImpEng1 ;
                           httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_44 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtFacLin_Internalname, GXutil.ltrim( localUtil.ntoc( A446FacLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacAlbCod_Internalname, GXutil.ltrim( localUtil.ntoc( A427FacAlbCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacAlbTip_Internalname, GXutil.ltrim( localUtil.ntoc( A428FacAlbTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacNHdr_Internalname, GXutil.rtrim( A14247FacNHdr)) ;
         httpContext.changePostValue( edtFacMts_Internalname, GXutil.ltrim( localUtil.ntoc( A447FacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacPreMts_Internalname, GXutil.ltrim( localUtil.ntoc( A449FacPreMts, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A444FacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacPreKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A448FacPreKgs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacUnds_Internalname, GXutil.ltrim( localUtil.ntoc( A12197FacUnds, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacPreUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A12198FacPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacRec_Internalname, GXutil.ltrim( localUtil.ntoc( A451FacRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacBonLi_Internalname, GXutil.ltrim( localUtil.ntoc( A5050FacBonLi, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacImp_Internalname, GXutil.ltrim( localUtil.ntoc( A438FacImp, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacSer_Internalname, GXutil.rtrim( A454FacSer)) ;
         httpContext.changePostValue( edtFacBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1294FacBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A1295FacBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacBarPar_Internalname, GXutil.rtrim( A1296FacBarPar)) ;
         httpContext.changePostValue( edtFacDsc_Internalname, GXutil.rtrim( A432FacDsc)) ;
         httpContext.changePostValue( edtFacFasCod_Internalname, GXutil.rtrim( A3397FacFasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z446FacLin_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z446FacLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5050FacBonLi_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z5050FacBonLi, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z427FacAlbCod_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z427FacAlbCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1294FacBarCod_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z1294FacBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1295FacBarReo_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z1295FacBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1296FacBarPar_"+sGXsfl_204_idx, GXutil.rtrim( Z1296FacBarPar)) ;
         httpContext.changePostValue( "ZT_"+"Z428FacAlbTip_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z428FacAlbTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z454FacSer_"+sGXsfl_204_idx, GXutil.rtrim( Z454FacSer)) ;
         httpContext.changePostValue( "ZT_"+"Z432FacDsc_"+sGXsfl_204_idx, GXutil.rtrim( Z432FacDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z1498FacDisNum_"+sGXsfl_204_idx, GXutil.rtrim( Z1498FacDisNum)) ;
         httpContext.changePostValue( "ZT_"+"Z447FacMts_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z447FacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z449FacPreMts_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z449FacPreMts, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z444FacKgs_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z444FacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z448FacPreKgs_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z448FacPreKgs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z451FacRec_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z451FacRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3097FacTipPro_"+sGXsfl_204_idx, GXutil.rtrim( Z3097FacTipPro)) ;
         httpContext.changePostValue( "ZT_"+"Z3303FacNPart_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z3303FacNPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3397FacFasCod_"+sGXsfl_204_idx, GXutil.rtrim( Z3397FacFasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z3878FacColNom_"+sGXsfl_204_idx, GXutil.rtrim( Z3878FacColNom)) ;
         httpContext.changePostValue( "ZT_"+"Z3879FocColNum_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z3879FocColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3880FacTipColC_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z3880FacTipColC, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3881FacNomCol_"+sGXsfl_204_idx, GXutil.rtrim( Z3881FacNomCol)) ;
         httpContext.changePostValue( "ZT_"+"Z3882FacNumCol_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z3882FacNumCol, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3883FacCliCod_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z3883FacCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3884FacProCod_"+sGXsfl_204_idx, GXutil.rtrim( Z3884FacProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4389FacDsc2_"+sGXsfl_204_idx, GXutil.rtrim( Z4389FacDsc2)) ;
         httpContext.changePostValue( "ZT_"+"Z4814FacEncCli_"+sGXsfl_204_idx, GXutil.rtrim( Z4814FacEncCli)) ;
         httpContext.changePostValue( "ZT_"+"Z5172FacDishCod_"+sGXsfl_204_idx, GXutil.rtrim( Z5172FacDishCod)) ;
         httpContext.changePostValue( "ZT_"+"Z5189FacTipArt_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z5189FacTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5353FacImpMan_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z5353FacImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5355FacImpMin_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z5355FacImpMin, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3898FacPreKgsA_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z3898FacPreKgsA, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6837FacCosPQ_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z6837FacCosPQ, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9647FacImpdto_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z9647FacImpdto, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9648FacDtoL_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z9648FacDtoL, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9649FacPKDto_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z9649FacPKDto, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9650FacPMdto_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z9650FacPMdto, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9651FacImpd_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z9651FacImpd, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9708FacDscII_"+sGXsfl_204_idx, GXutil.rtrim( Z9708FacDscII)) ;
         httpContext.changePostValue( "ZT_"+"Z10271FacAcs_"+sGXsfl_204_idx, GXutil.rtrim( Z10271FacAcs)) ;
         httpContext.changePostValue( "ZT_"+"Z3897FacKgsA_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z3897FacKgsA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3899FacFecAlb_"+sGXsfl_204_idx, localUtil.dtoc( Z3899FacFecAlb, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z12197FacUnds_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z12197FacUnds, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12198FacPreUnd_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z12198FacPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12906FacCadEnc_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z12906FacCadEnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14238FacLinTRM_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z14238FacLinTRM, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14239FACLinTRMF_"+sGXsfl_204_idx, localUtil.ttoc( Z14239FACLinTRMF, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "T438FacImp_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( O438FacImp, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T448FacPreKgs_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( O448FacPreKgs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T449FacPreMts_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( O449FacPreMts, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_44_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_44, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_44_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_44, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_44_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_44, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N5353FacImpMan_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( A5353FacImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N432FacDsc_"+sGXsfl_204_idx, GXutil.rtrim( A432FacDsc)) ;
         httpContext.changePostValue( "N5355FacImpMin_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( A5355FacImpMin, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N447FacMts_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( A447FacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N449FacPreMts_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( A449FacPreMts, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N444FacKgs_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( A444FacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N448FacPreKgs_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( A448FacPreKgs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N5050FacBonLi_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( A5050FacBonLi, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_44 != 0 )
         {
            httpContext.changePostValue( "FACLIN_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACALBCOD_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacAlbCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACALBTIP_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacAlbTip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACNHDR_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacNHdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACMTS_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPREMTS_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACKGS_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPREKGS_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACUNDS_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacUnds_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPREUND_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACREC_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACBONLI_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacBonLi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACBONLI_"+sGXsfl_204_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtFacBonLi_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACIMP_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacImp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACSER_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACBARCOD_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACBARREO_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacBarReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACBARPAR_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacBarPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACDSC_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACFASCOD_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O3918FacImpTot1 = s3918FacImpTot1 ;
      n3918FacImpTot1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
      O14225FacImpEner = s14225FacImpEner ;
      httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
      O440FacImpPP = s440FacImpPP ;
      httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
      O439FacImpGen = s439FacImpGen ;
      httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
      O11515FacImpIca = s11515FacImpIca ;
      httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
      O7213FacImpRet = s7213FacImpRet ;
      httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
      O452FacRecImp = s452FacRecImp ;
      httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
      O8347FacImpReI = s8347FacImpReI ;
      httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
      O8348FacImpReI1 = s8348FacImpReI1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
      O442FacIVAImp = s442FacIVAImp ;
      httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
      O455FacTot = s455FacTot ;
      httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
      O3921FacIvaImp1 = s3921FacIvaImp1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
      O3922FacRecImp1 = s3922FacRecImp1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
      O7214FacImpRet1 = s7214FacImpRet1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
      O11514FacImpIca1 = s11514FacImpIca1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
      O429FacBasImp = s429FacBasImp ;
      httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
      O7215FacImpRet2 = s7215FacImpRet2 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
      O441FacImpTot = s441FacImpTot ;
      httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
      O3919FacImpGen1 = s3919FacImpGen1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
      O3920FacImpPP1 = s3920FacImpPP1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
      O14218FacImpEng1 = s14218FacImpEng1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1TR0( )
   {
   }

   public void e141TR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mantenimientofactura_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV53EmprNom ;
      GXv_char4[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      mantenimientofactura_impl.this.AV7EmprCod = GXv_char2[0] ;
      mantenimientofactura_impl.this.AV53EmprNom = GXv_char3[0] ;
      mantenimientofactura_impl.this.AV21UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV53EmprNom", AV53EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
      GXv_SdtWWPContext5[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV9WWPContext = GXv_SdtWWPContext5[0] ;
      edtFacFpg_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacFpg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFpg_Visible), 5, 0), true);
      AV44ComboFacFpg = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44ComboFacFpg", AV44ComboFacFpg);
      edtavCombofacfpg_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofacfpg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofacfpg_Visible), 5, 0), true);
      edtMeivaId_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMeivaId_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMeivaId_Visible), 5, 0), true);
      AV42ComboMeivaId = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42ComboMeivaId", AV42ComboMeivaId);
      edtavCombomeivaid_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombomeivaid_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombomeivaid_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOMEIVAID' */
      S112 ();
      if ( returnInSub )
      {
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
      /* Execute user subroutine: 'LOADCOMBOFACFPG' */
      S122 ();
      if ( returnInSub )
      {
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
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S132 ();
      if ( returnInSub )
      {
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
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV10TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV56Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV57GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57GXV1), 8, 0));
         while ( AV57GXV1 <= AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV15TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV57GXV1));
            if ( GXutil.strcmp(AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CliCod") == 0 )
            {
               AV12Insert_CliCod = (int)(GXutil.lval( AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Insert_CliCod), 6, 0));
            }
            else if ( GXutil.strcmp(AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "MotAnuID") == 0 )
            {
               AV13Insert_MotAnuID = AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_MotAnuID", AV13Insert_MotAnuID);
            }
            else if ( GXutil.strcmp(AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "MeivaId") == 0 )
            {
               AV14Insert_MeivaId = AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14Insert_MeivaId", AV14Insert_MeivaId);
               if ( ! (GXutil.strcmp("", AV14Insert_MeivaId)==0) )
               {
                  AV42ComboMeivaId = AV14Insert_MeivaId ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV42ComboMeivaId", AV42ComboMeivaId);
                  Combo_meivaid_Selectedvalue_set = AV42ComboMeivaId ;
                  ucCombo_meivaid.sendProperty(context, "", false, Combo_meivaid_Internalname, "SelectedValue_set", Combo_meivaid_Selectedvalue_set);
                  Combo_meivaid_Enabled = false ;
                  ucCombo_meivaid.sendProperty(context, "", false, Combo_meivaid_Internalname, "Enabled", GXutil.booltostr( Combo_meivaid_Enabled));
               }
            }
            AV57GXV1 = (int)(AV57GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57GXV1), 8, 0));
         }
      }
      edtFacPri_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacPri_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPri_Visible), 5, 0), true);
      AV18FlagIns = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18FlagIns", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18FlagIns), 4, 0));
      GXv_int6[0] = (byte)(AV18FlagIns) ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "INSALB", ""), GXv_int6) ;
      mantenimientofactura_impl.this.AV18FlagIns = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18FlagIns", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18FlagIns), 4, 0));
      GXv_int6[0] = (byte)(AV23FlagTintu) ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int6) ;
      mantenimientofactura_impl.this.AV23FlagTintu = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23FlagTintu", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23FlagTintu), 4, 0));
      GXv_int6[0] = (byte)(AV24F_carvema) ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
      mantenimientofactura_impl.this.AV24F_carvema = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24F_carvema", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24F_carvema), 4, 0));
      GXv_int6[0] = (byte)(AV25FlagEtx) ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int6) ;
      mantenimientofactura_impl.this.AV25FlagEtx = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25FlagEtx", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25FlagEtx), 4, 0));
      AV26EuroVal = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26EuroVal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26EuroVal), 4, 0));
      GXv_int7[0] = AV26EuroVal ;
      new app.pbuscon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "EURO  ", ""), GXv_int7) ;
      mantenimientofactura_impl.this.AV26EuroVal = (short)((short)(GXv_int7[0])) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26EuroVal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26EuroVal), 4, 0));
      AV27ValEuro = DecimalUtil.doubleToDec(AV26EuroVal/ (double) (1000)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27ValEuro", GXutil.ltrimstr( AV27ValEuro, 8, 3));
      AV28Flag_AF = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Flag_AF", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Flag_AF), 4, 0));
      GXv_int6[0] = (byte)(AV28Flag_AF) ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "FAMAN1", ""), GXv_int6) ;
      mantenimientofactura_impl.this.AV28Flag_AF = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Flag_AF", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Flag_AF), 4, 0));
      GXv_int6[0] = (byte)(AV29RieClF) ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "RIECLF", ""), GXv_int6) ;
      mantenimientofactura_impl.this.AV29RieClF = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29RieClF", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29RieClF), 4, 0));
      AV30FacImpM = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30FacImpM", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30FacImpM), 4, 0));
      GXv_int6[0] = (byte)(AV30FacImpM) ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "FACIMM", ""), GXv_int6) ;
      mantenimientofactura_impl.this.AV30FacImpM = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30FacImpM", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30FacImpM), 4, 0));
      GXt_int8 = (byte)(AV31F_Tinamar) ;
      GXv_int6[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int6) ;
      mantenimientofactura_impl.this.GXt_int8 = GXv_int6[0] ;
      AV31F_Tinamar = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31F_Tinamar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31F_Tinamar), 4, 0));
      GXt_int8 = (byte)(AV20Tintutex) ;
      GXv_int6[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int6) ;
      mantenimientofactura_impl.this.GXt_int8 = GXv_int6[0] ;
      AV20Tintutex = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Tintutex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Tintutex), 4, 0));
      GXt_int8 = (byte)(AV32ImpMin) ;
      GXv_int6[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "FACMIN", ""), GXv_int6) ;
      mantenimientofactura_impl.this.GXt_int8 = GXv_int6[0] ;
      AV32ImpMin = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32ImpMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32ImpMin), 4, 0));
      GXt_int8 = (byte)(AV33Moda21) ;
      GXv_int6[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      mantenimientofactura_impl.this.GXt_int8 = GXv_int6[0] ;
      AV33Moda21 = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Moda21), 4, 0));
      GXt_int8 = (byte)(AV19FirmaD) ;
      GXv_int6[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "FIRDIG", ""), GXv_int6) ;
      mantenimientofactura_impl.this.GXt_int8 = GXv_int6[0] ;
      AV19FirmaD = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19FirmaD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19FirmaD), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19FirmaD), "ZZZ9")));
      GXt_char1 = AV34ContDsc ;
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "FIRDIG", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      mantenimientofactura_impl.this.AV7EmprCod = GXv_char4[0] ;
      mantenimientofactura_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      AV34ContDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34ContDsc", AV34ContDsc);
      GXt_int8 = (byte)(AV35HashRecalculo) ;
      GXv_int6[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "RECHSH", ""), GXv_int6) ;
      mantenimientofactura_impl.this.GXt_int8 = GXv_int6[0] ;
      AV35HashRecalculo = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35HashRecalculo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35HashRecalculo), 4, 0));
      AV36Texto_fd = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Texto_fd", AV36Texto_fd);
      if ( AV19FirmaD == 1 )
      {
         AV36Texto_fd = "Assinatura digital é ativada." ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Texto_fd", AV36Texto_fd);
      }
      GXt_int8 = (byte)(AV37PdfGx16) ;
      GXv_int6[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "PDFFRA", ""), GXv_int6) ;
      mantenimientofactura_impl.this.GXt_int8 = GXv_int6[0] ;
      AV37PdfGx16 = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37PdfGx16", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37PdfGx16), 4, 0));
      GXt_int8 = (byte)(AV38impenergtico) ;
      GXv_int6[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "IMPENG", ""), GXv_int6) ;
      mantenimientofactura_impl.this.GXt_int8 = GXv_int6[0] ;
      AV38impenergtico = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38impenergtico", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38impenergtico), 4, 0));
      GXt_int8 = (byte)(AV39eiva) ;
      GXv_int6[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "EXIVA", ""), GXv_int6) ;
      mantenimientofactura_impl.this.GXt_int8 = GXv_int6[0] ;
      AV39eiva = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39eiva", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39eiva), 4, 0));
      bttBtnagregardocumento_Visible = (((GXutil.strcmp(Gx_mode, "DSP")==0) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnagregardocumento_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnagregardocumento_Visible), 5, 0), true);
      bttBtneliminardocumento_Visible = (((GXutil.strcmp(Gx_mode, "DSP")==0) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtneliminardocumento_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtneliminardocumento_Visible), 5, 0), true);
      bttBtnbuscardocumento_Visible = (((GXutil.strcmp(Gx_mode, "DSP")==0) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnbuscardocumento_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnbuscardocumento_Visible), 5, 0), true);
   }

   public void e161TR2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( ( AV19FirmaD == 1 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) ) || ( ( A435FacEst == 2 ) ) )
      {
      }
      else
      {
         GXv_char4[0] = AV47Cadena ;
         GXv_char3[0] = AV48firma ;
         new app.obtengocadenaparahashdocumentofactura(remoteHandle, context).execute( A396EmprCod, A430FacCod, A9606FacHor, GXv_char4, GXv_char3) ;
         mantenimientofactura_impl.this.AV47Cadena = GXv_char4[0] ;
         mantenimientofactura_impl.this.AV48firma = GXv_char3[0] ;
         GXv_char4[0] = AV49Hash ;
         GXv_objcol_SdtMessages_Message9[0] = AV50Messages ;
         GXv_boolean10[0] = AV51ok ;
         new app.hash_obtener(remoteHandle, context).execute( AV47Cadena, GXv_char4, GXv_objcol_SdtMessages_Message9, GXv_boolean10) ;
         mantenimientofactura_impl.this.AV49Hash = GXv_char4[0] ;
         AV50Messages = GXv_objcol_SdtMessages_Message9[0] ;
         mantenimientofactura_impl.this.AV51ok = GXv_boolean10[0] ;
         if ( AV51ok )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int7[0] = A430FacCod ;
            GXv_char3[0] = AV47Cadena ;
            GXv_char2[0] = AV49Hash ;
            new app.facturacion.actualizohashdocumentofactura(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_char2) ;
            mantenimientofactura_impl.this.A396EmprCod = GXv_char4[0] ;
            mantenimientofactura_impl.this.A430FacCod = GXv_int7[0] ;
            mantenimientofactura_impl.this.AV47Cadena = GXv_char3[0] ;
            mantenimientofactura_impl.this.AV49Hash = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Hash creado correctamente", ""));
         }
         else
         {
            AV58GXV2 = 1 ;
            while ( AV58GXV2 <= AV50Messages.size() )
            {
               AV52Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV50Messages.elementAt(-1+AV58GXV2));
               httpContext.GX_msglist.addItem(AV52Message.getgxTv_SdtMessages_Message_Description());
               AV58GXV2 = (int)(AV58GXV2+1) ;
            }
         }
         if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
         {
            callWebObject(formatLink("app.facturacion.mantenimientofacturaww", new String[] {}, new String[] {}) );
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
      /*  Sending Event outputs  */
   }

   public void e171TR2( )
   {
      /* 'DoAgregarDocumento' Routine */
      returnInSub = false ;
      if ( ( AV19FirmaD == 1 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Assinatura digital é ativada.", ""));
      }
      else
      {
         if ( A435FacEst == 2 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Factura Actualizada", ""));
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
            {
               httpContext.popup(formatLink("app.facturacion.agregardocumentofactura", new String[] {GXutil.URLEncode(GXutil.rtrim(AV45EmpCod)),GXutil.URLEncode(GXutil.ltrimstr(A430FacCod,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(A9606FacHor))}, new String[] {"EmpCod","FacCod","FacHor"}) , new Object[] {});
               callWebObject(formatLink("app.facturacion.mantenimientofactura", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A430FacCod,8,0))}, new String[] {"Mode","EmprCod","FacCod"}) );
               httpContext.wjLocDisableFrm = (byte)(1) ;
            }
         }
      }
   }

   public void e151TR2( )
   {
      /* Dvelop_confirmpanel_eliminardocumento_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminardocumento_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARDOCUMENTO' */
         S142 ();
         if ( returnInSub )
         {
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
      }
      /*  Sending Event outputs  */
   }

   public void e181TR2( )
   {
      /* 'DoBuscarDocumento' Routine */
      returnInSub = false ;
      if ( ( AV19FirmaD == 1 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Assinatura digital é ativada.", ""));
      }
      else
      {
         if ( A435FacEst == 2 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Factura Actualizada", ""));
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
            {
               httpContext.popup(formatLink("app.facturacion.buscardocumentofactura", new String[] {GXutil.URLEncode(GXutil.rtrim(AV45EmpCod)),GXutil.URLEncode(GXutil.ltrimstr(A430FacCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A427FacAlbCod,10,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(A9606FacHor)),GXutil.URLEncode(GXutil.ltrimstr(A428FacAlbTip,1,0))}, new String[] {"Emprcod","FacCod","FacAlbCod","FacHor","FacAlbTip"}) , new Object[] {});
               callWebObject(formatLink("app.facturacion.mantenimientofactura", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A430FacCod,8,0))}, new String[] {"Mode","EmprCod","FacCod"}) );
               httpContext.wjLocDisableFrm = (byte)(1) ;
            }
         }
      }
   }

   public void S142( )
   {
      /* 'DO ACTION ELIMINARDOCUMENTO' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV45EmpCod ;
      GXv_int7[0] = A430FacCod ;
      GXv_int6[0] = A428FacAlbTip ;
      GXv_int11[0] = A427FacAlbCod ;
      GXv_dtime12[0] = A9606FacHor ;
      new app.pelialb(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_int11, GXv_dtime12) ;
      mantenimientofactura_impl.this.AV45EmpCod = GXv_char4[0] ;
      mantenimientofactura_impl.this.A430FacCod = GXv_int7[0] ;
      mantenimientofactura_impl.this.A428FacAlbTip = GXv_int6[0] ;
      mantenimientofactura_impl.this.A427FacAlbCod = GXv_int11[0] ;
      mantenimientofactura_impl.this.A9606FacHor = GXv_dtime12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45EmpCod", AV45EmpCod);
      httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A9606FacHor", localUtil.ttoc( A9606FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      callWebObject(formatLink("app.facturacion.mantenimientofactura", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A430FacCod,8,0))}, new String[] {"Mode","EmprCod","FacCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      edtFacObs_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacObs_Visible), 5, 0), true);
      divFacobs_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divFacobs_cell_Internalname, "Class", divFacobs_cell_Class, true);
      divFacobs2_cell_Class = "col-xs-12 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divFacobs2_cell_Internalname, "Class", divFacobs2_cell_Class, true);
      if ( ( edtFacObs_Visible == ( 0 )) && ( edtFacObs2_Visible == ( 0 )) )
      {
         divUnnamedtable10_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable10_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable10_Visible), 5, 0), true);
      }
   }

   public void S122( )
   {
      /* 'LOADCOMBOFACFPG' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item13 = AV43FacFpg_Data ;
      GXv_char4[0] = AV41ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item14[0] = GXt_objcol_SdtDVB_SDTComboData_Item13 ;
      new app.facturacion.mantenimientofacturaloaddvcombo(remoteHandle, context).execute( "FacFpg", Gx_mode, AV7EmprCod, AV8FacCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item14) ;
      mantenimientofactura_impl.this.AV41ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item13 = GXv_objcol_SdtDVB_SDTComboData_Item14[0] ;
      AV43FacFpg_Data = GXt_objcol_SdtDVB_SDTComboData_Item13 ;
      Combo_facfpg_Selectedvalue_set = AV41ComboSelectedValue ;
      ucCombo_facfpg.sendProperty(context, "", false, Combo_facfpg_Internalname, "SelectedValue_set", Combo_facfpg_Selectedvalue_set);
      AV44ComboFacFpg = AV41ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44ComboFacFpg", AV44ComboFacFpg);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_facfpg_Enabled = false ;
         ucCombo_facfpg.sendProperty(context, "", false, Combo_facfpg_Internalname, "Enabled", GXutil.booltostr( Combo_facfpg_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOMEIVAID' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item13 = AV40MeivaId_Data ;
      GXv_char4[0] = AV41ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item14[0] = GXt_objcol_SdtDVB_SDTComboData_Item13 ;
      new app.facturacion.mantenimientofacturaloaddvcombo(remoteHandle, context).execute( "MeivaId", Gx_mode, AV7EmprCod, AV8FacCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item14) ;
      mantenimientofactura_impl.this.AV41ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item13 = GXv_objcol_SdtDVB_SDTComboData_Item14[0] ;
      AV40MeivaId_Data = GXt_objcol_SdtDVB_SDTComboData_Item13 ;
      Combo_meivaid_Selectedvalue_set = AV41ComboSelectedValue ;
      ucCombo_meivaid.sendProperty(context, "", false, Combo_meivaid_Internalname, "SelectedValue_set", Combo_meivaid_Selectedvalue_set);
      AV42ComboMeivaId = AV41ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42ComboMeivaId", AV42ComboMeivaId);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_meivaid_Enabled = false ;
         ucCombo_meivaid.sendProperty(context, "", false, Combo_meivaid_Internalname, "Enabled", GXutil.booltostr( Combo_meivaid_Enabled));
      }
   }

   public void zm1TR43( int GX_JID )
   {
      if ( ( GX_JID == 143 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z437FacFpg = T01TR5_A437FacFpg[0] ;
            Z436FacFch = T01TR5_A436FacFch[0] ;
            Z450FacPri = T01TR5_A450FacPri[0] ;
            Z433FacDtoGen = T01TR5_A433FacDtoGen[0] ;
            Z434FacDtoPP = T01TR5_A434FacDtoPP[0] ;
            Z960FacIVACod = T01TR5_A960FacIVACod[0] ;
            Z443FacIVAPor = T01TR5_A443FacIVAPor[0] ;
            Z453FacRECPor = T01TR5_A453FacRECPor[0] ;
            Z435FacEst = T01TR5_A435FacEst[0] ;
            Z445FacLiC = T01TR5_A445FacLiC[0] ;
            Z965FacCob = T01TR5_A965FacCob[0] ;
            Z1150FacNumVto = T01TR5_A1150FacNumVto[0] ;
            Z1151FacPer = T01TR5_A1151FacPer[0] ;
            Z1152FacDiaPag = T01TR5_A1152FacDiaPag[0] ;
            Z1153FacTipFac = T01TR5_A1153FacTipFac[0] ;
            Z2739FacSerNum = T01TR5_A2739FacSerNum[0] ;
            Z6632FacDto = T01TR5_A6632FacDto[0] ;
            Z7211Factrm = T01TR5_A7211Factrm[0] ;
            Z7212FacRect = T01TR5_A7212FacRect[0] ;
            Z9605FacFirma = T01TR5_A9605FacFirma[0] ;
            Z9606FacHor = T01TR5_A9606FacHor[0] ;
            Z9643FacLiq1 = T01TR5_A9643FacLiq1[0] ;
            Z9644FacLiq2 = T01TR5_A9644FacLiq2[0] ;
            Z9645FacIva1 = T01TR5_A9645FacIva1[0] ;
            Z9646FacTot1 = T01TR5_A9646FacTot1[0] ;
            Z9710FacFirDg = T01TR5_A9710FacFirDg[0] ;
            Z10417FacCliPgL = T01TR5_A10417FacCliPgL[0] ;
            Z10418FacAran = T01TR5_A10418FacAran[0] ;
            Z10419FacBrut = T01TR5_A10419FacBrut[0] ;
            Z10420FacNet = T01TR5_A10420FacNet[0] ;
            Z10421FacInc = T01TR5_A10421FacInc[0] ;
            Z10422FacFre = T01TR5_A10422FacFre[0] ;
            Z10423FacExp = T01TR5_A10423FacExp[0] ;
            Z11513FacRecIca = T01TR5_A11513FacRecIca[0] ;
            Z12523FacTpFra = T01TR5_A12523FacTpFra[0] ;
            Z11626FacMan = T01TR5_A11626FacMan[0] ;
            Z14219FacEnergia = T01TR5_A14219FacEnergia[0] ;
            Z14224FacCostFac = T01TR5_A14224FacCostFac[0] ;
            Z14222FacCostMts = T01TR5_A14222FacCostMts[0] ;
            Z14223FacCostKgs = T01TR5_A14223FacCostKgs[0] ;
            Z14226FacAnulada = T01TR5_A14226FacAnulada[0] ;
            Z14227FacFecAnul = T01TR5_A14227FacFecAnul[0] ;
            Z14229FacSFD = T01TR5_A14229FacSFD[0] ;
            Z14230FacIDATe = T01TR5_A14230FacIDATe[0] ;
            Z14231FacMsgATe = T01TR5_A14231FacMsgATe[0] ;
            Z14232FacIDATc = T01TR5_A14232FacIDATc[0] ;
            Z14233FacMsgATc = T01TR5_A14233FacMsgATc[0] ;
            Z14234FacIDATd = T01TR5_A14234FacIDATd[0] ;
            Z14235FacMsgATd = T01TR5_A14235FacMsgATd[0] ;
            Z14236FacSerAT = T01TR5_A14236FacSerAT[0] ;
            Z14237FacTipAT = T01TR5_A14237FacTipAT[0] ;
            Z11273FacObs2 = T01TR5_A11273FacObs2[0] ;
            Z14420FacEnvMail = T01TR5_A14420FacEnvMail[0] ;
            Z8346FacRecI = T01TR5_A8346FacRecI[0] ;
            Z252CliCod = T01TR5_A252CliCod[0] ;
            Z11629MeivaId = T01TR5_A11629MeivaId[0] ;
            Z14217MotAnuID = T01TR5_A14217MotAnuID[0] ;
         }
         else
         {
            Z437FacFpg = A437FacFpg ;
            Z436FacFch = A436FacFch ;
            Z450FacPri = A450FacPri ;
            Z433FacDtoGen = A433FacDtoGen ;
            Z434FacDtoPP = A434FacDtoPP ;
            Z960FacIVACod = A960FacIVACod ;
            Z443FacIVAPor = A443FacIVAPor ;
            Z453FacRECPor = A453FacRECPor ;
            Z435FacEst = A435FacEst ;
            Z445FacLiC = A445FacLiC ;
            Z965FacCob = A965FacCob ;
            Z1150FacNumVto = A1150FacNumVto ;
            Z1151FacPer = A1151FacPer ;
            Z1152FacDiaPag = A1152FacDiaPag ;
            Z1153FacTipFac = A1153FacTipFac ;
            Z2739FacSerNum = A2739FacSerNum ;
            Z6632FacDto = A6632FacDto ;
            Z7211Factrm = A7211Factrm ;
            Z7212FacRect = A7212FacRect ;
            Z9605FacFirma = A9605FacFirma ;
            Z9606FacHor = A9606FacHor ;
            Z9643FacLiq1 = A9643FacLiq1 ;
            Z9644FacLiq2 = A9644FacLiq2 ;
            Z9645FacIva1 = A9645FacIva1 ;
            Z9646FacTot1 = A9646FacTot1 ;
            Z9710FacFirDg = A9710FacFirDg ;
            Z10417FacCliPgL = A10417FacCliPgL ;
            Z10418FacAran = A10418FacAran ;
            Z10419FacBrut = A10419FacBrut ;
            Z10420FacNet = A10420FacNet ;
            Z10421FacInc = A10421FacInc ;
            Z10422FacFre = A10422FacFre ;
            Z10423FacExp = A10423FacExp ;
            Z11513FacRecIca = A11513FacRecIca ;
            Z12523FacTpFra = A12523FacTpFra ;
            Z11626FacMan = A11626FacMan ;
            Z14219FacEnergia = A14219FacEnergia ;
            Z14224FacCostFac = A14224FacCostFac ;
            Z14222FacCostMts = A14222FacCostMts ;
            Z14223FacCostKgs = A14223FacCostKgs ;
            Z14226FacAnulada = A14226FacAnulada ;
            Z14227FacFecAnul = A14227FacFecAnul ;
            Z14229FacSFD = A14229FacSFD ;
            Z14230FacIDATe = A14230FacIDATe ;
            Z14231FacMsgATe = A14231FacMsgATe ;
            Z14232FacIDATc = A14232FacIDATc ;
            Z14233FacMsgATc = A14233FacMsgATc ;
            Z14234FacIDATd = A14234FacIDATd ;
            Z14235FacMsgATd = A14235FacMsgATd ;
            Z14236FacSerAT = A14236FacSerAT ;
            Z14237FacTipAT = A14237FacTipAT ;
            Z11273FacObs2 = A11273FacObs2 ;
            Z14420FacEnvMail = A14420FacEnvMail ;
            Z8346FacRecI = A8346FacRecI ;
            Z252CliCod = A252CliCod ;
            Z11629MeivaId = A11629MeivaId ;
            Z14217MotAnuID = A14217MotAnuID ;
         }
      }
      if ( GX_JID == -143 )
      {
         Z430FacCod = A430FacCod ;
         Z437FacFpg = A437FacFpg ;
         Z436FacFch = A436FacFch ;
         Z450FacPri = A450FacPri ;
         Z433FacDtoGen = A433FacDtoGen ;
         Z434FacDtoPP = A434FacDtoPP ;
         Z960FacIVACod = A960FacIVACod ;
         Z443FacIVAPor = A443FacIVAPor ;
         Z453FacRECPor = A453FacRECPor ;
         Z435FacEst = A435FacEst ;
         Z445FacLiC = A445FacLiC ;
         Z965FacCob = A965FacCob ;
         Z1150FacNumVto = A1150FacNumVto ;
         Z1151FacPer = A1151FacPer ;
         Z1152FacDiaPag = A1152FacDiaPag ;
         Z1153FacTipFac = A1153FacTipFac ;
         Z2739FacSerNum = A2739FacSerNum ;
         Z6632FacDto = A6632FacDto ;
         Z7210FacObs = A7210FacObs ;
         Z7211Factrm = A7211Factrm ;
         Z7212FacRect = A7212FacRect ;
         Z9605FacFirma = A9605FacFirma ;
         Z9606FacHor = A9606FacHor ;
         Z9643FacLiq1 = A9643FacLiq1 ;
         Z9644FacLiq2 = A9644FacLiq2 ;
         Z9645FacIva1 = A9645FacIva1 ;
         Z9646FacTot1 = A9646FacTot1 ;
         Z9710FacFirDg = A9710FacFirDg ;
         Z10417FacCliPgL = A10417FacCliPgL ;
         Z10418FacAran = A10418FacAran ;
         Z10419FacBrut = A10419FacBrut ;
         Z10420FacNet = A10420FacNet ;
         Z10421FacInc = A10421FacInc ;
         Z10422FacFre = A10422FacFre ;
         Z10423FacExp = A10423FacExp ;
         Z11513FacRecIca = A11513FacRecIca ;
         Z12523FacTpFra = A12523FacTpFra ;
         Z11626FacMan = A11626FacMan ;
         Z14219FacEnergia = A14219FacEnergia ;
         Z14224FacCostFac = A14224FacCostFac ;
         Z14222FacCostMts = A14222FacCostMts ;
         Z14223FacCostKgs = A14223FacCostKgs ;
         Z14226FacAnulada = A14226FacAnulada ;
         Z14227FacFecAnul = A14227FacFecAnul ;
         Z14229FacSFD = A14229FacSFD ;
         Z14230FacIDATe = A14230FacIDATe ;
         Z14231FacMsgATe = A14231FacMsgATe ;
         Z14232FacIDATc = A14232FacIDATc ;
         Z14233FacMsgATc = A14233FacMsgATc ;
         Z14234FacIDATd = A14234FacIDATd ;
         Z14235FacMsgATd = A14235FacMsgATd ;
         Z14236FacSerAT = A14236FacSerAT ;
         Z14237FacTipAT = A14237FacTipAT ;
         Z11273FacObs2 = A11273FacObs2 ;
         Z14420FacEnvMail = A14420FacEnvMail ;
         Z8346FacRecI = A8346FacRecI ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z11629MeivaId = A11629MeivaId ;
         Z14217MotAnuID = A14217MotAnuID ;
         Z407EmprNom = A407EmprNom ;
         Z7209Colombia = A7209Colombia ;
         Z953IvaCod = A953IvaCod ;
         Z279CliNom = A279CliNom ;
         Z858ZonGeoCod = A858ZonGeoCod ;
         Z14228MotAnuDc = A14228MotAnuDc ;
         Z1360ZonGeoNom = A1360ZonGeoNom ;
         Z3918FacImpTot1 = A3918FacImpTot1 ;
         Z11630MeivaDsc = A11630MeivaDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtFacFirma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacFirma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFirma_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtFacCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCod_Enabled), 5, 0), true);
      cmbFacEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFacEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFacEst.getEnabled(), 5, 0), true);
      AV56Pgmname = "Facturacion.MantenimientoFactura" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Pgmname", AV56Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtFacFirma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacFirma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFirma_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtFacCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCod_Enabled), 5, 0), true);
      cmbFacEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFacEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFacEst.getEnabled(), 5, 0), true);
      edtFacPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPri_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01TR6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01TR6_A407EmprNom[0] ;
      n407EmprNom = T01TR6_n407EmprNom[0] ;
      A7209Colombia = T01TR6_A7209Colombia[0] ;
      n7209Colombia = T01TR6_n7209Colombia[0] ;
      A953IvaCod = T01TR6_A953IvaCod[0] ;
      n953IvaCod = T01TR6_n953IvaCod[0] ;
      pr_default.close(4);
      GXt_int8 = (byte)(0) ;
      GXv_int6[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int6) ;
      mantenimientofactura_impl.this.GXt_int8 = GXv_int6[0] ;
      edtFacBonLi_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacBonLi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBonLi_Visible), 5, 0), !bGXsfl_204_Refreshing);
      if ( ! (0==AV8FacCod) )
      {
         A430FacCod = AV8FacCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV14Insert_MeivaId)==0) )
      {
         edtMeivaId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMeivaId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMeivaId_Enabled), 5, 0), true);
      }
      else
      {
         edtMeivaId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMeivaId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMeivaId_Enabled), 5, 0), true);
      }
      edtFacObs_Visible = ((AV19FirmaD==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacObs_Visible), 5, 0), true);
      if ( ! ( ( AV19FirmaD == 0 ) ) )
      {
         divFacobs_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divFacobs_cell_Internalname, "Class", divFacobs_cell_Class, true);
      }
      else
      {
         if ( AV19FirmaD == 0 )
         {
            divFacobs_cell_Class = httpContext.getMessage( "col-xs-12 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divFacobs_cell_Internalname, "Class", divFacobs_cell_Class, true);
         }
      }
      edtFacObs2_Visible = ((AV19FirmaD==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacObs2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacObs2_Visible), 5, 0), true);
      if ( ! ( ( AV19FirmaD == 1 ) ) )
      {
         divFacobs2_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divFacobs2_cell_Internalname, "Class", divFacobs2_cell_Class, true);
      }
      else
      {
         if ( AV19FirmaD == 1 )
         {
            divFacobs2_cell_Class = httpContext.getMessage( "col-xs-12 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divFacobs2_cell_Internalname, "Class", divFacobs2_cell_Class, true);
         }
      }
      divUnnamedtable10_Visible = ((((AV19FirmaD==0))||((AV19FirmaD==1))) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable10_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable10_Visible), 5, 0), true);
      if ( AV19FirmaD == 1 )
      {
         edtFacHor_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacHor_Enabled), 5, 0), true);
      }
      else
      {
         edtFacHor_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacHor_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO EXISTE ESTA FACTURA", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO SE PUEDEN ANULAR FACTURAS - Utilice Desactualización", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV13Insert_MotAnuID)==0) )
      {
         A14217MotAnuID = AV13Insert_MotAnuID ;
         n14217MotAnuID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14217MotAnuID", A14217MotAnuID);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_CliCod) )
      {
         A252CliCod = AV12Insert_CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV14Insert_MeivaId)==0) )
      {
         A11629MeivaId = AV14Insert_MeivaId ;
         n11629MeivaId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
      }
      else
      {
         if ( (GXutil.strcmp("", AV42ComboMeivaId)==0) )
         {
            A11629MeivaId = "" ;
            n11629MeivaId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
            n11629MeivaId = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV42ComboMeivaId)==0) )
            {
               A11629MeivaId = AV42ComboMeivaId ;
               n11629MeivaId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
            }
         }
      }
      A437FacFpg = AV44ComboFacFpg ;
      httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
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
      if ( isIns( )  && (GXutil.strcmp("", A14226FacAnulada)==0) && ( Gx_BScreen == 0 ) )
      {
         A14226FacAnulada = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14226FacAnulada", A14226FacAnulada);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01TR12 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         if ( (pr_default.getStatus(9) != 101) )
         {
            A3918FacImpTot1 = T01TR12_A3918FacImpTot1[0] ;
            n3918FacImpTot1 = T01TR12_n3918FacImpTot1[0] ;
         }
         else
         {
            A3918FacImpTot1 = DecimalUtil.doubleToDec(0) ;
            n3918FacImpTot1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
         }
         O3918FacImpTot1 = A3918FacImpTot1 ;
         n3918FacImpTot1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
         pr_default.close(9);
         /* Using cursor T01TR9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n14217MotAnuID), A14217MotAnuID});
         A14228MotAnuDc = T01TR9_A14228MotAnuDc[0] ;
         pr_default.close(7);
         /* Using cursor T01TR8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01TR8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A858ZonGeoCod = T01TR8_A858ZonGeoCod[0] ;
         pr_default.close(6);
         /* Using cursor T01TR10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Short.valueOf(A858ZonGeoCod)});
         A1360ZonGeoNom = T01TR10_A1360ZonGeoNom[0] ;
         n1360ZonGeoNom = T01TR10_n1360ZonGeoNom[0] ;
         pr_default.close(8);
         /* Using cursor T01TR7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n11629MeivaId), A11629MeivaId});
         A11630MeivaDsc = T01TR7_A11630MeivaDsc[0] ;
         n11630MeivaDsc = T01TR7_n11630MeivaDsc[0] ;
         pr_default.close(5);
      }
   }

   public void load1TR43( )
   {
      /* Using cursor T01TR14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A7210FacObs = T01TR14_A7210FacObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7210FacObs", A7210FacObs);
         A437FacFpg = T01TR14_A437FacFpg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
         A407EmprNom = T01TR14_A407EmprNom[0] ;
         n407EmprNom = T01TR14_n407EmprNom[0] ;
         A436FacFch = T01TR14_A436FacFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A436FacFch", localUtil.format(A436FacFch, "99/99/99"));
         A450FacPri = T01TR14_A450FacPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", A450FacPri);
         A279CliNom = T01TR14_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A433FacDtoGen = T01TR14_A433FacDtoGen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
         A434FacDtoPP = T01TR14_A434FacDtoPP[0] ;
         A960FacIVACod = T01TR14_A960FacIVACod[0] ;
         A443FacIVAPor = T01TR14_A443FacIVAPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
         A453FacRECPor = T01TR14_A453FacRECPor[0] ;
         A435FacEst = T01TR14_A435FacEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435FacEst", GXutil.str( A435FacEst, 1, 0));
         A445FacLiC = T01TR14_A445FacLiC[0] ;
         A965FacCob = T01TR14_A965FacCob[0] ;
         A1150FacNumVto = T01TR14_A1150FacNumVto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
         A1151FacPer = T01TR14_A1151FacPer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
         A1152FacDiaPag = T01TR14_A1152FacDiaPag[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
         A1153FacTipFac = T01TR14_A1153FacTipFac[0] ;
         A2739FacSerNum = T01TR14_A2739FacSerNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2739FacSerNum", A2739FacSerNum);
         A6632FacDto = T01TR14_A6632FacDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6632FacDto", GXutil.ltrimstr( A6632FacDto, 6, 2));
         A7211Factrm = T01TR14_A7211Factrm[0] ;
         A7212FacRect = T01TR14_A7212FacRect[0] ;
         A9605FacFirma = T01TR14_A9605FacFirma[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9605FacFirma", A9605FacFirma);
         A9606FacHor = T01TR14_A9606FacHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9606FacHor", localUtil.ttoc( A9606FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9643FacLiq1 = T01TR14_A9643FacLiq1[0] ;
         A9644FacLiq2 = T01TR14_A9644FacLiq2[0] ;
         A9645FacIva1 = T01TR14_A9645FacIva1[0] ;
         A9646FacTot1 = T01TR14_A9646FacTot1[0] ;
         A1360ZonGeoNom = T01TR14_A1360ZonGeoNom[0] ;
         n1360ZonGeoNom = T01TR14_n1360ZonGeoNom[0] ;
         A9710FacFirDg = T01TR14_A9710FacFirDg[0] ;
         A10417FacCliPgL = T01TR14_A10417FacCliPgL[0] ;
         A10418FacAran = T01TR14_A10418FacAran[0] ;
         A10419FacBrut = T01TR14_A10419FacBrut[0] ;
         A10420FacNet = T01TR14_A10420FacNet[0] ;
         A10421FacInc = T01TR14_A10421FacInc[0] ;
         A10422FacFre = T01TR14_A10422FacFre[0] ;
         A10423FacExp = T01TR14_A10423FacExp[0] ;
         A11513FacRecIca = T01TR14_A11513FacRecIca[0] ;
         A12523FacTpFra = T01TR14_A12523FacTpFra[0] ;
         A11626FacMan = T01TR14_A11626FacMan[0] ;
         A14219FacEnergia = T01TR14_A14219FacEnergia[0] ;
         A14224FacCostFac = T01TR14_A14224FacCostFac[0] ;
         A14222FacCostMts = T01TR14_A14222FacCostMts[0] ;
         A14223FacCostKgs = T01TR14_A14223FacCostKgs[0] ;
         A14226FacAnulada = T01TR14_A14226FacAnulada[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14226FacAnulada", A14226FacAnulada);
         A14227FacFecAnul = T01TR14_A14227FacFecAnul[0] ;
         A14228MotAnuDc = T01TR14_A14228MotAnuDc[0] ;
         A11630MeivaDsc = T01TR14_A11630MeivaDsc[0] ;
         n11630MeivaDsc = T01TR14_n11630MeivaDsc[0] ;
         A14229FacSFD = T01TR14_A14229FacSFD[0] ;
         A14230FacIDATe = T01TR14_A14230FacIDATe[0] ;
         A14231FacMsgATe = T01TR14_A14231FacMsgATe[0] ;
         A14232FacIDATc = T01TR14_A14232FacIDATc[0] ;
         A14233FacMsgATc = T01TR14_A14233FacMsgATc[0] ;
         A14234FacIDATd = T01TR14_A14234FacIDATd[0] ;
         A14235FacMsgATd = T01TR14_A14235FacMsgATd[0] ;
         A14236FacSerAT = T01TR14_A14236FacSerAT[0] ;
         A14237FacTipAT = T01TR14_A14237FacTipAT[0] ;
         A11273FacObs2 = T01TR14_A11273FacObs2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11273FacObs2", A11273FacObs2);
         A14420FacEnvMail = T01TR14_A14420FacEnvMail[0] ;
         A8346FacRecI = T01TR14_A8346FacRecI[0] ;
         n8346FacRecI = T01TR14_n8346FacRecI[0] ;
         A7209Colombia = T01TR14_A7209Colombia[0] ;
         n7209Colombia = T01TR14_n7209Colombia[0] ;
         A252CliCod = T01TR14_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A11629MeivaId = T01TR14_A11629MeivaId[0] ;
         n11629MeivaId = T01TR14_n11629MeivaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
         A14217MotAnuID = T01TR14_A14217MotAnuID[0] ;
         n14217MotAnuID = T01TR14_n14217MotAnuID[0] ;
         A953IvaCod = T01TR14_A953IvaCod[0] ;
         n953IvaCod = T01TR14_n953IvaCod[0] ;
         A858ZonGeoCod = T01TR14_A858ZonGeoCod[0] ;
         A3918FacImpTot1 = T01TR14_A3918FacImpTot1[0] ;
         n3918FacImpTot1 = T01TR14_n3918FacImpTot1[0] ;
         zm1TR43( -143) ;
      }
      pr_default.close(10);
      onLoadActions1TR43( ) ;
   }

   public void onLoadActions1TR43( )
   {
      O3918FacImpTot1 = A3918FacImpTot1 ;
      n3918FacImpTot1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
      if ( true )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
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
      if ( true )
      {
         edtFacPri_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPri_Enabled), 5, 0), true);
      }
      else
      {
         if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
         {
            edtFacPri_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPri_Enabled), 5, 0), true);
         }
         else
         {
            edtFacPri_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPri_Enabled), 5, 0), true);
         }
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacFch_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFch_Enabled), 5, 0), true);
      }
      else
      {
         if ( ( AV19FirmaD == 1 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
         {
            edtFacFch_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFch_Enabled), 5, 0), true);
         }
         else
         {
            edtFacFch_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFch_Enabled), 5, 0), true);
         }
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacDtoGen_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacDtoGen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDtoGen_Enabled), 5, 0), true);
      }
      else
      {
         edtFacDtoGen_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacDtoGen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDtoGen_Enabled), 5, 0), true);
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacSerNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacSerNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacSerNum_Enabled), 5, 0), true);
      }
      else
      {
         edtFacSerNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacSerNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacSerNum_Enabled), 5, 0), true);
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacFpg_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacFpg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFpg_Enabled), 5, 0), true);
      }
      else
      {
         edtFacFpg_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacFpg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFpg_Enabled), 5, 0), true);
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacNumVto_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacNumVto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacNumVto_Enabled), 5, 0), true);
      }
      else
      {
         edtFacNumVto_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacNumVto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacNumVto_Enabled), 5, 0), true);
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacPer_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacPer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPer_Enabled), 5, 0), true);
      }
      else
      {
         edtFacPer_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacPer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPer_Enabled), 5, 0), true);
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacDiaPag_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacDiaPag_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDiaPag_Enabled), 5, 0), true);
      }
      else
      {
         edtFacDiaPag_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacDiaPag_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDiaPag_Enabled), 5, 0), true);
      }
      A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14221FacCostEng", GXutil.ltrimstr( A14221FacCostEng, 12, 3));
      A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14220FacCostEne", GXutil.ltrimstr( A14220FacCostEne, 12, 3));
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacIVAPor_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacIVAPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacIVAPor_Enabled), 5, 0), true);
      }
      else
      {
         if ( A858ZonGeoCod == 999 )
         {
            edtFacIVAPor_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacIVAPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacIVAPor_Enabled), 5, 0), true);
         }
         else
         {
            edtFacIVAPor_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacIVAPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacIVAPor_Enabled), 5, 0), true);
         }
      }
      A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
         else
         {
            A439FacImpGen = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
      }
      A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         }
         else
         {
            A440FacImpPP = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         }
      }
      A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
      A14225FacImpEner = GXutil.roundDecimal( A14218FacImpEng1, 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
      A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
      A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
      A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         }
         else
         {
            A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         }
      }
      A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         }
         else
         {
            A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         }
      }
      A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         }
         else
         {
            A452FacRecImp = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         }
      }
      A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         }
         else
         {
            A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         }
      }
      A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
      A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
      A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
      httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
      A7215FacImpRet2 = GXutil.roundDecimal( A441FacImpTot.subtract(A7213FacImpRet), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
   }

   public void checkExtendedTable1TR43( )
   {
      nIsDirty_43 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( true )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
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
      if ( true )
      {
         edtFacPri_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPri_Enabled), 5, 0), true);
      }
      else
      {
         if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
         {
            edtFacPri_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPri_Enabled), 5, 0), true);
         }
         else
         {
            edtFacPri_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPri_Enabled), 5, 0), true);
         }
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacFch_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFch_Enabled), 5, 0), true);
      }
      else
      {
         if ( ( AV19FirmaD == 1 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
         {
            edtFacFch_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFch_Enabled), 5, 0), true);
         }
         else
         {
            edtFacFch_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFch_Enabled), 5, 0), true);
         }
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacDtoGen_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacDtoGen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDtoGen_Enabled), 5, 0), true);
      }
      else
      {
         edtFacDtoGen_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacDtoGen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDtoGen_Enabled), 5, 0), true);
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacSerNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacSerNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacSerNum_Enabled), 5, 0), true);
      }
      else
      {
         edtFacSerNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacSerNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacSerNum_Enabled), 5, 0), true);
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacFpg_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacFpg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFpg_Enabled), 5, 0), true);
      }
      else
      {
         edtFacFpg_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacFpg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFpg_Enabled), 5, 0), true);
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacNumVto_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacNumVto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacNumVto_Enabled), 5, 0), true);
      }
      else
      {
         edtFacNumVto_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacNumVto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacNumVto_Enabled), 5, 0), true);
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacPer_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacPer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPer_Enabled), 5, 0), true);
      }
      else
      {
         edtFacPer_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacPer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPer_Enabled), 5, 0), true);
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacDiaPag_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacDiaPag_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDiaPag_Enabled), 5, 0), true);
      }
      else
      {
         edtFacDiaPag_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacDiaPag_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDiaPag_Enabled), 5, 0), true);
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Factura Impresa.NO se permite MODIFICACION.Activado FIRMA DIGITAL", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( A433FacDtoGen.doubleValue() < 0 ) && ( AV19FirmaD == 1 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite Valores Negativos", ""), 1, "FACDTOGEN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacDtoGen_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A434FacDtoPP.doubleValue() < 0 ) && ( AV19FirmaD == 1 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite Valores Negativos", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( A443FacIVAPor < 0 ) && ( AV19FirmaD == 1 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite Valores Negativos", ""), 1, "FACIVAPOR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacIVAPor_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A453FacRECPor.doubleValue() < 0 ) && ( AV19FirmaD == 1 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite Valores Negativos", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( AV19FirmaD == 1 ) && true /* After */ && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = (byte)(0) ;
         GXv_int7[0] = AV16FacCodX ;
         GXv_date15[0] = AV17Facfch ;
         GXv_char3[0] = A450FacPri ;
         new app.pfacrecl(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int7, GXv_date15, GXv_char3) ;
         mantenimientofactura_impl.this.A396EmprCod = GXv_char4[0] ;
         mantenimientofactura_impl.this.AV16FacCodX = GXv_int7[0] ;
         mantenimientofactura_impl.this.AV17Facfch = GXv_date15[0] ;
         mantenimientofactura_impl.this.A450FacPri = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV16FacCodX", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16FacCodX), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17Facfch", localUtil.format(AV17Facfch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", A450FacPri);
      }
      if ( ( A435FacEst == 2 ) && ( GXutil.strcmp(GXutil.substring( A7210FacObs, 1, 15), "FACTURA ANULADA") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Factura ANULADA", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( GXutil.strcmp(A2739FacSerNum, "VD") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Fatura Venda Dinheiro.Vá para o programa responsável.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( GXutil.resetTime(A436FacFch).before( GXutil.resetTime( AV17Facfch )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17Facfch)) && ( AV19FirmaD == 1 ) && true /* After */ && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Fecha Factura inferior a Fecha Ultima", ""), 1, "FACFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A435FacEst == 2 ) && ( GXutil.strcmp(GXutil.substring( A7210FacObs, 1, 15), "FACTURA ANULADA") != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Factura Actualizada", ""), 1, "FACOBS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacObs_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A435FacEst == 2 ) && ( GXutil.strcmp(GXutil.substring( A7210FacObs, 1, 15), "FACTURA ANULADA") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Factura ANULADA", ""), 1, "FACOBS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacObs_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(A14226FacAnulada, httpContext.getMessage( "S", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Fatura anulada!", ""), 1, "FACANULADA");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbFacAnulada.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(A965FacCob, "S") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Factura Traspasada a Contabilidad", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( A1153FacTipFac != 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Factura de Abono o Cargo", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( GXutil.strcmp(A11626FacMan, "S") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Factura MANUAL.Utilizar programa TENTFAC.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      nIsDirty_43 = (short)(1) ;
      A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14221FacCostEng", GXutil.ltrimstr( A14221FacCostEng, 12, 3));
      nIsDirty_43 = (short)(1) ;
      A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14220FacCostEne", GXutil.ltrimstr( A14220FacCostEne, 12, 3));
      /* Using cursor T01TR7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n11629MeivaId), A11629MeivaId});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A11629MeivaId)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOTIVOS EXENCION IVA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MEIVAID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMeivaId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A11630MeivaDsc = T01TR7_A11630MeivaDsc[0] ;
      n11630MeivaDsc = T01TR7_n11630MeivaDsc[0] ;
      pr_default.close(5);
      /* Using cursor T01TR8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01TR8_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A858ZonGeoCod = T01TR8_A858ZonGeoCod[0] ;
      pr_default.close(6);
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacIVAPor_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacIVAPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacIVAPor_Enabled), 5, 0), true);
      }
      else
      {
         if ( A858ZonGeoCod == 999 )
         {
            edtFacIVAPor_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacIVAPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacIVAPor_Enabled), 5, 0), true);
         }
         else
         {
            edtFacIVAPor_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacIVAPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacIVAPor_Enabled), 5, 0), true);
         }
      }
      /* Using cursor T01TR9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n14217MotAnuID), A14217MotAnuID});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A14217MotAnuID)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Motivo Anulacion Factura", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MOTANUID");
            AnyError = (short)(1) ;
         }
      }
      A14228MotAnuDc = T01TR9_A14228MotAnuDc[0] ;
      pr_default.close(7);
      /* Using cursor T01TR10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Short.valueOf(A858ZonGeoCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ZONGEO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ZONGEOCOD");
         AnyError = (short)(1) ;
      }
      A1360ZonGeoNom = T01TR10_A1360ZonGeoNom[0] ;
      n1360ZonGeoNom = T01TR10_n1360ZonGeoNom[0] ;
      pr_default.close(8);
      /* Using cursor T01TR12 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A3918FacImpTot1 = T01TR12_A3918FacImpTot1[0] ;
         n3918FacImpTot1 = T01TR12_n3918FacImpTot1[0] ;
      }
      else
      {
         nIsDirty_43 = (short)(1) ;
         A3918FacImpTot1 = DecimalUtil.doubleToDec(0) ;
         n3918FacImpTot1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
      }
      pr_default.close(9);
      nIsDirty_43 = (short)(1) ;
      A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         nIsDirty_43 = (short)(1) ;
         A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            nIsDirty_43 = (short)(1) ;
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
         else
         {
            nIsDirty_43 = (short)(1) ;
            A439FacImpGen = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
      }
      nIsDirty_43 = (short)(1) ;
      A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         nIsDirty_43 = (short)(1) ;
         A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            nIsDirty_43 = (short)(1) ;
            A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         }
         else
         {
            nIsDirty_43 = (short)(1) ;
            A440FacImpPP = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         }
      }
      nIsDirty_43 = (short)(1) ;
      A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
      nIsDirty_43 = (short)(1) ;
      A14225FacImpEner = GXutil.roundDecimal( A14218FacImpEng1, 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
      nIsDirty_43 = (short)(1) ;
      A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
      nIsDirty_43 = (short)(1) ;
      A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
      nIsDirty_43 = (short)(1) ;
      A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         nIsDirty_43 = (short)(1) ;
         A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            nIsDirty_43 = (short)(1) ;
            A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         }
         else
         {
            nIsDirty_43 = (short)(1) ;
            A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         }
      }
      nIsDirty_43 = (short)(1) ;
      A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         nIsDirty_43 = (short)(1) ;
         A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            nIsDirty_43 = (short)(1) ;
            A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         }
         else
         {
            nIsDirty_43 = (short)(1) ;
            A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         }
      }
      nIsDirty_43 = (short)(1) ;
      A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         nIsDirty_43 = (short)(1) ;
         A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            nIsDirty_43 = (short)(1) ;
            A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         }
         else
         {
            nIsDirty_43 = (short)(1) ;
            A452FacRecImp = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         }
      }
      nIsDirty_43 = (short)(1) ;
      A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         nIsDirty_43 = (short)(1) ;
         A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            nIsDirty_43 = (short)(1) ;
            A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         }
         else
         {
            nIsDirty_43 = (short)(1) ;
            A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         }
      }
      nIsDirty_43 = (short)(1) ;
      A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
      nIsDirty_43 = (short)(1) ;
      A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
      nIsDirty_43 = (short)(1) ;
      A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
      httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
      nIsDirty_43 = (short)(1) ;
      A7215FacImpRet2 = GXutil.roundDecimal( A441FacImpTot.subtract(A7213FacImpRet), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
   }

   public void closeExtendedTableCursors1TR43( )
   {
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void gxload_145( String A396EmprCod ,
                           String A11629MeivaId )
   {
      /* Using cursor T01TR15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n11629MeivaId), A11629MeivaId});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A11629MeivaId)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOTIVOS EXENCION IVA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MEIVAID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMeivaId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A11630MeivaDsc = T01TR15_A11630MeivaDsc[0] ;
      n11630MeivaDsc = T01TR15_n11630MeivaDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( A11630MeivaDsc)+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_146( String A396EmprCod ,
                           int A252CliCod )
   {
      /* Using cursor T01TR16 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01TR16_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A858ZonGeoCod = T01TR16_A858ZonGeoCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A858ZonGeoCod, (byte)(3), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_147( String A396EmprCod ,
                           String A14217MotAnuID )
   {
      /* Using cursor T01TR17 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n14217MotAnuID), A14217MotAnuID});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A14217MotAnuID)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Motivo Anulacion Factura", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MOTANUID");
            AnyError = (short)(1) ;
         }
      }
      A14228MotAnuDc = T01TR17_A14228MotAnuDc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( A14228MotAnuDc)+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_148( String A396EmprCod ,
                           short A858ZonGeoCod )
   {
      /* Using cursor T01TR18 */
      pr_default.execute(14, new Object[] {A396EmprCod, Short.valueOf(A858ZonGeoCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ZONGEO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ZONGEOCOD");
         AnyError = (short)(1) ;
      }
      A1360ZonGeoNom = T01TR18_A1360ZonGeoNom[0] ;
      n1360ZonGeoNom = T01TR18_n1360ZonGeoNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1360ZonGeoNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_149( String A396EmprCod ,
                           int A430FacCod )
   {
      /* Using cursor T01TR20 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A3918FacImpTot1 = T01TR20_A3918FacImpTot1[0] ;
         n3918FacImpTot1 = T01TR20_n3918FacImpTot1[0] ;
      }
      else
      {
         A3918FacImpTot1 = DecimalUtil.doubleToDec(0) ;
         n3918FacImpTot1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3918FacImpTot1, (byte)(13), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void getKey1TR43( )
   {
      /* Using cursor T01TR21 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound43 = (short)(1) ;
      }
      else
      {
         RcdFound43 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TR5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1TR43( 143) ;
         RcdFound43 = (short)(1) ;
         A7210FacObs = T01TR5_A7210FacObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7210FacObs", A7210FacObs);
         A430FacCod = T01TR5_A430FacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
         A437FacFpg = T01TR5_A437FacFpg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
         A436FacFch = T01TR5_A436FacFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A436FacFch", localUtil.format(A436FacFch, "99/99/99"));
         A450FacPri = T01TR5_A450FacPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", A450FacPri);
         A433FacDtoGen = T01TR5_A433FacDtoGen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
         A434FacDtoPP = T01TR5_A434FacDtoPP[0] ;
         A960FacIVACod = T01TR5_A960FacIVACod[0] ;
         A443FacIVAPor = T01TR5_A443FacIVAPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
         A453FacRECPor = T01TR5_A453FacRECPor[0] ;
         A435FacEst = T01TR5_A435FacEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435FacEst", GXutil.str( A435FacEst, 1, 0));
         A445FacLiC = T01TR5_A445FacLiC[0] ;
         A965FacCob = T01TR5_A965FacCob[0] ;
         A1150FacNumVto = T01TR5_A1150FacNumVto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
         A1151FacPer = T01TR5_A1151FacPer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
         A1152FacDiaPag = T01TR5_A1152FacDiaPag[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
         A1153FacTipFac = T01TR5_A1153FacTipFac[0] ;
         A2739FacSerNum = T01TR5_A2739FacSerNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2739FacSerNum", A2739FacSerNum);
         A6632FacDto = T01TR5_A6632FacDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6632FacDto", GXutil.ltrimstr( A6632FacDto, 6, 2));
         A7211Factrm = T01TR5_A7211Factrm[0] ;
         A7212FacRect = T01TR5_A7212FacRect[0] ;
         A9605FacFirma = T01TR5_A9605FacFirma[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9605FacFirma", A9605FacFirma);
         A9606FacHor = T01TR5_A9606FacHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9606FacHor", localUtil.ttoc( A9606FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9643FacLiq1 = T01TR5_A9643FacLiq1[0] ;
         A9644FacLiq2 = T01TR5_A9644FacLiq2[0] ;
         A9645FacIva1 = T01TR5_A9645FacIva1[0] ;
         A9646FacTot1 = T01TR5_A9646FacTot1[0] ;
         A9710FacFirDg = T01TR5_A9710FacFirDg[0] ;
         A10417FacCliPgL = T01TR5_A10417FacCliPgL[0] ;
         A10418FacAran = T01TR5_A10418FacAran[0] ;
         A10419FacBrut = T01TR5_A10419FacBrut[0] ;
         A10420FacNet = T01TR5_A10420FacNet[0] ;
         A10421FacInc = T01TR5_A10421FacInc[0] ;
         A10422FacFre = T01TR5_A10422FacFre[0] ;
         A10423FacExp = T01TR5_A10423FacExp[0] ;
         A11513FacRecIca = T01TR5_A11513FacRecIca[0] ;
         A12523FacTpFra = T01TR5_A12523FacTpFra[0] ;
         A11626FacMan = T01TR5_A11626FacMan[0] ;
         A14219FacEnergia = T01TR5_A14219FacEnergia[0] ;
         A14224FacCostFac = T01TR5_A14224FacCostFac[0] ;
         A14222FacCostMts = T01TR5_A14222FacCostMts[0] ;
         A14223FacCostKgs = T01TR5_A14223FacCostKgs[0] ;
         A14226FacAnulada = T01TR5_A14226FacAnulada[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14226FacAnulada", A14226FacAnulada);
         A14227FacFecAnul = T01TR5_A14227FacFecAnul[0] ;
         A14229FacSFD = T01TR5_A14229FacSFD[0] ;
         A14230FacIDATe = T01TR5_A14230FacIDATe[0] ;
         A14231FacMsgATe = T01TR5_A14231FacMsgATe[0] ;
         A14232FacIDATc = T01TR5_A14232FacIDATc[0] ;
         A14233FacMsgATc = T01TR5_A14233FacMsgATc[0] ;
         A14234FacIDATd = T01TR5_A14234FacIDATd[0] ;
         A14235FacMsgATd = T01TR5_A14235FacMsgATd[0] ;
         A14236FacSerAT = T01TR5_A14236FacSerAT[0] ;
         A14237FacTipAT = T01TR5_A14237FacTipAT[0] ;
         A11273FacObs2 = T01TR5_A11273FacObs2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11273FacObs2", A11273FacObs2);
         A14420FacEnvMail = T01TR5_A14420FacEnvMail[0] ;
         A8346FacRecI = T01TR5_A8346FacRecI[0] ;
         n8346FacRecI = T01TR5_n8346FacRecI[0] ;
         A396EmprCod = T01TR5_A396EmprCod[0] ;
         A252CliCod = T01TR5_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A11629MeivaId = T01TR5_A11629MeivaId[0] ;
         n11629MeivaId = T01TR5_n11629MeivaId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
         A14217MotAnuID = T01TR5_A14217MotAnuID[0] ;
         n14217MotAnuID = T01TR5_n14217MotAnuID[0] ;
         O1150FacNumVto = A1150FacNumVto ;
         httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
         O1151FacPer = A1151FacPer ;
         httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
         O1152FacDiaPag = A1152FacDiaPag ;
         httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
         O437FacFpg = A437FacFpg ;
         httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
         O434FacDtoPP = A434FacDtoPP ;
         httpContext.ajax_rsp_assign_attri("", false, "A434FacDtoPP", GXutil.ltrimstr( A434FacDtoPP, 5, 2));
         O433FacDtoGen = A433FacDtoGen ;
         httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
         O443FacIVAPor = A443FacIVAPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
         O453FacRECPor = A453FacRECPor ;
         httpContext.ajax_rsp_assign_attri("", false, "A453FacRECPor", GXutil.ltrimstr( A453FacRECPor, 7, 3));
         O14224FacCostFac = A14224FacCostFac ;
         httpContext.ajax_rsp_assign_attri("", false, "A14224FacCostFac", GXutil.ltrimstr( A14224FacCostFac, 6, 2));
         Z396EmprCod = A396EmprCod ;
         Z430FacCod = A430FacCod ;
         sMode43 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TR43( ) ;
         if ( AnyError == 1 )
         {
            RcdFound43 = (short)(0) ;
            initializeNonKey1TR43( ) ;
         }
         Gx_mode = sMode43 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound43 = (short)(0) ;
         initializeNonKey1TR43( ) ;
         sMode43 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode43 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1TR43( ) ;
      if ( RcdFound43 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound43 = (short)(0) ;
      /* Using cursor T01TR22 */
      pr_default.execute(17, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01TR22_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TR22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TR22_A430FacCod[0] < A430FacCod ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01TR22_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TR22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TR22_A430FacCod[0] > A430FacCod ) ) )
         {
            A396EmprCod = T01TR22_A396EmprCod[0] ;
            A430FacCod = T01TR22_A430FacCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
            RcdFound43 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void move_previous( )
   {
      RcdFound43 = (short)(0) ;
      /* Using cursor T01TR23 */
      pr_default.execute(18, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( GXutil.strcmp(T01TR23_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TR23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TR23_A430FacCod[0] > A430FacCod ) ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( GXutil.strcmp(T01TR23_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TR23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TR23_A430FacCod[0] < A430FacCod ) ) )
         {
            A396EmprCod = T01TR23_A396EmprCod[0] ;
            A430FacCod = T01TR23_A430FacCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
            RcdFound43 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TR43( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A3918FacImpTot1 = O3918FacImpTot1 ;
         n3918FacImpTot1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
         A14225FacImpEner = O14225FacImpEner ;
         httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
         A440FacImpPP = O440FacImpPP ;
         httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         A439FacImpGen = O439FacImpGen ;
         httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         A11515FacImpIca = O11515FacImpIca ;
         httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
         A7213FacImpRet = O7213FacImpRet ;
         httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         A452FacRecImp = O452FacRecImp ;
         httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         A8347FacImpReI = O8347FacImpReI ;
         httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         A8348FacImpReI1 = O8348FacImpReI1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
         A442FacIVAImp = O442FacIVAImp ;
         httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         A455FacTot = O455FacTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
         A3921FacIvaImp1 = O3921FacIvaImp1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
         A3922FacRecImp1 = O3922FacRecImp1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
         A7214FacImpRet1 = O7214FacImpRet1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
         A11514FacImpIca1 = O11514FacImpIca1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
         A429FacBasImp = O429FacBasImp ;
         httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
         A7215FacImpRet2 = O7215FacImpRet2 ;
         httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
         A441FacImpTot = O441FacImpTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
         A3919FacImpGen1 = O3919FacImpGen1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
         A3920FacImpPP1 = O3920FacImpPP1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
         A14218FacImpEng1 = O14218FacImpEng1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
         GX_FocusControl = edtFacFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1TR43( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound43 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A430FacCod != Z430FacCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A430FacCod = Z430FacCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "FACCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A3918FacImpTot1 = O3918FacImpTot1 ;
               n3918FacImpTot1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
               A14225FacImpEner = O14225FacImpEner ;
               httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
               A440FacImpPP = O440FacImpPP ;
               httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
               A439FacImpGen = O439FacImpGen ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
               A11515FacImpIca = O11515FacImpIca ;
               httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
               A7213FacImpRet = O7213FacImpRet ;
               httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
               A452FacRecImp = O452FacRecImp ;
               httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
               A8347FacImpReI = O8347FacImpReI ;
               httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
               A8348FacImpReI1 = O8348FacImpReI1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
               A442FacIVAImp = O442FacIVAImp ;
               httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
               A455FacTot = O455FacTot ;
               httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
               A3921FacIvaImp1 = O3921FacIvaImp1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
               A3922FacRecImp1 = O3922FacRecImp1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
               A7214FacImpRet1 = O7214FacImpRet1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
               A11514FacImpIca1 = O11514FacImpIca1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
               A429FacBasImp = O429FacBasImp ;
               httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
               A7215FacImpRet2 = O7215FacImpRet2 ;
               httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
               A441FacImpTot = O441FacImpTot ;
               httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
               A3919FacImpGen1 = O3919FacImpGen1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
               A3920FacImpPP1 = O3920FacImpPP1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
               A14218FacImpEng1 = O14218FacImpEng1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtFacFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A3918FacImpTot1 = O3918FacImpTot1 ;
               n3918FacImpTot1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
               A14225FacImpEner = O14225FacImpEner ;
               httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
               A440FacImpPP = O440FacImpPP ;
               httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
               A439FacImpGen = O439FacImpGen ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
               A11515FacImpIca = O11515FacImpIca ;
               httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
               A7213FacImpRet = O7213FacImpRet ;
               httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
               A452FacRecImp = O452FacRecImp ;
               httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
               A8347FacImpReI = O8347FacImpReI ;
               httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
               A8348FacImpReI1 = O8348FacImpReI1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
               A442FacIVAImp = O442FacIVAImp ;
               httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
               A455FacTot = O455FacTot ;
               httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
               A3921FacIvaImp1 = O3921FacIvaImp1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
               A3922FacRecImp1 = O3922FacRecImp1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
               A7214FacImpRet1 = O7214FacImpRet1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
               A11514FacImpIca1 = O11514FacImpIca1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
               A429FacBasImp = O429FacBasImp ;
               httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
               A7215FacImpRet2 = O7215FacImpRet2 ;
               httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
               A441FacImpTot = O441FacImpTot ;
               httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
               A3919FacImpGen1 = O3919FacImpGen1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
               A3920FacImpPP1 = O3920FacImpPP1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
               A14218FacImpEng1 = O14218FacImpEng1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
               update1TR43( ) ;
               GX_FocusControl = edtFacFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A430FacCod != Z430FacCod ) )
            {
               /* Insert record */
               A3918FacImpTot1 = O3918FacImpTot1 ;
               n3918FacImpTot1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
               A14225FacImpEner = O14225FacImpEner ;
               httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
               A440FacImpPP = O440FacImpPP ;
               httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
               A439FacImpGen = O439FacImpGen ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
               A11515FacImpIca = O11515FacImpIca ;
               httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
               A7213FacImpRet = O7213FacImpRet ;
               httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
               A452FacRecImp = O452FacRecImp ;
               httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
               A8347FacImpReI = O8347FacImpReI ;
               httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
               A8348FacImpReI1 = O8348FacImpReI1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
               A442FacIVAImp = O442FacIVAImp ;
               httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
               A455FacTot = O455FacTot ;
               httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
               A3921FacIvaImp1 = O3921FacIvaImp1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
               A3922FacRecImp1 = O3922FacRecImp1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
               A7214FacImpRet1 = O7214FacImpRet1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
               A11514FacImpIca1 = O11514FacImpIca1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
               A429FacBasImp = O429FacBasImp ;
               httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
               A7215FacImpRet2 = O7215FacImpRet2 ;
               httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
               A441FacImpTot = O441FacImpTot ;
               httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
               A3919FacImpGen1 = O3919FacImpGen1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
               A3920FacImpPP1 = O3920FacImpPP1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
               A14218FacImpEng1 = O14218FacImpEng1 ;
               httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
               GX_FocusControl = edtFacFch_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1TR43( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "FACCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFacCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A3918FacImpTot1 = O3918FacImpTot1 ;
                  n3918FacImpTot1 = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
                  A14225FacImpEner = O14225FacImpEner ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
                  A440FacImpPP = O440FacImpPP ;
                  httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
                  A439FacImpGen = O439FacImpGen ;
                  httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
                  A11515FacImpIca = O11515FacImpIca ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
                  A7213FacImpRet = O7213FacImpRet ;
                  httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
                  A452FacRecImp = O452FacRecImp ;
                  httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
                  A8347FacImpReI = O8347FacImpReI ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                  A8348FacImpReI1 = O8348FacImpReI1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
                  A442FacIVAImp = O442FacIVAImp ;
                  httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
                  A455FacTot = O455FacTot ;
                  httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
                  A3921FacIvaImp1 = O3921FacIvaImp1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
                  A3922FacRecImp1 = O3922FacRecImp1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
                  A7214FacImpRet1 = O7214FacImpRet1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
                  A11514FacImpIca1 = O11514FacImpIca1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
                  A429FacBasImp = O429FacBasImp ;
                  httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
                  A7215FacImpRet2 = O7215FacImpRet2 ;
                  httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
                  A441FacImpTot = O441FacImpTot ;
                  httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
                  A3919FacImpGen1 = O3919FacImpGen1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
                  A3920FacImpPP1 = O3920FacImpPP1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
                  A14218FacImpEng1 = O14218FacImpEng1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
                  GX_FocusControl = edtFacFch_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1TR43( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A430FacCod != Z430FacCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A430FacCod = Z430FacCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "FACCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A3918FacImpTot1 = O3918FacImpTot1 ;
         n3918FacImpTot1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
         A14225FacImpEner = O14225FacImpEner ;
         httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
         A440FacImpPP = O440FacImpPP ;
         httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         A439FacImpGen = O439FacImpGen ;
         httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         A11515FacImpIca = O11515FacImpIca ;
         httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
         A7213FacImpRet = O7213FacImpRet ;
         httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         A452FacRecImp = O452FacRecImp ;
         httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         A8347FacImpReI = O8347FacImpReI ;
         httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         A8348FacImpReI1 = O8348FacImpReI1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
         A442FacIVAImp = O442FacIVAImp ;
         httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         A455FacTot = O455FacTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
         A3921FacIvaImp1 = O3921FacIvaImp1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
         A3922FacRecImp1 = O3922FacRecImp1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
         A7214FacImpRet1 = O7214FacImpRet1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
         A11514FacImpIca1 = O11514FacImpIca1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
         A429FacBasImp = O429FacBasImp ;
         httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
         A7215FacImpRet2 = O7215FacImpRet2 ;
         httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
         A441FacImpTot = O441FacImpTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
         A3919FacImpGen1 = O3919FacImpGen1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
         A3920FacImpPP1 = O3920FacImpPP1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
         A14218FacImpEng1 = O14218FacImpEng1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtFacFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1TR43( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TR4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFAVEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z437FacFpg, T01TR4_A437FacFpg[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z436FacFch), GXutil.resetTime(T01TR4_A436FacFch[0])) ) || ( GXutil.strcmp(Z450FacPri, T01TR4_A450FacPri[0]) != 0 ) || ( DecimalUtil.compareTo(Z433FacDtoGen, T01TR4_A433FacDtoGen[0]) != 0 ) || ( DecimalUtil.compareTo(Z434FacDtoPP, T01TR4_A434FacDtoPP[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z960FacIVACod, T01TR4_A960FacIVACod[0]) != 0 ) || ( Z443FacIVAPor != T01TR4_A443FacIVAPor[0] ) || ( DecimalUtil.compareTo(Z453FacRECPor, T01TR4_A453FacRECPor[0]) != 0 ) || ( Z435FacEst != T01TR4_A435FacEst[0] ) || ( Z445FacLiC != T01TR4_A445FacLiC[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z965FacCob, T01TR4_A965FacCob[0]) != 0 ) || ( Z1150FacNumVto != T01TR4_A1150FacNumVto[0] ) || ( GXutil.strcmp(Z1151FacPer, T01TR4_A1151FacPer[0]) != 0 ) || ( GXutil.strcmp(Z1152FacDiaPag, T01TR4_A1152FacDiaPag[0]) != 0 ) || ( Z1153FacTipFac != T01TR4_A1153FacTipFac[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z2739FacSerNum, T01TR4_A2739FacSerNum[0]) != 0 ) || ( DecimalUtil.compareTo(Z6632FacDto, T01TR4_A6632FacDto[0]) != 0 ) || ( DecimalUtil.compareTo(Z7211Factrm, T01TR4_A7211Factrm[0]) != 0 ) || ( DecimalUtil.compareTo(Z7212FacRect, T01TR4_A7212FacRect[0]) != 0 ) || ( GXutil.strcmp(Z9605FacFirma, T01TR4_A9605FacFirma[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z9606FacHor, T01TR4_A9606FacHor[0]) ) || ( DecimalUtil.compareTo(Z9643FacLiq1, T01TR4_A9643FacLiq1[0]) != 0 ) || ( DecimalUtil.compareTo(Z9644FacLiq2, T01TR4_A9644FacLiq2[0]) != 0 ) || ( DecimalUtil.compareTo(Z9645FacIva1, T01TR4_A9645FacIva1[0]) != 0 ) || ( DecimalUtil.compareTo(Z9646FacTot1, T01TR4_A9646FacTot1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9710FacFirDg, T01TR4_A9710FacFirDg[0]) != 0 ) || ( Z10417FacCliPgL != T01TR4_A10417FacCliPgL[0] ) || ( GXutil.strcmp(Z10418FacAran, T01TR4_A10418FacAran[0]) != 0 ) || ( DecimalUtil.compareTo(Z10419FacBrut, T01TR4_A10419FacBrut[0]) != 0 ) || ( DecimalUtil.compareTo(Z10420FacNet, T01TR4_A10420FacNet[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10421FacInc, T01TR4_A10421FacInc[0]) != 0 ) || ( GXutil.strcmp(Z10422FacFre, T01TR4_A10422FacFre[0]) != 0 ) || ( GXutil.strcmp(Z10423FacExp, T01TR4_A10423FacExp[0]) != 0 ) || ( DecimalUtil.compareTo(Z11513FacRecIca, T01TR4_A11513FacRecIca[0]) != 0 ) || ( GXutil.strcmp(Z12523FacTpFra, T01TR4_A12523FacTpFra[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11626FacMan, T01TR4_A11626FacMan[0]) != 0 ) || ( DecimalUtil.compareTo(Z14219FacEnergia, T01TR4_A14219FacEnergia[0]) != 0 ) || ( DecimalUtil.compareTo(Z14224FacCostFac, T01TR4_A14224FacCostFac[0]) != 0 ) || ( DecimalUtil.compareTo(Z14222FacCostMts, T01TR4_A14222FacCostMts[0]) != 0 ) || ( DecimalUtil.compareTo(Z14223FacCostKgs, T01TR4_A14223FacCostKgs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14226FacAnulada, T01TR4_A14226FacAnulada[0]) != 0 ) || !( GXutil.dateCompare(Z14227FacFecAnul, T01TR4_A14227FacFecAnul[0]) ) || !( GXutil.dateCompare(Z14229FacSFD, T01TR4_A14229FacSFD[0]) ) || ( GXutil.strcmp(Z14230FacIDATe, T01TR4_A14230FacIDATe[0]) != 0 ) || ( GXutil.strcmp(Z14231FacMsgATe, T01TR4_A14231FacMsgATe[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14232FacIDATc, T01TR4_A14232FacIDATc[0]) != 0 ) || ( GXutil.strcmp(Z14233FacMsgATc, T01TR4_A14233FacMsgATc[0]) != 0 ) || ( GXutil.strcmp(Z14234FacIDATd, T01TR4_A14234FacIDATd[0]) != 0 ) || ( GXutil.strcmp(Z14235FacMsgATd, T01TR4_A14235FacMsgATd[0]) != 0 ) || ( GXutil.strcmp(Z14236FacSerAT, T01TR4_A14236FacSerAT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14237FacTipAT, T01TR4_A14237FacTipAT[0]) != 0 ) || ( GXutil.strcmp(Z11273FacObs2, T01TR4_A11273FacObs2[0]) != 0 ) || !( GXutil.dateCompare(Z14420FacEnvMail, T01TR4_A14420FacEnvMail[0]) ) || ( DecimalUtil.compareTo(Z8346FacRecI, T01TR4_A8346FacRecI[0]) != 0 ) || ( Z252CliCod != T01TR4_A252CliCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11629MeivaId, T01TR4_A11629MeivaId[0]) != 0 ) || ( GXutil.strcmp(Z14217MotAnuID, T01TR4_A14217MotAnuID[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z437FacFpg, T01TR4_A437FacFpg[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacFpg");
               GXutil.writeLogRaw("Old: ",Z437FacFpg);
               GXutil.writeLogRaw("Current: ",T01TR4_A437FacFpg[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z436FacFch), GXutil.resetTime(T01TR4_A436FacFch[0])) ) )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacFch");
               GXutil.writeLogRaw("Old: ",Z436FacFch);
               GXutil.writeLogRaw("Current: ",T01TR4_A436FacFch[0]);
            }
            if ( GXutil.strcmp(Z450FacPri, T01TR4_A450FacPri[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacPri");
               GXutil.writeLogRaw("Old: ",Z450FacPri);
               GXutil.writeLogRaw("Current: ",T01TR4_A450FacPri[0]);
            }
            if ( DecimalUtil.compareTo(Z433FacDtoGen, T01TR4_A433FacDtoGen[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacDtoGen");
               GXutil.writeLogRaw("Old: ",Z433FacDtoGen);
               GXutil.writeLogRaw("Current: ",T01TR4_A433FacDtoGen[0]);
            }
            if ( DecimalUtil.compareTo(Z434FacDtoPP, T01TR4_A434FacDtoPP[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacDtoPP");
               GXutil.writeLogRaw("Old: ",Z434FacDtoPP);
               GXutil.writeLogRaw("Current: ",T01TR4_A434FacDtoPP[0]);
            }
            if ( GXutil.strcmp(Z960FacIVACod, T01TR4_A960FacIVACod[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacIVACod");
               GXutil.writeLogRaw("Old: ",Z960FacIVACod);
               GXutil.writeLogRaw("Current: ",T01TR4_A960FacIVACod[0]);
            }
            if ( Z443FacIVAPor != T01TR4_A443FacIVAPor[0] )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacIVAPor");
               GXutil.writeLogRaw("Old: ",Z443FacIVAPor);
               GXutil.writeLogRaw("Current: ",T01TR4_A443FacIVAPor[0]);
            }
            if ( DecimalUtil.compareTo(Z453FacRECPor, T01TR4_A453FacRECPor[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacRECPor");
               GXutil.writeLogRaw("Old: ",Z453FacRECPor);
               GXutil.writeLogRaw("Current: ",T01TR4_A453FacRECPor[0]);
            }
            if ( Z435FacEst != T01TR4_A435FacEst[0] )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacEst");
               GXutil.writeLogRaw("Old: ",Z435FacEst);
               GXutil.writeLogRaw("Current: ",T01TR4_A435FacEst[0]);
            }
            if ( Z445FacLiC != T01TR4_A445FacLiC[0] )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacLiC");
               GXutil.writeLogRaw("Old: ",Z445FacLiC);
               GXutil.writeLogRaw("Current: ",T01TR4_A445FacLiC[0]);
            }
            if ( GXutil.strcmp(Z965FacCob, T01TR4_A965FacCob[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacCob");
               GXutil.writeLogRaw("Old: ",Z965FacCob);
               GXutil.writeLogRaw("Current: ",T01TR4_A965FacCob[0]);
            }
            if ( Z1150FacNumVto != T01TR4_A1150FacNumVto[0] )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacNumVto");
               GXutil.writeLogRaw("Old: ",Z1150FacNumVto);
               GXutil.writeLogRaw("Current: ",T01TR4_A1150FacNumVto[0]);
            }
            if ( GXutil.strcmp(Z1151FacPer, T01TR4_A1151FacPer[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacPer");
               GXutil.writeLogRaw("Old: ",Z1151FacPer);
               GXutil.writeLogRaw("Current: ",T01TR4_A1151FacPer[0]);
            }
            if ( GXutil.strcmp(Z1152FacDiaPag, T01TR4_A1152FacDiaPag[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacDiaPag");
               GXutil.writeLogRaw("Old: ",Z1152FacDiaPag);
               GXutil.writeLogRaw("Current: ",T01TR4_A1152FacDiaPag[0]);
            }
            if ( Z1153FacTipFac != T01TR4_A1153FacTipFac[0] )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacTipFac");
               GXutil.writeLogRaw("Old: ",Z1153FacTipFac);
               GXutil.writeLogRaw("Current: ",T01TR4_A1153FacTipFac[0]);
            }
            if ( GXutil.strcmp(Z2739FacSerNum, T01TR4_A2739FacSerNum[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacSerNum");
               GXutil.writeLogRaw("Old: ",Z2739FacSerNum);
               GXutil.writeLogRaw("Current: ",T01TR4_A2739FacSerNum[0]);
            }
            if ( DecimalUtil.compareTo(Z6632FacDto, T01TR4_A6632FacDto[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacDto");
               GXutil.writeLogRaw("Old: ",Z6632FacDto);
               GXutil.writeLogRaw("Current: ",T01TR4_A6632FacDto[0]);
            }
            if ( DecimalUtil.compareTo(Z7211Factrm, T01TR4_A7211Factrm[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"Factrm");
               GXutil.writeLogRaw("Old: ",Z7211Factrm);
               GXutil.writeLogRaw("Current: ",T01TR4_A7211Factrm[0]);
            }
            if ( DecimalUtil.compareTo(Z7212FacRect, T01TR4_A7212FacRect[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacRect");
               GXutil.writeLogRaw("Old: ",Z7212FacRect);
               GXutil.writeLogRaw("Current: ",T01TR4_A7212FacRect[0]);
            }
            if ( GXutil.strcmp(Z9605FacFirma, T01TR4_A9605FacFirma[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacFirma");
               GXutil.writeLogRaw("Old: ",Z9605FacFirma);
               GXutil.writeLogRaw("Current: ",T01TR4_A9605FacFirma[0]);
            }
            if ( !( GXutil.dateCompare(Z9606FacHor, T01TR4_A9606FacHor[0]) ) )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacHor");
               GXutil.writeLogRaw("Old: ",Z9606FacHor);
               GXutil.writeLogRaw("Current: ",T01TR4_A9606FacHor[0]);
            }
            if ( DecimalUtil.compareTo(Z9643FacLiq1, T01TR4_A9643FacLiq1[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacLiq1");
               GXutil.writeLogRaw("Old: ",Z9643FacLiq1);
               GXutil.writeLogRaw("Current: ",T01TR4_A9643FacLiq1[0]);
            }
            if ( DecimalUtil.compareTo(Z9644FacLiq2, T01TR4_A9644FacLiq2[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacLiq2");
               GXutil.writeLogRaw("Old: ",Z9644FacLiq2);
               GXutil.writeLogRaw("Current: ",T01TR4_A9644FacLiq2[0]);
            }
            if ( DecimalUtil.compareTo(Z9645FacIva1, T01TR4_A9645FacIva1[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacIva1");
               GXutil.writeLogRaw("Old: ",Z9645FacIva1);
               GXutil.writeLogRaw("Current: ",T01TR4_A9645FacIva1[0]);
            }
            if ( DecimalUtil.compareTo(Z9646FacTot1, T01TR4_A9646FacTot1[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacTot1");
               GXutil.writeLogRaw("Old: ",Z9646FacTot1);
               GXutil.writeLogRaw("Current: ",T01TR4_A9646FacTot1[0]);
            }
            if ( GXutil.strcmp(Z9710FacFirDg, T01TR4_A9710FacFirDg[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacFirDg");
               GXutil.writeLogRaw("Old: ",Z9710FacFirDg);
               GXutil.writeLogRaw("Current: ",T01TR4_A9710FacFirDg[0]);
            }
            if ( Z10417FacCliPgL != T01TR4_A10417FacCliPgL[0] )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacCliPgL");
               GXutil.writeLogRaw("Old: ",Z10417FacCliPgL);
               GXutil.writeLogRaw("Current: ",T01TR4_A10417FacCliPgL[0]);
            }
            if ( GXutil.strcmp(Z10418FacAran, T01TR4_A10418FacAran[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacAran");
               GXutil.writeLogRaw("Old: ",Z10418FacAran);
               GXutil.writeLogRaw("Current: ",T01TR4_A10418FacAran[0]);
            }
            if ( DecimalUtil.compareTo(Z10419FacBrut, T01TR4_A10419FacBrut[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacBrut");
               GXutil.writeLogRaw("Old: ",Z10419FacBrut);
               GXutil.writeLogRaw("Current: ",T01TR4_A10419FacBrut[0]);
            }
            if ( DecimalUtil.compareTo(Z10420FacNet, T01TR4_A10420FacNet[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacNet");
               GXutil.writeLogRaw("Old: ",Z10420FacNet);
               GXutil.writeLogRaw("Current: ",T01TR4_A10420FacNet[0]);
            }
            if ( GXutil.strcmp(Z10421FacInc, T01TR4_A10421FacInc[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacInc");
               GXutil.writeLogRaw("Old: ",Z10421FacInc);
               GXutil.writeLogRaw("Current: ",T01TR4_A10421FacInc[0]);
            }
            if ( GXutil.strcmp(Z10422FacFre, T01TR4_A10422FacFre[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacFre");
               GXutil.writeLogRaw("Old: ",Z10422FacFre);
               GXutil.writeLogRaw("Current: ",T01TR4_A10422FacFre[0]);
            }
            if ( GXutil.strcmp(Z10423FacExp, T01TR4_A10423FacExp[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacExp");
               GXutil.writeLogRaw("Old: ",Z10423FacExp);
               GXutil.writeLogRaw("Current: ",T01TR4_A10423FacExp[0]);
            }
            if ( DecimalUtil.compareTo(Z11513FacRecIca, T01TR4_A11513FacRecIca[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacRecIca");
               GXutil.writeLogRaw("Old: ",Z11513FacRecIca);
               GXutil.writeLogRaw("Current: ",T01TR4_A11513FacRecIca[0]);
            }
            if ( GXutil.strcmp(Z12523FacTpFra, T01TR4_A12523FacTpFra[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacTpFra");
               GXutil.writeLogRaw("Old: ",Z12523FacTpFra);
               GXutil.writeLogRaw("Current: ",T01TR4_A12523FacTpFra[0]);
            }
            if ( GXutil.strcmp(Z11626FacMan, T01TR4_A11626FacMan[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacMan");
               GXutil.writeLogRaw("Old: ",Z11626FacMan);
               GXutil.writeLogRaw("Current: ",T01TR4_A11626FacMan[0]);
            }
            if ( DecimalUtil.compareTo(Z14219FacEnergia, T01TR4_A14219FacEnergia[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacEnergia");
               GXutil.writeLogRaw("Old: ",Z14219FacEnergia);
               GXutil.writeLogRaw("Current: ",T01TR4_A14219FacEnergia[0]);
            }
            if ( DecimalUtil.compareTo(Z14224FacCostFac, T01TR4_A14224FacCostFac[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacCostFac");
               GXutil.writeLogRaw("Old: ",Z14224FacCostFac);
               GXutil.writeLogRaw("Current: ",T01TR4_A14224FacCostFac[0]);
            }
            if ( DecimalUtil.compareTo(Z14222FacCostMts, T01TR4_A14222FacCostMts[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacCostMts");
               GXutil.writeLogRaw("Old: ",Z14222FacCostMts);
               GXutil.writeLogRaw("Current: ",T01TR4_A14222FacCostMts[0]);
            }
            if ( DecimalUtil.compareTo(Z14223FacCostKgs, T01TR4_A14223FacCostKgs[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacCostKgs");
               GXutil.writeLogRaw("Old: ",Z14223FacCostKgs);
               GXutil.writeLogRaw("Current: ",T01TR4_A14223FacCostKgs[0]);
            }
            if ( GXutil.strcmp(Z14226FacAnulada, T01TR4_A14226FacAnulada[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacAnulada");
               GXutil.writeLogRaw("Old: ",Z14226FacAnulada);
               GXutil.writeLogRaw("Current: ",T01TR4_A14226FacAnulada[0]);
            }
            if ( !( GXutil.dateCompare(Z14227FacFecAnul, T01TR4_A14227FacFecAnul[0]) ) )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacFecAnul");
               GXutil.writeLogRaw("Old: ",Z14227FacFecAnul);
               GXutil.writeLogRaw("Current: ",T01TR4_A14227FacFecAnul[0]);
            }
            if ( !( GXutil.dateCompare(Z14229FacSFD, T01TR4_A14229FacSFD[0]) ) )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacSFD");
               GXutil.writeLogRaw("Old: ",Z14229FacSFD);
               GXutil.writeLogRaw("Current: ",T01TR4_A14229FacSFD[0]);
            }
            if ( GXutil.strcmp(Z14230FacIDATe, T01TR4_A14230FacIDATe[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacIDATe");
               GXutil.writeLogRaw("Old: ",Z14230FacIDATe);
               GXutil.writeLogRaw("Current: ",T01TR4_A14230FacIDATe[0]);
            }
            if ( GXutil.strcmp(Z14231FacMsgATe, T01TR4_A14231FacMsgATe[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacMsgATe");
               GXutil.writeLogRaw("Old: ",Z14231FacMsgATe);
               GXutil.writeLogRaw("Current: ",T01TR4_A14231FacMsgATe[0]);
            }
            if ( GXutil.strcmp(Z14232FacIDATc, T01TR4_A14232FacIDATc[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacIDATc");
               GXutil.writeLogRaw("Old: ",Z14232FacIDATc);
               GXutil.writeLogRaw("Current: ",T01TR4_A14232FacIDATc[0]);
            }
            if ( GXutil.strcmp(Z14233FacMsgATc, T01TR4_A14233FacMsgATc[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacMsgATc");
               GXutil.writeLogRaw("Old: ",Z14233FacMsgATc);
               GXutil.writeLogRaw("Current: ",T01TR4_A14233FacMsgATc[0]);
            }
            if ( GXutil.strcmp(Z14234FacIDATd, T01TR4_A14234FacIDATd[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacIDATd");
               GXutil.writeLogRaw("Old: ",Z14234FacIDATd);
               GXutil.writeLogRaw("Current: ",T01TR4_A14234FacIDATd[0]);
            }
            if ( GXutil.strcmp(Z14235FacMsgATd, T01TR4_A14235FacMsgATd[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacMsgATd");
               GXutil.writeLogRaw("Old: ",Z14235FacMsgATd);
               GXutil.writeLogRaw("Current: ",T01TR4_A14235FacMsgATd[0]);
            }
            if ( GXutil.strcmp(Z14236FacSerAT, T01TR4_A14236FacSerAT[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacSerAT");
               GXutil.writeLogRaw("Old: ",Z14236FacSerAT);
               GXutil.writeLogRaw("Current: ",T01TR4_A14236FacSerAT[0]);
            }
            if ( GXutil.strcmp(Z14237FacTipAT, T01TR4_A14237FacTipAT[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacTipAT");
               GXutil.writeLogRaw("Old: ",Z14237FacTipAT);
               GXutil.writeLogRaw("Current: ",T01TR4_A14237FacTipAT[0]);
            }
            if ( GXutil.strcmp(Z11273FacObs2, T01TR4_A11273FacObs2[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacObs2");
               GXutil.writeLogRaw("Old: ",Z11273FacObs2);
               GXutil.writeLogRaw("Current: ",T01TR4_A11273FacObs2[0]);
            }
            if ( !( GXutil.dateCompare(Z14420FacEnvMail, T01TR4_A14420FacEnvMail[0]) ) )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacEnvMail");
               GXutil.writeLogRaw("Old: ",Z14420FacEnvMail);
               GXutil.writeLogRaw("Current: ",T01TR4_A14420FacEnvMail[0]);
            }
            if ( DecimalUtil.compareTo(Z8346FacRecI, T01TR4_A8346FacRecI[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacRecI");
               GXutil.writeLogRaw("Old: ",Z8346FacRecI);
               GXutil.writeLogRaw("Current: ",T01TR4_A8346FacRecI[0]);
            }
            if ( Z252CliCod != T01TR4_A252CliCod[0] )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01TR4_A252CliCod[0]);
            }
            if ( GXutil.strcmp(Z11629MeivaId, T01TR4_A11629MeivaId[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"MeivaId");
               GXutil.writeLogRaw("Old: ",Z11629MeivaId);
               GXutil.writeLogRaw("Current: ",T01TR4_A11629MeivaId[0]);
            }
            if ( GXutil.strcmp(Z14217MotAnuID, T01TR4_A14217MotAnuID[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"MotAnuID");
               GXutil.writeLogRaw("Old: ",Z14217MotAnuID);
               GXutil.writeLogRaw("Current: ",T01TR4_A14217MotAnuID[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCFAVEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TR43( )
   {
      beforeValidate1TR43( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TR43( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TR43( 0) ;
         checkOptimisticConcurrency1TR43( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TR43( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TR43( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TR24 */
                  pr_default.execute(19, new Object[] {Integer.valueOf(A430FacCod), A437FacFpg, A436FacFch, A450FacPri, A433FacDtoGen, A434FacDtoPP, A960FacIVACod, Byte.valueOf(A443FacIVAPor), A453FacRECPor, Byte.valueOf(A435FacEst), Integer.valueOf(A445FacLiC), A965FacCob, Byte.valueOf(A1150FacNumVto), A1151FacPer, A1152FacDiaPag, Byte.valueOf(A1153FacTipFac), A2739FacSerNum, A6632FacDto, A7210FacObs, A7211Factrm, A7212FacRect, A9605FacFirma, A9606FacHor, A9643FacLiq1, A9644FacLiq2, A9645FacIva1, A9646FacTot1, A9710FacFirDg, Byte.valueOf(A10417FacCliPgL), A10418FacAran, A10419FacBrut, A10420FacNet, A10421FacInc, A10422FacFre, A10423FacExp, A11513FacRecIca, A12523FacTpFra, A11626FacMan, A14219FacEnergia, A14224FacCostFac, A14222FacCostMts, A14223FacCostKgs, A14226FacAnulada, A14227FacFecAnul, A14229FacSFD, A14230FacIDATe, A14231FacMsgATe, A14232FacIDATc, A14233FacMsgATc, A14234FacIDATd, A14235FacMsgATd, A14236FacSerAT, A14237FacTipAT, A11273FacObs2, A14420FacEnvMail, Boolean.valueOf(n8346FacRecI), A8346FacRecI, A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n11629MeivaId), A11629MeivaId, Boolean.valueOf(n14217MotAnuID), A14217MotAnuID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
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
                        processLevel1TR43( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1TR0( ) ;
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
            load1TR43( ) ;
         }
         endLevel1TR43( ) ;
      }
      closeExtendedTableCursors1TR43( ) ;
   }

   public void update1TR43( )
   {
      beforeValidate1TR43( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TR43( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TR43( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TR43( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TR43( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TR25 */
                  pr_default.execute(20, new Object[] {A437FacFpg, A436FacFch, A450FacPri, A433FacDtoGen, A434FacDtoPP, A960FacIVACod, Byte.valueOf(A443FacIVAPor), A453FacRECPor, Byte.valueOf(A435FacEst), Integer.valueOf(A445FacLiC), A965FacCob, Byte.valueOf(A1150FacNumVto), A1151FacPer, A1152FacDiaPag, Byte.valueOf(A1153FacTipFac), A2739FacSerNum, A6632FacDto, A7210FacObs, A7211Factrm, A7212FacRect, A9605FacFirma, A9606FacHor, A9643FacLiq1, A9644FacLiq2, A9645FacIva1, A9646FacTot1, A9710FacFirDg, Byte.valueOf(A10417FacCliPgL), A10418FacAran, A10419FacBrut, A10420FacNet, A10421FacInc, A10422FacFre, A10423FacExp, A11513FacRecIca, A12523FacTpFra, A11626FacMan, A14219FacEnergia, A14224FacCostFac, A14222FacCostMts, A14223FacCostKgs, A14226FacAnulada, A14227FacFecAnul, A14229FacSFD, A14230FacIDATe, A14231FacMsgATe, A14232FacIDATc, A14233FacMsgATc, A14234FacIDATd, A14235FacMsgATd, A14236FacSerAT, A14237FacTipAT, A11273FacObs2, A14420FacEnvMail, Boolean.valueOf(n8346FacRecI), A8346FacRecI, Integer.valueOf(A252CliCod), Boolean.valueOf(n11629MeivaId), A11629MeivaId, Boolean.valueOf(n14217MotAnuID), A14217MotAnuID, A396EmprCod, Integer.valueOf(A430FacCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
                  if ( (pr_default.getStatus(20) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFAVEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TR43( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( true /* After */ && true /* Level */ && ( ( A1150FacNumVto != O1150FacNumVto ) || ( GXutil.strcmp(A1151FacPer, O1151FacPer) != 0 ) || ( GXutil.strcmp(A1152FacDiaPag, O1152FacDiaPag) != 0 ) || ( GXutil.strcmp(A437FacFpg, O437FacFpg) != 0 ) || ( DecimalUtil.compareTo(A434FacDtoPP, O434FacDtoPP) != 0 ) || ( DecimalUtil.compareTo(A433FacDtoGen, O433FacDtoGen) != 0 ) || ( A443FacIVAPor != O443FacIVAPor ) || ( DecimalUtil.compareTo(A453FacRECPor, O453FacRECPor) != 0 ) ) || ( DecimalUtil.compareTo(A14224FacCostFac, O14224FacCostFac) != 0 ) )
                     {
                        new app.pcalvto(remoteHandle, context).execute( A396EmprCod, A430FacCod) ;
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1TR43( ) ;
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
         endLevel1TR43( ) ;
      }
      closeExtendedTableCursors1TR43( ) ;
   }

   public void deferredUpdate1TR43( )
   {
   }

   public void delete( )
   {
      beforeValidate1TR43( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TR43( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TR43( ) ;
         afterConfirm1TR43( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TR43( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TR26 */
               pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
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
      sMode43 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TR43( ) ;
      Gx_mode = sMode43 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TR43( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true )
         {
            edtCliCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
         }
         else
         {
            if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
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
         if ( true )
         {
            edtFacPri_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPri_Enabled), 5, 0), true);
         }
         else
         {
            if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
            {
               edtFacPri_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtFacPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPri_Enabled), 5, 0), true);
            }
            else
            {
               edtFacPri_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtFacPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPri_Enabled), 5, 0), true);
            }
         }
         if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
         {
            edtFacFch_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFch_Enabled), 5, 0), true);
         }
         else
         {
            if ( ( AV19FirmaD == 1 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
            {
               edtFacFch_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtFacFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFch_Enabled), 5, 0), true);
            }
            else
            {
               edtFacFch_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtFacFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFch_Enabled), 5, 0), true);
            }
         }
         if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
         {
            edtFacDtoGen_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacDtoGen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDtoGen_Enabled), 5, 0), true);
         }
         else
         {
            edtFacDtoGen_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacDtoGen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDtoGen_Enabled), 5, 0), true);
         }
         if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
         {
            edtFacSerNum_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacSerNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacSerNum_Enabled), 5, 0), true);
         }
         else
         {
            edtFacSerNum_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacSerNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacSerNum_Enabled), 5, 0), true);
         }
         if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
         {
            edtFacFpg_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacFpg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFpg_Enabled), 5, 0), true);
         }
         else
         {
            edtFacFpg_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacFpg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFpg_Enabled), 5, 0), true);
         }
         if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
         {
            edtFacNumVto_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacNumVto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacNumVto_Enabled), 5, 0), true);
         }
         else
         {
            edtFacNumVto_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacNumVto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacNumVto_Enabled), 5, 0), true);
         }
         if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
         {
            edtFacPer_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacPer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPer_Enabled), 5, 0), true);
         }
         else
         {
            edtFacPer_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacPer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPer_Enabled), 5, 0), true);
         }
         if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
         {
            edtFacDiaPag_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacDiaPag_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDiaPag_Enabled), 5, 0), true);
         }
         else
         {
            edtFacDiaPag_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacDiaPag_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDiaPag_Enabled), 5, 0), true);
         }
         A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14221FacCostEng", GXutil.ltrimstr( A14221FacCostEng, 12, 3));
         A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14220FacCostEne", GXutil.ltrimstr( A14220FacCostEne, 12, 3));
         /* Using cursor T01TR27 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n11629MeivaId), A11629MeivaId});
         A11630MeivaDsc = T01TR27_A11630MeivaDsc[0] ;
         n11630MeivaDsc = T01TR27_n11630MeivaDsc[0] ;
         pr_default.close(22);
         /* Using cursor T01TR28 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01TR28_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A858ZonGeoCod = T01TR28_A858ZonGeoCod[0] ;
         pr_default.close(23);
         if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
         {
            edtFacIVAPor_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacIVAPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacIVAPor_Enabled), 5, 0), true);
         }
         else
         {
            if ( A858ZonGeoCod == 999 )
            {
               edtFacIVAPor_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtFacIVAPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacIVAPor_Enabled), 5, 0), true);
            }
            else
            {
               edtFacIVAPor_Enabled = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtFacIVAPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacIVAPor_Enabled), 5, 0), true);
            }
         }
         /* Using cursor T01TR29 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n14217MotAnuID), A14217MotAnuID});
         A14228MotAnuDc = T01TR29_A14228MotAnuDc[0] ;
         pr_default.close(24);
         /* Using cursor T01TR30 */
         pr_default.execute(25, new Object[] {A396EmprCod, Short.valueOf(A858ZonGeoCod)});
         A1360ZonGeoNom = T01TR30_A1360ZonGeoNom[0] ;
         n1360ZonGeoNom = T01TR30_n1360ZonGeoNom[0] ;
         pr_default.close(25);
         /* Using cursor T01TR32 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            A3918FacImpTot1 = T01TR32_A3918FacImpTot1[0] ;
            n3918FacImpTot1 = T01TR32_n3918FacImpTot1[0] ;
         }
         else
         {
            A3918FacImpTot1 = DecimalUtil.doubleToDec(0) ;
            n3918FacImpTot1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
         }
         pr_default.close(26);
         A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            }
            else
            {
               A439FacImpGen = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            }
         }
         A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
            }
            else
            {
               A440FacImpPP = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
            }
         }
         A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
         A14225FacImpEner = GXutil.roundDecimal( A14218FacImpEng1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
         A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
         A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
         A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
            }
            else
            {
               A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
            }
         }
         A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
            }
            else
            {
               A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
            }
         }
         A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
            }
            else
            {
               A452FacRecImp = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
            }
         }
         A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
            }
            else
            {
               A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
            }
         }
         A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
         A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
         A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
         httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
         A7215FacImpRet2 = GXutil.roundDecimal( A441FacImpTot.subtract(A7213FacImpRet), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
      }
   }

   public void processNestedLevel1TR44( )
   {
      s3918FacImpTot1 = O3918FacImpTot1 ;
      n3918FacImpTot1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
      s14225FacImpEner = O14225FacImpEner ;
      httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
      s440FacImpPP = O440FacImpPP ;
      httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
      s439FacImpGen = O439FacImpGen ;
      httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
      s11515FacImpIca = O11515FacImpIca ;
      httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
      s7213FacImpRet = O7213FacImpRet ;
      httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
      s452FacRecImp = O452FacRecImp ;
      httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
      s8347FacImpReI = O8347FacImpReI ;
      httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
      s8348FacImpReI1 = O8348FacImpReI1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
      s442FacIVAImp = O442FacIVAImp ;
      httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
      s455FacTot = O455FacTot ;
      httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
      s3921FacIvaImp1 = O3921FacIvaImp1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
      s3922FacRecImp1 = O3922FacRecImp1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
      s7214FacImpRet1 = O7214FacImpRet1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
      s11514FacImpIca1 = O11514FacImpIca1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
      s429FacBasImp = O429FacBasImp ;
      httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
      s7215FacImpRet2 = O7215FacImpRet2 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
      s441FacImpTot = O441FacImpTot ;
      httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
      s3919FacImpGen1 = O3919FacImpGen1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
      s3920FacImpPP1 = O3920FacImpPP1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
      s14218FacImpEng1 = O14218FacImpEng1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
      nGXsfl_204_idx = 0 ;
      while ( nGXsfl_204_idx < nRC_GXsfl_204 )
      {
         readRow1TR44( ) ;
         if ( ( nRcdExists_44 != 0 ) || ( nIsMod_44 != 0 ) )
         {
            standaloneNotModal1TR44( ) ;
            getKey1TR44( ) ;
            if ( ( nRcdExists_44 == 0 ) && ( nRcdDeleted_44 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1TR44( ) ;
            }
            else
            {
               if ( RcdFound44 != 0 )
               {
                  if ( ( nRcdDeleted_44 != 0 ) && ( nRcdExists_44 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1TR44( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_44 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1TR44( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_44 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            O3918FacImpTot1 = A3918FacImpTot1 ;
            n3918FacImpTot1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
            O14225FacImpEner = A14225FacImpEner ;
            httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
            O440FacImpPP = A440FacImpPP ;
            httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
            O439FacImpGen = A439FacImpGen ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            O11515FacImpIca = A11515FacImpIca ;
            httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
            O7213FacImpRet = A7213FacImpRet ;
            httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
            O452FacRecImp = A452FacRecImp ;
            httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
            O8347FacImpReI = A8347FacImpReI ;
            httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
            O8348FacImpReI1 = A8348FacImpReI1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
            O442FacIVAImp = A442FacIVAImp ;
            httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
            O455FacTot = A455FacTot ;
            httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
            O3921FacIvaImp1 = A3921FacIvaImp1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
            O3922FacRecImp1 = A3922FacRecImp1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
            O7214FacImpRet1 = A7214FacImpRet1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
            O11514FacImpIca1 = A11514FacImpIca1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
            O429FacBasImp = A429FacBasImp ;
            httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
            O7215FacImpRet2 = A7215FacImpRet2 ;
            httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
            O441FacImpTot = A441FacImpTot ;
            httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
            O3919FacImpGen1 = A3919FacImpGen1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
            O3920FacImpPP1 = A3920FacImpPP1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
            O14218FacImpEng1 = A14218FacImpEng1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
         }
         httpContext.changePostValue( edtFacLin_Internalname, GXutil.ltrim( localUtil.ntoc( A446FacLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacAlbCod_Internalname, GXutil.ltrim( localUtil.ntoc( A427FacAlbCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacAlbTip_Internalname, GXutil.ltrim( localUtil.ntoc( A428FacAlbTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacNHdr_Internalname, GXutil.rtrim( A14247FacNHdr)) ;
         httpContext.changePostValue( edtFacMts_Internalname, GXutil.ltrim( localUtil.ntoc( A447FacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacPreMts_Internalname, GXutil.ltrim( localUtil.ntoc( A449FacPreMts, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A444FacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacPreKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A448FacPreKgs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacUnds_Internalname, GXutil.ltrim( localUtil.ntoc( A12197FacUnds, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacPreUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A12198FacPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacRec_Internalname, GXutil.ltrim( localUtil.ntoc( A451FacRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacBonLi_Internalname, GXutil.ltrim( localUtil.ntoc( A5050FacBonLi, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacImp_Internalname, GXutil.ltrim( localUtil.ntoc( A438FacImp, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacSer_Internalname, GXutil.rtrim( A454FacSer)) ;
         httpContext.changePostValue( edtFacBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1294FacBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A1295FacBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacBarPar_Internalname, GXutil.rtrim( A1296FacBarPar)) ;
         httpContext.changePostValue( edtFacDsc_Internalname, GXutil.rtrim( A432FacDsc)) ;
         httpContext.changePostValue( edtFacFasCod_Internalname, GXutil.rtrim( A3397FacFasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z446FacLin_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z446FacLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5050FacBonLi_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z5050FacBonLi, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z427FacAlbCod_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z427FacAlbCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1294FacBarCod_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z1294FacBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1295FacBarReo_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z1295FacBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1296FacBarPar_"+sGXsfl_204_idx, GXutil.rtrim( Z1296FacBarPar)) ;
         httpContext.changePostValue( "ZT_"+"Z428FacAlbTip_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z428FacAlbTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z454FacSer_"+sGXsfl_204_idx, GXutil.rtrim( Z454FacSer)) ;
         httpContext.changePostValue( "ZT_"+"Z432FacDsc_"+sGXsfl_204_idx, GXutil.rtrim( Z432FacDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z1498FacDisNum_"+sGXsfl_204_idx, GXutil.rtrim( Z1498FacDisNum)) ;
         httpContext.changePostValue( "ZT_"+"Z447FacMts_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z447FacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z449FacPreMts_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z449FacPreMts, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z444FacKgs_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z444FacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z448FacPreKgs_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z448FacPreKgs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z451FacRec_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z451FacRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3097FacTipPro_"+sGXsfl_204_idx, GXutil.rtrim( Z3097FacTipPro)) ;
         httpContext.changePostValue( "ZT_"+"Z3303FacNPart_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z3303FacNPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3397FacFasCod_"+sGXsfl_204_idx, GXutil.rtrim( Z3397FacFasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z3878FacColNom_"+sGXsfl_204_idx, GXutil.rtrim( Z3878FacColNom)) ;
         httpContext.changePostValue( "ZT_"+"Z3879FocColNum_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z3879FocColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3880FacTipColC_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z3880FacTipColC, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3881FacNomCol_"+sGXsfl_204_idx, GXutil.rtrim( Z3881FacNomCol)) ;
         httpContext.changePostValue( "ZT_"+"Z3882FacNumCol_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z3882FacNumCol, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3883FacCliCod_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z3883FacCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3884FacProCod_"+sGXsfl_204_idx, GXutil.rtrim( Z3884FacProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4389FacDsc2_"+sGXsfl_204_idx, GXutil.rtrim( Z4389FacDsc2)) ;
         httpContext.changePostValue( "ZT_"+"Z4814FacEncCli_"+sGXsfl_204_idx, GXutil.rtrim( Z4814FacEncCli)) ;
         httpContext.changePostValue( "ZT_"+"Z5172FacDishCod_"+sGXsfl_204_idx, GXutil.rtrim( Z5172FacDishCod)) ;
         httpContext.changePostValue( "ZT_"+"Z5189FacTipArt_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z5189FacTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5353FacImpMan_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z5353FacImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5355FacImpMin_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z5355FacImpMin, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3898FacPreKgsA_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z3898FacPreKgsA, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6837FacCosPQ_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z6837FacCosPQ, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9647FacImpdto_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z9647FacImpdto, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9648FacDtoL_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z9648FacDtoL, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9649FacPKDto_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z9649FacPKDto, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9650FacPMdto_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z9650FacPMdto, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9651FacImpd_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z9651FacImpd, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9708FacDscII_"+sGXsfl_204_idx, GXutil.rtrim( Z9708FacDscII)) ;
         httpContext.changePostValue( "ZT_"+"Z10271FacAcs_"+sGXsfl_204_idx, GXutil.rtrim( Z10271FacAcs)) ;
         httpContext.changePostValue( "ZT_"+"Z3897FacKgsA_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z3897FacKgsA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3899FacFecAlb_"+sGXsfl_204_idx, localUtil.dtoc( Z3899FacFecAlb, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z12197FacUnds_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z12197FacUnds, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12198FacPreUnd_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z12198FacPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12906FacCadEnc_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z12906FacCadEnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14238FacLinTRM_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( Z14238FacLinTRM, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14239FACLinTRMF_"+sGXsfl_204_idx, localUtil.ttoc( Z14239FACLinTRMF, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "T438FacImp_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( O438FacImp, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T448FacPreKgs_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( O448FacPreKgs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T449FacPreMts_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( O449FacPreMts, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_44_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_44, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_44_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_44, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_44_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_44, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N5353FacImpMan_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( A5353FacImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N432FacDsc_"+sGXsfl_204_idx, GXutil.rtrim( A432FacDsc)) ;
         httpContext.changePostValue( "N5355FacImpMin_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( A5355FacImpMin, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N447FacMts_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( A447FacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N449FacPreMts_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( A449FacPreMts, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N444FacKgs_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( A444FacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N448FacPreKgs_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( A448FacPreKgs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N5050FacBonLi_"+sGXsfl_204_idx, GXutil.ltrim( localUtil.ntoc( A5050FacBonLi, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_44 != 0 )
         {
            httpContext.changePostValue( "FACLIN_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACALBCOD_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacAlbCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACALBTIP_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacAlbTip_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACNHDR_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacNHdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACMTS_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPREMTS_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACKGS_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPREKGS_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACUNDS_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacUnds_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACPREUND_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACREC_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACBONLI_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacBonLi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACBONLI_"+sGXsfl_204_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtFacBonLi_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACIMP_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacImp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACSER_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACBARCOD_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACBARREO_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacBarReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACBARPAR_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacBarPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACDSC_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACFASCOD_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1TR44( ) ;
      if ( AnyError != 0 )
      {
         O3918FacImpTot1 = s3918FacImpTot1 ;
         n3918FacImpTot1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
         O14225FacImpEner = s14225FacImpEner ;
         httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
         O440FacImpPP = s440FacImpPP ;
         httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         O439FacImpGen = s439FacImpGen ;
         httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         O11515FacImpIca = s11515FacImpIca ;
         httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
         O7213FacImpRet = s7213FacImpRet ;
         httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         O452FacRecImp = s452FacRecImp ;
         httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         O8347FacImpReI = s8347FacImpReI ;
         httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         O8348FacImpReI1 = s8348FacImpReI1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
         O442FacIVAImp = s442FacIVAImp ;
         httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         O455FacTot = s455FacTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
         O3921FacIvaImp1 = s3921FacIvaImp1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
         O3922FacRecImp1 = s3922FacRecImp1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
         O7214FacImpRet1 = s7214FacImpRet1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
         O11514FacImpIca1 = s11514FacImpIca1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
         O429FacBasImp = s429FacBasImp ;
         httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
         O7215FacImpRet2 = s7215FacImpRet2 ;
         httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
         O441FacImpTot = s441FacImpTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
         O3919FacImpGen1 = s3919FacImpGen1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
         O3920FacImpPP1 = s3920FacImpPP1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
         O14218FacImpEng1 = s14218FacImpEng1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
      }
      nRcdExists_44 = (short)(0) ;
      nIsMod_44 = (short)(0) ;
      nRcdDeleted_44 = (short)(0) ;
   }

   public void processLevel1TR43( )
   {
      /* Save parent mode. */
      sMode43 = Gx_mode ;
      processNestedLevel1TR44( ) ;
      if ( AnyError != 0 )
      {
         O3918FacImpTot1 = s3918FacImpTot1 ;
         n3918FacImpTot1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
         O14225FacImpEner = s14225FacImpEner ;
         httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
         O440FacImpPP = s440FacImpPP ;
         httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         O439FacImpGen = s439FacImpGen ;
         httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         O11515FacImpIca = s11515FacImpIca ;
         httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
         O7213FacImpRet = s7213FacImpRet ;
         httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         O452FacRecImp = s452FacRecImp ;
         httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         O8347FacImpReI = s8347FacImpReI ;
         httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         O8348FacImpReI1 = s8348FacImpReI1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
         O442FacIVAImp = s442FacIVAImp ;
         httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         O455FacTot = s455FacTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
         O3921FacIvaImp1 = s3921FacIvaImp1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
         O3922FacRecImp1 = s3922FacRecImp1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
         O7214FacImpRet1 = s7214FacImpRet1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
         O11514FacImpIca1 = s11514FacImpIca1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
         O429FacBasImp = s429FacBasImp ;
         httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
         O7215FacImpRet2 = s7215FacImpRet2 ;
         httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
         O441FacImpTot = s441FacImpTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
         O3919FacImpGen1 = s3919FacImpGen1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
         O3920FacImpPP1 = s3920FacImpPP1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
         O14218FacImpEng1 = s14218FacImpEng1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
      }
      /* Restore parent mode. */
      Gx_mode = sMode43 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1TR43( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1TR43( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.mantenimientofactura");
         if ( AnyError == 0 )
         {
            confirmValues1TR0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "facturacion.mantenimientofactura");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TR43( )
   {
      /* Scan By routine */
      /* Using cursor T01TR33 */
      pr_default.execute(27);
      RcdFound43 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A396EmprCod = T01TR33_A396EmprCod[0] ;
         A430FacCod = T01TR33_A430FacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TR43( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound43 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A396EmprCod = T01TR33_A396EmprCod[0] ;
         A430FacCod = T01TR33_A430FacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      }
   }

   public void scanEnd1TR43( )
   {
      pr_default.close(27);
   }

   public void afterConfirm1TR43( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TR43( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TR43( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TR43( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TR43( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TR43( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TR43( )
   {
      edtFacCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCod_Enabled), 5, 0), true);
      edtFacFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFch_Enabled), 5, 0), true);
      edtFacHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacHor_Enabled), 5, 0), true);
      cmbFacEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFacEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFacEst.getEnabled(), 5, 0), true);
      edtFacSerNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacSerNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacSerNum_Enabled), 5, 0), true);
      cmbFacAnulada.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFacAnulada.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFacAnulada.getEnabled(), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtMeivaId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMeivaId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMeivaId_Enabled), 5, 0), true);
      edtFacNumVto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacNumVto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacNumVto_Enabled), 5, 0), true);
      edtFacPer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacPer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPer_Enabled), 5, 0), true);
      edtFacDiaPag_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacDiaPag_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDiaPag_Enabled), 5, 0), true);
      edtFacFpg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacFpg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFpg_Enabled), 5, 0), true);
      edtFacObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacObs_Enabled), 5, 0), true);
      edtFacObs2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacObs2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacObs2_Enabled), 5, 0), true);
      edtFacImpTot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacImpTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacImpTot_Enabled), 5, 0), true);
      edtFacDtoGen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacDtoGen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDtoGen_Enabled), 5, 0), true);
      edtFacImpGen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacImpGen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacImpGen_Enabled), 5, 0), true);
      edtFacDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDto_Enabled), 5, 0), true);
      edtFacImpPP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacImpPP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacImpPP_Enabled), 5, 0), true);
      edtFacBasImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacBasImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBasImp_Enabled), 5, 0), true);
      edtFacIVAPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacIVAPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacIVAPor_Enabled), 5, 0), true);
      edtFacIVAImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacIVAImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacIVAImp_Enabled), 5, 0), true);
      edtFacTot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacTot_Enabled), 5, 0), true);
      edtFacFirma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacFirma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFirma_Enabled), 5, 0), true);
      edtavTexto_fd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTexto_fd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTexto_fd_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombomeivaid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombomeivaid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombomeivaid_Enabled), 5, 0), true);
      edtavCombofacfpg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofacfpg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofacfpg_Enabled), 5, 0), true);
      edtFacPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPri_Enabled), 5, 0), true);
   }

   public void zm1TR44( int GX_JID )
   {
      if ( ( GX_JID == 150 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5050FacBonLi = T01TR3_A5050FacBonLi[0] ;
            Z427FacAlbCod = T01TR3_A427FacAlbCod[0] ;
            Z1294FacBarCod = T01TR3_A1294FacBarCod[0] ;
            Z1295FacBarReo = T01TR3_A1295FacBarReo[0] ;
            Z1296FacBarPar = T01TR3_A1296FacBarPar[0] ;
            Z428FacAlbTip = T01TR3_A428FacAlbTip[0] ;
            Z454FacSer = T01TR3_A454FacSer[0] ;
            Z432FacDsc = T01TR3_A432FacDsc[0] ;
            Z1498FacDisNum = T01TR3_A1498FacDisNum[0] ;
            Z447FacMts = T01TR3_A447FacMts[0] ;
            Z449FacPreMts = T01TR3_A449FacPreMts[0] ;
            Z444FacKgs = T01TR3_A444FacKgs[0] ;
            Z448FacPreKgs = T01TR3_A448FacPreKgs[0] ;
            Z451FacRec = T01TR3_A451FacRec[0] ;
            Z3097FacTipPro = T01TR3_A3097FacTipPro[0] ;
            Z3303FacNPart = T01TR3_A3303FacNPart[0] ;
            Z3397FacFasCod = T01TR3_A3397FacFasCod[0] ;
            Z3878FacColNom = T01TR3_A3878FacColNom[0] ;
            Z3879FocColNum = T01TR3_A3879FocColNum[0] ;
            Z3880FacTipColC = T01TR3_A3880FacTipColC[0] ;
            Z3881FacNomCol = T01TR3_A3881FacNomCol[0] ;
            Z3882FacNumCol = T01TR3_A3882FacNumCol[0] ;
            Z3883FacCliCod = T01TR3_A3883FacCliCod[0] ;
            Z3884FacProCod = T01TR3_A3884FacProCod[0] ;
            Z4389FacDsc2 = T01TR3_A4389FacDsc2[0] ;
            Z4814FacEncCli = T01TR3_A4814FacEncCli[0] ;
            Z5172FacDishCod = T01TR3_A5172FacDishCod[0] ;
            Z5189FacTipArt = T01TR3_A5189FacTipArt[0] ;
            Z5353FacImpMan = T01TR3_A5353FacImpMan[0] ;
            Z5355FacImpMin = T01TR3_A5355FacImpMin[0] ;
            Z3898FacPreKgsA = T01TR3_A3898FacPreKgsA[0] ;
            Z6837FacCosPQ = T01TR3_A6837FacCosPQ[0] ;
            Z9647FacImpdto = T01TR3_A9647FacImpdto[0] ;
            Z9648FacDtoL = T01TR3_A9648FacDtoL[0] ;
            Z9649FacPKDto = T01TR3_A9649FacPKDto[0] ;
            Z9650FacPMdto = T01TR3_A9650FacPMdto[0] ;
            Z9651FacImpd = T01TR3_A9651FacImpd[0] ;
            Z9708FacDscII = T01TR3_A9708FacDscII[0] ;
            Z10271FacAcs = T01TR3_A10271FacAcs[0] ;
            Z3897FacKgsA = T01TR3_A3897FacKgsA[0] ;
            Z3899FacFecAlb = T01TR3_A3899FacFecAlb[0] ;
            Z12197FacUnds = T01TR3_A12197FacUnds[0] ;
            Z12198FacPreUnd = T01TR3_A12198FacPreUnd[0] ;
            Z12906FacCadEnc = T01TR3_A12906FacCadEnc[0] ;
            Z14238FacLinTRM = T01TR3_A14238FacLinTRM[0] ;
            Z14239FACLinTRMF = T01TR3_A14239FACLinTRMF[0] ;
         }
         else
         {
            Z5050FacBonLi = A5050FacBonLi ;
            Z427FacAlbCod = A427FacAlbCod ;
            Z1294FacBarCod = A1294FacBarCod ;
            Z1295FacBarReo = A1295FacBarReo ;
            Z1296FacBarPar = A1296FacBarPar ;
            Z428FacAlbTip = A428FacAlbTip ;
            Z454FacSer = A454FacSer ;
            Z432FacDsc = A432FacDsc ;
            Z1498FacDisNum = A1498FacDisNum ;
            Z447FacMts = A447FacMts ;
            Z449FacPreMts = A449FacPreMts ;
            Z444FacKgs = A444FacKgs ;
            Z448FacPreKgs = A448FacPreKgs ;
            Z451FacRec = A451FacRec ;
            Z3097FacTipPro = A3097FacTipPro ;
            Z3303FacNPart = A3303FacNPart ;
            Z3397FacFasCod = A3397FacFasCod ;
            Z3878FacColNom = A3878FacColNom ;
            Z3879FocColNum = A3879FocColNum ;
            Z3880FacTipColC = A3880FacTipColC ;
            Z3881FacNomCol = A3881FacNomCol ;
            Z3882FacNumCol = A3882FacNumCol ;
            Z3883FacCliCod = A3883FacCliCod ;
            Z3884FacProCod = A3884FacProCod ;
            Z4389FacDsc2 = A4389FacDsc2 ;
            Z4814FacEncCli = A4814FacEncCli ;
            Z5172FacDishCod = A5172FacDishCod ;
            Z5189FacTipArt = A5189FacTipArt ;
            Z5353FacImpMan = A5353FacImpMan ;
            Z5355FacImpMin = A5355FacImpMin ;
            Z3898FacPreKgsA = A3898FacPreKgsA ;
            Z6837FacCosPQ = A6837FacCosPQ ;
            Z9647FacImpdto = A9647FacImpdto ;
            Z9648FacDtoL = A9648FacDtoL ;
            Z9649FacPKDto = A9649FacPKDto ;
            Z9650FacPMdto = A9650FacPMdto ;
            Z9651FacImpd = A9651FacImpd ;
            Z9708FacDscII = A9708FacDscII ;
            Z10271FacAcs = A10271FacAcs ;
            Z3897FacKgsA = A3897FacKgsA ;
            Z3899FacFecAlb = A3899FacFecAlb ;
            Z12197FacUnds = A12197FacUnds ;
            Z12198FacPreUnd = A12198FacPreUnd ;
            Z12906FacCadEnc = A12906FacCadEnc ;
            Z14238FacLinTRM = A14238FacLinTRM ;
            Z14239FACLinTRMF = A14239FACLinTRMF ;
         }
      }
      if ( GX_JID == -150 )
      {
         Z430FacCod = A430FacCod ;
         Z446FacLin = A446FacLin ;
         Z5050FacBonLi = A5050FacBonLi ;
         Z427FacAlbCod = A427FacAlbCod ;
         Z1294FacBarCod = A1294FacBarCod ;
         Z1295FacBarReo = A1295FacBarReo ;
         Z1296FacBarPar = A1296FacBarPar ;
         Z428FacAlbTip = A428FacAlbTip ;
         Z454FacSer = A454FacSer ;
         Z432FacDsc = A432FacDsc ;
         Z1498FacDisNum = A1498FacDisNum ;
         Z447FacMts = A447FacMts ;
         Z449FacPreMts = A449FacPreMts ;
         Z444FacKgs = A444FacKgs ;
         Z448FacPreKgs = A448FacPreKgs ;
         Z451FacRec = A451FacRec ;
         Z3097FacTipPro = A3097FacTipPro ;
         Z3303FacNPart = A3303FacNPart ;
         Z3397FacFasCod = A3397FacFasCod ;
         Z3878FacColNom = A3878FacColNom ;
         Z3879FocColNum = A3879FocColNum ;
         Z3880FacTipColC = A3880FacTipColC ;
         Z3881FacNomCol = A3881FacNomCol ;
         Z3882FacNumCol = A3882FacNumCol ;
         Z3883FacCliCod = A3883FacCliCod ;
         Z3884FacProCod = A3884FacProCod ;
         Z4389FacDsc2 = A4389FacDsc2 ;
         Z4814FacEncCli = A4814FacEncCli ;
         Z5172FacDishCod = A5172FacDishCod ;
         Z5189FacTipArt = A5189FacTipArt ;
         Z5353FacImpMan = A5353FacImpMan ;
         Z5355FacImpMin = A5355FacImpMin ;
         Z3898FacPreKgsA = A3898FacPreKgsA ;
         Z6837FacCosPQ = A6837FacCosPQ ;
         Z9647FacImpdto = A9647FacImpdto ;
         Z9648FacDtoL = A9648FacDtoL ;
         Z9649FacPKDto = A9649FacPKDto ;
         Z9650FacPMdto = A9650FacPMdto ;
         Z9651FacImpd = A9651FacImpd ;
         Z9708FacDscII = A9708FacDscII ;
         Z10271FacAcs = A10271FacAcs ;
         Z3897FacKgsA = A3897FacKgsA ;
         Z3899FacFecAlb = A3899FacFecAlb ;
         Z12197FacUnds = A12197FacUnds ;
         Z12198FacPreUnd = A12198FacPreUnd ;
         Z12906FacCadEnc = A12906FacCadEnc ;
         Z14238FacLinTRM = A14238FacLinTRM ;
         Z14239FACLinTRMF = A14239FACLinTRMF ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1TR44( )
   {
      edtFacLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacLin_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacAlbCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacAlbCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacAlbCod_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacAlbTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacAlbTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacAlbTip_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacSer_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBarCod_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacBarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBarReo_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacBarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBarPar_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFasCod_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacRec_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      if ( true )
      {
         edtFacDsc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDsc_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      }
      else
      {
         if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
         {
            edtFacDsc_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDsc_Enabled), 5, 0), !bGXsfl_204_Refreshing);
         }
         else
         {
            edtFacDsc_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDsc_Enabled), 5, 0), !bGXsfl_204_Refreshing);
         }
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacMts_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacMts_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      }
      else
      {
         edtFacMts_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacMts_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacKgs_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacKgs_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      }
      else
      {
         edtFacKgs_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacKgs_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacPreMts_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacPreMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPreMts_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      }
      else
      {
         edtFacPreMts_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacPreMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPreMts_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacPreKgs_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacPreKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPreKgs_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      }
      else
      {
         edtFacPreKgs_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacPreKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPreKgs_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      }
      if ( ( AV19FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         edtFacBonLi_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacBonLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBonLi_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      }
      else
      {
         edtFacBonLi_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacBonLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBonLi_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      }
   }

   public void standaloneModal1TR44( )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A5050FacBonLi)==0) && ( Gx_BScreen == 0 ) )
      {
         A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
      }
      A14247FacNHdr = GXutil.str( A1294FacBarCod, 8, 0) + "-" + GXutil.str( A1295FacBarReo, 1, 0) + A1296FacBarPar ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
         A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
         httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
         A7215FacImpRet2 = GXutil.roundDecimal( A441FacImpTot.subtract(A7213FacImpRet), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
         A14225FacImpEner = GXutil.roundDecimal( A14218FacImpEng1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
         A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
         A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
         A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
         A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
         A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
            }
            else
            {
               A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
            }
         }
         if ( A7209Colombia == 0 )
         {
            A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
            }
            else
            {
               A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
            }
         }
         if ( A7209Colombia == 0 )
         {
            A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
            }
            else
            {
               A452FacRecImp = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
            }
         }
         if ( A7209Colombia == 0 )
         {
            A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
            }
            else
            {
               A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
            }
         }
         if ( A7209Colombia == 0 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            }
            else
            {
               A439FacImpGen = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            }
         }
         if ( A7209Colombia == 0 )
         {
            A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
            }
            else
            {
               A440FacImpPP = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
            }
         }
         A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
      }
   }

   public void load1TR44( )
   {
      /* Using cursor T01TR34 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound44 = (short)(1) ;
         A5050FacBonLi = T01TR34_A5050FacBonLi[0] ;
         A427FacAlbCod = T01TR34_A427FacAlbCod[0] ;
         A1294FacBarCod = T01TR34_A1294FacBarCod[0] ;
         A1295FacBarReo = T01TR34_A1295FacBarReo[0] ;
         A1296FacBarPar = T01TR34_A1296FacBarPar[0] ;
         A428FacAlbTip = T01TR34_A428FacAlbTip[0] ;
         A454FacSer = T01TR34_A454FacSer[0] ;
         A432FacDsc = T01TR34_A432FacDsc[0] ;
         A1498FacDisNum = T01TR34_A1498FacDisNum[0] ;
         A447FacMts = T01TR34_A447FacMts[0] ;
         A449FacPreMts = T01TR34_A449FacPreMts[0] ;
         A444FacKgs = T01TR34_A444FacKgs[0] ;
         A448FacPreKgs = T01TR34_A448FacPreKgs[0] ;
         A451FacRec = T01TR34_A451FacRec[0] ;
         A3097FacTipPro = T01TR34_A3097FacTipPro[0] ;
         A3303FacNPart = T01TR34_A3303FacNPart[0] ;
         A3397FacFasCod = T01TR34_A3397FacFasCod[0] ;
         A3878FacColNom = T01TR34_A3878FacColNom[0] ;
         A3879FocColNum = T01TR34_A3879FocColNum[0] ;
         A3880FacTipColC = T01TR34_A3880FacTipColC[0] ;
         A3881FacNomCol = T01TR34_A3881FacNomCol[0] ;
         A3882FacNumCol = T01TR34_A3882FacNumCol[0] ;
         A3883FacCliCod = T01TR34_A3883FacCliCod[0] ;
         A3884FacProCod = T01TR34_A3884FacProCod[0] ;
         A4389FacDsc2 = T01TR34_A4389FacDsc2[0] ;
         A4814FacEncCli = T01TR34_A4814FacEncCli[0] ;
         A5172FacDishCod = T01TR34_A5172FacDishCod[0] ;
         A5189FacTipArt = T01TR34_A5189FacTipArt[0] ;
         A5353FacImpMan = T01TR34_A5353FacImpMan[0] ;
         A5355FacImpMin = T01TR34_A5355FacImpMin[0] ;
         A3898FacPreKgsA = T01TR34_A3898FacPreKgsA[0] ;
         A6837FacCosPQ = T01TR34_A6837FacCosPQ[0] ;
         A9647FacImpdto = T01TR34_A9647FacImpdto[0] ;
         A9648FacDtoL = T01TR34_A9648FacDtoL[0] ;
         A9649FacPKDto = T01TR34_A9649FacPKDto[0] ;
         A9650FacPMdto = T01TR34_A9650FacPMdto[0] ;
         A9651FacImpd = T01TR34_A9651FacImpd[0] ;
         A9708FacDscII = T01TR34_A9708FacDscII[0] ;
         A10271FacAcs = T01TR34_A10271FacAcs[0] ;
         A3897FacKgsA = T01TR34_A3897FacKgsA[0] ;
         A3899FacFecAlb = T01TR34_A3899FacFecAlb[0] ;
         A12197FacUnds = T01TR34_A12197FacUnds[0] ;
         A12198FacPreUnd = T01TR34_A12198FacPreUnd[0] ;
         A12906FacCadEnc = T01TR34_A12906FacCadEnc[0] ;
         A14238FacLinTRM = T01TR34_A14238FacLinTRM[0] ;
         A14239FACLinTRMF = T01TR34_A14239FACLinTRMF[0] ;
         zm1TR44( -150) ;
      }
      pr_default.close(28);
      onLoadActions1TR44( ) ;
   }

   public void onLoadActions1TR44( )
   {
      A2239FacIml = (A448FacPreKgs.multiply(A444FacKgs)).add((A449FacPreMts.multiply(A447FacMts))).add((A3898FacPreKgsA.multiply(A3897FacKgsA))).add((DecimalUtil.doubleToDec(A12197FacUnds).multiply(A12198FacPreUnd))) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2239FacIml", GXutil.ltrimstr( A2239FacIml, 16, 5));
      if ( ( DecimalUtil.compareTo(A2239FacIml, A5355FacImpMin) < 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5355FacImpMin)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) )
      {
         A3923FacImp1 = A5355FacImpMin ;
         httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
      }
      else
      {
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A2239FacIml)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) )
         {
            A3923FacImp1 = A5353FacImpMan ;
            httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
         }
         else
         {
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A12198FacPreUnd)==0) )
            {
               A3923FacImp1 = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
            }
            else
            {
               A3923FacImp1 = A2239FacIml ;
               httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
            }
         }
      }
      A438FacImp = GXutil.roundDecimal( A3923FacImp1, 2) ;
      O438FacImp = A438FacImp ;
      if ( isIns( )  )
      {
         A3918FacImpTot1 = O3918FacImpTot1.add(A438FacImp) ;
         n3918FacImpTot1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A3918FacImpTot1 = O3918FacImpTot1.add(A438FacImp).subtract(O438FacImp) ;
            n3918FacImpTot1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A3918FacImpTot1 = O3918FacImpTot1.subtract(O438FacImp) ;
               n3918FacImpTot1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
            }
         }
      }
      A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
      A14225FacImpEner = GXutil.roundDecimal( A14218FacImpEng1, 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
      A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         }
         else
         {
            A440FacImpPP = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         }
      }
      A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
         else
         {
            A439FacImpGen = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
      }
      A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
      A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
      A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
      A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
      A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         }
         else
         {
            A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         }
      }
      A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         }
         else
         {
            A452FacRecImp = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         }
      }
      A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         }
         else
         {
            A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         }
      }
      A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         }
         else
         {
            A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         }
      }
      A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
      httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
      A7215FacImpRet2 = GXutil.roundDecimal( A441FacImpTot.subtract(A7213FacImpRet), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
   }

   public void checkExtendedTable1TR44( )
   {
      nIsDirty_44 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1TR44( ) ;
      if ( ( ( A447FacMts.doubleValue() < 0 ) || ( A444FacKgs.doubleValue() < 0 ) || ( A448FacPreKgs.doubleValue() < 0 ) || ( A449FacPreMts.doubleValue() < 0 ) ) && ( AV19FirmaD == 1 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         GXCCtl = "FACMTS_" + sGXsfl_204_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite entrar valores NEGATIVOS", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacMts_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_44 = (short)(1) ;
      A2239FacIml = (A448FacPreKgs.multiply(A444FacKgs)).add((A449FacPreMts.multiply(A447FacMts))).add((A3898FacPreKgsA.multiply(A3897FacKgsA))).add((DecimalUtil.doubleToDec(A12197FacUnds).multiply(A12198FacPreUnd))) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2239FacIml", GXutil.ltrimstr( A2239FacIml, 16, 5));
      if ( ( DecimalUtil.compareTo(A2239FacIml, A5355FacImpMin) < 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5355FacImpMin)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) )
      {
         nIsDirty_44 = (short)(1) ;
         A3923FacImp1 = A5355FacImpMin ;
         httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
      }
      else
      {
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A2239FacIml)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) )
         {
            nIsDirty_44 = (short)(1) ;
            A3923FacImp1 = A5353FacImpMan ;
            httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
         }
         else
         {
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A12198FacPreUnd)==0) )
            {
               nIsDirty_44 = (short)(1) ;
               A3923FacImp1 = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
            }
            else
            {
               nIsDirty_44 = (short)(1) ;
               A3923FacImp1 = A2239FacIml ;
               httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
            }
         }
      }
      nIsDirty_44 = (short)(1) ;
      A438FacImp = GXutil.roundDecimal( A3923FacImp1, 2) ;
      if ( isIns( )  )
      {
         nIsDirty_44 = (short)(1) ;
         A3918FacImpTot1 = O3918FacImpTot1.add(A438FacImp) ;
         n3918FacImpTot1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_44 = (short)(1) ;
            A3918FacImpTot1 = O3918FacImpTot1.add(A438FacImp).subtract(O438FacImp) ;
            n3918FacImpTot1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_44 = (short)(1) ;
               A3918FacImpTot1 = O3918FacImpTot1.subtract(O438FacImp) ;
               n3918FacImpTot1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
            }
         }
      }
      nIsDirty_44 = (short)(1) ;
      A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
      nIsDirty_44 = (short)(1) ;
      A14225FacImpEner = GXutil.roundDecimal( A14218FacImpEng1, 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
      nIsDirty_44 = (short)(1) ;
      A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         nIsDirty_44 = (short)(1) ;
         A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            nIsDirty_44 = (short)(1) ;
            A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         }
         else
         {
            nIsDirty_44 = (short)(1) ;
            A440FacImpPP = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         }
      }
      nIsDirty_44 = (short)(1) ;
      A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         nIsDirty_44 = (short)(1) ;
         A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            nIsDirty_44 = (short)(1) ;
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
         else
         {
            nIsDirty_44 = (short)(1) ;
            A439FacImpGen = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
      }
      nIsDirty_44 = (short)(1) ;
      A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
      nIsDirty_44 = (short)(1) ;
      A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
      nIsDirty_44 = (short)(1) ;
      A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
      nIsDirty_44 = (short)(1) ;
      A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
      nIsDirty_44 = (short)(1) ;
      A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         nIsDirty_44 = (short)(1) ;
         A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            nIsDirty_44 = (short)(1) ;
            A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         }
         else
         {
            nIsDirty_44 = (short)(1) ;
            A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         }
      }
      nIsDirty_44 = (short)(1) ;
      A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         nIsDirty_44 = (short)(1) ;
         A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            nIsDirty_44 = (short)(1) ;
            A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         }
         else
         {
            nIsDirty_44 = (short)(1) ;
            A452FacRecImp = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         }
      }
      nIsDirty_44 = (short)(1) ;
      A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         nIsDirty_44 = (short)(1) ;
         A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            nIsDirty_44 = (short)(1) ;
            A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         }
         else
         {
            nIsDirty_44 = (short)(1) ;
            A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         }
      }
      nIsDirty_44 = (short)(1) ;
      A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
      if ( A7209Colombia == 0 )
      {
         nIsDirty_44 = (short)(1) ;
         A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            nIsDirty_44 = (short)(1) ;
            A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         }
         else
         {
            nIsDirty_44 = (short)(1) ;
            A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         }
      }
      nIsDirty_44 = (short)(1) ;
      A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
      httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
      nIsDirty_44 = (short)(1) ;
      A7215FacImpRet2 = GXutil.roundDecimal( A441FacImpTot.subtract(A7213FacImpRet), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
   }

   public void closeExtendedTableCursors1TR44( )
   {
   }

   public void enableDisable1TR44( )
   {
   }

   public void getKey1TR44( )
   {
      /* Using cursor T01TR35 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound44 = (short)(1) ;
      }
      else
      {
         RcdFound44 = (short)(0) ;
      }
      pr_default.close(29);
   }

   public void getByPrimaryKey1TR44( )
   {
      /* Using cursor T01TR3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1TR44( 150) ;
         RcdFound44 = (short)(1) ;
         initializeNonKey1TR44( ) ;
         A446FacLin = T01TR3_A446FacLin[0] ;
         A5050FacBonLi = T01TR3_A5050FacBonLi[0] ;
         A427FacAlbCod = T01TR3_A427FacAlbCod[0] ;
         A1294FacBarCod = T01TR3_A1294FacBarCod[0] ;
         A1295FacBarReo = T01TR3_A1295FacBarReo[0] ;
         A1296FacBarPar = T01TR3_A1296FacBarPar[0] ;
         A428FacAlbTip = T01TR3_A428FacAlbTip[0] ;
         A454FacSer = T01TR3_A454FacSer[0] ;
         A432FacDsc = T01TR3_A432FacDsc[0] ;
         A1498FacDisNum = T01TR3_A1498FacDisNum[0] ;
         A447FacMts = T01TR3_A447FacMts[0] ;
         A449FacPreMts = T01TR3_A449FacPreMts[0] ;
         A444FacKgs = T01TR3_A444FacKgs[0] ;
         A448FacPreKgs = T01TR3_A448FacPreKgs[0] ;
         A451FacRec = T01TR3_A451FacRec[0] ;
         A3097FacTipPro = T01TR3_A3097FacTipPro[0] ;
         A3303FacNPart = T01TR3_A3303FacNPart[0] ;
         A3397FacFasCod = T01TR3_A3397FacFasCod[0] ;
         A3878FacColNom = T01TR3_A3878FacColNom[0] ;
         A3879FocColNum = T01TR3_A3879FocColNum[0] ;
         A3880FacTipColC = T01TR3_A3880FacTipColC[0] ;
         A3881FacNomCol = T01TR3_A3881FacNomCol[0] ;
         A3882FacNumCol = T01TR3_A3882FacNumCol[0] ;
         A3883FacCliCod = T01TR3_A3883FacCliCod[0] ;
         A3884FacProCod = T01TR3_A3884FacProCod[0] ;
         A4389FacDsc2 = T01TR3_A4389FacDsc2[0] ;
         A4814FacEncCli = T01TR3_A4814FacEncCli[0] ;
         A5172FacDishCod = T01TR3_A5172FacDishCod[0] ;
         A5189FacTipArt = T01TR3_A5189FacTipArt[0] ;
         A5353FacImpMan = T01TR3_A5353FacImpMan[0] ;
         A5355FacImpMin = T01TR3_A5355FacImpMin[0] ;
         A3898FacPreKgsA = T01TR3_A3898FacPreKgsA[0] ;
         A6837FacCosPQ = T01TR3_A6837FacCosPQ[0] ;
         A9647FacImpdto = T01TR3_A9647FacImpdto[0] ;
         A9648FacDtoL = T01TR3_A9648FacDtoL[0] ;
         A9649FacPKDto = T01TR3_A9649FacPKDto[0] ;
         A9650FacPMdto = T01TR3_A9650FacPMdto[0] ;
         A9651FacImpd = T01TR3_A9651FacImpd[0] ;
         A9708FacDscII = T01TR3_A9708FacDscII[0] ;
         A10271FacAcs = T01TR3_A10271FacAcs[0] ;
         A3897FacKgsA = T01TR3_A3897FacKgsA[0] ;
         A3899FacFecAlb = T01TR3_A3899FacFecAlb[0] ;
         A12197FacUnds = T01TR3_A12197FacUnds[0] ;
         A12198FacPreUnd = T01TR3_A12198FacPreUnd[0] ;
         A12906FacCadEnc = T01TR3_A12906FacCadEnc[0] ;
         A14238FacLinTRM = T01TR3_A14238FacLinTRM[0] ;
         A14239FACLinTRMF = T01TR3_A14239FACLinTRMF[0] ;
         O448FacPreKgs = A448FacPreKgs ;
         O449FacPreMts = A449FacPreMts ;
         Z396EmprCod = A396EmprCod ;
         Z430FacCod = A430FacCod ;
         Z446FacLin = A446FacLin ;
         sMode44 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TR44( ) ;
         Gx_mode = sMode44 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound44 = (short)(0) ;
         initializeNonKey1TR44( ) ;
         sMode44 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1TR44( ) ;
         Gx_mode = sMode44 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1TR44( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1TR44( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TR2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLFAVEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z5050FacBonLi, T01TR2_A5050FacBonLi[0]) != 0 ) || ( Z427FacAlbCod != T01TR2_A427FacAlbCod[0] ) || ( Z1294FacBarCod != T01TR2_A1294FacBarCod[0] ) || ( Z1295FacBarReo != T01TR2_A1295FacBarReo[0] ) || ( GXutil.strcmp(Z1296FacBarPar, T01TR2_A1296FacBarPar[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z428FacAlbTip != T01TR2_A428FacAlbTip[0] ) || ( GXutil.strcmp(Z454FacSer, T01TR2_A454FacSer[0]) != 0 ) || ( GXutil.strcmp(Z432FacDsc, T01TR2_A432FacDsc[0]) != 0 ) || ( GXutil.strcmp(Z1498FacDisNum, T01TR2_A1498FacDisNum[0]) != 0 ) || ( DecimalUtil.compareTo(Z447FacMts, T01TR2_A447FacMts[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z449FacPreMts, T01TR2_A449FacPreMts[0]) != 0 ) || ( DecimalUtil.compareTo(Z444FacKgs, T01TR2_A444FacKgs[0]) != 0 ) || ( DecimalUtil.compareTo(Z448FacPreKgs, T01TR2_A448FacPreKgs[0]) != 0 ) || ( DecimalUtil.compareTo(Z451FacRec, T01TR2_A451FacRec[0]) != 0 ) || ( GXutil.strcmp(Z3097FacTipPro, T01TR2_A3097FacTipPro[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3303FacNPart != T01TR2_A3303FacNPart[0] ) || ( GXutil.strcmp(Z3397FacFasCod, T01TR2_A3397FacFasCod[0]) != 0 ) || ( GXutil.strcmp(Z3878FacColNom, T01TR2_A3878FacColNom[0]) != 0 ) || ( Z3879FocColNum != T01TR2_A3879FocColNum[0] ) || ( Z3880FacTipColC != T01TR2_A3880FacTipColC[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3881FacNomCol, T01TR2_A3881FacNomCol[0]) != 0 ) || ( Z3882FacNumCol != T01TR2_A3882FacNumCol[0] ) || ( Z3883FacCliCod != T01TR2_A3883FacCliCod[0] ) || ( GXutil.strcmp(Z3884FacProCod, T01TR2_A3884FacProCod[0]) != 0 ) || ( GXutil.strcmp(Z4389FacDsc2, T01TR2_A4389FacDsc2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4814FacEncCli, T01TR2_A4814FacEncCli[0]) != 0 ) || ( GXutil.strcmp(Z5172FacDishCod, T01TR2_A5172FacDishCod[0]) != 0 ) || ( Z5189FacTipArt != T01TR2_A5189FacTipArt[0] ) || ( DecimalUtil.compareTo(Z5353FacImpMan, T01TR2_A5353FacImpMan[0]) != 0 ) || ( DecimalUtil.compareTo(Z5355FacImpMin, T01TR2_A5355FacImpMin[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z3898FacPreKgsA, T01TR2_A3898FacPreKgsA[0]) != 0 ) || ( DecimalUtil.compareTo(Z6837FacCosPQ, T01TR2_A6837FacCosPQ[0]) != 0 ) || ( DecimalUtil.compareTo(Z9647FacImpdto, T01TR2_A9647FacImpdto[0]) != 0 ) || ( DecimalUtil.compareTo(Z9648FacDtoL, T01TR2_A9648FacDtoL[0]) != 0 ) || ( DecimalUtil.compareTo(Z9649FacPKDto, T01TR2_A9649FacPKDto[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z9650FacPMdto, T01TR2_A9650FacPMdto[0]) != 0 ) || ( DecimalUtil.compareTo(Z9651FacImpd, T01TR2_A9651FacImpd[0]) != 0 ) || ( GXutil.strcmp(Z9708FacDscII, T01TR2_A9708FacDscII[0]) != 0 ) || ( GXutil.strcmp(Z10271FacAcs, T01TR2_A10271FacAcs[0]) != 0 ) || ( DecimalUtil.compareTo(Z3897FacKgsA, T01TR2_A3897FacKgsA[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z3899FacFecAlb), GXutil.resetTime(T01TR2_A3899FacFecAlb[0])) ) || ( Z12197FacUnds != T01TR2_A12197FacUnds[0] ) || ( DecimalUtil.compareTo(Z12198FacPreUnd, T01TR2_A12198FacPreUnd[0]) != 0 ) || ( Z12906FacCadEnc != T01TR2_A12906FacCadEnc[0] ) || ( DecimalUtil.compareTo(Z14238FacLinTRM, T01TR2_A14238FacLinTRM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z14239FACLinTRMF, T01TR2_A14239FACLinTRMF[0]) ) )
         {
            if ( DecimalUtil.compareTo(Z5050FacBonLi, T01TR2_A5050FacBonLi[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacBonLi");
               GXutil.writeLogRaw("Old: ",Z5050FacBonLi);
               GXutil.writeLogRaw("Current: ",T01TR2_A5050FacBonLi[0]);
            }
            if ( Z427FacAlbCod != T01TR2_A427FacAlbCod[0] )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacAlbCod");
               GXutil.writeLogRaw("Old: ",Z427FacAlbCod);
               GXutil.writeLogRaw("Current: ",T01TR2_A427FacAlbCod[0]);
            }
            if ( Z1294FacBarCod != T01TR2_A1294FacBarCod[0] )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacBarCod");
               GXutil.writeLogRaw("Old: ",Z1294FacBarCod);
               GXutil.writeLogRaw("Current: ",T01TR2_A1294FacBarCod[0]);
            }
            if ( Z1295FacBarReo != T01TR2_A1295FacBarReo[0] )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacBarReo");
               GXutil.writeLogRaw("Old: ",Z1295FacBarReo);
               GXutil.writeLogRaw("Current: ",T01TR2_A1295FacBarReo[0]);
            }
            if ( GXutil.strcmp(Z1296FacBarPar, T01TR2_A1296FacBarPar[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacBarPar");
               GXutil.writeLogRaw("Old: ",Z1296FacBarPar);
               GXutil.writeLogRaw("Current: ",T01TR2_A1296FacBarPar[0]);
            }
            if ( Z428FacAlbTip != T01TR2_A428FacAlbTip[0] )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacAlbTip");
               GXutil.writeLogRaw("Old: ",Z428FacAlbTip);
               GXutil.writeLogRaw("Current: ",T01TR2_A428FacAlbTip[0]);
            }
            if ( GXutil.strcmp(Z454FacSer, T01TR2_A454FacSer[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacSer");
               GXutil.writeLogRaw("Old: ",Z454FacSer);
               GXutil.writeLogRaw("Current: ",T01TR2_A454FacSer[0]);
            }
            if ( GXutil.strcmp(Z432FacDsc, T01TR2_A432FacDsc[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacDsc");
               GXutil.writeLogRaw("Old: ",Z432FacDsc);
               GXutil.writeLogRaw("Current: ",T01TR2_A432FacDsc[0]);
            }
            if ( GXutil.strcmp(Z1498FacDisNum, T01TR2_A1498FacDisNum[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacDisNum");
               GXutil.writeLogRaw("Old: ",Z1498FacDisNum);
               GXutil.writeLogRaw("Current: ",T01TR2_A1498FacDisNum[0]);
            }
            if ( DecimalUtil.compareTo(Z447FacMts, T01TR2_A447FacMts[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacMts");
               GXutil.writeLogRaw("Old: ",Z447FacMts);
               GXutil.writeLogRaw("Current: ",T01TR2_A447FacMts[0]);
            }
            if ( DecimalUtil.compareTo(Z449FacPreMts, T01TR2_A449FacPreMts[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacPreMts");
               GXutil.writeLogRaw("Old: ",Z449FacPreMts);
               GXutil.writeLogRaw("Current: ",T01TR2_A449FacPreMts[0]);
            }
            if ( DecimalUtil.compareTo(Z444FacKgs, T01TR2_A444FacKgs[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacKgs");
               GXutil.writeLogRaw("Old: ",Z444FacKgs);
               GXutil.writeLogRaw("Current: ",T01TR2_A444FacKgs[0]);
            }
            if ( DecimalUtil.compareTo(Z448FacPreKgs, T01TR2_A448FacPreKgs[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacPreKgs");
               GXutil.writeLogRaw("Old: ",Z448FacPreKgs);
               GXutil.writeLogRaw("Current: ",T01TR2_A448FacPreKgs[0]);
            }
            if ( DecimalUtil.compareTo(Z451FacRec, T01TR2_A451FacRec[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacRec");
               GXutil.writeLogRaw("Old: ",Z451FacRec);
               GXutil.writeLogRaw("Current: ",T01TR2_A451FacRec[0]);
            }
            if ( GXutil.strcmp(Z3097FacTipPro, T01TR2_A3097FacTipPro[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacTipPro");
               GXutil.writeLogRaw("Old: ",Z3097FacTipPro);
               GXutil.writeLogRaw("Current: ",T01TR2_A3097FacTipPro[0]);
            }
            if ( Z3303FacNPart != T01TR2_A3303FacNPart[0] )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacNPart");
               GXutil.writeLogRaw("Old: ",Z3303FacNPart);
               GXutil.writeLogRaw("Current: ",T01TR2_A3303FacNPart[0]);
            }
            if ( GXutil.strcmp(Z3397FacFasCod, T01TR2_A3397FacFasCod[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacFasCod");
               GXutil.writeLogRaw("Old: ",Z3397FacFasCod);
               GXutil.writeLogRaw("Current: ",T01TR2_A3397FacFasCod[0]);
            }
            if ( GXutil.strcmp(Z3878FacColNom, T01TR2_A3878FacColNom[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacColNom");
               GXutil.writeLogRaw("Old: ",Z3878FacColNom);
               GXutil.writeLogRaw("Current: ",T01TR2_A3878FacColNom[0]);
            }
            if ( Z3879FocColNum != T01TR2_A3879FocColNum[0] )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FocColNum");
               GXutil.writeLogRaw("Old: ",Z3879FocColNum);
               GXutil.writeLogRaw("Current: ",T01TR2_A3879FocColNum[0]);
            }
            if ( Z3880FacTipColC != T01TR2_A3880FacTipColC[0] )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacTipColC");
               GXutil.writeLogRaw("Old: ",Z3880FacTipColC);
               GXutil.writeLogRaw("Current: ",T01TR2_A3880FacTipColC[0]);
            }
            if ( GXutil.strcmp(Z3881FacNomCol, T01TR2_A3881FacNomCol[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacNomCol");
               GXutil.writeLogRaw("Old: ",Z3881FacNomCol);
               GXutil.writeLogRaw("Current: ",T01TR2_A3881FacNomCol[0]);
            }
            if ( Z3882FacNumCol != T01TR2_A3882FacNumCol[0] )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacNumCol");
               GXutil.writeLogRaw("Old: ",Z3882FacNumCol);
               GXutil.writeLogRaw("Current: ",T01TR2_A3882FacNumCol[0]);
            }
            if ( Z3883FacCliCod != T01TR2_A3883FacCliCod[0] )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacCliCod");
               GXutil.writeLogRaw("Old: ",Z3883FacCliCod);
               GXutil.writeLogRaw("Current: ",T01TR2_A3883FacCliCod[0]);
            }
            if ( GXutil.strcmp(Z3884FacProCod, T01TR2_A3884FacProCod[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacProCod");
               GXutil.writeLogRaw("Old: ",Z3884FacProCod);
               GXutil.writeLogRaw("Current: ",T01TR2_A3884FacProCod[0]);
            }
            if ( GXutil.strcmp(Z4389FacDsc2, T01TR2_A4389FacDsc2[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacDsc2");
               GXutil.writeLogRaw("Old: ",Z4389FacDsc2);
               GXutil.writeLogRaw("Current: ",T01TR2_A4389FacDsc2[0]);
            }
            if ( GXutil.strcmp(Z4814FacEncCli, T01TR2_A4814FacEncCli[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacEncCli");
               GXutil.writeLogRaw("Old: ",Z4814FacEncCli);
               GXutil.writeLogRaw("Current: ",T01TR2_A4814FacEncCli[0]);
            }
            if ( GXutil.strcmp(Z5172FacDishCod, T01TR2_A5172FacDishCod[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacDishCod");
               GXutil.writeLogRaw("Old: ",Z5172FacDishCod);
               GXutil.writeLogRaw("Current: ",T01TR2_A5172FacDishCod[0]);
            }
            if ( Z5189FacTipArt != T01TR2_A5189FacTipArt[0] )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacTipArt");
               GXutil.writeLogRaw("Old: ",Z5189FacTipArt);
               GXutil.writeLogRaw("Current: ",T01TR2_A5189FacTipArt[0]);
            }
            if ( DecimalUtil.compareTo(Z5353FacImpMan, T01TR2_A5353FacImpMan[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacImpMan");
               GXutil.writeLogRaw("Old: ",Z5353FacImpMan);
               GXutil.writeLogRaw("Current: ",T01TR2_A5353FacImpMan[0]);
            }
            if ( DecimalUtil.compareTo(Z5355FacImpMin, T01TR2_A5355FacImpMin[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacImpMin");
               GXutil.writeLogRaw("Old: ",Z5355FacImpMin);
               GXutil.writeLogRaw("Current: ",T01TR2_A5355FacImpMin[0]);
            }
            if ( DecimalUtil.compareTo(Z3898FacPreKgsA, T01TR2_A3898FacPreKgsA[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacPreKgsA");
               GXutil.writeLogRaw("Old: ",Z3898FacPreKgsA);
               GXutil.writeLogRaw("Current: ",T01TR2_A3898FacPreKgsA[0]);
            }
            if ( DecimalUtil.compareTo(Z6837FacCosPQ, T01TR2_A6837FacCosPQ[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacCosPQ");
               GXutil.writeLogRaw("Old: ",Z6837FacCosPQ);
               GXutil.writeLogRaw("Current: ",T01TR2_A6837FacCosPQ[0]);
            }
            if ( DecimalUtil.compareTo(Z9647FacImpdto, T01TR2_A9647FacImpdto[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacImpdto");
               GXutil.writeLogRaw("Old: ",Z9647FacImpdto);
               GXutil.writeLogRaw("Current: ",T01TR2_A9647FacImpdto[0]);
            }
            if ( DecimalUtil.compareTo(Z9648FacDtoL, T01TR2_A9648FacDtoL[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacDtoL");
               GXutil.writeLogRaw("Old: ",Z9648FacDtoL);
               GXutil.writeLogRaw("Current: ",T01TR2_A9648FacDtoL[0]);
            }
            if ( DecimalUtil.compareTo(Z9649FacPKDto, T01TR2_A9649FacPKDto[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacPKDto");
               GXutil.writeLogRaw("Old: ",Z9649FacPKDto);
               GXutil.writeLogRaw("Current: ",T01TR2_A9649FacPKDto[0]);
            }
            if ( DecimalUtil.compareTo(Z9650FacPMdto, T01TR2_A9650FacPMdto[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacPMdto");
               GXutil.writeLogRaw("Old: ",Z9650FacPMdto);
               GXutil.writeLogRaw("Current: ",T01TR2_A9650FacPMdto[0]);
            }
            if ( DecimalUtil.compareTo(Z9651FacImpd, T01TR2_A9651FacImpd[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacImpd");
               GXutil.writeLogRaw("Old: ",Z9651FacImpd);
               GXutil.writeLogRaw("Current: ",T01TR2_A9651FacImpd[0]);
            }
            if ( GXutil.strcmp(Z9708FacDscII, T01TR2_A9708FacDscII[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacDscII");
               GXutil.writeLogRaw("Old: ",Z9708FacDscII);
               GXutil.writeLogRaw("Current: ",T01TR2_A9708FacDscII[0]);
            }
            if ( GXutil.strcmp(Z10271FacAcs, T01TR2_A10271FacAcs[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacAcs");
               GXutil.writeLogRaw("Old: ",Z10271FacAcs);
               GXutil.writeLogRaw("Current: ",T01TR2_A10271FacAcs[0]);
            }
            if ( DecimalUtil.compareTo(Z3897FacKgsA, T01TR2_A3897FacKgsA[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacKgsA");
               GXutil.writeLogRaw("Old: ",Z3897FacKgsA);
               GXutil.writeLogRaw("Current: ",T01TR2_A3897FacKgsA[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3899FacFecAlb), GXutil.resetTime(T01TR2_A3899FacFecAlb[0])) ) )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacFecAlb");
               GXutil.writeLogRaw("Old: ",Z3899FacFecAlb);
               GXutil.writeLogRaw("Current: ",T01TR2_A3899FacFecAlb[0]);
            }
            if ( Z12197FacUnds != T01TR2_A12197FacUnds[0] )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacUnds");
               GXutil.writeLogRaw("Old: ",Z12197FacUnds);
               GXutil.writeLogRaw("Current: ",T01TR2_A12197FacUnds[0]);
            }
            if ( DecimalUtil.compareTo(Z12198FacPreUnd, T01TR2_A12198FacPreUnd[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacPreUnd");
               GXutil.writeLogRaw("Old: ",Z12198FacPreUnd);
               GXutil.writeLogRaw("Current: ",T01TR2_A12198FacPreUnd[0]);
            }
            if ( Z12906FacCadEnc != T01TR2_A12906FacCadEnc[0] )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacCadEnc");
               GXutil.writeLogRaw("Old: ",Z12906FacCadEnc);
               GXutil.writeLogRaw("Current: ",T01TR2_A12906FacCadEnc[0]);
            }
            if ( DecimalUtil.compareTo(Z14238FacLinTRM, T01TR2_A14238FacLinTRM[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FacLinTRM");
               GXutil.writeLogRaw("Old: ",Z14238FacLinTRM);
               GXutil.writeLogRaw("Current: ",T01TR2_A14238FacLinTRM[0]);
            }
            if ( !( GXutil.dateCompare(Z14239FACLinTRMF, T01TR2_A14239FACLinTRMF[0]) ) )
            {
               GXutil.writeLogln("facturacion.mantenimientofactura:[seudo value changed for attri]"+"FACLinTRMF");
               GXutil.writeLogRaw("Old: ",Z14239FACLinTRMF);
               GXutil.writeLogRaw("Current: ",T01TR2_A14239FACLinTRMF[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLFAVEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TR44( )
   {
      beforeValidate1TR44( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TR44( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TR44( 0) ;
         checkOptimisticConcurrency1TR44( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TR44( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TR44( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TR36 */
                  pr_default.execute(30, new Object[] {Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), A5050FacBonLi, Long.valueOf(A427FacAlbCod), Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A1498FacDisNum, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A451FacRec, A3097FacTipPro, Short.valueOf(A3303FacNPart), A3397FacFasCod, A3878FacColNom, Integer.valueOf(A3879FocColNum), Byte.valueOf(A3880FacTipColC), A3881FacNomCol, Integer.valueOf(A3882FacNumCol), Integer.valueOf(A3883FacCliCod), A3884FacProCod, A4389FacDsc2, A4814FacEncCli, A5172FacDishCod, Short.valueOf(A5189FacTipArt), A5353FacImpMan, A5355FacImpMin, A3898FacPreKgsA, A6837FacCosPQ, A9647FacImpdto, A9648FacDtoL, A9649FacPKDto, A9650FacPMdto, A9651FacImpd, A9708FacDscII, A10271FacAcs, A3897FacKgsA, A3899FacFecAlb, Integer.valueOf(A12197FacUnds), A12198FacPreUnd, Short.valueOf(A12906FacCadEnc), A14238FacLinTRM, A14239FACLinTRMF, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                  if ( (pr_default.getStatus(30) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( true /* After */ || true /* After */ || true /* After */ ) && true /* Level */ )
                     {
                        new app.pcalvto(remoteHandle, context).execute( A396EmprCod, A430FacCod) ;
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
            load1TR44( ) ;
         }
         endLevel1TR44( ) ;
      }
      closeExtendedTableCursors1TR44( ) ;
   }

   public void update1TR44( )
   {
      beforeValidate1TR44( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TR44( ) ;
      }
      if ( ( nIsMod_44 != 0 ) || ( nIsDirty_44 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1TR44( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1TR44( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1TR44( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01TR37 */
                     pr_default.execute(31, new Object[] {A5050FacBonLi, Long.valueOf(A427FacAlbCod), Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A1498FacDisNum, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A451FacRec, A3097FacTipPro, Short.valueOf(A3303FacNPart), A3397FacFasCod, A3878FacColNom, Integer.valueOf(A3879FocColNum), Byte.valueOf(A3880FacTipColC), A3881FacNomCol, Integer.valueOf(A3882FacNumCol), Integer.valueOf(A3883FacCliCod), A3884FacProCod, A4389FacDsc2, A4814FacEncCli, A5172FacDishCod, Short.valueOf(A5189FacTipArt), A5353FacImpMan, A5355FacImpMin, A3898FacPreKgsA, A6837FacCosPQ, A9647FacImpdto, A9648FacDtoL, A9649FacPKDto, A9650FacPMdto, A9651FacImpd, A9708FacDscII, A10271FacAcs, A3897FacKgsA, A3899FacFecAlb, Integer.valueOf(A12197FacUnds), A12198FacPreUnd, Short.valueOf(A12906FacCadEnc), A14238FacLinTRM, A14239FACLinTRMF, A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                     if ( (pr_default.getStatus(31) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLFAVEN"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1TR44( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( true /* After */ || true /* After */ || true /* After */ ) && true /* Level */ )
                        {
                           new app.pcalvto(remoteHandle, context).execute( A396EmprCod, A430FacCod) ;
                        }
                        if ( ( AV20Tintutex == 1 ) && ( ( DecimalUtil.compareTo(A448FacPreKgs, O448FacPreKgs) != 0 ) || ( DecimalUtil.compareTo(A449FacPreMts, O449FacPreMts) != 0 ) ) && true /* After */ )
                        {
                           GXv_char4[0] = A396EmprCod ;
                           GXv_int7[0] = A430FacCod ;
                           GXv_int11[0] = A427FacAlbCod ;
                           GXv_int6[0] = A428FacAlbTip ;
                           GXv_int16[0] = A1294FacBarCod ;
                           GXv_int17[0] = A1295FacBarReo ;
                           GXv_char3[0] = A1296FacBarPar ;
                           GXv_decimal18[0] = A448FacPreKgs ;
                           GXv_decimal19[0] = A449FacPreMts ;
                           GXv_char2[0] = A3397FacFasCod ;
                           GXv_char20[0] = AV21UsurCod ;
                           GXv_char21[0] = AV22Station ;
                           new app.pprc280(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int11, GXv_int6, GXv_int16, GXv_int17, GXv_char3, GXv_decimal18, GXv_decimal19, GXv_char2, GXv_char20, GXv_char21) ;
                           mantenimientofactura_impl.this.A396EmprCod = GXv_char4[0] ;
                           mantenimientofactura_impl.this.A430FacCod = GXv_int7[0] ;
                           mantenimientofactura_impl.this.A427FacAlbCod = GXv_int11[0] ;
                           mantenimientofactura_impl.this.A428FacAlbTip = GXv_int6[0] ;
                           mantenimientofactura_impl.this.A1294FacBarCod = GXv_int16[0] ;
                           mantenimientofactura_impl.this.A1295FacBarReo = GXv_int17[0] ;
                           mantenimientofactura_impl.this.A1296FacBarPar = GXv_char3[0] ;
                           mantenimientofactura_impl.this.A448FacPreKgs = GXv_decimal18[0] ;
                           mantenimientofactura_impl.this.A449FacPreMts = GXv_decimal19[0] ;
                           mantenimientofactura_impl.this.A3397FacFasCod = GXv_char2[0] ;
                           mantenimientofactura_impl.this.AV21UsurCod = GXv_char20[0] ;
                           mantenimientofactura_impl.this.AV22Station = GXv_char21[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
                           httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1TR44( ) ;
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
            endLevel1TR44( ) ;
         }
      }
      closeExtendedTableCursors1TR44( ) ;
   }

   public void deferredUpdate1TR44( )
   {
   }

   public void delete1TR44( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1TR44( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TR44( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TR44( ) ;
         afterConfirm1TR44( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TR44( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TR38 */
               pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( ( true /* After */ || true /* After */ || true /* After */ ) && true /* Level */ )
                  {
                     new app.pcalvto(remoteHandle, context).execute( A396EmprCod, A430FacCod) ;
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
      sMode44 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TR44( ) ;
      Gx_mode = sMode44 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TR44( )
   {
      standaloneModal1TR44( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A2239FacIml = (A448FacPreKgs.multiply(A444FacKgs)).add((A449FacPreMts.multiply(A447FacMts))).add((A3898FacPreKgsA.multiply(A3897FacKgsA))).add((DecimalUtil.doubleToDec(A12197FacUnds).multiply(A12198FacPreUnd))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2239FacIml", GXutil.ltrimstr( A2239FacIml, 16, 5));
         if ( ( DecimalUtil.compareTo(A2239FacIml, A5355FacImpMin) < 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5355FacImpMin)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) )
         {
            A3923FacImp1 = A5355FacImpMin ;
            httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
         }
         else
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A2239FacIml)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) )
            {
               A3923FacImp1 = A5353FacImpMan ;
               httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
            }
            else
            {
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A12198FacPreUnd)==0) )
               {
                  A3923FacImp1 = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
               }
               else
               {
                  A3923FacImp1 = A2239FacIml ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
               }
            }
         }
         A438FacImp = GXutil.roundDecimal( A3923FacImp1, 2) ;
         if ( isIns( )  )
         {
            A3918FacImpTot1 = O3918FacImpTot1.add(A438FacImp) ;
            n3918FacImpTot1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A3918FacImpTot1 = O3918FacImpTot1.add(A438FacImp).subtract(O438FacImp) ;
               n3918FacImpTot1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A3918FacImpTot1 = O3918FacImpTot1.subtract(O438FacImp) ;
                  n3918FacImpTot1 = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
               }
            }
         }
         A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
         A14225FacImpEner = GXutil.roundDecimal( A14218FacImpEng1, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
         A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
            }
            else
            {
               A440FacImpPP = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
            }
         }
         A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            }
            else
            {
               A439FacImpGen = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            }
         }
         A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
         A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
         A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
         A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
         A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
            }
            else
            {
               A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
            }
         }
         A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
            }
            else
            {
               A452FacRecImp = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
            }
         }
         A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
            }
            else
            {
               A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
            }
         }
         A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
            }
            else
            {
               A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
            }
         }
         A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
         httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
         A7215FacImpRet2 = GXutil.roundDecimal( A441FacImpTot.subtract(A7213FacImpRet), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
      }
   }

   public void endLevel1TR44( )
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

   public void scanStart1TR44( )
   {
      /* Scan By routine */
      /* Using cursor T01TR39 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      RcdFound44 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound44 = (short)(1) ;
         A446FacLin = T01TR39_A446FacLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TR44( )
   {
      /* Scan next routine */
      pr_default.readNext(33);
      RcdFound44 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound44 = (short)(1) ;
         A446FacLin = T01TR39_A446FacLin[0] ;
      }
   }

   public void scanEnd1TR44( )
   {
      pr_default.close(33);
   }

   public void afterConfirm1TR44( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TR44( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TR44( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TR44( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TR44( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TR44( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TR44( )
   {
      edtFacLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacLin_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacAlbCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacAlbCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacAlbCod_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacAlbTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacAlbTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacAlbTip_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacNHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacNHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacNHdr_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacMts_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacPreMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacPreMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPreMts_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacKgs_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacPreKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacPreKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPreKgs_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacUnds_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacUnds_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacUnds_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacPreUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacPreUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPreUnd_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacRec_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacBonLi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacBonLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBonLi_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacImp_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacSer_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBarCod_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacBarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBarReo_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacBarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBarPar_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDsc_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFasCod_Enabled), 5, 0), !bGXsfl_204_Refreshing);
   }

   public void send_integrity_lvl_hashes1TR44( )
   {
   }

   public void send_integrity_lvl_hashes1TR43( )
   {
   }

   public void subsflControlProps_20444( )
   {
      edtFacLin_Internalname = "FACLIN_"+sGXsfl_204_idx ;
      edtFacAlbCod_Internalname = "FACALBCOD_"+sGXsfl_204_idx ;
      edtFacAlbTip_Internalname = "FACALBTIP_"+sGXsfl_204_idx ;
      edtFacNHdr_Internalname = "FACNHDR_"+sGXsfl_204_idx ;
      edtFacMts_Internalname = "FACMTS_"+sGXsfl_204_idx ;
      edtFacPreMts_Internalname = "FACPREMTS_"+sGXsfl_204_idx ;
      edtFacKgs_Internalname = "FACKGS_"+sGXsfl_204_idx ;
      edtFacPreKgs_Internalname = "FACPREKGS_"+sGXsfl_204_idx ;
      edtFacUnds_Internalname = "FACUNDS_"+sGXsfl_204_idx ;
      edtFacPreUnd_Internalname = "FACPREUND_"+sGXsfl_204_idx ;
      edtFacRec_Internalname = "FACREC_"+sGXsfl_204_idx ;
      edtFacBonLi_Internalname = "FACBONLI_"+sGXsfl_204_idx ;
      edtFacImp_Internalname = "FACIMP_"+sGXsfl_204_idx ;
      edtFacSer_Internalname = "FACSER_"+sGXsfl_204_idx ;
      edtFacBarCod_Internalname = "FACBARCOD_"+sGXsfl_204_idx ;
      edtFacBarReo_Internalname = "FACBARREO_"+sGXsfl_204_idx ;
      edtFacBarPar_Internalname = "FACBARPAR_"+sGXsfl_204_idx ;
      edtFacDsc_Internalname = "FACDSC_"+sGXsfl_204_idx ;
      edtFacFasCod_Internalname = "FACFASCOD_"+sGXsfl_204_idx ;
   }

   public void subsflControlProps_fel_20444( )
   {
      edtFacLin_Internalname = "FACLIN_"+sGXsfl_204_fel_idx ;
      edtFacAlbCod_Internalname = "FACALBCOD_"+sGXsfl_204_fel_idx ;
      edtFacAlbTip_Internalname = "FACALBTIP_"+sGXsfl_204_fel_idx ;
      edtFacNHdr_Internalname = "FACNHDR_"+sGXsfl_204_fel_idx ;
      edtFacMts_Internalname = "FACMTS_"+sGXsfl_204_fel_idx ;
      edtFacPreMts_Internalname = "FACPREMTS_"+sGXsfl_204_fel_idx ;
      edtFacKgs_Internalname = "FACKGS_"+sGXsfl_204_fel_idx ;
      edtFacPreKgs_Internalname = "FACPREKGS_"+sGXsfl_204_fel_idx ;
      edtFacUnds_Internalname = "FACUNDS_"+sGXsfl_204_fel_idx ;
      edtFacPreUnd_Internalname = "FACPREUND_"+sGXsfl_204_fel_idx ;
      edtFacRec_Internalname = "FACREC_"+sGXsfl_204_fel_idx ;
      edtFacBonLi_Internalname = "FACBONLI_"+sGXsfl_204_fel_idx ;
      edtFacImp_Internalname = "FACIMP_"+sGXsfl_204_fel_idx ;
      edtFacSer_Internalname = "FACSER_"+sGXsfl_204_fel_idx ;
      edtFacBarCod_Internalname = "FACBARCOD_"+sGXsfl_204_fel_idx ;
      edtFacBarReo_Internalname = "FACBARREO_"+sGXsfl_204_fel_idx ;
      edtFacBarPar_Internalname = "FACBARPAR_"+sGXsfl_204_fel_idx ;
      edtFacDsc_Internalname = "FACDSC_"+sGXsfl_204_fel_idx ;
      edtFacFasCod_Internalname = "FACFASCOD_"+sGXsfl_204_fel_idx ;
   }

   public void addRow1TR44( )
   {
      nGXsfl_204_idx = (int)(nGXsfl_204_idx+1) ;
      sGXsfl_204_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_204_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_20444( ) ;
      sendRow1TR44( ) ;
   }

   public void sendRow1TR44( )
   {
      Gridlevel_lineasRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_lineas_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_lineas_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_lineas_Class, "") != 0 )
         {
            subGridlevel_lineas_Linesclass = subGridlevel_lineas_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_lineas_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_lineas_Backstyle = (byte)(0) ;
         subGridlevel_lineas_Backcolor = subGridlevel_lineas_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_lineas_Class, "") != 0 )
         {
            subGridlevel_lineas_Linesclass = subGridlevel_lineas_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_lineas_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_lineas_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_lineas_Class, "") != 0 )
         {
            subGridlevel_lineas_Linesclass = subGridlevel_lineas_Class+"Odd" ;
         }
         subGridlevel_lineas_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_lineas_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_lineas_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_204_idx) % (2))) == 0 )
         {
            subGridlevel_lineas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_lineas_Class, "") != 0 )
            {
               subGridlevel_lineas_Linesclass = subGridlevel_lineas_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_lineas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_lineas_Class, "") != 0 )
            {
               subGridlevel_lineas_Linesclass = subGridlevel_lineas_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacLin_Internalname,GXutil.ltrim( localUtil.ntoc( A446FacLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A446FacLin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A446FacLin), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(204),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacAlbCod_Internalname,GXutil.ltrim( localUtil.ntoc( A427FacAlbCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacAlbCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A427FacAlbCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A427FacAlbCod), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacAlbCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacAlbCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(204),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacAlbTip_Internalname,GXutil.ltrim( localUtil.ntoc( A428FacAlbTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacAlbTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A428FacAlbTip), "9") : localUtil.format( DecimalUtil.doubleToDec(A428FacAlbTip), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacAlbTip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacAlbTip_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(204),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacNHdr_Internalname,GXutil.rtrim( A14247FacNHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacNHdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(204),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_44_" + sGXsfl_204_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 209,'',false,'" + sGXsfl_204_idx + "',204)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacMts_Internalname,GXutil.ltrim( localUtil.ntoc( A447FacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,209);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacMts_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(204),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_44_" + sGXsfl_204_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 210,'',false,'" + sGXsfl_204_idx + "',204)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacPreMts_Internalname,GXutil.ltrim( localUtil.ntoc( A449FacPreMts, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A449FacPreMts, "ZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,210);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacPreMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacPreMts_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(204),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_44_" + sGXsfl_204_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 211,'',false,'" + sGXsfl_204_idx + "',204)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A444FacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A444FacKgs, "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,211);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacKgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacKgs_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(204),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_44_" + sGXsfl_204_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 212,'',false,'" + sGXsfl_204_idx + "',204)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacPreKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A448FacPreKgs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A448FacPreKgs, "ZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,212);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacPreKgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacPreKgs_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(204),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_44_" + sGXsfl_204_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 213,'',false,'" + sGXsfl_204_idx + "',204)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacUnds_Internalname,GXutil.ltrim( localUtil.ntoc( A12197FacUnds, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacUnds_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12197FacUnds), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12197FacUnds), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,213);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacUnds_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacUnds_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(204),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_44_" + sGXsfl_204_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 214,'',false,'" + sGXsfl_204_idx + "',204)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacPreUnd_Internalname,GXutil.ltrim( localUtil.ntoc( A12198FacPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacPreUnd_Enabled!=0) ? localUtil.format( A12198FacPreUnd, "ZZZZZZ9.99999") : localUtil.format( A12198FacPreUnd, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,214);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacPreUnd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacPreUnd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(204),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacRec_Internalname,GXutil.ltrim( localUtil.ntoc( A451FacRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacRec_Enabled!=0) ? localUtil.format( A451FacRec, "ZZZZZZ9.99") : localUtil.format( A451FacRec, "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtFacRec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(204),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_44_" + sGXsfl_204_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 216,'',false,'" + sGXsfl_204_idx + "',204)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacBonLi_Internalname,GXutil.ltrim( localUtil.ntoc( A5050FacBonLi, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A5050FacBonLi, "ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,216);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacBonLi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtFacBonLi_Visible),Integer.valueOf(edtFacBonLi_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(204),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacImp_Internalname,GXutil.ltrim( localUtil.ntoc( A438FacImp, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacImp_Enabled!=0) ? localUtil.format( A438FacImp, "ZZZZZZZZZZ9.99") : localUtil.format( A438FacImp, "ZZZZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacImp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacImp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(204),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacSer_Internalname,GXutil.rtrim( A454FacSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacSer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(204),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1294FacBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1294FacBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1294FacBarCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacBarCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(204),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacBarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A1295FacBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1295FacBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A1295FacBarReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacBarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacBarReo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(204),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacBarPar_Internalname,GXutil.rtrim( A1296FacBarPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacBarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacBarPar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(204),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 222,'',false,'" + sGXsfl_204_idx + "',204)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacDsc_Internalname,GXutil.rtrim( A432FacDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,222);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacDsc_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(204),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacFasCod_Internalname,GXutil.rtrim( A3397FacFasCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacFasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(204),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_lineasRow);
      send_integrity_lvl_hashes1TR44( ) ;
      GXCCtl = "Z446FacLin_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z446FacLin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5050FacBonLi_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5050FacBonLi, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z427FacAlbCod_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z427FacAlbCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1294FacBarCod_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1294FacBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1295FacBarReo_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1295FacBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1296FacBarPar_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1296FacBarPar));
      GXCCtl = "Z428FacAlbTip_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z428FacAlbTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z454FacSer_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z454FacSer));
      GXCCtl = "Z432FacDsc_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z432FacDsc));
      GXCCtl = "Z1498FacDisNum_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1498FacDisNum));
      GXCCtl = "Z447FacMts_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z447FacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z449FacPreMts_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z449FacPreMts, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z444FacKgs_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z444FacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z448FacPreKgs_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z448FacPreKgs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z451FacRec_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z451FacRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3097FacTipPro_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3097FacTipPro));
      GXCCtl = "Z3303FacNPart_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3303FacNPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3397FacFasCod_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3397FacFasCod));
      GXCCtl = "Z3878FacColNom_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3878FacColNom));
      GXCCtl = "Z3879FocColNum_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3879FocColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3880FacTipColC_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3880FacTipColC, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3881FacNomCol_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3881FacNomCol));
      GXCCtl = "Z3882FacNumCol_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3882FacNumCol, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3883FacCliCod_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3883FacCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3884FacProCod_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3884FacProCod));
      GXCCtl = "Z4389FacDsc2_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4389FacDsc2));
      GXCCtl = "Z4814FacEncCli_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4814FacEncCli));
      GXCCtl = "Z5172FacDishCod_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5172FacDishCod));
      GXCCtl = "Z5189FacTipArt_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5189FacTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5353FacImpMan_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5353FacImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5355FacImpMin_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5355FacImpMin, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3898FacPreKgsA_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3898FacPreKgsA, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6837FacCosPQ_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6837FacCosPQ, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9647FacImpdto_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9647FacImpdto, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9648FacDtoL_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9648FacDtoL, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9649FacPKDto_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9649FacPKDto, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9650FacPMdto_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9650FacPMdto, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9651FacImpd_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9651FacImpd, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9708FacDscII_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9708FacDscII));
      GXCCtl = "Z10271FacAcs_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10271FacAcs));
      GXCCtl = "Z3897FacKgsA_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3897FacKgsA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3899FacFecAlb_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z3899FacFecAlb, 0, "/"));
      GXCCtl = "Z12197FacUnds_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12197FacUnds, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12198FacPreUnd_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12198FacPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12906FacCadEnc_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12906FacCadEnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14238FacLinTRM_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14238FacLinTRM, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14239FACLinTRMF_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z14239FACLinTRMF, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "O438FacImp_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O438FacImp, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O448FacPreKgs_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O448FacPreKgs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O449FacPreMts_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O449FacPreMts, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "FACIMP1_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A3923FacImp1, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "FACIML_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A2239FacIml, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_44_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_44, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_44_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_44, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_44_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_44, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N5353FacImpMan_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A5353FacImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N432FacDsc_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A432FacDsc));
      GXCCtl = "N5355FacImpMin_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A5355FacImpMin, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N447FacMts_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A447FacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N449FacPreMts_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A449FacPreMts, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N444FacKgs_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A444FacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N448FacPreKgs_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A448FacPreKgs, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N5050FacBonLi_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A5050FacBonLi, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vFIRMAD_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV19FirmaD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "vMODE_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_204_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV10TrnContext);
      }
      GXCCtl = "vEMPCOD_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV45EmpCod));
      GXCCtl = "vEMPRCOD_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV7EmprCod));
      GXCCtl = "vFACCOD_" + sGXsfl_204_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV8FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACLIN_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACALBCOD_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacAlbCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACALBTIP_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacAlbTip_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACNHDR_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacNHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACMTS_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPREMTS_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACKGS_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPREKGS_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACUNDS_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacUnds_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPREUND_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACREC_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACBONLI_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacBonLi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACBONLI_"+sGXsfl_204_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtFacBonLi_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMP_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacImp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACSER_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACBARCOD_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACBARREO_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacBarReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACBARPAR_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacBarPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACDSC_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACFASCOD_"+sGXsfl_204_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_lineasContainer.AddRow(Gridlevel_lineasRow);
   }

   public void readRow1TR44( )
   {
      nGXsfl_204_idx = (int)(nGXsfl_204_idx+1) ;
      sGXsfl_204_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_204_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_20444( ) ;
      edtFacLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACLIN_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacAlbCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACALBCOD_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacAlbTip_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACALBTIP_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacNHdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACNHDR_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACMTS_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacPreMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPREMTS_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACKGS_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacPreKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPREKGS_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacUnds_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACUNDS_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacPreUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACPREUND_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACREC_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacBonLi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACBONLI_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacBonLi_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "FACBONLI_"+sGXsfl_204_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacImp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACIMP_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACSER_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACBARCOD_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacBarReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACBARREO_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacBarPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACBARPAR_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACDSC_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACFASCOD_"+sGXsfl_204_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A446FacLin = (int)(localUtil.ctol( httpContext.cgiGet( edtFacLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A427FacAlbCod = localUtil.ctol( httpContext.cgiGet( edtFacAlbCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      A428FacAlbTip = (byte)(localUtil.ctol( httpContext.cgiGet( edtFacAlbTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A14247FacNHdr = httpContext.cgiGet( edtFacNHdr_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFacMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacMts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "FACMTS_" + sGXsfl_204_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacMts_Internalname ;
         wbErr = true ;
         A447FacMts = DecimalUtil.ZERO ;
      }
      else
      {
         A447FacMts = localUtil.ctond( httpContext.cgiGet( edtFacMts_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacPreMts_Internalname)), DecimalUtil.stringToDec("-999999.99999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacPreMts_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "FACPREMTS_" + sGXsfl_204_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacPreMts_Internalname ;
         wbErr = true ;
         A449FacPreMts = DecimalUtil.ZERO ;
      }
      else
      {
         A449FacPreMts = localUtil.ctond( httpContext.cgiGet( edtFacPreMts_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFacKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacKgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "FACKGS_" + sGXsfl_204_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacKgs_Internalname ;
         wbErr = true ;
         A444FacKgs = DecimalUtil.ZERO ;
      }
      else
      {
         A444FacKgs = localUtil.ctond( httpContext.cgiGet( edtFacKgs_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacPreKgs_Internalname)), DecimalUtil.stringToDec("-999999.99999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacPreKgs_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "FACPREKGS_" + sGXsfl_204_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacPreKgs_Internalname ;
         wbErr = true ;
         A448FacPreKgs = DecimalUtil.ZERO ;
      }
      else
      {
         A448FacPreKgs = localUtil.ctond( httpContext.cgiGet( edtFacPreKgs_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFacUnds_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFacUnds_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "FACUNDS_" + sGXsfl_204_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacUnds_Internalname ;
         wbErr = true ;
         A12197FacUnds = 0 ;
      }
      else
      {
         A12197FacUnds = (int)(localUtil.ctol( httpContext.cgiGet( edtFacUnds_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFacPreUnd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacPreUnd_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "FACPREUND_" + sGXsfl_204_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacPreUnd_Internalname ;
         wbErr = true ;
         A12198FacPreUnd = DecimalUtil.ZERO ;
      }
      else
      {
         A12198FacPreUnd = localUtil.ctond( httpContext.cgiGet( edtFacPreUnd_Internalname)) ;
      }
      A451FacRec = localUtil.ctond( httpContext.cgiGet( edtFacRec_Internalname)) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFacBonLi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacBonLi_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "FACBONLI_" + sGXsfl_204_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacBonLi_Internalname ;
         wbErr = true ;
         A5050FacBonLi = DecimalUtil.ZERO ;
      }
      else
      {
         A5050FacBonLi = localUtil.ctond( httpContext.cgiGet( edtFacBonLi_Internalname)) ;
      }
      A438FacImp = localUtil.ctond( httpContext.cgiGet( edtFacImp_Internalname)) ;
      A454FacSer = httpContext.cgiGet( edtFacSer_Internalname) ;
      A1294FacBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtFacBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1295FacBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtFacBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1296FacBarPar = httpContext.cgiGet( edtFacBarPar_Internalname) ;
      A432FacDsc = httpContext.cgiGet( edtFacDsc_Internalname) ;
      A3397FacFasCod = httpContext.cgiGet( edtFacFasCod_Internalname) ;
      GXCCtl = "Z446FacLin_" + sGXsfl_204_idx ;
      Z446FacLin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5050FacBonLi_" + sGXsfl_204_idx ;
      Z5050FacBonLi = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z427FacAlbCod_" + sGXsfl_204_idx ;
      Z427FacAlbCod = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z1294FacBarCod_" + sGXsfl_204_idx ;
      Z1294FacBarCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1295FacBarReo_" + sGXsfl_204_idx ;
      Z1295FacBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1296FacBarPar_" + sGXsfl_204_idx ;
      Z1296FacBarPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z428FacAlbTip_" + sGXsfl_204_idx ;
      Z428FacAlbTip = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z454FacSer_" + sGXsfl_204_idx ;
      Z454FacSer = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z432FacDsc_" + sGXsfl_204_idx ;
      Z432FacDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1498FacDisNum_" + sGXsfl_204_idx ;
      Z1498FacDisNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z447FacMts_" + sGXsfl_204_idx ;
      Z447FacMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z449FacPreMts_" + sGXsfl_204_idx ;
      Z449FacPreMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z444FacKgs_" + sGXsfl_204_idx ;
      Z444FacKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z448FacPreKgs_" + sGXsfl_204_idx ;
      Z448FacPreKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z451FacRec_" + sGXsfl_204_idx ;
      Z451FacRec = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3097FacTipPro_" + sGXsfl_204_idx ;
      Z3097FacTipPro = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3303FacNPart_" + sGXsfl_204_idx ;
      Z3303FacNPart = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3397FacFasCod_" + sGXsfl_204_idx ;
      Z3397FacFasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3878FacColNom_" + sGXsfl_204_idx ;
      Z3878FacColNom = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3879FocColNum_" + sGXsfl_204_idx ;
      Z3879FocColNum = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3880FacTipColC_" + sGXsfl_204_idx ;
      Z3880FacTipColC = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3881FacNomCol_" + sGXsfl_204_idx ;
      Z3881FacNomCol = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3882FacNumCol_" + sGXsfl_204_idx ;
      Z3882FacNumCol = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3883FacCliCod_" + sGXsfl_204_idx ;
      Z3883FacCliCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3884FacProCod_" + sGXsfl_204_idx ;
      Z3884FacProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4389FacDsc2_" + sGXsfl_204_idx ;
      Z4389FacDsc2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4814FacEncCli_" + sGXsfl_204_idx ;
      Z4814FacEncCli = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5172FacDishCod_" + sGXsfl_204_idx ;
      Z5172FacDishCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5189FacTipArt_" + sGXsfl_204_idx ;
      Z5189FacTipArt = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5353FacImpMan_" + sGXsfl_204_idx ;
      Z5353FacImpMan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5355FacImpMin_" + sGXsfl_204_idx ;
      Z5355FacImpMin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3898FacPreKgsA_" + sGXsfl_204_idx ;
      Z3898FacPreKgsA = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6837FacCosPQ_" + sGXsfl_204_idx ;
      Z6837FacCosPQ = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9647FacImpdto_" + sGXsfl_204_idx ;
      Z9647FacImpdto = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9648FacDtoL_" + sGXsfl_204_idx ;
      Z9648FacDtoL = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9649FacPKDto_" + sGXsfl_204_idx ;
      Z9649FacPKDto = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9650FacPMdto_" + sGXsfl_204_idx ;
      Z9650FacPMdto = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9651FacImpd_" + sGXsfl_204_idx ;
      Z9651FacImpd = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9708FacDscII_" + sGXsfl_204_idx ;
      Z9708FacDscII = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10271FacAcs_" + sGXsfl_204_idx ;
      Z10271FacAcs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3897FacKgsA_" + sGXsfl_204_idx ;
      Z3897FacKgsA = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3899FacFecAlb_" + sGXsfl_204_idx ;
      Z3899FacFecAlb = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12197FacUnds_" + sGXsfl_204_idx ;
      Z12197FacUnds = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12198FacPreUnd_" + sGXsfl_204_idx ;
      Z12198FacPreUnd = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12906FacCadEnc_" + sGXsfl_204_idx ;
      Z12906FacCadEnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14238FacLinTRM_" + sGXsfl_204_idx ;
      Z14238FacLinTRM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14239FACLinTRMF_" + sGXsfl_204_idx ;
      Z14239FACLinTRMF = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z1498FacDisNum_" + sGXsfl_204_idx ;
      A1498FacDisNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3097FacTipPro_" + sGXsfl_204_idx ;
      A3097FacTipPro = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3303FacNPart_" + sGXsfl_204_idx ;
      A3303FacNPart = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3878FacColNom_" + sGXsfl_204_idx ;
      A3878FacColNom = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3879FocColNum_" + sGXsfl_204_idx ;
      A3879FocColNum = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3880FacTipColC_" + sGXsfl_204_idx ;
      A3880FacTipColC = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3881FacNomCol_" + sGXsfl_204_idx ;
      A3881FacNomCol = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3882FacNumCol_" + sGXsfl_204_idx ;
      A3882FacNumCol = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3883FacCliCod_" + sGXsfl_204_idx ;
      A3883FacCliCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3884FacProCod_" + sGXsfl_204_idx ;
      A3884FacProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4389FacDsc2_" + sGXsfl_204_idx ;
      A4389FacDsc2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4814FacEncCli_" + sGXsfl_204_idx ;
      A4814FacEncCli = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5172FacDishCod_" + sGXsfl_204_idx ;
      A5172FacDishCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5189FacTipArt_" + sGXsfl_204_idx ;
      A5189FacTipArt = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5353FacImpMan_" + sGXsfl_204_idx ;
      A5353FacImpMan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5355FacImpMin_" + sGXsfl_204_idx ;
      A5355FacImpMin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3898FacPreKgsA_" + sGXsfl_204_idx ;
      A3898FacPreKgsA = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6837FacCosPQ_" + sGXsfl_204_idx ;
      A6837FacCosPQ = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9647FacImpdto_" + sGXsfl_204_idx ;
      A9647FacImpdto = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9648FacDtoL_" + sGXsfl_204_idx ;
      A9648FacDtoL = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9649FacPKDto_" + sGXsfl_204_idx ;
      A9649FacPKDto = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9650FacPMdto_" + sGXsfl_204_idx ;
      A9650FacPMdto = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9651FacImpd_" + sGXsfl_204_idx ;
      A9651FacImpd = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9708FacDscII_" + sGXsfl_204_idx ;
      A9708FacDscII = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10271FacAcs_" + sGXsfl_204_idx ;
      A10271FacAcs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3897FacKgsA_" + sGXsfl_204_idx ;
      A3897FacKgsA = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3899FacFecAlb_" + sGXsfl_204_idx ;
      A3899FacFecAlb = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12906FacCadEnc_" + sGXsfl_204_idx ;
      A12906FacCadEnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14238FacLinTRM_" + sGXsfl_204_idx ;
      A14238FacLinTRM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14239FACLinTRMF_" + sGXsfl_204_idx ;
      A14239FACLinTRMF = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "O438FacImp_" + sGXsfl_204_idx ;
      O438FacImp = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O448FacPreKgs_" + sGXsfl_204_idx ;
      O448FacPreKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O449FacPreMts_" + sGXsfl_204_idx ;
      O449FacPreMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "FACIMP1_" + sGXsfl_204_idx ;
      A3923FacImp1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "FACIML_" + sGXsfl_204_idx ;
      A2239FacIml = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_44_" + sGXsfl_204_idx ;
      nRcdDeleted_44 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_44_" + sGXsfl_204_idx ;
      nRcdExists_44 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_44_" + sGXsfl_204_idx ;
      nIsMod_44 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N5353FacImpMan_" + sGXsfl_204_idx ;
      N5353FacImpMan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "N432FacDsc_" + sGXsfl_204_idx ;
      N432FacDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "N5355FacImpMin_" + sGXsfl_204_idx ;
      N5355FacImpMin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "N447FacMts_" + sGXsfl_204_idx ;
      N447FacMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "N449FacPreMts_" + sGXsfl_204_idx ;
      N449FacPreMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "N444FacKgs_" + sGXsfl_204_idx ;
      N444FacKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "N448FacPreKgs_" + sGXsfl_204_idx ;
      N448FacPreKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "N5050FacBonLi_" + sGXsfl_204_idx ;
      N5050FacBonLi = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
   }

   public void assign_properties_default( )
   {
      defedtFacFasCod_Enabled = edtFacFasCod_Enabled ;
      defedtFacDsc_Enabled = edtFacDsc_Enabled ;
      defedtFacBarPar_Enabled = edtFacBarPar_Enabled ;
      defedtFacBarReo_Enabled = edtFacBarReo_Enabled ;
      defedtFacBarCod_Enabled = edtFacBarCod_Enabled ;
      defedtFacSer_Enabled = edtFacSer_Enabled ;
      defedtFacBonLi_Enabled = edtFacBonLi_Enabled ;
      defedtFacRec_Enabled = edtFacRec_Enabled ;
      defedtFacPreKgs_Enabled = edtFacPreKgs_Enabled ;
      defedtFacKgs_Enabled = edtFacKgs_Enabled ;
      defedtFacPreMts_Enabled = edtFacPreMts_Enabled ;
      defedtFacMts_Enabled = edtFacMts_Enabled ;
      defedtFacAlbTip_Enabled = edtFacAlbTip_Enabled ;
      defedtFacAlbCod_Enabled = edtFacAlbCod_Enabled ;
      defedtFacLin_Enabled = edtFacLin_Enabled ;
   }

   public void confirmValues1TR0( )
   {
      nGXsfl_204_idx = 0 ;
      sGXsfl_204_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_204_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_20444( ) ;
      while ( nGXsfl_204_idx < nRC_GXsfl_204 )
      {
         nGXsfl_204_idx = (int)(nGXsfl_204_idx+1) ;
         sGXsfl_204_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_204_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_20444( ) ;
         httpContext.changePostValue( "Z446FacLin_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z446FacLin_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z446FacLin_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z5050FacBonLi_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z5050FacBonLi_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5050FacBonLi_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z427FacAlbCod_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z427FacAlbCod_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z427FacAlbCod_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z1294FacBarCod_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z1294FacBarCod_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1294FacBarCod_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z1295FacBarReo_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z1295FacBarReo_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1295FacBarReo_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z1296FacBarPar_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z1296FacBarPar_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1296FacBarPar_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z428FacAlbTip_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z428FacAlbTip_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z428FacAlbTip_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z454FacSer_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z454FacSer_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z454FacSer_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z432FacDsc_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z432FacDsc_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z432FacDsc_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z1498FacDisNum_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z1498FacDisNum_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1498FacDisNum_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z447FacMts_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z447FacMts_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z447FacMts_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z449FacPreMts_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z449FacPreMts_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z449FacPreMts_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z444FacKgs_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z444FacKgs_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z444FacKgs_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z448FacPreKgs_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z448FacPreKgs_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z448FacPreKgs_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z451FacRec_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z451FacRec_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z451FacRec_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z3097FacTipPro_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z3097FacTipPro_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3097FacTipPro_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z3303FacNPart_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z3303FacNPart_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3303FacNPart_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z3397FacFasCod_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z3397FacFasCod_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3397FacFasCod_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z3878FacColNom_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z3878FacColNom_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3878FacColNom_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z3879FocColNum_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z3879FocColNum_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3879FocColNum_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z3880FacTipColC_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z3880FacTipColC_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3880FacTipColC_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z3881FacNomCol_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z3881FacNomCol_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3881FacNomCol_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z3882FacNumCol_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z3882FacNumCol_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3882FacNumCol_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z3883FacCliCod_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z3883FacCliCod_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3883FacCliCod_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z3884FacProCod_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z3884FacProCod_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3884FacProCod_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z4389FacDsc2_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z4389FacDsc2_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4389FacDsc2_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z4814FacEncCli_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z4814FacEncCli_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4814FacEncCli_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z5172FacDishCod_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z5172FacDishCod_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5172FacDishCod_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z5189FacTipArt_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z5189FacTipArt_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5189FacTipArt_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z5353FacImpMan_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z5353FacImpMan_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5353FacImpMan_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z5355FacImpMin_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z5355FacImpMin_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5355FacImpMin_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z3898FacPreKgsA_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z3898FacPreKgsA_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3898FacPreKgsA_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z6837FacCosPQ_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z6837FacCosPQ_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6837FacCosPQ_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z9647FacImpdto_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z9647FacImpdto_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9647FacImpdto_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z9648FacDtoL_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z9648FacDtoL_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9648FacDtoL_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z9649FacPKDto_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z9649FacPKDto_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9649FacPKDto_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z9650FacPMdto_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z9650FacPMdto_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9650FacPMdto_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z9651FacImpd_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z9651FacImpd_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9651FacImpd_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z9708FacDscII_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z9708FacDscII_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9708FacDscII_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z10271FacAcs_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z10271FacAcs_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10271FacAcs_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z3897FacKgsA_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z3897FacKgsA_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3897FacKgsA_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z3899FacFecAlb_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z3899FacFecAlb_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3899FacFecAlb_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z12197FacUnds_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z12197FacUnds_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12197FacUnds_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z12198FacPreUnd_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z12198FacPreUnd_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12198FacPreUnd_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z12906FacCadEnc_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z12906FacCadEnc_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12906FacCadEnc_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z14238FacLinTRM_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z14238FacLinTRM_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14238FacLinTRM_"+sGXsfl_204_idx) ;
         httpContext.changePostValue( "Z14239FACLinTRMF_"+sGXsfl_204_idx, httpContext.cgiGet( "ZT_"+"Z14239FACLinTRMF_"+sGXsfl_204_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14239FACLinTRMF_"+sGXsfl_204_idx) ;
      }
      httpContext.changePostValue( "O438FacImp", httpContext.cgiGet( "T438FacImp")) ;
      httpContext.deletePostValue( "T438FacImp") ;
      httpContext.changePostValue( "O448FacPreKgs", httpContext.cgiGet( "T448FacPreKgs")) ;
      httpContext.deletePostValue( "T448FacPreKgs") ;
      httpContext.changePostValue( "O449FacPreMts", httpContext.cgiGet( "T449FacPreMts")) ;
      httpContext.deletePostValue( "T449FacPreMts") ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.mantenimientofactura", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8FacCod,8,0))}, new String[] {"Gx_mode","EmprCod","FacCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"MantenimientoFactura");
      forbiddenHiddens.add("FacFirma", GXutil.rtrim( localUtil.format( A9605FacFirma, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV56Pgmname, "")));
      forbiddenHiddens.add("FacIVACod", GXutil.rtrim( localUtil.format( A960FacIVACod, "@!")));
      forbiddenHiddens.add("FacEst", localUtil.format( DecimalUtil.doubleToDec(A435FacEst), "9"));
      forbiddenHiddens.add("FacLiC", localUtil.format( DecimalUtil.doubleToDec(A445FacLiC), "ZZ9"));
      forbiddenHiddens.add("FacCob", GXutil.rtrim( localUtil.format( A965FacCob, "")));
      forbiddenHiddens.add("Factrm", localUtil.format( A7211Factrm, "ZZZZ9.99999"));
      forbiddenHiddens.add("FacRect", localUtil.format( A7212FacRect, "ZZ9.99"));
      forbiddenHiddens.add("FacLiq1", localUtil.format( A9643FacLiq1, "ZZZZZZZZZ9.99999"));
      forbiddenHiddens.add("FacLiq2", localUtil.format( A9644FacLiq2, "ZZZZZZZZZ9.99999"));
      forbiddenHiddens.add("FacIva1", localUtil.format( A9645FacIva1, "ZZZZZZZZZ9.99999"));
      forbiddenHiddens.add("FacTot1", localUtil.format( A9646FacTot1, "ZZZZZZZZZ9.99999"));
      forbiddenHiddens.add("FacFirDg", GXutil.rtrim( localUtil.format( A9710FacFirDg, "")));
      forbiddenHiddens.add("FacCliPgL", localUtil.format( DecimalUtil.doubleToDec(A10417FacCliPgL), "9"));
      forbiddenHiddens.add("FacAran", GXutil.rtrim( localUtil.format( A10418FacAran, "")));
      forbiddenHiddens.add("FacBrut", localUtil.format( A10419FacBrut, "ZZZZZZ9.99"));
      forbiddenHiddens.add("FacNet", localUtil.format( A10420FacNet, "ZZZZZZ9.99"));
      forbiddenHiddens.add("FacInc", GXutil.rtrim( localUtil.format( A10421FacInc, "")));
      forbiddenHiddens.add("FacFre", GXutil.rtrim( localUtil.format( A10422FacFre, "")));
      forbiddenHiddens.add("FacExp", GXutil.rtrim( localUtil.format( A10423FacExp, "")));
      forbiddenHiddens.add("FacRecIca", localUtil.format( A11513FacRecIca, "ZZ9.999"));
      forbiddenHiddens.add("FacTpFra", GXutil.rtrim( localUtil.format( A12523FacTpFra, "")));
      forbiddenHiddens.add("FacMan", GXutil.rtrim( localUtil.format( A11626FacMan, "")));
      forbiddenHiddens.add("FacEnergia", localUtil.format( A14219FacEnergia, "ZZ9.99"));
      forbiddenHiddens.add("FacCostFac", localUtil.format( A14224FacCostFac, "ZZ9.99"));
      forbiddenHiddens.add("FacCostMts", localUtil.format( A14222FacCostMts, "ZZZZZZ9.99"));
      forbiddenHiddens.add("FacCostKgs", localUtil.format( A14223FacCostKgs, "ZZZZZZ9.99"));
      forbiddenHiddens.add("FacFecAnul", localUtil.format( A14227FacFecAnul, "99/99/99 99:99"));
      forbiddenHiddens.add("FacSFD", localUtil.format( A14229FacSFD, "99/99/99 99:99"));
      forbiddenHiddens.add("FacIDATe", GXutil.rtrim( localUtil.format( A14230FacIDATe, "")));
      forbiddenHiddens.add("FacMsgATe", GXutil.rtrim( localUtil.format( A14231FacMsgATe, "")));
      forbiddenHiddens.add("FacIDATc", GXutil.rtrim( localUtil.format( A14232FacIDATc, "")));
      forbiddenHiddens.add("FacMsgATc", GXutil.rtrim( localUtil.format( A14233FacMsgATc, "")));
      forbiddenHiddens.add("FacIDATd", GXutil.rtrim( localUtil.format( A14234FacIDATd, "")));
      forbiddenHiddens.add("FacMsgATd", GXutil.rtrim( localUtil.format( A14235FacMsgATd, "")));
      forbiddenHiddens.add("FacSerAT", GXutil.rtrim( localUtil.format( A14236FacSerAT, "")));
      forbiddenHiddens.add("FacTipAT", GXutil.rtrim( localUtil.format( A14237FacTipAT, "")));
      forbiddenHiddens.add("FacEnvMail", localUtil.format( A14420FacEnvMail, "99/99/99 99:99"));
      forbiddenHiddens.add("FacRecI", localUtil.format( A8346FacRecI, "ZZ9.99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\mantenimientofactura:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z430FacCod", GXutil.ltrim( localUtil.ntoc( Z430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z437FacFpg", GXutil.rtrim( Z437FacFpg));
      app.GxWebStd.gx_hidden_field( httpContext, "Z436FacFch", localUtil.dtoc( Z436FacFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z450FacPri", GXutil.rtrim( Z450FacPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z433FacDtoGen", GXutil.ltrim( localUtil.ntoc( Z433FacDtoGen, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z434FacDtoPP", GXutil.ltrim( localUtil.ntoc( Z434FacDtoPP, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z960FacIVACod", GXutil.rtrim( Z960FacIVACod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z443FacIVAPor", GXutil.ltrim( localUtil.ntoc( Z443FacIVAPor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z453FacRECPor", GXutil.ltrim( localUtil.ntoc( Z453FacRECPor, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z435FacEst", GXutil.ltrim( localUtil.ntoc( Z435FacEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z445FacLiC", GXutil.ltrim( localUtil.ntoc( Z445FacLiC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z965FacCob", GXutil.rtrim( Z965FacCob));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1150FacNumVto", GXutil.ltrim( localUtil.ntoc( Z1150FacNumVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1151FacPer", GXutil.rtrim( Z1151FacPer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1152FacDiaPag", GXutil.rtrim( Z1152FacDiaPag));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1153FacTipFac", GXutil.ltrim( localUtil.ntoc( Z1153FacTipFac, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2739FacSerNum", GXutil.rtrim( Z2739FacSerNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6632FacDto", GXutil.ltrim( localUtil.ntoc( Z6632FacDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7211Factrm", GXutil.ltrim( localUtil.ntoc( Z7211Factrm, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7212FacRect", GXutil.ltrim( localUtil.ntoc( Z7212FacRect, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9605FacFirma", GXutil.rtrim( Z9605FacFirma));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9606FacHor", localUtil.ttoc( Z9606FacHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9643FacLiq1", GXutil.ltrim( localUtil.ntoc( Z9643FacLiq1, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9644FacLiq2", GXutil.ltrim( localUtil.ntoc( Z9644FacLiq2, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9645FacIva1", GXutil.ltrim( localUtil.ntoc( Z9645FacIva1, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9646FacTot1", GXutil.ltrim( localUtil.ntoc( Z9646FacTot1, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9710FacFirDg", GXutil.rtrim( Z9710FacFirDg));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10417FacCliPgL", GXutil.ltrim( localUtil.ntoc( Z10417FacCliPgL, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10418FacAran", GXutil.rtrim( Z10418FacAran));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10419FacBrut", GXutil.ltrim( localUtil.ntoc( Z10419FacBrut, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10420FacNet", GXutil.ltrim( localUtil.ntoc( Z10420FacNet, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10421FacInc", GXutil.rtrim( Z10421FacInc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10422FacFre", GXutil.rtrim( Z10422FacFre));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10423FacExp", GXutil.rtrim( Z10423FacExp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11513FacRecIca", GXutil.ltrim( localUtil.ntoc( Z11513FacRecIca, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12523FacTpFra", GXutil.rtrim( Z12523FacTpFra));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11626FacMan", GXutil.rtrim( Z11626FacMan));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14219FacEnergia", GXutil.ltrim( localUtil.ntoc( Z14219FacEnergia, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14224FacCostFac", GXutil.ltrim( localUtil.ntoc( Z14224FacCostFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14222FacCostMts", GXutil.ltrim( localUtil.ntoc( Z14222FacCostMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14223FacCostKgs", GXutil.ltrim( localUtil.ntoc( Z14223FacCostKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14226FacAnulada", GXutil.rtrim( Z14226FacAnulada));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14227FacFecAnul", localUtil.ttoc( Z14227FacFecAnul, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14229FacSFD", localUtil.ttoc( Z14229FacSFD, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14230FacIDATe", GXutil.rtrim( Z14230FacIDATe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14231FacMsgATe", Z14231FacMsgATe);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14232FacIDATc", GXutil.rtrim( Z14232FacIDATc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14233FacMsgATc", Z14233FacMsgATc);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14234FacIDATd", GXutil.rtrim( Z14234FacIDATd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14235FacMsgATd", Z14235FacMsgATd);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14236FacSerAT", GXutil.rtrim( Z14236FacSerAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14237FacTipAT", GXutil.rtrim( Z14237FacTipAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11273FacObs2", Z11273FacObs2);
      app.GxWebStd.gx_hidden_field( httpContext, "Z14420FacEnvMail", localUtil.ttoc( Z14420FacEnvMail, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8346FacRecI", GXutil.ltrim( localUtil.ntoc( Z8346FacRecI, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11629MeivaId", GXutil.rtrim( Z11629MeivaId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14217MotAnuID", GXutil.rtrim( Z14217MotAnuID));
      app.GxWebStd.gx_hidden_field( httpContext, "O3918FacImpTot1", GXutil.ltrim( localUtil.ntoc( O3918FacImpTot1, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1150FacNumVto", GXutil.ltrim( localUtil.ntoc( O1150FacNumVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1151FacPer", GXutil.rtrim( O1151FacPer));
      app.GxWebStd.gx_hidden_field( httpContext, "O1152FacDiaPag", GXutil.rtrim( O1152FacDiaPag));
      app.GxWebStd.gx_hidden_field( httpContext, "O437FacFpg", GXutil.rtrim( O437FacFpg));
      app.GxWebStd.gx_hidden_field( httpContext, "O434FacDtoPP", GXutil.ltrim( localUtil.ntoc( O434FacDtoPP, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O433FacDtoGen", GXutil.ltrim( localUtil.ntoc( O433FacDtoGen, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O443FacIVAPor", GXutil.ltrim( localUtil.ntoc( O443FacIVAPor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O453FacRECPor", GXutil.ltrim( localUtil.ntoc( O453FacRECPor, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O14224FacCostFac", GXutil.ltrim( localUtil.ntoc( O14224FacCostFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_204", GXutil.ltrim( localUtil.ntoc( nGXsfl_204_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N14217MotAnuID", GXutil.rtrim( A14217MotAnuID));
      app.GxWebStd.gx_hidden_field( httpContext, "N11629MeivaId", GXutil.rtrim( A11629MeivaId));
      app.GxWebStd.gx_hidden_field( httpContext, "N436FacFch", localUtil.dtoc( A436FacFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "N433FacDtoGen", GXutil.ltrim( localUtil.ntoc( A433FacDtoGen, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N434FacDtoPP", GXutil.ltrim( localUtil.ntoc( A434FacDtoPP, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N443FacIVAPor", GXutil.ltrim( localUtil.ntoc( A443FacIVAPor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N453FacRECPor", GXutil.ltrim( localUtil.ntoc( A453FacRECPor, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N2739FacSerNum", GXutil.rtrim( A2739FacSerNum));
      app.GxWebStd.gx_hidden_field( httpContext, "N1153FacTipFac", GXutil.ltrim( localUtil.ntoc( A1153FacTipFac, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N450FacPri", GXutil.rtrim( A450FacPri));
      app.GxWebStd.gx_hidden_field( httpContext, "N252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N437FacFpg", GXutil.rtrim( A437FacFpg));
      app.GxWebStd.gx_hidden_field( httpContext, "N1150FacNumVto", GXutil.ltrim( localUtil.ntoc( A1150FacNumVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N1151FacPer", GXutil.rtrim( A1151FacPer));
      app.GxWebStd.gx_hidden_field( httpContext, "N1152FacDiaPag", GXutil.rtrim( A1152FacDiaPag));
      app.GxWebStd.gx_hidden_field( httpContext, "N9606FacHor", localUtil.ttoc( A9606FacHor, 10, 8, 0, 0, "/", ":", " "));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMEIVAID_DATA", AV40MeivaId_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMEIVAID_DATA", AV40MeivaId_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFACFPG_DATA", AV43FacFpg_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFACFPG_DATA", AV43FacFpg_Data);
      }
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
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPCOD", GXutil.rtrim( AV45EmpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPTOT1", GXutil.ltrim( localUtil.ntoc( A3918FacImpTot1, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPGEN1", GXutil.ltrim( localUtil.ntoc( A3919FacImpGen1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACDTOPP", GXutil.ltrim( localUtil.ntoc( A434FacDtoPP, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPPP1", GXutil.ltrim( localUtil.ntoc( A3920FacImpPP1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIVAIMP1", GXutil.ltrim( localUtil.ntoc( A3921FacIvaImp1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECPOR", GXutil.ltrim( localUtil.ntoc( A453FacRECPor, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECIMP1", GXutil.ltrim( localUtil.ntoc( A3922FacRecImp1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECT", GXutil.ltrim( localUtil.ntoc( A7212FacRect, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPRET1", GXutil.ltrim( localUtil.ntoc( A7214FacImpRet1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECICA", GXutil.ltrim( localUtil.ntoc( A11513FacRecIca, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPICA1", GXutil.ltrim( localUtil.ntoc( A11514FacImpIca1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACENERGIA", GXutil.ltrim( localUtil.ntoc( A14219FacEnergia, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPENG1", GXutil.ltrim( localUtil.ntoc( A14218FacImpEng1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTMTS", GXutil.ltrim( localUtil.ntoc( A14222FacCostMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTKGS", GXutil.ltrim( localUtil.ntoc( A14223FacCostKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTFAC", GXutil.ltrim( localUtil.ntoc( A14224FacCostFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTENG", GXutil.ltrim( localUtil.ntoc( A14221FacCostEng, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPRET", GXutil.ltrim( localUtil.ntoc( A7213FacImpRet, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPRET2", GXutil.ltrim( localUtil.ntoc( A7215FacImpRet2, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTENE", GXutil.ltrim( localUtil.ntoc( A14220FacCostEne, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECIMP", GXutil.ltrim( localUtil.ntoc( A452FacRecImp, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPREI", GXutil.ltrim( localUtil.ntoc( A8347FacImpReI, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPICA", GXutil.ltrim( localUtil.ntoc( A11515FacImpIca, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECI", GXutil.ltrim( localUtil.ntoc( A8346FacRecI, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPREI1", GXutil.ltrim( localUtil.ntoc( A8348FacImpReI1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLOMBIA", GXutil.ltrim( localUtil.ntoc( A7209Colombia, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPENER", GXutil.ltrim( localUtil.ntoc( A14225FacImpEner, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV19FirmaD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19FirmaD), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACCOD", GXutil.ltrim( localUtil.ntoc( AV8FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8FacCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CLICOD", GXutil.ltrim( localUtil.ntoc( AV12Insert_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_MOTANUID", GXutil.rtrim( AV13Insert_MotAnuID));
      app.GxWebStd.gx_hidden_field( httpContext, "MOTANUID", GXutil.rtrim( A14217MotAnuID));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_MEIVAID", GXutil.rtrim( AV14Insert_MeivaId));
      app.GxWebStd.gx_hidden_field( httpContext, "ZONGEOCOD", GXutil.ltrim( localUtil.ntoc( A858ZonGeoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACFCH", localUtil.dtoc( AV17Facfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACCODX", GXutil.ltrim( localUtil.ntoc( AV16FacCodX, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACTIPFAC", GXutil.ltrim( localUtil.ntoc( A1153FacTipFac, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOB", GXutil.rtrim( A965FacCob));
      app.GxWebStd.gx_hidden_field( httpContext, "FACMAN", GXutil.rtrim( A11626FacMan));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIVACOD", GXutil.rtrim( A960FacIVACod));
      app.GxWebStd.gx_hidden_field( httpContext, "FACLIC", GXutil.ltrim( localUtil.ntoc( A445FacLiC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACTRM", GXutil.ltrim( localUtil.ntoc( A7211Factrm, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACLIQ1", GXutil.ltrim( localUtil.ntoc( A9643FacLiq1, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACLIQ2", GXutil.ltrim( localUtil.ntoc( A9644FacLiq2, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIVA1", GXutil.ltrim( localUtil.ntoc( A9645FacIva1, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACTOT1", GXutil.ltrim( localUtil.ntoc( A9646FacTot1, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACFIRDG", GXutil.rtrim( A9710FacFirDg));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCLIPGL", GXutil.ltrim( localUtil.ntoc( A10417FacCliPgL, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACARAN", GXutil.rtrim( A10418FacAran));
      app.GxWebStd.gx_hidden_field( httpContext, "FACBRUT", GXutil.ltrim( localUtil.ntoc( A10419FacBrut, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACNET", GXutil.ltrim( localUtil.ntoc( A10420FacNet, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACINC", GXutil.rtrim( A10421FacInc));
      app.GxWebStd.gx_hidden_field( httpContext, "FACFRE", GXutil.rtrim( A10422FacFre));
      app.GxWebStd.gx_hidden_field( httpContext, "FACEXP", GXutil.rtrim( A10423FacExp));
      app.GxWebStd.gx_hidden_field( httpContext, "FACTPFRA", GXutil.rtrim( A12523FacTpFra));
      app.GxWebStd.gx_hidden_field( httpContext, "FACFECANUL", localUtil.ttoc( A14227FacFecAnul, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "FACSFD", localUtil.ttoc( A14229FacSFD, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIDATE", GXutil.rtrim( A14230FacIDATe));
      app.GxWebStd.gx_hidden_field( httpContext, "FACMSGATE", A14231FacMsgATe);
      app.GxWebStd.gx_hidden_field( httpContext, "FACIDATC", GXutil.rtrim( A14232FacIDATc));
      app.GxWebStd.gx_hidden_field( httpContext, "FACMSGATC", A14233FacMsgATc);
      app.GxWebStd.gx_hidden_field( httpContext, "FACIDATD", GXutil.rtrim( A14234FacIDATd));
      app.GxWebStd.gx_hidden_field( httpContext, "FACMSGATD", A14235FacMsgATd);
      app.GxWebStd.gx_hidden_field( httpContext, "FACSERAT", GXutil.rtrim( A14236FacSerAT));
      app.GxWebStd.gx_hidden_field( httpContext, "FACTIPAT", GXutil.rtrim( A14237FacTipAT));
      app.GxWebStd.gx_hidden_field( httpContext, "FACENVMAIL", localUtil.ttoc( A14420FacEnvMail, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "IVACOD", GXutil.rtrim( A953IvaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MEIVADSC", A11630MeivaDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "MOTANUDC", A14228MotAnuDc);
      app.GxWebStd.gx_hidden_field( httpContext, "ZONGEONOM", GXutil.rtrim( A1360ZonGeoNom));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPMIN", GXutil.ltrim( localUtil.ntoc( A5355FacImpMin, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIML", GXutil.ltrim( localUtil.ntoc( A2239FacIml, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPMAN", GXutil.ltrim( localUtil.ntoc( A5353FacImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMP1", GXutil.ltrim( localUtil.ntoc( A3923FacImp1, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPREKGSA", GXutil.ltrim( localUtil.ntoc( A3898FacPreKgsA, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACKGSA", GXutil.ltrim( localUtil.ntoc( A3897FacKgsA, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINTUTEX", GXutil.ltrim( localUtil.ntoc( AV20Tintutex, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV22Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV21UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FACDISNUM", GXutil.rtrim( A1498FacDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "FACTIPPRO", GXutil.rtrim( A3097FacTipPro));
      app.GxWebStd.gx_hidden_field( httpContext, "FACNPART", GXutil.ltrim( localUtil.ntoc( A3303FacNPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOLNOM", GXutil.rtrim( A3878FacColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "FOCCOLNUM", GXutil.ltrim( localUtil.ntoc( A3879FocColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACTIPCOLC", GXutil.ltrim( localUtil.ntoc( A3880FacTipColC, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACNOMCOL", GXutil.rtrim( A3881FacNomCol));
      app.GxWebStd.gx_hidden_field( httpContext, "FACNUMCOL", GXutil.ltrim( localUtil.ntoc( A3882FacNumCol, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCLICOD", GXutil.ltrim( localUtil.ntoc( A3883FacCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPROCOD", GXutil.rtrim( A3884FacProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FACDSC2", GXutil.rtrim( A4389FacDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "FACENCCLI", GXutil.rtrim( A4814FacEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "FACDISHCOD", GXutil.rtrim( A5172FacDishCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FACTIPART", GXutil.ltrim( localUtil.ntoc( A5189FacTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSPQ", GXutil.ltrim( localUtil.ntoc( A6837FacCosPQ, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPDTO", GXutil.ltrim( localUtil.ntoc( A9647FacImpdto, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACDTOL", GXutil.ltrim( localUtil.ntoc( A9648FacDtoL, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPKDTO", GXutil.ltrim( localUtil.ntoc( A9649FacPKDto, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPMDTO", GXutil.ltrim( localUtil.ntoc( A9650FacPMdto, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPD", GXutil.ltrim( localUtil.ntoc( A9651FacImpd, (byte)(16), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACDSCII", GXutil.rtrim( A9708FacDscII));
      app.GxWebStd.gx_hidden_field( httpContext, "FACACS", GXutil.rtrim( A10271FacAcs));
      app.GxWebStd.gx_hidden_field( httpContext, "FACFECALB", localUtil.dtoc( A3899FacFecAlb, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCADENC", GXutil.ltrim( localUtil.ntoc( A12906FacCadEnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACLINTRM", GXutil.ltrim( localUtil.ntoc( A14238FacLinTRM, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACLINTRMF", localUtil.ttoc( A14239FACLinTRMF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MEIVAID_Objectcall", GXutil.rtrim( Combo_meivaid_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MEIVAID_Cls", GXutil.rtrim( Combo_meivaid_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MEIVAID_Selectedvalue_set", GXutil.rtrim( Combo_meivaid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MEIVAID_Enabled", GXutil.booltostr( Combo_meivaid_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MEIVAID_Emptyitemtext", GXutil.rtrim( Combo_meivaid_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable4_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Enabled", GXutil.booltostr( Dvpanel_unnamedtable4_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Width", GXutil.rtrim( Dvpanel_unnamedtable4_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable4_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable4_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Cls", GXutil.rtrim( Dvpanel_unnamedtable4_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Title", GXutil.rtrim( Dvpanel_unnamedtable4_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable4_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable4_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable4_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FACFPG_Objectcall", GXutil.rtrim( Combo_facfpg_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FACFPG_Cls", GXutil.rtrim( Combo_facfpg_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FACFPG_Selectedvalue_set", GXutil.rtrim( Combo_facfpg_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FACFPG_Enabled", GXutil.booltostr( Combo_facfpg_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FACFPG_Emptyitemtext", GXutil.rtrim( Combo_facfpg_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable5_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Enabled", GXutil.booltostr( Dvpanel_unnamedtable5_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Width", GXutil.rtrim( Dvpanel_unnamedtable5_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable5_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable5_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Cls", GXutil.rtrim( Dvpanel_unnamedtable5_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Title", GXutil.rtrim( Dvpanel_unnamedtable5_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable5_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable5_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable5_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Objectcall", GXutil.rtrim( Datamonjs_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Enabled", GXutil.booltostr( Datamonjs_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Objectcall", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Enabled", GXutil.booltostr( Dvelop_confirmpanel_eliminardocumento_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Confirmtype));
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
      return formatLink("app.facturacion.mantenimientofactura", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8FacCod,8,0))}, new String[] {"Gx_mode","EmprCod","FacCod"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.MantenimientoFactura" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento Factura", "") ;
   }

   public void initializeNonKey1TR43( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A14217MotAnuID = "" ;
      n14217MotAnuID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14217MotAnuID", A14217MotAnuID);
      A11629MeivaId = "" ;
      n11629MeivaId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11629MeivaId", A11629MeivaId);
      A437FacFpg = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
      AV17Facfch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Facfch", localUtil.format(AV17Facfch, "99/99/99"));
      AV16FacCodX = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16FacCodX", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16FacCodX), 8, 0));
      A14220FacCostEne = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14220FacCostEne", GXutil.ltrimstr( A14220FacCostEne, 12, 3));
      A14225FacImpEner = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrimstr( A14225FacImpEner, 12, 3));
      A11515FacImpIca = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
      A8347FacImpReI = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
      A7213FacImpRet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
      A452FacRecImp = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
      A442FacIVAImp = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A442FacIVAImp", GXutil.ltrimstr( A442FacIVAImp, 11, 2));
      A440FacImpPP = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrimstr( A440FacImpPP, 11, 2));
      A439FacImpGen = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
      A441FacImpTot = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrimstr( A441FacImpTot, 13, 2));
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
      A455FacTot = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A455FacTot", GXutil.ltrimstr( A455FacTot, 13, 2));
      A429FacBasImp = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A429FacBasImp", GXutil.ltrimstr( A429FacBasImp, 13, 2));
      A7215FacImpRet2 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A7215FacImpRet2", GXutil.ltrimstr( A7215FacImpRet2, 13, 2));
      A14221FacCostEng = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14221FacCostEng", GXutil.ltrimstr( A14221FacCostEng, 12, 3));
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrimstr( A14218FacImpEng1, 12, 3));
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrimstr( A3920FacImpPP1, 12, 3));
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
      A436FacFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A436FacFch", localUtil.format(A436FacFch, "99/99/99"));
      A450FacPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", A450FacPri);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A433FacDtoGen = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
      A434FacDtoPP = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A434FacDtoPP", GXutil.ltrimstr( A434FacDtoPP, 5, 2));
      A960FacIVACod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A960FacIVACod", A960FacIVACod);
      A443FacIVAPor = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
      A453FacRECPor = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A453FacRECPor", GXutil.ltrimstr( A453FacRECPor, 7, 3));
      A435FacEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A435FacEst", GXutil.str( A435FacEst, 1, 0));
      A445FacLiC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A445FacLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A445FacLiC), 6, 0));
      A965FacCob = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A965FacCob", A965FacCob);
      A1150FacNumVto = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
      A1151FacPer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
      A1152FacDiaPag = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
      A1153FacTipFac = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1153FacTipFac", GXutil.str( A1153FacTipFac, 1, 0));
      A2739FacSerNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2739FacSerNum", A2739FacSerNum);
      A6632FacDto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6632FacDto", GXutil.ltrimstr( A6632FacDto, 6, 2));
      A7210FacObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7210FacObs", A7210FacObs);
      A7211Factrm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A7211Factrm", GXutil.ltrimstr( A7211Factrm, 11, 5));
      A7212FacRect = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A7212FacRect", GXutil.ltrimstr( A7212FacRect, 6, 2));
      A9605FacFirma = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9605FacFirma", A9605FacFirma);
      A9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A9606FacHor", localUtil.ttoc( A9606FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9643FacLiq1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9643FacLiq1", GXutil.ltrimstr( A9643FacLiq1, 16, 5));
      A9644FacLiq2 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9644FacLiq2", GXutil.ltrimstr( A9644FacLiq2, 16, 5));
      A9645FacIva1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9645FacIva1", GXutil.ltrimstr( A9645FacIva1, 16, 5));
      A9646FacTot1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9646FacTot1", GXutil.ltrimstr( A9646FacTot1, 16, 5));
      A858ZonGeoCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A858ZonGeoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A858ZonGeoCod), 3, 0));
      A1360ZonGeoNom = "" ;
      n1360ZonGeoNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1360ZonGeoNom", A1360ZonGeoNom);
      A9710FacFirDg = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9710FacFirDg", A9710FacFirDg);
      A10417FacCliPgL = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10417FacCliPgL", GXutil.str( A10417FacCliPgL, 1, 0));
      A10418FacAran = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10418FacAran", A10418FacAran);
      A10419FacBrut = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10419FacBrut", GXutil.ltrimstr( A10419FacBrut, 10, 2));
      A10420FacNet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10420FacNet", GXutil.ltrimstr( A10420FacNet, 10, 2));
      A10421FacInc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10421FacInc", A10421FacInc);
      A10422FacFre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10422FacFre", A10422FacFre);
      A10423FacExp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10423FacExp", A10423FacExp);
      A11513FacRecIca = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11513FacRecIca", GXutil.ltrimstr( A11513FacRecIca, 7, 3));
      A12523FacTpFra = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12523FacTpFra", A12523FacTpFra);
      A11626FacMan = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11626FacMan", A11626FacMan);
      A14219FacEnergia = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14219FacEnergia", GXutil.ltrimstr( A14219FacEnergia, 6, 2));
      A14224FacCostFac = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14224FacCostFac", GXutil.ltrimstr( A14224FacCostFac, 6, 2));
      A14222FacCostMts = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14222FacCostMts", GXutil.ltrimstr( A14222FacCostMts, 10, 2));
      A14223FacCostKgs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14223FacCostKgs", GXutil.ltrimstr( A14223FacCostKgs, 10, 2));
      A14227FacFecAnul = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14227FacFecAnul", localUtil.ttoc( A14227FacFecAnul, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14228MotAnuDc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14228MotAnuDc", A14228MotAnuDc);
      A11630MeivaDsc = "" ;
      n11630MeivaDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11630MeivaDsc", A11630MeivaDsc);
      A14229FacSFD = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14229FacSFD", localUtil.ttoc( A14229FacSFD, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14230FacIDATe = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14230FacIDATe", A14230FacIDATe);
      A14231FacMsgATe = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14231FacMsgATe", A14231FacMsgATe);
      A14232FacIDATc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14232FacIDATc", A14232FacIDATc);
      A14233FacMsgATc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14233FacMsgATc", A14233FacMsgATc);
      A14234FacIDATd = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14234FacIDATd", A14234FacIDATd);
      A14235FacMsgATd = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14235FacMsgATd", A14235FacMsgATd);
      A14236FacSerAT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14236FacSerAT", A14236FacSerAT);
      A14237FacTipAT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14237FacTipAT", A14237FacTipAT);
      A11273FacObs2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11273FacObs2", A11273FacObs2);
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      n3918FacImpTot1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
      A14420FacEnvMail = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14420FacEnvMail", localUtil.ttoc( A14420FacEnvMail, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A8346FacRecI = DecimalUtil.ZERO ;
      n8346FacRecI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8346FacRecI", GXutil.ltrimstr( A8346FacRecI, 6, 2));
      A14226FacAnulada = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14226FacAnulada", A14226FacAnulada);
      O3918FacImpTot1 = A3918FacImpTot1 ;
      n3918FacImpTot1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrimstr( A3918FacImpTot1, 13, 2));
      O1150FacNumVto = A1150FacNumVto ;
      httpContext.ajax_rsp_assign_attri("", false, "A1150FacNumVto", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1150FacNumVto), 2, 0));
      O1151FacPer = A1151FacPer ;
      httpContext.ajax_rsp_assign_attri("", false, "A1151FacPer", A1151FacPer);
      O1152FacDiaPag = A1152FacDiaPag ;
      httpContext.ajax_rsp_assign_attri("", false, "A1152FacDiaPag", A1152FacDiaPag);
      O437FacFpg = A437FacFpg ;
      httpContext.ajax_rsp_assign_attri("", false, "A437FacFpg", A437FacFpg);
      O434FacDtoPP = A434FacDtoPP ;
      httpContext.ajax_rsp_assign_attri("", false, "A434FacDtoPP", GXutil.ltrimstr( A434FacDtoPP, 5, 2));
      O433FacDtoGen = A433FacDtoGen ;
      httpContext.ajax_rsp_assign_attri("", false, "A433FacDtoGen", GXutil.ltrimstr( A433FacDtoGen, 5, 2));
      O443FacIVAPor = A443FacIVAPor ;
      httpContext.ajax_rsp_assign_attri("", false, "A443FacIVAPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A443FacIVAPor), 2, 0));
      O453FacRECPor = A453FacRECPor ;
      httpContext.ajax_rsp_assign_attri("", false, "A453FacRECPor", GXutil.ltrimstr( A453FacRECPor, 7, 3));
      O14224FacCostFac = A14224FacCostFac ;
      httpContext.ajax_rsp_assign_attri("", false, "A14224FacCostFac", GXutil.ltrimstr( A14224FacCostFac, 6, 2));
      Z437FacFpg = "" ;
      Z436FacFch = GXutil.nullDate() ;
      Z450FacPri = "" ;
      Z433FacDtoGen = DecimalUtil.ZERO ;
      Z434FacDtoPP = DecimalUtil.ZERO ;
      Z960FacIVACod = "" ;
      Z443FacIVAPor = (byte)(0) ;
      Z453FacRECPor = DecimalUtil.ZERO ;
      Z435FacEst = (byte)(0) ;
      Z445FacLiC = 0 ;
      Z965FacCob = "" ;
      Z1150FacNumVto = (byte)(0) ;
      Z1151FacPer = "" ;
      Z1152FacDiaPag = "" ;
      Z1153FacTipFac = (byte)(0) ;
      Z2739FacSerNum = "" ;
      Z6632FacDto = DecimalUtil.ZERO ;
      Z7211Factrm = DecimalUtil.ZERO ;
      Z7212FacRect = DecimalUtil.ZERO ;
      Z9605FacFirma = "" ;
      Z9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      Z9643FacLiq1 = DecimalUtil.ZERO ;
      Z9644FacLiq2 = DecimalUtil.ZERO ;
      Z9645FacIva1 = DecimalUtil.ZERO ;
      Z9646FacTot1 = DecimalUtil.ZERO ;
      Z9710FacFirDg = "" ;
      Z10417FacCliPgL = (byte)(0) ;
      Z10418FacAran = "" ;
      Z10419FacBrut = DecimalUtil.ZERO ;
      Z10420FacNet = DecimalUtil.ZERO ;
      Z10421FacInc = "" ;
      Z10422FacFre = "" ;
      Z10423FacExp = "" ;
      Z11513FacRecIca = DecimalUtil.ZERO ;
      Z12523FacTpFra = "" ;
      Z11626FacMan = "" ;
      Z14219FacEnergia = DecimalUtil.ZERO ;
      Z14224FacCostFac = DecimalUtil.ZERO ;
      Z14222FacCostMts = DecimalUtil.ZERO ;
      Z14223FacCostKgs = DecimalUtil.ZERO ;
      Z14226FacAnulada = "" ;
      Z14227FacFecAnul = GXutil.resetTime( GXutil.nullDate() );
      Z14229FacSFD = GXutil.resetTime( GXutil.nullDate() );
      Z14230FacIDATe = "" ;
      Z14231FacMsgATe = "" ;
      Z14232FacIDATc = "" ;
      Z14233FacMsgATc = "" ;
      Z14234FacIDATd = "" ;
      Z14235FacMsgATd = "" ;
      Z14236FacSerAT = "" ;
      Z14237FacTipAT = "" ;
      Z11273FacObs2 = "" ;
      Z14420FacEnvMail = GXutil.resetTime( GXutil.nullDate() );
      Z8346FacRecI = DecimalUtil.ZERO ;
      Z252CliCod = 0 ;
      Z11629MeivaId = "" ;
      Z14217MotAnuID = "" ;
   }

   public void initAll1TR43( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A430FacCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      initializeNonKey1TR43( ) ;
   }

   public void standaloneModalInsert( )
   {
      A14226FacAnulada = i14226FacAnulada ;
      httpContext.ajax_rsp_assign_attri("", false, "A14226FacAnulada", A14226FacAnulada);
   }

   public void initializeNonKey1TR44( )
   {
      A438FacImp = DecimalUtil.ZERO ;
      A2239FacIml = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2239FacIml", GXutil.ltrimstr( A2239FacIml, 16, 5));
      A3923FacImp1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3923FacImp1", GXutil.ltrimstr( A3923FacImp1, 16, 5));
      A14247FacNHdr = "" ;
      A427FacAlbCod = 0 ;
      A1294FacBarCod = 0 ;
      A1295FacBarReo = (byte)(0) ;
      A1296FacBarPar = "" ;
      A428FacAlbTip = (byte)(0) ;
      A454FacSer = "" ;
      A432FacDsc = "" ;
      A1498FacDisNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1498FacDisNum", A1498FacDisNum);
      A447FacMts = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A451FacRec = DecimalUtil.ZERO ;
      A3097FacTipPro = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3097FacTipPro", A3097FacTipPro);
      A3303FacNPart = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3303FacNPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3303FacNPart), 4, 0));
      A3397FacFasCod = "" ;
      A3878FacColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3878FacColNom", A3878FacColNom);
      A3879FocColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3879FocColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3879FocColNum), 6, 0));
      A3880FacTipColC = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3880FacTipColC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3880FacTipColC), 2, 0));
      A3881FacNomCol = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3881FacNomCol", A3881FacNomCol);
      A3882FacNumCol = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3882FacNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3882FacNumCol), 6, 0));
      A3883FacCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3883FacCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3883FacCliCod), 6, 0));
      A3884FacProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3884FacProCod", A3884FacProCod);
      A4389FacDsc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4389FacDsc2", A4389FacDsc2);
      A4814FacEncCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4814FacEncCli", A4814FacEncCli);
      A5172FacDishCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5172FacDishCod", A5172FacDishCod);
      A5189FacTipArt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5189FacTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5189FacTipArt), 4, 0));
      A5353FacImpMan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5353FacImpMan", GXutil.ltrimstr( A5353FacImpMan, 11, 2));
      A5355FacImpMin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5355FacImpMin", GXutil.ltrimstr( A5355FacImpMin, 11, 2));
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3898FacPreKgsA", GXutil.ltrimstr( A3898FacPreKgsA, 13, 5));
      A6837FacCosPQ = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A6837FacCosPQ", GXutil.ltrimstr( A6837FacCosPQ, 10, 2));
      A9647FacImpdto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9647FacImpdto", GXutil.ltrimstr( A9647FacImpdto, 16, 5));
      A9648FacDtoL = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9648FacDtoL", GXutil.ltrimstr( A9648FacDtoL, 5, 2));
      A9649FacPKDto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9649FacPKDto", GXutil.ltrimstr( A9649FacPKDto, 13, 5));
      A9650FacPMdto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9650FacPMdto", GXutil.ltrimstr( A9650FacPMdto, 13, 5));
      A9651FacImpd = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9651FacImpd", GXutil.ltrimstr( A9651FacImpd, 16, 5));
      A9708FacDscII = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9708FacDscII", A9708FacDscII);
      A10271FacAcs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10271FacAcs", A10271FacAcs);
      A3897FacKgsA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3897FacKgsA", GXutil.ltrimstr( A3897FacKgsA, 9, 2));
      A3899FacFecAlb = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A3899FacFecAlb", localUtil.format(A3899FacFecAlb, "99/99/99"));
      A12197FacUnds = 0 ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A12906FacCadEnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12906FacCadEnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12906FacCadEnc), 4, 0));
      A14238FacLinTRM = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14238FacLinTRM", GXutil.ltrimstr( A14238FacLinTRM, 11, 2));
      A14239FACLinTRMF = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14239FACLinTRMF", localUtil.ttoc( A14239FACLinTRMF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
      O438FacImp = A438FacImp ;
      O448FacPreKgs = A448FacPreKgs ;
      O449FacPreMts = A449FacPreMts ;
      Z5050FacBonLi = DecimalUtil.ZERO ;
      Z427FacAlbCod = 0 ;
      Z1294FacBarCod = 0 ;
      Z1295FacBarReo = (byte)(0) ;
      Z1296FacBarPar = "" ;
      Z428FacAlbTip = (byte)(0) ;
      Z454FacSer = "" ;
      Z432FacDsc = "" ;
      Z1498FacDisNum = "" ;
      Z447FacMts = DecimalUtil.ZERO ;
      Z449FacPreMts = DecimalUtil.ZERO ;
      Z444FacKgs = DecimalUtil.ZERO ;
      Z448FacPreKgs = DecimalUtil.ZERO ;
      Z451FacRec = DecimalUtil.ZERO ;
      Z3097FacTipPro = "" ;
      Z3303FacNPart = (short)(0) ;
      Z3397FacFasCod = "" ;
      Z3878FacColNom = "" ;
      Z3879FocColNum = 0 ;
      Z3880FacTipColC = (byte)(0) ;
      Z3881FacNomCol = "" ;
      Z3882FacNumCol = 0 ;
      Z3883FacCliCod = 0 ;
      Z3884FacProCod = "" ;
      Z4389FacDsc2 = "" ;
      Z4814FacEncCli = "" ;
      Z5172FacDishCod = "" ;
      Z5189FacTipArt = (short)(0) ;
      Z5353FacImpMan = DecimalUtil.ZERO ;
      Z5355FacImpMin = DecimalUtil.ZERO ;
      Z3898FacPreKgsA = DecimalUtil.ZERO ;
      Z6837FacCosPQ = DecimalUtil.ZERO ;
      Z9647FacImpdto = DecimalUtil.ZERO ;
      Z9648FacDtoL = DecimalUtil.ZERO ;
      Z9649FacPKDto = DecimalUtil.ZERO ;
      Z9650FacPMdto = DecimalUtil.ZERO ;
      Z9651FacImpd = DecimalUtil.ZERO ;
      Z9708FacDscII = "" ;
      Z10271FacAcs = "" ;
      Z3897FacKgsA = DecimalUtil.ZERO ;
      Z3899FacFecAlb = GXutil.nullDate() ;
      Z12197FacUnds = 0 ;
      Z12198FacPreUnd = DecimalUtil.ZERO ;
      Z12906FacCadEnc = (short)(0) ;
      Z14238FacLinTRM = DecimalUtil.ZERO ;
      Z14239FACLinTRMF = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAll1TR44( )
   {
      A446FacLin = 0 ;
      initializeNonKey1TR44( ) ;
   }

   public void standaloneModalInsert1TR44( )
   {
      A5050FacBonLi = i5050FacBonLi ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20269210541145", true, true);
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
      httpContext.AddJavascriptSource("facturacion/mantenimientofactura.js", "?20269210541145", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties44( )
   {
      edtFacFasCod_Enabled = defedtFacFasCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacFasCod_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacDsc_Enabled = defedtFacDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDsc_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacBarPar_Enabled = defedtFacBarPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBarPar_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacBarReo_Enabled = defedtFacBarReo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBarReo_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacBarCod_Enabled = defedtFacBarCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBarCod_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacSer_Enabled = defedtFacSer_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacSer_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacBonLi_Enabled = defedtFacBonLi_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacBonLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBonLi_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacRec_Enabled = defedtFacRec_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacRec_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacPreKgs_Enabled = defedtFacPreKgs_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacPreKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPreKgs_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacKgs_Enabled = defedtFacKgs_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacKgs_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacPreMts_Enabled = defedtFacPreMts_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacPreMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacPreMts_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacMts_Enabled = defedtFacMts_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacMts_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacAlbTip_Enabled = defedtFacAlbTip_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacAlbTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacAlbTip_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacAlbCod_Enabled = defedtFacAlbCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacAlbCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacAlbCod_Enabled), 5, 0), !bGXsfl_204_Refreshing);
      edtFacLin_Enabled = defedtFacLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacLin_Enabled), 5, 0), !bGXsfl_204_Refreshing);
   }

   public void startgridcontrol204( )
   {
      Gridlevel_lineasContainer.AddObjectProperty("GridName", "Gridlevel_lineas");
      Gridlevel_lineasContainer.AddObjectProperty("Header", subGridlevel_lineas_Header);
      Gridlevel_lineasContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_lineasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_lineasContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A446FacLin, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A427FacAlbCod, (byte)(10), (byte)(0), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacAlbCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A428FacAlbTip, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacAlbTip_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.rtrim( A14247FacNHdr));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacNHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A447FacMts, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A449FacPreMts, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A444FacKgs, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A448FacPreKgs, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12197FacUnds, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacUnds_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12198FacPreUnd, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacPreUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A451FacRec, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5050FacBonLi, (byte)(6), (byte)(2), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacBonLi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtFacBonLi_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A438FacImp, (byte)(14), (byte)(2), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacImp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.rtrim( A454FacSer));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1294FacBarCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1295FacBarReo, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacBarReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.rtrim( A1296FacBarPar));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacBarPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.rtrim( A432FacDsc));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.rtrim( A3397FacFasCod));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtFacCod_Internalname = "FACCOD" ;
      edtFacFch_Internalname = "FACFCH" ;
      edtFacHor_Internalname = "FACHOR" ;
      cmbFacEst.setInternalname( "FACEST" );
      edtFacSerNum_Internalname = "FACSERNUM" ;
      cmbFacAnulada.setInternalname( "FACANULADA" );
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblockmeivaid_Internalname = "TEXTBLOCKMEIVAID" ;
      Combo_meivaid_Internalname = "COMBO_MEIVAID" ;
      edtMeivaId_Internalname = "MEIVAID" ;
      divTablesplittedmeivaid_Internalname = "TABLESPLITTEDMEIVAID" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      edtFacNumVto_Internalname = "FACNUMVTO" ;
      edtFacPer_Internalname = "FACPER" ;
      edtFacDiaPag_Internalname = "FACDIAPAG" ;
      lblTextblockfacfpg_Internalname = "TEXTBLOCKFACFPG" ;
      Combo_facfpg_Internalname = "COMBO_FACFPG" ;
      edtFacFpg_Internalname = "FACFPG" ;
      divTablesplittedfacfpg_Internalname = "TABLESPLITTEDFACFPG" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = "DVPANEL_UNNAMEDTABLE5" ;
      edtFacObs_Internalname = "FACOBS" ;
      divFacobs_cell_Internalname = "FACOBS_CELL" ;
      edtFacObs2_Internalname = "FACOBS2" ;
      divFacobs2_cell_Internalname = "FACOBS2_CELL" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      Dvpanel_unnamedtable6_Internalname = "DVPANEL_UNNAMEDTABLE6" ;
      edtFacImpTot_Internalname = "FACIMPTOT" ;
      edtFacDtoGen_Internalname = "FACDTOGEN" ;
      edtFacImpGen_Internalname = "FACIMPGEN" ;
      edtFacDto_Internalname = "FACDTO" ;
      edtFacImpPP_Internalname = "FACIMPPP" ;
      edtFacBasImp_Internalname = "FACBASIMP" ;
      edtFacIVAPor_Internalname = "FACIVAPOR" ;
      edtFacIVAImp_Internalname = "FACIVAIMP" ;
      edtFacTot_Internalname = "FACTOT" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      Dvpanel_unnamedtable7_Internalname = "DVPANEL_UNNAMEDTABLE7" ;
      edtFacFirma_Internalname = "FACFIRMA" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      Dvpanel_unnamedtable8_Internalname = "DVPANEL_UNNAMEDTABLE8" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtavTexto_fd_Internalname = "vTEXTO_FD" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtnagregardocumento_Internalname = "BTNAGREGARDOCUMENTO" ;
      bttBtneliminardocumento_Internalname = "BTNELIMINARDOCUMENTO" ;
      bttBtnbuscardocumento_Internalname = "BTNBUSCARDOCUMENTO" ;
      bttBtnvencimientos_Internalname = "BTNVENCIMIENTOS" ;
      bttBtnrepresentantes_divisas_Internalname = "BTNREPRESENTANTES_DIVISAS" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtFacLin_Internalname = "FACLIN" ;
      edtFacAlbCod_Internalname = "FACALBCOD" ;
      edtFacAlbTip_Internalname = "FACALBTIP" ;
      edtFacNHdr_Internalname = "FACNHDR" ;
      edtFacMts_Internalname = "FACMTS" ;
      edtFacPreMts_Internalname = "FACPREMTS" ;
      edtFacKgs_Internalname = "FACKGS" ;
      edtFacPreKgs_Internalname = "FACPREKGS" ;
      edtFacUnds_Internalname = "FACUNDS" ;
      edtFacPreUnd_Internalname = "FACPREUND" ;
      edtFacRec_Internalname = "FACREC" ;
      edtFacBonLi_Internalname = "FACBONLI" ;
      edtFacImp_Internalname = "FACIMP" ;
      edtFacSer_Internalname = "FACSER" ;
      edtFacBarCod_Internalname = "FACBARCOD" ;
      edtFacBarReo_Internalname = "FACBARREO" ;
      edtFacBarPar_Internalname = "FACBARPAR" ;
      edtFacDsc_Internalname = "FACDSC" ;
      edtFacFasCod_Internalname = "FACFASCOD" ;
      divTableleaflevel_lineas_Internalname = "TABLELEAFLEVEL_LINEAS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombomeivaid_Internalname = "vCOMBOMEIVAID" ;
      divSectionattribute_meivaid_Internalname = "SECTIONATTRIBUTE_MEIVAID" ;
      edtavCombofacfpg_Internalname = "vCOMBOFACFPG" ;
      divSectionattribute_facfpg_Internalname = "SECTIONATTRIBUTE_FACFPG" ;
      edtFacPri_Internalname = "FACPRI" ;
      Dvelop_confirmpanel_eliminardocumento_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO" ;
      tblTabledvelop_confirmpanel_eliminardocumento_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_lineas_Internalname = "GRIDLEVEL_LINEAS" ;
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
      subGridlevel_lineas_Allowcollapsing = (byte)(0) ;
      subGridlevel_lineas_Allowselection = (byte)(0) ;
      subGridlevel_lineas_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Mantenimiento Factura", "") );
      edtFacFasCod_Jsonclick = "" ;
      edtFacDsc_Jsonclick = "" ;
      edtFacBarPar_Jsonclick = "" ;
      edtFacBarReo_Jsonclick = "" ;
      edtFacBarCod_Jsonclick = "" ;
      edtFacSer_Jsonclick = "" ;
      edtFacImp_Jsonclick = "" ;
      edtFacBonLi_Jsonclick = "" ;
      edtFacRec_Jsonclick = "" ;
      edtFacPreUnd_Jsonclick = "" ;
      edtFacUnds_Jsonclick = "" ;
      edtFacPreKgs_Jsonclick = "" ;
      edtFacKgs_Jsonclick = "" ;
      edtFacPreMts_Jsonclick = "" ;
      edtFacMts_Jsonclick = "" ;
      edtFacNHdr_Jsonclick = "" ;
      edtFacAlbTip_Jsonclick = "" ;
      edtFacAlbCod_Jsonclick = "" ;
      edtFacLin_Jsonclick = "" ;
      subGridlevel_lineas_Class = "GridNoBorder WorkWith" ;
      subGridlevel_lineas_Backcolorstyle = (byte)(0) ;
      edtFacFasCod_Enabled = 0 ;
      edtFacDsc_Enabled = 0 ;
      edtFacBarPar_Enabled = 0 ;
      edtFacBarReo_Enabled = 0 ;
      edtFacBarCod_Enabled = 0 ;
      edtFacSer_Enabled = 0 ;
      edtFacImp_Enabled = 0 ;
      edtFacBonLi_Visible = -1 ;
      edtFacBonLi_Enabled = 1 ;
      edtFacRec_Enabled = 0 ;
      edtFacPreUnd_Enabled = 1 ;
      edtFacUnds_Enabled = 1 ;
      edtFacPreKgs_Enabled = 1 ;
      edtFacKgs_Enabled = 1 ;
      edtFacPreMts_Enabled = 1 ;
      edtFacMts_Enabled = 1 ;
      edtFacNHdr_Enabled = 0 ;
      edtFacAlbTip_Enabled = 0 ;
      edtFacAlbCod_Enabled = 0 ;
      edtFacLin_Enabled = 0 ;
      Dvelop_confirmpanel_eliminardocumento_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminardocumento_Confirmationtext = "¿Desea eliminar el documento seleccionado?" ;
      Dvelop_confirmpanel_eliminardocumento_Title = "" ;
      edtFacPri_Jsonclick = "" ;
      edtFacPri_Enabled = 0 ;
      edtFacPri_Visible = 1 ;
      edtavCombofacfpg_Jsonclick = "" ;
      edtavCombofacfpg_Enabled = 0 ;
      edtavCombofacfpg_Visible = 1 ;
      edtavCombomeivaid_Jsonclick = "" ;
      edtavCombomeivaid_Enabled = 0 ;
      edtavCombomeivaid_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtnrepresentantes_divisas_Visible = 1 ;
      bttBtnvencimientos_Visible = 1 ;
      bttBtnbuscardocumento_Visible = 1 ;
      bttBtneliminardocumento_Visible = 1 ;
      bttBtnagregardocumento_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtavTexto_fd_Jsonclick = "" ;
      edtavTexto_fd_Enabled = 0 ;
      edtFacFirma_Enabled = 0 ;
      Dvpanel_unnamedtable8_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Iconposition = "Right" ;
      Dvpanel_unnamedtable8_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable8_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable8_Title = httpContext.getMessage( "Hash", "") ;
      Dvpanel_unnamedtable8_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable8_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable8_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Width = "100%" ;
      edtFacTot_Jsonclick = "" ;
      edtFacTot_Enabled = 0 ;
      edtFacIVAImp_Jsonclick = "" ;
      edtFacIVAImp_Enabled = 0 ;
      edtFacIVAPor_Jsonclick = "" ;
      edtFacIVAPor_Enabled = 1 ;
      edtFacBasImp_Jsonclick = "" ;
      edtFacBasImp_Enabled = 0 ;
      edtFacImpPP_Jsonclick = "" ;
      edtFacImpPP_Enabled = 0 ;
      edtFacDto_Jsonclick = "" ;
      edtFacDto_Enabled = 1 ;
      edtFacImpGen_Jsonclick = "" ;
      edtFacImpGen_Enabled = 0 ;
      edtFacDtoGen_Jsonclick = "" ;
      edtFacDtoGen_Enabled = 1 ;
      edtFacImpTot_Jsonclick = "" ;
      edtFacImpTot_Enabled = 0 ;
      Dvpanel_unnamedtable7_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Iconposition = "Right" ;
      Dvpanel_unnamedtable7_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable7_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Title = httpContext.getMessage( "Totales", "") ;
      Dvpanel_unnamedtable7_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable7_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Width = "100%" ;
      edtFacObs2_Enabled = 1 ;
      edtFacObs2_Visible = 1 ;
      divFacobs2_cell_Class = "col-xs-12" ;
      edtFacObs_Enabled = 1 ;
      edtFacObs_Visible = 1 ;
      divFacobs_cell_Class = "col-xs-12" ;
      divUnnamedtable10_Visible = 1 ;
      Dvpanel_unnamedtable6_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Iconposition = "Right" ;
      Dvpanel_unnamedtable6_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable6_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Title = httpContext.getMessage( "Observaciones", "") ;
      Dvpanel_unnamedtable6_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable6_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Width = "100%" ;
      edtFacFpg_Jsonclick = "" ;
      edtFacFpg_Enabled = 1 ;
      edtFacFpg_Visible = 1 ;
      Combo_facfpg_Emptyitemtext = "" ;
      Combo_facfpg_Cls = "ExtendedCombo AttributeFL" ;
      Combo_facfpg_Enabled = GXutil.toBoolean( -1) ;
      edtFacDiaPag_Jsonclick = "" ;
      edtFacDiaPag_Enabled = 1 ;
      edtFacPer_Jsonclick = "" ;
      edtFacPer_Enabled = 1 ;
      edtFacNumVto_Jsonclick = "" ;
      edtFacNumVto_Enabled = 1 ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = httpContext.getMessage( "Formas de Pago", "") ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      edtMeivaId_Jsonclick = "" ;
      edtMeivaId_Enabled = 1 ;
      edtMeivaId_Visible = 1 ;
      Combo_meivaid_Emptyitemtext = "" ;
      Combo_meivaid_Cls = "ExtendedCombo AttributeFL" ;
      Combo_meivaid_Enabled = GXutil.toBoolean( -1) ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Cliente", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      cmbFacAnulada.setJsonclick( "" );
      cmbFacAnulada.setEnabled( 1 );
      edtFacSerNum_Jsonclick = "" ;
      edtFacSerNum_Enabled = 1 ;
      cmbFacEst.setJsonclick( "" );
      cmbFacEst.setEnabled( 0 );
      edtFacHor_Jsonclick = "" ;
      edtFacHor_Enabled = 1 ;
      edtFacFch_Jsonclick = "" ;
      edtFacFch_Enabled = 1 ;
      edtFacCod_Jsonclick = "" ;
      edtFacCod_Enabled = 0 ;
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

   public void gxasa50501TR43( String AV7EmprCod )
   {
      GXt_int8 = (byte)(0) ;
      GXv_int17[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int17) ;
      mantenimientofactura_impl.this.GXt_int8 = GXv_int17[0] ;
      edtFacBonLi_Visible = ((GXt_int8==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacBonLi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacBonLi_Visible), 5, 0), !bGXsfl_204_Refreshing);
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

   public void xc_57_1TR43( String A396EmprCod ,
                            int A430FacCod ,
                            String A450FacPri ,
                            byte A1150FacNumVto ,
                            String A1151FacPer ,
                            String A1152FacDiaPag ,
                            String A437FacFpg ,
                            java.math.BigDecimal A434FacDtoPP ,
                            java.math.BigDecimal A433FacDtoGen ,
                            byte A443FacIVAPor ,
                            java.math.BigDecimal A453FacRECPor ,
                            java.math.BigDecimal A14224FacCostFac )
   {
      if ( true /* After */ && true /* Level */ && ( ( A1150FacNumVto != O1150FacNumVto ) || ( GXutil.strcmp(A1151FacPer, O1151FacPer) != 0 ) || ( GXutil.strcmp(A1152FacDiaPag, O1152FacDiaPag) != 0 ) || ( GXutil.strcmp(A437FacFpg, O437FacFpg) != 0 ) || ( DecimalUtil.compareTo(A434FacDtoPP, O434FacDtoPP) != 0 ) || ( DecimalUtil.compareTo(A433FacDtoGen, O433FacDtoGen) != 0 ) || ( A443FacIVAPor != O443FacIVAPor ) || ( DecimalUtil.compareTo(A453FacRECPor, O453FacRECPor) != 0 ) ) || ( DecimalUtil.compareTo(A14224FacCostFac, O14224FacCostFac) != 0 ) )
      {
         new app.pcalvto(remoteHandle, context).execute( A396EmprCod, A430FacCod) ;
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

   public void xc_58_1TR43( String A396EmprCod ,
                            int AV16FacCodX ,
                            java.util.Date AV17Facfch ,
                            String A450FacPri ,
                            short AV19FirmaD ,
                            int A430FacCod )
   {
      if ( ( AV19FirmaD == 1 ) && true /* After */ && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         GXv_char21[0] = A396EmprCod ;
         GXv_int17[0] = (byte)(0) ;
         GXv_int16[0] = AV16FacCodX ;
         GXv_date15[0] = AV17Facfch ;
         GXv_char20[0] = A450FacPri ;
         new app.pfacrecl(remoteHandle, context).execute( GXv_char21, GXv_int17, GXv_int16, GXv_date15, GXv_char20) ;
         A396EmprCod = GXv_char21[0] ;
         AV16FacCodX = GXv_int16[0] ;
         AV17Facfch = GXv_date15[0] ;
         A450FacPri = GXv_char20[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV16FacCodX", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16FacCodX), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17Facfch", localUtil.format(AV17Facfch, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", A450FacPri);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV16FacCodX, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(AV17Facfch, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A450FacPri))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_132_1TR44( String A396EmprCod ,
                             int A430FacCod ,
                             java.math.BigDecimal A444FacKgs )
   {
      if ( ( true /* After */ || true /* After */ || true /* After */ ) && true /* Level */ )
      {
         new app.pcalvto(remoteHandle, context).execute( A396EmprCod, A430FacCod) ;
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

   public void xc_133_1TR44( String A396EmprCod ,
                             int A430FacCod ,
                             long A427FacAlbCod ,
                             byte A428FacAlbTip ,
                             int A1294FacBarCod ,
                             byte A1295FacBarReo ,
                             String A1296FacBarPar ,
                             java.math.BigDecimal A448FacPreKgs ,
                             java.math.BigDecimal A449FacPreMts ,
                             String A3397FacFasCod ,
                             String AV21UsurCod ,
                             String AV22Station ,
                             short AV20Tintutex )
   {
      if ( ( AV20Tintutex == 1 ) && ( ( DecimalUtil.compareTo(A448FacPreKgs, O448FacPreKgs) != 0 ) || ( DecimalUtil.compareTo(A449FacPreMts, O449FacPreMts) != 0 ) ) && true /* After */ )
      {
         GXv_char21[0] = A396EmprCod ;
         GXv_int16[0] = A430FacCod ;
         GXv_int11[0] = A427FacAlbCod ;
         GXv_int17[0] = A428FacAlbTip ;
         GXv_int7[0] = A1294FacBarCod ;
         GXv_int6[0] = A1295FacBarReo ;
         GXv_char20[0] = A1296FacBarPar ;
         GXv_decimal19[0] = A448FacPreKgs ;
         GXv_decimal18[0] = A449FacPreMts ;
         GXv_char4[0] = A3397FacFasCod ;
         GXv_char3[0] = AV21UsurCod ;
         GXv_char2[0] = AV22Station ;
         new app.pprc280(remoteHandle, context).execute( GXv_char21, GXv_int16, GXv_int11, GXv_int17, GXv_int7, GXv_int6, GXv_char20, GXv_decimal19, GXv_decimal18, GXv_char4, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char21[0] ;
         A430FacCod = GXv_int16[0] ;
         A427FacAlbCod = GXv_int11[0] ;
         A428FacAlbTip = GXv_int17[0] ;
         A1294FacBarCod = GXv_int7[0] ;
         A1295FacBarReo = GXv_int6[0] ;
         A1296FacBarPar = GXv_char20[0] ;
         A448FacPreKgs = GXv_decimal19[0] ;
         A449FacPreMts = GXv_decimal18[0] ;
         A3397FacFasCod = GXv_char4[0] ;
         AV21UsurCod = GXv_char3[0] ;
         AV22Station = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A427FacAlbCod, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A428FacAlbTip, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1294FacBarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1295FacBarReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1296FacBarPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A448FacPreKgs, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A449FacPreMts, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3397FacFasCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV21UsurCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV22Station))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_lineas_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_20444( ) ;
      while ( nGXsfl_204_idx <= nRC_GXsfl_204 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1TR44( ) ;
         standaloneModal1TR44( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1TR44( ) ;
         nGXsfl_204_idx = (int)(nGXsfl_204_idx+1) ;
         sGXsfl_204_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_204_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_20444( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_lineasContainer)) ;
      /* End function gxnrGridlevel_lineas_newrow */
   }

   public void init_web_controls( )
   {
      cmbFacEst.setName( "FACEST" );
      cmbFacEst.setWebtags( "" );
      cmbFacEst.addItem("0", httpContext.getMessage( "Pdte. Imp.", ""), (short)(0));
      cmbFacEst.addItem("1", httpContext.getMessage( "Imp.", ""), (short)(0));
      cmbFacEst.addItem("2", httpContext.getMessage( "Act.", ""), (short)(0));
      if ( cmbFacEst.getItemCount() > 0 )
      {
         A435FacEst = (byte)(GXutil.lval( cmbFacEst.getValidValue(GXutil.trim( GXutil.str( A435FacEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A435FacEst", GXutil.str( A435FacEst, 1, 0));
      }
      cmbFacAnulada.setName( "FACANULADA" );
      cmbFacAnulada.setWebtags( "" );
      cmbFacAnulada.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbFacAnulada.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbFacAnulada.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A14226FacAnulada)==0) )
         {
            A14226FacAnulada = httpContext.getMessage( "N", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A14226FacAnulada", A14226FacAnulada);
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

   public void valid_Faccod( )
   {
      n3918FacImpTot1 = false ;
      n7209Colombia = false ;
      /* Using cursor T01TR32 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         A3918FacImpTot1 = T01TR32_A3918FacImpTot1[0] ;
         n3918FacImpTot1 = T01TR32_n3918FacImpTot1[0] ;
      }
      else
      {
         A3918FacImpTot1 = DecimalUtil.doubleToDec(0) ;
         n3918FacImpTot1 = false ;
      }
      pr_default.close(26);
      A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      if ( A7209Colombia == 0 )
      {
         A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
      }
      else
      {
         if ( A7209Colombia == 1 )
         {
            A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
         }
         else
         {
            A440FacImpPP = DecimalUtil.doubleToDec(0) ;
         }
      }
      A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      A14225FacImpEner = GXutil.roundDecimal( A14218FacImpEng1, 2) ;
      A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
      if ( ( AV19FirmaD == 1 ) && true /* After */ && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         GXv_char21[0] = A396EmprCod ;
         GXv_int17[0] = (byte)(0) ;
         GXv_int16[0] = AV16FacCodX ;
         GXv_date15[0] = AV17Facfch ;
         GXv_char20[0] = A450FacPri ;
         new app.pfacrecl(remoteHandle, context).execute( GXv_char21, GXv_int17, GXv_int16, GXv_date15, GXv_char20) ;
         mantenimientofactura_impl.this.A396EmprCod = GXv_char21[0] ;
         A396EmprCod = this.A396EmprCod ;
         mantenimientofactura_impl.this.AV16FacCodX = GXv_int16[0] ;
         AV16FacCodX = this.AV16FacCodX ;
         mantenimientofactura_impl.this.AV17Facfch = GXv_date15[0] ;
         AV17Facfch = this.AV17Facfch ;
         mantenimientofactura_impl.this.A450FacPri = GXv_char20[0] ;
         A450FacPri = this.A450FacPri ;
      }
      if ( ( A435FacEst == 2 ) && ( GXutil.strcmp(GXutil.substring( A7210FacObs, 1, 15), "FACTURA ANULADA") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Factura ANULADA", ""), 1, "FACCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacCod_Internalname ;
      }
      if ( ( GXutil.strcmp(A2739FacSerNum, "VD") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Fatura Venda Dinheiro.Vá para o programa responsável.", ""), 1, "FACCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3918FacImpTot1", GXutil.ltrim( localUtil.ntoc( A3918FacImpTot1, (byte)(13), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3920FacImpPP1", GXutil.ltrim( localUtil.ntoc( A3920FacImpPP1, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A440FacImpPP", GXutil.ltrim( localUtil.ntoc( A440FacImpPP, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14218FacImpEng1", GXutil.ltrim( localUtil.ntoc( A14218FacImpEng1, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14225FacImpEner", GXutil.ltrim( localUtil.ntoc( A14225FacImpEner, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A441FacImpTot", GXutil.ltrim( localUtil.ntoc( A441FacImpTot, (byte)(13), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "AV16FacCodX", GXutil.ltrim( localUtil.ntoc( AV16FacCodX, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV17Facfch", localUtil.format(AV17Facfch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A450FacPri", GXutil.rtrim( A450FacPri));
   }

   public void valid_Clicod( )
   {
      n1360ZonGeoNom = false ;
      /* Using cursor T01TR28 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01TR28_A279CliNom[0] ;
      A858ZonGeoCod = T01TR28_A858ZonGeoCod[0] ;
      pr_default.close(23);
      /* Using cursor T01TR30 */
      pr_default.execute(25, new Object[] {A396EmprCod, Short.valueOf(A858ZonGeoCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ZONGEO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ZONGEOCOD");
         AnyError = (short)(1) ;
      }
      A1360ZonGeoNom = T01TR30_A1360ZonGeoNom[0] ;
      n1360ZonGeoNom = T01TR30_n1360ZonGeoNom[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A858ZonGeoCod", GXutil.ltrim( localUtil.ntoc( A858ZonGeoCod, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1360ZonGeoNom", GXutil.rtrim( A1360ZonGeoNom));
   }

   public void valid_Meivaid( )
   {
      n11629MeivaId = false ;
      n11630MeivaDsc = false ;
      /* Using cursor T01TR27 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n11629MeivaId), A11629MeivaId});
      if ( (pr_default.getStatus(22) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A11629MeivaId)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOTIVOS EXENCION IVA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MEIVAID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMeivaId_Internalname ;
         }
      }
      A11630MeivaDsc = T01TR27_A11630MeivaDsc[0] ;
      n11630MeivaDsc = T01TR27_n11630MeivaDsc[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11630MeivaDsc", A11630MeivaDsc);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV19FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A9605FacFirma',fld:'FACFIRMA',pic:''},{av:'AV56Pgmname',fld:'vPGMNAME',pic:''},{av:'A960FacIVACod',fld:'FACIVACOD',pic:'@!'},{av:'cmbFacEst'},{av:'A435FacEst',fld:'FACEST',pic:'9'},{av:'A445FacLiC',fld:'FACLIC',pic:'ZZ9'},{av:'A965FacCob',fld:'FACCOB',pic:''},{av:'A7211Factrm',fld:'FACTRM',pic:'ZZZZ9.99999'},{av:'A7212FacRect',fld:'FACRECT',pic:'ZZ9.99'},{av:'A9643FacLiq1',fld:'FACLIQ1',pic:'ZZZZZZZZZ9.99999'},{av:'A9644FacLiq2',fld:'FACLIQ2',pic:'ZZZZZZZZZ9.99999'},{av:'A9645FacIva1',fld:'FACIVA1',pic:'ZZZZZZZZZ9.99999'},{av:'A9646FacTot1',fld:'FACTOT1',pic:'ZZZZZZZZZ9.99999'},{av:'A9710FacFirDg',fld:'FACFIRDG',pic:''},{av:'A10417FacCliPgL',fld:'FACCLIPGL',pic:'9'},{av:'A10418FacAran',fld:'FACARAN',pic:''},{av:'A10419FacBrut',fld:'FACBRUT',pic:'ZZZZZZ9.99'},{av:'A10420FacNet',fld:'FACNET',pic:'ZZZZZZ9.99'},{av:'A10421FacInc',fld:'FACINC',pic:''},{av:'A10422FacFre',fld:'FACFRE',pic:''},{av:'A10423FacExp',fld:'FACEXP',pic:''},{av:'A11513FacRecIca',fld:'FACRECICA',pic:'ZZ9.999'},{av:'A12523FacTpFra',fld:'FACTPFRA',pic:''},{av:'A11626FacMan',fld:'FACMAN',pic:''},{av:'A14219FacEnergia',fld:'FACENERGIA',pic:'ZZ9.99'},{av:'A14224FacCostFac',fld:'FACCOSTFAC',pic:'ZZ9.99'},{av:'A14222FacCostMts',fld:'FACCOSTMTS',pic:'ZZZZZZ9.99'},{av:'A14223FacCostKgs',fld:'FACCOSTKGS',pic:'ZZZZZZ9.99'},{av:'A14227FacFecAnul',fld:'FACFECANUL',pic:'99/99/99 99:99'},{av:'A14229FacSFD',fld:'FACSFD',pic:'99/99/99 99:99'},{av:'A14230FacIDATe',fld:'FACIDATE',pic:''},{av:'A14231FacMsgATe',fld:'FACMSGATE',pic:''},{av:'A14232FacIDATc',fld:'FACIDATC',pic:''},{av:'A14233FacMsgATc',fld:'FACMSGATC',pic:''},{av:'A14234FacIDATd',fld:'FACIDATD',pic:''},{av:'A14235FacMsgATd',fld:'FACMSGATD',pic:''},{av:'A14236FacSerAT',fld:'FACSERAT',pic:''},{av:'A14237FacTipAT',fld:'FACTIPAT',pic:''},{av:'A14420FacEnvMail',fld:'FACENVMAIL',pic:'99/99/99 99:99'},{av:'A8346FacRecI',fld:'FACRECI',pic:'ZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e161TR2',iparms:[{av:'AV19FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'A450FacPri',fld:'FACPRI',pic:'9'},{av:'cmbFacEst'},{av:'A435FacEst',fld:'FACEST',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOAGREGARDOCUMENTO'","{handler:'e171TR2',iparms:[{av:'AV19FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'A450FacPri',fld:'FACPRI',pic:'9'},{av:'cmbFacEst'},{av:'A435FacEst',fld:'FACEST',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV45EmpCod',fld:'vEMPCOD',pic:''},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOAGREGARDOCUMENTO'",",oparms:[]}");
      setEventMetadata("'DOELIMINARDOCUMENTO'","{handler:'e111TR43',iparms:[{av:'AV19FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'A450FacPri',fld:'FACPRI',pic:'9'},{av:'cmbFacEst'},{av:'A435FacEst',fld:'FACEST',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A427FacAlbCod',fld:'FACALBCOD',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("'DOELIMINARDOCUMENTO'",",oparms:[{av:'Dvelop_confirmpanel_eliminardocumento_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO.CLOSE","{handler:'e151TR2',iparms:[{av:'Dvelop_confirmpanel_eliminardocumento_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO',prop:'Result'},{av:'AV45EmpCod',fld:'vEMPCOD',pic:''},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'A428FacAlbTip',fld:'FACALBTIP',pic:'9'},{av:'A427FacAlbCod',fld:'FACALBCOD',pic:'ZZZZZZZZZ9'},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO.CLOSE",",oparms:[{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99'},{av:'A427FacAlbCod',fld:'FACALBCOD',pic:'ZZZZZZZZZ9'},{av:'A428FacAlbTip',fld:'FACALBTIP',pic:'9'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV45EmpCod',fld:'vEMPCOD',pic:''}]}");
      setEventMetadata("'DOBUSCARDOCUMENTO'","{handler:'e181TR2',iparms:[{av:'AV19FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'A450FacPri',fld:'FACPRI',pic:'9'},{av:'cmbFacEst'},{av:'A435FacEst',fld:'FACEST',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV45EmpCod',fld:'vEMPCOD',pic:''},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'A427FacAlbCod',fld:'FACALBCOD',pic:'ZZZZZZZZZ9'},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99'},{av:'A428FacAlbTip',fld:'FACALBTIP',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOBUSCARDOCUMENTO'",",oparms:[]}");
      setEventMetadata("'DOVENCIMIENTOS'","{handler:'e121TR43',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOVENCIMIENTOS'",",oparms:[]}");
      setEventMetadata("'DOREPRESENTANTES_DIVISAS'","{handler:'e131TR43',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOREPRESENTANTES_DIVISAS'",",oparms:[]}");
      setEventMetadata("VALID_FACCOD","{handler:'valid_Faccod',iparms:[{av:'AV19FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'A450FacPri',fld:'FACPRI',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'A3918FacImpTot1',fld:'FACIMPTOT1',pic:'ZZZZZZZZZ9.99'},{av:'A434FacDtoPP',fld:'FACDTOPP',pic:'Z9.99'},{av:'A3920FacImpPP1',fld:'FACIMPPP1',pic:'ZZZZZZZ9.999'},{av:'A7209Colombia',fld:'COLOMBIA',pic:'9'},{av:'A14219FacEnergia',fld:'FACENERGIA',pic:'ZZ9.99'},{av:'A14218FacImpEng1',fld:'FACIMPENG1',pic:'ZZZZZZZ9.999'},{av:'A440FacImpPP',fld:'FACIMPPP',pic:'ZZZZZZZ9.99'},{av:'A14225FacImpEner',fld:'FACIMPENER',pic:'ZZZZZZZ9.999'},{av:'A441FacImpTot',fld:'FACIMPTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV17Facfch',fld:'vFACFCH',pic:''},{av:'AV16FacCodX',fld:'vFACCODX',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_FACCOD",",oparms:[{av:'A3918FacImpTot1',fld:'FACIMPTOT1',pic:'ZZZZZZZZZ9.99'},{av:'A3920FacImpPP1',fld:'FACIMPPP1',pic:'ZZZZZZZ9.999'},{av:'A440FacImpPP',fld:'FACIMPPP',pic:'ZZZZZZZ9.99'},{av:'A14218FacImpEng1',fld:'FACIMPENG1',pic:'ZZZZZZZ9.999'},{av:'A14225FacImpEner',fld:'FACIMPENER',pic:'ZZZZZZZ9.999'},{av:'A441FacImpTot',fld:'FACIMPTOT',pic:'ZZZZZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV16FacCodX',fld:'vFACCODX',pic:'ZZZZZZZ9'},{av:'AV17Facfch',fld:'vFACFCH',pic:''},{av:'A450FacPri',fld:'FACPRI',pic:'9'}]}");
      setEventMetadata("VALID_FACFCH","{handler:'valid_Facfch',iparms:[]");
      setEventMetadata("VALID_FACFCH",",oparms:[]}");
      setEventMetadata("VALID_FACEST","{handler:'valid_Facest',iparms:[]");
      setEventMetadata("VALID_FACEST",",oparms:[]}");
      setEventMetadata("VALID_FACANULADA","{handler:'valid_Facanulada',iparms:[]");
      setEventMetadata("VALID_FACANULADA",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A858ZonGeoCod',fld:'ZONGEOCOD',pic:'ZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A1360ZonGeoNom',fld:'ZONGEONOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A858ZonGeoCod',fld:'ZONGEOCOD',pic:'ZZ9'},{av:'A1360ZonGeoNom',fld:'ZONGEONOM',pic:''}]}");
      setEventMetadata("VALID_MEIVAID","{handler:'valid_Meivaid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11629MeivaId',fld:'MEIVAID',pic:''},{av:'A11630MeivaDsc',fld:'MEIVADSC',pic:''}]");
      setEventMetadata("VALID_MEIVAID",",oparms:[{av:'A11630MeivaDsc',fld:'MEIVADSC',pic:''}]}");
      setEventMetadata("VALID_FACNUMVTO","{handler:'valid_Facnumvto',iparms:[]");
      setEventMetadata("VALID_FACNUMVTO",",oparms:[]}");
      setEventMetadata("VALID_FACPER","{handler:'valid_Facper',iparms:[]");
      setEventMetadata("VALID_FACPER",",oparms:[]}");
      setEventMetadata("VALID_FACDIAPAG","{handler:'valid_Facdiapag',iparms:[]");
      setEventMetadata("VALID_FACDIAPAG",",oparms:[]}");
      setEventMetadata("VALID_FACFPG","{handler:'valid_Facfpg',iparms:[]");
      setEventMetadata("VALID_FACFPG",",oparms:[]}");
      setEventMetadata("VALID_FACOBS","{handler:'valid_Facobs',iparms:[]");
      setEventMetadata("VALID_FACOBS",",oparms:[]}");
      setEventMetadata("VALID_FACIMPTOT","{handler:'valid_Facimptot',iparms:[]");
      setEventMetadata("VALID_FACIMPTOT",",oparms:[]}");
      setEventMetadata("VALID_FACDTOGEN","{handler:'valid_Facdtogen',iparms:[]");
      setEventMetadata("VALID_FACDTOGEN",",oparms:[]}");
      setEventMetadata("VALID_FACIMPGEN","{handler:'valid_Facimpgen',iparms:[]");
      setEventMetadata("VALID_FACIMPGEN",",oparms:[]}");
      setEventMetadata("VALID_FACIMPPP","{handler:'valid_Facimppp',iparms:[]");
      setEventMetadata("VALID_FACIMPPP",",oparms:[]}");
      setEventMetadata("VALID_FACBASIMP","{handler:'valid_Facbasimp',iparms:[]");
      setEventMetadata("VALID_FACBASIMP",",oparms:[]}");
      setEventMetadata("VALID_FACIVAPOR","{handler:'valid_Facivapor',iparms:[]");
      setEventMetadata("VALID_FACIVAPOR",",oparms:[]}");
      setEventMetadata("VALID_FACIVAIMP","{handler:'valid_Facivaimp',iparms:[]");
      setEventMetadata("VALID_FACIVAIMP",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOMEIVAID","{handler:'validv_Combomeivaid',iparms:[]");
      setEventMetadata("VALIDV_COMBOMEIVAID",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOFACFPG","{handler:'validv_Combofacfpg',iparms:[]");
      setEventMetadata("VALIDV_COMBOFACFPG",",oparms:[]}");
      setEventMetadata("VALID_FACPRI","{handler:'valid_Facpri',iparms:[]");
      setEventMetadata("VALID_FACPRI",",oparms:[]}");
      setEventMetadata("VALID_FACLIN","{handler:'valid_Faclin',iparms:[]");
      setEventMetadata("VALID_FACLIN",",oparms:[]}");
      setEventMetadata("VALID_FACALBCOD","{handler:'valid_Facalbcod',iparms:[]");
      setEventMetadata("VALID_FACALBCOD",",oparms:[]}");
      setEventMetadata("VALID_FACALBTIP","{handler:'valid_Facalbtip',iparms:[]");
      setEventMetadata("VALID_FACALBTIP",",oparms:[]}");
      setEventMetadata("VALID_FACMTS","{handler:'valid_Facmts',iparms:[]");
      setEventMetadata("VALID_FACMTS",",oparms:[]}");
      setEventMetadata("VALID_FACPREMTS","{handler:'valid_Facpremts',iparms:[]");
      setEventMetadata("VALID_FACPREMTS",",oparms:[]}");
      setEventMetadata("VALID_FACKGS","{handler:'valid_Fackgs',iparms:[]");
      setEventMetadata("VALID_FACKGS",",oparms:[]}");
      setEventMetadata("VALID_FACPREKGS","{handler:'valid_Facprekgs',iparms:[]");
      setEventMetadata("VALID_FACPREKGS",",oparms:[]}");
      setEventMetadata("VALID_FACUNDS","{handler:'valid_Facunds',iparms:[]");
      setEventMetadata("VALID_FACUNDS",",oparms:[]}");
      setEventMetadata("VALID_FACPREUND","{handler:'valid_Facpreund',iparms:[]");
      setEventMetadata("VALID_FACPREUND",",oparms:[]}");
      setEventMetadata("VALID_FACIMP","{handler:'valid_Facimp',iparms:[]");
      setEventMetadata("VALID_FACIMP",",oparms:[]}");
      setEventMetadata("VALID_FACBARCOD","{handler:'valid_Facbarcod',iparms:[]");
      setEventMetadata("VALID_FACBARCOD",",oparms:[]}");
      setEventMetadata("VALID_FACBARREO","{handler:'valid_Facbarreo',iparms:[]");
      setEventMetadata("VALID_FACBARREO",",oparms:[]}");
      setEventMetadata("VALID_FACBARPAR","{handler:'valid_Facbarpar',iparms:[]");
      setEventMetadata("VALID_FACBARPAR",",oparms:[]}");
      setEventMetadata("VALID_FACFASCOD","{handler:'valid_Facfascod',iparms:[]");
      setEventMetadata("VALID_FACFASCOD",",oparms:[]}");
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
      pr_default.close(22);
      pr_default.close(23);
      pr_default.close(24);
      pr_default.close(25);
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      Z396EmprCod = "" ;
      Z437FacFpg = "" ;
      Z436FacFch = GXutil.nullDate() ;
      Z450FacPri = "" ;
      Z433FacDtoGen = DecimalUtil.ZERO ;
      Z434FacDtoPP = DecimalUtil.ZERO ;
      Z960FacIVACod = "" ;
      Z453FacRECPor = DecimalUtil.ZERO ;
      Z965FacCob = "" ;
      Z1151FacPer = "" ;
      Z1152FacDiaPag = "" ;
      Z2739FacSerNum = "" ;
      Z6632FacDto = DecimalUtil.ZERO ;
      Z7211Factrm = DecimalUtil.ZERO ;
      Z7212FacRect = DecimalUtil.ZERO ;
      Z9605FacFirma = "" ;
      Z9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      Z9643FacLiq1 = DecimalUtil.ZERO ;
      Z9644FacLiq2 = DecimalUtil.ZERO ;
      Z9645FacIva1 = DecimalUtil.ZERO ;
      Z9646FacTot1 = DecimalUtil.ZERO ;
      Z9710FacFirDg = "" ;
      Z10418FacAran = "" ;
      Z10419FacBrut = DecimalUtil.ZERO ;
      Z10420FacNet = DecimalUtil.ZERO ;
      Z10421FacInc = "" ;
      Z10422FacFre = "" ;
      Z10423FacExp = "" ;
      Z11513FacRecIca = DecimalUtil.ZERO ;
      Z12523FacTpFra = "" ;
      Z11626FacMan = "" ;
      Z14219FacEnergia = DecimalUtil.ZERO ;
      Z14224FacCostFac = DecimalUtil.ZERO ;
      Z14222FacCostMts = DecimalUtil.ZERO ;
      Z14223FacCostKgs = DecimalUtil.ZERO ;
      Z14226FacAnulada = "" ;
      Z14227FacFecAnul = GXutil.resetTime( GXutil.nullDate() );
      Z14229FacSFD = GXutil.resetTime( GXutil.nullDate() );
      Z14230FacIDATe = "" ;
      Z14231FacMsgATe = "" ;
      Z14232FacIDATc = "" ;
      Z14233FacMsgATc = "" ;
      Z14234FacIDATd = "" ;
      Z14235FacMsgATd = "" ;
      Z14236FacSerAT = "" ;
      Z14237FacTipAT = "" ;
      Z11273FacObs2 = "" ;
      Z14420FacEnvMail = GXutil.resetTime( GXutil.nullDate() );
      Z8346FacRecI = DecimalUtil.ZERO ;
      Z11629MeivaId = "" ;
      Z14217MotAnuID = "" ;
      O3918FacImpTot1 = DecimalUtil.ZERO ;
      O1151FacPer = "" ;
      O1152FacDiaPag = "" ;
      O437FacFpg = "" ;
      O434FacDtoPP = DecimalUtil.ZERO ;
      O433FacDtoGen = DecimalUtil.ZERO ;
      O453FacRECPor = DecimalUtil.ZERO ;
      O14224FacCostFac = DecimalUtil.ZERO ;
      N14217MotAnuID = "" ;
      N11629MeivaId = "" ;
      N436FacFch = GXutil.nullDate() ;
      N433FacDtoGen = DecimalUtil.ZERO ;
      N434FacDtoPP = DecimalUtil.ZERO ;
      N453FacRECPor = DecimalUtil.ZERO ;
      N2739FacSerNum = "" ;
      N450FacPri = "" ;
      N437FacFpg = "" ;
      N1151FacPer = "" ;
      N1152FacDiaPag = "" ;
      N9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      Dvelop_confirmpanel_eliminardocumento_Result = "" ;
      Combo_facfpg_Selectedvalue_get = "" ;
      Combo_meivaid_Selectedvalue_get = "" ;
      Z5050FacBonLi = DecimalUtil.ZERO ;
      Z1296FacBarPar = "" ;
      Z454FacSer = "" ;
      Z432FacDsc = "" ;
      Z1498FacDisNum = "" ;
      Z447FacMts = DecimalUtil.ZERO ;
      Z449FacPreMts = DecimalUtil.ZERO ;
      Z444FacKgs = DecimalUtil.ZERO ;
      Z448FacPreKgs = DecimalUtil.ZERO ;
      Z451FacRec = DecimalUtil.ZERO ;
      Z3097FacTipPro = "" ;
      Z3397FacFasCod = "" ;
      Z3878FacColNom = "" ;
      Z3881FacNomCol = "" ;
      Z3884FacProCod = "" ;
      Z4389FacDsc2 = "" ;
      Z4814FacEncCli = "" ;
      Z5172FacDishCod = "" ;
      Z5353FacImpMan = DecimalUtil.ZERO ;
      Z5355FacImpMin = DecimalUtil.ZERO ;
      Z3898FacPreKgsA = DecimalUtil.ZERO ;
      Z6837FacCosPQ = DecimalUtil.ZERO ;
      Z9647FacImpdto = DecimalUtil.ZERO ;
      Z9648FacDtoL = DecimalUtil.ZERO ;
      Z9649FacPKDto = DecimalUtil.ZERO ;
      Z9650FacPMdto = DecimalUtil.ZERO ;
      Z9651FacImpd = DecimalUtil.ZERO ;
      Z9708FacDscII = "" ;
      Z10271FacAcs = "" ;
      Z3897FacKgsA = DecimalUtil.ZERO ;
      Z3899FacFecAlb = GXutil.nullDate() ;
      Z12198FacPreUnd = DecimalUtil.ZERO ;
      Z14238FacLinTRM = DecimalUtil.ZERO ;
      Z14239FACLinTRMF = GXutil.resetTime( GXutil.nullDate() );
      O438FacImp = DecimalUtil.ZERO ;
      O448FacPreKgs = DecimalUtil.ZERO ;
      O449FacPreMts = DecimalUtil.ZERO ;
      N5353FacImpMan = DecimalUtil.ZERO ;
      N432FacDsc = "" ;
      N5355FacImpMin = DecimalUtil.ZERO ;
      N447FacMts = DecimalUtil.ZERO ;
      N449FacPreMts = DecimalUtil.ZERO ;
      N444FacKgs = DecimalUtil.ZERO ;
      N448FacPreKgs = DecimalUtil.ZERO ;
      N5050FacBonLi = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A450FacPri = "" ;
      A1151FacPer = "" ;
      A1152FacDiaPag = "" ;
      A437FacFpg = "" ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      AV17Facfch = GXutil.nullDate() ;
      A444FacKgs = DecimalUtil.ZERO ;
      A1296FacBarPar = "" ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A3397FacFasCod = "" ;
      AV21UsurCod = "" ;
      AV22Station = "" ;
      AV7EmprCod = "" ;
      A11629MeivaId = "" ;
      A14217MotAnuID = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A14226FacAnulada = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A436FacFch = GXutil.nullDate() ;
      A9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      A2739FacSerNum = "" ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      A279CliNom = "" ;
      lblTextblockmeivaid_Jsonclick = "" ;
      ucCombo_meivaid = new com.genexus.webpanels.GXUserControl();
      Combo_meivaid_Caption = "" ;
      AV40MeivaId_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      lblTextblockfacfpg_Jsonclick = "" ;
      ucCombo_facfpg = new com.genexus.webpanels.GXUserControl();
      Combo_facfpg_Caption = "" ;
      AV43FacFpg_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucDvpanel_unnamedtable6 = new com.genexus.webpanels.GXUserControl();
      A7210FacObs = "" ;
      A11273FacObs2 = "" ;
      ucDvpanel_unnamedtable7 = new com.genexus.webpanels.GXUserControl();
      A441FacImpTot = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A6632FacDto = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable8 = new com.genexus.webpanels.GXUserControl();
      A9605FacFirma = "" ;
      AV36Texto_fd = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtnagregardocumento_Jsonclick = "" ;
      bttBtneliminardocumento_Jsonclick = "" ;
      bttBtnbuscardocumento_Jsonclick = "" ;
      bttBtnvencimientos_Jsonclick = "" ;
      bttBtnrepresentantes_divisas_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      AV56Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV42ComboMeivaId = "" ;
      AV44ComboFacFpg = "" ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_eliminardocumento = new com.genexus.webpanels.GXUserControl();
      Gridlevel_lineasContainer = new com.genexus.webpanels.GXWebGrid(context);
      B3918FacImpTot1 = DecimalUtil.ZERO ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      B1151FacPer = "" ;
      B1152FacDiaPag = "" ;
      B437FacFpg = "" ;
      B434FacDtoPP = DecimalUtil.ZERO ;
      B433FacDtoGen = DecimalUtil.ZERO ;
      B453FacRECPor = DecimalUtil.ZERO ;
      B14224FacCostFac = DecimalUtil.ZERO ;
      sMode44 = "" ;
      A960FacIVACod = "" ;
      A965FacCob = "" ;
      A7211Factrm = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A9643FacLiq1 = DecimalUtil.ZERO ;
      A9644FacLiq2 = DecimalUtil.ZERO ;
      A9645FacIva1 = DecimalUtil.ZERO ;
      A9646FacTot1 = DecimalUtil.ZERO ;
      A9710FacFirDg = "" ;
      A10418FacAran = "" ;
      A10419FacBrut = DecimalUtil.ZERO ;
      A10420FacNet = DecimalUtil.ZERO ;
      A10421FacInc = "" ;
      A10422FacFre = "" ;
      A10423FacExp = "" ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A12523FacTpFra = "" ;
      A11626FacMan = "" ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14227FacFecAnul = GXutil.resetTime( GXutil.nullDate() );
      A14229FacSFD = GXutil.resetTime( GXutil.nullDate() );
      A14230FacIDATe = "" ;
      A14231FacMsgATe = "" ;
      A14232FacIDATc = "" ;
      A14233FacMsgATc = "" ;
      A14234FacIDATd = "" ;
      A14235FacMsgATd = "" ;
      A14236FacSerAT = "" ;
      A14237FacTipAT = "" ;
      A14420FacEnvMail = GXutil.resetTime( GXutil.nullDate() );
      A8346FacRecI = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A7215FacImpRet2 = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A14225FacImpEner = DecimalUtil.ZERO ;
      AV13Insert_MotAnuID = "" ;
      AV14Insert_MeivaId = "" ;
      A407EmprNom = "" ;
      A953IvaCod = "" ;
      A11630MeivaDsc = "" ;
      A14228MotAnuDc = "" ;
      A1360ZonGeoNom = "" ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      A2239FacIml = DecimalUtil.ZERO ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A3923FacImp1 = DecimalUtil.ZERO ;
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      A3897FacKgsA = DecimalUtil.ZERO ;
      A1498FacDisNum = "" ;
      A3097FacTipPro = "" ;
      A3878FacColNom = "" ;
      A3881FacNomCol = "" ;
      A3884FacProCod = "" ;
      A4389FacDsc2 = "" ;
      A4814FacEncCli = "" ;
      A5172FacDishCod = "" ;
      A6837FacCosPQ = DecimalUtil.ZERO ;
      A9647FacImpdto = DecimalUtil.ZERO ;
      A9648FacDtoL = DecimalUtil.ZERO ;
      A9649FacPKDto = DecimalUtil.ZERO ;
      A9650FacPMdto = DecimalUtil.ZERO ;
      A9651FacImpd = DecimalUtil.ZERO ;
      A9708FacDscII = "" ;
      A10271FacAcs = "" ;
      A3899FacFecAlb = GXutil.nullDate() ;
      A14238FacLinTRM = DecimalUtil.ZERO ;
      A14239FACLinTRMF = GXutil.resetTime( GXutil.nullDate() );
      Combo_meivaid_Objectcall = "" ;
      Combo_meivaid_Class = "" ;
      Combo_meivaid_Icontype = "" ;
      Combo_meivaid_Icon = "" ;
      Combo_meivaid_Tooltip = "" ;
      Combo_meivaid_Selectedvalue_set = "" ;
      Combo_meivaid_Selectedtext_set = "" ;
      Combo_meivaid_Selectedtext_get = "" ;
      Combo_meivaid_Gamoauthtoken = "" ;
      Combo_meivaid_Ddointernalname = "" ;
      Combo_meivaid_Titlecontrolalign = "" ;
      Combo_meivaid_Dropdownoptionstype = "" ;
      Combo_meivaid_Titlecontrolidtoreplace = "" ;
      Combo_meivaid_Datalisttype = "" ;
      Combo_meivaid_Datalistfixedvalues = "" ;
      Combo_meivaid_Datalistproc = "" ;
      Combo_meivaid_Datalistprocparametersprefix = "" ;
      Combo_meivaid_Remoteservicesparameters = "" ;
      Combo_meivaid_Htmltemplate = "" ;
      Combo_meivaid_Multiplevaluestype = "" ;
      Combo_meivaid_Loadingdata = "" ;
      Combo_meivaid_Noresultsfound = "" ;
      Combo_meivaid_Onlyselectedvalues = "" ;
      Combo_meivaid_Selectalltext = "" ;
      Combo_meivaid_Multiplevaluesseparator = "" ;
      Combo_meivaid_Addnewoptiontext = "" ;
      Dvpanel_unnamedtable4_Objectcall = "" ;
      Dvpanel_unnamedtable4_Class = "" ;
      Dvpanel_unnamedtable4_Height = "" ;
      Combo_facfpg_Objectcall = "" ;
      Combo_facfpg_Class = "" ;
      Combo_facfpg_Icontype = "" ;
      Combo_facfpg_Icon = "" ;
      Combo_facfpg_Tooltip = "" ;
      Combo_facfpg_Selectedvalue_set = "" ;
      Combo_facfpg_Selectedtext_set = "" ;
      Combo_facfpg_Selectedtext_get = "" ;
      Combo_facfpg_Gamoauthtoken = "" ;
      Combo_facfpg_Ddointernalname = "" ;
      Combo_facfpg_Titlecontrolalign = "" ;
      Combo_facfpg_Dropdownoptionstype = "" ;
      Combo_facfpg_Titlecontrolidtoreplace = "" ;
      Combo_facfpg_Datalisttype = "" ;
      Combo_facfpg_Datalistfixedvalues = "" ;
      Combo_facfpg_Datalistproc = "" ;
      Combo_facfpg_Datalistprocparametersprefix = "" ;
      Combo_facfpg_Remoteservicesparameters = "" ;
      Combo_facfpg_Htmltemplate = "" ;
      Combo_facfpg_Multiplevaluestype = "" ;
      Combo_facfpg_Loadingdata = "" ;
      Combo_facfpg_Noresultsfound = "" ;
      Combo_facfpg_Onlyselectedvalues = "" ;
      Combo_facfpg_Selectalltext = "" ;
      Combo_facfpg_Multiplevaluesseparator = "" ;
      Combo_facfpg_Addnewoptiontext = "" ;
      Dvpanel_unnamedtable5_Objectcall = "" ;
      Dvpanel_unnamedtable5_Class = "" ;
      Dvpanel_unnamedtable5_Height = "" ;
      Dvpanel_unnamedtable6_Objectcall = "" ;
      Dvpanel_unnamedtable6_Class = "" ;
      Dvpanel_unnamedtable6_Height = "" ;
      Dvpanel_unnamedtable7_Objectcall = "" ;
      Dvpanel_unnamedtable7_Class = "" ;
      Dvpanel_unnamedtable7_Height = "" ;
      Dvpanel_unnamedtable8_Objectcall = "" ;
      Dvpanel_unnamedtable8_Class = "" ;
      Dvpanel_unnamedtable8_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Dvelop_confirmpanel_eliminardocumento_Objectcall = "" ;
      Dvelop_confirmpanel_eliminardocumento_Width = "" ;
      Dvelop_confirmpanel_eliminardocumento_Height = "" ;
      Dvelop_confirmpanel_eliminardocumento_Class = "" ;
      Dvelop_confirmpanel_eliminardocumento_Comment = "" ;
      Dvelop_confirmpanel_eliminardocumento_Bodytype = "" ;
      Dvelop_confirmpanel_eliminardocumento_Bodycontentinternalname = "" ;
      Dvelop_confirmpanel_eliminardocumento_Texttype = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode43 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s3918FacImpTot1 = DecimalUtil.ZERO ;
      s14225FacImpEner = DecimalUtil.ZERO ;
      O14225FacImpEner = DecimalUtil.ZERO ;
      s440FacImpPP = DecimalUtil.ZERO ;
      O440FacImpPP = DecimalUtil.ZERO ;
      s439FacImpGen = DecimalUtil.ZERO ;
      O439FacImpGen = DecimalUtil.ZERO ;
      s11515FacImpIca = DecimalUtil.ZERO ;
      O11515FacImpIca = DecimalUtil.ZERO ;
      s7213FacImpRet = DecimalUtil.ZERO ;
      O7213FacImpRet = DecimalUtil.ZERO ;
      s452FacRecImp = DecimalUtil.ZERO ;
      O452FacRecImp = DecimalUtil.ZERO ;
      s8347FacImpReI = DecimalUtil.ZERO ;
      O8347FacImpReI = DecimalUtil.ZERO ;
      s8348FacImpReI1 = DecimalUtil.ZERO ;
      O8348FacImpReI1 = DecimalUtil.ZERO ;
      s442FacIVAImp = DecimalUtil.ZERO ;
      O442FacIVAImp = DecimalUtil.ZERO ;
      s455FacTot = DecimalUtil.ZERO ;
      O455FacTot = DecimalUtil.ZERO ;
      s3921FacIvaImp1 = DecimalUtil.ZERO ;
      O3921FacIvaImp1 = DecimalUtil.ZERO ;
      s3922FacRecImp1 = DecimalUtil.ZERO ;
      O3922FacRecImp1 = DecimalUtil.ZERO ;
      s7214FacImpRet1 = DecimalUtil.ZERO ;
      O7214FacImpRet1 = DecimalUtil.ZERO ;
      s11514FacImpIca1 = DecimalUtil.ZERO ;
      O11514FacImpIca1 = DecimalUtil.ZERO ;
      s429FacBasImp = DecimalUtil.ZERO ;
      O429FacBasImp = DecimalUtil.ZERO ;
      s7215FacImpRet2 = DecimalUtil.ZERO ;
      O7215FacImpRet2 = DecimalUtil.ZERO ;
      s441FacImpTot = DecimalUtil.ZERO ;
      O441FacImpTot = DecimalUtil.ZERO ;
      s3919FacImpGen1 = DecimalUtil.ZERO ;
      O3919FacImpGen1 = DecimalUtil.ZERO ;
      s3920FacImpPP1 = DecimalUtil.ZERO ;
      O3920FacImpPP1 = DecimalUtil.ZERO ;
      s14218FacImpEng1 = DecimalUtil.ZERO ;
      O14218FacImpEng1 = DecimalUtil.ZERO ;
      A14247FacNHdr = "" ;
      A447FacMts = DecimalUtil.ZERO ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A451FacRec = DecimalUtil.ZERO ;
      A5050FacBonLi = DecimalUtil.ZERO ;
      A438FacImp = DecimalUtil.ZERO ;
      A454FacSer = "" ;
      A432FacDsc = "" ;
      T438FacImp = DecimalUtil.ZERO ;
      T448FacPreKgs = DecimalUtil.ZERO ;
      T449FacPreMts = DecimalUtil.ZERO ;
      AV53EmprNom = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV15TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV27ValEuro = DecimalUtil.ZERO ;
      AV34ContDsc = "" ;
      GXt_char1 = "" ;
      AV47Cadena = "" ;
      AV48firma = "" ;
      AV49Hash = "" ;
      AV50Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message9 = new GXBaseCollection[1] ;
      GXv_boolean10 = new boolean[1] ;
      AV52Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV45EmpCod = "" ;
      GXv_dtime12 = new java.util.Date[1] ;
      AV41ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item13 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item14 = new GXBaseCollection[1] ;
      Z7210FacObs = "" ;
      Z407EmprNom = "" ;
      Z953IvaCod = "" ;
      Z279CliNom = "" ;
      Z14228MotAnuDc = "" ;
      Z1360ZonGeoNom = "" ;
      Z3918FacImpTot1 = DecimalUtil.ZERO ;
      Z11630MeivaDsc = "" ;
      T01TR6_A407EmprNom = new String[] {""} ;
      T01TR6_n407EmprNom = new boolean[] {false} ;
      T01TR6_A7209Colombia = new byte[1] ;
      T01TR6_n7209Colombia = new boolean[] {false} ;
      T01TR6_A953IvaCod = new String[] {""} ;
      T01TR6_n953IvaCod = new boolean[] {false} ;
      T01TR12_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR12_n3918FacImpTot1 = new boolean[] {false} ;
      T01TR9_A14228MotAnuDc = new String[] {""} ;
      T01TR8_A279CliNom = new String[] {""} ;
      T01TR8_A858ZonGeoCod = new short[1] ;
      T01TR10_A1360ZonGeoNom = new String[] {""} ;
      T01TR10_n1360ZonGeoNom = new boolean[] {false} ;
      T01TR7_A11630MeivaDsc = new String[] {""} ;
      T01TR7_n11630MeivaDsc = new boolean[] {false} ;
      T01TR14_A7210FacObs = new String[] {""} ;
      T01TR14_A430FacCod = new int[1] ;
      T01TR14_A437FacFpg = new String[] {""} ;
      T01TR14_A407EmprNom = new String[] {""} ;
      T01TR14_n407EmprNom = new boolean[] {false} ;
      T01TR14_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR14_A450FacPri = new String[] {""} ;
      T01TR14_A279CliNom = new String[] {""} ;
      T01TR14_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR14_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR14_A960FacIVACod = new String[] {""} ;
      T01TR14_A443FacIVAPor = new byte[1] ;
      T01TR14_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR14_A435FacEst = new byte[1] ;
      T01TR14_A445FacLiC = new int[1] ;
      T01TR14_A965FacCob = new String[] {""} ;
      T01TR14_A1150FacNumVto = new byte[1] ;
      T01TR14_A1151FacPer = new String[] {""} ;
      T01TR14_A1152FacDiaPag = new String[] {""} ;
      T01TR14_A1153FacTipFac = new byte[1] ;
      T01TR14_A2739FacSerNum = new String[] {""} ;
      T01TR14_A6632FacDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR14_A7211Factrm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR14_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR14_A9605FacFirma = new String[] {""} ;
      T01TR14_A9606FacHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR14_A9643FacLiq1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR14_A9644FacLiq2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR14_A9645FacIva1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR14_A9646FacTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR14_A1360ZonGeoNom = new String[] {""} ;
      T01TR14_n1360ZonGeoNom = new boolean[] {false} ;
      T01TR14_A9710FacFirDg = new String[] {""} ;
      T01TR14_A10417FacCliPgL = new byte[1] ;
      T01TR14_A10418FacAran = new String[] {""} ;
      T01TR14_A10419FacBrut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR14_A10420FacNet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR14_A10421FacInc = new String[] {""} ;
      T01TR14_A10422FacFre = new String[] {""} ;
      T01TR14_A10423FacExp = new String[] {""} ;
      T01TR14_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR14_A12523FacTpFra = new String[] {""} ;
      T01TR14_A11626FacMan = new String[] {""} ;
      T01TR14_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR14_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR14_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR14_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR14_A14226FacAnulada = new String[] {""} ;
      T01TR14_A14227FacFecAnul = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR14_A14228MotAnuDc = new String[] {""} ;
      T01TR14_A11630MeivaDsc = new String[] {""} ;
      T01TR14_n11630MeivaDsc = new boolean[] {false} ;
      T01TR14_A14229FacSFD = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR14_A14230FacIDATe = new String[] {""} ;
      T01TR14_A14231FacMsgATe = new String[] {""} ;
      T01TR14_A14232FacIDATc = new String[] {""} ;
      T01TR14_A14233FacMsgATc = new String[] {""} ;
      T01TR14_A14234FacIDATd = new String[] {""} ;
      T01TR14_A14235FacMsgATd = new String[] {""} ;
      T01TR14_A14236FacSerAT = new String[] {""} ;
      T01TR14_A14237FacTipAT = new String[] {""} ;
      T01TR14_A11273FacObs2 = new String[] {""} ;
      T01TR14_A14420FacEnvMail = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR14_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR14_n8346FacRecI = new boolean[] {false} ;
      T01TR14_A7209Colombia = new byte[1] ;
      T01TR14_n7209Colombia = new boolean[] {false} ;
      T01TR14_A396EmprCod = new String[] {""} ;
      T01TR14_A252CliCod = new int[1] ;
      T01TR14_A11629MeivaId = new String[] {""} ;
      T01TR14_n11629MeivaId = new boolean[] {false} ;
      T01TR14_A14217MotAnuID = new String[] {""} ;
      T01TR14_n14217MotAnuID = new boolean[] {false} ;
      T01TR14_A953IvaCod = new String[] {""} ;
      T01TR14_n953IvaCod = new boolean[] {false} ;
      T01TR14_A858ZonGeoCod = new short[1] ;
      T01TR14_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR14_n3918FacImpTot1 = new boolean[] {false} ;
      T01TR15_A11630MeivaDsc = new String[] {""} ;
      T01TR15_n11630MeivaDsc = new boolean[] {false} ;
      T01TR16_A279CliNom = new String[] {""} ;
      T01TR16_A858ZonGeoCod = new short[1] ;
      T01TR17_A14228MotAnuDc = new String[] {""} ;
      T01TR18_A1360ZonGeoNom = new String[] {""} ;
      T01TR18_n1360ZonGeoNom = new boolean[] {false} ;
      T01TR20_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR20_n3918FacImpTot1 = new boolean[] {false} ;
      T01TR21_A396EmprCod = new String[] {""} ;
      T01TR21_A430FacCod = new int[1] ;
      T01TR5_A7210FacObs = new String[] {""} ;
      T01TR5_A430FacCod = new int[1] ;
      T01TR5_A437FacFpg = new String[] {""} ;
      T01TR5_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR5_A450FacPri = new String[] {""} ;
      T01TR5_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR5_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR5_A960FacIVACod = new String[] {""} ;
      T01TR5_A443FacIVAPor = new byte[1] ;
      T01TR5_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR5_A435FacEst = new byte[1] ;
      T01TR5_A445FacLiC = new int[1] ;
      T01TR5_A965FacCob = new String[] {""} ;
      T01TR5_A1150FacNumVto = new byte[1] ;
      T01TR5_A1151FacPer = new String[] {""} ;
      T01TR5_A1152FacDiaPag = new String[] {""} ;
      T01TR5_A1153FacTipFac = new byte[1] ;
      T01TR5_A2739FacSerNum = new String[] {""} ;
      T01TR5_A6632FacDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR5_A7211Factrm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR5_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR5_A9605FacFirma = new String[] {""} ;
      T01TR5_A9606FacHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR5_A9643FacLiq1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR5_A9644FacLiq2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR5_A9645FacIva1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR5_A9646FacTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR5_A9710FacFirDg = new String[] {""} ;
      T01TR5_A10417FacCliPgL = new byte[1] ;
      T01TR5_A10418FacAran = new String[] {""} ;
      T01TR5_A10419FacBrut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR5_A10420FacNet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR5_A10421FacInc = new String[] {""} ;
      T01TR5_A10422FacFre = new String[] {""} ;
      T01TR5_A10423FacExp = new String[] {""} ;
      T01TR5_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR5_A12523FacTpFra = new String[] {""} ;
      T01TR5_A11626FacMan = new String[] {""} ;
      T01TR5_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR5_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR5_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR5_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR5_A14226FacAnulada = new String[] {""} ;
      T01TR5_A14227FacFecAnul = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR5_A14229FacSFD = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR5_A14230FacIDATe = new String[] {""} ;
      T01TR5_A14231FacMsgATe = new String[] {""} ;
      T01TR5_A14232FacIDATc = new String[] {""} ;
      T01TR5_A14233FacMsgATc = new String[] {""} ;
      T01TR5_A14234FacIDATd = new String[] {""} ;
      T01TR5_A14235FacMsgATd = new String[] {""} ;
      T01TR5_A14236FacSerAT = new String[] {""} ;
      T01TR5_A14237FacTipAT = new String[] {""} ;
      T01TR5_A11273FacObs2 = new String[] {""} ;
      T01TR5_A14420FacEnvMail = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR5_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR5_n8346FacRecI = new boolean[] {false} ;
      T01TR5_A396EmprCod = new String[] {""} ;
      T01TR5_A252CliCod = new int[1] ;
      T01TR5_A11629MeivaId = new String[] {""} ;
      T01TR5_n11629MeivaId = new boolean[] {false} ;
      T01TR5_A14217MotAnuID = new String[] {""} ;
      T01TR5_n14217MotAnuID = new boolean[] {false} ;
      T01TR22_A396EmprCod = new String[] {""} ;
      T01TR22_A430FacCod = new int[1] ;
      T01TR23_A396EmprCod = new String[] {""} ;
      T01TR23_A430FacCod = new int[1] ;
      T01TR4_A7210FacObs = new String[] {""} ;
      T01TR4_A430FacCod = new int[1] ;
      T01TR4_A437FacFpg = new String[] {""} ;
      T01TR4_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR4_A450FacPri = new String[] {""} ;
      T01TR4_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR4_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR4_A960FacIVACod = new String[] {""} ;
      T01TR4_A443FacIVAPor = new byte[1] ;
      T01TR4_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR4_A435FacEst = new byte[1] ;
      T01TR4_A445FacLiC = new int[1] ;
      T01TR4_A965FacCob = new String[] {""} ;
      T01TR4_A1150FacNumVto = new byte[1] ;
      T01TR4_A1151FacPer = new String[] {""} ;
      T01TR4_A1152FacDiaPag = new String[] {""} ;
      T01TR4_A1153FacTipFac = new byte[1] ;
      T01TR4_A2739FacSerNum = new String[] {""} ;
      T01TR4_A6632FacDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR4_A7211Factrm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR4_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR4_A9605FacFirma = new String[] {""} ;
      T01TR4_A9606FacHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR4_A9643FacLiq1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR4_A9644FacLiq2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR4_A9645FacIva1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR4_A9646FacTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR4_A9710FacFirDg = new String[] {""} ;
      T01TR4_A10417FacCliPgL = new byte[1] ;
      T01TR4_A10418FacAran = new String[] {""} ;
      T01TR4_A10419FacBrut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR4_A10420FacNet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR4_A10421FacInc = new String[] {""} ;
      T01TR4_A10422FacFre = new String[] {""} ;
      T01TR4_A10423FacExp = new String[] {""} ;
      T01TR4_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR4_A12523FacTpFra = new String[] {""} ;
      T01TR4_A11626FacMan = new String[] {""} ;
      T01TR4_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR4_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR4_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR4_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR4_A14226FacAnulada = new String[] {""} ;
      T01TR4_A14227FacFecAnul = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR4_A14229FacSFD = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR4_A14230FacIDATe = new String[] {""} ;
      T01TR4_A14231FacMsgATe = new String[] {""} ;
      T01TR4_A14232FacIDATc = new String[] {""} ;
      T01TR4_A14233FacMsgATc = new String[] {""} ;
      T01TR4_A14234FacIDATd = new String[] {""} ;
      T01TR4_A14235FacMsgATd = new String[] {""} ;
      T01TR4_A14236FacSerAT = new String[] {""} ;
      T01TR4_A14237FacTipAT = new String[] {""} ;
      T01TR4_A11273FacObs2 = new String[] {""} ;
      T01TR4_A14420FacEnvMail = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR4_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR4_n8346FacRecI = new boolean[] {false} ;
      T01TR4_A396EmprCod = new String[] {""} ;
      T01TR4_A252CliCod = new int[1] ;
      T01TR4_A11629MeivaId = new String[] {""} ;
      T01TR4_n11629MeivaId = new boolean[] {false} ;
      T01TR4_A14217MotAnuID = new String[] {""} ;
      T01TR4_n14217MotAnuID = new boolean[] {false} ;
      T01TR27_A11630MeivaDsc = new String[] {""} ;
      T01TR27_n11630MeivaDsc = new boolean[] {false} ;
      T01TR28_A279CliNom = new String[] {""} ;
      T01TR28_A858ZonGeoCod = new short[1] ;
      T01TR29_A14228MotAnuDc = new String[] {""} ;
      T01TR30_A1360ZonGeoNom = new String[] {""} ;
      T01TR30_n1360ZonGeoNom = new boolean[] {false} ;
      T01TR32_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR32_n3918FacImpTot1 = new boolean[] {false} ;
      T01TR33_A396EmprCod = new String[] {""} ;
      T01TR33_A430FacCod = new int[1] ;
      T01TR34_A430FacCod = new int[1] ;
      T01TR34_A446FacLin = new int[1] ;
      T01TR34_A5050FacBonLi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR34_A427FacAlbCod = new long[1] ;
      T01TR34_A1294FacBarCod = new int[1] ;
      T01TR34_A1295FacBarReo = new byte[1] ;
      T01TR34_A1296FacBarPar = new String[] {""} ;
      T01TR34_A428FacAlbTip = new byte[1] ;
      T01TR34_A454FacSer = new String[] {""} ;
      T01TR34_A432FacDsc = new String[] {""} ;
      T01TR34_A1498FacDisNum = new String[] {""} ;
      T01TR34_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR34_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR34_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR34_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR34_A451FacRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR34_A3097FacTipPro = new String[] {""} ;
      T01TR34_A3303FacNPart = new short[1] ;
      T01TR34_A3397FacFasCod = new String[] {""} ;
      T01TR34_A3878FacColNom = new String[] {""} ;
      T01TR34_A3879FocColNum = new int[1] ;
      T01TR34_A3880FacTipColC = new byte[1] ;
      T01TR34_A3881FacNomCol = new String[] {""} ;
      T01TR34_A3882FacNumCol = new int[1] ;
      T01TR34_A3883FacCliCod = new int[1] ;
      T01TR34_A3884FacProCod = new String[] {""} ;
      T01TR34_A4389FacDsc2 = new String[] {""} ;
      T01TR34_A4814FacEncCli = new String[] {""} ;
      T01TR34_A5172FacDishCod = new String[] {""} ;
      T01TR34_A5189FacTipArt = new short[1] ;
      T01TR34_A5353FacImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR34_A5355FacImpMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR34_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR34_A6837FacCosPQ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR34_A9647FacImpdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR34_A9648FacDtoL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR34_A9649FacPKDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR34_A9650FacPMdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR34_A9651FacImpd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR34_A9708FacDscII = new String[] {""} ;
      T01TR34_A10271FacAcs = new String[] {""} ;
      T01TR34_A3897FacKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR34_A3899FacFecAlb = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR34_A12197FacUnds = new int[1] ;
      T01TR34_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR34_A12906FacCadEnc = new short[1] ;
      T01TR34_A14238FacLinTRM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR34_A14239FACLinTRMF = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR34_A396EmprCod = new String[] {""} ;
      GXCCtl = "" ;
      T01TR35_A396EmprCod = new String[] {""} ;
      T01TR35_A430FacCod = new int[1] ;
      T01TR35_A446FacLin = new int[1] ;
      T01TR3_A430FacCod = new int[1] ;
      T01TR3_A446FacLin = new int[1] ;
      T01TR3_A5050FacBonLi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR3_A427FacAlbCod = new long[1] ;
      T01TR3_A1294FacBarCod = new int[1] ;
      T01TR3_A1295FacBarReo = new byte[1] ;
      T01TR3_A1296FacBarPar = new String[] {""} ;
      T01TR3_A428FacAlbTip = new byte[1] ;
      T01TR3_A454FacSer = new String[] {""} ;
      T01TR3_A432FacDsc = new String[] {""} ;
      T01TR3_A1498FacDisNum = new String[] {""} ;
      T01TR3_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR3_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR3_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR3_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR3_A451FacRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR3_A3097FacTipPro = new String[] {""} ;
      T01TR3_A3303FacNPart = new short[1] ;
      T01TR3_A3397FacFasCod = new String[] {""} ;
      T01TR3_A3878FacColNom = new String[] {""} ;
      T01TR3_A3879FocColNum = new int[1] ;
      T01TR3_A3880FacTipColC = new byte[1] ;
      T01TR3_A3881FacNomCol = new String[] {""} ;
      T01TR3_A3882FacNumCol = new int[1] ;
      T01TR3_A3883FacCliCod = new int[1] ;
      T01TR3_A3884FacProCod = new String[] {""} ;
      T01TR3_A4389FacDsc2 = new String[] {""} ;
      T01TR3_A4814FacEncCli = new String[] {""} ;
      T01TR3_A5172FacDishCod = new String[] {""} ;
      T01TR3_A5189FacTipArt = new short[1] ;
      T01TR3_A5353FacImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR3_A5355FacImpMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR3_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR3_A6837FacCosPQ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR3_A9647FacImpdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR3_A9648FacDtoL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR3_A9649FacPKDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR3_A9650FacPMdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR3_A9651FacImpd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR3_A9708FacDscII = new String[] {""} ;
      T01TR3_A10271FacAcs = new String[] {""} ;
      T01TR3_A3897FacKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR3_A3899FacFecAlb = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR3_A12197FacUnds = new int[1] ;
      T01TR3_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR3_A12906FacCadEnc = new short[1] ;
      T01TR3_A14238FacLinTRM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR3_A14239FACLinTRMF = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR3_A396EmprCod = new String[] {""} ;
      T01TR2_A430FacCod = new int[1] ;
      T01TR2_A446FacLin = new int[1] ;
      T01TR2_A5050FacBonLi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR2_A427FacAlbCod = new long[1] ;
      T01TR2_A1294FacBarCod = new int[1] ;
      T01TR2_A1295FacBarReo = new byte[1] ;
      T01TR2_A1296FacBarPar = new String[] {""} ;
      T01TR2_A428FacAlbTip = new byte[1] ;
      T01TR2_A454FacSer = new String[] {""} ;
      T01TR2_A432FacDsc = new String[] {""} ;
      T01TR2_A1498FacDisNum = new String[] {""} ;
      T01TR2_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR2_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR2_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR2_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR2_A451FacRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR2_A3097FacTipPro = new String[] {""} ;
      T01TR2_A3303FacNPart = new short[1] ;
      T01TR2_A3397FacFasCod = new String[] {""} ;
      T01TR2_A3878FacColNom = new String[] {""} ;
      T01TR2_A3879FocColNum = new int[1] ;
      T01TR2_A3880FacTipColC = new byte[1] ;
      T01TR2_A3881FacNomCol = new String[] {""} ;
      T01TR2_A3882FacNumCol = new int[1] ;
      T01TR2_A3883FacCliCod = new int[1] ;
      T01TR2_A3884FacProCod = new String[] {""} ;
      T01TR2_A4389FacDsc2 = new String[] {""} ;
      T01TR2_A4814FacEncCli = new String[] {""} ;
      T01TR2_A5172FacDishCod = new String[] {""} ;
      T01TR2_A5189FacTipArt = new short[1] ;
      T01TR2_A5353FacImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR2_A5355FacImpMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR2_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR2_A6837FacCosPQ = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR2_A9647FacImpdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR2_A9648FacDtoL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR2_A9649FacPKDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR2_A9650FacPMdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR2_A9651FacImpd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR2_A9708FacDscII = new String[] {""} ;
      T01TR2_A10271FacAcs = new String[] {""} ;
      T01TR2_A3897FacKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR2_A3899FacFecAlb = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR2_A12197FacUnds = new int[1] ;
      T01TR2_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR2_A12906FacCadEnc = new short[1] ;
      T01TR2_A14238FacLinTRM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TR2_A14239FACLinTRMF = new java.util.Date[] {GXutil.nullDate()} ;
      T01TR2_A396EmprCod = new String[] {""} ;
      T01TR39_A396EmprCod = new String[] {""} ;
      T01TR39_A430FacCod = new int[1] ;
      T01TR39_A446FacLin = new int[1] ;
      Gridlevel_lineasRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_lineas_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i14226FacAnulada = "" ;
      i5050FacBonLi = DecimalUtil.ZERO ;
      Gridlevel_lineasColumn = new com.genexus.webpanels.GXWebColumn();
      GXv_int11 = new long[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_decimal19 = new java.math.BigDecimal[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char21 = new String[1] ;
      GXv_int17 = new byte[1] ;
      GXv_int16 = new int[1] ;
      GXv_date15 = new java.util.Date[1] ;
      GXv_char20 = new String[1] ;
      Z3920FacImpPP1 = DecimalUtil.ZERO ;
      Z440FacImpPP = DecimalUtil.ZERO ;
      Z14218FacImpEng1 = DecimalUtil.ZERO ;
      Z14225FacImpEner = DecimalUtil.ZERO ;
      Z441FacImpTot = DecimalUtil.ZERO ;
      ZV17Facfch = GXutil.nullDate() ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.facturacion.mantenimientofactura__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.mantenimientofactura__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.mantenimientofactura__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.mantenimientofactura__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.mantenimientofactura__default(),
         new Object[] {
             new Object[] {
            T01TR2_A430FacCod, T01TR2_A446FacLin, T01TR2_A5050FacBonLi, T01TR2_A427FacAlbCod, T01TR2_A1294FacBarCod, T01TR2_A1295FacBarReo, T01TR2_A1296FacBarPar, T01TR2_A428FacAlbTip, T01TR2_A454FacSer, T01TR2_A432FacDsc,
            T01TR2_A1498FacDisNum, T01TR2_A447FacMts, T01TR2_A449FacPreMts, T01TR2_A444FacKgs, T01TR2_A448FacPreKgs, T01TR2_A451FacRec, T01TR2_A3097FacTipPro, T01TR2_A3303FacNPart, T01TR2_A3397FacFasCod, T01TR2_A3878FacColNom,
            T01TR2_A3879FocColNum, T01TR2_A3880FacTipColC, T01TR2_A3881FacNomCol, T01TR2_A3882FacNumCol, T01TR2_A3883FacCliCod, T01TR2_A3884FacProCod, T01TR2_A4389FacDsc2, T01TR2_A4814FacEncCli, T01TR2_A5172FacDishCod, T01TR2_A5189FacTipArt,
            T01TR2_A5353FacImpMan, T01TR2_A5355FacImpMin, T01TR2_A3898FacPreKgsA, T01TR2_A6837FacCosPQ, T01TR2_A9647FacImpdto, T01TR2_A9648FacDtoL, T01TR2_A9649FacPKDto, T01TR2_A9650FacPMdto, T01TR2_A9651FacImpd, T01TR2_A9708FacDscII,
            T01TR2_A10271FacAcs, T01TR2_A3897FacKgsA, T01TR2_A3899FacFecAlb, T01TR2_A12197FacUnds, T01TR2_A12198FacPreUnd, T01TR2_A12906FacCadEnc, T01TR2_A14238FacLinTRM, T01TR2_A14239FACLinTRMF, T01TR2_A396EmprCod
            }
            , new Object[] {
            T01TR3_A430FacCod, T01TR3_A446FacLin, T01TR3_A5050FacBonLi, T01TR3_A427FacAlbCod, T01TR3_A1294FacBarCod, T01TR3_A1295FacBarReo, T01TR3_A1296FacBarPar, T01TR3_A428FacAlbTip, T01TR3_A454FacSer, T01TR3_A432FacDsc,
            T01TR3_A1498FacDisNum, T01TR3_A447FacMts, T01TR3_A449FacPreMts, T01TR3_A444FacKgs, T01TR3_A448FacPreKgs, T01TR3_A451FacRec, T01TR3_A3097FacTipPro, T01TR3_A3303FacNPart, T01TR3_A3397FacFasCod, T01TR3_A3878FacColNom,
            T01TR3_A3879FocColNum, T01TR3_A3880FacTipColC, T01TR3_A3881FacNomCol, T01TR3_A3882FacNumCol, T01TR3_A3883FacCliCod, T01TR3_A3884FacProCod, T01TR3_A4389FacDsc2, T01TR3_A4814FacEncCli, T01TR3_A5172FacDishCod, T01TR3_A5189FacTipArt,
            T01TR3_A5353FacImpMan, T01TR3_A5355FacImpMin, T01TR3_A3898FacPreKgsA, T01TR3_A6837FacCosPQ, T01TR3_A9647FacImpdto, T01TR3_A9648FacDtoL, T01TR3_A9649FacPKDto, T01TR3_A9650FacPMdto, T01TR3_A9651FacImpd, T01TR3_A9708FacDscII,
            T01TR3_A10271FacAcs, T01TR3_A3897FacKgsA, T01TR3_A3899FacFecAlb, T01TR3_A12197FacUnds, T01TR3_A12198FacPreUnd, T01TR3_A12906FacCadEnc, T01TR3_A14238FacLinTRM, T01TR3_A14239FACLinTRMF, T01TR3_A396EmprCod
            }
            , new Object[] {
            T01TR4_A7210FacObs, T01TR4_A430FacCod, T01TR4_A437FacFpg, T01TR4_A436FacFch, T01TR4_A450FacPri, T01TR4_A433FacDtoGen, T01TR4_A434FacDtoPP, T01TR4_A960FacIVACod, T01TR4_A443FacIVAPor, T01TR4_A453FacRECPor,
            T01TR4_A435FacEst, T01TR4_A445FacLiC, T01TR4_A965FacCob, T01TR4_A1150FacNumVto, T01TR4_A1151FacPer, T01TR4_A1152FacDiaPag, T01TR4_A1153FacTipFac, T01TR4_A2739FacSerNum, T01TR4_A6632FacDto, T01TR4_A7211Factrm,
            T01TR4_A7212FacRect, T01TR4_A9605FacFirma, T01TR4_A9606FacHor, T01TR4_A9643FacLiq1, T01TR4_A9644FacLiq2, T01TR4_A9645FacIva1, T01TR4_A9646FacTot1, T01TR4_A9710FacFirDg, T01TR4_A10417FacCliPgL, T01TR4_A10418FacAran,
            T01TR4_A10419FacBrut, T01TR4_A10420FacNet, T01TR4_A10421FacInc, T01TR4_A10422FacFre, T01TR4_A10423FacExp, T01TR4_A11513FacRecIca, T01TR4_A12523FacTpFra, T01TR4_A11626FacMan, T01TR4_A14219FacEnergia, T01TR4_A14224FacCostFac,
            T01TR4_A14222FacCostMts, T01TR4_A14223FacCostKgs, T01TR4_A14226FacAnulada, T01TR4_A14227FacFecAnul, T01TR4_A14229FacSFD, T01TR4_A14230FacIDATe, T01TR4_A14231FacMsgATe, T01TR4_A14232FacIDATc, T01TR4_A14233FacMsgATc, T01TR4_A14234FacIDATd,
            T01TR4_A14235FacMsgATd, T01TR4_A14236FacSerAT, T01TR4_A14237FacTipAT, T01TR4_A11273FacObs2, T01TR4_A14420FacEnvMail, T01TR4_A8346FacRecI, T01TR4_n8346FacRecI, T01TR4_A396EmprCod, T01TR4_A252CliCod, T01TR4_A11629MeivaId,
            T01TR4_n11629MeivaId, T01TR4_A14217MotAnuID, T01TR4_n14217MotAnuID
            }
            , new Object[] {
            T01TR5_A7210FacObs, T01TR5_A430FacCod, T01TR5_A437FacFpg, T01TR5_A436FacFch, T01TR5_A450FacPri, T01TR5_A433FacDtoGen, T01TR5_A434FacDtoPP, T01TR5_A960FacIVACod, T01TR5_A443FacIVAPor, T01TR5_A453FacRECPor,
            T01TR5_A435FacEst, T01TR5_A445FacLiC, T01TR5_A965FacCob, T01TR5_A1150FacNumVto, T01TR5_A1151FacPer, T01TR5_A1152FacDiaPag, T01TR5_A1153FacTipFac, T01TR5_A2739FacSerNum, T01TR5_A6632FacDto, T01TR5_A7211Factrm,
            T01TR5_A7212FacRect, T01TR5_A9605FacFirma, T01TR5_A9606FacHor, T01TR5_A9643FacLiq1, T01TR5_A9644FacLiq2, T01TR5_A9645FacIva1, T01TR5_A9646FacTot1, T01TR5_A9710FacFirDg, T01TR5_A10417FacCliPgL, T01TR5_A10418FacAran,
            T01TR5_A10419FacBrut, T01TR5_A10420FacNet, T01TR5_A10421FacInc, T01TR5_A10422FacFre, T01TR5_A10423FacExp, T01TR5_A11513FacRecIca, T01TR5_A12523FacTpFra, T01TR5_A11626FacMan, T01TR5_A14219FacEnergia, T01TR5_A14224FacCostFac,
            T01TR5_A14222FacCostMts, T01TR5_A14223FacCostKgs, T01TR5_A14226FacAnulada, T01TR5_A14227FacFecAnul, T01TR5_A14229FacSFD, T01TR5_A14230FacIDATe, T01TR5_A14231FacMsgATe, T01TR5_A14232FacIDATc, T01TR5_A14233FacMsgATc, T01TR5_A14234FacIDATd,
            T01TR5_A14235FacMsgATd, T01TR5_A14236FacSerAT, T01TR5_A14237FacTipAT, T01TR5_A11273FacObs2, T01TR5_A14420FacEnvMail, T01TR5_A8346FacRecI, T01TR5_n8346FacRecI, T01TR5_A396EmprCod, T01TR5_A252CliCod, T01TR5_A11629MeivaId,
            T01TR5_n11629MeivaId, T01TR5_A14217MotAnuID, T01TR5_n14217MotAnuID
            }
            , new Object[] {
            T01TR6_A407EmprNom, T01TR6_n407EmprNom, T01TR6_A7209Colombia, T01TR6_n7209Colombia, T01TR6_A953IvaCod, T01TR6_n953IvaCod
            }
            , new Object[] {
            T01TR7_A11630MeivaDsc, T01TR7_n11630MeivaDsc
            }
            , new Object[] {
            T01TR8_A279CliNom, T01TR8_A858ZonGeoCod
            }
            , new Object[] {
            T01TR9_A14228MotAnuDc
            }
            , new Object[] {
            T01TR10_A1360ZonGeoNom, T01TR10_n1360ZonGeoNom
            }
            , new Object[] {
            T01TR12_A3918FacImpTot1, T01TR12_n3918FacImpTot1
            }
            , new Object[] {
            T01TR14_A7210FacObs, T01TR14_A430FacCod, T01TR14_A437FacFpg, T01TR14_A407EmprNom, T01TR14_n407EmprNom, T01TR14_A436FacFch, T01TR14_A450FacPri, T01TR14_A279CliNom, T01TR14_A433FacDtoGen, T01TR14_A434FacDtoPP,
            T01TR14_A960FacIVACod, T01TR14_A443FacIVAPor, T01TR14_A453FacRECPor, T01TR14_A435FacEst, T01TR14_A445FacLiC, T01TR14_A965FacCob, T01TR14_A1150FacNumVto, T01TR14_A1151FacPer, T01TR14_A1152FacDiaPag, T01TR14_A1153FacTipFac,
            T01TR14_A2739FacSerNum, T01TR14_A6632FacDto, T01TR14_A7211Factrm, T01TR14_A7212FacRect, T01TR14_A9605FacFirma, T01TR14_A9606FacHor, T01TR14_A9643FacLiq1, T01TR14_A9644FacLiq2, T01TR14_A9645FacIva1, T01TR14_A9646FacTot1,
            T01TR14_A1360ZonGeoNom, T01TR14_n1360ZonGeoNom, T01TR14_A9710FacFirDg, T01TR14_A10417FacCliPgL, T01TR14_A10418FacAran, T01TR14_A10419FacBrut, T01TR14_A10420FacNet, T01TR14_A10421FacInc, T01TR14_A10422FacFre, T01TR14_A10423FacExp,
            T01TR14_A11513FacRecIca, T01TR14_A12523FacTpFra, T01TR14_A11626FacMan, T01TR14_A14219FacEnergia, T01TR14_A14224FacCostFac, T01TR14_A14222FacCostMts, T01TR14_A14223FacCostKgs, T01TR14_A14226FacAnulada, T01TR14_A14227FacFecAnul, T01TR14_A14228MotAnuDc,
            T01TR14_A11630MeivaDsc, T01TR14_n11630MeivaDsc, T01TR14_A14229FacSFD, T01TR14_A14230FacIDATe, T01TR14_A14231FacMsgATe, T01TR14_A14232FacIDATc, T01TR14_A14233FacMsgATc, T01TR14_A14234FacIDATd, T01TR14_A14235FacMsgATd, T01TR14_A14236FacSerAT,
            T01TR14_A14237FacTipAT, T01TR14_A11273FacObs2, T01TR14_A14420FacEnvMail, T01TR14_A8346FacRecI, T01TR14_n8346FacRecI, T01TR14_A7209Colombia, T01TR14_n7209Colombia, T01TR14_A396EmprCod, T01TR14_A252CliCod, T01TR14_A11629MeivaId,
            T01TR14_n11629MeivaId, T01TR14_A14217MotAnuID, T01TR14_n14217MotAnuID, T01TR14_A953IvaCod, T01TR14_n953IvaCod, T01TR14_A858ZonGeoCod, T01TR14_A3918FacImpTot1, T01TR14_n3918FacImpTot1
            }
            , new Object[] {
            T01TR15_A11630MeivaDsc, T01TR15_n11630MeivaDsc
            }
            , new Object[] {
            T01TR16_A279CliNom, T01TR16_A858ZonGeoCod
            }
            , new Object[] {
            T01TR17_A14228MotAnuDc
            }
            , new Object[] {
            T01TR18_A1360ZonGeoNom, T01TR18_n1360ZonGeoNom
            }
            , new Object[] {
            T01TR20_A3918FacImpTot1, T01TR20_n3918FacImpTot1
            }
            , new Object[] {
            T01TR21_A396EmprCod, T01TR21_A430FacCod
            }
            , new Object[] {
            T01TR22_A396EmprCod, T01TR22_A430FacCod
            }
            , new Object[] {
            T01TR23_A396EmprCod, T01TR23_A430FacCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TR27_A11630MeivaDsc, T01TR27_n11630MeivaDsc
            }
            , new Object[] {
            T01TR28_A279CliNom, T01TR28_A858ZonGeoCod
            }
            , new Object[] {
            T01TR29_A14228MotAnuDc
            }
            , new Object[] {
            T01TR30_A1360ZonGeoNom, T01TR30_n1360ZonGeoNom
            }
            , new Object[] {
            T01TR32_A3918FacImpTot1, T01TR32_n3918FacImpTot1
            }
            , new Object[] {
            T01TR33_A396EmprCod, T01TR33_A430FacCod
            }
            , new Object[] {
            T01TR34_A430FacCod, T01TR34_A446FacLin, T01TR34_A5050FacBonLi, T01TR34_A427FacAlbCod, T01TR34_A1294FacBarCod, T01TR34_A1295FacBarReo, T01TR34_A1296FacBarPar, T01TR34_A428FacAlbTip, T01TR34_A454FacSer, T01TR34_A432FacDsc,
            T01TR34_A1498FacDisNum, T01TR34_A447FacMts, T01TR34_A449FacPreMts, T01TR34_A444FacKgs, T01TR34_A448FacPreKgs, T01TR34_A451FacRec, T01TR34_A3097FacTipPro, T01TR34_A3303FacNPart, T01TR34_A3397FacFasCod, T01TR34_A3878FacColNom,
            T01TR34_A3879FocColNum, T01TR34_A3880FacTipColC, T01TR34_A3881FacNomCol, T01TR34_A3882FacNumCol, T01TR34_A3883FacCliCod, T01TR34_A3884FacProCod, T01TR34_A4389FacDsc2, T01TR34_A4814FacEncCli, T01TR34_A5172FacDishCod, T01TR34_A5189FacTipArt,
            T01TR34_A5353FacImpMan, T01TR34_A5355FacImpMin, T01TR34_A3898FacPreKgsA, T01TR34_A6837FacCosPQ, T01TR34_A9647FacImpdto, T01TR34_A9648FacDtoL, T01TR34_A9649FacPKDto, T01TR34_A9650FacPMdto, T01TR34_A9651FacImpd, T01TR34_A9708FacDscII,
            T01TR34_A10271FacAcs, T01TR34_A3897FacKgsA, T01TR34_A3899FacFecAlb, T01TR34_A12197FacUnds, T01TR34_A12198FacPreUnd, T01TR34_A12906FacCadEnc, T01TR34_A14238FacLinTRM, T01TR34_A14239FACLinTRMF, T01TR34_A396EmprCod
            }
            , new Object[] {
            T01TR35_A396EmprCod, T01TR35_A430FacCod, T01TR35_A446FacLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TR39_A396EmprCod, T01TR39_A430FacCod, T01TR39_A446FacLin
            }
         }
      );
      AV56Pgmname = "Facturacion.MantenimientoFactura" ;
      Z14226FacAnulada = httpContext.getMessage( "N", "") ;
      A14226FacAnulada = httpContext.getMessage( "N", "") ;
      i14226FacAnulada = httpContext.getMessage( "N", "") ;
      Z5050FacBonLi = DecimalUtil.doubleToDec(0) ;
      N5050FacBonLi = DecimalUtil.doubleToDec(0) ;
      A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
      i5050FacBonLi = DecimalUtil.doubleToDec(0) ;
   }

   private byte Z443FacIVAPor ;
   private byte Z435FacEst ;
   private byte Z1150FacNumVto ;
   private byte Z1153FacTipFac ;
   private byte Z10417FacCliPgL ;
   private byte O1150FacNumVto ;
   private byte O443FacIVAPor ;
   private byte N443FacIVAPor ;
   private byte N1153FacTipFac ;
   private byte N1150FacNumVto ;
   private byte Z1295FacBarReo ;
   private byte Z428FacAlbTip ;
   private byte Z3880FacTipColC ;
   private byte GxWebError ;
   private byte A1150FacNumVto ;
   private byte A443FacIVAPor ;
   private byte A428FacAlbTip ;
   private byte A1295FacBarReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A435FacEst ;
   private byte B1150FacNumVto ;
   private byte B443FacIVAPor ;
   private byte A1153FacTipFac ;
   private byte A10417FacCliPgL ;
   private byte A7209Colombia ;
   private byte A3880FacTipColC ;
   private byte Z7209Colombia ;
   private byte subGridlevel_lineas_Backcolorstyle ;
   private byte subGridlevel_lineas_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_lineas_Allowselection ;
   private byte subGridlevel_lineas_Allowhovering ;
   private byte subGridlevel_lineas_Allowcollapsing ;
   private byte subGridlevel_lineas_Collapsed ;
   private byte GXt_int8 ;
   private byte GXv_int6[] ;
   private byte GXv_int17[] ;
   private short Z3303FacNPart ;
   private short Z5189FacTipArt ;
   private short Z12906FacCadEnc ;
   private short nRcdDeleted_44 ;
   private short nRcdExists_44 ;
   private short nIsMod_44 ;
   private short AV19FirmaD ;
   private short AV20Tintutex ;
   private short A858ZonGeoCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount44 ;
   private short RcdFound44 ;
   private short nBlankRcdUsr44 ;
   private short A3303FacNPart ;
   private short A5189FacTipArt ;
   private short A12906FacCadEnc ;
   private short RcdFound43 ;
   private short AV18FlagIns ;
   private short AV23FlagTintu ;
   private short AV24F_carvema ;
   private short AV25FlagEtx ;
   private short AV26EuroVal ;
   private short AV28Flag_AF ;
   private short AV29RieClF ;
   private short AV30FacImpM ;
   private short AV31F_Tinamar ;
   private short AV32ImpMin ;
   private short AV33Moda21 ;
   private short AV35HashRecalculo ;
   private short AV37PdfGx16 ;
   private short AV38impenergtico ;
   private short AV39eiva ;
   private short Z858ZonGeoCod ;
   private short nIsDirty_43 ;
   private short nIsDirty_44 ;
   private int wcpOAV8FacCod ;
   private int Z430FacCod ;
   private int Z445FacLiC ;
   private int Z252CliCod ;
   private int nRC_GXsfl_204 ;
   private int nGXsfl_204_idx=1 ;
   private int N252CliCod ;
   private int Z446FacLin ;
   private int Z1294FacBarCod ;
   private int Z3879FocColNum ;
   private int Z3882FacNumCol ;
   private int Z3883FacCliCod ;
   private int Z12197FacUnds ;
   private int A430FacCod ;
   private int AV16FacCodX ;
   private int A1294FacBarCod ;
   private int A252CliCod ;
   private int AV8FacCod ;
   private int trnEnded ;
   private int edtFacCod_Enabled ;
   private int edtFacFch_Enabled ;
   private int edtFacHor_Enabled ;
   private int edtFacSerNum_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtMeivaId_Visible ;
   private int edtMeivaId_Enabled ;
   private int edtFacNumVto_Enabled ;
   private int edtFacPer_Enabled ;
   private int edtFacDiaPag_Enabled ;
   private int edtFacFpg_Visible ;
   private int edtFacFpg_Enabled ;
   private int divUnnamedtable10_Visible ;
   private int edtFacObs_Visible ;
   private int edtFacObs_Enabled ;
   private int edtFacObs2_Visible ;
   private int edtFacObs2_Enabled ;
   private int edtFacImpTot_Enabled ;
   private int edtFacDtoGen_Enabled ;
   private int edtFacImpGen_Enabled ;
   private int edtFacDto_Enabled ;
   private int edtFacImpPP_Enabled ;
   private int edtFacBasImp_Enabled ;
   private int edtFacIVAPor_Enabled ;
   private int edtFacIVAImp_Enabled ;
   private int edtFacTot_Enabled ;
   private int edtFacFirma_Enabled ;
   private int edtavTexto_fd_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtnagregardocumento_Visible ;
   private int bttBtneliminardocumento_Visible ;
   private int bttBtnbuscardocumento_Visible ;
   private int bttBtnvencimientos_Visible ;
   private int bttBtnrepresentantes_divisas_Visible ;
   private int bttBtntrn_cancel_Visible ;
   private int edtavPgmname_Enabled ;
   private int edtavCombomeivaid_Visible ;
   private int edtavCombomeivaid_Enabled ;
   private int edtavCombofacfpg_Visible ;
   private int edtavCombofacfpg_Enabled ;
   private int edtFacPri_Visible ;
   private int edtFacPri_Enabled ;
   private int edtFacLin_Enabled ;
   private int edtFacAlbCod_Enabled ;
   private int edtFacAlbTip_Enabled ;
   private int edtFacNHdr_Enabled ;
   private int edtFacMts_Enabled ;
   private int edtFacPreMts_Enabled ;
   private int edtFacKgs_Enabled ;
   private int edtFacPreKgs_Enabled ;
   private int edtFacUnds_Enabled ;
   private int edtFacPreUnd_Enabled ;
   private int edtFacRec_Enabled ;
   private int edtFacBonLi_Enabled ;
   private int edtFacBonLi_Visible ;
   private int edtFacImp_Enabled ;
   private int edtFacSer_Enabled ;
   private int edtFacBarCod_Enabled ;
   private int edtFacBarReo_Enabled ;
   private int edtFacBarPar_Enabled ;
   private int edtFacDsc_Enabled ;
   private int edtFacFasCod_Enabled ;
   private int fRowAdded ;
   private int A445FacLiC ;
   private int AV12Insert_CliCod ;
   private int A3879FocColNum ;
   private int A3882FacNumCol ;
   private int A3883FacCliCod ;
   private int Combo_meivaid_Datalistupdateminimumcharacters ;
   private int Combo_meivaid_Gxcontroltype ;
   private int Dvpanel_unnamedtable4_Gxcontroltype ;
   private int Combo_facfpg_Datalistupdateminimumcharacters ;
   private int Combo_facfpg_Gxcontroltype ;
   private int Dvpanel_unnamedtable5_Gxcontroltype ;
   private int Dvpanel_unnamedtable6_Gxcontroltype ;
   private int Dvpanel_unnamedtable7_Gxcontroltype ;
   private int Dvpanel_unnamedtable8_Gxcontroltype ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Datamonjs_Gxcontroltype ;
   private int A446FacLin ;
   private int A12197FacUnds ;
   private int AV57GXV1 ;
   private int AV58GXV2 ;
   private int GX_JID ;
   private int subGridlevel_lineas_Backcolor ;
   private int subGridlevel_lineas_Allbackcolor ;
   private int defedtFacFasCod_Enabled ;
   private int defedtFacDsc_Enabled ;
   private int defedtFacBarPar_Enabled ;
   private int defedtFacBarReo_Enabled ;
   private int defedtFacBarCod_Enabled ;
   private int defedtFacSer_Enabled ;
   private int defedtFacBonLi_Enabled ;
   private int defedtFacRec_Enabled ;
   private int defedtFacPreKgs_Enabled ;
   private int defedtFacKgs_Enabled ;
   private int defedtFacPreMts_Enabled ;
   private int defedtFacMts_Enabled ;
   private int defedtFacAlbTip_Enabled ;
   private int defedtFacAlbCod_Enabled ;
   private int defedtFacLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_lineas_Selectedindex ;
   private int subGridlevel_lineas_Selectioncolor ;
   private int subGridlevel_lineas_Hoveringcolor ;
   private int GXv_int7[] ;
   private int GXv_int16[] ;
   private int ZV16FacCodX ;
   private long Z427FacAlbCod ;
   private long A427FacAlbCod ;
   private long GRIDLEVEL_LINEAS_nFirstRecordOnPage ;
   private long GXv_int11[] ;
   private java.math.BigDecimal Z433FacDtoGen ;
   private java.math.BigDecimal Z434FacDtoPP ;
   private java.math.BigDecimal Z453FacRECPor ;
   private java.math.BigDecimal Z6632FacDto ;
   private java.math.BigDecimal Z7211Factrm ;
   private java.math.BigDecimal Z7212FacRect ;
   private java.math.BigDecimal Z9643FacLiq1 ;
   private java.math.BigDecimal Z9644FacLiq2 ;
   private java.math.BigDecimal Z9645FacIva1 ;
   private java.math.BigDecimal Z9646FacTot1 ;
   private java.math.BigDecimal Z10419FacBrut ;
   private java.math.BigDecimal Z10420FacNet ;
   private java.math.BigDecimal Z11513FacRecIca ;
   private java.math.BigDecimal Z14219FacEnergia ;
   private java.math.BigDecimal Z14224FacCostFac ;
   private java.math.BigDecimal Z14222FacCostMts ;
   private java.math.BigDecimal Z14223FacCostKgs ;
   private java.math.BigDecimal Z8346FacRecI ;
   private java.math.BigDecimal O3918FacImpTot1 ;
   private java.math.BigDecimal O434FacDtoPP ;
   private java.math.BigDecimal O433FacDtoGen ;
   private java.math.BigDecimal O453FacRECPor ;
   private java.math.BigDecimal O14224FacCostFac ;
   private java.math.BigDecimal N433FacDtoGen ;
   private java.math.BigDecimal N434FacDtoPP ;
   private java.math.BigDecimal N453FacRECPor ;
   private java.math.BigDecimal Z5050FacBonLi ;
   private java.math.BigDecimal Z447FacMts ;
   private java.math.BigDecimal Z449FacPreMts ;
   private java.math.BigDecimal Z444FacKgs ;
   private java.math.BigDecimal Z448FacPreKgs ;
   private java.math.BigDecimal Z451FacRec ;
   private java.math.BigDecimal Z5353FacImpMan ;
   private java.math.BigDecimal Z5355FacImpMin ;
   private java.math.BigDecimal Z3898FacPreKgsA ;
   private java.math.BigDecimal Z6837FacCosPQ ;
   private java.math.BigDecimal Z9647FacImpdto ;
   private java.math.BigDecimal Z9648FacDtoL ;
   private java.math.BigDecimal Z9649FacPKDto ;
   private java.math.BigDecimal Z9650FacPMdto ;
   private java.math.BigDecimal Z9651FacImpd ;
   private java.math.BigDecimal Z3897FacKgsA ;
   private java.math.BigDecimal Z12198FacPreUnd ;
   private java.math.BigDecimal Z14238FacLinTRM ;
   private java.math.BigDecimal O438FacImp ;
   private java.math.BigDecimal O448FacPreKgs ;
   private java.math.BigDecimal O449FacPreMts ;
   private java.math.BigDecimal N5353FacImpMan ;
   private java.math.BigDecimal N5355FacImpMin ;
   private java.math.BigDecimal N447FacMts ;
   private java.math.BigDecimal N449FacPreMts ;
   private java.math.BigDecimal N444FacKgs ;
   private java.math.BigDecimal N448FacPreKgs ;
   private java.math.BigDecimal N5050FacBonLi ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A6632FacDto ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal B3918FacImpTot1 ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal B434FacDtoPP ;
   private java.math.BigDecimal B433FacDtoGen ;
   private java.math.BigDecimal B453FacRECPor ;
   private java.math.BigDecimal B14224FacCostFac ;
   private java.math.BigDecimal A7211Factrm ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A9643FacLiq1 ;
   private java.math.BigDecimal A9644FacLiq2 ;
   private java.math.BigDecimal A9645FacIva1 ;
   private java.math.BigDecimal A9646FacTot1 ;
   private java.math.BigDecimal A10419FacBrut ;
   private java.math.BigDecimal A10420FacNet ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A3920FacImpPP1 ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A7215FacImpRet2 ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A8347FacImpReI ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A14225FacImpEner ;
   private java.math.BigDecimal A5355FacImpMin ;
   private java.math.BigDecimal A2239FacIml ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A3923FacImp1 ;
   private java.math.BigDecimal A3898FacPreKgsA ;
   private java.math.BigDecimal A3897FacKgsA ;
   private java.math.BigDecimal A6837FacCosPQ ;
   private java.math.BigDecimal A9647FacImpdto ;
   private java.math.BigDecimal A9648FacDtoL ;
   private java.math.BigDecimal A9649FacPKDto ;
   private java.math.BigDecimal A9650FacPMdto ;
   private java.math.BigDecimal A9651FacImpd ;
   private java.math.BigDecimal A14238FacLinTRM ;
   private java.math.BigDecimal s3918FacImpTot1 ;
   private java.math.BigDecimal s14225FacImpEner ;
   private java.math.BigDecimal O14225FacImpEner ;
   private java.math.BigDecimal s440FacImpPP ;
   private java.math.BigDecimal O440FacImpPP ;
   private java.math.BigDecimal s439FacImpGen ;
   private java.math.BigDecimal O439FacImpGen ;
   private java.math.BigDecimal s11515FacImpIca ;
   private java.math.BigDecimal O11515FacImpIca ;
   private java.math.BigDecimal s7213FacImpRet ;
   private java.math.BigDecimal O7213FacImpRet ;
   private java.math.BigDecimal s452FacRecImp ;
   private java.math.BigDecimal O452FacRecImp ;
   private java.math.BigDecimal s8347FacImpReI ;
   private java.math.BigDecimal O8347FacImpReI ;
   private java.math.BigDecimal s8348FacImpReI1 ;
   private java.math.BigDecimal O8348FacImpReI1 ;
   private java.math.BigDecimal s442FacIVAImp ;
   private java.math.BigDecimal O442FacIVAImp ;
   private java.math.BigDecimal s455FacTot ;
   private java.math.BigDecimal O455FacTot ;
   private java.math.BigDecimal s3921FacIvaImp1 ;
   private java.math.BigDecimal O3921FacIvaImp1 ;
   private java.math.BigDecimal s3922FacRecImp1 ;
   private java.math.BigDecimal O3922FacRecImp1 ;
   private java.math.BigDecimal s7214FacImpRet1 ;
   private java.math.BigDecimal O7214FacImpRet1 ;
   private java.math.BigDecimal s11514FacImpIca1 ;
   private java.math.BigDecimal O11514FacImpIca1 ;
   private java.math.BigDecimal s429FacBasImp ;
   private java.math.BigDecimal O429FacBasImp ;
   private java.math.BigDecimal s7215FacImpRet2 ;
   private java.math.BigDecimal O7215FacImpRet2 ;
   private java.math.BigDecimal s441FacImpTot ;
   private java.math.BigDecimal O441FacImpTot ;
   private java.math.BigDecimal s3919FacImpGen1 ;
   private java.math.BigDecimal O3919FacImpGen1 ;
   private java.math.BigDecimal s3920FacImpPP1 ;
   private java.math.BigDecimal O3920FacImpPP1 ;
   private java.math.BigDecimal s14218FacImpEng1 ;
   private java.math.BigDecimal O14218FacImpEng1 ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A12198FacPreUnd ;
   private java.math.BigDecimal A451FacRec ;
   private java.math.BigDecimal A5050FacBonLi ;
   private java.math.BigDecimal A438FacImp ;
   private java.math.BigDecimal T438FacImp ;
   private java.math.BigDecimal T448FacPreKgs ;
   private java.math.BigDecimal T449FacPreMts ;
   private java.math.BigDecimal AV27ValEuro ;
   private java.math.BigDecimal Z3918FacImpTot1 ;
   private java.math.BigDecimal i5050FacBonLi ;
   private java.math.BigDecimal GXv_decimal19[] ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal Z3920FacImpPP1 ;
   private java.math.BigDecimal Z440FacImpPP ;
   private java.math.BigDecimal Z14218FacImpEng1 ;
   private java.math.BigDecimal Z14225FacImpEner ;
   private java.math.BigDecimal Z441FacImpTot ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String Z396EmprCod ;
   private String Z437FacFpg ;
   private String Z450FacPri ;
   private String Z960FacIVACod ;
   private String Z965FacCob ;
   private String Z1151FacPer ;
   private String Z1152FacDiaPag ;
   private String Z2739FacSerNum ;
   private String Z9605FacFirma ;
   private String Z9710FacFirDg ;
   private String Z10418FacAran ;
   private String Z10421FacInc ;
   private String Z10422FacFre ;
   private String Z10423FacExp ;
   private String Z12523FacTpFra ;
   private String Z11626FacMan ;
   private String Z14226FacAnulada ;
   private String Z14230FacIDATe ;
   private String Z14232FacIDATc ;
   private String Z14234FacIDATd ;
   private String Z14236FacSerAT ;
   private String Z14237FacTipAT ;
   private String Z11629MeivaId ;
   private String Z14217MotAnuID ;
   private String O1151FacPer ;
   private String O1152FacDiaPag ;
   private String O437FacFpg ;
   private String N14217MotAnuID ;
   private String N11629MeivaId ;
   private String N2739FacSerNum ;
   private String N450FacPri ;
   private String N437FacFpg ;
   private String N1151FacPer ;
   private String N1152FacDiaPag ;
   private String Dvelop_confirmpanel_eliminardocumento_Result ;
   private String Combo_facfpg_Selectedvalue_get ;
   private String Combo_meivaid_Selectedvalue_get ;
   private String Z1296FacBarPar ;
   private String Z454FacSer ;
   private String Z432FacDsc ;
   private String Z1498FacDisNum ;
   private String Z3097FacTipPro ;
   private String Z3397FacFasCod ;
   private String Z3878FacColNom ;
   private String Z3881FacNomCol ;
   private String Z3884FacProCod ;
   private String Z4389FacDsc2 ;
   private String Z4814FacEncCli ;
   private String Z5172FacDishCod ;
   private String Z9708FacDscII ;
   private String Z10271FacAcs ;
   private String N432FacDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A450FacPri ;
   private String A1151FacPer ;
   private String A1152FacDiaPag ;
   private String A437FacFpg ;
   private String A1296FacBarPar ;
   private String A3397FacFasCod ;
   private String AV21UsurCod ;
   private String AV22Station ;
   private String AV7EmprCod ;
   private String A11629MeivaId ;
   private String A14217MotAnuID ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtFacFch_Internalname ;
   private String sGXsfl_204_idx="0001" ;
   private String A14226FacAnulada ;
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
   private String divUnnamedtable3_Internalname ;
   private String edtFacCod_Internalname ;
   private String edtFacCod_Jsonclick ;
   private String TempTags ;
   private String edtFacFch_Jsonclick ;
   private String edtFacHor_Internalname ;
   private String edtFacHor_Jsonclick ;
   private String edtFacSerNum_Internalname ;
   private String A2739FacSerNum ;
   private String edtFacSerNum_Jsonclick ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String divTablesplittedmeivaid_Internalname ;
   private String lblTextblockmeivaid_Internalname ;
   private String lblTextblockmeivaid_Jsonclick ;
   private String Combo_meivaid_Caption ;
   private String Combo_meivaid_Cls ;
   private String Combo_meivaid_Emptyitemtext ;
   private String Combo_meivaid_Internalname ;
   private String edtMeivaId_Internalname ;
   private String edtMeivaId_Jsonclick ;
   private String Dvpanel_unnamedtable5_Width ;
   private String Dvpanel_unnamedtable5_Cls ;
   private String Dvpanel_unnamedtable5_Title ;
   private String Dvpanel_unnamedtable5_Iconposition ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtFacNumVto_Internalname ;
   private String edtFacNumVto_Jsonclick ;
   private String edtFacPer_Internalname ;
   private String edtFacPer_Jsonclick ;
   private String edtFacDiaPag_Internalname ;
   private String edtFacDiaPag_Jsonclick ;
   private String divTablesplittedfacfpg_Internalname ;
   private String lblTextblockfacfpg_Internalname ;
   private String lblTextblockfacfpg_Jsonclick ;
   private String Combo_facfpg_Caption ;
   private String Combo_facfpg_Cls ;
   private String Combo_facfpg_Emptyitemtext ;
   private String Combo_facfpg_Internalname ;
   private String edtFacFpg_Internalname ;
   private String edtFacFpg_Jsonclick ;
   private String Dvpanel_unnamedtable6_Width ;
   private String Dvpanel_unnamedtable6_Cls ;
   private String Dvpanel_unnamedtable6_Title ;
   private String Dvpanel_unnamedtable6_Iconposition ;
   private String Dvpanel_unnamedtable6_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String divFacobs_cell_Internalname ;
   private String divFacobs_cell_Class ;
   private String edtFacObs_Internalname ;
   private String divFacobs2_cell_Internalname ;
   private String divFacobs2_cell_Class ;
   private String edtFacObs2_Internalname ;
   private String Dvpanel_unnamedtable7_Width ;
   private String Dvpanel_unnamedtable7_Cls ;
   private String Dvpanel_unnamedtable7_Title ;
   private String Dvpanel_unnamedtable7_Iconposition ;
   private String Dvpanel_unnamedtable7_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String edtFacImpTot_Internalname ;
   private String edtFacImpTot_Jsonclick ;
   private String edtFacDtoGen_Internalname ;
   private String edtFacDtoGen_Jsonclick ;
   private String edtFacImpGen_Internalname ;
   private String edtFacImpGen_Jsonclick ;
   private String edtFacDto_Internalname ;
   private String edtFacDto_Jsonclick ;
   private String edtFacImpPP_Internalname ;
   private String edtFacImpPP_Jsonclick ;
   private String edtFacBasImp_Internalname ;
   private String edtFacBasImp_Jsonclick ;
   private String edtFacIVAPor_Internalname ;
   private String edtFacIVAPor_Jsonclick ;
   private String edtFacIVAImp_Internalname ;
   private String edtFacIVAImp_Jsonclick ;
   private String edtFacTot_Internalname ;
   private String edtFacTot_Jsonclick ;
   private String Dvpanel_unnamedtable8_Width ;
   private String Dvpanel_unnamedtable8_Cls ;
   private String Dvpanel_unnamedtable8_Title ;
   private String Dvpanel_unnamedtable8_Iconposition ;
   private String Dvpanel_unnamedtable8_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String edtFacFirma_Internalname ;
   private String A9605FacFirma ;
   private String divUnnamedtable1_Internalname ;
   private String edtavTexto_fd_Internalname ;
   private String edtavTexto_fd_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtnagregardocumento_Internalname ;
   private String bttBtnagregardocumento_Jsonclick ;
   private String bttBtneliminardocumento_Internalname ;
   private String bttBtneliminardocumento_Jsonclick ;
   private String bttBtnbuscardocumento_Internalname ;
   private String bttBtnbuscardocumento_Jsonclick ;
   private String bttBtnvencimientos_Internalname ;
   private String bttBtnvencimientos_Jsonclick ;
   private String bttBtnrepresentantes_divisas_Internalname ;
   private String bttBtnrepresentantes_divisas_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divTableleaflevel_lineas_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV56Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_meivaid_Internalname ;
   private String edtavCombomeivaid_Internalname ;
   private String AV42ComboMeivaId ;
   private String edtavCombomeivaid_Jsonclick ;
   private String divSectionattribute_facfpg_Internalname ;
   private String edtavCombofacfpg_Internalname ;
   private String AV44ComboFacFpg ;
   private String edtavCombofacfpg_Jsonclick ;
   private String edtFacPri_Internalname ;
   private String edtFacPri_Jsonclick ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_eliminardocumento_Internalname ;
   private String Dvelop_confirmpanel_eliminardocumento_Title ;
   private String Dvelop_confirmpanel_eliminardocumento_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminardocumento_Confirmtype ;
   private String Dvelop_confirmpanel_eliminardocumento_Internalname ;
   private String B1151FacPer ;
   private String B1152FacDiaPag ;
   private String B437FacFpg ;
   private String sMode44 ;
   private String edtFacLin_Internalname ;
   private String edtFacAlbCod_Internalname ;
   private String edtFacAlbTip_Internalname ;
   private String edtFacNHdr_Internalname ;
   private String edtFacMts_Internalname ;
   private String edtFacPreMts_Internalname ;
   private String edtFacKgs_Internalname ;
   private String edtFacPreKgs_Internalname ;
   private String edtFacUnds_Internalname ;
   private String edtFacPreUnd_Internalname ;
   private String edtFacRec_Internalname ;
   private String edtFacBonLi_Internalname ;
   private String edtFacImp_Internalname ;
   private String edtFacSer_Internalname ;
   private String edtFacBarCod_Internalname ;
   private String edtFacBarReo_Internalname ;
   private String edtFacBarPar_Internalname ;
   private String edtFacDsc_Internalname ;
   private String edtFacFasCod_Internalname ;
   private String subGridlevel_lineas_Internalname ;
   private String A960FacIVACod ;
   private String A965FacCob ;
   private String A9710FacFirDg ;
   private String A10418FacAran ;
   private String A10421FacInc ;
   private String A10422FacFre ;
   private String A10423FacExp ;
   private String A12523FacTpFra ;
   private String A11626FacMan ;
   private String A14230FacIDATe ;
   private String A14232FacIDATc ;
   private String A14234FacIDATd ;
   private String A14236FacSerAT ;
   private String A14237FacTipAT ;
   private String AV13Insert_MotAnuID ;
   private String AV14Insert_MeivaId ;
   private String A407EmprNom ;
   private String A953IvaCod ;
   private String A1360ZonGeoNom ;
   private String A1498FacDisNum ;
   private String A3097FacTipPro ;
   private String A3878FacColNom ;
   private String A3881FacNomCol ;
   private String A3884FacProCod ;
   private String A4389FacDsc2 ;
   private String A4814FacEncCli ;
   private String A5172FacDishCod ;
   private String A9708FacDscII ;
   private String A10271FacAcs ;
   private String Combo_meivaid_Objectcall ;
   private String Combo_meivaid_Class ;
   private String Combo_meivaid_Icontype ;
   private String Combo_meivaid_Icon ;
   private String Combo_meivaid_Tooltip ;
   private String Combo_meivaid_Selectedvalue_set ;
   private String Combo_meivaid_Selectedtext_set ;
   private String Combo_meivaid_Selectedtext_get ;
   private String Combo_meivaid_Gamoauthtoken ;
   private String Combo_meivaid_Ddointernalname ;
   private String Combo_meivaid_Titlecontrolalign ;
   private String Combo_meivaid_Dropdownoptionstype ;
   private String Combo_meivaid_Titlecontrolidtoreplace ;
   private String Combo_meivaid_Datalisttype ;
   private String Combo_meivaid_Datalistfixedvalues ;
   private String Combo_meivaid_Datalistproc ;
   private String Combo_meivaid_Datalistprocparametersprefix ;
   private String Combo_meivaid_Remoteservicesparameters ;
   private String Combo_meivaid_Htmltemplate ;
   private String Combo_meivaid_Multiplevaluestype ;
   private String Combo_meivaid_Loadingdata ;
   private String Combo_meivaid_Noresultsfound ;
   private String Combo_meivaid_Onlyselectedvalues ;
   private String Combo_meivaid_Selectalltext ;
   private String Combo_meivaid_Multiplevaluesseparator ;
   private String Combo_meivaid_Addnewoptiontext ;
   private String Dvpanel_unnamedtable4_Objectcall ;
   private String Dvpanel_unnamedtable4_Class ;
   private String Dvpanel_unnamedtable4_Height ;
   private String Combo_facfpg_Objectcall ;
   private String Combo_facfpg_Class ;
   private String Combo_facfpg_Icontype ;
   private String Combo_facfpg_Icon ;
   private String Combo_facfpg_Tooltip ;
   private String Combo_facfpg_Selectedvalue_set ;
   private String Combo_facfpg_Selectedtext_set ;
   private String Combo_facfpg_Selectedtext_get ;
   private String Combo_facfpg_Gamoauthtoken ;
   private String Combo_facfpg_Ddointernalname ;
   private String Combo_facfpg_Titlecontrolalign ;
   private String Combo_facfpg_Dropdownoptionstype ;
   private String Combo_facfpg_Titlecontrolidtoreplace ;
   private String Combo_facfpg_Datalisttype ;
   private String Combo_facfpg_Datalistfixedvalues ;
   private String Combo_facfpg_Datalistproc ;
   private String Combo_facfpg_Datalistprocparametersprefix ;
   private String Combo_facfpg_Remoteservicesparameters ;
   private String Combo_facfpg_Htmltemplate ;
   private String Combo_facfpg_Multiplevaluestype ;
   private String Combo_facfpg_Loadingdata ;
   private String Combo_facfpg_Noresultsfound ;
   private String Combo_facfpg_Onlyselectedvalues ;
   private String Combo_facfpg_Selectalltext ;
   private String Combo_facfpg_Multiplevaluesseparator ;
   private String Combo_facfpg_Addnewoptiontext ;
   private String Dvpanel_unnamedtable5_Objectcall ;
   private String Dvpanel_unnamedtable5_Class ;
   private String Dvpanel_unnamedtable5_Height ;
   private String Dvpanel_unnamedtable6_Objectcall ;
   private String Dvpanel_unnamedtable6_Class ;
   private String Dvpanel_unnamedtable6_Height ;
   private String Dvpanel_unnamedtable7_Objectcall ;
   private String Dvpanel_unnamedtable7_Class ;
   private String Dvpanel_unnamedtable7_Height ;
   private String Dvpanel_unnamedtable8_Objectcall ;
   private String Dvpanel_unnamedtable8_Class ;
   private String Dvpanel_unnamedtable8_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Dvelop_confirmpanel_eliminardocumento_Objectcall ;
   private String Dvelop_confirmpanel_eliminardocumento_Width ;
   private String Dvelop_confirmpanel_eliminardocumento_Height ;
   private String Dvelop_confirmpanel_eliminardocumento_Class ;
   private String Dvelop_confirmpanel_eliminardocumento_Comment ;
   private String Dvelop_confirmpanel_eliminardocumento_Bodytype ;
   private String Dvelop_confirmpanel_eliminardocumento_Bodycontentinternalname ;
   private String Dvelop_confirmpanel_eliminardocumento_Texttype ;
   private String hsh ;
   private String sMode43 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String A14247FacNHdr ;
   private String A454FacSer ;
   private String A432FacDsc ;
   private String AV53EmprNom ;
   private String AV34ContDsc ;
   private String GXt_char1 ;
   private String AV47Cadena ;
   private String AV48firma ;
   private String AV49Hash ;
   private String AV45EmpCod ;
   private String Z407EmprNom ;
   private String Z953IvaCod ;
   private String Z279CliNom ;
   private String Z1360ZonGeoNom ;
   private String GXCCtl ;
   private String sGXsfl_204_fel_idx="0001" ;
   private String subGridlevel_lineas_Class ;
   private String subGridlevel_lineas_Linesclass ;
   private String ROClassString ;
   private String edtFacLin_Jsonclick ;
   private String edtFacAlbCod_Jsonclick ;
   private String edtFacAlbTip_Jsonclick ;
   private String edtFacNHdr_Jsonclick ;
   private String edtFacMts_Jsonclick ;
   private String edtFacPreMts_Jsonclick ;
   private String edtFacKgs_Jsonclick ;
   private String edtFacPreKgs_Jsonclick ;
   private String edtFacUnds_Jsonclick ;
   private String edtFacPreUnd_Jsonclick ;
   private String edtFacRec_Jsonclick ;
   private String edtFacBonLi_Jsonclick ;
   private String edtFacImp_Jsonclick ;
   private String edtFacSer_Jsonclick ;
   private String edtFacBarCod_Jsonclick ;
   private String edtFacBarReo_Jsonclick ;
   private String edtFacBarPar_Jsonclick ;
   private String edtFacDsc_Jsonclick ;
   private String edtFacFasCod_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i14226FacAnulada ;
   private String subGridlevel_lineas_Header ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char21[] ;
   private String GXv_char20[] ;
   private java.util.Date Z9606FacHor ;
   private java.util.Date Z14227FacFecAnul ;
   private java.util.Date Z14229FacSFD ;
   private java.util.Date Z14420FacEnvMail ;
   private java.util.Date N9606FacHor ;
   private java.util.Date Z14239FACLinTRMF ;
   private java.util.Date A9606FacHor ;
   private java.util.Date A14227FacFecAnul ;
   private java.util.Date A14229FacSFD ;
   private java.util.Date A14420FacEnvMail ;
   private java.util.Date A14239FACLinTRMF ;
   private java.util.Date GXv_dtime12[] ;
   private java.util.Date Z436FacFch ;
   private java.util.Date N436FacFch ;
   private java.util.Date Z3899FacFecAlb ;
   private java.util.Date AV17Facfch ;
   private java.util.Date A436FacFch ;
   private java.util.Date A3899FacFecAlb ;
   private java.util.Date GXv_date15[] ;
   private java.util.Date ZV17Facfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n11629MeivaId ;
   private boolean n14217MotAnuID ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
   private boolean Dvpanel_unnamedtable5_Autowidth ;
   private boolean Dvpanel_unnamedtable5_Autoheight ;
   private boolean Dvpanel_unnamedtable5_Collapsible ;
   private boolean Dvpanel_unnamedtable5_Collapsed ;
   private boolean Dvpanel_unnamedtable5_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable5_Autoscroll ;
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
   private boolean n3918FacImpTot1 ;
   private boolean bGXsfl_204_Refreshing=false ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private boolean n407EmprNom ;
   private boolean n953IvaCod ;
   private boolean n11630MeivaDsc ;
   private boolean n1360ZonGeoNom ;
   private boolean Combo_meivaid_Enabled ;
   private boolean Combo_meivaid_Visible ;
   private boolean Combo_meivaid_Allowmultipleselection ;
   private boolean Combo_meivaid_Isgriditem ;
   private boolean Combo_meivaid_Hasdescription ;
   private boolean Combo_meivaid_Includeonlyselectedoption ;
   private boolean Combo_meivaid_Includeselectalloption ;
   private boolean Combo_meivaid_Emptyitem ;
   private boolean Combo_meivaid_Includeaddnewoption ;
   private boolean Dvpanel_unnamedtable4_Enabled ;
   private boolean Dvpanel_unnamedtable4_Showheader ;
   private boolean Dvpanel_unnamedtable4_Visible ;
   private boolean Combo_facfpg_Enabled ;
   private boolean Combo_facfpg_Visible ;
   private boolean Combo_facfpg_Allowmultipleselection ;
   private boolean Combo_facfpg_Isgriditem ;
   private boolean Combo_facfpg_Hasdescription ;
   private boolean Combo_facfpg_Includeonlyselectedoption ;
   private boolean Combo_facfpg_Includeselectalloption ;
   private boolean Combo_facfpg_Emptyitem ;
   private boolean Combo_facfpg_Includeaddnewoption ;
   private boolean Dvpanel_unnamedtable5_Enabled ;
   private boolean Dvpanel_unnamedtable5_Showheader ;
   private boolean Dvpanel_unnamedtable5_Visible ;
   private boolean Dvpanel_unnamedtable6_Enabled ;
   private boolean Dvpanel_unnamedtable6_Showheader ;
   private boolean Dvpanel_unnamedtable6_Visible ;
   private boolean Dvpanel_unnamedtable7_Enabled ;
   private boolean Dvpanel_unnamedtable7_Showheader ;
   private boolean Dvpanel_unnamedtable7_Visible ;
   private boolean Dvpanel_unnamedtable8_Enabled ;
   private boolean Dvpanel_unnamedtable8_Showheader ;
   private boolean Dvpanel_unnamedtable8_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Dvelop_confirmpanel_eliminardocumento_Enabled ;
   private boolean Dvelop_confirmpanel_eliminardocumento_Visible ;
   private boolean returnInSub ;
   private boolean AV51ok ;
   private boolean GXv_boolean10[] ;
   private boolean Gx_longc ;
   private String A7210FacObs ;
   private String Z7210FacObs ;
   private String Z14231FacMsgATe ;
   private String Z14233FacMsgATc ;
   private String Z14235FacMsgATd ;
   private String Z11273FacObs2 ;
   private String A11273FacObs2 ;
   private String AV36Texto_fd ;
   private String A14231FacMsgATe ;
   private String A14233FacMsgATc ;
   private String A14235FacMsgATd ;
   private String A11630MeivaDsc ;
   private String A14228MotAnuDc ;
   private String AV41ComboSelectedValue ;
   private String Z14228MotAnuDc ;
   private String Z11630MeivaDsc ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_lineasContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_lineasRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_lineasColumn ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucCombo_meivaid ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucCombo_facfpg ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable6 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable7 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable8 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminardocumento ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbFacEst ;
   private HTMLChoice cmbFacAnulada ;
   private IDataStoreProvider pr_default ;
   private String[] T01TR6_A407EmprNom ;
   private boolean[] T01TR6_n407EmprNom ;
   private byte[] T01TR6_A7209Colombia ;
   private boolean[] T01TR6_n7209Colombia ;
   private String[] T01TR6_A953IvaCod ;
   private boolean[] T01TR6_n953IvaCod ;
   private java.math.BigDecimal[] T01TR12_A3918FacImpTot1 ;
   private boolean[] T01TR12_n3918FacImpTot1 ;
   private String[] T01TR9_A14228MotAnuDc ;
   private String[] T01TR8_A279CliNom ;
   private short[] T01TR8_A858ZonGeoCod ;
   private String[] T01TR10_A1360ZonGeoNom ;
   private boolean[] T01TR10_n1360ZonGeoNom ;
   private String[] T01TR7_A11630MeivaDsc ;
   private boolean[] T01TR7_n11630MeivaDsc ;
   private String[] T01TR14_A7210FacObs ;
   private int[] T01TR14_A430FacCod ;
   private String[] T01TR14_A437FacFpg ;
   private String[] T01TR14_A407EmprNom ;
   private boolean[] T01TR14_n407EmprNom ;
   private java.util.Date[] T01TR14_A436FacFch ;
   private String[] T01TR14_A450FacPri ;
   private String[] T01TR14_A279CliNom ;
   private java.math.BigDecimal[] T01TR14_A433FacDtoGen ;
   private java.math.BigDecimal[] T01TR14_A434FacDtoPP ;
   private String[] T01TR14_A960FacIVACod ;
   private byte[] T01TR14_A443FacIVAPor ;
   private java.math.BigDecimal[] T01TR14_A453FacRECPor ;
   private byte[] T01TR14_A435FacEst ;
   private int[] T01TR14_A445FacLiC ;
   private String[] T01TR14_A965FacCob ;
   private byte[] T01TR14_A1150FacNumVto ;
   private String[] T01TR14_A1151FacPer ;
   private String[] T01TR14_A1152FacDiaPag ;
   private byte[] T01TR14_A1153FacTipFac ;
   private String[] T01TR14_A2739FacSerNum ;
   private java.math.BigDecimal[] T01TR14_A6632FacDto ;
   private java.math.BigDecimal[] T01TR14_A7211Factrm ;
   private java.math.BigDecimal[] T01TR14_A7212FacRect ;
   private String[] T01TR14_A9605FacFirma ;
   private java.util.Date[] T01TR14_A9606FacHor ;
   private java.math.BigDecimal[] T01TR14_A9643FacLiq1 ;
   private java.math.BigDecimal[] T01TR14_A9644FacLiq2 ;
   private java.math.BigDecimal[] T01TR14_A9645FacIva1 ;
   private java.math.BigDecimal[] T01TR14_A9646FacTot1 ;
   private String[] T01TR14_A1360ZonGeoNom ;
   private boolean[] T01TR14_n1360ZonGeoNom ;
   private String[] T01TR14_A9710FacFirDg ;
   private byte[] T01TR14_A10417FacCliPgL ;
   private String[] T01TR14_A10418FacAran ;
   private java.math.BigDecimal[] T01TR14_A10419FacBrut ;
   private java.math.BigDecimal[] T01TR14_A10420FacNet ;
   private String[] T01TR14_A10421FacInc ;
   private String[] T01TR14_A10422FacFre ;
   private String[] T01TR14_A10423FacExp ;
   private java.math.BigDecimal[] T01TR14_A11513FacRecIca ;
   private String[] T01TR14_A12523FacTpFra ;
   private String[] T01TR14_A11626FacMan ;
   private java.math.BigDecimal[] T01TR14_A14219FacEnergia ;
   private java.math.BigDecimal[] T01TR14_A14224FacCostFac ;
   private java.math.BigDecimal[] T01TR14_A14222FacCostMts ;
   private java.math.BigDecimal[] T01TR14_A14223FacCostKgs ;
   private String[] T01TR14_A14226FacAnulada ;
   private java.util.Date[] T01TR14_A14227FacFecAnul ;
   private String[] T01TR14_A14228MotAnuDc ;
   private String[] T01TR14_A11630MeivaDsc ;
   private boolean[] T01TR14_n11630MeivaDsc ;
   private java.util.Date[] T01TR14_A14229FacSFD ;
   private String[] T01TR14_A14230FacIDATe ;
   private String[] T01TR14_A14231FacMsgATe ;
   private String[] T01TR14_A14232FacIDATc ;
   private String[] T01TR14_A14233FacMsgATc ;
   private String[] T01TR14_A14234FacIDATd ;
   private String[] T01TR14_A14235FacMsgATd ;
   private String[] T01TR14_A14236FacSerAT ;
   private String[] T01TR14_A14237FacTipAT ;
   private String[] T01TR14_A11273FacObs2 ;
   private java.util.Date[] T01TR14_A14420FacEnvMail ;
   private java.math.BigDecimal[] T01TR14_A8346FacRecI ;
   private boolean[] T01TR14_n8346FacRecI ;
   private byte[] T01TR14_A7209Colombia ;
   private boolean[] T01TR14_n7209Colombia ;
   private String[] T01TR14_A396EmprCod ;
   private int[] T01TR14_A252CliCod ;
   private String[] T01TR14_A11629MeivaId ;
   private boolean[] T01TR14_n11629MeivaId ;
   private String[] T01TR14_A14217MotAnuID ;
   private boolean[] T01TR14_n14217MotAnuID ;
   private String[] T01TR14_A953IvaCod ;
   private boolean[] T01TR14_n953IvaCod ;
   private short[] T01TR14_A858ZonGeoCod ;
   private java.math.BigDecimal[] T01TR14_A3918FacImpTot1 ;
   private boolean[] T01TR14_n3918FacImpTot1 ;
   private String[] T01TR15_A11630MeivaDsc ;
   private boolean[] T01TR15_n11630MeivaDsc ;
   private String[] T01TR16_A279CliNom ;
   private short[] T01TR16_A858ZonGeoCod ;
   private String[] T01TR17_A14228MotAnuDc ;
   private String[] T01TR18_A1360ZonGeoNom ;
   private boolean[] T01TR18_n1360ZonGeoNom ;
   private java.math.BigDecimal[] T01TR20_A3918FacImpTot1 ;
   private boolean[] T01TR20_n3918FacImpTot1 ;
   private String[] T01TR21_A396EmprCod ;
   private int[] T01TR21_A430FacCod ;
   private String[] T01TR5_A7210FacObs ;
   private int[] T01TR5_A430FacCod ;
   private String[] T01TR5_A437FacFpg ;
   private java.util.Date[] T01TR5_A436FacFch ;
   private String[] T01TR5_A450FacPri ;
   private java.math.BigDecimal[] T01TR5_A433FacDtoGen ;
   private java.math.BigDecimal[] T01TR5_A434FacDtoPP ;
   private String[] T01TR5_A960FacIVACod ;
   private byte[] T01TR5_A443FacIVAPor ;
   private java.math.BigDecimal[] T01TR5_A453FacRECPor ;
   private byte[] T01TR5_A435FacEst ;
   private int[] T01TR5_A445FacLiC ;
   private String[] T01TR5_A965FacCob ;
   private byte[] T01TR5_A1150FacNumVto ;
   private String[] T01TR5_A1151FacPer ;
   private String[] T01TR5_A1152FacDiaPag ;
   private byte[] T01TR5_A1153FacTipFac ;
   private String[] T01TR5_A2739FacSerNum ;
   private java.math.BigDecimal[] T01TR5_A6632FacDto ;
   private java.math.BigDecimal[] T01TR5_A7211Factrm ;
   private java.math.BigDecimal[] T01TR5_A7212FacRect ;
   private String[] T01TR5_A9605FacFirma ;
   private java.util.Date[] T01TR5_A9606FacHor ;
   private java.math.BigDecimal[] T01TR5_A9643FacLiq1 ;
   private java.math.BigDecimal[] T01TR5_A9644FacLiq2 ;
   private java.math.BigDecimal[] T01TR5_A9645FacIva1 ;
   private java.math.BigDecimal[] T01TR5_A9646FacTot1 ;
   private String[] T01TR5_A9710FacFirDg ;
   private byte[] T01TR5_A10417FacCliPgL ;
   private String[] T01TR5_A10418FacAran ;
   private java.math.BigDecimal[] T01TR5_A10419FacBrut ;
   private java.math.BigDecimal[] T01TR5_A10420FacNet ;
   private String[] T01TR5_A10421FacInc ;
   private String[] T01TR5_A10422FacFre ;
   private String[] T01TR5_A10423FacExp ;
   private java.math.BigDecimal[] T01TR5_A11513FacRecIca ;
   private String[] T01TR5_A12523FacTpFra ;
   private String[] T01TR5_A11626FacMan ;
   private java.math.BigDecimal[] T01TR5_A14219FacEnergia ;
   private java.math.BigDecimal[] T01TR5_A14224FacCostFac ;
   private java.math.BigDecimal[] T01TR5_A14222FacCostMts ;
   private java.math.BigDecimal[] T01TR5_A14223FacCostKgs ;
   private String[] T01TR5_A14226FacAnulada ;
   private java.util.Date[] T01TR5_A14227FacFecAnul ;
   private java.util.Date[] T01TR5_A14229FacSFD ;
   private String[] T01TR5_A14230FacIDATe ;
   private String[] T01TR5_A14231FacMsgATe ;
   private String[] T01TR5_A14232FacIDATc ;
   private String[] T01TR5_A14233FacMsgATc ;
   private String[] T01TR5_A14234FacIDATd ;
   private String[] T01TR5_A14235FacMsgATd ;
   private String[] T01TR5_A14236FacSerAT ;
   private String[] T01TR5_A14237FacTipAT ;
   private String[] T01TR5_A11273FacObs2 ;
   private java.util.Date[] T01TR5_A14420FacEnvMail ;
   private java.math.BigDecimal[] T01TR5_A8346FacRecI ;
   private boolean[] T01TR5_n8346FacRecI ;
   private String[] T01TR5_A396EmprCod ;
   private int[] T01TR5_A252CliCod ;
   private String[] T01TR5_A11629MeivaId ;
   private boolean[] T01TR5_n11629MeivaId ;
   private String[] T01TR5_A14217MotAnuID ;
   private boolean[] T01TR5_n14217MotAnuID ;
   private String[] T01TR22_A396EmprCod ;
   private int[] T01TR22_A430FacCod ;
   private String[] T01TR23_A396EmprCod ;
   private int[] T01TR23_A430FacCod ;
   private String[] T01TR4_A7210FacObs ;
   private int[] T01TR4_A430FacCod ;
   private String[] T01TR4_A437FacFpg ;
   private java.util.Date[] T01TR4_A436FacFch ;
   private String[] T01TR4_A450FacPri ;
   private java.math.BigDecimal[] T01TR4_A433FacDtoGen ;
   private java.math.BigDecimal[] T01TR4_A434FacDtoPP ;
   private String[] T01TR4_A960FacIVACod ;
   private byte[] T01TR4_A443FacIVAPor ;
   private java.math.BigDecimal[] T01TR4_A453FacRECPor ;
   private byte[] T01TR4_A435FacEst ;
   private int[] T01TR4_A445FacLiC ;
   private String[] T01TR4_A965FacCob ;
   private byte[] T01TR4_A1150FacNumVto ;
   private String[] T01TR4_A1151FacPer ;
   private String[] T01TR4_A1152FacDiaPag ;
   private byte[] T01TR4_A1153FacTipFac ;
   private String[] T01TR4_A2739FacSerNum ;
   private java.math.BigDecimal[] T01TR4_A6632FacDto ;
   private java.math.BigDecimal[] T01TR4_A7211Factrm ;
   private java.math.BigDecimal[] T01TR4_A7212FacRect ;
   private String[] T01TR4_A9605FacFirma ;
   private java.util.Date[] T01TR4_A9606FacHor ;
   private java.math.BigDecimal[] T01TR4_A9643FacLiq1 ;
   private java.math.BigDecimal[] T01TR4_A9644FacLiq2 ;
   private java.math.BigDecimal[] T01TR4_A9645FacIva1 ;
   private java.math.BigDecimal[] T01TR4_A9646FacTot1 ;
   private String[] T01TR4_A9710FacFirDg ;
   private byte[] T01TR4_A10417FacCliPgL ;
   private String[] T01TR4_A10418FacAran ;
   private java.math.BigDecimal[] T01TR4_A10419FacBrut ;
   private java.math.BigDecimal[] T01TR4_A10420FacNet ;
   private String[] T01TR4_A10421FacInc ;
   private String[] T01TR4_A10422FacFre ;
   private String[] T01TR4_A10423FacExp ;
   private java.math.BigDecimal[] T01TR4_A11513FacRecIca ;
   private String[] T01TR4_A12523FacTpFra ;
   private String[] T01TR4_A11626FacMan ;
   private java.math.BigDecimal[] T01TR4_A14219FacEnergia ;
   private java.math.BigDecimal[] T01TR4_A14224FacCostFac ;
   private java.math.BigDecimal[] T01TR4_A14222FacCostMts ;
   private java.math.BigDecimal[] T01TR4_A14223FacCostKgs ;
   private String[] T01TR4_A14226FacAnulada ;
   private java.util.Date[] T01TR4_A14227FacFecAnul ;
   private java.util.Date[] T01TR4_A14229FacSFD ;
   private String[] T01TR4_A14230FacIDATe ;
   private String[] T01TR4_A14231FacMsgATe ;
   private String[] T01TR4_A14232FacIDATc ;
   private String[] T01TR4_A14233FacMsgATc ;
   private String[] T01TR4_A14234FacIDATd ;
   private String[] T01TR4_A14235FacMsgATd ;
   private String[] T01TR4_A14236FacSerAT ;
   private String[] T01TR4_A14237FacTipAT ;
   private String[] T01TR4_A11273FacObs2 ;
   private java.util.Date[] T01TR4_A14420FacEnvMail ;
   private java.math.BigDecimal[] T01TR4_A8346FacRecI ;
   private boolean[] T01TR4_n8346FacRecI ;
   private String[] T01TR4_A396EmprCod ;
   private int[] T01TR4_A252CliCod ;
   private String[] T01TR4_A11629MeivaId ;
   private boolean[] T01TR4_n11629MeivaId ;
   private String[] T01TR4_A14217MotAnuID ;
   private boolean[] T01TR4_n14217MotAnuID ;
   private String[] T01TR27_A11630MeivaDsc ;
   private boolean[] T01TR27_n11630MeivaDsc ;
   private String[] T01TR28_A279CliNom ;
   private short[] T01TR28_A858ZonGeoCod ;
   private String[] T01TR29_A14228MotAnuDc ;
   private String[] T01TR30_A1360ZonGeoNom ;
   private boolean[] T01TR30_n1360ZonGeoNom ;
   private java.math.BigDecimal[] T01TR32_A3918FacImpTot1 ;
   private boolean[] T01TR32_n3918FacImpTot1 ;
   private String[] T01TR33_A396EmprCod ;
   private int[] T01TR33_A430FacCod ;
   private int[] T01TR34_A430FacCod ;
   private int[] T01TR34_A446FacLin ;
   private java.math.BigDecimal[] T01TR34_A5050FacBonLi ;
   private long[] T01TR34_A427FacAlbCod ;
   private int[] T01TR34_A1294FacBarCod ;
   private byte[] T01TR34_A1295FacBarReo ;
   private String[] T01TR34_A1296FacBarPar ;
   private byte[] T01TR34_A428FacAlbTip ;
   private String[] T01TR34_A454FacSer ;
   private String[] T01TR34_A432FacDsc ;
   private String[] T01TR34_A1498FacDisNum ;
   private java.math.BigDecimal[] T01TR34_A447FacMts ;
   private java.math.BigDecimal[] T01TR34_A449FacPreMts ;
   private java.math.BigDecimal[] T01TR34_A444FacKgs ;
   private java.math.BigDecimal[] T01TR34_A448FacPreKgs ;
   private java.math.BigDecimal[] T01TR34_A451FacRec ;
   private String[] T01TR34_A3097FacTipPro ;
   private short[] T01TR34_A3303FacNPart ;
   private String[] T01TR34_A3397FacFasCod ;
   private String[] T01TR34_A3878FacColNom ;
   private int[] T01TR34_A3879FocColNum ;
   private byte[] T01TR34_A3880FacTipColC ;
   private String[] T01TR34_A3881FacNomCol ;
   private int[] T01TR34_A3882FacNumCol ;
   private int[] T01TR34_A3883FacCliCod ;
   private String[] T01TR34_A3884FacProCod ;
   private String[] T01TR34_A4389FacDsc2 ;
   private String[] T01TR34_A4814FacEncCli ;
   private String[] T01TR34_A5172FacDishCod ;
   private short[] T01TR34_A5189FacTipArt ;
   private java.math.BigDecimal[] T01TR34_A5353FacImpMan ;
   private java.math.BigDecimal[] T01TR34_A5355FacImpMin ;
   private java.math.BigDecimal[] T01TR34_A3898FacPreKgsA ;
   private java.math.BigDecimal[] T01TR34_A6837FacCosPQ ;
   private java.math.BigDecimal[] T01TR34_A9647FacImpdto ;
   private java.math.BigDecimal[] T01TR34_A9648FacDtoL ;
   private java.math.BigDecimal[] T01TR34_A9649FacPKDto ;
   private java.math.BigDecimal[] T01TR34_A9650FacPMdto ;
   private java.math.BigDecimal[] T01TR34_A9651FacImpd ;
   private String[] T01TR34_A9708FacDscII ;
   private String[] T01TR34_A10271FacAcs ;
   private java.math.BigDecimal[] T01TR34_A3897FacKgsA ;
   private java.util.Date[] T01TR34_A3899FacFecAlb ;
   private int[] T01TR34_A12197FacUnds ;
   private java.math.BigDecimal[] T01TR34_A12198FacPreUnd ;
   private short[] T01TR34_A12906FacCadEnc ;
   private java.math.BigDecimal[] T01TR34_A14238FacLinTRM ;
   private java.util.Date[] T01TR34_A14239FACLinTRMF ;
   private String[] T01TR34_A396EmprCod ;
   private String[] T01TR35_A396EmprCod ;
   private int[] T01TR35_A430FacCod ;
   private int[] T01TR35_A446FacLin ;
   private int[] T01TR3_A430FacCod ;
   private int[] T01TR3_A446FacLin ;
   private java.math.BigDecimal[] T01TR3_A5050FacBonLi ;
   private long[] T01TR3_A427FacAlbCod ;
   private int[] T01TR3_A1294FacBarCod ;
   private byte[] T01TR3_A1295FacBarReo ;
   private String[] T01TR3_A1296FacBarPar ;
   private byte[] T01TR3_A428FacAlbTip ;
   private String[] T01TR3_A454FacSer ;
   private String[] T01TR3_A432FacDsc ;
   private String[] T01TR3_A1498FacDisNum ;
   private java.math.BigDecimal[] T01TR3_A447FacMts ;
   private java.math.BigDecimal[] T01TR3_A449FacPreMts ;
   private java.math.BigDecimal[] T01TR3_A444FacKgs ;
   private java.math.BigDecimal[] T01TR3_A448FacPreKgs ;
   private java.math.BigDecimal[] T01TR3_A451FacRec ;
   private String[] T01TR3_A3097FacTipPro ;
   private short[] T01TR3_A3303FacNPart ;
   private String[] T01TR3_A3397FacFasCod ;
   private String[] T01TR3_A3878FacColNom ;
   private int[] T01TR3_A3879FocColNum ;
   private byte[] T01TR3_A3880FacTipColC ;
   private String[] T01TR3_A3881FacNomCol ;
   private int[] T01TR3_A3882FacNumCol ;
   private int[] T01TR3_A3883FacCliCod ;
   private String[] T01TR3_A3884FacProCod ;
   private String[] T01TR3_A4389FacDsc2 ;
   private String[] T01TR3_A4814FacEncCli ;
   private String[] T01TR3_A5172FacDishCod ;
   private short[] T01TR3_A5189FacTipArt ;
   private java.math.BigDecimal[] T01TR3_A5353FacImpMan ;
   private java.math.BigDecimal[] T01TR3_A5355FacImpMin ;
   private java.math.BigDecimal[] T01TR3_A3898FacPreKgsA ;
   private java.math.BigDecimal[] T01TR3_A6837FacCosPQ ;
   private java.math.BigDecimal[] T01TR3_A9647FacImpdto ;
   private java.math.BigDecimal[] T01TR3_A9648FacDtoL ;
   private java.math.BigDecimal[] T01TR3_A9649FacPKDto ;
   private java.math.BigDecimal[] T01TR3_A9650FacPMdto ;
   private java.math.BigDecimal[] T01TR3_A9651FacImpd ;
   private String[] T01TR3_A9708FacDscII ;
   private String[] T01TR3_A10271FacAcs ;
   private java.math.BigDecimal[] T01TR3_A3897FacKgsA ;
   private java.util.Date[] T01TR3_A3899FacFecAlb ;
   private int[] T01TR3_A12197FacUnds ;
   private java.math.BigDecimal[] T01TR3_A12198FacPreUnd ;
   private short[] T01TR3_A12906FacCadEnc ;
   private java.math.BigDecimal[] T01TR3_A14238FacLinTRM ;
   private java.util.Date[] T01TR3_A14239FACLinTRMF ;
   private String[] T01TR3_A396EmprCod ;
   private int[] T01TR2_A430FacCod ;
   private int[] T01TR2_A446FacLin ;
   private java.math.BigDecimal[] T01TR2_A5050FacBonLi ;
   private long[] T01TR2_A427FacAlbCod ;
   private int[] T01TR2_A1294FacBarCod ;
   private byte[] T01TR2_A1295FacBarReo ;
   private String[] T01TR2_A1296FacBarPar ;
   private byte[] T01TR2_A428FacAlbTip ;
   private String[] T01TR2_A454FacSer ;
   private String[] T01TR2_A432FacDsc ;
   private String[] T01TR2_A1498FacDisNum ;
   private java.math.BigDecimal[] T01TR2_A447FacMts ;
   private java.math.BigDecimal[] T01TR2_A449FacPreMts ;
   private java.math.BigDecimal[] T01TR2_A444FacKgs ;
   private java.math.BigDecimal[] T01TR2_A448FacPreKgs ;
   private java.math.BigDecimal[] T01TR2_A451FacRec ;
   private String[] T01TR2_A3097FacTipPro ;
   private short[] T01TR2_A3303FacNPart ;
   private String[] T01TR2_A3397FacFasCod ;
   private String[] T01TR2_A3878FacColNom ;
   private int[] T01TR2_A3879FocColNum ;
   private byte[] T01TR2_A3880FacTipColC ;
   private String[] T01TR2_A3881FacNomCol ;
   private int[] T01TR2_A3882FacNumCol ;
   private int[] T01TR2_A3883FacCliCod ;
   private String[] T01TR2_A3884FacProCod ;
   private String[] T01TR2_A4389FacDsc2 ;
   private String[] T01TR2_A4814FacEncCli ;
   private String[] T01TR2_A5172FacDishCod ;
   private short[] T01TR2_A5189FacTipArt ;
   private java.math.BigDecimal[] T01TR2_A5353FacImpMan ;
   private java.math.BigDecimal[] T01TR2_A5355FacImpMin ;
   private java.math.BigDecimal[] T01TR2_A3898FacPreKgsA ;
   private java.math.BigDecimal[] T01TR2_A6837FacCosPQ ;
   private java.math.BigDecimal[] T01TR2_A9647FacImpdto ;
   private java.math.BigDecimal[] T01TR2_A9648FacDtoL ;
   private java.math.BigDecimal[] T01TR2_A9649FacPKDto ;
   private java.math.BigDecimal[] T01TR2_A9650FacPMdto ;
   private java.math.BigDecimal[] T01TR2_A9651FacImpd ;
   private String[] T01TR2_A9708FacDscII ;
   private String[] T01TR2_A10271FacAcs ;
   private java.math.BigDecimal[] T01TR2_A3897FacKgsA ;
   private java.util.Date[] T01TR2_A3899FacFecAlb ;
   private int[] T01TR2_A12197FacUnds ;
   private java.math.BigDecimal[] T01TR2_A12198FacPreUnd ;
   private short[] T01TR2_A12906FacCadEnc ;
   private java.math.BigDecimal[] T01TR2_A14238FacLinTRM ;
   private java.util.Date[] T01TR2_A14239FACLinTRMF ;
   private String[] T01TR2_A396EmprCod ;
   private String[] T01TR39_A396EmprCod ;
   private int[] T01TR39_A430FacCod ;
   private int[] T01TR39_A446FacLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV40MeivaId_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV43FacFpg_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item13 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item14[] ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV50Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message9[] ;
   private com.genexus.SdtMessages_Message AV52Message ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV15TrnContextAtt ;
}

final  class mantenimientofactura__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mantenimientofactura__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mantenimientofactura__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mantenimientofactura__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mantenimientofactura__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TR2", "SELECT FacCod, FacLin, FacBonLi, FacAlbCod, FacBarCod, FacBarReo, FacBarPar, FacAlbTip, FacSer, FacDsc, FacDisNum, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacTipPro, FacNPart, FacFasCod, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacDsc2, FacEncCli, FacDishCod, FacTipArt, FacImpMan, FacImpMin, FacPreKgsA, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacCadEnc, FacLinTRM, FACLinTRMF, EmprCod FROM TXPLFAVEN WHERE EmprCod = ? AND FacCod = ? AND FacLin = ?  FOR UPDATE OF FacBonLi, FacAlbCod, FacBarCod, FacBarReo, FacBarPar, FacAlbTip, FacSer, FacDsc, FacDisNum, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacTipPro, FacNPart, FacFasCod, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacDsc2, FacEncCli, FacDishCod, FacTipArt, FacImpMan, FacImpMin, FacPreKgsA, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacCadEnc, FacLinTRM, FACLinTRMF NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR3", "SELECT FacCod, FacLin, FacBonLi, FacAlbCod, FacBarCod, FacBarReo, FacBarPar, FacAlbTip, FacSer, FacDsc, FacDisNum, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacTipPro, FacNPart, FacFasCod, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacDsc2, FacEncCli, FacDishCod, FacTipArt, FacImpMan, FacImpMin, FacPreKgsA, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacCadEnc, FacLinTRM, FACLinTRMF, EmprCod FROM TXPLFAVEN WHERE EmprCod = ? AND FacCod = ? AND FacLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR4", "SELECT FacObs, FacCod, FacFpg, FacFch, FacPri, FacDtoGen, FacDtoPP, FacIVACod, FacIVAPor, FacRECPor, FacEst, FacLiC, FacCob, FacNumVto, FacPer, FacDiaPag, FacTipFac, FacSerNum, FacDto, Factrm, FacRect, FacFirma, FacHor, FacLiq1, FacLiq2, FacIva1, FacTot1, FacFirDg, FacCliPgL, FacAran, FacBrut, FacNet, FacInc, FacFre, FacExp, FacRecIca, FacTpFra, FacMan, FacEnergia, FacCostFac, FacCostMts, FacCostKgs, FacAnulada, FacFecAnul, FacSFD, FacIDATe, FacMsgATe, FacIDATc, FacMsgATc, FacIDATd, FacMsgATd, FacSerAT, FacTipAT, FacObs2, FacEnvMail, FacRecI, EmprCod, CliCod, MeivaId, MotAnuID FROM TXPCFAVEN WHERE EmprCod = ? AND FacCod = ?  FOR UPDATE OF FacFpg, FacFch, FacPri, FacDtoGen, FacDtoPP, FacIVACod, FacIVAPor, FacRECPor, FacEst, FacLiC, FacCob, FacNumVto, FacPer, FacDiaPag, FacTipFac, FacSerNum, FacDto, FacObs, Factrm, FacRect, FacFirma, FacHor, FacLiq1, FacLiq2, FacIva1, FacTot1, FacFirDg, FacCliPgL, FacAran, FacBrut, FacNet, FacInc, FacFre, FacExp, FacRecIca, FacTpFra, FacMan, FacEnergia, FacCostFac, FacCostMts, FacCostKgs, FacAnulada, FacFecAnul, FacSFD, FacIDATe, FacMsgATe, FacIDATc, FacMsgATc, FacIDATd, FacMsgATd, FacSerAT, FacTipAT, FacObs2, FacEnvMail, FacRecI, CliCod, MeivaId, MotAnuID NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR5", "SELECT FacObs, FacCod, FacFpg, FacFch, FacPri, FacDtoGen, FacDtoPP, FacIVACod, FacIVAPor, FacRECPor, FacEst, FacLiC, FacCob, FacNumVto, FacPer, FacDiaPag, FacTipFac, FacSerNum, FacDto, Factrm, FacRect, FacFirma, FacHor, FacLiq1, FacLiq2, FacIva1, FacTot1, FacFirDg, FacCliPgL, FacAran, FacBrut, FacNet, FacInc, FacFre, FacExp, FacRecIca, FacTpFra, FacMan, FacEnergia, FacCostFac, FacCostMts, FacCostKgs, FacAnulada, FacFecAnul, FacSFD, FacIDATe, FacMsgATe, FacIDATc, FacMsgATc, FacIDATd, FacMsgATd, FacSerAT, FacTipAT, FacObs2, FacEnvMail, FacRecI, EmprCod, CliCod, MeivaId, MotAnuID FROM TXPCFAVEN WHERE EmprCod = ? AND FacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR6", "SELECT EmprNom, Colombia, IvaCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR7", "SELECT MeivaDsc FROM TXPMEIVA WHERE EmprCod = ? AND MeivaId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR8", "SELECT CliNom, ZonGeoCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR9", "SELECT MotAnuDc FROM TXPMOTANU WHERE EmprCod = ? AND MotAnuID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR10", "SELECT ZonGeoNom FROM TXPZONGEO WHERE EmprCod = ? AND ZonGeoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR12", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1, EmprCod, FacCod FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR14", "SELECT /*+ FIRST_ROWS(100) */ TM1.FacObs, TM1.FacCod, TM1.FacFpg, T2.EmprNom, TM1.FacFch, TM1.FacPri, T3.CliNom, TM1.FacDtoGen, TM1.FacDtoPP, TM1.FacIVACod, TM1.FacIVAPor, TM1.FacRECPor, TM1.FacEst, TM1.FacLiC, TM1.FacCob, TM1.FacNumVto, TM1.FacPer, TM1.FacDiaPag, TM1.FacTipFac, TM1.FacSerNum, TM1.FacDto, TM1.Factrm, TM1.FacRect, TM1.FacFirma, TM1.FacHor, TM1.FacLiq1, TM1.FacLiq2, TM1.FacIva1, TM1.FacTot1, T5.ZonGeoNom, TM1.FacFirDg, TM1.FacCliPgL, TM1.FacAran, TM1.FacBrut, TM1.FacNet, TM1.FacInc, TM1.FacFre, TM1.FacExp, TM1.FacRecIca, TM1.FacTpFra, TM1.FacMan, TM1.FacEnergia, TM1.FacCostFac, TM1.FacCostMts, TM1.FacCostKgs, TM1.FacAnulada, TM1.FacFecAnul, T4.MotAnuDc, T7.MeivaDsc, TM1.FacSFD, TM1.FacIDATe, TM1.FacMsgATe, TM1.FacIDATc, TM1.FacMsgATc, TM1.FacIDATd, TM1.FacMsgATd, TM1.FacSerAT, TM1.FacTipAT, TM1.FacObs2, TM1.FacEnvMail, TM1.FacRecI, T2.Colombia, TM1.EmprCod, TM1.CliCod, TM1.MeivaId, TM1.MotAnuID, T2.IvaCod, T3.ZonGeoCod, COALESCE( T6.FacImpTot1, 0) AS FacImpTot1 FROM ((((((TXPCFAVEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPZONGEO T5 ON T5.EmprCod = TM1.EmprCod AND T5.ZonGeoCod = T3.ZonGeoCod) LEFT JOIN TXPMOTANU T4 ON T4.EmprCod = TM1.EmprCod AND T4.MotAnuID = TM1.MotAnuID) LEFT JOIN (SELECT SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1, EmprCod, FacCod FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T6 ON T6.EmprCod = TM1.EmprCod AND T6.FacCod = TM1.FacCod) LEFT JOIN TXPMEIVA T7 ON T7.EmprCod = TM1.EmprCod AND T7.MeivaId = TM1.MeivaId) WHERE TM1.EmprCod = ? and TM1.FacCod = ? ORDER BY TM1.EmprCod, TM1.FacCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR15", "SELECT MeivaDsc FROM TXPMEIVA WHERE EmprCod = ? AND MeivaId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR16", "SELECT CliNom, ZonGeoCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR17", "SELECT MotAnuDc FROM TXPMOTANU WHERE EmprCod = ? AND MotAnuID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR18", "SELECT ZonGeoNom FROM TXPZONGEO WHERE EmprCod = ? AND ZonGeoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR20", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1, EmprCod, FacCod FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR21", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, FacCod FROM TXPCFAVEN WHERE EmprCod = ? AND FacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR22", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FacCod FROM TXPCFAVEN WHERE ( EmprCod > ? or EmprCod = ? and FacCod > ?) ORDER BY EmprCod, FacCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TR23", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FacCod FROM TXPCFAVEN WHERE ( EmprCod < ? or EmprCod = ? and FacCod < ?) ORDER BY EmprCod DESC, FacCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TR24", "INSERT INTO TXPCFAVEN(FacCod, FacFpg, FacFch, FacPri, FacDtoGen, FacDtoPP, FacIVACod, FacIVAPor, FacRECPor, FacEst, FacLiC, FacCob, FacNumVto, FacPer, FacDiaPag, FacTipFac, FacSerNum, FacDto, FacObs, Factrm, FacRect, FacFirma, FacHor, FacLiq1, FacLiq2, FacIva1, FacTot1, FacFirDg, FacCliPgL, FacAran, FacBrut, FacNet, FacInc, FacFre, FacExp, FacRecIca, FacTpFra, FacMan, FacEnergia, FacCostFac, FacCostMts, FacCostKgs, FacAnulada, FacFecAnul, FacSFD, FacIDATe, FacMsgATe, FacIDATc, FacMsgATc, FacIDATd, FacMsgATd, FacSerAT, FacTipAT, FacObs2, FacEnvMail, FacRecI, EmprCod, CliCod, MeivaId, MotAnuID, FacRegIva, FacDivTCod, FacDivCod, FacRepCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, ' ')", GX_NOMASK, "TXPCFAVEN")
         ,new UpdateCursor("T01TR25", "UPDATE TXPCFAVEN SET FacFpg=?, FacFch=?, FacPri=?, FacDtoGen=?, FacDtoPP=?, FacIVACod=?, FacIVAPor=?, FacRECPor=?, FacEst=?, FacLiC=?, FacCob=?, FacNumVto=?, FacPer=?, FacDiaPag=?, FacTipFac=?, FacSerNum=?, FacDto=?, FacObs=?, Factrm=?, FacRect=?, FacFirma=?, FacHor=?, FacLiq1=?, FacLiq2=?, FacIva1=?, FacTot1=?, FacFirDg=?, FacCliPgL=?, FacAran=?, FacBrut=?, FacNet=?, FacInc=?, FacFre=?, FacExp=?, FacRecIca=?, FacTpFra=?, FacMan=?, FacEnergia=?, FacCostFac=?, FacCostMts=?, FacCostKgs=?, FacAnulada=?, FacFecAnul=?, FacSFD=?, FacIDATe=?, FacMsgATe=?, FacIDATc=?, FacMsgATc=?, FacIDATd=?, FacMsgATd=?, FacSerAT=?, FacTipAT=?, FacObs2=?, FacEnvMail=?, FacRecI=?, CliCod=?, MeivaId=?, MotAnuID=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK, "TXPCFAVEN")
         ,new UpdateCursor("T01TR26", "DELETE FROM TXPCFAVEN  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK, "TXPCFAVEN")
         ,new ForEachCursor("T01TR27", "SELECT MeivaDsc FROM TXPMEIVA WHERE EmprCod = ? AND MeivaId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR28", "SELECT CliNom, ZonGeoCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR29", "SELECT MotAnuDc FROM TXPMOTANU WHERE EmprCod = ? AND MotAnuID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR30", "SELECT ZonGeoNom FROM TXPZONGEO WHERE EmprCod = ? AND ZonGeoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR32", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1, EmprCod, FacCod FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR33", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, FacCod FROM TXPCFAVEN ORDER BY EmprCod, FacCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR34", "SELECT FacCod, FacLin, FacBonLi, FacAlbCod, FacBarCod, FacBarReo, FacBarPar, FacAlbTip, FacSer, FacDsc, FacDisNum, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacTipPro, FacNPart, FacFasCod, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacDsc2, FacEncCli, FacDishCod, FacTipArt, FacImpMan, FacImpMin, FacPreKgsA, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacCadEnc, FacLinTRM, FACLinTRMF, EmprCod FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? and FacLin = ? ORDER BY EmprCod, FacCod, FacLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TR35", "SELECT EmprCod, FacCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? AND FacCod = ? AND FacLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01TR36", "INSERT INTO TXPLFAVEN(FacCod, FacLin, FacBonLi, FacAlbCod, FacBarCod, FacBarReo, FacBarPar, FacAlbTip, FacSer, FacDsc, FacDisNum, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacTipPro, FacNPart, FacFasCod, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacDsc2, FacEncCli, FacDishCod, FacTipArt, FacImpMan, FacImpMin, FacPreKgsA, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacCadEnc, FacLinTRM, FACLinTRMF, EmprCod, FacInt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPLFAVEN")
         ,new UpdateCursor("T01TR37", "UPDATE TXPLFAVEN SET FacBonLi=?, FacAlbCod=?, FacBarCod=?, FacBarReo=?, FacBarPar=?, FacAlbTip=?, FacSer=?, FacDsc=?, FacDisNum=?, FacMts=?, FacPreMts=?, FacKgs=?, FacPreKgs=?, FacRec=?, FacTipPro=?, FacNPart=?, FacFasCod=?, FacColNom=?, FocColNum=?, FacTipColC=?, FacNomCol=?, FacNumCol=?, FacCliCod=?, FacProCod=?, FacDsc2=?, FacEncCli=?, FacDishCod=?, FacTipArt=?, FacImpMan=?, FacImpMin=?, FacPreKgsA=?, FacCosPQ=?, FacImpdto=?, FacDtoL=?, FacPKDto=?, FacPMdto=?, FacImpd=?, FacDscII=?, FacAcs=?, FacKgsA=?, FacFecAlb=?, FacUnds=?, FacPreUnd=?, FacCadEnc=?, FacLinTRM=?, FACLinTRMF=?  WHERE EmprCod = ? AND FacCod = ? AND FacLin = ?", GX_NOMASK, "TXPLFAVEN")
         ,new UpdateCursor("T01TR38", "DELETE FROM TXPLFAVEN  WHERE EmprCod = ? AND FacCod = ? AND FacLin = ?", GX_NOMASK, "TXPLFAVEN")
         ,new ForEachCursor("T01TR39", "SELECT EmprCod, FacCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod, FacLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 40);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 8);
               ((String[]) buf[19])[0] = rslt.getString(20, 13);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((byte[]) buf[21])[0] = rslt.getByte(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 13);
               ((int[]) buf[23])[0] = rslt.getInt(24);
               ((int[]) buf[24])[0] = rslt.getInt(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 8);
               ((String[]) buf[26])[0] = rslt.getString(27, 40);
               ((String[]) buf[27])[0] = rslt.getString(28, 20);
               ((String[]) buf[28])[0] = rslt.getString(29, 12);
               ((short[]) buf[29])[0] = rslt.getShort(30);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(32,2);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(33,5);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(35,5);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(36,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(37,5);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(38,5);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(39,5);
               ((String[]) buf[39])[0] = rslt.getString(40, 200);
               ((String[]) buf[40])[0] = rslt.getString(41, 6);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(42,2);
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDate(43);
               ((int[]) buf[43])[0] = rslt.getInt(44);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(45,5);
               ((short[]) buf[45])[0] = rslt.getShort(46);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(47,2);
               ((java.util.Date[]) buf[47])[0] = rslt.getGXDateTime(48);
               ((String[]) buf[48])[0] = rslt.getString(49, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 40);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 8);
               ((String[]) buf[19])[0] = rslt.getString(20, 13);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((byte[]) buf[21])[0] = rslt.getByte(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 13);
               ((int[]) buf[23])[0] = rslt.getInt(24);
               ((int[]) buf[24])[0] = rslt.getInt(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 8);
               ((String[]) buf[26])[0] = rslt.getString(27, 40);
               ((String[]) buf[27])[0] = rslt.getString(28, 20);
               ((String[]) buf[28])[0] = rslt.getString(29, 12);
               ((short[]) buf[29])[0] = rslt.getShort(30);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(32,2);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(33,5);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(35,5);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(36,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(37,5);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(38,5);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(39,5);
               ((String[]) buf[39])[0] = rslt.getString(40, 200);
               ((String[]) buf[40])[0] = rslt.getString(41, 6);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(42,2);
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDate(43);
               ((int[]) buf[43])[0] = rslt.getInt(44);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(45,5);
               ((short[]) buf[45])[0] = rslt.getShort(46);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(47,2);
               ((java.util.Date[]) buf[47])[0] = rslt.getGXDateTime(48);
               ((String[]) buf[48])[0] = rslt.getString(49, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,3);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 5);
               ((String[]) buf[15])[0] = rslt.getString(16, 6);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 3);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,5);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,2);
               ((String[]) buf[21])[0] = rslt.getString(22, 200);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(23);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,5);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(25,5);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(26,5);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(27,5);
               ((String[]) buf[27])[0] = rslt.getString(28, 200);
               ((byte[]) buf[28])[0] = rslt.getByte(29);
               ((String[]) buf[29])[0] = rslt.getString(30, 40);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(32,2);
               ((String[]) buf[32])[0] = rslt.getString(33, 40);
               ((String[]) buf[33])[0] = rslt.getString(34, 40);
               ((String[]) buf[34])[0] = rslt.getString(35, 1);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(36,3);
               ((String[]) buf[36])[0] = rslt.getString(37, 1);
               ((String[]) buf[37])[0] = rslt.getString(38, 1);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(39,2);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(40,2);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(41,2);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(42,2);
               ((String[]) buf[42])[0] = rslt.getString(43, 1);
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(44);
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDateTime(45);
               ((String[]) buf[45])[0] = rslt.getString(46, 20);
               ((String[]) buf[46])[0] = rslt.getVarchar(47);
               ((String[]) buf[47])[0] = rslt.getString(48, 20);
               ((String[]) buf[48])[0] = rslt.getVarchar(49);
               ((String[]) buf[49])[0] = rslt.getString(50, 20);
               ((String[]) buf[50])[0] = rslt.getVarchar(51);
               ((String[]) buf[51])[0] = rslt.getString(52, 20);
               ((String[]) buf[52])[0] = rslt.getString(53, 4);
               ((String[]) buf[53])[0] = rslt.getVarchar(54);
               ((java.util.Date[]) buf[54])[0] = rslt.getGXDateTime(55);
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(56,2);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(57, 3);
               ((int[]) buf[58])[0] = rslt.getInt(58);
               ((String[]) buf[59])[0] = rslt.getString(59, 4);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(60, 6);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,3);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 5);
               ((String[]) buf[15])[0] = rslt.getString(16, 6);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 3);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,5);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,2);
               ((String[]) buf[21])[0] = rslt.getString(22, 200);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(23);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,5);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(25,5);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(26,5);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(27,5);
               ((String[]) buf[27])[0] = rslt.getString(28, 200);
               ((byte[]) buf[28])[0] = rslt.getByte(29);
               ((String[]) buf[29])[0] = rslt.getString(30, 40);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(32,2);
               ((String[]) buf[32])[0] = rslt.getString(33, 40);
               ((String[]) buf[33])[0] = rslt.getString(34, 40);
               ((String[]) buf[34])[0] = rslt.getString(35, 1);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(36,3);
               ((String[]) buf[36])[0] = rslt.getString(37, 1);
               ((String[]) buf[37])[0] = rslt.getString(38, 1);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(39,2);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(40,2);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(41,2);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(42,2);
               ((String[]) buf[42])[0] = rslt.getString(43, 1);
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(44);
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDateTime(45);
               ((String[]) buf[45])[0] = rslt.getString(46, 20);
               ((String[]) buf[46])[0] = rslt.getVarchar(47);
               ((String[]) buf[47])[0] = rslt.getString(48, 20);
               ((String[]) buf[48])[0] = rslt.getVarchar(49);
               ((String[]) buf[49])[0] = rslt.getString(50, 20);
               ((String[]) buf[50])[0] = rslt.getVarchar(51);
               ((String[]) buf[51])[0] = rslt.getString(52, 20);
               ((String[]) buf[52])[0] = rslt.getString(53, 4);
               ((String[]) buf[53])[0] = rslt.getVarchar(54);
               ((java.util.Date[]) buf[54])[0] = rslt.getGXDateTime(55);
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(56,2);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(57, 3);
               ((int[]) buf[58])[0] = rslt.getInt(58);
               ((String[]) buf[59])[0] = rslt.getString(59, 4);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(60, 6);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[10])[0] = rslt.getString(10, 3);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,3);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 5);
               ((String[]) buf[18])[0] = rslt.getString(18, 6);
               ((byte[]) buf[19])[0] = rslt.getByte(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 3);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[24])[0] = rslt.getString(24, 200);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(25);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(26,5);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(27,5);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(28,5);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(29,5);
               ((String[]) buf[30])[0] = rslt.getString(30, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(31, 200);
               ((byte[]) buf[33])[0] = rslt.getByte(32);
               ((String[]) buf[34])[0] = rslt.getString(33, 40);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(35,2);
               ((String[]) buf[37])[0] = rslt.getString(36, 40);
               ((String[]) buf[38])[0] = rslt.getString(37, 40);
               ((String[]) buf[39])[0] = rslt.getString(38, 1);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(39,3);
               ((String[]) buf[41])[0] = rslt.getString(40, 1);
               ((String[]) buf[42])[0] = rslt.getString(41, 1);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(42,2);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(43,2);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(44,2);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(45,2);
               ((String[]) buf[47])[0] = rslt.getString(46, 1);
               ((java.util.Date[]) buf[48])[0] = rslt.getGXDateTime(47);
               ((String[]) buf[49])[0] = rslt.getVarchar(48);
               ((String[]) buf[50])[0] = rslt.getVarchar(49);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[52])[0] = rslt.getGXDateTime(50);
               ((String[]) buf[53])[0] = rslt.getString(51, 20);
               ((String[]) buf[54])[0] = rslt.getVarchar(52);
               ((String[]) buf[55])[0] = rslt.getString(53, 20);
               ((String[]) buf[56])[0] = rslt.getVarchar(54);
               ((String[]) buf[57])[0] = rslt.getString(55, 20);
               ((String[]) buf[58])[0] = rslt.getVarchar(56);
               ((String[]) buf[59])[0] = rslt.getString(57, 20);
               ((String[]) buf[60])[0] = rslt.getString(58, 4);
               ((String[]) buf[61])[0] = rslt.getVarchar(59);
               ((java.util.Date[]) buf[62])[0] = rslt.getGXDateTime(60);
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(61,2);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((byte[]) buf[65])[0] = rslt.getByte(62);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(63, 3);
               ((int[]) buf[68])[0] = rslt.getInt(64);
               ((String[]) buf[69])[0] = rslt.getString(65, 4);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(66, 6);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(67, 3);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((short[]) buf[75])[0] = rslt.getShort(68);
               ((java.math.BigDecimal[]) buf[76])[0] = rslt.getBigDecimal(69,2);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 28 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 40);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 8);
               ((String[]) buf[19])[0] = rslt.getString(20, 13);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((byte[]) buf[21])[0] = rslt.getByte(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 13);
               ((int[]) buf[23])[0] = rslt.getInt(24);
               ((int[]) buf[24])[0] = rslt.getInt(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 8);
               ((String[]) buf[26])[0] = rslt.getString(27, 40);
               ((String[]) buf[27])[0] = rslt.getString(28, 20);
               ((String[]) buf[28])[0] = rslt.getString(29, 12);
               ((short[]) buf[29])[0] = rslt.getShort(30);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(32,2);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(33,5);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(35,5);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(36,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(37,5);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(38,5);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(39,5);
               ((String[]) buf[39])[0] = rslt.getString(40, 200);
               ((String[]) buf[40])[0] = rslt.getString(41, 6);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(42,2);
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDate(43);
               ((int[]) buf[43])[0] = rslt.getInt(44);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(45,5);
               ((short[]) buf[45])[0] = rslt.getShort(46);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(47,2);
               ((java.util.Date[]) buf[47])[0] = rslt.getGXDateTime(48);
               ((String[]) buf[48])[0] = rslt.getString(49, 3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
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
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 2);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 5);
               stmt.setString(15, (String)parms[14], 6);
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setString(17, (String)parms[16], 3);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 2);
               stmt.setLongVarchar(19, (String)parms[18], false);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 5);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
               stmt.setString(22, (String)parms[21], 200);
               stmt.setDateTime(23, (java.util.Date)parms[22], false);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[23], 5);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[24], 5);
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[25], 5);
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[26], 5);
               stmt.setString(28, (String)parms[27], 200);
               stmt.setByte(29, ((Number) parms[28]).byteValue());
               stmt.setString(30, (String)parms[29], 40);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[30], 2);
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[31], 2);
               stmt.setString(33, (String)parms[32], 40);
               stmt.setString(34, (String)parms[33], 40);
               stmt.setString(35, (String)parms[34], 1);
               stmt.setBigDecimal(36, (java.math.BigDecimal)parms[35], 3);
               stmt.setString(37, (String)parms[36], 1);
               stmt.setString(38, (String)parms[37], 1);
               stmt.setBigDecimal(39, (java.math.BigDecimal)parms[38], 2);
               stmt.setBigDecimal(40, (java.math.BigDecimal)parms[39], 2);
               stmt.setBigDecimal(41, (java.math.BigDecimal)parms[40], 2);
               stmt.setBigDecimal(42, (java.math.BigDecimal)parms[41], 2);
               stmt.setString(43, (String)parms[42], 1);
               stmt.setDateTime(44, (java.util.Date)parms[43], false);
               stmt.setDateTime(45, (java.util.Date)parms[44], false);
               stmt.setString(46, (String)parms[45], 20);
               stmt.setVarchar(47, (String)parms[46], 200, false);
               stmt.setString(48, (String)parms[47], 20);
               stmt.setVarchar(49, (String)parms[48], 200, false);
               stmt.setString(50, (String)parms[49], 20);
               stmt.setVarchar(51, (String)parms[50], 200, false);
               stmt.setString(52, (String)parms[51], 20);
               stmt.setString(53, (String)parms[52], 4);
               stmt.setVarchar(54, (String)parms[53], 600, false);
               stmt.setDateTime(55, (java.util.Date)parms[54], false);
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(56, (java.math.BigDecimal)parms[56], 2);
               }
               stmt.setString(57, (String)parms[57], 3);
               stmt.setInt(58, ((Number) parms[58]).intValue());
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(59, (String)parms[60], 4);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(60, (String)parms[62], 6);
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 3);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 5);
               stmt.setString(14, (String)parms[13], 6);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 3);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 2);
               stmt.setLongVarchar(18, (String)parms[17], false);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 5);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 2);
               stmt.setString(21, (String)parms[20], 200);
               stmt.setDateTime(22, (java.util.Date)parms[21], false);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[22], 5);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[23], 5);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[24], 5);
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[25], 5);
               stmt.setString(27, (String)parms[26], 200);
               stmt.setByte(28, ((Number) parms[27]).byteValue());
               stmt.setString(29, (String)parms[28], 40);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[29], 2);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[30], 2);
               stmt.setString(32, (String)parms[31], 40);
               stmt.setString(33, (String)parms[32], 40);
               stmt.setString(34, (String)parms[33], 1);
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[34], 3);
               stmt.setString(36, (String)parms[35], 1);
               stmt.setString(37, (String)parms[36], 1);
               stmt.setBigDecimal(38, (java.math.BigDecimal)parms[37], 2);
               stmt.setBigDecimal(39, (java.math.BigDecimal)parms[38], 2);
               stmt.setBigDecimal(40, (java.math.BigDecimal)parms[39], 2);
               stmt.setBigDecimal(41, (java.math.BigDecimal)parms[40], 2);
               stmt.setString(42, (String)parms[41], 1);
               stmt.setDateTime(43, (java.util.Date)parms[42], false);
               stmt.setDateTime(44, (java.util.Date)parms[43], false);
               stmt.setString(45, (String)parms[44], 20);
               stmt.setVarchar(46, (String)parms[45], 200, false);
               stmt.setString(47, (String)parms[46], 20);
               stmt.setVarchar(48, (String)parms[47], 200, false);
               stmt.setString(49, (String)parms[48], 20);
               stmt.setVarchar(50, (String)parms[49], 200, false);
               stmt.setString(51, (String)parms[50], 20);
               stmt.setString(52, (String)parms[51], 4);
               stmt.setVarchar(53, (String)parms[52], 600, false);
               stmt.setDateTime(54, (java.util.Date)parms[53], false);
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(55, (java.math.BigDecimal)parms[55], 2);
               }
               stmt.setInt(56, ((Number) parms[56]).intValue());
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(57, (String)parms[58], 4);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(58, (String)parms[60], 6);
               }
               stmt.setString(59, (String)parms[61], 3);
               stmt.setInt(60, ((Number) parms[62]).intValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 16);
               stmt.setString(10, (String)parms[9], 40);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 5);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 5);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[15], 5);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setString(19, (String)parms[18], 8);
               stmt.setString(20, (String)parms[19], 13);
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setString(23, (String)parms[22], 13);
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setInt(25, ((Number) parms[24]).intValue());
               stmt.setString(26, (String)parms[25], 8);
               stmt.setString(27, (String)parms[26], 40);
               stmt.setString(28, (String)parms[27], 20);
               stmt.setString(29, (String)parms[28], 12);
               stmt.setShort(30, ((Number) parms[29]).shortValue());
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[30], 2);
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[31], 2);
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[32], 5);
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[33], 2);
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[34], 5);
               stmt.setBigDecimal(36, (java.math.BigDecimal)parms[35], 2);
               stmt.setBigDecimal(37, (java.math.BigDecimal)parms[36], 5);
               stmt.setBigDecimal(38, (java.math.BigDecimal)parms[37], 5);
               stmt.setBigDecimal(39, (java.math.BigDecimal)parms[38], 5);
               stmt.setString(40, (String)parms[39], 200);
               stmt.setString(41, (String)parms[40], 6);
               stmt.setBigDecimal(42, (java.math.BigDecimal)parms[41], 2);
               stmt.setDate(43, (java.util.Date)parms[42]);
               stmt.setInt(44, ((Number) parms[43]).intValue());
               stmt.setBigDecimal(45, (java.math.BigDecimal)parms[44], 5);
               stmt.setShort(46, ((Number) parms[45]).shortValue());
               stmt.setBigDecimal(47, (java.math.BigDecimal)parms[46], 2);
               stmt.setDateTime(48, (java.util.Date)parms[47], false);
               stmt.setString(49, (String)parms[48], 3);
               return;
            case 31 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 40);
               stmt.setString(9, (String)parms[8], 8);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 5);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 5);
               stmt.setString(15, (String)parms[14], 1);
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 8);
               stmt.setString(18, (String)parms[17], 13);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setByte(20, ((Number) parms[19]).byteValue());
               stmt.setString(21, (String)parms[20], 13);
               stmt.setInt(22, ((Number) parms[21]).intValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setString(24, (String)parms[23], 8);
               stmt.setString(25, (String)parms[24], 40);
               stmt.setString(26, (String)parms[25], 20);
               stmt.setString(27, (String)parms[26], 12);
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[28], 2);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[29], 2);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[30], 5);
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[31], 2);
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[32], 5);
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[33], 2);
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[34], 5);
               stmt.setBigDecimal(36, (java.math.BigDecimal)parms[35], 5);
               stmt.setBigDecimal(37, (java.math.BigDecimal)parms[36], 5);
               stmt.setString(38, (String)parms[37], 200);
               stmt.setString(39, (String)parms[38], 6);
               stmt.setBigDecimal(40, (java.math.BigDecimal)parms[39], 2);
               stmt.setDate(41, (java.util.Date)parms[40]);
               stmt.setInt(42, ((Number) parms[41]).intValue());
               stmt.setBigDecimal(43, (java.math.BigDecimal)parms[42], 5);
               stmt.setShort(44, ((Number) parms[43]).shortValue());
               stmt.setBigDecimal(45, (java.math.BigDecimal)parms[44], 2);
               stmt.setDateTime(46, (java.util.Date)parms[45], false);
               stmt.setString(47, (String)parms[46], 3);
               stmt.setInt(48, ((Number) parms[47]).intValue());
               stmt.setInt(49, ((Number) parms[48]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

