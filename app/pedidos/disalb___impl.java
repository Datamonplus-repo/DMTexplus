package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class disalb___impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         AV19UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19UsurCod", AV19UsurCod);
         AV20Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Station", AV20Station);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_16_1U535( A396EmprCod, A44AlbRecCod, AV19UsurCod, AV20Station) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_18( A396EmprCod, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
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
         gxload_20( A396EmprCod, A252CliCod) ;
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
            AV8DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8DisCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8DisCod), "ZZZZZZZ9")));
            AV9AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRecCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9AlbRecCod), "ZZZZZZZ9")));
            AV13DisFec = localUtil.parseDateParm( httpContext.GetPar( "DisFec")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13DisFec", localUtil.format(AV13DisFec, "99/99/99"));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISFEC", getSecureSignedToken( "", AV13DisFec));
            AV14CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14CliCod), "ZZZZZ9")));
            AV15CliNom = httpContext.GetPar( "CliNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15CliNom", AV15CliNom);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15CliNom, ""))));
            AV16DisArtCod = httpContext.GetPar( "DisArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16DisArtCod", AV16DisArtCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16DisArtCod, ""))));
            AV17DisArtDsc = httpContext.GetPar( "DisArtDsc") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17DisArtDsc", AV17DisArtDsc);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISARTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17DisArtDsc, ""))));
            AV18DisEst = (byte)(GXutil.lval( httpContext.GetPar( "DisEst"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18DisEst", GXutil.str( AV18DisEst, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18DisEst), "9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Almacen Tejido ", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public disalb___impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public disalb___impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disalb___impl.class ));
   }

   public disalb___impl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbRUni = new HTMLChoice();
      cmbavDisest = new HTMLChoice();
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
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      }
      if ( cmbavDisest.getItemCount() > 0 )
      {
         AV18DisEst = (byte)(GXutil.lval( cmbavDisest.getValidValue(GXutil.trim( GXutil.str( AV18DisEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18DisEst", GXutil.str( AV18DisEst, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18DisEst), "9")));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDisest.setValue( GXutil.trim( GXutil.str( AV18DisEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDisest.getInternalname(), "Values", cmbavDisest.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisCod_Internalname, httpContext.getMessage( "Nº Disp. Int.", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisfec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavDisfec_Internalname, httpContext.getMessage( "Fecha", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtavDisfec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtavDisfec_Internalname, localUtil.format(AV13DisFec, "99/99/99"), localUtil.format( AV13DisFec, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisfec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisfec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtavDisfec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDisfec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\DisAlb__.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV14CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV15CliNom), GXutil.rtrim( localUtil.format( AV15CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisartcod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavDisartcod_Internalname, httpContext.getMessage( "Articulo", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavDisartcod_Internalname, GXutil.rtrim( AV16DisArtCod), GXutil.rtrim( localUtil.format( AV16DisArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisartcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisartcod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisartdsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavDisartdsc_Internalname, httpContext.getMessage( "Descripcion", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavDisartdsc_Internalname, GXutil.rtrim( AV17DisArtDsc), GXutil.rtrim( localUtil.format( AV17DisArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisartdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisartdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisUniMed_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisUniMed_Internalname, httpContext.getMessage( "Und", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisUniMed_Internalname, GXutil.rtrim( A392DisUniMed), GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisUniMed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisUniMed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb__.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRecCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRecCod_Internalname, httpContext.getMessage( "N Recepcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRecCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtKilos_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtKilos_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtKilos_Internalname, GXutil.ltrim( localUtil.ntoc( A595Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtKilos_Enabled!=0) ? localUtil.format( A595Kilos, "ZZZZZ9.99") : localUtil.format( A595Kilos, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKilos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtKilos_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetros_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetros_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetros_Internalname, GXutil.ltrim( localUtil.ntoc( A631Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetros_Enabled!=0) ? localUtil.format( A631Metros, "ZZZZZ9.99") : localUtil.format( A631Metros, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetros_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMetros_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPiezas_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPiezas_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPiezas_Internalname, GXutil.ltrim( localUtil.ntoc( A673Piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPiezas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A673Piezas), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A673Piezas), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPiezas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPiezas_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__.htm");
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
      ucDvpanel_unnamedtable3.setProperty("Width", Dvpanel_unnamedtable3_Width);
      ucDvpanel_unnamedtable3.setProperty("AutoWidth", Dvpanel_unnamedtable3_Autowidth);
      ucDvpanel_unnamedtable3.setProperty("AutoHeight", Dvpanel_unnamedtable3_Autoheight);
      ucDvpanel_unnamedtable3.setProperty("Cls", Dvpanel_unnamedtable3_Cls);
      ucDvpanel_unnamedtable3.setProperty("Title", Dvpanel_unnamedtable3_Title);
      ucDvpanel_unnamedtable3.setProperty("Collapsible", Dvpanel_unnamedtable3_Collapsible);
      ucDvpanel_unnamedtable3.setProperty("Collapsed", Dvpanel_unnamedtable3_Collapsed);
      ucDvpanel_unnamedtable3.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable3_Showcollapseicon);
      ucDvpanel_unnamedtable3.setProperty("IconPosition", Dvpanel_unnamedtable3_Iconposition);
      ucDvpanel_unnamedtable3.setProperty("AutoScroll", Dvpanel_unnamedtable3_Autoscroll);
      ucDvpanel_unnamedtable3.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable3_Internalname, "DVPANEL_UNNAMEDTABLE3Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE3Container"+"UnnamedTable3"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieEnt_Internalname, httpContext.getMessage( "Pzas. Ent.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieEnt_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniEnt_Internalname, httpContext.getMessage( "Unds. Ent.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbRUni.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbRUni.getInternalname(), httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Pedidos\\DisAlb__.htm");
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniDis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniDis_Internalname, httpContext.getMessage( "Unds. Disp.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieDis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieDis_Internalname, httpContext.getMessage( "Pzs. Disp.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb__.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisAlb__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisAlb__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisAlb__.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV21Pgmname), GXutil.rtrim( localUtil.format( AV21Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb__.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb__.htm");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDisest, cmbavDisest.getInternalname(), GXutil.trim( GXutil.str( AV18DisEst, 1, 0)), 1, cmbavDisest.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavDisest.getVisible(), cmbavDisest.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", "", true, (byte)(0), "HLP_Pedidos\\DisAlb__.htm");
      cmbavDisest.setValue( GXutil.trim( GXutil.str( AV18DisEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDisest.getInternalname(), "Values", cmbavDisest.ToJavascriptSource(), true);
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
      e111U52 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z595Kilos = localUtil.ctond( httpContext.cgiGet( "Z595Kilos")) ;
            Z631Metros = localUtil.ctond( httpContext.cgiGet( "Z631Metros")) ;
            Z673Piezas = (int)(localUtil.ctol( httpContext.cgiGet( "Z673Piezas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
            Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z56AlbRUni = httpContext.cgiGet( "Z56AlbRUni") ;
            Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z55AlbRReo = httpContext.cgiGet( "Z55AlbRReo") ;
            Z45AlbRef = httpContext.cgiGet( "Z45AlbRef") ;
            Z4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z4920AlbRGrm2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z4921AlbRAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6463AlbRLote = httpContext.cgiGet( "Z6463AlbRLote") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A55AlbRReo = httpContext.cgiGet( "Z55AlbRReo") ;
            A45AlbRef = httpContext.cgiGet( "Z45AlbRef") ;
            A4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z4920AlbRGrm2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z4921AlbRAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6463AlbRLote = httpContext.cgiGet( "Z6463AlbRLote") ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O673Piezas = (int)(localUtil.ctol( httpContext.cgiGet( "O673Piezas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "O54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O631Metros = localUtil.ctond( httpContext.cgiGet( "O631Metros")) ;
            O60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "O60AlbRUniUti")) ;
            O392DisUniMed = httpContext.cgiGet( "O392DisUniMed") ;
            O595Kilos = localUtil.ctond( httpContext.cgiGet( "O595Kilos")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "ALBRUNIUTI")) ;
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "vDISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRECCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV20Station = httpContext.cgiGet( "vSTATION") ;
            AV19UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            A47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBREST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A55AlbRReo = httpContext.cgiGet( "ALBRREO") ;
            A45AlbRef = httpContext.cgiGet( "ALBREF") ;
            A4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( "ALBRGRM2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( "ALBRANC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6463AlbRLote = httpContext.cgiGet( "ALBRLOTE") ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A369DisFec = localUtil.ctod( httpContext.cgiGet( "DISFEC"), 0) ;
            A335DisArtCod = httpContext.cgiGet( "DISARTCOD") ;
            A337DisArtDsc = httpContext.cgiGet( "DISARTDSC") ;
            A279CliNom = httpContext.cgiGet( "CLINOM") ;
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
            Dvpanel_unnamedtable3_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Objectcall") ;
            Dvpanel_unnamedtable3_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Class") ;
            Dvpanel_unnamedtable3_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Enabled")) ;
            Dvpanel_unnamedtable3_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Width") ;
            Dvpanel_unnamedtable3_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Height") ;
            Dvpanel_unnamedtable3_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autowidth")) ;
            Dvpanel_unnamedtable3_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoheight")) ;
            Dvpanel_unnamedtable3_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Cls") ;
            Dvpanel_unnamedtable3_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showheader")) ;
            Dvpanel_unnamedtable3_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Title") ;
            Dvpanel_unnamedtable3_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsible")) ;
            Dvpanel_unnamedtable3_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsed")) ;
            Dvpanel_unnamedtable3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showcollapseicon")) ;
            Dvpanel_unnamedtable3_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Iconposition") ;
            Dvpanel_unnamedtable3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoscroll")) ;
            Dvpanel_unnamedtable3_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Visible")) ;
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
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            AV13DisFec = localUtil.ctod( httpContext.cgiGet( edtavDisfec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13DisFec", localUtil.format(AV13DisFec, "99/99/99"));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISFEC", getSecureSignedToken( "", AV13DisFec));
            AV14CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14CliCod), "ZZZZZ9")));
            AV15CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15CliNom", AV15CliNom);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15CliNom, ""))));
            AV16DisArtCod = httpContext.cgiGet( edtavDisartcod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16DisArtCod", AV16DisArtCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16DisArtCod, ""))));
            AV17DisArtDsc = httpContext.cgiGet( edtavDisartdsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17DisArtDsc", AV17DisArtDsc);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISARTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17DisArtDsc, ""))));
            A392DisUniMed = GXutil.upper( httpContext.cgiGet( edtDisUniMed_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRECCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A44AlbRecCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            else
            {
               A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtKilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtKilos_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "KILOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtKilos_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A595Kilos = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
            }
            else
            {
               A595Kilos = localUtil.ctond( httpContext.cgiGet( edtKilos_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetros_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METROS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMetros_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A631Metros = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
            }
            else
            {
               A631Metros = localUtil.ctond( httpContext.cgiGet( edtMetros_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PIEZAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPiezas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A673Piezas = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
            }
            else
            {
               A673Piezas = (int)(localUtil.ctol( httpContext.cgiGet( edtPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
            }
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
            cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
            A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
            A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
            AV21Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            cmbavDisest.setValue( httpContext.cgiGet( cmbavDisest.getInternalname()) );
            AV18DisEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbavDisest.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18DisEst", GXutil.str( AV18DisEst, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18DisEst), "9")));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DisAlb__");
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A44AlbRecCod != Z44AlbRecCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("pedidos\\disalb__:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
                  sMode35 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode35 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound35 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1U50( ) ;
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
                        e111U52 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121U52 ();
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
         e121U52 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1U535( ) ;
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
         disableAttributes1U535( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavDisfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisfec_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavDisartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisartcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavDisartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisartdsc_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, cmbavDisest.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavDisest.getEnabled(), 5, 0), true);
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

   public void confirm_1U50( )
   {
      beforeValidate1U535( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1U535( ) ;
         }
         else
         {
            checkExtendedTable1U535( ) ;
            closeExtendedTableCursors1U535( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1U50( )
   {
   }

   public void e111U52( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV20Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      disalb___impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Station", AV20Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV22Emprnom ;
      GXv_char4[0] = AV19UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV20Station, GXv_char2, GXv_char3, GXv_char4) ;
      disalb___impl.this.AV7EmprCod = GXv_char2[0] ;
      disalb___impl.this.AV22Emprnom = GXv_char3[0] ;
      disalb___impl.this.AV19UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV22Emprnom", AV22Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV19UsurCod", AV19UsurCod);
      GXv_SdtWWPContext5[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV10WWPContext = GXv_SdtWWPContext5[0] ;
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      cmbavDisest.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDisest.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDisest.getVisible(), 5, 0), true);
   }

   public void e121U52( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1U535( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z595Kilos = T01U53_A595Kilos[0] ;
            Z631Metros = T01U53_A631Metros[0] ;
            Z673Piezas = T01U53_A673Piezas[0] ;
         }
         else
         {
            Z595Kilos = A595Kilos ;
            Z631Metros = A631Metros ;
            Z673Piezas = A673Piezas ;
         }
      }
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         Z58AlbRUniEnt = T01U55_A58AlbRUniEnt[0] ;
         Z52AlbRPieEnt = T01U55_A52AlbRPieEnt[0] ;
         Z56AlbRUni = T01U55_A56AlbRUni[0] ;
         Z47AlbREst = T01U55_A47AlbREst[0] ;
         Z55AlbRReo = T01U55_A55AlbRReo[0] ;
         Z45AlbRef = T01U55_A45AlbRef[0] ;
         Z4920AlbRGrm2 = T01U55_A4920AlbRGrm2[0] ;
         Z4921AlbRAnc = T01U55_A4921AlbRAnc[0] ;
         Z6463AlbRLote = T01U55_A6463AlbRLote[0] ;
         Z252CliCod = T01U55_A252CliCod[0] ;
      }
      if ( GX_JID == -17 )
      {
         Z595Kilos = A595Kilos ;
         Z631Metros = A631Metros ;
         Z673Piezas = A673Piezas ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z361DisCod = A361DisCod ;
         Z369DisFec = A369DisFec ;
         Z392DisUniMed = A392DisUniMed ;
         Z335DisArtCod = A335DisArtCod ;
         Z337DisArtDsc = A337DisArtDsc ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z56AlbRUni = A56AlbRUni ;
         Z47AlbREst = A47AlbREst ;
         Z55AlbRReo = A55AlbRReo ;
         Z45AlbRef = A45AlbRef ;
         Z4920AlbRGrm2 = A4920AlbRGrm2 ;
         Z4921AlbRAnc = A4921AlbRAnc ;
         Z6463AlbRLote = A6463AlbRLote ;
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      AV21Pgmname = "Pedidos.DisAlb__" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
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
      if ( ! (0==AV8DisCod) )
      {
         A361DisCod = AV8DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      if ( ! (0==AV9AlbRecCod) )
      {
         A44AlbRecCod = AV9AlbRecCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      if ( ! (0==AV9AlbRecCod) )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRecCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9AlbRecCod) )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
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
         /* Using cursor T01U56 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A369DisFec = T01U56_A369DisFec[0] ;
         A392DisUniMed = T01U56_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A335DisArtCod = T01U56_A335DisArtCod[0] ;
         A337DisArtDsc = T01U56_A337DisArtDsc[0] ;
         O392DisUniMed = A392DisUniMed ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         pr_default.close(4);
         /* Using cursor T01U55 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         zm1U535( 18) ;
         A60AlbRUniUti = T01U55_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01U55_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = T01U55_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A52AlbRPieEnt = T01U55_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A56AlbRUni = T01U55_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A47AlbREst = T01U55_A47AlbREst[0] ;
         A55AlbRReo = T01U55_A55AlbRReo[0] ;
         A45AlbRef = T01U55_A45AlbRef[0] ;
         A4920AlbRGrm2 = T01U55_A4920AlbRGrm2[0] ;
         A4921AlbRAnc = T01U55_A4921AlbRAnc[0] ;
         A6463AlbRLote = T01U55_A6463AlbRLote[0] ;
         A252CliCod = T01U55_A252CliCod[0] ;
         O54AlbRPieUti = A54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         O60AlbRUniUti = A60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         pr_default.close(3);
         /* Using cursor T01U57 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01U57_A279CliNom[0] ;
         pr_default.close(5);
      }
   }

   public void load1U535( )
   {
      /* Using cursor T01U58 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A60AlbRUniUti = T01U58_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01U58_A54AlbRPieUti[0] ;
         A369DisFec = T01U58_A369DisFec[0] ;
         A392DisUniMed = T01U58_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A279CliNom = T01U58_A279CliNom[0] ;
         A335DisArtCod = T01U58_A335DisArtCod[0] ;
         A337DisArtDsc = T01U58_A337DisArtDsc[0] ;
         A595Kilos = T01U58_A595Kilos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
         A631Metros = T01U58_A631Metros[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
         A673Piezas = T01U58_A673Piezas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
         A58AlbRUniEnt = T01U58_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A52AlbRPieEnt = T01U58_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A56AlbRUni = T01U58_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A47AlbREst = T01U58_A47AlbREst[0] ;
         A55AlbRReo = T01U58_A55AlbRReo[0] ;
         A45AlbRef = T01U58_A45AlbRef[0] ;
         A4920AlbRGrm2 = T01U58_A4920AlbRGrm2[0] ;
         A4921AlbRAnc = T01U58_A4921AlbRAnc[0] ;
         A6463AlbRLote = T01U58_A6463AlbRLote[0] ;
         A252CliCod = T01U58_A252CliCod[0] ;
         zm1U535( -17) ;
      }
      pr_default.close(6);
      onLoadActions1U535( ) ;
   }

   public void onLoadActions1U535( )
   {
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      O392DisUniMed = A392DisUniMed ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      if ( isDlt( )  && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
      {
         A60AlbRUniUti = O60AlbRUniUti.subtract(O595Kilos) ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( isUpd( )  && ! ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
         {
            A60AlbRUniUti = O60AlbRUniUti.subtract(O595Kilos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
         else
         {
            if ( isUpd( )  && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
            {
               A60AlbRUniUti = O60AlbRUniUti.add(A595Kilos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
               {
                  A60AlbRUniUti = O60AlbRUniUti.add(A595Kilos).subtract(O595Kilos) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               }
               else
               {
                  if ( isDlt( )  && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                  {
                     A60AlbRUniUti = O60AlbRUniUti.subtract(O631Metros) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                  }
                  else
                  {
                     if ( isUpd( )  && ! ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                     {
                        A60AlbRUniUti = O60AlbRUniUti.subtract(O631Metros) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                     }
                     else
                     {
                        if ( isUpd( )  && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                        {
                           A60AlbRUniUti = O60AlbRUniUti.add(A631Metros) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                        }
                        else
                        {
                           if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                           {
                              A60AlbRUniUti = O60AlbRUniUti.add(A631Metros).subtract(O631Metros) ;
                              httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      if ( isDlt( )  )
      {
         A54AlbRPieUti = (int)(O54AlbRPieUti-O673Piezas) ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti+A673Piezas-O673Piezas) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
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
   }

   public void checkExtendedTable1U535( )
   {
      nIsDirty_35 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01U56 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A369DisFec = T01U56_A369DisFec[0] ;
      A392DisUniMed = T01U56_A392DisUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      A335DisArtCod = T01U56_A335DisArtCod[0] ;
      A337DisArtDsc = T01U56_A337DisArtDsc[0] ;
      nIsDirty_35 = (short)(1) ;
      O392DisUniMed = A392DisUniMed ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      pr_default.close(4);
      /* Using cursor T01U55 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A60AlbRUniUti = T01U55_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01U55_A54AlbRPieUti[0] ;
      A58AlbRUniEnt = T01U55_A58AlbRUniEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A52AlbRPieEnt = T01U55_A52AlbRPieEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A56AlbRUni = T01U55_A56AlbRUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A47AlbREst = T01U55_A47AlbREst[0] ;
      A55AlbRReo = T01U55_A55AlbRReo[0] ;
      A45AlbRef = T01U55_A45AlbRef[0] ;
      A4920AlbRGrm2 = T01U55_A4920AlbRGrm2[0] ;
      A4921AlbRAnc = T01U55_A4921AlbRAnc[0] ;
      A6463AlbRLote = T01U55_A6463AlbRLote[0] ;
      A252CliCod = T01U55_A252CliCod[0] ;
      nIsDirty_35 = (short)(1) ;
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      nIsDirty_35 = (short)(1) ;
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      pr_default.close(3);
      if ( isDlt( )  && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
      {
         nIsDirty_35 = (short)(1) ;
         A60AlbRUniUti = O60AlbRUniUti.subtract(O595Kilos) ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( isUpd( )  && ! ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
         {
            nIsDirty_35 = (short)(1) ;
            A60AlbRUniUti = O60AlbRUniUti.subtract(O595Kilos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
         else
         {
            if ( isUpd( )  && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
            {
               nIsDirty_35 = (short)(1) ;
               A60AlbRUniUti = O60AlbRUniUti.add(A595Kilos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
               {
                  nIsDirty_35 = (short)(1) ;
                  A60AlbRUniUti = O60AlbRUniUti.add(A595Kilos).subtract(O595Kilos) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               }
               else
               {
                  if ( isDlt( )  && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                  {
                     nIsDirty_35 = (short)(1) ;
                     A60AlbRUniUti = O60AlbRUniUti.subtract(O631Metros) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                  }
                  else
                  {
                     if ( isUpd( )  && ! ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                     {
                        nIsDirty_35 = (short)(1) ;
                        A60AlbRUniUti = O60AlbRUniUti.subtract(O631Metros) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                     }
                     else
                     {
                        if ( isUpd( )  && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                        {
                           nIsDirty_35 = (short)(1) ;
                           A60AlbRUniUti = O60AlbRUniUti.add(A631Metros) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                        }
                        else
                        {
                           if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                           {
                              nIsDirty_35 = (short)(1) ;
                              A60AlbRUniUti = O60AlbRUniUti.add(A631Metros).subtract(O631Metros) ;
                              httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      if ( isDlt( )  )
      {
         nIsDirty_35 = (short)(1) ;
         A54AlbRPieUti = (int)(O54AlbRPieUti-O673Piezas) ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_35 = (short)(1) ;
            A54AlbRPieUti = (int)(O54AlbRPieUti+A673Piezas-O673Piezas) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_35 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_35 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            nIsDirty_35 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      nIsDirty_35 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      /* Using cursor T01U57 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01U57_A279CliNom[0] ;
      pr_default.close(5);
      if ( ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 ) && true /* After */ && ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de Unidades Pedido superior a Unidades Disponibles", ""), 1, "KILOS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtKilos_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 ) && true /* After */ && ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "M", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de Unidades Pedido superior a Unidades Disponibles", ""), 1, "METROS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetros_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1U535( )
   {
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_19( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01U59 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A369DisFec = T01U59_A369DisFec[0] ;
      A392DisUniMed = T01U59_A392DisUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      A335DisArtCod = T01U59_A335DisArtCod[0] ;
      A337DisArtDsc = T01U59_A337DisArtDsc[0] ;
      O392DisUniMed = A392DisUniMed ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A369DisFec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A392DisUniMed))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A335DisArtCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A337DisArtDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_18( String A396EmprCod ,
                          int A44AlbRecCod )
   {
      /* Using cursor T01U55 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A60AlbRUniUti = T01U55_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01U55_A54AlbRPieUti[0] ;
      A58AlbRUniEnt = T01U55_A58AlbRUniEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A52AlbRPieEnt = T01U55_A52AlbRPieEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A56AlbRUni = T01U55_A56AlbRUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A47AlbREst = T01U55_A47AlbREst[0] ;
      A55AlbRReo = T01U55_A55AlbRReo[0] ;
      A45AlbRef = T01U55_A45AlbRef[0] ;
      A4920AlbRGrm2 = T01U55_A4920AlbRGrm2[0] ;
      A4921AlbRAnc = T01U55_A4921AlbRAnc[0] ;
      A6463AlbRLote = T01U55_A6463AlbRLote[0] ;
      A252CliCod = T01U55_A252CliCod[0] ;
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A56AlbRUni))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A55AlbRReo))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6463AlbRLote))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(3) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
   }

   public void gxload_20( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01U510 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01U510_A279CliNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1U535( )
   {
      /* Using cursor T01U511 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound35 = (short)(1) ;
      }
      else
      {
         RcdFound35 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01U53 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1U535( 17) ;
         RcdFound35 = (short)(1) ;
         A595Kilos = T01U53_A595Kilos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
         A631Metros = T01U53_A631Metros[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
         A673Piezas = T01U53_A673Piezas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
         A396EmprCod = T01U53_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = T01U53_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A361DisCod = T01U53_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         O673Piezas = A673Piezas ;
         httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
         O631Metros = A631Metros ;
         httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
         O595Kilos = A595Kilos ;
         httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1U535( ) ;
         if ( AnyError == 1 )
         {
            RcdFound35 = (short)(0) ;
            initializeNonKey1U535( ) ;
         }
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound35 = (short)(0) ;
         initializeNonKey1U535( ) ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1U535( ) ;
      if ( RcdFound35 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound35 = (short)(0) ;
      /* Using cursor T01U512 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A44AlbRecCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01U512_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01U512_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U512_A44AlbRecCod[0] < A44AlbRecCod ) || ( T01U512_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T01U512_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U512_A361DisCod[0] < A361DisCod ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01U512_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01U512_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U512_A44AlbRecCod[0] > A44AlbRecCod ) || ( T01U512_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T01U512_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U512_A361DisCod[0] > A361DisCod ) ) )
         {
            A396EmprCod = T01U512_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A44AlbRecCod = T01U512_A44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            A361DisCod = T01U512_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            RcdFound35 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound35 = (short)(0) ;
      /* Using cursor T01U513 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A44AlbRecCod), A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01U513_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01U513_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U513_A44AlbRecCod[0] > A44AlbRecCod ) || ( T01U513_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T01U513_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U513_A361DisCod[0] > A361DisCod ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01U513_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01U513_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U513_A44AlbRecCod[0] < A44AlbRecCod ) || ( T01U513_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T01U513_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U513_A361DisCod[0] < A361DisCod ) ) )
         {
            A396EmprCod = T01U513_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A44AlbRecCod = T01U513_A44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            A361DisCod = T01U513_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            RcdFound35 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1U535( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1U535( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound35 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A361DisCod = Z361DisCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               A44AlbRecCod = Z44AlbRecCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1U535( ) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1U535( ) ;
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
                  GX_FocusControl = edtAlbRecCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1U535( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A44AlbRecCod != Z44AlbRecCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = Z361DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A44AlbRecCod = Z44AlbRecCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1U535( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01U52 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISALB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z595Kilos, T01U52_A595Kilos[0]) != 0 ) || ( DecimalUtil.compareTo(Z631Metros, T01U52_A631Metros[0]) != 0 ) || ( Z673Piezas != T01U52_A673Piezas[0] ) )
         {
            if ( DecimalUtil.compareTo(Z595Kilos, T01U52_A595Kilos[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb__:[seudo value changed for attri]"+"Kilos");
               GXutil.writeLogRaw("Old: ",Z595Kilos);
               GXutil.writeLogRaw("Current: ",T01U52_A595Kilos[0]);
            }
            if ( DecimalUtil.compareTo(Z631Metros, T01U52_A631Metros[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb__:[seudo value changed for attri]"+"Metros");
               GXutil.writeLogRaw("Old: ",Z631Metros);
               GXutil.writeLogRaw("Current: ",T01U52_A631Metros[0]);
            }
            if ( Z673Piezas != T01U52_A673Piezas[0] )
            {
               GXutil.writeLogln("pedidos.disalb__:[seudo value changed for attri]"+"Piezas");
               GXutil.writeLogRaw("Old: ",Z673Piezas);
               GXutil.writeLogRaw("Current: ",T01U52_A673Piezas[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISALB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01U514 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(12) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01U514_A58AlbRUniEnt[0]) != 0 ) || ( Z52AlbRPieEnt != T01U514_A52AlbRPieEnt[0] ) || ( GXutil.strcmp(Z56AlbRUni, T01U514_A56AlbRUni[0]) != 0 ) || ( Z47AlbREst != T01U514_A47AlbREst[0] ) || ( GXutil.strcmp(Z55AlbRReo, T01U514_A55AlbRReo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z45AlbRef, T01U514_A45AlbRef[0]) != 0 ) || ( Z4920AlbRGrm2 != T01U514_A4920AlbRGrm2[0] ) || ( Z4921AlbRAnc != T01U514_A4921AlbRAnc[0] ) || ( GXutil.strcmp(Z6463AlbRLote, T01U514_A6463AlbRLote[0]) != 0 ) || ( Z252CliCod != T01U514_A252CliCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01U514_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb__:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T01U514_A58AlbRUniEnt[0]);
            }
            if ( Z52AlbRPieEnt != T01U514_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("pedidos.disalb__:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T01U514_A52AlbRPieEnt[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T01U514_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb__:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T01U514_A56AlbRUni[0]);
            }
            if ( Z47AlbREst != T01U514_A47AlbREst[0] )
            {
               GXutil.writeLogln("pedidos.disalb__:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T01U514_A47AlbREst[0]);
            }
            if ( GXutil.strcmp(Z55AlbRReo, T01U514_A55AlbRReo[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb__:[seudo value changed for attri]"+"AlbRReo");
               GXutil.writeLogRaw("Old: ",Z55AlbRReo);
               GXutil.writeLogRaw("Current: ",T01U514_A55AlbRReo[0]);
            }
            if ( GXutil.strcmp(Z45AlbRef, T01U514_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb__:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T01U514_A45AlbRef[0]);
            }
            if ( Z4920AlbRGrm2 != T01U514_A4920AlbRGrm2[0] )
            {
               GXutil.writeLogln("pedidos.disalb__:[seudo value changed for attri]"+"AlbRGrm2");
               GXutil.writeLogRaw("Old: ",Z4920AlbRGrm2);
               GXutil.writeLogRaw("Current: ",T01U514_A4920AlbRGrm2[0]);
            }
            if ( Z4921AlbRAnc != T01U514_A4921AlbRAnc[0] )
            {
               GXutil.writeLogln("pedidos.disalb__:[seudo value changed for attri]"+"AlbRAnc");
               GXutil.writeLogRaw("Old: ",Z4921AlbRAnc);
               GXutil.writeLogRaw("Current: ",T01U514_A4921AlbRAnc[0]);
            }
            if ( GXutil.strcmp(Z6463AlbRLote, T01U514_A6463AlbRLote[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disalb__:[seudo value changed for attri]"+"AlbRLote");
               GXutil.writeLogRaw("Old: ",Z6463AlbRLote);
               GXutil.writeLogRaw("Current: ",T01U514_A6463AlbRLote[0]);
            }
            if ( Z252CliCod != T01U514_A252CliCod[0] )
            {
               GXutil.writeLogln("pedidos.disalb__:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01U514_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1U535( )
   {
      beforeValidate1U535( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1U535( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1U535( 0) ;
         checkOptimisticConcurrency1U535( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1U535( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1U535( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01U515 */
                  pr_default.execute(13, new Object[] {A595Kilos, A631Metros, Integer.valueOf(A673Piezas), A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
                  if ( (pr_default.getStatus(13) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11U535( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1U50( ) ;
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
            load1U535( ) ;
         }
         endLevel1U535( ) ;
      }
      closeExtendedTableCursors1U535( ) ;
   }

   public void update1U535( )
   {
      beforeValidate1U535( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1U535( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1U535( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1U535( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1U535( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01U516 */
                  pr_default.execute(14, new Object[] {A595Kilos, A631Metros, Integer.valueOf(A673Piezas), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISALB"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1U535( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11U535( ) ;
                     /* Start of After( update) rules */
                     if ( true /* After */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int6[0] = A44AlbRecCod ;
                        GXv_char3[0] = AV19UsurCod ;
                        GXv_char2[0] = AV20Station ;
                        new app.pestalbr(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_char2) ;
                        disalb___impl.this.A396EmprCod = GXv_char4[0] ;
                        disalb___impl.this.A44AlbRecCod = GXv_int6[0] ;
                        disalb___impl.this.AV19UsurCod = GXv_char3[0] ;
                        disalb___impl.this.AV20Station = GXv_char2[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV19UsurCod", AV19UsurCod);
                        httpContext.ajax_rsp_assign_attri("", false, "AV20Station", AV20Station);
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
         endLevel1U535( ) ;
      }
      closeExtendedTableCursors1U535( ) ;
   }

   public void deferredUpdate1U535( )
   {
   }

   public void delete( )
   {
      beforeValidate1U535( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1U535( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1U535( ) ;
         afterConfirm1U535( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1U535( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01U517 */
               pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
               if ( AnyError == 0 )
               {
                  updateTablesN11U535( ) ;
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
      sMode35 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1U535( ) ;
      Gx_mode = sMode35 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1U535( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01U518 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A369DisFec = T01U518_A369DisFec[0] ;
         A392DisUniMed = T01U518_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A335DisArtCod = T01U518_A335DisArtCod[0] ;
         A337DisArtDsc = T01U518_A337DisArtDsc[0] ;
         pr_default.close(16);
         /* Using cursor T01U519 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Z58AlbRUniEnt = T01U519_A58AlbRUniEnt[0] ;
         Z52AlbRPieEnt = T01U519_A52AlbRPieEnt[0] ;
         Z56AlbRUni = T01U519_A56AlbRUni[0] ;
         Z47AlbREst = T01U519_A47AlbREst[0] ;
         Z55AlbRReo = T01U519_A55AlbRReo[0] ;
         Z45AlbRef = T01U519_A45AlbRef[0] ;
         Z4920AlbRGrm2 = T01U519_A4920AlbRGrm2[0] ;
         Z4921AlbRAnc = T01U519_A4921AlbRAnc[0] ;
         Z6463AlbRLote = T01U519_A6463AlbRLote[0] ;
         Z252CliCod = T01U519_A252CliCod[0] ;
         A60AlbRUniUti = T01U519_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01U519_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = T01U519_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A52AlbRPieEnt = T01U519_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A56AlbRUni = T01U519_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A47AlbREst = T01U519_A47AlbREst[0] ;
         A55AlbRReo = T01U519_A55AlbRReo[0] ;
         A45AlbRef = T01U519_A45AlbRef[0] ;
         A4920AlbRGrm2 = T01U519_A4920AlbRGrm2[0] ;
         A4921AlbRAnc = T01U519_A4921AlbRAnc[0] ;
         A6463AlbRLote = T01U519_A6463AlbRLote[0] ;
         A252CliCod = T01U519_A252CliCod[0] ;
         O54AlbRPieUti = A54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         O60AlbRUniUti = A60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         pr_default.close(17);
         /* Using cursor T01U520 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01U520_A279CliNom[0] ;
         pr_default.close(18);
         if ( isDlt( )  && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
         {
            A60AlbRUniUti = O60AlbRUniUti.subtract(O595Kilos) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
         else
         {
            if ( isUpd( )  && ! ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
            {
               A60AlbRUniUti = O60AlbRUniUti.subtract(O595Kilos) ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            }
            else
            {
               if ( isUpd( )  && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
               {
                  A60AlbRUniUti = O60AlbRUniUti.add(A595Kilos) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               }
               else
               {
                  if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
                  {
                     A60AlbRUniUti = O60AlbRUniUti.add(A595Kilos).subtract(O595Kilos) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                  }
                  else
                  {
                     if ( isDlt( )  && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                     {
                        A60AlbRUniUti = O60AlbRUniUti.subtract(O631Metros) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                     }
                     else
                     {
                        if ( isUpd( )  && ! ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                        {
                           A60AlbRUniUti = O60AlbRUniUti.subtract(O631Metros) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                        }
                        else
                        {
                           if ( isUpd( )  && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                           {
                              A60AlbRUniUti = O60AlbRUniUti.add(A631Metros) ;
                              httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                           }
                           else
                           {
                              if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                              {
                                 A60AlbRUniUti = O60AlbRUniUti.add(A631Metros).subtract(O631Metros) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                              }
                           }
                        }
                     }
                  }
               }
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
         if ( isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti-O673Piezas) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A54AlbRPieUti = (int)(O54AlbRPieUti+A673Piezas-O673Piezas) ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01U521 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIOUT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01U522 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
      }
   }

   public void updateTablesN11U535( )
   {
      /* Using cursor T01U523 */
      pr_default.execute(21, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel1U535( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(12);
      if ( AnyError == 0 )
      {
         beforeComplete1U535( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pedidos.disalb__");
         if ( AnyError == 0 )
         {
            confirmValues1U50( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pedidos.disalb__");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1U535( )
   {
      /* Scan By routine */
      /* Using cursor T01U524 */
      pr_default.execute(22);
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A396EmprCod = T01U524_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = T01U524_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A44AlbRecCod = T01U524_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1U535( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A396EmprCod = T01U524_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = T01U524_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A44AlbRecCod = T01U524_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
   }

   public void scanEnd1U535( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1U535( )
   {
      /* After Confirm Rules */
      if ( ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de Unidades Pedido superior a Unidades Disponibles", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert1U535( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1U535( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1U535( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1U535( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1U535( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1U535( )
   {
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtavDisfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisfec_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavDisartcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisartcod_Enabled), 5, 0), true);
      edtavDisartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisartdsc_Enabled), 5, 0), true);
      edtDisUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUniMed_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtKilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKilos_Enabled), 5, 0), true);
      edtMetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetros_Enabled), 5, 0), true);
      edtPiezas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPiezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPiezas_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      cmbavDisest.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDisest.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavDisest.getEnabled(), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1U535( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISFEC", getSecureSignedToken( "", AV13DisFec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16DisArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISARTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17DisArtDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18DisEst), "9")));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1U50( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidos.disalb__", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9AlbRecCod,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV13DisFec)),GXutil.URLEncode(GXutil.ltrimstr(AV14CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV15CliNom)),GXutil.URLEncode(GXutil.rtrim(AV16DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV17DisArtDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV18DisEst,1,0))}, new String[] {"Gx_mode","EmprCod","DisCod","AlbRecCod","DisFec","CliCod","CliNom","DisArtCod","DisArtDsc","DisEst"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISFEC", getSecureSignedToken( "", AV13DisFec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16DisArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISARTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17DisArtDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18DisEst), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DisAlb__");
      forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\disalb__:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z595Kilos", GXutil.ltrim( localUtil.ntoc( Z595Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z631Metros", GXutil.ltrim( localUtil.ntoc( Z631Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z673Piezas", GXutil.ltrim( localUtil.ntoc( Z673Piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z55AlbRReo", GXutil.rtrim( Z55AlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4920AlbRGrm2", GXutil.ltrim( localUtil.ntoc( Z4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4921AlbRAnc", GXutil.ltrim( localUtil.ntoc( Z4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6463AlbRLote", GXutil.rtrim( Z6463AlbRLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O673Piezas", GXutil.ltrim( localUtil.ntoc( O673Piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O631Metros", GXutil.ltrim( localUtil.ntoc( O631Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O392DisUniMed", GXutil.rtrim( O392DisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "O595Kilos", GXutil.ltrim( localUtil.ntoc( O595Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV8DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV9AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9AlbRecCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV20Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV19UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREST", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRREO", GXutil.rtrim( A55AlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREF", GXutil.rtrim( A45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRGRM2", GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRANC", GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRLOTE", GXutil.rtrim( A6463AlbRLote));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFEC", localUtil.dtoc( A369DisFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "DISARTCOD", GXutil.rtrim( A335DisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "DISARTDSC", GXutil.rtrim( A337DisArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable3_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Enabled", GXutil.booltostr( Dvpanel_unnamedtable3_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Width", GXutil.rtrim( Dvpanel_unnamedtable3_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable3_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable3_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Cls", GXutil.rtrim( Dvpanel_unnamedtable3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Title", GXutil.rtrim( Dvpanel_unnamedtable3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable3_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable3_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable3_Autoscroll));
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
      return formatLink("app.pedidos.disalb__", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9AlbRecCod,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV13DisFec)),GXutil.URLEncode(GXutil.ltrimstr(AV14CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV15CliNom)),GXutil.URLEncode(GXutil.rtrim(AV16DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV17DisArtDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV18DisEst,1,0))}, new String[] {"Gx_mode","EmprCod","DisCod","AlbRecCod","DisFec","CliCod","CliNom","DisArtCod","DisArtDsc","DisEst"})  ;
   }

   public String getPgmname( )
   {
      return "Pedidos.DisAlb__" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Almacen Tejido ", "") ;
   }

   public void initializeNonKey1U535( )
   {
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      A369DisFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
      A392DisUniMed = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A335DisArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      A337DisArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", A337DisArtDsc);
      A595Kilos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
      A631Metros = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
      A673Piezas = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A56AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A47AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      A55AlbRReo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      A45AlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A4920AlbRGrm2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4920AlbRGrm2), 4, 0));
      A4921AlbRAnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4921AlbRAnc), 4, 0));
      A6463AlbRLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", A6463AlbRLote);
      O673Piezas = A673Piezas ;
      httpContext.ajax_rsp_assign_attri("", false, "A673Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A673Piezas), 6, 0));
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O631Metros = A631Metros ;
      httpContext.ajax_rsp_assign_attri("", false, "A631Metros", GXutil.ltrimstr( A631Metros, 9, 2));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      O392DisUniMed = A392DisUniMed ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      O595Kilos = A595Kilos ;
      httpContext.ajax_rsp_assign_attri("", false, "A595Kilos", GXutil.ltrimstr( A595Kilos, 9, 2));
      Z595Kilos = DecimalUtil.ZERO ;
      Z631Metros = DecimalUtil.ZERO ;
      Z673Piezas = 0 ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z52AlbRPieEnt = 0 ;
      Z56AlbRUni = "" ;
      Z47AlbREst = (byte)(0) ;
      Z55AlbRReo = "" ;
      Z45AlbRef = "" ;
      Z4920AlbRGrm2 = (short)(0) ;
      Z4921AlbRAnc = (short)(0) ;
      Z6463AlbRLote = "" ;
      Z252CliCod = 0 ;
   }

   public void initAll1U535( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A44AlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      initializeNonKey1U535( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116102324", true, true);
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
      httpContext.AddJavascriptSource("pedidos/disalb__.js", "?202682116102324", false, true);
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
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtDisCod_Internalname = "DISCOD" ;
      edtavDisfec_Internalname = "vDISFEC" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavDisartcod_Internalname = "vDISARTCOD" ;
      edtavDisartdsc_Internalname = "vDISARTDSC" ;
      edtDisUniMed_Internalname = "DISUNIMED" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtKilos_Internalname = "KILOS" ;
      edtMetros_Internalname = "METROS" ;
      edtPiezas_Internalname = "PIEZAS" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      cmbavDisest.setInternalname( "vDISEST" );
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
      Form.setCaption( httpContext.getMessage( "Almacen Tejido ", "") );
      cmbavDisest.setJsonclick( "" );
      cmbavDisest.setVisible( 1 );
      cmbavDisest.setEnabled( 0 );
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Enabled = 0 ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Enabled = 0 ;
      cmbAlbRUni.setJsonclick( "" );
      cmbAlbRUni.setEnabled( 0 );
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniEnt_Enabled = 0 ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Enabled = 0 ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Almacen", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      edtPiezas_Jsonclick = "" ;
      edtPiezas_Enabled = 1 ;
      edtMetros_Jsonclick = "" ;
      edtMetros_Enabled = 1 ;
      edtKilos_Jsonclick = "" ;
      edtKilos_Enabled = 1 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Enabled = 1 ;
      edtDisUniMed_Jsonclick = "" ;
      edtDisUniMed_Enabled = 0 ;
      edtavDisartdsc_Jsonclick = "" ;
      edtavDisartdsc_Enabled = 0 ;
      edtavDisartcod_Jsonclick = "" ;
      edtavDisartcod_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      edtavDisfec_Jsonclick = "" ;
      edtavDisfec_Enabled = 0 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Enabled = 0 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Datos", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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

   public void xc_16_1U535( String A396EmprCod ,
                            int A44AlbRecCod ,
                            String AV19UsurCod ,
                            String AV20Station )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A44AlbRecCod ;
         GXv_char3[0] = AV19UsurCod ;
         GXv_char2[0] = AV20Station ;
         new app.pestalbr(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int6[0] ;
         AV19UsurCod = GXv_char3[0] ;
         AV20Station = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV19UsurCod", AV19UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV20Station", AV20Station);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV19UsurCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV20Station))+"\"") ;
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
      cmbAlbRUni.setName( "ALBRUNI" );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      cmbavDisest.setName( "vDISEST" );
      cmbavDisest.setWebtags( "" );
      cmbavDisest.addItem("1", httpContext.getMessage( "En Pedido", ""), (short)(0));
      cmbavDisest.addItem("3", httpContext.getMessage( "En Produccion", ""), (short)(0));
      if ( cmbavDisest.getItemCount() > 0 )
      {
         AV18DisEst = (byte)(GXutil.lval( cmbavDisest.getValidValue(GXutil.trim( GXutil.str( AV18DisEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18DisEst", GXutil.str( AV18DisEst, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18DisEst), "9")));
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

   public void valid_Emprcod( )
   {
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      /* Using cursor T01U519 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      Z58AlbRUniEnt = T01U519_A58AlbRUniEnt[0] ;
      Z52AlbRPieEnt = T01U519_A52AlbRPieEnt[0] ;
      Z56AlbRUni = T01U519_A56AlbRUni[0] ;
      Z47AlbREst = T01U519_A47AlbREst[0] ;
      Z55AlbRReo = T01U519_A55AlbRReo[0] ;
      Z45AlbRef = T01U519_A45AlbRef[0] ;
      Z4920AlbRGrm2 = T01U519_A4920AlbRGrm2[0] ;
      Z4921AlbRAnc = T01U519_A4921AlbRAnc[0] ;
      Z6463AlbRLote = T01U519_A6463AlbRLote[0] ;
      Z252CliCod = T01U519_A252CliCod[0] ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A60AlbRUniUti = T01U519_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01U519_A54AlbRPieUti[0] ;
      A58AlbRUniEnt = T01U519_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01U519_A52AlbRPieEnt[0] ;
      A56AlbRUni = T01U519_A56AlbRUni[0] ;
      cmbAlbRUni.setValue( A56AlbRUni );
      A47AlbREst = T01U519_A47AlbREst[0] ;
      A55AlbRReo = T01U519_A55AlbRReo[0] ;
      A45AlbRef = T01U519_A45AlbRef[0] ;
      A4920AlbRGrm2 = T01U519_A4920AlbRGrm2[0] ;
      A4921AlbRAnc = T01U519_A4921AlbRAnc[0] ;
      A6463AlbRLote = T01U519_A6463AlbRLote[0] ;
      A252CliCod = T01U519_A252CliCod[0] ;
      O54AlbRPieUti = A54AlbRPieUti ;
      O60AlbRUniUti = A60AlbRUniUti ;
      pr_default.close(17);
      /* Using cursor T01U518 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A369DisFec = T01U518_A369DisFec[0] ;
      A392DisUniMed = T01U518_A392DisUniMed[0] ;
      A335DisArtCod = T01U518_A335DisArtCod[0] ;
      A337DisArtDsc = T01U518_A337DisArtDsc[0] ;
      O392DisUniMed = A392DisUniMed ;
      pr_default.close(16);
      /* Using cursor T01U520 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T01U520_A279CliNom[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         cmbAlbRUni.setValue( A56AlbRUni );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O392DisUniMed", GXutil.rtrim( O392DisUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "O60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", GXutil.rtrim( A55AlbRReo));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A4920AlbRGrm2", GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4921AlbRAnc", GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", GXutil.rtrim( A6463AlbRLote));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A369DisFec", localUtil.format(A369DisFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", GXutil.rtrim( A392DisUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", GXutil.rtrim( A335DisArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A337DisArtDsc", GXutil.rtrim( A337DisArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV13DisFec',fld:'vDISFEC',pic:'',hsh:true},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV15CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV16DisArtCod',fld:'vDISARTCOD',pic:'',hsh:true},{av:'AV17DisArtDsc',fld:'vDISARTDSC',pic:'',hsh:true},{av:'cmbavDisest'},{av:'AV18DisEst',fld:'vDISEST',pic:'9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV13DisFec',fld:'vDISFEC',pic:'',hsh:true},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV15CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV16DisArtCod',fld:'vDISARTCOD',pic:'',hsh:true},{av:'AV17DisArtDsc',fld:'vDISARTDSC',pic:'',hsh:true},{av:'cmbavDisest'},{av:'AV18DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121U52',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_DISUNIMED","{handler:'valid_Disunimed',iparms:[]");
      setEventMetadata("VALID_DISUNIMED",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("VALID_KILOS","{handler:'valid_Kilos',iparms:[]");
      setEventMetadata("VALID_KILOS",",oparms:[]}");
      setEventMetadata("VALID_METROS","{handler:'valid_Metros',iparms:[]");
      setEventMetadata("VALID_METROS",",oparms:[]}");
      setEventMetadata("VALID_PIEZAS","{handler:'valid_Piezas',iparms:[]");
      setEventMetadata("VALID_PIEZAS",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A4920AlbRGrm2',fld:'ALBRGRM2',pic:'ZZZ9'},{av:'A4921AlbRAnc',fld:'ALBRANC',pic:'ZZZ9'},{av:'A6463AlbRLote',fld:'ALBRLOTE',pic:''},{av:'A369DisFec',fld:'DISFEC',pic:''},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A337DisArtDsc',fld:'DISARTDSC',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'O392DisUniMed'},{av:'O60AlbRUniUti'},{av:'O54AlbRPieUti'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A4920AlbRGrm2',fld:'ALBRGRM2',pic:'ZZZ9'},{av:'A4921AlbRAnc',fld:'ALBRANC',pic:'ZZZ9'},{av:'A6463AlbRLote',fld:'ALBRLOTE',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A369DisFec',fld:'DISFEC',pic:''},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A337DisArtDsc',fld:'DISARTDSC',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
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
      pr_default.close(17);
      pr_default.close(16);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV13DisFec = GXutil.nullDate() ;
      wcpOAV15CliNom = "" ;
      wcpOAV16DisArtCod = "" ;
      wcpOAV17DisArtDsc = "" ;
      Z396EmprCod = "" ;
      Z595Kilos = DecimalUtil.ZERO ;
      Z631Metros = DecimalUtil.ZERO ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z56AlbRUni = "" ;
      Z55AlbRReo = "" ;
      Z45AlbRef = "" ;
      Z6463AlbRLote = "" ;
      O631Metros = DecimalUtil.ZERO ;
      O60AlbRUniUti = DecimalUtil.ZERO ;
      O392DisUniMed = "" ;
      O595Kilos = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV19UsurCod = "" ;
      AV20Station = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      AV13DisFec = GXutil.nullDate() ;
      AV15CliNom = "" ;
      AV16DisArtCod = "" ;
      AV17DisArtDsc = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A56AlbRUni = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      A392DisUniMed = "" ;
      TempTags = "" ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV21Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A55AlbRReo = "" ;
      A45AlbRef = "" ;
      A6463AlbRLote = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A369DisFec = GXutil.nullDate() ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A279CliNom = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Dvpanel_unnamedtable3_Objectcall = "" ;
      Dvpanel_unnamedtable3_Class = "" ;
      Dvpanel_unnamedtable3_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode35 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXt_char1 = "" ;
      AV22Emprnom = "" ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      Z369DisFec = GXutil.nullDate() ;
      Z392DisUniMed = "" ;
      Z335DisArtCod = "" ;
      Z337DisArtDsc = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z279CliNom = "" ;
      T01U56_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01U56_A392DisUniMed = new String[] {""} ;
      T01U56_A335DisArtCod = new String[] {""} ;
      T01U56_A337DisArtDsc = new String[] {""} ;
      T01U55_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U55_A54AlbRPieUti = new int[1] ;
      T01U55_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U55_A52AlbRPieEnt = new int[1] ;
      T01U55_A56AlbRUni = new String[] {""} ;
      T01U55_A47AlbREst = new byte[1] ;
      T01U55_A55AlbRReo = new String[] {""} ;
      T01U55_A45AlbRef = new String[] {""} ;
      T01U55_A4920AlbRGrm2 = new short[1] ;
      T01U55_A4921AlbRAnc = new short[1] ;
      T01U55_A6463AlbRLote = new String[] {""} ;
      T01U55_A252CliCod = new int[1] ;
      T01U57_A279CliNom = new String[] {""} ;
      T01U58_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U58_A54AlbRPieUti = new int[1] ;
      T01U58_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01U58_A392DisUniMed = new String[] {""} ;
      T01U58_A279CliNom = new String[] {""} ;
      T01U58_A335DisArtCod = new String[] {""} ;
      T01U58_A337DisArtDsc = new String[] {""} ;
      T01U58_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U58_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U58_A673Piezas = new int[1] ;
      T01U58_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U58_A52AlbRPieEnt = new int[1] ;
      T01U58_A56AlbRUni = new String[] {""} ;
      T01U58_A47AlbREst = new byte[1] ;
      T01U58_A55AlbRReo = new String[] {""} ;
      T01U58_A45AlbRef = new String[] {""} ;
      T01U58_A4920AlbRGrm2 = new short[1] ;
      T01U58_A4921AlbRAnc = new short[1] ;
      T01U58_A6463AlbRLote = new String[] {""} ;
      T01U58_A396EmprCod = new String[] {""} ;
      T01U58_A44AlbRecCod = new int[1] ;
      T01U58_A361DisCod = new int[1] ;
      T01U58_A252CliCod = new int[1] ;
      T01U59_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01U59_A392DisUniMed = new String[] {""} ;
      T01U59_A335DisArtCod = new String[] {""} ;
      T01U59_A337DisArtDsc = new String[] {""} ;
      T01U510_A279CliNom = new String[] {""} ;
      T01U511_A396EmprCod = new String[] {""} ;
      T01U511_A361DisCod = new int[1] ;
      T01U511_A44AlbRecCod = new int[1] ;
      T01U53_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U53_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U53_A673Piezas = new int[1] ;
      T01U53_A396EmprCod = new String[] {""} ;
      T01U53_A44AlbRecCod = new int[1] ;
      T01U53_A361DisCod = new int[1] ;
      T01U512_A396EmprCod = new String[] {""} ;
      T01U512_A44AlbRecCod = new int[1] ;
      T01U512_A361DisCod = new int[1] ;
      T01U513_A396EmprCod = new String[] {""} ;
      T01U513_A44AlbRecCod = new int[1] ;
      T01U513_A361DisCod = new int[1] ;
      T01U52_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U52_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U52_A673Piezas = new int[1] ;
      T01U52_A396EmprCod = new String[] {""} ;
      T01U52_A44AlbRecCod = new int[1] ;
      T01U52_A361DisCod = new int[1] ;
      T01U514_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U514_A54AlbRPieUti = new int[1] ;
      T01U514_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U514_A52AlbRPieEnt = new int[1] ;
      T01U514_A56AlbRUni = new String[] {""} ;
      T01U514_A47AlbREst = new byte[1] ;
      T01U514_A55AlbRReo = new String[] {""} ;
      T01U514_A45AlbRef = new String[] {""} ;
      T01U514_A4920AlbRGrm2 = new short[1] ;
      T01U514_A4921AlbRAnc = new short[1] ;
      T01U514_A6463AlbRLote = new String[] {""} ;
      T01U514_A252CliCod = new int[1] ;
      T01U518_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01U518_A392DisUniMed = new String[] {""} ;
      T01U518_A335DisArtCod = new String[] {""} ;
      T01U518_A337DisArtDsc = new String[] {""} ;
      T01U519_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U519_A54AlbRPieUti = new int[1] ;
      T01U519_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01U519_A52AlbRPieEnt = new int[1] ;
      T01U519_A56AlbRUni = new String[] {""} ;
      T01U519_A47AlbREst = new byte[1] ;
      T01U519_A55AlbRReo = new String[] {""} ;
      T01U519_A45AlbRef = new String[] {""} ;
      T01U519_A4920AlbRGrm2 = new short[1] ;
      T01U519_A4921AlbRAnc = new short[1] ;
      T01U519_A6463AlbRLote = new String[] {""} ;
      T01U519_A252CliCod = new int[1] ;
      T01U520_A279CliNom = new String[] {""} ;
      T01U521_A396EmprCod = new String[] {""} ;
      T01U521_A361DisCod = new int[1] ;
      T01U521_A44AlbRecCod = new int[1] ;
      T01U521_A9756Dis_CUb = new String[] {""} ;
      T01U522_A396EmprCod = new String[] {""} ;
      T01U522_A361DisCod = new int[1] ;
      T01U522_A44AlbRecCod = new int[1] ;
      T01U522_A380DisPieCod = new String[] {""} ;
      T01U524_A396EmprCod = new String[] {""} ;
      T01U524_A361DisCod = new int[1] ;
      T01U524_A44AlbRecCod = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      ZO392DisUniMed = "" ;
      ZO60AlbRUniUti = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb____moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb____vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb____colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb____ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb____default(),
         new Object[] {
             new Object[] {
            T01U52_A595Kilos, T01U52_A631Metros, T01U52_A673Piezas, T01U52_A396EmprCod, T01U52_A44AlbRecCod, T01U52_A361DisCod
            }
            , new Object[] {
            T01U53_A595Kilos, T01U53_A631Metros, T01U53_A673Piezas, T01U53_A396EmprCod, T01U53_A44AlbRecCod, T01U53_A361DisCod
            }
            , new Object[] {
            T01U54_A60AlbRUniUti, T01U54_A54AlbRPieUti, T01U54_A58AlbRUniEnt, T01U54_A52AlbRPieEnt, T01U54_A56AlbRUni, T01U54_A47AlbREst, T01U54_A55AlbRReo, T01U54_A45AlbRef, T01U54_A4920AlbRGrm2, T01U54_A4921AlbRAnc,
            T01U54_A6463AlbRLote, T01U54_A252CliCod
            }
            , new Object[] {
            T01U55_A60AlbRUniUti, T01U55_A54AlbRPieUti, T01U55_A58AlbRUniEnt, T01U55_A52AlbRPieEnt, T01U55_A56AlbRUni, T01U55_A47AlbREst, T01U55_A55AlbRReo, T01U55_A45AlbRef, T01U55_A4920AlbRGrm2, T01U55_A4921AlbRAnc,
            T01U55_A6463AlbRLote, T01U55_A252CliCod
            }
            , new Object[] {
            T01U56_A369DisFec, T01U56_A392DisUniMed, T01U56_A335DisArtCod, T01U56_A337DisArtDsc
            }
            , new Object[] {
            T01U57_A279CliNom
            }
            , new Object[] {
            T01U58_A60AlbRUniUti, T01U58_A54AlbRPieUti, T01U58_A369DisFec, T01U58_A392DisUniMed, T01U58_A279CliNom, T01U58_A335DisArtCod, T01U58_A337DisArtDsc, T01U58_A595Kilos, T01U58_A631Metros, T01U58_A673Piezas,
            T01U58_A58AlbRUniEnt, T01U58_A52AlbRPieEnt, T01U58_A56AlbRUni, T01U58_A47AlbREst, T01U58_A55AlbRReo, T01U58_A45AlbRef, T01U58_A4920AlbRGrm2, T01U58_A4921AlbRAnc, T01U58_A6463AlbRLote, T01U58_A396EmprCod,
            T01U58_A44AlbRecCod, T01U58_A361DisCod, T01U58_A252CliCod
            }
            , new Object[] {
            T01U59_A369DisFec, T01U59_A392DisUniMed, T01U59_A335DisArtCod, T01U59_A337DisArtDsc
            }
            , new Object[] {
            T01U510_A279CliNom
            }
            , new Object[] {
            T01U511_A396EmprCod, T01U511_A361DisCod, T01U511_A44AlbRecCod
            }
            , new Object[] {
            T01U512_A396EmprCod, T01U512_A44AlbRecCod, T01U512_A361DisCod
            }
            , new Object[] {
            T01U513_A396EmprCod, T01U513_A44AlbRecCod, T01U513_A361DisCod
            }
            , new Object[] {
            T01U514_A60AlbRUniUti, T01U514_A54AlbRPieUti, T01U514_A58AlbRUniEnt, T01U514_A52AlbRPieEnt, T01U514_A56AlbRUni, T01U514_A47AlbREst, T01U514_A55AlbRReo, T01U514_A45AlbRef, T01U514_A4920AlbRGrm2, T01U514_A4921AlbRAnc,
            T01U514_A6463AlbRLote, T01U514_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01U518_A369DisFec, T01U518_A392DisUniMed, T01U518_A335DisArtCod, T01U518_A337DisArtDsc
            }
            , new Object[] {
            T01U519_A60AlbRUniUti, T01U519_A54AlbRPieUti, T01U519_A58AlbRUniEnt, T01U519_A52AlbRPieEnt, T01U519_A56AlbRUni, T01U519_A47AlbREst, T01U519_A55AlbRReo, T01U519_A45AlbRef, T01U519_A4920AlbRGrm2, T01U519_A4921AlbRAnc,
            T01U519_A6463AlbRLote, T01U519_A252CliCod
            }
            , new Object[] {
            T01U520_A279CliNom
            }
            , new Object[] {
            T01U521_A396EmprCod, T01U521_A361DisCod, T01U521_A44AlbRecCod, T01U521_A9756Dis_CUb
            }
            , new Object[] {
            T01U522_A396EmprCod, T01U522_A361DisCod, T01U522_A44AlbRecCod, T01U522_A380DisPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01U524_A396EmprCod, T01U524_A361DisCod, T01U524_A44AlbRecCod
            }
         }
      );
      AV21Pgmname = "Pedidos.DisAlb__" ;
   }

   private byte wcpOAV18DisEst ;
   private byte Z47AlbREst ;
   private byte GxWebError ;
   private byte AV18DisEst ;
   private byte nKeyPressed ;
   private byte A47AlbREst ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z4920AlbRGrm2 ;
   private short Z4921AlbRAnc ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4920AlbRGrm2 ;
   private short A4921AlbRAnc ;
   private short RcdFound35 ;
   private short nIsDirty_35 ;
   private int wcpOAV8DisCod ;
   private int wcpOAV9AlbRecCod ;
   private int wcpOAV14CliCod ;
   private int Z361DisCod ;
   private int Z44AlbRecCod ;
   private int Z673Piezas ;
   private int Z52AlbRPieEnt ;
   private int Z252CliCod ;
   private int O673Piezas ;
   private int O54AlbRPieUti ;
   private int A44AlbRecCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int AV8DisCod ;
   private int AV9AlbRecCod ;
   private int AV14CliCod ;
   private int trnEnded ;
   private int edtDisCod_Enabled ;
   private int edtavDisfec_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavDisartcod_Enabled ;
   private int edtavDisartdsc_Enabled ;
   private int edtDisUniMed_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int edtKilos_Enabled ;
   private int edtMetros_Enabled ;
   private int A673Piezas ;
   private int edtPiezas_Enabled ;
   private int A52AlbRPieEnt ;
   private int edtAlbRPieEnt_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int A51AlbRPieDis ;
   private int edtAlbRPieDis_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int A54AlbRPieUti ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int Z54AlbRPieUti ;
   private int idxLst ;
   private int GXv_int6[] ;
   private int ZO54AlbRPieUti ;
   private java.math.BigDecimal Z595Kilos ;
   private java.math.BigDecimal Z631Metros ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal O631Metros ;
   private java.math.BigDecimal O60AlbRUniUti ;
   private java.math.BigDecimal O595Kilos ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal ZO60AlbRUniUti ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV15CliNom ;
   private String wcpOAV16DisArtCod ;
   private String wcpOAV17DisArtDsc ;
   private String Z396EmprCod ;
   private String Z56AlbRUni ;
   private String Z55AlbRReo ;
   private String Z45AlbRef ;
   private String Z6463AlbRLote ;
   private String O392DisUniMed ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV19UsurCod ;
   private String AV20Station ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String AV15CliNom ;
   private String AV16DisArtCod ;
   private String AV17DisArtDsc ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbRecCod_Internalname ;
   private String A56AlbRUni ;
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
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String edtavDisfec_Internalname ;
   private String edtavDisfec_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavDisartcod_Internalname ;
   private String edtavDisartcod_Jsonclick ;
   private String edtavDisartdsc_Internalname ;
   private String edtavDisartdsc_Jsonclick ;
   private String edtDisUniMed_Internalname ;
   private String A392DisUniMed ;
   private String edtDisUniMed_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtKilos_Internalname ;
   private String edtKilos_Jsonclick ;
   private String edtMetros_Internalname ;
   private String edtMetros_Jsonclick ;
   private String edtPiezas_Internalname ;
   private String edtPiezas_Jsonclick ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV21Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String A55AlbRReo ;
   private String A45AlbRef ;
   private String A6463AlbRLote ;
   private String A335DisArtCod ;
   private String A337DisArtDsc ;
   private String A279CliNom ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Dvpanel_unnamedtable3_Objectcall ;
   private String Dvpanel_unnamedtable3_Class ;
   private String Dvpanel_unnamedtable3_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode35 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXt_char1 ;
   private String AV22Emprnom ;
   private String Z392DisUniMed ;
   private String Z335DisArtCod ;
   private String Z337DisArtDsc ;
   private String Z279CliNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZO392DisUniMed ;
   private java.util.Date wcpOAV13DisFec ;
   private java.util.Date AV13DisFec ;
   private java.util.Date A369DisFec ;
   private java.util.Date Z369DisFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Dvpanel_unnamedtable3_Enabled ;
   private boolean Dvpanel_unnamedtable3_Showheader ;
   private boolean Dvpanel_unnamedtable3_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbavDisest ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] T01U56_A369DisFec ;
   private String[] T01U56_A392DisUniMed ;
   private String[] T01U56_A335DisArtCod ;
   private String[] T01U56_A337DisArtDsc ;
   private java.math.BigDecimal[] T01U55_A60AlbRUniUti ;
   private int[] T01U55_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01U55_A58AlbRUniEnt ;
   private int[] T01U55_A52AlbRPieEnt ;
   private String[] T01U55_A56AlbRUni ;
   private byte[] T01U55_A47AlbREst ;
   private String[] T01U55_A55AlbRReo ;
   private String[] T01U55_A45AlbRef ;
   private short[] T01U55_A4920AlbRGrm2 ;
   private short[] T01U55_A4921AlbRAnc ;
   private String[] T01U55_A6463AlbRLote ;
   private int[] T01U55_A252CliCod ;
   private String[] T01U57_A279CliNom ;
   private java.math.BigDecimal[] T01U58_A60AlbRUniUti ;
   private int[] T01U58_A54AlbRPieUti ;
   private java.util.Date[] T01U58_A369DisFec ;
   private String[] T01U58_A392DisUniMed ;
   private String[] T01U58_A279CliNom ;
   private String[] T01U58_A335DisArtCod ;
   private String[] T01U58_A337DisArtDsc ;
   private java.math.BigDecimal[] T01U58_A595Kilos ;
   private java.math.BigDecimal[] T01U58_A631Metros ;
   private int[] T01U58_A673Piezas ;
   private java.math.BigDecimal[] T01U58_A58AlbRUniEnt ;
   private int[] T01U58_A52AlbRPieEnt ;
   private String[] T01U58_A56AlbRUni ;
   private byte[] T01U58_A47AlbREst ;
   private String[] T01U58_A55AlbRReo ;
   private String[] T01U58_A45AlbRef ;
   private short[] T01U58_A4920AlbRGrm2 ;
   private short[] T01U58_A4921AlbRAnc ;
   private String[] T01U58_A6463AlbRLote ;
   private String[] T01U58_A396EmprCod ;
   private int[] T01U58_A44AlbRecCod ;
   private int[] T01U58_A361DisCod ;
   private int[] T01U58_A252CliCod ;
   private java.util.Date[] T01U59_A369DisFec ;
   private String[] T01U59_A392DisUniMed ;
   private String[] T01U59_A335DisArtCod ;
   private String[] T01U59_A337DisArtDsc ;
   private String[] T01U510_A279CliNom ;
   private String[] T01U511_A396EmprCod ;
   private int[] T01U511_A361DisCod ;
   private int[] T01U511_A44AlbRecCod ;
   private java.math.BigDecimal[] T01U53_A595Kilos ;
   private java.math.BigDecimal[] T01U53_A631Metros ;
   private int[] T01U53_A673Piezas ;
   private String[] T01U53_A396EmprCod ;
   private int[] T01U53_A44AlbRecCod ;
   private int[] T01U53_A361DisCod ;
   private String[] T01U512_A396EmprCod ;
   private int[] T01U512_A44AlbRecCod ;
   private int[] T01U512_A361DisCod ;
   private String[] T01U513_A396EmprCod ;
   private int[] T01U513_A44AlbRecCod ;
   private int[] T01U513_A361DisCod ;
   private java.math.BigDecimal[] T01U52_A595Kilos ;
   private java.math.BigDecimal[] T01U52_A631Metros ;
   private int[] T01U52_A673Piezas ;
   private String[] T01U52_A396EmprCod ;
   private int[] T01U52_A44AlbRecCod ;
   private int[] T01U52_A361DisCod ;
   private java.math.BigDecimal[] T01U514_A60AlbRUniUti ;
   private int[] T01U514_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01U514_A58AlbRUniEnt ;
   private int[] T01U514_A52AlbRPieEnt ;
   private String[] T01U514_A56AlbRUni ;
   private byte[] T01U514_A47AlbREst ;
   private String[] T01U514_A55AlbRReo ;
   private String[] T01U514_A45AlbRef ;
   private short[] T01U514_A4920AlbRGrm2 ;
   private short[] T01U514_A4921AlbRAnc ;
   private String[] T01U514_A6463AlbRLote ;
   private int[] T01U514_A252CliCod ;
   private java.util.Date[] T01U518_A369DisFec ;
   private String[] T01U518_A392DisUniMed ;
   private String[] T01U518_A335DisArtCod ;
   private String[] T01U518_A337DisArtDsc ;
   private java.math.BigDecimal[] T01U519_A60AlbRUniUti ;
   private int[] T01U519_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01U519_A58AlbRUniEnt ;
   private int[] T01U519_A52AlbRPieEnt ;
   private String[] T01U519_A56AlbRUni ;
   private byte[] T01U519_A47AlbREst ;
   private String[] T01U519_A55AlbRReo ;
   private String[] T01U519_A45AlbRef ;
   private short[] T01U519_A4920AlbRGrm2 ;
   private short[] T01U519_A4921AlbRAnc ;
   private String[] T01U519_A6463AlbRLote ;
   private int[] T01U519_A252CliCod ;
   private String[] T01U520_A279CliNom ;
   private String[] T01U521_A396EmprCod ;
   private int[] T01U521_A361DisCod ;
   private int[] T01U521_A44AlbRecCod ;
   private String[] T01U521_A9756Dis_CUb ;
   private String[] T01U522_A396EmprCod ;
   private int[] T01U522_A361DisCod ;
   private int[] T01U522_A44AlbRecCod ;
   private String[] T01U522_A380DisPieCod ;
   private String[] T01U524_A396EmprCod ;
   private int[] T01U524_A361DisCod ;
   private int[] T01U524_A44AlbRecCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private java.math.BigDecimal[] T01U54_A60AlbRUniUti ;
   private int[] T01U54_A54AlbRPieUti ;
   private java.math.BigDecimal[] T01U54_A58AlbRUniEnt ;
   private int[] T01U54_A52AlbRPieEnt ;
   private String[] T01U54_A56AlbRUni ;
   private byte[] T01U54_A47AlbREst ;
   private String[] T01U54_A55AlbRReo ;
   private String[] T01U54_A45AlbRef ;
   private short[] T01U54_A4920AlbRGrm2 ;
   private short[] T01U54_A4921AlbRAnc ;
   private String[] T01U54_A6463AlbRLote ;
   private int[] T01U54_A252CliCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
}

final  class disalb____moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disalb____vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disalb____colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disalb____ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disalb____default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01U52", "SELECT Kilos, Metros, Piezas, EmprCod, AlbRecCod, DisCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?  FOR UPDATE OF Kilos, Metros, Piezas NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U53", "SELECT Kilos, Metros, Piezas, EmprCod, AlbRecCod, DisCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U54", "SELECT AlbRUniUti, AlbRPieUti, AlbRUniEnt, AlbRPieEnt, AlbRUni, AlbREst, AlbRReo, AlbRef, AlbRGrm2, AlbRAnc, AlbRLote, CliCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRUniUti, AlbRPieUti NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U55", "SELECT AlbRUniUti, AlbRPieUti, AlbRUniEnt, AlbRPieEnt, AlbRUni, AlbREst, AlbRReo, AlbRef, AlbRGrm2, AlbRAnc, AlbRLote, CliCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U56", "SELECT DisFec, DisUniMed, DisArtCod, DisArtDsc FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U57", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U58", "SELECT /*+ FIRST_ROWS(100) */ T3.AlbRUniUti, T3.AlbRPieUti, T2.DisFec, T2.DisUniMed, T4.CliNom, T2.DisArtCod, T2.DisArtDsc, TM1.Kilos, TM1.Metros, TM1.Piezas, T3.AlbRUniEnt, T3.AlbRPieEnt, T3.AlbRUni, T3.AlbREst, T3.AlbRReo, T3.AlbRef, T3.AlbRGrm2, T3.AlbRAnc, T3.AlbRLote, TM1.EmprCod, TM1.AlbRecCod, TM1.DisCod, T3.CliCod FROM (((TXPDISALB TM1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = TM1.EmprCod AND T2.DisCod = TM1.DisCod) INNER JOIN TXPALBREC T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbRecCod = TM1.AlbRecCod) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = T3.CliCod) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod, TM1.AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U59", "SELECT DisFec, DisUniMed, DisArtCod, DisArtDsc FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U510", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U511", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U512", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, DisCod FROM TXPDISALB WHERE ( EmprCod > ? or EmprCod = ? and AlbRecCod > ? or AlbRecCod = ? and EmprCod = ? and DisCod > ?) ORDER BY EmprCod, DisCod, AlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U513", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, DisCod FROM TXPDISALB WHERE ( EmprCod < ? or EmprCod = ? and AlbRecCod < ? or AlbRecCod = ? and EmprCod = ? and DisCod < ?) ORDER BY EmprCod DESC, DisCod DESC, AlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U514", "SELECT AlbRUniUti, AlbRPieUti, AlbRUniEnt, AlbRPieEnt, AlbRUni, AlbREst, AlbRReo, AlbRef, AlbRGrm2, AlbRAnc, AlbRLote, CliCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRUniUti, AlbRPieUti NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01U515", "INSERT INTO TXPDISALB(Kilos, Metros, Piezas, EmprCod, AlbRecCod, DisCod, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK, "TXPDISALB")
         ,new UpdateCursor("T01U516", "UPDATE TXPDISALB SET Kilos=?, Metros=?, Piezas=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDISALB")
         ,new UpdateCursor("T01U517", "DELETE FROM TXPDISALB  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDISALB")
         ,new ForEachCursor("T01U518", "SELECT DisFec, DisUniMed, DisArtCod, DisArtDsc FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U519", "SELECT AlbRUniUti, AlbRPieUti, AlbRUniEnt, AlbRPieEnt, AlbRUni, AlbREst, AlbRReo, AlbRef, AlbRGrm2, AlbRAnc, AlbRLote, CliCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U520", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U521", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod, Dis_CUb FROM TXPUBIOUT WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U522", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod, DisPieCod FROM TXPDISALD WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01U523", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T01U524", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod, AlbRecCod FROM TXPDISALB ORDER BY EmprCod, DisCod, AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 2);
               ((String[]) buf[15])[0] = rslt.getString(16, 16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 20);
               ((String[]) buf[19])[0] = rslt.getString(20, 3);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((int[]) buf[21])[0] = rslt.getInt(22);
               ((int[]) buf[22])[0] = rslt.getInt(23);
               return;
            case 7 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 12 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 16 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               return;
            case 17 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 22 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 14 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 21 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

