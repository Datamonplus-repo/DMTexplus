package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tserpa2copy1_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action18") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A1664ParFasCod = (short)(GXutil.lval( httpContext.GetPar( "ParFasCod"))) ;
         A10584ParNVar = (short)(GXutil.lval( httpContext.GetPar( "ParNVar"))) ;
         n10584ParNVar = false ;
         AV30Flagr = (byte)(GXutil.lval( httpContext.GetPar( "Flagr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Flagr", GXutil.str( AV30Flagr, 1, 0));
         AV31Msg_err = httpContext.GetPar( "Msg_err") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Msg_err", AV31Msg_err);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_18_1PF477( A396EmprCod, A252CliCod, A65ArtCod, A758ProCod, A457FasCod, A1664ParFasCod, A10584ParNVar, AV30Flagr, AV31Msg_err) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
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
         gxload_22( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_23") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_23( A396EmprCod, A252CliCod, A65ArtCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A396EmprCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_25") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_25( A396EmprCod, A252CliCod, A65ArtCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_26") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_26( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_27( A396EmprCod, A252CliCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1664ParFasCod = (short)(GXutil.lval( httpContext.GetPar( "ParFasCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_29( A396EmprCod, A1664ParFasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_30") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13203ParUndID = (short)(GXutil.lval( httpContext.GetPar( "ParUndID"))) ;
         n13203ParUndID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13203ParUndID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13203ParUndID), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_30( A396EmprCod, A13203ParUndID) ;
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
            AV42EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42EmprCod", AV42EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42EmprCod, "@!"))));
            AV16CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CliCod), "ZZZZZ9")));
            AV17ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17ArtCod", AV17ArtCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17ArtCod, ""))));
            AV43ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43ProCod", AV43ProCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43ProCod, ""))));
            AV44FasCod = httpContext.GetPar( "FasCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44FasCod", AV44FasCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44FasCod, "@!"))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Parametros Fases", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCliCod_Internalname ;
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
      nRC_GXsfl_71 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_71"))) ;
      nGXsfl_71_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_71_idx"))) ;
      sGXsfl_71_idx = httpContext.GetPar( "sGXsfl_71_idx") ;
      edtParFasCod_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Horizontalalignment", edtParFasCod_Horizontalalignment, !bGXsfl_71_Refreshing);
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

   public tserpa2copy1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tserpa2copy1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tserpa2copy1_impl.class ));
   }

   public tserpa2copy1_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TSERPA2Copy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSERPA2Copy1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtCod_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtCod_Enabled, 1, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSERPA2Copy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSERPA2Copy1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProCod_Internalname, httpContext.getMessage( "Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProCod_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSERPA2Copy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSERPA2Copy1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasCod_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasCod_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSERPA2Copy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSERPA2Copy1.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TSERPA2Copy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TSERPA2Copy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TSERPA2Copy1.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV51Pgmname), GXutil.rtrim( localUtil.format( AV51Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSERPA2Copy1.htm");
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
      /* User Defined Control */
      ucCombo_parfascod.setProperty("Caption", Combo_parfascod_Caption);
      ucCombo_parfascod.setProperty("Cls", Combo_parfascod_Cls);
      ucCombo_parfascod.setProperty("IsGridItem", Combo_parfascod_Isgriditem);
      ucCombo_parfascod.setProperty("EmptyItem", Combo_parfascod_Emptyitem);
      ucCombo_parfascod.setProperty("DropDownOptionsData", AV48ParFasCod_Data);
      ucCombo_parfascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_parfascod_Internalname, "COMBO_PARFASCODContainer");
      /* User Defined Control */
      ucGridlevel_level1_titlescategories.setProperty("GridTitlesCategories", Gridlevel_level1_titlescategories_Gridtitlescategories);
      ucGridlevel_level1_titlescategories.render(context, "dvelop.gridtitlescategories", Gridlevel_level1_titlescategories_Internalname, "GRIDLEVEL_LEVEL1_TITLESCATEGORIESContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol71( ) ;
      nGXsfl_71_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount477 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_477 = (short)(1) ;
            scanStart1PF477( ) ;
            while ( RcdFound477 != 0 )
            {
               init_level_properties477( ) ;
               getByPrimaryKey1PF477( ) ;
               addRow1PF477( ) ;
               scanNext1PF477( ) ;
            }
            scanEnd1PF477( ) ;
            nBlankRcdCount477 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1PF477( ) ;
         standaloneModal1PF477( ) ;
         sMode477 = Gx_mode ;
         while ( nGXsfl_71_idx < nRC_GXsfl_71 )
         {
            bGXsfl_71_Refreshing = true ;
            readRow1PF477( ) ;
            edtParFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASCOD_"+sGXsfl_71_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_71_Refreshing);
            edtParFasCod_Horizontalalignment = httpContext.cgiGet( "PARFASCOD_"+sGXsfl_71_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Horizontalalignment", edtParFasCod_Horizontalalignment, !bGXsfl_71_Refreshing);
            edtParFasVl2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASVL2_"+sGXsfl_71_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasVl2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasVl2_Enabled), 5, 0), !bGXsfl_71_Refreshing);
            edtParUndDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARUNDDSC_"+sGXsfl_71_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParUndDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParUndDsc_Enabled), 5, 0), !bGXsfl_71_Refreshing);
            edtParFasVmn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASVMN_"+sGXsfl_71_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasVmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasVmn_Enabled), 5, 0), !bGXsfl_71_Refreshing);
            edtParFasVmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASVMX_"+sGXsfl_71_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasVmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasVmx_Enabled), 5, 0), !bGXsfl_71_Refreshing);
            edtParFasObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASOBS_"+sGXsfl_71_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasObs_Enabled), 5, 0), !bGXsfl_71_Refreshing);
            edtParNVar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARNVAR_"+sGXsfl_71_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParNVar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParNVar_Enabled), 5, 0), !bGXsfl_71_Refreshing);
            edtParTit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARTIT_"+sGXsfl_71_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParTit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParTit_Enabled), 5, 0), !bGXsfl_71_Refreshing);
            if ( ( nRcdExists_477 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1PF477( ) ;
            }
            sendRow1PF477( ) ;
            bGXsfl_71_Refreshing = false ;
         }
         Gx_mode = sMode477 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount477 = (short)(5) ;
         nRcdExists_477 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1PF477( ) ;
            while ( RcdFound477 != 0 )
            {
               sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_71477( ) ;
               init_level_properties477( ) ;
               standaloneNotModal1PF477( ) ;
               getByPrimaryKey1PF477( ) ;
               standaloneModal1PF477( ) ;
               addRow1PF477( ) ;
               scanNext1PF477( ) ;
            }
            scanEnd1PF477( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode477 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_71477( ) ;
         initAll1PF477( ) ;
         init_level_properties477( ) ;
         nRcdExists_477 = (short)(0) ;
         nIsMod_477 = (short)(0) ;
         nRcdDeleted_477 = (short)(0) ;
         nBlankRcdCount477 = (short)(nBlankRcdUsr477+nBlankRcdCount477) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount477 > 0 )
         {
            standaloneNotModal1PF477( ) ;
            standaloneModal1PF477( ) ;
            addRow1PF477( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtParFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount477 = (short)(nBlankRcdCount477-1) ;
         }
         Gx_mode = sMode477 ;
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
      e111PF2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARFASCOD_DATA"), AV48ParFasCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            Z8560ArtFasFac = localUtil.ctond( httpContext.cgiGet( "Z8560ArtFasFac")) ;
            A8560ArtFasFac = localUtil.ctond( httpContext.cgiGet( "Z8560ArtFasFac")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_71 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_71"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV42EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV16CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17ArtCod = httpContext.cgiGet( "vARTCOD") ;
            AV43ProCod = httpContext.cgiGet( "vPROCOD") ;
            AV44FasCod = httpContext.cgiGet( "vFASCOD") ;
            A8560ArtFasFac = localUtil.ctond( httpContext.cgiGet( "ARTFASFAC")) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A1668ParFasVal = httpContext.cgiGet( "PARFASVAL") ;
            AV24Modif = httpContext.cgiGet( "vMODIF") ;
            AV31Msg_err = httpContext.cgiGet( "vMSG_ERR") ;
            AV30Flagr = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13220ParOrden = (short)(localUtil.ctol( httpContext.cgiGet( "PARORDEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1665ParFasDsc = httpContext.cgiGet( "PARFASDSC") ;
            n1665ParFasDsc = false ;
            A13203ParUndID = (short)(localUtil.ctol( httpContext.cgiGet( "PARUNDID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_parfascod_Objectcall = httpContext.cgiGet( "COMBO_PARFASCOD_Objectcall") ;
            Combo_parfascod_Class = httpContext.cgiGet( "COMBO_PARFASCOD_Class") ;
            Combo_parfascod_Icontype = httpContext.cgiGet( "COMBO_PARFASCOD_Icontype") ;
            Combo_parfascod_Icon = httpContext.cgiGet( "COMBO_PARFASCOD_Icon") ;
            Combo_parfascod_Caption = httpContext.cgiGet( "COMBO_PARFASCOD_Caption") ;
            Combo_parfascod_Tooltip = httpContext.cgiGet( "COMBO_PARFASCOD_Tooltip") ;
            Combo_parfascod_Cls = httpContext.cgiGet( "COMBO_PARFASCOD_Cls") ;
            Combo_parfascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PARFASCOD_Selectedvalue_set") ;
            Combo_parfascod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PARFASCOD_Selectedvalue_get") ;
            Combo_parfascod_Selectedtext_set = httpContext.cgiGet( "COMBO_PARFASCOD_Selectedtext_set") ;
            Combo_parfascod_Selectedtext_get = httpContext.cgiGet( "COMBO_PARFASCOD_Selectedtext_get") ;
            Combo_parfascod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PARFASCOD_Gamoauthtoken") ;
            Combo_parfascod_Ddointernalname = httpContext.cgiGet( "COMBO_PARFASCOD_Ddointernalname") ;
            Combo_parfascod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PARFASCOD_Titlecontrolalign") ;
            Combo_parfascod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PARFASCOD_Dropdownoptionstype") ;
            Combo_parfascod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Enabled")) ;
            Combo_parfascod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Visible")) ;
            Combo_parfascod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PARFASCOD_Titlecontrolidtoreplace") ;
            Combo_parfascod_Datalisttype = httpContext.cgiGet( "COMBO_PARFASCOD_Datalisttype") ;
            Combo_parfascod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Allowmultipleselection")) ;
            Combo_parfascod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PARFASCOD_Datalistfixedvalues") ;
            Combo_parfascod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Isgriditem")) ;
            Combo_parfascod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Hasdescription")) ;
            Combo_parfascod_Datalistproc = httpContext.cgiGet( "COMBO_PARFASCOD_Datalistproc") ;
            Combo_parfascod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PARFASCOD_Datalistprocparametersprefix") ;
            Combo_parfascod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PARFASCOD_Remoteservicesparameters") ;
            Combo_parfascod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PARFASCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_parfascod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Includeonlyselectedoption")) ;
            Combo_parfascod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Includeselectalloption")) ;
            Combo_parfascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Emptyitem")) ;
            Combo_parfascod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Includeaddnewoption")) ;
            Combo_parfascod_Htmltemplate = httpContext.cgiGet( "COMBO_PARFASCOD_Htmltemplate") ;
            Combo_parfascod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PARFASCOD_Multiplevaluestype") ;
            Combo_parfascod_Loadingdata = httpContext.cgiGet( "COMBO_PARFASCOD_Loadingdata") ;
            Combo_parfascod_Noresultsfound = httpContext.cgiGet( "COMBO_PARFASCOD_Noresultsfound") ;
            Combo_parfascod_Emptyitemtext = httpContext.cgiGet( "COMBO_PARFASCOD_Emptyitemtext") ;
            Combo_parfascod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PARFASCOD_Onlyselectedvalues") ;
            Combo_parfascod_Selectalltext = httpContext.cgiGet( "COMBO_PARFASCOD_Selectalltext") ;
            Combo_parfascod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PARFASCOD_Multiplevaluesseparator") ;
            Combo_parfascod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PARFASCOD_Addnewoptiontext") ;
            Gridlevel_level1_titlescategories_Objectcall = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Objectcall") ;
            Gridlevel_level1_titlescategories_Class = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Class") ;
            Gridlevel_level1_titlescategories_Enabled = GXutil.strtobool( httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Enabled")) ;
            Gridlevel_level1_titlescategories_Gridinternalname = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridinternalname") ;
            Gridlevel_level1_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridtitlescategories") ;
            Gridlevel_level1_titlescategories_Visible = GXutil.strtobool( httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Visible")) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252CliCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
            n69ArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
            AV51Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TSERPA2Copy1");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("ArtFasFac", localUtil.format( A8560ArtFasFac, "ZZ9.99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tserpa2copy1:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A457FasCod = httpContext.GetPar( "FasCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
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
                  sMode476 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode476 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound476 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1PF0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "CLICOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCliCod_Internalname ;
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
                        e111PF2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121PF2 ();
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
         e121PF2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1PF476( ) ;
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
         disableAttributes1PF476( ) ;
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

   public void confirm_1PF0( )
   {
      beforeValidate1PF476( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1PF476( ) ;
         }
         else
         {
            checkExtendedTable1PF476( ) ;
            closeExtendedTableCursors1PF476( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode476 = Gx_mode ;
         confirm_1PF477( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode476 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode476 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1PF477( )
   {
      nGXsfl_71_idx = 0 ;
      while ( nGXsfl_71_idx < nRC_GXsfl_71 )
      {
         readRow1PF477( ) ;
         if ( ( nRcdExists_477 != 0 ) || ( nIsMod_477 != 0 ) )
         {
            getKey1PF477( ) ;
            if ( ( nRcdExists_477 == 0 ) && ( nRcdDeleted_477 == 0 ) )
            {
               if ( RcdFound477 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1PF477( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1PF477( ) ;
                     closeExtendedTableCursors1PF477( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PARFASCOD_" + sGXsfl_71_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtParFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound477 != 0 )
               {
                  if ( nRcdDeleted_477 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1PF477( ) ;
                     load1PF477( ) ;
                     beforeValidate1PF477( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1PF477( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_477 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1PF477( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1PF477( ) ;
                           closeExtendedTableCursors1PF477( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_477 == 0 )
                  {
                     GXCCtl = "PARFASCOD_" + sGXsfl_71_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtParFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtParFasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParFasVl2_Internalname, GXutil.rtrim( A12670ParFasVl2)) ;
         httpContext.changePostValue( edtParUndDsc_Internalname, GXutil.rtrim( A13204ParUndDsc)) ;
         httpContext.changePostValue( edtParFasVmn_Internalname, GXutil.rtrim( A14061ParFasVmn)) ;
         httpContext.changePostValue( edtParFasVmx_Internalname, GXutil.rtrim( A14060ParFasVmx)) ;
         httpContext.changePostValue( edtParFasObs_Internalname, GXutil.rtrim( A1673ParFasObs)) ;
         httpContext.changePostValue( edtParNVar_Internalname, GXutil.ltrim( localUtil.ntoc( A10584ParNVar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParTit_Internalname, GXutil.rtrim( A10585ParTit)) ;
         httpContext.changePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_71_idx, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1668ParFasVal_"+sGXsfl_71_idx, GXutil.rtrim( Z1668ParFasVal)) ;
         httpContext.changePostValue( "ZT_"+"Z1673ParFasObs_"+sGXsfl_71_idx, GXutil.rtrim( Z1673ParFasObs)) ;
         httpContext.changePostValue( "ZT_"+"Z12670ParFasVl2_"+sGXsfl_71_idx, GXutil.rtrim( Z12670ParFasVl2)) ;
         httpContext.changePostValue( "ZT_"+"Z13220ParOrden_"+sGXsfl_71_idx, GXutil.ltrim( localUtil.ntoc( Z13220ParOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14060ParFasVmx_"+sGXsfl_71_idx, GXutil.rtrim( Z14060ParFasVmx)) ;
         httpContext.changePostValue( "ZT_"+"Z14061ParFasVmn_"+sGXsfl_71_idx, GXutil.rtrim( Z14061ParFasVmn)) ;
         httpContext.changePostValue( "T1673ParFasObs_"+sGXsfl_71_idx, GXutil.rtrim( O1673ParFasObs)) ;
         httpContext.changePostValue( "T1668ParFasVal_"+sGXsfl_71_idx, GXutil.rtrim( O1668ParFasVal)) ;
         httpContext.changePostValue( "T1664ParFasCod_"+sGXsfl_71_idx, GXutil.ltrim( localUtil.ntoc( O1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_477_"+sGXsfl_71_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_477, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_477_"+sGXsfl_71_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_477, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_477_"+sGXsfl_71_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_477, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_477 != 0 )
         {
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_71_idx+"Horizontalalignment", GXutil.rtrim( edtParFasCod_Horizontalalignment)) ;
            httpContext.changePostValue( "PARFASVL2_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVl2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARUNDDSC_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASVMN_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVmn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASVMX_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASOBS_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARNVAR_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParNVar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARTIT_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParTit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1PF0( )
   {
   }

   public void e111PF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tserpa2copy1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Station", AV13Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      tserpa2copy1_impl.this.A396EmprCod = GXv_char2[0] ;
      tserpa2copy1_impl.this.AV7EmprNom = GXv_char3[0] ;
      tserpa2copy1_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprNom", AV7EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV32jpf ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JPF", ""), GXv_int6) ;
      tserpa2copy1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV32jpf = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32jpf", GXutil.str( AV32jpf, 1, 0));
      GXt_char1 = AV13Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tserpa2copy1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV13Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Station", AV13Station);
      GXv_char4[0] = AV42EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char4, GXv_char3, GXv_char2) ;
      tserpa2copy1_impl.this.AV42EmprCod = GXv_char4[0] ;
      tserpa2copy1_impl.this.AV7EmprNom = GXv_char3[0] ;
      tserpa2copy1_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42EmprCod", AV42EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprNom", AV7EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext7[0] = AV45WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV45WWPContext = GXv_SdtWWPContext7[0] ;
      Combo_parfascod_Titlecontrolidtoreplace = edtParFasCod_Internalname ;
      ucCombo_parfascod.sendProperty(context, "", false, Combo_parfascod_Internalname, "TitleControlIdToReplace", Combo_parfascod_Titlecontrolidtoreplace);
      edtParFasCod_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Horizontalalignment", edtParFasCod_Horizontalalignment, !bGXsfl_71_Refreshing);
      /* Execute user subroutine: 'LOADCOMBOPARFASCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(12);
         pr_default.close(11);
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
      AV46TrnContext.fromxml(AV47WebSession.getValue("TrnContext"), null, null);
      Gridlevel_level1_titlescategories_Gridinternalname = subGridlevel_level1_Internalname ;
      ucGridlevel_level1_titlescategories.sendProperty(context, "", false, Gridlevel_level1_titlescategories_Internalname, "GridInternalName", Gridlevel_level1_titlescategories_Gridinternalname);
   }

   public void e121PF2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV46TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tserpa2copy1ww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(12);
      pr_default.close(11);
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

   public void S112( )
   {
      /* 'LOADCOMBOPARFASCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV48ParFasCod_Data ;
      GXv_char4[0] = AV49ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.tserpa2copy1loaddvcombo(remoteHandle, context).execute( "ParFasCod", Gx_mode, AV42EmprCod, AV16CliCod, AV17ArtCod, AV43ProCod, AV44FasCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tserpa2copy1_impl.this.AV49ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV48ParFasCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   }

   public void zm1PF476( int GX_JID )
   {
      if ( ( GX_JID == 20 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8560ArtFasFac = T01PF7_A8560ArtFasFac[0] ;
         }
         else
         {
            Z8560ArtFasFac = A8560ArtFasFac ;
         }
      }
      if ( GX_JID == -20 )
      {
         Z8560ArtFasFac = A8560ArtFasFac ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z457FasCod = A457FasCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z69ArtDsc = A69ArtDsc ;
         Z759ProDsc = A759ProDsc ;
         Z460FasDsc = A460FasDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV51Pgmname = "TSERPA2Copy1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV42EmprCod)==0) )
      {
         A396EmprCod = AV42EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01PF8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01PF8_A407EmprNom[0] ;
      n407EmprNom = T01PF8_n407EmprNom[0] ;
      pr_default.close(6);
      if ( ! (0==AV16CliCod) )
      {
         A252CliCod = AV16CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( ! (0==AV16CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV16CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV17ArtCod)==0) )
      {
         A65ArtCod = AV17ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      if ( ! (GXutil.strcmp("", AV17ArtCod)==0) )
      {
         edtArtCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      }
      else
      {
         edtArtCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV17ArtCod)==0) )
      {
         edtArtCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV43ProCod)==0) )
      {
         A758ProCod = AV43ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      if ( ! (GXutil.strcmp("", AV43ProCod)==0) )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      else
      {
         edtProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV43ProCod)==0) )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV44FasCod)==0) )
      {
         A457FasCod = AV44FasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      }
      if ( ! (GXutil.strcmp("", AV44FasCod)==0) )
      {
         edtFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      }
      else
      {
         edtFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV44FasCod)==0) )
      {
         edtFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite eliminar en este nivel", ""), 1, "");
         AnyError = (short)(1) ;
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
         /* Using cursor T01PF9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01PF9_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(7);
         /* Using cursor T01PF10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         A69ArtDsc = T01PF10_A69ArtDsc[0] ;
         n69ArtDsc = T01PF10_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         pr_default.close(8);
         /* Using cursor T01PF11 */
         pr_default.execute(9, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T01PF11_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         pr_default.close(9);
         /* Using cursor T01PF13 */
         pr_default.execute(11, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01PF13_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         pr_default.close(11);
      }
   }

   public void load1PF476( )
   {
      /* Using cursor T01PF15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound476 = (short)(1) ;
         A407EmprNom = T01PF15_A407EmprNom[0] ;
         n407EmprNom = T01PF15_n407EmprNom[0] ;
         A279CliNom = T01PF15_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A69ArtDsc = T01PF15_A69ArtDsc[0] ;
         n69ArtDsc = T01PF15_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A759ProDsc = T01PF15_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A460FasDsc = T01PF15_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A8560ArtFasFac = T01PF15_A8560ArtFasFac[0] ;
         zm1PF476( -20) ;
      }
      pr_default.close(13);
      onLoadActions1PF476( ) ;
   }

   public void onLoadActions1PF476( )
   {
   }

   public void checkExtendedTable1PF476( )
   {
      nIsDirty_476 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01PF9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01PF9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(7);
      /* Using cursor T01PF10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01PF10_A69ArtDsc[0] ;
      n69ArtDsc = T01PF10_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(8);
      /* Using cursor T01PF11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01PF11_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(9);
      /* Using cursor T01PF12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(10);
      /* Using cursor T01PF13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01PF13_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      pr_default.close(11);
      /* Using cursor T01PF14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A457FasCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PREFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(12);
   }

   public void closeExtendedTableCursors1PF476( )
   {
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
      pr_default.close(11);
      pr_default.close(12);
   }

   public void enableDisable( )
   {
   }

   public void gxload_22( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01PF16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01PF16_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_23( String A396EmprCod ,
                          int A252CliCod ,
                          String A65ArtCod )
   {
      /* Using cursor T01PF17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01PF17_A69ArtDsc[0] ;
      n69ArtDsc = T01PF17_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A69ArtDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_24( String A396EmprCod ,
                          String A758ProCod )
   {
      /* Using cursor T01PF18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01PF18_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A759ProDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_25( String A396EmprCod ,
                          int A252CliCod ,
                          String A65ArtCod ,
                          String A758ProCod )
   {
      /* Using cursor T01PF19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_26( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T01PF20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01PF20_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_27( String A396EmprCod ,
                          int A252CliCod ,
                          String A457FasCod )
   {
      /* Using cursor T01PF21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A457FasCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PREFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
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

   public void getKey1PF476( )
   {
      /* Using cursor T01PF22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound476 = (short)(1) ;
      }
      else
      {
         RcdFound476 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01PF7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01PF7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1PF476( 20) ;
         RcdFound476 = (short)(1) ;
         A8560ArtFasFac = T01PF7_A8560ArtFasFac[0] ;
         A252CliCod = T01PF7_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01PF7_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = T01PF7_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A457FasCod = T01PF7_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z457FasCod = A457FasCod ;
         sMode476 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1PF476( ) ;
         if ( AnyError == 1 )
         {
            RcdFound476 = (short)(0) ;
            initializeNonKey1PF476( ) ;
         }
         Gx_mode = sMode476 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound476 = (short)(0) ;
         initializeNonKey1PF476( ) ;
         sMode476 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode476 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1PF476( ) ;
      if ( RcdFound476 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound476 = (short)(0) ;
      /* Using cursor T01PF23 */
      pr_default.execute(21, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A758ProCod, A758ProCod, A65ArtCod, Integer.valueOf(A252CliCod), A457FasCod, A396EmprCod});
      if ( (pr_default.getStatus(21) != 101) )
      {
         while ( (pr_default.getStatus(21) != 101) && ( ( T01PF23_A252CliCod[0] < A252CliCod ) || ( T01PF23_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PF23_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01PF23_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01PF23_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PF23_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01PF23_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01PF23_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01PF23_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PF23_A457FasCod[0], A457FasCod) < 0 ) ) && ( GXutil.strcmp(T01PF23_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(21);
         }
         if ( (pr_default.getStatus(21) != 101) && ( ( T01PF23_A252CliCod[0] > A252CliCod ) || ( T01PF23_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PF23_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01PF23_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01PF23_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PF23_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01PF23_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01PF23_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01PF23_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PF23_A457FasCod[0], A457FasCod) > 0 ) ) && ( GXutil.strcmp(T01PF23_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01PF23_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01PF23_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A758ProCod = T01PF23_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A457FasCod = T01PF23_A457FasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            RcdFound476 = (short)(1) ;
         }
      }
      pr_default.close(21);
   }

   public void move_previous( )
   {
      RcdFound476 = (short)(0) ;
      /* Using cursor T01PF24 */
      pr_default.execute(22, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A65ArtCod, Integer.valueOf(A252CliCod), A758ProCod, A758ProCod, A65ArtCod, Integer.valueOf(A252CliCod), A457FasCod, A396EmprCod});
      if ( (pr_default.getStatus(22) != 101) )
      {
         while ( (pr_default.getStatus(22) != 101) && ( ( T01PF24_A252CliCod[0] > A252CliCod ) || ( T01PF24_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PF24_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01PF24_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01PF24_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PF24_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01PF24_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01PF24_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01PF24_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PF24_A457FasCod[0], A457FasCod) > 0 ) ) && ( GXutil.strcmp(T01PF24_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(22);
         }
         if ( (pr_default.getStatus(22) != 101) && ( ( T01PF24_A252CliCod[0] < A252CliCod ) || ( T01PF24_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PF24_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01PF24_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01PF24_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PF24_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01PF24_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01PF24_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01PF24_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01PF24_A457FasCod[0], A457FasCod) < 0 ) ) && ( GXutil.strcmp(T01PF24_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01PF24_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01PF24_A65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A758ProCod = T01PF24_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A457FasCod = T01PF24_A457FasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            RcdFound476 = (short)(1) ;
         }
      }
      pr_default.close(22);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1PF476( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1PF476( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound476 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = Z65ArtCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A758ProCod = Z758ProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A457FasCod = Z457FasCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1PF476( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1PF476( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CLICOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1PF476( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = Z65ArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = Z758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A457FasCod = Z457FasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1PF476( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PF6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPSERPAU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( DecimalUtil.compareTo(Z8560ArtFasFac, T01PF6_A8560ArtFasFac[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z8560ArtFasFac, T01PF6_A8560ArtFasFac[0]) != 0 )
            {
               GXutil.writeLogln("tserpa2copy1:[seudo value changed for attri]"+"ArtFasFac");
               GXutil.writeLogRaw("Old: ",Z8560ArtFasFac);
               GXutil.writeLogRaw("Current: ",T01PF6_A8560ArtFasFac[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPSERPAU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PF476( )
   {
      beforeValidate1PF476( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PF476( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PF476( 0) ;
         checkOptimisticConcurrency1PF476( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PF476( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PF476( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PF25 */
                  pr_default.execute(23, new Object[] {A8560ArtFasFac, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
                  if ( (pr_default.getStatus(23) == 1) )
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
                        processLevel1PF476( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1PF0( ) ;
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
            load1PF476( ) ;
         }
         endLevel1PF476( ) ;
      }
      closeExtendedTableCursors1PF476( ) ;
   }

   public void update1PF476( )
   {
      beforeValidate1PF476( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PF476( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PF476( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PF476( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1PF476( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PF26 */
                  pr_default.execute(24, new Object[] {A8560ArtFasFac, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
                  if ( (pr_default.getStatus(24) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPSERPAU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1PF476( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1PF476( ) ;
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
         endLevel1PF476( ) ;
      }
      closeExtendedTableCursors1PF476( ) ;
   }

   public void deferredUpdate1PF476( )
   {
   }

   public void delete( )
   {
      beforeValidate1PF476( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PF476( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PF476( ) ;
         afterConfirm1PF476( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PF476( ) ;
            if ( AnyError == 0 )
            {
               scanStart1PF477( ) ;
               while ( RcdFound477 != 0 )
               {
                  getByPrimaryKey1PF477( ) ;
                  delete1PF477( ) ;
                  scanNext1PF477( ) ;
               }
               scanEnd1PF477( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PF27 */
                  pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
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
      sMode476 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PF476( ) ;
      Gx_mode = sMode476 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PF476( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01PF28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01PF28_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(26);
         /* Using cursor T01PF29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         A69ArtDsc = T01PF29_A69ArtDsc[0] ;
         n69ArtDsc = T01PF29_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         pr_default.close(27);
         /* Using cursor T01PF30 */
         pr_default.execute(28, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T01PF30_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         pr_default.close(28);
         /* Using cursor T01PF31 */
         pr_default.execute(29, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01PF31_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         pr_default.close(29);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01PF32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ArtFor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
      }
   }

   public void processNestedLevel1PF477( )
   {
      nGXsfl_71_idx = 0 ;
      while ( nGXsfl_71_idx < nRC_GXsfl_71 )
      {
         readRow1PF477( ) ;
         if ( ( nRcdExists_477 != 0 ) || ( nIsMod_477 != 0 ) )
         {
            standaloneNotModal1PF477( ) ;
            getKey1PF477( ) ;
            if ( ( nRcdExists_477 == 0 ) && ( nRcdDeleted_477 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1PF477( ) ;
            }
            else
            {
               if ( RcdFound477 != 0 )
               {
                  if ( ( nRcdDeleted_477 != 0 ) && ( nRcdExists_477 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1PF477( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_477 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1PF477( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_477 == 0 )
                  {
                     GXCCtl = "PARFASCOD_" + sGXsfl_71_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtParFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtParFasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParFasVl2_Internalname, GXutil.rtrim( A12670ParFasVl2)) ;
         httpContext.changePostValue( edtParUndDsc_Internalname, GXutil.rtrim( A13204ParUndDsc)) ;
         httpContext.changePostValue( edtParFasVmn_Internalname, GXutil.rtrim( A14061ParFasVmn)) ;
         httpContext.changePostValue( edtParFasVmx_Internalname, GXutil.rtrim( A14060ParFasVmx)) ;
         httpContext.changePostValue( edtParFasObs_Internalname, GXutil.rtrim( A1673ParFasObs)) ;
         httpContext.changePostValue( edtParNVar_Internalname, GXutil.ltrim( localUtil.ntoc( A10584ParNVar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParTit_Internalname, GXutil.rtrim( A10585ParTit)) ;
         httpContext.changePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_71_idx, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1668ParFasVal_"+sGXsfl_71_idx, GXutil.rtrim( Z1668ParFasVal)) ;
         httpContext.changePostValue( "ZT_"+"Z1673ParFasObs_"+sGXsfl_71_idx, GXutil.rtrim( Z1673ParFasObs)) ;
         httpContext.changePostValue( "ZT_"+"Z12670ParFasVl2_"+sGXsfl_71_idx, GXutil.rtrim( Z12670ParFasVl2)) ;
         httpContext.changePostValue( "ZT_"+"Z13220ParOrden_"+sGXsfl_71_idx, GXutil.ltrim( localUtil.ntoc( Z13220ParOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14060ParFasVmx_"+sGXsfl_71_idx, GXutil.rtrim( Z14060ParFasVmx)) ;
         httpContext.changePostValue( "ZT_"+"Z14061ParFasVmn_"+sGXsfl_71_idx, GXutil.rtrim( Z14061ParFasVmn)) ;
         httpContext.changePostValue( "T1673ParFasObs_"+sGXsfl_71_idx, GXutil.rtrim( O1673ParFasObs)) ;
         httpContext.changePostValue( "T1668ParFasVal_"+sGXsfl_71_idx, GXutil.rtrim( O1668ParFasVal)) ;
         httpContext.changePostValue( "T1664ParFasCod_"+sGXsfl_71_idx, GXutil.ltrim( localUtil.ntoc( O1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_477_"+sGXsfl_71_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_477, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_477_"+sGXsfl_71_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_477, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_477_"+sGXsfl_71_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_477, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_477 != 0 )
         {
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_71_idx+"Horizontalalignment", GXutil.rtrim( edtParFasCod_Horizontalalignment)) ;
            httpContext.changePostValue( "PARFASVL2_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVl2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARUNDDSC_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASVMN_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVmn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASVMX_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASOBS_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARNVAR_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParNVar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARTIT_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParTit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1PF477( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_477 = (short)(0) ;
      nIsMod_477 = (short)(0) ;
      nRcdDeleted_477 = (short)(0) ;
   }

   public void processLevel1PF476( )
   {
      /* Save parent mode. */
      sMode476 = Gx_mode ;
      processNestedLevel1PF477( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode476 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1PF476( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1PF476( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tserpa2copy1");
         if ( AnyError == 0 )
         {
            confirmValues1PF0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tserpa2copy1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1PF476( )
   {
      /* Scan By routine */
      /* Using cursor T01PF33 */
      pr_default.execute(31, new Object[] {A396EmprCod});
      RcdFound476 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound476 = (short)(1) ;
         A252CliCod = T01PF33_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01PF33_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = T01PF33_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A457FasCod = T01PF33_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PF476( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound476 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound476 = (short)(1) ;
         A252CliCod = T01PF33_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01PF33_A65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = T01PF33_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A457FasCod = T01PF33_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      }
   }

   public void scanEnd1PF476( )
   {
      pr_default.close(31);
   }

   public void afterConfirm1PF476( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1PF476( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PF476( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PF476( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PF476( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PF476( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PF476( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1PF477( int GX_JID )
   {
      if ( ( GX_JID == 28 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1668ParFasVal = T01PF3_A1668ParFasVal[0] ;
            Z1673ParFasObs = T01PF3_A1673ParFasObs[0] ;
            Z12670ParFasVl2 = T01PF3_A12670ParFasVl2[0] ;
            Z13220ParOrden = T01PF3_A13220ParOrden[0] ;
            Z14060ParFasVmx = T01PF3_A14060ParFasVmx[0] ;
            Z14061ParFasVmn = T01PF3_A14061ParFasVmn[0] ;
         }
         else
         {
            Z1668ParFasVal = A1668ParFasVal ;
            Z1673ParFasObs = A1673ParFasObs ;
            Z12670ParFasVl2 = A12670ParFasVl2 ;
            Z13220ParOrden = A13220ParOrden ;
            Z14060ParFasVmx = A14060ParFasVmx ;
            Z14061ParFasVmn = A14061ParFasVmn ;
         }
      }
      if ( GX_JID == -28 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z1668ParFasVal = A1668ParFasVal ;
         Z1673ParFasObs = A1673ParFasObs ;
         Z12670ParFasVl2 = A12670ParFasVl2 ;
         Z13220ParOrden = A13220ParOrden ;
         Z14060ParFasVmx = A14060ParFasVmx ;
         Z14061ParFasVmn = A14061ParFasVmn ;
         Z396EmprCod = A396EmprCod ;
         Z1664ParFasCod = A1664ParFasCod ;
         Z457FasCod = A457FasCod ;
         Z1665ParFasDsc = A1665ParFasDsc ;
         Z10584ParNVar = A10584ParNVar ;
         Z10585ParTit = A10585ParTit ;
         Z13203ParUndID = A13203ParUndID ;
         Z13204ParUndDsc = A13204ParUndDsc ;
      }
   }

   public void standaloneNotModal1PF477( )
   {
   }

   public void standaloneModal1PF477( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         AV24Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24Modif", AV24Modif);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtParFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      }
      else
      {
         edtParFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      }
   }

   public void load1PF477( )
   {
      /* Using cursor T01PF34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound477 = (short)(1) ;
         A1665ParFasDsc = T01PF34_A1665ParFasDsc[0] ;
         n1665ParFasDsc = T01PF34_n1665ParFasDsc[0] ;
         A1668ParFasVal = T01PF34_A1668ParFasVal[0] ;
         A1673ParFasObs = T01PF34_A1673ParFasObs[0] ;
         A10584ParNVar = T01PF34_A10584ParNVar[0] ;
         n10584ParNVar = T01PF34_n10584ParNVar[0] ;
         A10585ParTit = T01PF34_A10585ParTit[0] ;
         n10585ParTit = T01PF34_n10585ParTit[0] ;
         A12670ParFasVl2 = T01PF34_A12670ParFasVl2[0] ;
         A13204ParUndDsc = T01PF34_A13204ParUndDsc[0] ;
         n13204ParUndDsc = T01PF34_n13204ParUndDsc[0] ;
         A13220ParOrden = T01PF34_A13220ParOrden[0] ;
         A14060ParFasVmx = T01PF34_A14060ParFasVmx[0] ;
         A14061ParFasVmn = T01PF34_A14061ParFasVmn[0] ;
         A13203ParUndID = T01PF34_A13203ParUndID[0] ;
         n13203ParUndID = T01PF34_n13203ParUndID[0] ;
         zm1PF477( -28) ;
      }
      pr_default.close(32);
      onLoadActions1PF477( ) ;
   }

   public void onLoadActions1PF477( )
   {
   }

   public void checkExtendedTable1PF477( )
   {
      nIsDirty_477 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1PF477( ) ;
      /* Using cursor T01PF4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_71_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1665ParFasDsc = T01PF4_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T01PF4_n1665ParFasDsc[0] ;
      A10584ParNVar = T01PF4_A10584ParNVar[0] ;
      n10584ParNVar = T01PF4_n10584ParNVar[0] ;
      A10585ParTit = T01PF4_A10585ParTit[0] ;
      n10585ParTit = T01PF4_n10585ParTit[0] ;
      A13203ParUndID = T01PF4_A13203ParUndID[0] ;
      n13203ParUndID = T01PF4_n13203ParUndID[0] ;
      pr_default.close(2);
      /* Using cursor T01PF5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13203ParUndID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIDADES PARAMETROS FASES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARUNDID");
            AnyError = (short)(1) ;
         }
      }
      A13204ParUndDsc = T01PF5_A13204ParUndDsc[0] ;
      n13204ParUndDsc = T01PF5_n13204ParUndDsc[0] ;
      pr_default.close(3);
      if ( true /* After */ && ( A1664ParFasCod > 0 ) && ( A10584ParNVar > 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A252CliCod ;
         GXv_char3[0] = A65ArtCod ;
         GXv_char2[0] = A758ProCod ;
         GXv_char11[0] = A457FasCod ;
         GXv_int12[0] = A1664ParFasCod ;
         GXv_int13[0] = A10584ParNVar ;
         GXv_int6[0] = AV30Flagr ;
         GXv_char14[0] = AV31Msg_err ;
         new app.pserpar3(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3, GXv_char2, GXv_char11, GXv_int12, GXv_int13, GXv_int6, GXv_char14) ;
         tserpa2copy1_impl.this.A396EmprCod = GXv_char4[0] ;
         tserpa2copy1_impl.this.A252CliCod = GXv_int10[0] ;
         tserpa2copy1_impl.this.A65ArtCod = GXv_char3[0] ;
         tserpa2copy1_impl.this.A758ProCod = GXv_char2[0] ;
         tserpa2copy1_impl.this.A457FasCod = GXv_char11[0] ;
         tserpa2copy1_impl.this.A1664ParFasCod = GXv_int12[0] ;
         tserpa2copy1_impl.this.A10584ParNVar = GXv_int13[0] ;
         tserpa2copy1_impl.this.AV30Flagr = GXv_int6[0] ;
         tserpa2copy1_impl.this.AV31Msg_err = GXv_char14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV30Flagr", GXutil.str( AV30Flagr, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31Msg_err", AV31Msg_err);
      }
      if ( ( AV30Flagr == 1 ) && true /* After */ && ( A1664ParFasCod > 0 ) && ( A10584ParNVar > 0 ) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_71_idx ;
         httpContext.GX_msglist.addItem(AV31Msg_err, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1PF477( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1PF477( )
   {
   }

   public void gxload_29( String A396EmprCod ,
                          short A1664ParFasCod )
   {
      /* Using cursor T01PF35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(33) == 101) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_71_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1665ParFasDsc = T01PF35_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T01PF35_n1665ParFasDsc[0] ;
      A10584ParNVar = T01PF35_A10584ParNVar[0] ;
      n10584ParNVar = T01PF35_n10584ParNVar[0] ;
      A10585ParTit = T01PF35_A10585ParTit[0] ;
      n10585ParTit = T01PF35_n10585ParTit[0] ;
      A13203ParUndID = T01PF35_A13203ParUndID[0] ;
      n13203ParUndID = T01PF35_n13203ParUndID[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1665ParFasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10584ParNVar, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10585ParTit))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13203ParUndID, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(33) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(33);
   }

   public void gxload_30( String A396EmprCod ,
                          short A13203ParUndID )
   {
      /* Using cursor T01PF36 */
      pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
      if ( (pr_default.getStatus(34) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13203ParUndID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIDADES PARAMETROS FASES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARUNDID");
            AnyError = (short)(1) ;
         }
      }
      A13204ParUndDsc = T01PF36_A13204ParUndDsc[0] ;
      n13204ParUndDsc = T01PF36_n13204ParUndDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13204ParUndDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(34) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(34);
   }

   public void getKey1PF477( )
   {
      /* Using cursor T01PF37 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound477 = (short)(1) ;
      }
      else
      {
         RcdFound477 = (short)(0) ;
      }
      pr_default.close(35);
   }

   public void getByPrimaryKey1PF477( )
   {
      /* Using cursor T01PF3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01PF3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1PF477( 28) ;
         RcdFound477 = (short)(1) ;
         initializeNonKey1PF477( ) ;
         A1668ParFasVal = T01PF3_A1668ParFasVal[0] ;
         A1673ParFasObs = T01PF3_A1673ParFasObs[0] ;
         A12670ParFasVl2 = T01PF3_A12670ParFasVl2[0] ;
         A13220ParOrden = T01PF3_A13220ParOrden[0] ;
         A14060ParFasVmx = T01PF3_A14060ParFasVmx[0] ;
         A14061ParFasVmn = T01PF3_A14061ParFasVmn[0] ;
         A1664ParFasCod = T01PF3_A1664ParFasCod[0] ;
         O1673ParFasObs = A1673ParFasObs ;
         O1668ParFasVal = A1668ParFasVal ;
         httpContext.ajax_rsp_assign_attri("", false, "A1668ParFasVal", A1668ParFasVal);
         O1664ParFasCod = A1664ParFasCod ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z457FasCod = A457FasCod ;
         Z1664ParFasCod = A1664ParFasCod ;
         sMode477 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1PF477( ) ;
         Gx_mode = sMode477 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound477 = (short)(0) ;
         initializeNonKey1PF477( ) ;
         sMode477 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1PF477( ) ;
         Gx_mode = sMode477 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1PF477( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1PF477( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PF2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPSERPAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z1668ParFasVal, T01PF2_A1668ParFasVal[0]) != 0 ) || ( GXutil.strcmp(Z1673ParFasObs, T01PF2_A1673ParFasObs[0]) != 0 ) || ( GXutil.strcmp(Z12670ParFasVl2, T01PF2_A12670ParFasVl2[0]) != 0 ) || ( Z13220ParOrden != T01PF2_A13220ParOrden[0] ) || ( GXutil.strcmp(Z14060ParFasVmx, T01PF2_A14060ParFasVmx[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14061ParFasVmn, T01PF2_A14061ParFasVmn[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z1668ParFasVal, T01PF2_A1668ParFasVal[0]) != 0 )
            {
               GXutil.writeLogln("tserpa2copy1:[seudo value changed for attri]"+"ParFasVal");
               GXutil.writeLogRaw("Old: ",Z1668ParFasVal);
               GXutil.writeLogRaw("Current: ",T01PF2_A1668ParFasVal[0]);
            }
            if ( GXutil.strcmp(Z1673ParFasObs, T01PF2_A1673ParFasObs[0]) != 0 )
            {
               GXutil.writeLogln("tserpa2copy1:[seudo value changed for attri]"+"ParFasObs");
               GXutil.writeLogRaw("Old: ",Z1673ParFasObs);
               GXutil.writeLogRaw("Current: ",T01PF2_A1673ParFasObs[0]);
            }
            if ( GXutil.strcmp(Z12670ParFasVl2, T01PF2_A12670ParFasVl2[0]) != 0 )
            {
               GXutil.writeLogln("tserpa2copy1:[seudo value changed for attri]"+"ParFasVl2");
               GXutil.writeLogRaw("Old: ",Z12670ParFasVl2);
               GXutil.writeLogRaw("Current: ",T01PF2_A12670ParFasVl2[0]);
            }
            if ( Z13220ParOrden != T01PF2_A13220ParOrden[0] )
            {
               GXutil.writeLogln("tserpa2copy1:[seudo value changed for attri]"+"ParOrden");
               GXutil.writeLogRaw("Old: ",Z13220ParOrden);
               GXutil.writeLogRaw("Current: ",T01PF2_A13220ParOrden[0]);
            }
            if ( GXutil.strcmp(Z14060ParFasVmx, T01PF2_A14060ParFasVmx[0]) != 0 )
            {
               GXutil.writeLogln("tserpa2copy1:[seudo value changed for attri]"+"ParFasVmx");
               GXutil.writeLogRaw("Old: ",Z14060ParFasVmx);
               GXutil.writeLogRaw("Current: ",T01PF2_A14060ParFasVmx[0]);
            }
            if ( GXutil.strcmp(Z14061ParFasVmn, T01PF2_A14061ParFasVmn[0]) != 0 )
            {
               GXutil.writeLogln("tserpa2copy1:[seudo value changed for attri]"+"ParFasVmn");
               GXutil.writeLogRaw("Old: ",Z14061ParFasVmn);
               GXutil.writeLogRaw("Current: ",T01PF2_A14061ParFasVmn[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPSERPAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PF477( )
   {
      beforeValidate1PF477( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PF477( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PF477( 0) ;
         checkOptimisticConcurrency1PF477( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PF477( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PF477( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PF38 */
                  pr_default.execute(36, new Object[] {Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A1668ParFasVal, A1673ParFasObs, A12670ParFasVl2, Short.valueOf(A13220ParOrden), A14060ParFasVmx, A14061ParFasVmn, A396EmprCod, Short.valueOf(A1664ParFasCod), A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAR");
                  if ( (pr_default.getStatus(36) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( ( ( ( A1664ParFasCod != O1664ParFasCod ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                     {
                        AV24Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV24Modif", AV24Modif);
                     }
                     else
                     {
                        if ( ( ( ( ( GXutil.strcmp(A1668ParFasVal, O1668ParFasVal) != 0 ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                        {
                           AV24Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV24Modif", AV24Modif);
                        }
                        else
                        {
                           if ( ( ( ( ( GXutil.strcmp(A1673ParFasObs, O1673ParFasObs) != 0 ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                           {
                              AV24Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV24Modif", AV24Modif);
                           }
                        }
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
            load1PF477( ) ;
         }
         endLevel1PF477( ) ;
      }
      closeExtendedTableCursors1PF477( ) ;
   }

   public void update1PF477( )
   {
      beforeValidate1PF477( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PF477( ) ;
      }
      if ( ( nIsMod_477 != 0 ) || ( nIsDirty_477 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1PF477( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1PF477( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1PF477( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01PF39 */
                     pr_default.execute(37, new Object[] {A1668ParFasVal, A1673ParFasObs, A12670ParFasVl2, Short.valueOf(A13220ParOrden), A14060ParFasVmx, A14061ParFasVmn, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A1664ParFasCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAR");
                     if ( (pr_default.getStatus(37) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPSERPAR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1PF477( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( ( ( ( A1664ParFasCod != O1664ParFasCod ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                        {
                           AV24Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV24Modif", AV24Modif);
                        }
                        else
                        {
                           if ( ( ( ( ( GXutil.strcmp(A1668ParFasVal, O1668ParFasVal) != 0 ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                           {
                              AV24Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV24Modif", AV24Modif);
                           }
                           else
                           {
                              if ( ( ( ( ( GXutil.strcmp(A1673ParFasObs, O1673ParFasObs) != 0 ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                              {
                                 AV24Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                                 httpContext.ajax_rsp_assign_attri("", false, "AV24Modif", AV24Modif);
                              }
                           }
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1PF477( ) ;
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
            endLevel1PF477( ) ;
         }
      }
      closeExtendedTableCursors1PF477( ) ;
   }

   public void deferredUpdate1PF477( )
   {
   }

   public void delete1PF477( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1PF477( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PF477( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PF477( ) ;
         afterConfirm1PF477( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PF477( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01PF40 */
               pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A1664ParFasCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAR");
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
      sMode477 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PF477( ) ;
      Gx_mode = sMode477 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PF477( )
   {
      standaloneModal1PF477( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01PF41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
         A1665ParFasDsc = T01PF41_A1665ParFasDsc[0] ;
         n1665ParFasDsc = T01PF41_n1665ParFasDsc[0] ;
         A10584ParNVar = T01PF41_A10584ParNVar[0] ;
         n10584ParNVar = T01PF41_n10584ParNVar[0] ;
         A10585ParTit = T01PF41_A10585ParTit[0] ;
         n10585ParTit = T01PF41_n10585ParTit[0] ;
         A13203ParUndID = T01PF41_A13203ParUndID[0] ;
         n13203ParUndID = T01PF41_n13203ParUndID[0] ;
         pr_default.close(39);
         /* Using cursor T01PF42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
         A13204ParUndDsc = T01PF42_A13204ParUndDsc[0] ;
         n13204ParUndDsc = T01PF42_n13204ParUndDsc[0] ;
         pr_default.close(40);
      }
   }

   public void endLevel1PF477( )
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

   public void scanStart1PF477( )
   {
      /* Scan By routine */
      /* Using cursor T01PF43 */
      pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
      RcdFound477 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound477 = (short)(1) ;
         A1664ParFasCod = T01PF43_A1664ParFasCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PF477( )
   {
      /* Scan next routine */
      pr_default.readNext(41);
      RcdFound477 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound477 = (short)(1) ;
         A1664ParFasCod = T01PF43_A1664ParFasCod[0] ;
      }
   }

   public void scanEnd1PF477( )
   {
      pr_default.close(41);
   }

   public void afterConfirm1PF477( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1PF477( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PF477( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PF477( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PF477( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PF477( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PF477( )
   {
      edtParFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtParFasVl2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasVl2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasVl2_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtParUndDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParUndDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParUndDsc_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtParFasVmn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasVmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasVmn_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtParFasVmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasVmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasVmx_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtParFasObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasObs_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtParNVar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParNVar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParNVar_Enabled), 5, 0), !bGXsfl_71_Refreshing);
      edtParTit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParTit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParTit_Enabled), 5, 0), !bGXsfl_71_Refreshing);
   }

   public void send_integrity_lvl_hashes1PF477( )
   {
   }

   public void send_integrity_lvl_hashes1PF476( )
   {
   }

   public void subsflControlProps_71477( )
   {
      edtParFasCod_Internalname = "PARFASCOD_"+sGXsfl_71_idx ;
      edtParFasVl2_Internalname = "PARFASVL2_"+sGXsfl_71_idx ;
      edtParUndDsc_Internalname = "PARUNDDSC_"+sGXsfl_71_idx ;
      edtParFasVmn_Internalname = "PARFASVMN_"+sGXsfl_71_idx ;
      edtParFasVmx_Internalname = "PARFASVMX_"+sGXsfl_71_idx ;
      edtParFasObs_Internalname = "PARFASOBS_"+sGXsfl_71_idx ;
      edtParNVar_Internalname = "PARNVAR_"+sGXsfl_71_idx ;
      edtParTit_Internalname = "PARTIT_"+sGXsfl_71_idx ;
   }

   public void subsflControlProps_fel_71477( )
   {
      edtParFasCod_Internalname = "PARFASCOD_"+sGXsfl_71_fel_idx ;
      edtParFasVl2_Internalname = "PARFASVL2_"+sGXsfl_71_fel_idx ;
      edtParUndDsc_Internalname = "PARUNDDSC_"+sGXsfl_71_fel_idx ;
      edtParFasVmn_Internalname = "PARFASVMN_"+sGXsfl_71_fel_idx ;
      edtParFasVmx_Internalname = "PARFASVMX_"+sGXsfl_71_fel_idx ;
      edtParFasObs_Internalname = "PARFASOBS_"+sGXsfl_71_fel_idx ;
      edtParNVar_Internalname = "PARNVAR_"+sGXsfl_71_fel_idx ;
      edtParTit_Internalname = "PARTIT_"+sGXsfl_71_fel_idx ;
   }

   public void addRow1PF477( )
   {
      nGXsfl_71_idx = (int)(nGXsfl_71_idx+1) ;
      sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_71477( ) ;
      sendRow1PF477( ) ;
   }

   public void sendRow1PF477( )
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
         if ( ((int)((nGXsfl_71_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_477_" + sGXsfl_71_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_71_idx + "',71)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1664ParFasCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParFasCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtParFasCod_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_477_" + sGXsfl_71_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_71_idx + "',71)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasVl2_Internalname,GXutil.rtrim( A12670ParFasVl2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasVl2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParFasVl2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParUndDsc_Internalname,GXutil.rtrim( A13204ParUndDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParUndDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParUndDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_477_" + sGXsfl_71_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_71_idx + "',71)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasVmn_Internalname,GXutil.rtrim( A14061ParFasVmn),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasVmn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParFasVmn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_477_" + sGXsfl_71_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_71_idx + "',71)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasVmx_Internalname,GXutil.rtrim( A14060ParFasVmx),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasVmx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParFasVmx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_477_" + sGXsfl_71_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_71_idx + "',71)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasObs_Internalname,GXutil.rtrim( A1673ParFasObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn AttributeWidth100Porc AttributeWidth100Porc","",Integer.valueOf(-1),Integer.valueOf(edtParFasObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParNVar_Internalname,GXutil.ltrim( localUtil.ntoc( A10584ParNVar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtParNVar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10584ParNVar), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10584ParNVar), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParNVar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParNVar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParTit_Internalname,GXutil.rtrim( A10585ParTit),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParTit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParTit_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1PF477( ) ;
      GXCCtl = "Z1664ParFasCod_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1668ParFasVal_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1668ParFasVal));
      GXCCtl = "Z1673ParFasObs_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1673ParFasObs));
      GXCCtl = "Z12670ParFasVl2_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12670ParFasVl2));
      GXCCtl = "Z13220ParOrden_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13220ParOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14060ParFasVmx_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14060ParFasVmx));
      GXCCtl = "Z14061ParFasVmn_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14061ParFasVmn));
      GXCCtl = "O1673ParFasObs_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O1673ParFasObs));
      GXCCtl = "O1668ParFasVal_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O1668ParFasVal));
      GXCCtl = "O1664ParFasCod_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_477_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_477, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_477_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_477, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_477_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_477, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_71_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV46TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV46TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV42EmprCod));
      GXCCtl = "vCLICOD_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV16CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vARTCOD_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV17ArtCod));
      GXCCtl = "vPROCOD_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV43ProCod));
      GXCCtl = "vFASCOD_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV44FasCod));
      GXCCtl = "EMPRCOD_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "MODIF_" + sGXsfl_71_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV24Modif));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASCOD_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASCOD_"+sGXsfl_71_idx+"Horizontalalignment", GXutil.rtrim( edtParFasCod_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASVL2_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVl2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARUNDDSC_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASVMN_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVmn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASVMX_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVmx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASOBS_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARNVAR_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParNVar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARTIT_"+sGXsfl_71_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParTit_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1PF477( )
   {
      nGXsfl_71_idx = (int)(nGXsfl_71_idx+1) ;
      sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_71477( ) ;
      edtParFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASCOD_"+sGXsfl_71_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFasCod_Horizontalalignment = httpContext.cgiGet( "PARFASCOD_"+sGXsfl_71_idx+"Horizontalalignment") ;
      edtParFasVl2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASVL2_"+sGXsfl_71_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParUndDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARUNDDSC_"+sGXsfl_71_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFasVmn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASVMN_"+sGXsfl_71_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFasVmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASVMX_"+sGXsfl_71_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFasObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASOBS_"+sGXsfl_71_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParNVar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARNVAR_"+sGXsfl_71_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParTit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARTIT_"+sGXsfl_71_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_71_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         wbErr = true ;
         A1664ParFasCod = (short)(0) ;
      }
      else
      {
         A1664ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A12670ParFasVl2 = httpContext.cgiGet( edtParFasVl2_Internalname) ;
      A13204ParUndDsc = httpContext.cgiGet( edtParUndDsc_Internalname) ;
      n13204ParUndDsc = false ;
      A14061ParFasVmn = httpContext.cgiGet( edtParFasVmn_Internalname) ;
      A14060ParFasVmx = httpContext.cgiGet( edtParFasVmx_Internalname) ;
      A1673ParFasObs = httpContext.cgiGet( edtParFasObs_Internalname) ;
      A10584ParNVar = (short)(localUtil.ctol( httpContext.cgiGet( edtParNVar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n10584ParNVar = false ;
      A10585ParTit = httpContext.cgiGet( edtParTit_Internalname) ;
      n10585ParTit = false ;
      GXCCtl = "Z1664ParFasCod_" + sGXsfl_71_idx ;
      Z1664ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1668ParFasVal_" + sGXsfl_71_idx ;
      Z1668ParFasVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1673ParFasObs_" + sGXsfl_71_idx ;
      Z1673ParFasObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12670ParFasVl2_" + sGXsfl_71_idx ;
      Z12670ParFasVl2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13220ParOrden_" + sGXsfl_71_idx ;
      Z13220ParOrden = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14060ParFasVmx_" + sGXsfl_71_idx ;
      Z14060ParFasVmx = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14061ParFasVmn_" + sGXsfl_71_idx ;
      Z14061ParFasVmn = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1668ParFasVal_" + sGXsfl_71_idx ;
      A1668ParFasVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13220ParOrden_" + sGXsfl_71_idx ;
      A13220ParOrden = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O1673ParFasObs_" + sGXsfl_71_idx ;
      O1673ParFasObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O1668ParFasVal_" + sGXsfl_71_idx ;
      O1668ParFasVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O1664ParFasCod_" + sGXsfl_71_idx ;
      O1664ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_477_" + sGXsfl_71_idx ;
      nRcdDeleted_477 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_477_" + sGXsfl_71_idx ;
      nRcdExists_477 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_477_" + sGXsfl_71_idx ;
      nIsMod_477 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "MODIF_" + sGXsfl_71_idx ;
      AV24Modif = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtParFasCod_Enabled = edtParFasCod_Enabled ;
   }

   public void confirmValues1PF0( )
   {
      nGXsfl_71_idx = 0 ;
      sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_71477( ) ;
      while ( nGXsfl_71_idx < nRC_GXsfl_71 )
      {
         nGXsfl_71_idx = (int)(nGXsfl_71_idx+1) ;
         sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_71477( ) ;
         httpContext.changePostValue( "Z1664ParFasCod_"+sGXsfl_71_idx, httpContext.cgiGet( "ZT_"+"Z1664ParFasCod_"+sGXsfl_71_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_71_idx) ;
         httpContext.changePostValue( "Z1668ParFasVal_"+sGXsfl_71_idx, httpContext.cgiGet( "ZT_"+"Z1668ParFasVal_"+sGXsfl_71_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1668ParFasVal_"+sGXsfl_71_idx) ;
         httpContext.changePostValue( "Z1673ParFasObs_"+sGXsfl_71_idx, httpContext.cgiGet( "ZT_"+"Z1673ParFasObs_"+sGXsfl_71_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1673ParFasObs_"+sGXsfl_71_idx) ;
         httpContext.changePostValue( "Z12670ParFasVl2_"+sGXsfl_71_idx, httpContext.cgiGet( "ZT_"+"Z12670ParFasVl2_"+sGXsfl_71_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12670ParFasVl2_"+sGXsfl_71_idx) ;
         httpContext.changePostValue( "Z13220ParOrden_"+sGXsfl_71_idx, httpContext.cgiGet( "ZT_"+"Z13220ParOrden_"+sGXsfl_71_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13220ParOrden_"+sGXsfl_71_idx) ;
         httpContext.changePostValue( "Z14060ParFasVmx_"+sGXsfl_71_idx, httpContext.cgiGet( "ZT_"+"Z14060ParFasVmx_"+sGXsfl_71_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14060ParFasVmx_"+sGXsfl_71_idx) ;
         httpContext.changePostValue( "Z14061ParFasVmn_"+sGXsfl_71_idx, httpContext.cgiGet( "ZT_"+"Z14061ParFasVmn_"+sGXsfl_71_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14061ParFasVmn_"+sGXsfl_71_idx) ;
      }
      httpContext.changePostValue( "O1673ParFasObs", httpContext.cgiGet( "T1673ParFasObs")) ;
      httpContext.deletePostValue( "T1673ParFasObs") ;
      httpContext.changePostValue( "O1668ParFasVal", httpContext.cgiGet( "T1668ParFasVal")) ;
      httpContext.deletePostValue( "T1668ParFasVal") ;
      httpContext.changePostValue( "O1664ParFasCod", httpContext.cgiGet( "T1664ParFasCod")) ;
      httpContext.deletePostValue( "T1664ParFasCod") ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tserpa2copy1", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV42EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV16CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV17ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV43ProCod)),GXutil.URLEncode(GXutil.rtrim(AV44FasCod))}, new String[] {"Gx_mode","EmprCod","CliCod","ArtCod","ProCod","FasCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TSERPA2Copy1");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("ArtFasFac", localUtil.format( A8560ArtFasFac, "ZZ9.99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tserpa2copy1:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8560ArtFasFac", GXutil.ltrim( localUtil.ntoc( Z8560ArtFasFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_71", GXutil.ltrim( localUtil.ntoc( nGXsfl_71_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARFASCOD_DATA", AV48ParFasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARFASCOD_DATA", AV48ParFasCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV46TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV46TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV46TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV42EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV16CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD", GXutil.rtrim( AV17ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17ArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV43ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCOD", GXutil.rtrim( AV44FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTFASFAC", GXutil.ltrim( localUtil.ntoc( A8560ArtFasFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASVAL", GXutil.rtrim( A1668ParFasVal));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODIF", GXutil.rtrim( AV24Modif));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_ERR", GXutil.rtrim( AV31Msg_err));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGR", GXutil.ltrim( localUtil.ntoc( AV30Flagr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARORDEN", GXutil.ltrim( localUtil.ntoc( A13220ParOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASDSC", GXutil.rtrim( A1665ParFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "PARUNDID", GXutil.ltrim( localUtil.ntoc( A13203ParUndID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Objectcall", GXutil.rtrim( Combo_parfascod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Cls", GXutil.rtrim( Combo_parfascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Enabled", GXutil.booltostr( Combo_parfascod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_parfascod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Isgriditem", GXutil.booltostr( Combo_parfascod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Emptyitem", GXutil.booltostr( Combo_parfascod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Objectcall", GXutil.rtrim( Gridlevel_level1_titlescategories_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Enabled", GXutil.booltostr( Gridlevel_level1_titlescategories_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Gridlevel_level1_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Gridlevel_level1_titlescategories_Gridtitlescategories));
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
      return formatLink("app.tserpa2copy1", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV42EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV16CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV17ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV43ProCod)),GXutil.URLEncode(GXutil.rtrim(AV44FasCod))}, new String[] {"Gx_mode","EmprCod","CliCod","ArtCod","ProCod","FasCod"})  ;
   }

   public String getPgmname( )
   {
      return "TSERPA2Copy1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Parametros Fases", "") ;
   }

   public void initializeNonKey1PF476( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      A759ProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A8560ArtFasFac = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8560ArtFasFac", GXutil.ltrimstr( A8560ArtFasFac, 6, 2));
      Z8560ArtFasFac = DecimalUtil.ZERO ;
   }

   public void initAll1PF476( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      initializeNonKey1PF476( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1PF477( )
   {
      AV24Modif = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Modif", AV24Modif);
      AV31Msg_err = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Msg_err", AV31Msg_err);
      AV30Flagr = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Flagr", GXutil.str( AV30Flagr, 1, 0));
      A1665ParFasDsc = "" ;
      n1665ParFasDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1665ParFasDsc", A1665ParFasDsc);
      A1668ParFasVal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1668ParFasVal", A1668ParFasVal);
      A1673ParFasObs = "" ;
      A10584ParNVar = (short)(0) ;
      n10584ParNVar = false ;
      A10585ParTit = "" ;
      n10585ParTit = false ;
      A12670ParFasVl2 = "" ;
      A13203ParUndID = (short)(0) ;
      n13203ParUndID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13203ParUndID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13203ParUndID), 4, 0));
      A13204ParUndDsc = "" ;
      n13204ParUndDsc = false ;
      A13220ParOrden = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13220ParOrden", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13220ParOrden), 4, 0));
      A14060ParFasVmx = "" ;
      A14061ParFasVmn = "" ;
      O1673ParFasObs = A1673ParFasObs ;
      O1668ParFasVal = A1668ParFasVal ;
      httpContext.ajax_rsp_assign_attri("", false, "A1668ParFasVal", A1668ParFasVal);
      Z1668ParFasVal = "" ;
      Z1673ParFasObs = "" ;
      Z12670ParFasVl2 = "" ;
      Z13220ParOrden = (short)(0) ;
      Z14060ParFasVmx = "" ;
      Z14061ParFasVmn = "" ;
   }

   public void initAll1PF477( )
   {
      A1664ParFasCod = (short)(0) ;
      initializeNonKey1PF477( ) ;
   }

   public void standaloneModalInsert1PF477( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211675375", true, true);
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
      httpContext.AddJavascriptSource("tserpa2copy1.js", "?20268211675376", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties477( )
   {
      edtParFasCod_Enabled = defedtParFasCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_71_Refreshing);
   }

   public void startgridcontrol71( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtParFasCod_Horizontalalignment));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A12670ParFasVl2));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVl2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13204ParUndDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A14061ParFasVmn));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVmn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A14060ParFasVmx));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVmx_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A1673ParFasObs));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10584ParNVar, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParNVar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A10585ParTit));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParTit_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtArtCod_Internalname = "ARTCOD" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtParFasCod_Internalname = "PARFASCOD" ;
      edtParFasVl2_Internalname = "PARFASVL2" ;
      edtParUndDsc_Internalname = "PARUNDDSC" ;
      edtParFasVmn_Internalname = "PARFASVMN" ;
      edtParFasVmx_Internalname = "PARFASVMX" ;
      edtParFasObs_Internalname = "PARFASOBS" ;
      edtParNVar_Internalname = "PARNVAR" ;
      edtParTit_Internalname = "PARTIT" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_parfascod_Internalname = "COMBO_PARFASCOD" ;
      Gridlevel_level1_titlescategories_Internalname = "GRIDLEVEL_LEVEL1_TITLESCATEGORIES" ;
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
      Combo_parfascod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Parametros Fases", "") );
      edtParTit_Jsonclick = "" ;
      edtParNVar_Jsonclick = "" ;
      edtParFasObs_Jsonclick = "" ;
      edtParFasVmx_Jsonclick = "" ;
      edtParFasVmn_Jsonclick = "" ;
      edtParUndDsc_Jsonclick = "" ;
      edtParFasVl2_Jsonclick = "" ;
      edtParFasCod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_parfascod_Titlecontrolidtoreplace = "" ;
      edtParTit_Enabled = 0 ;
      edtParNVar_Enabled = 0 ;
      edtParFasObs_Enabled = 1 ;
      edtParFasVmx_Enabled = 1 ;
      edtParFasVmn_Enabled = 1 ;
      edtParUndDsc_Enabled = 0 ;
      edtParFasVl2_Enabled = 1 ;
      edtParFasCod_Enabled = 1 ;
      Gridlevel_level1_titlescategories_Gridtitlescategories = ";;;;Valor;Valor;;;" ;
      Combo_parfascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_parfascod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_parfascod_Cls = "ExtendedCombo" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Enabled = 1 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Enabled = 1 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Enabled = 0 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      edtParFasCod_Horizontalalignment = "right" ;
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

   public void xc_18_1PF477( String A396EmprCod ,
                             int A252CliCod ,
                             String A65ArtCod ,
                             String A758ProCod ,
                             String A457FasCod ,
                             short A1664ParFasCod ,
                             short A10584ParNVar ,
                             byte AV30Flagr ,
                             String AV31Msg_err )
   {
      if ( true /* After */ && ( A1664ParFasCod > 0 ) && ( A10584ParNVar > 0 ) )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_int10[0] = A252CliCod ;
         GXv_char11[0] = A65ArtCod ;
         GXv_char4[0] = A758ProCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_int13[0] = A1664ParFasCod ;
         GXv_int12[0] = A10584ParNVar ;
         GXv_int6[0] = AV30Flagr ;
         GXv_char2[0] = AV31Msg_err ;
         new app.pserpar3(remoteHandle, context).execute( GXv_char14, GXv_int10, GXv_char11, GXv_char4, GXv_char3, GXv_int13, GXv_int12, GXv_int6, GXv_char2) ;
         A396EmprCod = GXv_char14[0] ;
         A252CliCod = GXv_int10[0] ;
         A65ArtCod = GXv_char11[0] ;
         A758ProCod = GXv_char4[0] ;
         A457FasCod = GXv_char3[0] ;
         A1664ParFasCod = GXv_int13[0] ;
         A10584ParNVar = GXv_int12[0] ;
         AV30Flagr = GXv_int6[0] ;
         AV31Msg_err = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV30Flagr", GXutil.str( AV30Flagr, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV31Msg_err", AV31Msg_err);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A65ArtCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A758ProCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A457FasCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10584ParNVar, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV30Flagr, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV31Msg_err))+"\"") ;
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
      subsflControlProps_71477( ) ;
      while ( nGXsfl_71_idx <= nRC_GXsfl_71 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1PF477( ) ;
         standaloneModal1PF477( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1PF477( ) ;
         nGXsfl_71_idx = (int)(nGXsfl_71_idx+1) ;
         sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_71477( ) ;
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

   public void valid_Clicod( )
   {
      /* Using cursor T01PF28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01PF28_A279CliNom[0] ;
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Artcod( )
   {
      n69ArtDsc = false ;
      /* Using cursor T01PF29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A69ArtDsc = T01PF29_A69ArtDsc[0] ;
      n69ArtDsc = T01PF29_n69ArtDsc[0] ;
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
   }

   public void valid_Procod( )
   {
      /* Using cursor T01PF30 */
      pr_default.execute(28, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      A759ProDsc = T01PF30_A759ProDsc[0] ;
      pr_default.close(28);
      /* Using cursor T01PF44 */
      pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
      if ( (pr_default.getStatus(42) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      pr_default.close(42);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
   }

   public void valid_Fascod( )
   {
      /* Using cursor T01PF31 */
      pr_default.execute(29, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T01PF31_A460FasDsc[0] ;
      pr_default.close(29);
      /* Using cursor T01PF45 */
      pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A457FasCod});
      if ( (pr_default.getStatus(43) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PREFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      pr_default.close(43);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
   }

   public void valid_Parfascod( )
   {
      n13203ParUndID = false ;
      n1665ParFasDsc = false ;
      n10584ParNVar = false ;
      n10585ParTit = false ;
      n13204ParUndDsc = false ;
      /* Using cursor T01PF41 */
      pr_default.execute(39, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(39) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARFASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
      }
      A1665ParFasDsc = T01PF41_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T01PF41_n1665ParFasDsc[0] ;
      A10584ParNVar = T01PF41_A10584ParNVar[0] ;
      n10584ParNVar = T01PF41_n10584ParNVar[0] ;
      A10585ParTit = T01PF41_A10585ParTit[0] ;
      n10585ParTit = T01PF41_n10585ParTit[0] ;
      A13203ParUndID = T01PF41_A13203ParUndID[0] ;
      n13203ParUndID = T01PF41_n13203ParUndID[0] ;
      pr_default.close(39);
      /* Using cursor T01PF42 */
      pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
      if ( (pr_default.getStatus(40) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13203ParUndID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIDADES PARAMETROS FASES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARUNDID");
            AnyError = (short)(1) ;
         }
      }
      A13204ParUndDsc = T01PF42_A13204ParUndDsc[0] ;
      n13204ParUndDsc = T01PF42_n13204ParUndDsc[0] ;
      pr_default.close(40);
      if ( true /* After */ && ( A1664ParFasCod > 0 ) && ( A10584ParNVar > 0 ) )
      {
         GXv_char14[0] = A396EmprCod ;
         GXv_int10[0] = A252CliCod ;
         GXv_char11[0] = A65ArtCod ;
         GXv_char4[0] = A758ProCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_int13[0] = A1664ParFasCod ;
         GXv_int12[0] = A10584ParNVar ;
         GXv_int6[0] = AV30Flagr ;
         GXv_char2[0] = AV31Msg_err ;
         new app.pserpar3(remoteHandle, context).execute( GXv_char14, GXv_int10, GXv_char11, GXv_char4, GXv_char3, GXv_int13, GXv_int12, GXv_int6, GXv_char2) ;
         tserpa2copy1_impl.this.A396EmprCod = GXv_char14[0] ;
         A396EmprCod = this.A396EmprCod ;
         tserpa2copy1_impl.this.A252CliCod = GXv_int10[0] ;
         A252CliCod = this.A252CliCod ;
         tserpa2copy1_impl.this.A65ArtCod = GXv_char11[0] ;
         A65ArtCod = this.A65ArtCod ;
         tserpa2copy1_impl.this.A758ProCod = GXv_char4[0] ;
         A758ProCod = this.A758ProCod ;
         tserpa2copy1_impl.this.A457FasCod = GXv_char3[0] ;
         A457FasCod = this.A457FasCod ;
         tserpa2copy1_impl.this.A1664ParFasCod = GXv_int13[0] ;
         A1664ParFasCod = this.A1664ParFasCod ;
         tserpa2copy1_impl.this.A10584ParNVar = GXv_int12[0] ;
         A10584ParNVar = this.A10584ParNVar ;
         tserpa2copy1_impl.this.AV30Flagr = GXv_int6[0] ;
         AV30Flagr = this.AV30Flagr ;
         tserpa2copy1_impl.this.AV31Msg_err = GXv_char2[0] ;
         AV31Msg_err = this.AV31Msg_err ;
      }
      if ( ( AV30Flagr == 1 ) && true /* After */ && ( A1664ParFasCod > 0 ) && ( A10584ParNVar > 0 ) )
      {
         httpContext.GX_msglist.addItem(AV31Msg_err, 1, "PARFASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1665ParFasDsc", GXutil.rtrim( A1665ParFasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A10585ParTit", GXutil.rtrim( A10585ParTit));
      httpContext.ajax_rsp_assign_attri("", false, "A13203ParUndID", GXutil.ltrim( localUtil.ntoc( A13203ParUndID, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13204ParUndDsc", GXutil.rtrim( A13204ParUndDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", GXutil.rtrim( A65ArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", GXutil.rtrim( A758ProCod));
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10584ParNVar", GXutil.ltrim( localUtil.ntoc( A10584ParNVar, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV30Flagr", GXutil.ltrim( localUtil.ntoc( AV30Flagr, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV31Msg_err", GXutil.rtrim( AV31Msg_err));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV42EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV17ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV43ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV44FasCod',fld:'vFASCOD',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV46TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV42EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV17ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV43ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV44FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A8560ArtFasFac',fld:'ARTFASFAC',pic:'ZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121PF2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV46TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A69ArtDsc',fld:'ARTDSC',pic:''}]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A460FasDsc',fld:'FASDSC',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''}]}");
      setEventMetadata("VALID_PARFASCOD","{handler:'valid_Parfascod',iparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1664ParFasCod',fld:'PARFASCOD',pic:'ZZZ9'},{av:'A13203ParUndID',fld:'PARUNDID',pic:'ZZZ9'},{av:'A1665ParFasDsc',fld:'PARFASDSC',pic:''},{av:'A10584ParNVar',fld:'PARNVAR',pic:'ZZZ9'},{av:'A10585ParTit',fld:'PARTIT',pic:''},{av:'A13204ParUndDsc',fld:'PARUNDDSC',pic:''},{av:'AV31Msg_err',fld:'vMSG_ERR',pic:''},{av:'AV30Flagr',fld:'vFLAGR',pic:'9'}]");
      setEventMetadata("VALID_PARFASCOD",",oparms:[{av:'A1665ParFasDsc',fld:'PARFASDSC',pic:''},{av:'A10585ParTit',fld:'PARTIT',pic:''},{av:'A13203ParUndID',fld:'PARUNDID',pic:'ZZZ9'},{av:'A13204ParUndDsc',fld:'PARUNDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A1664ParFasCod',fld:'PARFASCOD',pic:'ZZZ9'},{av:'A10584ParNVar',fld:'PARNVAR',pic:'ZZZ9'},{av:'AV30Flagr',fld:'vFLAGR',pic:'9'},{av:'AV31Msg_err',fld:'vMSG_ERR',pic:''}]}");
      setEventMetadata("VALID_PARFASOBS","{handler:'valid_Parfasobs',iparms:[]");
      setEventMetadata("VALID_PARFASOBS",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Partit',iparms:[]");
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
      pr_default.close(39);
      pr_default.close(40);
      pr_default.close(27);
      pr_default.close(42);
      pr_default.close(26);
      pr_default.close(29);
      pr_default.close(43);
      pr_default.close(28);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV42EmprCod = "" ;
      wcpOAV17ArtCod = "" ;
      wcpOAV43ProCod = "" ;
      wcpOAV44FasCod = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z758ProCod = "" ;
      Z457FasCod = "" ;
      Z8560ArtFasFac = DecimalUtil.ZERO ;
      Z1668ParFasVal = "" ;
      Z1673ParFasObs = "" ;
      Z12670ParFasVl2 = "" ;
      Z14060ParFasVmx = "" ;
      Z14061ParFasVmn = "" ;
      O1673ParFasObs = "" ;
      O1668ParFasVal = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      AV31Msg_err = "" ;
      Gx_mode = "" ;
      AV42EmprCod = "" ;
      AV17ArtCod = "" ;
      AV43ProCod = "" ;
      AV44FasCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A279CliNom = "" ;
      A69ArtDsc = "" ;
      A759ProDsc = "" ;
      A460FasDsc = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV51Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_parfascod = new com.genexus.webpanels.GXUserControl();
      Combo_parfascod_Caption = "" ;
      AV48ParFasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucGridlevel_level1_titlescategories = new com.genexus.webpanels.GXUserControl();
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode477 = "" ;
      sStyleString = "" ;
      A8560ArtFasFac = DecimalUtil.ZERO ;
      A407EmprNom = "" ;
      A1668ParFasVal = "" ;
      AV24Modif = "" ;
      A1665ParFasDsc = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_parfascod_Objectcall = "" ;
      Combo_parfascod_Class = "" ;
      Combo_parfascod_Icontype = "" ;
      Combo_parfascod_Icon = "" ;
      Combo_parfascod_Tooltip = "" ;
      Combo_parfascod_Selectedvalue_set = "" ;
      Combo_parfascod_Selectedvalue_get = "" ;
      Combo_parfascod_Selectedtext_set = "" ;
      Combo_parfascod_Selectedtext_get = "" ;
      Combo_parfascod_Gamoauthtoken = "" ;
      Combo_parfascod_Ddointernalname = "" ;
      Combo_parfascod_Titlecontrolalign = "" ;
      Combo_parfascod_Dropdownoptionstype = "" ;
      Combo_parfascod_Datalisttype = "" ;
      Combo_parfascod_Datalistfixedvalues = "" ;
      Combo_parfascod_Datalistproc = "" ;
      Combo_parfascod_Datalistprocparametersprefix = "" ;
      Combo_parfascod_Remoteservicesparameters = "" ;
      Combo_parfascod_Htmltemplate = "" ;
      Combo_parfascod_Multiplevaluestype = "" ;
      Combo_parfascod_Loadingdata = "" ;
      Combo_parfascod_Noresultsfound = "" ;
      Combo_parfascod_Emptyitemtext = "" ;
      Combo_parfascod_Onlyselectedvalues = "" ;
      Combo_parfascod_Selectalltext = "" ;
      Combo_parfascod_Multiplevaluesseparator = "" ;
      Combo_parfascod_Addnewoptiontext = "" ;
      Gridlevel_level1_titlescategories_Objectcall = "" ;
      Gridlevel_level1_titlescategories_Class = "" ;
      Gridlevel_level1_titlescategories_Gridinternalname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode476 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A12670ParFasVl2 = "" ;
      A13204ParUndDsc = "" ;
      A14061ParFasVmn = "" ;
      A14060ParFasVmx = "" ;
      A1673ParFasObs = "" ;
      A10585ParTit = "" ;
      T1673ParFasObs = "" ;
      T1668ParFasVal = "" ;
      AV13Station = "" ;
      AV7EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      AV45WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV46TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV47WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV49ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z69ArtDsc = "" ;
      Z759ProDsc = "" ;
      Z460FasDsc = "" ;
      T01PF8_A407EmprNom = new String[] {""} ;
      T01PF8_n407EmprNom = new boolean[] {false} ;
      T01PF9_A279CliNom = new String[] {""} ;
      T01PF10_A69ArtDsc = new String[] {""} ;
      T01PF10_n69ArtDsc = new boolean[] {false} ;
      T01PF11_A759ProDsc = new String[] {""} ;
      T01PF13_A460FasDsc = new String[] {""} ;
      T01PF15_A407EmprNom = new String[] {""} ;
      T01PF15_n407EmprNom = new boolean[] {false} ;
      T01PF15_A279CliNom = new String[] {""} ;
      T01PF15_A69ArtDsc = new String[] {""} ;
      T01PF15_n69ArtDsc = new boolean[] {false} ;
      T01PF15_A759ProDsc = new String[] {""} ;
      T01PF15_A460FasDsc = new String[] {""} ;
      T01PF15_A8560ArtFasFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PF15_A396EmprCod = new String[] {""} ;
      T01PF15_A252CliCod = new int[1] ;
      T01PF15_A65ArtCod = new String[] {""} ;
      T01PF15_A758ProCod = new String[] {""} ;
      T01PF15_A457FasCod = new String[] {""} ;
      T01PF12_A396EmprCod = new String[] {""} ;
      T01PF14_A396EmprCod = new String[] {""} ;
      T01PF16_A279CliNom = new String[] {""} ;
      T01PF17_A69ArtDsc = new String[] {""} ;
      T01PF17_n69ArtDsc = new boolean[] {false} ;
      T01PF18_A759ProDsc = new String[] {""} ;
      T01PF19_A396EmprCod = new String[] {""} ;
      T01PF20_A460FasDsc = new String[] {""} ;
      T01PF21_A396EmprCod = new String[] {""} ;
      T01PF22_A396EmprCod = new String[] {""} ;
      T01PF22_A252CliCod = new int[1] ;
      T01PF22_A65ArtCod = new String[] {""} ;
      T01PF22_A758ProCod = new String[] {""} ;
      T01PF22_A457FasCod = new String[] {""} ;
      T01PF7_A8560ArtFasFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PF7_A396EmprCod = new String[] {""} ;
      T01PF7_A252CliCod = new int[1] ;
      T01PF7_A65ArtCod = new String[] {""} ;
      T01PF7_A758ProCod = new String[] {""} ;
      T01PF7_A457FasCod = new String[] {""} ;
      T01PF23_A396EmprCod = new String[] {""} ;
      T01PF23_A252CliCod = new int[1] ;
      T01PF23_A65ArtCod = new String[] {""} ;
      T01PF23_A758ProCod = new String[] {""} ;
      T01PF23_A457FasCod = new String[] {""} ;
      T01PF24_A396EmprCod = new String[] {""} ;
      T01PF24_A252CliCod = new int[1] ;
      T01PF24_A65ArtCod = new String[] {""} ;
      T01PF24_A758ProCod = new String[] {""} ;
      T01PF24_A457FasCod = new String[] {""} ;
      T01PF6_A8560ArtFasFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PF6_A396EmprCod = new String[] {""} ;
      T01PF6_A252CliCod = new int[1] ;
      T01PF6_A65ArtCod = new String[] {""} ;
      T01PF6_A758ProCod = new String[] {""} ;
      T01PF6_A457FasCod = new String[] {""} ;
      T01PF28_A279CliNom = new String[] {""} ;
      T01PF29_A69ArtDsc = new String[] {""} ;
      T01PF29_n69ArtDsc = new boolean[] {false} ;
      T01PF30_A759ProDsc = new String[] {""} ;
      T01PF31_A460FasDsc = new String[] {""} ;
      T01PF32_A396EmprCod = new String[] {""} ;
      T01PF32_A252CliCod = new int[1] ;
      T01PF32_A65ArtCod = new String[] {""} ;
      T01PF32_A758ProCod = new String[] {""} ;
      T01PF32_A457FasCod = new String[] {""} ;
      T01PF32_A4897ArtProLin = new short[1] ;
      T01PF33_A396EmprCod = new String[] {""} ;
      T01PF33_A252CliCod = new int[1] ;
      T01PF33_A65ArtCod = new String[] {""} ;
      T01PF33_A758ProCod = new String[] {""} ;
      T01PF33_A457FasCod = new String[] {""} ;
      Z1665ParFasDsc = "" ;
      Z10585ParTit = "" ;
      Z13204ParUndDsc = "" ;
      T01PF34_A252CliCod = new int[1] ;
      T01PF34_A65ArtCod = new String[] {""} ;
      T01PF34_A758ProCod = new String[] {""} ;
      T01PF34_A1665ParFasDsc = new String[] {""} ;
      T01PF34_n1665ParFasDsc = new boolean[] {false} ;
      T01PF34_A1668ParFasVal = new String[] {""} ;
      T01PF34_A1673ParFasObs = new String[] {""} ;
      T01PF34_A10584ParNVar = new short[1] ;
      T01PF34_n10584ParNVar = new boolean[] {false} ;
      T01PF34_A10585ParTit = new String[] {""} ;
      T01PF34_n10585ParTit = new boolean[] {false} ;
      T01PF34_A12670ParFasVl2 = new String[] {""} ;
      T01PF34_A13204ParUndDsc = new String[] {""} ;
      T01PF34_n13204ParUndDsc = new boolean[] {false} ;
      T01PF34_A13220ParOrden = new short[1] ;
      T01PF34_A14060ParFasVmx = new String[] {""} ;
      T01PF34_A14061ParFasVmn = new String[] {""} ;
      T01PF34_A396EmprCod = new String[] {""} ;
      T01PF34_A1664ParFasCod = new short[1] ;
      T01PF34_A13203ParUndID = new short[1] ;
      T01PF34_n13203ParUndID = new boolean[] {false} ;
      T01PF34_A457FasCod = new String[] {""} ;
      T01PF4_A1665ParFasDsc = new String[] {""} ;
      T01PF4_n1665ParFasDsc = new boolean[] {false} ;
      T01PF4_A10584ParNVar = new short[1] ;
      T01PF4_n10584ParNVar = new boolean[] {false} ;
      T01PF4_A10585ParTit = new String[] {""} ;
      T01PF4_n10585ParTit = new boolean[] {false} ;
      T01PF4_A13203ParUndID = new short[1] ;
      T01PF4_n13203ParUndID = new boolean[] {false} ;
      T01PF5_A13204ParUndDsc = new String[] {""} ;
      T01PF5_n13204ParUndDsc = new boolean[] {false} ;
      T01PF35_A1665ParFasDsc = new String[] {""} ;
      T01PF35_n1665ParFasDsc = new boolean[] {false} ;
      T01PF35_A10584ParNVar = new short[1] ;
      T01PF35_n10584ParNVar = new boolean[] {false} ;
      T01PF35_A10585ParTit = new String[] {""} ;
      T01PF35_n10585ParTit = new boolean[] {false} ;
      T01PF35_A13203ParUndID = new short[1] ;
      T01PF35_n13203ParUndID = new boolean[] {false} ;
      T01PF36_A13204ParUndDsc = new String[] {""} ;
      T01PF36_n13204ParUndDsc = new boolean[] {false} ;
      T01PF37_A396EmprCod = new String[] {""} ;
      T01PF37_A252CliCod = new int[1] ;
      T01PF37_A65ArtCod = new String[] {""} ;
      T01PF37_A758ProCod = new String[] {""} ;
      T01PF37_A457FasCod = new String[] {""} ;
      T01PF37_A1664ParFasCod = new short[1] ;
      T01PF3_A252CliCod = new int[1] ;
      T01PF3_A65ArtCod = new String[] {""} ;
      T01PF3_A758ProCod = new String[] {""} ;
      T01PF3_A1668ParFasVal = new String[] {""} ;
      T01PF3_A1673ParFasObs = new String[] {""} ;
      T01PF3_A12670ParFasVl2 = new String[] {""} ;
      T01PF3_A13220ParOrden = new short[1] ;
      T01PF3_A14060ParFasVmx = new String[] {""} ;
      T01PF3_A14061ParFasVmn = new String[] {""} ;
      T01PF3_A396EmprCod = new String[] {""} ;
      T01PF3_A1664ParFasCod = new short[1] ;
      T01PF3_A457FasCod = new String[] {""} ;
      T01PF2_A252CliCod = new int[1] ;
      T01PF2_A65ArtCod = new String[] {""} ;
      T01PF2_A758ProCod = new String[] {""} ;
      T01PF2_A1668ParFasVal = new String[] {""} ;
      T01PF2_A1673ParFasObs = new String[] {""} ;
      T01PF2_A12670ParFasVl2 = new String[] {""} ;
      T01PF2_A13220ParOrden = new short[1] ;
      T01PF2_A14060ParFasVmx = new String[] {""} ;
      T01PF2_A14061ParFasVmn = new String[] {""} ;
      T01PF2_A396EmprCod = new String[] {""} ;
      T01PF2_A1664ParFasCod = new short[1] ;
      T01PF2_A457FasCod = new String[] {""} ;
      T01PF41_A1665ParFasDsc = new String[] {""} ;
      T01PF41_n1665ParFasDsc = new boolean[] {false} ;
      T01PF41_A10584ParNVar = new short[1] ;
      T01PF41_n10584ParNVar = new boolean[] {false} ;
      T01PF41_A10585ParTit = new String[] {""} ;
      T01PF41_n10585ParTit = new boolean[] {false} ;
      T01PF41_A13203ParUndID = new short[1] ;
      T01PF41_n13203ParUndID = new boolean[] {false} ;
      T01PF42_A13204ParUndDsc = new String[] {""} ;
      T01PF42_n13204ParUndDsc = new boolean[] {false} ;
      T01PF43_A396EmprCod = new String[] {""} ;
      T01PF43_A252CliCod = new int[1] ;
      T01PF43_A65ArtCod = new String[] {""} ;
      T01PF43_A758ProCod = new String[] {""} ;
      T01PF43_A457FasCod = new String[] {""} ;
      T01PF43_A1664ParFasCod = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      T01PF44_A396EmprCod = new String[] {""} ;
      T01PF45_A396EmprCod = new String[] {""} ;
      GXv_char14 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_char11 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int13 = new short[1] ;
      GXv_int12 = new short[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char2 = new String[1] ;
      ZV31Msg_err = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tserpa2copy1__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tserpa2copy1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tserpa2copy1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tserpa2copy1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tserpa2copy1__default(),
         new Object[] {
             new Object[] {
            T01PF2_A252CliCod, T01PF2_A65ArtCod, T01PF2_A758ProCod, T01PF2_A1668ParFasVal, T01PF2_A1673ParFasObs, T01PF2_A12670ParFasVl2, T01PF2_A13220ParOrden, T01PF2_A14060ParFasVmx, T01PF2_A14061ParFasVmn, T01PF2_A396EmprCod,
            T01PF2_A1664ParFasCod, T01PF2_A457FasCod
            }
            , new Object[] {
            T01PF3_A252CliCod, T01PF3_A65ArtCod, T01PF3_A758ProCod, T01PF3_A1668ParFasVal, T01PF3_A1673ParFasObs, T01PF3_A12670ParFasVl2, T01PF3_A13220ParOrden, T01PF3_A14060ParFasVmx, T01PF3_A14061ParFasVmn, T01PF3_A396EmprCod,
            T01PF3_A1664ParFasCod, T01PF3_A457FasCod
            }
            , new Object[] {
            T01PF4_A1665ParFasDsc, T01PF4_n1665ParFasDsc, T01PF4_A10584ParNVar, T01PF4_n10584ParNVar, T01PF4_A10585ParTit, T01PF4_n10585ParTit, T01PF4_A13203ParUndID, T01PF4_n13203ParUndID
            }
            , new Object[] {
            T01PF5_A13204ParUndDsc, T01PF5_n13204ParUndDsc
            }
            , new Object[] {
            T01PF6_A8560ArtFasFac, T01PF6_A396EmprCod, T01PF6_A252CliCod, T01PF6_A65ArtCod, T01PF6_A758ProCod, T01PF6_A457FasCod
            }
            , new Object[] {
            T01PF7_A8560ArtFasFac, T01PF7_A396EmprCod, T01PF7_A252CliCod, T01PF7_A65ArtCod, T01PF7_A758ProCod, T01PF7_A457FasCod
            }
            , new Object[] {
            T01PF8_A407EmprNom, T01PF8_n407EmprNom
            }
            , new Object[] {
            T01PF9_A279CliNom
            }
            , new Object[] {
            T01PF10_A69ArtDsc, T01PF10_n69ArtDsc
            }
            , new Object[] {
            T01PF11_A759ProDsc
            }
            , new Object[] {
            T01PF12_A396EmprCod
            }
            , new Object[] {
            T01PF13_A460FasDsc
            }
            , new Object[] {
            T01PF14_A396EmprCod
            }
            , new Object[] {
            T01PF15_A407EmprNom, T01PF15_n407EmprNom, T01PF15_A279CliNom, T01PF15_A69ArtDsc, T01PF15_n69ArtDsc, T01PF15_A759ProDsc, T01PF15_A460FasDsc, T01PF15_A8560ArtFasFac, T01PF15_A396EmprCod, T01PF15_A252CliCod,
            T01PF15_A65ArtCod, T01PF15_A758ProCod, T01PF15_A457FasCod
            }
            , new Object[] {
            T01PF16_A279CliNom
            }
            , new Object[] {
            T01PF17_A69ArtDsc, T01PF17_n69ArtDsc
            }
            , new Object[] {
            T01PF18_A759ProDsc
            }
            , new Object[] {
            T01PF19_A396EmprCod
            }
            , new Object[] {
            T01PF20_A460FasDsc
            }
            , new Object[] {
            T01PF21_A396EmprCod
            }
            , new Object[] {
            T01PF22_A396EmprCod, T01PF22_A252CliCod, T01PF22_A65ArtCod, T01PF22_A758ProCod, T01PF22_A457FasCod
            }
            , new Object[] {
            T01PF23_A396EmprCod, T01PF23_A252CliCod, T01PF23_A65ArtCod, T01PF23_A758ProCod, T01PF23_A457FasCod
            }
            , new Object[] {
            T01PF24_A396EmprCod, T01PF24_A252CliCod, T01PF24_A65ArtCod, T01PF24_A758ProCod, T01PF24_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PF28_A279CliNom
            }
            , new Object[] {
            T01PF29_A69ArtDsc, T01PF29_n69ArtDsc
            }
            , new Object[] {
            T01PF30_A759ProDsc
            }
            , new Object[] {
            T01PF31_A460FasDsc
            }
            , new Object[] {
            T01PF32_A396EmprCod, T01PF32_A252CliCod, T01PF32_A65ArtCod, T01PF32_A758ProCod, T01PF32_A457FasCod, T01PF32_A4897ArtProLin
            }
            , new Object[] {
            T01PF33_A396EmprCod, T01PF33_A252CliCod, T01PF33_A65ArtCod, T01PF33_A758ProCod, T01PF33_A457FasCod
            }
            , new Object[] {
            T01PF34_A252CliCod, T01PF34_A65ArtCod, T01PF34_A758ProCod, T01PF34_A1665ParFasDsc, T01PF34_n1665ParFasDsc, T01PF34_A1668ParFasVal, T01PF34_A1673ParFasObs, T01PF34_A10584ParNVar, T01PF34_n10584ParNVar, T01PF34_A10585ParTit,
            T01PF34_n10585ParTit, T01PF34_A12670ParFasVl2, T01PF34_A13204ParUndDsc, T01PF34_n13204ParUndDsc, T01PF34_A13220ParOrden, T01PF34_A14060ParFasVmx, T01PF34_A14061ParFasVmn, T01PF34_A396EmprCod, T01PF34_A1664ParFasCod, T01PF34_A13203ParUndID,
            T01PF34_n13203ParUndID, T01PF34_A457FasCod
            }
            , new Object[] {
            T01PF35_A1665ParFasDsc, T01PF35_n1665ParFasDsc, T01PF35_A10584ParNVar, T01PF35_n10584ParNVar, T01PF35_A10585ParTit, T01PF35_n10585ParTit, T01PF35_A13203ParUndID, T01PF35_n13203ParUndID
            }
            , new Object[] {
            T01PF36_A13204ParUndDsc, T01PF36_n13204ParUndDsc
            }
            , new Object[] {
            T01PF37_A396EmprCod, T01PF37_A252CliCod, T01PF37_A65ArtCod, T01PF37_A758ProCod, T01PF37_A457FasCod, T01PF37_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PF41_A1665ParFasDsc, T01PF41_n1665ParFasDsc, T01PF41_A10584ParNVar, T01PF41_n10584ParNVar, T01PF41_A10585ParTit, T01PF41_n10585ParTit, T01PF41_A13203ParUndID, T01PF41_n13203ParUndID
            }
            , new Object[] {
            T01PF42_A13204ParUndDsc, T01PF42_n13204ParUndDsc
            }
            , new Object[] {
            T01PF43_A396EmprCod, T01PF43_A252CliCod, T01PF43_A65ArtCod, T01PF43_A758ProCod, T01PF43_A457FasCod, T01PF43_A1664ParFasCod
            }
            , new Object[] {
            T01PF44_A396EmprCod
            }
            , new Object[] {
            T01PF45_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV51Pgmname = "TSERPA2Copy1" ;
   }

   private byte GxWebError ;
   private byte AV30Flagr ;
   private byte nKeyPressed ;
   private byte AV32jpf ;
   private byte GXt_int5 ;
   private byte Gx_BScreen ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte GXv_int6[] ;
   private byte ZV30Flagr ;
   private short Z1664ParFasCod ;
   private short Z13220ParOrden ;
   private short O1664ParFasCod ;
   private short nRcdDeleted_477 ;
   private short nRcdExists_477 ;
   private short nIsMod_477 ;
   private short A1664ParFasCod ;
   private short A10584ParNVar ;
   private short A13203ParUndID ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount477 ;
   private short RcdFound477 ;
   private short nBlankRcdUsr477 ;
   private short A13220ParOrden ;
   private short RcdFound476 ;
   private short T1664ParFasCod ;
   private short nIsDirty_476 ;
   private short Z10584ParNVar ;
   private short Z13203ParUndID ;
   private short nIsDirty_477 ;
   private short GXv_int13[] ;
   private short GXv_int12[] ;
   private int wcpOAV16CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_71 ;
   private int nGXsfl_71_idx=1 ;
   private int A252CliCod ;
   private int AV16CliCod ;
   private int trnEnded ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtArtCod_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtParFasCod_Enabled ;
   private int edtParFasVl2_Enabled ;
   private int edtParUndDsc_Enabled ;
   private int edtParFasVmn_Enabled ;
   private int edtParFasVmx_Enabled ;
   private int edtParFasObs_Enabled ;
   private int edtParNVar_Enabled ;
   private int edtParTit_Enabled ;
   private int fRowAdded ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_parfascod_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtParFasCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int GXv_int10[] ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z8560ArtFasFac ;
   private java.math.BigDecimal A8560ArtFasFac ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV42EmprCod ;
   private String wcpOAV17ArtCod ;
   private String wcpOAV43ProCod ;
   private String wcpOAV44FasCod ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z758ProCod ;
   private String Z457FasCod ;
   private String Z1668ParFasVal ;
   private String Z1673ParFasObs ;
   private String Z12670ParFasVl2 ;
   private String Z14060ParFasVmx ;
   private String Z14061ParFasVmn ;
   private String O1673ParFasObs ;
   private String O1668ParFasVal ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String AV31Msg_err ;
   private String Gx_mode ;
   private String AV42EmprCod ;
   private String AV17ArtCod ;
   private String AV43ProCod ;
   private String AV44FasCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_71_idx="0001" ;
   private String edtParFasCod_Horizontalalignment ;
   private String edtParFasCod_Internalname ;
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
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtFasCod_Internalname ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV51Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_parfascod_Caption ;
   private String Combo_parfascod_Cls ;
   private String Combo_parfascod_Internalname ;
   private String Gridlevel_level1_titlescategories_Gridtitlescategories ;
   private String Gridlevel_level1_titlescategories_Internalname ;
   private String sMode477 ;
   private String edtParFasVl2_Internalname ;
   private String edtParUndDsc_Internalname ;
   private String edtParFasVmn_Internalname ;
   private String edtParFasVmx_Internalname ;
   private String edtParFasObs_Internalname ;
   private String edtParNVar_Internalname ;
   private String edtParTit_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A407EmprNom ;
   private String A1668ParFasVal ;
   private String AV24Modif ;
   private String A1665ParFasDsc ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_parfascod_Objectcall ;
   private String Combo_parfascod_Class ;
   private String Combo_parfascod_Icontype ;
   private String Combo_parfascod_Icon ;
   private String Combo_parfascod_Tooltip ;
   private String Combo_parfascod_Selectedvalue_set ;
   private String Combo_parfascod_Selectedvalue_get ;
   private String Combo_parfascod_Selectedtext_set ;
   private String Combo_parfascod_Selectedtext_get ;
   private String Combo_parfascod_Gamoauthtoken ;
   private String Combo_parfascod_Ddointernalname ;
   private String Combo_parfascod_Titlecontrolalign ;
   private String Combo_parfascod_Dropdownoptionstype ;
   private String Combo_parfascod_Titlecontrolidtoreplace ;
   private String Combo_parfascod_Datalisttype ;
   private String Combo_parfascod_Datalistfixedvalues ;
   private String Combo_parfascod_Datalistproc ;
   private String Combo_parfascod_Datalistprocparametersprefix ;
   private String Combo_parfascod_Remoteservicesparameters ;
   private String Combo_parfascod_Htmltemplate ;
   private String Combo_parfascod_Multiplevaluestype ;
   private String Combo_parfascod_Loadingdata ;
   private String Combo_parfascod_Noresultsfound ;
   private String Combo_parfascod_Emptyitemtext ;
   private String Combo_parfascod_Onlyselectedvalues ;
   private String Combo_parfascod_Selectalltext ;
   private String Combo_parfascod_Multiplevaluesseparator ;
   private String Combo_parfascod_Addnewoptiontext ;
   private String Gridlevel_level1_titlescategories_Objectcall ;
   private String Gridlevel_level1_titlescategories_Class ;
   private String Gridlevel_level1_titlescategories_Gridinternalname ;
   private String hsh ;
   private String sMode476 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A12670ParFasVl2 ;
   private String A13204ParUndDsc ;
   private String A14061ParFasVmn ;
   private String A14060ParFasVmx ;
   private String A1673ParFasObs ;
   private String A10585ParTit ;
   private String T1673ParFasObs ;
   private String T1668ParFasVal ;
   private String AV13Station ;
   private String AV7EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z69ArtDsc ;
   private String Z759ProDsc ;
   private String Z460FasDsc ;
   private String Z1665ParFasDsc ;
   private String Z10585ParTit ;
   private String Z13204ParUndDsc ;
   private String sGXsfl_71_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtParFasCod_Jsonclick ;
   private String edtParFasVl2_Jsonclick ;
   private String edtParUndDsc_Jsonclick ;
   private String edtParFasVmn_Jsonclick ;
   private String edtParFasVmx_Jsonclick ;
   private String edtParFasObs_Jsonclick ;
   private String edtParNVar_Jsonclick ;
   private String edtParTit_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private String GXv_char14[] ;
   private String GXv_char11[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV31Msg_err ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n10584ParNVar ;
   private boolean n13203ParUndID ;
   private boolean wbErr ;
   private boolean bGXsfl_71_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_parfascod_Isgriditem ;
   private boolean Combo_parfascod_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean n1665ParFasDsc ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_parfascod_Enabled ;
   private boolean Combo_parfascod_Visible ;
   private boolean Combo_parfascod_Allowmultipleselection ;
   private boolean Combo_parfascod_Hasdescription ;
   private boolean Combo_parfascod_Includeonlyselectedoption ;
   private boolean Combo_parfascod_Includeselectalloption ;
   private boolean Combo_parfascod_Includeaddnewoption ;
   private boolean Gridlevel_level1_titlescategories_Enabled ;
   private boolean Gridlevel_level1_titlescategories_Visible ;
   private boolean n69ArtDsc ;
   private boolean returnInSub ;
   private boolean n10585ParTit ;
   private boolean n13204ParUndDsc ;
   private boolean Gx_longc ;
   private String AV49ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV47WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_parfascod ;
   private com.genexus.webpanels.GXUserControl ucGridlevel_level1_titlescategories ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01PF8_A407EmprNom ;
   private boolean[] T01PF8_n407EmprNom ;
   private String[] T01PF9_A279CliNom ;
   private String[] T01PF10_A69ArtDsc ;
   private boolean[] T01PF10_n69ArtDsc ;
   private String[] T01PF11_A759ProDsc ;
   private String[] T01PF13_A460FasDsc ;
   private String[] T01PF15_A407EmprNom ;
   private boolean[] T01PF15_n407EmprNom ;
   private String[] T01PF15_A279CliNom ;
   private String[] T01PF15_A69ArtDsc ;
   private boolean[] T01PF15_n69ArtDsc ;
   private String[] T01PF15_A759ProDsc ;
   private String[] T01PF15_A460FasDsc ;
   private java.math.BigDecimal[] T01PF15_A8560ArtFasFac ;
   private String[] T01PF15_A396EmprCod ;
   private int[] T01PF15_A252CliCod ;
   private String[] T01PF15_A65ArtCod ;
   private String[] T01PF15_A758ProCod ;
   private String[] T01PF15_A457FasCod ;
   private String[] T01PF12_A396EmprCod ;
   private String[] T01PF14_A396EmprCod ;
   private String[] T01PF16_A279CliNom ;
   private String[] T01PF17_A69ArtDsc ;
   private boolean[] T01PF17_n69ArtDsc ;
   private String[] T01PF18_A759ProDsc ;
   private String[] T01PF19_A396EmprCod ;
   private String[] T01PF20_A460FasDsc ;
   private String[] T01PF21_A396EmprCod ;
   private String[] T01PF22_A396EmprCod ;
   private int[] T01PF22_A252CliCod ;
   private String[] T01PF22_A65ArtCod ;
   private String[] T01PF22_A758ProCod ;
   private String[] T01PF22_A457FasCod ;
   private java.math.BigDecimal[] T01PF7_A8560ArtFasFac ;
   private String[] T01PF7_A396EmprCod ;
   private int[] T01PF7_A252CliCod ;
   private String[] T01PF7_A65ArtCod ;
   private String[] T01PF7_A758ProCod ;
   private String[] T01PF7_A457FasCod ;
   private String[] T01PF23_A396EmprCod ;
   private int[] T01PF23_A252CliCod ;
   private String[] T01PF23_A65ArtCod ;
   private String[] T01PF23_A758ProCod ;
   private String[] T01PF23_A457FasCod ;
   private String[] T01PF24_A396EmprCod ;
   private int[] T01PF24_A252CliCod ;
   private String[] T01PF24_A65ArtCod ;
   private String[] T01PF24_A758ProCod ;
   private String[] T01PF24_A457FasCod ;
   private java.math.BigDecimal[] T01PF6_A8560ArtFasFac ;
   private String[] T01PF6_A396EmprCod ;
   private int[] T01PF6_A252CliCod ;
   private String[] T01PF6_A65ArtCod ;
   private String[] T01PF6_A758ProCod ;
   private String[] T01PF6_A457FasCod ;
   private String[] T01PF28_A279CliNom ;
   private String[] T01PF29_A69ArtDsc ;
   private boolean[] T01PF29_n69ArtDsc ;
   private String[] T01PF30_A759ProDsc ;
   private String[] T01PF31_A460FasDsc ;
   private String[] T01PF32_A396EmprCod ;
   private int[] T01PF32_A252CliCod ;
   private String[] T01PF32_A65ArtCod ;
   private String[] T01PF32_A758ProCod ;
   private String[] T01PF32_A457FasCod ;
   private short[] T01PF32_A4897ArtProLin ;
   private String[] T01PF33_A396EmprCod ;
   private int[] T01PF33_A252CliCod ;
   private String[] T01PF33_A65ArtCod ;
   private String[] T01PF33_A758ProCod ;
   private String[] T01PF33_A457FasCod ;
   private int[] T01PF34_A252CliCod ;
   private String[] T01PF34_A65ArtCod ;
   private String[] T01PF34_A758ProCod ;
   private String[] T01PF34_A1665ParFasDsc ;
   private boolean[] T01PF34_n1665ParFasDsc ;
   private String[] T01PF34_A1668ParFasVal ;
   private String[] T01PF34_A1673ParFasObs ;
   private short[] T01PF34_A10584ParNVar ;
   private boolean[] T01PF34_n10584ParNVar ;
   private String[] T01PF34_A10585ParTit ;
   private boolean[] T01PF34_n10585ParTit ;
   private String[] T01PF34_A12670ParFasVl2 ;
   private String[] T01PF34_A13204ParUndDsc ;
   private boolean[] T01PF34_n13204ParUndDsc ;
   private short[] T01PF34_A13220ParOrden ;
   private String[] T01PF34_A14060ParFasVmx ;
   private String[] T01PF34_A14061ParFasVmn ;
   private String[] T01PF34_A396EmprCod ;
   private short[] T01PF34_A1664ParFasCod ;
   private short[] T01PF34_A13203ParUndID ;
   private boolean[] T01PF34_n13203ParUndID ;
   private String[] T01PF34_A457FasCod ;
   private String[] T01PF4_A1665ParFasDsc ;
   private boolean[] T01PF4_n1665ParFasDsc ;
   private short[] T01PF4_A10584ParNVar ;
   private boolean[] T01PF4_n10584ParNVar ;
   private String[] T01PF4_A10585ParTit ;
   private boolean[] T01PF4_n10585ParTit ;
   private short[] T01PF4_A13203ParUndID ;
   private boolean[] T01PF4_n13203ParUndID ;
   private String[] T01PF5_A13204ParUndDsc ;
   private boolean[] T01PF5_n13204ParUndDsc ;
   private String[] T01PF35_A1665ParFasDsc ;
   private boolean[] T01PF35_n1665ParFasDsc ;
   private short[] T01PF35_A10584ParNVar ;
   private boolean[] T01PF35_n10584ParNVar ;
   private String[] T01PF35_A10585ParTit ;
   private boolean[] T01PF35_n10585ParTit ;
   private short[] T01PF35_A13203ParUndID ;
   private boolean[] T01PF35_n13203ParUndID ;
   private String[] T01PF36_A13204ParUndDsc ;
   private boolean[] T01PF36_n13204ParUndDsc ;
   private String[] T01PF37_A396EmprCod ;
   private int[] T01PF37_A252CliCod ;
   private String[] T01PF37_A65ArtCod ;
   private String[] T01PF37_A758ProCod ;
   private String[] T01PF37_A457FasCod ;
   private short[] T01PF37_A1664ParFasCod ;
   private int[] T01PF3_A252CliCod ;
   private String[] T01PF3_A65ArtCod ;
   private String[] T01PF3_A758ProCod ;
   private String[] T01PF3_A1668ParFasVal ;
   private String[] T01PF3_A1673ParFasObs ;
   private String[] T01PF3_A12670ParFasVl2 ;
   private short[] T01PF3_A13220ParOrden ;
   private String[] T01PF3_A14060ParFasVmx ;
   private String[] T01PF3_A14061ParFasVmn ;
   private String[] T01PF3_A396EmprCod ;
   private short[] T01PF3_A1664ParFasCod ;
   private String[] T01PF3_A457FasCod ;
   private int[] T01PF2_A252CliCod ;
   private String[] T01PF2_A65ArtCod ;
   private String[] T01PF2_A758ProCod ;
   private String[] T01PF2_A1668ParFasVal ;
   private String[] T01PF2_A1673ParFasObs ;
   private String[] T01PF2_A12670ParFasVl2 ;
   private short[] T01PF2_A13220ParOrden ;
   private String[] T01PF2_A14060ParFasVmx ;
   private String[] T01PF2_A14061ParFasVmn ;
   private String[] T01PF2_A396EmprCod ;
   private short[] T01PF2_A1664ParFasCod ;
   private String[] T01PF2_A457FasCod ;
   private String[] T01PF41_A1665ParFasDsc ;
   private boolean[] T01PF41_n1665ParFasDsc ;
   private short[] T01PF41_A10584ParNVar ;
   private boolean[] T01PF41_n10584ParNVar ;
   private String[] T01PF41_A10585ParTit ;
   private boolean[] T01PF41_n10585ParTit ;
   private short[] T01PF41_A13203ParUndID ;
   private boolean[] T01PF41_n13203ParUndID ;
   private String[] T01PF42_A13204ParUndDsc ;
   private boolean[] T01PF42_n13204ParUndDsc ;
   private String[] T01PF43_A396EmprCod ;
   private int[] T01PF43_A252CliCod ;
   private String[] T01PF43_A65ArtCod ;
   private String[] T01PF43_A758ProCod ;
   private String[] T01PF43_A457FasCod ;
   private short[] T01PF43_A1664ParFasCod ;
   private String[] T01PF44_A396EmprCod ;
   private String[] T01PF45_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV48ParFasCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV45WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV46TrnContext ;
}

final  class tserpa2copy1__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tserpa2copy1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tserpa2copy1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tserpa2copy1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tserpa2copy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01PF2", "SELECT CliCod, ArtCod, ProCod, ParFasVal, ParFasObs, ParFasVl2, ParOrden, ParFasVmx, ParFasVmn, EmprCod, ParFasCod, FasCod FROM TXPSERPAR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ParFasCod = ?  FOR UPDATE OF ParFasVal, ParFasObs, ParFasVl2, ParOrden, ParFasVmx, ParFasVmn NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF3", "SELECT CliCod, ArtCod, ProCod, ParFasVal, ParFasObs, ParFasVl2, ParOrden, ParFasVmx, ParFasVmn, EmprCod, ParFasCod, FasCod FROM TXPSERPAR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF4", "SELECT ParFasDsc, ParNVar, ParTit, ParUndID FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF5", "SELECT ParUndDsc FROM TXPPARUND WHERE EmprCod = ? AND ParUndID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF6", "SELECT ArtFasFac, EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ?  FOR UPDATE OF ArtFasFac NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF7", "SELECT ArtFasFac, EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF10", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF11", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF12", "SELECT EmprCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF13", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF14", "SELECT EmprCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF15", "SELECT /*+ FIRST_ROWS(100) */ T2.EmprNom, T3.CliNom, T4.ArtDsc, T5.ProDsc, T6.FasDsc, TM1.ArtFasFac, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.ProCod, TM1.FasCod FROM (((((TXPSERPAU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.ArtCod) INNER JOIN TXPPROCES T5 ON T5.EmprCod = TM1.EmprCod AND T5.ProCod = TM1.ProCod) INNER JOIN TXPFASPRO T6 ON T6.EmprCod = TM1.EmprCod AND T6.FasCod = TM1.FasCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.ProCod = ? and TM1.FasCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.ProCod, TM1.FasCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF16", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF17", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF18", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF19", "SELECT EmprCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF20", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF21", "SELECT EmprCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF22", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF23", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE ( CliCod > ? or CliCod = ? and ArtCod > ? or ArtCod = ? and CliCod = ? and ProCod > ? or ProCod = ? and ArtCod = ? and CliCod = ? and FasCod > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PF24", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE ( CliCod < ? or CliCod = ? and ArtCod < ? or ArtCod = ? and CliCod = ? and ProCod < ? or ProCod = ? and ArtCod = ? and CliCod = ? and FasCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, ProCod DESC, FasCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01PF25", "INSERT INTO TXPSERPAU(ArtFasFac, EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProULin, ArtProFacT, ArtProFac, CCTCod, ArtFasPyS, ArtFasPpp, ArtFasVel, ArtFasNPs) VALUES(?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPSERPAU")
         ,new UpdateCursor("T01PF26", "UPDATE TXPSERPAU SET ArtFasFac=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ?", GX_NOMASK, "TXPSERPAU")
         ,new UpdateCursor("T01PF27", "DELETE FROM TXPSERPAU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ?", GX_NOMASK, "TXPSERPAU")
         ,new ForEachCursor("T01PF28", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF29", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF30", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF31", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF32", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProLin FROM TXPArtFor WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PF33", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF34", "SELECT T1.CliCod, T1.ArtCod, T1.ProCod, T2.ParFasDsc, T1.ParFasVal, T1.ParFasObs, T2.ParNVar, T2.ParTit, T1.ParFasVl2, T3.ParUndDsc, T1.ParOrden, T1.ParFasVmx, T1.ParFasVmn, T1.EmprCod, T1.ParFasCod, T2.ParUndID, T1.FasCod FROM ((TXPSERPAR T1 INNER JOIN TXPPARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.ParFasCod = T1.ParFasCod) LEFT JOIN TXPPARUND T3 ON T3.EmprCod = T1.EmprCod AND T3.ParUndID = T2.ParUndID) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ? and T1.FasCod = ? and T1.ParFasCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod, T1.FasCod, T1.ParFasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF35", "SELECT ParFasDsc, ParNVar, ParTit, ParUndID FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF36", "SELECT ParUndDsc FROM TXPPARUND WHERE EmprCod = ? AND ParUndID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF37", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasCod FROM TXPSERPAR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01PF38", "INSERT INTO TXPSERPAR(CliCod, ArtCod, ProCod, ParFasVal, ParFasObs, ParFasVl2, ParOrden, ParFasVmx, ParFasVmn, EmprCod, ParFasCod, FasCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPSERPAR")
         ,new UpdateCursor("T01PF39", "UPDATE TXPSERPAR SET ParFasVal=?, ParFasObs=?, ParFasVl2=?, ParOrden=?, ParFasVmx=?, ParFasVmn=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ParFasCod = ?", GX_NOMASK, "TXPSERPAR")
         ,new UpdateCursor("T01PF40", "DELETE FROM TXPSERPAR  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ParFasCod = ?", GX_NOMASK, "TXPSERPAR")
         ,new ForEachCursor("T01PF41", "SELECT ParFasDsc, ParNVar, ParTit, ParUndID FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF42", "SELECT ParUndDsc FROM TXPPARUND WHERE EmprCod = ? AND ParUndID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF43", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasCod FROM TXPSERPAR WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF44", "SELECT EmprCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PF45", "SELECT EmprCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 15);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 40);
               ((String[]) buf[6])[0] = rslt.getString(5, 28);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((String[]) buf[12])[0] = rslt.getString(11, 8);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 32 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((String[]) buf[6])[0] = rslt.getString(6, 60);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 15);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 12);
               ((String[]) buf[12])[0] = rslt.getString(10, 15);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 12);
               ((String[]) buf[16])[0] = rslt.getString(13, 12);
               ((String[]) buf[17])[0] = rslt.getString(14, 3);
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((short[]) buf[19])[0] = rslt.getShort(16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 8);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 15);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 15);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 43 :
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
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
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 8);
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 22 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 8);
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 23 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 8);
               return;
            case 24 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 8);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 34 :
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
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 36 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 60);
               stmt.setString(6, (String)parms[5], 12);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 12);
               stmt.setString(9, (String)parms[8], 12);
               stmt.setString(10, (String)parms[9], 3);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setString(12, (String)parms[11], 8);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 60);
               stmt.setString(3, (String)parms[2], 12);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 12);
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 16);
               stmt.setString(10, (String)parms[9], 8);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 40 :
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
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

