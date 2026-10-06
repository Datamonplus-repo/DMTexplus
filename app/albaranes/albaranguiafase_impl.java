package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class albaranguiafase_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action24") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_24_1T2194( Gx_mode, A396EmprCod, A252CliCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel15"+"_"+"GUIFASLIN") == 0 )
      {
         AV12GuiFasLin = (short)(GXutil.lval( httpContext.GetPar( "GuiFasLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12GuiFasLin), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIFASLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12GuiFasLin), "ZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx15asaguifaslin1T2194( AV12GuiFasLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel16"+"_"+"GUIFASLIN") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
         gx16asaguifaslin1T2194( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_28") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_28( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_30") == 0 )
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
         gxload_30( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_31") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_31( A396EmprCod, A30AlbProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_33") == 0 )
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
         gxload_33( A1253EmprGuiRem, A1243GuiRemCli) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
         gxload_29( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_34") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_34( A396EmprCod, A252CliCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_32") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
         gxload_32( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
            AV8AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8AlbProCod), 10, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbProCod), "ZZZZZZZZZ9")));
            AV9BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")));
            AV10BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodReo", GXutil.str( AV10BarCodReo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10BarCodReo), "9")));
            AV11BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodPar", AV11BarCodPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11BarCodPar, ""))));
            AV12GuiFasLin = (short)(GXutil.lval( httpContext.GetPar( "GuiFasLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12GuiFasLin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIFASLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12GuiFasLin), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Guia / Fases", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public albaranguiafase_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public albaranguiafase_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaranguiafase_impl.class ));
   }

   public albaranguiafase_impl( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbEnvFtp = new HTMLChoice();
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
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
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
      ucDvpanel_tablealbaran.setProperty("Width", Dvpanel_tablealbaran_Width);
      ucDvpanel_tablealbaran.setProperty("AutoWidth", Dvpanel_tablealbaran_Autowidth);
      ucDvpanel_tablealbaran.setProperty("AutoHeight", Dvpanel_tablealbaran_Autoheight);
      ucDvpanel_tablealbaran.setProperty("Cls", Dvpanel_tablealbaran_Cls);
      ucDvpanel_tablealbaran.setProperty("Title", Dvpanel_tablealbaran_Title);
      ucDvpanel_tablealbaran.setProperty("Collapsible", Dvpanel_tablealbaran_Collapsible);
      ucDvpanel_tablealbaran.setProperty("Collapsed", Dvpanel_tablealbaran_Collapsed);
      ucDvpanel_tablealbaran.setProperty("ShowCollapseIcon", Dvpanel_tablealbaran_Showcollapseicon);
      ucDvpanel_tablealbaran.setProperty("IconPosition", Dvpanel_tablealbaran_Iconposition);
      ucDvpanel_tablealbaran.setProperty("AutoScroll", Dvpanel_tablealbaran_Autoscroll);
      ucDvpanel_tablealbaran.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablealbaran_Internalname, "DVPANEL_TABLEALBARANContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEALBARANContainer"+"TableAlbaran"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablealbaran_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop25", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTbngruia_Internalname, httpContext.getMessage( "<b>Nº Guia</b>", ""), "", "", lblTbngruia_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Albaranes\\AlbaranGuiaFase.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCod_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaFase.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbEnvFtp.getInternalname(), httpContext.getMessage( "Envio Albaran FTP", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbEnvFtp, cmbAlbEnvFtp.getInternalname(), GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)), 1, cmbAlbEnvFtp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbEnvFtp.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Albaranes\\AlbaranGuiaFase.htm");
      cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiRemCli_Internalname, httpContext.getMessage( "Codigo Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiRemCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiRemCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaFase.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiRemCln_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCln_Internalname, GXutil.rtrim( A1244GuiRemCln), GXutil.rtrim( localUtil.format( A1244GuiRemCln, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCln_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiRemCln_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranGuiaFase.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProfch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbProfch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProfch_Internalname, localUtil.format(A34AlbProfch, "99/99/99"), localUtil.format( A34AlbProfch, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProfch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProfch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaFase.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbProfch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbProfch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Albaranes\\AlbaranGuiaFase.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-8 col-sm-1 CellMarginTop20", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTbos_Internalname, httpContext.getMessage( "<b>O. Servicio</b>", ""), "", "", lblTbos_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Albaranes\\AlbaranGuiaFase.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaFase.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaFase.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranGuiaFase.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-11 CellMarginTop", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablefascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_fascod.setProperty("Caption", Combo_fascod_Caption);
      ucCombo_fascod.setProperty("Cls", Combo_fascod_Cls);
      ucCombo_fascod.setProperty("DataListProc", Combo_fascod_Datalistproc);
      ucCombo_fascod.setProperty("EmptyItem", Combo_fascod_Emptyitem);
      ucCombo_fascod.setProperty("DropDownOptionsTitleSettingsIcons", AV21DDO_TitleSettingsIcons);
      ucCombo_fascod.setProperty("DropDownOptionsData", AV18FasCod_Data);
      ucCombo_fascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fascod_Internalname, "COMBO_FASCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasCod_Internalname, httpContext.getMessage( "Codigo Fase", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "Attribute", "", "", "", "", edtFasCod_Visible, edtFasCod_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranGuiaFase.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasKgm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasKgm_Internalname, httpContext.getMessage( "Quilos", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A1275FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasKgm_Enabled!=0) ? localUtil.format( A1275FasKgm, "ZZZZZ9.99") : localUtil.format( A1275FasKgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasKgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaFase.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGuiFasPKg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiFasPKg_Internalname, httpContext.getMessage( "Preço", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiFasPKg_Internalname, GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiFasPKg_Enabled!=0) ? localUtil.format( A1241GuiFasPKg, "ZZZZZZ9.999") : localUtil.format( A1241GuiFasPKg, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiFasPKg_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiFasPKg_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaFase.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasMtr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasMtr_Internalname, httpContext.getMessage( "Metros", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1276FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasMtr_Enabled!=0) ? localUtil.format( A1276FasMtr, "ZZZZZ9.99") : localUtil.format( A1276FasMtr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasMtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaFase.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGuiFasPMt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiFasPMt_Internalname, httpContext.getMessage( "Preço", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiFasPMt_Internalname, GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiFasPMt_Enabled!=0) ? localUtil.format( A1242GuiFasPMt, "ZZZZZZ9.999") : localUtil.format( A1242GuiFasPMt, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiFasPMt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiFasPMt_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaFase.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\AlbaranGuiaFase.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\AlbaranGuiaFase.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\AlbaranGuiaFase.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV25Pgmname), GXutil.rtrim( localUtil.format( AV25Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranGuiaFase.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_fascod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombofascod_Internalname, GXutil.rtrim( AV20ComboFasCod), GXutil.rtrim( localUtil.format( AV20ComboFasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombofascod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombofascod_Visible, edtavCombofascod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranGuiaFase.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1240GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiFasLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1240GuiFasLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1240GuiFasLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiFasLin_Jsonclick, 0, "Attribute", "", "", "", "", edtGuiFasLin_Visible, edtGuiFasLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaFase.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliCod_Visible, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranGuiaFase.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,112);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranGuiaFase.htm");
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
      e111T22 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV21DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASCOD_DATA"), AV18FasCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z1240GuiFasLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1240GuiFasLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1242GuiFasPMt = localUtil.ctond( httpContext.cgiGet( "Z1242GuiFasPMt")) ;
            Z1241GuiFasPKg = localUtil.ctond( httpContext.cgiGet( "Z1241GuiFasPKg")) ;
            Z1275FasKgm = localUtil.ctond( httpContext.cgiGet( "Z1275FasKgm")) ;
            Z1276FasMtr = localUtil.ctond( httpContext.cgiGet( "Z1276FasMtr")) ;
            Z12193FasUnd = (int)(localUtil.ctol( httpContext.cgiGet( "Z12193FasUnd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12194FasPreUnd = localUtil.ctond( httpContext.cgiGet( "Z12194FasPreUnd")) ;
            Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            Z1248GuiFasULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1248GuiFasULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( "Z1261BarAlbKgmE")) ;
            Z1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( "Z1263BarAlbMtrE")) ;
            A12193FasUnd = (int)(localUtil.ctol( httpContext.cgiGet( "Z12193FasUnd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12194FasPreUnd = localUtil.ctond( httpContext.cgiGet( "Z12194FasPreUnd")) ;
            A1248GuiFasULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1248GuiFasULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( "Z1261BarAlbKgmE")) ;
            A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( "Z1263BarAlbMtrE")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N457FasCod = httpContext.cgiGet( "N457FasCod") ;
            A466FasPreKgm = localUtil.ctond( httpContext.cgiGet( "FASPREKGM")) ;
            n466FasPreKgm = false ;
            A467FasPreMtr = localUtil.ctond( httpContext.cgiGet( "FASPREMTR")) ;
            n467FasPreMtr = false ;
            A1277FasImp = localUtil.ctond( httpContext.cgiGet( "FASIMP")) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8AlbProCod = localUtil.ctol( httpContext.cgiGet( "vALBPROCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            AV9BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV11BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            AV12GuiFasLin = (short)(localUtil.ctol( httpContext.cgiGet( "vGUIFASLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV16Insert_FasCod = httpContext.cgiGet( "vINSERT_FASCOD") ;
            A1248GuiFasULin = (short)(localUtil.ctol( httpContext.cgiGet( "GUIFASULIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( "BARALBKGME")) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( "BARALBMTRE")) ;
            A12193FasUnd = (int)(localUtil.ctol( httpContext.cgiGet( "FASUND"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12194FasPreUnd = localUtil.ctond( httpContext.cgiGet( "FASPREUND")) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A120BarAgrEst = httpContext.cgiGet( "BARAGREST") ;
            A460FasDsc = httpContext.cgiGet( "FASDSC") ;
            A1253EmprGuiRem = httpContext.cgiGet( "EMPRGUIREM") ;
            A7101AlbLic = httpContext.cgiGet( "ALBLIC") ;
            A2242AlbSec = httpContext.cgiGet( "ALBSEC") ;
            Dvpanel_tablealbaran_Objectcall = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Objectcall") ;
            Dvpanel_tablealbaran_Class = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Class") ;
            Dvpanel_tablealbaran_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Enabled")) ;
            Dvpanel_tablealbaran_Width = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Width") ;
            Dvpanel_tablealbaran_Height = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Height") ;
            Dvpanel_tablealbaran_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Autowidth")) ;
            Dvpanel_tablealbaran_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Autoheight")) ;
            Dvpanel_tablealbaran_Cls = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Cls") ;
            Dvpanel_tablealbaran_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Showheader")) ;
            Dvpanel_tablealbaran_Title = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Title") ;
            Dvpanel_tablealbaran_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Collapsible")) ;
            Dvpanel_tablealbaran_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Collapsed")) ;
            Dvpanel_tablealbaran_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Showcollapseicon")) ;
            Dvpanel_tablealbaran_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Iconposition") ;
            Dvpanel_tablealbaran_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Autoscroll")) ;
            Dvpanel_tablealbaran_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Visible")) ;
            Combo_fascod_Objectcall = httpContext.cgiGet( "COMBO_FASCOD_Objectcall") ;
            Combo_fascod_Class = httpContext.cgiGet( "COMBO_FASCOD_Class") ;
            Combo_fascod_Icontype = httpContext.cgiGet( "COMBO_FASCOD_Icontype") ;
            Combo_fascod_Icon = httpContext.cgiGet( "COMBO_FASCOD_Icon") ;
            Combo_fascod_Caption = httpContext.cgiGet( "COMBO_FASCOD_Caption") ;
            Combo_fascod_Tooltip = httpContext.cgiGet( "COMBO_FASCOD_Tooltip") ;
            Combo_fascod_Cls = httpContext.cgiGet( "COMBO_FASCOD_Cls") ;
            Combo_fascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_FASCOD_Selectedvalue_set") ;
            Combo_fascod_Selectedvalue_get = httpContext.cgiGet( "COMBO_FASCOD_Selectedvalue_get") ;
            Combo_fascod_Selectedtext_set = httpContext.cgiGet( "COMBO_FASCOD_Selectedtext_set") ;
            Combo_fascod_Selectedtext_get = httpContext.cgiGet( "COMBO_FASCOD_Selectedtext_get") ;
            Combo_fascod_Gamoauthtoken = httpContext.cgiGet( "COMBO_FASCOD_Gamoauthtoken") ;
            Combo_fascod_Ddointernalname = httpContext.cgiGet( "COMBO_FASCOD_Ddointernalname") ;
            Combo_fascod_Titlecontrolalign = httpContext.cgiGet( "COMBO_FASCOD_Titlecontrolalign") ;
            Combo_fascod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_FASCOD_Dropdownoptionstype") ;
            Combo_fascod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Enabled")) ;
            Combo_fascod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Visible")) ;
            Combo_fascod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_FASCOD_Titlecontrolidtoreplace") ;
            Combo_fascod_Datalisttype = httpContext.cgiGet( "COMBO_FASCOD_Datalisttype") ;
            Combo_fascod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Allowmultipleselection")) ;
            Combo_fascod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_FASCOD_Datalistfixedvalues") ;
            Combo_fascod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Isgriditem")) ;
            Combo_fascod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Hasdescription")) ;
            Combo_fascod_Datalistproc = httpContext.cgiGet( "COMBO_FASCOD_Datalistproc") ;
            Combo_fascod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_FASCOD_Datalistprocparametersprefix") ;
            Combo_fascod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_FASCOD_Remoteservicesparameters") ;
            Combo_fascod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FASCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_fascod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Includeonlyselectedoption")) ;
            Combo_fascod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Includeselectalloption")) ;
            Combo_fascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Emptyitem")) ;
            Combo_fascod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Includeaddnewoption")) ;
            Combo_fascod_Htmltemplate = httpContext.cgiGet( "COMBO_FASCOD_Htmltemplate") ;
            Combo_fascod_Multiplevaluestype = httpContext.cgiGet( "COMBO_FASCOD_Multiplevaluestype") ;
            Combo_fascod_Loadingdata = httpContext.cgiGet( "COMBO_FASCOD_Loadingdata") ;
            Combo_fascod_Noresultsfound = httpContext.cgiGet( "COMBO_FASCOD_Noresultsfound") ;
            Combo_fascod_Emptyitemtext = httpContext.cgiGet( "COMBO_FASCOD_Emptyitemtext") ;
            Combo_fascod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_FASCOD_Onlyselectedvalues") ;
            Combo_fascod_Selectalltext = httpContext.cgiGet( "COMBO_FASCOD_Selectalltext") ;
            Combo_fascod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_FASCOD_Multiplevaluesseparator") ;
            Combo_fascod_Addnewoptiontext = httpContext.cgiGet( "COMBO_FASCOD_Addnewoptiontext") ;
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
            A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            cmbAlbEnvFtp.setValue( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()) );
            A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
            A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
            A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
            A34AlbProfch = localUtil.ctod( httpContext.cgiGet( edtAlbProfch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASKGM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFasKgm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1275FasKgm = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A1275FasKgm", GXutil.ltrimstr( A1275FasKgm, 9, 2));
            }
            else
            {
               A1275FasKgm = localUtil.ctond( httpContext.cgiGet( edtFasKgm_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1275FasKgm", GXutil.ltrimstr( A1275FasKgm, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtGuiFasPKg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtGuiFasPKg_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GUIFASPKG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtGuiFasPKg_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1241GuiFasPKg = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A1241GuiFasPKg", GXutil.ltrimstr( A1241GuiFasPKg, 13, 5));
            }
            else
            {
               A1241GuiFasPKg = localUtil.ctond( httpContext.cgiGet( edtGuiFasPKg_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1241GuiFasPKg", GXutil.ltrimstr( A1241GuiFasPKg, 13, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FASMTR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFasMtr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1276FasMtr = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A1276FasMtr", GXutil.ltrimstr( A1276FasMtr, 9, 2));
            }
            else
            {
               A1276FasMtr = localUtil.ctond( httpContext.cgiGet( edtFasMtr_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1276FasMtr", GXutil.ltrimstr( A1276FasMtr, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtGuiFasPMt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtGuiFasPMt_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GUIFASPMT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtGuiFasPMt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1242GuiFasPMt = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A1242GuiFasPMt", GXutil.ltrimstr( A1242GuiFasPMt, 13, 5));
            }
            else
            {
               A1242GuiFasPMt = localUtil.ctond( httpContext.cgiGet( edtGuiFasPMt_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1242GuiFasPMt", GXutil.ltrimstr( A1242GuiFasPMt, 13, 5));
            }
            AV25Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25Pgmname", AV25Pgmname);
            AV20ComboFasCod = GXutil.upper( httpContext.cgiGet( edtavCombofascod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20ComboFasCod", AV20ComboFasCod);
            A1240GuiFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtGuiFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"AlbaranGuiaFase");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV25Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25Pgmname", AV25Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV25Pgmname, "")));
            forbiddenHiddens.add("FasUnd", localUtil.format( DecimalUtil.doubleToDec(A12193FasUnd), "ZZZZZ9"));
            forbiddenHiddens.add("FasPreUnd", localUtil.format( A12194FasPreUnd, "ZZZZZZ9.99999"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A1240GuiFasLin != Z1240GuiFasLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("albaranes\\albaranguiafase:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A1240GuiFasLin = (short)(GXutil.lval( httpContext.GetPar( "GuiFasLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
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
                  sMode194 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode194 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound194 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1T20( ) ;
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
                        e111T22 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121T22 ();
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
         e121T22 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1T2194( ) ;
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
         disableAttributes1T2194( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofascod_Enabled), 5, 0), true);
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

   public void confirm_1T20( )
   {
      beforeValidate1T2194( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1T2194( ) ;
         }
         else
         {
            checkExtendedTable1T2194( ) ;
            closeExtendedTableCursors1T2194( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1T20( )
   {
   }

   public void e111T22( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV26Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      albaranguiafase_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV27Emprnom ;
      GXv_char4[0] = AV28Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char2, GXv_char3, GXv_char4) ;
      albaranguiafase_impl.this.AV7EmprCod = GXv_char2[0] ;
      albaranguiafase_impl.this.AV27Emprnom = GXv_char3[0] ;
      albaranguiafase_impl.this.AV28Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV27Emprnom", AV27Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV28Usurcod", AV28Usurcod);
      GXv_SdtWWPContext5[0] = AV13WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV13WWPContext = GXv_SdtWWPContext5[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV21DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV21DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      edtFasCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Visible), 5, 0), true);
      AV20ComboFasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20ComboFasCod", AV20ComboFasCod);
      edtavCombofascod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofascod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofascod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOFASCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV14TrnContext.fromxml(AV15WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV14TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV25Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV29GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29GXV1), 8, 0));
         while ( AV29GXV1 <= AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV17TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV29GXV1));
            if ( GXutil.strcmp(AV17TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "FasCod") == 0 )
            {
               AV16Insert_FasCod = AV17TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16Insert_FasCod", AV16Insert_FasCod);
               if ( ! (GXutil.strcmp("", AV16Insert_FasCod)==0) )
               {
                  AV20ComboFasCod = AV16Insert_FasCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV20ComboFasCod", AV20ComboFasCod);
                  Combo_fascod_Selectedvalue_set = AV20ComboFasCod ;
                  ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
                  Combo_fascod_Enabled = false ;
                  ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "Enabled", GXutil.booltostr( Combo_fascod_Enabled));
               }
            }
            AV29GXV1 = (int)(AV29GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29GXV1), 8, 0));
         }
      }
      edtGuiFasLin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasLin_Visible), 5, 0), true);
      edtCliCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), true);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
   }

   public void e121T22( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOADCOMBOFASCOD' Routine */
      returnInSub = false ;
      Combo_fascod_Datalistprocparametersprefix = GXutil.format( " \"ComboName\": \"FasCod\", \"TrnMode\": \"INS\", \"IsDynamicCall\": true, \"EmprCod\": \"\", \"AlbProCod\": 0, \"BarCod\": 0, \"BarCodReo\": 0, \"BarCodPar\": \"\", \"GuiFasLin\": 0, \"Cond_EmprCod\": \"#%1#\", \"Cond_CliCod\": \"#%2#\"", edtEmprCod_Internalname, edtCliCod_Internalname, "", "", "", "", "", "", "") ;
      ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "DataListProcParametersPrefix", Combo_fascod_Datalistprocparametersprefix);
      GXt_char1 = AV23Combo_DataJson ;
      GXv_char4[0] = AV19ComboSelectedValue ;
      GXv_char3[0] = AV22ComboSelectedText ;
      GXv_char2[0] = GXt_char1 ;
      new app.albaranes.albaranguiafaseloaddvcombo(remoteHandle, context).execute( "FasCod", Gx_mode, false, AV7EmprCod, AV8AlbProCod, AV9BarCod, AV10BarCodReo, AV11BarCodPar, AV12GuiFasLin, A396EmprCod, A252CliCod, "", GXv_char4, GXv_char3, GXv_char2) ;
      albaranguiafase_impl.this.AV19ComboSelectedValue = GXv_char4[0] ;
      albaranguiafase_impl.this.AV22ComboSelectedText = GXv_char3[0] ;
      albaranguiafase_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Combo_DataJson = GXt_char1 ;
      Combo_fascod_Selectedvalue_set = AV19ComboSelectedValue ;
      ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
      Combo_fascod_Selectedtext_set = AV22ComboSelectedText ;
      ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedText_set", Combo_fascod_Selectedtext_set);
      AV20ComboFasCod = AV19ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20ComboFasCod", AV20ComboFasCod);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_fascod_Enabled = false ;
         ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "Enabled", GXutil.booltostr( Combo_fascod_Enabled));
      }
   }

   public void zm1T2194( int GX_JID )
   {
      if ( ( GX_JID == 27 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1242GuiFasPMt = T01T23_A1242GuiFasPMt[0] ;
            Z1241GuiFasPKg = T01T23_A1241GuiFasPKg[0] ;
            Z1275FasKgm = T01T23_A1275FasKgm[0] ;
            Z1276FasMtr = T01T23_A1276FasMtr[0] ;
            Z12193FasUnd = T01T23_A12193FasUnd[0] ;
            Z12194FasPreUnd = T01T23_A12194FasPreUnd[0] ;
            Z457FasCod = T01T23_A457FasCod[0] ;
         }
         else
         {
            Z1242GuiFasPMt = A1242GuiFasPMt ;
            Z1241GuiFasPKg = A1241GuiFasPKg ;
            Z1275FasKgm = A1275FasKgm ;
            Z1276FasMtr = A1276FasMtr ;
            Z12193FasUnd = A12193FasUnd ;
            Z12194FasPreUnd = A12194FasPreUnd ;
            Z457FasCod = A457FasCod ;
         }
      }
      if ( ( GX_JID == 32 ) || ( GX_JID == 0 ) )
      {
         Z1248GuiFasULin = T01T29_A1248GuiFasULin[0] ;
         Z1261BarAlbKgmE = T01T29_A1261BarAlbKgmE[0] ;
         Z1263BarAlbMtrE = T01T29_A1263BarAlbMtrE[0] ;
      }
      if ( GX_JID == -27 )
      {
         Z1240GuiFasLin = A1240GuiFasLin ;
         Z1242GuiFasPMt = A1242GuiFasPMt ;
         Z1241GuiFasPKg = A1241GuiFasPKg ;
         Z1275FasKgm = A1275FasKgm ;
         Z1276FasMtr = A1276FasMtr ;
         Z12193FasUnd = A12193FasUnd ;
         Z12194FasPreUnd = A12194FasPreUnd ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z457FasCod = A457FasCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z407EmprNom = A407EmprNom ;
         Z1253EmprGuiRem = A1253EmprGuiRem ;
         Z5805AlbEnvFtp = A5805AlbEnvFtp ;
         Z7101AlbLic = A7101AlbLic ;
         Z34AlbProfch = A34AlbProfch ;
         Z2242AlbSec = A2242AlbSec ;
         Z1243GuiRemCli = A1243GuiRemCli ;
         Z1244GuiRemCln = A1244GuiRemCln ;
         Z120BarAgrEst = A120BarAgrEst ;
         Z252CliCod = A252CliCod ;
         Z1248GuiFasULin = A1248GuiFasULin ;
         Z1261BarAlbKgmE = A1261BarAlbKgmE ;
         Z1263BarAlbMtrE = A1263BarAlbMtrE ;
         Z460FasDsc = A460FasDsc ;
         Z466FasPreKgm = A466FasPreKgm ;
         Z467FasPreMtr = A467FasPreMtr ;
      }
   }

   public void standaloneNotModal( )
   {
      edtGuiFasLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasLin_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      AV25Pgmname = "Albaranes.AlbaranGuiaFase" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Pgmname", AV25Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtGuiFasLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasLin_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
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
      if ( ! (0==AV8AlbProCod) )
      {
         A30AlbProCod = AV8AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      if ( ! (0==AV9BarCod) )
      {
         A129BarCod = AV9BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV10BarCodReo) )
      {
         A132BarCodReo = AV10BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (GXutil.strcmp("", AV11BarCodPar)==0) )
      {
         A130BarCodPar = AV11BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      if ( ! (0==AV12GuiFasLin) )
      {
         A1240GuiFasLin = AV12GuiFasLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV16Insert_FasCod)==0) )
      {
         edtFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      }
      else
      {
         edtFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV16Insert_FasCod)==0) )
      {
         A457FasCod = AV16Insert_FasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      }
      else
      {
         A457FasCod = AV20ComboFasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
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
         /* Using cursor T01T24 */
         pr_default.execute(2, new Object[] {A396EmprCod});
         A407EmprNom = T01T24_A407EmprNom[0] ;
         n407EmprNom = T01T24_n407EmprNom[0] ;
         pr_default.close(2);
         /* Using cursor T01T27 */
         pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         A1253EmprGuiRem = T01T27_A1253EmprGuiRem[0] ;
         A5805AlbEnvFtp = T01T27_A5805AlbEnvFtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A7101AlbLic = T01T27_A7101AlbLic[0] ;
         A34AlbProfch = T01T27_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A2242AlbSec = T01T27_A2242AlbSec[0] ;
         A1243GuiRemCli = T01T27_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         pr_default.close(5);
         /* Using cursor T01T210 */
         pr_default.execute(8, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A1244GuiRemCln = T01T210_A1244GuiRemCln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         pr_default.close(8);
         /* Using cursor T01T25 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A120BarAgrEst = T01T25_A120BarAgrEst[0] ;
         A252CliCod = T01T25_A252CliCod[0] ;
         n252CliCod = T01T25_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(3);
         /* Using cursor T01T29 */
         pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         zm1T2194( 32) ;
         A1248GuiFasULin = T01T29_A1248GuiFasULin[0] ;
         A1261BarAlbKgmE = T01T29_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = T01T29_A1263BarAlbMtrE[0] ;
         pr_default.close(7);
         /* Using cursor T01T26 */
         pr_default.execute(4, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01T26_A460FasDsc[0] ;
         pr_default.close(4);
         /* Using cursor T01T211 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod});
         A466FasPreKgm = T01T211_A466FasPreKgm[0] ;
         n466FasPreKgm = T01T211_n466FasPreKgm[0] ;
         A467FasPreMtr = T01T211_A467FasPreMtr[0] ;
         n467FasPreMtr = T01T211_n467FasPreMtr[0] ;
         pr_default.close(9);
      }
   }

   public void load1T2194( )
   {
      /* Using cursor T01T212 */
      pr_default.execute(10, new Object[] {Short.valueOf(A1240GuiFasLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound194 = (short)(1) ;
         A1253EmprGuiRem = T01T212_A1253EmprGuiRem[0] ;
         A1242GuiFasPMt = T01T212_A1242GuiFasPMt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1242GuiFasPMt", GXutil.ltrimstr( A1242GuiFasPMt, 13, 5));
         A1241GuiFasPKg = T01T212_A1241GuiFasPKg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1241GuiFasPKg", GXutil.ltrimstr( A1241GuiFasPKg, 13, 5));
         A1248GuiFasULin = T01T212_A1248GuiFasULin[0] ;
         A407EmprNom = T01T212_A407EmprNom[0] ;
         n407EmprNom = T01T212_n407EmprNom[0] ;
         A5805AlbEnvFtp = T01T212_A5805AlbEnvFtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A7101AlbLic = T01T212_A7101AlbLic[0] ;
         A1244GuiRemCln = T01T212_A1244GuiRemCln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         A34AlbProfch = T01T212_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A2242AlbSec = T01T212_A2242AlbSec[0] ;
         A1261BarAlbKgmE = T01T212_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = T01T212_A1263BarAlbMtrE[0] ;
         A120BarAgrEst = T01T212_A120BarAgrEst[0] ;
         A460FasDsc = T01T212_A460FasDsc[0] ;
         A466FasPreKgm = T01T212_A466FasPreKgm[0] ;
         n466FasPreKgm = T01T212_n466FasPreKgm[0] ;
         A467FasPreMtr = T01T212_A467FasPreMtr[0] ;
         n467FasPreMtr = T01T212_n467FasPreMtr[0] ;
         A1275FasKgm = T01T212_A1275FasKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1275FasKgm", GXutil.ltrimstr( A1275FasKgm, 9, 2));
         A1276FasMtr = T01T212_A1276FasMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1276FasMtr", GXutil.ltrimstr( A1276FasMtr, 9, 2));
         A12193FasUnd = T01T212_A12193FasUnd[0] ;
         A12194FasPreUnd = T01T212_A12194FasPreUnd[0] ;
         A457FasCod = T01T212_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A1243GuiRemCli = T01T212_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         A252CliCod = T01T212_A252CliCod[0] ;
         n252CliCod = T01T212_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zm1T2194( -27) ;
      }
      pr_default.close(10);
      onLoadActions1T2194( ) ;
   }

   public void onLoadActions1T2194( )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1275FasKgm)==0) && ( Gx_BScreen == 0 ) )
      {
         A1275FasKgm = A1261BarAlbKgmE ;
         httpContext.ajax_rsp_assign_attri("", false, "A1275FasKgm", GXutil.ltrimstr( A1275FasKgm, 9, 2));
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1276FasMtr)==0) && ( Gx_BScreen == 0 ) )
      {
         A1276FasMtr = A1263BarAlbMtrE ;
         httpContext.ajax_rsp_assign_attri("", false, "A1276FasMtr", GXutil.ltrimstr( A1276FasMtr, 9, 2));
      }
      A1277FasImp = (A466FasPreKgm.multiply(A1275FasKgm)).add((A467FasPreMtr.multiply(A1276FasMtr))) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1277FasImp", GXutil.ltrimstr( A1277FasImp, 13, 5));
   }

   public void checkExtendedTable1T2194( )
   {
      nIsDirty_194 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01T24 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01T24_A407EmprNom[0] ;
      n407EmprNom = T01T24_n407EmprNom[0] ;
      pr_default.close(2);
      /* Using cursor T01T26 */
      pr_default.execute(4, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01T26_A460FasDsc[0] ;
      pr_default.close(4);
      /* Using cursor T01T27 */
      pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1253EmprGuiRem = T01T27_A1253EmprGuiRem[0] ;
      A5805AlbEnvFtp = T01T27_A5805AlbEnvFtp[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      A7101AlbLic = T01T27_A7101AlbLic[0] ;
      A34AlbProfch = T01T27_A34AlbProfch[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A2242AlbSec = T01T27_A2242AlbSec[0] ;
      A1243GuiRemCli = T01T27_A1243GuiRemCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      pr_default.close(5);
      /* Using cursor T01T210 */
      pr_default.execute(8, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
      }
      A1244GuiRemCln = T01T210_A1244GuiRemCln[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      pr_default.close(8);
      /* Using cursor T01T25 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A120BarAgrEst = T01T25_A120BarAgrEst[0] ;
      A252CliCod = T01T25_A252CliCod[0] ;
      n252CliCod = T01T25_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(3);
      /* Using cursor T01T211 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) || (GXutil.strcmp("", A457FasCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PREFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A466FasPreKgm = T01T211_A466FasPreKgm[0] ;
      n466FasPreKgm = T01T211_n466FasPreKgm[0] ;
      A467FasPreMtr = T01T211_A467FasPreMtr[0] ;
      n467FasPreMtr = T01T211_n467FasPreMtr[0] ;
      pr_default.close(9);
      /* Using cursor T01T29 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBBAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1248GuiFasULin = T01T29_A1248GuiFasULin[0] ;
      A1261BarAlbKgmE = T01T29_A1261BarAlbKgmE[0] ;
      A1263BarAlbMtrE = T01T29_A1263BarAlbMtrE[0] ;
      pr_default.close(7);
      if ( isIns( )  && true /* After */ )
      {
         GXv_decimal8[0] = A1242GuiFasPMt ;
         GXv_decimal9[0] = A1241GuiFasPKg ;
         new app.ppreciofases(remoteHandle, context).execute( A396EmprCod, A252CliCod, A457FasCod, GXv_decimal8, GXv_decimal9) ;
         albaranguiafase_impl.this.A1242GuiFasPMt = GXv_decimal8[0] ;
         albaranguiafase_impl.this.A1241GuiFasPKg = GXv_decimal9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1242GuiFasPMt", GXutil.ltrimstr( A1242GuiFasPMt, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A1241GuiFasPKg", GXutil.ltrimstr( A1241GuiFasPKg, 13, 5));
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1241GuiFasPKg)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.La fase no tiene precio Kilo", ""), 0, "GUIFASPKG");
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1242GuiFasPMt)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.La fase no tiene precio Metro", ""), 0, "GUIFASPMT");
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1275FasKgm)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_194 = (short)(1) ;
         A1275FasKgm = A1261BarAlbKgmE ;
         httpContext.ajax_rsp_assign_attri("", false, "A1275FasKgm", GXutil.ltrimstr( A1275FasKgm, 9, 2));
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1276FasMtr)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_194 = (short)(1) ;
         A1276FasMtr = A1263BarAlbMtrE ;
         httpContext.ajax_rsp_assign_attri("", false, "A1276FasMtr", GXutil.ltrimstr( A1276FasMtr, 9, 2));
      }
      nIsDirty_194 = (short)(1) ;
      A1277FasImp = (A466FasPreKgm.multiply(A1275FasKgm)).add((A467FasPreMtr.multiply(A1276FasMtr))) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1277FasImp", GXutil.ltrimstr( A1277FasImp, 13, 5));
   }

   public void closeExtendedTableCursors1T2194( )
   {
      pr_default.close(2);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(8);
      pr_default.close(3);
      pr_default.close(9);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_28( String A396EmprCod )
   {
      /* Using cursor T01T213 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01T213_A407EmprNom[0] ;
      n407EmprNom = T01T213_n407EmprNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_30( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T01T214 */
      pr_default.execute(12, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01T214_A460FasDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_31( String A396EmprCod ,
                          long A30AlbProCod )
   {
      /* Using cursor T01T215 */
      pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1253EmprGuiRem = T01T215_A1253EmprGuiRem[0] ;
      A5805AlbEnvFtp = T01T215_A5805AlbEnvFtp[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      A7101AlbLic = T01T215_A7101AlbLic[0] ;
      A34AlbProfch = T01T215_A34AlbProfch[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A2242AlbSec = T01T215_A2242AlbSec[0] ;
      A1243GuiRemCli = T01T215_A1243GuiRemCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1253EmprGuiRem))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5805AlbEnvFtp, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7101AlbLic))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A34AlbProfch, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2242AlbSec))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_33( String A1253EmprGuiRem ,
                          int A1243GuiRemCli )
   {
      /* Using cursor T01T216 */
      pr_default.execute(14, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
      }
      A1244GuiRemCln = T01T216_A1244GuiRemCln[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1244GuiRemCln))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_29( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01T217 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A120BarAgrEst = T01T217_A120BarAgrEst[0] ;
      A252CliCod = T01T217_A252CliCod[0] ;
      n252CliCod = T01T217_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A120BarAgrEst))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_34( String A396EmprCod ,
                          int A252CliCod ,
                          String A457FasCod )
   {
      /* Using cursor T01T218 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) || (GXutil.strcmp("", A457FasCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PREFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A466FasPreKgm = T01T218_A466FasPreKgm[0] ;
      n466FasPreKgm = T01T218_n466FasPreKgm[0] ;
      A467FasPreMtr = T01T218_A467FasPreMtr[0] ;
      n467FasPreMtr = T01T218_n467FasPreMtr[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_32( String A396EmprCod ,
                          long A30AlbProCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01T29 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBBAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1248GuiFasULin = T01T29_A1248GuiFasULin[0] ;
      A1261BarAlbKgmE = T01T29_A1261BarAlbKgmE[0] ;
      A1263BarAlbMtrE = T01T29_A1263BarAlbMtrE[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1248GuiFasULin, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1T2194( )
   {
      /* Using cursor T01T219 */
      pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound194 = (short)(1) ;
      }
      else
      {
         RcdFound194 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01T23 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1T2194( 27) ;
         RcdFound194 = (short)(1) ;
         A1240GuiFasLin = T01T23_A1240GuiFasLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
         A1242GuiFasPMt = T01T23_A1242GuiFasPMt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1242GuiFasPMt", GXutil.ltrimstr( A1242GuiFasPMt, 13, 5));
         A1241GuiFasPKg = T01T23_A1241GuiFasPKg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1241GuiFasPKg", GXutil.ltrimstr( A1241GuiFasPKg, 13, 5));
         A1275FasKgm = T01T23_A1275FasKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1275FasKgm", GXutil.ltrimstr( A1275FasKgm, 9, 2));
         A1276FasMtr = T01T23_A1276FasMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1276FasMtr", GXutil.ltrimstr( A1276FasMtr, 9, 2));
         A12193FasUnd = T01T23_A12193FasUnd[0] ;
         A12194FasPreUnd = T01T23_A12194FasPreUnd[0] ;
         A396EmprCod = T01T23_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01T23_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01T23_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01T23_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A457FasCod = T01T23_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A30AlbProCod = T01T23_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z1240GuiFasLin = A1240GuiFasLin ;
         sMode194 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1T2194( ) ;
         if ( AnyError == 1 )
         {
            RcdFound194 = (short)(0) ;
            initializeNonKey1T2194( ) ;
         }
         Gx_mode = sMode194 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound194 = (short)(0) ;
         initializeNonKey1T2194( ) ;
         sMode194 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode194 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1T2194( ) ;
      if ( RcdFound194 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound194 = (short)(0) ;
      /* Using cursor T01T220 */
      pr_default.execute(18, new Object[] {Short.valueOf(A1240GuiFasLin), Short.valueOf(A1240GuiFasLin), A396EmprCod, A396EmprCod, Short.valueOf(A1240GuiFasLin), Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A1240GuiFasLin), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A1240GuiFasLin), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A1240GuiFasLin), Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( T01T220_A1240GuiFasLin[0] < A1240GuiFasLin ) || ( T01T220_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( GXutil.strcmp(T01T220_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01T220_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T220_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01T220_A129BarCod[0] < A129BarCod ) || ( T01T220_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T220_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T220_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01T220_A132BarCodReo[0] < A132BarCodReo ) || ( T01T220_A132BarCodReo[0] == A132BarCodReo ) && ( T01T220_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T220_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T220_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( GXutil.strcmp(T01T220_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01T220_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01T220_A132BarCodReo[0] == A132BarCodReo ) && ( T01T220_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T220_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T220_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01T220_A30AlbProCod[0] < A30AlbProCod ) ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( T01T220_A1240GuiFasLin[0] > A1240GuiFasLin ) || ( T01T220_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( GXutil.strcmp(T01T220_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01T220_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T220_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01T220_A129BarCod[0] > A129BarCod ) || ( T01T220_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T220_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T220_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01T220_A132BarCodReo[0] > A132BarCodReo ) || ( T01T220_A132BarCodReo[0] == A132BarCodReo ) && ( T01T220_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T220_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T220_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( GXutil.strcmp(T01T220_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01T220_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01T220_A132BarCodReo[0] == A132BarCodReo ) && ( T01T220_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T220_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T220_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01T220_A30AlbProCod[0] > A30AlbProCod ) ) )
         {
            A1240GuiFasLin = T01T220_A1240GuiFasLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
            A396EmprCod = T01T220_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01T220_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01T220_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01T220_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A30AlbProCod = T01T220_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound194 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void move_previous( )
   {
      RcdFound194 = (short)(0) ;
      /* Using cursor T01T221 */
      pr_default.execute(19, new Object[] {Short.valueOf(A1240GuiFasLin), Short.valueOf(A1240GuiFasLin), A396EmprCod, A396EmprCod, Short.valueOf(A1240GuiFasLin), Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A1240GuiFasLin), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A1240GuiFasLin), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A1240GuiFasLin), Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         while ( (pr_default.getStatus(19) != 101) && ( ( T01T221_A1240GuiFasLin[0] > A1240GuiFasLin ) || ( T01T221_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( GXutil.strcmp(T01T221_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01T221_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T221_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01T221_A129BarCod[0] > A129BarCod ) || ( T01T221_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T221_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T221_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01T221_A132BarCodReo[0] > A132BarCodReo ) || ( T01T221_A132BarCodReo[0] == A132BarCodReo ) && ( T01T221_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T221_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T221_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( GXutil.strcmp(T01T221_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01T221_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01T221_A132BarCodReo[0] == A132BarCodReo ) && ( T01T221_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T221_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T221_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01T221_A30AlbProCod[0] > A30AlbProCod ) ) )
         {
            pr_default.readNext(19);
         }
         if ( (pr_default.getStatus(19) != 101) && ( ( T01T221_A1240GuiFasLin[0] < A1240GuiFasLin ) || ( T01T221_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( GXutil.strcmp(T01T221_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01T221_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T221_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01T221_A129BarCod[0] < A129BarCod ) || ( T01T221_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T221_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T221_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01T221_A132BarCodReo[0] < A132BarCodReo ) || ( T01T221_A132BarCodReo[0] == A132BarCodReo ) && ( T01T221_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T221_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T221_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( GXutil.strcmp(T01T221_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01T221_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01T221_A132BarCodReo[0] == A132BarCodReo ) && ( T01T221_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01T221_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T221_A1240GuiFasLin[0] == A1240GuiFasLin ) && ( T01T221_A30AlbProCod[0] < A30AlbProCod ) ) )
         {
            A1240GuiFasLin = T01T221_A1240GuiFasLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
            A396EmprCod = T01T221_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01T221_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01T221_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01T221_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A30AlbProCod = T01T221_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound194 = (short)(1) ;
         }
      }
      pr_default.close(19);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1T2194( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1T2194( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound194 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A1240GuiFasLin != Z1240GuiFasLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A30AlbProCod = Z30AlbProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A1240GuiFasLin = Z1240GuiFasLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1T2194( ) ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A1240GuiFasLin != Z1240GuiFasLin ) )
            {
               /* Insert record */
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1T2194( ) ;
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
                  GX_FocusControl = edtFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1T2194( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A1240GuiFasLin != Z1240GuiFasLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = Z30AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A1240GuiFasLin = Z1240GuiFasLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1T2194( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01T22 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z1242GuiFasPMt, T01T22_A1242GuiFasPMt[0]) != 0 ) || ( DecimalUtil.compareTo(Z1241GuiFasPKg, T01T22_A1241GuiFasPKg[0]) != 0 ) || ( DecimalUtil.compareTo(Z1275FasKgm, T01T22_A1275FasKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z1276FasMtr, T01T22_A1276FasMtr[0]) != 0 ) || ( Z12193FasUnd != T01T22_A12193FasUnd[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12194FasPreUnd, T01T22_A12194FasPreUnd[0]) != 0 ) || ( GXutil.strcmp(Z457FasCod, T01T22_A457FasCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z1242GuiFasPMt, T01T22_A1242GuiFasPMt[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiafase:[seudo value changed for attri]"+"GuiFasPMt");
               GXutil.writeLogRaw("Old: ",Z1242GuiFasPMt);
               GXutil.writeLogRaw("Current: ",T01T22_A1242GuiFasPMt[0]);
            }
            if ( DecimalUtil.compareTo(Z1241GuiFasPKg, T01T22_A1241GuiFasPKg[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiafase:[seudo value changed for attri]"+"GuiFasPKg");
               GXutil.writeLogRaw("Old: ",Z1241GuiFasPKg);
               GXutil.writeLogRaw("Current: ",T01T22_A1241GuiFasPKg[0]);
            }
            if ( DecimalUtil.compareTo(Z1275FasKgm, T01T22_A1275FasKgm[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiafase:[seudo value changed for attri]"+"FasKgm");
               GXutil.writeLogRaw("Old: ",Z1275FasKgm);
               GXutil.writeLogRaw("Current: ",T01T22_A1275FasKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z1276FasMtr, T01T22_A1276FasMtr[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiafase:[seudo value changed for attri]"+"FasMtr");
               GXutil.writeLogRaw("Old: ",Z1276FasMtr);
               GXutil.writeLogRaw("Current: ",T01T22_A1276FasMtr[0]);
            }
            if ( Z12193FasUnd != T01T22_A12193FasUnd[0] )
            {
               GXutil.writeLogln("albaranes.albaranguiafase:[seudo value changed for attri]"+"FasUnd");
               GXutil.writeLogRaw("Old: ",Z12193FasUnd);
               GXutil.writeLogRaw("Current: ",T01T22_A12193FasUnd[0]);
            }
            if ( DecimalUtil.compareTo(Z12194FasPreUnd, T01T22_A12194FasPreUnd[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiafase:[seudo value changed for attri]"+"FasPreUnd");
               GXutil.writeLogRaw("Old: ",Z12194FasPreUnd);
               GXutil.writeLogRaw("Current: ",T01T22_A12194FasPreUnd[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T01T22_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiafase:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T01T22_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01T222 */
      pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(20) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || ( Z1248GuiFasULin != T01T222_A1248GuiFasULin[0] ) || ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T01T222_A1261BarAlbKgmE[0]) != 0 ) || ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T01T222_A1263BarAlbMtrE[0]) != 0 ) )
         {
            if ( Z1248GuiFasULin != T01T222_A1248GuiFasULin[0] )
            {
               GXutil.writeLogln("albaranes.albaranguiafase:[seudo value changed for attri]"+"GuiFasULin");
               GXutil.writeLogRaw("Old: ",Z1248GuiFasULin);
               GXutil.writeLogRaw("Current: ",T01T222_A1248GuiFasULin[0]);
            }
            if ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T01T222_A1261BarAlbKgmE[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiafase:[seudo value changed for attri]"+"BarAlbKgmE");
               GXutil.writeLogRaw("Old: ",Z1261BarAlbKgmE);
               GXutil.writeLogRaw("Current: ",T01T222_A1261BarAlbKgmE[0]);
            }
            if ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T01T222_A1263BarAlbMtrE[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranguiafase:[seudo value changed for attri]"+"BarAlbMtrE");
               GXutil.writeLogRaw("Old: ",Z1263BarAlbMtrE);
               GXutil.writeLogRaw("Current: ",T01T222_A1263BarAlbMtrE[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBBAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1T2194( )
   {
      beforeValidate1T2194( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T2194( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1T2194( 0) ;
         checkOptimisticConcurrency1T2194( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T2194( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1T2194( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T223 */
                  pr_default.execute(21, new Object[] {Short.valueOf(A1240GuiFasLin), A1242GuiFasPMt, A1241GuiFasPKg, A1275FasKgm, A1276FasMtr, Integer.valueOf(A12193FasUnd), A12194FasPreUnd, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A457FasCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
                  if ( (pr_default.getStatus(21) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11T2194( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1T20( ) ;
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
            load1T2194( ) ;
         }
         endLevel1T2194( ) ;
      }
      closeExtendedTableCursors1T2194( ) ;
   }

   public void update1T2194( )
   {
      beforeValidate1T2194( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T2194( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T2194( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T2194( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1T2194( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T224 */
                  pr_default.execute(22, new Object[] {A1242GuiFasPMt, A1241GuiFasPKg, A1275FasKgm, A1276FasMtr, Integer.valueOf(A12193FasUnd), A12194FasPreUnd, A457FasCod, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
                  if ( (pr_default.getStatus(22) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1T2194( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11T2194( ) ;
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
         endLevel1T2194( ) ;
      }
      closeExtendedTableCursors1T2194( ) ;
   }

   public void deferredUpdate1T2194( )
   {
   }

   public void delete( )
   {
      beforeValidate1T2194( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T2194( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1T2194( ) ;
         afterConfirm1T2194( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1T2194( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01T225 */
               pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
               if ( AnyError == 0 )
               {
                  updateTablesN11T2194( ) ;
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
      sMode194 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1T2194( ) ;
      Gx_mode = sMode194 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1T2194( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && true /* After */ )
         {
            GXv_decimal9[0] = A1242GuiFasPMt ;
            GXv_decimal8[0] = A1241GuiFasPKg ;
            new app.ppreciofases(remoteHandle, context).execute( A396EmprCod, A252CliCod, A457FasCod, GXv_decimal9, GXv_decimal8) ;
            albaranguiafase_impl.this.A1242GuiFasPMt = GXv_decimal9[0] ;
            albaranguiafase_impl.this.A1241GuiFasPKg = GXv_decimal8[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1242GuiFasPMt", GXutil.ltrimstr( A1242GuiFasPMt, 13, 5));
            httpContext.ajax_rsp_assign_attri("", false, "A1241GuiFasPKg", GXutil.ltrimstr( A1241GuiFasPKg, 13, 5));
         }
         /* Using cursor T01T226 */
         pr_default.execute(24, new Object[] {A396EmprCod});
         A407EmprNom = T01T226_A407EmprNom[0] ;
         n407EmprNom = T01T226_n407EmprNom[0] ;
         pr_default.close(24);
         /* Using cursor T01T227 */
         pr_default.execute(25, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         A1253EmprGuiRem = T01T227_A1253EmprGuiRem[0] ;
         A5805AlbEnvFtp = T01T227_A5805AlbEnvFtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A7101AlbLic = T01T227_A7101AlbLic[0] ;
         A34AlbProfch = T01T227_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A2242AlbSec = T01T227_A2242AlbSec[0] ;
         A1243GuiRemCli = T01T227_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         pr_default.close(25);
         /* Using cursor T01T228 */
         pr_default.execute(26, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A1244GuiRemCln = T01T228_A1244GuiRemCln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         pr_default.close(26);
         /* Using cursor T01T229 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A120BarAgrEst = T01T229_A120BarAgrEst[0] ;
         A252CliCod = T01T229_A252CliCod[0] ;
         n252CliCod = T01T229_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(27);
         /* Using cursor T01T230 */
         pr_default.execute(28, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Z1248GuiFasULin = T01T230_A1248GuiFasULin[0] ;
         Z1261BarAlbKgmE = T01T230_A1261BarAlbKgmE[0] ;
         Z1263BarAlbMtrE = T01T230_A1263BarAlbMtrE[0] ;
         A1248GuiFasULin = T01T230_A1248GuiFasULin[0] ;
         A1261BarAlbKgmE = T01T230_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = T01T230_A1263BarAlbMtrE[0] ;
         pr_default.close(28);
         /* Using cursor T01T231 */
         pr_default.execute(29, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01T231_A460FasDsc[0] ;
         pr_default.close(29);
         /* Using cursor T01T232 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod});
         A466FasPreKgm = T01T232_A466FasPreKgm[0] ;
         n466FasPreKgm = T01T232_n466FasPreKgm[0] ;
         A467FasPreMtr = T01T232_A467FasPreMtr[0] ;
         n467FasPreMtr = T01T232_n467FasPreMtr[0] ;
         pr_default.close(30);
         A1277FasImp = (A466FasPreKgm.multiply(A1275FasKgm)).add((A467FasPreMtr.multiply(A1276FasMtr))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1277FasImp", GXutil.ltrimstr( A1277FasImp, 13, 5));
      }
   }

   public void updateTablesN11T2194( )
   {
      /* Using cursor T01T233 */
      pr_default.execute(31, new Object[] {Short.valueOf(A1248GuiFasULin), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
   }

   public void endLevel1T2194( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(20);
      if ( AnyError == 0 )
      {
         beforeComplete1T2194( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "albaranes.albaranguiafase");
         if ( AnyError == 0 )
         {
            confirmValues1T20( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "albaranes.albaranguiafase");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1T2194( )
   {
      /* Scan By routine */
      /* Using cursor T01T234 */
      pr_default.execute(32);
      RcdFound194 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound194 = (short)(1) ;
         A396EmprCod = T01T234_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = T01T234_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = T01T234_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01T234_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01T234_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A1240GuiFasLin = T01T234_A1240GuiFasLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1T2194( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound194 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound194 = (short)(1) ;
         A396EmprCod = T01T234_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = T01T234_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = T01T234_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01T234_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01T234_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A1240GuiFasLin = T01T234_A1240GuiFasLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
      }
   }

   public void scanEnd1T2194( )
   {
      pr_default.close(32);
   }

   public void afterConfirm1T2194( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1T2194( )
   {
      /* Before Insert Rules */
      GXt_int10 = A1240GuiFasLin ;
      GXv_int11[0] = GXt_int10 ;
      new app.albaranes.albaranguiafase_proxid(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int11) ;
      albaranguiafase_impl.this.GXt_int10 = GXv_int11[0] ;
      A1240GuiFasLin = GXt_int10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
      A1248GuiFasULin = A1240GuiFasLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
   }

   public void beforeUpdate1T2194( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1T2194( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1T2194( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1T2194( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1T2194( )
   {
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      cmbAlbEnvFtp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbEnvFtp.getEnabled(), 5, 0), true);
      edtGuiRemCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      edtGuiRemCln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCln_Enabled), 5, 0), true);
      edtAlbProfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProfch_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasKgm_Enabled), 5, 0), true);
      edtGuiFasPKg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPKg_Enabled), 5, 0), true);
      edtFasMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasMtr_Enabled), 5, 0), true);
      edtGuiFasPMt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPMt_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombofascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofascod_Enabled), 5, 0), true);
      edtGuiFasLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasLin_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1T2194( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1T20( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.albaranes.albaranguiafase", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV11BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV12GuiFasLin,4,0))}, new String[] {"Gx_mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","GuiFasLin"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"AlbaranGuiaFase");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV25Pgmname, "")));
      forbiddenHiddens.add("FasUnd", localUtil.format( DecimalUtil.doubleToDec(A12193FasUnd), "ZZZZZ9"));
      forbiddenHiddens.add("FasPreUnd", localUtil.format( A12194FasPreUnd, "ZZZZZZ9.99999"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("albaranes\\albaranguiafase:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1240GuiFasLin", GXutil.ltrim( localUtil.ntoc( Z1240GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1242GuiFasPMt", GXutil.ltrim( localUtil.ntoc( Z1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1241GuiFasPKg", GXutil.ltrim( localUtil.ntoc( Z1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1275FasKgm", GXutil.ltrim( localUtil.ntoc( Z1275FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1276FasMtr", GXutil.ltrim( localUtil.ntoc( Z1276FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12193FasUnd", GXutil.ltrim( localUtil.ntoc( Z12193FasUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12194FasPreUnd", GXutil.ltrim( localUtil.ntoc( Z12194FasPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1248GuiFasULin", GXutil.ltrim( localUtil.ntoc( Z1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( Z1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1263BarAlbMtrE", GXutil.ltrim( localUtil.ntoc( Z1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N457FasCod", GXutil.rtrim( A457FasCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV21DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV21DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASCOD_DATA", AV18FasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASCOD_DATA", AV18FasCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREKGM", GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREMTR", GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASIMP", GXutil.ltrim( localUtil.ntoc( A1277FasImp, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV8AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbProCod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV9BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV10BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV11BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGUIFASLIN", GXutil.ltrim( localUtil.ntoc( AV12GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIFASLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12GuiFasLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FASCOD", GXutil.rtrim( AV16Insert_FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIFASULIN", GXutil.ltrim( localUtil.ntoc( A1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBKGME", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBMTRE", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASUND", GXutil.ltrim( localUtil.ntoc( A12193FasUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREUND", GXutil.ltrim( localUtil.ntoc( A12194FasPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGREST", GXutil.rtrim( A120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC", GXutil.rtrim( A460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRGUIREM", GXutil.rtrim( A1253EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBLIC", GXutil.rtrim( A7101AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBSEC", GXutil.rtrim( A2242AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Objectcall", GXutil.rtrim( Dvpanel_tablealbaran_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Enabled", GXutil.booltostr( Dvpanel_tablealbaran_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Width", GXutil.rtrim( Dvpanel_tablealbaran_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Autowidth", GXutil.booltostr( Dvpanel_tablealbaran_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Autoheight", GXutil.booltostr( Dvpanel_tablealbaran_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Cls", GXutil.rtrim( Dvpanel_tablealbaran_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Title", GXutil.rtrim( Dvpanel_tablealbaran_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Collapsible", GXutil.booltostr( Dvpanel_tablealbaran_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Collapsed", GXutil.booltostr( Dvpanel_tablealbaran_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Showcollapseicon", GXutil.booltostr( Dvpanel_tablealbaran_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Iconposition", GXutil.rtrim( Dvpanel_tablealbaran_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Autoscroll", GXutil.booltostr( Dvpanel_tablealbaran_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Objectcall", GXutil.rtrim( Combo_fascod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Cls", GXutil.rtrim( Combo_fascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_set", GXutil.rtrim( Combo_fascod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedtext_set", GXutil.rtrim( Combo_fascod_Selectedtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Enabled", GXutil.booltostr( Combo_fascod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Datalistproc", GXutil.rtrim( Combo_fascod_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Datalistprocparametersprefix", GXutil.rtrim( Combo_fascod_Datalistprocparametersprefix));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Emptyitem", GXutil.booltostr( Combo_fascod_Emptyitem));
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
      return formatLink("app.albaranes.albaranguiafase", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV11BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV12GuiFasLin,4,0))}, new String[] {"Gx_mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","GuiFasLin"})  ;
   }

   public String getPgmname( )
   {
      return "Albaranes.AlbaranGuiaFase" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Guia / Fases", "") ;
   }

   public void initializeNonKey1T2194( )
   {
      A1253EmprGuiRem = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1242GuiFasPMt", GXutil.ltrimstr( A1242GuiFasPMt, 13, 5));
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1241GuiFasPKg", GXutil.ltrimstr( A1241GuiFasPKg, 13, 5));
      A1248GuiFasULin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
      A1277FasImp = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1277FasImp", GXutil.ltrimstr( A1277FasImp, 13, 5));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A5805AlbEnvFtp = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      A7101AlbLic = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
      A1244GuiRemCln = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      A34AlbProfch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A2242AlbSec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
      A120BarAgrEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A1243GuiRemCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A466FasPreKgm = DecimalUtil.ZERO ;
      n466FasPreKgm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A466FasPreKgm", GXutil.ltrimstr( A466FasPreKgm, 13, 5));
      A467FasPreMtr = DecimalUtil.ZERO ;
      n467FasPreMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A467FasPreMtr", GXutil.ltrimstr( A467FasPreMtr, 13, 5));
      A12193FasUnd = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12193FasUnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12193FasUnd), 6, 0));
      A12194FasPreUnd = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12194FasPreUnd", GXutil.ltrimstr( A12194FasPreUnd, 13, 5));
      A1275FasKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1275FasKgm", GXutil.ltrimstr( A1275FasKgm, 9, 2));
      A1276FasMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1276FasMtr", GXutil.ltrimstr( A1276FasMtr, 9, 2));
      Z1242GuiFasPMt = DecimalUtil.ZERO ;
      Z1241GuiFasPKg = DecimalUtil.ZERO ;
      Z1275FasKgm = DecimalUtil.ZERO ;
      Z1276FasMtr = DecimalUtil.ZERO ;
      Z12193FasUnd = 0 ;
      Z12194FasPreUnd = DecimalUtil.ZERO ;
      Z457FasCod = "" ;
      Z1248GuiFasULin = (short)(0) ;
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
   }

   public void initAll1T2194( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A30AlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A1240GuiFasLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
      initializeNonKey1T2194( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211694614", true, true);
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
      httpContext.AddJavascriptSource("albaranes/albaranguiafase.js", "?20268211694614", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTbngruia_Internalname = "TBNGRUIA" ;
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP" );
      edtGuiRemCli_Internalname = "GUIREMCLI" ;
      edtGuiRemCln_Internalname = "GUIREMCLN" ;
      edtAlbProfch_Internalname = "ALBPROFCH" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      lblTbos_Internalname = "TBOS" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTablealbaran_Internalname = "TABLEALBARAN" ;
      Dvpanel_tablealbaran_Internalname = "DVPANEL_TABLEALBARAN" ;
      Combo_fascod_Internalname = "COMBO_FASCOD" ;
      edtFasCod_Internalname = "FASCOD" ;
      divUnnamedtablefascod_Internalname = "UNNAMEDTABLEFASCOD" ;
      edtFasKgm_Internalname = "FASKGM" ;
      edtGuiFasPKg_Internalname = "GUIFASPKG" ;
      edtFasMtr_Internalname = "FASMTR" ;
      edtGuiFasPMt_Internalname = "GUIFASPMT" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombofascod_Internalname = "vCOMBOFASCOD" ;
      divSectionattribute_fascod_Internalname = "SECTIONATTRIBUTE_FASCOD" ;
      edtGuiFasLin_Internalname = "GUIFASLIN" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
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
      Form.setCaption( httpContext.getMessage( "Guia / Fases", "") );
      Combo_fascod_Datalistprocparametersprefix = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtCliCod_Visible = 1 ;
      edtGuiFasLin_Jsonclick = "" ;
      edtGuiFasLin_Enabled = 0 ;
      edtGuiFasLin_Visible = 1 ;
      edtavCombofascod_Jsonclick = "" ;
      edtavCombofascod_Enabled = 0 ;
      edtavCombofascod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtGuiFasPMt_Jsonclick = "" ;
      edtGuiFasPMt_Enabled = 1 ;
      edtFasMtr_Jsonclick = "" ;
      edtFasMtr_Enabled = 1 ;
      edtGuiFasPKg_Jsonclick = "" ;
      edtGuiFasPKg_Enabled = 1 ;
      edtFasKgm_Jsonclick = "" ;
      edtFasKgm_Enabled = 1 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Enabled = 1 ;
      edtFasCod_Visible = 1 ;
      Combo_fascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_fascod_Datalistproc = "Albaranes.AlbaranGuiaFaseLoadDVCombo" ;
      Combo_fascod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_fascod_Caption = "" ;
      Combo_fascod_Enabled = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "Fase", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 0 ;
      edtAlbProfch_Jsonclick = "" ;
      edtAlbProfch_Enabled = 0 ;
      edtGuiRemCln_Jsonclick = "" ;
      edtGuiRemCln_Enabled = 0 ;
      edtGuiRemCli_Jsonclick = "" ;
      edtGuiRemCli_Enabled = 0 ;
      cmbAlbEnvFtp.setJsonclick( "" );
      cmbAlbEnvFtp.setEnabled( 0 );
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Enabled = 0 ;
      Dvpanel_tablealbaran_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Iconposition = "Right" ;
      Dvpanel_tablealbaran_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Title = httpContext.getMessage( "Albarán", "") ;
      Dvpanel_tablealbaran_Cls = "PanelNoHeader" ;
      Dvpanel_tablealbaran_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablealbaran_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Width = "100%" ;
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

   public void gx15asaguifaslin1T2194( short AV12GuiFasLin )
   {
      if ( ! (0==AV12GuiFasLin) )
      {
         A1240GuiFasLin = AV12GuiFasLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1240GuiFasLin, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx16asaguifaslin1T2194( String A396EmprCod ,
                                       long A30AlbProCod ,
                                       int A129BarCod ,
                                       byte A132BarCodReo ,
                                       String A130BarCodPar )
   {
      GXt_int10 = A1240GuiFasLin ;
      GXv_int11[0] = GXt_int10 ;
      new app.albaranes.albaranguiafase_proxid(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int11) ;
      albaranguiafase_impl.this.GXt_int10 = GXv_int11[0] ;
      A1240GuiFasLin = GXt_int10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1240GuiFasLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1240GuiFasLin), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1240GuiFasLin, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_24_1T2194( String Gx_mode ,
                             String A396EmprCod ,
                             int A252CliCod ,
                             String A457FasCod )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_decimal9[0] = A1242GuiFasPMt ;
         GXv_decimal8[0] = A1241GuiFasPKg ;
         new app.ppreciofases(remoteHandle, context).execute( A396EmprCod, A252CliCod, A457FasCod, GXv_decimal9, GXv_decimal8) ;
         A1242GuiFasPMt = GXv_decimal9[0] ;
         A1241GuiFasPKg = GXv_decimal8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1242GuiFasPMt", GXutil.ltrimstr( A1242GuiFasPMt, 13, 5));
         httpContext.ajax_rsp_assign_attri("", false, "A1241GuiFasPKg", GXutil.ltrimstr( A1241GuiFasPKg, 13, 5));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), ".", "")))+"\"") ;
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
      cmbAlbEnvFtp.setName( "ALBENVFTP" );
      cmbAlbEnvFtp.setWebtags( "" );
      cmbAlbEnvFtp.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbAlbEnvFtp.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
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
      n407EmprNom = false ;
      n252CliCod = false ;
      A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValue())) ;
      cmbAlbEnvFtp.setValue( GXutil.str( A5805AlbEnvFtp, 1, 0) );
      /* Using cursor T01T226 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01T226_A407EmprNom[0] ;
      n407EmprNom = T01T226_n407EmprNom[0] ;
      pr_default.close(24);
      /* Using cursor T01T229 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A120BarAgrEst = T01T229_A120BarAgrEst[0] ;
      A252CliCod = T01T229_A252CliCod[0] ;
      n252CliCod = T01T229_n252CliCod[0] ;
      pr_default.close(27);
      /* Using cursor T01T227 */
      pr_default.execute(25, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A1253EmprGuiRem = T01T227_A1253EmprGuiRem[0] ;
      A5805AlbEnvFtp = T01T227_A5805AlbEnvFtp[0] ;
      cmbAlbEnvFtp.setValue( GXutil.str( A5805AlbEnvFtp, 1, 0) );
      A7101AlbLic = T01T227_A7101AlbLic[0] ;
      A34AlbProfch = T01T227_A34AlbProfch[0] ;
      A2242AlbSec = T01T227_A2242AlbSec[0] ;
      A1243GuiRemCli = T01T227_A1243GuiRemCli[0] ;
      pr_default.close(25);
      /* Using cursor T01T228 */
      pr_default.execute(26, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
      }
      A1244GuiRemCln = T01T228_A1244GuiRemCln[0] ;
      pr_default.close(26);
      /* Using cursor T01T230 */
      pr_default.execute(28, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Z1248GuiFasULin = T01T230_A1248GuiFasULin[0] ;
      Z1261BarAlbKgmE = T01T230_A1261BarAlbKgmE[0] ;
      Z1263BarAlbMtrE = T01T230_A1263BarAlbMtrE[0] ;
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBBAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A1248GuiFasULin = T01T230_A1248GuiFasULin[0] ;
      A1261BarAlbKgmE = T01T230_A1261BarAlbKgmE[0] ;
      A1263BarAlbMtrE = T01T230_A1263BarAlbMtrE[0] ;
      pr_default.close(28);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1275FasKgm)==0) && ( Gx_BScreen == 0 ) )
      {
         A1275FasKgm = A1261BarAlbKgmE ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1276FasMtr)==0) && ( Gx_BScreen == 0 ) )
      {
         A1276FasMtr = A1263BarAlbMtrE ;
      }
      dynload_actions( ) ;
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
         cmbAlbEnvFtp.setValue( GXutil.str( A5805AlbEnvFtp, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", GXutil.rtrim( A120BarAgrEst));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", GXutil.rtrim( A1253EmprGuiRem));
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.ltrim( localUtil.ntoc( A5805AlbEnvFtp, (byte)(1), (byte)(0), ".", "")));
      cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", GXutil.rtrim( A7101AlbLic));
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", GXutil.rtrim( A2242AlbSec));
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", GXutil.rtrim( A1244GuiRemCln));
      httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrim( localUtil.ntoc( A1248GuiFasULin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1275FasKgm", GXutil.ltrim( localUtil.ntoc( A1275FasKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1276FasMtr", GXutil.ltrim( localUtil.ntoc( A1276FasMtr, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Fascod( )
   {
      n252CliCod = false ;
      n466FasPreKgm = false ;
      n467FasPreMtr = false ;
      /* Using cursor T01T231 */
      pr_default.execute(29, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A460FasDsc = T01T231_A460FasDsc[0] ;
      pr_default.close(29);
      /* Using cursor T01T232 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod});
      if ( (pr_default.getStatus(30) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) || (GXutil.strcmp("", A457FasCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PREFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A466FasPreKgm = T01T232_A466FasPreKgm[0] ;
      n466FasPreKgm = T01T232_n466FasPreKgm[0] ;
      A467FasPreMtr = T01T232_A467FasPreMtr[0] ;
      n467FasPreMtr = T01T232_n467FasPreMtr[0] ;
      pr_default.close(30);
      if ( isIns( )  && true /* After */ )
      {
         GXv_decimal9[0] = A1242GuiFasPMt ;
         GXv_decimal8[0] = A1241GuiFasPKg ;
         new app.ppreciofases(remoteHandle, context).execute( A396EmprCod, A252CliCod, A457FasCod, GXv_decimal9, GXv_decimal8) ;
         albaranguiafase_impl.this.A1242GuiFasPMt = GXv_decimal9[0] ;
         A1242GuiFasPMt = this.A1242GuiFasPMt ;
         albaranguiafase_impl.this.A1241GuiFasPKg = GXv_decimal8[0] ;
         A1241GuiFasPKg = this.A1241GuiFasPKg ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A466FasPreKgm", GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A467FasPreMtr", GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1242GuiFasPMt", GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1241GuiFasPKg", GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV12GuiFasLin',fld:'vGUIFASLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV10BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV12GuiFasLin',fld:'vGUIFASLIN',pic:'ZZZ9',hsh:true},{av:'AV25Pgmname',fld:'vPGMNAME',pic:''},{av:'A12193FasUnd',fld:'FASUND',pic:'ZZZZZ9'},{av:'A12194FasPreUnd',fld:'FASPREUND',pic:'ZZZZZZ9.99999'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121T22',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A466FasPreKgm',fld:'FASPREKGM',pic:'ZZZZZZ9.999'},{av:'A467FasPreMtr',fld:'FASPREMTR',pic:'ZZZZZZ9.999'},{av:'A1242GuiFasPMt',fld:'GUIFASPMT',pic:'ZZZZZZ9.999'},{av:'A1241GuiFasPKg',fld:'GUIFASPKG',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A466FasPreKgm',fld:'FASPREKGM',pic:'ZZZZZZ9.999'},{av:'A467FasPreMtr',fld:'FASPREMTR',pic:'ZZZZZZ9.999'},{av:'A1242GuiFasPMt',fld:'GUIFASPMT',pic:'ZZZZZZ9.999'},{av:'A1241GuiFasPKg',fld:'GUIFASPKG',pic:'ZZZZZZ9.999'}]}");
      setEventMetadata("VALID_FASKGM","{handler:'valid_Faskgm',iparms:[]");
      setEventMetadata("VALID_FASKGM",",oparms:[]}");
      setEventMetadata("VALID_GUIFASPKG","{handler:'valid_Guifaspkg',iparms:[]");
      setEventMetadata("VALID_GUIFASPKG",",oparms:[]}");
      setEventMetadata("VALID_FASMTR","{handler:'valid_Fasmtr',iparms:[]");
      setEventMetadata("VALID_FASMTR",",oparms:[]}");
      setEventMetadata("VALID_GUIFASPMT","{handler:'valid_Guifaspmt',iparms:[]");
      setEventMetadata("VALID_GUIFASPMT",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOFASCOD","{handler:'validv_Combofascod',iparms:[]");
      setEventMetadata("VALIDV_COMBOFASCOD",",oparms:[]}");
      setEventMetadata("VALID_GUIFASLIN","{handler:'valid_Guifaslin',iparms:[]");
      setEventMetadata("VALID_GUIFASLIN",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1253EmprGuiRem',fld:'EMPRGUIREM',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'cmbAlbEnvFtp'},{av:'A5805AlbEnvFtp',fld:'ALBENVFTP',pic:'9'},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A2242AlbSec',fld:'ALBSEC',pic:'@!'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'A1248GuiFasULin',fld:'GUIFASULIN',pic:'ZZZ9'},{av:'A1275FasKgm',fld:'FASKGM',pic:'ZZZZZ9.99'},{av:'A1276FasMtr',fld:'FASMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1253EmprGuiRem',fld:'EMPRGUIREM',pic:'@!'},{av:'cmbAlbEnvFtp'},{av:'A5805AlbEnvFtp',fld:'ALBENVFTP',pic:'9'},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A2242AlbSec',fld:'ALBSEC',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'A1248GuiFasULin',fld:'GUIFASULIN',pic:'ZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A1275FasKgm',fld:'FASKGM',pic:'ZZZZZ9.99'},{av:'A1276FasMtr',fld:'FASMTR',pic:'ZZZZZ9.99'}]}");
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
      pr_default.close(27);
      pr_default.close(24);
      pr_default.close(29);
      pr_default.close(25);
      pr_default.close(28);
      pr_default.close(26);
      pr_default.close(30);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV11BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z1242GuiFasPMt = DecimalUtil.ZERO ;
      Z1241GuiFasPKg = DecimalUtil.ZERO ;
      Z1275FasKgm = DecimalUtil.ZERO ;
      Z1276FasMtr = DecimalUtil.ZERO ;
      Z12194FasPreUnd = DecimalUtil.ZERO ;
      Z457FasCod = "" ;
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
      N457FasCod = "" ;
      Combo_fascod_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A130BarCodPar = "" ;
      A1253EmprGuiRem = "" ;
      AV7EmprCod = "" ;
      AV11BarCodPar = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tablealbaran = new com.genexus.webpanels.GXUserControl();
      lblTbngruia_Jsonclick = "" ;
      A1244GuiRemCln = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      lblTbos_Jsonclick = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      ucCombo_fascod = new com.genexus.webpanels.GXUserControl();
      AV21DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV18FasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      TempTags = "" ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV25Pgmname = "" ;
      AV20ComboFasCod = "" ;
      A12194FasPreUnd = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      A1277FasImp = DecimalUtil.ZERO ;
      AV16Insert_FasCod = "" ;
      A407EmprNom = "" ;
      A120BarAgrEst = "" ;
      A460FasDsc = "" ;
      A7101AlbLic = "" ;
      A2242AlbSec = "" ;
      Dvpanel_tablealbaran_Objectcall = "" ;
      Dvpanel_tablealbaran_Class = "" ;
      Dvpanel_tablealbaran_Height = "" ;
      Combo_fascod_Objectcall = "" ;
      Combo_fascod_Class = "" ;
      Combo_fascod_Icontype = "" ;
      Combo_fascod_Icon = "" ;
      Combo_fascod_Tooltip = "" ;
      Combo_fascod_Selectedvalue_set = "" ;
      Combo_fascod_Selectedtext_set = "" ;
      Combo_fascod_Selectedtext_get = "" ;
      Combo_fascod_Gamoauthtoken = "" ;
      Combo_fascod_Ddointernalname = "" ;
      Combo_fascod_Titlecontrolalign = "" ;
      Combo_fascod_Dropdownoptionstype = "" ;
      Combo_fascod_Titlecontrolidtoreplace = "" ;
      Combo_fascod_Datalisttype = "" ;
      Combo_fascod_Datalistfixedvalues = "" ;
      Combo_fascod_Remoteservicesparameters = "" ;
      Combo_fascod_Htmltemplate = "" ;
      Combo_fascod_Multiplevaluestype = "" ;
      Combo_fascod_Loadingdata = "" ;
      Combo_fascod_Noresultsfound = "" ;
      Combo_fascod_Emptyitemtext = "" ;
      Combo_fascod_Onlyselectedvalues = "" ;
      Combo_fascod_Selectalltext = "" ;
      Combo_fascod_Multiplevaluesseparator = "" ;
      Combo_fascod_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode194 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV26Station = "" ;
      AV27Emprnom = "" ;
      AV28Usurcod = "" ;
      AV13WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV14TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV15WebSession = httpContext.getWebSession();
      AV17TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV23Combo_DataJson = "" ;
      GXt_char1 = "" ;
      AV19ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      AV22ComboSelectedText = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z407EmprNom = "" ;
      Z1253EmprGuiRem = "" ;
      Z7101AlbLic = "" ;
      Z34AlbProfch = GXutil.nullDate() ;
      Z2242AlbSec = "" ;
      Z1244GuiRemCln = "" ;
      Z120BarAgrEst = "" ;
      Z460FasDsc = "" ;
      Z466FasPreKgm = DecimalUtil.ZERO ;
      Z467FasPreMtr = DecimalUtil.ZERO ;
      T01T24_A407EmprNom = new String[] {""} ;
      T01T24_n407EmprNom = new boolean[] {false} ;
      T01T27_A1253EmprGuiRem = new String[] {""} ;
      T01T27_A5805AlbEnvFtp = new byte[1] ;
      T01T27_A7101AlbLic = new String[] {""} ;
      T01T27_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01T27_A2242AlbSec = new String[] {""} ;
      T01T27_A1243GuiRemCli = new int[1] ;
      T01T210_A1244GuiRemCln = new String[] {""} ;
      T01T25_A120BarAgrEst = new String[] {""} ;
      T01T25_A252CliCod = new int[1] ;
      T01T25_n252CliCod = new boolean[] {false} ;
      T01T29_A1248GuiFasULin = new short[1] ;
      T01T29_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T29_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T26_A460FasDsc = new String[] {""} ;
      T01T211_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T211_n466FasPreKgm = new boolean[] {false} ;
      T01T211_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T211_n467FasPreMtr = new boolean[] {false} ;
      T01T212_A1253EmprGuiRem = new String[] {""} ;
      T01T212_A1240GuiFasLin = new short[1] ;
      T01T212_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T212_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T212_A1248GuiFasULin = new short[1] ;
      T01T212_A407EmprNom = new String[] {""} ;
      T01T212_n407EmprNom = new boolean[] {false} ;
      T01T212_A5805AlbEnvFtp = new byte[1] ;
      T01T212_A7101AlbLic = new String[] {""} ;
      T01T212_A1244GuiRemCln = new String[] {""} ;
      T01T212_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01T212_A2242AlbSec = new String[] {""} ;
      T01T212_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T212_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T212_A120BarAgrEst = new String[] {""} ;
      T01T212_A460FasDsc = new String[] {""} ;
      T01T212_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T212_n466FasPreKgm = new boolean[] {false} ;
      T01T212_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T212_n467FasPreMtr = new boolean[] {false} ;
      T01T212_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T212_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T212_A12193FasUnd = new int[1] ;
      T01T212_A12194FasPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T212_A396EmprCod = new String[] {""} ;
      T01T212_A129BarCod = new int[1] ;
      T01T212_A132BarCodReo = new byte[1] ;
      T01T212_A130BarCodPar = new String[] {""} ;
      T01T212_A457FasCod = new String[] {""} ;
      T01T212_A30AlbProCod = new long[1] ;
      T01T212_A1243GuiRemCli = new int[1] ;
      T01T212_A252CliCod = new int[1] ;
      T01T212_n252CliCod = new boolean[] {false} ;
      T01T213_A407EmprNom = new String[] {""} ;
      T01T213_n407EmprNom = new boolean[] {false} ;
      T01T214_A460FasDsc = new String[] {""} ;
      T01T215_A1253EmprGuiRem = new String[] {""} ;
      T01T215_A5805AlbEnvFtp = new byte[1] ;
      T01T215_A7101AlbLic = new String[] {""} ;
      T01T215_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01T215_A2242AlbSec = new String[] {""} ;
      T01T215_A1243GuiRemCli = new int[1] ;
      T01T216_A1244GuiRemCln = new String[] {""} ;
      T01T217_A120BarAgrEst = new String[] {""} ;
      T01T217_A252CliCod = new int[1] ;
      T01T217_n252CliCod = new boolean[] {false} ;
      T01T218_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T218_n466FasPreKgm = new boolean[] {false} ;
      T01T218_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T218_n467FasPreMtr = new boolean[] {false} ;
      T01T219_A396EmprCod = new String[] {""} ;
      T01T219_A30AlbProCod = new long[1] ;
      T01T219_A129BarCod = new int[1] ;
      T01T219_A132BarCodReo = new byte[1] ;
      T01T219_A130BarCodPar = new String[] {""} ;
      T01T219_A1240GuiFasLin = new short[1] ;
      T01T23_A1240GuiFasLin = new short[1] ;
      T01T23_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T23_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T23_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T23_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T23_A12193FasUnd = new int[1] ;
      T01T23_A12194FasPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T23_A396EmprCod = new String[] {""} ;
      T01T23_A129BarCod = new int[1] ;
      T01T23_A132BarCodReo = new byte[1] ;
      T01T23_A130BarCodPar = new String[] {""} ;
      T01T23_A457FasCod = new String[] {""} ;
      T01T23_A30AlbProCod = new long[1] ;
      T01T220_A1240GuiFasLin = new short[1] ;
      T01T220_A396EmprCod = new String[] {""} ;
      T01T220_A129BarCod = new int[1] ;
      T01T220_A132BarCodReo = new byte[1] ;
      T01T220_A130BarCodPar = new String[] {""} ;
      T01T220_A30AlbProCod = new long[1] ;
      T01T221_A1240GuiFasLin = new short[1] ;
      T01T221_A396EmprCod = new String[] {""} ;
      T01T221_A129BarCod = new int[1] ;
      T01T221_A132BarCodReo = new byte[1] ;
      T01T221_A130BarCodPar = new String[] {""} ;
      T01T221_A30AlbProCod = new long[1] ;
      T01T22_A1240GuiFasLin = new short[1] ;
      T01T22_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T22_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T22_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T22_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T22_A12193FasUnd = new int[1] ;
      T01T22_A12194FasPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T22_A396EmprCod = new String[] {""} ;
      T01T22_A129BarCod = new int[1] ;
      T01T22_A132BarCodReo = new byte[1] ;
      T01T22_A130BarCodPar = new String[] {""} ;
      T01T22_A457FasCod = new String[] {""} ;
      T01T22_A30AlbProCod = new long[1] ;
      T01T222_A1248GuiFasULin = new short[1] ;
      T01T222_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T222_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T226_A407EmprNom = new String[] {""} ;
      T01T226_n407EmprNom = new boolean[] {false} ;
      T01T227_A1253EmprGuiRem = new String[] {""} ;
      T01T227_A5805AlbEnvFtp = new byte[1] ;
      T01T227_A7101AlbLic = new String[] {""} ;
      T01T227_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01T227_A2242AlbSec = new String[] {""} ;
      T01T227_A1243GuiRemCli = new int[1] ;
      T01T228_A1244GuiRemCln = new String[] {""} ;
      T01T229_A120BarAgrEst = new String[] {""} ;
      T01T229_A252CliCod = new int[1] ;
      T01T229_n252CliCod = new boolean[] {false} ;
      T01T230_A1248GuiFasULin = new short[1] ;
      T01T230_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T230_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T231_A460FasDsc = new String[] {""} ;
      T01T232_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T232_n466FasPreKgm = new boolean[] {false} ;
      T01T232_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01T232_n467FasPreMtr = new boolean[] {false} ;
      T01T234_A396EmprCod = new String[] {""} ;
      T01T234_A30AlbProCod = new long[1] ;
      T01T234_A129BarCod = new int[1] ;
      T01T234_A132BarCodReo = new byte[1] ;
      T01T234_A130BarCodPar = new String[] {""} ;
      T01T234_A1240GuiFasLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int11 = new short[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranguiafase__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranguiafase__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranguiafase__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranguiafase__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranguiafase__default(),
         new Object[] {
             new Object[] {
            T01T22_A1240GuiFasLin, T01T22_A1242GuiFasPMt, T01T22_A1241GuiFasPKg, T01T22_A1275FasKgm, T01T22_A1276FasMtr, T01T22_A12193FasUnd, T01T22_A12194FasPreUnd, T01T22_A396EmprCod, T01T22_A129BarCod, T01T22_A132BarCodReo,
            T01T22_A130BarCodPar, T01T22_A457FasCod, T01T22_A30AlbProCod
            }
            , new Object[] {
            T01T23_A1240GuiFasLin, T01T23_A1242GuiFasPMt, T01T23_A1241GuiFasPKg, T01T23_A1275FasKgm, T01T23_A1276FasMtr, T01T23_A12193FasUnd, T01T23_A12194FasPreUnd, T01T23_A396EmprCod, T01T23_A129BarCod, T01T23_A132BarCodReo,
            T01T23_A130BarCodPar, T01T23_A457FasCod, T01T23_A30AlbProCod
            }
            , new Object[] {
            T01T24_A407EmprNom, T01T24_n407EmprNom
            }
            , new Object[] {
            T01T25_A120BarAgrEst, T01T25_A252CliCod, T01T25_n252CliCod
            }
            , new Object[] {
            T01T26_A460FasDsc
            }
            , new Object[] {
            T01T27_A1253EmprGuiRem, T01T27_A5805AlbEnvFtp, T01T27_A7101AlbLic, T01T27_A34AlbProfch, T01T27_A2242AlbSec, T01T27_A1243GuiRemCli
            }
            , new Object[] {
            T01T28_A1248GuiFasULin, T01T28_A1261BarAlbKgmE, T01T28_A1263BarAlbMtrE
            }
            , new Object[] {
            T01T29_A1248GuiFasULin, T01T29_A1261BarAlbKgmE, T01T29_A1263BarAlbMtrE
            }
            , new Object[] {
            T01T210_A1244GuiRemCln
            }
            , new Object[] {
            T01T211_A466FasPreKgm, T01T211_n466FasPreKgm, T01T211_A467FasPreMtr, T01T211_n467FasPreMtr
            }
            , new Object[] {
            T01T212_A1253EmprGuiRem, T01T212_A1240GuiFasLin, T01T212_A1242GuiFasPMt, T01T212_A1241GuiFasPKg, T01T212_A1248GuiFasULin, T01T212_A407EmprNom, T01T212_n407EmprNom, T01T212_A5805AlbEnvFtp, T01T212_A7101AlbLic, T01T212_A1244GuiRemCln,
            T01T212_A34AlbProfch, T01T212_A2242AlbSec, T01T212_A1261BarAlbKgmE, T01T212_A1263BarAlbMtrE, T01T212_A120BarAgrEst, T01T212_A460FasDsc, T01T212_A466FasPreKgm, T01T212_n466FasPreKgm, T01T212_A467FasPreMtr, T01T212_n467FasPreMtr,
            T01T212_A1275FasKgm, T01T212_A1276FasMtr, T01T212_A12193FasUnd, T01T212_A12194FasPreUnd, T01T212_A396EmprCod, T01T212_A129BarCod, T01T212_A132BarCodReo, T01T212_A130BarCodPar, T01T212_A457FasCod, T01T212_A30AlbProCod,
            T01T212_A1243GuiRemCli, T01T212_A252CliCod, T01T212_n252CliCod
            }
            , new Object[] {
            T01T213_A407EmprNom, T01T213_n407EmprNom
            }
            , new Object[] {
            T01T214_A460FasDsc
            }
            , new Object[] {
            T01T215_A1253EmprGuiRem, T01T215_A5805AlbEnvFtp, T01T215_A7101AlbLic, T01T215_A34AlbProfch, T01T215_A2242AlbSec, T01T215_A1243GuiRemCli
            }
            , new Object[] {
            T01T216_A1244GuiRemCln
            }
            , new Object[] {
            T01T217_A120BarAgrEst, T01T217_A252CliCod, T01T217_n252CliCod
            }
            , new Object[] {
            T01T218_A466FasPreKgm, T01T218_n466FasPreKgm, T01T218_A467FasPreMtr, T01T218_n467FasPreMtr
            }
            , new Object[] {
            T01T219_A396EmprCod, T01T219_A30AlbProCod, T01T219_A129BarCod, T01T219_A132BarCodReo, T01T219_A130BarCodPar, T01T219_A1240GuiFasLin
            }
            , new Object[] {
            T01T220_A1240GuiFasLin, T01T220_A396EmprCod, T01T220_A129BarCod, T01T220_A132BarCodReo, T01T220_A130BarCodPar, T01T220_A30AlbProCod
            }
            , new Object[] {
            T01T221_A1240GuiFasLin, T01T221_A396EmprCod, T01T221_A129BarCod, T01T221_A132BarCodReo, T01T221_A130BarCodPar, T01T221_A30AlbProCod
            }
            , new Object[] {
            T01T222_A1248GuiFasULin, T01T222_A1261BarAlbKgmE, T01T222_A1263BarAlbMtrE
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01T226_A407EmprNom, T01T226_n407EmprNom
            }
            , new Object[] {
            T01T227_A1253EmprGuiRem, T01T227_A5805AlbEnvFtp, T01T227_A7101AlbLic, T01T227_A34AlbProfch, T01T227_A2242AlbSec, T01T227_A1243GuiRemCli
            }
            , new Object[] {
            T01T228_A1244GuiRemCln
            }
            , new Object[] {
            T01T229_A120BarAgrEst, T01T229_A252CliCod, T01T229_n252CliCod
            }
            , new Object[] {
            T01T230_A1248GuiFasULin, T01T230_A1261BarAlbKgmE, T01T230_A1263BarAlbMtrE
            }
            , new Object[] {
            T01T231_A460FasDsc
            }
            , new Object[] {
            T01T232_A466FasPreKgm, T01T232_n466FasPreKgm, T01T232_A467FasPreMtr, T01T232_n467FasPreMtr
            }
            , new Object[] {
            }
            , new Object[] {
            T01T234_A396EmprCod, T01T234_A30AlbProCod, T01T234_A129BarCod, T01T234_A132BarCodReo, T01T234_A130BarCodPar, T01T234_A1240GuiFasLin
            }
         }
      );
      AV25Pgmname = "Albaranes.AlbaranGuiaFase" ;
      Z1276FasMtr = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      Z1275FasKgm = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
   }

   private byte wcpOAV10BarCodReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV10BarCodReo ;
   private byte nKeyPressed ;
   private byte A5805AlbEnvFtp ;
   private byte Gx_BScreen ;
   private byte Z5805AlbEnvFtp ;
   private byte gxajaxcallmode ;
   private short wcpOAV12GuiFasLin ;
   private short Z1240GuiFasLin ;
   private short Z1248GuiFasULin ;
   private short AV12GuiFasLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1240GuiFasLin ;
   private short A1248GuiFasULin ;
   private short RcdFound194 ;
   private short nIsDirty_194 ;
   private short GXt_int10 ;
   private short GXv_int11[] ;
   private int wcpOAV9BarCod ;
   private int Z129BarCod ;
   private int Z12193FasUnd ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A1243GuiRemCli ;
   private int AV9BarCod ;
   private int trnEnded ;
   private int edtAlbProCod_Enabled ;
   private int edtGuiRemCli_Enabled ;
   private int edtGuiRemCln_Enabled ;
   private int edtAlbProfch_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtFasCod_Visible ;
   private int edtFasCod_Enabled ;
   private int edtFasKgm_Enabled ;
   private int edtGuiFasPKg_Enabled ;
   private int edtFasMtr_Enabled ;
   private int edtGuiFasPMt_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombofascod_Visible ;
   private int edtavCombofascod_Enabled ;
   private int edtGuiFasLin_Enabled ;
   private int edtGuiFasLin_Visible ;
   private int edtCliCod_Enabled ;
   private int edtCliCod_Visible ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int A12193FasUnd ;
   private int Combo_fascod_Datalistupdateminimumcharacters ;
   private int AV29GXV1 ;
   private int GX_JID ;
   private int Z1243GuiRemCli ;
   private int Z252CliCod ;
   private int idxLst ;
   private long wcpOAV8AlbProCod ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long AV8AlbProCod ;
   private java.math.BigDecimal Z1242GuiFasPMt ;
   private java.math.BigDecimal Z1241GuiFasPKg ;
   private java.math.BigDecimal Z1275FasKgm ;
   private java.math.BigDecimal Z1276FasMtr ;
   private java.math.BigDecimal Z12194FasPreUnd ;
   private java.math.BigDecimal Z1261BarAlbKgmE ;
   private java.math.BigDecimal Z1263BarAlbMtrE ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A12194FasPreUnd ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A1277FasImp ;
   private java.math.BigDecimal Z466FasPreKgm ;
   private java.math.BigDecimal Z467FasPreMtr ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV11BarCodPar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z457FasCod ;
   private String N457FasCod ;
   private String Combo_fascod_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A130BarCodPar ;
   private String A1253EmprGuiRem ;
   private String AV7EmprCod ;
   private String AV11BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtFasCod_Internalname ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tablealbaran_Width ;
   private String Dvpanel_tablealbaran_Cls ;
   private String Dvpanel_tablealbaran_Title ;
   private String Dvpanel_tablealbaran_Iconposition ;
   private String Dvpanel_tablealbaran_Internalname ;
   private String divTablealbaran_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String lblTbngruia_Internalname ;
   private String lblTbngruia_Jsonclick ;
   private String edtAlbProCod_Internalname ;
   private String edtAlbProCod_Jsonclick ;
   private String edtGuiRemCli_Internalname ;
   private String edtGuiRemCli_Jsonclick ;
   private String edtGuiRemCln_Internalname ;
   private String A1244GuiRemCln ;
   private String edtGuiRemCln_Jsonclick ;
   private String edtAlbProfch_Internalname ;
   private String edtAlbProfch_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String lblTbos_Internalname ;
   private String lblTbos_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtablefascod_Internalname ;
   private String Combo_fascod_Caption ;
   private String Combo_fascod_Cls ;
   private String Combo_fascod_Datalistproc ;
   private String Combo_fascod_Internalname ;
   private String TempTags ;
   private String edtFasCod_Jsonclick ;
   private String edtFasKgm_Internalname ;
   private String edtFasKgm_Jsonclick ;
   private String edtGuiFasPKg_Internalname ;
   private String edtGuiFasPKg_Jsonclick ;
   private String edtFasMtr_Internalname ;
   private String edtFasMtr_Jsonclick ;
   private String edtGuiFasPMt_Internalname ;
   private String edtGuiFasPMt_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV25Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_fascod_Internalname ;
   private String edtavCombofascod_Internalname ;
   private String AV20ComboFasCod ;
   private String edtavCombofascod_Jsonclick ;
   private String edtGuiFasLin_Internalname ;
   private String edtGuiFasLin_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String AV16Insert_FasCod ;
   private String A407EmprNom ;
   private String A120BarAgrEst ;
   private String A460FasDsc ;
   private String A7101AlbLic ;
   private String A2242AlbSec ;
   private String Dvpanel_tablealbaran_Objectcall ;
   private String Dvpanel_tablealbaran_Class ;
   private String Dvpanel_tablealbaran_Height ;
   private String Combo_fascod_Objectcall ;
   private String Combo_fascod_Class ;
   private String Combo_fascod_Icontype ;
   private String Combo_fascod_Icon ;
   private String Combo_fascod_Tooltip ;
   private String Combo_fascod_Selectedvalue_set ;
   private String Combo_fascod_Selectedtext_set ;
   private String Combo_fascod_Selectedtext_get ;
   private String Combo_fascod_Gamoauthtoken ;
   private String Combo_fascod_Ddointernalname ;
   private String Combo_fascod_Titlecontrolalign ;
   private String Combo_fascod_Dropdownoptionstype ;
   private String Combo_fascod_Titlecontrolidtoreplace ;
   private String Combo_fascod_Datalisttype ;
   private String Combo_fascod_Datalistfixedvalues ;
   private String Combo_fascod_Datalistprocparametersprefix ;
   private String Combo_fascod_Remoteservicesparameters ;
   private String Combo_fascod_Htmltemplate ;
   private String Combo_fascod_Multiplevaluestype ;
   private String Combo_fascod_Loadingdata ;
   private String Combo_fascod_Noresultsfound ;
   private String Combo_fascod_Emptyitemtext ;
   private String Combo_fascod_Onlyselectedvalues ;
   private String Combo_fascod_Selectalltext ;
   private String Combo_fascod_Multiplevaluesseparator ;
   private String Combo_fascod_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode194 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV26Station ;
   private String AV27Emprnom ;
   private String AV28Usurcod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z1253EmprGuiRem ;
   private String Z7101AlbLic ;
   private String Z2242AlbSec ;
   private String Z1244GuiRemCln ;
   private String Z120BarAgrEst ;
   private String Z460FasDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date Z34AlbProfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tablealbaran_Autowidth ;
   private boolean Dvpanel_tablealbaran_Autoheight ;
   private boolean Dvpanel_tablealbaran_Collapsible ;
   private boolean Dvpanel_tablealbaran_Collapsed ;
   private boolean Dvpanel_tablealbaran_Showcollapseicon ;
   private boolean Dvpanel_tablealbaran_Autoscroll ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_fascod_Emptyitem ;
   private boolean n466FasPreKgm ;
   private boolean n467FasPreMtr ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tablealbaran_Enabled ;
   private boolean Dvpanel_tablealbaran_Showheader ;
   private boolean Dvpanel_tablealbaran_Visible ;
   private boolean Combo_fascod_Enabled ;
   private boolean Combo_fascod_Visible ;
   private boolean Combo_fascod_Allowmultipleselection ;
   private boolean Combo_fascod_Isgriditem ;
   private boolean Combo_fascod_Hasdescription ;
   private boolean Combo_fascod_Includeonlyselectedoption ;
   private boolean Combo_fascod_Includeselectalloption ;
   private boolean Combo_fascod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String AV23Combo_DataJson ;
   private String AV19ComboSelectedValue ;
   private String AV22ComboSelectedText ;
   private com.genexus.webpanels.WebSession AV15WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablealbaran ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_fascod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbEnvFtp ;
   private IDataStoreProvider pr_default ;
   private String[] T01T24_A407EmprNom ;
   private boolean[] T01T24_n407EmprNom ;
   private String[] T01T27_A1253EmprGuiRem ;
   private byte[] T01T27_A5805AlbEnvFtp ;
   private String[] T01T27_A7101AlbLic ;
   private java.util.Date[] T01T27_A34AlbProfch ;
   private String[] T01T27_A2242AlbSec ;
   private int[] T01T27_A1243GuiRemCli ;
   private String[] T01T210_A1244GuiRemCln ;
   private String[] T01T25_A120BarAgrEst ;
   private int[] T01T25_A252CliCod ;
   private boolean[] T01T25_n252CliCod ;
   private short[] T01T29_A1248GuiFasULin ;
   private java.math.BigDecimal[] T01T29_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01T29_A1263BarAlbMtrE ;
   private String[] T01T26_A460FasDsc ;
   private java.math.BigDecimal[] T01T211_A466FasPreKgm ;
   private boolean[] T01T211_n466FasPreKgm ;
   private java.math.BigDecimal[] T01T211_A467FasPreMtr ;
   private boolean[] T01T211_n467FasPreMtr ;
   private String[] T01T212_A1253EmprGuiRem ;
   private short[] T01T212_A1240GuiFasLin ;
   private java.math.BigDecimal[] T01T212_A1242GuiFasPMt ;
   private java.math.BigDecimal[] T01T212_A1241GuiFasPKg ;
   private short[] T01T212_A1248GuiFasULin ;
   private String[] T01T212_A407EmprNom ;
   private boolean[] T01T212_n407EmprNom ;
   private byte[] T01T212_A5805AlbEnvFtp ;
   private String[] T01T212_A7101AlbLic ;
   private String[] T01T212_A1244GuiRemCln ;
   private java.util.Date[] T01T212_A34AlbProfch ;
   private String[] T01T212_A2242AlbSec ;
   private java.math.BigDecimal[] T01T212_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01T212_A1263BarAlbMtrE ;
   private String[] T01T212_A120BarAgrEst ;
   private String[] T01T212_A460FasDsc ;
   private java.math.BigDecimal[] T01T212_A466FasPreKgm ;
   private boolean[] T01T212_n466FasPreKgm ;
   private java.math.BigDecimal[] T01T212_A467FasPreMtr ;
   private boolean[] T01T212_n467FasPreMtr ;
   private java.math.BigDecimal[] T01T212_A1275FasKgm ;
   private java.math.BigDecimal[] T01T212_A1276FasMtr ;
   private int[] T01T212_A12193FasUnd ;
   private java.math.BigDecimal[] T01T212_A12194FasPreUnd ;
   private String[] T01T212_A396EmprCod ;
   private int[] T01T212_A129BarCod ;
   private byte[] T01T212_A132BarCodReo ;
   private String[] T01T212_A130BarCodPar ;
   private String[] T01T212_A457FasCod ;
   private long[] T01T212_A30AlbProCod ;
   private int[] T01T212_A1243GuiRemCli ;
   private int[] T01T212_A252CliCod ;
   private boolean[] T01T212_n252CliCod ;
   private String[] T01T213_A407EmprNom ;
   private boolean[] T01T213_n407EmprNom ;
   private String[] T01T214_A460FasDsc ;
   private String[] T01T215_A1253EmprGuiRem ;
   private byte[] T01T215_A5805AlbEnvFtp ;
   private String[] T01T215_A7101AlbLic ;
   private java.util.Date[] T01T215_A34AlbProfch ;
   private String[] T01T215_A2242AlbSec ;
   private int[] T01T215_A1243GuiRemCli ;
   private String[] T01T216_A1244GuiRemCln ;
   private String[] T01T217_A120BarAgrEst ;
   private int[] T01T217_A252CliCod ;
   private boolean[] T01T217_n252CliCod ;
   private java.math.BigDecimal[] T01T218_A466FasPreKgm ;
   private boolean[] T01T218_n466FasPreKgm ;
   private java.math.BigDecimal[] T01T218_A467FasPreMtr ;
   private boolean[] T01T218_n467FasPreMtr ;
   private String[] T01T219_A396EmprCod ;
   private long[] T01T219_A30AlbProCod ;
   private int[] T01T219_A129BarCod ;
   private byte[] T01T219_A132BarCodReo ;
   private String[] T01T219_A130BarCodPar ;
   private short[] T01T219_A1240GuiFasLin ;
   private short[] T01T23_A1240GuiFasLin ;
   private java.math.BigDecimal[] T01T23_A1242GuiFasPMt ;
   private java.math.BigDecimal[] T01T23_A1241GuiFasPKg ;
   private java.math.BigDecimal[] T01T23_A1275FasKgm ;
   private java.math.BigDecimal[] T01T23_A1276FasMtr ;
   private int[] T01T23_A12193FasUnd ;
   private java.math.BigDecimal[] T01T23_A12194FasPreUnd ;
   private String[] T01T23_A396EmprCod ;
   private int[] T01T23_A129BarCod ;
   private byte[] T01T23_A132BarCodReo ;
   private String[] T01T23_A130BarCodPar ;
   private String[] T01T23_A457FasCod ;
   private long[] T01T23_A30AlbProCod ;
   private short[] T01T220_A1240GuiFasLin ;
   private String[] T01T220_A396EmprCod ;
   private int[] T01T220_A129BarCod ;
   private byte[] T01T220_A132BarCodReo ;
   private String[] T01T220_A130BarCodPar ;
   private long[] T01T220_A30AlbProCod ;
   private short[] T01T221_A1240GuiFasLin ;
   private String[] T01T221_A396EmprCod ;
   private int[] T01T221_A129BarCod ;
   private byte[] T01T221_A132BarCodReo ;
   private String[] T01T221_A130BarCodPar ;
   private long[] T01T221_A30AlbProCod ;
   private short[] T01T22_A1240GuiFasLin ;
   private java.math.BigDecimal[] T01T22_A1242GuiFasPMt ;
   private java.math.BigDecimal[] T01T22_A1241GuiFasPKg ;
   private java.math.BigDecimal[] T01T22_A1275FasKgm ;
   private java.math.BigDecimal[] T01T22_A1276FasMtr ;
   private int[] T01T22_A12193FasUnd ;
   private java.math.BigDecimal[] T01T22_A12194FasPreUnd ;
   private String[] T01T22_A396EmprCod ;
   private int[] T01T22_A129BarCod ;
   private byte[] T01T22_A132BarCodReo ;
   private String[] T01T22_A130BarCodPar ;
   private String[] T01T22_A457FasCod ;
   private long[] T01T22_A30AlbProCod ;
   private short[] T01T222_A1248GuiFasULin ;
   private java.math.BigDecimal[] T01T222_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01T222_A1263BarAlbMtrE ;
   private String[] T01T226_A407EmprNom ;
   private boolean[] T01T226_n407EmprNom ;
   private String[] T01T227_A1253EmprGuiRem ;
   private byte[] T01T227_A5805AlbEnvFtp ;
   private String[] T01T227_A7101AlbLic ;
   private java.util.Date[] T01T227_A34AlbProfch ;
   private String[] T01T227_A2242AlbSec ;
   private int[] T01T227_A1243GuiRemCli ;
   private String[] T01T228_A1244GuiRemCln ;
   private String[] T01T229_A120BarAgrEst ;
   private int[] T01T229_A252CliCod ;
   private boolean[] T01T229_n252CliCod ;
   private short[] T01T230_A1248GuiFasULin ;
   private java.math.BigDecimal[] T01T230_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01T230_A1263BarAlbMtrE ;
   private String[] T01T231_A460FasDsc ;
   private java.math.BigDecimal[] T01T232_A466FasPreKgm ;
   private boolean[] T01T232_n466FasPreKgm ;
   private java.math.BigDecimal[] T01T232_A467FasPreMtr ;
   private boolean[] T01T232_n467FasPreMtr ;
   private String[] T01T234_A396EmprCod ;
   private long[] T01T234_A30AlbProCod ;
   private int[] T01T234_A129BarCod ;
   private byte[] T01T234_A132BarCodReo ;
   private String[] T01T234_A130BarCodPar ;
   private short[] T01T234_A1240GuiFasLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private short[] T01T28_A1248GuiFasULin ;
   private java.math.BigDecimal[] T01T28_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01T28_A1263BarAlbMtrE ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV18FasCod_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV13WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV14TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV17TrnContextAtt ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV21DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class albaranguiafase__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albaranguiafase__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albaranguiafase__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albaranguiafase__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albaranguiafase__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01T22", "SELECT GuiFasLin, GuiFasPMt, GuiFasPKg, FasKgm, FasMtr, FasUnd, FasPreUnd, EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, AlbProCod FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?  FOR UPDATE OF GuiFasPMt, GuiFasPKg, FasKgm, FasMtr, FasUnd, FasPreUnd, FasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T23", "SELECT GuiFasLin, GuiFasPMt, GuiFasPKg, FasKgm, FasMtr, FasUnd, FasPreUnd, EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, AlbProCod FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T24", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T25", "SELECT BarAgrEst, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T26", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T27", "SELECT EmprGuiRem, AlbEnvFtp, AlbLic, AlbProfch, AlbSec, GuiRemCli FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T28", "SELECT GuiFasULin, BarAlbKgmE, BarAlbMtrE FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF GuiFasULin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T29", "SELECT GuiFasULin, BarAlbKgmE, BarAlbMtrE FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T210", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T211", "SELECT FasPreKgm, FasPreMtr FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T212", "SELECT /*+ FIRST_ROWS(100) */ T3.EmprGuiRem AS EmprGuiRem, TM1.GuiFasLin, TM1.GuiFasPMt, TM1.GuiFasPKg, T6.GuiFasULin, T2.EmprNom, T3.AlbEnvFtp, T3.AlbLic, T4.CliNom AS GuiRemCln, T3.AlbProfch, T3.AlbSec, T6.BarAlbKgmE, T6.BarAlbMtrE, T5.BarAgrEst, T7.FasDsc, T8.FasPreKgm, T8.FasPreMtr, TM1.FasKgm, TM1.FasMtr, TM1.FasUnd, TM1.FasPreUnd, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.FasCod, TM1.AlbProCod, T3.GuiRemCli AS GuiRemCli, T5.CliCod FROM (((((((TXPALBFAS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbProCod = TM1.AlbProCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T3.EmprGuiRem AND T4.CliCod = T3.GuiRemCli) INNER JOIN TXPBARCAD T5 ON T5.EmprCod = TM1.EmprCod AND T5.BarCod = TM1.BarCod AND T5.BarCodReo = TM1.BarCodReo AND T5.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPPREFAS T8 ON T8.EmprCod = TM1.EmprCod AND T8.CliCod = T5.CliCod AND T8.FasCod = TM1.FasCod) INNER JOIN TXPALBBAR T6 ON T6.EmprCod = TM1.EmprCod AND T6.AlbProCod = TM1.AlbProCod AND T6.BarCod = TM1.BarCod AND T6.BarCodReo = TM1.BarCodReo AND T6.BarCodPar = TM1.BarCodPar) INNER JOIN TXPFASPRO T7 ON T7.EmprCod = TM1.EmprCod AND T7.FasCod = TM1.FasCod) WHERE TM1.GuiFasLin = ? and TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.GuiFasLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T213", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T214", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T215", "SELECT EmprGuiRem, AlbEnvFtp, AlbLic, AlbProfch, AlbSec, GuiRemCli FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T216", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T217", "SELECT BarAgrEst, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T218", "SELECT FasPreKgm, FasPreMtr FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T219", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T220", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ GuiFasLin, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBFAS WHERE ( GuiFasLin > ? or GuiFasLin = ? and EmprCod > ? or EmprCod = ? and GuiFasLin = ? and BarCod > ? or BarCod = ? and EmprCod = ? and GuiFasLin = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and GuiFasLin = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and GuiFasLin = ? and AlbProCod > ?) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01T221", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ GuiFasLin, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBFAS WHERE ( GuiFasLin < ? or GuiFasLin = ? and EmprCod < ? or EmprCod = ? and GuiFasLin = ? and BarCod < ? or BarCod = ? and EmprCod = ? and GuiFasLin = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and GuiFasLin = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and GuiFasLin = ? and AlbProCod < ?) ORDER BY EmprCod DESC, AlbProCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, GuiFasLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01T222", "SELECT GuiFasULin, BarAlbKgmE, BarAlbMtrE FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF GuiFasULin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01T223", "INSERT INTO TXPALBFAS(GuiFasLin, GuiFasPMt, GuiFasPKg, FasKgm, FasMtr, FasUnd, FasPreUnd, EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, AlbProCod, FasCodF, FasPreDsK, FasPreDsM, F_TipPza, FasFacMaqC, ArtAdiCod, GuiFasPre, GuiFasDto, GuiFasRec, GuiFasCCo, GuiFasPBK, GuiFasPBM, GuiFasPB, GuiFasFecc, GuiFasUsuc, GuiFasHorc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPALBFAS")
         ,new UpdateCursor("T01T224", "UPDATE TXPALBFAS SET GuiFasPMt=?, GuiFasPKg=?, FasKgm=?, FasMtr=?, FasUnd=?, FasPreUnd=?, FasCod=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK, "TXPALBFAS")
         ,new UpdateCursor("T01T225", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK, "TXPALBFAS")
         ,new ForEachCursor("T01T226", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T227", "SELECT EmprGuiRem, AlbEnvFtp, AlbLic, AlbProfch, AlbSec, GuiRemCli FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T228", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T229", "SELECT BarAgrEst, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T230", "SELECT GuiFasULin, BarAlbKgmE, BarAlbMtrE FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T231", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T232", "SELECT FasPreKgm, FasPreMtr FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01T233", "UPDATE TXPALBBAR SET GuiFasULin=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T01T234", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((long[]) buf[12])[0] = rslt.getLong(13);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((long[]) buf[12])[0] = rslt.getLong(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 28);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,5);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               ((int[]) buf[22])[0] = rslt.getInt(20);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,5);
               ((String[]) buf[24])[0] = rslt.getString(22, 3);
               ((int[]) buf[25])[0] = rslt.getInt(23);
               ((byte[]) buf[26])[0] = rslt.getByte(24);
               ((String[]) buf[27])[0] = rslt.getString(25, 1);
               ((String[]) buf[28])[0] = rslt.getString(26, 8);
               ((long[]) buf[29])[0] = rslt.getLong(27);
               ((int[]) buf[30])[0] = rslt.getInt(28);
               ((int[]) buf[31])[0] = rslt.getInt(29);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 16 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 18 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 19 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 20 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 28 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
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
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setString(3, (String)parms[3], 8);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 18 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 3);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 3);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 1);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 3);
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setLong(21, ((Number) parms[20]).longValue());
               return;
            case 19 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 3);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 3);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 1);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 3);
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setLong(21, ((Number) parms[20]).longValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 21 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setString(8, (String)parms[7], 3);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 8);
               stmt.setLong(13, ((Number) parms[12]).longValue());
               return;
            case 22 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setString(8, (String)parms[7], 3);
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
            case 31 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

