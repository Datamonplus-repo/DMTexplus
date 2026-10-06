package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class colorproductosvariables_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV49Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Pgmname", AV49Pgmname);
         AV13UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13UsurCod", AV13UsurCod);
         AV16Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Station", AV16Station);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16Station, ""))));
         AV20Texto_i = httpContext.GetPar( "Texto_i") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Texto_i", AV20Texto_i);
         A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_14_1UU82( A396EmprCod, AV49Pgmname, AV13UsurCod, AV16Station, AV20Texto_i, A486ForNumCol, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV49Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Pgmname", AV49Pgmname);
         AV13UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13UsurCod", AV13UsurCod);
         AV16Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Station", AV16Station);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16Station, ""))));
         AV20Texto_i = httpContext.GetPar( "Texto_i") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Texto_i", AV20Texto_i);
         A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_15_1UU82( A396EmprCod, AV49Pgmname, AV13UsurCod, AV16Station, AV20Texto_i, A486ForNumCol, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV49Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Pgmname", AV49Pgmname);
         AV13UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13UsurCod", AV13UsurCod);
         AV16Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Station", AV16Station);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16Station, ""))));
         AV20Texto_i = httpContext.GetPar( "Texto_i") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Texto_i", AV20Texto_i);
         A486ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_16_1UU82( A396EmprCod, AV49Pgmname, AV13UsurCod, AV16Station, AV20Texto_i, A486ForNumCol, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action17") == 0 )
      {
         AV18EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
         AV28Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Clicod), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28Clicod), "ZZZZZ9")));
         AV29Forser = httpContext.GetPar( "Forser") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Forser", AV29Forser);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29Forser, ""))));
         AV30Forcolnom = httpContext.GetPar( "Forcolnom") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Forcolnom", AV30Forcolnom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Forcolnom, ""))));
         AV31Forcolnum = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Forcolnum), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Forcolnum), "ZZZZZ9")));
         AV32TipColcod = (byte)(GXutil.lval( httpContext.GetPar( "TipColcod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32TipColcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TipColcod), 2, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32TipColcod), "Z9")));
         A489ForPrdNor = (short)(GXutil.lval( httpContext.GetPar( "ForPrdNor"))) ;
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_17_1UU82( AV18EmprCod, AV28Clicod, AV29Forser, AV30Forcolnom, AV31Forcolnum, AV32TipColcod, A489ForPrdNor, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
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
         gxload_22( A396EmprCod, A486ForNumCol) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
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
         gxload_24( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_25") == 0 )
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
         gxload_25( A396EmprCod, A490ForPrdUMe) ;
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
            AV18EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
            AV21ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21ForNumCol), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21ForNumCol), "ZZZZZZZ9")));
            AV28Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Clicod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28Clicod), "ZZZZZ9")));
            AV29Forser = httpContext.GetPar( "Forser") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29Forser", AV29Forser);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29Forser, ""))));
            AV30Forcolnom = httpContext.GetPar( "Forcolnom") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30Forcolnom", AV30Forcolnom);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Forcolnom, ""))));
            AV31Forcolnum = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Forcolnum), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Forcolnum), "ZZZZZ9")));
            AV32TipColcod = (byte)(GXutil.lval( httpContext.GetPar( "TipColcod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TipColcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TipColcod), 2, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32TipColcod), "Z9")));
            AV36ForRelBan = CommonUtil.decimalVal( httpContext.GetPar( "ForRelBan"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36ForRelBan", GXutil.ltrimstr( AV36ForRelBan, 7, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORRELBAN", getSecureSignedToken( "", localUtil.format( AV36ForRelBan, "ZZZ9.99")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Productos (#)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtForNumCol_Internalname ;
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
      nRC_GXsfl_28 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_28"))) ;
      nGXsfl_28_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_28_idx"))) ;
      sGXsfl_28_idx = httpContext.GetPar( "sGXsfl_28_idx") ;
      edtForPrdUMe_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Horizontalalignment", edtForPrdUMe_Horizontalalignment, !bGXsfl_28_Refreshing);
      A741PrdUltLin = (short)(GXutil.lval( httpContext.GetPar( "PrdUltLin"))) ;
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

   public colorproductosvariables_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public colorproductosvariables_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( colorproductosvariables_impl.class ));
   }

   public colorproductosvariables_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForNumCol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForNumCol_Internalname, httpContext.getMessage( "Nº Interno F.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForNumCol_Internalname, GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForNumCol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForNumCol_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorProductosVariables.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ColorProductosVariables.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ColorProductosVariables.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ColorProductosVariables.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", divUnnamedtable1_Height, "px", "", "left", "top", "", "", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, "BARRADEPROGRESOContainer");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV49Pgmname), GXutil.rtrim( localUtil.format( AV49Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ColorProductosVariables.htm");
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
      /* User Defined Control */
      ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
      ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
      ucCombo_prdnum.setProperty("IsGridItem", Combo_prdnum_Isgriditem);
      ucCombo_prdnum.setProperty("EmptyItem", Combo_prdnum_Emptyitem);
      ucCombo_prdnum.setProperty("DropDownOptionsData", AV25PrdNum_Data);
      ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
      /* User Defined Control */
      ucCombo_forprdume.setProperty("Caption", Combo_forprdume_Caption);
      ucCombo_forprdume.setProperty("Cls", Combo_forprdume_Cls);
      ucCombo_forprdume.setProperty("IsGridItem", Combo_forprdume_Isgriditem);
      ucCombo_forprdume.setProperty("EmptyItem", Combo_forprdume_Emptyitem);
      ucCombo_forprdume.setProperty("DropDownOptionsData", AV27ForPrdUMe_Data);
      ucCombo_forprdume.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_forprdume_Internalname, "COMBO_FORPRDUMEContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol28( ) ;
      nGXsfl_28_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount82 = (short)(2) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_82 = (short)(1) ;
            scanStart1UU82( ) ;
            while ( RcdFound82 != 0 )
            {
               init_level_properties82( ) ;
               getByPrimaryKey1UU82( ) ;
               addRow1UU82( ) ;
               scanNext1UU82( ) ;
            }
            scanEnd1UU82( ) ;
            nBlankRcdCount82 = (short)(2) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B741PrdUltLin = A741PrdUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
         standaloneNotModal1UU82( ) ;
         standaloneModal1UU82( ) ;
         sMode82 = Gx_mode ;
         while ( nGXsfl_28_idx < nRC_GXsfl_28 )
         {
            bGXsfl_28_Refreshing = true ;
            readRow1UU82( ) ;
            edtPrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDLIN_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtForPrdCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDCAN_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdCan_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtForPrdUMe_Horizontalalignment = httpContext.cgiGet( "FORPRDUME_"+sGXsfl_28_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Horizontalalignment", edtForPrdUMe_Horizontalalignment, !bGXsfl_28_Refreshing);
            edtForPrdNor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDNOR_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdNor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdNor_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            imgprompt_489_Link = httpContext.cgiGet( "PROMPT_489_"+sGXsfl_28_idx+"Link") ;
            if ( ( nRcdExists_82 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1UU82( ) ;
            }
            sendRow1UU82( ) ;
            bGXsfl_28_Refreshing = false ;
         }
         Gx_mode = sMode82 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A741PrdUltLin = B741PrdUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount82 = (short)(2) ;
         nRcdExists_82 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1UU82( ) ;
            while ( RcdFound82 != 0 )
            {
               sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_2882( ) ;
               init_level_properties82( ) ;
               standaloneNotModal1UU82( ) ;
               getByPrimaryKey1UU82( ) ;
               standaloneModal1UU82( ) ;
               addRow1UU82( ) ;
               scanNext1UU82( ) ;
            }
            scanEnd1UU82( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode82 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_2882( ) ;
         initAll1UU82( ) ;
         init_level_properties82( ) ;
         B741PrdUltLin = A741PrdUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
         nRcdExists_82 = (short)(0) ;
         nIsMod_82 = (short)(0) ;
         nRcdDeleted_82 = (short)(0) ;
         nBlankRcdCount82 = (short)(nBlankRcdUsr82+nBlankRcdCount82) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount82 > 0 )
         {
            standaloneNotModal1UU82( ) ;
            standaloneModal1UU82( ) ;
            addRow1UU82( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtPrdLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount82 = (short)(nBlankRcdCount82-1) ;
         }
         Gx_mode = sMode82 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A741PrdUltLin = B741PrdUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
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
      e111UU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV25PrdNum_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFORPRDUME_DATA"), AV27ForPrdUMe_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( "Z486ForNumCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z741PrdUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z741PrdUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A741PrdUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z741PrdUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O741PrdUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "O741PrdUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_28 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_28"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV18EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV21ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( "vFORNUMCOL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A741PrdUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "PRDULTLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A13758PrdlinMax = (short)(localUtil.ctol( httpContext.cgiGet( "PRDLINMAX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13758PrdlinMax = false ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A718PrdNom = httpContext.cgiGet( "PRDNOM") ;
            AV20Texto_i = httpContext.cgiGet( "vTEXTO_I") ;
            A4338PrdUMeFo = (byte)(localUtil.ctol( httpContext.cgiGet( "PRDUMEFO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV16Station = httpContext.cgiGet( "vSTATION") ;
            AV35existecardinal = (short)(localUtil.ctol( httpContext.cgiGet( "vEXISTECARDINAL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Mensaje = httpContext.cgiGet( "vMENSAJE") ;
            A488ForPrdDsc = httpContext.cgiGet( "FORPRDDSC") ;
            n488ForPrdDsc = false ;
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
            Barradeprogreso_Objectcall = httpContext.cgiGet( "BARRADEPROGRESO_Objectcall") ;
            Barradeprogreso_Class = httpContext.cgiGet( "BARRADEPROGRESO_Class") ;
            Barradeprogreso_Enabled = GXutil.strtobool( httpContext.cgiGet( "BARRADEPROGRESO_Enabled")) ;
            Barradeprogreso_Height = httpContext.cgiGet( "BARRADEPROGRESO_Height") ;
            Barradeprogreso_Width = httpContext.cgiGet( "BARRADEPROGRESO_Width") ;
            Barradeprogreso_Visible = GXutil.strtobool( httpContext.cgiGet( "BARRADEPROGRESO_Visible")) ;
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
            Combo_forprdume_Objectcall = httpContext.cgiGet( "COMBO_FORPRDUME_Objectcall") ;
            Combo_forprdume_Class = httpContext.cgiGet( "COMBO_FORPRDUME_Class") ;
            Combo_forprdume_Icontype = httpContext.cgiGet( "COMBO_FORPRDUME_Icontype") ;
            Combo_forprdume_Icon = httpContext.cgiGet( "COMBO_FORPRDUME_Icon") ;
            Combo_forprdume_Caption = httpContext.cgiGet( "COMBO_FORPRDUME_Caption") ;
            Combo_forprdume_Tooltip = httpContext.cgiGet( "COMBO_FORPRDUME_Tooltip") ;
            Combo_forprdume_Cls = httpContext.cgiGet( "COMBO_FORPRDUME_Cls") ;
            Combo_forprdume_Selectedvalue_set = httpContext.cgiGet( "COMBO_FORPRDUME_Selectedvalue_set") ;
            Combo_forprdume_Selectedvalue_get = httpContext.cgiGet( "COMBO_FORPRDUME_Selectedvalue_get") ;
            Combo_forprdume_Selectedtext_set = httpContext.cgiGet( "COMBO_FORPRDUME_Selectedtext_set") ;
            Combo_forprdume_Selectedtext_get = httpContext.cgiGet( "COMBO_FORPRDUME_Selectedtext_get") ;
            Combo_forprdume_Gamoauthtoken = httpContext.cgiGet( "COMBO_FORPRDUME_Gamoauthtoken") ;
            Combo_forprdume_Ddointernalname = httpContext.cgiGet( "COMBO_FORPRDUME_Ddointernalname") ;
            Combo_forprdume_Titlecontrolalign = httpContext.cgiGet( "COMBO_FORPRDUME_Titlecontrolalign") ;
            Combo_forprdume_Dropdownoptionstype = httpContext.cgiGet( "COMBO_FORPRDUME_Dropdownoptionstype") ;
            Combo_forprdume_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Enabled")) ;
            Combo_forprdume_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Visible")) ;
            Combo_forprdume_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_FORPRDUME_Titlecontrolidtoreplace") ;
            Combo_forprdume_Datalisttype = httpContext.cgiGet( "COMBO_FORPRDUME_Datalisttype") ;
            Combo_forprdume_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Allowmultipleselection")) ;
            Combo_forprdume_Datalistfixedvalues = httpContext.cgiGet( "COMBO_FORPRDUME_Datalistfixedvalues") ;
            Combo_forprdume_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Isgriditem")) ;
            Combo_forprdume_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Hasdescription")) ;
            Combo_forprdume_Datalistproc = httpContext.cgiGet( "COMBO_FORPRDUME_Datalistproc") ;
            Combo_forprdume_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_FORPRDUME_Datalistprocparametersprefix") ;
            Combo_forprdume_Remoteservicesparameters = httpContext.cgiGet( "COMBO_FORPRDUME_Remoteservicesparameters") ;
            Combo_forprdume_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FORPRDUME_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_forprdume_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Includeonlyselectedoption")) ;
            Combo_forprdume_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Includeselectalloption")) ;
            Combo_forprdume_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Emptyitem")) ;
            Combo_forprdume_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FORPRDUME_Includeaddnewoption")) ;
            Combo_forprdume_Htmltemplate = httpContext.cgiGet( "COMBO_FORPRDUME_Htmltemplate") ;
            Combo_forprdume_Multiplevaluestype = httpContext.cgiGet( "COMBO_FORPRDUME_Multiplevaluestype") ;
            Combo_forprdume_Loadingdata = httpContext.cgiGet( "COMBO_FORPRDUME_Loadingdata") ;
            Combo_forprdume_Noresultsfound = httpContext.cgiGet( "COMBO_FORPRDUME_Noresultsfound") ;
            Combo_forprdume_Emptyitemtext = httpContext.cgiGet( "COMBO_FORPRDUME_Emptyitemtext") ;
            Combo_forprdume_Onlyselectedvalues = httpContext.cgiGet( "COMBO_FORPRDUME_Onlyselectedvalues") ;
            Combo_forprdume_Selectalltext = httpContext.cgiGet( "COMBO_FORPRDUME_Selectalltext") ;
            Combo_forprdume_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_FORPRDUME_Multiplevaluesseparator") ;
            Combo_forprdume_Addnewoptiontext = httpContext.cgiGet( "COMBO_FORPRDUME_Addnewoptiontext") ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORNUMCOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForNumCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A486ForNumCol = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
            }
            else
            {
               A486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
            }
            AV49Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49Pgmname", AV49Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"ColorProductosVariables");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A486ForNumCol != Z486ForNumCol ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("formulaciontinte\\colorproductosvariables:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_1UU0( ) ;
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
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111UU2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121UU2 ();
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
         e121UU2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1UU32( ) ;
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
         disableAttributes1UU32( ) ;
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

   public void confirm_1UU0( )
   {
      beforeValidate1UU32( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UU32( ) ;
         }
         else
         {
            checkExtendedTable1UU32( ) ;
            closeExtendedTableCursors1UU32( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode32 = Gx_mode ;
         confirm_1UU82( ) ;
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

   public void confirm_1UU82( )
   {
      s741PrdUltLin = O741PrdUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
      nGXsfl_28_idx = 0 ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         readRow1UU82( ) ;
         if ( ( nRcdExists_82 != 0 ) || ( nIsMod_82 != 0 ) )
         {
            getKey1UU82( ) ;
            if ( ( nRcdExists_82 == 0 ) && ( nRcdDeleted_82 == 0 ) )
            {
               if ( RcdFound82 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1UU82( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1UU82( ) ;
                     closeExtendedTableCursors1UU82( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O741PrdUltLin = A741PrdUltLin ;
                     httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
                  }
               }
               else
               {
                  GXCCtl = "PRDLIN_" + sGXsfl_28_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrdLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound82 != 0 )
               {
                  if ( nRcdDeleted_82 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1UU82( ) ;
                     load1UU82( ) ;
                     beforeValidate1UU82( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1UU82( ) ;
                        O741PrdUltLin = A741PrdUltLin ;
                        httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_82 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1UU82( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1UU82( ) ;
                           closeExtendedTableCursors1UU82( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O741PrdUltLin = A741PrdUltLin ;
                           httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_82 == 0 )
                  {
                     GXCCtl = "PRDLIN_" + sGXsfl_28_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A715PrdLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtForPrdCan_Internalname, GXutil.ltrim( localUtil.ntoc( A487ForPrdCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdNor_Internalname, GXutil.ltrim( localUtil.ntoc( A489ForPrdNor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z715PrdLin_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z715PrdLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z487ForPrdCan_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z487ForPrdCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z489ForPrdNor_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z489ForPrdNor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_28_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T487ForPrdCan_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( O487ForPrdCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T719PrdNum_"+sGXsfl_28_idx, GXutil.rtrim( O719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_82_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_82, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_82_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_82, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_82_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_82, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_82 != 0 )
         {
            httpContext.changePostValue( "PRDLIN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDCAN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_28_idx+"Horizontalalignment", GXutil.rtrim( edtForPrdUMe_Horizontalalignment)) ;
            httpContext.changePostValue( "FORPRDNOR_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdNor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O741PrdUltLin = s741PrdUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
      /* Start of After( level) rules */
      /* Using cursor T01UU7 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A13758PrdlinMax = T01UU7_A13758PrdlinMax[0] ;
         n13758PrdlinMax = T01UU7_n13758PrdlinMax[0] ;
      }
      else
      {
         A13758PrdlinMax = (short)(0) ;
         n13758PrdlinMax = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13758PrdlinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13758PrdlinMax), 3, 0));
      }
      /* End of After( level) rules */
   }

   public void resetCaption1UU0( )
   {
   }

   public void e111UU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV16Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      colorproductosvariables_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Station", AV16Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16Station, ""))));
      GXv_char2[0] = AV18EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV13UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char2, GXv_char3, GXv_char4) ;
      colorproductosvariables_impl.this.AV18EmprCod = GXv_char2[0] ;
      colorproductosvariables_impl.this.AV19EmprNom = GXv_char3[0] ;
      colorproductosvariables_impl.this.AV13UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprNom", AV19EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV13UsurCod", AV13UsurCod);
      GXt_int5 = (byte)(AV47MForEq) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV18EmprCod, httpContext.getMessage( "MFOREQ", ""), GXv_int6) ;
      colorproductosvariables_impl.this.GXt_int5 = GXv_int6[0] ;
      AV47MForEq = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47MForEq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47MForEq), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMFOREQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV47MForEq), "ZZZ9")));
      GXt_char1 = AV16Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      colorproductosvariables_impl.this.GXt_char1 = GXv_char4[0] ;
      AV16Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Station", AV16Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16Station, ""))));
      GXv_char4[0] = AV18EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char2[0] = AV13UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char4, GXv_char3, GXv_char2) ;
      colorproductosvariables_impl.this.AV18EmprCod = GXv_char4[0] ;
      colorproductosvariables_impl.this.AV19EmprNom = GXv_char3[0] ;
      colorproductosvariables_impl.this.AV13UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprNom", AV19EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV13UsurCod", AV13UsurCod);
      GXv_SdtWWPContext7[0] = AV22WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV22WWPContext = GXv_SdtWWPContext7[0] ;
      divUnnamedtable1_Height = 40 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable1_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable1_Height), 9, 0), true);
      Combo_forprdume_Titlecontrolidtoreplace = edtForPrdUMe_Internalname ;
      ucCombo_forprdume.sendProperty(context, "", false, Combo_forprdume_Internalname, "TitleControlIdToReplace", Combo_forprdume_Titlecontrolidtoreplace);
      edtForPrdUMe_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Horizontalalignment", edtForPrdUMe_Horizontalalignment, !bGXsfl_28_Refreshing);
      Combo_prdnum_Titlecontrolidtoreplace = edtPrdNum_Internalname ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "TitleControlIdToReplace", Combo_prdnum_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOPRDNUM' */
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
      /* Execute user subroutine: 'LOADCOMBOFORPRDUME' */
      S122 ();
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
   }

   public void e121UU2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( AV47MForEq == 1 )
      {
         System.out.println( httpContext.getMessage( "go PMFOREQ", "") );
         GXv_char4[0] = AV18EmprCod ;
         GXv_int8[0] = AV28Clicod ;
         GXv_char3[0] = AV29Forser ;
         GXv_char2[0] = AV30Forcolnom ;
         GXv_int9[0] = AV31Forcolnum ;
         GXv_int6[0] = AV32TipColcod ;
         new app.gestionlaboratorio.pmforeq(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2, GXv_int9, GXv_int6) ;
         colorproductosvariables_impl.this.AV18EmprCod = GXv_char4[0] ;
         colorproductosvariables_impl.this.AV28Clicod = GXv_int8[0] ;
         colorproductosvariables_impl.this.AV29Forser = GXv_char3[0] ;
         colorproductosvariables_impl.this.AV30Forcolnom = GXv_char2[0] ;
         colorproductosvariables_impl.this.AV31Forcolnum = GXv_int9[0] ;
         colorproductosvariables_impl.this.AV32TipColcod = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri("", false, "AV28Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Clicod), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28Clicod), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, "AV29Forser", AV29Forser);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29Forser, ""))));
         httpContext.ajax_rsp_assign_attri("", false, "AV30Forcolnom", AV30Forcolnom);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Forcolnom, ""))));
         httpContext.ajax_rsp_assign_attri("", false, "AV31Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Forcolnum), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Forcolnum), "ZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, "AV32TipColcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TipColcod), 2, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32TipColcod), "Z9")));
         System.out.println( httpContext.getMessage( "return PMFOREQ", "") );
      }
      System.out.println( httpContext.getMessage( "---calculo coste-----", "") );
      GXv_char4[0] = AV18EmprCod ;
      GXv_int9[0] = AV28Clicod ;
      GXv_char3[0] = AV29Forser ;
      GXv_char2[0] = AV30Forcolnom ;
      GXv_int8[0] = AV31Forcolnum ;
      GXv_int6[0] = AV32TipColcod ;
      GXv_decimal10[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int11[0] = (int)(DecimalUtil.decToDouble(AV36ForRelBan)) ;
      GXv_char12[0] = " " ;
      GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
      new app.psimulax(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_char3, GXv_char2, GXv_int8, GXv_int6, GXv_decimal10, GXv_int11, GXv_char12, GXv_decimal13) ;
      colorproductosvariables_impl.this.AV18EmprCod = GXv_char4[0] ;
      colorproductosvariables_impl.this.AV28Clicod = GXv_int9[0] ;
      colorproductosvariables_impl.this.AV29Forser = GXv_char3[0] ;
      colorproductosvariables_impl.this.AV30Forcolnom = GXv_char2[0] ;
      colorproductosvariables_impl.this.AV31Forcolnum = GXv_int8[0] ;
      colorproductosvariables_impl.this.AV32TipColcod = GXv_int6[0] ;
      colorproductosvariables_impl.this.AV36ForRelBan = DecimalUtil.doubleToDec(GXv_int11[0]) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV28Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Clicod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28Clicod), "ZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV29Forser", AV29Forser);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29Forser, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV30Forcolnom", AV30Forcolnom);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Forcolnom, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV31Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Forcolnum), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Forcolnum), "ZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV32TipColcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TipColcod), 2, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32TipColcod), "Z9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV36ForRelBan", GXutil.ltrimstr( AV36ForRelBan, 7, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORRELBAN", getSecureSignedToken( "", localUtil.format( AV36ForRelBan, "ZZZ9.99")));
      GXv_char12[0] = AV18EmprCod ;
      GXv_char4[0] = AV16Station ;
      GXv_decimal13[0] = AV46Valor_cor ;
      new app.pcoscor(remoteHandle, context).execute( GXv_char12, GXv_char4, GXv_decimal13) ;
      colorproductosvariables_impl.this.AV18EmprCod = GXv_char12[0] ;
      colorproductosvariables_impl.this.AV16Station = GXv_char4[0] ;
      colorproductosvariables_impl.this.AV46Valor_cor = GXv_decimal13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16Station", AV16Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16Station, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV46Valor_cor", GXutil.ltrimstr( AV46Valor_cor, 11, 5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR_COR", getSecureSignedToken( "", localUtil.format( AV46Valor_cor, "ZZZZ9.99999")));
      GXv_char12[0] = AV18EmprCod ;
      GXv_int11[0] = AV28Clicod ;
      GXv_char4[0] = AV29Forser ;
      GXv_char3[0] = AV30Forcolnom ;
      GXv_int9[0] = AV31Forcolnum ;
      GXv_int6[0] = AV32TipColcod ;
      GXv_decimal13[0] = AV46Valor_cor ;
      new app.pupdcos(remoteHandle, context).execute( GXv_char12, GXv_int11, GXv_char4, GXv_char3, GXv_int9, GXv_int6, GXv_decimal13) ;
      colorproductosvariables_impl.this.AV18EmprCod = GXv_char12[0] ;
      colorproductosvariables_impl.this.AV28Clicod = GXv_int11[0] ;
      colorproductosvariables_impl.this.AV29Forser = GXv_char4[0] ;
      colorproductosvariables_impl.this.AV30Forcolnom = GXv_char3[0] ;
      colorproductosvariables_impl.this.AV31Forcolnum = GXv_int9[0] ;
      colorproductosvariables_impl.this.AV32TipColcod = GXv_int6[0] ;
      colorproductosvariables_impl.this.AV46Valor_cor = GXv_decimal13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprCod", AV18EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV28Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Clicod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28Clicod), "ZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV29Forser", AV29Forser);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29Forser, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV30Forcolnom", AV30Forcolnom);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Forcolnom, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV31Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Forcolnum), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Forcolnum), "ZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV32TipColcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TipColcod), 2, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32TipColcod), "Z9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV46Valor_cor", GXutil.ltrimstr( AV46Valor_cor, 11, 5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR_COR", getSecureSignedToken( "", localUtil.format( AV46Valor_cor, "ZZZZ9.99999")));
      System.out.println( httpContext.getMessage( "Coste= ", "")+GXutil.str( AV46Valor_cor, 11, 5) );
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
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

   public void S122( )
   {
      /* 'LOADCOMBOFORPRDUME' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = AV27ForPrdUMe_Data ;
      GXv_char12[0] = AV26ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item15[0] = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      new app.formulaciontinte.colorproductosvariablesloaddvcombo(remoteHandle, context).execute( "ForPrdUMe", Gx_mode, AV18EmprCod, AV21ForNumCol, GXv_char12, GXv_objcol_SdtDVB_SDTComboData_Item15) ;
      colorproductosvariables_impl.this.AV26ComboSelectedValue = GXv_char12[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = GXv_objcol_SdtDVB_SDTComboData_Item15[0] ;
      AV27ForPrdUMe_Data = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
   }

   public void S112( )
   {
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = AV25PrdNum_Data ;
      GXv_char12[0] = AV26ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item15[0] = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      new app.formulaciontinte.colorproductosvariablesloaddvcombo(remoteHandle, context).execute( "PrdNum", Gx_mode, AV18EmprCod, AV21ForNumCol, GXv_char12, GXv_objcol_SdtDVB_SDTComboData_Item15) ;
      colorproductosvariables_impl.this.AV26ComboSelectedValue = GXv_char12[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = GXv_objcol_SdtDVB_SDTComboData_Item15[0] ;
      AV25PrdNum_Data = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
   }

   public void zm1UU32( int GX_JID )
   {
      if ( ( GX_JID == 20 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z741PrdUltLin = T01UU9_A741PrdUltLin[0] ;
         }
         else
         {
            Z741PrdUltLin = A741PrdUltLin ;
         }
      }
      if ( GX_JID == -20 )
      {
         Z486ForNumCol = A486ForNumCol ;
         Z741PrdUltLin = A741PrdUltLin ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z13758PrdlinMax = A13758PrdlinMax ;
      }
   }

   public void standaloneNotModal( )
   {
      AV49Pgmname = "FormulacionTinte.ColorProductosVariables" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Pgmname", AV49Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV18EmprCod)==0) )
      {
         A396EmprCod = AV18EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01UU10 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01UU10_A407EmprNom[0] ;
      n407EmprNom = T01UU10_n407EmprNom[0] ;
      pr_default.close(7);
      if ( ! (0==AV21ForNumCol) )
      {
         A486ForNumCol = AV21ForNumCol ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
      }
      if ( ! (0==AV21ForNumCol) )
      {
         edtForNumCol_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Enabled), 5, 0), true);
      }
      else
      {
         edtForNumCol_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Enabled), 5, 0), true);
      }
      if ( ! (0==AV21ForNumCol) )
      {
         edtForNumCol_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Enabled), 5, 0), true);
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01UU7 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(4) != 101) )
         {
            A13758PrdlinMax = T01UU7_A13758PrdlinMax[0] ;
            n13758PrdlinMax = T01UU7_n13758PrdlinMax[0] ;
         }
         else
         {
            A13758PrdlinMax = (short)(0) ;
            n13758PrdlinMax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13758PrdlinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13758PrdlinMax), 3, 0));
         }
         pr_default.close(4);
      }
   }

   public void load1UU32( )
   {
      /* Using cursor T01UU12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound32 = (short)(1) ;
         A741PrdUltLin = T01UU12_A741PrdUltLin[0] ;
         A407EmprNom = T01UU12_A407EmprNom[0] ;
         n407EmprNom = T01UU12_n407EmprNom[0] ;
         A13758PrdlinMax = T01UU12_A13758PrdlinMax[0] ;
         n13758PrdlinMax = T01UU12_n13758PrdlinMax[0] ;
         zm1UU32( -20) ;
      }
      pr_default.close(8);
      onLoadActions1UU32( ) ;
   }

   public void onLoadActions1UU32( )
   {
   }

   public void checkExtendedTable1UU32( )
   {
      nIsDirty_32 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01UU7 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A13758PrdlinMax = T01UU7_A13758PrdlinMax[0] ;
         n13758PrdlinMax = T01UU7_n13758PrdlinMax[0] ;
      }
      else
      {
         nIsDirty_32 = (short)(1) ;
         A13758PrdlinMax = (short)(0) ;
         n13758PrdlinMax = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13758PrdlinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13758PrdlinMax), 3, 0));
      }
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1UU32( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_22( String A396EmprCod ,
                          int A486ForNumCol )
   {
      /* Using cursor T01UU14 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A13758PrdlinMax = T01UU14_A13758PrdlinMax[0] ;
         n13758PrdlinMax = T01UU14_n13758PrdlinMax[0] ;
      }
      else
      {
         A13758PrdlinMax = (short)(0) ;
         n13758PrdlinMax = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13758PrdlinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13758PrdlinMax), 3, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13758PrdlinMax, (byte)(3), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1UU32( )
   {
      /* Using cursor T01UU15 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound32 = (short)(1) ;
      }
      else
      {
         RcdFound32 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UU9 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm1UU32( 20) ;
         RcdFound32 = (short)(1) ;
         A486ForNumCol = T01UU9_A486ForNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         A741PrdUltLin = T01UU9_A741PrdUltLin[0] ;
         A396EmprCod = T01UU9_A396EmprCod[0] ;
         O741PrdUltLin = A741PrdUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
         Z396EmprCod = A396EmprCod ;
         Z486ForNumCol = A486ForNumCol ;
         sMode32 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UU32( ) ;
         if ( AnyError == 1 )
         {
            RcdFound32 = (short)(0) ;
            initializeNonKey1UU32( ) ;
         }
         Gx_mode = sMode32 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound32 = (short)(0) ;
         initializeNonKey1UU32( ) ;
         sMode32 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode32 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1UU32( ) ;
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
      /* Using cursor T01UU16 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01UU16_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UU16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UU16_A486ForNumCol[0] < A486ForNumCol ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01UU16_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UU16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UU16_A486ForNumCol[0] > A486ForNumCol ) ) )
         {
            A396EmprCod = T01UU16_A396EmprCod[0] ;
            A486ForNumCol = T01UU16_A486ForNumCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
            RcdFound32 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound32 = (short)(0) ;
      /* Using cursor T01UU17 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01UU17_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UU17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UU17_A486ForNumCol[0] > A486ForNumCol ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01UU17_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UU17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UU17_A486ForNumCol[0] < A486ForNumCol ) ) )
         {
            A396EmprCod = T01UU17_A396EmprCod[0] ;
            A486ForNumCol = T01UU17_A486ForNumCol[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
            RcdFound32 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UU32( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A741PrdUltLin = O741PrdUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
         GX_FocusControl = edtForNumCol_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1UU32( ) ;
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
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A486ForNumCol = Z486ForNumCol ;
               httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "FORNUMCOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForNumCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A741PrdUltLin = O741PrdUltLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtForNumCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A741PrdUltLin = O741PrdUltLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
               update1UU32( ) ;
               GX_FocusControl = edtForNumCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A486ForNumCol != Z486ForNumCol ) )
            {
               /* Insert record */
               A741PrdUltLin = O741PrdUltLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
               GX_FocusControl = edtForNumCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1UU32( ) ;
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
                  A741PrdUltLin = O741PrdUltLin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
                  GX_FocusControl = edtForNumCol_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1UU32( ) ;
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
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A486ForNumCol = Z486ForNumCol ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "FORNUMCOL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForNumCol_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A741PrdUltLin = O741PrdUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtForNumCol_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1UU32( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UU8 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCDFORM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( Z741PrdUltLin != T01UU8_A741PrdUltLin[0] ) )
         {
            if ( Z741PrdUltLin != T01UU8_A741PrdUltLin[0] )
            {
               GXutil.writeLogln("formulaciontinte.colorproductosvariables:[seudo value changed for attri]"+"PrdUltLin");
               GXutil.writeLogRaw("Old: ",Z741PrdUltLin);
               GXutil.writeLogRaw("Current: ",T01UU8_A741PrdUltLin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCDFORM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UU32( )
   {
      beforeValidate1UU32( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UU32( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UU32( 0) ;
         checkOptimisticConcurrency1UU32( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UU32( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UU32( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UU18 */
                  pr_default.execute(13, new Object[] {Integer.valueOf(A486ForNumCol), Short.valueOf(A741PrdUltLin), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
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
                        processLevel1UU32( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1UU0( ) ;
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
            load1UU32( ) ;
         }
         endLevel1UU32( ) ;
      }
      closeExtendedTableCursors1UU32( ) ;
   }

   public void update1UU32( )
   {
      beforeValidate1UU32( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UU32( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UU32( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UU32( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UU32( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UU19 */
                  pr_default.execute(14, new Object[] {Short.valueOf(A741PrdUltLin), A396EmprCod, Integer.valueOf(A486ForNumCol)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCDFORM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UU32( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1UU32( ) ;
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
         endLevel1UU32( ) ;
      }
      closeExtendedTableCursors1UU32( ) ;
   }

   public void deferredUpdate1UU32( )
   {
   }

   public void delete( )
   {
      beforeValidate1UU32( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UU32( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UU32( ) ;
         afterConfirm1UU32( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UU32( ) ;
            if ( AnyError == 0 )
            {
               A741PrdUltLin = O741PrdUltLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
               scanStart1UU82( ) ;
               while ( RcdFound82 != 0 )
               {
                  getByPrimaryKey1UU82( ) ;
                  delete1UU82( ) ;
                  scanNext1UU82( ) ;
                  O741PrdUltLin = A741PrdUltLin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
               }
               scanEnd1UU82( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UU20 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
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
      endLevel1UU32( ) ;
      Gx_mode = sMode32 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UU32( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01UU22 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            A13758PrdlinMax = T01UU22_A13758PrdlinMax[0] ;
            n13758PrdlinMax = T01UU22_n13758PrdlinMax[0] ;
         }
         else
         {
            A13758PrdlinMax = (short)(0) ;
            n13758PrdlinMax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13758PrdlinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13758PrdlinMax), 3, 0));
         }
         pr_default.close(16);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01UU23 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01UU24 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void processNestedLevel1UU82( )
   {
      s741PrdUltLin = O741PrdUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
      nGXsfl_28_idx = 0 ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         readRow1UU82( ) ;
         if ( ( nRcdExists_82 != 0 ) || ( nIsMod_82 != 0 ) )
         {
            standaloneNotModal1UU82( ) ;
            getKey1UU82( ) ;
            if ( ( nRcdExists_82 == 0 ) && ( nRcdDeleted_82 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1UU82( ) ;
            }
            else
            {
               if ( RcdFound82 != 0 )
               {
                  if ( ( nRcdDeleted_82 != 0 ) && ( nRcdExists_82 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1UU82( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_82 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1UU82( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_82 == 0 )
                  {
                     GXCCtl = "PRDLIN_" + sGXsfl_28_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O741PrdUltLin = A741PrdUltLin ;
            httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
         }
         httpContext.changePostValue( edtPrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A715PrdLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtForPrdCan_Internalname, GXutil.ltrim( localUtil.ntoc( A487ForPrdCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdNor_Internalname, GXutil.ltrim( localUtil.ntoc( A489ForPrdNor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z715PrdLin_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z715PrdLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z487ForPrdCan_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z487ForPrdCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z489ForPrdNor_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z489ForPrdNor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_28_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T487ForPrdCan_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( O487ForPrdCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T719PrdNum_"+sGXsfl_28_idx, GXutil.rtrim( O719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_82_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_82, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_82_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_82, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_82_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_82, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_82 != 0 )
         {
            httpContext.changePostValue( "PRDLIN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDCAN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUME_"+sGXsfl_28_idx+"Horizontalalignment", GXutil.rtrim( edtForPrdUMe_Horizontalalignment)) ;
            httpContext.changePostValue( "FORPRDNOR_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdNor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T01UU22 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         A13758PrdlinMax = T01UU22_A13758PrdlinMax[0] ;
         n13758PrdlinMax = T01UU22_n13758PrdlinMax[0] ;
      }
      else
      {
         A13758PrdlinMax = (short)(0) ;
         n13758PrdlinMax = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13758PrdlinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13758PrdlinMax), 3, 0));
      }
      /* End of After( level) rules */
      initAll1UU82( ) ;
      if ( AnyError != 0 )
      {
         O741PrdUltLin = s741PrdUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
      }
      nRcdExists_82 = (short)(0) ;
      nIsMod_82 = (short)(0) ;
      nRcdDeleted_82 = (short)(0) ;
   }

   public void processLevel1UU32( )
   {
      /* Save parent mode. */
      sMode32 = Gx_mode ;
      processNestedLevel1UU82( ) ;
      if ( AnyError != 0 )
      {
         O741PrdUltLin = s741PrdUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode32 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01UU25 */
      pr_default.execute(19, new Object[] {Short.valueOf(A741PrdUltLin), A396EmprCod, Integer.valueOf(A486ForNumCol)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDFORM");
   }

   public void endLevel1UU32( )
   {
      pr_default.close(5);
      if ( AnyError == 0 )
      {
         beforeComplete1UU32( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.colorproductosvariables");
         if ( AnyError == 0 )
         {
            confirmValues1UU0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.colorproductosvariables");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UU32( )
   {
      /* Scan By routine */
      /* Using cursor T01UU26 */
      pr_default.execute(20);
      RcdFound32 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound32 = (short)(1) ;
         A396EmprCod = T01UU26_A396EmprCod[0] ;
         A486ForNumCol = T01UU26_A486ForNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UU32( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound32 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound32 = (short)(1) ;
         A396EmprCod = T01UU26_A396EmprCod[0] ;
         A486ForNumCol = T01UU26_A486ForNumCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
      }
   }

   public void scanEnd1UU32( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1UU32( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UU32( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UU32( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UU32( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UU32( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UU32( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UU32( )
   {
      edtForNumCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1UU82( int GX_JID )
   {
      if ( ( GX_JID == 23 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z487ForPrdCan = T01UU3_A487ForPrdCan[0] ;
            Z489ForPrdNor = T01UU3_A489ForPrdNor[0] ;
            Z719PrdNum = T01UU3_A719PrdNum[0] ;
            Z490ForPrdUMe = T01UU3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z487ForPrdCan = A487ForPrdCan ;
            Z489ForPrdNor = A489ForPrdNor ;
            Z719PrdNum = A719PrdNum ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -23 )
      {
         Z486ForNumCol = A486ForNumCol ;
         Z715PrdLin = A715PrdLin ;
         Z487ForPrdCan = A487ForPrdCan ;
         Z489ForPrdNor = A489ForPrdNor ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z718PrdNom = A718PrdNom ;
         Z4338PrdUMeFo = A4338PrdUMeFo ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal1UU82( )
   {
   }

   public void standaloneModal1UU82( )
   {
      if ( isIns( )  )
      {
         A741PrdUltLin = (short)(O741PrdUltLin+10) ;
         httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A715PrdLin = A741PrdUltLin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPrdLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
      else
      {
         edtPrdLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
   }

   public void load1UU82( )
   {
      /* Using cursor T01UU27 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound82 = (short)(1) ;
         A718PrdNom = T01UU27_A718PrdNom[0] ;
         A487ForPrdCan = T01UU27_A487ForPrdCan[0] ;
         A488ForPrdDsc = T01UU27_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01UU27_n488ForPrdDsc[0] ;
         A489ForPrdNor = T01UU27_A489ForPrdNor[0] ;
         A4338PrdUMeFo = T01UU27_A4338PrdUMeFo[0] ;
         A719PrdNum = T01UU27_A719PrdNum[0] ;
         A490ForPrdUMe = T01UU27_A490ForPrdUMe[0] ;
         zm1UU82( -23) ;
      }
      pr_default.close(21);
      onLoadActions1UU82( ) ;
   }

   public void onLoadActions1UU82( )
   {
      if ( isIns( )  && (0==A490ForPrdUMe) && ( Gx_BScreen == 0 ) )
      {
         A490ForPrdUMe = A4338PrdUMeFo ;
      }
      else
      {
         if ( isIns( )  && (0==A490ForPrdUMe) && ( Gx_BScreen == 0 ) )
         {
            A490ForPrdUMe = E490ForPrdUMe ;
         }
      }
   }

   public void checkExtendedTable1UU82( )
   {
      nIsDirty_82 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1UU82( ) ;
      /* Using cursor T01UU4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01UU4_A718PrdNom[0] ;
      A4338PrdUMeFo = T01UU4_A4338PrdUMeFo[0] ;
      pr_default.close(2);
      if ( isIns( )  && (0==A490ForPrdUMe) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_82 = (short)(1) ;
         A490ForPrdUMe = A4338PrdUMeFo ;
      }
      else
      {
         if ( isIns( )  && (0==A490ForPrdUMe) && ( Gx_BScreen == 0 ) )
         {
            nIsDirty_82 = (short)(1) ;
            A490ForPrdUMe = E490ForPrdUMe ;
         }
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A487ForPrdCan)==0) && true /* After */ )
      {
         GXCCtl = "FORPRDCAN_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad nula", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdCan_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01UU5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01UU5_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01UU5_n488ForPrdDsc[0] ;
      pr_default.close(3);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! (0==A489ForPrdNor) && true /* After */ )
      {
         GXv_int16[0] = AV35existecardinal ;
         GXv_char12[0] = AV33Mensaje ;
         new app.formulaciontinte.existecardinalenprocesoquimico(remoteHandle, context).execute( AV18EmprCod, AV28Clicod, AV29Forser, AV30Forcolnom, AV31Forcolnum, AV32TipColcod, A489ForPrdNor, A719PrdNum, GXv_int16, GXv_char12) ;
         colorproductosvariables_impl.this.AV35existecardinal = GXv_int16[0] ;
         colorproductosvariables_impl.this.AV33Mensaje = GXv_char12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35existecardinal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35existecardinal), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33Mensaje", AV33Mensaje);
      }
      if ( ! (GXutil.strcmp("", AV33Mensaje)==0) && ( AV35existecardinal == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV33Mensaje, 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33Mensaje)==0) && ( AV35existecardinal == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV33Mensaje, 0, "");
      }
   }

   public void closeExtendedTableCursors1UU82( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1UU82( )
   {
   }

   public void gxload_24( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01UU28 */
      pr_default.execute(22, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(22) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01UU28_A718PrdNom[0] ;
      A4338PrdUMeFo = T01UU28_A4338PrdUMeFo[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void gxload_25( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T01UU29 */
      pr_default.execute(23, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01UU29_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01UU29_n488ForPrdDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(23) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(23);
   }

   public void getKey1UU82( )
   {
      /* Using cursor T01UU30 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound82 = (short)(1) ;
      }
      else
      {
         RcdFound82 = (short)(0) ;
      }
      pr_default.close(24);
   }

   public void getByPrimaryKey1UU82( )
   {
      /* Using cursor T01UU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1UU82( 23) ;
         RcdFound82 = (short)(1) ;
         initializeNonKey1UU82( ) ;
         A715PrdLin = T01UU3_A715PrdLin[0] ;
         A487ForPrdCan = T01UU3_A487ForPrdCan[0] ;
         A489ForPrdNor = T01UU3_A489ForPrdNor[0] ;
         A719PrdNum = T01UU3_A719PrdNum[0] ;
         A490ForPrdUMe = T01UU3_A490ForPrdUMe[0] ;
         O487ForPrdCan = A487ForPrdCan ;
         O719PrdNum = A719PrdNum ;
         Z396EmprCod = A396EmprCod ;
         Z486ForNumCol = A486ForNumCol ;
         Z715PrdLin = A715PrdLin ;
         sMode82 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UU82( ) ;
         Gx_mode = sMode82 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound82 = (short)(0) ;
         initializeNonKey1UU82( ) ;
         sMode82 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1UU82( ) ;
         Gx_mode = sMode82 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1UU82( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1UU82( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UU2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPRFOR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z487ForPrdCan, T01UU2_A487ForPrdCan[0]) != 0 ) || ( Z489ForPrdNor != T01UU2_A489ForPrdNor[0] ) || ( GXutil.strcmp(Z719PrdNum, T01UU2_A719PrdNum[0]) != 0 ) || ( Z490ForPrdUMe != T01UU2_A490ForPrdUMe[0] ) )
         {
            if ( DecimalUtil.compareTo(Z487ForPrdCan, T01UU2_A487ForPrdCan[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.colorproductosvariables:[seudo value changed for attri]"+"ForPrdCan");
               GXutil.writeLogRaw("Old: ",Z487ForPrdCan);
               GXutil.writeLogRaw("Current: ",T01UU2_A487ForPrdCan[0]);
            }
            if ( Z489ForPrdNor != T01UU2_A489ForPrdNor[0] )
            {
               GXutil.writeLogln("formulaciontinte.colorproductosvariables:[seudo value changed for attri]"+"ForPrdNor");
               GXutil.writeLogRaw("Old: ",Z489ForPrdNor);
               GXutil.writeLogRaw("Current: ",T01UU2_A489ForPrdNor[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01UU2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.colorproductosvariables:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01UU2_A719PrdNum[0]);
            }
            if ( Z490ForPrdUMe != T01UU2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("formulaciontinte.colorproductosvariables:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T01UU2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPRFOR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UU82( )
   {
      beforeValidate1UU82( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UU82( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UU82( 0) ;
         checkOptimisticConcurrency1UU82( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UU82( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UU82( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UU31 */
                  pr_default.execute(25, new Object[] {Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin), A487ForPrdCan, Short.valueOf(A489ForPrdNor), A396EmprCod, A719PrdNum, Byte.valueOf(A490ForPrdUMe)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRFOR");
                  if ( (pr_default.getStatus(25) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ && true /* Level */ )
                     {
                        AV20Texto_i = httpContext.getMessage( httpContext.getMessage( "Inserta Producto ", ""), "") + A719PrdNum + " " + A718PrdNom + httpContext.getMessage( httpContext.getMessage( " Cantidad= ", ""), "") + GXutil.str( A487ForPrdCan, 11, 5) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV20Texto_i", AV20Texto_i);
                     }
                     if ( true /* After */ && true /* Level */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV49Pgmname, AV13UsurCod, AV16Station, AV20Texto_i, A486ForNumCol, (byte)(0), "") ;
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        E490ForPrdUMe = A490ForPrdUMe ;
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
            load1UU82( ) ;
         }
         endLevel1UU82( ) ;
      }
      closeExtendedTableCursors1UU82( ) ;
   }

   public void update1UU82( )
   {
      beforeValidate1UU82( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UU82( ) ;
      }
      if ( ( nIsMod_82 != 0 ) || ( nIsDirty_82 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1UU82( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1UU82( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1UU82( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01UU32 */
                     pr_default.execute(26, new Object[] {A487ForPrdCan, Short.valueOf(A489ForPrdNor), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRFOR");
                     if ( (pr_default.getStatus(26) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPRFOR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1UU82( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( ( GXutil.strcmp(O719PrdNum, A719PrdNum) != 0 ) || ( DecimalUtil.compareTo(O487ForPrdCan, A487ForPrdCan) != 0 ) ) && true /* After */ && true /* Level */ )
                        {
                           AV20Texto_i = httpContext.getMessage( httpContext.getMessage( "Modifica Producto ", ""), "") + O719PrdNum + httpContext.getMessage( httpContext.getMessage( " Old Cantidad= ", ""), "") + GXutil.str( O487ForPrdCan, 11, 5) + httpContext.getMessage( httpContext.getMessage( " por ", ""), "") + A719PrdNum + httpContext.getMessage( httpContext.getMessage( " Cantidad= ", ""), "") + GXutil.str( A487ForPrdCan, 11, 5) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV20Texto_i", AV20Texto_i);
                        }
                        if ( true /* After */ && true /* Level */ )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV49Pgmname, AV13UsurCod, AV16Station, AV20Texto_i, A486ForNumCol, (byte)(0), "") ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1UU82( ) ;
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
            endLevel1UU82( ) ;
         }
      }
      closeExtendedTableCursors1UU82( ) ;
   }

   public void deferredUpdate1UU82( )
   {
   }

   public void delete1UU82( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1UU82( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UU82( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UU82( ) ;
         afterConfirm1UU82( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UU82( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UU33 */
               pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRFOR");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* After */ && true /* Level */ )
                  {
                     AV20Texto_i = httpContext.getMessage( httpContext.getMessage( "Elimina Producto ", ""), "") + A719PrdNum + A718PrdNom + httpContext.getMessage( httpContext.getMessage( " Cantidad= ", ""), "") + GXutil.str( A487ForPrdCan, 11, 5) ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV20Texto_i", AV20Texto_i);
                  }
                  if ( true /* After */ && true /* Level */ )
                  {
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV49Pgmname, AV13UsurCod, AV16Station, AV20Texto_i, A486ForNumCol, (byte)(0), "") ;
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
      sMode82 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UU82( ) ;
      Gx_mode = sMode82 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UU82( )
   {
      standaloneModal1UU82( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01UU34 */
         pr_default.execute(28, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01UU34_A718PrdNom[0] ;
         A4338PrdUMeFo = T01UU34_A4338PrdUMeFo[0] ;
         pr_default.close(28);
         /* Using cursor T01UU35 */
         pr_default.execute(29, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01UU35_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01UU35_n488ForPrdDsc[0] ;
         pr_default.close(29);
      }
   }

   public void endLevel1UU82( )
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

   public void scanStart1UU82( )
   {
      /* Scan By routine */
      /* Using cursor T01UU36 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      RcdFound82 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound82 = (short)(1) ;
         A715PrdLin = T01UU36_A715PrdLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UU82( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound82 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound82 = (short)(1) ;
         A715PrdLin = T01UU36_A715PrdLin[0] ;
      }
   }

   public void scanEnd1UU82( )
   {
      pr_default.close(30);
   }

   public void afterConfirm1UU82( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UU82( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UU82( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UU82( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UU82( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UU82( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UU82( )
   {
      edtPrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtForPrdCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdCan_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtForPrdNor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdNor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdNor_Enabled), 5, 0), !bGXsfl_28_Refreshing);
   }

   public void send_integrity_lvl_hashes1UU82( )
   {
   }

   public void send_integrity_lvl_hashes1UU32( )
   {
   }

   public void subsflControlProps_2882( )
   {
      edtPrdLin_Internalname = "PRDLIN_"+sGXsfl_28_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_28_idx ;
      edtForPrdCan_Internalname = "FORPRDCAN_"+sGXsfl_28_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_28_idx ;
      edtForPrdNor_Internalname = "FORPRDNOR_"+sGXsfl_28_idx ;
      imgprompt_489_Internalname = "PROMPT_489_"+sGXsfl_28_idx ;
   }

   public void subsflControlProps_fel_2882( )
   {
      edtPrdLin_Internalname = "PRDLIN_"+sGXsfl_28_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_28_fel_idx ;
      edtForPrdCan_Internalname = "FORPRDCAN_"+sGXsfl_28_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_28_fel_idx ;
      edtForPrdNor_Internalname = "FORPRDNOR_"+sGXsfl_28_fel_idx ;
      imgprompt_489_Internalname = "PROMPT_489_"+sGXsfl_28_fel_idx ;
   }

   public void addRow1UU82( )
   {
      nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2882( ) ;
      sendRow1UU82( ) ;
   }

   public void sendRow1UU82( )
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
         if ( ((int)((nGXsfl_28_idx) % (2))) == 0 )
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
      imgprompt_489_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.promptproductosvariables"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"FORPRDNOR_"+sGXsfl_28_idx+"'), id:'"+"FORPRDNOR_"+sGXsfl_28_idx+"'"+",IOType:'inout'}"+"],"+"gx.dom.form()."+"nIsMod_82_"+sGXsfl_28_idx+","+"'', false"+","+"false"+");") ;
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_82_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A715PrdLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A715PrdLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,29);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_82_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_82_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdCan_Internalname,GXutil.ltrim( localUtil.ntoc( A487ForPrdCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPrdCan_Enabled!=0) ? localUtil.format( A487ForPrdCan, "ZZZZ9.99999") : localUtil.format( A487ForPrdCan, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,31);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdCan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtForPrdCan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_82_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,32);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtForPrdUMe_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtForPrdUMe_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_82_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdNor_Internalname,GXutil.ltrim( localUtil.ntoc( A489ForPrdNor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPrdNor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A489ForPrdNor), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A489ForPrdNor), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdNor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtForPrdNor_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_489_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_489_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridlevel_level1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_489_Internalname,sImgUrl,imgprompt_489_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(imgprompt_489_Visible),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"",Integer.valueOf(0),"",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"","","","","","","",Integer.valueOf(1),Boolean.valueOf(false),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1UU82( ) ;
      GXCCtl = "Z715PrdLin_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z715PrdLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z487ForPrdCan_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z487ForPrdCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z489ForPrdNor_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z489ForPrdNor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z719PrdNum_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O487ForPrdCan_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O487ForPrdCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O719PrdNum_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O719PrdNum));
      GXCCtl = "nRcdDeleted_82_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_82, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_82_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_82, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_82_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_82, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMFOREQ_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV47MForEq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vEMPRCOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV18EmprCod));
      GXCCtl = "vCLICOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV28Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vFORSER_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV29Forser));
      GXCCtl = "vFORCOLNOM_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV30Forcolnom));
      GXCCtl = "vFORCOLNUM_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV31Forcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vTIPCOLCOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV32TipColcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vFORRELBAN_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV36ForRelBan, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vSTATION_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV16Station));
      GXCCtl = "vVALOR_COR_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV46Valor_cor, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vFORNUMCOL_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV21ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDLIN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDCAN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUME_"+sGXsfl_28_idx+"Horizontalalignment", GXutil.rtrim( edtForPrdUMe_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDNOR_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdNor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROMPT_489_"+sGXsfl_28_idx+"Link", GXutil.rtrim( imgprompt_489_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1UU82( )
   {
      nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2882( ) ;
      edtPrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDLIN_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDCAN_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUME_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUMe_Horizontalalignment = httpContext.cgiGet( "FORPRDUME_"+sGXsfl_28_idx+"Horizontalalignment") ;
      edtForPrdNor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDNOR_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      imgprompt_489_Link = httpContext.cgiGet( "PROMPT_489_"+sGXsfl_28_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "PRDLIN_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdLin_Internalname ;
         wbErr = true ;
         A715PrdLin = (short)(0) ;
      }
      else
      {
         A715PrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtForPrdCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtForPrdCan_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
      {
         GXCCtl = "FORPRDCAN_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdCan_Internalname ;
         wbErr = true ;
         A487ForPrdCan = DecimalUtil.ZERO ;
      }
      else
      {
         A487ForPrdCan = localUtil.ctond( httpContext.cgiGet( edtForPrdCan_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "FORPRDUME_" + sGXsfl_28_idx ;
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
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdNor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdNor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "FORPRDNOR_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdNor_Internalname ;
         wbErr = true ;
         A489ForPrdNor = (short)(0) ;
      }
      else
      {
         A489ForPrdNor = (short)(localUtil.ctol( httpContext.cgiGet( edtForPrdNor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z715PrdLin_" + sGXsfl_28_idx ;
      Z715PrdLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z487ForPrdCan_" + sGXsfl_28_idx ;
      Z487ForPrdCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z489ForPrdNor_" + sGXsfl_28_idx ;
      Z489ForPrdNor = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_28_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z490ForPrdUMe_" + sGXsfl_28_idx ;
      Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O487ForPrdCan_" + sGXsfl_28_idx ;
      O487ForPrdCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O719PrdNum_" + sGXsfl_28_idx ;
      O719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_82_" + sGXsfl_28_idx ;
      nRcdDeleted_82 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_82_" + sGXsfl_28_idx ;
      nRcdExists_82 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_82_" + sGXsfl_28_idx ;
      nIsMod_82 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPrdLin_Enabled = edtPrdLin_Enabled ;
   }

   public void confirmValues1UU0( )
   {
      nGXsfl_28_idx = 0 ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2882( ) ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2882( ) ;
         httpContext.changePostValue( "Z715PrdLin_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z715PrdLin_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z715PrdLin_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z487ForPrdCan_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z487ForPrdCan_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z487ForPrdCan_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z489ForPrdNor_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z489ForPrdNor_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z489ForPrdNor_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z490ForPrdUMe_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z490ForPrdUMe_"+sGXsfl_28_idx) ;
      }
      httpContext.changePostValue( "O487ForPrdCan", httpContext.cgiGet( "T487ForPrdCan")) ;
      httpContext.deletePostValue( "T487ForPrdCan") ;
      httpContext.changePostValue( "O719PrdNum", httpContext.cgiGet( "T719PrdNum")) ;
      httpContext.deletePostValue( "T719PrdNum") ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.colorproductosvariables", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV18EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV21ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV28Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV29Forser)),GXutil.URLEncode(GXutil.rtrim(AV30Forcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV31Forcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV32TipColcod,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV36ForRelBan))}, new String[] {"Gx_mode","EmprCod","ForNumCol","Clicod","Forser","Forcolnom","Forcolnum","TipColcod","ForRelBan"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"ColorProductosVariables");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\colorproductosvariables:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z486ForNumCol", GXutil.ltrim( localUtil.ntoc( Z486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z741PrdUltLin", GXutil.ltrim( localUtil.ntoc( Z741PrdUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O741PrdUltLin", GXutil.ltrim( localUtil.ntoc( O741PrdUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_28", GXutil.ltrim( localUtil.ntoc( nGXsfl_28_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV25PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV25PrdNum_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFORPRDUME_DATA", AV27ForPrdUMe_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFORPRDUME_DATA", AV27ForPrdUMe_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMFOREQ", GXutil.ltrim( localUtil.ntoc( AV47MForEq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMFOREQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV47MForEq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV28Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28Clicod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORSER", GXutil.rtrim( AV29Forser));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29Forser, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNOM", GXutil.rtrim( AV30Forcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Forcolnom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV31Forcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV31Forcolnum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV32TipColcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32TipColcod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORRELBAN", GXutil.ltrim( localUtil.ntoc( AV36ForRelBan, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORRELBAN", getSecureSignedToken( "", localUtil.format( AV36ForRelBan, "ZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALOR_COR", GXutil.ltrim( localUtil.ntoc( AV46Valor_cor, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR_COR", getSecureSignedToken( "", localUtil.format( AV46Valor_cor, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV18EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORNUMCOL", GXutil.ltrim( localUtil.ntoc( AV21ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21ForNumCol), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDULTLIN", GXutil.ltrim( localUtil.ntoc( A741PrdUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDLINMAX", GXutil.ltrim( localUtil.ntoc( A13758PrdlinMax, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO_I", AV20Texto_i);
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUMEFO", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV13UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV16Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXISTECARDINAL", GXutil.ltrim( localUtil.ntoc( AV35existecardinal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMENSAJE", AV33Mensaje);
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDDSC", GXutil.rtrim( A488ForPrdDsc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "BARRADEPROGRESO_Objectcall", GXutil.rtrim( Barradeprogreso_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "BARRADEPROGRESO_Enabled", GXutil.booltostr( Barradeprogreso_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Objectcall", GXutil.rtrim( Combo_prdnum_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Cls", GXutil.rtrim( Combo_prdnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Titlecontrolidtoreplace", GXutil.rtrim( Combo_prdnum_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Isgriditem", GXutil.booltostr( Combo_prdnum_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Emptyitem", GXutil.booltostr( Combo_prdnum_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Objectcall", GXutil.rtrim( Combo_forprdume_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Cls", GXutil.rtrim( Combo_forprdume_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Enabled", GXutil.booltostr( Combo_forprdume_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Titlecontrolidtoreplace", GXutil.rtrim( Combo_forprdume_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Isgriditem", GXutil.booltostr( Combo_forprdume_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FORPRDUME_Emptyitem", GXutil.booltostr( Combo_forprdume_Emptyitem));
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
      return formatLink("app.formulaciontinte.colorproductosvariables", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV18EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV21ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV28Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV29Forser)),GXutil.URLEncode(GXutil.rtrim(AV30Forcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV31Forcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV32TipColcod,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV36ForRelBan))}, new String[] {"Gx_mode","EmprCod","ForNumCol","Clicod","Forser","Forcolnom","Forcolnum","TipColcod","ForRelBan"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.ColorProductosVariables" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Productos (#)", "") ;
   }

   public void initializeNonKey1UU32( )
   {
      A741PrdUltLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
      A13758PrdlinMax = (short)(0) ;
      n13758PrdlinMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13758PrdlinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13758PrdlinMax), 3, 0));
      O741PrdUltLin = A741PrdUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
      Z741PrdUltLin = (short)(0) ;
   }

   public void initAll1UU32( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A486ForNumCol = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A486ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A486ForNumCol), 8, 0));
      initializeNonKey1UU32( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1UU82( )
   {
      AV20Texto_i = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Texto_i", AV20Texto_i);
      A490ForPrdUMe = (byte)(0) ;
      AV35existecardinal = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35existecardinal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35existecardinal), 4, 0));
      AV33Mensaje = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Mensaje", AV33Mensaje);
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A487ForPrdCan = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      A489ForPrdNor = (short)(0) ;
      A4338PrdUMeFo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
      O487ForPrdCan = A487ForPrdCan ;
      O719PrdNum = A719PrdNum ;
      Z487ForPrdCan = DecimalUtil.ZERO ;
      Z489ForPrdNor = (short)(0) ;
      Z719PrdNum = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll1UU82( )
   {
      A715PrdLin = (short)(0) ;
      initializeNonKey1UU82( ) ;
   }

   public void standaloneModalInsert1UU82( )
   {
      A741PrdUltLin = i741PrdUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A741PrdUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A741PrdUltLin), 3, 0));
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116104653", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/colorproductosvariables.js", "?202682116104654", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties82( )
   {
      edtPrdLin_Enabled = defedtPrdLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
   }

   public void startgridcontrol28( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A715PrdLin, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A487ForPrdCan, (byte)(11), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUMe_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtForPrdUMe_Horizontalalignment));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A489ForPrdNor, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdNor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
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
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtPrdLin_Internalname = "PRDLIN" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtForPrdCan_Internalname = "FORPRDCAN" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdNor_Internalname = "FORPRDNOR" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      Combo_forprdume_Internalname = "COMBO_FORPRDUME" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_489_Internalname = "PROMPT_489" ;
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
      Combo_forprdume_Enabled = GXutil.toBoolean( -1) ;
      Combo_prdnum_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Productos (#)", "") );
      imgprompt_489_Visible = 1 ;
      imgprompt_489_Link = "" ;
      imgprompt_489_Visible = 1 ;
      edtForPrdNor_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtForPrdCan_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_prdnum_Titlecontrolidtoreplace = "" ;
      Combo_forprdume_Titlecontrolidtoreplace = "" ;
      edtForPrdNor_Enabled = 1 ;
      edtForPrdUMe_Enabled = 1 ;
      edtForPrdCan_Enabled = 1 ;
      edtPrdNum_Enabled = 1 ;
      edtPrdLin_Enabled = 1 ;
      Combo_forprdume_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_forprdume_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_forprdume_Cls = "ExtendedCombo" ;
      Combo_prdnum_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_prdnum_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_prdnum_Cls = "ExtendedCombo" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divUnnamedtable1_Height = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtForNumCol_Jsonclick = "" ;
      edtForNumCol_Enabled = 1 ;
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
      edtForPrdUMe_Horizontalalignment = "right" ;
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

   public void xc_14_1UU82( String A396EmprCod ,
                            String AV49Pgmname ,
                            String AV13UsurCod ,
                            String AV16Station ,
                            String AV20Texto_i ,
                            int A486ForNumCol ,
                            String A719PrdNum )
   {
      if ( true /* After */ && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV49Pgmname, AV13UsurCod, AV16Station, AV20Texto_i, A486ForNumCol, (byte)(0), "") ;
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

   public void xc_15_1UU82( String A396EmprCod ,
                            String AV49Pgmname ,
                            String AV13UsurCod ,
                            String AV16Station ,
                            String AV20Texto_i ,
                            int A486ForNumCol ,
                            String A719PrdNum )
   {
      if ( true /* After */ && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV49Pgmname, AV13UsurCod, AV16Station, AV20Texto_i, A486ForNumCol, (byte)(0), "") ;
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

   public void xc_16_1UU82( String A396EmprCod ,
                            String AV49Pgmname ,
                            String AV13UsurCod ,
                            String AV16Station ,
                            String AV20Texto_i ,
                            int A486ForNumCol ,
                            String A719PrdNum )
   {
      if ( true /* After */ && true /* Level */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV49Pgmname, AV13UsurCod, AV16Station, AV20Texto_i, A486ForNumCol, (byte)(0), "") ;
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

   public void xc_17_1UU82( String AV18EmprCod ,
                            int AV28Clicod ,
                            String AV29Forser ,
                            String AV30Forcolnom ,
                            int AV31Forcolnum ,
                            byte AV32TipColcod ,
                            short A489ForPrdNor ,
                            String A719PrdNum )
   {
      if ( ! (0==A489ForPrdNor) && true /* After */ )
      {
         GXv_int16[0] = AV35existecardinal ;
         GXv_char12[0] = AV33Mensaje ;
         new app.formulaciontinte.existecardinalenprocesoquimico(remoteHandle, context).execute( AV18EmprCod, AV28Clicod, AV29Forser, AV30Forcolnom, AV31Forcolnum, AV32TipColcod, A489ForPrdNor, A719PrdNum, GXv_int16, GXv_char12) ;
         AV35existecardinal = GXv_int16[0] ;
         AV33Mensaje = GXv_char12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35existecardinal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35existecardinal), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33Mensaje", AV33Mensaje);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV35existecardinal, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV33Mensaje)+"\"") ;
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
      subsflControlProps_2882( ) ;
      while ( nGXsfl_28_idx <= nRC_GXsfl_28 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1UU82( ) ;
         standaloneModal1UU82( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1UU82( ) ;
         nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2882( ) ;
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
      n13758PrdlinMax = false ;
      /* Using cursor T01UU22 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         A13758PrdlinMax = T01UU22_A13758PrdlinMax[0] ;
         n13758PrdlinMax = T01UU22_n13758PrdlinMax[0] ;
      }
      else
      {
         A13758PrdlinMax = (short)(0) ;
         n13758PrdlinMax = false ;
      }
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13758PrdlinMax", GXutil.ltrim( localUtil.ntoc( A13758PrdlinMax, (byte)(3), (byte)(0), ".", "")));
   }

   public void valid_Prdnum( )
   {
      /* Using cursor T01UU34 */
      pr_default.execute(28, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01UU34_A718PrdNom[0] ;
      A4338PrdUMeFo = T01UU34_A4338PrdUMeFo[0] ;
      pr_default.close(28);
      if ( isIns( )  && (0==A490ForPrdUMe) && ( Gx_BScreen == 0 ) )
      {
         A490ForPrdUMe = A4338PrdUMeFo ;
      }
      else
      {
         if ( isIns( )  && (0==A490ForPrdUMe) && ( Gx_BScreen == 0 ) )
         {
            A490ForPrdUMe = E490ForPrdUMe ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Forprdume( )
   {
      n488ForPrdDsc = false ;
      /* Using cursor T01UU35 */
      pr_default.execute(29, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      A488ForPrdDsc = T01UU35_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01UU35_n488ForPrdDsc[0] ;
      pr_default.close(29);
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

   public void valid_Forprdnor( )
   {
      if ( ! (0==A489ForPrdNor) && true /* After */ )
      {
         GXv_int16[0] = AV35existecardinal ;
         GXv_char12[0] = AV33Mensaje ;
         new app.formulaciontinte.existecardinalenprocesoquimico(remoteHandle, context).execute( AV18EmprCod, AV28Clicod, AV29Forser, AV30Forcolnom, AV31Forcolnum, AV32TipColcod, A489ForPrdNor, A719PrdNum, GXv_int16, GXv_char12) ;
         colorproductosvariables_impl.this.AV35existecardinal = GXv_int16[0] ;
         AV35existecardinal = this.AV35existecardinal ;
         colorproductosvariables_impl.this.AV33Mensaje = GXv_char12[0] ;
         AV33Mensaje = this.AV33Mensaje ;
      }
      if ( ! (GXutil.strcmp("", AV33Mensaje)==0) && ( AV35existecardinal == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV33Mensaje, 1, "FORPRDNOR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdNor_Internalname ;
      }
      if ( ! (GXutil.strcmp("", AV33Mensaje)==0) && ( AV35existecardinal == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV33Mensaje, 0, "");
      }
      O487ForPrdCan = A487ForPrdCan ;
      O719PrdNum = A719PrdNum ;
      O741PrdUltLin = A741PrdUltLin ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV35existecardinal", GXutil.ltrim( localUtil.ntoc( AV35existecardinal, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV33Mensaje", AV33Mensaje);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV21ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV28Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV29Forser',fld:'vFORSER',pic:'',hsh:true},{av:'AV30Forcolnom',fld:'vFORCOLNOM',pic:'',hsh:true},{av:'AV31Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV32TipColcod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV36ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV47MForEq',fld:'vMFOREQ',pic:'ZZZ9',hsh:true},{av:'AV28Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV29Forser',fld:'vFORSER',pic:'',hsh:true},{av:'AV30Forcolnom',fld:'vFORCOLNOM',pic:'',hsh:true},{av:'AV31Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV32TipColcod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV36ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99',hsh:true},{av:'AV46Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999',hsh:true},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV21ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV16Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121UU2',iparms:[{av:'AV47MForEq',fld:'vMFOREQ',pic:'ZZZ9',hsh:true},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV28Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV29Forser',fld:'vFORSER',pic:'',hsh:true},{av:'AV30Forcolnom',fld:'vFORCOLNOM',pic:'',hsh:true},{av:'AV31Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV32TipColcod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV36ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99',hsh:true},{av:'AV16Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV46Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'AV32TipColcod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV31Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV30Forcolnom',fld:'vFORCOLNOM',pic:'',hsh:true},{av:'AV29Forser',fld:'vFORSER',pic:'',hsh:true},{av:'AV28Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV36ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99',hsh:true},{av:'AV46Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999',hsh:true},{av:'AV16Station',fld:'vSTATION',pic:'',hsh:true}]}");
      setEventMetadata("VALID_FORNUMCOL","{handler:'valid_Fornumcol',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'A13758PrdlinMax',fld:'PRDLINMAX',pic:'ZZ9'}]");
      setEventMetadata("VALID_FORNUMCOL",",oparms:[{av:'A13758PrdlinMax',fld:'PRDLINMAX',pic:'ZZ9'}]}");
      setEventMetadata("VALIDV_PGMNAME","{handler:'validv_Pgmname',iparms:[]");
      setEventMetadata("VALIDV_PGMNAME",",oparms:[]}");
      setEventMetadata("VALID_PRDLIN","{handler:'valid_Prdlin',iparms:[]");
      setEventMetadata("VALID_PRDLIN",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'}]}");
      setEventMetadata("VALID_FORPRDCAN","{handler:'valid_Forprdcan',iparms:[]");
      setEventMetadata("VALID_FORPRDCAN",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]}");
      setEventMetadata("VALID_FORPRDNOR","{handler:'valid_Forprdnor',iparms:[{av:'AV32TipColcod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV31Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV30Forcolnom',fld:'vFORCOLNOM',pic:'',hsh:true},{av:'AV29Forser',fld:'vFORSER',pic:'',hsh:true},{av:'AV28Clicod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV18EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A741PrdUltLin',fld:'PRDULTLIN',pic:'ZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A487ForPrdCan',fld:'FORPRDCAN',pic:'ZZZZ9.99999'},{av:'A489ForPrdNor',fld:'FORPRDNOR',pic:'ZZZ9'},{av:'AV33Mensaje',fld:'vMENSAJE',pic:''},{av:'AV35existecardinal',fld:'vEXISTECARDINAL',pic:'ZZZ9'}]");
      setEventMetadata("VALID_FORPRDNOR",",oparms:[{av:'AV35existecardinal',fld:'vEXISTECARDINAL',pic:'ZZZ9'},{av:'AV33Mensaje',fld:'vMENSAJE',pic:''}]}");
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
      pr_default.close(28);
      pr_default.close(29);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      E490ForPrdUMe = (byte)(0) ;
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV18EmprCod = "" ;
      wcpOAV29Forser = "" ;
      wcpOAV30Forcolnom = "" ;
      wcpOAV36ForRelBan = DecimalUtil.ZERO ;
      Z396EmprCod = "" ;
      Z487ForPrdCan = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      O487ForPrdCan = DecimalUtil.ZERO ;
      O719PrdNum = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV49Pgmname = "" ;
      AV13UsurCod = "" ;
      AV16Station = "" ;
      AV20Texto_i = "" ;
      A719PrdNum = "" ;
      AV18EmprCod = "" ;
      AV29Forser = "" ;
      AV30Forcolnom = "" ;
      Gx_mode = "" ;
      AV36ForRelBan = DecimalUtil.ZERO ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      Combo_prdnum_Caption = "" ;
      AV25PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucCombo_forprdume = new com.genexus.webpanels.GXUserControl();
      Combo_forprdume_Caption = "" ;
      AV27ForPrdUMe_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode82 = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      A718PrdNom = "" ;
      AV33Mensaje = "" ;
      A488ForPrdDsc = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Barradeprogreso_Objectcall = "" ;
      Barradeprogreso_Class = "" ;
      Barradeprogreso_Height = "" ;
      Barradeprogreso_Width = "" ;
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
      Combo_forprdume_Objectcall = "" ;
      Combo_forprdume_Class = "" ;
      Combo_forprdume_Icontype = "" ;
      Combo_forprdume_Icon = "" ;
      Combo_forprdume_Tooltip = "" ;
      Combo_forprdume_Selectedvalue_set = "" ;
      Combo_forprdume_Selectedvalue_get = "" ;
      Combo_forprdume_Selectedtext_set = "" ;
      Combo_forprdume_Selectedtext_get = "" ;
      Combo_forprdume_Gamoauthtoken = "" ;
      Combo_forprdume_Ddointernalname = "" ;
      Combo_forprdume_Titlecontrolalign = "" ;
      Combo_forprdume_Dropdownoptionstype = "" ;
      Combo_forprdume_Datalisttype = "" ;
      Combo_forprdume_Datalistfixedvalues = "" ;
      Combo_forprdume_Datalistproc = "" ;
      Combo_forprdume_Datalistprocparametersprefix = "" ;
      Combo_forprdume_Remoteservicesparameters = "" ;
      Combo_forprdume_Htmltemplate = "" ;
      Combo_forprdume_Multiplevaluestype = "" ;
      Combo_forprdume_Loadingdata = "" ;
      Combo_forprdume_Noresultsfound = "" ;
      Combo_forprdume_Emptyitemtext = "" ;
      Combo_forprdume_Onlyselectedvalues = "" ;
      Combo_forprdume_Selectalltext = "" ;
      Combo_forprdume_Multiplevaluesseparator = "" ;
      Combo_forprdume_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode32 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      T487ForPrdCan = DecimalUtil.ZERO ;
      T719PrdNum = "" ;
      T01UU7_A13758PrdlinMax = new short[1] ;
      T01UU7_n13758PrdlinMax = new boolean[] {false} ;
      AV19EmprNom = "" ;
      GXt_char1 = "" ;
      AV22WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV23TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV24WebSession = httpContext.getWebSession();
      GXv_char2 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      AV46Valor_cor = DecimalUtil.ZERO ;
      GXv_int11 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      AV26ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item15 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T01UU10_A407EmprNom = new String[] {""} ;
      T01UU10_n407EmprNom = new boolean[] {false} ;
      T01UU12_A486ForNumCol = new int[1] ;
      T01UU12_A741PrdUltLin = new short[1] ;
      T01UU12_A407EmprNom = new String[] {""} ;
      T01UU12_n407EmprNom = new boolean[] {false} ;
      T01UU12_A396EmprCod = new String[] {""} ;
      T01UU12_A13758PrdlinMax = new short[1] ;
      T01UU12_n13758PrdlinMax = new boolean[] {false} ;
      T01UU14_A13758PrdlinMax = new short[1] ;
      T01UU14_n13758PrdlinMax = new boolean[] {false} ;
      T01UU15_A396EmprCod = new String[] {""} ;
      T01UU15_A486ForNumCol = new int[1] ;
      T01UU9_A486ForNumCol = new int[1] ;
      T01UU9_A741PrdUltLin = new short[1] ;
      T01UU9_A396EmprCod = new String[] {""} ;
      T01UU16_A396EmprCod = new String[] {""} ;
      T01UU16_A486ForNumCol = new int[1] ;
      T01UU17_A396EmprCod = new String[] {""} ;
      T01UU17_A486ForNumCol = new int[1] ;
      T01UU8_A486ForNumCol = new int[1] ;
      T01UU8_A741PrdUltLin = new short[1] ;
      T01UU8_A396EmprCod = new String[] {""} ;
      T01UU22_A13758PrdlinMax = new short[1] ;
      T01UU22_n13758PrdlinMax = new boolean[] {false} ;
      T01UU23_A396EmprCod = new String[] {""} ;
      T01UU23_A252CliCod = new int[1] ;
      T01UU23_A494ForSer = new String[] {""} ;
      T01UU23_A482ForColNom = new String[] {""} ;
      T01UU23_A483ForColNum = new int[1] ;
      T01UU23_A831TipColCod = new byte[1] ;
      T01UU24_A396EmprCod = new String[] {""} ;
      T01UU24_A486ForNumCol = new int[1] ;
      T01UU24_A309ColLin = new short[1] ;
      T01UU26_A396EmprCod = new String[] {""} ;
      T01UU26_A486ForNumCol = new int[1] ;
      Z718PrdNom = "" ;
      Z488ForPrdDsc = "" ;
      T01UU27_A486ForNumCol = new int[1] ;
      T01UU27_A715PrdLin = new short[1] ;
      T01UU27_A718PrdNom = new String[] {""} ;
      T01UU27_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UU27_A488ForPrdDsc = new String[] {""} ;
      T01UU27_n488ForPrdDsc = new boolean[] {false} ;
      T01UU27_A489ForPrdNor = new short[1] ;
      T01UU27_A4338PrdUMeFo = new byte[1] ;
      T01UU27_A396EmprCod = new String[] {""} ;
      T01UU27_A719PrdNum = new String[] {""} ;
      T01UU27_A490ForPrdUMe = new byte[1] ;
      T01UU4_A718PrdNom = new String[] {""} ;
      T01UU4_A4338PrdUMeFo = new byte[1] ;
      T01UU5_A488ForPrdDsc = new String[] {""} ;
      T01UU5_n488ForPrdDsc = new boolean[] {false} ;
      T01UU28_A718PrdNom = new String[] {""} ;
      T01UU28_A4338PrdUMeFo = new byte[1] ;
      T01UU29_A488ForPrdDsc = new String[] {""} ;
      T01UU29_n488ForPrdDsc = new boolean[] {false} ;
      T01UU30_A396EmprCod = new String[] {""} ;
      T01UU30_A486ForNumCol = new int[1] ;
      T01UU30_A715PrdLin = new short[1] ;
      T01UU3_A486ForNumCol = new int[1] ;
      T01UU3_A715PrdLin = new short[1] ;
      T01UU3_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UU3_A489ForPrdNor = new short[1] ;
      T01UU3_A396EmprCod = new String[] {""} ;
      T01UU3_A719PrdNum = new String[] {""} ;
      T01UU3_A490ForPrdUMe = new byte[1] ;
      T01UU2_A486ForNumCol = new int[1] ;
      T01UU2_A715PrdLin = new short[1] ;
      T01UU2_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UU2_A489ForPrdNor = new short[1] ;
      T01UU2_A396EmprCod = new String[] {""} ;
      T01UU2_A719PrdNum = new String[] {""} ;
      T01UU2_A490ForPrdUMe = new byte[1] ;
      T01UU34_A718PrdNom = new String[] {""} ;
      T01UU34_A4338PrdUMeFo = new byte[1] ;
      T01UU35_A488ForPrdDsc = new String[] {""} ;
      T01UU35_n488ForPrdDsc = new boolean[] {false} ;
      T01UU36_A396EmprCod = new String[] {""} ;
      T01UU36_A486ForNumCol = new int[1] ;
      T01UU36_A715PrdLin = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      imgprompt_489_gximage = "" ;
      sImgUrl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int16 = new short[1] ;
      GXv_char12 = new String[1] ;
      ZV33Mensaje = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorproductosvariables__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorproductosvariables__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorproductosvariables__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorproductosvariables__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorproductosvariables__default(),
         new Object[] {
             new Object[] {
            T01UU2_A486ForNumCol, T01UU2_A715PrdLin, T01UU2_A487ForPrdCan, T01UU2_A489ForPrdNor, T01UU2_A396EmprCod, T01UU2_A719PrdNum, T01UU2_A490ForPrdUMe
            }
            , new Object[] {
            T01UU3_A486ForNumCol, T01UU3_A715PrdLin, T01UU3_A487ForPrdCan, T01UU3_A489ForPrdNor, T01UU3_A396EmprCod, T01UU3_A719PrdNum, T01UU3_A490ForPrdUMe
            }
            , new Object[] {
            T01UU4_A718PrdNom, T01UU4_A4338PrdUMeFo
            }
            , new Object[] {
            T01UU5_A488ForPrdDsc, T01UU5_n488ForPrdDsc
            }
            , new Object[] {
            T01UU7_A13758PrdlinMax, T01UU7_n13758PrdlinMax
            }
            , new Object[] {
            T01UU8_A486ForNumCol, T01UU8_A741PrdUltLin, T01UU8_A396EmprCod
            }
            , new Object[] {
            T01UU9_A486ForNumCol, T01UU9_A741PrdUltLin, T01UU9_A396EmprCod
            }
            , new Object[] {
            T01UU10_A407EmprNom, T01UU10_n407EmprNom
            }
            , new Object[] {
            T01UU12_A486ForNumCol, T01UU12_A741PrdUltLin, T01UU12_A407EmprNom, T01UU12_n407EmprNom, T01UU12_A396EmprCod, T01UU12_A13758PrdlinMax, T01UU12_n13758PrdlinMax
            }
            , new Object[] {
            T01UU14_A13758PrdlinMax, T01UU14_n13758PrdlinMax
            }
            , new Object[] {
            T01UU15_A396EmprCod, T01UU15_A486ForNumCol
            }
            , new Object[] {
            T01UU16_A396EmprCod, T01UU16_A486ForNumCol
            }
            , new Object[] {
            T01UU17_A396EmprCod, T01UU17_A486ForNumCol
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UU22_A13758PrdlinMax, T01UU22_n13758PrdlinMax
            }
            , new Object[] {
            T01UU23_A396EmprCod, T01UU23_A252CliCod, T01UU23_A494ForSer, T01UU23_A482ForColNom, T01UU23_A483ForColNum, T01UU23_A831TipColCod
            }
            , new Object[] {
            T01UU24_A396EmprCod, T01UU24_A486ForNumCol, T01UU24_A309ColLin
            }
            , new Object[] {
            }
            , new Object[] {
            T01UU26_A396EmprCod, T01UU26_A486ForNumCol
            }
            , new Object[] {
            T01UU27_A486ForNumCol, T01UU27_A715PrdLin, T01UU27_A718PrdNom, T01UU27_A487ForPrdCan, T01UU27_A488ForPrdDsc, T01UU27_n488ForPrdDsc, T01UU27_A489ForPrdNor, T01UU27_A4338PrdUMeFo, T01UU27_A396EmprCod, T01UU27_A719PrdNum,
            T01UU27_A490ForPrdUMe
            }
            , new Object[] {
            T01UU28_A718PrdNom, T01UU28_A4338PrdUMeFo
            }
            , new Object[] {
            T01UU29_A488ForPrdDsc, T01UU29_n488ForPrdDsc
            }
            , new Object[] {
            T01UU30_A396EmprCod, T01UU30_A486ForNumCol, T01UU30_A715PrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UU34_A718PrdNom, T01UU34_A4338PrdUMeFo
            }
            , new Object[] {
            T01UU35_A488ForPrdDsc, T01UU35_n488ForPrdDsc
            }
            , new Object[] {
            T01UU36_A396EmprCod, T01UU36_A486ForNumCol, T01UU36_A715PrdLin
            }
         }
      );
      Z490ForPrdUMe = (byte)(0) ;
      E490ForPrdUMe = (byte)(0) ;
      A490ForPrdUMe = (byte)(0) ;
      Z490ForPrdUMe = (byte)(0) ;
      E490ForPrdUMe = (byte)(0) ;
      A490ForPrdUMe = (byte)(0) ;
      AV49Pgmname = "FormulacionTinte.ColorProductosVariables" ;
   }

   private byte wcpOAV32TipColcod ;
   private byte Z490ForPrdUMe ;
   private byte GxWebError ;
   private byte AV32TipColcod ;
   private byte A490ForPrdUMe ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A4338PrdUMeFo ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Z4338PrdUMeFo ;
   private byte E490ForPrdUMe ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short nIsMod_82 ;
   private short Z741PrdUltLin ;
   private short O741PrdUltLin ;
   private short Z715PrdLin ;
   private short Z489ForPrdNor ;
   private short nRcdDeleted_82 ;
   private short nRcdExists_82 ;
   private short A489ForPrdNor ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A741PrdUltLin ;
   private short nBlankRcdCount82 ;
   private short RcdFound82 ;
   private short B741PrdUltLin ;
   private short nBlankRcdUsr82 ;
   private short A13758PrdlinMax ;
   private short AV35existecardinal ;
   private short RcdFound32 ;
   private short s741PrdUltLin ;
   private short A715PrdLin ;
   private short AV47MForEq ;
   private short Z13758PrdlinMax ;
   private short nIsDirty_32 ;
   private short nIsDirty_82 ;
   private short i741PrdUltLin ;
   private short GXv_int16[] ;
   private short ZV35existecardinal ;
   private int wcpOAV21ForNumCol ;
   private int wcpOAV28Clicod ;
   private int wcpOAV31Forcolnum ;
   private int Z486ForNumCol ;
   private int nRC_GXsfl_28 ;
   private int nGXsfl_28_idx=1 ;
   private int A486ForNumCol ;
   private int AV28Clicod ;
   private int AV31Forcolnum ;
   private int AV21ForNumCol ;
   private int trnEnded ;
   private int edtForNumCol_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int divUnnamedtable1_Height ;
   private int edtavPgmname_Enabled ;
   private int edtPrdLin_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtForPrdCan_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtForPrdNor_Enabled ;
   private int fRowAdded ;
   private int Combo_prdnum_Datalistupdateminimumcharacters ;
   private int Combo_forprdume_Datalistupdateminimumcharacters ;
   private int GXv_int8[] ;
   private int GXv_int11[] ;
   private int GXv_int9[] ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int imgprompt_489_Visible ;
   private int defedtPrdLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal wcpOAV36ForRelBan ;
   private java.math.BigDecimal Z487ForPrdCan ;
   private java.math.BigDecimal O487ForPrdCan ;
   private java.math.BigDecimal AV36ForRelBan ;
   private java.math.BigDecimal A487ForPrdCan ;
   private java.math.BigDecimal T487ForPrdCan ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal AV46Valor_cor ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private String sPrefix ;
   private String sGXsfl_28_idx="0001" ;
   private String wcpOGx_mode ;
   private String wcpOAV18EmprCod ;
   private String wcpOAV29Forser ;
   private String wcpOAV30Forcolnom ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String O719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV49Pgmname ;
   private String AV13UsurCod ;
   private String AV16Station ;
   private String A719PrdNum ;
   private String AV18EmprCod ;
   private String AV29Forser ;
   private String AV30Forcolnom ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtForNumCol_Internalname ;
   private String edtForPrdUMe_Horizontalalignment ;
   private String edtForPrdUMe_Internalname ;
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
   private String edtForNumCol_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String Barradeprogreso_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Internalname ;
   private String Combo_forprdume_Caption ;
   private String Combo_forprdume_Cls ;
   private String Combo_forprdume_Internalname ;
   private String sMode82 ;
   private String edtPrdLin_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtForPrdCan_Internalname ;
   private String edtForPrdNor_Internalname ;
   private String imgprompt_489_Link ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A407EmprNom ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Barradeprogreso_Objectcall ;
   private String Barradeprogreso_Class ;
   private String Barradeprogreso_Height ;
   private String Barradeprogreso_Width ;
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
   private String Combo_forprdume_Objectcall ;
   private String Combo_forprdume_Class ;
   private String Combo_forprdume_Icontype ;
   private String Combo_forprdume_Icon ;
   private String Combo_forprdume_Tooltip ;
   private String Combo_forprdume_Selectedvalue_set ;
   private String Combo_forprdume_Selectedvalue_get ;
   private String Combo_forprdume_Selectedtext_set ;
   private String Combo_forprdume_Selectedtext_get ;
   private String Combo_forprdume_Gamoauthtoken ;
   private String Combo_forprdume_Ddointernalname ;
   private String Combo_forprdume_Titlecontrolalign ;
   private String Combo_forprdume_Dropdownoptionstype ;
   private String Combo_forprdume_Titlecontrolidtoreplace ;
   private String Combo_forprdume_Datalisttype ;
   private String Combo_forprdume_Datalistfixedvalues ;
   private String Combo_forprdume_Datalistproc ;
   private String Combo_forprdume_Datalistprocparametersprefix ;
   private String Combo_forprdume_Remoteservicesparameters ;
   private String Combo_forprdume_Htmltemplate ;
   private String Combo_forprdume_Multiplevaluestype ;
   private String Combo_forprdume_Loadingdata ;
   private String Combo_forprdume_Noresultsfound ;
   private String Combo_forprdume_Emptyitemtext ;
   private String Combo_forprdume_Onlyselectedvalues ;
   private String Combo_forprdume_Selectalltext ;
   private String Combo_forprdume_Multiplevaluesseparator ;
   private String Combo_forprdume_Addnewoptiontext ;
   private String hsh ;
   private String sMode32 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String T719PrdNum ;
   private String AV19EmprNom ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z407EmprNom ;
   private String Z718PrdNom ;
   private String Z488ForPrdDsc ;
   private String imgprompt_489_Internalname ;
   private String sGXsfl_28_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtPrdLin_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtForPrdCan_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdNor_Jsonclick ;
   private String imgprompt_489_gximage ;
   private String sImgUrl ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private String GXv_char12[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_28_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_prdnum_Isgriditem ;
   private boolean Combo_prdnum_Emptyitem ;
   private boolean Combo_forprdume_Isgriditem ;
   private boolean Combo_forprdume_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean n13758PrdlinMax ;
   private boolean n488ForPrdDsc ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Barradeprogreso_Enabled ;
   private boolean Barradeprogreso_Visible ;
   private boolean Combo_prdnum_Enabled ;
   private boolean Combo_prdnum_Visible ;
   private boolean Combo_prdnum_Allowmultipleselection ;
   private boolean Combo_prdnum_Hasdescription ;
   private boolean Combo_prdnum_Includeonlyselectedoption ;
   private boolean Combo_prdnum_Includeselectalloption ;
   private boolean Combo_prdnum_Includeaddnewoption ;
   private boolean Combo_forprdume_Enabled ;
   private boolean Combo_forprdume_Visible ;
   private boolean Combo_forprdume_Allowmultipleselection ;
   private boolean Combo_forprdume_Hasdescription ;
   private boolean Combo_forprdume_Includeonlyselectedoption ;
   private boolean Combo_forprdume_Includeselectalloption ;
   private boolean Combo_forprdume_Includeaddnewoption ;
   private boolean returnInSub ;
   private String AV20Texto_i ;
   private String AV33Mensaje ;
   private String AV26ComboSelectedValue ;
   private String ZV33Mensaje ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV24WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.webpanels.GXUserControl ucCombo_forprdume ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private short[] T01UU7_A13758PrdlinMax ;
   private boolean[] T01UU7_n13758PrdlinMax ;
   private String[] T01UU10_A407EmprNom ;
   private boolean[] T01UU10_n407EmprNom ;
   private int[] T01UU12_A486ForNumCol ;
   private short[] T01UU12_A741PrdUltLin ;
   private String[] T01UU12_A407EmprNom ;
   private boolean[] T01UU12_n407EmprNom ;
   private String[] T01UU12_A396EmprCod ;
   private short[] T01UU12_A13758PrdlinMax ;
   private boolean[] T01UU12_n13758PrdlinMax ;
   private short[] T01UU14_A13758PrdlinMax ;
   private boolean[] T01UU14_n13758PrdlinMax ;
   private String[] T01UU15_A396EmprCod ;
   private int[] T01UU15_A486ForNumCol ;
   private int[] T01UU9_A486ForNumCol ;
   private short[] T01UU9_A741PrdUltLin ;
   private String[] T01UU9_A396EmprCod ;
   private String[] T01UU16_A396EmprCod ;
   private int[] T01UU16_A486ForNumCol ;
   private String[] T01UU17_A396EmprCod ;
   private int[] T01UU17_A486ForNumCol ;
   private int[] T01UU8_A486ForNumCol ;
   private short[] T01UU8_A741PrdUltLin ;
   private String[] T01UU8_A396EmprCod ;
   private short[] T01UU22_A13758PrdlinMax ;
   private boolean[] T01UU22_n13758PrdlinMax ;
   private String[] T01UU23_A396EmprCod ;
   private int[] T01UU23_A252CliCod ;
   private String[] T01UU23_A494ForSer ;
   private String[] T01UU23_A482ForColNom ;
   private int[] T01UU23_A483ForColNum ;
   private byte[] T01UU23_A831TipColCod ;
   private String[] T01UU24_A396EmprCod ;
   private int[] T01UU24_A486ForNumCol ;
   private short[] T01UU24_A309ColLin ;
   private String[] T01UU26_A396EmprCod ;
   private int[] T01UU26_A486ForNumCol ;
   private int[] T01UU27_A486ForNumCol ;
   private short[] T01UU27_A715PrdLin ;
   private String[] T01UU27_A718PrdNom ;
   private java.math.BigDecimal[] T01UU27_A487ForPrdCan ;
   private String[] T01UU27_A488ForPrdDsc ;
   private boolean[] T01UU27_n488ForPrdDsc ;
   private short[] T01UU27_A489ForPrdNor ;
   private byte[] T01UU27_A4338PrdUMeFo ;
   private String[] T01UU27_A396EmprCod ;
   private String[] T01UU27_A719PrdNum ;
   private byte[] T01UU27_A490ForPrdUMe ;
   private String[] T01UU4_A718PrdNom ;
   private byte[] T01UU4_A4338PrdUMeFo ;
   private String[] T01UU5_A488ForPrdDsc ;
   private boolean[] T01UU5_n488ForPrdDsc ;
   private String[] T01UU28_A718PrdNom ;
   private byte[] T01UU28_A4338PrdUMeFo ;
   private String[] T01UU29_A488ForPrdDsc ;
   private boolean[] T01UU29_n488ForPrdDsc ;
   private String[] T01UU30_A396EmprCod ;
   private int[] T01UU30_A486ForNumCol ;
   private short[] T01UU30_A715PrdLin ;
   private int[] T01UU3_A486ForNumCol ;
   private short[] T01UU3_A715PrdLin ;
   private java.math.BigDecimal[] T01UU3_A487ForPrdCan ;
   private short[] T01UU3_A489ForPrdNor ;
   private String[] T01UU3_A396EmprCod ;
   private String[] T01UU3_A719PrdNum ;
   private byte[] T01UU3_A490ForPrdUMe ;
   private int[] T01UU2_A486ForNumCol ;
   private short[] T01UU2_A715PrdLin ;
   private java.math.BigDecimal[] T01UU2_A487ForPrdCan ;
   private short[] T01UU2_A489ForPrdNor ;
   private String[] T01UU2_A396EmprCod ;
   private String[] T01UU2_A719PrdNum ;
   private byte[] T01UU2_A490ForPrdUMe ;
   private String[] T01UU34_A718PrdNom ;
   private byte[] T01UU34_A4338PrdUMeFo ;
   private String[] T01UU35_A488ForPrdDsc ;
   private boolean[] T01UU35_n488ForPrdDsc ;
   private String[] T01UU36_A396EmprCod ;
   private int[] T01UU36_A486ForNumCol ;
   private short[] T01UU36_A715PrdLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV25PrdNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV27ForPrdUMe_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item14 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item15[] ;
   private app.wwpbaseobjects.SdtWWPContext AV22WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV23TrnContext ;
}

final  class colorproductosvariables__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class colorproductosvariables__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class colorproductosvariables__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class colorproductosvariables__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class colorproductosvariables__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UU2", "SELECT ForNumCol, PrdLin, ForPrdCan, ForPrdNor, EmprCod, PrdNum, ForPrdUMe FROM TXPLPRFOR WHERE EmprCod = ? AND ForNumCol = ? AND PrdLin = ?  FOR UPDATE OF ForPrdCan, ForPrdNor, PrdNum, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UU3", "SELECT ForNumCol, PrdLin, ForPrdCan, ForPrdNor, EmprCod, PrdNum, ForPrdUMe FROM TXPLPRFOR WHERE EmprCod = ? AND ForNumCol = ? AND PrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UU4", "SELECT PrdNom, PrdUMeFo FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UU5", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UU7", "SELECT COALESCE( T1.PrdlinMax, 0) AS PrdlinMax FROM (SELECT MAX(PrdLin) AS PrdlinMax, EmprCod, ForNumCol FROM TXPLPRFOR GROUP BY EmprCod, ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UU8", "SELECT ForNumCol, PrdUltLin, EmprCod FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ?  FOR UPDATE OF PrdUltLin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UU9", "SELECT ForNumCol, PrdUltLin, EmprCod FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UU10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UU12", "SELECT /*+ FIRST_ROWS(100) */ TM1.ForNumCol, TM1.PrdUltLin, T2.EmprNom, TM1.EmprCod, COALESCE( T3.PrdlinMax, 0) AS PrdlinMax FROM ((TXPCDFORM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT MAX(PrdLin) AS PrdlinMax, EmprCod, ForNumCol FROM TXPLPRFOR GROUP BY EmprCod, ForNumCol ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.ForNumCol = TM1.ForNumCol) WHERE TM1.EmprCod = ? and TM1.ForNumCol = ? ORDER BY TM1.EmprCod, TM1.ForNumCol ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UU14", "SELECT COALESCE( T1.PrdlinMax, 0) AS PrdlinMax FROM (SELECT MAX(PrdLin) AS PrdlinMax, EmprCod, ForNumCol FROM TXPLPRFOR GROUP BY EmprCod, ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UU15", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ForNumCol FROM TXPCDFORM WHERE EmprCod = ? AND ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UU16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ForNumCol FROM TXPCDFORM WHERE ( EmprCod > ? or EmprCod = ? and ForNumCol > ?) ORDER BY EmprCod, ForNumCol) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UU17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ForNumCol FROM TXPCDFORM WHERE ( EmprCod < ? or EmprCod = ? and ForNumCol < ?) ORDER BY EmprCod DESC, ForNumCol DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UU18", "INSERT INTO TXPCDFORM(ForNumCol, PrdUltLin, EmprCod, ColUltLin, ContNum, CosKgm, Lb_TaAuxC, Lb_fam1, Lb_fam2, Lb_fam3) VALUES(?, ?, ?, 0, 0, 0, ' ', 0, 0, 0)", GX_NOMASK, "TXPCDFORM")
         ,new UpdateCursor("T01UU19", "UPDATE TXPCDFORM SET PrdUltLin=?  WHERE EmprCod = ? AND ForNumCol = ?", GX_NOMASK, "TXPCDFORM")
         ,new UpdateCursor("T01UU20", "DELETE FROM TXPCDFORM  WHERE EmprCod = ? AND ForNumCol = ?", GX_NOMASK, "TXPCDFORM")
         ,new ForEachCursor("T01UU22", "SELECT COALESCE( T1.PrdlinMax, 0) AS PrdlinMax FROM (SELECT MAX(PrdLin) AS PrdlinMax, EmprCod, ForNumCol FROM TXPLPRFOR GROUP BY EmprCod, ForNumCol ) T1 WHERE T1.EmprCod = ? AND T1.ForNumCol = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UU23", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND ForNumCol = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UU24", "SELECT * FROM (SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? AND ForNumCol = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UU25", "UPDATE TXPCDFORM SET PrdUltLin=?  WHERE EmprCod = ? AND ForNumCol = ?", GX_NOMASK, "TXPCDFORM")
         ,new ForEachCursor("T01UU26", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ForNumCol FROM TXPCDFORM ORDER BY EmprCod, ForNumCol ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UU27", "SELECT T1.ForNumCol, T1.PrdLin, T2.PrdNom, T1.ForPrdCan, T3.ForPrdDsc, T1.ForPrdNor, T2.PrdUMeFo, T1.EmprCod, T1.PrdNum, T1.ForPrdUMe FROM ((TXPLPRFOR T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ForNumCol = ? and T1.PrdLin = ? ORDER BY T1.EmprCod, T1.ForNumCol, T1.PrdLin ",true, GX_NOMASK, false, this,3, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UU28", "SELECT PrdNom, PrdUMeFo FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UU29", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UU30", "SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? AND ForNumCol = ? AND PrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01UU31", "INSERT INTO TXPLPRFOR(ForNumCol, PrdLin, ForPrdCan, ForPrdNor, EmprCod, PrdNum, ForPrdUMe) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLPRFOR")
         ,new UpdateCursor("T01UU32", "UPDATE TXPLPRFOR SET ForPrdCan=?, ForPrdNor=?, PrdNum=?, ForPrdUMe=?  WHERE EmprCod = ? AND ForNumCol = ? AND PrdLin = ?", GX_NOMASK, "TXPLPRFOR")
         ,new UpdateCursor("T01UU33", "DELETE FROM TXPLPRFOR  WHERE EmprCod = ? AND ForNumCol = ? AND PrdLin = ?", GX_NOMASK, "TXPLPRFOR")
         ,new ForEachCursor("T01UU34", "SELECT PrdNom, PrdUMeFo FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UU35", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UU36", "SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, PrdLin ",true, GX_NOMASK, false, this,3, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 25 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 26 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

