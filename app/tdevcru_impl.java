package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdevcru_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action23") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11669DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_23_1H41633( A396EmprCod, A11669DevCruId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action39") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         AV42AlbRUni = httpContext.GetPar( "AlbRUni") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42AlbRUni", AV42AlbRUni);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_39_1H41634( Gx_mode, A396EmprCod, A44AlbRecCod, AV42AlbRUni) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action40") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_40_1H41634( A396EmprCod, A44AlbRecCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CLICOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A279CliNom = httpContext.GetPar( "CliNom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaclicod1H40( A396EmprCod, A279CliNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TRNCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A841TrnNom = httpContext.GetPar( "TrnNom") ;
         n841TrnNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatrncod1H40( A396EmprCod, A841TrnNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"CLICOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A279CliNom = httpContext.GetPar( "CliNom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaclicod1H40( A396EmprCod, A279CliNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"CLICOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h252CliCod = httpContext.GetPar( "h252CliCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaclicod1H41633( A396EmprCod, h252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TRNCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A841TrnNom = httpContext.GetPar( "TrnNom") ;
         n841TrnNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatrncod1H40( A396EmprCod, A841TrnNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TRNCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h840TrnCod = httpContext.GetPar( "h840TrnCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcatrncod1H41633( A396EmprCod, h840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"DEVCRUSAL") == 0 )
      {
         A11670DevCruFec = localUtil.parseDateParm( httpContext.GetPar( "DevCruFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx10asadevcrusal1H41633( A11670DevCruFec, Gx_mode, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_44") == 0 )
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
         gxload_44( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_45") == 0 )
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
         gxload_45( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_47") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_47( A396EmprCod, A44AlbRecCod) ;
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
            AV59EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59EmprCod", AV59EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59EmprCod, "@!"))));
            AV60DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60DevCruId), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV60DevCruId), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Devolucion Entradas en Almacen", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDevCruId_Internalname ;
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
      nRC_GXsfl_59 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_59"))) ;
      nGXsfl_59_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_59_idx"))) ;
      sGXsfl_59_idx = httpContext.GetPar( "sGXsfl_59_idx") ;
      AV32FirmaD = (byte)(GXutil.lval( httpContext.GetPar( "FirmaD"))) ;
      A11680DevCruAtId = httpContext.GetPar( "DevCruAtId") ;
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

   public tdevcru_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdevcru_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdevcru_impl.class ));
   }

   public tdevcru_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruId_Internalname, httpContext.getMessage( "Devolucion Id", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruId_Internalname, GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruId_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruId_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVCRU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruFec_Internalname, httpContext.getMessage( "Fecha", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDevCruFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruFec_Internalname, localUtil.format(A11670DevCruFec, "99/99/99"), localUtil.format( A11670DevCruFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVCRU.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevCruFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevCruFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDEVCRU.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruSal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruSal_Internalname, httpContext.getMessage( "Hora", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDevCruSal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruSal_Internalname, localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11673DevCruSal, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruSal_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVCRU.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevCruSal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevCruSal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDEVCRU.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.rtrim( h252CliCod), GXutil.rtrim( localUtil.format( h252CliCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 1, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TDEVCRU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTrnCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.rtrim( h840TrnCod), GXutil.rtrim( localUtil.format( h840TrnCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTrnCod_Enabled, 1, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_TDEVCRU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruMat_Internalname, httpContext.getMessage( "Matricula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruMat_Internalname, GXutil.rtrim( A11672DevCruMat), GXutil.rtrim( localUtil.format( A11672DevCruMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVCRU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDevCruObs_Internalname, A11682DevCruObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", (short)(0), 1, edtDevCruObs_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TDEVCRU.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVCRU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVCRU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVCRU.htm");
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

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol59( ) ;
      nGXsfl_59_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1634 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1634 = (short)(1) ;
            scanStart1H41634( ) ;
            while ( RcdFound1634 != 0 )
            {
               init_level_properties1634( ) ;
               getByPrimaryKey1H41634( ) ;
               addRow1H41634( ) ;
               scanNext1H41634( ) ;
            }
            scanEnd1H41634( ) ;
            nBlankRcdCount1634 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B252CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         standaloneNotModal1H41634( ) ;
         standaloneModal1H41634( ) ;
         sMode1634 = Gx_mode ;
         while ( nGXsfl_59_idx < nRC_GXsfl_59 )
         {
            bGXsfl_59_Refreshing = true ;
            readRow1H41634( ) ;
            edtAlbRecCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOD_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtAlbRef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBREF_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtAlbRefDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBREFDSC_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtDevCruUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVCRUUND_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevCruUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruUnd_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtDevCruPzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVCRUPZS_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevCruPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruPzs_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtAlbRUniUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIUTI_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtAlbRUniEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIENT_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtAlbRPieUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            edtAlbRPieEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEENT_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_59_Refreshing);
            if ( ( nRcdExists_1634 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1H41634( ) ;
            }
            sendRow1H41634( ) ;
            bGXsfl_59_Refreshing = false ;
         }
         Gx_mode = sMode1634 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A252CliCod = B252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1634 = (short)(5) ;
         nRcdExists_1634 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1H41634( ) ;
            while ( RcdFound1634 != 0 )
            {
               sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_591634( ) ;
               init_level_properties1634( ) ;
               standaloneNotModal1H41634( ) ;
               getByPrimaryKey1H41634( ) ;
               standaloneModal1H41634( ) ;
               addRow1H41634( ) ;
               scanNext1H41634( ) ;
            }
            scanEnd1H41634( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1634 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_591634( ) ;
         initAll1H41634( ) ;
         init_level_properties1634( ) ;
         B252CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         nRcdExists_1634 = (short)(0) ;
         nIsMod_1634 = (short)(0) ;
         nRcdDeleted_1634 = (short)(0) ;
         nBlankRcdCount1634 = (short)(nBlankRcdUsr1634+nBlankRcdCount1634) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1634 > 0 )
         {
            standaloneNotModal1H41634( ) ;
            standaloneModal1H41634( ) ;
            addRow1H41634( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1634 = (short)(nBlankRcdCount1634-1) ;
         }
         Gx_mode = sMode1634 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A252CliCod = B252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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
      e111H42 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( "Z11669DevCruId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11673DevCruSal = localUtil.ctot( httpContext.cgiGet( "Z11673DevCruSal"), 0) ;
            Z11670DevCruFec = localUtil.ctod( httpContext.cgiGet( "Z11670DevCruFec"), 0) ;
            Z11671DevCruEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11671DevCruEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11672DevCruMat = httpContext.cgiGet( "Z11672DevCruMat") ;
            Z11674DevCruHash = httpContext.cgiGet( "Z11674DevCruHash") ;
            Z11675DevCruDesc = httpContext.cgiGet( "Z11675DevCruDesc") ;
            Z11676DevCruDtSy = localUtil.ctot( httpContext.cgiGet( "Z11676DevCruDtSy"), 0) ;
            Z11677DevCruGros = localUtil.ctond( httpContext.cgiGet( "Z11677DevCruGros")) ;
            Z11678DevCruStt = httpContext.cgiGet( "Z11678DevCruStt") ;
            Z11679DevCruEnvA = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11679DevCruEnvA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11680DevCruAtId = httpContext.cgiGet( "Z11680DevCruAtId") ;
            Z11681DevCruAT = httpContext.cgiGet( "Z11681DevCruAT") ;
            Z11682DevCruObs = httpContext.cgiGet( "Z11682DevCruObs") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11671DevCruEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11671DevCruEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11674DevCruHash = httpContext.cgiGet( "Z11674DevCruHash") ;
            A11675DevCruDesc = httpContext.cgiGet( "Z11675DevCruDesc") ;
            A11676DevCruDtSy = localUtil.ctot( httpContext.cgiGet( "Z11676DevCruDtSy"), 0) ;
            A11677DevCruGros = localUtil.ctond( httpContext.cgiGet( "Z11677DevCruGros")) ;
            A11678DevCruStt = httpContext.cgiGet( "Z11678DevCruStt") ;
            A11679DevCruEnvA = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11679DevCruEnvA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11680DevCruAtId = httpContext.cgiGet( "Z11680DevCruAtId") ;
            A11681DevCruAT = httpContext.cgiGet( "Z11681DevCruAT") ;
            O252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "O252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_59 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_59"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "N252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "N840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV59EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV60DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( "vDEVCRUID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV56Insert_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV57Insert_TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "GXHCTRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11676DevCruDtSy = localUtil.ctot( httpContext.cgiGet( "DEVCRUDTSY"), 0) ;
            A11680DevCruAtId = httpContext.cgiGet( "DEVCRUATID") ;
            A11679DevCruEnvA = (byte)(localUtil.ctol( httpContext.cgiGet( "DEVCRUENVA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11681DevCruAT = httpContext.cgiGet( "DEVCRUAT") ;
            A11678DevCruStt = httpContext.cgiGet( "DEVCRUSTT") ;
            AV32FirmaD = (byte)(localUtil.ctol( httpContext.cgiGet( "vFIRMAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV48Reg000 = (byte)(localUtil.ctol( httpContext.cgiGet( "vREG000"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11671DevCruEst = (byte)(localUtil.ctol( httpContext.cgiGet( "DEVCRUEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11674DevCruHash = httpContext.cgiGet( "DEVCRUHASH") ;
            A11675DevCruDesc = httpContext.cgiGet( "DEVCRUDESC") ;
            A11677DevCruGros = localUtil.ctond( httpContext.cgiGet( "DEVCRUGROS")) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            AV63Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( "ALBRUNIDIS")) ;
            A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEDIS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBREST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV42AlbRUni = httpContext.cgiGet( "vALBRUNI") ;
            AV38AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRPIEDIS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV39AlbRUniDis = localUtil.ctond( httpContext.cgiGet( "vALBRUNIDIS")) ;
            AV40AlbRPDis = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRPDIS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV41AlbRUDis = localUtil.ctond( httpContext.cgiGet( "vALBRUDIS")) ;
            AV43FlagCli = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A56AlbRUni = httpContext.cgiGet( "ALBRUNI") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVCRUID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11669DevCruId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            }
            else
            {
               A11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( edtDevCruId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtDevCruFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DEVCRUFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevCruFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11670DevCruFec = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
            }
            else
            {
               A11670DevCruFec = localUtil.ctod( httpContext.cgiGet( edtDevCruFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtDevCruSal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "DEVCRUSAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevCruSal_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A11673DevCruSal = localUtil.ctot( httpContext.cgiGet( edtDevCruSal_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            h252CliCod = httpContext.cgiGet( edtCliCod_Internalname) ;
            h840TrnCod = httpContext.cgiGet( edtTrnCod_Internalname) ;
            A11672DevCruMat = httpContext.cgiGet( edtDevCruMat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
            A11682DevCruObs = httpContext.cgiGet( edtDevCruObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TDEVCRU");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("DevCruEst", localUtil.format( DecimalUtil.doubleToDec(A11671DevCruEst), "9"));
            forbiddenHiddens.add("DevCruHash", GXutil.rtrim( localUtil.format( A11674DevCruHash, "")));
            forbiddenHiddens.add("DevCruDesc", GXutil.rtrim( localUtil.format( A11675DevCruDesc, "")));
            forbiddenHiddens.add("DevCruDtSy", localUtil.format( A11676DevCruDtSy, "99/99/99 99:99"));
            forbiddenHiddens.add("DevCruGros", localUtil.format( A11677DevCruGros, "ZZZZZZZZZ9.99"));
            forbiddenHiddens.add("DevCruStt", GXutil.rtrim( localUtil.format( A11678DevCruStt, "")));
            forbiddenHiddens.add("DevCruEnvA", localUtil.format( DecimalUtil.doubleToDec(A11679DevCruEnvA), "9"));
            forbiddenHiddens.add("DevCruAtId", GXutil.rtrim( localUtil.format( A11680DevCruAtId, "")));
            forbiddenHiddens.add("DevCruAT", GXutil.rtrim( localUtil.format( A11681DevCruAT, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A11669DevCruId != Z11669DevCruId ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tdevcru:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A11669DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
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
                  sMode1633 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1633 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1633 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1H40( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "DEVCRUID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDevCruId_Internalname ;
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
                        e111H42 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121H42 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'ELIMINAR GUIA'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Eliminar GUIA' */
                        e131H42 ();
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
         e121H42 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1H41633( ) ;
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
         disableAttributes1H41633( ) ;
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

   public void confirm_1H40( )
   {
      beforeValidate1H41633( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1H41633( ) ;
         }
         else
         {
            checkExtendedTable1H41633( ) ;
            closeExtendedTableCursors1H41633( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1633 = Gx_mode ;
         confirm_1H41634( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1633 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1633 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1H41634( )
   {
      nGXsfl_59_idx = 0 ;
      while ( nGXsfl_59_idx < nRC_GXsfl_59 )
      {
         readRow1H41634( ) ;
         if ( ( nRcdExists_1634 != 0 ) || ( nIsMod_1634 != 0 ) )
         {
            getKey1H41634( ) ;
            if ( ( nRcdExists_1634 == 0 ) && ( nRcdDeleted_1634 == 0 ) )
            {
               if ( RcdFound1634 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1H41634( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1H41634( ) ;
                     closeExtendedTableCursors1H41634( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ALBRECCOD_" + sGXsfl_59_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbRecCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1634 != 0 )
               {
                  if ( nRcdDeleted_1634 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1H41634( ) ;
                     load1H41634( ) ;
                     beforeValidate1H41634( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1H41634( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1634 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1H41634( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1H41634( ) ;
                           closeExtendedTableCursors1H41634( ) ;
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
                  if ( nRcdDeleted_1634 == 0 )
                  {
                     GXCCtl = "ALBRECCOD_" + sGXsfl_59_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef)) ;
         httpContext.changePostValue( edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc)) ;
         httpContext.changePostValue( edtDevCruUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevCruPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11683DevCruUnd_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11684DevCruPzs_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z47AlbREst_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z45AlbRef_"+sGXsfl_59_idx, GXutil.rtrim( Z45AlbRef)) ;
         httpContext.changePostValue( "ZT_"+"Z3613AlbRefDsc_"+sGXsfl_59_idx, GXutil.rtrim( Z3613AlbRefDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z58AlbRUniEnt_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z52AlbRPieEnt_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z56AlbRUni_"+sGXsfl_59_idx, GXutil.rtrim( Z56AlbRUni)) ;
         httpContext.changePostValue( "T11684DevCruPzs_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( O11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T54AlbRPieUti_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T11683DevCruUnd_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( O11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T60AlbRUniUti_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1634_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1634_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1634_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1634 != 0 )
         {
            httpContext.changePostValue( "ALBRECCOD_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREF_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREFDSC_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVCRUUND_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVCRUPZS_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruPzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIUTI_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIENT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEUTI_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEENT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1H40( )
   {
   }

   public void e111H42( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tdevcru_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdevcru_impl.this.A396EmprCod = GXv_char2[0] ;
      tdevcru_impl.this.AV11EmprNom = GXv_char3[0] ;
      tdevcru_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV32FirmaD ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
      tdevcru_impl.this.GXt_int5 = GXv_int6[0] ;
      AV32FirmaD = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32FirmaD", GXutil.str( AV32FirmaD, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32FirmaD), "9")));
      GXt_int5 = AV33Ws ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "WSDM", ""), GXv_int6) ;
      tdevcru_impl.this.GXt_int5 = GXv_int6[0] ;
      AV33Ws = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Ws", GXutil.str( AV33Ws, 1, 0));
      GXt_int5 = AV34Modhh ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "UPDHHS", ""), GXv_int6) ;
      tdevcru_impl.this.GXt_int5 = GXv_int6[0] ;
      AV34Modhh = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Modhh", GXutil.str( AV34Modhh, 1, 0));
      GXt_int5 = AV48Reg000 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REG000", ""), GXv_int6) ;
      tdevcru_impl.this.GXt_int5 = GXv_int6[0] ;
      AV48Reg000 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Reg000", GXutil.str( AV48Reg000, 1, 0));
      GXt_int7 = AV44Copias ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DEVEND", ""), GXv_int8) ;
      tdevcru_impl.this.GXt_int7 = GXv_int8[0] ;
      AV44Copias = (byte)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Copias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Copias), 2, 0));
      AV44Copias = (byte)(((0==AV44Copias) ? 1 : AV44Copias)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Copias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Copias), 2, 0));
      AV49Copias2 = AV44Copias ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Copias2), 2, 0));
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tdevcru_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV59EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tdevcru_impl.this.AV59EmprCod = GXv_char4[0] ;
      tdevcru_impl.this.AV11EmprNom = GXv_char3[0] ;
      tdevcru_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59EmprCod", AV59EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext9[0] = AV53WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV53WWPContext = GXv_SdtWWPContext9[0] ;
      AV54TrnContext.fromxml(AV55WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV54TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV63Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV64GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64GXV1), 8, 0));
         while ( AV64GXV1 <= AV54TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV58TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV54TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV64GXV1));
            if ( GXutil.strcmp(AV58TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CliCod") == 0 )
            {
               AV56Insert_CliCod = (int)(GXutil.lval( AV58TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV56Insert_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56Insert_CliCod), 6, 0));
            }
            else if ( GXutil.strcmp(AV58TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV57Insert_TrnCod = (short)(GXutil.lval( AV58TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV57Insert_TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57Insert_TrnCod), 4, 0));
            }
            AV64GXV1 = (int)(AV64GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64GXV1), 8, 0));
         }
      }
   }

   public void e121H42( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV54TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tdevcruww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void e131H42( )
   {
      /* 'Eliminar GUIA' Routine */
      returnInSub = false ;
      if ( ( AV32FirmaD == 1 ) && ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 ) && ( GXutil.strcmp(A11680DevCruAtId, " ") == 0 ) )
      {
         new app.pdeldevcru(remoteHandle, context).execute( A396EmprCod, A11669DevCruId) ;
         Gx_msg = httpContext.getMessage( "GUIA Eliminada ¡¡¡", "") ;
         httpContext.GX_msglist.addItem(Gx_msg);
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
   }

   public void zm1H41633( int GX_JID )
   {
      if ( ( GX_JID == 42 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11673DevCruSal = T01H47_A11673DevCruSal[0] ;
            Z11670DevCruFec = T01H47_A11670DevCruFec[0] ;
            Z11671DevCruEst = T01H47_A11671DevCruEst[0] ;
            Z11672DevCruMat = T01H47_A11672DevCruMat[0] ;
            Z11674DevCruHash = T01H47_A11674DevCruHash[0] ;
            Z11675DevCruDesc = T01H47_A11675DevCruDesc[0] ;
            Z11676DevCruDtSy = T01H47_A11676DevCruDtSy[0] ;
            Z11677DevCruGros = T01H47_A11677DevCruGros[0] ;
            Z11678DevCruStt = T01H47_A11678DevCruStt[0] ;
            Z11679DevCruEnvA = T01H47_A11679DevCruEnvA[0] ;
            Z11680DevCruAtId = T01H47_A11680DevCruAtId[0] ;
            Z11681DevCruAT = T01H47_A11681DevCruAT[0] ;
            Z11682DevCruObs = T01H47_A11682DevCruObs[0] ;
            Z252CliCod = T01H47_A252CliCod[0] ;
            Z840TrnCod = T01H47_A840TrnCod[0] ;
         }
         else
         {
            Z11673DevCruSal = A11673DevCruSal ;
            Z11670DevCruFec = A11670DevCruFec ;
            Z11671DevCruEst = A11671DevCruEst ;
            Z11672DevCruMat = A11672DevCruMat ;
            Z11674DevCruHash = A11674DevCruHash ;
            Z11675DevCruDesc = A11675DevCruDesc ;
            Z11676DevCruDtSy = A11676DevCruDtSy ;
            Z11677DevCruGros = A11677DevCruGros ;
            Z11678DevCruStt = A11678DevCruStt ;
            Z11679DevCruEnvA = A11679DevCruEnvA ;
            Z11680DevCruAtId = A11680DevCruAtId ;
            Z11681DevCruAT = A11681DevCruAT ;
            Z11682DevCruObs = A11682DevCruObs ;
            Z252CliCod = A252CliCod ;
            Z840TrnCod = A840TrnCod ;
         }
      }
      if ( GX_JID == -42 )
      {
         Z11669DevCruId = A11669DevCruId ;
         Z11673DevCruSal = A11673DevCruSal ;
         Z11670DevCruFec = A11670DevCruFec ;
         Z11671DevCruEst = A11671DevCruEst ;
         Z11672DevCruMat = A11672DevCruMat ;
         Z11674DevCruHash = A11674DevCruHash ;
         Z11675DevCruDesc = A11675DevCruDesc ;
         Z11676DevCruDtSy = A11676DevCruDtSy ;
         Z11677DevCruGros = A11677DevCruGros ;
         Z11678DevCruStt = A11678DevCruStt ;
         Z11679DevCruEnvA = A11679DevCruEnvA ;
         Z11680DevCruAtId = A11680DevCruAtId ;
         Z11681DevCruAT = A11681DevCruAT ;
         Z11682DevCruObs = A11682DevCruObs ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z840TrnCod = A840TrnCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z841TrnNom = A841TrnNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV63Pgmname = "TDEVCRU" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Pgmname", AV63Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV59EmprCod)==0) )
      {
         A396EmprCod = AV59EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01H48 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01H48_A407EmprNom[0] ;
      n407EmprNom = T01H48_n407EmprNom[0] ;
      pr_default.close(6);
      if ( ! (0==AV60DevCruId) )
      {
         A11669DevCruId = AV60DevCruId ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
      if ( ! (0==AV60DevCruId) )
      {
         edtDevCruId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
      }
      else
      {
         edtDevCruId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
      }
      if ( ! (0==AV60DevCruId) )
      {
         edtDevCruId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV56Insert_CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV57Insert_TrnCod) )
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV57Insert_TrnCod) )
      {
         A840TrnCod = AV57Insert_TrnCod ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         /* Using cursor T01H411 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         h840TrnCod = "" ;
         while ( (pr_default.getStatus(9) != 101) )
         {
            h840TrnCod = T01H411_A841TrnNom[0] ;
            n841TrnNom = T01H411_n841TrnNom[0] ;
            if (true) break;
         }
         pr_default.close(9);
         httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV56Insert_CliCod) )
      {
         A252CliCod = AV56Insert_CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         /* Using cursor T01H412 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         h252CliCod = "" ;
         while ( (pr_default.getStatus(10) != 101) )
         {
            h252CliCod = T01H412_A279CliNom[0] ;
            if (true) break;
         }
         pr_default.close(10);
         httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      }
      if ( ( AV32FirmaD == 1 ) && isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Pulsar Funcion F3", ""), 1, "");
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A11670DevCruFec)) && ( Gx_BScreen == 0 ) )
      {
         A11670DevCruFec = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A11676DevCruDtSy) && ( Gx_BScreen == 0 ) )
      {
         A11676DevCruDtSy = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( isIns( )  && (GXutil.strcmp("", A11680DevCruAtId)==0) && ( Gx_BScreen == 0 ) )
      {
         A11680DevCruAtId = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
      }
      if ( isIns( )  && (0==A11679DevCruEnvA) && ( Gx_BScreen == 0 ) )
      {
         A11679DevCruEnvA = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A11681DevCruAT)==0) && ( Gx_BScreen == 0 ) )
      {
         A11681DevCruAT = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11678DevCruStt)==0) && ( Gx_BScreen == 0 ) )
      {
         A11678DevCruStt = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01H410 */
         pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01H410_A841TrnNom[0] ;
         n841TrnNom = T01H410_n841TrnNom[0] ;
         pr_default.close(8);
         /* Using cursor T01H49 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01H49_A279CliNom[0] ;
         pr_default.close(7);
      }
   }

   public void load1H41633( )
   {
      /* Using cursor T01H413 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1633 = (short)(1) ;
         A11673DevCruSal = T01H413_A11673DevCruSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A407EmprNom = T01H413_A407EmprNom[0] ;
         n407EmprNom = T01H413_n407EmprNom[0] ;
         A11670DevCruFec = T01H413_A11670DevCruFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
         A279CliNom = T01H413_A279CliNom[0] ;
         A841TrnNom = T01H413_A841TrnNom[0] ;
         n841TrnNom = T01H413_n841TrnNom[0] ;
         A11671DevCruEst = T01H413_A11671DevCruEst[0] ;
         A11672DevCruMat = T01H413_A11672DevCruMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
         A11674DevCruHash = T01H413_A11674DevCruHash[0] ;
         A11675DevCruDesc = T01H413_A11675DevCruDesc[0] ;
         A11676DevCruDtSy = T01H413_A11676DevCruDtSy[0] ;
         A11677DevCruGros = T01H413_A11677DevCruGros[0] ;
         A11678DevCruStt = T01H413_A11678DevCruStt[0] ;
         A11679DevCruEnvA = T01H413_A11679DevCruEnvA[0] ;
         A11680DevCruAtId = T01H413_A11680DevCruAtId[0] ;
         A11681DevCruAT = T01H413_A11681DevCruAT[0] ;
         A11682DevCruObs = T01H413_A11682DevCruObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
         A252CliCod = T01H413_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01H413_A840TrnCod[0] ;
         n840TrnCod = T01H413_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         zm1H41633( -42) ;
      }
      pr_default.close(11);
      onLoadActions1H41633( ) ;
   }

   public void onLoadActions1H41633( )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A11673DevCruSal) && true /* After */ )
      {
         GXt_dtime10 = A11673DevCruSal ;
         GXv_dtime11[0] = GXt_dtime10 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime11) ;
         tdevcru_impl.this.GXt_dtime10 = GXv_dtime11[0] ;
         A11673DevCruSal = GXt_dtime10 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      h252CliCod = A279CliNom ;
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      h840TrnCod = A841TrnNom ;
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
   }

   public void checkExtendedTable1H41633( )
   {
      nIsDirty_1633 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h252CliCod)==0) )
      {
         nIsDirty_1633 = (short)(1) ;
         A252CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         nIsDirty_1633 = (short)(1) ;
         A279CliNom = h252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         /* Using cursor T01H414 */
         pr_default.execute(12, new Object[] {A279CliNom, A396EmprCod});
         A396EmprCod = T01H414_A396EmprCod[0] ;
         A252CliCod = T01H414_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A252CliCod = T01H414_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         if ( ! ( (pr_default.getStatus(12) == 101) ) )
         {
            pr_default.readNext(12);
            if ( ! ( (pr_default.getStatus(12) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre Cliente", "")}), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(12);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         nIsDirty_1633 = (short)(1) ;
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         nIsDirty_1633 = (short)(1) ;
         A841TrnNom = h840TrnCod ;
         n841TrnNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         /* Using cursor T01H415 */
         pr_default.execute(13, new Object[] {Boolean.valueOf(n841TrnNom), A841TrnNom, A396EmprCod});
         A396EmprCod = T01H415_A396EmprCod[0] ;
         A840TrnCod = T01H415_A840TrnCod[0] ;
         n840TrnCod = T01H415_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A840TrnCod = T01H415_A840TrnCod[0] ;
         n840TrnCod = T01H415_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         if ( ! ( (pr_default.getStatus(13) == 101) ) )
         {
            pr_default.readNext(13);
            if ( ! ( (pr_default.getStatus(13) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Transportista", "")}), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(13);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      if ( ( AV32FirmaD == 1 ) && ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 ) && ( isDlt( )  || isUpd( )  ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Comunicada AT", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( AV48Reg000 == 1 ) && ( A252CliCod == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente con valor 0", ""), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A11678DevCruStt, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia ANULADA", ""), 1, "DEVCRUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A11673DevCruSal) && true /* After */ )
      {
         nIsDirty_1633 = (short)(1) ;
         GXt_dtime10 = A11673DevCruSal ;
         GXv_dtime11[0] = GXt_dtime10 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime11) ;
         tdevcru_impl.this.GXt_dtime10 = GXv_dtime11[0] ;
         A11673DevCruSal = GXt_dtime10 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( isUpd( )  && ( A252CliCod != O252CliCod ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite cambio de Cliente", ""), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", h252CliCod)==0) )
      {
         nIsDirty_1633 = (short)(1) ;
         A252CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         nIsDirty_1633 = (short)(1) ;
         A279CliNom = h252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         /* Using cursor T01H416 */
         pr_default.execute(14, new Object[] {A279CliNom, A396EmprCod});
         A252CliCod = T01H416_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A252CliCod = T01H416_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         if ( ! ( (pr_default.getStatus(14) == 101) ) )
         {
            pr_default.readNext(14);
            if ( ! ( (pr_default.getStatus(14) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre Cliente", "")}), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(14);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         nIsDirty_1633 = (short)(1) ;
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         nIsDirty_1633 = (short)(1) ;
         A841TrnNom = h840TrnCod ;
         n841TrnNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         /* Using cursor T01H417 */
         pr_default.execute(15, new Object[] {Boolean.valueOf(n841TrnNom), A841TrnNom, A396EmprCod});
         A840TrnCod = T01H417_A840TrnCod[0] ;
         n840TrnCod = T01H417_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A840TrnCod = T01H417_A840TrnCod[0] ;
         n840TrnCod = T01H417_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         if ( ! ( (pr_default.getStatus(15) == 101) ) )
         {
            pr_default.readNext(15);
            if ( ! ( (pr_default.getStatus(15) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Transportista", "")}), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(15);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      /* Using cursor T01H49 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01H49_A279CliNom[0] ;
      pr_default.close(7);
      /* Using cursor T01H410 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A841TrnNom)==0) || (0==A840TrnCod) && n840TrnCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01H410_A841TrnNom[0] ;
      n841TrnNom = T01H410_n841TrnNom[0] ;
      pr_default.close(8);
   }

   public void closeExtendedTableCursors1H41633( )
   {
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_44( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01H418 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01H418_A279CliNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_45( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01H419 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A841TrnNom)==0) || (0==A840TrnCod) && n840TrnCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01H419_A841TrnNom[0] ;
      n841TrnNom = T01H419_n841TrnNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void getKey1H41633( )
   {
      /* Using cursor T01H420 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1633 = (short)(1) ;
      }
      else
      {
         RcdFound1633 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01H47 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01H47_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1H41633( 42) ;
         RcdFound1633 = (short)(1) ;
         A11669DevCruId = T01H47_A11669DevCruId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         A11673DevCruSal = T01H47_A11673DevCruSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11670DevCruFec = T01H47_A11670DevCruFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
         A11671DevCruEst = T01H47_A11671DevCruEst[0] ;
         A11672DevCruMat = T01H47_A11672DevCruMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
         A11674DevCruHash = T01H47_A11674DevCruHash[0] ;
         A11675DevCruDesc = T01H47_A11675DevCruDesc[0] ;
         A11676DevCruDtSy = T01H47_A11676DevCruDtSy[0] ;
         A11677DevCruGros = T01H47_A11677DevCruGros[0] ;
         A11678DevCruStt = T01H47_A11678DevCruStt[0] ;
         A11679DevCruEnvA = T01H47_A11679DevCruEnvA[0] ;
         A11680DevCruAtId = T01H47_A11680DevCruAtId[0] ;
         A11681DevCruAT = T01H47_A11681DevCruAT[0] ;
         A11682DevCruObs = T01H47_A11682DevCruObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
         A252CliCod = T01H47_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01H47_A840TrnCod[0] ;
         n840TrnCod = T01H47_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         O252CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z11669DevCruId = A11669DevCruId ;
         sMode1633 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1H41633( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1633 = (short)(0) ;
            initializeNonKey1H41633( ) ;
         }
         Gx_mode = sMode1633 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1633 = (short)(0) ;
         initializeNonKey1H41633( ) ;
         sMode1633 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1633 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1H41633( ) ;
      if ( RcdFound1633 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1633 = (short)(0) ;
      /* Using cursor T01H421 */
      pr_default.execute(19, new Object[] {Integer.valueOf(A11669DevCruId), A396EmprCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         while ( (pr_default.getStatus(19) != 101) && ( ( T01H421_A11669DevCruId[0] < A11669DevCruId ) ) && ( GXutil.strcmp(T01H421_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(19);
         }
         if ( (pr_default.getStatus(19) != 101) && ( ( T01H421_A11669DevCruId[0] > A11669DevCruId ) ) && ( GXutil.strcmp(T01H421_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11669DevCruId = T01H421_A11669DevCruId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            RcdFound1633 = (short)(1) ;
         }
      }
      pr_default.close(19);
   }

   public void move_previous( )
   {
      RcdFound1633 = (short)(0) ;
      /* Using cursor T01H422 */
      pr_default.execute(20, new Object[] {Integer.valueOf(A11669DevCruId), A396EmprCod});
      if ( (pr_default.getStatus(20) != 101) )
      {
         while ( (pr_default.getStatus(20) != 101) && ( ( T01H422_A11669DevCruId[0] > A11669DevCruId ) ) && ( GXutil.strcmp(T01H422_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(20);
         }
         if ( (pr_default.getStatus(20) != 101) && ( ( T01H422_A11669DevCruId[0] < A11669DevCruId ) ) && ( GXutil.strcmp(T01H422_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11669DevCruId = T01H422_A11669DevCruId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            RcdFound1633 = (short)(1) ;
         }
      }
      pr_default.close(20);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1H41633( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1H41633( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1633 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11669DevCruId != Z11669DevCruId ) )
            {
               A11669DevCruId = Z11669DevCruId ;
               httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "DEVCRUID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1H41633( ) ;
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11669DevCruId != Z11669DevCruId ) )
            {
               /* Insert record */
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1H41633( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "DEVCRUID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDevCruId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtDevCruId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1H41633( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11669DevCruId != Z11669DevCruId ) )
      {
         A11669DevCruId = Z11669DevCruId ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "DEVCRUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1H41633( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h252CliCod)==0) )
         {
            A252CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A279CliNom = h252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            /* Using cursor T01H423 */
            pr_default.execute(21, new Object[] {A279CliNom, A396EmprCod});
            A396EmprCod = T01H423_A396EmprCod[0] ;
            A252CliCod = T01H423_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A252CliCod = T01H423_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            if ( ! ( (pr_default.getStatus(21) == 101) ) )
            {
               pr_default.readNext(21);
               if ( ! ( (pr_default.getStatus(21) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre Cliente", "")}), 1, "CLICOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(21);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
         if ( (GXutil.strcmp("", h840TrnCod)==0) )
         {
            A840TrnCod = (short)(0) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            A841TrnNom = h840TrnCod ;
            n841TrnNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
            /* Using cursor T01H424 */
            pr_default.execute(22, new Object[] {Boolean.valueOf(n841TrnNom), A841TrnNom, A396EmprCod});
            A396EmprCod = T01H424_A396EmprCod[0] ;
            A840TrnCod = T01H424_A840TrnCod[0] ;
            n840TrnCod = T01H424_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            A840TrnCod = T01H424_A840TrnCod[0] ;
            n840TrnCod = T01H424_n840TrnCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            if ( ! ( (pr_default.getStatus(22) == 101) ) )
            {
               pr_default.readNext(22);
               if ( ! ( (pr_default.getStatus(22) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Transportista", "")}), 1, "TRNCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTrnCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(22);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01H46 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCRU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || !( GXutil.dateCompare(Z11673DevCruSal, T01H46_A11673DevCruSal[0]) ) || !( GXutil.dateCompare(GXutil.resetTime(Z11670DevCruFec), GXutil.resetTime(T01H46_A11670DevCruFec[0])) ) || ( Z11671DevCruEst != T01H46_A11671DevCruEst[0] ) || ( GXutil.strcmp(Z11672DevCruMat, T01H46_A11672DevCruMat[0]) != 0 ) || ( GXutil.strcmp(Z11674DevCruHash, T01H46_A11674DevCruHash[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11675DevCruDesc, T01H46_A11675DevCruDesc[0]) != 0 ) || !( GXutil.dateCompare(Z11676DevCruDtSy, T01H46_A11676DevCruDtSy[0]) ) || ( DecimalUtil.compareTo(Z11677DevCruGros, T01H46_A11677DevCruGros[0]) != 0 ) || ( GXutil.strcmp(Z11678DevCruStt, T01H46_A11678DevCruStt[0]) != 0 ) || ( Z11679DevCruEnvA != T01H46_A11679DevCruEnvA[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11680DevCruAtId, T01H46_A11680DevCruAtId[0]) != 0 ) || ( GXutil.strcmp(Z11681DevCruAT, T01H46_A11681DevCruAT[0]) != 0 ) || ( GXutil.strcmp(Z11682DevCruObs, T01H46_A11682DevCruObs[0]) != 0 ) || ( Z252CliCod != T01H46_A252CliCod[0] ) || ( Z840TrnCod != T01H46_A840TrnCod[0] ) )
         {
            if ( !( GXutil.dateCompare(Z11673DevCruSal, T01H46_A11673DevCruSal[0]) ) )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"DevCruSal");
               GXutil.writeLogRaw("Old: ",Z11673DevCruSal);
               GXutil.writeLogRaw("Current: ",T01H46_A11673DevCruSal[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11670DevCruFec), GXutil.resetTime(T01H46_A11670DevCruFec[0])) ) )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"DevCruFec");
               GXutil.writeLogRaw("Old: ",Z11670DevCruFec);
               GXutil.writeLogRaw("Current: ",T01H46_A11670DevCruFec[0]);
            }
            if ( Z11671DevCruEst != T01H46_A11671DevCruEst[0] )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"DevCruEst");
               GXutil.writeLogRaw("Old: ",Z11671DevCruEst);
               GXutil.writeLogRaw("Current: ",T01H46_A11671DevCruEst[0]);
            }
            if ( GXutil.strcmp(Z11672DevCruMat, T01H46_A11672DevCruMat[0]) != 0 )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"DevCruMat");
               GXutil.writeLogRaw("Old: ",Z11672DevCruMat);
               GXutil.writeLogRaw("Current: ",T01H46_A11672DevCruMat[0]);
            }
            if ( GXutil.strcmp(Z11674DevCruHash, T01H46_A11674DevCruHash[0]) != 0 )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"DevCruHash");
               GXutil.writeLogRaw("Old: ",Z11674DevCruHash);
               GXutil.writeLogRaw("Current: ",T01H46_A11674DevCruHash[0]);
            }
            if ( GXutil.strcmp(Z11675DevCruDesc, T01H46_A11675DevCruDesc[0]) != 0 )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"DevCruDesc");
               GXutil.writeLogRaw("Old: ",Z11675DevCruDesc);
               GXutil.writeLogRaw("Current: ",T01H46_A11675DevCruDesc[0]);
            }
            if ( !( GXutil.dateCompare(Z11676DevCruDtSy, T01H46_A11676DevCruDtSy[0]) ) )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"DevCruDtSy");
               GXutil.writeLogRaw("Old: ",Z11676DevCruDtSy);
               GXutil.writeLogRaw("Current: ",T01H46_A11676DevCruDtSy[0]);
            }
            if ( DecimalUtil.compareTo(Z11677DevCruGros, T01H46_A11677DevCruGros[0]) != 0 )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"DevCruGros");
               GXutil.writeLogRaw("Old: ",Z11677DevCruGros);
               GXutil.writeLogRaw("Current: ",T01H46_A11677DevCruGros[0]);
            }
            if ( GXutil.strcmp(Z11678DevCruStt, T01H46_A11678DevCruStt[0]) != 0 )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"DevCruStt");
               GXutil.writeLogRaw("Old: ",Z11678DevCruStt);
               GXutil.writeLogRaw("Current: ",T01H46_A11678DevCruStt[0]);
            }
            if ( Z11679DevCruEnvA != T01H46_A11679DevCruEnvA[0] )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"DevCruEnvA");
               GXutil.writeLogRaw("Old: ",Z11679DevCruEnvA);
               GXutil.writeLogRaw("Current: ",T01H46_A11679DevCruEnvA[0]);
            }
            if ( GXutil.strcmp(Z11680DevCruAtId, T01H46_A11680DevCruAtId[0]) != 0 )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"DevCruAtId");
               GXutil.writeLogRaw("Old: ",Z11680DevCruAtId);
               GXutil.writeLogRaw("Current: ",T01H46_A11680DevCruAtId[0]);
            }
            if ( GXutil.strcmp(Z11681DevCruAT, T01H46_A11681DevCruAT[0]) != 0 )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"DevCruAT");
               GXutil.writeLogRaw("Old: ",Z11681DevCruAT);
               GXutil.writeLogRaw("Current: ",T01H46_A11681DevCruAT[0]);
            }
            if ( GXutil.strcmp(Z11682DevCruObs, T01H46_A11682DevCruObs[0]) != 0 )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"DevCruObs");
               GXutil.writeLogRaw("Old: ",Z11682DevCruObs);
               GXutil.writeLogRaw("Current: ",T01H46_A11682DevCruObs[0]);
            }
            if ( Z252CliCod != T01H46_A252CliCod[0] )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01H46_A252CliCod[0]);
            }
            if ( Z840TrnCod != T01H46_A840TrnCod[0] )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01H46_A840TrnCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVCRU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1H41633( )
   {
      beforeValidate1H41633( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H41633( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1H41633( 0) ;
         checkOptimisticConcurrency1H41633( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1H41633( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1H41633( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01H425 */
                  pr_default.execute(23, new Object[] {Integer.valueOf(A11669DevCruId), A11673DevCruSal, A11670DevCruFec, Byte.valueOf(A11671DevCruEst), A11672DevCruMat, A11674DevCruHash, A11675DevCruDesc, A11676DevCruDtSy, A11677DevCruGros, A11678DevCruStt, Byte.valueOf(A11679DevCruEnvA), A11680DevCruAtId, A11681DevCruAT, A11682DevCruObs, A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCRU");
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
                        processLevel1H41633( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1H40( ) ;
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
            load1H41633( ) ;
         }
         endLevel1H41633( ) ;
      }
      closeExtendedTableCursors1H41633( ) ;
   }

   public void update1H41633( )
   {
      beforeValidate1H41633( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H41633( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1H41633( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1H41633( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1H41633( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01H426 */
                  pr_default.execute(24, new Object[] {A11673DevCruSal, A11670DevCruFec, Byte.valueOf(A11671DevCruEst), A11672DevCruMat, A11674DevCruHash, A11675DevCruDesc, A11676DevCruDtSy, A11677DevCruGros, A11678DevCruStt, Byte.valueOf(A11679DevCruEnvA), A11680DevCruAtId, A11681DevCruAT, A11682DevCruObs, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), A396EmprCod, Integer.valueOf(A11669DevCruId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCRU");
                  if ( (pr_default.getStatus(24) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCRU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1H41633( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1H41633( ) ;
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
         endLevel1H41633( ) ;
      }
      closeExtendedTableCursors1H41633( ) ;
   }

   public void deferredUpdate1H41633( )
   {
   }

   public void delete( )
   {
      beforeValidate1H41633( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1H41633( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1H41633( ) ;
         afterConfirm1H41633( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1H41633( ) ;
            if ( AnyError == 0 )
            {
               scanStart1H41634( ) ;
               while ( RcdFound1634 != 0 )
               {
                  getByPrimaryKey1H41634( ) ;
                  delete1H41634( ) ;
                  scanNext1H41634( ) ;
               }
               scanEnd1H41634( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01H427 */
                  pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCRU");
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
      sMode1633 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1H41633( ) ;
      Gx_mode = sMode1633 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1H41633( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isUpd( )  && ( A252CliCod != O252CliCod ) && true /* After */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite cambio de Cliente", ""), 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( ( AV32FirmaD == 1 ) && ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 ) && ( isDlt( )  || isUpd( )  ) && true /* Level */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Comunicada AT", ""), 1, "");
            AnyError = (short)(1) ;
         }
         /* Using cursor T01H428 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01H428_A279CliNom[0] ;
         pr_default.close(26);
         /* Using cursor T01H429 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01H429_A841TrnNom[0] ;
         n841TrnNom = T01H429_n841TrnNom[0] ;
         pr_default.close(27);
      }
   }

   public void processNestedLevel1H41634( )
   {
      nGXsfl_59_idx = 0 ;
      while ( nGXsfl_59_idx < nRC_GXsfl_59 )
      {
         readRow1H41634( ) ;
         if ( ( nRcdExists_1634 != 0 ) || ( nIsMod_1634 != 0 ) )
         {
            standaloneNotModal1H41634( ) ;
            getKey1H41634( ) ;
            if ( ( nRcdExists_1634 == 0 ) && ( nRcdDeleted_1634 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1H41634( ) ;
            }
            else
            {
               if ( RcdFound1634 != 0 )
               {
                  if ( ( nRcdDeleted_1634 != 0 ) && ( nRcdExists_1634 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1H41634( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1634 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1H41634( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1634 == 0 )
                  {
                     GXCCtl = "ALBRECCOD_" + sGXsfl_59_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef)) ;
         httpContext.changePostValue( edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc)) ;
         httpContext.changePostValue( edtDevCruUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevCruPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11683DevCruUnd_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11684DevCruPzs_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z47AlbREst_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z45AlbRef_"+sGXsfl_59_idx, GXutil.rtrim( Z45AlbRef)) ;
         httpContext.changePostValue( "ZT_"+"Z3613AlbRefDsc_"+sGXsfl_59_idx, GXutil.rtrim( Z3613AlbRefDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z58AlbRUniEnt_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z52AlbRPieEnt_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z56AlbRUni_"+sGXsfl_59_idx, GXutil.rtrim( Z56AlbRUni)) ;
         httpContext.changePostValue( "T11684DevCruPzs_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( O11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T54AlbRPieUti_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T11683DevCruUnd_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( O11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T60AlbRUniUti_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1634_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1634_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1634_"+sGXsfl_59_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1634 != 0 )
         {
            httpContext.changePostValue( "ALBRECCOD_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREF_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBREFDSC_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVCRUUND_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVCRUPZS_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruPzs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIUTI_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRUNIENT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEUTI_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRPIEENT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1H41634( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1634 = (short)(0) ;
      nIsMod_1634 = (short)(0) ;
      nRcdDeleted_1634 = (short)(0) ;
   }

   public void processLevel1H41633( )
   {
      /* Save parent mode. */
      sMode1633 = Gx_mode ;
      processNestedLevel1H41634( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1633 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1H41633( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1H41633( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdevcru");
         if ( AnyError == 0 )
         {
            confirmValues1H40( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdevcru");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1H41633( )
   {
      /* Scan By routine */
      /* Using cursor T01H430 */
      pr_default.execute(28, new Object[] {A396EmprCod});
      RcdFound1633 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1633 = (short)(1) ;
         A11669DevCruId = T01H430_A11669DevCruId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1H41633( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound1633 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1633 = (short)(1) ;
         A11669DevCruId = T01H430_A11669DevCruId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
   }

   public void scanEnd1H41633( )
   {
      pr_default.close(28);
   }

   public void afterConfirm1H41633( )
   {
      /* After Confirm Rules */
      if ( (0==A11669DevCruId) && true /* After */ )
      {
         GXv_int8[0] = A11669DevCruId ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "022400", GXv_int8) ;
         tdevcru_impl.this.A11669DevCruId = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
   }

   public void beforeInsert1H41633( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1H41633( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1H41633( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1H41633( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1H41633( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1H41633( )
   {
      edtDevCruId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
      edtDevCruFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruFec_Enabled), 5, 0), true);
      edtDevCruSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruSal_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtDevCruMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruMat_Enabled), 5, 0), true);
      edtDevCruObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruObs_Enabled), 5, 0), true);
   }

   public void zm1H41634( int GX_JID )
   {
      if ( ( GX_JID == 46 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11683DevCruUnd = T01H43_A11683DevCruUnd[0] ;
            Z11684DevCruPzs = T01H43_A11684DevCruPzs[0] ;
         }
         else
         {
            Z11683DevCruUnd = A11683DevCruUnd ;
            Z11684DevCruPzs = A11684DevCruPzs ;
         }
      }
      if ( ( GX_JID == 47 ) || ( GX_JID == 0 ) )
      {
         Z47AlbREst = T01H45_A47AlbREst[0] ;
         Z45AlbRef = T01H45_A45AlbRef[0] ;
         Z3613AlbRefDsc = T01H45_A3613AlbRefDsc[0] ;
         Z58AlbRUniEnt = T01H45_A58AlbRUniEnt[0] ;
         Z52AlbRPieEnt = T01H45_A52AlbRPieEnt[0] ;
         Z56AlbRUni = T01H45_A56AlbRUni[0] ;
      }
      if ( GX_JID == -46 )
      {
         Z11669DevCruId = A11669DevCruId ;
         Z11683DevCruUnd = A11683DevCruUnd ;
         Z11684DevCruPzs = A11684DevCruPzs ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z47AlbREst = A47AlbREst ;
         Z45AlbRef = A45AlbRef ;
         Z3613AlbRefDsc = A3613AlbRefDsc ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z56AlbRUni = A56AlbRUni ;
      }
   }

   public void standaloneNotModal1H41634( )
   {
      /* * Property Forecolor not supported in */
      /* * Property Forecolor not supported in */
      /* * Property Forecolor not supported in */
      /* * Property Forecolor not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('rgb(',1),t(0,3),t(',',7),t(0,3),t(',',7),t(0,3),t(')',4) ]
         Target    : [ t('&Albrpiedis',23),t('Forecolor',3) ]
         ForType   : 29
         Type      : []
      */
      /* * Property Forecolor not supported in */
      /* * Property Forecolor not supported in */
      /* * Property Forecolor not supported in */
      /* * Property Forecolor not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('rgb(',1),t(0,3),t(',',7),t(0,3),t(',',7),t(0,3),t(')',4) ]
         Target    : [ t('&Albrudis',23),t('Forecolor',3) ]
         ForType   : 29
         Type      : []
      */
   }

   public void standaloneModal1H41634( )
   {
      if ( ( AV32FirmaD == 1 ) && ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 ) && ( isUpd( )  || isDlt( )  ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Comunicada AT", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      }
      else
      {
         edtAlbRecCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      }
   }

   public void load1H41634( )
   {
      /* Using cursor T01H431 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1634 = (short)(1) ;
         A60AlbRUniUti = T01H431_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01H431_A54AlbRPieUti[0] ;
         A47AlbREst = T01H431_A47AlbREst[0] ;
         A45AlbRef = T01H431_A45AlbRef[0] ;
         A3613AlbRefDsc = T01H431_A3613AlbRefDsc[0] ;
         A11683DevCruUnd = T01H431_A11683DevCruUnd[0] ;
         A11684DevCruPzs = T01H431_A11684DevCruPzs[0] ;
         A58AlbRUniEnt = T01H431_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = T01H431_A52AlbRPieEnt[0] ;
         A56AlbRUni = T01H431_A56AlbRUni[0] ;
         zm1H41634( -46) ;
      }
      pr_default.close(29);
      onLoadActions1H41634( ) ;
   }

   public void onLoadActions1H41634( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         A60AlbRUniUti = O60AlbRUniUti.subtract(A11683DevCruUnd) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A60AlbRUniUti = O60AlbRUniUti.add(A11683DevCruUnd).subtract(O11683DevCruUnd) ;
         }
      }
      if ( isDlt( )  && true /* Level */ )
      {
         A54AlbRPieUti = (int)(O54AlbRPieUti-A11684DevCruPzs) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti+A11684DevCruPzs-O11684DevCruPzs) ;
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
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
      {
         A47AlbREst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
         {
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
   }

   public void checkExtendedTable1H41634( )
   {
      nIsDirty_1634 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1H41634( ) ;
      /* Using cursor T01H45 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A60AlbRUniUti = T01H45_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01H45_A54AlbRPieUti[0] ;
      A47AlbREst = T01H45_A47AlbREst[0] ;
      A45AlbRef = T01H45_A45AlbRef[0] ;
      A3613AlbRefDsc = T01H45_A3613AlbRefDsc[0] ;
      A58AlbRUniEnt = T01H45_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01H45_A52AlbRPieEnt[0] ;
      A56AlbRUni = T01H45_A56AlbRUni[0] ;
      nIsDirty_1634 = (short)(1) ;
      O54AlbRPieUti = A54AlbRPieUti ;
      nIsDirty_1634 = (short)(1) ;
      O60AlbRUniUti = A60AlbRUniUti ;
      pr_default.close(3);
      if ( isDlt( )  && true /* Level */ )
      {
         nIsDirty_1634 = (short)(1) ;
         A60AlbRUniUti = O60AlbRUniUti.subtract(A11683DevCruUnd) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_1634 = (short)(1) ;
            A60AlbRUniUti = O60AlbRUniUti.add(A11683DevCruUnd).subtract(O11683DevCruUnd) ;
         }
      }
      if ( isDlt( )  && true /* Level */ )
      {
         nIsDirty_1634 = (short)(1) ;
         A54AlbRPieUti = (int)(O54AlbRPieUti-A11684DevCruPzs) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_1634 = (short)(1) ;
            A54AlbRPieUti = (int)(O54AlbRPieUti+A11684DevCruPzs-O11684DevCruPzs) ;
         }
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_1634 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_1634 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            nIsDirty_1634 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      nIsDirty_1634 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
      {
         nIsDirty_1634 = (short)(1) ;
         A47AlbREst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
         {
            nIsDirty_1634 = (short)(1) ;
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
      if ( ( A47AlbREst == 1 ) && true /* After */ )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion CERRADA.Sin Unidades/Piezas", ""), 0, GXCCtl);
      }
      if ( true /* After */ && ( isIns( )  || isUpd( )  ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_int12[0] = AV38AlbRPieDis ;
         GXv_decimal13[0] = AV39AlbRUniDis ;
         GXv_int14[0] = AV40AlbRPDis ;
         GXv_decimal15[0] = AV41AlbRUDis ;
         GXv_char3[0] = AV42AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int12, GXv_decimal13, GXv_int14, GXv_decimal15, GXv_char3) ;
         tdevcru_impl.this.A396EmprCod = GXv_char4[0] ;
         tdevcru_impl.this.A44AlbRecCod = GXv_int8[0] ;
         tdevcru_impl.this.AV38AlbRPieDis = GXv_int12[0] ;
         tdevcru_impl.this.AV39AlbRUniDis = GXv_decimal13[0] ;
         tdevcru_impl.this.AV40AlbRPDis = GXv_int14[0] ;
         tdevcru_impl.this.AV41AlbRUDis = GXv_decimal15[0] ;
         tdevcru_impl.this.AV42AlbRUni = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV38AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38AlbRPieDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV39AlbRUniDis", GXutil.ltrimstr( AV39AlbRUniDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV40AlbRPDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40AlbRPDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV41AlbRUDis", GXutil.ltrimstr( AV41AlbRUDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV42AlbRUni", AV42AlbRUni);
      }
      if ( true /* After */ && ! (0==A44AlbRecCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int14[0] = A44AlbRecCod ;
         GXv_int12[0] = A252CliCod ;
         GXv_int6[0] = AV43FlagCli ;
         new app.pctrcli(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_int12, GXv_int6) ;
         tdevcru_impl.this.A396EmprCod = GXv_char4[0] ;
         tdevcru_impl.this.A44AlbRecCod = GXv_int14[0] ;
         tdevcru_impl.this.A252CliCod = GXv_int12[0] ;
         tdevcru_impl.this.AV43FlagCli = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43FlagCli", GXutil.str( AV43FlagCli, 1, 0));
      }
      if ( true /* After */ && ( AV43FlagCli == 1 ) && ! (0==A44AlbRecCod) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente N Recepcion DIFERENTE Cliente Cabecera", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         GXCCtl = "DEVCRUUND_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades a devolver superior a la disponible", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruUnd_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A11683DevCruUnd.doubleValue() == 0 ) && true /* After */ )
      {
         GXCCtl = "DEVCRUUND_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Unidades incorrectas", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruUnd_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
      {
         GXCCtl = "DEVCRUPZS_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO. Cantidad de piezas a devolver superior a la disponible", ""), 0, GXCCtl);
      }
   }

   public void closeExtendedTableCursors1H41634( )
   {
      pr_default.close(2);
   }

   public void enableDisable1H41634( )
   {
   }

   public void gxload_47( String A396EmprCod ,
                          int A44AlbRecCod )
   {
      /* Using cursor T01H45 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A60AlbRUniUti = T01H45_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01H45_A54AlbRPieUti[0] ;
      A47AlbREst = T01H45_A47AlbREst[0] ;
      A45AlbRef = T01H45_A45AlbRef[0] ;
      A3613AlbRefDsc = T01H45_A3613AlbRefDsc[0] ;
      A58AlbRUniEnt = T01H45_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01H45_A52AlbRPieEnt[0] ;
      A56AlbRUni = T01H45_A56AlbRUni[0] ;
      O54AlbRPieUti = A54AlbRPieUti ;
      O60AlbRUniUti = A60AlbRUniUti ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3613AlbRefDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A56AlbRUni))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(3) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
   }

   public void getKey1H41634( )
   {
      /* Using cursor T01H432 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1634 = (short)(1) ;
      }
      else
      {
         RcdFound1634 = (short)(0) ;
      }
      pr_default.close(30);
   }

   public void getByPrimaryKey1H41634( )
   {
      /* Using cursor T01H43 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01H43_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1H41634( 46) ;
         RcdFound1634 = (short)(1) ;
         initializeNonKey1H41634( ) ;
         A11683DevCruUnd = T01H43_A11683DevCruUnd[0] ;
         A11684DevCruPzs = T01H43_A11684DevCruPzs[0] ;
         A44AlbRecCod = T01H43_A44AlbRecCod[0] ;
         O11684DevCruPzs = A11684DevCruPzs ;
         O11683DevCruUnd = A11683DevCruUnd ;
         Z396EmprCod = A396EmprCod ;
         Z11669DevCruId = A11669DevCruId ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode1634 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1H41634( ) ;
         Gx_mode = sMode1634 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1634 = (short)(0) ;
         initializeNonKey1H41634( ) ;
         sMode1634 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1H41634( ) ;
         Gx_mode = sMode1634 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1H41634( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1H41634( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01H42 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCR1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11683DevCruUnd, T01H42_A11683DevCruUnd[0]) != 0 ) || ( Z11684DevCruPzs != T01H42_A11684DevCruPzs[0] ) )
         {
            if ( DecimalUtil.compareTo(Z11683DevCruUnd, T01H42_A11683DevCruUnd[0]) != 0 )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"DevCruUnd");
               GXutil.writeLogRaw("Old: ",Z11683DevCruUnd);
               GXutil.writeLogRaw("Current: ",T01H42_A11683DevCruUnd[0]);
            }
            if ( Z11684DevCruPzs != T01H42_A11684DevCruPzs[0] )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"DevCruPzs");
               GXutil.writeLogRaw("Old: ",Z11684DevCruPzs);
               GXutil.writeLogRaw("Current: ",T01H42_A11684DevCruPzs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVCR1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01H433 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(31) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( Z47AlbREst != T01H433_A47AlbREst[0] ) || ( GXutil.strcmp(Z45AlbRef, T01H433_A45AlbRef[0]) != 0 ) || ( GXutil.strcmp(Z3613AlbRefDsc, T01H433_A3613AlbRefDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01H433_A58AlbRUniEnt[0]) != 0 ) || ( Z52AlbRPieEnt != T01H433_A52AlbRPieEnt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z56AlbRUni, T01H433_A56AlbRUni[0]) != 0 ) )
         {
            if ( Z47AlbREst != T01H433_A47AlbREst[0] )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T01H433_A47AlbREst[0]);
            }
            if ( GXutil.strcmp(Z45AlbRef, T01H433_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T01H433_A45AlbRef[0]);
            }
            if ( GXutil.strcmp(Z3613AlbRefDsc, T01H433_A3613AlbRefDsc[0]) != 0 )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"AlbRefDsc");
               GXutil.writeLogRaw("Old: ",Z3613AlbRefDsc);
               GXutil.writeLogRaw("Current: ",T01H433_A3613AlbRefDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01H433_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T01H433_A58AlbRUniEnt[0]);
            }
            if ( Z52AlbRPieEnt != T01H433_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T01H433_A52AlbRPieEnt[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T01H433_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("tdevcru:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T01H433_A56AlbRUni[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1H41634( )
   {
      beforeValidate1H41634( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H41634( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1H41634( 0) ;
         checkOptimisticConcurrency1H41634( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1H41634( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1H41634( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01H434 */
                  pr_default.execute(32, new Object[] {Integer.valueOf(A11669DevCruId), A11683DevCruUnd, Integer.valueOf(A11684DevCruPzs), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCR1");
                  if ( (pr_default.getStatus(32) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11H41634( ) ;
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
            load1H41634( ) ;
         }
         endLevel1H41634( ) ;
      }
      closeExtendedTableCursors1H41634( ) ;
   }

   public void update1H41634( )
   {
      beforeValidate1H41634( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H41634( ) ;
      }
      if ( ( nIsMod_1634 != 0 ) || ( nIsDirty_1634 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1H41634( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1H41634( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1H41634( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01H435 */
                     pr_default.execute(33, new Object[] {A11683DevCruUnd, Integer.valueOf(A11684DevCruPzs), A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCR1");
                     if ( (pr_default.getStatus(33) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCR1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1H41634( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           updateTablesN11H41634( ) ;
                           getByPrimaryKey1H41634( ) ;
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
            endLevel1H41634( ) ;
         }
      }
      closeExtendedTableCursors1H41634( ) ;
   }

   public void deferredUpdate1H41634( )
   {
   }

   public void delete1H41634( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1H41634( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1H41634( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1H41634( ) ;
         afterConfirm1H41634( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1H41634( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01H436 */
               pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCR1");
               if ( AnyError == 0 )
               {
                  updateTablesN11H41634( ) ;
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
      sMode1634 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1H41634( ) ;
      Gx_mode = sMode1634 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1H41634( )
   {
      standaloneModal1H41634( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* After */ && ( isIns( )  || isUpd( )  ) )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int14[0] = A44AlbRecCod ;
            GXv_int12[0] = AV38AlbRPieDis ;
            GXv_decimal15[0] = AV39AlbRUniDis ;
            GXv_int8[0] = AV40AlbRPDis ;
            GXv_decimal13[0] = AV41AlbRUDis ;
            GXv_char3[0] = AV42AlbRUni ;
            new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_int12, GXv_decimal15, GXv_int8, GXv_decimal13, GXv_char3) ;
            tdevcru_impl.this.A396EmprCod = GXv_char4[0] ;
            tdevcru_impl.this.A44AlbRecCod = GXv_int14[0] ;
            tdevcru_impl.this.AV38AlbRPieDis = GXv_int12[0] ;
            tdevcru_impl.this.AV39AlbRUniDis = GXv_decimal15[0] ;
            tdevcru_impl.this.AV40AlbRPDis = GXv_int8[0] ;
            tdevcru_impl.this.AV41AlbRUDis = GXv_decimal13[0] ;
            tdevcru_impl.this.AV42AlbRUni = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV38AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38AlbRPieDis), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV39AlbRUniDis", GXutil.ltrimstr( AV39AlbRUniDis, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV40AlbRPDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40AlbRPDis), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV41AlbRUDis", GXutil.ltrimstr( AV41AlbRUDis, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV42AlbRUni", AV42AlbRUni);
         }
         /* Using cursor T01H437 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Z47AlbREst = T01H437_A47AlbREst[0] ;
         Z45AlbRef = T01H437_A45AlbRef[0] ;
         Z3613AlbRefDsc = T01H437_A3613AlbRefDsc[0] ;
         Z58AlbRUniEnt = T01H437_A58AlbRUniEnt[0] ;
         Z52AlbRPieEnt = T01H437_A52AlbRPieEnt[0] ;
         Z56AlbRUni = T01H437_A56AlbRUni[0] ;
         A60AlbRUniUti = T01H437_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01H437_A54AlbRPieUti[0] ;
         A47AlbREst = T01H437_A47AlbREst[0] ;
         A45AlbRef = T01H437_A45AlbRef[0] ;
         A3613AlbRefDsc = T01H437_A3613AlbRefDsc[0] ;
         A58AlbRUniEnt = T01H437_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = T01H437_A52AlbRPieEnt[0] ;
         A56AlbRUni = T01H437_A56AlbRUni[0] ;
         O54AlbRPieUti = A54AlbRPieUti ;
         O60AlbRUniUti = A60AlbRUniUti ;
         pr_default.close(35);
         if ( isDlt( )  && true /* Level */ )
         {
            A60AlbRUniUti = O60AlbRUniUti.subtract(A11683DevCruUnd) ;
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A60AlbRUniUti = O60AlbRUniUti.add(A11683DevCruUnd).subtract(O11683DevCruUnd) ;
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
         if ( isDlt( )  && true /* Level */ )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti-A11684DevCruPzs) ;
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A54AlbRPieUti = (int)(O54AlbRPieUti+A11684DevCruPzs-O11684DevCruPzs) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
            {
               A47AlbREst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
         }
      }
   }

   public void updateTablesN11H41634( )
   {
      /* Using cursor T01H438 */
      pr_default.execute(36, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel1H41634( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(31);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1H41634( )
   {
      /* Scan By routine */
      /* Using cursor T01H439 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      RcdFound1634 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound1634 = (short)(1) ;
         A44AlbRecCod = T01H439_A44AlbRecCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1H41634( )
   {
      /* Scan next routine */
      pr_default.readNext(37);
      RcdFound1634 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound1634 = (short)(1) ;
         A44AlbRecCod = T01H439_A44AlbRecCod[0] ;
      }
   }

   public void scanEnd1H41634( )
   {
      pr_default.close(37);
   }

   public void afterConfirm1H41634( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1H41634( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1H41634( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1H41634( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1H41634( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1H41634( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1H41634( )
   {
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtAlbRefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtDevCruUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruUnd_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtDevCruPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruPzs_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_59_Refreshing);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_59_Refreshing);
   }

   public void send_integrity_lvl_hashes1H41634( )
   {
   }

   public void send_integrity_lvl_hashes1H41633( )
   {
   }

   public void subsflControlProps_591634( )
   {
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_59_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_59_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_59_idx ;
      edtDevCruUnd_Internalname = "DEVCRUUND_"+sGXsfl_59_idx ;
      edtDevCruPzs_Internalname = "DEVCRUPZS_"+sGXsfl_59_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_59_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_59_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_59_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_59_idx ;
   }

   public void subsflControlProps_fel_591634( )
   {
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_59_fel_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_59_fel_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_59_fel_idx ;
      edtDevCruUnd_Internalname = "DEVCRUUND_"+sGXsfl_59_fel_idx ;
      edtDevCruPzs_Internalname = "DEVCRUPZS_"+sGXsfl_59_fel_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_59_fel_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_59_fel_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_59_fel_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_59_fel_idx ;
   }

   public void addRow1H41634( )
   {
      nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_591634( ) ;
      sendRow1H41634( ) ;
   }

   public void sendRow1H41634( )
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
         if ( ((int)((nGXsfl_59_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1634_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+"e141h41634_client"+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRef_Internalname,GXutil.rtrim( A45AlbRef),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRef_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRefDsc_Internalname,GXutil.rtrim( A3613AlbRefDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRefDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRefDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1634_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruUnd_Internalname,GXutil.ltrim( localUtil.ntoc( A11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDevCruUnd_Enabled!=0) ? localUtil.format( A11683DevCruUnd, "ZZZZZ9.99") : localUtil.format( A11683DevCruUnd, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruUnd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDevCruUnd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1634_" + sGXsfl_59_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_59_idx + "',59)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruPzs_Internalname,GXutil.ltrim( localUtil.ntoc( A11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDevCruPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11684DevCruPzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11684DevCruPzs), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruPzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDevCruPzs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniUti_Internalname,GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniUti_Enabled!=0) ? localUtil.format( A60AlbRUniUti, "ZZZZZ9.99") : localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRUniUti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRUniEnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieUti_Internalname,GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieUti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRPieUti_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRPieEnt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(59),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1H41634( ) ;
      GXCCtl = "Z44AlbRecCod_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11683DevCruUnd_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11684DevCruPzs_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z47AlbREst_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z45AlbRef_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z45AlbRef));
      GXCCtl = "Z3613AlbRefDsc_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3613AlbRefDsc));
      GXCCtl = "Z58AlbRUniEnt_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z52AlbRPieEnt_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z56AlbRUni_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z56AlbRUni));
      GXCCtl = "O11684DevCruPzs_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O54AlbRPieUti_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O11683DevCruUnd_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O60AlbRUniUti_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "ALBRUNIDIS_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "ALBRPIEDIS_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "ALBREST_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1634_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1634_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1634_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1634, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_59_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV54TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV54TrnContext);
      }
      GXCCtl = "vFIRMAD_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV32FirmaD, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "DEVCRUATID_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A11680DevCruAtId));
      GXCCtl = "EMPRCOD_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "vEMPRCOD_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV59EmprCod));
      GXCCtl = "vDEVCRUID_" + sGXsfl_59_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV60DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOD_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREF_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREFDSC_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUUND_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUPZS_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruPzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIUTI_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIENT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEUTI_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEENT_"+sGXsfl_59_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1H41634( )
   {
      nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_591634( ) ;
      edtAlbRecCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOD_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBREF_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRefDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBREFDSC_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDevCruUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVCRUUND_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDevCruPzs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVCRUPZS_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRUniUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIUTI_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRUniEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRUNIENT_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEENT_"+sGXsfl_59_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         wbErr = true ;
         A44AlbRecCod = 0 ;
      }
      else
      {
         A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
      A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDevCruUnd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDevCruUnd_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DEVCRUUND_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruUnd_Internalname ;
         wbErr = true ;
         A11683DevCruUnd = DecimalUtil.ZERO ;
      }
      else
      {
         A11683DevCruUnd = localUtil.ctond( httpContext.cgiGet( edtDevCruUnd_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "DEVCRUPZS_" + sGXsfl_59_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruPzs_Internalname ;
         wbErr = true ;
         A11684DevCruPzs = 0 ;
      }
      else
      {
         A11684DevCruPzs = (int)(localUtil.ctol( httpContext.cgiGet( edtDevCruPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
      A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
      A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z44AlbRecCod_" + sGXsfl_59_idx ;
      Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11683DevCruUnd_" + sGXsfl_59_idx ;
      Z11683DevCruUnd = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11684DevCruPzs_" + sGXsfl_59_idx ;
      Z11684DevCruPzs = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z47AlbREst_" + sGXsfl_59_idx ;
      Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z45AlbRef_" + sGXsfl_59_idx ;
      Z45AlbRef = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3613AlbRefDsc_" + sGXsfl_59_idx ;
      Z3613AlbRefDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z58AlbRUniEnt_" + sGXsfl_59_idx ;
      Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z52AlbRPieEnt_" + sGXsfl_59_idx ;
      Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z56AlbRUni_" + sGXsfl_59_idx ;
      Z56AlbRUni = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z47AlbREst_" + sGXsfl_59_idx ;
      A47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z56AlbRUni_" + sGXsfl_59_idx ;
      A56AlbRUni = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O11684DevCruPzs_" + sGXsfl_59_idx ;
      O11684DevCruPzs = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O54AlbRPieUti_" + sGXsfl_59_idx ;
      O54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O11683DevCruUnd_" + sGXsfl_59_idx ;
      O11683DevCruUnd = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O60AlbRUniUti_" + sGXsfl_59_idx ;
      O60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "ALBRUNIDIS_" + sGXsfl_59_idx ;
      A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "ALBRPIEDIS_" + sGXsfl_59_idx ;
      A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "ALBREST_" + sGXsfl_59_idx ;
      A47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1634_" + sGXsfl_59_idx ;
      nRcdDeleted_1634 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1634_" + sGXsfl_59_idx ;
      nRcdExists_1634 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1634_" + sGXsfl_59_idx ;
      nIsMod_1634 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "EMPRCOD_" + sGXsfl_59_idx ;
      A396EmprCod = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbRecCod_Enabled = edtAlbRecCod_Enabled ;
   }

   public void confirmValues1H40( )
   {
      nGXsfl_59_idx = 0 ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_591634( ) ;
      while ( nGXsfl_59_idx < nRC_GXsfl_59 )
      {
         nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_591634( ) ;
         httpContext.changePostValue( "Z44AlbRecCod_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z44AlbRecCod_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z11683DevCruUnd_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z11683DevCruUnd_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11683DevCruUnd_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z11684DevCruPzs_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z11684DevCruPzs_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11684DevCruPzs_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z47AlbREst_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z47AlbREst_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z47AlbREst_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z45AlbRef_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z45AlbRef_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z45AlbRef_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z3613AlbRefDsc_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z3613AlbRefDsc_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3613AlbRefDsc_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z58AlbRUniEnt_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z58AlbRUniEnt_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z58AlbRUniEnt_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z52AlbRPieEnt_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z52AlbRPieEnt_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z52AlbRPieEnt_"+sGXsfl_59_idx) ;
         httpContext.changePostValue( "Z56AlbRUni_"+sGXsfl_59_idx, httpContext.cgiGet( "ZT_"+"Z56AlbRUni_"+sGXsfl_59_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z56AlbRUni_"+sGXsfl_59_idx) ;
      }
      httpContext.changePostValue( "O11684DevCruPzs", httpContext.cgiGet( "T11684DevCruPzs")) ;
      httpContext.deletePostValue( "T11684DevCruPzs") ;
      httpContext.changePostValue( "O54AlbRPieUti", httpContext.cgiGet( "T54AlbRPieUti")) ;
      httpContext.deletePostValue( "T54AlbRPieUti") ;
      httpContext.changePostValue( "O11683DevCruUnd", httpContext.cgiGet( "T11683DevCruUnd")) ;
      httpContext.deletePostValue( "T11683DevCruUnd") ;
      httpContext.changePostValue( "O60AlbRUniUti", httpContext.cgiGet( "T60AlbRUniUti")) ;
      httpContext.deletePostValue( "T60AlbRUniUti") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tdevcru", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV59EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV60DevCruId,8,0))}, new String[] {"Gx_mode","EmprCod","DevCruId"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TDEVCRU");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("DevCruEst", localUtil.format( DecimalUtil.doubleToDec(A11671DevCruEst), "9"));
      forbiddenHiddens.add("DevCruHash", GXutil.rtrim( localUtil.format( A11674DevCruHash, "")));
      forbiddenHiddens.add("DevCruDesc", GXutil.rtrim( localUtil.format( A11675DevCruDesc, "")));
      forbiddenHiddens.add("DevCruDtSy", localUtil.format( A11676DevCruDtSy, "99/99/99 99:99"));
      forbiddenHiddens.add("DevCruGros", localUtil.format( A11677DevCruGros, "ZZZZZZZZZ9.99"));
      forbiddenHiddens.add("DevCruStt", GXutil.rtrim( localUtil.format( A11678DevCruStt, "")));
      forbiddenHiddens.add("DevCruEnvA", localUtil.format( DecimalUtil.doubleToDec(A11679DevCruEnvA), "9"));
      forbiddenHiddens.add("DevCruAtId", GXutil.rtrim( localUtil.format( A11680DevCruAtId, "")));
      forbiddenHiddens.add("DevCruAT", GXutil.rtrim( localUtil.format( A11681DevCruAT, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tdevcru:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11669DevCruId", GXutil.ltrim( localUtil.ntoc( Z11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11673DevCruSal", localUtil.ttoc( Z11673DevCruSal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11670DevCruFec", localUtil.dtoc( Z11670DevCruFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11671DevCruEst", GXutil.ltrim( localUtil.ntoc( Z11671DevCruEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11672DevCruMat", GXutil.rtrim( Z11672DevCruMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11674DevCruHash", GXutil.rtrim( Z11674DevCruHash));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11675DevCruDesc", GXutil.rtrim( Z11675DevCruDesc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11676DevCruDtSy", localUtil.ttoc( Z11676DevCruDtSy, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11677DevCruGros", GXutil.ltrim( localUtil.ntoc( Z11677DevCruGros, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11678DevCruStt", GXutil.rtrim( Z11678DevCruStt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11679DevCruEnvA", GXutil.ltrim( localUtil.ntoc( Z11679DevCruEnvA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11680DevCruAtId", GXutil.rtrim( Z11680DevCruAtId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11681DevCruAT", GXutil.rtrim( Z11681DevCruAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11682DevCruObs", Z11682DevCruObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O252CliCod", GXutil.ltrim( localUtil.ntoc( O252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_59", GXutil.ltrim( localUtil.ntoc( nGXsfl_59_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV54TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV54TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV54TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV59EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCRUID", GXutil.ltrim( localUtil.ntoc( AV60DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV60DevCruId), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CLICOD", GXutil.ltrim( localUtil.ntoc( AV56Insert_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCCLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRNCOD", GXutil.ltrim( localUtil.ntoc( AV57Insert_TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCTRNCOD", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUDTSY", localUtil.ttoc( A11676DevCruDtSy, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUATID", GXutil.rtrim( A11680DevCruAtId));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUENVA", GXutil.ltrim( localUtil.ntoc( A11679DevCruEnvA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUAT", GXutil.rtrim( A11681DevCruAT));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUSTT", GXutil.rtrim( A11678DevCruStt));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV32FirmaD, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32FirmaD), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vREG000", GXutil.ltrim( localUtil.ntoc( AV48Reg000, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUEST", GXutil.ltrim( localUtil.ntoc( A11671DevCruEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUHASH", GXutil.rtrim( A11674DevCruHash));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUDESC", GXutil.rtrim( A11675DevCruDesc));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUGROS", GXutil.ltrim( localUtil.ntoc( A11677DevCruGros, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNNOM", GXutil.rtrim( A841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV63Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREST", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUNI", GXutil.rtrim( AV42AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV38AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV39AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRPDIS", GXutil.ltrim( localUtil.ntoc( AV40AlbRPDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUDIS", GXutil.ltrim( localUtil.ntoc( AV41AlbRUDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCLI", GXutil.ltrim( localUtil.ntoc( AV43FlagCli, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNI", GXutil.rtrim( A56AlbRUni));
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
      return formatLink("app.tdevcru", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV59EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV60DevCruId,8,0))}, new String[] {"Gx_mode","EmprCod","DevCruId"})  ;
   }

   public String getPgmname( )
   {
      return "TDEVCRU" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Devolucion Entradas en Almacen", "") ;
   }

   public void initializeNonKey1H41633( )
   {
      h252CliCod = "" ;
      h840TrnCod = "" ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11671DevCruEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.str( A11671DevCruEst, 1, 0));
      A11672DevCruMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
      A11674DevCruHash = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11674DevCruHash", A11674DevCruHash);
      A11675DevCruDesc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11675DevCruDesc", A11675DevCruDesc);
      A11677DevCruGros = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrimstr( A11677DevCruGros, 13, 2));
      A11682DevCruObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
      A11670DevCruFec = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      A11676DevCruDtSy = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11678DevCruStt = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
      A11679DevCruEnvA = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
      A11680DevCruAtId = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
      A11681DevCruAT = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
      O252CliCod = A252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      Z11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      Z11670DevCruFec = GXutil.nullDate() ;
      Z11671DevCruEst = (byte)(0) ;
      Z11672DevCruMat = "" ;
      Z11674DevCruHash = "" ;
      Z11675DevCruDesc = "" ;
      Z11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      Z11677DevCruGros = DecimalUtil.ZERO ;
      Z11678DevCruStt = "" ;
      Z11679DevCruEnvA = (byte)(0) ;
      Z11680DevCruAtId = "" ;
      Z11681DevCruAT = "" ;
      Z11682DevCruObs = "" ;
      Z252CliCod = 0 ;
      Z840TrnCod = (short)(0) ;
   }

   public void initAll1H41633( )
   {
      A11669DevCruId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      initializeNonKey1H41633( ) ;
   }

   public void standaloneModalInsert( )
   {
      A11670DevCruFec = i11670DevCruFec ;
      httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      A11676DevCruDtSy = i11676DevCruDtSy ;
      httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11680DevCruAtId = i11680DevCruAtId ;
      httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
      A11679DevCruEnvA = i11679DevCruEnvA ;
      httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
      A11681DevCruAT = i11681DevCruAT ;
      httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
      A11678DevCruStt = i11678DevCruStt ;
      httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
   }

   public void initializeNonKey1H41634( )
   {
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A54AlbRPieUti = 0 ;
      A47AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      AV42AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42AlbRUni", AV42AlbRUni);
      AV38AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38AlbRPieDis), 6, 0));
      AV39AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39AlbRUniDis", GXutil.ltrimstr( AV39AlbRUniDis, 9, 2));
      AV40AlbRPDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40AlbRPDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40AlbRPDis), 6, 0));
      AV41AlbRUDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41AlbRUDis", GXutil.ltrimstr( AV41AlbRUDis, 9, 2));
      AV43FlagCli = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43FlagCli", GXutil.str( AV43FlagCli, 1, 0));
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      A11684DevCruPzs = 0 ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A52AlbRPieEnt = 0 ;
      A56AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      O11684DevCruPzs = A11684DevCruPzs ;
      O54AlbRPieUti = A54AlbRPieUti ;
      O11683DevCruUnd = A11683DevCruUnd ;
      O60AlbRUniUti = A60AlbRUniUti ;
      Z11683DevCruUnd = DecimalUtil.ZERO ;
      Z11684DevCruPzs = 0 ;
      Z47AlbREst = (byte)(0) ;
      Z45AlbRef = "" ;
      Z3613AlbRefDsc = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z52AlbRPieEnt = 0 ;
      Z56AlbRUni = "" ;
   }

   public void initAll1H41634( )
   {
      A44AlbRecCod = 0 ;
      initializeNonKey1H41634( ) ;
   }

   public void standaloneModalInsert1H41634( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211662931", true, true);
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
      httpContext.AddJavascriptSource("tdevcru.js", "?20268211662931", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1634( )
   {
      edtAlbRecCod_Enabled = defedtAlbRecCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_59_Refreshing);
   }

   public void startgridcontrol59( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A45AlbRef));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A3613AlbRefDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11683DevCruUnd, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11684DevCruPzs, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevCruPzs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtDevCruId_Internalname = "DEVCRUID" ;
      edtDevCruFec_Internalname = "DEVCRUFEC" ;
      edtDevCruSal_Internalname = "DEVCRUSAL" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      edtDevCruMat_Internalname = "DEVCRUMAT" ;
      edtDevCruObs_Internalname = "DEVCRUOBS" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtAlbRef_Internalname = "ALBREF" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      edtDevCruUnd_Internalname = "DEVCRUUND" ;
      edtDevCruPzs_Internalname = "DEVCRUPZS" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      Form.setCaption( httpContext.getMessage( "Devolucion Entradas en Almacen", "") );
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtDevCruPzs_Jsonclick = "" ;
      edtDevCruUnd_Jsonclick = "" ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRecCod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtAlbRPieEnt_Enabled = 0 ;
      edtAlbRPieUti_Enabled = 0 ;
      edtAlbRUniEnt_Enabled = 0 ;
      edtAlbRUniUti_Enabled = 0 ;
      edtDevCruPzs_Enabled = 1 ;
      edtDevCruUnd_Enabled = 1 ;
      edtAlbRefDsc_Enabled = 0 ;
      edtAlbRef_Enabled = 0 ;
      edtAlbRecCod_Enabled = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtDevCruObs_Enabled = 1 ;
      edtDevCruMat_Jsonclick = "" ;
      edtDevCruMat_Enabled = 1 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      edtDevCruSal_Jsonclick = "" ;
      edtDevCruSal_Enabled = 1 ;
      edtDevCruFec_Jsonclick = "" ;
      edtDevCruFec_Enabled = 1 ;
      edtDevCruId_Jsonclick = "" ;
      edtDevCruId_Enabled = 1 ;
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

   public void gxsgaclicod1H40( String A396EmprCod ,
                                String A279CliNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaclicod_data1H40( A396EmprCod, A279CliNom) ;
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

   protected void gxsgaclicod_data1H40( String A396EmprCod ,
                                        String A279CliNom )
   {
      l279CliNom = GXutil.padr( GXutil.rtrim( A279CliNom), 30, "%") ;
      /* Using cursor T01H440 */
      pr_default.execute(38, new Object[] {A396EmprCod, l279CliNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(38) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( T01H440_A279CliNom[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( T01H440_A279CliNom[0]));
         pr_default.readNext(38);
      }
      pr_default.close(38);
   }

   public void gxsgatrncod1H40( String A396EmprCod ,
                                String A841TrnNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatrncod_data1H40( A396EmprCod, A841TrnNom) ;
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

   protected void gxsgatrncod_data1H40( String A396EmprCod ,
                                        String A841TrnNom )
   {
      l841TrnNom = GXutil.padr( GXutil.rtrim( A841TrnNom), 30, "%") ;
      n841TrnNom = false ;
      /* Using cursor T01H441 */
      pr_default.execute(39, new Object[] {A396EmprCod, l841TrnNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(39) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( T01H441_A841TrnNom[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( T01H441_A841TrnNom[0]));
         pr_default.readNext(39);
      }
      pr_default.close(39);
   }

   public void gxhcaclicod1H41633( String A396EmprCod ,
                                   String A279CliNom )
   {
      /* Using cursor T01H442 */
      pr_default.execute(40, new Object[] {A279CliNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(40) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A279CliNom = T01H442_A279CliNom[0] ;
         A396EmprCod = T01H442_A396EmprCod[0] ;
         A252CliCod = T01H442_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.readNext(40);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(40);
   }

   public void gxhcatrncod1H41633( String A396EmprCod ,
                                   String A841TrnNom )
   {
      /* Using cursor T01H443 */
      pr_default.execute(41, new Object[] {Boolean.valueOf(n841TrnNom), A841TrnNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(41) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A841TrnNom = T01H443_A841TrnNom[0] ;
         n841TrnNom = T01H443_n841TrnNom[0] ;
         A396EmprCod = T01H443_A396EmprCod[0] ;
         A840TrnCod = T01H443_A840TrnCod[0] ;
         n840TrnCod = T01H443_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         pr_default.readNext(41);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(41);
   }

   public void gx10asadevcrusal1H41633( java.util.Date A11670DevCruFec ,
                                        String Gx_mode ,
                                        String A396EmprCod )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A11673DevCruSal) && true /* After */ )
      {
         GXt_dtime10 = A11673DevCruSal ;
         GXv_dtime11[0] = GXt_dtime10 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime11) ;
         tdevcru_impl.this.GXt_dtime10 = GXv_dtime11[0] ;
         A11673DevCruSal = GXt_dtime10 ;
         httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_23_1H41633( String A396EmprCod ,
                              int A11669DevCruId )
   {
      if ( (0==A11669DevCruId) && true /* After */ )
      {
         GXv_int14[0] = A11669DevCruId ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "022400", GXv_int14) ;
         A11669DevCruId = GXv_int14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_39_1H41634( String Gx_mode ,
                              String A396EmprCod ,
                              int A44AlbRecCod ,
                              String AV42AlbRUni )
   {
      if ( true /* After */ && ( isIns( )  || isUpd( )  ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int14[0] = A44AlbRecCod ;
         GXv_int12[0] = AV38AlbRPieDis ;
         GXv_decimal15[0] = AV39AlbRUniDis ;
         GXv_int8[0] = AV40AlbRPDis ;
         GXv_decimal13[0] = AV41AlbRUDis ;
         GXv_char3[0] = AV42AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_int12, GXv_decimal15, GXv_int8, GXv_decimal13, GXv_char3) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int14[0] ;
         AV38AlbRPieDis = GXv_int12[0] ;
         AV39AlbRUniDis = GXv_decimal15[0] ;
         AV40AlbRPDis = GXv_int8[0] ;
         AV41AlbRUDis = GXv_decimal13[0] ;
         AV42AlbRUni = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV38AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38AlbRPieDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV39AlbRUniDis", GXutil.ltrimstr( AV39AlbRUniDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV40AlbRPDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40AlbRPDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV41AlbRUDis", GXutil.ltrimstr( AV41AlbRUDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV42AlbRUni", AV42AlbRUni);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV38AlbRPieDis, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV39AlbRUniDis, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV40AlbRPDis, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV41AlbRUDis, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV42AlbRUni))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_40_1H41634( String A396EmprCod ,
                              int A44AlbRecCod ,
                              int A252CliCod )
   {
      if ( true /* After */ && ! (0==A44AlbRecCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int14[0] = A44AlbRecCod ;
         GXv_int12[0] = A252CliCod ;
         GXv_int6[0] = AV43FlagCli ;
         new app.pctrcli(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_int12, GXv_int6) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int14[0] ;
         A252CliCod = GXv_int12[0] ;
         AV43FlagCli = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43FlagCli", GXutil.str( AV43FlagCli, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV43FlagCli, (byte)(1), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_591634( ) ;
      while ( nGXsfl_59_idx <= nRC_GXsfl_59 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1H41634( ) ;
         standaloneModal1H41634( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1H41634( ) ;
         nGXsfl_59_idx = (int)(nGXsfl_59_idx+1) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_59_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_591634( ) ;
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

   public void valid_Devcrufec( )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A11673DevCruSal) && true /* After */ )
      {
         GXt_dtime10 = A11673DevCruSal ;
         GXv_dtime11[0] = GXt_dtime10 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime11) ;
         tdevcru_impl.this.GXt_dtime10 = GXv_dtime11[0] ;
         A11673DevCruSal = GXt_dtime10 ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
   }

   public void valid_Clicod( )
   {
      if ( (GXutil.strcmp("", h252CliCod)==0) )
      {
         A252CliCod = 0 ;
      }
      else
      {
         A279CliNom = h252CliCod ;
         /* Using cursor T01H444 */
         pr_default.execute(42, new Object[] {A279CliNom, A396EmprCod});
         A252CliCod = T01H444_A252CliCod[0] ;
         A252CliCod = T01H444_A252CliCod[0] ;
         if ( ! ( (pr_default.getStatus(42) == 101) ) )
         {
            pr_default.readNext(42);
            if ( ! ( (pr_default.getStatus(42) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre Cliente", "")}), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(42);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", h252CliCod);
      /* Using cursor T01H445 */
      pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(43) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01H445_A279CliNom[0] ;
      pr_default.close(43);
      if ( ( AV48Reg000 == 1 ) && ( A252CliCod == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente con valor 0", ""), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      if ( isUpd( )  && ( A252CliCod != O252CliCod ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite cambio de Cliente", ""), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", GXutil.rtrim( h252CliCod));
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      n841TrnNom = false ;
      if ( (GXutil.strcmp("", h840TrnCod)==0) )
      {
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
      }
      else
      {
         A841TrnNom = h840TrnCod ;
         n841TrnNom = false ;
         /* Using cursor T01H446 */
         pr_default.execute(44, new Object[] {Boolean.valueOf(n841TrnNom), A841TrnNom, A396EmprCod});
         A840TrnCod = T01H446_A840TrnCod[0] ;
         n840TrnCod = T01H446_n840TrnCod[0] ;
         A840TrnCod = T01H446_A840TrnCod[0] ;
         n840TrnCod = T01H446_n840TrnCod[0] ;
         if ( ! ( (pr_default.getStatus(44) == 101) ) )
         {
            pr_default.readNext(44);
            if ( ! ( (pr_default.getStatus(44) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Transportista", "")}), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(44);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", h840TrnCod);
      /* Using cursor T01H447 */
      pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(45) == 101) )
      {
         if ( ! ( (0==A840TrnCod) && (GXutil.strcmp("", A841TrnNom)==0) || (0==A840TrnCod) && n840TrnCod || (GXutil.strcmp("", A396EmprCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A841TrnNom = T01H447_A841TrnNom[0] ;
      n841TrnNom = T01H447_n841TrnNom[0] ;
      pr_default.close(45);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "h840TrnCod", GXutil.rtrim( h840TrnCod));
   }

   public void valid_Albreccod( )
   {
      /* Using cursor T01H437 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      Z47AlbREst = T01H437_A47AlbREst[0] ;
      Z45AlbRef = T01H437_A45AlbRef[0] ;
      Z3613AlbRefDsc = T01H437_A3613AlbRefDsc[0] ;
      Z58AlbRUniEnt = T01H437_A58AlbRUniEnt[0] ;
      Z52AlbRPieEnt = T01H437_A52AlbRPieEnt[0] ;
      Z56AlbRUni = T01H437_A56AlbRUni[0] ;
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      A60AlbRUniUti = T01H437_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01H437_A54AlbRPieUti[0] ;
      A47AlbREst = T01H437_A47AlbREst[0] ;
      A45AlbRef = T01H437_A45AlbRef[0] ;
      A3613AlbRefDsc = T01H437_A3613AlbRefDsc[0] ;
      A58AlbRUniEnt = T01H437_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01H437_A52AlbRPieEnt[0] ;
      A56AlbRUni = T01H437_A56AlbRUni[0] ;
      O54AlbRPieUti = A54AlbRPieUti ;
      O60AlbRUniUti = A60AlbRUniUti ;
      pr_default.close(35);
      if ( ( A47AlbREst == 1 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion CERRADA.Sin Unidades/Piezas", ""), 0, "ALBRECCOD");
      }
      if ( true /* After */ && ( isIns( )  || isUpd( )  ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int14[0] = A44AlbRecCod ;
         GXv_int12[0] = AV38AlbRPieDis ;
         GXv_decimal15[0] = AV39AlbRUniDis ;
         GXv_int8[0] = AV40AlbRPDis ;
         GXv_decimal13[0] = AV41AlbRUDis ;
         GXv_char3[0] = AV42AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_int12, GXv_decimal15, GXv_int8, GXv_decimal13, GXv_char3) ;
         tdevcru_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tdevcru_impl.this.A44AlbRecCod = GXv_int14[0] ;
         A44AlbRecCod = this.A44AlbRecCod ;
         tdevcru_impl.this.AV38AlbRPieDis = GXv_int12[0] ;
         AV38AlbRPieDis = this.AV38AlbRPieDis ;
         tdevcru_impl.this.AV39AlbRUniDis = GXv_decimal15[0] ;
         AV39AlbRUniDis = this.AV39AlbRUniDis ;
         tdevcru_impl.this.AV40AlbRPDis = GXv_int8[0] ;
         AV40AlbRPDis = this.AV40AlbRPDis ;
         tdevcru_impl.this.AV41AlbRUDis = GXv_decimal13[0] ;
         AV41AlbRUDis = this.AV41AlbRUDis ;
         tdevcru_impl.this.AV42AlbRUni = GXv_char3[0] ;
         AV42AlbRUni = this.AV42AlbRUni ;
      }
      if ( true /* After */ && ! (0==A44AlbRecCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int14[0] = A44AlbRecCod ;
         GXv_int12[0] = A252CliCod ;
         GXv_int6[0] = AV43FlagCli ;
         new app.pctrcli(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_int12, GXv_int6) ;
         tdevcru_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tdevcru_impl.this.A44AlbRecCod = GXv_int14[0] ;
         A44AlbRecCod = this.A44AlbRecCod ;
         tdevcru_impl.this.A252CliCod = GXv_int12[0] ;
         A252CliCod = this.A252CliCod ;
         tdevcru_impl.this.AV43FlagCli = GXv_int6[0] ;
         AV43FlagCli = this.AV43FlagCli ;
      }
      if ( true /* After */ && ( AV43FlagCli == 1 ) && ! (0==A44AlbRecCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente N Recepcion DIFERENTE Cliente Cabecera", ""), 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", GXutil.rtrim( A3613AlbRefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      httpContext.ajax_rsp_assign_attri("", false, "AV38AlbRPieDis", GXutil.ltrim( localUtil.ntoc( AV38AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV39AlbRUniDis", GXutil.ltrim( localUtil.ntoc( AV39AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV40AlbRPDis", GXutil.ltrim( localUtil.ntoc( AV40AlbRPDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV41AlbRUDis", GXutil.ltrim( localUtil.ntoc( AV41AlbRUDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV42AlbRUni", GXutil.rtrim( AV42AlbRUni));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV43FlagCli", GXutil.ltrim( localUtil.ntoc( AV43FlagCli, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h252CliCod", GXutil.rtrim( h252CliCod));
   }

   public void valid_Devcruund( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         A60AlbRUniUti = O60AlbRUniUti.subtract(A11683DevCruUnd) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A60AlbRUniUti = O60AlbRUniUti.add(A11683DevCruUnd).subtract(O11683DevCruUnd) ;
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
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades a devolver superior a la disponible", ""), 1, "DEVCRUUND");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruUnd_Internalname ;
      }
      if ( ( A11683DevCruUnd.doubleValue() == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Unidades incorrectas", ""), 1, "DEVCRUUND");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruUnd_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Devcrupzs( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         A54AlbRPieUti = (int)(O54AlbRPieUti-A11684DevCruPzs) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti+A11684DevCruPzs-O11684DevCruPzs) ;
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
      {
         A47AlbREst = (byte)(1) ;
      }
      else
      {
         if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
         {
            A47AlbREst = (byte)(0) ;
         }
      }
      if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO. Cantidad de piezas a devolver superior a la disponible", ""), 0, "DEVCRUPZS");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV59EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV60DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV54TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV59EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV60DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV32FirmaD',fld:'vFIRMAD',pic:'9',hsh:true},{av:'A11671DevCruEst',fld:'DEVCRUEST',pic:'9'},{av:'A11674DevCruHash',fld:'DEVCRUHASH',pic:''},{av:'A11675DevCruDesc',fld:'DEVCRUDESC',pic:''},{av:'A11676DevCruDtSy',fld:'DEVCRUDTSY',pic:'99/99/99 99:99'},{av:'A11677DevCruGros',fld:'DEVCRUGROS',pic:'ZZZZZZZZZ9.99'},{av:'A11678DevCruStt',fld:'DEVCRUSTT',pic:''},{av:'A11679DevCruEnvA',fld:'DEVCRUENVA',pic:'9'},{av:'A11680DevCruAtId',fld:'DEVCRUATID',pic:''},{av:'A11681DevCruAT',fld:'DEVCRUAT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121H42',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV54TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("'ELIMINAR GUIA'","{handler:'e131H42',iparms:[{av:'AV32FirmaD',fld:'vFIRMAD',pic:'9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A11680DevCruAtId',fld:'DEVCRUATID',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'ELIMINAR GUIA'",",oparms:[]}");
      setEventMetadata("ALBRECCOD.CLICK","{handler:'e141H41634',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ALBRECCOD.CLICK",",oparms:[]}");
      setEventMetadata("VALID_DEVCRUID","{handler:'valid_Devcruid',iparms:[]");
      setEventMetadata("VALID_DEVCRUID",",oparms:[]}");
      setEventMetadata("VALID_DEVCRUFEC","{handler:'valid_Devcrufec',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A11670DevCruFec',fld:'DEVCRUFEC',pic:''},{av:'A11673DevCruSal',fld:'DEVCRUSAL',pic:'99/99/99 99:99'}]");
      setEventMetadata("VALID_DEVCRUFEC",",oparms:[{av:'A11673DevCruSal',fld:'DEVCRUSAL',pic:'99/99/99 99:99'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O252CliCod'},{av:'h252CliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV48Reg000',fld:'vREG000',pic:'9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'h252CliCod'}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'h840TrnCod'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'h840TrnCod'}]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'h252CliCod'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'AV42AlbRUni',fld:'vALBRUNI',pic:'@!'},{av:'AV38AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV39AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV40AlbRPDis',fld:'vALBRPDIS',pic:'ZZZZZ9'},{av:'AV41AlbRUDis',fld:'vALBRUDIS',pic:'ZZZZZ9.99'},{av:'AV43FlagCli',fld:'vFLAGCLI',pic:'9'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'O60AlbRUniUti'},{av:'O54AlbRPieUti'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'AV38AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV39AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV40AlbRPDis',fld:'vALBRPDIS',pic:'ZZZZZ9'},{av:'AV41AlbRUDis',fld:'vALBRUDIS',pic:'ZZZZZ9.99'},{av:'AV42AlbRUni',fld:'vALBRUNI',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV43FlagCli',fld:'vFLAGCLI',pic:'9'},{av:'h252CliCod'}]}");
      setEventMetadata("VALID_DEVCRUUND","{handler:'valid_Devcruund',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O11683DevCruUnd'},{av:'O60AlbRUniUti'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A11683DevCruUnd',fld:'DEVCRUUND',pic:'ZZZZZ9.99'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_DEVCRUUND",",oparms:[{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_DEVCRUPZS","{handler:'valid_Devcrupzs',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O11684DevCruPzs'},{av:'O54AlbRPieUti'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A11684DevCruPzs',fld:'DEVCRUPZS',pic:'ZZZZZ9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'}]");
      setEventMetadata("VALID_DEVCRUPZS",",oparms:[{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'}]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
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
      pr_default.close(35);
      pr_default.close(43);
      pr_default.close(26);
      pr_default.close(45);
      pr_default.close(27);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV59EmprCod = "" ;
      Z396EmprCod = "" ;
      Z11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      Z11670DevCruFec = GXutil.nullDate() ;
      Z11672DevCruMat = "" ;
      Z11674DevCruHash = "" ;
      Z11675DevCruDesc = "" ;
      Z11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      Z11677DevCruGros = DecimalUtil.ZERO ;
      Z11678DevCruStt = "" ;
      Z11680DevCruAtId = "" ;
      Z11681DevCruAT = "" ;
      Z11682DevCruObs = "" ;
      Z11683DevCruUnd = DecimalUtil.ZERO ;
      Z45AlbRef = "" ;
      Z3613AlbRefDsc = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z56AlbRUni = "" ;
      O11683DevCruUnd = DecimalUtil.ZERO ;
      O60AlbRUniUti = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV42AlbRUni = "" ;
      A279CliNom = "" ;
      A841TrnNom = "" ;
      h252CliCod = "" ;
      h840TrnCod = "" ;
      A11670DevCruFec = GXutil.nullDate() ;
      AV59EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A11680DevCruAtId = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A11672DevCruMat = "" ;
      A11682DevCruObs = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1634 = "" ;
      sStyleString = "" ;
      A11674DevCruHash = "" ;
      A11675DevCruDesc = "" ;
      A11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      A11677DevCruGros = DecimalUtil.ZERO ;
      A11678DevCruStt = "" ;
      A11681DevCruAT = "" ;
      A407EmprNom = "" ;
      AV63Pgmname = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      AV39AlbRUniDis = DecimalUtil.ZERO ;
      AV41AlbRUDis = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1633 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      T11683DevCruUnd = DecimalUtil.ZERO ;
      T60AlbRUniUti = DecimalUtil.ZERO ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV53WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV54TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV55WebSession = httpContext.getWebSession();
      AV58TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Gx_msg = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z841TrnNom = "" ;
      T01H48_A407EmprNom = new String[] {""} ;
      T01H48_n407EmprNom = new boolean[] {false} ;
      T01H411_A841TrnNom = new String[] {""} ;
      T01H411_n841TrnNom = new boolean[] {false} ;
      T01H411_A396EmprCod = new String[] {""} ;
      T01H411_A840TrnCod = new short[1] ;
      T01H411_n840TrnCod = new boolean[] {false} ;
      T01H412_A279CliNom = new String[] {""} ;
      T01H412_A396EmprCod = new String[] {""} ;
      T01H412_A252CliCod = new int[1] ;
      T01H410_A841TrnNom = new String[] {""} ;
      T01H410_n841TrnNom = new boolean[] {false} ;
      T01H49_A279CliNom = new String[] {""} ;
      T01H413_A11669DevCruId = new int[1] ;
      T01H413_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01H413_A407EmprNom = new String[] {""} ;
      T01H413_n407EmprNom = new boolean[] {false} ;
      T01H413_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01H413_A279CliNom = new String[] {""} ;
      T01H413_A841TrnNom = new String[] {""} ;
      T01H413_n841TrnNom = new boolean[] {false} ;
      T01H413_A11671DevCruEst = new byte[1] ;
      T01H413_A11672DevCruMat = new String[] {""} ;
      T01H413_A11674DevCruHash = new String[] {""} ;
      T01H413_A11675DevCruDesc = new String[] {""} ;
      T01H413_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01H413_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01H413_A11678DevCruStt = new String[] {""} ;
      T01H413_A11679DevCruEnvA = new byte[1] ;
      T01H413_A11680DevCruAtId = new String[] {""} ;
      T01H413_A11681DevCruAT = new String[] {""} ;
      T01H413_A11682DevCruObs = new String[] {""} ;
      T01H413_A396EmprCod = new String[] {""} ;
      T01H413_A252CliCod = new int[1] ;
      T01H413_A840TrnCod = new short[1] ;
      T01H413_n840TrnCod = new boolean[] {false} ;
      T01H414_A279CliNom = new String[] {""} ;
      T01H414_A396EmprCod = new String[] {""} ;
      T01H414_A252CliCod = new int[1] ;
      T01H415_A841TrnNom = new String[] {""} ;
      T01H415_n841TrnNom = new boolean[] {false} ;
      T01H415_A396EmprCod = new String[] {""} ;
      T01H415_A840TrnCod = new short[1] ;
      T01H415_n840TrnCod = new boolean[] {false} ;
      T01H416_A279CliNom = new String[] {""} ;
      T01H416_A396EmprCod = new String[] {""} ;
      T01H416_A252CliCod = new int[1] ;
      T01H417_A841TrnNom = new String[] {""} ;
      T01H417_n841TrnNom = new boolean[] {false} ;
      T01H417_A396EmprCod = new String[] {""} ;
      T01H417_A840TrnCod = new short[1] ;
      T01H417_n840TrnCod = new boolean[] {false} ;
      T01H418_A279CliNom = new String[] {""} ;
      T01H419_A841TrnNom = new String[] {""} ;
      T01H419_n841TrnNom = new boolean[] {false} ;
      T01H420_A396EmprCod = new String[] {""} ;
      T01H420_A11669DevCruId = new int[1] ;
      T01H47_A11669DevCruId = new int[1] ;
      T01H47_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01H47_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01H47_A11671DevCruEst = new byte[1] ;
      T01H47_A11672DevCruMat = new String[] {""} ;
      T01H47_A11674DevCruHash = new String[] {""} ;
      T01H47_A11675DevCruDesc = new String[] {""} ;
      T01H47_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01H47_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01H47_A11678DevCruStt = new String[] {""} ;
      T01H47_A11679DevCruEnvA = new byte[1] ;
      T01H47_A11680DevCruAtId = new String[] {""} ;
      T01H47_A11681DevCruAT = new String[] {""} ;
      T01H47_A11682DevCruObs = new String[] {""} ;
      T01H47_A396EmprCod = new String[] {""} ;
      T01H47_A252CliCod = new int[1] ;
      T01H47_A840TrnCod = new short[1] ;
      T01H47_n840TrnCod = new boolean[] {false} ;
      T01H421_A396EmprCod = new String[] {""} ;
      T01H421_A11669DevCruId = new int[1] ;
      T01H422_A396EmprCod = new String[] {""} ;
      T01H422_A11669DevCruId = new int[1] ;
      T01H423_A279CliNom = new String[] {""} ;
      T01H423_A396EmprCod = new String[] {""} ;
      T01H423_A252CliCod = new int[1] ;
      T01H424_A841TrnNom = new String[] {""} ;
      T01H424_n841TrnNom = new boolean[] {false} ;
      T01H424_A396EmprCod = new String[] {""} ;
      T01H424_A840TrnCod = new short[1] ;
      T01H424_n840TrnCod = new boolean[] {false} ;
      T01H46_A11669DevCruId = new int[1] ;
      T01H46_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01H46_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01H46_A11671DevCruEst = new byte[1] ;
      T01H46_A11672DevCruMat = new String[] {""} ;
      T01H46_A11674DevCruHash = new String[] {""} ;
      T01H46_A11675DevCruDesc = new String[] {""} ;
      T01H46_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01H46_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01H46_A11678DevCruStt = new String[] {""} ;
      T01H46_A11679DevCruEnvA = new byte[1] ;
      T01H46_A11680DevCruAtId = new String[] {""} ;
      T01H46_A11681DevCruAT = new String[] {""} ;
      T01H46_A11682DevCruObs = new String[] {""} ;
      T01H46_A396EmprCod = new String[] {""} ;
      T01H46_A252CliCod = new int[1] ;
      T01H46_A840TrnCod = new short[1] ;
      T01H46_n840TrnCod = new boolean[] {false} ;
      T01H428_A279CliNom = new String[] {""} ;
      T01H429_A841TrnNom = new String[] {""} ;
      T01H429_n841TrnNom = new boolean[] {false} ;
      T01H430_A396EmprCod = new String[] {""} ;
      T01H430_A11669DevCruId = new int[1] ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      T01H431_A11669DevCruId = new int[1] ;
      T01H431_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01H431_A54AlbRPieUti = new int[1] ;
      T01H431_A47AlbREst = new byte[1] ;
      T01H431_A45AlbRef = new String[] {""} ;
      T01H431_A3613AlbRefDsc = new String[] {""} ;
      T01H431_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01H431_A11684DevCruPzs = new int[1] ;
      T01H431_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01H431_A52AlbRPieEnt = new int[1] ;
      T01H431_A56AlbRUni = new String[] {""} ;
      T01H431_A396EmprCod = new String[] {""} ;
      T01H431_A44AlbRecCod = new int[1] ;
      T01H45_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01H45_A54AlbRPieUti = new int[1] ;
      T01H45_A47AlbREst = new byte[1] ;
      T01H45_A45AlbRef = new String[] {""} ;
      T01H45_A3613AlbRefDsc = new String[] {""} ;
      T01H45_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01H45_A52AlbRPieEnt = new int[1] ;
      T01H45_A56AlbRUni = new String[] {""} ;
      T01H432_A396EmprCod = new String[] {""} ;
      T01H432_A11669DevCruId = new int[1] ;
      T01H432_A44AlbRecCod = new int[1] ;
      T01H43_A11669DevCruId = new int[1] ;
      T01H43_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01H43_A11684DevCruPzs = new int[1] ;
      T01H43_A396EmprCod = new String[] {""} ;
      T01H43_A44AlbRecCod = new int[1] ;
      T01H42_A11669DevCruId = new int[1] ;
      T01H42_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01H42_A11684DevCruPzs = new int[1] ;
      T01H42_A396EmprCod = new String[] {""} ;
      T01H42_A44AlbRecCod = new int[1] ;
      T01H433_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01H433_A54AlbRPieUti = new int[1] ;
      T01H433_A47AlbREst = new byte[1] ;
      T01H433_A45AlbRef = new String[] {""} ;
      T01H433_A3613AlbRefDsc = new String[] {""} ;
      T01H433_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01H433_A52AlbRPieEnt = new int[1] ;
      T01H433_A56AlbRUni = new String[] {""} ;
      T01H437_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01H437_A54AlbRPieUti = new int[1] ;
      T01H437_A47AlbREst = new byte[1] ;
      T01H437_A45AlbRef = new String[] {""} ;
      T01H437_A3613AlbRefDsc = new String[] {""} ;
      T01H437_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01H437_A52AlbRPieEnt = new int[1] ;
      T01H437_A56AlbRUni = new String[] {""} ;
      T01H439_A396EmprCod = new String[] {""} ;
      T01H439_A11669DevCruId = new int[1] ;
      T01H439_A44AlbRecCod = new int[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i11670DevCruFec = GXutil.nullDate() ;
      i11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      i11680DevCruAtId = "" ;
      i11681DevCruAT = "" ;
      i11678DevCruStt = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l279CliNom = "" ;
      T01H440_A279CliNom = new String[] {""} ;
      l841TrnNom = "" ;
      T01H441_A841TrnNom = new String[] {""} ;
      T01H441_n841TrnNom = new boolean[] {false} ;
      T01H442_A279CliNom = new String[] {""} ;
      T01H442_A396EmprCod = new String[] {""} ;
      T01H442_A252CliCod = new int[1] ;
      T01H443_A841TrnNom = new String[] {""} ;
      T01H443_n841TrnNom = new boolean[] {false} ;
      T01H443_A396EmprCod = new String[] {""} ;
      T01H443_A840TrnCod = new short[1] ;
      T01H443_n840TrnCod = new boolean[] {false} ;
      GXt_dtime10 = GXutil.resetTime( GXutil.nullDate() );
      GXv_dtime11 = new java.util.Date[1] ;
      T01H444_A279CliNom = new String[] {""} ;
      T01H444_A396EmprCod = new String[] {""} ;
      T01H444_A252CliCod = new int[1] ;
      T01H445_A279CliNom = new String[] {""} ;
      Zh252CliCod = "" ;
      T01H446_A841TrnNom = new String[] {""} ;
      T01H446_n841TrnNom = new boolean[] {false} ;
      T01H446_A396EmprCod = new String[] {""} ;
      T01H446_A840TrnCod = new short[1] ;
      T01H446_n840TrnCod = new boolean[] {false} ;
      T01H447_A841TrnNom = new String[] {""} ;
      T01H447_n841TrnNom = new boolean[] {false} ;
      Zh840TrnCod = "" ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_int8 = new int[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_int12 = new int[1] ;
      GXv_int6 = new byte[1] ;
      ZO60AlbRUniUti = DecimalUtil.ZERO ;
      ZV39AlbRUniDis = DecimalUtil.ZERO ;
      ZV41AlbRUDis = DecimalUtil.ZERO ;
      ZV42AlbRUni = "" ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdevcru__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdevcru__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdevcru__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdevcru__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevcru__default(),
         new Object[] {
             new Object[] {
            T01H42_A11669DevCruId, T01H42_A11683DevCruUnd, T01H42_A11684DevCruPzs, T01H42_A396EmprCod, T01H42_A44AlbRecCod
            }
            , new Object[] {
            T01H43_A11669DevCruId, T01H43_A11683DevCruUnd, T01H43_A11684DevCruPzs, T01H43_A396EmprCod, T01H43_A44AlbRecCod
            }
            , new Object[] {
            T01H44_A60AlbRUniUti, T01H44_A54AlbRPieUti, T01H44_A47AlbREst, T01H44_A45AlbRef, T01H44_A3613AlbRefDsc, T01H44_A58AlbRUniEnt, T01H44_A52AlbRPieEnt, T01H44_A56AlbRUni
            }
            , new Object[] {
            T01H45_A60AlbRUniUti, T01H45_A54AlbRPieUti, T01H45_A47AlbREst, T01H45_A45AlbRef, T01H45_A3613AlbRefDsc, T01H45_A58AlbRUniEnt, T01H45_A52AlbRPieEnt, T01H45_A56AlbRUni
            }
            , new Object[] {
            T01H46_A11669DevCruId, T01H46_A11673DevCruSal, T01H46_A11670DevCruFec, T01H46_A11671DevCruEst, T01H46_A11672DevCruMat, T01H46_A11674DevCruHash, T01H46_A11675DevCruDesc, T01H46_A11676DevCruDtSy, T01H46_A11677DevCruGros, T01H46_A11678DevCruStt,
            T01H46_A11679DevCruEnvA, T01H46_A11680DevCruAtId, T01H46_A11681DevCruAT, T01H46_A11682DevCruObs, T01H46_A396EmprCod, T01H46_A252CliCod, T01H46_A840TrnCod, T01H46_n840TrnCod
            }
            , new Object[] {
            T01H47_A11669DevCruId, T01H47_A11673DevCruSal, T01H47_A11670DevCruFec, T01H47_A11671DevCruEst, T01H47_A11672DevCruMat, T01H47_A11674DevCruHash, T01H47_A11675DevCruDesc, T01H47_A11676DevCruDtSy, T01H47_A11677DevCruGros, T01H47_A11678DevCruStt,
            T01H47_A11679DevCruEnvA, T01H47_A11680DevCruAtId, T01H47_A11681DevCruAT, T01H47_A11682DevCruObs, T01H47_A396EmprCod, T01H47_A252CliCod, T01H47_A840TrnCod, T01H47_n840TrnCod
            }
            , new Object[] {
            T01H48_A407EmprNom, T01H48_n407EmprNom
            }
            , new Object[] {
            T01H49_A279CliNom
            }
            , new Object[] {
            T01H410_A841TrnNom, T01H410_n841TrnNom
            }
            , new Object[] {
            T01H411_A841TrnNom, T01H411_n841TrnNom, T01H411_A396EmprCod, T01H411_A840TrnCod
            }
            , new Object[] {
            T01H412_A279CliNom, T01H412_A396EmprCod, T01H412_A252CliCod
            }
            , new Object[] {
            T01H413_A11669DevCruId, T01H413_A11673DevCruSal, T01H413_A407EmprNom, T01H413_n407EmprNom, T01H413_A11670DevCruFec, T01H413_A279CliNom, T01H413_A841TrnNom, T01H413_n841TrnNom, T01H413_A11671DevCruEst, T01H413_A11672DevCruMat,
            T01H413_A11674DevCruHash, T01H413_A11675DevCruDesc, T01H413_A11676DevCruDtSy, T01H413_A11677DevCruGros, T01H413_A11678DevCruStt, T01H413_A11679DevCruEnvA, T01H413_A11680DevCruAtId, T01H413_A11681DevCruAT, T01H413_A11682DevCruObs, T01H413_A396EmprCod,
            T01H413_A252CliCod, T01H413_A840TrnCod, T01H413_n840TrnCod
            }
            , new Object[] {
            T01H414_A279CliNom, T01H414_A396EmprCod, T01H414_A252CliCod
            }
            , new Object[] {
            T01H415_A841TrnNom, T01H415_n841TrnNom, T01H415_A396EmprCod, T01H415_A840TrnCod
            }
            , new Object[] {
            T01H416_A279CliNom, T01H416_A396EmprCod, T01H416_A252CliCod
            }
            , new Object[] {
            T01H417_A841TrnNom, T01H417_n841TrnNom, T01H417_A396EmprCod, T01H417_A840TrnCod
            }
            , new Object[] {
            T01H418_A279CliNom
            }
            , new Object[] {
            T01H419_A841TrnNom, T01H419_n841TrnNom
            }
            , new Object[] {
            T01H420_A396EmprCod, T01H420_A11669DevCruId
            }
            , new Object[] {
            T01H421_A396EmprCod, T01H421_A11669DevCruId
            }
            , new Object[] {
            T01H422_A396EmprCod, T01H422_A11669DevCruId
            }
            , new Object[] {
            T01H423_A279CliNom, T01H423_A396EmprCod, T01H423_A252CliCod
            }
            , new Object[] {
            T01H424_A841TrnNom, T01H424_n841TrnNom, T01H424_A396EmprCod, T01H424_A840TrnCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01H428_A279CliNom
            }
            , new Object[] {
            T01H429_A841TrnNom, T01H429_n841TrnNom
            }
            , new Object[] {
            T01H430_A396EmprCod, T01H430_A11669DevCruId
            }
            , new Object[] {
            T01H431_A11669DevCruId, T01H431_A60AlbRUniUti, T01H431_A54AlbRPieUti, T01H431_A47AlbREst, T01H431_A45AlbRef, T01H431_A3613AlbRefDsc, T01H431_A11683DevCruUnd, T01H431_A11684DevCruPzs, T01H431_A58AlbRUniEnt, T01H431_A52AlbRPieEnt,
            T01H431_A56AlbRUni, T01H431_A396EmprCod, T01H431_A44AlbRecCod
            }
            , new Object[] {
            T01H432_A396EmprCod, T01H432_A11669DevCruId, T01H432_A44AlbRecCod
            }
            , new Object[] {
            T01H433_A60AlbRUniUti, T01H433_A54AlbRPieUti, T01H433_A47AlbREst, T01H433_A45AlbRef, T01H433_A3613AlbRefDsc, T01H433_A58AlbRUniEnt, T01H433_A52AlbRPieEnt, T01H433_A56AlbRUni
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01H437_A60AlbRUniUti, T01H437_A54AlbRPieUti, T01H437_A47AlbREst, T01H437_A45AlbRef, T01H437_A3613AlbRefDsc, T01H437_A58AlbRUniEnt, T01H437_A52AlbRPieEnt, T01H437_A56AlbRUni
            }
            , new Object[] {
            }
            , new Object[] {
            T01H439_A396EmprCod, T01H439_A11669DevCruId, T01H439_A44AlbRecCod
            }
            , new Object[] {
            T01H440_A279CliNom
            }
            , new Object[] {
            T01H441_A841TrnNom, T01H441_n841TrnNom
            }
            , new Object[] {
            T01H442_A279CliNom, T01H442_A396EmprCod, T01H442_A252CliCod
            }
            , new Object[] {
            T01H443_A841TrnNom, T01H443_n841TrnNom, T01H443_A396EmprCod, T01H443_A840TrnCod
            }
            , new Object[] {
            T01H444_A279CliNom, T01H444_A396EmprCod, T01H444_A252CliCod
            }
            , new Object[] {
            T01H445_A279CliNom
            }
            , new Object[] {
            T01H446_A841TrnNom, T01H446_n841TrnNom, T01H446_A396EmprCod, T01H446_A840TrnCod
            }
            , new Object[] {
            T01H447_A841TrnNom, T01H447_n841TrnNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV63Pgmname = "TDEVCRU" ;
      Z11678DevCruStt = " " ;
      A11678DevCruStt = " " ;
      i11678DevCruStt = " " ;
      Z11681DevCruAT = " " ;
      A11681DevCruAT = " " ;
      i11681DevCruAT = " " ;
      Z11679DevCruEnvA = (byte)(0) ;
      A11679DevCruEnvA = (byte)(0) ;
      i11679DevCruEnvA = (byte)(0) ;
      Z11680DevCruAtId = " " ;
      A11680DevCruAtId = " " ;
      i11680DevCruAtId = " " ;
      Z11676DevCruDtSy = GXutil.serverNow( context, remoteHandle, pr_default) ;
      A11676DevCruDtSy = GXutil.serverNow( context, remoteHandle, pr_default) ;
      i11676DevCruDtSy = GXutil.serverNow( context, remoteHandle, pr_default) ;
      Z11670DevCruFec = GXutil.today( ) ;
      i11670DevCruFec = GXutil.today( ) ;
      A11670DevCruFec = GXutil.today( ) ;
   }

   private byte Z11671DevCruEst ;
   private byte Z11679DevCruEnvA ;
   private byte Z47AlbREst ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte AV32FirmaD ;
   private byte A11671DevCruEst ;
   private byte A11679DevCruEnvA ;
   private byte Gx_BScreen ;
   private byte AV48Reg000 ;
   private byte A47AlbREst ;
   private byte AV43FlagCli ;
   private byte AV33Ws ;
   private byte AV34Modhh ;
   private byte GXt_int5 ;
   private byte AV44Copias ;
   private byte AV49Copias2 ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i11679DevCruEnvA ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte GXv_int6[] ;
   private byte ZV43FlagCli ;
   private short Z840TrnCod ;
   private short N840TrnCod ;
   private short nRcdDeleted_1634 ;
   private short nRcdExists_1634 ;
   private short nIsMod_1634 ;
   private short A840TrnCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1634 ;
   private short RcdFound1634 ;
   private short nBlankRcdUsr1634 ;
   private short AV57Insert_TrnCod ;
   private short RcdFound1633 ;
   private short nIsDirty_1633 ;
   private short nIsDirty_1634 ;
   private short gxhchits ;
   private int wcpOAV60DevCruId ;
   private int Z11669DevCruId ;
   private int Z252CliCod ;
   private int O252CliCod ;
   private int nRC_GXsfl_59 ;
   private int nGXsfl_59_idx=1 ;
   private int N252CliCod ;
   private int Z44AlbRecCod ;
   private int Z11684DevCruPzs ;
   private int Z52AlbRPieEnt ;
   private int O11684DevCruPzs ;
   private int O54AlbRPieUti ;
   private int A11669DevCruId ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int AV60DevCruId ;
   private int trnEnded ;
   private int edtDevCruId_Enabled ;
   private int edtDevCruFec_Enabled ;
   private int edtDevCruSal_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtDevCruMat_Enabled ;
   private int edtDevCruObs_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int B252CliCod ;
   private int edtAlbRecCod_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtAlbRefDsc_Enabled ;
   private int edtDevCruUnd_Enabled ;
   private int edtDevCruPzs_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int edtAlbRPieUti_Enabled ;
   private int edtAlbRPieEnt_Enabled ;
   private int fRowAdded ;
   private int AV56Insert_CliCod ;
   private int A51AlbRPieDis ;
   private int AV38AlbRPieDis ;
   private int AV40AlbRPDis ;
   private int A11684DevCruPzs ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int T11684DevCruPzs ;
   private int T54AlbRPieUti ;
   private int GXt_int7 ;
   private int AV64GXV1 ;
   private int GX_JID ;
   private int Z54AlbRPieUti ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtAlbRecCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int GXv_int8[] ;
   private int GXv_int14[] ;
   private int GXv_int12[] ;
   private int ZO54AlbRPieUti ;
   private int ZV38AlbRPieDis ;
   private int ZV40AlbRPDis ;
   private int Z51AlbRPieDis ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z11677DevCruGros ;
   private java.math.BigDecimal Z11683DevCruUnd ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal O11683DevCruUnd ;
   private java.math.BigDecimal O60AlbRUniUti ;
   private java.math.BigDecimal A11677DevCruGros ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV39AlbRUniDis ;
   private java.math.BigDecimal AV41AlbRUDis ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal T11683DevCruUnd ;
   private java.math.BigDecimal T60AlbRUniUti ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal ZO60AlbRUniUti ;
   private java.math.BigDecimal ZV39AlbRUniDis ;
   private java.math.BigDecimal ZV41AlbRUDis ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV59EmprCod ;
   private String Z396EmprCod ;
   private String Z11672DevCruMat ;
   private String Z11674DevCruHash ;
   private String Z11675DevCruDesc ;
   private String Z11678DevCruStt ;
   private String Z11680DevCruAtId ;
   private String Z11681DevCruAT ;
   private String Z45AlbRef ;
   private String Z3613AlbRefDsc ;
   private String Z56AlbRUni ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV42AlbRUni ;
   private String A279CliNom ;
   private String A841TrnNom ;
   private String h252CliCod ;
   private String h840TrnCod ;
   private String AV59EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDevCruId_Internalname ;
   private String sGXsfl_59_idx="0001" ;
   private String A11680DevCruAtId ;
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
   private String edtDevCruId_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String edtDevCruFec_Internalname ;
   private String edtDevCruFec_Jsonclick ;
   private String edtDevCruSal_Internalname ;
   private String edtDevCruSal_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtDevCruMat_Internalname ;
   private String A11672DevCruMat ;
   private String edtDevCruMat_Jsonclick ;
   private String edtDevCruObs_Internalname ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String sMode1634 ;
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRef_Internalname ;
   private String edtAlbRefDsc_Internalname ;
   private String edtDevCruUnd_Internalname ;
   private String edtDevCruPzs_Internalname ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieEnt_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A11674DevCruHash ;
   private String A11675DevCruDesc ;
   private String A11678DevCruStt ;
   private String A11681DevCruAT ;
   private String A407EmprNom ;
   private String AV63Pgmname ;
   private String A56AlbRUni ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode1633 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_msg ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z841TrnNom ;
   private String sGXsfl_59_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtAlbRef_Jsonclick ;
   private String edtAlbRefDsc_Jsonclick ;
   private String edtDevCruUnd_Jsonclick ;
   private String edtDevCruPzs_Jsonclick ;
   private String edtAlbRUniUti_Jsonclick ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbRPieUti_Jsonclick ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i11680DevCruAtId ;
   private String i11681DevCruAT ;
   private String i11678DevCruStt ;
   private String subGridlevel_level1_Header ;
   private String gxwrpcisep ;
   private String l279CliNom ;
   private String l841TrnNom ;
   private String Zh252CliCod ;
   private String Zh840TrnCod ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String ZV42AlbRUni ;
   private java.util.Date Z11673DevCruSal ;
   private java.util.Date Z11676DevCruDtSy ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date A11676DevCruDtSy ;
   private java.util.Date i11676DevCruDtSy ;
   private java.util.Date GXt_dtime10 ;
   private java.util.Date GXv_dtime11[] ;
   private java.util.Date Z11670DevCruFec ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date i11670DevCruFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_59_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z11682DevCruObs ;
   private String A11682DevCruObs ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV55WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01H48_A407EmprNom ;
   private boolean[] T01H48_n407EmprNom ;
   private String[] T01H411_A841TrnNom ;
   private boolean[] T01H411_n841TrnNom ;
   private String[] T01H411_A396EmprCod ;
   private short[] T01H411_A840TrnCod ;
   private boolean[] T01H411_n840TrnCod ;
   private String[] T01H412_A279CliNom ;
   private String[] T01H412_A396EmprCod ;
   private int[] T01H412_A252CliCod ;
   private String[] T01H410_A841TrnNom ;
   private boolean[] T01H410_n841TrnNom ;
   private String[] T01H49_A279CliNom ;
   private int[] T01H413_A11669DevCruId ;
   private java.util.Date[] T01H413_A11673DevCruSal ;
   private String[] T01H413_A407EmprNom ;
   private boolean[] T01H413_n407EmprNom ;
   private java.util.Date[] T01H413_A11670DevCruFec ;
   private String[] T01H413_A279CliNom ;
   private String[] T01H413_A841TrnNom ;
   private boolean[] T01H413_n841TrnNom ;
   private byte[] T01H413_A11671DevCruEst ;
   private String[] T01H413_A11672DevCruMat ;
   private String[] T01H413_A11674DevCruHash ;
   private String[] T01H413_A11675DevCruDesc ;
   private java.util.Date[] T01H413_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01H413_A11677DevCruGros ;
   private String[] T01H413_A11678DevCruStt ;
   private byte[] T01H413_A11679DevCruEnvA ;
   private String[] T01H413_A11680DevCruAtId ;
   private String[] T01H413_A11681DevCruAT ;
   private String[] T01H413_A11682DevCruObs ;
   private String[] T01H413_A396EmprCod ;
   private int[] T01H413_A252CliCod ;
   private short[] T01H413_A840TrnCod ;
   private boolean[] T01H413_n840TrnCod ;
   private String[] T01H414_A279CliNom ;
   private String[] T01H414_A396EmprCod ;
   private int[] T01H414_A252CliCod ;
   private String[] T01H415_A841TrnNom ;
   private boolean[] T01H415_n841TrnNom ;
   private String[] T01H415_A396EmprCod ;
   private short[] T01H415_A840TrnCod ;
   private boolean[] T01H415_n840TrnCod ;
   private String[] T01H416_A279CliNom ;
   private String[] T01H416_A396EmprCod ;
   private int[] T01H416_A252CliCod ;
   private String[] T01H417_A841TrnNom ;
   private boolean[] T01H417_n841TrnNom ;
   private String[] T01H417_A396EmprCod ;
   private short[] T01H417_A840TrnCod ;
   private boolean[] T01H417_n840TrnCod ;
   private String[] T01H418_A279CliNom ;
   private String[] T01H419_A841TrnNom ;
   private boolean[] T01H419_n841TrnNom ;
   private String[] T01H420_A396EmprCod ;
   private int[] T01H420_A11669DevCruId ;
   private int[] T01H47_A11669DevCruId ;
   private java.util.Date[] T01H47_A11673DevCruSal ;
   private java.util.Date[] T01H47_A11670DevCruFec ;
   private byte[] T01H47_A11671DevCruEst ;
   private String[] T01H47_A11672DevCruMat ;
   private String[] T01H47_A11674DevCruHash ;
   private String[] T01H47_A11675DevCruDesc ;
   private java.util.Date[] T01H47_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01H47_A11677DevCruGros ;
   private String[] T01H47_A11678DevCruStt ;
   private byte[] T01H47_A11679DevCruEnvA ;
   private String[] T01H47_A11680DevCruAtId ;
   private String[] T01H47_A11681DevCruAT ;
   private String[] T01H47_A11682DevCruObs ;
   private String[] T01H47_A396EmprCod ;
   private int[] T01H47_A252CliCod ;
   private short[] T01H47_A840TrnCod ;
   private boolean[] T01H47_n840TrnCod ;
   private String[] T01H421_A396EmprCod ;
   private int[] T01H421_A11669DevCruId ;
   private String[] T01H422_A396EmprCod ;
   private int[] T01H422_A11669DevCruId ;
   private String[] T01H423_A279CliNom ;
   private String[] T01H423_A396EmprCod ;
   private int[] T01H423_A252CliCod ;
   private String[] T01H424_A841TrnNom ;
   private boolean[] T01H424_n841TrnNom ;
   private String[] T01H424_A396EmprCod ;
   private short[] T01H424_A840TrnCod ;
   private boolean[] T01H424_n840TrnCod ;
   private int[] T01H46_A11669DevCruId ;
   private java.util.Date[] T01H46_A11673DevCruSal ;
   private java.util.Date[] T01H46_A11670DevCruFec ;
   private byte[] T01H46_A11671DevCruEst ;
   private String[] T01H46_A11672DevCruMat ;
   private String[] T01H46_A11674DevCruHash ;
   private String[] T01H46_A11675DevCruDesc ;
   private java.util.Date[] T01H46_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01H46_A11677DevCruGros ;
   private String[] T01H46_A11678DevCruStt ;
   private byte[] T01H46_A11679DevCruEnvA ;
   private String[] T01H46_A11680DevCruAtId ;
   private String[] T01H46_A11681DevCruAT ;
   private String[] T01H46_A11682DevCruObs ;
   private String[] T01H46_A396EmprCod ;
   private int[] T01H46_A252CliCod ;
   private short[] T01H46_A840TrnCod ;
   private boolean[] T01H46_n840TrnCod ;
   private String[] T01H428_A279CliNom ;
   private String[] T01H429_A841TrnNom ;
   private boolean[] T01H429_n841TrnNom ;
   private String[] T01H430_A396EmprCod ;
   private int[] T01H430_A11669DevCruId ;
   private int[] T01H431_A11669DevCruId ;
   private java.math.BigDecimal[] T01H431_A60AlbRUniUti ;
   private int[] T01H431_A54AlbRPieUti ;
   private byte[] T01H431_A47AlbREst ;
   private String[] T01H431_A45AlbRef ;
   private String[] T01H431_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01H431_A11683DevCruUnd ;
   private int[] T01H431_A11684DevCruPzs ;
   private java.math.BigDecimal[] T01H431_A58AlbRUniEnt ;
   private int[] T01H431_A52AlbRPieEnt ;
   private String[] T01H431_A56AlbRUni ;
   private String[] T01H431_A396EmprCod ;
   private int[] T01H431_A44AlbRecCod ;
   private java.math.BigDecimal[] T01H45_A60AlbRUniUti ;
   private int[] T01H45_A54AlbRPieUti ;
   private byte[] T01H45_A47AlbREst ;
   private String[] T01H45_A45AlbRef ;
   private String[] T01H45_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01H45_A58AlbRUniEnt ;
   private int[] T01H45_A52AlbRPieEnt ;
   private String[] T01H45_A56AlbRUni ;
   private String[] T01H432_A396EmprCod ;
   private int[] T01H432_A11669DevCruId ;
   private int[] T01H432_A44AlbRecCod ;
   private int[] T01H43_A11669DevCruId ;
   private java.math.BigDecimal[] T01H43_A11683DevCruUnd ;
   private int[] T01H43_A11684DevCruPzs ;
   private String[] T01H43_A396EmprCod ;
   private int[] T01H43_A44AlbRecCod ;
   private int[] T01H42_A11669DevCruId ;
   private java.math.BigDecimal[] T01H42_A11683DevCruUnd ;
   private int[] T01H42_A11684DevCruPzs ;
   private String[] T01H42_A396EmprCod ;
   private int[] T01H42_A44AlbRecCod ;
   private java.math.BigDecimal[] T01H433_A60AlbRUniUti ;
   private int[] T01H433_A54AlbRPieUti ;
   private byte[] T01H433_A47AlbREst ;
   private String[] T01H433_A45AlbRef ;
   private String[] T01H433_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01H433_A58AlbRUniEnt ;
   private int[] T01H433_A52AlbRPieEnt ;
   private String[] T01H433_A56AlbRUni ;
   private java.math.BigDecimal[] T01H437_A60AlbRUniUti ;
   private int[] T01H437_A54AlbRPieUti ;
   private byte[] T01H437_A47AlbREst ;
   private String[] T01H437_A45AlbRef ;
   private String[] T01H437_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01H437_A58AlbRUniEnt ;
   private int[] T01H437_A52AlbRPieEnt ;
   private String[] T01H437_A56AlbRUni ;
   private String[] T01H439_A396EmprCod ;
   private int[] T01H439_A11669DevCruId ;
   private int[] T01H439_A44AlbRecCod ;
   private String[] T01H440_A279CliNom ;
   private String[] T01H441_A841TrnNom ;
   private boolean[] T01H441_n841TrnNom ;
   private String[] T01H442_A279CliNom ;
   private String[] T01H442_A396EmprCod ;
   private int[] T01H442_A252CliCod ;
   private String[] T01H443_A841TrnNom ;
   private boolean[] T01H443_n841TrnNom ;
   private String[] T01H443_A396EmprCod ;
   private short[] T01H443_A840TrnCod ;
   private boolean[] T01H443_n840TrnCod ;
   private String[] T01H444_A279CliNom ;
   private String[] T01H444_A396EmprCod ;
   private int[] T01H444_A252CliCod ;
   private String[] T01H445_A279CliNom ;
   private String[] T01H446_A841TrnNom ;
   private boolean[] T01H446_n841TrnNom ;
   private String[] T01H446_A396EmprCod ;
   private short[] T01H446_A840TrnCod ;
   private boolean[] T01H446_n840TrnCod ;
   private String[] T01H447_A841TrnNom ;
   private boolean[] T01H447_n841TrnNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private java.math.BigDecimal[] T01H44_A60AlbRUniUti ;
   private int[] T01H44_A54AlbRPieUti ;
   private byte[] T01H44_A47AlbREst ;
   private String[] T01H44_A45AlbRef ;
   private String[] T01H44_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01H44_A58AlbRUniEnt ;
   private int[] T01H44_A52AlbRPieEnt ;
   private String[] T01H44_A56AlbRUni ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV53WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV54TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV58TrnContextAtt ;
}

final  class tdevcru__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevcru__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevcru__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevcru__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevcru__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01H42", "SELECT DevCruId, DevCruUnd, DevCruPzs, EmprCod, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ?  FOR UPDATE OF DevCruUnd, DevCruPzs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H43", "SELECT DevCruId, DevCruUnd, DevCruPzs, EmprCod, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H44", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, AlbRef, AlbRefDsc, AlbRUniEnt, AlbRPieEnt, AlbRUni FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRUniUti, AlbRPieUti, AlbREst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H45", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, AlbRef, AlbRefDsc, AlbRUniEnt, AlbRPieEnt, AlbRUni FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H46", "SELECT DevCruId, DevCruSal, DevCruFec, DevCruEst, DevCruMat, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs, EmprCod, CliCod, TrnCod FROM TXPDEVCRU WHERE EmprCod = ? AND DevCruId = ?  FOR UPDATE OF DevCruSal, DevCruFec, DevCruEst, DevCruMat, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs, CliCod, TrnCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H47", "SELECT DevCruId, DevCruSal, DevCruFec, DevCruEst, DevCruMat, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs, EmprCod, CliCod, TrnCod FROM TXPDEVCRU WHERE EmprCod = ? AND DevCruId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H48", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H49", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H410", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H411", "SELECT TrnNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (EmprCod = ?) AND (TrnCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H412", "SELECT CliNom, EmprCod, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H413", "SELECT /*+ FIRST_ROWS(100) */ TM1.DevCruId, TM1.DevCruSal, T2.EmprNom, TM1.DevCruFec, T3.CliNom, T4.TrnNom, TM1.DevCruEst, TM1.DevCruMat, TM1.DevCruHash, TM1.DevCruDesc, TM1.DevCruDtSy, TM1.DevCruGros, TM1.DevCruStt, TM1.DevCruEnvA, TM1.DevCruAtId, TM1.DevCruAT, TM1.DevCruObs, TM1.EmprCod, TM1.CliCod, TM1.TrnCod FROM (((TXPDEVCRU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = TM1.EmprCod AND T4.TrnCod = TM1.TrnCod) WHERE TM1.EmprCod = ? and TM1.DevCruId = ? ORDER BY TM1.EmprCod, TM1.DevCruId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H414", "SELECT /*+ FIRST_ROWS */ CliNom, EmprCod, CliCod FROM TXPCLIENT WHERE (CliNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H415", "SELECT /*+ FIRST_ROWS */ TrnNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (TrnNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H416", "SELECT /*+ FIRST_ROWS */ CliNom, EmprCod, CliCod FROM TXPCLIENT WHERE (CliNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H417", "SELECT /*+ FIRST_ROWS */ TrnNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (TrnNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H418", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H419", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H420", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevCruId FROM TXPDEVCRU WHERE EmprCod = ? AND DevCruId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H421", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevCruId FROM TXPDEVCRU WHERE ( DevCruId > ?) and EmprCod = ? ORDER BY EmprCod, DevCruId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H422", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevCruId FROM TXPDEVCRU WHERE ( DevCruId < ?) and EmprCod = ? ORDER BY EmprCod DESC, DevCruId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H423", "SELECT /*+ FIRST_ROWS */ CliNom, EmprCod, CliCod FROM TXPCLIENT WHERE (CliNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H424", "SELECT /*+ FIRST_ROWS */ TrnNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (TrnNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01H425", "INSERT INTO TXPDEVCRU(DevCruId, DevCruSal, DevCruFec, DevCruEst, DevCruMat, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs, EmprCod, CliCod, TrnCod, DevCruATCU, DevCruSerA, DevCruTipA) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ')", GX_NOMASK, "TXPDEVCRU")
         ,new UpdateCursor("T01H426", "UPDATE TXPDEVCRU SET DevCruSal=?, DevCruFec=?, DevCruEst=?, DevCruMat=?, DevCruHash=?, DevCruDesc=?, DevCruDtSy=?, DevCruGros=?, DevCruStt=?, DevCruEnvA=?, DevCruAtId=?, DevCruAT=?, DevCruObs=?, CliCod=?, TrnCod=?  WHERE EmprCod = ? AND DevCruId = ?", GX_NOMASK, "TXPDEVCRU")
         ,new UpdateCursor("T01H427", "DELETE FROM TXPDEVCRU  WHERE EmprCod = ? AND DevCruId = ?", GX_NOMASK, "TXPDEVCRU")
         ,new ForEachCursor("T01H428", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H429", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H430", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DevCruId FROM TXPDEVCRU WHERE EmprCod = ? ORDER BY EmprCod, DevCruId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H431", "SELECT T1.DevCruId, T2.AlbRUniUti, T2.AlbRPieUti, T2.AlbREst, T2.AlbRef, T2.AlbRefDsc, T1.DevCruUnd, T1.DevCruPzs, T2.AlbRUniEnt, T2.AlbRPieEnt, T2.AlbRUni, T1.EmprCod, T1.AlbRecCod FROM (TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DevCruId = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.DevCruId, T1.AlbRecCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H432", "SELECT EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H433", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, AlbRef, AlbRefDsc, AlbRUniEnt, AlbRPieEnt, AlbRUni FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRUniUti, AlbRPieUti, AlbREst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01H434", "INSERT INTO TXPDEVCR1(DevCruId, DevCruUnd, DevCruPzs, EmprCod, AlbRecCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPDEVCR1")
         ,new UpdateCursor("T01H435", "UPDATE TXPDEVCR1 SET DevCruUnd=?, DevCruPzs=?  WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDEVCR1")
         ,new UpdateCursor("T01H436", "DELETE FROM TXPDEVCR1  WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDEVCR1")
         ,new ForEachCursor("T01H437", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, AlbRef, AlbRefDsc, AlbRUniEnt, AlbRPieEnt, AlbRUni FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01H438", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T01H439", "SELECT EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId, AlbRecCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H440", "SELECT * FROM (SELECT DISTINCT CliNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (UPPER(CliNom) like '%' || UPPER(?)) ORDER BY CliNom) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H441", "SELECT * FROM (SELECT DISTINCT TrnNom FROM TXPTRANSP WHERE (EmprCod = ?) AND (UPPER(TrnNom) like '%' || UPPER(?)) ORDER BY TrnNom) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H442", "SELECT CliNom, EmprCod, CliCod FROM TXPCLIENT WHERE (CliNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H443", "SELECT TrnNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (TrnNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H444", "SELECT /*+ FIRST_ROWS */ CliNom, EmprCod, CliCod FROM TXPCLIENT WHERE (CliNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H445", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H446", "SELECT /*+ FIRST_ROWS */ TrnNom, EmprCod, TrnCod FROM TXPTRANSP WHERE (TrnNom = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H447", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 200);
               ((String[]) buf[6])[0] = rslt.getString(7, 300);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 200);
               ((String[]) buf[6])[0] = rslt.getString(7, 300);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
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
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 20);
               ((String[]) buf[10])[0] = rslt.getString(9, 200);
               ((String[]) buf[11])[0] = rslt.getString(10, 300);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 20);
               ((String[]) buf[17])[0] = rslt.getString(16, 1);
               ((String[]) buf[18])[0] = rslt.getVarchar(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 29 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((int[]) buf[12])[0] = rslt.getInt(13);
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 31 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 35 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 23 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 20);
               stmt.setString(6, (String)parms[5], 200);
               stmt.setString(7, (String)parms[6], 300);
               stmt.setDateTime(8, (java.util.Date)parms[7], false);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 20);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setVarchar(14, (String)parms[13], 200, false);
               stmt.setString(15, (String)parms[14], 3);
               stmt.setInt(16, ((Number) parms[15]).intValue());
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[17]).shortValue());
               }
               return;
            case 24 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 20);
               stmt.setString(5, (String)parms[4], 200);
               stmt.setString(6, (String)parms[5], 300);
               stmt.setDateTime(7, (java.util.Date)parms[6], false);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 20);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setVarchar(13, (String)parms[12], 200, false);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[15]).shortValue());
               }
               stmt.setString(16, (String)parms[16], 3);
               stmt.setInt(17, ((Number) parms[17]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 32 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 33 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 36 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 30);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 30);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 41 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 44 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 45 :
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
   }

}

