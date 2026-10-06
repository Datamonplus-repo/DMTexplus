package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tserpa2_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         n65ArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         A457FasCod = httpContext.GetPar( "FasCod") ;
         A1664ParFasCod = (short)(GXutil.lval( httpContext.GetPar( "ParFasCod"))) ;
         A10584ParNVar = (short)(GXutil.lval( httpContext.GetPar( "ParNVar"))) ;
         n10584ParNVar = false ;
         AV39Flagr = (byte)(GXutil.lval( httpContext.GetPar( "Flagr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39Flagr", GXutil.str( AV39Flagr, 1, 0));
         AV40Msg_err = httpContext.GetPar( "Msg_err") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Msg_err", AV40Msg_err);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_13_D5477( A396EmprCod, A252CliCod, A65ArtCod, A758ProCod, A457FasCod, A1664ParFasCod, A10584ParNVar, AV39Flagr, AV40Msg_err) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         n65ArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A396EmprCod, A252CliCod, A65ArtCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_21( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A396EmprCod, A252CliCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
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
         gxload_24( A396EmprCod, A1664ParFasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_25") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13203ParUndID = (short)(GXutil.lval( httpContext.GetPar( "ParUndID"))) ;
         n13203ParUndID = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_25( A396EmprCod, A13203ParUndID) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_level2") == 0 )
      {
         gxnrgridlevel_level2_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Freestylelevel_level1") == 0 )
      {
         gxnrfreestylelevel_level1_newrow_invoke( ) ;
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
            AV25CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25CliCod), "ZZZZZ9")));
            AV26ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26ArtCod", AV26ArtCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ArtCod, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entrada de Parámetros Fase", ""), (short)(0)) ;
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

   public void gxnrgridlevel_level2_newrow_invoke( )
   {
      nRC_GXsfl_78 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_78"))) ;
      nGXsfl_78_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_78_idx"))) ;
      sGXsfl_78_idx = httpContext.GetPar( "sGXsfl_78_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level2_newrow( ) ;
      /* End function gxnrGridlevel_level2_newrow_invoke */
   }

   public void gxnrfreestylelevel_level1_newrow_invoke( )
   {
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrfreestylelevel_level1_newrow( ) ;
      /* End function gxnrFreestylelevel_level1_newrow_invoke */
   }

   public tserpa2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tserpa2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tserpa2_impl.class ));
   }

   public tserpa2_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TSERPA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSERPA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtCod_Internalname, httpContext.getMessage( "Código Artículo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtCod_Enabled, 1, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSERPA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtDsc_Internalname, httpContext.getMessage( "Artículo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSERPA2.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTableintermediatelevel_level1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_freestylelevel_level1( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TSERPA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TSERPA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TSERPA2.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV46Pgmname), GXutil.rtrim( localUtil.format( AV46Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSERPA2.htm");
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
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,108);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSERPA2.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TSERPA2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_freestylelevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol43( ) ;
      /* Save parent mode. */
      sMode476 = Gx_mode ;
      nGXsfl_43_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount476 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_476 = (short)(1) ;
            scanStartD5476( ) ;
            while ( RcdFound476 != 0 )
            {
               init_level_properties476( ) ;
               getByPrimaryKeyD5476( ) ;
               addRowD5476( ) ;
               scanNextD5476( ) ;
            }
            scanEndD5476( ) ;
            nBlankRcdCount476 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalD5476( ) ;
         standaloneModalD5476( ) ;
         sMode476 = Gx_mode ;
         while ( nGXsfl_43_idx < nRC_GXsfl_43 )
         {
            bGXsfl_43_Refreshing = true ;
            readRowD5476( ) ;
            edtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCOD_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            edtProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRODSC_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            edtArtFasFac_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTFASFAC_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtArtFasFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtFasFac_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            if ( ( nRcdExists_476 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalD5476( ) ;
            }
            sendRowD5476( ) ;
            bGXsfl_43_Refreshing = false ;
         }
         Gx_mode = sMode476 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount476 = (short)(5) ;
         nRcdExists_476 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartD5476( ) ;
            while ( RcdFound476 != 0 )
            {
               sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_43476( ) ;
               init_level_properties476( ) ;
               standaloneNotModalD5476( ) ;
               getByPrimaryKeyD5476( ) ;
               standaloneModalD5476( ) ;
               addRowD5476( ) ;
               scanNextD5476( ) ;
            }
            scanEndD5476( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode476 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_43476( ) ;
         initAllD5476( ) ;
         init_level_properties476( ) ;
         nRcdExists_476 = (short)(0) ;
         nIsMod_476 = (short)(0) ;
         nRcdDeleted_476 = (short)(0) ;
         nBlankRcdCount476 = (short)(nBlankRcdUsr476+nBlankRcdCount476) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount476 > 0 )
         {
            standaloneNotModalD5476( ) ;
            standaloneModalD5476( ) ;
            addRowD5476( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount476 = (short)(nBlankRcdCount476-1) ;
         }
         Gx_mode = sMode476 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      /* Restore parent mode. */
      Gx_mode = sMode476 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Freestylelevel_level1Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Freestylelevel_level1", Freestylelevel_level1Container, subFreestylelevel_level1_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Freestylelevel_level1ContainerData", Freestylelevel_level1Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Freestylelevel_level1ContainerData"+"V", Freestylelevel_level1Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Freestylelevel_level1ContainerData"+"V"+"\" value='"+Freestylelevel_level1Container.GridValuesHidden()+"'/>") ;
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
      e11D52 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            Z69ArtDsc = httpContext.cgiGet( "Z69ArtDsc") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV42EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV25CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV26ArtCod = httpContext.cgiGet( "vARTCOD") ;
            A14544ArtFasPyS = (short)(localUtil.ctol( httpContext.cgiGet( "ARTFASPYS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14545ArtFasPpp = (short)(localUtil.ctol( httpContext.cgiGet( "ARTFASPPP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14546ArtFasVel = localUtil.ctond( httpContext.cgiGet( "ARTFASVEL")) ;
            A14547ArtFasNPs = (short)(localUtil.ctol( httpContext.cgiGet( "ARTFASNPS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252CliCod = 0 ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            n65ArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
            n69ArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
            AV46Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TSERPA2");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tserpa2:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               n65ArtCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
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
                  sMode10 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode10 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound10 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_D50( ) ;
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
                        e11D52 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12D52 ();
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
         e12D52 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllD510( ) ;
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
         disableAttributesD510( ) ;
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

   public void confirm_D50( )
   {
      beforeValidateD510( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsD510( ) ;
         }
         else
         {
            checkExtendedTableD510( ) ;
            closeExtendedTableCursorsD510( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode10 = Gx_mode ;
         confirm_D5476( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode10 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_D5477( )
   {
      nGXsfl_78_idx = 0 ;
      while ( nGXsfl_78_idx < nRC_GXsfl_78 )
      {
         readRowD5477( ) ;
         if ( ( nRcdExists_477 != 0 ) || ( nIsMod_477 != 0 ) )
         {
            getKeyD5477( ) ;
            if ( ( nRcdExists_477 == 0 ) && ( nRcdDeleted_477 == 0 ) )
            {
               if ( RcdFound477 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateD5477( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableD5477( ) ;
                     closeExtendedTableCursorsD5477( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PROCOD_" + sGXsfl_43_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProCod_Internalname ;
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
                     getByPrimaryKeyD5477( ) ;
                     loadD5477( ) ;
                     beforeValidateD5477( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsD5477( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_477 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateD5477( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableD5477( ) ;
                           closeExtendedTableCursorsD5477( ) ;
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
                     GXCCtl = "PROCOD_" + sGXsfl_43_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtParFasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParFasDsc_Internalname, GXutil.rtrim( A1665ParFasDsc)) ;
         httpContext.changePostValue( edtParFasVal_Internalname, GXutil.rtrim( A1668ParFasVal)) ;
         httpContext.changePostValue( edtParFasObs_Internalname, GXutil.rtrim( A1673ParFasObs)) ;
         httpContext.changePostValue( edtParNVar_Internalname, GXutil.ltrim( localUtil.ntoc( A10584ParNVar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParTit_Internalname, GXutil.rtrim( A10585ParTit)) ;
         httpContext.changePostValue( edtParFasVl2_Internalname, GXutil.rtrim( A12670ParFasVl2)) ;
         httpContext.changePostValue( edtParUndID_Internalname, GXutil.ltrim( localUtil.ntoc( A13203ParUndID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParUndDsc_Internalname, GXutil.rtrim( A13204ParUndDsc)) ;
         httpContext.changePostValue( edtParOrden_Internalname, GXutil.ltrim( localUtil.ntoc( A13220ParOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1668ParFasVal_"+sGXsfl_78_idx, GXutil.rtrim( Z1668ParFasVal)) ;
         httpContext.changePostValue( "ZT_"+"Z1673ParFasObs_"+sGXsfl_78_idx, GXutil.rtrim( Z1673ParFasObs)) ;
         httpContext.changePostValue( "ZT_"+"Z12670ParFasVl2_"+sGXsfl_78_idx, GXutil.rtrim( Z12670ParFasVl2)) ;
         httpContext.changePostValue( "ZT_"+"Z13220ParOrden_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( Z13220ParOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14061ParFasVmn_"+sGXsfl_78_idx, GXutil.rtrim( Z14061ParFasVmn)) ;
         httpContext.changePostValue( "ZT_"+"Z14060ParFasVmx_"+sGXsfl_78_idx, GXutil.rtrim( Z14060ParFasVmx)) ;
         httpContext.changePostValue( "T1673ParFasObs_"+sGXsfl_78_idx, GXutil.rtrim( O1673ParFasObs)) ;
         httpContext.changePostValue( "T1668ParFasVal_"+sGXsfl_78_idx, GXutil.rtrim( O1668ParFasVal)) ;
         httpContext.changePostValue( "T1664ParFasCod_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( O1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_477_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_477, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_477_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_477, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_477_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_477, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_477 != 0 )
         {
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASDSC_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASVAL_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASOBS_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARNVAR_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParNVar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARTIT_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParTit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASVL2_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVl2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARUNDID_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARUNDDSC_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARORDEN_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParOrden_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_D5476( )
   {
      nGXsfl_43_idx = 0 ;
      while ( nGXsfl_43_idx < nRC_GXsfl_43 )
      {
         readRowD5476( ) ;
         if ( ( nRcdExists_476 != 0 ) || ( nIsMod_476 != 0 ) )
         {
            getKeyD5476( ) ;
            if ( ( nRcdExists_476 == 0 ) && ( nRcdDeleted_476 == 0 ) )
            {
               if ( RcdFound476 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateD5476( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableD5476( ) ;
                     closeExtendedTableCursorsD5476( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode476 = Gx_mode ;
                        confirm_D5477( ) ;
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
               }
               else
               {
                  GXCCtl = "PROCOD_" + sGXsfl_43_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound476 != 0 )
               {
                  if ( nRcdDeleted_476 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyD5476( ) ;
                     loadD5476( ) ;
                     beforeValidateD5476( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsD5476( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_476 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateD5476( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableD5476( ) ;
                           closeExtendedTableCursorsD5476( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode476 = Gx_mode ;
                              confirm_D5477( ) ;
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
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_476 == 0 )
                  {
                     GXCCtl = "PROCOD_" + sGXsfl_43_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtProCod_Internalname, GXutil.rtrim( A758ProCod)) ;
         httpContext.changePostValue( edtProDsc_Internalname, GXutil.rtrim( A759ProDsc)) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtArtFasFac_Internalname, GXutil.ltrim( localUtil.ntoc( A8560ArtFasFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_43_idx, GXutil.rtrim( Z758ProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_43_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z8560ArtFasFac_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z8560ArtFasFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14544ArtFasPyS_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z14544ArtFasPyS, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14545ArtFasPpp_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z14545ArtFasPpp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14546ArtFasVel_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z14546ArtFasVel, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14547ArtFasNPs_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z14547ArtFasNPs, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_78_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_78, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_476_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_476_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_476_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_476 != 0 )
         {
            httpContext.changePostValue( "PROCOD_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRODSC_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTFASFAC_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtFasFac_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionD50( )
   {
   }

   public void e11D52( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tserpa2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      tserpa2_impl.this.A396EmprCod = GXv_char2[0] ;
      tserpa2_impl.this.AV16EmprNom = GXv_char3[0] ;
      tserpa2_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char1 = AV22Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tserpa2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char4[0] = AV42EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char4, GXv_char3, GXv_char2) ;
      tserpa2_impl.this.AV42EmprCod = GXv_char4[0] ;
      tserpa2_impl.this.AV16EmprNom = GXv_char3[0] ;
      tserpa2_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42EmprCod", AV42EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext5[0] = AV43WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV43WWPContext = GXv_SdtWWPContext5[0] ;
      AV44TrnContext.fromxml(AV45WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
   }

   public void e12D52( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV44TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tserpa2ww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(13);
      pr_default.close(12);
      pr_default.close(11);
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

   public void zmD510( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z69ArtDsc = T00D513_A69ArtDsc[0] ;
         }
         else
         {
            Z69ArtDsc = A69ArtDsc ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z65ArtCod = A65ArtCod ;
         Z69ArtDsc = A69ArtDsc ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV46Pgmname = "TSERPA2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV42EmprCod)==0) )
      {
         A396EmprCod = AV42EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00D514 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00D514_A407EmprNom[0] ;
      n407EmprNom = T00D514_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(12);
      if ( ! (GXutil.strcmp("", AV42EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV42EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV25CliCod) )
      {
         A252CliCod = AV25CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( ! (0==AV25CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV25CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV26ArtCod)==0) )
      {
         A65ArtCod = AV26ArtCod ;
         n65ArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      if ( ! (GXutil.strcmp("", AV26ArtCod)==0) )
      {
         edtArtCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      }
      else
      {
         edtArtCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV26ArtCod)==0) )
      {
         edtArtCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
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
         /* Using cursor T00D515 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T00D515_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(13);
      }
   }

   public void loadD510( )
   {
      /* Using cursor T00D516 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A407EmprNom = T00D516_A407EmprNom[0] ;
         n407EmprNom = T00D516_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T00D516_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A69ArtDsc = T00D516_A69ArtDsc[0] ;
         n69ArtDsc = T00D516_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         zmD510( -15) ;
      }
      pr_default.close(14);
      onLoadActionsD510( ) ;
   }

   public void onLoadActionsD510( )
   {
   }

   public void checkExtendedTableD510( )
   {
      nIsDirty_10 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00D515 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00D515_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(13);
   }

   public void closeExtendedTableCursorsD510( )
   {
      pr_default.close(13);
   }

   public void enableDisable( )
   {
   }

   public void gxload_17( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T00D517 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00D517_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void getKeyD510( )
   {
      /* Using cursor T00D518 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00D513 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T00D513_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmD510( 15) ;
         RcdFound10 = (short)(1) ;
         A65ArtCod = T00D513_A65ArtCod[0] ;
         n65ArtCod = T00D513_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A69ArtDsc = T00D513_A69ArtDsc[0] ;
         n69ArtDsc = T00D513_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A252CliCod = T00D513_A252CliCod[0] ;
         n252CliCod = T00D513_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadD510( ) ;
         if ( AnyError == 1 )
         {
            RcdFound10 = (short)(0) ;
            initializeNonKeyD510( ) ;
         }
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKeyD510( ) ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(11);
   }

   public void getEqualNoModal( )
   {
      getKeyD510( ) ;
      if ( RcdFound10 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T00D519 */
      pr_default.execute(17, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A396EmprCod});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( T00D519_A252CliCod[0] < A252CliCod ) || ( T00D519_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00D519_A65ArtCod[0], A65ArtCod) < 0 ) ) && ( GXutil.strcmp(T00D519_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( T00D519_A252CliCod[0] > A252CliCod ) || ( T00D519_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00D519_A65ArtCod[0], A65ArtCod) > 0 ) ) && ( GXutil.strcmp(T00D519_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T00D519_A252CliCod[0] ;
            n252CliCod = T00D519_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T00D519_A65ArtCod[0] ;
            n65ArtCod = T00D519_n65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void move_previous( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T00D520 */
      pr_default.execute(18, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A396EmprCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( T00D520_A252CliCod[0] > A252CliCod ) || ( T00D520_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00D520_A65ArtCod[0], A65ArtCod) > 0 ) ) && ( GXutil.strcmp(T00D520_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( T00D520_A252CliCod[0] < A252CliCod ) || ( T00D520_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00D520_A65ArtCod[0], A65ArtCod) < 0 ) ) && ( GXutil.strcmp(T00D520_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T00D520_A252CliCod[0] ;
            n252CliCod = T00D520_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T00D520_A65ArtCod[0] ;
            n65ArtCod = T00D520_n65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyD510( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertD510( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound10 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               A252CliCod = Z252CliCod ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = Z65ArtCod ;
               n65ArtCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
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
               updateD510( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertD510( ) ;
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
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertD510( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) )
      {
         A252CliCod = Z252CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = Z65ArtCod ;
         n65ArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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

   public void checkOptimisticConcurrencyD510( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00D512 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(10) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(10) == 101) || ( GXutil.strcmp(Z69ArtDsc, T00D512_A69ArtDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z69ArtDsc, T00D512_A69ArtDsc[0]) != 0 )
            {
               GXutil.writeLogln("tserpa2:[seudo value changed for attri]"+"ArtDsc");
               GXutil.writeLogRaw("Old: ",Z69ArtDsc);
               GXutil.writeLogRaw("Current: ",T00D512_A69ArtDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTICU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertD510( )
   {
      beforeValidateD510( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableD510( ) ;
      }
      if ( AnyError == 0 )
      {
         zmD510( 0) ;
         checkOptimisticConcurrencyD510( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmD510( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertD510( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00D521 */
                  pr_default.execute(19, new Object[] {Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n69ArtDsc), A69ArtDsc, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
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
                        processLevelD510( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionD50( ) ;
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
            loadD510( ) ;
         }
         endLevelD510( ) ;
      }
      closeExtendedTableCursorsD510( ) ;
   }

   public void updateD510( )
   {
      beforeValidateD510( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableD510( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyD510( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmD510( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateD510( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00D522 */
                  pr_default.execute(20, new Object[] {Boolean.valueOf(n69ArtDsc), A69ArtDsc, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
                  if ( (pr_default.getStatus(20) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTICU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateD510( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int6[0] = A252CliCod ;
                     GXv_char3[0] = A65ArtCod ;
                     new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
                     tserpa2_impl.this.A396EmprCod = GXv_char4[0] ;
                     tserpa2_impl.this.A252CliCod = GXv_int6[0] ;
                     tserpa2_impl.this.A65ArtCod = GXv_char3[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelD510( ) ;
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
         endLevelD510( ) ;
      }
      closeExtendedTableCursorsD510( ) ;
   }

   public void deferredUpdateD510( )
   {
   }

   public void delete( )
   {
      beforeValidateD510( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyD510( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsD510( ) ;
         afterConfirmD510( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteD510( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00D523 */
               pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
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
      sMode10 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelD510( ) ;
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsD510( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00D524 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T00D524_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(22);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00D525 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Familia Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00D526 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00D527 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T00D528 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Lab. JBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T00D529 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEZCLAS CLIENTE MATERIAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T00D530 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS COMPOSICION MEZCLAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T00D531 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "recest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T00D532 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T00D533 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPEDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T00D534 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PCARC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T00D535 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO PRECIOS ARTICULO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T00D536 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INCREMENTO PRECIO INTENSIDAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T00D537 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECIO GLOBA COLOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T00D538 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TR02JL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T00D539 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLATFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T00D540 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMQT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T00D541 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PVPNITp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T00D542 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEJART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T00D543 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TNART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T00D544 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTTEJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T00D545 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARTINa", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T00D546 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T00D547 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T00D548 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ESTAD.CLIENTE/ART/T.ART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T00D549 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Modelos de Confección", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T00D550 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WebEmp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T00D551 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ACATEXGB.WEBDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T00D552 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSerie", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T00D553 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRECO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T00D554 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T00D555 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PedPro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T00D556 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T00D557 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T00D558 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T00D559 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRECAP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T00D560 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARSER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T00D561 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cod Calidad por Articulo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T00D562 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T00D563 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T00D564 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T00D565 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPREPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T00D566 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECARG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T00D567 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRETCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T00D568 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
      }
   }

   public void processNestedLevelD5476( )
   {
      nGXsfl_43_idx = 0 ;
      while ( nGXsfl_43_idx < nRC_GXsfl_43 )
      {
         readRowD5476( ) ;
         if ( ( nRcdExists_476 != 0 ) || ( nIsMod_476 != 0 ) )
         {
            standaloneNotModalD5476( ) ;
            getKeyD5476( ) ;
            if ( ( nRcdExists_476 == 0 ) && ( nRcdDeleted_476 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertD5476( ) ;
            }
            else
            {
               if ( RcdFound476 != 0 )
               {
                  if ( ( nRcdDeleted_476 != 0 ) && ( nRcdExists_476 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteD5476( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_476 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateD5476( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_476 == 0 )
                  {
                     GXCCtl = "PROCOD_" + sGXsfl_43_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtProCod_Internalname, GXutil.rtrim( A758ProCod)) ;
         httpContext.changePostValue( edtProDsc_Internalname, GXutil.rtrim( A759ProDsc)) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtArtFasFac_Internalname, GXutil.ltrim( localUtil.ntoc( A8560ArtFasFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_43_idx, GXutil.rtrim( Z758ProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_43_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z8560ArtFasFac_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z8560ArtFasFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14544ArtFasPyS_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z14544ArtFasPyS, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14545ArtFasPpp_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z14545ArtFasPpp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14546ArtFasVel_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z14546ArtFasVel, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14547ArtFasNPs_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z14547ArtFasNPs, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_78_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_78, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_476_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_476_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_476_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_476 != 0 )
         {
            httpContext.changePostValue( "PROCOD_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRODSC_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ARTFASFAC_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtFasFac_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllD5476( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_476 = (short)(0) ;
      nIsMod_476 = (short)(0) ;
      nRcdDeleted_476 = (short)(0) ;
   }

   public void processLevelD510( )
   {
      /* Save parent mode. */
      sMode10 = Gx_mode ;
      processNestedLevelD5476( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelD510( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(10);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteD510( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tserpa2");
         if ( AnyError == 0 )
         {
            confirmValuesD50( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tserpa2");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartD510( )
   {
      /* Scan By routine */
      /* Using cursor T00D569 */
      pr_default.execute(67, new Object[] {A396EmprCod});
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(67) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A252CliCod = T00D569_A252CliCod[0] ;
         n252CliCod = T00D569_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T00D569_A65ArtCod[0] ;
         n65ArtCod = T00D569_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextD510( )
   {
      /* Scan next routine */
      pr_default.readNext(67);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(67) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A252CliCod = T00D569_A252CliCod[0] ;
         n252CliCod = T00D569_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T00D569_A65ArtCod[0] ;
         n65ArtCod = T00D569_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
   }

   public void scanEndD510( )
   {
      pr_default.close(67);
   }

   public void afterConfirmD510( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertD510( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateD510( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteD510( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteD510( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateD510( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesD510( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zmD5476( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8560ArtFasFac = T00D57_A8560ArtFasFac[0] ;
            Z14544ArtFasPyS = T00D57_A14544ArtFasPyS[0] ;
            Z14545ArtFasPpp = T00D57_A14545ArtFasPpp[0] ;
            Z14546ArtFasVel = T00D57_A14546ArtFasVel[0] ;
            Z14547ArtFasNPs = T00D57_A14547ArtFasNPs[0] ;
         }
         else
         {
            Z8560ArtFasFac = A8560ArtFasFac ;
            Z14544ArtFasPyS = A14544ArtFasPyS ;
            Z14545ArtFasPpp = A14545ArtFasPpp ;
            Z14546ArtFasVel = A14546ArtFasVel ;
            Z14547ArtFasNPs = A14547ArtFasNPs ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z8560ArtFasFac = A8560ArtFasFac ;
         Z14544ArtFasPyS = A14544ArtFasPyS ;
         Z14545ArtFasPpp = A14545ArtFasPpp ;
         Z14546ArtFasVel = A14546ArtFasVel ;
         Z14547ArtFasNPs = A14547ArtFasNPs ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z457FasCod = A457FasCod ;
         Z759ProDsc = A759ProDsc ;
         Z460FasDsc = A460FasDsc ;
      }
   }

   public void standaloneNotModalD5476( )
   {
   }

   public void standaloneModalD5476( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite eliminar en este nivel", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      }
      else
      {
         edtProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      }
      else
      {
         edtFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      }
   }

   public void loadD5476( )
   {
      /* Using cursor T00D570 */
      pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A457FasCod});
      if ( (pr_default.getStatus(68) != 101) )
      {
         RcdFound476 = (short)(1) ;
         A759ProDsc = T00D570_A759ProDsc[0] ;
         A460FasDsc = T00D570_A460FasDsc[0] ;
         A8560ArtFasFac = T00D570_A8560ArtFasFac[0] ;
         A14544ArtFasPyS = T00D570_A14544ArtFasPyS[0] ;
         A14545ArtFasPpp = T00D570_A14545ArtFasPpp[0] ;
         A14546ArtFasVel = T00D570_A14546ArtFasVel[0] ;
         A14547ArtFasNPs = T00D570_A14547ArtFasNPs[0] ;
         zmD5476( -18) ;
      }
      pr_default.close(68);
      onLoadActionsD5476( ) ;
   }

   public void onLoadActionsD5476( )
   {
   }

   public void checkExtendedTableD5476( )
   {
      nIsDirty_476 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalD5476( ) ;
      /* Using cursor T00D58 */
      pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T00D58_A759ProDsc[0] ;
      pr_default.close(6);
      /* Using cursor T00D59 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(7);
      /* Using cursor T00D510 */
      pr_default.execute(8, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T00D510_A460FasDsc[0] ;
      pr_default.close(8);
      /* Using cursor T00D511 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PREFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(9);
   }

   public void closeExtendedTableCursorsD5476( )
   {
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
   }

   public void enableDisableD5476( )
   {
   }

   public void gxload_19( String A396EmprCod ,
                          String A758ProCod )
   {
      /* Using cursor T00D571 */
      pr_default.execute(69, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(69) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T00D571_A759ProDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A759ProDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(69) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(69);
   }

   public void gxload_20( String A396EmprCod ,
                          int A252CliCod ,
                          String A65ArtCod ,
                          String A758ProCod )
   {
      /* Using cursor T00D572 */
      pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod});
      if ( (pr_default.getStatus(70) == 101) )
      {
         GXCCtl = "PROCOD_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(70) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(70);
   }

   public void gxload_21( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T00D573 */
      pr_default.execute(71, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(71) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T00D573_A460FasDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(71) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(71);
   }

   public void gxload_22( String A396EmprCod ,
                          int A252CliCod ,
                          String A457FasCod )
   {
      /* Using cursor T00D574 */
      pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod});
      if ( (pr_default.getStatus(72) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PREFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(72) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(72);
   }

   public void getKeyD5476( )
   {
      /* Using cursor T00D575 */
      pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A457FasCod});
      if ( (pr_default.getStatus(73) != 101) )
      {
         RcdFound476 = (short)(1) ;
      }
      else
      {
         RcdFound476 = (short)(0) ;
      }
      pr_default.close(73);
   }

   public void getByPrimaryKeyD5476( )
   {
      /* Using cursor T00D57 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A457FasCod});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T00D57_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmD5476( 18) ;
         RcdFound476 = (short)(1) ;
         initializeNonKeyD5476( ) ;
         A8560ArtFasFac = T00D57_A8560ArtFasFac[0] ;
         A14544ArtFasPyS = T00D57_A14544ArtFasPyS[0] ;
         A14545ArtFasPpp = T00D57_A14545ArtFasPpp[0] ;
         A14546ArtFasVel = T00D57_A14546ArtFasVel[0] ;
         A14547ArtFasNPs = T00D57_A14547ArtFasNPs[0] ;
         A758ProCod = T00D57_A758ProCod[0] ;
         A457FasCod = T00D57_A457FasCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z457FasCod = A457FasCod ;
         sMode476 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadD5476( ) ;
         Gx_mode = sMode476 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound476 = (short)(0) ;
         initializeNonKeyD5476( ) ;
         sMode476 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalD5476( ) ;
         Gx_mode = sMode476 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesD5476( ) ;
      }
      pr_default.close(5);
   }

   public void checkOptimisticConcurrencyD5476( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00D56 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A457FasCod});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPSERPAU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( DecimalUtil.compareTo(Z8560ArtFasFac, T00D56_A8560ArtFasFac[0]) != 0 ) || ( Z14544ArtFasPyS != T00D56_A14544ArtFasPyS[0] ) || ( Z14545ArtFasPpp != T00D56_A14545ArtFasPpp[0] ) || ( DecimalUtil.compareTo(Z14546ArtFasVel, T00D56_A14546ArtFasVel[0]) != 0 ) || ( Z14547ArtFasNPs != T00D56_A14547ArtFasNPs[0] ) )
         {
            if ( DecimalUtil.compareTo(Z8560ArtFasFac, T00D56_A8560ArtFasFac[0]) != 0 )
            {
               GXutil.writeLogln("tserpa2:[seudo value changed for attri]"+"ArtFasFac");
               GXutil.writeLogRaw("Old: ",Z8560ArtFasFac);
               GXutil.writeLogRaw("Current: ",T00D56_A8560ArtFasFac[0]);
            }
            if ( Z14544ArtFasPyS != T00D56_A14544ArtFasPyS[0] )
            {
               GXutil.writeLogln("tserpa2:[seudo value changed for attri]"+"ArtFasPyS");
               GXutil.writeLogRaw("Old: ",Z14544ArtFasPyS);
               GXutil.writeLogRaw("Current: ",T00D56_A14544ArtFasPyS[0]);
            }
            if ( Z14545ArtFasPpp != T00D56_A14545ArtFasPpp[0] )
            {
               GXutil.writeLogln("tserpa2:[seudo value changed for attri]"+"ArtFasPpp");
               GXutil.writeLogRaw("Old: ",Z14545ArtFasPpp);
               GXutil.writeLogRaw("Current: ",T00D56_A14545ArtFasPpp[0]);
            }
            if ( DecimalUtil.compareTo(Z14546ArtFasVel, T00D56_A14546ArtFasVel[0]) != 0 )
            {
               GXutil.writeLogln("tserpa2:[seudo value changed for attri]"+"ArtFasVel");
               GXutil.writeLogRaw("Old: ",Z14546ArtFasVel);
               GXutil.writeLogRaw("Current: ",T00D56_A14546ArtFasVel[0]);
            }
            if ( Z14547ArtFasNPs != T00D56_A14547ArtFasNPs[0] )
            {
               GXutil.writeLogln("tserpa2:[seudo value changed for attri]"+"ArtFasNPs");
               GXutil.writeLogRaw("Old: ",Z14547ArtFasNPs);
               GXutil.writeLogRaw("Current: ",T00D56_A14547ArtFasNPs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPSERPAU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertD5476( )
   {
      beforeValidateD5476( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableD5476( ) ;
      }
      if ( AnyError == 0 )
      {
         zmD5476( 0) ;
         checkOptimisticConcurrencyD5476( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmD5476( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertD5476( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00D576 */
                  pr_default.execute(74, new Object[] {A8560ArtFasFac, Short.valueOf(A14544ArtFasPyS), Short.valueOf(A14545ArtFasPpp), A14546ArtFasVel, Short.valueOf(A14547ArtFasNPs), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
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
                        processLevelD5476( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
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
            loadD5476( ) ;
         }
         endLevelD5476( ) ;
      }
      closeExtendedTableCursorsD5476( ) ;
   }

   public void updateD5476( )
   {
      beforeValidateD5476( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableD5476( ) ;
      }
      if ( ( nIsMod_476 != 0 ) || ( nIsDirty_476 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyD5476( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmD5476( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateD5476( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00D577 */
                     pr_default.execute(75, new Object[] {A8560ArtFasFac, Short.valueOf(A14544ArtFasPyS), Short.valueOf(A14545ArtFasPpp), A14546ArtFasVel, Short.valueOf(A14547ArtFasNPs), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A457FasCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
                     if ( (pr_default.getStatus(75) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPSERPAU"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateD5476( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int6[0] = A252CliCod ;
                        GXv_char3[0] = A65ArtCod ;
                        new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
                        tserpa2_impl.this.A396EmprCod = GXv_char4[0] ;
                        tserpa2_impl.this.A252CliCod = GXv_int6[0] ;
                        tserpa2_impl.this.A65ArtCod = GXv_char3[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevelD5476( ) ;
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
            endLevelD5476( ) ;
         }
      }
      closeExtendedTableCursorsD5476( ) ;
   }

   public void deferredUpdateD5476( )
   {
   }

   public void deleteD5476( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateD5476( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyD5476( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsD5476( ) ;
         afterConfirmD5476( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteD5476( ) ;
            if ( AnyError == 0 )
            {
               scanStartD5477( ) ;
               while ( RcdFound477 != 0 )
               {
                  getByPrimaryKeyD5477( ) ;
                  deleteD5477( ) ;
                  scanNextD5477( ) ;
               }
               scanEndD5477( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00D578 */
                  pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
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
      sMode476 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelD5476( ) ;
      Gx_mode = sMode476 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsD5476( )
   {
      standaloneModalD5476( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00D579 */
         pr_default.execute(77, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T00D579_A759ProDsc[0] ;
         pr_default.close(77);
         /* Using cursor T00D580 */
         pr_default.execute(78, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T00D580_A460FasDsc[0] ;
         pr_default.close(78);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00D581 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A457FasCod});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ArtFor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
      }
   }

   public void processNestedLevelD5477( )
   {
      nGXsfl_78_idx = 0 ;
      while ( nGXsfl_78_idx < nRC_GXsfl_78 )
      {
         readRowD5477( ) ;
         if ( ( nRcdExists_477 != 0 ) || ( nIsMod_477 != 0 ) )
         {
            standaloneNotModalD5477( ) ;
            getKeyD5477( ) ;
            if ( ( nRcdExists_477 == 0 ) && ( nRcdDeleted_477 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertD5477( ) ;
            }
            else
            {
               if ( RcdFound477 != 0 )
               {
                  if ( ( nRcdDeleted_477 != 0 ) && ( nRcdExists_477 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteD5477( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_477 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateD5477( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_477 == 0 )
                  {
                     GXCCtl = "PROCOD_" + sGXsfl_43_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtParFasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParFasDsc_Internalname, GXutil.rtrim( A1665ParFasDsc)) ;
         httpContext.changePostValue( edtParFasVal_Internalname, GXutil.rtrim( A1668ParFasVal)) ;
         httpContext.changePostValue( edtParFasObs_Internalname, GXutil.rtrim( A1673ParFasObs)) ;
         httpContext.changePostValue( edtParNVar_Internalname, GXutil.ltrim( localUtil.ntoc( A10584ParNVar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParTit_Internalname, GXutil.rtrim( A10585ParTit)) ;
         httpContext.changePostValue( edtParFasVl2_Internalname, GXutil.rtrim( A12670ParFasVl2)) ;
         httpContext.changePostValue( edtParUndID_Internalname, GXutil.ltrim( localUtil.ntoc( A13203ParUndID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParUndDsc_Internalname, GXutil.rtrim( A13204ParUndDsc)) ;
         httpContext.changePostValue( edtParOrden_Internalname, GXutil.ltrim( localUtil.ntoc( A13220ParOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1668ParFasVal_"+sGXsfl_78_idx, GXutil.rtrim( Z1668ParFasVal)) ;
         httpContext.changePostValue( "ZT_"+"Z1673ParFasObs_"+sGXsfl_78_idx, GXutil.rtrim( Z1673ParFasObs)) ;
         httpContext.changePostValue( "ZT_"+"Z12670ParFasVl2_"+sGXsfl_78_idx, GXutil.rtrim( Z12670ParFasVl2)) ;
         httpContext.changePostValue( "ZT_"+"Z13220ParOrden_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( Z13220ParOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14061ParFasVmn_"+sGXsfl_78_idx, GXutil.rtrim( Z14061ParFasVmn)) ;
         httpContext.changePostValue( "ZT_"+"Z14060ParFasVmx_"+sGXsfl_78_idx, GXutil.rtrim( Z14060ParFasVmx)) ;
         httpContext.changePostValue( "T1673ParFasObs_"+sGXsfl_78_idx, GXutil.rtrim( O1673ParFasObs)) ;
         httpContext.changePostValue( "T1668ParFasVal_"+sGXsfl_78_idx, GXutil.rtrim( O1668ParFasVal)) ;
         httpContext.changePostValue( "T1664ParFasCod_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( O1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_477_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_477, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_477_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_477, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_477_"+sGXsfl_78_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_477, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_477 != 0 )
         {
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASDSC_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASVAL_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASOBS_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARNVAR_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParNVar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARTIT_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParTit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASVL2_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVl2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARUNDID_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARUNDDSC_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARORDEN_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParOrden_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllD5477( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_477 = (short)(0) ;
      nIsMod_477 = (short)(0) ;
      nRcdDeleted_477 = (short)(0) ;
   }

   public void processLevelD5476( )
   {
      /* Save parent mode. */
      sMode476 = Gx_mode ;
      processNestedLevelD5477( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode476 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelD5476( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartD5476( )
   {
      /* Scan By routine */
      /* Using cursor T00D582 */
      pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      RcdFound476 = (short)(0) ;
      if ( (pr_default.getStatus(80) != 101) )
      {
         RcdFound476 = (short)(1) ;
         A758ProCod = T00D582_A758ProCod[0] ;
         A457FasCod = T00D582_A457FasCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextD5476( )
   {
      /* Scan next routine */
      pr_default.readNext(80);
      RcdFound476 = (short)(0) ;
      if ( (pr_default.getStatus(80) != 101) )
      {
         RcdFound476 = (short)(1) ;
         A758ProCod = T00D582_A758ProCod[0] ;
         A457FasCod = T00D582_A457FasCod[0] ;
      }
   }

   public void scanEndD5476( )
   {
      pr_default.close(80);
   }

   public void afterConfirmD5476( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertD5476( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateD5476( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteD5476( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteD5476( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateD5476( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesD5476( )
   {
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtArtFasFac_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtFasFac_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtFasFac_Enabled), 5, 0), !bGXsfl_43_Refreshing);
   }

   public void zmD5477( int GX_JID )
   {
      if ( ( GX_JID == 23 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1668ParFasVal = T00D53_A1668ParFasVal[0] ;
            Z1673ParFasObs = T00D53_A1673ParFasObs[0] ;
            Z12670ParFasVl2 = T00D53_A12670ParFasVl2[0] ;
            Z13220ParOrden = T00D53_A13220ParOrden[0] ;
            Z14061ParFasVmn = T00D53_A14061ParFasVmn[0] ;
            Z14060ParFasVmx = T00D53_A14060ParFasVmx[0] ;
         }
         else
         {
            Z1668ParFasVal = A1668ParFasVal ;
            Z1673ParFasObs = A1673ParFasObs ;
            Z12670ParFasVl2 = A12670ParFasVl2 ;
            Z13220ParOrden = A13220ParOrden ;
            Z14061ParFasVmn = A14061ParFasVmn ;
            Z14060ParFasVmx = A14060ParFasVmx ;
         }
      }
      if ( GX_JID == -23 )
      {
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z1668ParFasVal = A1668ParFasVal ;
         Z1673ParFasObs = A1673ParFasObs ;
         Z12670ParFasVl2 = A12670ParFasVl2 ;
         Z13220ParOrden = A13220ParOrden ;
         Z14061ParFasVmn = A14061ParFasVmn ;
         Z14060ParFasVmx = A14060ParFasVmx ;
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

   public void standaloneNotModalD5477( )
   {
   }

   public void standaloneModalD5477( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         AV33Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Modif", AV33Modif);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtParFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_78_Refreshing);
      }
      else
      {
         edtParFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_78_Refreshing);
      }
   }

   public void loadD5477( )
   {
      /* Using cursor T00D583 */
      pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(81) != 101) )
      {
         RcdFound477 = (short)(1) ;
         A1665ParFasDsc = T00D583_A1665ParFasDsc[0] ;
         n1665ParFasDsc = T00D583_n1665ParFasDsc[0] ;
         A1668ParFasVal = T00D583_A1668ParFasVal[0] ;
         A1673ParFasObs = T00D583_A1673ParFasObs[0] ;
         A10584ParNVar = T00D583_A10584ParNVar[0] ;
         n10584ParNVar = T00D583_n10584ParNVar[0] ;
         A10585ParTit = T00D583_A10585ParTit[0] ;
         n10585ParTit = T00D583_n10585ParTit[0] ;
         A12670ParFasVl2 = T00D583_A12670ParFasVl2[0] ;
         A13204ParUndDsc = T00D583_A13204ParUndDsc[0] ;
         n13204ParUndDsc = T00D583_n13204ParUndDsc[0] ;
         A13220ParOrden = T00D583_A13220ParOrden[0] ;
         A14061ParFasVmn = T00D583_A14061ParFasVmn[0] ;
         A14060ParFasVmx = T00D583_A14060ParFasVmx[0] ;
         A13203ParUndID = T00D583_A13203ParUndID[0] ;
         n13203ParUndID = T00D583_n13203ParUndID[0] ;
         zmD5477( -23) ;
      }
      pr_default.close(81);
      onLoadActionsD5477( ) ;
   }

   public void onLoadActionsD5477( )
   {
   }

   public void checkExtendedTableD5477( )
   {
      nIsDirty_477 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalD5477( ) ;
      /* Using cursor T00D54 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_78_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1665ParFasDsc = T00D54_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T00D54_n1665ParFasDsc[0] ;
      A10584ParNVar = T00D54_A10584ParNVar[0] ;
      n10584ParNVar = T00D54_n10584ParNVar[0] ;
      A10585ParTit = T00D54_A10585ParTit[0] ;
      n10585ParTit = T00D54_n10585ParTit[0] ;
      A13203ParUndID = T00D54_A13203ParUndID[0] ;
      n13203ParUndID = T00D54_n13203ParUndID[0] ;
      pr_default.close(2);
      /* Using cursor T00D55 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13203ParUndID) ) )
         {
            GXCCtl = "PARUNDID_" + sGXsfl_78_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIDADES PARAMETROS FASES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
         }
      }
      A13204ParUndDsc = T00D55_A13204ParUndDsc[0] ;
      n13204ParUndDsc = T00D55_n13204ParUndDsc[0] ;
      pr_default.close(3);
      if ( true /* After */ && ( A1664ParFasCod > 0 ) && ( A10584ParNVar > 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A252CliCod ;
         GXv_char3[0] = A65ArtCod ;
         GXv_char2[0] = A758ProCod ;
         GXv_char7[0] = A457FasCod ;
         GXv_int8[0] = A1664ParFasCod ;
         GXv_int9[0] = A10584ParNVar ;
         GXv_int10[0] = AV39Flagr ;
         GXv_char11[0] = AV40Msg_err ;
         new app.pserpar3(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_char2, GXv_char7, GXv_int8, GXv_int9, GXv_int10, GXv_char11) ;
         tserpa2_impl.this.A396EmprCod = GXv_char4[0] ;
         tserpa2_impl.this.A252CliCod = GXv_int6[0] ;
         tserpa2_impl.this.A65ArtCod = GXv_char3[0] ;
         tserpa2_impl.this.A758ProCod = GXv_char2[0] ;
         tserpa2_impl.this.A457FasCod = GXv_char7[0] ;
         tserpa2_impl.this.A1664ParFasCod = GXv_int8[0] ;
         tserpa2_impl.this.A10584ParNVar = GXv_int9[0] ;
         tserpa2_impl.this.AV39Flagr = GXv_int10[0] ;
         tserpa2_impl.this.AV40Msg_err = GXv_char11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV39Flagr", GXutil.str( AV39Flagr, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV40Msg_err", AV40Msg_err);
      }
      if ( ( AV39Flagr == 1 ) && true /* After */ && ( A1664ParFasCod > 0 ) && ( A10584ParNVar > 0 ) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_78_idx ;
         httpContext.GX_msglist.addItem(AV40Msg_err, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsD5477( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisableD5477( )
   {
   }

   public void gxload_24( String A396EmprCod ,
                          short A1664ParFasCod )
   {
      /* Using cursor T00D584 */
      pr_default.execute(82, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(82) == 101) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_78_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1665ParFasDsc = T00D584_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T00D584_n1665ParFasDsc[0] ;
      A10584ParNVar = T00D584_A10584ParNVar[0] ;
      n10584ParNVar = T00D584_n10584ParNVar[0] ;
      A10585ParTit = T00D584_A10585ParTit[0] ;
      n10585ParTit = T00D584_n10585ParTit[0] ;
      A13203ParUndID = T00D584_A13203ParUndID[0] ;
      n13203ParUndID = T00D584_n13203ParUndID[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1665ParFasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10584ParNVar, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10585ParTit))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13203ParUndID, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(82) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(82);
   }

   public void gxload_25( String A396EmprCod ,
                          short A13203ParUndID )
   {
      /* Using cursor T00D585 */
      pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
      if ( (pr_default.getStatus(83) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13203ParUndID) ) )
         {
            GXCCtl = "PARUNDID_" + sGXsfl_78_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIDADES PARAMETROS FASES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
         }
      }
      A13204ParUndDsc = T00D585_A13204ParUndDsc[0] ;
      n13204ParUndDsc = T00D585_n13204ParUndDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13204ParUndDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(83) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(83);
   }

   public void getKeyD5477( )
   {
      /* Using cursor T00D586 */
      pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(84) != 101) )
      {
         RcdFound477 = (short)(1) ;
      }
      else
      {
         RcdFound477 = (short)(0) ;
      }
      pr_default.close(84);
   }

   public void getByPrimaryKeyD5477( )
   {
      /* Using cursor T00D53 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00D53_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmD5477( 23) ;
         RcdFound477 = (short)(1) ;
         initializeNonKeyD5477( ) ;
         A1668ParFasVal = T00D53_A1668ParFasVal[0] ;
         A1673ParFasObs = T00D53_A1673ParFasObs[0] ;
         A12670ParFasVl2 = T00D53_A12670ParFasVl2[0] ;
         A13220ParOrden = T00D53_A13220ParOrden[0] ;
         A14061ParFasVmn = T00D53_A14061ParFasVmn[0] ;
         A14060ParFasVmx = T00D53_A14060ParFasVmx[0] ;
         A1664ParFasCod = T00D53_A1664ParFasCod[0] ;
         O1673ParFasObs = A1673ParFasObs ;
         O1668ParFasVal = A1668ParFasVal ;
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
         loadD5477( ) ;
         Gx_mode = sMode477 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound477 = (short)(0) ;
         initializeNonKeyD5477( ) ;
         sMode477 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalD5477( ) ;
         Gx_mode = sMode477 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesD5477( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyD5477( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00D52 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPSERPAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z1668ParFasVal, T00D52_A1668ParFasVal[0]) != 0 ) || ( GXutil.strcmp(Z1673ParFasObs, T00D52_A1673ParFasObs[0]) != 0 ) || ( GXutil.strcmp(Z12670ParFasVl2, T00D52_A12670ParFasVl2[0]) != 0 ) || ( Z13220ParOrden != T00D52_A13220ParOrden[0] ) || ( GXutil.strcmp(Z14061ParFasVmn, T00D52_A14061ParFasVmn[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14060ParFasVmx, T00D52_A14060ParFasVmx[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z1668ParFasVal, T00D52_A1668ParFasVal[0]) != 0 )
            {
               GXutil.writeLogln("tserpa2:[seudo value changed for attri]"+"ParFasVal");
               GXutil.writeLogRaw("Old: ",Z1668ParFasVal);
               GXutil.writeLogRaw("Current: ",T00D52_A1668ParFasVal[0]);
            }
            if ( GXutil.strcmp(Z1673ParFasObs, T00D52_A1673ParFasObs[0]) != 0 )
            {
               GXutil.writeLogln("tserpa2:[seudo value changed for attri]"+"ParFasObs");
               GXutil.writeLogRaw("Old: ",Z1673ParFasObs);
               GXutil.writeLogRaw("Current: ",T00D52_A1673ParFasObs[0]);
            }
            if ( GXutil.strcmp(Z12670ParFasVl2, T00D52_A12670ParFasVl2[0]) != 0 )
            {
               GXutil.writeLogln("tserpa2:[seudo value changed for attri]"+"ParFasVl2");
               GXutil.writeLogRaw("Old: ",Z12670ParFasVl2);
               GXutil.writeLogRaw("Current: ",T00D52_A12670ParFasVl2[0]);
            }
            if ( Z13220ParOrden != T00D52_A13220ParOrden[0] )
            {
               GXutil.writeLogln("tserpa2:[seudo value changed for attri]"+"ParOrden");
               GXutil.writeLogRaw("Old: ",Z13220ParOrden);
               GXutil.writeLogRaw("Current: ",T00D52_A13220ParOrden[0]);
            }
            if ( GXutil.strcmp(Z14061ParFasVmn, T00D52_A14061ParFasVmn[0]) != 0 )
            {
               GXutil.writeLogln("tserpa2:[seudo value changed for attri]"+"ParFasVmn");
               GXutil.writeLogRaw("Old: ",Z14061ParFasVmn);
               GXutil.writeLogRaw("Current: ",T00D52_A14061ParFasVmn[0]);
            }
            if ( GXutil.strcmp(Z14060ParFasVmx, T00D52_A14060ParFasVmx[0]) != 0 )
            {
               GXutil.writeLogln("tserpa2:[seudo value changed for attri]"+"ParFasVmx");
               GXutil.writeLogRaw("Old: ",Z14060ParFasVmx);
               GXutil.writeLogRaw("Current: ",T00D52_A14060ParFasVmx[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPSERPAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertD5477( )
   {
      beforeValidateD5477( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableD5477( ) ;
      }
      if ( AnyError == 0 )
      {
         zmD5477( 0) ;
         checkOptimisticConcurrencyD5477( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmD5477( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertD5477( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00D587 */
                  pr_default.execute(85, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A1668ParFasVal, A1673ParFasObs, A12670ParFasVl2, Short.valueOf(A13220ParOrden), A14061ParFasVmn, A14060ParFasVmx, A396EmprCod, Short.valueOf(A1664ParFasCod), A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAR");
                  if ( (pr_default.getStatus(85) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( ( ( ( A1664ParFasCod != O1664ParFasCod ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                     {
                        AV33Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV33Modif", AV33Modif);
                     }
                     else
                     {
                        if ( ( ( ( ( GXutil.strcmp(A1668ParFasVal, O1668ParFasVal) != 0 ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                        {
                           AV33Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV33Modif", AV33Modif);
                        }
                        else
                        {
                           if ( ( ( ( ( GXutil.strcmp(A1673ParFasObs, O1673ParFasObs) != 0 ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                           {
                              AV33Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV33Modif", AV33Modif);
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
            loadD5477( ) ;
         }
         endLevelD5477( ) ;
      }
      closeExtendedTableCursorsD5477( ) ;
   }

   public void updateD5477( )
   {
      beforeValidateD5477( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableD5477( ) ;
      }
      if ( ( nIsMod_477 != 0 ) || ( nIsDirty_477 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyD5477( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmD5477( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateD5477( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00D588 */
                     pr_default.execute(86, new Object[] {A1668ParFasVal, A1673ParFasObs, A12670ParFasVl2, Short.valueOf(A13220ParOrden), A14061ParFasVmn, A14060ParFasVmx, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A1664ParFasCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAR");
                     if ( (pr_default.getStatus(86) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPSERPAR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateD5477( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char11[0] = A396EmprCod ;
                        GXv_int6[0] = A252CliCod ;
                        GXv_char7[0] = A65ArtCod ;
                        new app.txparticuupdateredundancy(remoteHandle, context).execute( GXv_char11, GXv_int6, GXv_char7) ;
                        tserpa2_impl.this.A396EmprCod = GXv_char11[0] ;
                        tserpa2_impl.this.A252CliCod = GXv_int6[0] ;
                        tserpa2_impl.this.A65ArtCod = GXv_char7[0] ;
                        /* Start of After( update) rules */
                        if ( ( ( ( ( A1664ParFasCod != O1664ParFasCod ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                        {
                           AV33Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV33Modif", AV33Modif);
                        }
                        else
                        {
                           if ( ( ( ( ( GXutil.strcmp(A1668ParFasVal, O1668ParFasVal) != 0 ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                           {
                              AV33Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                              httpContext.ajax_rsp_assign_attri("", false, "AV33Modif", AV33Modif);
                           }
                           else
                           {
                              if ( ( ( ( ( GXutil.strcmp(A1673ParFasObs, O1673ParFasObs) != 0 ) ) && true /* After */ ) || true /* After */ || isDlt( )  ) && true /* Level */ )
                              {
                                 AV33Modif = httpContext.getMessage( httpContext.getMessage( "Y", ""), "") ;
                                 httpContext.ajax_rsp_assign_attri("", false, "AV33Modif", AV33Modif);
                              }
                           }
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyD5477( ) ;
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
            endLevelD5477( ) ;
         }
      }
      closeExtendedTableCursorsD5477( ) ;
   }

   public void deferredUpdateD5477( )
   {
   }

   public void deleteD5477( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateD5477( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyD5477( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsD5477( ) ;
         afterConfirmD5477( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteD5477( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00D589 */
               pr_default.execute(87, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A1664ParFasCod)});
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
      endLevelD5477( ) ;
      Gx_mode = sMode477 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsD5477( )
   {
      standaloneModalD5477( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00D590 */
         pr_default.execute(88, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
         A1665ParFasDsc = T00D590_A1665ParFasDsc[0] ;
         n1665ParFasDsc = T00D590_n1665ParFasDsc[0] ;
         A10584ParNVar = T00D590_A10584ParNVar[0] ;
         n10584ParNVar = T00D590_n10584ParNVar[0] ;
         A10585ParTit = T00D590_A10585ParTit[0] ;
         n10585ParTit = T00D590_n10585ParTit[0] ;
         A13203ParUndID = T00D590_A13203ParUndID[0] ;
         n13203ParUndID = T00D590_n13203ParUndID[0] ;
         pr_default.close(88);
         /* Using cursor T00D591 */
         pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
         A13204ParUndDsc = T00D591_A13204ParUndDsc[0] ;
         n13204ParUndDsc = T00D591_n13204ParUndDsc[0] ;
         pr_default.close(89);
      }
   }

   public void endLevelD5477( )
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

   public void scanStartD5477( )
   {
      /* Scan By routine */
      /* Using cursor T00D592 */
      pr_default.execute(90, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod, A457FasCod});
      RcdFound477 = (short)(0) ;
      if ( (pr_default.getStatus(90) != 101) )
      {
         RcdFound477 = (short)(1) ;
         A1664ParFasCod = T00D592_A1664ParFasCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextD5477( )
   {
      /* Scan next routine */
      pr_default.readNext(90);
      RcdFound477 = (short)(0) ;
      if ( (pr_default.getStatus(90) != 101) )
      {
         RcdFound477 = (short)(1) ;
         A1664ParFasCod = T00D592_A1664ParFasCod[0] ;
      }
   }

   public void scanEndD5477( )
   {
      pr_default.close(90);
   }

   public void afterConfirmD5477( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertD5477( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateD5477( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteD5477( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteD5477( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateD5477( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesD5477( )
   {
      edtParFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_78_Refreshing);
      edtParFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasDsc_Enabled), 5, 0), !bGXsfl_78_Refreshing);
      edtParFasVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasVal_Enabled), 5, 0), !bGXsfl_78_Refreshing);
      edtParFasObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasObs_Enabled), 5, 0), !bGXsfl_78_Refreshing);
      edtParNVar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParNVar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParNVar_Enabled), 5, 0), !bGXsfl_78_Refreshing);
      edtParTit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParTit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParTit_Enabled), 5, 0), !bGXsfl_78_Refreshing);
      edtParFasVl2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasVl2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasVl2_Enabled), 5, 0), !bGXsfl_78_Refreshing);
      edtParUndID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParUndID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParUndID_Enabled), 5, 0), !bGXsfl_78_Refreshing);
      edtParUndDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParUndDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParUndDsc_Enabled), 5, 0), !bGXsfl_78_Refreshing);
      edtParOrden_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParOrden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParOrden_Enabled), 5, 0), !bGXsfl_78_Refreshing);
   }

   public void send_integrity_lvl_hashesD5477( )
   {
   }

   public void send_integrity_lvl_hashesD5476( )
   {
   }

   public void send_integrity_lvl_hashesD510( )
   {
   }

   public void subsflControlProps_43476( )
   {
      edtProCod_Internalname = "PROCOD_"+sGXsfl_43_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_43_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_43_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_43_idx ;
      edtArtFasFac_Internalname = "ARTFASFAC_"+sGXsfl_43_idx ;
      subGridlevel_level2_Internalname = "GRIDLEVEL_LEVEL2_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_43476( )
   {
      edtProCod_Internalname = "PROCOD_"+sGXsfl_43_fel_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_43_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_43_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_43_fel_idx ;
      edtArtFasFac_Internalname = "ARTFASFAC_"+sGXsfl_43_fel_idx ;
      subGridlevel_level2_Internalname = "GRIDLEVEL_LEVEL2_"+sGXsfl_43_fel_idx ;
   }

   public void addRowD5476( )
   {
      nRC_GXsfl_78 = 0 ;
      nGXsfl_43_idx = (int)(nGXsfl_43_idx+1) ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_43476( ) ;
      sendRowD5476( ) ;
   }

   public void sendRowD5476( )
   {
      Freestylelevel_level1Row = GXWebRow.GetNew(context) ;
      if ( subFreestylelevel_level1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subFreestylelevel_level1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subFreestylelevel_level1_Class, "") != 0 )
         {
            subFreestylelevel_level1_Linesclass = subFreestylelevel_level1_Class+"Odd" ;
         }
      }
      else if ( subFreestylelevel_level1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subFreestylelevel_level1_Backstyle = (byte)(0) ;
         subFreestylelevel_level1_Backcolor = subFreestylelevel_level1_Allbackcolor ;
         if ( GXutil.strcmp(subFreestylelevel_level1_Class, "") != 0 )
         {
            subFreestylelevel_level1_Linesclass = subFreestylelevel_level1_Class+"Uniform" ;
         }
      }
      else if ( subFreestylelevel_level1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subFreestylelevel_level1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subFreestylelevel_level1_Class, "") != 0 )
         {
            subFreestylelevel_level1_Linesclass = subFreestylelevel_level1_Class+"Odd" ;
         }
         subFreestylelevel_level1_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subFreestylelevel_level1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subFreestylelevel_level1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
         {
            subFreestylelevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subFreestylelevel_level1_Class, "") != 0 )
            {
               subFreestylelevel_level1_Linesclass = subFreestylelevel_level1_Class+"Even" ;
            }
         }
         else
         {
            subFreestylelevel_level1_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subFreestylelevel_level1_Class, "") != 0 )
            {
               subFreestylelevel_level1_Linesclass = subFreestylelevel_level1_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( Freestylelevel_level1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subFreestylelevel_level1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_43_idx+"\">") ;
      }
      if ( FREESTYLELEVEL_LEVEL1_IsPaging == 0 )
      {
         GXCCtl = "GRIDLEVEL_LEVEL2_nFirstRecordOnPage_" + sGXsfl_43_idx ;
         GRIDLEVEL_LEVEL2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRIDLEVEL_LEVEL2_nFirstRecordOnPage = 0 ;
      }
      /* Table start */
      Freestylelevel_level1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblUnnamedtablefsfreestylelevel_level1_Internalname+"_"+sGXsfl_43_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Freestylelevel_level1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Freestylelevel_level1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTableintermediateinslevel_level1_Internalname+"_"+sGXsfl_43_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 DataContentCell","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtProCod_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,httpContext.getMessage( "Codigo Proceso", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_476_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_43_idx + "',43)\"" ;
      ROClassString = "AttributeFL" ;
      Freestylelevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtProCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 DataContentCell","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtProDsc_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtProDsc_Internalname,httpContext.getMessage( "Descripcion Proceso", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "AttributeFL" ;
      Freestylelevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProDsc_Internalname,GXutil.rtrim( A759ProDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProDsc_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtProDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(40),"chr",Integer.valueOf(1),"row",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 DataContentCell","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtFasCod_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,httpContext.getMessage( "Codigo Fase", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_476_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_43_idx + "',43)\"" ;
      ROClassString = "AttributeFL" ;
      Freestylelevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 DataContentCell","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtFasDsc_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,httpContext.getMessage( "Descripcion de Fase", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "AttributeFL" ;
      Freestylelevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(28),"chr",Integer.valueOf(1),"row",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 DataContentCell","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group","left","top",""+" data-gx-for=\""+edtArtFasFac_Internalname+"\"","","div"});
      /* Attribute/Variable Label */
      Freestylelevel_level1Row.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtArtFasFac_Internalname,httpContext.getMessage( "Factor Escandallo Fase-Articul", ""),"col-sm-3 AttributeFLLabel",Integer.valueOf(1),Boolean.valueOf(true),""});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-sm-9 gx-attribute","left","top","","","div"});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_476_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_43_idx + "',43)\"" ;
      ROClassString = "AttributeFL" ;
      Freestylelevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtArtFasFac_Internalname,GXutil.ltrim( localUtil.ntoc( A8560ArtFasFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtArtFasFac_Enabled!=0) ? localUtil.format( A8560ArtFasFac, "ZZ9.99") : localUtil.format( A8560ArtFasFac, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtArtFasFac_Jsonclick,Integer.valueOf(0),"AttributeFL","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtArtFasFac_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 col-lg-6 CellMarginTop","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTableleaflevel_level2_Internalname+"_"+sGXsfl_43_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      Freestylelevel_level1Row.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 SectionGrid EditableGridCell_LinedAtts","left","top","","","div"});
      /*  Child Grid Control  */
      Freestylelevel_level1Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Gridlevel_level2Container"});
      if ( isAjaxCallMode( ) )
      {
         Gridlevel_level2Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Gridlevel_level2Container.Clear();
      }
      startgridcontrol78( ) ;
      nGXsfl_78_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount477 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_477 = (short)(1) ;
            scanStartD5477( ) ;
            while ( RcdFound477 != 0 )
            {
               init_level_properties477( ) ;
               getByPrimaryKeyD5477( ) ;
               addRowD5477( ) ;
               scanNextD5477( ) ;
            }
            scanEndD5477( ) ;
            nBlankRcdCount477 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalD5477( ) ;
         standaloneModalD5477( ) ;
         sMode477 = Gx_mode ;
         while ( nGXsfl_78_idx < nRC_GXsfl_78 )
         {
            bGXsfl_78_Refreshing = true ;
            readRowD5477( ) ;
            edtParFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASCOD_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_78_Refreshing);
            edtParFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASDSC_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasDsc_Enabled), 5, 0), !bGXsfl_78_Refreshing);
            edtParFasVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASVAL_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasVal_Enabled), 5, 0), !bGXsfl_78_Refreshing);
            edtParFasObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASOBS_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasObs_Enabled), 5, 0), !bGXsfl_78_Refreshing);
            edtParNVar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARNVAR_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParNVar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParNVar_Enabled), 5, 0), !bGXsfl_78_Refreshing);
            edtParTit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARTIT_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParTit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParTit_Enabled), 5, 0), !bGXsfl_78_Refreshing);
            edtParFasVl2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASVL2_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasVl2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasVl2_Enabled), 5, 0), !bGXsfl_78_Refreshing);
            edtParUndID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARUNDID_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParUndID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParUndID_Enabled), 5, 0), !bGXsfl_78_Refreshing);
            edtParUndDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARUNDDSC_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParUndDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParUndDsc_Enabled), 5, 0), !bGXsfl_78_Refreshing);
            edtParOrden_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARORDEN_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParOrden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParOrden_Enabled), 5, 0), !bGXsfl_78_Refreshing);
            if ( ( nRcdExists_477 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalD5477( ) ;
            }
            sendRowD5477( ) ;
            bGXsfl_78_Refreshing = false ;
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
            scanStartD5477( ) ;
            while ( RcdFound477 != 0 )
            {
               sGXsfl_78_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_78_idx+1), 4, 0), (short)(4), "0") + sGXsfl_43_idx ;
               subsflControlProps_78477( ) ;
               init_level_properties477( ) ;
               standaloneNotModalD5477( ) ;
               getByPrimaryKeyD5477( ) ;
               standaloneModalD5477( ) ;
               addRowD5477( ) ;
               scanNextD5477( ) ;
            }
            scanEndD5477( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode477 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_78_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_78_idx+1), 4, 0), (short)(4), "0") + sGXsfl_43_idx ;
         subsflControlProps_78477( ) ;
         initAllD5477( ) ;
         init_level_properties477( ) ;
         nRcdExists_477 = (short)(0) ;
         nIsMod_477 = (short)(0) ;
         nRcdDeleted_477 = (short)(0) ;
         if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 43 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_43_idx, ".")) == 0 ) )
         {
            nBlankRcdCount477 = (short)(nBlankRcdUsr477+nBlankRcdCount477) ;
         }
         fRowAdded = 0 ;
         while ( nBlankRcdCount477 > 0 )
         {
            standaloneNotModalD5477( ) ;
            standaloneModalD5477( ) ;
            addRowD5477( ) ;
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
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level2ContainerData"+"_"+sGXsfl_43_idx, Gridlevel_level2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Freestylelevel_level1Row.AddGrid("Gridlevel_level2", Gridlevel_level2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level2ContainerData"+"V_"+sGXsfl_43_idx, Gridlevel_level2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_level2ContainerData"+"V_"+sGXsfl_43_idx+"\" value='"+Gridlevel_level2Container.GridValuesHidden()+"'/>") ;
      }
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      Freestylelevel_level1Row.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* End of table */
      httpContext.ajax_sending_grid_row(Freestylelevel_level1Row);
      send_integrity_lvl_hashesD5476( ) ;
      GXCCtl = "Z758ProCod_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z758ProCod));
      GXCCtl = "Z457FasCod_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z457FasCod));
      GXCCtl = "Z8560ArtFasFac_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8560ArtFasFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14544ArtFasPyS_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14544ArtFasPyS, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14545ArtFasPpp_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14545ArtFasPpp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14546ArtFasVel_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14546ArtFasVel, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14547ArtFasNPs_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14547ArtFasNPs, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_78_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_78_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_476_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_476_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_476_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_476, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_43_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV44TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV44TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV42EmprCod));
      GXCCtl = "vCLICOD_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV25CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vARTCOD_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV26ArtCod));
      GXCCtl = "vMODIF_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV33Modif));
      GXCCtl = "vMSG_ERR_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV40Msg_err));
      GXCCtl = "vFLAGR_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV39Flagr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "PARFASVMN_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A14061ParFasVmn));
      GXCCtl = "PARFASVMX_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A14060ParFasVmx));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRODSC_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTFASFAC_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtArtFasFac_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRIDLEVEL_LEVEL2_nFirstRecordOnPage = 0 ;
      GRIDLEVEL_LEVEL2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      Freestylelevel_level1Container.AddRow(Freestylelevel_level1Row);
   }

   public void readRowD5476( )
   {
      nGXsfl_43_idx = (int)(nGXsfl_43_idx+1) ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_43476( ) ;
      edtProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROCOD_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRODSC_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtArtFasFac_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ARTFASFAC_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
      A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
      A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
      A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtArtFasFac_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtArtFasFac_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "ARTFASFAC_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtArtFasFac_Internalname ;
         wbErr = true ;
         A8560ArtFasFac = DecimalUtil.ZERO ;
      }
      else
      {
         A8560ArtFasFac = localUtil.ctond( httpContext.cgiGet( edtArtFasFac_Internalname)) ;
      }
      GXCCtl = "Z758ProCod_" + sGXsfl_43_idx ;
      Z758ProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z457FasCod_" + sGXsfl_43_idx ;
      Z457FasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8560ArtFasFac_" + sGXsfl_43_idx ;
      Z8560ArtFasFac = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14544ArtFasPyS_" + sGXsfl_43_idx ;
      Z14544ArtFasPyS = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14545ArtFasPpp_" + sGXsfl_43_idx ;
      Z14545ArtFasPpp = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14546ArtFasVel_" + sGXsfl_43_idx ;
      Z14546ArtFasVel = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14547ArtFasNPs_" + sGXsfl_43_idx ;
      Z14547ArtFasNPs = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14544ArtFasPyS_" + sGXsfl_43_idx ;
      A14544ArtFasPyS = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14545ArtFasPpp_" + sGXsfl_43_idx ;
      A14545ArtFasPpp = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14546ArtFasVel_" + sGXsfl_43_idx ;
      A14546ArtFasVel = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14547ArtFasNPs_" + sGXsfl_43_idx ;
      A14547ArtFasNPs = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_78_" + sGXsfl_43_idx ;
      nRC_GXsfl_78 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_476_" + sGXsfl_43_idx ;
      nRcdDeleted_476 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_476_" + sGXsfl_43_idx ;
      nRcdExists_476 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_476_" + sGXsfl_43_idx ;
      nIsMod_476 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "vMODIF_" + sGXsfl_43_idx ;
      AV33Modif = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "vMSG_ERR_" + sGXsfl_43_idx ;
      AV40Msg_err = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "vFLAGR_" + sGXsfl_43_idx ;
      AV39Flagr = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "PARFASVMN_" + sGXsfl_43_idx ;
      A14061ParFasVmn = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "PARFASVMX_" + sGXsfl_43_idx ;
      A14060ParFasVmx = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRC_GXsfl_78_" + sGXsfl_43_idx ;
      nRC_GXsfl_78 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_78477( )
   {
      edtParFasCod_Internalname = "PARFASCOD_"+sGXsfl_78_idx ;
      edtParFasDsc_Internalname = "PARFASDSC_"+sGXsfl_78_idx ;
      edtParFasVal_Internalname = "PARFASVAL_"+sGXsfl_78_idx ;
      edtParFasObs_Internalname = "PARFASOBS_"+sGXsfl_78_idx ;
      edtParNVar_Internalname = "PARNVAR_"+sGXsfl_78_idx ;
      edtParTit_Internalname = "PARTIT_"+sGXsfl_78_idx ;
      edtParFasVl2_Internalname = "PARFASVL2_"+sGXsfl_78_idx ;
      edtParUndID_Internalname = "PARUNDID_"+sGXsfl_78_idx ;
      edtParUndDsc_Internalname = "PARUNDDSC_"+sGXsfl_78_idx ;
      edtParOrden_Internalname = "PARORDEN_"+sGXsfl_78_idx ;
   }

   public void subsflControlProps_fel_78477( )
   {
      edtParFasCod_Internalname = "PARFASCOD_"+sGXsfl_78_fel_idx ;
      edtParFasDsc_Internalname = "PARFASDSC_"+sGXsfl_78_fel_idx ;
      edtParFasVal_Internalname = "PARFASVAL_"+sGXsfl_78_fel_idx ;
      edtParFasObs_Internalname = "PARFASOBS_"+sGXsfl_78_fel_idx ;
      edtParNVar_Internalname = "PARNVAR_"+sGXsfl_78_fel_idx ;
      edtParTit_Internalname = "PARTIT_"+sGXsfl_78_fel_idx ;
      edtParFasVl2_Internalname = "PARFASVL2_"+sGXsfl_78_fel_idx ;
      edtParUndID_Internalname = "PARUNDID_"+sGXsfl_78_fel_idx ;
      edtParUndDsc_Internalname = "PARUNDDSC_"+sGXsfl_78_fel_idx ;
      edtParOrden_Internalname = "PARORDEN_"+sGXsfl_78_fel_idx ;
   }

   public void addRowD5477( )
   {
      nGXsfl_78_idx = (int)(nGXsfl_78_idx+1) ;
      sGXsfl_78_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_78_idx), 4, 0), (short)(4), "0") + sGXsfl_43_idx ;
      subsflControlProps_78477( ) ;
      sendRowD5477( ) ;
   }

   public void sendRowD5477( )
   {
      Gridlevel_level2Row = GXWebRow.GetNew(context) ;
      if ( subGridlevel_level2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_level2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_level2_Class, "") != 0 )
         {
            subGridlevel_level2_Linesclass = subGridlevel_level2_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_level2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_level2_Backstyle = (byte)(0) ;
         subGridlevel_level2_Backcolor = subGridlevel_level2_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_level2_Class, "") != 0 )
         {
            subGridlevel_level2_Linesclass = subGridlevel_level2_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_level2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_level2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_level2_Class, "") != 0 )
         {
            subGridlevel_level2_Linesclass = subGridlevel_level2_Class+"Odd" ;
         }
         subGridlevel_level2_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_level2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_level2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_78_idx) % (2))) == 0 )
         {
            subGridlevel_level2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level2_Class, "") != 0 )
            {
               subGridlevel_level2_Linesclass = subGridlevel_level2_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_level2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level2_Class, "") != 0 )
            {
               subGridlevel_level2_Linesclass = subGridlevel_level2_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_477_" + sGXsfl_78_idx + "',1);gx.fn.setControlValue('nIsMod_476_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_78_idx + "',78)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1664ParFasCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParFasCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasDsc_Internalname,GXutil.rtrim( A1665ParFasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_477_" + sGXsfl_78_idx + "',1);gx.fn.setControlValue('nIsMod_476_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_78_idx + "',78)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasVal_Internalname,GXutil.rtrim( A1668ParFasVal),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParFasVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_477_" + sGXsfl_78_idx + "',1);gx.fn.setControlValue('nIsMod_476_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_78_idx + "',78)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasObs_Internalname,GXutil.rtrim( A1673ParFasObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParFasObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParNVar_Internalname,GXutil.ltrim( localUtil.ntoc( A10584ParNVar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtParNVar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10584ParNVar), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10584ParNVar), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParNVar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParNVar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParTit_Internalname,GXutil.rtrim( A10585ParTit),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParTit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParTit_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_477_" + sGXsfl_78_idx + "',1);gx.fn.setControlValue('nIsMod_476_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_78_idx + "',78)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasVl2_Internalname,GXutil.rtrim( A12670ParFasVl2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasVl2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParFasVl2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParUndID_Internalname,GXutil.ltrim( localUtil.ntoc( A13203ParUndID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtParUndID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13203ParUndID), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13203ParUndID), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParUndID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParUndID_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParUndDsc_Internalname,GXutil.rtrim( A13204ParUndDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParUndDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParUndDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_477_" + sGXsfl_78_idx + "',1);gx.fn.setControlValue('nIsMod_476_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_78_idx + "',78)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParOrden_Internalname,GXutil.ltrim( localUtil.ntoc( A13220ParOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtParOrden_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13220ParOrden), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13220ParOrden), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParOrden_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParOrden_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level2Row);
      send_integrity_lvl_hashesD5477( ) ;
      GXCCtl = "Z1664ParFasCod_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1668ParFasVal_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1668ParFasVal));
      GXCCtl = "Z1673ParFasObs_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1673ParFasObs));
      GXCCtl = "Z12670ParFasVl2_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12670ParFasVl2));
      GXCCtl = "Z13220ParOrden_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13220ParOrden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14061ParFasVmn_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14061ParFasVmn));
      GXCCtl = "Z14060ParFasVmx_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14060ParFasVmx));
      GXCCtl = "O1673ParFasObs_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O1673ParFasObs));
      GXCCtl = "O1668ParFasVal_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O1668ParFasVal));
      GXCCtl = "O1664ParFasCod_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_477_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_477, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_477_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_477, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_477_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_477, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_78_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV44TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV44TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV42EmprCod));
      GXCCtl = "vCLICOD_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV25CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vARTCOD_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV26ArtCod));
      GXCCtl = "MODIF_" + sGXsfl_78_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV33Modif));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASCOD_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASDSC_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASVAL_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASOBS_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARNVAR_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParNVar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARTIT_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParTit_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASVL2_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVl2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARUNDID_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndID_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARUNDDSC_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARORDEN_"+sGXsfl_78_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParOrden_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level2Container.AddRow(Gridlevel_level2Row);
   }

   public void readRowD5477( )
   {
      nGXsfl_78_idx = (int)(nGXsfl_78_idx+1) ;
      sGXsfl_78_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_78_idx), 4, 0), (short)(4), "0") + sGXsfl_43_idx ;
      subsflControlProps_78477( ) ;
      edtParFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASCOD_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASDSC_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFasVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASVAL_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFasObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASOBS_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParNVar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARNVAR_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParTit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARTIT_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFasVl2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASVL2_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParUndID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARUNDID_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParUndDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARUNDDSC_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParOrden_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARORDEN_"+sGXsfl_78_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_78_idx ;
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
      A1665ParFasDsc = httpContext.cgiGet( edtParFasDsc_Internalname) ;
      n1665ParFasDsc = false ;
      A1668ParFasVal = httpContext.cgiGet( edtParFasVal_Internalname) ;
      A1673ParFasObs = httpContext.cgiGet( edtParFasObs_Internalname) ;
      A10584ParNVar = (short)(localUtil.ctol( httpContext.cgiGet( edtParNVar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n10584ParNVar = false ;
      A10585ParTit = httpContext.cgiGet( edtParTit_Internalname) ;
      n10585ParTit = false ;
      A12670ParFasVl2 = httpContext.cgiGet( edtParFasVl2_Internalname) ;
      A13203ParUndID = (short)(localUtil.ctol( httpContext.cgiGet( edtParUndID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n13203ParUndID = false ;
      A13204ParUndDsc = httpContext.cgiGet( edtParUndDsc_Internalname) ;
      n13204ParUndDsc = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParOrden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParOrden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PARORDEN_" + sGXsfl_78_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParOrden_Internalname ;
         wbErr = true ;
         A13220ParOrden = (short)(0) ;
      }
      else
      {
         A13220ParOrden = (short)(localUtil.ctol( httpContext.cgiGet( edtParOrden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z1664ParFasCod_" + sGXsfl_78_idx ;
      Z1664ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1668ParFasVal_" + sGXsfl_78_idx ;
      Z1668ParFasVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1673ParFasObs_" + sGXsfl_78_idx ;
      Z1673ParFasObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12670ParFasVl2_" + sGXsfl_78_idx ;
      Z12670ParFasVl2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13220ParOrden_" + sGXsfl_78_idx ;
      Z13220ParOrden = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14061ParFasVmn_" + sGXsfl_78_idx ;
      Z14061ParFasVmn = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14060ParFasVmx_" + sGXsfl_78_idx ;
      Z14060ParFasVmx = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14061ParFasVmn_" + sGXsfl_78_idx ;
      A14061ParFasVmn = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14060ParFasVmx_" + sGXsfl_78_idx ;
      A14060ParFasVmx = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O1673ParFasObs_" + sGXsfl_78_idx ;
      O1673ParFasObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O1668ParFasVal_" + sGXsfl_78_idx ;
      O1668ParFasVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O1664ParFasCod_" + sGXsfl_78_idx ;
      O1664ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_477_" + sGXsfl_78_idx ;
      nRcdDeleted_477 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_477_" + sGXsfl_78_idx ;
      nRcdExists_477 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_477_" + sGXsfl_78_idx ;
      nIsMod_477 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "MODIF_" + sGXsfl_78_idx ;
      AV33Modif = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtParFasCod_Enabled = edtParFasCod_Enabled ;
      defedtFasCod_Enabled = edtFasCod_Enabled ;
      defedtProCod_Enabled = edtProCod_Enabled ;
   }

   public void confirmValuesD50( )
   {
      nGXsfl_78_idx = 0 ;
      sGXsfl_78_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_78_idx), 4, 0), (short)(4), "0") + sGXsfl_43_idx ;
      subsflControlProps_78477( ) ;
      while ( nGXsfl_78_idx < nRC_GXsfl_78 )
      {
         nGXsfl_78_idx = (int)(nGXsfl_78_idx+1) ;
         sGXsfl_78_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_78_idx), 4, 0), (short)(4), "0") + sGXsfl_43_idx ;
         subsflControlProps_78477( ) ;
         httpContext.changePostValue( "Z1664ParFasCod_"+sGXsfl_78_idx, httpContext.cgiGet( "ZT_"+"Z1664ParFasCod_"+sGXsfl_78_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_78_idx) ;
         httpContext.changePostValue( "Z1668ParFasVal_"+sGXsfl_78_idx, httpContext.cgiGet( "ZT_"+"Z1668ParFasVal_"+sGXsfl_78_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1668ParFasVal_"+sGXsfl_78_idx) ;
         httpContext.changePostValue( "Z1673ParFasObs_"+sGXsfl_78_idx, httpContext.cgiGet( "ZT_"+"Z1673ParFasObs_"+sGXsfl_78_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1673ParFasObs_"+sGXsfl_78_idx) ;
         httpContext.changePostValue( "Z12670ParFasVl2_"+sGXsfl_78_idx, httpContext.cgiGet( "ZT_"+"Z12670ParFasVl2_"+sGXsfl_78_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12670ParFasVl2_"+sGXsfl_78_idx) ;
         httpContext.changePostValue( "Z13220ParOrden_"+sGXsfl_78_idx, httpContext.cgiGet( "ZT_"+"Z13220ParOrden_"+sGXsfl_78_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13220ParOrden_"+sGXsfl_78_idx) ;
         httpContext.changePostValue( "Z14061ParFasVmn_"+sGXsfl_78_idx, httpContext.cgiGet( "ZT_"+"Z14061ParFasVmn_"+sGXsfl_78_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14061ParFasVmn_"+sGXsfl_78_idx) ;
         httpContext.changePostValue( "Z14060ParFasVmx_"+sGXsfl_78_idx, httpContext.cgiGet( "ZT_"+"Z14060ParFasVmx_"+sGXsfl_78_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14060ParFasVmx_"+sGXsfl_78_idx) ;
      }
      nGXsfl_43_idx = 0 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_43476( ) ;
      while ( nGXsfl_43_idx < nRC_GXsfl_43 )
      {
         nGXsfl_43_idx = (int)(nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_43476( ) ;
         httpContext.changePostValue( "Z758ProCod_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z758ProCod_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z758ProCod_"+sGXsfl_43_idx) ;
         httpContext.changePostValue( "Z457FasCod_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z457FasCod_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_43_idx) ;
         httpContext.changePostValue( "Z8560ArtFasFac_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z8560ArtFasFac_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8560ArtFasFac_"+sGXsfl_43_idx) ;
         httpContext.changePostValue( "Z14544ArtFasPyS_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z14544ArtFasPyS_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14544ArtFasPyS_"+sGXsfl_43_idx) ;
         httpContext.changePostValue( "Z14545ArtFasPpp_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z14545ArtFasPpp_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14545ArtFasPpp_"+sGXsfl_43_idx) ;
         httpContext.changePostValue( "Z14546ArtFasVel_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z14546ArtFasVel_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14546ArtFasVel_"+sGXsfl_43_idx) ;
         httpContext.changePostValue( "Z14547ArtFasNPs_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z14547ArtFasNPs_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14547ArtFasNPs_"+sGXsfl_43_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tserpa2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV42EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV25CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV26ArtCod))}, new String[] {"Gx_mode","EmprCod","CliCod","ArtCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TSERPA2");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tserpa2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z69ArtDsc", GXutil.rtrim( Z69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nGXsfl_43_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV44TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV44TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV44TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV42EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV25CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD", GXutil.rtrim( AV26ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26ArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTFASPYS", GXutil.ltrim( localUtil.ntoc( A14544ArtFasPyS, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTFASPPP", GXutil.ltrim( localUtil.ntoc( A14545ArtFasPpp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTFASVEL", GXutil.ltrim( localUtil.ntoc( A14546ArtFasVel, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTFASNPS", GXutil.ltrim( localUtil.ntoc( A14547ArtFasNPs, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tserpa2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV42EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV25CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV26ArtCod))}, new String[] {"Gx_mode","EmprCod","CliCod","ArtCod"})  ;
   }

   public String getPgmname( )
   {
      return "TSERPA2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada de Parámetros Fase", "") ;
   }

   public void initializeNonKeyD510( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      Z69ArtDsc = "" ;
   }

   public void initAllD510( )
   {
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      n65ArtCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      initializeNonKeyD510( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyD5476( )
   {
      A759ProDsc = "" ;
      A460FasDsc = "" ;
      A8560ArtFasFac = DecimalUtil.ZERO ;
      A14544ArtFasPyS = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14544ArtFasPyS", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14544ArtFasPyS), 4, 0));
      A14545ArtFasPpp = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14545ArtFasPpp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14545ArtFasPpp), 4, 0));
      A14546ArtFasVel = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14546ArtFasVel", GXutil.ltrimstr( A14546ArtFasVel, 7, 2));
      A14547ArtFasNPs = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14547ArtFasNPs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14547ArtFasNPs), 3, 0));
      Z8560ArtFasFac = DecimalUtil.ZERO ;
      Z14544ArtFasPyS = (short)(0) ;
      Z14545ArtFasPpp = (short)(0) ;
      Z14546ArtFasVel = DecimalUtil.ZERO ;
      Z14547ArtFasNPs = (short)(0) ;
   }

   public void initAllD5476( )
   {
      A758ProCod = "" ;
      A457FasCod = "" ;
      initializeNonKeyD5476( ) ;
   }

   public void standaloneModalInsertD5476( )
   {
   }

   public void initializeNonKeyD5477( )
   {
      AV33Modif = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Modif", AV33Modif);
      AV40Msg_err = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Msg_err", AV40Msg_err);
      AV39Flagr = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Flagr", GXutil.str( AV39Flagr, 1, 0));
      A1665ParFasDsc = "" ;
      n1665ParFasDsc = false ;
      A1668ParFasVal = "" ;
      A1673ParFasObs = "" ;
      A10584ParNVar = (short)(0) ;
      n10584ParNVar = false ;
      A10585ParTit = "" ;
      n10585ParTit = false ;
      A12670ParFasVl2 = "" ;
      A13203ParUndID = (short)(0) ;
      n13203ParUndID = false ;
      A13204ParUndDsc = "" ;
      n13204ParUndDsc = false ;
      A13220ParOrden = (short)(0) ;
      A14061ParFasVmn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14061ParFasVmn", A14061ParFasVmn);
      A14060ParFasVmx = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14060ParFasVmx", A14060ParFasVmx);
      O1673ParFasObs = A1673ParFasObs ;
      O1668ParFasVal = A1668ParFasVal ;
      Z1668ParFasVal = "" ;
      Z1673ParFasObs = "" ;
      Z12670ParFasVl2 = "" ;
      Z13220ParOrden = (short)(0) ;
      Z14061ParFasVmn = "" ;
      Z14060ParFasVmx = "" ;
   }

   public void initAllD5477( )
   {
      A1664ParFasCod = (short)(0) ;
      initializeNonKeyD5477( ) ;
   }

   public void standaloneModalInsertD5477( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116651", true, true);
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
      httpContext.AddJavascriptSource("tserpa2.js", "?202682116652", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties476( )
   {
      edtFasCod_Enabled = defedtFasCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtProCod_Enabled = defedtProCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), !bGXsfl_43_Refreshing);
   }

   public void init_level_properties477( )
   {
      edtParFasCod_Enabled = defedtParFasCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_78_Refreshing);
   }

   public void startgridcontrol43( )
   {
      Freestylelevel_level1Container.AddObjectProperty("GridName", "Freestylelevel_level1");
      Freestylelevel_level1Container.AddObjectProperty("Header", subFreestylelevel_level1_Header);
      Freestylelevel_level1Container.AddObjectProperty("DeleteMethod", "none");
      Freestylelevel_level1Container.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
      Freestylelevel_level1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Freestylelevel_level1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subFreestylelevel_level1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddObjectProperty("CmpContext", "");
      Freestylelevel_level1Container.AddObjectProperty("InMasterPage", "false");
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A759ProDsc));
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8560ArtFasFac, (byte)(6), (byte)(2), ".", "")));
      Freestylelevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtArtFasFac_Enabled, (byte)(5), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Freestylelevel_level1Container.AddColumnProperties(Freestylelevel_level1Column);
      Freestylelevel_level1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subFreestylelevel_level1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subFreestylelevel_level1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subFreestylelevel_level1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subFreestylelevel_level1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subFreestylelevel_level1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subFreestylelevel_level1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Freestylelevel_level1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subFreestylelevel_level1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol78( )
   {
      Gridlevel_level2Container.AddObjectProperty("GridName", "Gridlevel_level2");
      Gridlevel_level2Container.AddObjectProperty("Header", subGridlevel_level2_Header);
      Gridlevel_level2Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_level2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("CmpContext", "");
      Gridlevel_level2Container.AddObjectProperty("InMasterPage", "false");
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.rtrim( A1665ParFasDsc));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.rtrim( A1668ParFasVal));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.rtrim( A1673ParFasObs));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10584ParNVar, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParNVar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.rtrim( A10585ParTit));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParTit_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.rtrim( A12670ParFasVl2));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasVl2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13203ParUndID, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndID_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.rtrim( A13204ParUndDsc));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13220ParOrden, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParOrden_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddColumnProperties(Gridlevel_level2Column);
      Gridlevel_level2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_level2_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtArtCod_Internalname = "ARTCOD" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtArtFasFac_Internalname = "ARTFASFAC" ;
      edtParFasCod_Internalname = "PARFASCOD" ;
      edtParFasDsc_Internalname = "PARFASDSC" ;
      edtParFasVal_Internalname = "PARFASVAL" ;
      edtParFasObs_Internalname = "PARFASOBS" ;
      edtParNVar_Internalname = "PARNVAR" ;
      edtParTit_Internalname = "PARTIT" ;
      edtParFasVl2_Internalname = "PARFASVL2" ;
      edtParUndID_Internalname = "PARUNDID" ;
      edtParUndDsc_Internalname = "PARUNDDSC" ;
      edtParOrden_Internalname = "PARORDEN" ;
      divTableleaflevel_level2_Internalname = "TABLELEAFLEVEL_LEVEL2" ;
      divTableintermediateinslevel_level1_Internalname = "TABLEINTERMEDIATEINSLEVEL_LEVEL1" ;
      tblUnnamedtablefsfreestylelevel_level1_Internalname = "UNNAMEDTABLEFSFREESTYLELEVEL_LEVEL1" ;
      divTableintermediatelevel_level1_Internalname = "TABLEINTERMEDIATELEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_level2_Internalname = "GRIDLEVEL_LEVEL2" ;
      subFreestylelevel_level1_Internalname = "FREESTYLELEVEL_LEVEL1" ;
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
      subGridlevel_level2_Allowcollapsing = (byte)(0) ;
      subGridlevel_level2_Allowselection = (byte)(0) ;
      subGridlevel_level2_Header = "" ;
      subFreestylelevel_level1_Allowcollapsing = (byte)(0) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Entrada de Parámetros Fase", "") );
      edtParOrden_Jsonclick = "" ;
      edtParUndDsc_Jsonclick = "" ;
      edtParUndID_Jsonclick = "" ;
      edtParFasVl2_Jsonclick = "" ;
      edtParTit_Jsonclick = "" ;
      edtParNVar_Jsonclick = "" ;
      edtParFasObs_Jsonclick = "" ;
      edtParFasVal_Jsonclick = "" ;
      edtParFasDsc_Jsonclick = "" ;
      edtParFasCod_Jsonclick = "" ;
      subGridlevel_level2_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level2_Backcolorstyle = (byte)(0) ;
      edtArtFasFac_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtProDsc_Jsonclick = "" ;
      edtProCod_Jsonclick = "" ;
      subFreestylelevel_level1_Class = "FreeStyleGrid" ;
      subFreestylelevel_level1_Backcolorstyle = (byte)(0) ;
      edtParOrden_Enabled = 1 ;
      edtParUndDsc_Enabled = 0 ;
      edtParUndID_Enabled = 0 ;
      edtParFasVl2_Enabled = 1 ;
      edtParTit_Enabled = 0 ;
      edtParNVar_Enabled = 0 ;
      edtParFasObs_Enabled = 1 ;
      edtParFasVal_Enabled = 1 ;
      edtParFasDsc_Enabled = 0 ;
      edtParFasCod_Enabled = 1 ;
      edtArtFasFac_Enabled = 1 ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Enabled = 1 ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
      edtEmprCod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Enabled = 1 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
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

   public void xc_13_D5477( String A396EmprCod ,
                            int A252CliCod ,
                            String A65ArtCod ,
                            String A758ProCod ,
                            String A457FasCod ,
                            short A1664ParFasCod ,
                            short A10584ParNVar ,
                            byte AV39Flagr ,
                            String AV40Msg_err )
   {
      if ( true /* After */ && ( A1664ParFasCod > 0 ) && ( A10584ParNVar > 0 ) )
      {
         GXv_char11[0] = A396EmprCod ;
         GXv_int6[0] = A252CliCod ;
         GXv_char7[0] = A65ArtCod ;
         GXv_char4[0] = A758ProCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_int9[0] = A1664ParFasCod ;
         GXv_int8[0] = A10584ParNVar ;
         GXv_int10[0] = AV39Flagr ;
         GXv_char2[0] = AV40Msg_err ;
         new app.pserpar3(remoteHandle, context).execute( GXv_char11, GXv_int6, GXv_char7, GXv_char4, GXv_char3, GXv_int9, GXv_int8, GXv_int10, GXv_char2) ;
         A396EmprCod = GXv_char11[0] ;
         A252CliCod = GXv_int6[0] ;
         A65ArtCod = GXv_char7[0] ;
         A758ProCod = GXv_char4[0] ;
         A457FasCod = GXv_char3[0] ;
         A1664ParFasCod = GXv_int9[0] ;
         A10584ParNVar = GXv_int8[0] ;
         AV39Flagr = GXv_int10[0] ;
         AV40Msg_err = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV39Flagr", GXutil.str( AV39Flagr, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV40Msg_err", AV40Msg_err);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A65ArtCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A758ProCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A457FasCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A10584ParNVar, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV39Flagr, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV40Msg_err))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrfreestylelevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_43476( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalD5476( ) ;
         standaloneModalD5476( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowD5476( ) ;
         Freestylelevel_level1Row.AddGrid("Gridlevel_level2", Gridlevel_level2Container);
         nGXsfl_43_idx = (int)(nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_43476( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Freestylelevel_level1Container)) ;
      /* End function gxnrFreestylelevel_level1_newrow */
   }

   public void gxnrgridlevel_level2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_78477( ) ;
      while ( nGXsfl_78_idx <= nRC_GXsfl_78 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalD5476( ) ;
         standaloneModalD5476( ) ;
         standaloneNotModalD5477( ) ;
         standaloneModalD5477( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowD5477( ) ;
         nGXsfl_78_idx = (int)(nGXsfl_78_idx+1) ;
         sGXsfl_78_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_78_idx), 4, 0), (short)(4), "0") + sGXsfl_43_idx ;
         subsflControlProps_78477( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level2Container)) ;
      /* End function gxnrGridlevel_level2_newrow */
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
      n252CliCod = false ;
      /* Using cursor T00D524 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T00D524_A279CliNom[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Procod( )
   {
      n252CliCod = false ;
      n65ArtCod = false ;
      /* Using cursor T00D579 */
      pr_default.execute(77, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(77) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      A759ProDsc = T00D579_A759ProDsc[0] ;
      pr_default.close(77);
      /* Using cursor T00D593 */
      pr_default.execute(91, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, A758ProCod});
      if ( (pr_default.getStatus(91) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTLIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      pr_default.close(91);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
   }

   public void valid_Fascod( )
   {
      n252CliCod = false ;
      /* Using cursor T00D580 */
      pr_default.execute(78, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(78) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T00D580_A460FasDsc[0] ;
      pr_default.close(78);
      /* Using cursor T00D594 */
      pr_default.execute(92, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod});
      if ( (pr_default.getStatus(92) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PREFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      pr_default.close(92);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
   }

   public void valid_Parfascod( )
   {
      n65ArtCod = false ;
      n252CliCod = false ;
      n13203ParUndID = false ;
      n1665ParFasDsc = false ;
      n10584ParNVar = false ;
      n10585ParTit = false ;
      n13204ParUndDsc = false ;
      /* Using cursor T00D590 */
      pr_default.execute(88, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(88) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARFASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
      }
      A1665ParFasDsc = T00D590_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T00D590_n1665ParFasDsc[0] ;
      A10584ParNVar = T00D590_A10584ParNVar[0] ;
      n10584ParNVar = T00D590_n10584ParNVar[0] ;
      A10585ParTit = T00D590_A10585ParTit[0] ;
      n10585ParTit = T00D590_n10585ParTit[0] ;
      A13203ParUndID = T00D590_A13203ParUndID[0] ;
      n13203ParUndID = T00D590_n13203ParUndID[0] ;
      pr_default.close(88);
      /* Using cursor T00D591 */
      pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
      if ( (pr_default.getStatus(89) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13203ParUndID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIDADES PARAMETROS FASES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARUNDID");
            AnyError = (short)(1) ;
         }
      }
      A13204ParUndDsc = T00D591_A13204ParUndDsc[0] ;
      n13204ParUndDsc = T00D591_n13204ParUndDsc[0] ;
      pr_default.close(89);
      if ( true /* After */ && ( A1664ParFasCod > 0 ) && ( A10584ParNVar > 0 ) )
      {
         GXv_char11[0] = A396EmprCod ;
         GXv_int6[0] = A252CliCod ;
         GXv_char7[0] = A65ArtCod ;
         GXv_char4[0] = A758ProCod ;
         GXv_char3[0] = A457FasCod ;
         GXv_int9[0] = A1664ParFasCod ;
         GXv_int8[0] = A10584ParNVar ;
         GXv_int10[0] = AV39Flagr ;
         GXv_char2[0] = AV40Msg_err ;
         new app.pserpar3(remoteHandle, context).execute( GXv_char11, GXv_int6, GXv_char7, GXv_char4, GXv_char3, GXv_int9, GXv_int8, GXv_int10, GXv_char2) ;
         tserpa2_impl.this.A396EmprCod = GXv_char11[0] ;
         A396EmprCod = this.A396EmprCod ;
         tserpa2_impl.this.A252CliCod = GXv_int6[0] ;
         A252CliCod = this.A252CliCod ;
         tserpa2_impl.this.A65ArtCod = GXv_char7[0] ;
         A65ArtCod = this.A65ArtCod ;
         tserpa2_impl.this.A758ProCod = GXv_char4[0] ;
         A758ProCod = this.A758ProCod ;
         tserpa2_impl.this.A457FasCod = GXv_char3[0] ;
         A457FasCod = this.A457FasCod ;
         tserpa2_impl.this.A1664ParFasCod = GXv_int9[0] ;
         A1664ParFasCod = this.A1664ParFasCod ;
         tserpa2_impl.this.A10584ParNVar = GXv_int8[0] ;
         A10584ParNVar = this.A10584ParNVar ;
         tserpa2_impl.this.AV39Flagr = GXv_int10[0] ;
         AV39Flagr = this.AV39Flagr ;
         tserpa2_impl.this.AV40Msg_err = GXv_char2[0] ;
         AV40Msg_err = this.AV40Msg_err ;
      }
      if ( ( AV39Flagr == 1 ) && true /* After */ && ( A1664ParFasCod > 0 ) && ( A10584ParNVar > 0 ) )
      {
         httpContext.GX_msglist.addItem(AV40Msg_err, 1, "PARFASCOD");
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
      httpContext.ajax_rsp_assign_attri("", false, "AV39Flagr", GXutil.ltrim( localUtil.ntoc( AV39Flagr, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV40Msg_err", GXutil.rtrim( AV40Msg_err));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV42EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV25CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV26ArtCod',fld:'vARTCOD',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV44TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV42EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV25CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV26ArtCod',fld:'vARTCOD',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12D52',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV44TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[]");
      setEventMetadata("VALID_ARTCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A460FasDsc',fld:'FASDSC',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Artfasfac',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_PARFASCOD","{handler:'valid_Parfascod',iparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1664ParFasCod',fld:'PARFASCOD',pic:'ZZZ9'},{av:'A13203ParUndID',fld:'PARUNDID',pic:'ZZZ9'},{av:'A1665ParFasDsc',fld:'PARFASDSC',pic:''},{av:'A10584ParNVar',fld:'PARNVAR',pic:'ZZZ9'},{av:'A10585ParTit',fld:'PARTIT',pic:''},{av:'A13204ParUndDsc',fld:'PARUNDDSC',pic:''},{av:'AV40Msg_err',fld:'vMSG_ERR',pic:''},{av:'AV39Flagr',fld:'vFLAGR',pic:'9'}]");
      setEventMetadata("VALID_PARFASCOD",",oparms:[{av:'A1665ParFasDsc',fld:'PARFASDSC',pic:''},{av:'A10585ParTit',fld:'PARTIT',pic:''},{av:'A13203ParUndID',fld:'PARUNDID',pic:'ZZZ9'},{av:'A13204ParUndDsc',fld:'PARUNDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A1664ParFasCod',fld:'PARFASCOD',pic:'ZZZ9'},{av:'A10584ParNVar',fld:'PARNVAR',pic:'ZZZ9'},{av:'AV39Flagr',fld:'vFLAGR',pic:'9'},{av:'AV40Msg_err',fld:'vMSG_ERR',pic:''}]}");
      setEventMetadata("VALID_PARFASVAL","{handler:'valid_Parfasval',iparms:[]");
      setEventMetadata("VALID_PARFASVAL",",oparms:[]}");
      setEventMetadata("VALID_PARFASOBS","{handler:'valid_Parfasobs',iparms:[]");
      setEventMetadata("VALID_PARFASOBS",",oparms:[]}");
      setEventMetadata("VALID_PARUNDID","{handler:'valid_Parundid',iparms:[]");
      setEventMetadata("VALID_PARUNDID",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Parorden',iparms:[]");
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
      pr_default.close(88);
      pr_default.close(89);
      pr_default.close(91);
      pr_default.close(78);
      pr_default.close(92);
      pr_default.close(77);
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV42EmprCod = "" ;
      wcpOAV26ArtCod = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z69ArtDsc = "" ;
      Z758ProCod = "" ;
      Z457FasCod = "" ;
      Z8560ArtFasFac = DecimalUtil.ZERO ;
      Z14546ArtFasVel = DecimalUtil.ZERO ;
      Z1668ParFasVal = "" ;
      Z1673ParFasObs = "" ;
      Z12670ParFasVl2 = "" ;
      Z14061ParFasVmn = "" ;
      Z14060ParFasVmx = "" ;
      O1673ParFasObs = "" ;
      O1668ParFasVal = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      AV40Msg_err = "" ;
      Gx_mode = "" ;
      AV42EmprCod = "" ;
      AV26ArtCod = "" ;
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
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV46Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A407EmprNom = "" ;
      Freestylelevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode476 = "" ;
      sStyleString = "" ;
      A14546ArtFasVel = DecimalUtil.ZERO ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode10 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A1665ParFasDsc = "" ;
      A1668ParFasVal = "" ;
      A1673ParFasObs = "" ;
      A10585ParTit = "" ;
      A12670ParFasVl2 = "" ;
      A13204ParUndDsc = "" ;
      T1673ParFasObs = "" ;
      T1668ParFasVal = "" ;
      A759ProDsc = "" ;
      A460FasDsc = "" ;
      A8560ArtFasFac = DecimalUtil.ZERO ;
      AV22Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_char1 = "" ;
      AV43WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV44TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV45WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T00D514_A407EmprNom = new String[] {""} ;
      T00D514_n407EmprNom = new boolean[] {false} ;
      T00D515_A279CliNom = new String[] {""} ;
      T00D516_A65ArtCod = new String[] {""} ;
      T00D516_n65ArtCod = new boolean[] {false} ;
      T00D516_A407EmprNom = new String[] {""} ;
      T00D516_n407EmprNom = new boolean[] {false} ;
      T00D516_A279CliNom = new String[] {""} ;
      T00D516_A69ArtDsc = new String[] {""} ;
      T00D516_n69ArtDsc = new boolean[] {false} ;
      T00D516_A396EmprCod = new String[] {""} ;
      T00D516_A252CliCod = new int[1] ;
      T00D516_n252CliCod = new boolean[] {false} ;
      T00D517_A279CliNom = new String[] {""} ;
      T00D518_A396EmprCod = new String[] {""} ;
      T00D518_A252CliCod = new int[1] ;
      T00D518_n252CliCod = new boolean[] {false} ;
      T00D518_A65ArtCod = new String[] {""} ;
      T00D518_n65ArtCod = new boolean[] {false} ;
      T00D513_A65ArtCod = new String[] {""} ;
      T00D513_n65ArtCod = new boolean[] {false} ;
      T00D513_A69ArtDsc = new String[] {""} ;
      T00D513_n69ArtDsc = new boolean[] {false} ;
      T00D513_A396EmprCod = new String[] {""} ;
      T00D513_A252CliCod = new int[1] ;
      T00D513_n252CliCod = new boolean[] {false} ;
      T00D519_A396EmprCod = new String[] {""} ;
      T00D519_A252CliCod = new int[1] ;
      T00D519_n252CliCod = new boolean[] {false} ;
      T00D519_A65ArtCod = new String[] {""} ;
      T00D519_n65ArtCod = new boolean[] {false} ;
      T00D520_A396EmprCod = new String[] {""} ;
      T00D520_A252CliCod = new int[1] ;
      T00D520_n252CliCod = new boolean[] {false} ;
      T00D520_A65ArtCod = new String[] {""} ;
      T00D520_n65ArtCod = new boolean[] {false} ;
      T00D512_A65ArtCod = new String[] {""} ;
      T00D512_n65ArtCod = new boolean[] {false} ;
      T00D512_A69ArtDsc = new String[] {""} ;
      T00D512_n69ArtDsc = new boolean[] {false} ;
      T00D512_A396EmprCod = new String[] {""} ;
      T00D512_A252CliCod = new int[1] ;
      T00D512_n252CliCod = new boolean[] {false} ;
      T00D524_A279CliNom = new String[] {""} ;
      T00D525_A396EmprCod = new String[] {""} ;
      T00D525_A252CliCod = new int[1] ;
      T00D525_n252CliCod = new boolean[] {false} ;
      T00D525_A65ArtCod = new String[] {""} ;
      T00D525_n65ArtCod = new boolean[] {false} ;
      T00D525_A499GrpFamCod = new byte[1] ;
      T00D526_A396EmprCod = new String[] {""} ;
      T00D526_A252CliCod = new int[1] ;
      T00D526_n252CliCod = new boolean[] {false} ;
      T00D526_A12814ARTConID = new String[] {""} ;
      T00D526_A65ArtCod = new String[] {""} ;
      T00D526_n65ArtCod = new boolean[] {false} ;
      T00D527_A396EmprCod = new String[] {""} ;
      T00D527_A252CliCod = new int[1] ;
      T00D527_n252CliCod = new boolean[] {false} ;
      T00D527_A65ArtCod = new String[] {""} ;
      T00D527_n65ArtCod = new boolean[] {false} ;
      T00D527_A12363SocInt = new byte[1] ;
      T00D528_A396EmprCod = new String[] {""} ;
      T00D528_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T00D528_A5728JBCLLin = new short[1] ;
      T00D529_A396EmprCod = new String[] {""} ;
      T00D529_A252CliCod = new int[1] ;
      T00D529_n252CliCod = new boolean[] {false} ;
      T00D529_A5809MMezCod = new String[] {""} ;
      T00D529_A65ArtCod = new String[] {""} ;
      T00D529_n65ArtCod = new boolean[] {false} ;
      T00D530_A396EmprCod = new String[] {""} ;
      T00D530_A252CliCod = new int[1] ;
      T00D530_n252CliCod = new boolean[] {false} ;
      T00D530_A5234MezCod = new String[] {""} ;
      T00D530_A5240MezLin = new byte[1] ;
      T00D531_A396EmprCod = new String[] {""} ;
      T00D531_A252CliCod = new int[1] ;
      T00D531_n252CliCod = new boolean[] {false} ;
      T00D531_A65ArtCod = new String[] {""} ;
      T00D531_n65ArtCod = new boolean[] {false} ;
      T00D531_A4116estreclim = new int[1] ;
      T00D532_A396EmprCod = new String[] {""} ;
      T00D532_A252CliCod = new int[1] ;
      T00D532_n252CliCod = new boolean[] {false} ;
      T00D532_A65ArtCod = new String[] {""} ;
      T00D532_n65ArtCod = new boolean[] {false} ;
      T00D532_A4061EstNomCol = new String[] {""} ;
      T00D533_A396EmprCod = new String[] {""} ;
      T00D533_A9705ErpNped = new String[] {""} ;
      T00D533_A8652ErpLin = new short[1] ;
      T00D534_A396EmprCod = new String[] {""} ;
      T00D534_A252CliCod = new int[1] ;
      T00D534_n252CliCod = new boolean[] {false} ;
      T00D534_A65ArtCod = new String[] {""} ;
      T00D534_n65ArtCod = new boolean[] {false} ;
      T00D534_A7266CAAqP = new String[] {""} ;
      T00D535_A396EmprCod = new String[] {""} ;
      T00D535_A252CliCod = new int[1] ;
      T00D535_n252CliCod = new boolean[] {false} ;
      T00D535_A65ArtCod = new String[] {""} ;
      T00D535_n65ArtCod = new boolean[] {false} ;
      T00D535_A11084H_DiaA = new java.util.Date[] {GXutil.nullDate()} ;
      T00D536_A396EmprCod = new String[] {""} ;
      T00D536_A252CliCod = new int[1] ;
      T00D536_n252CliCod = new boolean[] {false} ;
      T00D536_A65ArtCod = new String[] {""} ;
      T00D536_n65ArtCod = new boolean[] {false} ;
      T00D536_A10972Int_cod = new byte[1] ;
      T00D537_A396EmprCod = new String[] {""} ;
      T00D537_A252CliCod = new int[1] ;
      T00D537_n252CliCod = new boolean[] {false} ;
      T00D537_A65ArtCod = new String[] {""} ;
      T00D537_n65ArtCod = new boolean[] {false} ;
      T00D537_A10577Pg_Procod = new String[] {""} ;
      T00D538_A396EmprCod = new String[] {""} ;
      T00D538_A252CliCod = new int[1] ;
      T00D538_n252CliCod = new boolean[] {false} ;
      T00D538_A65ArtCod = new String[] {""} ;
      T00D538_n65ArtCod = new boolean[] {false} ;
      T00D538_A10272Hz_cod = new String[] {""} ;
      T00D539_A396EmprCod = new String[] {""} ;
      T00D539_A252CliCod = new int[1] ;
      T00D539_n252CliCod = new boolean[] {false} ;
      T00D539_A65ArtCod = new String[] {""} ;
      T00D539_n65ArtCod = new boolean[] {false} ;
      T00D539_A10041ArtSH = new String[] {""} ;
      T00D540_A396EmprCod = new String[] {""} ;
      T00D540_A252CliCod = new int[1] ;
      T00D540_n252CliCod = new boolean[] {false} ;
      T00D540_A65ArtCod = new String[] {""} ;
      T00D540_n65ArtCod = new boolean[] {false} ;
      T00D540_A8427TipoCt = new String[] {""} ;
      T00D540_A8428CapMxMq = new int[1] ;
      T00D541_A396EmprCod = new String[] {""} ;
      T00D541_A252CliCod = new int[1] ;
      T00D541_n252CliCod = new boolean[] {false} ;
      T00D541_A65ArtCod = new String[] {""} ;
      T00D541_n65ArtCod = new boolean[] {false} ;
      T00D541_A8342CodPred = new short[1] ;
      T00D542_A396EmprCod = new String[] {""} ;
      T00D542_A252CliCod = new int[1] ;
      T00D542_n252CliCod = new boolean[] {false} ;
      T00D542_A65ArtCod = new String[] {""} ;
      T00D542_n65ArtCod = new boolean[] {false} ;
      T00D542_A8089ArtcodTj = new String[] {""} ;
      T00D543_A396EmprCod = new String[] {""} ;
      T00D543_A252CliCod = new int[1] ;
      T00D543_n252CliCod = new boolean[] {false} ;
      T00D543_A65ArtCod = new String[] {""} ;
      T00D543_n65ArtCod = new boolean[] {false} ;
      T00D543_A7956Mq_CodM = new String[] {""} ;
      T00D544_A396EmprCod = new String[] {""} ;
      T00D544_A252CliCod = new int[1] ;
      T00D544_n252CliCod = new boolean[] {false} ;
      T00D544_A65ArtCod = new String[] {""} ;
      T00D544_n65ArtCod = new boolean[] {false} ;
      T00D544_A7949Par_Art = new short[1] ;
      T00D545_A396EmprCod = new String[] {""} ;
      T00D545_A252CliCod = new int[1] ;
      T00D545_n252CliCod = new boolean[] {false} ;
      T00D545_A65ArtCod = new String[] {""} ;
      T00D545_n65ArtCod = new boolean[] {false} ;
      T00D545_A7135Lin_fast = new short[1] ;
      T00D546_A396EmprCod = new String[] {""} ;
      T00D546_A252CliCod = new int[1] ;
      T00D546_n252CliCod = new boolean[] {false} ;
      T00D546_A65ArtCod = new String[] {""} ;
      T00D546_n65ArtCod = new boolean[] {false} ;
      T00D546_A6954Mat_lin = new short[1] ;
      T00D547_A396EmprCod = new String[] {""} ;
      T00D547_A602MaqCod = new String[] {""} ;
      T00D547_A6078MaqCliCod = new int[1] ;
      T00D547_A6079MaqArtCod = new String[] {""} ;
      T00D548_A396EmprCod = new String[] {""} ;
      T00D548_A252CliCod = new int[1] ;
      T00D548_n252CliCod = new boolean[] {false} ;
      T00D548_A65ArtCod = new String[] {""} ;
      T00D548_n65ArtCod = new boolean[] {false} ;
      T00D548_A5382EstCatAny = new short[1] ;
      T00D548_A5383EstCatSer = new String[] {""} ;
      T00D548_A5384EstCatTip = new short[1] ;
      T00D549_A396EmprCod = new String[] {""} ;
      T00D549_A252CliCod = new int[1] ;
      T00D549_n252CliCod = new boolean[] {false} ;
      T00D549_A65ArtCod = new String[] {""} ;
      T00D549_n65ArtCod = new boolean[] {false} ;
      T00D549_A4658MdlCod = new String[] {""} ;
      T00D550_A396EmprCod = new String[] {""} ;
      T00D550_A252CliCod = new int[1] ;
      T00D550_n252CliCod = new boolean[] {false} ;
      T00D550_A4175WebEmpCod = new String[] {""} ;
      T00D551_A396EmprCod = new String[] {""} ;
      T00D551_A252CliCod = new int[1] ;
      T00D551_n252CliCod = new boolean[] {false} ;
      T00D551_A4079WEBDISCOD = new String[] {""} ;
      T00D552_A396EmprCod = new String[] {""} ;
      T00D552_A252CliCod = new int[1] ;
      T00D552_n252CliCod = new boolean[] {false} ;
      T00D552_A65ArtCod = new String[] {""} ;
      T00D552_n65ArtCod = new boolean[] {false} ;
      T00D552_A4058CCFColNom = new String[] {""} ;
      T00D552_A4059CCFColNum = new int[1] ;
      T00D553_A396EmprCod = new String[] {""} ;
      T00D553_A252CliCod = new int[1] ;
      T00D553_n252CliCod = new boolean[] {false} ;
      T00D553_A65ArtCod = new String[] {""} ;
      T00D553_n65ArtCod = new boolean[] {false} ;
      T00D553_A1177Dibujo = new String[] {""} ;
      T00D553_A1790DibIntCod = new int[1] ;
      T00D554_A396EmprCod = new String[] {""} ;
      T00D554_A252CliCod = new int[1] ;
      T00D554_n252CliCod = new boolean[] {false} ;
      T00D554_A65ArtCod = new String[] {""} ;
      T00D554_n65ArtCod = new boolean[] {false} ;
      T00D554_A1080LinPre = new byte[1] ;
      T00D555_A396EmprCod = new String[] {""} ;
      T00D555_A3814PePCod = new long[1] ;
      T00D556_A396EmprCod = new String[] {""} ;
      T00D556_A3413OpeManCod = new byte[1] ;
      T00D556_A3430PreManNMt = new String[] {""} ;
      T00D556_A252CliCod = new int[1] ;
      T00D556_n252CliCod = new boolean[] {false} ;
      T00D556_A65ArtCod = new String[] {""} ;
      T00D556_n65ArtCod = new boolean[] {false} ;
      T00D557_A396EmprCod = new String[] {""} ;
      T00D557_A3415ParManNum = new int[1] ;
      T00D558_A396EmprCod = new String[] {""} ;
      T00D558_A3331LanBroCod = new byte[1] ;
      T00D558_A3333LanBroLin = new short[1] ;
      T00D559_A396EmprCod = new String[] {""} ;
      T00D559_A252CliCod = new int[1] ;
      T00D559_n252CliCod = new boolean[] {false} ;
      T00D559_A65ArtCod = new String[] {""} ;
      T00D559_n65ArtCod = new boolean[] {false} ;
      T00D559_A3319ArtCapKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00D560_A396EmprCod = new String[] {""} ;
      T00D560_A252CliCod = new int[1] ;
      T00D560_n252CliCod = new boolean[] {false} ;
      T00D560_A65ArtCod = new String[] {""} ;
      T00D560_n65ArtCod = new boolean[] {false} ;
      T00D560_A3288CCalCod = new String[] {""} ;
      T00D561_A396EmprCod = new String[] {""} ;
      T00D561_A252CliCod = new int[1] ;
      T00D561_n252CliCod = new boolean[] {false} ;
      T00D561_A65ArtCod = new String[] {""} ;
      T00D561_n65ArtCod = new boolean[] {false} ;
      T00D561_A3033CCCod = new String[] {""} ;
      T00D562_A396EmprCod = new String[] {""} ;
      T00D562_A252CliCod = new int[1] ;
      T00D562_n252CliCod = new boolean[] {false} ;
      T00D562_A65ArtCod = new String[] {""} ;
      T00D562_n65ArtCod = new boolean[] {false} ;
      T00D562_A2937RecIntCod = new byte[1] ;
      T00D563_A396EmprCod = new String[] {""} ;
      T00D563_A252CliCod = new int[1] ;
      T00D563_n252CliCod = new boolean[] {false} ;
      T00D563_A65ArtCod = new String[] {""} ;
      T00D563_n65ArtCod = new boolean[] {false} ;
      T00D563_A2931Limite2 = new short[1] ;
      T00D564_A396EmprCod = new String[] {""} ;
      T00D564_A252CliCod = new int[1] ;
      T00D564_n252CliCod = new boolean[] {false} ;
      T00D564_A65ArtCod = new String[] {""} ;
      T00D564_n65ArtCod = new boolean[] {false} ;
      T00D564_A71ArtEstAny = new short[1] ;
      T00D564_A2756ArtEstSer = new String[] {""} ;
      T00D565_A396EmprCod = new String[] {""} ;
      T00D565_A252CliCod = new int[1] ;
      T00D565_n252CliCod = new boolean[] {false} ;
      T00D565_A1504CliProCod = new String[] {""} ;
      T00D565_A65ArtCod = new String[] {""} ;
      T00D565_n65ArtCod = new boolean[] {false} ;
      T00D566_A396EmprCod = new String[] {""} ;
      T00D566_A252CliCod = new int[1] ;
      T00D566_n252CliCod = new boolean[] {false} ;
      T00D566_A65ArtCod = new String[] {""} ;
      T00D566_n65ArtCod = new boolean[] {false} ;
      T00D566_A598LinRec = new byte[1] ;
      T00D567_A396EmprCod = new String[] {""} ;
      T00D567_A252CliCod = new int[1] ;
      T00D567_n252CliCod = new boolean[] {false} ;
      T00D567_A65ArtCod = new String[] {""} ;
      T00D567_n65ArtCod = new boolean[] {false} ;
      T00D567_A831TipColCod = new byte[1] ;
      T00D568_A396EmprCod = new String[] {""} ;
      T00D568_A252CliCod = new int[1] ;
      T00D568_n252CliCod = new boolean[] {false} ;
      T00D568_A65ArtCod = new String[] {""} ;
      T00D568_n65ArtCod = new boolean[] {false} ;
      T00D568_A758ProCod = new String[] {""} ;
      T00D569_A396EmprCod = new String[] {""} ;
      T00D569_A252CliCod = new int[1] ;
      T00D569_n252CliCod = new boolean[] {false} ;
      T00D569_A65ArtCod = new String[] {""} ;
      T00D569_n65ArtCod = new boolean[] {false} ;
      Z759ProDsc = "" ;
      Z460FasDsc = "" ;
      T00D570_A759ProDsc = new String[] {""} ;
      T00D570_A460FasDsc = new String[] {""} ;
      T00D570_A8560ArtFasFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00D570_A14544ArtFasPyS = new short[1] ;
      T00D570_A14545ArtFasPpp = new short[1] ;
      T00D570_A14546ArtFasVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00D570_A14547ArtFasNPs = new short[1] ;
      T00D570_A396EmprCod = new String[] {""} ;
      T00D570_A252CliCod = new int[1] ;
      T00D570_n252CliCod = new boolean[] {false} ;
      T00D570_A65ArtCod = new String[] {""} ;
      T00D570_n65ArtCod = new boolean[] {false} ;
      T00D570_A758ProCod = new String[] {""} ;
      T00D570_A457FasCod = new String[] {""} ;
      T00D58_A759ProDsc = new String[] {""} ;
      T00D59_A396EmprCod = new String[] {""} ;
      T00D510_A460FasDsc = new String[] {""} ;
      T00D511_A396EmprCod = new String[] {""} ;
      T00D571_A759ProDsc = new String[] {""} ;
      T00D572_A396EmprCod = new String[] {""} ;
      T00D573_A460FasDsc = new String[] {""} ;
      T00D574_A396EmprCod = new String[] {""} ;
      T00D575_A396EmprCod = new String[] {""} ;
      T00D575_A252CliCod = new int[1] ;
      T00D575_n252CliCod = new boolean[] {false} ;
      T00D575_A65ArtCod = new String[] {""} ;
      T00D575_n65ArtCod = new boolean[] {false} ;
      T00D575_A758ProCod = new String[] {""} ;
      T00D575_A457FasCod = new String[] {""} ;
      T00D57_A8560ArtFasFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00D57_A14544ArtFasPyS = new short[1] ;
      T00D57_A14545ArtFasPpp = new short[1] ;
      T00D57_A14546ArtFasVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00D57_A14547ArtFasNPs = new short[1] ;
      T00D57_A396EmprCod = new String[] {""} ;
      T00D57_A252CliCod = new int[1] ;
      T00D57_n252CliCod = new boolean[] {false} ;
      T00D57_A65ArtCod = new String[] {""} ;
      T00D57_n65ArtCod = new boolean[] {false} ;
      T00D57_A758ProCod = new String[] {""} ;
      T00D57_A457FasCod = new String[] {""} ;
      T00D56_A8560ArtFasFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00D56_A14544ArtFasPyS = new short[1] ;
      T00D56_A14545ArtFasPpp = new short[1] ;
      T00D56_A14546ArtFasVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00D56_A14547ArtFasNPs = new short[1] ;
      T00D56_A396EmprCod = new String[] {""} ;
      T00D56_A252CliCod = new int[1] ;
      T00D56_n252CliCod = new boolean[] {false} ;
      T00D56_A65ArtCod = new String[] {""} ;
      T00D56_n65ArtCod = new boolean[] {false} ;
      T00D56_A758ProCod = new String[] {""} ;
      T00D56_A457FasCod = new String[] {""} ;
      T00D579_A759ProDsc = new String[] {""} ;
      T00D580_A460FasDsc = new String[] {""} ;
      T00D581_A396EmprCod = new String[] {""} ;
      T00D581_A252CliCod = new int[1] ;
      T00D581_n252CliCod = new boolean[] {false} ;
      T00D581_A65ArtCod = new String[] {""} ;
      T00D581_n65ArtCod = new boolean[] {false} ;
      T00D581_A758ProCod = new String[] {""} ;
      T00D581_A457FasCod = new String[] {""} ;
      T00D581_A4897ArtProLin = new short[1] ;
      T00D582_A396EmprCod = new String[] {""} ;
      T00D582_A252CliCod = new int[1] ;
      T00D582_n252CliCod = new boolean[] {false} ;
      T00D582_A65ArtCod = new String[] {""} ;
      T00D582_n65ArtCod = new boolean[] {false} ;
      T00D582_A758ProCod = new String[] {""} ;
      T00D582_A457FasCod = new String[] {""} ;
      A14061ParFasVmn = "" ;
      A14060ParFasVmx = "" ;
      Z1665ParFasDsc = "" ;
      Z10585ParTit = "" ;
      Z13204ParUndDsc = "" ;
      AV33Modif = "" ;
      T00D583_A252CliCod = new int[1] ;
      T00D583_n252CliCod = new boolean[] {false} ;
      T00D583_A65ArtCod = new String[] {""} ;
      T00D583_n65ArtCod = new boolean[] {false} ;
      T00D583_A758ProCod = new String[] {""} ;
      T00D583_A1665ParFasDsc = new String[] {""} ;
      T00D583_n1665ParFasDsc = new boolean[] {false} ;
      T00D583_A1668ParFasVal = new String[] {""} ;
      T00D583_A1673ParFasObs = new String[] {""} ;
      T00D583_A10584ParNVar = new short[1] ;
      T00D583_n10584ParNVar = new boolean[] {false} ;
      T00D583_A10585ParTit = new String[] {""} ;
      T00D583_n10585ParTit = new boolean[] {false} ;
      T00D583_A12670ParFasVl2 = new String[] {""} ;
      T00D583_A13204ParUndDsc = new String[] {""} ;
      T00D583_n13204ParUndDsc = new boolean[] {false} ;
      T00D583_A13220ParOrden = new short[1] ;
      T00D583_A14061ParFasVmn = new String[] {""} ;
      T00D583_A14060ParFasVmx = new String[] {""} ;
      T00D583_A396EmprCod = new String[] {""} ;
      T00D583_A1664ParFasCod = new short[1] ;
      T00D583_A13203ParUndID = new short[1] ;
      T00D583_n13203ParUndID = new boolean[] {false} ;
      T00D583_A457FasCod = new String[] {""} ;
      T00D54_A1665ParFasDsc = new String[] {""} ;
      T00D54_n1665ParFasDsc = new boolean[] {false} ;
      T00D54_A10584ParNVar = new short[1] ;
      T00D54_n10584ParNVar = new boolean[] {false} ;
      T00D54_A10585ParTit = new String[] {""} ;
      T00D54_n10585ParTit = new boolean[] {false} ;
      T00D54_A13203ParUndID = new short[1] ;
      T00D54_n13203ParUndID = new boolean[] {false} ;
      T00D55_A13204ParUndDsc = new String[] {""} ;
      T00D55_n13204ParUndDsc = new boolean[] {false} ;
      T00D584_A1665ParFasDsc = new String[] {""} ;
      T00D584_n1665ParFasDsc = new boolean[] {false} ;
      T00D584_A10584ParNVar = new short[1] ;
      T00D584_n10584ParNVar = new boolean[] {false} ;
      T00D584_A10585ParTit = new String[] {""} ;
      T00D584_n10585ParTit = new boolean[] {false} ;
      T00D584_A13203ParUndID = new short[1] ;
      T00D584_n13203ParUndID = new boolean[] {false} ;
      T00D585_A13204ParUndDsc = new String[] {""} ;
      T00D585_n13204ParUndDsc = new boolean[] {false} ;
      T00D586_A396EmprCod = new String[] {""} ;
      T00D586_A252CliCod = new int[1] ;
      T00D586_n252CliCod = new boolean[] {false} ;
      T00D586_A65ArtCod = new String[] {""} ;
      T00D586_n65ArtCod = new boolean[] {false} ;
      T00D586_A758ProCod = new String[] {""} ;
      T00D586_A457FasCod = new String[] {""} ;
      T00D586_A1664ParFasCod = new short[1] ;
      T00D53_A252CliCod = new int[1] ;
      T00D53_n252CliCod = new boolean[] {false} ;
      T00D53_A65ArtCod = new String[] {""} ;
      T00D53_n65ArtCod = new boolean[] {false} ;
      T00D53_A758ProCod = new String[] {""} ;
      T00D53_A1668ParFasVal = new String[] {""} ;
      T00D53_A1673ParFasObs = new String[] {""} ;
      T00D53_A12670ParFasVl2 = new String[] {""} ;
      T00D53_A13220ParOrden = new short[1] ;
      T00D53_A14061ParFasVmn = new String[] {""} ;
      T00D53_A14060ParFasVmx = new String[] {""} ;
      T00D53_A396EmprCod = new String[] {""} ;
      T00D53_A1664ParFasCod = new short[1] ;
      T00D53_A457FasCod = new String[] {""} ;
      sMode477 = "" ;
      T00D52_A252CliCod = new int[1] ;
      T00D52_n252CliCod = new boolean[] {false} ;
      T00D52_A65ArtCod = new String[] {""} ;
      T00D52_n65ArtCod = new boolean[] {false} ;
      T00D52_A758ProCod = new String[] {""} ;
      T00D52_A1668ParFasVal = new String[] {""} ;
      T00D52_A1673ParFasObs = new String[] {""} ;
      T00D52_A12670ParFasVl2 = new String[] {""} ;
      T00D52_A13220ParOrden = new short[1] ;
      T00D52_A14061ParFasVmn = new String[] {""} ;
      T00D52_A14060ParFasVmx = new String[] {""} ;
      T00D52_A396EmprCod = new String[] {""} ;
      T00D52_A1664ParFasCod = new short[1] ;
      T00D52_A457FasCod = new String[] {""} ;
      T00D590_A1665ParFasDsc = new String[] {""} ;
      T00D590_n1665ParFasDsc = new boolean[] {false} ;
      T00D590_A10584ParNVar = new short[1] ;
      T00D590_n10584ParNVar = new boolean[] {false} ;
      T00D590_A10585ParTit = new String[] {""} ;
      T00D590_n10585ParTit = new boolean[] {false} ;
      T00D590_A13203ParUndID = new short[1] ;
      T00D590_n13203ParUndID = new boolean[] {false} ;
      T00D591_A13204ParUndDsc = new String[] {""} ;
      T00D591_n13204ParUndDsc = new boolean[] {false} ;
      T00D592_A396EmprCod = new String[] {""} ;
      T00D592_A252CliCod = new int[1] ;
      T00D592_n252CliCod = new boolean[] {false} ;
      T00D592_A65ArtCod = new String[] {""} ;
      T00D592_n65ArtCod = new boolean[] {false} ;
      T00D592_A758ProCod = new String[] {""} ;
      T00D592_A457FasCod = new String[] {""} ;
      T00D592_A1664ParFasCod = new short[1] ;
      Freestylelevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subFreestylelevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      Gridlevel_level2Container = new com.genexus.webpanels.GXWebGrid(context);
      Gridlevel_level2Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subFreestylelevel_level1_Header = "" ;
      Freestylelevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      Gridlevel_level2Column = new com.genexus.webpanels.GXWebColumn();
      T00D593_A396EmprCod = new String[] {""} ;
      T00D594_A396EmprCod = new String[] {""} ;
      GXv_char11 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char7 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_int8 = new short[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char2 = new String[1] ;
      ZV40Msg_err = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tserpa2__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tserpa2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tserpa2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tserpa2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tserpa2__default(),
         new Object[] {
             new Object[] {
            T00D52_A252CliCod, T00D52_A65ArtCod, T00D52_A758ProCod, T00D52_A1668ParFasVal, T00D52_A1673ParFasObs, T00D52_A12670ParFasVl2, T00D52_A13220ParOrden, T00D52_A14061ParFasVmn, T00D52_A14060ParFasVmx, T00D52_A396EmprCod,
            T00D52_A1664ParFasCod, T00D52_A457FasCod
            }
            , new Object[] {
            T00D53_A252CliCod, T00D53_A65ArtCod, T00D53_A758ProCod, T00D53_A1668ParFasVal, T00D53_A1673ParFasObs, T00D53_A12670ParFasVl2, T00D53_A13220ParOrden, T00D53_A14061ParFasVmn, T00D53_A14060ParFasVmx, T00D53_A396EmprCod,
            T00D53_A1664ParFasCod, T00D53_A457FasCod
            }
            , new Object[] {
            T00D54_A1665ParFasDsc, T00D54_n1665ParFasDsc, T00D54_A10584ParNVar, T00D54_n10584ParNVar, T00D54_A10585ParTit, T00D54_n10585ParTit, T00D54_A13203ParUndID, T00D54_n13203ParUndID
            }
            , new Object[] {
            T00D55_A13204ParUndDsc, T00D55_n13204ParUndDsc
            }
            , new Object[] {
            T00D56_A8560ArtFasFac, T00D56_A14544ArtFasPyS, T00D56_A14545ArtFasPpp, T00D56_A14546ArtFasVel, T00D56_A14547ArtFasNPs, T00D56_A396EmprCod, T00D56_A252CliCod, T00D56_A65ArtCod, T00D56_A758ProCod, T00D56_A457FasCod
            }
            , new Object[] {
            T00D57_A8560ArtFasFac, T00D57_A14544ArtFasPyS, T00D57_A14545ArtFasPpp, T00D57_A14546ArtFasVel, T00D57_A14547ArtFasNPs, T00D57_A396EmprCod, T00D57_A252CliCod, T00D57_A65ArtCod, T00D57_A758ProCod, T00D57_A457FasCod
            }
            , new Object[] {
            T00D58_A759ProDsc
            }
            , new Object[] {
            T00D59_A396EmprCod
            }
            , new Object[] {
            T00D510_A460FasDsc
            }
            , new Object[] {
            T00D511_A396EmprCod
            }
            , new Object[] {
            T00D512_A65ArtCod, T00D512_A69ArtDsc, T00D512_n69ArtDsc, T00D512_A396EmprCod, T00D512_A252CliCod
            }
            , new Object[] {
            T00D513_A65ArtCod, T00D513_A69ArtDsc, T00D513_n69ArtDsc, T00D513_A396EmprCod, T00D513_A252CliCod
            }
            , new Object[] {
            T00D514_A407EmprNom, T00D514_n407EmprNom
            }
            , new Object[] {
            T00D515_A279CliNom
            }
            , new Object[] {
            T00D516_A65ArtCod, T00D516_A407EmprNom, T00D516_n407EmprNom, T00D516_A279CliNom, T00D516_A69ArtDsc, T00D516_n69ArtDsc, T00D516_A396EmprCod, T00D516_A252CliCod
            }
            , new Object[] {
            T00D517_A279CliNom
            }
            , new Object[] {
            T00D518_A396EmprCod, T00D518_A252CliCod, T00D518_A65ArtCod
            }
            , new Object[] {
            T00D519_A396EmprCod, T00D519_A252CliCod, T00D519_A65ArtCod
            }
            , new Object[] {
            T00D520_A396EmprCod, T00D520_A252CliCod, T00D520_A65ArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00D524_A279CliNom
            }
            , new Object[] {
            T00D525_A396EmprCod, T00D525_A252CliCod, T00D525_A65ArtCod, T00D525_A499GrpFamCod
            }
            , new Object[] {
            T00D526_A396EmprCod, T00D526_A252CliCod, T00D526_A12814ARTConID, T00D526_A65ArtCod
            }
            , new Object[] {
            T00D527_A396EmprCod, T00D527_A252CliCod, T00D527_A65ArtCod, T00D527_A12363SocInt
            }
            , new Object[] {
            T00D528_A396EmprCod, T00D528_A4929Inc_Dia, T00D528_A5728JBCLLin
            }
            , new Object[] {
            T00D529_A396EmprCod, T00D529_A252CliCod, T00D529_A5809MMezCod, T00D529_A65ArtCod
            }
            , new Object[] {
            T00D530_A396EmprCod, T00D530_A252CliCod, T00D530_A5234MezCod, T00D530_A5240MezLin
            }
            , new Object[] {
            T00D531_A396EmprCod, T00D531_A252CliCod, T00D531_A65ArtCod, T00D531_A4116estreclim
            }
            , new Object[] {
            T00D532_A396EmprCod, T00D532_A252CliCod, T00D532_A65ArtCod, T00D532_A4061EstNomCol
            }
            , new Object[] {
            T00D533_A396EmprCod, T00D533_A9705ErpNped, T00D533_A8652ErpLin
            }
            , new Object[] {
            T00D534_A396EmprCod, T00D534_A252CliCod, T00D534_A65ArtCod, T00D534_A7266CAAqP
            }
            , new Object[] {
            T00D535_A396EmprCod, T00D535_A252CliCod, T00D535_A65ArtCod, T00D535_A11084H_DiaA
            }
            , new Object[] {
            T00D536_A396EmprCod, T00D536_A252CliCod, T00D536_A65ArtCod, T00D536_A10972Int_cod
            }
            , new Object[] {
            T00D537_A396EmprCod, T00D537_A252CliCod, T00D537_A65ArtCod, T00D537_A10577Pg_Procod
            }
            , new Object[] {
            T00D538_A396EmprCod, T00D538_A252CliCod, T00D538_A65ArtCod, T00D538_A10272Hz_cod
            }
            , new Object[] {
            T00D539_A396EmprCod, T00D539_A252CliCod, T00D539_A65ArtCod, T00D539_A10041ArtSH
            }
            , new Object[] {
            T00D540_A396EmprCod, T00D540_A252CliCod, T00D540_A65ArtCod, T00D540_A8427TipoCt, T00D540_A8428CapMxMq
            }
            , new Object[] {
            T00D541_A396EmprCod, T00D541_A252CliCod, T00D541_A65ArtCod, T00D541_A8342CodPred
            }
            , new Object[] {
            T00D542_A396EmprCod, T00D542_A252CliCod, T00D542_A65ArtCod, T00D542_A8089ArtcodTj
            }
            , new Object[] {
            T00D543_A396EmprCod, T00D543_A252CliCod, T00D543_A65ArtCod, T00D543_A7956Mq_CodM
            }
            , new Object[] {
            T00D544_A396EmprCod, T00D544_A252CliCod, T00D544_A65ArtCod, T00D544_A7949Par_Art
            }
            , new Object[] {
            T00D545_A396EmprCod, T00D545_A252CliCod, T00D545_A65ArtCod, T00D545_A7135Lin_fast
            }
            , new Object[] {
            T00D546_A396EmprCod, T00D546_A252CliCod, T00D546_A65ArtCod, T00D546_A6954Mat_lin
            }
            , new Object[] {
            T00D547_A396EmprCod, T00D547_A602MaqCod, T00D547_A6078MaqCliCod, T00D547_A6079MaqArtCod
            }
            , new Object[] {
            T00D548_A396EmprCod, T00D548_A252CliCod, T00D548_A65ArtCod, T00D548_A5382EstCatAny, T00D548_A5383EstCatSer, T00D548_A5384EstCatTip
            }
            , new Object[] {
            T00D549_A396EmprCod, T00D549_A252CliCod, T00D549_A65ArtCod, T00D549_A4658MdlCod
            }
            , new Object[] {
            T00D550_A396EmprCod, T00D550_A252CliCod, T00D550_A4175WebEmpCod
            }
            , new Object[] {
            T00D551_A396EmprCod, T00D551_A252CliCod, T00D551_A4079WEBDISCOD
            }
            , new Object[] {
            T00D552_A396EmprCod, T00D552_A252CliCod, T00D552_A65ArtCod, T00D552_A4058CCFColNom, T00D552_A4059CCFColNum
            }
            , new Object[] {
            T00D553_A396EmprCod, T00D553_A252CliCod, T00D553_A65ArtCod, T00D553_A1177Dibujo, T00D553_A1790DibIntCod
            }
            , new Object[] {
            T00D554_A396EmprCod, T00D554_A252CliCod, T00D554_A65ArtCod, T00D554_A1080LinPre
            }
            , new Object[] {
            T00D555_A396EmprCod, T00D555_A3814PePCod
            }
            , new Object[] {
            T00D556_A396EmprCod, T00D556_A3413OpeManCod, T00D556_A3430PreManNMt, T00D556_A252CliCod, T00D556_A65ArtCod
            }
            , new Object[] {
            T00D557_A396EmprCod, T00D557_A3415ParManNum
            }
            , new Object[] {
            T00D558_A396EmprCod, T00D558_A3331LanBroCod, T00D558_A3333LanBroLin
            }
            , new Object[] {
            T00D559_A396EmprCod, T00D559_A252CliCod, T00D559_A65ArtCod, T00D559_A3319ArtCapKgs
            }
            , new Object[] {
            T00D560_A396EmprCod, T00D560_A252CliCod, T00D560_A65ArtCod, T00D560_A3288CCalCod
            }
            , new Object[] {
            T00D561_A396EmprCod, T00D561_A252CliCod, T00D561_A65ArtCod, T00D561_A3033CCCod
            }
            , new Object[] {
            T00D562_A396EmprCod, T00D562_A252CliCod, T00D562_A65ArtCod, T00D562_A2937RecIntCod
            }
            , new Object[] {
            T00D563_A396EmprCod, T00D563_A252CliCod, T00D563_A65ArtCod, T00D563_A2931Limite2
            }
            , new Object[] {
            T00D564_A396EmprCod, T00D564_A252CliCod, T00D564_A65ArtCod, T00D564_A71ArtEstAny, T00D564_A2756ArtEstSer
            }
            , new Object[] {
            T00D565_A396EmprCod, T00D565_A252CliCod, T00D565_A1504CliProCod, T00D565_A65ArtCod
            }
            , new Object[] {
            T00D566_A396EmprCod, T00D566_A252CliCod, T00D566_A65ArtCod, T00D566_A598LinRec
            }
            , new Object[] {
            T00D567_A396EmprCod, T00D567_A252CliCod, T00D567_A65ArtCod, T00D567_A831TipColCod
            }
            , new Object[] {
            T00D568_A396EmprCod, T00D568_A252CliCod, T00D568_A65ArtCod, T00D568_A758ProCod
            }
            , new Object[] {
            T00D569_A396EmprCod, T00D569_A252CliCod, T00D569_A65ArtCod
            }
            , new Object[] {
            T00D570_A759ProDsc, T00D570_A460FasDsc, T00D570_A8560ArtFasFac, T00D570_A14544ArtFasPyS, T00D570_A14545ArtFasPpp, T00D570_A14546ArtFasVel, T00D570_A14547ArtFasNPs, T00D570_A396EmprCod, T00D570_A252CliCod, T00D570_A65ArtCod,
            T00D570_A758ProCod, T00D570_A457FasCod
            }
            , new Object[] {
            T00D571_A759ProDsc
            }
            , new Object[] {
            T00D572_A396EmprCod
            }
            , new Object[] {
            T00D573_A460FasDsc
            }
            , new Object[] {
            T00D574_A396EmprCod
            }
            , new Object[] {
            T00D575_A396EmprCod, T00D575_A252CliCod, T00D575_A65ArtCod, T00D575_A758ProCod, T00D575_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00D579_A759ProDsc
            }
            , new Object[] {
            T00D580_A460FasDsc
            }
            , new Object[] {
            T00D581_A396EmprCod, T00D581_A252CliCod, T00D581_A65ArtCod, T00D581_A758ProCod, T00D581_A457FasCod, T00D581_A4897ArtProLin
            }
            , new Object[] {
            T00D582_A396EmprCod, T00D582_A252CliCod, T00D582_A65ArtCod, T00D582_A758ProCod, T00D582_A457FasCod
            }
            , new Object[] {
            T00D583_A252CliCod, T00D583_A65ArtCod, T00D583_A758ProCod, T00D583_A1665ParFasDsc, T00D583_n1665ParFasDsc, T00D583_A1668ParFasVal, T00D583_A1673ParFasObs, T00D583_A10584ParNVar, T00D583_n10584ParNVar, T00D583_A10585ParTit,
            T00D583_n10585ParTit, T00D583_A12670ParFasVl2, T00D583_A13204ParUndDsc, T00D583_n13204ParUndDsc, T00D583_A13220ParOrden, T00D583_A14061ParFasVmn, T00D583_A14060ParFasVmx, T00D583_A396EmprCod, T00D583_A1664ParFasCod, T00D583_A13203ParUndID,
            T00D583_n13203ParUndID, T00D583_A457FasCod
            }
            , new Object[] {
            T00D584_A1665ParFasDsc, T00D584_n1665ParFasDsc, T00D584_A10584ParNVar, T00D584_n10584ParNVar, T00D584_A10585ParTit, T00D584_n10585ParTit, T00D584_A13203ParUndID, T00D584_n13203ParUndID
            }
            , new Object[] {
            T00D585_A13204ParUndDsc, T00D585_n13204ParUndDsc
            }
            , new Object[] {
            T00D586_A396EmprCod, T00D586_A252CliCod, T00D586_A65ArtCod, T00D586_A758ProCod, T00D586_A457FasCod, T00D586_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00D590_A1665ParFasDsc, T00D590_n1665ParFasDsc, T00D590_A10584ParNVar, T00D590_n10584ParNVar, T00D590_A10585ParTit, T00D590_n10585ParTit, T00D590_A13203ParUndID, T00D590_n13203ParUndID
            }
            , new Object[] {
            T00D591_A13204ParUndDsc, T00D591_n13204ParUndDsc
            }
            , new Object[] {
            T00D592_A396EmprCod, T00D592_A252CliCod, T00D592_A65ArtCod, T00D592_A758ProCod, T00D592_A457FasCod, T00D592_A1664ParFasCod
            }
            , new Object[] {
            T00D593_A396EmprCod
            }
            , new Object[] {
            T00D594_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV46Pgmname = "TSERPA2" ;
   }

   private byte GxWebError ;
   private byte AV39Flagr ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subFreestylelevel_level1_Backcolorstyle ;
   private byte subFreestylelevel_level1_Backstyle ;
   private byte subGridlevel_level2_Backcolorstyle ;
   private byte subGridlevel_level2_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subFreestylelevel_level1_Allowselection ;
   private byte subFreestylelevel_level1_Allowhovering ;
   private byte subFreestylelevel_level1_Allowcollapsing ;
   private byte subFreestylelevel_level1_Collapsed ;
   private byte subGridlevel_level2_Allowselection ;
   private byte subGridlevel_level2_Allowhovering ;
   private byte subGridlevel_level2_Allowcollapsing ;
   private byte subGridlevel_level2_Collapsed ;
   private byte GXv_int10[] ;
   private byte ZV39Flagr ;
   private short Z14544ArtFasPyS ;
   private short Z14545ArtFasPpp ;
   private short Z14547ArtFasNPs ;
   private short nRcdDeleted_476 ;
   private short nRcdExists_476 ;
   private short nIsMod_476 ;
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
   private short nBlankRcdCount476 ;
   private short RcdFound476 ;
   private short nBlankRcdUsr476 ;
   private short A14544ArtFasPyS ;
   private short A14545ArtFasPpp ;
   private short A14547ArtFasNPs ;
   private short RcdFound10 ;
   private short RcdFound477 ;
   private short A13220ParOrden ;
   private short T1664ParFasCod ;
   private short nIsDirty_10 ;
   private short nIsDirty_476 ;
   private short Z10584ParNVar ;
   private short Z13203ParUndID ;
   private short nIsDirty_477 ;
   private short nBlankRcdCount477 ;
   private short nBlankRcdUsr477 ;
   private short GXv_int9[] ;
   private short GXv_int8[] ;
   private int wcpOAV25CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_43 ;
   private int nGXsfl_43_idx=1 ;
   private int nRC_GXsfl_78 ;
   private int nGXsfl_78_idx=1 ;
   private int A252CliCod ;
   private int AV25CliCod ;
   private int trnEnded ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtArtCod_Enabled ;
   private int edtArtDsc_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtArtFasFac_Enabled ;
   private int fRowAdded ;
   private int Datamonjs_Gxcontroltype ;
   private int edtParFasCod_Enabled ;
   private int edtParFasDsc_Enabled ;
   private int edtParFasVal_Enabled ;
   private int edtParFasObs_Enabled ;
   private int edtParNVar_Enabled ;
   private int edtParTit_Enabled ;
   private int edtParFasVl2_Enabled ;
   private int edtParUndID_Enabled ;
   private int edtParUndDsc_Enabled ;
   private int edtParOrden_Enabled ;
   private int GX_JID ;
   private int subFreestylelevel_level1_Backcolor ;
   private int subFreestylelevel_level1_Allbackcolor ;
   private int FREESTYLELEVEL_LEVEL1_IsPaging ;
   private int subGridlevel_level2_Backcolor ;
   private int subGridlevel_level2_Allbackcolor ;
   private int defedtParFasCod_Enabled ;
   private int defedtFasCod_Enabled ;
   private int defedtProCod_Enabled ;
   private int idxLst ;
   private int subFreestylelevel_level1_Selectedindex ;
   private int subFreestylelevel_level1_Selectioncolor ;
   private int subFreestylelevel_level1_Hoveringcolor ;
   private int subGridlevel_level2_Selectedindex ;
   private int subGridlevel_level2_Selectioncolor ;
   private int subGridlevel_level2_Hoveringcolor ;
   private int GXv_int6[] ;
   private long FREESTYLELEVEL_LEVEL1_nFirstRecordOnPage ;
   private long GRIDLEVEL_LEVEL2_nFirstRecordOnPage ;
   private long GRIDLEVEL_LEVEL2_nCurrentRecord ;
   private java.math.BigDecimal Z8560ArtFasFac ;
   private java.math.BigDecimal Z14546ArtFasVel ;
   private java.math.BigDecimal A14546ArtFasVel ;
   private java.math.BigDecimal A8560ArtFasFac ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV42EmprCod ;
   private String wcpOAV26ArtCod ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z69ArtDsc ;
   private String Z758ProCod ;
   private String Z457FasCod ;
   private String Z1668ParFasVal ;
   private String Z1673ParFasObs ;
   private String Z12670ParFasVl2 ;
   private String Z14061ParFasVmn ;
   private String Z14060ParFasVmx ;
   private String O1673ParFasObs ;
   private String O1668ParFasVal ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String AV40Msg_err ;
   private String Gx_mode ;
   private String AV42EmprCod ;
   private String AV26ArtCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_78_idx="0001" ;
   private String sGXsfl_43_idx="0001" ;
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
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String divTableintermediatelevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV46Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode476 ;
   private String edtProCod_Internalname ;
   private String edtProDsc_Internalname ;
   private String edtFasCod_Internalname ;
   private String edtFasDsc_Internalname ;
   private String edtArtFasFac_Internalname ;
   private String sStyleString ;
   private String subFreestylelevel_level1_Internalname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode10 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String edtParFasCod_Internalname ;
   private String edtParFasDsc_Internalname ;
   private String A1665ParFasDsc ;
   private String edtParFasVal_Internalname ;
   private String A1668ParFasVal ;
   private String edtParFasObs_Internalname ;
   private String A1673ParFasObs ;
   private String edtParNVar_Internalname ;
   private String edtParTit_Internalname ;
   private String A10585ParTit ;
   private String edtParFasVl2_Internalname ;
   private String A12670ParFasVl2 ;
   private String edtParUndID_Internalname ;
   private String edtParUndDsc_Internalname ;
   private String A13204ParUndDsc ;
   private String edtParOrden_Internalname ;
   private String T1673ParFasObs ;
   private String T1668ParFasVal ;
   private String A759ProDsc ;
   private String A460FasDsc ;
   private String AV22Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z759ProDsc ;
   private String Z460FasDsc ;
   private String A14061ParFasVmn ;
   private String A14060ParFasVmx ;
   private String Z1665ParFasDsc ;
   private String Z10585ParTit ;
   private String Z13204ParUndDsc ;
   private String AV33Modif ;
   private String sMode477 ;
   private String subGridlevel_level2_Internalname ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subFreestylelevel_level1_Class ;
   private String subFreestylelevel_level1_Linesclass ;
   private String tblUnnamedtablefsfreestylelevel_level1_Internalname ;
   private String divTableintermediateinslevel_level1_Internalname ;
   private String ROClassString ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtArtFasFac_Jsonclick ;
   private String divTableleaflevel_level2_Internalname ;
   private String sGXsfl_78_fel_idx="0001" ;
   private String subGridlevel_level2_Class ;
   private String subGridlevel_level2_Linesclass ;
   private String edtParFasCod_Jsonclick ;
   private String edtParFasDsc_Jsonclick ;
   private String edtParFasVal_Jsonclick ;
   private String edtParFasObs_Jsonclick ;
   private String edtParNVar_Jsonclick ;
   private String edtParTit_Jsonclick ;
   private String edtParFasVl2_Jsonclick ;
   private String edtParUndID_Jsonclick ;
   private String edtParUndDsc_Jsonclick ;
   private String edtParOrden_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subFreestylelevel_level1_Header ;
   private String subGridlevel_level2_Header ;
   private String GXv_char11[] ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV40Msg_err ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n65ArtCod ;
   private boolean n10584ParNVar ;
   private boolean n13203ParUndID ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n69ArtDsc ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean bGXsfl_78_Refreshing=false ;
   private boolean n1665ParFasDsc ;
   private boolean n10585ParTit ;
   private boolean n13204ParUndDsc ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Freestylelevel_level1Container ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level2Container ;
   private com.genexus.webpanels.GXWebRow Freestylelevel_level1Row ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level2Row ;
   private com.genexus.webpanels.GXWebColumn Freestylelevel_level1Column ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level2Column ;
   private com.genexus.webpanels.WebSession AV45WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00D514_A407EmprNom ;
   private boolean[] T00D514_n407EmprNom ;
   private String[] T00D515_A279CliNom ;
   private String[] T00D516_A65ArtCod ;
   private boolean[] T00D516_n65ArtCod ;
   private String[] T00D516_A407EmprNom ;
   private boolean[] T00D516_n407EmprNom ;
   private String[] T00D516_A279CliNom ;
   private String[] T00D516_A69ArtDsc ;
   private boolean[] T00D516_n69ArtDsc ;
   private String[] T00D516_A396EmprCod ;
   private int[] T00D516_A252CliCod ;
   private boolean[] T00D516_n252CliCod ;
   private String[] T00D517_A279CliNom ;
   private String[] T00D518_A396EmprCod ;
   private int[] T00D518_A252CliCod ;
   private boolean[] T00D518_n252CliCod ;
   private String[] T00D518_A65ArtCod ;
   private boolean[] T00D518_n65ArtCod ;
   private String[] T00D513_A65ArtCod ;
   private boolean[] T00D513_n65ArtCod ;
   private String[] T00D513_A69ArtDsc ;
   private boolean[] T00D513_n69ArtDsc ;
   private String[] T00D513_A396EmprCod ;
   private int[] T00D513_A252CliCod ;
   private boolean[] T00D513_n252CliCod ;
   private String[] T00D519_A396EmprCod ;
   private int[] T00D519_A252CliCod ;
   private boolean[] T00D519_n252CliCod ;
   private String[] T00D519_A65ArtCod ;
   private boolean[] T00D519_n65ArtCod ;
   private String[] T00D520_A396EmprCod ;
   private int[] T00D520_A252CliCod ;
   private boolean[] T00D520_n252CliCod ;
   private String[] T00D520_A65ArtCod ;
   private boolean[] T00D520_n65ArtCod ;
   private String[] T00D512_A65ArtCod ;
   private boolean[] T00D512_n65ArtCod ;
   private String[] T00D512_A69ArtDsc ;
   private boolean[] T00D512_n69ArtDsc ;
   private String[] T00D512_A396EmprCod ;
   private int[] T00D512_A252CliCod ;
   private boolean[] T00D512_n252CliCod ;
   private String[] T00D524_A279CliNom ;
   private String[] T00D525_A396EmprCod ;
   private int[] T00D525_A252CliCod ;
   private boolean[] T00D525_n252CliCod ;
   private String[] T00D525_A65ArtCod ;
   private boolean[] T00D525_n65ArtCod ;
   private byte[] T00D525_A499GrpFamCod ;
   private String[] T00D526_A396EmprCod ;
   private int[] T00D526_A252CliCod ;
   private boolean[] T00D526_n252CliCod ;
   private String[] T00D526_A12814ARTConID ;
   private String[] T00D526_A65ArtCod ;
   private boolean[] T00D526_n65ArtCod ;
   private String[] T00D527_A396EmprCod ;
   private int[] T00D527_A252CliCod ;
   private boolean[] T00D527_n252CliCod ;
   private String[] T00D527_A65ArtCod ;
   private boolean[] T00D527_n65ArtCod ;
   private byte[] T00D527_A12363SocInt ;
   private String[] T00D528_A396EmprCod ;
   private java.util.Date[] T00D528_A4929Inc_Dia ;
   private short[] T00D528_A5728JBCLLin ;
   private String[] T00D529_A396EmprCod ;
   private int[] T00D529_A252CliCod ;
   private boolean[] T00D529_n252CliCod ;
   private String[] T00D529_A5809MMezCod ;
   private String[] T00D529_A65ArtCod ;
   private boolean[] T00D529_n65ArtCod ;
   private String[] T00D530_A396EmprCod ;
   private int[] T00D530_A252CliCod ;
   private boolean[] T00D530_n252CliCod ;
   private String[] T00D530_A5234MezCod ;
   private byte[] T00D530_A5240MezLin ;
   private String[] T00D531_A396EmprCod ;
   private int[] T00D531_A252CliCod ;
   private boolean[] T00D531_n252CliCod ;
   private String[] T00D531_A65ArtCod ;
   private boolean[] T00D531_n65ArtCod ;
   private int[] T00D531_A4116estreclim ;
   private String[] T00D532_A396EmprCod ;
   private int[] T00D532_A252CliCod ;
   private boolean[] T00D532_n252CliCod ;
   private String[] T00D532_A65ArtCod ;
   private boolean[] T00D532_n65ArtCod ;
   private String[] T00D532_A4061EstNomCol ;
   private String[] T00D533_A396EmprCod ;
   private String[] T00D533_A9705ErpNped ;
   private short[] T00D533_A8652ErpLin ;
   private String[] T00D534_A396EmprCod ;
   private int[] T00D534_A252CliCod ;
   private boolean[] T00D534_n252CliCod ;
   private String[] T00D534_A65ArtCod ;
   private boolean[] T00D534_n65ArtCod ;
   private String[] T00D534_A7266CAAqP ;
   private String[] T00D535_A396EmprCod ;
   private int[] T00D535_A252CliCod ;
   private boolean[] T00D535_n252CliCod ;
   private String[] T00D535_A65ArtCod ;
   private boolean[] T00D535_n65ArtCod ;
   private java.util.Date[] T00D535_A11084H_DiaA ;
   private String[] T00D536_A396EmprCod ;
   private int[] T00D536_A252CliCod ;
   private boolean[] T00D536_n252CliCod ;
   private String[] T00D536_A65ArtCod ;
   private boolean[] T00D536_n65ArtCod ;
   private byte[] T00D536_A10972Int_cod ;
   private String[] T00D537_A396EmprCod ;
   private int[] T00D537_A252CliCod ;
   private boolean[] T00D537_n252CliCod ;
   private String[] T00D537_A65ArtCod ;
   private boolean[] T00D537_n65ArtCod ;
   private String[] T00D537_A10577Pg_Procod ;
   private String[] T00D538_A396EmprCod ;
   private int[] T00D538_A252CliCod ;
   private boolean[] T00D538_n252CliCod ;
   private String[] T00D538_A65ArtCod ;
   private boolean[] T00D538_n65ArtCod ;
   private String[] T00D538_A10272Hz_cod ;
   private String[] T00D539_A396EmprCod ;
   private int[] T00D539_A252CliCod ;
   private boolean[] T00D539_n252CliCod ;
   private String[] T00D539_A65ArtCod ;
   private boolean[] T00D539_n65ArtCod ;
   private String[] T00D539_A10041ArtSH ;
   private String[] T00D540_A396EmprCod ;
   private int[] T00D540_A252CliCod ;
   private boolean[] T00D540_n252CliCod ;
   private String[] T00D540_A65ArtCod ;
   private boolean[] T00D540_n65ArtCod ;
   private String[] T00D540_A8427TipoCt ;
   private int[] T00D540_A8428CapMxMq ;
   private String[] T00D541_A396EmprCod ;
   private int[] T00D541_A252CliCod ;
   private boolean[] T00D541_n252CliCod ;
   private String[] T00D541_A65ArtCod ;
   private boolean[] T00D541_n65ArtCod ;
   private short[] T00D541_A8342CodPred ;
   private String[] T00D542_A396EmprCod ;
   private int[] T00D542_A252CliCod ;
   private boolean[] T00D542_n252CliCod ;
   private String[] T00D542_A65ArtCod ;
   private boolean[] T00D542_n65ArtCod ;
   private String[] T00D542_A8089ArtcodTj ;
   private String[] T00D543_A396EmprCod ;
   private int[] T00D543_A252CliCod ;
   private boolean[] T00D543_n252CliCod ;
   private String[] T00D543_A65ArtCod ;
   private boolean[] T00D543_n65ArtCod ;
   private String[] T00D543_A7956Mq_CodM ;
   private String[] T00D544_A396EmprCod ;
   private int[] T00D544_A252CliCod ;
   private boolean[] T00D544_n252CliCod ;
   private String[] T00D544_A65ArtCod ;
   private boolean[] T00D544_n65ArtCod ;
   private short[] T00D544_A7949Par_Art ;
   private String[] T00D545_A396EmprCod ;
   private int[] T00D545_A252CliCod ;
   private boolean[] T00D545_n252CliCod ;
   private String[] T00D545_A65ArtCod ;
   private boolean[] T00D545_n65ArtCod ;
   private short[] T00D545_A7135Lin_fast ;
   private String[] T00D546_A396EmprCod ;
   private int[] T00D546_A252CliCod ;
   private boolean[] T00D546_n252CliCod ;
   private String[] T00D546_A65ArtCod ;
   private boolean[] T00D546_n65ArtCod ;
   private short[] T00D546_A6954Mat_lin ;
   private String[] T00D547_A396EmprCod ;
   private String[] T00D547_A602MaqCod ;
   private int[] T00D547_A6078MaqCliCod ;
   private String[] T00D547_A6079MaqArtCod ;
   private String[] T00D548_A396EmprCod ;
   private int[] T00D548_A252CliCod ;
   private boolean[] T00D548_n252CliCod ;
   private String[] T00D548_A65ArtCod ;
   private boolean[] T00D548_n65ArtCod ;
   private short[] T00D548_A5382EstCatAny ;
   private String[] T00D548_A5383EstCatSer ;
   private short[] T00D548_A5384EstCatTip ;
   private String[] T00D549_A396EmprCod ;
   private int[] T00D549_A252CliCod ;
   private boolean[] T00D549_n252CliCod ;
   private String[] T00D549_A65ArtCod ;
   private boolean[] T00D549_n65ArtCod ;
   private String[] T00D549_A4658MdlCod ;
   private String[] T00D550_A396EmprCod ;
   private int[] T00D550_A252CliCod ;
   private boolean[] T00D550_n252CliCod ;
   private String[] T00D550_A4175WebEmpCod ;
   private String[] T00D551_A396EmprCod ;
   private int[] T00D551_A252CliCod ;
   private boolean[] T00D551_n252CliCod ;
   private String[] T00D551_A4079WEBDISCOD ;
   private String[] T00D552_A396EmprCod ;
   private int[] T00D552_A252CliCod ;
   private boolean[] T00D552_n252CliCod ;
   private String[] T00D552_A65ArtCod ;
   private boolean[] T00D552_n65ArtCod ;
   private String[] T00D552_A4058CCFColNom ;
   private int[] T00D552_A4059CCFColNum ;
   private String[] T00D553_A396EmprCod ;
   private int[] T00D553_A252CliCod ;
   private boolean[] T00D553_n252CliCod ;
   private String[] T00D553_A65ArtCod ;
   private boolean[] T00D553_n65ArtCod ;
   private String[] T00D553_A1177Dibujo ;
   private int[] T00D553_A1790DibIntCod ;
   private String[] T00D554_A396EmprCod ;
   private int[] T00D554_A252CliCod ;
   private boolean[] T00D554_n252CliCod ;
   private String[] T00D554_A65ArtCod ;
   private boolean[] T00D554_n65ArtCod ;
   private byte[] T00D554_A1080LinPre ;
   private String[] T00D555_A396EmprCod ;
   private long[] T00D555_A3814PePCod ;
   private String[] T00D556_A396EmprCod ;
   private byte[] T00D556_A3413OpeManCod ;
   private String[] T00D556_A3430PreManNMt ;
   private int[] T00D556_A252CliCod ;
   private boolean[] T00D556_n252CliCod ;
   private String[] T00D556_A65ArtCod ;
   private boolean[] T00D556_n65ArtCod ;
   private String[] T00D557_A396EmprCod ;
   private int[] T00D557_A3415ParManNum ;
   private String[] T00D558_A396EmprCod ;
   private byte[] T00D558_A3331LanBroCod ;
   private short[] T00D558_A3333LanBroLin ;
   private String[] T00D559_A396EmprCod ;
   private int[] T00D559_A252CliCod ;
   private boolean[] T00D559_n252CliCod ;
   private String[] T00D559_A65ArtCod ;
   private boolean[] T00D559_n65ArtCod ;
   private java.math.BigDecimal[] T00D559_A3319ArtCapKgs ;
   private String[] T00D560_A396EmprCod ;
   private int[] T00D560_A252CliCod ;
   private boolean[] T00D560_n252CliCod ;
   private String[] T00D560_A65ArtCod ;
   private boolean[] T00D560_n65ArtCod ;
   private String[] T00D560_A3288CCalCod ;
   private String[] T00D561_A396EmprCod ;
   private int[] T00D561_A252CliCod ;
   private boolean[] T00D561_n252CliCod ;
   private String[] T00D561_A65ArtCod ;
   private boolean[] T00D561_n65ArtCod ;
   private String[] T00D561_A3033CCCod ;
   private String[] T00D562_A396EmprCod ;
   private int[] T00D562_A252CliCod ;
   private boolean[] T00D562_n252CliCod ;
   private String[] T00D562_A65ArtCod ;
   private boolean[] T00D562_n65ArtCod ;
   private byte[] T00D562_A2937RecIntCod ;
   private String[] T00D563_A396EmprCod ;
   private int[] T00D563_A252CliCod ;
   private boolean[] T00D563_n252CliCod ;
   private String[] T00D563_A65ArtCod ;
   private boolean[] T00D563_n65ArtCod ;
   private short[] T00D563_A2931Limite2 ;
   private String[] T00D564_A396EmprCod ;
   private int[] T00D564_A252CliCod ;
   private boolean[] T00D564_n252CliCod ;
   private String[] T00D564_A65ArtCod ;
   private boolean[] T00D564_n65ArtCod ;
   private short[] T00D564_A71ArtEstAny ;
   private String[] T00D564_A2756ArtEstSer ;
   private String[] T00D565_A396EmprCod ;
   private int[] T00D565_A252CliCod ;
   private boolean[] T00D565_n252CliCod ;
   private String[] T00D565_A1504CliProCod ;
   private String[] T00D565_A65ArtCod ;
   private boolean[] T00D565_n65ArtCod ;
   private String[] T00D566_A396EmprCod ;
   private int[] T00D566_A252CliCod ;
   private boolean[] T00D566_n252CliCod ;
   private String[] T00D566_A65ArtCod ;
   private boolean[] T00D566_n65ArtCod ;
   private byte[] T00D566_A598LinRec ;
   private String[] T00D567_A396EmprCod ;
   private int[] T00D567_A252CliCod ;
   private boolean[] T00D567_n252CliCod ;
   private String[] T00D567_A65ArtCod ;
   private boolean[] T00D567_n65ArtCod ;
   private byte[] T00D567_A831TipColCod ;
   private String[] T00D568_A396EmprCod ;
   private int[] T00D568_A252CliCod ;
   private boolean[] T00D568_n252CliCod ;
   private String[] T00D568_A65ArtCod ;
   private boolean[] T00D568_n65ArtCod ;
   private String[] T00D568_A758ProCod ;
   private String[] T00D569_A396EmprCod ;
   private int[] T00D569_A252CliCod ;
   private boolean[] T00D569_n252CliCod ;
   private String[] T00D569_A65ArtCod ;
   private boolean[] T00D569_n65ArtCod ;
   private String[] T00D570_A759ProDsc ;
   private String[] T00D570_A460FasDsc ;
   private java.math.BigDecimal[] T00D570_A8560ArtFasFac ;
   private short[] T00D570_A14544ArtFasPyS ;
   private short[] T00D570_A14545ArtFasPpp ;
   private java.math.BigDecimal[] T00D570_A14546ArtFasVel ;
   private short[] T00D570_A14547ArtFasNPs ;
   private String[] T00D570_A396EmprCod ;
   private int[] T00D570_A252CliCod ;
   private boolean[] T00D570_n252CliCod ;
   private String[] T00D570_A65ArtCod ;
   private boolean[] T00D570_n65ArtCod ;
   private String[] T00D570_A758ProCod ;
   private String[] T00D570_A457FasCod ;
   private String[] T00D58_A759ProDsc ;
   private String[] T00D59_A396EmprCod ;
   private String[] T00D510_A460FasDsc ;
   private String[] T00D511_A396EmprCod ;
   private String[] T00D571_A759ProDsc ;
   private String[] T00D572_A396EmprCod ;
   private String[] T00D573_A460FasDsc ;
   private String[] T00D574_A396EmprCod ;
   private String[] T00D575_A396EmprCod ;
   private int[] T00D575_A252CliCod ;
   private boolean[] T00D575_n252CliCod ;
   private String[] T00D575_A65ArtCod ;
   private boolean[] T00D575_n65ArtCod ;
   private String[] T00D575_A758ProCod ;
   private String[] T00D575_A457FasCod ;
   private java.math.BigDecimal[] T00D57_A8560ArtFasFac ;
   private short[] T00D57_A14544ArtFasPyS ;
   private short[] T00D57_A14545ArtFasPpp ;
   private java.math.BigDecimal[] T00D57_A14546ArtFasVel ;
   private short[] T00D57_A14547ArtFasNPs ;
   private String[] T00D57_A396EmprCod ;
   private int[] T00D57_A252CliCod ;
   private boolean[] T00D57_n252CliCod ;
   private String[] T00D57_A65ArtCod ;
   private boolean[] T00D57_n65ArtCod ;
   private String[] T00D57_A758ProCod ;
   private String[] T00D57_A457FasCod ;
   private java.math.BigDecimal[] T00D56_A8560ArtFasFac ;
   private short[] T00D56_A14544ArtFasPyS ;
   private short[] T00D56_A14545ArtFasPpp ;
   private java.math.BigDecimal[] T00D56_A14546ArtFasVel ;
   private short[] T00D56_A14547ArtFasNPs ;
   private String[] T00D56_A396EmprCod ;
   private int[] T00D56_A252CliCod ;
   private boolean[] T00D56_n252CliCod ;
   private String[] T00D56_A65ArtCod ;
   private boolean[] T00D56_n65ArtCod ;
   private String[] T00D56_A758ProCod ;
   private String[] T00D56_A457FasCod ;
   private String[] T00D579_A759ProDsc ;
   private String[] T00D580_A460FasDsc ;
   private String[] T00D581_A396EmprCod ;
   private int[] T00D581_A252CliCod ;
   private boolean[] T00D581_n252CliCod ;
   private String[] T00D581_A65ArtCod ;
   private boolean[] T00D581_n65ArtCod ;
   private String[] T00D581_A758ProCod ;
   private String[] T00D581_A457FasCod ;
   private short[] T00D581_A4897ArtProLin ;
   private String[] T00D582_A396EmprCod ;
   private int[] T00D582_A252CliCod ;
   private boolean[] T00D582_n252CliCod ;
   private String[] T00D582_A65ArtCod ;
   private boolean[] T00D582_n65ArtCod ;
   private String[] T00D582_A758ProCod ;
   private String[] T00D582_A457FasCod ;
   private int[] T00D583_A252CliCod ;
   private boolean[] T00D583_n252CliCod ;
   private String[] T00D583_A65ArtCod ;
   private boolean[] T00D583_n65ArtCod ;
   private String[] T00D583_A758ProCod ;
   private String[] T00D583_A1665ParFasDsc ;
   private boolean[] T00D583_n1665ParFasDsc ;
   private String[] T00D583_A1668ParFasVal ;
   private String[] T00D583_A1673ParFasObs ;
   private short[] T00D583_A10584ParNVar ;
   private boolean[] T00D583_n10584ParNVar ;
   private String[] T00D583_A10585ParTit ;
   private boolean[] T00D583_n10585ParTit ;
   private String[] T00D583_A12670ParFasVl2 ;
   private String[] T00D583_A13204ParUndDsc ;
   private boolean[] T00D583_n13204ParUndDsc ;
   private short[] T00D583_A13220ParOrden ;
   private String[] T00D583_A14061ParFasVmn ;
   private String[] T00D583_A14060ParFasVmx ;
   private String[] T00D583_A396EmprCod ;
   private short[] T00D583_A1664ParFasCod ;
   private short[] T00D583_A13203ParUndID ;
   private boolean[] T00D583_n13203ParUndID ;
   private String[] T00D583_A457FasCod ;
   private String[] T00D54_A1665ParFasDsc ;
   private boolean[] T00D54_n1665ParFasDsc ;
   private short[] T00D54_A10584ParNVar ;
   private boolean[] T00D54_n10584ParNVar ;
   private String[] T00D54_A10585ParTit ;
   private boolean[] T00D54_n10585ParTit ;
   private short[] T00D54_A13203ParUndID ;
   private boolean[] T00D54_n13203ParUndID ;
   private String[] T00D55_A13204ParUndDsc ;
   private boolean[] T00D55_n13204ParUndDsc ;
   private String[] T00D584_A1665ParFasDsc ;
   private boolean[] T00D584_n1665ParFasDsc ;
   private short[] T00D584_A10584ParNVar ;
   private boolean[] T00D584_n10584ParNVar ;
   private String[] T00D584_A10585ParTit ;
   private boolean[] T00D584_n10585ParTit ;
   private short[] T00D584_A13203ParUndID ;
   private boolean[] T00D584_n13203ParUndID ;
   private String[] T00D585_A13204ParUndDsc ;
   private boolean[] T00D585_n13204ParUndDsc ;
   private String[] T00D586_A396EmprCod ;
   private int[] T00D586_A252CliCod ;
   private boolean[] T00D586_n252CliCod ;
   private String[] T00D586_A65ArtCod ;
   private boolean[] T00D586_n65ArtCod ;
   private String[] T00D586_A758ProCod ;
   private String[] T00D586_A457FasCod ;
   private short[] T00D586_A1664ParFasCod ;
   private int[] T00D53_A252CliCod ;
   private boolean[] T00D53_n252CliCod ;
   private String[] T00D53_A65ArtCod ;
   private boolean[] T00D53_n65ArtCod ;
   private String[] T00D53_A758ProCod ;
   private String[] T00D53_A1668ParFasVal ;
   private String[] T00D53_A1673ParFasObs ;
   private String[] T00D53_A12670ParFasVl2 ;
   private short[] T00D53_A13220ParOrden ;
   private String[] T00D53_A14061ParFasVmn ;
   private String[] T00D53_A14060ParFasVmx ;
   private String[] T00D53_A396EmprCod ;
   private short[] T00D53_A1664ParFasCod ;
   private String[] T00D53_A457FasCod ;
   private int[] T00D52_A252CliCod ;
   private boolean[] T00D52_n252CliCod ;
   private String[] T00D52_A65ArtCod ;
   private boolean[] T00D52_n65ArtCod ;
   private String[] T00D52_A758ProCod ;
   private String[] T00D52_A1668ParFasVal ;
   private String[] T00D52_A1673ParFasObs ;
   private String[] T00D52_A12670ParFasVl2 ;
   private short[] T00D52_A13220ParOrden ;
   private String[] T00D52_A14061ParFasVmn ;
   private String[] T00D52_A14060ParFasVmx ;
   private String[] T00D52_A396EmprCod ;
   private short[] T00D52_A1664ParFasCod ;
   private String[] T00D52_A457FasCod ;
   private String[] T00D590_A1665ParFasDsc ;
   private boolean[] T00D590_n1665ParFasDsc ;
   private short[] T00D590_A10584ParNVar ;
   private boolean[] T00D590_n10584ParNVar ;
   private String[] T00D590_A10585ParTit ;
   private boolean[] T00D590_n10585ParTit ;
   private short[] T00D590_A13203ParUndID ;
   private boolean[] T00D590_n13203ParUndID ;
   private String[] T00D591_A13204ParUndDsc ;
   private boolean[] T00D591_n13204ParUndDsc ;
   private String[] T00D592_A396EmprCod ;
   private int[] T00D592_A252CliCod ;
   private boolean[] T00D592_n252CliCod ;
   private String[] T00D592_A65ArtCod ;
   private boolean[] T00D592_n65ArtCod ;
   private String[] T00D592_A758ProCod ;
   private String[] T00D592_A457FasCod ;
   private short[] T00D592_A1664ParFasCod ;
   private String[] T00D593_A396EmprCod ;
   private String[] T00D594_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV43WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV44TrnContext ;
}

final  class tserpa2__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tserpa2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tserpa2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tserpa2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tserpa2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00D52", "SELECT CliCod, ArtCod, ProCod, ParFasVal, ParFasObs, ParFasVl2, ParOrden, ParFasVmn, ParFasVmx, EmprCod, ParFasCod, FasCod FROM TXPSERPAR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ParFasCod = ?  FOR UPDATE OF ParFasVal, ParFasObs, ParFasVl2, ParOrden, ParFasVmn, ParFasVmx NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D53", "SELECT CliCod, ArtCod, ProCod, ParFasVal, ParFasObs, ParFasVl2, ParOrden, ParFasVmn, ParFasVmx, EmprCod, ParFasCod, FasCod FROM TXPSERPAR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D54", "SELECT ParFasDsc, ParNVar, ParTit, ParUndID FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D55", "SELECT ParUndDsc FROM TXPPARUND WHERE EmprCod = ? AND ParUndID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D56", "SELECT ArtFasFac, ArtFasPyS, ArtFasPpp, ArtFasVel, ArtFasNPs, EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ?  FOR UPDATE OF ArtFasFac, ArtFasPyS, ArtFasPpp, ArtFasVel, ArtFasNPs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D57", "SELECT ArtFasFac, ArtFasPyS, ArtFasPpp, ArtFasVel, ArtFasNPs, EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D58", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D59", "SELECT EmprCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D510", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D511", "SELECT EmprCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D512", "SELECT ArtCod, ArtDsc, EmprCod, CliCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?  FOR UPDATE OF ArtDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D513", "SELECT ArtCod, ArtDsc, EmprCod, CliCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D514", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D515", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D516", "SELECT /*+ FIRST_ROWS(100) */ TM1.ArtCod, T2.EmprNom, T3.CliNom, TM1.ArtDsc, TM1.EmprCod, TM1.CliCod FROM ((TXPARTICU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D517", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D518", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D519", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE ( CliCod > ? or CliCod = ? and ArtCod > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D520", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE ( CliCod < ? or CliCod = ? and ArtCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00D521", "INSERT INTO TXPARTICU(ArtCod, ArtDsc, EmprCod, CliCod, ArtMat, TipArtCod, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtObs, ArtObsFac, ArtPreKgm, ArtPreMtr, ArtPreDef, ULinRec, ArtNMtr, ArtPml, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoN, ArtRdoA, ArtNumTex1, ArtNumTex2, NumTexCod, ArtFacAbs, ArtCosBase, ArtPle2, ArtObsLon, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPreCap, ArtAnu, ArtFecCre, ArtPrMEst, ULinPre, ClasCod, ArtPmPPza, ArtUsrCod, ArtFecMod, ArtPreUlAc, ArtPreUsrM, ArtPelAnh, ArtAcaAnh, ArtAcaMar, ArtAcaBak, ArtLotMaq, ArtCruMts, ArtCruKgs, ArtCruEnr, ArtLotPza, ArtLotMts, ArtLotKgs, ArtAcaFor, ArtRb, ArtValMtr, ArtCodExt, ArtComer, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtLu, ArtFacTor, Mat_UltL, Mat_Maq, UltLinFT, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, CapKgs1, CapKgs2, CapKgs3, CapKgs4, CapKgs5, CapKgs6, CapKgs7, CapKgs8, CapKgs9, CapKgs10, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtTh, Art_Cd, CapUsuM, CapFecM, Mat_UsuM, Mat_FecM, CapUsuA, CapFecA, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtPreObs, ArtFacUti, ArtPreEst, ArtDefEst, ArtNumTip, ArtPreUnd, Mat_ObsG, ArtMT, ArtTRabs, ArtKgMn, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtObsOtra, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtActivo) VALUES(?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, ' ')", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T00D522", "UPDATE TXPARTICU SET ArtDsc=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new UpdateCursor("T00D523", "DELETE FROM TXPARTICU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK, "TXPARTICU")
         ,new ForEachCursor("T00D524", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D525", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, GrpFamCod FROM TXPEstTa0 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D526", "SELECT * FROM (SELECT EmprCod, CliCod, ARTConID, ArtCod FROM TXPARTCo1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D527", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, SocInt FROM TXPSOCRAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D528", "SELECT * FROM (SELECT EmprCod, Inc_Dia, JBCLLin FROM TXPJBConL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D529", "SELECT * FROM (SELECT EmprCod, CliCod, MMezCod, ArtCod FROM TXPMEZCL1 WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D530", "SELECT * FROM (SELECT EmprCod, CliCod, MezCod, MezLin FROM TXPLMZCLA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D531", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, estreclim FROM TXPrecest WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D532", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstNomCol FROM TXPCESTAM WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D533", "SELECT * FROM (SELECT EmprCod, ErpNped, ErpLin FROM TXPCPEDCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D534", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CAAqP FROM TXPPCARC WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D535", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, H_DiaA FROM TXPHPREAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D536", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Int_cod FROM TXPINCINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D537", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Pg_Procod FROM TXPPGCOLO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D538", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Hz_cod FROM TXPTR02JL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D539", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtSH FROM TXPCLATFA WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D540", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipoCt, CapMxMq FROM TXPARTMQT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D541", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CodPred FROM TXPPVPNIT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D542", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtcodTj FROM TXPTEJART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D543", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mq_CodM FROM TXPTNART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D544", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Par_Art FROM TXPARTTEJ WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D545", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Lin_fast FROM TXPPARTIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D546", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Mat_lin FROM TXPARTMAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D547", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ? AND MaqArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D548", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, EstCatAny, EstCatSer, EstCatTip FROM TXPESTCAT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D549", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod FROM TXPModels WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D550", "SELECT * FROM (SELECT EmprCod, CliCod, WebEmpCod FROM TXPWEBEMP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D551", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD FROM TXPWebDis WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D552", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum FROM TXPCCSeri WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D553", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Dibujo, DibIntCod FROM TXPCPRECO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D554", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinPre FROM TXPLINPRE WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D555", "SELECT * FROM (SELECT EmprCod, PePCod FROM TXPPedPro WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D556", "SELECT * FROM (SELECT EmprCod, OpeManCod, PreManNMt, CliCod, ArtCod FROM TXPPREMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D557", "SELECT * FROM (SELECT EmprCod, ParManNum FROM TXPPARMAN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D558", "SELECT * FROM (SELECT EmprCod, LanBroCod, LanBroLin FROM TXPLANBRL WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D559", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtCapKgs FROM TXPPRECAP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D560", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCalCod FROM TXPPARSER WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D561", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCCod FROM TXPCCArt WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D562", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, RecIntCod FROM TXPARTINT WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D563", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Limite2 FROM TXPRECARB WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D564", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtEstAny, ArtEstSer FROM TXPCESART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D565", "SELECT * FROM (SELECT EmprCod, CliCod, CliProCod, ArtCod FROM TXPCPREPR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D566", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LinRec FROM TXPRECARG WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D567", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, TipColCod FROM TXPPRETCO WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D568", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D569", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D570", "SELECT T2.ProDsc, T3.FasDsc, T1.ArtFasFac, T1.ArtFasPyS, T1.ArtFasPpp, T1.ArtFasVel, T1.ArtFasNPs, T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod, T1.FasCod FROM ((TXPSERPAU T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod, T1.FasCod ",true, GX_NOMASK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D571", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D572", "SELECT EmprCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D573", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D574", "SELECT EmprCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D575", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00D576", "INSERT INTO TXPSERPAU(ArtFasFac, ArtFasPyS, ArtFasPpp, ArtFasVel, ArtFasNPs, EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProULin, ArtProFacT, ArtProFac, CCTCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0)", GX_NOMASK, "TXPSERPAU")
         ,new UpdateCursor("T00D577", "UPDATE TXPSERPAU SET ArtFasFac=?, ArtFasPyS=?, ArtFasPpp=?, ArtFasVel=?, ArtFasNPs=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ?", GX_NOMASK, "TXPSERPAU")
         ,new UpdateCursor("T00D578", "DELETE FROM TXPSERPAU  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ?", GX_NOMASK, "TXPSERPAU")
         ,new ForEachCursor("T00D579", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D580", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D581", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProLin FROM TXPArtFor WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D582", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod ",true, GX_NOMASK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D583", "SELECT T1.CliCod, T1.ArtCod, T1.ProCod, T2.ParFasDsc, T1.ParFasVal, T1.ParFasObs, T2.ParNVar, T2.ParTit, T1.ParFasVl2, T3.ParUndDsc, T1.ParOrden, T1.ParFasVmn, T1.ParFasVmx, T1.EmprCod, T1.ParFasCod, T2.ParUndID, T1.FasCod FROM ((TXPSERPAR T1 INNER JOIN TXPPARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.ParFasCod = T1.ParFasCod) LEFT JOIN TXPPARUND T3 ON T3.EmprCod = T1.EmprCod AND T3.ParUndID = T2.ParUndID) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ? and T1.FasCod = ? and T1.ParFasCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod, T1.FasCod, T1.ParFasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D584", "SELECT ParFasDsc, ParNVar, ParTit, ParUndID FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D585", "SELECT ParUndDsc FROM TXPPARUND WHERE EmprCod = ? AND ParUndID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D586", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasCod FROM TXPSERPAR WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00D587", "INSERT INTO TXPSERPAR(CliCod, ArtCod, ProCod, ParFasVal, ParFasObs, ParFasVl2, ParOrden, ParFasVmn, ParFasVmx, EmprCod, ParFasCod, FasCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPSERPAR")
         ,new UpdateCursor("T00D588", "UPDATE TXPSERPAR SET ParFasVal=?, ParFasObs=?, ParFasVl2=?, ParOrden=?, ParFasVmn=?, ParFasVmx=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ParFasCod = ?", GX_NOMASK, "TXPSERPAR")
         ,new UpdateCursor("T00D589", "DELETE FROM TXPSERPAR  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? AND FasCod = ? AND ParFasCod = ?", GX_NOMASK, "TXPSERPAR")
         ,new ForEachCursor("T00D590", "SELECT ParFasDsc, ParNVar, ParTit, ParUndID FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D591", "SELECT ParUndDsc FROM TXPPARUND WHERE EmprCod = ? AND ParUndID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D592", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasCod FROM TXPSERPAR WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D593", "SELECT EmprCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D594", "SELECT EmprCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 81 :
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
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 15);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 15);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
      }
      getresults90( cursor, rslt, buf) ;
   }

   public void getresults90( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 92 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               stmt.setShort(6, ((Number) parms[7]).shortValue());
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               stmt.setShort(6, ((Number) parms[7]).shortValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
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
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 16);
               }
               stmt.setString(4, (String)parms[6], 3);
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 16);
               }
               stmt.setString(4, (String)parms[6], 3);
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 26);
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 22 :
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
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 8);
               return;
            case 73 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               return;
            case 74 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[9], 16);
               }
               stmt.setString(9, (String)parms[10], 8);
               stmt.setString(10, (String)parms[11], 8);
               return;
            case 75 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[9], 16);
               }
               stmt.setString(9, (String)parms[10], 8);
               stmt.setString(10, (String)parms[11], 8);
               return;
            case 76 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 78 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 79 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               return;
            case 80 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 81 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               stmt.setShort(6, ((Number) parms[7]).shortValue());
               return;
            case 82 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 83 :
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
            case 84 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               stmt.setShort(6, ((Number) parms[7]).shortValue());
               return;
            case 85 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 16);
               }
               stmt.setString(3, (String)parms[4], 8);
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 60);
               stmt.setString(6, (String)parms[7], 12);
               stmt.setShort(7, ((Number) parms[8]).shortValue());
               stmt.setString(8, (String)parms[9], 12);
               stmt.setString(9, (String)parms[10], 12);
               stmt.setString(10, (String)parms[11], 3);
               stmt.setShort(11, ((Number) parms[12]).shortValue());
               stmt.setString(12, (String)parms[13], 8);
               return;
            case 86 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 60);
               stmt.setString(3, (String)parms[2], 12);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 12);
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[10], 16);
               }
               stmt.setString(10, (String)parms[11], 8);
               stmt.setString(11, (String)parms[12], 8);
               stmt.setShort(12, ((Number) parms[13]).shortValue());
               return;
            case 87 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               stmt.setShort(6, ((Number) parms[7]).shortValue());
               return;
            case 88 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 89 :
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
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               stmt.setString(5, (String)parms[6], 8);
               return;
            case 91 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               stmt.setString(4, (String)parms[5], 8);
               return;
            case 92 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 8);
               return;
      }
   }

}

