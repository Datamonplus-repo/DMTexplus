package app.documentotransportecomercial ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentotransportecomercial_cabecera_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action39") == 0 )
      {
         AV7EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
         AV17ContCod = httpContext.GetPar( "ContCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17ContCod", AV17ContCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17ContCod, "@!"))));
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
         xc_39_1UB1( AV7EmprCod, AV17ContCod, A14AlbComCod, A22AlbComPri) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action42") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_42_1UB1( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"ALBCOMFHAN") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
         gx3asaalbcomfhan1UB1( A396EmprCod, A14AlbComCod, A22AlbComPri) ;
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
         gx4asaalblineasl1UB1( A396EmprCod, A14AlbComCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_48") == 0 )
      {
         A3111AlcDivCod = (byte)(GXutil.lval( httpContext.GetPar( "AlcDivCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3111AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3111AlcDivCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_48( A3111AlcDivCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_46") == 0 )
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
         gxload_46( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_47") == 0 )
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
         gxload_47( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_49") == 0 )
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
         gxload_49( A396EmprCod, A252CliCod, A5142AlcDomEnv) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_50") == 0 )
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
         gxload_50( A396EmprCod, A14AlbComCod) ;
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
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8AlbComCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbComCod), "ZZZZZZZ9")));
            AV16AlbComPri = httpContext.GetPar( "AlbComPri") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16AlbComPri", AV16AlbComPri);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16AlbComPri, "9"))));
            AV17ContCod = httpContext.GetPar( "ContCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17ContCod", AV17ContCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17ContCod, "@!"))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Documento Transporte Comercial (Cabecera)", ""), (short)(0)) ;
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

   public documentotransportecomercial_cabecera_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentotransportecomercial_cabecera_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransportecomercial_cabecera_impl.class ));
   }

   public documentotransportecomercial_cabecera_impl( int remoteHandle ,
                                                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlbcompri = new HTMLChoice();
      cmbAlbComEAT = new HTMLChoice();
      cmbAlbComAT = new HTMLChoice();
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
      if ( cmbavAlbcompri.getItemCount() > 0 )
      {
         AV16AlbComPri = cmbavAlbcompri.getValidValue(AV16AlbComPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16AlbComPri", AV16AlbComPri);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16AlbComPri, "9"))));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbcompri.setValue( GXutil.rtrim( AV16AlbComPri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcompri.getInternalname(), "Values", cmbavAlbcompri.ToJavascriptSource(), true);
      }
      if ( cmbAlbComEAT.getItemCount() > 0 )
      {
         A10739AlbComEAT = (byte)(GXutil.lval( cmbAlbComEAT.getValidValue(GXutil.trim( GXutil.str( A10739AlbComEAT, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbComEAT.setValue( GXutil.trim( GXutil.str( A10739AlbComEAT, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbComEAT.getInternalname(), "Values", cmbAlbComEAT.ToJavascriptSource(), true);
      }
      if ( cmbAlbComAT.getItemCount() > 0 )
      {
         A10764AlbComAT = cmbAlbComAT.getValidValue(A10764AlbComAT) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10764AlbComAT", A10764AlbComAT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbComAT.setValue( GXutil.rtrim( A10764AlbComAT) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbComAT.getInternalname(), "Values", cmbAlbComAT.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComCod_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComFch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComFch_Internalname, httpContext.getMessage( "Data", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbComFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComFch_Internalname, localUtil.format(A17AlbComFch, "99/99/99"), localUtil.format( A17AlbComFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComFch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbComFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbComFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComFhAN_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComFhAN_Internalname, httpContext.getMessage( "Doc. Ant.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbComFhAN_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComFhAN_Internalname, localUtil.format(A14400AlbComFhAN, "99/99/99"), localUtil.format( A14400AlbComFhAN, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComFhAN_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComFhAN_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbComFhAN_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbComFhAN_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclicod_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockclicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_clicod.setProperty("Caption", Combo_clicod_Caption);
      ucCombo_clicod.setProperty("Cls", Combo_clicod_Cls);
      ucCombo_clicod.setProperty("EmptyItem", Combo_clicod_Emptyitem);
      ucCombo_clicod.setProperty("DropDownOptionsData", AV18CliCod_Data);
      ucCombo_clicod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod_Internalname, "COMBO_CLICODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliCod_Visible, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedalcdomenv_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalcdomenv_Internalname, httpContext.getMessage( "Domicilio de Envio", ""), "", "", lblTextblockalcdomenv_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_alcdomenv.setProperty("Caption", Combo_alcdomenv_Caption);
      ucCombo_alcdomenv.setProperty("Cls", Combo_alcdomenv_Cls);
      ucCombo_alcdomenv.setProperty("EmptyItemText", Combo_alcdomenv_Emptyitemtext);
      ucCombo_alcdomenv.setProperty("DropDownOptionsTitleSettingsIcons", AV25DDO_TitleSettingsIcons);
      ucCombo_alcdomenv.setProperty("DropDownOptionsData", AV24AlcDomEnv_Data);
      ucCombo_alcdomenv.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_alcdomenv_Internalname, "COMBO_ALCDOMENVContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlcDomEnv_Internalname, httpContext.getMessage( "Domicilio de Envio", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlcDomEnv_Internalname, GXutil.ltrim( localUtil.ntoc( A5142AlcDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlcDomEnv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5142AlcDomEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(A5142AlcDomEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlcDomEnv_Jsonclick, 0, "Attribute", "", "", "", "", edtAlcDomEnv_Visible, edtAlcDomEnv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedtrncod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktrncod_Internalname, httpContext.getMessage( "Transportista", ""), "", "", lblTextblocktrncod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_trncod.setProperty("Caption", Combo_trncod_Caption);
      ucCombo_trncod.setProperty("Cls", Combo_trncod_Cls);
      ucCombo_trncod.setProperty("EmptyItemText", Combo_trncod_Emptyitemtext);
      ucCombo_trncod.setProperty("DropDownOptionsData", AV28TrnCod_Data);
      ucCombo_trncod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_trncod_Internalname, "COMBO_TRNCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "Attribute", "", "", "", "", edtTrnCod_Visible, edtTrnCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComMat_Internalname, httpContext.getMessage( "Matricula", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComMat_Internalname, GXutil.rtrim( A4830AlbComMat), GXutil.rtrim( localUtil.format( A4830AlbComMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComHor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComHor_Internalname, httpContext.getMessage( "Data-Hora Saida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbComHor_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComHor_Internalname, localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4829AlbComHor, "99/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComHor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComHor_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbComHor_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbComHor_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      httpContext.writeTextNL( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAlbcompri.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbavAlbcompri.getInternalname(), httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbcompri, cmbavAlbcompri.getInternalname(), GXutil.rtrim( AV16AlbComPri), 1, cmbavAlbcompri.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAlbcompri.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      cmbavAlbcompri.setValue( GXutil.rtrim( AV16AlbComPri) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcompri.getInternalname(), "Values", cmbavAlbcompri.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavContcod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavContcod_Internalname, httpContext.getMessage( "Contador", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavContcod_Internalname, GXutil.rtrim( AV17ContCod), GXutil.rtrim( localUtil.format( AV17ContCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavContcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavContcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbLineasL_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbLineasL_Internalname, httpContext.getMessage( "Lineas?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbLineasL_Internalname, GXutil.ltrim( localUtil.ntoc( A14254AlbLineasL, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbLineasL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14254AlbLineasL), "9") : localUtil.format( DecimalUtil.doubleToDec(A14254AlbLineasL), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbLineasL_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbLineasL_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell CellMarginTop24 DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbComEAT.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbComEAT.getInternalname(), httpContext.getMessage( "Envio AT", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbComEAT, cmbAlbComEAT.getInternalname(), GXutil.trim( GXutil.str( A10739AlbComEAT, 1, 0)), 1, cmbAlbComEAT.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbComEAT.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      cmbAlbComEAT.setValue( GXutil.trim( GXutil.str( A10739AlbComEAT, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComEAT.getInternalname(), "Values", cmbAlbComEAT.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell CellMarginTop24 DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComID_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComID_Internalname, httpContext.getMessage( "Codigo AT", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComID_Internalname, GXutil.rtrim( A10740AlbComID), GXutil.rtrim( localUtil.format( A10740AlbComID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComID_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComID_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell CellMarginTop24 DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbComAT.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbComAT.getInternalname(), httpContext.getMessage( "A/M", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbComAT, cmbAlbComAT.getInternalname(), GXutil.rtrim( A10764AlbComAT), 1, cmbAlbComAT.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbComAT.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      cmbAlbComAT.setValue( GXutil.rtrim( A10764AlbComAT) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComAT.getInternalname(), "Values", cmbAlbComAT.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell CellMarginTop24 DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComFs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComFs_Internalname, httpContext.getMessage( "Data System Hash", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbComFs_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComFs_Internalname, localUtil.ttoc( A10013AlbComFs, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10013AlbComFs, "99/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComFs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComFs_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbComFs_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbComFs_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell CellMarginTop24 DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComATCU_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComATCU_Internalname, httpContext.getMessage( "ATCUD", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComATCU_Internalname, GXutil.rtrim( A14248AlbComATCU), GXutil.rtrim( localUtil.format( A14248AlbComATCU, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComATCU_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComATCU_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell CellMarginTop24 DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbCom4dig_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbCom4dig_Internalname, httpContext.getMessage( "Hash", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCom4dig_Internalname, GXutil.rtrim( A14374AlbCom4dig), GXutil.rtrim( localUtil.format( A14374AlbCom4dig, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCom4dig_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbCom4dig_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV31Pgmname), GXutil.rtrim( localUtil.format( AV31Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_clicod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboclicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV20ComboCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboclicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20ComboCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV20ComboCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboclicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboclicod_Visible, edtavComboclicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_alcdomenv_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboalcdomenv_Internalname, GXutil.ltrim( localUtil.ntoc( AV26ComboAlcDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboalcdomenv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV26ComboAlcDomEnv), "9") : localUtil.format( DecimalUtil.doubleToDec(AV26ComboAlcDomEnv), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboalcdomenv_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboalcdomenv_Visible, edtavComboalcdomenv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_trncod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombotrncod_Internalname, GXutil.ltrim( localUtil.ntoc( AV29ComboTrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombotrncod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV29ComboTrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV29ComboTrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtavCombotrncod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombotrncod_Visible, edtavCombotrncod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComPri_Internalname, GXutil.rtrim( A22AlbComPri), GXutil.rtrim( localUtil.format( A22AlbComPri, "9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComPri_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComPri_Visible, edtAlbComPri_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComEst_Internalname, GXutil.ltrim( localUtil.ntoc( A16AlbComEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbComEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A16AlbComEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A16AlbComEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComEst_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbComEst_Visible, edtAlbComEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Cabecera.htm");
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
      e111UB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD_DATA"), AV18CliCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV25DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vALCDOMENV_DATA"), AV24AlcDomEnv_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTRNCOD_DATA"), AV28TrnCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z14AlbComCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5142AlcDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5142AlcDomEnv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z17AlbComFch = localUtil.ctod( httpContext.cgiGet( "Z17AlbComFch"), 0) ;
            Z22AlbComPri = httpContext.cgiGet( "Z22AlbComPri") ;
            Z16AlbComEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z16AlbComEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z19AlbComLiC = (short)(localUtil.ctol( httpContext.cgiGet( "Z19AlbComLiC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1783AlbComEso = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1783AlbComEso"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3095AlcDivTCod = httpContext.cgiGet( "Z3095AlcDivTCod") ;
            Z4829AlbComHor = localUtil.ctot( httpContext.cgiGet( "Z4829AlbComHor"), 0) ;
            Z4830AlbComMat = httpContext.cgiGet( "Z4830AlbComMat") ;
            Z10013AlbComFs = localUtil.ctot( httpContext.cgiGet( "Z10013AlbComFs"), 0) ;
            Z10014AlbComFd = httpContext.cgiGet( "Z10014AlbComFd") ;
            Z10015AlbComFdD = httpContext.cgiGet( "Z10015AlbComFdD") ;
            Z3094AlbCSec = httpContext.cgiGet( "Z3094AlbCSec") ;
            Z10738AlbComSt = httpContext.cgiGet( "Z10738AlbComSt") ;
            Z10739AlbComEAT = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10739AlbComEAT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10740AlbComID = httpContext.cgiGet( "Z10740AlbComID") ;
            Z10764AlbComAT = httpContext.cgiGet( "Z10764AlbComAT") ;
            Z5143AlcIvaCod = httpContext.cgiGet( "Z5143AlcIvaCod") ;
            Z11719AlbCTrNm = httpContext.cgiGet( "Z11719AlbCTrNm") ;
            Z11720AlbCTrDm = httpContext.cgiGet( "Z11720AlbCTrDm") ;
            Z11721AlbCTrNc = httpContext.cgiGet( "Z11721AlbCTrNc") ;
            Z14248AlbComATCU = httpContext.cgiGet( "Z14248AlbComATCU") ;
            Z14249AlbComSerA = httpContext.cgiGet( "Z14249AlbComSerA") ;
            Z14250AlbComTipA = httpContext.cgiGet( "Z14250AlbComTipA") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3111AlcDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3111AlcDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A19AlbComLiC = (short)(localUtil.ctol( httpContext.cgiGet( "Z19AlbComLiC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1783AlbComEso = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1783AlbComEso"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3095AlcDivTCod = httpContext.cgiGet( "Z3095AlcDivTCod") ;
            A10014AlbComFd = httpContext.cgiGet( "Z10014AlbComFd") ;
            A10015AlbComFdD = httpContext.cgiGet( "Z10015AlbComFdD") ;
            A3094AlbCSec = httpContext.cgiGet( "Z3094AlbCSec") ;
            A10738AlbComSt = httpContext.cgiGet( "Z10738AlbComSt") ;
            A5143AlcIvaCod = httpContext.cgiGet( "Z5143AlcIvaCod") ;
            A11719AlbCTrNm = httpContext.cgiGet( "Z11719AlbCTrNm") ;
            A11720AlbCTrDm = httpContext.cgiGet( "Z11720AlbCTrDm") ;
            A11721AlbCTrNc = httpContext.cgiGet( "Z11721AlbCTrNc") ;
            A14249AlbComSerA = httpContext.cgiGet( "Z14249AlbComSerA") ;
            A14250AlbComTipA = httpContext.cgiGet( "Z14250AlbComTipA") ;
            A3111AlcDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3111AlcDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "N252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N3111AlcDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "N3111AlcDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "N840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A10014AlbComFd = httpContext.cgiGet( "ALBCOMFD") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( "vALBCOMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12Insert_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13Insert_AlcDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_ALCDIVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3111AlcDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "ALCDIVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV14Insert_TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10738AlbComSt = httpContext.cgiGet( "ALBCOMST") ;
            A3095AlcDivTCod = httpContext.cgiGet( "ALCDIVTCOD") ;
            AV32Pgmdesc = httpContext.cgiGet( "vPGMDESC") ;
            A14249AlbComSerA = httpContext.cgiGet( "ALBCOMSERA") ;
            A14250AlbComTipA = httpContext.cgiGet( "ALBCOMTIPA") ;
            A19AlbComLiC = (short)(localUtil.ctol( httpContext.cgiGet( "ALBCOMLIC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1783AlbComEso = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBCOMESO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10015AlbComFdD = httpContext.cgiGet( "ALBCOMFDD") ;
            A3094AlbCSec = httpContext.cgiGet( "ALBCSEC") ;
            A5143AlcIvaCod = httpContext.cgiGet( "ALCIVACOD") ;
            A11719AlbCTrNm = httpContext.cgiGet( "ALBCTRNM") ;
            A11720AlbCTrDm = httpContext.cgiGet( "ALBCTRDM") ;
            A11721AlbCTrNc = httpContext.cgiGet( "ALBCTRNC") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A279CliNom = httpContext.cgiGet( "CLINOM") ;
            A3091CliDivTra = httpContext.cgiGet( "CLIDIVTRA") ;
            n3091CliDivTra = false ;
            A3140CliDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "CLIDIVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3140CliDivCod = false ;
            A841TrnNom = httpContext.cgiGet( "TRNNOM") ;
            n841TrnNom = false ;
            A3112AlcDivAbr = httpContext.cgiGet( "ALCDIVABR") ;
            n3112AlcDivAbr = false ;
            A13739findDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( "FINDDOMENV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13739findDomEnv = false ;
            A18AlbComImp = localUtil.ctond( httpContext.cgiGet( "ALBCOMIMP")) ;
            n18AlbComImp = false ;
            Combo_clicod_Objectcall = httpContext.cgiGet( "COMBO_CLICOD_Objectcall") ;
            Combo_clicod_Class = httpContext.cgiGet( "COMBO_CLICOD_Class") ;
            Combo_clicod_Icontype = httpContext.cgiGet( "COMBO_CLICOD_Icontype") ;
            Combo_clicod_Icon = httpContext.cgiGet( "COMBO_CLICOD_Icon") ;
            Combo_clicod_Caption = httpContext.cgiGet( "COMBO_CLICOD_Caption") ;
            Combo_clicod_Tooltip = httpContext.cgiGet( "COMBO_CLICOD_Tooltip") ;
            Combo_clicod_Cls = httpContext.cgiGet( "COMBO_CLICOD_Cls") ;
            Combo_clicod_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD_Selectedvalue_set") ;
            Combo_clicod_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICOD_Selectedvalue_get") ;
            Combo_clicod_Selectedtext_set = httpContext.cgiGet( "COMBO_CLICOD_Selectedtext_set") ;
            Combo_clicod_Selectedtext_get = httpContext.cgiGet( "COMBO_CLICOD_Selectedtext_get") ;
            Combo_clicod_Gamoauthtoken = httpContext.cgiGet( "COMBO_CLICOD_Gamoauthtoken") ;
            Combo_clicod_Ddointernalname = httpContext.cgiGet( "COMBO_CLICOD_Ddointernalname") ;
            Combo_clicod_Titlecontrolalign = httpContext.cgiGet( "COMBO_CLICOD_Titlecontrolalign") ;
            Combo_clicod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_CLICOD_Dropdownoptionstype") ;
            Combo_clicod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Enabled")) ;
            Combo_clicod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Visible")) ;
            Combo_clicod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_CLICOD_Titlecontrolidtoreplace") ;
            Combo_clicod_Datalisttype = httpContext.cgiGet( "COMBO_CLICOD_Datalisttype") ;
            Combo_clicod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Allowmultipleselection")) ;
            Combo_clicod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_CLICOD_Datalistfixedvalues") ;
            Combo_clicod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Isgriditem")) ;
            Combo_clicod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Hasdescription")) ;
            Combo_clicod_Datalistproc = httpContext.cgiGet( "COMBO_CLICOD_Datalistproc") ;
            Combo_clicod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_CLICOD_Datalistprocparametersprefix") ;
            Combo_clicod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_CLICOD_Remoteservicesparameters") ;
            Combo_clicod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_CLICOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_clicod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Includeonlyselectedoption")) ;
            Combo_clicod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Includeselectalloption")) ;
            Combo_clicod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Emptyitem")) ;
            Combo_clicod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Includeaddnewoption")) ;
            Combo_clicod_Htmltemplate = httpContext.cgiGet( "COMBO_CLICOD_Htmltemplate") ;
            Combo_clicod_Multiplevaluestype = httpContext.cgiGet( "COMBO_CLICOD_Multiplevaluestype") ;
            Combo_clicod_Loadingdata = httpContext.cgiGet( "COMBO_CLICOD_Loadingdata") ;
            Combo_clicod_Noresultsfound = httpContext.cgiGet( "COMBO_CLICOD_Noresultsfound") ;
            Combo_clicod_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICOD_Emptyitemtext") ;
            Combo_clicod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_CLICOD_Onlyselectedvalues") ;
            Combo_clicod_Selectalltext = httpContext.cgiGet( "COMBO_CLICOD_Selectalltext") ;
            Combo_clicod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_CLICOD_Multiplevaluesseparator") ;
            Combo_clicod_Addnewoptiontext = httpContext.cgiGet( "COMBO_CLICOD_Addnewoptiontext") ;
            Combo_clicod_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_CLICOD_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_alcdomenv_Objectcall = httpContext.cgiGet( "COMBO_ALCDOMENV_Objectcall") ;
            Combo_alcdomenv_Class = httpContext.cgiGet( "COMBO_ALCDOMENV_Class") ;
            Combo_alcdomenv_Icontype = httpContext.cgiGet( "COMBO_ALCDOMENV_Icontype") ;
            Combo_alcdomenv_Icon = httpContext.cgiGet( "COMBO_ALCDOMENV_Icon") ;
            Combo_alcdomenv_Caption = httpContext.cgiGet( "COMBO_ALCDOMENV_Caption") ;
            Combo_alcdomenv_Tooltip = httpContext.cgiGet( "COMBO_ALCDOMENV_Tooltip") ;
            Combo_alcdomenv_Cls = httpContext.cgiGet( "COMBO_ALCDOMENV_Cls") ;
            Combo_alcdomenv_Selectedvalue_set = httpContext.cgiGet( "COMBO_ALCDOMENV_Selectedvalue_set") ;
            Combo_alcdomenv_Selectedvalue_get = httpContext.cgiGet( "COMBO_ALCDOMENV_Selectedvalue_get") ;
            Combo_alcdomenv_Selectedtext_set = httpContext.cgiGet( "COMBO_ALCDOMENV_Selectedtext_set") ;
            Combo_alcdomenv_Selectedtext_get = httpContext.cgiGet( "COMBO_ALCDOMENV_Selectedtext_get") ;
            Combo_alcdomenv_Gamoauthtoken = httpContext.cgiGet( "COMBO_ALCDOMENV_Gamoauthtoken") ;
            Combo_alcdomenv_Ddointernalname = httpContext.cgiGet( "COMBO_ALCDOMENV_Ddointernalname") ;
            Combo_alcdomenv_Titlecontrolalign = httpContext.cgiGet( "COMBO_ALCDOMENV_Titlecontrolalign") ;
            Combo_alcdomenv_Dropdownoptionstype = httpContext.cgiGet( "COMBO_ALCDOMENV_Dropdownoptionstype") ;
            Combo_alcdomenv_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALCDOMENV_Enabled")) ;
            Combo_alcdomenv_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALCDOMENV_Visible")) ;
            Combo_alcdomenv_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_ALCDOMENV_Titlecontrolidtoreplace") ;
            Combo_alcdomenv_Datalisttype = httpContext.cgiGet( "COMBO_ALCDOMENV_Datalisttype") ;
            Combo_alcdomenv_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALCDOMENV_Allowmultipleselection")) ;
            Combo_alcdomenv_Datalistfixedvalues = httpContext.cgiGet( "COMBO_ALCDOMENV_Datalistfixedvalues") ;
            Combo_alcdomenv_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALCDOMENV_Isgriditem")) ;
            Combo_alcdomenv_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALCDOMENV_Hasdescription")) ;
            Combo_alcdomenv_Datalistproc = httpContext.cgiGet( "COMBO_ALCDOMENV_Datalistproc") ;
            Combo_alcdomenv_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_ALCDOMENV_Datalistprocparametersprefix") ;
            Combo_alcdomenv_Remoteservicesparameters = httpContext.cgiGet( "COMBO_ALCDOMENV_Remoteservicesparameters") ;
            Combo_alcdomenv_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_ALCDOMENV_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_alcdomenv_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALCDOMENV_Includeonlyselectedoption")) ;
            Combo_alcdomenv_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALCDOMENV_Includeselectalloption")) ;
            Combo_alcdomenv_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALCDOMENV_Emptyitem")) ;
            Combo_alcdomenv_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ALCDOMENV_Includeaddnewoption")) ;
            Combo_alcdomenv_Htmltemplate = httpContext.cgiGet( "COMBO_ALCDOMENV_Htmltemplate") ;
            Combo_alcdomenv_Multiplevaluestype = httpContext.cgiGet( "COMBO_ALCDOMENV_Multiplevaluestype") ;
            Combo_alcdomenv_Loadingdata = httpContext.cgiGet( "COMBO_ALCDOMENV_Loadingdata") ;
            Combo_alcdomenv_Noresultsfound = httpContext.cgiGet( "COMBO_ALCDOMENV_Noresultsfound") ;
            Combo_alcdomenv_Emptyitemtext = httpContext.cgiGet( "COMBO_ALCDOMENV_Emptyitemtext") ;
            Combo_alcdomenv_Onlyselectedvalues = httpContext.cgiGet( "COMBO_ALCDOMENV_Onlyselectedvalues") ;
            Combo_alcdomenv_Selectalltext = httpContext.cgiGet( "COMBO_ALCDOMENV_Selectalltext") ;
            Combo_alcdomenv_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_ALCDOMENV_Multiplevaluesseparator") ;
            Combo_alcdomenv_Addnewoptiontext = httpContext.cgiGet( "COMBO_ALCDOMENV_Addnewoptiontext") ;
            Combo_alcdomenv_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_ALCDOMENV_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_trncod_Objectcall = httpContext.cgiGet( "COMBO_TRNCOD_Objectcall") ;
            Combo_trncod_Class = httpContext.cgiGet( "COMBO_TRNCOD_Class") ;
            Combo_trncod_Icontype = httpContext.cgiGet( "COMBO_TRNCOD_Icontype") ;
            Combo_trncod_Icon = httpContext.cgiGet( "COMBO_TRNCOD_Icon") ;
            Combo_trncod_Caption = httpContext.cgiGet( "COMBO_TRNCOD_Caption") ;
            Combo_trncod_Tooltip = httpContext.cgiGet( "COMBO_TRNCOD_Tooltip") ;
            Combo_trncod_Cls = httpContext.cgiGet( "COMBO_TRNCOD_Cls") ;
            Combo_trncod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TRNCOD_Selectedvalue_set") ;
            Combo_trncod_Selectedvalue_get = httpContext.cgiGet( "COMBO_TRNCOD_Selectedvalue_get") ;
            Combo_trncod_Selectedtext_set = httpContext.cgiGet( "COMBO_TRNCOD_Selectedtext_set") ;
            Combo_trncod_Selectedtext_get = httpContext.cgiGet( "COMBO_TRNCOD_Selectedtext_get") ;
            Combo_trncod_Gamoauthtoken = httpContext.cgiGet( "COMBO_TRNCOD_Gamoauthtoken") ;
            Combo_trncod_Ddointernalname = httpContext.cgiGet( "COMBO_TRNCOD_Ddointernalname") ;
            Combo_trncod_Titlecontrolalign = httpContext.cgiGet( "COMBO_TRNCOD_Titlecontrolalign") ;
            Combo_trncod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_TRNCOD_Dropdownoptionstype") ;
            Combo_trncod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Enabled")) ;
            Combo_trncod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Visible")) ;
            Combo_trncod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_TRNCOD_Titlecontrolidtoreplace") ;
            Combo_trncod_Datalisttype = httpContext.cgiGet( "COMBO_TRNCOD_Datalisttype") ;
            Combo_trncod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Allowmultipleselection")) ;
            Combo_trncod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_TRNCOD_Datalistfixedvalues") ;
            Combo_trncod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Isgriditem")) ;
            Combo_trncod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Hasdescription")) ;
            Combo_trncod_Datalistproc = httpContext.cgiGet( "COMBO_TRNCOD_Datalistproc") ;
            Combo_trncod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_TRNCOD_Datalistprocparametersprefix") ;
            Combo_trncod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_TRNCOD_Remoteservicesparameters") ;
            Combo_trncod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_TRNCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_trncod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Includeonlyselectedoption")) ;
            Combo_trncod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Includeselectalloption")) ;
            Combo_trncod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Emptyitem")) ;
            Combo_trncod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Includeaddnewoption")) ;
            Combo_trncod_Htmltemplate = httpContext.cgiGet( "COMBO_TRNCOD_Htmltemplate") ;
            Combo_trncod_Multiplevaluestype = httpContext.cgiGet( "COMBO_TRNCOD_Multiplevaluestype") ;
            Combo_trncod_Loadingdata = httpContext.cgiGet( "COMBO_TRNCOD_Loadingdata") ;
            Combo_trncod_Noresultsfound = httpContext.cgiGet( "COMBO_TRNCOD_Noresultsfound") ;
            Combo_trncod_Emptyitemtext = httpContext.cgiGet( "COMBO_TRNCOD_Emptyitemtext") ;
            Combo_trncod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_TRNCOD_Onlyselectedvalues") ;
            Combo_trncod_Selectalltext = httpContext.cgiGet( "COMBO_TRNCOD_Selectalltext") ;
            Combo_trncod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_TRNCOD_Multiplevaluesseparator") ;
            Combo_trncod_Addnewoptiontext = httpContext.cgiGet( "COMBO_TRNCOD_Addnewoptiontext") ;
            Combo_trncod_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_TRNCOD_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A14400AlbComFhAN = localUtil.ctod( httpContext.cgiGet( edtAlbComFhAN_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14400AlbComFhAN", localUtil.format(A14400AlbComFhAN, "99/99/99"));
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
            A4830AlbComMat = httpContext.cgiGet( edtAlbComMat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4830AlbComMat", A4830AlbComMat);
            A4829AlbComHor = localUtil.ctot( httpContext.cgiGet( edtAlbComHor_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            cmbavAlbcompri.setValue( httpContext.cgiGet( cmbavAlbcompri.getInternalname()) );
            AV16AlbComPri = httpContext.cgiGet( cmbavAlbcompri.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16AlbComPri", AV16AlbComPri);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16AlbComPri, "9"))));
            AV17ContCod = GXutil.upper( httpContext.cgiGet( edtavContcod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17ContCod", AV17ContCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17ContCod, "@!"))));
            A14254AlbLineasL = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbLineasL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14254AlbLineasL", GXutil.str( A14254AlbLineasL, 1, 0));
            cmbAlbComEAT.setValue( httpContext.cgiGet( cmbAlbComEAT.getInternalname()) );
            A10739AlbComEAT = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbComEAT.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
            A10740AlbComID = httpContext.cgiGet( edtAlbComID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10740AlbComID", A10740AlbComID);
            cmbAlbComAT.setValue( httpContext.cgiGet( cmbAlbComAT.getInternalname()) );
            A10764AlbComAT = httpContext.cgiGet( cmbAlbComAT.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10764AlbComAT", A10764AlbComAT);
            A10013AlbComFs = localUtil.ctot( httpContext.cgiGet( edtAlbComFs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A14248AlbComATCU = httpContext.cgiGet( edtAlbComATCU_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14248AlbComATCU", A14248AlbComATCU);
            A14374AlbCom4dig = httpContext.cgiGet( edtAlbCom4dig_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14374AlbCom4dig", A14374AlbCom4dig);
            AV31Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31Pgmname", AV31Pgmname);
            AV20ComboCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavComboclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20ComboCliCod), 6, 0));
            AV26ComboAlcDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtavComboalcdomenv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26ComboAlcDomEnv", GXutil.str( AV26ComboAlcDomEnv, 1, 0));
            AV29ComboTrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombotrncod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29ComboTrnCod), 4, 0));
            A22AlbComPri = httpContext.cgiGet( edtAlbComPri_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
            A16AlbComEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbComEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A16AlbComEst", GXutil.str( A16AlbComEst, 1, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteComercial_Cabecera");
            A10739AlbComEAT = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbComEAT.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
            forbiddenHiddens.add("AlbComEAT", localUtil.format( DecimalUtil.doubleToDec(A10739AlbComEAT), "9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV31Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31Pgmname", AV31Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV31Pgmname, "")));
            A22AlbComPri = httpContext.cgiGet( edtAlbComPri_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
            forbiddenHiddens.add("AlbComPri", GXutil.rtrim( localUtil.format( A22AlbComPri, "9")));
            A16AlbComEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbComEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A16AlbComEst", GXutil.str( A16AlbComEst, 1, 0));
            forbiddenHiddens.add("AlbComEst", localUtil.format( DecimalUtil.doubleToDec(A16AlbComEst), "9"));
            forbiddenHiddens.add("AlbComLiC", localUtil.format( DecimalUtil.doubleToDec(A19AlbComLiC), "ZZ9"));
            forbiddenHiddens.add("AlbComEso", localUtil.format( DecimalUtil.doubleToDec(A1783AlbComEso), "9"));
            forbiddenHiddens.add("AlcDivTCod", GXutil.rtrim( localUtil.format( A3095AlcDivTCod, "")));
            A4829AlbComHor = localUtil.ctot( httpContext.cgiGet( edtAlbComHor_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("AlbComHor", localUtil.format( A4829AlbComHor, "99/99/99 99:99:99"));
            A10013AlbComFs = localUtil.ctot( httpContext.cgiGet( edtAlbComFs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("AlbComFs", localUtil.format( A10013AlbComFs, "99/99/99 99:99:99"));
            forbiddenHiddens.add("AlbComFd", GXutil.rtrim( localUtil.format( A10014AlbComFd, "")));
            forbiddenHiddens.add("AlbComFdD", GXutil.rtrim( localUtil.format( A10015AlbComFdD, "")));
            forbiddenHiddens.add("AlbCSec", GXutil.rtrim( localUtil.format( A3094AlbCSec, "")));
            forbiddenHiddens.add("AlbComSt", GXutil.rtrim( localUtil.format( A10738AlbComSt, "")));
            A10740AlbComID = httpContext.cgiGet( edtAlbComID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10740AlbComID", A10740AlbComID);
            forbiddenHiddens.add("AlbComID", GXutil.rtrim( localUtil.format( A10740AlbComID, "")));
            A10764AlbComAT = httpContext.cgiGet( cmbAlbComAT.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10764AlbComAT", A10764AlbComAT);
            forbiddenHiddens.add("AlbComAT", GXutil.rtrim( localUtil.format( A10764AlbComAT, "")));
            forbiddenHiddens.add("AlcIvaCod", GXutil.rtrim( localUtil.format( A5143AlcIvaCod, "@!")));
            forbiddenHiddens.add("AlbCTrNm", GXutil.rtrim( localUtil.format( A11719AlbCTrNm, "")));
            forbiddenHiddens.add("AlbCTrDm", GXutil.rtrim( localUtil.format( A11720AlbCTrDm, "")));
            forbiddenHiddens.add("AlbCTrNc", GXutil.rtrim( localUtil.format( A11721AlbCTrNc, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A14AlbComCod != Z14AlbComCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("documentotransportecomercial\\documentotransportecomercial_cabecera:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_1UB0( ) ;
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
                     if ( GXutil.strcmp(sEvt, "COMBO_CLICOD.ONOPTIONCLICKED") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e121UB2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111UB2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e131UB2 ();
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
         e131UB2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1UB1( ) ;
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
         disableAttributes1UB1( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcompri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbcompri.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavContcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavContcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalcdomenv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalcdomenv_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Enabled), 5, 0), true);
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

   public void confirm_1UB0( )
   {
      beforeValidate1UB1( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UB1( ) ;
         }
         else
         {
            checkExtendedTable1UB1( ) ;
            closeExtendedTableCursors1UB1( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1UB0( )
   {
   }

   public void e111UB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV21Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentotransportecomercial_cabecera_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Station", AV21Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV22EmprNom ;
      GXv_char4[0] = AV23UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentotransportecomercial_cabecera_impl.this.AV7EmprCod = GXv_char2[0] ;
      documentotransportecomercial_cabecera_impl.this.AV22EmprNom = GXv_char3[0] ;
      documentotransportecomercial_cabecera_impl.this.AV23UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV22EmprNom", AV22EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
      GXv_SdtWWPContext5[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV9WWPContext = GXv_SdtWWPContext5[0] ;
      edtTrnCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Visible), 5, 0), true);
      AV29ComboTrnCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29ComboTrnCod), 4, 0));
      edtavCombotrncod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Visible), 5, 0), true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV25DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV25DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      edtAlcDomEnv_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlcDomEnv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlcDomEnv_Visible), 5, 0), true);
      AV26ComboAlcDomEnv = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26ComboAlcDomEnv", GXutil.str( AV26ComboAlcDomEnv, 1, 0));
      edtavComboalcdomenv_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalcdomenv_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalcdomenv_Visible), 5, 0), true);
      edtCliCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), true);
      AV20ComboCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20ComboCliCod), 6, 0));
      edtavComboclicod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOALCDOMENV' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOTRNCOD' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV10TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV31Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV33GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GXV1), 8, 0));
         while ( AV33GXV1 <= AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV15TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV33GXV1));
            if ( GXutil.strcmp(AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CliCod") == 0 )
            {
               AV12Insert_CliCod = (int)(GXutil.lval( AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Insert_CliCod), 6, 0));
               if ( ! (0==AV12Insert_CliCod) )
               {
                  AV20ComboCliCod = AV12Insert_CliCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV20ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20ComboCliCod), 6, 0));
                  Combo_clicod_Selectedvalue_set = GXutil.trim( GXutil.str( AV20ComboCliCod, 6, 0)) ;
                  ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
                  Combo_clicod_Enabled = false ;
                  ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlcDivCod") == 0 )
            {
               AV13Insert_AlcDivCod = (byte)(GXutil.lval( AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Insert_AlcDivCod), 2, 0));
            }
            else if ( GXutil.strcmp(AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV14Insert_TrnCod = (short)(GXutil.lval( AV15TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14Insert_TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Insert_TrnCod), 4, 0));
               if ( ! (0==AV14Insert_TrnCod) )
               {
                  AV29ComboTrnCod = AV14Insert_TrnCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV29ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29ComboTrnCod), 4, 0));
                  Combo_trncod_Selectedvalue_set = GXutil.trim( GXutil.str( AV29ComboTrnCod, 4, 0)) ;
                  ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "SelectedValue_set", Combo_trncod_Selectedvalue_set);
                  Combo_trncod_Enabled = false ;
                  ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "Enabled", GXutil.booltostr( Combo_trncod_Enabled));
               }
            }
            AV33GXV1 = (int)(AV33GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GXV1), 8, 0));
         }
      }
      edtAlbComPri_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComPri_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComPri_Visible), 5, 0), true);
      edtAlbComEst_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComEst_Visible), 5, 0), true);
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         GXt_int8 = AV27Tmp_CliCod ;
         GXv_int9[0] = GXt_int8 ;
         new app.documentotransportecomercial.documentotransportecomercial_obtenerclicod(remoteHandle, context).execute( AV7EmprCod, AV8AlbComCod, GXv_int9) ;
         documentotransportecomercial_cabecera_impl.this.GXt_int8 = GXv_int9[0] ;
         AV27Tmp_CliCod = GXt_int8 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Tmp_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Tmp_CliCod), 6, 0));
         AV11WebSession.setValue("&ComboCliCod", GXutil.str( AV27Tmp_CliCod, 6, 0));
         /* Execute user subroutine: 'LOADCOMBOALCDOMENV' */
         S122 ();
         if ( returnInSub )
         {
            pr_default.close(7);
            pr_default.close(6);
            pr_default.close(5);
            pr_default.close(4);
            pr_default.close(3);
            pr_default.close(2);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
      }
   }

   public void e131UB2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      AV11WebSession.remove("&ComboCliCod");
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) )
      {
         httpContext.popup(formatLink("app.documentotransportecomercial.documentotransportecomercial_lineas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.formatDateParm(A17AlbComFch)),GXutil.URLEncode(GXutil.formatDateTimeParm(A4829AlbComHor)),GXutil.URLEncode(GXutil.rtrim(A22AlbComPri)),GXutil.URLEncode(GXutil.ltrimstr(A10739AlbComEAT,1,0)),GXutil.URLEncode(GXutil.rtrim(A10740AlbComID)),GXutil.URLEncode(GXutil.ltrimstr(A16AlbComEst,1,0))}, new String[] {"EmprCod","AlbComCod","CliCod","CliNom","AlbComFch","AlbComHor","AlbComPri","AlbComEAT","AlbComID","Albcomest"}) , new Object[] {});
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void e121UB2( )
   {
      /* Combo_clicod_Onoptionclicked Routine */
      returnInSub = false ;
      AV20ComboCliCod = (int)(GXutil.lval( Combo_clicod_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20ComboCliCod), 6, 0));
      AV11WebSession.setValue("&ComboClicod", GXutil.trim( GXutil.str( AV20ComboCliCod, 6, 0)));
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'LOADCOMBOTRNCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV28TrnCod_Data ;
      GXv_char4[0] = AV19ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.documentotransportecomercial.documentotransportecomercial_cabeceraloaddvcombo(remoteHandle, context).execute( "TrnCod", Gx_mode, AV7EmprCod, AV8AlbComCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      documentotransportecomercial_cabecera_impl.this.AV19ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV28TrnCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      Combo_trncod_Selectedvalue_set = AV19ComboSelectedValue ;
      ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "SelectedValue_set", Combo_trncod_Selectedvalue_set);
      AV29ComboTrnCod = (short)(GXutil.lval( AV19ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29ComboTrnCod), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_trncod_Enabled = false ;
         ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "Enabled", GXutil.booltostr( Combo_trncod_Enabled));
      }
   }

   public void S122( )
   {
      /* 'LOADCOMBOALCDOMENV' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV24AlcDomEnv_Data ;
      GXv_char4[0] = AV19ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.documentotransportecomercial.documentotransportecomercial_cabeceraloaddvcombo(remoteHandle, context).execute( "AlcDomEnv", Gx_mode, AV7EmprCod, AV8AlbComCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      documentotransportecomercial_cabecera_impl.this.AV19ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV24AlcDomEnv_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      Combo_alcdomenv_Selectedvalue_set = AV19ComboSelectedValue ;
      ucCombo_alcdomenv.sendProperty(context, "", false, Combo_alcdomenv_Internalname, "SelectedValue_set", Combo_alcdomenv_Selectedvalue_set);
      AV26ComboAlcDomEnv = (byte)(GXutil.lval( AV19ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26ComboAlcDomEnv", GXutil.str( AV26ComboAlcDomEnv, 1, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_alcdomenv_Enabled = false ;
         ucCombo_alcdomenv.sendProperty(context, "", false, Combo_alcdomenv_Internalname, "Enabled", GXutil.booltostr( Combo_alcdomenv_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV18CliCod_Data ;
      GXv_char4[0] = AV19ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.documentotransportecomercial.documentotransportecomercial_cabeceraloaddvcombo(remoteHandle, context).execute( "CliCod", Gx_mode, AV7EmprCod, AV8AlbComCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      documentotransportecomercial_cabecera_impl.this.AV19ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV18CliCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      Combo_clicod_Selectedvalue_set = AV19ComboSelectedValue ;
      ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
      AV20ComboCliCod = (int)(GXutil.lval( AV19ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20ComboCliCod), 6, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_clicod_Enabled = false ;
         ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      }
   }

   public void zm1UB1( int GX_JID )
   {
      if ( ( GX_JID == 44 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5142AlcDomEnv = T01UB3_A5142AlcDomEnv[0] ;
            Z17AlbComFch = T01UB3_A17AlbComFch[0] ;
            Z22AlbComPri = T01UB3_A22AlbComPri[0] ;
            Z16AlbComEst = T01UB3_A16AlbComEst[0] ;
            Z19AlbComLiC = T01UB3_A19AlbComLiC[0] ;
            Z1783AlbComEso = T01UB3_A1783AlbComEso[0] ;
            Z3095AlcDivTCod = T01UB3_A3095AlcDivTCod[0] ;
            Z4829AlbComHor = T01UB3_A4829AlbComHor[0] ;
            Z4830AlbComMat = T01UB3_A4830AlbComMat[0] ;
            Z10013AlbComFs = T01UB3_A10013AlbComFs[0] ;
            Z10014AlbComFd = T01UB3_A10014AlbComFd[0] ;
            Z10015AlbComFdD = T01UB3_A10015AlbComFdD[0] ;
            Z3094AlbCSec = T01UB3_A3094AlbCSec[0] ;
            Z10738AlbComSt = T01UB3_A10738AlbComSt[0] ;
            Z10739AlbComEAT = T01UB3_A10739AlbComEAT[0] ;
            Z10740AlbComID = T01UB3_A10740AlbComID[0] ;
            Z10764AlbComAT = T01UB3_A10764AlbComAT[0] ;
            Z5143AlcIvaCod = T01UB3_A5143AlcIvaCod[0] ;
            Z11719AlbCTrNm = T01UB3_A11719AlbCTrNm[0] ;
            Z11720AlbCTrDm = T01UB3_A11720AlbCTrDm[0] ;
            Z11721AlbCTrNc = T01UB3_A11721AlbCTrNc[0] ;
            Z14248AlbComATCU = T01UB3_A14248AlbComATCU[0] ;
            Z14249AlbComSerA = T01UB3_A14249AlbComSerA[0] ;
            Z14250AlbComTipA = T01UB3_A14250AlbComTipA[0] ;
            Z252CliCod = T01UB3_A252CliCod[0] ;
            Z840TrnCod = T01UB3_A840TrnCod[0] ;
            Z3111AlcDivCod = T01UB3_A3111AlcDivCod[0] ;
         }
         else
         {
            Z5142AlcDomEnv = A5142AlcDomEnv ;
            Z17AlbComFch = A17AlbComFch ;
            Z22AlbComPri = A22AlbComPri ;
            Z16AlbComEst = A16AlbComEst ;
            Z19AlbComLiC = A19AlbComLiC ;
            Z1783AlbComEso = A1783AlbComEso ;
            Z3095AlcDivTCod = A3095AlcDivTCod ;
            Z4829AlbComHor = A4829AlbComHor ;
            Z4830AlbComMat = A4830AlbComMat ;
            Z10013AlbComFs = A10013AlbComFs ;
            Z10014AlbComFd = A10014AlbComFd ;
            Z10015AlbComFdD = A10015AlbComFdD ;
            Z3094AlbCSec = A3094AlbCSec ;
            Z10738AlbComSt = A10738AlbComSt ;
            Z10739AlbComEAT = A10739AlbComEAT ;
            Z10740AlbComID = A10740AlbComID ;
            Z10764AlbComAT = A10764AlbComAT ;
            Z5143AlcIvaCod = A5143AlcIvaCod ;
            Z11719AlbCTrNm = A11719AlbCTrNm ;
            Z11720AlbCTrDm = A11720AlbCTrDm ;
            Z11721AlbCTrNc = A11721AlbCTrNc ;
            Z14248AlbComATCU = A14248AlbComATCU ;
            Z14249AlbComSerA = A14249AlbComSerA ;
            Z14250AlbComTipA = A14250AlbComTipA ;
            Z252CliCod = A252CliCod ;
            Z840TrnCod = A840TrnCod ;
            Z3111AlcDivCod = A3111AlcDivCod ;
         }
      }
      if ( GX_JID == -44 )
      {
         Z14AlbComCod = A14AlbComCod ;
         Z5142AlcDomEnv = A5142AlcDomEnv ;
         Z17AlbComFch = A17AlbComFch ;
         Z22AlbComPri = A22AlbComPri ;
         Z16AlbComEst = A16AlbComEst ;
         Z19AlbComLiC = A19AlbComLiC ;
         Z1783AlbComEso = A1783AlbComEso ;
         Z3095AlcDivTCod = A3095AlcDivTCod ;
         Z4829AlbComHor = A4829AlbComHor ;
         Z4830AlbComMat = A4830AlbComMat ;
         Z10013AlbComFs = A10013AlbComFs ;
         Z10014AlbComFd = A10014AlbComFd ;
         Z10015AlbComFdD = A10015AlbComFdD ;
         Z3094AlbCSec = A3094AlbCSec ;
         Z10738AlbComSt = A10738AlbComSt ;
         Z10739AlbComEAT = A10739AlbComEAT ;
         Z10740AlbComID = A10740AlbComID ;
         Z10764AlbComAT = A10764AlbComAT ;
         Z5143AlcIvaCod = A5143AlcIvaCod ;
         Z11719AlbCTrNm = A11719AlbCTrNm ;
         Z11720AlbCTrDm = A11720AlbCTrDm ;
         Z11721AlbCTrNc = A11721AlbCTrNc ;
         Z14248AlbComATCU = A14248AlbComATCU ;
         Z14249AlbComSerA = A14249AlbComSerA ;
         Z14250AlbComTipA = A14250AlbComTipA ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z840TrnCod = A840TrnCod ;
         Z3111AlcDivCod = A3111AlcDivCod ;
         Z3112AlcDivAbr = A3112AlcDivAbr ;
         Z407EmprNom = A407EmprNom ;
         Z18AlbComImp = A18AlbComImp ;
         Z279CliNom = A279CliNom ;
         Z3091CliDivTra = A3091CliDivTra ;
         Z3140CliDivCod = A3140CliDivCod ;
         Z841TrnNom = A841TrnNom ;
         Z13739findDomEnv = A13739findDomEnv ;
      }
   }

   public void standaloneNotModal( )
   {
      cmbAlbComEAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComEAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbComEAT.getEnabled(), 5, 0), true);
      edtAlbComID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComID_Enabled), 5, 0), true);
      cmbAlbComAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbComAT.getEnabled(), 5, 0), true);
      edtAlbComFs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFs_Enabled), 5, 0), true);
      edtAlbComATCU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComATCU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComATCU_Enabled), 5, 0), true);
      edtAlbCom4dig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCom4dig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCom4dig_Enabled), 5, 0), true);
      edtAlbComHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComHor_Enabled), 5, 0), true);
      edtAlbComFhAN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFhAN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFhAN_Enabled), 5, 0), true);
      edtAlbComEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComEst_Enabled), 5, 0), true);
      edtAlbComPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComPri_Enabled), 5, 0), true);
      AV32Pgmdesc = httpContext.getMessage( "Documento Transporte Comercial (Cabecera)", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmdesc", AV32Pgmdesc);
      AV31Pgmname = "DocumentoTransporteComercial.DocumentoTransporteComercial_Cabecera" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Pgmname", AV31Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      cmbAlbComEAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComEAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbComEAT.getEnabled(), 5, 0), true);
      edtAlbComID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComID_Enabled), 5, 0), true);
      cmbAlbComAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbComAT.getEnabled(), 5, 0), true);
      edtAlbComFs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFs_Enabled), 5, 0), true);
      edtAlbComATCU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComATCU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComATCU_Enabled), 5, 0), true);
      edtAlbCom4dig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCom4dig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCom4dig_Enabled), 5, 0), true);
      edtAlbComHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComHor_Enabled), 5, 0), true);
      edtAlbComFhAN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFhAN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFhAN_Enabled), 5, 0), true);
      edtAlbComEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComEst_Enabled), 5, 0), true);
      edtAlbComPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComPri_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01UB4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01UB4_A407EmprNom[0] ;
      n407EmprNom = T01UB4_n407EmprNom[0] ;
      pr_default.close(2);
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV14Insert_TrnCod) )
      {
         edtTrnCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTrnCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( isUpd( )  || isDlt( )  || isIns( )  )
      {
         edtAlbComCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_CliCod) )
      {
         A252CliCod = AV12Insert_CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         A252CliCod = AV20ComboCliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      A5142AlcDomEnv = AV26ComboAlcDomEnv ;
      httpContext.ajax_rsp_assign_attri("", false, "A5142AlcDomEnv", GXutil.str( A5142AlcDomEnv, 1, 0));
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV14Insert_TrnCod) )
      {
         A840TrnCod = AV14Insert_TrnCod ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         if ( (0==AV29ComboTrnCod) )
         {
            A840TrnCod = (short)(0) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            n840TrnCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            if ( ! (0==AV29ComboTrnCod) )
            {
               A840TrnCod = AV29ComboTrnCod ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
         }
      }
      if ( ! (0==AV8AlbComCod) )
      {
         edtAlbComCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( isUpd( )  || isDlt( )  || isIns( )  )
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_AlcDivCod) )
      {
         A3111AlcDivCod = AV13Insert_AlcDivCod ;
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
      if ( isIns( )  && (GXutil.strcmp("", A22AlbComPri)==0) && ( Gx_BScreen == 0 ) )
      {
         A22AlbComPri = AV16AlbComPri ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01UB10 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         if ( (pr_default.getStatus(7) != 101) )
         {
            A18AlbComImp = T01UB10_A18AlbComImp[0] ;
            n18AlbComImp = T01UB10_n18AlbComImp[0] ;
         }
         else
         {
            A18AlbComImp = DecimalUtil.doubleToDec(0) ;
            n18AlbComImp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         }
         pr_default.close(7);
         GXt_int12 = A14254AlbLineasL ;
         GXv_int13[0] = GXt_int12 ;
         new app.haydatoslalcom(remoteHandle, context).execute( A396EmprCod, A14AlbComCod, GXv_int13) ;
         documentotransportecomercial_cabecera_impl.this.GXt_int12 = GXv_int13[0] ;
         A14254AlbLineasL = (byte)(GXt_int12) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14254AlbLineasL", GXutil.str( A14254AlbLineasL, 1, 0));
         /* Using cursor T01UB5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01UB5_A279CliNom[0] ;
         A3091CliDivTra = T01UB5_A3091CliDivTra[0] ;
         n3091CliDivTra = T01UB5_n3091CliDivTra[0] ;
         A3140CliDivCod = T01UB5_A3140CliDivCod[0] ;
         n3140CliDivCod = T01UB5_n3140CliDivCod[0] ;
         pr_default.close(3);
         /* Using cursor T01UB8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A5142AlcDomEnv)});
         if ( (pr_default.getStatus(6) != 101) )
         {
            A13739findDomEnv = T01UB8_A13739findDomEnv[0] ;
            n13739findDomEnv = T01UB8_n13739findDomEnv[0] ;
         }
         else
         {
            A13739findDomEnv = (byte)(0) ;
            n13739findDomEnv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
         }
         pr_default.close(6);
         /* Using cursor T01UB6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01UB6_A841TrnNom[0] ;
         n841TrnNom = T01UB6_n841TrnNom[0] ;
         pr_default.close(4);
         /* Using cursor T01UB7 */
         pr_default.execute(5, new Object[] {Byte.valueOf(A3111AlcDivCod)});
         A3112AlcDivAbr = T01UB7_A3112AlcDivAbr[0] ;
         n3112AlcDivAbr = T01UB7_n3112AlcDivAbr[0] ;
         pr_default.close(5);
         GXt_date14 = A14400AlbComFhAN ;
         GXv_date15[0] = GXt_date14 ;
         new app.documentotransportecomercial.documentotransportecomercial_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A14AlbComCod, A22AlbComPri, GXv_date15) ;
         documentotransportecomercial_cabecera_impl.this.GXt_date14 = GXv_date15[0] ;
         A14400AlbComFhAN = GXt_date14 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14400AlbComFhAN", localUtil.format(A14400AlbComFhAN, "99/99/99"));
      }
   }

   public void load1UB1( )
   {
      /* Using cursor T01UB12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A5142AlcDomEnv = T01UB12_A5142AlcDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5142AlcDomEnv", GXutil.str( A5142AlcDomEnv, 1, 0));
         A407EmprNom = T01UB12_A407EmprNom[0] ;
         n407EmprNom = T01UB12_n407EmprNom[0] ;
         A17AlbComFch = T01UB12_A17AlbComFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         A22AlbComPri = T01UB12_A22AlbComPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         A279CliNom = T01UB12_A279CliNom[0] ;
         A3091CliDivTra = T01UB12_A3091CliDivTra[0] ;
         n3091CliDivTra = T01UB12_n3091CliDivTra[0] ;
         A16AlbComEst = T01UB12_A16AlbComEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16AlbComEst", GXutil.str( A16AlbComEst, 1, 0));
         A19AlbComLiC = T01UB12_A19AlbComLiC[0] ;
         A1783AlbComEso = T01UB12_A1783AlbComEso[0] ;
         A3095AlcDivTCod = T01UB12_A3095AlcDivTCod[0] ;
         A3112AlcDivAbr = T01UB12_A3112AlcDivAbr[0] ;
         n3112AlcDivAbr = T01UB12_n3112AlcDivAbr[0] ;
         A841TrnNom = T01UB12_A841TrnNom[0] ;
         n841TrnNom = T01UB12_n841TrnNom[0] ;
         A4829AlbComHor = T01UB12_A4829AlbComHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4830AlbComMat = T01UB12_A4830AlbComMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4830AlbComMat", A4830AlbComMat);
         A10013AlbComFs = T01UB12_A10013AlbComFs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10014AlbComFd = T01UB12_A10014AlbComFd[0] ;
         A10015AlbComFdD = T01UB12_A10015AlbComFdD[0] ;
         A3094AlbCSec = T01UB12_A3094AlbCSec[0] ;
         A10738AlbComSt = T01UB12_A10738AlbComSt[0] ;
         A10739AlbComEAT = T01UB12_A10739AlbComEAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
         A10740AlbComID = T01UB12_A10740AlbComID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10740AlbComID", A10740AlbComID);
         A10764AlbComAT = T01UB12_A10764AlbComAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10764AlbComAT", A10764AlbComAT);
         A5143AlcIvaCod = T01UB12_A5143AlcIvaCod[0] ;
         A11719AlbCTrNm = T01UB12_A11719AlbCTrNm[0] ;
         A11720AlbCTrDm = T01UB12_A11720AlbCTrDm[0] ;
         A11721AlbCTrNc = T01UB12_A11721AlbCTrNc[0] ;
         A14248AlbComATCU = T01UB12_A14248AlbComATCU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14248AlbComATCU", A14248AlbComATCU);
         A14249AlbComSerA = T01UB12_A14249AlbComSerA[0] ;
         A14250AlbComTipA = T01UB12_A14250AlbComTipA[0] ;
         A252CliCod = T01UB12_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01UB12_A840TrnCod[0] ;
         n840TrnCod = T01UB12_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A3111AlcDivCod = T01UB12_A3111AlcDivCod[0] ;
         A3140CliDivCod = T01UB12_A3140CliDivCod[0] ;
         n3140CliDivCod = T01UB12_n3140CliDivCod[0] ;
         A13739findDomEnv = T01UB12_A13739findDomEnv[0] ;
         n13739findDomEnv = T01UB12_n13739findDomEnv[0] ;
         A18AlbComImp = T01UB12_A18AlbComImp[0] ;
         n18AlbComImp = T01UB12_n18AlbComImp[0] ;
         zm1UB1( -44) ;
      }
      pr_default.close(8);
      onLoadActions1UB1( ) ;
   }

   public void onLoadActions1UB1( )
   {
      A14374AlbCom4dig = GXutil.substring( A10014AlbComFd, 1, 1) + GXutil.substring( A10014AlbComFd, 11, 1) + GXutil.substring( A10014AlbComFd, 21, 1) + GXutil.substring( A10014AlbComFd, 31, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14374AlbCom4dig", A14374AlbCom4dig);
      GXt_date14 = A14400AlbComFhAN ;
      GXv_date15[0] = GXt_date14 ;
      new app.documentotransportecomercial.documentotransportecomercial_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A14AlbComCod, A22AlbComPri, GXv_date15) ;
      documentotransportecomercial_cabecera_impl.this.GXt_date14 = GXv_date15[0] ;
      A14400AlbComFhAN = GXt_date14 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14400AlbComFhAN", localUtil.format(A14400AlbComFhAN, "99/99/99"));
      GXt_int12 = A14254AlbLineasL ;
      GXv_int13[0] = GXt_int12 ;
      new app.haydatoslalcom(remoteHandle, context).execute( A396EmprCod, A14AlbComCod, GXv_int13) ;
      documentotransportecomercial_cabecera_impl.this.GXt_int12 = GXv_int13[0] ;
      A14254AlbLineasL = (byte)(GXt_int12) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14254AlbLineasL", GXutil.str( A14254AlbLineasL, 1, 0));
   }

   public void checkExtendedTable1UB1( )
   {
      nIsDirty_1 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14400AlbComFhAN)) && GXutil.resetTime(A17AlbComFch).before( GXutil.resetTime( A14400AlbComFhAN )) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Data documento ", "")+GXutil.trim( localUtil.dtoc( A17AlbComFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+httpContext.getMessage( ", inferior a Data Doc. Ant. ", "")+GXutil.trim( localUtil.dtoc( A14400AlbComFhAN, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), 1, "ALBCOMFCH");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComFch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_1 = (short)(1) ;
      A14374AlbCom4dig = GXutil.substring( A10014AlbComFd, 1, 1) + GXutil.substring( A10014AlbComFd, 11, 1) + GXutil.substring( A10014AlbComFd, 21, 1) + GXutil.substring( A10014AlbComFd, 31, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14374AlbCom4dig", A14374AlbCom4dig);
      /* Using cursor T01UB7 */
      pr_default.execute(5, new Object[] {Byte.valueOf(A3111AlcDivCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlbC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALCDIVCOD");
         AnyError = (short)(1) ;
      }
      A3112AlcDivAbr = T01UB7_A3112AlcDivAbr[0] ;
      n3112AlcDivAbr = T01UB7_n3112AlcDivAbr[0] ;
      pr_default.close(5);
      /* Using cursor T01UB5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01UB5_A279CliNom[0] ;
      A3091CliDivTra = T01UB5_A3091CliDivTra[0] ;
      n3091CliDivTra = T01UB5_n3091CliDivTra[0] ;
      A3140CliDivCod = T01UB5_A3140CliDivCod[0] ;
      n3140CliDivCod = T01UB5_n3140CliDivCod[0] ;
      pr_default.close(3);
      /* Using cursor T01UB6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01UB6_A841TrnNom[0] ;
      n841TrnNom = T01UB6_n841TrnNom[0] ;
      pr_default.close(4);
      /* Using cursor T01UB8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A5142AlcDomEnv)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A13739findDomEnv = T01UB8_A13739findDomEnv[0] ;
         n13739findDomEnv = T01UB8_n13739findDomEnv[0] ;
      }
      else
      {
         nIsDirty_1 = (short)(1) ;
         A13739findDomEnv = (byte)(0) ;
         n13739findDomEnv = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
      }
      pr_default.close(6);
      /* Using cursor T01UB10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A18AlbComImp = T01UB10_A18AlbComImp[0] ;
         n18AlbComImp = T01UB10_n18AlbComImp[0] ;
      }
      else
      {
         nIsDirty_1 = (short)(1) ;
         A18AlbComImp = DecimalUtil.doubleToDec(0) ;
         n18AlbComImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      }
      pr_default.close(7);
      nIsDirty_1 = (short)(1) ;
      GXt_date14 = A14400AlbComFhAN ;
      GXv_date15[0] = GXt_date14 ;
      new app.documentotransportecomercial.documentotransportecomercial_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A14AlbComCod, A22AlbComPri, GXv_date15) ;
      documentotransportecomercial_cabecera_impl.this.GXt_date14 = GXv_date15[0] ;
      A14400AlbComFhAN = GXt_date14 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14400AlbComFhAN", localUtil.format(A14400AlbComFhAN, "99/99/99"));
      nIsDirty_1 = (short)(1) ;
      GXt_int12 = A14254AlbLineasL ;
      GXv_int13[0] = GXt_int12 ;
      new app.haydatoslalcom(remoteHandle, context).execute( A396EmprCod, A14AlbComCod, GXv_int13) ;
      documentotransportecomercial_cabecera_impl.this.GXt_int12 = GXv_int13[0] ;
      A14254AlbLineasL = (byte)(GXt_int12) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14254AlbLineasL", GXutil.str( A14254AlbLineasL, 1, 0));
   }

   public void closeExtendedTableCursors1UB1( )
   {
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(6);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_48( byte A3111AlcDivCod )
   {
      /* Using cursor T01UB13 */
      pr_default.execute(9, new Object[] {Byte.valueOf(A3111AlcDivCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivAlbC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALCDIVCOD");
         AnyError = (short)(1) ;
      }
      A3112AlcDivAbr = T01UB13_A3112AlcDivAbr[0] ;
      n3112AlcDivAbr = T01UB13_n3112AlcDivAbr[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3112AlcDivAbr))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_46( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01UB14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01UB14_A279CliNom[0] ;
      A3091CliDivTra = T01UB14_A3091CliDivTra[0] ;
      n3091CliDivTra = T01UB14_n3091CliDivTra[0] ;
      A3140CliDivCod = T01UB14_A3140CliDivCod[0] ;
      n3140CliDivCod = T01UB14_n3140CliDivCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3091CliDivTra))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3140CliDivCod, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_47( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01UB15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01UB15_A841TrnNom[0] ;
      n841TrnNom = T01UB15_n841TrnNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_49( String A396EmprCod ,
                          int A252CliCod ,
                          byte A5142AlcDomEnv )
   {
      /* Using cursor T01UB16 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A5142AlcDomEnv)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         A13739findDomEnv = T01UB16_A13739findDomEnv[0] ;
         n13739findDomEnv = T01UB16_n13739findDomEnv[0] ;
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
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_50( String A396EmprCod ,
                          int A14AlbComCod )
   {
      /* Using cursor T01UB18 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         A18AlbComImp = T01UB18_A18AlbComImp[0] ;
         n18AlbComImp = T01UB18_n18AlbComImp[0] ;
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
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void getKey1UB1( )
   {
      /* Using cursor T01UB19 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1 = (short)(1) ;
      }
      else
      {
         RcdFound1 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1UB1( 44) ;
         RcdFound1 = (short)(1) ;
         A14AlbComCod = T01UB3_A14AlbComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
         A5142AlcDomEnv = T01UB3_A5142AlcDomEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5142AlcDomEnv", GXutil.str( A5142AlcDomEnv, 1, 0));
         A17AlbComFch = T01UB3_A17AlbComFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         A22AlbComPri = T01UB3_A22AlbComPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
         A16AlbComEst = T01UB3_A16AlbComEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16AlbComEst", GXutil.str( A16AlbComEst, 1, 0));
         A19AlbComLiC = T01UB3_A19AlbComLiC[0] ;
         A1783AlbComEso = T01UB3_A1783AlbComEso[0] ;
         A3095AlcDivTCod = T01UB3_A3095AlcDivTCod[0] ;
         A4829AlbComHor = T01UB3_A4829AlbComHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4830AlbComMat = T01UB3_A4830AlbComMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4830AlbComMat", A4830AlbComMat);
         A10013AlbComFs = T01UB3_A10013AlbComFs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10014AlbComFd = T01UB3_A10014AlbComFd[0] ;
         A10015AlbComFdD = T01UB3_A10015AlbComFdD[0] ;
         A3094AlbCSec = T01UB3_A3094AlbCSec[0] ;
         A10738AlbComSt = T01UB3_A10738AlbComSt[0] ;
         A10739AlbComEAT = T01UB3_A10739AlbComEAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
         A10740AlbComID = T01UB3_A10740AlbComID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10740AlbComID", A10740AlbComID);
         A10764AlbComAT = T01UB3_A10764AlbComAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10764AlbComAT", A10764AlbComAT);
         A5143AlcIvaCod = T01UB3_A5143AlcIvaCod[0] ;
         A11719AlbCTrNm = T01UB3_A11719AlbCTrNm[0] ;
         A11720AlbCTrDm = T01UB3_A11720AlbCTrDm[0] ;
         A11721AlbCTrNc = T01UB3_A11721AlbCTrNc[0] ;
         A14248AlbComATCU = T01UB3_A14248AlbComATCU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14248AlbComATCU", A14248AlbComATCU);
         A14249AlbComSerA = T01UB3_A14249AlbComSerA[0] ;
         A14250AlbComTipA = T01UB3_A14250AlbComTipA[0] ;
         A396EmprCod = T01UB3_A396EmprCod[0] ;
         A252CliCod = T01UB3_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01UB3_A840TrnCod[0] ;
         n840TrnCod = T01UB3_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A3111AlcDivCod = T01UB3_A3111AlcDivCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z14AlbComCod = A14AlbComCod ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UB1( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1 = (short)(0) ;
            initializeNonKey1UB1( ) ;
         }
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1 = (short)(0) ;
         initializeNonKey1UB1( ) ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1UB1( ) ;
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
      /* Using cursor T01UB20 */
      pr_default.execute(15, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01UB20_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UB20_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UB20_A14AlbComCod[0] < A14AlbComCod ) ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( ( GXutil.strcmp(T01UB20_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UB20_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UB20_A14AlbComCod[0] > A14AlbComCod ) ) )
         {
            A396EmprCod = T01UB20_A396EmprCod[0] ;
            A14AlbComCod = T01UB20_A14AlbComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void move_previous( )
   {
      RcdFound1 = (short)(0) ;
      /* Using cursor T01UB21 */
      pr_default.execute(16, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01UB21_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UB21_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UB21_A14AlbComCod[0] > A14AlbComCod ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01UB21_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UB21_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UB21_A14AlbComCod[0] < A14AlbComCod ) ) )
         {
            A396EmprCod = T01UB21_A396EmprCod[0] ;
            A14AlbComCod = T01UB21_A14AlbComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UB1( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAlbComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1UB1( ) ;
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
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1UB1( ) ;
               GX_FocusControl = edtAlbComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A14AlbComCod != Z14AlbComCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtAlbComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1UB1( ) ;
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
                  GX_FocusControl = edtAlbComCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1UB1( ) ;
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
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1UB1( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UB2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALCOM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z5142AlcDomEnv != T01UB2_A5142AlcDomEnv[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z17AlbComFch), GXutil.resetTime(T01UB2_A17AlbComFch[0])) ) || ( GXutil.strcmp(Z22AlbComPri, T01UB2_A22AlbComPri[0]) != 0 ) || ( Z16AlbComEst != T01UB2_A16AlbComEst[0] ) || ( Z19AlbComLiC != T01UB2_A19AlbComLiC[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1783AlbComEso != T01UB2_A1783AlbComEso[0] ) || ( GXutil.strcmp(Z3095AlcDivTCod, T01UB2_A3095AlcDivTCod[0]) != 0 ) || !( GXutil.dateCompare(Z4829AlbComHor, T01UB2_A4829AlbComHor[0]) ) || ( GXutil.strcmp(Z4830AlbComMat, T01UB2_A4830AlbComMat[0]) != 0 ) || !( GXutil.dateCompare(Z10013AlbComFs, T01UB2_A10013AlbComFs[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10014AlbComFd, T01UB2_A10014AlbComFd[0]) != 0 ) || ( GXutil.strcmp(Z10015AlbComFdD, T01UB2_A10015AlbComFdD[0]) != 0 ) || ( GXutil.strcmp(Z3094AlbCSec, T01UB2_A3094AlbCSec[0]) != 0 ) || ( GXutil.strcmp(Z10738AlbComSt, T01UB2_A10738AlbComSt[0]) != 0 ) || ( Z10739AlbComEAT != T01UB2_A10739AlbComEAT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10740AlbComID, T01UB2_A10740AlbComID[0]) != 0 ) || ( GXutil.strcmp(Z10764AlbComAT, T01UB2_A10764AlbComAT[0]) != 0 ) || ( GXutil.strcmp(Z5143AlcIvaCod, T01UB2_A5143AlcIvaCod[0]) != 0 ) || ( GXutil.strcmp(Z11719AlbCTrNm, T01UB2_A11719AlbCTrNm[0]) != 0 ) || ( GXutil.strcmp(Z11720AlbCTrDm, T01UB2_A11720AlbCTrDm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11721AlbCTrNc, T01UB2_A11721AlbCTrNc[0]) != 0 ) || ( GXutil.strcmp(Z14248AlbComATCU, T01UB2_A14248AlbComATCU[0]) != 0 ) || ( GXutil.strcmp(Z14249AlbComSerA, T01UB2_A14249AlbComSerA[0]) != 0 ) || ( GXutil.strcmp(Z14250AlbComTipA, T01UB2_A14250AlbComTipA[0]) != 0 ) || ( Z252CliCod != T01UB2_A252CliCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z840TrnCod != T01UB2_A840TrnCod[0] ) || ( Z3111AlcDivCod != T01UB2_A3111AlcDivCod[0] ) )
         {
            if ( Z5142AlcDomEnv != T01UB2_A5142AlcDomEnv[0] )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlcDomEnv");
               GXutil.writeLogRaw("Old: ",Z5142AlcDomEnv);
               GXutil.writeLogRaw("Current: ",T01UB2_A5142AlcDomEnv[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z17AlbComFch), GXutil.resetTime(T01UB2_A17AlbComFch[0])) ) )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbComFch");
               GXutil.writeLogRaw("Old: ",Z17AlbComFch);
               GXutil.writeLogRaw("Current: ",T01UB2_A17AlbComFch[0]);
            }
            if ( GXutil.strcmp(Z22AlbComPri, T01UB2_A22AlbComPri[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbComPri");
               GXutil.writeLogRaw("Old: ",Z22AlbComPri);
               GXutil.writeLogRaw("Current: ",T01UB2_A22AlbComPri[0]);
            }
            if ( Z16AlbComEst != T01UB2_A16AlbComEst[0] )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbComEst");
               GXutil.writeLogRaw("Old: ",Z16AlbComEst);
               GXutil.writeLogRaw("Current: ",T01UB2_A16AlbComEst[0]);
            }
            if ( Z19AlbComLiC != T01UB2_A19AlbComLiC[0] )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbComLiC");
               GXutil.writeLogRaw("Old: ",Z19AlbComLiC);
               GXutil.writeLogRaw("Current: ",T01UB2_A19AlbComLiC[0]);
            }
            if ( Z1783AlbComEso != T01UB2_A1783AlbComEso[0] )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbComEso");
               GXutil.writeLogRaw("Old: ",Z1783AlbComEso);
               GXutil.writeLogRaw("Current: ",T01UB2_A1783AlbComEso[0]);
            }
            if ( GXutil.strcmp(Z3095AlcDivTCod, T01UB2_A3095AlcDivTCod[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlcDivTCod");
               GXutil.writeLogRaw("Old: ",Z3095AlcDivTCod);
               GXutil.writeLogRaw("Current: ",T01UB2_A3095AlcDivTCod[0]);
            }
            if ( !( GXutil.dateCompare(Z4829AlbComHor, T01UB2_A4829AlbComHor[0]) ) )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbComHor");
               GXutil.writeLogRaw("Old: ",Z4829AlbComHor);
               GXutil.writeLogRaw("Current: ",T01UB2_A4829AlbComHor[0]);
            }
            if ( GXutil.strcmp(Z4830AlbComMat, T01UB2_A4830AlbComMat[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbComMat");
               GXutil.writeLogRaw("Old: ",Z4830AlbComMat);
               GXutil.writeLogRaw("Current: ",T01UB2_A4830AlbComMat[0]);
            }
            if ( !( GXutil.dateCompare(Z10013AlbComFs, T01UB2_A10013AlbComFs[0]) ) )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbComFs");
               GXutil.writeLogRaw("Old: ",Z10013AlbComFs);
               GXutil.writeLogRaw("Current: ",T01UB2_A10013AlbComFs[0]);
            }
            if ( GXutil.strcmp(Z10014AlbComFd, T01UB2_A10014AlbComFd[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbComFd");
               GXutil.writeLogRaw("Old: ",Z10014AlbComFd);
               GXutil.writeLogRaw("Current: ",T01UB2_A10014AlbComFd[0]);
            }
            if ( GXutil.strcmp(Z10015AlbComFdD, T01UB2_A10015AlbComFdD[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbComFdD");
               GXutil.writeLogRaw("Old: ",Z10015AlbComFdD);
               GXutil.writeLogRaw("Current: ",T01UB2_A10015AlbComFdD[0]);
            }
            if ( GXutil.strcmp(Z3094AlbCSec, T01UB2_A3094AlbCSec[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbCSec");
               GXutil.writeLogRaw("Old: ",Z3094AlbCSec);
               GXutil.writeLogRaw("Current: ",T01UB2_A3094AlbCSec[0]);
            }
            if ( GXutil.strcmp(Z10738AlbComSt, T01UB2_A10738AlbComSt[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbComSt");
               GXutil.writeLogRaw("Old: ",Z10738AlbComSt);
               GXutil.writeLogRaw("Current: ",T01UB2_A10738AlbComSt[0]);
            }
            if ( Z10739AlbComEAT != T01UB2_A10739AlbComEAT[0] )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbComEAT");
               GXutil.writeLogRaw("Old: ",Z10739AlbComEAT);
               GXutil.writeLogRaw("Current: ",T01UB2_A10739AlbComEAT[0]);
            }
            if ( GXutil.strcmp(Z10740AlbComID, T01UB2_A10740AlbComID[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbComID");
               GXutil.writeLogRaw("Old: ",Z10740AlbComID);
               GXutil.writeLogRaw("Current: ",T01UB2_A10740AlbComID[0]);
            }
            if ( GXutil.strcmp(Z10764AlbComAT, T01UB2_A10764AlbComAT[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbComAT");
               GXutil.writeLogRaw("Old: ",Z10764AlbComAT);
               GXutil.writeLogRaw("Current: ",T01UB2_A10764AlbComAT[0]);
            }
            if ( GXutil.strcmp(Z5143AlcIvaCod, T01UB2_A5143AlcIvaCod[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlcIvaCod");
               GXutil.writeLogRaw("Old: ",Z5143AlcIvaCod);
               GXutil.writeLogRaw("Current: ",T01UB2_A5143AlcIvaCod[0]);
            }
            if ( GXutil.strcmp(Z11719AlbCTrNm, T01UB2_A11719AlbCTrNm[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbCTrNm");
               GXutil.writeLogRaw("Old: ",Z11719AlbCTrNm);
               GXutil.writeLogRaw("Current: ",T01UB2_A11719AlbCTrNm[0]);
            }
            if ( GXutil.strcmp(Z11720AlbCTrDm, T01UB2_A11720AlbCTrDm[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbCTrDm");
               GXutil.writeLogRaw("Old: ",Z11720AlbCTrDm);
               GXutil.writeLogRaw("Current: ",T01UB2_A11720AlbCTrDm[0]);
            }
            if ( GXutil.strcmp(Z11721AlbCTrNc, T01UB2_A11721AlbCTrNc[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbCTrNc");
               GXutil.writeLogRaw("Old: ",Z11721AlbCTrNc);
               GXutil.writeLogRaw("Current: ",T01UB2_A11721AlbCTrNc[0]);
            }
            if ( GXutil.strcmp(Z14248AlbComATCU, T01UB2_A14248AlbComATCU[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbComATCU");
               GXutil.writeLogRaw("Old: ",Z14248AlbComATCU);
               GXutil.writeLogRaw("Current: ",T01UB2_A14248AlbComATCU[0]);
            }
            if ( GXutil.strcmp(Z14249AlbComSerA, T01UB2_A14249AlbComSerA[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbComSerA");
               GXutil.writeLogRaw("Old: ",Z14249AlbComSerA);
               GXutil.writeLogRaw("Current: ",T01UB2_A14249AlbComSerA[0]);
            }
            if ( GXutil.strcmp(Z14250AlbComTipA, T01UB2_A14250AlbComTipA[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlbComTipA");
               GXutil.writeLogRaw("Old: ",Z14250AlbComTipA);
               GXutil.writeLogRaw("Current: ",T01UB2_A14250AlbComTipA[0]);
            }
            if ( Z252CliCod != T01UB2_A252CliCod[0] )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01UB2_A252CliCod[0]);
            }
            if ( Z840TrnCod != T01UB2_A840TrnCod[0] )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01UB2_A840TrnCod[0]);
            }
            if ( Z3111AlcDivCod != T01UB2_A3111AlcDivCod[0] )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_cabecera:[seudo value changed for attri]"+"AlcDivCod");
               GXutil.writeLogRaw("Old: ",Z3111AlcDivCod);
               GXutil.writeLogRaw("Current: ",T01UB2_A3111AlcDivCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALCOM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UB1( )
   {
      beforeValidate1UB1( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UB1( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UB1( 0) ;
         checkOptimisticConcurrency1UB1( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UB1( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UB1( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UB22 */
                  pr_default.execute(17, new Object[] {Integer.valueOf(A14AlbComCod), Byte.valueOf(A5142AlcDomEnv), A17AlbComFch, A22AlbComPri, Byte.valueOf(A16AlbComEst), Short.valueOf(A19AlbComLiC), Byte.valueOf(A1783AlbComEso), A3095AlcDivTCod, A4829AlbComHor, A4830AlbComMat, A10013AlbComFs, A10014AlbComFd, A10015AlbComFdD, A3094AlbCSec, A10738AlbComSt, Byte.valueOf(A10739AlbComEAT), A10740AlbComID, A10764AlbComAT, A5143AlcIvaCod, A11719AlbCTrNm, A11720AlbCTrDm, A11721AlbCTrNc, A14248AlbComATCU, A14249AlbComSerA, A14250AlbComTipA, A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Byte.valueOf(A3111AlcDivCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
                  if ( (pr_default.getStatus(17) == 1) )
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
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1UB0( ) ;
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
            load1UB1( ) ;
         }
         endLevel1UB1( ) ;
      }
      closeExtendedTableCursors1UB1( ) ;
   }

   public void update1UB1( )
   {
      beforeValidate1UB1( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UB1( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UB1( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UB1( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UB1( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UB23 */
                  pr_default.execute(18, new Object[] {Byte.valueOf(A5142AlcDomEnv), A17AlbComFch, A22AlbComPri, Byte.valueOf(A16AlbComEst), Short.valueOf(A19AlbComLiC), Byte.valueOf(A1783AlbComEso), A3095AlcDivTCod, A4829AlbComHor, A4830AlbComMat, A10013AlbComFs, A10014AlbComFd, A10015AlbComFdD, A3094AlbCSec, A10738AlbComSt, Byte.valueOf(A10739AlbComEAT), A10740AlbComID, A10764AlbComAT, A5143AlcIvaCod, A11719AlbCTrNm, A11720AlbCTrDm, A11721AlbCTrNc, A14248AlbComATCU, A14249AlbComSerA, A14250AlbComTipA, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Byte.valueOf(A3111AlcDivCod), A396EmprCod, Integer.valueOf(A14AlbComCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALCOM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UB1( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
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
         endLevel1UB1( ) ;
      }
      closeExtendedTableCursors1UB1( ) ;
   }

   public void deferredUpdate1UB1( )
   {
   }

   public void delete( )
   {
      beforeValidate1UB1( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UB1( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UB1( ) ;
         afterConfirm1UB1( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UB1( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UB24 */
               pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
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
      sMode1 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UB1( ) ;
      Gx_mode = sMode1 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UB1( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A14374AlbCom4dig = GXutil.substring( A10014AlbComFd, 1, 1) + GXutil.substring( A10014AlbComFd, 11, 1) + GXutil.substring( A10014AlbComFd, 21, 1) + GXutil.substring( A10014AlbComFd, 31, 1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14374AlbCom4dig", A14374AlbCom4dig);
         /* Using cursor T01UB25 */
         pr_default.execute(20, new Object[] {Byte.valueOf(A3111AlcDivCod)});
         A3112AlcDivAbr = T01UB25_A3112AlcDivAbr[0] ;
         n3112AlcDivAbr = T01UB25_n3112AlcDivAbr[0] ;
         pr_default.close(20);
         /* Using cursor T01UB26 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01UB26_A279CliNom[0] ;
         A3091CliDivTra = T01UB26_A3091CliDivTra[0] ;
         n3091CliDivTra = T01UB26_n3091CliDivTra[0] ;
         A3140CliDivCod = T01UB26_A3140CliDivCod[0] ;
         n3140CliDivCod = T01UB26_n3140CliDivCod[0] ;
         pr_default.close(21);
         /* Using cursor T01UB27 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01UB27_A841TrnNom[0] ;
         n841TrnNom = T01UB27_n841TrnNom[0] ;
         pr_default.close(22);
         /* Using cursor T01UB28 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A5142AlcDomEnv)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            A13739findDomEnv = T01UB28_A13739findDomEnv[0] ;
            n13739findDomEnv = T01UB28_n13739findDomEnv[0] ;
         }
         else
         {
            A13739findDomEnv = (byte)(0) ;
            n13739findDomEnv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
         }
         pr_default.close(23);
         /* Using cursor T01UB30 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            A18AlbComImp = T01UB30_A18AlbComImp[0] ;
            n18AlbComImp = T01UB30_n18AlbComImp[0] ;
         }
         else
         {
            A18AlbComImp = DecimalUtil.doubleToDec(0) ;
            n18AlbComImp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
         }
         pr_default.close(24);
         GXt_date14 = A14400AlbComFhAN ;
         GXv_date15[0] = GXt_date14 ;
         new app.documentotransportecomercial.documentotransportecomercial_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A14AlbComCod, A22AlbComPri, GXv_date15) ;
         documentotransportecomercial_cabecera_impl.this.GXt_date14 = GXv_date15[0] ;
         A14400AlbComFhAN = GXt_date14 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14400AlbComFhAN", localUtil.format(A14400AlbComFhAN, "99/99/99"));
         GXt_int12 = A14254AlbLineasL ;
         GXv_int13[0] = GXt_int12 ;
         new app.haydatoslalcom(remoteHandle, context).execute( A396EmprCod, A14AlbComCod, GXv_int13) ;
         documentotransportecomercial_cabecera_impl.this.GXt_int12 = GXv_int13[0] ;
         A14254AlbLineasL = (byte)(GXt_int12) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14254AlbLineasL", GXutil.str( A14254AlbLineasL, 1, 0));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01UB31 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSALC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01UB32 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
      }
   }

   public void endLevel1UB1( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UB1( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "documentotransportecomercial.documentotransportecomercial_cabecera");
         if ( AnyError == 0 )
         {
            confirmValues1UB0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "documentotransportecomercial.documentotransportecomercial_cabecera");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UB1( )
   {
      /* Scan By routine */
      /* Using cursor T01UB33 */
      pr_default.execute(27);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A396EmprCod = T01UB33_A396EmprCod[0] ;
         A14AlbComCod = T01UB33_A14AlbComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UB1( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A396EmprCod = T01UB33_A396EmprCod[0] ;
         A14AlbComCod = T01UB33_A14AlbComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
   }

   public void scanEnd1UB1( )
   {
      pr_default.close(27);
   }

   public void afterConfirm1UB1( )
   {
      /* After Confirm Rules */
      if ( (0==A252CliCod) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente NO valido", ""), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1UB1( )
   {
      /* Before Insert Rules */
      GXv_char4[0] = A14248AlbComATCU ;
      GXv_char3[0] = A14249AlbComSerA ;
      GXv_char2[0] = A14250AlbComTipA ;
      new app.patcud(remoteHandle, context).execute( AV7EmprCod, AV17ContCod, GXv_char4, GXv_char3, GXv_char2, GXutil.trim( Gx_mode)+"/"+GXutil.trim( AV31Pgmname)+"."+GXutil.trim( AV32Pgmdesc)) ;
      documentotransportecomercial_cabecera_impl.this.A14248AlbComATCU = GXv_char4[0] ;
      documentotransportecomercial_cabecera_impl.this.A14249AlbComSerA = GXv_char3[0] ;
      documentotransportecomercial_cabecera_impl.this.A14250AlbComTipA = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14248AlbComATCU", A14248AlbComATCU);
      httpContext.ajax_rsp_assign_attri("", false, "A14249AlbComSerA", A14249AlbComSerA);
      httpContext.ajax_rsp_assign_attri("", false, "A14250AlbComTipA", A14250AlbComTipA);
      if ( (GXutil.strcmp("", A14248AlbComATCU)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta codigo ATCUD", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (0==A840TrnCod) )
      {
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      if ( (0==A14AlbComCod) && true /* Level */ )
      {
         GXv_int9[0] = A14AlbComCod ;
         new app.pnumdoc(remoteHandle, context).execute( AV7EmprCod, AV17ContCod, GXv_int9) ;
         documentotransportecomercial_cabecera_impl.this.A14AlbComCod = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
   }

   public void beforeUpdate1UB1( )
   {
      /* Before Update Rules */
      GXv_char4[0] = A14248AlbComATCU ;
      GXv_char3[0] = A14249AlbComSerA ;
      GXv_char2[0] = A14250AlbComTipA ;
      new app.patcud(remoteHandle, context).execute( AV7EmprCod, AV17ContCod, GXv_char4, GXv_char3, GXv_char2, GXutil.trim( Gx_mode)+"/"+GXutil.trim( AV31Pgmname)+"."+GXutil.trim( AV32Pgmdesc)) ;
      documentotransportecomercial_cabecera_impl.this.A14248AlbComATCU = GXv_char4[0] ;
      documentotransportecomercial_cabecera_impl.this.A14249AlbComSerA = GXv_char3[0] ;
      documentotransportecomercial_cabecera_impl.this.A14250AlbComTipA = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14248AlbComATCU", A14248AlbComATCU);
      httpContext.ajax_rsp_assign_attri("", false, "A14249AlbComSerA", A14249AlbComSerA);
      httpContext.ajax_rsp_assign_attri("", false, "A14250AlbComTipA", A14250AlbComTipA);
      if ( (GXutil.strcmp("", A14248AlbComATCU)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta codigo ATCUD", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (0==A840TrnCod) )
      {
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
   }

   public void beforeDelete1UB1( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UB1( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UB1( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UB1( )
   {
      edtAlbComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
      edtAlbComFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFch_Enabled), 5, 0), true);
      edtAlbComFhAN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFhAN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFhAN_Enabled), 5, 0), true);
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
      cmbavAlbcompri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcompri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbcompri.getEnabled(), 5, 0), true);
      edtavContcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavContcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavContcod_Enabled), 5, 0), true);
      edtAlbLineasL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLineasL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLineasL_Enabled), 5, 0), true);
      cmbAlbComEAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComEAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbComEAT.getEnabled(), 5, 0), true);
      edtAlbComID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComID_Enabled), 5, 0), true);
      cmbAlbComAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbComAT.getEnabled(), 5, 0), true);
      edtAlbComFs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFs_Enabled), 5, 0), true);
      edtAlbComATCU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComATCU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComATCU_Enabled), 5, 0), true);
      edtAlbCom4dig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCom4dig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCom4dig_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboclicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Enabled), 5, 0), true);
      edtavComboalcdomenv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboalcdomenv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboalcdomenv_Enabled), 5, 0), true);
      edtavCombotrncod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Enabled), 5, 0), true);
      edtAlbComPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComPri_Enabled), 5, 0), true);
      edtAlbComEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComEst_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1UB1( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16AlbComPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17ContCod, "@!"))));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1UB0( )
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransportecomercial.documentotransportecomercial_cabecera", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbComCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV16AlbComPri)),GXutil.URLEncode(GXutil.rtrim(AV17ContCod))}, new String[] {"Gx_mode","EmprCod","AlbComCod","AlbComPri","ContCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16AlbComPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17ContCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteComercial_Cabecera");
      forbiddenHiddens.add("AlbComEAT", localUtil.format( DecimalUtil.doubleToDec(A10739AlbComEAT), "9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV31Pgmname, "")));
      forbiddenHiddens.add("AlbComPri", GXutil.rtrim( localUtil.format( A22AlbComPri, "9")));
      forbiddenHiddens.add("AlbComEst", localUtil.format( DecimalUtil.doubleToDec(A16AlbComEst), "9"));
      forbiddenHiddens.add("AlbComLiC", localUtil.format( DecimalUtil.doubleToDec(A19AlbComLiC), "ZZ9"));
      forbiddenHiddens.add("AlbComEso", localUtil.format( DecimalUtil.doubleToDec(A1783AlbComEso), "9"));
      forbiddenHiddens.add("AlcDivTCod", GXutil.rtrim( localUtil.format( A3095AlcDivTCod, "")));
      forbiddenHiddens.add("AlbComHor", localUtil.format( A4829AlbComHor, "99/99/99 99:99:99"));
      forbiddenHiddens.add("AlbComFs", localUtil.format( A10013AlbComFs, "99/99/99 99:99:99"));
      forbiddenHiddens.add("AlbComFd", GXutil.rtrim( localUtil.format( A10014AlbComFd, "")));
      forbiddenHiddens.add("AlbComFdD", GXutil.rtrim( localUtil.format( A10015AlbComFdD, "")));
      forbiddenHiddens.add("AlbCSec", GXutil.rtrim( localUtil.format( A3094AlbCSec, "")));
      forbiddenHiddens.add("AlbComSt", GXutil.rtrim( localUtil.format( A10738AlbComSt, "")));
      forbiddenHiddens.add("AlbComID", GXutil.rtrim( localUtil.format( A10740AlbComID, "")));
      forbiddenHiddens.add("AlbComAT", GXutil.rtrim( localUtil.format( A10764AlbComAT, "")));
      forbiddenHiddens.add("AlcIvaCod", GXutil.rtrim( localUtil.format( A5143AlcIvaCod, "@!")));
      forbiddenHiddens.add("AlbCTrNm", GXutil.rtrim( localUtil.format( A11719AlbCTrNm, "")));
      forbiddenHiddens.add("AlbCTrDm", GXutil.rtrim( localUtil.format( A11720AlbCTrDm, "")));
      forbiddenHiddens.add("AlbCTrNc", GXutil.rtrim( localUtil.format( A11721AlbCTrNc, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransportecomercial\\documentotransportecomercial_cabecera:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14AlbComCod", GXutil.ltrim( localUtil.ntoc( Z14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5142AlcDomEnv", GXutil.ltrim( localUtil.ntoc( Z5142AlcDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z17AlbComFch", localUtil.dtoc( Z17AlbComFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z22AlbComPri", GXutil.rtrim( Z22AlbComPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z16AlbComEst", GXutil.ltrim( localUtil.ntoc( Z16AlbComEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z19AlbComLiC", GXutil.ltrim( localUtil.ntoc( Z19AlbComLiC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1783AlbComEso", GXutil.ltrim( localUtil.ntoc( Z1783AlbComEso, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3095AlcDivTCod", GXutil.rtrim( Z3095AlcDivTCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4829AlbComHor", localUtil.ttoc( Z4829AlbComHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4830AlbComMat", GXutil.rtrim( Z4830AlbComMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10013AlbComFs", localUtil.ttoc( Z10013AlbComFs, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10014AlbComFd", GXutil.rtrim( Z10014AlbComFd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10015AlbComFdD", GXutil.rtrim( Z10015AlbComFdD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3094AlbCSec", GXutil.rtrim( Z3094AlbCSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10738AlbComSt", GXutil.rtrim( Z10738AlbComSt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10739AlbComEAT", GXutil.ltrim( localUtil.ntoc( Z10739AlbComEAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10740AlbComID", GXutil.rtrim( Z10740AlbComID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10764AlbComAT", GXutil.rtrim( Z10764AlbComAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5143AlcIvaCod", GXutil.rtrim( Z5143AlcIvaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11719AlbCTrNm", GXutil.rtrim( Z11719AlbCTrNm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11720AlbCTrDm", GXutil.rtrim( Z11720AlbCTrDm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11721AlbCTrNc", GXutil.rtrim( Z11721AlbCTrNc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14248AlbComATCU", GXutil.rtrim( Z14248AlbComATCU));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14249AlbComSerA", GXutil.rtrim( Z14249AlbComSerA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14250AlbComTipA", GXutil.rtrim( Z14250AlbComTipA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3111AlcDivCod", GXutil.ltrim( localUtil.ntoc( Z3111AlcDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N3111AlcDivCod", GXutil.ltrim( localUtil.ntoc( A3111AlcDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD_DATA", AV18CliCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD_DATA", AV18CliCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV25DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV25DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vALCDOMENV_DATA", AV24AlcDomEnv_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vALCDOMENV_DATA", AV24AlcDomEnv_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCOD_DATA", AV28TrnCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCOD_DATA", AV28TrnCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMFD", GXutil.rtrim( A10014AlbComFd));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCOMCOD", GXutil.ltrim( localUtil.ntoc( AV8AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbComCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CLICOD", GXutil.ltrim( localUtil.ntoc( AV12Insert_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_ALCDIVCOD", GXutil.ltrim( localUtil.ntoc( AV13Insert_AlcDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALCDIVCOD", GXutil.ltrim( localUtil.ntoc( A3111AlcDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRNCOD", GXutil.ltrim( localUtil.ntoc( AV14Insert_TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMST", GXutil.rtrim( A10738AlbComSt));
      app.GxWebStd.gx_hidden_field( httpContext, "ALCDIVTCOD", GXutil.rtrim( A3095AlcDivTCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMDESC", GXutil.rtrim( AV32Pgmdesc));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMSERA", GXutil.rtrim( A14249AlbComSerA));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMTIPA", GXutil.rtrim( A14250AlbComTipA));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMLIC", GXutil.ltrim( localUtil.ntoc( A19AlbComLiC, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMESO", GXutil.ltrim( localUtil.ntoc( A1783AlbComEso, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMFDD", GXutil.rtrim( A10015AlbComFdD));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCSEC", GXutil.rtrim( A3094AlbCSec));
      app.GxWebStd.gx_hidden_field( httpContext, "ALCIVACOD", GXutil.rtrim( A5143AlcIvaCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCTRNM", GXutil.rtrim( A11719AlbCTrNm));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCTRDM", GXutil.rtrim( A11720AlbCTrDm));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCTRNC", GXutil.rtrim( A11721AlbCTrNc));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIDIVTRA", GXutil.rtrim( A3091CliDivTra));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIDIVCOD", GXutil.ltrim( localUtil.ntoc( A3140CliDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNNOM", GXutil.rtrim( A841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ALCDIVABR", GXutil.rtrim( A3112AlcDivAbr));
      app.GxWebStd.gx_hidden_field( httpContext, "FINDDOMENV", GXutil.ltrim( localUtil.ntoc( A13739findDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMIMP", GXutil.ltrim( localUtil.ntoc( A18AlbComImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Objectcall", GXutil.rtrim( Combo_clicod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Cls", GXutil.rtrim( Combo_clicod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_set", GXutil.rtrim( Combo_clicod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Emptyitem", GXutil.booltostr( Combo_clicod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALCDOMENV_Objectcall", GXutil.rtrim( Combo_alcdomenv_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALCDOMENV_Cls", GXutil.rtrim( Combo_alcdomenv_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALCDOMENV_Selectedvalue_set", GXutil.rtrim( Combo_alcdomenv_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALCDOMENV_Enabled", GXutil.booltostr( Combo_alcdomenv_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ALCDOMENV_Emptyitemtext", GXutil.rtrim( Combo_alcdomenv_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Objectcall", GXutil.rtrim( Combo_trncod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Cls", GXutil.rtrim( Combo_trncod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Selectedvalue_set", GXutil.rtrim( Combo_trncod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Enabled", GXutil.booltostr( Combo_trncod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Emptyitemtext", GXutil.rtrim( Combo_trncod_Emptyitemtext));
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
      return formatLink("app.documentotransportecomercial.documentotransportecomercial_cabecera", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbComCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV16AlbComPri)),GXutil.URLEncode(GXutil.rtrim(AV17ContCod))}, new String[] {"Gx_mode","EmprCod","AlbComCod","AlbComPri","ContCod"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteComercial.DocumentoTransporteComercial_Cabecera" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Documento Transporte Comercial (Cabecera)", "") ;
   }

   public void initializeNonKey1UB1( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A5142AlcDomEnv = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5142AlcDomEnv", GXutil.str( A5142AlcDomEnv, 1, 0));
      A14374AlbCom4dig = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14374AlbCom4dig", A14374AlbCom4dig);
      A13739findDomEnv = (byte)(0) ;
      n13739findDomEnv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13739findDomEnv", GXutil.str( A13739findDomEnv, 1, 0));
      A14254AlbLineasL = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14254AlbLineasL", GXutil.str( A14254AlbLineasL, 1, 0));
      A14400AlbComFhAN = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A14400AlbComFhAN", localUtil.format(A14400AlbComFhAN, "99/99/99"));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A3091CliDivTra = "" ;
      n3091CliDivTra = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3091CliDivTra", A3091CliDivTra);
      A3140CliDivCod = (byte)(0) ;
      n3140CliDivCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3140CliDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3140CliDivCod), 2, 0));
      A18AlbComImp = DecimalUtil.ZERO ;
      n18AlbComImp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrimstr( A18AlbComImp, 13, 2));
      A16AlbComEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A16AlbComEst", GXutil.str( A16AlbComEst, 1, 0));
      A19AlbComLiC = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A19AlbComLiC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A19AlbComLiC), 3, 0));
      A1783AlbComEso = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1783AlbComEso", GXutil.str( A1783AlbComEso, 1, 0));
      A3112AlcDivAbr = "" ;
      n3112AlcDivAbr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3112AlcDivAbr", A3112AlcDivAbr);
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A4829AlbComHor", localUtil.ttoc( A4829AlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A4830AlbComMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4830AlbComMat", A4830AlbComMat);
      A10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A10013AlbComFs", localUtil.ttoc( A10013AlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10014AlbComFd = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10014AlbComFd", A10014AlbComFd);
      A10015AlbComFdD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10015AlbComFdD", A10015AlbComFdD);
      A3094AlbCSec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3094AlbCSec", A3094AlbCSec);
      A5143AlcIvaCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5143AlcIvaCod", A5143AlcIvaCod);
      A11719AlbCTrNm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11719AlbCTrNm", A11719AlbCTrNm);
      A11720AlbCTrDm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11720AlbCTrDm", A11720AlbCTrDm);
      A11721AlbCTrNc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11721AlbCTrNc", A11721AlbCTrNc);
      A14248AlbComATCU = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14248AlbComATCU", A14248AlbComATCU);
      A14249AlbComSerA = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14249AlbComSerA", A14249AlbComSerA);
      A14250AlbComTipA = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14250AlbComTipA", A14250AlbComTipA);
      A3111AlcDivCod = (byte)(2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3111AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3111AlcDivCod), 2, 0));
      A17AlbComFch = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
      A22AlbComPri = AV16AlbComPri ;
      httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
      A3095AlcDivTCod = httpContext.getMessage( "E", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A3095AlcDivTCod", A3095AlcDivTCod);
      A10738AlbComSt = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10738AlbComSt", A10738AlbComSt);
      A10739AlbComEAT = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
      A10740AlbComID = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10740AlbComID", A10740AlbComID);
      A10764AlbComAT = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10764AlbComAT", A10764AlbComAT);
      Z5142AlcDomEnv = (byte)(0) ;
      Z17AlbComFch = GXutil.nullDate() ;
      Z22AlbComPri = "" ;
      Z16AlbComEst = (byte)(0) ;
      Z19AlbComLiC = (short)(0) ;
      Z1783AlbComEso = (byte)(0) ;
      Z3095AlcDivTCod = "" ;
      Z4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      Z4830AlbComMat = "" ;
      Z10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      Z10014AlbComFd = "" ;
      Z10015AlbComFdD = "" ;
      Z3094AlbCSec = "" ;
      Z10738AlbComSt = "" ;
      Z10739AlbComEAT = (byte)(0) ;
      Z10740AlbComID = "" ;
      Z10764AlbComAT = "" ;
      Z5143AlcIvaCod = "" ;
      Z11719AlbCTrNm = "" ;
      Z11720AlbCTrDm = "" ;
      Z11721AlbCTrNc = "" ;
      Z14248AlbComATCU = "" ;
      Z14249AlbComSerA = "" ;
      Z14250AlbComTipA = "" ;
      Z252CliCod = 0 ;
      Z840TrnCod = (short)(0) ;
      Z3111AlcDivCod = (byte)(0) ;
   }

   public void initAll1UB1( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A14AlbComCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      initializeNonKey1UB1( ) ;
   }

   public void standaloneModalInsert( )
   {
      A3111AlcDivCod = i3111AlcDivCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A3111AlcDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3111AlcDivCod), 2, 0));
      A10739AlbComEAT = i10739AlbComEAT ;
      httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
      A10738AlbComSt = i10738AlbComSt ;
      httpContext.ajax_rsp_assign_attri("", false, "A10738AlbComSt", A10738AlbComSt);
      A10740AlbComID = i10740AlbComID ;
      httpContext.ajax_rsp_assign_attri("", false, "A10740AlbComID", A10740AlbComID);
      A10764AlbComAT = i10764AlbComAT ;
      httpContext.ajax_rsp_assign_attri("", false, "A10764AlbComAT", A10764AlbComAT);
      A17AlbComFch = i17AlbComFch ;
      httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
      A3095AlcDivTCod = i3095AlcDivTCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A3095AlcDivTCod", A3095AlcDivTCod);
      A22AlbComPri = i22AlbComPri ;
      httpContext.ajax_rsp_assign_attri("", false, "A22AlbComPri", A22AlbComPri);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415122230", true, true);
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
      httpContext.AddJavascriptSource("documentotransportecomercial/documentotransportecomercial_cabecera.js", "?202682415122231", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtAlbComCod_Internalname = "ALBCOMCOD" ;
      edtAlbComFch_Internalname = "ALBCOMFCH" ;
      edtAlbComFhAN_Internalname = "ALBCOMFHAN" ;
      lblTextblockclicod_Internalname = "TEXTBLOCKCLICOD" ;
      Combo_clicod_Internalname = "COMBO_CLICOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      divTablesplittedclicod_Internalname = "TABLESPLITTEDCLICOD" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      lblTextblockalcdomenv_Internalname = "TEXTBLOCKALCDOMENV" ;
      Combo_alcdomenv_Internalname = "COMBO_ALCDOMENV" ;
      edtAlcDomEnv_Internalname = "ALCDOMENV" ;
      divTablesplittedalcdomenv_Internalname = "TABLESPLITTEDALCDOMENV" ;
      lblTextblocktrncod_Internalname = "TEXTBLOCKTRNCOD" ;
      Combo_trncod_Internalname = "COMBO_TRNCOD" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      divTablesplittedtrncod_Internalname = "TABLESPLITTEDTRNCOD" ;
      edtAlbComMat_Internalname = "ALBCOMMAT" ;
      edtAlbComHor_Internalname = "ALBCOMHOR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      cmbavAlbcompri.setInternalname( "vALBCOMPRI" );
      edtavContcod_Internalname = "vCONTCOD" ;
      edtAlbLineasL_Internalname = "ALBLINEASL" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      cmbAlbComEAT.setInternalname( "ALBCOMEAT" );
      edtAlbComID_Internalname = "ALBCOMID" ;
      cmbAlbComAT.setInternalname( "ALBCOMAT" );
      edtAlbComFs_Internalname = "ALBCOMFS" ;
      edtAlbComATCU_Internalname = "ALBCOMATCU" ;
      edtAlbCom4dig_Internalname = "ALBCOM4DIG" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboclicod_Internalname = "vCOMBOCLICOD" ;
      divSectionattribute_clicod_Internalname = "SECTIONATTRIBUTE_CLICOD" ;
      edtavComboalcdomenv_Internalname = "vCOMBOALCDOMENV" ;
      divSectionattribute_alcdomenv_Internalname = "SECTIONATTRIBUTE_ALCDOMENV" ;
      edtavCombotrncod_Internalname = "vCOMBOTRNCOD" ;
      divSectionattribute_trncod_Internalname = "SECTIONATTRIBUTE_TRNCOD" ;
      edtAlbComPri_Internalname = "ALBCOMPRI" ;
      edtAlbComEst_Internalname = "ALBCOMEST" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
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
      Form.setCaption( httpContext.getMessage( "Documento Transporte Comercial (Cabecera)", "") );
      edtAlbComEst_Jsonclick = "" ;
      edtAlbComEst_Enabled = 0 ;
      edtAlbComEst_Visible = 1 ;
      edtAlbComPri_Jsonclick = "" ;
      edtAlbComPri_Enabled = 0 ;
      edtAlbComPri_Visible = 1 ;
      edtavCombotrncod_Jsonclick = "" ;
      edtavCombotrncod_Enabled = 0 ;
      edtavCombotrncod_Visible = 1 ;
      edtavComboalcdomenv_Jsonclick = "" ;
      edtavComboalcdomenv_Enabled = 0 ;
      edtavComboalcdomenv_Visible = 1 ;
      edtavComboclicod_Jsonclick = "" ;
      edtavComboclicod_Enabled = 0 ;
      edtavComboclicod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbCom4dig_Jsonclick = "" ;
      edtAlbCom4dig_Enabled = 0 ;
      edtAlbComATCU_Jsonclick = "" ;
      edtAlbComATCU_Enabled = 0 ;
      edtAlbComFs_Jsonclick = "" ;
      edtAlbComFs_Enabled = 0 ;
      cmbAlbComAT.setJsonclick( "" );
      cmbAlbComAT.setEnabled( 0 );
      edtAlbComID_Jsonclick = "" ;
      edtAlbComID_Enabled = 0 ;
      cmbAlbComEAT.setJsonclick( "" );
      cmbAlbComEAT.setEnabled( 0 );
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "AT", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      edtAlbLineasL_Jsonclick = "" ;
      edtAlbLineasL_Enabled = 0 ;
      edtavContcod_Jsonclick = "" ;
      edtavContcod_Enabled = 0 ;
      cmbavAlbcompri.setJsonclick( "" );
      cmbavAlbcompri.setEnabled( 0 );
      edtAlbComHor_Jsonclick = "" ;
      edtAlbComHor_Enabled = 0 ;
      edtAlbComMat_Jsonclick = "" ;
      edtAlbComMat_Enabled = 1 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 1 ;
      edtTrnCod_Visible = 1 ;
      Combo_trncod_Emptyitemtext = "" ;
      Combo_trncod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_trncod_Enabled = GXutil.toBoolean( -1) ;
      edtAlcDomEnv_Jsonclick = "" ;
      edtAlcDomEnv_Enabled = 1 ;
      edtAlcDomEnv_Visible = 1 ;
      Combo_alcdomenv_Emptyitemtext = "" ;
      Combo_alcdomenv_Cls = "ExtendedCombo AttributeFL" ;
      Combo_alcdomenv_Caption = "" ;
      Combo_alcdomenv_Enabled = GXutil.toBoolean( -1) ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      edtCliCod_Visible = 1 ;
      Combo_clicod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_clicod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod_Enabled = GXutil.toBoolean( -1) ;
      edtAlbComFhAN_Jsonclick = "" ;
      edtAlbComFhAN_Enabled = 0 ;
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

   public void gx3asaalbcomfhan1UB1( String A396EmprCod ,
                                     int A14AlbComCod ,
                                     String A22AlbComPri )
   {
      GXt_date14 = A14400AlbComFhAN ;
      GXv_date15[0] = GXt_date14 ;
      new app.documentotransportecomercial.documentotransportecomercial_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A14AlbComCod, A22AlbComPri, GXv_date15) ;
      documentotransportecomercial_cabecera_impl.this.GXt_date14 = GXv_date15[0] ;
      A14400AlbComFhAN = GXt_date14 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14400AlbComFhAN", localUtil.format(A14400AlbComFhAN, "99/99/99"));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A14400AlbComFhAN, "99/99/99"))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asaalblineasl1UB1( String A396EmprCod ,
                                     int A14AlbComCod )
   {
      GXt_int12 = A14254AlbLineasL ;
      GXv_int13[0] = GXt_int12 ;
      new app.haydatoslalcom(remoteHandle, context).execute( A396EmprCod, A14AlbComCod, GXv_int13) ;
      documentotransportecomercial_cabecera_impl.this.GXt_int12 = GXv_int13[0] ;
      A14254AlbLineasL = (byte)(GXt_int12) ;
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

   public void xc_39_1UB1( String AV7EmprCod ,
                           String AV17ContCod ,
                           int A14AlbComCod ,
                           String A22AlbComPri )
   {
      if ( (0==A14AlbComCod) && true /* Level */ )
      {
         GXv_int9[0] = A14AlbComCod ;
         new app.pnumdoc(remoteHandle, context).execute( AV7EmprCod, AV17ContCod, GXv_int9) ;
         A14AlbComCod = GXv_int9[0] ;
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

   public void xc_42_1UB1( )
   {
      GXv_char4[0] = A14248AlbComATCU ;
      GXv_char3[0] = A14249AlbComSerA ;
      GXv_char2[0] = A14250AlbComTipA ;
      new app.patcud(remoteHandle, context).execute( AV7EmprCod, AV17ContCod, GXv_char4, GXv_char3, GXv_char2, GXutil.trim( Gx_mode)+"/"+GXutil.trim( AV31Pgmname)+"."+GXutil.trim( AV32Pgmdesc)) ;
      A14248AlbComATCU = GXv_char4[0] ;
      A14249AlbComSerA = GXv_char3[0] ;
      A14250AlbComTipA = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14248AlbComATCU", A14248AlbComATCU);
      httpContext.ajax_rsp_assign_attri("", false, "A14249AlbComSerA", A14249AlbComSerA);
      httpContext.ajax_rsp_assign_attri("", false, "A14250AlbComTipA", A14250AlbComTipA);
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
      cmbavAlbcompri.setName( "vALBCOMPRI" );
      cmbavAlbcompri.setWebtags( "" );
      cmbavAlbcompri.addItem("1", httpContext.getMessage( "Guia Remessa", ""), (short)(0));
      cmbavAlbcompri.addItem("0", httpContext.getMessage( "Guia Transporte", ""), (short)(0));
      if ( cmbavAlbcompri.getItemCount() > 0 )
      {
         AV16AlbComPri = cmbavAlbcompri.getValidValue(AV16AlbComPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16AlbComPri", AV16AlbComPri);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16AlbComPri, "9"))));
      }
      cmbAlbComEAT.setName( "ALBCOMEAT" );
      cmbAlbComEAT.setWebtags( "" );
      cmbAlbComEAT.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbAlbComEAT.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbAlbComEAT.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A10739AlbComEAT) )
         {
            A10739AlbComEAT = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10739AlbComEAT", GXutil.str( A10739AlbComEAT, 1, 0));
         }
      }
      cmbAlbComAT.setName( "ALBCOMAT" );
      cmbAlbComAT.setWebtags( "" );
      cmbAlbComAT.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      cmbAlbComAT.addItem("A", httpContext.getMessage( "Automatica", ""), (short)(0));
      if ( cmbAlbComAT.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A10764AlbComAT)==0) )
         {
            A10764AlbComAT = " " ;
            httpContext.ajax_rsp_assign_attri("", false, "A10764AlbComAT", A10764AlbComAT);
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
      /* Using cursor T01UB30 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         A18AlbComImp = T01UB30_A18AlbComImp[0] ;
         n18AlbComImp = T01UB30_n18AlbComImp[0] ;
      }
      else
      {
         A18AlbComImp = DecimalUtil.doubleToDec(0) ;
         n18AlbComImp = false ;
      }
      pr_default.close(24);
      GXt_int12 = A14254AlbLineasL ;
      GXv_int13[0] = GXt_int12 ;
      new app.haydatoslalcom(remoteHandle, context).execute( A396EmprCod, A14AlbComCod, GXv_int13) ;
      documentotransportecomercial_cabecera_impl.this.GXt_int12 = GXv_int13[0] ;
      A14254AlbLineasL = (byte)(GXt_int12) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A18AlbComImp", GXutil.ltrim( localUtil.ntoc( A18AlbComImp, (byte)(13), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14254AlbLineasL", GXutil.ltrim( localUtil.ntoc( A14254AlbLineasL, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Clicod( )
   {
      n3091CliDivTra = false ;
      n3140CliDivCod = false ;
      /* Using cursor T01UB26 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01UB26_A279CliNom[0] ;
      A3091CliDivTra = T01UB26_A3091CliDivTra[0] ;
      n3091CliDivTra = T01UB26_n3091CliDivTra[0] ;
      A3140CliDivCod = T01UB26_A3140CliDivCod[0] ;
      n3140CliDivCod = T01UB26_n3140CliDivCod[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3091CliDivTra", GXutil.rtrim( A3091CliDivTra));
      httpContext.ajax_rsp_assign_attri("", false, "A3140CliDivCod", GXutil.ltrim( localUtil.ntoc( A3140CliDivCod, (byte)(2), (byte)(0), ".", "")));
   }

   public void valid_Alcdomenv( )
   {
      n13739findDomEnv = false ;
      /* Using cursor T01UB28 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A5142AlcDomEnv)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         A13739findDomEnv = T01UB28_A13739findDomEnv[0] ;
         n13739findDomEnv = T01UB28_n13739findDomEnv[0] ;
      }
      else
      {
         A13739findDomEnv = (byte)(0) ;
         n13739findDomEnv = false ;
      }
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13739findDomEnv", GXutil.ltrim( localUtil.ntoc( A13739findDomEnv, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      n841TrnNom = false ;
      /* Using cursor T01UB27 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A841TrnNom = T01UB27_A841TrnNom[0] ;
      n841TrnNom = T01UB27_n841TrnNom[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
   }

   public void valid_Albcompri( )
   {
      GXt_date14 = A14400AlbComFhAN ;
      GXv_date15[0] = GXt_date14 ;
      new app.documentotransportecomercial.documentotransportecomercial_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A14AlbComCod, A22AlbComPri, GXv_date15) ;
      documentotransportecomercial_cabecera_impl.this.GXt_date14 = GXv_date15[0] ;
      A14400AlbComFhAN = GXt_date14 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14400AlbComFhAN", localUtil.format(A14400AlbComFhAN, "99/99/99"));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'cmbavAlbcompri'},{av:'AV16AlbComPri',fld:'vALBCOMPRI',pic:'9',hsh:true},{av:'AV17ContCod',fld:'vCONTCOD',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'cmbavAlbcompri'},{av:'AV16AlbComPri',fld:'vALBCOMPRI',pic:'9',hsh:true},{av:'AV17ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'cmbAlbComEAT'},{av:'A10739AlbComEAT',fld:'ALBCOMEAT',pic:'9'},{av:'AV31Pgmname',fld:'vPGMNAME',pic:''},{av:'A22AlbComPri',fld:'ALBCOMPRI',pic:'9'},{av:'A16AlbComEst',fld:'ALBCOMEST',pic:'9'},{av:'A19AlbComLiC',fld:'ALBCOMLIC',pic:'ZZ9'},{av:'A1783AlbComEso',fld:'ALBCOMESO',pic:'9'},{av:'A3095AlcDivTCod',fld:'ALCDIVTCOD',pic:''},{av:'A4829AlbComHor',fld:'ALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'A10013AlbComFs',fld:'ALBCOMFS',pic:'99/99/99 99:99:99'},{av:'A10014AlbComFd',fld:'ALBCOMFD',pic:''},{av:'A10015AlbComFdD',fld:'ALBCOMFDD',pic:''},{av:'A3094AlbCSec',fld:'ALBCSEC',pic:''},{av:'A10738AlbComSt',fld:'ALBCOMST',pic:''},{av:'A10740AlbComID',fld:'ALBCOMID',pic:''},{av:'cmbAlbComAT'},{av:'A10764AlbComAT',fld:'ALBCOMAT',pic:''},{av:'A5143AlcIvaCod',fld:'ALCIVACOD',pic:'@!'},{av:'A11719AlbCTrNm',fld:'ALBCTRNM',pic:''},{av:'A11720AlbCTrDm',fld:'ALBCTRDM',pic:''},{av:'A11721AlbCTrNc',fld:'ALBCTRNC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e131UB2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A17AlbComFch',fld:'ALBCOMFCH',pic:''},{av:'A4829AlbComHor',fld:'ALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'A22AlbComPri',fld:'ALBCOMPRI',pic:'9'},{av:'cmbAlbComEAT'},{av:'A10739AlbComEAT',fld:'ALBCOMEAT',pic:'9'},{av:'A10740AlbComID',fld:'ALBCOMID',pic:''},{av:'A16AlbComEst',fld:'ALBCOMEST',pic:'9'}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("COMBO_CLICOD.ONOPTIONCLICKED","{handler:'e121UB2',iparms:[{av:'Combo_clicod_Selectedvalue_get',ctrl:'COMBO_CLICOD',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_CLICOD.ONOPTIONCLICKED",",oparms:[{av:'AV20ComboCliCod',fld:'vCOMBOCLICOD',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_ALBCOMCOD","{handler:'valid_Albcomcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A18AlbComImp',fld:'ALBCOMIMP',pic:'ZZZZZZZZZ9.99'},{av:'A14254AlbLineasL',fld:'ALBLINEASL',pic:'9'}]");
      setEventMetadata("VALID_ALBCOMCOD",",oparms:[{av:'A18AlbComImp',fld:'ALBCOMIMP',pic:'ZZZZZZZZZ9.99'},{av:'A14254AlbLineasL',fld:'ALBLINEASL',pic:'9'}]}");
      setEventMetadata("VALID_ALBCOMFCH","{handler:'valid_Albcomfch',iparms:[]");
      setEventMetadata("VALID_ALBCOMFCH",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A3091CliDivTra',fld:'CLIDIVTRA',pic:''},{av:'A3140CliDivCod',fld:'CLIDIVCOD',pic:'Z9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A3091CliDivTra',fld:'CLIDIVTRA',pic:''},{av:'A3140CliDivCod',fld:'CLIDIVCOD',pic:'Z9'}]}");
      setEventMetadata("VALID_ALCDOMENV","{handler:'valid_Alcdomenv',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A5142AlcDomEnv',fld:'ALCDOMENV',pic:'9'},{av:'A13739findDomEnv',fld:'FINDDOMENV',pic:'9'}]");
      setEventMetadata("VALID_ALCDOMENV",",oparms:[{av:'A13739findDomEnv',fld:'FINDDOMENV',pic:'9'}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A841TrnNom',fld:'TRNNOM',pic:''}]}");
      setEventMetadata("VALIDV_ALBCOMPRI","{handler:'validv_Albcompri',iparms:[]");
      setEventMetadata("VALIDV_ALBCOMPRI",",oparms:[]}");
      setEventMetadata("VALIDV_CONTCOD","{handler:'validv_Contcod',iparms:[]");
      setEventMetadata("VALIDV_CONTCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMATCU","{handler:'valid_Albcomatcu',iparms:[]");
      setEventMetadata("VALID_ALBCOMATCU",",oparms:[]}");
      setEventMetadata("VALIDV_PGMNAME","{handler:'validv_Pgmname',iparms:[]");
      setEventMetadata("VALIDV_PGMNAME",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOCLICOD","{handler:'validv_Comboclicod',iparms:[]");
      setEventMetadata("VALIDV_COMBOCLICOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOALCDOMENV","{handler:'validv_Comboalcdomenv',iparms:[]");
      setEventMetadata("VALIDV_COMBOALCDOMENV",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOTRNCOD","{handler:'validv_Combotrncod',iparms:[]");
      setEventMetadata("VALIDV_COMBOTRNCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMPRI","{handler:'valid_Albcompri',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A22AlbComPri',fld:'ALBCOMPRI',pic:'9'},{av:'A14400AlbComFhAN',fld:'ALBCOMFHAN',pic:''}]");
      setEventMetadata("VALID_ALBCOMPRI",",oparms:[{av:'A14400AlbComFhAN',fld:'ALBCOMFHAN',pic:''}]}");
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
      pr_default.close(21);
      pr_default.close(22);
      pr_default.close(20);
      pr_default.close(23);
      pr_default.close(24);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV16AlbComPri = "" ;
      wcpOAV17ContCod = "" ;
      Z396EmprCod = "" ;
      Z17AlbComFch = GXutil.nullDate() ;
      Z22AlbComPri = "" ;
      Z3095AlcDivTCod = "" ;
      Z4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      Z4830AlbComMat = "" ;
      Z10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      Z10014AlbComFd = "" ;
      Z10015AlbComFdD = "" ;
      Z3094AlbCSec = "" ;
      Z10738AlbComSt = "" ;
      Z10740AlbComID = "" ;
      Z10764AlbComAT = "" ;
      Z5143AlcIvaCod = "" ;
      Z11719AlbCTrNm = "" ;
      Z11720AlbCTrDm = "" ;
      Z11721AlbCTrNc = "" ;
      Z14248AlbComATCU = "" ;
      Z14249AlbComSerA = "" ;
      Z14250AlbComTipA = "" ;
      Combo_trncod_Selectedvalue_get = "" ;
      Combo_alcdomenv_Selectedvalue_get = "" ;
      Combo_clicod_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7EmprCod = "" ;
      AV17ContCod = "" ;
      A22AlbComPri = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV16AlbComPri = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A10764AlbComAT = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A14400AlbComFhAN = GXutil.nullDate() ;
      lblTextblockclicod_Jsonclick = "" ;
      ucCombo_clicod = new com.genexus.webpanels.GXUserControl();
      Combo_clicod_Caption = "" ;
      AV18CliCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblockalcdomenv_Jsonclick = "" ;
      ucCombo_alcdomenv = new com.genexus.webpanels.GXUserControl();
      AV25DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV24AlcDomEnv_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblocktrncod_Jsonclick = "" ;
      ucCombo_trncod = new com.genexus.webpanels.GXUserControl();
      Combo_trncod_Caption = "" ;
      AV28TrnCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A4830AlbComMat = "" ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      A10740AlbComID = "" ;
      A10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      A14248AlbComATCU = "" ;
      A14374AlbCom4dig = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV31Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A3095AlcDivTCod = "" ;
      A10014AlbComFd = "" ;
      A10015AlbComFdD = "" ;
      A3094AlbCSec = "" ;
      A10738AlbComSt = "" ;
      A5143AlcIvaCod = "" ;
      A11719AlbCTrNm = "" ;
      A11720AlbCTrDm = "" ;
      A11721AlbCTrNc = "" ;
      A14249AlbComSerA = "" ;
      A14250AlbComTipA = "" ;
      AV32Pgmdesc = "" ;
      A407EmprNom = "" ;
      A279CliNom = "" ;
      A3091CliDivTra = "" ;
      A841TrnNom = "" ;
      A3112AlcDivAbr = "" ;
      A18AlbComImp = DecimalUtil.ZERO ;
      Combo_clicod_Objectcall = "" ;
      Combo_clicod_Class = "" ;
      Combo_clicod_Icontype = "" ;
      Combo_clicod_Icon = "" ;
      Combo_clicod_Tooltip = "" ;
      Combo_clicod_Selectedvalue_set = "" ;
      Combo_clicod_Selectedtext_set = "" ;
      Combo_clicod_Selectedtext_get = "" ;
      Combo_clicod_Gamoauthtoken = "" ;
      Combo_clicod_Ddointernalname = "" ;
      Combo_clicod_Titlecontrolalign = "" ;
      Combo_clicod_Dropdownoptionstype = "" ;
      Combo_clicod_Titlecontrolidtoreplace = "" ;
      Combo_clicod_Datalisttype = "" ;
      Combo_clicod_Datalistfixedvalues = "" ;
      Combo_clicod_Datalistproc = "" ;
      Combo_clicod_Datalistprocparametersprefix = "" ;
      Combo_clicod_Remoteservicesparameters = "" ;
      Combo_clicod_Htmltemplate = "" ;
      Combo_clicod_Multiplevaluestype = "" ;
      Combo_clicod_Loadingdata = "" ;
      Combo_clicod_Noresultsfound = "" ;
      Combo_clicod_Emptyitemtext = "" ;
      Combo_clicod_Onlyselectedvalues = "" ;
      Combo_clicod_Selectalltext = "" ;
      Combo_clicod_Multiplevaluesseparator = "" ;
      Combo_clicod_Addnewoptiontext = "" ;
      Combo_alcdomenv_Objectcall = "" ;
      Combo_alcdomenv_Class = "" ;
      Combo_alcdomenv_Icontype = "" ;
      Combo_alcdomenv_Icon = "" ;
      Combo_alcdomenv_Tooltip = "" ;
      Combo_alcdomenv_Selectedvalue_set = "" ;
      Combo_alcdomenv_Selectedtext_set = "" ;
      Combo_alcdomenv_Selectedtext_get = "" ;
      Combo_alcdomenv_Gamoauthtoken = "" ;
      Combo_alcdomenv_Ddointernalname = "" ;
      Combo_alcdomenv_Titlecontrolalign = "" ;
      Combo_alcdomenv_Dropdownoptionstype = "" ;
      Combo_alcdomenv_Titlecontrolidtoreplace = "" ;
      Combo_alcdomenv_Datalisttype = "" ;
      Combo_alcdomenv_Datalistfixedvalues = "" ;
      Combo_alcdomenv_Datalistproc = "" ;
      Combo_alcdomenv_Datalistprocparametersprefix = "" ;
      Combo_alcdomenv_Remoteservicesparameters = "" ;
      Combo_alcdomenv_Htmltemplate = "" ;
      Combo_alcdomenv_Multiplevaluestype = "" ;
      Combo_alcdomenv_Loadingdata = "" ;
      Combo_alcdomenv_Noresultsfound = "" ;
      Combo_alcdomenv_Onlyselectedvalues = "" ;
      Combo_alcdomenv_Selectalltext = "" ;
      Combo_alcdomenv_Multiplevaluesseparator = "" ;
      Combo_alcdomenv_Addnewoptiontext = "" ;
      Combo_trncod_Objectcall = "" ;
      Combo_trncod_Class = "" ;
      Combo_trncod_Icontype = "" ;
      Combo_trncod_Icon = "" ;
      Combo_trncod_Tooltip = "" ;
      Combo_trncod_Selectedvalue_set = "" ;
      Combo_trncod_Selectedtext_set = "" ;
      Combo_trncod_Selectedtext_get = "" ;
      Combo_trncod_Gamoauthtoken = "" ;
      Combo_trncod_Ddointernalname = "" ;
      Combo_trncod_Titlecontrolalign = "" ;
      Combo_trncod_Dropdownoptionstype = "" ;
      Combo_trncod_Titlecontrolidtoreplace = "" ;
      Combo_trncod_Datalisttype = "" ;
      Combo_trncod_Datalistfixedvalues = "" ;
      Combo_trncod_Datalistproc = "" ;
      Combo_trncod_Datalistprocparametersprefix = "" ;
      Combo_trncod_Remoteservicesparameters = "" ;
      Combo_trncod_Htmltemplate = "" ;
      Combo_trncod_Multiplevaluestype = "" ;
      Combo_trncod_Loadingdata = "" ;
      Combo_trncod_Noresultsfound = "" ;
      Combo_trncod_Onlyselectedvalues = "" ;
      Combo_trncod_Selectalltext = "" ;
      Combo_trncod_Multiplevaluesseparator = "" ;
      Combo_trncod_Addnewoptiontext = "" ;
      Dvpanel_unnamedtable4_Objectcall = "" ;
      Dvpanel_unnamedtable4_Class = "" ;
      Dvpanel_unnamedtable4_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV21Station = "" ;
      GXt_char1 = "" ;
      AV22EmprNom = "" ;
      AV23UsurCod = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV15TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV19ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item11 = new GXBaseCollection[1] ;
      Z3112AlcDivAbr = "" ;
      Z407EmprNom = "" ;
      Z18AlbComImp = DecimalUtil.ZERO ;
      Z279CliNom = "" ;
      Z3091CliDivTra = "" ;
      Z841TrnNom = "" ;
      T01UB4_A407EmprNom = new String[] {""} ;
      T01UB4_n407EmprNom = new boolean[] {false} ;
      T01UB10_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UB10_n18AlbComImp = new boolean[] {false} ;
      T01UB5_A279CliNom = new String[] {""} ;
      T01UB5_A3091CliDivTra = new String[] {""} ;
      T01UB5_n3091CliDivTra = new boolean[] {false} ;
      T01UB5_A3140CliDivCod = new byte[1] ;
      T01UB5_n3140CliDivCod = new boolean[] {false} ;
      T01UB8_A13739findDomEnv = new byte[1] ;
      T01UB8_n13739findDomEnv = new boolean[] {false} ;
      T01UB6_A841TrnNom = new String[] {""} ;
      T01UB6_n841TrnNom = new boolean[] {false} ;
      T01UB7_A3112AlcDivAbr = new String[] {""} ;
      T01UB7_n3112AlcDivAbr = new boolean[] {false} ;
      T01UB12_A266CliEnvLin = new byte[1] ;
      T01UB12_A14AlbComCod = new int[1] ;
      T01UB12_A5142AlcDomEnv = new byte[1] ;
      T01UB12_A407EmprNom = new String[] {""} ;
      T01UB12_n407EmprNom = new boolean[] {false} ;
      T01UB12_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01UB12_A22AlbComPri = new String[] {""} ;
      T01UB12_A279CliNom = new String[] {""} ;
      T01UB12_A3091CliDivTra = new String[] {""} ;
      T01UB12_n3091CliDivTra = new boolean[] {false} ;
      T01UB12_A16AlbComEst = new byte[1] ;
      T01UB12_A19AlbComLiC = new short[1] ;
      T01UB12_A1783AlbComEso = new byte[1] ;
      T01UB12_A3095AlcDivTCod = new String[] {""} ;
      T01UB12_A3112AlcDivAbr = new String[] {""} ;
      T01UB12_n3112AlcDivAbr = new boolean[] {false} ;
      T01UB12_A841TrnNom = new String[] {""} ;
      T01UB12_n841TrnNom = new boolean[] {false} ;
      T01UB12_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01UB12_A4830AlbComMat = new String[] {""} ;
      T01UB12_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      T01UB12_A10014AlbComFd = new String[] {""} ;
      T01UB12_A10015AlbComFdD = new String[] {""} ;
      T01UB12_A3094AlbCSec = new String[] {""} ;
      T01UB12_A10738AlbComSt = new String[] {""} ;
      T01UB12_A10739AlbComEAT = new byte[1] ;
      T01UB12_A10740AlbComID = new String[] {""} ;
      T01UB12_A10764AlbComAT = new String[] {""} ;
      T01UB12_A5143AlcIvaCod = new String[] {""} ;
      T01UB12_A11719AlbCTrNm = new String[] {""} ;
      T01UB12_A11720AlbCTrDm = new String[] {""} ;
      T01UB12_A11721AlbCTrNc = new String[] {""} ;
      T01UB12_A14248AlbComATCU = new String[] {""} ;
      T01UB12_A14249AlbComSerA = new String[] {""} ;
      T01UB12_A14250AlbComTipA = new String[] {""} ;
      T01UB12_A396EmprCod = new String[] {""} ;
      T01UB12_A252CliCod = new int[1] ;
      T01UB12_A840TrnCod = new short[1] ;
      T01UB12_n840TrnCod = new boolean[] {false} ;
      T01UB12_A3111AlcDivCod = new byte[1] ;
      T01UB12_A3140CliDivCod = new byte[1] ;
      T01UB12_n3140CliDivCod = new boolean[] {false} ;
      T01UB12_A13739findDomEnv = new byte[1] ;
      T01UB12_n13739findDomEnv = new boolean[] {false} ;
      T01UB12_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UB12_n18AlbComImp = new boolean[] {false} ;
      T01UB13_A3112AlcDivAbr = new String[] {""} ;
      T01UB13_n3112AlcDivAbr = new boolean[] {false} ;
      T01UB14_A279CliNom = new String[] {""} ;
      T01UB14_A3091CliDivTra = new String[] {""} ;
      T01UB14_n3091CliDivTra = new boolean[] {false} ;
      T01UB14_A3140CliDivCod = new byte[1] ;
      T01UB14_n3140CliDivCod = new boolean[] {false} ;
      T01UB15_A841TrnNom = new String[] {""} ;
      T01UB15_n841TrnNom = new boolean[] {false} ;
      T01UB16_A13739findDomEnv = new byte[1] ;
      T01UB16_n13739findDomEnv = new boolean[] {false} ;
      T01UB18_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UB18_n18AlbComImp = new boolean[] {false} ;
      T01UB19_A396EmprCod = new String[] {""} ;
      T01UB19_A14AlbComCod = new int[1] ;
      T01UB3_A14AlbComCod = new int[1] ;
      T01UB3_A5142AlcDomEnv = new byte[1] ;
      T01UB3_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01UB3_A22AlbComPri = new String[] {""} ;
      T01UB3_A16AlbComEst = new byte[1] ;
      T01UB3_A19AlbComLiC = new short[1] ;
      T01UB3_A1783AlbComEso = new byte[1] ;
      T01UB3_A3095AlcDivTCod = new String[] {""} ;
      T01UB3_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01UB3_A4830AlbComMat = new String[] {""} ;
      T01UB3_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      T01UB3_A10014AlbComFd = new String[] {""} ;
      T01UB3_A10015AlbComFdD = new String[] {""} ;
      T01UB3_A3094AlbCSec = new String[] {""} ;
      T01UB3_A10738AlbComSt = new String[] {""} ;
      T01UB3_A10739AlbComEAT = new byte[1] ;
      T01UB3_A10740AlbComID = new String[] {""} ;
      T01UB3_A10764AlbComAT = new String[] {""} ;
      T01UB3_A5143AlcIvaCod = new String[] {""} ;
      T01UB3_A11719AlbCTrNm = new String[] {""} ;
      T01UB3_A11720AlbCTrDm = new String[] {""} ;
      T01UB3_A11721AlbCTrNc = new String[] {""} ;
      T01UB3_A14248AlbComATCU = new String[] {""} ;
      T01UB3_A14249AlbComSerA = new String[] {""} ;
      T01UB3_A14250AlbComTipA = new String[] {""} ;
      T01UB3_A396EmprCod = new String[] {""} ;
      T01UB3_A252CliCod = new int[1] ;
      T01UB3_A840TrnCod = new short[1] ;
      T01UB3_n840TrnCod = new boolean[] {false} ;
      T01UB3_A3111AlcDivCod = new byte[1] ;
      T01UB20_A396EmprCod = new String[] {""} ;
      T01UB20_A14AlbComCod = new int[1] ;
      T01UB21_A396EmprCod = new String[] {""} ;
      T01UB21_A14AlbComCod = new int[1] ;
      T01UB2_A14AlbComCod = new int[1] ;
      T01UB2_A5142AlcDomEnv = new byte[1] ;
      T01UB2_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01UB2_A22AlbComPri = new String[] {""} ;
      T01UB2_A16AlbComEst = new byte[1] ;
      T01UB2_A19AlbComLiC = new short[1] ;
      T01UB2_A1783AlbComEso = new byte[1] ;
      T01UB2_A3095AlcDivTCod = new String[] {""} ;
      T01UB2_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      T01UB2_A4830AlbComMat = new String[] {""} ;
      T01UB2_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      T01UB2_A10014AlbComFd = new String[] {""} ;
      T01UB2_A10015AlbComFdD = new String[] {""} ;
      T01UB2_A3094AlbCSec = new String[] {""} ;
      T01UB2_A10738AlbComSt = new String[] {""} ;
      T01UB2_A10739AlbComEAT = new byte[1] ;
      T01UB2_A10740AlbComID = new String[] {""} ;
      T01UB2_A10764AlbComAT = new String[] {""} ;
      T01UB2_A5143AlcIvaCod = new String[] {""} ;
      T01UB2_A11719AlbCTrNm = new String[] {""} ;
      T01UB2_A11720AlbCTrDm = new String[] {""} ;
      T01UB2_A11721AlbCTrNc = new String[] {""} ;
      T01UB2_A14248AlbComATCU = new String[] {""} ;
      T01UB2_A14249AlbComSerA = new String[] {""} ;
      T01UB2_A14250AlbComTipA = new String[] {""} ;
      T01UB2_A396EmprCod = new String[] {""} ;
      T01UB2_A252CliCod = new int[1] ;
      T01UB2_A840TrnCod = new short[1] ;
      T01UB2_n840TrnCod = new boolean[] {false} ;
      T01UB2_A3111AlcDivCod = new byte[1] ;
      T01UB25_A3112AlcDivAbr = new String[] {""} ;
      T01UB25_n3112AlcDivAbr = new boolean[] {false} ;
      T01UB26_A279CliNom = new String[] {""} ;
      T01UB26_A3091CliDivTra = new String[] {""} ;
      T01UB26_n3091CliDivTra = new boolean[] {false} ;
      T01UB26_A3140CliDivCod = new byte[1] ;
      T01UB26_n3140CliDivCod = new boolean[] {false} ;
      T01UB27_A841TrnNom = new String[] {""} ;
      T01UB27_n841TrnNom = new boolean[] {false} ;
      T01UB28_A13739findDomEnv = new byte[1] ;
      T01UB28_n13739findDomEnv = new boolean[] {false} ;
      T01UB30_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UB30_n18AlbComImp = new boolean[] {false} ;
      T01UB31_A396EmprCod = new String[] {""} ;
      T01UB31_A14AlbComCod = new int[1] ;
      T01UB31_A2386AlbCObsLin = new byte[1] ;
      T01UB32_A396EmprCod = new String[] {""} ;
      T01UB32_A14AlbComCod = new int[1] ;
      T01UB32_A20AlbComLin = new short[1] ;
      T01UB33_A396EmprCod = new String[] {""} ;
      T01UB33_A14AlbComCod = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i10738AlbComSt = "" ;
      i10740AlbComID = "" ;
      i10764AlbComAT = "" ;
      i17AlbComFch = GXutil.nullDate() ;
      i3095AlcDivTCod = "" ;
      i22AlbComPri = "" ;
      GXv_int9 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int13 = new short[1] ;
      GXt_date14 = GXutil.nullDate() ;
      GXv_date15 = new java.util.Date[1] ;
      Z14400AlbComFhAN = GXutil.nullDate() ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_cabecera__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_cabecera__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_cabecera__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_cabecera__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_cabecera__default(),
         new Object[] {
             new Object[] {
            T01UB2_A14AlbComCod, T01UB2_A5142AlcDomEnv, T01UB2_A17AlbComFch, T01UB2_A22AlbComPri, T01UB2_A16AlbComEst, T01UB2_A19AlbComLiC, T01UB2_A1783AlbComEso, T01UB2_A3095AlcDivTCod, T01UB2_A4829AlbComHor, T01UB2_A4830AlbComMat,
            T01UB2_A10013AlbComFs, T01UB2_A10014AlbComFd, T01UB2_A10015AlbComFdD, T01UB2_A3094AlbCSec, T01UB2_A10738AlbComSt, T01UB2_A10739AlbComEAT, T01UB2_A10740AlbComID, T01UB2_A10764AlbComAT, T01UB2_A5143AlcIvaCod, T01UB2_A11719AlbCTrNm,
            T01UB2_A11720AlbCTrDm, T01UB2_A11721AlbCTrNc, T01UB2_A14248AlbComATCU, T01UB2_A14249AlbComSerA, T01UB2_A14250AlbComTipA, T01UB2_A396EmprCod, T01UB2_A252CliCod, T01UB2_A840TrnCod, T01UB2_n840TrnCod, T01UB2_A3111AlcDivCod
            }
            , new Object[] {
            T01UB3_A14AlbComCod, T01UB3_A5142AlcDomEnv, T01UB3_A17AlbComFch, T01UB3_A22AlbComPri, T01UB3_A16AlbComEst, T01UB3_A19AlbComLiC, T01UB3_A1783AlbComEso, T01UB3_A3095AlcDivTCod, T01UB3_A4829AlbComHor, T01UB3_A4830AlbComMat,
            T01UB3_A10013AlbComFs, T01UB3_A10014AlbComFd, T01UB3_A10015AlbComFdD, T01UB3_A3094AlbCSec, T01UB3_A10738AlbComSt, T01UB3_A10739AlbComEAT, T01UB3_A10740AlbComID, T01UB3_A10764AlbComAT, T01UB3_A5143AlcIvaCod, T01UB3_A11719AlbCTrNm,
            T01UB3_A11720AlbCTrDm, T01UB3_A11721AlbCTrNc, T01UB3_A14248AlbComATCU, T01UB3_A14249AlbComSerA, T01UB3_A14250AlbComTipA, T01UB3_A396EmprCod, T01UB3_A252CliCod, T01UB3_A840TrnCod, T01UB3_n840TrnCod, T01UB3_A3111AlcDivCod
            }
            , new Object[] {
            T01UB4_A407EmprNom, T01UB4_n407EmprNom
            }
            , new Object[] {
            T01UB5_A279CliNom, T01UB5_A3091CliDivTra, T01UB5_n3091CliDivTra, T01UB5_A3140CliDivCod, T01UB5_n3140CliDivCod
            }
            , new Object[] {
            T01UB6_A841TrnNom, T01UB6_n841TrnNom
            }
            , new Object[] {
            T01UB7_A3112AlcDivAbr, T01UB7_n3112AlcDivAbr
            }
            , new Object[] {
            T01UB8_A13739findDomEnv, T01UB8_n13739findDomEnv
            }
            , new Object[] {
            T01UB10_A18AlbComImp, T01UB10_n18AlbComImp
            }
            , new Object[] {
            T01UB12_A266CliEnvLin, T01UB12_A14AlbComCod, T01UB12_A5142AlcDomEnv, T01UB12_A407EmprNom, T01UB12_n407EmprNom, T01UB12_A17AlbComFch, T01UB12_A22AlbComPri, T01UB12_A279CliNom, T01UB12_A3091CliDivTra, T01UB12_n3091CliDivTra,
            T01UB12_A16AlbComEst, T01UB12_A19AlbComLiC, T01UB12_A1783AlbComEso, T01UB12_A3095AlcDivTCod, T01UB12_A3112AlcDivAbr, T01UB12_n3112AlcDivAbr, T01UB12_A841TrnNom, T01UB12_n841TrnNom, T01UB12_A4829AlbComHor, T01UB12_A4830AlbComMat,
            T01UB12_A10013AlbComFs, T01UB12_A10014AlbComFd, T01UB12_A10015AlbComFdD, T01UB12_A3094AlbCSec, T01UB12_A10738AlbComSt, T01UB12_A10739AlbComEAT, T01UB12_A10740AlbComID, T01UB12_A10764AlbComAT, T01UB12_A5143AlcIvaCod, T01UB12_A11719AlbCTrNm,
            T01UB12_A11720AlbCTrDm, T01UB12_A11721AlbCTrNc, T01UB12_A14248AlbComATCU, T01UB12_A14249AlbComSerA, T01UB12_A14250AlbComTipA, T01UB12_A396EmprCod, T01UB12_A252CliCod, T01UB12_A840TrnCod, T01UB12_n840TrnCod, T01UB12_A3111AlcDivCod,
            T01UB12_A3140CliDivCod, T01UB12_n3140CliDivCod, T01UB12_A13739findDomEnv, T01UB12_n13739findDomEnv, T01UB12_A18AlbComImp, T01UB12_n18AlbComImp
            }
            , new Object[] {
            T01UB13_A3112AlcDivAbr, T01UB13_n3112AlcDivAbr
            }
            , new Object[] {
            T01UB14_A279CliNom, T01UB14_A3091CliDivTra, T01UB14_n3091CliDivTra, T01UB14_A3140CliDivCod, T01UB14_n3140CliDivCod
            }
            , new Object[] {
            T01UB15_A841TrnNom, T01UB15_n841TrnNom
            }
            , new Object[] {
            T01UB16_A13739findDomEnv, T01UB16_n13739findDomEnv
            }
            , new Object[] {
            T01UB18_A18AlbComImp, T01UB18_n18AlbComImp
            }
            , new Object[] {
            T01UB19_A396EmprCod, T01UB19_A14AlbComCod
            }
            , new Object[] {
            T01UB20_A396EmprCod, T01UB20_A14AlbComCod
            }
            , new Object[] {
            T01UB21_A396EmprCod, T01UB21_A14AlbComCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UB25_A3112AlcDivAbr, T01UB25_n3112AlcDivAbr
            }
            , new Object[] {
            T01UB26_A279CliNom, T01UB26_A3091CliDivTra, T01UB26_n3091CliDivTra, T01UB26_A3140CliDivCod, T01UB26_n3140CliDivCod
            }
            , new Object[] {
            T01UB27_A841TrnNom, T01UB27_n841TrnNom
            }
            , new Object[] {
            T01UB28_A13739findDomEnv, T01UB28_n13739findDomEnv
            }
            , new Object[] {
            T01UB30_A18AlbComImp, T01UB30_n18AlbComImp
            }
            , new Object[] {
            T01UB31_A396EmprCod, T01UB31_A14AlbComCod, T01UB31_A2386AlbCObsLin
            }
            , new Object[] {
            T01UB32_A396EmprCod, T01UB32_A14AlbComCod, T01UB32_A20AlbComLin
            }
            , new Object[] {
            T01UB33_A396EmprCod, T01UB33_A14AlbComCod
            }
         }
      );
      AV32Pgmdesc = httpContext.getMessage( "Documento Transporte Comercial (Cabecera)", "") ;
      AV31Pgmname = "DocumentoTransporteComercial.DocumentoTransporteComercial_Cabecera" ;
      Z22AlbComPri = "" ;
      i22AlbComPri = "" ;
      A22AlbComPri = "" ;
      Z3095AlcDivTCod = httpContext.getMessage( "E", "") ;
      A3095AlcDivTCod = httpContext.getMessage( "E", "") ;
      i3095AlcDivTCod = httpContext.getMessage( "E", "") ;
      Z3111AlcDivCod = (byte)(2) ;
      N3111AlcDivCod = (byte)(2) ;
      i3111AlcDivCod = (byte)(2) ;
      A3111AlcDivCod = (byte)(2) ;
      Z17AlbComFch = GXutil.today( ) ;
      A17AlbComFch = GXutil.today( ) ;
      i17AlbComFch = GXutil.today( ) ;
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
   }

   private byte Z5142AlcDomEnv ;
   private byte Z16AlbComEst ;
   private byte Z1783AlbComEso ;
   private byte Z10739AlbComEAT ;
   private byte Z3111AlcDivCod ;
   private byte N3111AlcDivCod ;
   private byte GxWebError ;
   private byte A3111AlcDivCod ;
   private byte A5142AlcDomEnv ;
   private byte nKeyPressed ;
   private byte A10739AlbComEAT ;
   private byte A14254AlbLineasL ;
   private byte AV26ComboAlcDomEnv ;
   private byte A16AlbComEst ;
   private byte A1783AlbComEso ;
   private byte AV13Insert_AlcDivCod ;
   private byte Gx_BScreen ;
   private byte A3140CliDivCod ;
   private byte A13739findDomEnv ;
   private byte Z3140CliDivCod ;
   private byte Z13739findDomEnv ;
   private byte gxajaxcallmode ;
   private byte i3111AlcDivCod ;
   private byte i10739AlbComEAT ;
   private byte Z14254AlbLineasL ;
   private short Z19AlbComLiC ;
   private short Z840TrnCod ;
   private short N840TrnCod ;
   private short A840TrnCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV29ComboTrnCod ;
   private short A19AlbComLiC ;
   private short AV14Insert_TrnCod ;
   private short RcdFound1 ;
   private short nIsDirty_1 ;
   private short GXt_int12 ;
   private short GXv_int13[] ;
   private int wcpOAV8AlbComCod ;
   private int Z14AlbComCod ;
   private int Z252CliCod ;
   private int N252CliCod ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int AV8AlbComCod ;
   private int trnEnded ;
   private int edtAlbComCod_Enabled ;
   private int edtAlbComFch_Enabled ;
   private int edtAlbComFhAN_Enabled ;
   private int edtCliCod_Visible ;
   private int edtCliCod_Enabled ;
   private int edtAlcDomEnv_Enabled ;
   private int edtAlcDomEnv_Visible ;
   private int edtTrnCod_Visible ;
   private int edtTrnCod_Enabled ;
   private int edtAlbComMat_Enabled ;
   private int edtAlbComHor_Enabled ;
   private int edtavContcod_Enabled ;
   private int edtAlbLineasL_Enabled ;
   private int edtAlbComID_Enabled ;
   private int edtAlbComFs_Enabled ;
   private int edtAlbComATCU_Enabled ;
   private int edtAlbCom4dig_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV20ComboCliCod ;
   private int edtavComboclicod_Enabled ;
   private int edtavComboclicod_Visible ;
   private int edtavComboalcdomenv_Enabled ;
   private int edtavComboalcdomenv_Visible ;
   private int edtavCombotrncod_Enabled ;
   private int edtavCombotrncod_Visible ;
   private int edtAlbComPri_Visible ;
   private int edtAlbComPri_Enabled ;
   private int edtAlbComEst_Enabled ;
   private int edtAlbComEst_Visible ;
   private int AV12Insert_CliCod ;
   private int Combo_clicod_Datalistupdateminimumcharacters ;
   private int Combo_clicod_Gxcontroltype ;
   private int Combo_alcdomenv_Datalistupdateminimumcharacters ;
   private int Combo_alcdomenv_Gxcontroltype ;
   private int Combo_trncod_Datalistupdateminimumcharacters ;
   private int Combo_trncod_Gxcontroltype ;
   private int Dvpanel_unnamedtable4_Gxcontroltype ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Datamonjs_Gxcontroltype ;
   private int AV33GXV1 ;
   private int AV27Tmp_CliCod ;
   private int GXt_int8 ;
   private int GX_JID ;
   private int idxLst ;
   private int GXv_int9[] ;
   private java.math.BigDecimal A18AlbComImp ;
   private java.math.BigDecimal Z18AlbComImp ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV16AlbComPri ;
   private String wcpOAV17ContCod ;
   private String Z396EmprCod ;
   private String Z22AlbComPri ;
   private String Z3095AlcDivTCod ;
   private String Z4830AlbComMat ;
   private String Z10014AlbComFd ;
   private String Z10015AlbComFdD ;
   private String Z3094AlbCSec ;
   private String Z10738AlbComSt ;
   private String Z10740AlbComID ;
   private String Z10764AlbComAT ;
   private String Z5143AlcIvaCod ;
   private String Z11719AlbCTrNm ;
   private String Z11720AlbCTrDm ;
   private String Z11721AlbCTrNc ;
   private String Z14248AlbComATCU ;
   private String Z14249AlbComSerA ;
   private String Z14250AlbComTipA ;
   private String Combo_trncod_Selectedvalue_get ;
   private String Combo_alcdomenv_Selectedvalue_get ;
   private String Combo_clicod_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV7EmprCod ;
   private String AV17ContCod ;
   private String A22AlbComPri ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV16AlbComPri ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbComCod_Internalname ;
   private String A10764AlbComAT ;
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
   private String edtAlbComFhAN_Internalname ;
   private String edtAlbComFhAN_Jsonclick ;
   private String divTablesplittedclicod_Internalname ;
   private String lblTextblockclicod_Internalname ;
   private String lblTextblockclicod_Jsonclick ;
   private String Combo_clicod_Caption ;
   private String Combo_clicod_Cls ;
   private String Combo_clicod_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedalcdomenv_Internalname ;
   private String lblTextblockalcdomenv_Internalname ;
   private String lblTextblockalcdomenv_Jsonclick ;
   private String Combo_alcdomenv_Caption ;
   private String Combo_alcdomenv_Cls ;
   private String Combo_alcdomenv_Emptyitemtext ;
   private String Combo_alcdomenv_Internalname ;
   private String edtAlcDomEnv_Internalname ;
   private String edtAlcDomEnv_Jsonclick ;
   private String divTablesplittedtrncod_Internalname ;
   private String lblTextblocktrncod_Internalname ;
   private String lblTextblocktrncod_Jsonclick ;
   private String Combo_trncod_Caption ;
   private String Combo_trncod_Cls ;
   private String Combo_trncod_Emptyitemtext ;
   private String Combo_trncod_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtAlbComMat_Internalname ;
   private String A4830AlbComMat ;
   private String edtAlbComMat_Jsonclick ;
   private String edtAlbComHor_Internalname ;
   private String edtAlbComHor_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtavContcod_Internalname ;
   private String edtavContcod_Jsonclick ;
   private String edtAlbLineasL_Internalname ;
   private String edtAlbLineasL_Jsonclick ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtAlbComID_Internalname ;
   private String A10740AlbComID ;
   private String edtAlbComID_Jsonclick ;
   private String edtAlbComFs_Internalname ;
   private String edtAlbComFs_Jsonclick ;
   private String edtAlbComATCU_Internalname ;
   private String A14248AlbComATCU ;
   private String edtAlbComATCU_Jsonclick ;
   private String edtAlbCom4dig_Internalname ;
   private String A14374AlbCom4dig ;
   private String edtAlbCom4dig_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV31Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_clicod_Internalname ;
   private String edtavComboclicod_Internalname ;
   private String edtavComboclicod_Jsonclick ;
   private String divSectionattribute_alcdomenv_Internalname ;
   private String edtavComboalcdomenv_Internalname ;
   private String edtavComboalcdomenv_Jsonclick ;
   private String divSectionattribute_trncod_Internalname ;
   private String edtavCombotrncod_Internalname ;
   private String edtavCombotrncod_Jsonclick ;
   private String edtAlbComPri_Internalname ;
   private String edtAlbComPri_Jsonclick ;
   private String edtAlbComEst_Internalname ;
   private String edtAlbComEst_Jsonclick ;
   private String A3095AlcDivTCod ;
   private String A10014AlbComFd ;
   private String A10015AlbComFdD ;
   private String A3094AlbCSec ;
   private String A10738AlbComSt ;
   private String A5143AlcIvaCod ;
   private String A11719AlbCTrNm ;
   private String A11720AlbCTrDm ;
   private String A11721AlbCTrNc ;
   private String A14249AlbComSerA ;
   private String A14250AlbComTipA ;
   private String AV32Pgmdesc ;
   private String A407EmprNom ;
   private String A279CliNom ;
   private String A3091CliDivTra ;
   private String A841TrnNom ;
   private String A3112AlcDivAbr ;
   private String Combo_clicod_Objectcall ;
   private String Combo_clicod_Class ;
   private String Combo_clicod_Icontype ;
   private String Combo_clicod_Icon ;
   private String Combo_clicod_Tooltip ;
   private String Combo_clicod_Selectedvalue_set ;
   private String Combo_clicod_Selectedtext_set ;
   private String Combo_clicod_Selectedtext_get ;
   private String Combo_clicod_Gamoauthtoken ;
   private String Combo_clicod_Ddointernalname ;
   private String Combo_clicod_Titlecontrolalign ;
   private String Combo_clicod_Dropdownoptionstype ;
   private String Combo_clicod_Titlecontrolidtoreplace ;
   private String Combo_clicod_Datalisttype ;
   private String Combo_clicod_Datalistfixedvalues ;
   private String Combo_clicod_Datalistproc ;
   private String Combo_clicod_Datalistprocparametersprefix ;
   private String Combo_clicod_Remoteservicesparameters ;
   private String Combo_clicod_Htmltemplate ;
   private String Combo_clicod_Multiplevaluestype ;
   private String Combo_clicod_Loadingdata ;
   private String Combo_clicod_Noresultsfound ;
   private String Combo_clicod_Emptyitemtext ;
   private String Combo_clicod_Onlyselectedvalues ;
   private String Combo_clicod_Selectalltext ;
   private String Combo_clicod_Multiplevaluesseparator ;
   private String Combo_clicod_Addnewoptiontext ;
   private String Combo_alcdomenv_Objectcall ;
   private String Combo_alcdomenv_Class ;
   private String Combo_alcdomenv_Icontype ;
   private String Combo_alcdomenv_Icon ;
   private String Combo_alcdomenv_Tooltip ;
   private String Combo_alcdomenv_Selectedvalue_set ;
   private String Combo_alcdomenv_Selectedtext_set ;
   private String Combo_alcdomenv_Selectedtext_get ;
   private String Combo_alcdomenv_Gamoauthtoken ;
   private String Combo_alcdomenv_Ddointernalname ;
   private String Combo_alcdomenv_Titlecontrolalign ;
   private String Combo_alcdomenv_Dropdownoptionstype ;
   private String Combo_alcdomenv_Titlecontrolidtoreplace ;
   private String Combo_alcdomenv_Datalisttype ;
   private String Combo_alcdomenv_Datalistfixedvalues ;
   private String Combo_alcdomenv_Datalistproc ;
   private String Combo_alcdomenv_Datalistprocparametersprefix ;
   private String Combo_alcdomenv_Remoteservicesparameters ;
   private String Combo_alcdomenv_Htmltemplate ;
   private String Combo_alcdomenv_Multiplevaluestype ;
   private String Combo_alcdomenv_Loadingdata ;
   private String Combo_alcdomenv_Noresultsfound ;
   private String Combo_alcdomenv_Onlyselectedvalues ;
   private String Combo_alcdomenv_Selectalltext ;
   private String Combo_alcdomenv_Multiplevaluesseparator ;
   private String Combo_alcdomenv_Addnewoptiontext ;
   private String Combo_trncod_Objectcall ;
   private String Combo_trncod_Class ;
   private String Combo_trncod_Icontype ;
   private String Combo_trncod_Icon ;
   private String Combo_trncod_Tooltip ;
   private String Combo_trncod_Selectedvalue_set ;
   private String Combo_trncod_Selectedtext_set ;
   private String Combo_trncod_Selectedtext_get ;
   private String Combo_trncod_Gamoauthtoken ;
   private String Combo_trncod_Ddointernalname ;
   private String Combo_trncod_Titlecontrolalign ;
   private String Combo_trncod_Dropdownoptionstype ;
   private String Combo_trncod_Titlecontrolidtoreplace ;
   private String Combo_trncod_Datalisttype ;
   private String Combo_trncod_Datalistfixedvalues ;
   private String Combo_trncod_Datalistproc ;
   private String Combo_trncod_Datalistprocparametersprefix ;
   private String Combo_trncod_Remoteservicesparameters ;
   private String Combo_trncod_Htmltemplate ;
   private String Combo_trncod_Multiplevaluestype ;
   private String Combo_trncod_Loadingdata ;
   private String Combo_trncod_Noresultsfound ;
   private String Combo_trncod_Onlyselectedvalues ;
   private String Combo_trncod_Selectalltext ;
   private String Combo_trncod_Multiplevaluesseparator ;
   private String Combo_trncod_Addnewoptiontext ;
   private String Dvpanel_unnamedtable4_Objectcall ;
   private String Dvpanel_unnamedtable4_Class ;
   private String Dvpanel_unnamedtable4_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode1 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV21Station ;
   private String GXt_char1 ;
   private String AV22EmprNom ;
   private String AV23UsurCod ;
   private String Z3112AlcDivAbr ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z3091CliDivTra ;
   private String Z841TrnNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i10738AlbComSt ;
   private String i10740AlbComID ;
   private String i10764AlbComAT ;
   private String i3095AlcDivTCod ;
   private String i22AlbComPri ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date Z4829AlbComHor ;
   private java.util.Date Z10013AlbComFs ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date A10013AlbComFs ;
   private java.util.Date Z17AlbComFch ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date A14400AlbComFhAN ;
   private java.util.Date i17AlbComFch ;
   private java.util.Date GXt_date14 ;
   private java.util.Date GXv_date15[] ;
   private java.util.Date Z14400AlbComFhAN ;
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
   private boolean Combo_clicod_Emptyitem ;
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean n3091CliDivTra ;
   private boolean n3140CliDivCod ;
   private boolean n841TrnNom ;
   private boolean n3112AlcDivAbr ;
   private boolean n13739findDomEnv ;
   private boolean n18AlbComImp ;
   private boolean Combo_clicod_Enabled ;
   private boolean Combo_clicod_Visible ;
   private boolean Combo_clicod_Allowmultipleselection ;
   private boolean Combo_clicod_Isgriditem ;
   private boolean Combo_clicod_Hasdescription ;
   private boolean Combo_clicod_Includeonlyselectedoption ;
   private boolean Combo_clicod_Includeselectalloption ;
   private boolean Combo_clicod_Includeaddnewoption ;
   private boolean Combo_alcdomenv_Enabled ;
   private boolean Combo_alcdomenv_Visible ;
   private boolean Combo_alcdomenv_Allowmultipleselection ;
   private boolean Combo_alcdomenv_Isgriditem ;
   private boolean Combo_alcdomenv_Hasdescription ;
   private boolean Combo_alcdomenv_Includeonlyselectedoption ;
   private boolean Combo_alcdomenv_Includeselectalloption ;
   private boolean Combo_alcdomenv_Emptyitem ;
   private boolean Combo_alcdomenv_Includeaddnewoption ;
   private boolean Combo_trncod_Enabled ;
   private boolean Combo_trncod_Visible ;
   private boolean Combo_trncod_Allowmultipleselection ;
   private boolean Combo_trncod_Isgriditem ;
   private boolean Combo_trncod_Hasdescription ;
   private boolean Combo_trncod_Includeonlyselectedoption ;
   private boolean Combo_trncod_Includeselectalloption ;
   private boolean Combo_trncod_Emptyitem ;
   private boolean Combo_trncod_Includeaddnewoption ;
   private boolean Dvpanel_unnamedtable4_Enabled ;
   private boolean Dvpanel_unnamedtable4_Showheader ;
   private boolean Dvpanel_unnamedtable4_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String AV19ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod ;
   private com.genexus.webpanels.GXUserControl ucCombo_alcdomenv ;
   private com.genexus.webpanels.GXUserControl ucCombo_trncod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavAlbcompri ;
   private HTMLChoice cmbAlbComEAT ;
   private HTMLChoice cmbAlbComAT ;
   private IDataStoreProvider pr_default ;
   private String[] T01UB4_A407EmprNom ;
   private boolean[] T01UB4_n407EmprNom ;
   private java.math.BigDecimal[] T01UB10_A18AlbComImp ;
   private boolean[] T01UB10_n18AlbComImp ;
   private String[] T01UB5_A279CliNom ;
   private String[] T01UB5_A3091CliDivTra ;
   private boolean[] T01UB5_n3091CliDivTra ;
   private byte[] T01UB5_A3140CliDivCod ;
   private boolean[] T01UB5_n3140CliDivCod ;
   private byte[] T01UB8_A13739findDomEnv ;
   private boolean[] T01UB8_n13739findDomEnv ;
   private String[] T01UB6_A841TrnNom ;
   private boolean[] T01UB6_n841TrnNom ;
   private String[] T01UB7_A3112AlcDivAbr ;
   private boolean[] T01UB7_n3112AlcDivAbr ;
   private byte[] T01UB12_A266CliEnvLin ;
   private int[] T01UB12_A14AlbComCod ;
   private byte[] T01UB12_A5142AlcDomEnv ;
   private String[] T01UB12_A407EmprNom ;
   private boolean[] T01UB12_n407EmprNom ;
   private java.util.Date[] T01UB12_A17AlbComFch ;
   private String[] T01UB12_A22AlbComPri ;
   private String[] T01UB12_A279CliNom ;
   private String[] T01UB12_A3091CliDivTra ;
   private boolean[] T01UB12_n3091CliDivTra ;
   private byte[] T01UB12_A16AlbComEst ;
   private short[] T01UB12_A19AlbComLiC ;
   private byte[] T01UB12_A1783AlbComEso ;
   private String[] T01UB12_A3095AlcDivTCod ;
   private String[] T01UB12_A3112AlcDivAbr ;
   private boolean[] T01UB12_n3112AlcDivAbr ;
   private String[] T01UB12_A841TrnNom ;
   private boolean[] T01UB12_n841TrnNom ;
   private java.util.Date[] T01UB12_A4829AlbComHor ;
   private String[] T01UB12_A4830AlbComMat ;
   private java.util.Date[] T01UB12_A10013AlbComFs ;
   private String[] T01UB12_A10014AlbComFd ;
   private String[] T01UB12_A10015AlbComFdD ;
   private String[] T01UB12_A3094AlbCSec ;
   private String[] T01UB12_A10738AlbComSt ;
   private byte[] T01UB12_A10739AlbComEAT ;
   private String[] T01UB12_A10740AlbComID ;
   private String[] T01UB12_A10764AlbComAT ;
   private String[] T01UB12_A5143AlcIvaCod ;
   private String[] T01UB12_A11719AlbCTrNm ;
   private String[] T01UB12_A11720AlbCTrDm ;
   private String[] T01UB12_A11721AlbCTrNc ;
   private String[] T01UB12_A14248AlbComATCU ;
   private String[] T01UB12_A14249AlbComSerA ;
   private String[] T01UB12_A14250AlbComTipA ;
   private String[] T01UB12_A396EmprCod ;
   private int[] T01UB12_A252CliCod ;
   private short[] T01UB12_A840TrnCod ;
   private boolean[] T01UB12_n840TrnCod ;
   private byte[] T01UB12_A3111AlcDivCod ;
   private byte[] T01UB12_A3140CliDivCod ;
   private boolean[] T01UB12_n3140CliDivCod ;
   private byte[] T01UB12_A13739findDomEnv ;
   private boolean[] T01UB12_n13739findDomEnv ;
   private java.math.BigDecimal[] T01UB12_A18AlbComImp ;
   private boolean[] T01UB12_n18AlbComImp ;
   private String[] T01UB13_A3112AlcDivAbr ;
   private boolean[] T01UB13_n3112AlcDivAbr ;
   private String[] T01UB14_A279CliNom ;
   private String[] T01UB14_A3091CliDivTra ;
   private boolean[] T01UB14_n3091CliDivTra ;
   private byte[] T01UB14_A3140CliDivCod ;
   private boolean[] T01UB14_n3140CliDivCod ;
   private String[] T01UB15_A841TrnNom ;
   private boolean[] T01UB15_n841TrnNom ;
   private byte[] T01UB16_A13739findDomEnv ;
   private boolean[] T01UB16_n13739findDomEnv ;
   private java.math.BigDecimal[] T01UB18_A18AlbComImp ;
   private boolean[] T01UB18_n18AlbComImp ;
   private String[] T01UB19_A396EmprCod ;
   private int[] T01UB19_A14AlbComCod ;
   private int[] T01UB3_A14AlbComCod ;
   private byte[] T01UB3_A5142AlcDomEnv ;
   private java.util.Date[] T01UB3_A17AlbComFch ;
   private String[] T01UB3_A22AlbComPri ;
   private byte[] T01UB3_A16AlbComEst ;
   private short[] T01UB3_A19AlbComLiC ;
   private byte[] T01UB3_A1783AlbComEso ;
   private String[] T01UB3_A3095AlcDivTCod ;
   private java.util.Date[] T01UB3_A4829AlbComHor ;
   private String[] T01UB3_A4830AlbComMat ;
   private java.util.Date[] T01UB3_A10013AlbComFs ;
   private String[] T01UB3_A10014AlbComFd ;
   private String[] T01UB3_A10015AlbComFdD ;
   private String[] T01UB3_A3094AlbCSec ;
   private String[] T01UB3_A10738AlbComSt ;
   private byte[] T01UB3_A10739AlbComEAT ;
   private String[] T01UB3_A10740AlbComID ;
   private String[] T01UB3_A10764AlbComAT ;
   private String[] T01UB3_A5143AlcIvaCod ;
   private String[] T01UB3_A11719AlbCTrNm ;
   private String[] T01UB3_A11720AlbCTrDm ;
   private String[] T01UB3_A11721AlbCTrNc ;
   private String[] T01UB3_A14248AlbComATCU ;
   private String[] T01UB3_A14249AlbComSerA ;
   private String[] T01UB3_A14250AlbComTipA ;
   private String[] T01UB3_A396EmprCod ;
   private int[] T01UB3_A252CliCod ;
   private short[] T01UB3_A840TrnCod ;
   private boolean[] T01UB3_n840TrnCod ;
   private byte[] T01UB3_A3111AlcDivCod ;
   private String[] T01UB20_A396EmprCod ;
   private int[] T01UB20_A14AlbComCod ;
   private String[] T01UB21_A396EmprCod ;
   private int[] T01UB21_A14AlbComCod ;
   private int[] T01UB2_A14AlbComCod ;
   private byte[] T01UB2_A5142AlcDomEnv ;
   private java.util.Date[] T01UB2_A17AlbComFch ;
   private String[] T01UB2_A22AlbComPri ;
   private byte[] T01UB2_A16AlbComEst ;
   private short[] T01UB2_A19AlbComLiC ;
   private byte[] T01UB2_A1783AlbComEso ;
   private String[] T01UB2_A3095AlcDivTCod ;
   private java.util.Date[] T01UB2_A4829AlbComHor ;
   private String[] T01UB2_A4830AlbComMat ;
   private java.util.Date[] T01UB2_A10013AlbComFs ;
   private String[] T01UB2_A10014AlbComFd ;
   private String[] T01UB2_A10015AlbComFdD ;
   private String[] T01UB2_A3094AlbCSec ;
   private String[] T01UB2_A10738AlbComSt ;
   private byte[] T01UB2_A10739AlbComEAT ;
   private String[] T01UB2_A10740AlbComID ;
   private String[] T01UB2_A10764AlbComAT ;
   private String[] T01UB2_A5143AlcIvaCod ;
   private String[] T01UB2_A11719AlbCTrNm ;
   private String[] T01UB2_A11720AlbCTrDm ;
   private String[] T01UB2_A11721AlbCTrNc ;
   private String[] T01UB2_A14248AlbComATCU ;
   private String[] T01UB2_A14249AlbComSerA ;
   private String[] T01UB2_A14250AlbComTipA ;
   private String[] T01UB2_A396EmprCod ;
   private int[] T01UB2_A252CliCod ;
   private short[] T01UB2_A840TrnCod ;
   private boolean[] T01UB2_n840TrnCod ;
   private byte[] T01UB2_A3111AlcDivCod ;
   private String[] T01UB25_A3112AlcDivAbr ;
   private boolean[] T01UB25_n3112AlcDivAbr ;
   private String[] T01UB26_A279CliNom ;
   private String[] T01UB26_A3091CliDivTra ;
   private boolean[] T01UB26_n3091CliDivTra ;
   private byte[] T01UB26_A3140CliDivCod ;
   private boolean[] T01UB26_n3140CliDivCod ;
   private String[] T01UB27_A841TrnNom ;
   private boolean[] T01UB27_n841TrnNom ;
   private byte[] T01UB28_A13739findDomEnv ;
   private boolean[] T01UB28_n13739findDomEnv ;
   private java.math.BigDecimal[] T01UB30_A18AlbComImp ;
   private boolean[] T01UB30_n18AlbComImp ;
   private String[] T01UB31_A396EmprCod ;
   private int[] T01UB31_A14AlbComCod ;
   private byte[] T01UB31_A2386AlbCObsLin ;
   private String[] T01UB32_A396EmprCod ;
   private int[] T01UB32_A14AlbComCod ;
   private short[] T01UB32_A20AlbComLin ;
   private String[] T01UB33_A396EmprCod ;
   private int[] T01UB33_A14AlbComCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV18CliCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV24AlcDomEnv_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV28TrnCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV15TrnContextAtt ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV25DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class documentotransportecomercial_cabecera__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransportecomercial_cabecera__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransportecomercial_cabecera__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransportecomercial_cabecera__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransportecomercial_cabecera__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UB2", "SELECT AlbComCod, AlcDomEnv, AlbComFch, AlbComPri, AlbComEst, AlbComLiC, AlbComEso, AlcDivTCod, AlbComHor, AlbComMat, AlbComFs, AlbComFd, AlbComFdD, AlbCSec, AlbComSt, AlbComEAT, AlbComID, AlbComAT, AlcIvaCod, AlbCTrNm, AlbCTrDm, AlbCTrNc, AlbComATCU, AlbComSerA, AlbComTipA, EmprCod, CliCod, TrnCod, AlcDivCod FROM TXPCALCOM WHERE EmprCod = ? AND AlbComCod = ?  FOR UPDATE OF AlcDomEnv, AlbComFch, AlbComPri, AlbComEst, AlbComLiC, AlbComEso, AlcDivTCod, AlbComHor, AlbComMat, AlbComFs, AlbComFd, AlbComFdD, AlbCSec, AlbComSt, AlbComEAT, AlbComID, AlbComAT, AlcIvaCod, AlbCTrNm, AlbCTrDm, AlbCTrNc, AlbComATCU, AlbComSerA, AlbComTipA, CliCod, TrnCod, AlcDivCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB3", "SELECT AlbComCod, AlcDomEnv, AlbComFch, AlbComPri, AlbComEst, AlbComLiC, AlbComEso, AlcDivTCod, AlbComHor, AlbComMat, AlbComFs, AlbComFd, AlbComFdD, AlbCSec, AlbComSt, AlbComEAT, AlbComID, AlbComAT, AlcIvaCod, AlbCTrNm, AlbCTrDm, AlbCTrNc, AlbComATCU, AlbComSerA, AlbComTipA, EmprCod, CliCod, TrnCod, AlcDivCod FROM TXPCALCOM WHERE EmprCod = ? AND AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB5", "SELECT CliNom, CliDivTra, CliDivCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB6", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB7", "SELECT DivAbr AS AlcDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB8", "SELECT COALESCE( CliEnvLin, 0) AS findDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB10", "SELECT COALESCE( T1.AlbComImp, 0) AS AlbComImp FROM (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB12", "SELECT /*+ FIRST_ROWS(100) */ T7.CliEnvLin, TM1.AlbComCod, TM1.AlcDomEnv, T3.EmprNom, TM1.AlbComFch, TM1.AlbComPri, T5.CliNom, T5.CliDivTra, TM1.AlbComEst, TM1.AlbComLiC, TM1.AlbComEso, TM1.AlcDivTCod, T2.DivAbr AS AlcDivAbr, T6.TrnNom, TM1.AlbComHor, TM1.AlbComMat, TM1.AlbComFs, TM1.AlbComFd, TM1.AlbComFdD, TM1.AlbCSec, TM1.AlbComSt, TM1.AlbComEAT, TM1.AlbComID, TM1.AlbComAT, TM1.AlcIvaCod, TM1.AlbCTrNm, TM1.AlbCTrDm, TM1.AlbCTrNc, TM1.AlbComATCU, TM1.AlbComSerA, TM1.AlbComTipA, TM1.EmprCod, TM1.CliCod, TM1.TrnCod, TM1.AlcDivCod AS AlcDivCod, T5.CliDivCod, COALESCE( T7.CliEnvLin, 0) AS findDomEnv, COALESCE( T4.AlbComImp, 0) AS AlbComImp FROM ((((((TXPCALCOM TM1 INNER JOIN TXPDIVISA T2 ON T2.DivCod = TM1.AlcDivCod) INNER JOIN TXPEMPRES T3 ON T3.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.AlbComCod = TM1.AlbComCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T6 ON T6.EmprCod = TM1.EmprCod AND T6.TrnCod = TM1.TrnCod) LEFT JOIN TXPCLIENV T7 ON T7.EmprCod = TM1.EmprCod AND T7.CliCod = TM1.CliCod AND T7.CliEnvLin = TM1.AlcDomEnv) WHERE TM1.EmprCod = ? and TM1.AlbComCod = ? ORDER BY TM1.EmprCod, TM1.AlbComCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB13", "SELECT DivAbr AS AlcDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB14", "SELECT CliNom, CliDivTra, CliDivCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB15", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB16", "SELECT COALESCE( CliEnvLin, 0) AS findDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB18", "SELECT COALESCE( T1.AlbComImp, 0) AS AlbComImp FROM (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB19", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbComCod FROM TXPCALCOM WHERE EmprCod = ? AND AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB20", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbComCod FROM TXPCALCOM WHERE ( EmprCod > ? or EmprCod = ? and AlbComCod > ?) ORDER BY EmprCod, AlbComCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UB21", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbComCod FROM TXPCALCOM WHERE ( EmprCod < ? or EmprCod = ? and AlbComCod < ?) ORDER BY EmprCod DESC, AlbComCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UB22", "INSERT INTO TXPCALCOM(AlbComCod, AlcDomEnv, AlbComFch, AlbComPri, AlbComEst, AlbComLiC, AlbComEso, AlcDivTCod, AlbComHor, AlbComMat, AlbComFs, AlbComFd, AlbComFdD, AlbCSec, AlbComSt, AlbComEAT, AlbComID, AlbComAT, AlcIvaCod, AlbCTrNm, AlbCTrDm, AlbCTrNc, AlbComATCU, AlbComSerA, AlbComTipA, EmprCod, CliCod, TrnCod, AlcDivCod, AlbCObsCon) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPCALCOM")
         ,new UpdateCursor("T01UB23", "UPDATE TXPCALCOM SET AlcDomEnv=?, AlbComFch=?, AlbComPri=?, AlbComEst=?, AlbComLiC=?, AlbComEso=?, AlcDivTCod=?, AlbComHor=?, AlbComMat=?, AlbComFs=?, AlbComFd=?, AlbComFdD=?, AlbCSec=?, AlbComSt=?, AlbComEAT=?, AlbComID=?, AlbComAT=?, AlcIvaCod=?, AlbCTrNm=?, AlbCTrDm=?, AlbCTrNc=?, AlbComATCU=?, AlbComSerA=?, AlbComTipA=?, CliCod=?, TrnCod=?, AlcDivCod=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK, "TXPCALCOM")
         ,new UpdateCursor("T01UB24", "DELETE FROM TXPCALCOM  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK, "TXPCALCOM")
         ,new ForEachCursor("T01UB25", "SELECT DivAbr AS AlcDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB26", "SELECT CliNom, CliDivTra, CliDivCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB27", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB28", "SELECT COALESCE( CliEnvLin, 0) AS findDomEnv FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB30", "SELECT COALESCE( T1.AlbComImp, 0) AS AlbComImp FROM (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UB31", "SELECT * FROM (SELECT EmprCod, AlbComCod, AlbCObsLin FROM TXPOBSALC WHERE EmprCod = ? AND AlbComCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UB32", "SELECT * FROM (SELECT EmprCod, AlbComCod, AlbComLin FROM TXPLALCOM WHERE EmprCod = ? AND AlbComCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UB33", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbComCod FROM TXPCALCOM ORDER BY EmprCod, AlbComCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 200);
               ((String[]) buf[12])[0] = rslt.getString(13, 200);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 20);
               ((String[]) buf[17])[0] = rslt.getString(18, 1);
               ((String[]) buf[18])[0] = rslt.getString(19, 3);
               ((String[]) buf[19])[0] = rslt.getString(20, 60);
               ((String[]) buf[20])[0] = rslt.getString(21, 60);
               ((String[]) buf[21])[0] = rslt.getString(22, 20);
               ((String[]) buf[22])[0] = rslt.getString(23, 20);
               ((String[]) buf[23])[0] = rslt.getString(24, 20);
               ((String[]) buf[24])[0] = rslt.getString(25, 4);
               ((String[]) buf[25])[0] = rslt.getString(26, 3);
               ((int[]) buf[26])[0] = rslt.getInt(27);
               ((short[]) buf[27])[0] = rslt.getShort(28);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(29);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 200);
               ((String[]) buf[12])[0] = rslt.getString(13, 200);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 20);
               ((String[]) buf[17])[0] = rslt.getString(18, 1);
               ((String[]) buf[18])[0] = rslt.getString(19, 3);
               ((String[]) buf[19])[0] = rslt.getString(20, 60);
               ((String[]) buf[20])[0] = rslt.getString(21, 60);
               ((String[]) buf[21])[0] = rslt.getString(22, 20);
               ((String[]) buf[22])[0] = rslt.getString(23, 20);
               ((String[]) buf[23])[0] = rslt.getString(24, 20);
               ((String[]) buf[24])[0] = rslt.getString(25, 4);
               ((String[]) buf[25])[0] = rslt.getString(26, 3);
               ((int[]) buf[26])[0] = rslt.getInt(27);
               ((short[]) buf[27])[0] = rslt.getShort(28);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(29);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((String[]) buf[14])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(15);
               ((String[]) buf[19])[0] = rslt.getString(16, 20);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(17);
               ((String[]) buf[21])[0] = rslt.getString(18, 200);
               ((String[]) buf[22])[0] = rslt.getString(19, 200);
               ((String[]) buf[23])[0] = rslt.getString(20, 1);
               ((String[]) buf[24])[0] = rslt.getString(21, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(22);
               ((String[]) buf[26])[0] = rslt.getString(23, 20);
               ((String[]) buf[27])[0] = rslt.getString(24, 1);
               ((String[]) buf[28])[0] = rslt.getString(25, 3);
               ((String[]) buf[29])[0] = rslt.getString(26, 60);
               ((String[]) buf[30])[0] = rslt.getString(27, 60);
               ((String[]) buf[31])[0] = rslt.getString(28, 20);
               ((String[]) buf[32])[0] = rslt.getString(29, 20);
               ((String[]) buf[33])[0] = rslt.getString(30, 20);
               ((String[]) buf[34])[0] = rslt.getString(31, 4);
               ((String[]) buf[35])[0] = rslt.getString(32, 3);
               ((int[]) buf[36])[0] = rslt.getInt(33);
               ((short[]) buf[37])[0] = rslt.getShort(34);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(35);
               ((byte[]) buf[40])[0] = rslt.getByte(36);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((byte[]) buf[42])[0] = rslt.getByte(37);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
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
            case 5 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
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
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setDateTime(9, (java.util.Date)parms[8], false);
               stmt.setString(10, (String)parms[9], 20);
               stmt.setDateTime(11, (java.util.Date)parms[10], false);
               stmt.setString(12, (String)parms[11], 200);
               stmt.setString(13, (String)parms[12], 200);
               stmt.setString(14, (String)parms[13], 1);
               stmt.setString(15, (String)parms[14], 1);
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setString(17, (String)parms[16], 20);
               stmt.setString(18, (String)parms[17], 1);
               stmt.setString(19, (String)parms[18], 3);
               stmt.setString(20, (String)parms[19], 60);
               stmt.setString(21, (String)parms[20], 60);
               stmt.setString(22, (String)parms[21], 20);
               stmt.setString(23, (String)parms[22], 20);
               stmt.setString(24, (String)parms[23], 20);
               stmt.setString(25, (String)parms[24], 4);
               stmt.setString(26, (String)parms[25], 3);
               stmt.setInt(27, ((Number) parms[26]).intValue());
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[28]).shortValue());
               }
               stmt.setByte(29, ((Number) parms[29]).byteValue());
               return;
            case 18 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setDateTime(8, (java.util.Date)parms[7], false);
               stmt.setString(9, (String)parms[8], 20);
               stmt.setDateTime(10, (java.util.Date)parms[9], false);
               stmt.setString(11, (String)parms[10], 200);
               stmt.setString(12, (String)parms[11], 200);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setString(14, (String)parms[13], 1);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 20);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setString(18, (String)parms[17], 3);
               stmt.setString(19, (String)parms[18], 60);
               stmt.setString(20, (String)parms[19], 60);
               stmt.setString(21, (String)parms[20], 20);
               stmt.setString(22, (String)parms[21], 20);
               stmt.setString(23, (String)parms[22], 20);
               stmt.setString(24, (String)parms[23], 4);
               stmt.setInt(25, ((Number) parms[24]).intValue());
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[26]).shortValue());
               }
               stmt.setByte(27, ((Number) parms[27]).byteValue());
               stmt.setString(28, (String)parms[28], 3);
               stmt.setInt(29, ((Number) parms[29]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
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
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

